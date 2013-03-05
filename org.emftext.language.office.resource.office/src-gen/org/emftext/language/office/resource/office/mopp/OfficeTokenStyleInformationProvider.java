/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.mopp;

public class OfficeTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public org.emftext.language.office.resource.office.IOfficeTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("OfficeModel".equals(tokenName)) {
			return new org.emftext.language.office.resource.office.mopp.OfficeTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("name".equals(tokenName)) {
			return new org.emftext.language.office.resource.office.mopp.OfficeTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("elements".equals(tokenName)) {
			return new org.emftext.language.office.resource.office.mopp.OfficeTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Office".equals(tokenName)) {
			return new org.emftext.language.office.resource.office.mopp.OfficeTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Employee".equals(tokenName)) {
			return new org.emftext.language.office.resource.office.mopp.OfficeTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("worksIn".equals(tokenName)) {
			return new org.emftext.language.office.resource.office.mopp.OfficeTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("worksWith".equals(tokenName)) {
			return new org.emftext.language.office.resource.office.mopp.OfficeTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("officemodel".equals(tokenName)) {
			return new org.emftext.language.office.resource.office.mopp.OfficeTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("office".equals(tokenName)) {
			return new org.emftext.language.office.resource.office.mopp.OfficeTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("employee".equals(tokenName)) {
			return new org.emftext.language.office.resource.office.mopp.OfficeTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("works".equals(tokenName)) {
			return new org.emftext.language.office.resource.office.mopp.OfficeTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("in".equals(tokenName)) {
			return new org.emftext.language.office.resource.office.mopp.OfficeTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("with".equals(tokenName)) {
			return new org.emftext.language.office.resource.office.mopp.OfficeTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new org.emftext.language.office.resource.office.mopp.OfficeTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
