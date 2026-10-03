package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

public class UnreachableCodeEliminationTest {

  private Node parseAndProcess(String js, boolean removeNoOp) {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, removeNoOp);
    pass.process(null, root);
    return root;
  }

  private String toSource(String js, boolean removeNoOp) {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, removeNoOp);
    pass.process(null, root);
    return compiler.toSource(root);
  }

  @Test
  public void testProcess_unreachableCodeAfterReturn_isRemoved() {
    String js = "function f() { return; alert('unreachable'); }";
    String result = toSource(js, false);
    Assert.assertFalse(result.contains("alert"));
  }

  @Test
  public void testProcess_unreachableVarDeclaration_isRedeclared() {
    String js = "function f() { return; var x = 1; }";
    String result = toSource(js, false);
    Assert.assertTrue(result.contains("var x"));
    Assert.assertFalse(result.contains("1"));
  }

  @Test
  public void testProcess_removeNoOpStatementsTrue_removesNoOps() {
    String js = "var a = 1; true; 'hello'; 2 + 3; a.b.c;";
    String result = toSource(js, true);
    Assert.assertTrue(result.contains("var a = 1"));
    Assert.assertFalse(result.contains("true"));
    Assert.assertFalse(result.contains("hello"));
    Assert.assertFalse(result.contains("2 + 3"));
    Assert.assertFalse(result.contains("a.b.c"));
  }

  @Test
  public void testProcess_removeNoOpStatementsFalse_keepsNoOps() {
    String js = "var a = 1; true; 'hello'; a.b.c;";
    String result = toSource(js, false);
    Assert.assertTrue(result.contains("true"));
    Assert.assertTrue(result.contains("hello"));
    Assert.assertTrue(result.contains("a.b.c"));
  }

  @Test
  public void testProcess_sideEffectStatements_areRetained() {
    String js = "function f() { var x = 0; x++; foo(); return x; }";
    String result = toSource(js, true);
    Assert.assertTrue(result.contains("foo()"));
    Assert.assertTrue(result.contains("x++"));
  }

  @Test
  public void testProcess_uselessReturnAtEndOfFunction_isRemoved() {
    String js = "function f() { var x = 1; return; }";
    String result = toSource(js, false);
    Assert.assertFalse(result.contains("return"));
  }

  @Test
  public void testProcess_returnWithValue_isNotRemoved() {
    String js = "function f() { return 1; }";
    String result = toSource(js, false);
    Assert.assertTrue(result.contains("return 1"));
  }

  @Test
  public void testProcess_uselessBreak_isRemoved() {
    String js = "switch(x) { case 1: alert(1); break; }";
    String result = toSource(js, false);
    Assert.assertFalse(result.contains("break"));
  }

  @Test
  public void testProcess_uselessContinue_isRemoved() {
    String js = "while(true) { alert(1); continue; }";
    String result = toSource(js, false);
    Assert.assertFalse(result.contains("continue"));
  }

  @Test
  public void testProcess_breakFollowedByFunction_isRemoved() {
    String js = "while(true) { break; function g() {} }";
    String result = toSource(js, false);
    Assert.assertFalse(result.contains("break"));
  }

  @Test
  public void testProcess_unreachableDoWhile_isPreserved() {
    String js = "function f() { return; do { alert(1); } while(true); }";
    String result = toSource(js, false);
    Assert.assertTrue(result.contains("do"));
  }

  @Test
  public void testProcess_unreachableTryCatch_isHandled() {
    String js = "function f() { return; try { alert(1); } catch (e) { alert(2); } }";
    String result = toSource(js, false);
    Assert.assertNotNull(result);
  }

  @Test
  public void testProcess_unreachableEmptyStatement_isHandled() {
    String js = "function f() { return; ; }";
    String result = toSource(js, false);
    Assert.assertNotNull(result);
  }

  @Test
  public void testProcess_unreachableEmptyBlock_isHandled() {
    String js = "function f() { return; {} }";
    String result = toSource(js, false);
    Assert.assertNotNull(result);
  }

  @Test
  public void testProcess_nestedBranchesAndCascadingJumps() {
    String js = "function f(x) { if (x) { return; } else { return; } }";
    String result = toSource(js, false);
    Assert.assertNotNull(result);
  }

  @Test
  public void testProcess_labeledBreak_isRemovedIfUseless() {
    String js = "a: { alert(1); break a; }";
    String result = toSource(js, false);
    Assert.assertFalse(result.contains("break a"));
  }

  @Test
  public void testVisit_nullParent_doesNotThrow() {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode("var x = 1;");
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, false);
    NodeTraversal t = new NodeTraversal(compiler, pass);
    pass.visit(t, root, null);
  }

  @Test
  public void testVisit_functionAndScriptNodes_skipped() {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode("function f() {}");
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, false);
    NodeTraversal t = new NodeTraversal(compiler, pass);

    Node script = root.getFirstChild();
    if (script != null) {
      pass.visit(t, script, root);
      Node functionNode = script.getFirstChild();
      if (functionNode != null) {
        pass.visit(t, functionNode, script);
      }
    }
  }

  @Test
  public void testVisit_nodeNotInCfg_doesNotThrow() {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode("function f() { var x = 1; }");
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, false);
    NodeTraversal t = new NodeTraversal(compiler, pass);

    pass.curCfg = new ControlFlowGraph<Node>(new Node(Token.BLOCK), true, true);
    Node dummyNode = new Node(Token.EXPR_RESULT, Node.newString("dummy"));
    pass.visit(t, dummyNode, root);
  }

  @Test
  public void testProcess_emptyProgram() {
    String js = "";
    String result = toSource(js, true);
    Assert.assertEquals("", result.trim());
  }
}
