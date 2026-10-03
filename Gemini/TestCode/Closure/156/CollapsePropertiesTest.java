package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

public class CollapsePropertiesTest {

  private void test(String js, String expected) {
    test(js, expected, null, true, true);
  }

  private void test(String js, String expected, DiagnosticType warning) {
    test(js, expected, warning, true, true);
  }

  private void test(String js, String expected, DiagnosticType warning,
      boolean collapsePropertiesOnExternTypes, boolean inlineAliases) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
    options.setWarningLevel(DiagnosticGroups.NON_STANDARD_JSDOC, CheckLevel.OFF);
    compiler.initOptions(options);

    Node externsNode = new Node(com.google.javascript.rhino.Token.BLOCK);
    Node rootNode = compiler.parseTestCode(js);

    CollapseProperties pass = new CollapseProperties(compiler,
        collapsePropertiesOnExternTypes, inlineAliases);
    pass.process(externsNode, rootNode);

    if (warning != null) {
      Assert.assertTrue("Expected warning: " + warning.key,
          compiler.getWarningCount() > 0);
      boolean found = false;
      for (JSError error : compiler.getWarnings()) {
        if (error.getType().equals(warning)) {
          found = true;
          break;
        }
      }
      Assert.assertTrue("Expected diagnostic type: " + warning.key, found);
    } else {
      Assert.assertEquals("Expected 0 warnings, found: " + compiler.getWarnings(),
          0, compiler.getWarningCount());
    }

    if (expected != null) {
      Node expectedRoot = compiler.parseTestCode(expected);
      String actualCode = compiler.toSource(rootNode);
      String expectedCode = compiler.toSource(expectedRoot);
      Assert.assertEquals(expectedCode, actualCode);
    }
  }

  private void testExterns(String externs, String js, String expected,
      boolean collapsePropertiesOnExternTypes, boolean inlineAliases) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node externsNode = compiler.parseTestCode(externs);
    Node rootNode = compiler.parseTestCode(js);

    CollapseProperties pass = new CollapseProperties(compiler,
        collapsePropertiesOnExternTypes, inlineAliases);
    pass.process(externsNode, rootNode);

    if (expected != null) {
      Node expectedRoot = compiler.parseTestCode(expected);
      Assert.assertEquals(compiler.toSource(expectedRoot), compiler.toSource(rootNode));
    }
  }

  @Test
  public void testProcess_simpleObjectLiteral_collapsesProperties() {
    test("var a = {b: 1}; var c = a.b;",
         "var a$b = 1; var c = a$b;");
  }

  @Test
  public void testProcess_nestedObjectLiteral_collapsesProperties() {
    test("var a = {b: {c: 1}}; var d = a.b.c;",
         "var a$b$c = 1; var d = a$b$c;");
  }

  @Test
  public void testProcess_propertyWithDollarSign_escapesCorrectly() {
    test("var a = {}; a['b$c'] = 1; var d = a['b$c'];",
         "var a = {}; a['b$c'] = 1; var d = a['b$c'];");
    test("var a = {}; a.b$c = 1; var d = a.b$c;",
         "var a$b$0c = 1; var d = a$b$0c;");
  }

  @Test
  public void testProcess_functionNamespace_collapsesProperties() {
    test("function a() {} a.b = 1; var c = a.b;",
         "function a() {} var a$b = 1; var c = a$b;");
  }

  @Test
  public void testProcess_globalObjectLiteralAssignedMultipleTimes_doesNotCollapse() {
    test("var a = {b: 1}; a = {b: 2}; var c = a.b;",
         "var a = {b: 1}; a = {b: 2}; var c = a.b;");
  }

  @Test
  public void testProcess_localAliasInlining_inlinesAndCollapses() {
    test("var a = {b: 1}; function f() { var x = a; return x.b; }",
         "var a$b = 1; function f() { var x = null; return a$b; }",
         null, true, true);
  }

  @Test
  public void testProcess_localAliasInliningDisabled_doesNotInlineAlias() {
    test("var a = {b: 1}; function f() { var x = a; return x.b; }",
         "var a = {b: 1}; function f() { var x = a; return x.b; }",
         CollapseProperties.UNSAFE_NAMESPACE_WARNING, true, false);
  }

  @Test
  public void testProcess_redefinedNamespace_emitsWarning() {
    test("var a = {}; /** @constructor */ a.b = function() {}; a.b = function() {};",
         null,
         CollapseProperties.NAMESPACE_REDEFINED_WARNING);
  }

  @Test
  public void testProcess_unsafeNamespaceAliasing_emitsWarning() {
    test("var a = {}; /** @constructor */ a.b = function() {}; var c = a; var d = c.b;",
         null,
         CollapseProperties.UNSAFE_NAMESPACE_WARNING);
  }

  @Test
  public void testProcess_unsafeThisInStaticMethod_emitsWarning() {
    test("var a = {}; a.b = function() { return this.c; };",
         "var a$b = function() { return this.c; };",
         CollapseProperties.UNSAFE_THIS);
  }

  @Test
  public void testProcess_safeThisInConstructor_noWarning() {
    test("var a = {}; /** @constructor */ a.b = function() { this.c = 1; };",
         "var a$b = function() { this.c = 1; };");
  }

  @Test
  public void testProcess_safeThisWithJsDocThis_noWarning() {
    test("var a = {}; /** @this {Object} */ a.b = function() { this.c = 1; };",
         "var a$b = function() { this.c = 1; };");
  }

  @Test
  public void testProcess_lateAddedPropertyInLocalScope_createsStubVar() {
    test("var a = {}; function f() { a.b = 1; } var c = a.b;",
         "var a = {}; var a$b; function f() { a$b = 1; } var c = a$b;");
  }

  @Test
  public void testProcess_complexAssignment_collapsesProperly() {
    test("var a = {}; var b = a.c = 1; var d = a.c;",
         "var a$c; var a = {}; var b = a$c = 1; var d = a$c;");
  }

  @Test
  public void testProcess_getterAndSetterInObjectLit_doesNotCollapseKeys() {
    test("var a = { get b() { return 1; }, set b(val) {} }; var c = a.b;",
         "var a = { get b() { return 1; }, set b(val) {} }; var c = a.b;");
  }

  @Test
  public void testProcess_nonIdentifierKeyInObjectLit_preservesBehavior() {
    test("var a = { 'invalid identifier': 1, b: 2 }; var c = a.b;",
         "var a$1 = 1; var a$b = 2; var c = a$b;");
  }

  @Test
  public void testProcess_numericKeyInObjectLit_preservesBehavior() {
    test("var a = { 0: 1, b: 2 }; var c = a.b;",
         "var a$1 = 1; var a$b = 2; var c = a$b;");
  }

  @Test
  public void testProcess_collapsePropertiesOnExternTypes_true() {
    testExterns("var String;",
        "String.foo = 1; var c = String.foo;",
        "var String$foo = 1; var c = String$foo;",
        true, true);
  }

  @Test
  public void testProcess_collapsePropertiesOnExternTypes_false() {
    testExterns("var String;",
        "String.foo = 1; var c = String.foo;",
        "String.foo = 1; var c = String.foo;",
        false, true);
  }

  @Test
  public void testProcess_emptyRoot_noException() {
    Compiler compiler = new Compiler();
    Node externsNode = new Node(com.google.javascript.rhino.Token.BLOCK);
    Node rootNode = new Node(com.google.javascript.rhino.Token.BLOCK);
    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(externsNode, rootNode);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testProcess_constantProperties_preservesConstantAnnotation() {
    test("var a = {}; /** @const */ a.CONST_VAL = 1; var c = a.CONST_VAL;",
         "/** @const */ var a$CONST_VAL = 1; var c = a$CONST_VAL;");
  }
}
