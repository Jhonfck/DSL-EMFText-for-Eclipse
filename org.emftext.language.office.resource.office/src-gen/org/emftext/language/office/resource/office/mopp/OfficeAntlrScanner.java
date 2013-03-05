/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.mopp;

public class OfficeAntlrScanner implements org.emftext.language.office.resource.office.IOfficeTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public OfficeAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.emftext.language.office.resource.office.IOfficeTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		org.emftext.language.office.resource.office.IOfficeTextToken result = new org.emftext.language.office.resource.office.mopp.OfficeANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
