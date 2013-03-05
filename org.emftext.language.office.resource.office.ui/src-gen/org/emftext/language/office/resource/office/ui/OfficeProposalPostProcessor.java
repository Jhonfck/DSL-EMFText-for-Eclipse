/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class OfficeProposalPostProcessor {
	
	public java.util.List<org.emftext.language.office.resource.office.ui.OfficeCompletionProposal> process(java.util.List<org.emftext.language.office.resource.office.ui.OfficeCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
