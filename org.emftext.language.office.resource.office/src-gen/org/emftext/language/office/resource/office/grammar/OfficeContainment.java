/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.grammar;

public class OfficeContainment extends org.emftext.language.office.resource.office.grammar.OfficeTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public OfficeContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.emftext.language.office.resource.office.grammar.OfficeCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = org.emftext.language.office.resource.office.util.OfficeStringUtil.explode(allowedTypes, ", ", new org.emftext.language.office.resource.office.IOfficeFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
