/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class OfficeKeyword extends org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement {
	
	private final String value;
	
	public OfficeKeyword(String value, org.emftext.language.office.resource.office.grammar.OfficeCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
