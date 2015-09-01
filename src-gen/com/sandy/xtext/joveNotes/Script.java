/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.Script#getScriptBody <em>Script Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject
{
  /**
   * Returns the value of the '<em><b>Script Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Script Body</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script Body</em>' attribute.
   * @see #setScriptBody(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getScript_ScriptBody()
   * @model
   * @generated
   */
  String getScriptBody();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Script#getScriptBody <em>Script Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script Body</em>' attribute.
   * @see #getScriptBody()
   * @generated
   */
  void setScriptBody(String value);

} // Script
