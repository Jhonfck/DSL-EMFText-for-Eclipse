/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.mopp;

public class OfficeParseResult implements org.emftext.language.office.resource.office.IOfficeParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.emftext.language.office.resource.office.IOfficeCommand<org.emftext.language.office.resource.office.IOfficeTextResource>> commands = new java.util.ArrayList<org.emftext.language.office.resource.office.IOfficeCommand<org.emftext.language.office.resource.office.IOfficeTextResource>>();
	
	public OfficeParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.emftext.language.office.resource.office.IOfficeCommand<org.emftext.language.office.resource.office.IOfficeTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
