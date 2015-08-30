/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matching</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.Matching#getSkipReverseQuestion <em>Skip Reverse Question</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Matching#getQuestion <em>Question</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Matching#getPairs <em>Pairs</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Matching#getMcqConfig <em>Mcq Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMatching()
 * @model
 * @generated
 */
public interface Matching extends NotesElement
{
  /**
   * Returns the value of the '<em><b>Skip Reverse Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Skip Reverse Question</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skip Reverse Question</em>' attribute.
   * @see #setSkipReverseQuestion(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMatching_SkipReverseQuestion()
   * @model
   * @generated
   */
  String getSkipReverseQuestion();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Matching#getSkipReverseQuestion <em>Skip Reverse Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skip Reverse Question</em>' attribute.
   * @see #getSkipReverseQuestion()
   * @generated
   */
  void setSkipReverseQuestion(String value);

  /**
   * Returns the value of the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question</em>' attribute.
   * @see #setQuestion(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMatching_Question()
   * @model
   * @generated
   */
  String getQuestion();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Matching#getQuestion <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' attribute.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(String value);

  /**
   * Returns the value of the '<em><b>Pairs</b></em>' containment reference list.
   * The list contents are of type {@link com.sandy.xtext.joveNotes.MatchPair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pairs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pairs</em>' containment reference list.
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMatching_Pairs()
   * @model containment="true"
   * @generated
   */
  EList<MatchPair> getPairs();

  /**
   * Returns the value of the '<em><b>Mcq Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mcq Config</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mcq Config</em>' containment reference.
   * @see #setMcqConfig(MatchMCQConfig)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMatching_McqConfig()
   * @model containment="true"
   * @generated
   */
  MatchMCQConfig getMcqConfig();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Matching#getMcqConfig <em>Mcq Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mcq Config</em>' containment reference.
   * @see #getMcqConfig()
   * @generated
   */
  void setMcqConfig(MatchMCQConfig value);

} // Matching
