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

  private void test(String js, DiagnosticType expectedWarning, boolean protectSideEffects) {
    Node root = compiler.parseTestCode(js);
    Node externs = IR.block();
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, protectSideEffects);
    pass.process(externs, root);

    if (expectedWarning != null) {
      Assert.assertEquals(1, compiler.getWarningCount());
      Assert.assertEquals(expectedWarning.key, compiler.getWarnings()[0].getType().key);
    } else {
      Assert.assertEquals(0, compiler.getWarningCount());
    }
  }

  private void test(String js, DiagnosticType expectedWarning) {
    test(js, expectedWarning, false);
  }

  private void testNoWarning(String js) {
    test(js, null, false);
  }

  @Test
  public void testUselessCode_stringLiteral_warningReported() {
    test("var x = 1; 'some string';", CheckSideEffects.USELESS_CODE_ERROR);
    Assert.assertTrue(compiler.getWarnings()[0].getDescription().contains("missing '+'"));
  }

  @Test
  public void testUselessCode_simpleBinaryOperator_warningReported() {
    test("var x = 1; var y = 2; x + y;", CheckSideEffects.USELESS_CODE_ERROR);
    Assert.assertTrue(compiler.getWarnings()[0].getDescription().contains("add"));
  }

  @Test
  public void testUselessCode_generalExpression_warningReported() {
    test("var x = 1; x;", CheckSideEffects.USELESS_CODE_ERROR);
    Assert.assertTrue(compiler.getWarnings()[0].getDescription().contains("lacks side-effects"));
  }

  @Test
  public void testUselessCode_inForLoopConditionAndIncrement_warningReported() {
    test("for (1; true; 2) { foo(); }", CheckSideEffects.USELESS_CODE_ERROR);
  }

  @Test
  public void testCommaOperator_unusedResult_warningReported() {
    test("(1, 2);", CheckSideEffects.USELESS_CODE_ERROR);
  }

  @Test
  public void testCommaOperator_nestedInExprResult_warningReported() {
    test("(foo(), (1, 2));", CheckSideEffects.USELESS_CODE_ERROR);
  }

  @Test
  public void testValidCode_sideEffectCall_noWarning() {
    testNoWarning("function foo() {} foo();");
  }

  @Test
  public void testValidCode_assignment_noWarning() {
    testNoWarning("var x = 1; x = 2;");
  }

  @Test
  public void testValidCode_emptyStatements_noWarning() {
    testNoWarning(";;");
  }

  @Test
  public void testValidCode_qualifiedNameWithJsDoc_noWarning() {
    Node root = IR.script();
    Node nameNode = IR.name("MyType");
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordConstructor();
    JSDocInfo info = builder.build(nameNode);
    nameNode.setJSDocInfo(info);
    Node expr = IR.exprResult(nameNode);
    root.addChildToBack(expr);

    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.process(IR.block(), root);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_nullParent_handledGracefully() {
    Node node = IR.name("x");
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    NodeTraversal t = new NodeTraversal(compiler, pass);
    pass.visit(t, node, null);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_emptyNode_ignored() {
    Node node = IR.empty();
    Node parent = IR.block(node);
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    NodeTraversal t = new NodeTraversal(compiler, pass);
    pass.visit(t, node, parent);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_commaNode_ignored() {
    Node comma = IR.comma(IR.name("a"), IR.name("b"));
    Node parent = IR.exprResult(comma);
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    NodeTraversal t = new NodeTraversal(compiler, pass);
    pass.visit(t, comma, parent);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_exprResultNode_ignored() {
    Node expr = IR.exprResult(IR.number(1));
    Node parent = IR.block(expr);
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    NodeTraversal t = new NodeTraversal(compiler, pass);
    pass.visit(t, expr, parent);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testHotSwapScript_processesCorrectly() {
    Node root = compiler.parseTestCode("1 + 1;");
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.hotSwapScript(root, null);
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testProtectSideEffects_rewritesAndRestoresTree() {
    String js = "el.offsetWidth;";
    Node root = compiler.parseTestCode(js);
    Node externs = IR.block();
    compiler.getSynthesizedExternsInput().getAstRoot(compiler);

    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, true);
    pass.process(externs, root);
    Assert.assertEquals(1, compiler.getWarningCount());

    Node exprResult = root.getFirstChild();
    Assert.assertEquals(Token.EXPR_RESULT, exprResult.getType());
    Node call = exprResult.getFirstChild();
    Assert.assertEquals(Token.CALL, call.getType());
    Assert.assertEquals(CheckSideEffects.PROTECTOR_FN, call.getFirstChild().getString());

    CheckSideEffects.StripProtection strip = new CheckSideEffects.StripProtection(compiler);
    strip.process(externs, root);

    Assert.assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
    Assert.assertEquals(Token.GETPROP, root.getFirstChild().getFirstChild().getType());
  }

  @Test
  public void testStripProtection_visitNonMatchingCall_doesNotModify() {
    Node call = IR.call(IR.name("otherFunc"), IR.number(1));
    Node exprResult = IR.exprResult(call);
    Node root = IR.block(exprResult);
    CheckSideEffects.StripProtection strip = new CheckSideEffects.StripProtection(compiler);
    strip.process(IR.block(), root);

    Assert.assertEquals(Token.CALL, exprResult.getFirstChild().getType());
    Assert.assertEquals("otherFunc", exprResult.getFirstChild().getFirstChild().getString());
  }

  @Test
  public void testStripProtection_visitNonCallNode_noError() {
    Node number = IR.number(42);
    Node exprResult = IR.exprResult(number);
    CheckSideEffects.StripProtection strip = new CheckSideEffects.StripProtection(compiler);
    NodeTraversal t = new NodeTraversal(compiler, strip);
    strip.visit(t, number, exprResult);
    Assert.assertEquals(Token.NUMBER, exprResult.getFirstChild().getType());
  }
}
