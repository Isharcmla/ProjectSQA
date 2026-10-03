package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Charsets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class CodeGeneratorTest {

  private TestCodeConsumer consumer;
  private CodeGenerator generator;

  private static class TestCodeConsumer extends CodeConsumer {
    final StringBuilder buffer = new StringBuilder();
    boolean continueProcessing = true;
    boolean preserveExtraBlocks = false;

    @Override
    boolean continueProcessing() {
      return continueProcessing;
    }

    @Override
    void add(String str) {
      buffer.append(str);
    }

    @Override
    void addIdentifier(String identifier) {
      buffer.append(identifier);
    }

    @Override
    void addOp(String op, boolean binOp) {
      buffer.append(op);
    }

    @Override
    void addNumber(double x) {
      if (x == (long) x) {
        buffer.append((long) x);
      } else {
        buffer.append(x);
      }
    }

    @Override
    void endStatement(boolean needSemi) {
      if (needSemi) {
        buffer.append(";");
      }
    }

    @Override
    void endStatement() {
      buffer.append(";");
    }

    @Override
    void beginBlock() {
      buffer.append("{");
    }

    @Override
    void endBlock(boolean breakAfter) {
      buffer.append("}");
    }

    @Override
    void startSourceMapping(Node n) {}

    @Override
    void endSourceMapping(Node n) {}

    @Override
    void endFunction(boolean isStatement) {}

    @Override
    void maybeLineBreak() {}

    @Override
    void notePreferredLineBreak() {}

    @Override
    boolean shouldPreserveExtraBlocks() {
      return preserveExtraBlocks;
    }

    @Override
    boolean breakAfterBlockFor(Node n, boolean isStatement) {
      return false;
    }

    @Override
    void listSeparator() {
      buffer.append(",");
    }

    @Override
    void beginCaseBody() {
      buffer.append(":");
    }

    @Override
    void endCaseBody() {}

    @Override
    char getLastChar() {
      return buffer.length() > 0 ? buffer.charAt(buffer.length() - 1) : '\0';
    }

    @Override
    void append(String str) {
      buffer.append(str);
    }

    String getOutput() {
      return buffer.toString();
    }
  }

  @Before
  public void setUp() {
    consumer = new TestCodeConsumer();
    generator = new CodeGenerator(consumer);
  }

  @Test
  public void testTagAsStrict() {
    generator.tagAsStrict();
    assertEquals("'use strict';", consumer.getOutput());
  }

  @Test
  public void testAddString() {
    generator.add("var x = 1;");
    assertEquals("var x = 1;", consumer.getOutput());
  }

  @Test
  public void testAddNode_whenProcessingStopped_doesNothing() {
    consumer.continueProcessing = false;
    Node node = Node.newString(Token.NAME, "a");
    generator.add(node);
    assertEquals("", consumer.getOutput());
  }

  @Test
  public void testIsSimpleNumber() {
    assertTrue(CodeGenerator.isSimpleNumber("123"));
    assertTrue(CodeGenerator.isSimpleNumber("1"));
    assertFalse(CodeGenerator.isSimpleNumber("0"));
    assertFalse(CodeGenerator.isSimpleNumber("0123"));
    assertFalse(CodeGenerator.isSimpleNumber(""));
    assertFalse(CodeGenerator.isSimpleNumber("abc"));
    assertFalse(CodeGenerator.isSimpleNumber("12a"));
    assertFalse(CodeGenerator.isSimpleNumber("-5"));
  }

  @Test
  public void testGetSimpleNumber() {
    assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.0);
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("0")));
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("abc")));
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("999999999999999999999999999999999999")));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_specialChars() {
    assertEquals("\"\\x00\"", CodeGenerator.escapeToDoubleQuotedJsString("\0"));
    assertEquals("\"\\x0B\"", CodeGenerator.escapeToDoubleQuotedJsString("\u000B"));
    assertEquals("\"\\n\"", CodeGenerator.escapeToDoubleQuotedJsString("\n"));
    assertEquals("\"\\r\"", CodeGenerator.escapeToDoubleQuotedJsString("\r"));
    assertEquals("\"\\t\"", CodeGenerator.escapeToDoubleQuotedJsString("\t"));
    assertEquals("\"\\\\\"", CodeGenerator.escapeToDoubleQuotedJsString("\\"));
    assertEquals("\"\\\"\"", CodeGenerator.escapeToDoubleQuotedJsString("\""));
    assertEquals("\"'\"", CodeGenerator.escapeToDoubleQuotedJsString("'"));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_htmlTagsAndComments() {
    assertEquals("\"--\\>\"", CodeGenerator.escapeToDoubleQuotedJsString("-->"));
    assertEquals("\"]]\\>\"", CodeGenerator.escapeToDoubleQuotedJsString("]]>"));
    assertEquals("\"<\\/script>\"", CodeGenerator.escapeToDoubleQuotedJsString("</script>"));
    assertEquals("\"<\\/SCRIPT>\"", CodeGenerator.escapeToDoubleQuotedJsString("</SCRIPT>"));
    assertEquals("\"<\\!--\"", CodeGenerator.escapeToDoubleQuotedJsString("<!--"));
  }

  @Test
  public void testRegexpEscape() {
    assertEquals("/abc/", CodeGenerator.regexpEscape("abc"));
    assertEquals("/a\\/b/", CodeGenerator.regexpEscape("a/b"));
    CharsetEncoder encoder = Charsets.US_ASCII.newEncoder();
    assertEquals("/\\u00a9/", CodeGenerator.regexpEscape("\u00A9", encoder));
  }

  @Test
  public void testIdentifierEscape() {
    assertEquals("validIdent", CodeGenerator.identifierEscape("validIdent"));
    assertEquals("foo\\u00a9", CodeGenerator.identifierEscape("foo\u00A9"));
    String supplementary = new String(Character.toChars(0x10000));
    assertEquals("\\ud800\\udc00", CodeGenerator.identifierEscape(supplementary));
  }

  @Test
  public void testConstructorsWithCharsets() {
    CodeGenerator cgAscii = new CodeGenerator(consumer, Charsets.US_ASCII);
    cgAscii.add(Node.newString("a\u00A9b"));
    assertEquals("\"a\\u00a9b\"", consumer.getOutput());

    TestCodeConsumer utfConsumer = new TestCodeConsumer();
    CodeGenerator cgUtf = new CodeGenerator(utfConsumer, Charset.forName("UTF-8"));
    cgUtf.add(Node.newString("a\u00A9b"));
    assertEquals("\"a\u00A9b\"", utfConsumer.getOutput());
  }

  @Test
  public void testAddBinaryOperators_associativeAndAssignment() {
    Node a = Node.newString(Token.NAME, "a");
    Node b = Node.newString(Token.NAME, "b");
    Node c = Node.newString(Token.NAME, "c");
    Node addInner = new Node(Token.ADD, b, c);
    Node addOuter = new Node(Token.ADD, a, addInner);
    generator.add(addOuter);
    assertEquals("a+b+c", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node assignInner = new Node(Token.ASSIGN, b, c);
    Node assignOuter = new Node(Token.ASSIGN, a, assignInner);
    generator.add(assignOuter);
    assertEquals("a=b=c", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node subInner = new Node(Token.SUB, b, c);
    Node subOuter = new Node(Token.SUB, a, subInner);
    generator.add(subOuter);
    assertEquals("a-(b-c)", consumer.getOutput());
  }

  @Test(expected = IllegalStateException.class)
  public void testAddBinaryOperator_invalidChildCount_throwsException() {
    Node a = Node.newString(Token.NAME, "a");
    Node addOnlyOneChild = new Node(Token.ADD, a);
    generator.add(addOnlyOneChild);
  }

  @Test
  public void testAddTryCatchFinally() {
    Node tryBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "x")));
    Node catchVar = Node.newString(Token.NAME, "e");
    Node catchBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "y")));
    Node catchNode = new Node(Token.CATCH, catchVar, catchBody);
    Node catchBlock = new Node(Token.BLOCK, catchNode);
    Node finallyBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "z")));

    Node tryCatchFinally = new Node(Token.TRY, tryBody, catchBlock, finallyBlock);
    generator.add(tryCatchFinally);
    assertEquals("try{x;}catch(e){y;}finally{z;}", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node emptyCatchBlock = new Node(Token.BLOCK);
    Node tryFinally = new Node(Token.TRY, tryBody.cloneTree(), emptyCatchBlock, finallyBlock.cloneTree());
    generator.add(tryFinally);
    assertEquals("try{x;}finally{z;}", consumer.getOutput());
  }

  @Test
  public void testAddThrow() {
    Node th = new Node(Token.THROW, Node.newString(Token.NAME, "err"));
    generator.add(th);
    assertEquals("throw err;", consumer.getOutput());
  }

  @Test
  public void testAddReturn() {
    Node retEmpty = new Node(Token.RETURN);
    generator.add(retEmpty);
    assertEquals("return;", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node retVal = new Node(Token.RETURN, Node.newNumber(1));
    generator.add(retVal);
    assertEquals("return 1;", consumer.getOutput());
  }

  @Test
  public void testAddVar() {
    Node name1 = Node.newString(Token.NAME, "a");
    name1.addChildToBack(Node.newNumber(1));
    Node name2 = Node.newString(Token.NAME, "b");
    Node commaVal = new Node(Token.COMMA, Node.newNumber(2), Node.newNumber(3));
    name2.addChildToBack(commaVal);

    Node varNode = new Node(Token.VAR, name1, name2);
    generator.add(varNode);
    assertEquals("var a=1,b=(2,3)", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node emptyVar = new Node(Token.VAR);
    generator.add(emptyVar);
    assertEquals("", consumer.getOutput());
  }

  @Test
  public void testAddLabelAndLabelName() {
    Node labelName = Node.newString(Token.LABEL_NAME, "myLabel");
    Node stmt = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "x")));
    Node label = new Node(Token.LABEL, labelName, stmt);
    generator.add(label);
    assertEquals("myLabel:{x;}", consumer.getOutput());
  }

  @Test
  public void testAddArrayLit() {
    Node emptySlot = new Node(Token.EMPTY);
    Node elem1 = Node.newNumber(1);
    Node trailingEmpty = new Node(Token.EMPTY);
    Node arr = new Node(Token.ARRAYLIT, elem1, emptySlot, trailingEmpty);
    generator.add(arr);
    assertEquals("[1,,]", consumer.getOutput());
  }

  @Test
  public void testAddParamList() {
    Node p1 = Node.newString(Token.NAME, "a");
    Node p2 = Node.newString(Token.NAME, "b");
    Node paramList = new Node(Token.PARAM_LIST, p1, p2);
    generator.add(paramList);
    assertEquals("(a,b)", consumer.getOutput());
  }

  @Test
  public void testAddUnaryOperators() {
    Node name = Node.newString(Token.NAME, "x");
    generator.add(new Node(Token.TYPEOF, name.cloneTree()));
    generator.add(new Node(Token.VOID, name.cloneTree()));
    generator.add(new Node(Token.NOT, name.cloneTree()));
    generator.add(new Node(Token.BITNOT, name.cloneTree()));
    generator.add(new Node(Token.POS, name.cloneTree()));
    assertEquals("typeof xvoid x!x~x+x", consumer.getOutput());
  }

  @Test
  public void testAddNeg() {
    Node negNum = new Node(Token.NEG, Node.newNumber(5));
    generator.add(negNum);
    assertEquals("-5", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node negName = new Node(Token.NEG, Node.newString(Token.NAME, "x"));
    generator.add(negName);
    assertEquals("-x", consumer.getOutput());
  }

  @Test
  public void testAddHook() {
    Node cond = Node.newString(Token.NAME, "c");
    Node trueBranch = Node.newNumber(1);
    Node falseBranch = Node.newNumber(2);
    Node hook = new Node(Token.HOOK, cond, trueBranch, falseBranch);
    generator.add(hook);
    assertEquals("c?1:2", consumer.getOutput());
  }

  @Test
  public void testAddRegexp() {
    Node pattern = Node.newString("abc");
    Node flags = Node.newString("gi");
    Node regex = new Node(Token.REGEXP, pattern, flags);
    generator.add(regex);
    assertEquals("/abc/gi", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node singleChildRegex = new Node(Token.REGEXP, Node.newString("xyz"));
    generator.add(singleChildRegex);
    assertEquals("/xyz/", consumer.getOutput());
  }

  @Test(expected = Error.class)
  public void testAddRegexp_nonStringChildren_throwsError() {
    Node regex = new Node(Token.REGEXP, Node.newNumber(1), Node.newNumber(2));
    generator.add(regex);
  }

  @Test
  public void testAddFunction() {
    Node fnName = Node.newString(Token.NAME, "foo");
    Node params = new Node(Token.PARAM_LIST);
    Node body = new Node(Token.BLOCK);
    Node fn = new Node(Token.FUNCTION, fnName, params, body);
    generator.add(fn, CodeGenerator.Context.STATEMENT);
    assertEquals("function foo(){;}", consumer.getOutput());

    consumer.buffer.setLength(0);
    generator.add(fn, CodeGenerator.Context.START_OF_EXPR);
    assertEquals("(function foo(){;})", consumer.getOutput());
  }

  @Test
  public void testAddGetterAndSetterDef() {
    Node fnName = Node.newString(Token.NAME, "");
    Node getterParams = new Node(Token.PARAM_LIST);
    Node getterBody = new Node(Token.BLOCK);
    Node getterFn = new Node(Token.FUNCTION, fnName, getterParams, getterBody);
    Node getter = Node.newString(Token.GETTER_DEF, "prop");
    getter.addChildToBack(getterFn);

    Node setterParam = Node.newString(Token.NAME, "val");
    Node setterParams = new Node(Token.PARAM_LIST, setterParam);
    Node setterBody = new Node(Token.BLOCK);
    Node setterFn = new Node(Token.FUNCTION, fnName.cloneTree(), setterParams, setterBody);
    Node setter = Node.newString(Token.SETTER_DEF, "prop");
    setter.addChildToBack(setterFn);

    Node objLit = new Node(Token.OBJECTLIT, getter, setter);
    generator.add(objLit);
    assertEquals("{get prop(){;},set prop(val){;}}", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node numGetter = Node.newString(Token.GETTER_DEF, "123");
    numGetter.addChildToBack(getterFn.cloneTree());
    Node nonLatinGetter = Node.newString(Token.GETTER_DEF, "prop\u00A9");
    nonLatinGetter.addChildToBack(getterFn.cloneTree());
    Node objLit2 = new Node(Token.OBJECTLIT, numGetter, nonLatinGetter);
    generator.add(objLit2);
    assertEquals("{get 123(){;},get \"prop\\u00a9\"(){;}}", consumer.getOutput());
  }

  @Test
  public void testAddScriptAndBlock() {
    Node varStmt = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
    Node fnName = Node.newString(Token.NAME, "f");
    Node fn = new Node(Token.FUNCTION, fnName, new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    Node script = new Node(Token.SCRIPT, varStmt, fn);
    generator.add(script);
    assertEquals("var a;function f(){;}", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node blockPreserve = new Node(Token.BLOCK, varStmt.cloneTree());
    generator.add(blockPreserve, CodeGenerator.Context.PRESERVE_BLOCK);
    assertEquals("{var a;}", consumer.getOutput());
  }

  @Test
  public void testAddForLoops() {
    Node varInit = new Node(Token.VAR, Node.newString(Token.NAME, "i"));
    Node cond = new Node(Token.NAME, "i");
    Node incr = new Node(Token.INC, Node.newString(Token.NAME, "i"));
    Node body = new Node(Token.BLOCK);
    Node for4 = new Node(Token.FOR, varInit, cond, incr, body);
    generator.add(for4);
    assertEquals("for(var i;i;++i);", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node exprInit = Node.newNumber(0);
    Node for4Expr = new Node(Token.FOR, exprInit, cond.cloneTree(), incr.cloneTree(), body.cloneTree());
    generator.add(for4Expr);
    assertEquals("for(0;i;++i);", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node forIn = new Node(Token.FOR, Node.newString(Token.NAME, "k"), Node.newString(Token.NAME, "obj"), body.cloneTree());
    generator.add(forIn);
    assertEquals("for(k in obj);", consumer.getOutput());
  }

  @Test
  public void testAddDoWhileAndWhile() {
    Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1)));
    Node cond = Node.newString(Token.NAME, "c");
    Node doNode = new Node(Token.DO, body, cond);
    generator.add(doNode);
    assertEquals("do 1;while(c);", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node whileNode = new Node(Token.WHILE, cond.cloneTree(), body.cloneTree());
    generator.add(whileNode);
    assertEquals("while(c)1;", consumer.getOutput());
  }

  @Test
  public void testAddGetPropAndGetElem() {
    Node obj = Node.newString(Token.NAME, "obj");
    Node prop = Node.newString("prop");
    Node getProp = new Node(Token.GETPROP, obj, prop);
    generator.add(getProp);
    assertEquals("obj.prop", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node numObj = Node.newNumber(123);
    Node numGetProp = new Node(Token.GETPROP, numObj, prop.cloneTree());
    generator.add(numGetProp);
    assertEquals("(123).prop", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node elem = Node.newNumber(0);
    Node getElem = new Node(Token.GETELEM, obj.cloneTree(), elem);
    generator.add(getElem);
    assertEquals("obj[0]", consumer.getOutput());
  }

  @Test
  public void testAddWith() {
    Node obj = Node.newString(Token.NAME, "o");
    Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1)));
    Node withNode = new Node(Token.WITH, obj, body);
    generator.add(withNode);
    assertEquals("with(o)1;", consumer.getOutput());
  }

  @Test
  public void testAddIncDec() {
    Node namePre = Node.newString(Token.NAME, "x");
    Node incPre = new Node(Token.INC, namePre);
    generator.add(incPre);
    assertEquals("++x", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node namePost = Node.newString(Token.NAME, "x");
    Node incPost = new Node(Token.INC, namePost);
    incPost.putIntProp(Node.INCRDECR_PROP, 1);
    generator.add(incPost);
    assertEquals("x++", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node decPost = new Node(Token.DEC, Node.newString(Token.NAME, "y"));
    decPost.putIntProp(Node.INCRDECR_PROP, 1);
    generator.add(decPost);
    assertEquals("y--", consumer.getOutput());
  }

  @Test
  public void testAddCall() {
    Node callee = Node.newString(Token.NAME, "eval");
    Node arg = Node.newString("code");
    Node call = new Node(Token.CALL, callee, arg);
    generator.add(call);
    assertEquals("(0,eval)(\"code\")", consumer.getOutput());

    consumer.buffer.setLength(0);
    callee.putBooleanProp(Node.DIRECT_EVAL, true);
    generator.add(call);
    assertEquals("eval(\"code\")", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node getPropCallee = new Node(Token.GETPROP, Node.newString(Token.NAME, "o"), Node.newString("f"));
    Node freeCall = new Node(Token.CALL, getPropCallee, arg.cloneTree());
    freeCall.putBooleanProp(Node.FREE_CALL, true);
    generator.add(freeCall);
    assertEquals("(0,o.f)(\"code\")", consumer.getOutput());
  }

  @Test
  public void testAddIf() {
    Node cond = Node.newString(Token.NAME, "c");
    Node thenBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1)));
    Node elseBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(2)));
    Node ifNode = new Node(Token.IF, cond, thenBlock, elseBlock);
    generator.add(ifNode);
    assertEquals("if(c)1;else 2;", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node ifWithoutElse = new Node(Token.IF, cond.cloneTree(), thenBlock.cloneTree());
    generator.add(ifWithoutElse);
    assertEquals("if(c)1;", consumer.getOutput());

    consumer.buffer.setLength(0);
    generator.add(ifWithoutElse, CodeGenerator.Context.BEFORE_DANGLING_ELSE);
    assertEquals("{if(c)1;}", consumer.getOutput());
  }

  @Test
  public void testAddLiteralsAndKeywords() {
    generator.add(new Node(Token.NULL));
    generator.add(new Node(Token.THIS));
    generator.add(new Node(Token.FALSE));
    generator.add(new Node(Token.TRUE));
    generator.add(new Node(Token.DEBUGGER));
    generator.add(new Node(Token.EMPTY));
    assertEquals("nullthisfalstruedebugger;", consumer.getOutput());
  }

  @Test
  public void testAddContinueAndBreak() {
    generator.add(new Node(Token.CONTINUE));
    generator.add(new Node(Token.CONTINUE, Node.newString(Token.LABEL_NAME, "loop")));
    generator.add(new Node(Token.BREAK));
    generator.add(new Node(Token.BREAK, Node.newString(Token.LABEL_NAME, "loop")));
    assertEquals("continue;continue loop;break;break loop;", consumer.getOutput());
  }

  @Test(expected = Error.class)
  public void testAddContinue_invalidChild_throwsError() {
    generator.add(new Node(Token.CONTINUE, Node.newString(Token.NAME, "invalid")));
  }

  @Test(expected = Error.class)
  public void testAddBreak_invalidChild_throwsError() {
    generator.add(new Node(Token.BREAK, Node.newString(Token.NAME, "invalid")));
  }

  @Test
  public void testAddNew() {
    Node target = Node.newString(Token.NAME, "Foo");
    Node newTargetNoArgs = new Node(Token.NEW, target);
    generator.add(newTargetNoArgs);
    assertEquals("new Foo", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node targetWithArgs = new Node(Token.NEW, target.cloneTree(), Node.newNumber(1), Node.newNumber(2));
    generator.add(targetWithArgs);
    assertEquals("new Foo(1,2)", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node callChild = new Node(Token.CALL, Node.newString(Token.NAME, "getConstructor"));
    Node newCall = new Node(Token.NEW, callChild, Node.newNumber(1));
    generator.add(newCall);
    assertEquals("new (getConstructor())(1)", consumer.getOutput());
  }

  @Test
  public void testAddStringNode() {
    Node strNode = Node.newString("hello \"world\"");
    generator.add(strNode);
    assertEquals("'hello \"world\"'", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node slashVNode = Node.newString("test\u000B");
    slashVNode.putBooleanProp(Node.SLASH_V, true);
    generator.add(slashVNode);
    assertEquals("\"test\\v\"", consumer.getOutput());
  }

  @Test(expected = IllegalStateException.class)
  public void testAddStringNode_withChildrenOutsideObjectLit_throwsException() {
    Node strWithChild = Node.newString("test");
    strWithChild.addChildToBack(Node.newNumber(1));
    generator.add(strWithChild);
  }

  @Test
  public void testAddDelprop() {
    Node target = new Node(Token.GETPROP, Node.newString(Token.NAME, "o"), Node.newString("p"));
    Node del = new Node(Token.DELPROP, target);
    generator.add(del);
    assertEquals("delete o.p", consumer.getOutput());
  }

  @Test
  public void testAddObjectLit() {
    Node k1 = Node.newString("latinKey");
    k1.addChildToBack(Node.newNumber(1));
    Node k2 = Node.newString("while");
    k2.addChildToBack(Node.newNumber(2));
    Node k3 = Node.newString("42");
    k3.addChildToBack(Node.newNumber(3));
    Node k4 = Node.newString("nonLatin\u00A9");
    k4.addChildToBack(Node.newNumber(4));

    Node objLit = new Node(Token.OBJECTLIT, k1, k2, k3, k4);
    generator.add(objLit, CodeGenerator.Context.START_OF_EXPR);
    assertEquals("({latinKey:1,\"while\":2,42:3,\"nonLatin\\u00a9\":4})", consumer.getOutput());
  }

  @Test
  public void testAddSwitchCaseAndDefault() {
    Node switchCond = Node.newString(Token.NAME, "val");
    Node caseCond = Node.newNumber(1);
    Node caseBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "a")));
    Node caseNode = new Node(Token.CASE, caseCond, caseBody);
    Node defBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "b")));
    Node defaultNode = new Node(Token.DEFAULT_CASE, defBody);

    Node switchNode = new Node(Token.SWITCH, switchCond, caseNode, defaultNode);
    generator.add(switchNode);
    assertEquals("switch(val){case 1:a;default:b;}", consumer.getOutput());
  }

  @Test
  public void testAddNonEmptyStatement_specialWrapping() {
    Node fnName = Node.newString(Token.NAME, "fn");
    Node fn = new Node(Token.FUNCTION, fnName, new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    Node singleFnBlock = new Node(Token.BLOCK, fn);
    Node ifWithFn = new Node(Token.IF, Node.newString(Token.NAME, "c"), singleFnBlock);
    generator.add(ifWithFn);
    assertEquals("if(c){function fn(){;}}", consumer.getOutput());

    consumer.buffer.setLength(0);
    consumer.preserveExtraBlocks = true;
    Node emptyBlock = new Node(Token.BLOCK);
    Node ifWithEmpty = new Node(Token.IF, Node.newString(Token.NAME, "c"), emptyBlock);
    generator.add(ifWithEmpty);
    assertEquals("if(c){}", consumer.getOutput());
  }

  @Test
  public void testAddAllSiblingsAndAddList() {
    Node n1 = Node.newNumber(1);
    Node n2 = Node.newNumber(2);
    n1.setNext(n2);

    generator.addAllSiblings(n1);
    assertEquals("12", consumer.getOutput());

    consumer.buffer.setLength(0);
    generator.addList(n1);
    assertEquals("1,2", consumer.getOutput());

    consumer.buffer.setLength(0);
    generator.addList(n1, false);
    assertEquals("1,2", consumer.getOutput());
  }

  @Test
  public void testForInitInOperatorContext() {
    Node initIn = new Node(Token.IN, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y"));
    Node forLoop = new Node(Token.FOR, initIn, Node.newString(Token.NAME, "cond"), Node.newString(Token.NAME, "inc"), new Node(Token.BLOCK));
    generator.add(forLoop);
    assertEquals("for((x in y);cond;inc);", consumer.getOutput());
  }

  @Test(expected = Error.class)
  public void testAddUnknownNodeType_throwsError() {
    Node unknownNode = new Node(999999);
    generator.add(unknownNode);
  }
}
