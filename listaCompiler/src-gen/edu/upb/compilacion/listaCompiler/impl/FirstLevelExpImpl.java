/**
 */
package edu.upb.compilacion.listaCompiler.impl;

import edu.upb.compilacion.listaCompiler.FirstLevelExp;
import edu.upb.compilacion.listaCompiler.FirstLevelOp;
import edu.upb.compilacion.listaCompiler.ListaCompilerPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>First Level Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.compilacion.listaCompiler.impl.FirstLevelExpImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link edu.upb.compilacion.listaCompiler.impl.FirstLevelExpImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FirstLevelExpImpl extends MinimalEObjectImpl.Container implements FirstLevelExp
{
  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<EObject> args;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final FirstLevelOp OP_EDEFAULT = FirstLevelOp.AND;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected FirstLevelOp op = OP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FirstLevelExpImpl()
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
    return ListaCompilerPackage.Literals.FIRST_LEVEL_EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<EObject>(EObject.class, this, ListaCompilerPackage.FIRST_LEVEL_EXP__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FirstLevelOp getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(FirstLevelOp newOp)
  {
    FirstLevelOp oldOp = op;
    op = newOp == null ? OP_EDEFAULT : newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ListaCompilerPackage.FIRST_LEVEL_EXP__OP, oldOp, op));
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
      case ListaCompilerPackage.FIRST_LEVEL_EXP__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
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
      case ListaCompilerPackage.FIRST_LEVEL_EXP__ARGS:
        return getArgs();
      case ListaCompilerPackage.FIRST_LEVEL_EXP__OP:
        return getOp();
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
      case ListaCompilerPackage.FIRST_LEVEL_EXP__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends EObject>)newValue);
        return;
      case ListaCompilerPackage.FIRST_LEVEL_EXP__OP:
        setOp((FirstLevelOp)newValue);
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
      case ListaCompilerPackage.FIRST_LEVEL_EXP__ARGS:
        getArgs().clear();
        return;
      case ListaCompilerPackage.FIRST_LEVEL_EXP__OP:
        setOp(OP_EDEFAULT);
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
      case ListaCompilerPackage.FIRST_LEVEL_EXP__ARGS:
        return args != null && !args.isEmpty();
      case ListaCompilerPackage.FIRST_LEVEL_EXP__OP:
        return op != OP_EDEFAULT;
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //FirstLevelExpImpl
