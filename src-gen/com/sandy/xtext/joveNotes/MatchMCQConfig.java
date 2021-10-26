/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match MCQ Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.MatchMCQConfig#getForwardCaption <em>Forward Caption</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.MatchMCQConfig#getReverseCaption <em>Reverse Caption</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.MatchMCQConfig#getNumOptionsToShow <em>Num Options To Show</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.MatchMCQConfig#getNumOptionsPerRow <em>Num Options Per Row</em>}</li>
 * </ul>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMatchMCQConfig()
 * @model
 * @generated
 */
public interface MatchMCQConfig extends EObject
{
  /**
   * Returns the value of the '<em><b>Forward Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forward Caption</em>' attribute.
   * @see #setForwardCaption(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMatchMCQConfig_ForwardCaption()
   * @model
   * @generated
   */
  String getForwardCaption();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.MatchMCQConfig#getForwardCaption <em>Forward Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forward Caption</em>' attribute.
   * @see #getForwardCaption()
   * @generated
   */
  void setForwardCaption(String value);

  /**
   * Returns the value of the '<em><b>Reverse Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reverse Caption</em>' attribute.
   * @see #setReverseCaption(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMatchMCQConfig_ReverseCaption()
   * @model
   * @generated
   */
  String getReverseCaption();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.MatchMCQConfig#getReverseCaption <em>Reverse Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reverse Caption</em>' attribute.
   * @see #getReverseCaption()
   * @generated
   */
  void setReverseCaption(String value);

  /**
   * Returns the value of the '<em><b>Num Options To Show</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Options To Show</em>' attribute.
   * @see #setNumOptionsToShow(int)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMatchMCQConfig_NumOptionsToShow()
   * @model
   * @generated
   */
  int getNumOptionsToShow();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.MatchMCQConfig#getNumOptionsToShow <em>Num Options To Show</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Options To Show</em>' attribute.
   * @see #getNumOptionsToShow()
   * @generated
   */
  void setNumOptionsToShow(int value);

  /**
   * Returns the value of the '<em><b>Num Options Per Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Options Per Row</em>' attribute.
   * @see #setNumOptionsPerRow(int)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getMatchMCQConfig_NumOptionsPerRow()
   * @model
   * @generated
   */
  int getNumOptionsPerRow();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.MatchMCQConfig#getNumOptionsPerRow <em>Num Options Per Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Options Per Row</em>' attribute.
   * @see #getNumOptionsPerRow()
   * @generated
   */
  void setNumOptionsPerRow(int value);

} // MatchMCQConfig
