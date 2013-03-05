/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.grammar;

public class OfficeChoice extends org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement {
	
	public OfficeChoice(org.emftext.language.office.resource.office.grammar.OfficeCardinality cardinality, org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.emftext.language.office.resource.office.util.OfficeStringUtil.explode(getChildren(), "|");
	}
	
}
