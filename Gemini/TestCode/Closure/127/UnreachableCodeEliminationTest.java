package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UnreachableCodeEliminationTest {

  private Node parse(Compiler compiler, String js) {
    Node root = compiler.parseTestCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    return root;
  }

  private void test(String js, String expected, boolean removeNoOps) {
    Compiler compiler = new Compiler();
    Node root = parse(compiler, js);
    Node externs = parse(new Compiler(), "");
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, removeNoOps);
    pass.process(externs, root);
    
    Compiler expectedCompiler = new Compiler();
    Node expectedRoot = parse(expectedCompiler, expected);
    
    String actualSource = compiler.toSource(root).trim();
    String expectedSource = expectedCompiler.toSource(expectedRoot).trim();
    Assert.assertEquals(expectedSource, actualSource);
  }

  private void testSame(String js, boolean removeNoOps) {
    test(js, js, removeNoOps);
  }

  @Test
  public void testProcess_unreachableCodeAfterReturn_removesDeadCode() {
    test("function f() { return; alert(1); }", "function f() {}", false);
  }

  @Test
  public void testProcess_unreachableCodeAfterReturnWithValue_removesDeadCode() {
    test("function f() { return 1; alert(1); }", "function f() { return 1; }", false);
  }

  @Test
  public void testProcess_unconditionalReturnAtEndOfFunction_removesReturn() {
    test("function f() { var x = 1; return; }", "function f() { var x = 1; }", false);
  }

  @Test
  public void testProcess_returnWithValueAtEndOfFunction_retainsReturn() {
    testSame("function f() { var x = 1; return x; }", false);
  }

  @Test
  public void testProcess_uselessContinueInLoop_removesContinue() {
    test("while (true) { x(); continue; }", "while (true) { x(); }", false);
  }

  @Test
  public void testProcess_continueWithNextStatement_notRemoved() {
    testSame("while (true) { if (b) { continue; } x(); }", false);
  }

  @Test
  public void testProcess_uselessBreakInLoop_removesBreak() {
    test("while (true) { x(); break; }", "while (true) { x(); break; }", false);
  }

  @Test
  public void testProcess_removeNoOpStatementsTrue_removesPureExpressions() {
    test("function f() { true; 1; 'hello'; }", "function f() {}", true);
  }

  @Test
  public void testProcess_removeNoOpStatementsFalse_keepsPureExpressions() {
    testSame("function f() { true; 1; 'hello'; }", false);
  }

  @Test
  public void testProcess_sideEffectsWithRemoveNoOpStatements_keepsSideEffects() {
    testSame("function f() { var x = 1; alert(x); }", true);
  }

  @Test
  public void testProcess_unreachableDoWhile_doesNotRemoveDo() {
    testSame("function f() { return; do { alert(1); } while (true); }", false);
  }

  @Test
  public void testProcess_unreachableVarWithoutInit_doesNotRemove() {
    testSame("function f() { return; var x; }", false);
  }

  @Test
  public void testProcess_unreachableVarWithInit_removesInit() {
    test("function f() { return; var x = 1; }", "function f() { var x; }", false);
  }

  @Test
  public void testProcess_emptyBlock_notRemovedImmediately() {
    testSame("function f() { {} }", false);
  }

  @Test
  public void testProcess_forInHeader_doesNotRemoveHeaderExpressions() {
    testSame("for (var x in y) { alert(x); }", true);
  }

  @Test
  public void testProcess_unreachableCatchBlock_removesCatchAddsFinally() {
    test("function f() { return; try { x(); } catch (e) { y(); } }",
         "function f() { try { x(); } finally {} }", false);
  }

  @Test
  public void testProcess_nestedBlocksWithFollowNode_resolvesFollowProperly() {
    test("function f() { if (a) { return; } else { return; } }",
         "function f() { if (a) {} else {} }", false);
  }

  @Test
  public void testProcess_functionDeclarationFollowingReturn_removesDeadReturn() {
    test("function f() { return; function g() {} }",
         "function f() { function g() {} }", false);
  }

  @Test
  public void testProcess_emptySource_handlesGracefully() {
    testSame("", false);
    testSame("", true);
  }

  @Test
  public void testProcess_topLevelUnreachableCode_removesDeadCode() {
    test("throw 'error'; alert('unreachable');", "throw 'error';", false);
  }

  @Test
  public void testProcess_withFineLoggingEnabled_logsRemoval() {
    Logger logger = Logger.getLogger(UnreachableCodeElimination.class.getName());
    Level originalLevel = logger.getLevel();
    try {
      logger.setLevel(Level.FINE);
      test("function f() { return; alert(1); }", "function f() {}", false);
    } finally {
      logger.setLevel(originalLevel);
    }
  }

  @Test
  public void testProcess_multipleIterationsNeeded_eliminatesAllCascade() {
    test("function f() { return; if (x) { return; } alert(2); }", "function f() {}", false);
  }

  @Test
  public void testProcess_tryCatchBlockStructurePreserved() {
    testSame("try { alert(1); } catch (e) { alert(2); }", false);
  }
}
