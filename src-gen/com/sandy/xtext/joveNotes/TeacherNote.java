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
 *   <li>{@link com.sandy.xtext.joveNotes.TeacherNote#getHideFromView <em>Hide From View</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.TeacherNote#getCaption <em>Caption</em>}</li>
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
   * Returns the value of the '<em><b>Hide From View</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hide From View</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hide From View</em>' attribute.
   * @see #setHideFromView(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getTeacherNote_HideFromView()
   * @model
   * @generated
   */
  String getHideFromView();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.TeacherNote#getHideFromView <em>Hide From View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hide From View</em>' attribute.
   * @see #getHideFromView()
   * @generated
   */
  void setHideFromView(String value);

  /**
   * Returns the value of the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caption</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Caption</em>' attribute.
   * @see #setCaption(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getTeacherNote_Caption()
   * @model
   * @generated
   */
  String getCaption();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.TeacherNote#getCaption <em>Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Caption</em>' attribute.
   * @see #getCaption()
   * @generated
   */
  void setCaption(String value);

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
