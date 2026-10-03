package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FunctionInjectorTest {

  private Compiler compiler;
  private Supplier<String> safeNameIdSupplier;
  private int idCounter;

  @Before
  public void setUp() {
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    idCounter = 0;
    safeNameIdSupplier = new Supplier<String>() {
      @Override
      public String get() {
        return "temp_" + (idCounter++);
      }
    };
  }

  private FunctionInjector createInjector(
      boolean allowDecomposition,
      boolean assumeStrictThis,
      boolean assumeMinimumCapture) {
    return new FunctionInjector(
        compiler,
        safeNameIdSupplier,
        allowDecomposition,
        assumeStrictThis,
        assumeMinimumCapture);
  }

  private Node parse(String js) {
    return compiler.parseTestCode(js);
  }

  private Node findFunction(Node root, final String name) {
    final Node[] result = new Node[1];
    NodeTraversal.traverse(compiler, root, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n.isFunction()) {
          if (name == null || name.isEmpty() || name.equals(NodeUtil.getNearestFunctionName(n))) {
            if (result[0] == null) {
              result[0] = n;
            }
          }
        }
      }
    });
    return result[0];
  }

  private Node findCall(Node root) {
    final Node[] result = new Node[1];
    NodeTraversal.traverse(compiler, root, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n.isCall() && result[0] == null) {
          result[0] = n;
        }
      }
    });
    return result[0];
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullCompiler_throwsException() {
    new FunctionInjector(null, safeNameIdSupplier, true, true, true);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullSupplier_throwsException() {
    new FunctionInjector(compiler, null, true, true, true);
  }

  @Test
  public void testSetKnownConstants_normalAndDuplicate() {
    FunctionInjector injector = createInjector(true, true, true);
    Set<String> constants = Sets.newHashSet("CONST_A", "CONST_B");
    injector.setKnownConstants(constants);

    try {
      injector.setKnownConstants(constants);
      Assert.fail("Expected IllegalStateException on setting known constants twice");
    } catch (IllegalStateException e) {
      Assert.assertNotNull(e.getMessage());
    }
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_validFunctions() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo(a, b) { return a + b; }");
    Node fn = findFunction(root, "foo");

    Assert.assertTrue(injector.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_emptyFunction() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() {}");
    Node fn = findFunction(root, "foo");

    Assert.assertTrue(injector.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_referencesSelfDirectly() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return foo(); }");
    Node fn = findFunction(root, "foo");

    Assert.assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_namedFunctionExpressionSelfRecursion() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("var bar = function rec() { return rec(); };");
    Node fn = findFunction(root, "rec");

    Assert.assertFalse(injector.doesFunctionMeetMinimumRequirements("bar", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_referencesEval() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { eval('1'); }");
    Node fn = findFunction(root, "foo");

    Assert.assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_referencesArguments() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return arguments[0]; }");
    Node fn = findFunction(root, "foo");

    Assert.assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_cases() {
    FunctionInjector injector = createInjector(true, true, true);

    Node emptyFn = findFunction(parse("function foo() {}"), "foo");
    Assert.assertTrue(injector.isDirectCallNodeReplacementPossible(emptyFn));

    Node returnValFn = findFunction(parse("function foo() { return 1; }"), "foo");
    Assert.assertTrue(injector.isDirectCallNodeReplacementPossible(returnValFn));

    Node emptyReturnFn = findFunction(parse("function foo() { return; }"), "foo");
    Assert.assertFalse(injector.isDirectCallNodeReplacementPossible(emptyReturnFn));

    Node multiStmtFn = findFunction(parse("function foo() { var a = 1; return a; }"), "foo");
    Assert.assertFalse(injector.isDirectCallNodeReplacementPossible(multiStmtFn));

    Node nonReturnSingleStmt = findFunction(parse("function foo() { var a = 1; }"), "foo");
    Assert.assertFalse(injector.isDirectCallNodeReplacementPossible(nonReturnSingleStmt));
  }

  @Test
  public void testCanInlineReferenceToFunction_applyCall_returnsNo() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return 1; } foo.apply(null, []);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);
    NodeTraversal t = new NodeTraversal(compiler, null);

    FunctionInjector.CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(),
        FunctionInjector.InliningMode.DIRECT, false, false);

    Assert.assertEquals(FunctionInjector.CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_dotCallSupported() {
    FunctionInjector injectorStrict = createInjector(true, true, true);
    Node root = parse("function foo() { return 1; } foo.call(this);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);
    NodeTraversal t = new NodeTraversal(compiler, null);

    FunctionInjector.CanInlineResult resStrict = injectorStrict.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(),
        FunctionInjector.InliningMode.DIRECT, false, false);
    Assert.assertEquals(FunctionInjector.CanInlineResult.YES, resStrict);

    FunctionInjector injectorNonStrict = createInjector(true, false, true);
    Node rootNotThis = parse("function foo() { return 1; } foo.call(obj);");
    Node callNotThis = findCall(rootNotThis);
    FunctionInjector.CanInlineResult resNonStrict = injectorNonStrict.canInlineReferenceToFunction(
        t, callNotThis, fn, Collections.<String>emptySet(),
        FunctionInjector.InliningMode.DIRECT, false, false);
    Assert.assertEquals(FunctionInjector.CanInlineResult.NO, resNonStrict);
  }

  @Test
  public void testCanInlineReferenceToFunction_referencesThisWithoutCall() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { this.a = 1; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);
    NodeTraversal t = new NodeTraversal(compiler, null);

    FunctionInjector.CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(),
        FunctionInjector.InliningMode.DIRECT, true, false);
    Assert.assertEquals(FunctionInjector.CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_containsFunctionsInLoop() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return function() {}; } while(true) { foo(); }");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);
    NodeTraversal t = new NodeTraversal(compiler, null);

    FunctionInjector.CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(),
        FunctionInjector.InliningMode.DIRECT, false, true);
    Assert.assertEquals(FunctionInjector.CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_containsFunctionsNonGlobalScopeNoMinCapture() {
    FunctionInjector injector = createInjector(true, true, false);
    Node root = parse("function outer() { function foo() { return function() {}; } foo(); }");
    final Node fn = findFunction(root, "foo");
    final Node call = findCall(root);

    final FunctionInjector.CanInlineResult[] result = new FunctionInjector.CanInlineResult[1];
    NodeTraversal.traverse(compiler, root, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n == call) {
          result[0] = createInjector(true, true, false).canInlineReferenceToFunction(
              t, call, fn, Collections.<String>emptySet(),
              FunctionInjector.InliningMode.BLOCK, false, true);
        }
      }
    });
    Assert.assertEquals(FunctionInjector.CanInlineResult.NO, result[0]);
  }

  @Test
  public void testCanInlineReferenceToFunction_directSideEffectsAndMultiUseArgs() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo(a) { return a + a; } foo(x++);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);
    NodeTraversal t = new NodeTraversal(compiler, null);

    FunctionInjector.CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Collections.<String>emptySet(),
        FunctionInjector.InliningMode.DIRECT, false, false);
    Assert.assertEquals(FunctionInjector.CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_blockInliningClassifications() {
    FunctionInjector decompInjector = createInjector(true, true, true);
    FunctionInjector noDecompInjector = createInjector(false, true, true);

    Node rootExpr = parse("function foo() { var x = 1; return x; } if (foo()) {}");
    Node fnExpr = findFunction(rootExpr, "foo");
    Node callExpr = findCall(rootExpr);
    NodeTraversal tExpr = new NodeTraversal(compiler, null);

    Assert.assertEquals(
        FunctionInjector.CanInlineResult.AFTER_PREPARATION,
        decompInjector.canInlineReferenceToFunction(
            tExpr, callExpr, fnExpr, Collections.<String>emptySet(),
            FunctionInjector.InliningMode.BLOCK, false, false));

    Assert.assertEquals(
        FunctionInjector.CanInlineResult.NO,
        noDecompInjector.canInlineReferenceToFunction(
            tExpr, callExpr, fnExpr, Collections.<String>emptySet(),
            FunctionInjector.InliningMode.BLOCK, false, false));
  }

  @Test
  public void testCanInlineReferenceToFunction_blockInliningWithTempsAndEvalInCaller() {
    final FunctionInjector injector = createInjector(true, true, false);
    Node root = parse("function caller(p) { eval(''); foo(p); } function foo(a) { var v = a; return v; }");
    final Node fn = findFunction(root, "foo");
    final Node call = findCall(root);
    final FunctionInjector.CanInlineResult[] result = new FunctionInjector.CanInlineResult[1];

    NodeTraversal.traverse(compiler, root, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n == call) {
          result[0] = injector.canInlineReferenceToFunction(
              t, call, fn, Collections.<String>emptySet(),
              FunctionInjector.InliningMode.BLOCK, false, false);
        }
      }
    });

    Assert.assertEquals(FunctionInjector.CanInlineResult.NO, result[0]);
  }

  @Test
  public void testMaybePrepareCall_andInline_directMode() {
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    FunctionInjector injector = createInjector(true, true, true);

    Node root = parse("function foo(a) { return a + 1; } var x = foo(2);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    injector.maybePrepareCall(call);
    Node inlined = injector.inline(call, "foo", fn, FunctionInjector.InliningMode.DIRECT);

    Assert.assertNotNull(inlined);
    Assert.assertTrue(inlined.isAdd());
  }

  @Test
  public void testInline_directMode_emptyFunction() {
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    FunctionInjector injector = createInjector(true, true, true);

    Node root = parse("function foo() {} var x = foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    Node inlined = injector.inline(call, "foo", fn, FunctionInjector.InliningMode.DIRECT);
    Assert.assertNotNull(inlined);
    Assert.assertEquals(Token.VOID, inlined.getType());
  }

  @Test
  public void testMaybePrepareCall_andInline_blockMode_simpleCall() {
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    FunctionInjector injector = createInjector(true, true, true);

    Node root = parse("function foo() { var a = 1; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    injector.maybePrepareCall(call);
    Node inlined = injector.inline(call, "foo", fn, FunctionInjector.InliningMode.BLOCK);

    Assert.assertNotNull(inlined);
    Assert.assertTrue(inlined.isBlock());
  }

  @Test
  public void testMaybePrepareCall_andInline_blockMode_simpleAssignment() {
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    FunctionInjector injector = createInjector(true, true, true);

    Node root = parse("function foo() { return 1; } var x; x = foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    injector.maybePrepareCall(call);
    Node inlined = injector.inline(call, "foo", fn, FunctionInjector.InliningMode.BLOCK);

    Assert.assertNotNull(inlined);
    Assert.assertTrue(inlined.isBlock());
  }

  @Test
  public void testMaybePrepareCall_andInline_blockMode_varDeclAssignment() {
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    FunctionInjector injector = createInjector(true, true, true);

    Node root = parse("function foo() { return 1; } var x = foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    injector.maybePrepareCall(call);
    Node inlined = injector.inline(call, "foo", fn, FunctionInjector.InliningMode.BLOCK);

    Assert.assertNotNull(inlined);
    Assert.assertTrue(inlined.isBlock());
  }

  @Test
  public void testMaybePrepareCall_andInline_blockMode_expression() {
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    FunctionInjector injector = createInjector(true, true, true);

    Node root = parse("function foo() { return 1; } var y = 2 + foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    injector.maybePrepareCall(call);
    Node inlined = injector.inline(call, "foo", fn, FunctionInjector.InliningMode.BLOCK);

    Assert.assertNotNull(inlined);
    Assert.assertTrue(inlined.isBlock());
  }

  @Test(expected = IllegalStateException.class)
  public void testInline_notNormalizedLifecycle_throwsException() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return 1; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    injector.inline(call, "foo", fn, FunctionInjector.InliningMode.DIRECT);
  }

  @Test(expected = IllegalStateException.class)
  public void testInline_blockModeUnpreparedExpression_throwsException() {
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    FunctionInjector injector = createInjector(true, true, true);

    Node root = parse("function foo() { return 1; } if (foo()) {}");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    injector.inline(call, "foo", fn, FunctionInjector.InliningMode.BLOCK);
  }

  @Test
  public void testInliningLowersCost_emptyRefs() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return 1; }");
    Node fn = findFunction(root, "foo");

    boolean lowers = injector.inliningLowersCost(
        null, fn, Collections.<FunctionInjector.Reference>emptyList(),
        Collections.<String>emptySet(), true, false);

    Assert.assertTrue(lowers);
  }

  @Test
  public void testInliningLowersCost_singleDirectRemovable() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { return 1; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    FunctionInjector.Reference ref = new FunctionInjector.Reference(
        call, null, FunctionInjector.InliningMode.DIRECT);
    List<FunctionInjector.Reference> refs = ImmutableList.of(ref);

    boolean lowers = injector.inliningLowersCost(
        null, fn, refs, Collections.<String>emptySet(), true, false);

    Assert.assertTrue(lowers);
  }

  @Test
  public void testInliningLowersCost_singleBlockRemovable() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() { var a = 1; var b = 2; return a + b; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    FunctionInjector.Reference ref = new FunctionInjector.Reference(
        call, null, FunctionInjector.InliningMode.BLOCK);
    List<FunctionInjector.Reference> refs = ImmutableList.of(ref);

    boolean lowers = injector.inliningLowersCost(
        null, fn, refs, Collections.<String>emptySet(), true, false);

    Assert.assertTrue(lowers);
  }

  @Test
  public void testInliningLowersCost_multipleCallsAndModuleCheck() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo(a, b) { return a + b; } foo(1, 2); foo(3, 4);");
    Node fn = findFunction(root, "foo");
    Node call1 = findCall(root);
    Node call2 = call1.getParent().getNext().getFirstChild();

    JSModule mod1 = new JSModule("m1");
    JSModule mod2 = new JSModule("m2");
    JSModuleGraph graph = new JSModuleGraph(new JSModule[] { mod1, mod2 });
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    compiler.initModules(ImmutableList.of(mod1, mod2), new CompilerOptions());

    FunctionInjector injectorWithGraph = new FunctionInjector(
        compiler, safeNameIdSupplier, true, true, true);

    FunctionInjector.Reference ref1 = new FunctionInjector.Reference(
        call1, mod1, FunctionInjector.InliningMode.DIRECT);
    FunctionInjector.Reference ref2 = new FunctionInjector.Reference(
        call2, mod2, FunctionInjector.InliningMode.DIRECT);
    List<FunctionInjector.Reference> refs = ImmutableList.of(ref1, ref2);

    Set<String> aliases = new HashSet<String>();
    aliases.add("alias1");

    boolean lowers = injectorWithGraph.inliningLowersCost(
        mod1, fn, refs, aliases, true, true);

    Assert.assertTrue(lowers);
  }

  @Test
  public void testInliningLowersCost_emptyFunctionAndBlockMode() {
    FunctionInjector injector = createInjector(true, true, true);
    Node root = parse("function foo() {} foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    FunctionInjector.Reference ref = new FunctionInjector.Reference(
        call, null, FunctionInjector.InliningMode.BLOCK);
    List<FunctionInjector.Reference> refs = ImmutableList.of(ref);

    boolean lowers = injector.inliningLowersCost(
        null, fn, refs, Collections.<String>emptySet(), false, false);

    Assert.assertTrue(lowers);
  }

  @Test
  public void testInliningLowersCost_largeFunctionNotLoweringCost() {
    FunctionInjector injector = createInjector(true, true, true);
    StringBuilder sb = new StringBuilder("function foo() {");
    for (int i = 0; i < 50; i++) {
      sb.append("var v").append(i).append(" = ").append(i).append(";");
    }
    sb.append("return v0; } foo(); foo();");

    Node root = parse(sb.toString());
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    FunctionInjector.Reference ref1 = new FunctionInjector.Reference(
        call, null, FunctionInjector.InliningMode.BLOCK);
    FunctionInjector.Reference ref2 = new FunctionInjector.Reference(
        call, null, FunctionInjector.InliningMode.BLOCK);
    List<FunctionInjector.Reference> refs = ImmutableList.of(ref1, ref2);

    boolean lowers = injector.inliningLowersCost(
        null, fn, refs, Collections.<String>emptySet(), false, false);

    Assert.assertFalse(lowers);
  }
}
