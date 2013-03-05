/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.grammar;

public class OfficeSequence extends org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement {
	
	public OfficeSequence(org.emftext.language.office.resource.office.grammar.OfficeCardinality cardinality, org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.emftext.language.office.resource.office.util.OfficeStringUtil.explode(getChildren(), " ");
	}
	
}
