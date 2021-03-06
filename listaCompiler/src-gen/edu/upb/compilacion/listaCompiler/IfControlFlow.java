/**
 */
package edu.upb.compilacion.listaCompiler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Control Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.compilacion.listaCompiler.IfControlFlow#getCond <em>Cond</em>}</li>
 *   <li>{@link edu.upb.compilacion.listaCompiler.IfControlFlow#getIftrue <em>Iftrue</em>}</li>
 *   <li>{@link edu.upb.compilacion.listaCompiler.IfControlFlow#getIffalse <em>Iffalse</em>}</li>
 * </ul>
 *
 * @see edu.upb.compilacion.listaCompiler.ListaCompilerPackage#getIfControlFlow()
 * @model
 * @generated
 */
public interface IfControlFlow extends ComplexTerm
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Expression)
   * @see edu.upb.compilacion.listaCompiler.ListaCompilerPackage#getIfControlFlow_Cond()
   * @model containment="true"
   * @generated
   */
  Expression getCond();

  /**
   * Sets the value of the '{@link edu.upb.compilacion.listaCompiler.IfControlFlow#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Expression value);

  /**
   * Returns the value of the '<em><b>Iftrue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iftrue</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iftrue</em>' containment reference.
   * @see #setIftrue(Expression)
   * @see edu.upb.compilacion.listaCompiler.ListaCompilerPackage#getIfControlFlow_Iftrue()
   * @model containment="true"
   * @generated
   */
  Expression getIftrue();

  /**
   * Sets the value of the '{@link edu.upb.compilacion.listaCompiler.IfControlFlow#getIftrue <em>Iftrue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iftrue</em>' containment reference.
   * @see #getIftrue()
   * @generated
   */
  void setIftrue(Expression value);

  /**
   * Returns the value of the '<em><b>Iffalse</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iffalse</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iffalse</em>' containment reference.
   * @see #setIffalse(Expression)
   * @see edu.upb.compilacion.listaCompiler.ListaCompilerPackage#getIfControlFlow_Iffalse()
   * @model containment="true"
   * @generated
   */
  Expression getIffalse();

  /**
   * Sets the value of the '{@link edu.upb.compilacion.listaCompiler.IfControlFlow#getIffalse <em>Iffalse</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iffalse</em>' containment reference.
   * @see #getIffalse()
   * @generated
   */
  void setIffalse(Expression value);

} // IfControlFlow
