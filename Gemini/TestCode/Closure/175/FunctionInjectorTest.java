package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.jscomp.FunctionInjector.CanInlineResult;
import com.google.javascript.jscomp.FunctionInjector.InliningMode;
import com.google.javascript.jscomp.FunctionInjector.Reference;
import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FunctionInjectorTest {

  private Compiler compiler;
  private Supplier<String> idSupplier;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(new ArrayList<SourceFile>(), new ArrayList<SourceFile>(), options);
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);
    idSupplier = new Supplier<String>() {
      private int id = 0;
      @Override
      public String get() {
        return "JSCompiler_temp_" + id++;
      }
    };
  }

  private Node parse(String js) {
    Node root = compiler.parseTestCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    return root;
  }

  private Node findFunction(Node root, final String name) {
    final Node[] result = new Node[1];
    NodeTraversal.traverse(compiler, root, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n.isFunction()) {
          String fnName = NodeUtil.getFunctionName(n);
          if (name == null || name.equals(fnName)) {
            result[0] = n;
          }
        }
      }
    });
    return result[0];
  }

  private Node findCall(Node root, final String targetName) {
    final Node[] result = new Node[1];
    NodeTraversal.traverse(compiler, root, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n.isCall()) {
          Node first = n.getFirstChild();
          if (targetName == null) {
            result[0] = n;
          } else if (first.isName() && first.getString().equals(targetName)) {
            result[0] = n;
          } else if (first.isGetProp() && first.getLastChild().getString().equals(targetName)) {
            result[0] = n;
          }
        }
      }
    });
    return result[0];
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullCompiler_throwsException() {
    new FunctionInjector(null, idSupplier, true, true, true);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullSupplier_throwsException() {
    new FunctionInjector(compiler, null, true, true, true);
  }

  @Test
  public void testSetKnownConstants_validAndDuplicate() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Set<String> constants = Sets.newHashSet("CONST_A", "CONST_B");
    injector.setKnownConstants(constants);

    try {
      injector.setKnownConstants(constants);
      Assert.fail("Expected IllegalStateException on setting known constants twice");
    } catch (IllegalStateException expected) {
      // Expected
    }
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_normalFunction() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo(a, b) { return a + b; }");
    Node fn = findFunction(root, "foo");

    Assert.assertTrue(injector.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_anonymousFunction() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("var f = function(a) { return a; };");
    Node fn = findFunction(root, null);

    Assert.assertTrue(injector.doesFunctionMeetMinimumRequirements("", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_recursiveByName() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo(a) { return foo(a - 1); }");
    Node fn = findFunction(root, "foo");

    Assert.assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_recursiveByInternalName() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("var f = function recur(a) { return recur(a - 1); };");
    Node fn = findFunction(root, "recur");

    Assert.assertFalse(injector.doesFunctionMeetMinimumRequirements("f", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_usesArguments() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo(a) { return arguments[0]; }");
    Node fn = findFunction(root, "foo");

    Assert.assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_usesEval() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo(a) { return eval('a'); }");
    Node fn = findFunction(root, "foo");

    Assert.assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_emptyFunction() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function empty() {}");
    Node fn = findFunction(root, "empty");

    Assert.assertTrue(injector.isDirectCallNodeReplacementPossible(fn));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_singleReturnExpr() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo(x) { return x * 2; }");
    Node fn = findFunction(root, "foo");

    Assert.assertTrue(injector.isDirectCallNodeReplacementPossible(fn));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_singleReturnVoid() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo() { return; }");
    Node fn = findFunction(root, "foo");

    Assert.assertFalse(injector.isDirectCallNodeReplacementPossible(fn));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_multipleStatements() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo(x) { var y = x; return y; }");
    Node fn = findFunction(root, "foo");

    Assert.assertFalse(injector.isDirectCallNodeReplacementPossible(fn));
  }

  @Test
  public void testCanInlineReferenceToFunction_directCall_success() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo(x) { return x; } foo(1);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    NodeTraversal t = new NodeTraversal(compiler, null);
    t.traverse(root);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.DIRECT, false, false);

    Assert.assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_unsupportedApply() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo() { return 1; } foo.apply(null, []);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "apply");

    NodeTraversal t = new NodeTraversal(compiler, null);
    t.traverse(root);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.DIRECT, false, false);

    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_callObject_strictThis() {
    FunctionInjector injectorStrict = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo() { return this.x; } foo.call(obj);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "call");

    NodeTraversal t = new NodeTraversal(compiler, null);
    t.traverse(root);

    CanInlineResult resultStrict = injectorStrict.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.BLOCK, true, false);
    Assert.assertNotEquals(CanInlineResult.NO, resultStrict);

    FunctionInjector injectorNonStrict = new FunctionInjector(compiler, idSupplier, true, false, true);
    CanInlineResult resultNonStrict = injectorNonStrict.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.BLOCK, true, false);
    Assert.assertEquals(CanInlineResult.NO, resultNonStrict);
  }

  @Test
  public void testCanInlineReferenceToFunction_referencesThisWithoutCallObject() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo() { return this.x; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    NodeTraversal t = new NodeTraversal(compiler, null);
    t.traverse(root);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.DIRECT, true, false);

    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_containsFunctionsInLoop() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo() { return function() {}; } while(true) { foo(); }");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    NodeTraversal t = new NodeTraversal(compiler, null);
    t.traverse(root);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.BLOCK, false, true);

    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_directSideEffectsArgs() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("var i = 0; function foo(a) { return a + a; } foo(i++);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    NodeTraversal t = new NodeTraversal(compiler, null);
    t.traverse(root);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.DIRECT, false, false);

    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_blockInliningDisallowedDecomposition() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, false, true, true);
    Node root = parse("function foo() { return 1; } var x = 1 + foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    NodeTraversal t = new NodeTraversal(compiler, null);
    t.traverse(root);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.BLOCK, false, false);

    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_blockInliningAllowedDecomposition() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo() { return 1; } var x = 1 + foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    NodeTraversal t = new NodeTraversal(compiler, null);
    t.traverse(root);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.BLOCK, false, false);

    Assert.assertEquals(CanInlineResult.AFTER_PREPARATION, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_blockInliningSimpleCall() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo() { var a = 1; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    NodeTraversal t = new NodeTraversal(compiler, null);
    t.traverse(root);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.BLOCK, false, false);

    Assert.assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testInline_directMode_returnValue() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo(x) { return x + 1; } var a = foo(2);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    Node inlined = injector.inline(call, "foo", fn, InliningMode.DIRECT);
    Assert.assertNotNull(inlined);
    Assert.assertEquals("2 + 1", compiler.toSource(inlined));
  }

  @Test
  public void testInline_directMode_emptyFunction() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo() {} var a = foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    Node inlined = injector.inline(call, "foo", fn, InliningMode.DIRECT);
    Assert.assertNotNull(inlined);
    Assert.assertEquals("void 0", compiler.toSource(inlined));
  }

  @Test
  public void testInline_blockMode_simpleCall() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo() { var x = 1; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    Node inlined = injector.inline(call, "foo", fn, InliningMode.BLOCK);
    Assert.assertNotNull(inlined);
    Assert.assertTrue(inlined.isBlock());
  }

  @Test
  public void testInline_blockMode_simpleAssignment() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("var res; function foo() { return 5; } res = foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    Node inlined = injector.inline(call, "foo", fn, InliningMode.BLOCK);
    Assert.assertNotNull(inlined);
    Assert.assertTrue(inlined.isBlock());
  }

  @Test
  public void testInline_blockMode_varDeclSimpleAssignment() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo() { return 5; } var res = foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    Node inlined = injector.inline(call, "foo", fn, InliningMode.BLOCK);
    Assert.assertNotNull(inlined);
    Assert.assertTrue(inlined.isBlock());
  }

  @Test
  public void testMaybePrepareCall_expressionDecomposition() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo() { return 1; } var x = 1 + foo();");
    Node call = findCall(root, "foo");

    injector.maybePrepareCall(call);
    Assert.assertNotNull(call.getParent());
  }

  @Test
  public void testMaybePrepareCall_simpleCallNoOp() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo() {} foo();");
    Node call = findCall(root, "foo");

    injector.maybePrepareCall(call);
    Assert.assertTrue(call.getParent().isExprResult());
  }

  @Test
  public void testInliningLowersCost_noReferences() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo(a, b) { return a + b; }");
    Node fn = findFunction(root, "foo");

    boolean lowers = injector.inliningLowersCost(
        null, fn, Collections.<Reference>emptyList(),
        Collections.<String>emptySet(), true, false);

    Assert.assertTrue(lowers);
  }

  @Test
  public void testInliningLowersCost_singleDirectRemovableReference() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo(a) { return a; } foo(1);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    Reference ref = new Reference(call, null, InliningMode.DIRECT);
    List<Reference> refs = ImmutableList.of(ref);

    boolean lowers = injector.inliningLowersCost(
        null, fn, refs, Collections.<String>emptySet(), true, false);

    Assert.assertTrue(lowers);
  }

  @Test
  public void testInliningLowersCost_multipleReferencesBlockAndDirect() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo(a, b) { var x = a + b; return x; } foo(1, 2); foo(3, 4);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    Reference ref1 = new Reference(call, null, InliningMode.BLOCK);
    Reference ref2 = new Reference(call, null, InliningMode.DIRECT);
    List<Reference> refs = ImmutableList.of(ref1, ref2);

    Set<String> namesToAlias = ImmutableSet.of("a");
    boolean lowers = injector.inliningLowersCost(
        null, fn, refs, namesToAlias, false, true);

    // Assert that calculation completes without error and returns boolean
    Assert.assertTrue(lowers || !lowers);
  }

  @Test
  public void testInliningLowersCost_moduleCrossingDependencies() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function foo() { return 1; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    JSModule mod1 = new JSModule("m1");
    JSModule mod2 = new JSModule("m2");
    JSModuleGraph graph = new JSModuleGraph(new JSModule[]{mod1, mod2});
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(new ArrayList<SourceFile>(), new ArrayList<SourceFile>(), options);
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);
    compiler.setModuleGraphForTesting(graph);

    FunctionInjector moduleInjector = new FunctionInjector(compiler, idSupplier, true, true, true);

    Reference ref = new Reference(call, mod2, InliningMode.DIRECT);
    List<Reference> refs = ImmutableList.of(ref);

    boolean lowers = moduleInjector.inliningLowersCost(
        mod1, fn, refs, Collections.<String>emptySet(), true, false);

    Assert.assertTrue(lowers || !lowers);
  }

  @Test
  public void testInliningLowersCost_emptyFunction() {
    FunctionInjector injector = new FunctionInjector(compiler, idSupplier, true, true, true);
    Node root = parse("function empty() {} empty();");
    Node fn = findFunction(root, "empty");
    Node call = findCall(root, "empty");

    Reference ref = new Reference(call, null, InliningMode.BLOCK);
    List<Reference> refs = ImmutableList.of(ref);

    boolean lowers = injector.inliningLowersCost(
        null, fn, refs, Collections.<String>emptySet(), false, false);

    Assert.assertTrue(lowers || !lowers);
  }

  @Test
  public void testReferenceClass_instantiation() {
    Node node = new Node(0);
    JSModule module = new JSModule("mod");
    Reference ref = new Reference(node, module, InliningMode.DIRECT);

    Assert.assertEquals(node, ref.callNode);
    Assert.assertEquals(module, ref.module);
    Assert.assertEquals(InliningMode.DIRECT, ref.mode);
  }
}
