package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

public class NameAnalyzerTest {

  private Compiler createCompiler() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    return compiler;
  }

  private void test(String js, String expected) {
    test(js, expected, true);
  }

  private void test(String js, String expected, boolean removeUnreferenced) {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("var window; var goog = {}; goog.global = {};");
    Node root = compiler.parseTestCode(js);

    NameAnalyzer analyzer = new NameAnalyzer(compiler, removeUnreferenced);
    analyzer.process(externs, root);

    if (expected != null) {
      Node expectedRoot = compiler.parseTestCode(expected);
      String actualCode = compiler.toSource(root);
      String expectedCode = compiler.toSource(expectedRoot);
      Assert.assertEquals(expectedCode, actualCode);
    }
  }

  private void testSame(String js) {
    test(js, js, true);
  }

  @Test
  public void testProcess_simpleUnreferencedVar_removed() {
    test("var a = 1;", "");
  }

  @Test
  public void testProcess_unreferencedFunction_removed() {
    test("function foo() { return 1; }", "");
  }

  @Test
  public void testProcess_referencedViaWindow_preserved() {
    testSame("var a = 1; window['a'] = a;");
  }

  @Test
  public void testProcess_removeUnreferencedFalse_keepsCode() {
    test("var a = 1;", "var a = 1;", false);
  }

  @Test
  public void testProcess_varWithSideEffects_keepsSideEffect() {
    test("var a = alert(1);", "alert(1);");
  }

  @Test
  public void testProcess_assignWithSideEffects_keepsSideEffect() {
    test("var a; a = alert(1);", "alert(1);");
  }

  @Test
  public void testProcess_emptyInputs_noChange() {
    test("", "");
  }

  @Test
  public void testProcess_chainedAssignments_referencedPreserved() {
    test("var a, b, c; a = b = c = 1; window.a = a;", "var a; a = 1; window.a = a;");
  }

  @Test
  public void testProcess_objectLiteralKeyAssignment_tracked() {
    testSame("var a = { foo: 1 }; window.a = a.foo;");
  }

  @Test
  public void testProcess_prototypeMethods_preservedWhenReferenced() {
    testSame("function Foo() {} Foo.prototype.bar = function() { return 1; }; window.Foo = new Foo();");
  }

  @Test
  public void testProcess_prototypeMethods_removedWhenUnreferenced() {
    test("function Foo() {} Foo.prototype.bar = function() { return 1; };", "");
  }

  @Test
  public void testProcess_prototypeAssignmentInExpression_simplified() {
    test("var a = 1; var b = (a.prototype.foo = function() {});", "");
  }

  @Test
  public void testProcess_classInheritsCall_preservedWhenSubclassReferenced() {
    String js = "goog.inherits = function(child, parent) {};"
              + "function SuperClass() {}"
              + "function SubClass() {}"
              + "goog.inherits(SubClass, SuperClass);"
              + "window.SubClass = SubClass;";
    testSame(js);
  }

  @Test
  public void testProcess_classInheritsCall_removedWhenSubclassUnreferenced() {
    String js = "goog.inherits = function(child, parent) {};"
              + "function SuperClass() {}"
              + "function SubClass() {}"
              + "goog.inherits(SubClass, SuperClass);";
    test(js, "goog.inherits = function(child, parent) {};");
  }

  @Test
  public void testProcess_singletonGetter_preservedWhenReferenced() {
    String js = "goog.addSingletonGetter = function(cls) {};"
              + "function Foo() {}"
              + "goog.addSingletonGetter(Foo);"
              + "window.Foo = Foo;";
    testSame(js);
  }

  @Test
  public void testProcess_singletonGetter_removedWhenUnreferenced() {
    String js = "goog.addSingletonGetter = function(cls) {};"
              + "function Foo() {}"
              + "goog.addSingletonGetter(Foo);";
    test(js, "goog.addSingletonGetter = function(cls) {};");
  }

  @Test
  public void testProcess_instanceOfCheck_replacedWithFalseWhenUnreferenced() {
    test("function Foo() {} var isInstance = x instanceof Foo; window.isInstance = isInstance;",
         "var isInstance = false; window.isInstance = isInstance;");
  }

  @Test
  public void testProcess_instanceOfCheck_preservedWhenClassReferenced() {
    testSame("function Foo() {} var isInstance = x instanceof Foo; window.Foo = Foo; window.isInstance = isInstance;");
  }

  @Test
  public void testProcess_aliasing_preservedCorrectly() {
    testSame("var a = {}; var b = a; a.foo = 3; window.alert(b.foo);");
  }

  @Test
  public void testProcess_nestedProperties_referencedProperly() {
    testSame("var a = {}; a.b = {}; a.b.c = 1; window.a = a.b.c;");
  }

  @Test
  public void testProcess_circularReferences_removedWhenExternallyUnreferenced() {
    test("function f() { g(); } function g() { f(); }", "");
  }

  @Test
  public void testProcess_thisPropertyAccess_referencedFromGlobal() {
    testSame("this.foo = 1;");
  }

  @Test
  public void testProcess_controlStructuresAndConditions_evaluatedProperly() {
    test("if (window.foo) { var a = 1; }", "if (window.foo) {}");
    test("while (window.foo) { var a = 1; }", "while (window.foo) {}");
    test("do { var a = 1; } while (window.foo);", "do {} while (window.foo);");
    test("for (var a = 1; window.foo; a++) {}", "for (; window.foo;) {}");
    test("for (var key in window.foo) { var a = 1; }", "for (var key in window.foo) {}");
    test("switch (window.foo) { case 1: var a = 1; }", "switch (window.foo) { case 1: }");
  }

  @Test
  public void testProcess_expressionsWithLogicalAndOrHook_simplified() {
    test("var a = window.foo && alert(1);", "window.foo && alert(1);");
    test("var a = window.foo ? alert(1) : alert(2);", "window.foo ? alert(1) : alert(2);");
  }

  @Test
  public void testProcess_externDeclarations_markedExternallyDefined() {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("var externalVar; function externalFunc() {}");
    Node root = compiler.parseTestCode("var a = externalVar; externalFunc(); window.a = a;");

    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    analyzer.process(externs, root);

    String actualCode = compiler.toSource(root);
    Node expectedRoot = compiler.parseTestCode("var a = externalVar; externalFunc(); window.a = a;");
    String expectedCode = compiler.toSource(expectedRoot);
    Assert.assertEquals(expectedCode, actualCode);
  }

  @Test
  public void testGetHtmlReport_returnsValidReport() {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("var window;");
    Node root = compiler.parseTestCode(
        "function Foo() {} "
        + "Foo.prototype.bar = function() {}; "
        + "var a = 1; "
        + "window.a = a; "
        + "window.Foo = Foo;");

    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    analyzer.process(externs, root);

    String html = analyzer.getHtmlReport();
    Assert.assertNotNull(html);
    Assert.assertTrue(html.contains("<html><body>"));
    Assert.assertTrue(html.contains("OVERALL STATS"));
    Assert.assertTrue(html.contains("ALL NAMES"));
    Assert.assertTrue(html.contains("Foo"));
    Assert.assertTrue(html.contains("PROTOTYPES"));
    Assert.assertTrue(html.contains("</body></html>"));
  }

  @Test
  public void testProcess_complexNestedNamesAndGetElem_handled() {
    test("var a = {}; a['b'] = {}; a['b'].c = 1;", "");
  }

  @Test
  public void testProcess_nestedFunctionsWithDependencyScopes_handled() {
    testSame("var x = 1; function f() { window.foo = x; } window.f = f;");
  }

  @Test
  public void testProcess_labeledAndNestedVarAssignments_handled() {
    test("label1: var a = alert(1);", "alert(1);");
  }

  @Test
  public void testProcess_nestedAssignConsumers_handled() {
    test("var a, b; if (a = b = alert(1)) {}", "var a, b; if (a = b = alert(1)) {}");
  }
}
