package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;

public class TypeInferenceTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private Map<String, AssertionFunctionSpec> assertionFunctionsMap;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setClosurePass(true);
    compiler.init(Collections.<SourceFile>emptyList(), Collections.<SourceFile>emptyList(), options);
    registry = compiler.getTypeRegistry();
    assertionFunctionsMap = Maps.newHashMap();
  }

  private TypeInference createTypeInference(String js, boolean inFunction) {
    Node root = compiler.parseTestCode(js);
    assertEquals("Parsing should produce no errors for: " + js, 0, compiler.getErrorCount());

    GoogleCodingConvention convention = new GoogleCodingConvention();
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler, convention);
    Scope topScope = scopeCreator.createScope(root, null);

    SemanticReverseAbstractInterpreter rai = new SemanticReverseAbstractInterpreter(
        convention, registry);

    Scope targetScope = topScope;
    Node cfgRoot = root;

    if (inFunction) {
      Node fnNode = findFunction(root);
      if (fnNode != null) {
        targetScope = scopeCreator.createScope(fnNode, topScope);
        cfgRoot = fnNode.getLastChild();
      }
    }

    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, cfgRoot);
    ControlFlowGraph<Node> cfg = cfa.getCfg();

    return new TypeInference(compiler, cfg, rai, targetScope, assertionFunctionsMap);
  }

  private void analyze(String js) {
    TypeInference inference = createTypeInference(js, false);
    inference.analyze();
  }

  private void analyzeFunction(String js) {
    TypeInference inference = createTypeInference(js, true);
    inference.analyze();
  }

  private Node findFunction(Node root) {
    if (root.isFunction()) {
      return root;
    }
    for (Node child = root.getFirstChild(); child != null; child = child.getNext()) {
      Node found = findFunction(child);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  @Test
  public void testGetBooleanOutcomes_allCombinations() {
    assertEquals(
        BooleanLiteralSet.BOTH,
        TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, true));
    assertEquals(
        BooleanLiteralSet.FALSE,
        TypeInference.getBooleanOutcomes(BooleanLiteralSet.FALSE, BooleanLiteralSet.FALSE, true));
    assertEquals(
        BooleanLiteralSet.TRUE,
        TypeInference.getBooleanOutcomes(BooleanLiteralSet.TRUE, BooleanLiteralSet.TRUE, false));
    assertEquals(
        BooleanLiteralSet.EMPTY,
        TypeInference.getBooleanOutcomes(BooleanLiteralSet.EMPTY, BooleanLiteralSet.EMPTY, true));
    assertEquals(
        BooleanLiteralSet.TRUE,
        TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH, BooleanLiteralSet.TRUE, true));
  }

  @Test
  public void testLatticeInitialization() {
    TypeInference inference = createTypeInference("var x = 1;", false);
    assertNotNull(inference.createEntryLattice());
    assertNotNull(inference.createInitialEstimateLattice());
    assertNotNull(inference.flowThrough(new Node(0), inference.createInitialEstimateLattice()));
  }

  @Test
  public void testVariableDeclarationAndAssignments() {
    analyze("var a = 1; var b = 'hello'; var c = true; var d = null; var e = undefined;");
    analyze("var x; x = 10; x = 'str';");
    analyze("var obj = {}; obj.foo = 1; obj.bar = 'test';");
  }

  @Test
  public void testArithmeticAndBitwiseOperators() {
    analyze("var a = 1 + 2; var b = 'a' + 'b'; var c = 'a' + 1; var d = 1 + 'b';");
    analyze("var e = 10 - 5; var f = 10 * 5; var g = 10 / 5; var h = 10 % 3;");
    analyze("var i = +1; var j = -1; var k = ~1;");
    analyze("var l = 1 << 2; var m = 4 >> 1; var n = 4 >>> 1;");
    analyze("var o = 1 & 2; var p = 1 | 2; var q = 1 ^ 2;");
    analyze("var x = 1; x += 2; x -= 1; x *= 3; x /= 2; x %= 2; x <<= 1; x >>= 1; x >>>= 1; x &= 1; x |= 1; x ^= 1;");
    analyze("var y = 1; y++; y--; ++y; --y;");
  }

  @Test
  public void testComparisonAndLogicalOperators() {
    analyze("var a = 1 < 2; var b = 1 <= 2; var c = 1 > 2; var d = 1 >= 2;");
    analyze("var e = 1 == 2; var f = 1 != 2; var g = 1 === 2; var h = 1 !== 2;");
    analyze("var i = !true; var j = typeof 'str'; var k = 'prop' in {}; var l = ({}) instanceof Object;");
    analyze("var obj = {a: 1}; delete obj.a;");
  }

  @Test
  public void testShortCircuitLogicalExpressions() {
    analyze("var a = true && false; var b = false || true;");
    analyze("var c = (1 && 'str') || false;");
    analyze("var d = (null || undefined) && 42;");
    analyze("if (true && 1) { var x = 1; }");
    analyze("if (false || 0) { var y = 2; }");
  }

  @Test
  public void testHookTernaryOperator() {
    analyze("var a = true ? 1 : 2;");
    analyze("var b = false ? 'hello' : 42;");
    analyze("var c = (1 > 0) ? {a: 1} : {a: 'str'};");
  }

  @Test
  public void testArraysAndObjectLiterals() {
    analyze("var arr = [1, 2, 3]; var x = arr[0];");
    analyze("var obj = { a: 1, 'b': 'two', get c() { return 3; } };");
    analyze("var val = obj['a'];");
  }

  @Test
  public void testControlFlowStatements() {
    analyze("if (1 > 0) { var x = 1; } else { var x = 2; }");
    analyze("while (false) { var y = 1; }");
    analyze("do { var z = 1; } while (false);");
    analyze("for (var i = 0; i < 10; i++) { var w = i; }");
    analyze("var o = {a: 1, b: 2}; for (var k in o) { var key = k; }");
  }

  @Test
  public void testSwitchStatement() {
    analyze("var x = 1; switch (x) { case 1: var a = 10; break; case 2: var b = 20; break; default: var c = 30; }");
  }

  @Test
  public void testTryCatchThrow() {
    analyze("try { throw new Error('err'); } catch (e) { var err = e; }");
    analyze("/** @param {string} msg */ function f(msg) { try {} catch (/** @type {Error} */ e) { var x = e; } }");
  }

  @Test
  public void testCommaAndParamList() {
    analyze("var x = (1, 2, 3);");
  }

  @Test
  public void testFunctionsAndReturn() {
    analyzeFunction("function foo(a, b) { return a + b; }");
    analyzeFunction("/** @return {number} */ function bar() { return 42; }");
    analyzeFunction("function baz() { return { x: 1 }; }");
    analyzeFunction("/** @constructor */ function C() { this.x = 10; }");
  }

  @Test
  public void testFunctionCallsAndNew() {
    analyze("function f(x) { return x; } var res = f(10);");
    analyze("/** @constructor */ function Person(name) { this.name = name; } var p = new Person('Alice');");
    analyze("var f = function() {}; var bound = f.bind(null, 1, 2);");
  }

  @Test
  public void testTemplatedFunctionsAndGenerics() {
    analyze(
        "/** @template T\n" +
        " *  @param {T} a\n" +
        " *  @return {T}\n" +
        " */\n" +
        "function id(a) { return a; }\n" +
        "var num = id(42);\n" +
        "var str = id('hello');");

    analyze(
        "/** @template T\n" +
        " *  @param {Array.<T>} arr\n" +
        " *  @return {T}\n" +
        " */\n" +
        "function first(arr) { return arr[0]; }\n" +
        "var item = first([1, 2, 3]);");

    analyze(
        "/** @template T\n" +
        " *  @param {{foo: T}} obj\n" +
        " *  @return {T}\n" +
        " */\n" +
        "function getFoo(obj) { return obj.foo; }\n" +
        "var fooVal = getFoo({foo: 'bar'});");

    analyze(
        "/** @template T\n" +
        " *  @param {function(): T} fn\n" +
        " *  @return {T}\n" +
        " */\n" +
        "function callFn(fn) { return fn(); }\n" +
        "var res = callFn(function() { return 123; });");
  }

  @Test
  public void testAssertionFunctions() {
    assertionFunctionsMap.put("goog.asserts.assert",
        new AssertionFunctionSpec("goog.asserts.assert"));
    assertionFunctionsMap.put("goog.asserts.assertNumber",
        new AssertionFunctionSpec("goog.asserts.assertNumber", JSTypeNative.NUMBER_TYPE));
    assertionFunctionsMap.put("goog.asserts.assertString",
        new AssertionFunctionSpec("goog.asserts.assertString", JSTypeNative.STRING_TYPE));

    analyze(
        "var goog = { asserts: { assert: function(x){}, assertNumber: function(x){}, assertString: function(x){} } };\n" +
        "var x = null;\n" +
        "goog.asserts.assert(x);\n" +
        "var y = 'test';\n" +
        "goog.asserts.assertString(y);\n" +
        "var z = 123;\n" +
        "goog.asserts.assertNumber(z);");
  }

  @Test
  public void testTypeCasts() {
    analyze("var x = /** @type {number} */ (1 + 1);");
    analyze("var y = /** @type {string} */ ('hello');");
  }

  @Test
  public void testQualifiedNamesAndPropertyNarrowing() {
    analyze("var goog = {}; goog.math = {}; goog.math.PI = 3.14;");
    analyze("var a = { b: { c: 1 } }; var val = a.b.c;");
  }

  @Test
  public void testStructAndPrototypePropertyDefinitions() {
    analyze(
        "/** @constructor @struct */ function Foo() { this.bar = 1; }\n" +
        "Foo.prototype.baz = 2;\n" +
        "var f = new Foo();");
  }

  @Test
  public void testIIFEInference() {
    analyze("(function(a, b) { var sum = a + b; })(10, 20);");
  }

  @Test
  public void testBranchFlowConditionals() {
    analyze("var x = 1; if (x) { x = 2; } else { x = 3; }");
    analyze("var y = null; if (y !== null) { var z = y; }");
    analyze("var a = 1; var b = 2; if (a && b) { var c = a + b; }");
    analyze("var a = null; var b = 'str'; if (a || b) { var c = a; }");
  }
}
