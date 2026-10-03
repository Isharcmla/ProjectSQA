package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PureFunctionIdentifierTest {

  private Compiler compiler;
  private SimpleDefinitionFinder defFinder;
  private PureFunctionIdentifier pfi;
  private Node externsNode;
  private Node rootNode;

  private void process(String externs, String js) {
    compiler = new Compiler();
    externsNode = compiler.parseTestCode(externs);
    rootNode = compiler.parseTestCode(js);

    defFinder = new SimpleDefinitionFinder(compiler);
    defFinder.process(externsNode, rootNode);

    pfi = new PureFunctionIdentifier(compiler, defFinder);
    pfi.process(externsNode, rootNode);
  }

  private List<Node> findCalls(Node n) {
    List<Node> calls = new ArrayList<Node>();
    findCallsHelper(n, calls);
    return calls;
  }

  private void findCallsHelper(Node n, List<Node> calls) {
    if (n.isCall() || n.isNew()) {
      calls.add(n);
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      findCallsHelper(c, calls);
    }
  }

  @Test(expected = IllegalStateException.class)
  public void testProcess_calledTwice_throwsIllegalStateException() {
    process("", "function f() {}");
    pfi.process(externsNode, rootNode);
  }

  @Test(expected = NullPointerException.class)
  public void testGetDebugReport_beforeProcess_throwsNullPointerException() {
    Compiler c = new Compiler();
    SimpleDefinitionFinder df = new SimpleDefinitionFinder(c);
    PureFunctionIdentifier identifier = new PureFunctionIdentifier(c, df);
    identifier.getDebugReport();
  }

  @Test
  public void testProcess_pureFunction_marksCallAsNoSideEffects() {
    String js = "function pureFunc() { return 42; } pureFunc();";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertEquals(1, calls.size());
    Assert.assertTrue(calls.get(0).isNoSideEffectsCall());

    String report = pfi.getDebugReport();
    Assert.assertTrue(report.contains("pureFunc"));
    Assert.assertTrue(report.contains("Pure functions:"));
  }

  @Test
  public void testProcess_externWithNoSideEffectsAnnotation_marksCallAsNoSideEffects() {
    String externs = "/** @nosideeffects */ function Math_sin(x) {}";
    String js = "Math_sin(1);";
    process(externs, js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertEquals(1, calls.size());
    Assert.assertTrue(calls.get(0).isNoSideEffectsCall());
  }

  @Test
  public void testProcess_externVarWithNoSideEffectsAnnotation_marksCallAsNoSideEffects() {
    String externs = "/** @nosideeffects */ var extPure = function() {};";
    String js = "extPure();";
    process(externs, js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertEquals(1, calls.size());
    Assert.assertTrue(calls.get(0).isNoSideEffectsCall());
  }

  @Test
  public void testProcess_externAssignWithNoSideEffectsAnnotation_marksCallAsNoSideEffects() {
    String externs = "var Math = {}; /** @nosideeffects */ Math.cos = function(x) {};";
    String js = "Math.cos(1);";
    process(externs, js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertEquals(1, calls.size());
    Assert.assertTrue(calls.get(0).isNoSideEffectsCall());
  }

  @Test
  public void testProcess_externWithoutAnnotation_taintsGlobalState() {
    String externs = "function extImpure() {}";
    String js = "extImpure();";
    process(externs, js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertEquals(1, calls.size());
    Assert.assertFalse(calls.get(0).isNoSideEffectsCall());
  }

  @Test
  public void testProcess_srcWithNoSideEffectsAnnotation_reportsDiagnostic() {
    String js = "/** @nosideeffects */ function badAnnotated() {} badAnnotated();";
    process("", js);

    Assert.assertEquals(1, compiler.getErrorCount());
    JSError error = compiler.getErrors()[0];
    Assert.assertEquals(
        PureFunctionIdentifier.INVALID_NO_SIDE_EFFECT_ANNOTATION.key,
        error.getType().key);
  }

  @Test
  public void testProcess_globalVarMutation_taintsGlobalState() {
    String js = "var g = 0; function mutateGlobal() { g = 1; } mutateGlobal();";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertEquals(1, calls.size());
    Assert.assertFalse(calls.get(0).isNoSideEffectsCall());
  }

  @Test
  public void testProcess_localVarMutation_doesNotTaintGlobalState() {
    String js = "function localMutate() { var a = 0; a = 1; a++; a--; return a; } localMutate();";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertEquals(1, calls.size());
    Assert.assertTrue(calls.get(0).isNoSideEffectsCall());
  }

  @Test
  public void testProcess_thisMutation_taintsThis() {
    String js = "function mutateThis() { this.x = 1; }";
    process("", js);

    String report = pfi.getDebugReport();
    Assert.assertTrue(report.contains("this"));
  }

  @Test
  public void testProcess_objectPropertyMutation_taintsUnknown() {
    String js = "function mutateObj(obj) { obj.x = 1; } mutateObj({});";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertEquals(1, calls.size());
    Assert.assertFalse(calls.get(0).isNoSideEffectsCall());
  }

  @Test
  public void testProcess_complexLhsMutation_taintsUnknown() {
    String js = "function mutateElem(arr) { arr[0] = 1; } mutateElem([]);";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertEquals(1, calls.size());
    Assert.assertFalse(calls.get(0).isNoSideEffectsCall());
  }

  @Test
  public void testProcess_delProp_taintsGlobalOrUnknown() {
    String js = "var obj = {}; function delProp() { delete obj.x; } delProp();";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertEquals(1, calls.size());
    Assert.assertFalse(calls.get(0).isNoSideEffectsCall());
  }

  @Test
  public void testProcess_incDecOnGlobal_taintsGlobalState() {
    String js = "var g = 0; function incGlobal() { g++; } function decGlobal() { g--; } incGlobal(); decGlobal();";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertEquals(2, calls.size());
    Assert.assertFalse(calls.get(0).isNoSideEffectsCall());
    Assert.assertFalse(calls.get(1).isNoSideEffectsCall());
  }

  @Test
  public void testProcess_throwStatement_taintsFunctionThrows() {
    String js = "function throwingFunc() { throw 'error'; } throwingFunc();";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertEquals(1, calls.size());
    Assert.assertFalse(calls.get(0).isNoSideEffectsCall());

    String report = pfi.getDebugReport();
    Assert.assertTrue(report.contains("throw"));
  }

  @Test
  public void testProcess_propagationOfGlobalSideEffects_callerBecomesImpure() {
    String js =
        "var g = 0;\n" +
        "function impure() { g = 1; }\n" +
        "function caller() { impure(); }\n" +
        "caller();";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    for (Node call : calls) {
      Assert.assertFalse(call.isNoSideEffectsCall());
    }
  }

  @Test
  public void testProcess_propagationOfThrow_callerBecomesThrowing() {
    String js =
        "function throwsFunc() { throw 1; }\n" +
        "function caller() { throwsFunc(); }\n" +
        "caller();";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    for (Node call : calls) {
      Assert.assertFalse(call.isNoSideEffectsCall());
    }
  }

  @Test
  public void testProcess_propagationOfMutatesThis_viaThisMethodCall() {
    String js =
        "function modifier() { this.a = 1; }\n" +
        "function caller() { this.modifier = modifier; this.modifier(); }\n";
    process("", js);

    String report = pfi.getDebugReport();
    Assert.assertTrue(report.contains("caller"));
  }

  @Test
  public void testProcess_propagationOfMutatesThis_viaCallMethodWithThis() {
    String js =
        "function modifier() { this.a = 1; }\n" +
        "function caller() { modifier.call(this); }\n";
    process("", js);

    String report = pfi.getDebugReport();
    Assert.assertTrue(report.contains("caller"));
  }

  @Test
  public void testProcess_propagationOfMutatesThis_viaApplyMethodWithThis() {
    String js =
        "function modifier() { this.a = 1; }\n" +
        "function caller() { modifier.apply(this); }\n";
    process("", js);

    String report = pfi.getDebugReport();
    Assert.assertTrue(report.contains("caller"));
  }

  @Test
  public void testProcess_propagationOfMutatesThis_viaNonThisObjectTaintsGlobalState() {
    String js =
        "function modifier() { this.a = 1; }\n" +
        "var obj = {};\n" +
        "function caller() { obj.m = modifier; obj.m(); }\n" +
        "caller();";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    boolean hasImpureCall = false;
    for (Node call : calls) {
      if (!call.isNoSideEffectsCall()) {
        hasImpureCall = true;
      }
    }
    Assert.assertTrue(hasImpureCall);
  }

  @Test
  public void testProcess_propagationOfMutatesThis_withoutExplicitObjectTaintsGlobalState() {
    String js =
        "function modifier() { this.a = 1; }\n" +
        "function caller() { modifier(); }\n" +
        "caller();";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertFalse(calls.get(calls.size() - 1).isNoSideEffectsCall());
  }

  @Test
  public void testProcess_newConstructor_mutatingOnlyThis_isPureCallSite() {
    String js =
        "function MyClass() { this.x = 1; }\n" +
        "new MyClass();";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertEquals(1, calls.size());
    Assert.assertTrue(calls.get(0).isNoSideEffectsCall());
  }

  @Test
  public void testProcess_newConstructor_mutatingGlobalState_hasSideEffects() {
    String js =
        "var g = 0;\n" +
        "function ImpureClass() { g = 1; }\n" +
        "new ImpureClass();";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertEquals(1, calls.size());
    Assert.assertFalse(calls.get(0).isNoSideEffectsCall());
  }

  @Test
  public void testProcess_newConstructor_throwing_hasSideEffects() {
    String js =
        "function ThrowingClass() { throw 'error'; }\n" +
        "new ThrowingClass();";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertEquals(1, calls.size());
    Assert.assertFalse(calls.get(0).isNoSideEffectsCall());
  }

  @Test
  public void testProcess_nonNameNonGetPropCallee_taintsUnknown() {
    String js =
        "function outer() {\n" +
        "  (function() { return 1; })();\n" +
        "}\n" +
        "outer();";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertFalse(calls.get(calls.size() - 1).isNoSideEffectsCall());
  }

  @Test
  public void testProcess_nonFunctionDefinition_returnsNullCallableDef() {
    String js =
        "var notAFunc = 42;\n" +
        "function callNonFunc() { notAFunc(); }\n" +
        "callNonFunc();";
    process("", js);

    List<Node> calls = findCalls(rootNode);
    Assert.assertFalse(calls.get(calls.size() - 1).isNoSideEffectsCall());
  }

  @Test
  public void testProcess_emptySourceAndExterns() {
    process("", "");
    Assert.assertEquals(0, findCalls(rootNode).size());
    String report = pfi.getDebugReport();
    Assert.assertTrue(report.startsWith("Pure functions:\n"));
  }

  @Test
  public void testGetDebugReport_withCallsInFunctionBody() {
    String js =
        "function a() { return 1; }\n" +
        "function b() { a(); return 2; }\n" +
        "b();";
    process("", js);

    String report = pfi.getDebugReport();
    Assert.assertTrue(report.contains("Calls:"));
    Assert.assertTrue(report.contains("a"));
    Assert.assertTrue(report.contains("b"));
  }
}
