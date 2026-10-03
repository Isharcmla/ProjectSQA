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
    boolean shouldPreserve = false;
    boolean continueProc = true;

    @Override
    void append(String str) {
      buffer.append(str);
    }

    @Override
    char getLastChar() {
      return buffer.length() == 0 ? '\0' : buffer.charAt(buffer.length() - 1);
    }

    @Override
    boolean continueProcessing() {
      return continueProc;
    }

    @Override
    boolean shouldPreserveExtraBlocks() {
      return shouldPreserve;
    }

    @Override
    boolean breakAfterBlockFor(Node n, boolean isStatement) {
      return isStatement;
    }

    @Override
    void add(String newcode) {
      append(newcode);
    }

    @Override
    void addIdentifier(String identifier) {
      append(identifier);
    }

    @Override
    void addOp(String op, boolean binOp) {
      append(op);
    }

    @Override
    void addNumber(double x) {
      if (x == (long) x) {
        append(String.valueOf((long) x));
      } else {
        append(String.valueOf(x));
      }
    }

    @Override
    void addConstant(String newcode) {
      append(newcode);
    }

    @Override
    void listSeparator() {
      append(",");
    }

    @Override
    void endStatement() {
      append(";");
    }

    @Override
    void endStatement(boolean needSemi) {
      if (needSemi) {
        append(";");
      }
    }

    @Override
    void maybeLineBreak() {
      append("\n");
    }

    @Override
    void notePreferredLineBreak() {
      append("\n");
    }

    @Override
    void beginBlock() {
      append("{");
    }

    @Override
    void endBlock(boolean breakAfter) {
      append("}");
      if (breakAfter) {
        append("\n");
      }
    }

    @Override
    void beginCaseBody() {
      append(":");
    }

    @Override
    void endCaseBody() {
      append(";");
    }

    @Override
    void startSourceMapping(Node n) {}

    @Override
    void endSourceMapping(Node n) {}

    @Override
    void endFunction(boolean isStatement) {
      if (isStatement) {
        append(";");
      }
    }
  }

  private TestCodeConsumer consumer;
  private CodeGenerator generator;

  @Before
  public void setUp() {
    consumer = new TestCodeConsumer();
    generator = CodeGenerator.forCostEstimation(consumer);
  }

  private CodeGenerator createGenerator(CompilerOptions options) {
    return new CodeGenerator(consumer, options);
  }

  @Test
  public void testTagAsStrict() {
    generator.tagAsStrict();
    Assert.assertEquals("'use strict';", consumer.buffer.toString());
  }

  @Test
  public void testAddString() {
    generator.add("var x = 10;");
    Assert.assertEquals("var x = 10;", consumer.buffer.toString());
  }

  @Test
  public void testContinueProcessingFalse() {
    consumer.continueProc = false;
    generator.add(new Node(Token.NULL));
    Assert.assertEquals("", consumer.buffer.toString());
  }

  @Test
  public void testIsSimpleNumber() {
    Assert.assertTrue(CodeGenerator.isSimpleNumber("12345"));
    Assert.assertTrue(CodeGenerator.isSimpleNumber("1"));
    Assert.assertFalse(CodeGenerator.isSimpleNumber(""));
    Assert.assertFalse(CodeGenerator.isSimpleNumber("0123"));
    Assert.assertFalse(CodeGenerator.isSimpleNumber("12a45"));
    Assert.assertFalse(CodeGenerator.isSimpleNumber("-10"));
  }

  @Test
  public void testGetSimpleNumber() {
    Assert.assertEquals(12345.0, CodeGenerator.getSimpleNumber("12345"), 0.0);
    Assert.assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("012")));
    Assert.assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("999999999999999999999999999999999")));
    Assert.assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("abc")));
  }

  @Test
  public void testIdentifierEscape() {
    Assert.assertEquals("helloWorld_123", CodeGenerator.identifierEscape("helloWorld_123"));
    String escaped = CodeGenerator.identifierEscape("var_\u00E9_name");
    Assert.assertTrue(escaped.contains("\\u00e9"));
  }

  @Test
  public void testRegexpEscape() {
    Assert.assertEquals("/abc/g", generator.regexpEscape("abc/g"));
    CharsetEncoder encoder = Charsets.US_ASCII.newEncoder();
    String escaped = generator.regexpEscape("abc\u00E9", encoder);
    Assert.assertTrue(escaped.contains("\\u00e9"));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString() {
    String escaped = generator.escapeToDoubleQuotedJsString("hello \"world\"\n");
    Assert.assertEquals("\"hello \\\"world\\\"\\n\"", escaped);
  }

  @Test
  public void testStrEscapeSpecialCharacters() {
    CompilerOptions options = new CompilerOptions();
    options.trustedStrings = false;
    options.preferSingleQuotes = true;
    CodeGenerator cg = createGenerator(options);

    Node strNode = Node.newString("\0\u000B\b\f\n\r\t\\\"'\u2028\u2029=&><--></script<!--]]>");
    cg.add(strNode);
    String out = consumer.buffer.toString();

    Assert.assertTrue(out.contains("\\x00"));
    Assert.assertTrue(out.contains("\\x0B"));
    Assert.assertTrue(out.contains("\\b"));
    Assert.assertTrue(out.contains("\\f"));
    Assert.assertTrue(out.contains("\\n"));
    Assert.assertTrue(out.contains("\\r"));
    Assert.assertTrue(out.contains("\\t"));
    Assert.assertTrue(out.contains("\\\\"));
    Assert.assertTrue(out.contains("\\u2028"));
    Assert.assertTrue(out.contains("\\u2029"));
    Assert.assertTrue(out.contains("\\x3d"));
    Assert.assertTrue(out.contains("\\x26"));
    Assert.assertTrue(out.contains("\\x3e"));
    Assert.assertTrue(out.contains("\\x3c"));
  }

  @Test
  public void testStrEscapeSlashVAndQuotes() {
    Node node = Node.newString("\u000B");
    node.putBooleanProp(Node.SLASH_V, true);
    generator.add(node);
    Assert.assertTrue(consumer.buffer.toString().contains("\\v"));

    CompilerOptions options = new CompilerOptions();
    options.preferSingleQuotes = true;
    consumer.buffer.setLength(0);
    CodeGenerator cg = createGenerator(options);
    cg.add(Node.newString("double\"quote"));
    Assert.assertTrue(consumer.buffer.toString().startsWith("'"));

    consumer.buffer.setLength(0);
    options.preferSingleQuotes = false;
    cg = createGenerator(options);
    cg.add(Node.newString("single'quote"));
    Assert.assertTrue(consumer.buffer.toString().startsWith("\""));
  }

  @Test
  public void testStrEscapeWithCharsetEncoder() {
    CompilerOptions options = new CompilerOptions();
    options.setOutputCharset(Charset.forName("ISO-8859-1"));
    CodeGenerator cg = createGenerator(options);

    consumer.buffer.setLength(0);
    cg.add(Node.newString("\u00E9\u4E2D\uD834\uDD1E"));
    String out = consumer.buffer.toString();
    Assert.assertTrue(out.contains("\u00E9"));
    Assert.assertTrue(out.contains("\\u4e2d"));
    Assert.assertTrue(out.contains("\\ud834\\udd1e"));
  }

  @Test
  public void testBinaryOperators() {
    Node add = new Node(Token.ADD, Node.newString("a"), Node.newString("b"));
    generator.add(add);
    Assert.assertEquals("\"a\"+\"b\"", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node mul1 = new Node(Token.MUL, Node.newNumber(2), Node.newNumber(3));
    Node mul2 = new Node(Token.MUL, mul1, Node.newNumber(4));
    generator.add(mul2);
    Assert.assertEquals("2*3*4", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node assign1 = new Node(Token.ASSIGN, Node.newString(Token.NAME, "b"), Node.newNumber(1));
    Node assign2 = new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"), assign1);
    generator.add(assign2);
    Assert.assertEquals("a=b=1", consumer.buffer.toString());
  }

  @Test
  public void testTryCatchFinally() {
    Node tryBlock = new Node(Token.BLOCK, new Node(Token.EMPTY));
    Node catchBlock = new Node(Token.BLOCK, new Node(Token.CATCH, Node.newString(Token.NAME, "e"), new Node(Token.BLOCK, new Node(Token.EMPTY))));
    Node finallyBlock = new Node(Token.BLOCK, new Node(Token.EMPTY));

    Node tryNode = new Node(Token.TRY, tryBlock, catchBlock, finallyBlock);
    generator.add(tryNode);
    Assert.assertTrue(consumer.buffer.toString().startsWith("try;catch(e);finally;"));
  }

  @Test
  public void testThrowAndReturn() {
    Node throwNode = new Node(Token.THROW, Node.newString("error"));
    generator.add(throwNode);
    Assert.assertEquals("throw\"error\";", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node returnNode = new Node(Token.RETURN);
    generator.add(returnNode);
    Assert.assertEquals("return;", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node returnValNode = new Node(Token.RETURN, Node.newNumber(42));
    generator.add(returnValNode);
    Assert.assertEquals("return42;", consumer.buffer.toString());
  }

  @Test
  public void testVarAndName() {
    Node name1 = Node.newString(Token.NAME, "x");
    Node name2 = Node.newString(Token.NAME, "y");
    name2.addChildToBack(Node.newNumber(10));
    Node varNode = new Node(Token.VAR, name1, name2);
    generator.add(varNode);
    Assert.assertEquals("var x,y=10", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node nameWithComma = Node.newString(Token.NAME, "z");
    Node comma = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
    nameWithComma.addChildToBack(comma);
    generator.add(new Node(Token.VAR, nameWithComma));
    Assert.assertEquals("var z=(1,2)", consumer.buffer.toString());
  }

  @Test
  public void testLabelName() {
    Node labelName = Node.newString(Token.LABEL_NAME, "myLabel");
    generator.add(labelName);
    Assert.assertEquals("myLabel", consumer.buffer.toString());
  }

  @Test
  public void testArrayLiteralAndHoles() {
    Node array = new Node(Token.ARRAYLIT, Node.newNumber(1), new Node(Token.EMPTY), Node.newNumber(2));
    generator.add(array);
    Assert.assertEquals("[1,,2]", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node arrayTrailingHole = new Node(Token.ARRAYLIT, Node.newNumber(1), new Node(Token.EMPTY));
    generator.add(arrayTrailingHole);
    Assert.assertEquals("[1,,]", consumer.buffer.toString());
  }

  @Test
  public void testParamList() {
    Node params = new Node(Token.PARAM_LIST, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    generator.add(params);
    Assert.assertEquals("(a,b)", consumer.buffer.toString());
  }

  @Test
  public void testUnaryOpsAndNegation() {
    generator.add(new Node(Token.NOT, Node.newString(Token.NAME, "x")));
    generator.add(new Node(Token.TYPEOF, Node.newString(Token.NAME, "x")));
    generator.add(new Node(Token.VOID, Node.newNumber(0)));
    generator.add(new Node(Token.BITNOT, Node.newNumber(1)));
    generator.add(new Node(Token.POS, Node.newNumber(2)));
    generator.add(new Node(Token.NEG, Node.newNumber(5)));
    generator.add(new Node(Token.NEG, Node.newString(Token.NAME, "y")));

    String out = consumer.buffer.toString();
    Assert.assertTrue(out.contains("!x"));
    Assert.assertTrue(out.contains("typeofx"));
    Assert.assertTrue(out.contains("void0"));
    Assert.assertTrue(out.contains("~1"));
    Assert.assertTrue(out.contains("+2"));
    Assert.assertTrue(out.contains("-5"));
    Assert.assertTrue(out.contains("-y"));
  }

  @Test
  public void testHook() {
    Node hook = new Node(Token.HOOK, Node.newString(Token.NAME, "cond"), Node.newNumber(1), Node.newNumber(2));
    generator.add(hook);
    Assert.assertEquals("cond?1:2", consumer.buffer.toString());
  }

  @Test
  public void testRegexp() {
    Node regex1 = new Node(Token.REGEXP, Node.newString("abc"));
    generator.add(regex1);
    Assert.assertEquals("/abc/", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node regex2 = new Node(Token.REGEXP, Node.newString("abc"), Node.newString("gi"));
    generator.add(regex2);
    Assert.assertEquals("/abc/gi", consumer.buffer.toString());
  }

  @Test(expected = Error.class)
  public void testRegexpInvalidChildren() {
    Node regex = new Node(Token.REGEXP, Node.newNumber(123));
    generator.add(regex);
  }

  @Test
  public void testFunction() {
    Node fn = new Node(Token.FUNCTION,
        Node.newString(Token.NAME, "foo"),
        new Node(Token.PARAM_LIST),
        new Node(Token.BLOCK));
    generator.add(fn, CodeGenerator.Context.START_OF_EXPR);
    Assert.assertEquals("(functionfoo(){};)", consumer.buffer.toString());
  }

  @Test
  public void testGettersAndSetters() {
    Node obj = new Node(Token.OBJECTLIT);
    Node getterFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    Node getter = Node.newString(Token.GETTER_DEF, "prop");
    getter.addChildToBack(getterFn);
    obj.addChildToBack(getter);

    Node setterFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.PARAM_LIST, Node.newString(Token.NAME, "v")), new Node(Token.BLOCK));
    Node setter = Node.newString(Token.SETTER_DEF, "prop");
    setter.addChildToBack(setterFn);
    obj.addChildToBack(setter);

    generator.add(obj);
    Assert.assertEquals("{get prop(){},set prop(v){}}", consumer.buffer.toString());
  }

  @Test
  public void testObjectLitKeys() {
    Node obj = new Node(Token.OBJECTLIT);
    Node k1 = Node.newString(Token.STRING_KEY, "a");
    k1.addChildToBack(Node.newNumber(1));
    Node k2 = Node.newString(Token.STRING_KEY, "123");
    k2.addChildToBack(Node.newNumber(2));
    Node k3 = Node.newString(Token.STRING_KEY, "default");
    k3.addChildToBack(Node.newNumber(3));

    obj.addChildToBack(k1);
    obj.addChildToBack(k2);
    obj.addChildToBack(k3);

    generator.add(obj, CodeGenerator.Context.START_OF_EXPR);
    Assert.assertEquals("({a:1,123:2,\"default\":3})", consumer.buffer.toString());
  }

  @Test
  public void testForLoops() {
    Node for4 = new Node(Token.FOR,
        new Node(Token.VAR, Node.newString(Token.NAME, "i")),
        Node.newString(Token.NAME, "cond"),
        Node.newString(Token.NAME, "step"),
        new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(for4);
    Assert.assertEquals("for(var i;cond;step);", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node for3 = new Node(Token.FOR,
        Node.newString(Token.NAME, "k"),
        Node.newString(Token.NAME, "obj"),
        new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(for3);
    Assert.assertEquals("for(kinobj);", consumer.buffer.toString());
  }

  @Test
  public void testDoWhileAndWhileAndWith() {
    Node doWhile = new Node(Token.DO, new Node(Token.BLOCK, new Node(Token.EMPTY)), Node.newString(Token.NAME, "cond"));
    generator.add(doWhile);
    Assert.assertEquals("do;while(cond);", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node whileNode = new Node(Token.WHILE, Node.newString(Token.NAME, "cond"), new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(whileNode);
    Assert.assertEquals("while(cond);", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node withNode = new Node(Token.WITH, Node.newString(Token.NAME, "scope"), new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(withNode);
    Assert.assertEquals("with(scope);", consumer.buffer.toString());
  }

  @Test
  public void testGetPropAndGetElem() {
    Node getProp1 = new Node(Token.GETPROP, Node.newNumber(1), Node.newString("toString"));
    generator.add(getProp1);
    Assert.assertEquals("(1).toString", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node getProp2 = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString("prop"));
    generator.add(getProp2);
    Assert.assertEquals("obj.prop", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node getElem = new Node(Token.GETELEM, Node.newString(Token.NAME, "arr"), Node.newNumber(0));
    generator.add(getElem);
    Assert.assertEquals("arr[0]", consumer.buffer.toString());
  }

  @Test
  public void testIncAndDec() {
    Node preInc = new Node(Token.INC, Node.newString(Token.NAME, "x"));
    generator.add(preInc);
    Assert.assertEquals("++x", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node postDec = new Node(Token.DEC, Node.newString(Token.NAME, "y"));
    postDec.putIntProp(Node.INCRDECR_PROP, 1);
    generator.add(postDec);
    Assert.assertEquals("y--", consumer.buffer.toString());
  }

  @Test
  public void testCalls() {
    Node evalCall = new Node(Token.CALL, Node.newString(Token.NAME, "eval"), Node.newString("1+1"));
    generator.add(evalCall);
    Assert.assertEquals("(0,eval)(\"1+1\")", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node directEval = new Node(Token.CALL, Node.newString(Token.NAME, "eval"), Node.newString("1+1"));
    directEval.getFirstChild().putBooleanProp(Node.DIRECT_EVAL, true);
    generator.add(directEval);
    Assert.assertEquals("eval(\"1+1\")", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node freeCall = new Node(Token.CALL, new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString("b")));
    freeCall.putBooleanProp(Node.FREE_CALL, true);
    generator.add(freeCall);
    Assert.assertEquals("(0,a.b)()", consumer.buffer.toString());
  }

  @Test
  public void testIfElse() {
    Node ifElse = new Node(Token.IF,
        Node.newString(Token.NAME, "c"),
        new Node(Token.BLOCK, new Node(Token.EMPTY)),
        new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(ifElse);
    Assert.assertEquals("if(c);else;", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node ifOnly = new Node(Token.IF,
        Node.newString(Token.NAME, "c"),
        new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(ifOnly, CodeGenerator.Context.BEFORE_DANGLING_ELSE);
    Assert.assertEquals("{if(c);}", consumer.buffer.toString());
  }

  @Test
  public void testConstantsAndLiterals() {
    generator.add(new Node(Token.NULL));
    generator.add(new Node(Token.THIS));
    generator.add(new Node(Token.FALSE));
    generator.add(new Node(Token.TRUE));
    generator.add(new Node(Token.DEBUGGER));
    Assert.assertEquals("nullthisfalstruedebugger;", consumer.buffer.toString());
  }

  @Test
  public void testBreakAndContinue() {
    generator.add(new Node(Token.BREAK));
    generator.add(new Node(Token.CONTINUE));
    Node breakLabel = new Node(Token.BREAK, Node.newString(Token.LABEL_NAME, "l1"));
    Node contLabel = new Node(Token.CONTINUE, Node.newString(Token.LABEL_NAME, "l2"));
    generator.add(breakLabel);
    generator.add(contLabel);
    Assert.assertEquals("break;continue;break l1;continue l2;", consumer.buffer.toString());
  }

  @Test
  public void testNewNode() {
    Node newWithoutArgs = new Node(Token.NEW, Node.newString(Token.NAME, "Foo"));
    generator.add(newWithoutArgs);
    Assert.assertEquals("new Foo", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node newWithArgs = new Node(Token.NEW, Node.newString(Token.NAME, "Foo"), Node.newNumber(1));
    generator.add(newWithArgs);
    Assert.assertEquals("new Foo(1)", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node newWithCall = new Node(Token.NEW, new Node(Token.CALL, Node.newString(Token.NAME, "getConstructor")), Node.newNumber(1));
    generator.add(newWithCall);
    Assert.assertEquals("new (getConstructor())(1)", consumer.buffer.toString());
  }

  @Test
  public void testDelPropAndCastAndExprResult() {
    Node del = new Node(Token.DELPROP, Node.newString(Token.NAME, "x"));
    generator.add(del);
    Assert.assertEquals("delete x", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node cast = new Node(Token.CAST, Node.newString(Token.NAME, "y"));
    generator.add(cast);
    Assert.assertEquals("(y)", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node exprResult = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    generator.add(exprResult);
    Assert.assertEquals("1;", consumer.buffer.toString());
  }

  @Test
  public void testSwitchCaseDefault() {
    Node caseNode = new Node(Token.CASE, Node.newNumber(1), new Node(Token.BLOCK, new Node(Token.EMPTY)));
    Node defaultNode = new Node(Token.DEFAULT_CASE, new Node(Token.BLOCK, new Node(Token.EMPTY)));
    Node switchNode = new Node(Token.SWITCH, Node.newString(Token.NAME, "val"), caseNode, defaultNode);
    generator.add(switchNode);
    Assert.assertEquals("switch(val){case 1:;default:;}\n", consumer.buffer.toString());
  }

  @Test
  public void testLabel() {
    Node label = new Node(Token.LABEL, Node.newString(Token.LABEL_NAME, "loop"), new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(label);
    Assert.assertEquals("loop:;", consumer.buffer.toString());
  }

  @Test
  public void testAddNonEmptyStatementPreserveBlocks() {
    consumer.shouldPreserve = true;
    Node emptyBlock = new Node(Token.BLOCK);
    Node ifNode = new Node(Token.IF, Node.newString(Token.NAME, "c"), emptyBlock);
    generator.add(ifNode);
    Assert.assertEquals("if(c){}\n", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node funcInsideBlock = new Node(Token.BLOCK,
        new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK)));
    Node whileNode = new Node(Token.WHILE, Node.newString(Token.NAME, "c"), funcInsideBlock);
    generator.add(whileNode);
    Assert.assertEquals("while(c){functionf(){};\n}\n", consumer.buffer.toString());
  }

  @Test
  public void testScriptAndBlockHandling() {
    Node script = new Node(Token.SCRIPT,
        new Node(Token.VAR, Node.newString(Token.NAME, "v")),
        new Node(Token.FUNCTION, Node.newString(Token.NAME, "fn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK)));
    generator.add(script);
    Assert.assertTrue(consumer.buffer.toString().contains("var v;"));
    Assert.assertTrue(consumer.buffer.toString().contains("functionfn(){};"));
  }

  @Test(expected = Error.class)
  public void testUnknownNodeTypeThrowsError() {
    generator.add(new Node(999999));
  }

  @Test(expected = Error.class)
  public void testAddNonEmptyStatementMissingBlockChildThrowsError() {
    Node label = new Node(Token.LABEL, Node.newString(Token.LABEL_NAME, "bad"), Node.newNumber(1));
    Node ifNode = new Node(Token.IF, Node.newString(Token.NAME, "c"), label);
    generator.add(ifNode);
  }
}
