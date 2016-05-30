/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Hints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.ProcessingHints#getSkipGeneration <em>Skip Generation</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ProcessingHints#getSkipGenerationInProduction <em>Skip Generation In Production</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getProcessingHints()
 * @model
 * @generated
 */
public interface ProcessingHints extends EObject
{
  /**
   * Returns the value of the '<em><b>Skip Generation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Skip Generation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skip Generation</em>' attribute.
   * @see #setSkipGeneration(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getProcessingHints_SkipGeneration()
   * @model
   * @generated
   */
  String getSkipGeneration();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ProcessingHints#getSkipGeneration <em>Skip Generation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skip Generation</em>' attribute.
   * @see #getSkipGeneration()
   * @generated
   */
  void setSkipGeneration(String value);

  /**
   * Returns the value of the '<em><b>Skip Generation In Production</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Skip Generation In Production</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skip Generation In Production</em>' attribute.
   * @see #setSkipGenerationInProduction(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getProcessingHints_SkipGenerationInProduction()
   * @model
   * @generated
   */
  String getSkipGenerationInProduction();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ProcessingHints#getSkipGenerationInProduction <em>Skip Generation In Production</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skip Generation In Production</em>' attribute.
   * @see #getSkipGenerationInProduction()
   * @generated
   */
  void setSkipGenerationInProduction(String value);

} // ProcessingHints
