/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.ChemCompound;
import com.sandy.xtext.joveNotes.JoveNotesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chem Compound</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.ChemCompoundImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.ChemCompoundImpl#getChemicalName <em>Chemical Name</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.ChemCompoundImpl#getCommonName <em>Common Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChemCompoundImpl extends NotesElementImpl implements ChemCompound
{
  /**
   * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
  protected static final String SYMBOL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
  protected String symbol = SYMBOL_EDEFAULT;

  /**
   * The default value of the '{@link #getChemicalName() <em>Chemical Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChemicalName()
   * @generated
   * @ordered
   */
  protected static final String CHEMICAL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChemicalName() <em>Chemical Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChemicalName()
   * @generated
   * @ordered
   */
  protected String chemicalName = CHEMICAL_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getCommonName() <em>Common Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommonName()
   * @generated
   * @ordered
   */
  protected static final String COMMON_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCommonName() <em>Common Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommonName()
   * @generated
   * @ordered
   */
  protected String commonName = COMMON_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChemCompoundImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JoveNotesPackage.Literals.CHEM_COMPOUND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSymbol()
  {
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbol(String newSymbol)
  {
    String oldSymbol = symbol;
    symbol = newSymbol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.CHEM_COMPOUND__SYMBOL, oldSymbol, symbol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getChemicalName()
  {
    return chemicalName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChemicalName(String newChemicalName)
  {
    String oldChemicalName = chemicalName;
    chemicalName = newChemicalName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.CHEM_COMPOUND__CHEMICAL_NAME, oldChemicalName, chemicalName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCommonName()
  {
    return commonName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommonName(String newCommonName)
  {
    String oldCommonName = commonName;
    commonName = newCommonName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.CHEM_COMPOUND__COMMON_NAME, oldCommonName, commonName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JoveNotesPackage.CHEM_COMPOUND__SYMBOL:
        return getSymbol();
      case JoveNotesPackage.CHEM_COMPOUND__CHEMICAL_NAME:
        return getChemicalName();
      case JoveNotesPackage.CHEM_COMPOUND__COMMON_NAME:
        return getCommonName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JoveNotesPackage.CHEM_COMPOUND__SYMBOL:
        setSymbol((String)newValue);
        return;
      case JoveNotesPackage.CHEM_COMPOUND__CHEMICAL_NAME:
        setChemicalName((String)newValue);
        return;
      case JoveNotesPackage.CHEM_COMPOUND__COMMON_NAME:
        setCommonName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JoveNotesPackage.CHEM_COMPOUND__SYMBOL:
        setSymbol(SYMBOL_EDEFAULT);
        return;
      case JoveNotesPackage.CHEM_COMPOUND__CHEMICAL_NAME:
        setChemicalName(CHEMICAL_NAME_EDEFAULT);
        return;
      case JoveNotesPackage.CHEM_COMPOUND__COMMON_NAME:
        setCommonName(COMMON_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JoveNotesPackage.CHEM_COMPOUND__SYMBOL:
        return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
      case JoveNotesPackage.CHEM_COMPOUND__CHEMICAL_NAME:
        return CHEMICAL_NAME_EDEFAULT == null ? chemicalName != null : !CHEMICAL_NAME_EDEFAULT.equals(chemicalName);
      case JoveNotesPackage.CHEM_COMPOUND__COMMON_NAME:
        return COMMON_NAME_EDEFAULT == null ? commonName != null : !COMMON_NAME_EDEFAULT.equals(commonName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (symbol: ");
    result.append(symbol);
    result.append(", chemicalName: ");
    result.append(chemicalName);
    result.append(", commonName: ");
    result.append(commonName);
    result.append(')');
    return result.toString();
  }

} //ChemCompoundImpl
