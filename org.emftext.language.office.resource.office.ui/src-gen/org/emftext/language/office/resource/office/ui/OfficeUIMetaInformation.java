/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.ui;

public class OfficeUIMetaInformation extends org.emftext.language.office.resource.office.mopp.OfficeMetaInformation {
	
	public org.emftext.language.office.resource.office.IOfficeHoverTextProvider getHoverTextProvider() {
		return new org.emftext.language.office.resource.office.ui.OfficeHoverTextProvider();
	}
	
	public org.emftext.language.office.resource.office.ui.OfficeImageProvider getImageProvider() {
		return org.emftext.language.office.resource.office.ui.OfficeImageProvider.INSTANCE;
	}
	
	public org.emftext.language.office.resource.office.ui.OfficeColorManager createColorManager() {
		return new org.emftext.language.office.resource.office.ui.OfficeColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.emftext.language.office.resource.office.IOfficeTextResour
	 * ce, org.emftext.language.office.resource.office.ui.OfficeColorManager) instead.
	 */
	public org.emftext.language.office.resource.office.ui.OfficeTokenScanner createTokenScanner(org.emftext.language.office.resource.office.ui.OfficeColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.emftext.language.office.resource.office.ui.OfficeTokenScanner createTokenScanner(org.emftext.language.office.resource.office.IOfficeTextResource resource, org.emftext.language.office.resource.office.ui.OfficeColorManager colorManager) {
		return new org.emftext.language.office.resource.office.ui.OfficeTokenScanner(resource, colorManager);
	}
	
	public org.emftext.language.office.resource.office.ui.OfficeCodeCompletionHelper createCodeCompletionHelper() {
		return new org.emftext.language.office.resource.office.ui.OfficeCodeCompletionHelper();
	}
	
}
