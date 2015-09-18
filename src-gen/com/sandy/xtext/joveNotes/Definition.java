/**
 */
package com.sandy.xtext.joveNotes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.Definition#getScript <em>Script</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Definition#getHideFromView <em>Hide From View</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Definition#getTerm <em>Term</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Definition#getDefinition <em>Definition</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Definition#getCmap <em>Cmap</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends NotesElement, RTCElement
{
  /**
   * Returns the value of the '<em><b>Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Script</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script</em>' containment reference.
   * @see #setScript(Script)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getDefinition_Script()
   * @model containment="true"
   * @generated
   */
  Script getScript();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Definition#getScript <em>Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script</em>' containment reference.
   * @see #getScript()
   * @generated
   */
  void setScript(Script value);

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
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getDefinition_HideFromView()
   * @model
   * @generated
   */
  String getHideFromView();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Definition#getHideFromView <em>Hide From View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hide From View</em>' attribute.
   * @see #getHideFromView()
   * @generated
   */
  void setHideFromView(String value);

  /**
   * Returns the value of the '<em><b>Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' attribute.
   * @see #setTerm(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getDefinition_Term()
   * @model
   * @generated
   */
  String getTerm();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Definition#getTerm <em>Term</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' attribute.
   * @see #getTerm()
   * @generated
   */
  void setTerm(String value);

  /**
   * Returns the value of the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' attribute.
   * @see #setDefinition(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getDefinition_Definition()
   * @model
   * @generated
   */
  String getDefinition();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Definition#getDefinition <em>Definition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' attribute.
   * @see #getDefinition()
   * @generated
   */
  void setDefinition(String value);

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
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getDefinition_Cmap()
   * @model containment="true"
   * @generated
   */
  CMap getCmap();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Definition#getCmap <em>Cmap</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmap</em>' containment reference.
   * @see #getCmap()
   * @generated
   */
  void setCmap(CMap value);

} // Definition
