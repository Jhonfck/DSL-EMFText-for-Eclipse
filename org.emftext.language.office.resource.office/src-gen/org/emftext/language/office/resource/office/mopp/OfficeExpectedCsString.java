/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class OfficeExpectedCsString extends org.emftext.language.office.resource.office.mopp.OfficeAbstractExpectedElement {
	
	private org.emftext.language.office.resource.office.grammar.OfficeKeyword keyword;
	
	public OfficeExpectedCsString(org.emftext.language.office.resource.office.grammar.OfficeKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof OfficeExpectedCsString) {
			return getValue().equals(((OfficeExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
