/**
 */
package com.sandy.xtext.joveNotes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spellbee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.Spellbee#getWord <em>Word</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getSpellbee()
 * @model
 * @generated
 */
public interface Spellbee extends NotesElement
{
  /**
   * Returns the value of the '<em><b>Word</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Word</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Word</em>' attribute.
   * @see #setWord(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getSpellbee_Word()
   * @model
   * @generated
   */
  String getWord();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Spellbee#getWord <em>Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Word</em>' attribute.
   * @see #getWord()
   * @generated
   */
  void setWord(String value);

} // Spellbee
