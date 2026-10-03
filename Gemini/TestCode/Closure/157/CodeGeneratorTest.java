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
    void append(String newcode) {
      buffer.append(newcode);
    }

    @Override
    void add(String newcode) {
      buffer.append(newcode);
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
      buffer.append(x);
    }

    @Override
    void endStatement(boolean needSemi) {
      buffer.append(";");
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
    void endBlock(boolean needSemi) {
      buffer.append("}");
    }

    @Override
    void startSourceMapping(Node n) {}

    @Override
    void endSourceMapping(Node n) {}

    @Override
    boolean shouldPreserveExtraBlocks() {
      return preserveExtraBlocks;
    }

    @Override
    boolean breakAfterBlockFor(Node n, boolean statementContext) {
      return false;
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
    void beginCaseBody() {
      buffer.append(":");
    }

    @Override
    void endCaseBody() {}

    @Override
    void endFunction(boolean statementContext) {}
  }

  @Before
  public void setUp() {
    consumer = new TestCodeConsumer();
    generator = new CodeGenerator(consumer);
  }

  @Test
  public void testConstructor_withCharsets() {
    CodeGenerator genNull = new CodeGenerator(consumer, null);
    Assert.assertNotNull(genNull);

    CodeGenerator genAscii = new CodeGenerator(consumer, Charsets.US_ASCII);
    Assert.assertNotNull(genAscii);

    CodeGenerator genUtf8 = new CodeGenerator(consumer, Charsets.UTF_8);
    Assert.assertNotNull(genUtf8);
  }

  @Test
  public void testTagAsStrict_addsStrictDirective() {
    generator.tagAsStrict();
    Assert.assertEquals("'use strict';", consumer.buffer.toString());
  }

  @Test
  public void testAdd_string() {
    generator.add("var x = 1;");
    Assert.assertEquals("var x = 1;", consumer.buffer.toString());
  }

  @Test
  public void testAdd_stopProcessingWhenContinueProcessingIsFalse() {
    consumer.continueProcessing = false;
    generator.add(Node.newNumber(10));
    Assert.assertEquals("", consumer.buffer.toString());
  }

  @Test
  public void testBinaryOperators_associativityAndPrecedence() {
    Node a = Node.newString(Token.NAME, "a");
    Node b = Node.newString(Token.NAME, "b");
    Node c = Node.newString(Token.NAME, "c");
    Node innerAdd = new Node(Token.ADD, b, c);
    Node rootAdd = new Node(Token.ADD, a, innerAdd);
    generator.add(rootAdd);
    Assert.assertEquals("a+b+c", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node a2 = Node.newString(Token.NAME, "a");
    Node b2 = Node.newString(Token.NAME, "b");
    Node c2 = Node.newString(Token.NAME, "c");
    Node innerSub = new Node(Token.SUB, b2, c2);
    Node rootSub = new Node(Token.SUB, a2, innerSub);
    generator.add(rootSub);
    Assert.assertEquals("a-(b-c)", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node x = Node.newString(Token.NAME, "x");
    Node y = Node.newString(Token.NAME, "y");
    Node z = Node.newString(Token.NAME, "z");
    Node innerAssign = new Node(Token.ASSIGN, y, z);
    Node rootAssign = new Node(Token.ASSIGN, x, innerAssign);
    generator.add(rootAssign);
    Assert.assertEquals("x=y=z", consumer.buffer.toString());
  }

  @Test(expected = IllegalStateException.class)
  public void testBinaryOperators_invalidChildCount_throws() {
    Node a = Node.newString(Token.NAME, "a");
    Node invalidBinary = new Node(Token.ADD, a);
    generator.add(invalidBinary);
  }

  @Test
  public void testTryCatchFinally() {
    Node tryBlock = new Node(Token.BLOCK, new Node(Token.EMPTY));
    Node catchBlockBody = new Node(Token.BLOCK, new Node(Token.EMPTY));
    Node catchVar = Node.newString(Token.NAME, "e");
    Node catchNode = new Node(Token.CATCH, catchVar, catchBlockBody);
    Node catchBlockContainer = new Node(Token.BLOCK, catchNode);
    Node finallyBlock = new Node(Token.BLOCK, new Node(Token.EMPTY));

    Node tryCatchFinally = new Node(Token.TRY, tryBlock, catchBlockContainer, finallyBlock);
    generator.add(tryCatchFinally);
    Assert.assertEquals("try{}catch(e){}finally{}", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node tryCatchOnly = new Node(Token.TRY, tryBlock.cloneTree(), catchBlockContainer.cloneTree());
    generator.add(tryCatchOnly);
    Assert.assertEquals("try{}catch(e){}", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node emptyCatchContainer = new Node(Token.BLOCK);
    Node tryFinallyOnly = new Node(Token.TRY, tryBlock.cloneTree(), emptyCatchContainer, finallyBlock.cloneTree());
    generator.add(tryFinallyOnly);
    Assert.assertEquals("try{}finally{}", consumer.buffer.toString());
  }

  @Test
  public void testThrowAndReturn() {
    Node throwNode = new Node(Token.THROW, Node.newString(Token.NAME, "e"));
    generator.add(throwNode);
    Assert.assertEquals("throwe;", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node returnValNode = new Node(Token.RETURN, Node.newNumber(1));
    generator.add(returnValNode);
    Assert.assertEquals("return1.0;", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node returnEmptyNode = new Node(Token.RETURN);
    generator.add(returnEmptyNode);
    Assert.assertEquals("return;", consumer.buffer.toString());
  }

  @Test
  public void testVarAndName() {
    Node varNode = new Node(Token.VAR);
    generator.add(varNode);
    Assert.assertEquals("", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node nameUninit = Node.newString(Token.NAME, "x");
    Node varWithUninit = new Node(Token.VAR, nameUninit);
    generator.add(varWithUninit);
    Assert.assertEquals("var x", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node nameInit = Node.newString(Token.NAME, "y");
    nameInit.addChildToFront(Node.newNumber(2));
    Node varWithInit = new Node(Token.VAR, nameInit);
    generator.add(varWithInit);
    Assert.assertEquals("var y=2.0", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node nameComma = Node.newString(Token.NAME, "z");
    Node comma = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
    nameComma.addChildToFront(comma);
    Node varWithComma = new Node(Token.VAR, nameComma);
    generator.add(varWithComma);
    Assert.assertEquals("var z=(1.0,2.0)", consumer.buffer.toString());
  }

  @Test
  public void testLabelAndLabelName() {
    Node labelName = Node.newString(Token.LABEL_NAME, "myLabel");
    generator.add(labelName);
    Assert.assertEquals("myLabel", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node labelStmt = new Node(Token.LABEL, Node.newString(Token.LABEL_NAME, "myLabel"), new Node(Token.EMPTY));
    generator.add(labelStmt);
    Assert.assertEquals("myLabel:;", consumer.buffer.toString());
  }

  @Test
  public void testArrayLiteralAndArrayList() {
    Node emptySlot = new Node(Token.EMPTY);
    Node numSlot = Node.newNumber(1);
    Node arrayLit = new Node(Token.ARRAYLIT, emptySlot, numSlot, new Node(Token.EMPTY));
    generator.add(arrayLit);
    Assert.assertEquals("[,1.0,,]", consumer.buffer.toString());
  }

  @Test
  public void testUnaryOperatorsAndNegation() {
    Node typeofNode = new Node(Token.TYPEOF, Node.newString(Token.NAME, "x"));
    generator.add(typeofNode);
    Assert.assertEquals("typeof x", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node voidNode = new Node(Token.VOID, Node.newNumber(0));
    generator.add(voidNode);
    Assert.assertEquals("void 0.0", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node negNum = new Node(Token.NEG, Node.newNumber(5));
    generator.add(negNum);
    Assert.assertEquals("-5.0", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node negName = new Node(Token.NEG, Node.newString(Token.NAME, "x"));
    generator.add(negName);
    Assert.assertEquals("-x", consumer.buffer.toString());
  }

  @Test
  public void testHook() {
    Node hook = new Node(Token.HOOK,
        Node.newString(Token.NAME, "cond"),
        Node.newNumber(1),
        Node.newNumber(2));
    generator.add(hook);
    Assert.assertEquals("cond?1.0:2.0", consumer.buffer.toString());
  }

  @Test
  public void testRegexp() {
    Node pattern = Node.newString(Token.STRING, "abc");
    Node flags = Node.newString(Token.STRING, "gi");
    Node regexp = new Node(Token.REGEXP, pattern, flags);
    generator.add(regexp);
    Assert.assertEquals("/abc/gi", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node regexpNoFlags = new Node(Token.REGEXP, Node.newString(Token.STRING, "xyz"));
    generator.add(regexpNoFlags);
    Assert.assertEquals("/xyz/", consumer.buffer.toString());
  }

  @Test(expected = Error.class)
  public void testRegexp_nonStringChildren_throws() {
    Node regexp = new Node(Token.REGEXP, Node.newNumber(123));
    generator.add(regexp);
  }

  @Test
  public void testGetRefAndRefSpecial() {
    Node refTarget = Node.newString(Token.NAME, "foo");
    Node getRef = new Node(Token.GET_REF, refTarget);
    generator.add(getRef);
    Assert.assertEquals("foo", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node refSpecial = new Node(Token.REF_SPECIAL, Node.newString(Token.NAME, "foo"));
    refSpecial.putProp(Node.NAME_PROP, "specialProp");
    generator.add(refSpecial);
    Assert.assertEquals("foo.specialProp", consumer.buffer.toString());
  }

  @Test
  public void testFunction() {
    Node fnName = Node.newString(Token.NAME, "foo");
    Node params = new Node(Token.LP, Node.newString(Token.NAME, "p"));
    Node body = new Node(Token.BLOCK);
    Node fn = new Node(Token.FUNCTION, fnName, params, body);

    generator.add(fn, CodeGenerator.Context.START_OF_EXPR);
    Assert.assertEquals("(function foo(p){})", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    generator.add(fn, CodeGenerator.Context.OTHER);
    Assert.assertEquals("function foo(p){}", consumer.buffer.toString());
  }

  @Test
  public void testGetAndSetInObjectLit() {
    Node getFnName = Node.newString(Token.NAME, "");
    Node getParams = new Node(Token.LP);
    Node getBody = new Node(Token.BLOCK);
    Node getFn = new Node(Token.FUNCTION, getFnName, getParams, getBody);
    Node getNode = Node.newString(Token.GET, "prop");
    getNode.addChildToFront(getFn);

    Node setFnName = Node.newString(Token.NAME, "");
    Node setParams = new Node(Token.LP, Node.newString(Token.NAME, "val"));
    Node setBody = new Node(Token.BLOCK);
    Node setFn = new Node(Token.FUNCTION, setFnName, setParams, setBody);
    Node setNode = Node.newString(Token.SET, "prop");
    setNode.addChildToFront(setFn);

    Node objLit = new Node(Token.OBJECTLIT, getNode, setNode);
    generator.add(objLit);
    Assert.assertEquals("{get prop(){},set prop(val){}}", consumer.buffer.toString());
  }

  @Test
  public void testObjectLit_keysAndValues() {
    Node normalKey = Node.newString(Token.STRING, "k1");
    normalKey.addChildToFront(Node.newNumber(1));

    Node keywordKey = Node.newString(Token.STRING, "default");
    keywordKey.addChildToFront(Node.newNumber(2));

    Node quotedKey = Node.newString(Token.STRING, "quoted");
    quotedKey.setQuotedString();
    quotedKey.addChildToFront(Node.newNumber(3));

    Node objLit = new Node(Token.OBJECTLIT, normalKey, keywordKey, quotedKey);
    generator.add(objLit, CodeGenerator.Context.START_OF_EXPR);
    Assert.assertEquals("({k1:1.0,\"default\":2.0,\"quoted\":3.0})", consumer.buffer.toString());
  }

  @Test
  public void testScriptAndBlock() {
    Node script = new Node(Token.SCRIPT);
    Node varStmt = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
    Node fnStmt = new Node(Token.FUNCTION, Node.newString(Token.NAME, "fn"), new Node(Token.LP), new Node(Token.BLOCK));
    script.addChildToBack(varStmt);
    script.addChildToBack(fnStmt);

    generator.add(script);
    Assert.assertTrue(consumer.buffer.toString().contains("var a;\n"));
    Assert.assertTrue(consumer.buffer.toString().contains("function fn(){}"));

    consumer.buffer.setLength(0);
    Node block = new Node(Token.BLOCK, Node.newString(Token.NAME, "x"));
    generator.add(block, CodeGenerator.Context.PRESERVE_BLOCK);
    Assert.assertEquals("{x}", consumer.buffer.toString());
  }

  @Test
  public void testForLoops() {
    Node init = new Node(Token.VAR, Node.newString(Token.NAME, "i"));
    Node cond = Node.newString(Token.NAME, "cond");
    Node incr = Node.newString(Token.NAME, "incr");
    Node body = new Node(Token.BLOCK, new Node(Token.EMPTY));
    Node for4 = new Node(Token.FOR, init, cond, incr, body);
    generator.add(for4);
    Assert.assertEquals("for(var i;cond;incr);", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node initExpr = Node.newString(Token.NAME, "i");
    Node for4Expr = new Node(Token.FOR, initExpr, cond.cloneTree(), incr.cloneTree(), body.cloneTree());
    generator.add(for4Expr);
    Assert.assertEquals("for(i;cond;incr);", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node forIn = new Node(Token.FOR, Node.newString(Token.NAME, "k"), Node.newString(Token.NAME, "obj"), body.cloneTree());
    generator.add(forIn);
    Assert.assertEquals("for(k in obj);", consumer.buffer.toString());
  }

  @Test
  public void testDoAndWhile() {
    Node doStmt = new Node(Token.DO, new Node(Token.BLOCK, new Node(Token.EMPTY)), Node.newString(Token.NAME, "cond"));
    generator.add(doStmt);
    Assert.assertEquals("do;while(cond);", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node whileStmt = new Node(Token.WHILE, Node.newString(Token.NAME, "cond"), new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(whileStmt);
    Assert.assertEquals("while(cond);", consumer.buffer.toString());
  }

  @Test
  public void testGetPropAndGetElem() {
    Node numTarget = Node.newNumber(1);
    Node propName = Node.newString(Token.STRING, "toString");
    Node getProp = new Node(Token.GETPROP, numTarget, propName);
    generator.add(getProp);
    Assert.assertEquals("(1.0).toString", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node objTarget = Node.newString(Token.NAME, "obj");
    Node keyTarget = Node.newString(Token.NAME, "key");
    Node getElem = new Node(Token.GETELEM, objTarget, keyTarget);
    generator.add(getElem);
    Assert.assertEquals("obj[key]", consumer.buffer.toString());
  }

  @Test
  public void testWith() {
    Node withStmt = new Node(Token.WITH, Node.newString(Token.NAME, "scope"), new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(withStmt);
    Assert.assertEquals("with(scope);", consumer.buffer.toString());
  }

  @Test
  public void testIncAndDec() {
    Node incPre = new Node(Token.INC, Node.newString(Token.NAME, "i"));
    generator.add(incPre);
    Assert.assertEquals("++i", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node incPost = new Node(Token.INC, Node.newString(Token.NAME, "i"));
    incPost.putIntProp(Node.INCRDECR_PROP, 1);
    generator.add(incPost);
    Assert.assertEquals("i++", consumer.buffer.toString());
  }

  @Test
  public void testCall() {
    Node callee = Node.newString(Token.NAME, "eval");
    Node callIndirectEval = new Node(Token.CALL, callee, Node.newString(Token.STRING, "code"));
    generator.add(callIndirectEval);
    Assert.assertEquals("(0,eval)(\"code\")", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node calleeDirect = Node.newString(Token.NAME, "eval");
    calleeDirect.putBooleanProp(Node.DIRECT_EVAL, true);
    Node callDirect = new Node(Token.CALL, calleeDirect);
    generator.add(callDirect);
    Assert.assertEquals("eval()", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node getPropCallee = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString(Token.STRING, "m"));
    Node freeCall = new Node(Token.CALL, getPropCallee);
    freeCall.putBooleanProp(Node.FREE_CALL, true);
    generator.add(freeCall);
    Assert.assertEquals("(0,obj.m)()", consumer.buffer.toString());
  }

  @Test
  public void testIfElse() {
    Node ifNode = new Node(Token.IF,
        Node.newString(Token.NAME, "c"),
        new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(ifNode, CodeGenerator.Context.BEFORE_DANGLING_ELSE);
    Assert.assertEquals("{if(c);}", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node ifElseNode = new Node(Token.IF,
        Node.newString(Token.NAME, "c"),
        new Node(Token.BLOCK, new Node(Token.EMPTY)),
        new Node(Token.BLOCK, new Node(Token.EMPTY)));
    generator.add(ifElseNode);
    Assert.assertEquals("if(c);else;", consumer.buffer.toString());
  }

  @Test
  public void testLiteralsAndControlFlow() {
    generator.add(new Node(Token.NULL));
    generator.add(new Node(Token.THIS));
    generator.add(new Node(Token.FALSE));
    generator.add(new Node(Token.TRUE));
    generator.add(new Node(Token.DEBUGGER));
    Assert.assertEquals("nullthisfalstruedebugger;", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    generator.add(new Node(Token.CONTINUE));
    generator.add(new Node(Token.CONTINUE, Node.newString(Token.LABEL_NAME, "loop")));
    generator.add(new Node(Token.BREAK));
    generator.add(new Node(Token.BREAK, Node.newString(Token.LABEL_NAME, "loop")));
    Assert.assertEquals("continue;continue loop;break;break loop;", consumer.buffer.toString());
  }

  @Test(expected = Error.class)
  public void testExprVoid_throws() {
    generator.add(new Node(Token.EXPR_VOID));
  }

  @Test
  public void testExprResult() {
    Node exprResult = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    generator.add(exprResult);
    Assert.assertEquals("1.0;", consumer.buffer.toString());
  }

  @Test
  public void testNew() {
    Node newWithoutArgs = new Node(Token.NEW, Node.newString(Token.NAME, "Foo"));
    generator.add(newWithoutArgs);
    Assert.assertEquals("new Foo", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node newWithArgs = new Node(Token.NEW, Node.newString(Token.NAME, "Foo"), Node.newNumber(1));
    generator.add(newWithArgs);
    Assert.assertEquals("new Foo(1.0)", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node call = new Node(Token.CALL, Node.newString(Token.NAME, "getConstructor"));
    Node newWithCallTarget = new Node(Token.NEW, call);
    generator.add(newWithCallTarget);
    Assert.assertEquals("new (getConstructor())", consumer.buffer.toString());
  }

  @Test
  public void testDelprop() {
    Node del = new Node(Token.DELPROP, Node.newString(Token.NAME, "x"));
    generator.add(del);
    Assert.assertEquals("delete x", consumer.buffer.toString());
  }

  @Test
  public void testSwitchCaseDefault() {
    Node caseNode = new Node(Token.CASE, Node.newNumber(1), new Node(Token.BLOCK, new Node(Token.EMPTY)));
    Node defaultNode = new Node(Token.DEFAULT, new Node(Token.BLOCK, new Node(Token.EMPTY)));
    Node switchNode = new Node(Token.SWITCH, Node.newString(Token.NAME, "x"), caseNode, defaultNode);
    generator.add(switchNode);
    Assert.assertEquals("switch(x){case 1.0:;default:;}", consumer.buffer.toString());
  }

  @Test
  public void testSetnameIgnored() {
    generator.add(new Node(Token.SETNAME));
    Assert.assertEquals("", consumer.buffer.toString());
  }

  @Test(expected = Error.class)
  public void testUnknownType_throws() {
    generator.add(new Node(-999));
  }

  @Test
  public void testPreserveExtraBlocks() {
    consumer.preserveExtraBlocks = true;
    Node emptyBlock = new Node(Token.BLOCK);
    Node whileNode = new Node(Token.WHILE, Node.newString(Token.NAME, "c"), emptyBlock);
    generator.add(whileNode);
    Assert.assertEquals("while(c){}", consumer.buffer.toString());

    consumer.buffer.setLength(0);
    Node singleStmtBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1)));
    Node whileNode2 = new Node(Token.WHILE, Node.newString(Token.NAME, "c"), singleStmtBlock);
    generator.add(whileNode2);
    Assert.assertEquals("while(c){1.0;\n}", consumer.buffer.toString());
  }

  @Test
  public void testInForInitClauseParens() {
    Node inNode = new Node(Token.IN, Node.newString(Token.NAME, "k"), Node.newString(Token.NAME, "obj"));
    generator.addLeftExpr(inNode, 0, CodeGenerator.Context.IN_FOR_INIT_CLAUSE);
    Assert.assertEquals("(k in obj)", consumer.buffer.toString());
  }

  @Test
  public void testStringEscapingHelpers() {
    Assert.assertEquals("\"hello\"", CodeGenerator.escapeToDoubleQuotedJsString("hello"));
    Assert.assertEquals("\"\\\"quotes\\'\"", CodeGenerator.escapeToDoubleQuotedJsString("\"quotes'"));
    Assert.assertEquals("\"\\0\\n\\r\\t\\\\\"", CodeGenerator.escapeToDoubleQuotedJsString("\0\n\r\t\\"));
    Assert.assertEquals("\"--\\>\"", CodeGenerator.escapeToDoubleQuotedJsString("-->"));
    Assert.assertEquals("\"]]\\>\"", CodeGenerator.escapeToDoubleQuotedJsString("]]>"));
    Assert.assertEquals("\"<\\/script>\"", CodeGenerator.escapeToDoubleQuotedJsString("</script>"));
    Assert.assertEquals("\"<\\!--\"", CodeGenerator.escapeToDoubleQuotedJsString("<!--"));

    Assert.assertEquals("/a\\/b/", CodeGenerator.regexpEscape("a/b"));
    CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();
    Assert.assertEquals("/\\u00e9/", CodeGenerator.regexpEscape("\u00e9", asciiEncoder));

    Assert.assertEquals("'single\"\"'", CodeGenerator.jsString("single\"\"", null));
    Assert.assertEquals("\"double''\"", CodeGenerator.jsString("double''", null));

    Assert.assertEquals("latinVar", CodeGenerator.identifierEscape("latinVar"));
    Assert.assertEquals("\\u00e9Var", CodeGenerator.identifierEscape("\u00e9Var"));

    String surrogate = new String(Character.toChars(0x10000));
    Assert.assertEquals("\"\\ud800\\udc00\"", CodeGenerator.escapeToDoubleQuotedJsString(surrogate));
  }

  @Test
  public void testAddAllSiblings() {
    Node n1 = Node.newString(Token.NAME, "a");
    Node n2 = Node.newString(Token.NAME, "b");
    n1.setNext(n2);
    generator.addAllSiblings(n1);
    Assert.assertEquals("ab", consumer.buffer.toString());
  }

  @Test
  public void testAddList() {
    Node n1 = Node.newNumber(1);
    Node n2 = Node.newNumber(2);
    n1.setNext(n2);
    generator.addList(n1);
    Assert.assertEquals("1.0,2.0", consumer.buffer.toString());
  }
}
