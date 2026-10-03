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
    private char lastChar = '\0';
    boolean continueProc = true;
    boolean preserveExtraBlocks = false;

    @Override
    char getLastChar() {
      return lastChar;
    }

    @Override
    void append(String str) {
      buffer.append(str);
      if (str.length() > 0) {
        lastChar = str.charAt(str.length() - 1);
      }
    }

    @Override
    boolean continueProcessing() {
      return continueProc;
    }

    @Override
    boolean shouldPreserveExtraBlocks() {
      return preserveExtraBlocks;
    }

    @Override
    boolean breakAfterBlockFor(Node n, boolean statementContext) {
      return false;
    }

    String getCode() {
      return buffer.toString();
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
  public void testTagAsStrict_normal_addsUseStrict() {
    generator.tagAsStrict();
    Assert.assertEquals("'use strict';", consumer.getCode());
  }

  @Test
  public void testConstructor_withCustomCharsetEncoder_initializesCorrectly() {
    CodeGenerator cg = new CodeGenerator(consumer, Charsets.UTF_8);
    cg.add("test");
    Assert.assertEquals("test", consumer.getCode());
  }

  @Test
  public void testConstructor_withAsciiCharset_initializesCorrectly() {
    CodeGenerator cg = new CodeGenerator(consumer, Charsets.US_ASCII);
    cg.add("ascii");
    Assert.assertEquals("ascii", consumer.getCode());
  }

  @Test
  public void testAdd_whenContinueProcessingIsFalse_doesNothing() {
    consumer.continueProc = false;
    Node node = Node.newNumber(10);
    generator.add(node);
    Assert.assertEquals("", consumer.getCode());
  }

  @Test
  public void testIsSimpleNumber_validAndInvalidCases() {
    Assert.assertTrue(CodeGenerator.isSimpleNumber("123"));
    Assert.assertTrue(CodeGenerator.isSimpleNumber("0"));
    Assert.assertFalse(CodeGenerator.isSimpleNumber(""));
    Assert.assertFalse(CodeGenerator.isSimpleNumber("12a"));
    Assert.assertFalse(CodeGenerator.isSimpleNumber("-1"));
    Assert.assertFalse(CodeGenerator.isSimpleNumber("1.5"));
  }

  @Test
  public void testGetSimpleNumber_variousInputs() {
    Assert.assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.001);
    Assert.assertEquals(0.0, CodeGenerator.getSimpleNumber("0"), 0.001);
    Assert.assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("")));
    Assert.assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("abc")));
    Assert.assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("99999999999999999999999999999999")));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_variousCharacters() {
    String escaped = CodeGenerator.escapeToDoubleQuotedJsString("hello \"world\"\n\r\t\0\\");
    Assert.assertEquals("\"hello \\\"world\\\"\\n\\r\\t\\x00\\\\\"", escaped);
  }

  @Test
  public void testRegexpEscape_defaultAndCustomEncoder() {
    String escaped1 = CodeGenerator.regexpEscape("a/b\\c");
    Assert.assertEquals("/a/b\\c/", escaped1);

    CharsetEncoder encoder = Charsets.UTF_8.newEncoder();
    String escaped2 = CodeGenerator.regexpEscape("hello/world", encoder);
    Assert.assertEquals("/hello/world/", escaped2);
  }

  @Test
  public void testIdentifierEscape_latinAndNonLatin() {
    Assert.assertEquals("simpleIdent", CodeGenerator.identifierEscape("simpleIdent"));
    String nonLatin = CodeGenerator.identifierEscape("var_\u00F9");
    Assert.assertEquals("var_\\u00f9", nonLatin);
  }

  @Test
  public void testStrEscape_htmlAndCommentTags() {
    String escapedComment = CodeGenerator.escapeToDoubleQuotedJsString("<!--");
    Assert.assertEquals("\"<\\!--\"", escapedComment);

    String escapedScript = CodeGenerator.escapeToDoubleQuotedJsString("</script>");
    Assert.assertEquals("\"<\\/script>\"", escapedScript);

    String escapedEndComment = CodeGenerator.escapeToDoubleQuotedJsString("-->");
    Assert.assertEquals("\"--\\>\"", escapedEndComment);

    String escapedCdata = CodeGenerator.escapeToDoubleQuotedJsString("]]>");
    Assert.assertEquals("\"]]\\>\"", escapedCdata);
  }

  @Test
  public void testStrEscape_supplementaryCharacters() {
    // Code point 0x1F600 (Grinning Face emoji)
    String emoji = new String(Character.toChars(0x1F600));
    String escaped = CodeGenerator.escapeToDoubleQuotedJsString(emoji);
    Assert.assertEquals("\"\\ud83d\\ude00\"", escaped);
  }

  @Test
  public void testAddJsString_cachingAndQuotesSelection() {
    // More single quotes than double quotes => wrap in double quotes
    generator.addJsString("say 'hello' & 'world'");
    Assert.assertEquals("\"say 'hello' & 'world'\"", consumer.getCode());

    // Caching check
    consumer.buffer.setLength(0);
    generator.addJsString("say 'hello' & 'world'");
    Assert.assertEquals("\"say 'hello' & 'world'\"", consumer.getCode());

    // More double quotes than single quotes => wrap in single quotes
    consumer.buffer.setLength(0);
    generator.addJsString("say \"hello\" and \"world\"");
    Assert.assertEquals("'say \"hello\" and \"world\"'", consumer.getCode());
  }

  @Test
  public void testAdd_numberNode() {
    Node node = Node.newNumber(42.5);
    generator.add(node);
    Assert.assertEquals("42.5", consumer.getCode());
  }

  @Test
  public void testAdd_stringNode() {
    Node node = Node.newString("hello");
    generator.add(node);
    Assert.assertEquals("\"hello\"", consumer.getCode());
  }

  @Test
  public void testAdd_stringNodeWithUnexpectedChildren_throwsException() {
    Node node = Node.newString("hello");
    node.addChildToBack(Node.newString("child"));
    try {
      generator.add(node);
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      // expected
    }
  }

  @Test
  public void testAdd_nameNode_withoutInit() {
    Node node = Node.newString(Token.NAME, "foo");
    generator.add(node);
    Assert.assertEquals("foo", consumer.getCode());
  }

  @Test
  public void testAdd_nameNode_withEmptyInit() {
    Node node = Node.newString(Token.NAME, "foo");
    node.addChildToBack(new Node(Token.EMPTY));
    generator.add(node);
    Assert.assertEquals("foo", consumer.getCode());
  }

  @Test
  public void testAdd_nameNode_withInitValue() {
    Node node = Node.newString(Token.NAME, "foo");
    node.addChildToBack(Node.newNumber(1));
    generator.add(node);
    Assert.assertEquals("foo=1", consumer.getCode());
  }

  @Test
  public void testAdd_nameNode_withCommaInit() {
    Node node = Node.newString(Token.NAME, "foo");
    Node comma = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
    node.addChildToBack(comma);
    generator.add(node);
    Assert.assertEquals("foo=(1,2)", consumer.getCode());
  }

  @Test
  public void testAdd_binaryOperator_associativity() {
    // a + (b + c) -> a + b + c
    Node plusInner = new Node(Token.ADD, Node.newString(Token.NAME, "b"), Node.newString(Token.NAME, "c"));
    Node plusOuter = new Node(Token.ADD, Node.newString(Token.NAME, "a"), plusInner);
    generator.add(plusOuter);
    Assert.assertEquals("a+b+c", consumer.getCode());
  }

  @Test
  public void testAdd_binaryOperator_assignmentRightAssociativity() {
    // a = b = 1
    Node assignInner = new Node(Token.ASSIGN, Node.newString(Token.NAME, "b"), Node.newNumber(1));
    Node assignOuter = new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"), assignInner);
    generator.add(assignOuter);
    Assert.assertEquals("a=b=1", consumer.getCode());
  }

  @Test
  public void testAdd_binaryOperator_differentPrecedence() {
    // a * (b + c)
    Node add = new Node(Token.ADD, Node.newString(Token.NAME, "b"), Node.newString(Token.NAME, "c"));
    Node mul = new Node(Token.MUL, Node.newString(Token.NAME, "a"), add);
    generator.add(mul);
    Assert.assertEquals("a*(b+c)", consumer.getCode());
  }

  @Test
  public void testAdd_unaryOperators() {
    Node typeofNode = new Node(Token.TYPEOF, Node.newString(Token.NAME, "x"));
    generator.add(typeofNode);
    Assert.assertEquals("typeof x", consumer.getCode());

    consumer.buffer.setLength(0);
    Node voidNode = new Node(Token.VOID, Node.newNumber(0));
    generator.add(voidNode);
    Assert.assertEquals("void 0", consumer.getCode());

    consumer.buffer.setLength(0);
    Node notNode = new Node(Token.NOT, Node.newString(Token.NAME, "x"));
    generator.add(notNode);
    Assert.assertEquals("!x", consumer.getCode());

    consumer.buffer.setLength(0);
    Node bitnotNode = new Node(Token.BITNOT, Node.newString(Token.NAME, "x"));
    generator.add(bitnotNode);
    Assert.assertEquals("~x", consumer.getCode());

    consumer.buffer.setLength(0);
    Node posNode = new Node(Token.POS, Node.newString(Token.NAME, "x"));
    generator.add(posNode);
    Assert.assertEquals("+x", consumer.getCode());
  }

  @Test
  public void testAdd_negationOperator_numberAndExpr() {
    Node negNum = new Node(Token.NEG, Node.newNumber(5));
    generator.add(negNum);
    Assert.assertEquals("-5", consumer.getCode());

    consumer.buffer.setLength(0);
    Node negVar = new Node(Token.NEG, Node.newString(Token.NAME, "x"));
    generator.add(negVar);
    Assert.assertEquals("-x", consumer.getCode());
  }

  @Test
  public void testAdd_hookOperator() {
    Node hook = new Node(Token.HOOK,
        Node.newString(Token.NAME, "a"),
        Node.newString(Token.NAME, "b"),
        Node.newString(Token.NAME, "c"));
    generator.add(hook);
    Assert.assertEquals("a?b:c", consumer.getCode());
  }

  @Test
  public void testAdd_arrayLit_emptyAndMultiple() {
    Node array = new Node(Token.ARRAYLIT);
    generator.add(array);
    Assert.assertEquals("[]", consumer.getCode());

    consumer.buffer.setLength(0);
    Node array2 = new Node(Token.ARRAYLIT,
        new Node(Token.EMPTY),
        Node.newNumber(1),
        new Node(Token.EMPTY));
    generator.add(array2);
    Assert.assertEquals("[,1,,]", consumer.getCode());
  }

  @Test
  public void testAdd_parenthesizedExpression() {
    Node lp = new Node(Token.LP, Node.newNumber(1), Node.newNumber(2));
    generator.add(lp);
    Assert.assertEquals("(1,2)", consumer.getCode());
  }

  @Test
  public void testAdd_commaOperator() {
    Node comma = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
    generator.add(comma);
    Assert.assertEquals("1,2", consumer.getCode());
  }

  @Test
  public void testAdd_varStatement() {
    Node name1 = Node.newString(Token.NAME, "x");
    name1.addChildToBack(Node.newNumber(1));
    Node name2 = Node.newString(Token.NAME, "y");
    Node varNode = new Node(Token.VAR, name1, name2);

    generator.add(varNode);
    Assert.assertEquals("var x=1,y", consumer.getCode());
  }

  @Test
  public void testAdd_functionDeclarationAndExpression() {
    Node name = Node.newString(Token.NAME, "f");
    Node params = new Node(Token.LP);
    Node body = new Node(Token.BLOCK);
    Node fn = new Node(Token.FUNCTION, name, params, body);

    generator.add(fn, CodeGenerator.Context.STATEMENT);
    Assert.assertEquals("function f(){}", consumer.getCode());

    consumer.buffer.setLength(0);
    generator.add(fn, CodeGenerator.Context.START_OF_EXPR);
    Assert.assertEquals("(function f(){})", consumer.getCode());
  }

  @Test
  public void testAdd_getAndSetInObjectLit() {
    Node objLit = new Node(Token.OBJECTLIT);

    // Getter: get a() { return 1; }
    Node fnGet = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    Node getNode = new Node(Token.GET, fnGet);
    getNode.setString("a");
    objLit.addChildToBack(getNode);

    // Setter: set b(val) { }
    Node paramVal = Node.newString(Token.NAME, "val");
    Node fnSet = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP, paramVal), new Node(Token.BLOCK));
    Node setNode = new Node(Token.SET, fnSet);
    setNode.setString("b");
    objLit.addChildToBack(setNode);

    generator.add(objLit);
    Assert.assertEquals("{get a(){},set b(val){}}", consumer.getCode());
  }

  @Test
  public void testAdd_objectLit_keysHandling() {
    Node objLit = new Node(Token.OBJECTLIT);

    // Ident key
    Node key1 = Node.newString("foo");
    key1.addChildToBack(Node.newNumber(1));
    objLit.addChildToBack(key1);

    // Numeric key
    Node key2 = Node.newString("123");
    key2.addChildToBack(Node.newNumber(2));
    objLit.addChildToBack(key2);

    // Quoted / Keyword key
    Node key3 = Node.newString("default");
    key3.setQuotedString();
    key3.addChildToBack(Node.newNumber(3));
    objLit.addChildToBack(key3);

    generator.add(objLit, CodeGenerator.Context.START_OF_EXPR);
    Assert.assertEquals("({foo:1,123:2,\"default\":3})", consumer.getCode());
  }

  @Test
  public void testAdd_tryCatchFinally() {
    Node tryBlock = new Node(Token.BLOCK);
    Node catchParam = Node.newString(Token.NAME, "e");
    Node catchBody = new Node(Token.BLOCK);
    Node catchNode = new Node(Token.CATCH, catchParam, catchBody);
    Node catchHolder = new Node(Token.BLOCK, catchNode);
    Node finallyBlock = new Node(Token.BLOCK);

    Node tryCatchFinally = new Node(Token.TRY, tryBlock, catchHolder, finallyBlock);
    generator.add(tryCatchFinally);
    Assert.assertEquals("try{}catch(e){}finally{}", consumer.getCode());
  }

  @Test
  public void testAdd_throwAndReturnStatements() {
    Node throwNode = new Node(Token.THROW, Node.newString(Token.NAME, "e"));
    generator.add(throwNode);
    Assert.assertEquals("throw e;", consumer.getCode());

    consumer.buffer.setLength(0);
    Node returnNode = new Node(Token.RETURN, Node.newNumber(10));
    generator.add(returnNode);
    Assert.assertEquals("return 10;", consumer.getCode());

    consumer.buffer.setLength(0);
    Node emptyReturn = new Node(Token.RETURN);
    generator.add(emptyReturn);
    Assert.assertEquals("return;", consumer.getCode());
  }

  @Test
  public void testAdd_forLoop_standardAndForIn() {
    // for(var i = 0; i < 10; i++) {}
    Node varName = Node.newString(Token.NAME, "i");
    varName.addChildToBack(Node.newNumber(0));
    Node varNode = new Node(Token.VAR, varName);
    Node cond = new Node(Token.LT, Node.newString(Token.NAME, "i"), Node.newNumber(10));
    Node inc = new Node(Token.INC, Node.newString(Token.NAME, "i"));
    Node body = new Node(Token.BLOCK);

    Node forNode = new Node(Token.FOR, varNode, cond, inc, body);
    generator.add(forNode);
    Assert.assertEquals("for(var i=0;i<10;++i);", consumer.getCode());

    // for(x in y) {}
    consumer.buffer.setLength(0);
    Node forIn = new Node(Token.FOR,
        Node.newString(Token.NAME, "x"),
        Node.newString(Token.NAME, "y"),
        new Node(Token.BLOCK));
    generator.add(forIn);
    Assert.assertEquals("for(x in y);", consumer.getCode());
  }

  @Test
  public void testAdd_doWhileAndWhileLoop() {
    Node doBody = new Node(Token.BLOCK);
    Node doCond = Node.newString(Token.NAME, "cond");
    Node doNode = new Node(Token.DO, doBody, doCond);
    generator.add(doNode);
    Assert.assertEquals("do;while(cond);", consumer.getCode());

    consumer.buffer.setLength(0);
    Node whileNode = new Node(Token.WHILE, Node.newString(Token.NAME, "cond"), new Node(Token.BLOCK));
    generator.add(whileNode);
    Assert.assertEquals("while(cond);", consumer.getCode());
  }

  @Test
  public void testAdd_getpropAndGetelem() {
    // (1).toString
    Node getpropNum = new Node(Token.GETPROP, Node.newNumber(1), Node.newString("toString"));
    generator.add(getpropNum);
    Assert.assertEquals("(1).toString", consumer.getCode());

    // a[b]
    consumer.buffer.setLength(0);
    Node getelem = new Node(Token.GETELEM, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    generator.add(getelem);
    Assert.assertEquals("a[b]", consumer.getCode());
  }

  @Test
  public void testAdd_withStatement() {
    Node withNode = new Node(Token.WITH, Node.newString(Token.NAME, "obj"), new Node(Token.BLOCK));
    generator.add(withNode);
    Assert.assertEquals("with(obj);", consumer.getCode());
  }

  @Test
  public void testAdd_incrementDecrement_preAndPost() {
    // ++i
    Node preInc = new Node(Token.INC, Node.newString(Token.NAME, "i"));
    preInc.putIntProp(Node.INCRDECR_PROP, 0);
    generator.add(preInc);
    Assert.assertEquals("++i", consumer.getCode());

    // i++
    consumer.buffer.setLength(0);
    Node postInc = new Node(Token.INC, Node.newString(Token.NAME, "i"));
    postInc.putIntProp(Node.INCRDECR_PROP, 1);
    generator.add(postInc);
    Assert.assertEquals("i++", consumer.getCode());

    // --i
    consumer.buffer.setLength(0);
    Node preDec = new Node(Token.DEC, Node.newString(Token.NAME, "i"));
    preDec.putIntProp(Node.INCRDECR_PROP, 0);
    generator.add(preDec);
    Assert.assertEquals("--i", consumer.getCode());

    // i--
    consumer.buffer.setLength(0);
    Node postDec = new Node(Token.DEC, Node.newString(Token.NAME, "i"));
    postDec.putIntProp(Node.INCRDECR_PROP, 1);
    generator.add(postDec);
    Assert.assertEquals("i--", consumer.getCode());
  }

  @Test
  public void testAdd_call_directAndIndirectEvalAndFreeCall() {
    // eval(x) with direct eval
    Node directEvalName = Node.newString(Token.NAME, "eval");
    directEvalName.putBooleanProp(Node.DIRECT_EVAL, true);
    Node directCall = new Node(Token.CALL, directEvalName, Node.newString(Token.NAME, "x"));
    generator.add(directCall);
    Assert.assertEquals("eval(x)", consumer.getCode());

    // eval(x) indirect
    consumer.buffer.setLength(0);
    Node indirectEvalName = Node.newString(Token.NAME, "eval");
    Node indirectCall = new Node(Token.CALL, indirectEvalName, Node.newString(Token.NAME, "x"));
    generator.add(indirectCall);
    Assert.assertEquals("(0,eval)(x)", consumer.getCode());

    // obj.fn() free call
    consumer.buffer.setLength(0);
    Node propRef = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString("fn"));
    Node freeCall = new Node(Token.CALL, propRef);
    freeCall.putBooleanProp(Node.FREE_CALL, true);
    generator.add(freeCall);
    Assert.assertEquals("(0,obj.fn)()", consumer.getCode());
  }

  @Test
  public void testAdd_ifElse_andDanglingElseAmbiguity() {
    // if(a) if(b) c; else d;
    Node ifInner = new Node(Token.IF,
        Node.newString(Token.NAME, "b"),
        new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "c")),
        new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "d")));
    Node ifOuter = new Node(Token.IF,
        Node.newString(Token.NAME, "a"),
        new Node(Token.BLOCK, ifInner));

    generator.add(ifOuter, CodeGenerator.Context.STATEMENT);
    Assert.assertEquals("if(a)if(b)c;else d;", consumer.getCode());
  }

  @Test
  public void testAdd_literalsAndSimpleStatements() {
    generator.add(new Node(Token.NULL));
    generator.add(new Node(Token.THIS));
    generator.add(new Node(Token.FALSE));
    generator.add(new Node(Token.TRUE));
    generator.add(new Node(Token.DEBUGGER));
    Assert.assertEquals("nullthisfalsetruedebugger;", consumer.getCode());
  }

  @Test
  public void testAdd_breakAndContinue_withAndWithoutLabel() {
    generator.add(new Node(Token.BREAK));
    Assert.assertEquals("break;", consumer.getCode());

    consumer.buffer.setLength(0);
    Node labelName = Node.newString(Token.LABEL_NAME, "lbl");
    generator.add(new Node(Token.BREAK, labelName));
    Assert.assertEquals("break lbl;", consumer.getCode());

    consumer.buffer.setLength(0);
    generator.add(new Node(Token.CONTINUE));
    Assert.assertEquals("continue;", consumer.getCode());

    consumer.buffer.setLength(0);
    Node labelName2 = Node.newString(Token.LABEL_NAME, "lbl2");
    generator.add(new Node(Token.CONTINUE, labelName2));
    Assert.assertEquals("continue lbl2;", consumer.getCode());
  }

  @Test
  public void testAdd_newOperator_withAndWithoutArgs() {
    // new Foo
    Node newWithoutArgs = new Node(Token.NEW, Node.newString(Token.NAME, "Foo"));
    generator.add(newWithoutArgs);
    Assert.assertEquals("new Foo", consumer.getCode());

    // new Foo(1, 2)
    consumer.buffer.setLength(0);
    Node newWithArgs = new Node(Token.NEW, Node.newString(Token.NAME, "Foo"), Node.newNumber(1), Node.newNumber(2));
    generator.add(newWithArgs);
    Assert.assertEquals("new Foo(1,2)", consumer.getCode());

    // new (getFn())()
    consumer.buffer.setLength(0);
    Node callTarget = new Node(Token.CALL, Node.newString(Token.NAME, "getFn"));
    Node newWithCall = new Node(Token.NEW, callTarget, Node.newNumber(1));
    generator.add(newWithCall);
    Assert.assertEquals("new (getFn())(1)", consumer.getCode());
  }

  @Test
  public void testAdd_delprop() {
    Node del = new Node(Token.DELPROP, Node.newString(Token.NAME, "x"));
    generator.add(del);
    Assert.assertEquals("delete x", consumer.getCode());
  }

  @Test
  public void testAdd_switchCaseDefault() {
    Node switchVal = Node.newString(Token.NAME, "x");
    Node case1 = new Node(Token.CASE, Node.newNumber(1), new Node(Token.BLOCK));
    Node def = new Node(Token.DEFAULT, new Node(Token.BLOCK));
    Node switchNode = new Node(Token.SWITCH, switchVal, case1, def);

    generator.add(switchNode, CodeGenerator.Context.STATEMENT);
    Assert.assertEquals("switch(x){case 1:default:}", consumer.getCode());
  }

  @Test
  public void testAdd_labelStatement() {
    Node labelName = Node.newString(Token.LABEL_NAME, "myLabel");
    Node labelBody = new Node(Token.BLOCK);
    Node label = new Node(Token.LABEL, labelName, labelBody);

    generator.add(label);
    Assert.assertEquals("myLabel:;", consumer.getCode());
  }

  @Test
  public void testAdd_getRefAndRefSpecial() {
    Node getRef = new Node(Token.GET_REF, Node.newString(Token.NAME, "target"));
    generator.add(getRef);
    Assert.assertEquals("target", consumer.getCode());

    consumer.buffer.setLength(0);
    Node refSpecial = new Node(Token.REF_SPECIAL, Node.newString(Token.NAME, "target"));
    refSpecial.putProp(Node.NAME_PROP, "specialProp");
    generator.add(refSpecial);
    Assert.assertEquals("target.specialProp", consumer.getCode());
  }

  @Test
  public void testAdd_regexpNode() {
    Node pattern = Node.newString("abc");
    Node flags = Node.newString("g");
    Node regex = new Node(Token.REGEXP, pattern, flags);
    generator.add(regex);
    Assert.assertEquals("/abc/g", consumer.getCode());
  }

  @Test(expected = Error.class)
  public void testAdd_exprVoid_throwsError() {
    generator.add(new Node(Token.EXPR_VOID));
  }

  @Test
  public void testAdd_inForInitClause_withInOperator_addsParens() {
    // var a = (b in c);
    Node inNode = new Node(Token.IN, Node.newString(Token.NAME, "b"), Node.newString(Token.NAME, "c"));
    Node name = Node.newString(Token.NAME, "a");
    name.addChildToBack(inNode);
    Node varNode = new Node(Token.VAR, name);
    Node forNode = new Node(Token.FOR, varNode, new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.BLOCK));

    generator.add(forNode);
    Assert.assertEquals("for(var a=(b in c);;);", consumer.getCode());
  }

  @Test
  public void testAddList_andAddAllSiblings() {
    Node n1 = Node.newNumber(1);
    Node n2 = Node.newNumber(2);
    n1.setNext(n2);

    generator.addList(n1);
    Assert.assertEquals("1,2", consumer.getCode());

    consumer.buffer.setLength(0);
    generator.addAllSiblings(n1);
    Assert.assertEquals("12", consumer.getCode());
  }

  @Test
  public void testAddArrayList_withEmptyElements() {
    Node n1 = Node.newNumber(1);
    Node empty = new Node(Token.EMPTY);
    n1.setNext(empty);

    generator.addArrayList(n1);
    Assert.assertEquals("1,,", consumer.getCode());
  }

  @Test
  public void testAddCaseBody_executesProperly() {
    Node body = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    generator.addCaseBody(body);
    Assert.assertEquals("1;", consumer.getCode());
  }

  @Test
  public void testNonEmptyStatement_preservedExtraBlocks() {
    consumer.preserveExtraBlocks = true;
    Node block = new Node(Token.BLOCK);
    generator.add(new Node(Token.WHILE, Node.newString(Token.NAME, "c"), block));
    Assert.assertEquals("while(c){}", consumer.getCode());
  }

  @Test
  public void testScript_withMultipleStatements() {
    Node var1 = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
    Node script = new Node(Token.SCRIPT, var1, fn);

    generator.add(script);
    Assert.assertEquals("var a;function f(){}", consumer.getCode());
  }
}
