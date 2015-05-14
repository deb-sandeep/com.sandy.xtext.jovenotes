/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.CMap;
import com.sandy.xtext.joveNotes.JoveNotesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.CharacterImpl#getCharacter <em>Character</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.CharacterImpl#getEstimate <em>Estimate</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.CharacterImpl#getCmap <em>Cmap</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharacterImpl extends NotesElementImpl implements com.sandy.xtext.joveNotes.Character
{
  /**
   * The default value of the '{@link #getCharacter() <em>Character</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacter()
   * @generated
   * @ordered
   */
  protected static final String CHARACTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCharacter() <em>Character</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacter()
   * @generated
   * @ordered
   */
  protected String character = CHARACTER_EDEFAULT;

  /**
   * The default value of the '{@link #getEstimate() <em>Estimate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstimate()
   * @generated
   * @ordered
   */
  protected static final String ESTIMATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEstimate() <em>Estimate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstimate()
   * @generated
   * @ordered
   */
  protected String estimate = ESTIMATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCmap() <em>Cmap</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmap()
   * @generated
   * @ordered
   */
  protected CMap cmap;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CharacterImpl()
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
    return JoveNotesPackage.Literals.CHARACTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCharacter()
  {
    return character;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCharacter(String newCharacter)
  {
    String oldCharacter = character;
    character = newCharacter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.CHARACTER__CHARACTER, oldCharacter, character));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEstimate()
  {
    return estimate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEstimate(String newEstimate)
  {
    String oldEstimate = estimate;
    estimate = newEstimate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.CHARACTER__ESTIMATE, oldEstimate, estimate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CMap getCmap()
  {
    return cmap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmap(CMap newCmap, NotificationChain msgs)
  {
    CMap oldCmap = cmap;
    cmap = newCmap;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoveNotesPackage.CHARACTER__CMAP, oldCmap, newCmap);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmap(CMap newCmap)
  {
    if (newCmap != cmap)
    {
      NotificationChain msgs = null;
      if (cmap != null)
        msgs = ((InternalEObject)cmap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.CHARACTER__CMAP, null, msgs);
      if (newCmap != null)
        msgs = ((InternalEObject)newCmap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.CHARACTER__CMAP, null, msgs);
      msgs = basicSetCmap(newCmap, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.CHARACTER__CMAP, newCmap, newCmap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JoveNotesPackage.CHARACTER__CMAP:
        return basicSetCmap(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case JoveNotesPackage.CHARACTER__CHARACTER:
        return getCharacter();
      case JoveNotesPackage.CHARACTER__ESTIMATE:
        return getEstimate();
      case JoveNotesPackage.CHARACTER__CMAP:
        return getCmap();
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
      case JoveNotesPackage.CHARACTER__CHARACTER:
        setCharacter((String)newValue);
        return;
      case JoveNotesPackage.CHARACTER__ESTIMATE:
        setEstimate((String)newValue);
        return;
      case JoveNotesPackage.CHARACTER__CMAP:
        setCmap((CMap)newValue);
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
      case JoveNotesPackage.CHARACTER__CHARACTER:
        setCharacter(CHARACTER_EDEFAULT);
        return;
      case JoveNotesPackage.CHARACTER__ESTIMATE:
        setEstimate(ESTIMATE_EDEFAULT);
        return;
      case JoveNotesPackage.CHARACTER__CMAP:
        setCmap((CMap)null);
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
      case JoveNotesPackage.CHARACTER__CHARACTER:
        return CHARACTER_EDEFAULT == null ? character != null : !CHARACTER_EDEFAULT.equals(character);
      case JoveNotesPackage.CHARACTER__ESTIMATE:
        return ESTIMATE_EDEFAULT == null ? estimate != null : !ESTIMATE_EDEFAULT.equals(estimate);
      case JoveNotesPackage.CHARACTER__CMAP:
        return cmap != null;
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
    result.append(" (character: ");
    result.append(character);
    result.append(", estimate: ");
    result.append(estimate);
    result.append(')');
    return result.toString();
  }

} //CharacterImpl
