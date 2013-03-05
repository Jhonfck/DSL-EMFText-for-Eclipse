/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.grammar;

/**
 * This class provides the follow sets for all terminals of the grammar. These
 * sets are used during code completion.
 */
public class OfficeFollowSetProvider {
	
	public final static org.emftext.language.office.resource.office.IOfficeExpectedElement TERMINALS[] = new org.emftext.language.office.resource.office.IOfficeExpectedElement[16];
	
	public final static org.eclipse.emf.ecore.EStructuralFeature[] FEATURES = new org.eclipse.emf.ecore.EStructuralFeature[1];
	
	public final static org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[] LINKS = new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[12];
	
	public final static org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[] EMPTY_LINK_ARRAY = new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[0];
	
	public static void initializeTerminals0() {
		TERMINALS[0] = new org.emftext.language.office.resource.office.mopp.OfficeExpectedCsString(org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_0_0_0_0);
		TERMINALS[1] = new org.emftext.language.office.resource.office.mopp.OfficeExpectedStructuralFeature(org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_0_0_0_1);
		TERMINALS[2] = new org.emftext.language.office.resource.office.mopp.OfficeExpectedCsString(org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_0_0_0_2);
		TERMINALS[3] = new org.emftext.language.office.resource.office.mopp.OfficeExpectedCsString(org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_1_0_0_0);
		TERMINALS[4] = new org.emftext.language.office.resource.office.mopp.OfficeExpectedCsString(org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_0);
		TERMINALS[5] = new org.emftext.language.office.resource.office.mopp.OfficeExpectedCsString(org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_0_0_0_4);
		TERMINALS[6] = new org.emftext.language.office.resource.office.mopp.OfficeExpectedStructuralFeature(org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_1_0_0_1);
		TERMINALS[7] = new org.emftext.language.office.resource.office.mopp.OfficeExpectedStructuralFeature(org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_1);
		TERMINALS[8] = new org.emftext.language.office.resource.office.mopp.OfficeExpectedCsString(org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_2);
		TERMINALS[9] = new org.emftext.language.office.resource.office.mopp.OfficeExpectedCsString(org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_3);
		TERMINALS[10] = new org.emftext.language.office.resource.office.mopp.OfficeExpectedStructuralFeature(org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_4);
		TERMINALS[11] = new org.emftext.language.office.resource.office.mopp.OfficeExpectedCsString(org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_5);
		TERMINALS[12] = new org.emftext.language.office.resource.office.mopp.OfficeExpectedCsString(org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_6);
		TERMINALS[13] = new org.emftext.language.office.resource.office.mopp.OfficeExpectedStructuralFeature(org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_7);
		TERMINALS[14] = new org.emftext.language.office.resource.office.mopp.OfficeExpectedCsString(org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_8_0_0_0);
		TERMINALS[15] = new org.emftext.language.office.resource.office.mopp.OfficeExpectedStructuralFeature(org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_8_0_0_1);
	}
	
	public static void initializeTerminals() {
		initializeTerminals0();
	}
	
	public static void initializeFeatures0() {
		FEATURES[0] = org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel().getEStructuralFeature(org.emftext.language.office.OfficePackage.OFFICE_MODEL__ELEMENTS);
	}
	
	public static void initializeFeatures() {
		initializeFeatures0();
	}
	
	public static void initializeLinks0() {
		LINKS[0] = new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getOffice(), FEATURES[0]);
		LINKS[1] = new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee(), FEATURES[0]);
		LINKS[2] = new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getOffice(), FEATURES[0]);
		LINKS[3] = new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee(), FEATURES[0]);
		LINKS[4] = new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getOffice(), FEATURES[0]);
		LINKS[5] = new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee(), FEATURES[0]);
		LINKS[6] = new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getOffice(), FEATURES[0]);
		LINKS[7] = new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee(), FEATURES[0]);
		LINKS[8] = new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getOffice(), FEATURES[0]);
		LINKS[9] = new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee(), FEATURES[0]);
		LINKS[10] = new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getOffice(), FEATURES[0]);
		LINKS[11] = new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee(), FEATURES[0]);
	}
	
	public static void initializeLinks() {
		initializeLinks0();
	}
	
	public static void wire0() {
		TERMINALS[0].addFollower(TERMINALS[1], EMPTY_LINK_ARRAY);
		TERMINALS[1].addFollower(TERMINALS[2], EMPTY_LINK_ARRAY);
		TERMINALS[2].addFollower(TERMINALS[3], new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[] {new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getOffice(), FEATURES[0]), });
		TERMINALS[2].addFollower(TERMINALS[4], new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[] {new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee(), FEATURES[0]), });
		TERMINALS[2].addFollower(TERMINALS[5], EMPTY_LINK_ARRAY);
		TERMINALS[3].addFollower(TERMINALS[6], EMPTY_LINK_ARRAY);
		TERMINALS[6].addFollower(TERMINALS[3], new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[] {new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getOffice(), FEATURES[0]), });
		TERMINALS[6].addFollower(TERMINALS[4], new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[] {new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee(), FEATURES[0]), });
		TERMINALS[6].addFollower(TERMINALS[5], EMPTY_LINK_ARRAY);
		TERMINALS[4].addFollower(TERMINALS[7], EMPTY_LINK_ARRAY);
		TERMINALS[7].addFollower(TERMINALS[8], EMPTY_LINK_ARRAY);
		TERMINALS[8].addFollower(TERMINALS[9], EMPTY_LINK_ARRAY);
		TERMINALS[9].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[10].addFollower(TERMINALS[11], EMPTY_LINK_ARRAY);
		TERMINALS[11].addFollower(TERMINALS[12], EMPTY_LINK_ARRAY);
		TERMINALS[12].addFollower(TERMINALS[13], EMPTY_LINK_ARRAY);
		TERMINALS[13].addFollower(TERMINALS[14], EMPTY_LINK_ARRAY);
		TERMINALS[13].addFollower(TERMINALS[3], new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[] {new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getOffice(), FEATURES[0]), });
		TERMINALS[13].addFollower(TERMINALS[4], new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[] {new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee(), FEATURES[0]), });
		TERMINALS[13].addFollower(TERMINALS[5], EMPTY_LINK_ARRAY);
		TERMINALS[14].addFollower(TERMINALS[15], EMPTY_LINK_ARRAY);
		TERMINALS[15].addFollower(TERMINALS[14], EMPTY_LINK_ARRAY);
		TERMINALS[15].addFollower(TERMINALS[3], new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[] {new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getOffice(), FEATURES[0]), });
		TERMINALS[15].addFollower(TERMINALS[4], new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[] {new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee(), FEATURES[0]), });
		TERMINALS[15].addFollower(TERMINALS[5], EMPTY_LINK_ARRAY);
	}
	
	public static void wire() {
		wire0();
	}
	
	static {
		// initialize the arrays
		initializeTerminals();
		initializeFeatures();
		initializeLinks();
		// wire the terminals
		wire();
	}
}
