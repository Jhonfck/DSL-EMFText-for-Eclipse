/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.mopp;

public class OfficeProblem implements org.emftext.language.office.resource.office.IOfficeProblem {
	
	private String message;
	private org.emftext.language.office.resource.office.OfficeEProblemType type;
	private org.emftext.language.office.resource.office.OfficeEProblemSeverity severity;
	private java.util.Collection<org.emftext.language.office.resource.office.IOfficeQuickFix> quickFixes;
	
	public OfficeProblem(String message, org.emftext.language.office.resource.office.OfficeEProblemType type, org.emftext.language.office.resource.office.OfficeEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<org.emftext.language.office.resource.office.IOfficeQuickFix>emptySet());
	}
	
	public OfficeProblem(String message, org.emftext.language.office.resource.office.OfficeEProblemType type, org.emftext.language.office.resource.office.OfficeEProblemSeverity severity, org.emftext.language.office.resource.office.IOfficeQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public OfficeProblem(String message, org.emftext.language.office.resource.office.OfficeEProblemType type, org.emftext.language.office.resource.office.OfficeEProblemSeverity severity, java.util.Collection<org.emftext.language.office.resource.office.IOfficeQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<org.emftext.language.office.resource.office.IOfficeQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.emftext.language.office.resource.office.OfficeEProblemType getType() {
		return type;
	}
	
	public org.emftext.language.office.resource.office.OfficeEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.emftext.language.office.resource.office.IOfficeQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
