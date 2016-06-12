/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.JoveNotesPackage;
import com.sandy.xtext.joveNotes.MatchMCQConfig;
import com.sandy.xtext.joveNotes.MatchPair;
import com.sandy.xtext.joveNotes.Matching;
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
 * An implementation of the model object '<em><b>Matching</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MatchingImpl#getScript <em>Script</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MatchingImpl#getHideFromView <em>Hide From View</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MatchingImpl#getSkipReverseQuestion <em>Skip Reverse Question</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MatchingImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MatchingImpl#getPairs <em>Pairs</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MatchingImpl#getMcqConfig <em>Mcq Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchingImpl extends NotesElementImpl implements Matching
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
   * The default value of the '{@link #getSkipReverseQuestion() <em>Skip Reverse Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkipReverseQuestion()
   * @generated
   * @ordered
   */
  protected static final String SKIP_REVERSE_QUESTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSkipReverseQuestion() <em>Skip Reverse Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkipReverseQuestion()
   * @generated
   * @ordered
   */
  protected String skipReverseQuestion = SKIP_REVERSE_QUESTION_EDEFAULT;

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
   * The cached value of the '{@link #getPairs() <em>Pairs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPairs()
   * @generated
   * @ordered
   */
  protected EList<MatchPair> pairs;

  /**
   * The cached value of the '{@link #getMcqConfig() <em>Mcq Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMcqConfig()
   * @generated
   * @ordered
   */
  protected MatchMCQConfig mcqConfig;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MatchingImpl()
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
    return JoveNotesPackage.Literals.MATCHING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MATCHING__SCRIPT, oldScript, newScript);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScript(Script newScript)
  {
    if (newScript != script)
    {
      NotificationChain msgs = null;
      if (script != null)
        msgs = ((InternalEObject)script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.MATCHING__SCRIPT, null, msgs);
      if (newScript != null)
        msgs = ((InternalEObject)newScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.MATCHING__SCRIPT, null, msgs);
      msgs = basicSetScript(newScript, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MATCHING__SCRIPT, newScript, newScript));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHideFromView()
  {
    return hideFromView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHideFromView(String newHideFromView)
  {
    String oldHideFromView = hideFromView;
    hideFromView = newHideFromView;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MATCHING__HIDE_FROM_VIEW, oldHideFromView, hideFromView));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSkipReverseQuestion()
  {
    return skipReverseQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSkipReverseQuestion(String newSkipReverseQuestion)
  {
    String oldSkipReverseQuestion = skipReverseQuestion;
    skipReverseQuestion = newSkipReverseQuestion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MATCHING__SKIP_REVERSE_QUESTION, oldSkipReverseQuestion, skipReverseQuestion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQuestion()
  {
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuestion(String newQuestion)
  {
    String oldQuestion = question;
    question = newQuestion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MATCHING__QUESTION, oldQuestion, question));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MatchPair> getPairs()
  {
    if (pairs == null)
    {
      pairs = new EObjectContainmentEList<MatchPair>(MatchPair.class, this, JoveNotesPackage.MATCHING__PAIRS);
    }
    return pairs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatchMCQConfig getMcqConfig()
  {
    return mcqConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMcqConfig(MatchMCQConfig newMcqConfig, NotificationChain msgs)
  {
    MatchMCQConfig oldMcqConfig = mcqConfig;
    mcqConfig = newMcqConfig;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MATCHING__MCQ_CONFIG, oldMcqConfig, newMcqConfig);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMcqConfig(MatchMCQConfig newMcqConfig)
  {
    if (newMcqConfig != mcqConfig)
    {
      NotificationChain msgs = null;
      if (mcqConfig != null)
        msgs = ((InternalEObject)mcqConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.MATCHING__MCQ_CONFIG, null, msgs);
      if (newMcqConfig != null)
        msgs = ((InternalEObject)newMcqConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.MATCHING__MCQ_CONFIG, null, msgs);
      msgs = basicSetMcqConfig(newMcqConfig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MATCHING__MCQ_CONFIG, newMcqConfig, newMcqConfig));
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
      case JoveNotesPackage.MATCHING__SCRIPT:
        return basicSetScript(null, msgs);
      case JoveNotesPackage.MATCHING__PAIRS:
        return ((InternalEList<?>)getPairs()).basicRemove(otherEnd, msgs);
      case JoveNotesPackage.MATCHING__MCQ_CONFIG:
        return basicSetMcqConfig(null, msgs);
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
      case JoveNotesPackage.MATCHING__SCRIPT:
        return getScript();
      case JoveNotesPackage.MATCHING__HIDE_FROM_VIEW:
        return getHideFromView();
      case JoveNotesPackage.MATCHING__SKIP_REVERSE_QUESTION:
        return getSkipReverseQuestion();
      case JoveNotesPackage.MATCHING__QUESTION:
        return getQuestion();
      case JoveNotesPackage.MATCHING__PAIRS:
        return getPairs();
      case JoveNotesPackage.MATCHING__MCQ_CONFIG:
        return getMcqConfig();
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
      case JoveNotesPackage.MATCHING__SCRIPT:
        setScript((Script)newValue);
        return;
      case JoveNotesPackage.MATCHING__HIDE_FROM_VIEW:
        setHideFromView((String)newValue);
        return;
      case JoveNotesPackage.MATCHING__SKIP_REVERSE_QUESTION:
        setSkipReverseQuestion((String)newValue);
        return;
      case JoveNotesPackage.MATCHING__QUESTION:
        setQuestion((String)newValue);
        return;
      case JoveNotesPackage.MATCHING__PAIRS:
        getPairs().clear();
        getPairs().addAll((Collection<? extends MatchPair>)newValue);
        return;
      case JoveNotesPackage.MATCHING__MCQ_CONFIG:
        setMcqConfig((MatchMCQConfig)newValue);
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
      case JoveNotesPackage.MATCHING__SCRIPT:
        setScript((Script)null);
        return;
      case JoveNotesPackage.MATCHING__HIDE_FROM_VIEW:
        setHideFromView(HIDE_FROM_VIEW_EDEFAULT);
        return;
      case JoveNotesPackage.MATCHING__SKIP_REVERSE_QUESTION:
        setSkipReverseQuestion(SKIP_REVERSE_QUESTION_EDEFAULT);
        return;
      case JoveNotesPackage.MATCHING__QUESTION:
        setQuestion(QUESTION_EDEFAULT);
        return;
      case JoveNotesPackage.MATCHING__PAIRS:
        getPairs().clear();
        return;
      case JoveNotesPackage.MATCHING__MCQ_CONFIG:
        setMcqConfig((MatchMCQConfig)null);
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
      case JoveNotesPackage.MATCHING__SCRIPT:
        return script != null;
      case JoveNotesPackage.MATCHING__HIDE_FROM_VIEW:
        return HIDE_FROM_VIEW_EDEFAULT == null ? hideFromView != null : !HIDE_FROM_VIEW_EDEFAULT.equals(hideFromView);
      case JoveNotesPackage.MATCHING__SKIP_REVERSE_QUESTION:
        return SKIP_REVERSE_QUESTION_EDEFAULT == null ? skipReverseQuestion != null : !SKIP_REVERSE_QUESTION_EDEFAULT.equals(skipReverseQuestion);
      case JoveNotesPackage.MATCHING__QUESTION:
        return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
      case JoveNotesPackage.MATCHING__PAIRS:
        return pairs != null && !pairs.isEmpty();
      case JoveNotesPackage.MATCHING__MCQ_CONFIG:
        return mcqConfig != null;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (hideFromView: ");
    result.append(hideFromView);
    result.append(", skipReverseQuestion: ");
    result.append(skipReverseQuestion);
    result.append(", question: ");
    result.append(question);
    result.append(')');
    return result.toString();
  }

} //MatchingImpl
