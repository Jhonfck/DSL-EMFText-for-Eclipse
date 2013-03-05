/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IOfficeParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<org.emftext.language.office.resource.office.IOfficeCommand<org.emftext.language.office.resource.office.IOfficeTextResource>> getPostParseCommands();
	
}
