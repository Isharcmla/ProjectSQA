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
    final StringBuilder sb = new StringBuilder();
    boolean preserveExtraBlocks = false;
    boolean continueProc = true;

    @Override
    boolean continueProcessing() {
      return continueProc;
    }

    @Override
    void append(String str) {
      sb.append(str);
    }

    @Override
    void add(String str) {
      sb.append(str);
    }

    @Override
    void addOp(String op, boolean binOp) {
      sb.append(op);
    }

    @Override
    void addIdentifier(String identifier) {
      sb.append(identifier);
    }

    @Override
    void addNumber(double x) {
      if (x == (long) x) {
        sb.append((long) x);
      } else {
        sb.append(x);
      }
    }

    @Override
    void endStatement(boolean needSemi) {
      if (needSemi) {
        sb.append(";");
      }
    }

    @Override
    void endStatement() {
      sb.append(";");
    }

    @Override
    void endFunction(boolean isStatement) {
      if (isStatement) {
        sb.append(";");
      }
    }

    @Override
    void beginBlock() {
      sb.append("{");
    }

    @Override
    void endBlock(boolean breakAfter) {
      sb.append("}");
    }

    @Override
    void listSeparator() {
      sb.append(",");
    }

    @Override
    void beginCaseBody() {
      sb.append(":");
    }

    @Override
    void endCaseBody() {}

    @Override
    boolean shouldPreserveExtraBlocks() {
      return preserveExtraBlocks;
    }

    @Override
    boolean breakAfterBlockFor(Node n, boolean isStatement) {
      return false;
    }

    @Override
    void maybeLineBreak() {}

    @Override
    void notePreferredLineBreak() {}

    @Override
    void startSourceMapping(Node n) {}

    @Override
    void endSourceMapping(Node n) {}

    String getOutput() {
      return sb.toString();
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
  public void testConstructor_withDifferentCharsets() {
    CodeGenerator asciiGen = new CodeGenerator(consumer, Charsets.US_ASCII);
    Assert.assertNotNull(asciiGen);

    CodeGenerator utf8Gen = new CodeGenerator(consumer, Charsets.UTF_8);
    Assert.assertNotNull(utf8Gen);

    CodeGenerator nullGen = new CodeGenerator(consumer, null);
    Assert.assertNotNull(nullGen);
  }

  @Test
  public void testTagAsStrict_addsDirective() {
    generator.tagAsStrict();
    Assert.assertEquals("'use strict';", consumer.getOutput());
  }

  @Test
  public void testAddString_appendsDirectly() {
    generator.add("testString");
    Assert.assertEquals("testString", consumer.getOutput());
  }

  @Test
  public void testContinueProcessing_returnsEarlyWhenFalse() {
    consumer.continueProc = false;
    Node n = Node.newString("a");
    generator.add(n);
    Assert.assertEquals("", consumer.getOutput());
  }

  @Test
  public void testBinaryOperators_associativeAndPrecedence() {
    Node a = Node.newString("a");
    Node b = Node.newString("b");
    Node add = new Node(Token.ADD, a, b);
    generator.add(add);
    Assert.assertEquals("a+b", consumer.getOutput());

    consumer.sb.setLength(0);
    Node mul1 = new Node(Token.MUL, Node.newString("x"), Node.newString("y"));
    Node mul2 = new Node(Token.MUL, Node.newString("z"), mul1);
    generator.add(mul2);
    Assert.assertEquals("z*x*y", consumer.getOutput());

    consumer.sb.setLength(0);
    Node assign1 = new Node(Token.ASSIGN, Node.newString("p"), Node.newString("q"));
    Node assign2 = new Node(Token.ASSIGN, Node.newString("o"), assign1);
    generator.add(assign2);
    Assert.assertEquals("o=p=q", consumer.getOutput());

    consumer.sb.setLength(0);
    Node sub1 = new Node(Token.SUB, Node.newString("m"), Node.newString("n"));
    Node sub2 = new Node(Token.SUB, Node.newString("l"), sub1);
    generator.add(sub2);
    Assert.assertEquals("l-(m-n)", consumer.getOutput());
  }

  @Test(expected = IllegalStateException.class)
  public void testBinaryOperator_invalidChildCount_throwsException() {
    Node invalidAdd = new Node(Token.ADD, Node.newString("a"));
    generator.add(invalidAdd);
  }

  @Test
  public void testTryCatchFinally() {
    Node tryBlock = new Node(Token.BLOCK, new Node(Token.EMPTY));
    Node catchBlock = new Node(Token.BLOCK,
        new Node(Token.CATCH, Node.newString("e"), new Node(Token.BLOCK, new Node(Token.EMPTY))));
    Node finallyBlock = new Node(Token.BLOCK, new Node(Token.EMPTY));

    Node tryCatchFinally = new Node(Token.TRY, tryBlock, catchBlock, finallyBlock);
    generator.add(tryCatchFinally);
    Assert.assertEquals("try;catch(e);finally;", consumer.getOutput());

    consumer.sb.setLength(0);
    Node emptyCatchBlock = new Node(Token.BLOCK);
    Node tryFinally = new Node(Token.TRY, tryBlock, emptyCatchBlock, finallyBlock);
    generator.add(tryFinally);
    Assert.assertEquals("try;finally;", consumer.getOutput());
  }

  @Test
  public void testThrowAndReturn() {
    Node throwNode = new Node(Token.THROW, Node.newString("err"));
    generator.add(throwNode);
    Assert.assertEquals("throwerr;", consumer.getOutput());

    consumer.sb.setLength(0);
    Node returnNodeWithChild = new Node(Token.RETURN, Node.newNumber(1));
    generator.add(returnNodeWithChild);
    Assert.assertEquals("return1;", consumer.getOutput());

    consumer.sb.setLength(0);
    Node returnEmpty = new Node(Token.RETURN);
    generator.add(returnEmpty);
    Assert.assertEquals("return;", consumer.getOutput());
  }

  @Test
  public void testVarAndName() {
    Node emptyVar = new Node(Token.VAR);
    generator.add(emptyVar);
    Assert.assertEquals("", consumer.getOutput());

    consumer.sb.setLength(0);
    Node nameA = Node.newString("a");
    Node nameB = Node.newString("b");
    nameB.addChildToFront(Node.newNumber(5));
    Node varNode = new Node(Token.VAR, nameA, nameB);
    generator.add(varNode);
    Assert.assertEquals("var a,b=5", consumer.getOutput());

    consumer.sb.setLength(0);
    Node commaChild = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
    Node nameC = Node.newString("c");
    nameC.addChildToFront(commaChild);
    generator.add(new Node(Token.VAR, nameC));
    Assert.assertEquals("var c=(1,2)", consumer.getOutput());
  }

  @Test
  public void testLabelName() {
    Node labelName = Node.newString(Token.LABEL_NAME, "myLabel");
    generator.add(labelName);
    Assert.assertEquals("myLabel", consumer.getOutput());
  }

  @Test
  public void testArrayLitAndLP() {
    Node arr = new Node(Token.ARRAYLIT, Node.newNumber(1), new Node(Token.EMPTY), Node.newNumber(2));
    generator.add(arr);
    Assert.assertEquals("[1,,2]", consumer.getOutput());

    consumer.sb.setLength(0);
    Node arrWithTrailingEmpty = new Node(Token.ARRAYLIT, Node.newNumber(1), new Node(Token.EMPTY));
    generator.add(arrWithTrailingEmpty);
    Assert.assertEquals("[1,,]", consumer.getOutput());

    consumer.sb.setLength(0);
    Node lp = new Node(Token.LP, Node.newString("a"), Node.newString("b"));
    generator.add(lp);
    Assert.assertEquals("(a,b)", consumer.getOutput());
  }

  @Test
  public void testUnaryOperators() {
    Node notNode = new Node(Token.NOT, Node.newString("a"));
    generator.add(notNode);
    Assert.assertEquals("!a", consumer.getOutput());

    consumer.sb.setLength(0);
    Node negNum = new Node(Token.NEG, Node.newNumber(5));
    generator.add(negNum);
    Assert.assertEquals("-5", consumer.getOutput());

    consumer.sb.setLength(0);
    Node negExpr = new Node(Token.NEG, Node.newString("x"));
    generator.add(negExpr);
    Assert.assertEquals("-x", consumer.getOutput());

    consumer.sb.setLength(0);
    Node typeofNode = new Node(Token.TYPEOF, Node.newString("y"));
    generator.add(typeofNode);
    Assert.assertEquals("typeof y", consumer.getOutput());
  }

  @Test
  public void testHook() {
    Node hook = new Node(Token.HOOK, Node.newString("a"), Node.newString("b"), Node.newString("c"));
    generator.add(hook);
    Assert.assertEquals("a?b:c", consumer.getOutput());
  }

  @Test
  public void testRegexp() {
    Node regexpWithFlags = new Node(Token.REGEXP,
        Node.newString(Token.STRING, "abc"),
        Node.newString(Token.STRING, "g"));
    generator.add(regexpWithFlags);
    Assert.assertEquals("/abc/g", consumer.getOutput());

    consumer.sb.setLength(0);
    Node regexpNoFlags = new Node(Token.REGEXP, Node.newString(Token.STRING, "xyz"));
    generator.add(regexpNoFlags);
    Assert.assertEquals("/xyz/", consumer.getOutput());
  }

  @Test(expected = Error.class)
  public void testRegexp_nonStringChild_throwsError() {
    Node invalidRegexp = new Node(Token.REGEXP, Node.newNumber(1));
    generator.add(invalidRegexp);
  }

  @Test
  public void testGetRefAndRefSpecial() {
    Node getRef = new Node(Token.GET_REF, Node.newString("ref"));
    generator.add(getRef);
    Assert.assertEquals("ref", consumer.getOutput());

    consumer.sb.setLength(0);
    Node refSpecial = new Node(Token.REF_SPECIAL, Node.newString("special"));
    refSpecial.putProp(Node.NAME_PROP, "propName");
    generator.add(refSpecial);
    Assert.assertEquals("special.propName", consumer.getOutput());
  }

  @Test
  public void testFunction() {
    Node fn = new Node(Token.FUNCTION,
        Node.newString("fnName"),
        new Node(Token.LP),
        new Node(Token.BLOCK));
    generator.add(fn, CodeGenerator.Context.START_OF_EXPR);
    Assert.assertEquals("(function fnName(){})", consumer.getOutput());

    consumer.sb.setLength(0);
    generator.add(fn, CodeGenerator.Context.STATEMENT);
    Assert.assertEquals("function fnName(){};", consumer.getOutput());
  }

  @Test
  public void testGetAndSet() {
    Node objLit = new Node(Token.OBJECTLIT);

    Node getFn = new Node(Token.FUNCTION,
        Node.newString(""),
        new Node(Token.LP),
        new Node(Token.BLOCK));
    Node getNode = new Node(Token.GET, getFn);
    getNode.setString("prop");
    objLit.addChildToBack(getNode);

    generator.add(getNode);
    Assert.assertEquals("get prop(){}", consumer.getOutput());

    consumer.sb.setLength(0);
    Node setFn = new Node(Token.FUNCTION,
        Node.newString(""),
        new Node(Token.LP, Node.newString("val")),
        new Node(Token.BLOCK));
    Node setNode = new Node(Token.SET, setFn);
    setNode.setString("123");
    objLit.addChildToBack(setNode);

    generator.add(setNode);
    Assert.assertEquals("set 123(val){}", consumer.getOutput());

    consumer.sb.setLength(0);
    Node setQuoted = new Node(Token.SET, setFn);
    setQuoted.setString("prop-name");
    objLit.addChildToBack(setQuoted);
    generator.add(setQuoted);
    Assert.assertEquals("set \"prop-name\"(val){}", consumer.getOutput());
  }

  @Test
  public void testScriptAndBlock() {
    Node varStmt = new Node(Token.VAR, Node.newString("x"));
    Node fnStmt = new Node(Token.FUNCTION, Node.newString("f"), new Node(Token.LP), new Node(Token.BLOCK));
    Node script = new Node(Token.SCRIPT, varStmt, fnStmt);
    generator.add(script);
    Assert.assertEquals("var x;function f(){};", consumer.getOutput());

    consumer.sb.setLength(0);
    Node block = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString("a")));
    generator.add(block, CodeGenerator.Context.PRESERVE_BLOCK);
    Assert.assertEquals("{a;}", consumer.getOutput());
  }

  @Test
  public void testForLoops() {
    Node for4 = new Node(Token.FOR,
        new Node(Token.VAR, Node.newString("i")),
        Node.newString("cond"),
        Node.newString("step"),
        new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(for4);
    Assert.assertEquals("for(var i;cond;step);", consumer.getOutput());

    consumer.sb.setLength(0);
    Node for4ExprInit = new Node(Token.FOR,
        Node.newString("i"),
        Node.newString("cond"),
        Node.newString("step"),
        new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(for4ExprInit);
    Assert.assertEquals("for(i;cond;step);", consumer.getOutput());

    consumer.sb.setLength(0);
    Node forIn = new Node(Token.FOR,
        Node.newString("k"),
        Node.newString("obj"),
        new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(forIn);
    Assert.assertEquals("for(kin obj);", consumer.getOutput());
  }

  @Test
  public void testDoWhileAndWith() {
    Node doWhile = new Node(Token.DO,
        new Node(Token.BLOCK, new Node(Token.EMPTY)),
        Node.newString("cond"));
    generator.add(doWhile);
    Assert.assertEquals("do;while(cond);", consumer.getOutput());

    consumer.sb.setLength(0);
    Node whileNode = new Node(Token.WHILE,
        Node.newString("cond"),
        new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(whileNode);
    Assert.assertEquals("while(cond);", consumer.getOutput());

    consumer.sb.setLength(0);
    Node withNode = new Node(Token.WITH,
        Node.newString("obj"),
        new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(withNode);
    Assert.assertEquals("with(obj);", consumer.getOutput());
  }

  @Test
  public void testGetPropAndGetElem() {
    Node numProp = new Node(Token.GETPROP, Node.newNumber(1), Node.newString(Token.STRING, "toString"));
    generator.add(numProp);
    Assert.assertEquals("(1).toString", consumer.getOutput());

    consumer.sb.setLength(0);
    Node normalProp = new Node(Token.GETPROP, Node.newString("obj"), Node.newString(Token.STRING, "field"));
    generator.add(normalProp);
    Assert.assertEquals("obj.field", consumer.getOutput());

    consumer.sb.setLength(0);
    Node getElem = new Node(Token.GETELEM, Node.newString("arr"), Node.newNumber(0));
    generator.add(getElem);
    Assert.assertEquals("arr[0]", consumer.getOutput());
  }

  @Test
  public void testIncAndDec() {
    Node preInc = new Node(Token.INC, Node.newString("x"));
    generator.add(preInc);
    Assert.assertEquals("++x", consumer.getOutput());

    consumer.sb.setLength(0);
    Node postInc = new Node(Token.INC, Node.newString("x"));
    postInc.putIntProp(Node.INCRDECR_PROP, 1);
    generator.add(postInc);
    Assert.assertEquals("x++", consumer.getOutput());

    consumer.sb.setLength(0);
    Node preDec = new Node(Token.DEC, Node.newString("x"));
    generator.add(preDec);
    Assert.assertEquals("--x", consumer.getOutput());
  }

  @Test
  public void testCall() {
    Node regularCall = new Node(Token.CALL, Node.newString("fn"), Node.newNumber(1), Node.newNumber(2));
    generator.add(regularCall);
    Assert.assertEquals("fn(1,2)", consumer.getOutput());

    consumer.sb.setLength(0);
    Node indirectEval = new Node(Token.CALL, Node.newString("eval"), Node.newString(Token.STRING, "x"));
    generator.add(indirectEval);
    Assert.assertEquals("(0,eval)(\"x\")", consumer.getOutput());

    consumer.sb.setLength(0);
    Node directEval = new Node(Token.CALL, Node.newString("eval"), Node.newString(Token.STRING, "x"));
    directEval.getFirstChild().putBooleanProp(Node.DIRECT_EVAL, true);
    generator.add(directEval);
    Assert.assertEquals("eval(\"x\")", consumer.getOutput());

    consumer.sb.setLength(0);
    Node freeCall = new Node(Token.CALL,
        new Node(Token.GETPROP, Node.newString("obj"), Node.newString(Token.STRING, "m")));
    freeCall.putBooleanProp(Node.FREE_CALL, true);
    generator.add(freeCall);
    Assert.assertEquals("(0,obj.m)()", consumer.getOutput());
  }

  @Test
  public void testIfElse() {
    Node ifOnly = new Node(Token.IF, Node.newString("cond"), new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(ifOnly);
    Assert.assertEquals("if(cond);", consumer.getOutput());

    consumer.sb.setLength(0);
    Node ifElse = new Node(Token.IF,
        Node.newString("cond"),
        new Node(Token.BLOCK, new Node(Token.EMPTY)),
        new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(ifElse);
    Assert.assertEquals("if(cond);else;", consumer.getOutput());

    consumer.sb.setLength(0);
    generator.add(ifOnly, CodeGenerator.Context.BEFORE_DANGLING_ELSE);
    Assert.assertEquals("{if(cond);}", consumer.getOutput());
  }

  @Test
  public void testConstantsAndLiterals() {
    generator.add(new Node(Token.NULL));
    generator.add(new Node(Token.THIS));
    generator.add(new Node(Token.FALSE));
    generator.add(new Node(Token.TRUE));
    generator.add(new Node(Token.DEBUGGER));
    Assert.assertEquals("nullthisfalstruedebugger;", consumer.getOutput());
  }

  @Test
  public void testContinueAndBreak() {
    generator.add(new Node(Token.CONTINUE));
    Assert.assertEquals("continue;", consumer.getOutput());

    consumer.sb.setLength(0);
    generator.add(new Node(Token.CONTINUE, Node.newString(Token.LABEL_NAME, "loop")));
    Assert.assertEquals("continue loop;", consumer.getOutput());

    consumer.sb.setLength(0);
    generator.add(new Node(Token.BREAK));
    Assert.assertEquals("break;", consumer.getOutput());

    consumer.sb.setLength(0);
    generator.add(new Node(Token.BREAK, Node.newString(Token.LABEL_NAME, "outer")));
    Assert.assertEquals("break outer;", consumer.getOutput());
  }

  @Test(expected = Error.class)
  public void testContinue_invalidChildType_throwsError() {
    generator.add(new Node(Token.CONTINUE, Node.newString(Token.STRING, "invalid")));
  }

  @Test(expected = Error.class)
  public void testBreak_invalidChildType_throwsError() {
    generator.add(new Node(Token.BREAK, Node.newString(Token.STRING, "invalid")));
  }

  @Test(expected = Error.class)
  public void testExprVoid_throwsError() {
    generator.add(new Node(Token.EXPR_VOID));
  }

  @Test
  public void testNew() {
    Node simpleNew = new Node(Token.NEW, Node.newString("MyClass"));
    generator.add(simpleNew);
    Assert.assertEquals("new MyClass", consumer.getOutput());

    consumer.sb.setLength(0);
    Node newWithArgs = new Node(Token.NEW, Node.newString("MyClass"), Node.newNumber(1));
    generator.add(newWithArgs);
    Assert.assertEquals("new MyClass(1)", consumer.getOutput());

    consumer.sb.setLength(0);
    Node targetCall = new Node(Token.CALL, Node.newString("getConstructor"));
    Node newWithCallTarget = new Node(Token.NEW, targetCall, Node.newNumber(2));
    generator.add(newWithCallTarget);
    Assert.assertEquals("new (getConstructor())(2)", consumer.getOutput());
  }

  @Test
  public void testDelProp() {
    Node del = new Node(Token.DELPROP, Node.newString("x"));
    generator.add(del);
    Assert.assertEquals("delete x", consumer.getOutput());
  }

  @Test
  public void testObjectLit() {
    Node objLit = new Node(Token.OBJECTLIT);
    generator.add(objLit, CodeGenerator.Context.START_OF_EXPR);
    Assert.assertEquals("({})", consumer.getOutput());

    consumer.sb.setLength(0);
    Node key1 = Node.newString(Token.STRING, "a");
    key1.addChildToFront(Node.newNumber(1));

    Node key2 = Node.newString(Token.STRING, "default"); // Keyword
    key2.addChildToFront(Node.newNumber(2));

    Node key3 = Node.newString(Token.STRING, "123"); // Simple number
    key3.addChildToFront(Node.newNumber(3));

    Node objLitWithKeys = new Node(Token.OBJECTLIT, key1, key2, key3);
    generator.add(objLitWithKeys);
    Assert.assertEquals("{a:1,\"default\":2,123:3}", consumer.getOutput());
  }

  @Test
  public void testSwitchCaseDefault() {
    Node case1 = new Node(Token.CASE, Node.newNumber(1), new Node(Token.BLOCK, new Node(Token.EMPTY)));
    Node defaultCase = new Node(Token.DEFAULT, new Node(Token.BLOCK, new Node(Token.EMPTY)));
    Node switchNode = new Node(Token.SWITCH, Node.newString("val"), case1, defaultCase);

    generator.add(switchNode);
    Assert.assertEquals("switch(val){case 1:;default:;}", consumer.getOutput());
  }

  @Test
  public void testLabel() {
    Node label = new Node(Token.LABEL,
        Node.newString(Token.LABEL_NAME, "myLbl"),
        new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(label);
    Assert.assertEquals("myLbl:;", consumer.getOutput());
  }

  @Test(expected = Error.class)
  public void testLabel_invalidFirstChild_throwsError() {
    Node invalidLabel = new Node(Token.LABEL,
        Node.newString(Token.STRING, "notLabelName"),
        new Node(Token.BLOCK));
    generator.add(invalidLabel);
  }

  @Test
  public void testSetName_isIgnored() {
    generator.add(new Node(Token.SETNAME));
    Assert.assertEquals("", consumer.getOutput());
  }

  @Test(expected = Error.class)
  public void testAdd_unknownToken_throwsError() {
    generator.add(new Node(Token.LABEL_NAME - 100));
  }

  @Test
  public void testIsSimpleNumberAndGetSimpleNumber() {
    Assert.assertTrue(CodeGenerator.isSimpleNumber("12345"));
    Assert.assertFalse(CodeGenerator.isSimpleNumber(""));
    Assert.assertFalse(CodeGenerator.isSimpleNumber("123a"));
    Assert.assertFalse(CodeGenerator.isSimpleNumber("-123"));

    Assert.assertEquals(12345.0, CodeGenerator.getSimpleNumber("12345"), 0.0);
    Assert.assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("abc")));
    Assert.assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("999999999999999999999999999")));
  }

  @Test
  public void testJsStringAndEscape() {
    CharsetEncoder asciiEncoder = Charsets.US_ASCII.newEncoder();
    CharsetEncoder utf8Encoder = Charsets.UTF_8.newEncoder();

    Assert.assertEquals("\"hello\"", CodeGenerator.jsString("hello", null));
    Assert.assertEquals("'hello \"world\"'", CodeGenerator.jsString("hello \"world\"", null));
    Assert.assertEquals("\"hello 'world'\"", CodeGenerator.jsString("hello 'world'", null));

    String specialChars = "\0\n\r\t\\\"'-->]]>";
    String escaped = CodeGenerator.jsString(specialChars, null);
    Assert.assertTrue(escaped.contains("\\0"));
    Assert.assertTrue(escaped.contains("\\n"));
    Assert.assertTrue(escaped.contains("\\r"));
    Assert.assertTrue(escaped.contains("\\t"));
    Assert.assertTrue(escaped.contains("\\\\"));
    Assert.assertTrue(escaped.contains("--\\>"));
    Assert.assertTrue(escaped.contains("]]\\>"));

    String scriptTag = "</script>";
    Assert.assertTrue(CodeGenerator.jsString(scriptTag, null).contains("<\\/script"));

    String commentTag = "<!--";
    Assert.assertTrue(CodeGenerator.jsString(commentTag, null).contains("<\\!--"));

    String unicodeStr = "\u00e9"; // é
    Assert.assertTrue(CodeGenerator.jsString(unicodeStr, asciiEncoder).contains("\\u00e9"));
    Assert.assertEquals("\"\u00e9\"", CodeGenerator.jsString(unicodeStr, utf8Encoder));
    Assert.assertTrue(CodeGenerator.jsString(unicodeStr, null).contains("\\u00e9"));

    String surrogate = new String(Character.toChars(0x10000));
    Assert.assertTrue(CodeGenerator.jsString(surrogate, asciiEncoder).contains("\\u"));
  }

  @Test
  public void testRegexpEscapeAndDoubleQuotedJsString() {
    Assert.assertEquals("/foo\\/bar/", CodeGenerator.regexpEscape("foo/bar"));
    Assert.assertEquals("/foo\\/bar/", CodeGenerator.regexpEscape("foo/bar", Charsets.UTF_8.newEncoder()));
    Assert.assertEquals("\"\\\"quotes\\\"\"", CodeGenerator.escapeToDoubleQuotedJsString("\"quotes\""));
  }

  @Test
  public void testIdentifierEscape() {
    Assert.assertEquals("validIdent", CodeGenerator.identifierEscape("validIdent"));
    Assert.assertTrue(CodeGenerator.identifierEscape("ident\u00e9").contains("\\u00e9"));
  }

  @Test
  public void testAddNonEmptyStatement_branches() {
    consumer.preserveExtraBlocks = true;
    Node emptyBlock = new Node(Token.BLOCK);
    generator.add(new Node(Token.IF, Node.newString("c"), emptyBlock));
    Assert.assertEquals("if(c){}", consumer.getOutput());

    consumer.sb.setLength(0);
    consumer.preserveExtraBlocks = false;
    Node fnBlock = new Node(Token.BLOCK,
        new Node(Token.FUNCTION, Node.newString("f"), new Node(Token.LP), new Node(Token.BLOCK)));
    generator.add(new Node(Token.IF, Node.newString("c"), fnBlock));
    Assert.assertEquals("if(c){function f(){};}", consumer.getOutput());

    consumer.sb.setLength(0);
    Node doBlock = new Node(Token.BLOCK,
        new Node(Token.DO, new Node(Token.BLOCK, new Node(Token.EMPTY)), Node.newString("d")));
    generator.add(new Node(Token.IF, Node.newString("c"), doBlock));
    Assert.assertEquals("if(c){do;while(d);}", consumer.getOutput());

    consumer.sb.setLength(0);
    Node labelWrappingFn = new Node(Token.BLOCK,
        new Node(Token.LABEL,
            Node.newString(Token.LABEL_NAME, "l"),
            new Node(Token.FUNCTION, Node.newString("f"), new Node(Token.LP), new Node(Token.BLOCK))));
    generator.add(new Node(Token.IF, Node.newString("c"), labelWrappingFn));
    Assert.assertEquals("if(c){l:function f(){};}", consumer.getOutput());
  }

  @Test
  public void testAddExpr_inForInitClause_withInOperator() {
    Node inNode = new Node(Token.IN, Node.newString("a"), Node.newString("b"));
    generator.add(new Node(Token.FOR, inNode, Node.newString("c"), Node.newString("d"),
        new Node(Token.BLOCK, new Node(Token.EMPTY))));
    Assert.assertEquals("for((ain b);c;d);", consumer.getOutput());
  }

  @Test
  public void testAddList_helpers() {
    Node list = new Node(Token.NAME, Node.newString("a"));
    list.addChildToBack(Node.newString("b"));
    generator.addList(list);
    Assert.assertEquals("a,b", consumer.getOutput());
  }
}
