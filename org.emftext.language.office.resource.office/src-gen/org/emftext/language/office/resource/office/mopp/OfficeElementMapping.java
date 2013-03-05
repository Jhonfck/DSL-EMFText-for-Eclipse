/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.mopp;

/**
 * A basic implementation of the
 * org.emftext.language.office.resource.office.IOfficeElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class OfficeElementMapping<ReferenceType> implements org.emftext.language.office.resource.office.IOfficeElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public OfficeElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
