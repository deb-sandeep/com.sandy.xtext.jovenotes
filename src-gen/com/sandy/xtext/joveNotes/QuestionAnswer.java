/**
 */
package com.sandy.xtext.joveNotes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.QuestionAnswer#getQuestion <em>Question</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.QuestionAnswer#getAnswer <em>Answer</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.QuestionAnswer#getCmap <em>Cmap</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getQuestionAnswer()
 * @model
 * @generated
 */
public interface QuestionAnswer extends NotesElement
{
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
   * Returns the value of the '<em><b>Answer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Answer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Answer</em>' attribute.
   * @see #setAnswer(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getQuestionAnswer_Answer()
   * @model
   * @generated
   */
  String getAnswer();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.QuestionAnswer#getAnswer <em>Answer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Answer</em>' attribute.
   * @see #getAnswer()
   * @generated
   */
  void setAnswer(String value);

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
