/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.Script#getEvalVars <em>Eval Vars</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Script#getScriptBody <em>Script Body</em>}</li>
 * </ul>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject
{
  /**
   * Returns the value of the '<em><b>Eval Vars</b></em>' containment reference list.
   * The list contents are of type {@link com.sandy.xtext.joveNotes.EvalVar}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eval Vars</em>' containment reference list.
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getScript_EvalVars()
   * @model containment="true"
   * @generated
   */
  EList<EvalVar> getEvalVars();

  /**
   * Returns the value of the '<em><b>Script Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script Body</em>' containment reference.
   * @see #setScriptBody(ScriptBody)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getScript_ScriptBody()
   * @model containment="true"
   * @generated
   */
  ScriptBody getScriptBody();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Script#getScriptBody <em>Script Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script Body</em>' containment reference.
   * @see #getScriptBody()
   * @generated
   */
  void setScriptBody(ScriptBody value);

} // Script
