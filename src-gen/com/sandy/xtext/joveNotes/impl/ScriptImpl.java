/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.EvalVar;
import com.sandy.xtext.joveNotes.JoveNotesPackage;
import com.sandy.xtext.joveNotes.Script;
import com.sandy.xtext.joveNotes.ScriptBody;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.ScriptImpl#getEvalVars <em>Eval Vars</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.ScriptImpl#getScriptBody <em>Script Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptImpl extends MinimalEObjectImpl.Container implements Script
{
  /**
   * The cached value of the '{@link #getEvalVars() <em>Eval Vars</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvalVars()
   * @generated
   * @ordered
   */
  protected EList<EvalVar> evalVars;

  /**
   * The cached value of the '{@link #getScriptBody() <em>Script Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScriptBody()
   * @generated
   * @ordered
   */
  protected ScriptBody scriptBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScriptImpl()
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
    return JoveNotesPackage.Literals.SCRIPT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EvalVar> getEvalVars()
  {
    if (evalVars == null)
    {
      evalVars = new EObjectContainmentEList<EvalVar>(EvalVar.class, this, JoveNotesPackage.SCRIPT__EVAL_VARS);
    }
    return evalVars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptBody getScriptBody()
  {
    return scriptBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScriptBody(ScriptBody newScriptBody, NotificationChain msgs)
  {
    ScriptBody oldScriptBody = scriptBody;
    scriptBody = newScriptBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoveNotesPackage.SCRIPT__SCRIPT_BODY, oldScriptBody, newScriptBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScriptBody(ScriptBody newScriptBody)
  {
    if (newScriptBody != scriptBody)
    {
      NotificationChain msgs = null;
      if (scriptBody != null)
        msgs = ((InternalEObject)scriptBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.SCRIPT__SCRIPT_BODY, null, msgs);
      if (newScriptBody != null)
        msgs = ((InternalEObject)newScriptBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.SCRIPT__SCRIPT_BODY, null, msgs);
      msgs = basicSetScriptBody(newScriptBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.SCRIPT__SCRIPT_BODY, newScriptBody, newScriptBody));
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
      case JoveNotesPackage.SCRIPT__EVAL_VARS:
        return ((InternalEList<?>)getEvalVars()).basicRemove(otherEnd, msgs);
      case JoveNotesPackage.SCRIPT__SCRIPT_BODY:
        return basicSetScriptBody(null, msgs);
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
      case JoveNotesPackage.SCRIPT__EVAL_VARS:
        return getEvalVars();
      case JoveNotesPackage.SCRIPT__SCRIPT_BODY:
        return getScriptBody();
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
      case JoveNotesPackage.SCRIPT__EVAL_VARS:
        getEvalVars().clear();
        getEvalVars().addAll((Collection<? extends EvalVar>)newValue);
        return;
      case JoveNotesPackage.SCRIPT__SCRIPT_BODY:
        setScriptBody((ScriptBody)newValue);
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
      case JoveNotesPackage.SCRIPT__EVAL_VARS:
        getEvalVars().clear();
        return;
      case JoveNotesPackage.SCRIPT__SCRIPT_BODY:
        setScriptBody((ScriptBody)null);
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
      case JoveNotesPackage.SCRIPT__EVAL_VARS:
        return evalVars != null && !evalVars.isEmpty();
      case JoveNotesPackage.SCRIPT__SCRIPT_BODY:
        return scriptBody != null;
    }
    return super.eIsSet(featureID);
  }

} //ScriptImpl
