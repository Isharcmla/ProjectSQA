package com.google.javascript.jscomp;

import com.google.common.base.Predicates;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class NodeUtilTest {

  @Test
  public void testGetBooleanValue_literals() {
    assertTrue(NodeUtil.getBooleanValue(Node.newString("hello")));
    assertFalse(NodeUtil.getBooleanValue(Node.newString("")));

    assertTrue(NodeUtil.getBooleanValue(Node.newNumber(1.0)));
    assertTrue(NodeUtil.getBooleanValue(Node.newNumber(-1.0)));
    assertFalse(NodeUtil.getBooleanValue(Node.newNumber(0.0)));
    assertFalse(NodeUtil.getBooleanValue(Node.newNumber(-0.0)));

    assertFalse(NodeUtil.getBooleanValue(new Node(Token.NULL)));
    assertFalse(NodeUtil.getBooleanValue(new Node(Token.FALSE)));
    assertFalse(NodeUtil.getBooleanValue(new Node(Token.VOID)));
    assertTrue(NodeUtil.getBooleanValue(new Node(Token.TRUE)));
    assertTrue(NodeUtil.getBooleanValue(new Node(Token.ARRAYLIT)));
    assertTrue(NodeUtil.getBooleanValue(new Node(Token.OBJECTLIT)));
    assertTrue(NodeUtil.getBooleanValue(new Node(Token.REGEXP)));

    assertFalse(NodeUtil.getBooleanValue(Node.newString(Token.NAME, "undefined")));
    assertFalse(NodeUtil.getBooleanValue(Node.newString(Token.NAME, "NaN")));
    assertTrue(NodeUtil.getBooleanValue(Node.newString(Token.NAME, "Infinity")));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetBooleanValue_nonLiteralNameThrows() {
    NodeUtil.getBooleanValue(Node.newString(Token.NAME, "otherVar"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetBooleanValue_nonLiteralNodeThrows() {
    NodeUtil.getBooleanValue(new Node(Token.ADD));
  }

  @Test
  public void testGetStringValue_variousTypes() {
    assertEquals("test", NodeUtil.getStringValue(Node.newString("test")));
    assertEquals("varName", NodeUtil.getStringValue(Node.newString(Token.NAME, "varName")));

    assertEquals("1", NodeUtil.getStringValue(Node.newNumber(1.0)));
    assertEquals("0", NodeUtil.getStringValue(Node.newNumber(0.0)));
    assertEquals("-5", NodeUtil.getStringValue(Node.newNumber(-5.0)));
    assertEquals("1.5", NodeUtil.getStringValue(Node.newNumber(1.5)));

    assertEquals("false", NodeUtil.getStringValue(new Node(Token.FALSE)));
    assertEquals("true", NodeUtil.getStringValue(new Node(Token.TRUE)));
    assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
    assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID)));

    assertNull(NodeUtil.getStringValue(new Node(Token.ARRAYLIT)));
  }

  @Test
  public void testGetFunctionName_variousForms() {
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "foo"), new Node(Token.LP), new Node(Token.BLOCK));
    Node nameParent = Node.newString(Token.NAME, "varName");
    nameParent.addChildToBack(fn);
    assertEquals("varName", NodeUtil.getFunctionName(fn, nameParent));

    Node assignParent = new Node(Token.ASSIGN, NodeUtil.newQualifiedNameNode("a.b.c", 0, 0), fn);
    assertEquals("a.b.c", NodeUtil.getFunctionName(fn, assignParent));

    Node defaultParent = new Node(Token.BLOCK, fn);
    assertEquals("foo", NodeUtil.getFunctionName(fn, defaultParent));

    Node anonFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node defaultParent2 = new Node(Token.BLOCK, anonFn);
    assertNull(NodeUtil.getFunctionName(anonFn, defaultParent2));
  }

  @Test
  public void testIsImmutableValue() {
    assertTrue(NodeUtil.isImmutableValue(Node.newString("s")));
    assertTrue(NodeUtil.isImmutableValue(Node.newNumber(1)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.VOID)));

    Node negNumber = new Node(Token.NEG, Node.newNumber(5));
    assertTrue(NodeUtil.isImmutableValue(negNumber));
    Node negNonImm = new Node(Token.NEG, new Node(Token.ARRAYLIT));
    assertFalse(NodeUtil.isImmutableValue(negNonImm));

    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "undefined")));
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "Infinity")));
    assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "NaN")));
    assertFalse(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "x")));
    assertFalse(NodeUtil.isImmutableValue(new Node(Token.OBJECTLIT)));
  }

  @Test
  public void testIsLiteralValue() {
    assertTrue(NodeUtil.isLiteralValue(Node.newNumber(1)));
    assertTrue(NodeUtil.isLiteralValue(new Node(Token.ARRAYLIT)));

    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newString("a"));
    assertTrue(NodeUtil.isLiteralValue(arrayLit));

    Node arrayLitWithNonLit = new Node(Token.ARRAYLIT, new Node(Token.CALL));
    assertFalse(NodeUtil.isLiteralValue(arrayLitWithNonLit));

    Node objLit = new Node(Token.OBJECTLIT, Node.newString("k"), Node.newNumber(1));
    assertTrue(NodeUtil.isLiteralValue(objLit));

    Node regexpLit = new Node(Token.REGEXP);
    assertTrue(NodeUtil.isLiteralValue(regexpLit));

    assertFalse(NodeUtil.isLiteralValue(new Node(Token.CALL)));
  }

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = new HashSet<String>(Arrays.asList("DEF1", "a.b.DEF2"));
    assertTrue(NodeUtil.isValidDefineValue(Node.newString("s"), defines));
    assertTrue(NodeUtil.isValidDefineValue(Node.newNumber(1), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.TRUE), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.FALSE), defines));

    int[] unaryOps = {Token.BITAND, Token.BITNOT, Token.BITOR, Token.BITXOR, Token.NOT, Token.NEG};
    for (int op : unaryOps) {
      Node node = new Node(op, Node.newNumber(1));
      assertTrue(NodeUtil.isValidDefineValue(node, defines));
      Node invalidNode = new Node(op, new Node(Token.CALL));
      assertFalse(NodeUtil.isValidDefineValue(invalidNode, defines));
    }

    assertTrue(NodeUtil.isValidDefineValue(Node.newString(Token.NAME, "DEF1"), defines));
    assertFalse(NodeUtil.isValidDefineValue(Node.newString(Token.NAME, "UNKNOWN"), defines));

    Node getprop = NodeUtil.newQualifiedNameNode("a.b.DEF2", 0, 0);
    assertTrue(NodeUtil.isValidDefineValue(getprop, defines));

    Node invalidGetprop = NodeUtil.newQualifiedNameNode("a.b.UNKNOWN", 0, 0);
    assertFalse(NodeUtil.isValidDefineValue(invalidGetprop, defines));

    assertFalse(NodeUtil.isValidDefineValue(new Node(Token.OBJECTLIT), defines));
  }

  @Test
  public void testIsEmptyBlock() {
    Node nonBlock = new Node(Token.EXPR_RESULT);
    assertFalse(NodeUtil.isEmptyBlock(nonBlock));

    Node emptyBlock = new Node(Token.BLOCK);
    assertTrue(NodeUtil.isEmptyBlock(emptyBlock));

    Node blockWithEmptyNodes = new Node(Token.BLOCK, new Node(Token.EMPTY), new Node(Token.EMPTY));
    assertTrue(NodeUtil.isEmptyBlock(blockWithEmptyNodes));

    Node blockWithOtherNodes = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT));
    assertFalse(NodeUtil.isEmptyBlock(blockWithOtherNodes));
  }

  @Test
  public void testIsSimpleOperatorType() {
    int[] simpleTypes = {
        Token.ADD, Token.BITAND, Token.BITNOT, Token.BITOR, Token.BITXOR, Token.COMMA,
        Token.DIV, Token.EQ, Token.GE, Token.GETELEM, Token.GETPROP, Token.GT,
        Token.INSTANCEOF, Token.LE, Token.LSH, Token.LT, Token.MOD, Token.MUL,
        Token.NE, Token.NOT, Token.RSH, Token.SHEQ, Token.SHNE, Token.SUB,
        Token.TYPEOF, Token.VOID, Token.POS, Token.NEG, Token.URSH
    };
    for (int type : simpleTypes) {
      assertTrue("Expected true for type: " + type, NodeUtil.isSimpleOperatorType(type));
    }
    assertFalse(NodeUtil.isSimpleOperatorType(Token.ASSIGN));
    assertFalse(NodeUtil.isSimpleOperatorType(Token.CALL));
  }

  @Test
  public void testNewExpr() {
    Node child = Node.newString("test");
    child.setLineno(42);
    child.setCharno(10);
    Node expr = NodeUtil.newExpr(child);
    assertEquals(Token.EXPR_RESULT, expr.getType());
    assertSame(child, expr.getFirstChild());
    assertEquals(42, expr.getLineno());
    assertEquals(10, expr.getCharno());
  }

  @Test
  public void testMayEffectMutableStateAndMayHaveSideEffects() {
    Node num = Node.newNumber(1);
    assertFalse(NodeUtil.mayEffectMutableState(num));
    assertFalse(NodeUtil.mayHaveSideEffects(num));

    Node objLit = new Node(Token.OBJECTLIT);
    assertTrue(NodeUtil.mayEffectMutableState(objLit));
    assertFalse(NodeUtil.mayHaveSideEffects(objLit));

    Node arrLit = new Node(Token.ARRAYLIT);
    assertTrue(NodeUtil.mayEffectMutableState(arrLit));
    assertFalse(NodeUtil.mayHaveSideEffects(arrLit));

    Node regexLit = new Node(Token.REGEXP);
    assertTrue(NodeUtil.mayEffectMutableState(regexLit));
    assertFalse(NodeUtil.mayHaveSideEffects(regexLit));

    Node throwNode = new Node(Token.THROW, Node.newString("err"));
    assertTrue(NodeUtil.mayEffectMutableState(throwNode));
    assertTrue(NodeUtil.mayHaveSideEffects(throwNode));

    Node varNoChild = new Node(Token.VAR);
    assertFalse(NodeUtil.mayHaveSideEffects(varNoChild));
    Node varWithChild = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
    assertTrue(NodeUtil.mayHaveSideEffects(varWithChild));

    Node nameNoChild = Node.newString(Token.NAME, "x");
    assertFalse(NodeUtil.mayHaveSideEffects(nameNoChild));
    Node nameWithChild = Node.newString(Token.NAME, "x");
    nameWithChild.addChildToBack(Node.newNumber(1));
    assertTrue(NodeUtil.mayHaveSideEffects(nameWithChild));

    Node anonFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node script = new Node(Token.SCRIPT, anonFn);
    assertFalse(NodeUtil.mayHaveSideEffects(anonFn));

    Node namedFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "foo"), new Node(Token.LP), new Node(Token.BLOCK));
    Node script2 = new Node(Token.SCRIPT, namedFn);
    assertTrue(NodeUtil.mayHaveSideEffects(namedFn));

    Node newNoSideEffectsCtor = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
    assertFalse(NodeUtil.mayHaveSideEffects(newNoSideEffectsCtor));
    assertTrue(NodeUtil.mayEffectMutableState(newNoSideEffectsCtor));

    Node newCustomCtor = new Node(Token.NEW, Node.newString(Token.NAME, "MyClass"));
    assertTrue(NodeUtil.mayHaveSideEffects(newCustomCtor));

    Node newWithCallTarget = new Node(Token.NEW, new Node(Token.CALL));
    assertTrue(NodeUtil.mayHaveSideEffects(newWithCallTarget));

    Node callNoSideEffects = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    callNoSideEffects.setIsNoSideEffectsCall();
    assertFalse(NodeUtil.mayHaveSideEffects(callNoSideEffects));

    Node callWithSideEffects = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    assertTrue(NodeUtil.mayHaveSideEffects(callWithSideEffects));

    Node assignLit = new Node(Token.ASSIGN, Node.newString("literalKey"), Node.newNumber(1));
    assertFalse(NodeUtil.mayHaveSideEffects(assignLit));

    Node assignName = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(1));
    assertTrue(NodeUtil.mayHaveSideEffects(assignName));

    Node assignWithSideEffectRhs = new Node(Token.ASSIGN, Node.newString("lit"), new Node(Token.CALL));
    assertTrue(NodeUtil.mayHaveSideEffects(assignWithSideEffectRhs));

    Node simpleAdd = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
    assertFalse(NodeUtil.mayHaveSideEffects(simpleAdd));

    Node simpleAddWithCall = new Node(Token.ADD, Node.newNumber(1), new Node(Token.CALL));
    assertTrue(NodeUtil.mayHaveSideEffects(simpleAddWithCall));
  }

  @Test
  public void testConstructorCallHasSideEffects() {
    Node newArray = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
    assertFalse(NodeUtil.constructorCallHasSideEffects(newArray));

    Node newCustom = new Node(Token.NEW, Node.newString(Token.NAME, "Custom"));
    assertTrue(NodeUtil.constructorCallHasSideEffects(newCustom));

    Node newNoSideEffect = new Node(Token.NEW, Node.newString(Token.NAME, "Custom"));
    newNoSideEffect.setIsNoSideEffectsCall();
    assertFalse(NodeUtil.constructorCallHasSideEffects(newNoSideEffect));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorCallHasSideEffects_invalidNodeThrows() {
    NodeUtil.constructorCallHasSideEffects(new Node(Token.CALL));
  }

  @Test
  public void testFunctionCallHasSideEffects() {
    Node callString = new Node(Token.CALL, Node.newString(Token.NAME, "String"));
    assertFalse(NodeUtil.functionCallHasSideEffects(callString));

    Node mathSin = new Node(Token.CALL, NodeUtil.newQualifiedNameNode("Math.sin", 0, 0));
    assertFalse(NodeUtil.functionCallHasSideEffects(mathSin));

    Node otherPropCall = new Node(Token.CALL, NodeUtil.newQualifiedNameNode("Other.sin", 0, 0));
    assertTrue(NodeUtil.functionCallHasSideEffects(otherPropCall));

    Node customCall = new Node(Token.CALL, Node.newString(Token.NAME, "myFunc"));
    assertTrue(NodeUtil.functionCallHasSideEffects(customCall));

    Node noSideEffectCall = new Node(Token.CALL, Node.newString(Token.NAME, "myFunc"));
    noSideEffectCall.setIsNoSideEffectsCall();
    assertFalse(NodeUtil.functionCallHasSideEffects(noSideEffectCall));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFunctionCallHasSideEffects_invalidNodeThrows() {
    NodeUtil.functionCallHasSideEffects(new Node(Token.NEW));
  }

  @Test
  public void testNodeTypeMayHaveSideEffects() {
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.ASSIGN)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.CALL)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DELPROP)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.NEW)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DEC)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.INC)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.THROW)));

    Node nameWithChild = Node.newString(Token.NAME, "x");
    nameWithChild.addChildToBack(Node.newNumber(1));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameWithChild));

    Node nameWithoutChild = Node.newString(Token.NAME, "x");
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(nameWithoutChild));
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(Node.newNumber(1)));
  }

  @Test
  public void testCanBeSideEffected() {
    Node call = new Node(Token.CALL);
    assertTrue(NodeUtil.canBeSideEffected(call));

    Node newN = new Node(Token.NEW);
    assertTrue(NodeUtil.canBeSideEffected(newN));

    Node getprop = new Node(Token.GETPROP);
    assertTrue(NodeUtil.canBeSideEffected(getprop));

    Node getelem = new Node(Token.GETELEM);
    assertTrue(NodeUtil.canBeSideEffected(getelem));

    Node plainName = Node.newString(Token.NAME, "x");
    assertTrue(NodeUtil.canBeSideEffected(plainName));
    assertFalse(NodeUtil.canBeSideEffected(plainName, Collections.singleton("x")));

    Node constName = Node.newString(Token.NAME, "CONST");
    constName.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertFalse(NodeUtil.canBeSideEffected(constName));

    Node tree = new Node(Token.ADD, Node.newNumber(1), Node.newString(Token.NAME, "y"));
    assertTrue(NodeUtil.canBeSideEffected(tree));
    assertFalse(NodeUtil.canBeSideEffected(tree, Collections.singleton("y")));
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
    assertEquals(9, NodeUtil.precedence(Token.LT));
    assertEquals(10, NodeUtil.precedence(Token.LSH));
    assertEquals(11, NodeUtil.precedence(Token.ADD));
    assertEquals(12, NodeUtil.precedence(Token.MUL));
    assertEquals(13, NodeUtil.precedence(Token.NOT));
    assertEquals(15, NodeUtil.precedence(Token.NAME));
    assertEquals(15, NodeUtil.precedence(Token.CALL));
  }

  @Test(expected = Error.class)
  public void testPrecedence_unknownThrows() {
    NodeUtil.precedence(Token.SCRIPT);
  }

  @Test
  public void testIsAssociative() {
    assertTrue(NodeUtil.isAssociative(Token.MUL));
    assertTrue(NodeUtil.isAssociative(Token.AND));
    assertTrue(NodeUtil.isAssociative(Token.OR));
    assertTrue(NodeUtil.isAssociative(Token.BITOR));
    assertTrue(NodeUtil.isAssociative(Token.BITAND));
    assertFalse(NodeUtil.isAssociative(Token.ADD));
    assertFalse(NodeUtil.isAssociative(Token.SUB));
  }

  @Test
  public void testIsAssignmentOpAndGetOpFromAssignmentOp() {
    int[] assignOps = {
        Token.ASSIGN, Token.ASSIGN_BITOR, Token.ASSIGN_BITXOR, Token.ASSIGN_BITAND,
        Token.ASSIGN_LSH, Token.ASSIGN_RSH, Token.ASSIGN_URSH, Token.ASSIGN_ADD,
        Token.ASSIGN_SUB, Token.ASSIGN_MUL, Token.ASSIGN_DIV, Token.ASSIGN_MOD
    };
    for (int op : assignOps) {
      Node n = new Node(op);
      assertTrue(NodeUtil.isAssignmentOp(n));
      if (op != Token.ASSIGN) {
        assertTrue(NodeUtil.getOpFromAssignmentOp(n) > 0);
      }
    }
    assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetOpFromAssignmentOp_plainAssignThrows() {
    NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN));
  }

  @Test
  public void testSimpleTypePredicates() {
    assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT)));
    assertFalse(NodeUtil.isExpressionNode(new Node(Token.ADD)));

    assertTrue(NodeUtil.isGet(new Node(Token.GETPROP)));
    assertTrue(NodeUtil.isGet(new Node(Token.GETELEM)));
    assertFalse(NodeUtil.isGet(new Node(Token.NAME)));

    assertTrue(NodeUtil.isGetProp(new Node(Token.GETPROP)));
    assertFalse(NodeUtil.isGetProp(new Node(Token.GETELEM)));

    assertTrue(NodeUtil.isName(Node.newString(Token.NAME, "a")));
    assertFalse(NodeUtil.isName(Node.newString("a")));

    assertTrue(NodeUtil.isNew(new Node(Token.NEW)));
    assertFalse(NodeUtil.isNew(new Node(Token.CALL)));

    assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
    assertFalse(NodeUtil.isVar(new Node(Token.LET)));

    assertTrue(NodeUtil.isString(Node.newString("s")));
    assertFalse(NodeUtil.isString(new Node(Token.NUMBER)));

    assertTrue(NodeUtil.isAssign(new Node(Token.ASSIGN)));
    assertFalse(NodeUtil.isAssign(new Node(Token.ADD)));

    assertTrue(NodeUtil.isCall(new Node(Token.CALL)));
    assertFalse(NodeUtil.isCall(new Node(Token.NEW)));

    assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
    assertFalse(NodeUtil.isFunction(new Node(Token.CALL)));

    assertTrue(NodeUtil.isThis(new Node(Token.THIS)));
    assertFalse(NodeUtil.isThis(new Node(Token.NAME)));

    assertTrue(NodeUtil.isSwitchCase(new Node(Token.CASE)));
    assertTrue(NodeUtil.isSwitchCase(new Node(Token.DEFAULT)));
    assertFalse(NodeUtil.isSwitchCase(new Node(Token.SWITCH)));
  }

  @Test
  public void testIsVarDeclarationAndGetAssignedValue() {
    Node name = Node.newString(Token.NAME, "x");
    Node varNode = new Node(Token.VAR, name);
    assertTrue(NodeUtil.isVarDeclaration(name));
    assertFalse(NodeUtil.isVarDeclaration(varNode));

    Node val = Node.newNumber(10);
    name.addChildToBack(val);
    assertSame(val, NodeUtil.getAssignedValue(name));

    Node nameAssign = Node.newString(Token.NAME, "y");
    Node assignVal = Node.newNumber(20);
    Node assignNode = new Node(Token.ASSIGN, nameAssign, assignVal);
    assertSame(assignVal, NodeUtil.getAssignedValue(nameAssign));

    Node isolatedName = Node.newString(Token.NAME, "z");
    Node block = new Node(Token.BLOCK, isolatedName);
    assertNull(NodeUtil.getAssignedValue(isolatedName));
  }

  @Test
  public void testIsExprAssignAndIsExprCall() {
    Node assignExpr = new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN));
    assertTrue(NodeUtil.isExprAssign(assignExpr));
    assertFalse(NodeUtil.isExprCall(assignExpr));

    Node callExpr = new Node(Token.EXPR_RESULT, new Node(Token.CALL));
    assertTrue(NodeUtil.isExprCall(callExpr));
    assertFalse(NodeUtil.isExprAssign(callExpr));
  }

  @Test
  public void testLoopAndControlStructures() {
    Node forIn = new Node(Token.FOR, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"), new Node(Token.BLOCK));
    assertTrue(NodeUtil.isForIn(forIn));
    assertTrue(NodeUtil.isLoopStructure(forIn));

    Node for4 = new Node(Token.FOR, new Node(Token.VAR), Node.newNumber(1), new Node(Token.INC), new Node(Token.BLOCK));
    assertFalse(NodeUtil.isForIn(for4));
    assertTrue(NodeUtil.isLoopStructure(for4));

    Node whileNode = new Node(Token.WHILE, Node.newNumber(1), new Node(Token.BLOCK));
    assertTrue(NodeUtil.isLoopStructure(whileNode));

    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), Node.newNumber(1));
    assertTrue(NodeUtil.isLoopStructure(doNode));
    assertFalse(NodeUtil.isLoopStructure(new Node(Token.IF)));

    assertSame(for4.getLastChild(), NodeUtil.getLoopCodeBlock(for4));
    assertSame(whileNode.getLastChild(), NodeUtil.getLoopCodeBlock(whileNode));
    assertSame(doNode.getFirstChild(), NodeUtil.getLoopCodeBlock(doNode));
    assertNull(NodeUtil.getLoopCodeBlock(new Node(Token.IF)));

    int[] controlTypes = {
        Token.FOR, Token.DO, Token.WHILE, Token.WITH, Token.IF,
        Token.LABEL, Token.TRY, Token.CATCH, Token.SWITCH, Token.CASE, Token.DEFAULT
    };
    for (int type : controlTypes) {
      assertTrue(NodeUtil.isControlStructure(new Node(type)));
    }
    assertFalse(NodeUtil.isControlStructure(new Node(Token.BLOCK)));
  }

  @Test
  public void testIsControlStructureCodeBlock() {
    Node body = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.EMPTY), body);
    assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, body));

    Node doNode = new Node(Token.DO, body, Node.newNumber(1));
    assertTrue(NodeUtil.isControlStructureCodeBlock(doNode, body));

    Node cond = Node.newNumber(1);
    Node ifNode = new Node(Token.IF, cond, body);
    assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, cond));
    assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, body));

    Node tryCatch = new Node(Token.BLOCK);
    Node tryNode = new Node(Token.TRY, body, tryCatch);
    assertTrue(NodeUtil.isControlStructureCodeBlock(tryNode, body));
    assertTrue(NodeUtil.isControlStructureCodeBlock(tryNode, tryCatch));

    Node catchBody = new Node(Token.BLOCK);
    Node catchNode = new Node(Token.CATCH, Node.newString(Token.NAME, "e"), catchBody);
    assertTrue(NodeUtil.isControlStructureCodeBlock(catchNode, catchBody));

    Node defaultNode = new Node(Token.DEFAULT, body);
    assertTrue(NodeUtil.isControlStructureCodeBlock(defaultNode, body));
  }

  @Test
  public void testGetConditionExpression() {
    Node cond = Node.newNumber(1);
    Node body = new Node(Token.BLOCK);
    Node ifNode = new Node(Token.IF, cond, body);
    assertSame(cond, NodeUtil.getConditionExpression(ifNode));

    Node whileNode = new Node(Token.WHILE, cond, body);
    assertSame(cond, NodeUtil.getConditionExpression(whileNode));

    Node doNode = new Node(Token.DO, body, cond);
    assertSame(cond, NodeUtil.getConditionExpression(doNode));

    Node for4 = new Node(Token.FOR, new Node(Token.EMPTY), cond, new Node(Token.EMPTY), body);
    assertSame(cond, NodeUtil.getConditionExpression(for4));

    Node for3 = new Node(Token.FOR, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"), body);
    assertNull(NodeUtil.getConditionExpression(for3));

    Node caseNode = new Node(Token.CASE, cond, body);
    assertNull(NodeUtil.getConditionExpression(caseNode));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_invalidNodeThrows() {
    NodeUtil.getConditionExpression(new Node(Token.EXPR_RESULT));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_invalidForChildCountThrows() {
    Node for2 = new Node(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY));
    NodeUtil.getConditionExpression(for2);
  }

  @Test
  public void testIsStatementBlockAndIsStatement() {
    assertTrue(NodeUtil.isStatementBlock(new Node(Token.SCRIPT)));
    assertTrue(NodeUtil.isStatementBlock(new Node(Token.BLOCK)));
    assertFalse(NodeUtil.isStatementBlock(new Node(Token.EXPR_RESULT)));

    Node stmt = new Node(Token.EXPR_RESULT);
    Node script = new Node(Token.SCRIPT, stmt);
    assertTrue(NodeUtil.isStatement(stmt));

    Node expr = new Node(Token.ADD);
    Node exprStmt = new Node(Token.EXPR_RESULT, expr);
    assertFalse(NodeUtil.isStatement(expr));
  }

  @Test
  public void testIsReferenceNameAndIsLabelName() {
    Node name = Node.newString(Token.NAME, "myVar");
    assertTrue(NodeUtil.isReferenceName(name));

    Node emptyName = Node.newString(Token.NAME, "");
    assertFalse(NodeUtil.isReferenceName(emptyName));

    Node labelName = Node.newString(Token.NAME, "lbl");
    Node labelNode = new Node(Token.LABEL, labelName, new Node(Token.BLOCK));
    assertTrue(NodeUtil.isLabelName(labelName));
    assertFalse(NodeUtil.isReferenceName(labelName));

    Node breakName = Node.newString(Token.NAME, "lbl");
    Node breakNode = new Node(Token.BREAK, breakName);
    assertTrue(NodeUtil.isLabelName(breakName));

    Node continueName = Node.newString(Token.NAME, "lbl");
    Node continueNode = new Node(Token.CONTINUE, continueName);
    assertTrue(NodeUtil.isLabelName(continueName));

    assertFalse(NodeUtil.isLabelName(null));
    assertFalse(NodeUtil.isLabelName(new Node(Token.NUMBER)));
  }

  @Test
  public void testRemoveChild() {
    Node stmt1 = new Node(Token.EXPR_RESULT);
    Node stmt2 = new Node(Token.EXPR_RESULT);
    Node block = new Node(Token.BLOCK, stmt1, stmt2);
    NodeUtil.removeChild(block, stmt1);
    assertEquals(1, block.getChildCount());

    Node varName1 = Node.newString(Token.NAME, "a");
    Node varName2 = Node.newString(Token.NAME, "b");
    Node varNode = new Node(Token.VAR, varName1, varName2);
    Node blockParent = new Node(Token.BLOCK, varNode);
    NodeUtil.removeChild(varNode, varName1);
    assertEquals(1, varNode.getChildCount());

    NodeUtil.removeChild(varNode, varName2);
    assertEquals(0, blockParent.getChildCount());

    Node innerBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT));
    Node outer = new Node(Token.IF, Node.newNumber(1), innerBlock);
    NodeUtil.removeChild(outer, innerBlock);
    assertEquals(0, innerBlock.getChildCount());

    Node labelName = Node.newString(Token.NAME, "L");
    Node labelChild = new Node(Token.BLOCK);
    Node labelNode = new Node(Token.LABEL, labelName, labelChild);
    Node scriptParent = new Node(Token.SCRIPT, labelNode);
    NodeUtil.removeChild(labelNode, labelChild);
    assertEquals(0, scriptParent.getChildCount());

    Node forInit = new Node(Token.VAR, Node.newString(Token.NAME, "i"));
    Node forCond = Node.newNumber(1);
    Node forInc = new Node(Token.INC);
    Node forBody = new Node(Token.BLOCK);
    Node for4 = new Node(Token.FOR, forInit, forCond, forInc, forBody);
    NodeUtil.removeChild(for4, forCond);
    assertEquals(Token.EMPTY, for4.getFirstChild().getNext().getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testRemoveChild_invalidThrows() {
    Node parent = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
    NodeUtil.removeChild(parent, parent.getFirstChild());
  }

  @Test
  public void testTryMergeBlock() {
    Node child1 = new Node(Token.EXPR_RESULT);
    Node child2 = new Node(Token.EXPR_RESULT);
    Node innerBlock = new Node(Token.BLOCK, child1, child2);
    Node parentBlock = new Node(Token.BLOCK, innerBlock);

    assertTrue(NodeUtil.tryMergeBlock(innerBlock));
    assertEquals(2, parentBlock.getChildCount());
    assertSame(child1, parentBlock.getFirstChild());
    assertSame(child2, parentBlock.getLastChild());

    Node singleChild = new Node(Token.EXPR_RESULT);
    Node labelBlock = new Node(Token.BLOCK, singleChild);
    Node labelNode = new Node(Token.LABEL, Node.newString(Token.NAME, "L"), labelBlock);
    assertTrue(NodeUtil.tryMergeBlock(labelBlock));
    assertSame(singleChild, labelNode.getLastChild());

    Node isolatedBlock = new Node(Token.BLOCK);
    Node ifNode = new Node(Token.IF, Node.newNumber(1), isolatedBlock);
    assertFalse(NodeUtil.tryMergeBlock(isolatedBlock));
  }

  @Test
  public void testFunctionHelpers() {
    Node body = new Node(Token.BLOCK);
    Node lp = new Node(Token.LP, Node.newString(Token.NAME, "param1"));
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "fnName"), lp, body);
    Node script = new Node(Token.SCRIPT, fn);

    assertSame(body, NodeUtil.getFunctionBody(fn));
    assertSame(lp, NodeUtil.getFnParameters(fn));
    assertTrue(NodeUtil.isFunctionDeclaration(fn));
    assertTrue(NodeUtil.isHoistedFunctionDeclaration(fn));
    assertFalse(NodeUtil.isAnonymousFunction(fn));

    Node anonFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node assign = new Node(Token.ASSIGN, Node.newString(Token.NAME, "f"), anonFn);
    assertTrue(NodeUtil.isAnonymousFunction(anonFn));
    assertFalse(NodeUtil.isFunctionDeclaration(anonFn));

    Node fnWithArgs = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP),
        new Node(Token.BLOCK, Node.newString(Token.NAME, "arguments")));
    assertTrue(NodeUtil.isVarArgsFunction(fnWithArgs));

    Node fnWithoutArgs = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP),
        new Node(Token.BLOCK, Node.newString(Token.NAME, "other")));
    assertFalse(NodeUtil.isVarArgsFunction(fnWithoutArgs));
  }

  @Test
  public void testFunctionObjectCalls() {
    Node simpleCall = new Node(Token.CALL, NodeUtil.newQualifiedNameNode("func.call", 0, 0));
    assertTrue(NodeUtil.isFunctionObjectCall(simpleCall));
    assertTrue(NodeUtil.isSimpleFunctionObjectCall(simpleCall));
    assertFalse(NodeUtil.isFunctionObjectApply(simpleCall));

    Node simpleApply = new Node(Token.CALL, NodeUtil.newQualifiedNameNode("func.apply", 0, 0));
    assertTrue(NodeUtil.isFunctionObjectApply(simpleApply));
    assertFalse(NodeUtil.isFunctionObjectCall(simpleApply));

    Node chainedCall = new Node(Token.CALL, NodeUtil.newQualifiedNameNode("a.b.func.call", 0, 0));
    assertTrue(NodeUtil.isFunctionObjectCall(chainedCall));
    assertFalse(NodeUtil.isSimpleFunctionObjectCall(chainedCall));

    Node plainCall = new Node(Token.CALL, Node.newString(Token.NAME, "func"));
    assertFalse(NodeUtil.isFunctionObjectCall(plainCall));
    assertFalse(NodeUtil.isFunctionObjectApply(plainCall));
  }

  @Test
  public void testIsLhsAndIsObjectLitKey() {
    Node lhs = Node.newString(Token.NAME, "x");
    Node rhs = Node.newNumber(1);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);
    assertTrue(NodeUtil.isLhs(lhs, assign));
    assertFalse(NodeUtil.isLhs(rhs, assign));

    Node varChild = Node.newString(Token.NAME, "y");
    Node varNode = new Node(Token.VAR, varChild);
    assertTrue(NodeUtil.isLhs(varChild, varNode));

    Node key1 = Node.newString("k1");
    Node val1 = Node.newNumber(1);
    Node key2 = Node.newString("k2");
    Node val2 = Node.newNumber(2);
    Node objLit = new Node(Token.OBJECTLIT, key1, val1, key2, val2);

    assertTrue(NodeUtil.isObjectLitKey(key1, objLit));
    assertFalse(NodeUtil.isObjectLitKey(val1, objLit));
    assertTrue(NodeUtil.isObjectLitKey(key2, objLit));
    assertFalse(NodeUtil.isObjectLitKey(val2, objLit));
    assertFalse(NodeUtil.isObjectLitKey(key1, new Node(Token.BLOCK)));
  }

  @Test
  public void testOpToStrAndOpToStrNoFail() {
    assertEquals("+", NodeUtil.opToStr(Token.ADD));
    assertEquals("-", NodeUtil.opToStr(Token.SUB));
    assertEquals("===", NodeUtil.opToStr(Token.SHEQ));
    assertEquals("instanceof", NodeUtil.opToStr(Token.INSTANCEOF));
    assertEquals("void", NodeUtil.opToStr(Token.VOID));
    assertNull(NodeUtil.opToStr(Token.SCRIPT));

    assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
  }

  @Test(expected = Error.class)
  public void testOpToStrNoFail_unknownThrows() {
    NodeUtil.opToStrNoFail(Token.SCRIPT);
  }

  @Test
  public void testContainsAndReferences() {
    Node root = new Node(Token.BLOCK,
        new Node(Token.EXPR_RESULT, new Node(Token.THIS)),
        new Node(Token.EXPR_RESULT, new Node(Token.CALL, Node.newString(Token.NAME, "foo"))),
        new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP),
            new Node(Token.BLOCK, new Node(Token.CALL, Node.newString(Token.NAME, "bar"))))
    );

    assertTrue(NodeUtil.referencesThis(root));
    assertTrue(NodeUtil.containsCall(root));
    assertTrue(NodeUtil.containsFunctionDeclaration(root));
    assertTrue(NodeUtil.isNodeTypeReferenced(root, Token.THIS));
    assertEquals(2, NodeUtil.getNodeTypeReferenceCount(root, Token.CALL));
    assertTrue(NodeUtil.isNameReferenced(root, "foo"));
    assertEquals(1, NodeUtil.getNameReferenceCount(root, "bar"));
    assertFalse(NodeUtil.isNameReferenced(root, "baz"));

    assertTrue(NodeUtil.containsTypeInOuterScope(root, Token.THIS));
    assertTrue(NodeUtil.containsTypeInOuterScope(root, Token.CALL));
  }

  @Test
  public void testRedeclareVarsInsideBranchAndCopyNameAnnotations() {
    Node var1 = new Node(Token.VAR, Node.newString(Token.NAME, "v1"));
    var1.getFirstChild().putBooleanProp(Node.IS_CONSTANT_NAME, true);
    Node block = new Node(Token.BLOCK, var1);
    Node script = new Node(Token.SCRIPT, block);

    NodeUtil.redeclareVarsInsideBranch(block);
    assertEquals(Token.VAR, script.getFirstChild().getType());
    assertEquals("v1", script.getFirstChild().getFirstChild().getString());
    assertTrue(script.getFirstChild().getFirstChild().getBooleanProp(Node.IS_CONSTANT_NAME));

    Node emptyBlock = new Node(Token.BLOCK);
    Node script2 = new Node(Token.SCRIPT, emptyBlock);
    NodeUtil.redeclareVarsInsideBranch(emptyBlock);
    assertEquals(1, script2.getChildCount());
  }

  @Test
  public void testNewFunctionNodeAndNewQualifiedNameNode() {
    List<Node> params = Arrays.asList(Node.newString(Token.NAME, "p1"), Node.newString(Token.NAME, "p2"));
    Node body = new Node(Token.BLOCK);
    FunctionNode fn = NodeUtil.newFunctionNode("myFunc", params, body, 1, 2);
    assertNotNull(fn);
    assertEquals("myFunc", fn.getFunctionName());
    assertEquals(3, fn.getChildCount());

    Node singleName = NodeUtil.newQualifiedNameNode("foo", 10, 20);
    assertEquals(Token.NAME, singleName.getType());
    assertEquals("foo", singleName.getString());

    Node qualName = NodeUtil.newQualifiedNameNode("foo.bar.baz", 10, 20);
    assertEquals(Token.GETPROP, qualName.getType());
    assertEquals("foo.bar.baz", qualName.getQualifiedName());

    Node basis = Node.newString(Token.NAME, "orig");
    basis.setLineno(5);
    basis.setCharno(6);
    Node fromBasis = NodeUtil.newQualifiedNameNode("a.b", basis, "origDebug");
    assertEquals("origDebug", fromBasis.getProp(Node.ORIGINALNAME_PROP));

    Node createdName = NodeUtil.newName("newName", basis, "dbgName");
    assertEquals(Token.NAME, createdName.getType());
    assertEquals("newName", createdName.getString());
    assertEquals("dbgName", createdName.getProp(Node.ORIGINALNAME_PROP));
  }

  @Test
  public void testLatinAndValidPropertyName() {
    assertTrue(NodeUtil.isLatin("abcXYZ_123"));
    assertFalse(NodeUtil.isLatin("hello\u00FFworld"));

    assertTrue(NodeUtil.isValidPropertyName("validProp"));
    assertTrue(NodeUtil.isValidPropertyName("$dollar_1"));
    assertFalse(NodeUtil.isValidPropertyName("default"));
    assertFalse(NodeUtil.isValidPropertyName("123invalid"));
    assertFalse(NodeUtil.isValidPropertyName("prop\u00FF"));
  }

  @Test
  public void testPrototypeHelpers() {
    Node qName = NodeUtil.newQualifiedNameNode("MyClass.prototype.myMethod", 0, 0);
    assertTrue(NodeUtil.isPrototypeProperty(qName));
    assertEquals("MyClass", NodeUtil.getPrototypeClassName(qName).getQualifiedName());
    assertEquals("myMethod", NodeUtil.getPrototypePropertyName(qName));

    Node assignExpr = new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN, qName, Node.newNumber(1)));
    assertTrue(NodeUtil.isPrototypePropertyDeclaration(assignExpr));

    Node nonProto = NodeUtil.newQualifiedNameNode("MyClass.myMethod", 0, 0);
    assertFalse(NodeUtil.isPrototypeProperty(nonProto));
    assertNull(NodeUtil.getPrototypeClassName(nonProto));
  }

  @Test
  public void testNewUndefinedNodeAndNewVarNode() {
    Node undef = NodeUtil.newUndefinedNode();
    assertEquals(Token.VOID, undef.getType());
    assertEquals(0.0, undef.getFirstChild().getDouble(), 0.0);

    Node varNode = NodeUtil.newVarNode("v", Node.newNumber(5));
    assertEquals(Token.VAR, varNode.getType());
    assertEquals("v", varNode.getFirstChild().getString());
    assertEquals(5.0, varNode.getFirstChild().getFirstChild().getDouble(), 0.0);

    Node varNoVal = NodeUtil.newVarNode("v2", null);
    assertEquals(Token.VAR, varNoVal.getType());
    assertEquals(0, varNoVal.getFirstChild().getChildCount());
  }

  @Test
  public void testTraversals() {
    Node tree = new Node(Token.BLOCK,
        new Node(Token.EXPR_RESULT, Node.newNumber(1)),
        new Node(Token.EXPR_RESULT, Node.newNumber(2))
    );

    final List<Integer> preOrderTypes = new ArrayList<Integer>();
    NodeUtil.visitPreOrder(tree, new NodeUtil.Visitor() {
      public void visit(Node node) {
        preOrderTypes.add(node.getType());
      }
    }, Predicates.<Node>alwaysTrue());

    assertEquals(5, preOrderTypes.size());
    assertEquals(Integer.valueOf(Token.BLOCK), preOrderTypes.get(0));

    final List<Integer> postOrderTypes = new ArrayList<Integer>();
    NodeUtil.visitPostOrder(tree, new NodeUtil.Visitor() {
      public void visit(Node node) {
        postOrderTypes.add(node.getType());
      }
    }, Predicates.<Node>alwaysTrue());

    assertEquals(5, postOrderTypes.size());
    assertEquals(Integer.valueOf(Token.BLOCK), postOrderTypes.get(postOrderTypes.size() - 1));
  }

  @Test
  public void testTryCatchFinallyHelpers() {
    Node tryBlock = new Node(Token.BLOCK);
    Node catchNode = new Node(Token.CATCH, Node.newString(Token.NAME, "e"), new Node(Token.BLOCK));
    Node catchBlock = new Node(Token.BLOCK, catchNode);
    Node finallyBlock = new Node(Token.BLOCK);

    Node try3 = new Node(Token.TRY, tryBlock, catchBlock, finallyBlock);
    assertTrue(NodeUtil.hasFinally(try3));
    assertSame(catchBlock, NodeUtil.getCatchBlock(try3));
    assertTrue(NodeUtil.hasCatchHandler(catchBlock));
    assertTrue(NodeUtil.isTryFinallyNode(try3, finallyBlock));
    assertFalse(NodeUtil.isTryFinallyNode(try3, tryBlock));

    Node try2 = new Node(Token.TRY, tryBlock, catchBlock);
    assertFalse(NodeUtil.hasFinally(try2));

    Node emptyBlock = new Node(Token.BLOCK);
    assertFalse(NodeUtil.hasCatchHandler(emptyBlock));
  }

  @Test
  public void testConstantAndSourceNameAndJSDoc() {
    Node name = Node.newString(Token.NAME, "MY_CONST");
    assertFalse(NodeUtil.isConstantName(name));
    name.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertTrue(NodeUtil.isConstantName(name));

    Node root = new Node(Token.BLOCK);
    root.putProp(Node.SOURCENAME_PROP, "file.js");
    Node child = new Node(Token.EXPR_RESULT);
    root.addChildToBack(child);
    assertEquals("file.js", NodeUtil.getSourceName(child));
    assertNull(NodeUtil.getSourceName(null));

    assertNull(NodeUtil.getInfoForNameNode(null));
    assertNull(NodeUtil.getInfoForNameNode(name));
  }
}
