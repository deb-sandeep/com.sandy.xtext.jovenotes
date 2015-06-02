/*
 * generated by Xtext
 */
package com.sandy.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.sandy.xtext.joveNotes.CMap;
import com.sandy.xtext.joveNotes.ChapterDetails;
import com.sandy.xtext.joveNotes.ChemCompound;
import com.sandy.xtext.joveNotes.ChemEquation;
import com.sandy.xtext.joveNotes.Definition;
import com.sandy.xtext.joveNotes.EqSymbol;
import com.sandy.xtext.joveNotes.Equation;
import com.sandy.xtext.joveNotes.Event;
import com.sandy.xtext.joveNotes.FIB;
import com.sandy.xtext.joveNotes.HotSpot;
import com.sandy.xtext.joveNotes.ImageLabel;
import com.sandy.xtext.joveNotes.JoveNotes;
import com.sandy.xtext.joveNotes.JoveNotesPackage;
import com.sandy.xtext.joveNotes.MatchPair;
import com.sandy.xtext.joveNotes.Matching;
import com.sandy.xtext.joveNotes.ProcessingHints;
import com.sandy.xtext.joveNotes.QuestionAnswer;
import com.sandy.xtext.joveNotes.RefToContext;
import com.sandy.xtext.joveNotes.Spellbee;
import com.sandy.xtext.joveNotes.TeacherNote;
import com.sandy.xtext.joveNotes.TrueFalse;
import com.sandy.xtext.joveNotes.WordMeaning;
import com.sandy.xtext.services.JoveNotesGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class JoveNotesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JoveNotesGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JoveNotesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JoveNotesPackage.CMAP:
				sequence_CMap(context, (CMap) semanticObject); 
				return; 
			case JoveNotesPackage.CHAPTER_DETAILS:
				sequence_ChapterDetails(context, (ChapterDetails) semanticObject); 
				return; 
			case JoveNotesPackage.CHARACTER:
				sequence_Character(context, (com.sandy.xtext.joveNotes.Character) semanticObject); 
				return; 
			case JoveNotesPackage.CHEM_COMPOUND:
				sequence_ChemCompound(context, (ChemCompound) semanticObject); 
				return; 
			case JoveNotesPackage.CHEM_EQUATION:
				sequence_ChemEquation(context, (ChemEquation) semanticObject); 
				return; 
			case JoveNotesPackage.DEFINITION:
				sequence_Definition(context, (Definition) semanticObject); 
				return; 
			case JoveNotesPackage.EQ_SYMBOL:
				sequence_EqSymbol(context, (EqSymbol) semanticObject); 
				return; 
			case JoveNotesPackage.EQUATION:
				sequence_Equation(context, (Equation) semanticObject); 
				return; 
			case JoveNotesPackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case JoveNotesPackage.FIB:
				sequence_FIB(context, (FIB) semanticObject); 
				return; 
			case JoveNotesPackage.HOT_SPOT:
				sequence_HotSpot(context, (HotSpot) semanticObject); 
				return; 
			case JoveNotesPackage.IMAGE_LABEL:
				sequence_ImageLabel(context, (ImageLabel) semanticObject); 
				return; 
			case JoveNotesPackage.JOVE_NOTES:
				sequence_JoveNotes(context, (JoveNotes) semanticObject); 
				return; 
			case JoveNotesPackage.MATCH_PAIR:
				sequence_MatchPair(context, (MatchPair) semanticObject); 
				return; 
			case JoveNotesPackage.MATCHING:
				sequence_Matching(context, (Matching) semanticObject); 
				return; 
			case JoveNotesPackage.PROCESSING_HINTS:
				sequence_ProcessingHints(context, (ProcessingHints) semanticObject); 
				return; 
			case JoveNotesPackage.QUESTION_ANSWER:
				sequence_QuestionAnswer(context, (QuestionAnswer) semanticObject); 
				return; 
			case JoveNotesPackage.REF_TO_CONTEXT:
				sequence_RefToContext(context, (RefToContext) semanticObject); 
				return; 
			case JoveNotesPackage.SPELLBEE:
				sequence_Spellbee(context, (Spellbee) semanticObject); 
				return; 
			case JoveNotesPackage.TEACHER_NOTE:
				sequence_TeacherNote(context, (TeacherNote) semanticObject); 
				return; 
			case JoveNotesPackage.TRUE_FALSE:
				sequence_TrueFalse(context, (TrueFalse) semanticObject); 
				return; 
			case JoveNotesPackage.WORD_MEANING:
				sequence_WordMeaning(context, (WordMeaning) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     content=STRING
	 */
	protected void sequence_CMap(EObject context, CMap semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JoveNotesPackage.Literals.CMAP__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JoveNotesPackage.Literals.CMAP__CONTENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCMapAccess().getContentSTRINGTerminalRuleCall_2_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (testPaper='@test_paper'? subjectName=STRING chapterNumber=INT subChapterNumber=INT chapterName=STRING)
	 */
	protected void sequence_ChapterDetails(EObject context, ChapterDetails semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (character=STRING estimate=STRING cmap=CMap?)
	 */
	protected void sequence_Character(EObject context, com.sandy.xtext.joveNotes.Character semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (symbol=STRING chemicalName=STRING commonName=STRING?)
	 */
	protected void sequence_ChemCompound(EObject context, ChemCompound semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (description=STRING? reactants=STRING produces=STRING? products=STRING)
	 */
	protected void sequence_ChemEquation(EObject context, ChemEquation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (term=STRING definition=STRING cmap=CMap?)
	 */
	protected void sequence_Definition(EObject context, Definition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (symbol=STRING description=STRING)
	 */
	protected void sequence_EqSymbol(EObject context, EqSymbol semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JoveNotesPackage.Literals.EQ_SYMBOL__SYMBOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JoveNotesPackage.Literals.EQ_SYMBOL__SYMBOL));
			if(transientValues.isValueTransient(semanticObject, JoveNotesPackage.Literals.EQ_SYMBOL__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JoveNotesPackage.Literals.EQ_SYMBOL__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEqSymbolAccess().getSymbolSTRINGTerminalRuleCall_0_0(), semanticObject.getSymbol());
		feeder.accept(grammarAccess.getEqSymbolAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (equation=STRING description=STRING? symbols+=EqSymbol symbols+=EqSymbol*)
	 */
	protected void sequence_Equation(EObject context, Equation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (event=STRING time=STRING)
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JoveNotesPackage.Literals.EVENT__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JoveNotesPackage.Literals.EVENT__EVENT));
			if(transientValues.isValueTransient(semanticObject, JoveNotesPackage.Literals.EVENT__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JoveNotesPackage.Literals.EVENT__TIME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEventAccess().getEventSTRINGTerminalRuleCall_1_0(), semanticObject.getEvent());
		feeder.accept(grammarAccess.getEventAccess().getTimeSTRINGTerminalRuleCall_2_0(), semanticObject.getTime());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (question=STRING answers+=STRING+)
	 */
	protected void sequence_FIB(EObject context, FIB semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x=INT y=INT label=STRING)
	 */
	protected void sequence_HotSpot(EObject context, HotSpot semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JoveNotesPackage.Literals.HOT_SPOT__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JoveNotesPackage.Literals.HOT_SPOT__X));
			if(transientValues.isValueTransient(semanticObject, JoveNotesPackage.Literals.HOT_SPOT__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JoveNotesPackage.Literals.HOT_SPOT__Y));
			if(transientValues.isValueTransient(semanticObject, JoveNotesPackage.Literals.HOT_SPOT__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JoveNotesPackage.Literals.HOT_SPOT__LABEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHotSpotAccess().getXINTTerminalRuleCall_0_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getHotSpotAccess().getYINTTerminalRuleCall_2_0(), semanticObject.getY());
		feeder.accept(grammarAccess.getHotSpotAccess().getLabelSTRINGTerminalRuleCall_4_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (caption=STRING? imageName=STRING hotspots+=HotSpot hotspots+=HotSpot*)
	 */
	protected void sequence_ImageLabel(EObject context, ImageLabel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (processingHints=ProcessingHints? chapterDetails=ChapterDetails notesElements+=NotesElement*)
	 */
	protected void sequence_JoveNotes(EObject context, JoveNotes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (matchQuestion=STRING matchAnswer=STRING)
	 */
	protected void sequence_MatchPair(EObject context, MatchPair semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JoveNotesPackage.Literals.MATCH_PAIR__MATCH_QUESTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JoveNotesPackage.Literals.MATCH_PAIR__MATCH_QUESTION));
			if(transientValues.isValueTransient(semanticObject, JoveNotesPackage.Literals.MATCH_PAIR__MATCH_ANSWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JoveNotesPackage.Literals.MATCH_PAIR__MATCH_ANSWER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatchPairAccess().getMatchQuestionSTRINGTerminalRuleCall_0_0(), semanticObject.getMatchQuestion());
		feeder.accept(grammarAccess.getMatchPairAccess().getMatchAnswerSTRINGTerminalRuleCall_2_0(), semanticObject.getMatchAnswer());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (skipReverseQuestion='skip_reverse_question'? question=STRING? pairs+=MatchPair+)
	 */
	protected void sequence_Matching(EObject context, Matching semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     skipGeneration='@skip_generation'
	 */
	protected void sequence_ProcessingHints(EObject context, ProcessingHints semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JoveNotesPackage.Literals.PROCESSING_HINTS__SKIP_GENERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JoveNotesPackage.Literals.PROCESSING_HINTS__SKIP_GENERATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_0(), semanticObject.getSkipGeneration());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (question=STRING answer=STRING cmap=CMap?)
	 */
	protected void sequence_QuestionAnswer(EObject context, QuestionAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (context=STRING questions+=QuestionAnswer+)
	 */
	protected void sequence_RefToContext(EObject context, RefToContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     word=STRING
	 */
	protected void sequence_Spellbee(EObject context, Spellbee semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JoveNotesPackage.Literals.SPELLBEE__WORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JoveNotesPackage.Literals.SPELLBEE__WORD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSpellbeeAccess().getWordSTRINGTerminalRuleCall_1_0(), semanticObject.getWord());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (note=STRING cmap=CMap?)
	 */
	protected void sequence_TeacherNote(EObject context, TeacherNote semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statement=STRING truthValue=BOOL justification=STRING?)
	 */
	protected void sequence_TrueFalse(EObject context, TrueFalse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (word=STRING meaning=STRING)
	 */
	protected void sequence_WordMeaning(EObject context, WordMeaning semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JoveNotesPackage.Literals.WORD_MEANING__WORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JoveNotesPackage.Literals.WORD_MEANING__WORD));
			if(transientValues.isValueTransient(semanticObject, JoveNotesPackage.Literals.WORD_MEANING__MEANING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JoveNotesPackage.Literals.WORD_MEANING__MEANING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWordMeaningAccess().getWordSTRINGTerminalRuleCall_1_0(), semanticObject.getWord());
		feeder.accept(grammarAccess.getWordMeaningAccess().getMeaningSTRINGTerminalRuleCall_2_0(), semanticObject.getMeaning());
		feeder.finish();
	}
}
