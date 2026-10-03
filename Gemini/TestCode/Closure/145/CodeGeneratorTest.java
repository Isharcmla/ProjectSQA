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

  private static class DummyCodeConsumer extends CodeConsumer {
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
  }

  private DummyCodeConsumer consumer;
  private CodeGenerator generator;

  @Before
  public void setUp() {
    consumer = new DummyCodeConsumer();
    generator = new CodeGenerator(consumer);
  }

  @Test
  public void testConstructor_withCharset() {
    CodeGenerator genAscii = new CodeGenerator(consumer, Charsets.US_ASCII);
    Assert.assertNotNull(genAscii);

    CodeGenerator genUtf8 = new CodeGenerator(consumer, Charsets.UTF_8);
    Assert.assertNotNull(genUtf8);

    CodeGenerator genNull = new CodeGenerator(consumer, null);
    Assert.assertNotNull(genNull);
  }

  @Test
  public void testAddString() {
    generator.add("testString");
    Assert.assertEquals("testString", consumer.getOutput());
  }

  @Test
  public void testAdd_continueProcessingFalse() {
    consumer.shouldContinue = false;
    Node num = Node.newNumber(42);
    generator.add(num);
    Assert.assertEquals("", consumer.getOutput());
  }

  @Test
  public void testAdd_binaryOperators_associativeAndAssignment() {
    // a * (b * c)
    Node mulChild = new Node(Token.MUL, Node.newString("b"), Node.newString("c"));
    Node mulRoot = new Node(Token.MUL, Node.newString("a"), mulChild);
    generator.add(mulRoot);
    Assert.assertTrue(consumer.getOutput().contains("*"));

    // a = (b = c)
    consumer.buffer.setLength(0);
    Node assignChild = new Node(Token.ASSIGN, Node.newString("b"), Node.newString("c"));
    Node assignRoot = new Node(Token.ASSIGN, Node.newString("a"), assignChild);
    generator.add(assignRoot);
    Assert.assertTrue(consumer.getOutput().contains("="));

    // a - (b - c) non-associative
    consumer.buffer.setLength(0);
    Node subChild = new Node(Token.SUB, Node.newString("b"), Node.newString("c"));
    Node subRoot = new Node(Token.SUB, Node.newString("a"), subChild);
    generator.add(subRoot);
    Assert.assertTrue(consumer.getOutput().contains("-"));
  }

  @Test(expected = IllegalStateException.class)
  public void testAdd_binaryOperator_invalidChildCount() {
    Node invalidBinOp = new Node(Token.ADD, Node.newString("a"));
    generator.add(invalidBinOp);
  }

  @Test
  public void testAdd_tryCatchFinally() {
    Node tryBlock = new Node(Token.BLOCK);
    Node catchBlock = new Node(Token.BLOCK, new Node(Token.CATCH, Node.newString("e"), new Node(Token.EMPTY), new Node(Token.BLOCK)));
    Node finallyBlock = new Node(Token.BLOCK);

    Node tryNode = new Node(Token.TRY, tryBlock, catchBlock, finallyBlock);
    generator.add(tryNode);
    String out = consumer.getOutput();
    Assert.assertTrue(out.contains("try"));
    Assert.assertTrue(out.contains("catch("));
    Assert.assertTrue(out.contains("finally"));
  }

  @Test
  public void testAdd_tryNoCatch() {
    Node tryBlock = new Node(Token.BLOCK);
    Node catchHolder = new Node(Token.BLOCK);
    Node tryNode = new Node(Token.TRY, tryBlock, catchHolder);
    generator.add(tryNode);
    Assert.assertTrue(consumer.getOutput().contains("try"));
  }

  @Test(expected = Error.class)
  public void testAdd_catchConditionNotSupported() {
    Node catchNode = new Node(Token.CATCH, Node.newString("e"), Node.newString("cond"), new Node(Token.BLOCK));
    generator.add(catchNode);
  }

  @Test
  public void testAdd_throwAndReturn() {
    Node throwNode = new Node(Token.THROW, Node.newString("err"));
    generator.add(throwNode);
    Assert.assertTrue(consumer.getOutput().contains("throw"));

    consumer.buffer.setLength(0);
    Node returnNodeWithChild = new Node(Token.RETURN, Node.newNumber(1));
    generator.add(returnNodeWithChild);
    Assert.assertTrue(consumer.getOutput().contains("return"));

    consumer.buffer.setLength(0);
    Node returnEmpty = new Node(Token.RETURN);
    generator.add(returnEmpty);
    Assert.assertTrue(consumer.getOutput().contains("return"));
  }

  @Test
  public void testAdd_var() {
    Node varNode = new Node(Token.VAR);
    generator.add(varNode);
    Assert.assertEquals("", consumer.getOutput());

    Node nameNode = Node.newString("x");
    varNode.addChildToFront(nameNode);
    generator.add(varNode);
    Assert.assertTrue(consumer.getOutput().contains("var x"));
  }

  @Test
  public void testAdd_labelName() {
    Node labelName = Node.newString(Token.LABEL_NAME, "lbl");
    generator.add(labelName);
    Assert.assertTrue(consumer.getOutput().contains("lbl"));
  }

  @Test(expected = IllegalStateException.class)
  public void testAdd_labelNameEmpty_throwsException() {
    Node labelName = Node.newString(Token.LABEL_NAME, "");
    generator.add(labelName);
  }

  @Test
  public void testAdd_nameWithAssignment() {
    Node init = Node.newNumber(10);
    Node nameNode = Node.newString("x");
    nameNode.addChildToFront(init);
    generator.add(nameNode);
    Assert.assertTrue(consumer.getOutput().contains("x="));

    consumer.buffer.setLength(0);
    Node commaNode = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
    Node nameNodeComma = Node.newString("y");
    nameNodeComma.addChildToFront(commaNode);
    generator.add(nameNodeComma);
    Assert.assertTrue(consumer.getOutput().contains("y="));
  }

  @Test
  public void testAdd_nameWithoutAssignment() {
    Node nameNode = Node.newString("foo");
    generator.add(nameNode);
    Assert.assertEquals("foo", consumer.getOutput());

    consumer.buffer.setLength(0);
    Node nameNodeWithEmpty = Node.newString("bar");
    nameNodeWithEmpty.addChildToFront(new Node(Token.EMPTY));
    generator.add(nameNodeWithEmpty);
    Assert.assertEquals("bar", consumer.getOutput());
  }

  @Test
  public void testAdd_arrayLit_and_lp_and_comma() {
    Node elem1 = Node.newNumber(1);
    Node elem2 = Node.newNumber(2);
    elem1.setNext(elem2);
    Node arrayLit = new Node(Token.ARRAYLIT, elem1);
    arrayLit.putProp(Node.SKIP_INDEXES_PROP, new int[]{1});
    generator.add(arrayLit);
    Assert.assertTrue(consumer.getOutput().startsWith("["));
    Assert.assertTrue(consumer.getOutput().endsWith("]"));

    consumer.buffer.setLength(0);
    Node lp = new Node(Token.LP, Node.newString("a"));
    generator.add(lp);
    Assert.assertTrue(consumer.getOutput().contains("(a)"));

    consumer.buffer.setLength(0);
    Node comma = new Node(Token.COMMA, Node.newString("a"), Node.newString("b"));
    generator.add(comma);
    Assert.assertTrue(consumer.getOutput().contains("a"));
    Assert.assertTrue(consumer.getOutput().contains("b"));
  }

  @Test
  public void testAdd_number() {
    Node num = Node.newNumber(3.14);
    generator.add(num);
    Assert.assertTrue(consumer.getOutput().length() > 0);
  }

  @Test
  public void testAdd_unaryOperators() {
    int[] unops = new int[]{
        Token.TYPEOF, Token.VOID, Token.NOT, Token.BITNOT, Token.POS, Token.NEG
    };
    for (int op : unops) {
      consumer.buffer.setLength(0);
      Node node = new Node(op, Node.newNumber(1));
      generator.add(node);
      Assert.assertTrue(consumer.getOutput().length() > 0);
    }
  }

  @Test
  public void testAdd_hook() {
    Node hook = new Node(Token.HOOK, Node.newString("a"), Node.newString("b"), Node.newString("c"));
    generator.add(hook);
    Assert.assertTrue(consumer.getOutput().contains("?"));
    Assert.assertTrue(consumer.getOutput().contains(":"));
  }

  @Test
  public void testAdd_regexp() {
    Node regexp1 = new Node(Token.REGEXP, Node.newString("abc"));
    generator.add(regexp1);
    Assert.assertTrue(consumer.getOutput().contains("/abc/"));

    consumer.buffer.setLength(0);
    Node regexp2 = new Node(Token.REGEXP, Node.newString("abc"), Node.newString("g"));
    generator.add(regexp2);
    Assert.assertTrue(consumer.getOutput().contains("/abc/g"));
  }

  @Test(expected = Error.class)
  public void testAdd_regexpNonStringChild_throwsError() {
    Node regexp = new Node(Token.REGEXP, Node.newNumber(1));
    generator.add(regexp);
  }

  @Test
  public void testAdd_getRefAndRefSpecial() {
    Node getRef = new Node(Token.GET_REF, Node.newString("refTarget"));
    generator.add(getRef);
    Assert.assertTrue(consumer.getOutput().contains("refTarget"));

    consumer.buffer.setLength(0);
    Node refSpecial = new Node(Token.REF_SPECIAL, Node.newString("specialObj"));
    refSpecial.putProp(Node.NAME_PROP, "propName");
    generator.add(refSpecial);
    Assert.assertTrue(consumer.getOutput().contains("specialObj.propName"));
  }

  @Test
  public void testAdd_function() {
    Node name = Node.newString(Token.NAME, "myFunc");
    Node params = new Node(Token.LP);
    Node body = new Node(Token.BLOCK);
    Node fn = new Node(Token.FUNCTION, name, params, body);

    generator.add(fn, CodeGenerator.Context.START_OF_EXPR);
    Assert.assertTrue(consumer.getOutput().contains("(function myFunc()"));

    consumer.buffer.setLength(0);
    generator.add(fn, CodeGenerator.Context.STATEMENT);
    Assert.assertTrue(consumer.getOutput().contains("function myFunc()"));
  }

  @Test(expected = Error.class)
  public void testAdd_functionUnexpectedNodeSubclass() {
    Node customNode = new Node(Token.FUNCTION) {};
    generator.add(customNode);
  }

  @Test
  public void testAdd_scriptAndBlock() {
    Node script = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR, Node.newString("x"));
    Node fnNode = new Node(Token.FUNCTION, Node.newString("f"), new Node(Token.LP), new Node(Token.BLOCK));
    script.addChildToBack(varNode);
    script.addChildToBack(fnNode);

    generator.add(script);
    Assert.assertTrue(consumer.getOutput().contains("var x"));
    Assert.assertTrue(consumer.getOutput().contains("function f()"));

    consumer.buffer.setLength(0);
    Node block = new Node(Token.BLOCK, Node.newString("a"), Node.newString("b"));
    generator.add(block, CodeGenerator.Context.STATEMENT);
    Assert.assertTrue(consumer.getOutput().contains("a"));
    Assert.assertTrue(consumer.getOutput().contains("b"));
  }

  @Test
  public void testAdd_forLoop() {
    // 4-child for (var i = 0; i < 10; i++) {}
    Node varNode = new Node(Token.VAR, Node.newString("i"));
    Node cond = Node.newString("cond");
    Node incr = Node.newString("incr");
    Node body = new Node(Token.BLOCK);
    Node for4 = new Node(Token.FOR, varNode, cond, incr, body);
    generator.add(for4);
    Assert.assertTrue(consumer.getOutput().contains("for(var i;cond;incr)"));

    // 4-child for with non-var init
    consumer.buffer.setLength(0);
    Node initExpr = Node.newString("i");
    Node for4NonVar = new Node(Token.FOR, initExpr, cond.cloneNode(), incr.cloneNode(), body.cloneNode());
    generator.add(for4NonVar);
    Assert.assertTrue(consumer.getOutput().contains("for(i;cond;incr)"));

    // 3-child for (x in y) {}
    consumer.buffer.setLength(0);
    Node forIn = new Node(Token.FOR, Node.newString("x"), Node.newString("y"), new Node(Token.BLOCK));
    generator.add(forIn);
    Assert.assertTrue(consumer.getOutput().contains("for(x in y)"));
  }

  @Test
  public void testAdd_doAndWhile() {
    Node doBody = new Node(Token.BLOCK);
    Node doCond = Node.newString("cond");
    Node doNode = new Node(Token.DO, doBody, doCond);
    generator.add(doNode);
    Assert.assertTrue(consumer.getOutput().contains("do"));
    Assert.assertTrue(consumer.getOutput().contains("while(cond)"));

    consumer.buffer.setLength(0);
    Node whileNode = new Node(Token.WHILE, Node.newString("cond"), new Node(Token.BLOCK));
    generator.add(whileNode);
    Assert.assertTrue(consumer.getOutput().contains("while(cond)"));
  }

  @Test
  public void testAdd_emptyNode() {
    Node empty = new Node(Token.EMPTY);
    generator.add(empty);
    Assert.assertEquals("", consumer.getOutput());
  }

  @Test
  public void testAdd_getpropAndGetelem() {
    Node obj = Node.newString("obj");
    Node prop = Node.newString("prop");
    Node getprop = new Node(Token.GETPROP, obj, prop);
    generator.add(getprop);
    Assert.assertTrue(consumer.getOutput().contains("obj.prop"));

    consumer.buffer.setLength(0);
    Node numObj = Node.newNumber(1);
    Node getpropNum = new Node(Token.GETPROP, numObj, prop.cloneNode());
    generator.add(getpropNum);
    Assert.assertTrue(consumer.getOutput().contains("(1).prop"));

    consumer.buffer.setLength(0);
    Node elemIndex = Node.newNumber(0);
    Node getelem = new Node(Token.GETELEM, obj.cloneNode(), elemIndex);
    generator.add(getelem);
    Assert.assertTrue(consumer.getOutput().contains("obj[0]"));
  }

  @Test(expected = IllegalStateException.class)
  public void testAdd_getpropInvalidRhs() {
    Node getprop = new Node(Token.GETPROP, Node.newString("obj"), Node.newNumber(1));
    generator.add(getprop);
  }

  @Test
  public void testAdd_with() {
    Node withNode = new Node(Token.WITH, Node.newString("scope"), new Node(Token.BLOCK));
    generator.add(withNode);
    Assert.assertTrue(consumer.getOutput().contains("with(scope)"));
  }

  @Test
  public void testAdd_incDec() {
    Node preInc = new Node(Token.INC, Node.newString("x"));
    generator.add(preInc);
    Assert.assertTrue(consumer.getOutput().contains("++x"));

    consumer.buffer.setLength(0);
    Node postInc = new Node(Token.INC, Node.newString("x"));
    postInc.putIntProp(Node.INCRDECR_PROP, 1);
    generator.add(postInc);
    Assert.assertTrue(consumer.getOutput().contains("x++"));

    consumer.buffer.setLength(0);
    Node preDec = new Node(Token.DEC, Node.newString("x"));
    generator.add(preDec);
    Assert.assertTrue(consumer.getOutput().contains("--x"));

    consumer.buffer.setLength(0);
    Node postDec = new Node(Token.DEC, Node.newString("x"));
    postDec.putIntProp(Node.INCRDECR_PROP, 1);
    generator.add(postDec);
    Assert.assertTrue(consumer.getOutput().contains("x--"));
  }

  @Test
  public void testAdd_call() {
    Node normalCall = new Node(Token.CALL, Node.newString("fn"), Node.newNumber(1));
    generator.add(normalCall);
    Assert.assertTrue(consumer.getOutput().contains("fn(1)"));

    consumer.buffer.setLength(0);
    Node indirectEval = new Node(Token.CALL, Node.newString("eval"), Node.newString("code"));
    generator.add(indirectEval);
    Assert.assertTrue(consumer.getOutput().contains("(0,eval)(\"code\")"));

    consumer.buffer.setLength(0);
    Node directEvalTarget = Node.newString("eval");
    directEvalTarget.putBooleanProp(Node.DIRECT_EVAL, true);
    Node directEval = new Node(Token.CALL, directEvalTarget, Node.newString("code"));
    generator.add(directEval);
    Assert.assertTrue(consumer.getOutput().contains("eval(\"code\")"));
  }

  @Test
  public void testAdd_if() {
    // if without else
    Node ifNode = new Node(Token.IF, Node.newString("cond"), new Node(Token.BLOCK));
    generator.add(ifNode);
    Assert.assertTrue(consumer.getOutput().contains("if(cond)"));

    // if with else
    consumer.buffer.setLength(0);
    Node ifElse = new Node(Token.IF, Node.newString("cond"), new Node(Token.BLOCK), new Node(Token.BLOCK));
    generator.add(ifElse);
    Assert.assertTrue(consumer.getOutput().contains("if(cond)"));
    Assert.assertTrue(consumer.getOutput().contains("else"));

    // dangling else ambiguity
    consumer.buffer.setLength(0);
    generator.add(ifNode, CodeGenerator.Context.BEFORE_DANGLING_ELSE);
    Assert.assertTrue(consumer.getOutput().contains("if(cond)"));
  }

  @Test
  public void testAdd_literals() {
    int[] literals = new int[]{Token.NULL, Token.THIS, Token.FALSE, Token.TRUE};
    for (int lit : literals) {
      consumer.buffer.setLength(0);
      generator.add(new Node(lit));
      Assert.assertTrue(consumer.getOutput().length() > 0);
    }
  }

  @Test
  public void testAdd_continueBreakDebugger() {
    Node cont = new Node(Token.CONTINUE);
    generator.add(cont);
    Assert.assertTrue(consumer.getOutput().contains("continue"));

    consumer.buffer.setLength(0);
    Node contLbl = new Node(Token.CONTINUE, Node.newString(Token.LABEL_NAME, "lbl"));
    generator.add(contLbl);
    Assert.assertTrue(consumer.getOutput().contains("continue lbl"));

    consumer.buffer.setLength(0);
    Node brk = new Node(Token.BREAK);
    generator.add(brk);
    Assert.assertTrue(consumer.getOutput().contains("break"));

    consumer.buffer.setLength(0);
    Node brkLbl = new Node(Token.BREAK, Node.newString(Token.LABEL_NAME, "lbl"));
    generator.add(brkLbl);
    Assert.assertTrue(consumer.getOutput().contains("break lbl"));

    consumer.buffer.setLength(0);
    Node dbg = new Node(Token.DEBUGGER);
    generator.add(dbg);
    Assert.assertTrue(consumer.getOutput().contains("debugger"));
  }

  @Test(expected = Error.class)
  public void testAdd_continueInvalidChild_throwsError() {
    Node cont = new Node(Token.CONTINUE, Node.newNumber(1));
    generator.add(cont);
  }

  @Test(expected = Error.class)
  public void testAdd_breakInvalidChild_throwsError() {
    Node brk = new Node(Token.BREAK, Node.newNumber(1));
    generator.add(brk);
  }

  @Test(expected = Error.class)
  public void testAdd_exprVoid_throwsError() {
    Node exprVoid = new Node(Token.EXPR_VOID);
    generator.add(exprVoid);
  }

  @Test
  public void testAdd_exprResult() {
    Node expr = new Node(Token.EXPR_RESULT, Node.newString("val"));
    generator.add(expr);
    Assert.assertTrue(consumer.getOutput().contains("val"));
  }

  @Test
  public void testAdd_new() {
    Node newWithoutArgs = new Node(Token.NEW, Node.newString("Target"));
    generator.add(newWithoutArgs);
    Assert.assertTrue(consumer.getOutput().contains("new Target"));

    consumer.buffer.setLength(0);
    Node arg = Node.newNumber(1);
    Node newTarget = Node.newString("Target");
    newTarget.setNext(arg);
    Node newWithArgs = new Node(Token.NEW, newTarget);
    generator.add(newWithArgs);
    Assert.assertTrue(consumer.getOutput().contains("new Target(1)"));

    consumer.buffer.setLength(0);
    Node callTarget = new Node(Token.CALL, Node.newString("getConstructor"));
    Node newWithCall = new Node(Token.NEW, callTarget);
    generator.add(newWithCall);
    Assert.assertTrue(consumer.getOutput().contains("new (getConstructor())"));
  }

  @Test
  public void testAdd_string() {
    Node strNode = Node.newString("hello \"world\"");
    generator.add(strNode);
    Assert.assertTrue(consumer.getOutput().contains("hello"));
  }

  @Test
  public void testAdd_delprop() {
    Node del = new Node(Token.DELPROP, Node.newString("prop"));
    generator.add(del);
    Assert.assertTrue(consumer.getOutput().contains("delete prop"));
  }

  @Test
  public void testAdd_objectLit() {
    Node k1 = Node.newString("latinIdent");
    Node v1 = Node.newNumber(1);
    k1.setNext(v1);

    Node k2 = Node.newString("class"); // keyword
    Node v2 = Node.newNumber(2);
    v1.setNext(k2);
    k2.setNext(v2);

    Node objLit = new Node(Token.OBJECTLIT, k1);
    generator.add(objLit, CodeGenerator.Context.START_OF_EXPR);
    String out = consumer.getOutput();
    Assert.assertTrue(out.startsWith("({"));
    Assert.assertTrue(out.endsWith("})"));
    Assert.assertTrue(out.contains("latinIdent:1"));
    Assert.assertTrue(out.contains("\"class\":2"));
  }

  @Test
  public void testAdd_switchCaseDefault() {
    Node switchVal = Node.newString("x");
    Node caseBlock = new Node(Token.BLOCK, Node.newString("stmt1"));
    Node caseNode = new Node(Token.CASE, Node.newNumber(1), caseBlock);
    Node defBlock = new Node(Token.BLOCK, Node.newString("stmt2"));
    Node defNode = new Node(Token.DEFAULT, defBlock);
    switchVal.setNext(caseNode);
    caseNode.setNext(defNode);

    Node switchNode = new Node(Token.SWITCH, switchVal);
    generator.add(switchNode, CodeGenerator.Context.STATEMENT);

    String out = consumer.getOutput();
    Assert.assertTrue(out.contains("switch(x)"));
    Assert.assertTrue(out.contains("case 1"));
    Assert.assertTrue(out.contains("default"));
  }

  @Test
  public void testAdd_label() {
    Node lblName = Node.newString(Token.LABEL_NAME, "myLabel");
    Node body = new Node(Token.BLOCK);
    Node lbl = new Node(Token.LABEL, lblName, body);
    generator.add(lbl);
    Assert.assertTrue(consumer.getOutput().contains("myLabel:"));
  }

  @Test(expected = Error.class)
  public void testAdd_labelInvalidName_throwsError() {
    Node lbl = new Node(Token.LABEL, Node.newNumber(1), new Node(Token.BLOCK));
    generator.add(lbl);
  }

  @Test
  public void testAdd_setName() {
    Node setName = new Node(Token.SETNAME);
    generator.add(setName);
    Assert.assertEquals("", consumer.getOutput());
  }

  @Test(expected = Error.class)
  public void testAdd_unknownType_throwsError() {
    Node unknown = new Node(-999);
    generator.add(unknown);
  }

  @Test
  public void testAddNonEmptyExpression_blocksWithPreserveAndSpecialChildren() {
    consumer.preserveExtraBlocks = true;
    Node emptyBlock = new Node(Token.BLOCK);
    Node ifNode = new Node(Token.IF, Node.newString("cond"), emptyBlock);
    generator.add(ifNode);
    Assert.assertTrue(consumer.getOutput().contains("if(cond)"));

    consumer.buffer.setLength(0);
    consumer.preserveExtraBlocks = false;
    Node fnChild = new Node(Token.FUNCTION, Node.newString("f"), new Node(Token.LP), new Node(Token.BLOCK));
    Node singleFnBlock = new Node(Token.BLOCK, fnChild);
    Node ifFn = new Node(Token.IF, Node.newString("cond"), singleFnBlock);
    generator.add(ifFn);
    Assert.assertTrue(consumer.getOutput().contains("function f()"));

    consumer.buffer.setLength(0);
    Node varChild = new Node(Token.VAR, Node.newString("v"));
    Node singleVarBlock = new Node(Token.BLOCK, varChild);
    Node ifVar = new Node(Token.IF, Node.newString("cond"), singleVarBlock);
    generator.add(ifVar);
    Assert.assertTrue(consumer.getOutput().contains("var v"));

    consumer.buffer.setLength(0);
    Node emptyChildBlock = new Node(Token.BLOCK, new Node(Token.EMPTY));
    Node ifEmpty = new Node(Token.IF, Node.newString("cond"), emptyChildBlock);
    generator.add(ifEmpty);
    Assert.assertTrue(consumer.getOutput().contains("if(cond)"));
  }

  @Test(expected = Error.class)
  public void testAddNonEmptyExpression_missingBlockChild_throwsError() {
    Node invalidIf = new Node(Token.IF, Node.newString("cond"), Node.newNumber(1));
    generator.add(invalidIf);
  }

  @Test
  public void testAddExpr_inForInitClause_withInOperator() {
    Node inNode = new Node(Token.IN, Node.newString("a"), Node.newString("b"));
    generator.addExpr(inNode, 0);
    Assert.assertTrue(consumer.getOutput().contains("a in b"));

    consumer.buffer.setLength(0);
    Node forLoop = new Node(Token.FOR, inNode, Node.newString("cond"), Node.newString("step"), new Node(Token.BLOCK));
    generator.add(forLoop);
    Assert.assertTrue(consumer.getOutput().contains("(a in b)"));
  }

  @Test
  public void testAddList_withSkipIndexes() {
    Node n1 = Node.newNumber(10);
    Node n2 = Node.newNumber(20);
    Node n3 = Node.newNumber(30);
    n1.setNext(n2);
    n2.setNext(n3);

    generator.addList(n1, new int[]{0, 2, 4});
    String out = consumer.getOutput();
    Assert.assertTrue(out.contains("10"));
    Assert.assertTrue(out.contains("20"));
    Assert.assertTrue(out.contains("30"));
  }

  @Test
  public void testAddAllSiblings() {
    Node n1 = Node.newString("first");
    Node n2 = Node.newString("second");
    n1.setNext(n2);
    generator.addAllSiblings(n1);
    Assert.assertTrue(consumer.getOutput().contains("first"));
    Assert.assertTrue(consumer.getOutput().contains("second"));
  }

  @Test
  public void testJsString_quoteSelection() {
    String singlePreferred = CodeGenerator.jsString("It's a test with 'single' and 'more' singles", null);
    Assert.assertTrue(singlePreferred.startsWith("\""));
    Assert.assertTrue(singlePreferred.endsWith("\""));

    String doublePreferred = CodeGenerator.jsString("He said \"hello\" and \"world\"", null);
    Assert.assertTrue(doublePreferred.startsWith("'"));
    Assert.assertTrue(doublePreferred.endsWith("'"));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString() {
    String res = CodeGenerator.escapeToDoubleQuotedJsString("a\"b'c\n\r\t\\");
    Assert.assertEquals("\"a\\\"b'c\\n\\r\\t\\\\\"", res);
  }

  @Test
  public void testRegexpEscape() {
    String escaped = CodeGenerator.regexpEscape("a/b</script>--\n");
    Assert.assertTrue(escaped.startsWith("/"));
    Assert.assertTrue(escaped.endsWith("/"));
    Assert.assertTrue(escaped.contains("<\\script"));

    CharsetEncoder encoder = Charset.forName("US-ASCII").newEncoder();
    String withEncoder = CodeGenerator.regexpEscape("test\u0100", encoder);
    Assert.assertTrue(withEncoder.contains("\\u0100"));
  }

  @Test
  public void testStrEscape_specialSequences() {
    String htmlComment = CodeGenerator.strEscape("-->", '"', "\\\"", "'", "\\\\", null);
    Assert.assertTrue(htmlComment.contains("--\\>"));

    String cdata = CodeGenerator.strEscape("]]>", '"', "\\\"", "'", "\\\\", null);
    Assert.assertTrue(cdata.contains("]]\\>"));

    String normalGreater = CodeGenerator.strEscape("a > b", '"', "\\\"", "'", "\\\\", null);
    Assert.assertTrue(normalGreater.contains(">"));

    String normalLess = CodeGenerator.strEscape("a < b", '"', "\\\"", "'", "\\\\", null);
    Assert.assertTrue(normalLess.contains("<"));

    // Supplementary codepoint (> 0xFFFF)
    String supplementary = new String(Character.toChars(0x1F600)); // Emoji
    String escapedSupplementary = CodeGenerator.strEscape(supplementary, '"', "\\\"", "'", "\\\\", null);
    Assert.assertTrue(escapedSupplementary.contains("\\u"));
  }

  @Test
  public void testIdentifierEscape() {
    String latin = "validIdent123";
    Assert.assertEquals(latin, CodeGenerator.identifierEscape(latin));

    String nonLatin = "\u00E9cole";
    String escaped = CodeGenerator.identifierEscape(nonLatin);
    Assert.assertTrue(escaped.startsWith("\\u"));
    Assert.assertTrue(escaped.endsWith("cole"));
  }
}
