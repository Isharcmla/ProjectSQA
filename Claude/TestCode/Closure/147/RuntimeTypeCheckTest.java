package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Test;

/**
 * Unit tests for {@link RuntimeTypeCheck}.
 *
 * NOTE: RuntimeTypeCheck is a package-private class that is tightly coupled
 * with the Closure Compiler's internal AST / type system. Since mocking
 * frameworks are not allowed, the real {@link Compiler} implementation
 * (also part of this codebase) is used to build valid ASTs / type
 * information required to exercise this pass.
 */
public class RuntimeTypeCheckTest {

  // ---------------------------------------------------------------------
  // Constructor tests
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_withLogFunction_createsInstance() {
    Compiler compiler = new Compiler();
    RuntimeTypeCheck pass = new RuntimeTypeCheck(compiler, "myLogFunction");
    assertNotNull(pass);
  }

  @Test
  public void testConstructor_withNullLogFunction_createsInstance() {
    Compiler compiler = new Compiler();
    RuntimeTypeCheck pass = new RuntimeTypeCheck(compiler, null);
    assertNotNull(pass);
  }

  @Test
  public void testConstructor_withEmptyLogFunction_createsInstance() {
    Compiler compiler = new Compiler();
    RuntimeTypeCheck pass = new RuntimeTypeCheck(compiler, "");
    assertNotNull(pass);
  }

  @Test
  public void testConstructor_withNullCompiler_doesNotThrowAtConstructionTime() {
    // compiler is only used lazily, so construction itself should not fail.
    RuntimeTypeCheck pass = new RuntimeTypeCheck(null, null);
    assertNotNull(pass);
  }

  // ---------------------------------------------------------------------
  // getBoilerplateCode tests
  // ---------------------------------------------------------------------

  @Test
  public void testGetBoilerplateCode_withNullLogFunction_returnsNonNullNode() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node result = RuntimeTypeCheck.getBoilerplateCode(compiler, null);
    assertNotNull(result);
  }

  @Test
  public void testGetBoilerplateCode_withCustomLogFunction_returnsNonNullNode() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node result = RuntimeTypeCheck.getBoilerplateCode(
        compiler, "function(warning, expr) { console.log(warning); }");
    assertNotNull(result);
  }

  @Test(expected = Exception.class)
  public void testGetBoilerplateCode_withNullCompiler_throwsException() {
    // Passing a null compiler should fail while attempting to parse/normalize
    // the synthetic boilerplate code.
    RuntimeTypeCheck.getBoilerplateCode(null, null);
  }

  // ---------------------------------------------------------------------
  // process(...) tests
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_withSimpleConstructorNoInterfaces_doesNotThrow() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setCheckTypes(true);

    SourceFile externs = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js",
        "/** @constructor */\n"
        + "function Empty() {}\n");

    Result result = compiler.compile(externs, input, options);
    assertNotNull(result);

    RuntimeTypeCheck pass = new RuntimeTypeCheck(compiler, null);
    try {
      pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    } catch (Exception e) {
      fail("process() should not throw for a simple constructor: " + e);
    }
  }

  @Test
  public void testProcess_withInterfacesAndParamTypes_doesNotThrow() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setCheckTypes(true);

    SourceFile externs = SourceFile.fromCode("externs.js",
        "/** @constructor */\n"
        + "function ExternClass() {}\n");

    SourceFile input = SourceFile.fromCode("input.js",
        "/** @constructor */\n"
        + "function Foo() {}\n"
        + "/** @interface */\n"
        + "function Barable() {}\n"
        + "/**\n"
        + " * @constructor\n"
        + " * @implements {Barable}\n"
        + " */\n"
        + "function Baz() {}\n"
        + "/**\n"
        + " * @param {Foo} f\n"
        + " * @param {Barable} g\n"
        + " * @param {ExternClass} e\n"
        + " * @param {string} s\n"
        + " * @param {number} n\n"
        + " * @param {boolean} b\n"
        + " * @return {Foo}\n"
        + " */\n"
        + "Foo.prototype.method = function(f, g, e, s, n, b) {\n"
        + "  return f;\n"
        + "};\n");

    Result result = compiler.compile(externs, input, options);
    assertNotNull(result);

    RuntimeTypeCheck pass = new RuntimeTypeCheck(compiler, "myLog");
    try {
      pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    } catch (Exception e) {
      fail("process() should not throw for interfaces/param types: " + e);
    }
  }

  @Test
  public void testProcess_withNoParamsAndNoReturn_doesNotThrow() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setCheckTypes(true);

    SourceFile externs = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js",
        "/** @constructor */\n"
        + "function Foo() {}\n"
        + "Foo.prototype.noop = function() {};\n");

    Result result = compiler.compile(externs, input, options);
    assertNotNull(result);

    RuntimeTypeCheck pass = new RuntimeTypeCheck(compiler, null);
    try {
      pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    } catch (Exception e) {
      fail("process() should not throw for a function without params: " + e);
    }
  }

  @Test
  public void testProcess_withUnionReturnType_doesNotThrow() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setCheckTypes(true);

    SourceFile externs = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js",
        "/** @constructor */\n"
        + "function Foo() {}\n"
        + "/**\n"
        + " * @param {(string|number|boolean|null)} x\n"
        + " * @return {(string|number)}\n"
        + " */\n"
        + "Foo.prototype.method = function(x) {\n"
        + "  return x;\n"
        + "};\n");

    Result result = compiler.compile(externs, input, options);
    assertNotNull(result);

    RuntimeTypeCheck pass = new RuntimeTypeCheck(compiler, null);
    try {
      pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    } catch (Exception e) {
      fail("process() should not throw for union return type: " + e);
    }
  }

  @Test(expected = Exception.class)
  public void testProcess_withNullCompiler_throwsException() {
    RuntimeTypeCheck pass = new RuntimeTypeCheck(null, null);
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    pass.process(externs, root);
  }

  @Test(expected = Exception.class)
  public void testProcess_withNullRootNodes_throwsException() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    RuntimeTypeCheck pass = new RuntimeTypeCheck(compiler, null);
    pass.process(null, null);
  }

  @Test
  public void testProcess_withEmptyScriptBlocks_doesNotThrowAndCompletes() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setCheckTypes(true);

    SourceFile externs = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "");

    Result result = compiler.compile(externs, input, options);
    assertNotNull(result);

    RuntimeTypeCheck pass = new RuntimeTypeCheck(compiler, null);
    try {
      pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    } catch (Exception e) {
      fail("process() should not throw on empty scripts: " + e);
    }
  }
}
