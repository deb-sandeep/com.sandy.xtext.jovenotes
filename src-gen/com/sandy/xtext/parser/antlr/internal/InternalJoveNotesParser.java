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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@skip_generation'", "'@skip_generation_in_production'", "'@test_paper'", "'subject'", "'chapterNumber'", "'.'", "'chapterName'", "'@wm'", "'hide'", "'@qa'", "'@fib'", "'@definition'", "'@character'", "'@tn'", "'@match'", "'skip_reverse_question'", "'{'", "'}'", "'='", "'@event'", "'@true_false'", "'@chem_equation'", "'>'", "'@chem_compound'", "'@spellbee'", "'@image_label'", "'imageName'", "','", "'@equation'", "'where'", "'@rtc'", "'context'", "'cmap'"
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
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
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

                if ( (LA1_0==19||(LA1_0>=21 && LA1_0<=26)||(LA1_0>=31 && LA1_0<=33)||(LA1_0>=35 && LA1_0<=37)||LA1_0==40||LA1_0==42) ) {
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:208:1: ruleChapterDetails returns [EObject current=null] : ( ( (lv_testPaper_0_0= '@test_paper' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ) ;
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

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:211:28: ( ( ( (lv_testPaper_0_0= '@test_paper' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:212:1: ( ( (lv_testPaper_0_0= '@test_paper' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:212:1: ( ( (lv_testPaper_0_0= '@test_paper' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:212:2: ( (lv_testPaper_0_0= '@test_paper' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) )
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:323:1: entryRuleNotesElement returns [EObject current=null] : iv_ruleNotesElement= ruleNotesElement EOF ;
    public final EObject entryRuleNotesElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotesElement = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:324:2: (iv_ruleNotesElement= ruleNotesElement EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:325:2: iv_ruleNotesElement= ruleNotesElement EOF
            {
             newCompositeNode(grammarAccess.getNotesElementRule()); 
            pushFollow(FOLLOW_ruleNotesElement_in_entryRuleNotesElement593);
            iv_ruleNotesElement=ruleNotesElement();

            state._fsp--;

             current =iv_ruleNotesElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotesElement603); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:332:1: ruleNotesElement returns [EObject current=null] : (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext ) ;
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


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:335:28: ( (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:336:1: (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:336:1: (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext )
            int alt5=15;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            case 25:
                {
                alt5=6;
                }
                break;
            case 26:
                {
                alt5=7;
                }
                break;
            case 31:
                {
                alt5=8;
                }
                break;
            case 32:
                {
                alt5=9;
                }
                break;
            case 33:
                {
                alt5=10;
                }
                break;
            case 35:
                {
                alt5=11;
                }
                break;
            case 36:
                {
                alt5=12;
                }
                break;
            case 37:
                {
                alt5=13;
                }
                break;
            case 40:
                {
                alt5=14;
                }
                break;
            case 42:
                {
                alt5=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:337:5: this_WordMeaning_0= ruleWordMeaning
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getWordMeaningParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWordMeaning_in_ruleNotesElement650);
                    this_WordMeaning_0=ruleWordMeaning();

                    state._fsp--;

                     
                            current = this_WordMeaning_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:347:5: this_QuestionAnswer_1= ruleQuestionAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getQuestionAnswerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQuestionAnswer_in_ruleNotesElement677);
                    this_QuestionAnswer_1=ruleQuestionAnswer();

                    state._fsp--;

                     
                            current = this_QuestionAnswer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:357:5: this_FIB_2= ruleFIB
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getFIBParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFIB_in_ruleNotesElement704);
                    this_FIB_2=ruleFIB();

                    state._fsp--;

                     
                            current = this_FIB_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:367:5: this_Definition_3= ruleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDefinition_in_ruleNotesElement731);
                    this_Definition_3=ruleDefinition();

                    state._fsp--;

                     
                            current = this_Definition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:377:5: this_Character_4= ruleCharacter
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getCharacterParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCharacter_in_ruleNotesElement758);
                    this_Character_4=ruleCharacter();

                    state._fsp--;

                     
                            current = this_Character_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:387:5: this_TeacherNote_5= ruleTeacherNote
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getTeacherNoteParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTeacherNote_in_ruleNotesElement785);
                    this_TeacherNote_5=ruleTeacherNote();

                    state._fsp--;

                     
                            current = this_TeacherNote_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:397:5: this_Matching_6= ruleMatching
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getMatchingParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleMatching_in_ruleNotesElement812);
                    this_Matching_6=ruleMatching();

                    state._fsp--;

                     
                            current = this_Matching_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:407:5: this_Event_7= ruleEvent
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getEventParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleEvent_in_ruleNotesElement839);
                    this_Event_7=ruleEvent();

                    state._fsp--;

                     
                            current = this_Event_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:417:5: this_TrueFalse_8= ruleTrueFalse
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getTrueFalseParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleTrueFalse_in_ruleNotesElement866);
                    this_TrueFalse_8=ruleTrueFalse();

                    state._fsp--;

                     
                            current = this_TrueFalse_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:427:5: this_ChemEquation_9= ruleChemEquation
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getChemEquationParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleChemEquation_in_ruleNotesElement893);
                    this_ChemEquation_9=ruleChemEquation();

                    state._fsp--;

                     
                            current = this_ChemEquation_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:437:5: this_ChemCompound_10= ruleChemCompound
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getChemCompoundParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleChemCompound_in_ruleNotesElement920);
                    this_ChemCompound_10=ruleChemCompound();

                    state._fsp--;

                     
                            current = this_ChemCompound_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:447:5: this_Spellbee_11= ruleSpellbee
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getSpellbeeParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleSpellbee_in_ruleNotesElement947);
                    this_Spellbee_11=ruleSpellbee();

                    state._fsp--;

                     
                            current = this_Spellbee_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:457:5: this_ImageLabel_12= ruleImageLabel
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getImageLabelParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleImageLabel_in_ruleNotesElement974);
                    this_ImageLabel_12=ruleImageLabel();

                    state._fsp--;

                     
                            current = this_ImageLabel_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:467:5: this_Equation_13= ruleEquation
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getEquationParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleEquation_in_ruleNotesElement1001);
                    this_Equation_13=ruleEquation();

                    state._fsp--;

                     
                            current = this_Equation_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:477:5: this_RefToContext_14= ruleRefToContext
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getRefToContextParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleRefToContext_in_ruleNotesElement1028);
                    this_RefToContext_14=ruleRefToContext();

                    state._fsp--;

                     
                            current = this_RefToContext_14; 
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
    // $ANTLR end "ruleNotesElement"


    // $ANTLR start "entryRuleWordMeaning"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:493:1: entryRuleWordMeaning returns [EObject current=null] : iv_ruleWordMeaning= ruleWordMeaning EOF ;
    public final EObject entryRuleWordMeaning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordMeaning = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:494:2: (iv_ruleWordMeaning= ruleWordMeaning EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:495:2: iv_ruleWordMeaning= ruleWordMeaning EOF
            {
             newCompositeNode(grammarAccess.getWordMeaningRule()); 
            pushFollow(FOLLOW_ruleWordMeaning_in_entryRuleWordMeaning1063);
            iv_ruleWordMeaning=ruleWordMeaning();

            state._fsp--;

             current =iv_ruleWordMeaning; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordMeaning1073); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:502:1: ruleWordMeaning returns [EObject current=null] : (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleWordMeaning() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_word_2_0=null;
        Token lv_meaning_3_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:505:28: ( (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:506:1: (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:506:1: (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:506:3: otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleWordMeaning1110); 

                	newLeafNode(otherlv_0, grammarAccess.getWordMeaningAccess().getWmKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:510:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:511:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:511:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:512:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleWordMeaning1128); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWordMeaningRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:525:3: ( (lv_word_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:526:1: (lv_word_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:526:1: (lv_word_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:527:3: lv_word_2_0= RULE_STRING
            {
            lv_word_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWordMeaning1159); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:543:2: ( (lv_meaning_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:544:1: (lv_meaning_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:544:1: (lv_meaning_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:545:3: lv_meaning_3_0= RULE_STRING
            {
            lv_meaning_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWordMeaning1181); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:569:1: entryRuleQuestionAnswer returns [EObject current=null] : iv_ruleQuestionAnswer= ruleQuestionAnswer EOF ;
    public final EObject entryRuleQuestionAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionAnswer = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:570:2: (iv_ruleQuestionAnswer= ruleQuestionAnswer EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:571:2: iv_ruleQuestionAnswer= ruleQuestionAnswer EOF
            {
             newCompositeNode(grammarAccess.getQuestionAnswerRule()); 
            pushFollow(FOLLOW_ruleQuestionAnswer_in_entryRuleQuestionAnswer1222);
            iv_ruleQuestionAnswer=ruleQuestionAnswer();

            state._fsp--;

             current =iv_ruleQuestionAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionAnswer1232); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:578:1: ruleQuestionAnswer returns [EObject current=null] : (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleQuestionAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_question_2_0=null;
        Token lv_answerParts_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:581:28: ( (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:582:1: (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:582:1: (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:582:3: otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answerParts_3_0= RULE_STRING ) )+ ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleQuestionAnswer1269); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAnswerAccess().getQaKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:586:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:587:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:587:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:588:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleQuestionAnswer1287); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionAnswerRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:601:3: ( (lv_question_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:602:1: (lv_question_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:602:1: (lv_question_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:603:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestionAnswer1318); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:619:2: ( (lv_answerParts_3_0= RULE_STRING ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:620:1: (lv_answerParts_3_0= RULE_STRING )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:620:1: (lv_answerParts_3_0= RULE_STRING )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:621:3: lv_answerParts_3_0= RULE_STRING
            	    {
            	    lv_answerParts_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestionAnswer1340); 

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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:637:3: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==44) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:638:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:638:1: (lv_cmap_4_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:639:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionAnswerAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleQuestionAnswer1367);
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:663:1: entryRuleFIB returns [EObject current=null] : iv_ruleFIB= ruleFIB EOF ;
    public final EObject entryRuleFIB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFIB = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:664:2: (iv_ruleFIB= ruleFIB EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:665:2: iv_ruleFIB= ruleFIB EOF
            {
             newCompositeNode(grammarAccess.getFIBRule()); 
            pushFollow(FOLLOW_ruleFIB_in_entryRuleFIB1404);
            iv_ruleFIB=ruleFIB();

            state._fsp--;

             current =iv_ruleFIB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFIB1414); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:672:1: ruleFIB returns [EObject current=null] : (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ ) ;
    public final EObject ruleFIB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_question_2_0=null;
        Token lv_answers_3_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:675:28: ( (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:676:1: (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:676:1: (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:676:3: otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleFIB1451); 

                	newLeafNode(otherlv_0, grammarAccess.getFIBAccess().getFibKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:680:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:681:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:681:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:682:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleFIB1469); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFIBRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:695:3: ( (lv_question_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:696:1: (lv_question_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:696:1: (lv_question_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:697:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFIB1500); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:713:2: ( (lv_answers_3_0= RULE_STRING ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:714:1: (lv_answers_3_0= RULE_STRING )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:714:1: (lv_answers_3_0= RULE_STRING )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:715:3: lv_answers_3_0= RULE_STRING
            	    {
            	    lv_answers_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFIB1522); 

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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:739:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:740:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:741:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition1564);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition1574); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:748:1: ruleDefinition returns [EObject current=null] : (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_term_2_0=null;
        Token lv_definition_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:751:28: ( (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:752:1: (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:752:1: (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:752:3: otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleDefinition1611); 

                	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefinitionKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:756:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:757:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:757:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:758:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleDefinition1629); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:771:3: ( (lv_term_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:772:1: (lv_term_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:772:1: (lv_term_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:773:3: lv_term_2_0= RULE_STRING
            {
            lv_term_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefinition1660); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:789:2: ( (lv_definition_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:790:1: (lv_definition_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:790:1: (lv_definition_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:791:3: lv_definition_3_0= RULE_STRING
            {
            lv_definition_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefinition1682); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:807:2: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==44) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:808:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:808:1: (lv_cmap_4_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:809:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefinitionAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleDefinition1708);
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:833:1: entryRuleCharacter returns [EObject current=null] : iv_ruleCharacter= ruleCharacter EOF ;
    public final EObject entryRuleCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacter = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:834:2: (iv_ruleCharacter= ruleCharacter EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:835:2: iv_ruleCharacter= ruleCharacter EOF
            {
             newCompositeNode(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_ruleCharacter_in_entryRuleCharacter1745);
            iv_ruleCharacter=ruleCharacter();

            state._fsp--;

             current =iv_ruleCharacter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharacter1755); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:842:1: ruleCharacter returns [EObject current=null] : (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_character_2_0=null;
        Token lv_estimate_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:845:28: ( (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:846:1: (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:846:1: (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:846:3: otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleCharacter1792); 

                	newLeafNode(otherlv_0, grammarAccess.getCharacterAccess().getCharacterKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:850:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:851:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:851:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:852:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleCharacter1810); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCharacterRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:865:3: ( (lv_character_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:866:1: (lv_character_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:866:1: (lv_character_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:867:3: lv_character_2_0= RULE_STRING
            {
            lv_character_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharacter1841); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:883:2: ( (lv_estimate_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:884:1: (lv_estimate_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:884:1: (lv_estimate_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:885:3: lv_estimate_3_0= RULE_STRING
            {
            lv_estimate_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharacter1863); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:901:2: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==44) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:902:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:902:1: (lv_cmap_4_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:903:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleCharacter1889);
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:927:1: entryRuleTeacherNote returns [EObject current=null] : iv_ruleTeacherNote= ruleTeacherNote EOF ;
    public final EObject entryRuleTeacherNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeacherNote = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:928:2: (iv_ruleTeacherNote= ruleTeacherNote EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:929:2: iv_ruleTeacherNote= ruleTeacherNote EOF
            {
             newCompositeNode(grammarAccess.getTeacherNoteRule()); 
            pushFollow(FOLLOW_ruleTeacherNote_in_entryRuleTeacherNote1926);
            iv_ruleTeacherNote=ruleTeacherNote();

            state._fsp--;

             current =iv_ruleTeacherNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTeacherNote1936); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:936:1: ruleTeacherNote returns [EObject current=null] : (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleTeacherNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_caption_2_0=null;
        Token lv_note_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:939:28: ( (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:940:1: (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:940:1: (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:940:3: otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleTeacherNote1973); 

                	newLeafNode(otherlv_0, grammarAccess.getTeacherNoteAccess().getTnKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:944:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:945:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:945:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:946:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleTeacherNote1991); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTeacherNoteRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:959:3: ( (lv_caption_2_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_STRING) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:960:1: (lv_caption_2_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:960:1: (lv_caption_2_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:961:3: lv_caption_2_0= RULE_STRING
                    {
                    lv_caption_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTeacherNote2022); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:977:3: ( (lv_note_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:978:1: (lv_note_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:978:1: (lv_note_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:979:3: lv_note_3_0= RULE_STRING
            {
            lv_note_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTeacherNote2045); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:995:2: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:996:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:996:1: (lv_cmap_4_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:997:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getTeacherNoteAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleTeacherNote2071);
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1021:1: entryRuleMatching returns [EObject current=null] : iv_ruleMatching= ruleMatching EOF ;
    public final EObject entryRuleMatching() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatching = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1022:2: (iv_ruleMatching= ruleMatching EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1023:2: iv_ruleMatching= ruleMatching EOF
            {
             newCompositeNode(grammarAccess.getMatchingRule()); 
            pushFollow(FOLLOW_ruleMatching_in_entryRuleMatching2108);
            iv_ruleMatching=ruleMatching();

            state._fsp--;

             current =iv_ruleMatching; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatching2118); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1030:1: ruleMatching returns [EObject current=null] : (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ otherlv_6= '}' ) ;
    public final EObject ruleMatching() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_skipReverseQuestion_2_0=null;
        Token lv_question_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_pairs_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1033:28: ( (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ otherlv_6= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1034:1: (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ otherlv_6= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1034:1: (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ otherlv_6= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1034:3: otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleMatching2155); 

                	newLeafNode(otherlv_0, grammarAccess.getMatchingAccess().getMatchKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1038:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1039:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1039:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1040:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleMatching2173); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchingRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1053:3: ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1054:1: (lv_skipReverseQuestion_2_0= 'skip_reverse_question' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1054:1: (lv_skipReverseQuestion_2_0= 'skip_reverse_question' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1055:3: lv_skipReverseQuestion_2_0= 'skip_reverse_question'
                    {
                    lv_skipReverseQuestion_2_0=(Token)match(input,27,FOLLOW_27_in_ruleMatching2205); 

                            newLeafNode(lv_skipReverseQuestion_2_0, grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchingRule());
                    	        }
                           		setWithLastConsumed(current, "skipReverseQuestion", lv_skipReverseQuestion_2_0, "skip_reverse_question");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1068:3: ( (lv_question_3_0= RULE_STRING ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1069:1: (lv_question_3_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1069:1: (lv_question_3_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1070:3: lv_question_3_0= RULE_STRING
                    {
                    lv_question_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatching2236); 

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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleMatching2254); 

                	newLeafNode(otherlv_4, grammarAccess.getMatchingAccess().getLeftCurlyBracketKeyword_4());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1090:1: ( (lv_pairs_5_0= ruleMatchPair ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1091:1: (lv_pairs_5_0= ruleMatchPair )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1091:1: (lv_pairs_5_0= ruleMatchPair )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1092:3: lv_pairs_5_0= ruleMatchPair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMatchingAccess().getPairsMatchPairParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMatchPair_in_ruleMatching2275);
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleMatching2288); 

                	newLeafNode(otherlv_6, grammarAccess.getMatchingAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1120:1: entryRuleMatchPair returns [EObject current=null] : iv_ruleMatchPair= ruleMatchPair EOF ;
    public final EObject entryRuleMatchPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchPair = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1121:2: (iv_ruleMatchPair= ruleMatchPair EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1122:2: iv_ruleMatchPair= ruleMatchPair EOF
            {
             newCompositeNode(grammarAccess.getMatchPairRule()); 
            pushFollow(FOLLOW_ruleMatchPair_in_entryRuleMatchPair2324);
            iv_ruleMatchPair=ruleMatchPair();

            state._fsp--;

             current =iv_ruleMatchPair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchPair2334); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1129:1: ruleMatchPair returns [EObject current=null] : ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMatchPair() throws RecognitionException {
        EObject current = null;

        Token lv_matchQuestion_0_0=null;
        Token otherlv_1=null;
        Token lv_matchAnswer_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1132:28: ( ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1133:1: ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1133:1: ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1133:2: ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1133:2: ( (lv_matchQuestion_0_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1134:1: (lv_matchQuestion_0_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1134:1: (lv_matchQuestion_0_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1135:3: lv_matchQuestion_0_0= RULE_STRING
            {
            lv_matchQuestion_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatchPair2376); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMatchPair2393); 

                	newLeafNode(otherlv_1, grammarAccess.getMatchPairAccess().getEqualsSignKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1155:1: ( (lv_matchAnswer_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1156:1: (lv_matchAnswer_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1156:1: (lv_matchAnswer_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1157:3: lv_matchAnswer_2_0= RULE_STRING
            {
            lv_matchAnswer_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatchPair2410); 

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


    // $ANTLR start "entryRuleEvent"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1181:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1182:2: (iv_ruleEvent= ruleEvent EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1183:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent2451);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent2461); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1190:1: ruleEvent returns [EObject current=null] : (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_event_2_0=null;
        Token lv_time_3_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1193:28: ( (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1194:1: (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1194:1: (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1194:3: otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleEvent2498); 

                	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1198:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1199:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1199:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1200:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleEvent2516); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1213:3: ( (lv_event_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1214:1: (lv_event_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1214:1: (lv_event_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1215:3: lv_event_2_0= RULE_STRING
            {
            lv_event_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent2547); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1231:2: ( (lv_time_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1232:1: (lv_time_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1232:1: (lv_time_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1233:3: lv_time_3_0= RULE_STRING
            {
            lv_time_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent2569); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1257:1: entryRuleTrueFalse returns [EObject current=null] : iv_ruleTrueFalse= ruleTrueFalse EOF ;
    public final EObject entryRuleTrueFalse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueFalse = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1258:2: (iv_ruleTrueFalse= ruleTrueFalse EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1259:2: iv_ruleTrueFalse= ruleTrueFalse EOF
            {
             newCompositeNode(grammarAccess.getTrueFalseRule()); 
            pushFollow(FOLLOW_ruleTrueFalse_in_entryRuleTrueFalse2610);
            iv_ruleTrueFalse=ruleTrueFalse();

            state._fsp--;

             current =iv_ruleTrueFalse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrueFalse2620); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1266:1: ruleTrueFalse returns [EObject current=null] : (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleTrueFalse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_statement_2_0=null;
        Token lv_truthValue_3_0=null;
        Token lv_justification_4_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1269:28: ( (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1270:1: (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1270:1: (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1270:3: otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleTrueFalse2657); 

                	newLeafNode(otherlv_0, grammarAccess.getTrueFalseAccess().getTrue_falseKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1274:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1275:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1275:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1276:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleTrueFalse2675); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTrueFalseRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1289:3: ( (lv_statement_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1290:1: (lv_statement_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1290:1: (lv_statement_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1291:3: lv_statement_2_0= RULE_STRING
            {
            lv_statement_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTrueFalse2706); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1307:2: ( (lv_truthValue_3_0= RULE_BOOL ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1308:1: (lv_truthValue_3_0= RULE_BOOL )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1308:1: (lv_truthValue_3_0= RULE_BOOL )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1309:3: lv_truthValue_3_0= RULE_BOOL
            {
            lv_truthValue_3_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleTrueFalse2728); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1325:2: ( (lv_justification_4_0= RULE_STRING ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1326:1: (lv_justification_4_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1326:1: (lv_justification_4_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1327:3: lv_justification_4_0= RULE_STRING
                    {
                    lv_justification_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTrueFalse2750); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1351:1: entryRuleChemEquation returns [EObject current=null] : iv_ruleChemEquation= ruleChemEquation EOF ;
    public final EObject entryRuleChemEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemEquation = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1352:2: (iv_ruleChemEquation= ruleChemEquation EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1353:2: iv_ruleChemEquation= ruleChemEquation EOF
            {
             newCompositeNode(grammarAccess.getChemEquationRule()); 
            pushFollow(FOLLOW_ruleChemEquation_in_entryRuleChemEquation2792);
            iv_ruleChemEquation=ruleChemEquation();

            state._fsp--;

             current =iv_ruleChemEquation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChemEquation2802); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1360:1: ruleChemEquation returns [EObject current=null] : (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1363:28: ( (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1364:1: (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1364:1: (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1364:3: otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleChemEquation2839); 

                	newLeafNode(otherlv_0, grammarAccess.getChemEquationAccess().getChem_equationKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1368:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1369:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1369:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1370:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleChemEquation2857); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemEquationRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1383:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1384:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1384:1: (lv_description_2_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1385:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation2888); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleChemEquation2906); 

                	newLeafNode(otherlv_3, grammarAccess.getChemEquationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1405:1: ( (lv_reactants_4_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1406:1: (lv_reactants_4_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1406:1: (lv_reactants_4_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1407:3: lv_reactants_4_0= RULE_STRING
            {
            lv_reactants_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation2923); 

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

            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleChemEquation2940); 

                	newLeafNode(otherlv_5, grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_5());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1427:1: ( (lv_produces_6_0= RULE_STRING ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1428:1: (lv_produces_6_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1428:1: (lv_produces_6_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1429:3: lv_produces_6_0= RULE_STRING
                    {
                    lv_produces_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation2957); 

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

            otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleChemEquation2975); 

                	newLeafNode(otherlv_7, grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_7());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1449:1: ( (lv_products_8_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1450:1: (lv_products_8_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1450:1: (lv_products_8_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1451:3: lv_products_8_0= RULE_STRING
            {
            lv_products_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation2992); 

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

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleChemEquation3009); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1479:1: entryRuleChemCompound returns [EObject current=null] : iv_ruleChemCompound= ruleChemCompound EOF ;
    public final EObject entryRuleChemCompound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemCompound = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1480:2: (iv_ruleChemCompound= ruleChemCompound EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1481:2: iv_ruleChemCompound= ruleChemCompound EOF
            {
             newCompositeNode(grammarAccess.getChemCompoundRule()); 
            pushFollow(FOLLOW_ruleChemCompound_in_entryRuleChemCompound3045);
            iv_ruleChemCompound=ruleChemCompound();

            state._fsp--;

             current =iv_ruleChemCompound; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChemCompound3055); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1488:1: ruleChemCompound returns [EObject current=null] : (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleChemCompound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_symbol_2_0=null;
        Token lv_chemicalName_3_0=null;
        Token lv_commonName_4_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1491:28: ( (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1492:1: (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1492:1: (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1492:3: otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleChemCompound3092); 

                	newLeafNode(otherlv_0, grammarAccess.getChemCompoundAccess().getChem_compoundKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1496:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1497:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1497:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1498:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleChemCompound3110); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemCompoundRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1511:3: ( (lv_symbol_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1512:1: (lv_symbol_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1512:1: (lv_symbol_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1513:3: lv_symbol_2_0= RULE_STRING
            {
            lv_symbol_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemCompound3141); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1529:2: ( (lv_chemicalName_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1530:1: (lv_chemicalName_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1530:1: (lv_chemicalName_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1531:3: lv_chemicalName_3_0= RULE_STRING
            {
            lv_chemicalName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemCompound3163); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1547:2: ( (lv_commonName_4_0= RULE_STRING ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1548:1: (lv_commonName_4_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1548:1: (lv_commonName_4_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1549:3: lv_commonName_4_0= RULE_STRING
                    {
                    lv_commonName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemCompound3185); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1573:1: entryRuleSpellbee returns [EObject current=null] : iv_ruleSpellbee= ruleSpellbee EOF ;
    public final EObject entryRuleSpellbee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpellbee = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1574:2: (iv_ruleSpellbee= ruleSpellbee EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1575:2: iv_ruleSpellbee= ruleSpellbee EOF
            {
             newCompositeNode(grammarAccess.getSpellbeeRule()); 
            pushFollow(FOLLOW_ruleSpellbee_in_entryRuleSpellbee3227);
            iv_ruleSpellbee=ruleSpellbee();

            state._fsp--;

             current =iv_ruleSpellbee; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpellbee3237); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1582:1: ruleSpellbee returns [EObject current=null] : (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSpellbee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_word_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1585:28: ( (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1586:1: (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1586:1: (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1586:3: otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleSpellbee3274); 

                	newLeafNode(otherlv_0, grammarAccess.getSpellbeeAccess().getSpellbeeKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1590:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1591:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1591:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1592:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleSpellbee3292); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpellbeeRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1605:3: ( (lv_word_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1606:1: (lv_word_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1606:1: (lv_word_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1607:3: lv_word_2_0= RULE_STRING
            {
            lv_word_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpellbee3323); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1631:1: entryRuleImageLabel returns [EObject current=null] : iv_ruleImageLabel= ruleImageLabel EOF ;
    public final EObject entryRuleImageLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageLabel = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1632:2: (iv_ruleImageLabel= ruleImageLabel EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1633:2: iv_ruleImageLabel= ruleImageLabel EOF
            {
             newCompositeNode(grammarAccess.getImageLabelRule()); 
            pushFollow(FOLLOW_ruleImageLabel_in_entryRuleImageLabel3364);
            iv_ruleImageLabel=ruleImageLabel();

            state._fsp--;

             current =iv_ruleImageLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageLabel3374); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1640:1: ruleImageLabel returns [EObject current=null] : (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1643:28: ( (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1644:1: (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1644:1: (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1644:3: otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleImageLabel3411); 

                	newLeafNode(otherlv_0, grammarAccess.getImageLabelAccess().getImage_labelKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1648:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1649:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1649:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1650:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleImageLabel3429); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageLabelRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1663:3: ( (lv_caption_2_0= RULE_STRING ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1664:1: (lv_caption_2_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1664:1: (lv_caption_2_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1665:3: lv_caption_2_0= RULE_STRING
                    {
                    lv_caption_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageLabel3460); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleImageLabel3478); 

                	newLeafNode(otherlv_3, grammarAccess.getImageLabelAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleImageLabel3490); 

                	newLeafNode(otherlv_4, grammarAccess.getImageLabelAccess().getImageNameKeyword_4());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1689:1: ( (lv_imageName_5_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1690:1: (lv_imageName_5_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1690:1: (lv_imageName_5_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1691:3: lv_imageName_5_0= RULE_STRING
            {
            lv_imageName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageLabel3507); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1707:2: ( (lv_hotspots_6_0= ruleHotSpot ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1708:1: (lv_hotspots_6_0= ruleHotSpot )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1708:1: (lv_hotspots_6_0= ruleHotSpot )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1709:3: lv_hotspots_6_0= ruleHotSpot
            {
             
            	        newCompositeNode(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleHotSpot_in_ruleImageLabel3533);
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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1725:2: (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==39) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1725:4: otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) )
            	    {
            	    otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleImageLabel3546); 

            	        	newLeafNode(otherlv_7, grammarAccess.getImageLabelAccess().getCommaKeyword_7_0());
            	        
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1729:1: ( (lv_hotspots_8_0= ruleHotSpot ) )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1730:1: (lv_hotspots_8_0= ruleHotSpot )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1730:1: (lv_hotspots_8_0= ruleHotSpot )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1731:3: lv_hotspots_8_0= ruleHotSpot
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHotSpot_in_ruleImageLabel3567);
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
            	    break loop34;
                }
            } while (true);

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleImageLabel3581); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1759:1: entryRuleHotSpot returns [EObject current=null] : iv_ruleHotSpot= ruleHotSpot EOF ;
    public final EObject entryRuleHotSpot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHotSpot = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1760:2: (iv_ruleHotSpot= ruleHotSpot EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1761:2: iv_ruleHotSpot= ruleHotSpot EOF
            {
             newCompositeNode(grammarAccess.getHotSpotRule()); 
            pushFollow(FOLLOW_ruleHotSpot_in_entryRuleHotSpot3617);
            iv_ruleHotSpot=ruleHotSpot();

            state._fsp--;

             current =iv_ruleHotSpot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHotSpot3627); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1768:1: ruleHotSpot returns [EObject current=null] : ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleHotSpot() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;
        Token otherlv_1=null;
        Token lv_y_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1771:28: ( ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1772:1: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1772:1: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1772:2: ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1772:2: ( (lv_x_0_0= RULE_INT ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1773:1: (lv_x_0_0= RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1773:1: (lv_x_0_0= RULE_INT )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1774:3: lv_x_0_0= RULE_INT
            {
            lv_x_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHotSpot3669); 

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

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleHotSpot3686); 

                	newLeafNode(otherlv_1, grammarAccess.getHotSpotAccess().getCommaKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1794:1: ( (lv_y_2_0= RULE_INT ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1795:1: (lv_y_2_0= RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1795:1: (lv_y_2_0= RULE_INT )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1796:3: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHotSpot3703); 

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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleHotSpot3720); 

                	newLeafNode(otherlv_3, grammarAccess.getHotSpotAccess().getEqualsSignKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1816:1: ( (lv_label_4_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1817:1: (lv_label_4_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1817:1: (lv_label_4_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1818:3: lv_label_4_0= RULE_STRING
            {
            lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHotSpot3737); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1842:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1843:2: (iv_ruleEquation= ruleEquation EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1844:2: iv_ruleEquation= ruleEquation EOF
            {
             newCompositeNode(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_ruleEquation_in_entryRuleEquation3778);
            iv_ruleEquation=ruleEquation();

            state._fsp--;

             current =iv_ruleEquation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquation3788); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1851:1: ruleEquation returns [EObject current=null] : (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1854:28: ( (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1855:1: (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1855:1: (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1855:3: otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleEquation3825); 

                	newLeafNode(otherlv_0, grammarAccess.getEquationAccess().getEquationKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1859:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1860:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1860:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1861:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleEquation3843); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEquationRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1874:3: ( (lv_equation_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1875:1: (lv_equation_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1875:1: (lv_equation_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1876:3: lv_equation_2_0= RULE_STRING
            {
            lv_equation_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEquation3874); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleEquation3891); 

                	newLeafNode(otherlv_3, grammarAccess.getEquationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1896:1: ( (lv_description_4_0= RULE_STRING ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1897:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1897:1: (lv_description_4_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1898:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEquation3908); 

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

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleEquation3926); 

                	newLeafNode(otherlv_5, grammarAccess.getEquationAccess().getWhereKeyword_5());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1918:1: ( (lv_symbols_6_0= ruleEqSymbol ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1919:1: (lv_symbols_6_0= ruleEqSymbol )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1919:1: (lv_symbols_6_0= ruleEqSymbol )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1920:3: lv_symbols_6_0= ruleEqSymbol
            {
             
            	        newCompositeNode(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleEqSymbol_in_ruleEquation3947);
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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1936:2: (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==39) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1936:4: otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) )
            	    {
            	    otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleEquation3960); 

            	        	newLeafNode(otherlv_7, grammarAccess.getEquationAccess().getCommaKeyword_7_0());
            	        
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1940:1: ( (lv_symbols_8_0= ruleEqSymbol ) )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1941:1: (lv_symbols_8_0= ruleEqSymbol )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1941:1: (lv_symbols_8_0= ruleEqSymbol )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1942:3: lv_symbols_8_0= ruleEqSymbol
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqSymbol_in_ruleEquation3981);
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
            	    break loop37;
                }
            } while (true);

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleEquation3995); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1970:1: entryRuleEqSymbol returns [EObject current=null] : iv_ruleEqSymbol= ruleEqSymbol EOF ;
    public final EObject entryRuleEqSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqSymbol = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1971:2: (iv_ruleEqSymbol= ruleEqSymbol EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1972:2: iv_ruleEqSymbol= ruleEqSymbol EOF
            {
             newCompositeNode(grammarAccess.getEqSymbolRule()); 
            pushFollow(FOLLOW_ruleEqSymbol_in_entryRuleEqSymbol4031);
            iv_ruleEqSymbol=ruleEqSymbol();

            state._fsp--;

             current =iv_ruleEqSymbol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqSymbol4041); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1979:1: ruleEqSymbol returns [EObject current=null] : ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEqSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1982:28: ( ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1983:1: ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1983:1: ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1983:2: ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1983:2: ( (lv_symbol_0_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1984:1: (lv_symbol_0_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1984:1: (lv_symbol_0_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1985:3: lv_symbol_0_0= RULE_STRING
            {
            lv_symbol_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqSymbol4083); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleEqSymbol4100); 

                	newLeafNode(otherlv_1, grammarAccess.getEqSymbolAccess().getEqualsSignKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2005:1: ( (lv_description_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2006:1: (lv_description_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2006:1: (lv_description_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2007:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqSymbol4117); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2031:1: entryRuleRefToContext returns [EObject current=null] : iv_ruleRefToContext= ruleRefToContext EOF ;
    public final EObject entryRuleRefToContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefToContext = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2032:2: (iv_ruleRefToContext= ruleRefToContext EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2033:2: iv_ruleRefToContext= ruleRefToContext EOF
            {
             newCompositeNode(grammarAccess.getRefToContextRule()); 
            pushFollow(FOLLOW_ruleRefToContext_in_entryRuleRefToContext4158);
            iv_ruleRefToContext=ruleRefToContext();

            state._fsp--;

             current =iv_ruleRefToContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefToContext4168); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2040:1: ruleRefToContext returns [EObject current=null] : (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_questions_5_0= ruleQuestionAnswer ) )+ otherlv_6= '}' ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2043:28: ( (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_questions_5_0= ruleQuestionAnswer ) )+ otherlv_6= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2044:1: (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_questions_5_0= ruleQuestionAnswer ) )+ otherlv_6= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2044:1: (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_questions_5_0= ruleQuestionAnswer ) )+ otherlv_6= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2044:3: otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_questions_5_0= ruleQuestionAnswer ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleRefToContext4205); 

                	newLeafNode(otherlv_0, grammarAccess.getRefToContextAccess().getRtcKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2048:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2049:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2049:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2050:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,20,FOLLOW_20_in_ruleRefToContext4223); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRefToContextRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleRefToContext4249); 

                	newLeafNode(otherlv_2, grammarAccess.getRefToContextAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleRefToContext4261); 

                	newLeafNode(otherlv_3, grammarAccess.getRefToContextAccess().getContextKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2071:1: ( (lv_context_4_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2072:1: (lv_context_4_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2072:1: (lv_context_4_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2073:3: lv_context_4_0= RULE_STRING
            {
            lv_context_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRefToContext4278); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2089:2: ( (lv_questions_5_0= ruleQuestionAnswer ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==21) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2090:1: (lv_questions_5_0= ruleQuestionAnswer )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2090:1: (lv_questions_5_0= ruleQuestionAnswer )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2091:3: lv_questions_5_0= ruleQuestionAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefToContextAccess().getQuestionsQuestionAnswerParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestionAnswer_in_ruleRefToContext4304);
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
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleRefToContext4317); 

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


    // $ANTLR start "entryRuleCMap"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2119:1: entryRuleCMap returns [EObject current=null] : iv_ruleCMap= ruleCMap EOF ;
    public final EObject entryRuleCMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCMap = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2120:2: (iv_ruleCMap= ruleCMap EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2121:2: iv_ruleCMap= ruleCMap EOF
            {
             newCompositeNode(grammarAccess.getCMapRule()); 
            pushFollow(FOLLOW_ruleCMap_in_entryRuleCMap4353);
            iv_ruleCMap=ruleCMap();

            state._fsp--;

             current =iv_ruleCMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCMap4363); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2128:1: ruleCMap returns [EObject current=null] : (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleCMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2131:28: ( (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2132:1: (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2132:1: (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2132:3: otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleCMap4400); 

                	newLeafNode(otherlv_0, grammarAccess.getCMapAccess().getCmapKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleCMap4412); 

                	newLeafNode(otherlv_1, grammarAccess.getCMapAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2140:1: ( (lv_content_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2141:1: (lv_content_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2141:1: (lv_content_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2142:3: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCMap4429); 

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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleCMap4446); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleJoveNotes_in_entryRuleJoveNotes75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoveNotes85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessingHints_in_ruleJoveNotes131 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleChapterDetails_in_ruleJoveNotes152 = new BitSet(new long[]{0x0000053B87E80002L});
    public static final BitSet FOLLOW_ruleNotesElement_in_ruleJoveNotes173 = new BitSet(new long[]{0x0000053B87E80002L});
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
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChapterDetails552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotesElement_in_entryRuleNotesElement593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotesElement603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMeaning_in_ruleNotesElement650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_ruleNotesElement677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFIB_in_ruleNotesElement704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleNotesElement731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_ruleNotesElement758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeacherNote_in_ruleNotesElement785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatching_in_ruleNotesElement812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleNotesElement839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueFalse_in_ruleNotesElement866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemEquation_in_ruleNotesElement893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemCompound_in_ruleNotesElement920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpellbee_in_ruleNotesElement947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageLabel_in_ruleNotesElement974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_ruleNotesElement1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefToContext_in_ruleNotesElement1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMeaning_in_entryRuleWordMeaning1063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordMeaning1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleWordMeaning1110 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleWordMeaning1128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWordMeaning1159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWordMeaning1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_entryRuleQuestionAnswer1222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionAnswer1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleQuestionAnswer1269 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleQuestionAnswer1287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestionAnswer1318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestionAnswer1340 = new BitSet(new long[]{0x0000100000000012L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleQuestionAnswer1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFIB_in_entryRuleFIB1404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFIB1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFIB1451 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleFIB1469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFIB1500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFIB1522 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition1564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDefinition1611 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleDefinition1629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefinition1660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefinition1682 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleDefinition1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_entryRuleCharacter1745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharacter1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCharacter1792 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleCharacter1810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharacter1841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharacter1863 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleCharacter1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeacherNote_in_entryRuleTeacherNote1926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTeacherNote1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTeacherNote1973 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleTeacherNote1991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTeacherNote2022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTeacherNote2045 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleTeacherNote2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatching_in_entryRuleMatching2108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatching2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMatching2155 = new BitSet(new long[]{0x0000000018100010L});
    public static final BitSet FOLLOW_20_in_ruleMatching2173 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_27_in_ruleMatching2205 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatching2236 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMatching2254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMatchPair_in_ruleMatching2275 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_29_in_ruleMatching2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchPair_in_entryRuleMatchPair2324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchPair2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatchPair2376 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMatchPair2393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatchPair2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent2451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEvent2498 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleEvent2516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent2547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueFalse_in_entryRuleTrueFalse2610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrueFalse2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTrueFalse2657 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleTrueFalse2675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTrueFalse2706 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleTrueFalse2728 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTrueFalse2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemEquation_in_entryRuleChemEquation2792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChemEquation2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleChemEquation2839 = new BitSet(new long[]{0x0000000010100010L});
    public static final BitSet FOLLOW_20_in_ruleChemEquation2857 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation2888 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleChemEquation2906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation2923 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleChemEquation2940 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation2957 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleChemEquation2975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation2992 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleChemEquation3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemCompound_in_entryRuleChemCompound3045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChemCompound3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleChemCompound3092 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleChemCompound3110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemCompound3141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemCompound3163 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemCompound3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpellbee_in_entryRuleSpellbee3227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpellbee3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSpellbee3274 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleSpellbee3292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpellbee3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageLabel_in_entryRuleImageLabel3364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageLabel3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleImageLabel3411 = new BitSet(new long[]{0x0000000010100010L});
    public static final BitSet FOLLOW_20_in_ruleImageLabel3429 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageLabel3460 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleImageLabel3478 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleImageLabel3490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageLabel3507 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHotSpot_in_ruleImageLabel3533 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_39_in_ruleImageLabel3546 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHotSpot_in_ruleImageLabel3567 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_29_in_ruleImageLabel3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHotSpot_in_entryRuleHotSpot3617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHotSpot3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHotSpot3669 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleHotSpot3686 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHotSpot3703 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleHotSpot3720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHotSpot3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation3778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquation3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEquation3825 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleEquation3843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEquation3874 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEquation3891 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEquation3908 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleEquation3926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_ruleEquation3947 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_39_in_ruleEquation3960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_ruleEquation3981 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_29_in_ruleEquation3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_entryRuleEqSymbol4031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqSymbol4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqSymbol4083 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEqSymbol4100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqSymbol4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefToContext_in_entryRuleRefToContext4158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefToContext4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRefToContext4205 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_20_in_ruleRefToContext4223 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRefToContext4249 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleRefToContext4261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRefToContext4278 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_ruleRefToContext4304 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_29_in_ruleRefToContext4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_entryRuleCMap4353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCMap4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCMap4400 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCMap4412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCMap4429 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCMap4446 = new BitSet(new long[]{0x0000000000000002L});

}