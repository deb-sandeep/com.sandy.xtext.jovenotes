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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@skip_generation'", "'@test_paper'", "'subject'", "'chapterNumber'", "'.'", "'chapterName'", "'@wm'", "'hide'", "'@qa'", "'@fib'", "'@definition'", "'@character'", "'@tn'", "'@match'", "'skip_reverse_question'", "'{'", "'}'", "'='", "'@event'", "'@true_false'", "'@chem_equation'", "'>'", "'@chem_compound'", "'@spellbee'", "'@image_label'", "'imageName'", "','", "'@equation'", "'where'", "'@rtc'", "'context'", "'cmap'"
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

                if ( (LA2_0==18||(LA2_0>=20 && LA2_0<=25)||(LA2_0>=30 && LA2_0<=32)||(LA2_0>=34 && LA2_0<=36)||LA2_0==39||LA2_0==41) ) {
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
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            case 23:
                {
                alt4=5;
                }
                break;
            case 24:
                {
                alt4=6;
                }
                break;
            case 25:
                {
                alt4=7;
                }
                break;
            case 30:
                {
                alt4=8;
                }
                break;
            case 31:
                {
                alt4=9;
                }
                break;
            case 32:
                {
                alt4=10;
                }
                break;
            case 34:
                {
                alt4=11;
                }
                break;
            case 35:
                {
                alt4=12;
                }
                break;
            case 36:
                {
                alt4=13;
                }
                break;
            case 39:
                {
                alt4=14;
                }
                break;
            case 41:
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:481:1: ruleWordMeaning returns [EObject current=null] : (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleWordMeaning() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_word_2_0=null;
        Token lv_meaning_3_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:484:28: ( (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:485:1: (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:485:1: (otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:485:3: otherlv_0= '@wm' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ( (lv_meaning_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleWordMeaning1067); 

                	newLeafNode(otherlv_0, grammarAccess.getWordMeaningAccess().getWmKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:489:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:490:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:490:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:491:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,19,FOLLOW_19_in_ruleWordMeaning1085); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWordMeaningRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:504:3: ( (lv_word_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:505:1: (lv_word_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:505:1: (lv_word_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:506:3: lv_word_2_0= RULE_STRING
            {
            lv_word_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWordMeaning1116); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:522:2: ( (lv_meaning_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:523:1: (lv_meaning_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:523:1: (lv_meaning_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:524:3: lv_meaning_3_0= RULE_STRING
            {
            lv_meaning_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWordMeaning1138); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:548:1: entryRuleQuestionAnswer returns [EObject current=null] : iv_ruleQuestionAnswer= ruleQuestionAnswer EOF ;
    public final EObject entryRuleQuestionAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionAnswer = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:549:2: (iv_ruleQuestionAnswer= ruleQuestionAnswer EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:550:2: iv_ruleQuestionAnswer= ruleQuestionAnswer EOF
            {
             newCompositeNode(grammarAccess.getQuestionAnswerRule()); 
            pushFollow(FOLLOW_ruleQuestionAnswer_in_entryRuleQuestionAnswer1179);
            iv_ruleQuestionAnswer=ruleQuestionAnswer();

            state._fsp--;

             current =iv_ruleQuestionAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionAnswer1189); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:557:1: ruleQuestionAnswer returns [EObject current=null] : (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answer_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleQuestionAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_question_2_0=null;
        Token lv_answer_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:560:28: ( (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answer_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:561:1: (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answer_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:561:1: (otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answer_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:561:3: otherlv_0= '@qa' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answer_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleQuestionAnswer1226); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAnswerAccess().getQaKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:565:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:566:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:566:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:567:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,19,FOLLOW_19_in_ruleQuestionAnswer1244); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionAnswerRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:580:3: ( (lv_question_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:581:1: (lv_question_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:581:1: (lv_question_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:582:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestionAnswer1275); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:598:2: ( (lv_answer_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:599:1: (lv_answer_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:599:1: (lv_answer_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:600:3: lv_answer_3_0= RULE_STRING
            {
            lv_answer_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestionAnswer1297); 

            			newLeafNode(lv_answer_3_0, grammarAccess.getQuestionAnswerAccess().getAnswerSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"answer",
                    		lv_answer_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:616:2: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==43) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:617:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:617:1: (lv_cmap_4_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:618:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionAnswerAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleQuestionAnswer1323);
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:642:1: entryRuleFIB returns [EObject current=null] : iv_ruleFIB= ruleFIB EOF ;
    public final EObject entryRuleFIB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFIB = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:643:2: (iv_ruleFIB= ruleFIB EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:644:2: iv_ruleFIB= ruleFIB EOF
            {
             newCompositeNode(grammarAccess.getFIBRule()); 
            pushFollow(FOLLOW_ruleFIB_in_entryRuleFIB1360);
            iv_ruleFIB=ruleFIB();

            state._fsp--;

             current =iv_ruleFIB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFIB1370); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:651:1: ruleFIB returns [EObject current=null] : (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ ) ;
    public final EObject ruleFIB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_question_2_0=null;
        Token lv_answers_3_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:654:28: ( (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:655:1: (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:655:1: (otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+ )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:655:3: otherlv_0= '@fib' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_question_2_0= RULE_STRING ) ) ( (lv_answers_3_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleFIB1407); 

                	newLeafNode(otherlv_0, grammarAccess.getFIBAccess().getFibKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:659:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:660:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:660:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:661:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,19,FOLLOW_19_in_ruleFIB1425); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFIBRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:674:3: ( (lv_question_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:675:1: (lv_question_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:675:1: (lv_question_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:676:3: lv_question_2_0= RULE_STRING
            {
            lv_question_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFIB1456); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:692:2: ( (lv_answers_3_0= RULE_STRING ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:693:1: (lv_answers_3_0= RULE_STRING )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:693:1: (lv_answers_3_0= RULE_STRING )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:694:3: lv_answers_3_0= RULE_STRING
            	    {
            	    lv_answers_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFIB1478); 

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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:718:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:719:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:720:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition1520);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition1530); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:727:1: ruleDefinition returns [EObject current=null] : (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_term_2_0=null;
        Token lv_definition_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:730:28: ( (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:731:1: (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:731:1: (otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:731:3: otherlv_0= '@definition' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_term_2_0= RULE_STRING ) ) ( (lv_definition_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleDefinition1567); 

                	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefinitionKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:735:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:736:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:736:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:737:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,19,FOLLOW_19_in_ruleDefinition1585); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:750:3: ( (lv_term_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:751:1: (lv_term_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:751:1: (lv_term_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:752:3: lv_term_2_0= RULE_STRING
            {
            lv_term_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefinition1616); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:768:2: ( (lv_definition_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:769:1: (lv_definition_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:769:1: (lv_definition_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:770:3: lv_definition_3_0= RULE_STRING
            {
            lv_definition_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefinition1638); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:786:2: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:787:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:787:1: (lv_cmap_4_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:788:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefinitionAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleDefinition1664);
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:812:1: entryRuleCharacter returns [EObject current=null] : iv_ruleCharacter= ruleCharacter EOF ;
    public final EObject entryRuleCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacter = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:813:2: (iv_ruleCharacter= ruleCharacter EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:814:2: iv_ruleCharacter= ruleCharacter EOF
            {
             newCompositeNode(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_ruleCharacter_in_entryRuleCharacter1701);
            iv_ruleCharacter=ruleCharacter();

            state._fsp--;

             current =iv_ruleCharacter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharacter1711); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:821:1: ruleCharacter returns [EObject current=null] : (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_character_2_0=null;
        Token lv_estimate_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:824:28: ( (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:825:1: (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:825:1: (otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:825:3: otherlv_0= '@character' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_character_2_0= RULE_STRING ) ) ( (lv_estimate_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleCharacter1748); 

                	newLeafNode(otherlv_0, grammarAccess.getCharacterAccess().getCharacterKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:829:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:830:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:830:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:831:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,19,FOLLOW_19_in_ruleCharacter1766); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCharacterRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:844:3: ( (lv_character_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:845:1: (lv_character_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:845:1: (lv_character_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:846:3: lv_character_2_0= RULE_STRING
            {
            lv_character_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharacter1797); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:862:2: ( (lv_estimate_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:863:1: (lv_estimate_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:863:1: (lv_estimate_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:864:3: lv_estimate_3_0= RULE_STRING
            {
            lv_estimate_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharacter1819); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:880:2: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:881:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:881:1: (lv_cmap_4_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:882:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleCharacter1845);
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:906:1: entryRuleTeacherNote returns [EObject current=null] : iv_ruleTeacherNote= ruleTeacherNote EOF ;
    public final EObject entryRuleTeacherNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeacherNote = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:907:2: (iv_ruleTeacherNote= ruleTeacherNote EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:908:2: iv_ruleTeacherNote= ruleTeacherNote EOF
            {
             newCompositeNode(grammarAccess.getTeacherNoteRule()); 
            pushFollow(FOLLOW_ruleTeacherNote_in_entryRuleTeacherNote1882);
            iv_ruleTeacherNote=ruleTeacherNote();

            state._fsp--;

             current =iv_ruleTeacherNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTeacherNote1892); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:915:1: ruleTeacherNote returns [EObject current=null] : (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) ;
    public final EObject ruleTeacherNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_caption_2_0=null;
        Token lv_note_3_0=null;
        EObject lv_cmap_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:918:28: ( (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:919:1: (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:919:1: (otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:919:3: otherlv_0= '@tn' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? ( (lv_note_3_0= RULE_STRING ) ) ( (lv_cmap_4_0= ruleCMap ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleTeacherNote1929); 

                	newLeafNode(otherlv_0, grammarAccess.getTeacherNoteAccess().getTnKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:923:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:924:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:924:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:925:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,19,FOLLOW_19_in_ruleTeacherNote1947); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTeacherNoteRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:938:3: ( (lv_caption_2_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_STRING) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:939:1: (lv_caption_2_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:939:1: (lv_caption_2_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:940:3: lv_caption_2_0= RULE_STRING
                    {
                    lv_caption_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTeacherNote1978); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:956:3: ( (lv_note_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:957:1: (lv_note_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:957:1: (lv_note_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:958:3: lv_note_3_0= RULE_STRING
            {
            lv_note_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTeacherNote2001); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:974:2: ( (lv_cmap_4_0= ruleCMap ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:975:1: (lv_cmap_4_0= ruleCMap )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:975:1: (lv_cmap_4_0= ruleCMap )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:976:3: lv_cmap_4_0= ruleCMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getTeacherNoteAccess().getCmapCMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCMap_in_ruleTeacherNote2027);
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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1000:1: entryRuleMatching returns [EObject current=null] : iv_ruleMatching= ruleMatching EOF ;
    public final EObject entryRuleMatching() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatching = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1001:2: (iv_ruleMatching= ruleMatching EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1002:2: iv_ruleMatching= ruleMatching EOF
            {
             newCompositeNode(grammarAccess.getMatchingRule()); 
            pushFollow(FOLLOW_ruleMatching_in_entryRuleMatching2064);
            iv_ruleMatching=ruleMatching();

            state._fsp--;

             current =iv_ruleMatching; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatching2074); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1009:1: ruleMatching returns [EObject current=null] : (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ otherlv_6= '}' ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1012:28: ( (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ otherlv_6= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1013:1: (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ otherlv_6= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1013:1: (otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ otherlv_6= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1013:3: otherlv_0= '@match' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )? ( (lv_question_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_pairs_5_0= ruleMatchPair ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleMatching2111); 

                	newLeafNode(otherlv_0, grammarAccess.getMatchingAccess().getMatchKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1017:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1018:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1018:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1019:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,19,FOLLOW_19_in_ruleMatching2129); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchingRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1032:3: ( (lv_skipReverseQuestion_2_0= 'skip_reverse_question' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1033:1: (lv_skipReverseQuestion_2_0= 'skip_reverse_question' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1033:1: (lv_skipReverseQuestion_2_0= 'skip_reverse_question' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1034:3: lv_skipReverseQuestion_2_0= 'skip_reverse_question'
                    {
                    lv_skipReverseQuestion_2_0=(Token)match(input,26,FOLLOW_26_in_ruleMatching2161); 

                            newLeafNode(lv_skipReverseQuestion_2_0, grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatchingRule());
                    	        }
                           		setWithLastConsumed(current, "skipReverseQuestion", lv_skipReverseQuestion_2_0, "skip_reverse_question");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1047:3: ( (lv_question_3_0= RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1048:1: (lv_question_3_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1048:1: (lv_question_3_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1049:3: lv_question_3_0= RULE_STRING
                    {
                    lv_question_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatching2192); 

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

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleMatching2210); 

                	newLeafNode(otherlv_4, grammarAccess.getMatchingAccess().getLeftCurlyBracketKeyword_4());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1069:1: ( (lv_pairs_5_0= ruleMatchPair ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1070:1: (lv_pairs_5_0= ruleMatchPair )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1070:1: (lv_pairs_5_0= ruleMatchPair )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1071:3: lv_pairs_5_0= ruleMatchPair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMatchingAccess().getPairsMatchPairParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMatchPair_in_ruleMatching2231);
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleMatching2244); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1099:1: entryRuleMatchPair returns [EObject current=null] : iv_ruleMatchPair= ruleMatchPair EOF ;
    public final EObject entryRuleMatchPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchPair = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1100:2: (iv_ruleMatchPair= ruleMatchPair EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1101:2: iv_ruleMatchPair= ruleMatchPair EOF
            {
             newCompositeNode(grammarAccess.getMatchPairRule()); 
            pushFollow(FOLLOW_ruleMatchPair_in_entryRuleMatchPair2280);
            iv_ruleMatchPair=ruleMatchPair();

            state._fsp--;

             current =iv_ruleMatchPair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchPair2290); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1108:1: ruleMatchPair returns [EObject current=null] : ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMatchPair() throws RecognitionException {
        EObject current = null;

        Token lv_matchQuestion_0_0=null;
        Token otherlv_1=null;
        Token lv_matchAnswer_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1111:28: ( ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1112:1: ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1112:1: ( ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1112:2: ( (lv_matchQuestion_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_matchAnswer_2_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1112:2: ( (lv_matchQuestion_0_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1113:1: (lv_matchQuestion_0_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1113:1: (lv_matchQuestion_0_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1114:3: lv_matchQuestion_0_0= RULE_STRING
            {
            lv_matchQuestion_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatchPair2332); 

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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleMatchPair2349); 

                	newLeafNode(otherlv_1, grammarAccess.getMatchPairAccess().getEqualsSignKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1134:1: ( (lv_matchAnswer_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1135:1: (lv_matchAnswer_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1135:1: (lv_matchAnswer_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1136:3: lv_matchAnswer_2_0= RULE_STRING
            {
            lv_matchAnswer_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatchPair2366); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1160:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1161:2: (iv_ruleEvent= ruleEvent EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1162:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent2407);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent2417); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1169:1: ruleEvent returns [EObject current=null] : (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_event_2_0=null;
        Token lv_time_3_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1172:28: ( (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1173:1: (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1173:1: (otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1173:3: otherlv_0= '@event' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_event_2_0= RULE_STRING ) ) ( (lv_time_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleEvent2454); 

                	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1177:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1178:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1178:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1179:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,19,FOLLOW_19_in_ruleEvent2472); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1192:3: ( (lv_event_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1193:1: (lv_event_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1193:1: (lv_event_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1194:3: lv_event_2_0= RULE_STRING
            {
            lv_event_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent2503); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1210:2: ( (lv_time_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1211:1: (lv_time_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1211:1: (lv_time_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1212:3: lv_time_3_0= RULE_STRING
            {
            lv_time_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent2525); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1236:1: entryRuleTrueFalse returns [EObject current=null] : iv_ruleTrueFalse= ruleTrueFalse EOF ;
    public final EObject entryRuleTrueFalse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueFalse = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1237:2: (iv_ruleTrueFalse= ruleTrueFalse EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1238:2: iv_ruleTrueFalse= ruleTrueFalse EOF
            {
             newCompositeNode(grammarAccess.getTrueFalseRule()); 
            pushFollow(FOLLOW_ruleTrueFalse_in_entryRuleTrueFalse2566);
            iv_ruleTrueFalse=ruleTrueFalse();

            state._fsp--;

             current =iv_ruleTrueFalse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrueFalse2576); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1245:1: ruleTrueFalse returns [EObject current=null] : (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleTrueFalse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_statement_2_0=null;
        Token lv_truthValue_3_0=null;
        Token lv_justification_4_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1248:28: ( (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1249:1: (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1249:1: (otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1249:3: otherlv_0= '@true_false' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_statement_2_0= RULE_STRING ) ) ( (lv_truthValue_3_0= RULE_BOOL ) ) ( (lv_justification_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleTrueFalse2613); 

                	newLeafNode(otherlv_0, grammarAccess.getTrueFalseAccess().getTrue_falseKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1253:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1254:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1254:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1255:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,19,FOLLOW_19_in_ruleTrueFalse2631); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTrueFalseRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1268:3: ( (lv_statement_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1269:1: (lv_statement_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1269:1: (lv_statement_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1270:3: lv_statement_2_0= RULE_STRING
            {
            lv_statement_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTrueFalse2662); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1286:2: ( (lv_truthValue_3_0= RULE_BOOL ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1287:1: (lv_truthValue_3_0= RULE_BOOL )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1287:1: (lv_truthValue_3_0= RULE_BOOL )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1288:3: lv_truthValue_3_0= RULE_BOOL
            {
            lv_truthValue_3_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleTrueFalse2684); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1304:2: ( (lv_justification_4_0= RULE_STRING ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1305:1: (lv_justification_4_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1305:1: (lv_justification_4_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1306:3: lv_justification_4_0= RULE_STRING
                    {
                    lv_justification_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTrueFalse2706); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1330:1: entryRuleChemEquation returns [EObject current=null] : iv_ruleChemEquation= ruleChemEquation EOF ;
    public final EObject entryRuleChemEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemEquation = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1331:2: (iv_ruleChemEquation= ruleChemEquation EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1332:2: iv_ruleChemEquation= ruleChemEquation EOF
            {
             newCompositeNode(grammarAccess.getChemEquationRule()); 
            pushFollow(FOLLOW_ruleChemEquation_in_entryRuleChemEquation2748);
            iv_ruleChemEquation=ruleChemEquation();

            state._fsp--;

             current =iv_ruleChemEquation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChemEquation2758); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1339:1: ruleChemEquation returns [EObject current=null] : (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1342:28: ( (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1343:1: (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1343:1: (otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1343:3: otherlv_0= '@chem_equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_reactants_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_produces_6_0= RULE_STRING ) )? otherlv_7= '>' ( (lv_products_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleChemEquation2795); 

                	newLeafNode(otherlv_0, grammarAccess.getChemEquationAccess().getChem_equationKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1347:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1348:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1348:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1349:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,19,FOLLOW_19_in_ruleChemEquation2813); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemEquationRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1362:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1363:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1363:1: (lv_description_2_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1364:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation2844); 

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

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleChemEquation2862); 

                	newLeafNode(otherlv_3, grammarAccess.getChemEquationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1384:1: ( (lv_reactants_4_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1385:1: (lv_reactants_4_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1385:1: (lv_reactants_4_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1386:3: lv_reactants_4_0= RULE_STRING
            {
            lv_reactants_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation2879); 

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

            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleChemEquation2896); 

                	newLeafNode(otherlv_5, grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_5());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1406:1: ( (lv_produces_6_0= RULE_STRING ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1407:1: (lv_produces_6_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1407:1: (lv_produces_6_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1408:3: lv_produces_6_0= RULE_STRING
                    {
                    lv_produces_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation2913); 

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

            otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleChemEquation2931); 

                	newLeafNode(otherlv_7, grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_7());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1428:1: ( (lv_products_8_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1429:1: (lv_products_8_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1429:1: (lv_products_8_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1430:3: lv_products_8_0= RULE_STRING
            {
            lv_products_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemEquation2948); 

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

            otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleChemEquation2965); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1458:1: entryRuleChemCompound returns [EObject current=null] : iv_ruleChemCompound= ruleChemCompound EOF ;
    public final EObject entryRuleChemCompound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemCompound = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1459:2: (iv_ruleChemCompound= ruleChemCompound EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1460:2: iv_ruleChemCompound= ruleChemCompound EOF
            {
             newCompositeNode(grammarAccess.getChemCompoundRule()); 
            pushFollow(FOLLOW_ruleChemCompound_in_entryRuleChemCompound3001);
            iv_ruleChemCompound=ruleChemCompound();

            state._fsp--;

             current =iv_ruleChemCompound; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChemCompound3011); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1467:1: ruleChemCompound returns [EObject current=null] : (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleChemCompound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_symbol_2_0=null;
        Token lv_chemicalName_3_0=null;
        Token lv_commonName_4_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1470:28: ( (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1471:1: (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1471:1: (otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )? )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1471:3: otherlv_0= '@chem_compound' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_symbol_2_0= RULE_STRING ) ) ( (lv_chemicalName_3_0= RULE_STRING ) ) ( (lv_commonName_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleChemCompound3048); 

                	newLeafNode(otherlv_0, grammarAccess.getChemCompoundAccess().getChem_compoundKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1475:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1476:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1476:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1477:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,19,FOLLOW_19_in_ruleChemCompound3066); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChemCompoundRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1490:3: ( (lv_symbol_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1491:1: (lv_symbol_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1491:1: (lv_symbol_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1492:3: lv_symbol_2_0= RULE_STRING
            {
            lv_symbol_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemCompound3097); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1508:2: ( (lv_chemicalName_3_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1509:1: (lv_chemicalName_3_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1509:1: (lv_chemicalName_3_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1510:3: lv_chemicalName_3_0= RULE_STRING
            {
            lv_chemicalName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemCompound3119); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1526:2: ( (lv_commonName_4_0= RULE_STRING ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1527:1: (lv_commonName_4_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1527:1: (lv_commonName_4_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1528:3: lv_commonName_4_0= RULE_STRING
                    {
                    lv_commonName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChemCompound3141); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1552:1: entryRuleSpellbee returns [EObject current=null] : iv_ruleSpellbee= ruleSpellbee EOF ;
    public final EObject entryRuleSpellbee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpellbee = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1553:2: (iv_ruleSpellbee= ruleSpellbee EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1554:2: iv_ruleSpellbee= ruleSpellbee EOF
            {
             newCompositeNode(grammarAccess.getSpellbeeRule()); 
            pushFollow(FOLLOW_ruleSpellbee_in_entryRuleSpellbee3183);
            iv_ruleSpellbee=ruleSpellbee();

            state._fsp--;

             current =iv_ruleSpellbee; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpellbee3193); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1561:1: ruleSpellbee returns [EObject current=null] : (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSpellbee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hideFromView_1_0=null;
        Token lv_word_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1564:28: ( (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1565:1: (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1565:1: (otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1565:3: otherlv_0= '@spellbee' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_word_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleSpellbee3230); 

                	newLeafNode(otherlv_0, grammarAccess.getSpellbeeAccess().getSpellbeeKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1569:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1570:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1570:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1571:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,19,FOLLOW_19_in_ruleSpellbee3248); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpellbeeRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1584:3: ( (lv_word_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1585:1: (lv_word_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1585:1: (lv_word_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1586:3: lv_word_2_0= RULE_STRING
            {
            lv_word_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpellbee3279); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1610:1: entryRuleImageLabel returns [EObject current=null] : iv_ruleImageLabel= ruleImageLabel EOF ;
    public final EObject entryRuleImageLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageLabel = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1611:2: (iv_ruleImageLabel= ruleImageLabel EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1612:2: iv_ruleImageLabel= ruleImageLabel EOF
            {
             newCompositeNode(grammarAccess.getImageLabelRule()); 
            pushFollow(FOLLOW_ruleImageLabel_in_entryRuleImageLabel3320);
            iv_ruleImageLabel=ruleImageLabel();

            state._fsp--;

             current =iv_ruleImageLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageLabel3330); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1619:1: ruleImageLabel returns [EObject current=null] : (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1622:28: ( (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1623:1: (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1623:1: (otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1623:3: otherlv_0= '@image_label' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'imageName' ( (lv_imageName_5_0= RULE_STRING ) ) ( (lv_hotspots_6_0= ruleHotSpot ) ) (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleImageLabel3367); 

                	newLeafNode(otherlv_0, grammarAccess.getImageLabelAccess().getImage_labelKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1627:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==19) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1628:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1628:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1629:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,19,FOLLOW_19_in_ruleImageLabel3385); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageLabelRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1642:3: ( (lv_caption_2_0= RULE_STRING ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1643:1: (lv_caption_2_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1643:1: (lv_caption_2_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1644:3: lv_caption_2_0= RULE_STRING
                    {
                    lv_caption_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageLabel3416); 

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

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleImageLabel3434); 

                	newLeafNode(otherlv_3, grammarAccess.getImageLabelAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleImageLabel3446); 

                	newLeafNode(otherlv_4, grammarAccess.getImageLabelAccess().getImageNameKeyword_4());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1668:1: ( (lv_imageName_5_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1669:1: (lv_imageName_5_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1669:1: (lv_imageName_5_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1670:3: lv_imageName_5_0= RULE_STRING
            {
            lv_imageName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageLabel3463); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1686:2: ( (lv_hotspots_6_0= ruleHotSpot ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1687:1: (lv_hotspots_6_0= ruleHotSpot )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1687:1: (lv_hotspots_6_0= ruleHotSpot )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1688:3: lv_hotspots_6_0= ruleHotSpot
            {
             
            	        newCompositeNode(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleHotSpot_in_ruleImageLabel3489);
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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1704:2: (otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==38) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1704:4: otherlv_7= ',' ( (lv_hotspots_8_0= ruleHotSpot ) )
            	    {
            	    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleImageLabel3502); 

            	        	newLeafNode(otherlv_7, grammarAccess.getImageLabelAccess().getCommaKeyword_7_0());
            	        
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1708:1: ( (lv_hotspots_8_0= ruleHotSpot ) )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1709:1: (lv_hotspots_8_0= ruleHotSpot )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1709:1: (lv_hotspots_8_0= ruleHotSpot )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1710:3: lv_hotspots_8_0= ruleHotSpot
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHotSpot_in_ruleImageLabel3523);
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
            	    break loop32;
                }
            } while (true);

            otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleImageLabel3537); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1738:1: entryRuleHotSpot returns [EObject current=null] : iv_ruleHotSpot= ruleHotSpot EOF ;
    public final EObject entryRuleHotSpot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHotSpot = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1739:2: (iv_ruleHotSpot= ruleHotSpot EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1740:2: iv_ruleHotSpot= ruleHotSpot EOF
            {
             newCompositeNode(grammarAccess.getHotSpotRule()); 
            pushFollow(FOLLOW_ruleHotSpot_in_entryRuleHotSpot3573);
            iv_ruleHotSpot=ruleHotSpot();

            state._fsp--;

             current =iv_ruleHotSpot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHotSpot3583); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1747:1: ruleHotSpot returns [EObject current=null] : ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleHotSpot() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;
        Token otherlv_1=null;
        Token lv_y_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1750:28: ( ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1751:1: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1751:1: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1751:2: ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) otherlv_3= '=' ( (lv_label_4_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1751:2: ( (lv_x_0_0= RULE_INT ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1752:1: (lv_x_0_0= RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1752:1: (lv_x_0_0= RULE_INT )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1753:3: lv_x_0_0= RULE_INT
            {
            lv_x_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHotSpot3625); 

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

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleHotSpot3642); 

                	newLeafNode(otherlv_1, grammarAccess.getHotSpotAccess().getCommaKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1773:1: ( (lv_y_2_0= RULE_INT ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1774:1: (lv_y_2_0= RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1774:1: (lv_y_2_0= RULE_INT )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1775:3: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHotSpot3659); 

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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleHotSpot3676); 

                	newLeafNode(otherlv_3, grammarAccess.getHotSpotAccess().getEqualsSignKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1795:1: ( (lv_label_4_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1796:1: (lv_label_4_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1796:1: (lv_label_4_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1797:3: lv_label_4_0= RULE_STRING
            {
            lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHotSpot3693); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1821:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1822:2: (iv_ruleEquation= ruleEquation EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1823:2: iv_ruleEquation= ruleEquation EOF
            {
             newCompositeNode(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_ruleEquation_in_entryRuleEquation3734);
            iv_ruleEquation=ruleEquation();

            state._fsp--;

             current =iv_ruleEquation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquation3744); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1830:1: ruleEquation returns [EObject current=null] : (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1833:28: ( (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1834:1: (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1834:1: (otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1834:3: otherlv_0= '@equation' ( (lv_hideFromView_1_0= 'hide' ) )? ( (lv_equation_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= 'where' ( (lv_symbols_6_0= ruleEqSymbol ) ) (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEquation3781); 

                	newLeafNode(otherlv_0, grammarAccess.getEquationAccess().getEquationKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1838:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==19) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1839:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1839:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1840:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,19,FOLLOW_19_in_ruleEquation3799); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEquationRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1853:3: ( (lv_equation_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1854:1: (lv_equation_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1854:1: (lv_equation_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1855:3: lv_equation_2_0= RULE_STRING
            {
            lv_equation_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEquation3830); 

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

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleEquation3847); 

                	newLeafNode(otherlv_3, grammarAccess.getEquationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1875:1: ( (lv_description_4_0= RULE_STRING ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1876:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1876:1: (lv_description_4_0= RULE_STRING )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1877:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEquation3864); 

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

            otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleEquation3882); 

                	newLeafNode(otherlv_5, grammarAccess.getEquationAccess().getWhereKeyword_5());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1897:1: ( (lv_symbols_6_0= ruleEqSymbol ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1898:1: (lv_symbols_6_0= ruleEqSymbol )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1898:1: (lv_symbols_6_0= ruleEqSymbol )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1899:3: lv_symbols_6_0= ruleEqSymbol
            {
             
            	        newCompositeNode(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleEqSymbol_in_ruleEquation3903);
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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1915:2: (otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==38) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1915:4: otherlv_7= ',' ( (lv_symbols_8_0= ruleEqSymbol ) )
            	    {
            	    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleEquation3916); 

            	        	newLeafNode(otherlv_7, grammarAccess.getEquationAccess().getCommaKeyword_7_0());
            	        
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1919:1: ( (lv_symbols_8_0= ruleEqSymbol ) )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1920:1: (lv_symbols_8_0= ruleEqSymbol )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1920:1: (lv_symbols_8_0= ruleEqSymbol )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1921:3: lv_symbols_8_0= ruleEqSymbol
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqSymbol_in_ruleEquation3937);
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
            	    break loop35;
                }
            } while (true);

            otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleEquation3951); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1949:1: entryRuleEqSymbol returns [EObject current=null] : iv_ruleEqSymbol= ruleEqSymbol EOF ;
    public final EObject entryRuleEqSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqSymbol = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1950:2: (iv_ruleEqSymbol= ruleEqSymbol EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1951:2: iv_ruleEqSymbol= ruleEqSymbol EOF
            {
             newCompositeNode(grammarAccess.getEqSymbolRule()); 
            pushFollow(FOLLOW_ruleEqSymbol_in_entryRuleEqSymbol3987);
            iv_ruleEqSymbol=ruleEqSymbol();

            state._fsp--;

             current =iv_ruleEqSymbol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqSymbol3997); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1958:1: ruleEqSymbol returns [EObject current=null] : ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEqSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1961:28: ( ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1962:1: ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1962:1: ( ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1962:2: ( (lv_symbol_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1962:2: ( (lv_symbol_0_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1963:1: (lv_symbol_0_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1963:1: (lv_symbol_0_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1964:3: lv_symbol_0_0= RULE_STRING
            {
            lv_symbol_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqSymbol4039); 

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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleEqSymbol4056); 

                	newLeafNode(otherlv_1, grammarAccess.getEqSymbolAccess().getEqualsSignKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1984:1: ( (lv_description_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1985:1: (lv_description_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1985:1: (lv_description_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:1986:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEqSymbol4073); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2010:1: entryRuleRefToContext returns [EObject current=null] : iv_ruleRefToContext= ruleRefToContext EOF ;
    public final EObject entryRuleRefToContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefToContext = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2011:2: (iv_ruleRefToContext= ruleRefToContext EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2012:2: iv_ruleRefToContext= ruleRefToContext EOF
            {
             newCompositeNode(grammarAccess.getRefToContextRule()); 
            pushFollow(FOLLOW_ruleRefToContext_in_entryRuleRefToContext4114);
            iv_ruleRefToContext=ruleRefToContext();

            state._fsp--;

             current =iv_ruleRefToContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefToContext4124); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2019:1: ruleRefToContext returns [EObject current=null] : (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_questions_5_0= ruleQuestionAnswer ) )+ otherlv_6= '}' ) ;
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
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2022:28: ( (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_questions_5_0= ruleQuestionAnswer ) )+ otherlv_6= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2023:1: (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_questions_5_0= ruleQuestionAnswer ) )+ otherlv_6= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2023:1: (otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_questions_5_0= ruleQuestionAnswer ) )+ otherlv_6= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2023:3: otherlv_0= '@rtc' ( (lv_hideFromView_1_0= 'hide' ) )? otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) ( (lv_questions_5_0= ruleQuestionAnswer ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleRefToContext4161); 

                	newLeafNode(otherlv_0, grammarAccess.getRefToContextAccess().getRtcKeyword_0());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2027:1: ( (lv_hideFromView_1_0= 'hide' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2028:1: (lv_hideFromView_1_0= 'hide' )
                    {
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2028:1: (lv_hideFromView_1_0= 'hide' )
                    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2029:3: lv_hideFromView_1_0= 'hide'
                    {
                    lv_hideFromView_1_0=(Token)match(input,19,FOLLOW_19_in_ruleRefToContext4179); 

                            newLeafNode(lv_hideFromView_1_0, grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRefToContextRule());
                    	        }
                           		setWithLastConsumed(current, "hideFromView", lv_hideFromView_1_0, "hide");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleRefToContext4205); 

                	newLeafNode(otherlv_2, grammarAccess.getRefToContextAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleRefToContext4217); 

                	newLeafNode(otherlv_3, grammarAccess.getRefToContextAccess().getContextKeyword_3());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2050:1: ( (lv_context_4_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2051:1: (lv_context_4_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2051:1: (lv_context_4_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2052:3: lv_context_4_0= RULE_STRING
            {
            lv_context_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRefToContext4234); 

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

            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2068:2: ( (lv_questions_5_0= ruleQuestionAnswer ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==20) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2069:1: (lv_questions_5_0= ruleQuestionAnswer )
            	    {
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2069:1: (lv_questions_5_0= ruleQuestionAnswer )
            	    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2070:3: lv_questions_5_0= ruleQuestionAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefToContextAccess().getQuestionsQuestionAnswerParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestionAnswer_in_ruleRefToContext4260);
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
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleRefToContext4273); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2098:1: entryRuleCMap returns [EObject current=null] : iv_ruleCMap= ruleCMap EOF ;
    public final EObject entryRuleCMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCMap = null;


        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2099:2: (iv_ruleCMap= ruleCMap EOF )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2100:2: iv_ruleCMap= ruleCMap EOF
            {
             newCompositeNode(grammarAccess.getCMapRule()); 
            pushFollow(FOLLOW_ruleCMap_in_entryRuleCMap4309);
            iv_ruleCMap=ruleCMap();

            state._fsp--;

             current =iv_ruleCMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCMap4319); 

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
    // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2107:1: ruleCMap returns [EObject current=null] : (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleCMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2110:28: ( (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2111:1: (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2111:1: (otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2111:3: otherlv_0= 'cmap' otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleCMap4356); 

                	newLeafNode(otherlv_0, grammarAccess.getCMapAccess().getCmapKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleCMap4368); 

                	newLeafNode(otherlv_1, grammarAccess.getCMapAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2119:1: ( (lv_content_2_0= RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2120:1: (lv_content_2_0= RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2120:1: (lv_content_2_0= RULE_STRING )
            // ../com.sandy.xtext.jovenotes/src-gen/com/sandy/xtext/parser/antlr/internal/InternalJoveNotes.g:2121:3: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCMap4385); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleCMap4402); 

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
    public static final BitSet FOLLOW_ruleChapterDetails_in_ruleJoveNotes153 = new BitSet(new long[]{0x0000029DC3F40002L});
    public static final BitSet FOLLOW_ruleNotesElement_in_ruleJoveNotes174 = new BitSet(new long[]{0x0000029DC3F40002L});
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
    public static final BitSet FOLLOW_18_in_ruleWordMeaning1067 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleWordMeaning1085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWordMeaning1116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWordMeaning1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_entryRuleQuestionAnswer1179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionAnswer1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleQuestionAnswer1226 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleQuestionAnswer1244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestionAnswer1275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestionAnswer1297 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleQuestionAnswer1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFIB_in_entryRuleFIB1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFIB1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFIB1407 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleFIB1425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFIB1456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFIB1478 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition1520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDefinition1567 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDefinition1585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefinition1616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefinition1638 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleDefinition1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_entryRuleCharacter1701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharacter1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCharacter1748 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleCharacter1766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharacter1797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharacter1819 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleCharacter1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeacherNote_in_entryRuleTeacherNote1882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTeacherNote1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTeacherNote1929 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleTeacherNote1947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTeacherNote1978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTeacherNote2001 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_ruleTeacherNote2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatching_in_entryRuleMatching2064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatching2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMatching2111 = new BitSet(new long[]{0x000000000C080010L});
    public static final BitSet FOLLOW_19_in_ruleMatching2129 = new BitSet(new long[]{0x000000000C000010L});
    public static final BitSet FOLLOW_26_in_ruleMatching2161 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatching2192 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMatching2210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMatchPair_in_ruleMatching2231 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleMatching2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchPair_in_entryRuleMatchPair2280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchPair2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatchPair2332 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMatchPair2349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatchPair2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent2407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEvent2454 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleEvent2472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent2503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueFalse_in_entryRuleTrueFalse2566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrueFalse2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTrueFalse2613 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleTrueFalse2631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTrueFalse2662 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleTrueFalse2684 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTrueFalse2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemEquation_in_entryRuleChemEquation2748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChemEquation2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleChemEquation2795 = new BitSet(new long[]{0x0000000008080010L});
    public static final BitSet FOLLOW_19_in_ruleChemEquation2813 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation2844 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleChemEquation2862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation2879 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleChemEquation2896 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation2913 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleChemEquation2931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemEquation2948 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleChemEquation2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemCompound_in_entryRuleChemCompound3001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChemCompound3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleChemCompound3048 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleChemCompound3066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemCompound3097 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemCompound3119 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChemCompound3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpellbee_in_entryRuleSpellbee3183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpellbee3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSpellbee3230 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleSpellbee3248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpellbee3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageLabel_in_entryRuleImageLabel3320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageLabel3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleImageLabel3367 = new BitSet(new long[]{0x0000000008080010L});
    public static final BitSet FOLLOW_19_in_ruleImageLabel3385 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageLabel3416 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleImageLabel3434 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleImageLabel3446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageLabel3463 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHotSpot_in_ruleImageLabel3489 = new BitSet(new long[]{0x0000004010000000L});
    public static final BitSet FOLLOW_38_in_ruleImageLabel3502 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHotSpot_in_ruleImageLabel3523 = new BitSet(new long[]{0x0000004010000000L});
    public static final BitSet FOLLOW_28_in_ruleImageLabel3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHotSpot_in_entryRuleHotSpot3573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHotSpot3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHotSpot3625 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleHotSpot3642 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHotSpot3659 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleHotSpot3676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHotSpot3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation3734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquation3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEquation3781 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleEquation3799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEquation3830 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEquation3847 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEquation3864 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEquation3882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_ruleEquation3903 = new BitSet(new long[]{0x0000004010000000L});
    public static final BitSet FOLLOW_38_in_ruleEquation3916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_ruleEquation3937 = new BitSet(new long[]{0x0000004010000000L});
    public static final BitSet FOLLOW_28_in_ruleEquation3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_entryRuleEqSymbol3987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqSymbol3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqSymbol4039 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleEqSymbol4056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEqSymbol4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefToContext_in_entryRuleRefToContext4114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefToContext4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRefToContext4161 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_19_in_ruleRefToContext4179 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRefToContext4205 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleRefToContext4217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRefToContext4234 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_ruleRefToContext4260 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_28_in_ruleRefToContext4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_entryRuleCMap4309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCMap4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCMap4356 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCMap4368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCMap4385 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCMap4402 = new BitSet(new long[]{0x0000000000000002L});

}