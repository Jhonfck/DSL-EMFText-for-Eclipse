/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.grammar;

public class OfficeGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static OfficeGrammarInformationProvider INSTANCE = new OfficeGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static org.emftext.language.office.resource.office.grammar.OfficeKeyword OFFICE_0_0_0_0 = new org.emftext.language.office.resource.office.grammar.OfficeKeyword("officemodel", org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE);
	public final static org.emftext.language.office.resource.office.grammar.OfficePlaceholder OFFICE_0_0_0_1 = new org.emftext.language.office.resource.office.grammar.OfficePlaceholder(org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel().getEStructuralFeature(org.emftext.language.office.OfficePackage.OFFICE_MODEL__NAME), "TEXT", org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE, 0);
	public final static org.emftext.language.office.resource.office.grammar.OfficeKeyword OFFICE_0_0_0_2 = new org.emftext.language.office.resource.office.grammar.OfficeKeyword("{", org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE);
	public final static org.emftext.language.office.resource.office.grammar.OfficeContainment OFFICE_0_0_0_3 = new org.emftext.language.office.resource.office.grammar.OfficeContainment(org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel().getEStructuralFeature(org.emftext.language.office.OfficePackage.OFFICE_MODEL__ELEMENTS), org.emftext.language.office.resource.office.grammar.OfficeCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeElement(), }, 0);
	public final static org.emftext.language.office.resource.office.grammar.OfficeKeyword OFFICE_0_0_0_4 = new org.emftext.language.office.resource.office.grammar.OfficeKeyword("}", org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE);
	public final static org.emftext.language.office.resource.office.grammar.OfficeSequence OFFICE_0_0_0 = new org.emftext.language.office.resource.office.grammar.OfficeSequence(org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE, OFFICE_0_0_0_0, OFFICE_0_0_0_1, OFFICE_0_0_0_2, OFFICE_0_0_0_3, OFFICE_0_0_0_4);
	public final static org.emftext.language.office.resource.office.grammar.OfficeChoice OFFICE_0_0 = new org.emftext.language.office.resource.office.grammar.OfficeChoice(org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE, OFFICE_0_0_0);
	public final static org.emftext.language.office.resource.office.grammar.OfficeRule OFFICE_0 = new org.emftext.language.office.resource.office.grammar.OfficeRule(org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel(), OFFICE_0_0, org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE);
	public final static org.emftext.language.office.resource.office.grammar.OfficeKeyword OFFICE_1_0_0_0 = new org.emftext.language.office.resource.office.grammar.OfficeKeyword("office", org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE);
	public final static org.emftext.language.office.resource.office.grammar.OfficePlaceholder OFFICE_1_0_0_1 = new org.emftext.language.office.resource.office.grammar.OfficePlaceholder(org.emftext.language.office.OfficePackage.eINSTANCE.getOffice().getEStructuralFeature(org.emftext.language.office.OfficePackage.OFFICE__NAME), "TEXT", org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE, 0);
	public final static org.emftext.language.office.resource.office.grammar.OfficeSequence OFFICE_1_0_0 = new org.emftext.language.office.resource.office.grammar.OfficeSequence(org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE, OFFICE_1_0_0_0, OFFICE_1_0_0_1);
	public final static org.emftext.language.office.resource.office.grammar.OfficeChoice OFFICE_1_0 = new org.emftext.language.office.resource.office.grammar.OfficeChoice(org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE, OFFICE_1_0_0);
	public final static org.emftext.language.office.resource.office.grammar.OfficeRule OFFICE_1 = new org.emftext.language.office.resource.office.grammar.OfficeRule(org.emftext.language.office.OfficePackage.eINSTANCE.getOffice(), OFFICE_1_0, org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE);
	public final static org.emftext.language.office.resource.office.grammar.OfficeKeyword OFFICE_2_0_0_0 = new org.emftext.language.office.resource.office.grammar.OfficeKeyword("employee", org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE);
	public final static org.emftext.language.office.resource.office.grammar.OfficePlaceholder OFFICE_2_0_0_1 = new org.emftext.language.office.resource.office.grammar.OfficePlaceholder(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__NAME), "TEXT", org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE, 0);
	public final static org.emftext.language.office.resource.office.grammar.OfficeKeyword OFFICE_2_0_0_2 = new org.emftext.language.office.resource.office.grammar.OfficeKeyword("works", org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE);
	public final static org.emftext.language.office.resource.office.grammar.OfficeKeyword OFFICE_2_0_0_3 = new org.emftext.language.office.resource.office.grammar.OfficeKeyword("in", org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE);
	public final static org.emftext.language.office.resource.office.grammar.OfficePlaceholder OFFICE_2_0_0_4 = new org.emftext.language.office.resource.office.grammar.OfficePlaceholder(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_IN), "TEXT", org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE, 0);
	public final static org.emftext.language.office.resource.office.grammar.OfficeKeyword OFFICE_2_0_0_5 = new org.emftext.language.office.resource.office.grammar.OfficeKeyword("works", org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE);
	public final static org.emftext.language.office.resource.office.grammar.OfficeKeyword OFFICE_2_0_0_6 = new org.emftext.language.office.resource.office.grammar.OfficeKeyword("with", org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE);
	public final static org.emftext.language.office.resource.office.grammar.OfficePlaceholder OFFICE_2_0_0_7 = new org.emftext.language.office.resource.office.grammar.OfficePlaceholder(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_WITH), "TEXT", org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE, 0);
	public final static org.emftext.language.office.resource.office.grammar.OfficeKeyword OFFICE_2_0_0_8_0_0_0 = new org.emftext.language.office.resource.office.grammar.OfficeKeyword(",", org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE);
	public final static org.emftext.language.office.resource.office.grammar.OfficePlaceholder OFFICE_2_0_0_8_0_0_1 = new org.emftext.language.office.resource.office.grammar.OfficePlaceholder(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_WITH), "TEXT", org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE, 0);
	public final static org.emftext.language.office.resource.office.grammar.OfficeSequence OFFICE_2_0_0_8_0_0 = new org.emftext.language.office.resource.office.grammar.OfficeSequence(org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE, OFFICE_2_0_0_8_0_0_0, OFFICE_2_0_0_8_0_0_1);
	public final static org.emftext.language.office.resource.office.grammar.OfficeChoice OFFICE_2_0_0_8_0 = new org.emftext.language.office.resource.office.grammar.OfficeChoice(org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE, OFFICE_2_0_0_8_0_0);
	public final static org.emftext.language.office.resource.office.grammar.OfficeCompound OFFICE_2_0_0_8 = new org.emftext.language.office.resource.office.grammar.OfficeCompound(OFFICE_2_0_0_8_0, org.emftext.language.office.resource.office.grammar.OfficeCardinality.STAR);
	public final static org.emftext.language.office.resource.office.grammar.OfficeSequence OFFICE_2_0_0 = new org.emftext.language.office.resource.office.grammar.OfficeSequence(org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE, OFFICE_2_0_0_0, OFFICE_2_0_0_1, OFFICE_2_0_0_2, OFFICE_2_0_0_3, OFFICE_2_0_0_4, OFFICE_2_0_0_5, OFFICE_2_0_0_6, OFFICE_2_0_0_7, OFFICE_2_0_0_8);
	public final static org.emftext.language.office.resource.office.grammar.OfficeChoice OFFICE_2_0 = new org.emftext.language.office.resource.office.grammar.OfficeChoice(org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE, OFFICE_2_0_0);
	public final static org.emftext.language.office.resource.office.grammar.OfficeRule OFFICE_2 = new org.emftext.language.office.resource.office.grammar.OfficeRule(org.emftext.language.office.OfficePackage.eINSTANCE.getEmployee(), OFFICE_2_0, org.emftext.language.office.resource.office.grammar.OfficeCardinality.ONE);
	
	public static String getSyntaxElementID(org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.class.getFields()) {
			Object fieldValue;
			try {
				fieldValue = field.get(null);
				if (fieldValue == syntaxElement) {
					String id = field.getName();
					return id;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	public static org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement) org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static org.emftext.language.office.resource.office.grammar.OfficeRule[] RULES = new org.emftext.language.office.resource.office.grammar.OfficeRule[] {
		OFFICE_0,
		OFFICE_1,
		OFFICE_2,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (org.emftext.language.office.resource.office.grammar.OfficeRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof org.emftext.language.office.resource.office.grammar.OfficeKeyword) {
			keywords.add(((org.emftext.language.office.resource.office.grammar.OfficeKeyword) element).getValue());
		} else if (element instanceof org.emftext.language.office.resource.office.grammar.OfficeBooleanTerminal) {
			keywords.add(((org.emftext.language.office.resource.office.grammar.OfficeBooleanTerminal) element).getTrueLiteral());
			keywords.add(((org.emftext.language.office.resource.office.grammar.OfficeBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof org.emftext.language.office.resource.office.grammar.OfficeEnumerationTerminal) {
			org.emftext.language.office.resource.office.grammar.OfficeEnumerationTerminal terminal = (org.emftext.language.office.resource.office.grammar.OfficeEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (org.emftext.language.office.resource.office.grammar.OfficeSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
