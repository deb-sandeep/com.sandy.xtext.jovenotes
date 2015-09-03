/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.ScriptBody#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getScriptBody()
 * @model
 * @generated
 */
public interface ScriptBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Script</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script</em>' attribute.
   * @see #setScript(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getScriptBody_Script()
   * @model
   * @generated
   */
  String getScript();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ScriptBody#getScript <em>Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script</em>' attribute.
   * @see #getScript()
   * @generated
   */
  void setScript(String value);

} // ScriptBody
