/**
 */
package com.sandy.xtext.joveNotes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chem Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.ChemEquation#getEquation <em>Equation</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ChemEquation#getDescription <em>Description</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ChemEquation#getNotes <em>Notes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemEquation()
 * @model
 * @generated
 */
public interface ChemEquation extends NotesElement
{
  /**
   * Returns the value of the '<em><b>Equation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equation</em>' attribute.
   * @see #setEquation(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemEquation_Equation()
   * @model
   * @generated
   */
  String getEquation();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChemEquation#getEquation <em>Equation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Equation</em>' attribute.
   * @see #getEquation()
   * @generated
   */
  void setEquation(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemEquation_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChemEquation#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Notes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notes</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notes</em>' attribute.
   * @see #setNotes(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemEquation_Notes()
   * @model
   * @generated
   */
  String getNotes();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChemEquation#getNotes <em>Notes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Notes</em>' attribute.
   * @see #getNotes()
   * @generated
   */
  void setNotes(String value);

} // ChemEquation
