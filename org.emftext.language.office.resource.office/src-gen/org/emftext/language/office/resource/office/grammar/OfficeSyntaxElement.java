/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class OfficeSyntaxElement {
	
	private OfficeSyntaxElement[] children;
	private OfficeSyntaxElement parent;
	private org.emftext.language.office.resource.office.grammar.OfficeCardinality cardinality;
	
	public OfficeSyntaxElement(org.emftext.language.office.resource.office.grammar.OfficeCardinality cardinality, OfficeSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (OfficeSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(OfficeSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public OfficeSyntaxElement getParent() {
		return parent;
	}
	
	public OfficeSyntaxElement[] getChildren() {
		if (children == null) {
			return new OfficeSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.emftext.language.office.resource.office.grammar.OfficeCardinality getCardinality() {
		return cardinality;
	}
	
}
