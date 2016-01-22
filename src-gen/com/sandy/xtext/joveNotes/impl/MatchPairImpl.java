/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.JoveNotesPackage;
import com.sandy.xtext.joveNotes.MatchPair;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MatchPairImpl#getMatchQuestion <em>Match Question</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MatchPairImpl#getMatchAnswer <em>Match Answer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchPairImpl extends MinimalEObjectImpl.Container implements MatchPair
{
  /**
   * The default value of the '{@link #getMatchQuestion() <em>Match Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatchQuestion()
   * @generated
   * @ordered
   */
  protected static final String MATCH_QUESTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMatchQuestion() <em>Match Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatchQuestion()
   * @generated
   * @ordered
   */
  protected String matchQuestion = MATCH_QUESTION_EDEFAULT;

  /**
   * The default value of the '{@link #getMatchAnswer() <em>Match Answer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatchAnswer()
   * @generated
   * @ordered
   */
  protected static final String MATCH_ANSWER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMatchAnswer() <em>Match Answer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatchAnswer()
   * @generated
   * @ordered
   */
  protected String matchAnswer = MATCH_ANSWER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MatchPairImpl()
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
    return JoveNotesPackage.Literals.MATCH_PAIR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMatchQuestion()
  {
    return matchQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatchQuestion(String newMatchQuestion)
  {
    String oldMatchQuestion = matchQuestion;
    matchQuestion = newMatchQuestion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MATCH_PAIR__MATCH_QUESTION, oldMatchQuestion, matchQuestion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMatchAnswer()
  {
    return matchAnswer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatchAnswer(String newMatchAnswer)
  {
    String oldMatchAnswer = matchAnswer;
    matchAnswer = newMatchAnswer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MATCH_PAIR__MATCH_ANSWER, oldMatchAnswer, matchAnswer));
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
      case JoveNotesPackage.MATCH_PAIR__MATCH_QUESTION:
        return getMatchQuestion();
      case JoveNotesPackage.MATCH_PAIR__MATCH_ANSWER:
        return getMatchAnswer();
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
      case JoveNotesPackage.MATCH_PAIR__MATCH_QUESTION:
        setMatchQuestion((String)newValue);
        return;
      case JoveNotesPackage.MATCH_PAIR__MATCH_ANSWER:
        setMatchAnswer((String)newValue);
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
      case JoveNotesPackage.MATCH_PAIR__MATCH_QUESTION:
        setMatchQuestion(MATCH_QUESTION_EDEFAULT);
        return;
      case JoveNotesPackage.MATCH_PAIR__MATCH_ANSWER:
        setMatchAnswer(MATCH_ANSWER_EDEFAULT);
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
      case JoveNotesPackage.MATCH_PAIR__MATCH_QUESTION:
        return MATCH_QUESTION_EDEFAULT == null ? matchQuestion != null : !MATCH_QUESTION_EDEFAULT.equals(matchQuestion);
      case JoveNotesPackage.MATCH_PAIR__MATCH_ANSWER:
        return MATCH_ANSWER_EDEFAULT == null ? matchAnswer != null : !MATCH_ANSWER_EDEFAULT.equals(matchAnswer);
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
    result.append(" (matchQuestion: ");
    result.append(matchQuestion);
    result.append(", matchAnswer: ");
    result.append(matchAnswer);
    result.append(')');
    return result.toString();
  }

} //MatchPairImpl
