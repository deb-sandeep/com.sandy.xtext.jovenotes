/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eval Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.EvalVar#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.EvalVar#getVarExpression <em>Var Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getEvalVar()
 * @model
 * @generated
 */
public interface EvalVar extends EObject
{
  /**
   * Returns the value of the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name</em>' attribute.
   * @see #setVarName(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getEvalVar_VarName()
   * @model
   * @generated
   */
  String getVarName();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.EvalVar#getVarName <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name</em>' attribute.
   * @see #getVarName()
   * @generated
   */
  void setVarName(String value);

  /**
   * Returns the value of the '<em><b>Var Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Expression</em>' attribute.
   * @see #setVarExpression(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getEvalVar_VarExpression()
   * @model
   * @generated
   */
  String getVarExpression();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.EvalVar#getVarExpression <em>Var Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Expression</em>' attribute.
   * @see #getVarExpression()
   * @generated
   */
  void setVarExpression(String value);

} // EvalVar
