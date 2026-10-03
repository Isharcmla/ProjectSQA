package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

public class RemoveConstantExpressionsTest extends CompilerTestCase {

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new RemoveConstantExpressions(compiler);
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  @Test
  public void testProcess_pureConstant_removed() {
    test("1;", "");
    test("'hello';", "");
    test("true;", "");
    test("null;", "");
    test("undefined;", "");
    test("({a: 1});", "");
    test("[1, 2, 3];", "");
  }

  @Test
  public void testProcess_constantBinaryOp_removed() {
    test("1 + 2;", "");
    test("'a' + 'b';", "");
  }

  @Test
  public void testProcess_expressionWithSideEffects_preserved() {
    testSame("foo();");
    testSame("a = 1;");
    testSame("a++;");
    testSame("delete a.b;");
  }

  @Test
  public void testProcess_mixedExpressionWithSideEffects_simplified() {
    test("1 + foo();", "foo();");
    test("foo() + bar();", "foo(); bar();");
    test("1 + foo() + bar();", "foo(); bar();");
    test("1 + (foo(), 2);", "foo();");
    test("[foo(), bar()];", "foo(); bar();");
    test("({a: foo(), b: bar()});", "foo(); bar();");
  }

  @Test
  public void testProcess_emptyBlockAndScript_noChange() {
    test("", "");
    test(";", "");
    test("function f() {}", "function f() {}");
    test("if (true) { 1; }", "if (true) {}");
    test("while (false) { 'unused'; }", "while (false) {}");
  }

  @Test
  public void testProcess_nonExprResultNode_ignored() {
    Compiler compiler = new Compiler();
    RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
    Node root = new Node(Token.BLOCK);
    pass.process(null, root);
    Assert.assertEquals(0, root.getChildCount());
  }

  @Test
  public void testRemoveConstantRValuesCallback_directInstantiation() {
    RemoveConstantExpressions.RemoveConstantRValuesCallback callback =
        new RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Assert.assertNotNull(callback.getResult());
  }

  @Test
  public void testRemoveConstantRValuesCallback_visitNonExprResult() {
    RemoveConstantExpressions.RemoveConstantRValuesCallback callback =
        new RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Node parent = new Node(Token.BLOCK);
    Node child = new Node(Token.EMPTY);
    parent.addChildToBack(child);

    callback.visit(null, child, parent);
    Assert.assertFalse(callback.getResult().changed);
  }

  @Test
  public void testRemoveConstantRValuesCallback_visitExprResultWithNoSideEffects() {
    Compiler compiler = new Compiler();
    RemoveConstantExpressions.RemoveConstantRValuesCallback callback =
        new RemoveConstantExpressions.RemoveConstantRValuesCallback();

    Node parent = new Node(Token.BLOCK);
    Node expr = new Node(Token.EXPR_RESULT, Node.newNumber(42));
    parent.addChildToBack(expr);

    callback.visit(null, expr, parent);
    Assert.assertTrue(callback.getResult().changed);
    Assert.assertEquals(0, parent.getChildCount());

    callback.getResult().notifyCompiler(compiler);
  }

  @Test
  public void testRemoveConstantRValuesCallback_visitExprResultWithSideEffects() {
    Compiler compiler = new Compiler();
    RemoveConstantExpressions.RemoveConstantRValuesCallback callback =
        new RemoveConstantExpressions.RemoveConstantRValuesCallback();

    Node parent = new Node(Token.BLOCK);
    Node call = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    Node expr = new Node(Token.EXPR_RESULT, call);
    parent.addChildToBack(expr);

    callback.visit(null, expr, parent);
    Assert.assertFalse(callback.getResult().changed);
    Assert.assertEquals(1, parent.getChildCount());

    callback.getResult().notifyCompiler(compiler);
  }

  @Test
  public void testProcess_nullExternsAllowed() {
    Compiler compiler = new Compiler();
    RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
    Node root = compiler.parseTestCode("1 + 2; foo();");
    pass.process(null, root);
    Assert.assertEquals(1, root.getChildCount());
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullRootThrowsException() {
    Compiler compiler = new Compiler();
    RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
    pass.process(null, null);
  }
}
