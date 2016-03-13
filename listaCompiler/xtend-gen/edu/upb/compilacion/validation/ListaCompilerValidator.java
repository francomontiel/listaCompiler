/**
 * generated by Xtext
 */
package edu.upb.compilacion.validation;

import edu.upb.compilacion.MismatchedTypeException;
import edu.upb.compilacion.listaCompiler.Expression;
import edu.upb.compilacion.listaCompiler.FirstLevelExp;
import edu.upb.compilacion.listaCompiler.FirstLevelOp;
import edu.upb.compilacion.listaCompiler.FourthLevelExp;
import edu.upb.compilacion.listaCompiler.FourthLevelOp;
import edu.upb.compilacion.listaCompiler.FunctionCall;
import edu.upb.compilacion.listaCompiler.FunctionDefinition;
import edu.upb.compilacion.listaCompiler.IfControlFlow;
import edu.upb.compilacion.listaCompiler.List;
import edu.upb.compilacion.listaCompiler.ListaCompilerPackage;
import edu.upb.compilacion.listaCompiler.MyBool;
import edu.upb.compilacion.listaCompiler.MyInteger;
import edu.upb.compilacion.listaCompiler.MyString;
import edu.upb.compilacion.listaCompiler.MyVariable;
import edu.upb.compilacion.listaCompiler.PDFunction;
import edu.upb.compilacion.listaCompiler.PreDefFunctionCall;
import edu.upb.compilacion.listaCompiler.SecondLevelExp;
import edu.upb.compilacion.listaCompiler.SecondLevelOp;
import edu.upb.compilacion.listaCompiler.Term;
import edu.upb.compilacion.listaCompiler.ThirdLevelExp;
import edu.upb.compilacion.listaCompiler.ThirdLevelOp;
import edu.upb.compilacion.listaCompiler.UserDefFunctionCall;
import edu.upb.compilacion.validation.AbstractListaCompilerValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

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
        "wrongParametersNumber");
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
        "wrongParametersNumber");
    }
  }
  
  @Check
  public Object checkExpressionType(final Expression exp) {
    Object _xtrycatchfinallyexpression = null;
    try {
      _xtrycatchfinallyexpression = this.getDataType(exp);
    } catch (final Throwable _t) {
      if (_t instanceof MismatchedTypeException) {
        final MismatchedTypeException ex = (MismatchedTypeException)_t;
        String _message = ex.getMessage();
        this.error(_message, 
          ListaCompilerPackage.Literals.EXPRESSION__EXP, 
          "wrongExpressionType");
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  public Object getDataType(final Expression exp) {
    FirstLevelExp _exp = exp.getExp();
    return this.getDataType(_exp);
  }
  
  public Object getDataType(final FirstLevelExp exp) {
    try {
      EList<EObject> _args = exp.getArgs();
      EObject _get = _args.get(0);
      final Object first = this.getDataType(((SecondLevelExp) _get));
      final FirstLevelOp op = exp.getOp();
      EList<EObject> _args_1 = exp.getArgs();
      int _length = ((Object[])Conversions.unwrapArray(_args_1, Object.class)).length;
      boolean _greaterThan = (_length > 1);
      if (_greaterThan) {
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
        boolean _and = false;
        boolean _equals = first.equals(expected);
        if (!_equals) {
          _and = false;
        } else {
          EList<EObject> _args_2 = exp.getArgs();
          EObject _get_1 = _args_2.get(1);
          Object _dataType = this.getDataType(((FirstLevelExp) _get_1));
          boolean _equals_1 = _dataType.equals(expected);
          _and = _equals_1;
        }
        if (_and) {
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
        return first;
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Object getDataType(final SecondLevelExp exp) {
    try {
      EList<EObject> _args = exp.getArgs();
      EObject _get = _args.get(0);
      final Object first = this.getDataType(((ThirdLevelExp) _get));
      final SecondLevelOp op = exp.getOp();
      EList<EObject> _args_1 = exp.getArgs();
      int _length = ((Object[])Conversions.unwrapArray(_args_1, Object.class)).length;
      boolean _greaterThan = (_length > 1);
      if (_greaterThan) {
        ListaCompilerValidator.DataType expected = ListaCompilerValidator.DataType.GLOBAL;
        if (op != null) {
          switch (op) {
            case GT:
            case LT:
              expected = ListaCompilerValidator.DataType.INT;
              break;
            case EQ:
              return this.compareEquals(exp);
            default:
              expected = ListaCompilerValidator.DataType.GLOBAL;
              break;
          }
        } else {
          expected = ListaCompilerValidator.DataType.GLOBAL;
        }
        boolean _and = false;
        boolean _equals = first.equals(expected);
        if (!_equals) {
          _and = false;
        } else {
          EList<EObject> _args_2 = exp.getArgs();
          EObject _get_1 = _args_2.get(1);
          Object _dataType = this.getDataType(((SecondLevelExp) _get_1));
          boolean _equals_1 = _dataType.equals(expected);
          _and = _equals_1;
        }
        if (_and) {
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
        return first;
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Object getDataType(final ThirdLevelExp exp) {
    try {
      EList<EObject> _args = exp.getArgs();
      EObject _get = _args.get(0);
      final Object first = this.getDataType(((FourthLevelExp) _get));
      final ThirdLevelOp op = exp.getOp();
      EList<EObject> _args_1 = exp.getArgs();
      int _length = ((Object[])Conversions.unwrapArray(_args_1, Object.class)).length;
      boolean _greaterThan = (_length > 1);
      if (_greaterThan) {
        ListaCompilerValidator.DataType expected = ListaCompilerValidator.DataType.GLOBAL;
        if (op != null) {
          switch (op) {
            case PLUS:
            case MINUS:
              expected = ListaCompilerValidator.DataType.INT;
              break;
            case CONCAT:
              expected = ListaCompilerValidator.DataType.STRING;
              break;
            default:
              expected = ListaCompilerValidator.DataType.GLOBAL;
              break;
          }
        } else {
          expected = ListaCompilerValidator.DataType.GLOBAL;
        }
        boolean _and = false;
        boolean _equals = first.equals(expected);
        if (!_equals) {
          _and = false;
        } else {
          EList<EObject> _args_2 = exp.getArgs();
          EObject _get_1 = _args_2.get(1);
          Object _dataType = this.getDataType(((ThirdLevelExp) _get_1));
          boolean _equals_1 = _dataType.equals(expected);
          _and = _equals_1;
        }
        if (_and) {
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
        return first;
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Object getDataType(final FourthLevelExp exp) {
    try {
      EList<EObject> _args = exp.getArgs();
      EObject _get = _args.get(0);
      final Object first = this.getDataType(((Term) _get));
      EList<EObject> _args_1 = exp.getArgs();
      int _length = ((Object[])Conversions.unwrapArray(_args_1, Object.class)).length;
      boolean _greaterThan = (_length > 1);
      if (_greaterThan) {
        boolean _and = false;
        boolean _equals = first.equals(ListaCompilerValidator.DataType.INT);
        if (!_equals) {
          _and = false;
        } else {
          EList<EObject> _args_2 = exp.getArgs();
          EObject _get_1 = _args_2.get(1);
          Object _dataType = this.getDataType(((FourthLevelExp) _get_1));
          boolean _equals_1 = _dataType.equals(ListaCompilerValidator.DataType.INT);
          _and = _equals_1;
        }
        if (_and) {
          return ListaCompilerValidator.DataType.INT;
        } else {
          FourthLevelOp _op = exp.getOp();
          String _name = _op.getName();
          String _plus = ("Mismatched data types for operator " + _name);
          String _plus_1 = (_plus + ", arguments should be INT.");
          throw new MismatchedTypeException(_plus_1);
        }
      } else {
        return first;
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Object getDataType(final Term term) {
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
  
  public Object getDataType(final FunctionCall fcall) {
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
  
  public Object getDataType(final UserDefFunctionCall fcall) {
    FunctionDefinition _function = fcall.getFunction();
    Expression _return = _function.getReturn();
    return this.getDataType(_return);
  }
  
  public Object getDataType(final IfControlFlow ifCF) {
    Expression _iftrue = ifCF.getIftrue();
    return this.getDataType(_iftrue);
  }
  
  public Object compareEquals(final SecondLevelExp exp) {
    return null;
  }
}
