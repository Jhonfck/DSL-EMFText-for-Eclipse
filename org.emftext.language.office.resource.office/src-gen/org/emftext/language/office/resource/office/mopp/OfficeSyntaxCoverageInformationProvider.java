/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.mopp;

public class OfficeSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel(),
			org.emftext.language.office.OfficePackage.eINSTANCE.getOffice(),
			org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel(),
		};
	}
	
}
