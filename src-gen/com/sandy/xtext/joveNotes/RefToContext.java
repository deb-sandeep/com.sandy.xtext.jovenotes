/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref To Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.RefToContext#getContext <em>Context</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.RefToContext#getQuestions <em>Questions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getRefToContext()
 * @model
 * @generated
 */
public interface RefToContext extends NotesElement
{
  /**
   * Returns the value of the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' attribute.
   * @see #setContext(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getRefToContext_Context()
   * @model
   * @generated
   */
  String getContext();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.RefToContext#getContext <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' attribute.
   * @see #getContext()
   * @generated
   */
  void setContext(String value);

  /**
   * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
   * The list contents are of type {@link com.sandy.xtext.joveNotes.QuestionAnswer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Questions</em>' containment reference list.
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getRefToContext_Questions()
   * @model containment="true"
   * @generated
   */
  EList<QuestionAnswer> getQuestions();

} // RefToContext
