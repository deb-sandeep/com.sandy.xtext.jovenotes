/**
 */
package com.sandy.xtext.joveNotes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teacher Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.TeacherNote#getNote <em>Note</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.TeacherNote#getCmap <em>Cmap</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getTeacherNote()
 * @model
 * @generated
 */
public interface TeacherNote extends NotesElement
{
  /**
   * Returns the value of the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Note</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Note</em>' attribute.
   * @see #setNote(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getTeacherNote_Note()
   * @model
   * @generated
   */
  String getNote();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.TeacherNote#getNote <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Note</em>' attribute.
   * @see #getNote()
   * @generated
   */
  void setNote(String value);

  /**
   * Returns the value of the '<em><b>Cmap</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmap</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmap</em>' containment reference.
   * @see #setCmap(CMap)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getTeacherNote_Cmap()
   * @model containment="true"
   * @generated
   */
  CMap getCmap();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.TeacherNote#getCmap <em>Cmap</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmap</em>' containment reference.
   * @see #getCmap()
   * @generated
   */
  void setCmap(CMap value);

} // TeacherNote
