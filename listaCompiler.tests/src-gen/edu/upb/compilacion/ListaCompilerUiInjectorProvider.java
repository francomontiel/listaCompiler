/*
 * generated by Xtext
 */
package edu.upb.compilacion;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ListaCompilerUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return edu.upb.compilacion.ui.internal.ListaCompilerActivator.getInstance().getInjector("edu.upb.compilacion.ListaCompiler");
	}
	
}
