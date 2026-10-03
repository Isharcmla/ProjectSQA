package com.google.javascript.jscomp;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CheckGlobalThisTest {

  private Compiler compiler;
  private CheckGlobalThis checkGlobalThis;

  @Before
  public void setUp() {
    compiler = new Compiler();
    checkGlobalThis = new CheckGlobalThis(compiler, CheckLevel.WARNING);
  }

  private Node createFunctionNode() {
    return new Node(Token.FUNCTION, Node.newString(Token.NAME, "foo"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
  }

  @Test
  public void testConstructor_initializesCorrectly() {
    assertNotNull(checkGlobalThis);
    assertEquals("JSC_USED_GLOBAL_THIS", CheckGlobalThis.GLOBAL_THIS.key);
  }

  @Test
  public void testShouldTraverse_functionWithConstructorJsDoc_returnsFalse() {
    Node fn = createFunctionNode();
    Node parent = new Node(Token.BLOCK, fn);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordConstructor();
    fn.setJSDocInfo(builder.build(fn));

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertFalse(checkGlobalThis.shouldTraverse(t, fn, parent));
  }

  @Test
  public void testShouldTraverse_functionWithInterfaceJsDoc_returnsFalse() {
    Node fn = createFunctionNode();
    Node parent = new Node(Token.BLOCK, fn);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordInterface();
    fn.setJSDocInfo(builder.build(fn));

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertFalse(checkGlobalThis.shouldTraverse(t, fn, parent));
  }

  @Test
  public void testShouldTraverse_functionWithThisTypeJsDoc_returnsFalse() {
    Node fn = createFunctionNode();
    Node parent = new Node(Token.BLOCK, fn);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordThisType(new JSTypeExpression(Node.newString(Token.NAME, "Object"), "test"));
    fn.setJSDocInfo(builder.build(fn));

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertFalse(checkGlobalThis.shouldTraverse(t, fn, parent));
  }

  @Test
  public void testShouldTraverse_functionWithOverrideJsDoc_returnsFalse() {
    Node fn = createFunctionNode();
    Node parent = new Node(Token.BLOCK, fn);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordOverride();
    fn.setJSDocInfo(builder.build(fn));

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertFalse(checkGlobalThis.shouldTraverse(t, fn, parent));
  }

  @Test
  public void testShouldTraverse_functionJsDocOnParentName_returnsFalseWhenConstructor() {
    Node fn = createFunctionNode();
    Node nameNode = Node.newString(Token.NAME, "Foo");
    nameNode.addChildToBack(fn);
    Node varNode = new Node(Token.VAR, nameNode);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordConstructor();
    nameNode.setJSDocInfo(builder.build(nameNode));

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertFalse(checkGlobalThis.shouldTraverse(t, fn, nameNode));
  }

  @Test
  public void testShouldTraverse_functionJsDocOnGrampsVar_returnsFalseWhenConstructor() {
    Node fn = createFunctionNode();
    Node nameNode = Node.newString(Token.NAME, "Foo");
    nameNode.addChildToBack(fn);
    Node varNode = new Node(Token.VAR, nameNode);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordConstructor();
    varNode.setJSDocInfo(builder.build(varNode));

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertFalse(checkGlobalThis.shouldTraverse(t, fn, nameNode));
  }

  @Test
  public void testShouldTraverse_functionJsDocOnGrampsVar_nonVarGramps_returnsTrue() {
    Node fn = createFunctionNode();
    Node nameNode = Node.newString(Token.NAME, "Foo");
    nameNode.addChildToBack(fn);
    Node exprResult = new Node(Token.EXPR_RESULT, nameNode);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertTrue(checkGlobalThis.shouldTraverse(t, fn, nameNode));
  }

  @Test
  public void testShouldTraverse_functionJsDocOnParentAssign_returnsFalseWhenConstructor() {
    Node fn = createFunctionNode();
    Node lhs = Node.newString(Token.NAME, "Foo");
    Node assignNode = new Node(Token.ASSIGN, lhs, fn);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordConstructor();
    assignNode.setJSDocInfo(builder.build(assignNode));

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertFalse(checkGlobalThis.shouldTraverse(t, fn, assignNode));
  }

  @Test
  public void testShouldTraverse_functionJsDocOnParentAssign_nullJsDoc_returnsTrue() {
    Node fn = createFunctionNode();
    Node lhs = Node.newString(Token.NAME, "Foo");
    Node assignNode = new Node(Token.ASSIGN, lhs, fn);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertTrue(checkGlobalThis.shouldTraverse(t, fn, assignNode));
  }

  @Test
  public void testShouldTraverse_functionWithNonAnnotationJsDoc_inBlock_returnsTrue() {
    Node fn = createFunctionNode();
    Node block = new Node(Token.BLOCK, fn);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordDescription("regular jsdoc");
    fn.setJSDocInfo(builder.build(fn));

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertTrue(checkGlobalThis.shouldTraverse(t, fn, block));
  }

  @Test
  public void testShouldTraverse_functionInScript_returnsTrue() {
    Node fn = createFunctionNode();
    Node script = new Node(Token.SCRIPT, fn);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertTrue(checkGlobalThis.shouldTraverse(t, fn, script));
  }

  @Test
  public void testShouldTraverse_functionInName_returnsTrue() {
    Node fn = createFunctionNode();
    Node nameNode = Node.newString(Token.NAME, "a");
    nameNode.addChildToBack(fn);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertTrue(checkGlobalThis.shouldTraverse(t, fn, nameNode));
  }

  @Test
  public void testShouldTraverse_functionInAssign_returnsTrue() {
    Node fn = createFunctionNode();
    Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"), fn);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertTrue(checkGlobalThis.shouldTraverse(t, fn, assignNode));
  }

  @Test
  public void testShouldTraverse_functionInInvalidParent_returnsFalse() {
    Node fn = createFunctionNode();
    Node call = new Node(Token.CALL, fn);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertFalse(checkGlobalThis.shouldTraverse(t, fn, call));
  }

  @Test
  public void testShouldTraverse_assignLhs_setsAssignLhsChild_nestedAssignmentPreserved() {
    Node thisNode = new Node(Token.THIS);
    Node nestedAssign = new Node(Token.ASSIGN, thisNode, Node.newNumber(1));
    Node outerLhs = new Node(Token.GETPROP, nestedAssign, Node.newString("prop"));
    Node outerRhs = Node.newNumber(2);
    Node outerAssign = new Node(Token.ASSIGN, outerLhs, outerRhs);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);

    // Visiting outer LHS
    assertTrue(checkGlobalThis.shouldTraverse(t, outerLhs, outerAssign));
    // Nested assign LHS (assignLhsChild already set to outerLhs, shouldn't override)
    assertTrue(checkGlobalThis.shouldTraverse(t, thisNode, nestedAssign));
  }

  @Test
  public void testShouldTraverse_assignRhs_prototypeAssignment_returnsFalse() {
    Node target = Node.newString(Token.NAME, "Foo");
    Node protoProp = Node.newString("prototype");
    Node lhs = new Node(Token.GETPROP, target, protoProp);
    Node rhs = new Node(Token.OBJECTLIT);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertFalse(checkGlobalThis.shouldTraverse(t, rhs, assign));
  }

  @Test
  public void testShouldTraverse_assignRhs_prototypeSubPropertyAssignment_returnsFalse() {
    Node target = Node.newString(Token.NAME, "Foo");
    Node protoProp = Node.newString("prototype");
    Node llhs = new Node(Token.GETPROP, target, protoProp);
    Node lhs = new Node(Token.GETPROP, llhs, Node.newString("method"));
    Node rhs = createFunctionNode();
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertFalse(checkGlobalThis.shouldTraverse(t, rhs, assign));
  }

  @Test
  public void testShouldTraverse_assignRhs_prototypeGetElemSubProperty_returnsFalse() {
    Node target = Node.newString(Token.NAME, "Foo");
    Node protoProp = Node.newString("prototype");
    Node llhs = new Node(Token.GETPROP, target, protoProp);
    Node lhs = new Node(Token.GETELEM, llhs, Node.newString("method"));
    Node rhs = createFunctionNode();
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertFalse(checkGlobalThis.shouldTraverse(t, rhs, assign));
  }

  @Test
  public void testShouldTraverse_assignRhs_regularPropertyAssignment_returnsTrue() {
    Node target = Node.newString(Token.NAME, "Foo");
    Node prop = Node.newString("bar");
    Node llhs = new Node(Token.GETPROP, target, prop);
    Node lhs = new Node(Token.GETPROP, llhs, Node.newString("method"));
    Node rhs = createFunctionNode();
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertTrue(checkGlobalThis.shouldTraverse(t, rhs, assign));
  }

  @Test
  public void testShouldTraverse_assignRhs_singleGetPropNonPrototype_returnsTrue() {
    Node target = Node.newString(Token.NAME, "Foo");
    Node prop = Node.newString("bar");
    Node lhs = new Node(Token.GETPROP, target, prop);
    Node rhs = createFunctionNode();
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertTrue(checkGlobalThis.shouldTraverse(t, rhs, assign));
  }

  @Test
  public void testShouldTraverse_assignRhs_nonGetPropLhs_returnsTrue() {
    Node lhs = Node.newString(Token.NAME, "x");
    Node rhs = createFunctionNode();
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertTrue(checkGlobalThis.shouldTraverse(t, rhs, assign));
  }

  @Test
  public void testShouldTraverse_nullParent_returnsTrue() {
    Node n = new Node(Token.EXPR_RESULT);
    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    assertTrue(checkGlobalThis.shouldTraverse(t, n, null));
  }

  @Test
  public void testVisit_thisOnLhsOfAssign_reportsWarningAndResetsLhs() {
    Node thisNode = new Node(Token.THIS);
    Node prop = Node.newString("x");
    Node lhs = new Node(Token.GETPROP, thisNode, prop);
    Node rhs = Node.newNumber(42);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    checkGlobalThis.shouldTraverse(t, lhs, assign);

    // Visiting `this` while assignLhsChild is active
    checkGlobalThis.visit(t, thisNode, lhs);
    assertEquals(1, compiler.getWarningCount());

    // Visiting lhs resets assignLhsChild
    checkGlobalThis.visit(t, lhs, assign);

    // Subsequent standalone this access won't report based on assignLhsChild
    Node standaloneThis = new Node(Token.THIS);
    Node nameParent = Node.newString(Token.NAME, "val");
    checkGlobalThis.visit(t, standaloneThis, nameParent);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testVisit_thisInPropertyAccess_reportsWarning() {
    Node thisNode = new Node(Token.THIS);
    Node prop = Node.newString("foo");
    Node getprop = new Node(Token.GETPROP, thisNode, prop);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    checkGlobalThis.visit(t, thisNode, getprop);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testVisit_thisStandaloneWithoutProperty_doesNotReport() {
    Node thisNode = new Node(Token.THIS);
    Node nameNode = Node.newString(Token.NAME, "a");
    nameNode.addChildToBack(thisNode);

    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    checkGlobalThis.visit(t, thisNode, nameNode);
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_thisWithNullParent_doesNotReport() {
    Node thisNode = new Node(Token.THIS);
    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    checkGlobalThis.visit(t, thisNode, null);
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_nonThisNode_doesNotReport() {
    Node node = Node.newString(Token.NAME, "foo");
    Node parent = new Node(Token.EXPR_RESULT, node);
    NodeTraversal t = new NodeTraversal(compiler, checkGlobalThis);
    checkGlobalThis.visit(t, node, parent);
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testCompleteTraversal_globalThisPropertyAssignment_flagsWarning() {
    Node thisNode = new Node(Token.THIS);
    Node getProp = new Node(Token.GETPROP, thisNode, Node.newString("a"));
    Node assign = new Node(Token.ASSIGN, getProp, Node.newNumber(1));
    Node expr = new Node(Token.EXPR_RESULT, assign);
    Node script = new Node(Token.SCRIPT, expr);

    NodeTraversal.traverse(compiler, script, checkGlobalThis);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testCompleteTraversal_prototypeMethodThisAssignment_doesNotFlagWarning() {
    Node fn = createFunctionNode();
    Node fnBody = fn.getLastChild();
    Node thisNode = new Node(Token.THIS);
    Node getProp = new Node(Token.GETPROP, thisNode, Node.newString("prop"));
    Node assign = new Node(Token.ASSIGN, getProp, Node.newNumber(1));
    fnBody.addChildToBack(new Node(Token.EXPR_RESULT, assign));

    Node proto = Node.newString(Token.NAME, "MyClass");
    Node protoProp = new Node(Token.GETPROP, proto, Node.newString("prototype"));
    Node methodProp = new Node(Token.GETPROP, protoProp, Node.newString("method"));
    Node methodAssign = new Node(Token.ASSIGN, methodProp, fn);
    Node script = new Node(Token.SCRIPT, new Node(Token.EXPR_RESULT, methodAssign));

    NodeTraversal.traverse(compiler, script, checkGlobalThis);
    assertEquals(0, compiler.getWarningCount());
  }
}
