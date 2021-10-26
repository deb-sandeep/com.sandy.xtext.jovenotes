/**
 */
package com.sandy.xtext.joveNotes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.ImageLabel#getScript <em>Script</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ImageLabel#getHideFromView <em>Hide From View</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ImageLabel#getCaption <em>Caption</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ImageLabel#getImageName <em>Image Name</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ImageLabel#getHotspots <em>Hotspots</em>}</li>
 * </ul>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getImageLabel()
 * @model
 * @generated
 */
public interface ImageLabel extends NotesElement, RTCElement
{
  /**
   * Returns the value of the '<em><b>Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script</em>' containment reference.
   * @see #setScript(Script)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getImageLabel_Script()
   * @model containment="true"
   * @generated
   */
  Script getScript();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ImageLabel#getScript <em>Script</em>}' containment reference.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hide From View</em>' attribute.
   * @see #setHideFromView(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getImageLabel_HideFromView()
   * @model
   * @generated
   */
  String getHideFromView();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ImageLabel#getHideFromView <em>Hide From View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hide From View</em>' attribute.
   * @see #getHideFromView()
   * @generated
   */
  void setHideFromView(String value);

  /**
   * Returns the value of the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Caption</em>' attribute.
   * @see #setCaption(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getImageLabel_Caption()
   * @model
   * @generated
   */
  String getCaption();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ImageLabel#getCaption <em>Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Caption</em>' attribute.
   * @see #getCaption()
   * @generated
   */
  void setCaption(String value);

  /**
   * Returns the value of the '<em><b>Image Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image Name</em>' attribute.
   * @see #setImageName(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getImageLabel_ImageName()
   * @model
   * @generated
   */
  String getImageName();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ImageLabel#getImageName <em>Image Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image Name</em>' attribute.
   * @see #getImageName()
   * @generated
   */
  void setImageName(String value);

  /**
   * Returns the value of the '<em><b>Hotspots</b></em>' containment reference list.
   * The list contents are of type {@link com.sandy.xtext.joveNotes.HotSpot}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hotspots</em>' containment reference list.
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getImageLabel_Hotspots()
   * @model containment="true"
   * @generated
   */
  EList<HotSpot> getHotspots();

} // ImageLabel
