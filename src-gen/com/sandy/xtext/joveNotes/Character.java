/**
 */
package com.sandy.xtext.joveNotes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.Character#getCharacter <em>Character</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Character#getEstimate <em>Estimate</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Character#getCmap <em>Cmap</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getCharacter()
 * @model
 * @generated
 */
public interface Character extends NotesElement
{
  /**
   * Returns the value of the '<em><b>Character</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Character</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Character</em>' attribute.
   * @see #setCharacter(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getCharacter_Character()
   * @model
   * @generated
   */
  String getCharacter();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Character#getCharacter <em>Character</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Character</em>' attribute.
   * @see #getCharacter()
   * @generated
   */
  void setCharacter(String value);

  /**
   * Returns the value of the '<em><b>Estimate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estimate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estimate</em>' attribute.
   * @see #setEstimate(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getCharacter_Estimate()
   * @model
   * @generated
   */
  String getEstimate();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Character#getEstimate <em>Estimate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Estimate</em>' attribute.
   * @see #getEstimate()
   * @generated
   */
  void setEstimate(String value);

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
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getCharacter_Cmap()
   * @model containment="true"
   * @generated
   */
  CMap getCmap();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Character#getCmap <em>Cmap</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmap</em>' containment reference.
   * @see #getCmap()
   * @generated
   */
  void setCmap(CMap value);

} // Character
