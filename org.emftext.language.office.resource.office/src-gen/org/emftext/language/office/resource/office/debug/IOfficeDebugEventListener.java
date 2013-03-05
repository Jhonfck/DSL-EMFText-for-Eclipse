/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.debug;

public interface IOfficeDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(org.emftext.language.office.resource.office.debug.OfficeDebugMessage message);
}
