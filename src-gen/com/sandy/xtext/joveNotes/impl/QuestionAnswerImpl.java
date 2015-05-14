/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.CMap;
import com.sandy.xtext.joveNotes.JoveNotesPackage;
import com.sandy.xtext.joveNotes.QuestionAnswer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.QuestionAnswerImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.QuestionAnswerImpl#getAnswer <em>Answer</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.QuestionAnswerImpl#getCmap <em>Cmap</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionAnswerImpl extends NotesElementImpl implements QuestionAnswer
{
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
   * The default value of the '{@link #getAnswer() <em>Answer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnswer()
   * @generated
   * @ordered
   */
  protected static final String ANSWER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAnswer() <em>Answer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnswer()
   * @generated
   * @ordered
   */
  protected String answer = ANSWER_EDEFAULT;

  /**
   * The cached value of the '{@link #getCmap() <em>Cmap</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmap()
   * @generated
   * @ordered
   */
  protected CMap cmap;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuestionAnswerImpl()
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
    return JoveNotesPackage.Literals.QUESTION_ANSWER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.QUESTION_ANSWER__QUESTION, oldQuestion, question));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAnswer()
  {
    return answer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnswer(String newAnswer)
  {
    String oldAnswer = answer;
    answer = newAnswer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.QUESTION_ANSWER__ANSWER, oldAnswer, answer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CMap getCmap()
  {
    return cmap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmap(CMap newCmap, NotificationChain msgs)
  {
    CMap oldCmap = cmap;
    cmap = newCmap;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoveNotesPackage.QUESTION_ANSWER__CMAP, oldCmap, newCmap);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmap(CMap newCmap)
  {
    if (newCmap != cmap)
    {
      NotificationChain msgs = null;
      if (cmap != null)
        msgs = ((InternalEObject)cmap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.QUESTION_ANSWER__CMAP, null, msgs);
      if (newCmap != null)
        msgs = ((InternalEObject)newCmap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.QUESTION_ANSWER__CMAP, null, msgs);
      msgs = basicSetCmap(newCmap, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.QUESTION_ANSWER__CMAP, newCmap, newCmap));
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
      case JoveNotesPackage.QUESTION_ANSWER__CMAP:
        return basicSetCmap(null, msgs);
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
      case JoveNotesPackage.QUESTION_ANSWER__QUESTION:
        return getQuestion();
      case JoveNotesPackage.QUESTION_ANSWER__ANSWER:
        return getAnswer();
      case JoveNotesPackage.QUESTION_ANSWER__CMAP:
        return getCmap();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JoveNotesPackage.QUESTION_ANSWER__QUESTION:
        setQuestion((String)newValue);
        return;
      case JoveNotesPackage.QUESTION_ANSWER__ANSWER:
        setAnswer((String)newValue);
        return;
      case JoveNotesPackage.QUESTION_ANSWER__CMAP:
        setCmap((CMap)newValue);
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
      case JoveNotesPackage.QUESTION_ANSWER__QUESTION:
        setQuestion(QUESTION_EDEFAULT);
        return;
      case JoveNotesPackage.QUESTION_ANSWER__ANSWER:
        setAnswer(ANSWER_EDEFAULT);
        return;
      case JoveNotesPackage.QUESTION_ANSWER__CMAP:
        setCmap((CMap)null);
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
      case JoveNotesPackage.QUESTION_ANSWER__QUESTION:
        return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
      case JoveNotesPackage.QUESTION_ANSWER__ANSWER:
        return ANSWER_EDEFAULT == null ? answer != null : !ANSWER_EDEFAULT.equals(answer);
      case JoveNotesPackage.QUESTION_ANSWER__CMAP:
        return cmap != null;
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
    result.append(" (question: ");
    result.append(question);
    result.append(", answer: ");
    result.append(answer);
    result.append(')');
    return result.toString();
  }

} //QuestionAnswerImpl
