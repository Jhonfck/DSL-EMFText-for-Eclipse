/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.mopp;

public class OfficePrinter implements org.emftext.language.office.resource.office.IOfficeTextPrinter {
	
	protected org.emftext.language.office.resource.office.IOfficeTokenResolverFactory tokenResolverFactory = new org.emftext.language.office.resource.office.mopp.OfficeTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private org.emftext.language.office.resource.office.IOfficeTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public OfficePrinter(java.io.OutputStream outputStream, org.emftext.language.office.resource.office.IOfficeTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.emftext.language.office.OfficeModel) {
			print_org_emftext_language_office_OfficeModel((org.emftext.language.office.OfficeModel) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.office.Office) {
			print_org_emftext_language_office_Office((org.emftext.language.office.Office) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.office.Employee) {
			print_org_emftext_language_office_Employee((org.emftext.language.office.Employee) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.emftext.language.office.resource.office.mopp.OfficeReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.emftext.language.office.resource.office.mopp.OfficeReferenceResolverSwitch) new org.emftext.language.office.resource.office.mopp.OfficeMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.emftext.language.office.resource.office.IOfficeTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.emftext.language.office.resource.office.mopp.OfficeProblem(errorMessage, org.emftext.language.office.resource.office.OfficeEProblemType.PRINT_PROBLEM, org.emftext.language.office.resource.office.OfficeEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public org.emftext.language.office.resource.office.IOfficeTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_org_emftext_language_office_OfficeModel(org.emftext.language.office.OfficeModel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.OFFICE_MODEL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.OFFICE_MODEL__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("officemodel");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.OFFICE_MODEL__NAME));
			if (o != null) {
				org.emftext.language.office.resource.office.IOfficeTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.OFFICE_MODEL__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.OFFICE_MODEL__ELEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_office_Office(org.emftext.language.office.Office element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.OFFICE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("office");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.OFFICE__NAME));
			if (o != null) {
				org.emftext.language.office.resource.office.IOfficeTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.OFFICE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_office_Employee(org.emftext.language.office.Employee element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_IN));
		printCountingMap.put("worksIn", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_WITH));
		printCountingMap.put("worksWith", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("employee");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__NAME));
			if (o != null) {
				org.emftext.language.office.resource.office.IOfficeTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("works");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("in");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("worksIn");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_IN));
			if (o != null) {
				org.emftext.language.office.resource.office.IOfficeTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEmployeeWorksInReferenceResolver().deResolve((org.emftext.language.office.Office) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_IN)), element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_IN), element));
				out.print(" ");
			}
			printCountingMap.put("worksIn", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("works");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("with");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("worksWith");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_WITH));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.emftext.language.office.resource.office.IOfficeTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEmployeeWorksWithReferenceResolver().deResolve((org.emftext.language.office.Employee) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_WITH)), element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_WITH), element));
				out.print(" ");
			}
			printCountingMap.put("worksWith", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_office_Employee_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_emftext_language_office_Employee_0(org.emftext.language.office.Employee element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("worksWith");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_WITH));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.emftext.language.office.resource.office.IOfficeTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEmployeeWorksWithReferenceResolver().deResolve((org.emftext.language.office.Employee) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_WITH)), element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_WITH), element));
				out.print(" ");
			}
			printCountingMap.put("worksWith", count - 1);
		}
	}
	
	
}
