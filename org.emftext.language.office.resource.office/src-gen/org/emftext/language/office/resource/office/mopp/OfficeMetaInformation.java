/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.mopp;

public class OfficeMetaInformation implements org.emftext.language.office.resource.office.IOfficeMetaInformation {
	
	public String getSyntaxName() {
		return "office";
	}
	
	public String getURI() {
		return "http://emftext.org/office";
	}
	
	public org.emftext.language.office.resource.office.IOfficeTextScanner createLexer() {
		return new org.emftext.language.office.resource.office.mopp.OfficeAntlrScanner(new org.emftext.language.office.resource.office.mopp.OfficeLexer());
	}
	
	public org.emftext.language.office.resource.office.IOfficeTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.emftext.language.office.resource.office.mopp.OfficeParser().createInstance(inputStream, encoding);
	}
	
	public org.emftext.language.office.resource.office.IOfficeTextPrinter createPrinter(java.io.OutputStream outputStream, org.emftext.language.office.resource.office.IOfficeTextResource resource) {
		return new org.emftext.language.office.resource.office.mopp.OfficePrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.emftext.language.office.resource.office.mopp.OfficeSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.emftext.language.office.resource.office.mopp.OfficeSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.emftext.language.office.resource.office.IOfficeReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.emftext.language.office.resource.office.mopp.OfficeReferenceResolverSwitch();
	}
	
	public org.emftext.language.office.resource.office.IOfficeTokenResolverFactory getTokenResolverFactory() {
		return new org.emftext.language.office.resource.office.mopp.OfficeTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.emftext.language.office/metamodel/office.cs";
	}
	
	public String[] getTokenNames() {
		return org.emftext.language.office.resource.office.mopp.OfficeParser.tokenNames;
	}
	
	public org.emftext.language.office.resource.office.IOfficeTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.emftext.language.office.resource.office.mopp.OfficeTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.emftext.language.office.resource.office.IOfficeBracketPair> getBracketPairs() {
		return new org.emftext.language.office.resource.office.mopp.OfficeBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.emftext.language.office.resource.office.mopp.OfficeFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.emftext.language.office.resource.office.mopp.OfficeResourceFactory();
	}
	
	public org.emftext.language.office.resource.office.mopp.OfficeNewFileContentProvider getNewFileContentProvider() {
		return new org.emftext.language.office.resource.office.mopp.OfficeNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.emftext.language.office.resource.office.mopp.OfficeResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "org.emftext.language.office.resource.office.ui.launchConfigurationType";
	}
	
	public org.emftext.language.office.resource.office.IOfficeNameProvider createNameProvider() {
		return new org.emftext.language.office.resource.office.analysis.OfficeDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		org.emftext.language.office.resource.office.mopp.OfficeAntlrTokenHelper tokenHelper = new org.emftext.language.office.resource.office.mopp.OfficeAntlrTokenHelper();
		java.util.List<String> highlightableTokens = new java.util.ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(org.emftext.language.office.resource.office.mopp.OfficeTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
