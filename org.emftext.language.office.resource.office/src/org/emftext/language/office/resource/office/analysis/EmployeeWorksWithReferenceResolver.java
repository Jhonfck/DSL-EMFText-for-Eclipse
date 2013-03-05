/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.analysis;

public class EmployeeWorksWithReferenceResolver implements org.emftext.language.office.resource.office.IOfficeReferenceResolver<org.emftext.language.office.Employee, org.emftext.language.office.Employee> {
	
	private org.emftext.language.office.resource.office.analysis.OfficeDefaultResolverDelegate<org.emftext.language.office.Employee, org.emftext.language.office.Employee> delegate = new org.emftext.language.office.resource.office.analysis.OfficeDefaultResolverDelegate<org.emftext.language.office.Employee, org.emftext.language.office.Employee>();
	
	public void resolve(String identifier, org.emftext.language.office.Employee container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.emftext.language.office.resource.office.IOfficeReferenceResolveResult<org.emftext.language.office.Employee> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.emftext.language.office.Employee element, org.emftext.language.office.Employee container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
