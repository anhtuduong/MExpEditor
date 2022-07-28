/*
 * generated by Xtext 2.27.0
 */
package eu.fbk.se.mathexpeditor.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import eu.fbk.se.mathexpeditor.ide.contentassist.antlr.internal.InternalMExpParser;
import eu.fbk.se.mathexpeditor.services.MExpGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MExpParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MExpGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MExpGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMathExpressionAccess().getAlternatives(), "rule__MathExpression__Alternatives");
			builder.put(grammarAccess.getMathExpressionAccess().getAlternatives_2_0(), "rule__MathExpression__Alternatives_2_0");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getConstDefinitionAccess().getGroup(), "rule__ConstDefinition__Group__0");
			builder.put(grammarAccess.getVarDefinitionAccess().getGroup(), "rule__VarDefinition__Group__0");
			builder.put(grammarAccess.getExpDefinitionAccess().getGroup(), "rule__ExpDefinition__Group__0");
			builder.put(grammarAccess.getMathExpressionAccess().getGroup_0(), "rule__MathExpression__Group_0__0");
			builder.put(grammarAccess.getMathExpressionAccess().getGroup_2(), "rule__MathExpression__Group_2__0");
			builder.put(grammarAccess.getMathExpressionAccess().getGroup_3(), "rule__MathExpression__Group_3__0");
			builder.put(grammarAccess.getModelAccess().getConstDefinitionsAssignment_0(), "rule__Model__ConstDefinitionsAssignment_0");
			builder.put(grammarAccess.getModelAccess().getVarDefinitionsAssignment_1(), "rule__Model__VarDefinitionsAssignment_1");
			builder.put(grammarAccess.getModelAccess().getExpDefinitionsAssignment_2(), "rule__Model__ExpDefinitionsAssignment_2");
			builder.put(grammarAccess.getConstDefinitionAccess().getVarNameAssignment_1(), "rule__ConstDefinition__VarNameAssignment_1");
			builder.put(grammarAccess.getConstDefinitionAccess().getVarValueAssignment_3(), "rule__ConstDefinition__VarValueAssignment_3");
			builder.put(grammarAccess.getVarDefinitionAccess().getVarNameAssignment_1(), "rule__VarDefinition__VarNameAssignment_1");
			builder.put(grammarAccess.getVarDefinitionAccess().getVarValueAssignment_3(), "rule__VarDefinition__VarValueAssignment_3");
			builder.put(grammarAccess.getExpDefinitionAccess().getVarNameAssignment_1(), "rule__ExpDefinition__VarNameAssignment_1");
			builder.put(grammarAccess.getExpDefinitionAccess().getVarValueAssignment_3(), "rule__ExpDefinition__VarValueAssignment_3");
			builder.put(grammarAccess.getMathExpressionAccess().getConstAssignment_0_1(), "rule__MathExpression__ConstAssignment_0_1");
			builder.put(grammarAccess.getMathExpressionAccess().getVarAssignment_1(), "rule__MathExpression__VarAssignment_1");
			builder.put(grammarAccess.getMathExpressionAccess().getVarAssignment_2_0_0(), "rule__MathExpression__VarAssignment_2_0_0");
			builder.put(grammarAccess.getMathExpressionAccess().getConstAssignment_2_0_1(), "rule__MathExpression__ConstAssignment_2_0_1");
			builder.put(grammarAccess.getMathExpressionAccess().getExp1Assignment_2_2(), "rule__MathExpression__Exp1Assignment_2_2");
			builder.put(grammarAccess.getMathExpressionAccess().getExp2Assignment_3_1(), "rule__MathExpression__Exp2Assignment_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MExpGrammarAccess grammarAccess;

	@Override
	protected InternalMExpParser createParser() {
		InternalMExpParser result = new InternalMExpParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MExpGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MExpGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
