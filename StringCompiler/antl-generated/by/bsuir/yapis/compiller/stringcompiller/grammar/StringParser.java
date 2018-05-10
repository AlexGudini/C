

package by.bsuir.yapis.compiller.stringcompiller.grammar;
import org.antlr.stringtemplate.*;
import by.bsuir.yapis.compiller.stringcompiller.type.NamesTable;
import by.bsuir.yapis.compiller.stringcompiller.type.Name;
import by.bsuir.yapis.compiller.stringcompiller.exceptions.NotDefinedVariable;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class StringParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "CH", "CHAR", 
		"COMMA", "COMMENT", "DIV", "DO", "DOT_COMMA", "DO_WHILE", "ELSE", "ESC_SEQ", 
		"FOR", "FUN_EMPTY", "FUN_LENGTH", "FUN_PRINT", "HEX_DIGIT", "ID", "IF", 
		"KW", "LOG_SIGN", "L_BR", "L_CBR", "L_FBR", "MAIN", "MINUS", "MULT", "NOT", 
		"NULL", "OCTAL_ESC", "OR", "PLUS", "R_BR", "R_CBR", "R_FBR", "STRING", 
		"TYPE_BOOL", "TYPE_CHAR", "TYPE_STRING", "UNICODE_ESC", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int CH=6;
	public static final int CHAR=7;
	public static final int COMMA=8;
	public static final int COMMENT=9;
	public static final int DIV=10;
	public static final int DO=11;
	public static final int DOT_COMMA=12;
	public static final int DO_WHILE=13;
	public static final int ELSE=14;
	public static final int ESC_SEQ=15;
	public static final int FOR=16;
	public static final int FUN_EMPTY=17;
	public static final int FUN_LENGTH=18;
	public static final int FUN_PRINT=19;
	public static final int HEX_DIGIT=20;
	public static final int ID=21;
	public static final int IF=22;
	public static final int KW=23;
	public static final int LOG_SIGN=24;
	public static final int L_BR=25;
	public static final int L_CBR=26;
	public static final int L_FBR=27;
	public static final int MAIN=28;
	public static final int MINUS=29;
	public static final int MULT=30;
	public static final int NOT=31;
	public static final int NULL=32;
	public static final int OCTAL_ESC=33;
	public static final int OR=34;
	public static final int PLUS=35;
	public static final int R_BR=36;
	public static final int R_CBR=37;
	public static final int R_FBR=38;
	public static final int STRING=39;
	public static final int TYPE_BOOL=40;
	public static final int TYPE_CHAR=41;
	public static final int TYPE_STRING=42;
	public static final int UNICODE_ESC=43;
	public static final int WHILE=44;
	public static final int WS=45;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public StringParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public StringParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("StringParserTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return StringParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\1\\Desktop\\String.g"; }


	public static NamesTable names = new NamesTable();
		
	public boolean isDefined(String id) {
		return (names.get(id) != null);
	}


	public static class program_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	public final StringParser.program_return program() throws RecognitionException {
		StringParser.program_return retval = new StringParser.program_return();
		retval.start = input.LT(1);

		List<Object> list_list_functions=null;
		List<Object> list_list_stat=null;
		RuleReturnScope list_functions = null;
		RuleReturnScope list_stat = null;
		try {

			{

			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					{
					pushFollow(FOLLOW_function_in_program910);
					list_functions=function();
					state._fsp--;

					if (list_list_functions==null) list_list_functions=new ArrayList<Object>();
					list_list_functions.add(list_functions.getTemplate());
					}
					break;

				default :
					break loop1;
				}
			}

			{
			match(input,MAIN,FOLLOW_MAIN_in_program916); 
			match(input,L_BR,FOLLOW_L_BR_in_program918); 
			match(input,R_BR,FOLLOW_R_BR_in_program920); 
			match(input,L_FBR,FOLLOW_L_FBR_in_program922); 

			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==DO||LA2_0==FOR||LA2_0==FUN_PRINT||(LA2_0 >= ID && LA2_0 <= IF)||(LA2_0 >= TYPE_BOOL && LA2_0 <= TYPE_STRING)||LA2_0==WHILE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:110:25: list_stat+= statement
					{
					pushFollow(FOLLOW_statement_in_program929);
					list_stat=statement();
					state._fsp--;

					if (list_list_stat==null) list_list_stat=new ArrayList<Object>();
					list_list_stat.add(list_stat.getTemplate());
					}
					break;

				default :
					break loop2;
				}
			}

			match(input,R_FBR,FOLLOW_R_FBR_in_program933); 
			}

			// TEMPLATE REWRITE
			// 111:2: -> init(stat=$list_statfuncs=$list_functions)
			{
				retval.st = templateLib.getInstanceOf("init",new STAttrMap().put("stat", list_list_stat).put("funcs", list_list_functions));
			}



			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class function_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "function"
	// C:\\Users\\1\\Desktop\\String.g:114:1: function : (val= ID L_BR ( params )? R_BR L_FBR (list_stat+= statement )* R_FBR ) -> funct(v=$val.textlist_funcs=$list_statlist_params=$params.st);
	public final StringParser.function_return function() throws RecognitionException {
		StringParser.function_return retval = new StringParser.function_return();
		retval.start = input.LT(1);

		Token val=null;
		List<Object> list_list_stat=null;
		ParserRuleReturnScope params1 =null;
		RuleReturnScope list_stat = null;
		try {
			// C:\\Users\\1\\Desktop\\String.g:114:10: ( (val= ID L_BR ( params )? R_BR L_FBR (list_stat+= statement )* R_FBR ) -> funct(v=$val.textlist_funcs=$list_statlist_params=$params.st))
			// C:\\Users\\1\\Desktop\\String.g:115:2: (val= ID L_BR ( params )? R_BR L_FBR (list_stat+= statement )* R_FBR )
			{
			// C:\\Users\\1\\Desktop\\String.g:115:2: (val= ID L_BR ( params )? R_BR L_FBR (list_stat+= statement )* R_FBR )
			// C:\\Users\\1\\Desktop\\String.g:115:3: val= ID L_BR ( params )? R_BR L_FBR (list_stat+= statement )* R_FBR
			{
			val=(Token)match(input,ID,FOLLOW_ID_in_function966); 
			match(input,L_BR,FOLLOW_L_BR_in_function968); 
			// C:\\Users\\1\\Desktop\\String.g:115:15: ( params )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==ID) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:115:15: params
					{
					pushFollow(FOLLOW_params_in_function970);
					params1=params();
					state._fsp--;

					}
					break;

			}

			match(input,R_BR,FOLLOW_R_BR_in_function973); 
			match(input,L_FBR,FOLLOW_L_FBR_in_function975); 
			// C:\\Users\\1\\Desktop\\String.g:115:34: (list_stat+= statement )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==DO||LA4_0==FOR||LA4_0==FUN_PRINT||(LA4_0 >= ID && LA4_0 <= IF)||(LA4_0 >= TYPE_BOOL && LA4_0 <= TYPE_STRING)||LA4_0==WHILE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:115:35: list_stat+= statement
					{
					pushFollow(FOLLOW_statement_in_function982);
					list_stat=statement();
					state._fsp--;

					if (list_list_stat==null) list_list_stat=new ArrayList<Object>();
					list_list_stat.add(list_stat.getTemplate());
					}
					break;

				default :
					break loop4;
				}
			}

			match(input,R_FBR,FOLLOW_R_FBR_in_function986); 
			}

			// TEMPLATE REWRITE
			// 116:2: -> funct(v=$val.textlist_funcs=$list_statlist_params=$params.st)
			{
				retval.st = templateLib.getInstanceOf("funct",new STAttrMap().put("v", (val!=null?val.getText():null)).put("list_funcs", list_list_stat).put("list_params", (params1!=null?((StringTemplate)params1.getTemplate()):null)));
			}



			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class statement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statement"
	// C:\\Users\\1\\Desktop\\String.g:119:1: statement : ( ( ( var_define | fun_print | fun_call | assign ) DOT_COMMA ) | if_stat | while_stat | for_rule | repeat_until );
	public final StringParser.statement_return statement() throws RecognitionException {
		StringParser.statement_return retval = new StringParser.statement_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope var_define2 =null;
		ParserRuleReturnScope fun_print3 =null;
		ParserRuleReturnScope fun_call4 =null;
		ParserRuleReturnScope assign5 =null;
		ParserRuleReturnScope if_stat6 =null;
		ParserRuleReturnScope while_stat7 =null;
		ParserRuleReturnScope for_rule8 =null;
		ParserRuleReturnScope repeat_until9 =null;

		try {
			// C:\\Users\\1\\Desktop\\String.g:119:11: ( ( ( var_define | fun_print | fun_call | assign ) DOT_COMMA ) | if_stat | while_stat | for_rule | repeat_until )
			int alt6=5;
			switch ( input.LA(1) ) {
			case FUN_PRINT:
			case ID:
			case TYPE_BOOL:
			case TYPE_CHAR:
			case TYPE_STRING:
				{
				alt6=1;
				}
				break;
			case IF:
				{
				alt6=2;
				}
				break;
			case WHILE:
				{
				alt6=3;
				}
				break;
			case FOR:
				{
				alt6=4;
				}
				break;
			case DO:
				{
				alt6=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:120:2: ( ( var_define | fun_print | fun_call | assign ) DOT_COMMA )
					{
					// C:\\Users\\1\\Desktop\\String.g:120:2: ( ( var_define | fun_print | fun_call | assign ) DOT_COMMA )
					// C:\\Users\\1\\Desktop\\String.g:120:3: ( var_define | fun_print | fun_call | assign ) DOT_COMMA
					{
					// C:\\Users\\1\\Desktop\\String.g:120:3: ( var_define | fun_print | fun_call | assign )
					int alt5=4;
					switch ( input.LA(1) ) {
					case TYPE_BOOL:
					case TYPE_CHAR:
					case TYPE_STRING:
						{
						alt5=1;
						}
						break;
					case FUN_PRINT:
						{
						alt5=2;
						}
						break;
					case ID:
						{
						int LA5_3 = input.LA(2);
						if ( (LA5_3==L_BR) ) {
							alt5=3;
						}
						else if ( (LA5_3==ASSIGN) ) {
							alt5=4;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 5, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\1\\Desktop\\String.g:121:2: var_define
							{
							pushFollow(FOLLOW_var_define_in_statement1029);
							var_define2=var_define();
							state._fsp--;

							retval.st = (var_define2!=null?((StringTemplate)var_define2.getTemplate()):null);
							}
							break;
						case 2 :
							// C:\\Users\\1\\Desktop\\String.g:122:4: fun_print
							{
							pushFollow(FOLLOW_fun_print_in_statement1037);
							fun_print3=fun_print();
							state._fsp--;

							retval.st = (fun_print3!=null?((StringTemplate)fun_print3.getTemplate()):null);
							}
							break;
						case 3 :
							// C:\\Users\\1\\Desktop\\String.g:123:4: fun_call
							{
							pushFollow(FOLLOW_fun_call_in_statement1044);
							fun_call4=fun_call();
							state._fsp--;

							retval.st = (fun_call4!=null?((StringTemplate)fun_call4.getTemplate()):null);
							}
							break;
						case 4 :
							// C:\\Users\\1\\Desktop\\String.g:124:4: assign
							{
							pushFollow(FOLLOW_assign_in_statement1051);
							assign5=assign();
							state._fsp--;

							retval.st = (assign5!=null?((StringTemplate)assign5.getTemplate()):null);
							}
							break;

					}

					match(input,DOT_COMMA,FOLLOW_DOT_COMMA_in_statement1059); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\1\\Desktop\\String.g:126:4: if_stat
					{
					pushFollow(FOLLOW_if_stat_in_statement1065);
					if_stat6=if_stat();
					state._fsp--;

					retval.st = (if_stat6!=null?((StringTemplate)if_stat6.getTemplate()):null);
					}
					break;
				case 3 :
					// C:\\Users\\1\\Desktop\\String.g:127:4: while_stat
					{
					pushFollow(FOLLOW_while_stat_in_statement1072);
					while_stat7=while_stat();
					state._fsp--;

					retval.st = (while_stat7!=null?((StringTemplate)while_stat7.getTemplate()):null);
					}
					break;
				case 4 :
					// C:\\Users\\1\\Desktop\\String.g:128:4: for_rule
					{
					pushFollow(FOLLOW_for_rule_in_statement1078);
					for_rule8=for_rule();
					state._fsp--;

					retval.st = (for_rule8!=null?((StringTemplate)for_rule8.getTemplate()):null);
					}
					break;
				case 5 :
					// C:\\Users\\1\\Desktop\\String.g:129:4: repeat_until
					{
					pushFollow(FOLLOW_repeat_until_in_statement1085);
					repeat_until9=repeat_until();
					state._fsp--;

					retval.st = (repeat_until9!=null?((StringTemplate)repeat_until9.getTemplate()):null);
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class params_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "params"
	// C:\\Users\\1\\Desktop\\String.g:132:1: params :t+= ID ids+= ID ( COMMA t+= ID ids+= ID )* -> params_template(list_types=$tlist_ids=$ids);
	public final StringParser.params_return params() throws RecognitionException {
		StringParser.params_return retval = new StringParser.params_return();
		retval.start = input.LT(1);

		Token t=null;
		Token ids=null;
		List<Object> list_t=null;
		List<Object> list_ids=null;

		try {
			// C:\\Users\\1\\Desktop\\String.g:132:8: (t+= ID ids+= ID ( COMMA t+= ID ids+= ID )* -> params_template(list_types=$tlist_ids=$ids))
			// C:\\Users\\1\\Desktop\\String.g:133:2: t+= ID ids+= ID ( COMMA t+= ID ids+= ID )*
			{
			t=(Token)match(input,ID,FOLLOW_ID_in_params1100); 
			if (list_t==null) list_t=new ArrayList<Object>();
			list_t.add(t);
			ids=(Token)match(input,ID,FOLLOW_ID_in_params1104); 
			if (list_ids==null) list_ids=new ArrayList<Object>();
			list_ids.add(ids);
			// C:\\Users\\1\\Desktop\\String.g:133:16: ( COMMA t+= ID ids+= ID )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:133:17: COMMA t+= ID ids+= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_params1107); 
					t=(Token)match(input,ID,FOLLOW_ID_in_params1111); 
					if (list_t==null) list_t=new ArrayList<Object>();
					list_t.add(t);
					ids=(Token)match(input,ID,FOLLOW_ID_in_params1115); 
					if (list_ids==null) list_ids=new ArrayList<Object>();
					list_ids.add(ids);
					}
					break;

				default :
					break loop7;
				}
			}


//					Iterator<Object> it = list_t.iterator();
//					for (Object obj : list_ids) {
//						Object tp = it.next();
//						Token id = (Token) obj;
//						Name n = new Name(id.getText(), $tp.type, id.getLine());
//						names.add(n);
//					}
				
			// TEMPLATE REWRITE
			// 142:2: -> params_template(list_types=$tlist_ids=$ids)
			{
				retval.st = templateLib.getInstanceOf("params_template",new STAttrMap().put("list_types", list_t).put("list_ids", list_ids));
			}



			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "params"


	public static class for_rule_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "for_rule"
	// C:\\Users\\1\\Desktop\\String.g:145:1: for_rule : FOR L_BR (a= var_define )? DOT_COMMA ( log_expr )? DOT_COMMA (b= var_define )? R_BR L_FBR (value_stat+= body_statement )+ R_FBR -> for_template(param=$a.stparam2=$log_expr.stparam3=$b.ststat=$value_stat);
	public final StringParser.for_rule_return for_rule() throws RecognitionException {
		StringParser.for_rule_return retval = new StringParser.for_rule_return();
		retval.start = input.LT(1);

		List<Object> list_value_stat=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope log_expr10 =null;
		RuleReturnScope value_stat = null;
		try {
			// C:\\Users\\1\\Desktop\\String.g:145:10: ( FOR L_BR (a= var_define )? DOT_COMMA ( log_expr )? DOT_COMMA (b= var_define )? R_BR L_FBR (value_stat+= body_statement )+ R_FBR -> for_template(param=$a.stparam2=$log_expr.stparam3=$b.ststat=$value_stat))
			// C:\\Users\\1\\Desktop\\String.g:146:2: FOR L_BR (a= var_define )? DOT_COMMA ( log_expr )? DOT_COMMA (b= var_define )? R_BR L_FBR (value_stat+= body_statement )+ R_FBR
			{
			match(input,FOR,FOLLOW_FOR_in_for_rule1148); 
			match(input,L_BR,FOLLOW_L_BR_in_for_rule1150); 
			// C:\\Users\\1\\Desktop\\String.g:147:4: (a= var_define )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= TYPE_BOOL && LA8_0 <= TYPE_STRING)) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:147:5: a= var_define
					{
					pushFollow(FOLLOW_var_define_in_for_rule1158);
					a=var_define();
					state._fsp--;

					}
					break;

			}

			match(input,DOT_COMMA,FOLLOW_DOT_COMMA_in_for_rule1162); 
			// C:\\Users\\1\\Desktop\\String.g:147:30: ( log_expr )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==CHAR||(LA9_0 >= FUN_EMPTY && LA9_0 <= FUN_PRINT)||LA9_0==ID||LA9_0==L_BR||(LA9_0 >= NOT && LA9_0 <= NULL)||LA9_0==STRING) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:147:31: log_expr
					{
					pushFollow(FOLLOW_log_expr_in_for_rule1165);
					log_expr10=log_expr();
					state._fsp--;

					}
					break;

			}

			match(input,DOT_COMMA,FOLLOW_DOT_COMMA_in_for_rule1169); 
			// C:\\Users\\1\\Desktop\\String.g:147:52: (b= var_define )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= TYPE_BOOL && LA10_0 <= TYPE_STRING)) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:147:53: b= var_define
					{
					pushFollow(FOLLOW_var_define_in_for_rule1174);
					b=var_define();
					state._fsp--;

					}
					break;

			}

			match(input,R_BR,FOLLOW_R_BR_in_for_rule1178); 
			match(input,L_FBR,FOLLOW_L_FBR_in_for_rule1180); 
			// C:\\Users\\1\\Desktop\\String.g:148:4: (value_stat+= body_statement )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==FUN_PRINT||LA11_0==ID) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:148:5: value_stat+= body_statement
					{
					pushFollow(FOLLOW_body_statement_in_for_rule1188);
					value_stat=body_statement();
					state._fsp--;

					if (list_value_stat==null) list_value_stat=new ArrayList<Object>();
					list_value_stat.add(value_stat.getTemplate());
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			match(input,R_FBR,FOLLOW_R_FBR_in_for_rule1192); 
			// TEMPLATE REWRITE
			// 149:2: -> for_template(param=$a.stparam2=$log_expr.stparam3=$b.ststat=$value_stat)
			{
				retval.st = templateLib.getInstanceOf("for_template",new STAttrMap().put("param", (a!=null?((StringTemplate)a.getTemplate()):null)).put("param2", (log_expr10!=null?((StringTemplate)log_expr10.getTemplate()):null)).put("param3", (b!=null?((StringTemplate)b.getTemplate()):null)).put("stat", list_value_stat));
			}



			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "for_rule"


	public static class repeat_until_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "repeat_until"
	// C:\\Users\\1\\Desktop\\String.g:154:1: repeat_until : DO L_FBR (value_stat+= body_statement )* R_FBR DO_WHILE L_BR ( log_expr ) R_BR DOT_COMMA -> repeat_template(stat=$value_statexpr=$log_expr.st);
	public final StringParser.repeat_until_return repeat_until() throws RecognitionException {
		StringParser.repeat_until_return retval = new StringParser.repeat_until_return();
		retval.start = input.LT(1);

		List<Object> list_value_stat=null;
		ParserRuleReturnScope log_expr11 =null;
		RuleReturnScope value_stat = null;
		try {
			// C:\\Users\\1\\Desktop\\String.g:154:14: ( DO L_FBR (value_stat+= body_statement )* R_FBR DO_WHILE L_BR ( log_expr ) R_BR DOT_COMMA -> repeat_template(stat=$value_statexpr=$log_expr.st))
			// C:\\Users\\1\\Desktop\\String.g:155:2: DO L_FBR (value_stat+= body_statement )* R_FBR DO_WHILE L_BR ( log_expr ) R_BR DOT_COMMA
			{
			match(input,DO,FOLLOW_DO_in_repeat_until1232); 
			match(input,L_FBR,FOLLOW_L_FBR_in_repeat_until1236); 
			// C:\\Users\\1\\Desktop\\String.g:157:3: (value_stat+= body_statement )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==FUN_PRINT||LA12_0==ID) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:157:4: value_stat+= body_statement
					{
					pushFollow(FOLLOW_body_statement_in_repeat_until1243);
					value_stat=body_statement();
					state._fsp--;

					if (list_value_stat==null) list_value_stat=new ArrayList<Object>();
					list_value_stat.add(value_stat.getTemplate());
					}
					break;

				default :
					break loop12;
				}
			}

			match(input,R_FBR,FOLLOW_R_FBR_in_repeat_until1248); 
			match(input,DO_WHILE,FOLLOW_DO_WHILE_in_repeat_until1252); 
			match(input,L_BR,FOLLOW_L_BR_in_repeat_until1254); 
			// C:\\Users\\1\\Desktop\\String.g:159:16: ( log_expr )
			// C:\\Users\\1\\Desktop\\String.g:159:17: log_expr
			{
			pushFollow(FOLLOW_log_expr_in_repeat_until1257);
			log_expr11=log_expr();
			state._fsp--;

			}

			match(input,R_BR,FOLLOW_R_BR_in_repeat_until1260); 
			match(input,DOT_COMMA,FOLLOW_DOT_COMMA_in_repeat_until1262); 
			// TEMPLATE REWRITE
			// 160:2: -> repeat_template(stat=$value_statexpr=$log_expr.st)
			{
				retval.st = templateLib.getInstanceOf("repeat_template",new STAttrMap().put("stat", list_value_stat).put("expr", (log_expr11!=null?((StringTemplate)log_expr11.getTemplate()):null)));
			}



			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "repeat_until"


	public static class body_statement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "body_statement"
	// C:\\Users\\1\\Desktop\\String.g:164:1: body_statement : ( assign | fun_print ) DOT_COMMA ;
	public final StringParser.body_statement_return body_statement() throws RecognitionException {
		StringParser.body_statement_return retval = new StringParser.body_statement_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope assign12 =null;
		ParserRuleReturnScope fun_print13 =null;

		try {
			// C:\\Users\\1\\Desktop\\String.g:164:16: ( ( assign | fun_print ) DOT_COMMA )
			// C:\\Users\\1\\Desktop\\String.g:165:2: ( assign | fun_print ) DOT_COMMA
			{
			// C:\\Users\\1\\Desktop\\String.g:165:2: ( assign | fun_print )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ID) ) {
				alt13=1;
			}
			else if ( (LA13_0==FUN_PRINT) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:165:3: assign
					{
					pushFollow(FOLLOW_assign_in_body_statement1293);
					assign12=assign();
					state._fsp--;

					retval.st = (assign12!=null?((StringTemplate)assign12.getTemplate()):null);
					}
					break;
				case 2 :
					// C:\\Users\\1\\Desktop\\String.g:166:3: fun_print
					{
					pushFollow(FOLLOW_fun_print_in_body_statement1301);
					fun_print13=fun_print();
					state._fsp--;

					retval.st = (fun_print13!=null?((StringTemplate)fun_print13.getTemplate()):null);
					}
					break;

			}

			match(input,DOT_COMMA,FOLLOW_DOT_COMMA_in_body_statement1308); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "body_statement"


	public static class if_stat_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "if_stat"
	// C:\\Users\\1\\Desktop\\String.g:170:1: if_stat : IF L_BR log_expr R_BR L_FBR (stat+= body_statement )+ R_FBR ( ELSE L_FBR (stat2+= body_statement )+ R_FBR )? -> if_template(cond=$log_expr.ststat=$statstat2=$stat2);
	public final StringParser.if_stat_return if_stat() throws RecognitionException {
		StringParser.if_stat_return retval = new StringParser.if_stat_return();
		retval.start = input.LT(1);

		List<Object> list_stat=null;
		List<Object> list_stat2=null;
		ParserRuleReturnScope log_expr14 =null;
		RuleReturnScope stat = null;
		RuleReturnScope stat2 = null;
		try {
			// C:\\Users\\1\\Desktop\\String.g:170:9: ( IF L_BR log_expr R_BR L_FBR (stat+= body_statement )+ R_FBR ( ELSE L_FBR (stat2+= body_statement )+ R_FBR )? -> if_template(cond=$log_expr.ststat=$statstat2=$stat2))
			// C:\\Users\\1\\Desktop\\String.g:171:2: IF L_BR log_expr R_BR L_FBR (stat+= body_statement )+ R_FBR ( ELSE L_FBR (stat2+= body_statement )+ R_FBR )?
			{
			match(input,IF,FOLLOW_IF_in_if_stat1319); 
			match(input,L_BR,FOLLOW_L_BR_in_if_stat1321); 
			pushFollow(FOLLOW_log_expr_in_if_stat1323);
			log_expr14=log_expr();
			state._fsp--;

			match(input,R_BR,FOLLOW_R_BR_in_if_stat1325); 
			match(input,L_FBR,FOLLOW_L_FBR_in_if_stat1327); 
			// C:\\Users\\1\\Desktop\\String.g:171:30: (stat+= body_statement )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==FUN_PRINT||LA14_0==ID) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:171:31: stat+= body_statement
					{
					pushFollow(FOLLOW_body_statement_in_if_stat1332);
					stat=body_statement();
					state._fsp--;

					if (list_stat==null) list_stat=new ArrayList<Object>();
					list_stat.add(stat.getTemplate());
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			match(input,R_FBR,FOLLOW_R_FBR_in_if_stat1336); 
			// C:\\Users\\1\\Desktop\\String.g:172:2: ( ELSE L_FBR (stat2+= body_statement )+ R_FBR )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ELSE) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:172:3: ELSE L_FBR (stat2+= body_statement )+ R_FBR
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_stat1340); 
					match(input,L_FBR,FOLLOW_L_FBR_in_if_stat1342); 
					// C:\\Users\\1\\Desktop\\String.g:172:14: (stat2+= body_statement )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==FUN_PRINT||LA15_0==ID) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Users\\1\\Desktop\\String.g:172:15: stat2+= body_statement
							{
							pushFollow(FOLLOW_body_statement_in_if_stat1347);
							stat2=body_statement();
							state._fsp--;

							if (list_stat2==null) list_stat2=new ArrayList<Object>();
							list_stat2.add(stat2.getTemplate());
							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					match(input,R_FBR,FOLLOW_R_FBR_in_if_stat1351); 
					}
					break;

			}

			// TEMPLATE REWRITE
			// 173:2: -> if_template(cond=$log_expr.ststat=$statstat2=$stat2)
			{
				retval.st = templateLib.getInstanceOf("if_template",new STAttrMap().put("cond", (log_expr14!=null?((StringTemplate)log_expr14.getTemplate()):null)).put("stat", list_stat).put("stat2", list_stat2));
			}



			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "if_stat"


	public static class while_stat_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "while_stat"
	// C:\\Users\\1\\Desktop\\String.g:175:1: while_stat : WHILE L_BR log_expr R_BR L_FBR (stat+= body_statement )+ R_FBR ( DOT_COMMA )? -> while_template(cond=$log_expr.ststat=$stat);
	public final StringParser.while_stat_return while_stat() throws RecognitionException {
		StringParser.while_stat_return retval = new StringParser.while_stat_return();
		retval.start = input.LT(1);

		List<Object> list_stat=null;
		ParserRuleReturnScope log_expr15 =null;
		RuleReturnScope stat = null;
		try {
			// C:\\Users\\1\\Desktop\\String.g:175:12: ( WHILE L_BR log_expr R_BR L_FBR (stat+= body_statement )+ R_FBR ( DOT_COMMA )? -> while_template(cond=$log_expr.ststat=$stat))
			// C:\\Users\\1\\Desktop\\String.g:176:2: WHILE L_BR log_expr R_BR L_FBR (stat+= body_statement )+ R_FBR ( DOT_COMMA )?
			{
			match(input,WHILE,FOLLOW_WHILE_in_while_stat1384); 
			match(input,L_BR,FOLLOW_L_BR_in_while_stat1386); 
			pushFollow(FOLLOW_log_expr_in_while_stat1388);
			log_expr15=log_expr();
			state._fsp--;

			match(input,R_BR,FOLLOW_R_BR_in_while_stat1390); 
			match(input,L_FBR,FOLLOW_L_FBR_in_while_stat1392); 
			// C:\\Users\\1\\Desktop\\String.g:176:33: (stat+= body_statement )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==FUN_PRINT||LA17_0==ID) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:176:34: stat+= body_statement
					{
					pushFollow(FOLLOW_body_statement_in_while_stat1397);
					stat=body_statement();
					state._fsp--;

					if (list_stat==null) list_stat=new ArrayList<Object>();
					list_stat.add(stat.getTemplate());
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			match(input,R_FBR,FOLLOW_R_FBR_in_while_stat1401); 
			// C:\\Users\\1\\Desktop\\String.g:176:63: ( DOT_COMMA )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==DOT_COMMA) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:176:63: DOT_COMMA
					{
					match(input,DOT_COMMA,FOLLOW_DOT_COMMA_in_while_stat1403); 
					}
					break;

			}

			// TEMPLATE REWRITE
			// 177:2: -> while_template(cond=$log_expr.ststat=$stat)
			{
				retval.st = templateLib.getInstanceOf("while_template",new STAttrMap().put("cond", (log_expr15!=null?((StringTemplate)log_expr15.getTemplate()):null)).put("stat", list_stat));
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "while_stat"

	public static class log_expr_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "log_expr"
	// C:\\Users\\1\\Desktop\\String.g:179:1: log_expr : ( (f= sublog_expr ( ( AND | OR ) s= sublog_expr )* ) | ( NOT t= sublog_expr ) ) ;
	public final StringParser.log_expr_return log_expr() throws RecognitionException {
		StringParser.log_expr_return retval = new StringParser.log_expr_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope f =null;
		ParserRuleReturnScope s =null;
		ParserRuleReturnScope t =null;

			String result = "";

		try {
			// C:\\Users\\1\\Desktop\\String.g:182:2: ( ( (f= sublog_expr ( ( AND | OR ) s= sublog_expr )* ) | ( NOT t= sublog_expr ) ) )
			// C:\\Users\\1\\Desktop\\String.g:183:2: ( (f= sublog_expr ( ( AND | OR ) s= sublog_expr )* ) | ( NOT t= sublog_expr ) )
			{
			// C:\\Users\\1\\Desktop\\String.g:183:2: ( (f= sublog_expr ( ( AND | OR ) s= sublog_expr )* ) | ( NOT t= sublog_expr ) )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==CHAR||(LA21_0 >= FUN_EMPTY && LA21_0 <= FUN_PRINT)||LA21_0==ID||LA21_0==L_BR||LA21_0==NULL||LA21_0==STRING) ) {
				alt21=1;
			}
			else if ( (LA21_0==NOT) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:184:2: (f= sublog_expr ( ( AND | OR ) s= sublog_expr )* )
					{
					// C:\\Users\\1\\Desktop\\String.g:184:2: (f= sublog_expr ( ( AND | OR ) s= sublog_expr )* )
					// C:\\Users\\1\\Desktop\\String.g:184:3: f= sublog_expr ( ( AND | OR ) s= sublog_expr )*
					{
					pushFollow(FOLLOW_sublog_expr_in_log_expr1439);
					f=sublog_expr();
					state._fsp--;

					result+=(f!=null?((StringTemplate)f.getTemplate()):null).toString();
					// C:\\Users\\1\\Desktop\\String.g:185:3: ( ( AND | OR ) s= sublog_expr )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==AND||LA20_0==OR) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\1\\Desktop\\String.g:186:4: ( AND | OR ) s= sublog_expr
							{
							// C:\\Users\\1\\Desktop\\String.g:186:4: ( AND | OR )
							int alt19=2;
							int LA19_0 = input.LA(1);
							if ( (LA19_0==AND) ) {
								alt19=1;
							}
							else if ( (LA19_0==OR) ) {
								alt19=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 19, 0, input);
								throw nvae;
							}

							switch (alt19) {
								case 1 :
									// C:\\Users\\1\\Desktop\\String.g:186:5: AND
									{
									match(input,AND,FOLLOW_AND_in_log_expr1451); 
									result+="&&";
									}
									break;
								case 2 :
									// C:\\Users\\1\\Desktop\\String.g:186:27: OR
									{
									match(input,OR,FOLLOW_OR_in_log_expr1457); 
									result+="||";
									}
									break;

							}

							pushFollow(FOLLOW_sublog_expr_in_log_expr1468);
							s=sublog_expr();
							state._fsp--;

							result+=(s!=null?((StringTemplate)s.getTemplate()):null).toString();
							}
							break;

						default :
							break loop20;
						}
					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\1\\Desktop\\String.g:190:5: ( NOT t= sublog_expr )
					{
					// C:\\Users\\1\\Desktop\\String.g:190:5: ( NOT t= sublog_expr )
					// C:\\Users\\1\\Desktop\\String.g:190:6: NOT t= sublog_expr
					{
					match(input,NOT,FOLLOW_NOT_in_log_expr1486); 
					pushFollow(FOLLOW_sublog_expr_in_log_expr1490);
					t=sublog_expr();
					state._fsp--;

					result+="!"+t.stop.toString();
					}

					}
					break;

			}

			retval.st = new StringTemplate(result);
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "log_expr"


	public static class sublog_expr_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "sublog_expr"
	// C:\\Users\\1\\Desktop\\String.g:197:1: sublog_expr : (left_e= expr ) ( ( ( LOG_SIGN right_e= expr ) ) |) ;
	public final StringParser.sublog_expr_return sublog_expr() throws RecognitionException {
		StringParser.sublog_expr_return retval = new StringParser.sublog_expr_return();
		retval.start = input.LT(1);

		Token LOG_SIGN16=null;
		ParserRuleReturnScope left_e =null;
		ParserRuleReturnScope right_e =null;

		try {
			// C:\\Users\\1\\Desktop\\String.g:197:13: ( (left_e= expr ) ( ( ( LOG_SIGN right_e= expr ) ) |) )
			// C:\\Users\\1\\Desktop\\String.g:198:2: (left_e= expr ) ( ( ( LOG_SIGN right_e= expr ) ) |)
			{
			// C:\\Users\\1\\Desktop\\String.g:198:2: (left_e= expr )
			// C:\\Users\\1\\Desktop\\String.g:198:3: left_e= expr
			{
			pushFollow(FOLLOW_expr_in_sublog_expr1516);
			left_e=expr();
			state._fsp--;

			}

			// C:\\Users\\1\\Desktop\\String.g:198:16: ( ( ( LOG_SIGN right_e= expr ) ) |)
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==LOG_SIGN) ) {
				alt22=1;
			}
			else if ( (LA22_0==AND||LA22_0==DOT_COMMA||LA22_0==OR||LA22_0==R_BR) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:199:3: ( ( LOG_SIGN right_e= expr ) )
					{
					// C:\\Users\\1\\Desktop\\String.g:199:3: ( ( LOG_SIGN right_e= expr ) )
					// C:\\Users\\1\\Desktop\\String.g:199:4: ( LOG_SIGN right_e= expr )
					{
					// C:\\Users\\1\\Desktop\\String.g:199:4: ( LOG_SIGN right_e= expr )
					// C:\\Users\\1\\Desktop\\String.g:199:5: LOG_SIGN right_e= expr
					{
					LOG_SIGN16=(Token)match(input,LOG_SIGN,FOLLOW_LOG_SIGN_in_sublog_expr1525); 
					pushFollow(FOLLOW_expr_in_sublog_expr1529);
					right_e=expr();
					state._fsp--;

					}

							if ((LOG_SIGN16!=null?LOG_SIGN16.getText():null).equals("<"))
								retval.st = new StringTemplate("Operation.compare("+(left_e!=null?((StringTemplate)left_e.getTemplate()):null)+", "+(right_e!=null?((StringTemplate)right_e.getTemplate()):null)+", "+"CompareType.LESS)");
							else if ((LOG_SIGN16!=null?LOG_SIGN16.getText():null).equals(">"))
								retval.st = new StringTemplate("Operation.compare("+(left_e!=null?((StringTemplate)left_e.getTemplate()):null)+", "+(right_e!=null?((StringTemplate)right_e.getTemplate()):null)+", "+"CompareType.GR)");
							else if ((LOG_SIGN16!=null?LOG_SIGN16.getText():null).equals("=="))
								retval.st = new StringTemplate("Operation.compare("+(left_e!=null?((StringTemplate)left_e.getTemplate()):null)+", "+(right_e!=null?((StringTemplate)right_e.getTemplate()):null)+", "+"CompareType.EQ)");
							else if ((LOG_SIGN16!=null?LOG_SIGN16.getText():null).equals("!="))
								retval.st = new StringTemplate("Operation.compare("+(left_e!=null?((StringTemplate)left_e.getTemplate()):null)+", "+(right_e!=null?((StringTemplate)right_e.getTemplate()):null)+", "+"CompareType.NOT_EQ)");
							else
								retval.st = new StringTemplate("Operation.compare("+(left_e!=null?((StringTemplate)left_e.getTemplate()):null)+", "+(right_e!=null?((StringTemplate)right_e.getTemplate()):null)+", "+"CompareType.EQ)");
						
					}

					}
					break;
				case 2 :
					// C:\\Users\\1\\Desktop\\String.g:211:2: 
					{
					retval.st = (left_e!=null?((StringTemplate)left_e.getTemplate()):null);
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sublog_expr"

	public static class expr_return extends ParserRuleReturnScope {
		public String type;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "expr"
	// C:\\Users\\1\\Desktop\\String.g:214:1: expr returns [String type] :opd+= mult ( (op= PLUS |op= MINUS ) opd+= mult )* ;
	public final StringParser.expr_return expr() throws RecognitionException {
		StringParser.expr_return retval = new StringParser.expr_return();
		retval.start = input.LT(1);

		Token op=null;
		List<Object> list_opd=null;
		RuleReturnScope opd = null;
		try {
			// C:\\Users\\1\\Desktop\\String.g:214:28: (opd+= mult ( (op= PLUS |op= MINUS ) opd+= mult )* )
			// C:\\Users\\1\\Desktop\\String.g:215:2: opd+= mult ( (op= PLUS |op= MINUS ) opd+= mult )*
			{
			pushFollow(FOLLOW_mult_in_expr1559);
			opd=mult();
			state._fsp--;

			if (list_opd==null) list_opd=new ArrayList<Object>();
			list_opd.add(opd.getTemplate());
			// C:\\Users\\1\\Desktop\\String.g:215:12: ( (op= PLUS |op= MINUS ) opd+= mult )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==MINUS||LA24_0==PLUS) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:215:13: (op= PLUS |op= MINUS ) opd+= mult
					{
					// C:\\Users\\1\\Desktop\\String.g:215:13: (op= PLUS |op= MINUS )
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==PLUS) ) {
						alt23=1;
					}
					else if ( (LA23_0==MINUS) ) {
						alt23=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}

					switch (alt23) {
						case 1 :
							// C:\\Users\\1\\Desktop\\String.g:215:14: op= PLUS
							{
							op=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr1565); 
							}
							break;
						case 2 :
							// C:\\Users\\1\\Desktop\\String.g:215:22: op= MINUS
							{
							op=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr1569); 
							}
							break;

					}

					pushFollow(FOLLOW_mult_in_expr1574);
					opd=mult();
					state._fsp--;

					if (list_opd==null) list_opd=new ArrayList<Object>();
					list_opd.add(opd.getTemplate());
					}
					break;

				default :
					break loop24;
				}
			}

				if(op != null) {
					if((op!=null?op.getText():null).equals("+")){
						retval.st = templateLib.getInstanceOf("plus_template",new STAttrMap().put("operands", list_opd));
					} else if((op!=null?op.getText():null).equals("-")){
					    retval.st = templateLib.getInstanceOf("minus_template",new STAttrMap().put("operands", list_opd));
					}
				} else retval.st = templateLib.getInstanceOf("atom_template",new STAttrMap().put("operands", list_opd));
				
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"

	public static class mult_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "mult"
	// C:\\Users\\1\\Desktop\\String.g:227:1: mult :opd+= subexpr (op= MULT opd+= subexpr )* ;
	public final StringParser.mult_return mult() throws RecognitionException {
		StringParser.mult_return retval = new StringParser.mult_return();
		retval.start = input.LT(1);

		Token op=null;
		List<Object> list_opd=null;
		RuleReturnScope opd = null;
		try {
			// C:\\Users\\1\\Desktop\\String.g:227:6: (opd+= subexpr (op= MULT opd+= subexpr )* )
			// C:\\Users\\1\\Desktop\\String.g:228:2: opd+= subexpr (op= MULT opd+= subexpr )*
			{
			pushFollow(FOLLOW_subexpr_in_mult1591);
			opd=subexpr();
			state._fsp--;

			if (list_opd==null) list_opd=new ArrayList<Object>();
			list_opd.add(opd.getTemplate());
			// C:\\Users\\1\\Desktop\\String.g:228:15: (op= MULT opd+= subexpr )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==MULT) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:228:16: op= MULT opd+= subexpr
					{
					op=(Token)match(input,MULT,FOLLOW_MULT_in_mult1596); 
					pushFollow(FOLLOW_subexpr_in_mult1600);
					opd=subexpr();
					state._fsp--;

					if (list_opd==null) list_opd=new ArrayList<Object>();
					list_opd.add(opd.getTemplate());
					}
					break;

				default :
					break loop25;
				}
			}

			if(op!=null){
						if((op!=null?op.getText():null).equals("*")){
							retval.st = templateLib.getInstanceOf("mult_template",new STAttrMap().put("operands", list_opd));
						} 
					} else retval.st = templateLib.getInstanceOf("atom_template",new STAttrMap().put("operands", list_opd));
				
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mult"


	public static class var_define_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "var_define"
	// C:\\Users\\1\\Desktop\\String.g:237:1: var_define : t= type ids+= ID ( ASSIGN values+= var_value ) ( COMMA ids+= ID ( ASSIGN values+= var_value ) )* -> var_define_template(type=$type.typelist_id=$idslist_value=$values);
	public final StringParser.var_define_return var_define() throws RecognitionException {
		StringParser.var_define_return retval = new StringParser.var_define_return();
		retval.start = input.LT(1);

		Token ids=null;
		List<Object> list_ids=null;
		List<Object> list_values=null;
		ParserRuleReturnScope t =null;
		RuleReturnScope values = null;
		try {
			// C:\\Users\\1\\Desktop\\String.g:237:13: (t= type ids+= ID ( ASSIGN values+= var_value ) ( COMMA ids+= ID ( ASSIGN values+= var_value ) )* -> var_define_template(type=$type.typelist_id=$idslist_value=$values))
			// C:\\Users\\1\\Desktop\\String.g:238:2: t= type ids+= ID ( ASSIGN values+= var_value ) ( COMMA ids+= ID ( ASSIGN values+= var_value ) )*
			{
			pushFollow(FOLLOW_type_in_var_define1621);
			t=type();
			state._fsp--;

			ids=(Token)match(input,ID,FOLLOW_ID_in_var_define1625); 
			if (list_ids==null) list_ids=new ArrayList<Object>();
			list_ids.add(ids);
			// C:\\Users\\1\\Desktop\\String.g:239:2: ( ASSIGN values+= var_value )
			// C:\\Users\\1\\Desktop\\String.g:239:3: ASSIGN values+= var_value
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_var_define1630); 
			pushFollow(FOLLOW_var_value_in_var_define1634);
			values=var_value();
			state._fsp--;

			if (list_values==null) list_values=new ArrayList<Object>();
			list_values.add(values.getTemplate());
			}

			// C:\\Users\\1\\Desktop\\String.g:240:2: ( COMMA ids+= ID ( ASSIGN values+= var_value ) )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==COMMA) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:240:3: COMMA ids+= ID ( ASSIGN values+= var_value )
					{
					match(input,COMMA,FOLLOW_COMMA_in_var_define1639); 
					ids=(Token)match(input,ID,FOLLOW_ID_in_var_define1643); 
					if (list_ids==null) list_ids=new ArrayList<Object>();
					list_ids.add(ids);
					// C:\\Users\\1\\Desktop\\String.g:240:17: ( ASSIGN values+= var_value )
					// C:\\Users\\1\\Desktop\\String.g:240:18: ASSIGN values+= var_value
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_var_define1646); 
					pushFollow(FOLLOW_var_value_in_var_define1650);
					values=var_value();
					state._fsp--;

					if (list_values==null) list_values=new ArrayList<Object>();
					list_values.add(values.getTemplate());
					}

					}
					break;

				default :
					break loop26;
				}
			}

				for (Object obj : list_ids) {
					Token id = (Token) obj;
					Name n = new Name(id.getText(), (t!=null?((StringParser.type_return)t).type:null), id.getLine());
					names.add(n);
			    }
			// TEMPLATE REWRITE
			// 247:5: -> var_define_template(type=$type.typelist_id=$idslist_value=$values)
			{
				retval.st = templateLib.getInstanceOf("var_define_template",new STAttrMap().put("type", (t!=null?((StringParser.type_return)t).type:null)).put("list_id", list_ids).put("list_value", list_values));
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_define"


	public static class assign_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "assign"
	// C:\\Users\\1\\Desktop\\String.g:253:1: assign : ID ASSIGN expr -> assign_template(id=$IDexpr=$expr.st);
	public final StringParser.assign_return assign() throws RecognitionException {
		StringParser.assign_return retval = new StringParser.assign_return();
		retval.start = input.LT(1);

		Token ID17=null;
		ParserRuleReturnScope expr18 =null;

		try {
			// C:\\Users\\1\\Desktop\\String.g:253:9: ( ID ASSIGN expr -> assign_template(id=$IDexpr=$expr.st))
			// C:\\Users\\1\\Desktop\\String.g:254:2: ID ASSIGN expr
			{
			ID17=(Token)match(input,ID,FOLLOW_ID_in_assign1705); 
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1707); 
			pushFollow(FOLLOW_expr_in_assign1709);
			expr18=expr();
			state._fsp--;


				if(!isDefined((ID17!=null?ID17.getText():null))) {
					throw new NotDefinedVariable((ID17!=null?ID17.getText():null), (ID17!=null?ID17.getLine():0));
				}
				
			// TEMPLATE REWRITE
			// 259:2: -> assign_template(id=$IDexpr=$expr.st)
			{
				retval.st = templateLib.getInstanceOf("assign_template",new STAttrMap().put("id", ID17).put("expr", (expr18!=null?((StringTemplate)expr18.getTemplate()):null)));
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assign"

	public static class type_return extends ParserRuleReturnScope {
		public String type;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "type"
	// C:\\Users\\1\\Desktop\\String.g:262:1: type returns [String type] : ( TYPE_STRING | TYPE_CHAR | TYPE_BOOL );
	public final StringParser.type_return type() throws RecognitionException {
		StringParser.type_return retval = new StringParser.type_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\1\\Desktop\\String.g:262:28: ( TYPE_STRING | TYPE_CHAR | TYPE_BOOL )
			int alt27=3;
			switch ( input.LA(1) ) {
			case TYPE_STRING:
				{
				alt27=1;
				}
				break;
			case TYPE_CHAR:
				{
				alt27=2;
				}
				break;
			case TYPE_BOOL:
				{
				alt27=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:263:4: TYPE_STRING
					{
					match(input,TYPE_STRING,FOLLOW_TYPE_STRING_in_type1752); 
					retval.type ="string";
					}
					break;
				case 2 :
					// C:\\Users\\1\\Desktop\\String.g:264:4: TYPE_CHAR
					{
					match(input,TYPE_CHAR,FOLLOW_TYPE_CHAR_in_type1760); 
					retval.type ="char";
					}
					break;
				case 3 :
					// C:\\Users\\1\\Desktop\\String.g:265:4: TYPE_BOOL
					{
					match(input,TYPE_BOOL,FOLLOW_TYPE_BOOL_in_type1769); 
					retval.type ="bool";
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class var_value_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};

	// $ANTLR start "var_value"
	// C:\\Users\\1\\Desktop\\String.g:268:1: var_value : ( ID | string | fun_char | NULL );
	public final StringParser.var_value_return var_value() throws RecognitionException {
		StringParser.var_value_return retval = new StringParser.var_value_return();
		retval.start = input.LT(1);

		Token ID19=null;
		Token NULL22=null;
		ParserRuleReturnScope string20 =null;
		ParserRuleReturnScope fun_char21 =null;

		try {
			// C:\\Users\\1\\Desktop\\String.g:268:11: ( ID | string | fun_char | NULL )
			int alt28=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt28=1;
				}
				break;
			case STRING:
				{
				alt28=2;
				}
				break;
			case CHAR:
				{
				alt28=3;
				}
				break;
			case NULL:
				{
				alt28=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:269:2: ID
					{
					ID19=(Token)match(input,ID,FOLLOW_ID_in_var_value1784); 

						if(!isDefined((ID19!=null?ID19.getText():null)))
							throw new NotDefinedVariable((ID19!=null?ID19.getText():null), (ID19!=null?ID19.getLine():0));
						 retval.st = new StringTemplate((ID19!=null?ID19.getText():null));
					}
					break;
				case 2 :
					// C:\\Users\\1\\Desktop\\String.g:273:3: string
					{
					pushFollow(FOLLOW_string_in_var_value1790);
					string20=string();
					state._fsp--;

					retval.st = (string20!=null?((StringTemplate)string20.getTemplate()):null);
					}
					break;
				case 3 :
					// C:\\Users\\1\\Desktop\\String.g:274:3: fun_char
					{
					pushFollow(FOLLOW_fun_char_in_var_value1797);
					fun_char21=fun_char();
					state._fsp--;

					retval.st = (fun_char21!=null?((StringTemplate)fun_char21.getTemplate()):null);
					}
					break;
				case 4 :
					// C:\\Users\\1\\Desktop\\String.g:276:3: NULL
					{
					NULL22=(Token)match(input,NULL,FOLLOW_NULL_in_var_value1805); 
					retval.st = new StringTemplate((NULL22!=null?NULL22.getText():null));
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_value"


	public static class subexpr_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "subexpr"
	// C:\\Users\\1\\Desktop\\String.g:279:1: subexpr : ( expr_fun | L_BR expr R_BR | var_value ) ;
	public final StringParser.subexpr_return subexpr() throws RecognitionException {
		StringParser.subexpr_return retval = new StringParser.subexpr_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope expr_fun23 =null;
		ParserRuleReturnScope expr24 =null;
		ParserRuleReturnScope var_value25 =null;

		try {
			// C:\\Users\\1\\Desktop\\String.g:279:9: ( ( expr_fun | L_BR expr R_BR | var_value ) )
			// C:\\Users\\1\\Desktop\\String.g:280:2: ( expr_fun | L_BR expr R_BR | var_value )
			{
			// C:\\Users\\1\\Desktop\\String.g:280:2: ( expr_fun | L_BR expr R_BR | var_value )
			int alt29=3;
			switch ( input.LA(1) ) {
			case FUN_EMPTY:
			case FUN_LENGTH:
			case FUN_PRINT:
				{
				alt29=1;
				}
				break;
			case L_BR:
				{
				alt29=2;
				}
				break;
			case CHAR:
			case ID:
			case NULL:
			case STRING:
				{
				alt29=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:280:4: expr_fun
					{
					pushFollow(FOLLOW_expr_fun_in_subexpr1820);
					expr_fun23=expr_fun();
					state._fsp--;

					retval.st = (expr_fun23!=null?((StringTemplate)expr_fun23.getTemplate()):null);
					}
					break;
				case 2 :
					// C:\\Users\\1\\Desktop\\String.g:281:4: L_BR expr R_BR
					{
					match(input,L_BR,FOLLOW_L_BR_in_subexpr1830); 
					pushFollow(FOLLOW_expr_in_subexpr1832);
					expr24=expr();
					state._fsp--;

					match(input,R_BR,FOLLOW_R_BR_in_subexpr1834); 
					retval.st = new StringTemplate("("+(expr24!=null?((StringTemplate)expr24.getTemplate()):null).toString()+")");
					}
					break;
				case 3 :
					// C:\\Users\\1\\Desktop\\String.g:282:4: var_value
					{
					pushFollow(FOLLOW_var_value_in_subexpr1842);
					var_value25=var_value();
					state._fsp--;

					retval.st = (var_value25!=null?((StringTemplate)var_value25.getTemplate()):null);
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subexpr"


	public static class expr_fun_return extends ParserRuleReturnScope {
		public String type;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr_fun"
	// C:\\Users\\1\\Desktop\\String.g:286:1: expr_fun returns [String type] : ( fun_print | fun_length | fun_empty );
	public final StringParser.expr_fun_return expr_fun() throws RecognitionException {
		StringParser.expr_fun_return retval = new StringParser.expr_fun_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope fun_print26 =null;
		ParserRuleReturnScope fun_length27 =null;
		ParserRuleReturnScope fun_empty28 =null;

		try {
			// C:\\Users\\1\\Desktop\\String.g:287:4: ( fun_print | fun_length | fun_empty )
			int alt30=3;
			switch ( input.LA(1) ) {
			case FUN_PRINT:
				{
				alt30=1;
				}
				break;
			case FUN_LENGTH:
				{
				alt30=2;
				}
				break;
			case FUN_EMPTY:
				{
				alt30=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:287:4: fun_print
					{
					pushFollow(FOLLOW_fun_print_in_expr_fun1863);
					fun_print26=fun_print();
					state._fsp--;

					retval.st = (fun_print26!=null?((StringTemplate)fun_print26.getTemplate()):null);
					}
					break;
				case 2 :
					// C:\\Users\\1\\Desktop\\String.g:288:6: fun_length
					{
					pushFollow(FOLLOW_fun_length_in_expr_fun1873);
					fun_length27=fun_length();
					state._fsp--;

					retval.st = (fun_length27!=null?((StringTemplate)fun_length27.getTemplate()):null);
					}
					break;
				case 3 :
					// C:\\Users\\1\\Desktop\\String.g:289:6: fun_empty
					{
					pushFollow(FOLLOW_fun_empty_in_expr_fun1883);
					fun_empty28=fun_empty();
					state._fsp--;

					retval.st = (fun_empty28!=null?((StringTemplate)fun_empty28.getTemplate()):null);
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_fun"


	public static class fun_length_return extends ParserRuleReturnScope {
		public String type;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "fun_length"
	// C:\\Users\\1\\Desktop\\String.g:292:1: fun_length returns [String type] : FUN_LENGTH L_BR var_value R_BR -> fun_length_template(f=$var_value.st);
	public final StringParser.fun_length_return fun_length() throws RecognitionException {
		StringParser.fun_length_return retval = new StringParser.fun_length_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope var_value29 =null;

		try {
			// C:\\Users\\1\\Desktop\\String.g:293:2: ( FUN_LENGTH L_BR var_value R_BR -> fun_length_template(f=$var_value.st))
			// C:\\Users\\1\\Desktop\\String.g:294:2: FUN_LENGTH L_BR var_value R_BR
			{
			match(input,FUN_LENGTH,FOLLOW_FUN_LENGTH_in_fun_length1902); 
			match(input,L_BR,FOLLOW_L_BR_in_fun_length1904); 
			pushFollow(FOLLOW_var_value_in_fun_length1906);
			var_value29=var_value();
			state._fsp--;

			match(input,R_BR,FOLLOW_R_BR_in_fun_length1908); 
			retval.type ="string";
			// TEMPLATE REWRITE
			// 295:2: -> fun_length_template(f=$var_value.st)
			{
				retval.st = templateLib.getInstanceOf("fun_length_template",new STAttrMap().put("f", (var_value29!=null?((StringTemplate)var_value29.getTemplate()):null)));
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fun_length"


	public static class fun_print_return extends ParserRuleReturnScope {
		public String type;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "fun_print"
	// C:\\Users\\1\\Desktop\\String.g:298:1: fun_print returns [String type] : FUN_PRINT L_BR expr R_BR -> fun_print_template(e=$expr.st);
	public final StringParser.fun_print_return fun_print() throws RecognitionException {
		StringParser.fun_print_return retval = new StringParser.fun_print_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope expr30 =null;

		try {
			// C:\\Users\\1\\Desktop\\String.g:298:33: ( FUN_PRINT L_BR expr R_BR -> fun_print_template(e=$expr.st))
			// C:\\Users\\1\\Desktop\\String.g:299:2: FUN_PRINT L_BR expr R_BR
			{
			match(input,FUN_PRINT,FOLLOW_FUN_PRINT_in_fun_print1937); 
			match(input,L_BR,FOLLOW_L_BR_in_fun_print1939); 
			pushFollow(FOLLOW_expr_in_fun_print1941);
			expr30=expr();
			state._fsp--;

			match(input,R_BR,FOLLOW_R_BR_in_fun_print1943); 
			retval.type ="void";
			// TEMPLATE REWRITE
			// 300:2: -> fun_print_template(e=$expr.st)
			{
				retval.st = templateLib.getInstanceOf("fun_print_template",new STAttrMap().put("e", (expr30!=null?((StringTemplate)expr30.getTemplate()):null)));
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fun_print"


	public static class fun_call_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "fun_call"
	// C:\\Users\\1\\Desktop\\String.g:303:1: fun_call : name_function= ID L_BR ( expr )? R_BR -> fun_call_template(id=$name_function.texte=$expr.st);
	public final StringParser.fun_call_return fun_call() throws RecognitionException {
		StringParser.fun_call_return retval = new StringParser.fun_call_return();
		retval.start = input.LT(1);

		Token name_function=null;
		ParserRuleReturnScope expr31 =null;

		try {
			// C:\\Users\\1\\Desktop\\String.g:303:10: (name_function= ID L_BR ( expr )? R_BR -> fun_call_template(id=$name_function.texte=$expr.st))
			// C:\\Users\\1\\Desktop\\String.g:304:2: name_function= ID L_BR ( expr )? R_BR
			{
			name_function=(Token)match(input,ID,FOLLOW_ID_in_fun_call1970); 
			match(input,L_BR,FOLLOW_L_BR_in_fun_call1972); 
			// C:\\Users\\1\\Desktop\\String.g:304:24: ( expr )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==CHAR||(LA31_0 >= FUN_EMPTY && LA31_0 <= FUN_PRINT)||LA31_0==ID||LA31_0==L_BR||LA31_0==NULL||LA31_0==STRING) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:304:25: expr
					{
					pushFollow(FOLLOW_expr_in_fun_call1975);
					expr31=expr();
					state._fsp--;

					}
					break;

			}

			match(input,R_BR,FOLLOW_R_BR_in_fun_call1979); 
			// TEMPLATE REWRITE
			// 305:2: -> fun_call_template(id=$name_function.texte=$expr.st)
			{
				retval.st = templateLib.getInstanceOf("fun_call_template",new STAttrMap().put("id", (name_function!=null?name_function.getText():null)).put("e", (expr31!=null?((StringTemplate)expr31.getTemplate()):null)));
			}



			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fun_call"


	public static class fun_empty_return extends ParserRuleReturnScope {
		public String type;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "fun_empty"
	// C:\\Users\\1\\Desktop\\String.g:308:1: fun_empty returns [String type] : FUN_EMPTY L_BR var_value R_BR -> fun_empty_template(e=$var_value.st);
	public final StringParser.fun_empty_return fun_empty() throws RecognitionException {
		StringParser.fun_empty_return retval = new StringParser.fun_empty_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope var_value32 =null;

		try {
			// C:\\Users\\1\\Desktop\\String.g:308:33: ( FUN_EMPTY L_BR var_value R_BR -> fun_empty_template(e=$var_value.st))
			// C:\\Users\\1\\Desktop\\String.g:309:2: FUN_EMPTY L_BR var_value R_BR
			{
			match(input,FUN_EMPTY,FOLLOW_FUN_EMPTY_in_fun_empty2013); 
			match(input,L_BR,FOLLOW_L_BR_in_fun_empty2015); 
			pushFollow(FOLLOW_var_value_in_fun_empty2017);
			var_value32=var_value();
			state._fsp--;

			match(input,R_BR,FOLLOW_R_BR_in_fun_empty2019); 
			retval.type ="bool";
			// TEMPLATE REWRITE
			// 310:2: -> fun_empty_template(e=$var_value.st)
			{
				retval.st = templateLib.getInstanceOf("fun_empty_template",new STAttrMap().put("e", (var_value32!=null?((StringTemplate)var_value32.getTemplate()):null)));
			}



			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fun_empty"


	public static class string_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "string"
	// C:\\Users\\1\\Desktop\\String.g:313:1: string : f= STRING -> string_template(f=$f.text);
	public final StringParser.string_return string() throws RecognitionException {
		StringParser.string_return retval = new StringParser.string_return();
		retval.start = input.LT(1);

		Token f=null;

		try {
			// C:\\Users\\1\\Desktop\\String.g:313:8: (f= STRING -> string_template(f=$f.text))
			// C:\\Users\\1\\Desktop\\String.g:314:2: f= STRING
			{
			f=(Token)match(input,STRING,FOLLOW_STRING_in_string2046); 
			// TEMPLATE REWRITE
			// 315:2: -> string_template(f=$f.text)
			{
				retval.st = templateLib.getInstanceOf("string_template",new STAttrMap().put("f", (f!=null?f.getText():null)));
			}



			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "string"


	public static class fun_char_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "fun_char"
	// C:\\Users\\1\\Desktop\\String.g:318:1: fun_char : f= CHAR -> char_template(f=$f.text);
	public final StringParser.fun_char_return fun_char() throws RecognitionException {
		StringParser.fun_char_return retval = new StringParser.fun_char_return();
		retval.start = input.LT(1);

		Token f=null;

		try {
			// C:\\Users\\1\\Desktop\\String.g:318:10: (f= CHAR -> char_template(f=$f.text))
			// C:\\Users\\1\\Desktop\\String.g:319:2: f= CHAR
			{
			f=(Token)match(input,CHAR,FOLLOW_CHAR_in_fun_char2068); 
			// TEMPLATE REWRITE
			// 320:2: -> char_template(f=$f.text)
			{
				retval.st = templateLib.getInstanceOf("char_template",new STAttrMap().put("f", (f!=null?f.getText():null)));
			}



			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fun_char"


	public static class bool_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "bool"
	// C:\\Users\\1\\Desktop\\String.g:323:1: bool : f= ID -> bool_template(f=$f.text);
	public final StringParser.bool_return bool() throws RecognitionException {
		StringParser.bool_return retval = new StringParser.bool_return();
		retval.start = input.LT(1);

		Token f=null;

		try {
			// C:\\Users\\1\\Desktop\\String.g:323:6: (f= ID -> bool_template(f=$f.text))
			// C:\\Users\\1\\Desktop\\String.g:324:2: f= ID
			{
			f=(Token)match(input,ID,FOLLOW_ID_in_bool2090); 
			// TEMPLATE REWRITE
			// 325:2: -> bool_template(f=$f.text)
			{
				retval.st = templateLib.getInstanceOf("bool_template",new STAttrMap().put("f", (f!=null?f.getText():null)));
			}



			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bool"

	// Delegated rules

	public static final BitSet FOLLOW_function_in_program910 = new BitSet(new long[]{0x0000000010200000L});
	public static final BitSet FOLLOW_MAIN_in_program916 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_L_BR_in_program918 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_R_BR_in_program920 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_L_FBR_in_program922 = new BitSet(new long[]{0x0000174000690800L});
	public static final BitSet FOLLOW_statement_in_program929 = new BitSet(new long[]{0x0000174000690800L});
	public static final BitSet FOLLOW_R_FBR_in_program933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_function966 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_L_BR_in_function968 = new BitSet(new long[]{0x0000001000200000L});
	public static final BitSet FOLLOW_params_in_function970 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_R_BR_in_function973 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_L_FBR_in_function975 = new BitSet(new long[]{0x0000174000690800L});
	public static final BitSet FOLLOW_statement_in_function982 = new BitSet(new long[]{0x0000174000690800L});
	public static final BitSet FOLLOW_R_FBR_in_function986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_define_in_statement1029 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_fun_print_in_statement1037 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_fun_call_in_statement1044 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_assign_in_statement1051 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DOT_COMMA_in_statement1059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stat_in_statement1065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_stat_in_statement1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_rule_in_statement1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeat_until_in_statement1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_params1100 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_params1104 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COMMA_in_params1107 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_params1111 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_params1115 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_FOR_in_for_rule1148 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_L_BR_in_for_rule1150 = new BitSet(new long[]{0x0000070000001000L});
	public static final BitSet FOLLOW_var_define_in_for_rule1158 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DOT_COMMA_in_for_rule1162 = new BitSet(new long[]{0x00000081822E1080L});
	public static final BitSet FOLLOW_log_expr_in_for_rule1165 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DOT_COMMA_in_for_rule1169 = new BitSet(new long[]{0x0000071000000000L});
	public static final BitSet FOLLOW_var_define_in_for_rule1174 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_R_BR_in_for_rule1178 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_L_FBR_in_for_rule1180 = new BitSet(new long[]{0x0000000000280000L});
	public static final BitSet FOLLOW_body_statement_in_for_rule1188 = new BitSet(new long[]{0x0000004000280000L});
	public static final BitSet FOLLOW_R_FBR_in_for_rule1192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_repeat_until1232 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_L_FBR_in_repeat_until1236 = new BitSet(new long[]{0x0000004000280000L});
	public static final BitSet FOLLOW_body_statement_in_repeat_until1243 = new BitSet(new long[]{0x0000004000280000L});
	public static final BitSet FOLLOW_R_FBR_in_repeat_until1248 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DO_WHILE_in_repeat_until1252 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_L_BR_in_repeat_until1254 = new BitSet(new long[]{0x00000081822E0080L});
	public static final BitSet FOLLOW_log_expr_in_repeat_until1257 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_R_BR_in_repeat_until1260 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DOT_COMMA_in_repeat_until1262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_body_statement1293 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_fun_print_in_body_statement1301 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DOT_COMMA_in_body_statement1308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_stat1319 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_L_BR_in_if_stat1321 = new BitSet(new long[]{0x00000081822E0080L});
	public static final BitSet FOLLOW_log_expr_in_if_stat1323 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_R_BR_in_if_stat1325 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_L_FBR_in_if_stat1327 = new BitSet(new long[]{0x0000000000280000L});
	public static final BitSet FOLLOW_body_statement_in_if_stat1332 = new BitSet(new long[]{0x0000004000280000L});
	public static final BitSet FOLLOW_R_FBR_in_if_stat1336 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_ELSE_in_if_stat1340 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_L_FBR_in_if_stat1342 = new BitSet(new long[]{0x0000000000280000L});
	public static final BitSet FOLLOW_body_statement_in_if_stat1347 = new BitSet(new long[]{0x0000004000280000L});
	public static final BitSet FOLLOW_R_FBR_in_if_stat1351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_stat1384 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_L_BR_in_while_stat1386 = new BitSet(new long[]{0x00000081822E0080L});
	public static final BitSet FOLLOW_log_expr_in_while_stat1388 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_R_BR_in_while_stat1390 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_L_FBR_in_while_stat1392 = new BitSet(new long[]{0x0000000000280000L});
	public static final BitSet FOLLOW_body_statement_in_while_stat1397 = new BitSet(new long[]{0x0000004000280000L});
	public static final BitSet FOLLOW_R_FBR_in_while_stat1401 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_DOT_COMMA_in_while_stat1403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sublog_expr_in_log_expr1439 = new BitSet(new long[]{0x0000000400000012L});
	public static final BitSet FOLLOW_AND_in_log_expr1451 = new BitSet(new long[]{0x00000081022E0080L});
	public static final BitSet FOLLOW_OR_in_log_expr1457 = new BitSet(new long[]{0x00000081022E0080L});
	public static final BitSet FOLLOW_sublog_expr_in_log_expr1468 = new BitSet(new long[]{0x0000000400000012L});
	public static final BitSet FOLLOW_NOT_in_log_expr1486 = new BitSet(new long[]{0x00000081022E0080L});
	public static final BitSet FOLLOW_sublog_expr_in_log_expr1490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_sublog_expr1516 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_LOG_SIGN_in_sublog_expr1525 = new BitSet(new long[]{0x00000081022E0080L});
	public static final BitSet FOLLOW_expr_in_sublog_expr1529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_in_expr1559 = new BitSet(new long[]{0x0000000820000002L});
	public static final BitSet FOLLOW_PLUS_in_expr1565 = new BitSet(new long[]{0x00000081022E0080L});
	public static final BitSet FOLLOW_MINUS_in_expr1569 = new BitSet(new long[]{0x00000081022E0080L});
	public static final BitSet FOLLOW_mult_in_expr1574 = new BitSet(new long[]{0x0000000820000002L});
	public static final BitSet FOLLOW_subexpr_in_mult1591 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_MULT_in_mult1596 = new BitSet(new long[]{0x00000081022E0080L});
	public static final BitSet FOLLOW_subexpr_in_mult1600 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_type_in_var_define1621 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_var_define1625 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_var_define1630 = new BitSet(new long[]{0x0000008100200080L});
	public static final BitSet FOLLOW_var_value_in_var_define1634 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COMMA_in_var_define1639 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_var_define1643 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_var_define1646 = new BitSet(new long[]{0x0000008100200080L});
	public static final BitSet FOLLOW_var_value_in_var_define1650 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_ID_in_assign1705 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assign1707 = new BitSet(new long[]{0x00000081022E0080L});
	public static final BitSet FOLLOW_expr_in_assign1709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_STRING_in_type1752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_CHAR_in_type1760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_BOOL_in_type1769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_var_value1784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_in_var_value1790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fun_char_in_var_value1797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_var_value1805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_fun_in_subexpr1820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_L_BR_in_subexpr1830 = new BitSet(new long[]{0x00000081022E0080L});
	public static final BitSet FOLLOW_expr_in_subexpr1832 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_R_BR_in_subexpr1834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_value_in_subexpr1842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fun_print_in_expr_fun1863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fun_length_in_expr_fun1873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fun_empty_in_expr_fun1883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_LENGTH_in_fun_length1902 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_L_BR_in_fun_length1904 = new BitSet(new long[]{0x0000008100200080L});
	public static final BitSet FOLLOW_var_value_in_fun_length1906 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_R_BR_in_fun_length1908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_PRINT_in_fun_print1937 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_L_BR_in_fun_print1939 = new BitSet(new long[]{0x00000081022E0080L});
	public static final BitSet FOLLOW_expr_in_fun_print1941 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_R_BR_in_fun_print1943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fun_call1970 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_L_BR_in_fun_call1972 = new BitSet(new long[]{0x00000091022E0080L});
	public static final BitSet FOLLOW_expr_in_fun_call1975 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_R_BR_in_fun_call1979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_EMPTY_in_fun_empty2013 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_L_BR_in_fun_empty2015 = new BitSet(new long[]{0x0000008100200080L});
	public static final BitSet FOLLOW_var_value_in_fun_empty2017 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_R_BR_in_fun_empty2019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_string2046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_fun_char2068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_bool2090 = new BitSet(new long[]{0x0000000000000002L});
}
