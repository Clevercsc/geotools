/**
 */
package net.opengis.ows20.impl;

import java.util.Collection;

import net.opengis.ows20.AllowedValuesType;
import net.opengis.ows20.RangeType;
import net.opengis.ows20.ValueType;
import net.opengis.ows20.Ows20Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allowed Values Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows20.impl.AllowedValuesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.ows20.impl.AllowedValuesTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.ows20.impl.AllowedValuesTypeImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllowedValuesTypeImpl extends EObjectImpl implements AllowedValuesType {
    /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
    protected FeatureMap group;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected AllowedValuesTypeImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return Ows20Package.Literals.ALLOWED_VALUES_TYPE;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, Ows20Package.ALLOWED_VALUES_TYPE__GROUP);
    }
    return group;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EList<ValueType> getValue() {
    return getGroup().list(Ows20Package.Literals.ALLOWED_VALUES_TYPE__VALUE);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EList<RangeType> getRange() {
    return getGroup().list(Ows20Package.Literals.ALLOWED_VALUES_TYPE__RANGE);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Ows20Package.ALLOWED_VALUES_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case Ows20Package.ALLOWED_VALUES_TYPE__VALUE:
        return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
      case Ows20Package.ALLOWED_VALUES_TYPE__RANGE:
        return ((InternalEList<?>)getRange()).basicRemove(otherEnd, msgs);
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
      case Ows20Package.ALLOWED_VALUES_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case Ows20Package.ALLOWED_VALUES_TYPE__VALUE:
        return getValue();
      case Ows20Package.ALLOWED_VALUES_TYPE__RANGE:
        return getRange();
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
      case Ows20Package.ALLOWED_VALUES_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case Ows20Package.ALLOWED_VALUES_TYPE__VALUE:
        getValue().clear();
        getValue().addAll((Collection<? extends ValueType>)newValue);
        return;
      case Ows20Package.ALLOWED_VALUES_TYPE__RANGE:
        getRange().clear();
        getRange().addAll((Collection<? extends RangeType>)newValue);
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
      case Ows20Package.ALLOWED_VALUES_TYPE__GROUP:
        getGroup().clear();
        return;
      case Ows20Package.ALLOWED_VALUES_TYPE__VALUE:
        getValue().clear();
        return;
      case Ows20Package.ALLOWED_VALUES_TYPE__RANGE:
        getRange().clear();
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
      case Ows20Package.ALLOWED_VALUES_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case Ows20Package.ALLOWED_VALUES_TYPE__VALUE:
        return !getValue().isEmpty();
      case Ows20Package.ALLOWED_VALUES_TYPE__RANGE:
        return !getRange().isEmpty();
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (group: ");
    result.append(group);
    result.append(')');
    return result.toString();
  }

} //AllowedValuesTypeImpl
