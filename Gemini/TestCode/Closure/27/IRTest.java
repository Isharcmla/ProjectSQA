package com.google.javascript.rhino;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class IRTest {

  @Test
  public void testPrivateConstructor() throws Exception {
    Constructor<IR> constructor = IR.class.getDeclaredConstructor();
    assertTrue(Modifier.isPrivate(constructor.getModifiers()));
    constructor.setAccessible(true);
    IR instance = constructor.newInstance();
    assertNotNull(instance);
  }

  @Test
  public void testEmpty() {
    Node node = IR.empty();
    assertEquals(Token.EMPTY, node.getType());
  }

  @Test
  public void testFunction_valid() {
    Node name = IR.name("fn");
    Node params = IR.paramList();
    Node body = IR.block();
    Node fn = IR.function(name, params, body);
    assertEquals(Token.FUNCTION, fn.getType());
    assertEquals(name, fn.getFirstChild());
    assertEquals(params, fn.getChildAtIndex(1));
    assertEquals(body, fn.getChildAtIndex(2));
  }

  @Test(expected = IllegalStateException.class)
  public void testFunction_invalidName() {
    IR.function(IR.string("fn"), IR.paramList(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testFunction_invalidParams() {
    IR.function(IR.name("fn"), IR.block(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testFunction_invalidBody() {
    IR.function(IR.name("fn"), IR.paramList(), IR.name("notBlock"));
  }

  @Test
  public void testParamList_noArgs() {
    Node node = IR.paramList();
    assertEquals(Token.PARAM_LIST, node.getType());
    assertEquals(0, node.getChildCount());
  }

  @Test
  public void testParamList_singleParam() {
    Node param = IR.name("a");
    Node node = IR.paramList(param);
    assertEquals(Token.PARAM_LIST, node.getType());
    assertEquals(1, node.getChildCount());
    assertEquals(param, node.getFirstChild());
  }

  @Test(expected = IllegalStateException.class)
  public void testParamList_singleParamInvalid() {
    IR.paramList(IR.number(1));
  }

  @Test
  public void testParamList_varargs() {
    Node param1 = IR.name("a");
    Node param2 = IR.name("b");
    Node node = IR.paramList(param1, param2);
    assertEquals(Token.PARAM_LIST, node.getType());
    assertEquals(2, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testParamList_varargsInvalid() {
    IR.paramList(IR.name("a"), IR.number(1));
  }

  @Test
  public void testParamList_list() {
    List<Node> list = Arrays.asList(IR.name("x"), IR.name("y"));
    Node node = IR.paramList(list);
    assertEquals(Token.PARAM_LIST, node.getType());
    assertEquals(2, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testParamList_listInvalid() {
    List<Node> list = Collections.singletonList(IR.string("x"));
    IR.paramList(list);
  }

  @Test
  public void testBlock_noArgs() {
    Node node = IR.block();
    assertEquals(Token.BLOCK, node.getType());
    assertEquals(0, node.getChildCount());
  }

  @Test
  public void testBlock_singleStmt() {
    Node stmt = IR.exprResult(IR.number(1));
    Node node = IR.block(stmt);
    assertEquals(Token.BLOCK, node.getType());
    assertEquals(1, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testBlock_singleStmtInvalid() {
    IR.block(IR.name("notAStmt"));
  }

  @Test
  public void testBlock_varargs() {
    Node stmt1 = IR.exprResult(IR.number(1));
    Node stmt2 = IR.returnNode();
    Node node = IR.block(stmt1, stmt2);
    assertEquals(Token.BLOCK, node.getType());
    assertEquals(2, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testBlock_varargsInvalid() {
    IR.block(IR.exprResult(IR.number(1)), IR.string("notAStmt"));
  }

  @Test
  public void testScript() {
    Node stmt = IR.exprResult(IR.number(1));
    Node node = IR.script(stmt);
    assertEquals(Token.SCRIPT, node.getType());
    assertEquals(1, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testScript_invalid() {
    IR.script(IR.name("notAStmt"));
  }

  @Test
  public void testVar_single() {
    Node name = IR.name("x");
    Node node = IR.var(name);
    assertEquals(Token.VAR, node.getType());
    assertEquals(name, node.getFirstChild());
  }

  @Test(expected = IllegalStateException.class)
  public void testVar_singleInvalid() {
    IR.var(IR.number(1));
  }

  @Test
  public void testVar_withValue() {
    Node name = IR.name("x");
    Node val = IR.number(42);
    Node node = IR.var(name, val);
    assertEquals(Token.VAR, node.getType());
    assertEquals(name, node.getFirstChild());
    assertEquals(val, name.getFirstChild());
  }

  @Test(expected = IllegalStateException.class)
  public void testVar_withValueNameHasChildren() {
    Node name = IR.name("x");
    name.addChildToFront(IR.number(1));
    IR.var(name, IR.number(2));
  }

  @Test(expected = IllegalStateException.class)
  public void testVar_withValueInvalidExpr() {
    IR.var(IR.name("x"), IR.block());
  }

  @Test
  public void testReturnNode_noArgs() {
    Node node = IR.returnNode();
    assertEquals(Token.RETURN, node.getType());
    assertEquals(0, node.getChildCount());
  }

  @Test
  public void testReturnNode_withExpr() {
    Node node = IR.returnNode(IR.number(0));
    assertEquals(Token.RETURN, node.getType());
    assertEquals(1, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testReturnNode_withInvalidExpr() {
    IR.returnNode(IR.block());
  }

  @Test
  public void testThrowNode() {
    Node node = IR.throwNode(IR.string("error"));
    assertEquals(Token.THROW, node.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testThrowNode_invalid() {
    IR.throwNode(IR.block());
  }

  @Test
  public void testExprResult() {
    Node node = IR.exprResult(IR.number(1));
    assertEquals(Token.EXPR_RESULT, node.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testExprResult_invalid() {
    IR.exprResult(IR.block());
  }

  @Test
  public void testIfNode_twoArgs() {
    Node cond = IR.trueNode();
    Node then = IR.block();
    Node node = IR.ifNode(cond, then);
    assertEquals(Token.IF, node.getType());
    assertEquals(2, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testIfNode_twoArgsInvalidCond() {
    IR.ifNode(IR.block(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testIfNode_twoArgsInvalidThen() {
    IR.ifNode(IR.trueNode(), IR.exprResult(IR.number(1)));
  }

  @Test
  public void testIfNode_threeArgs() {
    Node cond = IR.trueNode();
    Node then = IR.block();
    Node elseNode = IR.block();
    Node node = IR.ifNode(cond, then, elseNode);
    assertEquals(Token.IF, node.getType());
    assertEquals(3, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testIfNode_threeArgsInvalidElse() {
    IR.ifNode(IR.trueNode(), IR.block(), IR.name("invalid"));
  }

  @Test
  public void testDoNode() {
    Node body = IR.block();
    Node cond = IR.trueNode();
    Node node = IR.doNode(body, cond);
    assertEquals(Token.DO, node.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testDoNode_invalidBody() {
    IR.doNode(IR.name("notBlock"), IR.trueNode());
  }

  @Test(expected = IllegalStateException.class)
  public void testDoNode_invalidCond() {
    IR.doNode(IR.block(), IR.block());
  }

  @Test
  public void testForIn() {
    Node targetVar = IR.var(IR.name("i"));
    Node targetExpr = IR.name("i");
    Node obj = IR.name("obj");
    Node body = IR.block();

    Node node1 = IR.forIn(targetVar, obj, body);
    assertEquals(Token.FOR, node1.getType());

    Node node2 = IR.forIn(targetExpr, obj, IR.block());
    assertEquals(Token.FOR, node2.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testForIn_invalidTarget() {
    IR.forIn(IR.block(), IR.name("obj"), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testForIn_invalidCond() {
    IR.forIn(IR.name("i"), IR.block(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testForIn_invalidBody() {
    IR.forIn(IR.name("i"), IR.name("obj"), IR.name("notBlock"));
  }

  @Test
  public void testForNode() {
    Node init = IR.var(IR.name("i"), IR.number(0));
    Node cond = IR.not(IR.trueNode());
    Node incr = IR.name("i");
    Node body = IR.block();

    Node node = IR.forNode(init, cond, incr, body);
    assertEquals(Token.FOR, node.getType());

    Node emptyInit = IR.empty();
    Node emptyCond = IR.empty();
    Node emptyIncr = IR.empty();
    Node nodeEmpty = IR.forNode(emptyInit, emptyCond, emptyIncr, IR.block());
    assertEquals(Token.FOR, nodeEmpty.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testForNode_invalidInit() {
    IR.forNode(IR.block(), IR.empty(), IR.empty(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testForNode_invalidCond() {
    IR.forNode(IR.empty(), IR.block(), IR.empty(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testForNode_invalidIncr() {
    IR.forNode(IR.empty(), IR.empty(), IR.block(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testForNode_invalidBody() {
    IR.forNode(IR.empty(), IR.empty(), IR.empty(), IR.empty());
  }

  @Test
  public void testSwitchNode() {
    Node cond = IR.name("x");
    Node case1 = IR.caseNode(IR.number(1), IR.block());
    Node defaultCase = IR.defaultCase(IR.block());

    Node node = IR.switchNode(cond, case1, defaultCase);
    assertEquals(Token.SWITCH, node.getType());
    assertEquals(3, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testSwitchNode_invalidCond() {
    IR.switchNode(IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testSwitchNode_invalidCase() {
    IR.switchNode(IR.name("x"), IR.block());
  }

  @Test
  public void testCaseNode() {
    Node body = IR.block();
    Node node = IR.caseNode(IR.number(1), body);
    assertEquals(Token.CASE, node.getType());
    assertTrue(body.getBooleanProp(Node.SYNTHETIC_BLOCK_PROP));
  }

  @Test(expected = IllegalStateException.class)
  public void testCaseNode_invalidExpr() {
    IR.caseNode(IR.block(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testCaseNode_invalidBody() {
    IR.caseNode(IR.number(1), IR.number(2));
  }

  @Test
  public void testDefaultCase() {
    Node body = IR.block();
    Node node = IR.defaultCase(body);
    assertEquals(Token.DEFAULT_CASE, node.getType());
    assertTrue(body.getBooleanProp(Node.SYNTHETIC_BLOCK_PROP));
  }

  @Test(expected = IllegalStateException.class)
  public void testDefaultCase_invalidBody() {
    IR.defaultCase(IR.number(1));
  }

  @Test
  public void testLabel() {
    Node labelName = IR.labelName("loop");
    Node stmt = IR.block();
    Node node = IR.label(labelName, stmt);
    assertEquals(Token.LABEL, node.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testLabel_invalidName() {
    IR.label(IR.name("loop"), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testLabel_invalidStmt() {
    IR.label(IR.labelName("loop"), IR.name("invalid"));
  }

  @Test
  public void testLabelName() {
    Node node = IR.labelName("loop");
    assertEquals(Token.LABEL_NAME, node.getType());
    assertEquals("loop", node.getString());
  }

  @Test(expected = IllegalStateException.class)
  public void testLabelName_emptyString() {
    IR.labelName("");
  }

  @Test
  public void testTryFinally() {
    Node tryBody = IR.labelName("tryLabel");
    Node finallyBody = IR.labelName("finallyLabel");
    Node node = IR.tryFinally(tryBody, finallyBody);
    assertEquals(Token.TRY, node.getType());
    assertEquals(3, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testTryFinally_invalidTryBody() {
    IR.tryFinally(IR.block(), IR.labelName("finallyLabel"));
  }

  @Test(expected = IllegalStateException.class)
  public void testTryFinally_invalidFinallyBody() {
    IR.tryFinally(IR.labelName("tryLabel"), IR.block());
  }

  @Test
  public void testTryCatch() {
    Node tryBody = IR.block();
    Node catchNode = IR.catchNode(IR.name("e"), IR.block());
    Node node = IR.tryCatch(tryBody, catchNode);
    assertEquals(Token.TRY, node.getType());
    assertEquals(2, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testTryCatch_invalidTryBody() {
    Node catchNode = IR.catchNode(IR.name("e"), IR.block());
    IR.tryCatch(IR.name("x"), catchNode);
  }

  @Test(expected = IllegalStateException.class)
  public void testTryCatch_invalidCatchNode() {
    IR.tryCatch(IR.block(), IR.block());
  }

  @Test
  public void testTryCatchFinally() {
    Node tryBody = IR.block();
    Node catchNode = IR.catchNode(IR.name("e"), IR.block());
    Node finallyBody = IR.block();
    Node node = IR.tryCatchFinally(tryBody, catchNode, finallyBody);
    assertEquals(Token.TRY, node.getType());
    assertEquals(3, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testTryCatchFinally_invalidFinally() {
    Node tryBody = IR.block();
    Node catchNode = IR.catchNode(IR.name("e"), IR.block());
    IR.tryCatchFinally(tryBody, catchNode, IR.name("invalid"));
  }

  @Test
  public void testCatchNode() {
    Node expr = IR.name("e");
    Node body = IR.block();
    Node node = IR.catchNode(expr, body);
    assertEquals(Token.CATCH, node.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testCatchNode_invalidExpr() {
    IR.catchNode(IR.string("e"), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testCatchNode_invalidBody() {
    IR.catchNode(IR.name("e"), IR.string("body"));
  }

  @Test
  public void testBreakNode() {
    Node node = IR.breakNode();
    assertEquals(Token.BREAK, node.getType());
    assertEquals(0, node.getChildCount());

    Node labeled = IR.breakNode(IR.labelName("label"));
    assertEquals(Token.BREAK, labeled.getType());
    assertEquals(1, labeled.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testBreakNode_invalidLabel() {
    IR.breakNode(IR.name("label"));
  }

  @Test
  public void testContinueNode() {
    Node node = IR.continueNode();
    assertEquals(Token.CONTINUE, node.getType());
    assertEquals(0, node.getChildCount());

    Node labeled = IR.continueNode(IR.labelName("label"));
    assertEquals(Token.CONTINUE, labeled.getType());
    assertEquals(1, labeled.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testContinueNode_invalidLabel() {
    IR.continueNode(IR.name("label"));
  }

  @Test
  public void testCall() {
    Node target = IR.name("fn");
    Node arg1 = IR.number(1);
    Node arg2 = IR.string("s");
    Node node = IR.call(target, arg1, arg2);
    assertEquals(Token.CALL, node.getType());
    assertEquals(3, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testCall_invalidArg() {
    IR.call(IR.name("fn"), IR.block());
  }

  @Test
  public void testNewNode() {
    Node target = IR.name("MyClass");
    Node arg = IR.number(42);
    Node node = IR.newNode(target, arg);
    assertEquals(Token.NEW, node.getType());
    assertEquals(2, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testNewNode_invalidArg() {
    IR.newNode(IR.name("MyClass"), IR.block());
  }

  @Test
  public void testName() {
    Node node = IR.name("myVar");
    assertEquals(Token.NAME, node.getType());
    assertEquals("myVar", node.getString());
  }

  @Test
  public void testGetprop() {
    Node target = IR.name("obj");
    Node prop = IR.string("prop");
    Node node = IR.getprop(target, prop);
    assertEquals(Token.GETPROP, node.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testGetprop_invalidTarget() {
    IR.getprop(IR.block(), IR.string("prop"));
  }

  @Test(expected = IllegalStateException.class)
  public void testGetprop_invalidProp() {
    IR.getprop(IR.name("obj"), IR.name("prop"));
  }

  @Test
  public void testGetelem() {
    Node target = IR.name("arr");
    Node elem = IR.number(0);
    Node node = IR.getelem(target, elem);
    assertEquals(Token.GETELEM, node.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testGetelem_invalidTarget() {
    IR.getelem(IR.block(), IR.number(0));
  }

  @Test(expected = IllegalStateException.class)
  public void testGetelem_invalidElem() {
    IR.getelem(IR.name("arr"), IR.block());
  }

  @Test
  public void testAssign() {
    Node nameTarget = IR.name("x");
    Node getPropTarget = IR.getprop(IR.name("obj"), IR.string("k"));
    Node getElemTarget = IR.getelem(IR.name("arr"), IR.number(0));

    Node val = IR.number(10);
    assertEquals(Token.ASSIGN, IR.assign(nameTarget, val).getType());
    assertEquals(Token.ASSIGN, IR.assign(getPropTarget, val).getType());
    assertEquals(Token.ASSIGN, IR.assign(getElemTarget, val).getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testAssign_invalidTarget() {
    IR.assign(IR.number(1), IR.number(2));
  }

  @Test(expected = IllegalStateException.class)
  public void testAssign_invalidExpr() {
    IR.assign(IR.name("x"), IR.block());
  }

  @Test
  public void testHook() {
    Node cond = IR.trueNode();
    Node trueVal = IR.number(1);
    Node falseVal = IR.number(0);
    Node node = IR.hook(cond, trueVal, falseVal);
    assertEquals(Token.HOOK, node.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testHook_invalidCond() {
    IR.hook(IR.block(), IR.number(1), IR.number(0));
  }

  @Test(expected = IllegalStateException.class)
  public void testHook_invalidTrueVal() {
    IR.hook(IR.trueNode(), IR.block(), IR.number(0));
  }

  @Test(expected = IllegalStateException.class)
  public void testHook_invalidFalseVal() {
    IR.hook(IR.trueNode(), IR.number(1), IR.block());
  }

  @Test
  public void testBinaryOps() {
    Node a = IR.number(1);
    Node b = IR.number(2);

    assertEquals(Token.COMMA, IR.comma(a, b).getType());
    assertEquals(Token.AND, IR.and(a, b).getType());
    assertEquals(Token.OR, IR.or(a, b).getType());
    assertEquals(Token.EQ, IR.eq(a, b).getType());
    assertEquals(Token.SHEQ, IR.sheq(a, b).getType());
    assertEquals(Token.ADD, IR.add(a, b).getType());
    assertEquals(Token.SUB, IR.sub(a, b).getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testBinaryOp_invalidFirstArg() {
    IR.add(IR.block(), IR.number(1));
  }

  @Test(expected = IllegalStateException.class)
  public void testBinaryOp_invalidSecondArg() {
    IR.add(IR.number(1), IR.block());
  }

  @Test
  public void testUnaryOps() {
    Node a = IR.number(1);

    assertEquals(Token.NOT, IR.not(a).getType());
    assertEquals(Token.VOID, IR.voidNode(a).getType());
    assertEquals(Token.NEG, IR.neg(a).getType());
    assertEquals(Token.POS, IR.pos(a).getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testUnaryOp_invalidArg() {
    IR.not(IR.block());
  }

  @Test
  public void testObjectlit() {
    Node key1 = IR.propdef(IR.stringKey("a"), IR.number(1));

    Node getter = new Node(Token.GETTER_DEF, IR.name("getA"));
    getter.addChildToFront(IR.function(IR.name(""), IR.paramList(), IR.block()));

    Node setter = new Node(Token.SETTER_DEF, IR.name("setA"));
    setter.addChildToFront(IR.function(IR.name(""), IR.paramList(IR.name("v")), IR.block()));

    Node node = IR.objectlit(key1, getter, setter);
    assertEquals(Token.OBJECTLIT, node.getType());
    assertEquals(3, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testObjectlit_invalidChildType() {
    IR.objectlit(IR.name("a"));
  }

  @Test(expected = IllegalStateException.class)
  public void testObjectlit_invalidChildCount() {
    Node key = IR.stringKey("a"); // 0 children
    IR.objectlit(key);
  }

  @Test
  public void testPropdef() {
    Node key = IR.stringKey("k");
    Node val = IR.string("v");
    Node node = IR.propdef(key, val);
    assertEquals(Token.STRING_KEY, node.getType());
    assertEquals(val, node.getFirstChild());
  }

  @Test(expected = IllegalStateException.class)
  public void testPropdef_invalidKey() {
    IR.propdef(IR.string("k"), IR.number(1));
  }

  @Test(expected = IllegalStateException.class)
  public void testPropdef_keyAlreadyHasChildren() {
    Node key = IR.stringKey("k");
    key.addChildToFront(IR.number(1));
    IR.propdef(key, IR.number(2));
  }

  @Test(expected = IllegalStateException.class)
  public void testPropdef_invalidValue() {
    IR.propdef(IR.stringKey("k"), IR.block());
  }

  @Test
  public void testArraylit() {
    Node node = IR.arraylit(IR.number(1), IR.empty(), IR.string("a"));
    assertEquals(Token.ARRAYLIT, node.getType());
    assertEquals(3, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testArraylit_invalidChild() {
    IR.arraylit(IR.block());
  }

  @Test
  public void testRegexp_single() {
    Node node = IR.regexp(IR.string("abc"));
    assertEquals(Token.REGEXP, node.getType());
    assertEquals(1, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testRegexp_singleInvalid() {
    IR.regexp(IR.number(1));
  }

  @Test
  public void testRegexp_withFlags() {
    Node node = IR.regexp(IR.string("abc"), IR.string("g"));
    assertEquals(Token.REGEXP, node.getType());
    assertEquals(2, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testRegexp_withFlagsInvalidExpr() {
    IR.regexp(IR.number(1), IR.string("g"));
  }

  @Test(expected = IllegalStateException.class)
  public void testRegexp_withFlagsInvalidFlags() {
    IR.regexp(IR.string("abc"), IR.number(1));
  }

  @Test
  public void testString() {
    Node node = IR.string("hello");
    assertEquals(Token.STRING, node.getType());
    assertEquals("hello", node.getString());
  }

  @Test
  public void testStringKey() {
    Node node = IR.stringKey("key");
    assertEquals(Token.STRING_KEY, node.getType());
    assertEquals("key", node.getString());
  }

  @Test
  public void testNumber() {
    Node nodeZero = IR.number(0.0);
    assertEquals(Token.NUMBER, nodeZero.getType());
    assertEquals(0.0, nodeZero.getDouble(), 0.0);

    Node nodeNeg = IR.number(-123.45);
    assertEquals(-123.45, nodeNeg.getDouble(), 0.0);
  }

  @Test
  public void testLiteralNodes() {
    assertEquals(Token.THIS, IR.thisNode().getType());
    assertEquals(Token.TRUE, IR.trueNode().getType());
    assertEquals(Token.FALSE, IR.falseNode().getType());
    assertEquals(Token.NULL, IR.nullNode().getType());
  }

  @Test
  public void testMayBeStatementTypesCoverage() {
    int[] statementTokens = new int[]{
        Token.EMPTY, Token.FUNCTION, Token.BLOCK, Token.BREAK, Token.CONST,
        Token.CONTINUE, Token.DEBUGGER, Token.DO, Token.EXPR_RESULT, Token.FOR,
        Token.IF, Token.LABEL, Token.RETURN, Token.SWITCH, Token.THROW,
        Token.TRY, Token.VAR, Token.WHILE, Token.WITH
    };

    for (int token : statementTokens) {
      Node node = new Node(token);
      if (token == Token.FUNCTION) {
        node = IR.function(IR.name("f"), IR.paramList(), IR.block());
      }
      Node block = IR.block(node);
      assertNotNull(block);
    }
  }

  @Test
  public void testMayBeExpressionTypesCoverage() {
    int[] expressionTokens = new int[]{
        Token.FUNCTION, Token.ADD, Token.AND, Token.ARRAYLIT, Token.ASSIGN,
        Token.ASSIGN_BITOR, Token.ASSIGN_BITXOR, Token.ASSIGN_BITAND,
        Token.ASSIGN_LSH, Token.ASSIGN_RSH, Token.ASSIGN_URSH, Token.ASSIGN_ADD,
        Token.ASSIGN_SUB, Token.ASSIGN_MUL, Token.ASSIGN_DIV, Token.ASSIGN_MOD,
        Token.BITAND, Token.BITOR, Token.BITNOT, Token.BITXOR, Token.CALL,
        Token.COMMA, Token.DEC, Token.DELPROP, Token.DIV, Token.EQ,
        Token.FALSE, Token.GE, Token.GETPROP, Token.GETELEM, Token.GT,
        Token.HOOK, Token.IN, Token.INC, Token.INSTANCEOF, Token.LE,
        Token.LSH, Token.LT, Token.MOD, Token.MUL, Token.NAME,
        Token.NE, Token.NEG, Token.NEW, Token.NOT, Token.NUMBER,
        Token.NULL, Token.OBJECTLIT, Token.OR, Token.POS, Token.REGEXP,
        Token.RSH, Token.SHEQ, Token.SHNE, Token.STRING, Token.SUB,
        Token.THIS, Token.TYPEOF, Token.TRUE, Token.URSH, Token.VOID
    };

    for (int token : expressionTokens) {
      Node exprNode;
      if (token == Token.NAME || token == Token.STRING) {
        exprNode = Node.newString(token, "s");
      } else if (token == Token.NUMBER) {
        exprNode = Node.newNumber(1);
      } else if (token == Token.FUNCTION) {
        exprNode = IR.function(IR.name("f"), IR.paramList(), IR.block());
      } else {
        exprNode = new Node(token);
      }
      Node returnNode = IR.returnNode(exprNode);
      assertNotNull(returnNode);
    }
  }
}
