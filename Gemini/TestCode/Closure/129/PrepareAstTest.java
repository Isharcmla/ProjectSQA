package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

public class PrepareAstTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  @Test
  public void testConstructor_defaultConstructsCheckOnlyFalse() {
    PrepareAst pass = new PrepareAst(compiler);
    Node root = IR.script(IR.exprResult(IR.call(IR.name("foo"))));
    pass.process(null, root);

    Node callNode = root.getFirstChild().getFirstChild();
    assertTrue(callNode.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testProcess_nullNodes_doesNotThrow() {
    PrepareAst pass = new PrepareAst(compiler);
    pass.process(null, null);

    PrepareAst checkPass = new PrepareAst(compiler, true);
    checkPass.process(null, null);
  }

  @Test
  public void testProcess_externsAndRootTraversal() {
    Node externs = IR.script(IR.exprResult(IR.call(IR.name("externCall"))));
    Node root = IR.script(IR.exprResult(IR.call(IR.name("rootCall"))));

    PrepareAst pass = new PrepareAst(compiler, false);
    pass.process(externs, root);

    Node externCall = externs.getFirstChild().getFirstChild();
    Node rootCall = root.getFirstChild().getFirstChild();

    assertTrue(externCall.getBooleanProp(Node.FREE_CALL));
    assertTrue(rootCall.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testAnnotateCalls_freeCallAnnotated() {
    Node call = IR.call(IR.name("foo"));
    Node root = IR.script(IR.exprResult(call));

    PrepareAst pass = new PrepareAst(compiler, false);
    pass.process(null, root);

    assertTrue(call.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testAnnotateCalls_getPropCallNotFreeCall() {
    Node getProp = IR.getprop(IR.name("a"), IR.string("b"));
    Node call = IR.call(getProp);
    Node root = IR.script(IR.exprResult(call));

    PrepareAst pass = new PrepareAst(compiler, false);
    pass.process(null, root);

    assertFalse(call.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testAnnotateCalls_directEvalAnnotated() {
    Node evalName = IR.name("eval");
    Node call = IR.call(evalName);
    Node root = IR.script(IR.exprResult(call));

    PrepareAst pass = new PrepareAst(compiler, false);
    pass.process(null, root);

    assertTrue(call.getBooleanProp(Node.FREE_CALL));
    assertTrue(evalName.getBooleanProp(Node.DIRECT_EVAL));
  }

  @Test
  public void testAnnotateCalls_indirectEvalNotDirectEval() {
    Node evalName = IR.name("eval");
    Node hook = IR.hook(IR.number(1), evalName, IR.name("other"));
    Node call = IR.call(hook);
    Node root = IR.script(IR.exprResult(call));

    PrepareAst pass = new PrepareAst(compiler, false);
    pass.process(null, root);

    assertTrue(call.getBooleanProp(Node.FREE_CALL));
    assertFalse(evalName.getBooleanProp(Node.DIRECT_EVAL));
  }

  @Test
  public void testAnnotateDispatchers_validAssignDispatcher() {
    Node fn = IR.function(IR.name("dispatchFn"), IR.paramList(), IR.block());
    Node assign = IR.assign(IR.name("target"), fn);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordJavaDispatch();
    JSDocInfo info = builder.build(null);
    assign.setJSDocInfo(info);

    Node root = IR.script(IR.exprResult(assign));

    PrepareAst pass = new PrepareAst(compiler, false);
    pass.process(null, root);

    assertTrue(fn.getBooleanProp(Node.IS_DISPATCHER));
  }

  @Test
  public void testAnnotateDispatchers_parentWithoutJavaDispatch() {
    Node fn = IR.function(IR.name("regularFn"), IR.paramList(), IR.block());
    Node assign = IR.assign(IR.name("target"), fn);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordDescription("test");
    JSDocInfo info = builder.build(null);
    assign.setJSDocInfo(info);

    Node root = IR.script(IR.exprResult(assign));

    PrepareAst pass = new PrepareAst(compiler, false);
    pass.process(null, root);

    assertFalse(fn.getBooleanProp(Node.IS_DISPATCHER));
  }

  @Test
  public void testAnnotateDispatchers_parentNotAssign() {
    Node fn = IR.function(IR.name("varFn"), IR.paramList(), IR.block());
    Node expr = IR.exprResult(fn);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordJavaDispatch();
    JSDocInfo info = builder.build(null);
    expr.setJSDocInfo(info);

    Node root = IR.script(expr);

    PrepareAst pass = new PrepareAst(compiler, false);
    pass.process(null, root);

    assertFalse(fn.getBooleanProp(Node.IS_DISPATCHER));
  }

  @Test
  public void testNormalizeObjectLiteralKeyAnnotations_functionValueTransfersDoc() {
    Node fn = IR.function(IR.name(""), IR.paramList(), IR.block());
    Node key = IR.stringKey("foo", fn);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordDescription("key doc");
    JSDocInfo info = builder.build(null);
    key.setJSDocInfo(info);

    Node objLit = IR.objectlit(key);
    Node root = IR.script(IR.exprResult(objLit));

    PrepareAst pass = new PrepareAst(compiler, false);
    pass.process(null, root);

    assertSame(info, fn.getJSDocInfo());
  }

  @Test
  public void testNormalizeObjectLiteralKeyAnnotations_nonFunctionValueDoesNotTransfer() {
    Node num = IR.number(42);
    Node key = IR.stringKey("foo", num);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordDescription("key doc");
    JSDocInfo info = builder.build(null);
    key.setJSDocInfo(info);

    Node objLit = IR.objectlit(key);
    Node root = IR.script(IR.exprResult(objLit));

    PrepareAst pass = new PrepareAst(compiler, false);
    pass.process(null, root);

    assertNull(num.getJSDocInfo());
  }

  @Test
  public void testNormalizeObjectLiteralKeyAnnotations_keyWithoutDoc() {
    Node fn = IR.function(IR.name(""), IR.paramList(), IR.block());
    Node key = IR.stringKey("foo", fn);
    Node objLit = IR.objectlit(key);
    Node root = IR.script(IR.exprResult(objLit));

    PrepareAst pass = new PrepareAst(compiler, false);
    pass.process(null, root);

    assertNull(fn.getJSDocInfo());
  }

  @Test
  public void testNormalizeNodeTypes_checkOnly_validStructurePasses() {
    Node validBlock = IR.block(IR.exprResult(IR.name("a")));
    Node ifNode = IR.ifNode(IR.name("cond"), validBlock);
    Node root = IR.script(ifNode);

    PrepareAst pass = new PrepareAst(compiler, true);
    pass.process(null, root);
  }

  @Test
  public void testNormalizeNodeTypes_checkOnly_invalidParent_throwsException() {
    Node child = IR.exprResult(IR.name("a"));
    Node root = IR.script();
    root.addChildToBack(child);
    child.setParent(IR.script());

    PrepareAst pass = new PrepareAst(compiler, true);
    try {
      pass.process(null, root);
      fail("Expected IllegalStateException due to parent mismatch");
    } catch (IllegalStateException expected) {
      // expected
    }
  }

  @Test
  public void testNormalizeBlocks_checkOnly_nonEmptyBlockNormalized_throwsException() {
    Node nonBlockThen = IR.exprResult(IR.name("a"));
    Node ifNode = IR.ifNode(IR.name("cond"), nonBlockThen);
    Node root = IR.script(ifNode);

    PrepareAst pass = new PrepareAst(compiler, true);
    try {
      pass.process(null, root);
      fail("Expected IllegalStateException when modifying AST in checkOnly mode");
    } catch (IllegalStateException e) {
      assertTrue(e.getMessage().contains("normalizeNodeType constraints violated"));
    }
  }

  @Test
  public void testNormalizeBlocks_checkOnly_emptyBlockNormalized_throwsException() {
    Node emptyThen = IR.empty();
    Node ifNode = IR.ifNode(IR.name("cond"), emptyThen);
    Node root = IR.script(ifNode);

    PrepareAst pass = new PrepareAst(compiler, true);
    try {
      pass.process(null, root);
      fail("Expected IllegalStateException when modifying AST in checkOnly mode");
    } catch (IllegalStateException e) {
      assertTrue(e.getMessage().contains("normalizeNodeType constraints violated"));
    }
  }

  @Test
  public void testNormalizeBlocks_checkOnly_switchAndLabelIgnored() {
    Node switchNode = IR.switchNode(IR.name("cond"));
    Node labelNode = IR.label(IR.name("lbl"), IR.block());
    Node root = IR.script(switchNode, labelNode);

    PrepareAst pass = new PrepareAst(compiler, true);
    pass.process(null, root);
  }
}
