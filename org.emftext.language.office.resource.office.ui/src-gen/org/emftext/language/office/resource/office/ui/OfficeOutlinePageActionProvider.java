/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.ui;

public class OfficeOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(org.emftext.language.office.resource.office.ui.OfficeOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new org.emftext.language.office.resource.office.ui.OfficeOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new org.emftext.language.office.resource.office.ui.OfficeOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new org.emftext.language.office.resource.office.ui.OfficeOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new org.emftext.language.office.resource.office.ui.OfficeOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new org.emftext.language.office.resource.office.ui.OfficeOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new org.emftext.language.office.resource.office.ui.OfficeOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
