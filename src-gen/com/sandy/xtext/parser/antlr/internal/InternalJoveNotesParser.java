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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@skip_generation'", "'@test_paper'", "'subject'", "'chapterNumber'", "'.'", "'chapterName'", "'@wm'", "'@qa'", "'@fib'", "'@definition'", "'@character'", "'@tn'", "'@match'", "'skip_reverse_question'", "'{'", "'}'", "'='", "'@event'", "'@true_false'", "'@chem_equation'", "'@chem_compound'", "'@spellbee'", "'@image_label'", "'imageName'", "','", "'@equation'", "'where'", "'@rtc'", "'context'", "'cmap'"
    };
    public static final int RULE_ID=7;
    public static final int T__40=40;
    public static final int T__41=41;
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
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:76:1: ruleJoveNotes returns [EObject current=null] : ( ( (lv_processingHints_0_0= ruleProcessingHints ) )? ( (lv_chapterDetails_1_0= ruleChapterDetails ) ) ( (lv_notesElements_2_0= ruleNotesElement ) )* ) ;
    public final EObject ruleJoveNotes() throws RecognitionException {
        EObject current = null;

        EObject lv_processingHints_0_0 = null;

        EObject lv_chapterDetails_1_0 = null;

        EObject lv_notesElements_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:79:28: ( ( ( (lv_processingHints_0_0= ruleProcessingHints ) )? ( (lv_chapterDetails_1_0= ruleChapterDetails ) ) ( (lv_notesElements_2_0= ruleNotesElement ) )* ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:80:1: ( ( (lv_processingHints_0_0= ruleProcessingHints ) )? ( (lv_chapterDetails_1_0= ruleChapterDetails ) ) ( (lv_notesElements_2_0= ruleNotesElement ) )* )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:80:1: ( ( (lv_processingHints_0_0= ruleProcessingHints ) )? ( (lv_chapterDetails_1_0= ruleChapterDetails ) ) ( (lv_notesElements_2_0= ruleNotesElement ) )* )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:80:2: ( (lv_processingHints_0_0= ruleProcessingHints ) )? ( (lv_chapterDetails_1_0= ruleChapterDetails ) ) ( (lv_notesElements_2_0= ruleNotesElement ) )*
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:80:2: ( (lv_processingHints_0_0= ruleProcessingHints ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
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
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:98:3: ( (lv_chapterDetails_1_0= ruleChapterDetails ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:99:1: (lv_chapterDetails_1_0= ruleChapterDetails )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:99:1: (lv_chapterDetails_1_0= ruleChapterDetails )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:100:3: lv_chapterDetails_1_0= ruleChapterDetails
            {
             
            	        newCompositeNode(grammarAccess.getJoveNotesAccess().getChapterDetailsChapterDetailsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleChapterDetails_in_ruleJoveNotes153);
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
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=18 && LA2_0<=24)||(LA2_0>=29 && LA2_0<=34)||LA2_0==37||LA2_0==39) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:117:1: (lv_notesElements_2_0= ruleNotesElement )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:117:1: (lv_notesElements_2_0= ruleNotesElement )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:118:3: lv_notesElements_2_0= ruleNotesElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJoveNotesAccess().getNotesElementsNotesElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNotesElement_in_ruleJoveNotes174);
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
            	    break loop2;
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
            pushFollow(FOLLOW_ruleProcessingHints_in_entryRuleProcessingHints211);
            iv_ruleProcessingHints=ruleProcessingHints();

            state._fsp--;

             current =iv_ruleProcessingHints; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessingHints221); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:151:1: ruleProcessingHints returns [EObject current=null] : ( (lv_skipGeneration_0_0= '@skip_generation' ) ) ;
    public final EObject ruleProcessingHints() throws RecognitionException {
        EObject current = null;

        Token lv_skipGeneration_0_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:154:28: ( ( (lv_skipGeneration_0_0= '@skip_generation' ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:155:1: ( (lv_skipGeneration_0_0= '@skip_generation' ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:155:1: ( (lv_skipGeneration_0_0= '@skip_generation' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:156:1: (lv_skipGeneration_0_0= '@skip_generation' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:156:1: (lv_skipGeneration_0_0= '@skip_generation' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:157:3: lv_skipGeneration_0_0= '@skip_generation'
            {
            lv_skipGeneration_0_0=(Token)match(input,12,FOLLOW_12_in_ruleProcessingHints263); 

                    newLeafNode(lv_skipGeneration_0_0, grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessingHintsRule());
            	        }
                   		setWithLastConsumed(current, "skipGeneration", lv_skipGeneration_0_0, "@skip_generation");
            	    

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:178:1: entryRuleChapterDetails returns [EObject current=null] : iv_ruleChapterDetails= ruleChapterDetails EOF ;
    public final EObject entryRuleChapterDetails() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapterDetails = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:179:2: (iv_ruleChapterDetails= ruleChapterDetails EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:180:2: iv_ruleChapterDetails= ruleChapterDetails EOF
            {
             newCompositeNode(grammarAccess.getChapterDetailsRule()); 
            pushFollow(FOLLOW_ruleChapterDetails_in_entryRuleChapterDetails311);
            iv_ruleChapterDetails=ruleChapterDetails();

            state._fsp--;

             current =iv_ruleChapterDetails; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChapterDetails321); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:187:1: ruleChapterDetails returns [EObject current=null] : ( ( (lv_testPaper_0_0= '@test_paper' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:190:28: ( ( ( (lv_testPaper_0_0= '@test_paper' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:191:1: ( ( (lv_testPaper_0_0= '@test_paper' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:191:1: ( ( (lv_testPaper_0_0= '@test_paper' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:191:2: ( (lv_testPaper_0_0= '@test_paper' ) )? otherlv_1= 'subject' ( (lv_subjectName_2_0= RULE_STRING ) ) otherlv_3= 'chapterNumber' ( (lv_chapterNumber_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_subChapterNumber_6_0= RULE_INT ) ) otherlv_7= 'chapterName' ( (lv_chapterName_8_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:191:2: ( (lv_testPaper_0_0= '@test_paper' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:192:1: (lv_testPaper_0_0= '@test_paper' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:192:1: (lv_testPaper_0_0= '@test_paper' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:193:3: lv_testPaper_0_0= '@test_paper'
                    {
                    lv_testPaper_0_0=(Token)match(input,13,FOLLOW_13_in_ruleChapterDetails364); 

                            newLeafNode(lv_testPaper_0_0, grammarAccess.getChapterDetailsAccess().getTestPaperTest_paperKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChapterDetailsRule());
                    	        }
                           		setWithLastConsumed(current, "testPaper", lv_testPaper_0_0, "@test_paper");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleChapterDetails390); 

                	newLeafNode(otherlv_1, grammarAccess.getChapterDetailsAccess().getSubjectKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:210:1: ( (lv_subjectName_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:211:1: (lv_subjectName_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:211:1: (lv_subjectName_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:212:3: lv_subjectName_2_0= RULE_STRING
            {
            lv_subjectName_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChapterDetails407); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleChapterDetails424); 

                	newLeafNode(otherlv_3, grammarAccess.getChapterDetailsAccess().getChapterNumberKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:232:1: ( (lv_chapterNumber_4_0= RULE_INT ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:233:1: (lv_chapterNumber_4_0= RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:233:1: (lv_chapterNumber_4_0= RULE_INT )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:234:3: lv_chapterNumber_4_0= RULE_INT
            {
            lv_chapterNumber_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleChapterDetails441); 

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

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleChapterDetails458); 

                	newLeafNode(otherlv_5, grammarAccess.getChapterDetailsAccess().getFullStopKeyword_5());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:254:1: ( (lv_subChapterNumber_6_0= RULE_INT ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:255:1: (lv_subChapterNumber_6_0= RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:255:1: (lv_subChapterNumber_6_0= RULE_INT )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:256:3: lv_subChapterNumber_6_0= RULE_INT
            {
            lv_subChapterNumber_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleChapterDetails475); 

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

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleChapterDetails492); 

                	newLeafNode(otherlv_7, grammarAccess.getChapterDetailsAccess().getChapterNameKeyword_7());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:276:1: ( (lv_chapterName_8_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:277:1: (lv_chapterName_8_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:277:1: (lv_chapterName_8_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:278:3: lv_chapterName_8_0= RULE_STRING
            {
            lv_chapterName_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChapterDetails509); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:302:1: entryRuleNotesElement returns [EObject current=null] : iv_ruleNotesElement= ruleNotesElement EOF ;
    public final EObject entryRuleNotesElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotesElement = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:303:2: (iv_ruleNotesElement= ruleNotesElement EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:304:2: iv_ruleNotesElement= ruleNotesElement EOF
            {
             newCompositeNode(grammarAccess.getNotesElementRule()); 
            pushFollow(FOLLOW_ruleNotesElement_in_entryRuleNotesElement550);
            iv_ruleNotesElement=ruleNotesElement();

            state._fsp--;

             current =iv_ruleNotesElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotesElement560); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:311:1: ruleNotesElement returns [EObject current=null] : (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:314:28: ( (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:315:1: (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:315:1: (this_WordMeaning_0= ruleWordMeaning | this_QuestionAnswer_1= ruleQuestionAnswer | this_FIB_2= ruleFIB | this_Definition_3= ruleDefinition | this_Character_4= ruleCharacter | this_TeacherNote_5= ruleTeacherNote | this_Matching_6= ruleMatching | this_Event_7= ruleEvent | this_TrueFalse_8= ruleTrueFalse | this_ChemEquation_9= ruleChemEquation | this_ChemCompound_10= ruleChemCompound | this_Spellbee_11= ruleSpellbee | this_ImageLabel_12= ruleImageLabel | this_Equation_13= ruleEquation | this_RefToContext_14= ruleRefToContext )
            int alt4=15;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            case 22:
                {
                alt4=5;
                }
                break;
            case 23:
                {
                alt4=6;
                }
                break;
            case 24:
                {
                alt4=7;
                }
                break;
            case 29:
                {
                alt4=8;
                }
                break;
            case 30:
                {
                alt4=9;
                }
                break;
            case 31:
                {
                alt4=10;
                }
                break;
            case 32:
                {
                alt4=11;
                }
                break;
            case 33:
                {
                alt4=12;
                }
                break;
            case 34:
                {
                alt4=13;
                }
                break;
            case 37:
                {
                alt4=14;
                }
                break;
            case 39:
                {
                alt4=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:316:5: this_WordMeaning_0= ruleWordMeaning
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getWordMeaningParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWordMeaning_in_ruleNotesElement607);
                    this_WordMeaning_0=ruleWordMeaning();

                    state._fsp--;

                     
                            current = this_WordMeaning_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:326:5: this_QuestionAnswer_1= ruleQuestionAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getQuestionAnswerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQuestionAnswer_in_ruleNotesElement634);
                    this_QuestionAnswer_1=ruleQuestionAnswer();

                    state._fsp--;

                     
                            current = this_QuestionAnswer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:336:5: this_FIB_2= ruleFIB
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getFIBParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFIB_in_ruleNotesElement661);
                    this_FIB_2=ruleFIB();

                    state._fsp--;

                     
                            current = this_FIB_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:346:5: this_Definition_3= ruleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDefinition_in_ruleNotesElement688);
                    this_Definition_3=ruleDefinition();

                    state._fsp--;

                     
                            current = this_Definition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:356:5: this_Character_4= ruleCharacter
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getCharacterParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCharacter_in_ruleNotesElement715);
                    this_Character_4=ruleCharacter();

                    state._fsp--;

                     
                            current = this_Character_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:366:5: this_TeacherNote_5= ruleTeacherNote
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getTeacherNoteParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTeacherNote_in_ruleNotesElement742);
                    this_TeacherNote_5=ruleTeacherNote();

                    state._fsp--;

                     
                            current = this_TeacherNote_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:376:5: this_Matching_6= ruleMatching
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getMatchingParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleMatching_in_ruleNotesElement769);
                    this_Matching_6=ruleMatching();

                    state._fsp--;

                     
                            current = this_Matching_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:386:5: this_Event_7= ruleEvent
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getEventParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleEvent_in_ruleNotesElement796);
                    this_Event_7=ruleEvent();

                    state._fsp--;

                     
                            current = this_Event_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:396:5: this_TrueFalse_8= ruleTrueFalse
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getTrueFalseParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleTrueFalse_in_ruleNotesElement823);
                    this_TrueFalse_8=ruleTrueFalse();

                    state._fsp--;

                     
                            current = this_TrueFalse_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:406:5: this_ChemEquation_9= ruleChemEquation
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getChemEquationParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleChemEquation_in_ruleNotesElement850);
                    this_ChemEquation_9=ruleChemEquation();

                    state._fsp--;

                     
                            current = this_ChemEquation_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:416:5: this_ChemCompound_10= ruleChemCompound
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getChemCompoundParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleChemCompound_in_ruleNotesElement877);
                    this_ChemCompound_10=ruleChemCompound();

                    state._fsp--;

                     
                            current = this_ChemCompound_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:426:5: this_Spellbee_11= ruleSpellbee
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getSpellbeeParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleSpellbee_in_ruleNotesElement904);
                    this_Spellbee_11=ruleSpellbee();

                    state._fsp--;

                     
                            current = this_Spellbee_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:436:5: this_ImageLabel_12= ruleImageLabel
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getImageLabelParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleImageLabel_in_ruleNotesElement931);
                    this_ImageLabel_12=ruleImageLabel();

                    state._fsp--;

                     
                            current = this_ImageLabel_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:446:5: this_Equation_13= ruleEquation
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getEquationParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleEquation_in_ruleNotesElement958);
                    this_Equation_13=ruleEquation();

                    state._fsp--;

                     
                            current = this_Equation_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:456:5: this_RefToContext_14= ruleRefToContext
                    {
                     
                            newCompositeNode(grammarAccess.getNotesElementAccess().getRefToContextParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleRefToContext_in_ruleNotesElement985);
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:472:1: entryRuleWordMeaning returns [EObject current=null] : iv_ruleWordMeaning= ruleWordMeaning EOF ;
    public final EObject entryRuleWordMeaning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordMeaning = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:473:2: (iv_ruleWordMeaning= ruleWordMeaning EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:474:2: iv_ruleWordMeaning= ruleWordMeaning EOF
            {
             newCompositeNode(grammarAccess.getWordMeaningRule()); 
            pushFollow(FOLLOW_ruleWordMeaning_in_entryRuleWordMeaning1020);
            iv_ruleWordMeaning=ruleWordMeaning();

            state._fsp--;

             current =iv_ruleWordMeaning; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordMeaning1030); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:481:1: ruleWordMeaning returns [EObject current=null] : (otherlv_0= '@wm' ( (lv_word_1_0= RULE_STRING ) ) ( (lv_meaning_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleWordMeaning() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_word_1_0=null;
        Token lv_meaning_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:484:28: ( (otherlv_0= '@wm' ( (lv_word_1_0= RULE_STRING ) ) ( (lv_meaning_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:485:1: (otherlv_0= '@wm' ( (lv_word_1_0= RULE_STRING ) ) ( (lv_meaning_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:485:1: (otherlv_0= '@wm' ( (lv_word_1_0= RULE_STRING ) ) ( (lv_meaning_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:485:3: otherlv_0= '@wm' ( (lv_word_1_0= RULE_STRING ) ) ( (lv_meaning_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleWordMeaning1067); 

                	newLeafNode(otherlv_0, grammarAccess.getWordMeaningAccess().getWmKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:489:1: ( (lv_word_1_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:490:1: (lv_word_1_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:490:1: (lv_word_1_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:491:3: lv_word_1_0= RULE_STRING
            {
            lv_word_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWordMeaning1084); 

            			newLeafNode(lv_word_1_0, grammarAccess.getWordMeaningAccess().getWordSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWordMeaningRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"word",
                    		lv_word_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:507:2: ( (lv_meaning_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:508:1: (lv_meaning_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:508:1: (lv_meaning_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:509:3: lv_meaning_2_0= RULE_STRING
            {
            lv_meaning_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWordMeaning1106); 

            			newLeafNode(lv_meaning_2_0, grammarAccess.getWordMeaningAccess().getMeaningSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWordMeaningRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"meaning",
                    		lv_meaning_2_0, 
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:533:1: entryRuleQuestionAnswer returns [EObject current=null] : iv_ruleQuestionAnswer= ruleQuestionAnswer EOF ;
    public final EObject entryRuleQuestionAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionAnswer = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:534:2: (iv_ruleQuestionAnswer= ruleQuestionAnswer EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:535:2: iv_ruleQuestionAnswer= ruleQuestionAnswer EOF
            {
             newCompositeNode(grammarAccess.getQuestionAnswerRule()); 
            pushFollow(FOLLOW_ruleQuestionAnswer_in_entryRuleQuestionAnswer1147);
            iv_ruleQuestionAnswer=ruleQuestionAnswer();

            state._fsp--;

             current =iv_ruleQuestionAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionAnswer1157); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:542:1: ruleQuestionAnswer returns [EObject current=null] : (otherlv_0= '@qa' ( (lv_question_1_0= RULE_STRING ) ) ( (lv_answer_2_0= RULE_STRING ) ) ( (lv_cmap_3_0= ruleCMap ) )? ) ;
    public final EObject ruleQuestionAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_question_1_0=null;
        Token lv_answer_2_0=null;
        EObject lv_cmap_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:545:28: ( (otherlv_0= '@qa' ( (lv_question_1_0= RULE_STRING ) ) ( (lv_answer_2_0= RULE_STRING ) ) ( (lv_cmap_3_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:546:1: (otherlv_0= '@qa' ( (lv_question_1_0= RULE_STRING ) ) ( (lv_answer_2_0= RULE_STRING ) ) ( (lv_cmap_3_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:546:1: (otherlv_0= '@qa' ( (lv_question_1_0= RULE_STRING ) ) ( (lv_answer_2_0= RULE_STRING ) ) ( (lv_cmap_3_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:546:3: otherlv_0= '@qa' ( (lv_question_1_0= RULE_STRING ) ) ( (lv_answer_2_0= RULE_STRING ) ) ( (lv_cmap_3_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleQuestionAnswer1194); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAnswerAccess().getQaKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:550:1: ( (lv_question_1_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:551:1: (lv_question_1_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:551:1: (lv_question_1_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:552:3: lv_question_1_0= RULE_STRING
            {
            lv_question_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestionAnswer1211); 

            			newLeafNode(lv_question_1_0, grammarAccess.getQuestionAnswerAccess().getQuestionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:568:2: ( (lv_answer_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:569:1: (lv_answer_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:569:1: (lv_answer_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:570:3: lv_answer_2_0= RULE_STRING
            {
            lv_answer_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestionAnswer1233); 

            			newLeafNode(lv_answer_2_0, grammarAccess.getQuestionAnswerAccess().getAnswerSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"answer",
                    		lv_answer_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:586:2: ( (lv_cmap_3_0= ruleCMap ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==41) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:587:1: (lv_cmap_3_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:587:1: (lv_cmap_3_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:588:3: lv_cmap_3_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionAnswerAccess().getCmapCMapParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleQuestionAnswer1259);
                    lv_cmap_3_0=ruleCMap();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQuestionAnswerRule());
                    	        }
                           		set(
                           			current, 
                           			"cmap",
                            		lv_cmap_3_0, 
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:612:1: entryRuleFIB returns [EObject current=null] : iv_ruleFIB= ruleFIB EOF ;
    public final EObject entryRuleFIB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFIB = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:613:2: (iv_ruleFIB= ruleFIB EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:614:2: iv_ruleFIB= ruleFIB EOF
            {
             newCompositeNode(grammarAccess.getFIBRule()); 
            pushFollow(FOLLOW_ruleFIB_in_entryRuleFIB1296);
            iv_ruleFIB=ruleFIB();

            state._fsp--;

             current =iv_ruleFIB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFIB1306); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:621:1: ruleFIB returns [EObject current=null] : (otherlv_0= '@fib' ( (lv_question_1_0= RULE_STRING ) ) ( (lv_answers_2_0= RULE_STRING ) )+ ) ;
    public final EObject ruleFIB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_question_1_0=null;
        Token lv_answers_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:624:28: ( (otherlv_0= '@fib' ( (lv_question_1_0= RULE_STRING ) ) ( (lv_answers_2_0= RULE_STRING ) )+ ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:625:1: (otherlv_0= '@fib' ( (lv_question_1_0= RULE_STRING ) ) ( (lv_answers_2_0= RULE_STRING ) )+ )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:625:1: (otherlv_0= '@fib' ( (lv_question_1_0= RULE_STRING ) ) ( (lv_answers_2_0= RULE_STRING ) )+ )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:625:3: otherlv_0= '@fib' ( (lv_question_1_0= RULE_STRING ) ) ( (lv_answers_2_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleFIB1343); 

                	newLeafNode(otherlv_0, grammarAccess.getFIBAccess().getFibKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:629:1: ( (lv_question_1_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:630:1: (lv_question_1_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:630:1: (lv_question_1_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:631:3: lv_question_1_0= RULE_STRING
            {
            lv_question_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFIB1360); 

            			newLeafNode(lv_question_1_0, grammarAccess.getFIBAccess().getQuestionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFIBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:647:2: ( (lv_answers_2_0= RULE_STRING ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:648:1: (lv_answers_2_0= RULE_STRING )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:648:1: (lv_answers_2_0= RULE_STRING )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:649:3: lv_answers_2_0= RULE_STRING
            	    {
            	    lv_answers_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFIB1382); 

            	    			newLeafNode(lv_answers_2_0, grammarAccess.getFIBAccess().getAnswersSTRINGTerminalRuleCall_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFIBRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"answers",
            	            		lv_answers_2_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:673:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:674:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:675:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition1424);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition1434); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:682:1: ruleDefinition returns [EObject current=null] : (otherlv_0= '@definition' ( (lv_term_1_0= RULE_STRING ) ) ( (lv_definition_2_0= RULE_STRING ) ) ( (lv_cmap_3_0= ruleCMap ) )? ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_term_1_0=null;
        Token lv_definition_2_0=null;
        EObject lv_cmap_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:685:28: ( (otherlv_0= '@definition' ( (lv_term_1_0= RULE_STRING ) ) ( (lv_definition_2_0= RULE_STRING ) ) ( (lv_cmap_3_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:686:1: (otherlv_0= '@definition' ( (lv_term_1_0= RULE_STRING ) ) ( (lv_definition_2_0= RULE_STRING ) ) ( (lv_cmap_3_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:686:1: (otherlv_0= '@definition' ( (lv_term_1_0= RULE_STRING ) ) ( (lv_definition_2_0= RULE_STRING ) ) ( (lv_cmap_3_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:686:3: otherlv_0= '@definition' ( (lv_term_1_0= RULE_STRING ) ) ( (lv_definition_2_0= RULE_STRING ) ) ( (lv_cmap_3_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleDefinition1471); 

                	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefinitionKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:690:1: ( (lv_term_1_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:691:1: (lv_term_1_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:691:1: (lv_term_1_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:692:3: lv_term_1_0= RULE_STRING
            {
            lv_term_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefinition1488); 

            			newLeafNode(lv_term_1_0, grammarAccess.getDefinitionAccess().getTermSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"term",
                    		lv_term_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:708:2: ( (lv_definition_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:709:1: (lv_definition_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:709:1: (lv_definition_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:710:3: lv_definition_2_0= RULE_STRING
            {
            lv_definition_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefinition1510); 

            			newLeafNode(lv_definition_2_0, grammarAccess.getDefinitionAccess().getDefinitionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"definition",
                    		lv_definition_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:726:2: ( (lv_cmap_3_0= ruleCMap ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==41) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:727:1: (lv_cmap_3_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:727:1: (lv_cmap_3_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:728:3: lv_cmap_3_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefinitionAccess().getCmapCMapParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleDefinition1536);
                    lv_cmap_3_0=ruleCMap();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"cmap",
                            		lv_cmap_3_0, 
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:752:1: entryRuleCharacter returns [EObject current=null] : iv_ruleCharacter= ruleCharacter EOF ;
    public final EObject entryRuleCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacter = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:753:2: (iv_ruleCharacter= ruleCharacter EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:754:2: iv_ruleCharacter= ruleCharacter EOF
            {
             newCompositeNode(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_ruleCharacter_in_entryRuleCharacter1573);
            iv_ruleCharacter=ruleCharacter();

            state._fsp--;

             current =iv_ruleCharacter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharacter1583); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:761:1: ruleCharacter returns [EObject current=null] : (otherlv_0= '@character' ( (lv_character_1_0= RULE_STRING ) ) ( (lv_estimate_2_0= RULE_STRING ) ) ( (lv_cmap_3_0= ruleCMap ) )? ) ;
    public final EObject ruleCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_character_1_0=null;
        Token lv_estimate_2_0=null;
        EObject lv_cmap_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:764:28: ( (otherlv_0= '@character' ( (lv_character_1_0= RULE_STRING ) ) ( (lv_estimate_2_0= RULE_STRING ) ) ( (lv_cmap_3_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:765:1: (otherlv_0= '@character' ( (lv_character_1_0= RULE_STRING ) ) ( (lv_estimate_2_0= RULE_STRING ) ) ( (lv_cmap_3_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:765:1: (otherlv_0= '@character' ( (lv_character_1_0= RULE_STRING ) ) ( (lv_estimate_2_0= RULE_STRING ) ) ( (lv_cmap_3_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:765:3: otherlv_0= '@character' ( (lv_character_1_0= RULE_STRING ) ) ( (lv_estimate_2_0= RULE_STRING ) ) ( (lv_cmap_3_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleCharacter1620); 

                	newLeafNode(otherlv_0, grammarAccess.getCharacterAccess().getCharacterKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:769:1: ( (lv_character_1_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:770:1: (lv_character_1_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:770:1: (lv_character_1_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:771:3: lv_character_1_0= RULE_STRING
            {
            lv_character_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharacter1637); 

            			newLeafNode(lv_character_1_0, grammarAccess.getCharacterAccess().getCharacterSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCharacterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"character",
                    		lv_character_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:787:2: ( (lv_estimate_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:788:1: (lv_estimate_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:788:1: (lv_estimate_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:789:3: lv_estimate_2_0= RULE_STRING
            {
            lv_estimate_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharacter1659); 

            			newLeafNode(lv_estimate_2_0, grammarAccess.getCharacterAccess().getEstimateSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCharacterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"estimate",
                    		lv_estimate_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:805:2: ( (lv_cmap_3_0= ruleCMap ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==41) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:806:1: (lv_cmap_3_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:806:1: (lv_cmap_3_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:807:3: lv_cmap_3_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterAccess().getCmapCMapParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleCharacter1685);
                    lv_cmap_3_0=ruleCMap();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterRule());
                    	        }
                           		set(
                           			current, 
                           			"cmap",
                            		lv_cmap_3_0, 
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:831:1: entryRuleTeacherNote returns [EObject current=null] : iv_ruleTeacherNote= ruleTeacherNote EOF ;
    public final EObject entryRuleTeacherNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeacherNote = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:832:2: (iv_ruleTeacherNote= ruleTeacherNote EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:833:2: iv_ruleTeacherNote= ruleTeacherNote EOF
            {
             newCompositeNode(grammarAccess.getTeacherNoteRule()); 
            pushFollow(FOLLOW_ruleTeacherNote_in_entryRuleTeacherNote1722);
            iv_ruleTeacherNote=ruleTeacherNote();

            state._fsp--;

             current =iv_ruleTeacherNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTeacherNote1732); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:840:1: ruleTeacherNote returns [EObject current=null] : (otherlv_0= '@tn' ( (lv_note_1_0= RULE_STRING ) ) ( (lv_cmap_2_0= ruleCMap ) )? ) ;
    public final EObject ruleTeacherNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_note_1_0=null;
        EObject lv_cmap_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:843:28: ( (otherlv_0= '@tn' ( (lv_note_1_0= RULE_STRING ) ) ( (lv_cmap_2_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:844:1: (otherlv_0= '@tn' ( (lv_note_1_0= RULE_STRING ) ) ( (lv_cmap_2_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:844:1: (otherlv_0= '@tn' ( (lv_note_1_0= RULE_STRING ) ) ( (lv_cmap_2_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:844:3: otherlv_0= '@tn' ( (lv_note_1_0= RULE_STRING ) ) ( (lv_cmap_2_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleTeacherNote1769); 

                	newLeafNode(otherlv_0, grammarAccess.getTeacherNoteAccess().getTnKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:848:1: ( (lv_note_1_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:849:1: (lv_note_1_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:849:1: (lv_note_1_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:850:3: lv_note_1_0= RULE_STRING
            {
            lv_note_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTeacherNote1786); 

            			newLeafNode(lv_note_1_0, grammarAccess.getTeacherNoteAccess().getNoteSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTeacherNoteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"note",
                    		lv_note_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:866:2: ( (lv_cmap_2_0= ruleCMap ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:867:1: (lv_cmap_2_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:867:1: (lv_cmap_2_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:868:3: lv_cmap_2_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getTeacherNoteAccess().getCmapCMapParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleTeacherNote1812);
                    lv_cmap_2_0=ruleCMap();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTeacherNoteRule());
                    	        }
                           		set(
                           			current, 
                           			"cmap",
                            		lv_cmap_2_0, 
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:892:1: entryRuleMatching returns [EObject current=null] : iv_ruleMatching= ruleMatching EOF ;
    public final EObject entryRuleMatching() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatching = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:893:2: (iv_ruleMatching= ruleMatching EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:894:2: iv_ruleMatching= ruleMatching EOF
            {
             newCompositeNode(grammarAccess.getMatchingRule()); 
            pushFollow(FOLLOW_ruleMatching_in_entryRuleMatching1849);
            iv_ruleMatching=ruleMatching();

            state._fsp--;

             current =iv_ruleMatching; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatching1859); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:901:1: ruleMatching returns [EObject current=null] : (otherlv_0= '@match' ( (lv_skipReverseQuestion_1_0= 'skip_reverse_question' ) )? ( (lv_question_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_pairs_4_0= ruleMatchPair ) )+ otherlv_5= '}' ) ;
    public final EObject ruleMatching() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_skipReverseQuestion_1_0=null;
        Token lv_question_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_pairs_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:904:28: ( (otherlv_0= '@match' ( (lv_skipReverseQuestion_1_0= 'skip_reverse_question' ) )? ( (lv_question_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_pairs_4_0= ruleMatchPair ) )+ otherlv_5= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:905:1: (otherlv_0= '@match' ( (lv_skipReverseQuestion_1_0= 'skip_reverse_question' ) )? ( (lv_question_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_pairs_4_0= ruleMatchPair ) )+ otherlv_5= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:905:1: (otherlv_0= '@match' ( (lv_skipReverseQuestion_1_0= 'skip_reverse_question' ) )? ( (lv_question_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_pairs_4_0= ruleMatchPair ) )+ otherlv_5= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:905:3: otherlv_0= '@match' ( (lv_skipReverseQuestion_1_0= 'skip_reverse_question' ) )? ( (lv_question_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_pairs_4_0= ruleMatchPair ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleMatching1896); 

                	newLeafNode(otherlv_0, grammarAccess.getMatchingAccess().getMatchKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:909:1: ( (lv_skipReverseQuestion_1_0= 'skip_reverse_question' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:910:1: (lv_skipReverseQuestion_1_0= 'skip_reverse_question' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:910:1: (lv_skipReverseQuestion_1_0= 'skip_reverse_question' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:911:3: lv_skipReverseQuestion_1_0= 'skip_reverse_question'
                    {
                    lv_skipReverseQuestion_1_0=(Token)match(input,25,FOLLOW_25_in_ruleMatching1914); 

                            newLeafNode(lv_skipReverseQuestion_1_0, grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchingRule());
                    	        }
                           		setWithLastConsumed(current, "skipReverseQuestion", lv_skipReverseQuestion_1_0, "skip_reverse_question");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:924:3: ( (lv_question_2_0= RULE_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:925:1: (lv_question_2_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:925:1: (lv_question_2_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:926:3: lv_question_2_0= RULE_STRING
                    {
                    lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatching1945); 

                    			newLeafNode(lv_question_2_0, grammarAccess.getMatchingAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchingRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"question",
                            		lv_question_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleMatching1963); 

                	newLeafNode(otherlv_3, grammarAccess.getMatchingAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:946:1: ( (lv_pairs_4_0= ruleMatchPair ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:947:1: (lv_pairs_4_0= ruleMatchPair )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:947:1: (lv_pairs_4_0= ruleMatchPair )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:948:3: lv_pairs_4_0= ruleMatchPair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMatchingAccess().getPairsMatchPairParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMatchPair_in_ruleMatching1984);
            	    lv_pairs_4_0=ruleMatchPair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMatchingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pairs",
            	            		lv_pairs_4_0, 
            	            		"MatchPair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleMatching1997); 

                	newLeafNode(otherlv_5, grammarAccess.getMatchingAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:976:1: entryRuleMatchPair returns [EObject current=null] : iv_ruleMatchPair= ruleMatchPair EOF ;
    public final EObject entryRuleMatchPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchPair = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:977:2: (iv_ruleMatchPair= ruleMatchPair EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:978:2: iv_ruleMatchPair= ruleMatchPair EOF
            {
             newCompositeNode(grammarAccess.getMatchPairRule()); 
            pushFollow(FOLLOW_ruleMatchPair_in_entryRuleMatchPair2033);
            iv_ruleMatchPair=ruleMatchPair();

            state._fsp--;

             current =iv_ruleMatchPair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchPair2043); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:985:1: ruleMatchPair returns [EObject current=null] : ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMatchPair() throws RecognitionException {
        EObject current = null;

        Token lv_matchQuestion_0_0=null;
        Token otherlv_1=null;
        Token lv_matchAnswer_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:988:28: ( ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:989:1: ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:989:1: ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:989:2: ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:989:2: ( (lv_matchQuestion_0_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:990:1: (lv_matchQuestion_0_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:990:1: (lv_matchQuestion_0_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:991:3: lv_matchQuestion_0_0= RULE_STRING
            {
            lv_matchQuestion_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatchPair2085); 

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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleMatchPair2102); 

                	newLeafNode(otherlv_1, grammarAccess.getMatchPairAccess().getEqualsSignKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1011:1: ( (lv_matchAnswer_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1012:1: (lv_matchAnswer_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1012:1: (lv_matchAnswer_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1013:3: lv_matchAnswer_2_0= RULE_STRING
            {
            lv_matchAnswer_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatchPair2119); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1037:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1038:2: (iv_ruleEvent= ruleEvent EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1039:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent2160);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent2170); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1046:1: ruleEvent returns [EObject current=null] : (otherlv_0= '@event' ( (lv_event_1_0= RULE_STRING ) ) ( (lv_time_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_event_1_0=null;
        Token lv_time_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1049:28: ( (otherlv_0= '@event' ( (lv_event_1_0= RULE_STRING ) ) ( (lv_time_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1050:1: (otherlv_0= '@event' ( (lv_event_1_0= RULE_STRING ) ) ( (lv_time_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1050:1: (otherlv_0= '@event' ( (lv_event_1_0= RULE_STRING ) ) ( (lv_time_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1050:3: otherlv_0= '@event' ( (lv_event_1_0= RULE_STRING ) ) ( (lv_time_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleEvent2207); 

                	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1054:1: ( (lv_event_1_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1055:1: (lv_event_1_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1055:1: (lv_event_1_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1056:3: lv_event_1_0= RULE_STRING
            {
            lv_event_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent2224); 

            			newLeafNode(lv_event_1_0, grammarAccess.getEventAccess().getEventSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"event",
                    		lv_event_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1072:2: ( (lv_time_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1073:1: (lv_time_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1073:1: (lv_time_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1074:3: lv_time_2_0= RULE_STRING
            {
            lv_time_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent2246); 

            			newLeafNode(lv_time_2_0, grammarAccess.getEventAccess().getTimeSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"time",
                    		lv_time_2_0, 
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1098:1: entryRuleTrueFalse returns [EObject current=null] : iv_ruleTrueFalse= ruleTrueFalse EOF ;
    public final EObject entryRuleTrueFalse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueFalse = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1099:2: (iv_ruleTrueFalse= ruleTrueFalse EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1100:2: iv_ruleTrueFalse= ruleTrueFalse EOF
            {
             newCompositeNode(grammarAccess.getTrueFalseRule()); 
            pushFollow(FOLLOW_ruleTrueFalse_in_entryRuleTrueFalse2287);
            iv_ruleTrueFalse=ruleTrueFalse();

            state._fsp--;

             current =iv_ruleTrueFalse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrueFalse2297); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1107:1: ruleTrueFalse returns [EObject current=null] : (otherlv_0= '@true_false' ( (lv_statement_1_0= RULE_STRING ) ) ( (lv_truthValue_2_0= RULE_BOOL ) ) ( (lv_justification_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleTrueFalse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_statement_1_0=null;
        Token lv_truthValue_2_0=null;
        Token lv_justification_3_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1110:28: ( (otherlv_0= '@true_false' ( (lv_statement_1_0= RULE_STRING ) ) ( (lv_truthValue_2_0= RULE_BOOL ) ) ( (lv_justification_3_0= RULE_STRING ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1111:1: (otherlv_0= '@true_false' ( (lv_statement_1_0= RULE_STRING ) ) ( (lv_truthValue_2_0= RULE_BOOL ) ) ( (lv_justification_3_0= RULE_STRING ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1111:1: (otherlv_0= '@true_false' ( (lv_statement_1_0= RULE_STRING ) ) ( (lv_truthValue_2_0= RULE_BOOL ) ) ( (lv_justification_3_0= RULE_STRING ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1111:3: otherlv_0= '@true_false' ( (lv_statement_1_0= RULE_STRING ) ) ( (lv_truthValue_2_0= RULE_BOOL ) ) ( (lv_justification_3_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleTrueFalse2334); 

                	newLeafNode(otherlv_0, grammarAccess.getTrueFalseAccess().getTrue_falseKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1115:1: ( (lv_statement_1_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1116:1: (lv_statement_1_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1116:1: (lv_statement_1_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1117:3: lv_statement_1_0= RULE_STRING
            {
            lv_statement_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTrueFalse2351); 

            			newLeafNode(lv_statement_1_0, grammarAccess.getTrueFalseAccess().getStatementSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTrueFalseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"statement",
                    		lv_statement_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1133:2: ( (lv_truthValue_2_0= RULE_BOOL ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1134:1: (lv_truthValue_2_0= RULE_BOOL )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1134:1: (lv_truthValue_2_0= RULE_BOOL )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1135:3: lv_truthValue_2_0= RULE_BOOL
            {
            lv_truthValue_2_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleTrueFalse2373); 

            			newLeafNode(lv_truthValue_2_0, grammarAccess.getTrueFalseAccess().getTruthValueBOOLTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTrueFalseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"truthValue",
                    		lv_truthValue_2_0, 
                    		"BOOL");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1151:2: ( (lv_justification_3_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1152:1: (lv_justification_3_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1152:1: (lv_justification_3_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1153:3: lv_justification_3_0= RULE_STRING
                    {
                    lv_justification_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTrueFalse2395); 

                    			newLeafNode(lv_justification_3_0, grammarAccess.getTrueFalseAccess().getJustificationSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTrueFalseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"justification",
                            		lv_justification_3_0, 
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1177:1: entryRuleChemEquation returns [EObject current=null] : iv_ruleChemEquation= ruleChemEquation EOF ;
    public final EObject entryRuleChemEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemEquation = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1178:2: (iv_ruleChemEquation= ruleChemEquation EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1179:2: iv_ruleChemEquation= ruleChemEquation EOF
            {
             newCompositeNode(grammarAccess.getChemEquationRule()); 
            pushFollow(FOLLOW_ruleChemEquation_in_entryRuleChemEquation2437);
            iv_ruleChemEquation=ruleChemEquation();

            state._fsp--;

             current =iv_ruleChemEquation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChemEquation2447); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1186:1: ruleChemEquation returns [EObject current=null] : (otherlv_0= '@chem_equation' ( (lv_equation_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) ) ( (lv_notes_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleChemEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_equation_1_0=null;
        Token lv_description_2_0=null;
        Token lv_notes_3_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1189:28: ( (otherlv_0= '@chem_equation' ( (lv_equation_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) ) ( (lv_notes_3_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1190:1: (otherlv_0= '@chem_equation' ( (lv_equation_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) ) ( (lv_notes_3_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1190:1: (otherlv_0= '@chem_equation' ( (lv_equation_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) ) ( (lv_notes_3_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1190:3: otherlv_0= '@chem_equation' ( (lv_equation_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) ) ( (lv_notes_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleChemEquation2484); 

                	newLeafNode(otherlv_0, grammarAccess.getChemEquationAccess().getChem_equationKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1194:1: ( (lv_equation_1_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1195:1: (lv_equation_1_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1195:1: (lv_equation_1_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1196:3: lv_equation_1_0= RULE_STRING
            {
            lv_equation_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation2501); 

            			newLeafNode(lv_equation_1_0, grammarAccess.getChemEquationAccess().getEquationSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChemEquationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"equation",
                    		lv_equation_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1212:2: ( (lv_description_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1213:1: (lv_description_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1213:1: (lv_description_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1214:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation2523); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1230:2: ( (lv_notes_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1231:1: (lv_notes_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1231:1: (lv_notes_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1232:3: lv_notes_3_0= RULE_STRING
            {
            lv_notes_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation2545); 

            			newLeafNode(lv_notes_3_0, grammarAccess.getChemEquationAccess().getNotesSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChemEquationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"notes",
                    		lv_notes_3_0, 
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
    // $ANTLR end "ruleChemEquation"


    // $ANTLR start "entryRuleChemCompound"
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1256:1: entryRuleChemCompound returns [EObject current=null] : iv_ruleChemCompound= ruleChemCompound EOF ;
    public final EObject entryRuleChemCompound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemCompound = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1257:2: (iv_ruleChemCompound= ruleChemCompound EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1258:2: iv_ruleChemCompound= ruleChemCompound EOF
            {
             newCompositeNode(grammarAccess.getChemCompoundRule()); 
            pushFollow(FOLLOW_ruleChemCompound_in_entryRuleChemCompound2586);
            iv_ruleChemCompound=ruleChemCompound();

            state._fsp--;

             current =iv_ruleChemCompound; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChemCompound2596); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1265:1: ruleChemCompound returns [EObject current=null] : (otherlv_0= '@chem_compound' ( (lv_symbol_1_0= RULE_STRING ) ) ( (lv_chemicalName_2_0= RULE_STRING ) ) ( (lv_commonName_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleChemCompound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_symbol_1_0=null;
        Token lv_chemicalName_2_0=null;
        Token lv_commonName_3_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1268:28: ( (otherlv_0= '@chem_compound' ( (lv_symbol_1_0= RULE_STRING ) ) ( (lv_chemicalName_2_0= RULE_STRING ) ) ( (lv_commonName_3_0= RULE_STRING ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1269:1: (otherlv_0= '@chem_compound' ( (lv_symbol_1_0= RULE_STRING ) ) ( (lv_chemicalName_2_0= RULE_STRING ) ) ( (lv_commonName_3_0= RULE_STRING ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1269:1: (otherlv_0= '@chem_compound' ( (lv_symbol_1_0= RULE_STRING ) ) ( (lv_chemicalName_2_0= RULE_STRING ) ) ( (lv_commonName_3_0= RULE_STRING ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1269:3: otherlv_0= '@chem_compound' ( (lv_symbol_1_0= RULE_STRING ) ) ( (lv_chemicalName_2_0= RULE_STRING ) ) ( (lv_commonName_3_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleChemCompound2633); 

                	newLeafNode(otherlv_0, grammarAccess.getChemCompoundAccess().getChem_compoundKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1273:1: ( (lv_symbol_1_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1274:1: (lv_symbol_1_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1274:1: (lv_symbol_1_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1275:3: lv_symbol_1_0= RULE_STRING
            {
            lv_symbol_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemCompound2650); 

            			newLeafNode(lv_symbol_1_0, grammarAccess.getChemCompoundAccess().getSymbolSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChemCompoundRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"symbol",
                    		lv_symbol_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1291:2: ( (lv_chemicalName_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1292:1: (lv_chemicalName_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1292:1: (lv_chemicalName_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1293:3: lv_chemicalName_2_0= RULE_STRING
            {
            lv_chemicalName_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemCompound2672); 

            			newLeafNode(lv_chemicalName_2_0, grammarAccess.getChemCompoundAccess().getChemicalNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChemCompoundRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"chemicalName",
                    		lv_chemicalName_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1309:2: ( (lv_commonName_3_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1310:1: (lv_commonName_3_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1310:1: (lv_commonName_3_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1311:3: lv_commonName_3_0= RULE_STRING
                    {
                    lv_commonName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemCompound2694); 

                    			newLeafNode(lv_commonName_3_0, grammarAccess.getChemCompoundAccess().getCommonNameSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemCompoundRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"commonName",
                            		lv_commonName_3_0, 
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1335:1: entryRuleSpellbee returns [EObject current=null] : iv_ruleSpellbee= ruleSpellbee EOF ;
    public final EObject entryRuleSpellbee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpellbee = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1336:2: (iv_ruleSpellbee= ruleSpellbee EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1337:2: iv_ruleSpellbee= ruleSpellbee EOF
            {
             newCompositeNode(grammarAccess.getSpellbeeRule()); 
            pushFollow(FOLLOW_ruleSpellbee_in_entryRuleSpellbee2736);
            iv_ruleSpellbee=ruleSpellbee();

            state._fsp--;

             current =iv_ruleSpellbee; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpellbee2746); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1344:1: ruleSpellbee returns [EObject current=null] : (otherlv_0= '@spellbee' ( (lv_word_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSpellbee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_word_1_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1347:28: ( (otherlv_0= '@spellbee' ( (lv_word_1_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1348:1: (otherlv_0= '@spellbee' ( (lv_word_1_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1348:1: (otherlv_0= '@spellbee' ( (lv_word_1_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1348:3: otherlv_0= '@spellbee' ( (lv_word_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleSpellbee2783); 

                	newLeafNode(otherlv_0, grammarAccess.getSpellbeeAccess().getSpellbeeKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1352:1: ( (lv_word_1_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1353:1: (lv_word_1_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1353:1: (lv_word_1_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1354:3: lv_word_1_0= RULE_STRING
            {
            lv_word_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpellbee2800); 

            			newLeafNode(lv_word_1_0, grammarAccess.getSpellbeeAccess().getWordSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpellbeeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"word",
                    		lv_word_1_0, 
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1378:1: entryRuleImageLabel returns [EObject current=null] : iv_ruleImageLabel= ruleImageLabel EOF ;
    public final EObject entryRuleImageLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageLabel = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1379:2: (iv_ruleImageLabel= ruleImageLabel EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1380:2: iv_ruleImageLabel= ruleImageLabel EOF
            {
             newCompositeNode(grammarAccess.getImageLabelRule()); 
            pushFollow(FOLLOW_ruleImageLabel_in_entryRuleImageLabel2841);
            iv_ruleImageLabel=ruleImageLabel();

            state._fsp--;

             current =iv_ruleImageLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageLabel2851); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1387:1: ruleImageLabel returns [EObject current=null] : (otherlv_0= '@image_label' ( (lv_caption_1_0= RULE_STRING ) )? otherlv_2= '{' otherlv_3= 'imageName' ( (lv_imageName_4_0= RULE_STRING ) ) ( (lv_hotspots_5_0= ruleHotSpot ) ) (otherlv_6= ',' ( (lv_hotspots_7_0= ruleHotSpot ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleImageLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_caption_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_imageName_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_hotspots_5_0 = null;

        EObject lv_hotspots_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1390:28: ( (otherlv_0= '@image_label' ( (lv_caption_1_0= RULE_STRING ) )? otherlv_2= '{' otherlv_3= 'imageName' ( (lv_imageName_4_0= RULE_STRING ) ) ( (lv_hotspots_5_0= ruleHotSpot ) ) (otherlv_6= ',' ( (lv_hotspots_7_0= ruleHotSpot ) ) )* otherlv_8= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1391:1: (otherlv_0= '@image_label' ( (lv_caption_1_0= RULE_STRING ) )? otherlv_2= '{' otherlv_3= 'imageName' ( (lv_imageName_4_0= RULE_STRING ) ) ( (lv_hotspots_5_0= ruleHotSpot ) ) (otherlv_6= ',' ( (lv_hotspots_7_0= ruleHotSpot ) ) )* otherlv_8= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1391:1: (otherlv_0= '@image_label' ( (lv_caption_1_0= RULE_STRING ) )? otherlv_2= '{' otherlv_3= 'imageName' ( (lv_imageName_4_0= RULE_STRING ) ) ( (lv_hotspots_5_0= ruleHotSpot ) ) (otherlv_6= ',' ( (lv_hotspots_7_0= ruleHotSpot ) ) )* otherlv_8= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1391:3: otherlv_0= '@image_label' ( (lv_caption_1_0= RULE_STRING ) )? otherlv_2= '{' otherlv_3= 'imageName' ( (lv_imageName_4_0= RULE_STRING ) ) ( (lv_hotspots_5_0= ruleHotSpot ) ) (otherlv_6= ',' ( (lv_hotspots_7_0= ruleHotSpot ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleImageLabel2888); 

                	newLeafNode(otherlv_0, grammarAccess.getImageLabelAccess().getImage_labelKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1395:1: ( (lv_caption_1_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1396:1: (lv_caption_1_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1396:1: (lv_caption_1_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1397:3: lv_caption_1_0= RULE_STRING
                    {
                    lv_caption_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageLabel2905); 

                    			newLeafNode(lv_caption_1_0, grammarAccess.getImageLabelAccess().getCaptionSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"caption",
                            		lv_caption_1_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleImageLabel2923); 

                	newLeafNode(otherlv_2, grammarAccess.getImageLabelAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleImageLabel2935); 

                	newLeafNode(otherlv_3, grammarAccess.getImageLabelAccess().getImageNameKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1421:1: ( (lv_imageName_4_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1422:1: (lv_imageName_4_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1422:1: (lv_imageName_4_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1423:3: lv_imageName_4_0= RULE_STRING
            {
            lv_imageName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageLabel2952); 

            			newLeafNode(lv_imageName_4_0, grammarAccess.getImageLabelAccess().getImageNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"imageName",
                    		lv_imageName_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1439:2: ( (lv_hotspots_5_0= ruleHotSpot ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1440:1: (lv_hotspots_5_0= ruleHotSpot )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1440:1: (lv_hotspots_5_0= ruleHotSpot )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1441:3: lv_hotspots_5_0= ruleHotSpot
            {
             
            	        newCompositeNode(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleHotSpot_in_ruleImageLabel2978);
            lv_hotspots_5_0=ruleHotSpot();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImageLabelRule());
            	        }
                   		add(
                   			current, 
                   			"hotspots",
                    		lv_hotspots_5_0, 
                    		"HotSpot");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1457:2: (otherlv_6= ',' ( (lv_hotspots_7_0= ruleHotSpot ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1457:4: otherlv_6= ',' ( (lv_hotspots_7_0= ruleHotSpot ) )
            	    {
            	    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleImageLabel2991); 

            	        	newLeafNode(otherlv_6, grammarAccess.getImageLabelAccess().getCommaKeyword_6_0());
            	        
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1461:1: ( (lv_hotspots_7_0= ruleHotSpot ) )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1462:1: (lv_hotspots_7_0= ruleHotSpot )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1462:1: (lv_hotspots_7_0= ruleHotSpot )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1463:3: lv_hotspots_7_0= ruleHotSpot
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHotSpot_in_ruleImageLabel3012);
            	    lv_hotspots_7_0=ruleHotSpot();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageLabelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hotspots",
            	            		lv_hotspots_7_0, 
            	            		"HotSpot");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleImageLabel3026); 

                	newLeafNode(otherlv_8, grammarAccess.getImageLabelAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1491:1: entryRuleHotSpot returns [EObject current=null] : iv_ruleHotSpot= ruleHotSpot EOF ;
    public final EObject entryRuleHotSpot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHotSpot = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1492:2: (iv_ruleHotSpot= ruleHotSpot EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1493:2: iv_ruleHotSpot= ruleHotSpot EOF
            {
             newCompositeNode(grammarAccess.getHotSpotRule()); 
            pushFollow(FOLLOW_ruleHotSpot_in_entryRuleHotSpot3062);
            iv_ruleHotSpot=ruleHotSpot();

            state._fsp--;

             current =iv_ruleHotSpot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHotSpot3072); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1500:1: ruleHotSpot returns [EObject current=null] : ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleHotSpot() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;
        Token otherlv_1=null;
        Token lv_y_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1503:28: ( ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1504:1: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1504:1: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1504:2: ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1504:2: ( (lv_x_0_0= RULE_INT ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1505:1: (lv_x_0_0= RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1505:1: (lv_x_0_0= RULE_INT )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1506:3: lv_x_0_0= RULE_INT
            {
            lv_x_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHotSpot3114); 

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

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleHotSpot3131); 

                	newLeafNode(otherlv_1, grammarAccess.getHotSpotAccess().getCommaKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1526:1: ( (lv_y_2_0= RULE_INT ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1527:1: (lv_y_2_0= RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1527:1: (lv_y_2_0= RULE_INT )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1528:3: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHotSpot3148); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleHotSpot3165); 

                	newLeafNode(otherlv_3, grammarAccess.getHotSpotAccess().getEqualsSignKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1548:1: ( (lv_label_4_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1549:1: (lv_label_4_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1549:1: (lv_label_4_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1550:3: lv_label_4_0= RULE_STRING
            {
            lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHotSpot3182); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1574:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1575:2: (iv_ruleEquation= ruleEquation EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1576:2: iv_ruleEquation= ruleEquation EOF
            {
             newCompositeNode(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_ruleEquation_in_entryRuleEquation3223);
            iv_ruleEquation=ruleEquation();

            state._fsp--;

             current =iv_ruleEquation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquation3233); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1583:1: ruleEquation returns [EObject current=null] : (otherlv_0= '@equation' ( (lv_equation_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= 'where' ( (lv_symbols_5_0= ruleEqSymbol ) ) (otherlv_6= ',' ( (lv_symbols_7_0= ruleEqSymbol ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_equation_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_symbols_5_0 = null;

        EObject lv_symbols_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1586:28: ( (otherlv_0= '@equation' ( (lv_equation_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= 'where' ( (lv_symbols_5_0= ruleEqSymbol ) ) (otherlv_6= ',' ( (lv_symbols_7_0= ruleEqSymbol ) ) )* otherlv_8= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1587:1: (otherlv_0= '@equation' ( (lv_equation_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= 'where' ( (lv_symbols_5_0= ruleEqSymbol ) ) (otherlv_6= ',' ( (lv_symbols_7_0= ruleEqSymbol ) ) )* otherlv_8= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1587:1: (otherlv_0= '@equation' ( (lv_equation_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= 'where' ( (lv_symbols_5_0= ruleEqSymbol ) ) (otherlv_6= ',' ( (lv_symbols_7_0= ruleEqSymbol ) ) )* otherlv_8= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1587:3: otherlv_0= '@equation' ( (lv_equation_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= 'where' ( (lv_symbols_5_0= ruleEqSymbol ) ) (otherlv_6= ',' ( (lv_symbols_7_0= ruleEqSymbol ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleEquation3270); 

                	newLeafNode(otherlv_0, grammarAccess.getEquationAccess().getEquationKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1591:1: ( (lv_equation_1_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1592:1: (lv_equation_1_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1592:1: (lv_equation_1_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1593:3: lv_equation_1_0= RULE_STRING
            {
            lv_equation_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEquation3287); 

            			newLeafNode(lv_equation_1_0, grammarAccess.getEquationAccess().getEquationSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEquationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"equation",
                    		lv_equation_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleEquation3304); 

                	newLeafNode(otherlv_2, grammarAccess.getEquationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1613:1: ( (lv_description_3_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1614:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1614:1: (lv_description_3_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1615:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEquation3321); 

                    			newLeafNode(lv_description_3_0, grammarAccess.getEquationAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEquationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_3_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleEquation3339); 

                	newLeafNode(otherlv_4, grammarAccess.getEquationAccess().getWhereKeyword_4());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1635:1: ( (lv_symbols_5_0= ruleEqSymbol ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1636:1: (lv_symbols_5_0= ruleEqSymbol )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1636:1: (lv_symbols_5_0= ruleEqSymbol )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1637:3: lv_symbols_5_0= ruleEqSymbol
            {
             
            	        newCompositeNode(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEqSymbol_in_ruleEquation3360);
            lv_symbols_5_0=ruleEqSymbol();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEquationRule());
            	        }
                   		add(
                   			current, 
                   			"symbols",
                    		lv_symbols_5_0, 
                    		"EqSymbol");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1653:2: (otherlv_6= ',' ( (lv_symbols_7_0= ruleEqSymbol ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1653:4: otherlv_6= ',' ( (lv_symbols_7_0= ruleEqSymbol ) )
            	    {
            	    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleEquation3373); 

            	        	newLeafNode(otherlv_6, grammarAccess.getEquationAccess().getCommaKeyword_6_0());
            	        
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1657:1: ( (lv_symbols_7_0= ruleEqSymbol ) )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1658:1: (lv_symbols_7_0= ruleEqSymbol )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1658:1: (lv_symbols_7_0= ruleEqSymbol )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1659:3: lv_symbols_7_0= ruleEqSymbol
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqSymbol_in_ruleEquation3394);
            	    lv_symbols_7_0=ruleEqSymbol();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEquationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"symbols",
            	            		lv_symbols_7_0, 
            	            		"EqSymbol");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleEquation3408); 

                	newLeafNode(otherlv_8, grammarAccess.getEquationAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1687:1: entryRuleEqSymbol returns [EObject current=null] : iv_ruleEqSymbol= ruleEqSymbol EOF ;
    public final EObject entryRuleEqSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqSymbol = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1688:2: (iv_ruleEqSymbol= ruleEqSymbol EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1689:2: iv_ruleEqSymbol= ruleEqSymbol EOF
            {
             newCompositeNode(grammarAccess.getEqSymbolRule()); 
            pushFollow(FOLLOW_ruleEqSymbol_in_entryRuleEqSymbol3444);
            iv_ruleEqSymbol=ruleEqSymbol();

            state._fsp--;

             current =iv_ruleEqSymbol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqSymbol3454); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1696:1: ruleEqSymbol returns [EObject current=null] : ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEqSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1699:28: ( ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1700:1: ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1700:1: ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1700:2: ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1700:2: ( (lv_symbol_0_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1701:1: (lv_symbol_0_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1701:1: (lv_symbol_0_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1702:3: lv_symbol_0_0= RULE_STRING
            {
            lv_symbol_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqSymbol3496); 

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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleEqSymbol3513); 

                	newLeafNode(otherlv_1, grammarAccess.getEqSymbolAccess().getEqualsSignKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1722:1: ( (lv_description_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1723:1: (lv_description_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1723:1: (lv_description_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1724:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqSymbol3530); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1748:1: entryRuleRefToContext returns [EObject current=null] : iv_ruleRefToContext= ruleRefToContext EOF ;
    public final EObject entryRuleRefToContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefToContext = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1749:2: (iv_ruleRefToContext= ruleRefToContext EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1750:2: iv_ruleRefToContext= ruleRefToContext EOF
            {
             newCompositeNode(grammarAccess.getRefToContextRule()); 
            pushFollow(FOLLOW_ruleRefToContext_in_entryRuleRefToContext3571);
            iv_ruleRefToContext=ruleRefToContext();

            state._fsp--;

             current =iv_ruleRefToContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefToContext3581); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1757:1: ruleRefToContext returns [EObject current=null] : (otherlv_0= '@rtc' otherlv_1= '{' otherlv_2= 'context' ( (lv_context_3_0= RULE_STRING ) ) ( (lv_questions_4_0= ruleQuestionAnswer ) )+ otherlv_5= '}' ) ;
    public final EObject ruleRefToContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_context_3_0=null;
        Token otherlv_5=null;
        EObject lv_questions_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1760:28: ( (otherlv_0= '@rtc' otherlv_1= '{' otherlv_2= 'context' ( (lv_context_3_0= RULE_STRING ) ) ( (lv_questions_4_0= ruleQuestionAnswer ) )+ otherlv_5= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1761:1: (otherlv_0= '@rtc' otherlv_1= '{' otherlv_2= 'context' ( (lv_context_3_0= RULE_STRING ) ) ( (lv_questions_4_0= ruleQuestionAnswer ) )+ otherlv_5= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1761:1: (otherlv_0= '@rtc' otherlv_1= '{' otherlv_2= 'context' ( (lv_context_3_0= RULE_STRING ) ) ( (lv_questions_4_0= ruleQuestionAnswer ) )+ otherlv_5= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1761:3: otherlv_0= '@rtc' otherlv_1= '{' otherlv_2= 'context' ( (lv_context_3_0= RULE_STRING ) ) ( (lv_questions_4_0= ruleQuestionAnswer ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleRefToContext3618); 

                	newLeafNode(otherlv_0, grammarAccess.getRefToContextAccess().getRtcKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleRefToContext3630); 

                	newLeafNode(otherlv_1, grammarAccess.getRefToContextAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleRefToContext3642); 

                	newLeafNode(otherlv_2, grammarAccess.getRefToContextAccess().getContextKeyword_2());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1773:1: ( (lv_context_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1774:1: (lv_context_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1774:1: (lv_context_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1775:3: lv_context_3_0= RULE_STRING
            {
            lv_context_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRefToContext3659); 

            			newLeafNode(lv_context_3_0, grammarAccess.getRefToContextAccess().getContextSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRefToContextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"context",
                    		lv_context_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1791:2: ( (lv_questions_4_0= ruleQuestionAnswer ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==19) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1792:1: (lv_questions_4_0= ruleQuestionAnswer )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1792:1: (lv_questions_4_0= ruleQuestionAnswer )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1793:3: lv_questions_4_0= ruleQuestionAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefToContextAccess().getQuestionsQuestionAnswerParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestionAnswer_in_ruleRefToContext3685);
            	    lv_questions_4_0=ruleQuestionAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRefToContextRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_4_0, 
            	            		"QuestionAnswer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleRefToContext3698); 

                	newLeafNode(otherlv_5, grammarAccess.getRefToContextAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1821:1: entryRuleCMap returns [EObject current=null] : iv_ruleCMap= ruleCMap EOF ;
    public final EObject entryRuleCMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCMap = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1822:2: (iv_ruleCMap= ruleCMap EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1823:2: iv_ruleCMap= ruleCMap EOF
            {
             newCompositeNode(grammarAccess.getCMapRule()); 
            pushFollow(FOLLOW_ruleCMap_in_entryRuleCMap3734);
            iv_ruleCMap=ruleCMap();

            state._fsp--;

             current =iv_ruleCMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCMap3744); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1830:1: ruleCMap returns [EObject current=null] : (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleCMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1833:28: ( (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1834:1: (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1834:1: (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1834:3: otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleCMap3781); 

                	newLeafNode(otherlv_0, grammarAccess.getCMapAccess().getCmapKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleCMap3793); 

                	newLeafNode(otherlv_1, grammarAccess.getCMapAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1842:1: ( (lv_content_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1843:1: (lv_content_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1843:1: (lv_content_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1844:3: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCMap3810); 

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

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleCMap3827); 

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
    public static final BitSet FOLLOW_ruleProcessingHints_in_ruleJoveNotes131 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleChapterDetails_in_ruleJoveNotes153 = new BitSet(new long[]{0x000000A7E1FC0002L});
    public static final BitSet FOLLOW_ruleNotesElement_in_ruleJoveNotes174 = new BitSet(new long[]{0x000000A7E1FC0002L});
    public static final BitSet FOLLOW_ruleProcessingHints_in_entryRuleProcessingHints211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessingHints221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleProcessingHints263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapterDetails_in_entryRuleChapterDetails311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChapterDetails321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleChapterDetails364 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleChapterDetails390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChapterDetails407 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleChapterDetails424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleChapterDetails441 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleChapterDetails458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleChapterDetails475 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleChapterDetails492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChapterDetails509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotesElement_in_entryRuleNotesElement550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotesElement560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMeaning_in_ruleNotesElement607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_ruleNotesElement634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFIB_in_ruleNotesElement661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleNotesElement688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_ruleNotesElement715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeacherNote_in_ruleNotesElement742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatching_in_ruleNotesElement769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleNotesElement796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueFalse_in_ruleNotesElement823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemEquation_in_ruleNotesElement850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemCompound_in_ruleNotesElement877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpellbee_in_ruleNotesElement904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageLabel_in_ruleNotesElement931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_ruleNotesElement958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefToContext_in_ruleNotesElement985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMeaning_in_entryRuleWordMeaning1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordMeaning1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleWordMeaning1067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWordMeaning1084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWordMeaning1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_entryRuleQuestionAnswer1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionAnswer1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleQuestionAnswer1194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestionAnswer1211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestionAnswer1233 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleQuestionAnswer1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFIB_in_entryRuleFIB1296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFIB1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFIB1343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFIB1360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFIB1382 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition1424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDefinition1471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefinition1488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefinition1510 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleDefinition1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_entryRuleCharacter1573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharacter1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCharacter1620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharacter1637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharacter1659 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleCharacter1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeacherNote_in_entryRuleTeacherNote1722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTeacherNote1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTeacherNote1769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTeacherNote1786 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleTeacherNote1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatching_in_entryRuleMatching1849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatching1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleMatching1896 = new BitSet(new long[]{0x0000000006000010L});
    public static final BitSet FOLLOW_25_in_ruleMatching1914 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatching1945 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMatching1963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMatchPair_in_ruleMatching1984 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_ruleMatching1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchPair_in_entryRuleMatchPair2033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchPair2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatchPair2085 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMatchPair2102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatchPair2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent2160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleEvent2207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent2224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueFalse_in_entryRuleTrueFalse2287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrueFalse2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTrueFalse2334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTrueFalse2351 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleTrueFalse2373 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTrueFalse2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemEquation_in_entryRuleChemEquation2437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChemEquation2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleChemEquation2484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation2501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation2523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemCompound_in_entryRuleChemCompound2586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChemCompound2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleChemCompound2633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemCompound2650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemCompound2672 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemCompound2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpellbee_in_entryRuleSpellbee2736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpellbee2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSpellbee2783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpellbee2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageLabel_in_entryRuleImageLabel2841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageLabel2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleImageLabel2888 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageLabel2905 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleImageLabel2923 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleImageLabel2935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageLabel2952 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHotSpot_in_ruleImageLabel2978 = new BitSet(new long[]{0x0000001008000000L});
    public static final BitSet FOLLOW_36_in_ruleImageLabel2991 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHotSpot_in_ruleImageLabel3012 = new BitSet(new long[]{0x0000001008000000L});
    public static final BitSet FOLLOW_27_in_ruleImageLabel3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHotSpot_in_entryRuleHotSpot3062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHotSpot3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHotSpot3114 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleHotSpot3131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHotSpot3148 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleHotSpot3165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHotSpot3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation3223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquation3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleEquation3270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEquation3287 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEquation3304 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEquation3321 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleEquation3339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_ruleEquation3360 = new BitSet(new long[]{0x0000001008000000L});
    public static final BitSet FOLLOW_36_in_ruleEquation3373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_ruleEquation3394 = new BitSet(new long[]{0x0000001008000000L});
    public static final BitSet FOLLOW_27_in_ruleEquation3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_entryRuleEqSymbol3444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqSymbol3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqSymbol3496 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEqSymbol3513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqSymbol3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefToContext_in_entryRuleRefToContext3571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefToContext3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRefToContext3618 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRefToContext3630 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleRefToContext3642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRefToContext3659 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_ruleRefToContext3685 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_27_in_ruleRefToContext3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_entryRuleCMap3734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCMap3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCMap3781 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCMap3793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCMap3810 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCMap3827 = new BitSet(new long[]{0x0000000000000002L});

}