package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TypeCheckTest {

  private Compiler compiler;
  private CompilerOptions options;
  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
  }

  private Node parseCode(String externs, String js) {
    Node externsNode = compiler.parseTestCode(externs);
    Node jsNode = compiler.parseTestCode(js);
    Node root = IR.block();
    root.addChildToBack(externsNode);
    root.addChildToBack(jsNode);
    return root;
  }

  private TypeCheck createTypeChecker() {
    return new TypeCheck(compiler, compiler.getReverseAbstractInterpreter(), registry);
  }

  @Test
  public void testConstructors() {
    TypeCheck tc1 = new TypeCheck(
        compiler, compiler.getReverseAbstractInterpreter(), registry);
    Assert.assertNotNull(tc1);
    Assert.assertEquals(0.0, tc1.getTypedPercent(), 0.001);

    TypeCheck tc2 = new TypeCheck(
        compiler, compiler.getReverseAbstractInterpreter(), registry, CheckLevel.ERROR);
    Assert.assertNotNull(tc2);

    TypeCheck tc3 = new TypeCheck(
        compiler, compiler.getReverseAbstractInterpreter(), registry, null, null, CheckLevel.OFF);
    Assert.assertNotNull(tc3);
  }

  @Test
  public void testReportMissingProperties() {
    TypeCheck tc = createTypeChecker();
    TypeCheck returned = tc.reportMissingProperties(false);
    Assert.assertSame(tc, returned);
    returned = tc.reportMissingProperties(true);
    Assert.assertSame(tc, returned);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullScopeCreator_throwsException() {
    TypeCheck tc = createTypeChecker();
    Node jsRoot = IR.script();
    Node parent = IR.block(jsRoot);
    tc.process(null, jsRoot);
  }

  @Test(expected = NullPointerException.class)
  public void testCheck_nullNode_throwsException() {
    TypeCheck tc = createTypeChecker();
    tc.check(null, false);
  }

  @Test
  public void testProcessForTesting_basicTypesAndPercentages() {
    Node root = parseCode("", "var x = 1; var y = 'hello'; var z = true;");
    Node externs = root.getFirstChild();
    Node js = root.getLastChild();

    TypeCheck tc = createTypeChecker();
    Scope scope = tc.processForTesting(externs, js);

    Assert.assertNotNull(scope);
    Assert.assertTrue(tc.getTypedPercent() > 0.0);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testProcessForTesting_typeMismatch_warningGenerated() {
    Node root = parseCode("", "/** @type {number} */ var x = 'string';");
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testProcessForTesting_functionCallsAndReturns() {
    String js = ""
        + "/**\n"
        + " * @param {number} a\n"
        + " * @param {string} b\n"
        + " * @return {number}\n"
        + " */\n"
        + "function foo(a, b) {\n"
        + "  return a;\n"
        + "}\n"
        + "foo(1, 'str');\n";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcessForTesting_wrongArgumentCount() {
    String js = ""
        + "/**\n"
        + " * @param {number} a\n"
        + " * @param {number} b\n"
        + " */\n"
        + "function add(a, b) {}\n"
        + "add(1);\n"
        + "add(1, 2, 3);\n";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(compiler.getWarningCount() >= 2);
  }

  @Test
  public void testProcessForTesting_notCallable() {
    String js = "var x = 42; x();";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testProcessForTesting_newNonConstructor() {
    String js = "var x = 42; new x();";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testProcessForTesting_constructorCalledWithoutNew() {
    String js = ""
        + "/** @constructor */\n"
        + "function Bar() {}\n"
        + "Bar();\n";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testProcessForTesting_binaryAndUnaryOperators() {
    String js = ""
        + "var a = 1 + 2;\n"
        + "var b = 3 - 1;\n"
        + "var c = 4 * 2;\n"
        + "var d = 4 / 2;\n"
        + "var e = 5 % 2;\n"
        + "var f = 1 << 2;\n"
        + "var g = 4 >> 1;\n"
        + "var h = 4 >>> 1;\n"
        + "var i = 1 & 2;\n"
        + "var j = 1 | 2;\n"
        + "var k = 1 ^ 2;\n"
        + "var l = ~1;\n"
        + "var m = !true;\n"
        + "var n = void 0;\n"
        + "var o = typeof a;\n"
        + "var p = +a;\n"
        + "var q = -a;\n"
        + "var r = a++;\n"
        + "var s = --a;\n";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcessForTesting_badBitwiseOperator() {
    String js = "var x = ~'hello';";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testProcessForTesting_comparisons() {
    String js = ""
        + "var a = (1 < 2);\n"
        + "var b = (1 <= 2);\n"
        + "var c = (2 > 1);\n"
        + "var d = (2 >= 1);\n"
        + "var e = ('a' < 'b');\n"
        + "var f = (1 == 1);\n"
        + "var g = (1 != 2);\n"
        + "var h = (1 === 1);\n"
        + "var i = (1 !== 2);\n"
        + "var j = (typeof 1 === 'number');\n"
        + "var k = (typeof 1 === 'invalid_typeof_string');\n";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testProcessForTesting_inAndInstanceof() {
    String js = ""
        + "/** @constructor */\n"
        + "function MyClass() {}\n"
        + "var obj = new MyClass();\n"
        + "var isIn = 'prop' in obj;\n"
        + "var isInst = obj instanceof MyClass;\n";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testProcessForTesting_objectLiteralsAndKeyValidation() {
    String js = ""
        + "var obj = { a: 1, b: 'str', c: true, [1]: 'numKey' };\n"
        + "var arr = [1, 2, 3];\n"
        + "var reg = /abc/;\n"
        + "var elem = arr[0];\n"
        + "delete obj.a;\n";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcessForTesting_structAndDictChecks() {
    String js = ""
        + "/** @struct\n * @constructor */\n"
        + "function StructClass() {}\n"
        + "var s = new StructClass();\n"
        + "var badKey = { 'quotedKey': 1 };\n"
        + "var testIn = 'prop' in s;\n";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testProcessForTesting_interfaces() {
    String js = ""
        + "/** @interface */\n"
        + "function MyInterface() {}\n"
        + "MyInterface.prototype.doSomething = function() {};\n"
        + "/** @constructor\n * @implements {MyInterface} */\n"
        + "function MyImpl() {}\n"
        + "MyImpl.prototype.doSomething = function() { return 1; };\n";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcessForTesting_interfaceMethodNotEmpty() {
    String js = ""
        + "/** @interface */\n"
        + "function BadInterface() {}\n"
        + "BadInterface.prototype.badMethod = function() { return 123; };\n";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testProcessForTesting_noTypeCheckAnnotation() {
    String js = ""
        + "/** @noTypeCheck */\n"
        + "function ignoredErrors() {\n"
        + "  var x = 1;\n"
        + "  x = 'str';\n"
        + "  x.nonExistentMethod();\n"
        + "}\n";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcessForTesting_controlFlowNodes() {
    String js = ""
        + "var x = 1;\n"
        + "if (x > 0) { x = 2; } else { x = 3; }\n"
        + "while (x < 10) { x++; }\n"
        + "do { x++; } while (x < 15);\n"
        + "for (var i = 0; i < 5; i++) { break; }\n"
        + "for (var k in { a: 1 }) { continue; }\n"
        + "switch (x) {\n"
        + "  case 1: x = 2; break;\n"
        + "  default: x = 0;\n"
        + "}\n"
        + "try { throw new Error('err'); } catch (e) {} finally {}\n";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisitName_variousParents() {
    TypeCheck tc = createTypeChecker();
    Node nameNode = IR.name("foo");
    Node varNode = IR.var(nameNode);
    Node paramListNode = IR.paramList(nameNode);
    Node fnNode = IR.function(nameNode, IR.paramList(), IR.block());
    Node catchNode = IR.catchNode(nameNode, IR.block());

    NodeTraversal t = new NodeTraversal(compiler, tc);

    Assert.assertFalse(tc.visitName(t, nameNode, varNode));
    Assert.assertFalse(tc.visitName(t, nameNode, paramListNode));
    Assert.assertFalse(tc.visitName(t, nameNode, fnNode));
    Assert.assertFalse(tc.visitName(t, nameNode, catchNode));

    Node exprNode = IR.exprResult(nameNode);
    nameNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Assert.assertTrue(tc.visitName(t, nameNode, exprNode));
  }

  @Test
  public void testShouldTraverse_functionMasksVariable() {
    String js = "var myVar = 10; function myVar() {}";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testVisit_unexpectedToken() {
    TypeCheck tc = createTypeChecker();
    Node unexpectedNode = new Node(Token.LABEL);
    Node parent = IR.block(unexpectedNode);
    NodeTraversal t = new NodeTraversal(compiler, tc);

    tc.visit(t, unexpectedNode, parent);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_withExternsAndJs() {
    String externs = "/** @type {number} */ var extVar;";
    String js = "var local = extVar;";
    Node root = parseCode(externs, js);

    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testCastNodeProcessing() {
    String js = "var a = /** @type {number} */ ('42');";
    Node root = parseCode("", js);
    TypeCheck tc = createTypeChecker();
    tc.processForTesting(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCheckMethodDirectly() {
    Node script = IR.script(IR.var(IR.name("a"), IR.number(1)));
    TypeCheck tc = createTypeChecker();

    MemoizedScopeCreator scopeCreator = new MemoizedScopeCreator(new TypedScopeCreator(compiler));
    Scope topScope = scopeCreator.createScope(script, null);
    TypeCheck customTc = new TypeCheck(
        compiler, compiler.getReverseAbstractInterpreter(), registry, topScope, scopeCreator, CheckLevel.WARNING);

    customTc.check(script, false);
    Assert.assertEquals(0, compiler.getErrorCount());

    customTc.check(script, true);
    Assert.assertEquals(0, compiler.getErrorCount());
  }
}
