package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
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
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class NodeUtilTest {

  private final CodingConvention convention = new DefaultCodingConvention();

  @Test
  public void testGetExpressionBooleanValue_assignAndComma() {
    Node comma = new Node(Token.COMMA, Node.newString("a"), Node.newString("b"));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(comma));

    Node assign = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(0));
    assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(assign));
  }

  @Test
  public void testGetExpressionBooleanValue_not() {
    Node notTrue = new Node(Token.NOT, new Node(Token.TRUE));
    assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(notTrue));

    Node notUnknown = new Node(Token.NOT, Node.newString(Token.NAME, "foo"));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(notUnknown));
  }

  @Test
  public void testGetExpressionBooleanValue_andOrHook() {
    Node andNode = new Node(Token.AND, new Node(Token.TRUE), Node.newNumber(1));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(andNode));

    Node orNode = new Node(Token.OR, new Node(Token.FALSE), new Node(Token.NULL));
    assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(orNode));

    Node hookSame = new Node(Token.HOOK, Node.newString(Token.NAME, "cond"), new Node(Token.TRUE), new Node(Token.TRUE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(hookSame));

    Node hookDiff = new Node(Token.HOOK, Node.newString(Token.NAME, "cond"), new Node(Token.TRUE), new Node(Token.FALSE));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(hookDiff));
  }

  @Test
  public void testGetBooleanValue_literalsAndNames() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(Node.newString("hello")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newString("")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(Node.newNumber(42)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newNumber(0)));

    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.NULL)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.FALSE)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.VOID, Node.newNumber(0))));

    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "undefined")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "NaN")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "Infinity")));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(Node.newString(Token.NAME, "otherVar")));

    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.TRUE)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.ARRAYLIT)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.OBJECTLIT)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.REGEXP)));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(new Node(Token.CALL)));
  }

  @Test
  public void testGetStringValue() {
    assertEquals("hello", NodeUtil.getStringValue(Node.newString("hello")));
    assertEquals("undefined", NodeUtil.getStringValue(Node.newString(Token.NAME, "undefined")));
    assertEquals("Infinity", NodeUtil.getStringValue(Node.newString(Token.NAME, "Infinity")));
    assertEquals("NaN", NodeUtil.getStringValue(Node.newString(Token.NAME, "NaN")));
    assertNull(NodeUtil.getStringValue(Node.newString(Token.NAME, "foo")));

    assertEquals("1", NodeUtil.getStringValue(Node.newNumber(1.0)));
    assertEquals("1.5", NodeUtil.getStringValue(Node.newNumber(1.5)));

    assertEquals("false", NodeUtil.getStringValue(new Node(Token.FALSE)));
    assertEquals("true", NodeUtil.getStringValue(new Node(Token.TRUE)));
    assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
    assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID, Node.newNumber(0))));
    assertNull(NodeUtil.getStringValue(new Node(Token.ARRAYLIT)));
  }

  @Test
  public void testGetNumberValue() {
    assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(new Node(Token.TRUE)));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.FALSE)));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.NULL)));
    assertEquals(Double.valueOf(123.45), NodeUtil.getNumberValue(Node.newNumber(123.45)));
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(new Node(Token.VOID, Node.newNumber(0)))));

    assertTrue(Double.isNaN(NodeUtil.getNumberValue(Node.newString(Token.NAME, "undefined"))));
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(Node.newString(Token.NAME, "NaN"))));
    assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), NodeUtil.getNumberValue(Node.newString(Token.NAME, "Infinity")));
    assertNull(NodeUtil.getNumberValue(Node.newString(Token.NAME, "other")));
    assertNull(NodeUtil.getNumberValue(Node.newString("string")));
  }

  @Test
  public void testGetFunctionName() {
    Node fn1 = NodeUtil.newFunctionNode("myFunc", Collections.<Node>emptyList(), new Node(Token.BLOCK), 1, 0);
    new Node(Token.EXPR_RESULT, fn1);
    assertEquals("myFunc", NodeUtil.getFunctionName(fn1));

    Node fnAnon = NodeUtil.newFunctionNode("", Collections.<Node>emptyList(), new Node(Token.BLOCK), 1, 0);
    new Node(Token.EXPR_RESULT, fnAnon);
    assertNull(NodeUtil.getFunctionName(fnAnon));

    Node varName = Node.newString(Token.NAME, "varFn");
    varName.addChildToBack(fnAnon);
    new Node(Token.VAR, varName);
    assertEquals("varFn", NodeUtil.getFunctionName(fnAnon));

    Node qname = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString("prop"));
    Node fn3 = NodeUtil.newFunctionNode("namedInside", Collections.<Node>emptyList(), new Node(Token.BLOCK), 1, 0);
    new Node(Token.ASSIGN, qname, fn3);
    assertEquals("obj.prop", NodeUtil.getFunctionName(fn3));
  }

  @Test
  public void testGetNearestFunctionName() {
    Node fnNamed = NodeUtil.newFunctionNode("fn", Collections.<Node>emptyList(), new Node(Token.BLOCK), 1, 0);
    new Node(Token.EXPR_RESULT, fnNamed);
    assertEquals("fn", NodeUtil.getNearestFunctionName(fnNamed));

    Node fnAnon = NodeUtil.newFunctionNode("", Collections.<Node>emptyList(), new Node(Token.BLOCK), 1, 0);
    Node strKey = Node.newString("objKey");
    strKey.addChildToBack(fnAnon);
    new Node(Token.OBJECTLIT, strKey);
    assertEquals("objKey", NodeUtil.getNearestFunctionName(fnAnon));

    Node fnAnon2 = NodeUtil.newFunctionNode("", Collections.<Node>emptyList(), new Node(Token.BLOCK), 1, 0);
    new Node(Token.ARRAYLIT, fnAnon2);
    assertNull(NodeUtil.getNearestFunctionName(fnAnon2));
  }

  @Test
  public void testIsImmutableValue() {
    assertTrue(NodeUtil.isImmutableValue(Node.newString("s")));
    assertTrue(NodeUtil.isImmutableValue(Node.newNumber(1)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.VOID, Node.newNumber(0))));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NEG, Node.newNumber(5))));
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "undefined")));
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "Infinity")));
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "NaN")));
    assertFalse(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "x")));
    assertFalse(NodeUtil.isImmutableValue(new Node(Token.ARRAYLIT)));
  }

  @Test
  public void testIsLiteralValue() {
    Node arrayLitConst = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newString("a"));
    assertTrue(NodeUtil.isLiteralValue(arrayLitConst, false));

    Node arrayLitNonConst = new Node(Token.ARRAYLIT, Node.newString(Token.NAME, "varVal"));
    assertFalse(NodeUtil.isLiteralValue(arrayLitNonConst, false));

    Node key1 = Node.newString("k1");
    key1.addChildToBack(Node.newNumber(10));
    Node objLitConst = new Node(Token.OBJECTLIT, key1);
    assertTrue(NodeUtil.isLiteralValue(objLitConst, false));

    Node key2 = Node.newString("k2");
    key2.addChildToBack(Node.newString(Token.NAME, "unknown"));
    Node objLitNonConst = new Node(Token.OBJECTLIT, key2);
    assertFalse(NodeUtil.isLiteralValue(objLitNonConst, false));

    Node fnExpr = NodeUtil.newFunctionNode("", Collections.<Node>emptyList(), new Node(Token.BLOCK), 1, 0);
    new Node(Token.ASSIGN, Node.newString(Token.NAME, "f"), fnExpr);
    assertTrue(NodeUtil.isLiteralValue(fnExpr, true));
    assertFalse(NodeUtil.isLiteralValue(fnExpr, false));

    Node regex = new Node(Token.REGEXP, Node.newString("pattern"));
    assertTrue(NodeUtil.isLiteralValue(regex, false));
  }

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = ImmutableSet.of("DEF_A", "a.b.DEF_B");
    assertTrue(NodeUtil.isValidDefineValue(Node.newString("str"), defines));
    assertTrue(NodeUtil.isValidDefineValue(Node.newNumber(1), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.TRUE), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.FALSE), defines));

    Node add = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
    assertTrue(NodeUtil.isValidDefineValue(add, defines));

    Node bitand = new Node(Token.BITAND, Node.newNumber(1), Node.newNumber(2));
    assertTrue(NodeUtil.isValidDefineValue(bitand, defines));

    Node notNode = new Node(Token.NOT, new Node(Token.TRUE));
    assertTrue(NodeUtil.isValidDefineValue(notNode, defines));

    Node negNode = new Node(Token.NEG, Node.newNumber(5));
    assertTrue(NodeUtil.isValidDefineValue(negNode, defines));

    Node posNode = new Node(Token.POS, Node.newNumber(5));
    assertTrue(NodeUtil.isValidDefineValue(posNode, defines));

    assertTrue(NodeUtil.isValidDefineValue(Node.newString(Token.NAME, "DEF_A"), defines));
    assertFalse(NodeUtil.isValidDefineValue(Node.newString(Token.NAME, "NOT_DEF"), defines));

    Node getprop = new Node(Token.GETPROP, new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString("b")), Node.newString("DEF_B"));
    assertTrue(NodeUtil.isValidDefineValue(getprop, defines));

    assertFalse(NodeUtil.isValidDefineValue(new Node(Token.CALL), defines));
  }

  @Test
  public void testIsEmptyBlock() {
    assertFalse(NodeUtil.isEmptyBlock(new Node(Token.EXPR_RESULT)));
    assertTrue(NodeUtil.isEmptyBlock(new Node(Token.BLOCK)));
    assertTrue(NodeUtil.isEmptyBlock(new Node(Token.BLOCK, new Node(Token.EMPTY))));
    assertFalse(NodeUtil.isEmptyBlock(new Node(Token.BLOCK, Node.newNumber(1))));
  }

  @Test
  public void testIsSimpleOperator() {
    int[] simpleOps = {
      Token.ADD, Token.BITAND, Token.BITNOT, Token.BITOR, Token.BITXOR,
      Token.COMMA, Token.DIV, Token.EQ, Token.GE, Token.GETELEM,
      Token.GETPROP, Token.GT, Token.INSTANCEOF, Token.LE, Token.LSH,
      Token.LT, Token.MOD, Token.MUL, Token.NE, Token.NOT,
      Token.RSH, Token.SHEQ, Token.SHNE, Token.SUB, Token.TYPEOF,
      Token.VOID, Token.POS, Token.NEG, Token.URSH
    };
    for (int op : simpleOps) {
      assertTrue(NodeUtil.isSimpleOperatorType(op));
      assertTrue(NodeUtil.isSimpleOperator(new Node(op)));
    }
    assertFalse(NodeUtil.isSimpleOperatorType(Token.CALL));
    assertFalse(NodeUtil.isSimpleOperator(new Node(Token.CALL)));
  }

  @Test
  public void testNewExpr() {
    Node child = Node.newNumber(1);
    Node expr = NodeUtil.newExpr(child);
    assertEquals(Token.EXPR_RESULT, expr.getType());
    assertSame(child, expr.getFirstChild());
  }

  @Test
  public void testMayEffectMutableStateAndMayHaveSideEffects() {
    Node num = Node.newNumber(10);
    assertFalse(NodeUtil.mayEffectMutableState(num));
    assertFalse(NodeUtil.mayHaveSideEffects(num));

    Node throwNode = new Node(Token.THROW, Node.newString("err"));
    assertTrue(NodeUtil.mayHaveSideEffects(throwNode));

    Node arr = new Node(Token.ARRAYLIT);
    assertTrue(NodeUtil.mayEffectMutableState(arr));
    assertFalse(NodeUtil.mayHaveSideEffects(arr));

    Node objLit = new Node(Token.OBJECTLIT);
    assertTrue(NodeUtil.mayEffectMutableState(objLit));
    assertFalse(NodeUtil.mayHaveSideEffects(objLit));

    Node key = Node.newString("a");
    key.addChildToBack(Node.newNumber(1));
    Node objWithProp = new Node(Token.OBJECTLIT, key);
    assertFalse(NodeUtil.mayHaveSideEffects(objWithProp));

    Node varNoInit = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    assertFalse(NodeUtil.mayHaveSideEffects(varNoInit));

    Node varInit = NodeUtil.newVarNode("x", Node.newNumber(1));
    assertTrue(NodeUtil.mayHaveSideEffects(varInit));

    Node fnExpr = NodeUtil.newFunctionNode("", Collections.<Node>emptyList(), new Node(Token.BLOCK), 1, 0);
    new Node(Token.EXPR_RESULT, fnExpr).getParent();
    new Node(Token.ASSIGN, Node.newString(Token.NAME, "f"), fnExpr);
    assertFalse(NodeUtil.mayHaveSideEffects(fnExpr));
    assertTrue(NodeUtil.mayEffectMutableState(fnExpr));

    Node fnDecl = NodeUtil.newFunctionNode("f", Collections.<Node>emptyList(), new Node(Token.BLOCK), 1, 0);
    new Node(Token.BLOCK, fnDecl);
    assertTrue(NodeUtil.mayHaveSideEffects(fnDecl));

    Node newArray = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
    assertFalse(NodeUtil.mayHaveSideEffects(newArray));
    assertTrue(NodeUtil.mayEffectMutableState(newArray));

    Node newCustom = new Node(Token.NEW, Node.newString(Token.NAME, "CustomClass"));
    assertTrue(NodeUtil.mayHaveSideEffects(newCustom));

    Node callBuiltin = new Node(Token.CALL, Node.newString(Token.NAME, "String"));
    assertFalse(NodeUtil.mayHaveSideEffects(callBuiltin));

    Node assignName = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(1));
    assertTrue(NodeUtil.mayHaveSideEffects(assignName));

    Node localObj = new Node(Token.OBJECTLIT);
    Node assignProp = new Node(Token.ASSIGN, new Node(Token.GETPROP, localObj, Node.newString("p")), Node.newNumber(1));
    assertFalse(NodeUtil.mayHaveSideEffects(assignProp));

    Node mathCall = new Node(Token.CALL, new Node(Token.GETPROP, Node.newString(Token.NAME, "Math"), Node.newString("sin")), Node.newNumber(1));
    assertFalse(NodeUtil.mayHaveSideEffects(mathCall));
  }

  @Test(expected = IllegalStateException.class)
  public void testConstructorCallHasSideEffects_notNew() {
    NodeUtil.constructorCallHasSideEffects(new Node(Token.CALL));
  }

  @Test
  public void testConstructorCallHasSideEffects_builtins() {
    Node newDate = new Node(Token.NEW, Node.newString(Token.NAME, "Date"));
    assertFalse(NodeUtil.constructorCallHasSideEffects(newDate));

    Node newOther = new Node(Token.NEW, Node.newString(Token.NAME, "Other"));
    assertTrue(NodeUtil.constructorCallHasSideEffects(newOther));

    Node newNoSideEffects = new Node(Token.NEW, Node.newString(Token.NAME, "Other"));
    newNoSideEffects.setIsNoSideEffectsCall();
    assertFalse(NodeUtil.constructorCallHasSideEffects(newNoSideEffects));
  }

  @Test(expected = IllegalStateException.class)
  public void testFunctionCallHasSideEffects_notCall() {
    NodeUtil.functionCallHasSideEffects(new Node(Token.NEW));
  }

  @Test
  public void testFunctionCallHasSideEffects_methods() {
    Node toStringCall = new Node(Token.CALL, new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString("toString")));
    assertFalse(NodeUtil.functionCallHasSideEffects(toStringCall));

    Node callNoSideEffects = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    callNoSideEffects.setIsNoSideEffectsCall();
    assertFalse(NodeUtil.functionCallHasSideEffects(callNoSideEffects));

    Node modifiesThisCall = new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.OBJECTLIT), Node.newString("init")));
    modifiesThisCall.putBooleanProp(Node.SIDE_EFFECTS_FLAGS, Node.FLAG_MODIFIES_THIS);
    assertFalse(NodeUtil.functionCallHasSideEffects(modifiesThisCall));
  }

  @Test
  public void testCallHasLocalResult() {
    Node call = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    assertFalse(NodeUtil.callHasLocalResult(call));
    call.putIntProp(Node.SIDE_EFFECTS_FLAGS, Node.FLAG_LOCAL_RESULTS);
    assertTrue(NodeUtil.callHasLocalResult(call));
  }

  @Test
  public void testNodeTypeMayHaveSideEffects() {
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DELPROP)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DEC)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.INC)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.THROW, Node.newString("e"))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.ASSIGN_ADD, Node.newString(Token.NAME, "x"), Node.newNumber(1))));

    Node nameWithChild = Node.newString(Token.NAME, "varName");
    nameWithChild.addChildToBack(Node.newNumber(1));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameWithChild));

    Node nameWithoutChild = Node.newString(Token.NAME, "varName");
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(nameWithoutChild));
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(Node.newNumber(5)));
  }

  @Test
  public void testCanBeSideEffected() {
    assertTrue(NodeUtil.canBeSideEffected(new Node(Token.CALL, Node.newString(Token.NAME, "f"))));
    assertTrue(NodeUtil.canBeSideEffected(new Node(Token.NEW, Node.newString(Token.NAME, "C"))));

    Node name = Node.newString(Token.NAME, "x");
    assertTrue(NodeUtil.canBeSideEffected(name));
    assertTrue(NodeUtil.canBeSideEffected(name, Collections.<String>emptySet()));
    assertFalse(NodeUtil.canBeSideEffected(name, ImmutableSet.of("x")));

    Node constName = Node.newString(Token.NAME, "CONST");
    constName.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertFalse(NodeUtil.canBeSideEffected(constName));

    Node getprop = new Node(Token.GETPROP, constName, Node.newString("prop"));
    assertTrue(NodeUtil.canBeSideEffected(getprop));

    Node fnExpr = NodeUtil.newFunctionNode("", Collections.<Node>emptyList(), new Node(Token.BLOCK), 1, 0);
    new Node(Token.ASSIGN, Node.newString(Token.NAME, "f"), fnExpr);
    assertFalse(NodeUtil.canBeSideEffected(fnExpr));

    Node tree = new Node(Token.ADD, Node.newNumber(1), new Node(Token.CALL, Node.newString(Token.NAME, "f")));
    assertTrue(NodeUtil.canBeSideEffected(tree));
  }

  @Test
  public void testPrecedence() {
    assertEquals(0, NodeUtil.precedence(Token.COMMA));
    assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    assertEquals(1, NodeUtil.precedence(Token.ASSIGN_ADD));
    assertEquals(2, NodeUtil.precedence(Token.HOOK));
    assertEquals(3, NodeUtil.precedence(Token.OR));
    assertEquals(4, NodeUtil.precedence(Token.AND));
    assertEquals(5, NodeUtil.precedence(Token.BITOR));
    assertEquals(6, NodeUtil.precedence(Token.BITXOR));
    assertEquals(7, NodeUtil.precedence(Token.BITAND));
    assertEquals(8, NodeUtil.precedence(Token.EQ));
    assertEquals(8, NodeUtil.precedence(Token.SHEQ));
    assertEquals(9, NodeUtil.precedence(Token.LT));
    assertEquals(9, NodeUtil.precedence(Token.INSTANCEOF));
    assertEquals(10, NodeUtil.precedence(Token.LSH));
    assertEquals(11, NodeUtil.precedence(Token.ADD));
    assertEquals(11, NodeUtil.precedence(Token.SUB));
    assertEquals(12, NodeUtil.precedence(Token.MUL));
    assertEquals(12, NodeUtil.precedence(Token.DIV));
    assertEquals(13, NodeUtil.precedence(Token.NOT));
    assertEquals(13, NodeUtil.precedence(Token.VOID));
    assertEquals(15, NodeUtil.precedence(Token.NAME));
    assertEquals(15, NodeUtil.precedence(Token.CALL));
  }

  @Test(expected = Error.class)
  public void testPrecedence_unknown() {
    NodeUtil.precedence(-999);
  }

  @Test
  public void testIsAssociativeAndCommutative() {
    assertTrue(NodeUtil.isAssociative(Token.MUL));
    assertTrue(NodeUtil.isAssociative(Token.AND));
    assertTrue(NodeUtil.isAssociative(Token.OR));
    assertTrue(NodeUtil.isAssociative(Token.BITOR));
    assertTrue(NodeUtil.isAssociative(Token.BITAND));
    assertFalse(NodeUtil.isAssociative(Token.ADD));
    assertFalse(NodeUtil.isAssociative(Token.SUB));

    assertTrue(NodeUtil.isCommutative(Token.MUL));
    assertTrue(NodeUtil.isCommutative(Token.BITOR));
    assertTrue(NodeUtil.isCommutative(Token.BITAND));
    assertFalse(NodeUtil.isCommutative(Token.AND));
    assertFalse(NodeUtil.isCommutative(Token.ADD));
  }

  @Test
  public void testIsAssignmentOpAndGetOpFromAssignmentOp() {
    int[] assignOps = {
      Token.ASSIGN, Token.ASSIGN_BITOR, Token.ASSIGN_BITXOR, Token.ASSIGN_BITAND,
      Token.ASSIGN_LSH, Token.ASSIGN_RSH, Token.ASSIGN_URSH, Token.ASSIGN_ADD,
      Token.ASSIGN_SUB, Token.ASSIGN_MUL, Token.ASSIGN_DIV, Token.ASSIGN_MOD
    };
    for (int op : assignOps) {
      assertTrue(NodeUtil.isAssignmentOp(new Node(op)));
    }
    assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));

    assertEquals(Token.BITOR, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITOR)));
    assertEquals(Token.BITXOR, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITXOR)));
    assertEquals(Token.BITAND, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITAND)));
    assertEquals(Token.LSH, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_LSH)));
    assertEquals(Token.RSH, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_RSH)));
    assertEquals(Token.URSH, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_URSH)));
    assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_ADD)));
    assertEquals(Token.SUB, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_SUB)));
    assertEquals(Token.MUL, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_MUL)));
    assertEquals(Token.DIV, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_DIV)));
    assertEquals(Token.MOD, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_MOD)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetOpFromAssignmentOp_invalid() {
    NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN));
  }

  @Test
  public void testSimpleTypeChecks() {
    assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT)));
    assertFalse(NodeUtil.isExpressionNode(new Node(Token.BLOCK)));

    assertTrue(NodeUtil.isGet(new Node(Token.GETPROP)));
    assertTrue(NodeUtil.isGet(new Node(Token.GETELEM)));
    assertFalse(NodeUtil.isGet(new Node(Token.NAME)));

    assertTrue(NodeUtil.isGetProp(new Node(Token.GETPROP)));
    assertFalse(NodeUtil.isGetProp(new Node(Token.GETELEM)));

    assertTrue(NodeUtil.isName(Node.newString(Token.NAME, "a")));
    assertFalse(NodeUtil.isName(Node.newNumber(1)));

    assertTrue(NodeUtil.isNew(new Node(Token.NEW)));
    assertFalse(NodeUtil.isNew(new Node(Token.CALL)));

    assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
    assertFalse(NodeUtil.isVar(new Node(Token.LET)));

    assertTrue(NodeUtil.isString(Node.newString("str")));
    assertFalse(NodeUtil.isString(new Node(Token.NUMBER)));

    assertTrue(NodeUtil.isAssign(new Node(Token.ASSIGN)));
    assertFalse(NodeUtil.isAssign(new Node(Token.ASSIGN_ADD)));

    assertTrue(NodeUtil.isCall(new Node(Token.CALL)));
    assertFalse(NodeUtil.isCall(new Node(Token.NEW)));

    assertTrue(NodeUtil.isCallOrNew(new Node(Token.CALL)));
    assertTrue(NodeUtil.isCallOrNew(new Node(Token.NEW)));
    assertFalse(NodeUtil.isCallOrNew(new Node(Token.NAME)));

    assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
    assertFalse(NodeUtil.isFunction(new Node(Token.CALL)));

    assertTrue(NodeUtil.isThis(new Node(Token.THIS)));
    assertFalse(NodeUtil.isThis(new Node(Token.NAME)));

    assertTrue(NodeUtil.isLabelName(new Node(Token.LABEL_NAME)));
    assertFalse(NodeUtil.isLabelName(null));
    assertFalse(NodeUtil.isLabelName(new Node(Token.NAME)));

    assertTrue(NodeUtil.isSwitchCase(new Node(Token.CASE)));
    assertTrue(NodeUtil.isSwitchCase(new Node(Token.DEFAULT)));
    assertFalse(NodeUtil.isSwitchCase(new Node(Token.SWITCH)));

    assertTrue(NodeUtil.isReferenceName(Node.newString(Token.NAME, "varName")));
    assertFalse(NodeUtil.isReferenceName(Node.newString(Token.NAME, "")));
    assertFalse(NodeUtil.isReferenceName(new Node(Token.NUMBER)));
  }

  @Test
  public void testIsVarDeclarationAndGetAssignedValue() {
    Node nameInVar = Node.newString(Token.NAME, "v");
    Node val = Node.newNumber(10);
    nameInVar.addChildToBack(val);
    Node varNode = new Node(Token.VAR, nameInVar);

    assertTrue(NodeUtil.isVarDeclaration(nameInVar));
    assertSame(val, NodeUtil.getAssignedValue(nameInVar));

    Node assignName = Node.newString(Token.NAME, "v2");
    Node assignVal = Node.newNumber(20);
    new Node(Token.ASSIGN, assignName, assignVal);
    assertSame(assignVal, NodeUtil.getAssignedValue(assignName));

    Node bareName = Node.newString(Token.NAME, "v3");
    new Node(Token.EXPR_RESULT, bareName);
    assertNull(NodeUtil.getAssignedValue(bareName));
  }

  @Test
  public void testIsExprAssignAndIsExprCall() {
    Node assignExpr = new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(1)));
    assertTrue(NodeUtil.isExprAssign(assignExpr));
    assertFalse(NodeUtil.isExprCall(assignExpr));

    Node callExpr = new Node(Token.EXPR_RESULT, new Node(Token.CALL, Node.newString(Token.NAME, "fn")));
    assertTrue(NodeUtil.isExprCall(callExpr));
    assertFalse(NodeUtil.isExprAssign(callExpr));
  }

  @Test
  public void testLoopAndControlStructures() {
    Node forNode = new Node(Token.FOR, Node.newString(Token.NAME, "i"), Node.newString(Token.NAME, "obj"), new Node(Token.BLOCK));
    assertTrue(NodeUtil.isForIn(forNode));
    assertTrue(NodeUtil.isLoopStructure(forNode));
    assertTrue(NodeUtil.isControlStructure(forNode));
    assertSame(forNode.getLastChild(), NodeUtil.getLoopCodeBlock(forNode));

    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), Node.newNumber(1));
    assertTrue(NodeUtil.isLoopStructure(doNode));
    assertSame(doNode.getFirstChild(), NodeUtil.getLoopCodeBlock(doNode));

    Node whileNode = new Node(Token.WHILE, Node.newNumber(1), new Node(Token.BLOCK));
    assertTrue(NodeUtil.isLoopStructure(whileNode));
    assertSame(whileNode.getLastChild(), NodeUtil.getLoopCodeBlock(whileNode));

    assertFalse(NodeUtil.isLoopStructure(new Node(Token.IF)));
    assertNull(NodeUtil.getLoopCodeBlock(new Node(Token.IF)));

    Node childInLoop = Node.newNumber(1);
    Node blockInLoop = new Node(Token.BLOCK, childInLoop);
    new Node(Token.WHILE, Node.newNumber(1), blockInLoop);
    assertTrue(NodeUtil.isWithinLoop(childInLoop));

    Node fnInsideLoop = NodeUtil.newFunctionNode("fn", Collections.<Node>emptyList(), new Node(Token.BLOCK, Node.newNumber(2)), 1, 0);
    new Node(Token.WHILE, Node.newNumber(1), new Node(Token.BLOCK, fnExprWrap(fnInsideLoop)));
    assertFalse(NodeUtil.isWithinLoop(fnInsideLoop.getLastChild().getFirstChild()));
  }

  private Node fnExprWrap(Node fn) {
    new Node(Token.EXPR_RESULT, fn);
    return fn;
  }

  @Test
  public void testIsControlStructureCodeBlock() {
    Node forBody = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.EMPTY), forBody);
    assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, forBody));

    Node doBody = new Node(Token.BLOCK);
    Node doCond = Node.newNumber(1);
    Node doNode = new Node(Token.DO, doBody, doCond);
    assertTrue(NodeUtil.isControlStructureCodeBlock(doNode, doBody));
    assertFalse(NodeUtil.isControlStructureCodeBlock(doNode, doCond));

    Node ifCond = Node.newNumber(1);
    Node ifThen = new Node(Token.BLOCK);
    Node ifNode = new Node(Token.IF, ifCond, ifThen);
    assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, ifCond));
    assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, ifThen));

    Node tryBody = new Node(Token.BLOCK);
    Node catchBlock = new Node(Token.BLOCK);
    Node finallyBlock = new Node(Token.BLOCK);
    Node tryNode = new Node(Token.TRY, tryBody, catchBlock, finallyBlock);
    assertTrue(NodeUtil.isControlStructureCodeBlock(tryNode, tryBody));
    assertTrue(NodeUtil.isControlStructureCodeBlock(tryNode, finallyBlock));
    assertFalse(NodeUtil.isControlStructureCodeBlock(tryNode, catchBlock));

    Node catchParam = Node.newString(Token.NAME, "e");
    Node catchBody = new Node(Token.BLOCK);
    Node catchNode = new Node(Token.CATCH, catchParam, catchBody);
    assertTrue(NodeUtil.isControlStructureCodeBlock(catchNode, catchBody));

    Node switchExpr = Node.newString(Token.NAME, "x");
    Node caseNode = new Node(Token.CASE, Node.newNumber(1), new Node(Token.BLOCK));
    Node switchNode = new Node(Token.SWITCH, switchExpr, caseNode);
    assertTrue(NodeUtil.isControlStructureCodeBlock(switchNode, caseNode));
    assertFalse(NodeUtil.isControlStructureCodeBlock(switchNode, switchExpr));

    Node defaultNode = new Node(Token.DEFAULT, new Node(Token.BLOCK));
    assertTrue(NodeUtil.isControlStructureCodeBlock(defaultNode, defaultNode.getFirstChild()));
  }

  @Test
  public void testGetConditionExpression() {
    Node ifCond = Node.newNumber(1);
    Node ifNode = new Node(Token.IF, ifCond, new Node(Token.BLOCK));
    assertSame(ifCond, NodeUtil.getConditionExpression(ifNode));

    Node whileCond = Node.newNumber(2);
    Node whileNode = new Node(Token.WHILE, whileCond, new Node(Token.BLOCK));
    assertSame(whileCond, NodeUtil.getConditionExpression(whileNode));

    Node doCond = Node.newNumber(3);
    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), doCond);
    assertSame(doCond, NodeUtil.getConditionExpression(doNode));

    Node forIn = new Node(Token.FOR, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"), new Node(Token.BLOCK));
    assertNull(NodeUtil.getConditionExpression(forIn));

    Node forCond = Node.newNumber(4);
    Node for4 = new Node(Token.FOR, new Node(Token.EMPTY), forCond, new Node(Token.EMPTY), new Node(Token.BLOCK));
    assertSame(forCond, NodeUtil.getConditionExpression(for4));

    Node caseNode = new Node(Token.CASE, Node.newNumber(5), new Node(Token.BLOCK));
    assertNull(NodeUtil.getConditionExpression(caseNode));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_invalid() {
    NodeUtil.getConditionExpression(new Node(Token.EXPR_RESULT));
  }

  @Test
  public void testIsStatementBlockAndIsStatement() {
    assertTrue(NodeUtil.isStatementBlock(new Node(Token.SCRIPT)));
    assertTrue(NodeUtil.isStatementBlock(new Node(Token.BLOCK)));
    assertFalse(NodeUtil.isStatementBlock(new Node(Token.NAME)));

    Node stmt = Node.newNumber(1);
    new Node(Token.BLOCK, stmt);
    assertTrue(NodeUtil.isStatement(stmt));

    Node nonStmt = Node.newNumber(2);
    new Node(Token.ADD, nonStmt, Node.newNumber(3));
    assertFalse(NodeUtil.isStatement(nonStmt));
  }

  @Test
  public void testIsTryFinallyNode() {
    Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), new Node(Token.BLOCK));
    assertTrue(NodeUtil.isTryFinallyNode(tryNode, tryNode.getLastChild()));
    assertFalse(NodeUtil.isTryFinallyNode(tryNode, tryNode.getFirstChild()));
  }

  @Test
  public void testRemoveChild() {
    Node block = new Node(Token.BLOCK);
    Node n1 = Node.newNumber(1);
    Node n2 = Node.newNumber(2);
    block.addChildToBack(n1);
    block.addChildToBack(n2);
    NodeUtil.removeChild(block, n1);
    assertEquals(1, block.getChildCount());
    assertSame(n2, block.getFirstChild());

    Node varMulti = new Node(Token.VAR, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    NodeUtil.removeChild(varMulti, varMulti.getFirstChild());
    assertEquals(1, varMulti.getChildCount());

    Node script = new Node(Token.SCRIPT);
    Node singleVarName = Node.newString(Token.NAME, "x");
    Node varSingle = new Node(Token.VAR, singleVarName);
    script.addChildToBack(varSingle);
    NodeUtil.removeChild(varSingle, singleVarName);
    assertFalse(script.hasChildren());

    Node innerBlock = new Node(Token.BLOCK, Node.newNumber(10));
    NodeUtil.removeChild(new Node(Token.EXPR_RESULT), innerBlock);
    assertFalse(innerBlock.hasChildren());

    Node labelName = Node.newString(Token.NAME, "lbl");
    Node labelBody = new Node(Token.BLOCK);
    Node labelNode = new Node(Token.LABEL, labelName, labelBody);
    script.addChildToBack(labelNode);
    NodeUtil.removeChild(labelNode, labelBody);
    assertFalse(script.hasChildren());

    Node forCond = Node.newNumber(1);
    Node for4 = new Node(Token.FOR, new Node(Token.EMPTY), forCond, new Node(Token.EMPTY), new Node(Token.BLOCK));
    NodeUtil.removeChild(for4, forCond);
    assertEquals(Token.EMPTY, for4.getFirstChild().getNext().getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testRemoveChild_invalid() {
    Node add = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
    NodeUtil.removeChild(add, add.getFirstChild());
  }

  @Test
  public void testTryMergeBlock() {
    Node parentBlock = new Node(Token.BLOCK);
    Node childBlock = new Node(Token.BLOCK, Node.newNumber(1), Node.newNumber(2));
    parentBlock.addChildToBack(childBlock);
    assertTrue(NodeUtil.tryMergeBlock(childBlock));
    assertEquals(2, parentBlock.getChildCount());

    Node exprParent = new Node(Token.EXPR_RESULT);
    Node orphanBlock = new Node(Token.BLOCK);
    exprParent.addChildToBack(orphanBlock);
    assertFalse(NodeUtil.tryMergeBlock(orphanBlock));
  }

  @Test
  public void testFunctionCharacteristics() {
    Node fn = NodeUtil.newFunctionNode("foo", Arrays.asList(Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b")), new Node(Token.BLOCK), 1, 0);
    assertTrue(NodeUtil.isFunction(fn));
    assertEquals(Token.BLOCK, NodeUtil.getFunctionBody(fn).getType());
    assertEquals(2, NodeUtil.getFnParameters(fn).getChildCount());
    assertEquals("a", NodeUtil.getArgumentForFunction(fn, 0).getString());
    assertEquals("b", NodeUtil.getArgumentForFunction(fn, 1).getString());
    assertNull(NodeUtil.getArgumentForFunction(fn, 2));

    Node script = new Node(Token.SCRIPT, fn);
    assertTrue(NodeUtil.isFunctionDeclaration(fn));
    assertTrue(NodeUtil.isHoistedFunctionDeclaration(fn));
    assertFalse(NodeUtil.isFunctionExpression(fn));

    Node exprFn = NodeUtil.newFunctionNode("", Collections.<Node>emptyList(), new Node(Token.BLOCK), 1, 0);
    new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), exprFn);
    assertTrue(NodeUtil.isFunctionExpression(exprFn));
    assertTrue(NodeUtil.isEmptyFunctionExpression(exprFn));

    Node fnWithArgs = NodeUtil.newFunctionNode("bar", Collections.<Node>emptyList(), new Node(Token.BLOCK, Node.newString(Token.NAME, "arguments")), 1, 0);
    assertTrue(NodeUtil.isVarArgsFunction(fnWithArgs));
  }

  @Test
  public void testObjectAndFunctionCallMethods() {
    Node callTarget1 = new Node(Token.GETPROP, Node.newString(Token.NAME, "foo"), Node.newString("call"));
    Node callNode1 = new Node(Token.CALL, callTarget1, Node.newString(Token.NAME, "arg1"));
    assertTrue(NodeUtil.isObjectCallMethod(callNode1, "call"));
    assertTrue(NodeUtil.isFunctionObjectCall(callNode1));
    assertFalse(NodeUtil.isFunctionObjectApply(callNode1));
    assertTrue(NodeUtil.isFunctionObjectCallOrApply(callNode1));
    assertTrue(NodeUtil.isSimpleFunctionObjectCall(callNode1));

    Node callTarget2 = new Node(Token.GETPROP, Node.newString(Token.NAME, "bar"), Node.newString("apply"));
    Node callNode2 = new Node(Token.CALL, callTarget2);
    assertTrue(NodeUtil.isFunctionObjectApply(callNode2));
    assertTrue(NodeUtil.isFunctionObjectCallOrApply(callNode2));

    assertEquals("arg1", NodeUtil.getArgumentForCallOrNew(callNode1, 0).getString());
    assertNull(NodeUtil.getArgumentForCallOrNew(callNode1, 1));
  }

  @Test
  public void testIsLhsAndObjectKeys() {
    Node name = Node.newString(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, name, Node.newNumber(1));
    assertTrue(NodeUtil.isLhs(name, assign));

    Node varNode = new Node(Token.VAR, name);
    assertTrue(NodeUtil.isLhs(name, varNode));

    Node strKey = Node.newString("k");
    Node objLit = new Node(Token.OBJECTLIT, strKey);
    assertTrue(NodeUtil.isObjectLitKey(strKey, objLit));

    Node getKey = new Node(Token.GET);
    Node setKey = new Node(Token.SET);
    assertTrue(NodeUtil.isObjectLitKey(getKey, objLit));
    assertTrue(NodeUtil.isObjectLitKey(setKey, objLit));
    assertTrue(NodeUtil.isGetOrSetKey(getKey));
    assertTrue(NodeUtil.isGetOrSetKey(setKey));
    assertFalse(NodeUtil.isGetOrSetKey(strKey));
  }

  @Test
  public void testOpToStrAndOpToStrNoFail() {
    assertEquals("+", NodeUtil.opToStr(Token.ADD));
    assertEquals("-", NodeUtil.opToStr(Token.SUB));
    assertEquals("===", NodeUtil.opToStr(Token.SHEQ));
    assertEquals("instanceof", NodeUtil.opToStr(Token.INSTANCEOF));
    assertEquals("+=", NodeUtil.opToStr(Token.ASSIGN_ADD));
    assertNull(NodeUtil.opToStr(Token.FUNCTION));

    assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
  }

  @Test(expected = Error.class)
  public void testOpToStrNoFail_throwsOnError() {
    NodeUtil.opToStrNoFail(Token.FUNCTION);
  }

  @Test
  public void testQualifiedNameAndCreation() {
    Node qname = NodeUtil.newQualifiedNameNode(convention, "a.b.c", 1, 2);
    assertEquals(Token.GETPROP, qname.getType());
    assertEquals("a.b.c", qname.getQualifiedName());

    Node root = NodeUtil.getRootOfQualifiedName(qname);
    assertEquals("a", root.getString());

    Node basis = Node.newString(Token.NAME, "orig");
    Node qname2 = NodeUtil.newQualifiedNameNode(convention, "foo.bar", basis, "origName");
    assertEquals("foo.bar", qname2.getQualifiedName());

    Node singleName = NodeUtil.newName(convention, "simple", basis, "orig");
    assertEquals("simple", singleName.getString());
  }

  @Test
  public void testIsLatinAndIsValidPropertyName() {
    assertTrue(NodeUtil.isLatin("abcXYZ_012$"));
    assertFalse(NodeUtil.isLatin("abc\u0080"));
    assertTrue(NodeUtil.isValidPropertyName("validProp"));
    assertFalse(NodeUtil.isValidPropertyName("default"));
    assertFalse(NodeUtil.isValidPropertyName("123bad"));
    assertFalse(NodeUtil.isValidPropertyName("prop\u0100"));
  }

  @Test
  public void testPrototypeHelpers() {
    Node prototypeNode = NodeUtil.newQualifiedNameNode(convention, "MyClass.prototype.myMethod", 0, 0);
    assertTrue(NodeUtil.isPrototypeProperty(prototypeNode));
    assertEquals("myMethod", NodeUtil.getPrototypePropertyName(prototypeNode));

    Node classNameNode = NodeUtil.getPrototypeClassName(prototypeNode);
    assertNotNull(classNameNode);
    assertEquals("MyClass", classNameNode.getString());

    Node exprAssign = new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN, prototypeNode, Node.newNumber(1)));
    assertTrue(NodeUtil.isPrototypePropertyDeclaration(exprAssign));
    assertFalse(NodeUtil.isPrototypePropertyDeclaration(Node.newNumber(1)));
  }

  @Test
  public void testUndefinedAndVarNodes() {
    Node ref = Node.newString("basis");
    Node undef = NodeUtil.newUndefinedNode(ref);
    assertEquals(Token.VOID, undef.getType());

    Node var = NodeUtil.newVarNode("myVar", Node.newNumber(42));
    assertEquals(Token.VAR, var.getType());
    assertEquals("myVar", var.getFirstChild().getString());
    assertEquals(42.0, var.getFirstChild().getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void testRedeclareVarsInsideBranch() {
    Node script = new Node(Token.SCRIPT);
    Node block = new Node(Token.BLOCK);
    Node varInBlock = NodeUtil.newVarNode("innerVar", Node.newNumber(1));
    varInBlock.getFirstChild().putBooleanProp(Node.IS_CONSTANT_NAME, true);
    block.addChildToBack(varInBlock);
    script.addChildToBack(block);

    NodeUtil.redeclareVarsInsideBranch(block);
    assertEquals(Token.VAR, script.getFirstChild().getType());
    assertEquals("innerVar", script.getFirstChild().getFirstChild().getString());
    assertTrue(script.getFirstChild().getFirstChild().getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  @Test
  public void testTreeTraversalAndCounts() {
    Node tree = new Node(Token.ADD,
        Node.newString(Token.NAME, "x"),
        new Node(Token.MUL, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y"))
    );

    assertTrue(NodeUtil.containsType(tree, Token.MUL));
    assertFalse(NodeUtil.containsType(tree, Token.SUB));
    assertTrue(NodeUtil.isNameReferenced(tree, "x"));
    assertFalse(NodeUtil.isNameReferenced(tree, "z"));
    assertEquals(2, NodeUtil.getNameReferenceCount(tree, "x"));
    assertEquals(1, NodeUtil.getNameReferenceCount(tree, "y"));
    assertEquals(2, NodeUtil.getNodeTypeReferenceCount(tree, Token.NAME, Predicates.<Node>alwaysTrue()));

    final List<Integer> visitedTypesPre = new ArrayList<Integer>();
    NodeUtil.visitPreOrder(tree, new NodeUtil.Visitor() {
      public void visit(Node node) {
        visitedTypesPre.add(node.getType());
      }
    }, Predicates.<Node>alwaysTrue());
    assertEquals(5, visitedTypesPre.size());

    final List<Integer> visitedTypesPost = new ArrayList<Integer>();
    NodeUtil.visitPostOrder(tree, new NodeUtil.Visitor() {
      public void visit(Node node) {
        visitedTypesPost.add(node.getType());
      }
    }, Predicates.<Node>alwaysTrue());
    assertEquals(5, visitedTypesPost.size());
  }

  @Test
  public void testTryAndCatchBlocks() {
    Node tryBody = new Node(Token.BLOCK);
    Node catchHandler = new Node(Token.CATCH, Node.newString(Token.NAME, "e"), new Node(Token.BLOCK));
    Node catchBlock = new Node(Token.BLOCK, catchHandler);
    Node finallyBlock = new Node(Token.BLOCK);
    Node tryNode = new Node(Token.TRY, tryBody, catchBlock, finallyBlock);

    assertTrue(NodeUtil.hasFinally(tryNode));
    assertSame(catchBlock, NodeUtil.getCatchBlock(tryNode));
    assertTrue(NodeUtil.hasCatchHandler(catchBlock));
    assertFalse(NodeUtil.hasCatchHandler(new Node(Token.BLOCK)));
  }

  @Test
  public void testConstantAndJSDocHelpers() {
    Node nameNode = Node.newString(Token.NAME, "CONST_VAL");
    nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertTrue(NodeUtil.isConstantName(nameNode));

    Node objLit = new Node(Token.OBJECTLIT);
    assertTrue(NodeUtil.isConstantByConvention(convention, Node.newString("CONST_PROP"), objLit));

    JSDocInfo info = new JSDocInfo();
    nameNode.setJSDocInfo(info);
    assertSame(info, NodeUtil.getInfoForNameNode(nameNode));

    Node fn = NodeUtil.newFunctionNode("f", Collections.<Node>emptyList(), new Node(Token.BLOCK), 1, 0);
    fn.setJSDocInfo(info);
    assertSame(info, NodeUtil.getFunctionInfo(fn));

    Node srcNode = Node.newNumber(1);
    srcNode.putProp(Node.SOURCENAME_PROP, "test.js");
    assertEquals("test.js", NodeUtil.getSourceName(srcNode));
  }

  @Test
  public void testNewCallNode() {
    Node target = Node.newString(Token.NAME, "myFn");
    Node arg = Node.newNumber(123);
    Node call = NodeUtil.newCallNode(target, arg);
    assertEquals(Token.CALL, call.getType());
    assertTrue(call.getBooleanProp(Node.FREE_CALL));
    assertEquals(2, call.getChildCount());
  }

  @Test
  public void testEvaluatesToLocalValue() {
    assertTrue(NodeUtil.evaluatesToLocalValue(Node.newNumber(1)));
    assertTrue(NodeUtil.evaluatesToLocalValue(Node.newString("str")));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.OBJECTLIT)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.ARRAYLIT)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.NEW, Node.newString(Token.NAME, "Object"))));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.REGEXP, Node.newString("abc"))));

    Node comma = new Node(Token.COMMA, Node.newString(Token.NAME, "x"), Node.newNumber(1));
    assertTrue(NodeUtil.evaluatesToLocalValue(comma));

    Node andNode = new Node(Token.AND, Node.newNumber(1), Node.newNumber(2));
    assertTrue(NodeUtil.evaluatesToLocalValue(andNode));

    Node hookNode = new Node(Token.HOOK, Node.newString(Token.NAME, "c"), Node.newNumber(1), Node.newNumber(2));
    assertTrue(NodeUtil.evaluatesToLocalValue(hookNode));

    Node inc = new Node(Token.INC, Node.newString(Token.NAME, "x"));
    assertTrue(NodeUtil.evaluatesToLocalValue(inc));

    Node incPost = new Node(Token.INC, Node.newNumber(1));
    incPost.putBooleanProp(Node.INCRDECR_PROP, true);
    assertTrue(NodeUtil.evaluatesToLocalValue(incPost));

    Node toStringCall = new Node(Token.CALL, new Node(Token.GETPROP, Node.newString(Token.NAME, "x"), Node.newString("toString")));
    assertTrue(NodeUtil.evaluatesToLocalValue(toStringCall));

    Node inOp = new Node(Token.IN, Node.newString("prop"), new Node(Token.OBJECTLIT));
    assertTrue(NodeUtil.evaluatesToLocalValue(inOp));

    Node assignImm = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(5));
    assertTrue(NodeUtil.evaluatesToLocalValue(assignImm));
  }

  @Test
  public void testContainsFunctionAndReferencesThisAndContainsCall() {
    Node block = new Node(Token.BLOCK);
    assertFalse(NodeUtil.containsFunction(block));
    assertFalse(NodeUtil.referencesThis(block));
    assertFalse(NodeUtil.containsCall(block));

    Node fn = NodeUtil.newFunctionNode("f", Collections.<Node>emptyList(), new Node(Token.BLOCK), 1, 0);
    block.addChildToBack(fn);
    assertTrue(NodeUtil.containsFunction(block));

    Node thisNode = new Node(Token.THIS);
    block.addChildToBack(thisNode);
    assertTrue(NodeUtil.referencesThis(block));

    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    block.addChildToBack(callNode);
    assertTrue(NodeUtil.containsCall(block));
  }

  @Test
  public void testMatchDeclarationAndMatchShallowStatement() {
    NodeUtil.MatchDeclaration matchDecl = new NodeUtil.MatchDeclaration();
    assertTrue(matchDecl.apply(new Node(Token.VAR)));
    assertFalse(matchDecl.apply(new Node(Token.EXPR_RESULT)));

    NodeUtil.MatchShallowStatement matchShallow = new NodeUtil.MatchShallowStatement();
    assertTrue(matchShallow.apply(new Node(Token.BLOCK)));
    Node n = Node.newNumber(1);
    new Node(Token.SCRIPT, n);
    assertTrue(matchShallow.apply(n));
  }
}
