/**
 */
package com.sandy.xtext.joveNotes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>True False</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.TrueFalse#getStatement <em>Statement</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.TrueFalse#getTruthValue <em>Truth Value</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.TrueFalse#getJustification <em>Justification</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getTrueFalse()
 * @model
 * @generated
 */
public interface TrueFalse extends NotesElement
{
  /**
   * Returns the value of the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' attribute.
   * @see #setStatement(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getTrueFalse_Statement()
   * @model
   * @generated
   */
  String getStatement();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.TrueFalse#getStatement <em>Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' attribute.
   * @see #getStatement()
   * @generated
   */
  void setStatement(String value);

  /**
   * Returns the value of the '<em><b>Truth Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Truth Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Truth Value</em>' attribute.
   * @see #setTruthValue(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getTrueFalse_TruthValue()
   * @model
   * @generated
   */
  String getTruthValue();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.TrueFalse#getTruthValue <em>Truth Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Truth Value</em>' attribute.
   * @see #getTruthValue()
   * @generated
   */
  void setTruthValue(String value);

  /**
   * Returns the value of the '<em><b>Justification</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Justification</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Justification</em>' attribute.
   * @see #setJustification(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getTrueFalse_Justification()
   * @model
   * @generated
   */
  String getJustification();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.TrueFalse#getJustification <em>Justification</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Justification</em>' attribute.
   * @see #getJustification()
   * @generated
   */
  void setJustification(String value);

} // TrueFalse