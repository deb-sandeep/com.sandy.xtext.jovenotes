/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.Option#getOptionValue <em>Option Value</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Option#getCorrectOption <em>Correct Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject
{
  /**
   * Returns the value of the '<em><b>Option Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option Value</em>' attribute.
   * @see #setOptionValue(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getOption_OptionValue()
   * @model
   * @generated
   */
  String getOptionValue();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Option#getOptionValue <em>Option Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option Value</em>' attribute.
   * @see #getOptionValue()
   * @generated
   */
  void setOptionValue(String value);

  /**
   * Returns the value of the '<em><b>Correct Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Correct Option</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Correct Option</em>' attribute.
   * @see #setCorrectOption(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getOption_CorrectOption()
   * @model
   * @generated
   */
  String getCorrectOption();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Option#getCorrectOption <em>Correct Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Correct Option</em>' attribute.
   * @see #getCorrectOption()
   * @generated
   */
  void setCorrectOption(String value);

} // Option
