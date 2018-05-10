grammar String;

options {
  language = Java;
  output = template;
}

tokens {
  FUN_PRINT  = 'print';
  FUN_EMPTY  = 'empty';
  FUN_LENGTH = 'length';
  TYPE_STRING = 'string';
  TYPE_CHAR   = 'char';
  TYPE_BOOL   = 'bool';
  MAIN       = 'main';
  L_FBR      = '{';
  R_FBR      = '}';
  L_CBR      = '[';
  R_CBR      = ']';
  L_BR       = '(';
  R_BR       = ')';
  COMMA      = ',';
  KW      	 = '"';
  DOT_COMMA  = ';';
  ASSIGN     = '=';
  AND        = 'and';
  FOR		 = 'for';
  NOT        = 'not';
  OR         = 'or';
  IF         = 'if';
  ELSE		 = 'else';
  WHILE		 = 'while';
  DO		 = 'repeat';
  DO_WHILE	 = 'until';
  PLUS       = '+';
  MINUS      = '-';
  MULT       = '*';
  DIV        = '/';
  NULL       = 'null';
}

@header {
    package by.bsuir.yapis.compiller.stringcompiller.grammar;

    import org.antlr.stringtemplate.*;
    import by.bsuir.yapis.compiller.stringcompiller.type.NamesTable;
    import by.bsuir.yapis.compiller.stringcompiller.type.Name;
    import by.bsuir.yapis.compiller.stringcompiller.exceptions.NotDefinedVariable;
}

@lexer::header {
    package by.bsuir.yapis.compiller.stringcompiller.grammar;
}

@members {
    public static NamesTable names = new NamesTable();

    public boolean isDefined(String id) {
        return (names.get(id) != null);
    }
}

fragment
CH : 'a'..'z'|'A'..'Z'|'_';

ID  :	(CH) (CH | '0'..'9')*;
    
LOG_SIGN :	'<'|'>'|'=='|'!=';

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    : '"' (  } : . )* '"';
    
CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\'';
    
fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    //|   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

program :	
 	(list_functions+=function)*
	(MAIN L_BR R_BR L_FBR (list_stat += statement)* R_FBR)
	-> init(stat = {$list_stat}, funcs = {$list_functions})
;

function :
	(val=ID L_BR params? R_BR L_FBR (list_stat += statement)* R_FBR)
	-> funct(v = {$val.text}, list_funcs = {$list_stat}, list_params = {$params.st})
;

statement :	
	(( 
	var_define 	{$st = $var_define.st;}
	| fun_print	{$st = $fun_print.st;}
	| fun_call	{$st = $fun_call.st;}
	| assign 	{$st = $assign.st;}
	) DOT_COMMA)
	| if_stat	{$st = $if_stat.st;}
	| while_stat{$st = $while_stat.st}
	| for_rule	{$st = $for_rule.st}
	| repeat_until {$st = $repeat_until.st}
;

params : 
	t+=ID ids+=ID (COMMA t+=ID ids+=ID)* {
		Iterator<Object> it = $t.iterator();
		for (Object obj : $ids) {
			Object tp = it.next();
			Token id = (Token) obj;
			Name n = new Name(id.getText(), $tp.type, id.getLine());
			names.add(n);
		}
	}
	-> params_template(list_types = {$t}, list_ids = {$ids})
;

for_rule :
	FOR L_BR
	 	(a=var_define)? DOT_COMMA (log_expr)? DOT_COMMA (b=var_define)? R_BR L_FBR
			(value_stat+=body_statement)+ R_FBR
	-> for_template(param={$a.st}, 
	param2={$log_expr.st}, 
	param3={$b.st},
	stat={$value_stat});
	
repeat_until :
	DO 
	L_FBR
		(value_stat+=body_statement)*
	R_FBR 
	DO_WHILE L_BR (log_expr) R_BR DOT_COMMA
	-> repeat_template(
		stat={$value_stat}, 
		expr={$log_expr.st});

body_statement :
	(assign  	{$st = $assign.st;}
	|fun_print	{$st = $fun_print.st;}
	) DOT_COMMA
;

if_stat	:	
	IF L_BR log_expr R_BR L_FBR (stat+=body_statement)+ R_FBR
	(ELSE L_FBR (stat2+=body_statement)+ R_FBR)? 	
	-> if_template(cond={$log_expr.st}, stat={$stat}, stat2={$stat2});

while_stat :
	WHILE L_BR log_expr R_BR L_FBR (stat+=body_statement)+ R_FBR DOT_COMMA? 	
	-> while_template(cond={$log_expr.st}, stat={$stat});

log_expr
@init{
	String result = "";
}:	
(
	(f=sublog_expr {result+=$f.st.toString();}
		(
			(AND {result+="&&";} | OR{result+="||";}) 
				s=sublog_expr {result+=$s.st.toString();}
		)*
	) 
  | (NOT t=sublog_expr 
		{result+="!"+t.stop.toString();}
	)
) 
{$st = new StringTemplate(result);}
;

sublog_expr :
	(left_e=expr) (
		((LOG_SIGN right_e=expr) {
		if ($LOG_SIGN.text.equals("<"))
			$st = new StringTemplate("Operation.compare("+$left_e.st+", "+$right_e.st+", "+"CompareType.LESS)");
		else if ($LOG_SIGN.text.equals(">"))
			$st = new StringTemplate("Operation.compare("+$left_e.st+", "+$right_e.st+", "+"CompareType.GR)");
		else if ($LOG_SIGN.text.equals("=="))
			$st = new StringTemplate("Operation.compare("+$left_e.st+", "+$right_e.st+", "+"CompareType.EQ)");
		else if ($LOG_SIGN.text.equals("!="))
			$st = new StringTemplate("Operation.compare("+$left_e.st+", "+$right_e.st+", "+"CompareType.NOT_EQ)");
		else
			$st = new StringTemplate("Operation.compare("+$left_e.st+", "+$right_e.st+", "+"CompareType.EQ)");
	}) | 
	{$st = $left_e.st;})
;	

expr returns [String type] :	 
	opd+=mult ((op=PLUS|op=MINUS) opd+=mult)*
	{
	if($op != null) {
		if($op.text.equals("+")){
			$st = %plus_template(operands={$opd});
		} else if($op.text.equals("-")){
		    $st = %minus_template(operands={$opd});
		}
	} else $st = %atom_template(operands={$opd});
	}
;

mult :
	opd+=subexpr (op=MULT opd+=subexpr)*
	{if($op!=null){
			if($op.text.equals("*")){
				$st = %mult_template(operands={$opd});
			} 
		} else $st = %atom_template(operands={$opd});
	}
;

var_define 	:   
	t=type ids+=ID 
	(ASSIGN values+=var_value)
	(COMMA ids+=ID (ASSIGN values+=var_value))* {
	
	for (Object obj : $ids) {
		Token id = (Token) obj;
		Name n = new Name(id.getText(), $t.type, id.getLine());
		names.add(n);
    }}
    -> var_define_template(
    type={$type.type}, 
    list_id={$ids}, 
    list_value={$values})
;

assign 	:	
	ID ASSIGN expr{
	if(!isDefined($ID.text)) {
		throw new NotDefinedVariable($ID.text, $ID.line);
	}
	}				
	-> assign_template(id = {$ID}, expr = {$expr.st})
;

type returns [String type] :	  
	  TYPE_STRING {$type="string";} 
	| TYPE_CHAR	  {$type="char";}
	| TYPE_BOOL	  {$type="bool";}
;

var_value :	
	ID	{
	if(!isDefined($ID.text))
		throw new NotDefinedVariable($ID.text, $ID.line);
	 $st = new StringTemplate($ID.text);}
	|string		{$st = $string.st;}
	|fun_char	{$st = $fun_char.st;}
	//|bool		{$st = $bool.st;}
	|NULL		{$st = new StringTemplate($NULL.text);}
;

subexpr :
	( expr_fun 			{$st = $expr_fun.st;}
	| L_BR expr R_BR 	{$st = new StringTemplate("("+$expr.st.toString()+")");}
	| var_value			{$st = $var_value.st;}
	)
;

expr_fun returns [String type]
:	 fun_print		{$st = $fun_print.st;}
   | fun_length		{$st = $fun_length.st;}
   | fun_empty		{$st = $fun_empty.st;}
;	

fun_length returns [String type]
:	
	FUN_LENGTH L_BR var_value R_BR {$type="string";}	
	-> 	fun_length_template(f={$var_value.st})
;

fun_print returns [String type] :	
	FUN_PRINT L_BR expr R_BR {$type="void";}
	-> fun_print_template(e = {$expr.st})
;

fun_call :	
	name_function=ID L_BR (expr)? R_BR
	-> fun_call_template(id = {$name_function.text}, e = {$expr.st})
;

fun_empty returns [String type] :	
	FUN_EMPTY L_BR var_value R_BR {$type="bool";}
	-> fun_empty_template(e = {$var_value.st})
;

string :	
	f=STRING
	->	string_template(f={$f.text})
;

fun_char :
	f=CHAR
	->	char_template(f={$f.text})
;

bool :
	f=ID
	->	bool_template(f={$f.text})
;