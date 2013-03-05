/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.mopp;

public class OfficeBracketInformationProvider {
	
	public class BracketPair implements org.emftext.language.office.resource.office.IOfficeBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<org.emftext.language.office.resource.office.IOfficeBracketPair> getBracketPairs() {
		java.util.Collection<org.emftext.language.office.resource.office.IOfficeBracketPair> result = new java.util.ArrayList<org.emftext.language.office.resource.office.IOfficeBracketPair>();
		result.add(new BracketPair("{", "}", true));
		return result;
	}
	
}
