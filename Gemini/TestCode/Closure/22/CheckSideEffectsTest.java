package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckSideEffectsTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private Node parse(String js) {
    return compiler.parseTestCode(js);
  }

  @Test
  public void testProcess_uselessString_generatesWarning() {
    Node root = parse("var s = 'a'; 'forgot plus';");
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.process(null, root);

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertTrue(compiler.getWarnings()[0].getDescription().contains("Is there a missing '+' on the previous line?"));
  }

  @Test
  public void testProcess_simpleOperatorNotUsed_generatesWarning() {
    Node root = parse("var x = 1; x == 2;");
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.process(null, root);

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertTrue(compiler.getWarnings()[0].getDescription().contains("The result of the 'sheq' operator is not being used.")
        || compiler.getWarnings()[0].getDescription().contains("The result of the 'eq' operator is not being used."));
  }

  @Test
  public void testProcess_sideEffectFreeNode_generatesWarning() {
    Node root = parse("var x = 1; x;");
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.process(null, root);

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertTrue(compiler.getWarnings()[0].getDescription().contains("This code lacks side-effects. Is there a bug?"));
  }

  @Test
  public void testProcess_protectSideEffectFreeCode_replacesNodesAndAddsExtern() {
    Node root = parse("var x = 1; x;");
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, true);
    pass.process(null, root);

    Assert.assertEquals(1, compiler.getWarningCount());
    
    // Check that StripProtection strips it properly
    CheckSideEffects.StripProtection strip = new CheckSideEffects.StripProtection(compiler);
    strip.process(null, root);

    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testHotSwapScript_uselessCode_generatesWarning() {
    Node root = parse("1 + 1;");
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.hotSwapScript(root, root);

    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testVisit_emptyAndCommaNode_noWarning() {
    Node root = parse(";;;");
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.process(null, root);

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_nullParent_handledSafely() {
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    NodeTraversal t = new NodeTraversal(compiler, pass);
    Node node = IR.number(1);
    pass.visit(t, node, null);

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_indirectEvalComma_noWarning() {
    Node root = parse("(0, eval)('var a = 1;');");
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.process(null, root);

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_commaInExprResultOrBlock_handlesAncestors() {
    Node root = parse("(1, 2);");
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.process(null, root);

    // 1 has no side effects and is warned; 2 is lastChild in comma expr inside EXPR_RESULT
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testVisit_commaInsideOtherStructure_ignoredWhenLastChild() {
    Node root = parse("var a = (1, 2);");
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.process(null, root);

    // 1 triggers warning, 2 is inside VAR ancestor (not EXPR_RESULT or BLOCK) so lastChild returns early
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testVisit_nestedComma_handlesAncestorsChain() {
    Node root = parse("(1, (2, 3));");
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.process(null, root);

    // 1 and 2 should trigger warning, 3 is the last child
    Assert.assertEquals(2, compiler.getWarningCount());
  }

  @Test
  public void testVisit_forLoopInitializersAndIncrementors_handled() {
    Node root = parse("for (1; ; 2) {}");
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.process(null, root);

    Assert.assertEquals(2, compiler.getWarningCount());
  }

  @Test
  public void testVisit_jsDocOnQualifiedName_noWarning() {
    Node exprResult = IR.exprResult(IR.name("x"));
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordType(new Node(Token.STAR));
    JSDocInfo info = builder.build(exprResult.getFirstChild());
    exprResult.getFirstChild().setJSDocInfo(info);

    Node block = IR.block(exprResult);
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.process(null, block);

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_exprResultNode_noWarning() {
    Node exprResult = IR.exprResult(IR.call(IR.name("foo")));
    Node block = IR.block(exprResult);
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.process(null, block);

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testStripProtection_removesProtectorFunctionCalls() {
    Node call = IR.call(IR.name(CheckSideEffects.PROTECTOR_FN), IR.number(42));
    Node expr = IR.exprResult(call);
    Node block = IR.block(expr);

    CheckSideEffects.StripProtection strip = new CheckSideEffects.StripProtection(compiler);
    strip.process(null, block);

    Assert.assertEquals(Token.EXPR_RESULT, block.getFirstChild().getType());
    Assert.assertEquals(Token.NUMBER, block.getFirstChild().getFirstChild().getType());
    Assert.assertEquals(42.0, block.getFirstChild().getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void testStripProtection_ignoresOtherCallNodes() {
    Node call = IR.call(IR.name("otherFunction"), IR.number(42));
    Node expr = IR.exprResult(call);
    Node block = IR.block(expr);

    CheckSideEffects.StripProtection strip = new CheckSideEffects.StripProtection(compiler);
    strip.process(null, block);

    Assert.assertEquals(Token.CALL, block.getFirstChild().getFirstChild().getType());
  }
}
