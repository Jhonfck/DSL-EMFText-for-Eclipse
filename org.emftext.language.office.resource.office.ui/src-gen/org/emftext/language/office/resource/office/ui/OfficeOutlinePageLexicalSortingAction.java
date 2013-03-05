/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.ui;

public class OfficeOutlinePageLexicalSortingAction extends org.emftext.language.office.resource.office.ui.AbstractOfficeOutlinePageAction {
	
	public OfficeOutlinePageLexicalSortingAction(org.emftext.language.office.resource.office.ui.OfficeOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
