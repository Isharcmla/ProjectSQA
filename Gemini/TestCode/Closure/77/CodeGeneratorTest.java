package com.google.javascript.jscomp;

import com.google.common.base.Charsets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class CodeGeneratorTest {

  private static class TestCodeConsumer extends CodeConsumer {
    final StringBuilder buffer = new StringBuilder();
    boolean continueProcessing = true;
    boolean preserveExtraBlocks = false;

    @Override
    char getLastChar() {
      return buffer.length() > 0 ? buffer.charAt(buffer.length() - 1) : '\0';
    }

    @Override
    void append(String newcode) {
      buffer.append(newcode);
    }

    @Override
    boolean continueProcessing() {
      return continueProcessing;
    }

    @Override
    boolean shouldPreserveExtraBlocks() {
      return preserveExtraBlocks;
    }

    String getCode() {
      return buffer.toString();
    }

    void clear() {
      buffer.setLength(0);
    }
  }

  private TestCodeConsumer consumer;
  private CodeGenerator generator;

  @Before
  public void setUp() {
    consumer = new TestCodeConsumer();
    generator = new CodeGenerator(consumer);
  }

  @Test
  public void testConstructors_variousCharsets() {
    CodeGenerator genNull = new CodeGenerator(consumer, null);
    Assert.assertNotNull(genNull);

    CodeGenerator genAscii = new CodeGenerator(consumer, Charsets.US_ASCII);
    Assert.assertNotNull(genAscii);

    CodeGenerator genUtf8 = new CodeGenerator(consumer, Charsets.UTF_8);
    Assert.assertNotNull(genUtf8);

    CodeGenerator genDefault = new CodeGenerator(consumer);
    Assert.assertNotNull(genDefault);
  }

  @Test
  public void testTagAsStrict_addsStrictDirective() {
    generator.tagAsStrict();
    Assert.assertTrue(consumer.getCode().contains("'use strict';"));
  }

  @Test
  public void testAddString_addsToConsumer() {
    generator.add("var x = 10;");
    Assert.assertEquals("var x = 10;", consumer.getCode());
  }

  @Test
  public void testAdd_continueProcessingFalse_doesNothing() {
    consumer.continueProcessing = false;
    Node node = Node.newNumber(42);
    generator.add(node);
    Assert.assertEquals("", consumer.getCode());
  }

  @Test
  public void testBinaryOperators_associativityAndPrecedence() {
    Node a = Node.newString(Token.NAME, "a");
    Node b = Node.newString(Token.NAME, "b");
    Node add1 = new Node(Token.ADD, a, b);
    generator.add(add1);
    Assert.assertEquals("a+b", consumer.getCode());
    consumer.clear();

    // Associative binary op: a + (b + c)
    Node c = Node.newString(Token.NAME, "c");
    Node addRight = new Node(Token.ADD, Node.newString(Token.NAME, "b"), c);
    Node addTree = new Node(Token.ADD, Node.newString(Token.NAME, "a"), addRight);
    generator.add(addTree);
    Assert.assertEquals("a+b+c", consumer.getCode());
    consumer.clear();

    // Non-associative binary op: a - (b - c)
    Node subRight = new Node(Token.SUB, Node.newString(Token.NAME, "b"), Node.newString(Token.NAME, "c"));
    Node subTree = new Node(Token.SUB, Node.newString(Token.NAME, "a"), subRight);
    generator.add(subTree);
    Assert.assertEquals("a-(b-c)", consumer.getCode());
    consumer.clear();

    // Assignment right-associativity: a = b = c
    Node assignRight = new Node(Token.ASSIGN, Node.newString(Token.NAME, "b"), Node.newString(Token.NAME, "c"));
    Node assignTree = new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"), assignRight);
    generator.add(assignTree);
    Assert.assertEquals("a=b=c", consumer.getCode());
    consumer.clear();

    // In operator in IN_FOR_INIT_CLAUSE context
    Node inNode = new Node(Token.IN, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y"));
    generator.add(inNode, CodeGenerator.Context.IN_FOR_INIT_CLAUSE);
    Assert.assertEquals("(x in y)", consumer.getCode());
  }

  @Test(expected = IllegalStateException.class)
  public void testBinaryOperator_invalidChildCount_throwsException() {
    Node badAdd = new Node(Token.ADD, Node.newString(Token.NAME, "a"));
    generator.add(badAdd);
  }

  @Test
  public void testTryCatchFinally() {
    Node tryBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "a")));
    Node catchVar = Node.newString(Token.NAME, "e");
    Node catchBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "b")));
    Node catchBlock = new Node(Token.CATCH, catchVar, catchBody);
    Node catchWrapper = new Node(Token.BLOCK, catchBlock);
    Node finallyBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "c")));

    Node tryCatchFinally = new Node(Token.TRY, tryBlock, catchWrapper, finallyBlock);
    generator.add(tryCatchFinally);
    Assert.assertTrue(consumer.getCode().contains("try"));
    Assert.assertTrue(consumer.getCode().contains("catch(e)"));
    Assert.assertTrue(consumer.getCode().contains("finally"));
    consumer.clear();

    // Try without catch (only finally)
    Node emptyCatchWrapper = new Node(Token.BLOCK);
    Node tryFinally = new Node(Token.TRY, tryBlock.cloneTree(), emptyCatchWrapper, finallyBlock.cloneTree());
    generator.add(tryFinally);
    Assert.assertTrue(consumer.getCode().contains("try"));
    Assert.assertTrue(consumer.getCode().contains("finally"));
  }

  @Test
  public void testThrowStatement() {
    Node throwNode = new Node(Token.THROW, Node.newString(Token.NAME, "err"));
    generator.add(throwNode);
    Assert.assertEquals("throw err;", consumer.getCode());
  }

  @Test
  public void testReturnStatement() {
    Node retVal = new Node(Token.RETURN, Node.newNumber(1));
    generator.add(retVal);
    Assert.assertEquals("return 1;", consumer.getCode());
    consumer.clear();

    Node retVoid = new Node(Token.RETURN);
    generator.add(retVoid);
    Assert.assertEquals("return;", consumer.getCode());
  }

  @Test
  public void testVarDeclaration() {
    Node name1 = Node.newString(Token.NAME, "x");
    name1.addChildToBack(Node.newNumber(1));
    Node name2 = Node.newString(Token.NAME, "y");
    Node comma = new Node(Token.COMMA, Node.newNumber(2), Node.newNumber(3));
    name2.addChildToBack(comma);
    Node varNode = new Node(Token.VAR, name1, name2);
    generator.add(varNode);
    Assert.assertTrue(consumer.getCode().startsWith("var "));
    Assert.assertTrue(consumer.getCode().contains("x=1"));
  }

  @Test
  public void testLabelAndLabelName() {
    Node labelName = Node.newString(Token.LABEL_NAME, "myLabel");
    Node body = new Node(Token.BLOCK, new Node(Token.EMPTY));
    Node label = new Node(Token.LABEL, labelName, body);
    generator.add(label);
    Assert.assertTrue(consumer.getCode().startsWith("myLabel:"));
  }

  @Test(expected = RuntimeException.class)
  public void testLabel_invalidFirstChild_throwsException() {
    Node notLabelName = Node.newString(Token.NAME, "invalid");
    Node body = new Node(Token.BLOCK);
    Node label = new Node(Token.LABEL, notLabelName, body);
    generator.add(label);
  }

  @Test
  public void testBreakAndContinue() {
    Node cont = new Node(Token.CONTINUE);
    generator.add(cont);
    Assert.assertEquals("continue;", consumer.getCode());
    consumer.clear();

    Node contLbl = new Node(Token.CONTINUE, Node.newString(Token.LABEL_NAME, "lbl"));
    generator.add(contLbl);
    Assert.assertEquals("continue lbl;", consumer.getCode());
    consumer.clear();

    Node brk = new Node(Token.BREAK);
    generator.add(brk);
    Assert.assertEquals("break;", consumer.getCode());
    consumer.clear();

    Node brkLbl = new Node(Token.BREAK, Node.newString(Token.LABEL_NAME, "lbl"));
    generator.add(brkLbl);
    Assert.assertEquals("break lbl;", consumer.getCode());
  }

  @Test(expected = RuntimeException.class)
  public void testBreak_invalidLabel_throwsException() {
    Node brk = new Node(Token.BREAK, Node.newString(Token.NAME, "lbl"));
    generator.add(brk);
  }

  @Test(expected = RuntimeException.class)
  public void testContinue_invalidLabel_throwsException() {
    Node cont = new Node(Token.CONTINUE, Node.newString(Token.NAME, "lbl"));
    generator.add(cont);
  }

  @Test
  public void testArrayLitAndAddArrayList() {
    Node arr = new Node(Token.ARRAYLIT, Node.newNumber(1), new Node(Token.EMPTY), Node.newNumber(2));
    generator.add(arr);
    Assert.assertEquals("[1,,2]", consumer.getCode());
    consumer.clear();

    // Ending with empty slot
    Node arrTrailingEmpty = new Node(Token.ARRAYLIT, Node.newNumber(1), new Node(Token.EMPTY));
    generator.add(arrTrailingEmpty);
    Assert.assertEquals("[1,,]", consumer.getCode());
  }

  @Test
  public void testLpAndComma() {
    Node lp = new Node(Token.LP, Node.newNumber(1), Node.newNumber(2));
    generator.add(lp);
    Assert.assertEquals("(1,2)", consumer.getCode());
    consumer.clear();

    Node comma = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
    generator.add(comma);
    Assert.assertEquals("1,2", consumer.getCode());
  }

  @Test
  public void testUnaryOperators() {
    int[] ops = {Token.TYPEOF, Token.VOID, Token.NOT, Token.BITNOT, Token.POS};
    for (int op : ops) {
      consumer.clear();
      Node u = new Node(op, Node.newString(Token.NAME, "x"));
      generator.add(u);
      Assert.assertFalse(consumer.getCode().isEmpty());
    }

    // NEG with number vs non-number
    consumer.clear();
    Node negNum = new Node(Token.NEG, Node.newNumber(5));
    generator.add(negNum);
    Assert.assertEquals("-5", consumer.getCode());

    consumer.clear();
    Node negVar = new Node(Token.NEG, Node.newString(Token.NAME, "x"));
    generator.add(negVar);
    Assert.assertEquals("-x", consumer.getCode());
  }

  @Test
  public void testHook() {
    Node cond = Node.newString(Token.NAME, "a");
    Node t = Node.newNumber(1);
    Node f = Node.newNumber(2);
    Node hook = new Node(Token.HOOK, cond, t, f);
    generator.add(hook);
    Assert.assertEquals("a?1:2", consumer.getCode());
  }

  @Test
  public void testRegexp() {
    Node re1 = new Node(Token.REGEXP, Node.newString("abc"));
    generator.add(re1);
    Assert.assertEquals("/abc/", consumer.getCode());
    consumer.clear();

    Node re2 = new Node(Token.REGEXP, Node.newString("abc"), Node.newString("g"));
    generator.add(re2);
    Assert.assertEquals("/abc/g", consumer.getCode());
  }

  @Test(expected = RuntimeException.class)
  public void testRegexp_nonStringChild_throwsException() {
    Node reBad = new Node(Token.REGEXP, Node.newNumber(1));
    generator.add(reBad);
  }

  @Test
  public void testGetRefAndRefSpecial() {
    Node target = Node.newString(Token.NAME, "obj");
    Node getRef = new Node(Token.GET_REF, target);
    generator.add(getRef);
    Assert.assertEquals("obj", consumer.getCode());
    consumer.clear();

    Node refSpecial = new Node(Token.REF_SPECIAL, Node.newString(Token.NAME, "special"));
    refSpecial.putProp(Node.NAME_PROP, "prop");
    generator.add(refSpecial);
    Assert.assertEquals("special.prop", consumer.getCode());
  }

  @Test
  public void testFunction() {
    Node fnName = Node.newString(Token.NAME, "foo");
    Node params = new Node(Token.LP, Node.newString(Token.NAME, "a"));
    Node body = new Node(Token.BLOCK);
    Node fn = new Node(Token.FUNCTION, fnName, params, body);

    generator.add(fn, CodeGenerator.Context.STATEMENT);
    Assert.assertTrue(consumer.getCode().contains("function foo(a)"));
    consumer.clear();

    generator.add(fn, CodeGenerator.Context.START_OF_EXPR);
    Assert.assertTrue(consumer.getCode().startsWith("(function foo(a)"));
    Assert.assertTrue(consumer.getCode().endsWith(")"));
  }

  @Test
  public void testGetAndSetPropertyInObjectLit() {
    Node objLit = new Node(Token.OBJECTLIT);

    // Getter
    Node getFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node getProp = Node.newString(Token.GET, "g");
    getProp.addChildToBack(getFn);
    objLit.addChildToBack(getProp);

    // Setter
    Node setFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP, Node.newString(Token.NAME, "v")), new Node(Token.BLOCK));
    Node setProp = Node.newString(Token.SET, "s");
    setProp.addChildToBack(setFn);
    objLit.addChildToBack(setProp);

    // Non-latin Getter to test jsString fallback
    Node getFn2 = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node getPropNonLatin = Node.newString(Token.GET, "a b");
    getPropNonLatin.addChildToBack(getFn2);
    objLit.addChildToBack(getPropNonLatin);

    generator.add(objLit);
    Assert.assertTrue(consumer.getCode().contains("get g()"));
    Assert.assertTrue(consumer.getCode().contains("set s(v)"));
    Assert.assertTrue(consumer.getCode().contains("get \"a b\"()"));
  }

  @Test
  public void testScriptAndBlock() {
    Node script = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
    script.addChildToBack(varNode);
    script.addChildToBack(fn);

    generator.add(script);
    Assert.assertTrue(consumer.getCode().contains("var x;"));
    Assert.assertTrue(consumer.getCode().contains("function f()"));
    consumer.clear();

    Node block = new Node(Token.BLOCK, Node.newNumber(1), Node.newNumber(2));
    generator.add(block, CodeGenerator.Context.PRESERVE_BLOCK);
    Assert.assertTrue(consumer.getCode().contains("1;2;"));
  }

  @Test
  public void testForLoops() {
    // 4-child for loop with VAR init
    Node varInit = new Node(Token.VAR, Node.newString(Token.NAME, "i"));
    Node cond = Node.newString(Token.NAME, "cond");
    Node incr = Node.newString(Token.NAME, "incr");
    Node body = new Node(Token.BLOCK);
    Node for4 = new Node(Token.FOR, varInit, cond, incr, body);
    generator.add(for4);
    Assert.assertTrue(consumer.getCode().contains("for(var i;cond;incr);"));
    consumer.clear();

    // 4-child for loop with expr init
    Node exprInit = Node.newString(Token.NAME, "i");
    Node for4Expr = new Node(Token.FOR, exprInit, cond.cloneTree(), incr.cloneTree(), body.cloneTree());
    generator.add(for4Expr);
    Assert.assertTrue(consumer.getCode().contains("for(i;cond;incr);"));
    consumer.clear();

    // 3-child for-in loop
    Node forIn = new Node(Token.FOR, Node.newString(Token.NAME, "k"), Node.newString(Token.NAME, "obj"), body.cloneTree());
    generator.add(forIn);
    Assert.assertTrue(consumer.getCode().contains("for(k in obj);"));
  }

  @Test
  public void testDoAndWhileLoops() {
    Node doLoop = new Node(Token.DO, new Node(Token.BLOCK), Node.newString(Token.NAME, "cond"));
    generator.add(doLoop);
    Assert.assertTrue(consumer.getCode().contains("do;while(cond);"));
    consumer.clear();

    Node whileLoop = new Node(Token.WHILE, Node.newString(Token.NAME, "cond"), new Node(Token.BLOCK));
    generator.add(whileLoop);
    Assert.assertTrue(consumer.getCode().contains("while(cond);"));
  }

  @Test
  public void testGetPropAndGetElem() {
    Node getProp = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString("prop"));
    generator.add(getProp);
    Assert.assertEquals("obj.prop", consumer.getCode());
    consumer.clear();

    // Number first child needs parens
    Node numProp = new Node(Token.GETPROP, Node.newNumber(5), Node.newString("toString"));
    generator.add(numProp);
    Assert.assertEquals("(5).toString", consumer.getCode());
    consumer.clear();

    Node getElem = new Node(Token.GETELEM, Node.newString(Token.NAME, "arr"), Node.newNumber(0));
    generator.add(getElem);
    Assert.assertEquals("arr[0]", consumer.getCode());
  }

  @Test
  public void testWithStatement() {
    Node withStmt = new Node(Token.WITH, Node.newString(Token.NAME, "scope"), new Node(Token.BLOCK));
    generator.add(withStmt);
    Assert.assertTrue(consumer.getCode().contains("with(scope);"));
  }

  @Test
  public void testIncAndDec() {
    Node preInc = new Node(Token.INC, Node.newString(Token.NAME, "x"));
    generator.add(preInc);
    Assert.assertEquals("++x", consumer.getCode());
    consumer.clear();

    Node postInc = new Node(Token.INC, Node.newString(Token.NAME, "x"));
    postInc.putIntProp(Node.INCRDECR_PROP, 1);
    generator.add(postInc);
    Assert.assertEquals("x++", consumer.getCode());
    consumer.clear();

    Node preDec = new Node(Token.DEC, Node.newString(Token.NAME, "x"));
    generator.add(preDec);
    Assert.assertEquals("--x", consumer.getCode());
    consumer.clear();

    Node postDec = new Node(Token.DEC, Node.newString(Token.NAME, "x"));
    postDec.putIntProp(Node.INCRDECR_PROP, 1);
    generator.add(postDec);
    Assert.assertEquals("x--", consumer.getCode());
  }

  @Test
  public void testCall_evalAndFreeCall() {
    // Indirect eval: NAME 'eval' without DIRECT_EVAL prop
    Node indirectEval = new Node(Token.CALL, Node.newString(Token.NAME, "eval"), Node.newString("1+1"));
    generator.add(indirectEval);
    Assert.assertEquals("(0,eval)(\"1+1\")", consumer.getCode());
    consumer.clear();

    // Direct eval: NAME 'eval' with DIRECT_EVAL prop
    Node directEval = new Node(Token.CALL, Node.newString(Token.NAME, "eval"), Node.newString("1+1"));
    directEval.getFirstChild().putBooleanProp(Node.DIRECT_EVAL, true);
    generator.add(directEval);
    Assert.assertEquals("eval(\"1+1\")", consumer.getCode());
    consumer.clear();

    // Free call on GETPROP
    Node getProp = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString("foo"));
    Node freeCall = new Node(Token.CALL, getProp, Node.newNumber(1));
    freeCall.putBooleanProp(Node.FREE_CALL, true);
    generator.add(freeCall);
    Assert.assertEquals("(0,obj.foo)(1)", consumer.getCode());
    consumer.clear();

    // Normal call
    Node normalCall = new Node(Token.CALL, Node.newString(Token.NAME, "foo"), Node.newNumber(1));
    generator.add(normalCall);
    Assert.assertEquals("foo(1)", consumer.getCode());
  }

  @Test
  public void testIfStatement_withAndWithoutElse() {
    Node ifOnly = new Node(Token.IF, Node.newString(Token.NAME, "cond"), new Node(Token.BLOCK));
    generator.add(ifOnly);
    Assert.assertEquals("if(cond);", consumer.getCode());
    consumer.clear();

    // Dangling else ambiguity
    generator.add(ifOnly, CodeGenerator.Context.BEFORE_DANGLING_ELSE);
    Assert.assertTrue(consumer.getCode().contains("if(cond);"));
    consumer.clear();

    Node ifElse = new Node(Token.IF, Node.newString(Token.NAME, "cond"), new Node(Token.BLOCK), new Node(Token.BLOCK));
    generator.add(ifElse);
    Assert.assertEquals("if(cond);else;", consumer.getCode());
  }

  @Test
  public void testLiterals_nullThisFalseTrueDebugger() {
    int[] literals = {Token.NULL, Token.THIS, Token.FALSE, Token.TRUE};
    for (int t : literals) {
      consumer.clear();
      generator.add(new Node(t));
      Assert.assertFalse(consumer.getCode().isEmpty());
    }

    consumer.clear();
    generator.add(new Node(Token.DEBUGGER));
    Assert.assertEquals("debugger;", consumer.getCode());
  }

  @Test(expected = RuntimeException.class)
  public void testExprVoid_throwsException() {
    generator.add(new Node(Token.EXPR_VOID));
  }

  @Test
  public void testExprResult() {
    Node exprResult = new Node(Token.EXPR_RESULT, Node.newNumber(10));
    generator.add(exprResult);
    Assert.assertEquals("10;", consumer.getCode());
  }

  @Test
  public void testNewExpression() {
    Node newWithoutArgs = new Node(Token.NEW, Node.newString(Token.NAME, "Foo"));
    generator.add(newWithoutArgs);
    Assert.assertEquals("new Foo", consumer.getCode());
    consumer.clear();

    Node newWithArgs = new Node(Token.NEW, Node.newString(Token.NAME, "Foo"), Node.newNumber(1));
    generator.add(newWithArgs);
    Assert.assertEquals("new Foo(1)", consumer.getCode());
    consumer.clear();

    // Target contains CALL
    Node callTarget = new Node(Token.CALL, Node.newString(Token.NAME, "getConstructor"));
    Node newCall = new Node(Token.NEW, callTarget, Node.newNumber(1));
    generator.add(newCall);
    Assert.assertEquals("new (getConstructor())(1)", consumer.getCode());
  }

  @Test
  public void testDelprop() {
    Node del = new Node(Token.DELPROP, Node.newString(Token.NAME, "x"));
    generator.add(del);
    Assert.assertEquals("delete x", consumer.getCode());
  }

  @Test
  public void testObjectLit() {
    Node obj = new Node(Token.OBJECTLIT);
    Node key1 = Node.newString("a");
    key1.addChildToBack(Node.newNumber(1));
    Node key2 = Node.newString("class"); // keyword
    key2.addChildToBack(Node.newNumber(2));
    Node key3 = Node.newString("quoted key");
    key3.setQuotedString();
    key3.addChildToBack(Node.newNumber(3));
    obj.addChildToBack(key1);
    obj.addChildToBack(key2);
    obj.addChildToBack(key3);

    generator.add(obj, CodeGenerator.Context.START_OF_EXPR);
    Assert.assertTrue(consumer.getCode().startsWith("({"));
    Assert.assertTrue(consumer.getCode().endsWith("})"));
    Assert.assertTrue(consumer.getCode().contains("a:1"));
    Assert.assertTrue(consumer.getCode().contains("\"class\":2"));
  }

  @Test
  public void testSwitchCaseDefault() {
    Node switchNode = new Node(Token.SWITCH, Node.newString(Token.NAME, "x"));
    Node case1 = new Node(Token.CASE, Node.newNumber(1), new Node(Token.BLOCK));
    Node def = new Node(Token.DEFAULT, new Node(Token.BLOCK));
    switchNode.addChildToBack(case1);
    switchNode.addChildToBack(def);

    generator.add(switchNode);
    Assert.assertTrue(consumer.getCode().contains("switch(x){"));
    Assert.assertTrue(consumer.getCode().contains("case 1:;"));
    Assert.assertTrue(consumer.getCode().contains("default:;"));
  }

  @Test
  public void testSetnameIgnored() {
    generator.add(new Node(Token.SETNAME));
    Assert.assertEquals("", consumer.getCode());
  }

  @Test(expected = RuntimeException.class)
  public void testUnknownType_throwsException() {
    generator.add(new Node(999999));
  }

  @Test
  public void testAddNonEmptyStatement_browserBugsAndPreserveBlocks() {
    // Preserve extra blocks setting
    consumer.preserveExtraBlocks = true;
    Node emptyBlock = new Node(Token.BLOCK);
    Node ifStmt = new Node(Token.IF, Node.newString(Token.NAME, "c"), emptyBlock);
    generator.add(ifStmt);
    Assert.assertTrue(consumer.getCode().contains("{}"));
    consumer.clear();

    // 1-child block with Function or Do
    consumer.preserveExtraBlocks = false;
    Node fnChild = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
    Node blockWithFn = new Node(Token.BLOCK, fnChild);
    Node ifWithFn = new Node(Token.IF, Node.newString(Token.NAME, "c"), blockWithFn);
    generator.add(ifWithFn);
    Assert.assertTrue(consumer.getCode().contains("{function f()}"));
    consumer.clear();

    // 1-child block with Labeled Do
    Node doStmt = new Node(Token.DO, new Node(Token.BLOCK), Node.newString(Token.NAME, "c2"));
    Node labeledDo = new Node(Token.LABEL, Node.newString(Token.LABEL_NAME, "l1"), doStmt);
    Node blockWithLabeledDo = new Node(Token.BLOCK, labeledDo);
    Node ifWithLabeledDo = new Node(Token.IF, Node.newString(Token.NAME, "c"), blockWithLabeledDo);
    generator.add(ifWithLabeledDo);
    Assert.assertTrue(consumer.getCode().contains("{l1:do;while(c2);}"));
    consumer.clear();

    // 1-child block with Labeled non-block
    Node exprStmt = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    Node labeledExpr = new Node(Token.LABEL, Node.newString(Token.LABEL_NAME, "l2"), exprStmt);
    Node blockWithLabeledExpr = new Node(Token.BLOCK, labeledExpr);
    Node ifWithLabeledExpr = new Node(Token.IF, Node.newString(Token.NAME, "c"), blockWithLabeledExpr);
    generator.add(ifWithLabeledExpr);
    Assert.assertTrue(consumer.getCode().contains("l2:1;"));
  }

  @Test
  public void testAddListMethods() {
    Node n1 = Node.newNumber(1);
    Node n2 = Node.newNumber(2);
    n1.setNext(n2);

    generator.addList(n1);
    Assert.assertEquals("1,2", consumer.getCode());
    consumer.clear();

    generator.addList(n1, false);
    Assert.assertEquals("1,2", consumer.getCode());
  }

  @Test
  public void testAddAllSiblings() {
    Node s1 = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    Node s2 = new Node(Token.EXPR_RESULT, Node.newNumber(2));
    s1.setNext(s2);
    generator.addAllSiblings(s1);
    Assert.assertEquals("1;2;", consumer.getCode());
  }

  @Test
  public void testJsStringEscaping() {
    CharsetEncoder asciiEncoder = Charsets.US_ASCII.newEncoder();
    CharsetEncoder utf8Encoder = Charsets.UTF_8.newEncoder();

    // More double quotes than single quotes -> wraps in single quotes
    String s1 = CodeGenerator.jsString("Hello \"World\" \"Test\"", null);
    Assert.assertTrue(s1.startsWith("'"));
    Assert.assertTrue(s1.endsWith("'"));

    // More single quotes than double quotes -> wraps in double quotes
    String s2 = CodeGenerator.jsString("Hello 'World' 'Test'", null);
    Assert.assertTrue(s2.startsWith("\""));
    Assert.assertTrue(s2.endsWith("\""));

    // Escape sequences: \n, \r, \t, \\
    String s3 = CodeGenerator.jsString("line1\nline2\rline3\ttab\\slash", null);
    Assert.assertTrue(s3.contains("\\n"));
    Assert.assertTrue(s3.contains("\\r"));
    Assert.assertTrue(s3.contains("\\t"));
    Assert.assertTrue(s3.contains("\\\\"));

    // HTML escapes: -->, ]]>, </script, <!--
    String sHtml = CodeGenerator.jsString("--> ]]> </script <!--", null);
    Assert.assertTrue(sHtml.contains("--\\>"));
    Assert.assertTrue(sHtml.contains("]]\\>"));
    Assert.assertTrue(sHtml.contains("<\\/script"));
    Assert.assertTrue(sHtml.contains("<\\!--"));

    // Unicode / non-ASCII characters with and without encoder
    String nonAscii = "Hello \u00e9 \u4e16\u754c";
    String escapedAscii = CodeGenerator.jsString(nonAscii, asciiEncoder);
    Assert.assertTrue(escapedAscii.contains("\\u00e9"));

    String unescapedUtf8 = CodeGenerator.jsString(nonAscii, utf8Encoder);
    Assert.assertTrue(unescapedUtf8.contains("\u4e16\u754c"));

    // Supplementary code points (surrogates, e.g. emoji U+1F600)
    String emoji = new String(Character.toChars(0x1F600));
    String escapedEmoji = CodeGenerator.jsString(emoji, asciiEncoder);
    Assert.assertTrue(escapedEmoji.contains("\\u"));

    // escapeToDoubleQuotedJsString
    String doubleQuoted = CodeGenerator.escapeToDoubleQuotedJsString("a\"b'c");
    Assert.assertTrue(doubleQuoted.startsWith("\""));
    Assert.assertTrue(doubleQuoted.endsWith("\""));
    Assert.assertTrue(doubleQuoted.contains("\\\""));
  }

  @Test
  public void testRegexpEscape() {
    String re = CodeGenerator.regexpEscape("a/b/c");
    Assert.assertEquals("/a/b/c/", re);

    CharsetEncoder asciiEncoder = Charsets.US_ASCII.newEncoder();
    String reAscii = CodeGenerator.regexpEscape("a/b/\u00e9", asciiEncoder);
    Assert.assertTrue(reAscii.contains("\\u00e9"));
  }

  @Test
  public void testIdentifierEscape() {
    String latin = "myVariable_1$";
    Assert.assertEquals(latin, CodeGenerator.identifierEscape(latin));

    String nonLatin = "var_\u00e9";
    String escaped = CodeGenerator.identifierEscape(nonLatin);
    Assert.assertEquals("var_\\u00e9", escaped);
  }
}
