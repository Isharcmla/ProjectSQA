package com.google.javascript.jscomp;

import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveUnusedVarsTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setCodingConvention(new ClosureCodingConvention());
    compiler.initOptions(options);
  }

  private Node parseAndNormalize(String js) {
    Node root = compiler.parseTestCode(js);
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);
    Normalize normalize = new Normalize(compiler, false);
    Node externs = IR.root();
    Node mainRoot = IR.root(externs, root);
    normalize.process(externs, root);
    return root;
  }

  private void test(String input, String expected, boolean removeGlobals,
                    boolean preserveFunctionExpressionNames, boolean modifyCallSites) {
    Node root = parseAndNormalize(input);
    Node externs = IR.root();
    RemoveUnusedVars pass = new RemoveUnusedVars(
        compiler, removeGlobals, preserveFunctionExpressionNames, modifyCallSites);
    pass.process(externs, root);
    
    Node expectedRoot = parseAndNormalize(expected);
    String actualCode = compiler.toSource(root);
    String expectedCode = compiler.toSource(expectedRoot);
    Assert.assertEquals(expectedCode, actualCode);
  }

  @Test
  public void testProcess_removeUnusedGlobalVar_varRemoved() {
    test("var x = 1;", "", true, false, false);
  }

  @Test
  public void testProcess_keepGlobalsWhenRemoveGlobalsFalse_varPreserved() {
    test("var x = 1;", "var x = 1;", false, false, false);
  }

  @Test
  public void testProcess_usedGlobalVar_varPreserved() {
    test("var x = 1; alert(x);", "var x = 1; alert(x);", true, false, false);
  }

  @Test
  public void testProcess_unusedLocalVar_localVarRemoved() {
    test("function f() { var x = 1; return 2; } f();",
         "function f() { return 2; } f();", false, false, false);
  }

  @Test
  public void testProcess_multipleVarsInDeclaration_onlyUnusedRemoved() {
    test("var a = 1, b = 2; alert(a);", "var a = 1; alert(a);", true, false, false);
    test("var a = 1, b = 2; alert(b);", "var b = 2; alert(b);", true, false, false);
  }

  @Test
  public void testProcess_unusedVarWithSideEffects_initialValueRetainedAsExprResult() {
    test("function sideEffect() { return 1; } var x = sideEffect();",
         "function sideEffect() { return 1; } sideEffect();", true, false, false);
  }

  @Test
  public void testProcess_unusedFunctionDeclaration_removed() {
    test("function unused() { var a = 1; }", "", true, false, false);
  }

  @Test
  public void testProcess_usedFunctionDeclaration_preserved() {
    test("function used() { return 1; } alert(used());",
         "function used() { return 1; } alert(used());", true, false, false);
  }

  @Test
  public void testProcess_functionExpressionNamePreserved_basedOnFlag() {
    test("var f = function bleeding() { return 1; }; f();",
         "var f = function() { return 1; }; f();", true, false, false);
    test("var f = function bleeding() { return 1; }; f();",
         "var f = function bleeding() { return 1; }; f();", true, true, false);
  }

  @Test
  public void testProcess_unusedFunctionParameters_trailingArgsRemoved() {
    test("function f(a, b) { return a; } f(1, 2);",
         "function f(a) { return a; } f(1, 2);", true, false, false);
  }

  @Test
  public void testProcess_argumentsEscapedInFunction_parametersPreserved() {
    test("function f(a, b) { return arguments[0]; } f(1, 2);",
         "function f(a, b) { return arguments[0]; } f(1, 2);", true, false, false);
  }

  @Test
  public void testProcess_unusedPropertyAssignOnObjectLiteral_removed() {
    test("var obj = {}; obj.x = 1;", "", true, false, false);
  }

  @Test
  public void testProcess_propertyAssignOnUnknownValue_varAndAssignRetained() {
    test("function getObj() { return {}; } var obj = getObj(); obj.x = 1;",
         "function getObj() { return {}; } var obj = getObj(); obj.x = 1;",
         true, false, false);
  }

  @Test
  public void testProcess_propertyAssignWithGetElem_elementSideEffectsExtracted() {
    test("var arr = {}; arr[sideEffect()] = 2;",
         "sideEffect(), 2;", true, false, false);
  }

  @Test
  public void testProcess_assignInExpressionResultUsed_aliasedAssignRetained() {
    test("var a; var b = (a = 2); alert(b);",
         "var a; var b = (a = 2); alert(b);", true, false, false);
  }

  @Test
  public void testProcess_prototypePropertyAssign_removedWhenUnused() {
    test("function Foo() {} Foo.prototype.bar = 1;", "", true, false, false);
  }

  @Test
  public void testProcess_googInheritsCall_removedWhenClassUnreferenced() {
    test("function Super() {} function Sub() {} goog.inherits(Sub, Super);",
         "", true, false, false);
  }

  @Test
  public void testProcess_googAddSingletonGetter_removedWhenClassUnreferenced() {
    test("function Foo() {} goog.addSingletonGetter(Foo);", "", true, false, false);
  }

  @Test
  public void testProcess_forInVar_preserved() {
    test("var obj = {a: 1}; for (var k in obj) { alert(1); }",
         "var obj = {a: 1}; for (var k in obj) { alert(1); }", true, false, false);
  }

  @Test
  public void testProcess_modifyCallSites_removesUnusedParameterFromCallSites() {
    test("function f(a, b) { return a; } f(1, 2);",
         "function f(a) { return a; } f(1);", true, false, true);
  }

  @Test
  public void testProcess_modifyCallSites_replacesSideEffectFreeMiddleParameterWithZero() {
    test("function f(a, b, c) { return a + c; } f(1, 2, 3);",
         "function f(a, b, c) { return a + c; } f(1, 0, 3);", true, false, true);
  }

  @Test
  public void testProcess_modifyCallSites_withFunctionDotCall() {
    test("function f(a, b) { return a; } f.call(null, 1, 2);",
         "function f(a) { return a; } f.call(null, 1);", true, false, true);
  }

  @Test
  public void testProcess_modifyCallSitesWithDirectFinder_invokesSuccessfully() {
    Node root = parseAndNormalize("function f(a, b) { return a; } f(1, 2);");
    Node externs = IR.root();
    SimpleDefinitionFinder defFinder = new SimpleDefinitionFinder(compiler);
    defFinder.process(externs, root);

    RemoveUnusedVars pass = new RemoveUnusedVars(compiler, true, false, true);
    pass.process(externs, root, defFinder);

    Node expectedRoot = parseAndNormalize("function f(a) { return a; } f(1);");
    Assert.assertEquals(compiler.toSource(expectedRoot), compiler.toSource(root));
  }

  @Test(expected = IllegalStateException.class)
  public void testProcess_unnormalizedRoot_throwsIllegalStateException() {
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Node root = compiler.parseTestCode("var a = 1;");
    RemoveUnusedVars pass = new RemoveUnusedVars(compiler, true, false, false);
    pass.process(IR.root(), root);
  }

  @Test
  public void testProcess_getterSetterInObjectLiteral_parameterNotRemoved() {
    test("var x = { set a(val) { alert(1); } }; alert(x);",
         "var x = { set a(val) { alert(1); } }; alert(x);", true, false, false);
  }

  @Test
  public void testProcess_varArgsFunction_callSiteNotModified() {
    test("function f(a) { return arguments.length; } f(1, 2, 3);",
         "function f(a) { return arguments.length; } f(1, 2, 3);", true, false, true);
  }
}
