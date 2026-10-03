package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.FunctionInjector.CanInlineResult;
import com.google.javascript.jscomp.FunctionInjector.InliningMode;
import com.google.javascript.jscomp.FunctionInjector.Reference;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class FunctionInjectorTest {

  private Compiler compiler;
  private Supplier<String> idSupplier;
  private int idCount;

  @Before
  public void setUp() {
    compiler = new Compiler();
    idCount = 0;
    idSupplier = new Supplier<String>() {
      @Override
      public String get() {
        return "JSCompiler_temp_" + (idCount++);
      }
    };
  }

  private FunctionInjector createInjector(
      boolean allowDecomposition,
      boolean assumeStrictThis,
      boolean assumeMinimumCapture) {
    return new FunctionInjector(
        compiler, idSupplier, allowDecomposition, assumeStrictThis, assumeMinimumCapture);
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
  public void testDoesFunctionMeetMinimumRequirements_normalFunction_returnsTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo(x) { return x + 1; }");
    Node fn = findFunction(root, "foo");
    Assert.assertTrue(injector.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_emptyFunctionName_returnsTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("var f = function(x) { return x + 1; };");
    Node fn = findFunction(root, null);
    Assert.assertTrue(injector.doesFunctionMeetMinimumRequirements("", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_recursiveNamedFunction_returnsFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo(x) { return foo(x - 1); }");
    Node fn = findFunction(root, "foo");
    Assert.assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_recursiveInnerName_returnsFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("var f = function bar(x) { return bar(x - 1); };");
    Node fn = findFunction(root, "bar");
    Assert.assertFalse(injector.doesFunctionMeetMinimumRequirements("f", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_referencesArguments_returnsFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return arguments[0]; }");
    Node fn = findFunction(root, "foo");
    Assert.assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_referencesEval_returnsFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { eval('1'); }");
    Node fn = findFunction(root, "foo");
    Assert.assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_emptyFunction_returnsTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() {}");
    Node fn = findFunction(root, "foo");
    Assert.assertTrue(injector.isDirectCallNodeReplacementPossible(fn));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_singleReturnWithExpr_returnsTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo(x) { return x + 1; }");
    Node fn = findFunction(root, "foo");
    Assert.assertTrue(injector.isDirectCallNodeReplacementPossible(fn));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_returnWithoutExpr_returnsFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return; }");
    Node fn = findFunction(root, "foo");
    Assert.assertFalse(injector.isDirectCallNodeReplacementPossible(fn));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_multipleStatements_returnsFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo(x) { var y = x; return y; }");
    Node fn = findFunction(root, "foo");
    Assert.assertFalse(injector.isDirectCallNodeReplacementPossible(fn));
  }

  @Test
  public void testCanInlineReferenceToFunction_directCall_success() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo(x) { return x; } foo(1);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {});
    t.traverse(root);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.DIRECT, false, false);
    Assert.assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_applyCall_returnsNo() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return 1; } foo.apply(null);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "apply");

    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {});
    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.DIRECT, false, false);
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_callWithNonThis_nonStrict_returnsNo() {
    FunctionInjector injector = createInjector(true, false, true);
    Node root = parse("function foo() { return 1; } foo.call(obj);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "call");

    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {});
    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.DIRECT, false, false);
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_callWithThis_nonStrict_returnsYes() {
    FunctionInjector injector = createInjector(true, false, true);
    Node root = parse("function foo() { return 1; } foo.call(this);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "call");

    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {});
    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.DIRECT, false, false);
    Assert.assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_referencesThisWithoutCall_returnsNo() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return this.x; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {});
    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.DIRECT, true, false);
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_containsFunctionsInNonGlobalScope_returnsNo() {
    FunctionInjector injector = createInjector(true, true, false);
    final Node root = parse("function outer() { function foo() { return function(){}; } foo(); }");
    final Node fn = findFunction(root, "foo");
    final Node call = findCall(root, "foo");

    final CanInlineResult[] res = new CanInlineResult[1];
    NodeTraversal.traverse(compiler, root, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n == call) {
          res[0] = createInjector(true, true, false).canInlineReferenceToFunction(
              t, call, fn, Collections.<String>emptySet(), InliningMode.BLOCK, false, true);
        }
      }
    });
    Assert.assertEquals(CanInlineResult.NO, res[0]);
  }

  @Test
  public void testCanInlineReferenceToFunction_containsFunctionsWithinLoop_returnsNo() {
    FunctionInjector injector = createInjector(true, true, true);
    final Node root = parse("while(true) { function foo() { return function(){}; } foo(); }");
    final Node fn = findFunction(root, "foo");
    final Node call = findCall(root, "foo");

    final CanInlineResult[] res = new CanInlineResult[1];
    NodeTraversal.traverse(compiler, root, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n == call) {
          res[0] = createInjector(true, true, true).canInlineReferenceToFunction(
              t, call, fn, Collections.<String>emptySet(), InliningMode.BLOCK, false, true);
        }
      }
    });
    Assert.assertEquals(CanInlineResult.NO, res[0]);
  }

  @Test
  public void testCanInlineReferenceToFunction_directModeWithSideEffectArg_returnsNo() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("var i = 0; function foo(a) { return a; } foo(i++);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {});
    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.DIRECT, false, false);
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_directModeWithMutableArgUsedMultipleTimes_returnsNo() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo(a) { return a + a; } foo({});");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {});
    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.DIRECT, false, false);
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_blockModeSimpleCall_returnsYes() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { var a = 1; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {});
    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.BLOCK, false, false);
    Assert.assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_blockModeSimpleAssignment_returnsYes() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("var x; function foo() { return 1; } x = foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {});
    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.BLOCK, false, false);
    Assert.assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_blockModeVarDeclaration_returnsYes() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return 1; } var x = foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {});
    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.BLOCK, false, false);
    Assert.assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_blockModeExpressionDecomposable_afterPrep() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return 1; } var x = 1 + foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {});
    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.BLOCK, false, false);
    Assert.assertEquals(CanInlineResult.AFTER_PREPARATION, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_blockModeExpressionDisallowDecomposition_returnsNo() {
    FunctionInjector injector = createInjector(false, true, true);
    Node root = parse("function foo() { return 1; } var x = 1 + foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {});
    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(), InliningMode.BLOCK, false, false);
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_blockModeForbidTempsWithVar_returnsFalse() {
    FunctionInjector injector = createInjector(true, true, false);
    final Node root = parse(
        "function outer() { eval(''); function inner() { var v = 1; } inner(); }");
    final Node fn = findFunction(root, "inner");
    final Node call = findCall(root, "inner");

    final CanInlineResult[] res = new CanInlineResult[1];
    NodeTraversal.traverse(compiler, root, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n == call) {
          res[0] = createInjector(true, true, false).canInlineReferenceToFunction(
              t, call, fn, Collections.<String>emptySet(), InliningMode.BLOCK, false, false);
        }
      }
    });
    Assert.assertEquals(CanInlineResult.NO, res[0]);
  }

  @Test
  public void testInline_directMode_withReturnValue() {
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo(a) { return a + 1; } var x = foo(2);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    Node inlined = injector.inline(call, "foo", fn, InliningMode.DIRECT);
    Assert.assertNotNull(inlined);
    Assert.assertEquals(Token.ADD, inlined.getType());
  }

  @Test
  public void testInline_directMode_emptyFunction() {
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() {} var x = foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    Node inlined = injector.inline(call, "foo", fn, InliningMode.DIRECT);
    Assert.assertNotNull(inlined);
    Assert.assertTrue(NodeUtil.isUndefined(inlined));
  }

  @Test
  public void testInline_blockMode_simpleCall() {
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { var a = 1; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    Node inlined = injector.inline(call, "foo", fn, InliningMode.BLOCK);
    Assert.assertNotNull(inlined);
    Assert.assertTrue(inlined.isBlock());
  }

  @Test
  public void testInline_blockMode_simpleAssignment() {
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("var x; function foo() { return 1; } x = foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    Node inlined = injector.inline(call, "foo", fn, InliningMode.BLOCK);
    Assert.assertNotNull(inlined);
    Assert.assertTrue(inlined.isBlock());
  }

  @Test
  public void testInline_blockMode_varDeclAssignment() {
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return 1; } var x = foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    Node inlined = injector.inline(call, "foo", fn, InliningMode.BLOCK);
    Assert.assertNotNull(inlined);
    Assert.assertTrue(inlined.isBlock());
  }

  @Test(expected = IllegalStateException.class)
  public void testInline_blockMode_unpreparedExpression_throwsException() {
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return 1; } var x = 1 + foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    injector.inline(call, "foo", fn, InliningMode.BLOCK);
  }

  @Test
  public void testMaybePrepareCall_movableExpression() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return 1; } var x = 1 + foo();");
    Node call = findCall(root, "foo");

    injector.maybePrepareCall(call);
    Assert.assertNotNull(call.getParent());
  }

  @Test
  public void testMaybePrepareCall_decomposableExpression() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return 1; } var a = 0, x = (a = 1) + foo();");
    Node call = findCall(root, "foo");

    injector.maybePrepareCall(call);
    Assert.assertNotNull(call.getParent());
  }

  @Test
  public void testMaybePrepareCall_simpleCallNoOp() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() {} foo();");
    Node call = findCall(root, "foo");

    injector.maybePrepareCall(call);
    Assert.assertTrue(call.getParent().isExprResult());
  }

  @Test
  public void testInliningLowersCost_emptyRefs_returnsTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return 1; }");
    Node fn = findFunction(root, "foo");

    boolean lowers = injector.inliningLowersCost(
        null, fn, Collections.<Reference>emptyList(),
        Collections.<String>emptySet(), true, false);
    Assert.assertTrue(lowers);
  }

  @Test
  public void testInliningLowersCost_singleDirectRefRemovable_returnsTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo(a, b) { return a + b; } foo(1, 2);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    Reference ref = new Reference(call, null, InliningMode.DIRECT);
    boolean lowers = injector.inliningLowersCost(
        null, fn, ImmutableList.of(ref),
        Collections.<String>emptySet(), true, false);
    Assert.assertTrue(lowers);
  }

  @Test
  public void testInliningLowersCost_multipleRefs_withBlockAndDirect() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo(a) { return a; } foo(1); foo(2);");
    Node fn = findFunction(root, "foo");
    Node call1 = findCall(root, "foo");
    Node call2 = findCall(root, "foo");

    Reference ref1 = new Reference(call1, null, InliningMode.DIRECT);
    Reference ref2 = new Reference(call2, null, InliningMode.BLOCK);

    boolean lowers = injector.inliningLowersCost(
        null, fn, ImmutableList.of(ref1, ref2),
        Collections.<String>emptySet(), true, true);
    Assert.assertTrue(lowers);
  }

  @Test
  public void testInliningLowersCost_crossModule_notRemovable() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return 1; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    JSModule mod1 = new JSModule("m1");
    JSModule mod2 = new JSModule("m2");
    JSModuleGraph graph = new JSModuleGraph(new JSModule[] { mod1, mod2 });
    compiler = new Compiler();
    compiler.initModules(ImmutableList.of(mod1, mod2), new CompilerOptions());
    FunctionInjector injectorWithGraph = new FunctionInjector(
        compiler, idSupplier, true, true, true);

    Reference ref = new Reference(call, mod2, InliningMode.DIRECT);
    boolean lowers = injectorWithGraph.inliningLowersCost(
        mod1, fn, ImmutableList.of(ref),
        Collections.<String>emptySet(), true, false);
    Assert.assertTrue(lowers);
  }

  @Test
  public void testInliningLowersCost_fnInstanceCountZero_blockInlinesPositiveDelta_returnsFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return 1; return 2; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    Set<String> aliases = Sets.newHashSet("a", "b", "c", "d", "e", "f", "g");
    Reference ref = new Reference(call, null, InliningMode.BLOCK);
    boolean lowers = injector.inliningLowersCost(
        null, fn, ImmutableList.of(ref),
        aliases, true, false);
    Assert.assertFalse(lowers);
  }

  @Test
  public void testInliningLowersCost_emptyBodyFunction_directAndBlock() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() {} foo(); foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root, "foo");

    Reference ref1 = new Reference(call, null, InliningMode.DIRECT);
    Reference ref2 = new Reference(call, null, InliningMode.BLOCK);

    boolean lowers = injector.inliningLowersCost(
        null, fn, ImmutableList.of(ref1, ref2),
        Collections.<String>emptySet(), false, false);
    Assert.assertTrue(lowers);
  }

  @Test
  public void testSetKnownConstants_normalAndDuplicate_behavior() {
    FunctionInjector injector = createInjector(true, true, true);
    Set<String> constants = ImmutableSet.of("CONST_A", "CONST_B");
    injector.setKnownConstants(constants);

    try {
      injector.setKnownConstants(constants);
      Assert.fail("Expected IllegalStateException on setting known constants twice");
    } catch (IllegalStateException e) {
      // Expected
    }
  }

  @Test
  public void testReference_constructor() {
    Node node = IR.call(IR.name("fn"));
    JSModule module = new JSModule("mod");
    Reference ref = new Reference(node, module, InliningMode.DIRECT);
    Assert.assertEquals(node, ref.callNode);
    Assert.assertEquals(module, ref.module);
    Assert.assertEquals(InliningMode.DIRECT, ref.mode);
  }

  @Test
  public void testInliningMode_enumCoverage() {
    Assert.assertEquals(2, InliningMode.values().length);
    Assert.assertEquals(InliningMode.DIRECT, InliningMode.valueOf("DIRECT"));
    Assert.assertEquals(InliningMode.BLOCK, InliningMode.valueOf("BLOCK"));
  }

  @Test
  public void testCanInlineResult_enumCoverage() {
    Assert.assertEquals(3, CanInlineResult.values().length);
    Assert.assertEquals(CanInlineResult.YES, CanInlineResult.valueOf("YES"));
    Assert.assertEquals(CanInlineResult.AFTER_PREPARATION, CanInlineResult.valueOf("AFTER_PREPARATION"));
    Assert.assertEquals(CanInlineResult.NO, CanInlineResult.valueOf("NO"));
  }
}
