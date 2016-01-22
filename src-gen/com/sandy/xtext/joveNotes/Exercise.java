/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exercise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.Exercise#getScript <em>Script</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Exercise#getHideFromView <em>Hide From View</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Exercise#getMarks <em>Marks</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Exercise#getQuestion <em>Question</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Exercise#getHints <em>Hints</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.Exercise#getAnswer <em>Answer</em>}</li>
 * </ul>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getExercise()
 * @model
 * @generated
 */
public interface Exercise extends NotesElement
{
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
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getExercise_Script()
   * @model containment="true"
   * @generated
   */
  Script getScript();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Exercise#getScript <em>Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script</em>' containment reference.
   * @see #getScript()
   * @generated
   */
  void setScript(Script value);

  /**
   * Returns the value of the '<em><b>Hide From View</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hide From View</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hide From View</em>' attribute.
   * @see #setHideFromView(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getExercise_HideFromView()
   * @model
   * @generated
   */
  String getHideFromView();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Exercise#getHideFromView <em>Hide From View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hide From View</em>' attribute.
   * @see #getHideFromView()
   * @generated
   */
  void setHideFromView(String value);

  /**
   * Returns the value of the '<em><b>Marks</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Marks</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Marks</em>' attribute.
   * @see #setMarks(int)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getExercise_Marks()
   * @model
   * @generated
   */
  int getMarks();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Exercise#getMarks <em>Marks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Marks</em>' attribute.
   * @see #getMarks()
   * @generated
   */
  void setMarks(int value);

  /**
   * Returns the value of the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question</em>' attribute.
   * @see #setQuestion(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getExercise_Question()
   * @model
   * @generated
   */
  String getQuestion();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Exercise#getQuestion <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' attribute.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(String value);

  /**
   * Returns the value of the '<em><b>Hints</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hints</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hints</em>' attribute list.
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getExercise_Hints()
   * @model unique="false"
   * @generated
   */
  EList<String> getHints();

  /**
   * Returns the value of the '<em><b>Answer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Answer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Answer</em>' attribute.
   * @see #setAnswer(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getExercise_Answer()
   * @model
   * @generated
   */
  String getAnswer();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.Exercise#getAnswer <em>Answer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Answer</em>' attribute.
   * @see #getAnswer()
   * @generated
   */
  void setAnswer(String value);

} // Exercise
