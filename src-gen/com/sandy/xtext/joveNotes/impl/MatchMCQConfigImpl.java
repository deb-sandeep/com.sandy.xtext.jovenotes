/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.JoveNotesPackage;
import com.sandy.xtext.joveNotes.MatchMCQConfig;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match MCQ Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MatchMCQConfigImpl#getForwardCaption <em>Forward Caption</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MatchMCQConfigImpl#getReverseCaption <em>Reverse Caption</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MatchMCQConfigImpl#getNumOptionsToShow <em>Num Options To Show</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.MatchMCQConfigImpl#getNumOptionsPerRow <em>Num Options Per Row</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchMCQConfigImpl extends MinimalEObjectImpl.Container implements MatchMCQConfig
{
  /**
   * The default value of the '{@link #getForwardCaption() <em>Forward Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForwardCaption()
   * @generated
   * @ordered
   */
  protected static final String FORWARD_CAPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getForwardCaption() <em>Forward Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForwardCaption()
   * @generated
   * @ordered
   */
  protected String forwardCaption = FORWARD_CAPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getReverseCaption() <em>Reverse Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReverseCaption()
   * @generated
   * @ordered
   */
  protected static final String REVERSE_CAPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReverseCaption() <em>Reverse Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReverseCaption()
   * @generated
   * @ordered
   */
  protected String reverseCaption = REVERSE_CAPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getNumOptionsToShow() <em>Num Options To Show</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumOptionsToShow()
   * @generated
   * @ordered
   */
  protected static final int NUM_OPTIONS_TO_SHOW_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumOptionsToShow() <em>Num Options To Show</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumOptionsToShow()
   * @generated
   * @ordered
   */
  protected int numOptionsToShow = NUM_OPTIONS_TO_SHOW_EDEFAULT;

  /**
   * The default value of the '{@link #getNumOptionsPerRow() <em>Num Options Per Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumOptionsPerRow()
   * @generated
   * @ordered
   */
  protected static final int NUM_OPTIONS_PER_ROW_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumOptionsPerRow() <em>Num Options Per Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumOptionsPerRow()
   * @generated
   * @ordered
   */
  protected int numOptionsPerRow = NUM_OPTIONS_PER_ROW_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MatchMCQConfigImpl()
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
    return JoveNotesPackage.Literals.MATCH_MCQ_CONFIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getForwardCaption()
  {
    return forwardCaption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForwardCaption(String newForwardCaption)
  {
    String oldForwardCaption = forwardCaption;
    forwardCaption = newForwardCaption;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MATCH_MCQ_CONFIG__FORWARD_CAPTION, oldForwardCaption, forwardCaption));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReverseCaption()
  {
    return reverseCaption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReverseCaption(String newReverseCaption)
  {
    String oldReverseCaption = reverseCaption;
    reverseCaption = newReverseCaption;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MATCH_MCQ_CONFIG__REVERSE_CAPTION, oldReverseCaption, reverseCaption));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumOptionsToShow()
  {
    return numOptionsToShow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumOptionsToShow(int newNumOptionsToShow)
  {
    int oldNumOptionsToShow = numOptionsToShow;
    numOptionsToShow = newNumOptionsToShow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MATCH_MCQ_CONFIG__NUM_OPTIONS_TO_SHOW, oldNumOptionsToShow, numOptionsToShow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumOptionsPerRow()
  {
    return numOptionsPerRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumOptionsPerRow(int newNumOptionsPerRow)
  {
    int oldNumOptionsPerRow = numOptionsPerRow;
    numOptionsPerRow = newNumOptionsPerRow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.MATCH_MCQ_CONFIG__NUM_OPTIONS_PER_ROW, oldNumOptionsPerRow, numOptionsPerRow));
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
      case JoveNotesPackage.MATCH_MCQ_CONFIG__FORWARD_CAPTION:
        return getForwardCaption();
      case JoveNotesPackage.MATCH_MCQ_CONFIG__REVERSE_CAPTION:
        return getReverseCaption();
      case JoveNotesPackage.MATCH_MCQ_CONFIG__NUM_OPTIONS_TO_SHOW:
        return getNumOptionsToShow();
      case JoveNotesPackage.MATCH_MCQ_CONFIG__NUM_OPTIONS_PER_ROW:
        return getNumOptionsPerRow();
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
      case JoveNotesPackage.MATCH_MCQ_CONFIG__FORWARD_CAPTION:
        setForwardCaption((String)newValue);
        return;
      case JoveNotesPackage.MATCH_MCQ_CONFIG__REVERSE_CAPTION:
        setReverseCaption((String)newValue);
        return;
      case JoveNotesPackage.MATCH_MCQ_CONFIG__NUM_OPTIONS_TO_SHOW:
        setNumOptionsToShow((Integer)newValue);
        return;
      case JoveNotesPackage.MATCH_MCQ_CONFIG__NUM_OPTIONS_PER_ROW:
        setNumOptionsPerRow((Integer)newValue);
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
      case JoveNotesPackage.MATCH_MCQ_CONFIG__FORWARD_CAPTION:
        setForwardCaption(FORWARD_CAPTION_EDEFAULT);
        return;
      case JoveNotesPackage.MATCH_MCQ_CONFIG__REVERSE_CAPTION:
        setReverseCaption(REVERSE_CAPTION_EDEFAULT);
        return;
      case JoveNotesPackage.MATCH_MCQ_CONFIG__NUM_OPTIONS_TO_SHOW:
        setNumOptionsToShow(NUM_OPTIONS_TO_SHOW_EDEFAULT);
        return;
      case JoveNotesPackage.MATCH_MCQ_CONFIG__NUM_OPTIONS_PER_ROW:
        setNumOptionsPerRow(NUM_OPTIONS_PER_ROW_EDEFAULT);
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
      case JoveNotesPackage.MATCH_MCQ_CONFIG__FORWARD_CAPTION:
        return FORWARD_CAPTION_EDEFAULT == null ? forwardCaption != null : !FORWARD_CAPTION_EDEFAULT.equals(forwardCaption);
      case JoveNotesPackage.MATCH_MCQ_CONFIG__REVERSE_CAPTION:
        return REVERSE_CAPTION_EDEFAULT == null ? reverseCaption != null : !REVERSE_CAPTION_EDEFAULT.equals(reverseCaption);
      case JoveNotesPackage.MATCH_MCQ_CONFIG__NUM_OPTIONS_TO_SHOW:
        return numOptionsToShow != NUM_OPTIONS_TO_SHOW_EDEFAULT;
      case JoveNotesPackage.MATCH_MCQ_CONFIG__NUM_OPTIONS_PER_ROW:
        return numOptionsPerRow != NUM_OPTIONS_PER_ROW_EDEFAULT;
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
    result.append(" (forwardCaption: ");
    result.append(forwardCaption);
    result.append(", reverseCaption: ");
    result.append(reverseCaption);
    result.append(", numOptionsToShow: ");
    result.append(numOptionsToShow);
    result.append(", numOptionsPerRow: ");
    result.append(numOptionsPerRow);
    result.append(')');
    return result.toString();
  }

} //MatchMCQConfigImpl
