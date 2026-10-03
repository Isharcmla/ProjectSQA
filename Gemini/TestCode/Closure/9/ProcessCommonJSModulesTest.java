package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class ProcessCommonJSModulesTest {

  private Compiler createCompilerWithScript(String filename, String jsCode) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    SourceFile file = SourceFile.fromCode(filename, jsCode);
    compiler.init(
        Collections.<SourceFile>emptyList(),
        Collections.singletonList(file),
        options);
    return compiler;
  }

  @Test
  public void testToModuleName_singleArg_normalizesCorrectly() {
    Assert.assertEquals("module$foo$bar", ProcessCommonJSModules.toModuleName("./foo/bar.js"));
    Assert.assertEquals("module$foo$bar", ProcessCommonJSModules.toModuleName("foo/bar.js"));
    Assert.assertEquals("module$foo_bar$baz", ProcessCommonJSModules.toModuleName("./foo-bar/baz.js"));
    Assert.assertEquals("module$foo", ProcessCommonJSModules.toModuleName("foo"));
    Assert.assertEquals("module$", ProcessCommonJSModules.toModuleName(""));
  }

  @Test
  public void testToModuleName_twoArgs_relativeDotSlash() {
    String result = ProcessCommonJSModules.toModuleName("./bar.js", "foo/baz.js");
    Assert.assertEquals("module$foo$bar", result);
  }

  @Test
  public void testToModuleName_twoArgs_relativeDotDotSlash() {
    String result = ProcessCommonJSModules.toModuleName("../bar.js", "foo/sub/baz.js");
    Assert.assertEquals("module$foo$bar", result);
  }

  @Test
  public void testToModuleName_twoArgs_nonRelative() {
    String result = ProcessCommonJSModules.toModuleName("bar.js", "foo/baz.js");
    Assert.assertEquals("module$bar", result);
  }

  @Test(expected = RuntimeException.class)
  public void testToModuleName_twoArgs_invalidUri_throwsRuntimeException() {
    ProcessCommonJSModules.toModuleName("./bar.js", "http://[invalid-uri");
  }

  @Test
  public void testConstructor_and_guessCJSModuleName_withAndWithoutTrailingSlash() {
    Compiler compiler = new Compiler();

    ProcessCommonJSModules processor1 = new ProcessCommonJSModules(compiler, "app/");
    Assert.assertEquals("module$sub$foo", processor1.guessCJSModuleName("app/sub/foo.js"));
    Assert.assertEquals("module$other$foo", processor1.guessCJSModuleName("other/foo.js"));

    ProcessCommonJSModules processor2 = new ProcessCommonJSModules(compiler, "app");
    Assert.assertEquals("module$sub$foo", processor2.guessCJSModuleName("app/sub/foo.js"));

    ProcessCommonJSModules processor3 = new ProcessCommonJSModules(compiler, "app", false);
    Assert.assertEquals("module$sub$foo", processor3.guessCJSModuleName("app/sub/foo.js"));
  }

  @Test
  public void testProcess_fullRewritingWithRequireAndModuleExports() {
    String code = ""
        + "var dep = require('./dep');\n"
        + "var myGlobal = 10;\n"
        + "function testFunc() {\n"
        + "  var localVar = 20;\n"
        + "  return localVar + myGlobal;\n"
        + "}\n"
        + "exports = myGlobal;\n"
        + "module.exports = testFunc;\n";

    Compiler compiler = createCompilerWithScript("app/main.js", code);
    Node root = compiler.parseInputs();
    Node scriptNode = root.getLastChild();

    ProcessCommonJSModules processor = new ProcessCommonJSModules(compiler, "app/", true);
    processor.process(null, scriptNode);

    JSModule jsModule = processor.getModule();
    Assert.assertNotNull(jsModule);
    Assert.assertEquals("module$main", jsModule.getName());

    String output = compiler.toSource(scriptNode);
    Assert.assertTrue(output.contains("goog.provide(\"module$main\")"));
    Assert.assertTrue(output.contains("goog.require(\"module$dep\")"));
    Assert.assertTrue(output.contains("var module$main = {}"));
    Assert.assertTrue(output.contains("module$main = module$main.module$exports"));
  }

  @Test
  public void testProcess_withoutReportingDependencies() {
    String code = "var x = 1; var dep = require('./dep'); exports.foo = x;";
    Compiler compiler = createCompilerWithScript("app/main.js", code);
    Node root = compiler.parseInputs();
    Node scriptNode = root.getLastChild();

    ProcessCommonJSModules processor = new ProcessCommonJSModules(compiler, "app/", false);
    processor.process(null, scriptNode);

    Assert.assertNull(processor.getModule());
    String output = compiler.toSource(scriptNode);
    Assert.assertTrue(output.contains("goog.provide(\"module$main\")"));
    Assert.assertTrue(output.contains("goog.require(\"module$dep\")"));
  }

  @Test
  public void testProcess_withoutModuleExportsOverride() {
    String code = "var x = 1; exports.foo = x;";
    Compiler compiler = createCompilerWithScript("app/main.js", code);
    Node root = compiler.parseInputs();
    Node scriptNode = root.getLastChild();

    ProcessCommonJSModules processor = new ProcessCommonJSModules(compiler, "app/", true);
    processor.process(null, scriptNode);

    String output = compiler.toSource(scriptNode);
    Assert.assertFalse(output.contains("if (module$main.module$exports)"));
  }

  @Test
  public void testProcess_ignoresNonRequireCallsAndOtherGetProps() {
    String code = ""
        + "function notRequire() {}\n"
        + "notRequire('a');\n"
        + "var foo = {};\n"
        + "foo.exports = 1;\n"
        + "var other = require(123);\n";

    Compiler compiler = createCompilerWithScript("app/main.js", code);
    Node root = compiler.parseInputs();
    Node scriptNode = root.getLastChild();

    ProcessCommonJSModules processor = new ProcessCommonJSModules(compiler, "app/", true);
    processor.process(null, scriptNode);

    String output = compiler.toSource(scriptNode);
    Assert.assertFalse(output.contains("goog.require"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testProcess_multipleScripts_throwsIllegalArgumentException() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    SourceFile file1 = SourceFile.fromCode("app/file1.js", "var a = 1;");
    SourceFile file2 = SourceFile.fromCode("app/file2.js", "var b = 2;");
    compiler.init(
        Collections.<SourceFile>emptyList(),
        ImmutableList.of(file1, file2),
        options);

    Node root = compiler.parseInputs();
    ProcessCommonJSModules processor = new ProcessCommonJSModules(compiler, "app/", true);
    processor.process(null, root.getLastChild());
  }
}
