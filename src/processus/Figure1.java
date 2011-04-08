package processus;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import iaca.AttributsInstance;
import iaca.Component;
import iaca.ComponentInstance;
import iaca.IacaFactory;
import iaca.IacaPackage;
import iaca.Process;
import iaca.util.Util;

public class Figure1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EObject[] library = Util.loadModel("model/Library.xmi", IacaPackage.eINSTANCE);
		
		EList<EObject> list = library[0].eContents();
		
		Component TOR = (Component) list.get(0);
		Component bit = (Component) list.get(1);
		Component filtre = (Component) list.get(2);
		Component clock = (Component) list.get(3);
		Component front = (Component) list.get(4);
		Component diviseur = (Component) list.get(5);
		Component bascule = (Component) list.get(6);
		Component cligno = (Component) list.get(7);
		
		Process figure1 = IacaFactory.eINSTANCE.createProcess();
		ComponentInstance bitInstance = IacaFactory.eINSTANCE.createComponentInstance();
		
		try {
			Util.saveModel("model/test.xmi", library);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
