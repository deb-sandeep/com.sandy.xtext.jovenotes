/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chapter Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.ChapterDetails#getTestPaper <em>Test Paper</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ChapterDetails#getSubjectName <em>Subject Name</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ChapterDetails#getChapterNumber <em>Chapter Number</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ChapterDetails#getSubChapterNumber <em>Sub Chapter Number</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ChapterDetails#getChapterName <em>Chapter Name</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ChapterDetails#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChapterDetails()
 * @model
 * @generated
 */
public interface ChapterDetails extends EObject
{
  /**
   * Returns the value of the '<em><b>Test Paper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Paper</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Paper</em>' attribute.
   * @see #setTestPaper(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChapterDetails_TestPaper()
   * @model
   * @generated
   */
  String getTestPaper();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChapterDetails#getTestPaper <em>Test Paper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test Paper</em>' attribute.
   * @see #getTestPaper()
   * @generated
   */
  void setTestPaper(String value);

  /**
   * Returns the value of the '<em><b>Subject Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subject Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subject Name</em>' attribute.
   * @see #setSubjectName(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChapterDetails_SubjectName()
   * @model
   * @generated
   */
  String getSubjectName();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChapterDetails#getSubjectName <em>Subject Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subject Name</em>' attribute.
   * @see #getSubjectName()
   * @generated
   */
  void setSubjectName(String value);

  /**
   * Returns the value of the '<em><b>Chapter Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chapter Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chapter Number</em>' attribute.
   * @see #setChapterNumber(int)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChapterDetails_ChapterNumber()
   * @model
   * @generated
   */
  int getChapterNumber();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChapterDetails#getChapterNumber <em>Chapter Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chapter Number</em>' attribute.
   * @see #getChapterNumber()
   * @generated
   */
  void setChapterNumber(int value);

  /**
   * Returns the value of the '<em><b>Sub Chapter Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Chapter Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Chapter Number</em>' attribute.
   * @see #setSubChapterNumber(int)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChapterDetails_SubChapterNumber()
   * @model
   * @generated
   */
  int getSubChapterNumber();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChapterDetails#getSubChapterNumber <em>Sub Chapter Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Chapter Number</em>' attribute.
   * @see #getSubChapterNumber()
   * @generated
   */
  void setSubChapterNumber(int value);

  /**
   * Returns the value of the '<em><b>Chapter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chapter Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chapter Name</em>' attribute.
   * @see #setChapterName(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChapterDetails_ChapterName()
   * @model
   * @generated
   */
  String getChapterName();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChapterDetails#getChapterName <em>Chapter Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chapter Name</em>' attribute.
   * @see #getChapterName()
   * @generated
   */
  void setChapterName(String value);

  /**
   * Returns the value of the '<em><b>Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Script</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script</em>' containment reference.
   * @see #setScript(Script)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChapterDetails_Script()
   * @model containment="true"
   * @generated
   */
  Script getScript();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChapterDetails#getScript <em>Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script</em>' containment reference.
   * @see #getScript()
   * @generated
   */
  void setScript(Script value);

} // ChapterDetails
