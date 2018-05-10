// $ANTLR 3.5.1 C:\\Users\\1\\Desktop\\String.g 2017-05-24 16:47:04
package by.bsuir.yapis.compiller.stringcompiller.grammar;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class StringLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public StringLexer() {} 
	public StringLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public StringLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\1\\Desktop\\String.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:11:5: ( 'and' )
			// C:\\Users\\1\\Desktop\\String.g:11:7: 'and'
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:12:8: ( '=' )
			// C:\\Users\\1\\Desktop\\String.g:12:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:13:7: ( ',' )
			// C:\\Users\\1\\Desktop\\String.g:13:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:14:5: ( '/' )
			// C:\\Users\\1\\Desktop\\String.g:14:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:15:4: ( 'repeat' )
			// C:\\Users\\1\\Desktop\\String.g:15:6: 'repeat'
			{
			match("repeat"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "DOT_COMMA"
	public final void mDOT_COMMA() throws RecognitionException {
		try {
			int _type = DOT_COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:16:11: ( ';' )
			// C:\\Users\\1\\Desktop\\String.g:16:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT_COMMA"

	// $ANTLR start "DO_WHILE"
	public final void mDO_WHILE() throws RecognitionException {
		try {
			int _type = DO_WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:17:10: ( 'until' )
			// C:\\Users\\1\\Desktop\\String.g:17:12: 'until'
			{
			match("until"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO_WHILE"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:18:6: ( 'else' )
			// C:\\Users\\1\\Desktop\\String.g:18:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:19:5: ( 'for' )
			// C:\\Users\\1\\Desktop\\String.g:19:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "FUN_EMPTY"
	public final void mFUN_EMPTY() throws RecognitionException {
		try {
			int _type = FUN_EMPTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:20:11: ( 'empty' )
			// C:\\Users\\1\\Desktop\\String.g:20:13: 'empty'
			{
			match("empty"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUN_EMPTY"

	// $ANTLR start "FUN_LENGTH"
	public final void mFUN_LENGTH() throws RecognitionException {
		try {
			int _type = FUN_LENGTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:21:12: ( 'length' )
			// C:\\Users\\1\\Desktop\\String.g:21:14: 'length'
			{
			match("length"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUN_LENGTH"

	// $ANTLR start "FUN_PRINT"
	public final void mFUN_PRINT() throws RecognitionException {
		try {
			int _type = FUN_PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:22:11: ( 'print' )
			// C:\\Users\\1\\Desktop\\String.g:22:13: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUN_PRINT"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:23:4: ( 'if' )
			// C:\\Users\\1\\Desktop\\String.g:23:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "KW"
	public final void mKW() throws RecognitionException {
		try {
			int _type = KW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:24:4: ( '\"' )
			// C:\\Users\\1\\Desktop\\String.g:24:6: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW"

	// $ANTLR start "L_BR"
	public final void mL_BR() throws RecognitionException {
		try {
			int _type = L_BR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:25:6: ( '(' )
			// C:\\Users\\1\\Desktop\\String.g:25:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L_BR"

	// $ANTLR start "L_CBR"
	public final void mL_CBR() throws RecognitionException {
		try {
			int _type = L_CBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:26:7: ( '[' )
			// C:\\Users\\1\\Desktop\\String.g:26:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L_CBR"

	// $ANTLR start "L_FBR"
	public final void mL_FBR() throws RecognitionException {
		try {
			int _type = L_FBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:27:7: ( '{' )
			// C:\\Users\\1\\Desktop\\String.g:27:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L_FBR"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:28:6: ( 'main' )
			// C:\\Users\\1\\Desktop\\String.g:28:8: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:29:7: ( '-' )
			// C:\\Users\\1\\Desktop\\String.g:29:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:30:6: ( '*' )
			// C:\\Users\\1\\Desktop\\String.g:30:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:31:5: ( 'not' )
			// C:\\Users\\1\\Desktop\\String.g:31:7: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:32:6: ( 'null' )
			// C:\\Users\\1\\Desktop\\String.g:32:8: 'null'
			{
			match("null"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULL"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:33:4: ( 'or' )
			// C:\\Users\\1\\Desktop\\String.g:33:6: 'or'
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:34:6: ( '+' )
			// C:\\Users\\1\\Desktop\\String.g:34:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "R_BR"
	public final void mR_BR() throws RecognitionException {
		try {
			int _type = R_BR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:35:6: ( ')' )
			// C:\\Users\\1\\Desktop\\String.g:35:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R_BR"

	// $ANTLR start "R_CBR"
	public final void mR_CBR() throws RecognitionException {
		try {
			int _type = R_CBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:36:7: ( ']' )
			// C:\\Users\\1\\Desktop\\String.g:36:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R_CBR"

	// $ANTLR start "R_FBR"
	public final void mR_FBR() throws RecognitionException {
		try {
			int _type = R_FBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:37:7: ( '}' )
			// C:\\Users\\1\\Desktop\\String.g:37:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R_FBR"

	// $ANTLR start "TYPE_BOOL"
	public final void mTYPE_BOOL() throws RecognitionException {
		try {
			int _type = TYPE_BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:38:11: ( 'bool' )
			// C:\\Users\\1\\Desktop\\String.g:38:13: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_BOOL"

	// $ANTLR start "TYPE_CHAR"
	public final void mTYPE_CHAR() throws RecognitionException {
		try {
			int _type = TYPE_CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:39:11: ( 'char' )
			// C:\\Users\\1\\Desktop\\String.g:39:13: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_CHAR"

	// $ANTLR start "TYPE_STRING"
	public final void mTYPE_STRING() throws RecognitionException {
		try {
			int _type = TYPE_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:40:13: ( 'string' )
			// C:\\Users\\1\\Desktop\\String.g:40:15: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_STRING"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:41:7: ( 'while' )
			// C:\\Users\\1\\Desktop\\String.g:41:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "CH"
	public final void mCH() throws RecognitionException {
		try {
			// C:\\Users\\1\\Desktop\\String.g:64:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// C:\\Users\\1\\Desktop\\String.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CH"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:65:5: ( ( CH ) ( CH | '0' .. '9' )* )
			// C:\\Users\\1\\Desktop\\String.g:65:7: ( CH ) ( CH | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\1\\Desktop\\String.g:65:12: ( CH | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "LOG_SIGN"
	public final void mLOG_SIGN() throws RecognitionException {
		try {
			int _type = LOG_SIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:67:10: ( '<' | '>' | '==' | '!=' )
			int alt2=4;
			switch ( input.LA(1) ) {
			case '<':
				{
				alt2=1;
				}
				break;
			case '>':
				{
				alt2=2;
				}
				break;
			case '=':
				{
				alt2=3;
				}
				break;
			case '!':
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:67:12: '<'
					{
					match('<'); 
					}
					break;
				case 2 :
					// C:\\Users\\1\\Desktop\\String.g:67:16: '>'
					{
					match('>'); 
					}
					break;
				case 3 :
					// C:\\Users\\1\\Desktop\\String.g:67:20: '=='
					{
					match("=="); 

					}
					break;
				case 4 :
					// C:\\Users\\1\\Desktop\\String.g:67:25: '!='
					{
					match("!="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOG_SIGN"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:70:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='/') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='/') ) {
					alt6=1;
				}
				else if ( (LA6_1=='*') ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:70:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\1\\Desktop\\String.g:70:14: (~ ( '\\n' | '\\r' ) )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\1\\Desktop\\String.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					// C:\\Users\\1\\Desktop\\String.g:70:28: ( '\\r' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='\r') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\1\\Desktop\\String.g:70:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\1\\Desktop\\String.g:71:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\1\\Desktop\\String.g:71:14: ( options {greedy=false; } : . )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='*') ) {
							int LA5_1 = input.LA(2);
							if ( (LA5_1=='/') ) {
								alt5=2;
							}
							else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
								alt5=1;
							}

						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\1\\Desktop\\String.g:71:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop5;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:74:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\1\\Desktop\\String.g:74:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:82:5: ( '\"' ( options {greedy=false; } : . )* '\"' )
			// C:\\Users\\1\\Desktop\\String.g:82:7: '\"' ( options {greedy=false; } : . )* '\"'
			{
			match('\"'); 
			// C:\\Users\\1\\Desktop\\String.g:82:11: ( options {greedy=false; } : . )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\"') ) {
					alt7=2;
				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:82:39: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop7;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\1\\Desktop\\String.g:84:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\1\\Desktop\\String.g:84:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\1\\Desktop\\String.g:84:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\\') ) {
				alt8=1;
			}
			else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '&')||(LA8_0 >= '(' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:84:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\1\\Desktop\\String.g:84:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\1\\Desktop\\String.g:88:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\1\\Desktop\\String.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\1\\Desktop\\String.g:92:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\\') ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1=='\"'||LA9_1=='\''||LA9_1=='\\'||LA9_1=='b'||LA9_1=='f'||LA9_1=='n'||LA9_1=='r'||LA9_1=='t') ) {
					alt9=1;
				}
				else if ( (LA9_1=='u') ) {
					alt9=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:92:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\1\\Desktop\\String.g:93:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\1\\Desktop\\String.g:99:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt10=3;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\\') ) {
				int LA10_1 = input.LA(2);
				if ( ((LA10_1 >= '0' && LA10_1 <= '3')) ) {
					int LA10_2 = input.LA(3);
					if ( ((LA10_2 >= '0' && LA10_2 <= '7')) ) {
						int LA10_4 = input.LA(4);
						if ( ((LA10_4 >= '0' && LA10_4 <= '7')) ) {
							alt10=1;
						}

						else {
							alt10=2;
						}

					}

					else {
						alt10=3;
					}

				}
				else if ( ((LA10_1 >= '4' && LA10_1 <= '7')) ) {
					int LA10_3 = input.LA(3);
					if ( ((LA10_3 >= '0' && LA10_3 <= '7')) ) {
						alt10=2;
					}

					else {
						alt10=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\1\\Desktop\\String.g:99:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\1\\Desktop\\String.g:100:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\1\\Desktop\\String.g:101:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\1\\Desktop\\String.g:106:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\1\\Desktop\\String.g:106:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\1\\Desktop\\String.g:1:8: ( AND | ASSIGN | COMMA | DIV | DO | DOT_COMMA | DO_WHILE | ELSE | FOR | FUN_EMPTY | FUN_LENGTH | FUN_PRINT | IF | KW | L_BR | L_CBR | L_FBR | MAIN | MINUS | MULT | NOT | NULL | OR | PLUS | R_BR | R_CBR | R_FBR | TYPE_BOOL | TYPE_CHAR | TYPE_STRING | WHILE | ID | LOG_SIGN | COMMENT | WS | STRING | CHAR )
		int alt11=37;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// C:\\Users\\1\\Desktop\\String.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// C:\\Users\\1\\Desktop\\String.g:1:14: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 3 :
				// C:\\Users\\1\\Desktop\\String.g:1:21: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 4 :
				// C:\\Users\\1\\Desktop\\String.g:1:27: DIV
				{
				mDIV(); 

				}
				break;
			case 5 :
				// C:\\Users\\1\\Desktop\\String.g:1:31: DO
				{
				mDO(); 

				}
				break;
			case 6 :
				// C:\\Users\\1\\Desktop\\String.g:1:34: DOT_COMMA
				{
				mDOT_COMMA(); 

				}
				break;
			case 7 :
				// C:\\Users\\1\\Desktop\\String.g:1:44: DO_WHILE
				{
				mDO_WHILE(); 

				}
				break;
			case 8 :
				// C:\\Users\\1\\Desktop\\String.g:1:53: ELSE
				{
				mELSE(); 

				}
				break;
			case 9 :
				// C:\\Users\\1\\Desktop\\String.g:1:58: FOR
				{
				mFOR(); 

				}
				break;
			case 10 :
				// C:\\Users\\1\\Desktop\\String.g:1:62: FUN_EMPTY
				{
				mFUN_EMPTY(); 

				}
				break;
			case 11 :
				// C:\\Users\\1\\Desktop\\String.g:1:72: FUN_LENGTH
				{
				mFUN_LENGTH(); 

				}
				break;
			case 12 :
				// C:\\Users\\1\\Desktop\\String.g:1:83: FUN_PRINT
				{
				mFUN_PRINT(); 

				}
				break;
			case 13 :
				// C:\\Users\\1\\Desktop\\String.g:1:93: IF
				{
				mIF(); 

				}
				break;
			case 14 :
				// C:\\Users\\1\\Desktop\\String.g:1:96: KW
				{
				mKW(); 

				}
				break;
			case 15 :
				// C:\\Users\\1\\Desktop\\String.g:1:99: L_BR
				{
				mL_BR(); 

				}
				break;
			case 16 :
				// C:\\Users\\1\\Desktop\\String.g:1:104: L_CBR
				{
				mL_CBR(); 

				}
				break;
			case 17 :
				// C:\\Users\\1\\Desktop\\String.g:1:110: L_FBR
				{
				mL_FBR(); 

				}
				break;
			case 18 :
				// C:\\Users\\1\\Desktop\\String.g:1:116: MAIN
				{
				mMAIN(); 

				}
				break;
			case 19 :
				// C:\\Users\\1\\Desktop\\String.g:1:121: MINUS
				{
				mMINUS(); 

				}
				break;
			case 20 :
				// C:\\Users\\1\\Desktop\\String.g:1:127: MULT
				{
				mMULT(); 

				}
				break;
			case 21 :
				// C:\\Users\\1\\Desktop\\String.g:1:132: NOT
				{
				mNOT(); 

				}
				break;
			case 22 :
				// C:\\Users\\1\\Desktop\\String.g:1:136: NULL
				{
				mNULL(); 

				}
				break;
			case 23 :
				// C:\\Users\\1\\Desktop\\String.g:1:141: OR
				{
				mOR(); 

				}
				break;
			case 24 :
				// C:\\Users\\1\\Desktop\\String.g:1:144: PLUS
				{
				mPLUS(); 

				}
				break;
			case 25 :
				// C:\\Users\\1\\Desktop\\String.g:1:149: R_BR
				{
				mR_BR(); 

				}
				break;
			case 26 :
				// C:\\Users\\1\\Desktop\\String.g:1:154: R_CBR
				{
				mR_CBR(); 

				}
				break;
			case 27 :
				// C:\\Users\\1\\Desktop\\String.g:1:160: R_FBR
				{
				mR_FBR(); 

				}
				break;
			case 28 :
				// C:\\Users\\1\\Desktop\\String.g:1:166: TYPE_BOOL
				{
				mTYPE_BOOL(); 

				}
				break;
			case 29 :
				// C:\\Users\\1\\Desktop\\String.g:1:176: TYPE_CHAR
				{
				mTYPE_CHAR(); 

				}
				break;
			case 30 :
				// C:\\Users\\1\\Desktop\\String.g:1:186: TYPE_STRING
				{
				mTYPE_STRING(); 

				}
				break;
			case 31 :
				// C:\\Users\\1\\Desktop\\String.g:1:198: WHILE
				{
				mWHILE(); 

				}
				break;
			case 32 :
				// C:\\Users\\1\\Desktop\\String.g:1:204: ID
				{
				mID(); 

				}
				break;
			case 33 :
				// C:\\Users\\1\\Desktop\\String.g:1:207: LOG_SIGN
				{
				mLOG_SIGN(); 

				}
				break;
			case 34 :
				// C:\\Users\\1\\Desktop\\String.g:1:216: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 35 :
				// C:\\Users\\1\\Desktop\\String.g:1:224: WS
				{
				mWS(); 

				}
				break;
			case 36 :
				// C:\\Users\\1\\Desktop\\String.g:1:227: STRING
				{
				mSTRING(); 

				}
				break;
			case 37 :
				// C:\\Users\\1\\Desktop\\String.g:1:234: CHAR
				{
				mCHAR(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\1\uffff\1\36\1\43\1\uffff\1\45\1\36\1\uffff\6\36\1\56\3\uffff\1\36\2"+
		"\uffff\2\36\4\uffff\4\36\4\uffff\1\36\3\uffff\7\36\1\100\2\uffff\3\36"+
		"\1\104\4\36\1\111\4\36\1\116\2\36\1\uffff\1\36\1\122\1\36\1\uffff\4\36"+
		"\1\uffff\2\36\1\132\1\36\1\uffff\2\36\1\136\1\uffff\1\137\1\140\1\141"+
		"\3\36\1\145\1\uffff\1\146\1\36\1\150\4\uffff\1\36\1\152\1\153\2\uffff"+
		"\1\154\1\uffff\1\155\4\uffff";
	static final String DFA11_eofS =
		"\156\uffff";
	static final String DFA11_minS =
		"\1\11\1\156\1\75\1\uffff\1\52\1\145\1\uffff\1\156\1\154\1\157\1\145\1"+
		"\162\1\146\1\0\3\uffff\1\141\2\uffff\1\157\1\162\4\uffff\1\157\1\150\1"+
		"\164\1\150\4\uffff\1\144\3\uffff\1\160\1\164\1\163\1\160\1\162\1\156\1"+
		"\151\1\60\2\uffff\1\151\1\164\1\154\1\60\1\157\1\141\1\162\1\151\1\60"+
		"\1\145\1\151\1\145\1\164\1\60\1\147\1\156\1\uffff\1\156\1\60\1\154\1\uffff"+
		"\1\154\1\162\1\151\1\154\1\uffff\1\141\1\154\1\60\1\171\1\uffff\2\164"+
		"\1\60\1\uffff\3\60\1\156\1\145\1\164\1\60\1\uffff\1\60\1\150\1\60\4\uffff"+
		"\1\147\2\60\2\uffff\1\60\1\uffff\1\60\4\uffff";
	static final String DFA11_maxS =
		"\1\175\1\156\1\75\1\uffff\1\57\1\145\1\uffff\1\156\1\155\1\157\1\145\1"+
		"\162\1\146\1\uffff\3\uffff\1\141\2\uffff\1\165\1\162\4\uffff\1\157\1\150"+
		"\1\164\1\150\4\uffff\1\144\3\uffff\1\160\1\164\1\163\1\160\1\162\1\156"+
		"\1\151\1\172\2\uffff\1\151\1\164\1\154\1\172\1\157\1\141\1\162\1\151\1"+
		"\172\1\145\1\151\1\145\1\164\1\172\1\147\1\156\1\uffff\1\156\1\172\1\154"+
		"\1\uffff\1\154\1\162\1\151\1\154\1\uffff\1\141\1\154\1\172\1\171\1\uffff"+
		"\2\164\1\172\1\uffff\3\172\1\156\1\145\1\164\1\172\1\uffff\1\172\1\150"+
		"\1\172\4\uffff\1\147\2\172\2\uffff\1\172\1\uffff\1\172\4\uffff";
	static final String DFA11_acceptS =
		"\3\uffff\1\3\2\uffff\1\6\7\uffff\1\17\1\20\1\21\1\uffff\1\23\1\24\2\uffff"+
		"\1\30\1\31\1\32\1\33\4\uffff\1\40\1\41\1\43\1\45\1\uffff\1\2\1\42\1\4"+
		"\10\uffff\1\16\1\44\20\uffff\1\15\3\uffff\1\27\4\uffff\1\1\4\uffff\1\11"+
		"\3\uffff\1\25\7\uffff\1\10\3\uffff\1\22\1\26\1\34\1\35\3\uffff\1\7\1\12"+
		"\1\uffff\1\14\1\uffff\1\37\1\5\1\13\1\36";
	static final String DFA11_specialS =
		"\15\uffff\1\0\140\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\40\2\uffff\1\40\22\uffff\1\40\1\37\1\15\4\uffff\1\41\1\16\1\27\1\23"+
			"\1\26\1\3\1\22\1\uffff\1\4\13\uffff\1\6\1\37\1\2\1\37\2\uffff\32\36\1"+
			"\17\1\uffff\1\30\1\uffff\1\36\1\uffff\1\1\1\32\1\33\1\36\1\10\1\11\2"+
			"\36\1\14\2\36\1\12\1\21\1\24\1\25\1\13\1\36\1\5\1\34\1\36\1\7\1\36\1"+
			"\35\3\36\1\20\1\uffff\1\31",
			"\1\42",
			"\1\37",
			"",
			"\1\44\4\uffff\1\44",
			"\1\46",
			"",
			"\1\47",
			"\1\50\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\0\57",
			"",
			"",
			"",
			"\1\60",
			"",
			"",
			"\1\61\5\uffff\1\62",
			"\1\63",
			"",
			"",
			"",
			"",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"",
			"",
			"",
			"",
			"\1\70",
			"",
			"",
			"",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"",
			"\1\101",
			"\1\102",
			"\1\103",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\117",
			"\1\120",
			"",
			"\1\121",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\123",
			"",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"",
			"\1\130",
			"\1\131",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\133",
			"",
			"\1\134",
			"\1\135",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\142",
			"\1\143",
			"\1\144",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\147",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"",
			"",
			"",
			"\1\151",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | ASSIGN | COMMA | DIV | DO | DOT_COMMA | DO_WHILE | ELSE | FOR | FUN_EMPTY | FUN_LENGTH | FUN_PRINT | IF | KW | L_BR | L_CBR | L_FBR | MAIN | MINUS | MULT | NOT | NULL | OR | PLUS | R_BR | R_CBR | R_FBR | TYPE_BOOL | TYPE_CHAR | TYPE_STRING | WHILE | ID | LOG_SIGN | COMMENT | WS | STRING | CHAR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA11_13 = input.LA(1);
						s = -1;
						if ( ((LA11_13 >= '\u0000' && LA11_13 <= '\uFFFF')) ) {s = 47;}
						else s = 46;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 11, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
