/**
 */
package com.sandy.xtext.joveNotes.impl;

import com.sandy.xtext.joveNotes.ChapterDetails;
import com.sandy.xtext.joveNotes.JoveNotes;
import com.sandy.xtext.joveNotes.JoveNotesPackage;
import com.sandy.xtext.joveNotes.NotesElement;
import com.sandy.xtext.joveNotes.ProcessingHints;

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
 * An implementation of the model object '<em><b>Jove Notes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.JoveNotesImpl#getProcessingHints <em>Processing Hints</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.JoveNotesImpl#getChapterDetails <em>Chapter Details</em>}</li>
 *   <li>{@link com.sandy.xtext.joveNotes.impl.JoveNotesImpl#getNotesElements <em>Notes Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoveNotesImpl extends MinimalEObjectImpl.Container implements JoveNotes
{
  /**
   * The cached value of the '{@link #getProcessingHints() <em>Processing Hints</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessingHints()
   * @generated
   * @ordered
   */
  protected ProcessingHints processingHints;

  /**
   * The cached value of the '{@link #getChapterDetails() <em>Chapter Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChapterDetails()
   * @generated
   * @ordered
   */
  protected ChapterDetails chapterDetails;

  /**
   * The cached value of the '{@link #getNotesElements() <em>Notes Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotesElements()
   * @generated
   * @ordered
   */
  protected EList<NotesElement> notesElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JoveNotesImpl()
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
    return JoveNotesPackage.Literals.JOVE_NOTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProcessingHints getProcessingHints()
  {
    return processingHints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcessingHints(ProcessingHints newProcessingHints, NotificationChain msgs)
  {
    ProcessingHints oldProcessingHints = processingHints;
    processingHints = newProcessingHints;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoveNotesPackage.JOVE_NOTES__PROCESSING_HINTS, oldProcessingHints, newProcessingHints);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProcessingHints(ProcessingHints newProcessingHints)
  {
    if (newProcessingHints != processingHints)
    {
      NotificationChain msgs = null;
      if (processingHints != null)
        msgs = ((InternalEObject)processingHints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.JOVE_NOTES__PROCESSING_HINTS, null, msgs);
      if (newProcessingHints != null)
        msgs = ((InternalEObject)newProcessingHints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.JOVE_NOTES__PROCESSING_HINTS, null, msgs);
      msgs = basicSetProcessingHints(newProcessingHints, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.JOVE_NOTES__PROCESSING_HINTS, newProcessingHints, newProcessingHints));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ChapterDetails getChapterDetails()
  {
    return chapterDetails;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChapterDetails(ChapterDetails newChapterDetails, NotificationChain msgs)
  {
    ChapterDetails oldChapterDetails = chapterDetails;
    chapterDetails = newChapterDetails;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoveNotesPackage.JOVE_NOTES__CHAPTER_DETAILS, oldChapterDetails, newChapterDetails);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setChapterDetails(ChapterDetails newChapterDetails)
  {
    if (newChapterDetails != chapterDetails)
    {
      NotificationChain msgs = null;
      if (chapterDetails != null)
        msgs = ((InternalEObject)chapterDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.JOVE_NOTES__CHAPTER_DETAILS, null, msgs);
      if (newChapterDetails != null)
        msgs = ((InternalEObject)newChapterDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoveNotesPackage.JOVE_NOTES__CHAPTER_DETAILS, null, msgs);
      msgs = basicSetChapterDetails(newChapterDetails, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoveNotesPackage.JOVE_NOTES__CHAPTER_DETAILS, newChapterDetails, newChapterDetails));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NotesElement> getNotesElements()
  {
    if (notesElements == null)
    {
      notesElements = new EObjectContainmentEList<NotesElement>(NotesElement.class, this, JoveNotesPackage.JOVE_NOTES__NOTES_ELEMENTS);
    }
    return notesElements;
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
      case JoveNotesPackage.JOVE_NOTES__PROCESSING_HINTS:
        return basicSetProcessingHints(null, msgs);
      case JoveNotesPackage.JOVE_NOTES__CHAPTER_DETAILS:
        return basicSetChapterDetails(null, msgs);
      case JoveNotesPackage.JOVE_NOTES__NOTES_ELEMENTS:
        return ((InternalEList<?>)getNotesElements()).basicRemove(otherEnd, msgs);
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
      case JoveNotesPackage.JOVE_NOTES__PROCESSING_HINTS:
        return getProcessingHints();
      case JoveNotesPackage.JOVE_NOTES__CHAPTER_DETAILS:
        return getChapterDetails();
      case JoveNotesPackage.JOVE_NOTES__NOTES_ELEMENTS:
        return getNotesElements();
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
      case JoveNotesPackage.JOVE_NOTES__PROCESSING_HINTS:
        setProcessingHints((ProcessingHints)newValue);
        return;
      case JoveNotesPackage.JOVE_NOTES__CHAPTER_DETAILS:
        setChapterDetails((ChapterDetails)newValue);
        return;
      case JoveNotesPackage.JOVE_NOTES__NOTES_ELEMENTS:
        getNotesElements().clear();
        getNotesElements().addAll((Collection<? extends NotesElement>)newValue);
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
      case JoveNotesPackage.JOVE_NOTES__PROCESSING_HINTS:
        setProcessingHints((ProcessingHints)null);
        return;
      case JoveNotesPackage.JOVE_NOTES__CHAPTER_DETAILS:
        setChapterDetails((ChapterDetails)null);
        return;
      case JoveNotesPackage.JOVE_NOTES__NOTES_ELEMENTS:
        getNotesElements().clear();
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
      case JoveNotesPackage.JOVE_NOTES__PROCESSING_HINTS:
        return processingHints != null;
      case JoveNotesPackage.JOVE_NOTES__CHAPTER_DETAILS:
        return chapterDetails != null;
      case JoveNotesPackage.JOVE_NOTES__NOTES_ELEMENTS:
        return notesElements != null && !notesElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JoveNotesImpl
