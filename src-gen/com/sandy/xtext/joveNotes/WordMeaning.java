/**
 */
package com.sandy.xtext.joveNotes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Word Meaning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.WordMeaning#getHideFromView <em>Hide From View</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.WordMeaning#getWord <em>Word</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.WordMeaning#getMeaning <em>Meaning</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getWordMeaning()
 * @model
 * @generated
 */
public interface WordMeaning extends NotesElement
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
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getWordMeaning_HideFromView()
   * @model
   * @generated
   */
  String getHideFromView();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.WordMeaning#getHideFromView <em>Hide From View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hide From View</em>' attribute.
   * @see #getHideFromView()
   * @generated
   */
  void setHideFromView(String value);

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
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getWordMeaning_Word()
   * @model
   * @generated
   */
  String getWord();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.WordMeaning#getWord <em>Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Word</em>' attribute.
   * @see #getWord()
   * @generated
   */
  void setWord(String value);

  /**
   * Returns the value of the '<em><b>Meaning</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meaning</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meaning</em>' attribute.
   * @see #setMeaning(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getWordMeaning_Meaning()
   * @model
   * @generated
   */
  String getMeaning();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.WordMeaning#getMeaning <em>Meaning</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meaning</em>' attribute.
   * @see #getMeaning()
   * @generated
   */
  void setMeaning(String value);

} // WordMeaning
