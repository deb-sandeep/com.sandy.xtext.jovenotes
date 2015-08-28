/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.MultiChoice#getQuestion <em>Question</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.MultiChoice#getOptions <em>Options</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.MultiChoice#getExplanation <em>Explanation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMultiChoice()
 * @model
 * @generated
 */
public interface MultiChoice extends NotesElement
{
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
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMultiChoice_Question()
   * @model
   * @generated
   */
  String getQuestion();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.MultiChoice#getQuestion <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' attribute.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(String value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link com.sandy.xtext.joveNotes.Option}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMultiChoice_Options()
   * @model containment="true"
   * @generated
   */
  EList<Option> getOptions();

  /**
   * Returns the value of the '<em><b>Explanation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Explanation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Explanation</em>' attribute.
   * @see #setExplanation(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMultiChoice_Explanation()
   * @model
   * @generated
   */
  String getExplanation();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.MultiChoice#getExplanation <em>Explanation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Explanation</em>' attribute.
   * @see #getExplanation()
   * @generated
   */
  void setExplanation(String value);

} // MultiChoice
