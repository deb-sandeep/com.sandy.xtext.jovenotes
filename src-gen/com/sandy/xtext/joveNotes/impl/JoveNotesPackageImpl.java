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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoveNotesPackageImpl extends EPackageImpl implements JoveNotesPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass joveNotesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processingHintsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chapterDetailsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notesElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wordMeaningEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass questionAnswerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fibEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass characterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass teacherNoteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchPairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchMCQConfigEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trueFalseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chemEquationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chemCompoundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spellbeeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageLabelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hotSpotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eqSymbolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refToContextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiChoiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cMapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evalVarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptBodyEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JoveNotesPackageImpl()
  {
    super(eNS_URI, JoveNotesFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link JoveNotesPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JoveNotesPackage init()
  {
    if (isInited) return (JoveNotesPackage)EPackage.Registry.INSTANCE.getEPackage(JoveNotesPackage.eNS_URI);

    // Obtain or create and register package
    JoveNotesPackageImpl theJoveNotesPackage = (JoveNotesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JoveNotesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JoveNotesPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theJoveNotesPackage.createPackageContents();

    // Initialize created meta-data
    theJoveNotesPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJoveNotesPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(JoveNotesPackage.eNS_URI, theJoveNotesPackage);
    return theJoveNotesPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJoveNotes()
  {
    return joveNotesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoveNotes_ProcessingHints()
  {
    return (EReference)joveNotesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoveNotes_ChapterDetails()
  {
    return (EReference)joveNotesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoveNotes_NotesElements()
  {
    return (EReference)joveNotesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessingHints()
  {
    return processingHintsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcessingHints_SkipGeneration()
  {
    return (EAttribute)processingHintsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcessingHints_SkipGenerationInProduction()
  {
    return (EAttribute)processingHintsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChapterDetails()
  {
    return chapterDetailsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChapterDetails_TestPaper()
  {
    return (EAttribute)chapterDetailsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChapterDetails_SubjectName()
  {
    return (EAttribute)chapterDetailsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChapterDetails_ChapterNumber()
  {
    return (EAttribute)chapterDetailsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChapterDetails_SubChapterNumber()
  {
    return (EAttribute)chapterDetailsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChapterDetails_ChapterName()
  {
    return (EAttribute)chapterDetailsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChapterDetails_ScriptBody()
  {
    return (EReference)chapterDetailsEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotesElement()
  {
    return notesElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNotesElement_Script()
  {
    return (EReference)notesElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNotesElement_HideFromView()
  {
    return (EAttribute)notesElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWordMeaning()
  {
    return wordMeaningEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWordMeaning_Word()
  {
    return (EAttribute)wordMeaningEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWordMeaning_Meaning()
  {
    return (EAttribute)wordMeaningEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuestionAnswer()
  {
    return questionAnswerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestionAnswer_Question()
  {
    return (EAttribute)questionAnswerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestionAnswer_AnswerParts()
  {
    return (EAttribute)questionAnswerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuestionAnswer_Cmap()
  {
    return (EReference)questionAnswerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFIB()
  {
    return fibEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFIB_Question()
  {
    return (EAttribute)fibEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFIB_Answers()
  {
    return (EAttribute)fibEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinition()
  {
    return definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefinition_Term()
  {
    return (EAttribute)definitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefinition_Definition()
  {
    return (EAttribute)definitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinition_Cmap()
  {
    return (EReference)definitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharacter()
  {
    return characterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCharacter_Character()
  {
    return (EAttribute)characterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCharacter_Estimate()
  {
    return (EAttribute)characterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCharacter_Cmap()
  {
    return (EReference)characterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTeacherNote()
  {
    return teacherNoteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTeacherNote_Caption()
  {
    return (EAttribute)teacherNoteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTeacherNote_Note()
  {
    return (EAttribute)teacherNoteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTeacherNote_Cmap()
  {
    return (EReference)teacherNoteEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatching()
  {
    return matchingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatching_SkipReverseQuestion()
  {
    return (EAttribute)matchingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatching_Question()
  {
    return (EAttribute)matchingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatching_Pairs()
  {
    return (EReference)matchingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatching_McqConfig()
  {
    return (EReference)matchingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatchPair()
  {
    return matchPairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatchPair_MatchQuestion()
  {
    return (EAttribute)matchPairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatchPair_MatchAnswer()
  {
    return (EAttribute)matchPairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatchMCQConfig()
  {
    return matchMCQConfigEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatchMCQConfig_ForwardCaption()
  {
    return (EAttribute)matchMCQConfigEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatchMCQConfig_ReverseCaption()
  {
    return (EAttribute)matchMCQConfigEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatchMCQConfig_NumOptionsToShow()
  {
    return (EAttribute)matchMCQConfigEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatchMCQConfig_NumOptionsPerRow()
  {
    return (EAttribute)matchMCQConfigEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvent_Event()
  {
    return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvent_Time()
  {
    return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrueFalse()
  {
    return trueFalseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrueFalse_Statement()
  {
    return (EAttribute)trueFalseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrueFalse_TruthValue()
  {
    return (EAttribute)trueFalseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrueFalse_Justification()
  {
    return (EAttribute)trueFalseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChemEquation()
  {
    return chemEquationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChemEquation_Description()
  {
    return (EAttribute)chemEquationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChemEquation_Reactants()
  {
    return (EAttribute)chemEquationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChemEquation_Produces()
  {
    return (EAttribute)chemEquationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChemEquation_Products()
  {
    return (EAttribute)chemEquationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChemCompound()
  {
    return chemCompoundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChemCompound_Symbol()
  {
    return (EAttribute)chemCompoundEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChemCompound_ChemicalName()
  {
    return (EAttribute)chemCompoundEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChemCompound_CommonName()
  {
    return (EAttribute)chemCompoundEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpellbee()
  {
    return spellbeeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellbee_Word()
  {
    return (EAttribute)spellbeeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImageLabel()
  {
    return imageLabelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageLabel_Caption()
  {
    return (EAttribute)imageLabelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageLabel_ImageName()
  {
    return (EAttribute)imageLabelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageLabel_Hotspots()
  {
    return (EReference)imageLabelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHotSpot()
  {
    return hotSpotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHotSpot_X()
  {
    return (EAttribute)hotSpotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHotSpot_Y()
  {
    return (EAttribute)hotSpotEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHotSpot_Label()
  {
    return (EAttribute)hotSpotEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquation()
  {
    return equationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEquation_Equation()
  {
    return (EAttribute)equationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEquation_Description()
  {
    return (EAttribute)equationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquation_Symbols()
  {
    return (EReference)equationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqSymbol()
  {
    return eqSymbolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEqSymbol_Symbol()
  {
    return (EAttribute)eqSymbolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEqSymbol_Description()
  {
    return (EAttribute)eqSymbolEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefToContext()
  {
    return refToContextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRefToContext_Context()
  {
    return (EAttribute)refToContextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefToContext_NotesElements()
  {
    return (EReference)refToContextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiChoice()
  {
    return multiChoiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiChoice_Question()
  {
    return (EAttribute)multiChoiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiChoice_Options()
  {
    return (EReference)multiChoiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiChoice_NumOptionsToShow()
  {
    return (EAttribute)multiChoiceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiChoice_NumOptionsPerRow()
  {
    return (EAttribute)multiChoiceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiChoice_Explanation()
  {
    return (EAttribute)multiChoiceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOption()
  {
    return optionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOption_OptionValue()
  {
    return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOption_CorrectOption()
  {
    return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCMap()
  {
    return cMapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCMap_Content()
  {
    return (EAttribute)cMapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScript()
  {
    return scriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_EvalVars()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_ScriptBody()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvalVar()
  {
    return evalVarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvalVar_VarName()
  {
    return (EAttribute)evalVarEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvalVar_VarExpression()
  {
    return (EAttribute)evalVarEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScriptBody()
  {
    return scriptBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScriptBody_Script()
  {
    return (EAttribute)scriptBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoveNotesFactory getJoveNotesFactory()
  {
    return (JoveNotesFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    joveNotesEClass = createEClass(JOVE_NOTES);
    createEReference(joveNotesEClass, JOVE_NOTES__PROCESSING_HINTS);
    createEReference(joveNotesEClass, JOVE_NOTES__CHAPTER_DETAILS);
    createEReference(joveNotesEClass, JOVE_NOTES__NOTES_ELEMENTS);

    processingHintsEClass = createEClass(PROCESSING_HINTS);
    createEAttribute(processingHintsEClass, PROCESSING_HINTS__SKIP_GENERATION);
    createEAttribute(processingHintsEClass, PROCESSING_HINTS__SKIP_GENERATION_IN_PRODUCTION);

    chapterDetailsEClass = createEClass(CHAPTER_DETAILS);
    createEAttribute(chapterDetailsEClass, CHAPTER_DETAILS__TEST_PAPER);
    createEAttribute(chapterDetailsEClass, CHAPTER_DETAILS__SUBJECT_NAME);
    createEAttribute(chapterDetailsEClass, CHAPTER_DETAILS__CHAPTER_NUMBER);
    createEAttribute(chapterDetailsEClass, CHAPTER_DETAILS__SUB_CHAPTER_NUMBER);
    createEAttribute(chapterDetailsEClass, CHAPTER_DETAILS__CHAPTER_NAME);
    createEReference(chapterDetailsEClass, CHAPTER_DETAILS__SCRIPT_BODY);

    notesElementEClass = createEClass(NOTES_ELEMENT);
    createEReference(notesElementEClass, NOTES_ELEMENT__SCRIPT);
    createEAttribute(notesElementEClass, NOTES_ELEMENT__HIDE_FROM_VIEW);

    wordMeaningEClass = createEClass(WORD_MEANING);
    createEAttribute(wordMeaningEClass, WORD_MEANING__WORD);
    createEAttribute(wordMeaningEClass, WORD_MEANING__MEANING);

    questionAnswerEClass = createEClass(QUESTION_ANSWER);
    createEAttribute(questionAnswerEClass, QUESTION_ANSWER__QUESTION);
    createEAttribute(questionAnswerEClass, QUESTION_ANSWER__ANSWER_PARTS);
    createEReference(questionAnswerEClass, QUESTION_ANSWER__CMAP);

    fibEClass = createEClass(FIB);
    createEAttribute(fibEClass, FIB__QUESTION);
    createEAttribute(fibEClass, FIB__ANSWERS);

    definitionEClass = createEClass(DEFINITION);
    createEAttribute(definitionEClass, DEFINITION__TERM);
    createEAttribute(definitionEClass, DEFINITION__DEFINITION);
    createEReference(definitionEClass, DEFINITION__CMAP);

    characterEClass = createEClass(CHARACTER);
    createEAttribute(characterEClass, CHARACTER__CHARACTER);
    createEAttribute(characterEClass, CHARACTER__ESTIMATE);
    createEReference(characterEClass, CHARACTER__CMAP);

    teacherNoteEClass = createEClass(TEACHER_NOTE);
    createEAttribute(teacherNoteEClass, TEACHER_NOTE__CAPTION);
    createEAttribute(teacherNoteEClass, TEACHER_NOTE__NOTE);
    createEReference(teacherNoteEClass, TEACHER_NOTE__CMAP);

    matchingEClass = createEClass(MATCHING);
    createEAttribute(matchingEClass, MATCHING__SKIP_REVERSE_QUESTION);
    createEAttribute(matchingEClass, MATCHING__QUESTION);
    createEReference(matchingEClass, MATCHING__PAIRS);
    createEReference(matchingEClass, MATCHING__MCQ_CONFIG);

    matchPairEClass = createEClass(MATCH_PAIR);
    createEAttribute(matchPairEClass, MATCH_PAIR__MATCH_QUESTION);
    createEAttribute(matchPairEClass, MATCH_PAIR__MATCH_ANSWER);

    matchMCQConfigEClass = createEClass(MATCH_MCQ_CONFIG);
    createEAttribute(matchMCQConfigEClass, MATCH_MCQ_CONFIG__FORWARD_CAPTION);
    createEAttribute(matchMCQConfigEClass, MATCH_MCQ_CONFIG__REVERSE_CAPTION);
    createEAttribute(matchMCQConfigEClass, MATCH_MCQ_CONFIG__NUM_OPTIONS_TO_SHOW);
    createEAttribute(matchMCQConfigEClass, MATCH_MCQ_CONFIG__NUM_OPTIONS_PER_ROW);

    eventEClass = createEClass(EVENT);
    createEAttribute(eventEClass, EVENT__EVENT);
    createEAttribute(eventEClass, EVENT__TIME);

    trueFalseEClass = createEClass(TRUE_FALSE);
    createEAttribute(trueFalseEClass, TRUE_FALSE__STATEMENT);
    createEAttribute(trueFalseEClass, TRUE_FALSE__TRUTH_VALUE);
    createEAttribute(trueFalseEClass, TRUE_FALSE__JUSTIFICATION);

    chemEquationEClass = createEClass(CHEM_EQUATION);
    createEAttribute(chemEquationEClass, CHEM_EQUATION__DESCRIPTION);
    createEAttribute(chemEquationEClass, CHEM_EQUATION__REACTANTS);
    createEAttribute(chemEquationEClass, CHEM_EQUATION__PRODUCES);
    createEAttribute(chemEquationEClass, CHEM_EQUATION__PRODUCTS);

    chemCompoundEClass = createEClass(CHEM_COMPOUND);
    createEAttribute(chemCompoundEClass, CHEM_COMPOUND__SYMBOL);
    createEAttribute(chemCompoundEClass, CHEM_COMPOUND__CHEMICAL_NAME);
    createEAttribute(chemCompoundEClass, CHEM_COMPOUND__COMMON_NAME);

    spellbeeEClass = createEClass(SPELLBEE);
    createEAttribute(spellbeeEClass, SPELLBEE__WORD);

    imageLabelEClass = createEClass(IMAGE_LABEL);
    createEAttribute(imageLabelEClass, IMAGE_LABEL__CAPTION);
    createEAttribute(imageLabelEClass, IMAGE_LABEL__IMAGE_NAME);
    createEReference(imageLabelEClass, IMAGE_LABEL__HOTSPOTS);

    hotSpotEClass = createEClass(HOT_SPOT);
    createEAttribute(hotSpotEClass, HOT_SPOT__X);
    createEAttribute(hotSpotEClass, HOT_SPOT__Y);
    createEAttribute(hotSpotEClass, HOT_SPOT__LABEL);

    equationEClass = createEClass(EQUATION);
    createEAttribute(equationEClass, EQUATION__EQUATION);
    createEAttribute(equationEClass, EQUATION__DESCRIPTION);
    createEReference(equationEClass, EQUATION__SYMBOLS);

    eqSymbolEClass = createEClass(EQ_SYMBOL);
    createEAttribute(eqSymbolEClass, EQ_SYMBOL__SYMBOL);
    createEAttribute(eqSymbolEClass, EQ_SYMBOL__DESCRIPTION);

    refToContextEClass = createEClass(REF_TO_CONTEXT);
    createEAttribute(refToContextEClass, REF_TO_CONTEXT__CONTEXT);
    createEReference(refToContextEClass, REF_TO_CONTEXT__NOTES_ELEMENTS);

    multiChoiceEClass = createEClass(MULTI_CHOICE);
    createEAttribute(multiChoiceEClass, MULTI_CHOICE__QUESTION);
    createEReference(multiChoiceEClass, MULTI_CHOICE__OPTIONS);
    createEAttribute(multiChoiceEClass, MULTI_CHOICE__NUM_OPTIONS_TO_SHOW);
    createEAttribute(multiChoiceEClass, MULTI_CHOICE__NUM_OPTIONS_PER_ROW);
    createEAttribute(multiChoiceEClass, MULTI_CHOICE__EXPLANATION);

    optionEClass = createEClass(OPTION);
    createEAttribute(optionEClass, OPTION__OPTION_VALUE);
    createEAttribute(optionEClass, OPTION__CORRECT_OPTION);

    cMapEClass = createEClass(CMAP);
    createEAttribute(cMapEClass, CMAP__CONTENT);

    scriptEClass = createEClass(SCRIPT);
    createEReference(scriptEClass, SCRIPT__EVAL_VARS);
    createEReference(scriptEClass, SCRIPT__SCRIPT_BODY);

    evalVarEClass = createEClass(EVAL_VAR);
    createEAttribute(evalVarEClass, EVAL_VAR__VAR_NAME);
    createEAttribute(evalVarEClass, EVAL_VAR__VAR_EXPRESSION);

    scriptBodyEClass = createEClass(SCRIPT_BODY);
    createEAttribute(scriptBodyEClass, SCRIPT_BODY__SCRIPT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    wordMeaningEClass.getESuperTypes().add(this.getNotesElement());
    questionAnswerEClass.getESuperTypes().add(this.getNotesElement());
    fibEClass.getESuperTypes().add(this.getNotesElement());
    definitionEClass.getESuperTypes().add(this.getNotesElement());
    characterEClass.getESuperTypes().add(this.getNotesElement());
    teacherNoteEClass.getESuperTypes().add(this.getNotesElement());
    matchingEClass.getESuperTypes().add(this.getNotesElement());
    eventEClass.getESuperTypes().add(this.getNotesElement());
    trueFalseEClass.getESuperTypes().add(this.getNotesElement());
    chemEquationEClass.getESuperTypes().add(this.getNotesElement());
    chemCompoundEClass.getESuperTypes().add(this.getNotesElement());
    spellbeeEClass.getESuperTypes().add(this.getNotesElement());
    imageLabelEClass.getESuperTypes().add(this.getNotesElement());
    equationEClass.getESuperTypes().add(this.getNotesElement());
    refToContextEClass.getESuperTypes().add(this.getNotesElement());
    multiChoiceEClass.getESuperTypes().add(this.getNotesElement());

    // Initialize classes and features; add operations and parameters
    initEClass(joveNotesEClass, JoveNotes.class, "JoveNotes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJoveNotes_ProcessingHints(), this.getProcessingHints(), null, "processingHints", null, 0, 1, JoveNotes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoveNotes_ChapterDetails(), this.getChapterDetails(), null, "chapterDetails", null, 0, 1, JoveNotes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoveNotes_NotesElements(), this.getNotesElement(), null, "notesElements", null, 0, -1, JoveNotes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processingHintsEClass, ProcessingHints.class, "ProcessingHints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcessingHints_SkipGeneration(), ecorePackage.getEString(), "skipGeneration", null, 0, 1, ProcessingHints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcessingHints_SkipGenerationInProduction(), ecorePackage.getEString(), "skipGenerationInProduction", null, 0, 1, ProcessingHints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chapterDetailsEClass, ChapterDetails.class, "ChapterDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChapterDetails_TestPaper(), ecorePackage.getEString(), "testPaper", null, 0, 1, ChapterDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChapterDetails_SubjectName(), ecorePackage.getEString(), "subjectName", null, 0, 1, ChapterDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChapterDetails_ChapterNumber(), ecorePackage.getEInt(), "chapterNumber", null, 0, 1, ChapterDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChapterDetails_SubChapterNumber(), ecorePackage.getEInt(), "subChapterNumber", null, 0, 1, ChapterDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChapterDetails_ChapterName(), ecorePackage.getEString(), "chapterName", null, 0, 1, ChapterDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChapterDetails_ScriptBody(), this.getScriptBody(), null, "scriptBody", null, 0, 1, ChapterDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notesElementEClass, NotesElement.class, "NotesElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNotesElement_Script(), this.getScript(), null, "script", null, 0, 1, NotesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNotesElement_HideFromView(), ecorePackage.getEString(), "hideFromView", null, 0, 1, NotesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wordMeaningEClass, WordMeaning.class, "WordMeaning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWordMeaning_Word(), ecorePackage.getEString(), "word", null, 0, 1, WordMeaning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWordMeaning_Meaning(), ecorePackage.getEString(), "meaning", null, 0, 1, WordMeaning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(questionAnswerEClass, QuestionAnswer.class, "QuestionAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuestionAnswer_Question(), ecorePackage.getEString(), "question", null, 0, 1, QuestionAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuestionAnswer_AnswerParts(), ecorePackage.getEString(), "answerParts", null, 0, -1, QuestionAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuestionAnswer_Cmap(), this.getCMap(), null, "cmap", null, 0, 1, QuestionAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fibEClass, com.sandy.xtext.joveNotes.FIB.class, "FIB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFIB_Question(), ecorePackage.getEString(), "question", null, 0, 1, com.sandy.xtext.joveNotes.FIB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFIB_Answers(), ecorePackage.getEString(), "answers", null, 0, -1, com.sandy.xtext.joveNotes.FIB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefinition_Term(), ecorePackage.getEString(), "term", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefinition_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefinition_Cmap(), this.getCMap(), null, "cmap", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(characterEClass, com.sandy.xtext.joveNotes.Character.class, "Character", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCharacter_Character(), ecorePackage.getEString(), "character", null, 0, 1, com.sandy.xtext.joveNotes.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCharacter_Estimate(), ecorePackage.getEString(), "estimate", null, 0, 1, com.sandy.xtext.joveNotes.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCharacter_Cmap(), this.getCMap(), null, "cmap", null, 0, 1, com.sandy.xtext.joveNotes.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(teacherNoteEClass, TeacherNote.class, "TeacherNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTeacherNote_Caption(), ecorePackage.getEString(), "caption", null, 0, 1, TeacherNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTeacherNote_Note(), ecorePackage.getEString(), "note", null, 0, 1, TeacherNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTeacherNote_Cmap(), this.getCMap(), null, "cmap", null, 0, 1, TeacherNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matchingEClass, Matching.class, "Matching", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMatching_SkipReverseQuestion(), ecorePackage.getEString(), "skipReverseQuestion", null, 0, 1, Matching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMatching_Question(), ecorePackage.getEString(), "question", null, 0, 1, Matching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatching_Pairs(), this.getMatchPair(), null, "pairs", null, 0, -1, Matching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatching_McqConfig(), this.getMatchMCQConfig(), null, "mcqConfig", null, 0, 1, Matching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matchPairEClass, MatchPair.class, "MatchPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMatchPair_MatchQuestion(), ecorePackage.getEString(), "matchQuestion", null, 0, 1, MatchPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMatchPair_MatchAnswer(), ecorePackage.getEString(), "matchAnswer", null, 0, 1, MatchPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matchMCQConfigEClass, MatchMCQConfig.class, "MatchMCQConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMatchMCQConfig_ForwardCaption(), ecorePackage.getEString(), "forwardCaption", null, 0, 1, MatchMCQConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMatchMCQConfig_ReverseCaption(), ecorePackage.getEString(), "reverseCaption", null, 0, 1, MatchMCQConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMatchMCQConfig_NumOptionsToShow(), ecorePackage.getEInt(), "numOptionsToShow", null, 0, 1, MatchMCQConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMatchMCQConfig_NumOptionsPerRow(), ecorePackage.getEInt(), "numOptionsPerRow", null, 0, 1, MatchMCQConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvent_Event(), ecorePackage.getEString(), "event", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvent_Time(), ecorePackage.getEString(), "time", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trueFalseEClass, TrueFalse.class, "TrueFalse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTrueFalse_Statement(), ecorePackage.getEString(), "statement", null, 0, 1, TrueFalse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTrueFalse_TruthValue(), ecorePackage.getEString(), "truthValue", null, 0, 1, TrueFalse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTrueFalse_Justification(), ecorePackage.getEString(), "justification", null, 0, 1, TrueFalse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chemEquationEClass, ChemEquation.class, "ChemEquation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChemEquation_Description(), ecorePackage.getEString(), "description", null, 0, 1, ChemEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChemEquation_Reactants(), ecorePackage.getEString(), "reactants", null, 0, 1, ChemEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChemEquation_Produces(), ecorePackage.getEString(), "produces", null, 0, 1, ChemEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChemEquation_Products(), ecorePackage.getEString(), "products", null, 0, 1, ChemEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chemCompoundEClass, ChemCompound.class, "ChemCompound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChemCompound_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, ChemCompound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChemCompound_ChemicalName(), ecorePackage.getEString(), "chemicalName", null, 0, 1, ChemCompound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChemCompound_CommonName(), ecorePackage.getEString(), "commonName", null, 0, 1, ChemCompound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spellbeeEClass, Spellbee.class, "Spellbee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpellbee_Word(), ecorePackage.getEString(), "word", null, 0, 1, Spellbee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imageLabelEClass, ImageLabel.class, "ImageLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImageLabel_Caption(), ecorePackage.getEString(), "caption", null, 0, 1, ImageLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImageLabel_ImageName(), ecorePackage.getEString(), "imageName", null, 0, 1, ImageLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImageLabel_Hotspots(), this.getHotSpot(), null, "hotspots", null, 0, -1, ImageLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hotSpotEClass, HotSpot.class, "HotSpot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHotSpot_X(), ecorePackage.getEInt(), "x", null, 0, 1, HotSpot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHotSpot_Y(), ecorePackage.getEInt(), "y", null, 0, 1, HotSpot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHotSpot_Label(), ecorePackage.getEString(), "label", null, 0, 1, HotSpot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equationEClass, Equation.class, "Equation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEquation_Equation(), ecorePackage.getEString(), "equation", null, 0, 1, Equation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEquation_Description(), ecorePackage.getEString(), "description", null, 0, 1, Equation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEquation_Symbols(), this.getEqSymbol(), null, "symbols", null, 0, -1, Equation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eqSymbolEClass, EqSymbol.class, "EqSymbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEqSymbol_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, EqSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEqSymbol_Description(), ecorePackage.getEString(), "description", null, 0, 1, EqSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refToContextEClass, RefToContext.class, "RefToContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRefToContext_Context(), ecorePackage.getEString(), "context", null, 0, 1, RefToContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRefToContext_NotesElements(), this.getNotesElement(), null, "notesElements", null, 0, -1, RefToContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiChoiceEClass, MultiChoice.class, "MultiChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiChoice_Question(), ecorePackage.getEString(), "question", null, 0, 1, MultiChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiChoice_Options(), this.getOption(), null, "options", null, 0, -1, MultiChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiChoice_NumOptionsToShow(), ecorePackage.getEInt(), "numOptionsToShow", null, 0, 1, MultiChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiChoice_NumOptionsPerRow(), ecorePackage.getEInt(), "numOptionsPerRow", null, 0, 1, MultiChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiChoice_Explanation(), ecorePackage.getEString(), "explanation", null, 0, 1, MultiChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOption_OptionValue(), ecorePackage.getEString(), "optionValue", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOption_CorrectOption(), ecorePackage.getEString(), "correctOption", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cMapEClass, CMap.class, "CMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCMap_Content(), ecorePackage.getEString(), "content", null, 0, 1, CMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScript_EvalVars(), this.getEvalVar(), null, "evalVars", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScript_ScriptBody(), this.getScriptBody(), null, "scriptBody", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evalVarEClass, EvalVar.class, "EvalVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvalVar_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, EvalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvalVar_VarExpression(), ecorePackage.getEString(), "varExpression", null, 0, 1, EvalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scriptBodyEClass, ScriptBody.class, "ScriptBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScriptBody_Script(), ecorePackage.getEString(), "script", null, 0, 1, ScriptBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //JoveNotesPackageImpl
