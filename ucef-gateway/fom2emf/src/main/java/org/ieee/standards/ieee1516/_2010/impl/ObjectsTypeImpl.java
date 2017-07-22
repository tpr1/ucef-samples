/**
 */
package org.ieee.standards.ieee1516._2010.impl;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ieee.standards.ieee1516._2010.ObjectClassType1;
import org.ieee.standards.ieee1516._2010.ObjectsType;
import org.ieee.standards.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objects Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectsTypeImpl#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectsTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectsTypeImpl#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectsTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectsTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectsTypeImpl extends MinimalEObjectImpl.Container implements ObjectsType {
	/**
	 * The cached value of the '{@link #getObjectClass() <em>Object Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClass()
	 * @generated
	 * @ordered
	 */
	protected ObjectClassType1 objectClass;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getIdtag() <em>Idtag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdtag()
	 * @generated
	 * @ordered
	 */
	protected static final String IDTAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdtag() <em>Idtag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdtag()
	 * @generated
	 * @ordered
	 */
	protected String idtag = IDTAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected List<String> notes = NOTES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2010Package.eINSTANCE.getObjectsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassType1 getObjectClass() {
		return objectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectClass(ObjectClassType1 newObjectClass, NotificationChain msgs) {
		ObjectClassType1 oldObjectClass = objectClass;
		objectClass = newObjectClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.OBJECTS_TYPE__OBJECT_CLASS, oldObjectClass, newObjectClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectClass(ObjectClassType1 newObjectClass) {
		if (newObjectClass != objectClass) {
			NotificationChain msgs = null;
			if (objectClass != null)
				msgs = ((InternalEObject)objectClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECTS_TYPE__OBJECT_CLASS, null, msgs);
			if (newObjectClass != null)
				msgs = ((InternalEObject)newObjectClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECTS_TYPE__OBJECT_CLASS, null, msgs);
			msgs = basicSetObjectClass(newObjectClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECTS_TYPE__OBJECT_CLASS, newObjectClass, newObjectClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _2010Package.OBJECTS_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdtag() {
		return idtag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdtag(String newIdtag) {
		String oldIdtag = idtag;
		idtag = newIdtag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECTS_TYPE__IDTAG, oldIdtag, idtag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(List<String> newNotes) {
		List<String> oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECTS_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _2010Package.OBJECTS_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2010Package.OBJECTS_TYPE__OBJECT_CLASS:
				return basicSetObjectClass(null, msgs);
			case _2010Package.OBJECTS_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case _2010Package.OBJECTS_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2010Package.OBJECTS_TYPE__OBJECT_CLASS:
				return getObjectClass();
			case _2010Package.OBJECTS_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _2010Package.OBJECTS_TYPE__IDTAG:
				return getIdtag();
			case _2010Package.OBJECTS_TYPE__NOTES:
				return getNotes();
			case _2010Package.OBJECTS_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _2010Package.OBJECTS_TYPE__OBJECT_CLASS:
				setObjectClass((ObjectClassType1)newValue);
				return;
			case _2010Package.OBJECTS_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _2010Package.OBJECTS_TYPE__IDTAG:
				setIdtag((String)newValue);
				return;
			case _2010Package.OBJECTS_TYPE__NOTES:
				setNotes((List<String>)newValue);
				return;
			case _2010Package.OBJECTS_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case _2010Package.OBJECTS_TYPE__OBJECT_CLASS:
				setObjectClass((ObjectClassType1)null);
				return;
			case _2010Package.OBJECTS_TYPE__ANY:
				getAny().clear();
				return;
			case _2010Package.OBJECTS_TYPE__IDTAG:
				setIdtag(IDTAG_EDEFAULT);
				return;
			case _2010Package.OBJECTS_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case _2010Package.OBJECTS_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _2010Package.OBJECTS_TYPE__OBJECT_CLASS:
				return objectClass != null;
			case _2010Package.OBJECTS_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _2010Package.OBJECTS_TYPE__IDTAG:
				return IDTAG_EDEFAULT == null ? idtag != null : !IDTAG_EDEFAULT.equals(idtag);
			case _2010Package.OBJECTS_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case _2010Package.OBJECTS_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (any: ");
		result.append(any);
		result.append(", idtag: ");
		result.append(idtag);
		result.append(", notes: ");
		result.append(notes);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ObjectsTypeImpl
