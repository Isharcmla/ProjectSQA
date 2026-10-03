package com.google.javascript.jscomp;

import com.google.common.collect.Maps;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class TypeInferenceTest {

  private Compiler compiler;
  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
  }

  private TypeInference createTypeInference(String js, Scope scope, ControlFlowGraph<Node> cfg) {
    ReverseAbstractInterpreter rai = new SemanticReverseAbstractInterpreter(
        compiler.getCodingConvention(), registry);
    Map<String, CodingConvention.AssertionFunctionSpec> assertionMap = Maps.newHashMap();
    for (CodingConvention.AssertionFunctionSpec spec : compiler.getCodingConvention().getAssertionFunctions()) {
      assertionMap.put(spec.getFunctionName(), spec);
    }
    return new TypeInference(compiler, cfg, rai, scope, assertionMap);
  }

  private TypeInference analyze(String js) {
    Node root = compiler.parseTestCode(js);
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Scope topScope = scopeCreator.createScope(root, null);
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, false);
    cfa.process(null, root);
    ControlFlowGraph<Node> cfg = cfa.getCfg();

    TypeInference ti = createTypeInference(js, topScope, cfg);
    ti.analyze();
    return ti;
  }

  @Test
  public void testGetBooleanOutcomes_allCombinations() {
    BooleanLiteralSet resultTrue = TypeInference.getBooleanOutcomes(
        BooleanLiteralSet.TRUE, BooleanLiteralSet.FALSE, true);
    Assert.assertEquals(BooleanLiteralSet.BOTH, resultTrue);

    BooleanLiteralSet resultFalse = TypeInference.getBooleanOutcomes(
        BooleanLiteralSet.TRUE, BooleanLiteralSet.FALSE, false);
    Assert.assertEquals(BooleanLiteralSet.FALSE, resultFalse);

    BooleanLiteralSet emptyWithBoth = TypeInference.getBooleanOutcomes(
        BooleanLiteralSet.EMPTY, BooleanLiteralSet.BOTH, true);
    Assert.assertEquals(BooleanLiteralSet.BOTH, emptyWithBoth);
  }

  @Test
  public void testInitialEstimateAndEntryLattice() {
    String js = "var x = 1;";
    Node root = compiler.parseTestCode(js);
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Scope topScope = scopeCreator.createScope(root, null);
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, false);
    cfa.process(null, root);
    ControlFlowGraph<Node> cfg = cfa.getCfg();

    TypeInference ti = createTypeInference(js, topScope, cfg);
    FlowScope initialEstimate = ti.createInitialEstimateLattice();
    Assert.assertNotNull(initialEstimate);

    FlowScope entryLattice = ti.createEntryLattice();
    Assert.assertNotNull(entryLattice);

    FlowScope flowThroughBottom = ti.flowThrough(root, initialEstimate);
    Assert.assertSame(initialEstimate, flowThroughBottom);
  }

  @Test
  public void testArithmeticAndBitwiseOperations() {
    String js = ""
        + "var a = +1; var b = -a; var c = ~a;"
        + "var d = a + b; var e = 'x' + 'y'; var f = 'x' + 1; var g = 1 + 'y';"
        + "var h = a << 1; var i = a >> 1; var j = a >>> 1;"
        + "var k = a / 2; var l = a % 2; var m = a * 2; var n = a - 1;"
        + "var o = a & 1; var p = a ^ 1; var q = a | 1;"
        + "var r = a++; var s = a--; var t = ++a; var u = --a;"
        + "a += 1; a -= 1; a *= 2; a /= 2; a %= 2; a &= 1; a ^= 1; a |= 1; a <<= 1; a >>= 1; a >>>= 1;";
    TypeInference ti = analyze(js);
    Assert.assertNotNull(ti);
  }

  @Test
  public void testRelationalAndLogicalOperators() {
    String js = ""
        + "var b1 = (1 < 2); var b2 = (1 <= 2); var b3 = (1 > 2); var b4 = (1 >= 2);"
        + "var b5 = (1 == 2); var b6 = (1 != 2); var b7 = (1 === 2); var b8 = (1 !== 2);"
        + "var b9 = !b1; var b10 = typeof b1; var b11 = delete b1;"
        + "var b12 = 'prop' in {}; var b13 = [] instanceof Array;"
        + "var l1 = true && false; var l2 = false || true; var l3 = (1 > 2) ? 'yes' : 'no';";
    TypeInference ti = analyze(js);
    Assert.assertNotNull(ti);
  }

  @Test
  public void testArrayAndObjectLiterals() {
    String js = ""
        + "var arr = [1, 2, 'three'];"
        + "var obj = { x: 1, y: 'str', 'z': true };"
        + "var prop = obj.x; var elem = obj['y'];";
    TypeInference ti = analyze(js);
    Assert.assertNotNull(ti);
  }

  @Test
  public void testFunctionsCallsReturnsAndIIFE() {
    String js = ""
        + "function add(a, b) { return a + b; }"
        + "var sum = add(1, 2);"
        + "(function(x) { return x * 2; })(5);"
        + "function outer() { var local = 10; return (1, local); }";
    TypeInference ti = analyze(js);
    Assert.assertNotNull(ti);
  }

  @Test
  public void testFunctionBindInference() {
    String js = ""
        + "function target(a, b) { return a + b; }"
        + "var bound = target.bind(null, 1);";
    TypeInference ti = analyze(js);
    Assert.assertNotNull(ti);
  }

  @Test
  public void testTryCatchThrowAndSwitchCase() {
    String js = ""
        + "try {"
        + "  throw new Error('fail');"
        + "} catch (e) {"
        + "  var caught = e;"
        + "}"
        + "var val = 2;"
        + "switch (val) {"
        + "  case 1:"
        + "    val = 10;"
        + "    break;"
        + "  case 2:"
        + "    val = 20;"
        + "    break;"
        + "  default:"
        + "    val = 0;"
        + "}";
    TypeInference ti = analyze(js);
    Assert.assertNotNull(ti);
  }

  @Test
  public void testForInLoop() {
    String js = ""
        + "var obj = { a: 1, b: 2 };"
        + "for (var key in obj) {"
        + "  var k = key;"
        + "}";
    TypeInference ti = analyze(js);
    Assert.assertNotNull(ti);
  }

  @Test
  public void testConstructorsAndNew() {
    String js = ""
        + "/** @constructor */ function Person(name) { this.name = name; }"
        + "var p = new Person('Alice');";
    TypeInference ti = analyze(js);
    Assert.assertNotNull(ti);
  }

  @Test
  public void testTypeCast() {
    String js = ""
        + "var val = /** @type {number} */ (1 + 2);";
    TypeInference ti = analyze(js);
    Assert.assertNotNull(ti);
  }

  @Test
  public void testBranchedFlowThrough_ifBranching() {
    String js = ""
        + "var x = 1;"
        + "if (x > 0) {"
        + "  x = 2;"
        + "} else {"
        + "  x = 3;"
        + "}";
    Node root = compiler.parseTestCode(js);
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Scope topScope = scopeCreator.createScope(root, null);
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, false);
    cfa.process(null, root);
    ControlFlowGraph<Node> cfg = cfa.getCfg();

    TypeInference ti = createTypeInference(js, topScope, cfg);
    FlowScope entry = ti.createEntryLattice();

    Node ifNode = null;
    for (Node child : root.children()) {
      if (child.isIf()) {
        ifNode = child;
        break;
      }
    }

    if (ifNode != null) {
      List<FlowScope> branched = ti.branchedFlowThrough(ifNode, entry);
      Assert.assertNotNull(branched);
      Assert.assertFalse(branched.isEmpty());
    }
  }

  @Test
  public void testShortCircuitLogicBranches() {
    String js = ""
        + "var a = 1;"
        + "var b = 2;"
        + "if (a > 0 && b > 0) { a = 10; }"
        + "if (a < 0 || b < 0) { b = 20; }";
    TypeInference ti = analyze(js);
    Assert.assertNotNull(ti);
  }

  @Test
  public void testAssertionTightening() {
    String js = ""
        + "function assert(condition) {}"
        + "var x = null;"
        + "assert(x != null);"
        + "var y = x;";
    TypeInference ti = analyze(js);
    Assert.assertNotNull(ti);
  }

  @Test
  public void testObjectLiteralWithLends() {
    String js = ""
        + "var ns = {};"
        + "/** @lends {ns} */ var obj = { foo: function() {} };";
    TypeInference ti = analyze(js);
    Assert.assertNotNull(ti);
  }

  @Test
  public void testTemplatizedArrayAndFunction() {
    String js = ""
        + "/** @type {Array.<string>} */ var list = ['a', 'b'];"
        + "var first = list[0];";
    TypeInference ti = analyze(js);
    Assert.assertNotNull(ti);
  }

  @Test
  public void testEmptyAndNullEdgeCases() {
    String js = ";";
    TypeInference ti = analyze(js);
    Assert.assertNotNull(ti);
  }
}
