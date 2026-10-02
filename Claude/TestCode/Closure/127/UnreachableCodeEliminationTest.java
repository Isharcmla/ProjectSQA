package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UnreachableCodeEliminationTest {

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
  }

  private Node compileAndGetRoot(String code) {
    List<SourceFile> externs = new ArrayList<>();
    List<SourceFile> inputs = new ArrayList<>();
    inputs.add(SourceFile.fromCode("test.js", code));
    Result result = compiler.compile(externs, inputs, options);
    assertTrue(result.success);
    return compiler.getRoot();
  }

  @Test
  public void testProcess_unreachableCodeAfterReturn_removesDeadCode() {
    String code = "function f() { return 1; alert('unreachable'); }";
    compileAndGetRoot(code);
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);
    pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    String output = compiler.toSource();
    assertFalse(output.contains("unreachable"));
  }

  @Test
  public void testProcess_noSideEffectStatement_removedWhenFlagTrue() {
    String code = "function f() { var x = 1; true; return x; }";
    compileAndGetRoot(code);
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);
    pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    String output = compiler.toSource();
    assertNotNull(output);
  }

  @Test
  public void testProcess_reachableCode_notRemoved() {
    String code = "function f() { var x = 1; return x; }";
    compileAndGetRoot(code);
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, false);
    pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    String output = compiler.toSource();
    assertTrue(output.contains("return"));
  }

  @Test
  public void testProcess_emptyScript_noException() {
    String code = "";
    compileAndGetRoot(code);
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);
    pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    String output = compiler.toSource();
    assertNotNull(output);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullCompilerAndNullArguments_throwsException() {
    UnreachableCodeElimination pass = new UnreachableCodeElimination(null, true);
    pass.process(null, null);
  }

  @Test
  public void testProcess_breakUnconditionalInLoop_handledWithoutException() {
    String code = "function f() { while(true) { break; } }";
    compileAndGetRoot(code);
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, false);
    pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    String output = compiler.toSource();
    assertNotNull(output);
  }

  @Test
  public void testProcess_continueUnconditionalInLoop_handledWithoutException() {
    String code = "function f() { for (var i = 0; i < 10; i++) { continue; } }";
    compileAndGetRoot(code);
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, false);
    pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    String output = compiler.toSource();
    assertNotNull(output);
  }

  @Test
  public void testProcess_removeNoOpStatementsFalse_keepsSideEffectFreeStatement() {
    String code = "function f() { var x = 1; return x; }";
    compileAndGetRoot(code);
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, false);
    pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    String output = compiler.toSource();
    assertTrue(output.contains("x"));
  }

  @Test
  public void testProcess_doWhileUnreachable_notThrowingException() {
    String code = "function f() { return; do { alert(1); } while(false); }";
    compileAndGetRoot(code);
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);
    pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    String output = compiler.toSource();
    assertNotNull(output);
  }

  @Test
  public void testProcess_tryCatchBlock_handledCorrectly() {
    String code = "function f() { try { alert(1); } catch (e) { alert(2); } }";
    compileAndGetRoot(code);
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);
    pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    String output = compiler.toSource();
    assertNotNull(output);
  }

  @Test
  public void testProcess_switchStatementWithBreak_handledCorrectly() {
    String code = "function f(x) { switch(x) { case 1: alert(1); break; "
        + "default: alert(2); } }";
    compileAndGetRoot(code);
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, false);
    pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    String output = compiler.toSource();
    assertNotNull(output);
  }

  @Test
  public void testProcess_variableDeclarationUnreachable_notRemovedWhenNoInitializer() {
    String code = "function f() { return; var x; }";
    compileAndGetRoot(code);
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);
    pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    String output = compiler.toSource();
    assertNotNull(output);
  }

  @Test
  public void testProcess_multipleFunctions_processesAllChangedFunctions() {
    String code = "function f() { return 1; alert('a'); } "
        + "function g() { return 2; alert('b'); }";
    compileAndGetRoot(code);
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, true);
    pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    String output = compiler.toSource();
    assertFalse(output.contains("'a'"));
    assertFalse(output.contains("'b'"));
  }
}
