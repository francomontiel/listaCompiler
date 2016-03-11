/**
 */
package edu.upb.compilacion.listaCompiler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Third Level Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.compilacion.listaCompiler.ThirdLevelExp#getFirst <em>First</em>}</li>
 *   <li>{@link edu.upb.compilacion.listaCompiler.ThirdLevelExp#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see edu.upb.compilacion.listaCompiler.ListaCompilerPackage#getThirdLevelExp()
 * @model
 * @generated
 */
public interface ThirdLevelExp extends EObject
{
  /**
   * Returns the value of the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' containment reference.
   * @see #setFirst(Term)
   * @see edu.upb.compilacion.listaCompiler.ListaCompilerPackage#getThirdLevelExp_First()
   * @model containment="true"
   * @generated
   */
  Term getFirst();

  /**
   * Sets the value of the '{@link edu.upb.compilacion.listaCompiler.ThirdLevelExp#getFirst <em>First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' containment reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(Term value);

  /**
   * Returns the value of the '<em><b>Second</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second</em>' containment reference.
   * @see #setSecond(ThirdLevelExp)
   * @see edu.upb.compilacion.listaCompiler.ListaCompilerPackage#getThirdLevelExp_Second()
   * @model containment="true"
   * @generated
   */
  ThirdLevelExp getSecond();

  /**
   * Sets the value of the '{@link edu.upb.compilacion.listaCompiler.ThirdLevelExp#getSecond <em>Second</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second</em>' containment reference.
   * @see #getSecond()
   * @generated
   */
  void setSecond(ThirdLevelExp value);

} // ThirdLevelExp