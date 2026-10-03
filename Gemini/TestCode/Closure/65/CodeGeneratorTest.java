package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.common.base.Charsets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.junit.Before;
import org.junit.Test;

public class CodeGeneratorTest {

  private static class TestCodeConsumer extends CodeConsumer {
    final StringBuilder buffer = new StringBuilder();
    boolean continueProcessing = true;
    boolean preserveExtraBlocks = false;

    @Override
    char getLastChar() {
      return buffer.length() == 0 ? '\0' : buffer.charAt(buffer.length() - 1);
    }

    @Override
    void append(String str) {
      buffer.append(str);
    }

    @Override
    boolean continueProcessing() {
      return continueProcessing;
    }

    @Override
    boolean shouldPreserveExtraBlocks() {
      return preserveExtraBlocks;
    }

    @Override
    boolean breakAfterBlockFor(Node n, boolean isStatement) {
      return false;
    }

    @Override
    void endStatement(boolean force) {
      buffer.append(";");
    }

    @Override
    void endStatement() {
      endStatement(false);
    }

    @Override
    void maybeLineBreak() {
      buffer.append("\n");
    }

    @Override
    void notePreferredLineBreak() {
      buffer.append("\n");
    }

    @Override
    void listSeparator() {
      buffer.append(",");
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
    void beginCaseBody() {
      buffer.append(":");
    }

    @Override
    void endCaseBody() {
      buffer.append(";");
    }

    @Override
    void endFunction(boolean isStatement) {
      if (isStatement) {
        buffer.append(";");
      }
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
  public void testConstructors_nullCharsetAndNonNullCharset() {
    CodeGenerator genNull = new CodeGenerator(consumer, null);
    assertNotNull(genNull);

    CodeGenerator genAscii = new CodeGenerator(consumer, Charsets.US_ASCII);
    assertNotNull(genAscii);

    CodeGenerator genUtf8 = new CodeGenerator(consumer, Charsets.UTF_8);
    assertNotNull(genUtf8);

    CodeGenerator genDefault = new CodeGenerator(consumer);
    assertNotNull(genDefault);
  }

  @Test
  public void testTagAsStrict_appendsStrictDirective() {
    generator.tagAsStrict();
    assertEquals("'use strict';", consumer.buffer.toString());
  }

  @Test
  public void testAddString_appendsDirectly() {
    generator.add("testString");
    assertEquals("testString", consumer.buffer.toString());
  }

  @Test
  public void testAddNode_whenContinueProcessingIsFalse_doesNotAppend() {
    consumer.continueProcessing = false;
    Node n = Node.newString(Token.NAME, "varName");
    generator.add(n);
    assertEquals("", consumer.buffer.toString());
  }

  @Test
  public void testIsSimpleNumber_variousInputs() {
    assertTrue(CodeGenerator.isSimpleNumber("123"));
    assertTrue(CodeGenerator.isSimpleNumber("0"));
    assertFalse(CodeGenerator.isSimpleNumber(""));
    assertFalse(CodeGenerator.isSimpleNumber("12a3"));
    assertFalse(CodeGenerator.isSimpleNumber("-5"));
    assertFalse(CodeGenerator.isSimpleNumber("12.3"));
  }

  @Test
  public void testGetSimpleNumber_variousInputs() {
    assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.0);
    assertEquals(0.0, CodeGenerator.getSimpleNumber("0"), 0.0);
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("")));
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("abc")));
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("999999999999999999999999999999")));
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("9007199254740993")));
  }

  @Test
  public void testIdentifierEscape_latinAndNonLatin() {
    assertEquals("validName123", CodeGenerator.identifierEscape("validName123"));
    String escaped = CodeGenerator.identifierEscape("var\u00A9Name");
    assertTrue(escaped.contains("\\u00a9"));
  }

  @Test
  public void testJsString_andAddJsString_quotingAndEscaping() {
    String doublePreferred = generator.jsString("Hello 'World'");
    assertTrue(doublePreferred.startsWith("\""));
    assertTrue(doublePreferred.endsWith("\""));

    String singlePreferred = generator.jsString("Hello \"World\"");
    assertTrue(singlePreferred.startsWith("'"));
    assertTrue(singlePreferred.endsWith("'"));

    generator.addJsString("test_cached");
    generator.addJsString("test_cached"); // from cache
    assertTrue(consumer.buffer.toString().contains("test_cached"));
  }

  @Test
  public void testStrEscape_specialCharsAndPatterns() {
    String escaped = CodeGenerator.strEscape("a\0b\nc\rd\te\\f\"g'h", '"', "\\\"", "\'", "\\\\", null);
    assertTrue(escaped.contains("\\0"));
    assertTrue(escaped.contains("\\n"));
    assertTrue(escaped.contains("\\r"));
    assertTrue(escaped.contains("\\t"));
    assertTrue(escaped.contains("\\\\"));

    String scriptTag = CodeGenerator.escapeToDoubleQuotedJsString("</script>");
    assertTrue(scriptTag.contains("<\\/script"));

    String commentStart = CodeGenerator.escapeToDoubleQuotedJsString("<!-- comment");
    assertTrue(commentStart.contains("<\\!--"));

    String commentEnd = CodeGenerator.escapeToDoubleQuotedJsString("-->");
    assertTrue(commentEnd.contains("--\\>"));

    String cdataEnd = CodeGenerator.escapeToDoubleQuotedJsString("]]>");
    assertTrue(cdataEnd.contains("]]\\>"));

    String normalGreater = CodeGenerator.escapeToDoubleQuotedJsString("a>b");
    assertTrue(normalGreater.contains("a>b"));

    String normalLess = CodeGenerator.escapeToDoubleQuotedJsString("<tag>");
    assertTrue(normalLess.contains("<tag>"));
  }

  @Test
  public void testStrEscape_withCharsetEncoder() {
    CharsetEncoder asciiEncoder = Charsets.US_ASCII.newEncoder();
    String escaped = CodeGenerator.strEscape("Hello \u00E9", '"', "\\\"", "\'", "\\\\", asciiEncoder);
    assertTrue(escaped.contains("\\u00e9"));

    CharsetEncoder utf8Encoder = Charsets.UTF_8.newEncoder();
    String utf8Escaped = CodeGenerator.strEscape("Hello \u00E9", '"', "\\\"", "\'", "\\\\", utf8Encoder);
    assertTrue(utf8Escaped.contains("\u00E9"));

    String supplementary = new String(Character.toChars(0x1F600));
    String suppEscaped = CodeGenerator.strEscape(supplementary, '"', "\\\"", "\'", "\\\\", asciiEncoder);
    assertTrue(suppEscaped.contains("\\ud83d\\ude00"));
  }

  @Test
  public void testRegexpEscape() {
    String re1 = CodeGenerator.regexpEscape("abc/def");
    assertEquals("/abc/def/", re1);

    String re2 = CodeGenerator.regexpEscape("abc", Charsets.US_ASCII.newEncoder());
    assertEquals("/abc/", re2);
  }

  @Test
  public void testBinaryOperators_associativeAndAssignment() {
    Node a = Node.newString(Token.NAME, "a");
    Node b = Node.newString(Token.NAME, "b");
    Node add = new Node(Token.ADD, a, b);
    generator.add(add);
    assertEquals("a+b", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node c = Node.newString(Token.NAME, "c");
    Node innerAdd = new Node(Token.ADD, b, c);
    Node outerAdd = new Node(Token.ADD, a, innerAdd);
    generator.add(outerAdd);
    assertEquals("a+b+c", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node assign1 = new Node(Token.ASSIGN, a, b);
    Node assign2 = new Node(Token.ASSIGN, b, c);
    Node outerAssign = new Node(Token.ASSIGN, a, assign2);
    generator.add(outerAssign);
    assertEquals("a=b=c", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node sub = new Node(Token.SUB, a, new Node(Token.SUB, b, c));
    generator.add(sub);
    assertEquals("a-(b-c)", consumer.buffer.toString());
  }

  @Test(expected = IllegalStateException.class)
  public void testBinaryOperator_invalidChildCount_throwsException() {
    Node a = Node.newString(Token.NAME, "a");
    Node add = new Node(Token.ADD, a);
    generator.add(add);
  }

  @Test
  public void testTryCatchFinally() {
    Node tryBlock = new Node(Token.BLOCK);
    Node catchVar = Node.newString(Token.NAME, "e");
    Node catchBody = new Node(Token.BLOCK);
    Node catchNode = new Node(Token.CATCH, catchVar, catchBody);
    Node catchBlock = new Node(Token.BLOCK, catchNode);
    Node finallyBlock = new Node(Token.BLOCK);

    Node tryCatch = new Node(Token.TRY, tryBlock, catchBlock);
    generator.add(tryCatch);
    assertEquals("try{}catch(e){}", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node tryCatchFinally = new Node(Token.TRY, tryBlock, catchBlock, finallyBlock);
    generator.add(tryCatchFinally);
    assertEquals("try{}catch(e){}finally{}", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node emptyCatchBlock = new Node(Token.BLOCK);
    Node tryFinally = new Node(Token.TRY, tryBlock, emptyCatchBlock, finallyBlock);
    generator.add(tryFinally);
    assertEquals("try{}finally{}", consumer.buffer.toString());
  }

  @Test
  public void testThrowAndReturn() {
    Node throwNode = new Node(Token.THROW, Node.newString(Token.NAME, "e"));
    generator.add(throwNode);
    assertEquals("throw e;", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node retNodeVal = new Node(Token.RETURN, Node.newNumber(1));
    generator.add(retNodeVal);
    assertEquals("return 1;", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node retNodeEmpty = new Node(Token.RETURN);
    generator.add(retNodeEmpty);
    assertEquals("return;", consumer.buffer.toString());
  }

  @Test
  public void testVarAndNameNodes() {
    Node varNode = new Node(Token.VAR);
    Node name1 = Node.newString(Token.NAME, "x");
    Node name2 = Node.newString(Token.NAME, "y");
    name2.addChildToBack(Node.newNumber(2));
    varNode.addChildToBack(name1);
    varNode.addChildToBack(name2);

    generator.add(varNode);
    assertEquals("var x,y=2", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node nameComma = Node.newString(Token.NAME, "z");
    Node comma = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
    nameComma.addChildToBack(comma);
    generator.add(nameComma);
    assertEquals("z=(1,2)", consumer.buffer.toString());
  }

  @Test
  public void testLabelAndLabelName() {
    Node labelName = Node.newString(Token.LABEL_NAME, "myLabel");
    generator.add(labelName);
    assertEquals("myLabel", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node body = new Node(Token.BLOCK);
    Node labelNode = new Node(Token.LABEL, Node.newString(Token.LABEL_NAME, "lbl"), body);
    generator.add(labelNode);
    assertEquals("lbl:;", consumer.buffer.toString());
  }

  @Test(expected = Error.class)
  public void testLabel_invalidChild_throwsError() {
    Node badLabel = new Node(Token.LABEL, Node.newString(Token.NAME, "lbl"), new Node(Token.BLOCK));
    generator.add(badLabel);
  }

  @Test
  public void testArrayLitAndLpAndComma() {
    Node arr = new Node(Token.ARRAYLIT);
    arr.addChildToBack(Node.newNumber(1));
    arr.addChildToBack(new Node(Token.EMPTY));
    generator.add(arr);
    assertEquals("[1,,]", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node lp = new Node(Token.LP, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    generator.add(lp);
    assertEquals("(a,b)", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node comma = new Node(Token.COMMA, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    generator.add(comma);
    assertEquals("a,b", consumer.buffer.toString());
  }

  @Test
  public void testNumberAndUnaryOperators() {
    generator.add(Node.newNumber(42.5));
    assertEquals("42.5", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    generator.add(new Node(Token.NOT, Node.newString(Token.NAME, "a")));
    assertEquals("!a", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    generator.add(new Node(Token.VOID, Node.newNumber(0)));
    assertEquals("void 0", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    generator.add(new Node(Token.NEG, Node.newNumber(5)));
    assertEquals("-5", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    generator.add(new Node(Token.NEG, Node.newString(Token.NAME, "x")));
    assertEquals("-x", consumer.buffer.toString());
  }

  @Test
  public void testHookOperator() {
    Node cond = Node.newString(Token.NAME, "c");
    Node left = Node.newString(Token.NAME, "a");
    Node right = Node.newString(Token.NAME, "b");
    Node hook = new Node(Token.HOOK, cond, left, right);
    generator.add(hook);
    assertEquals("c?a:b", consumer.buffer.toString());
  }

  @Test
  public void testRegexpNode() {
    Node re = new Node(Token.REGEXP, Node.newString(Token.STRING, "abc"), Node.newString(Token.STRING, "g"));
    generator.add(re);
    assertEquals("/abc/g", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node reSingle = new Node(Token.REGEXP, Node.newString(Token.STRING, "xyz"));
    generator.add(reSingle);
    assertEquals("/xyz/", consumer.buffer.toString());
  }

  @Test(expected = Error.class)
  public void testRegexpNode_nonStringChild_throwsError() {
    Node re = new Node(Token.REGEXP, Node.newNumber(1));
    generator.add(re);
  }

  @Test
  public void testGetRefAndRefSpecial() {
    Node ref = new Node(Token.GET_REF, Node.newString(Token.NAME, "x"));
    generator.add(ref);
    assertEquals("x", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node refSpecial = new Node(Token.REF_SPECIAL, Node.newString(Token.NAME, "x"));
    refSpecial.putProp(Node.NAME_PROP, "specialProp");
    generator.add(refSpecial);
    assertEquals("x.specialProp", consumer.buffer.toString());
  }

  @Test
  public void testFunction_variousContexts() {
    Node fn = new Node(Token.FUNCTION,
        Node.newString(Token.NAME, "foo"),
        new Node(Token.LP, Node.newString(Token.NAME, "p")),
        new Node(Token.BLOCK));

    generator.add(fn, CodeGenerator.Context.STATEMENT);
    assertEquals("function foo(p){};", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    generator.add(fn, CodeGenerator.Context.START_OF_EXPR);
    assertEquals("(function foo(p){})", consumer.buffer.toString());
  }

  @Test
  public void testObjectLit_withGetSetAndProperties() {
    Node objLit = new Node(Token.OBJECTLIT);

    Node strProp = Node.newString(Token.STRING, "a");
    strProp.addChildToBack(Node.newNumber(1));
    objLit.addChildToBack(strProp);

    Node numProp = Node.newString(Token.STRING, "123");
    numProp.addChildToBack(Node.newNumber(2));
    objLit.addChildToBack(numProp);

    Node quotedProp = Node.newString(Token.STRING, "default");
    quotedProp.addChildToBack(Node.newNumber(3));
    objLit.addChildToBack(quotedProp);

    Node getFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node getNode = Node.newString(Token.GET, "g");
    getNode.addChildToBack(getFn);
    objLit.addChildToBack(getNode);

    Node setFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP, Node.newString(Token.NAME, "val")), new Node(Token.BLOCK));
    Node setNode = Node.newString(Token.SET, "s");
    setNode.addChildToBack(setFn);
    objLit.addChildToBack(setNode);

    generator.add(objLit, CodeGenerator.Context.START_OF_EXPR);
    String res = consumer.buffer.toString();
    assertTrue(res.startsWith("({"));
    assertTrue(res.endsWith("})"));
    assertTrue(res.contains("a:1"));
    assertTrue(res.contains("123:2"));
    assertTrue(res.contains("\"default\":3"));
    assertTrue(res.contains("get g(){"));
    assertTrue(res.contains("set s(val){"));
  }

  @Test
  public void testGetAndSet_withNumericAndNonLatinNames() {
    Node objLit = new Node(Token.OBJECTLIT);

    Node getFnNum = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node getNum = Node.newString(Token.GET, "456");
    getNum.addChildToBack(getFnNum);
    objLit.addChildToBack(getNum);

    Node getFnNonLatin = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node getNonLatin = Node.newString(Token.GET, "\u00A9");
    getNonLatin.addChildToBack(getFnNonLatin);
    objLit.addChildToBack(getNonLatin);

    generator.add(objLit);
    String res = consumer.buffer.toString();
    assertTrue(res.contains("get 456(){"));
    assertTrue(res.contains("get \"\\u00a9\"(){"));
  }

  @Test
  public void testScriptAndBlock() {
    Node script = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    Node fnNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
    script.addChildToBack(varNode);
    script.addChildToBack(fnNode);

    generator.add(script);
    assertTrue(consumer.buffer.toString().contains("var x;"));
    assertTrue(consumer.buffer.toString().contains("function f()"));

    consumer.buffer.setLength(0);
    Node blockPreserve = new Node(Token.BLOCK);
    generator.add(blockPreserve, CodeGenerator.Context.PRESERVE_BLOCK);
    assertEquals("{}", consumer.buffer.toString());
  }

  @Test
  public void testForLoops() {
    Node initVar = new Node(Token.VAR, Node.newString(Token.NAME, "i"));
    Node cond = Node.newString(Token.NAME, "cond");
    Node incr = Node.newString(Token.NAME, "incr");
    Node body = new Node(Token.BLOCK);
    Node for4 = new Node(Token.FOR, initVar, cond, incr, body);
    generator.add(for4);
    assertEquals("for(var i;cond;incr);", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node initExpr = Node.newString(Token.NAME, "i");
    Node for4Expr = new Node(Token.FOR, initExpr, cond, incr, body);
    generator.add(for4Expr);
    assertEquals("for(i;cond;incr);", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node forIn = new Node(Token.FOR, Node.newString(Token.NAME, "k"), Node.newString(Token.NAME, "obj"), body);
    generator.add(forIn);
    assertEquals("for(k in obj);", consumer.buffer.toString());
  }

  @Test
  public void testDoAndWhile() {
    Node body = new Node(Token.BLOCK);
    Node cond = Node.newString(Token.NAME, "c");

    Node doNode = new Node(Token.DO, body, cond);
    generator.add(doNode);
    assertEquals("do;while(c);", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node whileNode = new Node(Token.WHILE, cond, body);
    generator.add(whileNode);
    assertEquals("while(c);", consumer.buffer.toString());
  }

  @Test
  public void testEmptyNode() {
    generator.add(new Node(Token.EMPTY));
    assertEquals("", consumer.buffer.toString());
  }

  @Test
  public void testGetPropAndGetElem() {
    Node num = Node.newNumber(1);
    Node propStr = Node.newString(Token.STRING, "toString");
    Node getPropNum = new Node(Token.GETPROP, num, propStr);
    generator.add(getPropNum);
    assertEquals("(1).toString", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node obj = Node.newString(Token.NAME, "obj");
    Node getPropObj = new Node(Token.GETPROP, obj, propStr);
    generator.add(getPropObj);
    assertEquals("obj.toString", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node getElem = new Node(Token.GETELEM, obj, Node.newString(Token.STRING, "k"));
    generator.add(getElem);
    assertEquals("obj[\"k\"]", consumer.buffer.toString());
  }

  @Test
  public void testWithStatement() {
    Node withNode = new Node(Token.WITH, Node.newString(Token.NAME, "o"), new Node(Token.BLOCK));
    generator.add(withNode);
    assertEquals("with(o);", consumer.buffer.toString());
  }

  @Test
  public void testIncAndDec() {
    Node preInc = new Node(Token.INC, Node.newString(Token.NAME, "x"));
    generator.add(preInc);
    assertEquals("++x", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node postInc = new Node(Token.INC, Node.newString(Token.NAME, "x"));
    postInc.putIntProp(Node.INCRDECR_PROP, 1);
    generator.add(postInc);
    assertEquals("x++", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node preDec = new Node(Token.DEC, Node.newString(Token.NAME, "x"));
    generator.add(preDec);
    assertEquals("--x", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node postDec = new Node(Token.DEC, Node.newString(Token.NAME, "x"));
    postDec.putIntProp(Node.INCRDECR_PROP, 1);
    generator.add(postDec);
    assertEquals("x--", consumer.buffer.toString());
  }

  @Test
  public void testCall_evalAndFreeCall() {
    Node evalCall = new Node(Token.CALL, Node.newString(Token.NAME, "eval"), Node.newString(Token.STRING, "1"));
    generator.add(evalCall);
    assertEquals("(0,eval)(\"1\")", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node directEvalCall = new Node(Token.CALL, Node.newString(Token.NAME, "eval"), Node.newString(Token.STRING, "1"));
    directEvalCall.getFirstChild().putBooleanProp(Node.DIRECT_EVAL, true);
    generator.add(directEvalCall);
    assertEquals("eval(\"1\")", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node freeCall = new Node(Token.CALL,
        new Node(Token.GETPROP, Node.newString(Token.NAME, "o"), Node.newString(Token.STRING, "m")),
        Node.newNumber(1));
    freeCall.putBooleanProp(Node.FREE_CALL, true);
    generator.add(freeCall);
    assertEquals("(0,o.m)(1)", consumer.buffer.toString());
  }

  @Test
  public void testIfElse_andDanglingElse() {
    Node ifSimple = new Node(Token.IF, Node.newString(Token.NAME, "c"), new Node(Token.BLOCK));
    generator.add(ifSimple);
    assertEquals("if(c);", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node ifElse = new Node(Token.IF, Node.newString(Token.NAME, "c"), new Node(Token.BLOCK), new Node(Token.BLOCK));
    generator.add(ifElse);
    assertEquals("if(c);else;", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    generator.add(ifSimple, CodeGenerator.Context.BEFORE_DANGLING_ELSE);
    assertEquals("{if(c);}", consumer.buffer.toString());
  }

  @Test
  public void testKeywordsAndConstants() {
    generator.add(new Node(Token.NULL));
    generator.add(new Node(Token.THIS));
    generator.add(new Node(Token.FALSE));
    generator.add(new Node(Token.TRUE));
    assertEquals("nullthisfalsetrue", consumer.buffer.toString());
  }

  @Test
  public void testContinueBreakDebugger() {
    generator.add(new Node(Token.DEBUGGER));
    assertEquals("debugger;", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    generator.add(new Node(Token.CONTINUE));
    assertEquals("continue;", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    generator.add(new Node(Token.CONTINUE, Node.newString(Token.LABEL_NAME, "l1")));
    assertEquals("continue l1;", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    generator.add(new Node(Token.BREAK));
    assertEquals("break;", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    generator.add(new Node(Token.BREAK, Node.newString(Token.LABEL_NAME, "l2")));
    assertEquals("break l2;", consumer.buffer.toString());
  }

  @Test(expected = Error.class)
  public void testContinue_invalidLabel_throwsError() {
    generator.add(new Node(Token.CONTINUE, Node.newString(Token.NAME, "bad")));
  }

  @Test(expected = Error.class)
  public void testBreak_invalidLabel_throwsError() {
    generator.add(new Node(Token.BREAK, Node.newString(Token.NAME, "bad")));
  }

  @Test(expected = Error.class)
  public void testExprVoid_throwsError() {
    generator.add(new Node(Token.EXPR_VOID));
  }

  @Test
  public void testExprResult() {
    Node expr = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    generator.add(expr);
    assertEquals("1;", consumer.buffer.toString());
  }

  @Test
  public void testNewNode() {
    Node newWithoutArgs = new Node(Token.NEW, Node.newString(Token.NAME, "Foo"));
    generator.add(newWithoutArgs);
    assertEquals("new Foo", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node newWithArgs = new Node(Token.NEW, Node.newString(Token.NAME, "Foo"), Node.newNumber(1));
    generator.add(newWithArgs);
    assertEquals("new Foo(1)", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node callInNew = new Node(Token.CALL, Node.newString(Token.NAME, "getFoo"));
    Node newWithCallTarget = new Node(Token.NEW, callInNew, Node.newNumber(2));
    generator.add(newWithCallTarget);
    assertEquals("new (getFoo())(2)", consumer.buffer.toString());
  }

  @Test
  public void testDelprop() {
    Node del = new Node(Token.DELPROP, Node.newString(Token.NAME, "x"));
    generator.add(del);
    assertEquals("delete x", consumer.buffer.toString());
  }

  @Test
  public void testSwitchCaseDefault() {
    Node switchNode = new Node(Token.SWITCH, Node.newString(Token.NAME, "val"));
    Node case1 = new Node(Token.CASE, Node.newNumber(1), new Node(Token.BLOCK));
    Node def = new Node(Token.DEFAULT, new Node(Token.BLOCK));
    switchNode.addChildToBack(case1);
    switchNode.addChildToBack(def);

    generator.add(switchNode);
    assertEquals("switch(val){case 1:;default:;}", consumer.buffer.toString());
  }

  @Test
  public void testSetNameNode_isIgnored() {
    generator.add(new Node(Token.SETNAME));
    assertEquals("", consumer.buffer.toString());
  }

  @Test(expected = Error.class)
  public void testUnknownNodeType_throwsError() {
    generator.add(new Node(999999));
  }

  @Test
  public void testAddList_andAddArrayList_andAddAllSiblings() {
    Node n1 = Node.newNumber(1);
    Node n2 = Node.newNumber(2);
    n1.setNext(n2);

    generator.addList(n1);
    assertEquals("1,2", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    generator.addList(n1, false);
    assertEquals("1,2", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    generator.addAllSiblings(n1);
    assertEquals("12", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node empty1 = new Node(Token.EMPTY);
    Node empty2 = new Node(Token.EMPTY);
    empty1.setNext(empty2);
    generator.addArrayList(empty1);
    assertEquals(",,", consumer.buffer.toString());
  }

  @Test
  public void testAddNonEmptyStatement_branches() {
    consumer.preserveExtraBlocks = true;
    Node emptyBlock = new Node(Token.BLOCK);
    Node ifNode = new Node(Token.IF, Node.newString(Token.NAME, "c"), emptyBlock);
    generator.add(ifNode);
    assertEquals("if(c){}", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node singleChildBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1)));
    Node ifNode2 = new Node(Token.IF, Node.newString(Token.NAME, "c"), singleChildBlock);
    generator.add(ifNode2);
    assertEquals("if(c){1;\n}", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    consumer.preserveExtraBlocks = false;
    Node fnChild = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
    Node blockWithFn = new Node(Token.BLOCK, fnChild);
    Node ifNode3 = new Node(Token.IF, Node.newString(Token.NAME, "c"), blockWithFn);
    generator.add(ifNode3);
    assertEquals("if(c){function f(){};\n}", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node doChild = new Node(Token.DO, new Node(Token.BLOCK), Node.newString(Token.NAME, "c"));
    Node blockWithDo = new Node(Token.BLOCK, doChild);
    Node ifNode4 = new Node(Token.IF, Node.newString(Token.NAME, "c"), blockWithDo);
    generator.add(ifNode4);
    assertEquals("if(c){do;while(c);\n}", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node multiChildBlock = new Node(Token.BLOCK,
        new Node(Token.EXPR_RESULT, Node.newNumber(1)),
        new Node(Token.EXPR_RESULT, Node.newNumber(2)));
    Node ifNode5 = new Node(Token.IF, Node.newString(Token.NAME, "c"), multiChildBlock);
    generator.add(ifNode5);
    assertEquals("if(c){1;2;}", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node varInBlock = new Node(Token.BLOCK, new Node(Token.VAR, Node.newString(Token.NAME, "v")));
    Node ifNode6 = new Node(Token.IF, Node.newString(Token.NAME, "c"), varInBlock);
    generator.add(ifNode6);
    assertEquals("if(c)var v;", consumer.buffer.toString());
  }

  @Test(expected = Error.class)
  public void testAddNonEmptyStatement_nonBlockWhenNotAllowed_throwsError() {
    Node badIf = new Node(Token.IF, Node.newString(Token.NAME, "c"), Node.newNumber(1));
    generator.add(badIf);
  }

  @Test
  public void testContextInForInitClause_withInOperator() {
    Node inNode = new Node(Token.IN, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    generator.addExpr(inNode, 0, CodeGenerator.Context.IN_FOR_INIT_CLAUSE);
    assertEquals("(a in b)", consumer.buffer.toString());
  }

  @Test
  public void testContextEnumValues() {
    for (CodeGenerator.Context ctx : CodeGenerator.Context.values()) {
      assertNotNull(CodeGenerator.Context.valueOf(ctx.name()));
    }
  }
}
