/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.ChapterDetails;
import com.sandy.xtext.joveNotes.JoveNotesPackage;
import com.sandy.xtext.joveNotes.Script;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chapter Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.ChapterDetailsImpl#getTestPaper <em>Test Paper</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.ChapterDetailsImpl#getSubjectName <em>Subject Name</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.ChapterDetailsImpl#getChapterNumber <em>Chapter Number</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.ChapterDetailsImpl#getSubChapterNumber <em>Sub Chapter Number</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.ChapterDetailsImpl#getChapterName <em>Chapter Name</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.ChapterDetailsImpl#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChapterDetailsImpl extends MinimalEObjectImpl.Container implements ChapterDetails
{
  /**
   * The default value of the '{@link #getTestPaper() <em>Test Paper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestPaper()
   * @generated
   * @ordered
   */
  protected static final String TEST_PAPER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTestPaper() <em>Test Paper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestPaper()
   * @generated
   * @ordered
   */
  protected String testPaper = TEST_PAPER_EDEFAULT;

  /**
   * The default value of the '{@link #getSubjectName() <em>Subject Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubjectName()
   * @generated
   * @ordered
   */
  protected static final String SUBJECT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubjectName() <em>Subject Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubjectName()
   * @generated
   * @ordered
   */
  protected String subjectName = SUBJECT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getChapterNumber() <em>Chapter Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChapterNumber()
   * @generated
   * @ordered
   */
  protected static final int CHAPTER_NUMBER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getChapterNumber() <em>Chapter Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChapterNumber()
   * @generated
   * @ordered
   */
  protected int chapterNumber = CHAPTER_NUMBER_EDEFAULT;

  /**
   * The default value of the '{@link #getSubChapterNumber() <em>Sub Chapter Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubChapterNumber()
   * @generated
   * @ordered
   */
  protected static final int SUB_CHAPTER_NUMBER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSubChapterNumber() <em>Sub Chapter Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubChapterNumber()
   * @generated
   * @ordered
   */
  protected int subChapterNumber = SUB_CHAPTER_NUMBER_EDEFAULT;

  /**
   * The default value of the '{@link #getChapterName() <em>Chapter Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChapterName()
   * @generated
   * @ordered
   */
  protected static final String CHAPTER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChapterName() <em>Chapter Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChapterName()
   * @generated
   * @ordered
   */
  protected String chapterName = CHAPTER_NAME_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChapterDetailsImpl()
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
    return JoveNotesPackage.Literals.CHAPTER_DETAILS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTestPaper()
  {
    return testPaper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTestPaper(String newTestPaper)
  {
    String oldTestPaper = testPaper;
    testPaper = newTestPaper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.CHAPTER_DETAILS__TEST_PAPER, oldTestPaper, testPaper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubjectName()
  {
    return subjectName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubjectName(String newSubjectName)
  {
    String oldSubjectName = subjectName;
    subjectName = newSubjectName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.CHAPTER_DETAILS__SUBJECT_NAME, oldSubjectName, subjectName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getChapterNumber()
  {
    return chapterNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChapterNumber(int newChapterNumber)
  {
    int oldChapterNumber = chapterNumber;
    chapterNumber = newChapterNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.CHAPTER_DETAILS__CHAPTER_NUMBER, oldChapterNumber, chapterNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSubChapterNumber()
  {
    return subChapterNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubChapterNumber(int newSubChapterNumber)
  {
    int oldSubChapterNumber = subChapterNumber;
    subChapterNumber = newSubChapterNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.CHAPTER_DETAILS__SUB_CHAPTER_NUMBER, oldSubChapterNumber, subChapterNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getChapterName()
  {
    return chapterName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChapterName(String newChapterName)
  {
    String oldChapterName = chapterName;
    chapterName = newChapterName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.CHAPTER_DETAILS__CHAPTER_NAME, oldChapterName, chapterName));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoveNotesPackage.CHAPTER_DETAILS__SCRIPT, oldScript, newScript);
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
        msgs = ((InternalEObject)script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.CHAPTER_DETAILS__SCRIPT, null, msgs);
      if (newScript != null)
        msgs = ((InternalEObject)newScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.CHAPTER_DETAILS__SCRIPT, null, msgs);
      msgs = basicSetScript(newScript, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.CHAPTER_DETAILS__SCRIPT, newScript, newScript));
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
      case JoveNotesPackage.CHAPTER_DETAILS__SCRIPT:
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
      case JoveNotesPackage.CHAPTER_DETAILS__TEST_PAPER:
        return getTestPaper();
      case JoveNotesPackage.CHAPTER_DETAILS__SUBJECT_NAME:
        return getSubjectName();
      case JoveNotesPackage.CHAPTER_DETAILS__CHAPTER_NUMBER:
        return getChapterNumber();
      case JoveNotesPackage.CHAPTER_DETAILS__SUB_CHAPTER_NUMBER:
        return getSubChapterNumber();
      case JoveNotesPackage.CHAPTER_DETAILS__CHAPTER_NAME:
        return getChapterName();
      case JoveNotesPackage.CHAPTER_DETAILS__SCRIPT:
        return getScript();
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
      case JoveNotesPackage.CHAPTER_DETAILS__TEST_PAPER:
        setTestPaper((String)newValue);
        return;
      case JoveNotesPackage.CHAPTER_DETAILS__SUBJECT_NAME:
        setSubjectName((String)newValue);
        return;
      case JoveNotesPackage.CHAPTER_DETAILS__CHAPTER_NUMBER:
        setChapterNumber((Integer)newValue);
        return;
      case JoveNotesPackage.CHAPTER_DETAILS__SUB_CHAPTER_NUMBER:
        setSubChapterNumber((Integer)newValue);
        return;
      case JoveNotesPackage.CHAPTER_DETAILS__CHAPTER_NAME:
        setChapterName((String)newValue);
        return;
      case JoveNotesPackage.CHAPTER_DETAILS__SCRIPT:
        setScript((Script)newValue);
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
      case JoveNotesPackage.CHAPTER_DETAILS__TEST_PAPER:
        setTestPaper(TEST_PAPER_EDEFAULT);
        return;
      case JoveNotesPackage.CHAPTER_DETAILS__SUBJECT_NAME:
        setSubjectName(SUBJECT_NAME_EDEFAULT);
        return;
      case JoveNotesPackage.CHAPTER_DETAILS__CHAPTER_NUMBER:
        setChapterNumber(CHAPTER_NUMBER_EDEFAULT);
        return;
      case JoveNotesPackage.CHAPTER_DETAILS__SUB_CHAPTER_NUMBER:
        setSubChapterNumber(SUB_CHAPTER_NUMBER_EDEFAULT);
        return;
      case JoveNotesPackage.CHAPTER_DETAILS__CHAPTER_NAME:
        setChapterName(CHAPTER_NAME_EDEFAULT);
        return;
      case JoveNotesPackage.CHAPTER_DETAILS__SCRIPT:
        setScript((Script)null);
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
      case JoveNotesPackage.CHAPTER_DETAILS__TEST_PAPER:
        return TEST_PAPER_EDEFAULT == null ? testPaper != null : !TEST_PAPER_EDEFAULT.equals(testPaper);
      case JoveNotesPackage.CHAPTER_DETAILS__SUBJECT_NAME:
        return SUBJECT_NAME_EDEFAULT == null ? subjectName != null : !SUBJECT_NAME_EDEFAULT.equals(subjectName);
      case JoveNotesPackage.CHAPTER_DETAILS__CHAPTER_NUMBER:
        return chapterNumber != CHAPTER_NUMBER_EDEFAULT;
      case JoveNotesPackage.CHAPTER_DETAILS__SUB_CHAPTER_NUMBER:
        return subChapterNumber != SUB_CHAPTER_NUMBER_EDEFAULT;
      case JoveNotesPackage.CHAPTER_DETAILS__CHAPTER_NAME:
        return CHAPTER_NAME_EDEFAULT == null ? chapterName != null : !CHAPTER_NAME_EDEFAULT.equals(chapterName);
      case JoveNotesPackage.CHAPTER_DETAILS__SCRIPT:
        return script != null;
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
    result.append(" (testPaper: ");
    result.append(testPaper);
    result.append(", subjectName: ");
    result.append(subjectName);
    result.append(", chapterNumber: ");
    result.append(chapterNumber);
    result.append(", subChapterNumber: ");
    result.append(subChapterNumber);
    result.append(", chapterName: ");
    result.append(chapterName);
    result.append(')');
    return result.toString();
  }

} //ChapterDetailsImpl
