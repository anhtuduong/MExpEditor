/*
 * generated by Xtext 2.27.0
 */
package eu.fbk.se.mathexpeditor.ui.tests;

import com.google.inject.Injector;
import eu.fbk.se.mathexpeditor.ui.internal.MathexpeditorActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class MExpUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MathexpeditorActivator.getInstance().getInjector("eu.fbk.se.mathexpeditor.MExp");
	}

}
