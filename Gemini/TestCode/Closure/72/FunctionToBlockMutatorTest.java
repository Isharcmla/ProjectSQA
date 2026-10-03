package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FunctionToBlockMutatorTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private static class SimpleIdSupplier implements Supplier<String> {
    private int id = 0;

    @Override
    public String get() {
      return String.valueOf(id++);
    }
  }

  private Node parse(String js) {
    Node root = compiler.parseTestCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    return root;
  }

  private Node findFunction(Node root, String name) {
    if (root.isFunction()) {
      if (name == null || name.isEmpty() || root.getFirstChild().getString().equals(name)) {
        return root;
      }
    }
    for (Node child = root.getFirstChild(); child != null; child = child.getNext()) {
      Node fn = findFunction(child, name);
      if (fn != null) {
        return fn;
      }
    }
    return null;
  }

  private Node findCall(Node root) {
    if (root.isCall()) {
      return root;
    }
    for (Node child = root.getFirstChild(); child != null; child = child.getNext()) {
      Node call = findCall(child);
      if (call != null) {
        return call;
      }
    }
    return null;
  }

  @Test
  public void testLabelNameSupplier() {
    Supplier<String> idSupplier = new SimpleIdSupplier();
    FunctionToBlockMutator.LabelNameSupplier supplier =
        new FunctionToBlockMutator.LabelNameSupplier(idSupplier);
    String label1 = supplier.get();
    String label2 = supplier.get();
    Assert.assertEquals("JSCompiler_inline_label_0", label1);
    Assert.assertEquals("JSCompiler_inline_label_1", label2);
  }

  @Test
  public void testMutate_simpleReturn_withResult() {
    Node root = parse("function foo(a, b) { return a + b; } foo(1, 2);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    FunctionToBlockMutator mutator =
        new FunctionToBlockMutator(compiler, new SimpleIdSupplier());
    Node result = mutator.mutate("foo", fn, call, "res", true, false);

    Assert.assertNotNull(result);
    Assert.assertTrue(result.isBlock());
    Assert.assertTrue(result.getFirstChild().isExprResult());
    Assert.assertTrue(result.getFirstChild().getFirstChild().isAssign());
  }

  @Test
  public void testMutate_simpleReturn_noResult() {
    Node root = parse("function foo(a, b) { return a + b; } foo(1, 2);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    FunctionToBlockMutator mutator =
        new FunctionToBlockMutator(compiler, new SimpleIdSupplier());
    Node result = mutator.mutate("foo", fn, call, null, false, false);

    Assert.assertNotNull(result);
    Assert.assertTrue(result.isBlock());
    Assert.assertTrue(result.getFirstChild().isExprResult());
    Assert.assertTrue(result.getFirstChild().getFirstChild().isAdd());
  }

  @Test
  public void testMutate_emptyReturn_withResult() {
    Node root = parse("function foo() { return; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    FunctionToBlockMutator mutator =
        new FunctionToBlockMutator(compiler, new SimpleIdSupplier());
    Node result = mutator.mutate("foo", fn, call, "res", true, false);

    Assert.assertNotNull(result);
    Assert.assertTrue(result.isBlock());
    Assert.assertTrue(result.getFirstChild().isExprResult());
    Node assign = result.getFirstChild().getFirstChild();
    Assert.assertTrue(assign.isAssign());
    Assert.assertTrue(assign.getLastChild().isVoid());
  }

  @Test
  public void testMutate_emptyReturn_noResult() {
    Node root = parse("function foo() { return; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    FunctionToBlockMutator mutator =
        new FunctionToBlockMutator(compiler, new SimpleIdSupplier());
    Node result = mutator.mutate("foo", fn, call, null, false, false);

    Assert.assertNotNull(result);
    Assert.assertTrue(result.isBlock());
    Assert.assertNull(result.getFirstChild());
  }

  @Test
  public void testMutate_noReturn_needsDefaultResult() {
    Node root = parse("function foo(a) { a = 1; } foo(2);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    FunctionToBlockMutator mutator =
        new FunctionToBlockMutator(compiler, new SimpleIdSupplier());
    Node result = mutator.mutate("foo", fn, call, "res", true, false);

    Assert.assertNotNull(result);
    Assert.assertTrue(result.isBlock());
    Node last = result.getLastChild();
    Assert.assertTrue(last.isExprResult());
    Assert.assertTrue(last.getFirstChild().isAssign());
  }

  @Test
  public void testMutate_noReturn_noNeedsDefaultResult() {
    Node root = parse("function foo(a) { a = 1; } foo(2);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    FunctionToBlockMutator mutator =
        new FunctionToBlockMutator(compiler, new SimpleIdSupplier());
    Node result = mutator.mutate("foo", fn, call, null, false, false);

    Assert.assertNotNull(result);
    Assert.assertTrue(result.isBlock());
    Assert.assertFalse(result.isEmpty());
  }

  @Test
  public void testMutate_multipleReturns_withResult() {
    Node root = parse("function foo(x) { if (x) { return 1; } return 2; } foo(true);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    FunctionToBlockMutator mutator =
        new FunctionToBlockMutator(compiler, new SimpleIdSupplier());
    Node result = mutator.mutate("foo", fn, call, "res", true, false);

    Assert.assertNotNull(result);
    Assert.assertTrue(result.isBlock());
    Assert.assertEquals(Token.LABEL, result.getFirstChild().getType());
  }

  @Test
  public void testMutate_multipleReturns_noResult() {
    Node root = parse("function foo(x) { if (x) { return; } return; } foo(false);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    FunctionToBlockMutator mutator =
        new FunctionToBlockMutator(compiler, new SimpleIdSupplier());
    Node result = mutator.mutate("foo", fn, call, null, false, false);

    Assert.assertNotNull(result);
    Assert.assertTrue(result.isBlock());
    Assert.assertEquals(Token.LABEL, result.getFirstChild().getType());
  }

  @Test
  public void testMutate_multipleReturns_withNestedFunctionAndExprResult() {
    Node root = parse(
        "function foo(x) { function bar() { return 10; } if (x) { return bar(); } return 20; } foo(true);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    FunctionToBlockMutator mutator =
        new FunctionToBlockMutator(compiler, new SimpleIdSupplier());
    Node result = mutator.mutate("foo", fn, call, "res", true, false);

    Assert.assertNotNull(result);
    Assert.assertTrue(result.isBlock());
    Assert.assertEquals(Token.LABEL, result.getFirstChild().getType());
  }

  @Test
  public void testMutate_modifiedParameters_createsLocalAliases() {
    Node root = parse("function foo(a, b) { a = a + 1; return a + b; } foo(10, 20);");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    FunctionToBlockMutator mutator =
        new FunctionToBlockMutator(compiler, new SimpleIdSupplier());
    Node result = mutator.mutate("foo", fn, call, "res", true, false);

    Assert.assertNotNull(result);
    Assert.assertTrue(result.isBlock());
    Node first = result.getFirstChild();
    Assert.assertTrue(first.isVar());
    Assert.assertEquals("a", first.getFirstChild().getString());
  }

  @Test
  public void testMutate_callInLoop_fixUninitializedVar() {
    Node root = parse("function foo() { var x; var y = 1; return x + y; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    FunctionToBlockMutator mutator =
        new FunctionToBlockMutator(compiler, new SimpleIdSupplier());
    Node result = mutator.mutate("foo", fn, call, "res", true, true);

    Assert.assertNotNull(result);
    Assert.assertTrue(result.isBlock());
    Node first = result.getFirstChild();
    Assert.assertTrue(first.isVar());
    Node varName = first.getFirstChild();
    Assert.assertTrue(varName.hasChildren());
    Assert.assertTrue(varName.getFirstChild().isVoid());
  }

  @Test
  public void testMutate_callInLoop_withInnerLoopStructure() {
    Node root = parse("function foo() { for (var k in {}) { var z; } return 0; } foo();");
    Node fn = findFunction(root, "foo");
    Node call = findCall(root);

    FunctionToBlockMutator mutator =
        new FunctionToBlockMutator(compiler, new SimpleIdSupplier());
    Node result = mutator.mutate("foo", fn, call, "res", true, true);

    Assert.assertNotNull(result);
    Assert.assertTrue(result.isBlock());
  }

  @Test
  public void testMutate_anonymousFunctionName() {
    Node root = parse("(function(a) { if (a) { return 1; } return 2; })(true);");
    Node fn = findFunction(root, "");
    Node call = findCall(root);

    FunctionToBlockMutator mutator =
        new FunctionToBlockMutator(compiler, new SimpleIdSupplier());
    Node resultNullName = mutator.mutate(null, fn, call, "res", true, false);
    Assert.assertNotNull(resultNullName);
    Assert.assertTrue(resultNullName.isBlock());

    Node resultEmptyName = mutator.mutate("", fn, call, "res", true, false);
    Assert.assertNotNull(resultEmptyName);
    Assert.assertTrue(resultEmptyName.isBlock());
  }
}
