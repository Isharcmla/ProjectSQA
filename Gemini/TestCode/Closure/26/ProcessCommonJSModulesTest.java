package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ProcessCommonJSModulesTest {

  private Node compileAndGetRoot(Compiler compiler, String filename, String code) {
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    List<SourceFile> externs = ImmutableList.of(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs = ImmutableList.of(SourceFile.fromCode(filename, code));
    compiler.init(externs, inputs, options);
    return compiler.parseInputs();
  }

  @Test
  public void testToModuleName_singleFilename() {
    assertEquals("module$foo", ProcessCommonJSModules.toModuleName("foo"));
    assertEquals("module$foo", ProcessCommonJSModules.toModuleName("foo.js"));
    assertEquals("module$foo_bar", ProcessCommonJSModules.toModuleName("foo-bar.js"));
    assertEquals("module$foo$bar", ProcessCommonJSModules.toModuleName("foo" + File.separator + "bar.js"));
    assertEquals("module$foo", ProcessCommonJSModules.toModuleName("." + File.separator + "foo.js"));
  }

  @Test
  public void testToModuleName_relativeFilename() {
    assertEquals("module$bar", ProcessCommonJSModules.toModuleName("bar.js", "foo" + File.separator + "baz.js"));
    assertEquals("module$foo$bar", ProcessCommonJSModules.toModuleName("." + File.separator + "bar.js", "foo" + File.separator + "baz.js"));
    assertEquals("module$bar", ProcessCommonJSModules.toModuleName(".." + File.separator + "bar.js", "foo" + File.separator + "baz.js"));
  }

  @Test(expected = RuntimeException.class)
  public void testToModuleName_invalidUri_throwsRuntimeException() {
    ProcessCommonJSModules.toModuleName("." + File.separator + "bar", "http://[invalid-uri");
  }

  @Test
  public void testGuessCJSModuleName_withPrefix() {
    Compiler compiler = new Compiler();
    ProcessCommonJSModules processor1 = new ProcessCommonJSModules(compiler, "app" + File.separator);
    assertEquals("module$foo", processor1.guessCJSModuleName("app" + File.separator + "foo.js"));

    ProcessCommonJSModules processor2 = new ProcessCommonJSModules(compiler, "app");
    assertEquals("module$foo", processor2.guessCJSModuleName("app" + File.separator + "foo.js"));

    assertEquals("module$other$foo", processor2.guessCJSModuleName("other" + File.separator + "foo.js"));
  }

  @Test
  public void testProcess_simpleScriptAndExports() {
    Compiler compiler = new Compiler();
    String path = "." + File.separator + "app" + File.separator + "module.js";
    String js = "var globalVar = 1;\n" +
                "function globalFunc() {\n" +
                "  var localVar = 2;\n" +
                "  return localVar;\n" +
                "}\n" +
                "exports.value = globalVar;\n" +
                "module.exports = exports;\n";

    Node root = compileAndGetRoot(compiler, path, js);
    Node mainRoot = root.getLastChild();

    ProcessCommonJSModules processor = new ProcessCommonJSModules(compiler, "." + File.separator + "app");
    assertNull(processor.getModule());

    processor.process(root.getFirstChild(), mainRoot);

    JSModule module = processor.getModule();
    assertNotNull(module);
    assertEquals("module$module", module.getName());

    String output = compiler.toSource(mainRoot);
    assertTrue(output.contains("goog.provide(\"module$module\")"));
    assertTrue(output.contains("var module$module = {}"));
    assertTrue(output.contains("globalVar$$module$module"));
    assertTrue(output.contains("globalFunc$$module$module"));
    assertTrue(output.contains("module$module.module$exports"));
  }

  @Test
  public void testProcess_withRequireAndReportDependenciesDisabled() {
    Compiler compiler = new Compiler();
    String path = "app" + File.separator + "entry.js";
    String js = "var mod = require('./other');\n" +
                "var direct = require('./other.js');\n";

    Node root = compileAndGetRoot(compiler, path, js);
    Node mainRoot = root.getLastChild();

    ProcessCommonJSModules processor = new ProcessCommonJSModules(compiler, "app", false);
    processor.process(root.getFirstChild(), mainRoot);

    assertNull(processor.getModule());
    String output = compiler.toSource(mainRoot);
    assertTrue(output.contains("goog.require(\"module$other\")"));
    assertTrue(output.contains("var mod$$module$entry = module$other"));
    assertTrue(output.contains("var direct$$module$entry = module$other"));
  }

  @Test
  public void testProcess_multipleScriptNodes_throwsIllegalArgumentException() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    List<SourceFile> externs = ImmutableList.of(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs = ImmutableList.of(
        SourceFile.fromCode("file1.js", "var a = 1;"),
        SourceFile.fromCode("file2.js", "var b = 2;")
    );
    compiler.init(externs, inputs, options);
    Node root = compiler.parseInputs();

    ProcessCommonJSModules processor = new ProcessCommonJSModules(compiler, "");
    try {
      processor.process(root.getFirstChild(), root.getLastChild());
      fail("Expected IllegalArgumentException for multiple script nodes");
    } catch (IllegalArgumentException e) {
      assertTrue(e.getMessage().contains("supports only one invocation"));
    }
  }

  @Test
  public void testProcess_nonMatchingRequireCall() {
    Compiler compiler = new Compiler();
    String path = "test.js";
    String js = "var a = require();\n" +
                "var b = require('x', 'y');\n" +
                "var c = notRequire('x');\n" +
                "var d = require(123);\n";

    Node root = compileAndGetRoot(compiler, path, js);
    Node mainRoot = root.getLastChild();

    ProcessCommonJSModules processor = new ProcessCommonJSModules(compiler, "");
    processor.process(root.getFirstChild(), mainRoot);

    String output = compiler.toSource(mainRoot);
    assertTrue(output.contains("require()"));
    assertTrue(output.contains("require(\"x\", \"y\")"));
    assertTrue(output.contains("notRequire(\"x\")"));
    assertTrue(output.contains("require(123)"));
  }

  @Test
  public void testProcess_moduleNameCollisionInSuffixVars() {
    Compiler compiler = new Compiler();
    String path = "test.js";
    String js = "var module$test = 10;\n";

    Node root = compileAndGetRoot(compiler, path, js);
    Node mainRoot = root.getLastChild();

    ProcessCommonJSModules processor = new ProcessCommonJSModules(compiler, "");
    processor.process(root.getFirstChild(), mainRoot);

    String output = compiler.toSource(mainRoot);
    assertTrue(output.contains("var module$test = 10"));
  }
}
