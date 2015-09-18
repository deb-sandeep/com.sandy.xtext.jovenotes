/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.JoveNotesPackage;
import com.sandy.xtext.joveNotes.RTCElement;
import com.sandy.xtext.joveNotes.RefToContext;
import com.sandy.xtext.joveNotes.Script;

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
 * An implementation of the model object '<em><b>Ref To Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.RefToContextImpl#getScript <em>Script</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.RefToContextImpl#getHideFromView <em>Hide From View</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.RefToContextImpl#getContext <em>Context</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.RefToContextImpl#getRtcElement <em>Rtc Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefToContextImpl extends NotesElementImpl implements RefToContext
{
  /**
   * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScript()
   * @generated
   * @ordered
   */
  protected Script script;

  /**
   * The default value of the '{@link #getHideFromView() <em>Hide From View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHideFromView()
   * @generated
   * @ordered
   */
  protected static final String HIDE_FROM_VIEW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHideFromView() <em>Hide From View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHideFromView()
   * @generated
   * @ordered
   */
  protected String hideFromView = HIDE_FROM_VIEW_EDEFAULT;

  /**
   * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected static final String CONTEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected String context = CONTEXT_EDEFAULT;

  /**
   * The cached value of the '{@link #getRtcElement() <em>Rtc Element</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRtcElement()
   * @generated
   * @ordered
   */
  protected EList<RTCElement> rtcElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefToContextImpl()
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
    return JoveNotesPackage.Literals.REF_TO_CONTEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script getScript()
  {
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScript(Script newScript, NotificationChain msgs)
  {
    Script oldScript = script;
    script = newScript;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoveNotesPackage.REF_TO_CONTEXT__SCRIPT, oldScript, newScript);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScript(Script newScript)
  {
    if (newScript != script)
    {
      NotificationChain msgs = null;
      if (script != null)
        msgs = ((InternalEObject)script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.REF_TO_CONTEXT__SCRIPT, null, msgs);
      if (newScript != null)
        msgs = ((InternalEObject)newScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.REF_TO_CONTEXT__SCRIPT, null, msgs);
      msgs = basicSetScript(newScript, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.REF_TO_CONTEXT__SCRIPT, newScript, newScript));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHideFromView()
  {
    return hideFromView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHideFromView(String newHideFromView)
  {
    String oldHideFromView = hideFromView;
    hideFromView = newHideFromView;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.REF_TO_CONTEXT__HIDE_FROM_VIEW, oldHideFromView, hideFromView));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContext()
  {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContext(String newContext)
  {
    String oldContext = context;
    context = newContext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.REF_TO_CONTEXT__CONTEXT, oldContext, context));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RTCElement> getRtcElement()
  {
    if (rtcElement == null)
    {
      rtcElement = new EObjectContainmentEList<RTCElement>(RTCElement.class, this, JoveNotesPackage.REF_TO_CONTEXT__RTC_ELEMENT);
    }
    return rtcElement;
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
      case JoveNotesPackage.REF_TO_CONTEXT__SCRIPT:
        return basicSetScript(null, msgs);
      case JoveNotesPackage.REF_TO_CONTEXT__RTC_ELEMENT:
        return ((InternalEList<?>)getRtcElement()).basicRemove(otherEnd, msgs);
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
      case JoveNotesPackage.REF_TO_CONTEXT__SCRIPT:
        return getScript();
      case JoveNotesPackage.REF_TO_CONTEXT__HIDE_FROM_VIEW:
        return getHideFromView();
      case JoveNotesPackage.REF_TO_CONTEXT__CONTEXT:
        return getContext();
      case JoveNotesPackage.REF_TO_CONTEXT__RTC_ELEMENT:
        return getRtcElement();
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
      case JoveNotesPackage.REF_TO_CONTEXT__SCRIPT:
        setScript((Script)newValue);
        return;
      case JoveNotesPackage.REF_TO_CONTEXT__HIDE_FROM_VIEW:
        setHideFromView((String)newValue);
        return;
      case JoveNotesPackage.REF_TO_CONTEXT__CONTEXT:
        setContext((String)newValue);
        return;
      case JoveNotesPackage.REF_TO_CONTEXT__RTC_ELEMENT:
        getRtcElement().clear();
        getRtcElement().addAll((Collection<? extends RTCElement>)newValue);
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
      case JoveNotesPackage.REF_TO_CONTEXT__SCRIPT:
        setScript((Script)null);
        return;
      case JoveNotesPackage.REF_TO_CONTEXT__HIDE_FROM_VIEW:
        setHideFromView(HIDE_FROM_VIEW_EDEFAULT);
        return;
      case JoveNotesPackage.REF_TO_CONTEXT__CONTEXT:
        setContext(CONTEXT_EDEFAULT);
        return;
      case JoveNotesPackage.REF_TO_CONTEXT__RTC_ELEMENT:
        getRtcElement().clear();
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
      case JoveNotesPackage.REF_TO_CONTEXT__SCRIPT:
        return script != null;
      case JoveNotesPackage.REF_TO_CONTEXT__HIDE_FROM_VIEW:
        return HIDE_FROM_VIEW_EDEFAULT == null ? hideFromView != null : !HIDE_FROM_VIEW_EDEFAULT.equals(hideFromView);
      case JoveNotesPackage.REF_TO_CONTEXT__CONTEXT:
        return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
      case JoveNotesPackage.REF_TO_CONTEXT__RTC_ELEMENT:
        return rtcElement != null && !rtcElement.isEmpty();
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
    result.append(" (hideFromView: ");
    result.append(hideFromView);
    result.append(", context: ");
    result.append(context);
    result.append(')');
    return result.toString();
  }

} //RefToContextImpl
