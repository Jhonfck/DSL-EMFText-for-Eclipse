/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.mopp;

public class OfficeResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public OfficeResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.emftext.language.office.resource.office.mopp.OfficeResource(uri);
	}
	
}
