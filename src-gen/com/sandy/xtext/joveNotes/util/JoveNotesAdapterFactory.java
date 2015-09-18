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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage
 * @generated
 */
public class JoveNotesAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JoveNotesPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoveNotesAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JoveNotesPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JoveNotesSwitch<Adapter> modelSwitch =
    new JoveNotesSwitch<Adapter>()
    {
      @Override
      public Adapter caseJoveNotes(JoveNotes object)
      {
        return createJoveNotesAdapter();
      }
      @Override
      public Adapter caseProcessingHints(ProcessingHints object)
      {
        return createProcessingHintsAdapter();
      }
      @Override
      public Adapter caseChapterDetails(ChapterDetails object)
      {
        return createChapterDetailsAdapter();
      }
      @Override
      public Adapter caseNotesElement(NotesElement object)
      {
        return createNotesElementAdapter();
      }
      @Override
      public Adapter caseWordMeaning(WordMeaning object)
      {
        return createWordMeaningAdapter();
      }
      @Override
      public Adapter caseQuestionAnswer(QuestionAnswer object)
      {
        return createQuestionAnswerAdapter();
      }
      @Override
      public Adapter caseFIB(FIB object)
      {
        return createFIBAdapter();
      }
      @Override
      public Adapter caseDefinition(Definition object)
      {
        return createDefinitionAdapter();
      }
      @Override
      public Adapter caseCharacter(com.sandy.xtext.joveNotes.Character object)
      {
        return createCharacterAdapter();
      }
      @Override
      public Adapter caseTeacherNote(TeacherNote object)
      {
        return createTeacherNoteAdapter();
      }
      @Override
      public Adapter caseMatching(Matching object)
      {
        return createMatchingAdapter();
      }
      @Override
      public Adapter caseMatchPair(MatchPair object)
      {
        return createMatchPairAdapter();
      }
      @Override
      public Adapter caseMatchMCQConfig(MatchMCQConfig object)
      {
        return createMatchMCQConfigAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseTrueFalse(TrueFalse object)
      {
        return createTrueFalseAdapter();
      }
      @Override
      public Adapter caseChemEquation(ChemEquation object)
      {
        return createChemEquationAdapter();
      }
      @Override
      public Adapter caseChemCompound(ChemCompound object)
      {
        return createChemCompoundAdapter();
      }
      @Override
      public Adapter caseSpellbee(Spellbee object)
      {
        return createSpellbeeAdapter();
      }
      @Override
      public Adapter caseImageLabel(ImageLabel object)
      {
        return createImageLabelAdapter();
      }
      @Override
      public Adapter caseHotSpot(HotSpot object)
      {
        return createHotSpotAdapter();
      }
      @Override
      public Adapter caseEquation(Equation object)
      {
        return createEquationAdapter();
      }
      @Override
      public Adapter caseEqSymbol(EqSymbol object)
      {
        return createEqSymbolAdapter();
      }
      @Override
      public Adapter caseRefToContext(RefToContext object)
      {
        return createRefToContextAdapter();
      }
      @Override
      public Adapter caseRTCElement(RTCElement object)
      {
        return createRTCElementAdapter();
      }
      @Override
      public Adapter caseMultiChoice(MultiChoice object)
      {
        return createMultiChoiceAdapter();
      }
      @Override
      public Adapter caseOption(Option object)
      {
        return createOptionAdapter();
      }
      @Override
      public Adapter caseCMap(CMap object)
      {
        return createCMapAdapter();
      }
      @Override
      public Adapter caseScript(Script object)
      {
        return createScriptAdapter();
      }
      @Override
      public Adapter caseEvalVar(EvalVar object)
      {
        return createEvalVarAdapter();
      }
      @Override
      public Adapter caseScriptBody(ScriptBody object)
      {
        return createScriptBodyAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.JoveNotes <em>Jove Notes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.JoveNotes
   * @generated
   */
  public Adapter createJoveNotesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.ProcessingHints <em>Processing Hints</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.ProcessingHints
   * @generated
   */
  public Adapter createProcessingHintsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.ChapterDetails <em>Chapter Details</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.ChapterDetails
   * @generated
   */
  public Adapter createChapterDetailsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.NotesElement <em>Notes Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.NotesElement
   * @generated
   */
  public Adapter createNotesElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.WordMeaning <em>Word Meaning</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.WordMeaning
   * @generated
   */
  public Adapter createWordMeaningAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.QuestionAnswer <em>Question Answer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.QuestionAnswer
   * @generated
   */
  public Adapter createQuestionAnswerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.FIB <em>FIB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.FIB
   * @generated
   */
  public Adapter createFIBAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.Definition
   * @generated
   */
  public Adapter createDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.Character <em>Character</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.Character
   * @generated
   */
  public Adapter createCharacterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.TeacherNote <em>Teacher Note</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.TeacherNote
   * @generated
   */
  public Adapter createTeacherNoteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.Matching <em>Matching</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.Matching
   * @generated
   */
  public Adapter createMatchingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.MatchPair <em>Match Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.MatchPair
   * @generated
   */
  public Adapter createMatchPairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.MatchMCQConfig <em>Match MCQ Config</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.MatchMCQConfig
   * @generated
   */
  public Adapter createMatchMCQConfigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.TrueFalse <em>True False</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.TrueFalse
   * @generated
   */
  public Adapter createTrueFalseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.ChemEquation <em>Chem Equation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.ChemEquation
   * @generated
   */
  public Adapter createChemEquationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.ChemCompound <em>Chem Compound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.ChemCompound
   * @generated
   */
  public Adapter createChemCompoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.Spellbee <em>Spellbee</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.Spellbee
   * @generated
   */
  public Adapter createSpellbeeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.ImageLabel <em>Image Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.ImageLabel
   * @generated
   */
  public Adapter createImageLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.HotSpot <em>Hot Spot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.HotSpot
   * @generated
   */
  public Adapter createHotSpotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.Equation <em>Equation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.Equation
   * @generated
   */
  public Adapter createEquationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.EqSymbol <em>Eq Symbol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.EqSymbol
   * @generated
   */
  public Adapter createEqSymbolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.RefToContext <em>Ref To Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.RefToContext
   * @generated
   */
  public Adapter createRefToContextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.RTCElement <em>RTC Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.RTCElement
   * @generated
   */
  public Adapter createRTCElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.MultiChoice <em>Multi Choice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.MultiChoice
   * @generated
   */
  public Adapter createMultiChoiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.Option
   * @generated
   */
  public Adapter createOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.CMap <em>CMap</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.CMap
   * @generated
   */
  public Adapter createCMapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.Script
   * @generated
   */
  public Adapter createScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.EvalVar <em>Eval Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.EvalVar
   * @generated
   */
  public Adapter createEvalVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sandy.xtext.joveNotes.ScriptBody <em>Script Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sandy.xtext.joveNotes.ScriptBody
   * @generated
   */
  public Adapter createScriptBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //JoveNotesAdapterFactory
