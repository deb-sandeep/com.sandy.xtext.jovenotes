package com.sandy.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.sandy.xtext.services.JoveNotesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJoveNotesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@skip_generation'", "'@skip_generation_in_production'", "'@exercise_bank'", "'subject'", "'chapterNumber'", "'.'", "'chapterName'", "'@wm'", "'hide'", "'@qa'", "'@fib'", "'@definition'", "'@character'", "'@tn'", "'@match'", "'skip_reverse_question'", "'{'", "'}'", "'='", "'@mcq_config'", "'@forwardCaption'", "'@reverseCaption'", "'@numOptionsToShow'", "'@numOptionsPerRow'", "'@event'", "'@true_false'", "'@chem_equation'", "'>'", "'@chem_compound'", "'@spellbee'", "'@image_label'", "'imageName'", "','", "'@equation'", "'where'", "'@rtc'", "'context'", "'@multi_choice'", "'@options'", "'@explanation'", "'@exercise'", "'marks'", "'hints'", "'answer'", "'correct'", "'cmap'", "'script_expressions'", "'script'"
    };
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


        public InternalJoveNotesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJoveNotesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJoveNotesParser.tokenNames; }
    public String getGrammarFileName() { return "../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g"; }



     	private JoveNotesGrammarAccess grammarAccess;
     	
        public InternalJoveNotesParser(TokenStream input, JoveNotesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "JoveNotes";	
       	}
       	
       	@Override
       	protected JoveNotesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleJoveNotes"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:67:1: entryRuleJoveNotes returns [EObject current=null] : iv_ruleJoveNotes= ruleJoveNotes EOF ;
    public final EObject entryRuleJoveNotes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoveNotes = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:68:2: (iv_ruleJoveNotes= ruleJoveNotes EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:69:2: iv_ruleJoveNotes= ruleJoveNotes EOF
            {
             newCompositeNode(grammarAccess.getJoveNotesRule()); 
            pushFollow(FOLLOW_ruleJoveNotes_in_entryRuleJoveNotes75);
            iv_ruleJoveNotes=ruleJoveNotes();

            state._fsp--;

             current =iv_ruleJoveNotes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoveNotes85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoveNotes"


    // $ANTLR start "ruleJoveNotes"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:76:1: ruleJoveNotes returns [EObject current=null] : ( ( (lv_processingHints_0_0= ruleProcessingHints ) ) ( (lv_chapterDetails_1_0= ruleChapterDetails ) ) ( (lv_notesElements_2_0= ruleNotesElement ) )* ) ;
    public final EObject ruleJoveNotes() throws RecognitionException {
        EObject current = null;

        EObject lv_processingHints_0_0 = null;

        EObject lv_chapterDetails_1_0 = null;

        EObject lv_notesElements_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:79:28: ( ( ( (lv_processingHints_0_0= ruleProcessingHints ) ) ( (lv_chapterDetails_1_0= ruleChapterDetails ) ) ( (lv_notesElements_2_0= ruleNotesElement ) )* ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:80:1: ( ( (lv_processingHints_0_0= ruleProcessingHints ) ) ( (lv_chapterDetails_1_0= ruleChapterDetails ) ) ( (lv_notesElements_2_0= ruleNotesElement ) )* )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:80:1: ( ( (lv_processingHints_0_0= ruleProcessingHints ) ) ( (lv_chapterDetails_1_0= ruleChapterDetails ) ) ( (lv_notesElements_2_0= ruleNotesElement ) )* )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:80:2: ( (lv_processingHints_0_0= ruleProcessingHints ) ) ( (lv_chapterDetails_1_0= ruleChapterDetails ) ) ( (lv_notesElements_2_0= ruleNotesElement ) )*
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:80:2: ( (lv_processingHints_0_0= ruleProcessingHints ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:81:1: (lv_processingHints_0_0= ruleProcessingHints )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:81:1: (lv_processingHints_0_0= ruleProcessingHints )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:82:3: lv_processingHints_0_0= ruleProcessingHints
            {
             
            	        newCompositeNode(grammarAccess.getJoveNotesAccess().getProcessingHintsProcessingHintsParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleProcessingHints_in_ruleJoveNotes131);
            lv_processingHints_0_0=ruleProcessingHints();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoveNotesRule());
            	        }
                   		set(
                   			current, 
                   			"processingHints",
                    		lv_processingHints_0_0, 
                    		"ProcessingHints");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:98:2: ( (lv_chapterDetails_1_0= ruleChapterDetails ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:99:1: (lv_chapterDetails_1_0= ruleChapterDetails )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:99:1: (lv_chapterDetails_1_0= ruleChapterDetails )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:100:3: lv_chapterDetails_1_0= ruleChapterDetails
            {
             
            	        newCompositeNode(grammarAccess.getJoveNotesAccess().getChapterDetailsChapterDetailsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleChapterDetails_in_ruleJoveNotes152);
            lv_chapterDetails_1_0=ruleChapterDetails();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoveNotesRule());
            	        }
                   		set(
                   			current, 
                   			"chapterDetails",
                    		lv_chapterDetails_1_0, 
                    		"ChapterDetails");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:116:2: ( (lv_notesElements_2_0= ruleNotesElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19||(LA1_0>=21 && LA1_0<=26)||(LA1_0>=36 && LA1_0<=38)||(LA1_0>=40 && LA1_0<=42)||LA1_0==45||LA1_0==47||LA1_0==49||LA1_0==52) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:117:1: (lv_notesElements_2_0= ruleNotesElement )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:117:1: (lv_notesElements_2_0= ruleNotesElement )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:118:3: lv_notesElements_2_0= ruleNotesElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJoveNotesAccess().getNotesElementsNotesElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNotesElement_in_ruleJoveNotes173);
            	    lv_notesElements_2_0=ruleNotesElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJoveNotesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"notesElements",
            	            		lv_notesElements_2_0, 
            	            		"NotesElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoveNotes"


    // $ANTLR start "entryRuleProcessingHints"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:142:1: entryRuleProcessingHints returns [EObject current=null] : iv_ruleProcessingHints= ruleProcessingHints EOF ;
    public final EObject entryRuleProcessingHints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessingHints = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:143:2: (iv_ruleProcessingHints= ruleProcessingHints EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:144:2: iv_ruleProcessingHints= ruleProcessingHints EOF
            {
             newCompositeNode(grammarAccess.getProcessingHintsRule()); 
            pushFollow(FOLLOW_ruleProcessingHints_in_entryRuleProcessingHints210);
            iv_ruleProcessingHints=ruleProcessingHints();

            state._fsp--;

             current =iv_ruleProcessingHints; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessingHints220); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessingHints"


    // $ANTLR start "ruleProcessingHints"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:151:1: ruleProcessingHints returns [EObject current=null] : ( () ( (lv_skipGeneration_1_0= '@skip_generation' ) )? ( (lv_skipGenerationInProduction_2_0= '@skip_generation_in_production' ) )? ) ;
    public final EObject ruleProcessingHints() throws RecognitionException {
        EObject current = null;

        Token lv_skipGeneration_1_0=null;
        Token lv_skipGenerationInProduction_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:154:28: ( ( () ( (lv_skipGeneration_1_0= '@skip_generation' ) )? ( (lv_skipGenerationInProduction_2_0= '@skip_generation_in_production' ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:155:1: ( () ( (lv_skipGeneration_1_0= '@skip_generation' ) )? ( (lv_skipGenerationInProduction_2_0= '@skip_generation_in_production' ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:155:1: ( () ( (lv_skipGeneration_1_0= '@skip_generation' ) )? ( (lv_skipGenerationInProduction_2_0= '@skip_generation_in_production' ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:155:2: () ( (lv_skipGeneration_1_0= '@skip_generation' ) )? ( (lv_skipGenerationInProduction_2_0= '@skip_generation_in_production' ) )?
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:155:2: ()
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:156:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProcessingHintsAccess().getProcessingHintsAction_0(),
                        current);
                

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:161:2: ( (lv_skipGeneration_1_0= '@skip_generation' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:162:1: (lv_skipGeneration_1_0= '@skip_generation' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:162:1: (lv_skipGeneration_1_0= '@skip_generation' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:163:3: lv_skipGeneration_1_0= '@skip_generation'
                    {
                    lv_skipGeneration_1_0=(Token)match(input,12,FOLLOW_12_in_ruleProcessingHints272); 

                            newLeafNode(lv_skipGeneration_1_0, grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProcessingHintsRule());
                    	        }
                           		setWithLastConsumed(current, "skipGeneration", lv_skipGeneration_1_0, "@skip_generation");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:176:3: ( (lv_skipGenerationInProduction_2_0= '@skip_generation_in_production' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:177:1: (lv_skipGenerationInProduction_2_0= '@skip_generation_in_production' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:177:1: (lv_skipGenerationInProduction_2_0= '@skip_generation_in_production' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:178:3: lv_skipGenerationInProduction_2_0= '@skip_generation_in_production'
                    {
                    lv_skipGenerationInProduction_2_0=(Token)match(input,13,FOLLOW_13_in_ruleProcessingHints304); 

                            newLeafNode(lv_skipGenerationInProduction_2_0, grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionSkip_generation_in_productionKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProcessingHintsRule());
                    	        }
                           		setWithLastConsumed(current, "skipGenerationInProduction", lv_skipGenerationInProduction_2_0, "@skip_generation_in_production");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessingHints"


    // $ANTLR start "entryRuleChapterDetails"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:199:1: entryRuleChapterDetails returns [EObject current=null] : iv_ruleChapterDetails= ruleChapterDetails EOF ;
    public final EObject entryRuleChapterDetails() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapterDetails = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:200:2: (iv_ruleChapterDetails= ruleChapterDetails EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:201:2: iv_ruleChapterDetails= ruleChapterDetails EOF
            {
             newCompositeNode(grammarAccess.getChapterDetailsRule()); 
            pushFollow(FOLLOW_ruleChapterDetails_in_entryRuleChapterDetails354);
            iv_ruleChapterDetails=ruleChapterDetails();

            state._fsp--;

             current =iv_ruleChapterDetails; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChapterDetails364); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChapterDetails"


    // $ANTLR start "ruleChapterDetails"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:208:1: ruleChapterDetails returns [EObject current=null] : ( ( (lv_exerciseBank_0_0= '@exercise_bank' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ( (lv_scriptBody_9_0= ruleScriptBody ) )? ) ;
    public final EObject ruleChapterDetails() throws RecognitionException {
        EObject current = null;

        Token lv_exerciseBank_0_0=null;
        Token otherlv_1=null;
        Token lv_subjectName_2_0=null;
        Token otherlv_3=null;
        Token lv_chapterNumber_4_0=null;
        Token otherlv_5=null;
        Token lv_subChapterNumber_6_0=null;
        Token otherlv_7=null;
        Token lv_chapterName_8_0=null;
        EObject lv_scriptBody_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:211:28: ( ( ( (lv_exerciseBank_0_0= '@exercise_bank' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ( (lv_scriptBody_9_0= ruleScriptBody ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:212:1: ( ( (lv_exerciseBank_0_0= '@exercise_bank' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ( (lv_scriptBody_9_0= ruleScriptBody ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:212:1: ( ( (lv_exerciseBank_0_0= '@exercise_bank' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ( (lv_scriptBody_9_0= ruleScriptBody ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:212:2: ( (lv_exerciseBank_0_0= '@exercise_bank' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ( (lv_scriptBody_9_0= ruleScriptBody ) )?
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:212:2: ( (lv_exerciseBank_0_0= '@exercise_bank' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:213:1: (lv_exerciseBank_0_0= '@exercise_bank' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:213:1: (lv_exerciseBank_0_0= '@exercise_bank' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:214:3: lv_exerciseBank_0_0= '@exercise_bank'
                    {
                    lv_exerciseBank_0_0=(Token)match(input,14,FOLLOW_14_in_ruleChapterDetails407); 

                            newLeafNode(lv_exerciseBank_0_0, grammarAccess.getChapterDetailsAccess().getExerciseBankExercise_bankKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChapterDetailsRule());
                    	        }
                           		setWithLastConsumed(current, "exerciseBank", lv_exerciseBank_0_0, "@exercise_bank");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleChapterDetails433); 

                	newLeafNode(otherlv_1, grammarAccess.getChapterDetailsAccess().getSubjectKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:231:1: ( (lv_subjectName_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:232:1: (lv_subjectName_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:232:1: (lv_subjectName_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:233:3: lv_subjectName_2_0= RULE_STRING
            {
            lv_subjectName_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChapterDetails450); 

            			newLeafNode(lv_subjectName_2_0, grammarAccess.getChapterDetailsAccess().getSubjectNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChapterDetailsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"subjectName",
                    		lv_subjectName_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleChapterDetails467); 

                	newLeafNode(otherlv_3, grammarAccess.getChapterDetailsAccess().getChapterNumberKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:253:1: ( (lv_chapterNumber_4_0= RULE_INT ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:254:1: (lv_chapterNumber_4_0= RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:254:1: (lv_chapterNumber_4_0= RULE_INT )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:255:3: lv_chapterNumber_4_0= RULE_INT
            {
            lv_chapterNumber_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleChapterDetails484); 

            			newLeafNode(lv_chapterNumber_4_0, grammarAccess.getChapterDetailsAccess().getChapterNumberINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChapterDetailsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"chapterNumber",
                    		lv_chapterNumber_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleChapterDetails501); 

                	newLeafNode(otherlv_5, grammarAccess.getChapterDetailsAccess().getFullStopKeyword_5());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:275:1: ( (lv_subChapterNumber_6_0= RULE_INT ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:276:1: (lv_subChapterNumber_6_0= RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:276:1: (lv_subChapterNumber_6_0= RULE_INT )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:277:3: lv_subChapterNumber_6_0= RULE_INT
            {
            lv_subChapterNumber_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleChapterDetails518); 

            			newLeafNode(lv_subChapterNumber_6_0, grammarAccess.getChapterDetailsAccess().getSubChapterNumberINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChapterDetailsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"subChapterNumber",
                    		lv_subChapterNumber_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleChapterDetails535); 

                	newLeafNode(otherlv_7, grammarAccess.getChapterDetailsAccess().getChapterNameKeyword_7());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:297:1: ( (lv_chapterName_8_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:298:1: (lv_chapterName_8_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:298:1: (lv_chapterName_8_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:299:3: lv_chapterName_8_0= RULE_STRING
            {
            lv_chapterName_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChapterDetails552); 

            			newLeafNode(lv_chapterName_8_0, grammarAccess.getChapterDetailsAccess().getChapterNameSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChapterDetailsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"chapterName",
                    		lv_chapterName_8_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:315:2: ( (lv_scriptBody_9_0= ruleScriptBody ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==59) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:316:1: (lv_scriptBody_9_0= ruleScriptBody )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:316:1: (lv_scriptBody_9_0= ruleScriptBody )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:317:3: lv_scriptBody_9_0= ruleScriptBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getChapterDetailsAccess().getScriptBodyScriptBodyParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScriptBody_in_ruleChapterDetails578);
                    lv_scriptBody_9_0=ruleScriptBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChapterDetailsRule());
                    	        }
                           		set(
                           			current, 
                           			"scriptBody",
                            		lv_scriptBody_9_0, 
                            		"ScriptBody");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChapterDetails"


    // $ANTLR start "entryRuleNotesElement"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:341:1: entryRuleNotesElement returns [EObject current=null] : iv_ruleNotesElement= ruleNotesElement EOF ;
    public final EObject entryRuleNotesElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotesElement = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:342:2: (iv_ruleNotesElement= ruleNotesElement EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:343:2: iv_ruleNotesElement= ruleNotesElement EOF
            {
             newCompositeNode(grammarAccess.getNotesElementRule()); 
            pushFollow(FOLLOW_ruleNotesElement_in_entryRuleNotesElement615);
            iv_ruleNotesElement=ruleNotesElement();

            state._fsp--;

             current =iv_ruleNotesElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotesElement625); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotesElement"


    // $ANTLR start "ruleNotesElement"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:350:1: ruleNotesElement returns [EObject current=null] : ( (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice | this_Exercise_16= ruleExercise ) ( (lv_script_17_0= ruleScript ) )? ) ;
    public final EObject ruleNotesElement() throws RecognitionException {
        EObject current = null;

        EObject this_WordMeaning_0 = null;

        EObject this_QuestionAnswer_1 = null;

        EObject this_FIB_2 = null;

        EObject this_Definition_3 = null;

        EObject this_Character_4 = null;

        EObject this_TeacherNote_5 = null;

        EObject this_Matching_6 = null;

        EObject this_Event_7 = null;

        EObject this_TrueFalse_8 = null;

        EObject this_ChemEquation_9 = null;

        EObject this_ChemCompound_10 = null;

        EObject this_Spellbee_11 = null;

        EObject this_ImageLabel_12 = null;

        EObject this_Equation_13 = null;

        EObject this_RefToContext_14 = null;

        EObject this_MultiChoice_15 = null;

        EObject this_Exercise_16 = null;

        EObject lv_script_17_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:353:28: ( ( (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice | this_Exercise_16= ruleExercise ) ( (lv_script_17_0= ruleScript ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:354:1: ( (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice | this_Exercise_16= ruleExercise ) ( (lv_script_17_0= ruleScript ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:354:1: ( (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice | this_Exercise_16= ruleExercise ) ( (lv_script_17_0= ruleScript ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:354:2: (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice | this_Exercise_16= ruleExercise ) ( (lv_script_17_0= ruleScript ) )?
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:354:2: (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice | this_Exercise_16= ruleExercise )
            int alt6=17;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            case 24:
                {
                alt6=5;
                }
                break;
            case 25:
                {
                alt6=6;
                }
                break;
            case 26:
                {
                alt6=7;
                }
                break;
            case 36:
                {
                alt6=8;
                }
                break;
            case 37:
                {
                alt6=9;
                }
                break;
            case 38:
                {
                alt6=10;
                }
                break;
            case 40:
                {
                alt6=11;
                }
                break;
            case 41:
                {
                alt6=12;
                }
                break;
            case 42:
                {
                alt6=13;
                }
                break;
            case 45:
                {
                alt6=14;
                }
                break;
            case 47:
                {
                alt6=15;
                }
                break;
            case 49:
                {
                alt6=16;
                }
                break;
            case 52:
                {
                alt6=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:355:5: this_WordMeaning_0= ruleWordMeaning
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getWordMeaningParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleWordMeaning_in_ruleNotesElement673);
                    this_WordMeaning_0=ruleWordMeaning();

                    state._fsp--;

                     
                            current = this_WordMeaning_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:365:5: this_QuestionAnswer_1= ruleQuestionAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getQuestionAnswerParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleQuestionAnswer_in_ruleNotesElement700);
                    this_QuestionAnswer_1=ruleQuestionAnswer();

                    state._fsp--;

                     
                            current = this_QuestionAnswer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:375:5: this_FIB_2= ruleFIB
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getFIBParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleFIB_in_ruleNotesElement727);
                    this_FIB_2=ruleFIB();

                    state._fsp--;

                     
                            current = this_FIB_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:385:5: this_Definition_3= ruleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getDefinitionParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleDefinition_in_ruleNotesElement754);
                    this_Definition_3=ruleDefinition();

                    state._fsp--;

                     
                            current = this_Definition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:395:5: this_Character_4= ruleCharacter
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getCharacterParserRuleCall_0_4()); 
                        
                    pushFollow(FOLLOW_ruleCharacter_in_ruleNotesElement781);
                    this_Character_4=ruleCharacter();

                    state._fsp--;

                     
                            current = this_Character_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:405:5: this_TeacherNote_5= ruleTeacherNote
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getTeacherNoteParserRuleCall_0_5()); 
                        
                    pushFollow(FOLLOW_ruleTeacherNote_in_ruleNotesElement808);
                    this_TeacherNote_5=ruleTeacherNote();

                    state._fsp--;

                     
                            current = this_TeacherNote_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:415:5: this_Matching_6= ruleMatching
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getMatchingParserRuleCall_0_6()); 
                        
                    pushFollow(FOLLOW_ruleMatching_in_ruleNotesElement835);
                    this_Matching_6=ruleMatching();

                    state._fsp--;

                     
                            current = this_Matching_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:425:5: this_Event_7= ruleEvent
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getEventParserRuleCall_0_7()); 
                        
                    pushFollow(FOLLOW_ruleEvent_in_ruleNotesElement862);
                    this_Event_7=ruleEvent();

                    state._fsp--;

                     
                            current = this_Event_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:435:5: this_TrueFalse_8= ruleTrueFalse
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getTrueFalseParserRuleCall_0_8()); 
                        
                    pushFollow(FOLLOW_ruleTrueFalse_in_ruleNotesElement889);
                    this_TrueFalse_8=ruleTrueFalse();

                    state._fsp--;

                     
                            current = this_TrueFalse_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:445:5: this_ChemEquation_9= ruleChemEquation
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getChemEquationParserRuleCall_0_9()); 
                        
                    pushFollow(FOLLOW_ruleChemEquation_in_ruleNotesElement916);
                    this_ChemEquation_9=ruleChemEquation();

                    state._fsp--;

                     
                            current = this_ChemEquation_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:455:5: this_ChemCompound_10= ruleChemCompound
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getChemCompoundParserRuleCall_0_10()); 
                        
                    pushFollow(FOLLOW_ruleChemCompound_in_ruleNotesElement943);
                    this_ChemCompound_10=ruleChemCompound();

                    state._fsp--;

                     
                            current = this_ChemCompound_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:465:5: this_Spellbee_11= ruleSpellbee
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getSpellbeeParserRuleCall_0_11()); 
                        
                    pushFollow(FOLLOW_ruleSpellbee_in_ruleNotesElement970);
                    this_Spellbee_11=ruleSpellbee();

                    state._fsp--;

                     
                            current = this_Spellbee_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:475:5: this_ImageLabel_12= ruleImageLabel
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getImageLabelParserRuleCall_0_12()); 
                        
                    pushFollow(FOLLOW_ruleImageLabel_in_ruleNotesElement997);
                    this_ImageLabel_12=ruleImageLabel();

                    state._fsp--;

                     
                            current = this_ImageLabel_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:485:5: this_Equation_13= ruleEquation
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getEquationParserRuleCall_0_13()); 
                        
                    pushFollow(FOLLOW_ruleEquation_in_ruleNotesElement1024);
                    this_Equation_13=ruleEquation();

                    state._fsp--;

                     
                            current = this_Equation_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:495:5: this_RefToContext_14= ruleRefToContext
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getRefToContextParserRuleCall_0_14()); 
                        
                    pushFollow(FOLLOW_ruleRefToContext_in_ruleNotesElement1051);
                    this_RefToContext_14=ruleRefToContext();

                    state._fsp--;

                     
                            current = this_RefToContext_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:505:5: this_MultiChoice_15= ruleMultiChoice
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getMultiChoiceParserRuleCall_0_15()); 
                        
                    pushFollow(FOLLOW_ruleMultiChoice_in_ruleNotesElement1078);
                    this_MultiChoice_15=ruleMultiChoice();

                    state._fsp--;

                     
                            current = this_MultiChoice_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:515:5: this_Exercise_16= ruleExercise
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getExerciseParserRuleCall_0_16()); 
                        
                    pushFollow(FOLLOW_ruleExercise_in_ruleNotesElement1105);
                    this_Exercise_16=ruleExercise();

                    state._fsp--;

                     
                            current = this_Exercise_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:523:2: ( (lv_script_17_0= ruleScript ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==58) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:524:1: (lv_script_17_0= ruleScript )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:524:1: (lv_script_17_0= ruleScript )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:525:3: lv_script_17_0= ruleScript
                    {
                     
                    	        newCompositeNode(grammarAccess.getNotesElementAccess().getScriptScriptParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScript_in_ruleNotesElement1126);
                    lv_script_17_0=ruleScript();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNotesElementRule());
                    	        }
                           		set(
                           			current, 
                           			"script",
                            		lv_script_17_0, 
                            		"Script");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotesElement"


    // $ANTLR start "entryRuleWordMeaning"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:549:1: entryRuleWordMeaning returns [EObject current=null] : iv_ruleWordMeaning= ruleWordMeaning EOF ;
    public final EObject entryRuleWordMeaning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordMeaning = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:550:2: (iv_ruleWordMeaning= ruleWordMeaning EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:551:2: iv_ruleWordMeaning= ruleWordMeaning EOF
            {
             newCompositeNode(grammarAccess.getWordMeaningRule()); 
            pushFollow(FOLLOW_ruleWordMeaning_in_entryRuleWordMeaning1163);
            iv_ruleWordMeaning=ruleWordMeaning();

            state._fsp--;

             current =iv_ruleWordMeaning; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordMeaning1173); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWordMeaning"


    // $ANTLR start "ruleWordMeaning"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:558:1: ruleWordMeaning returns [EObject current=null] : (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleWordMeaning() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_word_2_0=null;
        Token lv_meaning_3_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:561:28: ( (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:562:1: (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:562:1: (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:562:3: otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleWordMeaning1210); 

                	newLeafNode(otherlv_0, grammarAccess.getWordMeaningAccess().getWmKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:566:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:567:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:567:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:568:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleWordMeaning1228); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWordMeaningRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:581:3: ( (lv_word_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:582:1: (lv_word_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:582:1: (lv_word_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:583:3: lv_word_2_0= RULE_STRING
            {
            lv_word_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWordMeaning1259); 

            			newLeafNode(lv_word_2_0, grammarAccess.getWordMeaningAccess().getWordSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWordMeaningRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"word",
                    		lv_word_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:599:2: ( (lv_meaning_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:600:1: (lv_meaning_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:600:1: (lv_meaning_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:601:3: lv_meaning_3_0= RULE_STRING
            {
            lv_meaning_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWordMeaning1281); 

            			newLeafNode(lv_meaning_3_0, grammarAccess.getWordMeaningAccess().getMeaningSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWordMeaningRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"meaning",
                    		lv_meaning_3_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWordMeaning"


    // $ANTLR start "entryRuleQuestionAnswer"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:625:1: entryRuleQuestionAnswer returns [EObject current=null] : iv_ruleQuestionAnswer= ruleQuestionAnswer EOF ;
    public final EObject entryRuleQuestionAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionAnswer = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:626:2: (iv_ruleQuestionAnswer= ruleQuestionAnswer EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:627:2: iv_ruleQuestionAnswer= ruleQuestionAnswer EOF
            {
             newCompositeNode(grammarAccess.getQuestionAnswerRule()); 
            pushFollow(FOLLOW_ruleQuestionAnswer_in_entryRuleQuestionAnswer1322);
            iv_ruleQuestionAnswer=ruleQuestionAnswer();

            state._fsp--;

             current =iv_ruleQuestionAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionAnswer1332); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestionAnswer"


    // $ANTLR start "ruleQuestionAnswer"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:634:1: ruleQuestionAnswer returns [EObject current=null] : (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleQuestionAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_question_2_0=null;
        Token lv_answerParts_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:637:28: ( (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:638:1: (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:638:1: (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:638:3: otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleQuestionAnswer1369); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAnswerAccess().getQaKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:642:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:643:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:643:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:644:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleQuestionAnswer1387); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionAnswerRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:657:3: ( (lv_question_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:658:1: (lv_question_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:658:1: (lv_question_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:659:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestionAnswer1418); 

            			newLeafNode(lv_question_2_0, grammarAccess.getQuestionAnswerAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:675:2: ( (lv_answerParts_3_0= RULE_STRING ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:676:1: (lv_answerParts_3_0= RULE_STRING )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:676:1: (lv_answerParts_3_0= RULE_STRING )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:677:3: lv_answerParts_3_0= RULE_STRING
            	    {
            	    lv_answerParts_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestionAnswer1440); 

            	    			newLeafNode(lv_answerParts_3_0, grammarAccess.getQuestionAnswerAccess().getAnswerPartsSTRINGTerminalRuleCall_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQuestionAnswerRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"answerParts",
            	            		lv_answerParts_3_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:693:3: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==57) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:694:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:694:1: (lv_cmap_4_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:695:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionAnswerAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleQuestionAnswer1467);
                    lv_cmap_4_0=ruleCMap();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQuestionAnswerRule());
                    	        }
                           		set(
                           			current, 
                           			"cmap",
                            		lv_cmap_4_0, 
                            		"CMap");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestionAnswer"


    // $ANTLR start "entryRuleFIB"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:719:1: entryRuleFIB returns [EObject current=null] : iv_ruleFIB= ruleFIB EOF ;
    public final EObject entryRuleFIB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFIB = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:720:2: (iv_ruleFIB= ruleFIB EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:721:2: iv_ruleFIB= ruleFIB EOF
            {
             newCompositeNode(grammarAccess.getFIBRule()); 
            pushFollow(FOLLOW_ruleFIB_in_entryRuleFIB1504);
            iv_ruleFIB=ruleFIB();

            state._fsp--;

             current =iv_ruleFIB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFIB1514); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFIB"


    // $ANTLR start "ruleFIB"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:728:1: ruleFIB returns [EObject current=null] : (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ ) ;
    public final EObject ruleFIB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_question_2_0=null;
        Token lv_answers_3_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:731:28: ( (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:732:1: (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:732:1: (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:732:3: otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleFIB1551); 

                	newLeafNode(otherlv_0, grammarAccess.getFIBAccess().getFibKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:736:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:737:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:737:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:738:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleFIB1569); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFIBRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:751:3: ( (lv_question_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:752:1: (lv_question_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:752:1: (lv_question_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:753:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFIB1600); 

            			newLeafNode(lv_question_2_0, grammarAccess.getFIBAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFIBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:769:2: ( (lv_answers_3_0= RULE_STRING ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:770:1: (lv_answers_3_0= RULE_STRING )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:770:1: (lv_answers_3_0= RULE_STRING )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:771:3: lv_answers_3_0= RULE_STRING
            	    {
            	    lv_answers_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFIB1622); 

            	    			newLeafNode(lv_answers_3_0, grammarAccess.getFIBAccess().getAnswersSTRINGTerminalRuleCall_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFIBRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"answers",
            	            		lv_answers_3_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFIB"


    // $ANTLR start "entryRuleDefinition"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:795:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:796:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:797:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition1664);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition1674); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:804:1: ruleDefinition returns [EObject current=null] : (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_term_2_0=null;
        Token lv_definition_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:807:28: ( (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:808:1: (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:808:1: (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:808:3: otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleDefinition1711); 

                	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefinitionKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:812:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:813:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:813:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:814:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleDefinition1729); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:827:3: ( (lv_term_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:828:1: (lv_term_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:828:1: (lv_term_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:829:3: lv_term_2_0= RULE_STRING
            {
            lv_term_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefinition1760); 

            			newLeafNode(lv_term_2_0, grammarAccess.getDefinitionAccess().getTermSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"term",
                    		lv_term_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:845:2: ( (lv_definition_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:846:1: (lv_definition_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:846:1: (lv_definition_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:847:3: lv_definition_3_0= RULE_STRING
            {
            lv_definition_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefinition1782); 

            			newLeafNode(lv_definition_3_0, grammarAccess.getDefinitionAccess().getDefinitionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"definition",
                    		lv_definition_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:863:2: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==57) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:864:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:864:1: (lv_cmap_4_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:865:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefinitionAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleDefinition1808);
                    lv_cmap_4_0=ruleCMap();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"cmap",
                            		lv_cmap_4_0, 
                            		"CMap");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleCharacter"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:889:1: entryRuleCharacter returns [EObject current=null] : iv_ruleCharacter= ruleCharacter EOF ;
    public final EObject entryRuleCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacter = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:890:2: (iv_ruleCharacter= ruleCharacter EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:891:2: iv_ruleCharacter= ruleCharacter EOF
            {
             newCompositeNode(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_ruleCharacter_in_entryRuleCharacter1845);
            iv_ruleCharacter=ruleCharacter();

            state._fsp--;

             current =iv_ruleCharacter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharacter1855); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharacter"


    // $ANTLR start "ruleCharacter"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:898:1: ruleCharacter returns [EObject current=null] : (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_character_2_0=null;
        Token lv_estimate_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:901:28: ( (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:902:1: (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:902:1: (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:902:3: otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleCharacter1892); 

                	newLeafNode(otherlv_0, grammarAccess.getCharacterAccess().getCharacterKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:906:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:907:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:907:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:908:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleCharacter1910); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCharacterRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:921:3: ( (lv_character_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:922:1: (lv_character_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:922:1: (lv_character_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:923:3: lv_character_2_0= RULE_STRING
            {
            lv_character_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharacter1941); 

            			newLeafNode(lv_character_2_0, grammarAccess.getCharacterAccess().getCharacterSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCharacterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"character",
                    		lv_character_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:939:2: ( (lv_estimate_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:940:1: (lv_estimate_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:940:1: (lv_estimate_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:941:3: lv_estimate_3_0= RULE_STRING
            {
            lv_estimate_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharacter1963); 

            			newLeafNode(lv_estimate_3_0, grammarAccess.getCharacterAccess().getEstimateSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCharacterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"estimate",
                    		lv_estimate_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:957:2: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==57) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:958:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:958:1: (lv_cmap_4_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:959:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleCharacter1989);
                    lv_cmap_4_0=ruleCMap();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterRule());
                    	        }
                           		set(
                           			current, 
                           			"cmap",
                            		lv_cmap_4_0, 
                            		"CMap");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharacter"


    // $ANTLR start "entryRuleTeacherNote"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:983:1: entryRuleTeacherNote returns [EObject current=null] : iv_ruleTeacherNote= ruleTeacherNote EOF ;
    public final EObject entryRuleTeacherNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeacherNote = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:984:2: (iv_ruleTeacherNote= ruleTeacherNote EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:985:2: iv_ruleTeacherNote= ruleTeacherNote EOF
            {
             newCompositeNode(grammarAccess.getTeacherNoteRule()); 
            pushFollow(FOLLOW_ruleTeacherNote_in_entryRuleTeacherNote2026);
            iv_ruleTeacherNote=ruleTeacherNote();

            state._fsp--;

             current =iv_ruleTeacherNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTeacherNote2036); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTeacherNote"


    // $ANTLR start "ruleTeacherNote"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:992:1: ruleTeacherNote returns [EObject current=null] : (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleTeacherNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_caption_2_0=null;
        Token lv_note_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:995:28: ( (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:996:1: (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:996:1: (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:996:3: otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleTeacherNote2073); 

                	newLeafNode(otherlv_0, grammarAccess.getTeacherNoteAccess().getTnKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1000:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1001:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1001:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1002:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleTeacherNote2091); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTeacherNoteRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1015:3: ( (lv_caption_2_0= RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_STRING) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1016:1: (lv_caption_2_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1016:1: (lv_caption_2_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1017:3: lv_caption_2_0= RULE_STRING
                    {
                    lv_caption_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTeacherNote2122); 

                    			newLeafNode(lv_caption_2_0, grammarAccess.getTeacherNoteAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTeacherNoteRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"caption",
                            		lv_caption_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1033:3: ( (lv_note_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1034:1: (lv_note_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1034:1: (lv_note_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1035:3: lv_note_3_0= RULE_STRING
            {
            lv_note_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTeacherNote2145); 

            			newLeafNode(lv_note_3_0, grammarAccess.getTeacherNoteAccess().getNoteSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTeacherNoteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"note",
                    		lv_note_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1051:2: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==57) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1052:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1052:1: (lv_cmap_4_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1053:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getTeacherNoteAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleTeacherNote2171);
                    lv_cmap_4_0=ruleCMap();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTeacherNoteRule());
                    	        }
                           		set(
                           			current, 
                           			"cmap",
                            		lv_cmap_4_0, 
                            		"CMap");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeacherNote"


    // $ANTLR start "entryRuleMatching"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1077:1: entryRuleMatching returns [EObject current=null] : iv_ruleMatching= ruleMatching EOF ;
    public final EObject entryRuleMatching() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatching = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1078:2: (iv_ruleMatching= ruleMatching EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1079:2: iv_ruleMatching= ruleMatching EOF
            {
             newCompositeNode(grammarAccess.getMatchingRule()); 
            pushFollow(FOLLOW_ruleMatching_in_entryRuleMatching2208);
            iv_ruleMatching=ruleMatching();

            state._fsp--;

             current =iv_ruleMatching; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatching2218); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatching"


    // $ANTLR start "ruleMatching"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1086:1: ruleMatching returns [EObject current=null] : (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )? otherlv_7= '}' ) ;
    public final EObject ruleMatching() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_skipReverseQuestion_2_0=null;
        Token lv_question_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_pairs_5_0 = null;

        EObject lv_mcqConfig_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1089:28: ( (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )? otherlv_7= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1090:1: (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )? otherlv_7= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1090:1: (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )? otherlv_7= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1090:3: otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleMatching2255); 

                	newLeafNode(otherlv_0, grammarAccess.getMatchingAccess().getMatchKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1094:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1095:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1095:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1096:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleMatching2273); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchingRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1109:3: ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1110:1: (lv_skipReverseQuestion_2_0= 'skip_reverse_question' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1110:1: (lv_skipReverseQuestion_2_0= 'skip_reverse_question' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1111:3: lv_skipReverseQuestion_2_0= 'skip_reverse_question'
                    {
                    lv_skipReverseQuestion_2_0=(Token)match(input,27,FOLLOW_27_in_ruleMatching2305); 

                            newLeafNode(lv_skipReverseQuestion_2_0, grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchingRule());
                    	        }
                           		setWithLastConsumed(current, "skipReverseQuestion", lv_skipReverseQuestion_2_0, "skip_reverse_question");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1124:3: ( (lv_question_3_0= RULE_STRING ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1125:1: (lv_question_3_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1125:1: (lv_question_3_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1126:3: lv_question_3_0= RULE_STRING
                    {
                    lv_question_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatching2336); 

                    			newLeafNode(lv_question_3_0, grammarAccess.getMatchingAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchingRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"question",
                            		lv_question_3_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleMatching2354); 

                	newLeafNode(otherlv_4, grammarAccess.getMatchingAccess().getLeftCurlyBracketKeyword_4());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1146:1: ( (lv_pairs_5_0= ruleMatchPair ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_STRING) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1147:1: (lv_pairs_5_0= ruleMatchPair )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1147:1: (lv_pairs_5_0= ruleMatchPair )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1148:3: lv_pairs_5_0= ruleMatchPair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMatchingAccess().getPairsMatchPairParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMatchPair_in_ruleMatching2375);
            	    lv_pairs_5_0=ruleMatchPair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMatchingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pairs",
            	            		lv_pairs_5_0, 
            	            		"MatchPair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1164:3: ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1165:1: (lv_mcqConfig_6_0= ruleMatchMCQConfig )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1165:1: (lv_mcqConfig_6_0= ruleMatchMCQConfig )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1166:3: lv_mcqConfig_6_0= ruleMatchMCQConfig
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatchingAccess().getMcqConfigMatchMCQConfigParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMatchMCQConfig_in_ruleMatching2397);
                    lv_mcqConfig_6_0=ruleMatchMCQConfig();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatchingRule());
                    	        }
                           		set(
                           			current, 
                           			"mcqConfig",
                            		lv_mcqConfig_6_0, 
                            		"MatchMCQConfig");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleMatching2410); 

                	newLeafNode(otherlv_7, grammarAccess.getMatchingAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatching"


    // $ANTLR start "entryRuleMatchPair"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1194:1: entryRuleMatchPair returns [EObject current=null] : iv_ruleMatchPair= ruleMatchPair EOF ;
    public final EObject entryRuleMatchPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchPair = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1195:2: (iv_ruleMatchPair= ruleMatchPair EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1196:2: iv_ruleMatchPair= ruleMatchPair EOF
            {
             newCompositeNode(grammarAccess.getMatchPairRule()); 
            pushFollow(FOLLOW_ruleMatchPair_in_entryRuleMatchPair2446);
            iv_ruleMatchPair=ruleMatchPair();

            state._fsp--;

             current =iv_ruleMatchPair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchPair2456); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatchPair"


    // $ANTLR start "ruleMatchPair"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1203:1: ruleMatchPair returns [EObject current=null] : ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMatchPair() throws RecognitionException {
        EObject current = null;

        Token lv_matchQuestion_0_0=null;
        Token otherlv_1=null;
        Token lv_matchAnswer_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1206:28: ( ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1207:1: ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1207:1: ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1207:2: ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1207:2: ( (lv_matchQuestion_0_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1208:1: (lv_matchQuestion_0_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1208:1: (lv_matchQuestion_0_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1209:3: lv_matchQuestion_0_0= RULE_STRING
            {
            lv_matchQuestion_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatchPair2498); 

            			newLeafNode(lv_matchQuestion_0_0, grammarAccess.getMatchPairAccess().getMatchQuestionSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMatchPairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"matchQuestion",
                    		lv_matchQuestion_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMatchPair2515); 

                	newLeafNode(otherlv_1, grammarAccess.getMatchPairAccess().getEqualsSignKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1229:1: ( (lv_matchAnswer_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1230:1: (lv_matchAnswer_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1230:1: (lv_matchAnswer_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1231:3: lv_matchAnswer_2_0= RULE_STRING
            {
            lv_matchAnswer_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatchPair2532); 

            			newLeafNode(lv_matchAnswer_2_0, grammarAccess.getMatchPairAccess().getMatchAnswerSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMatchPairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"matchAnswer",
                    		lv_matchAnswer_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatchPair"


    // $ANTLR start "entryRuleMatchMCQConfig"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1255:1: entryRuleMatchMCQConfig returns [EObject current=null] : iv_ruleMatchMCQConfig= ruleMatchMCQConfig EOF ;
    public final EObject entryRuleMatchMCQConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchMCQConfig = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1256:2: (iv_ruleMatchMCQConfig= ruleMatchMCQConfig EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1257:2: iv_ruleMatchMCQConfig= ruleMatchMCQConfig EOF
            {
             newCompositeNode(grammarAccess.getMatchMCQConfigRule()); 
            pushFollow(FOLLOW_ruleMatchMCQConfig_in_entryRuleMatchMCQConfig2573);
            iv_ruleMatchMCQConfig=ruleMatchMCQConfig();

            state._fsp--;

             current =iv_ruleMatchMCQConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchMCQConfig2583); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatchMCQConfig"


    // $ANTLR start "ruleMatchMCQConfig"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1264:1: ruleMatchMCQConfig returns [EObject current=null] : (otherlv_0= '@mcq_config' otherlv_1= '{' otherlv_2= '@forwardCaption' ( (lv_forwardCaption_3_0= RULE_STRING ) ) (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )? (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )? (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleMatchMCQConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_forwardCaption_3_0=null;
        Token otherlv_4=null;
        Token lv_reverseCaption_5_0=null;
        Token otherlv_6=null;
        Token lv_numOptionsToShow_7_0=null;
        Token otherlv_8=null;
        Token lv_numOptionsPerRow_9_0=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1267:28: ( (otherlv_0= '@mcq_config' otherlv_1= '{' otherlv_2= '@forwardCaption' ( (lv_forwardCaption_3_0= RULE_STRING ) ) (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )? (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )? (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )? otherlv_10= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1268:1: (otherlv_0= '@mcq_config' otherlv_1= '{' otherlv_2= '@forwardCaption' ( (lv_forwardCaption_3_0= RULE_STRING ) ) (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )? (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )? (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )? otherlv_10= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1268:1: (otherlv_0= '@mcq_config' otherlv_1= '{' otherlv_2= '@forwardCaption' ( (lv_forwardCaption_3_0= RULE_STRING ) ) (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )? (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )? (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )? otherlv_10= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1268:3: otherlv_0= '@mcq_config' otherlv_1= '{' otherlv_2= '@forwardCaption' ( (lv_forwardCaption_3_0= RULE_STRING ) ) (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )? (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )? (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleMatchMCQConfig2620); 

                	newLeafNode(otherlv_0, grammarAccess.getMatchMCQConfigAccess().getMcq_configKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleMatchMCQConfig2632); 

                	newLeafNode(otherlv_1, grammarAccess.getMatchMCQConfigAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleMatchMCQConfig2644); 

                	newLeafNode(otherlv_2, grammarAccess.getMatchMCQConfigAccess().getForwardCaptionKeyword_2());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1280:1: ( (lv_forwardCaption_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1281:1: (lv_forwardCaption_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1281:1: (lv_forwardCaption_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1282:3: lv_forwardCaption_3_0= RULE_STRING
            {
            lv_forwardCaption_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatchMCQConfig2661); 

            			newLeafNode(lv_forwardCaption_3_0, grammarAccess.getMatchMCQConfigAccess().getForwardCaptionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMatchMCQConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"forwardCaption",
                    		lv_forwardCaption_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1298:2: (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1298:4: otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleMatchMCQConfig2679); 

                        	newLeafNode(otherlv_4, grammarAccess.getMatchMCQConfigAccess().getReverseCaptionKeyword_4_0());
                        
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1302:1: ( (lv_reverseCaption_5_0= RULE_STRING ) )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1303:1: (lv_reverseCaption_5_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1303:1: (lv_reverseCaption_5_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1304:3: lv_reverseCaption_5_0= RULE_STRING
                    {
                    lv_reverseCaption_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatchMCQConfig2696); 

                    			newLeafNode(lv_reverseCaption_5_0, grammarAccess.getMatchMCQConfigAccess().getReverseCaptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchMCQConfigRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"reverseCaption",
                            		lv_reverseCaption_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1320:4: (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1320:6: otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleMatchMCQConfig2716); 

                        	newLeafNode(otherlv_6, grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowKeyword_5_0());
                        
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1324:1: ( (lv_numOptionsToShow_7_0= RULE_INT ) )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1325:1: (lv_numOptionsToShow_7_0= RULE_INT )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1325:1: (lv_numOptionsToShow_7_0= RULE_INT )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1326:3: lv_numOptionsToShow_7_0= RULE_INT
                    {
                    lv_numOptionsToShow_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMatchMCQConfig2733); 

                    			newLeafNode(lv_numOptionsToShow_7_0, grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowINTTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchMCQConfigRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"numOptionsToShow",
                            		lv_numOptionsToShow_7_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1342:4: (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1342:6: otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) )
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_35_in_ruleMatchMCQConfig2753); 

                        	newLeafNode(otherlv_8, grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowKeyword_6_0());
                        
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1346:1: ( (lv_numOptionsPerRow_9_0= RULE_INT ) )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1347:1: (lv_numOptionsPerRow_9_0= RULE_INT )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1347:1: (lv_numOptionsPerRow_9_0= RULE_INT )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1348:3: lv_numOptionsPerRow_9_0= RULE_INT
                    {
                    lv_numOptionsPerRow_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMatchMCQConfig2770); 

                    			newLeafNode(lv_numOptionsPerRow_9_0, grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowINTTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchMCQConfigRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"numOptionsPerRow",
                            		lv_numOptionsPerRow_9_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleMatchMCQConfig2789); 

                	newLeafNode(otherlv_10, grammarAccess.getMatchMCQConfigAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatchMCQConfig"


    // $ANTLR start "entryRuleEvent"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1376:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1377:2: (iv_ruleEvent= ruleEvent EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1378:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent2825);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent2835); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1385:1: ruleEvent returns [EObject current=null] : (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_event_2_0=null;
        Token lv_time_3_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1388:28: ( (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1389:1: (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1389:1: (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1389:3: otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleEvent2872); 

                	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1393:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1394:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1394:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1395:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleEvent2890); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1408:3: ( (lv_event_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1409:1: (lv_event_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1409:1: (lv_event_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1410:3: lv_event_2_0= RULE_STRING
            {
            lv_event_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent2921); 

            			newLeafNode(lv_event_2_0, grammarAccess.getEventAccess().getEventSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"event",
                    		lv_event_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1426:2: ( (lv_time_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1427:1: (lv_time_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1427:1: (lv_time_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1428:3: lv_time_3_0= RULE_STRING
            {
            lv_time_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent2943); 

            			newLeafNode(lv_time_3_0, grammarAccess.getEventAccess().getTimeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"time",
                    		lv_time_3_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleTrueFalse"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1452:1: entryRuleTrueFalse returns [EObject current=null] : iv_ruleTrueFalse= ruleTrueFalse EOF ;
    public final EObject entryRuleTrueFalse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueFalse = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1453:2: (iv_ruleTrueFalse= ruleTrueFalse EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1454:2: iv_ruleTrueFalse= ruleTrueFalse EOF
            {
             newCompositeNode(grammarAccess.getTrueFalseRule()); 
            pushFollow(FOLLOW_ruleTrueFalse_in_entryRuleTrueFalse2984);
            iv_ruleTrueFalse=ruleTrueFalse();

            state._fsp--;

             current =iv_ruleTrueFalse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrueFalse2994); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrueFalse"


    // $ANTLR start "ruleTrueFalse"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1461:1: ruleTrueFalse returns [EObject current=null] : (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleTrueFalse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_statement_2_0=null;
        Token lv_truthValue_3_0=null;
        Token lv_justification_4_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1464:28: ( (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1465:1: (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1465:1: (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1465:3: otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleTrueFalse3031); 

                	newLeafNode(otherlv_0, grammarAccess.getTrueFalseAccess().getTrue_falseKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1469:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1470:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1470:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1471:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleTrueFalse3049); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTrueFalseRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1484:3: ( (lv_statement_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1485:1: (lv_statement_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1485:1: (lv_statement_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1486:3: lv_statement_2_0= RULE_STRING
            {
            lv_statement_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTrueFalse3080); 

            			newLeafNode(lv_statement_2_0, grammarAccess.getTrueFalseAccess().getStatementSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTrueFalseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"statement",
                    		lv_statement_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1502:2: ( (lv_truthValue_3_0= RULE_BOOL ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1503:1: (lv_truthValue_3_0= RULE_BOOL )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1503:1: (lv_truthValue_3_0= RULE_BOOL )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1504:3: lv_truthValue_3_0= RULE_BOOL
            {
            lv_truthValue_3_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleTrueFalse3102); 

            			newLeafNode(lv_truthValue_3_0, grammarAccess.getTrueFalseAccess().getTruthValueBOOLTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTrueFalseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"truthValue",
                    		lv_truthValue_3_0, 
                    		"BOOL");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1520:2: ( (lv_justification_4_0= RULE_STRING ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1521:1: (lv_justification_4_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1521:1: (lv_justification_4_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1522:3: lv_justification_4_0= RULE_STRING
                    {
                    lv_justification_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTrueFalse3124); 

                    			newLeafNode(lv_justification_4_0, grammarAccess.getTrueFalseAccess().getJustificationSTRINGTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTrueFalseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"justification",
                            		lv_justification_4_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrueFalse"


    // $ANTLR start "entryRuleChemEquation"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1546:1: entryRuleChemEquation returns [EObject current=null] : iv_ruleChemEquation= ruleChemEquation EOF ;
    public final EObject entryRuleChemEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemEquation = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1547:2: (iv_ruleChemEquation= ruleChemEquation EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1548:2: iv_ruleChemEquation= ruleChemEquation EOF
            {
             newCompositeNode(grammarAccess.getChemEquationRule()); 
            pushFollow(FOLLOW_ruleChemEquation_in_entryRuleChemEquation3166);
            iv_ruleChemEquation=ruleChemEquation();

            state._fsp--;

             current =iv_ruleChemEquation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChemEquation3176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChemEquation"


    // $ANTLR start "ruleChemEquation"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1555:1: ruleChemEquation returns [EObject current=null] : (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
    public final EObject ruleChemEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token lv_reactants_4_0=null;
        Token otherlv_5=null;
        Token lv_produces_6_0=null;
        Token otherlv_7=null;
        Token lv_products_8_0=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1558:28: ( (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1559:1: (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1559:1: (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1559:3: otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleChemEquation3213); 

                	newLeafNode(otherlv_0, grammarAccess.getChemEquationAccess().getChem_equationKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1563:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1564:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1564:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1565:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleChemEquation3231); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemEquationRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1578:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1579:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1579:1: (lv_description_2_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1580:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation3262); 

                    			newLeafNode(lv_description_2_0, grammarAccess.getChemEquationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemEquationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleChemEquation3280); 

                	newLeafNode(otherlv_3, grammarAccess.getChemEquationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1600:1: ( (lv_reactants_4_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1601:1: (lv_reactants_4_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1601:1: (lv_reactants_4_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1602:3: lv_reactants_4_0= RULE_STRING
            {
            lv_reactants_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation3297); 

            			newLeafNode(lv_reactants_4_0, grammarAccess.getChemEquationAccess().getReactantsSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChemEquationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"reactants",
                    		lv_reactants_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleChemEquation3314); 

                	newLeafNode(otherlv_5, grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_5());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1622:1: ( (lv_produces_6_0= RULE_STRING ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1623:1: (lv_produces_6_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1623:1: (lv_produces_6_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1624:3: lv_produces_6_0= RULE_STRING
                    {
                    lv_produces_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation3331); 

                    			newLeafNode(lv_produces_6_0, grammarAccess.getChemEquationAccess().getProducesSTRINGTerminalRuleCall_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemEquationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"produces",
                            		lv_produces_6_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleChemEquation3349); 

                	newLeafNode(otherlv_7, grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_7());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1644:1: ( (lv_products_8_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1645:1: (lv_products_8_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1645:1: (lv_products_8_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1646:3: lv_products_8_0= RULE_STRING
            {
            lv_products_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation3366); 

            			newLeafNode(lv_products_8_0, grammarAccess.getChemEquationAccess().getProductsSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChemEquationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"products",
                    		lv_products_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleChemEquation3383); 

                	newLeafNode(otherlv_9, grammarAccess.getChemEquationAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChemEquation"


    // $ANTLR start "entryRuleChemCompound"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1674:1: entryRuleChemCompound returns [EObject current=null] : iv_ruleChemCompound= ruleChemCompound EOF ;
    public final EObject entryRuleChemCompound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemCompound = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1675:2: (iv_ruleChemCompound= ruleChemCompound EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1676:2: iv_ruleChemCompound= ruleChemCompound EOF
            {
             newCompositeNode(grammarAccess.getChemCompoundRule()); 
            pushFollow(FOLLOW_ruleChemCompound_in_entryRuleChemCompound3419);
            iv_ruleChemCompound=ruleChemCompound();

            state._fsp--;

             current =iv_ruleChemCompound; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChemCompound3429); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChemCompound"


    // $ANTLR start "ruleChemCompound"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1683:1: ruleChemCompound returns [EObject current=null] : (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleChemCompound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_symbol_2_0=null;
        Token lv_chemicalName_3_0=null;
        Token lv_commonName_4_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1686:28: ( (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1687:1: (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1687:1: (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1687:3: otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleChemCompound3466); 

                	newLeafNode(otherlv_0, grammarAccess.getChemCompoundAccess().getChem_compoundKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1691:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1692:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1692:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1693:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleChemCompound3484); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemCompoundRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1706:3: ( (lv_symbol_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1707:1: (lv_symbol_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1707:1: (lv_symbol_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1708:3: lv_symbol_2_0= RULE_STRING
            {
            lv_symbol_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemCompound3515); 

            			newLeafNode(lv_symbol_2_0, grammarAccess.getChemCompoundAccess().getSymbolSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChemCompoundRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"symbol",
                    		lv_symbol_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1724:2: ( (lv_chemicalName_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1725:1: (lv_chemicalName_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1725:1: (lv_chemicalName_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1726:3: lv_chemicalName_3_0= RULE_STRING
            {
            lv_chemicalName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemCompound3537); 

            			newLeafNode(lv_chemicalName_3_0, grammarAccess.getChemCompoundAccess().getChemicalNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChemCompoundRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"chemicalName",
                    		lv_chemicalName_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1742:2: ( (lv_commonName_4_0= RULE_STRING ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1743:1: (lv_commonName_4_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1743:1: (lv_commonName_4_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1744:3: lv_commonName_4_0= RULE_STRING
                    {
                    lv_commonName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemCompound3559); 

                    			newLeafNode(lv_commonName_4_0, grammarAccess.getChemCompoundAccess().getCommonNameSTRINGTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemCompoundRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"commonName",
                            		lv_commonName_4_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChemCompound"


    // $ANTLR start "entryRuleSpellbee"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1768:1: entryRuleSpellbee returns [EObject current=null] : iv_ruleSpellbee= ruleSpellbee EOF ;
    public final EObject entryRuleSpellbee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpellbee = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1769:2: (iv_ruleSpellbee= ruleSpellbee EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1770:2: iv_ruleSpellbee= ruleSpellbee EOF
            {
             newCompositeNode(grammarAccess.getSpellbeeRule()); 
            pushFollow(FOLLOW_ruleSpellbee_in_entryRuleSpellbee3601);
            iv_ruleSpellbee=ruleSpellbee();

            state._fsp--;

             current =iv_ruleSpellbee; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpellbee3611); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpellbee"


    // $ANTLR start "ruleSpellbee"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1777:1: ruleSpellbee returns [EObject current=null] : (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSpellbee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_word_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1780:28: ( (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1781:1: (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1781:1: (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1781:3: otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleSpellbee3648); 

                	newLeafNode(otherlv_0, grammarAccess.getSpellbeeAccess().getSpellbeeKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1785:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==20) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1786:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1786:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1787:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleSpellbee3666); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpellbeeRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1800:3: ( (lv_word_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1801:1: (lv_word_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1801:1: (lv_word_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1802:3: lv_word_2_0= RULE_STRING
            {
            lv_word_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpellbee3697); 

            			newLeafNode(lv_word_2_0, grammarAccess.getSpellbeeAccess().getWordSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpellbeeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"word",
                    		lv_word_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpellbee"


    // $ANTLR start "entryRuleImageLabel"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1826:1: entryRuleImageLabel returns [EObject current=null] : iv_ruleImageLabel= ruleImageLabel EOF ;
    public final EObject entryRuleImageLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageLabel = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1827:2: (iv_ruleImageLabel= ruleImageLabel EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1828:2: iv_ruleImageLabel= ruleImageLabel EOF
            {
             newCompositeNode(grammarAccess.getImageLabelRule()); 
            pushFollow(FOLLOW_ruleImageLabel_in_entryRuleImageLabel3738);
            iv_ruleImageLabel=ruleImageLabel();

            state._fsp--;

             current =iv_ruleImageLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageLabel3748); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImageLabel"


    // $ANTLR start "ruleImageLabel"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1835:1: ruleImageLabel returns [EObject current=null] : (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleImageLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_caption_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_imageName_5_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_hotspots_6_0 = null;

        EObject lv_hotspots_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1838:28: ( (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1839:1: (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1839:1: (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1839:3: otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleImageLabel3785); 

                	newLeafNode(otherlv_0, grammarAccess.getImageLabelAccess().getImage_labelKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1843:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1844:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1844:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1845:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleImageLabel3803); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageLabelRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1858:3: ( (lv_caption_2_0= RULE_STRING ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1859:1: (lv_caption_2_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1859:1: (lv_caption_2_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1860:3: lv_caption_2_0= RULE_STRING
                    {
                    lv_caption_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageLabel3834); 

                    			newLeafNode(lv_caption_2_0, grammarAccess.getImageLabelAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"caption",
                            		lv_caption_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleImageLabel3852); 

                	newLeafNode(otherlv_3, grammarAccess.getImageLabelAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleImageLabel3864); 

                	newLeafNode(otherlv_4, grammarAccess.getImageLabelAccess().getImageNameKeyword_4());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1884:1: ( (lv_imageName_5_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1885:1: (lv_imageName_5_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1885:1: (lv_imageName_5_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1886:3: lv_imageName_5_0= RULE_STRING
            {
            lv_imageName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageLabel3881); 

            			newLeafNode(lv_imageName_5_0, grammarAccess.getImageLabelAccess().getImageNameSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"imageName",
                    		lv_imageName_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1902:2: ( (lv_hotspots_6_0= ruleHotSpot ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1903:1: (lv_hotspots_6_0= ruleHotSpot )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1903:1: (lv_hotspots_6_0= ruleHotSpot )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1904:3: lv_hotspots_6_0= ruleHotSpot
            {
             
            	        newCompositeNode(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleHotSpot_in_ruleImageLabel3907);
            lv_hotspots_6_0=ruleHotSpot();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImageLabelRule());
            	        }
                   		add(
                   			current, 
                   			"hotspots",
                    		lv_hotspots_6_0, 
                    		"HotSpot");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1920:2: (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==44) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1920:4: otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) )
            	    {
            	    otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleImageLabel3920); 

            	        	newLeafNode(otherlv_7, grammarAccess.getImageLabelAccess().getCommaKeyword_7_0());
            	        
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1924:1: ( (lv_hotspots_8_0= ruleHotSpot ) )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1925:1: (lv_hotspots_8_0= ruleHotSpot )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1925:1: (lv_hotspots_8_0= ruleHotSpot )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1926:3: lv_hotspots_8_0= ruleHotSpot
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHotSpot_in_ruleImageLabel3941);
            	    lv_hotspots_8_0=ruleHotSpot();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageLabelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hotspots",
            	            		lv_hotspots_8_0, 
            	            		"HotSpot");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleImageLabel3955); 

                	newLeafNode(otherlv_9, grammarAccess.getImageLabelAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImageLabel"


    // $ANTLR start "entryRuleHotSpot"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1954:1: entryRuleHotSpot returns [EObject current=null] : iv_ruleHotSpot= ruleHotSpot EOF ;
    public final EObject entryRuleHotSpot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHotSpot = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1955:2: (iv_ruleHotSpot= ruleHotSpot EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1956:2: iv_ruleHotSpot= ruleHotSpot EOF
            {
             newCompositeNode(grammarAccess.getHotSpotRule()); 
            pushFollow(FOLLOW_ruleHotSpot_in_entryRuleHotSpot3991);
            iv_ruleHotSpot=ruleHotSpot();

            state._fsp--;

             current =iv_ruleHotSpot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHotSpot4001); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHotSpot"


    // $ANTLR start "ruleHotSpot"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1963:1: ruleHotSpot returns [EObject current=null] : ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleHotSpot() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;
        Token otherlv_1=null;
        Token lv_y_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1966:28: ( ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1967:1: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1967:1: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1967:2: ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1967:2: ( (lv_x_0_0= RULE_INT ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1968:1: (lv_x_0_0= RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1968:1: (lv_x_0_0= RULE_INT )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1969:3: lv_x_0_0= RULE_INT
            {
            lv_x_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHotSpot4043); 

            			newLeafNode(lv_x_0_0, grammarAccess.getHotSpotAccess().getXINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHotSpotRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"x",
                    		lv_x_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleHotSpot4060); 

                	newLeafNode(otherlv_1, grammarAccess.getHotSpotAccess().getCommaKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1989:1: ( (lv_y_2_0= RULE_INT ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1990:1: (lv_y_2_0= RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1990:1: (lv_y_2_0= RULE_INT )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1991:3: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHotSpot4077); 

            			newLeafNode(lv_y_2_0, grammarAccess.getHotSpotAccess().getYINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHotSpotRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"y",
                    		lv_y_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleHotSpot4094); 

                	newLeafNode(otherlv_3, grammarAccess.getHotSpotAccess().getEqualsSignKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2011:1: ( (lv_label_4_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2012:1: (lv_label_4_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2012:1: (lv_label_4_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2013:3: lv_label_4_0= RULE_STRING
            {
            lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHotSpot4111); 

            			newLeafNode(lv_label_4_0, grammarAccess.getHotSpotAccess().getLabelSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHotSpotRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_4_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHotSpot"


    // $ANTLR start "entryRuleEquation"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2037:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2038:2: (iv_ruleEquation= ruleEquation EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2039:2: iv_ruleEquation= ruleEquation EOF
            {
             newCompositeNode(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_ruleEquation_in_entryRuleEquation4152);
            iv_ruleEquation=ruleEquation();

            state._fsp--;

             current =iv_ruleEquation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquation4162); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2046:1: ruleEquation returns [EObject current=null] : (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_equation_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_symbols_6_0 = null;

        EObject lv_symbols_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2049:28: ( (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2050:1: (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2050:1: (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2050:3: otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleEquation4199); 

                	newLeafNode(otherlv_0, grammarAccess.getEquationAccess().getEquationKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2054:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==20) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2055:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2055:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2056:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleEquation4217); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEquationRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2069:3: ( (lv_equation_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2070:1: (lv_equation_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2070:1: (lv_equation_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2071:3: lv_equation_2_0= RULE_STRING
            {
            lv_equation_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEquation4248); 

            			newLeafNode(lv_equation_2_0, grammarAccess.getEquationAccess().getEquationSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEquationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"equation",
                    		lv_equation_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleEquation4265); 

                	newLeafNode(otherlv_3, grammarAccess.getEquationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2091:1: ( (lv_description_4_0= RULE_STRING ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2092:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2092:1: (lv_description_4_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2093:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEquation4282); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getEquationAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEquationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleEquation4300); 

                	newLeafNode(otherlv_5, grammarAccess.getEquationAccess().getWhereKeyword_5());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2113:1: ( (lv_symbols_6_0= ruleEqSymbol ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2114:1: (lv_symbols_6_0= ruleEqSymbol )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2114:1: (lv_symbols_6_0= ruleEqSymbol )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2115:3: lv_symbols_6_0= ruleEqSymbol
            {
             
            	        newCompositeNode(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleEqSymbol_in_ruleEquation4321);
            lv_symbols_6_0=ruleEqSymbol();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEquationRule());
            	        }
                   		add(
                   			current, 
                   			"symbols",
                    		lv_symbols_6_0, 
                    		"EqSymbol");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2131:2: (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==44) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2131:4: otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) )
            	    {
            	    otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleEquation4334); 

            	        	newLeafNode(otherlv_7, grammarAccess.getEquationAccess().getCommaKeyword_7_0());
            	        
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2135:1: ( (lv_symbols_8_0= ruleEqSymbol ) )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2136:1: (lv_symbols_8_0= ruleEqSymbol )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2136:1: (lv_symbols_8_0= ruleEqSymbol )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2137:3: lv_symbols_8_0= ruleEqSymbol
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqSymbol_in_ruleEquation4355);
            	    lv_symbols_8_0=ruleEqSymbol();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEquationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"symbols",
            	            		lv_symbols_8_0, 
            	            		"EqSymbol");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleEquation4369); 

                	newLeafNode(otherlv_9, grammarAccess.getEquationAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleEqSymbol"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2165:1: entryRuleEqSymbol returns [EObject current=null] : iv_ruleEqSymbol= ruleEqSymbol EOF ;
    public final EObject entryRuleEqSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqSymbol = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2166:2: (iv_ruleEqSymbol= ruleEqSymbol EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2167:2: iv_ruleEqSymbol= ruleEqSymbol EOF
            {
             newCompositeNode(grammarAccess.getEqSymbolRule()); 
            pushFollow(FOLLOW_ruleEqSymbol_in_entryRuleEqSymbol4405);
            iv_ruleEqSymbol=ruleEqSymbol();

            state._fsp--;

             current =iv_ruleEqSymbol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqSymbol4415); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqSymbol"


    // $ANTLR start "ruleEqSymbol"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2174:1: ruleEqSymbol returns [EObject current=null] : ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEqSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2177:28: ( ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2178:1: ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2178:1: ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2178:2: ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2178:2: ( (lv_symbol_0_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2179:1: (lv_symbol_0_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2179:1: (lv_symbol_0_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2180:3: lv_symbol_0_0= RULE_STRING
            {
            lv_symbol_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqSymbol4457); 

            			newLeafNode(lv_symbol_0_0, grammarAccess.getEqSymbolAccess().getSymbolSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEqSymbolRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"symbol",
                    		lv_symbol_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleEqSymbol4474); 

                	newLeafNode(otherlv_1, grammarAccess.getEqSymbolAccess().getEqualsSignKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2200:1: ( (lv_description_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2201:1: (lv_description_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2201:1: (lv_description_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2202:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqSymbol4491); 

            			newLeafNode(lv_description_2_0, grammarAccess.getEqSymbolAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEqSymbolRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqSymbol"


    // $ANTLR start "entryRuleRefToContext"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2226:1: entryRuleRefToContext returns [EObject current=null] : iv_ruleRefToContext= ruleRefToContext EOF ;
    public final EObject entryRuleRefToContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefToContext = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2227:2: (iv_ruleRefToContext= ruleRefToContext EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2228:2: iv_ruleRefToContext= ruleRefToContext EOF
            {
             newCompositeNode(grammarAccess.getRefToContextRule()); 
            pushFollow(FOLLOW_ruleRefToContext_in_entryRuleRefToContext4532);
            iv_ruleRefToContext=ruleRefToContext();

            state._fsp--;

             current =iv_ruleRefToContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefToContext4542); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefToContext"


    // $ANTLR start "ruleRefToContext"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2235:1: ruleRefToContext returns [EObject current=null] : (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_rtcElement_5_0= ruleRTCElement ) )+ otherlv_6= '}' ) ;
    public final EObject ruleRefToContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_context_4_0=null;
        Token otherlv_6=null;
        EObject lv_rtcElement_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2238:28: ( (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_rtcElement_5_0= ruleRTCElement ) )+ otherlv_6= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2239:1: (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_rtcElement_5_0= ruleRTCElement ) )+ otherlv_6= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2239:1: (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_rtcElement_5_0= ruleRTCElement ) )+ otherlv_6= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2239:3: otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_rtcElement_5_0= ruleRTCElement ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleRefToContext4579); 

                	newLeafNode(otherlv_0, grammarAccess.getRefToContextAccess().getRtcKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2243:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==20) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2244:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2244:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2245:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleRefToContext4597); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRefToContextRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleRefToContext4623); 

                	newLeafNode(otherlv_2, grammarAccess.getRefToContextAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleRefToContext4635); 

                	newLeafNode(otherlv_3, grammarAccess.getRefToContextAccess().getContextKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2266:1: ( (lv_context_4_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2267:1: (lv_context_4_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2267:1: (lv_context_4_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2268:3: lv_context_4_0= RULE_STRING
            {
            lv_context_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRefToContext4652); 

            			newLeafNode(lv_context_4_0, grammarAccess.getRefToContextAccess().getContextSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRefToContextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"context",
                    		lv_context_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2284:2: ( (lv_rtcElement_5_0= ruleRTCElement ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==19||(LA45_0>=21 && LA45_0<=26)||(LA45_0>=36 && LA45_0<=38)||LA45_0==40||LA45_0==42||LA45_0==45||LA45_0==49) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2285:1: (lv_rtcElement_5_0= ruleRTCElement )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2285:1: (lv_rtcElement_5_0= ruleRTCElement )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2286:3: lv_rtcElement_5_0= ruleRTCElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefToContextAccess().getRtcElementRTCElementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRTCElement_in_ruleRefToContext4678);
            	    lv_rtcElement_5_0=ruleRTCElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRefToContextRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rtcElement",
            	            		lv_rtcElement_5_0, 
            	            		"RTCElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleRefToContext4691); 

                	newLeafNode(otherlv_6, grammarAccess.getRefToContextAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefToContext"


    // $ANTLR start "entryRuleRTCElement"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2314:1: entryRuleRTCElement returns [EObject current=null] : iv_ruleRTCElement= ruleRTCElement EOF ;
    public final EObject entryRuleRTCElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTCElement = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2315:2: (iv_ruleRTCElement= ruleRTCElement EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2316:2: iv_ruleRTCElement= ruleRTCElement EOF
            {
             newCompositeNode(grammarAccess.getRTCElementRule()); 
            pushFollow(FOLLOW_ruleRTCElement_in_entryRuleRTCElement4727);
            iv_ruleRTCElement=ruleRTCElement();

            state._fsp--;

             current =iv_ruleRTCElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTCElement4737); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRTCElement"


    // $ANTLR start "ruleRTCElement"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2323:1: ruleRTCElement returns [EObject current=null] : (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_ImageLabel_11= ruleImageLabel | this_Equation_12= ruleEquation | this_MultiChoice_13= ruleMultiChoice ) ;
    public final EObject ruleRTCElement() throws RecognitionException {
        EObject current = null;

        EObject this_WordMeaning_0 = null;

        EObject this_QuestionAnswer_1 = null;

        EObject this_FIB_2 = null;

        EObject this_Definition_3 = null;

        EObject this_Character_4 = null;

        EObject this_TeacherNote_5 = null;

        EObject this_Matching_6 = null;

        EObject this_Event_7 = null;

        EObject this_TrueFalse_8 = null;

        EObject this_ChemEquation_9 = null;

        EObject this_ChemCompound_10 = null;

        EObject this_ImageLabel_11 = null;

        EObject this_Equation_12 = null;

        EObject this_MultiChoice_13 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2326:28: ( (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_ImageLabel_11= ruleImageLabel | this_Equation_12= ruleEquation | this_MultiChoice_13= ruleMultiChoice ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2327:1: (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_ImageLabel_11= ruleImageLabel | this_Equation_12= ruleEquation | this_MultiChoice_13= ruleMultiChoice )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2327:1: (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_ImageLabel_11= ruleImageLabel | this_Equation_12= ruleEquation | this_MultiChoice_13= ruleMultiChoice )
            int alt46=14;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt46=1;
                }
                break;
            case 21:
                {
                alt46=2;
                }
                break;
            case 22:
                {
                alt46=3;
                }
                break;
            case 23:
                {
                alt46=4;
                }
                break;
            case 24:
                {
                alt46=5;
                }
                break;
            case 25:
                {
                alt46=6;
                }
                break;
            case 26:
                {
                alt46=7;
                }
                break;
            case 36:
                {
                alt46=8;
                }
                break;
            case 37:
                {
                alt46=9;
                }
                break;
            case 38:
                {
                alt46=10;
                }
                break;
            case 40:
                {
                alt46=11;
                }
                break;
            case 42:
                {
                alt46=12;
                }
                break;
            case 45:
                {
                alt46=13;
                }
                break;
            case 49:
                {
                alt46=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2328:5: this_WordMeaning_0= ruleWordMeaning
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getWordMeaningParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWordMeaning_in_ruleRTCElement4784);
                    this_WordMeaning_0=ruleWordMeaning();

                    state._fsp--;

                     
                            current = this_WordMeaning_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2338:5: this_QuestionAnswer_1= ruleQuestionAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getQuestionAnswerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQuestionAnswer_in_ruleRTCElement4811);
                    this_QuestionAnswer_1=ruleQuestionAnswer();

                    state._fsp--;

                     
                            current = this_QuestionAnswer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2348:5: this_FIB_2= ruleFIB
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getFIBParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFIB_in_ruleRTCElement4838);
                    this_FIB_2=ruleFIB();

                    state._fsp--;

                     
                            current = this_FIB_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2358:5: this_Definition_3= ruleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDefinition_in_ruleRTCElement4865);
                    this_Definition_3=ruleDefinition();

                    state._fsp--;

                     
                            current = this_Definition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2368:5: this_Character_4= ruleCharacter
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getCharacterParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCharacter_in_ruleRTCElement4892);
                    this_Character_4=ruleCharacter();

                    state._fsp--;

                     
                            current = this_Character_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2378:5: this_TeacherNote_5= ruleTeacherNote
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getTeacherNoteParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTeacherNote_in_ruleRTCElement4919);
                    this_TeacherNote_5=ruleTeacherNote();

                    state._fsp--;

                     
                            current = this_TeacherNote_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2388:5: this_Matching_6= ruleMatching
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getMatchingParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleMatching_in_ruleRTCElement4946);
                    this_Matching_6=ruleMatching();

                    state._fsp--;

                     
                            current = this_Matching_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2398:5: this_Event_7= ruleEvent
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getEventParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleEvent_in_ruleRTCElement4973);
                    this_Event_7=ruleEvent();

                    state._fsp--;

                     
                            current = this_Event_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2408:5: this_TrueFalse_8= ruleTrueFalse
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getTrueFalseParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleTrueFalse_in_ruleRTCElement5000);
                    this_TrueFalse_8=ruleTrueFalse();

                    state._fsp--;

                     
                            current = this_TrueFalse_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2418:5: this_ChemEquation_9= ruleChemEquation
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getChemEquationParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleChemEquation_in_ruleRTCElement5027);
                    this_ChemEquation_9=ruleChemEquation();

                    state._fsp--;

                     
                            current = this_ChemEquation_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2428:5: this_ChemCompound_10= ruleChemCompound
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getChemCompoundParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleChemCompound_in_ruleRTCElement5054);
                    this_ChemCompound_10=ruleChemCompound();

                    state._fsp--;

                     
                            current = this_ChemCompound_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2438:5: this_ImageLabel_11= ruleImageLabel
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getImageLabelParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleImageLabel_in_ruleRTCElement5081);
                    this_ImageLabel_11=ruleImageLabel();

                    state._fsp--;

                     
                            current = this_ImageLabel_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2448:5: this_Equation_12= ruleEquation
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getEquationParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleEquation_in_ruleRTCElement5108);
                    this_Equation_12=ruleEquation();

                    state._fsp--;

                     
                            current = this_Equation_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2458:5: this_MultiChoice_13= ruleMultiChoice
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getMultiChoiceParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleMultiChoice_in_ruleRTCElement5135);
                    this_MultiChoice_13=ruleMultiChoice();

                    state._fsp--;

                     
                            current = this_MultiChoice_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRTCElement"


    // $ANTLR start "entryRuleMultiChoice"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2474:1: entryRuleMultiChoice returns [EObject current=null] : iv_ruleMultiChoice= ruleMultiChoice EOF ;
    public final EObject entryRuleMultiChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiChoice = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2475:2: (iv_ruleMultiChoice= ruleMultiChoice EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2476:2: iv_ruleMultiChoice= ruleMultiChoice EOF
            {
             newCompositeNode(grammarAccess.getMultiChoiceRule()); 
            pushFollow(FOLLOW_ruleMultiChoice_in_entryRuleMultiChoice5170);
            iv_ruleMultiChoice=ruleMultiChoice();

            state._fsp--;

             current =iv_ruleMultiChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiChoice5180); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiChoice"


    // $ANTLR start "ruleMultiChoice"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2483:1: ruleMultiChoice returns [EObject current=null] : (otherlv_0= '@multi_choice' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '@options' otherlv_5= '{' ( (lv_options_6_0= ruleOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )* otherlv_9= '}' (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )? (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )? (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleMultiChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_question_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_numOptionsToShow_11_0=null;
        Token otherlv_12=null;
        Token lv_numOptionsPerRow_13_0=null;
        Token otherlv_14=null;
        Token lv_explanation_15_0=null;
        Token otherlv_16=null;
        EObject lv_options_6_0 = null;

        EObject lv_options_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2486:28: ( (otherlv_0= '@multi_choice' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '@options' otherlv_5= '{' ( (lv_options_6_0= ruleOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )* otherlv_9= '}' (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )? (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )? (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )? otherlv_16= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2487:1: (otherlv_0= '@multi_choice' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '@options' otherlv_5= '{' ( (lv_options_6_0= ruleOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )* otherlv_9= '}' (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )? (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )? (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )? otherlv_16= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2487:1: (otherlv_0= '@multi_choice' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '@options' otherlv_5= '{' ( (lv_options_6_0= ruleOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )* otherlv_9= '}' (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )? (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )? (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )? otherlv_16= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2487:3: otherlv_0= '@multi_choice' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '@options' otherlv_5= '{' ( (lv_options_6_0= ruleOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )* otherlv_9= '}' (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )? (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )? (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleMultiChoice5217); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiChoiceAccess().getMulti_choiceKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2491:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==20) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2492:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2492:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2493:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleMultiChoice5235); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getMultiChoiceAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiChoiceRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2506:3: ( (lv_question_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2507:1: (lv_question_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2507:1: (lv_question_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2508:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultiChoice5266); 

            			newLeafNode(lv_question_2_0, grammarAccess.getMultiChoiceAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiChoiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleMultiChoice5283); 

                	newLeafNode(otherlv_3, grammarAccess.getMultiChoiceAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleMultiChoice5295); 

                	newLeafNode(otherlv_4, grammarAccess.getMultiChoiceAccess().getOptionsKeyword_4());
                
            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleMultiChoice5307); 

                	newLeafNode(otherlv_5, grammarAccess.getMultiChoiceAccess().getLeftCurlyBracketKeyword_5());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2536:1: ( (lv_options_6_0= ruleOption ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2537:1: (lv_options_6_0= ruleOption )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2537:1: (lv_options_6_0= ruleOption )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2538:3: lv_options_6_0= ruleOption
            {
             
            	        newCompositeNode(grammarAccess.getMultiChoiceAccess().getOptionsOptionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleOption_in_ruleMultiChoice5328);
            lv_options_6_0=ruleOption();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiChoiceRule());
            	        }
                   		add(
                   			current, 
                   			"options",
                    		lv_options_6_0, 
                    		"Option");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2554:2: (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==44) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2554:4: otherlv_7= ',' ( (lv_options_8_0= ruleOption ) )
            	    {
            	    otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleMultiChoice5341); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMultiChoiceAccess().getCommaKeyword_7_0());
            	        
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2558:1: ( (lv_options_8_0= ruleOption ) )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2559:1: (lv_options_8_0= ruleOption )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2559:1: (lv_options_8_0= ruleOption )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2560:3: lv_options_8_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiChoiceAccess().getOptionsOptionParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOption_in_ruleMultiChoice5362);
            	    lv_options_8_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiChoiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_8_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleMultiChoice5376); 

                	newLeafNode(otherlv_9, grammarAccess.getMultiChoiceAccess().getRightCurlyBracketKeyword_8());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2580:1: (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==34) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2580:3: otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_34_in_ruleMultiChoice5389); 

                        	newLeafNode(otherlv_10, grammarAccess.getMultiChoiceAccess().getNumOptionsToShowKeyword_9_0());
                        
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2584:1: ( (lv_numOptionsToShow_11_0= RULE_INT ) )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2585:1: (lv_numOptionsToShow_11_0= RULE_INT )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2585:1: (lv_numOptionsToShow_11_0= RULE_INT )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2586:3: lv_numOptionsToShow_11_0= RULE_INT
                    {
                    lv_numOptionsToShow_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMultiChoice5406); 

                    			newLeafNode(lv_numOptionsToShow_11_0, grammarAccess.getMultiChoiceAccess().getNumOptionsToShowINTTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiChoiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"numOptionsToShow",
                            		lv_numOptionsToShow_11_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2602:4: (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==35) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2602:6: otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_35_in_ruleMultiChoice5426); 

                        	newLeafNode(otherlv_12, grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowKeyword_10_0());
                        
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2606:1: ( (lv_numOptionsPerRow_13_0= RULE_INT ) )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2607:1: (lv_numOptionsPerRow_13_0= RULE_INT )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2607:1: (lv_numOptionsPerRow_13_0= RULE_INT )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2608:3: lv_numOptionsPerRow_13_0= RULE_INT
                    {
                    lv_numOptionsPerRow_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMultiChoice5443); 

                    			newLeafNode(lv_numOptionsPerRow_13_0, grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowINTTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiChoiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"numOptionsPerRow",
                            		lv_numOptionsPerRow_13_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2624:4: (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==51) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2624:6: otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,51,FOLLOW_51_in_ruleMultiChoice5463); 

                        	newLeafNode(otherlv_14, grammarAccess.getMultiChoiceAccess().getExplanationKeyword_11_0());
                        
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2628:1: ( (lv_explanation_15_0= RULE_STRING ) )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2629:1: (lv_explanation_15_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2629:1: (lv_explanation_15_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2630:3: lv_explanation_15_0= RULE_STRING
                    {
                    lv_explanation_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultiChoice5480); 

                    			newLeafNode(lv_explanation_15_0, grammarAccess.getMultiChoiceAccess().getExplanationSTRINGTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiChoiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"explanation",
                            		lv_explanation_15_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,29,FOLLOW_29_in_ruleMultiChoice5499); 

                	newLeafNode(otherlv_16, grammarAccess.getMultiChoiceAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiChoice"


    // $ANTLR start "entryRuleExercise"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2658:1: entryRuleExercise returns [EObject current=null] : iv_ruleExercise= ruleExercise EOF ;
    public final EObject entryRuleExercise() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExercise = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2659:2: (iv_ruleExercise= ruleExercise EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2660:2: iv_ruleExercise= ruleExercise EOF
            {
             newCompositeNode(grammarAccess.getExerciseRule()); 
            pushFollow(FOLLOW_ruleExercise_in_entryRuleExercise5535);
            iv_ruleExercise=ruleExercise();

            state._fsp--;

             current =iv_ruleExercise; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExercise5545); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExercise"


    // $ANTLR start "ruleExercise"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2667:1: ruleExercise returns [EObject current=null] : (otherlv_0= '@exercise' ( (lv_hideFromView_1_0= 'hide' ) )? (otherlv_2= 'marks' otherlv_3= '=' ( (lv_marks_4_0= RULE_INT ) ) ) ( (lv_question_5_0= RULE_STRING ) ) (otherlv_6= 'hints' otherlv_7= '{' ( (lv_hints_8_0= RULE_STRING ) )+ otherlv_9= '}' )? (otherlv_10= 'answer' ( (lv_answer_11_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleExercise() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_marks_4_0=null;
        Token lv_question_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_hints_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_answer_11_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2670:28: ( (otherlv_0= '@exercise' ( (lv_hideFromView_1_0= 'hide' ) )? (otherlv_2= 'marks' otherlv_3= '=' ( (lv_marks_4_0= RULE_INT ) ) ) ( (lv_question_5_0= RULE_STRING ) ) (otherlv_6= 'hints' otherlv_7= '{' ( (lv_hints_8_0= RULE_STRING ) )+ otherlv_9= '}' )? (otherlv_10= 'answer' ( (lv_answer_11_0= RULE_STRING ) ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2671:1: (otherlv_0= '@exercise' ( (lv_hideFromView_1_0= 'hide' ) )? (otherlv_2= 'marks' otherlv_3= '=' ( (lv_marks_4_0= RULE_INT ) ) ) ( (lv_question_5_0= RULE_STRING ) ) (otherlv_6= 'hints' otherlv_7= '{' ( (lv_hints_8_0= RULE_STRING ) )+ otherlv_9= '}' )? (otherlv_10= 'answer' ( (lv_answer_11_0= RULE_STRING ) ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2671:1: (otherlv_0= '@exercise' ( (lv_hideFromView_1_0= 'hide' ) )? (otherlv_2= 'marks' otherlv_3= '=' ( (lv_marks_4_0= RULE_INT ) ) ) ( (lv_question_5_0= RULE_STRING ) ) (otherlv_6= 'hints' otherlv_7= '{' ( (lv_hints_8_0= RULE_STRING ) )+ otherlv_9= '}' )? (otherlv_10= 'answer' ( (lv_answer_11_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2671:3: otherlv_0= '@exercise' ( (lv_hideFromView_1_0= 'hide' ) )? (otherlv_2= 'marks' otherlv_3= '=' ( (lv_marks_4_0= RULE_INT ) ) ) ( (lv_question_5_0= RULE_STRING ) ) (otherlv_6= 'hints' otherlv_7= '{' ( (lv_hints_8_0= RULE_STRING ) )+ otherlv_9= '}' )? (otherlv_10= 'answer' ( (lv_answer_11_0= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleExercise5582); 

                	newLeafNode(otherlv_0, grammarAccess.getExerciseAccess().getExerciseKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2675:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==20) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2676:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2676:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2677:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleExercise5600); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getExerciseAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExerciseRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2690:3: (otherlv_2= 'marks' otherlv_3= '=' ( (lv_marks_4_0= RULE_INT ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2690:5: otherlv_2= 'marks' otherlv_3= '=' ( (lv_marks_4_0= RULE_INT ) )
            {
            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleExercise5627); 

                	newLeafNode(otherlv_2, grammarAccess.getExerciseAccess().getMarksKeyword_2_0());
                
            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleExercise5639); 

                	newLeafNode(otherlv_3, grammarAccess.getExerciseAccess().getEqualsSignKeyword_2_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2698:1: ( (lv_marks_4_0= RULE_INT ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2699:1: (lv_marks_4_0= RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2699:1: (lv_marks_4_0= RULE_INT )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2700:3: lv_marks_4_0= RULE_INT
            {
            lv_marks_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExercise5656); 

            			newLeafNode(lv_marks_4_0, grammarAccess.getExerciseAccess().getMarksINTTerminalRuleCall_2_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExerciseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"marks",
                    		lv_marks_4_0, 
                    		"INT");
            	    

            }


            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2716:3: ( (lv_question_5_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2717:1: (lv_question_5_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2717:1: (lv_question_5_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2718:3: lv_question_5_0= RULE_STRING
            {
            lv_question_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExercise5679); 

            			newLeafNode(lv_question_5_0, grammarAccess.getExerciseAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExerciseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2734:2: (otherlv_6= 'hints' otherlv_7= '{' ( (lv_hints_8_0= RULE_STRING ) )+ otherlv_9= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==54) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2734:4: otherlv_6= 'hints' otherlv_7= '{' ( (lv_hints_8_0= RULE_STRING ) )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleExercise5697); 

                        	newLeafNode(otherlv_6, grammarAccess.getExerciseAccess().getHintsKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleExercise5709); 

                        	newLeafNode(otherlv_7, grammarAccess.getExerciseAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2742:1: ( (lv_hints_8_0= RULE_STRING ) )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==RULE_STRING) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2743:1: (lv_hints_8_0= RULE_STRING )
                    	    {
                    	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2743:1: (lv_hints_8_0= RULE_STRING )
                    	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2744:3: lv_hints_8_0= RULE_STRING
                    	    {
                    	    lv_hints_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExercise5726); 

                    	    			newLeafNode(lv_hints_8_0, grammarAccess.getExerciseAccess().getHintsSTRINGTerminalRuleCall_4_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getExerciseRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"hints",
                    	            		lv_hints_8_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt53 >= 1 ) break loop53;
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                throw eee;
                        }
                        cnt53++;
                    } while (true);

                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleExercise5744); 

                        	newLeafNode(otherlv_9, grammarAccess.getExerciseAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2764:3: (otherlv_10= 'answer' ( (lv_answer_11_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2764:5: otherlv_10= 'answer' ( (lv_answer_11_0= RULE_STRING ) )
            {
            otherlv_10=(Token)match(input,55,FOLLOW_55_in_ruleExercise5759); 

                	newLeafNode(otherlv_10, grammarAccess.getExerciseAccess().getAnswerKeyword_5_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2768:1: ( (lv_answer_11_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2769:1: (lv_answer_11_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2769:1: (lv_answer_11_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2770:3: lv_answer_11_0= RULE_STRING
            {
            lv_answer_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExercise5776); 

            			newLeafNode(lv_answer_11_0, grammarAccess.getExerciseAccess().getAnswerSTRINGTerminalRuleCall_5_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExerciseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"answer",
                    		lv_answer_11_0, 
                    		"STRING");
            	    

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExercise"


    // $ANTLR start "entryRuleOption"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2794:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2795:2: (iv_ruleOption= ruleOption EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2796:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption5818);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption5828); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2803:1: ruleOption returns [EObject current=null] : ( ( (lv_optionValue_0_0= RULE_STRING ) ) ( (lv_correctOption_1_0= 'correct' ) )? ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token lv_optionValue_0_0=null;
        Token lv_correctOption_1_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2806:28: ( ( ( (lv_optionValue_0_0= RULE_STRING ) ) ( (lv_correctOption_1_0= 'correct' ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2807:1: ( ( (lv_optionValue_0_0= RULE_STRING ) ) ( (lv_correctOption_1_0= 'correct' ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2807:1: ( ( (lv_optionValue_0_0= RULE_STRING ) ) ( (lv_correctOption_1_0= 'correct' ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2807:2: ( (lv_optionValue_0_0= RULE_STRING ) ) ( (lv_correctOption_1_0= 'correct' ) )?
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2807:2: ( (lv_optionValue_0_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2808:1: (lv_optionValue_0_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2808:1: (lv_optionValue_0_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2809:3: lv_optionValue_0_0= RULE_STRING
            {
            lv_optionValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOption5870); 

            			newLeafNode(lv_optionValue_0_0, grammarAccess.getOptionAccess().getOptionValueSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"optionValue",
                    		lv_optionValue_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2825:2: ( (lv_correctOption_1_0= 'correct' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==56) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2826:1: (lv_correctOption_1_0= 'correct' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2826:1: (lv_correctOption_1_0= 'correct' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2827:3: lv_correctOption_1_0= 'correct'
                    {
                    lv_correctOption_1_0=(Token)match(input,56,FOLLOW_56_in_ruleOption5893); 

                            newLeafNode(lv_correctOption_1_0, grammarAccess.getOptionAccess().getCorrectOptionCorrectKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOptionRule());
                    	        }
                           		setWithLastConsumed(current, "correctOption", lv_correctOption_1_0, "correct");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleCMap"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2848:1: entryRuleCMap returns [EObject current=null] : iv_ruleCMap= ruleCMap EOF ;
    public final EObject entryRuleCMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCMap = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2849:2: (iv_ruleCMap= ruleCMap EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2850:2: iv_ruleCMap= ruleCMap EOF
            {
             newCompositeNode(grammarAccess.getCMapRule()); 
            pushFollow(FOLLOW_ruleCMap_in_entryRuleCMap5943);
            iv_ruleCMap=ruleCMap();

            state._fsp--;

             current =iv_ruleCMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCMap5953); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCMap"


    // $ANTLR start "ruleCMap"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2857:1: ruleCMap returns [EObject current=null] : (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleCMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2860:28: ( (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2861:1: (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2861:1: (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2861:3: otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleCMap5990); 

                	newLeafNode(otherlv_0, grammarAccess.getCMapAccess().getCmapKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleCMap6002); 

                	newLeafNode(otherlv_1, grammarAccess.getCMapAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2869:1: ( (lv_content_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2870:1: (lv_content_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2870:1: (lv_content_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2871:3: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCMap6019); 

            			newLeafNode(lv_content_2_0, grammarAccess.getCMapAccess().getContentSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCMapRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleCMap6036); 

                	newLeafNode(otherlv_3, grammarAccess.getCMapAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCMap"


    // $ANTLR start "entryRuleScript"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2899:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2900:2: (iv_ruleScript= ruleScript EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2901:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript6072);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript6082); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2908:1: ruleScript returns [EObject current=null] : (otherlv_0= 'script_expressions' otherlv_1= '{' ( (lv_evalVars_2_0= ruleEvalVar ) ) (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )* otherlv_5= '}' ( (lv_scriptBody_6_0= ruleScriptBody ) )? ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_evalVars_2_0 = null;

        EObject lv_evalVars_4_0 = null;

        EObject lv_scriptBody_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2911:28: ( (otherlv_0= 'script_expressions' otherlv_1= '{' ( (lv_evalVars_2_0= ruleEvalVar ) ) (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )* otherlv_5= '}' ( (lv_scriptBody_6_0= ruleScriptBody ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2912:1: (otherlv_0= 'script_expressions' otherlv_1= '{' ( (lv_evalVars_2_0= ruleEvalVar ) ) (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )* otherlv_5= '}' ( (lv_scriptBody_6_0= ruleScriptBody ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2912:1: (otherlv_0= 'script_expressions' otherlv_1= '{' ( (lv_evalVars_2_0= ruleEvalVar ) ) (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )* otherlv_5= '}' ( (lv_scriptBody_6_0= ruleScriptBody ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2912:3: otherlv_0= 'script_expressions' otherlv_1= '{' ( (lv_evalVars_2_0= ruleEvalVar ) ) (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )* otherlv_5= '}' ( (lv_scriptBody_6_0= ruleScriptBody ) )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleScript6119); 

                	newLeafNode(otherlv_0, grammarAccess.getScriptAccess().getScript_expressionsKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleScript6131); 

                	newLeafNode(otherlv_1, grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2920:1: ( (lv_evalVars_2_0= ruleEvalVar ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2921:1: (lv_evalVars_2_0= ruleEvalVar )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2921:1: (lv_evalVars_2_0= ruleEvalVar )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2922:3: lv_evalVars_2_0= ruleEvalVar
            {
             
            	        newCompositeNode(grammarAccess.getScriptAccess().getEvalVarsEvalVarParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEvalVar_in_ruleScript6152);
            lv_evalVars_2_0=ruleEvalVar();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	        }
                   		add(
                   			current, 
                   			"evalVars",
                    		lv_evalVars_2_0, 
                    		"EvalVar");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2938:2: (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==44) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2938:4: otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) )
            	    {
            	    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleScript6165); 

            	        	newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2942:1: ( (lv_evalVars_4_0= ruleEvalVar ) )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2943:1: (lv_evalVars_4_0= ruleEvalVar )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2943:1: (lv_evalVars_4_0= ruleEvalVar )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2944:3: lv_evalVars_4_0= ruleEvalVar
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScriptAccess().getEvalVarsEvalVarParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvalVar_in_ruleScript6186);
            	    lv_evalVars_4_0=ruleEvalVar();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"evalVars",
            	            		lv_evalVars_4_0, 
            	            		"EvalVar");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleScript6200); 

                	newLeafNode(otherlv_5, grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_4());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2964:1: ( (lv_scriptBody_6_0= ruleScriptBody ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==59) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2965:1: (lv_scriptBody_6_0= ruleScriptBody )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2965:1: (lv_scriptBody_6_0= ruleScriptBody )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2966:3: lv_scriptBody_6_0= ruleScriptBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getScriptAccess().getScriptBodyScriptBodyParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScriptBody_in_ruleScript6221);
                    lv_scriptBody_6_0=ruleScriptBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScriptRule());
                    	        }
                           		set(
                           			current, 
                           			"scriptBody",
                            		lv_scriptBody_6_0, 
                            		"ScriptBody");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleEvalVar"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2990:1: entryRuleEvalVar returns [EObject current=null] : iv_ruleEvalVar= ruleEvalVar EOF ;
    public final EObject entryRuleEvalVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvalVar = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2991:2: (iv_ruleEvalVar= ruleEvalVar EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2992:2: iv_ruleEvalVar= ruleEvalVar EOF
            {
             newCompositeNode(grammarAccess.getEvalVarRule()); 
            pushFollow(FOLLOW_ruleEvalVar_in_entryRuleEvalVar6258);
            iv_ruleEvalVar=ruleEvalVar();

            state._fsp--;

             current =iv_ruleEvalVar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvalVar6268); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvalVar"


    // $ANTLR start "ruleEvalVar"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2999:1: ruleEvalVar returns [EObject current=null] : ( ( (lv_varName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_varExpression_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEvalVar() throws RecognitionException {
        EObject current = null;

        Token lv_varName_0_0=null;
        Token otherlv_1=null;
        Token lv_varExpression_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3002:28: ( ( ( (lv_varName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_varExpression_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3003:1: ( ( (lv_varName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_varExpression_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3003:1: ( ( (lv_varName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_varExpression_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3003:2: ( (lv_varName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_varExpression_2_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3003:2: ( (lv_varName_0_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3004:1: (lv_varName_0_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3004:1: (lv_varName_0_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3005:3: lv_varName_0_0= RULE_STRING
            {
            lv_varName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvalVar6310); 

            			newLeafNode(lv_varName_0_0, grammarAccess.getEvalVarAccess().getVarNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEvalVarRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleEvalVar6327); 

                	newLeafNode(otherlv_1, grammarAccess.getEvalVarAccess().getEqualsSignKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3025:1: ( (lv_varExpression_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3026:1: (lv_varExpression_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3026:1: (lv_varExpression_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3027:3: lv_varExpression_2_0= RULE_STRING
            {
            lv_varExpression_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvalVar6344); 

            			newLeafNode(lv_varExpression_2_0, grammarAccess.getEvalVarAccess().getVarExpressionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEvalVarRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varExpression",
                    		lv_varExpression_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvalVar"


    // $ANTLR start "entryRuleScriptBody"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3051:1: entryRuleScriptBody returns [EObject current=null] : iv_ruleScriptBody= ruleScriptBody EOF ;
    public final EObject entryRuleScriptBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptBody = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3052:2: (iv_ruleScriptBody= ruleScriptBody EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3053:2: iv_ruleScriptBody= ruleScriptBody EOF
            {
             newCompositeNode(grammarAccess.getScriptBodyRule()); 
            pushFollow(FOLLOW_ruleScriptBody_in_entryRuleScriptBody6385);
            iv_ruleScriptBody=ruleScriptBody();

            state._fsp--;

             current =iv_ruleScriptBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScriptBody6395); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScriptBody"


    // $ANTLR start "ruleScriptBody"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3060:1: ruleScriptBody returns [EObject current=null] : (otherlv_0= 'script' otherlv_1= '{' ( (lv_script_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleScriptBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_script_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3063:28: ( (otherlv_0= 'script' otherlv_1= '{' ( (lv_script_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3064:1: (otherlv_0= 'script' otherlv_1= '{' ( (lv_script_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3064:1: (otherlv_0= 'script' otherlv_1= '{' ( (lv_script_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3064:3: otherlv_0= 'script' otherlv_1= '{' ( (lv_script_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleScriptBody6432); 

                	newLeafNode(otherlv_0, grammarAccess.getScriptBodyAccess().getScriptKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleScriptBody6444); 

                	newLeafNode(otherlv_1, grammarAccess.getScriptBodyAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3072:1: ( (lv_script_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3073:1: (lv_script_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3073:1: (lv_script_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:3074:3: lv_script_2_0= RULE_STRING
            {
            lv_script_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScriptBody6461); 

            			newLeafNode(lv_script_2_0, grammarAccess.getScriptBodyAccess().getScriptSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScriptBodyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"script",
                    		lv_script_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleScriptBody6478); 

                	newLeafNode(otherlv_3, grammarAccess.getScriptBodyAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScriptBody"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleJoveNotes_in_entryRuleJoveNotes75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoveNotes85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessingHints_in_ruleJoveNotes131 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleChapterDetails_in_ruleJoveNotes152 = new BitSet(new long[]{0x0012A77007E80002L});
    public static final BitSet FOLLOW_ruleNotesElement_in_ruleJoveNotes173 = new BitSet(new long[]{0x0012A77007E80002L});
    public static final BitSet FOLLOW_ruleProcessingHints_in_entryRuleProcessingHints210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessingHints220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleProcessingHints272 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleProcessingHints304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapterDetails_in_entryRuleChapterDetails354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChapterDetails364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleChapterDetails407 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleChapterDetails433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChapterDetails450 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleChapterDetails467 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleChapterDetails484 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleChapterDetails501 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleChapterDetails518 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleChapterDetails535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChapterDetails552 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleScriptBody_in_ruleChapterDetails578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotesElement_in_entryRuleNotesElement615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotesElement625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMeaning_in_ruleNotesElement673 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_ruleNotesElement700 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleFIB_in_ruleNotesElement727 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleNotesElement754 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_ruleNotesElement781 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleTeacherNote_in_ruleNotesElement808 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleMatching_in_ruleNotesElement835 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleNotesElement862 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleTrueFalse_in_ruleNotesElement889 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleChemEquation_in_ruleNotesElement916 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleChemCompound_in_ruleNotesElement943 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleSpellbee_in_ruleNotesElement970 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleImageLabel_in_ruleNotesElement997 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_ruleNotesElement1024 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleRefToContext_in_ruleNotesElement1051 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleMultiChoice_in_ruleNotesElement1078 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleExercise_in_ruleNotesElement1105 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_ruleNotesElement1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMeaning_in_entryRuleWordMeaning1163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordMeaning1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleWordMeaning1210 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleWordMeaning1228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWordMeaning1259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWordMeaning1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_entryRuleQuestionAnswer1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionAnswer1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleQuestionAnswer1369 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleQuestionAnswer1387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestionAnswer1418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestionAnswer1440 = new BitSet(new long[]{0x0200000000000012L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleQuestionAnswer1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFIB_in_entryRuleFIB1504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFIB1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFIB1551 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleFIB1569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFIB1600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFIB1622 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition1664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDefinition1711 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleDefinition1729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefinition1760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefinition1782 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleDefinition1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_entryRuleCharacter1845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharacter1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCharacter1892 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleCharacter1910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharacter1941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharacter1963 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleCharacter1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeacherNote_in_entryRuleTeacherNote2026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTeacherNote2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTeacherNote2073 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleTeacherNote2091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTeacherNote2122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTeacherNote2145 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleTeacherNote2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatching_in_entryRuleMatching2208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatching2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMatching2255 = new BitSet(new long[]{0x0000000018100010L});
    public static final BitSet FOLLOW_20_in_ruleMatching2273 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_27_in_ruleMatching2305 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatching2336 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMatching2354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMatchPair_in_ruleMatching2375 = new BitSet(new long[]{0x00000000A0000010L});
    public static final BitSet FOLLOW_ruleMatchMCQConfig_in_ruleMatching2397 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMatching2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchPair_in_entryRuleMatchPair2446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchPair2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatchPair2498 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMatchPair2515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatchPair2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchMCQConfig_in_entryRuleMatchMCQConfig2573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchMCQConfig2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMatchMCQConfig2620 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMatchMCQConfig2632 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleMatchMCQConfig2644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatchMCQConfig2661 = new BitSet(new long[]{0x0000000E20000000L});
    public static final BitSet FOLLOW_33_in_ruleMatchMCQConfig2679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatchMCQConfig2696 = new BitSet(new long[]{0x0000000C20000000L});
    public static final BitSet FOLLOW_34_in_ruleMatchMCQConfig2716 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMatchMCQConfig2733 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_35_in_ruleMatchMCQConfig2753 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMatchMCQConfig2770 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMatchMCQConfig2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent2825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleEvent2872 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleEvent2890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent2921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueFalse_in_entryRuleTrueFalse2984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrueFalse2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTrueFalse3031 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleTrueFalse3049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTrueFalse3080 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleTrueFalse3102 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTrueFalse3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemEquation_in_entryRuleChemEquation3166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChemEquation3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleChemEquation3213 = new BitSet(new long[]{0x0000000010100010L});
    public static final BitSet FOLLOW_20_in_ruleChemEquation3231 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation3262 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleChemEquation3280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation3297 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleChemEquation3314 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation3331 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleChemEquation3349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation3366 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleChemEquation3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemCompound_in_entryRuleChemCompound3419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChemCompound3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleChemCompound3466 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleChemCompound3484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemCompound3515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemCompound3537 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemCompound3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpellbee_in_entryRuleSpellbee3601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpellbee3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleSpellbee3648 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleSpellbee3666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpellbee3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageLabel_in_entryRuleImageLabel3738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageLabel3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleImageLabel3785 = new BitSet(new long[]{0x0000000010100010L});
    public static final BitSet FOLLOW_20_in_ruleImageLabel3803 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageLabel3834 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleImageLabel3852 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleImageLabel3864 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageLabel3881 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHotSpot_in_ruleImageLabel3907 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_44_in_ruleImageLabel3920 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHotSpot_in_ruleImageLabel3941 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_29_in_ruleImageLabel3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHotSpot_in_entryRuleHotSpot3991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHotSpot4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHotSpot4043 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleHotSpot4060 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHotSpot4077 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleHotSpot4094 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHotSpot4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation4152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquation4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleEquation4199 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleEquation4217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEquation4248 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEquation4265 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEquation4282 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEquation4300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_ruleEquation4321 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_44_in_ruleEquation4334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_ruleEquation4355 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_29_in_ruleEquation4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_entryRuleEqSymbol4405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqSymbol4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqSymbol4457 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEqSymbol4474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqSymbol4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefToContext_in_entryRuleRefToContext4532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefToContext4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleRefToContext4579 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_20_in_ruleRefToContext4597 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRefToContext4623 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleRefToContext4635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRefToContext4652 = new BitSet(new long[]{0x0002257007E80000L});
    public static final BitSet FOLLOW_ruleRTCElement_in_ruleRefToContext4678 = new BitSet(new long[]{0x0002257027E80000L});
    public static final BitSet FOLLOW_29_in_ruleRefToContext4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTCElement_in_entryRuleRTCElement4727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTCElement4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMeaning_in_ruleRTCElement4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_ruleRTCElement4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFIB_in_ruleRTCElement4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleRTCElement4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_ruleRTCElement4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeacherNote_in_ruleRTCElement4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatching_in_ruleRTCElement4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleRTCElement4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueFalse_in_ruleRTCElement5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemEquation_in_ruleRTCElement5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemCompound_in_ruleRTCElement5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageLabel_in_ruleRTCElement5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_ruleRTCElement5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiChoice_in_ruleRTCElement5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiChoice_in_entryRuleMultiChoice5170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiChoice5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleMultiChoice5217 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleMultiChoice5235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiChoice5266 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMultiChoice5283 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleMultiChoice5295 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMultiChoice5307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOption_in_ruleMultiChoice5328 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_44_in_ruleMultiChoice5341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOption_in_ruleMultiChoice5362 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_29_in_ruleMultiChoice5376 = new BitSet(new long[]{0x0008000C20000000L});
    public static final BitSet FOLLOW_34_in_ruleMultiChoice5389 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMultiChoice5406 = new BitSet(new long[]{0x0008000820000000L});
    public static final BitSet FOLLOW_35_in_ruleMultiChoice5426 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMultiChoice5443 = new BitSet(new long[]{0x0008000020000000L});
    public static final BitSet FOLLOW_51_in_ruleMultiChoice5463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiChoice5480 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMultiChoice5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExercise_in_entryRuleExercise5535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExercise5545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleExercise5582 = new BitSet(new long[]{0x0020000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExercise5600 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleExercise5627 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleExercise5639 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExercise5656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExercise5679 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_54_in_ruleExercise5697 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleExercise5709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExercise5726 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_29_in_ruleExercise5744 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleExercise5759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExercise5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption5818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOption5870 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOption5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_entryRuleCMap5943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCMap5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCMap5990 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCMap6002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCMap6019 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCMap6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript6072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript6082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleScript6119 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleScript6131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvalVar_in_ruleScript6152 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_44_in_ruleScript6165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvalVar_in_ruleScript6186 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_29_in_ruleScript6200 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleScriptBody_in_ruleScript6221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvalVar_in_entryRuleEvalVar6258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvalVar6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvalVar6310 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEvalVar6327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvalVar6344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptBody_in_entryRuleScriptBody6385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScriptBody6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleScriptBody6432 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleScriptBody6444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScriptBody6461 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleScriptBody6478 = new BitSet(new long[]{0x0000000000000002L});

}