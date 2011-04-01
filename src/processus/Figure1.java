package processus;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

import iaca.impl.IacaFactoryImpl;
import iaca.util.Util;

public class Figure1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EObject[] library = Util.loadModel("model/Library.xmi", IacaFactoryImpl.eINSTANCE.getIacaPackage());
		
		
		
		try {
			Util.saveModel("model/test.xmi", library);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
