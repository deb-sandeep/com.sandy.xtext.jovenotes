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
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.ImageLabel#getCaption <em>Caption</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ImageLabel#getImageName <em>Image Name</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ImageLabel#getHotspots <em>Hotspots</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getImageLabel()
 * @model
 * @generated
 */
public interface ImageLabel extends NotesElement
{
  /**
   * Returns the value of the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caption</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
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
   * <p>
   * If the meaning of the '<em>Image Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
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
   * <p>
   * If the meaning of the '<em>Hotspots</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hotspots</em>' containment reference list.
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getImageLabel_Hotspots()
   * @model containment="true"
   * @generated
   */
  EList<HotSpot> getHotspots();

} // ImageLabel