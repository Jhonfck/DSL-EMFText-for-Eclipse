/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IOfficeCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
