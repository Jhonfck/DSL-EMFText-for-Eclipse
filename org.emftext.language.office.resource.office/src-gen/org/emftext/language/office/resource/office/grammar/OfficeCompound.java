/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.grammar;

public class OfficeCompound extends org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement {
	
	public OfficeCompound(org.emftext.language.office.resource.office.grammar.OfficeChoice choice, org.emftext.language.office.resource.office.grammar.OfficeCardinality cardinality) {
		super(cardinality, new org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
