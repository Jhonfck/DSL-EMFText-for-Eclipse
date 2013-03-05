/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.mopp;

public class OfficeReferenceResolverSwitch implements org.emftext.language.office.resource.office.IOfficeReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected org.emftext.language.office.resource.office.analysis.EmployeeWorksInReferenceResolver employeeWorksInReferenceResolver = new org.emftext.language.office.resource.office.analysis.EmployeeWorksInReferenceResolver();
	protected org.emftext.language.office.resource.office.analysis.EmployeeWorksWithReferenceResolver employeeWorksWithReferenceResolver = new org.emftext.language.office.resource.office.analysis.EmployeeWorksWithReferenceResolver();
	
	public org.emftext.language.office.resource.office.IOfficeReferenceResolver<org.emftext.language.office.Employee, org.emftext.language.office.Office> getEmployeeWorksInReferenceResolver() {
		return getResolverChain(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee_WorksIn(), employeeWorksInReferenceResolver);
	}
	
	public org.emftext.language.office.resource.office.IOfficeReferenceResolver<org.emftext.language.office.Employee, org.emftext.language.office.Employee> getEmployeeWorksWithReferenceResolver() {
		return getResolverChain(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee_WorksWith(), employeeWorksWithReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		employeeWorksInReferenceResolver.setOptions(options);
		employeeWorksWithReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.emftext.language.office.resource.office.IOfficeReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee().isInstance(container)) {
			OfficeFuzzyResolveResult<org.emftext.language.office.Office> frr = new OfficeFuzzyResolveResult<org.emftext.language.office.Office>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("worksIn")) {
				employeeWorksInReferenceResolver.resolve(identifier, (org.emftext.language.office.Employee) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee().isInstance(container)) {
			OfficeFuzzyResolveResult<org.emftext.language.office.Employee> frr = new OfficeFuzzyResolveResult<org.emftext.language.office.Employee>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("worksWith")) {
				employeeWorksWithReferenceResolver.resolve(identifier, (org.emftext.language.office.Employee) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.emftext.language.office.resource.office.IOfficeReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee_WorksIn()) {
			return getResolverChain(reference, employeeWorksInReferenceResolver);
		}
		if (reference == org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee_WorksWith()) {
			return getResolverChain(reference, employeeWorksWithReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> org.emftext.language.office.resource.office.IOfficeReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, org.emftext.language.office.resource.office.IOfficeReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(org.emftext.language.office.resource.office.IOfficeOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new org.emftext.language.office.resource.office.util.OfficeRuntimeUtil().logWarning("Found value with invalid type for option " + org.emftext.language.office.resource.office.IOfficeOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof org.emftext.language.office.resource.office.IOfficeReferenceResolver) {
			org.emftext.language.office.resource.office.IOfficeReferenceResolver replacingResolver = (org.emftext.language.office.resource.office.IOfficeReferenceResolver) resolverValue;
			if (replacingResolver instanceof org.emftext.language.office.resource.office.IOfficeDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((org.emftext.language.office.resource.office.IOfficeDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			org.emftext.language.office.resource.office.IOfficeReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof org.emftext.language.office.resource.office.IOfficeReferenceCache) {
					org.emftext.language.office.resource.office.IOfficeReferenceResolver nextResolver = (org.emftext.language.office.resource.office.IOfficeReferenceResolver) next;
					if (nextResolver instanceof org.emftext.language.office.resource.office.IOfficeDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((org.emftext.language.office.resource.office.IOfficeDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new org.emftext.language.office.resource.office.util.OfficeRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.emftext.language.office.resource.office.IOfficeOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.emftext.language.office.resource.office.IOfficeDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new org.emftext.language.office.resource.office.util.OfficeRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.emftext.language.office.resource.office.IOfficeOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.emftext.language.office.resource.office.IOfficeDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
