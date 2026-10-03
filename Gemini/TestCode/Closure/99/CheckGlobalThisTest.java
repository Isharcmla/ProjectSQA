package com.google.javascript.jscomp;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckGlobalThisTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private void test(String js, DiagnosticType expectedWarning) {
    Node root = compiler.parseTestCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    CheckGlobalThis callback = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal.traverse(compiler, root, callback);

    if (expectedWarning != null) {
      Assert.assertEquals(1, compiler.getWarningCount());
      Assert.assertEquals(expectedWarning, compiler.getWarnings()[0].getType());
    } else {
      Assert.assertEquals(0, compiler.getWarningCount());
    }
  }

  private void testSame(String js) {
    test(js, null);
  }

  private void testWarning(String js) {
    test(js, CheckGlobalThis.GLOBAL_THIS);
  }

  @Test
  public void testGlobalThisReported_inGlobalPropertyAssignment() {
    testWarning("this.foo = 1;");
  }

  @Test
  public void testGlobalThisReported_inGlobalFunction() {
    testWarning("function f() { this.foo = 1; }");
  }

  @Test
  public void testGlobalThisReported_inVarAssignedFunction() {
    testWarning("var f = function() { this.foo = 1; };");
  }

  @Test
  public void testGlobalThisReported_inPropertyAssignedFunction() {
    testWarning("o.f = function() { this.foo = 1; };");
  }

  @Test
  public void testGlobalThisReported_inScriptLevelFunction() {
    testWarning("function a() { this.a = 1; }");
  }

  @Test
  public void testGlobalThisReported_nestedAssignLhs() {
    testWarning("(this.foo = 1).bar = 2;");
  }

  @Test
  public void testGlobalThisReported_propertyAccessGetProp() {
    testWarning("var x = this.foo;");
  }

  @Test
  public void testGlobalThisReported_propertyAccessGetElem() {
    testWarning("var x = this['foo'];");
  }

  @Test
  public void testGlobalThisIgnored_pureThisExpression() {
    testSame("this;");
  }

  @Test
  public void testGlobalThisIgnored_functionCallWithThis() {
    testSame("foo(this);");
  }

  @Test
  public void testGlobalThisIgnored_constructorFunction() {
    testSame("/** @constructor */ function F() { this.foo = 1; }");
  }

  @Test
  public void testGlobalThisIgnored_constructorFunctionWithVarDoc() {
    testSame("/** @constructor */ var F = function() { this.foo = 1; };");
  }

  @Test
  public void testGlobalThisIgnored_constructorFunctionWithNameDoc() {
    testSame("var F = /** @constructor */ function() { this.foo = 1; };");
  }

  @Test
  public void testGlobalThisIgnored_constructorFunctionWithAssignDoc() {
    testSame("/** @constructor */ F = function() { this.foo = 1; };");
  }

  @Test
  public void testGlobalThisIgnored_thisAnnotationFunction() {
    testSame("/** @this {Object} */ function f() { this.foo = 1; }");
  }

  @Test
  public void testGlobalThisIgnored_thisAnnotationOnVarFunction() {
    testSame("/** @this {Object} */ var f = function() { this.foo = 1; };");
  }

  @Test
  public void testGlobalThisIgnored_overrideAnnotationFunction() {
    testSame("/** @override */ function f() { this.foo = 1; }");
  }

  @Test
  public void testGlobalThisIgnored_prototypeMethodAssignment() {
    testSame("MyClass.prototype.foo = function() { this.x = 1; };");
  }

  @Test
  public void testGlobalThisIgnored_subPrototypeMethodAssignment() {
    testSame("MyClass.prototype.foo.bar = function() { this.x = 1; };");
  }

  @Test
  public void testGlobalThisIgnored_prototypePropertyAssignment() {
    testSame("MyClass.prototype = { foo: function() { this.x = 1; } };");
  }

  @Test
  public void testGlobalThisIgnored_functionInDisallowedParentContext() {
    testSame("if (true) (function() { this.foo = 1; })();");
  }

  @Test
  public void testGlobalThisIgnored_functionAsArgument() {
    testSame("call(function() { this.foo = 1; });");
  }

  @Test
  public void testGlobalThisIgnored_functionInArrayLiteral() {
    testSame("var arr = [function() { this.foo = 1; }];");
  }

  @Test
  public void testShouldTraverse_manualAstBranchTesting() {
    CheckGlobalThis callback = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, callback);

    Node orphanNode = new Node(Token.EMPTY);
    Assert.assertTrue(callback.shouldTraverse(t, orphanNode, null));

    Node func = new Node(Token.FUNCTION);
    Node block = new Node(Token.BLOCK, func);
    Assert.assertTrue(callback.shouldTraverse(t, func, block));

    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordConstructor();
    JSDocInfo info = builder.build(func);
    func.setJSDocInfo(info);
    Assert.assertFalse(callback.shouldTraverse(t, func, block));

    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "a");
    Node funcUnderName = new Node(Token.FUNCTION);
    varNode.addChildToBack(nameNode);
    nameNode.addChildToBack(funcUnderName);

    JSDocInfoBuilder varBuilder = new JSDocInfoBuilder(true);
    varBuilder.recordConstructor();
    varNode.setJSDocInfo(varBuilder.build(varNode));
    Assert.assertFalse(callback.shouldTraverse(t, funcUnderName, nameNode));
  }

  @Test
  public void testVisit_assignLhsChildReset() {
    CheckGlobalThis callback = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, callback);

    Node lhs = Node.newString(Token.NAME, "lhs");
    Node rhs = new Node(Token.NUMBER);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    Assert.assertTrue(callback.shouldTraverse(t, lhs, assign));
    callback.visit(t, lhs, assign);

    Node thisNode = new Node(Token.THIS);
    callback.visit(t, thisNode, null);
    Assert.assertEquals(0, compiler.getWarningCount());
  }
}
