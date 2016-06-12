/**
 */
package com.sandy.xtext.joveNotes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chem Compound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.ChemCompound#getScript <em>Script</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ChemCompound#getHideFromView <em>Hide From View</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ChemCompound#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ChemCompound#getChemicalName <em>Chemical Name</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ChemCompound#getCommonName <em>Common Name</em>}</li>
 * </ul>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemCompound()
 * @model
 * @generated
 */
public interface ChemCompound extends NotesElement, RTCElement
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
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemCompound_Script()
   * @model containment="true"
   * @generated
   */
  Script getScript();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChemCompound#getScript <em>Script</em>}' containment reference.
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
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemCompound_HideFromView()
   * @model
   * @generated
   */
  String getHideFromView();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChemCompound#getHideFromView <em>Hide From View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hide From View</em>' attribute.
   * @see #getHideFromView()
   * @generated
   */
  void setHideFromView(String value);

  /**
   * Returns the value of the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol</em>' attribute.
   * @see #setSymbol(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemCompound_Symbol()
   * @model
   * @generated
   */
  String getSymbol();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChemCompound#getSymbol <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol</em>' attribute.
   * @see #getSymbol()
   * @generated
   */
  void setSymbol(String value);

  /**
   * Returns the value of the '<em><b>Chemical Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chemical Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chemical Name</em>' attribute.
   * @see #setChemicalName(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemCompound_ChemicalName()
   * @model
   * @generated
   */
  String getChemicalName();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChemCompound#getChemicalName <em>Chemical Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chemical Name</em>' attribute.
   * @see #getChemicalName()
   * @generated
   */
  void setChemicalName(String value);

  /**
   * Returns the value of the '<em><b>Common Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Common Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Common Name</em>' attribute.
   * @see #setCommonName(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemCompound_CommonName()
   * @model
   * @generated
   */
  String getCommonName();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChemCompound#getCommonName <em>Common Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Common Name</em>' attribute.
   * @see #getCommonName()
   * @generated
   */
  void setCommonName(String value);

} // ChemCompound
