package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class ProcessClosurePrimitivesTest {

  private Compiler createCompiler() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    return compiler;
  }

  private void test(String js, DiagnosticType expectedError) {
    test(js, expectedError, CheckLevel.ERROR, false);
  }

  private void test(String js, DiagnosticType expectedError, CheckLevel checkLevel, boolean rewriteDate) {
    Compiler compiler = createCompiler();
    Node root = compiler.parseTestCode(js);
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, checkLevel, rewriteDate);
    pass.process(null, root);

    if (expectedError != null) {
      boolean found = false;
      for (JSError error : compiler.getErrors()) {
        if (error.getType().equals(expectedError)) {
          found = true;
          break;
        }
      }
      for (JSError warning : compiler.getWarnings()) {
        if (warning.getType().equals(expectedError)) {
          found = true;
          break;
        }
      }
      Assert.assertTrue("Expected error " + expectedError.key + " not found", found);
    } else {
      Assert.assertEquals("Expected no errors", 0, compiler.getErrorCount());
      Assert.assertEquals("Expected no warnings", 0, compiler.getWarningCount());
    }
  }

  @Test
  public void testProvide_simpleNamespace_createsDeclaration() {
    Compiler compiler = createCompiler();
    Node root = compiler.parseTestCode("goog.provide('foo');");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(Token.VAR, root.getFirstChild().getType());
  }

  @Test
  public void testProvide_dottedNamespace_createsAssignment() {
    Compiler compiler = createCompiler();
    Node root = compiler.parseTestCode("goog.provide('foo.bar');");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProvide_duplicate_reportsError() {
    test("goog.provide('foo'); goog.provide('foo');",
        ProcessClosurePrimitives.DUPLICATE_NAMESPACE_ERROR);
  }

  @Test
  public void testProvide_invalidIdentifier_reportsError() {
    test("goog.provide('foo.123bar');",
        ProcessClosurePrimitives.INVALID_PROVIDE_ERROR);
  }

  @Test
  public void testProvide_noArgument_reportsError() {
    test("goog.provide();",
        ProcessClosurePrimitives.NULL_ARGUMENT_ERROR);
  }

  @Test
  public void testProvide_nonStringArgument_reportsError() {
    test("goog.provide(123);",
        ProcessClosurePrimitives.INVALID_ARGUMENT_ERROR);
  }

  @Test
  public void testProvide_tooManyArguments_reportsError() {
    test("goog.provide('foo', 'bar');",
        ProcessClosurePrimitives.TOO_MANY_ARGUMENTS_ERROR);
  }

  @Test
  public void testRequire_validProvide_success() {
    test("goog.provide('foo'); goog.require('foo');", null);
  }

  @Test
  public void testRequire_missingProvide_reportsError() {
    test("goog.require('missing.namespace');",
        ProcessClosurePrimitives.MISSING_PROVIDE_ERROR);
  }

  @Test
  public void testRequire_lateProvide_reportsError() {
    test("goog.require('foo'); goog.provide('foo');",
        ProcessClosurePrimitives.LATE_PROVIDE_ERROR);
  }

  @Test
  public void testRequire_levelOff_noErrorReported() {
    Compiler compiler = createCompiler();
    Node root = compiler.parseTestCode("goog.require('missing.namespace');");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.OFF, false);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testRequire_noArgument_reportsError() {
    test("goog.require();",
        ProcessClosurePrimitives.NULL_ARGUMENT_ERROR);
  }

  @Test
  public void testRequire_nonStringArgument_reportsError() {
    test("goog.require(42);",
        ProcessClosurePrimitives.INVALID_ARGUMENT_ERROR);
  }

  @Test
  public void testRequire_tooManyArguments_reportsError() {
    test("goog.require('foo', 'bar');",
        ProcessClosurePrimitives.TOO_MANY_ARGUMENTS_ERROR);
  }

  @Test
  public void testFunction_sameNameAsProvide_reportsError() {
    test("goog.provide('Foo'); function Foo() {}",
        ProcessClosurePrimitives.FUNCTION_NAMESPACE_ERROR);
  }

  @Test
  public void testCandidateProvideDefinition_varDefinition() {
    Compiler compiler = createCompiler();
    Node root = compiler.parseTestCode("goog.provide('foo'); var foo = {};");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testCandidateProvideDefinition_assignDefinition() {
    Compiler compiler = createCompiler();
    Node root = compiler.parseTestCode("goog.provide('foo.bar'); foo.bar = {a: 1};");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testCandidateProvideDefinition_assignToVarConversion() {
    Compiler compiler = createCompiler();
    Node root = compiler.parseTestCode("goog.provide('foo'); foo = 123;");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testExportSymbol_collectsNames() {
    Compiler compiler = createCompiler();
    Node root = compiler.parseTestCode(
        "goog.exportSymbol('myExport', 123);\n" +
        "goog.exportSymbol('myObj.subProp', 456);");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);

    Set<String> exported = pass.getExportedVariableNames();
    Assert.assertTrue(exported.contains("myExport"));
    Assert.assertTrue(exported.contains("myObj"));
  }

  @Test
  public void testAddDependency_replacesNode() {
    Compiler compiler = createCompiler();
    Node root = compiler.parseTestCode("goog.addDependency('path.js', ['a'], ['b']);");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(Token.NUMBER, root.getFirstChild().getFirstChild().getType());
  }

  @Test
  public void testSetCssNameMapping_validObject() {
    Compiler compiler = createCompiler();
    Node root = compiler.parseTestCode("goog.setCssNameMapping({'goog-menu': 'gm'});");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertNotNull(compiler.getCssRenamingMap());
    Assert.assertEquals("gm", compiler.getCssRenamingMap().get("goog-menu"));
    Assert.assertEquals("unknown", compiler.getCssRenamingMap().get("unknown"));
  }

  @Test
  public void testSetCssNameMapping_invalidNonStringKeyOrValue() {
    test("goog.setCssNameMapping({'goog-menu': 123});",
        ProcessClosurePrimitives.NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR);
  }

  @Test
  public void testSetCssNameMapping_nonObjectArgument() {
    test("goog.setCssNameMapping('not an object');",
        ProcessClosurePrimitives.INVALID_ARGUMENT_ERROR);
  }

  @Test
  public void testSimplifyNewDate_enabled() {
    Compiler compiler = createCompiler();
    Node root = compiler.parseTestCode("var d = new Date(goog.now());");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, true);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
    Node varNode = root.getFirstChild();
    Node newDateNode = varNode.getFirstChild().getFirstChild();
    Assert.assertEquals(Token.NEW, newDateNode.getType());
    Assert.assertNull(newDateNode.getFirstChild().getNext());
  }

  @Test
  public void testSimplifyNewDate_disabled() {
    Compiler compiler = createCompiler();
    Node root = compiler.parseTestCode("var d = new Date(goog.now());");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
    Node varNode = root.getFirstChild();
    Node newDateNode = varNode.getFirstChild().getFirstChild();
    Assert.assertEquals(Token.NEW, newDateNode.getType());
    Assert.assertNotNull(newDateNode.getFirstChild().getNext());
  }

  @Test
  public void testBaseClassCall_constructor_success() {
    Compiler compiler = createCompiler();
    String js = "function Foo() { goog.base(this); }\n" +
                "goog.inherits(Foo, BaseFoo);";
    Node root = compiler.parseTestCode(js);
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testBaseClassCall_method_success() {
    Compiler compiler = createCompiler();
    String js = "Foo.prototype.bar = function() { goog.base(this, 'bar', 1); };";
    Node root = compiler.parseTestCode(js);
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testBaseClassCall_missingThisArg_reportsError() {
    test("function Foo() { goog.base(); }",
        ProcessClosurePrimitives.BASE_CLASS_ERROR);
  }

  @Test
  public void testBaseClassCall_notInMethod_reportsError() {
    test("goog.base(this);",
        ProcessClosurePrimitives.BASE_CLASS_ERROR);
  }

  @Test
  public void testBaseClassCall_missingInherits_reportsError() {
    test("function Foo() { goog.base(this); }",
        ProcessClosurePrimitives.BASE_CLASS_ERROR);
  }

  @Test
  public void testBaseClassCall_methodMissingMethodName_reportsError() {
    test("Foo.prototype.bar = function() { goog.base(this); };",
        ProcessClosurePrimitives.BASE_CLASS_ERROR);
  }

  @Test
  public void testBaseClassCall_methodNameMismatch_reportsError() {
    test("Foo.prototype.bar = function() { goog.base(this, 'baz'); };",
        ProcessClosurePrimitives.BASE_CLASS_ERROR);
  }

  @Test
  public void testBasePropertyUse_notInCall_reportsError() {
    test("var x = goog.base;",
        ProcessClosurePrimitives.BASE_CLASS_ERROR);
  }

  @Test
  public void testCrossModuleRequire_missingDependency_reportsWarning() {
    JSModule mod1 = new JSModule("m1");
    JSModule mod2 = new JSModule("m2");
    JSModule[] modules = new JSModule[]{mod1, mod2};
    JSModuleGraph graph = new JSModuleGraph(modules);

    Compiler compiler = createCompiler();
    compiler.initModules(
        java.util.Collections.emptyList(),
        java.util.Arrays.asList(modules),
        new CompilerOptions());

    Node root1 = compiler.parseTestCode("goog.provide('mod1.name');");
    Node root2 = compiler.parseTestCode("goog.require('mod1.name');");
    Node root = new Node(Token.BLOCK, root1, root2);

    mod1.add(new CompilerInput(new JsAst(SourceFile.fromCode("mod1.js", "goog.provide('mod1.name');")), false));
    mod2.add(new CompilerInput(new JsAst(SourceFile.fromCode("mod2.js", "goog.require('mod1.name');")), false));

    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);

    boolean found = false;
    for (JSError warning : compiler.getWarnings()) {
      if (warning.getType().equals(ProcessClosurePrimitives.XMODULE_REQUIRE_ERROR)) {
        found = true;
        break;
      }
    }
    Assert.assertTrue("Expected XMODULE_REQUIRE_ERROR warning", found);
  }
}
