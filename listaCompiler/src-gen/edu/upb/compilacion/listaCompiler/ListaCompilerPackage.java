/**
 */
package edu.upb.compilacion.listaCompiler;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.upb.compilacion.listaCompiler.ListaCompilerFactory
 * @model kind="package"
 * @generated
 */
public interface ListaCompilerPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "listaCompiler";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.upb.edu/compilacion/ListaCompiler";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "listaCompiler";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ListaCompilerPackage eINSTANCE = edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl.init();

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.ListaImpl <em>Lista</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.ListaImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getLista()
   * @generated
   */
  int LISTA = 0;

  /**
   * The feature id for the '<em><b>Lines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTA__LINES = 0;

  /**
   * The number of structural features of the '<em>Lista</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.EvaluationImpl <em>Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.EvaluationImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getEvaluation()
   * @generated
   */
  int EVALUATION = 1;

  /**
   * The feature id for the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__RETURN = 0;

  /**
   * The number of structural features of the '<em>Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.FunctionDefinitionImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getFunctionDefinition()
   * @generated
   */
  int FUNCTION_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__RETURN = 2;

  /**
   * The number of structural features of the '<em>Function Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.ExpressionImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.FirstLevelExpImpl <em>First Level Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.FirstLevelExpImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getFirstLevelExp()
   * @generated
   */
  int FIRST_LEVEL_EXP = 4;

  /**
   * The feature id for the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRST_LEVEL_EXP__FIRST = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Second</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRST_LEVEL_EXP__SECOND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>First Level Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRST_LEVEL_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.SecondLevelExpImpl <em>Second Level Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.SecondLevelExpImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getSecondLevelExp()
   * @generated
   */
  int SECOND_LEVEL_EXP = 5;

  /**
   * The feature id for the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECOND_LEVEL_EXP__FIRST = 0;

  /**
   * The feature id for the '<em><b>Second</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECOND_LEVEL_EXP__SECOND = 1;

  /**
   * The number of structural features of the '<em>Second Level Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECOND_LEVEL_EXP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.ThirdLevelExpImpl <em>Third Level Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.ThirdLevelExpImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getThirdLevelExp()
   * @generated
   */
  int THIRD_LEVEL_EXP = 6;

  /**
   * The feature id for the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIRD_LEVEL_EXP__FIRST = 0;

  /**
   * The feature id for the '<em><b>Second</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIRD_LEVEL_EXP__SECOND = 1;

  /**
   * The number of structural features of the '<em>Third Level Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIRD_LEVEL_EXP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.TermImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getTerm()
   * @generated
   */
  int TERM = 7;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.MyIntegerImpl <em>My Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.MyIntegerImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getMyInteger()
   * @generated
   */
  int MY_INTEGER = 8;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_INTEGER__VAL = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>My Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_INTEGER_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.PosIntegerImpl <em>Pos Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.PosIntegerImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getPosInteger()
   * @generated
   */
  int POS_INTEGER = 9;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POS_INTEGER__VAL = MY_INTEGER__VAL;

  /**
   * The number of structural features of the '<em>Pos Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POS_INTEGER_FEATURE_COUNT = MY_INTEGER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.NegIntegerImpl <em>Neg Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.NegIntegerImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getNegInteger()
   * @generated
   */
  int NEG_INTEGER = 10;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEG_INTEGER__VAL = MY_INTEGER__VAL;

  /**
   * The number of structural features of the '<em>Neg Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEG_INTEGER_FEATURE_COUNT = MY_INTEGER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.MyVariableImpl <em>My Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.MyVariableImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getMyVariable()
   * @generated
   */
  int MY_VARIABLE = 11;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_VARIABLE__VAR = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>My Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_VARIABLE_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.BoolTermImpl <em>Bool Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.BoolTermImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getBoolTerm()
   * @generated
   */
  int BOOL_TERM = 12;

  /**
   * The number of structural features of the '<em>Bool Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.MyBoolImpl <em>My Bool</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.MyBoolImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getMyBool()
   * @generated
   */
  int MY_BOOL = 13;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_BOOL__VAL = BOOL_TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>My Bool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_BOOL_FEATURE_COUNT = BOOL_TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.MyStringImpl <em>My String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.MyStringImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getMyString()
   * @generated
   */
  int MY_STRING = 14;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_STRING__VAL = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>My String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_STRING_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.IfControlFlowImpl <em>If Control Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.IfControlFlowImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getIfControlFlow()
   * @generated
   */
  int IF_CONTROL_FLOW = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_CONTROL_FLOW__NAME = TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_CONTROL_FLOW__COND = TERM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Iftrue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_CONTROL_FLOW__IFTRUE = TERM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Iffalse</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_CONTROL_FLOW__IFFALSE = TERM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>If Control Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_CONTROL_FLOW_FEATURE_COUNT = TERM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.FunctionCallImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 16;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__FUNCTION = TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__ARGS = TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.IntListImpl <em>Int List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.IntListImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getIntList()
   * @generated
   */
  int INT_LIST = 17;

  /**
   * The feature id for the '<em><b>Elems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LIST__ELEMS = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LIST_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.upb.compilacion.listaCompiler.impl.PreDefFunctionImpl <em>Pre Def Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.compilacion.listaCompiler.impl.PreDefFunctionImpl
   * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getPreDefFunction()
   * @generated
   */
  int PRE_DEF_FUNCTION = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_DEF_FUNCTION__NAME = 0;

  /**
   * The number of structural features of the '<em>Pre Def Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_DEF_FUNCTION_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.Lista <em>Lista</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lista</em>'.
   * @see edu.upb.compilacion.listaCompiler.Lista
   * @generated
   */
  EClass getLista();

  /**
   * Returns the meta object for the containment reference list '{@link edu.upb.compilacion.listaCompiler.Lista#getLines <em>Lines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lines</em>'.
   * @see edu.upb.compilacion.listaCompiler.Lista#getLines()
   * @see #getLista()
   * @generated
   */
  EReference getLista_Lines();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.Evaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation</em>'.
   * @see edu.upb.compilacion.listaCompiler.Evaluation
   * @generated
   */
  EClass getEvaluation();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.compilacion.listaCompiler.Evaluation#getReturn <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return</em>'.
   * @see edu.upb.compilacion.listaCompiler.Evaluation#getReturn()
   * @see #getEvaluation()
   * @generated
   */
  EReference getEvaluation_Return();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.FunctionDefinition <em>Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Definition</em>'.
   * @see edu.upb.compilacion.listaCompiler.FunctionDefinition
   * @generated
   */
  EClass getFunctionDefinition();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.compilacion.listaCompiler.FunctionDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.upb.compilacion.listaCompiler.FunctionDefinition#getName()
   * @see #getFunctionDefinition()
   * @generated
   */
  EAttribute getFunctionDefinition_Name();

  /**
   * Returns the meta object for the attribute list '{@link edu.upb.compilacion.listaCompiler.FunctionDefinition#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see edu.upb.compilacion.listaCompiler.FunctionDefinition#getParams()
   * @see #getFunctionDefinition()
   * @generated
   */
  EAttribute getFunctionDefinition_Params();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.compilacion.listaCompiler.FunctionDefinition#getReturn <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return</em>'.
   * @see edu.upb.compilacion.listaCompiler.FunctionDefinition#getReturn()
   * @see #getFunctionDefinition()
   * @generated
   */
  EReference getFunctionDefinition_Return();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see edu.upb.compilacion.listaCompiler.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.FirstLevelExp <em>First Level Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>First Level Exp</em>'.
   * @see edu.upb.compilacion.listaCompiler.FirstLevelExp
   * @generated
   */
  EClass getFirstLevelExp();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.compilacion.listaCompiler.FirstLevelExp#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First</em>'.
   * @see edu.upb.compilacion.listaCompiler.FirstLevelExp#getFirst()
   * @see #getFirstLevelExp()
   * @generated
   */
  EReference getFirstLevelExp_First();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.compilacion.listaCompiler.FirstLevelExp#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second</em>'.
   * @see edu.upb.compilacion.listaCompiler.FirstLevelExp#getSecond()
   * @see #getFirstLevelExp()
   * @generated
   */
  EReference getFirstLevelExp_Second();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.SecondLevelExp <em>Second Level Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Second Level Exp</em>'.
   * @see edu.upb.compilacion.listaCompiler.SecondLevelExp
   * @generated
   */
  EClass getSecondLevelExp();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.compilacion.listaCompiler.SecondLevelExp#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First</em>'.
   * @see edu.upb.compilacion.listaCompiler.SecondLevelExp#getFirst()
   * @see #getSecondLevelExp()
   * @generated
   */
  EReference getSecondLevelExp_First();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.compilacion.listaCompiler.SecondLevelExp#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second</em>'.
   * @see edu.upb.compilacion.listaCompiler.SecondLevelExp#getSecond()
   * @see #getSecondLevelExp()
   * @generated
   */
  EReference getSecondLevelExp_Second();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.ThirdLevelExp <em>Third Level Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Third Level Exp</em>'.
   * @see edu.upb.compilacion.listaCompiler.ThirdLevelExp
   * @generated
   */
  EClass getThirdLevelExp();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.compilacion.listaCompiler.ThirdLevelExp#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First</em>'.
   * @see edu.upb.compilacion.listaCompiler.ThirdLevelExp#getFirst()
   * @see #getThirdLevelExp()
   * @generated
   */
  EReference getThirdLevelExp_First();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.compilacion.listaCompiler.ThirdLevelExp#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second</em>'.
   * @see edu.upb.compilacion.listaCompiler.ThirdLevelExp#getSecond()
   * @see #getThirdLevelExp()
   * @generated
   */
  EReference getThirdLevelExp_Second();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see edu.upb.compilacion.listaCompiler.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.MyInteger <em>My Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Integer</em>'.
   * @see edu.upb.compilacion.listaCompiler.MyInteger
   * @generated
   */
  EClass getMyInteger();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.compilacion.listaCompiler.MyInteger#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see edu.upb.compilacion.listaCompiler.MyInteger#getVal()
   * @see #getMyInteger()
   * @generated
   */
  EAttribute getMyInteger_Val();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.PosInteger <em>Pos Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pos Integer</em>'.
   * @see edu.upb.compilacion.listaCompiler.PosInteger
   * @generated
   */
  EClass getPosInteger();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.NegInteger <em>Neg Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neg Integer</em>'.
   * @see edu.upb.compilacion.listaCompiler.NegInteger
   * @generated
   */
  EClass getNegInteger();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.MyVariable <em>My Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Variable</em>'.
   * @see edu.upb.compilacion.listaCompiler.MyVariable
   * @generated
   */
  EClass getMyVariable();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.compilacion.listaCompiler.MyVariable#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see edu.upb.compilacion.listaCompiler.MyVariable#getVar()
   * @see #getMyVariable()
   * @generated
   */
  EAttribute getMyVariable_Var();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.BoolTerm <em>Bool Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Term</em>'.
   * @see edu.upb.compilacion.listaCompiler.BoolTerm
   * @generated
   */
  EClass getBoolTerm();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.MyBool <em>My Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Bool</em>'.
   * @see edu.upb.compilacion.listaCompiler.MyBool
   * @generated
   */
  EClass getMyBool();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.compilacion.listaCompiler.MyBool#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see edu.upb.compilacion.listaCompiler.MyBool#getVal()
   * @see #getMyBool()
   * @generated
   */
  EAttribute getMyBool_Val();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.MyString <em>My String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My String</em>'.
   * @see edu.upb.compilacion.listaCompiler.MyString
   * @generated
   */
  EClass getMyString();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.compilacion.listaCompiler.MyString#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see edu.upb.compilacion.listaCompiler.MyString#getVal()
   * @see #getMyString()
   * @generated
   */
  EAttribute getMyString_Val();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.IfControlFlow <em>If Control Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Control Flow</em>'.
   * @see edu.upb.compilacion.listaCompiler.IfControlFlow
   * @generated
   */
  EClass getIfControlFlow();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.compilacion.listaCompiler.IfControlFlow#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.upb.compilacion.listaCompiler.IfControlFlow#getName()
   * @see #getIfControlFlow()
   * @generated
   */
  EAttribute getIfControlFlow_Name();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.compilacion.listaCompiler.IfControlFlow#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see edu.upb.compilacion.listaCompiler.IfControlFlow#getCond()
   * @see #getIfControlFlow()
   * @generated
   */
  EReference getIfControlFlow_Cond();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.compilacion.listaCompiler.IfControlFlow#getIftrue <em>Iftrue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iftrue</em>'.
   * @see edu.upb.compilacion.listaCompiler.IfControlFlow#getIftrue()
   * @see #getIfControlFlow()
   * @generated
   */
  EReference getIfControlFlow_Iftrue();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.compilacion.listaCompiler.IfControlFlow#getIffalse <em>Iffalse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iffalse</em>'.
   * @see edu.upb.compilacion.listaCompiler.IfControlFlow#getIffalse()
   * @see #getIfControlFlow()
   * @generated
   */
  EReference getIfControlFlow_Iffalse();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see edu.upb.compilacion.listaCompiler.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.compilacion.listaCompiler.FunctionCall#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see edu.upb.compilacion.listaCompiler.FunctionCall#getFunction()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Function();

  /**
   * Returns the meta object for the containment reference list '{@link edu.upb.compilacion.listaCompiler.FunctionCall#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see edu.upb.compilacion.listaCompiler.FunctionCall#getArgs()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Args();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.IntList <em>Int List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int List</em>'.
   * @see edu.upb.compilacion.listaCompiler.IntList
   * @generated
   */
  EClass getIntList();

  /**
   * Returns the meta object for the containment reference list '{@link edu.upb.compilacion.listaCompiler.IntList#getElems <em>Elems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elems</em>'.
   * @see edu.upb.compilacion.listaCompiler.IntList#getElems()
   * @see #getIntList()
   * @generated
   */
  EReference getIntList_Elems();

  /**
   * Returns the meta object for class '{@link edu.upb.compilacion.listaCompiler.PreDefFunction <em>Pre Def Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Def Function</em>'.
   * @see edu.upb.compilacion.listaCompiler.PreDefFunction
   * @generated
   */
  EClass getPreDefFunction();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.compilacion.listaCompiler.PreDefFunction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.upb.compilacion.listaCompiler.PreDefFunction#getName()
   * @see #getPreDefFunction()
   * @generated
   */
  EAttribute getPreDefFunction_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ListaCompilerFactory getListaCompilerFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.ListaImpl <em>Lista</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.ListaImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getLista()
     * @generated
     */
    EClass LISTA = eINSTANCE.getLista();

    /**
     * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LISTA__LINES = eINSTANCE.getLista_Lines();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.EvaluationImpl <em>Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.EvaluationImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getEvaluation()
     * @generated
     */
    EClass EVALUATION = eINSTANCE.getEvaluation();

    /**
     * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION__RETURN = eINSTANCE.getEvaluation_Return();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.FunctionDefinitionImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getFunctionDefinition()
     * @generated
     */
    EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DEFINITION__NAME = eINSTANCE.getFunctionDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DEFINITION__PARAMS = eINSTANCE.getFunctionDefinition_Params();

    /**
     * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEFINITION__RETURN = eINSTANCE.getFunctionDefinition_Return();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.ExpressionImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.FirstLevelExpImpl <em>First Level Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.FirstLevelExpImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getFirstLevelExp()
     * @generated
     */
    EClass FIRST_LEVEL_EXP = eINSTANCE.getFirstLevelExp();

    /**
     * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIRST_LEVEL_EXP__FIRST = eINSTANCE.getFirstLevelExp_First();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIRST_LEVEL_EXP__SECOND = eINSTANCE.getFirstLevelExp_Second();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.SecondLevelExpImpl <em>Second Level Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.SecondLevelExpImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getSecondLevelExp()
     * @generated
     */
    EClass SECOND_LEVEL_EXP = eINSTANCE.getSecondLevelExp();

    /**
     * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECOND_LEVEL_EXP__FIRST = eINSTANCE.getSecondLevelExp_First();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECOND_LEVEL_EXP__SECOND = eINSTANCE.getSecondLevelExp_Second();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.ThirdLevelExpImpl <em>Third Level Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.ThirdLevelExpImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getThirdLevelExp()
     * @generated
     */
    EClass THIRD_LEVEL_EXP = eINSTANCE.getThirdLevelExp();

    /**
     * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THIRD_LEVEL_EXP__FIRST = eINSTANCE.getThirdLevelExp_First();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THIRD_LEVEL_EXP__SECOND = eINSTANCE.getThirdLevelExp_Second();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.TermImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.MyIntegerImpl <em>My Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.MyIntegerImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getMyInteger()
     * @generated
     */
    EClass MY_INTEGER = eINSTANCE.getMyInteger();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_INTEGER__VAL = eINSTANCE.getMyInteger_Val();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.PosIntegerImpl <em>Pos Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.PosIntegerImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getPosInteger()
     * @generated
     */
    EClass POS_INTEGER = eINSTANCE.getPosInteger();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.NegIntegerImpl <em>Neg Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.NegIntegerImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getNegInteger()
     * @generated
     */
    EClass NEG_INTEGER = eINSTANCE.getNegInteger();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.MyVariableImpl <em>My Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.MyVariableImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getMyVariable()
     * @generated
     */
    EClass MY_VARIABLE = eINSTANCE.getMyVariable();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_VARIABLE__VAR = eINSTANCE.getMyVariable_Var();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.BoolTermImpl <em>Bool Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.BoolTermImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getBoolTerm()
     * @generated
     */
    EClass BOOL_TERM = eINSTANCE.getBoolTerm();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.MyBoolImpl <em>My Bool</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.MyBoolImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getMyBool()
     * @generated
     */
    EClass MY_BOOL = eINSTANCE.getMyBool();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_BOOL__VAL = eINSTANCE.getMyBool_Val();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.MyStringImpl <em>My String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.MyStringImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getMyString()
     * @generated
     */
    EClass MY_STRING = eINSTANCE.getMyString();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_STRING__VAL = eINSTANCE.getMyString_Val();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.IfControlFlowImpl <em>If Control Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.IfControlFlowImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getIfControlFlow()
     * @generated
     */
    EClass IF_CONTROL_FLOW = eINSTANCE.getIfControlFlow();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_CONTROL_FLOW__NAME = eINSTANCE.getIfControlFlow_Name();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_CONTROL_FLOW__COND = eINSTANCE.getIfControlFlow_Cond();

    /**
     * The meta object literal for the '<em><b>Iftrue</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_CONTROL_FLOW__IFTRUE = eINSTANCE.getIfControlFlow_Iftrue();

    /**
     * The meta object literal for the '<em><b>Iffalse</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_CONTROL_FLOW__IFFALSE = eINSTANCE.getIfControlFlow_Iffalse();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.FunctionCallImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__FUNCTION = eINSTANCE.getFunctionCall_Function();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__ARGS = eINSTANCE.getFunctionCall_Args();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.IntListImpl <em>Int List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.IntListImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getIntList()
     * @generated
     */
    EClass INT_LIST = eINSTANCE.getIntList();

    /**
     * The meta object literal for the '<em><b>Elems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INT_LIST__ELEMS = eINSTANCE.getIntList_Elems();

    /**
     * The meta object literal for the '{@link edu.upb.compilacion.listaCompiler.impl.PreDefFunctionImpl <em>Pre Def Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.compilacion.listaCompiler.impl.PreDefFunctionImpl
     * @see edu.upb.compilacion.listaCompiler.impl.ListaCompilerPackageImpl#getPreDefFunction()
     * @generated
     */
    EClass PRE_DEF_FUNCTION = eINSTANCE.getPreDefFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRE_DEF_FUNCTION__NAME = eINSTANCE.getPreDefFunction_Name();

  }

} //ListaCompilerPackage