/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.mopp;

public class OfficeSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private OfficeSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public OfficeSyntaxElementDecorator(org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement decoratedElement, OfficeSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public OfficeSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
