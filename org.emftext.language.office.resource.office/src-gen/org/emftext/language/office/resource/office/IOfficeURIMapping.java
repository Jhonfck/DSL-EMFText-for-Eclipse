/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office;

/**
 * Implementors of this interface map identifiers to URIs. This is sometimes
 * necessary when resolving references depends on the resolution of others.
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * org.emftext.language.office.resource.office.IOfficeReferenceMapping.
 */
public interface IOfficeURIMapping<ReferenceType> extends org.emftext.language.office.resource.office.IOfficeReferenceMapping<ReferenceType> {
	
	/**
	 * Returns an alternative proxy URI that should follow EMF's default naming scheme
	 * such that it can be resolved by the default resolution mechanism that will be
	 * called on this URI (see <code>Resource.getEObject()</code>).
	 */
	public org.eclipse.emf.common.util.URI getTargetIdentifier();
	
}
