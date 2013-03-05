/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class OfficePlaceholder extends org.emftext.language.office.resource.office.grammar.OfficeTerminal {
	
	private final String tokenName;
	
	public OfficePlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.emftext.language.office.resource.office.grammar.OfficeCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
