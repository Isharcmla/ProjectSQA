package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeExpression;
import org.junit.Before;
import org.junit.Test;

public class CheckGlobalThisTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  @Test
  public void testShouldTraverse_functionWithConstructorDoc_returnsFalse() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node fnNode = new Node(Token.FUNCTION);
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordConstructor();
    fnNode.setJSDocInfo(builder.build(fnNode));

    assertFalse(check.shouldTraverse(t, fnNode, null));
  }

  @Test
  public void testShouldTraverse_functionWithThisDoc_returnsFalse() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node fnNode = new Node(Token.FUNCTION);
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordThisType(new JSTypeExpression(new Node(Token.STAR), "test"));
    fnNode.setJSDocInfo(builder.build(fnNode));

    assertFalse(check.shouldTraverse(t, fnNode, null));
  }

  @Test
  public void testShouldTraverse_functionWithoutDoc_returnsTrue() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node fnNode = new Node(Token.FUNCTION);
    assertTrue(check.shouldTraverse(t, fnNode, null));
  }

  @Test
  public void testShouldTraverse_functionWithDocOnParentAssign_returnsFalse() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode = Node.newString(Token.NAME, "foo");
    Node assignNode = new Node(Token.ASSIGN, nameNode, fnNode);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordConstructor();
    assignNode.setJSDocInfo(builder.build(assignNode));

    assertFalse(check.shouldTraverse(t, fnNode, assignNode));
  }

  @Test
  public void testShouldTraverse_functionWithDocOnParentName_returnsFalse() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode = Node.newString(Token.NAME, "foo");
    nameNode.addChildToFront(fnNode);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordConstructor();
    nameNode.setJSDocInfo(builder.build(nameNode));

    assertFalse(check.shouldTraverse(t, fnNode, nameNode));
  }

  @Test
  public void testShouldTraverse_functionWithDocOnGrandparentVar_returnsFalse() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode = Node.newString(Token.NAME, "foo");
    nameNode.addChildToFront(fnNode);
    Node varNode = new Node(Token.VAR, nameNode);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordConstructor();
    varNode.setJSDocInfo(builder.build(varNode));

    assertFalse(check.shouldTraverse(t, fnNode, nameNode));
  }

  @Test
  public void testShouldTraverse_assignLhsTraversal_setsAssignLhsChild() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node lhs = Node.newString(Token.NAME, "a");
    Node rhs = Node.newString(Token.NAME, "b");
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    assertTrue(check.shouldTraverse(t, lhs, assign));
  }

  @Test
  public void testShouldTraverse_assignNestedLhs_doesNotOverrideAssignLhsChild() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node lhsOuter = Node.newString(Token.NAME, "outer");
    Node rhsOuter = Node.newString(Token.NAME, "val");
    Node assignOuter = new Node(Token.ASSIGN, lhsOuter, rhsOuter);

    // Enter outer LHS
    assertTrue(check.shouldTraverse(t, lhsOuter, assignOuter));

    // Nested assignment inside outer LHS
    Node lhsInner = Node.newString(Token.NAME, "inner");
    Node rhsInner = Node.newString(Token.NAME, "val2");
    Node assignInner = new Node(Token.ASSIGN, lhsInner, rhsInner);

    assertTrue(check.shouldTraverse(t, lhsInner, assignInner));
  }

  @Test
  public void testShouldTraverse_assignRhsWhenLhsIsPrototype_returnsFalse() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node lhs = new Node(
        Token.GETPROP,
        Node.newString(Token.NAME, "Foo"),
        Node.newString(Token.STRING, "prototype"));
    Node rhs = new Node(Token.FUNCTION);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    assertFalse(check.shouldTraverse(t, rhs, assign));
  }

  @Test
  public void testShouldTraverse_assignRhsWhenLhsContainsDotPrototypeDot_returnsFalse() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node protoProp = new Node(
        Token.GETPROP,
        Node.newString(Token.NAME, "Foo"),
        Node.newString(Token.STRING, "prototype"));
    Node lhs = new Node(
        Token.GETPROP,
        protoProp,
        Node.newString(Token.STRING, "method"));
    Node rhs = new Node(Token.FUNCTION);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    assertFalse(check.shouldTraverse(t, rhs, assign));
  }

  @Test
  public void testShouldTraverse_assignRhsWhenLhsIsNormalGetProp_returnsTrue() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node lhs = new Node(
        Token.GETPROP,
        Node.newString(Token.NAME, "Foo"),
        Node.newString(Token.STRING, "bar"));
    Node rhs = new Node(Token.FUNCTION);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    assertTrue(check.shouldTraverse(t, rhs, assign));
  }

  @Test
  public void testShouldTraverse_assignRhsWhenLhsIsNotGetProp_returnsTrue() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node lhs = Node.newString(Token.NAME, "foo");
    Node rhs = new Node(Token.FUNCTION);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    assertTrue(check.shouldTraverse(t, rhs, assign));
  }

  @Test
  public void testVisit_thisOnLhs_reportsWarning() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node thisNode = new Node(Token.THIS);
    Node propNode = new Node(
        Token.GETPROP,
        thisNode,
        Node.newString(Token.STRING, "foo"));
    Node rhs = Node.newNumber(1);
    Node assign = new Node(Token.ASSIGN, propNode, rhs);

    // Traverse LHS to set assignLhsChild
    check.shouldTraverse(t, propNode, assign);
    check.visit(t, thisNode, propNode);

    assertEquals(1, compiler.getWarningCount());
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisit_thisNotOnLhs_doesNotReport() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node thisNode = new Node(Token.THIS);
    Node parent = new Node(Token.EXPR_RESULT, thisNode);

    check.visit(t, thisNode, parent);

    assertEquals(0, compiler.getWarningCount());
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testVisit_nonThisNode_doesNotReport() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node nameNode = Node.newString(Token.NAME, "foo");
    check.visit(t, nameNode, null);

    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_leavingAssignLhsChild_resetsAssignLhsChild() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node lhs = Node.newString(Token.NAME, "a");
    Node rhs = Node.newString(Token.NAME, "b");
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    check.shouldTraverse(t, lhs, assign);
    check.visit(t, lhs, assign);

    // Now visit a THIS node; assignLhsChild should be null, so no warning is reported
    Node thisNode = new Node(Token.THIS);
    check.visit(t, thisNode, null);

    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_reportLevelError() {
    CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.ERROR);
    NodeTraversal t = new NodeTraversal(compiler, check);

    Node thisNode = new Node(Token.THIS);
    Node rhs = Node.newNumber(1);
    Node assign = new Node(Token.ASSIGN, thisNode, rhs);

    check.shouldTraverse(t, thisNode, assign);
    check.visit(t, thisNode, assign);

    assertEquals(1, compiler.getErrorCount());
    assertEquals(0, compiler.getWarningCount());
  }
}
