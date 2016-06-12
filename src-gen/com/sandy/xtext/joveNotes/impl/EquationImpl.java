/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.EqSymbol;
import com.sandy.xtext.joveNotes.Equation;
import com.sandy.xtext.joveNotes.JoveNotesPackage;
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
 * An implementation of the model object '<em><b>Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.EquationImpl#getScript <em>Script</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.EquationImpl#getHideFromView <em>Hide From View</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.EquationImpl#getEquation <em>Equation</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.EquationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.EquationImpl#getSymbols <em>Symbols</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquationImpl extends NotesElementImpl implements Equation
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
   * The default value of the '{@link #getEquation() <em>Equation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquation()
   * @generated
   * @ordered
   */
  protected static final String EQUATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEquation() <em>Equation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquation()
   * @generated
   * @ordered
   */
  protected String equation = EQUATION_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getSymbols() <em>Symbols</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbols()
   * @generated
   * @ordered
   */
  protected EList<EqSymbol> symbols;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EquationImpl()
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
    return JoveNotesPackage.Literals.EQUATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoveNotesPackage.EQUATION__SCRIPT, oldScript, newScript);
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
        msgs = ((InternalEObject)script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.EQUATION__SCRIPT, null, msgs);
      if (newScript != null)
        msgs = ((InternalEObject)newScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.EQUATION__SCRIPT, null, msgs);
      msgs = basicSetScript(newScript, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.EQUATION__SCRIPT, newScript, newScript));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.EQUATION__HIDE_FROM_VIEW, oldHideFromView, hideFromView));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEquation()
  {
    return equation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEquation(String newEquation)
  {
    String oldEquation = equation;
    equation = newEquation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.EQUATION__EQUATION, oldEquation, equation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.EQUATION__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EqSymbol> getSymbols()
  {
    if (symbols == null)
    {
      symbols = new EObjectContainmentEList<EqSymbol>(EqSymbol.class, this, JoveNotesPackage.EQUATION__SYMBOLS);
    }
    return symbols;
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
      case JoveNotesPackage.EQUATION__SCRIPT:
        return basicSetScript(null, msgs);
      case JoveNotesPackage.EQUATION__SYMBOLS:
        return ((InternalEList<?>)getSymbols()).basicRemove(otherEnd, msgs);
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
      case JoveNotesPackage.EQUATION__SCRIPT:
        return getScript();
      case JoveNotesPackage.EQUATION__HIDE_FROM_VIEW:
        return getHideFromView();
      case JoveNotesPackage.EQUATION__EQUATION:
        return getEquation();
      case JoveNotesPackage.EQUATION__DESCRIPTION:
        return getDescription();
      case JoveNotesPackage.EQUATION__SYMBOLS:
        return getSymbols();
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
      case JoveNotesPackage.EQUATION__SCRIPT:
        setScript((Script)newValue);
        return;
      case JoveNotesPackage.EQUATION__HIDE_FROM_VIEW:
        setHideFromView((String)newValue);
        return;
      case JoveNotesPackage.EQUATION__EQUATION:
        setEquation((String)newValue);
        return;
      case JoveNotesPackage.EQUATION__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case JoveNotesPackage.EQUATION__SYMBOLS:
        getSymbols().clear();
        getSymbols().addAll((Collection<? extends EqSymbol>)newValue);
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
      case JoveNotesPackage.EQUATION__SCRIPT:
        setScript((Script)null);
        return;
      case JoveNotesPackage.EQUATION__HIDE_FROM_VIEW:
        setHideFromView(HIDE_FROM_VIEW_EDEFAULT);
        return;
      case JoveNotesPackage.EQUATION__EQUATION:
        setEquation(EQUATION_EDEFAULT);
        return;
      case JoveNotesPackage.EQUATION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case JoveNotesPackage.EQUATION__SYMBOLS:
        getSymbols().clear();
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
      case JoveNotesPackage.EQUATION__SCRIPT:
        return script != null;
      case JoveNotesPackage.EQUATION__HIDE_FROM_VIEW:
        return HIDE_FROM_VIEW_EDEFAULT == null ? hideFromView != null : !HIDE_FROM_VIEW_EDEFAULT.equals(hideFromView);
      case JoveNotesPackage.EQUATION__EQUATION:
        return EQUATION_EDEFAULT == null ? equation != null : !EQUATION_EDEFAULT.equals(equation);
      case JoveNotesPackage.EQUATION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case JoveNotesPackage.EQUATION__SYMBOLS:
        return symbols != null && !symbols.isEmpty();
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
    result.append(", equation: ");
    result.append(equation);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //EquationImpl
