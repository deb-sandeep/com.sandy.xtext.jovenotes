/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.Equation#getEquation <em>Equation</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Equation#getDescription <em>Description</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Equation#getSymbols <em>Symbols</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getEquation()
 * @model
 * @generated
 */
public interface Equation extends NotesElement
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
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getEquation_Equation()
   * @model
   * @generated
   */
  String getEquation();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Equation#getEquation <em>Equation</em>}' attribute.
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
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getEquation_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Equation#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Symbols</b></em>' containment reference list.
   * The list contents are of type {@link com.sandy.xtext.joveNotes.EqSymbol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbols</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbols</em>' containment reference list.
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getEquation_Symbols()
   * @model containment="true"
   * @generated
   */
  EList<EqSymbol> getSymbols();

} // Equation
