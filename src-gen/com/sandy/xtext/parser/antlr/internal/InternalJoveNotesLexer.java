package com.sandy.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJoveNotesLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_BOOL=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalJoveNotesLexer() {;} 
    public InternalJoveNotesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJoveNotesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalJoveNotes.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:11:7: ( '@skip_generation' )
            // InternalJoveNotes.g:11:9: '@skip_generation'
            {
            match("@skip_generation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:12:7: ( '@skip_generation_in_production' )
            // InternalJoveNotes.g:12:9: '@skip_generation_in_production'
            {
            match("@skip_generation_in_production"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:13:7: ( '@exercise_bank' )
            // InternalJoveNotes.g:13:9: '@exercise_bank'
            {
            match("@exercise_bank"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:14:7: ( 'subject' )
            // InternalJoveNotes.g:14:9: 'subject'
            {
            match("subject"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:15:7: ( 'chapterNumber' )
            // InternalJoveNotes.g:15:9: 'chapterNumber'
            {
            match("chapterNumber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:16:7: ( '.' )
            // InternalJoveNotes.g:16:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:17:7: ( 'chapterName' )
            // InternalJoveNotes.g:17:9: 'chapterName'
            {
            match("chapterName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:18:7: ( '@wm' )
            // InternalJoveNotes.g:18:9: '@wm'
            {
            match("@wm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:19:7: ( 'hide' )
            // InternalJoveNotes.g:19:9: 'hide'
            {
            match("hide"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:20:7: ( '@qa' )
            // InternalJoveNotes.g:20:9: '@qa'
            {
            match("@qa"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:21:7: ( '@fib' )
            // InternalJoveNotes.g:21:9: '@fib'
            {
            match("@fib"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:22:7: ( '@definition' )
            // InternalJoveNotes.g:22:9: '@definition'
            {
            match("@definition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:23:7: ( '@character' )
            // InternalJoveNotes.g:23:9: '@character'
            {
            match("@character"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:24:7: ( '@tn' )
            // InternalJoveNotes.g:24:9: '@tn'
            {
            match("@tn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:25:7: ( '@match' )
            // InternalJoveNotes.g:25:9: '@match'
            {
            match("@match"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:26:7: ( 'skip_reverse_question' )
            // InternalJoveNotes.g:26:9: 'skip_reverse_question'
            {
            match("skip_reverse_question"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:27:7: ( '{' )
            // InternalJoveNotes.g:27:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:28:7: ( '}' )
            // InternalJoveNotes.g:28:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:29:7: ( '=' )
            // InternalJoveNotes.g:29:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:30:7: ( '@mcq_config' )
            // InternalJoveNotes.g:30:9: '@mcq_config'
            {
            match("@mcq_config"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:31:7: ( '@forwardCaption' )
            // InternalJoveNotes.g:31:9: '@forwardCaption'
            {
            match("@forwardCaption"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:32:7: ( '@reverseCaption' )
            // InternalJoveNotes.g:32:9: '@reverseCaption'
            {
            match("@reverseCaption"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:33:7: ( '@numOptionsToShow' )
            // InternalJoveNotes.g:33:9: '@numOptionsToShow'
            {
            match("@numOptionsToShow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:34:7: ( '@numOptionsPerRow' )
            // InternalJoveNotes.g:34:9: '@numOptionsPerRow'
            {
            match("@numOptionsPerRow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:35:7: ( '@event' )
            // InternalJoveNotes.g:35:9: '@event'
            {
            match("@event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:36:7: ( '@true_false' )
            // InternalJoveNotes.g:36:9: '@true_false'
            {
            match("@true_false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:37:7: ( '@chem_equation' )
            // InternalJoveNotes.g:37:9: '@chem_equation'
            {
            match("@chem_equation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:38:7: ( '>' )
            // InternalJoveNotes.g:38:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:39:7: ( '@chem_compound' )
            // InternalJoveNotes.g:39:9: '@chem_compound'
            {
            match("@chem_compound"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:40:7: ( '@spellbee' )
            // InternalJoveNotes.g:40:9: '@spellbee'
            {
            match("@spellbee"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:41:7: ( '@image_label' )
            // InternalJoveNotes.g:41:9: '@image_label'
            {
            match("@image_label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:42:7: ( 'imageName' )
            // InternalJoveNotes.g:42:9: 'imageName'
            {
            match("imageName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:43:7: ( ',' )
            // InternalJoveNotes.g:43:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:44:7: ( '@equation' )
            // InternalJoveNotes.g:44:9: '@equation'
            {
            match("@equation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:45:7: ( 'where' )
            // InternalJoveNotes.g:45:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:46:7: ( '@rtc' )
            // InternalJoveNotes.g:46:9: '@rtc'
            {
            match("@rtc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:47:7: ( 'context' )
            // InternalJoveNotes.g:47:9: 'context'
            {
            match("context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:48:7: ( '@multi_choice' )
            // InternalJoveNotes.g:48:9: '@multi_choice'
            {
            match("@multi_choice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:49:7: ( '@options' )
            // InternalJoveNotes.g:49:9: '@options'
            {
            match("@options"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:50:7: ( '@explanation' )
            // InternalJoveNotes.g:50:9: '@explanation'
            {
            match("@explanation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:51:7: ( '@exercise' )
            // InternalJoveNotes.g:51:9: '@exercise'
            {
            match("@exercise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:52:7: ( 'marks' )
            // InternalJoveNotes.g:52:9: 'marks'
            {
            match("marks"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:53:7: ( 'hints' )
            // InternalJoveNotes.g:53:9: 'hints'
            {
            match("hints"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:54:7: ( 'answer' )
            // InternalJoveNotes.g:54:9: 'answer'
            {
            match("answer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:55:7: ( '@voice2text' )
            // InternalJoveNotes.g:55:9: '@voice2text'
            {
            match("@voice2text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:56:7: ( '@compiler_break' )
            // InternalJoveNotes.g:56:9: '@compiler_break'
            {
            match("@compiler_break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:57:7: ( '@section' )
            // InternalJoveNotes.g:57:9: '@section'
            {
            match("@section"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:58:7: ( 'correct' )
            // InternalJoveNotes.g:58:9: 'correct'
            {
            match("correct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:59:7: ( 'cmap' )
            // InternalJoveNotes.g:59:9: 'cmap'
            {
            match("cmap"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:60:7: ( 'script_expressions' )
            // InternalJoveNotes.g:60:9: 'script_expressions'
            {
            match("script_expressions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:61:7: ( 'script' )
            // InternalJoveNotes.g:61:9: 'script'
            {
            match("script"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:3281:11: ( ( 'true' | 'false' ) )
            // InternalJoveNotes.g:3281:13: ( 'true' | 'false' )
            {
            // InternalJoveNotes.g:3281:13: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalJoveNotes.g:3281:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalJoveNotes.g:3281:21: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:3283:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalJoveNotes.g:3283:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalJoveNotes.g:3283:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalJoveNotes.g:3283:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalJoveNotes.g:3283:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJoveNotes.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:3285:10: ( ( '0' .. '9' )+ )
            // InternalJoveNotes.g:3285:12: ( '0' .. '9' )+
            {
            // InternalJoveNotes.g:3285:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalJoveNotes.g:3285:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:3287:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalJoveNotes.g:3287:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalJoveNotes.g:3287:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalJoveNotes.g:3287:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalJoveNotes.g:3287:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalJoveNotes.g:3287:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJoveNotes.g:3287:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalJoveNotes.g:3287:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalJoveNotes.g:3287:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalJoveNotes.g:3287:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJoveNotes.g:3287:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:3289:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalJoveNotes.g:3289:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalJoveNotes.g:3289:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJoveNotes.g:3289:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:3291:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalJoveNotes.g:3291:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalJoveNotes.g:3291:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalJoveNotes.g:3291:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalJoveNotes.g:3291:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJoveNotes.g:3291:41: ( '\\r' )? '\\n'
                    {
                    // InternalJoveNotes.g:3291:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalJoveNotes.g:3291:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:3293:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalJoveNotes.g:3293:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalJoveNotes.g:3293:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJoveNotes.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJoveNotes.g:3295:16: ( . )
            // InternalJoveNotes.g:3295:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalJoveNotes.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | RULE_BOOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=59;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalJoveNotes.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalJoveNotes.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalJoveNotes.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalJoveNotes.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalJoveNotes.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalJoveNotes.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalJoveNotes.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalJoveNotes.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalJoveNotes.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalJoveNotes.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalJoveNotes.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalJoveNotes.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalJoveNotes.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalJoveNotes.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalJoveNotes.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalJoveNotes.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalJoveNotes.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalJoveNotes.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalJoveNotes.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalJoveNotes.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalJoveNotes.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalJoveNotes.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalJoveNotes.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalJoveNotes.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalJoveNotes.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalJoveNotes.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalJoveNotes.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalJoveNotes.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalJoveNotes.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalJoveNotes.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalJoveNotes.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalJoveNotes.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalJoveNotes.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalJoveNotes.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalJoveNotes.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalJoveNotes.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalJoveNotes.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalJoveNotes.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalJoveNotes.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalJoveNotes.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalJoveNotes.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalJoveNotes.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalJoveNotes.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalJoveNotes.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalJoveNotes.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalJoveNotes.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalJoveNotes.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalJoveNotes.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalJoveNotes.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // InternalJoveNotes.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // InternalJoveNotes.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // InternalJoveNotes.g:1:316: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 53 :
                // InternalJoveNotes.g:1:326: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 54 :
                // InternalJoveNotes.g:1:334: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 55 :
                // InternalJoveNotes.g:1:343: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 56 :
                // InternalJoveNotes.g:1:355: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 57 :
                // InternalJoveNotes.g:1:371: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 58 :
                // InternalJoveNotes.g:1:387: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 59 :
                // InternalJoveNotes.g:1:395: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\30\2\52\1\uffff\1\52\4\uffff\1\52\1\uffff\5\52\1\30\2\uffff\3\30\20\uffff\3\52\1\uffff\3\52\1\uffff\1\52\4\uffff\1\52\1\uffff\5\52\27\uffff\17\52\6\uffff\6\52\1\u0080\1\u0081\5\52\1\u0087\1\52\4\uffff\6\52\2\uffff\1\u0093\1\52\1\u0095\1\u0096\1\52\1\uffff\1\u0087\4\uffff\2\52\1\u00a0\3\52\1\uffff\1\52\2\uffff\1\u00a5\5\uffff\1\u00a9\2\52\1\uffff\1\52\1\u00ad\1\u00ae\1\52\5\uffff\3\52\2\uffff\1\52\1\uffff\1\u00ba\1\uffff\4\52\1\u00c0\4\uffff\4\52\3\uffff\3\52\1\u00cd\3\uffff\3\52\2\uffff\2\52\1\u00d5\1\uffff\2\52\2\uffff\2\52\1\u00dd\2\52\2\uffff\3\52\1\u00e3\1\52\1\uffff\1\52\1\u00e6\1\uffff";
    static final String DFA13_eofS =
        "\u00e7\uffff";
    static final String DFA13_minS =
        "\1\0\2\143\1\150\1\uffff\1\151\4\uffff\1\155\1\uffff\1\150\1\141\1\156\1\162\1\141\1\101\2\uffff\2\0\1\52\2\uffff\1\145\1\161\2\uffff\1\151\1\uffff\1\150\1\156\1\141\1\145\1\165\3\uffff\1\142\1\151\1\162\1\uffff\1\141\1\156\1\141\1\uffff\1\144\4\uffff\1\141\1\uffff\1\145\1\162\1\163\1\165\1\154\5\uffff\1\151\2\uffff\1\145\4\uffff\1\141\10\uffff\1\155\1\152\1\160\1\151\1\160\1\164\1\162\1\160\1\145\1\164\1\147\1\162\1\153\1\167\1\145\1\163\1\160\1\162\2\uffff\1\155\1\117\1\145\1\137\1\160\1\164\2\145\2\60\1\163\2\145\1\163\1\145\1\60\1\145\1\137\1\143\1\137\1\160\1\143\1\162\1\164\1\145\1\170\1\143\2\uffff\1\60\1\116\2\60\1\162\1\uffff\1\60\1\147\1\151\1\143\2\164\1\145\1\60\1\162\2\164\1\uffff\1\141\2\uffff\1\60\1\145\1\163\2\uffff\1\151\1\60\1\166\1\145\1\uffff\1\116\2\60\1\155\1\uffff\1\156\1\145\1\157\1\uffff\1\145\1\170\1\141\2\uffff\2\145\1\137\1\156\1\162\1\160\2\155\1\60\1\162\2\uffff\2\163\1\162\1\142\1\145\1\uffff\1\141\1\120\3\145\1\60\1\164\2\uffff\1\137\1\163\1\162\1\uffff\1\151\1\161\1\163\1\60\1\157\1\165\1\151\1\uffff\1\156\1\145\1\157\1\137\1\163\1\156\2\uffff\1\164\1\163\1\151\1\60\1\157\1\uffff\1\156\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\167\1\165\1\157\1\uffff\1\151\4\uffff\1\155\1\uffff\1\150\1\141\1\156\1\162\1\141\1\172\2\uffff\2\uffff\1\57\2\uffff\1\160\1\170\2\uffff\1\157\1\uffff\1\157\1\162\1\165\1\164\1\165\3\uffff\1\142\1\151\1\162\1\uffff\1\141\1\162\1\141\1\uffff\1\156\4\uffff\1\141\1\uffff\1\145\1\162\1\163\1\165\1\154\5\uffff\1\151\2\uffff\1\160\4\uffff\1\145\10\uffff\1\155\1\152\1\160\1\151\1\160\1\164\1\162\1\160\1\145\1\164\1\147\1\162\1\153\1\167\1\145\1\163\1\160\1\162\2\uffff\1\155\1\117\1\145\1\137\1\160\1\164\2\145\2\172\1\163\2\145\1\163\1\145\1\172\1\145\1\137\1\143\1\137\1\160\1\143\1\162\1\164\1\145\1\170\1\143\2\uffff\1\172\1\116\2\172\1\162\1\uffff\1\172\1\147\1\151\1\145\2\164\1\145\1\172\1\162\2\164\1\uffff\1\141\2\uffff\1\172\1\145\1\163\2\uffff\1\151\1\172\1\166\1\145\1\uffff\1\116\2\172\1\155\1\uffff\1\156\1\145\1\157\1\uffff\1\145\1\170\1\165\2\uffff\2\145\1\137\1\156\1\162\1\160\2\155\1\172\1\162\2\uffff\2\163\1\162\1\142\1\145\1\uffff\1\141\1\124\3\145\1\172\1\164\2\uffff\1\137\1\163\1\162\1\uffff\1\151\1\161\1\163\1\172\1\157\1\165\1\151\1\uffff\1\156\1\145\1\157\1\137\1\163\1\156\2\uffff\1\164\1\163\1\151\1\172\1\157\1\uffff\1\156\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\6\1\uffff\1\21\1\22\1\23\1\34\1\uffff\1\41\6\uffff\1\65\1\66\3\uffff\1\72\1\73\2\uffff\1\10\1\12\1\uffff\1\14\5\uffff\1\37\1\47\1\55\3\uffff\1\65\3\uffff\1\6\1\uffff\1\21\1\22\1\23\1\34\1\uffff\1\41\5\uffff\1\66\1\67\1\70\1\71\1\72\1\uffff\1\36\1\57\1\uffff\1\31\1\42\1\13\1\25\1\uffff\1\56\1\16\1\32\1\17\1\24\1\46\1\26\1\44\22\uffff\1\50\1\15\33\uffff\1\61\1\11\5\uffff\1\64\13\uffff\1\53\1\uffff\1\43\1\52\3\uffff\1\33\1\35\4\uffff\1\63\4\uffff\1\54\3\uffff\1\4\3\uffff\1\45\1\60\12\uffff\1\3\1\51\5\uffff\1\40\7\uffff\1\27\1\30\3\uffff\1\7\7\uffff\1\5\6\uffff\1\2\1\1\5\uffff\1\62\2\uffff\1\20";
    static final String DFA13_specialS =
        "\1\0\23\uffff\1\1\1\2\u00d1\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\24\4\30\1\25\4\30\1\13\1\30\1\4\1\26\12\23\3\30\1\10\1\11\1\30\1\1\32\22\3\30\1\21\1\22\1\30\1\16\1\22\1\3\2\22\1\20\1\22\1\5\1\12\3\22\1\15\5\22\1\2\1\17\2\22\1\14\3\22\1\6\1\30\1\7\uff82\30",
            "\1\37\1\36\1\32\1\35\2\uffff\1\44\3\uffff\1\41\1\43\1\45\1\uffff\1\34\1\42\1\31\1\40\1\uffff\1\46\1\33",
            "\1\51\7\uffff\1\50\11\uffff\1\47",
            "\1\53\4\uffff\1\55\1\uffff\1\54",
            "",
            "\1\57",
            "",
            "",
            "",
            "",
            "\1\64",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\0\74",
            "\0\74",
            "\1\75\4\uffff\1\76",
            "",
            "",
            "\1\102\5\uffff\1\100\4\uffff\1\101",
            "\1\105\4\uffff\1\104\1\uffff\1\103",
            "",
            "",
            "\1\106\5\uffff\1\107",
            "",
            "\1\110\6\uffff\1\111",
            "\1\112\3\uffff\1\113",
            "\1\114\1\uffff\1\115\21\uffff\1\116",
            "\1\117\16\uffff\1\120",
            "\1\121",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "\1\125",
            "\1\126\3\uffff\1\127",
            "\1\130",
            "",
            "\1\131\11\uffff\1\132",
            "",
            "",
            "",
            "",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "",
            "",
            "\1\142\12\uffff\1\143",
            "",
            "",
            "",
            "",
            "\1\144\3\uffff\1\145",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0094",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0097",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0098",
            "\1\u0099",
            "\1\u009b\1\uffff\1\u009a",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\52\7\uffff\32\52\4\uffff\1\u009f\1\uffff\32\52",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "",
            "\1\u00a8",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\1\u00ac",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b6\23\uffff\1\u00b5",
            "",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c1",
            "",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c9\3\uffff\1\u00c8",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ce",
            "",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00de",
            "\1\u00df",
            "",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | RULE_BOOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='@') ) {s = 1;}

                        else if ( (LA13_0=='s') ) {s = 2;}

                        else if ( (LA13_0=='c') ) {s = 3;}

                        else if ( (LA13_0=='.') ) {s = 4;}

                        else if ( (LA13_0=='h') ) {s = 5;}

                        else if ( (LA13_0=='{') ) {s = 6;}

                        else if ( (LA13_0=='}') ) {s = 7;}

                        else if ( (LA13_0=='=') ) {s = 8;}

                        else if ( (LA13_0=='>') ) {s = 9;}

                        else if ( (LA13_0=='i') ) {s = 10;}

                        else if ( (LA13_0==',') ) {s = 11;}

                        else if ( (LA13_0=='w') ) {s = 12;}

                        else if ( (LA13_0=='m') ) {s = 13;}

                        else if ( (LA13_0=='a') ) {s = 14;}

                        else if ( (LA13_0=='t') ) {s = 15;}

                        else if ( (LA13_0=='f') ) {s = 16;}

                        else if ( (LA13_0=='^') ) {s = 17;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||(LA13_0>='d' && LA13_0<='e')||LA13_0=='g'||(LA13_0>='j' && LA13_0<='l')||(LA13_0>='n' && LA13_0<='r')||(LA13_0>='u' && LA13_0<='v')||(LA13_0>='x' && LA13_0<='z')) ) {s = 18;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 19;}

                        else if ( (LA13_0=='\"') ) {s = 20;}

                        else if ( (LA13_0=='\'') ) {s = 21;}

                        else if ( (LA13_0=='/') ) {s = 22;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 23;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||LA13_0=='-'||(LA13_0>=':' && LA13_0<='<')||LA13_0=='?'||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_20 = input.LA(1);

                        s = -1;
                        if ( ((LA13_20>='\u0000' && LA13_20<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_21 = input.LA(1);

                        s = -1;
                        if ( ((LA13_21>='\u0000' && LA13_21<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}