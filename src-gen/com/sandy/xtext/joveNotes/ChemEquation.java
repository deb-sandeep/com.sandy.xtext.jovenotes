/**
 */
package com.sandy.xtext.joveNotes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chem Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.ChemEquation#getScript <em>Script</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ChemEquation#getHideFromView <em>Hide From View</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ChemEquation#getDescription <em>Description</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ChemEquation#getReactants <em>Reactants</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ChemEquation#getProduces <em>Produces</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.ChemEquation#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemEquation()
 * @model
 * @generated
 */
public interface ChemEquation extends NotesElement, RTCElement
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
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemEquation_Script()
   * @model containment="true"
   * @generated
   */
  Script getScript();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChemEquation#getScript <em>Script</em>}' containment reference.
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
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemEquation_HideFromView()
   * @model
   * @generated
   */
  String getHideFromView();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChemEquation#getHideFromView <em>Hide From View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hide From View</em>' attribute.
   * @see #getHideFromView()
   * @generated
   */
  void setHideFromView(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemEquation_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChemEquation#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Reactants</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reactants</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reactants</em>' attribute.
   * @see #setReactants(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemEquation_Reactants()
   * @model
   * @generated
   */
  String getReactants();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChemEquation#getReactants <em>Reactants</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reactants</em>' attribute.
   * @see #getReactants()
   * @generated
   */
  void setReactants(String value);

  /**
   * Returns the value of the '<em><b>Produces</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Produces</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Produces</em>' attribute.
   * @see #setProduces(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemEquation_Produces()
   * @model
   * @generated
   */
  String getProduces();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChemEquation#getProduces <em>Produces</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Produces</em>' attribute.
   * @see #getProduces()
   * @generated
   */
  void setProduces(String value);

  /**
   * Returns the value of the '<em><b>Products</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Products</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Products</em>' attribute.
   * @see #setProducts(String)
   * @see com.sandy.xtext.joveNotes.JoveNotesPackage#getChemEquation_Products()
   * @model
   * @generated
   */
  String getProducts();

  /**
   * Sets the value of the '{@link com.sandy.xtext.joveNotes.ChemEquation#getProducts <em>Products</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Products</em>' attribute.
   * @see #getProducts()
   * @generated
   */
  void setProducts(String value);

} // ChemEquation
