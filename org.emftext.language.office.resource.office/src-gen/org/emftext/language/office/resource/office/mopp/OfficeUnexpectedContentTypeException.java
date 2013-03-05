/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see
 * org.emftext.language.office.resource.office.IOfficeOptions.RESOURCE_CONTENT_TYPE
 */
public class OfficeUnexpectedContentTypeException extends org.antlr.runtime3_4_0.RecognitionException {
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  OfficeUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
