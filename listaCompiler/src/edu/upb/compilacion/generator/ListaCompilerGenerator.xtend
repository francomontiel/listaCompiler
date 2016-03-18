/*
 * generated by Xtext
 */
package edu.upb.compilacion.generator

import edu.upb.compilacion.TypeInferrer
import edu.upb.compilacion.listaCompiler.BracketExpression
import edu.upb.compilacion.listaCompiler.Evaluation
import edu.upb.compilacion.listaCompiler.Expression
import edu.upb.compilacion.listaCompiler.FirstLevelExp
import edu.upb.compilacion.listaCompiler.FourthLevelExp
import edu.upb.compilacion.listaCompiler.FunctionCall
import edu.upb.compilacion.listaCompiler.FunctionDefinition
import edu.upb.compilacion.listaCompiler.IfControlFlow
import edu.upb.compilacion.listaCompiler.List
import edu.upb.compilacion.listaCompiler.ListElem
import edu.upb.compilacion.listaCompiler.Lista
import edu.upb.compilacion.listaCompiler.MyBool
import edu.upb.compilacion.listaCompiler.MyInteger
import edu.upb.compilacion.listaCompiler.MyString
import edu.upb.compilacion.listaCompiler.MyVariable
import edu.upb.compilacion.listaCompiler.NegBool
import edu.upb.compilacion.listaCompiler.NegInteger
import edu.upb.compilacion.listaCompiler.PosBool
import edu.upb.compilacion.listaCompiler.PosInteger
import edu.upb.compilacion.listaCompiler.PreDefFunctionCall
import edu.upb.compilacion.listaCompiler.SecondLevelExp
import edu.upb.compilacion.listaCompiler.Term
import edu.upb.compilacion.listaCompiler.ThirdLevelExp
import edu.upb.compilacion.listaCompiler.UserDefFunctionCall
import edu.upb.compilacion.validation.ListaCompilerValidator.DataType
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ListaCompilerGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
		val lista = (resource.contents.get(0) as Lista)
		fsa.generateFile('seks.java', lista.generate)
	}
	
	def generate(Lista lista) '''«generateMain(lista.evaluations)»«'\n\n'»«FOR fd : lista.definitions SEPARATOR '\n\n'»«fd.generate»«ENDFOR»«'\n\n'»«generatePreDefFunctions»'''
	
	def generateMain(EList<Evaluation> evaluations) '''public static void main(String[] args) {
		«FOR eval : evaluations»«eval.generate»;«ENDFOR»
}'''
	
	def generate(Evaluation ev) '''«ev.^return.generate»'''
	
	def generate(Expression exp) '''«exp.exp.generate»'''
	
	def generate(FirstLevelExp exp) {
		val first = exp.args.get(0) as SecondLevelExp;
		var res = first.generate; 
		if(exp.args.length > 1) {
			res = res + exp.op.literal + (exp.args.get(1) as FirstLevelExp).generate;
		}
		return res;
	}
	
	def generate(SecondLevelExp exp) {
		val first = exp.args.get(0) as ThirdLevelExp;
		var res = first.generate; 
		if(exp.args.length > 1) {
			res = res + exp.op.literal + (exp.args.get(1) as SecondLevelExp).generate;
		}
		return res;
	}
	def generate(ThirdLevelExp exp) {
		val first = exp.args.get(0) as FourthLevelExp;
		var res = first.generate; 
		if(exp.args.length > 1) {
			res = res + exp.op.literal + (exp.args.get(1) as ThirdLevelExp).generate;
		}
		return res;
				
	}
	def generate(FourthLevelExp exp) {
		val first = exp.args.get(0) as Term;
		var res = first.generate; 
		if(exp.args.length > 1) {
			res = res + exp.op.literal + (exp.args.get(1) as FourthLevelExp).generate;
		}
		return res;		
	}
	
	def generate(Term term) {
		if (term instanceof MyInteger) {
			return (term as MyInteger).generate;
		} else if (term instanceof MyString) {
			return (term as MyString).^val;
		} else if (term instanceof MyBool) {
			return (term as MyBool).generate;
		} else if (term instanceof List) {
			return (term as List).generate;
		} else if (term instanceof MyVariable) {
			return (term as MyVariable).^var;
		} else if (term instanceof FunctionCall) {
			return (term as FunctionCall).generate;
		} else if (term instanceof IfControlFlow) {
			return (term as IfControlFlow).generate;
		} else if (term instanceof BracketExpression) {
			return (term as BracketExpression).exp.generate;
		}
	}
	
	def generate (MyInteger mi) {
		if (mi instanceof PosInteger) {
			return (mi as PosInteger).^val.toString;
		} else if (mi instanceof NegInteger) {
			val exp = (mi as NegInteger).^val;
			if (exp instanceof PosInteger) {
				return (exp as PosInteger).^val.toString;
			} else if (exp instanceof BracketExpression) {
				return (exp as BracketExpression).generate;
			}
		}
	}
	
	def generate (MyBool mb) {
		if (mb instanceof PosBool) {
			return (mb as PosBool).^val.toString;
		} else if (mb instanceof NegBool) {
			val exp = (mb as NegBool).^val;
			if (exp instanceof PosBool) {
				return (exp as PosBool).^val.toString;
			} else if (exp instanceof BracketExpression) {
				return (exp as BracketExpression).generate;
			}
		}
	}
	
	def generate (List li) '''[«FOR elm : li.elems SEPARATOR ','»«elm.generate»«ENDFOR»]'''
	
	def generate (ListElem le) {
		if (le instanceof MyInteger) {
			return (le as MyInteger).generate;
		} else if (le instanceof MyVariable) {
			return (le as MyVariable).^var;
		}
	}
	
	def generate (FunctionCall fc) {
		if (fc instanceof PreDefFunctionCall) {
			return (fc as PreDefFunctionCall).generate;
		} else if (fc instanceof UserDefFunctionCall) {
			return (fc as UserDefFunctionCall).generate;
		}
	}
	
	def generate (PreDefFunctionCall pdf) '''«IF pdf.function.getName.equals("show")»«"System.out.println"»«ELSE»«pdf.function.getName»«ENDIF»(«FOR exp : pdf.args SEPARATOR ','»«exp.generate»«ENDFOR»)'''
	
	def generate (UserDefFunctionCall udf) '''«udf.function.getName»(«FOR exp : udf.args SEPARATOR ','»«exp.generate»«ENDFOR»)'''
	
	def generate (IfControlFlow icf) '''if («icf.cond.generate») {
		«icf.iftrue.generate»
	} else {
		«icf.iffalse.generate»
	}'''
	
	def generate (BracketExpression be) {
		return "(" + be.exp.generate + ")"
	}
	
	def generate(FunctionDefinition funcd) '''public «TypeInferrer.getFunctionTypes.get(funcd.name).convertDTtoString» «funcd.name»(«FOR fp : funcd.params SEPARATOR ','»«TypeInferrer.functionParams.get(funcd.name).get(fp).convertDTtoString + ' ' + fp»«ENDFOR») {
	«funcd.^return.exp.generate»;
}'''

	def convertDTtoString(DataType dt) {
		switch(dt) {
			case DataType.BOOL:
				return "boolean"
			case DataType.INT:
				return dt.name.toLowerCase
			case DataType.STRING:
				return dt.name.toLowerCase.toFirstUpper
			case DataType.LIST:
				return "int[]"
			default:
				return "void"
		}
	}
	
	def generatePreDefFunctions() '''int[] cons(int x, int[] l) {
        int[] res = new int[l.length + 1];
        res[0] = x;
        for (int i = 1; i < l.length + 1; i++) {
            res[i] = l[i - 1];
        }
        return res;
    }
    
    int car(int[] l) {
        return l[0];
    }
    
    int[] cdr(int[] l) {
        int[] res = new int[l.length - 1];
        for (int i = 1; i < l.length ; i++) {
            res[i - 1] = l[i];
        }
        return res;
    }
    
    boolean isEmpty(int[] l) {
        return (l.length > 1) ? false : true;
    }
    
    int length(String s) {
        return s.length();
    }'''
}
