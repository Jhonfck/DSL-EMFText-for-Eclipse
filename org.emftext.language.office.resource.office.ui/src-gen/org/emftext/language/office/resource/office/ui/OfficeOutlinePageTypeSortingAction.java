/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.ui;

public class OfficeOutlinePageTypeSortingAction extends org.emftext.language.office.resource.office.ui.AbstractOfficeOutlinePageAction {
	
	public OfficeOutlinePageTypeSortingAction(org.emftext.language.office.resource.office.ui.OfficeOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
