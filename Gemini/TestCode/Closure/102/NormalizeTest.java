package com.google.javascript.jscomp;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NormalizeTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private Node parse(String js) {
    return compiler.parseTestCode(js);
  }

  private Node createExternsAndJsRoot(Node externs, Node main) {
    Node parent = new Node(Token.BLOCK, externs, main);
    return parent;
  }

  @Test
  public void testProcess_whileToForConversion() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("while(true) { var x = 1; }");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    Assert.assertNotNull(script);
    Node forNode = script.getFirstChild();
    Assert.assertEquals(Token.FOR, forNode.getType());
  }

  @Test
  public void testProcess_splitVarDeclarations() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("var a = 1, b = 2, c = 3;");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    int varCount = 0;
    for (Node c = script.getFirstChild(); c != null; c = c.getNext()) {
      if (c.getType() == Token.VAR) {
        varCount++;
        Assert.assertEquals(1, c.getChildCount());
      }
    }
    Assert.assertEquals(3, varCount);
  }

  @Test
  public void testProcess_extractForInitializers_var() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("for (var i = 0; i < 10; i++) {}");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    Assert.assertEquals(Token.VAR, script.getFirstChild().getType());
    Assert.assertEquals(Token.FOR, script.getFirstChild().getNext().getType());
  }

  @Test
  public void testProcess_extractForInitializers_expr() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("var i; for (i = 0; i < 10; i++) {}");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    Node first = script.getFirstChild(); // var i;
    Node second = first.getNext();       // expr: i = 0
    Node third = second.getNext();       // for (;; i++)
    Assert.assertEquals(Token.VAR, first.getType());
    Assert.assertEquals(Token.EXPR_RESULT, second.getType());
    Assert.assertEquals(Token.FOR, third.getType());
  }

  @Test
  public void testProcess_extractForInitializers_inLabel() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("label1: for (var i = 0; i < 10; i++) {}");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    Assert.assertEquals(Token.VAR, script.getFirstChild().getType());
    Assert.assertEquals(Token.LABEL, script.getFirstChild().getNext().getType());
  }

  @Test
  public void testProcess_normalizeLabels_nonBlockNonLoop() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("label1: x = 1;");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    Node label = script.getFirstChild();
    Assert.assertEquals(Token.LABEL, label.getType());
    Assert.assertEquals(Token.BLOCK, label.getLastChild().getType());
  }

  @Test
  public void testProcess_normalizeLabels_alreadyBlockOrLoop() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("label1: { x = 1; } label2: while(true) {}");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    Node label1 = script.getFirstChild();
    Assert.assertEquals(Token.BLOCK, label1.getLastChild().getType());
  }

  @Test
  public void testProcess_moveNamedFunctions() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("function foo() { var a = 1; function bar() {} var b = 2; function baz() {} }");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    Node foo = script.getFirstChild();
    Node body = foo.getLastChild();

    Node first = body.getFirstChild();
    Node second = first.getNext();
    Assert.assertEquals(Token.FUNCTION, first.getType());
    Assert.assertEquals(Token.FUNCTION, second.getType());
  }

  @Test
  public void testProcess_removeDuplicateVar_initialized() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("var a = 1; var a = 2;");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    Node first = script.getFirstChild();
    Node second = first.getNext();

    Assert.assertEquals(Token.VAR, first.getType());
    Assert.assertEquals(Token.EXPR_RESULT, second.getType());
  }

  @Test
  public void testProcess_removeDuplicateVar_uninitializedInBlock() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("var a = 1; var a;");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    Assert.assertEquals(Token.VAR, script.getFirstChild().getType());
    Assert.assertNull(script.getFirstChild().getNext());
  }

  @Test
  public void testProcess_removeDuplicateVar_inForIn() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("var a; for (var a in obj) {}");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    Node forIn = script.getLastChild();
    Assert.assertEquals(Token.FOR, forIn.getType());
    Assert.assertEquals(Token.NAME, forIn.getFirstChild().getType());
  }

  @Test
  public void testProcess_removeDuplicateVar_inLabel() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("var a = 1; L: var a;");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    Node label = script.getLastChild();
    Assert.assertEquals(Token.LABEL, label.getType());
    Assert.assertEquals(Token.EMPTY, label.getLastChild().getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testProcess_assertOnChange_throwsOnModification() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("var a = 1, b = 2;");
    Normalize normalize = new Normalize(compiler, true);
    normalize.process(externs, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testSplitVarDeclarations_emptyVarWithAssertOnChange_throws() {
    Node externs = new Node(Token.BLOCK);
    Node script = new Node(Token.SCRIPT);
    Node emptyVar = new Node(Token.VAR);
    script.addChildToFront(emptyVar);
    Node root = new Node(Token.BLOCK, script);

    Normalize normalize = new Normalize(compiler, true);
    normalize.process(externs, root);
  }

  @Test
  public void testPropogateConstantAnnotations_basic() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("/** @const */ var CONST_VAL = 10; var y = CONST_VAL;");

    Normalize.PropogateConstantAnnotations pass =
        new Normalize.PropogateConstantAnnotations(compiler, false);
    pass.process(externs, root);

    Node script = root.getFirstChild();
    Node varNode = script.getFirstChild();
    Node constNameNode = varNode.getFirstChild();
    Assert.assertTrue(constNameNode.getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  @Test(expected = IllegalStateException.class)
  public void testPropogateConstantAnnotations_assertOnChangeThrows() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("/** @const */ var CONST_VAL = 10; var y = CONST_VAL;");

    Normalize.PropogateConstantAnnotations pass =
        new Normalize.PropogateConstantAnnotations(compiler, true);
    pass.process(externs, root);
  }

  @Test
  public void testPropogateConstantAnnotations_emptyName() {
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.SCRIPT, new Node(Token.NAME, ""));
    Normalize.PropogateConstantAnnotations pass =
        new Normalize.PropogateConstantAnnotations(compiler, false);
    pass.process(externs, root);
  }

  @Test
  public void testVerifyConstants_valid() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("var a = 1;");
    createExternsAndJsRoot(externs, root);

    Normalize.VerifyConstants verifier =
        new Normalize.VerifyConstants(compiler, false);
    verifier.process(externs, root);
  }

  @Test
  public void testVerifyConstants_emptyNameIgnored() {
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.SCRIPT, new Node(Token.NAME, ""));
    createExternsAndJsRoot(externs, root);

    Normalize.VerifyConstants verifier =
        new Normalize.VerifyConstants(compiler, false);
    verifier.process(externs, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testVerifyConstants_inconsistentAnnotation_throws() {
    Node externs = new Node(Token.BLOCK);
    Node name1 = Node.newString(Token.NAME, "dupName");
    name1.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    Node name2 = Node.newString(Token.NAME, "dupName");
    name2.putBooleanProp(Node.IS_CONSTANT_NAME, false);

    Node script = new Node(Token.SCRIPT, name1, name2);
    Node root = new Node(Token.BLOCK, script);
    createExternsAndJsRoot(externs, root);

    Normalize.VerifyConstants verifier =
        new Normalize.VerifyConstants(compiler, false);
    verifier.process(externs, root);
  }

  @Test
  public void testVerifyConstants_checkUserDeclarations_matchingConst() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("var A_CONST = 1;");
    Node name = root.getFirstChild().getFirstChild().getFirstChild();
    name.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    createExternsAndJsRoot(externs, root);

    Normalize.VerifyConstants verifier =
        new Normalize.VerifyConstants(compiler, true);
    verifier.process(externs, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testVerifyConstants_checkUserDeclarations_mismatchedConst_throws() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("var A_CONST = 1;");
    // Name is constant by naming convention but not marked as IS_CONSTANT_NAME
    createExternsAndJsRoot(externs, root);

    Normalize.VerifyConstants verifier =
        new Normalize.VerifyConstants(compiler, true);
    verifier.process(externs, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testVerifyConstants_checkUserDeclarations_shouldNotBeConst_throws() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("var normalVar = 1;");
    Node name = root.getFirstChild().getFirstChild().getFirstChild();
    name.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    createExternsAndJsRoot(externs, root);

    Normalize.VerifyConstants verifier =
        new Normalize.VerifyConstants(compiler, true);
    verifier.process(externs, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testVerifyConstants_nullParent_throws() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("var a = 1;");
    // root has no parent, should throw checkState exception
    Normalize.VerifyConstants verifier =
        new Normalize.VerifyConstants(compiler, false);
    verifier.process(externs, root);
  }

  @Test
  public void testVerifyConstants_withJSDocConstant() {
    Node externs = new Node(Token.BLOCK);
    Node root = parse("/** @const */ var notCapName = 1;");
    Node name = root.getFirstChild().getFirstChild().getFirstChild();
    name.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    createExternsAndJsRoot(externs, root);

    Normalize.VerifyConstants verifier =
        new Normalize.VerifyConstants(compiler, true);
    verifier.process(externs, root);
  }
}
