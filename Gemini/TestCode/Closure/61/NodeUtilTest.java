package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class NodeUtilTest {

  private CodingConvention defaultConvention = new ClosureCodingConvention();

  @Test
  public void testGetImpureBooleanValue() {
    Node assign = new Node(Token.ASSIGN, Node.newString("a"), Node.newNumber(1));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(assign));

    Node comma = new Node(Token.COMMA, Node.newNumber(0), Node.newString(""));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(comma));

    Node notNode = new Node(Token.NOT, Node.newNumber(1));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(notNode));

    Node andNode = new Node(Token.AND, Node.newNumber(1), Node.newNumber(2));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(andNode));

    Node orNode = new Node(Token.OR, Node.newNumber(0), Node.newString("x"));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(orNode));

    Node hook1 = new Node(Token.HOOK, Node.newString("cond"), Node.newNumber(1), Node.newNumber(2));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(hook1));

    Node hook2 = new Node(Token.HOOK, Node.newString("cond"), Node.newNumber(1), Node.newNumber(0));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(hook2));

    Node arrayLit = new Node(Token.ARRAYLIT);
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(arrayLit));

    Node objectLit = new Node(Token.OBJECTLIT);
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(objectLit));

    Node fallback = Node.newString("");
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(fallback));
  }

  @Test
  public void testGetPureBooleanValue() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(Node.newString("hello")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(Node.newString("")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(Node.newNumber(12.3)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(Node.newNumber(0.0)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(new Node(Token.NOT, Node.newNumber(1))));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(new Node(Token.NULL)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(new Node(Token.FALSE)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(new Node(Token.VOID, Node.newNumber(0))));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(new Node(Token.TRUE)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(new Node(Token.REGEXP)));

    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(Node.newString(Token.NAME, "undefined")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(Node.newString(Token.NAME, "NaN")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(Node.newString(Token.NAME, "Infinity")));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(Node.newString(Token.NAME, "other")));

    Node arr = new Node(Token.ARRAYLIT);
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(arr));

    Node obj = new Node(Token.OBJECTLIT);
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(obj));

    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(new Node(Token.CALL)));
  }

  @Test
  public void testGetStringValue() {
    assertEquals("test", NodeUtil.getStringValue(Node.newString("test")));
    assertEquals("undefined", NodeUtil.getStringValue(Node.newString(Token.NAME, "undefined")));
    assertEquals("Infinity", NodeUtil.getStringValue(Node.newString(Token.NAME, "Infinity")));
    assertEquals("NaN", NodeUtil.getStringValue(Node.newString(Token.NAME, "NaN")));
    assertNull(NodeUtil.getStringValue(Node.newString(Token.NAME, "other")));
    assertEquals("123", NodeUtil.getStringValue(Node.newNumber(123)));
    assertEquals("123.45", NodeUtil.getStringValue(Node.newNumber(123.45)));
    assertEquals("false", NodeUtil.getStringValue(new Node(Token.FALSE)));
    assertEquals("true", NodeUtil.getStringValue(new Node(Token.TRUE)));
    assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
    assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID, Node.newNumber(0))));

    Node notTrue = new Node(Token.NOT, Node.newNumber(1));
    assertEquals("false", NodeUtil.getStringValue(notTrue));
    Node notFalse = new Node(Token.NOT, Node.newNumber(0));
    assertEquals("true", NodeUtil.getStringValue(notFalse));
    Node notUnknown = new Node(Token.NOT, Node.newString(Token.NAME, "unknownVar"));
    assertNull(NodeUtil.getStringValue(notUnknown));

    Node array = new Node(Token.ARRAYLIT, Node.newString("a"), Node.newNumber(1));
    assertEquals("a,1", NodeUtil.getStringValue(array));

    Node obj = new Node(Token.OBJECTLIT);
    assertEquals("[object Object]", NodeUtil.getStringValue(obj));

    assertNull(NodeUtil.getStringValue(new Node(Token.ADD)));
  }

  @Test
  public void testGetStringValueDouble() {
    assertEquals("10", NodeUtil.getStringValue(10.0));
    assertEquals("-5", NodeUtil.getStringValue(-5.0));
    assertEquals("10.5", NodeUtil.getStringValue(10.5));
    assertEquals("-5.25", NodeUtil.getStringValue(-5.25));
  }

  @Test
  public void testGetArrayElementStringValue() {
    assertEquals("", NodeUtil.getArrayElementStringValue(new Node(Token.NULL)));
    assertEquals("", NodeUtil.getArrayElementStringValue(Node.newString(Token.NAME, "undefined")));
    assertEquals("", NodeUtil.getArrayElementStringValue(new Node(Token.EMPTY)));
    assertEquals("foo", NodeUtil.getArrayElementStringValue(Node.newString("foo")));
  }

  @Test
  public void testArrayToString() {
    Node emptyArr = new Node(Token.ARRAYLIT);
    assertEquals("", NodeUtil.arrayToString(emptyArr));

    Node arr = new Node(Token.ARRAYLIT, Node.newString("a"), new Node(Token.EMPTY), Node.newNumber(2));
    assertEquals("a,,2", NodeUtil.arrayToString(arr));

    Node arrWithNullElem = new Node(Token.ARRAYLIT, new Node(Token.CALL));
    assertNull(NodeUtil.arrayToString(arrWithNullElem));
  }

  @Test
  public void testGetNumberValue() {
    assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(new Node(Token.TRUE)));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.FALSE)));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.NULL)));
    assertEquals(Double.valueOf(42.5), NodeUtil.getNumberValue(Node.newNumber(42.5)));

    Node voidPure = new Node(Token.VOID, Node.newNumber(0));
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(voidPure)));
    Node voidSideEffect = new Node(Token.VOID, new Node(Token.CALL, Node.newString(Token.NAME, "foo")));
    assertNull(NodeUtil.getNumberValue(voidSideEffect));

    assertTrue(Double.isNaN(NodeUtil.getNumberValue(Node.newString(Token.NAME, "undefined"))));
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(Node.newString(Token.NAME, "NaN"))));
    assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), NodeUtil.getNumberValue(Node.newString(Token.NAME, "Infinity")));
    assertNull(NodeUtil.getNumberValue(Node.newString(Token.NAME, "x")));

    Node negInf = new Node(Token.NEG, Node.newString(Token.NAME, "Infinity"));
    assertEquals(Double.valueOf(Double.NEGATIVE_INFINITY), NodeUtil.getNumberValue(negInf));
    Node negOther = new Node(Token.NEG, Node.newString(Token.NAME, "x"));
    assertNull(NodeUtil.getNumberValue(negOther));

    Node not1 = new Node(Token.NOT, Node.newNumber(1));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(not1));
    Node not0 = new Node(Token.NOT, Node.newNumber(0));
    assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(not0));
    Node notUnknown = new Node(Token.NOT, Node.newString(Token.NAME, "varName"));
    assertNull(NodeUtil.getNumberValue(notUnknown));

    assertEquals(Double.valueOf(123.0), NodeUtil.getNumberValue(Node.newString("123")));

    Node arr = new Node(Token.ARRAYLIT, Node.newNumber(5));
    assertEquals(Double.valueOf(5.0), NodeUtil.getNumberValue(arr));

    Node obj = new Node(Token.OBJECTLIT);
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(obj)));

    assertNull(NodeUtil.getNumberValue(new Node(Token.ADD)));
  }

  @Test
  public void testGetStringNumberValue() {
    assertNull(NodeUtil.getStringNumberValue("hello\u000bworld"));
    assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue("   "));
    assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0xFF"));
    assertEquals(Double.valueOf(16.0), NodeUtil.getStringNumberValue("0x10"));
    assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("0xGG")));

    assertNull(NodeUtil.getStringNumberValue("+0x10"));
    assertNull(NodeUtil.getStringNumberValue("-0x10"));

    assertNull(NodeUtil.getStringNumberValue("infinity"));
    assertNull(NodeUtil.getStringNumberValue("-infinity"));
    assertNull(NodeUtil.getStringNumberValue("+infinity"));

    assertEquals(Double.valueOf(123.45), NodeUtil.getStringNumberValue("123.45"));
    assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("not_a_number")));
  }

  @Test
  public void testTrimJsWhiteSpace() {
    assertEquals("hello", NodeUtil.trimJsWhiteSpace(" \t\n\r\u00A0\u000C\u2028\u2029\uFEFFhello "));
    assertEquals("world", NodeUtil.trimJsWhiteSpace("world   "));
  }

  @Test
  public void testIsStrWhiteSpaceChar() {
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.isStrWhiteSpaceChar('\u000B'));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\n'));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\r'));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\t'));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u00A0'));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u000C'));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2028'));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2029'));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\uFEFF'));
    assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('A'));
  }

  @Test
  public void testGetFunctionNameAndGetNearestFunctionName() {
    Node fn1 = new Node(Token.FUNCTION, Node.newString(Token.NAME, "myFunc"), new Node(Token.LP), new Node(Token.BLOCK));
    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "varFunc"));
    varNode.getFirstChild().addChildToBack(fn1);
    assertEquals("varFunc", NodeUtil.getFunctionName(fn1));
    assertEquals("varFunc", NodeUtil.getNearestFunctionName(fn1));

    Node fn2 = new Node(Token.FUNCTION, Node.newString(Token.NAME, "innerFunc"), new Node(Token.LP), new Node(Token.BLOCK));
    Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "assignedFunc"), fn2);
    assertEquals("assignedFunc", NodeUtil.getFunctionName(fn2));
    assertEquals("assignedFunc", NodeUtil.getNearestFunctionName(fn2));

    Node fn3 = new Node(Token.FUNCTION, Node.newString(Token.NAME, "declaredFunc"), new Node(Token.LP), new Node(Token.BLOCK));
    Node scriptNode = new Node(Token.SCRIPT, fn3);
    assertEquals("declaredFunc", NodeUtil.getFunctionName(fn3));
    assertEquals("declaredFunc", NodeUtil.getNearestFunctionName(fn3));

    Node fn4 = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node scriptNode2 = new Node(Token.SCRIPT, fn4);
    assertNull(NodeUtil.getFunctionName(fn4));
    assertNull(NodeUtil.getNearestFunctionName(fn4));

    Node fn5 = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node strKey = Node.newString("keyName");
    strKey.addChildToBack(fn5);
    assertEquals("keyName", NodeUtil.getNearestFunctionName(fn5));

    Node fn6 = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node numKey = Node.newNumber(12);
    numKey.addChildToBack(fn6);
    assertEquals("12", NodeUtil.getNearestFunctionName(fn6));

    Node fn7 = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node getKey = new Node(Token.GET, fn7);
    getKey.setString("getKeyName");
    assertEquals("getKeyName", NodeUtil.getNearestFunctionName(fn7));
  }

  @Test
  public void testIsImmutableValue() {
    assertTrue(NodeUtil.isImmutableValue(Node.newString("str")));
    assertTrue(NodeUtil.isImmutableValue(Node.newNumber(42)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NOT, Node.newNumber(1))));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.VOID, Node.newNumber(0))));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NEG, Node.newNumber(5))));
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "undefined")));
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "Infinity")));
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "NaN")));
    assertFalse(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "foo")));
    assertFalse(NodeUtil.isImmutableValue(new Node(Token.OBJECTLIT)));
  }

  @Test
  public void testIsLiteralValue() {
    Node array = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newString("a"), new Node(Token.EMPTY));
    assertTrue(NodeUtil.isLiteralValue(array, false));

    Node arrayWithVar = new Node(Token.ARRAYLIT, Node.newString(Token.NAME, "x"));
    assertFalse(NodeUtil.isLiteralValue(arrayWithVar, false));

    Node regexp = new Node(Token.REGEXP, Node.newString("abc"));
    assertTrue(NodeUtil.isLiteralValue(regexp, false));

    Node objKey = Node.newString("k");
    objKey.addChildToBack(Node.newNumber(1));
    Node objLit = new Node(Token.OBJECTLIT, objKey);
    assertTrue(NodeUtil.isLiteralValue(objLit, false));

    Node objKeyVar = Node.newString("k");
    objKeyVar.addChildToBack(Node.newString(Token.NAME, "x"));
    Node objLitVar = new Node(Token.OBJECTLIT, objKeyVar);
    assertFalse(NodeUtil.isLiteralValue(objLitVar, false));

    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"), fn);
    assertTrue(NodeUtil.isLiteralValue(fn, true));
    assertFalse(NodeUtil.isLiteralValue(fn, false));
  }

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = Sets.newHashSet("MY_DEF", "pkg.CONST");

    assertTrue(NodeUtil.isValidDefineValue(Node.newString("str"), defines));
    assertTrue(NodeUtil.isValidDefineValue(Node.newNumber(1), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.TRUE), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.FALSE), defines));

    Node addNode = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
    assertTrue(NodeUtil.isValidDefineValue(addNode, defines));

    Node notNode = new Node(Token.NOT, new Node(Token.TRUE));
    assertTrue(NodeUtil.isValidDefineValue(notNode, defines));

    assertTrue(NodeUtil.isValidDefineValue(Node.newString(Token.NAME, "MY_DEF"), defines));
    assertFalse(NodeUtil.isValidDefineValue(Node.newString(Token.NAME, "UNKNOWN"), defines));

    Node qname = new Node(Token.GETPROP, Node.newString(Token.NAME, "pkg"), Node.newString("CONST"));
    assertTrue(NodeUtil.isValidDefineValue(qname, defines));

    assertFalse(NodeUtil.isValidDefineValue(new Node(Token.ARRAYLIT), defines));
  }

  @Test
  public void testIsEmptyBlock() {
    assertFalse(NodeUtil.isEmptyBlock(new Node(Token.SCRIPT)));
    assertTrue(NodeUtil.isEmptyBlock(new Node(Token.BLOCK)));
    assertTrue(NodeUtil.isEmptyBlock(new Node(Token.BLOCK, new Node(Token.EMPTY))));
    assertFalse(NodeUtil.isEmptyBlock(new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1)))));
  }

  @Test
  public void testIsSimpleOperator() {
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.ADD)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.URSH)));
    assertFalse(NodeUtil.isSimpleOperator(new Node(Token.ASSIGN)));
    assertFalse(NodeUtil.isSimpleOperator(new Node(Token.HOOK)));
  }

  @Test
  public void testNewExpr() {
    Node child = Node.newNumber(1);
    child.setLineno(10);
    child.setCharno(5);
    Node expr = NodeUtil.newExpr(child);
    assertEquals(Token.EXPR_RESULT, expr.getType());
    assertSame(child, expr.getFirstChild());
    assertEquals(10, expr.getLineno());
    assertEquals(5, expr.getCharno());
  }

  @Test
  public void testMayHaveSideEffectsAndMayEffectMutableState() {
    Node num = Node.newNumber(1);
    assertFalse(NodeUtil.mayHaveSideEffects(num));
    assertFalse(NodeUtil.mayEffectMutableState(num));

    Node throwNode = new Node(Token.THROW, Node.newString("err"));
    assertTrue(NodeUtil.mayHaveSideEffects(throwNode));
    assertTrue(NodeUtil.mayEffectMutableState(throwNode));

    Node objLit = new Node(Token.OBJECTLIT);
    assertFalse(NodeUtil.mayHaveSideEffects(objLit));
    assertTrue(NodeUtil.mayEffectMutableState(objLit));

    Node arrLit = new Node(Token.ARRAYLIT);
    assertFalse(NodeUtil.mayHaveSideEffects(arrLit));
    assertTrue(NodeUtil.mayEffectMutableState(arrLit));

    Node nameWithChild = Node.newString(Token.NAME, "x");
    nameWithChild.addChildToBack(Node.newNumber(1));
    assertTrue(NodeUtil.mayHaveSideEffects(nameWithChild));

    Node nameWithoutChild = Node.newString(Token.NAME, "x");
    assertFalse(NodeUtil.mayHaveSideEffects(nameWithoutChild));

    Node fnExpr = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"), fnExpr);
    assertFalse(NodeUtil.mayHaveSideEffects(fnExpr));
    assertTrue(NodeUtil.mayEffectMutableState(fnExpr));

    Node newNoSideEffects = new Node(Token.NEW, Node.newString(Token.NAME, "Object"));
    assertFalse(NodeUtil.mayHaveSideEffects(newNoSideEffects));
    assertTrue(NodeUtil.mayEffectMutableState(newNoSideEffects));

    Node callNoSideEffects = new Node(Token.CALL, Node.newString(Token.NAME, "String"));
    assertFalse(NodeUtil.mayHaveSideEffects(callNoSideEffects));

    Node assignToName = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(1));
    assertTrue(NodeUtil.mayHaveSideEffects(assignToName));

    Node assignPropOfLocal = new Node(Token.ASSIGN,
        new Node(Token.GETPROP, new Node(Token.OBJECTLIT), Node.newString("prop")),
        Node.newNumber(1));
    assertFalse(NodeUtil.mayHaveSideEffects(assignPropOfLocal));
  }

  @Test
  public void testConstructorCallHasSideEffects() {
    Node newObj = new Node(Token.NEW, Node.newString(Token.NAME, "Object"));
    assertFalse(NodeUtil.constructorCallHasSideEffects(newObj));

    Node newCustom = new Node(Token.NEW, Node.newString(Token.NAME, "CustomClass"));
    assertTrue(NodeUtil.constructorCallHasSideEffects(newCustom));

    Node newFlagged = new Node(Token.NEW, Node.newString(Token.NAME, "CustomClass"));
    newFlagged.setSideEffectFlags(Node.NO_SIDE_EFFECTS);
    assertFalse(NodeUtil.constructorCallHasSideEffects(newFlagged));
  }

  @Test(expected = IllegalStateException.class)
  public void testConstructorCallHasSideEffects_NonNewThrows() {
    NodeUtil.constructorCallHasSideEffects(new Node(Token.CALL));
  }

  @Test
  public void testFunctionCallHasSideEffects() {
    Node callMath = new Node(Token.CALL, Node.newString(Token.NAME, "Math"));
    assertTrue(NodeUtil.functionCallHasSideEffects(callMath));

    Node callBuiltin = new Node(Token.CALL, Node.newString(Token.NAME, "String"));
    assertFalse(NodeUtil.functionCallHasSideEffects(callBuiltin));

    Node callFlagged = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    callFlagged.setSideEffectFlags(Node.NO_SIDE_EFFECTS);
    assertFalse(NodeUtil.functionCallHasSideEffects(callFlagged));

    Node callToString = new Node(Token.CALL, new Node(Token.GETPROP, Node.newString(Token.NAME, "x"), Node.newString("toString")));
    assertFalse(NodeUtil.functionCallHasSideEffects(callToString));

    Node callModifiesThis = new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.OBJECTLIT), Node.newString("method")));
    callModifiesThis.setSideEffectFlags(Node.MODIFIES_THIS);
    assertFalse(NodeUtil.functionCallHasSideEffects(callModifiesThis));
  }

  @Test(expected = IllegalStateException.class)
  public void testFunctionCallHasSideEffects_NonCallThrows() {
    NodeUtil.functionCallHasSideEffects(new Node(Token.NEW));
  }

  @Test
  public void testCallHasLocalResultAndNewHasLocalResult() {
    Node call = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    call.setSideEffectFlags(Node.FLAG_LOCAL_RESULTS);
    assertTrue(NodeUtil.callHasLocalResult(call));

    Node newObj = new Node(Token.NEW, Node.newString(Token.NAME, "foo"));
    newObj.setSideEffectFlags(Node.MODIFIES_THIS);
    assertTrue(NodeUtil.newHasLocalResult(newObj));
  }

  @Test
  public void testNodeTypeMayHaveSideEffects() {
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.ASSIGN)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DELPROP)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DEC)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.INC)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.THROW)));
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(Node.newNumber(1)));

    Node nameWithChild = Node.newString(Token.NAME, "x");
    nameWithChild.addChildToBack(Node.newNumber(1));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameWithChild));

    Node nameNoChild = Node.newString(Token.NAME, "x");
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(nameNoChild));
  }

  @Test
  public void testCanBeSideEffected() {
    assertTrue(NodeUtil.canBeSideEffected(new Node(Token.CALL, Node.newString(Token.NAME, "foo"))));
    assertTrue(NodeUtil.canBeSideEffected(new Node(Token.NEW, Node.newString(Token.NAME, "foo"))));
    assertTrue(NodeUtil.canBeSideEffected(Node.newString(Token.NAME, "mutableVar")));
    assertFalse(NodeUtil.canBeSideEffected(Node.newString(Token.NAME, "constVar"), Sets.newHashSet("constVar")));

    Node constName = Node.newString(Token.NAME, "k");
    constName.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertFalse(NodeUtil.canBeSideEffected(constName));

    assertTrue(NodeUtil.canBeSideEffected(new Node(Token.GETPROP, constName, Node.newString("prop"))));
    assertTrue(NodeUtil.canBeSideEffected(new Node(Token.GETELEM, constName, Node.newNumber(0))));

    Node fnExpr = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"), fnExpr);
    assertFalse(NodeUtil.canBeSideEffected(fnExpr));
  }

  @Test
  public void testPrecedence() {
    assertEquals(0, NodeUtil.precedence(Token.COMMA));
    assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    assertEquals(2, NodeUtil.precedence(Token.HOOK));
    assertEquals(3, NodeUtil.precedence(Token.OR));
    assertEquals(4, NodeUtil.precedence(Token.AND));
    assertEquals(5, NodeUtil.precedence(Token.BITOR));
    assertEquals(6, NodeUtil.precedence(Token.BITXOR));
    assertEquals(7, NodeUtil.precedence(Token.BITAND));
    assertEquals(8, NodeUtil.precedence(Token.EQ));
    assertEquals(9, NodeUtil.precedence(Token.LT));
    assertEquals(10, NodeUtil.precedence(Token.LSH));
    assertEquals(11, NodeUtil.precedence(Token.ADD));
    assertEquals(12, NodeUtil.precedence(Token.MUL));
    assertEquals(13, NodeUtil.precedence(Token.NOT));
    assertEquals(15, NodeUtil.precedence(Token.CALL));
  }

  @Test(expected = Error.class)
  public void testPrecedence_UnknownTypeThrows() {
    NodeUtil.precedence(-9999);
  }

  @Test
  public void testIsNumericResult() {
    assertTrue(NodeUtil.isNumericResult(Node.newNumber(1)));
    assertTrue(NodeUtil.isNumericResult(new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2))));
    assertFalse(NodeUtil.isNumericResult(new Node(Token.ADD, Node.newString("a"), Node.newNumber(2))));
    assertTrue(NodeUtil.isNumericResult(new Node(Token.SUB, Node.newNumber(1), Node.newNumber(2))));
    assertTrue(NodeUtil.isNumericResult(Node.newString(Token.NAME, "NaN")));
    assertTrue(NodeUtil.isNumericResult(Node.newString(Token.NAME, "Infinity")));
    assertFalse(NodeUtil.isNumericResult(Node.newString(Token.NAME, "other")));
  }

  @Test
  public void testIsBooleanResult() {
    assertTrue(NodeUtil.isBooleanResult(new Node(Token.TRUE)));
    assertTrue(NodeUtil.isBooleanResult(new Node(Token.FALSE)));
    assertTrue(NodeUtil.isBooleanResult(new Node(Token.EQ, Node.newNumber(1), Node.newNumber(2))));
    assertTrue(NodeUtil.isBooleanResult(new Node(Token.IN, Node.newString("k"), new Node(Token.OBJECTLIT))));
    assertTrue(NodeUtil.isBooleanResult(new Node(Token.NOT, Node.newNumber(1))));
    assertTrue(NodeUtil.isBooleanResult(new Node(Token.DELPROP, Node.newString(Token.NAME, "x"))));
    assertFalse(NodeUtil.isBooleanResult(Node.newNumber(1)));
  }

  @Test
  public void testIsUndefinedAndIsNull() {
    assertTrue(NodeUtil.isUndefined(new Node(Token.VOID, Node.newNumber(0))));
    assertTrue(NodeUtil.isUndefined(Node.newString(Token.NAME, "undefined")));
    assertFalse(NodeUtil.isUndefined(Node.newString(Token.NAME, "null")));

    assertTrue(NodeUtil.isNull(new Node(Token.NULL)));
    assertFalse(NodeUtil.isNull(Node.newString(Token.NAME, "null")));

    assertTrue(NodeUtil.isNullOrUndefined(new Node(Token.NULL)));
    assertTrue(NodeUtil.isNullOrUndefined(new Node(Token.VOID, Node.newNumber(0))));
    assertFalse(NodeUtil.isNullOrUndefined(Node.newNumber(0)));
  }

  @Test
  public void testMayBeString() {
    assertTrue(NodeUtil.mayBeString(Node.newString("str")));
    assertFalse(NodeUtil.mayBeString(Node.newNumber(1)));
    assertFalse(NodeUtil.mayBeString(new Node(Token.TRUE)));
    assertFalse(NodeUtil.mayBeString(new Node(Token.NULL)));
    assertFalse(NodeUtil.mayBeString(new Node(Token.VOID, Node.newNumber(0))));
    assertTrue(NodeUtil.mayBeString(Node.newString(Token.NAME, "x"), false));
  }

  @Test
  public void testIsAssociativeAndIsCommutative() {
    assertTrue(NodeUtil.isAssociative(Token.MUL));
    assertTrue(NodeUtil.isAssociative(Token.AND));
    assertFalse(NodeUtil.isAssociative(Token.ADD));
    assertFalse(NodeUtil.isAssociative(Token.SUB));

    assertTrue(NodeUtil.isCommutative(Token.MUL));
    assertTrue(NodeUtil.isCommutative(Token.BITOR));
    assertFalse(NodeUtil.isCommutative(Token.ADD));
    assertFalse(NodeUtil.isCommutative(Token.SUB));
  }

  @Test
  public void testIsAssignmentOpAndGetOpFromAssignmentOp() {
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_BITOR)));
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_ADD)));
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
  public void testGetOpFromAssignmentOp_ThrowsOnNonAssign() {
    NodeUtil.getOpFromAssignmentOp(new Node(Token.ADD));
  }

  @Test
  public void testNodePredicates() {
    assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT)));
    assertFalse(NodeUtil.isExpressionNode(new Node(Token.BLOCK)));

    assertTrue(NodeUtil.isGet(new Node(Token.GETPROP)));
    assertTrue(NodeUtil.isGet(new Node(Token.GETELEM)));
    assertFalse(NodeUtil.isGet(new Node(Token.NAME)));

    assertTrue(NodeUtil.isGetProp(new Node(Token.GETPROP)));
    assertFalse(NodeUtil.isGetProp(new Node(Token.GETELEM)));

    assertTrue(NodeUtil.isName(Node.newString(Token.NAME, "a")));
    assertTrue(NodeUtil.isNew(new Node(Token.NEW)));
    assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
    assertTrue(NodeUtil.isString(Node.newString("a")));
    assertTrue(NodeUtil.isAssign(new Node(Token.ASSIGN)));
    assertTrue(NodeUtil.isCall(new Node(Token.CALL)));
    assertTrue(NodeUtil.isCallOrNew(new Node(Token.CALL)));
    assertTrue(NodeUtil.isCallOrNew(new Node(Token.NEW)));
    assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
    assertTrue(NodeUtil.isThis(new Node(Token.THIS)));
    assertTrue(NodeUtil.isArrayLiteral(new Node(Token.ARRAYLIT)));
    assertTrue(NodeUtil.isSwitchCase(new Node(Token.CASE)));
    assertTrue(NodeUtil.isSwitchCase(new Node(Token.DEFAULT)));
    assertTrue(NodeUtil.isLabelName(new Node(Token.LABEL_NAME)));
  }

  @Test
  public void testContainsFunctionAndReferencesThisAndContainsCall() {
    Node block = new Node(Token.BLOCK,
        new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK)),
        new Node(Token.THIS),
        new Node(Token.CALL, Node.newString(Token.NAME, "foo")));

    assertTrue(NodeUtil.containsFunction(block));
    assertTrue(NodeUtil.referencesThis(block));
    assertTrue(NodeUtil.containsCall(block));

    Node emptyBlock = new Node(Token.BLOCK);
    assertFalse(NodeUtil.containsFunction(emptyBlock));
    assertFalse(NodeUtil.referencesThis(emptyBlock));
    assertFalse(NodeUtil.containsCall(emptyBlock));
  }

  @Test
  public void testIsVarDeclarationAndGetAssignedValue() {
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "x");
    Node valueNode = Node.newNumber(10);
    nameNode.addChildToBack(valueNode);
    varNode.addChildToBack(nameNode);

    assertTrue(NodeUtil.isVarDeclaration(nameNode));
    assertEquals(valueNode, NodeUtil.getAssignedValue(nameNode));

    Node assignName = Node.newString(Token.NAME, "y");
    Node assignVal = Node.newNumber(20);
    Node assign = new Node(Token.ASSIGN, assignName, assignVal);
    assertEquals(assignVal, NodeUtil.getAssignedValue(assignName));

    Node standaloneName = Node.newString(Token.NAME, "z");
    new Node(Token.EXPR_RESULT, standaloneName);
    assertNull(NodeUtil.getAssignedValue(standaloneName));
  }

  @Test
  public void testIsExprAssignAndIsExprCall() {
    Node exprAssign = new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(1)));
    assertTrue(NodeUtil.isExprAssign(exprAssign));
    assertFalse(NodeUtil.isExprCall(exprAssign));

    Node exprCall = new Node(Token.EXPR_RESULT, new Node(Token.CALL, Node.newString(Token.NAME, "f")));
    assertTrue(NodeUtil.isExprCall(exprCall));
    assertFalse(NodeUtil.isExprAssign(exprCall));
  }

  @Test
  public void testLoopsAndControlStructures() {
    Node forNode = new Node(Token.FOR, Node.newString(Token.NAME, "i"), new Node(Token.BLOCK));
    Node forInNode = new Node(Token.FOR, Node.newString(Token.NAME, "k"), new Node(Token.OBJECTLIT), new Node(Token.BLOCK));
    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), new Node(Token.TRUE));
    Node whileNode = new Node(Token.WHILE, new Node(Token.TRUE), new Node(Token.BLOCK));

    assertTrue(NodeUtil.isForIn(forInNode));
    assertFalse(NodeUtil.isForIn(forNode));

    assertTrue(NodeUtil.isLoopStructure(forNode));
    assertTrue(NodeUtil.isLoopStructure(doNode));
    assertTrue(NodeUtil.isLoopStructure(whileNode));
    assertFalse(NodeUtil.isLoopStructure(new Node(Token.IF)));

    assertSame(whileNode.getLastChild(), NodeUtil.getLoopCodeBlock(whileNode));
    assertSame(doNode.getFirstChild(), NodeUtil.getLoopCodeBlock(doNode));
    assertNull(NodeUtil.getLoopCodeBlock(new Node(Token.IF)));

    Node inner = Node.newNumber(1);
    whileNode.getLastChild().addChildToBack(inner);
    assertTrue(NodeUtil.isWithinLoop(inner));
    assertFalse(NodeUtil.isWithinLoop(whileNode));

    assertTrue(NodeUtil.isControlStructure(new Node(Token.IF)));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.SWITCH)));
    assertFalse(NodeUtil.isControlStructure(new Node(Token.EXPR_RESULT)));
  }

  @Test
  public void testIsControlStructureCodeBlock() {
    Node block = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.EMPTY), block);
    assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, block));

    Node ifCond = Node.newString(Token.NAME, "c");
    Node ifBody = new Node(Token.BLOCK);
    Node ifNode = new Node(Token.IF, ifCond, ifBody);
    assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, ifCond));
    assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, ifBody));
  }

  @Test
  public void testGetConditionExpression() {
    Node cond = Node.newString(Token.NAME, "c");
    Node ifNode = new Node(Token.IF, cond, new Node(Token.BLOCK));
    assertSame(cond, NodeUtil.getConditionExpression(ifNode));

    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), cond);
    assertSame(cond, NodeUtil.getConditionExpression(doNode));

    Node forInNode = new Node(Token.FOR, Node.newString(Token.NAME, "k"), new Node(Token.OBJECTLIT), new Node(Token.BLOCK));
    assertNull(NodeUtil.getConditionExpression(forInNode));

    Node for4Node = new Node(Token.FOR, new Node(Token.EMPTY), cond, new Node(Token.EMPTY), new Node(Token.BLOCK));
    assertSame(cond, NodeUtil.getConditionExpression(for4Node));

    Node caseNode = new Node(Token.CASE, cond, new Node(Token.BLOCK));
    assertNull(NodeUtil.getConditionExpression(caseNode));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_ThrowsOnNonCondition() {
    NodeUtil.getConditionExpression(new Node(Token.EXPR_RESULT));
  }

  @Test
  public void testStatements() {
    assertTrue(NodeUtil.isStatementBlock(new Node(Token.SCRIPT)));
    assertTrue(NodeUtil.isStatementBlock(new Node(Token.BLOCK)));
    assertFalse(NodeUtil.isStatementBlock(new Node(Token.EXPR_RESULT)));

    Node script = new Node(Token.SCRIPT);
    Node expr = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    script.addChildToBack(expr);
    assertTrue(NodeUtil.isStatement(expr));
    assertTrue(NodeUtil.isStatementParent(script));
    assertFalse(NodeUtil.isStatementParent(expr));
  }

  @Test
  public void testIsReferenceName() {
    assertTrue(NodeUtil.isReferenceName(Node.newString(Token.NAME, "myVar")));
    assertFalse(NodeUtil.isReferenceName(Node.newString(Token.NAME, "")));
    assertFalse(NodeUtil.isReferenceName(Node.newString("myVar")));
  }

  @Test
  public void testTryCatchFinallyUtilsAndRemoveChild() {
    Node tryBody = new Node(Token.BLOCK);
    Node catchBlock = new Node(Token.BLOCK);
    Node finallyBlock = new Node(Token.BLOCK);
    Node tryNode = new Node(Token.TRY, tryBody, catchBlock, finallyBlock);

    assertTrue(NodeUtil.hasFinally(tryNode));
    assertSame(catchBlock, NodeUtil.getCatchBlock(tryNode));
    assertFalse(NodeUtil.hasCatchHandler(catchBlock));

    Node catchNode = new Node(Token.CATCH, Node.newString(Token.NAME, "e"), new Node(Token.BLOCK));
    catchBlock.addChildToBack(catchNode);
    assertTrue(NodeUtil.hasCatchHandler(catchBlock));

    assertTrue(NodeUtil.isTryFinallyNode(tryNode, finallyBlock));
    assertTrue(NodeUtil.isTryCatchNodeContainer(catchBlock));

    NodeUtil.removeChild(tryNode, finallyBlock);
    assertFalse(NodeUtil.hasFinally(tryNode));

    NodeUtil.maybeAddFinally(tryNode);
    assertTrue(NodeUtil.hasFinally(tryNode));

    Node script = new Node(Token.SCRIPT);
    Node stmt = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    script.addChildToBack(stmt);
    NodeUtil.removeChild(script, stmt);
    assertFalse(script.hasChildren());
  }

  @Test
  public void testTryMergeBlock() {
    Node script = new Node(Token.SCRIPT);
    Node innerBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1)));
    script.addChildToBack(innerBlock);

    assertTrue(NodeUtil.tryMergeBlock(innerBlock));
    assertEquals(1, script.getChildCount());
    assertEquals(Token.EXPR_RESULT, script.getFirstChild().getType());

    Node nonStatementParent = new Node(Token.EXPR_RESULT, innerBlock);
    assertFalse(NodeUtil.tryMergeBlock(innerBlock));
  }

  @Test
  public void testFunctionHelpers() {
    Node fnName = Node.newString(Token.NAME, "testFn");
    Node params = new Node(Token.LP, Node.newString(Token.NAME, "p1"));
    Node body = new Node(Token.BLOCK);
    Node fn = new Node(Token.FUNCTION, fnName, params, body);

    assertSame(body, NodeUtil.getFunctionBody(fn));
    assertSame(params, NodeUtil.getFunctionParameters(fn));
    assertSame(params.getFirstChild(), NodeUtil.getArgumentForFunction(fn, 0));
    assertNull(NodeUtil.getArgumentForFunction(fn, 1));

    Node script = new Node(Token.SCRIPT, fn);
    assertTrue(NodeUtil.isFunctionDeclaration(fn));
    assertTrue(NodeUtil.isHoistedFunctionDeclaration(fn));
    assertFalse(NodeUtil.isFunctionExpression(fn));

    Node exprFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), exprFn);
    assertTrue(NodeUtil.isFunctionExpression(exprFn));
    assertTrue(NodeUtil.isEmptyFunctionExpression(exprFn));

    Node fnWithArgs = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP),
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "arguments"))));
    assertTrue(NodeUtil.isVarArgsFunction(fnWithArgs));
  }

  @Test
  public void testMethodCallHelpers() {
    Node callMethod = new Node(Token.CALL,
        new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString("call")),
        Node.newNumber(1));
    assertTrue(NodeUtil.isObjectCallMethod(callMethod, "call"));
    assertTrue(NodeUtil.isFunctionObjectCall(callMethod));
    assertTrue(NodeUtil.isFunctionObjectCallOrApply(callMethod));
    assertTrue(NodeUtil.isSimpleFunctionObjectCall(callMethod));

    Node applyMethod = new Node(Token.CALL,
        new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString("apply")));
    assertTrue(NodeUtil.isFunctionObjectApply(applyMethod));
    assertTrue(NodeUtil.isFunctionObjectCallOrApply(applyMethod));
  }

  @Test
  public void testIsVarOrSimpleAssignLhsAndIsLValue() {
    Node varName = Node.newString(Token.NAME, "x");
    Node var = new Node(Token.VAR, varName);
    assertTrue(NodeUtil.isVarOrSimpleAssignLhs(varName, var));
    assertTrue(NodeUtil.isLValue(varName));

    Node assignName = Node.newString(Token.NAME, "y");
    Node assign = new Node(Token.ASSIGN, assignName, Node.newNumber(1));
    assertTrue(NodeUtil.isVarOrSimpleAssignLhs(assignName, assign));
    assertTrue(NodeUtil.isLValue(assignName));
  }

  @Test
  public void testObjectLitKeys() {
    Node keyStr = Node.newString("prop");
    Node objLit = new Node(Token.OBJECTLIT, keyStr);
    assertTrue(NodeUtil.isObjectLitKey(keyStr, objLit));
    assertEquals("prop", NodeUtil.getObjectLitKeyName(keyStr));
    assertFalse(NodeUtil.isGetOrSetKey(keyStr));

    Node getKey = new Node(Token.GET, Node.newString(Token.NAME, "getter"));
    getKey.setString("myGet");
    assertTrue(NodeUtil.isGetOrSetKey(getKey));
    assertEquals("myGet", NodeUtil.getObjectLitKeyName(getKey));

    Node setKey = new Node(Token.SET, Node.newString(Token.NAME, "setter"));
    setKey.setString("mySet");
    assertTrue(NodeUtil.isGetOrSetKey(setKey));
    assertEquals("mySet", NodeUtil.getObjectLitKeyName(setKey));

    JSTypeRegistry registry = new JSTypeRegistry(null);
    FunctionType getFnType = registry.createFunctionType(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE));
    JSType retType = NodeUtil.getObjectLitKeyTypeFromValueType(getKey, getFnType);
    assertNotNull(retType);

    FunctionType setFnType = registry.createFunctionType(
        registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE),
        registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE));
    JSType paramType = NodeUtil.getObjectLitKeyTypeFromValueType(setKey, setFnType);
    assertNotNull(paramType);
  }

  @Test
  public void testOpToStr() {
    assertEquals("+", NodeUtil.opToStr(Token.ADD));
    assertEquals("===", NodeUtil.opToStr(Token.SHEQ));
    assertEquals("void", NodeUtil.opToStr(Token.VOID));
    assertEquals("typeof", NodeUtil.opToStr(Token.TYPEOF));
    assertEquals("instanceof", NodeUtil.opToStr(Token.INSTANCEOF));
    assertNull(NodeUtil.opToStr(Token.FUNCTION));

    assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
  }

  @Test(expected = Error.class)
  public void testOpToStrNoFail_ThrowsOnNonOp() {
    NodeUtil.opToStrNoFail(Token.FUNCTION);
  }

  @Test
  public void testRedeclareVarsInsideBranch() {
    Node branch = new Node(Token.BLOCK,
        new Node(Token.VAR, Node.newString(Token.NAME, "a")),
        new Node(Token.VAR, Node.newString(Token.NAME, "b")));
    Node script = new Node(Token.SCRIPT, branch);

    NodeUtil.redeclareVarsInsideBranch(branch);
    assertEquals(Token.VAR, script.getFirstChild().getType());
  }

  @Test
  public void testNewFunctionNodeAndNewQualifiedNameNode() {
    List<Node> params = Arrays.asList(Node.newString(Token.NAME, "p1"), Node.newString(Token.NAME, "p2"));
    Node fn = NodeUtil.newFunctionNode("myFunc", params, new Node(Token.BLOCK), 1, 2);
    assertEquals(Token.FUNCTION, fn.getType());
    assertEquals("myFunc", fn.getFirstChild().getString());

    Node qnameSingle = NodeUtil.newQualifiedNameNode(defaultConvention, "single", 1, 2);
    assertEquals(Token.NAME, qnameSingle.getType());
    assertEquals("single", qnameSingle.getString());

    Node qnameProp = NodeUtil.newQualifiedNameNode(defaultConvention, "a.b.c", 1, 2);
    assertEquals(Token.GETPROP, qnameProp.getType());
    assertEquals("a.b.c", qnameProp.getQualifiedName());

    Node basis = Node.newString(Token.NAME, "orig");
    basis.setLineno(10);
    Node qnameWithBasis = NodeUtil.newQualifiedNameNode(defaultConvention, "x.y", basis, "origName");
    assertEquals("x.y", qnameWithBasis.getQualifiedName());

    Node rootOfQname = NodeUtil.getRootOfQualifiedName(qnameProp);
    assertEquals(Token.NAME, rootOfQname.getType());
    assertEquals("a", rootOfQname.getString());
  }

  @Test
  public void testNewNameAndIsLatinAndIsValidPropertyName() {
    Node basis = Node.newString(Token.NAME, "oldName");
    Node newN = NodeUtil.newName(defaultConvention, "newName", basis, "oldName");
    assertEquals("newName", newN.getString());

    assertTrue(NodeUtil.isLatin("helloWorld123"));
    assertFalse(NodeUtil.isLatin("สวัสดี"));

    assertTrue(NodeUtil.isValidPropertyName("validProp"));
    assertFalse(NodeUtil.isValidPropertyName("class"));
    assertFalse(NodeUtil.isValidPropertyName("invalid-prop"));
  }

  @Test
  public void testPrototypeHelpers() {
    Node protoProp = new Node(Token.GETPROP,
        new Node(Token.GETPROP, Node.newString(Token.NAME, "MyClass"), Node.newString("prototype")),
        Node.newString("myMethod"));
    Node assign = new Node(Token.ASSIGN, protoProp, Node.newNumber(1));
    Node expr = new Node(Token.EXPR_RESULT, assign);

    assertTrue(NodeUtil.isPrototypePropertyDeclaration(expr));
    assertTrue(NodeUtil.isPrototypeProperty(protoProp));
    assertEquals("MyClass", NodeUtil.getPrototypeClassName(protoProp).getString());
    assertEquals("myMethod", NodeUtil.getPrototypePropertyName(protoProp));
  }

  @Test
  public void testNewUndefinedNodeAndNewVarNode() {
    Node undef = NodeUtil.newUndefinedNode(null);
    assertEquals(Token.VOID, undef.getType());

    Node var = NodeUtil.newVarNode("v", Node.newNumber(123));
    assertEquals(Token.VAR, var.getType());
    assertEquals("v", var.getFirstChild().getString());
    assertEquals(123.0, var.getFirstChild().getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void testReferenceCountAndPredicates() {
    Node tree = new Node(Token.BLOCK,
        Node.newString(Token.NAME, "foo"),
        new Node(Token.BLOCK, Node.newString(Token.NAME, "foo")),
        Node.newString(Token.NAME, "bar"));

    assertTrue(NodeUtil.isNameReferenced(tree, "foo"));
    assertFalse(NodeUtil.isNameReferenced(tree, "baz"));
    assertEquals(2, NodeUtil.getNameReferenceCount(tree, "foo"));
    assertEquals(3, NodeUtil.getNodeTypeReferenceCount(tree, Token.NAME, Predicates.<Node>alwaysTrue()));

    List<Node> preOrderList = new ArrayList<Node>();
    NodeUtil.visitPreOrder(tree, new NodeUtil.Visitor() {
      public void visit(Node node) {
        preOrderList.add(node);
      }
    }, Predicates.<Node>alwaysTrue());
    assertTrue(preOrderList.size() >= 4);

    List<Node> postOrderList = new ArrayList<Node>();
    NodeUtil.visitPostOrder(tree, new NodeUtil.Visitor() {
      public void visit(Node node) {
        postOrderList.add(node);
      }
    }, Predicates.<Node>alwaysTrue());
    assertTrue(postOrderList.size() >= 4);
  }

  @Test
  public void testJSDocAndSourceName() {
    Node nameNode = Node.newString(Token.NAME, "x");
    Node varNode = new Node(Token.VAR, nameNode);
    JSDocInfo info = new JSDocInfo();
    varNode.setJSDocInfo(info);
    assertSame(info, NodeUtil.getInfoForNameNode(nameNode));

    Node fnNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    fnNode.setJSDocInfo(info);
    assertSame(info, NodeUtil.getFunctionJSDocInfo(fnNode));

    fnNode.putProp(Node.SOURCENAME_PROP, "test.js");
    assertEquals("test.js", NodeUtil.getSourceName(fnNode));
    assertEquals("test.js", NodeUtil.getSourceName(fnNode.getFirstChild()));
  }

  @Test
  public void testNewCallNodeAndEvaluatesToLocalValueAndArgumentForCall() {
    Node target = Node.newString(Token.NAME, "fn");
    Node arg = Node.newNumber(1);
    Node call = NodeUtil.newCallNode(target, arg);
    assertEquals(Token.CALL, call.getType());
    assertTrue(call.getBooleanProp(Node.FREE_CALL));
    assertSame(arg, NodeUtil.getArgumentForCallOrNew(call, 0));
    assertNull(NodeUtil.getArgumentForCallOrNew(call, 1));

    assertTrue(NodeUtil.evaluatesToLocalValue(Node.newNumber(1)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.OBJECTLIT)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.ARRAYLIT)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.REGEXP)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.DELPROP, Node.newString(Token.NAME, "a"))));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.IN, Node.newString("a"), new Node(Token.OBJECTLIT))));
  }

  @Test
  public void testIsConstantNameAndIsConstantByConvention() {
    Node name = Node.newString(Token.NAME, "MY_CONST");
    assertFalse(NodeUtil.isConstantName(name));
    name.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertTrue(NodeUtil.isConstantName(name));

    Node getProp = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), name);
    assertTrue(NodeUtil.isConstantByConvention(defaultConvention, name, getProp));

    Node parentBlock = new Node(Token.BLOCK);
    assertTrue(NodeUtil.isConstantByConvention(defaultConvention, name, parentBlock));
  }
}
