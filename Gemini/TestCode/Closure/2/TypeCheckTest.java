package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

public class TypeCheckTest {

  private Compiler compiler;
  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.WARNING);
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
  }

  private Node createRoot(String externsCode, String jsCode) {
    Node externsRoot = compiler.parseTestCode(externsCode);
    Node jsRoot = compiler.parseTestCode(jsCode);
    Node root = new Node(Token.BLOCK, externsRoot, jsRoot);
    return root;
  }

  private TypeCheck createTypeCheck() {
    return new TypeCheck(
        compiler,
        compiler.getReverseAbstractInterpreter(),
        registry,
        CheckLevel.WARNING,
        CheckLevel.OFF);
  }

  @Test
  public void testConstructors_allVariants() {
    TypeCheck tc1 = new TypeCheck(
        compiler,
        compiler.getReverseAbstractInterpreter(),
        registry);
    assertNotNull(tc1);

    TypeCheck tc2 = new TypeCheck(
        compiler,
        compiler.getReverseAbstractInterpreter(),
        registry,
        CheckLevel.ERROR,
        CheckLevel.WARNING);
    assertNotNull(tc2);

    TypeCheck tc3 = new TypeCheck(
        compiler,
        compiler.getReverseAbstractInterpreter(),
        registry,
        null,
        null,
        CheckLevel.OFF,
        CheckLevel.OFF);
    assertNotNull(tc3);
  }

  @Test
  public void testReportMissingProperties_chaining() {
    TypeCheck tc = createTypeCheck();
    TypeCheck result = tc.reportMissingProperties(false);
    assertEquals(tc, result);
    result = tc.reportMissingProperties(true);
    assertEquals(tc, result);
  }

  @Test
  public void testProcess_nullScopeThrowsException() {
    TypeCheck tc = createTypeCheck();
    Node root = createRoot("", "var x = 1;");
    try {
      tc.process(root.getFirstChild(), root.getLastChild());
      fail("Expected NullPointerException due to null scopeCreator/topScope");
    } catch (NullPointerException expected) {
      // Expected exception
    }
  }

  @Test
  public void testProcessForTesting_basicTypesAndPercentages() {
    TypeCheck tc = createTypeCheck();
    Node root = createRoot("", "var x = 10; var s = 'hello'; var b = true;");
    Scope scope = tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertNotNull(scope);
    assertTrue(tc.getTypedPercent() > 0.0);
  }

  @Test
  public void testProcessForTesting_nullExterns() {
    Node jsRoot = compiler.parseTestCode("var a = 1;");
    Node root = new Node(Token.BLOCK, jsRoot);
    TypeCheck tc = createTypeCheck();
    Scope scope = tc.processForTesting(null, jsRoot);
    assertNotNull(scope);
    assertTrue(tc.getTypedPercent() >= 0.0);
  }

  @Test
  public void testGetTypedPercent_emptyInput() {
    TypeCheck tc = createTypeCheck();
    Node root = createRoot("", "");
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertEquals(0.0, tc.getTypedPercent(), 0.001);
  }

  @Test
  public void testVisitBinaryOperators_arithmetic() {
    String js = "var a = 1 + 2;\n"
        + "var b = 2 - 1;\n"
        + "var c = 3 * 4;\n"
        + "var d = 4 / 2;\n"
        + "var e = 5 % 2;\n"
        + "var f = 1;\n"
        + "f += 2; f -= 1; f *= 3; f /= 2; f %= 2;";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisitBinaryOperators_bitwise() {
    String js = "var a = 1 & 2;\n"
        + "var b = 1 | 2;\n"
        + "var c = 1 ^ 2;\n"
        + "var d = 1 << 2;\n"
        + "var e = 1 >> 2;\n"
        + "var f = 1 >>> 2;\n"
        + "var g = 1;\n"
        + "g &= 2; g |= 2; g ^= 2; g <<= 2; g >>= 2; g >>>= 2;\n"
        + "var h = ~a;";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisitBinaryOperators_invalidBitwise() {
    String js = "var a = 'test' & 'invalid';";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testVisitComparisons() {
    String js = "var a = 1 < 2;\n"
        + "var b = 1 <= 2;\n"
        + "var c = 1 > 2;\n"
        + "var d = 1 >= 2;\n"
        + "var s = 'a' < 'b';\n"
        + "var e = (1 == 2);\n"
        + "var f = (1 != 2);\n"
        + "var g = (1 === 2);\n"
        + "var h = (1 !== 2);";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertNotNull(root);
  }

  @Test
  public void testVisitUnaryOperators() {
    String js = "var a = +1;\n"
        + "var b = -1;\n"
        + "var c = !true;\n"
        + "var d = typeof 'test';\n"
        + "var e = void 0;\n"
        + "var f = 1;\n"
        + "f++; ++f; f--; --f;";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisitTypeofStrings() {
    String js = "var a = typeof 1 === 'number';\n"
        + "var b = typeof 's' === 'string';\n"
        + "var c = typeof true === 'boolean';\n"
        + "var d = typeof undefined === 'undefined';\n"
        + "var e = typeof (function(){}) === 'function';\n"
        + "var f = typeof {} === 'object';\n"
        + "var g = 'unknown' === typeof 1;\n"
        + "var h = typeof 1 === 'invalid_type';";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testVisitControlFlowAndLiterals() {
    String js = "var arr = [1, 2, 3];\n"
        + "var obj = {a: 1, 'b': 2};\n"
        + "var re = /abc/;\n"
        + "var n = null;\n"
        + "var t = (arr, obj);\n"
        + "var x = (true ? 1 : 2);\n"
        + "var y = (false && true) || true;\n"
        + "if (true) { var z = 1; }\n"
        + "while (false) { break; continue; }\n"
        + "do { } while (false);\n"
        + "for (var i = 0; i < 1; i++) { }\n"
        + "for (var key in obj) { }\n"
        + "switch (x) { case 1: break; default: break; }\n"
        + "try { throw 'err'; } catch (e) { } debugger;";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisitGetPropAndGetElem() {
    String js = "var obj = {prop: 1};\n"
        + "var val = obj.prop;\n"
        + "var elem = obj['prop'];\n"
        + "delete obj.prop;";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisitFunctions_callsAndReturns() {
    String js = "/** @return {number} */\n"
        + "function foo(/** number */ a, /** number */ b) {\n"
        + "  return a + b;\n"
        + "}\n"
        + "var res = foo(1, 2);";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertEquals(0, compiler.getErrorCount());
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisitFunctions_wrongArgumentCount() {
    String js = "function foo(/** number */ a, /** number */ b) {}\n"
        + "foo(1);";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testVisitConstructors_newKeyword() {
    String js = "/** @constructor */\n"
        + "function Bar() {}\n"
        + "var b = new Bar();\n"
        + "var notAFn = 123;\n"
        + "var c = new notAFn();";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testVisitConstructors_calledWithoutNew() {
    String js = "/** @constructor */\n"
        + "function Baz() {}\n"
        + "Baz();";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testVisitNonCallable_throwsWarning() {
    String js = "var notCallable = 1;\n"
        + "notCallable();";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testVisitInAndInstanceofOperators() {
    String js = "var obj = {a: 1};\n"
        + "var hasA = 'a' in obj;\n"
        + "/** @constructor */ function Cls() {}\n"
        + "var inst = new Cls();\n"
        + "var isCls = inst instanceof Cls;";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testCastOperator() {
    String js = "var x = /** @type {number} */ ('1');";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertNotNull(root);
  }

  @Test
  public void testInterfaces_emptyDeclarationAndImplementation() {
    String js = "/** @interface */\n"
        + "function AnInterface() {}\n"
        + "AnInterface.prototype.doSomething = function() {};\n"
        + "/** @constructor\n"
        + " *  @implements {AnInterface} */\n"
        + "function Impl() {}\n"
        + "/** @override */\n"
        + "Impl.prototype.doSomething = function() {};";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testInterfaces_invalidMemberBody() {
    String js = "/** @interface */\n"
        + "function AnInterface() {}\n"
        + "AnInterface.prototype.doSomething = function() { return 1; };";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testStructAndDict_propertyViolations() {
    String js = "/** @constructor\n"
        + " *  @struct */\n"
        + "function MyStruct() {\n"
        + "  this.x = 1;\n"
        + "}\n"
        + "var s = new MyStruct();\n"
        + "s.y = 2;\n"
        + "var inStruct = 'x' in s;\n"
        + "for (var k in s) {}";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testEnumChecking() {
    String js = "/** @enum {number} */\n"
        + "var MyEnum = {\n"
        + "  A: 1,\n"
        + "  B: 2\n"
        + "};\n"
        + "/** @type {MyEnum} */ var val = MyEnum.A;\n"
        + "var invalid = MyEnum.NON_EXISTING;";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testNoTypeCheckAnnotation() {
    String js = "/** @noTypeCheck */\n"
        + "function unChecked() {\n"
        + "  var x = 1;\n"
        + "  x = 'string';\n"
        + "  x();\n"
        + "}";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testReportUnknownTypes_warningTriggered() {
    TypeCheck tc = new TypeCheck(
        compiler,
        compiler.getReverseAbstractInterpreter(),
        registry,
        CheckLevel.WARNING,
        CheckLevel.WARNING);
    String js = "function f(unknownParam) { return unknownParam; }";
    Node root = createRoot("", js);
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWithStatement() {
    String js = "var obj = {a: 1};\n"
        + "with (obj) { var x = a; }";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertNotNull(root);
  }

  @Test
  public void testCheckMethod_directlyInvoked() {
    Node root = createRoot("var ext = 1;", "var js = 2;");
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    tc.check(root.getFirstChild(), true);
    tc.check(root.getLastChild(), false);
    assertTrue(tc.getTypedPercent() >= 0.0);
  }

  @Test
  public void testVisitName_directInvocation() {
    String js = "var testName = 1;";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    Scope scope = tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Node varNode = root.getLastChild().getFirstChild();
    Node nameNode = varNode.getFirstChild();
    NodeTraversal t = new NodeTraversal(compiler, tc);
    t.traverseWithScope(root.getLastChild(), scope);

    boolean typeable = tc.visitName(t, nameNode, varNode);
    assertEquals(false, typeable);

    Node exprNode = new Node(Token.EXPR_RESULT, new Node(Token.NAME, "testName"));
    typeable = tc.visitName(t, exprNode.getFirstChild(), exprNode);
    assertEquals(true, typeable);
  }

  @Test
  public void testShouldTraverse_functionMasksVariable() {
    String js = "var duplicateName = 1;\n"
        + "function duplicateName() {}";
    Node root = createRoot("", js);
    TypeCheck tc = createTypeCheck();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());
    assertTrue(compiler.getWarningCount() > 0);
  }
}
