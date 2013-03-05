/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.grammar;

public class OfficeLineBreak extends org.emftext.language.office.resource.office.grammar.OfficeFormattingElement {
	
	private final int tabs;
	
	public OfficeLineBreak(org.emftext.language.office.resource.office.grammar.OfficeCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
