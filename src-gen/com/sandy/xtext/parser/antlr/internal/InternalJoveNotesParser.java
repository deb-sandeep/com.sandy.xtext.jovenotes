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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@skip_generation'", "'@skip_generation_in_production'", "'@test_paper'", "'subject'", "'chapterNumber'", "'.'", "'chapterName'", "'@wm'", "'hide'", "'@qa'", "'@fib'", "'@definition'", "'@character'", "'@tn'", "'@match'", "'skip_reverse_question'", "'{'", "'}'", "'='", "'@mcq_config'", "'@forwardCaption'", "'@reverseCaption'", "'@numOptionsToShow'", "'@numOptionsPerRow'", "'@event'", "'@true_false'", "'@chem_equation'", "'>'", "'@chem_compound'", "'@spellbee'", "'@image_label'", "'imageName'", "','", "'@equation'", "'where'", "'@rtc'", "'context'", "'@multi_choice'", "'@options'", "'@explanation'", "'correct'", "'cmap'", "'script_expressions'", "'script'"
    };
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_BOOL=6;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

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

                if ( (LA1_0==19||(LA1_0>=21 && LA1_0<=26)||(LA1_0>=36 && LA1_0<=38)||(LA1_0>=40 && LA1_0<=42)||LA1_0==45||LA1_0==47||LA1_0==49) ) {
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:208:1: ruleChapterDetails returns [EObject current=null] : ( ( (lv_testPaper_0_0= '@test_paper' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ( (lv_scriptBody_9_0= ruleScriptBody ) )? ) ;
    public final EObject ruleChapterDetails() throws RecognitionException {
        EObject current = null;

        Token lv_testPaper_0_0=null;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:211:28: ( ( ( (lv_testPaper_0_0= '@test_paper' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ( (lv_scriptBody_9_0= ruleScriptBody ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:212:1: ( ( (lv_testPaper_0_0= '@test_paper' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ( (lv_scriptBody_9_0= ruleScriptBody ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:212:1: ( ( (lv_testPaper_0_0= '@test_paper' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ( (lv_scriptBody_9_0= ruleScriptBody ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:212:2: ( (lv_testPaper_0_0= '@test_paper' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ( (lv_scriptBody_9_0= ruleScriptBody ) )?
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:212:2: ( (lv_testPaper_0_0= '@test_paper' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:213:1: (lv_testPaper_0_0= '@test_paper' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:213:1: (lv_testPaper_0_0= '@test_paper' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:214:3: lv_testPaper_0_0= '@test_paper'
                    {
                    lv_testPaper_0_0=(Token)match(input,14,FOLLOW_14_in_ruleChapterDetails407); 

                            newLeafNode(lv_testPaper_0_0, grammarAccess.getChapterDetailsAccess().getTestPaperTest_paperKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChapterDetailsRule());
                    	        }
                           		setWithLastConsumed(current, "testPaper", lv_testPaper_0_0, "@test_paper");
                    	    

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

            if ( (LA5_0==55) ) {
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:350:1: ruleNotesElement returns [EObject current=null] : ( (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice ) ( (lv_script_16_0= ruleScript ) )? ) ;
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

        EObject lv_script_16_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:353:28: ( ( (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice ) ( (lv_script_16_0= ruleScript ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:354:1: ( (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice ) ( (lv_script_16_0= ruleScript ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:354:1: ( (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice ) ( (lv_script_16_0= ruleScript ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:354:2: (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice ) ( (lv_script_16_0= ruleScript ) )?
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:354:2: (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice )
            int alt6=16;
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

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:513:2: ( (lv_script_16_0= ruleScript ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==54) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:514:1: (lv_script_16_0= ruleScript )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:514:1: (lv_script_16_0= ruleScript )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:515:3: lv_script_16_0= ruleScript
                    {
                     
                    	        newCompositeNode(grammarAccess.getNotesElementAccess().getScriptScriptParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScript_in_ruleNotesElement1099);
                    lv_script_16_0=ruleScript();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNotesElementRule());
                    	        }
                           		set(
                           			current, 
                           			"script",
                            		lv_script_16_0, 
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:539:1: entryRuleWordMeaning returns [EObject current=null] : iv_ruleWordMeaning= ruleWordMeaning EOF ;
    public final EObject entryRuleWordMeaning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordMeaning = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:540:2: (iv_ruleWordMeaning= ruleWordMeaning EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:541:2: iv_ruleWordMeaning= ruleWordMeaning EOF
            {
             newCompositeNode(grammarAccess.getWordMeaningRule()); 
            pushFollow(FOLLOW_ruleWordMeaning_in_entryRuleWordMeaning1136);
            iv_ruleWordMeaning=ruleWordMeaning();

            state._fsp--;

             current =iv_ruleWordMeaning; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordMeaning1146); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:548:1: ruleWordMeaning returns [EObject current=null] : (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleWordMeaning() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_word_2_0=null;
        Token lv_meaning_3_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:551:28: ( (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:552:1: (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:552:1: (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:552:3: otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleWordMeaning1183); 

                	newLeafNode(otherlv_0, grammarAccess.getWordMeaningAccess().getWmKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:556:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:557:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:557:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:558:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleWordMeaning1201); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWordMeaningRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:571:3: ( (lv_word_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:572:1: (lv_word_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:572:1: (lv_word_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:573:3: lv_word_2_0= RULE_STRING
            {
            lv_word_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWordMeaning1232); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:589:2: ( (lv_meaning_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:590:1: (lv_meaning_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:590:1: (lv_meaning_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:591:3: lv_meaning_3_0= RULE_STRING
            {
            lv_meaning_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWordMeaning1254); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:615:1: entryRuleQuestionAnswer returns [EObject current=null] : iv_ruleQuestionAnswer= ruleQuestionAnswer EOF ;
    public final EObject entryRuleQuestionAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionAnswer = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:616:2: (iv_ruleQuestionAnswer= ruleQuestionAnswer EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:617:2: iv_ruleQuestionAnswer= ruleQuestionAnswer EOF
            {
             newCompositeNode(grammarAccess.getQuestionAnswerRule()); 
            pushFollow(FOLLOW_ruleQuestionAnswer_in_entryRuleQuestionAnswer1295);
            iv_ruleQuestionAnswer=ruleQuestionAnswer();

            state._fsp--;

             current =iv_ruleQuestionAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionAnswer1305); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:624:1: ruleQuestionAnswer returns [EObject current=null] : (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleQuestionAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_question_2_0=null;
        Token lv_answerParts_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:627:28: ( (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:628:1: (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:628:1: (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:628:3: otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleQuestionAnswer1342); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAnswerAccess().getQaKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:632:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:633:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:633:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:634:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleQuestionAnswer1360); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionAnswerRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:647:3: ( (lv_question_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:648:1: (lv_question_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:648:1: (lv_question_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:649:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestionAnswer1391); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:665:2: ( (lv_answerParts_3_0= RULE_STRING ) )+
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
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:666:1: (lv_answerParts_3_0= RULE_STRING )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:666:1: (lv_answerParts_3_0= RULE_STRING )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:667:3: lv_answerParts_3_0= RULE_STRING
            	    {
            	    lv_answerParts_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestionAnswer1413); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:683:3: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==53) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:684:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:684:1: (lv_cmap_4_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:685:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionAnswerAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleQuestionAnswer1440);
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:709:1: entryRuleFIB returns [EObject current=null] : iv_ruleFIB= ruleFIB EOF ;
    public final EObject entryRuleFIB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFIB = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:710:2: (iv_ruleFIB= ruleFIB EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:711:2: iv_ruleFIB= ruleFIB EOF
            {
             newCompositeNode(grammarAccess.getFIBRule()); 
            pushFollow(FOLLOW_ruleFIB_in_entryRuleFIB1477);
            iv_ruleFIB=ruleFIB();

            state._fsp--;

             current =iv_ruleFIB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFIB1487); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:718:1: ruleFIB returns [EObject current=null] : (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ ) ;
    public final EObject ruleFIB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_question_2_0=null;
        Token lv_answers_3_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:721:28: ( (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:722:1: (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:722:1: (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:722:3: otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleFIB1524); 

                	newLeafNode(otherlv_0, grammarAccess.getFIBAccess().getFibKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:726:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:727:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:727:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:728:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleFIB1542); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFIBRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:741:3: ( (lv_question_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:742:1: (lv_question_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:742:1: (lv_question_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:743:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFIB1573); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:759:2: ( (lv_answers_3_0= RULE_STRING ) )+
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
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:760:1: (lv_answers_3_0= RULE_STRING )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:760:1: (lv_answers_3_0= RULE_STRING )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:761:3: lv_answers_3_0= RULE_STRING
            	    {
            	    lv_answers_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFIB1595); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:785:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:786:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:787:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition1637);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition1647); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:794:1: ruleDefinition returns [EObject current=null] : (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_term_2_0=null;
        Token lv_definition_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:797:28: ( (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:798:1: (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:798:1: (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:798:3: otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleDefinition1684); 

                	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefinitionKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:802:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:803:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:803:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:804:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleDefinition1702); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:817:3: ( (lv_term_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:818:1: (lv_term_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:818:1: (lv_term_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:819:3: lv_term_2_0= RULE_STRING
            {
            lv_term_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefinition1733); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:835:2: ( (lv_definition_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:836:1: (lv_definition_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:836:1: (lv_definition_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:837:3: lv_definition_3_0= RULE_STRING
            {
            lv_definition_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefinition1755); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:853:2: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==53) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:854:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:854:1: (lv_cmap_4_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:855:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefinitionAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleDefinition1781);
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:879:1: entryRuleCharacter returns [EObject current=null] : iv_ruleCharacter= ruleCharacter EOF ;
    public final EObject entryRuleCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacter = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:880:2: (iv_ruleCharacter= ruleCharacter EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:881:2: iv_ruleCharacter= ruleCharacter EOF
            {
             newCompositeNode(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_ruleCharacter_in_entryRuleCharacter1818);
            iv_ruleCharacter=ruleCharacter();

            state._fsp--;

             current =iv_ruleCharacter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharacter1828); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:888:1: ruleCharacter returns [EObject current=null] : (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_character_2_0=null;
        Token lv_estimate_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:891:28: ( (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:892:1: (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:892:1: (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:892:3: otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleCharacter1865); 

                	newLeafNode(otherlv_0, grammarAccess.getCharacterAccess().getCharacterKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:896:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:897:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:897:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:898:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleCharacter1883); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCharacterRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:911:3: ( (lv_character_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:912:1: (lv_character_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:912:1: (lv_character_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:913:3: lv_character_2_0= RULE_STRING
            {
            lv_character_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharacter1914); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:929:2: ( (lv_estimate_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:930:1: (lv_estimate_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:930:1: (lv_estimate_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:931:3: lv_estimate_3_0= RULE_STRING
            {
            lv_estimate_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharacter1936); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:947:2: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==53) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:948:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:948:1: (lv_cmap_4_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:949:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleCharacter1962);
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:973:1: entryRuleTeacherNote returns [EObject current=null] : iv_ruleTeacherNote= ruleTeacherNote EOF ;
    public final EObject entryRuleTeacherNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeacherNote = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:974:2: (iv_ruleTeacherNote= ruleTeacherNote EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:975:2: iv_ruleTeacherNote= ruleTeacherNote EOF
            {
             newCompositeNode(grammarAccess.getTeacherNoteRule()); 
            pushFollow(FOLLOW_ruleTeacherNote_in_entryRuleTeacherNote1999);
            iv_ruleTeacherNote=ruleTeacherNote();

            state._fsp--;

             current =iv_ruleTeacherNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTeacherNote2009); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:982:1: ruleTeacherNote returns [EObject current=null] : (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleTeacherNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_caption_2_0=null;
        Token lv_note_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:985:28: ( (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:986:1: (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:986:1: (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:986:3: otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleTeacherNote2046); 

                	newLeafNode(otherlv_0, grammarAccess.getTeacherNoteAccess().getTnKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:990:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:991:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:991:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:992:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleTeacherNote2064); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTeacherNoteRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1005:3: ( (lv_caption_2_0= RULE_STRING ) )?
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
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1006:1: (lv_caption_2_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1006:1: (lv_caption_2_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1007:3: lv_caption_2_0= RULE_STRING
                    {
                    lv_caption_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTeacherNote2095); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1023:3: ( (lv_note_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1024:1: (lv_note_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1024:1: (lv_note_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1025:3: lv_note_3_0= RULE_STRING
            {
            lv_note_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTeacherNote2118); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1041:2: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==53) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1042:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1042:1: (lv_cmap_4_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1043:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getTeacherNoteAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleTeacherNote2144);
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1067:1: entryRuleMatching returns [EObject current=null] : iv_ruleMatching= ruleMatching EOF ;
    public final EObject entryRuleMatching() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatching = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1068:2: (iv_ruleMatching= ruleMatching EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1069:2: iv_ruleMatching= ruleMatching EOF
            {
             newCompositeNode(grammarAccess.getMatchingRule()); 
            pushFollow(FOLLOW_ruleMatching_in_entryRuleMatching2181);
            iv_ruleMatching=ruleMatching();

            state._fsp--;

             current =iv_ruleMatching; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatching2191); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1076:1: ruleMatching returns [EObject current=null] : (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )? otherlv_7= '}' ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1079:28: ( (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )? otherlv_7= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1080:1: (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )? otherlv_7= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1080:1: (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )? otherlv_7= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1080:3: otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleMatching2228); 

                	newLeafNode(otherlv_0, grammarAccess.getMatchingAccess().getMatchKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1084:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1085:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1085:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1086:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleMatching2246); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchingRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1099:3: ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1100:1: (lv_skipReverseQuestion_2_0= 'skip_reverse_question' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1100:1: (lv_skipReverseQuestion_2_0= 'skip_reverse_question' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1101:3: lv_skipReverseQuestion_2_0= 'skip_reverse_question'
                    {
                    lv_skipReverseQuestion_2_0=(Token)match(input,27,FOLLOW_27_in_ruleMatching2278); 

                            newLeafNode(lv_skipReverseQuestion_2_0, grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchingRule());
                    	        }
                           		setWithLastConsumed(current, "skipReverseQuestion", lv_skipReverseQuestion_2_0, "skip_reverse_question");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1114:3: ( (lv_question_3_0= RULE_STRING ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1115:1: (lv_question_3_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1115:1: (lv_question_3_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1116:3: lv_question_3_0= RULE_STRING
                    {
                    lv_question_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatching2309); 

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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleMatching2327); 

                	newLeafNode(otherlv_4, grammarAccess.getMatchingAccess().getLeftCurlyBracketKeyword_4());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1136:1: ( (lv_pairs_5_0= ruleMatchPair ) )+
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
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1137:1: (lv_pairs_5_0= ruleMatchPair )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1137:1: (lv_pairs_5_0= ruleMatchPair )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1138:3: lv_pairs_5_0= ruleMatchPair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMatchingAccess().getPairsMatchPairParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMatchPair_in_ruleMatching2348);
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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1154:3: ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1155:1: (lv_mcqConfig_6_0= ruleMatchMCQConfig )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1155:1: (lv_mcqConfig_6_0= ruleMatchMCQConfig )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1156:3: lv_mcqConfig_6_0= ruleMatchMCQConfig
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatchingAccess().getMcqConfigMatchMCQConfigParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMatchMCQConfig_in_ruleMatching2370);
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

            otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleMatching2383); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1184:1: entryRuleMatchPair returns [EObject current=null] : iv_ruleMatchPair= ruleMatchPair EOF ;
    public final EObject entryRuleMatchPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchPair = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1185:2: (iv_ruleMatchPair= ruleMatchPair EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1186:2: iv_ruleMatchPair= ruleMatchPair EOF
            {
             newCompositeNode(grammarAccess.getMatchPairRule()); 
            pushFollow(FOLLOW_ruleMatchPair_in_entryRuleMatchPair2419);
            iv_ruleMatchPair=ruleMatchPair();

            state._fsp--;

             current =iv_ruleMatchPair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchPair2429); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1193:1: ruleMatchPair returns [EObject current=null] : ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMatchPair() throws RecognitionException {
        EObject current = null;

        Token lv_matchQuestion_0_0=null;
        Token otherlv_1=null;
        Token lv_matchAnswer_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1196:28: ( ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1197:1: ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1197:1: ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1197:2: ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1197:2: ( (lv_matchQuestion_0_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1198:1: (lv_matchQuestion_0_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1198:1: (lv_matchQuestion_0_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1199:3: lv_matchQuestion_0_0= RULE_STRING
            {
            lv_matchQuestion_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatchPair2471); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMatchPair2488); 

                	newLeafNode(otherlv_1, grammarAccess.getMatchPairAccess().getEqualsSignKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1219:1: ( (lv_matchAnswer_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1220:1: (lv_matchAnswer_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1220:1: (lv_matchAnswer_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1221:3: lv_matchAnswer_2_0= RULE_STRING
            {
            lv_matchAnswer_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatchPair2505); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1245:1: entryRuleMatchMCQConfig returns [EObject current=null] : iv_ruleMatchMCQConfig= ruleMatchMCQConfig EOF ;
    public final EObject entryRuleMatchMCQConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchMCQConfig = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1246:2: (iv_ruleMatchMCQConfig= ruleMatchMCQConfig EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1247:2: iv_ruleMatchMCQConfig= ruleMatchMCQConfig EOF
            {
             newCompositeNode(grammarAccess.getMatchMCQConfigRule()); 
            pushFollow(FOLLOW_ruleMatchMCQConfig_in_entryRuleMatchMCQConfig2546);
            iv_ruleMatchMCQConfig=ruleMatchMCQConfig();

            state._fsp--;

             current =iv_ruleMatchMCQConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchMCQConfig2556); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1254:1: ruleMatchMCQConfig returns [EObject current=null] : (otherlv_0= '@mcq_config' otherlv_1= '{' otherlv_2= '@forwardCaption' ( (lv_forwardCaption_3_0= RULE_STRING ) ) (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )? (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )? (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )? otherlv_10= '}' ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1257:28: ( (otherlv_0= '@mcq_config' otherlv_1= '{' otherlv_2= '@forwardCaption' ( (lv_forwardCaption_3_0= RULE_STRING ) ) (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )? (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )? (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )? otherlv_10= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1258:1: (otherlv_0= '@mcq_config' otherlv_1= '{' otherlv_2= '@forwardCaption' ( (lv_forwardCaption_3_0= RULE_STRING ) ) (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )? (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )? (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )? otherlv_10= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1258:1: (otherlv_0= '@mcq_config' otherlv_1= '{' otherlv_2= '@forwardCaption' ( (lv_forwardCaption_3_0= RULE_STRING ) ) (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )? (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )? (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )? otherlv_10= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1258:3: otherlv_0= '@mcq_config' otherlv_1= '{' otherlv_2= '@forwardCaption' ( (lv_forwardCaption_3_0= RULE_STRING ) ) (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )? (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )? (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleMatchMCQConfig2593); 

                	newLeafNode(otherlv_0, grammarAccess.getMatchMCQConfigAccess().getMcq_configKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleMatchMCQConfig2605); 

                	newLeafNode(otherlv_1, grammarAccess.getMatchMCQConfigAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleMatchMCQConfig2617); 

                	newLeafNode(otherlv_2, grammarAccess.getMatchMCQConfigAccess().getForwardCaptionKeyword_2());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1270:1: ( (lv_forwardCaption_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1271:1: (lv_forwardCaption_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1271:1: (lv_forwardCaption_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1272:3: lv_forwardCaption_3_0= RULE_STRING
            {
            lv_forwardCaption_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatchMCQConfig2634); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1288:2: (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1288:4: otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleMatchMCQConfig2652); 

                        	newLeafNode(otherlv_4, grammarAccess.getMatchMCQConfigAccess().getReverseCaptionKeyword_4_0());
                        
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1292:1: ( (lv_reverseCaption_5_0= RULE_STRING ) )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1293:1: (lv_reverseCaption_5_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1293:1: (lv_reverseCaption_5_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1294:3: lv_reverseCaption_5_0= RULE_STRING
                    {
                    lv_reverseCaption_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatchMCQConfig2669); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1310:4: (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1310:6: otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleMatchMCQConfig2689); 

                        	newLeafNode(otherlv_6, grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowKeyword_5_0());
                        
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1314:1: ( (lv_numOptionsToShow_7_0= RULE_INT ) )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1315:1: (lv_numOptionsToShow_7_0= RULE_INT )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1315:1: (lv_numOptionsToShow_7_0= RULE_INT )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1316:3: lv_numOptionsToShow_7_0= RULE_INT
                    {
                    lv_numOptionsToShow_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMatchMCQConfig2706); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1332:4: (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1332:6: otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) )
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_35_in_ruleMatchMCQConfig2726); 

                        	newLeafNode(otherlv_8, grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowKeyword_6_0());
                        
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1336:1: ( (lv_numOptionsPerRow_9_0= RULE_INT ) )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1337:1: (lv_numOptionsPerRow_9_0= RULE_INT )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1337:1: (lv_numOptionsPerRow_9_0= RULE_INT )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1338:3: lv_numOptionsPerRow_9_0= RULE_INT
                    {
                    lv_numOptionsPerRow_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMatchMCQConfig2743); 

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

            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleMatchMCQConfig2762); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1366:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1367:2: (iv_ruleEvent= ruleEvent EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1368:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent2798);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent2808); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1375:1: ruleEvent returns [EObject current=null] : (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_event_2_0=null;
        Token lv_time_3_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1378:28: ( (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1379:1: (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1379:1: (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1379:3: otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleEvent2845); 

                	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1383:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1384:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1384:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1385:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleEvent2863); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1398:3: ( (lv_event_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1399:1: (lv_event_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1399:1: (lv_event_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1400:3: lv_event_2_0= RULE_STRING
            {
            lv_event_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent2894); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1416:2: ( (lv_time_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1417:1: (lv_time_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1417:1: (lv_time_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1418:3: lv_time_3_0= RULE_STRING
            {
            lv_time_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent2916); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1442:1: entryRuleTrueFalse returns [EObject current=null] : iv_ruleTrueFalse= ruleTrueFalse EOF ;
    public final EObject entryRuleTrueFalse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueFalse = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1443:2: (iv_ruleTrueFalse= ruleTrueFalse EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1444:2: iv_ruleTrueFalse= ruleTrueFalse EOF
            {
             newCompositeNode(grammarAccess.getTrueFalseRule()); 
            pushFollow(FOLLOW_ruleTrueFalse_in_entryRuleTrueFalse2957);
            iv_ruleTrueFalse=ruleTrueFalse();

            state._fsp--;

             current =iv_ruleTrueFalse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrueFalse2967); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1451:1: ruleTrueFalse returns [EObject current=null] : (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleTrueFalse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_statement_2_0=null;
        Token lv_truthValue_3_0=null;
        Token lv_justification_4_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1454:28: ( (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1455:1: (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1455:1: (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1455:3: otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleTrueFalse3004); 

                	newLeafNode(otherlv_0, grammarAccess.getTrueFalseAccess().getTrue_falseKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1459:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1460:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1460:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1461:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleTrueFalse3022); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTrueFalseRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1474:3: ( (lv_statement_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1475:1: (lv_statement_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1475:1: (lv_statement_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1476:3: lv_statement_2_0= RULE_STRING
            {
            lv_statement_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTrueFalse3053); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1492:2: ( (lv_truthValue_3_0= RULE_BOOL ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1493:1: (lv_truthValue_3_0= RULE_BOOL )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1493:1: (lv_truthValue_3_0= RULE_BOOL )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1494:3: lv_truthValue_3_0= RULE_BOOL
            {
            lv_truthValue_3_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleTrueFalse3075); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1510:2: ( (lv_justification_4_0= RULE_STRING ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1511:1: (lv_justification_4_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1511:1: (lv_justification_4_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1512:3: lv_justification_4_0= RULE_STRING
                    {
                    lv_justification_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTrueFalse3097); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1536:1: entryRuleChemEquation returns [EObject current=null] : iv_ruleChemEquation= ruleChemEquation EOF ;
    public final EObject entryRuleChemEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemEquation = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1537:2: (iv_ruleChemEquation= ruleChemEquation EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1538:2: iv_ruleChemEquation= ruleChemEquation EOF
            {
             newCompositeNode(grammarAccess.getChemEquationRule()); 
            pushFollow(FOLLOW_ruleChemEquation_in_entryRuleChemEquation3139);
            iv_ruleChemEquation=ruleChemEquation();

            state._fsp--;

             current =iv_ruleChemEquation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChemEquation3149); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1545:1: ruleChemEquation returns [EObject current=null] : (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1548:28: ( (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1549:1: (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1549:1: (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1549:3: otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleChemEquation3186); 

                	newLeafNode(otherlv_0, grammarAccess.getChemEquationAccess().getChem_equationKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1553:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1554:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1554:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1555:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleChemEquation3204); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemEquationRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1568:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1569:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1569:1: (lv_description_2_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1570:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation3235); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleChemEquation3253); 

                	newLeafNode(otherlv_3, grammarAccess.getChemEquationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1590:1: ( (lv_reactants_4_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1591:1: (lv_reactants_4_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1591:1: (lv_reactants_4_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1592:3: lv_reactants_4_0= RULE_STRING
            {
            lv_reactants_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation3270); 

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

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleChemEquation3287); 

                	newLeafNode(otherlv_5, grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_5());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1612:1: ( (lv_produces_6_0= RULE_STRING ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1613:1: (lv_produces_6_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1613:1: (lv_produces_6_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1614:3: lv_produces_6_0= RULE_STRING
                    {
                    lv_produces_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation3304); 

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

            otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleChemEquation3322); 

                	newLeafNode(otherlv_7, grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_7());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1634:1: ( (lv_products_8_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1635:1: (lv_products_8_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1635:1: (lv_products_8_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1636:3: lv_products_8_0= RULE_STRING
            {
            lv_products_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation3339); 

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

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleChemEquation3356); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1664:1: entryRuleChemCompound returns [EObject current=null] : iv_ruleChemCompound= ruleChemCompound EOF ;
    public final EObject entryRuleChemCompound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemCompound = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1665:2: (iv_ruleChemCompound= ruleChemCompound EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1666:2: iv_ruleChemCompound= ruleChemCompound EOF
            {
             newCompositeNode(grammarAccess.getChemCompoundRule()); 
            pushFollow(FOLLOW_ruleChemCompound_in_entryRuleChemCompound3392);
            iv_ruleChemCompound=ruleChemCompound();

            state._fsp--;

             current =iv_ruleChemCompound; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChemCompound3402); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1673:1: ruleChemCompound returns [EObject current=null] : (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleChemCompound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_symbol_2_0=null;
        Token lv_chemicalName_3_0=null;
        Token lv_commonName_4_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1676:28: ( (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1677:1: (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1677:1: (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1677:3: otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleChemCompound3439); 

                	newLeafNode(otherlv_0, grammarAccess.getChemCompoundAccess().getChem_compoundKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1681:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1682:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1682:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1683:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleChemCompound3457); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemCompoundRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1696:3: ( (lv_symbol_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1697:1: (lv_symbol_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1697:1: (lv_symbol_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1698:3: lv_symbol_2_0= RULE_STRING
            {
            lv_symbol_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemCompound3488); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1714:2: ( (lv_chemicalName_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1715:1: (lv_chemicalName_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1715:1: (lv_chemicalName_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1716:3: lv_chemicalName_3_0= RULE_STRING
            {
            lv_chemicalName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemCompound3510); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1732:2: ( (lv_commonName_4_0= RULE_STRING ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1733:1: (lv_commonName_4_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1733:1: (lv_commonName_4_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1734:3: lv_commonName_4_0= RULE_STRING
                    {
                    lv_commonName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemCompound3532); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1758:1: entryRuleSpellbee returns [EObject current=null] : iv_ruleSpellbee= ruleSpellbee EOF ;
    public final EObject entryRuleSpellbee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpellbee = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1759:2: (iv_ruleSpellbee= ruleSpellbee EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1760:2: iv_ruleSpellbee= ruleSpellbee EOF
            {
             newCompositeNode(grammarAccess.getSpellbeeRule()); 
            pushFollow(FOLLOW_ruleSpellbee_in_entryRuleSpellbee3574);
            iv_ruleSpellbee=ruleSpellbee();

            state._fsp--;

             current =iv_ruleSpellbee; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpellbee3584); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1767:1: ruleSpellbee returns [EObject current=null] : (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSpellbee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_word_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1770:28: ( (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1771:1: (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1771:1: (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1771:3: otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleSpellbee3621); 

                	newLeafNode(otherlv_0, grammarAccess.getSpellbeeAccess().getSpellbeeKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1775:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==20) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1776:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1776:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1777:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleSpellbee3639); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpellbeeRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1790:3: ( (lv_word_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1791:1: (lv_word_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1791:1: (lv_word_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1792:3: lv_word_2_0= RULE_STRING
            {
            lv_word_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpellbee3670); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1816:1: entryRuleImageLabel returns [EObject current=null] : iv_ruleImageLabel= ruleImageLabel EOF ;
    public final EObject entryRuleImageLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageLabel = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1817:2: (iv_ruleImageLabel= ruleImageLabel EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1818:2: iv_ruleImageLabel= ruleImageLabel EOF
            {
             newCompositeNode(grammarAccess.getImageLabelRule()); 
            pushFollow(FOLLOW_ruleImageLabel_in_entryRuleImageLabel3711);
            iv_ruleImageLabel=ruleImageLabel();

            state._fsp--;

             current =iv_ruleImageLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageLabel3721); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1825:1: ruleImageLabel returns [EObject current=null] : (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1828:28: ( (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1829:1: (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1829:1: (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1829:3: otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleImageLabel3758); 

                	newLeafNode(otherlv_0, grammarAccess.getImageLabelAccess().getImage_labelKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1833:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1834:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1834:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1835:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleImageLabel3776); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageLabelRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1848:3: ( (lv_caption_2_0= RULE_STRING ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1849:1: (lv_caption_2_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1849:1: (lv_caption_2_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1850:3: lv_caption_2_0= RULE_STRING
                    {
                    lv_caption_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageLabel3807); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleImageLabel3825); 

                	newLeafNode(otherlv_3, grammarAccess.getImageLabelAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleImageLabel3837); 

                	newLeafNode(otherlv_4, grammarAccess.getImageLabelAccess().getImageNameKeyword_4());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1874:1: ( (lv_imageName_5_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1875:1: (lv_imageName_5_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1875:1: (lv_imageName_5_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1876:3: lv_imageName_5_0= RULE_STRING
            {
            lv_imageName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageLabel3854); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1892:2: ( (lv_hotspots_6_0= ruleHotSpot ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1893:1: (lv_hotspots_6_0= ruleHotSpot )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1893:1: (lv_hotspots_6_0= ruleHotSpot )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1894:3: lv_hotspots_6_0= ruleHotSpot
            {
             
            	        newCompositeNode(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleHotSpot_in_ruleImageLabel3880);
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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1910:2: (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==44) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1910:4: otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) )
            	    {
            	    otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleImageLabel3893); 

            	        	newLeafNode(otherlv_7, grammarAccess.getImageLabelAccess().getCommaKeyword_7_0());
            	        
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1914:1: ( (lv_hotspots_8_0= ruleHotSpot ) )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1915:1: (lv_hotspots_8_0= ruleHotSpot )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1915:1: (lv_hotspots_8_0= ruleHotSpot )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1916:3: lv_hotspots_8_0= ruleHotSpot
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHotSpot_in_ruleImageLabel3914);
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

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleImageLabel3928); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1944:1: entryRuleHotSpot returns [EObject current=null] : iv_ruleHotSpot= ruleHotSpot EOF ;
    public final EObject entryRuleHotSpot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHotSpot = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1945:2: (iv_ruleHotSpot= ruleHotSpot EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1946:2: iv_ruleHotSpot= ruleHotSpot EOF
            {
             newCompositeNode(grammarAccess.getHotSpotRule()); 
            pushFollow(FOLLOW_ruleHotSpot_in_entryRuleHotSpot3964);
            iv_ruleHotSpot=ruleHotSpot();

            state._fsp--;

             current =iv_ruleHotSpot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHotSpot3974); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1953:1: ruleHotSpot returns [EObject current=null] : ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleHotSpot() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;
        Token otherlv_1=null;
        Token lv_y_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1956:28: ( ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1957:1: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1957:1: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1957:2: ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1957:2: ( (lv_x_0_0= RULE_INT ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1958:1: (lv_x_0_0= RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1958:1: (lv_x_0_0= RULE_INT )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1959:3: lv_x_0_0= RULE_INT
            {
            lv_x_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHotSpot4016); 

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

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleHotSpot4033); 

                	newLeafNode(otherlv_1, grammarAccess.getHotSpotAccess().getCommaKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1979:1: ( (lv_y_2_0= RULE_INT ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1980:1: (lv_y_2_0= RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1980:1: (lv_y_2_0= RULE_INT )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1981:3: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHotSpot4050); 

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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleHotSpot4067); 

                	newLeafNode(otherlv_3, grammarAccess.getHotSpotAccess().getEqualsSignKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2001:1: ( (lv_label_4_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2002:1: (lv_label_4_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2002:1: (lv_label_4_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2003:3: lv_label_4_0= RULE_STRING
            {
            lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHotSpot4084); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2027:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2028:2: (iv_ruleEquation= ruleEquation EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2029:2: iv_ruleEquation= ruleEquation EOF
            {
             newCompositeNode(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_ruleEquation_in_entryRuleEquation4125);
            iv_ruleEquation=ruleEquation();

            state._fsp--;

             current =iv_ruleEquation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquation4135); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2036:1: ruleEquation returns [EObject current=null] : (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2039:28: ( (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2040:1: (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2040:1: (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2040:3: otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleEquation4172); 

                	newLeafNode(otherlv_0, grammarAccess.getEquationAccess().getEquationKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2044:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==20) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2045:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2045:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2046:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleEquation4190); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEquationRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2059:3: ( (lv_equation_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2060:1: (lv_equation_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2060:1: (lv_equation_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2061:3: lv_equation_2_0= RULE_STRING
            {
            lv_equation_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEquation4221); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleEquation4238); 

                	newLeafNode(otherlv_3, grammarAccess.getEquationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2081:1: ( (lv_description_4_0= RULE_STRING ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2082:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2082:1: (lv_description_4_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2083:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEquation4255); 

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

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleEquation4273); 

                	newLeafNode(otherlv_5, grammarAccess.getEquationAccess().getWhereKeyword_5());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2103:1: ( (lv_symbols_6_0= ruleEqSymbol ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2104:1: (lv_symbols_6_0= ruleEqSymbol )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2104:1: (lv_symbols_6_0= ruleEqSymbol )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2105:3: lv_symbols_6_0= ruleEqSymbol
            {
             
            	        newCompositeNode(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleEqSymbol_in_ruleEquation4294);
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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2121:2: (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==44) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2121:4: otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) )
            	    {
            	    otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleEquation4307); 

            	        	newLeafNode(otherlv_7, grammarAccess.getEquationAccess().getCommaKeyword_7_0());
            	        
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2125:1: ( (lv_symbols_8_0= ruleEqSymbol ) )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2126:1: (lv_symbols_8_0= ruleEqSymbol )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2126:1: (lv_symbols_8_0= ruleEqSymbol )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2127:3: lv_symbols_8_0= ruleEqSymbol
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqSymbol_in_ruleEquation4328);
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

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleEquation4342); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2155:1: entryRuleEqSymbol returns [EObject current=null] : iv_ruleEqSymbol= ruleEqSymbol EOF ;
    public final EObject entryRuleEqSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqSymbol = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2156:2: (iv_ruleEqSymbol= ruleEqSymbol EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2157:2: iv_ruleEqSymbol= ruleEqSymbol EOF
            {
             newCompositeNode(grammarAccess.getEqSymbolRule()); 
            pushFollow(FOLLOW_ruleEqSymbol_in_entryRuleEqSymbol4378);
            iv_ruleEqSymbol=ruleEqSymbol();

            state._fsp--;

             current =iv_ruleEqSymbol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqSymbol4388); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2164:1: ruleEqSymbol returns [EObject current=null] : ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEqSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2167:28: ( ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2168:1: ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2168:1: ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2168:2: ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2168:2: ( (lv_symbol_0_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2169:1: (lv_symbol_0_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2169:1: (lv_symbol_0_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2170:3: lv_symbol_0_0= RULE_STRING
            {
            lv_symbol_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqSymbol4430); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleEqSymbol4447); 

                	newLeafNode(otherlv_1, grammarAccess.getEqSymbolAccess().getEqualsSignKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2190:1: ( (lv_description_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2191:1: (lv_description_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2191:1: (lv_description_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2192:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqSymbol4464); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2216:1: entryRuleRefToContext returns [EObject current=null] : iv_ruleRefToContext= ruleRefToContext EOF ;
    public final EObject entryRuleRefToContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefToContext = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2217:2: (iv_ruleRefToContext= ruleRefToContext EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2218:2: iv_ruleRefToContext= ruleRefToContext EOF
            {
             newCompositeNode(grammarAccess.getRefToContextRule()); 
            pushFollow(FOLLOW_ruleRefToContext_in_entryRuleRefToContext4505);
            iv_ruleRefToContext=ruleRefToContext();

            state._fsp--;

             current =iv_ruleRefToContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefToContext4515); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2225:1: ruleRefToContext returns [EObject current=null] : (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_questions_5_0= ruleQuestionAnswer ) )+ otherlv_6= '}' ) ;
    public final EObject ruleRefToContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_context_4_0=null;
        Token otherlv_6=null;
        EObject lv_questions_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2228:28: ( (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_questions_5_0= ruleQuestionAnswer ) )+ otherlv_6= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2229:1: (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_questions_5_0= ruleQuestionAnswer ) )+ otherlv_6= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2229:1: (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_questions_5_0= ruleQuestionAnswer ) )+ otherlv_6= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2229:3: otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_questions_5_0= ruleQuestionAnswer ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleRefToContext4552); 

                	newLeafNode(otherlv_0, grammarAccess.getRefToContextAccess().getRtcKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2233:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==20) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2234:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2234:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2235:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleRefToContext4570); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRefToContextRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleRefToContext4596); 

                	newLeafNode(otherlv_2, grammarAccess.getRefToContextAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleRefToContext4608); 

                	newLeafNode(otherlv_3, grammarAccess.getRefToContextAccess().getContextKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2256:1: ( (lv_context_4_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2257:1: (lv_context_4_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2257:1: (lv_context_4_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2258:3: lv_context_4_0= RULE_STRING
            {
            lv_context_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRefToContext4625); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2274:2: ( (lv_questions_5_0= ruleQuestionAnswer ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==21) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2275:1: (lv_questions_5_0= ruleQuestionAnswer )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2275:1: (lv_questions_5_0= ruleQuestionAnswer )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2276:3: lv_questions_5_0= ruleQuestionAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefToContextAccess().getQuestionsQuestionAnswerParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestionAnswer_in_ruleRefToContext4651);
            	    lv_questions_5_0=ruleQuestionAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRefToContextRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_5_0, 
            	            		"QuestionAnswer");
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

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleRefToContext4664); 

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


    // $ANTLR start "entryRuleMultiChoice"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2304:1: entryRuleMultiChoice returns [EObject current=null] : iv_ruleMultiChoice= ruleMultiChoice EOF ;
    public final EObject entryRuleMultiChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiChoice = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2305:2: (iv_ruleMultiChoice= ruleMultiChoice EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2306:2: iv_ruleMultiChoice= ruleMultiChoice EOF
            {
             newCompositeNode(grammarAccess.getMultiChoiceRule()); 
            pushFollow(FOLLOW_ruleMultiChoice_in_entryRuleMultiChoice4700);
            iv_ruleMultiChoice=ruleMultiChoice();

            state._fsp--;

             current =iv_ruleMultiChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiChoice4710); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2313:1: ruleMultiChoice returns [EObject current=null] : (otherlv_0= '@multi_choice' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '@options' otherlv_5= '{' ( (lv_options_6_0= ruleOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )* otherlv_9= '}' (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )? (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )? (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )? otherlv_16= '}' ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2316:28: ( (otherlv_0= '@multi_choice' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '@options' otherlv_5= '{' ( (lv_options_6_0= ruleOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )* otherlv_9= '}' (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )? (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )? (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )? otherlv_16= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2317:1: (otherlv_0= '@multi_choice' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '@options' otherlv_5= '{' ( (lv_options_6_0= ruleOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )* otherlv_9= '}' (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )? (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )? (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )? otherlv_16= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2317:1: (otherlv_0= '@multi_choice' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '@options' otherlv_5= '{' ( (lv_options_6_0= ruleOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )* otherlv_9= '}' (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )? (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )? (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )? otherlv_16= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2317:3: otherlv_0= '@multi_choice' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '@options' otherlv_5= '{' ( (lv_options_6_0= ruleOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )* otherlv_9= '}' (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )? (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )? (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleMultiChoice4747); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiChoiceAccess().getMulti_choiceKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2321:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==20) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2322:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2322:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2323:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleMultiChoice4765); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getMultiChoiceAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiChoiceRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2336:3: ( (lv_question_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2337:1: (lv_question_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2337:1: (lv_question_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2338:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultiChoice4796); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleMultiChoice4813); 

                	newLeafNode(otherlv_3, grammarAccess.getMultiChoiceAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleMultiChoice4825); 

                	newLeafNode(otherlv_4, grammarAccess.getMultiChoiceAccess().getOptionsKeyword_4());
                
            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleMultiChoice4837); 

                	newLeafNode(otherlv_5, grammarAccess.getMultiChoiceAccess().getLeftCurlyBracketKeyword_5());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2366:1: ( (lv_options_6_0= ruleOption ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2367:1: (lv_options_6_0= ruleOption )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2367:1: (lv_options_6_0= ruleOption )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2368:3: lv_options_6_0= ruleOption
            {
             
            	        newCompositeNode(grammarAccess.getMultiChoiceAccess().getOptionsOptionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleOption_in_ruleMultiChoice4858);
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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2384:2: (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==44) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2384:4: otherlv_7= ',' ( (lv_options_8_0= ruleOption ) )
            	    {
            	    otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleMultiChoice4871); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMultiChoiceAccess().getCommaKeyword_7_0());
            	        
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2388:1: ( (lv_options_8_0= ruleOption ) )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2389:1: (lv_options_8_0= ruleOption )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2389:1: (lv_options_8_0= ruleOption )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2390:3: lv_options_8_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiChoiceAccess().getOptionsOptionParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOption_in_ruleMultiChoice4892);
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
            	    break loop47;
                }
            } while (true);

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleMultiChoice4906); 

                	newLeafNode(otherlv_9, grammarAccess.getMultiChoiceAccess().getRightCurlyBracketKeyword_8());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2410:1: (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==34) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2410:3: otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_34_in_ruleMultiChoice4919); 

                        	newLeafNode(otherlv_10, grammarAccess.getMultiChoiceAccess().getNumOptionsToShowKeyword_9_0());
                        
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2414:1: ( (lv_numOptionsToShow_11_0= RULE_INT ) )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2415:1: (lv_numOptionsToShow_11_0= RULE_INT )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2415:1: (lv_numOptionsToShow_11_0= RULE_INT )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2416:3: lv_numOptionsToShow_11_0= RULE_INT
                    {
                    lv_numOptionsToShow_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMultiChoice4936); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2432:4: (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==35) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2432:6: otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_35_in_ruleMultiChoice4956); 

                        	newLeafNode(otherlv_12, grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowKeyword_10_0());
                        
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2436:1: ( (lv_numOptionsPerRow_13_0= RULE_INT ) )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2437:1: (lv_numOptionsPerRow_13_0= RULE_INT )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2437:1: (lv_numOptionsPerRow_13_0= RULE_INT )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2438:3: lv_numOptionsPerRow_13_0= RULE_INT
                    {
                    lv_numOptionsPerRow_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMultiChoice4973); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2454:4: (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==51) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2454:6: otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,51,FOLLOW_51_in_ruleMultiChoice4993); 

                        	newLeafNode(otherlv_14, grammarAccess.getMultiChoiceAccess().getExplanationKeyword_11_0());
                        
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2458:1: ( (lv_explanation_15_0= RULE_STRING ) )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2459:1: (lv_explanation_15_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2459:1: (lv_explanation_15_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2460:3: lv_explanation_15_0= RULE_STRING
                    {
                    lv_explanation_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultiChoice5010); 

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

            otherlv_16=(Token)match(input,29,FOLLOW_29_in_ruleMultiChoice5029); 

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


    // $ANTLR start "entryRuleOption"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2488:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2489:2: (iv_ruleOption= ruleOption EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2490:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption5065);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption5075); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2497:1: ruleOption returns [EObject current=null] : ( ( (lv_optionValue_0_0= RULE_STRING ) ) ( (lv_correctOption_1_0= 'correct' ) )? ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token lv_optionValue_0_0=null;
        Token lv_correctOption_1_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2500:28: ( ( ( (lv_optionValue_0_0= RULE_STRING ) ) ( (lv_correctOption_1_0= 'correct' ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2501:1: ( ( (lv_optionValue_0_0= RULE_STRING ) ) ( (lv_correctOption_1_0= 'correct' ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2501:1: ( ( (lv_optionValue_0_0= RULE_STRING ) ) ( (lv_correctOption_1_0= 'correct' ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2501:2: ( (lv_optionValue_0_0= RULE_STRING ) ) ( (lv_correctOption_1_0= 'correct' ) )?
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2501:2: ( (lv_optionValue_0_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2502:1: (lv_optionValue_0_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2502:1: (lv_optionValue_0_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2503:3: lv_optionValue_0_0= RULE_STRING
            {
            lv_optionValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOption5117); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2519:2: ( (lv_correctOption_1_0= 'correct' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==52) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2520:1: (lv_correctOption_1_0= 'correct' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2520:1: (lv_correctOption_1_0= 'correct' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2521:3: lv_correctOption_1_0= 'correct'
                    {
                    lv_correctOption_1_0=(Token)match(input,52,FOLLOW_52_in_ruleOption5140); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2542:1: entryRuleCMap returns [EObject current=null] : iv_ruleCMap= ruleCMap EOF ;
    public final EObject entryRuleCMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCMap = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2543:2: (iv_ruleCMap= ruleCMap EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2544:2: iv_ruleCMap= ruleCMap EOF
            {
             newCompositeNode(grammarAccess.getCMapRule()); 
            pushFollow(FOLLOW_ruleCMap_in_entryRuleCMap5190);
            iv_ruleCMap=ruleCMap();

            state._fsp--;

             current =iv_ruleCMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCMap5200); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2551:1: ruleCMap returns [EObject current=null] : (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleCMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2554:28: ( (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2555:1: (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2555:1: (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2555:3: otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleCMap5237); 

                	newLeafNode(otherlv_0, grammarAccess.getCMapAccess().getCmapKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleCMap5249); 

                	newLeafNode(otherlv_1, grammarAccess.getCMapAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2563:1: ( (lv_content_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2564:1: (lv_content_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2564:1: (lv_content_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2565:3: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCMap5266); 

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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleCMap5283); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2593:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2594:2: (iv_ruleScript= ruleScript EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2595:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript5319);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript5329); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2602:1: ruleScript returns [EObject current=null] : (otherlv_0= 'script_expressions' otherlv_1= '{' ( (lv_evalVars_2_0= ruleEvalVar ) ) (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )* otherlv_5= '}' ( (lv_scriptBody_6_0= ruleScriptBody ) )? ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2605:28: ( (otherlv_0= 'script_expressions' otherlv_1= '{' ( (lv_evalVars_2_0= ruleEvalVar ) ) (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )* otherlv_5= '}' ( (lv_scriptBody_6_0= ruleScriptBody ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2606:1: (otherlv_0= 'script_expressions' otherlv_1= '{' ( (lv_evalVars_2_0= ruleEvalVar ) ) (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )* otherlv_5= '}' ( (lv_scriptBody_6_0= ruleScriptBody ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2606:1: (otherlv_0= 'script_expressions' otherlv_1= '{' ( (lv_evalVars_2_0= ruleEvalVar ) ) (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )* otherlv_5= '}' ( (lv_scriptBody_6_0= ruleScriptBody ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2606:3: otherlv_0= 'script_expressions' otherlv_1= '{' ( (lv_evalVars_2_0= ruleEvalVar ) ) (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )* otherlv_5= '}' ( (lv_scriptBody_6_0= ruleScriptBody ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleScript5366); 

                	newLeafNode(otherlv_0, grammarAccess.getScriptAccess().getScript_expressionsKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleScript5378); 

                	newLeafNode(otherlv_1, grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2614:1: ( (lv_evalVars_2_0= ruleEvalVar ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2615:1: (lv_evalVars_2_0= ruleEvalVar )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2615:1: (lv_evalVars_2_0= ruleEvalVar )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2616:3: lv_evalVars_2_0= ruleEvalVar
            {
             
            	        newCompositeNode(grammarAccess.getScriptAccess().getEvalVarsEvalVarParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEvalVar_in_ruleScript5399);
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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2632:2: (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==44) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2632:4: otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) )
            	    {
            	    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleScript5412); 

            	        	newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2636:1: ( (lv_evalVars_4_0= ruleEvalVar ) )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2637:1: (lv_evalVars_4_0= ruleEvalVar )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2637:1: (lv_evalVars_4_0= ruleEvalVar )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2638:3: lv_evalVars_4_0= ruleEvalVar
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScriptAccess().getEvalVarsEvalVarParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvalVar_in_ruleScript5433);
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
            	    break loop52;
                }
            } while (true);

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleScript5447); 

                	newLeafNode(otherlv_5, grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_4());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2658:1: ( (lv_scriptBody_6_0= ruleScriptBody ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==55) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2659:1: (lv_scriptBody_6_0= ruleScriptBody )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2659:1: (lv_scriptBody_6_0= ruleScriptBody )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2660:3: lv_scriptBody_6_0= ruleScriptBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getScriptAccess().getScriptBodyScriptBodyParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScriptBody_in_ruleScript5468);
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2684:1: entryRuleEvalVar returns [EObject current=null] : iv_ruleEvalVar= ruleEvalVar EOF ;
    public final EObject entryRuleEvalVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvalVar = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2685:2: (iv_ruleEvalVar= ruleEvalVar EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2686:2: iv_ruleEvalVar= ruleEvalVar EOF
            {
             newCompositeNode(grammarAccess.getEvalVarRule()); 
            pushFollow(FOLLOW_ruleEvalVar_in_entryRuleEvalVar5505);
            iv_ruleEvalVar=ruleEvalVar();

            state._fsp--;

             current =iv_ruleEvalVar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvalVar5515); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2693:1: ruleEvalVar returns [EObject current=null] : ( ( (lv_varName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_varExpression_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEvalVar() throws RecognitionException {
        EObject current = null;

        Token lv_varName_0_0=null;
        Token otherlv_1=null;
        Token lv_varExpression_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2696:28: ( ( ( (lv_varName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_varExpression_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2697:1: ( ( (lv_varName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_varExpression_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2697:1: ( ( (lv_varName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_varExpression_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2697:2: ( (lv_varName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_varExpression_2_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2697:2: ( (lv_varName_0_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2698:1: (lv_varName_0_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2698:1: (lv_varName_0_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2699:3: lv_varName_0_0= RULE_STRING
            {
            lv_varName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvalVar5557); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleEvalVar5574); 

                	newLeafNode(otherlv_1, grammarAccess.getEvalVarAccess().getEqualsSignKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2719:1: ( (lv_varExpression_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2720:1: (lv_varExpression_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2720:1: (lv_varExpression_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2721:3: lv_varExpression_2_0= RULE_STRING
            {
            lv_varExpression_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvalVar5591); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2745:1: entryRuleScriptBody returns [EObject current=null] : iv_ruleScriptBody= ruleScriptBody EOF ;
    public final EObject entryRuleScriptBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptBody = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2746:2: (iv_ruleScriptBody= ruleScriptBody EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2747:2: iv_ruleScriptBody= ruleScriptBody EOF
            {
             newCompositeNode(grammarAccess.getScriptBodyRule()); 
            pushFollow(FOLLOW_ruleScriptBody_in_entryRuleScriptBody5632);
            iv_ruleScriptBody=ruleScriptBody();

            state._fsp--;

             current =iv_ruleScriptBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScriptBody5642); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2754:1: ruleScriptBody returns [EObject current=null] : (otherlv_0= 'script' otherlv_1= '{' ( (lv_scriptBody_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleScriptBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_scriptBody_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2757:28: ( (otherlv_0= 'script' otherlv_1= '{' ( (lv_scriptBody_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2758:1: (otherlv_0= 'script' otherlv_1= '{' ( (lv_scriptBody_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2758:1: (otherlv_0= 'script' otherlv_1= '{' ( (lv_scriptBody_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2758:3: otherlv_0= 'script' otherlv_1= '{' ( (lv_scriptBody_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleScriptBody5679); 

                	newLeafNode(otherlv_0, grammarAccess.getScriptBodyAccess().getScriptKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleScriptBody5691); 

                	newLeafNode(otherlv_1, grammarAccess.getScriptBodyAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2766:1: ( (lv_scriptBody_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2767:1: (lv_scriptBody_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2767:1: (lv_scriptBody_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2768:3: lv_scriptBody_2_0= RULE_STRING
            {
            lv_scriptBody_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScriptBody5708); 

            			newLeafNode(lv_scriptBody_2_0, grammarAccess.getScriptBodyAccess().getScriptBodySTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScriptBodyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"scriptBody",
                    		lv_scriptBody_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleScriptBody5725); 

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
    public static final BitSet FOLLOW_ruleChapterDetails_in_ruleJoveNotes152 = new BitSet(new long[]{0x0002A77007E80002L});
    public static final BitSet FOLLOW_ruleNotesElement_in_ruleJoveNotes173 = new BitSet(new long[]{0x0002A77007E80002L});
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
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChapterDetails552 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleScriptBody_in_ruleChapterDetails578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotesElement_in_entryRuleNotesElement615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotesElement625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMeaning_in_ruleNotesElement673 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_ruleNotesElement700 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleFIB_in_ruleNotesElement727 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleNotesElement754 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_ruleNotesElement781 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleTeacherNote_in_ruleNotesElement808 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleMatching_in_ruleNotesElement835 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleNotesElement862 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleTrueFalse_in_ruleNotesElement889 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleChemEquation_in_ruleNotesElement916 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleChemCompound_in_ruleNotesElement943 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleSpellbee_in_ruleNotesElement970 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleImageLabel_in_ruleNotesElement997 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_ruleNotesElement1024 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleRefToContext_in_ruleNotesElement1051 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleMultiChoice_in_ruleNotesElement1078 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_ruleNotesElement1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMeaning_in_entryRuleWordMeaning1136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordMeaning1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleWordMeaning1183 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleWordMeaning1201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWordMeaning1232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWordMeaning1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_entryRuleQuestionAnswer1295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionAnswer1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleQuestionAnswer1342 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleQuestionAnswer1360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestionAnswer1391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestionAnswer1413 = new BitSet(new long[]{0x0020000000000012L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleQuestionAnswer1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFIB_in_entryRuleFIB1477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFIB1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFIB1524 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleFIB1542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFIB1573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFIB1595 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition1637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDefinition1684 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleDefinition1702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefinition1733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefinition1755 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleDefinition1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_entryRuleCharacter1818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharacter1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCharacter1865 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleCharacter1883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharacter1914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharacter1936 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleCharacter1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeacherNote_in_entryRuleTeacherNote1999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTeacherNote2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTeacherNote2046 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleTeacherNote2064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTeacherNote2095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTeacherNote2118 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleTeacherNote2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatching_in_entryRuleMatching2181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatching2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMatching2228 = new BitSet(new long[]{0x0000000018100010L});
    public static final BitSet FOLLOW_20_in_ruleMatching2246 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_27_in_ruleMatching2278 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatching2309 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMatching2327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMatchPair_in_ruleMatching2348 = new BitSet(new long[]{0x00000000A0000010L});
    public static final BitSet FOLLOW_ruleMatchMCQConfig_in_ruleMatching2370 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMatching2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchPair_in_entryRuleMatchPair2419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchPair2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatchPair2471 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMatchPair2488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatchPair2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchMCQConfig_in_entryRuleMatchMCQConfig2546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchMCQConfig2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMatchMCQConfig2593 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMatchMCQConfig2605 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleMatchMCQConfig2617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatchMCQConfig2634 = new BitSet(new long[]{0x0000000E20000000L});
    public static final BitSet FOLLOW_33_in_ruleMatchMCQConfig2652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatchMCQConfig2669 = new BitSet(new long[]{0x0000000C20000000L});
    public static final BitSet FOLLOW_34_in_ruleMatchMCQConfig2689 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMatchMCQConfig2706 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_35_in_ruleMatchMCQConfig2726 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMatchMCQConfig2743 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMatchMCQConfig2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent2798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleEvent2845 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleEvent2863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent2894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueFalse_in_entryRuleTrueFalse2957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrueFalse2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTrueFalse3004 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleTrueFalse3022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTrueFalse3053 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleTrueFalse3075 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTrueFalse3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemEquation_in_entryRuleChemEquation3139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChemEquation3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleChemEquation3186 = new BitSet(new long[]{0x0000000010100010L});
    public static final BitSet FOLLOW_20_in_ruleChemEquation3204 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation3235 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleChemEquation3253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation3270 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleChemEquation3287 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation3304 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleChemEquation3322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation3339 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleChemEquation3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemCompound_in_entryRuleChemCompound3392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChemCompound3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleChemCompound3439 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleChemCompound3457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemCompound3488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemCompound3510 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemCompound3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpellbee_in_entryRuleSpellbee3574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpellbee3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleSpellbee3621 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleSpellbee3639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpellbee3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageLabel_in_entryRuleImageLabel3711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageLabel3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleImageLabel3758 = new BitSet(new long[]{0x0000000010100010L});
    public static final BitSet FOLLOW_20_in_ruleImageLabel3776 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageLabel3807 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleImageLabel3825 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleImageLabel3837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageLabel3854 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHotSpot_in_ruleImageLabel3880 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_44_in_ruleImageLabel3893 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHotSpot_in_ruleImageLabel3914 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_29_in_ruleImageLabel3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHotSpot_in_entryRuleHotSpot3964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHotSpot3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHotSpot4016 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleHotSpot4033 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHotSpot4050 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleHotSpot4067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHotSpot4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation4125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquation4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleEquation4172 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleEquation4190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEquation4221 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEquation4238 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEquation4255 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEquation4273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_ruleEquation4294 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_44_in_ruleEquation4307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_ruleEquation4328 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_29_in_ruleEquation4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_entryRuleEqSymbol4378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqSymbol4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqSymbol4430 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEqSymbol4447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqSymbol4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefToContext_in_entryRuleRefToContext4505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefToContext4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleRefToContext4552 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_20_in_ruleRefToContext4570 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRefToContext4596 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleRefToContext4608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRefToContext4625 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_ruleRefToContext4651 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_29_in_ruleRefToContext4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiChoice_in_entryRuleMultiChoice4700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiChoice4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleMultiChoice4747 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleMultiChoice4765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiChoice4796 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMultiChoice4813 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleMultiChoice4825 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMultiChoice4837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOption_in_ruleMultiChoice4858 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_44_in_ruleMultiChoice4871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOption_in_ruleMultiChoice4892 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_29_in_ruleMultiChoice4906 = new BitSet(new long[]{0x0008000C20000000L});
    public static final BitSet FOLLOW_34_in_ruleMultiChoice4919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMultiChoice4936 = new BitSet(new long[]{0x0008000820000000L});
    public static final BitSet FOLLOW_35_in_ruleMultiChoice4956 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMultiChoice4973 = new BitSet(new long[]{0x0008000020000000L});
    public static final BitSet FOLLOW_51_in_ruleMultiChoice4993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiChoice5010 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMultiChoice5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption5065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOption5117 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOption5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_entryRuleCMap5190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCMap5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleCMap5237 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCMap5249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCMap5266 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCMap5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript5319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleScript5366 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleScript5378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvalVar_in_ruleScript5399 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_44_in_ruleScript5412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvalVar_in_ruleScript5433 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_29_in_ruleScript5447 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleScriptBody_in_ruleScript5468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvalVar_in_entryRuleEvalVar5505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvalVar5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvalVar5557 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEvalVar5574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvalVar5591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptBody_in_entryRuleScriptBody5632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScriptBody5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleScriptBody5679 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleScriptBody5691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScriptBody5708 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleScriptBody5725 = new BitSet(new long[]{0x0000000000000002L});

}