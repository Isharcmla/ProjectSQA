package com.google.javascript.jscomp;

import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

public class RemoveUnusedVarsTest {

  private Node test(String js, boolean removeGlobals, boolean preserveFunctionExpressionNames, boolean modifyCallSites) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node root = compiler.parseTestCode(js);
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);

    Node externs = IR.root();

    RemoveUnusedVars pass = new RemoveUnusedVars(
        compiler, removeGlobals, preserveFunctionExpressionNames, modifyCallSites);
    pass.process(externs, root);

    return root;
  }

  private String testAndPrint(String js, boolean removeGlobals, boolean preserveFunctionExpressionNames, boolean modifyCallSites) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node root = compiler.parseTestCode(js);
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);

    Node externs = IR.root();

    RemoveUnusedVars pass = new RemoveUnusedVars(
        compiler, removeGlobals, preserveFunctionExpressionNames, modifyCallSites);
    pass.process(externs, root);

    return compiler.toSource(root);
  }

  @Test
  public void testProcess_unnormalizedCompiler_throwsException() {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode("var a = 1;");
    RemoveUnusedVars pass = new RemoveUnusedVars(compiler, true, false, false);
    try {
      pass.process(IR.root(), root);
      Assert.fail("Expected IllegalStateException for unnormalized compiler");
    } catch (IllegalStateException expected) {
      Assert.assertNotNull(expected.getMessage());
    }
  }

  @Test
  public void testProcess_nullDefFinderWhenModifyCallSites_throwsException() {
    Compiler compiler = new Compiler();
    compiler.parseTestCode("var a = 1;");
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);
    RemoveUnusedVars pass = new RemoveUnusedVars(compiler, true, false, true);
    try {
      pass.process(IR.root(), IR.root(), null);
      Assert.fail("Expected NullPointerException when defFinder is null and modifyCallSites is true");
    } catch (NullPointerException expected) {
      // Expected
    }
  }

  @Test
  public void testRemoveUnusedVars_simpleUnusedGlobalVar_removed() {
    String js = "var unused = 1;";
    String result = testAndPrint(js, true, false, false);
    Assert.assertEquals("", result.trim());
  }

  @Test
  public void testRemoveUnusedVars_doNotRemoveGlobals_kept() {
    String js = "var unused = 1;";
    String result = testAndPrint(js, false, false, false);
    Assert.assertTrue(result.contains("unused"));
  }

  @Test
  public void testRemoveUnusedVars_multiVarDeclaration_onlyUnusedRemoved() {
    String js = "var used = 1, unused = 2; alert(used);";
    String result = testAndPrint(js, true, false, false);
    Assert.assertTrue(result.contains("used"));
    Assert.assertFalse(result.contains("unused"));
  }

  @Test
  public void testRemoveUnusedVars_unusedVarWithSideEffects_replacesWithExprResult() {
    String js = "function sideEffect() { return 1; } var unused = sideEffect();";
    String result = testAndPrint(js, true, false, false);
    Assert.assertFalse(result.contains("unused"));
    Assert.assertTrue(result.contains("sideEffect()"));
  }

  @Test
  public void testRemoveUnusedVars_unusedFunctionDeclaration_removed() {
    String js = "function unused() { alert(1); }";
    String result = testAndPrint(js, true, false, false);
    Assert.assertEquals("", result.trim());
  }

  @Test
  public void testRemoveUnusedVars_usedFunctionDeclaration_kept() {
    String js = "function used() { alert(1); } used();";
    String result = testAndPrint(js, true, false, false);
    Assert.assertTrue(result.contains("used"));
  }

  @Test
  public void testRemoveUnusedVars_functionExpressionNamePreserved() {
    String js = "var f = function namedFn() { return 1; }; f();";
    String result = testAndPrint(js, true, true, false);
    Assert.assertTrue(result.contains("namedFn"));
  }

  @Test
  public void testRemoveUnusedVars_functionExpressionNameRemoved() {
    String js = "var f = function namedFn() { return 1; }; f();";
    String result = testAndPrint(js, true, false, false);
    Assert.assertFalse(result.contains("namedFn"));
  }

  @Test
  public void testRemoveUnusedVars_unusedFunctionParameters_removed() {
    String js = "function f(a, b, c) { alert(a); } f(1, 2, 3);";
    String result = testAndPrint(js, true, false, false);
    Assert.assertTrue(result.contains("function f(a)"));
  }

  @Test
  public void testRemoveUnusedVars_argumentsEscaped_preservesAllParams() {
    String js = "function f(a, b) { return arguments; } f(1, 2);";
    String result = testAndPrint(js, true, false, false);
    Assert.assertTrue(result.contains("function f(a,b)") || result.contains("function f(a, b)"));
  }

  @Test
  public void testRemoveUnusedVars_modifyCallSites_removesParamsAndArgs() {
    String js = "function f(a, b) { alert(a); } f(1, 2);";
    String result = testAndPrint(js, true, false, true);
    Assert.assertTrue(result.contains("f(1)"));
    Assert.assertFalse(result.contains("f(1, 2)") || result.contains("f(1,2)"));
  }

  @Test
  public void testRemoveUnusedVars_modifyCallSites_replaceWithZeroWhenMiddleParamUnused() {
    String js = "function f(a, b, c) { alert(a + c); } f(1, 2, 3);";
    String result = testAndPrint(js, true, false, true);
    Assert.assertTrue(result.contains("0"));
  }

  @Test
  public void testRemoveUnusedVars_modifyCallSites_dotCall() {
    String js = "function f(a, b) { alert(a); } f.call(null, 1, 2);";
    String result = testAndPrint(js, true, false, true);
    Assert.assertTrue(result.contains("f.call(null, 1)") || result.contains("f.call(null,1)"));
  }

  @Test
  public void testRemoveUnusedVars_forInLoop_variableKept() {
    String js = "var obj = {a: 1}; for (var prop in obj) { alert(1); }";
    String result = testAndPrint(js, true, false, false);
    Assert.assertTrue(result.contains("prop"));
  }

  @Test
  public void testRemoveUnusedVars_objectGetterSetter_paramsNotRemoved() {
    String js = "var obj = { set a(val) { alert(1); } };";
    String result = testAndPrint(js, false, false, false);
    Assert.assertTrue(result.contains("val"));
  }

  @Test
  public void testRemoveUnusedVars_propertyAssignOnUnusedVar_removed() {
    String js = "var unused = {}; unused.foo = 1;";
    String result = testAndPrint(js, true, false, false);
    Assert.assertEquals("", result.trim());
  }

  @Test
  public void testRemoveUnusedVars_propertyAssignWithUnknownInitialValue_kept() {
    String js = "function getObj() { return {}; } var obj = getObj(); obj.foo = 1;";
    String result = testAndPrint(js, true, false, false);
    Assert.assertTrue(result.contains("obj.foo = 1") || result.contains("obj.foo=1"));
  }

  @Test
  public void testRemoveUnusedVars_prototypeAssign_removedWhenUnused() {
    String js = "function MyClass() {} MyClass.prototype.foo = 1;";
    String result = testAndPrint(js, true, false, false);
    Assert.assertEquals("", result.trim());
  }

  @Test
  public void testRemoveUnusedVars_chainedAssign_partiallyRemoved() {
    String js = "var a, b; a = b = 1; alert(a);";
    String result = testAndPrint(js, true, false, false);
    Assert.assertTrue(result.contains("a = 1") || result.contains("a=1"));
    Assert.assertFalse(result.contains("b"));
  }

  @Test
  public void testRemoveUnusedVars_getElemSideEffectAssign_commaRetained() {
    String js = "var arr = []; function getIdx() { return 0; } arr[getIdx()] = 1;";
    String result = testAndPrint(js, true, false, false);
    Assert.assertTrue(result.contains("getIdx()"));
  }

  @Test
  public void testRemoveUnusedVars_googInherits_unreferencedSubclassRemoved() {
    String js = "function SuperClass() {} function SubClass() {} goog.inherits(SubClass, SuperClass);";
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node root = compiler.parseTestCode(js);
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);

    Node externs = IR.root();
    RemoveUnusedVars pass = new RemoveUnusedVars(compiler, true, false, false);
    pass.process(externs, root);

    String result = compiler.toSource(root);
    Assert.assertFalse(result.contains("goog.inherits(SubClass, SuperClass)"));
  }

  @Test
  public void testRemoveUnusedVars_exportedVariable_kept() {
    String js = "var _exported = 1;";
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node root = compiler.parseTestCode(js);
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);

    CodingConvention convention = new GoogleCodingConvention() {
      @Override
      public boolean isExported(String name) {
        return name.startsWith("_");
      }
    };
    compiler.setCodingConvention(convention);

    Node externs = IR.root();
    RemoveUnusedVars pass = new RemoveUnusedVars(compiler, true, false, false);
    pass.process(externs, root);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("_exported"));
  }

  @Test
  public void testRemoveUnusedVars_explicitSimpleDefinitionFinder_processSucceeds() {
    String js = "function f(a) { alert(a); } f(1);";
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node root = compiler.parseTestCode(js);
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);

    Node externs = IR.root();
    SimpleDefinitionFinder defFinder = new SimpleDefinitionFinder(compiler);
    defFinder.process(externs, root);

    RemoveUnusedVars pass = new RemoveUnusedVars(compiler, true, false, true);
    pass.process(externs, root, defFinder);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("f(1)"));
  }

  @Test
  public void testRemoveUnusedVars_localScopeContinuations_evaluatedCorrectly() {
    String js = "function outer() { var unused = 1; var used = 2; return function inner() { return used; }; } outer()();";
    String result = testAndPrint(js, true, false, false);
    Assert.assertFalse(result.contains("unused"));
    Assert.assertTrue(result.contains("used"));
  }
}
