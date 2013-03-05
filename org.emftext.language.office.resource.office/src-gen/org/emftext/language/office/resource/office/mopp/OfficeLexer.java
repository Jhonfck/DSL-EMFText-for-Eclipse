// $ANTLR 3.4

	package org.emftext.language.office.resource.office.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class OfficeLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int COMMENT=4;
    public static final int FLOAT=5;
    public static final int INTEGER=6;
    public static final int LINEBREAK=7;
    public static final int TEXT=8;
    public static final int WHITESPACE=9;

    	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public OfficeLexer() {} 
    public OfficeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public OfficeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Office.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Office.g:15:7: ( ',' )
            // Office.g:15:9: ','
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Office.g:16:7: ( 'employee' )
            // Office.g:16:9: 'employee'
            {
            match("employee"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Office.g:17:7: ( 'in' )
            // Office.g:17:9: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Office.g:18:7: ( 'office' )
            // Office.g:18:9: 'office'
            {
            match("office"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Office.g:19:7: ( 'officemodel' )
            // Office.g:19:9: 'officemodel'
            {
            match("officemodel"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Office.g:20:7: ( 'with' )
            // Office.g:20:9: 'with'
            {
            match("with"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Office.g:21:7: ( 'works' )
            // Office.g:21:9: 'works'
            {
            match("works"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Office.g:22:7: ( '{' )
            // Office.g:22:9: '{'
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Office.g:23:7: ( '}' )
            // Office.g:23:9: '}'
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
    // $ANTLR end "T__18"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Office.g:965:8: ( ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Office.g:966:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Office.g:966:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Office.g:966:3: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 



            // Office.g:966:7: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Office.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFE') ) {
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
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Office.g:969:8: ( ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) )
            // Office.g:970:2: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            {
            // Office.g:970:2: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-'||(LA4_0 >= '1' && LA4_0 <= '9')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='0') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Office.g:970:3: ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // Office.g:970:3: ( '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // Office.g:970:4: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }


                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // Office.g:970:19: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Office.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
                    } while (true);


                    }
                    break;
                case 2 :
                    // Office.g:970:31: '0'
                    {
                    match('0'); 

                    }
                    break;

            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Office.g:973:6: ( ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ ) )
            // Office.g:974:2: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            {
            // Office.g:974:2: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            // Office.g:974:3: ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+
            {
            // Office.g:974:3: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Office.g:974:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // Office.g:974:9: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0 >= '1' && LA7_0 <= '9')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='0') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // Office.g:974:10: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // Office.g:974:21: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // Office.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Office.g:974:35: '0'
                    {
                    match('0'); 

                    }
                    break;

            }


            match('.'); 

            // Office.g:974:44: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Office.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Office.g:977:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Office.g:978:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Office.g:978:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Office.g:978:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Office.g:978:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='-'||(LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Office.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Office.g:980:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Office.g:981:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Office.g:984:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Office.g:985:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Office.g:985:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Office.g:985:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Office.g:985:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\r') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='\n') ) {
                    alt10=1;
                }
                else {
                    alt10=2;
                }
            }
            else if ( (LA10_0=='\n') ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // Office.g:985:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Office.g:985:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Office.g:985:20: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINEBREAK"

    public void mTokens() throws RecognitionException {
        // Office.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | COMMENT | INTEGER | FLOAT | TEXT | WHITESPACE | LINEBREAK )
        int alt11=15;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // Office.g:1:10: T__10
                {
                mT__10(); 


                }
                break;
            case 2 :
                // Office.g:1:16: T__11
                {
                mT__11(); 


                }
                break;
            case 3 :
                // Office.g:1:22: T__12
                {
                mT__12(); 


                }
                break;
            case 4 :
                // Office.g:1:28: T__13
                {
                mT__13(); 


                }
                break;
            case 5 :
                // Office.g:1:34: T__14
                {
                mT__14(); 


                }
                break;
            case 6 :
                // Office.g:1:40: T__15
                {
                mT__15(); 


                }
                break;
            case 7 :
                // Office.g:1:46: T__16
                {
                mT__16(); 


                }
                break;
            case 8 :
                // Office.g:1:52: T__17
                {
                mT__17(); 


                }
                break;
            case 9 :
                // Office.g:1:58: T__18
                {
                mT__18(); 


                }
                break;
            case 10 :
                // Office.g:1:64: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 11 :
                // Office.g:1:72: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 12 :
                // Office.g:1:80: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 13 :
                // Office.g:1:86: TEXT
                {
                mTEXT(); 


                }
                break;
            case 14 :
                // Office.g:1:91: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 15 :
                // Office.g:1:102: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\2\uffff\4\14\3\uffff\1\14\2\26\3\uffff\1\14\1\31\4\14\1\26\2\uffff"+
        "\1\14\1\uffff\5\14\1\43\3\14\1\uffff\1\47\1\14\1\52\1\uffff\2\14"+
        "\1\uffff\1\55\1\14\1\uffff\2\14\1\61\1\uffff";
    static final String DFA11_eofS =
        "\62\uffff";
    static final String DFA11_minS =
        "\1\11\1\uffff\1\155\1\156\1\146\1\151\3\uffff\1\60\2\55\3\uffff"+
        "\1\160\1\55\1\146\1\164\1\162\1\56\1\55\2\uffff\1\154\1\uffff\1"+
        "\151\1\150\1\153\1\157\1\143\1\55\1\163\1\171\1\145\1\uffff\1\55"+
        "\1\145\1\55\1\uffff\1\145\1\157\1\uffff\1\55\1\144\1\uffff\1\145"+
        "\1\154\1\55\1\uffff";
    static final String DFA11_maxS =
        "\1\175\1\uffff\1\155\1\156\1\146\1\157\3\uffff\1\71\2\172\3\uffff"+
        "\1\160\1\172\1\146\1\164\1\162\1\56\1\172\2\uffff\1\154\1\uffff"+
        "\1\151\1\150\1\153\1\157\1\143\1\172\1\163\1\171\1\145\1\uffff\1"+
        "\172\1\145\1\172\1\uffff\1\145\1\157\1\uffff\1\172\1\144\1\uffff"+
        "\1\145\1\154\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\4\uffff\1\10\1\11\1\12\3\uffff\1\15\1\16\1\17\7\uffff"+
        "\1\13\1\14\1\uffff\1\3\11\uffff\1\6\3\uffff\1\7\2\uffff\1\4\2\uffff"+
        "\1\2\3\uffff\1\5";
    static final String DFA11_specialS =
        "\62\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\15\1\16\1\uffff\1\15\1\16\22\uffff\1\15\13\uffff\1\1\1\11"+
            "\1\uffff\1\10\1\13\11\12\7\uffff\32\14\4\uffff\1\14\1\uffff"+
            "\4\14\1\2\3\14\1\3\5\14\1\4\7\14\1\5\3\14\1\6\1\uffff\1\7",
            "",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22\5\uffff\1\23",
            "",
            "",
            "",
            "\1\24\11\12",
            "\1\14\1\27\1\uffff\12\25\7\uffff\32\14\4\uffff\1\14\1\uffff"+
            "\32\14",
            "\1\14\1\27\1\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff"+
            "\32\14",
            "",
            "",
            "",
            "\1\30",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\27",
            "\1\14\1\27\1\uffff\12\25\7\uffff\32\14\4\uffff\1\14\1\uffff"+
            "\32\14",
            "",
            "",
            "\1\35",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\50",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\14\14"+
            "\1\51\15\14",
            "",
            "\1\53",
            "\1\54",
            "",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\56",
            "",
            "\1\57",
            "\1\60",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
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

    class DFA11 extends DFA {

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
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | COMMENT | INTEGER | FLOAT | TEXT | WHITESPACE | LINEBREAK );";
        }
    }
 

}