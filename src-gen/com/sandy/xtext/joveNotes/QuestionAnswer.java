/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.QuestionAnswer#getScript <em>Script</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.QuestionAnswer#getHideFromView <em>Hide From View</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.QuestionAnswer#getQuestion <em>Question</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.QuestionAnswer#getAnswerParts <em>Answer Parts</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.QuestionAnswer#getCmap <em>Cmap</em>}</li>
 * </ul>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getQuestionAnswer()
 * @model
 * @generated
 */
public interface QuestionAnswer extends NotesElement, RTCElement
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
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getQuestionAnswer_Script()
   * @model containment="true"
   * @generated
   */
  Script getScript();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.QuestionAnswer#getScript <em>Script</em>}' containment reference.
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
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getQuestionAnswer_HideFromView()
   * @model
   * @generated
   */
  String getHideFromView();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.QuestionAnswer#getHideFromView <em>Hide From View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hide From View</em>' attribute.
   * @see #getHideFromView()
   * @generated
   */
  void setHideFromView(String value);

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
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getQuestionAnswer_Question()
   * @model
   * @generated
   */
  String getQuestion();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.QuestionAnswer#getQuestion <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' attribute.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(String value);

  /**
   * Returns the value of the '<em><b>Answer Parts</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Answer Parts</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Answer Parts</em>' attribute list.
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getQuestionAnswer_AnswerParts()
   * @model unique="false"
   * @generated
   */
  EList<String> getAnswerParts();

  /**
   * Returns the value of the '<em><b>Cmap</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmap</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmap</em>' containment reference.
   * @see #setCmap(CMap)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getQuestionAnswer_Cmap()
   * @model containment="true"
   * @generated
   */
  CMap getCmap();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.QuestionAnswer#getCmap <em>Cmap</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmap</em>' containment reference.
   * @see #getCmap()
   * @generated
   */
  void setCmap(CMap value);

} // QuestionAnswer
