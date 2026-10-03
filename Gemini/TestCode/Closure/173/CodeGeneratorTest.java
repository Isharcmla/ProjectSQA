package com.google.javascript.jscomp;

import com.google.common.base.Charsets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class CodeGeneratorTest {

  private TestCodeConsumer consumer;
  private CompilerOptions options;
  private CodeGenerator generator;

  private static class TestCodeConsumer extends CodeConsumer {
    final StringBuilder buffer = new StringBuilder();
    boolean shouldContinue = true;
    boolean preserveExtraBlocks = false;
    boolean breakAfterBlock = false;

    @Override
    boolean continueProcessing() {
      return shouldContinue;
    }

    @Override
    char getLastChar() {
      return buffer.length() > 0 ? buffer.charAt(buffer.length() - 1) : '\0';
    }

    @Override
    void append(String str) {
      buffer.append(str);
    }

    @Override
    void appendOp(String op, boolean binOp) {
      buffer.append(op);
    }

    @Override
    boolean shouldPreserveExtraBlocks() {
      return preserveExtraBlocks;
    }

    @Override
    boolean breakAfterBlockFor(Node n, boolean statementContext) {
      return breakAfterBlock;
    }

    String getOutput() {
      return buffer.toString();
    }

    void clear() {
      buffer.setLength(0);
    }
  }

  @Before
  public void setUp() {
    consumer = new TestCodeConsumer();
    options = new CompilerOptions();
    options.setOutputCharset(Charsets.US_ASCII);
    options.setLanguageOut(CompilerOptions.LanguageMode.ECMASCRIPT5);
    generator = new CodeGenerator(consumer, options);
  }

  private String generate(Node node) {
    consumer.clear();
    generator.add(node);
    return consumer.getOutput();
  }

  private String generate(Node node, CodeGenerator.Context context) {
    consumer.clear();
    generator.add(node, context);
    return consumer.getOutput();
  }

  @Test
  public void testForCostEstimation_initialization() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(consumer);
    assertNotNull(cg);
    cg.add("var x = 1;");
    assertTrue(consumer.getOutput().contains("var x = 1;"));
  }

  @Test
  public void testTagAsStrict_appendsStrictDirective() {
    generator.tagAsStrict();
    assertEquals("'use strict';", consumer.getOutput());
  }

  @Test
  public void testContinueProcessingFalse_stopsExecution() {
    consumer.shouldContinue = false;
    Node num = Node.newNumber(42);
    generator.add(num);
    assertEquals("", consumer.getOutput());
  }

  @Test
  public void testIsSimpleNumber() {
    assertFalse(CodeGenerator.isSimpleNumber(""));
    assertFalse(CodeGenerator.isSimpleNumber("12a"));
    assertFalse(CodeGenerator.isSimpleNumber("0123"));
    assertTrue(CodeGenerator.isSimpleNumber("0"));
    assertTrue(CodeGenerator.isSimpleNumber("123456789"));
  }

  @Test
  public void testGetSimpleNumber() {
    assertEquals(0.0, CodeGenerator.getSimpleNumber("0"), 0.0001);
    assertEquals(12345.0, CodeGenerator.getSimpleNumber("12345"), 0.0001);
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("abc")));
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("999999999999999999999999999999")));
  }

  @Test
  public void testIdentifierEscape() {
    assertEquals("normal_name", CodeGenerator.identifierEscape("normal_name"));
    assertEquals("test\\u00a2name", CodeGenerator.identifierEscape("test\u00a2name"));
  }

  @Test
  public void testRegexpEscape() {
    String escaped = generator.regexpEscape("a/b</script><!-- -->]]>=&");
    assertTrue(escaped.startsWith("/"));
    assertTrue(escaped.endsWith("/"));
    assertTrue(escaped.contains("\\x3c/script"));
    assertTrue(escaped.contains("\\x3c!--"));
    assertTrue(escaped.contains("--\\x3e"));
    assertTrue(escaped.contains("]]\\x3e"));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString() {
    String escaped = generator.escapeToDoubleQuotedJsString("hello\n\"world\"");
    assertEquals("\"hello\\n\\\"world\\\"\"", escaped);
  }

  @Test
  public void testStringEscapes_variousCharacters() {
    options.trustedStrings = false;
    options.preferSingleQuotes = true;
    generator = new CodeGenerator(consumer, options);

    Node str = Node.newString("a\0b\u000Bc\u2028d\u2029e\bf\fg\rh\ti\\j'k\"l=m&n>o<p");
    generator.add(str);
    String out = consumer.getOutput();
    assertTrue(out.contains("\\x00"));
    assertTrue(out.contains("\\x0B"));
    assertTrue(out.contains("\\u2028"));
    assertTrue(out.contains("\\u2029"));
    assertTrue(out.contains("\\b"));
    assertTrue(out.contains("\\f"));
    assertTrue(out.contains("\\r"));
    assertTrue(out.contains("\\t"));
    assertTrue(out.contains("\\\\"));
    assertTrue(out.contains("\\'"));
    assertTrue(out.contains("\""));
    assertTrue(out.contains("\\x3d"));
    assertTrue(out.contains("\\x26"));
    assertTrue(out.contains("\\x3e"));
    assertTrue(out.contains("\\x3c"));
  }

  @Test
  public void testStringEscapes_slashVAndCustomCharset() {
    options.trustedStrings = true;
    options.preferSingleQuotes = false;
    options.setOutputCharset(Charset.forName("UTF-8"));
    generator = new CodeGenerator(consumer, options);

    Node str = Node.newString("test\u000B\uD834\uDD1E");
    str.putBooleanProp(Node.SLASH_V, true);
    generator.add(str);
    String out = consumer.getOutput();
    assertTrue(out.contains("\\v"));
  }

  @Test
  public void testBinaryOperators_associativeAndAssignment() {
    Node addChain = new Node(Token.ADD, new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2)), Node.newNumber(3));
    generator.add(addChain);
    assertTrue(consumer.getOutput().contains("1+2+3"));

    consumer.clear();
    Node assignChain = new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"),
        new Node(Token.ASSIGN, Node.newString(Token.NAME, "b"), Node.newNumber(1)));
    generator.add(assignChain);
    assertTrue(consumer.getOutput().contains("a=b=1"));

    consumer.clear();
    Node subChain = new Node(Token.SUB, new Node(Token.SUB, Node.newNumber(5), Node.newNumber(2)), Node.newNumber(1));
    generator.add(subChain);
    assertTrue(consumer.getOutput().contains("5-2-1"));
  }

  @Test(expected = IllegalStateException.class)
  public void testBinaryOperator_invalidChildCount_throws() {
    Node badAdd = new Node(Token.ADD, Node.newNumber(1));
    generator.add(badAdd);
  }

  @Test
  public void testTryCatchFinally() {
    Node tryBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1)));
    Node catchBlock = new Node(Token.BLOCK,
        new Node(Token.CATCH, Node.newString(Token.NAME, "e"),
            new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(2)))));
    Node finallyBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(3)));

    Node tryCatchFinally = new Node(Token.TRY, tryBody, catchBlock, finallyBlock);
    generator.add(tryCatchFinally);
    String out = consumer.getOutput();
    assertTrue(out.contains("try"));
    assertTrue(out.contains("catch(e)"));
    assertTrue(out.contains("finally"));

    consumer.clear();
    Node tryFinally = new Node(Token.TRY, tryBody, new Node(Token.BLOCK), finallyBlock);
    generator.add(tryFinally);
    out = consumer.getOutput();
    assertTrue(out.contains("try"));
    assertTrue(out.contains("finally"));
  }

  @Test
  public void testThrowAndReturn() {
    Node throwNode = new Node(Token.THROW, Node.newString(Token.NAME, "err"));
    generator.add(throwNode);
    assertTrue(consumer.getOutput().contains("throw err;"));

    consumer.clear();
    Node retVal = new Node(Token.RETURN, Node.newNumber(42));
    generator.add(retVal);
    assertTrue(consumer.getOutput().contains("return 42;"));

    consumer.clear();
    Node retEmpty = new Node(Token.RETURN);
    generator.add(retEmpty);
    assertTrue(consumer.getOutput().contains("return;"));
  }

  @Test
  public void testVarAndNameNodes() {
    Node name1 = Node.newString(Token.NAME, "x");
    name1.addChildToBack(Node.newNumber(10));
    Node name2 = Node.newString(Token.NAME, "y");
    Node comma = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
    name2.addChildToBack(comma);
    Node varNode = new Node(Token.VAR, name1, name2);

    generator.add(varNode);
    String out = consumer.getOutput();
    assertTrue(out.contains("var x=10,y=(1,2)"));

    consumer.clear();
    Node labelName = Node.newString(Token.LABEL_NAME, "lbl");
    generator.add(labelName);
    assertEquals("lbl", consumer.getOutput());
  }

  @Test
  public void testArrayLitAndParamList() {
    Node arr = new Node(Token.ARRAYLIT, Node.newNumber(1), new Node(Token.EMPTY), Node.newNumber(2), new Node(Token.EMPTY));
    generator.add(arr);
    assertTrue(consumer.getOutput().contains("[1,,2,,]"));

    consumer.clear();
    Node paramList = new Node(Token.PARAM_LIST, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    generator.add(paramList);
    assertTrue(consumer.getOutput().contains("(a,b)"));
  }

  @Test
  public void testUnaryOperators() {
    Node typeofNode = new Node(Token.TYPEOF, Node.newString(Token.NAME, "x"));
    assertEquals("typeof x", generate(typeofNode));

    Node voidNode = new Node(Token.VOID, Node.newNumber(0));
    assertEquals("void 0", generate(voidNode));

    Node notNode = new Node(Token.NOT, Node.newString(Token.NAME, "x"));
    assertEquals("!x", generate(notNode));

    Node bitNotNode = new Node(Token.BITNOT, Node.newString(Token.NAME, "x"));
    assertEquals("~x", generate(bitNotNode));

    Node posNode = new Node(Token.POS, Node.newString(Token.NAME, "x"));
    assertEquals("+x", generate(posNode));

    Node negNum = new Node(Token.NEG, Node.newNumber(5));
    assertEquals("-5", generate(negNum));

    Node negVar = new Node(Token.NEG, Node.newString(Token.NAME, "x"));
    assertEquals("-x", generate(negVar));
  }

  @Test
  public void testHookOperator() {
    Node hook = new Node(Token.HOOK, Node.newString(Token.NAME, "cond"), Node.newNumber(1), Node.newNumber(2));
    assertTrue(generate(hook).contains("cond?1:2"));
  }

  @Test
  public void testRegexpNode() {
    Node re1 = new Node(Token.REGEXP, Node.newString("abc"));
    assertEquals("/abc/", generate(re1));

    Node re2 = new Node(Token.REGEXP, Node.newString("abc"), Node.newString("gi"));
    assertEquals("/abc/gi", generate(re2));
  }

  @Test(expected = Error.class)
  public void testRegexpNode_nonStringChild_throws() {
    Node reBad = new Node(Token.REGEXP, Node.newNumber(123));
    generator.add(reBad);
  }

  @Test
  public void testFunctionNode() {
    Node fn = new Node(Token.FUNCTION,
        Node.newString(Token.NAME, "foo"),
        new Node(Token.PARAM_LIST, Node.newString(Token.NAME, "a")),
        new Node(Token.BLOCK));
    assertTrue(generate(fn, CodeGenerator.Context.START_OF_EXPR).startsWith("(function foo(a){})"));
    assertTrue(generate(fn, CodeGenerator.Context.STATEMENT).startsWith("function foo(a){}"));
  }

  @Test
  public void testGettersAndSetters() {
    Node obj = new Node(Token.OBJECTLIT);

    Node getterFn = new Node(Token.FUNCTION,
        Node.newString(Token.NAME, ""),
        new Node(Token.PARAM_LIST),
        new Node(Token.BLOCK));
    Node getter = Node.newString(Token.GETTER_DEF, "prop");
    getter.addChildToBack(getterFn);
    obj.addChildToBack(getter);

    Node setterFn = new Node(Token.FUNCTION,
        Node.newString(Token.NAME, ""),
        new Node(Token.PARAM_LIST, Node.newString(Token.NAME, "val")),
        new Node(Token.BLOCK));
    Node setter = Node.newString(Token.SETTER_DEF, "123");
    setter.addChildToBack(setterFn);
    obj.addChildToBack(setter);

    Node setterQuoted = Node.newString(Token.SETTER_DEF, "non-latin\u00a2");
    setterQuoted.setQuotedString();
    setterQuoted.addChildToBack(setterFn.cloneTree());
    obj.addChildToBack(setterQuoted);

    generator.add(obj);
    String out = consumer.getOutput();
    assertTrue(out.contains("get prop()"));
    assertTrue(out.contains("set 123(val)"));
    assertTrue(out.contains("set \"non-latin\\u00a2\"(val)"));
  }

  @Test
  public void testScriptAndBlock() {
    Node script = new Node(Token.SCRIPT,
        new Node(Token.VAR, Node.newString(Token.NAME, "a")),
        new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK)));
    assertTrue(generate(script).contains("var a;"));

    Node block = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1)));
    assertTrue(generate(block, CodeGenerator.Context.PRESERVE_BLOCK).contains("{1;}"));
  }

  @Test
  public void testForLoops() {
    Node for4 = new Node(Token.FOR,
        new Node(Token.VAR, Node.newString(Token.NAME, "i")),
        new Node(Token.NAME, "i"),
        new Node(Token.INC, Node.newString(Token.NAME, "i")),
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1))));
    assertTrue(generate(for4).contains("for(var i;i;i++)"));

    Node forExpr = new Node(Token.FOR,
        Node.newString(Token.NAME, "i"),
        Node.newString(Token.NAME, "i"),
        new Node(Token.INC, Node.newString(Token.NAME, "i")),
        new Node(Token.BLOCK));
    assertTrue(generate(forExpr).contains("for(i;i;i;)"));

    Node forIn = new Node(Token.FOR,
        Node.newString(Token.NAME, "k"),
        Node.newString(Token.NAME, "obj"),
        new Node(Token.BLOCK));
    assertTrue(generate(forIn).contains("for(k in obj)"));
  }

  @Test
  public void testDoWhileLoops() {
    Node doNode = new Node(Token.DO,
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1))),
        Node.newString(Token.NAME, "cond"));
    assertTrue(generate(doNode).contains("do 1;while(cond);"));

    Node whileNode = new Node(Token.WHILE,
        Node.newString(Token.NAME, "cond"),
        new Node(Token.BLOCK));
    assertTrue(generate(whileNode).contains("while(cond);"));
  }

  @Test
  public void testGetPropAndGetElem() {
    Node getProp1 = new Node(Token.GETPROP, Node.newNumber(5), Node.newString("toString"));
    assertTrue(generate(getProp1).contains("(5).toString"));

    options.setLanguageOut(CompilerOptions.LanguageMode.ECMASCRIPT3);
    generator = new CodeGenerator(consumer, options);
    Node getPropEs3 = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString("delete"));
    assertTrue(generate(getPropEs3).contains("obj[\"delete\"]"));

    Node getElem = new Node(Token.GETELEM, Node.newString(Token.NAME, "arr"), Node.newNumber(0));
    assertTrue(generate(getElem).contains("arr[0]"));
  }

  @Test
  public void testWithAndIncDec() {
    Node withNode = new Node(Token.WITH,
        Node.newString(Token.NAME, "scope"),
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1))));
    assertTrue(generate(withNode).contains("with(scope)1;"));

    Node preInc = new Node(Token.INC, Node.newString(Token.NAME, "x"));
    assertEquals("++x", generate(preInc));

    Node postDec = new Node(Token.DEC, Node.newString(Token.NAME, "x"));
    postDec.putIntProp(Node.INCRDECR_PROP, 1);
    assertEquals("x--", generate(postDec));
  }

  @Test
  public void testCalls_directEvalIndirectEvalAndFreeCall() {
    Node directEval = new Node(Token.CALL, Node.newString(Token.NAME, "eval"), Node.newString("1"));
    directEval.putBooleanProp(Node.DIRECT_EVAL, true);
    assertEquals("eval(\"1\")", generate(directEval));

    Node indirectEval = new Node(Token.CALL, Node.newString(Token.NAME, "eval"), Node.newString("1"));
    assertEquals("(0,eval)(\"1\")", generate(indirectEval));

    Node freeCall = new Node(Token.CALL,
        new Node(Token.GETPROP, Node.newString(Token.NAME, "foo"), Node.newString("bar")),
        Node.newNumber(1));
    freeCall.putBooleanProp(Node.FREE_CALL, true);
    assertEquals("(0,foo.bar)(1)", generate(freeCall));
  }

  @Test
  public void testIfElseStatements() {
    Node ifOnly = new Node(Token.IF,
        Node.newString(Token.NAME, "c"),
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1))));
    assertTrue(generate(ifOnly).contains("if(c)1;"));

    Node ifElse = new Node(Token.IF,
        Node.newString(Token.NAME, "c"),
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1))),
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(2))));
    assertTrue(generate(ifElse).contains("if(c)1;else 2;"));

    assertTrue(generate(ifOnly, CodeGenerator.Context.BEFORE_DANGLING_ELSE).contains("{if(c)1;}"));
  }

  @Test
  public void testConstantsAndKeywords() {
    assertEquals("null", generate(new Node(Token.NULL)));
    assertEquals("this", generate(new Node(Token.THIS)));
    assertEquals("false", generate(new Node(Token.FALSE)));
    assertEquals("true", generate(new Node(Token.TRUE)));
    assertEquals("debugger;", generate(new Node(Token.DEBUGGER)));
    assertEquals("", generate(new Node(Token.EMPTY)));
  }

  @Test
  public void testBreakAndContinue() {
    assertEquals("continue;", generate(new Node(Token.CONTINUE)));
    assertEquals("continue lbl;", generate(new Node(Token.CONTINUE, Node.newString(Token.LABEL_NAME, "lbl"))));
    assertEquals("break;", generate(new Node(Token.BREAK)));
    assertEquals("break lbl;", generate(new Node(Token.BREAK, Node.newString(Token.LABEL_NAME, "lbl"))));
  }

  @Test
  public void testNewNode() {
    Node newSimple = new Node(Token.NEW, Node.newString(Token.NAME, "Foo"));
    assertEquals("new Foo", generate(newSimple));

    Node newWithArgs = new Node(Token.NEW, Node.newString(Token.NAME, "Foo"), Node.newNumber(1));
    assertEquals("new Foo(1)", generate(newWithArgs));

    Node callTarget = new Node(Token.CALL, Node.newString(Token.NAME, "getConstructor"));
    Node newCall = new Node(Token.NEW, callTarget, Node.newNumber(1));
    assertTrue(generate(newCall).contains("new (getConstructor())(1)"));
  }

  @Test
  public void testObjectLit() {
    Node key1 = Node.newString(Token.STRING_KEY, "k1");
    key1.addChildToBack(Node.newNumber(1));

    Node key2 = Node.newString(Token.STRING_KEY, "123");
    key2.addChildToBack(Node.newNumber(2));

    Node key3 = Node.newString(Token.STRING_KEY, "quoted-key");
    key3.setQuotedString();
    key3.addChildToBack(Node.newNumber(3));

    Node obj = new Node(Token.OBJECTLIT, key1, key2, key3);
    String out = generate(obj, CodeGenerator.Context.START_OF_EXPR);
    assertTrue(out.startsWith("({"));
    assertTrue(out.endsWith("})"));
    assertTrue(out.contains("k1:1"));
    assertTrue(out.contains("123:2"));
    assertTrue(out.contains("\"quoted-key\":3"));
  }

  @Test
  public void testDelPropCastAndLabel() {
    Node del = new Node(Token.DELPROP, new Node(Token.GETPROP, Node.newString(Token.NAME, "o"), Node.newString("p")));
    assertTrue(generate(del).contains("delete o.p"));

    Node cast = new Node(Token.CAST, Node.newNumber(42));
    assertEquals("(42)", generate(cast));

    Node label = new Node(Token.LABEL,
        Node.newString(Token.LABEL_NAME, "myLabel"),
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1))));
    assertTrue(generate(label).contains("myLabel:1;"));
  }

  @Test
  public void testSwitchCaseDefault() {
    Node case1 = new Node(Token.CASE, Node.newNumber(1), new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(10))));
    Node def = new Node(Token.DEFAULT_CASE, new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(20))));
    Node sw = new Node(Token.SWITCH, Node.newString(Token.NAME, "x"), case1, def);

    generator.add(sw, CodeGenerator.Context.STATEMENT);
    String out = consumer.getOutput();
    assertTrue(out.contains("switch(x){"));
    assertTrue(out.contains("case 1:10;"));
    assertTrue(out.contains("default:20;"));
  }

  @Test
  public void testAddListAndAddAllSiblings() {
    Node a = Node.newNumber(1);
    Node b = Node.newNumber(2);
    a.setNext(b);

    generator.addList(a);
    assertTrue(consumer.getOutput().contains("1,2"));

    consumer.clear();
    generator.addAllSiblings(a);
    assertTrue(consumer.getOutput().contains("12"));
  }

  @Test
  public void testAddNonEmptyStatement_specialCases() {
    consumer.preserveExtraBlocks = true;
    Node emptyBlock = new Node(Token.BLOCK);
    Node whileLoop = new Node(Token.WHILE, Node.newString(Token.NAME, "c"), emptyBlock);
    generator.add(whileLoop);
    assertTrue(consumer.getOutput().contains("{}"));

    consumer.clear();
    consumer.preserveExtraBlocks = false;
    Node fnChild = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    Node blockWithFn = new Node(Token.BLOCK, fnChild);
    Node ifWithFn = new Node(Token.IF, Node.newString(Token.NAME, "c"), blockWithFn);
    generator.add(ifWithFn);
    assertTrue(consumer.getOutput().contains("{function f(){}"));

    consumer.clear();
    Node doChild = new Node(Token.DO, new Node(Token.BLOCK), Node.newString(Token.NAME, "c"));
    Node labelWithDo = new Node(Token.LABEL, Node.newString(Token.LABEL_NAME, "lbl"), doChild);
    Node blockWithLabel = new Node(Token.BLOCK, labelWithDo);
    Node ifWithLabel = new Node(Token.IF, Node.newString(Token.NAME, "c"), blockWithLabel);
    generator.add(ifWithLabel);
    assertTrue(consumer.getOutput().contains("{lbl:do;while(c);}"));
  }

  @Test(expected = Error.class)
  public void testAdd_unknownNodeType_throws() {
    Node unknownNode = new Node(Token.LAST_TOKEN + 100);
    generator.add(unknownNode);
  }

  @Test(expected = Error.class)
  public void testAddNonEmptyStatement_nonBlockChild_throws() {
    Node badWhile = new Node(Token.WHILE, Node.newString(Token.NAME, "c"), Node.newNumber(1));
    generator.add(badWhile);
  }
}
