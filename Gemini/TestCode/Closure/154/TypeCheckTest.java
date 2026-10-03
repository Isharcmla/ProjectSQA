package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TypeCheckTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private ReverseAbstractInterpreter rai;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    rai = compiler.getReverseAbstractInterpreter();
  }

  private Node parseAndTypeCheck(String externs, String js) {
    Node externsNode = compiler.parseTestCode(externs);
    Node jsNode = compiler.parseTestCode(js);
    Node root = new Node(com.google.javascript.rhino.Token.BLOCK, externsNode, jsNode);
    TypeCheck typeCheck = new TypeCheck(compiler, rai, registry);
    typeCheck.processForTesting(externsNode, jsNode);
    return root;
  }

  private void check(String js) {
    parseAndTypeCheck("", js);
  }

  private void checkWithExterns(String externs, String js) {
    parseAndTypeCheck(externs, js);
  }

  @Test
  public void testConstructor_withDefaultLevels() {
    TypeCheck typeCheck = new TypeCheck(compiler, rai, registry);
    Assert.assertNotNull(typeCheck);
    Assert.assertEquals(0.0, typeCheck.getTypedPercent(), 0.001);
  }

  @Test
  public void testConstructor_withExplicitLevels() {
    TypeCheck typeCheck = new TypeCheck(compiler, rai, registry, CheckLevel.ERROR, CheckLevel.WARNING);
    Assert.assertNotNull(typeCheck);
    typeCheck.reportMissingProperties(false);
  }

  @Test
  public void testReportMissingProperties_chaining() {
    TypeCheck typeCheck = new TypeCheck(compiler, rai, registry);
    TypeCheck returned = typeCheck.reportMissingProperties(true);
    Assert.assertSame(typeCheck, returned);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullScopeCreator_throwsException() {
    TypeCheck typeCheck = new TypeCheck(compiler, rai, registry);
    Node jsNode = compiler.parseTestCode("var a = 1;");
    Node root = new Node(com.google.javascript.rhino.Token.BLOCK, jsNode);
    typeCheck.process(null, jsNode);
  }

  @Test(expected = IllegalStateException.class)
  public void testProcessForTesting_parentNull_throwsException() {
    TypeCheck typeCheck = new TypeCheck(compiler, rai, registry);
    Node jsNode = compiler.parseTestCode("var a = 1;");
    typeCheck.processForTesting(null, jsNode);
  }

  @Test(expected = NullPointerException.class)
  public void testCheck_nullNode_throwsException() {
    TypeCheck typeCheck = new TypeCheck(compiler, rai, registry);
    typeCheck.check(null, false);
  }

  @Test
  public void testProcessForTesting_simpleVarDeclaration() {
    check("var a = 1;");
    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testLiteralsAndExpressions() {
    String js = ""
        + "var b = true;\n"
        + "var f = false;\n"
        + "var n = null;\n"
        + "var num = 42;\n"
        + "var str = 'hello';\n"
        + "var arr = [1, 2, 3];\n"
        + "var re = /abc/;\n"
        + "var obj = {x: 1, 'y': 2};\n"
        + "var v = void 0;\n"
        + "var t = typeof num;\n"
        + "var comma = (1, 2);\n"
        + "var notB = !b;\n"
        + "var bitNot = ~num;\n"
        + "var pos = +num;\n"
        + "var neg = -num;\n"
        + "var inc = ++num;\n"
        + "var dec = --num;\n";
    check(js);
  }

  @Test
  public void testBinaryOperators() {
    String js = ""
        + "var a = 1 + 2;\n"
        + "var b = 2 - 1;\n"
        + "var c = 2 * 3;\n"
        + "var d = 4 / 2;\n"
        + "var e = 5 % 2;\n"
        + "var f = 1 << 2;\n"
        + "var g = 4 >> 1;\n"
        + "var h = 4 >>> 1;\n"
        + "var i = 1 & 2;\n"
        + "var j = 1 | 2;\n"
        + "var k = 1 ^ 2;\n"
        + "a += 1;\n"
        + "b -= 1;\n"
        + "c *= 2;\n"
        + "d /= 2;\n"
        + "e %= 2;\n"
        + "f <<= 1;\n"
        + "g >>= 1;\n"
        + "h >>>= 1;\n"
        + "i &= 1;\n"
        + "j |= 1;\n"
        + "k ^= 1;\n";
    check(js);
  }

  @Test
  public void testComparisons() {
    String js = ""
        + "var a = (1 < 2);\n"
        + "var b = (2 <= 3);\n"
        + "var c = (3 > 2);\n"
        + "var d = (4 >= 4);\n"
        + "var e = ('a' < 'b');\n"
        + "var f = (1 == 1);\n"
        + "var g = (1 != 2);\n"
        + "var h = (1 === 1);\n"
        + "var i = (1 !== 2);\n"
        + "var j = 'foo' in {};\n"
        + "var k = [] instanceof Object;\n";
    check(js);
  }

  @Test
  public void testControlFlowStatements() {
    String js = ""
        + "var x = 10;\n"
        + "if (x > 5) { x++; } else { x--; }\n"
        + "while (x < 20) { x++; break; }\n"
        + "do { x++; continue; } while (x < 15);\n"
        + "for (var i = 0; i < 5; i++) { x += i; }\n"
        + "switch (x) {\n"
        + "  case 10: x = 1; break;\n"
        + "  default: x = 2;\n"
        + "}\n"
        + "try { throw new Error('err'); } catch (err) {}\n"
        + "label: for(var j=0; j<1; j++) { break label; }\n"
        + "debugger;\n";
    check(js);
  }

  @Test
  public void testFunctionsAndCalls() {
    String js = ""
        + "/** @param {number} x \n @return {number} */\n"
        + "function foo(x) {\n"
        + "  return x + 1;\n"
        + "}\n"
        + "var result = foo(5);\n"
        + "/** @constructor */\n"
        + "function Bar() {\n"
        + "  this.val = 10;\n"
        + "}\n"
        + "var bar = new Bar();\n"
        + "var prop = bar.val;\n"
        + "var elem = bar['val'];\n"
        + "delete bar.val;\n";
    check(js);
  }

  @Test
  public void testBadDelete_warning() {
    String js = "delete (1 + 2);";
    check(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testNotCallable_warning() {
    String js = "var x = 5; x();";
    check(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testConstructorNotCallable_warning() {
    String js = ""
        + "/** @constructor */\n"
        + "function Foo() {}\n"
        + "Foo();\n";
    check(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWrongArgumentCount_warning() {
    String js = ""
        + "/** @param {number} a \n @param {number} b */\n"
        + "function f(a, b) {}\n"
        + "f(1);\n";
    check(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testBitOperationInvalidType_warning() {
    String js = "var x = ~'string';";
    check(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testDeterministicTest_warning() {
    String js = ""
        + "/** @type {number} */\n"
        + "var x = 1;\n"
        + "var res = (x === 'str');\n";
    check(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testDeterministicTestNoResult_warning() {
    String js = ""
        + "/** @type {number} */\n"
        + "var x = 1;\n"
        + "/** @type {string} */\n"
        + "var y = 'test';\n"
        + "var res = (x === y);\n";
    check(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testNoTypeCheckSection() {
    String js = ""
        + "/** @no_typecheck */\n"
        + "function test() {\n"
        + "  var x = 5;\n"
        + "  x();\n"
        + "}\n";
    check(js);
    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testEnums() {
    String js = ""
        + "/** @enum {number} */\n"
        + "var MyEnum = {\n"
        + "  A: 1,\n"
        + "  B: 2\n"
        + "};\n"
        + "var val = MyEnum.A;\n"
        + "var invalid = MyEnum.NON_EXISTING;\n";
    check(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testEnumCopyInitializer() {
    String js = ""
        + "/** @enum {number} */\n"
        + "var Enum1 = { A: 1 };\n"
        + "/** @enum {number} */\n"
        + "var Enum2 = Enum1;\n";
    check(js);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testInterfaceAndInheritance() {
    String js = ""
        + "/** @interface */\n"
        + "function InterfaceFoo() {}\n"
        + "InterfaceFoo.prototype.method = function() {};\n"
        + "/** @constructor \n * @implements {InterfaceFoo} */\n"
        + "function ImplFoo() {}\n"
        + "/** @override */\n"
        + "ImplFoo.prototype.method = function() {};\n";
    check(js);
    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testInterfaceFunctionNotEmpty_warning() {
    String js = ""
        + "/** @interface */\n"
        + "function InterfaceFoo() {}\n"
        + "InterfaceFoo.prototype.method = function() { return 1; };\n";
    check(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testUnknownOverride_warning() {
    String js = ""
        + "/** @constructor */\n"
        + "function SuperClass() {}\n"
        + "/** @constructor \n * @extends {SuperClass} */\n"
        + "function SubClass() {}\n"
        + "/** @override */\n"
        + "SubClass.prototype.notOnSuper = function() {};\n";
    check(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testOverridingPrototypeWithNonObject_warning() {
    String js = ""
        + "/** @constructor */\n"
        + "function Foo() {}\n"
        + "Foo.prototype = 123;\n";
    check(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWithStatement() {
    String js = ""
        + "var obj = {a: 1};\n"
        + "with (obj) {\n"
        + "  a = 2;\n"
        + "}\n";
    check(js);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testInconsistentReturnType_warning() {
    String js = ""
        + "/** @return {number} */\n"
        + "function foo() {\n"
        + "  return 'string';\n"
        + "}\n";
    check(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testFunctionMasksVariable_warning() {
    String js = ""
        + "var foo = 10;\n"
        + "function bar() {\n"
        + "  function foo() {}\n"
        + "}\n";
    check(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testTypeCasting() {
    String js = ""
        + "var x = /** @type {number} */ ('test');\n";
    check(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testIllegalImplicitCast_warning() {
    String js = ""
        + "var obj = {};\n"
        + "/** @implicitCast */ obj.prop = 123;\n";
    check(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testReportUnknownTypesOption() {
    Node externsNode = compiler.parseTestCode("");
    Node jsNode = compiler.parseTestCode("var x; var y = x;");
    new Node(com.google.javascript.rhino.Token.BLOCK, externsNode, jsNode);
    TypeCheck typeCheck = new TypeCheck(compiler, rai, registry, CheckLevel.WARNING, CheckLevel.WARNING);
    typeCheck.processForTesting(externsNode, jsNode);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testGetTypedPercent() {
    Node externsNode = compiler.parseTestCode("");
    Node jsNode = compiler.parseTestCode("var a = 1; var b = 'str';");
    new Node(com.google.javascript.rhino.Token.BLOCK, externsNode, jsNode);
    TypeCheck typeCheck = new TypeCheck(compiler, rai, registry);
    typeCheck.processForTesting(externsNode, jsNode);
    double percent = typeCheck.getTypedPercent();
    Assert.assertTrue(percent > 0.0);
    Assert.assertTrue(percent <= 100.0);
  }

  @Test
  public void testCheckExterns() {
    String externs = "/** @type {number} */ var extVar;";
    String js = "var myVar = extVar;";
    checkWithExterns(externs, js);
    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, compiler.getErrorCount());
  }
}
