package com.google.javascript.jscomp;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class NormalizeTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private Node parse(String js) {
    return compiler.parseTestCode(js);
  }

  private void testNormalize(String js) {
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);
  }

  @Test
  public void testProcess_splitVarDeclarations() {
    String js = "var a = 1, b = 2, c = 3;";
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    // After normalization, the SCRIPT node should have 3 VAR children
    Node script = root.getFirstChild();
    assertEquals(Token.VAR, script.getFirstChild().getType());
    assertEquals(Token.VAR, script.getFirstChild().getNext().getType());
    assertEquals(Token.VAR, script.getFirstChild().getNext().getNext().getType());
  }

  @Test
  public void testProcess_convertWhileToFor() {
    String js = "while (x < 10) { x++; }";
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    assertEquals(Token.FOR, script.getFirstChild().getType());
  }

  @Test
  public void testProcess_extractForInitializer_var() {
    String js = "for (var i = 0; i < 10; i++) {}";
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    assertEquals(Token.VAR, script.getFirstChild().getType());
    assertEquals(Token.FOR, script.getFirstChild().getNext().getType());
  }

  @Test
  public void testProcess_extractForInitializer_expr() {
    String js = "var i; for (i = 0; i < 10; i++) {}";
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    assertEquals(Token.VAR, script.getFirstChild().getType());
    assertEquals(Token.EXPR_RESULT, script.getFirstChild().getNext().getType());
    assertEquals(Token.FOR, script.getFirstChild().getNext().getNext().getType());
  }

  @Test
  public void testProcess_forIn_noExtractInitializer() {
    String js = "for (var k in obj) {}";
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    assertEquals(Token.FOR, script.getFirstChild().getType());
    assertTrue(NodeUtil.isForIn(script.getFirstChild()));
  }

  @Test
  public void testProcess_labelNormalization_nonBlockChild() {
    String js = "foo: x = 1;";
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    Node label = script.getFirstChild();
    assertEquals(Token.LABEL, label.getType());
    assertEquals(Token.BLOCK, label.getLastChild().getType());
  }

  @Test
  public void testProcess_labelNormalization_loopChildren() {
    String js = "foo: while (x) { break foo; } bar: for (; y;) {} baz: do {} while (z);";
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    assertEquals(Token.LABEL, script.getFirstChild().getType());
    assertEquals(Token.FOR, script.getFirstChild().getLastChild().getType());
  }

  @Test
  public void testProcess_extractForInitializer_underLabel() {
    String js = "lab: for (var i = 0; i < 10; i++) {}";
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    assertEquals(Token.VAR, script.getFirstChild().getType());
    assertEquals(Token.LABEL, script.getLastChild().getType());
  }

  @Test
  public void testProcess_nestedLabels_extractForInitializer() {
    String js = "lab1: lab2: for (var i = 0; i < 10; i++) {}";
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    assertEquals(Token.VAR, script.getFirstChild().getType());
  }

  @Test
  public void testProcess_moveNamedFunctions_reorderFunctions() {
    String js = "function f() { x(); function g() {} function h() {} }";
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node f = root.getFirstChild().getFirstChild();
    Node fBody = f.getLastChild();
    // After moving, g and h should be at the front before x()
    assertEquals(Token.FUNCTION, fBody.getFirstChild().getType());
    assertEquals(Token.FUNCTION, fBody.getFirstChild().getNext().getType());
    assertEquals(Token.EXPR_RESULT, fBody.getFirstChild().getNext().getNext().getType());
  }

  @Test
  public void testProcess_moveNamedFunctions_alreadyAtFront() {
    String js = "function f() { function g() {} x(); }";
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node f = root.getFirstChild().getFirstChild();
    Node fBody = f.getLastChild();
    assertEquals(Token.FUNCTION, fBody.getFirstChild().getType());
    assertEquals(Token.EXPR_RESULT, fBody.getFirstChild().getNext().getType());
  }

  @Test
  public void testProcess_duplicateVarDeclaration_withInit() {
    String js = "var a = 1; var a = 2;";
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    assertEquals(Token.VAR, script.getFirstChild().getType());
    assertEquals(Token.EXPR_RESULT, script.getFirstChild().getNext().getType());
  }

  @Test
  public void testProcess_duplicateVarDeclaration_emptyInBlock() {
    String js = "var a = 1; var a;";
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    // Second var a; should be removed completely
    assertEquals(Token.VAR, script.getFirstChild().getType());
    assertEquals(null, script.getFirstChild().getNext());
  }

  @Test
  public void testProcess_duplicateVarDeclaration_forIn() {
    String js = "var a = 1; for (var a in obj) {}";
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    Node forNode = script.getFirstChild().getNext();
    assertEquals(Token.FOR, forNode.getType());
    assertEquals(Token.NAME, forNode.getFirstChild().getType());
  }

  @Test
  public void testProcess_duplicateVarDeclaration_label() {
    String js = "var a = 1; lab: var a;";
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node script = root.getFirstChild();
    Node labelNode = script.getFirstChild().getNext();
    assertEquals(Token.LABEL, labelNode.getType());
    assertEquals(Token.EMPTY, labelNode.getLastChild().getType());
  }

  @Test
  public void testProcess_assertOnChange_throwsOnWhile() {
    String js = "while (true) {}";
    Node root = parse(js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, true);
    try {
      normalize.process(externs, root);
      fail("Expected IllegalStateException due to assertOnChange");
    } catch (IllegalStateException e) {
      assertTrue(e.getMessage().contains("Normalize constraints violated"));
    }
  }

  @Test
  public void testNormalizeStatements_assertOnChange_emptyVar() {
    Node varNode = new Node(Token.VAR);
    Node block = new Node(Token.BLOCK, varNode);

    Normalize.NormalizeStatements statements =
        new Normalize.NormalizeStatements(compiler, true);
    try {
      statements.shouldTraverse(null, block, null);
      fail("Expected IllegalStateException for empty VAR node");
    } catch (IllegalStateException e) {
      assertTrue(e.getMessage().contains("Empty VAR node"));
    }
  }

  @Test
  public void testPropogateConstantAnnotations_simple() {
    Node root = parse("var a = 1; a;");
    Node externs = new Node(Token.BLOCK);

    // Mark the var 'a' as constant via JSDoc
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordConstancy();
    JSDocInfo info = builder.build(null);

    Node script = root.getFirstChild();
    Node varNode = script.getFirstChild();
    varNode.setJSDocInfo(info);

    Normalize.PropogateConstantAnnotations pass =
        new Normalize.PropogateConstantAnnotations(compiler, false);
    pass.process(externs, root);

    Node nameRef = script.getLastChild().getFirstChild();
    assertTrue(nameRef.getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  @Test
  public void testPropogateConstantAnnotations_emptyNameNode() {
    Node emptyName = Node.newString(Token.NAME, "");
    Node block = new Node(Token.BLOCK, emptyName);
    Normalize.PropogateConstantAnnotations pass =
        new Normalize.PropogateConstantAnnotations(compiler, false);
    pass.process(new Node(Token.BLOCK), block);
    assertFalse(emptyName.getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  @Test
  public void testPropogateConstantAnnotations_assertOnChange_throws() {
    Node root = parse("var a = 1; a;");
    Node externs = new Node(Token.BLOCK);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordConstancy();
    root.getFirstChild().getFirstChild().setJSDocInfo(builder.build(null));

    Normalize.PropogateConstantAnnotations pass =
        new Normalize.PropogateConstantAnnotations(compiler, true);
    try {
      pass.process(externs, root);
      fail("Expected IllegalStateException when assertOnChange is true for PropogateConstantAnnotations");
    } catch (IllegalStateException e) {
      assertTrue(e.getMessage().contains("Unexpected const change"));
    }
  }

  @Test
  public void testVerifyConstants_validCase() {
    Node root = parse("var A = 1; A;");
    Node externs = new Node(Token.BLOCK);
    Node parent = new Node(Token.BLOCK, externs, root);

    // Set IS_CONSTANT_NAME on matching naming convention
    root.getFirstChild().getFirstChild().putBooleanProp(Node.IS_CONSTANT_NAME, true);
    root.getLastChild().getFirstChild().putBooleanProp(Node.IS_CONSTANT_NAME, true);

    Normalize.VerifyConstants verifier =
        new Normalize.VerifyConstants(compiler, true);
    verifier.process(externs, root);
  }

  @Test
  public void testVerifyConstants_inconsistentConstantUsage_throws() {
    Node root = parse("var a = 1; a;");
    Node externs = new Node(Token.BLOCK);
    Node parent = new Node(Token.BLOCK, externs, root);

    // One has IS_CONSTANT_NAME true, the other false
    root.getFirstChild().getFirstChild().putBooleanProp(Node.IS_CONSTANT_NAME, true);
    root.getLastChild().getFirstChild().putBooleanProp(Node.IS_CONSTANT_NAME, false);

    Normalize.VerifyConstants verifier =
        new Normalize.VerifyConstants(compiler, false);
    try {
      verifier.process(externs, root);
      fail("Expected IllegalStateException due to inconsistent constant annotation");
    } catch (IllegalStateException e) {
      assertTrue(e.getMessage().contains("not consistently annotated"));
    }
  }

  @Test
  public void testVerifyConstants_missingAnnotation_throws() {
    Node root = parse("var CONST_VAL = 1;");
    Node externs = new Node(Token.BLOCK);
    Node parent = new Node(Token.BLOCK, externs, root);

    Normalize.VerifyConstants verifier =
        new Normalize.VerifyConstants(compiler, true);
    try {
      verifier.process(externs, root);
      fail("Expected IllegalStateException due to missing const annotation");
    } catch (IllegalStateException e) {
      assertTrue(e.getMessage().contains("is not annotated as constant"));
    }
  }

  @Test
  public void testVerifyConstants_unexpectedAnnotation_throws() {
    Node root = parse("var nonConst = 1;");
    Node externs = new Node(Token.BLOCK);
    Node parent = new Node(Token.BLOCK, externs, root);

    root.getFirstChild().getFirstChild().putBooleanProp(Node.IS_CONSTANT_NAME, true);

    Normalize.VerifyConstants verifier =
        new Normalize.VerifyConstants(compiler, true);
    try {
      verifier.process(externs, root);
      fail("Expected IllegalStateException due to unexpected const annotation");
    } catch (IllegalStateException e) {
      assertTrue(e.getMessage().contains("should not be annotated as constant"));
    }
  }

  @Test
  public void testVerifyConstants_withJSDocConst() {
    Node root = parse("var a = 1;");
    Node externs = new Node(Token.BLOCK);
    Node parent = new Node(Token.BLOCK, externs, root);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordConstancy();
    root.getFirstChild().setJSDocInfo(builder.build(null));
    root.getFirstChild().getFirstChild().putBooleanProp(Node.IS_CONSTANT_NAME, true);

    Normalize.VerifyConstants verifier =
        new Normalize.VerifyConstants(compiler, true);
    verifier.process(externs, root);
  }

  @Test
  public void testVerifyConstants_emptyNameNode() {
    Node emptyName = Node.newString(Token.NAME, "");
    Node root = new Node(Token.BLOCK, emptyName);
    Node externs = new Node(Token.BLOCK);
    Node parent = new Node(Token.BLOCK, externs, root);

    Normalize.VerifyConstants verifier =
        new Normalize.VerifyConstants(compiler, true);
    verifier.process(externs, root);
  }

  @Test
  public void testNormalizeStatements_normalizeLabels_blockAndLoops() {
    Node blockLabel = new Node(Token.LABEL, Node.newString(Token.NAME, "l1"), new Node(Token.BLOCK));
    Node whileLabel = new Node(Token.LABEL, Node.newString(Token.NAME, "l2"), new Node(Token.WHILE, new Node(Token.TRUE), new Node(Token.BLOCK)));
    Node forLabel = new Node(Token.LABEL, Node.newString(Token.NAME, "l3"), new Node(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.BLOCK)));
    Node doLabel = new Node(Token.LABEL, Node.newString(Token.NAME, "l4"), new Node(Token.DO, new Node(Token.BLOCK), new Node(Token.TRUE)));
    Node labelLabel = new Node(Token.LABEL, Node.newString(Token.NAME, "l5"), new Node(Token.LABEL, Node.newString(Token.NAME, "l6"), new Node(Token.BLOCK)));

    Node root = new Node(Token.BLOCK, blockLabel, whileLabel, forLabel, doLabel, labelLabel);

    Normalize.NormalizeStatements statements =
        new Normalize.NormalizeStatements(compiler, false);
    statements.shouldTraverse(null, root, null);
    statements.shouldTraverse(null, blockLabel, root);
    statements.shouldTraverse(null, whileLabel, root);
    statements.shouldTraverse(null, forLabel, root);
    statements.shouldTraverse(null, doLabel, root);
    statements.shouldTraverse(null, labelLabel, root);

    assertEquals(Token.BLOCK, blockLabel.getLastChild().getType());
  }

  @Test
  public void testCatchBlockExceptionNameCollision() {
    String js = "function f() { try { throw 0; } catch(e) { e; } var e = 1; }";
    testNormalize(js);
  }
}
