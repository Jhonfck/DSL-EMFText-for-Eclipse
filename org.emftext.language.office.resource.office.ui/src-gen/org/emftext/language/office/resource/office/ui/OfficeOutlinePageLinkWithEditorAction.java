/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.ui;

public class OfficeOutlinePageLinkWithEditorAction extends org.emftext.language.office.resource.office.ui.AbstractOfficeOutlinePageAction {
	
	public OfficeOutlinePageLinkWithEditorAction(org.emftext.language.office.resource.office.ui.OfficeOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
