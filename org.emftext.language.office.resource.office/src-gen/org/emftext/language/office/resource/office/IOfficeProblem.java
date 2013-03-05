/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office;

public interface IOfficeProblem {
	public String getMessage();
	public org.emftext.language.office.resource.office.OfficeEProblemSeverity getSeverity();
	public org.emftext.language.office.resource.office.OfficeEProblemType getType();
	public java.util.Collection<org.emftext.language.office.resource.office.IOfficeQuickFix> getQuickFixes();
}
