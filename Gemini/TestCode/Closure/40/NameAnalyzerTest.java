package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
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
    test(js, expected, false);
  }

  private void test(String js, String expected, boolean withReport) {
    Compiler compiler = createCompiler();
    Node root = compiler.parseTestCode(js);
    Node externs = compiler.parseTestCode("var window; var goog = {}; goog.global = {};");
    Node mainRoot = IR.root(externs, root);

    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    analyzer.process(externs, root);

    if (withReport) {
      String report = analyzer.getHtmlReport();
      Assert.assertNotNull(report);
      Assert.assertTrue(report.contains("<html>"));
      Assert.assertTrue(report.contains("OVERALL STATS"));
    }

    if (expected != null) {
      Node expectedRoot = compiler.parseTestCode(expected);
      String actualCode = compiler.toSource(root);
      String expectedCode = compiler.toSource(expectedRoot);
      Assert.assertEquals(expectedCode, actualCode);
    }
  }

  private void testNoRemoval(String js) {
    Compiler compiler = createCompiler();
    Node root = compiler.parseTestCode(js);
    Node externs = compiler.parseTestCode("var window;");

    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    analyzer.process(externs, root);
    analyzer.removeUnreferenced();

    String report = analyzer.getHtmlReport();
    Assert.assertNotNull(report);
    Assert.assertTrue(report.length() > 0);
  }

  @Test
  public void testProcess_unusedSimpleVar_removed() {
    test("var x = 1;", "");
  }

  @Test
  public void testProcess_usedSimpleVar_kept() {
    test("var x = 1; window.a = x;", "var x = 1; window.a = x;");
  }

  @Test
  public void testProcess_unusedFunctionDeclaration_removed() {
    test("function foo() { return 1; }", "");
  }

  @Test
  public void testProcess_usedFunctionDeclaration_kept() {
    test("function foo() { return 1; } window.foo = foo;", "function foo() { return 1; } window.foo = foo;");
  }

  @Test
  public void testProcess_unusedClassPrototypeMethods_removed() {
    test("function Foo() {} Foo.prototype.bar = function() { return 2; };", "");
  }

  @Test
  public void testProcess_usedClassPrototypeMethods_kept() {
    test(
        "function Foo() {} Foo.prototype.bar = function() { return 2; }; window.x = new Foo();",
        "function Foo() {} Foo.prototype.bar = function() { return 2; }; window.x = new Foo();"
    );
  }

  @Test
  public void testProcess_sideEffectInUnusedVar_retainedSideEffect() {
    test("var x = Math.random();", "Math.random();");
  }

  @Test
  public void testProcess_unusedAssignInExprResult_removed() {
    test("var x; x = 1;", "");
  }

  @Test
  public void testProcess_aliasingGlobal_kept() {
    test("var a = {}; var b = a; a.foo = 3; window.x = b.foo;", "var a = {}; var b = a; a.foo = 3; window.x = b.foo;");
  }

  @Test
  public void testProcess_aliasMergedComponents() {
    test(
        "var a = {}; var b = a; var c = {}; var d = c; b = c; a.foo = 1; window.res = d.foo;",
        "var a = {}; var b = a; var c = {}; var d = c; b = c; a.foo = 1; window.res = d.foo;"
    );
  }

  @Test
  public void testProcess_instanceOfCheck_removedClassReplacedWithFalse() {
    test("function Foo() {} var res = x instanceof Foo; window.res = res;", "var res = false; window.res = res;");
  }

  @Test
  public void testProcess_forLoopInitAndCond_handledProperly() {
    test("var i; for (i = 0; i < 10; i++) { window.x = i; }", "var i; for (i = 0; i < 10; i++) { window.x = i; }");
  }

  @Test
  public void testProcess_forInLoop_handledProperly() {
    test("var obj = {a: 1}; for (var k in obj) { window.k = k; }", "var obj = {a: 1}; for (var k in obj) { window.k = k; }");
  }

  @Test
  public void testProcess_unusedForIn_removed() {
    test("var obj = {a: 1}; var k; for (k in obj) { }", "var obj = {a: 1}; var k; for (k in obj) { }");
  }

  @Test
  public void testProcess_controlStructures_branchesVisited() {
    test(
        "var a = 1, b = 2, c = 3, d = 4, e = 5; "
        + "if (window.cond) { a; } else { b; } "
        + "while (window.cond2) { c; } "
        + "do { d; } while (window.cond3); "
        + "switch (window.val) { case 1: e; break; }",
        "var a = 1, b = 2, c = 3, d = 4, e = 5; "
        + "if (window.cond) { a; } else { b; } "
        + "while (window.cond2) { c; } "
        + "do { d; } while (window.cond3); "
        + "switch (window.val) { case 1: e; break; }"
    );
  }

  @Test
  public void testProcess_withAndHookStatements_visited() {
    test(
        "var a = 1, b = 2, c = 3; "
        + "window.x ? a : b; "
        + "with (window.obj) { c; }",
        "var a = 1, b = 2, c = 3; "
        + "window.x ? a : b; "
        + "with (window.obj) { c; }"
    );
  }

  @Test
  public void testProcess_shortCircuitExpressions_visited() {
    test(
        "var a = 1, b = 2; "
        + "window.cond && (a = 3); "
        + "window.cond || (b = 4);",
        "var a = 1, b = 2; "
        + "window.cond && (a = 3); "
        + "window.cond || (b = 4);"
    );
  }

  @Test
  public void testProcess_globalThisReference_kept() {
    test("this.foo = 123;", "this.foo = 123;");
  }

  @Test
  public void testProcess_googInherits_handled() {
    Compiler compiler = createCompiler();
    String js = "function Super() {} function Sub() {} goog.inherits(Sub, Super); window.Sub = Sub;";
    Node root = compiler.parseTestCode(js);
    Node externs = compiler.parseTestCode("var window; var goog = {}; goog.inherits = function(a, b) {};");
    Node mainRoot = IR.root(externs, root);

    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    analyzer.process(externs, root);

    String actual = compiler.toSource(root);
    Assert.assertTrue(actual.contains("goog.inherits(Sub, Super)"));
  }

  @Test
  public void testProcess_googInheritsUnreferenced_removed() {
    Compiler compiler = createCompiler();
    String js = "function Super() {} function Sub() {} goog.inherits(Sub, Super);";
    Node root = compiler.parseTestCode(js);
    Node externs = compiler.parseTestCode("var window; var goog = {}; goog.inherits = function(a, b) {};");
    Node mainRoot = IR.root(externs, root);

    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    analyzer.process(externs, root);

    String actual = compiler.toSource(root);
    Assert.assertEquals("", actual);
  }

  @Test
  public void testProcess_removeUnreferencedFalse_preservesTree() {
    testNoRemoval("var unused = 1; function unusedFn() {}");
  }

  @Test
  public void testGetHtmlReport_generatesValidHtmlReport() {
    test(
        "var a = 1; function B() {} B.prototype.bar = function() {}; window.res = new B();",
        "var a = 1; function B() {} B.prototype.bar = function() {}; window.res = new B();",
        true
    );
  }

  @Test
  public void testProcess_emptyInputs_doesNotFail() {
    Compiler compiler = createCompiler();
    Node externs = IR.root();
    Node root = IR.root();
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    analyzer.process(externs, root);
    String report = analyzer.getHtmlReport();
    Assert.assertNotNull(report);
  }

  @Test
  public void testProcess_objectLiteralDeclaration_handled() {
    test("var obj = { a: function() { return 1; }, b: 2 }; window.x = obj.a();", "var obj = { a: function() { return 1; }, b: 2 }; window.x = obj.a();");
  }

  @Test
  public void testProcess_functionWithLocalSideEffects_handled() {
    test(
        "function foo() { var local = Math.random(); return local; } window.foo = foo;",
        "function foo() { var local = Math.random(); return local; } window.foo = foo;"
    );
  }

  @Test
  public void testProcess_chainedPropertyWrites_handled() {
    test(
        "var a = {}; a.b = {}; a.b.c = 1; window.out = a.b.c;",
        "var a = {}; a.b = {}; a.b.c = 1; window.out = a.b.c;"
    );
  }
}
