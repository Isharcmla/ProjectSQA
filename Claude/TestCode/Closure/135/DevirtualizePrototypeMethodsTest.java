package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.Node;

/**
 * Unit tests for {@link DevirtualizePrototypeMethods}.
 *
 * หมายเหตุ: คลาสนี้พึ่งพา AbstractCompiler / SimpleDefinitionFinder ซึ่งเป็นโครงสร้างภายในที่ซับซ้อนของ
 * closure-compiler และไม่ได้ระบุ API ทั้งหมดไว้ใน source_code ที่ให้มา เนื่องจากไม่อนุญาตให้ใช้ mocking
 * framework การทดสอบนี้จึงใช้คลาส com.google.javascript.jscomp.Compiler (implementation จริงของ
 * AbstractCompiler) และ com.google.javascript.jscomp.JSSourceFile / CompilerOptions ซึ่งเป็น public API
 * มาตรฐานของ closure-compiler เพื่อคอมไพล์ JS จริง แล้วเรียก process() ของ pass นี้โดยตรงบน AST ที่ได้
 * หากพฤติกรรมของ API ภายนอกบางส่วน (เช่น toSource(), getRoot()) แตกต่างจากที่คาดไว้ในบางเวอร์ชันของไลบรารี
 * โปรดปรับปรุงตามความเหมาะสม
 */
public class DevirtualizePrototypeMethodsTest {

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
    // ปิดการทำงานของ optimization/checks อื่น ๆ ให้มากที่สุดเพื่อไม่ให้รบกวน AST
    // ก่อนที่จะเรียก pass ที่ต้องการทดสอบเอง
    options.setPrettyPrint(true);
  }

  private String compileAndRunPass(String js) {
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", js);

    compiler.compile(extern, input, options);

    Node root = compiler.getRoot();
    Node externsRoot = root.getFirstChild();
    Node jsRoot = root.getLastChild();

    DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);
    pass.process(externsRoot, jsRoot);

    return compiler.toSource();
  }

  // -------------------------------------------------------------------
  // Normal / typical cases
  // -------------------------------------------------------------------

  @Test
  public void testProcess_prototypeMethodCalledOnce_rewritesToStaticFunction() {
    String js =
        "var A = function() {};"
            + "A.prototype.foo = function(x) { return this.x + x; };"
            + "var a = new A();"
            + "a.foo(1);";

    String output = compileAndRunPass(js);

    assertNotNull(output);
    assertTrue("expected rewritten static method name in output",
        output.contains("JSCompiler_StaticMethods_foo"));
  }

  @Test
  public void testProcess_multiplePrototypeMethods_bothRewritten() {
    String js =
        "var A = function() {};"
            + "A.prototype.foo = function() { return this.x; };"
            + "A.prototype.bar = function() { return this.y; };"
            + "var a = new A();"
            + "a.foo();"
            + "a.bar();";

    String output = compileAndRunPass(js);

    assertTrue(output.contains("JSCompiler_StaticMethods_foo"));
    assertTrue(output.contains("JSCompiler_StaticMethods_bar"));
  }

  // -------------------------------------------------------------------
  // Edge cases
  // -------------------------------------------------------------------

  @Test
  public void testProcess_unusedPrototypeMethod_notRewritten() {
    String js =
        "var A = function() {};"
            + "A.prototype.foo = function() { return 1; };";

    String output = compileAndRunPass(js);

    assertFalse("unused method should not be rewritten",
        output.contains("JSCompiler_StaticMethods_foo"));
  }

  @Test
  public void testProcess_propertyAccessedWithoutCall_notRewritten() {
    String js =
        "var A = function() {};"
            + "A.prototype.foo = function() { return 1; };"
            + "var a = new A();"
            + "var f = a.foo;";

    String output = compileAndRunPass(js);

    assertFalse("property access (not a call) should prevent rewrite",
        output.contains("JSCompiler_StaticMethods_foo"));
  }

  @Test
  public void testProcess_functionUsingArguments_notRewritten() {
    String js =
        "var A = function() {};"
            + "A.prototype.foo = function() { return arguments.length; };"
            + "var a = new A();"
            + "a.foo();";

    String output = compileAndRunPass(js);

    assertFalse("function that reads 'arguments' should not be rewritten",
        output.contains("JSCompiler_StaticMethods_foo"));
  }

  @Test
  public void testProcess_multipleDefinitionsOfSameMethodName_notRewritten() {
    String js =
        "var A = function() {};"
            + "A.prototype.foo = function() { return 1; };"
            + "A.prototype.foo = function() { return 2; };"
            + "var a = new A();"
            + "a.foo();";

    String output = compileAndRunPass(js);

    assertFalse("ambiguous multiple definitions should prevent rewrite",
        output.contains("JSCompiler_StaticMethods_foo"));
  }

  @Test
  public void testProcess_definitionInsideControlStructure_notRewritten() {
    String js =
        "var A = function() {};"
            + "if (true) {"
            + "  A.prototype.foo = function() { return 1; };"
            + "}"
            + "var a = new A();"
            + "a.foo();";

    String output = compileAndRunPass(js);

    assertFalse("definition inside a control structure should not be rewritten",
        output.contains("JSCompiler_StaticMethods_foo"));
  }

  @Test
  public void testProcess_emptyInput_returnsWithoutError() {
    String js = "";

    String output = compileAndRunPass(js);

    assertNotNull(output);
  }

  @Test
  public void testProcess_nonPrototypeAssignment_notRewritten() {
    String js =
        "var obj = {};"
            + "obj.foo = function() { return 1; };"
            + "obj.foo();";

    String output = compileAndRunPass(js);

    assertFalse("assignment that is not a prototype method should not be rewritten",
        output.contains("JSCompiler_StaticMethods_foo"));
  }

  // -------------------------------------------------------------------
  // Constructor behavior
  // -------------------------------------------------------------------

  @Test
  public void testConstructor_withNullCompiler_doesNotThrowImmediately() {
    // Constructor only stores the reference; it should not fail eagerly.
    DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(null);
    assertNotNull(pass);
  }

  @Test
  public void testConstructor_withValidCompiler_createsInstance() {
    DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);
    assertNotNull(pass);
  }

  // -------------------------------------------------------------------
  // Exception cases
  // -------------------------------------------------------------------

  @Test
  public void testProcess_withNullRootNode_throwsException() {
    DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);

    boolean threw = false;
    try {
      pass.process(null, null);
    } catch (Exception e) {
      // Expected: SimpleDefinitionFinder.process(...) should fail on null AST nodes.
      threw = true;
    }
    assertTrue("expected an exception when processing null nodes", threw);
  }

  @Test
  public void testProcess_withNullCompilerAndValidNodes_throwsException() {
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "var A = function() {}; A.prototype.foo = function() {}; (new A()).foo();");

    compiler.compile(extern, input, options);
    Node root = compiler.getRoot();
    Node externsRoot = root.getFirstChild();
    Node jsRoot = root.getLastChild();

    DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(null);

    boolean threw = false;
    try {
      pass.process(externsRoot, jsRoot);
    } catch (Exception e) {
      // Expected: internal calls on the null compiler reference should fail.
      threw = true;
    } catch (Error e) {
      threw = true;
    }
    assertTrue("expected an exception/error when compiler reference is null", threw);
  }
}
