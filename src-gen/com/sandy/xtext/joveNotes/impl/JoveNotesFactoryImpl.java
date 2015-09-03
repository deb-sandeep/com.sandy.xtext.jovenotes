/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.CMap;
import com.sandy.xtext.joveNotes.ChapterDetails;
import com.sandy.xtext.joveNotes.ChemCompound;
import com.sandy.xtext.joveNotes.ChemEquation;
import com.sandy.xtext.joveNotes.Definition;
import com.sandy.xtext.joveNotes.EqSymbol;
import com.sandy.xtext.joveNotes.Equation;
import com.sandy.xtext.joveNotes.EvalVar;
import com.sandy.xtext.joveNotes.Event;
import com.sandy.xtext.joveNotes.FIB;
import com.sandy.xtext.joveNotes.HotSpot;
import com.sandy.xtext.joveNotes.ImageLabel;
import com.sandy.xtext.joveNotes.JoveNotes;
import com.sandy.xtext.joveNotes.JoveNotesFactory;
import com.sandy.xtext.joveNotes.JoveNotesPackage;
import com.sandy.xtext.joveNotes.MatchMCQConfig;
import com.sandy.xtext.joveNotes.MatchPair;
import com.sandy.xtext.joveNotes.Matching;
import com.sandy.xtext.joveNotes.MultiChoice;
import com.sandy.xtext.joveNotes.NotesElement;
import com.sandy.xtext.joveNotes.Option;
import com.sandy.xtext.joveNotes.ProcessingHints;
import com.sandy.xtext.joveNotes.QuestionAnswer;
import com.sandy.xtext.joveNotes.RefToContext;
import com.sandy.xtext.joveNotes.Script;
import com.sandy.xtext.joveNotes.ScriptBody;
import com.sandy.xtext.joveNotes.Spellbee;
import com.sandy.xtext.joveNotes.TeacherNote;
import com.sandy.xtext.joveNotes.TrueFalse;
import com.sandy.xtext.joveNotes.WordMeaning;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoveNotesFactoryImpl extends EFactoryImpl implements JoveNotesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JoveNotesFactory init()
  {
    try
    {
      JoveNotesFactory theJoveNotesFactory = (JoveNotesFactory)EPackage.Registry.INSTANCE.getEFactory(JoveNotesPackage.eNS_URI);
      if (theJoveNotesFactory != null)
      {
        return theJoveNotesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JoveNotesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoveNotesFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JoveNotesPackage.JOVE_NOTES: return createJoveNotes();
      case JoveNotesPackage.PROCESSING_HINTS: return createProcessingHints();
      case JoveNotesPackage.CHAPTER_DETAILS: return createChapterDetails();
      case JoveNotesPackage.NOTES_ELEMENT: return createNotesElement();
      case JoveNotesPackage.WORD_MEANING: return createWordMeaning();
      case JoveNotesPackage.QUESTION_ANSWER: return createQuestionAnswer();
      case JoveNotesPackage.FIB: return createFIB();
      case JoveNotesPackage.DEFINITION: return createDefinition();
      case JoveNotesPackage.CHARACTER: return createCharacter();
      case JoveNotesPackage.TEACHER_NOTE: return createTeacherNote();
      case JoveNotesPackage.MATCHING: return createMatching();
      case JoveNotesPackage.MATCH_PAIR: return createMatchPair();
      case JoveNotesPackage.MATCH_MCQ_CONFIG: return createMatchMCQConfig();
      case JoveNotesPackage.EVENT: return createEvent();
      case JoveNotesPackage.TRUE_FALSE: return createTrueFalse();
      case JoveNotesPackage.CHEM_EQUATION: return createChemEquation();
      case JoveNotesPackage.CHEM_COMPOUND: return createChemCompound();
      case JoveNotesPackage.SPELLBEE: return createSpellbee();
      case JoveNotesPackage.IMAGE_LABEL: return createImageLabel();
      case JoveNotesPackage.HOT_SPOT: return createHotSpot();
      case JoveNotesPackage.EQUATION: return createEquation();
      case JoveNotesPackage.EQ_SYMBOL: return createEqSymbol();
      case JoveNotesPackage.REF_TO_CONTEXT: return createRefToContext();
      case JoveNotesPackage.MULTI_CHOICE: return createMultiChoice();
      case JoveNotesPackage.OPTION: return createOption();
      case JoveNotesPackage.CMAP: return createCMap();
      case JoveNotesPackage.SCRIPT: return createScript();
      case JoveNotesPackage.EVAL_VAR: return createEvalVar();
      case JoveNotesPackage.SCRIPT_BODY: return createScriptBody();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoveNotes createJoveNotes()
  {
    JoveNotesImpl joveNotes = new JoveNotesImpl();
    return joveNotes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessingHints createProcessingHints()
  {
    ProcessingHintsImpl processingHints = new ProcessingHintsImpl();
    return processingHints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChapterDetails createChapterDetails()
  {
    ChapterDetailsImpl chapterDetails = new ChapterDetailsImpl();
    return chapterDetails;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotesElement createNotesElement()
  {
    NotesElementImpl notesElement = new NotesElementImpl();
    return notesElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WordMeaning createWordMeaning()
  {
    WordMeaningImpl wordMeaning = new WordMeaningImpl();
    return wordMeaning;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuestionAnswer createQuestionAnswer()
  {
    QuestionAnswerImpl questionAnswer = new QuestionAnswerImpl();
    return questionAnswer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FIB createFIB()
  {
    FIBImpl fib = new FIBImpl();
    return fib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.sandy.xtext.joveNotes.Character createCharacter()
  {
    CharacterImpl character = new CharacterImpl();
    return character;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TeacherNote createTeacherNote()
  {
    TeacherNoteImpl teacherNote = new TeacherNoteImpl();
    return teacherNote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matching createMatching()
  {
    MatchingImpl matching = new MatchingImpl();
    return matching;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatchPair createMatchPair()
  {
    MatchPairImpl matchPair = new MatchPairImpl();
    return matchPair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatchMCQConfig createMatchMCQConfig()
  {
    MatchMCQConfigImpl matchMCQConfig = new MatchMCQConfigImpl();
    return matchMCQConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrueFalse createTrueFalse()
  {
    TrueFalseImpl trueFalse = new TrueFalseImpl();
    return trueFalse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChemEquation createChemEquation()
  {
    ChemEquationImpl chemEquation = new ChemEquationImpl();
    return chemEquation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChemCompound createChemCompound()
  {
    ChemCompoundImpl chemCompound = new ChemCompoundImpl();
    return chemCompound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Spellbee createSpellbee()
  {
    SpellbeeImpl spellbee = new SpellbeeImpl();
    return spellbee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageLabel createImageLabel()
  {
    ImageLabelImpl imageLabel = new ImageLabelImpl();
    return imageLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HotSpot createHotSpot()
  {
    HotSpotImpl hotSpot = new HotSpotImpl();
    return hotSpot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equation createEquation()
  {
    EquationImpl equation = new EquationImpl();
    return equation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqSymbol createEqSymbol()
  {
    EqSymbolImpl eqSymbol = new EqSymbolImpl();
    return eqSymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefToContext createRefToContext()
  {
    RefToContextImpl refToContext = new RefToContextImpl();
    return refToContext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiChoice createMultiChoice()
  {
    MultiChoiceImpl multiChoice = new MultiChoiceImpl();
    return multiChoice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Option createOption()
  {
    OptionImpl option = new OptionImpl();
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CMap createCMap()
  {
    CMapImpl cMap = new CMapImpl();
    return cMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script createScript()
  {
    ScriptImpl script = new ScriptImpl();
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvalVar createEvalVar()
  {
    EvalVarImpl evalVar = new EvalVarImpl();
    return evalVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptBody createScriptBody()
  {
    ScriptBodyImpl scriptBody = new ScriptBodyImpl();
    return scriptBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoveNotesPackage getJoveNotesPackage()
  {
    return (JoveNotesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JoveNotesPackage getPackage()
  {
    return JoveNotesPackage.eINSTANCE;
  }

} //JoveNotesFactoryImpl
