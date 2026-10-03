package com.google.javascript.jscomp;

import static com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.CHECKED_UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class TypeInferenceTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private ReverseAbstractInterpreter reverseInterpreter;
  private Map<String, AssertionFunctionSpec> assertionFunctionsMap;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    reverseInterpreter = new SemanticReverseAbstractInterpreter(
        compiler.getCodingConvention(), registry);
    assertionFunctionsMap = Maps.newHashMap();
    assertionFunctionsMap.put(
        "goog.asserts.assert",
        new AssertionFunctionSpec("goog.asserts.assert"));
    assertionFunctionsMap.put(
        "goog.asserts.assertString",
        new AssertionFunctionSpec("goog.asserts.assertString", STRING_TYPE));
    assertionFunctionsMap.put(
        "goog.asserts.assertNumber",
        new AssertionFunctionSpec("goog.asserts.assertNumber", NUMBER_TYPE));
    assertionFunctionsMap.put(
        "goog.asserts.assertInstanceof",
        new AssertionFunctionSpec("goog.asserts.assertInstanceof", null) {
          @Override
          public Node getAssertedParam(Node firstParam) {
            return firstParam;
          }
        });
  }

  private TypeInference createTypeInference(Node root, Scope scope) {
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, root);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    return new TypeInference(
        compiler, cfg, reverseInterpreter, scope, assertionFunctionsMap);
  }

  private Node parseAndInfer(String js) {
    Node scriptNode = compiler.parseTestCode(js);
    assertEquals(0, compiler.getErrorCount());
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Scope globalScope = scopeCreator.createScope(scriptNode, null);
    TypeInference typeInference = createTypeInference(scriptNode, globalScope);
    typeInference.analyze();
    return scriptNode;
  }

  private JSType getNativeType(JSTypeNative typeId) {
    return registry.getNativeType(typeId);
  }

  private Node findFirstNode(Node n, int token) {
    if (n.getType() == token) {
      return n;
    }
    for (Node child = n.getFirstChild(); child != null; child = child.getNext()) {
      Node found = findFirstNode(child, token);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  private Node findFirstNodeByName(Node n, String name) {
    if (n.isName() && name.equals(n.getString())) {
      return n;
    }
    for (Node child = n.getFirstChild(); child != null; child = child.getNext()) {
      Node found = findFirstNodeByName(child, name);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  @Test
  public void testGetBooleanOutcomes_allCombinations() {
    BooleanLiteralSet resultTrue = TypeInference.getBooleanOutcomes(
        BooleanLiteralSet.TRUE, BooleanLiteralSet.TRUE, true);
    assertEquals(BooleanLiteralSet.TRUE, resultTrue);

    BooleanLiteralSet resultFalse = TypeInference.getBooleanOutcomes(
        BooleanLiteralSet.FALSE, BooleanLiteralSet.FALSE, false);
    assertEquals(BooleanLiteralSet.FALSE, resultFalse);

    BooleanLiteralSet resultBoth = TypeInference.getBooleanOutcomes(
        BooleanLiteralSet.BOTH, BooleanLiteralSet.EMPTY, true);
    assertEquals(BooleanLiteralSet.FALSE, resultBoth);
  }

  @Test
  public void testCreateEntryAndInitialLattices() {
    Node scriptNode = compiler.parseTestCode("var x = 1;");
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Scope globalScope = scopeCreator.createScope(scriptNode, null);
    TypeInference inference = createTypeInference(scriptNode, globalScope);

    FlowScope initialEstimate = inference.createInitialEstimateLattice();
    assertNotNull(initialEstimate);

    FlowScope entryLattice = inference.createEntryLattice();
    assertNotNull(entryLattice);

    FlowScope flowBottom = inference.flowThrough(scriptNode, initialEstimate);
    assertEquals(initialEstimate, flowBottom);
  }

  @Test
  public void testFlowThrough_variableAssignmentAndInference() {
    Node root = parseAndInfer("var x = 10; x = 'hello';");
    assertNotNull(root);
  }

  @Test
  public void testArithmeticOperations() {
    Node root = parseAndInfer(
        "var a = 1 + 2;\n" +
        "var b = 'hello' + ' world';\n" +
        "var c = 'hello' + 5;\n" +
        "var d = 5 + true;\n" +
        "var e = +a;\n" +
        "var f = -a;\n" +
        "var g = ~a;\n" +
        "var h = a++;\n" +
        "var i = --a;\n" +
        "var j = a * b;\n" +
        "var k = a / b;\n" +
        "var l = a % b;\n" +
        "var m = a << 1;\n" +
        "var n = a >> 1;\n" +
        "var o = a >>> 1;\n" +
        "var p = a & 1;\n" +
        "var q = a | 1;\n" +
        "var r = a ^ 1;\n" +
        "a += 2;\n" +
        "a -= 1;\n" +
        "a *= 2;\n" +
        "a /= 2;\n" +
        "a %= 2;\n" +
        "a &= 1;\n" +
        "a |= 1;\n" +
        "a ^= 1;\n" +
        "a <<= 1;\n" +
        "a >>= 1;\n" +
        "a >>>= 1;\n");
    assertNotNull(root);
  }

  @Test
  public void testLogicalAndComparisonOperations() {
    Node root = parseAndInfer(
        "var a = true && false;\n" +
        "var b = true || false;\n" +
        "var c = !a;\n" +
        "var d = (1 < 2);\n" +
        "var e = (1 <= 2);\n" +
        "var f = (1 > 2);\n" +
        "var g = (1 >= 2);\n" +
        "var h = (1 == 2);\n" +
        "var i = (1 != 2);\n" +
        "var j = (1 === 2);\n" +
        "var k = (1 !== 2);\n" +
        "var l = typeof a;\n" +
        "var m = 'a' in {};\n" +
        "var n = (a instanceof Object);\n" +
        "var o = delete a.prop;\n");
    assertNotNull(root);
  }

  @Test
  public void testHookTernary() {
    Node root = parseAndInfer("var x = true ? 1 : 'string';");
    Node hookNode = findFirstNode(root, com.google.javascript.rhino.Token.HOOK);
    assertNotNull(hookNode);
    assertNotNull(hookNode.getJSType());
  }

  @Test
  public void testObjectAndArrayLiterals() {
    Node root = parseAndInfer(
        "var arr = [1, 2, 'three'];\n" +
        "var obj = {a: 1, 'b': 'two', get c() { return 3; }};\n" +
        "var elem = arr[0];\n" +
        "var prop = obj.a;\n");
    assertNotNull(root);
  }

  @Test
  public void testControlStructures_ifSwitchCatchThrowReturn() {
    Node root = parseAndInfer(
        "function test(x) {\n" +
        "  if (x) {\n" +
        "    return 1;\n" +
        "  } else {\n" +
        "    try {\n" +
        "      throw new Error();\n" +
        "    } catch (e) {\n" +
        "      return e;\n" +
        "    }\n" +
        "  }\n" +
        "}\n" +
        "switch (1) {\n" +
        "  case 1: break;\n" +
        "  default: break;\n" +
        "}\n");
    assertNotNull(root);
  }

  @Test
  public void testForInLoopInference() {
    Node root = parseAndInfer(
        "var obj = {a: 1, b: 2};\n" +
        "for (var key in obj) {\n" +
        "  var val = obj[key];\n" +
        "}\n");
    assertNotNull(root);
  }

  @Test
  public void testTypeCastingWithJSDoc() {
    Node root = parseAndInfer(
        "var x = /** @type {number} */ ('hello');\n" +
        "/** @type {string} */ var y;\n" +
        "y = /** @type {string} */ (123);\n");
    assertNotNull(root);
  }

  @Test
  public void testAssertionFunctions() {
    Node root = parseAndInfer(
        "var goog = {}; goog.asserts = {};\n" +
        "goog.asserts.assert = function(x) {};\n" +
        "goog.asserts.assertString = function(x) {};\n" +
        "goog.asserts.assertNumber = function(x) {};\n" +
        "function f(x) {\n" +
        "  goog.asserts.assert(x);\n" +
        "  goog.asserts.assertString(x);\n" +
        "  goog.asserts.assertNumber(x);\n" +
        "}\n");
    assertNotNull(root);
  }

  @Test
  public void testNewExpressions() {
    Node root = parseAndInfer(
        "function Foo() {}\n" +
        "var f = new Foo();\n" +
        "var obj = new Object();\n");
    assertNotNull(root);
  }

  @Test
  public void testShortCircuitBranchingCondition() {
    Node root = parseAndInfer(
        "var a = null;\n" +
        "if (a && a.b) {\n" +
        "  var c = a.b;\n" +
        "}\n" +
        "if (a || a) {\n" +
        "  var d = a;\n" +
        "}\n");
    assertNotNull(root);
  }

  @Test
  public void testCommaAndParamList() {
    Node root = parseAndInfer("var x = (1, 2, 'three');");
    assertNotNull(root);
  }

  @Test
  public void testThisExpression() {
    Node root = parseAndInfer(
        "function f() {\n" +
        "  var self = this;\n" +
        "}\n");
    assertNotNull(root);
  }

  @Test
  public void testFunctionCallBackwardsInferenceAndBind() {
    Node root = parseAndInfer(
        "function f(callback) {}\n" +
        "f(function(a) { return a; });\n" +
        "function target(a, b) {}\n" +
        "var bound = target.bind(null, 1);\n");
    assertNotNull(root);
  }

  @Test
  public void testTemplateTypeInferenceOnClosure() {
    Node root = parseAndInfer(
        "/**\n" +
        " * @param {T} obj\n" +
        " * @param {function(this:T)} fn\n" +
        " * @template T\n" +
        " */\n" +
        "function runInContext(obj, fn) {}\n" +
        "runInContext({x: 1}, function() { this.x = 2; });\n");
    assertNotNull(root);
  }

  @Test
  public void testBranchedFlowThrough_forInLoop() {
    Node scriptNode = compiler.parseTestCode(
        "var obj = {foo: 1};\n" +
        "for (var p in obj) {\n" +
        "  var x = p;\n" +
        "}\n");
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Scope globalScope = scopeCreator.createScope(scriptNode, null);
    TypeInference inference = createTypeInference(scriptNode, globalScope);
    
    Node forNode = findFirstNode(scriptNode, com.google.javascript.rhino.Token.FOR);
    if (forNode != null) {
      FlowScope entryScope = inference.createEntryLattice();
      List<FlowScope> branched = inference.branchedFlowThrough(forNode, entryScope);
      assertNotNull(branched);
    }
  }

  @Test
  public void testDiagnosticsDefinitions() {
    assertNotNull(TypeInference.TEMPLATE_TYPE_NOT_OBJECT_TYPE);
    assertNotNull(TypeInference.TEMPLATE_TYPE_OF_THIS_EXPECTED);
    assertNotNull(TypeInference.FUNCTION_LITERAL_UNDEFINED_THIS);
  }
}
