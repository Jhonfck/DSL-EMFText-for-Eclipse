/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.ui;

public class OfficeHoverTextProvider implements org.emftext.language.office.resource.office.IOfficeHoverTextProvider {
	
	private org.emftext.language.office.resource.office.ui.OfficeDefaultHoverTextProvider defaultProvider = new org.emftext.language.office.resource.office.ui.OfficeDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
