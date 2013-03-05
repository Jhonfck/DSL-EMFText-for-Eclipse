/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class OfficeAbstractExpectedElement implements org.emftext.language.office.resource.office.IOfficeExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<org.emftext.language.office.resource.office.util.OfficePair<org.emftext.language.office.resource.office.IOfficeExpectedElement, org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[]>> followers = new java.util.LinkedHashSet<org.emftext.language.office.resource.office.util.OfficePair<org.emftext.language.office.resource.office.IOfficeExpectedElement, org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[]>>();
	
	public OfficeAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.emftext.language.office.resource.office.IOfficeExpectedElement follower, org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[] path) {
		followers.add(new org.emftext.language.office.resource.office.util.OfficePair<org.emftext.language.office.resource.office.IOfficeExpectedElement, org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.emftext.language.office.resource.office.util.OfficePair<org.emftext.language.office.resource.office.IOfficeExpectedElement, org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
