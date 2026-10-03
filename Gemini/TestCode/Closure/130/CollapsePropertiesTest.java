package com.google.javascript.jscomp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CollapsePropertiesTest extends CompilerTestCase {

  private boolean collapsePropertiesOnExternTypes = false;
  private boolean inlineAliases = true;

  public CollapsePropertiesTest() {
    super();
  }

  @Override
  @Before
  public void setUp() throws Exception {
    super.setUp();
    collapsePropertiesOnExternTypes = false;
    inlineAliases = true;
    enableNormalize();
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new CollapseProperties(
        compiler, collapsePropertiesOnExternTypes, inlineAliases);
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  @Test
  public void testProcess_simpleObjectLiteral_collapsesCorrectly() {
    test("var a = {b: 1}; a.b;", "var a$b = 1; a$b;");
  }

  @Test
  public void testProcess_nestedObjectLiteral_collapsesCorrectly() {
    test("var a = {b: {c: 1}}; a.b.c;", "var a$b$c = 1; a$b$c;");
  }

  @Test
  public void testProcess_objectWithDollarInPropertyName_collapsesWithDollarZero() {
    test("var a = {'b$c': 1}; a['b$c'];", "var a = {'b$c': 1}; a['b$c'];");
    test("var a = {}; a.b$c = 1; a.b$c;", "var a$b$0c = 1; a$b$0c;");
  }

  @Test
  public void testProcess_globalFunctionDeclaration_collapsesProperties() {
    test("function a() {} a.b = 1; a.b;", "function a() {} var a$b = 1; a$b;");
  }

  @Test
  public void testProcess_functionWithThisReferenced_warnsUnsafeThis() {
    testWarning("var a = {}; a.b = function() { return this.x; };",
        CollapseProperties.UNSAFE_THIS);
  }

  @Test
  public void testProcess_functionWithConstructorAnnotation_noUnsafeThisWarning() {
    test("var a = {}; /** @constructor */ a.b = function() { this.x = 1; }; var c = new a.b();",
         "/** @constructor */ var a$b = function() { this.x = 1; }; var c = new a$b();");
  }

  @Test
  public void testProcess_functionWithThisAnnotation_noUnsafeThisWarning() {
    test("var a = {}; /** @this {Object} */ a.b = function() { this.x = 1; };",
         "/** @this {Object} */ var a$b = function() { this.x = 1; };");
  }

  @Test
  public void testProcess_objectLiteralFunctionKeyWithThis_warnsUnsafeThis() {
    testWarning("var a = { b: function() { return this.x; } };",
        CollapseProperties.UNSAFE_THIS);
  }

  @Test
  public void testProcess_redefinedNamespace_warnsNamespaceRedefined() {
    testWarning("/** @const */ var ns = {}; /** @const */ ns = {};",
        CollapseProperties.NAMESPACE_REDEFINED_WARNING);
  }

  @Test
  public void testProcess_aliasedNamespace_warnsUnsafeNamespace() {
    inlineAliases = false;
    testWarning("/** @const */ var ns = {}; var alias = ns;",
        CollapseProperties.UNSAFE_NAMESPACE_WARNING);
  }

  @Test
  public void testProcess_inlineAliasesEnabled_inlinesLocalAlias() {
    inlineAliases = true;
    test(
        "var a = {b: 1}; function f() { var x = a; return x.b; }",
        "var a$b = 1; function f() { var x = null; return a$b; }");
  }

  @Test
  public void testProcess_inlineAliasesDisabled_doesNotInlineLocalAlias() {
    inlineAliases = false;
    testSame("var a = {b: 1}; function f() { var x = a; return x.b; }");
  }

  @Test
  public void testProcess_nonSimpleKeyInObjectLit_handledProperly() {
    test("var a = {'123': 1};", "var a$1 = 1;");
  }

  @Test
  public void testProcess_getterSetterInObjectLit_ignoredFromCollapse() {
    testSame("var a = { get b() { return 1; }, set b(x) {} };");
  }

  @Test
  public void testProcess_callFreeTarget_marksFreeCall() {
    test("var a = {b: function() {}};\n a.b();",
        "var a$b = function() {};\n a$b();");
  }

  @Test
  public void testProcess_chainedPropertyAccess_flattensCorrectly() {
    test("var a = {}; a.b = {}; a.b.c = 1; var x = a.b.c;",
        "var a$b$c = 1; var x = a$b$c;");
  }

  @Test
  public void testProcess_stubDeclarationInLocalScope_addsGlobalStub() {
    test("var a = {}; function f() { a.b = 1; }",
        "var a$b; function f() { a$b = 1; }");
  }

  @Test
  public void testProcess_complexAssignmentTwinReferences_flattensCorrectly() {
    test("var a = {}; var b; b = a.c = 1; b; a.c;",
        "var a$c; var b; b = a$c = 1; b; a$c;");
  }

  @Test
  public void testProcess_collapsePropertiesOnExternTypesTrue_processesExternProps() {
    collapsePropertiesOnExternTypes = true;
    test(
        "String.foo = 1; String.foo;",
        "var String$foo = 1; String$foo;");
  }

  @Test
  public void testProcess_collapsePropertiesOnExternTypesFalse_ignoresExternProps() {
    collapsePropertiesOnExternTypes = false;
    testSame("String.foo = 1; String.foo;");
  }

  @Test
  public void testProcess_emptySource_noChanges() {
    testSame("");
  }

  @Test
  public void testProcess_constantPropertyPreserved_setsConstantAnnotation() {
    test("var a = {}; /** @const */ a.B = 1; a.B;",
         "/** @const */ var a$B = 1; a$B;");
  }

  @Test
  public void testProcess_objectLiteralKeepKeysWhenAliasedDirectly_doesNotEliminateKeys() {
    testSame("var a = {b: 1}; var c = a;");
  }

  @Test
  public void testProcess_deletePropertyOnNamespace_warnsNamespaceRedefined() {
    testWarning("/** @const */ var a = {}; delete a;",
        CollapseProperties.NAMESPACE_REDEFINED_WARNING);
  }

  @Test
  public void testProcess_constructorInstancePropertyCreation_ignoresLocal() {
    test("/** @constructor */ function Foo() { this.x = 1; } Foo.bar = 2; Foo.bar;",
         "/** @constructor */ function Foo() { this.x = 1; } var Foo$bar = 2; Foo$bar;");
  }

  @Test
  public void testProcess_multiplePropertiesUnderNamespace_collapsesAll() {
    test("var a = {b: 1, c: 2}; var sum = a.b + a.c;",
         "var a$b = 1; var a$c = 2; var sum = a$b + a$c;");
  }

  @Test
  public void testProcess_nullOrZeroArgConstructors_coverageCheck() {
    Compiler compiler = new Compiler();
    CollapseProperties cp = new CollapseProperties(compiler, false, true);
    Assert.assertNotNull(cp);
  }
}
