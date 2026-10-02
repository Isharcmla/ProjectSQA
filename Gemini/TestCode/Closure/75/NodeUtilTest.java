package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class NodeUtilTest {

  private CodingConvention convention = new DefaultCodingConvention();

  @Test
  public void testNewExpr_createsExprResult() {
    Node child = Node.newString("hello");
    child.setLineno(10);
    child.setCharno(5);
    Node expr = NodeUtil.newExpr(child);

    assertEquals(Token.EXPR_RESULT, expr.getType());
    assertSame(child, expr.getFirstChild());
    assertEquals(10, expr.getLineno());
    assertEquals(5, expr.getCharno());
  }

  @Test
  public void testGetVarsDeclaredInBranch_variousVarDeclarations() {
    Node root = new Node(Token.BLOCK);
    Node var1 = NodeUtil.newVarNode("x", Node.newNumber(1));
    Node var2 = new Node(Token.VAR, Node.newString(Token.NAME, "y"), Node.newString(Token.NAME, "z"));
    root.addChildToBack(var1);
    root.addChildToBack(var2);

    // Inner function with its own var should not be collected
    Node innerFn = NodeUtil.newFunctionNode("foo", Collections.<Node>emptyList(),
        new Node(Token.BLOCK, NodeUtil.newVarNode("innerVar", null)), 0, 0);
    root.addChildToBack(innerFn);

    Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
    assertEquals(3, vars.size());
  }

  @Test
  public void testNewFunctionNode_createsValidFunction() {
    List<Node> params = new ArrayList<Node>();
    params.add(Node.newString(Token.NAME, "a"));
    params.add(Node.newString(Token.NAME, "b"));
    Node body = new Node(Token.BLOCK);

    Node fn = NodeUtil.newFunctionNode("testFn", params, body, 1, 2);

    assertEquals(Token.FUNCTION, fn.getType());
    assertEquals(1, fn.getLineno());
    assertEquals(2, fn.getCharno());

    Node fnName = fn.getFirstChild();
    assertEquals(Token.NAME, fnName.getType());
    assertEquals("testFn", fnName.getString());

    Node paramParen = fnName.getNext();
    assertEquals(Token.LP, paramParen.getType());
    assertEquals(2, paramParen.getChildCount());

    Node fnBody = paramParen.getNext();
    assertSame(body, fnBody);
  }

  @Test
  public void testNewQualifiedNameNode_singleName() {
    Node node = NodeUtil.newQualifiedNameNode(convention, "simpleName", 1, 2);
    assertEquals(Token.NAME, node.getType());
    assertEquals("simpleName", node.getString());
    assertEquals(1, node.getLineno());
    assertEquals(2, node.getCharno());
  }

  @Test
  public void testNewQualifiedNameNode_multipleParts() {
    Node node = NodeUtil.newQualifiedNameNode(convention, "a.b.c", 3, 4);
    assertEquals(Token.GETPROP, node.getType());
    assertEquals("c", node.getLastChild().getString());

    Node ab = node.getFirstChild();
    assertEquals(Token.GETPROP, ab.getType());
    assertEquals("b", ab.getLastChild().getString());

    Node a = ab.getFirstChild();
    assertEquals(Token.NAME, a.getType());
    assertEquals("a", a.getString());
  }

  @Test
  public void testNewQualifiedNameNode_withBasisNode() {
    Node basis = Node.newString(Token.NAME, "orig");
    basis.setLineno(5);
    basis.setCharno(6);

    Node node = NodeUtil.newQualifiedNameNode(convention, "foo.bar", basis, "origName");
    assertEquals(Token.GETPROP, node.getType());
    assertEquals("origName", node.getProp(Node.ORIGINALNAME_PROP));
  }

  @Test
  public void testGetImpureBooleanValue_allBranches() {
    // ASSIGN
    Node assign = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(1));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(assign));

    // COMMA
    Node comma = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(0));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(comma));

    // NOT
    Node notTrue = new Node(Token.NOT, new Node(Token.TRUE));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(notTrue));

    // AND
    Node andNode = new Node(Token.AND, new Node(Token.TRUE), new Node(Token.FALSE));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(andNode));

    // OR
    Node orNode = new Node(Token.OR, new Node(Token.FALSE), new Node(Token.TRUE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(orNode));

    // HOOK matching branches
    Node hookMatch = new Node(Token.HOOK, Node.newNumber(1), new Node(Token.TRUE), new Node(Token.TRUE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(hookMatch));

    // HOOK non-matching branches
    Node hookMismatch = new Node(Token.HOOK, Node.newNumber(1), new Node(Token.TRUE), new Node(Token.FALSE));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(hookMismatch));

    // ARRAYLIT & OBJECTLIT
    Node arrayLit = new Node(Token.ARRAYLIT);
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(arrayLit));
    Node objLit = new Node(Token.OBJECTLIT);
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(objLit));
  }

  @Test
  public void testGetPureBooleanValue_allTypes() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(Node.newString("")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(Node.newString("abc")));

    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(Node.newNumber(0.0)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(Node.newNumber(42.0)));

    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(new Node(Token.NOT, new Node(Token.FALSE))));

    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(new Node(Token.NULL)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(new Node(Token.FALSE)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(new Node(Token.VOID, Node.newNumber(0))));

    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(Node.newString(Token.NAME, "undefined")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(Node.newString(Token.NAME, "NaN")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(Node.newString(Token.NAME, "Infinity")));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(Node.newString(Token.NAME, "other")));

    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(new Node(Token.TRUE)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(new Node(Token.REGEXP)));

    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(new Node(Token.ARRAYLIT)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(new Node(Token.OBJECTLIT)));

    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(new Node(Token.CALL, Node.newString(Token.NAME, "fn"))));
  }

  @Test
  public void testGetStringValue() {
    assertEquals("hello", NodeUtil.getStringValue(Node.newString("hello")));
    assertEquals("undefined", NodeUtil.getStringValue(Node.newString(Token.NAME, "undefined")));
    assertEquals("Infinity", NodeUtil.getStringValue(Node.newString(Token.NAME, "Infinity")));
    assertEquals("NaN", NodeUtil.getStringValue(Node.newString(Token.NAME, "NaN")));
    assertNull(NodeUtil.getStringValue(Node.newString(Token.NAME, "other")));

    assertEquals("100", NodeUtil.getStringValue(Node.newNumber(100.0)));
    assertEquals("100.5", NodeUtil.getStringValue(Node.newNumber(100.5)));

    assertEquals("false", NodeUtil.getStringValue(new Node(Token.FALSE)));
    assertEquals("true", NodeUtil.getStringValue(new Node(Token.TRUE)));
    assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
    assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID, Node.newNumber(0))));

    assertEquals("false", NodeUtil.getStringValue(new Node(Token.NOT, new Node(Token.TRUE))));
    assertEquals("true", NodeUtil.getStringValue(new Node(Token.NOT, new Node(Token.FALSE))));
    assertNull(NodeUtil.getStringValue(new Node(Token.NOT, Node.newString(Token.NAME, "x"))));

    Node arr = new Node(Token.ARRAYLIT, Node.newString("a"), new Node(Token.NULL), Node.newNumber(1));
    assertEquals("a,,1", NodeUtil.getStringValue(arr));

    assertEquals("[object Object]", NodeUtil.getStringValue(new Node(Token.OBJECTLIT)));
    assertNull(NodeUtil.getStringValue(new Node(Token.ADD)));
  }

  @Test
  public void testGetArrayElementStringValue_and_ArrayToString() {
    assertEquals("", NodeUtil.getArrayElementStringValue(new Node(Token.NULL)));
    assertEquals("", NodeUtil.getArrayElementStringValue(new Node(Token.VOID, Node.newNumber(0))));
    assertEquals("", NodeUtil.getArrayElementStringValue(new Node(Token.EMPTY)));
    assertEquals("foo", NodeUtil.getArrayElementStringValue(Node.newString("foo")));

    Node emptyArr = new Node(Token.ARRAYLIT);
    assertEquals("", NodeUtil.arrayToString(emptyArr));

    Node arrWithUnknown = new Node(Token.ARRAYLIT, Node.newString(Token.NAME, "unknown"));
    assertNull(NodeUtil.arrayToString(arrWithUnknown));
  }

  @Test
  public void testGetNumberValue() {
    assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(new Node(Token.TRUE)));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.FALSE)));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.NULL)));
    assertEquals(Double.valueOf(42.5), NodeUtil.getNumberValue(Node.newNumber(42.5)));

    assertTrue(Double.isNaN(NodeUtil.getNumberValue(new Node(Token.VOID, Node.newNumber(0)))));
    assertNull(NodeUtil.getNumberValue(new Node(Token.VOID, new Node(Token.CALL, Node.newString(Token.NAME, "f")))));

    assertTrue(Double.isNaN(NodeUtil.getNumberValue(Node.newString(Token.NAME, "undefined"))));
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(Node.newString(Token.NAME, "NaN"))));
    assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), NodeUtil.getNumberValue(Node.newString(Token.NAME, "Infinity")));
    assertNull(NodeUtil.getNumberValue(Node.newString(Token.NAME, "foo")));

    Node negInf = new Node(Token.NEG, Node.newString(Token.NAME, "Infinity"));
    assertEquals(Double.valueOf(Double.NEGATIVE_INFINITY), NodeUtil.getNumberValue(negInf));
    assertNull(NodeUtil.getNumberValue(new Node(Token.NEG, Node.newNumber(5))));

    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.NOT, new Node(Token.TRUE))));
    assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(new Node(Token.NOT, new Node(Token.FALSE))));
    assertNull(NodeUtil.getNumberValue(new Node(Token.NOT, Node.newString(Token.NAME, "x"))));

    assertEquals(Double.valueOf(123.0), NodeUtil.getNumberValue(Node.newString("123")));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(new Node(Token.ARRAYLIT)));
    assertNull(NodeUtil.getNumberValue(new Node(Token.OBJECTLIT)));
    assertNull(NodeUtil.getNumberValue(new Node(Token.BITOR)));
  }

  @Test
  public void testGetStringNumberValue_and_TrimJsWhiteSpace() {
    assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue("   \t\n\r\u000B\u000C\u00A0\u2028\u2029\uFEFF "));
    assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0xFF"));
    assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0xff"));
    assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("0xZZ")));
    assertNull(NodeUtil.getStringNumberValue("+0x12"));
    assertNull(NodeUtil.getStringNumberValue("-0x12"));
    assertNull(NodeUtil.getStringNumberValue("infinity"));
    assertNull(NodeUtil.getStringNumberValue("-infinity"));
    assertNull(NodeUtil.getStringNumberValue("+infinity"));
    assertEquals(Double.valueOf(3.14), NodeUtil.getStringNumberValue("3.14"));
    assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("not-a-number")));
  }

  @Test
  public void testIsStrWhiteSpaceChar() {
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u000B'));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2000'));
    assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('A'));
  }

  @Test
  public void testGetFunctionName_and_GetNearestFunctionName() {
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "foo"), new Node(Token.LP), new Node(Token.BLOCK));
    Node anonFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));

    // Function declaration
    new Node(Token.BLOCK, fn);
    assertEquals("foo", NodeUtil.getFunctionName(fn));
    assertEquals("foo", NodeUtil.getNearestFunctionName(fn));

    // Var assign
    Node varNode = NodeUtil.newVarNode("bar", anonFn);
    assertEquals("bar", NodeUtil.getFunctionName(anonFn));
    assertEquals("bar", NodeUtil.getNearestFunctionName(anonFn));

    // Assign
    Node assignFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    new Node(Token.ASSIGN, Node.newString(Token.NAME, "pkg.myMethod"), assignFn);
    assertEquals("pkg.myMethod", NodeUtil.getFunctionName(assignFn));

    // Nearest name from object literal keys
    Node objKeyFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node objKey = Node.newString(Token.STRING, "keyName");
    objKey.addChildToBack(objKeyFn);
    new Node(Token.OBJECTLIT, objKey);
    assertNull(NodeUtil.getFunctionName(objKeyFn));
    assertEquals("keyName", NodeUtil.getNearestFunctionName(objKeyFn));

    Node numKeyFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node numKey = Node.newNumber(123);
    numKey.addChildToBack(numKeyFn);
    new Node(Token.OBJECTLIT, numKey);
    assertEquals("123", NodeUtil.getNearestFunctionName(numKeyFn));

    Node dummy = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    new Node(Token.ARRAYLIT, dummy);
    assertNull(NodeUtil.getNearestFunctionName(dummy));
  }

  @Test
  public void testIsImmutableValue() {
    assertTrue(NodeUtil.isImmutableValue(Node.newString("s")));
    assertTrue(NodeUtil.isImmutableValue(Node.newNumber(1)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NOT, Node.newNumber(1))));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.VOID, Node.newNumber(0))));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NEG, Node.newNumber(1))));
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "undefined")));
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "Infinity")));
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "NaN")));
    assertFalse(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "x")));
    assertFalse(NodeUtil.isImmutableValue(new Node(Token.ADD)));
  }

  @Test
  public void testIsLiteralValue() {
    assertTrue(NodeUtil.isLiteralValue(new Node(Token.ARRAYLIT, Node.newNumber(1), new Node(Token.EMPTY)), false));
    assertFalse(NodeUtil.isLiteralValue(new Node(Token.ARRAYLIT, Node.newString(Token.NAME, "x")), false));

    Node reg = new Node(Token.REGEXP, Node.newString("abc"));
    assertTrue(NodeUtil.isLiteralValue(reg, false));

    Node obj = new Node(Token.OBJECTLIT);
    Node key = Node.newString(Token.STRING, "k");
    key.addChildToBack(Node.newNumber(1));
    obj.addChildToBack(key);
    assertTrue(NodeUtil.isLiteralValue(obj, false));

    Node fnExp = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    new Node(Token.EXPR_RESULT, fnExp);
    assertTrue(NodeUtil.isLiteralValue(fnExp, true));
    assertFalse(NodeUtil.isLiteralValue(fnExp, false));
  }

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = Sets.newHashSet("MY_DEF", "ns.DEF");

    assertTrue(NodeUtil.isValidDefineValue(Node.newString("str"), defines));
    assertTrue(NodeUtil.isValidDefineValue(Node.newNumber(1), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.TRUE), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.FALSE), defines));

    Node add = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
    assertTrue(NodeUtil.isValidDefineValue(add, defines));

    Node not = new Node(Token.NOT, new Node(Token.TRUE));
    assertTrue(NodeUtil.isValidDefineValue(not, defines));

    assertTrue(NodeUtil.isValidDefineValue(Node.newString(Token.NAME, "MY_DEF"), defines));
    assertFalse(NodeUtil.isValidDefineValue(Node.newString(Token.NAME, "OTHER"), defines));

    Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "ns"), Node.newString(Token.STRING, "DEF"));
    assertTrue(NodeUtil.isValidDefineValue(getprop, defines));

    assertFalse(NodeUtil.isValidDefineValue(new Node(Token.ARRAYLIT), defines));
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
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.ADD)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.SUB)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.MUL)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.DIV)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.MOD)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.BITAND)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.BITOR)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.BITXOR)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.BITNOT)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.NOT)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.COMMA)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.POS)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.NEG)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.URSH)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.TYPEOF)));
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.INSTANCEOF)));
    assertFalse(NodeUtil.isSimpleOperator(new Node(Token.VAR)));
  }

  @Test
  public void testMayEffectMutableState_and_MayHaveSideEffects() {
    assertTrue(NodeUtil.mayEffectMutableState(new Node(Token.ARRAYLIT)));
    assertFalse(NodeUtil.mayHaveSideEffects(new Node(Token.ARRAYLIT)));

    assertTrue(NodeUtil.mayHaveSideEffects(new Node(Token.THROW, Node.newString("err"))));

    Node objLit = new Node(Token.OBJECTLIT);
    Node key = Node.newString(Token.STRING, "k");
    key.addChildToBack(Node.newNumber(1));
    objLit.addChildToBack(key);
    assertFalse(NodeUtil.mayHaveSideEffects(objLit));

    Node funcDecl = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
    new Node(Token.BLOCK, funcDecl);
    assertTrue(NodeUtil.mayHaveSideEffects(funcDecl));

    Node safeNew = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
    assertFalse(NodeUtil.mayHaveSideEffects(safeNew));

    Node sideEffectNew = new Node(Token.NEW, Node.newString(Token.NAME, "CustomType"));
    assertTrue(NodeUtil.mayHaveSideEffects(sideEffectNew));

    Node safeCall = new Node(Token.CALL, Node.newString(Token.NAME, "String"));
    assertFalse(NodeUtil.mayHaveSideEffects(safeCall));

    Node customCall = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    assertTrue(NodeUtil.mayHaveSideEffects(customCall));

    Node mathCall = new Node(Token.CALL, new Node(Token.GETPROP, Node.newString(Token.NAME, "Math"), Node.newString(Token.STRING, "sin")));
    assertFalse(NodeUtil.mayHaveSideEffects(mathCall));

    Node toStringCall = new Node(Token.CALL, new Node(Token.GETPROP, Node.newNumber(1), Node.newString(Token.STRING, "toString")));
    assertFalse(NodeUtil.mayHaveSideEffects(toStringCall));

    Node assignName = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(1));
    assertTrue(NodeUtil.mayHaveSideEffects(assignName));

    Node varNoInit = new Node(Token.NAME, "x");
    new Node(Token.VAR, varNoInit);
    assertFalse(NodeUtil.mayHaveSideEffects(varNoInit));

    Node varWithInit = Node.newString(Token.NAME, "x");
    varWithInit.addChildToBack(Node.newNumber(1));
    new Node(Token.VAR, varWithInit);
    assertTrue(NodeUtil.mayHaveSideEffects(varWithInit));
  }

  @Test(expected = IllegalStateException.class)
  public void testConstructorCallHasSideEffects_notNew_throwsException() {
    NodeUtil.constructorCallHasSideEffects(new Node(Token.CALL));
  }

  @Test(expected = IllegalStateException.class)
  public void testFunctionCallHasSideEffects_notCall_throwsException() {
    NodeUtil.functionCallHasSideEffects(new Node(Token.NEW));
  }

  @Test
  public void testCallHasLocalResult_and_NewHasLocalResult() {
    Node call = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
    call.setSideEffectFlags(Node.FLAG_LOCAL_RESULTS);
    assertTrue(NodeUtil.callHasLocalResult(call));

    Node newN = new Node(Token.NEW, Node.newString(Token.NAME, "C"));
    newN.setSideEffectFlags(Node.FLAG_ONLY_MODIFIES_THIS_TAG);
    assertTrue(NodeUtil.newHasLocalResult(newN));
  }

  @Test
  public void testNodeTypeMayHaveSideEffects() {
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DELPROP)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DEC)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.INC)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.THROW)));
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(Node.newNumber(1)));
  }

  @Test
  public void testCanBeSideEffected() {
    assertTrue(NodeUtil.canBeSideEffected(new Node(Token.CALL, Node.newString(Token.NAME, "f"))));
    assertTrue(NodeUtil.canBeSideEffected(new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString(Token.STRING, "b"))));
    assertTrue(NodeUtil.canBeSideEffected(Node.newString(Token.NAME, "x"), Collections.<String>emptySet()));
    assertFalse(NodeUtil.canBeSideEffected(Node.newString(Token.NAME, "x"), Sets.newHashSet("x")));
  }

  @Test
  public void testPrecedence_and_UnknownPrecedence() {
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
    assertEquals(15, NodeUtil.precedence(Token.NUMBER));

    try {
      NodeUtil.precedence(Token.LABEL);
      fail("Expected Error for unknown precedence");
    } catch (Error e) {
      // Expected
    }
  }

  @Test
  public void testIsNumericResult_and_IsBooleanResult() {
    assertTrue(NodeUtil.isNumericResult(Node.newNumber(5)));
    assertTrue(NodeUtil.isNumericResult(new Node(Token.SUB, Node.newNumber(5), Node.newNumber(2))));
    assertTrue(NodeUtil.isNumericResult(Node.newString(Token.NAME, "NaN")));
    assertTrue(NodeUtil.isNumericResult(Node.newString(Token.NAME, "Infinity")));
    assertFalse(NodeUtil.isNumericResult(Node.newString("str")));

    assertTrue(NodeUtil.isBooleanResult(new Node(Token.TRUE)));
    assertTrue(NodeUtil.isBooleanResult(new Node(Token.EQ, Node.newNumber(1), Node.newNumber(2))));
    assertTrue(NodeUtil.isBooleanResult(new Node(Token.NOT, Node.newNumber(1))));
    assertTrue(NodeUtil.isBooleanResult(new Node(Token.DELPROP, Node.newString(Token.NAME, "x"))));
    assertFalse(NodeUtil.isBooleanResult(Node.newNumber(1)));
  }

  @Test
  public void testIsNullOrUndefined() {
    assertTrue(NodeUtil.isNull(new Node(Token.NULL)));
    assertFalse(NodeUtil.isNull(new Node(Token.TRUE)));

    assertTrue(NodeUtil.isUndefined(new Node(Token.VOID, Node.newNumber(0))));
    assertTrue(NodeUtil.isUndefined(Node.newString(Token.NAME, "undefined")));
    assertFalse(NodeUtil.isUndefined(Node.newString(Token.NAME, "defined")));

    assertTrue(NodeUtil.isNullOrUndefined(new Node(Token.NULL)));
    assertTrue(NodeUtil.isNullOrUndefined(new Node(Token.VOID, Node.newNumber(0))));
    assertFalse(NodeUtil.isNullOrUndefined(Node.newNumber(1)));
  }

  @Test
  public void testMayBeString() {
    assertTrue(NodeUtil.mayBeString(Node.newString("hello")));
    assertTrue(NodeUtil.mayBeString(Node.newString(Token.NAME, "foo")));
    assertFalse(NodeUtil.mayBeString(Node.newNumber(123)));
    assertFalse(NodeUtil.mayBeString(new Node(Token.TRUE)));
    assertFalse(NodeUtil.mayBeString(new Node(Token.NULL)));
    assertFalse(NodeUtil.mayBeString(new Node(Token.VOID, Node.newNumber(0))));
  }

  @Test
  public void testIsAssociative_and_IsCommutative() {
    assertTrue(NodeUtil.isAssociative(Token.MUL));
    assertTrue(NodeUtil.isAssociative(Token.AND));
    assertTrue(NodeUtil.isAssociative(Token.OR));
    assertTrue(NodeUtil.isAssociative(Token.BITOR));
    assertTrue(NodeUtil.isAssociative(Token.BITXOR));
    assertTrue(NodeUtil.isAssociative(Token.BITAND));
    assertFalse(NodeUtil.isAssociative(Token.SUB));

    assertTrue(NodeUtil.isCommutative(Token.MUL));
    assertTrue(NodeUtil.isCommutative(Token.BITOR));
    assertTrue(NodeUtil.isCommutative(Token.BITXOR));
    assertTrue(NodeUtil.isCommutative(Token.BITAND));
    assertFalse(NodeUtil.isCommutative(Token.AND));
  }

  @Test
  public void testIsAssignmentOp_and_GetOpFromAssignmentOp() {
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
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

    try {
      NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN));
      fail("Expected IllegalArgumentException for Token.ASSIGN");
    } catch (IllegalArgumentException e) {
      // Expected
    }
  }

  @Test
  public void testNodeHelperPredicates() {
    Node expr = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    assertTrue(NodeUtil.isExpressionNode(expr));

    Node fn = NodeUtil.newFunctionNode("f", Collections.<Node>emptyList(), new Node(Token.BLOCK), 0, 0);
    assertTrue(NodeUtil.containsFunction(new Node(Token.BLOCK, fn)));
    assertFalse(NodeUtil.containsFunction(new Node(Token.BLOCK)));

    Node thisNode = new Node(Token.THIS);
    assertTrue(NodeUtil.referencesThis(new Node(Token.BLOCK, thisNode)));
    assertTrue(NodeUtil.isThis(thisNode));

    Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString(Token.STRING, "b"));
    Node getelem = new Node(Token.GETELEM, Node.newString(Token.NAME, "a"), Node.newNumber(0));
    assertTrue(NodeUtil.isGet(getprop));
    assertTrue(NodeUtil.isGet(getelem));
    assertTrue(NodeUtil.isGetProp(getprop));
    assertFalse(NodeUtil.isGetProp(getelem));

    assertTrue(NodeUtil.isName(Node.newString(Token.NAME, "a")));
    assertTrue(NodeUtil.isNew(new Node(Token.NEW, Node.newString(Token.NAME, "a"))));
    assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
    assertTrue(NodeUtil.isString(Node.newString("s")));
    assertTrue(NodeUtil.isArrayLiteral(new Node(Token.ARRAYLIT)));
    assertTrue(NodeUtil.isCall(new Node(Token.CALL, Node.newString(Token.NAME, "f"))));
    assertTrue(NodeUtil.isCallOrNew(new Node(Token.CALL, Node.newString(Token.NAME, "f"))));
    assertTrue(NodeUtil.isCallOrNew(new Node(Token.NEW, Node.newString(Token.NAME, "f"))));
    assertTrue(NodeUtil.isFunction(fn));
  }

  @Test
  public void testIsVarDeclaration_and_GetAssignedValue() {
    Node nameNode = Node.newString(Token.NAME, "x");
    nameNode.addChildToBack(Node.newNumber(42));
    Node varNode = new Node(Token.VAR, nameNode);

    assertTrue(NodeUtil.isVarDeclaration(nameNode));
    assertEquals(42.0, NodeUtil.getAssignedValue(nameNode).getDouble(), 0.0);

    Node assignLhs = Node.newString(Token.NAME, "y");
    Node assignRhs = Node.newNumber(100);
    new Node(Token.ASSIGN, assignLhs, assignRhs);
    assertEquals(100.0, NodeUtil.getAssignedValue(assignLhs).getDouble(), 0.0);

    Node standaloneName = Node.newString(Token.NAME, "z");
    assertNull(NodeUtil.getAssignedValue(standaloneName));
  }

  @Test
  public void testIsExprAssign_and_IsExprCall() {
    Node exprAssign = new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(1)));
    assertTrue(NodeUtil.isExprAssign(exprAssign));
    assertFalse(NodeUtil.isExprCall(exprAssign));

    Node exprCall = new Node(Token.EXPR_RESULT, new Node(Token.CALL, Node.newString(Token.NAME, "fn")));
    assertTrue(NodeUtil.isExprCall(exprCall));
    assertFalse(NodeUtil.isExprAssign(exprCall));
  }

  @Test
  public void testLoops_and_ControlStructures() {
    Node forIn = new Node(Token.FOR, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "obj"), new Node(Token.BLOCK));
    assertTrue(NodeUtil.isForIn(forIn));

    Node forNode = new Node(Token.FOR, Node.newNumber(0), Node.newNumber(1), Node.newNumber(2), new Node(Token.BLOCK));
    Node whileNode = new Node(Token.WHILE, new Node(Token.TRUE), new Node(Token.BLOCK));
    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), new Node(Token.TRUE));

    assertTrue(NodeUtil.isLoopStructure(forNode));
    assertTrue(NodeUtil.isLoopStructure(whileNode));
    assertTrue(NodeUtil.isLoopStructure(doNode));
    assertFalse(NodeUtil.isLoopStructure(new Node(Token.IF)));

    assertSame(forNode.getLastChild(), NodeUtil.getLoopCodeBlock(forNode));
    assertSame(whileNode.getLastChild(), NodeUtil.getLoopCodeBlock(whileNode));
    assertSame(doNode.getFirstChild(), NodeUtil.getLoopCodeBlock(doNode));
    assertNull(NodeUtil.getLoopCodeBlock(new Node(Token.IF)));

    Node inner = Node.newString(Token.NAME, "inside");
    whileNode.getLastChild().addChildToBack(inner);
    assertTrue(NodeUtil.isWithinLoop(inner));

    assertTrue(NodeUtil.isControlStructure(forNode));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.WITH)));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.TRY)));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.SWITCH)));

    assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, forNode.getLastChild()));
    assertTrue(NodeUtil.isControlStructureCodeBlock(doNode, doNode.getFirstChild()));
    Node ifNode = new Node(Token.IF, new Node(Token.TRUE), new Node(Token.BLOCK));
    assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, ifNode.getLastChild()));
    assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, ifNode.getFirstChild()));
  }

  @Test
  public void testGetConditionExpression() {
    Node cond = new Node(Token.TRUE);
    Node ifNode = new Node(Token.IF, cond, new Node(Token.BLOCK));
    assertSame(cond, NodeUtil.getConditionExpression(ifNode));

    Node whileNode = new Node(Token.WHILE, cond, new Node(Token.BLOCK));
    assertSame(cond, NodeUtil.getConditionExpression(whileNode));

    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), cond);
    assertSame(cond, NodeUtil.getConditionExpression(doNode));

    Node forNode = new Node(Token.FOR, Node.newNumber(0), cond, Node.newNumber(1), new Node(Token.BLOCK));
    assertSame(cond, NodeUtil.getConditionExpression(forNode));

    Node forInNode = new Node(Token.FOR, Node.newString(Token.NAME, "k"), Node.newString(Token.NAME, "o"), new Node(Token.BLOCK));
    assertNull(NodeUtil.getConditionExpression(forInNode));

    Node caseNode = new Node(Token.CASE, Node.newNumber(1), new Node(Token.BLOCK));
    assertNull(NodeUtil.getConditionExpression(caseNode));
  }

  @Test
  public void testStatements_and_Functions() {
    Node script = new Node(Token.SCRIPT);
    Node block = new Node(Token.BLOCK);
    assertTrue(NodeUtil.isStatementBlock(script));
    assertTrue(NodeUtil.isStatementBlock(block));

    Node stmt = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    script.addChildToBack(stmt);
    assertTrue(NodeUtil.isStatement(stmt));

    assertTrue(NodeUtil.isSwitchCase(new Node(Token.CASE)));
    assertTrue(NodeUtil.isSwitchCase(new Node(Token.DEFAULT)));

    assertTrue(NodeUtil.isReferenceName(Node.newString(Token.NAME, "ref")));
    assertFalse(NodeUtil.isReferenceName(Node.newString(Token.NAME, "")));

    assertTrue(NodeUtil.isLabelName(Node.newString(Token.LABEL_NAME, "lbl")));

    Node fnDecl = NodeUtil.newFunctionNode("decl", Collections.<Node>emptyList(), new Node(Token.BLOCK), 0, 0);
    script.addChildToBack(fnDecl);
    assertTrue(NodeUtil.isFunctionDeclaration(fnDecl));
    assertTrue(NodeUtil.isHoistedFunctionDeclaration(fnDecl));
    assertFalse(NodeUtil.isFunctionExpression(fnDecl));

    Node fnExpr = NodeUtil.newFunctionNode("", Collections.<Node>emptyList(), new Node(Token.BLOCK), 0, 0);
    new Node(Token.ASSIGN, Node.newString(Token.NAME, "f"), fnExpr);
    assertTrue(NodeUtil.isFunctionExpression(fnExpr));
    assertTrue(NodeUtil.isEmptyFunctionExpression(fnExpr));
    assertSame(fnExpr.getLastChild(), NodeUtil.getFunctionBody(fnExpr));
  }

  @Test
  public void testIsVarArgsFunction() {
    Node bodyWithArgs = new Node(Token.BLOCK, Node.newString(Token.NAME, "arguments"));
    Node fnWithArgs = NodeUtil.newFunctionNode("varArgsFn", Collections.<Node>emptyList(), bodyWithArgs, 0, 0);
    assertTrue(NodeUtil.isVarArgsFunction(fnWithArgs));

    Node bodyNoArgs = new Node(Token.BLOCK);
    Node fnNoArgs = NodeUtil.newFunctionNode("simpleFn", Collections.<Node>emptyList(), bodyNoArgs, 0, 0);
    assertFalse(NodeUtil.isVarArgsFunction(fnNoArgs));
  }

  @Test
  public void testMethodCallChecking() {
    Node callTarget = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString(Token.STRING, "call"));
    Node callNode = new Node(Token.CALL, callTarget);

    assertTrue(NodeUtil.isFunctionObjectCall(callNode));
    assertTrue(NodeUtil.isSimpleFunctionObjectCall(callNode));
    assertTrue(NodeUtil.isFunctionObjectCallOrApply(callNode));

    Node applyTarget = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString(Token.STRING, "apply"));
    Node applyNode = new Node(Token.CALL, applyTarget);
    assertTrue(NodeUtil.isFunctionObjectApply(applyNode));
    assertTrue(NodeUtil.isFunctionObjectCallOrApply(applyNode));
  }

  @Test
  public void testIsLhs_and_ObjectLitKeys() {
    Node lhs = Node.newString(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, lhs, Node.newNumber(1));
    assertTrue(NodeUtil.isLhs(lhs, assign));
    assertFalse(NodeUtil.isLhs(assign.getLastChild(), assign));

    Node key = Node.newString(Token.STRING, "prop");
    Node objLit = new Node(Token.OBJECTLIT, key);
    assertTrue(NodeUtil.isObjectLitKey(key, objLit));
    assertEquals("prop", NodeUtil.getObjectLitKeyName(key));

    Node getKey = Node.newString(Token.GET, "getProp");
    Node setKey = Node.newString(Token.SET, "setProp");
    assertTrue(NodeUtil.isGetOrSetKey(getKey));
    assertTrue(NodeUtil.isGetOrSetKey(setKey));
    assertEquals("getProp", NodeUtil.getObjectLitKeyName(getKey));
    assertEquals("setProp", NodeUtil.getObjectLitKeyName(setKey));
  }

  @Test
  public void testOpToStr_and_OpToStrNoFail() {
    assertEquals("+", NodeUtil.opToStr(Token.ADD));
    assertEquals("-", NodeUtil.opToStr(Token.SUB));
    assertEquals("*", NodeUtil.opToStr(Token.MUL));
    assertEquals("/", NodeUtil.opToStr(Token.DIV));
    assertEquals("%", NodeUtil.opToStr(Token.MOD));
    assertEquals("===", NodeUtil.opToStr(Token.SHEQ));
    assertEquals("!==", NodeUtil.opToStr(Token.SHNE));
    assertEquals("==", NodeUtil.opToStr(Token.EQ));
    assertEquals("!=", NodeUtil.opToStr(Token.NE));
    assertEquals("<<", NodeUtil.opToStr(Token.LSH));
    assertEquals(">>", NodeUtil.opToStr(Token.RSH));
    assertEquals(">>>", NodeUtil.opToStr(Token.URSH));
    assertEquals("void", NodeUtil.opToStr(Token.VOID));
    assertEquals("typeof", NodeUtil.opToStr(Token.TYPEOF));
    assertEquals("instanceof", NodeUtil.opToStr(Token.INSTANCEOF));
    assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));

    assertNull(NodeUtil.opToStr(Token.FUNCTION));
    try {
      NodeUtil.opToStrNoFail(Token.FUNCTION);
      fail("Expected Error for non-operator token");
    } catch (Error e) {
      // Expected
    }
  }

  @Test
  public void testTryCatchFinallyOperations() {
    Node tryBody = new Node(Token.BLOCK);
    Node catchBlock = new Node(Token.BLOCK, new Node(Token.CATCH, Node.newString(Token.NAME, "e"), new Node(Token.BLOCK)));
    Node finallyBlock = new Node(Token.BLOCK);

    Node tryNode = new Node(Token.TRY, tryBody, catchBlock, finallyBlock);

    assertTrue(NodeUtil.hasFinally(tryNode));
    assertSame(catchBlock, NodeUtil.getCatchBlock(tryNode));
    assertTrue(NodeUtil.hasCatchHandler(catchBlock));
    assertTrue(NodeUtil.isTryFinallyNode(tryNode, finallyBlock));
    assertTrue(NodeUtil.isTryCatchNodeContainer(catchBlock));

    Node tryWithoutFinally = new Node(Token.TRY, tryBody, catchBlock);
    assertFalse(NodeUtil.hasFinally(tryWithoutFinally));
    NodeUtil.maybeAddFinally(tryWithoutFinally);
    assertTrue(NodeUtil.hasFinally(tryWithoutFinally));
  }

  @Test
  public void testRemoveChild_and_TryMergeBlock() {
    Node parent = new Node(Token.BLOCK);
    Node child1 = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    Node child2 = new Node(Token.EXPR_RESULT, Node.newNumber(2));
    parent.addChildToBack(child1);
    parent.addChildToBack(child2);

    NodeUtil.removeChild(parent, child1);
    assertEquals(1, parent.getChildCount());
    assertSame(child2, parent.getFirstChild());

    Node innerBlock = new Node(Token.BLOCK, Node.newNumber(10), Node.newNumber(20));
    parent.addChildToBack(innerBlock);
    assertTrue(NodeUtil.tryMergeBlock(innerBlock));
    assertEquals(3, parent.getChildCount());
  }

  @Test
  public void testRedeclareVarsInsideBranch() {
    Node script = new Node(Token.SCRIPT);
    Node block = new Node(Token.BLOCK);
    Node ifNode = new Node(Token.IF, new Node(Token.TRUE), block);
    script.addChildToBack(ifNode);

    Node varNode = NodeUtil.newVarNode("redeclareMe", Node.newNumber(1));
    block.addChildToBack(varNode);

    NodeUtil.redeclareVarsInsideBranch(block);
    assertEquals(Token.VAR, script.getFirstChild().getType());
    assertEquals("redeclareMe", script.getFirstChild().getFirstChild().getString());
  }

  @Test
  public void testPrototypes() {
    Node protoProp = NodeUtil.newQualifiedNameNode(convention, "MyClass.prototype.myMethod", 0, 0);
    Node expr = new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN, protoProp, Node.newNumber(1)));

    assertTrue(NodeUtil.isPrototypePropertyDeclaration(expr));
    assertTrue(NodeUtil.isPrototypeProperty(protoProp));
    assertEquals("MyClass", NodeUtil.getPrototypeClassName(protoProp).getQualifiedName());
    assertEquals("myMethod", NodeUtil.getPrototypePropertyName(protoProp));
  }

  @Test
  public void testNewUndefinedNode_and_NewCallNode() {
    Node basis = Node.newNumber(0);
    basis.setLineno(12);
    basis.setCharno(34);

    Node undef = NodeUtil.newUndefinedNode(basis);
    assertEquals(Token.VOID, undef.getType());
    assertEquals(12, undef.getLineno());
    assertEquals(34, undef.getCharno());

    Node callTarget = Node.newString(Token.NAME, "func");
    Node call = NodeUtil.newCallNode(callTarget, Node.newNumber(1), Node.newNumber(2));
    assertEquals(Token.CALL, call.getType());
    assertTrue(call.getBooleanProp(Node.FREE_CALL));
    assertEquals(3, call.getChildCount());
  }

  @Test
  public void testEvaluatesToLocalValue() {
    assertTrue(NodeUtil.evaluatesToLocalValue(Node.newNumber(1)));
    assertTrue(NodeUtil.evaluatesToLocalValue(Node.newString("s")));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.ARRAYLIT)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.OBJECTLIT)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.REGEXP)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK))));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2))));
    assertFalse(NodeUtil.evaluatesToLocalValue(Node.newString(Token.NAME, "x")));
  }

  @Test
  public void testGetArguments() {
    List<Node> params = ImmutableList.of(Node.newString(Token.NAME, "p1"), Node.newString(Token.NAME, "p2"));
    Node fn = NodeUtil.newFunctionNode("foo", params, new Node(Token.BLOCK), 0, 0);

    assertEquals("p1", NodeUtil.getArgumentForFunction(fn, 0).getString());
    assertEquals("p2", NodeUtil.getArgumentForFunction(fn, 1).getString());
    assertNull(NodeUtil.getArgumentForFunction(fn, 2));

    Node call = new Node(Token.CALL, Node.newString(Token.NAME, "fn"), Node.newNumber(10), Node.newNumber(20));
    assertEquals(10.0, NodeUtil.getArgumentForCallOrNew(call, 0).getDouble(), 0.0);
    assertEquals(20.0, NodeUtil.getArgumentForCallOrNew(call, 1).getDouble(), 0.0);
    assertNull(NodeUtil.getArgumentForCallOrNew(call, 2));
  }

  @Test
  public void testTraversalAndCounts() {
    Node root = new Node(Token.BLOCK,
        Node.newString(Token.NAME, "a"),
        Node.newString(Token.NAME, "b"),
        Node.newString(Token.NAME, "a"));

    assertTrue(NodeUtil.isNameReferenced(root, "a"));
    assertFalse(NodeUtil.isNameReferenced(root, "c"));
    assertEquals(2, NodeUtil.getNameReferenceCount(root, "a"));
    assertEquals(1, NodeUtil.getNameReferenceCount(root, "b"));
    assertEquals(3, NodeUtil.getNodeTypeReferenceCount(root, Token.NAME, Predicates.<Node>alwaysTrue()));

    final List<Integer> preVisited = new ArrayList<Integer>();
    NodeUtil.visitPreOrder(root, new NodeUtil.Visitor() {
      public void visit(Node node) {
        preVisited.add(node.getType());
      }
    }, Predicates.<Node>alwaysTrue());
    assertEquals(4, preVisited.size());

    final List<Integer> postVisited = new ArrayList<Integer>();
    NodeUtil.visitPostOrder(root, new NodeUtil.Visitor() {
      public void visit(Node node) {
        postVisited.add(node.getType());
      }
    }, Predicates.<Node>alwaysTrue());
    assertEquals(4, postVisited.size());
  }

  @Test
  public void testIsLatin_and_IsValidPropertyName() {
    assertTrue(NodeUtil.isLatin("asciiOnly"));
    assertFalse(NodeUtil.isLatin("ภาษาไทย"));

    assertTrue(NodeUtil.isValidPropertyName("validProp"));
    assertTrue(NodeUtil.isValidPropertyName("$dollar"));
    assertTrue(NodeUtil.isValidPropertyName("_underscore"));
    assertFalse(NodeUtil.isValidPropertyName("class"));
    assertFalse(NodeUtil.isValidPropertyName("123num"));
    assertFalse(NodeUtil.isValidPropertyName("prop Thai"));
  }

  @Test
  public void testGetRootOfQualifiedName() {
    Node qName = NodeUtil.newQualifiedNameNode(convention, "a.b.c", 0, 0);
    Node root = NodeUtil.getRootOfQualifiedName(qName);
    assertEquals(Token.NAME, root.getType());
    assertEquals("a", root.getString());
  }

  @Test
  public void testConstantsAndJSDoc() {
    Node nameNode = Node.newString(Token.NAME, "CONST_VAL");
    nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertTrue(NodeUtil.isConstantName(nameNode));

    Node parent = new Node(Token.VAR, nameNode);
    assertTrue(NodeUtil.isConstantByConvention(convention, nameNode, parent));

    JSDocInfo info = new JSDocInfo();
    nameNode.setJSDocInfo(info);
    assertSame(info, NodeUtil.getInfoForNameNode(nameNode));

    Node fn = NodeUtil.newFunctionNode("fn", Collections.<Node>emptyList(), new Node(Token.BLOCK), 0, 0);
    fn.setJSDocInfo(info);
    assertSame(info, NodeUtil.getFunctionInfo(fn));

    Node sourceNode = Node.newNumber(1);
    sourceNode.putProp(Node.SOURCENAME_PROP, "test.js");
    assertEquals("test.js", NodeUtil.getSourceName(sourceNode));
  }
}
