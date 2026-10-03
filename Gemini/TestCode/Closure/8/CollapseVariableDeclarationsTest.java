package com.google.javascript.jscomp;

import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

public class CollapseVariableDeclarationsTest extends CompilerTestCase {

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new CollapseVariableDeclarations(compiler);
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  @Test
  public void testConstructor_normalizedCompiler_throwsIllegalStateException() {
    Compiler compiler = new Compiler();
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);
    try {
      new CollapseVariableDeclarations(compiler);
      Assert.fail("Expected IllegalStateException when compiler is normalized");
    } catch (IllegalStateException e) {
      Assert.assertNotNull(e.getMessage());
    }
  }

  @Test
  public void testProcess_noCollapses_noChange() {
    testSame("var a = 1;");
    testSame("");
    testSame("foo();");
  }

  @Test
  public void testProcess_multipleVarDeclarations_collapsed() {
    test("var a; var b = 1; var c = 2;", "var a, b = 1, c = 2;");
    test("var a = 1; var b = 2; var c = 3;", "var a = 1, b = 2, c = 3;");
    test("var a = 1, b = 2; var c = 3;", "var a = 1, b = 2, c = 3;");
  }

  @Test
  public void testProcess_redeclaredVarInSameScope_collapsedWithSuppression() {
    test("var a = 1; a = 2;", "/** @suppress {duplicate} */ var a = 1, a = 2;");
    test("var a = 1; a = 2; var b = 3;", "/** @suppress {duplicate} */ var a = 1, a = 2, b = 3;");
  }

  @Test
  public void testProcess_assignBeforeVarDeclaration_collapsed() {
    test(
        "var x = 0; function f() { var a = 1; a = 2; var b = 3; }",
        "var x = 0; function f() { /** @suppress {duplicate} */ var a = 1, a = 2, b = 3; }"
    );
  }

  @Test
  public void testProcess_stubVarsBlacklisted_notRedeclared() {
    // Stub vars (var x;) should not allow subsequent assigns (x = 1;) to be folded into redeclarations
    testSame("var x; x = 1;");
    test("var x; var y; x = 1; var z = 2;", "var x, y; x = 1; var z = 2;");
  }

  @Test
  public void testProcess_assignToNonName_notRedeclared() {
    testSame("var obj = {}; obj.prop = 1; var a = 2;");
  }

  @Test
  public void testProcess_assignToOuterScopeVar_notRedeclared() {
    testSame("var a = 1; function f() { a = 2; var b = 3; }");
  }

  @Test
  public void testProcess_assignWithoutVarInChain_notCollapsed() {
    testSame("var a = 1; function f() { a = 2; a = 3; }");
  }

  @Test
  public void testProcess_ifChildren_notCollapsed() {
    testSame("if (true) var a = 1; else var b = 2;");
  }

  @Test
  public void testProcess_nonExprAssignStatement_notCollapsed() {
    testSame("var a = 1; foo(); var b = 2;");
  }

  @Test
  public void testProcess_directApiCall_success() {
    Compiler compiler = new Compiler();
    CollapseVariableDeclarations pass = new CollapseVariableDeclarations(compiler);
    Node externs = new Node(com.google.javascript.rhino.Token.BLOCK);
    Node root = compiler.parseTestCode("var a = 1; var b = 2;");
    pass.process(externs, root);
    Assert.assertEquals(1, root.getChildCount());
    Assert.assertTrue(root.getFirstChild().isVar());
    Assert.assertEquals(2, root.getFirstChild().getChildCount());
  }

  @Test
  public void testProcess_nestedBlocks_collapsedCorrectly() {
    test(
        "function foo() { var a = 1; var b = 2; { var c = 3; var d = 4; } }",
        "function foo() { var a = 1, b = 2; { var c = 3, d = 4; } }"
    );
  }
}
