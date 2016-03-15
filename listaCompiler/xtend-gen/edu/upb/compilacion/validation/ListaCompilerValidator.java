/**
 * generated by Xtext
 */
package edu.upb.compilacion.validation;

import edu.upb.compilacion.MismatchedTypeException;
import edu.upb.compilacion.listaCompiler.Expression;
import edu.upb.compilacion.listaCompiler.FirstLevelExp;
import edu.upb.compilacion.listaCompiler.FirstLevelOp;
import edu.upb.compilacion.listaCompiler.FourthLevelExp;
import edu.upb.compilacion.listaCompiler.FunctionCall;
import edu.upb.compilacion.listaCompiler.FunctionDefinition;
import edu.upb.compilacion.listaCompiler.IfControlFlow;
import edu.upb.compilacion.listaCompiler.List;
import edu.upb.compilacion.listaCompiler.Lista;
import edu.upb.compilacion.listaCompiler.ListaCompilerPackage;
import edu.upb.compilacion.listaCompiler.MyBool;
import edu.upb.compilacion.listaCompiler.MyInteger;
import edu.upb.compilacion.listaCompiler.MyString;
import edu.upb.compilacion.listaCompiler.MyVariable;
import edu.upb.compilacion.listaCompiler.PDFunction;
import edu.upb.compilacion.listaCompiler.PreDefFunctionCall;
import edu.upb.compilacion.listaCompiler.SecondLevelExp;
import edu.upb.compilacion.listaCompiler.Term;
import edu.upb.compilacion.listaCompiler.ThirdLevelExp;
import edu.upb.compilacion.listaCompiler.UserDefFunctionCall;
import edu.upb.compilacion.validation.AbstractListaCompilerValidator;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class ListaCompilerValidator extends AbstractListaCompilerValidator {
  public enum DataType {
    INT,
    
    STRING,
    
    BOOL,
    
    LIST,
    
    VAR,
    
    GLOBAL;
  }
  
  public final static String WRONG_PARAMETERS_NUMBER = "wrongParametersNumber";
  
  public final static String WRONG_EXPRESSION_TYPE = "wrongExpressionType";
  
  public final static String INVALID_FUNCTION_DECLARATION = "invalidFunctionDeclaration";
  
  private HashMap<Object, Object> functionDefs = new HashMap<Object, Object>();
  
  @Check
  public void checkFunctionDefinitionsPreDefNames(final Lista lista) {
    EList<FunctionDefinition> _definitions = lista.getDefinitions();
    for (final FunctionDefinition fd : _definitions) {
      PDFunction[] _values = PDFunction.values();
      int _length = _values.length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for (final Integer i : _doubleDotLessThan) {
        PDFunction _get = PDFunction.get((i).intValue());
        String _name = _get.getName();
        String _name_1 = fd.getName();
        boolean _equals = _name.equals(_name_1);
        if (_equals) {
          String _name_2 = fd.getName();
          String _plus = ("The method \'" + _name_2);
          String _plus_1 = (_plus + "\' is a predefined Lista method.");
          this.error(_plus_1, 
            ListaCompilerPackage.Literals.LISTA__DEFINITIONS, 
            ListaCompilerValidator.INVALID_FUNCTION_DECLARATION);
        }
      }
    }
  }
  
  @Check
  public void checkFunctionDefinitionsNames(final Lista lista) {
    final EList<FunctionDefinition> definitions = lista.getDefinitions();
    int _length = ((Object[])Conversions.unwrapArray(definitions, Object.class)).length;
    boolean _greaterThan = (_length > 1);
    if (_greaterThan) {
      String curName = "";
      int _length_1 = ((Object[])Conversions.unwrapArray(definitions, Object.class)).length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _length_1, true);
      for (final Integer cur : _doubleDotLessThan) {
        {
          FunctionDefinition _get = definitions.get((cur).intValue());
          String _name = _get.getName();
          curName = _name;
          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, (cur).intValue(), true);
          for (final Integer i : _doubleDotLessThan_1) {
            FunctionDefinition _get_1 = definitions.get((i).intValue());
            String _name_1 = _get_1.getName();
            boolean _equals = _name_1.equals(curName);
            if (_equals) {
              this.error((("The method named \'" + curName) + "\' can only be declared once."), 
                ListaCompilerPackage.Literals.LISTA__DEFINITIONS, 
                ListaCompilerValidator.INVALID_FUNCTION_DECLARATION);
            }
          }
        }
      }
    }
  }
  
  @Check
  public void checkFunctionDefinitionsParameters(final FunctionDefinition fd) {
    EList<String> _params = fd.getParams();
    int _length = ((Object[])Conversions.unwrapArray(_params, Object.class)).length;
    boolean _greaterThan = (_length > 1);
    if (_greaterThan) {
      String curName = "";
      EList<String> _params_1 = fd.getParams();
      int _length_1 = ((Object[])Conversions.unwrapArray(_params_1, Object.class)).length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _length_1, true);
      for (final Integer cur : _doubleDotLessThan) {
        {
          EList<String> _params_2 = fd.getParams();
          String _get = _params_2.get((cur).intValue());
          curName = _get;
          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, (cur).intValue(), true);
          for (final Integer i : _doubleDotLessThan_1) {
            EList<String> _params_3 = fd.getParams();
            String _get_1 = _params_3.get((i).intValue());
            boolean _equals = _get_1.equals(curName);
            if (_equals) {
              this.error((("The parameter \'" + curName) + "\' can only be declared once."), 
                ListaCompilerPackage.Literals.FUNCTION_DEFINITION__PARAMS, 
                ListaCompilerValidator.INVALID_FUNCTION_DECLARATION);
            }
          }
        }
      }
    }
  }
  
  @Check
  public void checkUserDefParametersNumber(final UserDefFunctionCall fcall) {
    FunctionDefinition _function = fcall.getFunction();
    EList<String> _params = _function.getParams();
    final int params = ((Object[])Conversions.unwrapArray(_params, Object.class)).length;
    EList<Expression> _args = fcall.getArgs();
    int _length = ((Object[])Conversions.unwrapArray(_args, Object.class)).length;
    boolean _notEquals = (_length != params);
    if (_notEquals) {
      this.error(("Wrong number of parameters, should be " + Integer.valueOf(params)), 
        ListaCompilerPackage.Literals.FUNCTION_CALL__ARGS, 
        ListaCompilerValidator.WRONG_PARAMETERS_NUMBER);
    }
  }
  
  @Check
  public void checkPreDefParametersNumber(final PreDefFunctionCall fcall) {
    final PDFunction function = fcall.getFunction();
    int params = 0;
    if (function != null) {
      switch (function) {
        case SHOW:
        case LENGTH:
        case CAR:
        case CDR:
        case IS_EMPTY:
          params = 1;
          break;
        case CONS:
          params = 2;
          break;
        default:
          params = 0;
          break;
      }
    } else {
      params = 0;
    }
    EList<Expression> _args = fcall.getArgs();
    int _length = ((Object[])Conversions.unwrapArray(_args, Object.class)).length;
    boolean _notEquals = (_length != params);
    if (_notEquals) {
      this.error(("Wrong number of parameters, should be " + Integer.valueOf(1)), 
        ListaCompilerPackage.Literals.FUNCTION_CALL__ARGS, 
        ListaCompilerValidator.WRONG_PARAMETERS_NUMBER);
    }
  }
  
  @Check
  public Object checkFunctionDefinitionType(final FunctionDefinition fd) {
    Object _xblockexpression = null;
    {
      HashMap<String, ListaCompilerValidator.DataType> types = new HashMap<String, ListaCompilerValidator.DataType>();
      Expression _return = fd.getReturn();
      this.checkExpressionType(_return, types);
      String _name = fd.getName();
      _xblockexpression = this.functionDefs.put(_name, types);
    }
    return _xblockexpression;
  }
  
  public ListaCompilerValidator.DataType checkExpressionType(final Expression exp, final HashMap<String, ListaCompilerValidator.DataType> types) {
    ListaCompilerValidator.DataType _xtrycatchfinallyexpression = null;
    try {
      _xtrycatchfinallyexpression = this.getDataType(exp, types);
    } catch (final Throwable _t) {
      if (_t instanceof MismatchedTypeException) {
        final MismatchedTypeException ex = (MismatchedTypeException)_t;
        String _message = ex.getMessage();
        this.error(_message, 
          ListaCompilerPackage.Literals.EXPRESSION__EXP, 
          ListaCompilerValidator.WRONG_EXPRESSION_TYPE);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  @Check
  public void checkIfControlFlowType(final IfControlFlow ifCF, final HashMap<String, ListaCompilerValidator.DataType> types) {
    try {
      Expression _cond = ifCF.getCond();
      final ListaCompilerValidator.DataType cond = this.getDataType(_cond, types);
      Expression _iftrue = ifCF.getIftrue();
      final ListaCompilerValidator.DataType iftrue = this.getDataType(_iftrue, types);
      Expression _iffalse = ifCF.getIffalse();
      final ListaCompilerValidator.DataType iffalse = this.getDataType(_iffalse, types);
      boolean _equals = cond.equals(ListaCompilerValidator.DataType.BOOL);
      boolean _not = (!_equals);
      if (_not) {
        this.error("Condition should be type BOOL.", 
          ListaCompilerPackage.Literals.IF_CONTROL_FLOW__COND, 
          ListaCompilerValidator.WRONG_EXPRESSION_TYPE);
      }
      boolean _equals_1 = iftrue.equals(iffalse);
      boolean _not_1 = (!_equals_1);
      if (_not_1) {
        this.error("Condition should be type BOOL.", 
          ListaCompilerPackage.Literals.IF_CONTROL_FLOW__IFTRUE, 
          ListaCompilerValidator.WRONG_EXPRESSION_TYPE);
      }
    } catch (final Throwable _t) {
      if (_t instanceof MismatchedTypeException) {
        final MismatchedTypeException ex = (MismatchedTypeException)_t;
        String _message = ex.getMessage();
        this.error(_message, 
          ListaCompilerPackage.Literals.EXPRESSION__EXP, 
          ListaCompilerValidator.WRONG_EXPRESSION_TYPE);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public ListaCompilerValidator.DataType getDataType(final Expression exp, final HashMap<String, ListaCompilerValidator.DataType> types) {
    FirstLevelExp _exp = exp.getExp();
    return this.getDataType(_exp, types);
  }
  
  public ListaCompilerValidator.DataType getDataType(final FirstLevelExp exp, final HashMap<String, ListaCompilerValidator.DataType> types) {
    try {
      ListaCompilerValidator.DataType _xblockexpression = null;
      {
        EList<EObject> _args = exp.getArgs();
        EObject _get = _args.get(0);
        final ListaCompilerValidator.DataType first = this.getDataType(((SecondLevelExp) _get), types);
        final FirstLevelOp op = exp.getOp();
        ListaCompilerValidator.DataType _xifexpression = null;
        EList<EObject> _args_1 = exp.getArgs();
        int _length = ((Object[])Conversions.unwrapArray(_args_1, Object.class)).length;
        boolean _greaterThan = (_length > 1);
        if (_greaterThan) {
          ListaCompilerValidator.DataType _xblockexpression_1 = null;
          {
            ListaCompilerValidator.DataType expected = ListaCompilerValidator.DataType.GLOBAL;
            if (op != null) {
              switch (op) {
                case AND:
                case OR:
                  expected = ListaCompilerValidator.DataType.BOOL;
                  break;
                default:
                  expected = ListaCompilerValidator.DataType.GLOBAL;
                  break;
              }
            } else {
              expected = ListaCompilerValidator.DataType.GLOBAL;
            }
            EList<EObject> _args_2 = exp.getArgs();
            EObject _get_1 = _args_2.get(1);
            final Object second = this.getDataType(((FirstLevelExp) _get_1), types);
            ListaCompilerValidator.DataType _xifexpression_1 = null;
            boolean _equals = first.equals(ListaCompilerValidator.DataType.VAR);
            if (_equals) {
              EList<EObject> _args_3 = exp.getArgs();
              EObject _get_2 = _args_3.get(0);
              final MyVariable var1 = this.getVariable(((SecondLevelExp) _get_2));
              boolean _equals_1 = second.equals(ListaCompilerValidator.DataType.VAR);
              if (_equals_1) {
                EList<EObject> _args_4 = exp.getArgs();
                EObject _get_3 = _args_4.get(1);
                final MyVariable var2 = this.getVariable(((FirstLevelExp) _get_3));
                String _var = var2.getVar();
                types.put(_var, expected);
              }
              String _var_1 = var1.getVar();
              types.put(_var_1, expected);
              boolean _equals_2 = second.equals(expected);
              if (_equals_2) {
                return expected;
              } else {
                String _name = op.getName();
                String _plus = ("Mismatched data types for operator " + _name);
                String _plus_1 = (_plus + ", arguments should be ");
                String _string = expected.toString();
                String _plus_2 = (_plus_1 + _string);
                String _plus_3 = (_plus_2 + ".");
                throw new MismatchedTypeException(_plus_3);
              }
            } else {
              ListaCompilerValidator.DataType _xifexpression_2 = null;
              boolean _equals_3 = second.equals(ListaCompilerValidator.DataType.VAR);
              if (_equals_3) {
                ListaCompilerValidator.DataType _xblockexpression_2 = null;
                {
                  EList<EObject> _args_5 = exp.getArgs();
                  EObject _get_4 = _args_5.get(1);
                  final MyVariable var2_1 = this.getVariable(((FirstLevelExp) _get_4));
                  String _var_2 = var2_1.getVar();
                  _xblockexpression_2 = types.put(_var_2, expected);
                }
                _xifexpression_2 = _xblockexpression_2;
              } else {
                boolean _and = false;
                boolean _equals_4 = first.equals(expected);
                if (!_equals_4) {
                  _and = false;
                } else {
                  boolean _equals_5 = second.equals(expected);
                  _and = _equals_5;
                }
                if (_and) {
                  return expected;
                } else {
                  String _name_1 = op.getName();
                  String _plus_4 = ("Mismatched data types for operator " + _name_1);
                  String _plus_5 = (_plus_4 + ", arguments should be ");
                  String _string_1 = expected.toString();
                  String _plus_6 = (_plus_5 + _string_1);
                  String _plus_7 = (_plus_6 + ".");
                  throw new MismatchedTypeException(_plus_7);
                }
              }
              _xifexpression_1 = _xifexpression_2;
            }
            _xblockexpression_1 = _xifexpression_1;
          }
          _xifexpression = _xblockexpression_1;
        } else {
          return first;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public ListaCompilerValidator.DataType getDataType(final SecondLevelExp exp, final HashMap<String, ListaCompilerValidator.DataType> types) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from ThirdLevelExp to PreDefFunctionCall"
      + "\nType mismatch: cannot convert from SecondLevelExp to PreDefFunctionCall");
  }
  
  public ListaCompilerValidator.DataType getDataType(final ThirdLevelExp exp, final HashMap<String, ListaCompilerValidator.DataType> types) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from FourthLevelExp to PreDefFunctionCall"
      + "\nType mismatch: cannot convert from ThirdLevelExp to PreDefFunctionCall");
  }
  
  public ListaCompilerValidator.DataType getDataType(final FourthLevelExp exp, final HashMap<String, ListaCompilerValidator.DataType> types) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from FourthLevelExp to PreDefFunctionCall");
  }
  
  public ListaCompilerValidator.DataType getDataType(final Term term) {
    if ((term instanceof MyInteger)) {
      return ListaCompilerValidator.DataType.INT;
    } else {
      if ((term instanceof MyString)) {
        return ListaCompilerValidator.DataType.STRING;
      } else {
        if ((term instanceof MyBool)) {
          return ListaCompilerValidator.DataType.BOOL;
        } else {
          if ((term instanceof List)) {
            return ListaCompilerValidator.DataType.LIST;
          } else {
            if ((term instanceof MyVariable)) {
              return ListaCompilerValidator.DataType.VAR;
            } else {
              if ((term instanceof FunctionCall)) {
                return this.getDataType(((FunctionCall) term));
              } else {
                if ((term instanceof IfControlFlow)) {
                  return this.getDataType(((IfControlFlow) term));
                }
              }
            }
          }
        }
      }
    }
    return null;
  }
  
  public ListaCompilerValidator.DataType getDataType(final FunctionCall fcall) {
    if ((fcall instanceof PreDefFunctionCall)) {
      return this.getDataType(((PreDefFunctionCall) fcall));
    } else {
      if ((fcall instanceof UserDefFunctionCall)) {
        return this.getDataType(((UserDefFunctionCall) fcall));
      }
    }
    return null;
  }
  
  public ListaCompilerValidator.DataType getDataType(final PreDefFunctionCall fcall) {
    PDFunction _function = fcall.getFunction();
    if (_function != null) {
      switch (_function) {
        case SHOW:
          return ListaCompilerValidator.DataType.STRING;
        case LENGTH:
        case CAR:
          return ListaCompilerValidator.DataType.INT;
        case CDR:
        case CONS:
          return ListaCompilerValidator.DataType.LIST;
        case IS_EMPTY:
          return ListaCompilerValidator.DataType.BOOL;
        default:
          return ListaCompilerValidator.DataType.STRING;
      }
    } else {
      return ListaCompilerValidator.DataType.STRING;
    }
  }
  
  public ListaCompilerValidator.DataType getDataType(final UserDefFunctionCall fcall) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Expression to PreDefFunctionCall");
  }
  
  public ListaCompilerValidator.DataType getDataType(final IfControlFlow ifCF) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Expression to PreDefFunctionCall");
  }
  
  public ListaCompilerValidator.DataType compareEquals(final SecondLevelExp exp) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from ThirdLevelExp to PreDefFunctionCall"
      + "\nType mismatch: cannot convert from SecondLevelExp to PreDefFunctionCall");
  }
  
  /**
   * def inferVariablesTypes(FourthLevelExp exp) {
   * var vars = new HashMap();
   * val first = exp.args.get(0) as Term;
   * val firstType = first.getDataType;
   * if (exp.args.length > 1) {
   * val second = exp.args.get(1) as FourthLevelExp;
   * val secondType = second.getDataType;
   * if (firstType.equals(DataType.VAR)) {
   * vars.put((first as MyVariable).^var, DataType.INT);
   * }
   * if (secondType.equals(DataType.VAR)) {
   * vars.put((second as MyVariable).^var, DataType.INT);
   * }
   * } else {
   * if (firstType.equals(DataType.VAR)) {
   * vars.put((first as MyVariable).^var, DataType.VAR);
   * }
   * }
   * return vars;
   * }
   */
  public MyVariable getVariable(final FirstLevelExp exp) {
    EList<EObject> _args = exp.getArgs();
    EObject _get = _args.get(0);
    EList<EObject> _args_1 = ((SecondLevelExp) _get).getArgs();
    EObject _get_1 = _args_1.get(0);
    EList<EObject> _args_2 = ((ThirdLevelExp) _get_1).getArgs();
    EObject _get_2 = _args_2.get(0);
    EList<EObject> _args_3 = ((FourthLevelExp) _get_2).getArgs();
    EObject _get_3 = _args_3.get(0);
    return ((MyVariable) _get_3);
  }
  
  public MyVariable getVariable(final SecondLevelExp exp) {
    EList<EObject> _args = exp.getArgs();
    EObject _get = _args.get(0);
    EList<EObject> _args_1 = ((ThirdLevelExp) _get).getArgs();
    EObject _get_1 = _args_1.get(0);
    EList<EObject> _args_2 = ((FourthLevelExp) _get_1).getArgs();
    EObject _get_2 = _args_2.get(0);
    return ((MyVariable) _get_2);
  }
  
  public MyVariable getVariable(final ThirdLevelExp exp) {
    EList<EObject> _args = exp.getArgs();
    EObject _get = _args.get(0);
    EList<EObject> _args_1 = ((FourthLevelExp) _get).getArgs();
    EObject _get_1 = _args_1.get(0);
    return ((MyVariable) _get_1);
  }
  
  public MyVariable getVariable(final FourthLevelExp exp) {
    EList<EObject> _args = exp.getArgs();
    EObject _get = _args.get(0);
    return ((MyVariable) _get);
  }
}
