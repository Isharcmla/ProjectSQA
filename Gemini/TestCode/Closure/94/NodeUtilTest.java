package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NodeUtilTest {

  @Test
  public void testGetBooleanValue_literals() {
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(Node.newString("hello")));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newString("")));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(Node.newNumber(1.0)));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newNumber(0.0)));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.NULL)));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.FALSE)));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.VOID)));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.TRUE)));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.ARRAYLIT)));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.OBJECTLIT)));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.REGEXP)));

    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "undefined")));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "NaN")));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "Infinity")));
    Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "foo")));
    Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(new Node(Token.ADD)));
  }

  @Test
  public void testGetExpressionBooleanValue_expressions() {
    Node assign = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(1));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(assign));

    Node comma = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(0));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(comma));

    Node not = new Node(Token.NOT, Node.newNumber(1));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(not));

    Node and = new Node(Token.AND, Node.newNumber(1), Node.newNumber(2));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(and));

    Node or = new Node(Token.OR, Node.newNumber(0), Node.newNumber(1));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(or));

    Node hookSame = new Node(Token.HOOK, Node.newNumber(1), Node.newString("a"), Node.newString("b"));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(hookSame));

    Node hookDiff = new Node(Token.HOOK, Node.newNumber(1), Node.newString("a"), Node.newNumber(0));
    Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(hookDiff));

    Node num = Node.newNumber(10);
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(num));
  }

  @Test
  public void testGetStringValue_variousTokens() {
    Assert.assertEquals("foo", NodeUtil.getStringValue(Node.newString(Token.NAME, "foo")));
    Assert.assertEquals("bar", NodeUtil.getStringValue(Node.newString("bar")));
    Assert.assertEquals("123", NodeUtil.getStringValue(Node.newNumber(123.0)));
    Assert.assertEquals("123.45", NodeUtil.getStringValue(Node.newNumber(123.45)));
    Assert.assertEquals("false", NodeUtil.getStringValue(new Node(Token.FALSE)));
    Assert.assertEquals("true", NodeUtil.getStringValue(new Node(Token.TRUE)));
    Assert.assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
    Assert.assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID)));
    Assert.assertNull(NodeUtil.getStringValue(new Node(Token.ADD)));
  }

  @Test
  public void testGetFunctionName_and_getNearestFunctionName() {
    Node fnNamed = new Node(Token.FUNCTION, Node.newString(Token.NAME, "myFunc"), new Node(Token.LP), new Node(Token.BLOCK));
    Assert.assertEquals("myFunc", NodeUtil.getFunctionName(fnNamed));
    Assert.assertEquals("myFunc", NodeUtil.getNearestFunctionName(fnNamed));

    Node fnAnon = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Assert.assertNull(NodeUtil.getFunctionName(fnAnon));

    Node varName = Node.newString(Token.NAME, "vVar");
    varName.addChildToBack(fnAnon);
    Node varNode = new Node(Token.VAR, varName);
    Assert.assertEquals("vVar", NodeUtil.getFunctionName(fnAnon));
    Assert.assertEquals("vVar", NodeUtil.getNearestFunctionName(fnAnon));

    Node fnAnon2 = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node assignLhs = NodeUtil.newQualifiedNameNode("a.b.c", 0, 0);
    Node assign = new Node(Token.ASSIGN, assignLhs, fnAnon2);
    Assert.assertEquals("a.b.c", NodeUtil.getFunctionName(fnAnon2));
    Assert.assertEquals("a.b.c", NodeUtil.getNearestFunctionName(fnAnon2));

    Node fnAnon3 = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node objLit = new Node(Token.OBJECTLIT, Node.newString("propKey"), fnAnon3);
    Assert.assertEquals("propKey", NodeUtil.getNearestFunctionName(fnAnon3));

    Node fnAnon4 = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node arrayLit = new Node(Token.ARRAYLIT, fnAnon4);
    Assert.assertNull(NodeUtil.getNearestFunctionName(fnAnon4));
  }

  @Test
  public void testIsImmutableValue() {
    Assert.assertTrue(NodeUtil.isImmutableValue(Node.newString("str")));
    Assert.assertTrue(NodeUtil.isImmutableValue(Node.newNumber(42)));
    Assert.assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    Assert.assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
    Assert.assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));

    Node voidNode = new Node(Token.VOID, Node.newNumber(0));
    Assert.assertTrue(NodeUtil.isImmutableValue(voidNode));

    Node negNode = new Node(Token.NEG, Node.newNumber(5));
    Assert.assertTrue(NodeUtil.isImmutableValue(negNode));

    Assert.assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "undefined")));
    Assert.assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "Infinity")));
    Assert.assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "NaN")));
    Assert.assertFalse(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "other")));
    Assert.assertFalse(NodeUtil.isImmutableValue(new Node(Token.OBJECTLIT)));
  }

  @Test
  public void testIsLiteralValue() {
    Node array = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newString("s"));
    Assert.assertTrue(NodeUtil.isLiteralValue(array, false));

    Node arrayWithVar = new Node(Token.ARRAYLIT, Node.newString(Token.NAME, "x"));
    Assert.assertFalse(NodeUtil.isLiteralValue(arrayWithVar, false));

    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    new Node(Token.EXPR_RESULT, fn);
    Assert.assertTrue(NodeUtil.isLiteralValue(fn, true));
    Assert.assertFalse(NodeUtil.isLiteralValue(fn, false));

    Node block = new Node(Token.BLOCK);
    Node fnDecl = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
    block.addChildToBack(fnDecl);
    Assert.assertFalse(NodeUtil.isLiteralValue(fnDecl, true));

    Assert.assertTrue(NodeUtil.isLiteralValue(Node.newNumber(5), false));
  }

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = new HashSet<String>(Arrays.asList("DEF_A", "a.b.DEF_B"));

    Assert.assertTrue(NodeUtil.isValidDefineValue(Node.newString("val"), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(Node.newNumber(1), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(new Node(Token.TRUE), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(new Node(Token.FALSE), defines));

    Node not = new Node(Token.NOT, new Node(Token.TRUE));
    Assert.assertTrue(NodeUtil.isValidDefineValue(not, defines));
    Node neg = new Node(Token.NEG, Node.newNumber(2));
    Assert.assertTrue(NodeUtil.isValidDefineValue(neg, defines));

    Assert.assertTrue(NodeUtil.isValidDefineValue(Node.newString(Token.NAME, "DEF_A"), defines));
    Assert.assertFalse(NodeUtil.isValidDefineValue(Node.newString(Token.NAME, "UNKNOWN"), defines));

    Node getprop = NodeUtil.newQualifiedNameNode("a.b.DEF_B", 0, 0);
    Assert.assertTrue(NodeUtil.isValidDefineValue(getprop, defines));

    Node getpropInvalid = NodeUtil.newQualifiedNameNode("a.b.OTHER", 0, 0);
    Assert.assertFalse(NodeUtil.isValidDefineValue(getpropInvalid, defines));

    Assert.assertFalse(NodeUtil.isValidDefineValue(new Node(Token.OBJECTLIT), defines));
  }

  @Test
  public void testIsEmptyBlock() {
    Assert.assertFalse(NodeUtil.isEmptyBlock(new Node(Token.EXPR_RESULT)));

    Node emptyBlock = new Node(Token.BLOCK);
    Assert.assertTrue(NodeUtil.isEmptyBlock(emptyBlock));

    Node blockWithEmpty = new Node(Token.BLOCK, new Node(Token.EMPTY), new Node(Token.EMPTY));
    Assert.assertTrue(NodeUtil.isEmptyBlock(blockWithEmpty));

    Node blockWithStmt = new Node(Token.BLOCK, new Node(Token.RETURN));
    Assert.assertFalse(NodeUtil.isEmptyBlock(blockWithStmt));
  }

  @Test
  public void testIsSimpleOperator_and_isSimpleOperatorType() {
    int[] simpleTypes = new int[] {
        Token.ADD, Token.BITAND, Token.BITNOT, Token.BITOR, Token.BITXOR,
        Token.COMMA, Token.DIV, Token.EQ, Token.GE, Token.GETELEM, Token.GETPROP,
        Token.GT, Token.INSTANCEOF, Token.LE, Token.LSH, Token.LT, Token.MOD,
        Token.MUL, Token.NE, Token.NOT, Token.RSH, Token.SHEQ, Token.SHNE,
        Token.SUB, Token.TYPEOF, Token.VOID, Token.POS, Token.NEG, Token.URSH
    };
    for (int t : simpleTypes) {
      Assert.assertTrue("Expected simple type for: " + t, NodeUtil.isSimpleOperatorType(t));
      Assert.assertTrue(NodeUtil.isSimpleOperator(new Node(t)));
    }
    Assert.assertFalse(NodeUtil.isSimpleOperatorType(Token.VAR));
    Assert.assertFalse(NodeUtil.isSimpleOperator(new Node(Token.VAR)));
  }

  @Test
  public void testNewExpr() {
    Node child = Node.newNumber(42);
    child.setLineno(5);
    child.setCharno(10);
    Node expr = NodeUtil.newExpr(child);
    Assert.assertEquals(Token.EXPR_RESULT, expr.getType());
    Assert.assertEquals(child, expr.getFirstChild());
    Assert.assertEquals(5, expr.getLineno());
  }

  @Test
  public void testMayEffectMutableState_and_mayHaveSideEffects() {
    Node num = Node.newNumber(1);
    Assert.assertFalse(NodeUtil.mayEffectMutableState(num));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(num));

    Node objLit = new Node(Token.OBJECTLIT);
    Assert.assertTrue(NodeUtil.mayEffectMutableState(objLit));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(objLit));

    Node throwNode = new Node(Token.THROW, Node.newString("err"));
    Assert.assertTrue(NodeUtil.mayEffectMutableState(throwNode));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(throwNode));

    Node newArray = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
    Assert.assertTrue(NodeUtil.mayEffectMutableState(newArray));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(newArray));

    Node callBuiltin = new Node(Token.CALL, Node.newString(Token.NAME, "String"), Node.newNumber(1));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(callBuiltin));

    Node callMath = new Node(Token.CALL, NodeUtil.newQualifiedNameNode("Math.sin", 0, 0), Node.newNumber(1));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(callMath));

    Node callCustom = new Node(Token.CALL, Node.newString(Token.NAME, "customFn"));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(callCustom));

    Node assignName = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(1));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(assignName));

    Node assignLiteralProp = new Node(Token.ASSIGN,
        new Node(Token.GETPROP, new Node(Token.OBJECTLIT), Node.newString("p")),
        Node.newNumber(1));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(assignLiteralProp));

    Node varWithInit = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    varWithInit.getFirstChild().addChildToBack(Node.newNumber(1));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(varWithInit));
  }

  @Test
  public void testConstructorCallHasSideEffects() {
    Node newArray = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
    Assert.assertFalse(NodeUtil.constructorCallHasSideEffects(newArray));

    Node newCustom = new Node(Token.NEW, Node.newString(Token.NAME, "CustomClass"));
    Assert.assertTrue(NodeUtil.constructorCallHasSideEffects(newCustom));

    newCustom.setIsNoSideEffectsCall();
    Assert.assertFalse(NodeUtil.constructorCallHasSideEffects(newCustom));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorCallHasSideEffects_invalidNode() {
    NodeUtil.constructorCallHasSideEffects(new Node(Token.CALL));
  }

  @Test
  public void testFunctionCallHasSideEffects() {
    Node callObj = new Node(Token.CALL, Node.newString(Token.NAME, "Object"));
    Assert.assertFalse(NodeUtil.functionCallHasSideEffects(callObj));

    Node callCustom = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    Assert.assertTrue(NodeUtil.functionCallHasSideEffects(callCustom));

    callCustom.setIsNoSideEffectsCall();
    Assert.assertFalse(NodeUtil.functionCallHasSideEffects(callCustom));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFunctionCallHasSideEffects_invalidNode() {
    NodeUtil.functionCallHasSideEffects(new Node(Token.NEW));
  }

  @Test
  public void testCallHasLocalResult() {
    Node call = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    Assert.assertFalse(NodeUtil.callHasLocalResult(call));
    call.putIntProp(Node.SIDE_EFFECT_FLAGS, Node.FLAG_LOCAL_RESULTS);
    Assert.assertTrue(NodeUtil.callHasLocalResult(call));
  }

  @Test(expected = IllegalStateException.class)
  public void testCallHasLocalResult_invalidNode() {
    NodeUtil.callHasLocalResult(new Node(Token.NEW));
  }

  @Test
  public void testNodeTypeMayHaveSideEffects() {
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.ASSIGN)));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DELPROP)));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DEC)));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.INC)));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.THROW)));

    Node nameWithChild = Node.newString(Token.NAME, "a");
    nameWithChild.addChildToBack(Node.newNumber(1));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameWithChild));

    Node nameWithoutChild = Node.newString(Token.NAME, "a");
    Assert.assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(nameWithoutChild));

    Assert.assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(Node.newNumber(1)));
  }

  @Test
  public void testCanBeSideEffected() {
    Assert.assertTrue(NodeUtil.canBeSideEffected(new Node(Token.CALL, Node.newString(Token.NAME, "f"))));
    Assert.assertTrue(NodeUtil.canBeSideEffected(new Node(Token.NEW, Node.newString(Token.NAME, "C"))));
    Assert.assertTrue(NodeUtil.canBeSideEffected(new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString("b"))));
    Assert.assertTrue(NodeUtil.canBeSideEffected(new Node(Token.GETELEM, Node.newString(Token.NAME, "a"), Node.newNumber(0))));

    Node nameNode = Node.newString(Token.NAME, "x");
    Assert.assertTrue(NodeUtil.canBeSideEffected(nameNode));
    Assert.assertFalse(NodeUtil.canBeSideEffected(nameNode, Collections.singleton("x")));

    Node constName = Node.newString(Token.NAME, "y");
    constName.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    Assert.assertFalse(NodeUtil.canBeSideEffected(constName));

    Node fnExpr = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    new Node(Token.EXPR_RESULT, fnExpr);
    Assert.assertFalse(NodeUtil.canBeSideEffected(fnExpr));

    Assert.assertFalse(NodeUtil.canBeSideEffected(Node.newNumber(10)));
  }

  @Test
  public void testPrecedence() {
    Assert.assertEquals(0, NodeUtil.precedence(Token.COMMA));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    Assert.assertEquals(2, NodeUtil.precedence(Token.HOOK));
    Assert.assertEquals(3, NodeUtil.precedence(Token.OR));
    Assert.assertEquals(4, NodeUtil.precedence(Token.AND));
    Assert.assertEquals(5, NodeUtil.precedence(Token.BITOR));
    Assert.assertEquals(6, NodeUtil.precedence(Token.BITXOR));
    Assert.assertEquals(7, NodeUtil.precedence(Token.BITAND));
    Assert.assertEquals(8, NodeUtil.precedence(Token.EQ));
    Assert.assertEquals(9, NodeUtil.precedence(Token.LT));
    Assert.assertEquals(10, NodeUtil.precedence(Token.LSH));
    Assert.assertEquals(11, NodeUtil.precedence(Token.ADD));
    Assert.assertEquals(12, NodeUtil.precedence(Token.MUL));
    Assert.assertEquals(13, NodeUtil.precedence(Token.NOT));
    Assert.assertEquals(15, NodeUtil.precedence(Token.NAME));
  }

  @Test(expected = Error.class)
  public void testPrecedence_unknown() {
    NodeUtil.precedence(-999);
  }

  @Test
  public void testIsAssociative() {
    Assert.assertTrue(NodeUtil.isAssociative(Token.MUL));
    Assert.assertTrue(NodeUtil.isAssociative(Token.AND));
    Assert.assertTrue(NodeUtil.isAssociative(Token.OR));
    Assert.assertTrue(NodeUtil.isAssociative(Token.BITOR));
    Assert.assertTrue(NodeUtil.isAssociative(Token.BITAND));
    Assert.assertFalse(NodeUtil.isAssociative(Token.ADD));
    Assert.assertFalse(NodeUtil.isAssociative(Token.SUB));
  }

  @Test
  public void testAssignmentOps() {
    int[] assignOps = new int[] {
        Token.ASSIGN, Token.ASSIGN_BITOR, Token.ASSIGN_BITXOR, Token.ASSIGN_BITAND,
        Token.ASSIGN_LSH, Token.ASSIGN_RSH, Token.ASSIGN_URSH, Token.ASSIGN_ADD,
        Token.ASSIGN_SUB, Token.ASSIGN_MUL, Token.ASSIGN_DIV, Token.ASSIGN_MOD
    };
    for (int op : assignOps) {
      Node node = new Node(op);
      Assert.assertTrue(NodeUtil.isAssignmentOp(node));
      if (op != Token.ASSIGN) {
        Assert.assertTrue(NodeUtil.getOpFromAssignmentOp(node) > 0);
      }
    }
    Assert.assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetOpFromAssignmentOp_invalid() {
    NodeUtil.getOpFromAssignmentOp(new Node(Token.ADD));
  }

  @Test
  public void testTypePredicates() {
    Assert.assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT)));
    Assert.assertFalse(NodeUtil.isExpressionNode(new Node(Token.BLOCK)));

    Assert.assertTrue(NodeUtil.isGet(new Node(Token.GETPROP)));
    Assert.assertTrue(NodeUtil.isGet(new Node(Token.GETELEM)));
    Assert.assertFalse(NodeUtil.isGet(new Node(Token.NAME)));

    Assert.assertTrue(NodeUtil.isGetProp(new Node(Token.GETPROP)));
    Assert.assertFalse(NodeUtil.isGetProp(new Node(Token.GETELEM)));

    Assert.assertTrue(NodeUtil.isName(new Node(Token.NAME)));
    Assert.assertFalse(NodeUtil.isName(new Node(Token.STRING)));

    Assert.assertTrue(NodeUtil.isNew(new Node(Token.NEW)));
    Assert.assertFalse(NodeUtil.isNew(new Node(Token.CALL)));

    Assert.assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
    Assert.assertFalse(NodeUtil.isVar(new Node(Token.LET)));

    Assert.assertTrue(NodeUtil.isString(new Node(Token.STRING)));
    Assert.assertFalse(NodeUtil.isString(new Node(Token.NUMBER)));

    Assert.assertTrue(NodeUtil.isAssign(new Node(Token.ASSIGN)));
    Assert.assertFalse(NodeUtil.isAssign(new Node(Token.ASSIGN_ADD)));

    Assert.assertTrue(NodeUtil.isCall(new Node(Token.CALL)));
    Assert.assertFalse(NodeUtil.isCall(new Node(Token.NEW)));

    Assert.assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
    Assert.assertFalse(NodeUtil.isFunction(new Node(Token.CALL)));

    Assert.assertTrue(NodeUtil.isThis(new Node(Token.THIS)));
    Assert.assertFalse(NodeUtil.isThis(new Node(Token.NAME)));
  }

  @Test
  public void testIsVarDeclaration_and_getAssignedValue() {
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "x");
    Node valueNode = Node.newNumber(10);
    nameNode.addChildToBack(valueNode);
    varNode.addChildToBack(nameNode);

    Assert.assertTrue(NodeUtil.isVarDeclaration(nameNode));
    Assert.assertEquals(valueNode, NodeUtil.getAssignedValue(nameNode));

    Node assignName = Node.newString(Token.NAME, "y");
    Node assignVal = Node.newNumber(20);
    Node assign = new Node(Token.ASSIGN, assignName, assignVal);
    Assert.assertEquals(assignVal, NodeUtil.getAssignedValue(assignName));

    Node standaloneName = Node.newString(Token.NAME, "z");
    new Node(Token.EXPR_RESULT, standaloneName);
    Assert.assertNull(NodeUtil.getAssignedValue(standaloneName));
  }

  @Test
  public void testIsExprAssign_and_isExprCall() {
    Node exprAssign = new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"), Node.newNumber(1)));
    Assert.assertTrue(NodeUtil.isExprAssign(exprAssign));
    Assert.assertFalse(NodeUtil.isExprCall(exprAssign));

    Node exprCall = new Node(Token.EXPR_RESULT, new Node(Token.CALL, Node.newString(Token.NAME, "a")));
    Assert.assertTrue(NodeUtil.isExprCall(exprCall));
    Assert.assertFalse(NodeUtil.isExprAssign(exprCall));
  }

  @Test
  public void testLoopsAndControlStructures() {
    Node forIn = new Node(Token.FOR, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"), new Node(Token.BLOCK));
    Assert.assertTrue(NodeUtil.isForIn(forIn));
    Assert.assertTrue(NodeUtil.isLoopStructure(forIn));
    Assert.assertTrue(NodeUtil.isControlStructure(forIn));

    Node for4 = new Node(Token.FOR, new Node(Token.EMPTY), Node.newNumber(1), new Node(Token.EMPTY), new Node(Token.BLOCK));
    Assert.assertFalse(NodeUtil.isForIn(for4));
    Assert.assertTrue(NodeUtil.isLoopStructure(for4));

    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), Node.newNumber(1));
    Node whileNode = new Node(Token.WHILE, Node.newNumber(1), new Node(Token.BLOCK));

    Assert.assertTrue(NodeUtil.isLoopStructure(doNode));
    Assert.assertTrue(NodeUtil.isLoopStructure(whileNode));

    Assert.assertEquals(for4.getLastChild(), NodeUtil.getLoopCodeBlock(for4));
    Assert.assertEquals(whileNode.getLastChild(), NodeUtil.getLoopCodeBlock(whileNode));
    Assert.assertEquals(doNode.getFirstChild(), NodeUtil.getLoopCodeBlock(doNode));
    Assert.assertNull(NodeUtil.getLoopCodeBlock(new Node(Token.IF)));

    Node inner = Node.newNumber(1);
    doNode.getFirstChild().addChildToBack(inner);
    Assert.assertTrue(NodeUtil.isWithinLoop(inner));
  }

  @Test
  public void testIsControlStructureCodeBlock() {
    Node forNode = new Node(Token.FOR, new Node(Token.EMPTY), Node.newNumber(1), new Node(Token.EMPTY), new Node(Token.BLOCK));
    Assert.assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, forNode.getLastChild()));
    Assert.assertFalse(NodeUtil.isControlStructureCodeBlock(forNode, forNode.getFirstChild()));

    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), Node.newNumber(1));
    Assert.assertTrue(NodeUtil.isControlStructureCodeBlock(doNode, doNode.getFirstChild()));

    Node ifNode = new Node(Token.IF, Node.newNumber(1), new Node(Token.BLOCK));
    Assert.assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, ifNode.getLastChild()));
    Assert.assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, ifNode.getFirstChild()));

    Node defaultNode = new Node(Token.DEFAULT, new Node(Token.BLOCK));
    Assert.assertTrue(NodeUtil.isControlStructureCodeBlock(defaultNode, defaultNode.getFirstChild()));
  }

  @Test
  public void testGetConditionExpression() {
    Node cond = Node.newNumber(1);
    Node ifNode = new Node(Token.IF, cond, new Node(Token.BLOCK));
    Assert.assertEquals(cond, NodeUtil.getConditionExpression(ifNode));

    Node whileNode = new Node(Token.WHILE, cond, new Node(Token.BLOCK));
    Assert.assertEquals(cond, NodeUtil.getConditionExpression(whileNode));

    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), cond);
    Assert.assertEquals(cond, NodeUtil.getConditionExpression(doNode));

    Node for4 = new Node(Token.FOR, new Node(Token.EMPTY), cond, new Node(Token.EMPTY), new Node(Token.BLOCK));
    Assert.assertEquals(cond, NodeUtil.getConditionExpression(for4));

    Node forIn = new Node(Token.FOR, new Node(Token.NAME), new Node(Token.NAME), new Node(Token.BLOCK));
    Assert.assertNull(NodeUtil.getConditionExpression(forIn));

    Node caseNode = new Node(Token.CASE, cond, new Node(Token.BLOCK));
    Assert.assertNull(NodeUtil.getConditionExpression(caseNode));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_invalid() {
    NodeUtil.getConditionExpression(new Node(Token.EXPR_RESULT));
  }

  @Test
  public void testStatementsAndBlocks() {
    Assert.assertTrue(NodeUtil.isStatementBlock(new Node(Token.SCRIPT)));
    Assert.assertTrue(NodeUtil.isStatementBlock(new Node(Token.BLOCK)));
    Assert.assertFalse(NodeUtil.isStatementBlock(new Node(Token.EXPR_RESULT)));

    Node block = new Node(Token.BLOCK);
    Node expr = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    block.addChildToBack(expr);
    Assert.assertTrue(NodeUtil.isStatement(expr));

    Assert.assertTrue(NodeUtil.isSwitchCase(new Node(Token.CASE)));
    Assert.assertTrue(NodeUtil.isSwitchCase(new Node(Token.DEFAULT)));
    Assert.assertFalse(NodeUtil.isSwitchCase(new Node(Token.SWITCH)));

    Assert.assertTrue(NodeUtil.isReferenceName(Node.newString(Token.NAME, "abc")));
    Assert.assertFalse(NodeUtil.isReferenceName(Node.newString(Token.NAME, "")));
    Assert.assertFalse(NodeUtil.isReferenceName(Node.newNumber(1)));

    Assert.assertTrue(NodeUtil.isLabelName(new Node(Token.LABEL_NAME)));
    Assert.assertFalse(NodeUtil.isLabelName(Node.newString(Token.NAME, "lbl")));
    Assert.assertFalse(NodeUtil.isLabelName(null));
  }

  @Test
  public void testRemoveChild_and_tryMergeBlock() {
    Node script = new Node(Token.SCRIPT);
    Node stmt1 = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    Node stmt2 = new Node(Token.EXPR_RESULT, Node.newNumber(2));
    script.addChildToBack(stmt1);
    script.addChildToBack(stmt2);

    NodeUtil.removeChild(script, stmt1);
    Assert.assertEquals(1, script.getChildCount());

    Node varParent = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node name1 = Node.newString(Token.NAME, "a");
    Node name2 = Node.newString(Token.NAME, "b");
    varNode.addChildToBack(name1);
    varNode.addChildToBack(name2);
    varParent.addChildToBack(varNode);

    NodeUtil.removeChild(varNode, name1);
    Assert.assertEquals(1, varNode.getChildCount());
    NodeUtil.removeChild(varNode, name2);
    Assert.assertEquals(0, varParent.getChildCount());

    Node blockParent = new Node(Token.BLOCK);
    Node innerBlock = new Node(Token.BLOCK, Node.newNumber(10));
    blockParent.addChildToBack(innerBlock);
    Assert.assertTrue(NodeUtil.tryMergeBlock(innerBlock));
    Assert.assertEquals(1, blockParent.getChildCount());
    Assert.assertEquals(Token.NUMBER, blockParent.getFirstChild().getType());
  }

  @Test
  public void testFunctions() {
    Node fn = NodeUtil.newFunctionNode("testFn", Collections.singletonList(Node.newString(Token.NAME, "p1")), new Node(Token.BLOCK), 1, 2);
    Assert.assertTrue(NodeUtil.isFunction(fn));
    Assert.assertEquals(Token.BLOCK, NodeUtil.getFunctionBody(fn).getType());
    Assert.assertEquals(Token.LP, NodeUtil.getFnParameters(fn).getType());

    Node script = new Node(Token.SCRIPT, fn);
    Assert.assertTrue(NodeUtil.isFunctionDeclaration(fn));
    Assert.assertTrue(NodeUtil.isHoistedFunctionDeclaration(fn));
    Assert.assertFalse(NodeUtil.isFunctionExpression(fn));
    Assert.assertFalse(NodeUtil.isEmptyFunctionExpression(fn));

    Node anonFn = NodeUtil.newFunctionNode("", Collections.<Node>emptyList(), new Node(Token.BLOCK), 1, 2);
    Node expr = new Node(Token.EXPR_RESULT, anonFn);
    Assert.assertTrue(NodeUtil.isFunctionExpression(anonFn));
    Assert.assertTrue(NodeUtil.isEmptyFunctionExpression(anonFn));

    Node varArgsFn = NodeUtil.newFunctionNode("varArgs", Collections.<Node>emptyList(),
        new Node(Token.BLOCK, Node.newString(Token.NAME, "arguments")), 1, 1);
    Assert.assertTrue(NodeUtil.isVarArgsFunction(varArgsFn));
  }

  @Test
  public void testMethodCalls() {
    Node callee = NodeUtil.newQualifiedNameNode("obj.call", 0, 0);
    Node call = new Node(Token.CALL, callee, Node.newNumber(1));
    Assert.assertTrue(NodeUtil.isObjectCallMethod(call, "call"));
    Assert.assertTrue(NodeUtil.isFunctionObjectCall(call));
    Assert.assertFalse(NodeUtil.isFunctionObjectApply(call));

    Node calleeApply = NodeUtil.newQualifiedNameNode("obj.apply", 0, 0);
    Node callApply = new Node(Token.CALL, calleeApply, Node.newNumber(1));
    Assert.assertTrue(NodeUtil.isFunctionObjectApply(callApply));

    Node calleeSimple = new Node(Token.GETPROP, Node.newString(Token.NAME, "fn"), Node.newString("call"));
    Node callSimple = new Node(Token.CALL, calleeSimple);
    Assert.assertTrue(NodeUtil.isSimpleFunctionObjectCall(callSimple));
  }

  @Test
  public void testIsLhs_and_isObjectLitKey() {
    Node lhs = Node.newString(Token.NAME, "x");
    Node rhs = Node.newNumber(1);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);
    Assert.assertTrue(NodeUtil.isLhs(lhs, assign));
    Assert.assertFalse(NodeUtil.isLhs(rhs, assign));

    Node k1 = Node.newString("key1");
    Node v1 = Node.newNumber(1);
    Node objLit = new Node(Token.OBJECTLIT, k1, v1);
    Assert.assertTrue(NodeUtil.isObjectLitKey(k1, objLit));
    Assert.assertFalse(NodeUtil.isObjectLitKey(v1, objLit));
  }

  @Test
  public void testOpToStr_and_opToStrNoFail() {
    Assert.assertEquals("+", NodeUtil.opToStr(Token.ADD));
    Assert.assertEquals("-", NodeUtil.opToStr(Token.SUB));
    Assert.assertEquals("===", NodeUtil.opToStr(Token.SHEQ));
    Assert.assertNull(NodeUtil.opToStr(Token.NAME));

    Assert.assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
  }

  @Test(expected = Error.class)
  public void testOpToStrNoFail_invalid() {
    NodeUtil.opToStrNoFail(Token.NAME);
  }

  @Test
  public void testPredicatesAndTraversals() {
    Node tree = new Node(Token.BLOCK,
        new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "target")),
        new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "other")),
        new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "target"))
    );

    Assert.assertTrue(NodeUtil.containsType(tree, Token.NAME));
    Assert.assertFalse(NodeUtil.containsType(tree, Token.WHILE));
    Assert.assertEquals(3, NodeUtil.getNodeTypeReferenceCount(tree, Token.NAME, Predicates.<Node>alwaysTrue()));
    Assert.assertTrue(NodeUtil.isNameReferenced(tree, "target"));
    Assert.assertFalse(NodeUtil.isNameReferenced(tree, "nonexistent"));
    Assert.assertEquals(2, NodeUtil.getNameReferenceCount(tree, "target"));

    final List<Integer> visited = new ArrayList<Integer>();
    NodeUtil.visitPreOrder(tree, new NodeUtil.Visitor() {
      public void visit(Node node) {
        visited.add(node.getType());
      }
    }, Predicates.<Node>alwaysTrue());
    Assert.assertFalse(visited.isEmpty());

    final List<Integer> postVisited = new ArrayList<Integer>();
    NodeUtil.visitPostOrder(tree, new NodeUtil.Visitor() {
      public void visit(Node node) {
        postVisited.add(node.getType());
      }
    }, Predicates.<Node>alwaysTrue());
    Assert.assertFalse(postVisited.isEmpty());
  }

  @Test
  public void testContainsFunction_and_referencesThis_and_containsCall() {
    Node root = new Node(Token.BLOCK, new Node(Token.THIS), new Node(Token.CALL, Node.newString(Token.NAME, "f")));
    Assert.assertTrue(NodeUtil.referencesThis(root));
    Assert.assertTrue(NodeUtil.containsCall(root));
    Assert.assertFalse(NodeUtil.containsFunction(root));

    Node fn = NodeUtil.newFunctionNode("f", Collections.<Node>emptyList(), new Node(Token.BLOCK), 0, 0);
    root.addChildToBack(fn);
    Assert.assertTrue(NodeUtil.containsFunction(root));
  }

  @Test
  public void testRedeclareVarsInsideBranch() {
    Node script = new Node(Token.SCRIPT);
    Node ifNode = new Node(Token.IF, Node.newNumber(1), new Node(Token.BLOCK));
    Node varNode = NodeUtil.newVarNode("declaredVar", Node.newNumber(10));
    ifNode.getLastChild().addChildToBack(varNode);
    script.addChildToBack(ifNode);

    Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(ifNode);
    Assert.assertEquals(1, vars.size());

    NodeUtil.redeclareVarsInsideBranch(ifNode);
    Assert.assertEquals(Token.VAR, script.getFirstChild().getType());
  }

  @Test
  public void testPrototypeHelpers() {
    Node qname = NodeUtil.newQualifiedNameNode("Foo.prototype.bar", 0, 0);
    Assert.assertTrue(NodeUtil.isPrototypeProperty(qname));
    Assert.assertEquals("bar", NodeUtil.getPrototypePropertyName(qname));
    Assert.assertEquals("Foo", NodeUtil.getPrototypeClassName(qname).getQualifiedName());

    Node exprAssign = new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN, qname, Node.newNumber(1)));
    Assert.assertTrue(NodeUtil.isPrototypePropertyDeclaration(exprAssign));
  }

  @Test
  public void testNewUndefinedNode_and_newCallNode() {
    Node basis = Node.newNumber(1);
    basis.setLineno(10);
    Node undef = NodeUtil.newUndefinedNode(basis);
    Assert.assertEquals(Token.VOID, undef.getType());
    Assert.assertEquals(10, undef.getLineno());

    Node callTarget = Node.newString(Token.NAME, "foo");
    Node call = NodeUtil.newCallNode(callTarget, Node.newNumber(1), Node.newNumber(2));
    Assert.assertEquals(Token.CALL, call.getType());
    Assert.assertTrue(call.getBooleanProp(Node.FREE_CALL));
    Assert.assertEquals(3, call.getChildCount());
  }

  @Test
  public void testLatin_and_validPropertyName() {
    Assert.assertTrue(NodeUtil.isLatin("abcXYZ123_$"));
    Assert.assertFalse(NodeUtil.isLatin("abc\u0100"));

    Assert.assertTrue(NodeUtil.isValidPropertyName("fooVar"));
    Assert.assertFalse(NodeUtil.isValidPropertyName("class"));
    Assert.assertFalse(NodeUtil.isValidPropertyName("123abc"));
    Assert.assertFalse(NodeUtil.isValidPropertyName("var\u0100"));
  }

  @Test
  public void testTryCatchFinally() {
    Node tryWithFinally = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), new Node(Token.BLOCK));
    Assert.assertTrue(NodeUtil.hasFinally(tryWithFinally));
    Assert.assertTrue(NodeUtil.isTryFinallyNode(tryWithFinally, tryWithFinally.getLastChild()));

    Node catchBlock = NodeUtil.getCatchBlock(tryWithFinally);
    Assert.assertEquals(tryWithFinally.getFirstChild().getNext(), catchBlock);
    Assert.assertFalse(NodeUtil.hasCatchHandler(catchBlock));

    catchBlock.addChildToBack(new Node(Token.CATCH, Node.newString(Token.NAME, "e"), new Node(Token.BLOCK)));
    Assert.assertTrue(NodeUtil.hasCatchHandler(catchBlock));
  }

  @Test
  public void testRootOfQualifiedName_and_debugInformation() {
    Node qname = NodeUtil.newQualifiedNameNode("a.b.c", 1, 1);
    Node root = NodeUtil.getRootOfQualifiedName(qname);
    Assert.assertEquals(Token.NAME, root.getType());
    Assert.assertEquals("a", root.getString());

    Node basis = Node.newString(Token.NAME, "oldName");
    basis.setSourceName("test.js");
    Node named = NodeUtil.newName("newName", basis, "orig");
    Assert.assertEquals("newName", named.getString());
    Assert.assertEquals("orig", named.getProp(Node.ORIGINALNAME_PROP));
    Assert.assertEquals("test.js", NodeUtil.getSourceName(named));

    Node qnameWithDebug = NodeUtil.newQualifiedNameNode("x.y", basis, "origQ");
    Assert.assertEquals("origQ", qnameWithDebug.getProp(Node.ORIGINALNAME_PROP));
  }

  @Test
  public void testJSDocHelpers() {
    Node fn = NodeUtil.newFunctionNode("f", Collections.<Node>emptyList(), new Node(Token.BLOCK), 0, 0);
    JSDocInfo info = new JSDocInfo();
    fn.setJSDocInfo(info);
    Assert.assertEquals(info, NodeUtil.getFunctionInfo(fn));

    Node nameNode = Node.newString(Token.NAME, "x");
    nameNode.setJSDocInfo(info);
    Assert.assertEquals(info, NodeUtil.getInfoForNameNode(nameNode));
    Assert.assertNull(NodeUtil.getInfoForNameNode(null));
  }

  @Test
  public void testEvaluatesToLocalValue() {
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(Node.newNumber(1)));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(Node.newString("s")));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.NEW, Node.newString(Token.NAME, "Object"))));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.ARRAYLIT)));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.OBJECTLIT)));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.IN)));

    Node assign = new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"), Node.newNumber(5));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(assign));

    Node inc = new Node(Token.INC, Node.newString(Token.NAME, "a"));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(inc));
    inc.putBooleanProp(Node.INCRDECR_PROP, true);
    Assert.assertFalse(NodeUtil.evaluatesToLocalValue(inc));
  }

  @Test
  public void testPredicatesClasses() {
    NodeUtil.MatchNodeType matchType = new NodeUtil.MatchNodeType(Token.NUMBER);
    Assert.assertTrue(matchType.apply(Node.newNumber(1)));
    Assert.assertFalse(matchType.apply(Node.newString("s")));

    NodeUtil.MatchNotFunction matchNotFn = new NodeUtil.MatchNotFunction();
    Assert.assertTrue(matchNotFn.apply(Node.newNumber(1)));
    Assert.assertFalse(matchNotFn.apply(new Node(Token.FUNCTION)));

    NodeUtil.MatchDeclaration matchDecl = new NodeUtil.MatchDeclaration();
    Assert.assertTrue(matchDecl.apply(new Node(Token.VAR)));
    Assert.assertFalse(matchDecl.apply(Node.newNumber(1)));

    NodeUtil.MatchShallowStatement matchStmt = new NodeUtil.MatchShallowStatement();
    Assert.assertTrue(matchStmt.apply(new Node(Token.BLOCK)));
    Assert.assertTrue(matchStmt.apply(Node.newNumber(1)));
  }

  @Test
  public void testIsConstantByConvention() {
    CodingConvention convention = new DefaultCodingConvention();
    Node nameConst = Node.newString(Token.NAME, "CONST_VAL");
    Node parent = new Node(Token.VAR, nameConst);
    Assert.assertTrue(NodeUtil.isConstantByConvention(convention, nameConst, parent));

    Node nameVar = Node.newString(Token.NAME, "normalVar");
    Assert.assertFalse(NodeUtil.isConstantByConvention(convention, nameVar, parent));
  }
}
