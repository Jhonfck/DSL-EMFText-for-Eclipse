/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.debug;

public class OfficeSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof org.emftext.language.office.resource.office.debug.OfficeStackFrame) {
			org.emftext.language.office.resource.office.debug.OfficeStackFrame frame = (org.emftext.language.office.resource.office.debug.OfficeStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
