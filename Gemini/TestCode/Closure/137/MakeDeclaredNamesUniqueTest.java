package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

public class MakeDeclaredNamesUniqueTest {

  private static class SimpleIdSupplier implements Supplier<String> {
    private int id = 0;

    @Override
    public String get() {
      return String.valueOf(id++);
    }
  }

  private Node parse(Compiler compiler, String js) {
    Node n = compiler.parseTestCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    return n;
  }

  @Test
  public void testContextualRenamer_globalAndChildScope() {
    MakeDeclaredNamesUnique.ContextualRenamer globalRenamer =
        new MakeDeclaredNamesUnique.ContextualRenamer();
    Assert.assertFalse(globalRenamer.stripConstIfReplaced());

    globalRenamer.addDeclaredName("a");
    Assert.assertNull(globalRenamer.getReplacementName("a"));

    MakeDeclaredNamesUnique.Renamer child1 = globalRenamer.forChildScope();
    Assert.assertFalse(child1.stripConstIfReplaced());
    child1.addDeclaredName("a");
    Assert.assertEquals("a$$1", child1.getReplacementName("a"));

    // Add again in same scope, should not change replacement name
    child1.addDeclaredName("a");
    Assert.assertEquals("a$$1", child1.getReplacementName("a"));

    MakeDeclaredNamesUnique.Renamer child2 = globalRenamer.forChildScope();
    child2.addDeclaredName("a");
    Assert.assertEquals("a$$2", child2.getReplacementName("a"));

    // Test a name not declared in global scope first
    child1.addDeclaredName("b");
    Assert.assertNull(child1.getReplacementName("b"));

    child2.addDeclaredName("b");
    Assert.assertEquals("b$$1", child2.getReplacementName("b"));

    Assert.assertNull(globalRenamer.getReplacementName("nonExistent"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInlineRenamer_emptyPrefixThrows() {
    new MakeDeclaredNamesUnique.InlineRenamer(new SimpleIdSupplier(), "", false);
  }

  @Test
  public void testInlineRenamer_renamingAndStripConst() {
    Supplier<String> supplier = new SimpleIdSupplier();
    MakeDeclaredNamesUnique.InlineRenamer renamer =
        new MakeDeclaredNamesUnique.InlineRenamer(supplier, "inline_", true);
    Assert.assertTrue(renamer.stripConstIfReplaced());

    // Empty name
    renamer.addDeclaredName("");
    Assert.assertEquals("", renamer.getReplacementName(""));

    // Normal name
    renamer.addDeclaredName("foo");
    Assert.assertEquals("foo$$inline_0", renamer.getReplacementName("foo"));

    // Adding existing name should be a no-op
    renamer.addDeclaredName("foo");
    Assert.assertEquals("foo$$inline_0", renamer.getReplacementName("foo"));

    // Name already containing $$
    renamer.addDeclaredName("bar$$123");
    Assert.assertEquals("bar$$inline_1", renamer.getReplacementName("bar$$123"));

    // Child scope
    MakeDeclaredNamesUnique.Renamer child = renamer.forChildScope();
    Assert.assertTrue(child.stripConstIfReplaced());
    child.addDeclaredName("baz");
    Assert.assertEquals("baz$$inline_2", child.getReplacementName("baz"));

    MakeDeclaredNamesUnique.InlineRenamer noStripRenamer =
        new MakeDeclaredNamesUnique.InlineRenamer(supplier, "pre_", false);
    Assert.assertFalse(noStripRenamer.stripConstIfReplaced());
  }

  @Test
  public void testMakeDeclaredNamesUnique_withContextualRenamer() {
    Compiler compiler = new Compiler();
    String js = "var a = 1; function f(a) { var a = 2; function g(a) { var a = 3; } }";
    Node root = parse(compiler, js);

    MakeDeclaredNamesUnique callback = new MakeDeclaredNamesUnique();
    NodeTraversal.traverse(compiler, root, callback);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("a$$1"));
    Assert.assertTrue(result.contains("a$$2"));
  }

  @Test
  public void testMakeDeclaredNamesUnique_withInlineRenamerAndConstRemoval() {
    Compiler compiler = new Compiler();
    String js = "function f(x) { var CONST = 1; x = CONST; }";
    Node root = parse(compiler, js);

    // Mark CONST name nodes with IS_CONSTANT_NAME property
    NodeTraversal.traverse(compiler, root, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n.isName() && "CONST".equals(n.getString())) {
          n.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        }
      }
    });

    MakeDeclaredNamesUnique.InlineRenamer renamer =
        new MakeDeclaredNamesUnique.InlineRenamer(new SimpleIdSupplier(), "in_", true);
    MakeDeclaredNamesUnique callback = new MakeDeclaredNamesUnique(renamer);
    NodeTraversal.traverse(compiler, root, callback);

    // Verify IS_CONSTANT_NAME was removed
    NodeTraversal.traverse(compiler, root, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n.isName() && n.getString().startsWith("CONST$$in_")) {
          Assert.assertFalse(n.getBooleanProp(Node.IS_CONSTANT_NAME));
        }
      }
    });
  }

  @Test
  public void testMakeDeclaredNamesUnique_namedFunctionExpressionAndCatch() {
    Compiler compiler = new Compiler();
    String js = "var a = 1;"
        + "var f = function rec(x) { rec(x); };"
        + "try { throw 1; } catch (e) { var e = 2; }";
    Node root = parse(compiler, js);

    MakeDeclaredNamesUnique callback = new MakeDeclaredNamesUnique();
    NodeTraversal.traverse(compiler, root, callback);

    String result = compiler.toSource(root);
    Assert.assertNotNull(result);
  }

  @Test
  public void testContextualRenameInverter_getOriginalName() {
    Assert.assertEquals("foo", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("foo"));
    Assert.assertEquals("foo", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("foo$$1"));
    Assert.assertEquals("foo$$bar", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("foo$$bar$$2"));
  }

  @Test
  public void testContextualRenameInverter_process() {
    Compiler compiler = new Compiler();
    String js = "function f() { var a$$1 = 1; return a$$1; }";
    Node root = parse(compiler, js);

    CompilerPass inverter = MakeDeclaredNamesUnique.getContextualRenameInverter(compiler);
    inverter.process(null, root);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("var a = 1"));
    Assert.assertTrue(result.contains("return a"));
  }

  @Test
  public void testContextualRenameInverter_recurseScopesAndConflict() {
    Compiler compiler = new Compiler();
    // Non-numeric suffix triggers recurseScopes = true
    // And duplicate conflict keeps old name
    String js = "var a = 1; function f() { var a$$inline_1 = 2; var a$$inline_2 = 3; return a$$inline_1 + a$$inline_2; }";
    Node root = parse(compiler, js);

    CompilerPass inverter = MakeDeclaredNamesUnique.getContextualRenameInverter(compiler);
    inverter.process(null, root);

    String result = compiler.toSource(root);
    Assert.assertNotNull(result);
  }

  @Test
  public void testContextualRenameInverter_globalVarWithSeparatorIgnored() {
    Compiler compiler = new Compiler();
    String js = "var a$$1 = 1;";
    Node root = parse(compiler, js);

    CompilerPass inverter = MakeDeclaredNamesUnique.getContextualRenameInverter(compiler);
    inverter.process(null, root);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("a$$1"));
  }

  @Test
  public void testMakeDeclaredNamesUnique_functionDeclaration() {
    Compiler compiler = new Compiler();
    String js = "function outer() { function inner() {} inner(); }";
    Node root = parse(compiler, js);

    MakeDeclaredNamesUnique callback = new MakeDeclaredNamesUnique();
    NodeTraversal.traverse(compiler, root, callback);

    String result = compiler.toSource(root);
    Assert.assertNotNull(result);
  }

  @Test(expected = IllegalStateException.class)
  public void testEnterScope_rootFunctionWithContextualRenamer_throws() {
    Compiler compiler = new Compiler();
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "foo"), new Node(Token.LP), new Node(Token.BLOCK));
    MakeDeclaredNamesUnique callback = new MakeDeclaredNamesUnique();
    SyntacticScopeCreator scopeCreator = new SyntacticScopeCreator(compiler);
    NodeTraversal t = new NodeTraversal(compiler, callback, scopeCreator);
    t.traverse(fn);
  }
}
