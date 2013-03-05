/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class OfficeRule extends org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public OfficeRule(org.eclipse.emf.ecore.EClass metaclass, org.emftext.language.office.resource.office.grammar.OfficeChoice choice, org.emftext.language.office.resource.office.grammar.OfficeCardinality cardinality) {
		super(cardinality, new org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public org.emftext.language.office.resource.office.grammar.OfficeChoice getDefinition() {
		return (org.emftext.language.office.resource.office.grammar.OfficeChoice) getChildren()[0];
	}
	
}

