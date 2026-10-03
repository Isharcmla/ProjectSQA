package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class InlineFunctionsTest {

  private Compiler compiler;
  private Supplier<String> nameSupplier;

  @Before
  public void setUp() {
    compiler = new Compiler();
    nameSupplier = new Supplier<String>() {
      private int id = 0;
      @Override
      public String get() {
        return "inline_" + (id++);
      }
    };
  }

  private void testInlining(String js, boolean inlineGlobal, boolean inlineLocal, boolean blockInlining) {
    Node root = compiler.parseTestCode(js);
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    Node externs = new Node(Token.BLOCK);
    InlineFunctions inliner = new InlineFunctions(
        compiler, nameSupplier, inlineGlobal, inlineLocal, blockInlining);
    inliner.process(externs, root);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructor_nullCompiler_throwsException() {
    new InlineFunctions(null, nameSupplier, true, true, true);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructor_nullSupplier_throwsException() {
    new InlineFunctions(compiler, null, true, true, true);
  }

  @Test(expected = IllegalStateException.class)
  public void testProcess_notNormalized_throwsException() {
    Node root = compiler.parseTestCode("function foo() { return 1; } foo();");
    Node externs = new Node(Token.BLOCK);
    InlineFunctions inliner = new InlineFunctions(compiler, nameSupplier, true, true, true);
    inliner.process(externs, root);
  }

  @Test
  public void testProcess_emptyRoot_noAction() {
    Node root = compiler.parseTestCode("");
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    Node externs = new Node(Token.BLOCK);
    InlineFunctions inliner = new InlineFunctions(compiler, nameSupplier, true, true, true);
    inliner.process(externs, root);
  }

  @Test
  public void testProcess_namedFunction_directInlined() {
    testInlining("function foo() { return 1; } var x = foo();", true, true, true);
  }

  @Test
  public void testProcess_varFunction_directInlined() {
    testInlining("var foo = function() { return 1; }; var x = foo();", true, true, true);
  }

  @Test
  public void testProcess_functionExpressionCall_inlined() {
    testInlining("(function() { return 1; })();", true, true, true);
  }

  @Test
  public void testProcess_functionExpressionDotCall_inlined() {
    testInlining("(function(a) { return a; }).call(this, 1);", true, true, true);
  }

  @Test
  public void testProcess_namedFunctionDotCall_inlined() {
    testInlining("function foo(a) { return a; } foo.call(this, 1);", true, true, true);
  }

  @Test
  public void testProcess_blockInliningEnabled() {
    testInlining("function foo() { var a = 1; return a; } var x = foo();", true, true, true);
  }

  @Test
  public void testProcess_blockInliningDisabled() {
    testInlining("function foo() { var a = 1; return a; } var x = foo();", true, true, false);
  }

  @Test
  public void testProcess_globalFunction_whenGlobalInliningDisabled() {
    testInlining("function foo() { return 1; } var x = foo();", false, true, true);
  }

  @Test
  public void testProcess_localFunction_whenLocalInliningEnabled() {
    testInlining("function outer() { function inner() { return 1; } return inner(); } outer();",
        true, true, true);
  }

  @Test
  public void testProcess_localFunction_whenLocalInliningDisabled() {
    testInlining("function outer() { function inner() { return 1; } return inner(); } outer();",
        true, false, true);
  }

  @Test
  public void testProcess_referencesThis() {
    testInlining("function foo() { return this.x; } var obj = {f: foo};", true, true, true);
  }

  @Test
  public void testProcess_modifiedParameters_requiresAliasing() {
    testInlining("function foo(x) { x = x + 1; return x; } var y = foo(5);", true, true, true);
  }

  @Test
  public void testProcess_innerFunctionWithLocalNames_notInlined() {
    testInlining("function foo() { var a = 1; function inner() { return a; } return inner; } foo();",
        true, true, true);
  }

  @Test
  public void testProcess_innerFunctionWithoutLocalNames() {
    testInlining("function foo() { function inner() { return 1; } return inner; } foo();",
        true, true, true);
  }

  @Test
  public void testProcess_renamePropertiesFunction_ignored() {
    testInlining("function JSCompiler_renameProperty(p) { return p; } var x = JSCompiler_renameProperty('a');",
        true, true, true);
  }

  @Test
  public void testProcess_assignedFunctionName_notInlined() {
    testInlining("function foo() { return 1; } foo = function() { return 2; }; foo();",
        true, true, true);
  }

  @Test
  public void testProcess_objectPropertyString_notInlined() {
    testInlining("function foo() { return 1; } new JSCompiler_ObjectPropertyString(window, foo); foo();",
        true, true, true);
  }

  @Test
  public void testProcess_functionPassedAsParameter_notRemoved() {
    testInlining("function foo() { return 1; } function bar(f) { return f(); } bar(foo); foo();",
        true, true, true);
  }

  @Test
  public void testProcess_callingOtherInlinableFunctions_conflictResolved() {
    testInlining(
        "function a() { return 1; }\n" +
        "function b() { return a(); }\n" +
        "var x = b(); var y = b();",
        true, true, true);
  }

  @Test
  public void testProcess_expressionDecompositionNeeded() {
    testInlining(
        "function foo() { return 1; }\n" +
        "var x = 1 ? foo() : 2;",
        true, true, true);
  }

  @Test
  public void testProcess_withSpecializationState() {
    Node root = compiler.parseTestCode("function foo() { return 1; } function main() { return foo(); } main();");
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    Node externs = new Node(Token.BLOCK);
    InlineFunctions inliner = new InlineFunctions(compiler, nameSupplier, true, true, true);

    SpecializeModule.SpecializationState state = new SpecializeModule.SpecializationState() {
      @Override
      public boolean canFixupFunction(Node n) {
        return true;
      }
      @Override
      public void reportSpecializedFunction(Node n) {}
      @Override
      public void reportRemovedFunction(Node n, Node b) {}
    };

    inliner.enableSpecialization(state);
    inliner.process(externs, root);
  }

  @Test
  public void testProcess_withSpecializationState_cannotFixup() {
    Node root = compiler.parseTestCode("function foo() { return 1; } function main() { return foo(); } main();");
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    Node externs = new Node(Token.BLOCK);
    InlineFunctions inliner = new InlineFunctions(compiler, nameSupplier, true, true, true);

    SpecializeModule.SpecializationState state = new SpecializeModule.SpecializationState() {
      @Override
      public boolean canFixupFunction(Node n) {
        return false;
      }
      @Override
      public void reportSpecializedFunction(Node n) {}
      @Override
      public void reportRemovedFunction(Node n, Node b) {}
    };

    inliner.enableSpecialization(state);
    inliner.process(externs, root);
  }

  @Test
  public void testIsCandidateUsage_variousNodeTrees() {
    // 1. VAR declaration: var a;
    Node varNode = new Node(Token.VAR);
    Node nameNode1 = Node.newString(Token.NAME, "a");
    varNode.addChildToBack(nameNode1);
    assertTrue(InlineFunctions.isCandidateUsage(nameNode1));

    // 2. FUNCTION declaration: function a() {}
    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode2 = Node.newString(Token.NAME, "a");
    fnNode.addChildToBack(nameNode2);
    assertTrue(InlineFunctions.isCandidateUsage(nameNode2));

    // 3. Direct CALL: a()
    Node callNode = new Node(Token.CALL);
    Node nameNode3 = Node.newString(Token.NAME, "a");
    callNode.addChildToBack(nameNode3);
    assertTrue(InlineFunctions.isCandidateUsage(nameNode3));

    // 4. Dot call: a.call(...)
    Node dotCall = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    Node nameNode4 = Node.newString(Token.NAME, "a");
    Node callString = Node.newString("call");
    getProp.addChildToBack(nameNode4);
    getProp.addChildToBack(callString);
    dotCall.addChildToBack(getProp);
    assertTrue(InlineFunctions.isCandidateUsage(nameNode4));

    // 5. Not a .call (e.g., a.apply(...))
    Node dotApply = new Node(Token.CALL);
    Node getPropApply = new Node(Token.GETPROP);
    Node nameNode5 = Node.newString(Token.NAME, "a");
    Node applyString = Node.newString("apply");
    getPropApply.addChildToBack(nameNode5);
    getPropApply.addChildToBack(applyString);
    dotApply.addChildToBack(getPropApply);
    assertFalse(InlineFunctions.isCandidateUsage(nameNode5));

    // 6. Name used as argument: b(a)
    Node callArg = new Node(Token.CALL);
    Node fnName = Node.newString(Token.NAME, "b");
    Node nameNode6 = Node.newString(Token.NAME, "a");
    callArg.addChildToBack(fnName);
    callArg.addChildToBack(nameNode6);
    assertFalse(InlineFunctions.isCandidateUsage(nameNode6));
  }

  @Test
  public void testGetOrCreateFunctionState_managesState() {
    InlineFunctions inliner = new InlineFunctions(compiler, nameSupplier, true, true, true);
    InlineFunctions.FunctionState fs1 = inliner.getOrCreateFunctionState("foo");
    assertNotNull(fs1);
    InlineFunctions.FunctionState fs2 = inliner.getOrCreateFunctionState("foo");
    assertEquals(fs1, fs2);

    fs1.setReferencesThis(true);
    assertTrue(fs1.getReferencesThis());

    fs1.setHasInnerFunctions(true);
    assertTrue(fs1.hasInnerFunctions());

    fs1.setSafeFnNode(new Node(Token.BLOCK));
    assertNotNull(fs1.getSafeFnNode());

    fs1.setNamesToAlias(Collections.singleton("alias"));
    assertEquals(1, fs1.getNamesToAlias().size());

    fs1.setModule(null);
    assertNull(fs1.getModule());

    fs1.inlineDirectly(true);
    assertTrue(fs1.canInlineDirectly());

    fs1.setRemove(true);
    assertTrue(fs1.canRemove());

    fs1.setInline(false);
    assertFalse(fs1.canInline());
    assertFalse(fs1.canRemove());
  }

  @Test(expected = IllegalStateException.class)
  public void testVerifyAllReferencesInlined_throwsWhenMissed() {
    InlineFunctions inliner = new InlineFunctions(compiler, nameSupplier, true, true, true);
    InlineFunctions.FunctionState fs = inliner.getOrCreateFunctionState("bar");

    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "bar"));
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    InlineFunctions.Reference ref = inliner.new Reference(
        callNode, null, FunctionInjector.InliningMode.DIRECT, false);
    ref.inlined = false;

    fs.addReference(ref);
    inliner.verifyAllReferencesInlined(fs);
  }

  @Test
  public void testVerifyAllReferencesInlined_successWhenInlined() {
    InlineFunctions inliner = new InlineFunctions(compiler, nameSupplier, true, true, true);
    InlineFunctions.FunctionState fs = inliner.getOrCreateFunctionState("bar");

    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "bar"));
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    InlineFunctions.Reference ref = inliner.new Reference(
        callNode, null, FunctionInjector.InliningMode.DIRECT, false);
    ref.inlined = true;

    fs.addReference(ref);
    inliner.verifyAllReferencesInlined(fs);
  }

  @Test
  public void testTrimCandidatesUsingOnCost_removesNonRemovableWithoutRefs() {
    InlineFunctions inliner = new InlineFunctions(compiler, nameSupplier, true, true, true);
    InlineFunctions.FunctionState fs = inliner.getOrCreateFunctionState("baz");
    fs.setRemove(false);
    inliner.trimCanidatesUsingOnCost();
  }
}
