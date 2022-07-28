/*
 * generated by Xtext 2.27.0
 */
package eu.fbk.se.mathexpeditor.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MExpGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "eu.fbk.se.mathexpeditor.MExp.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConstDefinitionsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cConstDefinitionsConstDefinitionParserRuleCall_0_0 = (RuleCall)cConstDefinitionsAssignment_0.eContents().get(0);
		private final Assignment cVarDefinitionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVarDefinitionsVarDefinitionParserRuleCall_1_0 = (RuleCall)cVarDefinitionsAssignment_1.eContents().get(0);
		private final Assignment cExpDefinitionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpDefinitionsExpDefinitionParserRuleCall_2_0 = (RuleCall)cExpDefinitionsAssignment_2.eContents().get(0);
		
		//Model:
		//    constDefinitions+=ConstDefinition*
		//    varDefinitions+=VarDefinition*
		//    expDefinitions+=ExpDefinition*
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//constDefinitions+=ConstDefinition*
		//varDefinitions+=VarDefinition*
		//expDefinitions+=ExpDefinition*
		public Group getGroup() { return cGroup; }
		
		//constDefinitions+=ConstDefinition*
		public Assignment getConstDefinitionsAssignment_0() { return cConstDefinitionsAssignment_0; }
		
		//ConstDefinition
		public RuleCall getConstDefinitionsConstDefinitionParserRuleCall_0_0() { return cConstDefinitionsConstDefinitionParserRuleCall_0_0; }
		
		//varDefinitions+=VarDefinition*
		public Assignment getVarDefinitionsAssignment_1() { return cVarDefinitionsAssignment_1; }
		
		//VarDefinition
		public RuleCall getVarDefinitionsVarDefinitionParserRuleCall_1_0() { return cVarDefinitionsVarDefinitionParserRuleCall_1_0; }
		
		//expDefinitions+=ExpDefinition*
		public Assignment getExpDefinitionsAssignment_2() { return cExpDefinitionsAssignment_2; }
		
		//ExpDefinition
		public RuleCall getExpDefinitionsExpDefinitionParserRuleCall_2_0() { return cExpDefinitionsExpDefinitionParserRuleCall_2_0; }
	}
	public class ConstDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "eu.fbk.se.mathexpeditor.MExp.ConstDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConstKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVarNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVarNameIDTerminalRuleCall_1_0 = (RuleCall)cVarNameAssignment_1.eContents().get(0);
		private final RuleCall cCOLONTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cVarValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVarValueINTTerminalRuleCall_3_0 = (RuleCall)cVarValueAssignment_3.eContents().get(0);
		private final RuleCall cSEMICOLONTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//ConstDefinition:
		//    'Const'  varName=ID COLON varValue=INT SEMICOLON
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Const'  varName=ID COLON varValue=INT SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//'Const'
		public Keyword getConstKeyword_0() { return cConstKeyword_0; }
		
		//varName=ID
		public Assignment getVarNameAssignment_1() { return cVarNameAssignment_1; }
		
		//ID
		public RuleCall getVarNameIDTerminalRuleCall_1_0() { return cVarNameIDTerminalRuleCall_1_0; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_2() { return cCOLONTerminalRuleCall_2; }
		
		//varValue=INT
		public Assignment getVarValueAssignment_3() { return cVarValueAssignment_3; }
		
		//INT
		public RuleCall getVarValueINTTerminalRuleCall_3_0() { return cVarValueINTTerminalRuleCall_3_0; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONTerminalRuleCall_4() { return cSEMICOLONTerminalRuleCall_4; }
	}
	public class VarDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "eu.fbk.se.mathexpeditor.MExp.VarDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVarNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVarNameIDTerminalRuleCall_1_0 = (RuleCall)cVarNameAssignment_1.eContents().get(0);
		private final RuleCall cCOLONTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cVarValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVarValueINTTerminalRuleCall_3_0 = (RuleCall)cVarValueAssignment_3.eContents().get(0);
		private final RuleCall cSEMICOLONTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//VarDefinition:
		//    'Var'  varName=ID COLON  varValue=INT SEMICOLON
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Var'  varName=ID COLON  varValue=INT SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//'Var'
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//varName=ID
		public Assignment getVarNameAssignment_1() { return cVarNameAssignment_1; }
		
		//ID
		public RuleCall getVarNameIDTerminalRuleCall_1_0() { return cVarNameIDTerminalRuleCall_1_0; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_2() { return cCOLONTerminalRuleCall_2; }
		
		//varValue=INT
		public Assignment getVarValueAssignment_3() { return cVarValueAssignment_3; }
		
		//INT
		public RuleCall getVarValueINTTerminalRuleCall_3_0() { return cVarValueINTTerminalRuleCall_3_0; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONTerminalRuleCall_4() { return cSEMICOLONTerminalRuleCall_4; }
	}
	public class ExpDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "eu.fbk.se.mathexpeditor.MExp.ExpDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExpKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVarNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVarNameIDTerminalRuleCall_1_0 = (RuleCall)cVarNameAssignment_1.eContents().get(0);
		private final RuleCall cCOLONTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cVarValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVarValueMathExpressionParserRuleCall_3_0 = (RuleCall)cVarValueAssignment_3.eContents().get(0);
		private final RuleCall cSEMICOLONTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//ExpDefinition:
		//    'Exp'  varName=ID COLON varValue=MathExpression  SEMICOLON
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Exp'  varName=ID COLON varValue=MathExpression  SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//'Exp'
		public Keyword getExpKeyword_0() { return cExpKeyword_0; }
		
		//varName=ID
		public Assignment getVarNameAssignment_1() { return cVarNameAssignment_1; }
		
		//ID
		public RuleCall getVarNameIDTerminalRuleCall_1_0() { return cVarNameIDTerminalRuleCall_1_0; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_2() { return cCOLONTerminalRuleCall_2; }
		
		//varValue=MathExpression
		public Assignment getVarValueAssignment_3() { return cVarValueAssignment_3; }
		
		//MathExpression
		public RuleCall getVarValueMathExpressionParserRuleCall_3_0() { return cVarValueMathExpressionParserRuleCall_3_0; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONTerminalRuleCall_4() { return cSEMICOLONTerminalRuleCall_4; }
	}
	public class MathExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "eu.fbk.se.mathexpeditor.MExp.MathExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cMathExpressionAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cConstAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cConstINTTerminalRuleCall_0_1_0 = (RuleCall)cConstAssignment_0_1.eContents().get(0);
		private final Assignment cVarAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cVarIDTerminalRuleCall_1_0 = (RuleCall)cVarAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Alternatives cAlternatives_2_0 = (Alternatives)cGroup_2.eContents().get(0);
		private final Assignment cVarAssignment_2_0_0 = (Assignment)cAlternatives_2_0.eContents().get(0);
		private final RuleCall cVarIDTerminalRuleCall_2_0_0_0 = (RuleCall)cVarAssignment_2_0_0.eContents().get(0);
		private final Assignment cConstAssignment_2_0_1 = (Assignment)cAlternatives_2_0.eContents().get(1);
		private final RuleCall cConstINTTerminalRuleCall_2_0_1_0 = (RuleCall)cConstAssignment_2_0_1.eContents().get(0);
		private final RuleCall cOPERATORTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Assignment cExp1Assignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cExp1MathExpressionParserRuleCall_2_2_0 = (RuleCall)cExp1Assignment_2_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final RuleCall cL_BRACKETTerminalRuleCall_3_0 = (RuleCall)cGroup_3.eContents().get(0);
		private final Assignment cExp2Assignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cExp2MathExpressionParserRuleCall_3_1_0 = (RuleCall)cExp2Assignment_3_1.eContents().get(0);
		private final RuleCall cR_BRACKETTerminalRuleCall_3_2 = (RuleCall)cGroup_3.eContents().get(2);
		
		//MathExpression:
		//    {MathExpression}
		//    const=INT |
		//    var=ID |
		//    (var=ID | const=INT ) OPERATOR exp1=MathExpression |
		//    L_BRACKET exp2=MathExpression R_BRACKET
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{MathExpression}
		//const=INT |
		//var=ID |
		//(var=ID | const=INT ) OPERATOR exp1=MathExpression |
		//L_BRACKET exp2=MathExpression R_BRACKET
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{MathExpression}
		//const=INT
		public Group getGroup_0() { return cGroup_0; }
		
		//{MathExpression}
		public Action getMathExpressionAction_0_0() { return cMathExpressionAction_0_0; }
		
		//const=INT
		public Assignment getConstAssignment_0_1() { return cConstAssignment_0_1; }
		
		//INT
		public RuleCall getConstINTTerminalRuleCall_0_1_0() { return cConstINTTerminalRuleCall_0_1_0; }
		
		//var=ID
		public Assignment getVarAssignment_1() { return cVarAssignment_1; }
		
		//ID
		public RuleCall getVarIDTerminalRuleCall_1_0() { return cVarIDTerminalRuleCall_1_0; }
		
		//(var=ID | const=INT ) OPERATOR exp1=MathExpression
		public Group getGroup_2() { return cGroup_2; }
		
		//(var=ID | const=INT )
		public Alternatives getAlternatives_2_0() { return cAlternatives_2_0; }
		
		//var=ID
		public Assignment getVarAssignment_2_0_0() { return cVarAssignment_2_0_0; }
		
		//ID
		public RuleCall getVarIDTerminalRuleCall_2_0_0_0() { return cVarIDTerminalRuleCall_2_0_0_0; }
		
		//const=INT
		public Assignment getConstAssignment_2_0_1() { return cConstAssignment_2_0_1; }
		
		//INT
		public RuleCall getConstINTTerminalRuleCall_2_0_1_0() { return cConstINTTerminalRuleCall_2_0_1_0; }
		
		//OPERATOR
		public RuleCall getOPERATORTerminalRuleCall_2_1() { return cOPERATORTerminalRuleCall_2_1; }
		
		//exp1=MathExpression
		public Assignment getExp1Assignment_2_2() { return cExp1Assignment_2_2; }
		
		//MathExpression
		public RuleCall getExp1MathExpressionParserRuleCall_2_2_0() { return cExp1MathExpressionParserRuleCall_2_2_0; }
		
		//L_BRACKET exp2=MathExpression R_BRACKET
		public Group getGroup_3() { return cGroup_3; }
		
		//L_BRACKET
		public RuleCall getL_BRACKETTerminalRuleCall_3_0() { return cL_BRACKETTerminalRuleCall_3_0; }
		
		//exp2=MathExpression
		public Assignment getExp2Assignment_3_1() { return cExp2Assignment_3_1; }
		
		//MathExpression
		public RuleCall getExp2MathExpressionParserRuleCall_3_1_0() { return cExp2MathExpressionParserRuleCall_3_1_0; }
		
		//R_BRACKET
		public RuleCall getR_BRACKETTerminalRuleCall_3_2() { return cR_BRACKETTerminalRuleCall_3_2; }
	}
	
	
	private final ModelElements pModel;
	private final ConstDefinitionElements pConstDefinition;
	private final VarDefinitionElements pVarDefinition;
	private final ExpDefinitionElements pExpDefinition;
	private final MathExpressionElements pMathExpression;
	private final TerminalRule tOPERATOR;
	private final TerminalRule tEQUAL;
	private final TerminalRule tASSIGN;
	private final TerminalRule tSEMICOLON;
	private final TerminalRule tCOLON;
	private final TerminalRule tL_BRACKET;
	private final TerminalRule tR_BRACKET;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MExpGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pConstDefinition = new ConstDefinitionElements();
		this.pVarDefinition = new VarDefinitionElements();
		this.pExpDefinition = new ExpDefinitionElements();
		this.pMathExpression = new MathExpressionElements();
		this.tOPERATOR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "eu.fbk.se.mathexpeditor.MExp.OPERATOR");
		this.tEQUAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "eu.fbk.se.mathexpeditor.MExp.EQUAL");
		this.tASSIGN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "eu.fbk.se.mathexpeditor.MExp.ASSIGN");
		this.tSEMICOLON = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "eu.fbk.se.mathexpeditor.MExp.SEMICOLON");
		this.tCOLON = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "eu.fbk.se.mathexpeditor.MExp.COLON");
		this.tL_BRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "eu.fbk.se.mathexpeditor.MExp.L_BRACKET");
		this.tR_BRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "eu.fbk.se.mathexpeditor.MExp.R_BRACKET");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("eu.fbk.se.mathexpeditor.MExp".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    constDefinitions+=ConstDefinition*
	//    varDefinitions+=VarDefinition*
	//    expDefinitions+=ExpDefinition*
	//    ;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//ConstDefinition:
	//    'Const'  varName=ID COLON varValue=INT SEMICOLON
	//;
	public ConstDefinitionElements getConstDefinitionAccess() {
		return pConstDefinition;
	}
	
	public ParserRule getConstDefinitionRule() {
		return getConstDefinitionAccess().getRule();
	}
	
	//VarDefinition:
	//    'Var'  varName=ID COLON  varValue=INT SEMICOLON
	//;
	public VarDefinitionElements getVarDefinitionAccess() {
		return pVarDefinition;
	}
	
	public ParserRule getVarDefinitionRule() {
		return getVarDefinitionAccess().getRule();
	}
	
	//ExpDefinition:
	//    'Exp'  varName=ID COLON varValue=MathExpression  SEMICOLON
	//;
	public ExpDefinitionElements getExpDefinitionAccess() {
		return pExpDefinition;
	}
	
	public ParserRule getExpDefinitionRule() {
		return getExpDefinitionAccess().getRule();
	}
	
	//MathExpression:
	//    {MathExpression}
	//    const=INT |
	//    var=ID |
	//    (var=ID | const=INT ) OPERATOR exp1=MathExpression |
	//    L_BRACKET exp2=MathExpression R_BRACKET
	//;
	public MathExpressionElements getMathExpressionAccess() {
		return pMathExpression;
	}
	
	public ParserRule getMathExpressionRule() {
		return getMathExpressionAccess().getRule();
	}
	
	//terminal OPERATOR :
	//    "+" | "-" | "*"
	//;
	public TerminalRule getOPERATORRule() {
		return tOPERATOR;
	}
	
	//terminal EQUAL :
	//    "="
	//;
	public TerminalRule getEQUALRule() {
		return tEQUAL;
	}
	
	//terminal ASSIGN :
	//    ":="
	//;
	public TerminalRule getASSIGNRule() {
		return tASSIGN;
	}
	
	//terminal SEMICOLON :
	//    ";"
	//;
	public TerminalRule getSEMICOLONRule() {
		return tSEMICOLON;
	}
	
	//terminal COLON :
	//    ":"
	//;
	public TerminalRule getCOLONRule() {
		return tCOLON;
	}
	
	//terminal L_BRACKET :
	//    '('
	//;
	public TerminalRule getL_BRACKETRule() {
		return tL_BRACKET;
	}
	
	//terminal R_BRACKET :
	//    ')'
	//;
	public TerminalRule getR_BRACKETRule() {
		return tR_BRACKET;
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
