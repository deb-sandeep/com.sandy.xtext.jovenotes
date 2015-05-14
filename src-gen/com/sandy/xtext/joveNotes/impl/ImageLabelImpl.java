/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.HotSpot;
import com.sandy.xtext.joveNotes.ImageLabel;
import com.sandy.xtext.joveNotes.JoveNotesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.ImageLabelImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.ImageLabelImpl#getImageName <em>Image Name</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.ImageLabelImpl#getHotspots <em>Hotspots</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageLabelImpl extends NotesElementImpl implements ImageLabel
{
  /**
   * The default value of the '{@link #getCaption() <em>Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaption()
   * @generated
   * @ordered
   */
  protected static final String CAPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCaption() <em>Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaption()
   * @generated
   * @ordered
   */
  protected String caption = CAPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getImageName() <em>Image Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImageName()
   * @generated
   * @ordered
   */
  protected static final String IMAGE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImageName() <em>Image Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImageName()
   * @generated
   * @ordered
   */
  protected String imageName = IMAGE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getHotspots() <em>Hotspots</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHotspots()
   * @generated
   * @ordered
   */
  protected EList<HotSpot> hotspots;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImageLabelImpl()
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
    return JoveNotesPackage.Literals.IMAGE_LABEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCaption()
  {
    return caption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaption(String newCaption)
  {
    String oldCaption = caption;
    caption = newCaption;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.IMAGE_LABEL__CAPTION, oldCaption, caption));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImageName()
  {
    return imageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImageName(String newImageName)
  {
    String oldImageName = imageName;
    imageName = newImageName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.IMAGE_LABEL__IMAGE_NAME, oldImageName, imageName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HotSpot> getHotspots()
  {
    if (hotspots == null)
    {
      hotspots = new EObjectContainmentEList<HotSpot>(HotSpot.class, this, JoveNotesPackage.IMAGE_LABEL__HOTSPOTS);
    }
    return hotspots;
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
      case JoveNotesPackage.IMAGE_LABEL__HOTSPOTS:
        return ((InternalEList<?>)getHotspots()).basicRemove(otherEnd, msgs);
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
      case JoveNotesPackage.IMAGE_LABEL__CAPTION:
        return getCaption();
      case JoveNotesPackage.IMAGE_LABEL__IMAGE_NAME:
        return getImageName();
      case JoveNotesPackage.IMAGE_LABEL__HOTSPOTS:
        return getHotspots();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JoveNotesPackage.IMAGE_LABEL__CAPTION:
        setCaption((String)newValue);
        return;
      case JoveNotesPackage.IMAGE_LABEL__IMAGE_NAME:
        setImageName((String)newValue);
        return;
      case JoveNotesPackage.IMAGE_LABEL__HOTSPOTS:
        getHotspots().clear();
        getHotspots().addAll((Collection<? extends HotSpot>)newValue);
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
      case JoveNotesPackage.IMAGE_LABEL__CAPTION:
        setCaption(CAPTION_EDEFAULT);
        return;
      case JoveNotesPackage.IMAGE_LABEL__IMAGE_NAME:
        setImageName(IMAGE_NAME_EDEFAULT);
        return;
      case JoveNotesPackage.IMAGE_LABEL__HOTSPOTS:
        getHotspots().clear();
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
      case JoveNotesPackage.IMAGE_LABEL__CAPTION:
        return CAPTION_EDEFAULT == null ? caption != null : !CAPTION_EDEFAULT.equals(caption);
      case JoveNotesPackage.IMAGE_LABEL__IMAGE_NAME:
        return IMAGE_NAME_EDEFAULT == null ? imageName != null : !IMAGE_NAME_EDEFAULT.equals(imageName);
      case JoveNotesPackage.IMAGE_LABEL__HOTSPOTS:
        return hotspots != null && !hotspots.isEmpty();
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
    result.append(" (caption: ");
    result.append(caption);
    result.append(", imageName: ");
    result.append(imageName);
    result.append(')');
    return result.toString();
  }

} //ImageLabelImpl