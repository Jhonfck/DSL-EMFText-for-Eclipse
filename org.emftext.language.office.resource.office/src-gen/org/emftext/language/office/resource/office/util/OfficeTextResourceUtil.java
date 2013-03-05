/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.util;

/**
 * Class OfficeTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * org.emftext.language.office.resource.office.util.OfficeResourceUtil.
 */
public class OfficeTextResourceUtil {
	
	/**
	 * Use
	 * org.emftext.language.office.resource.office.util.OfficeResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated	
	public static org.emftext.language.office.resource.office.mopp.OfficeResource getResource(org.eclipse.core.resources.IFile file) {
		return new org.emftext.language.office.resource.office.util.OfficeEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * org.emftext.language.office.resource.office.util.OfficeResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated	
	public static org.emftext.language.office.resource.office.mopp.OfficeResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return org.emftext.language.office.resource.office.util.OfficeResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * org.emftext.language.office.resource.office.util.OfficeResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated	
	public static org.emftext.language.office.resource.office.mopp.OfficeResource getResource(org.eclipse.emf.common.util.URI uri) {
		return org.emftext.language.office.resource.office.util.OfficeResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * org.emftext.language.office.resource.office.util.OfficeResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated	
	public static org.emftext.language.office.resource.office.mopp.OfficeResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return org.emftext.language.office.resource.office.util.OfficeResourceUtil.getResource(uri, options);
	}
	
}
