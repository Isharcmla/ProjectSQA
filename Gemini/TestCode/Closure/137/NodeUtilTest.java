package com.google.javascript.jscomp;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class NodeUtilTest {

  @Test
  public void testGetBooleanValue() {
    Assert.assertTrue(NodeUtil.getBooleanValue(Node.newString("hello")));
    Assert.assertFalse(NodeUtil.getBooleanValue(Node.newString("")));
    Assert.assertTrue(NodeUtil.getBooleanValue(Node.newNumber(1.0)));
    Assert.assertTrue(NodeUtil.getBooleanValue(Node.newNumber(-1.0)));
    Assert.assertFalse(NodeUtil.getBooleanValue(Node.newNumber(0.0)));
    Assert.assertFalse(NodeUtil.getBooleanValue(new Node(Token.NULL)));
    Assert.assertFalse(NodeUtil.getBooleanValue(new Node(Token.FALSE)));
    Assert.assertFalse(NodeUtil.getBooleanValue(new Node(Token.VOID)));

    Assert.assertFalse(NodeUtil.getBooleanValue(Node.newString(Token.NAME, "undefined")));
    Assert.assertFalse(NodeUtil.getBooleanValue(Node.newString(Token.NAME, "NaN")));
    Assert.assertTrue(NodeUtil.getBooleanValue(Node.newString(Token.NAME, "Infinity")));

    Assert.assertTrue(NodeUtil.getBooleanValue(new Node(Token.TRUE)));
    Assert.assertTrue(NodeUtil.getBooleanValue(new Node(Token.ARRAYLIT)));
    Assert.assertTrue(NodeUtil.getBooleanValue(new Node(Token.OBJECTLIT)));
    Assert.assertTrue(NodeUtil.getBooleanValue(new Node(Token.REGEXP)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetBooleanValue_nonLiteralName_throwsException() {
    NodeUtil.getBooleanValue(Node.newString(Token.NAME, "foo"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetBooleanValue_nonLiteralType_throwsException() {
    NodeUtil.getBooleanValue(new Node(Token.ADD));
  }

  @Test
  public void testGetStringValue() {
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
  public void testGetFunctionName() {
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "foo"), new Node(Token.LP), new Node(Token.BLOCK));
    Node nameParent = Node.newString(Token.NAME, "varName");
    Assert.assertEquals("varName", NodeUtil.getFunctionName(fn, nameParent));

    Node assign = new Node(Token.ASSIGN, NodeUtil.newQualifiedNameNode("a.b.c", 0, 0), fn);
    Assert.assertEquals("a.b.c", NodeUtil.getFunctionName(fn, assign));

    Node defaultParent = new Node(Token.EXPR_RESULT, fn);
    Assert.assertEquals("foo", NodeUtil.getFunctionName(fn, defaultParent));

    Node emptyNameFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Assert.assertNull(NodeUtil.getFunctionName(emptyNameFn, defaultParent));
  }

  @Test
  public void testIsImmutableValue() {
    Assert.assertTrue(NodeUtil.isImmutableValue(Node.newString("str")));
    Assert.assertTrue(NodeUtil.isImmutableValue(Node.newNumber(10)));
    Assert.assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    Assert.assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
    Assert.assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));
    Assert.assertTrue(NodeUtil.isImmutableValue(new Node(Token.VOID)));

    Node negNumber = new Node(Token.NEG, Node.newNumber(5));
    Assert.assertTrue(NodeUtil.isImmutableValue(negNumber));

    Node negName = new Node(Token.NEG, Node.newString(Token.NAME, "foo"));
    Assert.assertFalse(NodeUtil.isImmutableValue(negName));

    Assert.assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "undefined")));
    Assert.assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "Infinity")));
    Assert.assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "NaN")));
    Assert.assertFalse(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "other")));
    Assert.assertFalse(NodeUtil.isImmutableValue(new Node(Token.ARRAYLIT)));
  }

  @Test
  public void testIsLiteralValue() {
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newString("s"));
    Assert.assertTrue(NodeUtil.isLiteralValue(arrayLit));

    Node arrayLitNonConst = new Node(Token.ARRAYLIT, Node.newString(Token.NAME, "x"));
    Assert.assertFalse(NodeUtil.isLiteralValue(arrayLitNonConst));

    Node objLit = new Node(Token.OBJECTLIT, Node.newString("k"), Node.newNumber(2));
    Assert.assertTrue(NodeUtil.isLiteralValue(objLit));

    Node regexp = new Node(Token.REGEXP, Node.newString("pattern"));
    Assert.assertTrue(NodeUtil.isLiteralValue(regexp));

    Assert.assertTrue(NodeUtil.isLiteralValue(Node.newNumber(42)));
    Assert.assertFalse(NodeUtil.isLiteralValue(Node.newString(Token.NAME, "y")));
  }

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = Sets.newHashSet("MY_DEF", "ns.DEF");
    Assert.assertTrue(NodeUtil.isValidDefineValue(Node.newString("val"), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(Node.newNumber(12), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(new Node(Token.TRUE), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(new Node(Token.FALSE), defines));

    int[] unaryOps = new int[]{Token.BITAND, Token.BITNOT, Token.BITOR, Token.BITXOR, Token.NOT, Token.NEG};
    for (int op : unaryOps) {
      Node validUnary = new Node(op, Node.newNumber(1));
      Assert.assertTrue(NodeUtil.isValidDefineValue(validUnary, defines));
      Node invalidUnary = new Node(op, Node.newString(Token.NAME, "UNKNOWN"));
      Assert.assertFalse(NodeUtil.isValidDefineValue(invalidUnary, defines));
    }

    Assert.assertTrue(NodeUtil.isValidDefineValue(Node.newString(Token.NAME, "MY_DEF"), defines));
    Assert.assertFalse(NodeUtil.isValidDefineValue(Node.newString(Token.NAME, "UNKNOWN"), defines));

    Node getProp = NodeUtil.newQualifiedNameNode("ns.DEF", 0, 0);
    Assert.assertTrue(NodeUtil.isValidDefineValue(getProp, defines));

    Node invalidGetProp = NodeUtil.newQualifiedNameNode("ns.OTHER", 0, 0);
    Assert.assertFalse(NodeUtil.isValidDefineValue(invalidGetProp, defines));

    Assert.assertFalse(NodeUtil.isValidDefineValue(new Node(Token.ADD), defines));
  }

  @Test
  public void testIsEmptyBlock() {
    Assert.assertFalse(NodeUtil.isEmptyBlock(new Node(Token.EMPTY)));
    Assert.assertTrue(NodeUtil.isEmptyBlock(new Node(Token.BLOCK)));
    Assert.assertTrue(NodeUtil.isEmptyBlock(new Node(Token.BLOCK, new Node(Token.EMPTY), new Node(Token.EMPTY))));
    Assert.assertFalse(NodeUtil.isEmptyBlock(new Node(Token.BLOCK, Node.newNumber(1))));
  }

  @Test
  public void testIsSimpleOperatorType() {
    int[] simpleTypes = new int[]{
        Token.ADD, Token.BITAND, Token.BITNOT, Token.BITOR, Token.BITXOR,
        Token.COMMA, Token.DIV, Token.EQ, Token.GE, Token.GETELEM, Token.GETPROP,
        Token.GT, Token.INSTANCEOF, Token.LE, Token.LSH, Token.LT, Token.MOD,
        Token.MUL, Token.NE, Token.NOT, Token.RSH, Token.SHEQ, Token.SHNE,
        Token.SUB, Token.TYPEOF, Token.VOID, Token.POS, Token.NEG, Token.URSH
    };
    for (int type : simpleTypes) {
      Assert.assertTrue(NodeUtil.isSimpleOperatorType(type));
    }
    Assert.assertFalse(NodeUtil.isSimpleOperatorType(Token.FUNCTION));
    Assert.assertFalse(NodeUtil.isSimpleOperatorType(Token.VAR));
  }

  @Test
  public void testNewExpr() {
    Node child = Node.newNumber(10);
    Node expr = NodeUtil.newExpr(child);
    Assert.assertEquals(Token.EXPR_RESULT, expr.getType());
    Assert.assertSame(child, expr.getFirstChild());
  }

  @Test
  public void testMayEffectMutableStateAndMayHaveSideEffects() {
    Node number = Node.newNumber(1);
    Assert.assertFalse(NodeUtil.mayEffectMutableState(number));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(number));

    Node throwNode = new Node(Token.THROW, Node.newString("err"));
    Assert.assertTrue(NodeUtil.mayEffectMutableState(throwNode));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(throwNode));

    Node arrayLit = new Node(Token.ARRAYLIT);
    Assert.assertTrue(NodeUtil.mayEffectMutableState(arrayLit));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(arrayLit));

    Node objLit = new Node(Token.OBJECTLIT);
    Assert.assertTrue(NodeUtil.mayEffectMutableState(objLit));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(objLit));

    Node regexp = new Node(Token.REGEXP);
    Assert.assertTrue(NodeUtil.mayEffectMutableState(regexp));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(regexp));

    Node emptyVar = new Node(Token.VAR);
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(emptyVar));
    Node varWithChild = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(varWithChild));

    Node emptyName = Node.newString(Token.NAME, "x");
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(emptyName));
    Node nameWithChild = Node.newString(Token.NAME, "x");
    nameWithChild.addChildToBack(Node.newNumber(1));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(nameWithChild));

    Node anonFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node exprAnonFn = new Node(Token.EXPR_RESULT, anonFn);
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(exprAnonFn));

    Node script = new Node(Token.SCRIPT);
    Node namedFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
    script.addChildToBack(namedFn);
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(namedFn));

    Node newNoSideEffect = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(newNoSideEffect));
    Assert.assertTrue(NodeUtil.mayEffectMutableState(newNoSideEffect));

    Node newCustom = new Node(Token.NEW, Node.newString(Token.NAME, "CustomClass"));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(newCustom));

    Node newNoSideEffectCallProp = new Node(Token.NEW, Node.newString(Token.NAME, "CustomClass"));
    newNoSideEffectCallProp.setIsNoSideEffectsCall();
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(newNoSideEffectCallProp));

    Node callNoSideEffect = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
    callNoSideEffect.setIsNoSideEffectsCall();
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(callNoSideEffect));

    Node callNormal = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(callNormal));

    Node assignLhsLiteral = new Node(Token.ASSIGN, new Node(Token.GETELEM, new Node(Token.ARRAYLIT), Node.newNumber(0)), Node.newNumber(1));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(assignLhsLiteral));

    Node assignLhsName = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(1));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(assignLhsName));

    Node assignRhsSideEffect = new Node(Token.ASSIGN, new Node(Token.GETELEM, new Node(Token.ARRAYLIT), Node.newNumber(0)), new Node(Token.CALL, Node.newString(Token.NAME, "f")));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(assignRhsSideEffect));

    Node complexConstructExpr = new Node(Token.NEW, new Node(Token.HOOK, new Node(Token.TRUE), Node.newString(Token.NAME, "Array"), Node.newString(Token.NAME, "Object")));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(complexConstructExpr));

    Node simpleOpWithChildSideEffect = new Node(Token.ADD, Node.newNumber(1), new Node(Token.CALL, Node.newString(Token.NAME, "f")));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(simpleOpWithChildSideEffect));

    Node unknownOp = new Node(Token.DELPROP, Node.newString(Token.NAME, "x"));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(unknownOp));
  }

  @Test
  public void testConstructorCallHasSideEffects() {
    Node newArray = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
    Assert.assertFalse(NodeUtil.constructorCallHasSideEffects(newArray));

    Node newDate = new Node(Token.NEW, Node.newString(Token.NAME, "Date"));
    Assert.assertFalse(NodeUtil.constructorCallHasSideEffects(newDate));

    Node newCustom = new Node(Token.NEW, Node.newString(Token.NAME, "MyClass"));
    Assert.assertTrue(NodeUtil.constructorCallHasSideEffects(newCustom));

    Node newMarked = new Node(Token.NEW, Node.newString(Token.NAME, "MyClass"));
    newMarked.setIsNoSideEffectsCall();
    Assert.assertFalse(NodeUtil.constructorCallHasSideEffects(newMarked));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorCallHasSideEffects_notNew_throwsException() {
    NodeUtil.constructorCallHasSideEffects(new Node(Token.CALL));
  }

  @Test
  public void testFunctionCallHasSideEffects() {
    Node callMarked = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    callMarked.setIsNoSideEffectsCall();
    Assert.assertFalse(NodeUtil.functionCallHasSideEffects(callMarked));

    Node callString = new Node(Token.CALL, Node.newString(Token.NAME, "String"));
    Assert.assertFalse(NodeUtil.functionCallHasSideEffects(callString));

    Node callOtherName = new Node(Token.CALL, Node.newString(Token.NAME, "other"));
    Assert.assertTrue(NodeUtil.functionCallHasSideEffects(callOtherName));

    Node mathSin = new Node(Token.GETPROP, Node.newString(Token.NAME, "Math"), Node.newString("sin"));
    Node callMath = new Node(Token.CALL, mathSin);
    Assert.assertFalse(NodeUtil.functionCallHasSideEffects(callMath));

    Node otherProp = new Node(Token.GETPROP, Node.newString(Token.NAME, "MyMath"), Node.newString("sin"));
    Node callOtherProp = new Node(Token.CALL, otherProp);
    Assert.assertTrue(NodeUtil.functionCallHasSideEffects(callOtherProp));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFunctionCallHasSideEffects_notCall_throwsException() {
    NodeUtil.functionCallHasSideEffects(new Node(Token.NEW));
  }

  @Test
  public void testNodeTypeMayHaveSideEffects() {
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.ASSIGN)));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.CALL)));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DELPROP)));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.NEW)));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DEC)));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.INC)));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.THROW)));

    Node nameWithChild = Node.newString(Token.NAME, "x");
    nameWithChild.addChildToBack(Node.newNumber(1));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameWithChild));

    Node nameWithoutChild = Node.newString(Token.NAME, "x");
    Assert.assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(nameWithoutChild));
    Assert.assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.NUMBER)));
  }

  @Test
  public void testCanBeSideEffected() {
    Assert.assertTrue(NodeUtil.canBeSideEffected(new Node(Token.CALL)));
    Assert.assertTrue(NodeUtil.canBeSideEffected(new Node(Token.NEW)));
    Assert.assertTrue(NodeUtil.canBeSideEffected(new Node(Token.GETPROP)));
    Assert.assertTrue(NodeUtil.canBeSideEffected(new Node(Token.GETELEM)));

    Node nonConstName = Node.newString(Token.NAME, "x");
    Assert.assertTrue(NodeUtil.canBeSideEffected(nonConstName));

    Node constPropName = Node.newString(Token.NAME, "x");
    constPropName.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    Assert.assertFalse(NodeUtil.canBeSideEffected(constPropName));

    Assert.assertFalse(NodeUtil.canBeSideEffected(nonConstName, ImmutableSet.of("x")));
    Assert.assertTrue(NodeUtil.canBeSideEffected(nonConstName, ImmutableSet.of("y")));

    Node binOp = new Node(Token.ADD, Node.newNumber(1), new Node(Token.CALL));
    Assert.assertTrue(NodeUtil.canBeSideEffected(binOp));

    Node safeBinOp = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
    Assert.assertFalse(NodeUtil.canBeSideEffected(safeBinOp));
  }

  @Test
  public void testPrecedence() {
    Assert.assertEquals(0, NodeUtil.precedence(Token.COMMA));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN_BITOR));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN_BITXOR));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN_BITAND));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN_LSH));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN_RSH));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN_URSH));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN_ADD));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN_SUB));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN_MUL));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN_DIV));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN_MOD));
    Assert.assertEquals(2, NodeUtil.precedence(Token.HOOK));
    Assert.assertEquals(3, NodeUtil.precedence(Token.OR));
    Assert.assertEquals(4, NodeUtil.precedence(Token.AND));
    Assert.assertEquals(5, NodeUtil.precedence(Token.BITOR));
    Assert.assertEquals(6, NodeUtil.precedence(Token.BITXOR));
    Assert.assertEquals(7, NodeUtil.precedence(Token.BITAND));
    Assert.assertEquals(8, NodeUtil.precedence(Token.EQ));
    Assert.assertEquals(8, NodeUtil.precedence(Token.NE));
    Assert.assertEquals(8, NodeUtil.precedence(Token.SHEQ));
    Assert.assertEquals(8, NodeUtil.precedence(Token.SHNE));
    Assert.assertEquals(9, NodeUtil.precedence(Token.LT));
    Assert.assertEquals(9, NodeUtil.precedence(Token.GT));
    Assert.assertEquals(9, NodeUtil.precedence(Token.LE));
    Assert.assertEquals(9, NodeUtil.precedence(Token.GE));
    Assert.assertEquals(9, NodeUtil.precedence(Token.INSTANCEOF));
    Assert.assertEquals(9, NodeUtil.precedence(Token.IN));
    Assert.assertEquals(10, NodeUtil.precedence(Token.LSH));
    Assert.assertEquals(10, NodeUtil.precedence(Token.RSH));
    Assert.assertEquals(10, NodeUtil.precedence(Token.URSH));
    Assert.assertEquals(11, NodeUtil.precedence(Token.SUB));
    Assert.assertEquals(11, NodeUtil.precedence(Token.ADD));
    Assert.assertEquals(12, NodeUtil.precedence(Token.MUL));
    Assert.assertEquals(12, NodeUtil.precedence(Token.MOD));
    Assert.assertEquals(12, NodeUtil.precedence(Token.DIV));
    Assert.assertEquals(13, NodeUtil.precedence(Token.INC));
    Assert.assertEquals(13, NodeUtil.precedence(Token.DEC));
    Assert.assertEquals(13, NodeUtil.precedence(Token.NEW));
    Assert.assertEquals(13, NodeUtil.precedence(Token.DELPROP));
    Assert.assertEquals(13, NodeUtil.precedence(Token.TYPEOF));
    Assert.assertEquals(13, NodeUtil.precedence(Token.VOID));
    Assert.assertEquals(13, NodeUtil.precedence(Token.NOT));
    Assert.assertEquals(13, NodeUtil.precedence(Token.BITNOT));
    Assert.assertEquals(13, NodeUtil.precedence(Token.POS));
    Assert.assertEquals(13, NodeUtil.precedence(Token.NEG));
    Assert.assertEquals(15, NodeUtil.precedence(Token.ARRAYLIT));
    Assert.assertEquals(15, NodeUtil.precedence(Token.CALL));
    Assert.assertEquals(15, NodeUtil.precedence(Token.EMPTY));
    Assert.assertEquals(15, NodeUtil.precedence(Token.FALSE));
    Assert.assertEquals(15, NodeUtil.precedence(Token.FUNCTION));
    Assert.assertEquals(15, NodeUtil.precedence(Token.GETELEM));
    Assert.assertEquals(15, NodeUtil.precedence(Token.GETPROP));
    Assert.assertEquals(15, NodeUtil.precedence(Token.GET_REF));
    Assert.assertEquals(15, NodeUtil.precedence(Token.IF));
    Assert.assertEquals(15, NodeUtil.precedence(Token.LP));
    Assert.assertEquals(15, NodeUtil.precedence(Token.NAME));
    Assert.assertEquals(15, NodeUtil.precedence(Token.NULL));
    Assert.assertEquals(15, NodeUtil.precedence(Token.NUMBER));
    Assert.assertEquals(15, NodeUtil.precedence(Token.OBJECTLIT));
    Assert.assertEquals(15, NodeUtil.precedence(Token.REGEXP));
    Assert.assertEquals(15, NodeUtil.precedence(Token.RETURN));
    Assert.assertEquals(15, NodeUtil.precedence(Token.STRING));
    Assert.assertEquals(15, NodeUtil.precedence(Token.THIS));
    Assert.assertEquals(15, NodeUtil.precedence(Token.TRUE));
  }

  @Test(expected = Error.class)
  public void testPrecedence_unknown_throwsError() {
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
  public void testIsAssignmentOpAndGetOpFromAssignmentOp() {
    int[] assignTokens = new int[]{
        Token.ASSIGN, Token.ASSIGN_BITOR, Token.ASSIGN_BITXOR, Token.ASSIGN_BITAND,
        Token.ASSIGN_LSH, Token.ASSIGN_RSH, Token.ASSIGN_URSH, Token.ASSIGN_ADD,
        Token.ASSIGN_SUB, Token.ASSIGN_MUL, Token.ASSIGN_DIV, Token.ASSIGN_MOD
    };
    for (int t : assignTokens) {
      Assert.assertTrue(NodeUtil.isAssignmentOp(new Node(t)));
    }
    Assert.assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));

    Assert.assertEquals(Token.BITOR, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITOR)));
    Assert.assertEquals(Token.BITXOR, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITXOR)));
    Assert.assertEquals(Token.BITAND, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITAND)));
    Assert.assertEquals(Token.LSH, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_LSH)));
    Assert.assertEquals(Token.RSH, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_RSH)));
    Assert.assertEquals(Token.URSH, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_URSH)));
    Assert.assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_ADD)));
    Assert.assertEquals(Token.SUB, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_SUB)));
    Assert.assertEquals(Token.MUL, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_MUL)));
    Assert.assertEquals(Token.DIV, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_DIV)));
    Assert.assertEquals(Token.MOD, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_MOD)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetOpFromAssignmentOp_nonAssignOp_throwsException() {
    NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN));
  }

  @Test
  public void testSimpleTypePredicates() {
    Assert.assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT)));
    Assert.assertFalse(NodeUtil.isExpressionNode(new Node(Token.VAR)));

    Assert.assertTrue(NodeUtil.referencesThis(new Node(Token.ADD, new Node(Token.THIS), Node.newNumber(1))));
    Assert.assertFalse(NodeUtil.referencesThis(Node.newNumber(1)));

    Assert.assertTrue(NodeUtil.isGet(new Node(Token.GETPROP)));
    Assert.assertTrue(NodeUtil.isGet(new Node(Token.GETELEM)));
    Assert.assertFalse(NodeUtil.isGet(new Node(Token.NAME)));

    Assert.assertTrue(NodeUtil.isGetProp(new Node(Token.GETPROP)));
    Assert.assertFalse(NodeUtil.isGetProp(new Node(Token.GETELEM)));

    Assert.assertTrue(NodeUtil.isName(Node.newString(Token.NAME, "a")));
    Assert.assertFalse(NodeUtil.isName(Node.newString("a")));

    Assert.assertTrue(NodeUtil.isNew(new Node(Token.NEW)));
    Assert.assertFalse(NodeUtil.isNew(new Node(Token.CALL)));

    Assert.assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
    Assert.assertFalse(NodeUtil.isVar(new Node(Token.NAME)));

    Assert.assertTrue(NodeUtil.isString(Node.newString("s")));
    Assert.assertFalse(NodeUtil.isString(Node.newNumber(1)));

    Assert.assertTrue(NodeUtil.isAssign(new Node(Token.ASSIGN)));
    Assert.assertFalse(NodeUtil.isAssign(new Node(Token.ADD)));

    Assert.assertTrue(NodeUtil.isCall(new Node(Token.CALL)));
    Assert.assertFalse(NodeUtil.isCall(new Node(Token.NEW)));

    Assert.assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
    Assert.assertFalse(NodeUtil.isFunction(new Node(Token.BLOCK)));

    Assert.assertTrue(NodeUtil.isThis(new Node(Token.THIS)));
    Assert.assertFalse(NodeUtil.isThis(Node.newString(Token.NAME, "this")));

    Assert.assertTrue(NodeUtil.containsCall(new Node(Token.EXPR_RESULT, new Node(Token.CALL))));
    Assert.assertFalse(NodeUtil.containsCall(new Node(Token.EXPR_RESULT, Node.newNumber(1))));

    Assert.assertTrue(NodeUtil.isExprAssign(new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN))));
    Assert.assertFalse(NodeUtil.isExprAssign(new Node(Token.EXPR_RESULT, Node.newNumber(1))));
    Assert.assertFalse(NodeUtil.isExprAssign(new Node(Token.VAR)));

    Assert.assertTrue(NodeUtil.isExprCall(new Node(Token.EXPR_RESULT, new Node(Token.CALL))));
    Assert.assertFalse(NodeUtil.isExprCall(new Node(Token.EXPR_RESULT, Node.newNumber(1))));
    Assert.assertFalse(NodeUtil.isExprCall(new Node(Token.BLOCK)));
  }

  @Test
  public void testIsVarDeclarationAndGetAssignedValue() {
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "x");
    Node valueNode = Node.newNumber(42);
    nameNode.addChildToBack(valueNode);
    varNode.addChildToBack(nameNode);

    Assert.assertTrue(NodeUtil.isVarDeclaration(nameNode));
    Assert.assertSame(valueNode, NodeUtil.getAssignedValue(nameNode));

    Node assignLhs = Node.newString(Token.NAME, "y");
    Node assignRhs = Node.newString("val");
    Node assignNode = new Node(Token.ASSIGN, assignLhs, assignRhs);
    Assert.assertFalse(NodeUtil.isVarDeclaration(assignLhs));
    Assert.assertSame(assignRhs, NodeUtil.getAssignedValue(assignLhs));

    Node standaloneName = Node.newString(Token.NAME, "z");
    Node expr = new Node(Token.EXPR_RESULT, standaloneName);
    Assert.assertNull(NodeUtil.getAssignedValue(standaloneName));
  }

  @Test
  public void testIsForIn() {
    Node forIn = new Node(Token.FOR, Node.newString(Token.NAME, "i"), Node.newString(Token.NAME, "obj"), new Node(Token.BLOCK));
    Assert.assertTrue(NodeUtil.isForIn(forIn));

    Node standardFor = new Node(Token.FOR, new Node(Token.VAR), Node.newNumber(1), Node.newNumber(2), new Node(Token.BLOCK));
    Assert.assertFalse(NodeUtil.isForIn(standardFor));
    Assert.assertFalse(NodeUtil.isForIn(new Node(Token.WHILE)));
  }

  @Test
  public void testIsLoopStructureAndGetLoopCodeBlock() {
    Node block = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.EMPTY), block);
    Node whileNode = new Node(Token.WHILE, new Node(Token.TRUE), block);
    Node doNode = new Node(Token.DO, block, new Node(Token.TRUE));

    Assert.assertTrue(NodeUtil.isLoopStructure(forNode));
    Assert.assertTrue(NodeUtil.isLoopStructure(whileNode));
    Assert.assertTrue(NodeUtil.isLoopStructure(doNode));
    Assert.assertFalse(NodeUtil.isLoopStructure(new Node(Token.IF)));

    Assert.assertSame(block, NodeUtil.getLoopCodeBlock(forNode));
    Assert.assertSame(block, NodeUtil.getLoopCodeBlock(whileNode));
    Assert.assertSame(block, NodeUtil.getLoopCodeBlock(doNode));
    Assert.assertNull(NodeUtil.getLoopCodeBlock(new Node(Token.IF)));
  }

  @Test
  public void testIsControlStructureAndCodeBlock() {
    int[] controlTypes = new int[]{
        Token.FOR, Token.DO, Token.WHILE, Token.WITH, Token.IF, Token.LABEL,
        Token.TRY, Token.CATCH, Token.SWITCH, Token.CASE, Token.DEFAULT
    };
    for (int t : controlTypes) {
      Assert.assertTrue(NodeUtil.isControlStructure(new Node(t)));
    }
    Assert.assertFalse(NodeUtil.isControlStructure(new Node(Token.VAR)));

    Node block = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR, new Node(Token.EMPTY), block);
    Assert.assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, block));

    Node doNode = new Node(Token.DO, block, new Node(Token.TRUE));
    Assert.assertTrue(NodeUtil.isControlStructureCodeBlock(doNode, block));

    Node ifNode = new Node(Token.IF, new Node(Token.TRUE), block);
    Assert.assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, ifNode.getFirstChild()));
    Assert.assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, block));

    Node tryCatchFinally = new Node(Token.TRY, block, new Node(Token.BLOCK), new Node(Token.BLOCK));
    Assert.assertTrue(NodeUtil.isControlStructureCodeBlock(tryCatchFinally, block));
    Assert.assertTrue(NodeUtil.isControlStructureCodeBlock(tryCatchFinally, tryCatchFinally.getLastChild()));
    Assert.assertFalse(NodeUtil.isControlStructureCodeBlock(tryCatchFinally, tryCatchFinally.getFirstChild().getNext()));

    Node catchNode = new Node(Token.CATCH, Node.newString(Token.NAME, "e"), block);
    Assert.assertTrue(NodeUtil.isControlStructureCodeBlock(catchNode, block));

    Node switchNode = new Node(Token.SWITCH, Node.newString(Token.NAME, "val"), block);
    Assert.assertFalse(NodeUtil.isControlStructureCodeBlock(switchNode, switchNode.getFirstChild()));
    Assert.assertTrue(NodeUtil.isControlStructureCodeBlock(switchNode, block));

    Node defaultNode = new Node(Token.DEFAULT, block);
    Assert.assertTrue(NodeUtil.isControlStructureCodeBlock(defaultNode, block));
  }

  @Test
  public void testGetConditionExpression() {
    Node cond = new Node(Token.TRUE);
    Node block = new Node(Token.BLOCK);

    Node ifNode = new Node(Token.IF, cond, block);
    Assert.assertSame(cond, NodeUtil.getConditionExpression(ifNode));

    Node whileNode = new Node(Token.WHILE, cond, block);
    Assert.assertSame(cond, NodeUtil.getConditionExpression(whileNode));

    Node doNode = new Node(Token.DO, block, cond);
    Assert.assertSame(cond, NodeUtil.getConditionExpression(doNode));

    Node forNode4 = new Node(Token.FOR, new Node(Token.VAR), cond, new Node(Token.INC), block);
    Assert.assertSame(cond, NodeUtil.getConditionExpression(forNode4));

    Node forNode3 = new Node(Token.FOR, new Node(Token.VAR), Node.newString(Token.NAME, "obj"), block);
    Assert.assertNull(NodeUtil.getConditionExpression(forNode3));

    Node caseNode = new Node(Token.CASE, cond, block);
    Assert.assertNull(NodeUtil.getConditionExpression(caseNode));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_malformedFor_throwsException() {
    Node forNode2 = new Node(Token.FOR, new Node(Token.VAR), new Node(Token.BLOCK));
    NodeUtil.getConditionExpression(forNode2);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_nonConditional_throwsException() {
    NodeUtil.getConditionExpression(new Node(Token.VAR));
  }

  @Test
  public void testIsStatementBlockAndIsStatement() {
    Node script = new Node(Token.SCRIPT);
    Node block = new Node(Token.BLOCK);
    Assert.assertTrue(NodeUtil.isStatementBlock(script));
    Assert.assertTrue(NodeUtil.isStatementBlock(block));
    Assert.assertFalse(NodeUtil.isStatementBlock(new Node(Token.EXPR_RESULT)));

    Node stmt = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    block.addChildToBack(stmt);
    Assert.assertTrue(NodeUtil.isStatement(stmt));

    Node exprInExpr = Node.newNumber(1);
    Node parentExpr = new Node(Token.EXPR_RESULT, exprInExpr);
    Assert.assertFalse(NodeUtil.isStatement(exprInExpr));

    Node label = new Node(Token.LABEL, Node.newString(Token.NAME, "lbl"), stmt);
    Assert.assertTrue(NodeUtil.isStatement(stmt));
  }

  @Test(expected = IllegalStateException.class)
  public void testIsStatement_noParent_throwsException() {
    NodeUtil.isStatement(new Node(Token.EXPR_RESULT));
  }

  @Test
  public void testIsSwitchCase() {
    Assert.assertTrue(NodeUtil.isSwitchCase(new Node(Token.CASE)));
    Assert.assertTrue(NodeUtil.isSwitchCase(new Node(Token.DEFAULT)));
    Assert.assertFalse(NodeUtil.isSwitchCase(new Node(Token.SWITCH)));
  }

  @Test
  public void testIsLabelName() {
    Node labelName = Node.newString(Token.NAME, "myLabel");
    Node labelNode = new Node(Token.LABEL, labelName, new Node(Token.BLOCK));
    Assert.assertTrue(NodeUtil.isLabelName(labelName));

    Node breakName = Node.newString(Token.NAME, "myLabel");
    Node breakNode = new Node(Token.BREAK, breakName);
    Assert.assertTrue(NodeUtil.isLabelName(breakName));

    Node continueName = Node.newString(Token.NAME, "myLabel");
    Node continueNode = new Node(Token.CONTINUE, continueName);
    Assert.assertTrue(NodeUtil.isLabelName(continueName));

    Node otherName = Node.newString(Token.NAME, "varName");
    Node varNode = new Node(Token.VAR, otherName);
    Assert.assertFalse(NodeUtil.isLabelName(otherName));
    Assert.assertFalse(NodeUtil.isLabelName(null));
  }

  @Test
  public void testIsTryFinallyNodeAndHasFinallyAndCatchBlock() {
    Node tryBlock = new Node(Token.BLOCK);
    Node catchBlock = new Node(Token.BLOCK, new Node(Token.CATCH, Node.newString(Token.NAME, "e"), new Node(Token.BLOCK)));
    Node finallyBlock = new Node(Token.BLOCK);
    Node tryNode3 = new Node(Token.TRY, tryBlock, catchBlock, finallyBlock);

    Assert.assertTrue(NodeUtil.isTryFinallyNode(tryNode3, finallyBlock));
    Assert.assertFalse(NodeUtil.isTryFinallyNode(tryNode3, catchBlock));
    Assert.assertTrue(NodeUtil.hasFinally(tryNode3));
    Assert.assertSame(catchBlock, NodeUtil.getCatchBlock(tryNode3));
    Assert.assertTrue(NodeUtil.hasCatchHandler(catchBlock));

    Node emptyCatchBlock = new Node(Token.BLOCK);
    Assert.assertFalse(NodeUtil.hasCatchHandler(emptyCatchBlock));

    Node tryNode2 = new Node(Token.TRY, tryBlock, catchBlock);
    Assert.assertFalse(NodeUtil.hasFinally(tryNode2));
  }

  @Test
  public void testRemoveChild() {
    Node script = new Node(Token.SCRIPT);
    Node stmt1 = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    Node stmt2 = new Node(Token.EXPR_RESULT, Node.newNumber(2));
    script.addChildToBack(stmt1);
    script.addChildToBack(stmt2);
    NodeUtil.removeChild(script, stmt1);
    Assert.assertEquals(1, script.getChildCount());

    Node blockParent = new Node(Token.SCRIPT);
    Node innerBlock = new Node(Token.BLOCK, Node.newNumber(10));
    blockParent.addChildToBack(innerBlock);
    NodeUtil.removeChild(blockParent, innerBlock);
    Assert.assertFalse(innerBlock.hasChildren());

    Node varParent = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    varParent.addChildToBack(varNode);
    NodeUtil.removeChild(varNode, varNode.getFirstChild());
    Assert.assertEquals(1, varNode.getChildCount());
    NodeUtil.removeChild(varNode, varNode.getFirstChild());
    Assert.assertEquals(0, varParent.getChildCount());

    Node labelParent = new Node(Token.SCRIPT);
    Node labelStmt = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    Node label = new Node(Token.LABEL, Node.newString(Token.NAME, "l"), labelStmt);
    labelParent.addChildToBack(label);
    NodeUtil.removeChild(label, labelStmt);
    Assert.assertEquals(0, labelParent.getChildCount());

    Node forNode = new Node(Token.FOR, new Node(Token.VAR), Node.newNumber(1), new Node(Token.INC), new Node(Token.BLOCK));
    Node forInit = forNode.getFirstChild();
    NodeUtil.removeChild(forNode, forInit);
    Assert.assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testRemoveChild_invalidAttempt_throwsException() {
    Node add = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
    NodeUtil.removeChild(add, add.getFirstChild());
  }

  @Test
  public void testTryMergeBlock() {
    Node script = new Node(Token.SCRIPT);
    Node innerBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1)));
    script.addChildToBack(innerBlock);
    Assert.assertTrue(NodeUtil.tryMergeBlock(innerBlock));
    Assert.assertEquals(1, script.getChildCount());
    Assert.assertEquals(Token.EXPR_RESULT, script.getFirstChild().getType());

    Node label = new Node(Token.LABEL, Node.newString(Token.NAME, "lbl"));
    Node singleBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(2)));
    label.addChildToBack(singleBlock);
    Assert.assertTrue(NodeUtil.tryMergeBlock(singleBlock));
    Assert.assertEquals(Token.EXPR_RESULT, label.getLastChild().getType());

    Node ifNode = new Node(Token.IF, new Node(Token.TRUE), new Node(Token.BLOCK));
    Assert.assertFalse(NodeUtil.tryMergeBlock(ifNode.getLastChild()));
  }

  @Test
  public void testFunctionPropertiesAndHelpers() {
    Node body = new Node(Token.BLOCK);
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "foo"), new Node(Token.LP), body);
    Assert.assertSame(body, NodeUtil.getFunctionBody(fn));
    Assert.assertEquals(Token.LP, NodeUtil.getFnParameters(fn).getType());

    Node script = new Node(Token.SCRIPT, fn);
    Assert.assertTrue(NodeUtil.isFunctionDeclaration(fn));
    Assert.assertTrue(NodeUtil.isHoistedFunctionDeclaration(fn));
    Assert.assertFalse(NodeUtil.isAnonymousFunction(fn));

    Node anonFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node expr = new Node(Token.EXPR_RESULT, anonFn);
    Assert.assertFalse(NodeUtil.isFunctionDeclaration(anonFn));
    Assert.assertFalse(NodeUtil.isHoistedFunctionDeclaration(anonFn));
    Assert.assertTrue(NodeUtil.isAnonymousFunction(anonFn));
  }

  @Test
  public void testIsVarArgsFunction() {
    Node bodyWithArgs = new Node(Token.BLOCK, Node.newString(Token.NAME, "arguments"));
    Node fnWithArgs = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), bodyWithArgs);
    Assert.assertTrue(NodeUtil.isVarArgsFunction(fnWithArgs));

    Node bodyWithoutArgs = new Node(Token.BLOCK, Node.newString(Token.NAME, "x"));
    Node fnWithoutArgs = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), bodyWithoutArgs);
    Assert.assertFalse(NodeUtil.isVarArgsFunction(fnWithoutArgs));
  }

  @Test
  public void testObjectCallMethods() {
    Node callTarget = NodeUtil.newQualifiedNameNode("foo.call", 0, 0);
    Node callNode = new Node(Token.CALL, callTarget);
    Assert.assertTrue(NodeUtil.isObjectCallMethod(callNode, "call"));
    Assert.assertTrue(NodeUtil.isFunctionObjectCall(callNode));
    Assert.assertTrue(NodeUtil.isSimpleFunctionObjectCall(callNode));
    Assert.assertFalse(NodeUtil.isFunctionObjectApply(callNode));

    Node applyTarget = NodeUtil.newQualifiedNameNode("foo.bar.apply", 0, 0);
    Node applyNode = new Node(Token.CALL, applyTarget);
    Assert.assertTrue(NodeUtil.isFunctionObjectApply(applyNode));
    Assert.assertFalse(NodeUtil.isSimpleFunctionObjectCall(applyNode));

    Assert.assertFalse(NodeUtil.isObjectCallMethod(new Node(Token.VAR), "call"));
  }

  @Test
  public void testIsLhs() {
    Node lhs = Node.newString(Token.NAME, "x");
    Node rhs = Node.newNumber(1);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);
    Assert.assertTrue(NodeUtil.isLhs(lhs, assign));
    Assert.assertFalse(NodeUtil.isLhs(rhs, assign));

    Node var = new Node(Token.VAR, lhs);
    Assert.assertTrue(NodeUtil.isLhs(lhs, var));
    Assert.assertFalse(NodeUtil.isLhs(lhs, new Node(Token.EXPR_RESULT, lhs)));
  }

  @Test
  public void testIsObjectLitKey() {
    Node key1 = Node.newString("a");
    Node val1 = Node.newNumber(1);
    Node key2 = Node.newString("b");
    Node val2 = Node.newNumber(2);
    Node objLit = new Node(Token.OBJECTLIT, key1, val1, key2, val2);

    Assert.assertTrue(NodeUtil.isObjectLitKey(key1, objLit));
    Assert.assertFalse(NodeUtil.isObjectLitKey(val1, objLit));
    Assert.assertTrue(NodeUtil.isObjectLitKey(key2, objLit));
    Assert.assertFalse(NodeUtil.isObjectLitKey(val2, objLit));

    Node notInObj = Node.newString("c");
    Assert.assertFalse(NodeUtil.isObjectLitKey(notInObj, objLit));
    Assert.assertFalse(NodeUtil.isObjectLitKey(key1, new Node(Token.ARRAYLIT)));
  }

  @Test
  public void testOpToStrAndNoFail() {
    int[] ops = new int[]{
        Token.BITOR, Token.OR, Token.BITXOR, Token.AND, Token.BITAND,
        Token.SHEQ, Token.EQ, Token.NOT, Token.NE, Token.SHNE,
        Token.LSH, Token.IN, Token.LE, Token.LT, Token.URSH,
        Token.RSH, Token.GE, Token.GT, Token.MUL, Token.DIV,
        Token.MOD, Token.BITNOT, Token.ADD, Token.SUB, Token.POS,
        Token.NEG, Token.ASSIGN, Token.ASSIGN_BITOR, Token.ASSIGN_BITXOR,
        Token.ASSIGN_BITAND, Token.ASSIGN_LSH, Token.ASSIGN_RSH,
        Token.ASSIGN_URSH, Token.ASSIGN_ADD, Token.ASSIGN_SUB,
        Token.ASSIGN_MUL, Token.ASSIGN_DIV, Token.ASSIGN_MOD,
        Token.VOID, Token.TYPEOF, Token.INSTANCEOF
    };
    for (int op : ops) {
      String str = NodeUtil.opToStr(op);
      Assert.assertNotNull(str);
      Assert.assertEquals(str, NodeUtil.opToStrNoFail(op));
    }
    Assert.assertNull(NodeUtil.opToStr(Token.FUNCTION));
  }

  @Test(expected = Error.class)
  public void testOpToStrNoFail_unknownOp_throwsError() {
    NodeUtil.opToStrNoFail(Token.FUNCTION);
  }

  @Test
  public void testContainsTypeAndOuterScope() {
    Node innerFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "inner"), new Node(Token.LP), new Node(Token.BLOCK, new Node(Token.THIS)));
    Node outerBlock = new Node(Token.BLOCK, innerFn);

    Assert.assertTrue(NodeUtil.containsType(outerBlock, Token.THIS));
    Assert.assertTrue(NodeUtil.containsFunctionDeclaration(outerBlock));
    Assert.assertFalse(NodeUtil.containsTypeInOuterScope(outerBlock, Token.THIS));
  }

  @Test
  public void testRedeclareVarsInsideBranchAndCopyNameAnnotations() {
    Node script = new Node(Token.SCRIPT);
    Node ifBlock = new Node(Token.BLOCK);
    Node varNode = NodeUtil.newVarNode("x", Node.newNumber(1));
    varNode.getFirstChild().putBooleanProp(Node.IS_CONSTANT_NAME, true);
    ifBlock.addChildToBack(varNode);
    script.addChildToBack(ifBlock);

    NodeUtil.redeclareVarsInsideBranch(ifBlock);
    Assert.assertEquals(Token.VAR, script.getFirstChild().getType());
    Assert.assertEquals("x", script.getFirstChild().getFirstChild().getString());
    Assert.assertTrue(NodeUtil.isConstantName(script.getFirstChild().getFirstChild()));

    Node emptyBranch = new Node(Token.BLOCK);
    NodeUtil.redeclareVarsInsideBranch(emptyBranch);
  }

  @Test
  public void testNewFunctionNodeAndNewQualifiedNameNode() {
    List<Node> params = Arrays.asList(Node.newString(Token.NAME, "p1"), Node.newString(Token.NAME, "p2"));
    Node body = new Node(Token.BLOCK);
    FunctionNode fn = NodeUtil.newFunctionNode("testFn", params, body, 10, 20);
    Assert.assertEquals("testFn", fn.getFunctionName());
    Assert.assertEquals(10, fn.getLineno());
    Assert.assertEquals(20, fn.getCharno());

    Node simpleQName = NodeUtil.newQualifiedNameNode("foo", 1, 2);
    Assert.assertEquals(Token.NAME, simpleQName.getType());
    Assert.assertEquals("foo", simpleQName.getString());

    Node deepQName = NodeUtil.newQualifiedNameNode("a.b.c", 1, 2);
    Assert.assertEquals("a.b.c", deepQName.getQualifiedName());

    Node basis = Node.newString(Token.NAME, "orig", 5, 5);
    Node withDebug = NodeUtil.newQualifiedNameNode("x.y", basis, "origName");
    Assert.assertEquals("origName", withDebug.getProp(Node.ORIGINALNAME_PROP));

    Node newNameNode = NodeUtil.newName("renamed", basis);
    Assert.assertEquals("renamed", newNameNode.getString());

    Node newNameWithOrig = NodeUtil.newName("renamed2", basis, "orig2");
    Assert.assertEquals("orig2", newNameWithOrig.getProp(Node.ORIGINALNAME_PROP));
  }

  @Test
  public void testIsLatinAndIsValidPropertyName() {
    Assert.assertTrue(NodeUtil.isLatin("abcXYZ_0129$"));
    Assert.assertFalse(NodeUtil.isLatin("abc\u0080"));

    Assert.assertTrue(NodeUtil.isValidPropertyName("validProp"));
    Assert.assertTrue(NodeUtil.isValidPropertyName("$foo_123"));
    Assert.assertFalse(NodeUtil.isValidPropertyName("while"));
    Assert.assertFalse(NodeUtil.isValidPropertyName("123bad"));
    Assert.assertFalse(NodeUtil.isValidPropertyName("bad\u0100name"));
  }

  @Test
  public void testGetVarsDeclaredInBranch() {
    Node block = new Node(Token.BLOCK);
    Node var1 = NodeUtil.newVarNode("v1", Node.newNumber(1));
    Node var2 = NodeUtil.newVarNode("v2", null);
    block.addChildToBack(var1);
    block.addChildToBack(var2);

    Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(block);
    Assert.assertEquals(2, vars.size());
  }

  @Test
  public void testPrototypeHelpers() {
    Node qName = NodeUtil.newQualifiedNameNode("MyClass.prototype.myMethod", 0, 0);
    Assert.assertTrue(NodeUtil.isPrototypeProperty(qName));
    Assert.assertEquals("MyClass", NodeUtil.getPrototypeClassName(qName).getQualifiedName());
    Assert.assertEquals("myMethod", NodeUtil.getPrototypePropertyName(qName));

    Node assign = new Node(Token.ASSIGN, qName, new Node(Token.FUNCTION));
    Node exprAssign = NodeUtil.newExpr(assign);
    Assert.assertTrue(NodeUtil.isPrototypePropertyDeclaration(exprAssign));

    Node nonProto = NodeUtil.newQualifiedNameNode("MyClass.myMethod", 0, 0);
    Assert.assertFalse(NodeUtil.isPrototypeProperty(nonProto));
    Assert.assertNull(NodeUtil.getPrototypeClassName(Node.newString(Token.NAME, "foo")));
  }

  @Test
  public void testNewUndefinedNode() {
    Node undef = NodeUtil.newUndefinedNode();
    Assert.assertEquals(Token.VOID, undef.getType());
    Assert.assertEquals(0.0, undef.getFirstChild().getDouble(), 0.0001);
  }

  @Test
  public void testReferenceQueriesAndCounts() {
    Node root = new Node(Token.BLOCK,
        Node.newString(Token.NAME, "x"),
        Node.newString(Token.NAME, "y"),
        Node.newString(Token.NAME, "x")
    );

    Assert.assertTrue(NodeUtil.isNodeTypeReferenced(root, Token.NAME));
    Assert.assertFalse(NodeUtil.isNodeTypeReferenced(root, Token.CALL));
    Assert.assertEquals(3, NodeUtil.getNodeTypeReferenceCount(root, Token.NAME));
    Assert.assertEquals(0, NodeUtil.getNodeTypeReferenceCount(root, Token.CALL));

    Assert.assertTrue(NodeUtil.isNameReferenced(root, "x"));
    Assert.assertFalse(NodeUtil.isNameReferenced(root, "z"));
    Assert.assertEquals(2, NodeUtil.getNameReferenceCount(root, "x"));
    Assert.assertEquals(1, NodeUtil.getNameReferenceCount(root, "y"));
  }

  @Test
  public void testVisitPreOrderAndPostOrder() {
    Node root = new Node(Token.BLOCK, Node.newNumber(1), Node.newNumber(2));
    final List<Double> preOrder = new ArrayList<Double>();
    NodeUtil.visitPreOrder(root, new NodeUtil.Visitor() {
      public void visit(Node node) {
        if (node.getType() == Token.NUMBER) {
          preOrder.add(node.getDouble());
        }
      }
    }, Predicates.<Node>alwaysTrue());
    Assert.assertEquals(Arrays.asList(1.0, 2.0), preOrder);

    final List<Double> postOrder = new ArrayList<Double>();
    NodeUtil.visitPostOrder(root, new NodeUtil.Visitor() {
      public void visit(Node node) {
        if (node.getType() == Token.NUMBER) {
          postOrder.add(node.getDouble());
        }
      }
    }, Predicates.<Node>alwaysTrue());
    Assert.assertEquals(Arrays.asList(1.0, 2.0), postOrder);
  }

  @Test
  public void testGetInfoForNameNodeAndGetSourceName() {
    Node nameNode = Node.newString(Token.NAME, "myVar");
    JSDocInfo info = new JSDocInfo();
    nameNode.setJSDocInfo(info);
    Assert.assertSame(info, NodeUtil.getInfoForNameNode(nameNode));

    Node nameWithoutDoc = Node.newString(Token.NAME, "otherVar");
    Node varParent = new Node(Token.VAR, nameWithoutDoc);
    JSDocInfo varDoc = new JSDocInfo();
    varParent.setJSDocInfo(varDoc);
    Assert.assertSame(varDoc, NodeUtil.getInfoForNameNode(nameWithoutDoc));

    Assert.assertNull(NodeUtil.getInfoForNameNode(null));

    Node rootNode = new Node(Token.BLOCK);
    rootNode.putProp(Node.SOURCENAME_PROP, "source.js");
    Node child = Node.newNumber(1);
    rootNode.addChildToBack(child);
    Assert.assertEquals("source.js", NodeUtil.getSourceName(child));
    Assert.assertNull(NodeUtil.getSourceName(new Node(Token.EMPTY)));
  }
}
