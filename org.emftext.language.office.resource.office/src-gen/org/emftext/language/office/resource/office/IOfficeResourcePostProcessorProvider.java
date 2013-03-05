/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IOfficeResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.emftext.language.office.resource.office.IOfficeResourcePostProcessor getResourcePostProcessor();
	
}
