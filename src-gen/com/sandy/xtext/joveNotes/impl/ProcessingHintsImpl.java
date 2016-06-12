/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.JoveNotesPackage;
import com.sandy.xtext.joveNotes.ProcessingHints;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Hints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.ProcessingHintsImpl#getSkipGeneration <em>Skip Generation</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.ProcessingHintsImpl#getSkipGenerationInProduction <em>Skip Generation In Production</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingHintsImpl extends MinimalEObjectImpl.Container implements ProcessingHints
{
  /**
   * The default value of the '{@link #getSkipGeneration() <em>Skip Generation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkipGeneration()
   * @generated
   * @ordered
   */
  protected static final String SKIP_GENERATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSkipGeneration() <em>Skip Generation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkipGeneration()
   * @generated
   * @ordered
   */
  protected String skipGeneration = SKIP_GENERATION_EDEFAULT;

  /**
   * The default value of the '{@link #getSkipGenerationInProduction() <em>Skip Generation In Production</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkipGenerationInProduction()
   * @generated
   * @ordered
   */
  protected static final String SKIP_GENERATION_IN_PRODUCTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSkipGenerationInProduction() <em>Skip Generation In Production</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkipGenerationInProduction()
   * @generated
   * @ordered
   */
  protected String skipGenerationInProduction = SKIP_GENERATION_IN_PRODUCTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessingHintsImpl()
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
    return JoveNotesPackage.Literals.PROCESSING_HINTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSkipGeneration()
  {
    return skipGeneration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSkipGeneration(String newSkipGeneration)
  {
    String oldSkipGeneration = skipGeneration;
    skipGeneration = newSkipGeneration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.PROCESSING_HINTS__SKIP_GENERATION, oldSkipGeneration, skipGeneration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSkipGenerationInProduction()
  {
    return skipGenerationInProduction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSkipGenerationInProduction(String newSkipGenerationInProduction)
  {
    String oldSkipGenerationInProduction = skipGenerationInProduction;
    skipGenerationInProduction = newSkipGenerationInProduction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.PROCESSING_HINTS__SKIP_GENERATION_IN_PRODUCTION, oldSkipGenerationInProduction, skipGenerationInProduction));
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
      case JoveNotesPackage.PROCESSING_HINTS__SKIP_GENERATION:
        return getSkipGeneration();
      case JoveNotesPackage.PROCESSING_HINTS__SKIP_GENERATION_IN_PRODUCTION:
        return getSkipGenerationInProduction();
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
      case JoveNotesPackage.PROCESSING_HINTS__SKIP_GENERATION:
        setSkipGeneration((String)newValue);
        return;
      case JoveNotesPackage.PROCESSING_HINTS__SKIP_GENERATION_IN_PRODUCTION:
        setSkipGenerationInProduction((String)newValue);
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
      case JoveNotesPackage.PROCESSING_HINTS__SKIP_GENERATION:
        setSkipGeneration(SKIP_GENERATION_EDEFAULT);
        return;
      case JoveNotesPackage.PROCESSING_HINTS__SKIP_GENERATION_IN_PRODUCTION:
        setSkipGenerationInProduction(SKIP_GENERATION_IN_PRODUCTION_EDEFAULT);
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
      case JoveNotesPackage.PROCESSING_HINTS__SKIP_GENERATION:
        return SKIP_GENERATION_EDEFAULT == null ? skipGeneration != null : !SKIP_GENERATION_EDEFAULT.equals(skipGeneration);
      case JoveNotesPackage.PROCESSING_HINTS__SKIP_GENERATION_IN_PRODUCTION:
        return SKIP_GENERATION_IN_PRODUCTION_EDEFAULT == null ? skipGenerationInProduction != null : !SKIP_GENERATION_IN_PRODUCTION_EDEFAULT.equals(skipGenerationInProduction);
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
    result.append(" (skipGeneration: ");
    result.append(skipGeneration);
    result.append(", skipGenerationInProduction: ");
    result.append(skipGenerationInProduction);
    result.append(')');
    return result.toString();
  }

} //ProcessingHintsImpl
