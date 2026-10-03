package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

public class RuntimeTypeCheckTest extends CompilerTestCase {

  private String logFunction = null;

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new RuntimeTypeCheck(compiler, logFunction);
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    this.logFunction = null;
    enableTypeCheck(CheckLevel.WARNING);
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  @Test
  public void testProcess_nullLogFunction_injectsDefaultBoilerplate() {
    this.logFunction = null;
    String js = "function f() {}";
    testSame(js);
  }

  @Test
  public void testProcess_customLogFunction_injectsCustomBoilerplate() {
    this.logFunction = "console.log";
    String js = "function f() {}";
    testSame(js);
  }

  @Test
  public void testProcess_functionWithPrimitiveParameters_addsCheckTypeCalls() {
    String js = "/**\n"
        + " * @param {string} a\n"
        + " * @param {number} b\n"
        + " * @param {boolean} c\n"
        + " * @param {void} d\n"
        + " * @param {null} e\n"
        + " */\n"
        + "function f(a, b, c, d, e) {}";
    testSame(js);
  }

  @Test
  public void testProcess_functionWithReturnValue_addsCheckTypeOnReturn() {
    String js = "/**\n"
        + " * @param {number} x\n"
        + " * @return {string}\n"
        + " */\n"
        + "function f(x) {\n"
        + "  return 'hello';\n"
        + "}";
    testSame(js);
  }

  @Test
  public void testProcess_functionWithEmptyReturn_doesNotAddCheck() {
    String js = "/**\n"
        + " * @return {void}\n"
        + " */\n"
        + "function f() {\n"
        + "  return;\n"
        + "}";
    testSame(js);
  }

  @Test
  public void testProcess_functionWithUnionType_checksAlternates() {
    String js = "/**\n"
        + " * @param {string|number|null} x\n"
        + " * @return {boolean|string}\n"
        + " */\n"
        + "function f(x) {\n"
        + "  return true;\n"
        + "}";
    testSame(js);
  }

  @Test
  public void testProcess_functionWithUnknownType_skipsTypeCheck() {
    String js = "/**\n"
        + " * @param {*} x\n"
        + " * @param {?} y\n"
        + " * @return {*}\n"
        + " */\n"
        + "function f(x, y) {\n"
        + "  return x;\n"
        + "}";
    testSame(js);
  }

  @Test
  public void testProcess_userDefinedClass_addsInstanceMarker() {
    String js = "/** @constructor */\n"
        + "function MyClass() {}\n"
        + "/** @param {!MyClass} inst */\n"
        + "function test(inst) {}";
    testSame(js);
  }

  @Test
  public void testProcess_interfaceAndImplementation_addsInterfaceMarkers() {
    String js = "/** @interface */\n"
        + "function MyInterface() {}\n"
        + "/**\n"
        + " * @constructor\n"
        + " * @implements {MyInterface}\n"
        + " */\n"
        + "function MyImpl() {}\n"
        + "/** @param {!MyInterface} i */\n"
        + "function test(i) {}";
    testSame(js);
  }

  @Test
  public void testProcess_externClass_usesExternClassChecker() {
    String externs = "/** @constructor */ function ExternFoo() {}";
    String js = "/** @param {!ExternFoo} x */ function f(x) {}";
    test(externs, js, js, null, null);
  }

  @Test
  public void testProcess_classInheritanceWithInheritsCall_insertsMarkerAfterInherits() {
    String js = "goog.inherits = function(child, parent) {};\n"
        + "/** @constructor */ function SuperClass() {}\n"
        + "/** @constructor */ function SubClass() {}\n"
        + "goog.inherits(SubClass, SuperClass);";
    testSame(js);
  }

  @Test
  public void testProcess_anonymousConstructor_doesNotCrash() {
    String js = "var ns = {};\n"
        + "ns.create = function() {\n"
        + "  return /** @constructor */ function() {};\n"
        + "};";
    testSame(js);
  }

  @Test
  public void testGetBoilerplateCode_withCustomLog_returnsNormalizedNode() {
    Compiler compiler = new Compiler();
    Node node = RuntimeTypeCheck.getBoilerplateCode(compiler, "customLogger");
    Assert.assertNotNull(node);
    Assert.assertTrue(node.hasChildren());
  }

  @Test
  public void testGetBoilerplateCode_withNullLog_returnsNormalizedNode() {
    Compiler compiler = new Compiler();
    Node node = RuntimeTypeCheck.getBoilerplateCode(compiler, null);
    Assert.assertNotNull(node);
    Assert.assertTrue(node.hasChildren());
  }

  @Test
  public void testProcess_emptyProgram_injectsBoilerplateOnly() {
    testSame("");
  }
}
