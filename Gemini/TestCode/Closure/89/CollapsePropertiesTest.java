package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

public class CollapsePropertiesTest {

  private Compiler compiler;

  private Node test(String js, boolean collapseExterns, boolean inlineAliases) {
    return test("", js, collapseExterns, inlineAliases);
  }

  private Node test(String externsJs, String js, boolean collapseExterns, boolean inlineAliases) {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node externsNode = compiler.parseSyntheticCode("externs.js", externsJs);
    Node rootNode = compiler.parseSyntheticCode("test.js", js);

    CollapseProperties pass = new CollapseProperties(compiler, collapseExterns, inlineAliases);
    pass.process(externsNode, rootNode);
    return rootNode;
  }

  @Test
  public void testProcess_simpleObjectProperty_collapsed() {
    String js = "var a = {}; a.b = 1; var c = a.b;";
    Node root = test(js, false, true);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("a$b"));
  }

  @Test
  public void testProcess_nestedObjectLiteral_collapsed() {
    String js = "var a = {b: {c: 1}}; var d = a.b.c;";
    Node root = test(js, false, false);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("a$b$c"));
  }

  @Test
  public void testProcess_functionWithProperties_collapsed() {
    String js = "function a() {} a.b = 1; var c = a.b;";
    Node root = test(js, false, true);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("a$b"));
  }

  @Test
  public void testProcess_assignNodeDeclaration_collapsed() {
    String js = "var a; a = {}; a.b = 1; var c = a.b;";
    Node root = test(js, false, true);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_assignNodeDeclarationWithFunction_collapsed() {
    String js = "var a; a = { b: function() { return 1; } }; var c = a.b();";
    Node root = test(js, false, true);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("a$b"));
  }

  @Test
  public void testProcess_unsafeThisInStaticMethod_emitsWarning() {
    String js = "var a = {}; a.b = function() { return this.c; };";
    test(js, false, true);
    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(CollapseProperties.UNSAFE_THIS, compiler.getWarnings()[0].getType());
  }

  @Test
  public void testProcess_constructorWithThis_noWarning() {
    String js = "var a = {}; /** @constructor */ a.b = function() { this.c = 1; };";
    test(js, false, true);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testProcess_inlineAliases_localAliasInlined() {
    String js = "var a = {b: 1}; function f() { var x = a; return x.b; }";
    Node root = test(js, false, true);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("a$b"));
  }

  @Test
  public void testProcess_namespaceRedefined_emitsWarning() {
    String js = "var a = {}; /** @enum {number} */ a.b = { X: 1 }; a.b = { Y: 2 };";
    test(js, false, true);
    Assert.assertTrue(compiler.getWarningCount() > 0);
    boolean hasRedefinedWarn = false;
    for (JSError warn : compiler.getWarnings()) {
      if (warn.getType().equals(CollapseProperties.NAMESPACE_REDEFINED_WARNING)) {
        hasRedefinedWarn = true;
        break;
      }
    }
    Assert.assertTrue(hasRedefinedWarn);
  }

  @Test
  public void testProcess_namespaceAliased_emitsWarning() {
    String js = "var a = {}; /** @enum {number} */ a.b = { X: 1 }; var c = a.b; var d = a.b;";
    test(js, false, false);
    Assert.assertTrue(compiler.getWarningCount() > 0);
    boolean hasAliasedWarn = false;
    for (JSError warn : compiler.getWarnings()) {
      if (warn.getType().equals(CollapseProperties.UNSAFE_NAMESPACE_WARNING)) {
        hasAliasedWarn = true;
        break;
      }
    }
    Assert.assertTrue(hasAliasedWarn);
  }

  @Test
  public void testProcess_externTypesCollapsing_enabled() {
    String externs = "var String; String.foo = 1;";
    String js = "var x = String.foo;";
    Node root = test(externs, js, true, true);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_externTypesCollapsing_disabled() {
    String externs = "var String; String.foo = 1;";
    String js = "var x = String.foo;";
    Node root = test(externs, js, false, true);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_undeclaredPropertiesLocalScope_createsStub() {
    String js = "var a = {}; function f() { a.b = 1; }";
    Node root = test(js, false, true);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("var a$b;"));
  }

  @Test
  public void testProcess_propertyWithDollarSign_escapedCorrectly() {
    String js = "var a = {}; a.$b = 1; var c = a.$b;";
    Node root = test(js, false, true);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("a$$0b"));
  }

  @Test
  public void testProcess_objectLiteralNonIdentifierKeys_handledSafely() {
    String js = "var a = { 'hello world': 1, 123: 2, c: 3 }; var d = a.c;";
    Node root = test(js, false, true);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("a$c"));
  }

  @Test
  public void testProcess_chainedPropertyAccess_flattened() {
    String js = "var a = {}; a.b = {}; a.b.c = {}; a.b.c.d = 4; var e = a.b.c.d;";
    Node root = test(js, false, true);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("a$b$c$d"));
  }

  @Test
  public void testProcess_constantPropertyAnnotation_preserved() {
    String js = "var a = {}; /** @const */ a.B = 10; var c = a.B;";
    Node root = test(js, false, true);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("a$B"));
  }

  @Test
  public void testProcess_complexAssignmentTwinReference_handled() {
    String js = "var a = {}; var x; x = a.b = 1; var y = a.b;";
    Node root = test(js, false, true);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_emptySource_noError() {
    Node root = test("", false, false);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testProcess_noCollapsibleProperties_noError() {
    String js = "var x = 1; var y = 2;";
    Node root = test(js, false, true);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
  }
}
