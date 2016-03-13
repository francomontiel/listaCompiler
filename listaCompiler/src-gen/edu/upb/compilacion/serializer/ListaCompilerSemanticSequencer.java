/*
 * generated by Xtext
 */
package edu.upb.compilacion.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.upb.compilacion.listaCompiler.Evaluation;
import edu.upb.compilacion.listaCompiler.Expression;
import edu.upb.compilacion.listaCompiler.FirstLevelExp;
import edu.upb.compilacion.listaCompiler.FourthLevelExp;
import edu.upb.compilacion.listaCompiler.FunctionDefinition;
import edu.upb.compilacion.listaCompiler.IfControlFlow;
import edu.upb.compilacion.listaCompiler.IntList;
import edu.upb.compilacion.listaCompiler.Lista;
import edu.upb.compilacion.listaCompiler.ListaCompilerPackage;
import edu.upb.compilacion.listaCompiler.MyString;
import edu.upb.compilacion.listaCompiler.MyVariable;
import edu.upb.compilacion.listaCompiler.NegBool;
import edu.upb.compilacion.listaCompiler.NegInteger;
import edu.upb.compilacion.listaCompiler.PosBool;
import edu.upb.compilacion.listaCompiler.PosInteger;
import edu.upb.compilacion.listaCompiler.PreDefFunction;
import edu.upb.compilacion.listaCompiler.PreDefFunctionCall;
import edu.upb.compilacion.listaCompiler.SecondLevelExp;
import edu.upb.compilacion.listaCompiler.ThirdLevelExp;
import edu.upb.compilacion.listaCompiler.UserDefFunctionCall;
import edu.upb.compilacion.services.ListaCompilerGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ListaCompilerSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ListaCompilerGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ListaCompilerPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ListaCompilerPackage.EVALUATION:
				sequence_Evaluation(context, (Evaluation) semanticObject); 
				return; 
			case ListaCompilerPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case ListaCompilerPackage.FIRST_LEVEL_EXP:
				sequence_FirstLevelExp(context, (FirstLevelExp) semanticObject); 
				return; 
			case ListaCompilerPackage.FOURTH_LEVEL_EXP:
				sequence_FourthLevelExp(context, (FourthLevelExp) semanticObject); 
				return; 
			case ListaCompilerPackage.FUNCTION_DEFINITION:
				sequence_FunctionDefinition(context, (FunctionDefinition) semanticObject); 
				return; 
			case ListaCompilerPackage.IF_CONTROL_FLOW:
				sequence_IfControlFlow(context, (IfControlFlow) semanticObject); 
				return; 
			case ListaCompilerPackage.INT_LIST:
				sequence_List(context, (IntList) semanticObject); 
				return; 
			case ListaCompilerPackage.LISTA:
				sequence_Lista(context, (Lista) semanticObject); 
				return; 
			case ListaCompilerPackage.MY_STRING:
				sequence_MyString(context, (MyString) semanticObject); 
				return; 
			case ListaCompilerPackage.MY_VARIABLE:
				sequence_MyVariable(context, (MyVariable) semanticObject); 
				return; 
			case ListaCompilerPackage.NEG_BOOL:
				sequence_NegBool(context, (NegBool) semanticObject); 
				return; 
			case ListaCompilerPackage.NEG_INTEGER:
				sequence_NegInteger(context, (NegInteger) semanticObject); 
				return; 
			case ListaCompilerPackage.POS_BOOL:
				sequence_PosBool(context, (PosBool) semanticObject); 
				return; 
			case ListaCompilerPackage.POS_INTEGER:
				sequence_PosInteger(context, (PosInteger) semanticObject); 
				return; 
			case ListaCompilerPackage.PRE_DEF_FUNCTION:
				sequence_PreDefFunction(context, (PreDefFunction) semanticObject); 
				return; 
			case ListaCompilerPackage.PRE_DEF_FUNCTION_CALL:
				sequence_PreDefFunctionCall(context, (PreDefFunctionCall) semanticObject); 
				return; 
			case ListaCompilerPackage.SECOND_LEVEL_EXP:
				sequence_SecondLevelExp(context, (SecondLevelExp) semanticObject); 
				return; 
			case ListaCompilerPackage.THIRD_LEVEL_EXP:
				sequence_ThirdLevelExp(context, (ThirdLevelExp) semanticObject); 
				return; 
			case ListaCompilerPackage.USER_DEF_FUNCTION_CALL:
				sequence_UserDefFunctionCall(context, (UserDefFunctionCall) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     return=Expression
	 */
	protected void sequence_Evaluation(EObject context, Evaluation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaCompilerPackage.Literals.EVALUATION__RETURN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaCompilerPackage.Literals.EVALUATION__RETURN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEvaluationAccess().getReturnExpressionParserRuleCall_1_0(), semanticObject.getReturn());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     exp=FirstLevelExp
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaCompilerPackage.Literals.EXPRESSION__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaCompilerPackage.Literals.EXPRESSION__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getExpFirstLevelExpParserRuleCall_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (args+=SecondLevelExp (op=FirstLevelOp args+=FirstLevelExp)?)
	 */
	protected void sequence_FirstLevelExp(EObject context, FirstLevelExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (args+=Term (op=FourthLevelOp args+=FourthLevelExp)?)
	 */
	protected void sequence_FourthLevelExp(EObject context, FourthLevelExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDFUNCVAR (params+=IDFUNCVAR params+=IDFUNCVAR*)? return=Expression)
	 */
	protected void sequence_FunctionDefinition(EObject context, FunctionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=CFlow cond=Expression iftrue=Expression iffalse=Expression)
	 */
	protected void sequence_IfControlFlow(EObject context, IfControlFlow semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaCompilerPackage.Literals.IF_CONTROL_FLOW__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaCompilerPackage.Literals.IF_CONTROL_FLOW__NAME));
			if(transientValues.isValueTransient(semanticObject, ListaCompilerPackage.Literals.IF_CONTROL_FLOW__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaCompilerPackage.Literals.IF_CONTROL_FLOW__COND));
			if(transientValues.isValueTransient(semanticObject, ListaCompilerPackage.Literals.IF_CONTROL_FLOW__IFTRUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaCompilerPackage.Literals.IF_CONTROL_FLOW__IFTRUE));
			if(transientValues.isValueTransient(semanticObject, ListaCompilerPackage.Literals.IF_CONTROL_FLOW__IFFALSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaCompilerPackage.Literals.IF_CONTROL_FLOW__IFFALSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIfControlFlowAccess().getNameCFlowEnumRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getIfControlFlowAccess().getCondExpressionParserRuleCall_2_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getIfControlFlowAccess().getIftrueExpressionParserRuleCall_4_0(), semanticObject.getIftrue());
		feeder.accept(grammarAccess.getIfControlFlowAccess().getIffalseExpressionParserRuleCall_6_0(), semanticObject.getIffalse());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((elems+=ListElem+ elems+=ListElem*)?)
	 */
	protected void sequence_List(EObject context, IntList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lines+=Evaluation | lines+=FunctionDefinition)+
	 */
	protected void sequence_Lista(EObject context, Lista semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     val=STRING
	 */
	protected void sequence_MyString(EObject context, MyString semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaCompilerPackage.Literals.MY_STRING__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaCompilerPackage.Literals.MY_STRING__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMyStringAccess().getValSTRINGTerminalRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     var=IDFUNCVAR
	 */
	protected void sequence_MyVariable(EObject context, MyVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaCompilerPackage.Literals.MY_VARIABLE__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaCompilerPackage.Literals.MY_VARIABLE__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMyVariableAccess().getVarIDFUNCVARTerminalRuleCall_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     val=Bool
	 */
	protected void sequence_NegBool(EObject context, NegBool semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaCompilerPackage.Literals.MY_BOOL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaCompilerPackage.Literals.MY_BOOL__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNegBoolAccess().getValBoolEnumRuleCall_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_NegInteger(EObject context, NegInteger semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaCompilerPackage.Literals.MY_INTEGER__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaCompilerPackage.Literals.MY_INTEGER__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNegIntegerAccess().getValINTTerminalRuleCall_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     val=Bool
	 */
	protected void sequence_PosBool(EObject context, PosBool semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaCompilerPackage.Literals.MY_BOOL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaCompilerPackage.Literals.MY_BOOL__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPosBoolAccess().getValBoolEnumRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_PosInteger(EObject context, PosInteger semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaCompilerPackage.Literals.MY_INTEGER__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaCompilerPackage.Literals.MY_INTEGER__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPosIntegerAccess().getValINTTerminalRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (function=PDFunction (args+=Expression args+=Expression*)?)
	 */
	protected void sequence_PreDefFunctionCall(EObject context, PreDefFunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=PDFunction
	 */
	protected void sequence_PreDefFunction(EObject context, PreDefFunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ListaCompilerPackage.Literals.PRE_DEF_FUNCTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ListaCompilerPackage.Literals.PRE_DEF_FUNCTION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPreDefFunctionAccess().getNamePDFunctionEnumRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (args+=ThirdLevelExp (op=SecondLevelOp args+=SecondLevelExp)?)
	 */
	protected void sequence_SecondLevelExp(EObject context, SecondLevelExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (args+=FourthLevelExp (op=ThirdLevelOp args+=ThirdLevelExp)?)
	 */
	protected void sequence_ThirdLevelExp(EObject context, ThirdLevelExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (function=[FunctionDefinition|IDFUNCVAR] (args+=Expression args+=Expression*)?)
	 */
	protected void sequence_UserDefFunctionCall(EObject context, UserDefFunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
