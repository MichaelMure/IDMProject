package iaca.util;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Util {
	
	/**
	 * @param sourceXMI File location of the model serialization
	 * @param pack Singleton object of the main package instance (e.g. UMLPackage.eINSTANCE)
	 * @return The set of roots found in the serialized model
	 */
	public static EObject[] loadModel(String sourceXMI, EPackage pack) {
		URI fileURI = URI.createFileURI(new File(sourceXMI).getAbsolutePath());
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(fileURI, true);
		return resource.getContents().toArray(new EObject [resource.getContents().size()]);
	}
	
	/**
	 * @param targetXMI Destination file for the model serialization.
	 * @param toBeSaved List of root objects of the model to be serialized.
	 */
	public static void saveModel(String targetXMI, EObject [] toBeSaved) throws IOException {
		URI fileURI = URI.createFileURI(new File(targetXMI).getAbsolutePath());
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,new XMIResourceFactoryImpl());
		Resource resource = resourceSet.createResource(fileURI);
		for(int i = 0; i < toBeSaved.length; i++)
		{
			resource.getContents().add(toBeSaved[i]);
		}
		resource.save(Collections.EMPTY_MAP);
	}
}
