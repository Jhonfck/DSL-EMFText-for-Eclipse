/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.mopp;

/**
 * The OfficeTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class OfficeTokenResolverFactory implements org.emftext.language.office.resource.office.IOfficeTokenResolverFactory {
	
	private java.util.Map<String, org.emftext.language.office.resource.office.IOfficeTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.emftext.language.office.resource.office.IOfficeTokenResolver> featureName2CollectInTokenResolver;
	private static org.emftext.language.office.resource.office.IOfficeTokenResolver defaultResolver = new org.emftext.language.office.resource.office.analysis.OfficeDefaultTokenResolver();
	
	public OfficeTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.emftext.language.office.resource.office.IOfficeTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.emftext.language.office.resource.office.IOfficeTokenResolver>();
		registerTokenResolver("TEXT", new org.emftext.language.office.resource.office.analysis.OfficeTEXTTokenResolver());
	}
	
	public org.emftext.language.office.resource.office.IOfficeTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.emftext.language.office.resource.office.IOfficeTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.emftext.language.office.resource.office.IOfficeTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.emftext.language.office.resource.office.IOfficeTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.emftext.language.office.resource.office.IOfficeTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.emftext.language.office.resource.office.IOfficeTokenResolver internalCreateResolver(java.util.Map<String, org.emftext.language.office.resource.office.IOfficeTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.emftext.language.office.resource.office.IOfficeTokenResolver> resolverMap, String key, org.emftext.language.office.resource.office.IOfficeTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
