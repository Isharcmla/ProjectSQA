package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Test;

public class TypeCheckTest {

  private TypeCheck check(String js) {
    return check("", js, CheckLevel.WARNING, CheckLevel.OFF, true);
  }

  private TypeCheck check(String externs, String js) {
    return check(externs, js, CheckLevel.WARNING, CheckLevel.OFF, true);
  }

  private TypeCheck check(
      String externs,
      String js,
      CheckLevel missingOverride,
      CheckLevel unknownTypes,
      boolean reportMissingProps) {
    Compiler compiler = new Compiler();
    Node externsNode = compiler.parseTestCode(externs);
    Node jsNode = compiler.parseTestCode(js);
    Node parent = new Node(Token.BLOCK, externsNode, jsNode);

    JSTypeRegistry registry = compiler.getTypeRegistry();
    SemanticReverseAbstractInterpreter rai =
        new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry);

    TypeCheck tc = new TypeCheck(compiler, rai, registry, missingOverride, unknownTypes);
    tc.reportMissingProperties(reportMissingProps);
    tc.processForTesting(externsNode, jsNode);
    return tc;
  }

  @Test
  public void testConstructors() {
    Compiler compiler = new Compiler();
    JSTypeRegistry registry = compiler.getTypeRegistry();
    SemanticReverseAbstractInterpreter rai =
        new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry);

    TypeCheck tc1 = new TypeCheck(compiler, rai, registry);
    assertNotNull(tc1);

    TypeCheck tc2 = new TypeCheck(compiler, rai, registry, CheckLevel.OFF, CheckLevel.WARNING);
    assertNotNull(tc2);

    TypeCheck tc3 =
        new TypeCheck(
            compiler, rai, registry, null, null, CheckLevel.WARNING, CheckLevel.WARNING);
    assertNotNull(tc3);
  }

  @Test
  public void testGetTypedPercent_empty() {
    Compiler compiler = new Compiler();
    JSTypeRegistry registry = compiler.getTypeRegistry();
    SemanticReverseAbstractInterpreter rai =
        new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry);
    TypeCheck tc = new TypeCheck(compiler, rai, registry);
    assertEquals(0.0, tc.getTypedPercent(), 0.001);
  }

  @Test
  public void testGetTypedPercent_normal() {
    TypeCheck tc = check("var x = 1; var y = 'abc';");
    assertTrue(tc.getTypedPercent() > 0.0);
  }

  @Test
  public void testPrimitivesAndLiterals() {
    check(
        "var b1 = true; var b2 = false;"
            + "var n = 123; var s = 'test';"
            + "var nl = null; var arr = [1, 2, 3];"
            + "var re = /abc/;"
            + "var v = void 0;"
            + "var t = typeof b1;"
            + "var c = (1, 2);");
  }

  @Test
  public void testUnaryOperators() {
    check(
        "var x = 1;"
            + "x++; ++x; x--; --x;"
            + "+x; -x; ~x; !x;"
            + "var str = 'hello';"
            + "~str; +str; -str;");
  }

  @Test
  public void testBinaryOperators_arithmeticAndBitwise() {
    check(
        "var a = 10, b = 20;"
            + "var c = a + b; var d = a - b; var e = a * b; var f = a / b; var g = a % b;"
            + "var h = a << b; var i = a >> b; var j = a >>> b;"
            + "var k = a & b; var l = a | b; var m = a ^ b;");
  }

  @Test
  public void testCompoundAssignmentOperators() {
    check(
        "var a = 1;"
            + "a += 2; a -= 2; a *= 2; a /= 2; a %= 2;"
            + "a <<= 1; a >>= 1; a >>>= 1; a &= 1; a |= 1; a ^= 1;");
  }

  @Test
  public void testComparisons() {
    check(
        "var x = 1, y = 2;"
            + "var r1 = x == y; var r2 = x != y;"
            + "var r3 = x === y; var r4 = x !== y;"
            + "var r5 = x < y; var r6 = x <= y; var r7 = x > y; var r8 = x >= y;"
            + "var s1 = 'a', s2 = 'b';"
            + "var r9 = s1 < s2; var r10 = s1 == s2;");
  }

  @Test
  public void testInAndInstanceofOperators() {
    check(
        "var obj = {a: 1};"
            + "var res1 = 'a' in obj;"
            + "var res2 = 1 in 2;"
            + "/** @constructor */ function Foo() {}"
            + "var res3 = obj instanceof Foo;"
            + "var res4 = 123 instanceof 456;");
  }

  @Test
  public void testDeleteOperator() {
    check(
        "var obj = {a: 1};"
            + "delete obj.a;"
            + "delete obj['a'];"
            + "delete obj;"
            + "delete 123;");
  }

  @Test
  public void testControlStructures() {
    check(
        "var x = 1;"
            + "if (x > 0) {}"
            + "while (x < 10) { x++; }"
            + "do { x--; } while (x > 0);"
            + "for (var i = 0; i < 5; i++) {}"
            + "switch (x) {"
            + "  case 1: break;"
            + "  default: break;"
            + "}"
            + "lbl: for (var j = 0; j < 2; j++) {"
            + "  if (j === 0) continue lbl;"
            + "  break lbl;"
            + "}"
            + "try { throw new Error(); } catch (e) {}"
            + "debugger;");
  }

  @Test
  public void testLogicalExpressionsAndHook() {
    check(
        "var a = true, b = false;"
            + "var c = a && b;"
            + "var d = a || b;"
            + "var e = a ? 1 : 2;");
  }

  @Test
  public void testWithStatement() {
    check("var obj = {x: 1}; with (obj) { var y = x; } with (123) {}");
  }

  @Test
  public void testObjectLiteralsAndGettersSetters() {
    check(
        "var obj = {"
            + "  a: 1,"
            + "  'b': 'test',"
            + "  get c() { return 10; },"
            + "  set c(val) {}"
            + "};");
  }

  @Test
  public void testFunctionDeclarationsAndCalls() {
    check(
        "function add(a, b) { return a + b; }"
            + "add(1, 2);"
            + "add(1);"
            + "add(1, 2, 3);"
            + "var notCallable = 123;"
            + "notCallable();");
  }

  @Test
  public void testConstructorCallsAndNew() {
    check(
        "/** @constructor */ function Car(model) { this.model = model; }"
            + "var c1 = new Car('sedan');"
            + "Car('suv');"
            + "var notCtor = 123;"
            + "new notCtor();");
  }

  @Test
  public void testReturnStatements() {
    check(
        "/** @return {number} */ function f1() { return 1; }"
            + "/** @return {number} */ function f2() { return 'notANumber'; }"
            + "/** @return {number} */ function f3() { return; }"
            + "/** @return {void} */ function f4() { return 1; }"
            + "function f5() { return; }");
  }

  @Test
  public void testFunctionMasksVariable() {
    check("var f = 1; function f() {}");
  }

  @Test
  public void testPropertyAccessAndTests() {
    check(
        "var obj = {prop: 1};"
            + "var a = obj.prop;"
            + "var b = obj.missing;"
            + "if (obj.missing) {}"
            + "while (obj.missing) {}"
            + "do {} while (obj.missing);"
            + "for (; obj.missing;) {}"
            + "var c = typeof obj.missing;"
            + "var d = obj.missing instanceof Object;"
            + "var e = obj.missing && obj.missing.sub;"
            + "var f = obj.missing ? 1 : 2;"
            + "var g = !obj.missing || obj.missing.sub;"
            + "var h = obj['prop'];");
  }

  @Test
  public void testEnumChecking() {
    check(
        "/** @enum {number} */ var E1 = { A: 1, B: 2 };"
            + "/** @enum {number} */ var E2 = { C: 'invalid' };"
            + "/** @enum {string} */ var E3 = E1;"
            + "var val = E1.NON_EXISTENT;");
  }

  @Test
  public void testInheritanceAndOverrides() {
    check(
        "",
        "/** @constructor */ function SuperClass() {}"
            + "SuperClass.prototype.foo = function() {};"
            + "SuperClass.prototype.count = 1;"
            + "/** @constructor \n * @extends {SuperClass} */ function SubClass() {}"
            + "/** @override */ SubClass.prototype.foo = function() {};"
            + "SubClass.prototype.foo = function() {};"
            + "/** @override */ SubClass.prototype.count = 'stringMismatch';"
            + "/** @override */ SubClass.prototype.unknownMethod = function() {};"
            + "SubClass.prototype = 123;",
        CheckLevel.WARNING,
        CheckLevel.OFF,
        true);
  }

  @Test
  public void testInterfaces() {
    check(
        "/** @interface */ function Iface() {}"
            + "Iface.prototype.bar = function() {};"
            + "Iface.prototype.badMethod = function() { return 1; };"
            + "Iface.prototype.badProp = 123;"
            + "/** @constructor \n * @implements {Iface} */ function Impl() {}"
            + "Impl.prototype.bar = function() {};"
            + "/** @constructor \n * @implements {number} */ function BadImpl() {}"
            + "/** @constructor */ function RegularCtor() {}"
            + "/** @constructor \n * @extends {Iface} */ function SubCtor() {}"
            + "/** @interface \n * @implements {Iface} */ function SubIface() {}"
            + "/** @interface \n * @extends {RegularCtor} */ function SubIface2() {}");
  }

  @Test
  public void testInterfaceMultipleInheritanceConflict() {
    check(
        "/** @interface */ function I1() {}"
            + "/** @type {number} */ I1.prototype.x;"
            + "/** @interface */ function I2() {}"
            + "/** @type {string} */ I2.prototype.x;"
            + "/** @interface \n * @extends {I1} \n * @extends {I2} */ function I3() {}");
  }

  @Test
  public void testNoTypeCheckAnnotation() {
    check(
        "/** @noTypeCheck */ function testNoTypeCheck() {"
            + "  var x = 1;"
            + "  x();"
            + "}");
  }

  @Test
  public void testReportUnknownTypes() {
    check(
        "",
        "function fn(unknownArg) { var y = unknownArg; }",
        CheckLevel.WARNING,
        CheckLevel.WARNING,
        true);
  }

  @Test
  public void testVisitName() {
    Compiler compiler = new Compiler();
    Node externsNode = compiler.parseTestCode("");
    Node jsNode = compiler.parseTestCode("var x = 1; x;");
    Node parent = new Node(Token.BLOCK, externsNode, jsNode);

    JSTypeRegistry registry = compiler.getTypeRegistry();
    SemanticReverseAbstractInterpreter rai =
        new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry);
    TypeCheck tc = new TypeCheck(compiler, rai, registry);

    Scope topScope = tc.processForTesting(externsNode, jsNode);
    NodeTraversal t = new NodeTraversal(compiler, tc, new SyntacticScopeCreator(compiler));
    t.traverseWithScope(jsNode, topScope);

    Node nameUnderVar = jsNode.getFirstChild().getFirstChild();
    boolean typeableInVar = tc.visitName(t, nameUnderVar, jsNode.getFirstChild());
    assertEquals(false, typeableInVar);
  }

  @Test
  public void testProcess_nullExterns() {
    Compiler compiler = new Compiler();
    Node jsNode = compiler.parseTestCode("var a = 10;");
    Node parent = new Node(Token.BLOCK, jsNode);

    JSTypeRegistry registry = compiler.getTypeRegistry();
    SemanticReverseAbstractInterpreter rai =
        new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry);
    TypeCheck tc = new TypeCheck(compiler, rai, registry);
    Scope topScope = tc.processForTesting(null, jsNode);
    assertNotNull(topScope);
  }

  @Test
  public void testCheck_nullNodeThrowsException() {
    Compiler compiler = new Compiler();
    JSTypeRegistry registry = compiler.getTypeRegistry();
    SemanticReverseAbstractInterpreter rai =
        new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry);
    TypeCheck tc = new TypeCheck(compiler, rai, registry);

    try {
      tc.check(null, false);
      fail("Expected NullPointerException");
    } catch (NullPointerException expected) {
    }
  }

  @Test
  public void testProcess_withoutTestingSetupThrowsException() {
    Compiler compiler = new Compiler();
    Node externsNode = compiler.parseTestCode("");
    Node jsNode = compiler.parseTestCode("var a = 1;");
    new Node(Token.BLOCK, externsNode, jsNode);

    JSTypeRegistry registry = compiler.getTypeRegistry();
    SemanticReverseAbstractInterpreter rai =
        new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry);
    TypeCheck tc = new TypeCheck(compiler, rai, registry);

    try {
      tc.process(externsNode, jsNode);
      fail("Expected NullPointerException or Preconditions check");
    } catch (NullPointerException expected) {
    }
  }

  @Test
  public void testVisit_unexpectedToken() {
    Compiler compiler = new Compiler();
    Node externsNode = compiler.parseTestCode("");
    Node jsNode = compiler.parseTestCode("var a = 1;");
    new Node(Token.BLOCK, externsNode, jsNode);

    JSTypeRegistry registry = compiler.getTypeRegistry();
    SemanticReverseAbstractInterpreter rai =
        new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry);
    TypeCheck tc = new TypeCheck(compiler, rai, registry);
    Scope topScope = tc.processForTesting(externsNode, jsNode);

    NodeTraversal t = new NodeTraversal(compiler, tc, new SyntacticScopeCreator(compiler));
    t.traverseWithScope(jsNode, topScope);

    Node customNode = new Node(Token.LABEL_NAME);
    tc.visit(t, customNode, jsNode);
  }
}
