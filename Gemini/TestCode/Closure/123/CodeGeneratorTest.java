package com.google.javascript.jscomp;

import com.google.common.base.Charsets;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.rhino.IR;
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
    boolean continueProcessing = true;

    @Override
    void add(String newcode) {
      sb.append(newcode);
    }

    @Override
    void addIdentifier(String identifier) {
      sb.append(identifier);
    }

    @Override
    void addOp(String op, boolean binOp) {
      if (binOp) {
        sb.append(" ").append(op).append(" ");
      } else {
        sb.append(op);
      }
    }

    @Override
    void addNumber(double x) {
      long l = (long) x;
      if (l == x) {
        sb.append(l);
      } else {
        sb.append(x);
      }
    }

    @Override
    void addConstant(String newcode) {
      sb.append(newcode);
    }

    @Override
    void beginBlock() {
      sb.append("{");
    }

    @Override
    void endBlock(boolean needsSemicolon) {
      sb.append("}");
      if (needsSemicolon) {
        sb.append(";");
      }
    }

    @Override
    void listSeparator() {
      sb.append(",");
    }

    @Override
    void endStatement(boolean needSemicolon) {
      if (needSemicolon) {
        sb.append(";");
      }
    }

    @Override
    void maybeLineBreak() {
      sb.append("\n");
    }

    @Override
    void notePreferredLineBreak() {
      sb.append("\n");
    }

    @Override
    void endFunction(boolean isStatement) {
      if (isStatement) {
        sb.append(";");
      }
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
    boolean breakAfterBlockFor(Node n, boolean statementContext) {
      return statementContext;
    }

    String getOutput() {
      return sb.toString();
    }
  }

  private TestCodeConsumer consumer;
  private CodeGenerator generator;
  private CompilerOptions options;

  @Before
  public void setUp() {
    consumer = new TestCodeConsumer();
    options = new CompilerOptions();
    generator = new CodeGenerator(consumer, options);
  }

  @Test
  public void testForCostEstimation_initializesProperly() {
    CodeGenerator costGen = CodeGenerator.forCostEstimation(consumer);
    costGen.tagAsStrict();
    Assert.assertEquals("'use strict';", consumer.getOutput());
  }

  @Test
  public void testConstructor_withNullOrAsciiCharset_usesAsciiDefault() {
    options.setOutputCharset((Charset) null);
    CodeGenerator gen1 = new CodeGenerator(consumer, options);
    gen1.add("a");
    Assert.assertEquals("a", consumer.getOutput());

    TestCodeConsumer c2 = new TestCodeConsumer();
    options.setOutputCharset(Charsets.US_ASCII);
    CodeGenerator gen2 = new CodeGenerator(c2, options);
    gen2.add("b");
    Assert.assertEquals("b", c2.getOutput());
  }

  @Test
  public void testConstructor_withUtf8Charset_usesEncoder() {
    options.setOutputCharset(Charsets.UTF_8);
    CodeGenerator gen = new CodeGenerator(consumer, options);
    Node strNode = IR.string("ทดสอบ");
    gen.add(strNode);
    Assert.assertTrue(consumer.getOutput().contains("ทดสอบ"));
  }

  @Test
  public void testTagAsStrict_appendsStrictDirective() {
    generator.tagAsStrict();
    Assert.assertEquals("'use strict';", consumer.getOutput());
  }

  @Test
  public void testContinueProcessing_falseStopsGeneration() {
    consumer.continueProcessing = false;
    Node n = IR.number(42);
    generator.add(n);
    Assert.assertEquals("", consumer.getOutput());
  }

  @Test
  public void testIsSimpleNumber() {
    Assert.assertFalse(CodeGenerator.isSimpleNumber(""));
    Assert.assertFalse(CodeGenerator.isSimpleNumber("abc"));
    Assert.assertFalse(CodeGenerator.isSimpleNumber("0123"));
    Assert.assertTrue(CodeGenerator.isSimpleNumber("0"));
    Assert.assertTrue(CodeGenerator.isSimpleNumber("123"));
    Assert.assertFalse(CodeGenerator.isSimpleNumber("-5"));
  }

  @Test
  public void testGetSimpleNumber() {
    Assert.assertEquals(0.0, CodeGenerator.getSimpleNumber("0"), 0.0001);
    Assert.assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.0001);
    Assert.assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("012")));
    Assert.assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("999999999999999999999999999999999")));
  }

  @Test
  public void testIdentifierEscape() {
    Assert.assertEquals("simpleIdent", CodeGenerator.identifierEscape("simpleIdent"));
    Assert.assertEquals("foo\\u00a0bar", CodeGenerator.identifierEscape("foo\u00a0bar"));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString() {
    Assert.assertEquals("\"hello\"", generator.escapeToDoubleQuotedJsString("hello"));
    Assert.assertEquals("\"hello \\\"world\\\"\"", generator.escapeToDoubleQuotedJsString("hello \"world\""));
  }

  @Test
  public void testRegexpEscape() {
    Assert.assertEquals("/a\\/b/", generator.regexpEscape("a/b"));
    CharsetEncoder encoder = Charsets.US_ASCII.newEncoder();
    Assert.assertEquals("/\\u00a0/", generator.regexpEscape("\u00a0", encoder));
  }

  @Test
  public void testStringEscapes_specialCharacters() {
    Node node = IR.string("\0\u000B\b\f\n\r\t\\\"'\u2028\u2029=&><-->]]><\/script<!--");
    node.putBooleanProp(Node.SLASH_V, true);
    generator.add(node);
    String out = consumer.getOutput();
    Assert.assertTrue(out.contains("\\x00"));
    Assert.assertTrue(out.contains("\\v"));
    Assert.assertTrue(out.contains("\\b"));
    Assert.assertTrue(out.contains("\\f"));
    Assert.assertTrue(out.contains("\\n"));
    Assert.assertTrue(out.contains("\\r"));
    Assert.assertTrue(out.contains("\\t"));
    Assert.assertTrue(out.contains("\\u2028"));
    Assert.assertTrue(out.contains("\\u2029"));
    Assert.assertTrue(out.contains("\\x3e"));
    Assert.assertTrue(out.contains("\\x3c"));
  }

  @Test
  public void testStringEscapes_untrustedStrings() {
    options.trustedStrings = false;
    CodeGenerator unstrustedGen = new CodeGenerator(consumer, options);
    Node node = IR.string("= & > <");
    unstrustedGen.add(node);
    String out = consumer.getOutput();
    Assert.assertTrue(out.contains("\\x3d"));
    Assert.assertTrue(out.contains("\\x26"));
    Assert.assertTrue(out.contains("\\x3e"));
    Assert.assertTrue(out.contains("\\x3c"));
  }

  @Test
  public void testStringEscapes_preferSingleQuotes() {
    options.preferSingleQuotes = true;
    CodeGenerator quoteGen = new CodeGenerator(consumer, options);
    Node node = IR.string("test \"double\" 'single'");
    quoteGen.add(node);
    String out = consumer.getOutput();
    Assert.assertTrue(out.startsWith("'") && out.endsWith("'"));
  }

  @Test
  public void testBinaryOperators_associativeAndAssignment() {
    Node mul = IR.mul(IR.name("a"), IR.mul(IR.name("b"), IR.name("c")));
    generator.add(mul);
    Assert.assertEquals("a * b * c", consumer.getOutput());

    TestCodeConsumer c2 = new TestCodeConsumer();
    CodeGenerator g2 = new CodeGenerator(c2, options);
    Node assign = IR.assign(IR.name("x"), IR.assign(IR.name("y"), IR.number(1)));
    g2.add(assign);
    Assert.assertEquals("x = y = 1", c2.getOutput());
  }

  @Test
  public void testUnrollBinaryOperator() {
    Node addChain = IR.add(IR.add(IR.name("a"), IR.name("b")), IR.name("c"));
    generator.add(addChain);
    Assert.assertEquals("a + b + c", consumer.getOutput());
  }

  @Test
  public void testTryCatchFinally() {
    Node tryNode = IR.tryFinally(
        IR.block(IR.name("tryBody")),
        IR.block(IR.name("finallyBody"))
    );
    tryNode.addChildBefore(IR.block(IR.catchNode(IR.name("e"), IR.block(IR.name("catchBody")))), tryNode.getLastChild());
    generator.add(tryNode);
    String out = consumer.getOutput();
    Assert.assertTrue(out.contains("try"));
    Assert.assertTrue(out.contains("catch(e)"));
    Assert.assertTrue(out.contains("finally"));
  }

  @Test
  public void testThrowAndReturn() {
    Node throwNode = IR.throwNode(IR.name("err"));
    generator.add(throwNode);
    Assert.assertTrue(consumer.getOutput().contains("throwerr;"));

    TestCodeConsumer c2 = new TestCodeConsumer();
    CodeGenerator g2 = new CodeGenerator(c2, options);
    g2.add(IR.returnNode(IR.number(1)));
    g2.add(IR.returnNode());
    Assert.assertEquals("return1return", c2.getOutput());
  }

  @Test
  public void testVarAndName() {
    Node varNode = IR.var(IR.name("a"), IR.name("b", IR.number(2)));
    generator.add(varNode);
    Assert.assertTrue(consumer.getOutput().contains("var a,b = 2"));

    TestCodeConsumer c2 = new TestCodeConsumer();
    CodeGenerator g2 = new CodeGenerator(c2, options);
    Node nameAssignComma = IR.name("c", IR.comma(IR.number(1), IR.number(2)));
    g2.add(nameAssignComma);
    Assert.assertTrue(c2.getOutput().contains("c = 1 , 2"));
  }

  @Test
  public void testLabelAndLabelName() {
    Node labelName = IR.labelName("myLabel");
    generator.add(labelName);
    Assert.assertEquals("myLabel", consumer.getOutput());

    TestCodeConsumer c2 = new TestCodeConsumer();
    CodeGenerator g2 = new CodeGenerator(c2, options);
    Node labelNode = IR.label(IR.labelName("lbl"), IR.block(IR.exprResult(IR.number(1))));
    g2.add(labelNode);
    Assert.assertTrue(c2.getOutput().contains("lbl:"));
  }

  @Test
  public void testArrayLitAndParamList() {
    Node array = IR.arraylit(IR.empty(), IR.number(1), IR.empty());
    generator.add(array);
    Assert.assertEquals("[,1,,]", consumer.getOutput());

    TestCodeConsumer c2 = new TestCodeConsumer();
    CodeGenerator g2 = new CodeGenerator(c2, options);
    Node paramList = IR.paramList(IR.name("p1"), IR.name("p2"));
    g2.add(paramList);
    Assert.assertEquals("(p1,p2)", c2.getOutput());
  }

  @Test
  public void testUnaryOperators() {
    generator.add(IR.typeof(IR.name("x")));
    generator.add(IR.voidNode(IR.number(0)));
    generator.add(IR.not(IR.name("y")));
    generator.add(IR.bitnot(IR.name("z")));
    generator.add(IR.pos(IR.name("w")));
    generator.add(IR.neg(IR.number(5)));
    generator.add(IR.neg(IR.name("a")));
    String out = consumer.getOutput();
    Assert.assertTrue(out.contains("typeofx"));
    Assert.assertTrue(out.contains("void0"));
    Assert.assertTrue(out.contains("!y"));
    Assert.assertTrue(out.contains("~z"));
    Assert.assertTrue(out.contains("+w"));
    Assert.assertTrue(out.contains("-5"));
    Assert.assertTrue(out.contains("-a"));
  }

  @Test
  public void testHook() {
    Node hook = IR.hook(IR.name("cond"), IR.number(1), IR.number(2));
    generator.add(hook);
    Assert.assertEquals("cond ? 1 : 2", consumer.getOutput());
  }

  @Test
  public void testRegexp() {
    Node regexp = IR.regexp(IR.string("abc"), IR.string("g"));
    generator.add(regexp);
    Assert.assertEquals("/abc/g", consumer.getOutput());

    TestCodeConsumer c2 = new TestCodeConsumer();
    CodeGenerator g2 = new CodeGenerator(c2, options);
    Node regexpNoFlags = IR.regexp(IR.string("xyz"));
    g2.add(regexpNoFlags);
    Assert.assertEquals("/xyz/", c2.getOutput());
  }

  @Test
  public void testFunction_statementAndExpression() {
    Node fn = IR.function(IR.name("foo"), IR.paramList(), IR.block());
    generator.add(fn, CodeGenerator.Context.STATEMENT);
    Assert.assertTrue(consumer.getOutput().contains("function foo(){};"));

    TestCodeConsumer c2 = new TestCodeConsumer();
    CodeGenerator g2 = new CodeGenerator(c2, options);
    g2.add(fn, CodeGenerator.Context.START_OF_EXPR);
    Assert.assertTrue(c2.getOutput().startsWith("(function foo(){}") && c2.getOutput().endsWith(")"));
  }

  @Test
  public void testGetterAndSetterDef() {
    Node getter = IR.getProp(IR.name(""), IR.string(""));
    getter.setType(Token.GETTER_DEF);
    getter.setString("prop");
    getter.addChildToBack(IR.function(IR.name(""), IR.paramList(), IR.block()));

    Node setter = IR.getProp(IR.name(""), IR.string(""));
    setter.setType(Token.SETTER_DEF);
    setter.setString("prop");
    setter.addChildToBack(IR.function(IR.name(""), IR.paramList(IR.name("v")), IR.block()));

    Node objLit = IR.objectlit(getter, setter);
    generator.add(objLit);
    String out = consumer.getOutput();
    Assert.assertTrue(out.contains("get prop(){}"));
    Assert.assertTrue(out.contains("set prop(v){}"));
  }

  @Test
  public void testScriptAndBlock() {
    Node script = IR.script(IR.var(IR.name("x")), IR.function(IR.name("f"), IR.paramList(), IR.block()));
    generator.add(script);
    Assert.assertTrue(consumer.getOutput().contains("var x;\n"));

    TestCodeConsumer c2 = new TestCodeConsumer();
    CodeGenerator g2 = new CodeGenerator(c2, options);
    Node block = IR.block(IR.number(1));
    g2.add(block, CodeGenerator.Context.PRESERVE_BLOCK);
    Assert.assertTrue(c2.getOutput().startsWith("{") && c2.getOutput().endsWith("}"));
  }

  @Test
  public void testForLoops() {
    Node for4 = IR.forNode(IR.var(IR.name("i", IR.number(0))), IR.name("i"), IR.inc(IR.name("i"), true), IR.block());
    generator.add(for4);
    Assert.assertTrue(consumer.getOutput().contains("for(var i = 0;i;i++;);"));

    TestCodeConsumer c2 = new TestCodeConsumer();
    CodeGenerator g2 = new CodeGenerator(c2, options);
    Node forIn = IR.forIn(IR.name("k"), IR.name("obj"), IR.block());
    g2.add(forIn);
    Assert.assertTrue(c2.getOutput().contains("for(kinobj);"));
  }

  @Test
  public void testDoAndWhile() {
    Node doWhile = IR.doNode(IR.block(), IR.name("cond"));
    generator.add(doWhile);
    Assert.assertTrue(consumer.getOutput().contains("do;while(cond);"));

    TestCodeConsumer c2 = new TestCodeConsumer();
    CodeGenerator g2 = new CodeGenerator(c2, options);
    Node whileNode = IR.whileNode(IR.name("cond"), IR.block());
    g2.add(whileNode);
    Assert.assertTrue(c2.getOutput().contains("while(cond);"));
  }

  @Test
  public void testEmptyAndGetPropGetElem() {
    generator.add(IR.empty());
    generator.add(IR.getprop(IR.number(1), IR.string("toString")));
    generator.add(IR.getelem(IR.name("arr"), IR.number(0)));
    String out = consumer.getOutput();
    Assert.assertTrue(out.contains("(1).toString"));
    Assert.assertTrue(out.contains("arr[0]"));
  }

  @Test
  public void testGetProp_es3Keyword() {
    options.setLanguageOut(LanguageMode.ECMASCRIPT3);
    CodeGenerator es3Gen = new CodeGenerator(consumer, options);
    Node getProp = IR.getprop(IR.name("obj"), IR.string("default"));
    es3Gen.add(getProp);
    Assert.assertTrue(consumer.getOutput().contains("obj[\"default\"]"));
  }

  @Test
  public void testWithIncDec() {
    generator.add(IR.with(IR.name("obj"), IR.block()));
    Node postInc = IR.inc(IR.name("i"), true);
    postInc.putIntProp(Node.INCRDECR_PROP, 1);
    generator.add(postInc);
    Node preDec = IR.dec(IR.name("j"), false);
    preDec.putIntProp(Node.INCRDECR_PROP, 0);
    generator.add(preDec);
    String out = consumer.getOutput();
    Assert.assertTrue(out.contains("with(obj);"));
    Assert.assertTrue(out.contains("i++"));
    Assert.assertTrue(out.contains("--j"));
  }

  @Test
  public void testCall_evalAndFreeCall() {
    Node evalCall = IR.call(IR.name("eval"), IR.string("1+1"));
    generator.add(evalCall);
    Assert.assertTrue(consumer.getOutput().contains("(0,eval)(\"1+1\")"));

    TestCodeConsumer c2 = new TestCodeConsumer();
    CodeGenerator g2 = new CodeGenerator(c2, options);
    Node freeCall = IR.call(IR.getprop(IR.name("obj"), IR.string("foo")), IR.number(1));
    freeCall.putBooleanProp(Node.FREE_CALL, true);
    g2.add(freeCall);
    Assert.assertTrue(c2.getOutput().contains("(0,obj.foo)(1)"));
  }

  @Test
  public void testIfStatements_withElseAndDanglingElse() {
    Node ifElse = IR.ifNode(IR.name("a"), IR.block(IR.exprResult(IR.number(1))), IR.block(IR.exprResult(IR.number(2))));
    generator.add(ifElse);
    Assert.assertTrue(consumer.getOutput().contains("if(a)1else 2"));

    TestCodeConsumer c2 = new TestCodeConsumer();
    CodeGenerator g2 = new CodeGenerator(c2, options);
    Node ifNoElse = IR.ifNode(IR.name("b"), IR.block(IR.exprResult(IR.number(3))));
    g2.add(ifNoElse, CodeGenerator.Context.BEFORE_DANGLING_ELSE);
    Assert.assertTrue(c2.getOutput().contains("{if(b)3}"));
  }

  @Test
  public void testConstantsAndLiterals() {
    generator.add(IR.nullNode());
    generator.add(IR.thisNode());
    generator.add(IR.falseNode());
    generator.add(IR.trueNode());
    generator.add(IR.continueNode());
    generator.add(IR.continueNode(IR.labelName("lbl")));
    generator.add(IR.debugger());
    generator.add(IR.breakNode());
    generator.add(IR.breakNode(IR.labelName("lbl")));
    generator.add(IR.delprop(IR.name("x")));
    String out = consumer.getOutput();
    Assert.assertTrue(out.contains("null"));
    Assert.assertTrue(out.contains("this"));
    Assert.assertTrue(out.contains("false"));
    Assert.assertTrue(out.contains("true"));
    Assert.assertTrue(out.contains("continue"));
    Assert.assertTrue(out.contains("continuelbl;"));
    Assert.assertTrue(out.contains("debugger;"));
    Assert.assertTrue(out.contains("break"));
    Assert.assertTrue(out.contains("breaklbl;"));
    Assert.assertTrue(out.contains("delete x"));
  }

  @Test
  public void testNewAndCast() {
    Node newCall = IR.newNode(IR.call(IR.name("getFactory")), IR.number(1));
    generator.add(newCall);
    Assert.assertTrue(consumer.getOutput().contains("new (getFactory())(1)"));

    TestCodeConsumer c2 = new TestCodeConsumer();
    CodeGenerator g2 = new CodeGenerator(c2, options);
    Node cast = IR.cast(IR.name("x"));
    g2.add(cast);
    Assert.assertEquals("(x)", c2.getOutput());
  }

  @Test
  public void testObjectLit_keys() {
    Node strKey1 = IR.stringKey("latinKey", IR.number(1));
    Node strKey2 = IR.stringKey("123", IR.number(2));
    Node strKey3 = IR.stringKey("non-id key", IR.number(3));
    Node obj = IR.objectlit(strKey1, strKey2, strKey3);
    generator.add(obj, CodeGenerator.Context.START_OF_EXPR);
    String out = consumer.getOutput();
    Assert.assertTrue(out.startsWith("({") && out.endsWith("})"));
    Assert.assertTrue(out.contains("latinKey : 1"));
    Assert.assertTrue(out.contains("123 : 2"));
    Assert.assertTrue(out.contains("\"non-id key\" : 3"));
  }

  @Test
  public void testSwitchCaseDefault() {
    Node switchNode = IR.switchNode(
        IR.name("val"),
        IR.caseNode(IR.number(1), IR.block(IR.exprResult(IR.name("a")))),
        IR.defaultCase(IR.block(IR.exprResult(IR.name("b"))))
    );
    generator.add(switchNode);
    String out = consumer.getOutput();
    Assert.assertTrue(out.contains("switch(val){"));
    Assert.assertTrue(out.contains("case 1:a"));
    Assert.assertTrue(out.contains("default:b"));
  }

  @Test
  public void testAddNonEmptyStatement_preserveBlocksAndFunctionWrapping() {
    consumer.preserveExtraBlocks = true;
    Node emptyBlock = IR.block();
    Node ifNode = IR.ifNode(IR.name("x"), emptyBlock);
    generator.add(ifNode);
    Assert.assertTrue(consumer.getOutput().contains("{}"));

    TestCodeConsumer c2 = new TestCodeConsumer();
    c2.preserveExtraBlocks = false;
    CodeGenerator g2 = new CodeGenerator(c2, options);
    Node singleFnBlock = IR.block(IR.function(IR.name("fn"), IR.paramList(), IR.block()));
    Node ifNode2 = IR.ifNode(IR.name("y"), singleFnBlock);
    g2.add(ifNode2);
    Assert.assertTrue(c2.getOutput().contains("{function fn(){}\n}"));
  }

  @Test
  public void testInForInitClause_parenthesizesInOperator() {
    Node inNode = IR.in(IR.name("a"), IR.name("b"));
    Node for4 = IR.forNode(inNode, IR.name("c"), IR.name("d"), IR.block());
    generator.add(for4);
    Assert.assertTrue(consumer.getOutput().contains("for((a in b);c;d);"));
  }

  @Test
  public void testAddList_withLhsContext() {
    Node list = IR.name("a");
    list.addChildToBack(IR.name("b"));
    generator.addList(list);
    Assert.assertEquals("a,b", consumer.getOutput());
  }

  @Test(expected = Error.class)
  public void testUnknownNodeType_throwsError() {
    Node badNode = new Node(9999);
    generator.add(badNode);
  }

  @Test(expected = Error.class)
  public void testRegexpExpectedStrings_throwsError() {
    Node badRegexp = IR.regexp(IR.number(1));
    generator.add(badRegexp);
  }

  @Test(expected = Error.class)
  public void testMissingBlockChild_throwsError() {
    Node invalidIf = new Node(Token.IF, IR.name("cond"), IR.name("notBlock"));
    generator.add(invalidIf);
  }
}
