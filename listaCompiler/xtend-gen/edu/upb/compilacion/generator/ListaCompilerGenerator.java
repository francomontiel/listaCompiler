/**
 * generated by Xtext
 */
package edu.upb.compilacion.generator;

import edu.upb.compilacion.listaCompiler.Evaluation;
import edu.upb.compilacion.listaCompiler.Expression;
import edu.upb.compilacion.listaCompiler.FirstLevelExp;
import edu.upb.compilacion.listaCompiler.FourthLevelExp;
import edu.upb.compilacion.listaCompiler.FunctionDefinition;
import edu.upb.compilacion.listaCompiler.Lista;
import edu.upb.compilacion.listaCompiler.SecondLevelExp;
import edu.upb.compilacion.listaCompiler.ThirdLevelExp;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ListaCompilerGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    final Lista lista = ((Lista) _get);
    CharSequence _generate = this.generate(lista);
    fsa.generateFile("seks.java", _generate);
  }
  
  public CharSequence generate(final Lista lista) {
    StringConcatenation _builder = new StringConcatenation();
    EList<Evaluation> _evaluations = lista.getEvaluations();
    CharSequence _generateMain = this.generateMain(_evaluations);
    _builder.append(_generateMain, "");
    {
      EList<FunctionDefinition> _definitions = lista.getDefinitions();
      for(final FunctionDefinition fd : _definitions) {
        CharSequence _generate = this.generate(fd);
        _builder.append(_generate, "");
      }
    }
    return _builder;
  }
  
  public CharSequence generateMain(final EList<Evaluation> evaluations) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    {
      for(final Evaluation eval : evaluations) {
        CharSequence _generate = this.generate(eval);
        _builder.append(_generate, "\t\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence generate(final Evaluation ev) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _return = ev.getReturn();
    CharSequence _generate = this.generate(_return);
    _builder.append(_generate, "");
    return _builder;
  }
  
  public CharSequence generate(final Expression exp) {
    StringConcatenation _builder = new StringConcatenation();
    FirstLevelExp _exp = exp.getExp();
    CharSequence _generate = this.generate(_exp);
    _builder.append(_generate, "");
    return _builder;
  }
  
  public CharSequence generate(final FirstLevelExp exp) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence generate(final SecondLevelExp exp) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence generate(final ThirdLevelExp exp) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence generate(final FourthLevelExp exp) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence generate(final FunctionDefinition funcd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public TYPE! ");
    String _name = funcd.getName();
    _builder.append(_name, "");
    _builder.append("(");
    {
      EList<String> _params = funcd.getParams();
      boolean _hasElements = false;
      for(final String fp : _params) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.append(fp, "");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Expression _return = funcd.getReturn();
    FirstLevelExp _exp = _return.getExp();
    CharSequence _generate = this.generate(_exp);
    _builder.append(_generate, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
}
