/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.MatchPair#getMatchQuestion <em>Match Question</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.MatchPair#getMatchAnswer <em>Match Answer</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMatchPair()
 * @model
 * @generated
 */
public interface MatchPair extends EObject
{
  /**
   * Returns the value of the '<em><b>Match Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Match Question</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Match Question</em>' attribute.
   * @see #setMatchQuestion(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMatchPair_MatchQuestion()
   * @model
   * @generated
   */
  String getMatchQuestion();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.MatchPair#getMatchQuestion <em>Match Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Match Question</em>' attribute.
   * @see #getMatchQuestion()
   * @generated
   */
  void setMatchQuestion(String value);

  /**
   * Returns the value of the '<em><b>Match Answer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Match Answer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Match Answer</em>' attribute.
   * @see #setMatchAnswer(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMatchPair_MatchAnswer()
   * @model
   * @generated
   */
  String getMatchAnswer();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.MatchPair#getMatchAnswer <em>Match Answer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Match Answer</em>' attribute.
   * @see #getMatchAnswer()
   * @generated
   */
  void setMatchAnswer(String value);

} // MatchPair
