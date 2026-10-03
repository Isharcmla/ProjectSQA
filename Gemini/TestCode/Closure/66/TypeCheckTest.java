package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.SemanticReverseAbstractInterpreter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TypeCheckTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private SemanticReverseAbstractInterpreter rai;

  @Before
  public void setUp() {
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    registry = compiler.getTypeRegistry();
    rai = new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry);
  }

  private TypeCheck createTypeCheck(CheckLevel missingOverride, CheckLevel unknownTypes) {
    return new TypeCheck(compiler, rai, registry, missingOverride, unknownTypes);
  }

  private TypeCheck createDefaultTypeCheck() {
    return new TypeCheck(compiler, rai, registry);
  }

  private Scope checkCode(TypeCheck tc, String externsJs, String js) {
    Node externsRoot = externsJs != null ? compiler.parseSyntheticCode("externs", externsJs) : null;
    Node jsRoot = compiler.parseSyntheticCode("testcode", js);
    Node root = new Node(Token.BLOCK);
    if (externsRoot != null) {
      root.addChildToBack(externsRoot);
    }
    root.addChildToBack(jsRoot);
    return tc.processForTesting(externsRoot, jsRoot);
  }

  private Scope checkCode(String js) {
    TypeCheck tc = createTypeCheck(CheckLevel.WARNING, CheckLevel.WARNING);
    return checkCode(tc, "", js);
  }

  @Test
  public void testConstructors_validInitialization() {
    TypeCheck tc1 = new TypeCheck(compiler, rai, registry);
    Assert.assertNotNull(tc1);

    TypeCheck tc2 = new TypeCheck(compiler, rai, registry, CheckLevel.ERROR, CheckLevel.OFF);
    Assert.assertNotNull(tc2);

    TypeCheck tc3 = new TypeCheck(compiler, rai, registry, null, null, CheckLevel.WARNING, CheckLevel.OFF);
    Assert.assertNotNull(tc3);
  }

  @Test
  public void testReportMissingProperties_chaining() {
    TypeCheck tc = createDefaultTypeCheck();
    TypeCheck returned = tc.reportMissingProperties(false);
    Assert.assertSame(tc, returned);
    returned = tc.reportMissingProperties(true);
    Assert.assertSame(tc, returned);
  }

  @Test
  public void testGetTypedPercent_emptyAndPopulated() {
    TypeCheck tc = createDefaultTypeCheck();
    Assert.assertEquals(0.0, tc.getTypedPercent(), 0.001);

    checkCode(tc, "", "var x = 10; var y = 'hello'; var z = true;");
    Assert.assertTrue(tc.getTypedPercent() > 0.0);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullScopeCreator_throwsException() {
    TypeCheck tc = createDefaultTypeCheck();
    Node jsRoot = new Node(Token.SCRIPT);
    Node parent = new Node(Token.BLOCK, jsRoot);
    tc.process(null, jsRoot);
  }

  @Test(expected = IllegalStateException.class)
  public void testProcessForTesting_noParent_throwsException() {
    TypeCheck tc = createDefaultTypeCheck();
    Node jsRoot = new Node(Token.SCRIPT);
    tc.processForTesting(null, jsRoot);
  }

  @Test(expected = NullPointerException.class)
  public void testCheck_nullNode_throwsException() {
    TypeCheck tc = createDefaultTypeCheck();
    tc.check(null, false);
  }

  @Test
  public void testVisit_primitivesAndLiterals() {
    String js = ""
        + "var a = true;\n"
        + "var b = false;\n"
        + "var c = null;\n"
        + "var d = 123.45;\n"
        + "var e = 'string_literal';\n"
        + "var f = [1, 2, 3];\n"
        + "var g = /abc/g;\n"
        + "var h = void 0;\n"
        + "var i = typeof 'abc';\n"
        + "var j = (1, 2);\n"
        + "var k = !a;\n";
    checkCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisit_unaryNumericOperators() {
    String js = ""
        + "var x = 1;\n"
        + "x++;\n"
        + "x--;\n"
        + "++x;\n"
        + "--x;\n"
        + "var y = +x;\n"
        + "var z = -x;\n";
    checkCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisit_binaryArithmeticAndBitwiseOperators() {
    String js = ""
        + "var a = 10 + 20;\n"
        + "var b = 10 - 5;\n"
        + "var c = 10 * 5;\n"
        + "var d = 10 / 2;\n"
        + "var e = 10 % 3;\n"
        + "var f = 1 << 2;\n"
        + "var g = 4 >> 1;\n"
        + "var h = 4 >>> 1;\n"
        + "var i = 1 & 3;\n"
        + "var j = 1 | 2;\n"
        + "var k = 1 ^ 2;\n"
        + "var l = ~1;\n";
    checkCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisit_compoundAssignments() {
    String js = ""
        + "var x = 10;\n"
        + "x += 2;\n"
        + "x -= 2;\n"
        + "x *= 2;\n"
        + "x /= 2;\n"
        + "x %= 2;\n"
        + "x <<= 1;\n"
        + "x >>= 1;\n"
        + "x >>>= 1;\n"
        + "x &= 1;\n"
        + "x |= 1;\n"
        + "x ^= 1;\n";
    checkCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisit_comparisons() {
    String js = ""
        + "var a = 1 < 2;\n"
        + "var b = 1 <= 2;\n"
        + "var c = 1 > 2;\n"
        + "var d = 1 >= 2;\n"
        + "var e = 'a' < 'b';\n"
        + "var f = 1 == 2;\n"
        + "var g = 1 != 2;\n"
        + "var h = 1 === 2;\n"
        + "var i = 1 !== 2;\n"
        + "var j = 'prop' in {};\n"
        + "var k = {} instanceof Object;\n";
    checkCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisit_controlStructures() {
    String js = ""
        + "if (true) {}\n"
        + "var i = 0;\n"
        + "while (i < 1) { i++; }\n"
        + "do { i--; } while (i > 0);\n"
        + "for (var j = 0; j < 2; j++) {}\n"
        + "switch (i) {\n"
        + "  case 0: break;\n"
        + "  default: break;\n"
        + "}\n"
        + "try { throw new Error(); } catch (e) {} finally {}\n";
    checkCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisit_functionsAndCalls() {
    String js = ""
        + "/**\n"
        + " * @param {number} x\n"
        + " * @param {string=} opt_y\n"
        + " * @return {number}\n"
        + " */\n"
        + "function foo(x, opt_y) {\n"
        + "  return x + 1;\n"
        + "}\n"
        + "foo(1);\n"
        + "foo(1, 'bar');\n";
    checkCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisit_newAndConstructors() {
    String js = ""
        + "/** @constructor */\n"
        + "function MyClass(a) {\n"
        + "  this.a = a;\n"
        + "}\n"
        + "var instance = new MyClass(10);\n";
    checkCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisit_objectsAndProperties() {
    String js = ""
        + "var obj = {\n"
        + "  foo: 1,\n"
        + "  get bar() { return 2; },\n"
        + "  set bar(v) {}\n"
        + "};\n"
        + "var val = obj.foo;\n"
        + "var elem = obj['foo'];\n"
        + "delete obj.foo;\n"
        + "delete obj['bar'];\n";
    checkCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisit_enums() {
    String js = ""
        + "/** @enum {number} */\n"
        + "var Numbers = {\n"
        + "  ONE: 1,\n"
        + "  TWO: 2\n"
        + "};\n"
        + "/** @type {Numbers} */\n"
        + "var num = Numbers.ONE;\n"
        + "/** @enum {number} */\n"
        + "var NumbersCopy = Numbers;\n";
    checkCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisit_interfacesAndInheritance() {
    String js = ""
        + "/** @interface */\n"
        + "function InterA() {}\n"
        + "InterA.prototype.methodA = function() {};\n"
        + "/** @interface\n"
        + " * @extends {InterA}\n"
        + " */\n"
        + "function InterB() {}\n"
        + "InterB.prototype.methodB = function() {};\n"
        + "/** @constructor\n"
        + " * @implements {InterB}\n"
        + " */\n"
        + "function Impl() {}\n"
        + "Impl.prototype.methodA = function() {};\n"
        + "Impl.prototype.methodB = function() {};\n";
    checkCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisit_classInheritanceAndOverrides() {
    String js = ""
        + "/** @constructor */\n"
        + "function Base() {}\n"
        + "Base.prototype.draw = function() {};\n"
        + "/** @constructor\n"
        + " * @extends {Base}\n"
        + " */\n"
        + "function Derived() {}\n"
        + "goog.inherits(Derived, Base);\n"
        + "/** @override */\n"
        + "Derived.prototype.draw = function() {};\n";
    checkCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisit_noTypeCheckSection() {
    String js = ""
        + "/** @notypecheck */\n"
        + "function uncheck() {\n"
        + "  var x = 1;\n"
        + "  x = 'invalid';\n"
        + "}\n";
    checkCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testWarning_wrongArgumentCount() {
    String js = ""
        + "/** @param {number} x */\n"
        + "function f(x) {}\n"
        + "f();\n";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_notAConstructor() {
    String js = "var notCtor = 123; new notCtor();";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_notCallable() {
    String js = "var x = 123; x();";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_badDelete() {
    String js = "delete 123;";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_badBitwiseOperator() {
    String js = "var a = 'foo' & 1;";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_bitNotNonInteger() {
    String js = "var a = ~'foo';";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_constructorNotCallable() {
    String js = ""
        + "/** @constructor */\n"
        + "function Foo() {}\n"
        + "Foo();\n";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_conflictingExtendedType_ctorExtendsInterface() {
    String js = ""
        + "/** @interface */\n"
        + "function InterfaceA() {}\n"
        + "/** @constructor\n"
        + " * @extends {InterfaceA}\n"
        + " */\n"
        + "function SubClass() {}\n";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_conflictingExtendedType_interfaceExtendsClass() {
    String js = ""
        + "/** @constructor */\n"
        + "function ClassA() {}\n"
        + "/** @interface\n"
        + " * @extends {ClassA}\n"
        + " */\n"
        + "function InterfaceB() {}\n";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_conflictingImplementedType_interfaceImplements() {
    String js = ""
        + "/** @interface */\n"
        + "function InterfaceA() {}\n"
        + "/** @interface\n"
        + " * @implements {InterfaceA}\n"
        + " */\n"
        + "function InterfaceB() {}\n";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_badImplementedType_implementsClass() {
    String js = ""
        + "/** @constructor */\n"
        + "function ClassA() {}\n"
        + "/** @constructor\n"
        + " * @implements {ClassA}\n"
        + " */\n"
        + "function ClassB() {}\n";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_unknownOverride() {
    String js = ""
        + "/** @constructor */\n"
        + "function Foo() {}\n"
        + "/** @override */\n"
        + "Foo.prototype.nonExistent = function() {};\n";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_hiddenSuperclassPropertyMismatch() {
    String js = ""
        + "/** @constructor */\n"
        + "function Base() {}\n"
        + "/** @type {number} */\n"
        + "Base.prototype.prop = 10;\n"
        + "/** @constructor\n"
        + " * @extends {Base}\n"
        + " */\n"
        + "function Sub() {}\n"
        + "goog.inherits(Sub, Base);\n"
        + "/** @override\n"
        + " * @type {string}\n"
        + " */\n"
        + "Sub.prototype.prop = 'mismatch';\n";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_missingOverrideWarning() {
    TypeCheck tc = createTypeCheck(CheckLevel.WARNING, CheckLevel.OFF);
    String js = ""
        + "/** @constructor */\n"
        + "function Base() {}\n"
        + "Base.prototype.foo = function() {};\n"
        + "/** @constructor\n"
        + " * @extends {Base}\n"
        + " */\n"
        + "function Sub() {}\n"
        + "goog.inherits(Sub, Base);\n"
        + "Sub.prototype.foo = function() {};\n";
    checkCode(tc, "", js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_incompatibleExtendedInterfaceProperties() {
    String js = ""
        + "/** @interface */\n"
        + "function InterfaceA() {}\n"
        + "/** @type {number} */\n"
        + "InterfaceA.prototype.prop;\n"
        + "/** @interface */\n"
        + "function InterfaceB() {}\n"
        + "/** @type {string} */\n"
        + "InterfaceB.prototype.prop;\n"
        + "/** @interface\n"
        + " * @extends {InterfaceA}\n"
        + " * @extends {InterfaceB}\n"
        + " */\n"
        + "function InterfaceC() {}\n";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_interfaceMemberNotEmpty() {
    String js = ""
        + "/** @interface */\n"
        + "function MyInterface() {}\n"
        + "MyInterface.prototype.doSomething = function() {\n"
        + "  return 1;\n"
        + "};\n";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_invalidInterfaceMemberDeclaration() {
    String js = ""
        + "/** @interface */\n"
        + "function MyInterface() {}\n"
        + "MyInterface.prototype.num = 123;\n";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_inexistentEnumElement() {
    String js = ""
        + "/** @enum {number} */\n"
        + "var MyEnum = { A: 1 };\n"
        + "var x = MyEnum.B;\n";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarning_withNonObject() {
    String js = "with(123) {}";
    checkCode(js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testExternsHandling() {
    String externs = "/** @type {number} */ var externVar;";
    String js = "var local = externVar + 1;";
    checkCode(createDefaultTypeCheck(), externs, js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisitName_variousContexts() {
    String js = ""
        + "function f(param) {\n"
        + "  var localVar = param;\n"
        + "  try {\n"
        + "  } catch (e) {\n"
        + "    localVar = e;\n"
        + "  }\n"
        + "}\n";
    checkCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisit_labeledAndSpecialNodes() {
    String js = ""
        + "lbl: for (var i = 0; i < 1; i++) {\n"
        + "  if (i === 0) continue lbl;\n"
        + "  debugger;\n"
        + "}\n";
    checkCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }
}
