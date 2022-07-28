package eu.fbk.se.mathexpeditor.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.fbk.se.mathexpeditor.services.MExpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMExpParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_COLON", "RULE_INT", "RULE_SEMICOLON", "RULE_OPERATOR", "RULE_L_BRACKET", "RULE_R_BRACKET", "RULE_EQUAL", "RULE_ASSIGN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Const'", "'Var'", "'Exp'"
    };
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int RULE_L_BRACKET=9;
    public static final int EOF=-1;
    public static final int RULE_OPERATOR=8;
    public static final int RULE_ID=4;
    public static final int RULE_EQUAL=11;
    public static final int RULE_WS=16;
    public static final int RULE_COLON=5;
    public static final int RULE_ASSIGN=12;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=14;
    public static final int RULE_SEMICOLON=7;
    public static final int RULE_R_BRACKET=10;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalMExpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMExpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMExpParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMExp.g"; }



     	private MExpGrammarAccess grammarAccess;

        public InternalMExpParser(TokenStream input, MExpGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MExpGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMExp.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMExp.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMExp.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMExp.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_constDefinitions_0_0= ruleConstDefinition ) )* ( (lv_varDefinitions_1_0= ruleVarDefinition ) )* ( (lv_expDefinitions_2_0= ruleExpDefinition ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_constDefinitions_0_0 = null;

        EObject lv_varDefinitions_1_0 = null;

        EObject lv_expDefinitions_2_0 = null;



        	enterRule();

        try {
            // InternalMExp.g:77:2: ( ( ( (lv_constDefinitions_0_0= ruleConstDefinition ) )* ( (lv_varDefinitions_1_0= ruleVarDefinition ) )* ( (lv_expDefinitions_2_0= ruleExpDefinition ) )* ) )
            // InternalMExp.g:78:2: ( ( (lv_constDefinitions_0_0= ruleConstDefinition ) )* ( (lv_varDefinitions_1_0= ruleVarDefinition ) )* ( (lv_expDefinitions_2_0= ruleExpDefinition ) )* )
            {
            // InternalMExp.g:78:2: ( ( (lv_constDefinitions_0_0= ruleConstDefinition ) )* ( (lv_varDefinitions_1_0= ruleVarDefinition ) )* ( (lv_expDefinitions_2_0= ruleExpDefinition ) )* )
            // InternalMExp.g:79:3: ( (lv_constDefinitions_0_0= ruleConstDefinition ) )* ( (lv_varDefinitions_1_0= ruleVarDefinition ) )* ( (lv_expDefinitions_2_0= ruleExpDefinition ) )*
            {
            // InternalMExp.g:79:3: ( (lv_constDefinitions_0_0= ruleConstDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMExp.g:80:4: (lv_constDefinitions_0_0= ruleConstDefinition )
            	    {
            	    // InternalMExp.g:80:4: (lv_constDefinitions_0_0= ruleConstDefinition )
            	    // InternalMExp.g:81:5: lv_constDefinitions_0_0= ruleConstDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getConstDefinitionsConstDefinitionParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_constDefinitions_0_0=ruleConstDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constDefinitions",
            	    						lv_constDefinitions_0_0,
            	    						"eu.fbk.se.mathexpeditor.MExp.ConstDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMExp.g:98:3: ( (lv_varDefinitions_1_0= ruleVarDefinition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMExp.g:99:4: (lv_varDefinitions_1_0= ruleVarDefinition )
            	    {
            	    // InternalMExp.g:99:4: (lv_varDefinitions_1_0= ruleVarDefinition )
            	    // InternalMExp.g:100:5: lv_varDefinitions_1_0= ruleVarDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getVarDefinitionsVarDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_varDefinitions_1_0=ruleVarDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"varDefinitions",
            	    						lv_varDefinitions_1_0,
            	    						"eu.fbk.se.mathexpeditor.MExp.VarDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMExp.g:117:3: ( (lv_expDefinitions_2_0= ruleExpDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMExp.g:118:4: (lv_expDefinitions_2_0= ruleExpDefinition )
            	    {
            	    // InternalMExp.g:118:4: (lv_expDefinitions_2_0= ruleExpDefinition )
            	    // InternalMExp.g:119:5: lv_expDefinitions_2_0= ruleExpDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getExpDefinitionsExpDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_expDefinitions_2_0=ruleExpDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"expDefinitions",
            	    						lv_expDefinitions_2_0,
            	    						"eu.fbk.se.mathexpeditor.MExp.ExpDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleConstDefinition"
    // InternalMExp.g:140:1: entryRuleConstDefinition returns [EObject current=null] : iv_ruleConstDefinition= ruleConstDefinition EOF ;
    public final EObject entryRuleConstDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstDefinition = null;


        try {
            // InternalMExp.g:140:56: (iv_ruleConstDefinition= ruleConstDefinition EOF )
            // InternalMExp.g:141:2: iv_ruleConstDefinition= ruleConstDefinition EOF
            {
             newCompositeNode(grammarAccess.getConstDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstDefinition=ruleConstDefinition();

            state._fsp--;

             current =iv_ruleConstDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstDefinition"


    // $ANTLR start "ruleConstDefinition"
    // InternalMExp.g:147:1: ruleConstDefinition returns [EObject current=null] : (otherlv_0= 'Const' ( (lv_varName_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (lv_varValue_3_0= RULE_INT ) ) this_SEMICOLON_4= RULE_SEMICOLON ) ;
    public final EObject ruleConstDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token this_COLON_2=null;
        Token lv_varValue_3_0=null;
        Token this_SEMICOLON_4=null;


        	enterRule();

        try {
            // InternalMExp.g:153:2: ( (otherlv_0= 'Const' ( (lv_varName_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (lv_varValue_3_0= RULE_INT ) ) this_SEMICOLON_4= RULE_SEMICOLON ) )
            // InternalMExp.g:154:2: (otherlv_0= 'Const' ( (lv_varName_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (lv_varValue_3_0= RULE_INT ) ) this_SEMICOLON_4= RULE_SEMICOLON )
            {
            // InternalMExp.g:154:2: (otherlv_0= 'Const' ( (lv_varName_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (lv_varValue_3_0= RULE_INT ) ) this_SEMICOLON_4= RULE_SEMICOLON )
            // InternalMExp.g:155:3: otherlv_0= 'Const' ( (lv_varName_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (lv_varValue_3_0= RULE_INT ) ) this_SEMICOLON_4= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConstDefinitionAccess().getConstKeyword_0());
            		
            // InternalMExp.g:159:3: ( (lv_varName_1_0= RULE_ID ) )
            // InternalMExp.g:160:4: (lv_varName_1_0= RULE_ID )
            {
            // InternalMExp.g:160:4: (lv_varName_1_0= RULE_ID )
            // InternalMExp.g:161:5: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_varName_1_0, grammarAccess.getConstDefinitionAccess().getVarNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_8); 

            			newLeafNode(this_COLON_2, grammarAccess.getConstDefinitionAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalMExp.g:181:3: ( (lv_varValue_3_0= RULE_INT ) )
            // InternalMExp.g:182:4: (lv_varValue_3_0= RULE_INT )
            {
            // InternalMExp.g:182:4: (lv_varValue_3_0= RULE_INT )
            // InternalMExp.g:183:5: lv_varValue_3_0= RULE_INT
            {
            lv_varValue_3_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_varValue_3_0, grammarAccess.getConstDefinitionAccess().getVarValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varValue",
            						lv_varValue_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getConstDefinitionAccess().getSEMICOLONTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstDefinition"


    // $ANTLR start "entryRuleVarDefinition"
    // InternalMExp.g:207:1: entryRuleVarDefinition returns [EObject current=null] : iv_ruleVarDefinition= ruleVarDefinition EOF ;
    public final EObject entryRuleVarDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDefinition = null;


        try {
            // InternalMExp.g:207:54: (iv_ruleVarDefinition= ruleVarDefinition EOF )
            // InternalMExp.g:208:2: iv_ruleVarDefinition= ruleVarDefinition EOF
            {
             newCompositeNode(grammarAccess.getVarDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDefinition=ruleVarDefinition();

            state._fsp--;

             current =iv_ruleVarDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDefinition"


    // $ANTLR start "ruleVarDefinition"
    // InternalMExp.g:214:1: ruleVarDefinition returns [EObject current=null] : (otherlv_0= 'Var' ( (lv_varName_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (lv_varValue_3_0= RULE_INT ) ) this_SEMICOLON_4= RULE_SEMICOLON ) ;
    public final EObject ruleVarDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token this_COLON_2=null;
        Token lv_varValue_3_0=null;
        Token this_SEMICOLON_4=null;


        	enterRule();

        try {
            // InternalMExp.g:220:2: ( (otherlv_0= 'Var' ( (lv_varName_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (lv_varValue_3_0= RULE_INT ) ) this_SEMICOLON_4= RULE_SEMICOLON ) )
            // InternalMExp.g:221:2: (otherlv_0= 'Var' ( (lv_varName_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (lv_varValue_3_0= RULE_INT ) ) this_SEMICOLON_4= RULE_SEMICOLON )
            {
            // InternalMExp.g:221:2: (otherlv_0= 'Var' ( (lv_varName_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (lv_varValue_3_0= RULE_INT ) ) this_SEMICOLON_4= RULE_SEMICOLON )
            // InternalMExp.g:222:3: otherlv_0= 'Var' ( (lv_varName_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (lv_varValue_3_0= RULE_INT ) ) this_SEMICOLON_4= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getVarDefinitionAccess().getVarKeyword_0());
            		
            // InternalMExp.g:226:3: ( (lv_varName_1_0= RULE_ID ) )
            // InternalMExp.g:227:4: (lv_varName_1_0= RULE_ID )
            {
            // InternalMExp.g:227:4: (lv_varName_1_0= RULE_ID )
            // InternalMExp.g:228:5: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_varName_1_0, grammarAccess.getVarDefinitionAccess().getVarNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_8); 

            			newLeafNode(this_COLON_2, grammarAccess.getVarDefinitionAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalMExp.g:248:3: ( (lv_varValue_3_0= RULE_INT ) )
            // InternalMExp.g:249:4: (lv_varValue_3_0= RULE_INT )
            {
            // InternalMExp.g:249:4: (lv_varValue_3_0= RULE_INT )
            // InternalMExp.g:250:5: lv_varValue_3_0= RULE_INT
            {
            lv_varValue_3_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_varValue_3_0, grammarAccess.getVarDefinitionAccess().getVarValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varValue",
            						lv_varValue_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getVarDefinitionAccess().getSEMICOLONTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDefinition"


    // $ANTLR start "entryRuleExpDefinition"
    // InternalMExp.g:274:1: entryRuleExpDefinition returns [EObject current=null] : iv_ruleExpDefinition= ruleExpDefinition EOF ;
    public final EObject entryRuleExpDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpDefinition = null;


        try {
            // InternalMExp.g:274:54: (iv_ruleExpDefinition= ruleExpDefinition EOF )
            // InternalMExp.g:275:2: iv_ruleExpDefinition= ruleExpDefinition EOF
            {
             newCompositeNode(grammarAccess.getExpDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpDefinition=ruleExpDefinition();

            state._fsp--;

             current =iv_ruleExpDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpDefinition"


    // $ANTLR start "ruleExpDefinition"
    // InternalMExp.g:281:1: ruleExpDefinition returns [EObject current=null] : (otherlv_0= 'Exp' ( (lv_varName_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (lv_varValue_3_0= ruleMathExpression ) ) this_SEMICOLON_4= RULE_SEMICOLON ) ;
    public final EObject ruleExpDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token this_COLON_2=null;
        Token this_SEMICOLON_4=null;
        EObject lv_varValue_3_0 = null;



        	enterRule();

        try {
            // InternalMExp.g:287:2: ( (otherlv_0= 'Exp' ( (lv_varName_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (lv_varValue_3_0= ruleMathExpression ) ) this_SEMICOLON_4= RULE_SEMICOLON ) )
            // InternalMExp.g:288:2: (otherlv_0= 'Exp' ( (lv_varName_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (lv_varValue_3_0= ruleMathExpression ) ) this_SEMICOLON_4= RULE_SEMICOLON )
            {
            // InternalMExp.g:288:2: (otherlv_0= 'Exp' ( (lv_varName_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (lv_varValue_3_0= ruleMathExpression ) ) this_SEMICOLON_4= RULE_SEMICOLON )
            // InternalMExp.g:289:3: otherlv_0= 'Exp' ( (lv_varName_1_0= RULE_ID ) ) this_COLON_2= RULE_COLON ( (lv_varValue_3_0= ruleMathExpression ) ) this_SEMICOLON_4= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExpDefinitionAccess().getExpKeyword_0());
            		
            // InternalMExp.g:293:3: ( (lv_varName_1_0= RULE_ID ) )
            // InternalMExp.g:294:4: (lv_varName_1_0= RULE_ID )
            {
            // InternalMExp.g:294:4: (lv_varName_1_0= RULE_ID )
            // InternalMExp.g:295:5: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_varName_1_0, grammarAccess.getExpDefinitionAccess().getVarNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_10); 

            			newLeafNode(this_COLON_2, grammarAccess.getExpDefinitionAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalMExp.g:315:3: ( (lv_varValue_3_0= ruleMathExpression ) )
            // InternalMExp.g:316:4: (lv_varValue_3_0= ruleMathExpression )
            {
            // InternalMExp.g:316:4: (lv_varValue_3_0= ruleMathExpression )
            // InternalMExp.g:317:5: lv_varValue_3_0= ruleMathExpression
            {

            					newCompositeNode(grammarAccess.getExpDefinitionAccess().getVarValueMathExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_varValue_3_0=ruleMathExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpDefinitionRule());
            					}
            					set(
            						current,
            						"varValue",
            						lv_varValue_3_0,
            						"eu.fbk.se.mathexpeditor.MExp.MathExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getExpDefinitionAccess().getSEMICOLONTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpDefinition"


    // $ANTLR start "entryRuleMathExpression"
    // InternalMExp.g:342:1: entryRuleMathExpression returns [EObject current=null] : iv_ruleMathExpression= ruleMathExpression EOF ;
    public final EObject entryRuleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExpression = null;


        try {
            // InternalMExp.g:342:55: (iv_ruleMathExpression= ruleMathExpression EOF )
            // InternalMExp.g:343:2: iv_ruleMathExpression= ruleMathExpression EOF
            {
             newCompositeNode(grammarAccess.getMathExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExpression=ruleMathExpression();

            state._fsp--;

             current =iv_ruleMathExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathExpression"


    // $ANTLR start "ruleMathExpression"
    // InternalMExp.g:349:1: ruleMathExpression returns [EObject current=null] : ( ( () ( (lv_const_1_0= RULE_INT ) ) ) | ( (lv_var_2_0= RULE_ID ) ) | ( ( ( (lv_var_3_0= RULE_ID ) ) | ( (lv_const_4_0= RULE_INT ) ) ) this_OPERATOR_5= RULE_OPERATOR ( (lv_exp1_6_0= ruleMathExpression ) ) ) | (this_L_BRACKET_7= RULE_L_BRACKET ( (lv_exp2_8_0= ruleMathExpression ) ) this_R_BRACKET_9= RULE_R_BRACKET ) ) ;
    public final EObject ruleMathExpression() throws RecognitionException {
        EObject current = null;

        Token lv_const_1_0=null;
        Token lv_var_2_0=null;
        Token lv_var_3_0=null;
        Token lv_const_4_0=null;
        Token this_OPERATOR_5=null;
        Token this_L_BRACKET_7=null;
        Token this_R_BRACKET_9=null;
        EObject lv_exp1_6_0 = null;

        EObject lv_exp2_8_0 = null;



        	enterRule();

        try {
            // InternalMExp.g:355:2: ( ( ( () ( (lv_const_1_0= RULE_INT ) ) ) | ( (lv_var_2_0= RULE_ID ) ) | ( ( ( (lv_var_3_0= RULE_ID ) ) | ( (lv_const_4_0= RULE_INT ) ) ) this_OPERATOR_5= RULE_OPERATOR ( (lv_exp1_6_0= ruleMathExpression ) ) ) | (this_L_BRACKET_7= RULE_L_BRACKET ( (lv_exp2_8_0= ruleMathExpression ) ) this_R_BRACKET_9= RULE_R_BRACKET ) ) )
            // InternalMExp.g:356:2: ( ( () ( (lv_const_1_0= RULE_INT ) ) ) | ( (lv_var_2_0= RULE_ID ) ) | ( ( ( (lv_var_3_0= RULE_ID ) ) | ( (lv_const_4_0= RULE_INT ) ) ) this_OPERATOR_5= RULE_OPERATOR ( (lv_exp1_6_0= ruleMathExpression ) ) ) | (this_L_BRACKET_7= RULE_L_BRACKET ( (lv_exp2_8_0= ruleMathExpression ) ) this_R_BRACKET_9= RULE_R_BRACKET ) )
            {
            // InternalMExp.g:356:2: ( ( () ( (lv_const_1_0= RULE_INT ) ) ) | ( (lv_var_2_0= RULE_ID ) ) | ( ( ( (lv_var_3_0= RULE_ID ) ) | ( (lv_const_4_0= RULE_INT ) ) ) this_OPERATOR_5= RULE_OPERATOR ( (lv_exp1_6_0= ruleMathExpression ) ) ) | (this_L_BRACKET_7= RULE_L_BRACKET ( (lv_exp2_8_0= ruleMathExpression ) ) this_R_BRACKET_9= RULE_R_BRACKET ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_OPERATOR) ) {
                    alt5=3;
                }
                else if ( (LA5_1==EOF||LA5_1==RULE_SEMICOLON||LA5_1==RULE_R_BRACKET) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==EOF||LA5_2==RULE_SEMICOLON||LA5_2==RULE_R_BRACKET) ) {
                    alt5=2;
                }
                else if ( (LA5_2==RULE_OPERATOR) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_L_BRACKET:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMExp.g:357:3: ( () ( (lv_const_1_0= RULE_INT ) ) )
                    {
                    // InternalMExp.g:357:3: ( () ( (lv_const_1_0= RULE_INT ) ) )
                    // InternalMExp.g:358:4: () ( (lv_const_1_0= RULE_INT ) )
                    {
                    // InternalMExp.g:358:4: ()
                    // InternalMExp.g:359:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMathExpressionAccess().getMathExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMExp.g:365:4: ( (lv_const_1_0= RULE_INT ) )
                    // InternalMExp.g:366:5: (lv_const_1_0= RULE_INT )
                    {
                    // InternalMExp.g:366:5: (lv_const_1_0= RULE_INT )
                    // InternalMExp.g:367:6: lv_const_1_0= RULE_INT
                    {
                    lv_const_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_const_1_0, grammarAccess.getMathExpressionAccess().getConstINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMathExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"const",
                    							lv_const_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMExp.g:385:3: ( (lv_var_2_0= RULE_ID ) )
                    {
                    // InternalMExp.g:385:3: ( (lv_var_2_0= RULE_ID ) )
                    // InternalMExp.g:386:4: (lv_var_2_0= RULE_ID )
                    {
                    // InternalMExp.g:386:4: (lv_var_2_0= RULE_ID )
                    // InternalMExp.g:387:5: lv_var_2_0= RULE_ID
                    {
                    lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_var_2_0, grammarAccess.getMathExpressionAccess().getVarIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMathExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"var",
                    						lv_var_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMExp.g:404:3: ( ( ( (lv_var_3_0= RULE_ID ) ) | ( (lv_const_4_0= RULE_INT ) ) ) this_OPERATOR_5= RULE_OPERATOR ( (lv_exp1_6_0= ruleMathExpression ) ) )
                    {
                    // InternalMExp.g:404:3: ( ( ( (lv_var_3_0= RULE_ID ) ) | ( (lv_const_4_0= RULE_INT ) ) ) this_OPERATOR_5= RULE_OPERATOR ( (lv_exp1_6_0= ruleMathExpression ) ) )
                    // InternalMExp.g:405:4: ( ( (lv_var_3_0= RULE_ID ) ) | ( (lv_const_4_0= RULE_INT ) ) ) this_OPERATOR_5= RULE_OPERATOR ( (lv_exp1_6_0= ruleMathExpression ) )
                    {
                    // InternalMExp.g:405:4: ( ( (lv_var_3_0= RULE_ID ) ) | ( (lv_const_4_0= RULE_INT ) ) )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==RULE_INT) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalMExp.g:406:5: ( (lv_var_3_0= RULE_ID ) )
                            {
                            // InternalMExp.g:406:5: ( (lv_var_3_0= RULE_ID ) )
                            // InternalMExp.g:407:6: (lv_var_3_0= RULE_ID )
                            {
                            // InternalMExp.g:407:6: (lv_var_3_0= RULE_ID )
                            // InternalMExp.g:408:7: lv_var_3_0= RULE_ID
                            {
                            lv_var_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                            							newLeafNode(lv_var_3_0, grammarAccess.getMathExpressionAccess().getVarIDTerminalRuleCall_2_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMathExpressionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"var",
                            								lv_var_3_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMExp.g:425:5: ( (lv_const_4_0= RULE_INT ) )
                            {
                            // InternalMExp.g:425:5: ( (lv_const_4_0= RULE_INT ) )
                            // InternalMExp.g:426:6: (lv_const_4_0= RULE_INT )
                            {
                            // InternalMExp.g:426:6: (lv_const_4_0= RULE_INT )
                            // InternalMExp.g:427:7: lv_const_4_0= RULE_INT
                            {
                            lv_const_4_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                            							newLeafNode(lv_const_4_0, grammarAccess.getMathExpressionAccess().getConstINTTerminalRuleCall_2_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMathExpressionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"const",
                            								lv_const_4_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    this_OPERATOR_5=(Token)match(input,RULE_OPERATOR,FOLLOW_10); 

                    				newLeafNode(this_OPERATOR_5, grammarAccess.getMathExpressionAccess().getOPERATORTerminalRuleCall_2_1());
                    			
                    // InternalMExp.g:448:4: ( (lv_exp1_6_0= ruleMathExpression ) )
                    // InternalMExp.g:449:5: (lv_exp1_6_0= ruleMathExpression )
                    {
                    // InternalMExp.g:449:5: (lv_exp1_6_0= ruleMathExpression )
                    // InternalMExp.g:450:6: lv_exp1_6_0= ruleMathExpression
                    {

                    						newCompositeNode(grammarAccess.getMathExpressionAccess().getExp1MathExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp1_6_0=ruleMathExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMathExpressionRule());
                    						}
                    						set(
                    							current,
                    							"exp1",
                    							lv_exp1_6_0,
                    							"eu.fbk.se.mathexpeditor.MExp.MathExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMExp.g:469:3: (this_L_BRACKET_7= RULE_L_BRACKET ( (lv_exp2_8_0= ruleMathExpression ) ) this_R_BRACKET_9= RULE_R_BRACKET )
                    {
                    // InternalMExp.g:469:3: (this_L_BRACKET_7= RULE_L_BRACKET ( (lv_exp2_8_0= ruleMathExpression ) ) this_R_BRACKET_9= RULE_R_BRACKET )
                    // InternalMExp.g:470:4: this_L_BRACKET_7= RULE_L_BRACKET ( (lv_exp2_8_0= ruleMathExpression ) ) this_R_BRACKET_9= RULE_R_BRACKET
                    {
                    this_L_BRACKET_7=(Token)match(input,RULE_L_BRACKET,FOLLOW_10); 

                    				newLeafNode(this_L_BRACKET_7, grammarAccess.getMathExpressionAccess().getL_BRACKETTerminalRuleCall_3_0());
                    			
                    // InternalMExp.g:474:4: ( (lv_exp2_8_0= ruleMathExpression ) )
                    // InternalMExp.g:475:5: (lv_exp2_8_0= ruleMathExpression )
                    {
                    // InternalMExp.g:475:5: (lv_exp2_8_0= ruleMathExpression )
                    // InternalMExp.g:476:6: lv_exp2_8_0= ruleMathExpression
                    {

                    						newCompositeNode(grammarAccess.getMathExpressionAccess().getExp2MathExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_exp2_8_0=ruleMathExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMathExpressionRule());
                    						}
                    						set(
                    							current,
                    							"exp2",
                    							lv_exp2_8_0,
                    							"eu.fbk.se.mathexpeditor.MExp.MathExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_R_BRACKET_9=(Token)match(input,RULE_R_BRACKET,FOLLOW_2); 

                    				newLeafNode(this_R_BRACKET_9, grammarAccess.getMathExpressionAccess().getR_BRACKETTerminalRuleCall_3_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000250L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000400L});

}