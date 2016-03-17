/**
 * generated by Xtext
 */
package edu.upb.compilacion.validation;

import edu.upb.compilacion.HugeException;
import edu.upb.compilacion.MismatchedTypeException;
import edu.upb.compilacion.TypeInferrer;
import edu.upb.compilacion.listaCompiler.Evaluation;
import edu.upb.compilacion.listaCompiler.Expression;
import edu.upb.compilacion.listaCompiler.FunctionDefinition;
import edu.upb.compilacion.listaCompiler.Lista;
import edu.upb.compilacion.listaCompiler.ListaCompilerPackage;
import edu.upb.compilacion.listaCompiler.PDFunction;
import edu.upb.compilacion.listaCompiler.PreDefFunctionCall;
import edu.upb.compilacion.listaCompiler.UserDefFunctionCall;
import edu.upb.compilacion.validation.AbstractListaCompilerValidator;
import java.util.HashMap;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
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
  
  private final static String WRONG_PARAMETERS_NUMBER = "wrongParametersNumber";
  
  private final static String WRONG_EXPRESSION_TYPE = "wrongExpressionType";
  
  private final static String INVALID_FUNCTION_DECLARATION = "invalidFunctionDeclaration";
  
  private final static String UNUSED_VARIABLE = "unusedVariable";
  
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
    String curName = "";
    int _length = ((Object[])Conversions.unwrapArray(definitions, Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _length, true);
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
  
  @Check
  public void checkFunctionDefinitionsParameters(final FunctionDefinition fd) {
    String curName = "";
    EList<String> _params = fd.getParams();
    int _length = ((Object[])Conversions.unwrapArray(_params, Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _length, true);
    for (final Integer cur : _doubleDotLessThan) {
      {
        EList<String> _params_1 = fd.getParams();
        String _get = _params_1.get((cur).intValue());
        curName = _get;
        ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, (cur).intValue(), true);
        for (final Integer i : _doubleDotLessThan_1) {
          EList<String> _params_2 = fd.getParams();
          String _get_1 = _params_2.get((i).intValue());
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
          String _literal = function.getLiteral();
          String _plus = ("Undeclared function " + _literal);
          this.error(_plus, 
            ListaCompilerPackage.Literals.FUNCTION_CALL__ARGS, 
            ListaCompilerValidator.INVALID_FUNCTION_DECLARATION);
          break;
      }
    } else {
      String _literal = function.getLiteral();
      String _plus = ("Undeclared function " + _literal);
      this.error(_plus, 
        ListaCompilerPackage.Literals.FUNCTION_CALL__ARGS, 
        ListaCompilerValidator.INVALID_FUNCTION_DECLARATION);
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
  public String checkFunctionDefinitionType(final FunctionDefinition fd) {
    String _xblockexpression = null;
    {
      TypeInferrer.inferDataType(fd);
      TypeInferrer.inferDataType(fd);
      this.checkFunctionDefinitionParams(fd);
      try {
        Expression _return = fd.getReturn();
        TypeInferrer.checkDataType(_return);
      } catch (final Throwable _t) {
        if (_t instanceof MismatchedTypeException) {
          final MismatchedTypeException ex = (MismatchedTypeException)_t;
          String _message = ex.getMessage();
          this.error(_message, 
            ListaCompilerPackage.Literals.FUNCTION_DEFINITION__RETURN, 
            ListaCompilerValidator.WRONG_EXPRESSION_TYPE);
        } else if (_t instanceof HugeException) {
          final HugeException ex_1 = (HugeException)_t;
          String _message_1 = ex_1.getMessage();
          this.error(_message_1, 
            ListaCompilerPackage.Literals.FUNCTION_DEFINITION__RETURN, 
            ListaCompilerValidator.WRONG_EXPRESSION_TYPE);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = TypeInferrer.resetFunction();
    }
    return _xblockexpression;
  }
  
  public void checkFunctionDefinitionParams(final FunctionDefinition fd) {
    EList<String> _params = fd.getParams();
    for (final String param : _params) {
      HashMap<String, HashMap<String, ListaCompilerValidator.DataType>> _functionParams = TypeInferrer.getFunctionParams();
      String _name = fd.getName();
      HashMap<String, ListaCompilerValidator.DataType> _get = _functionParams.get(_name);
      boolean _containsKey = _get.containsKey(param);
      boolean _not = (!_containsKey);
      if (_not) {
        this.warning((("Variable " + param) + " is not used."), 
          ListaCompilerPackage.Literals.FUNCTION_DEFINITION__PARAMS, 
          ListaCompilerValidator.UNUSED_VARIABLE);
      }
    }
    HashMap<String, HashMap<String, ListaCompilerValidator.DataType>> _functionParams_1 = TypeInferrer.getFunctionParams();
    String _name_1 = fd.getName();
    HashMap<String, ListaCompilerValidator.DataType> _get_1 = _functionParams_1.get(_name_1);
    Set<String> _keySet = _get_1.keySet();
    for (final String param_1 : _keySet) {
      EList<String> _params_1 = fd.getParams();
      boolean _contains = _params_1.contains(param_1);
      boolean _not_1 = (!_contains);
      if (_not_1) {
        this.error((("Variable " + param_1) + " is not declared, should be added to the function\'s parameters."), 
          ListaCompilerPackage.Literals.FUNCTION_DEFINITION__PARAMS, 
          ListaCompilerValidator.INVALID_FUNCTION_DECLARATION);
      }
    }
  }
  
  @Check
  public ListaCompilerValidator.DataType checkFunctionEvaluationType(final Evaluation eval) {
    ListaCompilerValidator.DataType _xtrycatchfinallyexpression = null;
    try {
      Expression _return = eval.getReturn();
      _xtrycatchfinallyexpression = TypeInferrer.checkDataType(_return);
    } catch (final Throwable _t) {
      if (_t instanceof MismatchedTypeException) {
        final MismatchedTypeException ex = (MismatchedTypeException)_t;
        String _message = ex.getMessage();
        this.error(_message, 
          ListaCompilerPackage.Literals.EVALUATION__RETURN, 
          ListaCompilerValidator.WRONG_EXPRESSION_TYPE);
      } else if (_t instanceof HugeException) {
        final HugeException ex_1 = (HugeException)_t;
        String _message_1 = ex_1.getMessage();
        this.error(_message_1, 
          ListaCompilerPackage.Literals.EVALUATION__RETURN, 
          ListaCompilerValidator.WRONG_EXPRESSION_TYPE);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
}
