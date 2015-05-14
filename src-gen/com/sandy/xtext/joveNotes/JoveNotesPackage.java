/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sandy.xtext.joveNotes.JoveNotesFactory
 * @model kind="package"
 * @generated
 */
public interface JoveNotesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "joveNotes";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sandy.com/xtext/JoveNotes";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "joveNotes";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JoveNotesPackage eINSTANCE = com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl.init();

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.JoveNotesImpl <em>Jove Notes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getJoveNotes()
   * @generated
   */
  int JOVE_NOTES = 0;

  /**
   * The feature id for the '<em><b>Processing Hints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOVE_NOTES__PROCESSING_HINTS = 0;

  /**
   * The feature id for the '<em><b>Chapter Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOVE_NOTES__CHAPTER_DETAILS = 1;

  /**
   * The feature id for the '<em><b>Notes Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOVE_NOTES__NOTES_ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Jove Notes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOVE_NOTES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.ProcessingHintsImpl <em>Processing Hints</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.ProcessingHintsImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getProcessingHints()
   * @generated
   */
  int PROCESSING_HINTS = 1;

  /**
   * The feature id for the '<em><b>Skip Generation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_HINTS__SKIP_GENERATION = 0;

  /**
   * The number of structural features of the '<em>Processing Hints</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_HINTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.ChapterDetailsImpl <em>Chapter Details</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.ChapterDetailsImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getChapterDetails()
   * @generated
   */
  int CHAPTER_DETAILS = 2;

  /**
   * The feature id for the '<em><b>Test Paper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER_DETAILS__TEST_PAPER = 0;

  /**
   * The feature id for the '<em><b>Subject Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER_DETAILS__SUBJECT_NAME = 1;

  /**
   * The feature id for the '<em><b>Chapter Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER_DETAILS__CHAPTER_NUMBER = 2;

  /**
   * The feature id for the '<em><b>Sub Chapter Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER_DETAILS__SUB_CHAPTER_NUMBER = 3;

  /**
   * The feature id for the '<em><b>Chapter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER_DETAILS__CHAPTER_NAME = 4;

  /**
   * The number of structural features of the '<em>Chapter Details</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER_DETAILS_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.NotesElementImpl <em>Notes Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.NotesElementImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getNotesElement()
   * @generated
   */
  int NOTES_ELEMENT = 3;

  /**
   * The number of structural features of the '<em>Notes Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTES_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.WordMeaningImpl <em>Word Meaning</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.WordMeaningImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getWordMeaning()
   * @generated
   */
  int WORD_MEANING = 4;

  /**
   * The feature id for the '<em><b>Word</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_MEANING__WORD = NOTES_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Meaning</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_MEANING__MEANING = NOTES_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Word Meaning</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_MEANING_FEATURE_COUNT = NOTES_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.QuestionAnswerImpl <em>Question Answer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.QuestionAnswerImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getQuestionAnswer()
   * @generated
   */
  int QUESTION_ANSWER = 5;

  /**
   * The feature id for the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_ANSWER__QUESTION = NOTES_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Answer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_ANSWER__ANSWER = NOTES_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cmap</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_ANSWER__CMAP = NOTES_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Question Answer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_ANSWER_FEATURE_COUNT = NOTES_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.FIBImpl <em>FIB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.FIBImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getFIB()
   * @generated
   */
  int FIB = 6;

  /**
   * The feature id for the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIB__QUESTION = NOTES_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Answers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIB__ANSWERS = NOTES_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>FIB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIB_FEATURE_COUNT = NOTES_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.DefinitionImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 7;

  /**
   * The feature id for the '<em><b>Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__TERM = NOTES_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__DEFINITION = NOTES_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cmap</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__CMAP = NOTES_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = NOTES_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.CharacterImpl <em>Character</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.CharacterImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getCharacter()
   * @generated
   */
  int CHARACTER = 8;

  /**
   * The feature id for the '<em><b>Character</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__CHARACTER = NOTES_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Estimate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__ESTIMATE = NOTES_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cmap</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__CMAP = NOTES_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Character</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_FEATURE_COUNT = NOTES_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.TeacherNoteImpl <em>Teacher Note</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.TeacherNoteImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getTeacherNote()
   * @generated
   */
  int TEACHER_NOTE = 9;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEACHER_NOTE__NOTE = NOTES_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cmap</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEACHER_NOTE__CMAP = NOTES_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Teacher Note</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEACHER_NOTE_FEATURE_COUNT = NOTES_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.MatchingImpl <em>Matching</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.MatchingImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getMatching()
   * @generated
   */
  int MATCHING = 10;

  /**
   * The feature id for the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCHING__QUESTION = NOTES_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCHING__PAIRS = NOTES_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Matching</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCHING_FEATURE_COUNT = NOTES_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.MatchPairImpl <em>Match Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.MatchPairImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getMatchPair()
   * @generated
   */
  int MATCH_PAIR = 11;

  /**
   * The feature id for the '<em><b>Match Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_PAIR__MATCH_QUESTION = 0;

  /**
   * The feature id for the '<em><b>Match Answer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_PAIR__MATCH_ANSWER = 1;

  /**
   * The number of structural features of the '<em>Match Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.EventImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 12;

  /**
   * The feature id for the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__EVENT = NOTES_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__TIME = NOTES_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = NOTES_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.TrueFalseImpl <em>True False</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.TrueFalseImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getTrueFalse()
   * @generated
   */
  int TRUE_FALSE = 13;

  /**
   * The feature id for the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUE_FALSE__STATEMENT = NOTES_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Truth Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUE_FALSE__TRUTH_VALUE = NOTES_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Justification</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUE_FALSE__JUSTIFICATION = NOTES_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>True False</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUE_FALSE_FEATURE_COUNT = NOTES_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.ChemEquationImpl <em>Chem Equation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.ChemEquationImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getChemEquation()
   * @generated
   */
  int CHEM_EQUATION = 14;

  /**
   * The feature id for the '<em><b>Equation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHEM_EQUATION__EQUATION = NOTES_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHEM_EQUATION__DESCRIPTION = NOTES_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Notes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHEM_EQUATION__NOTES = NOTES_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Chem Equation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHEM_EQUATION_FEATURE_COUNT = NOTES_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.ChemCompoundImpl <em>Chem Compound</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.ChemCompoundImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getChemCompound()
   * @generated
   */
  int CHEM_COMPOUND = 15;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHEM_COMPOUND__SYMBOL = NOTES_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Chemical Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHEM_COMPOUND__CHEMICAL_NAME = NOTES_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Common Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHEM_COMPOUND__COMMON_NAME = NOTES_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Chem Compound</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHEM_COMPOUND_FEATURE_COUNT = NOTES_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.SpellbeeImpl <em>Spellbee</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.SpellbeeImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getSpellbee()
   * @generated
   */
  int SPELLBEE = 16;

  /**
   * The feature id for the '<em><b>Word</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELLBEE__WORD = NOTES_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Spellbee</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELLBEE_FEATURE_COUNT = NOTES_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.ImageLabelImpl <em>Image Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.ImageLabelImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getImageLabel()
   * @generated
   */
  int IMAGE_LABEL = 17;

  /**
   * The feature id for the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_LABEL__CAPTION = NOTES_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Image Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_LABEL__IMAGE_NAME = NOTES_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Hotspots</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_LABEL__HOTSPOTS = NOTES_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Image Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_LABEL_FEATURE_COUNT = NOTES_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.HotSpotImpl <em>Hot Spot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.HotSpotImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getHotSpot()
   * @generated
   */
  int HOT_SPOT = 18;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOT_SPOT__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOT_SPOT__Y = 1;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOT_SPOT__LABEL = 2;

  /**
   * The number of structural features of the '<em>Hot Spot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOT_SPOT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.EquationImpl <em>Equation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.EquationImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getEquation()
   * @generated
   */
  int EQUATION = 19;

  /**
   * The feature id for the '<em><b>Equation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUATION__EQUATION = NOTES_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUATION__DESCRIPTION = NOTES_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Symbols</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUATION__SYMBOLS = NOTES_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Equation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUATION_FEATURE_COUNT = NOTES_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.EqSymbolImpl <em>Eq Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.EqSymbolImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getEqSymbol()
   * @generated
   */
  int EQ_SYMBOL = 20;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_SYMBOL__SYMBOL = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_SYMBOL__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Eq Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_SYMBOL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.RefToContextImpl <em>Ref To Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.RefToContextImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getRefToContext()
   * @generated
   */
  int REF_TO_CONTEXT = 21;

  /**
   * The feature id for the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TO_CONTEXT__CONTEXT = NOTES_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Questions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TO_CONTEXT__QUESTIONS = NOTES_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ref To Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TO_CONTEXT_FEATURE_COUNT = NOTES_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.sandy.xtext.joveNotes.impl.CMapImpl <em>CMap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sandy.xtext.joveNotes.impl.CMapImpl
   * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getCMap()
   * @generated
   */
  int CMAP = 22;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMAP__CONTENT = 0;

  /**
   * The number of structural features of the '<em>CMap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMAP_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.JoveNotes <em>Jove Notes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jove Notes</em>'.
   * @see com.sandy.xtext.joveNotes.JoveNotes
   * @generated
   */
  EClass getJoveNotes();

  /**
   * Returns the meta object for the containment reference '{@link com.sandy.xtext.joveNotes.JoveNotes#getProcessingHints <em>Processing Hints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Processing Hints</em>'.
   * @see com.sandy.xtext.joveNotes.JoveNotes#getProcessingHints()
   * @see #getJoveNotes()
   * @generated
   */
  EReference getJoveNotes_ProcessingHints();

  /**
   * Returns the meta object for the containment reference '{@link com.sandy.xtext.joveNotes.JoveNotes#getChapterDetails <em>Chapter Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Chapter Details</em>'.
   * @see com.sandy.xtext.joveNotes.JoveNotes#getChapterDetails()
   * @see #getJoveNotes()
   * @generated
   */
  EReference getJoveNotes_ChapterDetails();

  /**
   * Returns the meta object for the containment reference list '{@link com.sandy.xtext.joveNotes.JoveNotes#getNotesElements <em>Notes Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Notes Elements</em>'.
   * @see com.sandy.xtext.joveNotes.JoveNotes#getNotesElements()
   * @see #getJoveNotes()
   * @generated
   */
  EReference getJoveNotes_NotesElements();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.ProcessingHints <em>Processing Hints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Processing Hints</em>'.
   * @see com.sandy.xtext.joveNotes.ProcessingHints
   * @generated
   */
  EClass getProcessingHints();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.ProcessingHints#getSkipGeneration <em>Skip Generation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Skip Generation</em>'.
   * @see com.sandy.xtext.joveNotes.ProcessingHints#getSkipGeneration()
   * @see #getProcessingHints()
   * @generated
   */
  EAttribute getProcessingHints_SkipGeneration();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.ChapterDetails <em>Chapter Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chapter Details</em>'.
   * @see com.sandy.xtext.joveNotes.ChapterDetails
   * @generated
   */
  EClass getChapterDetails();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.ChapterDetails#getTestPaper <em>Test Paper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Test Paper</em>'.
   * @see com.sandy.xtext.joveNotes.ChapterDetails#getTestPaper()
   * @see #getChapterDetails()
   * @generated
   */
  EAttribute getChapterDetails_TestPaper();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.ChapterDetails#getSubjectName <em>Subject Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subject Name</em>'.
   * @see com.sandy.xtext.joveNotes.ChapterDetails#getSubjectName()
   * @see #getChapterDetails()
   * @generated
   */
  EAttribute getChapterDetails_SubjectName();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.ChapterDetails#getChapterNumber <em>Chapter Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Chapter Number</em>'.
   * @see com.sandy.xtext.joveNotes.ChapterDetails#getChapterNumber()
   * @see #getChapterDetails()
   * @generated
   */
  EAttribute getChapterDetails_ChapterNumber();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.ChapterDetails#getSubChapterNumber <em>Sub Chapter Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sub Chapter Number</em>'.
   * @see com.sandy.xtext.joveNotes.ChapterDetails#getSubChapterNumber()
   * @see #getChapterDetails()
   * @generated
   */
  EAttribute getChapterDetails_SubChapterNumber();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.ChapterDetails#getChapterName <em>Chapter Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Chapter Name</em>'.
   * @see com.sandy.xtext.joveNotes.ChapterDetails#getChapterName()
   * @see #getChapterDetails()
   * @generated
   */
  EAttribute getChapterDetails_ChapterName();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.NotesElement <em>Notes Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Notes Element</em>'.
   * @see com.sandy.xtext.joveNotes.NotesElement
   * @generated
   */
  EClass getNotesElement();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.WordMeaning <em>Word Meaning</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Word Meaning</em>'.
   * @see com.sandy.xtext.joveNotes.WordMeaning
   * @generated
   */
  EClass getWordMeaning();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.WordMeaning#getWord <em>Word</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Word</em>'.
   * @see com.sandy.xtext.joveNotes.WordMeaning#getWord()
   * @see #getWordMeaning()
   * @generated
   */
  EAttribute getWordMeaning_Word();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.WordMeaning#getMeaning <em>Meaning</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Meaning</em>'.
   * @see com.sandy.xtext.joveNotes.WordMeaning#getMeaning()
   * @see #getWordMeaning()
   * @generated
   */
  EAttribute getWordMeaning_Meaning();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.QuestionAnswer <em>Question Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question Answer</em>'.
   * @see com.sandy.xtext.joveNotes.QuestionAnswer
   * @generated
   */
  EClass getQuestionAnswer();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.QuestionAnswer#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Question</em>'.
   * @see com.sandy.xtext.joveNotes.QuestionAnswer#getQuestion()
   * @see #getQuestionAnswer()
   * @generated
   */
  EAttribute getQuestionAnswer_Question();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.QuestionAnswer#getAnswer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Answer</em>'.
   * @see com.sandy.xtext.joveNotes.QuestionAnswer#getAnswer()
   * @see #getQuestionAnswer()
   * @generated
   */
  EAttribute getQuestionAnswer_Answer();

  /**
   * Returns the meta object for the containment reference '{@link com.sandy.xtext.joveNotes.QuestionAnswer#getCmap <em>Cmap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmap</em>'.
   * @see com.sandy.xtext.joveNotes.QuestionAnswer#getCmap()
   * @see #getQuestionAnswer()
   * @generated
   */
  EReference getQuestionAnswer_Cmap();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.FIB <em>FIB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FIB</em>'.
   * @see com.sandy.xtext.joveNotes.FIB
   * @generated
   */
  EClass getFIB();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.FIB#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Question</em>'.
   * @see com.sandy.xtext.joveNotes.FIB#getQuestion()
   * @see #getFIB()
   * @generated
   */
  EAttribute getFIB_Question();

  /**
   * Returns the meta object for the attribute list '{@link com.sandy.xtext.joveNotes.FIB#getAnswers <em>Answers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Answers</em>'.
   * @see com.sandy.xtext.joveNotes.FIB#getAnswers()
   * @see #getFIB()
   * @generated
   */
  EAttribute getFIB_Answers();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see com.sandy.xtext.joveNotes.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.Definition#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Term</em>'.
   * @see com.sandy.xtext.joveNotes.Definition#getTerm()
   * @see #getDefinition()
   * @generated
   */
  EAttribute getDefinition_Term();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.Definition#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Definition</em>'.
   * @see com.sandy.xtext.joveNotes.Definition#getDefinition()
   * @see #getDefinition()
   * @generated
   */
  EAttribute getDefinition_Definition();

  /**
   * Returns the meta object for the containment reference '{@link com.sandy.xtext.joveNotes.Definition#getCmap <em>Cmap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmap</em>'.
   * @see com.sandy.xtext.joveNotes.Definition#getCmap()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Cmap();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.Character <em>Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Character</em>'.
   * @see com.sandy.xtext.joveNotes.Character
   * @generated
   */
  EClass getCharacter();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.Character#getCharacter <em>Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Character</em>'.
   * @see com.sandy.xtext.joveNotes.Character#getCharacter()
   * @see #getCharacter()
   * @generated
   */
  EAttribute getCharacter_Character();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.Character#getEstimate <em>Estimate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Estimate</em>'.
   * @see com.sandy.xtext.joveNotes.Character#getEstimate()
   * @see #getCharacter()
   * @generated
   */
  EAttribute getCharacter_Estimate();

  /**
   * Returns the meta object for the containment reference '{@link com.sandy.xtext.joveNotes.Character#getCmap <em>Cmap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmap</em>'.
   * @see com.sandy.xtext.joveNotes.Character#getCmap()
   * @see #getCharacter()
   * @generated
   */
  EReference getCharacter_Cmap();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.TeacherNote <em>Teacher Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Teacher Note</em>'.
   * @see com.sandy.xtext.joveNotes.TeacherNote
   * @generated
   */
  EClass getTeacherNote();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.TeacherNote#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see com.sandy.xtext.joveNotes.TeacherNote#getNote()
   * @see #getTeacherNote()
   * @generated
   */
  EAttribute getTeacherNote_Note();

  /**
   * Returns the meta object for the containment reference '{@link com.sandy.xtext.joveNotes.TeacherNote#getCmap <em>Cmap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmap</em>'.
   * @see com.sandy.xtext.joveNotes.TeacherNote#getCmap()
   * @see #getTeacherNote()
   * @generated
   */
  EReference getTeacherNote_Cmap();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.Matching <em>Matching</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Matching</em>'.
   * @see com.sandy.xtext.joveNotes.Matching
   * @generated
   */
  EClass getMatching();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.Matching#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Question</em>'.
   * @see com.sandy.xtext.joveNotes.Matching#getQuestion()
   * @see #getMatching()
   * @generated
   */
  EAttribute getMatching_Question();

  /**
   * Returns the meta object for the containment reference list '{@link com.sandy.xtext.joveNotes.Matching#getPairs <em>Pairs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pairs</em>'.
   * @see com.sandy.xtext.joveNotes.Matching#getPairs()
   * @see #getMatching()
   * @generated
   */
  EReference getMatching_Pairs();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.MatchPair <em>Match Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Match Pair</em>'.
   * @see com.sandy.xtext.joveNotes.MatchPair
   * @generated
   */
  EClass getMatchPair();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.MatchPair#getMatchQuestion <em>Match Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Match Question</em>'.
   * @see com.sandy.xtext.joveNotes.MatchPair#getMatchQuestion()
   * @see #getMatchPair()
   * @generated
   */
  EAttribute getMatchPair_MatchQuestion();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.MatchPair#getMatchAnswer <em>Match Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Match Answer</em>'.
   * @see com.sandy.xtext.joveNotes.MatchPair#getMatchAnswer()
   * @see #getMatchPair()
   * @generated
   */
  EAttribute getMatchPair_MatchAnswer();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see com.sandy.xtext.joveNotes.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.Event#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event</em>'.
   * @see com.sandy.xtext.joveNotes.Event#getEvent()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Event();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.Event#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see com.sandy.xtext.joveNotes.Event#getTime()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Time();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.TrueFalse <em>True False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>True False</em>'.
   * @see com.sandy.xtext.joveNotes.TrueFalse
   * @generated
   */
  EClass getTrueFalse();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.TrueFalse#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Statement</em>'.
   * @see com.sandy.xtext.joveNotes.TrueFalse#getStatement()
   * @see #getTrueFalse()
   * @generated
   */
  EAttribute getTrueFalse_Statement();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.TrueFalse#getTruthValue <em>Truth Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Truth Value</em>'.
   * @see com.sandy.xtext.joveNotes.TrueFalse#getTruthValue()
   * @see #getTrueFalse()
   * @generated
   */
  EAttribute getTrueFalse_TruthValue();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.TrueFalse#getJustification <em>Justification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Justification</em>'.
   * @see com.sandy.xtext.joveNotes.TrueFalse#getJustification()
   * @see #getTrueFalse()
   * @generated
   */
  EAttribute getTrueFalse_Justification();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.ChemEquation <em>Chem Equation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chem Equation</em>'.
   * @see com.sandy.xtext.joveNotes.ChemEquation
   * @generated
   */
  EClass getChemEquation();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.ChemEquation#getEquation <em>Equation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Equation</em>'.
   * @see com.sandy.xtext.joveNotes.ChemEquation#getEquation()
   * @see #getChemEquation()
   * @generated
   */
  EAttribute getChemEquation_Equation();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.ChemEquation#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.sandy.xtext.joveNotes.ChemEquation#getDescription()
   * @see #getChemEquation()
   * @generated
   */
  EAttribute getChemEquation_Description();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.ChemEquation#getNotes <em>Notes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Notes</em>'.
   * @see com.sandy.xtext.joveNotes.ChemEquation#getNotes()
   * @see #getChemEquation()
   * @generated
   */
  EAttribute getChemEquation_Notes();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.ChemCompound <em>Chem Compound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chem Compound</em>'.
   * @see com.sandy.xtext.joveNotes.ChemCompound
   * @generated
   */
  EClass getChemCompound();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.ChemCompound#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symbol</em>'.
   * @see com.sandy.xtext.joveNotes.ChemCompound#getSymbol()
   * @see #getChemCompound()
   * @generated
   */
  EAttribute getChemCompound_Symbol();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.ChemCompound#getChemicalName <em>Chemical Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Chemical Name</em>'.
   * @see com.sandy.xtext.joveNotes.ChemCompound#getChemicalName()
   * @see #getChemCompound()
   * @generated
   */
  EAttribute getChemCompound_ChemicalName();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.ChemCompound#getCommonName <em>Common Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Common Name</em>'.
   * @see com.sandy.xtext.joveNotes.ChemCompound#getCommonName()
   * @see #getChemCompound()
   * @generated
   */
  EAttribute getChemCompound_CommonName();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.Spellbee <em>Spellbee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spellbee</em>'.
   * @see com.sandy.xtext.joveNotes.Spellbee
   * @generated
   */
  EClass getSpellbee();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.Spellbee#getWord <em>Word</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Word</em>'.
   * @see com.sandy.xtext.joveNotes.Spellbee#getWord()
   * @see #getSpellbee()
   * @generated
   */
  EAttribute getSpellbee_Word();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.ImageLabel <em>Image Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image Label</em>'.
   * @see com.sandy.xtext.joveNotes.ImageLabel
   * @generated
   */
  EClass getImageLabel();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.ImageLabel#getCaption <em>Caption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Caption</em>'.
   * @see com.sandy.xtext.joveNotes.ImageLabel#getCaption()
   * @see #getImageLabel()
   * @generated
   */
  EAttribute getImageLabel_Caption();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.ImageLabel#getImageName <em>Image Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Image Name</em>'.
   * @see com.sandy.xtext.joveNotes.ImageLabel#getImageName()
   * @see #getImageLabel()
   * @generated
   */
  EAttribute getImageLabel_ImageName();

  /**
   * Returns the meta object for the containment reference list '{@link com.sandy.xtext.joveNotes.ImageLabel#getHotspots <em>Hotspots</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hotspots</em>'.
   * @see com.sandy.xtext.joveNotes.ImageLabel#getHotspots()
   * @see #getImageLabel()
   * @generated
   */
  EReference getImageLabel_Hotspots();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.HotSpot <em>Hot Spot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hot Spot</em>'.
   * @see com.sandy.xtext.joveNotes.HotSpot
   * @generated
   */
  EClass getHotSpot();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.HotSpot#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see com.sandy.xtext.joveNotes.HotSpot#getX()
   * @see #getHotSpot()
   * @generated
   */
  EAttribute getHotSpot_X();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.HotSpot#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see com.sandy.xtext.joveNotes.HotSpot#getY()
   * @see #getHotSpot()
   * @generated
   */
  EAttribute getHotSpot_Y();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.HotSpot#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see com.sandy.xtext.joveNotes.HotSpot#getLabel()
   * @see #getHotSpot()
   * @generated
   */
  EAttribute getHotSpot_Label();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.Equation <em>Equation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equation</em>'.
   * @see com.sandy.xtext.joveNotes.Equation
   * @generated
   */
  EClass getEquation();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.Equation#getEquation <em>Equation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Equation</em>'.
   * @see com.sandy.xtext.joveNotes.Equation#getEquation()
   * @see #getEquation()
   * @generated
   */
  EAttribute getEquation_Equation();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.Equation#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.sandy.xtext.joveNotes.Equation#getDescription()
   * @see #getEquation()
   * @generated
   */
  EAttribute getEquation_Description();

  /**
   * Returns the meta object for the containment reference list '{@link com.sandy.xtext.joveNotes.Equation#getSymbols <em>Symbols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Symbols</em>'.
   * @see com.sandy.xtext.joveNotes.Equation#getSymbols()
   * @see #getEquation()
   * @generated
   */
  EReference getEquation_Symbols();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.EqSymbol <em>Eq Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Eq Symbol</em>'.
   * @see com.sandy.xtext.joveNotes.EqSymbol
   * @generated
   */
  EClass getEqSymbol();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.EqSymbol#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symbol</em>'.
   * @see com.sandy.xtext.joveNotes.EqSymbol#getSymbol()
   * @see #getEqSymbol()
   * @generated
   */
  EAttribute getEqSymbol_Symbol();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.EqSymbol#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.sandy.xtext.joveNotes.EqSymbol#getDescription()
   * @see #getEqSymbol()
   * @generated
   */
  EAttribute getEqSymbol_Description();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.RefToContext <em>Ref To Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref To Context</em>'.
   * @see com.sandy.xtext.joveNotes.RefToContext
   * @generated
   */
  EClass getRefToContext();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.RefToContext#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Context</em>'.
   * @see com.sandy.xtext.joveNotes.RefToContext#getContext()
   * @see #getRefToContext()
   * @generated
   */
  EAttribute getRefToContext_Context();

  /**
   * Returns the meta object for the containment reference list '{@link com.sandy.xtext.joveNotes.RefToContext#getQuestions <em>Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questions</em>'.
   * @see com.sandy.xtext.joveNotes.RefToContext#getQuestions()
   * @see #getRefToContext()
   * @generated
   */
  EReference getRefToContext_Questions();

  /**
   * Returns the meta object for class '{@link com.sandy.xtext.joveNotes.CMap <em>CMap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CMap</em>'.
   * @see com.sandy.xtext.joveNotes.CMap
   * @generated
   */
  EClass getCMap();

  /**
   * Returns the meta object for the attribute '{@link com.sandy.xtext.joveNotes.CMap#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see com.sandy.xtext.joveNotes.CMap#getContent()
   * @see #getCMap()
   * @generated
   */
  EAttribute getCMap_Content();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JoveNotesFactory getJoveNotesFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.JoveNotesImpl <em>Jove Notes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getJoveNotes()
     * @generated
     */
    EClass JOVE_NOTES = eINSTANCE.getJoveNotes();

    /**
     * The meta object literal for the '<em><b>Processing Hints</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOVE_NOTES__PROCESSING_HINTS = eINSTANCE.getJoveNotes_ProcessingHints();

    /**
     * The meta object literal for the '<em><b>Chapter Details</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOVE_NOTES__CHAPTER_DETAILS = eINSTANCE.getJoveNotes_ChapterDetails();

    /**
     * The meta object literal for the '<em><b>Notes Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOVE_NOTES__NOTES_ELEMENTS = eINSTANCE.getJoveNotes_NotesElements();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.ProcessingHintsImpl <em>Processing Hints</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.ProcessingHintsImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getProcessingHints()
     * @generated
     */
    EClass PROCESSING_HINTS = eINSTANCE.getProcessingHints();

    /**
     * The meta object literal for the '<em><b>Skip Generation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESSING_HINTS__SKIP_GENERATION = eINSTANCE.getProcessingHints_SkipGeneration();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.ChapterDetailsImpl <em>Chapter Details</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.ChapterDetailsImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getChapterDetails()
     * @generated
     */
    EClass CHAPTER_DETAILS = eINSTANCE.getChapterDetails();

    /**
     * The meta object literal for the '<em><b>Test Paper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHAPTER_DETAILS__TEST_PAPER = eINSTANCE.getChapterDetails_TestPaper();

    /**
     * The meta object literal for the '<em><b>Subject Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHAPTER_DETAILS__SUBJECT_NAME = eINSTANCE.getChapterDetails_SubjectName();

    /**
     * The meta object literal for the '<em><b>Chapter Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHAPTER_DETAILS__CHAPTER_NUMBER = eINSTANCE.getChapterDetails_ChapterNumber();

    /**
     * The meta object literal for the '<em><b>Sub Chapter Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHAPTER_DETAILS__SUB_CHAPTER_NUMBER = eINSTANCE.getChapterDetails_SubChapterNumber();

    /**
     * The meta object literal for the '<em><b>Chapter Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHAPTER_DETAILS__CHAPTER_NAME = eINSTANCE.getChapterDetails_ChapterName();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.NotesElementImpl <em>Notes Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.NotesElementImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getNotesElement()
     * @generated
     */
    EClass NOTES_ELEMENT = eINSTANCE.getNotesElement();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.WordMeaningImpl <em>Word Meaning</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.WordMeaningImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getWordMeaning()
     * @generated
     */
    EClass WORD_MEANING = eINSTANCE.getWordMeaning();

    /**
     * The meta object literal for the '<em><b>Word</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORD_MEANING__WORD = eINSTANCE.getWordMeaning_Word();

    /**
     * The meta object literal for the '<em><b>Meaning</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORD_MEANING__MEANING = eINSTANCE.getWordMeaning_Meaning();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.QuestionAnswerImpl <em>Question Answer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.QuestionAnswerImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getQuestionAnswer()
     * @generated
     */
    EClass QUESTION_ANSWER = eINSTANCE.getQuestionAnswer();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION_ANSWER__QUESTION = eINSTANCE.getQuestionAnswer_Question();

    /**
     * The meta object literal for the '<em><b>Answer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION_ANSWER__ANSWER = eINSTANCE.getQuestionAnswer_Answer();

    /**
     * The meta object literal for the '<em><b>Cmap</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION_ANSWER__CMAP = eINSTANCE.getQuestionAnswer_Cmap();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.FIBImpl <em>FIB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.FIBImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getFIB()
     * @generated
     */
    EClass FIB = eINSTANCE.getFIB();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIB__QUESTION = eINSTANCE.getFIB_Question();

    /**
     * The meta object literal for the '<em><b>Answers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIB__ANSWERS = eINSTANCE.getFIB_Answers();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.DefinitionImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__TERM = eINSTANCE.getDefinition_Term();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__DEFINITION = eINSTANCE.getDefinition_Definition();

    /**
     * The meta object literal for the '<em><b>Cmap</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__CMAP = eINSTANCE.getDefinition_Cmap();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.CharacterImpl <em>Character</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.CharacterImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getCharacter()
     * @generated
     */
    EClass CHARACTER = eINSTANCE.getCharacter();

    /**
     * The meta object literal for the '<em><b>Character</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER__CHARACTER = eINSTANCE.getCharacter_Character();

    /**
     * The meta object literal for the '<em><b>Estimate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER__ESTIMATE = eINSTANCE.getCharacter_Estimate();

    /**
     * The meta object literal for the '<em><b>Cmap</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHARACTER__CMAP = eINSTANCE.getCharacter_Cmap();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.TeacherNoteImpl <em>Teacher Note</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.TeacherNoteImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getTeacherNote()
     * @generated
     */
    EClass TEACHER_NOTE = eINSTANCE.getTeacherNote();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEACHER_NOTE__NOTE = eINSTANCE.getTeacherNote_Note();

    /**
     * The meta object literal for the '<em><b>Cmap</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEACHER_NOTE__CMAP = eINSTANCE.getTeacherNote_Cmap();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.MatchingImpl <em>Matching</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.MatchingImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getMatching()
     * @generated
     */
    EClass MATCHING = eINSTANCE.getMatching();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATCHING__QUESTION = eINSTANCE.getMatching_Question();

    /**
     * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCHING__PAIRS = eINSTANCE.getMatching_Pairs();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.MatchPairImpl <em>Match Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.MatchPairImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getMatchPair()
     * @generated
     */
    EClass MATCH_PAIR = eINSTANCE.getMatchPair();

    /**
     * The meta object literal for the '<em><b>Match Question</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATCH_PAIR__MATCH_QUESTION = eINSTANCE.getMatchPair_MatchQuestion();

    /**
     * The meta object literal for the '<em><b>Match Answer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATCH_PAIR__MATCH_ANSWER = eINSTANCE.getMatchPair_MatchAnswer();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.EventImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__EVENT = eINSTANCE.getEvent_Event();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__TIME = eINSTANCE.getEvent_Time();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.TrueFalseImpl <em>True False</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.TrueFalseImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getTrueFalse()
     * @generated
     */
    EClass TRUE_FALSE = eINSTANCE.getTrueFalse();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRUE_FALSE__STATEMENT = eINSTANCE.getTrueFalse_Statement();

    /**
     * The meta object literal for the '<em><b>Truth Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRUE_FALSE__TRUTH_VALUE = eINSTANCE.getTrueFalse_TruthValue();

    /**
     * The meta object literal for the '<em><b>Justification</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRUE_FALSE__JUSTIFICATION = eINSTANCE.getTrueFalse_Justification();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.ChemEquationImpl <em>Chem Equation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.ChemEquationImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getChemEquation()
     * @generated
     */
    EClass CHEM_EQUATION = eINSTANCE.getChemEquation();

    /**
     * The meta object literal for the '<em><b>Equation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHEM_EQUATION__EQUATION = eINSTANCE.getChemEquation_Equation();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHEM_EQUATION__DESCRIPTION = eINSTANCE.getChemEquation_Description();

    /**
     * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHEM_EQUATION__NOTES = eINSTANCE.getChemEquation_Notes();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.ChemCompoundImpl <em>Chem Compound</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.ChemCompoundImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getChemCompound()
     * @generated
     */
    EClass CHEM_COMPOUND = eINSTANCE.getChemCompound();

    /**
     * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHEM_COMPOUND__SYMBOL = eINSTANCE.getChemCompound_Symbol();

    /**
     * The meta object literal for the '<em><b>Chemical Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHEM_COMPOUND__CHEMICAL_NAME = eINSTANCE.getChemCompound_ChemicalName();

    /**
     * The meta object literal for the '<em><b>Common Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHEM_COMPOUND__COMMON_NAME = eINSTANCE.getChemCompound_CommonName();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.SpellbeeImpl <em>Spellbee</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.SpellbeeImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getSpellbee()
     * @generated
     */
    EClass SPELLBEE = eINSTANCE.getSpellbee();

    /**
     * The meta object literal for the '<em><b>Word</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPELLBEE__WORD = eINSTANCE.getSpellbee_Word();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.ImageLabelImpl <em>Image Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.ImageLabelImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getImageLabel()
     * @generated
     */
    EClass IMAGE_LABEL = eINSTANCE.getImageLabel();

    /**
     * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_LABEL__CAPTION = eINSTANCE.getImageLabel_Caption();

    /**
     * The meta object literal for the '<em><b>Image Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_LABEL__IMAGE_NAME = eINSTANCE.getImageLabel_ImageName();

    /**
     * The meta object literal for the '<em><b>Hotspots</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE_LABEL__HOTSPOTS = eINSTANCE.getImageLabel_Hotspots();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.HotSpotImpl <em>Hot Spot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.HotSpotImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getHotSpot()
     * @generated
     */
    EClass HOT_SPOT = eINSTANCE.getHotSpot();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOT_SPOT__X = eINSTANCE.getHotSpot_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOT_SPOT__Y = eINSTANCE.getHotSpot_Y();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOT_SPOT__LABEL = eINSTANCE.getHotSpot_Label();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.EquationImpl <em>Equation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.EquationImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getEquation()
     * @generated
     */
    EClass EQUATION = eINSTANCE.getEquation();

    /**
     * The meta object literal for the '<em><b>Equation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUATION__EQUATION = eINSTANCE.getEquation_Equation();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUATION__DESCRIPTION = eINSTANCE.getEquation_Description();

    /**
     * The meta object literal for the '<em><b>Symbols</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUATION__SYMBOLS = eINSTANCE.getEquation_Symbols();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.EqSymbolImpl <em>Eq Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.EqSymbolImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getEqSymbol()
     * @generated
     */
    EClass EQ_SYMBOL = eINSTANCE.getEqSymbol();

    /**
     * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQ_SYMBOL__SYMBOL = eINSTANCE.getEqSymbol_Symbol();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQ_SYMBOL__DESCRIPTION = eINSTANCE.getEqSymbol_Description();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.RefToContextImpl <em>Ref To Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.RefToContextImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getRefToContext()
     * @generated
     */
    EClass REF_TO_CONTEXT = eINSTANCE.getRefToContext();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REF_TO_CONTEXT__CONTEXT = eINSTANCE.getRefToContext_Context();

    /**
     * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_TO_CONTEXT__QUESTIONS = eINSTANCE.getRefToContext_Questions();

    /**
     * The meta object literal for the '{@link com.sandy.xtext.joveNotes.impl.CMapImpl <em>CMap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sandy.xtext.joveNotes.impl.CMapImpl
     * @see com.sandy.xtext.joveNotes.impl.JoveNotesPackageImpl#getCMap()
     * @generated
     */
    EClass CMAP = eINSTANCE.getCMap();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CMAP__CONTENT = eINSTANCE.getCMap_Content();

  }

} //JoveNotesPackage