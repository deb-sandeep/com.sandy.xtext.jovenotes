/*
 * generated by Xtext
 */
package com.sandy.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractJoveNotesValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.sandy.xtext.joveNotes.JoveNotesPackage.eINSTANCE);
		return result;
	}
}
