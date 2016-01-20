/**
 */
package com.sandy.xtext.joveNotes.util;

import com.sandy.xtext.joveNotes.CMap;
import com.sandy.xtext.joveNotes.ChapterDetails;
import com.sandy.xtext.joveNotes.ChemCompound;
import com.sandy.xtext.joveNotes.ChemEquation;
import com.sandy.xtext.joveNotes.Definition;
import com.sandy.xtext.joveNotes.EqSymbol;
import com.sandy.xtext.joveNotes.Equation;
import com.sandy.xtext.joveNotes.EvalVar;
import com.sandy.xtext.joveNotes.Event;
import com.sandy.xtext.joveNotes.Exercise;
import com.sandy.xtext.joveNotes.FIB;
import com.sandy.xtext.joveNotes.HotSpot;
import com.sandy.xtext.joveNotes.ImageLabel;
import com.sandy.xtext.joveNotes.JoveNotes;
import com.sandy.xtext.joveNotes.JoveNotesPackage;
import com.sandy.xtext.joveNotes.MatchMCQConfig;
import com.sandy.xtext.joveNotes.MatchPair;
import com.sandy.xtext.joveNotes.Matching;
import com.sandy.xtext.joveNotes.MultiChoice;
import com.sandy.xtext.joveNotes.NotesElement;
import com.sandy.xtext.joveNotes.Option;
import com.sandy.xtext.joveNotes.ProcessingHints;
import com.sandy.xtext.joveNotes.QuestionAnswer;
import com.sandy.xtext.joveNotes.RTCElement;
import com.sandy.xtext.joveNotes.RefToContext;
import com.sandy.xtext.joveNotes.Script;
import com.sandy.xtext.joveNotes.ScriptBody;
import com.sandy.xtext.joveNotes.Spellbee;
import com.sandy.xtext.joveNotes.TeacherNote;
import com.sandy.xtext.joveNotes.TrueFalse;
import com.sandy.xtext.joveNotes.WordMeaning;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage
 * @generated
 */
public class JoveNotesSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JoveNotesPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoveNotesSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = JoveNotesPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case JoveNotesPackage.JOVE_NOTES:
      {
        JoveNotes joveNotes = (JoveNotes)theEObject;
        T result = caseJoveNotes(joveNotes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.PROCESSING_HINTS:
      {
        ProcessingHints processingHints = (ProcessingHints)theEObject;
        T result = caseProcessingHints(processingHints);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.CHAPTER_DETAILS:
      {
        ChapterDetails chapterDetails = (ChapterDetails)theEObject;
        T result = caseChapterDetails(chapterDetails);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.NOTES_ELEMENT:
      {
        NotesElement notesElement = (NotesElement)theEObject;
        T result = caseNotesElement(notesElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.WORD_MEANING:
      {
        WordMeaning wordMeaning = (WordMeaning)theEObject;
        T result = caseWordMeaning(wordMeaning);
        if (result == null) result = caseNotesElement(wordMeaning);
        if (result == null) result = caseRTCElement(wordMeaning);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.QUESTION_ANSWER:
      {
        QuestionAnswer questionAnswer = (QuestionAnswer)theEObject;
        T result = caseQuestionAnswer(questionAnswer);
        if (result == null) result = caseNotesElement(questionAnswer);
        if (result == null) result = caseRTCElement(questionAnswer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.FIB:
      {
        FIB fib = (FIB)theEObject;
        T result = caseFIB(fib);
        if (result == null) result = caseNotesElement(fib);
        if (result == null) result = caseRTCElement(fib);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.DEFINITION:
      {
        Definition definition = (Definition)theEObject;
        T result = caseDefinition(definition);
        if (result == null) result = caseNotesElement(definition);
        if (result == null) result = caseRTCElement(definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.CHARACTER:
      {
        com.sandy.xtext.joveNotes.Character character = (com.sandy.xtext.joveNotes.Character)theEObject;
        T result = caseCharacter(character);
        if (result == null) result = caseNotesElement(character);
        if (result == null) result = caseRTCElement(character);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.TEACHER_NOTE:
      {
        TeacherNote teacherNote = (TeacherNote)theEObject;
        T result = caseTeacherNote(teacherNote);
        if (result == null) result = caseNotesElement(teacherNote);
        if (result == null) result = caseRTCElement(teacherNote);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.MATCHING:
      {
        Matching matching = (Matching)theEObject;
        T result = caseMatching(matching);
        if (result == null) result = caseNotesElement(matching);
        if (result == null) result = caseRTCElement(matching);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.MATCH_PAIR:
      {
        MatchPair matchPair = (MatchPair)theEObject;
        T result = caseMatchPair(matchPair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.MATCH_MCQ_CONFIG:
      {
        MatchMCQConfig matchMCQConfig = (MatchMCQConfig)theEObject;
        T result = caseMatchMCQConfig(matchMCQConfig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = caseNotesElement(event);
        if (result == null) result = caseRTCElement(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.TRUE_FALSE:
      {
        TrueFalse trueFalse = (TrueFalse)theEObject;
        T result = caseTrueFalse(trueFalse);
        if (result == null) result = caseNotesElement(trueFalse);
        if (result == null) result = caseRTCElement(trueFalse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.CHEM_EQUATION:
      {
        ChemEquation chemEquation = (ChemEquation)theEObject;
        T result = caseChemEquation(chemEquation);
        if (result == null) result = caseNotesElement(chemEquation);
        if (result == null) result = caseRTCElement(chemEquation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.CHEM_COMPOUND:
      {
        ChemCompound chemCompound = (ChemCompound)theEObject;
        T result = caseChemCompound(chemCompound);
        if (result == null) result = caseNotesElement(chemCompound);
        if (result == null) result = caseRTCElement(chemCompound);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.SPELLBEE:
      {
        Spellbee spellbee = (Spellbee)theEObject;
        T result = caseSpellbee(spellbee);
        if (result == null) result = caseNotesElement(spellbee);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.IMAGE_LABEL:
      {
        ImageLabel imageLabel = (ImageLabel)theEObject;
        T result = caseImageLabel(imageLabel);
        if (result == null) result = caseNotesElement(imageLabel);
        if (result == null) result = caseRTCElement(imageLabel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.HOT_SPOT:
      {
        HotSpot hotSpot = (HotSpot)theEObject;
        T result = caseHotSpot(hotSpot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.EQUATION:
      {
        Equation equation = (Equation)theEObject;
        T result = caseEquation(equation);
        if (result == null) result = caseNotesElement(equation);
        if (result == null) result = caseRTCElement(equation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.EQ_SYMBOL:
      {
        EqSymbol eqSymbol = (EqSymbol)theEObject;
        T result = caseEqSymbol(eqSymbol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.REF_TO_CONTEXT:
      {
        RefToContext refToContext = (RefToContext)theEObject;
        T result = caseRefToContext(refToContext);
        if (result == null) result = caseNotesElement(refToContext);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.RTC_ELEMENT:
      {
        RTCElement rtcElement = (RTCElement)theEObject;
        T result = caseRTCElement(rtcElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.MULTI_CHOICE:
      {
        MultiChoice multiChoice = (MultiChoice)theEObject;
        T result = caseMultiChoice(multiChoice);
        if (result == null) result = caseNotesElement(multiChoice);
        if (result == null) result = caseRTCElement(multiChoice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.EXERCISE:
      {
        Exercise exercise = (Exercise)theEObject;
        T result = caseExercise(exercise);
        if (result == null) result = caseNotesElement(exercise);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.OPTION:
      {
        Option option = (Option)theEObject;
        T result = caseOption(option);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.CMAP:
      {
        CMap cMap = (CMap)theEObject;
        T result = caseCMap(cMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.SCRIPT:
      {
        Script script = (Script)theEObject;
        T result = caseScript(script);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.EVAL_VAR:
      {
        EvalVar evalVar = (EvalVar)theEObject;
        T result = caseEvalVar(evalVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JoveNotesPackage.SCRIPT_BODY:
      {
        ScriptBody scriptBody = (ScriptBody)theEObject;
        T result = caseScriptBody(scriptBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Jove Notes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Jove Notes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoveNotes(JoveNotes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Processing Hints</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Processing Hints</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessingHints(ProcessingHints object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chapter Details</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chapter Details</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChapterDetails(ChapterDetails object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Notes Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Notes Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotesElement(NotesElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Word Meaning</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Word Meaning</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWordMeaning(WordMeaning object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Question Answer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Question Answer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuestionAnswer(QuestionAnswer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FIB</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FIB</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFIB(FIB object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinition(Definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Character</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Character</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharacter(com.sandy.xtext.joveNotes.Character object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Teacher Note</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Teacher Note</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTeacherNote(TeacherNote object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Matching</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matching</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatching(Matching object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Match Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Match Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatchPair(MatchPair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Match MCQ Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Match MCQ Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatchMCQConfig(MatchMCQConfig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>True False</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>True False</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrueFalse(TrueFalse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chem Equation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chem Equation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChemEquation(ChemEquation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chem Compound</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chem Compound</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChemCompound(ChemCompound object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spellbee</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spellbee</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpellbee(Spellbee object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageLabel(ImageLabel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hot Spot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hot Spot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHotSpot(HotSpot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquation(Equation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Eq Symbol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Eq Symbol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqSymbol(EqSymbol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref To Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref To Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefToContext(RefToContext object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RTC Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RTC Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRTCElement(RTCElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Choice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Choice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiChoice(MultiChoice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exercise</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exercise</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExercise(Exercise object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOption(Option object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CMap</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CMap</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCMap(CMap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Script</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScript(Script object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Eval Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Eval Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvalVar(EvalVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Script Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Script Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScriptBody(ScriptBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //JoveNotesSwitch
