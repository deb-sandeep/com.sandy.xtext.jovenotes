/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.JoveNotesPackage;
import com.sandy.xtext.joveNotes.MultiChoice;
import com.sandy.xtext.joveNotes.Option;
import com.sandy.xtext.joveNotes.Script;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MultiChoiceImpl#getScript <em>Script</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MultiChoiceImpl#getHideFromView <em>Hide From View</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MultiChoiceImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MultiChoiceImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MultiChoiceImpl#getNumOptionsToShow <em>Num Options To Show</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MultiChoiceImpl#getNumOptionsPerRow <em>Num Options Per Row</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MultiChoiceImpl#getExplanation <em>Explanation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiChoiceImpl extends NotesElementImpl implements MultiChoice
{
  /**
   * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScript()
   * @generated
   * @ordered
   */
  protected Script script;

  /**
   * The default value of the '{@link #getHideFromView() <em>Hide From View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHideFromView()
   * @generated
   * @ordered
   */
  protected static final String HIDE_FROM_VIEW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHideFromView() <em>Hide From View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHideFromView()
   * @generated
   * @ordered
   */
  protected String hideFromView = HIDE_FROM_VIEW_EDEFAULT;

  /**
   * The default value of the '{@link #getQuestion() <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestion()
   * @generated
   * @ordered
   */
  protected static final String QUESTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQuestion() <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestion()
   * @generated
   * @ordered
   */
  protected String question = QUESTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected EList<Option> options;

  /**
   * The default value of the '{@link #getNumOptionsToShow() <em>Num Options To Show</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumOptionsToShow()
   * @generated
   * @ordered
   */
  protected static final int NUM_OPTIONS_TO_SHOW_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumOptionsToShow() <em>Num Options To Show</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumOptionsToShow()
   * @generated
   * @ordered
   */
  protected int numOptionsToShow = NUM_OPTIONS_TO_SHOW_EDEFAULT;

  /**
   * The default value of the '{@link #getNumOptionsPerRow() <em>Num Options Per Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumOptionsPerRow()
   * @generated
   * @ordered
   */
  protected static final int NUM_OPTIONS_PER_ROW_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumOptionsPerRow() <em>Num Options Per Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumOptionsPerRow()
   * @generated
   * @ordered
   */
  protected int numOptionsPerRow = NUM_OPTIONS_PER_ROW_EDEFAULT;

  /**
   * The default value of the '{@link #getExplanation() <em>Explanation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExplanation()
   * @generated
   * @ordered
   */
  protected static final String EXPLANATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExplanation() <em>Explanation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExplanation()
   * @generated
   * @ordered
   */
  protected String explanation = EXPLANATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiChoiceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JoveNotesPackage.Literals.MULTI_CHOICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Script getScript()
  {
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScript(Script newScript, NotificationChain msgs)
  {
    Script oldScript = script;
    script = newScript;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MULTI_CHOICE__SCRIPT, oldScript, newScript);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setScript(Script newScript)
  {
    if (newScript != script)
    {
      NotificationChain msgs = null;
      if (script != null)
        msgs = ((InternalEObject)script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.MULTI_CHOICE__SCRIPT, null, msgs);
      if (newScript != null)
        msgs = ((InternalEObject)newScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.MULTI_CHOICE__SCRIPT, null, msgs);
      msgs = basicSetScript(newScript, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MULTI_CHOICE__SCRIPT, newScript, newScript));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getHideFromView()
  {
    return hideFromView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHideFromView(String newHideFromView)
  {
    String oldHideFromView = hideFromView;
    hideFromView = newHideFromView;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MULTI_CHOICE__HIDE_FROM_VIEW, oldHideFromView, hideFromView));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getQuestion()
  {
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQuestion(String newQuestion)
  {
    String oldQuestion = question;
    question = newQuestion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MULTI_CHOICE__QUESTION, oldQuestion, question));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Option> getOptions()
  {
    if (options == null)
    {
      options = new EObjectContainmentEList<Option>(Option.class, this, JoveNotesPackage.MULTI_CHOICE__OPTIONS);
    }
    return options;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNumOptionsToShow()
  {
    return numOptionsToShow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumOptionsToShow(int newNumOptionsToShow)
  {
    int oldNumOptionsToShow = numOptionsToShow;
    numOptionsToShow = newNumOptionsToShow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MULTI_CHOICE__NUM_OPTIONS_TO_SHOW, oldNumOptionsToShow, numOptionsToShow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNumOptionsPerRow()
  {
    return numOptionsPerRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumOptionsPerRow(int newNumOptionsPerRow)
  {
    int oldNumOptionsPerRow = numOptionsPerRow;
    numOptionsPerRow = newNumOptionsPerRow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MULTI_CHOICE__NUM_OPTIONS_PER_ROW, oldNumOptionsPerRow, numOptionsPerRow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getExplanation()
  {
    return explanation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExplanation(String newExplanation)
  {
    String oldExplanation = explanation;
    explanation = newExplanation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MULTI_CHOICE__EXPLANATION, oldExplanation, explanation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JoveNotesPackage.MULTI_CHOICE__SCRIPT:
        return basicSetScript(null, msgs);
      case JoveNotesPackage.MULTI_CHOICE__OPTIONS:
        return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JoveNotesPackage.MULTI_CHOICE__SCRIPT:
        return getScript();
      case JoveNotesPackage.MULTI_CHOICE__HIDE_FROM_VIEW:
        return getHideFromView();
      case JoveNotesPackage.MULTI_CHOICE__QUESTION:
        return getQuestion();
      case JoveNotesPackage.MULTI_CHOICE__OPTIONS:
        return getOptions();
      case JoveNotesPackage.MULTI_CHOICE__NUM_OPTIONS_TO_SHOW:
        return getNumOptionsToShow();
      case JoveNotesPackage.MULTI_CHOICE__NUM_OPTIONS_PER_ROW:
        return getNumOptionsPerRow();
      case JoveNotesPackage.MULTI_CHOICE__EXPLANATION:
        return getExplanation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JoveNotesPackage.MULTI_CHOICE__SCRIPT:
        setScript((Script)newValue);
        return;
      case JoveNotesPackage.MULTI_CHOICE__HIDE_FROM_VIEW:
        setHideFromView((String)newValue);
        return;
      case JoveNotesPackage.MULTI_CHOICE__QUESTION:
        setQuestion((String)newValue);
        return;
      case JoveNotesPackage.MULTI_CHOICE__OPTIONS:
        getOptions().clear();
        getOptions().addAll((Collection<? extends Option>)newValue);
        return;
      case JoveNotesPackage.MULTI_CHOICE__NUM_OPTIONS_TO_SHOW:
        setNumOptionsToShow((Integer)newValue);
        return;
      case JoveNotesPackage.MULTI_CHOICE__NUM_OPTIONS_PER_ROW:
        setNumOptionsPerRow((Integer)newValue);
        return;
      case JoveNotesPackage.MULTI_CHOICE__EXPLANATION:
        setExplanation((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JoveNotesPackage.MULTI_CHOICE__SCRIPT:
        setScript((Script)null);
        return;
      case JoveNotesPackage.MULTI_CHOICE__HIDE_FROM_VIEW:
        setHideFromView(HIDE_FROM_VIEW_EDEFAULT);
        return;
      case JoveNotesPackage.MULTI_CHOICE__QUESTION:
        setQuestion(QUESTION_EDEFAULT);
        return;
      case JoveNotesPackage.MULTI_CHOICE__OPTIONS:
        getOptions().clear();
        return;
      case JoveNotesPackage.MULTI_CHOICE__NUM_OPTIONS_TO_SHOW:
        setNumOptionsToShow(NUM_OPTIONS_TO_SHOW_EDEFAULT);
        return;
      case JoveNotesPackage.MULTI_CHOICE__NUM_OPTIONS_PER_ROW:
        setNumOptionsPerRow(NUM_OPTIONS_PER_ROW_EDEFAULT);
        return;
      case JoveNotesPackage.MULTI_CHOICE__EXPLANATION:
        setExplanation(EXPLANATION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JoveNotesPackage.MULTI_CHOICE__SCRIPT:
        return script != null;
      case JoveNotesPackage.MULTI_CHOICE__HIDE_FROM_VIEW:
        return HIDE_FROM_VIEW_EDEFAULT == null ? hideFromView != null : !HIDE_FROM_VIEW_EDEFAULT.equals(hideFromView);
      case JoveNotesPackage.MULTI_CHOICE__QUESTION:
        return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
      case JoveNotesPackage.MULTI_CHOICE__OPTIONS:
        return options != null && !options.isEmpty();
      case JoveNotesPackage.MULTI_CHOICE__NUM_OPTIONS_TO_SHOW:
        return numOptionsToShow != NUM_OPTIONS_TO_SHOW_EDEFAULT;
      case JoveNotesPackage.MULTI_CHOICE__NUM_OPTIONS_PER_ROW:
        return numOptionsPerRow != NUM_OPTIONS_PER_ROW_EDEFAULT;
      case JoveNotesPackage.MULTI_CHOICE__EXPLANATION:
        return EXPLANATION_EDEFAULT == null ? explanation != null : !EXPLANATION_EDEFAULT.equals(explanation);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (hideFromView: ");
    result.append(hideFromView);
    result.append(", question: ");
    result.append(question);
    result.append(", numOptionsToShow: ");
    result.append(numOptionsToShow);
    result.append(", numOptionsPerRow: ");
    result.append(numOptionsPerRow);
    result.append(", explanation: ");
    result.append(explanation);
    result.append(')');
    return result.toString();
  }

} //MultiChoiceImpl
