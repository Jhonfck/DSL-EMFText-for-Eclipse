/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.ui;

public class OfficeOutlinePageExpandAllAction extends org.emftext.language.office.resource.office.ui.AbstractOfficeOutlinePageAction {
	
	public OfficeOutlinePageExpandAllAction(org.emftext.language.office.resource.office.ui.OfficeOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
