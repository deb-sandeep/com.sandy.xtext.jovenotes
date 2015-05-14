/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jove Notes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.JoveNotes#getProcessingHints <em>Processing Hints</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.JoveNotes#getChapterDetails <em>Chapter Details</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.JoveNotes#getNotesElements <em>Notes Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getJoveNotes()
 * @model
 * @generated
 */
public interface JoveNotes extends EObject
{
  /**
   * Returns the value of the '<em><b>Processing Hints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processing Hints</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processing Hints</em>' containment reference.
   * @see #setProcessingHints(ProcessingHints)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getJoveNotes_ProcessingHints()
   * @model containment="true"
   * @generated
   */
  ProcessingHints getProcessingHints();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.JoveNotes#getProcessingHints <em>Processing Hints</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Processing Hints</em>' containment reference.
   * @see #getProcessingHints()
   * @generated
   */
  void setProcessingHints(ProcessingHints value);

  /**
   * Returns the value of the '<em><b>Chapter Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chapter Details</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chapter Details</em>' containment reference.
   * @see #setChapterDetails(ChapterDetails)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getJoveNotes_ChapterDetails()
   * @model containment="true"
   * @generated
   */
  ChapterDetails getChapterDetails();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.JoveNotes#getChapterDetails <em>Chapter Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chapter Details</em>' containment reference.
   * @see #getChapterDetails()
   * @generated
   */
  void setChapterDetails(ChapterDetails value);

  /**
   * Returns the value of the '<em><b>Notes Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.sandy.xtext.joveNotes.NotesElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notes Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notes Elements</em>' containment reference list.
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getJoveNotes_NotesElements()
   * @model containment="true"
   * @generated
   */
  EList<NotesElement> getNotesElements();

} // JoveNotes
