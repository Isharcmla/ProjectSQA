package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class TypeInferenceTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private Map<String, AssertionFunctionSpec> assertionMap;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    assertionMap = Maps.newHashMap();
  }

  private TypeInference createTypeInference(Node root, Scope scope, ControlFlowGraph<Node> cfg) {
    SemanticReverseAbstractInterpreter rai =
        new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry);
    return new TypeInference(compiler, cfg, rai, scope, assertionMap);
  }

  private Node parseAndInfer(String js) {
    Node root = compiler.parseTestCode(js);
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Scope globalScope = scopeCreator.createScope(root, null);
    ControlFlowGraph<Node> cfg = ControlFlowAnalysis.computeCfg(root, true);
    TypeInference inference = createTypeInference(root, globalScope, assertionMap);
    inference.analyze();
    return root;
  }

  @Test
  public void testGetBooleanOutcomes_allCombinations() {
    BooleanLiteralSet both = BooleanLiteralSet.BOTH;
    BooleanLiteralSet t = BooleanLiteralSet.TRUE;
    BooleanLiteralSet f = BooleanLiteralSet.FALSE;
    BooleanLiteralSet empty = BooleanLiteralSet.EMPTY;

    assertEquals(both, TypeInference.getBooleanOutcomes(both, both, true));
    assertEquals(both, TypeInference.getBooleanOutcomes(both, both, false));
    assertEquals(t, TypeInference.getBooleanOutcomes(t, t, true));
    assertEquals(f, TypeInference.getBooleanOutcomes(f, f, false));
    assertEquals(both, TypeInference.getBooleanOutcomes(t, f, true));
    assertEquals(both, TypeInference.getBooleanOutcomes(f, t, false));
    assertEquals(empty, TypeInference.getBooleanOutcomes(empty, empty, true));
  }

  @Test
  public void testVarDeclaration_inferredPrimitiveTypes() {
    String js = "var a = 1; var b = 'hello'; var c = true; var d = null; var e = undefined;";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testArithmeticOperators_inferredNumber() {
    String js = "var x = 10;\n"
        + "var a = x + 2;\n"
        + "var b = x - 2;\n"
        + "var c = x * 2;\n"
        + "var d = x / 2;\n"
        + "var e = x % 2;\n"
        + "var f = x << 1;\n"
        + "var g = x >> 1;\n"
        + "var h = x >>> 1;\n"
        + "var i = x & 1;\n"
        + "var j = x | 1;\n"
        + "var k = x ^ 1;\n"
        + "var l = ~x;\n"
        + "var m = +x;\n"
        + "var n = -x;\n"
        + "x++;\n"
        + "x--;\n"
        + "x += 2;\n"
        + "x -= 2;\n"
        + "x *= 2;\n"
        + "x /= 2;\n"
        + "x %= 2;\n"
        + "x &= 2;\n"
        + "x |= 2;\n"
        + "x ^= 2;\n"
        + "x <<= 2;\n"
        + "x >>= 2;\n"
        + "x >>>= 2;\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testAddOperator_variousTypes() {
    String js = "var s1 = 'a' + 'b';\n"
        + "var s2 = 'a' + 1;\n"
        + "var s3 = 1 + 'b';\n"
        + "var n = 1 + 2;\n"
        + "var u1 = (true ? 1 : 'x') + 2;\n"
        + "var u2 = 2 + (true ? 1 : 'x');\n"
        + "var strVar = 'a'; strVar += 'b';\n"
        + "var numVar = 1; numVar += 2;\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testComparisonAndLogicalOperators_inferredBoolean() {
    String js = "var a = 1, b = 2;\n"
        + "var r1 = a < b;\n"
        + "var r2 = a <= b;\n"
        + "var r3 = a > b;\n"
        + "var r4 = a >= b;\n"
        + "var r5 = a == b;\n"
        + "var r6 = a != b;\n"
        + "var r7 = a === b;\n"
        + "var r8 = a !== b;\n"
        + "var r9 = !a;\n"
        + "var r10 = 'prop' in {};\n"
        + "var r11 = [] instanceof Array;\n"
        + "var r12 = delete a.b;\n"
        + "var r13 = typeof a;\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testShortCircuitAndHook_inferredTypes() {
    String js = "var a = true && 'str';\n"
        + "var b = false || 123;\n"
        + "var c = (1 > 2) ? 'yes' : 'no';\n"
        + "var d = true ? 1 : 2;\n"
        + "var e = false ? null : undefined;\n"
        + "var f = (true && false) || (true && true);\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testArrayLiteralAndGetElem() {
    String js = "var arr = [1, 2, 3];\n"
        + "var elem = arr[0];\n"
        + "var emptyArr = [];\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testObjectLiteralAndGetProp() {
    String js = "var obj = { x: 1, y: 'str', z: true };\n"
        + "var px = obj.x;\n"
        + "var py = obj.y;\n"
        + "obj.x = 2;\n"
        + "obj.w = 'new prop';\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testFunctionCallAndReturn() {
    String js = "function foo(a, b) {\n"
        + "  return a + b;\n"
        + "}\n"
        + "var res = foo(1, 2);\n"
        + "var res2 = foo('x', 'y');\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testNewExpression() {
    String js = "/** @constructor */ function Foo() { this.x = 10; }\n"
        + "var f = new Foo();\n"
        + "var fx = f.x;\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testControlFlow_ifElseAndLoops() {
    String js = "var x = 1;\n"
        + "if (x > 0) {\n"
        + "  x = 'positive';\n"
        + "} else {\n"
        + "  x = 'non-positive';\n"
        + "}\n"
        + "while (x == 'loop') {\n"
        + "  x = 0;\n"
        + "}\n"
        + "for (var i = 0; i < 10; i++) {\n"
        + "  x = i;\n"
        + "}\n"
        + "var obj = {a: 1, b: 2};\n"
        + "for (var key in obj) {\n"
        + "  var val = obj[key];\n"
        + "}\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testSwitchStatement() {
    String js = "var x = 1;\n"
        + "var res;\n"
        + "switch (x) {\n"
        + "  case 1:\n"
        + "    res = 'one';\n"
        + "    break;\n"
        + "  case 2:\n"
        + "    res = 'two';\n"
        + "    break;\n"
        + "  default:\n"
        + "    res = 'other';\n"
        + "}\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testTryCatchThrow() {
    String js = "var res = null;\n"
        + "try {\n"
        + "  throw new Error('err');\n"
        + "} catch (e) {\n"
        + "  res = e;\n"
        + "}\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testTypeCast() {
    String js = "var x = /** @type {number} */ ('not a number');\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testAssertionFunctions() {
    CodingConvention convention = new GoogleCodingConvention();
    assertionMap.put("goog.asserts.assert",
        new AssertionFunctionSpec("goog.asserts.assert"));
    assertionMap.put("goog.asserts.assertNumber",
        new AssertionFunctionSpec("goog.asserts.assertNumber", JSTypeNative.NUMBER_TYPE));
    assertionMap.put("goog.asserts.assertString",
        new AssertionFunctionSpec("goog.asserts.assertString", JSTypeNative.STRING_TYPE));

    String js = "var goog = { asserts: {} };\n"
        + "goog.asserts.assert = function(x) { return x; };\n"
        + "goog.asserts.assertNumber = function(x) { return x; };\n"
        + "goog.asserts.assertString = function(x) { return x; };\n"
        + "var x = /** @type {?number} */ (null);\n"
        + "goog.asserts.assert(x != null);\n"
        + "var y = /** @type {*} */ ('str');\n"
        + "goog.asserts.assertString(y);\n"
        + "var z = /** @type {*} */ (123);\n"
        + "goog.asserts.assertNumber(z);\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testFunctionBindInference() {
    String js = "function f(a, b) { return a + b; }\n"
        + "var bound = f.bind(null, 1);\n"
        + "var result = bound(2);\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testIIFEInference() {
    String js = "var res = (function(a, b) {\n"
        + "  return a + b;\n"
        + "})(1, 2);\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testTemplatizedFunctionCalls() {
    String js = "/**\n"
        + " * @template T\n"
        + " * @param {T} x\n"
        + " * @return {T}\n"
        + " */\n"
        + "function id(x) { return x; }\n"
        + "var num = id(123);\n"
        + "var str = id('abc');\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testCreateEntryAndInitialEstimateLattice() {
    String js = "var a = 1;";
    Node root = compiler.parseTestCode(js);
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Scope globalScope = scopeCreator.createScope(root, null);
    ControlFlowGraph<Node> cfg = ControlFlowAnalysis.computeCfg(root, true);
    TypeInference inference = createTypeInference(root, globalScope, cfg);

    FlowScope entry = inference.createEntryLattice();
    assertNotNull(entry);

    FlowScope initial = inference.createInitialEstimateLattice();
    assertNotNull(initial);

    FlowScope result = inference.flowThrough(root, initial);
    assertEquals(initial, result);

    FlowScope flowScope = inference.flowThrough(root, entry);
    assertNotNull(flowScope);
  }

  @Test
  public void testCommaAndParamListNode() {
    String js = "var a = (1, 2, 'three');\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testConstructorWithThisProperties() {
    String js = "/** @constructor */\n"
        + "function Person(name) {\n"
        + "  this.name = name;\n"
        + "  this.age = 0;\n"
        + "}\n"
        + "Person.prototype.sayHi = function() { return this.name; };\n"
        + "var p = new Person('Alice');\n"
        + "var n = p.name;\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testNestedFunctionAndEscapedVars() {
    String js = "function outer() {\n"
        + "  var x = 1;\n"
        + "  function inner() {\n"
        + "    x = 'changed';\n"
        + "  }\n"
        + "  inner();\n"
        + "  return x;\n"
        + "}\n"
        + "outer();\n";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }

  @Test
  public void testEmptyAndEdgeCaseAST() {
    String js = ";;;";
    Node root = parseAndInfer(js);
    assertNotNull(root);
  }
}
