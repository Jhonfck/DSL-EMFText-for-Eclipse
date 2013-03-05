/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.grammar;

public class OfficeWhiteSpace extends org.emftext.language.office.resource.office.grammar.OfficeFormattingElement {
	
	private final int amount;
	
	public OfficeWhiteSpace(int amount, org.emftext.language.office.resource.office.grammar.OfficeCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
