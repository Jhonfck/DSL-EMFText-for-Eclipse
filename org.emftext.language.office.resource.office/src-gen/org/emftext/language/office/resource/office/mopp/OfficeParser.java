// $ANTLR 3.4

	package org.emftext.language.office.resource.office.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class OfficeParser extends OfficeANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "FLOAT", "INTEGER", "LINEBREAK", "TEXT", "WHITESPACE", "','", "'employee'", "'in'", "'office'", "'officemodel'", "'with'", "'works'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int COMMENT=4;
    public static final int FLOAT=5;
    public static final int INTEGER=6;
    public static final int LINEBREAK=7;
    public static final int TEXT=8;
    public static final int WHITESPACE=9;

    // delegates
    public OfficeANTLRParserBase[] getDelegates() {
        return new OfficeANTLRParserBase[] {};
    }

    // delegators


    public OfficeParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public OfficeParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(8 + 1);
         

    }

    public String[] getTokenNames() { return OfficeParser.tokenNames; }
    public String getGrammarFileName() { return "Office.g"; }


    	private org.emftext.language.office.resource.office.IOfficeTokenResolverFactory tokenResolverFactory = new org.emftext.language.office.resource.office.mopp.OfficeTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	/**
    	 * A flag that indicates whether the parser should remember all expected elements.
    	 * This flag is set to true when using the parse for code completion. Otherwise it
    	 * is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private java.util.List<org.emftext.language.office.resource.office.mopp.OfficeExpectedTerminal> expectedElements = new java.util.ArrayList<org.emftext.language.office.resource.office.mopp.OfficeExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	java.util.List<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private int tokenIndexOfLastCompleteElement;
    	
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	/**
    	 * The offset indicating the cursor position when the parser is used for code
    	 * completion by calling parseToExpectedElements().
    	 */
    	private int cursorOffset;
    	
    	/**
    	 * The offset of the first hidden token of the last expected element. This offset
    	 * is used to discard expected elements, which are not needed for code completion.
    	 */
    	private int lastStartIncludingHidden;
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new org.emftext.language.office.resource.office.IOfficeCommand<org.emftext.language.office.resource.office.IOfficeTextResource>() {
    			public boolean execute(org.emftext.language.office.resource.office.IOfficeTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new org.emftext.language.office.resource.office.IOfficeProblem() {
    					public org.emftext.language.office.resource.office.OfficeEProblemSeverity getSeverity() {
    						return org.emftext.language.office.resource.office.OfficeEProblemSeverity.ERROR;
    					}
    					public org.emftext.language.office.resource.office.OfficeEProblemType getType() {
    						return org.emftext.language.office.resource.office.OfficeEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<org.emftext.language.office.resource.office.IOfficeQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(org.eclipse.emf.ecore.EClass eClass, int[] ids) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		int terminalID = ids[0];
    		int followSetID = ids[1];
    		org.emftext.language.office.resource.office.IOfficeExpectedElement terminal = org.emftext.language.office.resource.office.grammar.OfficeFollowSetProvider.TERMINALS[terminalID];
    		org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[] containmentFeatures = new org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = org.emftext.language.office.resource.office.grammar.OfficeFollowSetProvider.LINKS[ids[i]];
    		}
    		org.emftext.language.office.resource.office.grammar.OfficeContainmentTrace containmentTrace = new org.emftext.language.office.resource.office.grammar.OfficeContainmentTrace(eClass, containmentFeatures);
    		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    		org.emftext.language.office.resource.office.mopp.OfficeExpectedTerminal expectedElement = new org.emftext.language.office.resource.office.mopp.OfficeExpectedTerminal(container, terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
    			// clear list of expected elements
    			this.expectedElements.clear();
    			this.expectedElementsIndexOfLastCompleteElement = 0;
    		}
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.emftext.language.office.resource.office.IOfficeCommand<org.emftext.language.office.resource.office.IOfficeTextResource>() {
    			public boolean execute(org.emftext.language.office.resource.office.IOfficeTextResource resource) {
    				org.emftext.language.office.resource.office.IOfficeLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_4_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.emftext.language.office.resource.office.IOfficeCommand<org.emftext.language.office.resource.office.IOfficeTextResource>() {
    			public boolean execute(org.emftext.language.office.resource.office.IOfficeTextResource resource) {
    				org.emftext.language.office.resource.office.IOfficeLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				if (source == null) {
    					return true;
    				}
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Sets the end character index and the last line for the given object in the
    	 * location map.
    	 */
    	protected void setLocalizationEnd(java.util.Collection<org.emftext.language.office.resource.office.IOfficeCommand<org.emftext.language.office.resource.office.IOfficeTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.emftext.language.office.resource.office.IOfficeCommand<org.emftext.language.office.resource.office.IOfficeTextResource>() {
    			public boolean execute(org.emftext.language.office.resource.office.IOfficeTextResource resource) {
    				org.emftext.language.office.resource.office.IOfficeLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public org.emftext.language.office.resource.office.IOfficeTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new OfficeParser(new org.antlr.runtime3_4_0.CommonTokenStream(new OfficeLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new OfficeParser(new org.antlr.runtime3_4_0.CommonTokenStream(new OfficeLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			new org.emftext.language.office.resource.office.util.OfficeRuntimeUtil().logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public OfficeParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((OfficeLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((OfficeLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == org.emftext.language.office.OfficeModel.class) {
    				return parse_org_emftext_language_office_OfficeModel();
    			}
    			if (type.getInstanceClass() == org.emftext.language.office.Office.class) {
    				return parse_org_emftext_language_office_Office();
    			}
    			if (type.getInstanceClass() == org.emftext.language.office.Employee.class) {
    				return parse_org_emftext_language_office_Employee();
    			}
    		}
    		throw new org.emftext.language.office.resource.office.mopp.OfficeUnexpectedContentTypeException(typeObject);
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_4_0.IntStream arg0, org.antlr.runtime3_4_0.RecognitionException arg1, int arg2, org.antlr.runtime3_4_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected Object getTypeObject() {
    		Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(org.emftext.language.office.resource.office.IOfficeOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public org.emftext.language.office.resource.office.IOfficeParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<org.emftext.language.office.resource.office.IOfficeCommand<org.emftext.language.office.resource.office.IOfficeTextResource>>();
    		org.emftext.language.office.resource.office.mopp.OfficeParseResult parseResult = new org.emftext.language.office.resource.office.mopp.OfficeParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime3_4_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_4_0.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<org.emftext.language.office.resource.office.mopp.OfficeExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.emftext.language.office.resource.office.IOfficeTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
    		org.emftext.language.office.resource.office.IOfficeParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_4_0.Lexer lexer = (org.antlr.runtime3_4_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContentsInternal().add(root);
    			}
    			for (org.emftext.language.office.resource.office.IOfficeCommand<org.emftext.language.office.resource.office.IOfficeTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<org.emftext.language.office.resource.office.mopp.OfficeExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.emftext.language.office.resource.office.mopp.OfficeExpectedTerminal>();
    		java.util.List<org.emftext.language.office.resource.office.mopp.OfficeExpectedTerminal> newFollowSet = new java.util.ArrayList<org.emftext.language.office.resource.office.mopp.OfficeExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			org.emftext.language.office.resource.office.mopp.OfficeExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 19;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_4_0.CommonToken nextToken = (org.antlr.runtime3_4_0.CommonToken) tokenStream.get(i);
    			if (nextToken.getType() < 0) {
    				break;
    			}
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (org.emftext.language.office.resource.office.mopp.OfficeExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (org.emftext.language.office.resource.office.mopp.OfficeExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<org.emftext.language.office.resource.office.util.OfficePair<org.emftext.language.office.resource.office.IOfficeExpectedElement, org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (org.emftext.language.office.resource.office.util.OfficePair<org.emftext.language.office.resource.office.IOfficeExpectedElement, org.emftext.language.office.resource.office.mopp.OfficeContainedFeature[]> newFollowerPair : newFollowers) {
    							org.emftext.language.office.resource.office.IOfficeExpectedElement newFollower = newFollowerPair.getLeft();
    							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    							org.emftext.language.office.resource.office.grammar.OfficeContainmentTrace containmentTrace = new org.emftext.language.office.resource.office.grammar.OfficeContainmentTrace(null, newFollowerPair.getRight());
    							org.emftext.language.office.resource.office.mopp.OfficeExpectedTerminal newFollowTerminal = new org.emftext.language.office.resource.office.mopp.OfficeExpectedTerminal(container, newFollower, followSetID, containmentTrace);
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements
    		// that were added during the last iteration of the loop
    		for (org.emftext.language.office.resource.office.mopp.OfficeExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(org.emftext.language.office.resource.office.mopp.OfficeExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime3_4_0.CommonToken tokenAtIndex = (org.antlr.runtime3_4_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_4_0.IntStream input, int ttype, org.antlr.runtime3_4_0.BitSet follow) throws org.antlr.runtime3_4_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_4_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_4_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parser is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_4_0.CommonToken) {
    			final org.antlr.runtime3_4_0.CommonToken ct = (org.antlr.runtime3_4_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			org.antlr.runtime3_4_0.EarlyExitException eee = (org.antlr.runtime3_4_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedRangeException) {
    			org.antlr.runtime3_4_0.MismatchedRangeException mre = (org.antlr.runtime3_4_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	private void startIncompleteElement(Object object) {
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.incompleteObjects.add((org.eclipse.emf.ecore.EObject) object);
    		}
    	}
    	
    	private void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			boolean exists = this.incompleteObjects.remove(object);
    			if (!exists) {
    			}
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	
    	private org.eclipse.emf.ecore.EObject getLastIncompleteElement() {
    		if (incompleteObjects.isEmpty()) {
    			return null;
    		}
    		return incompleteObjects.get(incompleteObjects.size() - 1);
    	}
    	



    // $ANTLR start "start"
    // Office.g:505:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_emftext_language_office_OfficeModel ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        org.emftext.language.office.OfficeModel c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Office.g:506:2: ( (c0= parse_org_emftext_language_office_OfficeModel ) EOF )
            // Office.g:507:2: (c0= parse_org_emftext_language_office_OfficeModel ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Office.g:512:2: (c0= parse_org_emftext_language_office_OfficeModel )
            // Office.g:513:3: c0= parse_org_emftext_language_office_OfficeModel
            {
            pushFollow(FOLLOW_parse_org_emftext_language_office_OfficeModel_in_start82);
            c0=parse_org_emftext_language_office_OfficeModel();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; }

            }


            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		retrieveLayoutInformation(element, null, null, false);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "start"



    // $ANTLR start "parse_org_emftext_language_office_OfficeModel"
    // Office.g:521:1: parse_org_emftext_language_office_OfficeModel returns [org.emftext.language.office.OfficeModel element = null] : a0= 'officemodel' (a1= TEXT ) a2= '{' ( (a3_0= parse_org_emftext_language_office_OfficeElement ) )* a4= '}' ;
    public final org.emftext.language.office.OfficeModel parse_org_emftext_language_office_OfficeModel() throws RecognitionException {
        org.emftext.language.office.OfficeModel element =  null;

        int parse_org_emftext_language_office_OfficeModel_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        org.emftext.language.office.OfficeElement a3_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Office.g:524:2: (a0= 'officemodel' (a1= TEXT ) a2= '{' ( (a3_0= parse_org_emftext_language_office_OfficeElement ) )* a4= '}' )
            // Office.g:525:2: a0= 'officemodel' (a1= TEXT ) a2= '{' ( (a3_0= parse_org_emftext_language_office_OfficeElement ) )* a4= '}'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_org_emftext_language_office_OfficeModel115); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.office.OfficeFactory.eINSTANCE.createOfficeModel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_0_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[1]);
            	}

            // Office.g:539:2: (a1= TEXT )
            // Office.g:540:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_office_OfficeModel133); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.office.resource.office.mopp.OfficeTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.office.OfficeFactory.eINSTANCE.createOfficeModel();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.emftext.language.office.resource.office.IOfficeTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.office.resource.office.IOfficeTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.OFFICE_MODEL__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.OFFICE_MODEL__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_0_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[2]);
            	}

            a2=(Token)match(input,17,FOLLOW_17_in_parse_org_emftext_language_office_OfficeModel154); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.office.OfficeFactory.eINSTANCE.createOfficeModel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_0_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel(), org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[3]);
            		addExpectedElement(org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel(), org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[4]);
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[5]);
            	}

            // Office.g:591:2: ( (a3_0= parse_org_emftext_language_office_OfficeElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Office.g:592:3: (a3_0= parse_org_emftext_language_office_OfficeElement )
            	    {
            	    // Office.g:592:3: (a3_0= parse_org_emftext_language_office_OfficeElement )
            	    // Office.g:593:4: a3_0= parse_org_emftext_language_office_OfficeElement
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_office_OfficeElement_in_parse_org_emftext_language_office_OfficeModel177);
            	    a3_0=parse_org_emftext_language_office_OfficeElement();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.emftext.language.office.resource.office.mopp.OfficeTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.emftext.language.office.OfficeFactory.eINSTANCE.createOfficeModel();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a3_0 != null) {
            	    					if (a3_0 != null) {
            	    						Object value = a3_0;
            	    						addObjectToList(element, org.emftext.language.office.OfficePackage.OFFICE_MODEL__ELEMENTS, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_0_0_0_3, a3_0, true);
            	    					copyLocalizationInfos(a3_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel(), org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[6]);
            		addExpectedElement(org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel(), org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[7]);
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[8]);
            	}

            a4=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_office_OfficeModel203); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.office.OfficeFactory.eINSTANCE.createOfficeModel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_0_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_org_emftext_language_office_OfficeModel_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_office_OfficeModel"



    // $ANTLR start "parse_org_emftext_language_office_Office"
    // Office.g:636:1: parse_org_emftext_language_office_Office returns [org.emftext.language.office.Office element = null] : a0= 'office' (a1= TEXT ) ;
    public final org.emftext.language.office.Office parse_org_emftext_language_office_Office() throws RecognitionException {
        org.emftext.language.office.Office element =  null;

        int parse_org_emftext_language_office_Office_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Office.g:639:2: (a0= 'office' (a1= TEXT ) )
            // Office.g:640:2: a0= 'office' (a1= TEXT )
            {
            a0=(Token)match(input,13,FOLLOW_13_in_parse_org_emftext_language_office_Office232); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.office.OfficeFactory.eINSTANCE.createOffice();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_1_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[9]);
            	}

            // Office.g:654:2: (a1= TEXT )
            // Office.g:655:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_office_Office250); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.office.resource.office.mopp.OfficeTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.office.OfficeFactory.eINSTANCE.createOffice();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.emftext.language.office.resource.office.IOfficeTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.office.resource.office.IOfficeTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.OFFICE__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.OFFICE__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_1_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel(), org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[10]);
            		addExpectedElement(org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel(), org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[11]);
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[12]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_emftext_language_office_Office_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_office_Office"



    // $ANTLR start "parse_org_emftext_language_office_Employee"
    // Office.g:694:1: parse_org_emftext_language_office_Employee returns [org.emftext.language.office.Employee element = null] : a0= 'employee' (a1= TEXT ) a2= 'works' a3= 'in' (a4= TEXT ) a5= 'works' a6= 'with' (a7= TEXT ) ( (a8= ',' (a9= TEXT ) ) )* ;
    public final org.emftext.language.office.Employee parse_org_emftext_language_office_Employee() throws RecognitionException {
        org.emftext.language.office.Employee element =  null;

        int parse_org_emftext_language_office_Employee_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Office.g:697:2: (a0= 'employee' (a1= TEXT ) a2= 'works' a3= 'in' (a4= TEXT ) a5= 'works' a6= 'with' (a7= TEXT ) ( (a8= ',' (a9= TEXT ) ) )* )
            // Office.g:698:2: a0= 'employee' (a1= TEXT ) a2= 'works' a3= 'in' (a4= TEXT ) a5= 'works' a6= 'with' (a7= TEXT ) ( (a8= ',' (a9= TEXT ) ) )*
            {
            a0=(Token)match(input,11,FOLLOW_11_in_parse_org_emftext_language_office_Employee286); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.office.OfficeFactory.eINSTANCE.createEmployee();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[13]);
            	}

            // Office.g:712:2: (a1= TEXT )
            // Office.g:713:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_office_Employee304); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.office.resource.office.mopp.OfficeTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.office.OfficeFactory.eINSTANCE.createEmployee();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.emftext.language.office.resource.office.IOfficeTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.office.resource.office.IOfficeTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[14]);
            	}

            a2=(Token)match(input,16,FOLLOW_16_in_parse_org_emftext_language_office_Employee325); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.office.OfficeFactory.eINSTANCE.createEmployee();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[15]);
            	}

            a3=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_office_Employee339); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.office.OfficeFactory.eINSTANCE.createEmployee();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[16]);
            	}

            // Office.g:776:2: (a4= TEXT )
            // Office.g:777:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_office_Employee357); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.office.resource.office.mopp.OfficeTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.office.OfficeFactory.eINSTANCE.createEmployee();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				org.emftext.language.office.resource.office.IOfficeTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.office.resource.office.IOfficeTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_IN), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.emftext.language.office.Office proxy = org.emftext.language.office.OfficeFactory.eINSTANCE.createOffice();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.office.resource.office.mopp.OfficeContextDependentURIFragmentFactory<org.emftext.language.office.Employee, org.emftext.language.office.Office>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEmployeeWorksInReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_IN), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_IN), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_4, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[17]);
            	}

            a5=(Token)match(input,16,FOLLOW_16_in_parse_org_emftext_language_office_Employee378); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.office.OfficeFactory.eINSTANCE.createEmployee();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[18]);
            	}

            a6=(Token)match(input,15,FOLLOW_15_in_parse_org_emftext_language_office_Employee392); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.office.OfficeFactory.eINSTANCE.createEmployee();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[19]);
            	}

            // Office.g:844:2: (a7= TEXT )
            // Office.g:845:3: a7= TEXT
            {
            a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_office_Employee410); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.office.resource.office.mopp.OfficeTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.office.OfficeFactory.eINSTANCE.createEmployee();
            				startIncompleteElement(element);
            			}
            			if (a7 != null) {
            				org.emftext.language.office.resource.office.IOfficeTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.office.resource.office.IOfficeTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_WITH), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.emftext.language.office.Employee proxy = org.emftext.language.office.OfficeFactory.eINSTANCE.createEmployee();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.office.resource.office.mopp.OfficeContextDependentURIFragmentFactory<org.emftext.language.office.Employee, org.emftext.language.office.Employee>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEmployeeWorksWithReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_WITH), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					addObjectToList(element, org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_WITH, value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_7, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[20]);
            		addExpectedElement(org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel(), org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[21]);
            		addExpectedElement(org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel(), org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[22]);
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[23]);
            	}

            // Office.g:887:2: ( (a8= ',' (a9= TEXT ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==10) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Office.g:888:3: (a8= ',' (a9= TEXT ) )
            	    {
            	    // Office.g:888:3: (a8= ',' (a9= TEXT ) )
            	    // Office.g:889:4: a8= ',' (a9= TEXT )
            	    {
            	    a8=(Token)match(input,10,FOLLOW_10_in_parse_org_emftext_language_office_Employee440); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = org.emftext.language.office.OfficeFactory.eINSTANCE.createEmployee();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_8_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[24]);
            	    			}

            	    // Office.g:903:4: (a9= TEXT )
            	    // Office.g:904:5: a9= TEXT
            	    {
            	    a9=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_office_Employee466); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.office.resource.office.mopp.OfficeTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.office.OfficeFactory.eINSTANCE.createEmployee();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a9 != null) {
            	    						org.emftext.language.office.resource.office.IOfficeTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            	    						tokenResolver.setOptions(getOptions());
            	    						org.emftext.language.office.resource.office.IOfficeTokenResolveResult result = getFreshTokenResolveResult();
            	    						tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_WITH), result);
            	    						Object resolvedObject = result.getResolvedToken();
            	    						if (resolvedObject == null) {
            	    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStopIndex());
            	    						}
            	    						String resolved = (String) resolvedObject;
            	    						org.emftext.language.office.Employee proxy = org.emftext.language.office.OfficeFactory.eINSTANCE.createEmployee();
            	    						collectHiddenTokens(element);
            	    						registerContextDependentProxy(new org.emftext.language.office.resource.office.mopp.OfficeContextDependentURIFragmentFactory<org.emftext.language.office.Employee, org.emftext.language.office.Employee>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEmployeeWorksWithReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_WITH), resolved, proxy);
            	    						if (proxy != null) {
            	    							Object value = proxy;
            	    							addObjectToList(element, org.emftext.language.office.OfficePackage.EMPLOYEE__WORKS_WITH, value);
            	    							completedElement(value, false);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.office.resource.office.grammar.OfficeGrammarInformationProvider.OFFICE_2_0_0_8_0_0_1, proxy, true);
            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a9, element);
            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a9, proxy);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[25]);
            	    				addExpectedElement(org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel(), org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[26]);
            	    				addExpectedElement(org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel(), org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[27]);
            	    				addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[28]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[29]);
            		addExpectedElement(org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel(), org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[30]);
            		addExpectedElement(org.emftext.language.office.OfficePackage.eINSTANCE.getOfficeModel(), org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[31]);
            		addExpectedElement(null, org.emftext.language.office.resource.office.mopp.OfficeExpectationConstants.EXPECTATIONS[32]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_emftext_language_office_Employee_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_office_Employee"



    // $ANTLR start "parse_org_emftext_language_office_OfficeElement"
    // Office.g:958:1: parse_org_emftext_language_office_OfficeElement returns [org.emftext.language.office.OfficeElement element = null] : (c0= parse_org_emftext_language_office_Office |c1= parse_org_emftext_language_office_Employee );
    public final org.emftext.language.office.OfficeElement parse_org_emftext_language_office_OfficeElement() throws RecognitionException {
        org.emftext.language.office.OfficeElement element =  null;

        int parse_org_emftext_language_office_OfficeElement_StartIndex = input.index();

        org.emftext.language.office.Office c0 =null;

        org.emftext.language.office.Employee c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Office.g:959:2: (c0= parse_org_emftext_language_office_Office |c1= parse_org_emftext_language_office_Employee )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // Office.g:960:2: c0= parse_org_emftext_language_office_Office
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_office_Office_in_parse_org_emftext_language_office_OfficeElement523);
                    c0=parse_org_emftext_language_office_Office();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Office.g:961:4: c1= parse_org_emftext_language_office_Employee
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_office_Employee_in_parse_org_emftext_language_office_OfficeElement533);
                    c1=parse_org_emftext_language_office_Employee();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_emftext_language_office_OfficeElement_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_office_OfficeElement"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_org_emftext_language_office_OfficeModel_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_org_emftext_language_office_OfficeModel115 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_office_OfficeModel133 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_emftext_language_office_OfficeModel154 = new BitSet(new long[]{0x0000000000042800L});
    public static final BitSet FOLLOW_parse_org_emftext_language_office_OfficeElement_in_parse_org_emftext_language_office_OfficeModel177 = new BitSet(new long[]{0x0000000000042800L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_office_OfficeModel203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_parse_org_emftext_language_office_Office232 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_office_Office250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_parse_org_emftext_language_office_Employee286 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_office_Employee304 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_org_emftext_language_office_Employee325 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_office_Employee339 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_office_Employee357 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_org_emftext_language_office_Employee378 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_org_emftext_language_office_Employee392 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_office_Employee410 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_parse_org_emftext_language_office_Employee440 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_office_Employee466 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_parse_org_emftext_language_office_Office_in_parse_org_emftext_language_office_OfficeElement523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_office_Employee_in_parse_org_emftext_language_office_OfficeElement533 = new BitSet(new long[]{0x0000000000000002L});

}