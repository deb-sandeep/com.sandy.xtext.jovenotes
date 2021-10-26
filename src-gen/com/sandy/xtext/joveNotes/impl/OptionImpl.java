/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.JoveNotesPackage;
import com.sandy.xtext.joveNotes.Option;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.OptionImpl#getOptionValue <em>Option Value</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.OptionImpl#getCorrectOption <em>Correct Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionImpl extends MinimalEObjectImpl.Container implements Option
{
  /**
   * The default value of the '{@link #getOptionValue() <em>Option Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionValue()
   * @generated
   * @ordered
   */
  protected static final String OPTION_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOptionValue() <em>Option Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionValue()
   * @generated
   * @ordered
   */
  protected String optionValue = OPTION_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getCorrectOption() <em>Correct Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorrectOption()
   * @generated
   * @ordered
   */
  protected static final String CORRECT_OPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCorrectOption() <em>Correct Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorrectOption()
   * @generated
   * @ordered
   */
  protected String correctOption = CORRECT_OPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptionImpl()
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
    return JoveNotesPackage.Literals.OPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOptionValue()
  {
    return optionValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOptionValue(String newOptionValue)
  {
    String oldOptionValue = optionValue;
    optionValue = newOptionValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.OPTION__OPTION_VALUE, oldOptionValue, optionValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCorrectOption()
  {
    return correctOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCorrectOption(String newCorrectOption)
  {
    String oldCorrectOption = correctOption;
    correctOption = newCorrectOption;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.OPTION__CORRECT_OPTION, oldCorrectOption, correctOption));
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
      case JoveNotesPackage.OPTION__OPTION_VALUE:
        return getOptionValue();
      case JoveNotesPackage.OPTION__CORRECT_OPTION:
        return getCorrectOption();
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
      case JoveNotesPackage.OPTION__OPTION_VALUE:
        setOptionValue((String)newValue);
        return;
      case JoveNotesPackage.OPTION__CORRECT_OPTION:
        setCorrectOption((String)newValue);
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
      case JoveNotesPackage.OPTION__OPTION_VALUE:
        setOptionValue(OPTION_VALUE_EDEFAULT);
        return;
      case JoveNotesPackage.OPTION__CORRECT_OPTION:
        setCorrectOption(CORRECT_OPTION_EDEFAULT);
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
      case JoveNotesPackage.OPTION__OPTION_VALUE:
        return OPTION_VALUE_EDEFAULT == null ? optionValue != null : !OPTION_VALUE_EDEFAULT.equals(optionValue);
      case JoveNotesPackage.OPTION__CORRECT_OPTION:
        return CORRECT_OPTION_EDEFAULT == null ? correctOption != null : !CORRECT_OPTION_EDEFAULT.equals(correctOption);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (optionValue: ");
    result.append(optionValue);
    result.append(", correctOption: ");
    result.append(correctOption);
    result.append(')');
    return result.toString();
  }

} //OptionImpl
