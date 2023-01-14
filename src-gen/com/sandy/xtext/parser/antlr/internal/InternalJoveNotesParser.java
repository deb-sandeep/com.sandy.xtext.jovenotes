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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@skip_generation'", "'@skip_generation_in_production'", "'@exercise_bank'", "'subject'", "'chapterNumber'", "'.'", "'chapterName'", "'@wm'", "'hide'", "'@qa'", "'@fib'", "'@definition'", "'@character'", "'@tn'", "'@match'", "'skip_reverse_question'", "'{'", "'}'", "'='", "'@mcq_config'", "'@forwardCaption'", "'@reverseCaption'", "'@numOptionsToShow'", "'@numOptionsPerRow'", "'@event'", "'@true_false'", "'@chem_equation'", "'>'", "'@chem_compound'", "'@spellbee'", "'@image_label'", "'imageName'", "','", "'@equation'", "'where'", "'@rtc'", "'context'", "'@multi_choice'", "'@options'", "'@explanation'", "'@exercise'", "'marks'", "'hints'", "'answer'", "'@voice2text'", "'@compiler_break'", "'@section'", "'correct'", "'cmap'", "'script_expressions'", "'script'"
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


        public InternalJoveNotesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJoveNotesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJoveNotesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJoveNotes.g"; }



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
    // InternalJoveNotes.g:67:1: entryRuleJoveNotes returns [EObject current=null] : iv_ruleJoveNotes= ruleJoveNotes EOF ;
    public final EObject entryRuleJoveNotes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoveNotes = null;


        try {
            // InternalJoveNotes.g:68:2: (iv_ruleJoveNotes= ruleJoveNotes EOF )
            // InternalJoveNotes.g:69:2: iv_ruleJoveNotes= ruleJoveNotes EOF
            {
             newCompositeNode(grammarAccess.getJoveNotesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoveNotes=ruleJoveNotes();

            state._fsp--;

             current =iv_ruleJoveNotes; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:76:1: ruleJoveNotes returns [EObject current=null] : ( ( (lv_processingHints_0_0= ruleProcessingHints ) ) ( (lv_chapterDetails_1_0= ruleChapterDetails ) ) ( (lv_notesElements_2_0= ruleNotesElement ) )* ) ;
    public final EObject ruleJoveNotes() throws RecognitionException {
        EObject current = null;

        EObject lv_processingHints_0_0 = null;

        EObject lv_chapterDetails_1_0 = null;

        EObject lv_notesElements_2_0 = null;


         enterRule(); 
            
        try {
            // InternalJoveNotes.g:79:28: ( ( ( (lv_processingHints_0_0= ruleProcessingHints ) ) ( (lv_chapterDetails_1_0= ruleChapterDetails ) ) ( (lv_notesElements_2_0= ruleNotesElement ) )* ) )
            // InternalJoveNotes.g:80:1: ( ( (lv_processingHints_0_0= ruleProcessingHints ) ) ( (lv_chapterDetails_1_0= ruleChapterDetails ) ) ( (lv_notesElements_2_0= ruleNotesElement ) )* )
            {
            // InternalJoveNotes.g:80:1: ( ( (lv_processingHints_0_0= ruleProcessingHints ) ) ( (lv_chapterDetails_1_0= ruleChapterDetails ) ) ( (lv_notesElements_2_0= ruleNotesElement ) )* )
            // InternalJoveNotes.g:80:2: ( (lv_processingHints_0_0= ruleProcessingHints ) ) ( (lv_chapterDetails_1_0= ruleChapterDetails ) ) ( (lv_notesElements_2_0= ruleNotesElement ) )*
            {
            // InternalJoveNotes.g:80:2: ( (lv_processingHints_0_0= ruleProcessingHints ) )
            // InternalJoveNotes.g:81:1: (lv_processingHints_0_0= ruleProcessingHints )
            {
            // InternalJoveNotes.g:81:1: (lv_processingHints_0_0= ruleProcessingHints )
            // InternalJoveNotes.g:82:3: lv_processingHints_0_0= ruleProcessingHints
            {
             
            	        newCompositeNode(grammarAccess.getJoveNotesAccess().getProcessingHintsProcessingHintsParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_3);
            lv_processingHints_0_0=ruleProcessingHints();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoveNotesRule());
            	        }
                   		set(
                   			current, 
                   			"processingHints",
                    		lv_processingHints_0_0, 
                    		"com.sandy.xtext.JoveNotes.ProcessingHints");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalJoveNotes.g:98:2: ( (lv_chapterDetails_1_0= ruleChapterDetails ) )
            // InternalJoveNotes.g:99:1: (lv_chapterDetails_1_0= ruleChapterDetails )
            {
            // InternalJoveNotes.g:99:1: (lv_chapterDetails_1_0= ruleChapterDetails )
            // InternalJoveNotes.g:100:3: lv_chapterDetails_1_0= ruleChapterDetails
            {
             
            	        newCompositeNode(grammarAccess.getJoveNotesAccess().getChapterDetailsChapterDetailsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_4);
            lv_chapterDetails_1_0=ruleChapterDetails();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoveNotesRule());
            	        }
                   		set(
                   			current, 
                   			"chapterDetails",
                    		lv_chapterDetails_1_0, 
                    		"com.sandy.xtext.JoveNotes.ChapterDetails");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalJoveNotes.g:116:2: ( (lv_notesElements_2_0= ruleNotesElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19||(LA1_0>=21 && LA1_0<=26)||(LA1_0>=36 && LA1_0<=38)||(LA1_0>=40 && LA1_0<=42)||LA1_0==45||LA1_0==47||LA1_0==49||LA1_0==52||(LA1_0>=56 && LA1_0<=58)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJoveNotes.g:117:1: (lv_notesElements_2_0= ruleNotesElement )
            	    {
            	    // InternalJoveNotes.g:117:1: (lv_notesElements_2_0= ruleNotesElement )
            	    // InternalJoveNotes.g:118:3: lv_notesElements_2_0= ruleNotesElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJoveNotesAccess().getNotesElementsNotesElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_4);
            	    lv_notesElements_2_0=ruleNotesElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJoveNotesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"notesElements",
            	            		lv_notesElements_2_0, 
            	            		"com.sandy.xtext.JoveNotes.NotesElement");
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
    // InternalJoveNotes.g:142:1: entryRuleProcessingHints returns [EObject current=null] : iv_ruleProcessingHints= ruleProcessingHints EOF ;
    public final EObject entryRuleProcessingHints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessingHints = null;


        try {
            // InternalJoveNotes.g:143:2: (iv_ruleProcessingHints= ruleProcessingHints EOF )
            // InternalJoveNotes.g:144:2: iv_ruleProcessingHints= ruleProcessingHints EOF
            {
             newCompositeNode(grammarAccess.getProcessingHintsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessingHints=ruleProcessingHints();

            state._fsp--;

             current =iv_ruleProcessingHints; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:151:1: ruleProcessingHints returns [EObject current=null] : ( () ( (lv_skipGeneration_1_0= '@skip_generation' ) )? ( (lv_skipGenerationInProduction_2_0= '@skip_generation_in_production' ) )? ) ;
    public final EObject ruleProcessingHints() throws RecognitionException {
        EObject current = null;

        Token lv_skipGeneration_1_0=null;
        Token lv_skipGenerationInProduction_2_0=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:154:28: ( ( () ( (lv_skipGeneration_1_0= '@skip_generation' ) )? ( (lv_skipGenerationInProduction_2_0= '@skip_generation_in_production' ) )? ) )
            // InternalJoveNotes.g:155:1: ( () ( (lv_skipGeneration_1_0= '@skip_generation' ) )? ( (lv_skipGenerationInProduction_2_0= '@skip_generation_in_production' ) )? )
            {
            // InternalJoveNotes.g:155:1: ( () ( (lv_skipGeneration_1_0= '@skip_generation' ) )? ( (lv_skipGenerationInProduction_2_0= '@skip_generation_in_production' ) )? )
            // InternalJoveNotes.g:155:2: () ( (lv_skipGeneration_1_0= '@skip_generation' ) )? ( (lv_skipGenerationInProduction_2_0= '@skip_generation_in_production' ) )?
            {
            // InternalJoveNotes.g:155:2: ()
            // InternalJoveNotes.g:156:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProcessingHintsAccess().getProcessingHintsAction_0(),
                        current);
                

            }

            // InternalJoveNotes.g:161:2: ( (lv_skipGeneration_1_0= '@skip_generation' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalJoveNotes.g:162:1: (lv_skipGeneration_1_0= '@skip_generation' )
                    {
                    // InternalJoveNotes.g:162:1: (lv_skipGeneration_1_0= '@skip_generation' )
                    // InternalJoveNotes.g:163:3: lv_skipGeneration_1_0= '@skip_generation'
                    {
                    lv_skipGeneration_1_0=(Token)match(input,12,FOLLOW_5); 

                            newLeafNode(lv_skipGeneration_1_0, grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProcessingHintsRule());
                    	        }
                           		setWithLastConsumed(current, "skipGeneration", lv_skipGeneration_1_0, "@skip_generation");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:176:3: ( (lv_skipGenerationInProduction_2_0= '@skip_generation_in_production' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJoveNotes.g:177:1: (lv_skipGenerationInProduction_2_0= '@skip_generation_in_production' )
                    {
                    // InternalJoveNotes.g:177:1: (lv_skipGenerationInProduction_2_0= '@skip_generation_in_production' )
                    // InternalJoveNotes.g:178:3: lv_skipGenerationInProduction_2_0= '@skip_generation_in_production'
                    {
                    lv_skipGenerationInProduction_2_0=(Token)match(input,13,FOLLOW_2); 

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
    // InternalJoveNotes.g:199:1: entryRuleChapterDetails returns [EObject current=null] : iv_ruleChapterDetails= ruleChapterDetails EOF ;
    public final EObject entryRuleChapterDetails() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapterDetails = null;


        try {
            // InternalJoveNotes.g:200:2: (iv_ruleChapterDetails= ruleChapterDetails EOF )
            // InternalJoveNotes.g:201:2: iv_ruleChapterDetails= ruleChapterDetails EOF
            {
             newCompositeNode(grammarAccess.getChapterDetailsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChapterDetails=ruleChapterDetails();

            state._fsp--;

             current =iv_ruleChapterDetails; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:208:1: ruleChapterDetails returns [EObject current=null] : ( ( (lv_exerciseBank_0_0= '@exercise_bank' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ( (lv_scriptBody_9_0= ruleScriptBody ) )? ) ;
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
            // InternalJoveNotes.g:211:28: ( ( ( (lv_exerciseBank_0_0= '@exercise_bank' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ( (lv_scriptBody_9_0= ruleScriptBody ) )? ) )
            // InternalJoveNotes.g:212:1: ( ( (lv_exerciseBank_0_0= '@exercise_bank' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ( (lv_scriptBody_9_0= ruleScriptBody ) )? )
            {
            // InternalJoveNotes.g:212:1: ( ( (lv_exerciseBank_0_0= '@exercise_bank' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ( (lv_scriptBody_9_0= ruleScriptBody ) )? )
            // InternalJoveNotes.g:212:2: ( (lv_exerciseBank_0_0= '@exercise_bank' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ( (lv_scriptBody_9_0= ruleScriptBody ) )?
            {
            // InternalJoveNotes.g:212:2: ( (lv_exerciseBank_0_0= '@exercise_bank' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJoveNotes.g:213:1: (lv_exerciseBank_0_0= '@exercise_bank' )
                    {
                    // InternalJoveNotes.g:213:1: (lv_exerciseBank_0_0= '@exercise_bank' )
                    // InternalJoveNotes.g:214:3: lv_exerciseBank_0_0= '@exercise_bank'
                    {
                    lv_exerciseBank_0_0=(Token)match(input,14,FOLLOW_6); 

                            newLeafNode(lv_exerciseBank_0_0, grammarAccess.getChapterDetailsAccess().getExerciseBankExercise_bankKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChapterDetailsRule());
                    	        }
                           		setWithLastConsumed(current, "exerciseBank", lv_exerciseBank_0_0, "@exercise_bank");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getChapterDetailsAccess().getSubjectKeyword_1());
                
            // InternalJoveNotes.g:231:1: ( (lv_subjectName_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:232:1: (lv_subjectName_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:232:1: (lv_subjectName_2_0= RULE_STRING )
            // InternalJoveNotes.g:233:3: lv_subjectName_2_0= RULE_STRING
            {
            lv_subjectName_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            			newLeafNode(lv_subjectName_2_0, grammarAccess.getChapterDetailsAccess().getSubjectNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChapterDetailsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"subjectName",
                    		lv_subjectName_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_9); 

                	newLeafNode(otherlv_3, grammarAccess.getChapterDetailsAccess().getChapterNumberKeyword_3());
                
            // InternalJoveNotes.g:253:1: ( (lv_chapterNumber_4_0= RULE_INT ) )
            // InternalJoveNotes.g:254:1: (lv_chapterNumber_4_0= RULE_INT )
            {
            // InternalJoveNotes.g:254:1: (lv_chapterNumber_4_0= RULE_INT )
            // InternalJoveNotes.g:255:3: lv_chapterNumber_4_0= RULE_INT
            {
            lv_chapterNumber_4_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            			newLeafNode(lv_chapterNumber_4_0, grammarAccess.getChapterDetailsAccess().getChapterNumberINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChapterDetailsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"chapterNumber",
                    		lv_chapterNumber_4_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_9); 

                	newLeafNode(otherlv_5, grammarAccess.getChapterDetailsAccess().getFullStopKeyword_5());
                
            // InternalJoveNotes.g:275:1: ( (lv_subChapterNumber_6_0= RULE_INT ) )
            // InternalJoveNotes.g:276:1: (lv_subChapterNumber_6_0= RULE_INT )
            {
            // InternalJoveNotes.g:276:1: (lv_subChapterNumber_6_0= RULE_INT )
            // InternalJoveNotes.g:277:3: lv_subChapterNumber_6_0= RULE_INT
            {
            lv_subChapterNumber_6_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            			newLeafNode(lv_subChapterNumber_6_0, grammarAccess.getChapterDetailsAccess().getSubChapterNumberINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChapterDetailsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"subChapterNumber",
                    		lv_subChapterNumber_6_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_7); 

                	newLeafNode(otherlv_7, grammarAccess.getChapterDetailsAccess().getChapterNameKeyword_7());
                
            // InternalJoveNotes.g:297:1: ( (lv_chapterName_8_0= RULE_STRING ) )
            // InternalJoveNotes.g:298:1: (lv_chapterName_8_0= RULE_STRING )
            {
            // InternalJoveNotes.g:298:1: (lv_chapterName_8_0= RULE_STRING )
            // InternalJoveNotes.g:299:3: lv_chapterName_8_0= RULE_STRING
            {
            lv_chapterName_8_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            			newLeafNode(lv_chapterName_8_0, grammarAccess.getChapterDetailsAccess().getChapterNameSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChapterDetailsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"chapterName",
                    		lv_chapterName_8_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:315:2: ( (lv_scriptBody_9_0= ruleScriptBody ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==62) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJoveNotes.g:316:1: (lv_scriptBody_9_0= ruleScriptBody )
                    {
                    // InternalJoveNotes.g:316:1: (lv_scriptBody_9_0= ruleScriptBody )
                    // InternalJoveNotes.g:317:3: lv_scriptBody_9_0= ruleScriptBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getChapterDetailsAccess().getScriptBodyScriptBodyParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_scriptBody_9_0=ruleScriptBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChapterDetailsRule());
                    	        }
                           		set(
                           			current, 
                           			"scriptBody",
                            		lv_scriptBody_9_0, 
                            		"com.sandy.xtext.JoveNotes.ScriptBody");
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
    // InternalJoveNotes.g:341:1: entryRuleNotesElement returns [EObject current=null] : iv_ruleNotesElement= ruleNotesElement EOF ;
    public final EObject entryRuleNotesElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotesElement = null;


        try {
            // InternalJoveNotes.g:342:2: (iv_ruleNotesElement= ruleNotesElement EOF )
            // InternalJoveNotes.g:343:2: iv_ruleNotesElement= ruleNotesElement EOF
            {
             newCompositeNode(grammarAccess.getNotesElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotesElement=ruleNotesElement();

            state._fsp--;

             current =iv_ruleNotesElement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:350:1: ruleNotesElement returns [EObject current=null] : ( (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice | this_Exercise_16= ruleExercise | this_VoiceToText_17= ruleVoiceToText | this_CompilerBreak_18= ruleCompilerBreak | this_ChapterSection_19= ruleChapterSection ) ( (lv_script_20_0= ruleScript ) )? ) ;
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

        EObject this_VoiceToText_17 = null;

        EObject this_CompilerBreak_18 = null;

        EObject this_ChapterSection_19 = null;

        EObject lv_script_20_0 = null;


         enterRule(); 
            
        try {
            // InternalJoveNotes.g:353:28: ( ( (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice | this_Exercise_16= ruleExercise | this_VoiceToText_17= ruleVoiceToText | this_CompilerBreak_18= ruleCompilerBreak | this_ChapterSection_19= ruleChapterSection ) ( (lv_script_20_0= ruleScript ) )? ) )
            // InternalJoveNotes.g:354:1: ( (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice | this_Exercise_16= ruleExercise | this_VoiceToText_17= ruleVoiceToText | this_CompilerBreak_18= ruleCompilerBreak | this_ChapterSection_19= ruleChapterSection ) ( (lv_script_20_0= ruleScript ) )? )
            {
            // InternalJoveNotes.g:354:1: ( (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice | this_Exercise_16= ruleExercise | this_VoiceToText_17= ruleVoiceToText | this_CompilerBreak_18= ruleCompilerBreak | this_ChapterSection_19= ruleChapterSection ) ( (lv_script_20_0= ruleScript ) )? )
            // InternalJoveNotes.g:354:2: (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice | this_Exercise_16= ruleExercise | this_VoiceToText_17= ruleVoiceToText | this_CompilerBreak_18= ruleCompilerBreak | this_ChapterSection_19= ruleChapterSection ) ( (lv_script_20_0= ruleScript ) )?
            {
            // InternalJoveNotes.g:354:2: (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext | this_MultiChoice_15= ruleMultiChoice | this_Exercise_16= ruleExercise | this_VoiceToText_17= ruleVoiceToText | this_CompilerBreak_18= ruleCompilerBreak | this_ChapterSection_19= ruleChapterSection )
            int alt6=20;
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
            case 56:
                {
                alt6=18;
                }
                break;
            case 57:
                {
                alt6=19;
                }
                break;
            case 58:
                {
                alt6=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalJoveNotes.g:355:5: this_WordMeaning_0= ruleWordMeaning
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getWordMeaningParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_13);
                    this_WordMeaning_0=ruleWordMeaning();

                    state._fsp--;

                     
                            current = this_WordMeaning_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalJoveNotes.g:365:5: this_QuestionAnswer_1= ruleQuestionAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getQuestionAnswerParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_13);
                    this_QuestionAnswer_1=ruleQuestionAnswer();

                    state._fsp--;

                     
                            current = this_QuestionAnswer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalJoveNotes.g:375:5: this_FIB_2= ruleFIB
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getFIBParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_13);
                    this_FIB_2=ruleFIB();

                    state._fsp--;

                     
                            current = this_FIB_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalJoveNotes.g:385:5: this_Definition_3= ruleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getDefinitionParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_13);
                    this_Definition_3=ruleDefinition();

                    state._fsp--;

                     
                            current = this_Definition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalJoveNotes.g:395:5: this_Character_4= ruleCharacter
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getCharacterParserRuleCall_0_4()); 
                        
                    pushFollow(FOLLOW_13);
                    this_Character_4=ruleCharacter();

                    state._fsp--;

                     
                            current = this_Character_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalJoveNotes.g:405:5: this_TeacherNote_5= ruleTeacherNote
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getTeacherNoteParserRuleCall_0_5()); 
                        
                    pushFollow(FOLLOW_13);
                    this_TeacherNote_5=ruleTeacherNote();

                    state._fsp--;

                     
                            current = this_TeacherNote_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalJoveNotes.g:415:5: this_Matching_6= ruleMatching
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getMatchingParserRuleCall_0_6()); 
                        
                    pushFollow(FOLLOW_13);
                    this_Matching_6=ruleMatching();

                    state._fsp--;

                     
                            current = this_Matching_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalJoveNotes.g:425:5: this_Event_7= ruleEvent
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getEventParserRuleCall_0_7()); 
                        
                    pushFollow(FOLLOW_13);
                    this_Event_7=ruleEvent();

                    state._fsp--;

                     
                            current = this_Event_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalJoveNotes.g:435:5: this_TrueFalse_8= ruleTrueFalse
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getTrueFalseParserRuleCall_0_8()); 
                        
                    pushFollow(FOLLOW_13);
                    this_TrueFalse_8=ruleTrueFalse();

                    state._fsp--;

                     
                            current = this_TrueFalse_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // InternalJoveNotes.g:445:5: this_ChemEquation_9= ruleChemEquation
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getChemEquationParserRuleCall_0_9()); 
                        
                    pushFollow(FOLLOW_13);
                    this_ChemEquation_9=ruleChemEquation();

                    state._fsp--;

                     
                            current = this_ChemEquation_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // InternalJoveNotes.g:455:5: this_ChemCompound_10= ruleChemCompound
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getChemCompoundParserRuleCall_0_10()); 
                        
                    pushFollow(FOLLOW_13);
                    this_ChemCompound_10=ruleChemCompound();

                    state._fsp--;

                     
                            current = this_ChemCompound_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // InternalJoveNotes.g:465:5: this_Spellbee_11= ruleSpellbee
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getSpellbeeParserRuleCall_0_11()); 
                        
                    pushFollow(FOLLOW_13);
                    this_Spellbee_11=ruleSpellbee();

                    state._fsp--;

                     
                            current = this_Spellbee_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // InternalJoveNotes.g:475:5: this_ImageLabel_12= ruleImageLabel
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getImageLabelParserRuleCall_0_12()); 
                        
                    pushFollow(FOLLOW_13);
                    this_ImageLabel_12=ruleImageLabel();

                    state._fsp--;

                     
                            current = this_ImageLabel_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // InternalJoveNotes.g:485:5: this_Equation_13= ruleEquation
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getEquationParserRuleCall_0_13()); 
                        
                    pushFollow(FOLLOW_13);
                    this_Equation_13=ruleEquation();

                    state._fsp--;

                     
                            current = this_Equation_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // InternalJoveNotes.g:495:5: this_RefToContext_14= ruleRefToContext
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getRefToContextParserRuleCall_0_14()); 
                        
                    pushFollow(FOLLOW_13);
                    this_RefToContext_14=ruleRefToContext();

                    state._fsp--;

                     
                            current = this_RefToContext_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // InternalJoveNotes.g:505:5: this_MultiChoice_15= ruleMultiChoice
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getMultiChoiceParserRuleCall_0_15()); 
                        
                    pushFollow(FOLLOW_13);
                    this_MultiChoice_15=ruleMultiChoice();

                    state._fsp--;

                     
                            current = this_MultiChoice_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // InternalJoveNotes.g:515:5: this_Exercise_16= ruleExercise
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getExerciseParserRuleCall_0_16()); 
                        
                    pushFollow(FOLLOW_13);
                    this_Exercise_16=ruleExercise();

                    state._fsp--;

                     
                            current = this_Exercise_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // InternalJoveNotes.g:525:5: this_VoiceToText_17= ruleVoiceToText
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getVoiceToTextParserRuleCall_0_17()); 
                        
                    pushFollow(FOLLOW_13);
                    this_VoiceToText_17=ruleVoiceToText();

                    state._fsp--;

                     
                            current = this_VoiceToText_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // InternalJoveNotes.g:535:5: this_CompilerBreak_18= ruleCompilerBreak
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getCompilerBreakParserRuleCall_0_18()); 
                        
                    pushFollow(FOLLOW_13);
                    this_CompilerBreak_18=ruleCompilerBreak();

                    state._fsp--;

                     
                            current = this_CompilerBreak_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // InternalJoveNotes.g:545:5: this_ChapterSection_19= ruleChapterSection
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getChapterSectionParserRuleCall_0_19()); 
                        
                    pushFollow(FOLLOW_13);
                    this_ChapterSection_19=ruleChapterSection();

                    state._fsp--;

                     
                            current = this_ChapterSection_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // InternalJoveNotes.g:553:2: ( (lv_script_20_0= ruleScript ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==61) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJoveNotes.g:554:1: (lv_script_20_0= ruleScript )
                    {
                    // InternalJoveNotes.g:554:1: (lv_script_20_0= ruleScript )
                    // InternalJoveNotes.g:555:3: lv_script_20_0= ruleScript
                    {
                     
                    	        newCompositeNode(grammarAccess.getNotesElementAccess().getScriptScriptParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_script_20_0=ruleScript();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNotesElementRule());
                    	        }
                           		set(
                           			current, 
                           			"script",
                            		lv_script_20_0, 
                            		"com.sandy.xtext.JoveNotes.Script");
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
    // InternalJoveNotes.g:579:1: entryRuleWordMeaning returns [EObject current=null] : iv_ruleWordMeaning= ruleWordMeaning EOF ;
    public final EObject entryRuleWordMeaning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordMeaning = null;


        try {
            // InternalJoveNotes.g:580:2: (iv_ruleWordMeaning= ruleWordMeaning EOF )
            // InternalJoveNotes.g:581:2: iv_ruleWordMeaning= ruleWordMeaning EOF
            {
             newCompositeNode(grammarAccess.getWordMeaningRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWordMeaning=ruleWordMeaning();

            state._fsp--;

             current =iv_ruleWordMeaning; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:588:1: ruleWordMeaning returns [EObject current=null] : (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleWordMeaning() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_word_2_0=null;
        Token lv_meaning_3_0=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:591:28: ( (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) ) )
            // InternalJoveNotes.g:592:1: (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) )
            {
            // InternalJoveNotes.g:592:1: (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) )
            // InternalJoveNotes.g:592:3: otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getWordMeaningAccess().getWmKeyword_0());
                
            // InternalJoveNotes.g:596:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJoveNotes.g:597:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:597:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:598:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_7); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWordMeaningRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:611:3: ( (lv_word_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:612:1: (lv_word_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:612:1: (lv_word_2_0= RULE_STRING )
            // InternalJoveNotes.g:613:3: lv_word_2_0= RULE_STRING
            {
            lv_word_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			newLeafNode(lv_word_2_0, grammarAccess.getWordMeaningAccess().getWordSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWordMeaningRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"word",
                    		lv_word_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:629:2: ( (lv_meaning_3_0= RULE_STRING ) )
            // InternalJoveNotes.g:630:1: (lv_meaning_3_0= RULE_STRING )
            {
            // InternalJoveNotes.g:630:1: (lv_meaning_3_0= RULE_STRING )
            // InternalJoveNotes.g:631:3: lv_meaning_3_0= RULE_STRING
            {
            lv_meaning_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_meaning_3_0, grammarAccess.getWordMeaningAccess().getMeaningSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWordMeaningRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"meaning",
                    		lv_meaning_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // InternalJoveNotes.g:655:1: entryRuleQuestionAnswer returns [EObject current=null] : iv_ruleQuestionAnswer= ruleQuestionAnswer EOF ;
    public final EObject entryRuleQuestionAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionAnswer = null;


        try {
            // InternalJoveNotes.g:656:2: (iv_ruleQuestionAnswer= ruleQuestionAnswer EOF )
            // InternalJoveNotes.g:657:2: iv_ruleQuestionAnswer= ruleQuestionAnswer EOF
            {
             newCompositeNode(grammarAccess.getQuestionAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionAnswer=ruleQuestionAnswer();

            state._fsp--;

             current =iv_ruleQuestionAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:664:1: ruleQuestionAnswer returns [EObject current=null] : (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleQuestionAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_question_2_0=null;
        Token lv_answerParts_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // InternalJoveNotes.g:667:28: ( (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // InternalJoveNotes.g:668:1: (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // InternalJoveNotes.g:668:1: (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )? )
            // InternalJoveNotes.g:668:3: otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAnswerAccess().getQaKeyword_0());
                
            // InternalJoveNotes.g:672:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJoveNotes.g:673:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:673:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:674:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_7); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionAnswerRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:687:3: ( (lv_question_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:688:1: (lv_question_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:688:1: (lv_question_2_0= RULE_STRING )
            // InternalJoveNotes.g:689:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			newLeafNode(lv_question_2_0, grammarAccess.getQuestionAnswerAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:705:2: ( (lv_answerParts_3_0= RULE_STRING ) )+
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
            	    // InternalJoveNotes.g:706:1: (lv_answerParts_3_0= RULE_STRING )
            	    {
            	    // InternalJoveNotes.g:706:1: (lv_answerParts_3_0= RULE_STRING )
            	    // InternalJoveNotes.g:707:3: lv_answerParts_3_0= RULE_STRING
            	    {
            	    lv_answerParts_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    			newLeafNode(lv_answerParts_3_0, grammarAccess.getQuestionAnswerAccess().getAnswerPartsSTRINGTerminalRuleCall_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQuestionAnswerRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"answerParts",
            	            		lv_answerParts_3_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

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

            // InternalJoveNotes.g:723:3: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==60) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJoveNotes.g:724:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // InternalJoveNotes.g:724:1: (lv_cmap_4_0= ruleCMap )
                    // InternalJoveNotes.g:725:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionAnswerAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_cmap_4_0=ruleCMap();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQuestionAnswerRule());
                    	        }
                           		set(
                           			current, 
                           			"cmap",
                            		lv_cmap_4_0, 
                            		"com.sandy.xtext.JoveNotes.CMap");
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
    // InternalJoveNotes.g:749:1: entryRuleFIB returns [EObject current=null] : iv_ruleFIB= ruleFIB EOF ;
    public final EObject entryRuleFIB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFIB = null;


        try {
            // InternalJoveNotes.g:750:2: (iv_ruleFIB= ruleFIB EOF )
            // InternalJoveNotes.g:751:2: iv_ruleFIB= ruleFIB EOF
            {
             newCompositeNode(grammarAccess.getFIBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFIB=ruleFIB();

            state._fsp--;

             current =iv_ruleFIB; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:758:1: ruleFIB returns [EObject current=null] : (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ ) ;
    public final EObject ruleFIB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_question_2_0=null;
        Token lv_answers_3_0=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:761:28: ( (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ ) )
            // InternalJoveNotes.g:762:1: (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ )
            {
            // InternalJoveNotes.g:762:1: (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ )
            // InternalJoveNotes.g:762:3: otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getFIBAccess().getFibKeyword_0());
                
            // InternalJoveNotes.g:766:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJoveNotes.g:767:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:767:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:768:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_7); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFIBRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:781:3: ( (lv_question_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:782:1: (lv_question_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:782:1: (lv_question_2_0= RULE_STRING )
            // InternalJoveNotes.g:783:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			newLeafNode(lv_question_2_0, grammarAccess.getFIBAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFIBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:799:2: ( (lv_answers_3_0= RULE_STRING ) )+
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
            	    // InternalJoveNotes.g:800:1: (lv_answers_3_0= RULE_STRING )
            	    {
            	    // InternalJoveNotes.g:800:1: (lv_answers_3_0= RULE_STRING )
            	    // InternalJoveNotes.g:801:3: lv_answers_3_0= RULE_STRING
            	    {
            	    lv_answers_3_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            	    			newLeafNode(lv_answers_3_0, grammarAccess.getFIBAccess().getAnswersSTRINGTerminalRuleCall_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFIBRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"answers",
            	            		lv_answers_3_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

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
    // InternalJoveNotes.g:825:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalJoveNotes.g:826:2: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalJoveNotes.g:827:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:834:1: ruleDefinition returns [EObject current=null] : (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_term_2_0=null;
        Token lv_definition_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // InternalJoveNotes.g:837:28: ( (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // InternalJoveNotes.g:838:1: (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // InternalJoveNotes.g:838:1: (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            // InternalJoveNotes.g:838:3: otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefinitionKeyword_0());
                
            // InternalJoveNotes.g:842:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJoveNotes.g:843:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:843:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:844:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_7); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:857:3: ( (lv_term_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:858:1: (lv_term_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:858:1: (lv_term_2_0= RULE_STRING )
            // InternalJoveNotes.g:859:3: lv_term_2_0= RULE_STRING
            {
            lv_term_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			newLeafNode(lv_term_2_0, grammarAccess.getDefinitionAccess().getTermSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"term",
                    		lv_term_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:875:2: ( (lv_definition_3_0= RULE_STRING ) )
            // InternalJoveNotes.g:876:1: (lv_definition_3_0= RULE_STRING )
            {
            // InternalJoveNotes.g:876:1: (lv_definition_3_0= RULE_STRING )
            // InternalJoveNotes.g:877:3: lv_definition_3_0= RULE_STRING
            {
            lv_definition_3_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            			newLeafNode(lv_definition_3_0, grammarAccess.getDefinitionAccess().getDefinitionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"definition",
                    		lv_definition_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:893:2: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==60) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJoveNotes.g:894:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // InternalJoveNotes.g:894:1: (lv_cmap_4_0= ruleCMap )
                    // InternalJoveNotes.g:895:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefinitionAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_cmap_4_0=ruleCMap();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"cmap",
                            		lv_cmap_4_0, 
                            		"com.sandy.xtext.JoveNotes.CMap");
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
    // InternalJoveNotes.g:919:1: entryRuleCharacter returns [EObject current=null] : iv_ruleCharacter= ruleCharacter EOF ;
    public final EObject entryRuleCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacter = null;


        try {
            // InternalJoveNotes.g:920:2: (iv_ruleCharacter= ruleCharacter EOF )
            // InternalJoveNotes.g:921:2: iv_ruleCharacter= ruleCharacter EOF
            {
             newCompositeNode(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacter=ruleCharacter();

            state._fsp--;

             current =iv_ruleCharacter; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:928:1: ruleCharacter returns [EObject current=null] : (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_character_2_0=null;
        Token lv_estimate_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // InternalJoveNotes.g:931:28: ( (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // InternalJoveNotes.g:932:1: (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // InternalJoveNotes.g:932:1: (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            // InternalJoveNotes.g:932:3: otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getCharacterAccess().getCharacterKeyword_0());
                
            // InternalJoveNotes.g:936:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJoveNotes.g:937:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:937:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:938:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_7); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCharacterRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:951:3: ( (lv_character_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:952:1: (lv_character_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:952:1: (lv_character_2_0= RULE_STRING )
            // InternalJoveNotes.g:953:3: lv_character_2_0= RULE_STRING
            {
            lv_character_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			newLeafNode(lv_character_2_0, grammarAccess.getCharacterAccess().getCharacterSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCharacterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"character",
                    		lv_character_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:969:2: ( (lv_estimate_3_0= RULE_STRING ) )
            // InternalJoveNotes.g:970:1: (lv_estimate_3_0= RULE_STRING )
            {
            // InternalJoveNotes.g:970:1: (lv_estimate_3_0= RULE_STRING )
            // InternalJoveNotes.g:971:3: lv_estimate_3_0= RULE_STRING
            {
            lv_estimate_3_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            			newLeafNode(lv_estimate_3_0, grammarAccess.getCharacterAccess().getEstimateSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCharacterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"estimate",
                    		lv_estimate_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:987:2: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==60) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJoveNotes.g:988:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // InternalJoveNotes.g:988:1: (lv_cmap_4_0= ruleCMap )
                    // InternalJoveNotes.g:989:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_cmap_4_0=ruleCMap();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterRule());
                    	        }
                           		set(
                           			current, 
                           			"cmap",
                            		lv_cmap_4_0, 
                            		"com.sandy.xtext.JoveNotes.CMap");
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
    // InternalJoveNotes.g:1013:1: entryRuleTeacherNote returns [EObject current=null] : iv_ruleTeacherNote= ruleTeacherNote EOF ;
    public final EObject entryRuleTeacherNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeacherNote = null;


        try {
            // InternalJoveNotes.g:1014:2: (iv_ruleTeacherNote= ruleTeacherNote EOF )
            // InternalJoveNotes.g:1015:2: iv_ruleTeacherNote= ruleTeacherNote EOF
            {
             newCompositeNode(grammarAccess.getTeacherNoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeacherNote=ruleTeacherNote();

            state._fsp--;

             current =iv_ruleTeacherNote; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:1022:1: ruleTeacherNote returns [EObject current=null] : (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleTeacherNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_caption_2_0=null;
        Token lv_note_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // InternalJoveNotes.g:1025:28: ( (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // InternalJoveNotes.g:1026:1: (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // InternalJoveNotes.g:1026:1: (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            // InternalJoveNotes.g:1026:3: otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getTeacherNoteAccess().getTnKeyword_0());
                
            // InternalJoveNotes.g:1030:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJoveNotes.g:1031:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:1031:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:1032:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_7); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTeacherNoteRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:1045:3: ( (lv_caption_2_0= RULE_STRING ) )?
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
                    // InternalJoveNotes.g:1046:1: (lv_caption_2_0= RULE_STRING )
                    {
                    // InternalJoveNotes.g:1046:1: (lv_caption_2_0= RULE_STRING )
                    // InternalJoveNotes.g:1047:3: lv_caption_2_0= RULE_STRING
                    {
                    lv_caption_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    			newLeafNode(lv_caption_2_0, grammarAccess.getTeacherNoteAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTeacherNoteRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"caption",
                            		lv_caption_2_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:1063:3: ( (lv_note_3_0= RULE_STRING ) )
            // InternalJoveNotes.g:1064:1: (lv_note_3_0= RULE_STRING )
            {
            // InternalJoveNotes.g:1064:1: (lv_note_3_0= RULE_STRING )
            // InternalJoveNotes.g:1065:3: lv_note_3_0= RULE_STRING
            {
            lv_note_3_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            			newLeafNode(lv_note_3_0, grammarAccess.getTeacherNoteAccess().getNoteSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTeacherNoteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"note",
                    		lv_note_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:1081:2: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==60) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJoveNotes.g:1082:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // InternalJoveNotes.g:1082:1: (lv_cmap_4_0= ruleCMap )
                    // InternalJoveNotes.g:1083:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getTeacherNoteAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_cmap_4_0=ruleCMap();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTeacherNoteRule());
                    	        }
                           		set(
                           			current, 
                           			"cmap",
                            		lv_cmap_4_0, 
                            		"com.sandy.xtext.JoveNotes.CMap");
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
    // InternalJoveNotes.g:1107:1: entryRuleMatching returns [EObject current=null] : iv_ruleMatching= ruleMatching EOF ;
    public final EObject entryRuleMatching() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatching = null;


        try {
            // InternalJoveNotes.g:1108:2: (iv_ruleMatching= ruleMatching EOF )
            // InternalJoveNotes.g:1109:2: iv_ruleMatching= ruleMatching EOF
            {
             newCompositeNode(grammarAccess.getMatchingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatching=ruleMatching();

            state._fsp--;

             current =iv_ruleMatching; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:1116:1: ruleMatching returns [EObject current=null] : (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )? otherlv_7= '}' ) ;
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
            // InternalJoveNotes.g:1119:28: ( (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )? otherlv_7= '}' ) )
            // InternalJoveNotes.g:1120:1: (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )? otherlv_7= '}' )
            {
            // InternalJoveNotes.g:1120:1: (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )? otherlv_7= '}' )
            // InternalJoveNotes.g:1120:3: otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_18); 

                	newLeafNode(otherlv_0, grammarAccess.getMatchingAccess().getMatchKeyword_0());
                
            // InternalJoveNotes.g:1124:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJoveNotes.g:1125:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:1125:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:1126:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_19); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchingRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:1139:3: ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJoveNotes.g:1140:1: (lv_skipReverseQuestion_2_0= 'skip_reverse_question' )
                    {
                    // InternalJoveNotes.g:1140:1: (lv_skipReverseQuestion_2_0= 'skip_reverse_question' )
                    // InternalJoveNotes.g:1141:3: lv_skipReverseQuestion_2_0= 'skip_reverse_question'
                    {
                    lv_skipReverseQuestion_2_0=(Token)match(input,27,FOLLOW_20); 

                            newLeafNode(lv_skipReverseQuestion_2_0, grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchingRule());
                    	        }
                           		setWithLastConsumed(current, "skipReverseQuestion", lv_skipReverseQuestion_2_0, "skip_reverse_question");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:1154:3: ( (lv_question_3_0= RULE_STRING ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJoveNotes.g:1155:1: (lv_question_3_0= RULE_STRING )
                    {
                    // InternalJoveNotes.g:1155:1: (lv_question_3_0= RULE_STRING )
                    // InternalJoveNotes.g:1156:3: lv_question_3_0= RULE_STRING
                    {
                    lv_question_3_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    			newLeafNode(lv_question_3_0, grammarAccess.getMatchingAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchingRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"question",
                            		lv_question_3_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FOLLOW_7); 

                	newLeafNode(otherlv_4, grammarAccess.getMatchingAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalJoveNotes.g:1176:1: ( (lv_pairs_5_0= ruleMatchPair ) )+
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
            	    // InternalJoveNotes.g:1177:1: (lv_pairs_5_0= ruleMatchPair )
            	    {
            	    // InternalJoveNotes.g:1177:1: (lv_pairs_5_0= ruleMatchPair )
            	    // InternalJoveNotes.g:1178:3: lv_pairs_5_0= ruleMatchPair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMatchingAccess().getPairsMatchPairParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_22);
            	    lv_pairs_5_0=ruleMatchPair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMatchingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pairs",
            	            		lv_pairs_5_0, 
            	            		"com.sandy.xtext.JoveNotes.MatchPair");
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

            // InternalJoveNotes.g:1194:3: ( (lv_mcqConfig_6_0= ruleMatchMCQConfig ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJoveNotes.g:1195:1: (lv_mcqConfig_6_0= ruleMatchMCQConfig )
                    {
                    // InternalJoveNotes.g:1195:1: (lv_mcqConfig_6_0= ruleMatchMCQConfig )
                    // InternalJoveNotes.g:1196:3: lv_mcqConfig_6_0= ruleMatchMCQConfig
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatchingAccess().getMcqConfigMatchMCQConfigParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_23);
                    lv_mcqConfig_6_0=ruleMatchMCQConfig();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatchingRule());
                    	        }
                           		set(
                           			current, 
                           			"mcqConfig",
                            		lv_mcqConfig_6_0, 
                            		"com.sandy.xtext.JoveNotes.MatchMCQConfig");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,29,FOLLOW_2); 

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
    // InternalJoveNotes.g:1224:1: entryRuleMatchPair returns [EObject current=null] : iv_ruleMatchPair= ruleMatchPair EOF ;
    public final EObject entryRuleMatchPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchPair = null;


        try {
            // InternalJoveNotes.g:1225:2: (iv_ruleMatchPair= ruleMatchPair EOF )
            // InternalJoveNotes.g:1226:2: iv_ruleMatchPair= ruleMatchPair EOF
            {
             newCompositeNode(grammarAccess.getMatchPairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatchPair=ruleMatchPair();

            state._fsp--;

             current =iv_ruleMatchPair; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:1233:1: ruleMatchPair returns [EObject current=null] : ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMatchPair() throws RecognitionException {
        EObject current = null;

        Token lv_matchQuestion_0_0=null;
        Token otherlv_1=null;
        Token lv_matchAnswer_2_0=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:1236:28: ( ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) ) )
            // InternalJoveNotes.g:1237:1: ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) )
            {
            // InternalJoveNotes.g:1237:1: ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) )
            // InternalJoveNotes.g:1237:2: ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) )
            {
            // InternalJoveNotes.g:1237:2: ( (lv_matchQuestion_0_0= RULE_STRING ) )
            // InternalJoveNotes.g:1238:1: (lv_matchQuestion_0_0= RULE_STRING )
            {
            // InternalJoveNotes.g:1238:1: (lv_matchQuestion_0_0= RULE_STRING )
            // InternalJoveNotes.g:1239:3: lv_matchQuestion_0_0= RULE_STRING
            {
            lv_matchQuestion_0_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            			newLeafNode(lv_matchQuestion_0_0, grammarAccess.getMatchPairAccess().getMatchQuestionSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMatchPairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"matchQuestion",
                    		lv_matchQuestion_0_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getMatchPairAccess().getEqualsSignKeyword_1());
                
            // InternalJoveNotes.g:1259:1: ( (lv_matchAnswer_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:1260:1: (lv_matchAnswer_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:1260:1: (lv_matchAnswer_2_0= RULE_STRING )
            // InternalJoveNotes.g:1261:3: lv_matchAnswer_2_0= RULE_STRING
            {
            lv_matchAnswer_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_matchAnswer_2_0, grammarAccess.getMatchPairAccess().getMatchAnswerSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMatchPairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"matchAnswer",
                    		lv_matchAnswer_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // InternalJoveNotes.g:1285:1: entryRuleMatchMCQConfig returns [EObject current=null] : iv_ruleMatchMCQConfig= ruleMatchMCQConfig EOF ;
    public final EObject entryRuleMatchMCQConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchMCQConfig = null;


        try {
            // InternalJoveNotes.g:1286:2: (iv_ruleMatchMCQConfig= ruleMatchMCQConfig EOF )
            // InternalJoveNotes.g:1287:2: iv_ruleMatchMCQConfig= ruleMatchMCQConfig EOF
            {
             newCompositeNode(grammarAccess.getMatchMCQConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatchMCQConfig=ruleMatchMCQConfig();

            state._fsp--;

             current =iv_ruleMatchMCQConfig; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:1294:1: ruleMatchMCQConfig returns [EObject current=null] : (otherlv_0= '@mcq_config' otherlv_1= '{' otherlv_2= '@forwardCaption' ( (lv_forwardCaption_3_0= RULE_STRING ) ) (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )? (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )? (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )? otherlv_10= '}' ) ;
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
            // InternalJoveNotes.g:1297:28: ( (otherlv_0= '@mcq_config' otherlv_1= '{' otherlv_2= '@forwardCaption' ( (lv_forwardCaption_3_0= RULE_STRING ) ) (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )? (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )? (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )? otherlv_10= '}' ) )
            // InternalJoveNotes.g:1298:1: (otherlv_0= '@mcq_config' otherlv_1= '{' otherlv_2= '@forwardCaption' ( (lv_forwardCaption_3_0= RULE_STRING ) ) (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )? (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )? (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )? otherlv_10= '}' )
            {
            // InternalJoveNotes.g:1298:1: (otherlv_0= '@mcq_config' otherlv_1= '{' otherlv_2= '@forwardCaption' ( (lv_forwardCaption_3_0= RULE_STRING ) ) (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )? (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )? (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )? otherlv_10= '}' )
            // InternalJoveNotes.g:1298:3: otherlv_0= '@mcq_config' otherlv_1= '{' otherlv_2= '@forwardCaption' ( (lv_forwardCaption_3_0= RULE_STRING ) ) (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )? (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )? (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_21); 

                	newLeafNode(otherlv_0, grammarAccess.getMatchMCQConfigAccess().getMcq_configKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_25); 

                	newLeafNode(otherlv_1, grammarAccess.getMatchMCQConfigAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,32,FOLLOW_7); 

                	newLeafNode(otherlv_2, grammarAccess.getMatchMCQConfigAccess().getForwardCaptionKeyword_2());
                
            // InternalJoveNotes.g:1310:1: ( (lv_forwardCaption_3_0= RULE_STRING ) )
            // InternalJoveNotes.g:1311:1: (lv_forwardCaption_3_0= RULE_STRING )
            {
            // InternalJoveNotes.g:1311:1: (lv_forwardCaption_3_0= RULE_STRING )
            // InternalJoveNotes.g:1312:3: lv_forwardCaption_3_0= RULE_STRING
            {
            lv_forwardCaption_3_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            			newLeafNode(lv_forwardCaption_3_0, grammarAccess.getMatchMCQConfigAccess().getForwardCaptionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMatchMCQConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"forwardCaption",
                    		lv_forwardCaption_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:1328:2: (otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJoveNotes.g:1328:4: otherlv_4= '@reverseCaption' ( (lv_reverseCaption_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_7); 

                        	newLeafNode(otherlv_4, grammarAccess.getMatchMCQConfigAccess().getReverseCaptionKeyword_4_0());
                        
                    // InternalJoveNotes.g:1332:1: ( (lv_reverseCaption_5_0= RULE_STRING ) )
                    // InternalJoveNotes.g:1333:1: (lv_reverseCaption_5_0= RULE_STRING )
                    {
                    // InternalJoveNotes.g:1333:1: (lv_reverseCaption_5_0= RULE_STRING )
                    // InternalJoveNotes.g:1334:3: lv_reverseCaption_5_0= RULE_STRING
                    {
                    lv_reverseCaption_5_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

                    			newLeafNode(lv_reverseCaption_5_0, grammarAccess.getMatchMCQConfigAccess().getReverseCaptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchMCQConfigRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"reverseCaption",
                            		lv_reverseCaption_5_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:1350:4: (otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJoveNotes.g:1350:6: otherlv_6= '@numOptionsToShow' ( (lv_numOptionsToShow_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_9); 

                        	newLeafNode(otherlv_6, grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowKeyword_5_0());
                        
                    // InternalJoveNotes.g:1354:1: ( (lv_numOptionsToShow_7_0= RULE_INT ) )
                    // InternalJoveNotes.g:1355:1: (lv_numOptionsToShow_7_0= RULE_INT )
                    {
                    // InternalJoveNotes.g:1355:1: (lv_numOptionsToShow_7_0= RULE_INT )
                    // InternalJoveNotes.g:1356:3: lv_numOptionsToShow_7_0= RULE_INT
                    {
                    lv_numOptionsToShow_7_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                    			newLeafNode(lv_numOptionsToShow_7_0, grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowINTTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchMCQConfigRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"numOptionsToShow",
                            		lv_numOptionsToShow_7_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:1372:4: (otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJoveNotes.g:1372:6: otherlv_8= '@numOptionsPerRow' ( (lv_numOptionsPerRow_9_0= RULE_INT ) )
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_9); 

                        	newLeafNode(otherlv_8, grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowKeyword_6_0());
                        
                    // InternalJoveNotes.g:1376:1: ( (lv_numOptionsPerRow_9_0= RULE_INT ) )
                    // InternalJoveNotes.g:1377:1: (lv_numOptionsPerRow_9_0= RULE_INT )
                    {
                    // InternalJoveNotes.g:1377:1: (lv_numOptionsPerRow_9_0= RULE_INT )
                    // InternalJoveNotes.g:1378:3: lv_numOptionsPerRow_9_0= RULE_INT
                    {
                    lv_numOptionsPerRow_9_0=(Token)match(input,RULE_INT,FOLLOW_23); 

                    			newLeafNode(lv_numOptionsPerRow_9_0, grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowINTTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchMCQConfigRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"numOptionsPerRow",
                            		lv_numOptionsPerRow_9_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,29,FOLLOW_2); 

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
    // InternalJoveNotes.g:1406:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalJoveNotes.g:1407:2: (iv_ruleEvent= ruleEvent EOF )
            // InternalJoveNotes.g:1408:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:1415:1: ruleEvent returns [EObject current=null] : (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_event_2_0=null;
        Token lv_time_3_0=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:1418:28: ( (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) ) )
            // InternalJoveNotes.g:1419:1: (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) )
            {
            // InternalJoveNotes.g:1419:1: (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) )
            // InternalJoveNotes.g:1419:3: otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
                
            // InternalJoveNotes.g:1423:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalJoveNotes.g:1424:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:1424:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:1425:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_7); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:1438:3: ( (lv_event_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:1439:1: (lv_event_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:1439:1: (lv_event_2_0= RULE_STRING )
            // InternalJoveNotes.g:1440:3: lv_event_2_0= RULE_STRING
            {
            lv_event_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			newLeafNode(lv_event_2_0, grammarAccess.getEventAccess().getEventSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"event",
                    		lv_event_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:1456:2: ( (lv_time_3_0= RULE_STRING ) )
            // InternalJoveNotes.g:1457:1: (lv_time_3_0= RULE_STRING )
            {
            // InternalJoveNotes.g:1457:1: (lv_time_3_0= RULE_STRING )
            // InternalJoveNotes.g:1458:3: lv_time_3_0= RULE_STRING
            {
            lv_time_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_time_3_0, grammarAccess.getEventAccess().getTimeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"time",
                    		lv_time_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // InternalJoveNotes.g:1482:1: entryRuleTrueFalse returns [EObject current=null] : iv_ruleTrueFalse= ruleTrueFalse EOF ;
    public final EObject entryRuleTrueFalse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueFalse = null;


        try {
            // InternalJoveNotes.g:1483:2: (iv_ruleTrueFalse= ruleTrueFalse EOF )
            // InternalJoveNotes.g:1484:2: iv_ruleTrueFalse= ruleTrueFalse EOF
            {
             newCompositeNode(grammarAccess.getTrueFalseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrueFalse=ruleTrueFalse();

            state._fsp--;

             current =iv_ruleTrueFalse; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:1491:1: ruleTrueFalse returns [EObject current=null] : (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleTrueFalse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_statement_2_0=null;
        Token lv_truthValue_3_0=null;
        Token lv_justification_4_0=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:1494:28: ( (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? ) )
            // InternalJoveNotes.g:1495:1: (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? )
            {
            // InternalJoveNotes.g:1495:1: (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? )
            // InternalJoveNotes.g:1495:3: otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getTrueFalseAccess().getTrue_falseKeyword_0());
                
            // InternalJoveNotes.g:1499:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalJoveNotes.g:1500:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:1500:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:1501:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_7); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTrueFalseRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:1514:3: ( (lv_statement_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:1515:1: (lv_statement_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:1515:1: (lv_statement_2_0= RULE_STRING )
            // InternalJoveNotes.g:1516:3: lv_statement_2_0= RULE_STRING
            {
            lv_statement_2_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            			newLeafNode(lv_statement_2_0, grammarAccess.getTrueFalseAccess().getStatementSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTrueFalseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"statement",
                    		lv_statement_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:1532:2: ( (lv_truthValue_3_0= RULE_BOOL ) )
            // InternalJoveNotes.g:1533:1: (lv_truthValue_3_0= RULE_BOOL )
            {
            // InternalJoveNotes.g:1533:1: (lv_truthValue_3_0= RULE_BOOL )
            // InternalJoveNotes.g:1534:3: lv_truthValue_3_0= RULE_BOOL
            {
            lv_truthValue_3_0=(Token)match(input,RULE_BOOL,FOLLOW_16); 

            			newLeafNode(lv_truthValue_3_0, grammarAccess.getTrueFalseAccess().getTruthValueBOOLTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTrueFalseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"truthValue",
                    		lv_truthValue_3_0, 
                    		"com.sandy.xtext.JoveNotes.BOOL");
            	    

            }


            }

            // InternalJoveNotes.g:1550:2: ( (lv_justification_4_0= RULE_STRING ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalJoveNotes.g:1551:1: (lv_justification_4_0= RULE_STRING )
                    {
                    // InternalJoveNotes.g:1551:1: (lv_justification_4_0= RULE_STRING )
                    // InternalJoveNotes.g:1552:3: lv_justification_4_0= RULE_STRING
                    {
                    lv_justification_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_justification_4_0, grammarAccess.getTrueFalseAccess().getJustificationSTRINGTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTrueFalseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"justification",
                            		lv_justification_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

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
    // InternalJoveNotes.g:1576:1: entryRuleChemEquation returns [EObject current=null] : iv_ruleChemEquation= ruleChemEquation EOF ;
    public final EObject entryRuleChemEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemEquation = null;


        try {
            // InternalJoveNotes.g:1577:2: (iv_ruleChemEquation= ruleChemEquation EOF )
            // InternalJoveNotes.g:1578:2: iv_ruleChemEquation= ruleChemEquation EOF
            {
             newCompositeNode(grammarAccess.getChemEquationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChemEquation=ruleChemEquation();

            state._fsp--;

             current =iv_ruleChemEquation; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:1585:1: ruleChemEquation returns [EObject current=null] : (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
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
            // InternalJoveNotes.g:1588:28: ( (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // InternalJoveNotes.g:1589:1: (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // InternalJoveNotes.g:1589:1: (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // InternalJoveNotes.g:1589:3: otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_30); 

                	newLeafNode(otherlv_0, grammarAccess.getChemEquationAccess().getChem_equationKeyword_0());
                
            // InternalJoveNotes.g:1593:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalJoveNotes.g:1594:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:1594:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:1595:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemEquationRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:1608:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalJoveNotes.g:1609:1: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalJoveNotes.g:1609:1: (lv_description_2_0= RULE_STRING )
                    // InternalJoveNotes.g:1610:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    			newLeafNode(lv_description_2_0, grammarAccess.getChemEquationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemEquationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_2_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,28,FOLLOW_7); 

                	newLeafNode(otherlv_3, grammarAccess.getChemEquationAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalJoveNotes.g:1630:1: ( (lv_reactants_4_0= RULE_STRING ) )
            // InternalJoveNotes.g:1631:1: (lv_reactants_4_0= RULE_STRING )
            {
            // InternalJoveNotes.g:1631:1: (lv_reactants_4_0= RULE_STRING )
            // InternalJoveNotes.g:1632:3: lv_reactants_4_0= RULE_STRING
            {
            lv_reactants_4_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            			newLeafNode(lv_reactants_4_0, grammarAccess.getChemEquationAccess().getReactantsSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChemEquationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"reactants",
                    		lv_reactants_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_32); 

                	newLeafNode(otherlv_5, grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_5());
                
            // InternalJoveNotes.g:1652:1: ( (lv_produces_6_0= RULE_STRING ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalJoveNotes.g:1653:1: (lv_produces_6_0= RULE_STRING )
                    {
                    // InternalJoveNotes.g:1653:1: (lv_produces_6_0= RULE_STRING )
                    // InternalJoveNotes.g:1654:3: lv_produces_6_0= RULE_STRING
                    {
                    lv_produces_6_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

                    			newLeafNode(lv_produces_6_0, grammarAccess.getChemEquationAccess().getProducesSTRINGTerminalRuleCall_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemEquationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"produces",
                            		lv_produces_6_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,39,FOLLOW_7); 

                	newLeafNode(otherlv_7, grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_7());
                
            // InternalJoveNotes.g:1674:1: ( (lv_products_8_0= RULE_STRING ) )
            // InternalJoveNotes.g:1675:1: (lv_products_8_0= RULE_STRING )
            {
            // InternalJoveNotes.g:1675:1: (lv_products_8_0= RULE_STRING )
            // InternalJoveNotes.g:1676:3: lv_products_8_0= RULE_STRING
            {
            lv_products_8_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            			newLeafNode(lv_products_8_0, grammarAccess.getChemEquationAccess().getProductsSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChemEquationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"products",
                    		lv_products_8_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,29,FOLLOW_2); 

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
    // InternalJoveNotes.g:1704:1: entryRuleChemCompound returns [EObject current=null] : iv_ruleChemCompound= ruleChemCompound EOF ;
    public final EObject entryRuleChemCompound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemCompound = null;


        try {
            // InternalJoveNotes.g:1705:2: (iv_ruleChemCompound= ruleChemCompound EOF )
            // InternalJoveNotes.g:1706:2: iv_ruleChemCompound= ruleChemCompound EOF
            {
             newCompositeNode(grammarAccess.getChemCompoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChemCompound=ruleChemCompound();

            state._fsp--;

             current =iv_ruleChemCompound; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:1713:1: ruleChemCompound returns [EObject current=null] : (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleChemCompound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_symbol_2_0=null;
        Token lv_chemicalName_3_0=null;
        Token lv_commonName_4_0=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:1716:28: ( (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? ) )
            // InternalJoveNotes.g:1717:1: (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? )
            {
            // InternalJoveNotes.g:1717:1: (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? )
            // InternalJoveNotes.g:1717:3: otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getChemCompoundAccess().getChem_compoundKeyword_0());
                
            // InternalJoveNotes.g:1721:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalJoveNotes.g:1722:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:1722:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:1723:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_7); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemCompoundRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:1736:3: ( (lv_symbol_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:1737:1: (lv_symbol_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:1737:1: (lv_symbol_2_0= RULE_STRING )
            // InternalJoveNotes.g:1738:3: lv_symbol_2_0= RULE_STRING
            {
            lv_symbol_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			newLeafNode(lv_symbol_2_0, grammarAccess.getChemCompoundAccess().getSymbolSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChemCompoundRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"symbol",
                    		lv_symbol_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:1754:2: ( (lv_chemicalName_3_0= RULE_STRING ) )
            // InternalJoveNotes.g:1755:1: (lv_chemicalName_3_0= RULE_STRING )
            {
            // InternalJoveNotes.g:1755:1: (lv_chemicalName_3_0= RULE_STRING )
            // InternalJoveNotes.g:1756:3: lv_chemicalName_3_0= RULE_STRING
            {
            lv_chemicalName_3_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            			newLeafNode(lv_chemicalName_3_0, grammarAccess.getChemCompoundAccess().getChemicalNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChemCompoundRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"chemicalName",
                    		lv_chemicalName_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:1772:2: ( (lv_commonName_4_0= RULE_STRING ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalJoveNotes.g:1773:1: (lv_commonName_4_0= RULE_STRING )
                    {
                    // InternalJoveNotes.g:1773:1: (lv_commonName_4_0= RULE_STRING )
                    // InternalJoveNotes.g:1774:3: lv_commonName_4_0= RULE_STRING
                    {
                    lv_commonName_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_commonName_4_0, grammarAccess.getChemCompoundAccess().getCommonNameSTRINGTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemCompoundRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"commonName",
                            		lv_commonName_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

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
    // InternalJoveNotes.g:1798:1: entryRuleSpellbee returns [EObject current=null] : iv_ruleSpellbee= ruleSpellbee EOF ;
    public final EObject entryRuleSpellbee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpellbee = null;


        try {
            // InternalJoveNotes.g:1799:2: (iv_ruleSpellbee= ruleSpellbee EOF )
            // InternalJoveNotes.g:1800:2: iv_ruleSpellbee= ruleSpellbee EOF
            {
             newCompositeNode(grammarAccess.getSpellbeeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpellbee=ruleSpellbee();

            state._fsp--;

             current =iv_ruleSpellbee; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:1807:1: ruleSpellbee returns [EObject current=null] : (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSpellbee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_word_2_0=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:1810:28: ( (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ) )
            // InternalJoveNotes.g:1811:1: (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) )
            {
            // InternalJoveNotes.g:1811:1: (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) )
            // InternalJoveNotes.g:1811:3: otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getSpellbeeAccess().getSpellbeeKeyword_0());
                
            // InternalJoveNotes.g:1815:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==20) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalJoveNotes.g:1816:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:1816:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:1817:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_7); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpellbeeRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:1830:3: ( (lv_word_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:1831:1: (lv_word_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:1831:1: (lv_word_2_0= RULE_STRING )
            // InternalJoveNotes.g:1832:3: lv_word_2_0= RULE_STRING
            {
            lv_word_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_word_2_0, grammarAccess.getSpellbeeAccess().getWordSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpellbeeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"word",
                    		lv_word_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // InternalJoveNotes.g:1856:1: entryRuleImageLabel returns [EObject current=null] : iv_ruleImageLabel= ruleImageLabel EOF ;
    public final EObject entryRuleImageLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageLabel = null;


        try {
            // InternalJoveNotes.g:1857:2: (iv_ruleImageLabel= ruleImageLabel EOF )
            // InternalJoveNotes.g:1858:2: iv_ruleImageLabel= ruleImageLabel EOF
            {
             newCompositeNode(grammarAccess.getImageLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageLabel=ruleImageLabel();

            state._fsp--;

             current =iv_ruleImageLabel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:1865:1: ruleImageLabel returns [EObject current=null] : (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' ) ;
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
            // InternalJoveNotes.g:1868:28: ( (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' ) )
            // InternalJoveNotes.g:1869:1: (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' )
            {
            // InternalJoveNotes.g:1869:1: (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' )
            // InternalJoveNotes.g:1869:3: otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_30); 

                	newLeafNode(otherlv_0, grammarAccess.getImageLabelAccess().getImage_labelKeyword_0());
                
            // InternalJoveNotes.g:1873:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalJoveNotes.g:1874:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:1874:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:1875:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageLabelRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:1888:3: ( (lv_caption_2_0= RULE_STRING ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalJoveNotes.g:1889:1: (lv_caption_2_0= RULE_STRING )
                    {
                    // InternalJoveNotes.g:1889:1: (lv_caption_2_0= RULE_STRING )
                    // InternalJoveNotes.g:1890:3: lv_caption_2_0= RULE_STRING
                    {
                    lv_caption_2_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    			newLeafNode(lv_caption_2_0, grammarAccess.getImageLabelAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"caption",
                            		lv_caption_2_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,28,FOLLOW_33); 

                	newLeafNode(otherlv_3, grammarAccess.getImageLabelAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,43,FOLLOW_7); 

                	newLeafNode(otherlv_4, grammarAccess.getImageLabelAccess().getImageNameKeyword_4());
                
            // InternalJoveNotes.g:1914:1: ( (lv_imageName_5_0= RULE_STRING ) )
            // InternalJoveNotes.g:1915:1: (lv_imageName_5_0= RULE_STRING )
            {
            // InternalJoveNotes.g:1915:1: (lv_imageName_5_0= RULE_STRING )
            // InternalJoveNotes.g:1916:3: lv_imageName_5_0= RULE_STRING
            {
            lv_imageName_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            			newLeafNode(lv_imageName_5_0, grammarAccess.getImageLabelAccess().getImageNameSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"imageName",
                    		lv_imageName_5_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:1932:2: ( (lv_hotspots_6_0= ruleHotSpot ) )
            // InternalJoveNotes.g:1933:1: (lv_hotspots_6_0= ruleHotSpot )
            {
            // InternalJoveNotes.g:1933:1: (lv_hotspots_6_0= ruleHotSpot )
            // InternalJoveNotes.g:1934:3: lv_hotspots_6_0= ruleHotSpot
            {
             
            	        newCompositeNode(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_34);
            lv_hotspots_6_0=ruleHotSpot();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImageLabelRule());
            	        }
                   		add(
                   			current, 
                   			"hotspots",
                    		lv_hotspots_6_0, 
                    		"com.sandy.xtext.JoveNotes.HotSpot");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalJoveNotes.g:1950:2: (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==44) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalJoveNotes.g:1950:4: otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) )
            	    {
            	    otherlv_7=(Token)match(input,44,FOLLOW_9); 

            	        	newLeafNode(otherlv_7, grammarAccess.getImageLabelAccess().getCommaKeyword_7_0());
            	        
            	    // InternalJoveNotes.g:1954:1: ( (lv_hotspots_8_0= ruleHotSpot ) )
            	    // InternalJoveNotes.g:1955:1: (lv_hotspots_8_0= ruleHotSpot )
            	    {
            	    // InternalJoveNotes.g:1955:1: (lv_hotspots_8_0= ruleHotSpot )
            	    // InternalJoveNotes.g:1956:3: lv_hotspots_8_0= ruleHotSpot
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_34);
            	    lv_hotspots_8_0=ruleHotSpot();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageLabelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hotspots",
            	            		lv_hotspots_8_0, 
            	            		"com.sandy.xtext.JoveNotes.HotSpot");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_9=(Token)match(input,29,FOLLOW_2); 

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
    // InternalJoveNotes.g:1984:1: entryRuleHotSpot returns [EObject current=null] : iv_ruleHotSpot= ruleHotSpot EOF ;
    public final EObject entryRuleHotSpot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHotSpot = null;


        try {
            // InternalJoveNotes.g:1985:2: (iv_ruleHotSpot= ruleHotSpot EOF )
            // InternalJoveNotes.g:1986:2: iv_ruleHotSpot= ruleHotSpot EOF
            {
             newCompositeNode(grammarAccess.getHotSpotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHotSpot=ruleHotSpot();

            state._fsp--;

             current =iv_ruleHotSpot; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:1993:1: ruleHotSpot returns [EObject current=null] : ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleHotSpot() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;
        Token otherlv_1=null;
        Token lv_y_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:1996:28: ( ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) ) )
            // InternalJoveNotes.g:1997:1: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) )
            {
            // InternalJoveNotes.g:1997:1: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) )
            // InternalJoveNotes.g:1997:2: ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) )
            {
            // InternalJoveNotes.g:1997:2: ( (lv_x_0_0= RULE_INT ) )
            // InternalJoveNotes.g:1998:1: (lv_x_0_0= RULE_INT )
            {
            // InternalJoveNotes.g:1998:1: (lv_x_0_0= RULE_INT )
            // InternalJoveNotes.g:1999:3: lv_x_0_0= RULE_INT
            {
            lv_x_0_0=(Token)match(input,RULE_INT,FOLLOW_35); 

            			newLeafNode(lv_x_0_0, grammarAccess.getHotSpotAccess().getXINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHotSpotRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"x",
                    		lv_x_0_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_9); 

                	newLeafNode(otherlv_1, grammarAccess.getHotSpotAccess().getCommaKeyword_1());
                
            // InternalJoveNotes.g:2019:1: ( (lv_y_2_0= RULE_INT ) )
            // InternalJoveNotes.g:2020:1: (lv_y_2_0= RULE_INT )
            {
            // InternalJoveNotes.g:2020:1: (lv_y_2_0= RULE_INT )
            // InternalJoveNotes.g:2021:3: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            			newLeafNode(lv_y_2_0, grammarAccess.getHotSpotAccess().getYINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHotSpotRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"y",
                    		lv_y_2_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_7); 

                	newLeafNode(otherlv_3, grammarAccess.getHotSpotAccess().getEqualsSignKeyword_3());
                
            // InternalJoveNotes.g:2041:1: ( (lv_label_4_0= RULE_STRING ) )
            // InternalJoveNotes.g:2042:1: (lv_label_4_0= RULE_STRING )
            {
            // InternalJoveNotes.g:2042:1: (lv_label_4_0= RULE_STRING )
            // InternalJoveNotes.g:2043:3: lv_label_4_0= RULE_STRING
            {
            lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_label_4_0, grammarAccess.getHotSpotAccess().getLabelSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHotSpotRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // InternalJoveNotes.g:2067:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // InternalJoveNotes.g:2068:2: (iv_ruleEquation= ruleEquation EOF )
            // InternalJoveNotes.g:2069:2: iv_ruleEquation= ruleEquation EOF
            {
             newCompositeNode(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquation=ruleEquation();

            state._fsp--;

             current =iv_ruleEquation; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:2076:1: ruleEquation returns [EObject current=null] : (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' ) ;
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
            // InternalJoveNotes.g:2079:28: ( (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' ) )
            // InternalJoveNotes.g:2080:1: (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' )
            {
            // InternalJoveNotes.g:2080:1: (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' )
            // InternalJoveNotes.g:2080:3: otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getEquationAccess().getEquationKeyword_0());
                
            // InternalJoveNotes.g:2084:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==20) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalJoveNotes.g:2085:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:2085:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:2086:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_7); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEquationRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:2099:3: ( (lv_equation_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:2100:1: (lv_equation_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:2100:1: (lv_equation_2_0= RULE_STRING )
            // InternalJoveNotes.g:2101:3: lv_equation_2_0= RULE_STRING
            {
            lv_equation_2_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            			newLeafNode(lv_equation_2_0, grammarAccess.getEquationAccess().getEquationSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEquationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"equation",
                    		lv_equation_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_36); 

                	newLeafNode(otherlv_3, grammarAccess.getEquationAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalJoveNotes.g:2121:1: ( (lv_description_4_0= RULE_STRING ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalJoveNotes.g:2122:1: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalJoveNotes.g:2122:1: (lv_description_4_0= RULE_STRING )
                    // InternalJoveNotes.g:2123:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getEquationAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEquationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,46,FOLLOW_7); 

                	newLeafNode(otherlv_5, grammarAccess.getEquationAccess().getWhereKeyword_5());
                
            // InternalJoveNotes.g:2143:1: ( (lv_symbols_6_0= ruleEqSymbol ) )
            // InternalJoveNotes.g:2144:1: (lv_symbols_6_0= ruleEqSymbol )
            {
            // InternalJoveNotes.g:2144:1: (lv_symbols_6_0= ruleEqSymbol )
            // InternalJoveNotes.g:2145:3: lv_symbols_6_0= ruleEqSymbol
            {
             
            	        newCompositeNode(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_34);
            lv_symbols_6_0=ruleEqSymbol();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEquationRule());
            	        }
                   		add(
                   			current, 
                   			"symbols",
                    		lv_symbols_6_0, 
                    		"com.sandy.xtext.JoveNotes.EqSymbol");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalJoveNotes.g:2161:2: (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==44) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalJoveNotes.g:2161:4: otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) )
            	    {
            	    otherlv_7=(Token)match(input,44,FOLLOW_7); 

            	        	newLeafNode(otherlv_7, grammarAccess.getEquationAccess().getCommaKeyword_7_0());
            	        
            	    // InternalJoveNotes.g:2165:1: ( (lv_symbols_8_0= ruleEqSymbol ) )
            	    // InternalJoveNotes.g:2166:1: (lv_symbols_8_0= ruleEqSymbol )
            	    {
            	    // InternalJoveNotes.g:2166:1: (lv_symbols_8_0= ruleEqSymbol )
            	    // InternalJoveNotes.g:2167:3: lv_symbols_8_0= ruleEqSymbol
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_34);
            	    lv_symbols_8_0=ruleEqSymbol();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEquationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"symbols",
            	            		lv_symbols_8_0, 
            	            		"com.sandy.xtext.JoveNotes.EqSymbol");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_9=(Token)match(input,29,FOLLOW_2); 

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
    // InternalJoveNotes.g:2195:1: entryRuleEqSymbol returns [EObject current=null] : iv_ruleEqSymbol= ruleEqSymbol EOF ;
    public final EObject entryRuleEqSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqSymbol = null;


        try {
            // InternalJoveNotes.g:2196:2: (iv_ruleEqSymbol= ruleEqSymbol EOF )
            // InternalJoveNotes.g:2197:2: iv_ruleEqSymbol= ruleEqSymbol EOF
            {
             newCompositeNode(grammarAccess.getEqSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqSymbol=ruleEqSymbol();

            state._fsp--;

             current =iv_ruleEqSymbol; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:2204:1: ruleEqSymbol returns [EObject current=null] : ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEqSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:2207:28: ( ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) ) )
            // InternalJoveNotes.g:2208:1: ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // InternalJoveNotes.g:2208:1: ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) )
            // InternalJoveNotes.g:2208:2: ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) )
            {
            // InternalJoveNotes.g:2208:2: ( (lv_symbol_0_0= RULE_STRING ) )
            // InternalJoveNotes.g:2209:1: (lv_symbol_0_0= RULE_STRING )
            {
            // InternalJoveNotes.g:2209:1: (lv_symbol_0_0= RULE_STRING )
            // InternalJoveNotes.g:2210:3: lv_symbol_0_0= RULE_STRING
            {
            lv_symbol_0_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            			newLeafNode(lv_symbol_0_0, grammarAccess.getEqSymbolAccess().getSymbolSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEqSymbolRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"symbol",
                    		lv_symbol_0_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getEqSymbolAccess().getEqualsSignKeyword_1());
                
            // InternalJoveNotes.g:2230:1: ( (lv_description_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:2231:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:2231:1: (lv_description_2_0= RULE_STRING )
            // InternalJoveNotes.g:2232:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_description_2_0, grammarAccess.getEqSymbolAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEqSymbolRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // InternalJoveNotes.g:2256:1: entryRuleRefToContext returns [EObject current=null] : iv_ruleRefToContext= ruleRefToContext EOF ;
    public final EObject entryRuleRefToContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefToContext = null;


        try {
            // InternalJoveNotes.g:2257:2: (iv_ruleRefToContext= ruleRefToContext EOF )
            // InternalJoveNotes.g:2258:2: iv_ruleRefToContext= ruleRefToContext EOF
            {
             newCompositeNode(grammarAccess.getRefToContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefToContext=ruleRefToContext();

            state._fsp--;

             current =iv_ruleRefToContext; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:2265:1: ruleRefToContext returns [EObject current=null] : (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_rtcElement_5_0= ruleRTCElement ) )+ otherlv_6= '}' ) ;
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
            // InternalJoveNotes.g:2268:28: ( (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_rtcElement_5_0= ruleRTCElement ) )+ otherlv_6= '}' ) )
            // InternalJoveNotes.g:2269:1: (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_rtcElement_5_0= ruleRTCElement ) )+ otherlv_6= '}' )
            {
            // InternalJoveNotes.g:2269:1: (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_rtcElement_5_0= ruleRTCElement ) )+ otherlv_6= '}' )
            // InternalJoveNotes.g:2269:3: otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_rtcElement_5_0= ruleRTCElement ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_38); 

                	newLeafNode(otherlv_0, grammarAccess.getRefToContextAccess().getRtcKeyword_0());
                
            // InternalJoveNotes.g:2273:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==20) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalJoveNotes.g:2274:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:2274:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:2275:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_21); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRefToContextRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FOLLOW_39); 

                	newLeafNode(otherlv_2, grammarAccess.getRefToContextAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,48,FOLLOW_7); 

                	newLeafNode(otherlv_3, grammarAccess.getRefToContextAccess().getContextKeyword_3());
                
            // InternalJoveNotes.g:2296:1: ( (lv_context_4_0= RULE_STRING ) )
            // InternalJoveNotes.g:2297:1: (lv_context_4_0= RULE_STRING )
            {
            // InternalJoveNotes.g:2297:1: (lv_context_4_0= RULE_STRING )
            // InternalJoveNotes.g:2298:3: lv_context_4_0= RULE_STRING
            {
            lv_context_4_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            			newLeafNode(lv_context_4_0, grammarAccess.getRefToContextAccess().getContextSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRefToContextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"context",
                    		lv_context_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:2314:2: ( (lv_rtcElement_5_0= ruleRTCElement ) )+
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
            	    // InternalJoveNotes.g:2315:1: (lv_rtcElement_5_0= ruleRTCElement )
            	    {
            	    // InternalJoveNotes.g:2315:1: (lv_rtcElement_5_0= ruleRTCElement )
            	    // InternalJoveNotes.g:2316:3: lv_rtcElement_5_0= ruleRTCElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefToContextAccess().getRtcElementRTCElementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_41);
            	    lv_rtcElement_5_0=ruleRTCElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRefToContextRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rtcElement",
            	            		lv_rtcElement_5_0, 
            	            		"com.sandy.xtext.JoveNotes.RTCElement");
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

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

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
    // InternalJoveNotes.g:2344:1: entryRuleRTCElement returns [EObject current=null] : iv_ruleRTCElement= ruleRTCElement EOF ;
    public final EObject entryRuleRTCElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTCElement = null;


        try {
            // InternalJoveNotes.g:2345:2: (iv_ruleRTCElement= ruleRTCElement EOF )
            // InternalJoveNotes.g:2346:2: iv_ruleRTCElement= ruleRTCElement EOF
            {
             newCompositeNode(grammarAccess.getRTCElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRTCElement=ruleRTCElement();

            state._fsp--;

             current =iv_ruleRTCElement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:2353:1: ruleRTCElement returns [EObject current=null] : (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_ImageLabel_11= ruleImageLabel | this_Equation_12= ruleEquation | this_MultiChoice_13= ruleMultiChoice ) ;
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
            // InternalJoveNotes.g:2356:28: ( (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_ImageLabel_11= ruleImageLabel | this_Equation_12= ruleEquation | this_MultiChoice_13= ruleMultiChoice ) )
            // InternalJoveNotes.g:2357:1: (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_ImageLabel_11= ruleImageLabel | this_Equation_12= ruleEquation | this_MultiChoice_13= ruleMultiChoice )
            {
            // InternalJoveNotes.g:2357:1: (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_ImageLabel_11= ruleImageLabel | this_Equation_12= ruleEquation | this_MultiChoice_13= ruleMultiChoice )
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
                    // InternalJoveNotes.g:2358:5: this_WordMeaning_0= ruleWordMeaning
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getWordMeaningParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_WordMeaning_0=ruleWordMeaning();

                    state._fsp--;

                     
                            current = this_WordMeaning_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalJoveNotes.g:2368:5: this_QuestionAnswer_1= ruleQuestionAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getQuestionAnswerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_QuestionAnswer_1=ruleQuestionAnswer();

                    state._fsp--;

                     
                            current = this_QuestionAnswer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalJoveNotes.g:2378:5: this_FIB_2= ruleFIB
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getFIBParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_FIB_2=ruleFIB();

                    state._fsp--;

                     
                            current = this_FIB_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalJoveNotes.g:2388:5: this_Definition_3= ruleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Definition_3=ruleDefinition();

                    state._fsp--;

                     
                            current = this_Definition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalJoveNotes.g:2398:5: this_Character_4= ruleCharacter
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getCharacterParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Character_4=ruleCharacter();

                    state._fsp--;

                     
                            current = this_Character_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalJoveNotes.g:2408:5: this_TeacherNote_5= ruleTeacherNote
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getTeacherNoteParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_TeacherNote_5=ruleTeacherNote();

                    state._fsp--;

                     
                            current = this_TeacherNote_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalJoveNotes.g:2418:5: this_Matching_6= ruleMatching
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getMatchingParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Matching_6=ruleMatching();

                    state._fsp--;

                     
                            current = this_Matching_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalJoveNotes.g:2428:5: this_Event_7= ruleEvent
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getEventParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Event_7=ruleEvent();

                    state._fsp--;

                     
                            current = this_Event_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalJoveNotes.g:2438:5: this_TrueFalse_8= ruleTrueFalse
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getTrueFalseParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_TrueFalse_8=ruleTrueFalse();

                    state._fsp--;

                     
                            current = this_TrueFalse_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // InternalJoveNotes.g:2448:5: this_ChemEquation_9= ruleChemEquation
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getChemEquationParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ChemEquation_9=ruleChemEquation();

                    state._fsp--;

                     
                            current = this_ChemEquation_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // InternalJoveNotes.g:2458:5: this_ChemCompound_10= ruleChemCompound
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getChemCompoundParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ChemCompound_10=ruleChemCompound();

                    state._fsp--;

                     
                            current = this_ChemCompound_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // InternalJoveNotes.g:2468:5: this_ImageLabel_11= ruleImageLabel
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getImageLabelParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ImageLabel_11=ruleImageLabel();

                    state._fsp--;

                     
                            current = this_ImageLabel_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // InternalJoveNotes.g:2478:5: this_Equation_12= ruleEquation
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getEquationParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Equation_12=ruleEquation();

                    state._fsp--;

                     
                            current = this_Equation_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // InternalJoveNotes.g:2488:5: this_MultiChoice_13= ruleMultiChoice
                    {
                     
                            newCompositeNode(grammarAccess.getRTCElementAccess().getMultiChoiceParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2504:1: entryRuleMultiChoice returns [EObject current=null] : iv_ruleMultiChoice= ruleMultiChoice EOF ;
    public final EObject entryRuleMultiChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiChoice = null;


        try {
            // InternalJoveNotes.g:2505:2: (iv_ruleMultiChoice= ruleMultiChoice EOF )
            // InternalJoveNotes.g:2506:2: iv_ruleMultiChoice= ruleMultiChoice EOF
            {
             newCompositeNode(grammarAccess.getMultiChoiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiChoice=ruleMultiChoice();

            state._fsp--;

             current =iv_ruleMultiChoice; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:2513:1: ruleMultiChoice returns [EObject current=null] : (otherlv_0= '@multi_choice' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '@options' otherlv_5= '{' ( (lv_options_6_0= ruleOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )* otherlv_9= '}' (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )? (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )? (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )? otherlv_16= '}' ) ;
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
            // InternalJoveNotes.g:2516:28: ( (otherlv_0= '@multi_choice' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '@options' otherlv_5= '{' ( (lv_options_6_0= ruleOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )* otherlv_9= '}' (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )? (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )? (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )? otherlv_16= '}' ) )
            // InternalJoveNotes.g:2517:1: (otherlv_0= '@multi_choice' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '@options' otherlv_5= '{' ( (lv_options_6_0= ruleOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )* otherlv_9= '}' (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )? (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )? (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )? otherlv_16= '}' )
            {
            // InternalJoveNotes.g:2517:1: (otherlv_0= '@multi_choice' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '@options' otherlv_5= '{' ( (lv_options_6_0= ruleOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )* otherlv_9= '}' (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )? (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )? (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )? otherlv_16= '}' )
            // InternalJoveNotes.g:2517:3: otherlv_0= '@multi_choice' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '@options' otherlv_5= '{' ( (lv_options_6_0= ruleOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )* otherlv_9= '}' (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )? (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )? (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiChoiceAccess().getMulti_choiceKeyword_0());
                
            // InternalJoveNotes.g:2521:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==20) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalJoveNotes.g:2522:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:2522:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:2523:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_7); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getMultiChoiceAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiChoiceRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:2536:3: ( (lv_question_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:2537:1: (lv_question_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:2537:1: (lv_question_2_0= RULE_STRING )
            // InternalJoveNotes.g:2538:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            			newLeafNode(lv_question_2_0, grammarAccess.getMultiChoiceAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiChoiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_42); 

                	newLeafNode(otherlv_3, grammarAccess.getMultiChoiceAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,50,FOLLOW_21); 

                	newLeafNode(otherlv_4, grammarAccess.getMultiChoiceAccess().getOptionsKeyword_4());
                
            otherlv_5=(Token)match(input,28,FOLLOW_7); 

                	newLeafNode(otherlv_5, grammarAccess.getMultiChoiceAccess().getLeftCurlyBracketKeyword_5());
                
            // InternalJoveNotes.g:2566:1: ( (lv_options_6_0= ruleOption ) )
            // InternalJoveNotes.g:2567:1: (lv_options_6_0= ruleOption )
            {
            // InternalJoveNotes.g:2567:1: (lv_options_6_0= ruleOption )
            // InternalJoveNotes.g:2568:3: lv_options_6_0= ruleOption
            {
             
            	        newCompositeNode(grammarAccess.getMultiChoiceAccess().getOptionsOptionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_34);
            lv_options_6_0=ruleOption();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiChoiceRule());
            	        }
                   		add(
                   			current, 
                   			"options",
                    		lv_options_6_0, 
                    		"com.sandy.xtext.JoveNotes.Option");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalJoveNotes.g:2584:2: (otherlv_7= ',' ( (lv_options_8_0= ruleOption ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==44) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalJoveNotes.g:2584:4: otherlv_7= ',' ( (lv_options_8_0= ruleOption ) )
            	    {
            	    otherlv_7=(Token)match(input,44,FOLLOW_7); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMultiChoiceAccess().getCommaKeyword_7_0());
            	        
            	    // InternalJoveNotes.g:2588:1: ( (lv_options_8_0= ruleOption ) )
            	    // InternalJoveNotes.g:2589:1: (lv_options_8_0= ruleOption )
            	    {
            	    // InternalJoveNotes.g:2589:1: (lv_options_8_0= ruleOption )
            	    // InternalJoveNotes.g:2590:3: lv_options_8_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiChoiceAccess().getOptionsOptionParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_34);
            	    lv_options_8_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiChoiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_8_0, 
            	            		"com.sandy.xtext.JoveNotes.Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_9=(Token)match(input,29,FOLLOW_43); 

                	newLeafNode(otherlv_9, grammarAccess.getMultiChoiceAccess().getRightCurlyBracketKeyword_8());
                
            // InternalJoveNotes.g:2610:1: (otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==34) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalJoveNotes.g:2610:3: otherlv_10= '@numOptionsToShow' ( (lv_numOptionsToShow_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_9); 

                        	newLeafNode(otherlv_10, grammarAccess.getMultiChoiceAccess().getNumOptionsToShowKeyword_9_0());
                        
                    // InternalJoveNotes.g:2614:1: ( (lv_numOptionsToShow_11_0= RULE_INT ) )
                    // InternalJoveNotes.g:2615:1: (lv_numOptionsToShow_11_0= RULE_INT )
                    {
                    // InternalJoveNotes.g:2615:1: (lv_numOptionsToShow_11_0= RULE_INT )
                    // InternalJoveNotes.g:2616:3: lv_numOptionsToShow_11_0= RULE_INT
                    {
                    lv_numOptionsToShow_11_0=(Token)match(input,RULE_INT,FOLLOW_44); 

                    			newLeafNode(lv_numOptionsToShow_11_0, grammarAccess.getMultiChoiceAccess().getNumOptionsToShowINTTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiChoiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"numOptionsToShow",
                            		lv_numOptionsToShow_11_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:2632:4: (otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==35) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalJoveNotes.g:2632:6: otherlv_12= '@numOptionsPerRow' ( (lv_numOptionsPerRow_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_9); 

                        	newLeafNode(otherlv_12, grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowKeyword_10_0());
                        
                    // InternalJoveNotes.g:2636:1: ( (lv_numOptionsPerRow_13_0= RULE_INT ) )
                    // InternalJoveNotes.g:2637:1: (lv_numOptionsPerRow_13_0= RULE_INT )
                    {
                    // InternalJoveNotes.g:2637:1: (lv_numOptionsPerRow_13_0= RULE_INT )
                    // InternalJoveNotes.g:2638:3: lv_numOptionsPerRow_13_0= RULE_INT
                    {
                    lv_numOptionsPerRow_13_0=(Token)match(input,RULE_INT,FOLLOW_45); 

                    			newLeafNode(lv_numOptionsPerRow_13_0, grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowINTTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiChoiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"numOptionsPerRow",
                            		lv_numOptionsPerRow_13_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:2654:4: (otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==51) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalJoveNotes.g:2654:6: otherlv_14= '@explanation' ( (lv_explanation_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,51,FOLLOW_7); 

                        	newLeafNode(otherlv_14, grammarAccess.getMultiChoiceAccess().getExplanationKeyword_11_0());
                        
                    // InternalJoveNotes.g:2658:1: ( (lv_explanation_15_0= RULE_STRING ) )
                    // InternalJoveNotes.g:2659:1: (lv_explanation_15_0= RULE_STRING )
                    {
                    // InternalJoveNotes.g:2659:1: (lv_explanation_15_0= RULE_STRING )
                    // InternalJoveNotes.g:2660:3: lv_explanation_15_0= RULE_STRING
                    {
                    lv_explanation_15_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    			newLeafNode(lv_explanation_15_0, grammarAccess.getMultiChoiceAccess().getExplanationSTRINGTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiChoiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"explanation",
                            		lv_explanation_15_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,29,FOLLOW_2); 

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
    // InternalJoveNotes.g:2688:1: entryRuleExercise returns [EObject current=null] : iv_ruleExercise= ruleExercise EOF ;
    public final EObject entryRuleExercise() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExercise = null;


        try {
            // InternalJoveNotes.g:2689:2: (iv_ruleExercise= ruleExercise EOF )
            // InternalJoveNotes.g:2690:2: iv_ruleExercise= ruleExercise EOF
            {
             newCompositeNode(grammarAccess.getExerciseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExercise=ruleExercise();

            state._fsp--;

             current =iv_ruleExercise; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:2697:1: ruleExercise returns [EObject current=null] : (otherlv_0= '@exercise' ( (lv_hideFromView_1_0= 'hide' ) )? (otherlv_2= 'marks' otherlv_3= '=' ( (lv_marks_4_0= RULE_INT ) ) ) ( (lv_question_5_0= RULE_STRING ) ) (otherlv_6= 'hints' otherlv_7= '{' ( (lv_hints_8_0= RULE_STRING ) )+ otherlv_9= '}' )? (otherlv_10= 'answer' ( (lv_answer_11_0= RULE_STRING ) ) ) ) ;
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
            // InternalJoveNotes.g:2700:28: ( (otherlv_0= '@exercise' ( (lv_hideFromView_1_0= 'hide' ) )? (otherlv_2= 'marks' otherlv_3= '=' ( (lv_marks_4_0= RULE_INT ) ) ) ( (lv_question_5_0= RULE_STRING ) ) (otherlv_6= 'hints' otherlv_7= '{' ( (lv_hints_8_0= RULE_STRING ) )+ otherlv_9= '}' )? (otherlv_10= 'answer' ( (lv_answer_11_0= RULE_STRING ) ) ) ) )
            // InternalJoveNotes.g:2701:1: (otherlv_0= '@exercise' ( (lv_hideFromView_1_0= 'hide' ) )? (otherlv_2= 'marks' otherlv_3= '=' ( (lv_marks_4_0= RULE_INT ) ) ) ( (lv_question_5_0= RULE_STRING ) ) (otherlv_6= 'hints' otherlv_7= '{' ( (lv_hints_8_0= RULE_STRING ) )+ otherlv_9= '}' )? (otherlv_10= 'answer' ( (lv_answer_11_0= RULE_STRING ) ) ) )
            {
            // InternalJoveNotes.g:2701:1: (otherlv_0= '@exercise' ( (lv_hideFromView_1_0= 'hide' ) )? (otherlv_2= 'marks' otherlv_3= '=' ( (lv_marks_4_0= RULE_INT ) ) ) ( (lv_question_5_0= RULE_STRING ) ) (otherlv_6= 'hints' otherlv_7= '{' ( (lv_hints_8_0= RULE_STRING ) )+ otherlv_9= '}' )? (otherlv_10= 'answer' ( (lv_answer_11_0= RULE_STRING ) ) ) )
            // InternalJoveNotes.g:2701:3: otherlv_0= '@exercise' ( (lv_hideFromView_1_0= 'hide' ) )? (otherlv_2= 'marks' otherlv_3= '=' ( (lv_marks_4_0= RULE_INT ) ) ) ( (lv_question_5_0= RULE_STRING ) ) (otherlv_6= 'hints' otherlv_7= '{' ( (lv_hints_8_0= RULE_STRING ) )+ otherlv_9= '}' )? (otherlv_10= 'answer' ( (lv_answer_11_0= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_46); 

                	newLeafNode(otherlv_0, grammarAccess.getExerciseAccess().getExerciseKeyword_0());
                
            // InternalJoveNotes.g:2705:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==20) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalJoveNotes.g:2706:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:2706:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:2707:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_47); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getExerciseAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExerciseRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:2720:3: (otherlv_2= 'marks' otherlv_3= '=' ( (lv_marks_4_0= RULE_INT ) ) )
            // InternalJoveNotes.g:2720:5: otherlv_2= 'marks' otherlv_3= '=' ( (lv_marks_4_0= RULE_INT ) )
            {
            otherlv_2=(Token)match(input,53,FOLLOW_24); 

                	newLeafNode(otherlv_2, grammarAccess.getExerciseAccess().getMarksKeyword_2_0());
                
            otherlv_3=(Token)match(input,30,FOLLOW_9); 

                	newLeafNode(otherlv_3, grammarAccess.getExerciseAccess().getEqualsSignKeyword_2_1());
                
            // InternalJoveNotes.g:2728:1: ( (lv_marks_4_0= RULE_INT ) )
            // InternalJoveNotes.g:2729:1: (lv_marks_4_0= RULE_INT )
            {
            // InternalJoveNotes.g:2729:1: (lv_marks_4_0= RULE_INT )
            // InternalJoveNotes.g:2730:3: lv_marks_4_0= RULE_INT
            {
            lv_marks_4_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            			newLeafNode(lv_marks_4_0, grammarAccess.getExerciseAccess().getMarksINTTerminalRuleCall_2_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExerciseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"marks",
                    		lv_marks_4_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }


            }

            // InternalJoveNotes.g:2746:3: ( (lv_question_5_0= RULE_STRING ) )
            // InternalJoveNotes.g:2747:1: (lv_question_5_0= RULE_STRING )
            {
            // InternalJoveNotes.g:2747:1: (lv_question_5_0= RULE_STRING )
            // InternalJoveNotes.g:2748:3: lv_question_5_0= RULE_STRING
            {
            lv_question_5_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

            			newLeafNode(lv_question_5_0, grammarAccess.getExerciseAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExerciseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_5_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:2764:2: (otherlv_6= 'hints' otherlv_7= '{' ( (lv_hints_8_0= RULE_STRING ) )+ otherlv_9= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==54) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalJoveNotes.g:2764:4: otherlv_6= 'hints' otherlv_7= '{' ( (lv_hints_8_0= RULE_STRING ) )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_21); 

                        	newLeafNode(otherlv_6, grammarAccess.getExerciseAccess().getHintsKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,28,FOLLOW_7); 

                        	newLeafNode(otherlv_7, grammarAccess.getExerciseAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // InternalJoveNotes.g:2772:1: ( (lv_hints_8_0= RULE_STRING ) )+
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
                    	    // InternalJoveNotes.g:2773:1: (lv_hints_8_0= RULE_STRING )
                    	    {
                    	    // InternalJoveNotes.g:2773:1: (lv_hints_8_0= RULE_STRING )
                    	    // InternalJoveNotes.g:2774:3: lv_hints_8_0= RULE_STRING
                    	    {
                    	    lv_hints_8_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

                    	    			newLeafNode(lv_hints_8_0, grammarAccess.getExerciseAccess().getHintsSTRINGTerminalRuleCall_4_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getExerciseRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"hints",
                    	            		lv_hints_8_0, 
                    	            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    	    

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

                    otherlv_9=(Token)match(input,29,FOLLOW_50); 

                        	newLeafNode(otherlv_9, grammarAccess.getExerciseAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // InternalJoveNotes.g:2794:3: (otherlv_10= 'answer' ( (lv_answer_11_0= RULE_STRING ) ) )
            // InternalJoveNotes.g:2794:5: otherlv_10= 'answer' ( (lv_answer_11_0= RULE_STRING ) )
            {
            otherlv_10=(Token)match(input,55,FOLLOW_7); 

                	newLeafNode(otherlv_10, grammarAccess.getExerciseAccess().getAnswerKeyword_5_0());
                
            // InternalJoveNotes.g:2798:1: ( (lv_answer_11_0= RULE_STRING ) )
            // InternalJoveNotes.g:2799:1: (lv_answer_11_0= RULE_STRING )
            {
            // InternalJoveNotes.g:2799:1: (lv_answer_11_0= RULE_STRING )
            // InternalJoveNotes.g:2800:3: lv_answer_11_0= RULE_STRING
            {
            lv_answer_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_answer_11_0, grammarAccess.getExerciseAccess().getAnswerSTRINGTerminalRuleCall_5_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExerciseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"answer",
                    		lv_answer_11_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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


    // $ANTLR start "entryRuleVoiceToText"
    // InternalJoveNotes.g:2824:1: entryRuleVoiceToText returns [EObject current=null] : iv_ruleVoiceToText= ruleVoiceToText EOF ;
    public final EObject entryRuleVoiceToText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoiceToText = null;


        try {
            // InternalJoveNotes.g:2825:2: (iv_ruleVoiceToText= ruleVoiceToText EOF )
            // InternalJoveNotes.g:2826:2: iv_ruleVoiceToText= ruleVoiceToText EOF
            {
             newCompositeNode(grammarAccess.getVoiceToTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVoiceToText=ruleVoiceToText();

            state._fsp--;

             current =iv_ruleVoiceToText; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVoiceToText"


    // $ANTLR start "ruleVoiceToText"
    // InternalJoveNotes.g:2833:1: ruleVoiceToText returns [EObject current=null] : (otherlv_0= '@voice2text' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_clipName_2_0= RULE_STRING ) ) ( (lv_text_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleVoiceToText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_clipName_2_0=null;
        Token lv_text_3_0=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:2836:28: ( (otherlv_0= '@voice2text' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_clipName_2_0= RULE_STRING ) ) ( (lv_text_3_0= RULE_STRING ) ) ) )
            // InternalJoveNotes.g:2837:1: (otherlv_0= '@voice2text' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_clipName_2_0= RULE_STRING ) ) ( (lv_text_3_0= RULE_STRING ) ) )
            {
            // InternalJoveNotes.g:2837:1: (otherlv_0= '@voice2text' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_clipName_2_0= RULE_STRING ) ) ( (lv_text_3_0= RULE_STRING ) ) )
            // InternalJoveNotes.g:2837:3: otherlv_0= '@voice2text' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_clipName_2_0= RULE_STRING ) ) ( (lv_text_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getVoiceToTextAccess().getVoice2textKeyword_0());
                
            // InternalJoveNotes.g:2841:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==20) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalJoveNotes.g:2842:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // InternalJoveNotes.g:2842:1: (lv_hideFromView_1_0= 'hide' )
                    // InternalJoveNotes.g:2843:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_7); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getVoiceToTextAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVoiceToTextRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // InternalJoveNotes.g:2856:3: ( (lv_clipName_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:2857:1: (lv_clipName_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:2857:1: (lv_clipName_2_0= RULE_STRING )
            // InternalJoveNotes.g:2858:3: lv_clipName_2_0= RULE_STRING
            {
            lv_clipName_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			newLeafNode(lv_clipName_2_0, grammarAccess.getVoiceToTextAccess().getClipNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVoiceToTextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"clipName",
                    		lv_clipName_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:2874:2: ( (lv_text_3_0= RULE_STRING ) )
            // InternalJoveNotes.g:2875:1: (lv_text_3_0= RULE_STRING )
            {
            // InternalJoveNotes.g:2875:1: (lv_text_3_0= RULE_STRING )
            // InternalJoveNotes.g:2876:3: lv_text_3_0= RULE_STRING
            {
            lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_text_3_0, grammarAccess.getVoiceToTextAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVoiceToTextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleVoiceToText"


    // $ANTLR start "entryRuleCompilerBreak"
    // InternalJoveNotes.g:2900:1: entryRuleCompilerBreak returns [EObject current=null] : iv_ruleCompilerBreak= ruleCompilerBreak EOF ;
    public final EObject entryRuleCompilerBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompilerBreak = null;


        try {
            // InternalJoveNotes.g:2901:2: (iv_ruleCompilerBreak= ruleCompilerBreak EOF )
            // InternalJoveNotes.g:2902:2: iv_ruleCompilerBreak= ruleCompilerBreak EOF
            {
             newCompositeNode(grammarAccess.getCompilerBreakRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompilerBreak=ruleCompilerBreak();

            state._fsp--;

             current =iv_ruleCompilerBreak; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompilerBreak"


    // $ANTLR start "ruleCompilerBreak"
    // InternalJoveNotes.g:2909:1: ruleCompilerBreak returns [EObject current=null] : ( () otherlv_1= '@compiler_break' ) ;
    public final EObject ruleCompilerBreak() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:2912:28: ( ( () otherlv_1= '@compiler_break' ) )
            // InternalJoveNotes.g:2913:1: ( () otherlv_1= '@compiler_break' )
            {
            // InternalJoveNotes.g:2913:1: ( () otherlv_1= '@compiler_break' )
            // InternalJoveNotes.g:2913:2: () otherlv_1= '@compiler_break'
            {
            // InternalJoveNotes.g:2913:2: ()
            // InternalJoveNotes.g:2914:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCompilerBreakAccess().getCompilerBreakAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getCompilerBreakAccess().getCompiler_breakKeyword_1());
                

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
    // $ANTLR end "ruleCompilerBreak"


    // $ANTLR start "entryRuleChapterSection"
    // InternalJoveNotes.g:2931:1: entryRuleChapterSection returns [EObject current=null] : iv_ruleChapterSection= ruleChapterSection EOF ;
    public final EObject entryRuleChapterSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapterSection = null;


        try {
            // InternalJoveNotes.g:2932:2: (iv_ruleChapterSection= ruleChapterSection EOF )
            // InternalJoveNotes.g:2933:2: iv_ruleChapterSection= ruleChapterSection EOF
            {
             newCompositeNode(grammarAccess.getChapterSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChapterSection=ruleChapterSection();

            state._fsp--;

             current =iv_ruleChapterSection; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChapterSection"


    // $ANTLR start "ruleChapterSection"
    // InternalJoveNotes.g:2940:1: ruleChapterSection returns [EObject current=null] : (otherlv_0= '@section' ( (lv_sectionName_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleChapterSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sectionName_1_0=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:2943:28: ( (otherlv_0= '@section' ( (lv_sectionName_1_0= RULE_STRING ) ) ) )
            // InternalJoveNotes.g:2944:1: (otherlv_0= '@section' ( (lv_sectionName_1_0= RULE_STRING ) ) )
            {
            // InternalJoveNotes.g:2944:1: (otherlv_0= '@section' ( (lv_sectionName_1_0= RULE_STRING ) ) )
            // InternalJoveNotes.g:2944:3: otherlv_0= '@section' ( (lv_sectionName_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getChapterSectionAccess().getSectionKeyword_0());
                
            // InternalJoveNotes.g:2948:1: ( (lv_sectionName_1_0= RULE_STRING ) )
            // InternalJoveNotes.g:2949:1: (lv_sectionName_1_0= RULE_STRING )
            {
            // InternalJoveNotes.g:2949:1: (lv_sectionName_1_0= RULE_STRING )
            // InternalJoveNotes.g:2950:3: lv_sectionName_1_0= RULE_STRING
            {
            lv_sectionName_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_sectionName_1_0, grammarAccess.getChapterSectionAccess().getSectionNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChapterSectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sectionName",
                    		lv_sectionName_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleChapterSection"


    // $ANTLR start "entryRuleOption"
    // InternalJoveNotes.g:2974:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalJoveNotes.g:2975:2: (iv_ruleOption= ruleOption EOF )
            // InternalJoveNotes.g:2976:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:2983:1: ruleOption returns [EObject current=null] : ( ( (lv_optionValue_0_0= RULE_STRING ) ) ( (lv_correctOption_1_0= 'correct' ) )? ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token lv_optionValue_0_0=null;
        Token lv_correctOption_1_0=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:2986:28: ( ( ( (lv_optionValue_0_0= RULE_STRING ) ) ( (lv_correctOption_1_0= 'correct' ) )? ) )
            // InternalJoveNotes.g:2987:1: ( ( (lv_optionValue_0_0= RULE_STRING ) ) ( (lv_correctOption_1_0= 'correct' ) )? )
            {
            // InternalJoveNotes.g:2987:1: ( ( (lv_optionValue_0_0= RULE_STRING ) ) ( (lv_correctOption_1_0= 'correct' ) )? )
            // InternalJoveNotes.g:2987:2: ( (lv_optionValue_0_0= RULE_STRING ) ) ( (lv_correctOption_1_0= 'correct' ) )?
            {
            // InternalJoveNotes.g:2987:2: ( (lv_optionValue_0_0= RULE_STRING ) )
            // InternalJoveNotes.g:2988:1: (lv_optionValue_0_0= RULE_STRING )
            {
            // InternalJoveNotes.g:2988:1: (lv_optionValue_0_0= RULE_STRING )
            // InternalJoveNotes.g:2989:3: lv_optionValue_0_0= RULE_STRING
            {
            lv_optionValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

            			newLeafNode(lv_optionValue_0_0, grammarAccess.getOptionAccess().getOptionValueSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"optionValue",
                    		lv_optionValue_0_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalJoveNotes.g:3005:2: ( (lv_correctOption_1_0= 'correct' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==59) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalJoveNotes.g:3006:1: (lv_correctOption_1_0= 'correct' )
                    {
                    // InternalJoveNotes.g:3006:1: (lv_correctOption_1_0= 'correct' )
                    // InternalJoveNotes.g:3007:3: lv_correctOption_1_0= 'correct'
                    {
                    lv_correctOption_1_0=(Token)match(input,59,FOLLOW_2); 

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
    // InternalJoveNotes.g:3028:1: entryRuleCMap returns [EObject current=null] : iv_ruleCMap= ruleCMap EOF ;
    public final EObject entryRuleCMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCMap = null;


        try {
            // InternalJoveNotes.g:3029:2: (iv_ruleCMap= ruleCMap EOF )
            // InternalJoveNotes.g:3030:2: iv_ruleCMap= ruleCMap EOF
            {
             newCompositeNode(grammarAccess.getCMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCMap=ruleCMap();

            state._fsp--;

             current =iv_ruleCMap; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:3037:1: ruleCMap returns [EObject current=null] : (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleCMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:3040:28: ( (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalJoveNotes.g:3041:1: (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalJoveNotes.g:3041:1: (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalJoveNotes.g:3041:3: otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_21); 

                	newLeafNode(otherlv_0, grammarAccess.getCMapAccess().getCmapKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getCMapAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalJoveNotes.g:3049:1: ( (lv_content_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:3050:1: (lv_content_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:3050:1: (lv_content_2_0= RULE_STRING )
            // InternalJoveNotes.g:3051:3: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            			newLeafNode(lv_content_2_0, grammarAccess.getCMapAccess().getContentSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCMapRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalJoveNotes.g:3079:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // InternalJoveNotes.g:3080:2: (iv_ruleScript= ruleScript EOF )
            // InternalJoveNotes.g:3081:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:3088:1: ruleScript returns [EObject current=null] : (otherlv_0= 'script_expressions' otherlv_1= '{' ( (lv_evalVars_2_0= ruleEvalVar ) ) (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )* otherlv_5= '}' ( (lv_scriptBody_6_0= ruleScriptBody ) )? ) ;
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
            // InternalJoveNotes.g:3091:28: ( (otherlv_0= 'script_expressions' otherlv_1= '{' ( (lv_evalVars_2_0= ruleEvalVar ) ) (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )* otherlv_5= '}' ( (lv_scriptBody_6_0= ruleScriptBody ) )? ) )
            // InternalJoveNotes.g:3092:1: (otherlv_0= 'script_expressions' otherlv_1= '{' ( (lv_evalVars_2_0= ruleEvalVar ) ) (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )* otherlv_5= '}' ( (lv_scriptBody_6_0= ruleScriptBody ) )? )
            {
            // InternalJoveNotes.g:3092:1: (otherlv_0= 'script_expressions' otherlv_1= '{' ( (lv_evalVars_2_0= ruleEvalVar ) ) (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )* otherlv_5= '}' ( (lv_scriptBody_6_0= ruleScriptBody ) )? )
            // InternalJoveNotes.g:3092:3: otherlv_0= 'script_expressions' otherlv_1= '{' ( (lv_evalVars_2_0= ruleEvalVar ) ) (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )* otherlv_5= '}' ( (lv_scriptBody_6_0= ruleScriptBody ) )?
            {
            otherlv_0=(Token)match(input,61,FOLLOW_21); 

                	newLeafNode(otherlv_0, grammarAccess.getScriptAccess().getScript_expressionsKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalJoveNotes.g:3100:1: ( (lv_evalVars_2_0= ruleEvalVar ) )
            // InternalJoveNotes.g:3101:1: (lv_evalVars_2_0= ruleEvalVar )
            {
            // InternalJoveNotes.g:3101:1: (lv_evalVars_2_0= ruleEvalVar )
            // InternalJoveNotes.g:3102:3: lv_evalVars_2_0= ruleEvalVar
            {
             
            	        newCompositeNode(grammarAccess.getScriptAccess().getEvalVarsEvalVarParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_34);
            lv_evalVars_2_0=ruleEvalVar();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	        }
                   		add(
                   			current, 
                   			"evalVars",
                    		lv_evalVars_2_0, 
                    		"com.sandy.xtext.JoveNotes.EvalVar");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalJoveNotes.g:3118:2: (otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==44) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalJoveNotes.g:3118:4: otherlv_3= ',' ( (lv_evalVars_4_0= ruleEvalVar ) )
            	    {
            	    otherlv_3=(Token)match(input,44,FOLLOW_7); 

            	        	newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getCommaKeyword_3_0());
            	        
            	    // InternalJoveNotes.g:3122:1: ( (lv_evalVars_4_0= ruleEvalVar ) )
            	    // InternalJoveNotes.g:3123:1: (lv_evalVars_4_0= ruleEvalVar )
            	    {
            	    // InternalJoveNotes.g:3123:1: (lv_evalVars_4_0= ruleEvalVar )
            	    // InternalJoveNotes.g:3124:3: lv_evalVars_4_0= ruleEvalVar
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScriptAccess().getEvalVarsEvalVarParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_34);
            	    lv_evalVars_4_0=ruleEvalVar();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"evalVars",
            	            		lv_evalVars_4_0, 
            	            		"com.sandy.xtext.JoveNotes.EvalVar");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_5=(Token)match(input,29,FOLLOW_12); 

                	newLeafNode(otherlv_5, grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_4());
                
            // InternalJoveNotes.g:3144:1: ( (lv_scriptBody_6_0= ruleScriptBody ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==62) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalJoveNotes.g:3145:1: (lv_scriptBody_6_0= ruleScriptBody )
                    {
                    // InternalJoveNotes.g:3145:1: (lv_scriptBody_6_0= ruleScriptBody )
                    // InternalJoveNotes.g:3146:3: lv_scriptBody_6_0= ruleScriptBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getScriptAccess().getScriptBodyScriptBodyParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_scriptBody_6_0=ruleScriptBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScriptRule());
                    	        }
                           		set(
                           			current, 
                           			"scriptBody",
                            		lv_scriptBody_6_0, 
                            		"com.sandy.xtext.JoveNotes.ScriptBody");
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
    // InternalJoveNotes.g:3170:1: entryRuleEvalVar returns [EObject current=null] : iv_ruleEvalVar= ruleEvalVar EOF ;
    public final EObject entryRuleEvalVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvalVar = null;


        try {
            // InternalJoveNotes.g:3171:2: (iv_ruleEvalVar= ruleEvalVar EOF )
            // InternalJoveNotes.g:3172:2: iv_ruleEvalVar= ruleEvalVar EOF
            {
             newCompositeNode(grammarAccess.getEvalVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvalVar=ruleEvalVar();

            state._fsp--;

             current =iv_ruleEvalVar; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:3179:1: ruleEvalVar returns [EObject current=null] : ( ( (lv_varName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_varExpression_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEvalVar() throws RecognitionException {
        EObject current = null;

        Token lv_varName_0_0=null;
        Token otherlv_1=null;
        Token lv_varExpression_2_0=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:3182:28: ( ( ( (lv_varName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_varExpression_2_0= RULE_STRING ) ) ) )
            // InternalJoveNotes.g:3183:1: ( ( (lv_varName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_varExpression_2_0= RULE_STRING ) ) )
            {
            // InternalJoveNotes.g:3183:1: ( ( (lv_varName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_varExpression_2_0= RULE_STRING ) ) )
            // InternalJoveNotes.g:3183:2: ( (lv_varName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_varExpression_2_0= RULE_STRING ) )
            {
            // InternalJoveNotes.g:3183:2: ( (lv_varName_0_0= RULE_STRING ) )
            // InternalJoveNotes.g:3184:1: (lv_varName_0_0= RULE_STRING )
            {
            // InternalJoveNotes.g:3184:1: (lv_varName_0_0= RULE_STRING )
            // InternalJoveNotes.g:3185:3: lv_varName_0_0= RULE_STRING
            {
            lv_varName_0_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            			newLeafNode(lv_varName_0_0, grammarAccess.getEvalVarAccess().getVarNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEvalVarRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_0_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getEvalVarAccess().getEqualsSignKeyword_1());
                
            // InternalJoveNotes.g:3205:1: ( (lv_varExpression_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:3206:1: (lv_varExpression_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:3206:1: (lv_varExpression_2_0= RULE_STRING )
            // InternalJoveNotes.g:3207:3: lv_varExpression_2_0= RULE_STRING
            {
            lv_varExpression_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_varExpression_2_0, grammarAccess.getEvalVarAccess().getVarExpressionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEvalVarRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varExpression",
                    		lv_varExpression_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // InternalJoveNotes.g:3231:1: entryRuleScriptBody returns [EObject current=null] : iv_ruleScriptBody= ruleScriptBody EOF ;
    public final EObject entryRuleScriptBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptBody = null;


        try {
            // InternalJoveNotes.g:3232:2: (iv_ruleScriptBody= ruleScriptBody EOF )
            // InternalJoveNotes.g:3233:2: iv_ruleScriptBody= ruleScriptBody EOF
            {
             newCompositeNode(grammarAccess.getScriptBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScriptBody=ruleScriptBody();

            state._fsp--;

             current =iv_ruleScriptBody; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:3240:1: ruleScriptBody returns [EObject current=null] : (otherlv_0= 'script' otherlv_1= '{' ( (lv_script_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleScriptBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_script_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalJoveNotes.g:3243:28: ( (otherlv_0= 'script' otherlv_1= '{' ( (lv_script_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalJoveNotes.g:3244:1: (otherlv_0= 'script' otherlv_1= '{' ( (lv_script_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalJoveNotes.g:3244:1: (otherlv_0= 'script' otherlv_1= '{' ( (lv_script_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalJoveNotes.g:3244:3: otherlv_0= 'script' otherlv_1= '{' ( (lv_script_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_21); 

                	newLeafNode(otherlv_0, grammarAccess.getScriptBodyAccess().getScriptKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getScriptBodyAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalJoveNotes.g:3252:1: ( (lv_script_2_0= RULE_STRING ) )
            // InternalJoveNotes.g:3253:1: (lv_script_2_0= RULE_STRING )
            {
            // InternalJoveNotes.g:3253:1: (lv_script_2_0= RULE_STRING )
            // InternalJoveNotes.g:3254:3: lv_script_2_0= RULE_STRING
            {
            lv_script_2_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            			newLeafNode(lv_script_2_0, grammarAccess.getScriptBodyAccess().getScriptSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScriptBodyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"script",
                    		lv_script_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0712A77007E80002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x1000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018100010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000A0000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000E20000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C20000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010100010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002257007E80000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002257027E80000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0008000C20000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000820000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000020000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0020000000100000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0800000000000002L});

}