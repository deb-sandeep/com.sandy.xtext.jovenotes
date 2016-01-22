/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.Event;
import com.sandy.xtext.joveNotes.JoveNotesPackage;
import com.sandy.xtext.joveNotes.Script;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.EventImpl#getScript <em>Script</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.EventImpl#getHideFromView <em>Hide From View</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.EventImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.EventImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends NotesElementImpl implements Event
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
   * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected static final String EVENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected String event = EVENT_EDEFAULT;

  /**
   * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected static final String TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected String time = TIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
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
    return JoveNotesPackage.Literals.EVENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoveNotesPackage.EVENT__SCRIPT, oldScript, newScript);
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
        msgs = ((InternalEObject)script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.EVENT__SCRIPT, null, msgs);
      if (newScript != null)
        msgs = ((InternalEObject)newScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.EVENT__SCRIPT, null, msgs);
      msgs = basicSetScript(newScript, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.EVENT__SCRIPT, newScript, newScript));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.EVENT__HIDE_FROM_VIEW, oldHideFromView, hideFromView));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(String newEvent)
  {
    String oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.EVENT__EVENT, oldEvent, event));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime(String newTime)
  {
    String oldTime = time;
    time = newTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.EVENT__TIME, oldTime, time));
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
      case JoveNotesPackage.EVENT__SCRIPT:
        return basicSetScript(null, msgs);
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
      case JoveNotesPackage.EVENT__SCRIPT:
        return getScript();
      case JoveNotesPackage.EVENT__HIDE_FROM_VIEW:
        return getHideFromView();
      case JoveNotesPackage.EVENT__EVENT:
        return getEvent();
      case JoveNotesPackage.EVENT__TIME:
        return getTime();
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
      case JoveNotesPackage.EVENT__SCRIPT:
        setScript((Script)newValue);
        return;
      case JoveNotesPackage.EVENT__HIDE_FROM_VIEW:
        setHideFromView((String)newValue);
        return;
      case JoveNotesPackage.EVENT__EVENT:
        setEvent((String)newValue);
        return;
      case JoveNotesPackage.EVENT__TIME:
        setTime((String)newValue);
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
      case JoveNotesPackage.EVENT__SCRIPT:
        setScript((Script)null);
        return;
      case JoveNotesPackage.EVENT__HIDE_FROM_VIEW:
        setHideFromView(HIDE_FROM_VIEW_EDEFAULT);
        return;
      case JoveNotesPackage.EVENT__EVENT:
        setEvent(EVENT_EDEFAULT);
        return;
      case JoveNotesPackage.EVENT__TIME:
        setTime(TIME_EDEFAULT);
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
      case JoveNotesPackage.EVENT__SCRIPT:
        return script != null;
      case JoveNotesPackage.EVENT__HIDE_FROM_VIEW:
        return HIDE_FROM_VIEW_EDEFAULT == null ? hideFromView != null : !HIDE_FROM_VIEW_EDEFAULT.equals(hideFromView);
      case JoveNotesPackage.EVENT__EVENT:
        return EVENT_EDEFAULT == null ? event != null : !EVENT_EDEFAULT.equals(event);
      case JoveNotesPackage.EVENT__TIME:
        return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
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
    result.append(", event: ");
    result.append(event);
    result.append(", time: ");
    result.append(time);
    result.append(')');
    return result.toString();
  }

} //EventImpl
