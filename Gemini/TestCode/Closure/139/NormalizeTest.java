package com.google.javascript.jscomp;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

import static org.junit.Assert.*;

public class NormalizeTest {

  private Node parse(Compiler compiler, String js) {
    Node root = compiler.parseTestCode(js);
    assertNotNull(root);
    return root;
  }

  @Test
  public void testProcess_simpleVarAndWhile() {
    Compiler compiler = new Compiler();
    Node root = parse(compiler, "while (true) { var a = 1, b = 2; }");
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    assertNotNull(root);
  }

  @Test
  public void testProcess_forLoopInitializerExtracted() {
    Compiler compiler = new Compiler();
    Node root = parse(compiler, "for (var i = 0; i < 10; i++) {} for (i = 0; i < 10; i++) {}");
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    assertNotNull(root);
  }

  @Test
  public void testProcess_forInLoopNotExtracted() {
    Compiler compiler = new Compiler();
    Node root = parse(compiler, "for (var k in obj) {}");
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    assertNotNull(root);
  }

  @Test
  public void testProcess_labelNormalization() {
    Compiler compiler = new Compiler();
    String js = "lbl1: x = 1; "
        + "lbl2: { x = 2; } "
        + "lbl3: for (;;) {} "
        + "lbl4: while (false) {} "
        + "lbl5: do {} while (false); "
        + "lbl6: lbl7: y = 3;";
    Node root = parse(compiler, js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    assertNotNull(root);
  }

  @Test
  public void testProcess_extractForInitializerInsideLabel() {
    Compiler compiler = new Compiler();
    Node root = parse(compiler, "label1: for (var i = 0; i < 10; i++) {}");
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    assertNotNull(root);
  }

  @Test
  public void testProcess_moveNamedFunctionsToTop() {
    Compiler compiler = new Compiler();
    String js = "function test() { var a = 1; function f() {} var b = 2; function g() {} }";
    Node root = parse(compiler, js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    assertNotNull(root);
  }

  @Test
  public void testProcess_moveNamedFunctionsAlreadyAtTop() {
    Compiler compiler = new Compiler();
    String js = "function test() { function f() {} function g() {} var a = 1; }";
    Node root = parse(compiler, js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    assertNotNull(root);
  }

  @Test
  public void testProcess_duplicateVarDeclarations() {
    Compiler compiler = new Compiler();
    String js = "var a = 1; var a = 2; var a;";
    Node root = parse(compiler, js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    assertNotNull(root);
  }

  @Test
  public void testProcess_duplicateVarInForIn() {
    Compiler compiler = new Compiler();
    String js = "var a; for (var a in obj) {}";
    Node root = parse(compiler, js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    assertNotNull(root);
  }

  @Test
  public void testProcess_duplicateVarInLabel() {
    Compiler compiler = new Compiler();
    String js = "var a; label: var a;";
    Node root = parse(compiler, js);
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    assertNotNull(root);
  }

  @Test(expected = IllegalStateException.class)
  public void testProcess_assertOnChange_violatesConstraintThrows() {
    Compiler compiler = new Compiler();
    Node root = parse(compiler, "while (true) {}");
    Node externs = new Node(Token.BLOCK);

    Normalize normalize = new Normalize(compiler, true);
    normalize.process(externs, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testNormalizeStatements_emptyVarWithAssertOnChange_throws() {
    Compiler compiler = new Compiler();
    Node script = new Node(Token.SCRIPT);
    Node emptyVar = new Node(Token.VAR);
    script.addChildToFront(emptyVar);

    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, true);
    NodeTraversal.traverse(compiler, script, ns);
  }

  @Test
  public void testPropogateConstantAnnotations_process() {
    Compiler compiler = new Compiler();
    Node root = parse(compiler, "/** @const */ var FOO = 1; var b = FOO;");
    Node externs = new Node(Token.BLOCK);

    Normalize.PropogateConstantAnnotations pass =
        new Normalize.PropogateConstantAnnotations(compiler, false);
    pass.process(externs, root);

    assertNotNull(root);
  }

  @Test
  public void testPropogateConstantAnnotations_emptyNameNode() {
    Compiler compiler = new Compiler();
    Node root = new Node(Token.SCRIPT);
    Node emptyName = new Node(Token.NAME, "");
    root.addChildToFront(emptyName);
    Node externs = new Node(Token.BLOCK);

    Normalize.PropogateConstantAnnotations pass =
        new Normalize.PropogateConstantAnnotations(compiler, false);
    pass.process(externs, root);

    assertEquals("", emptyName.getString());
  }

  @Test(expected = IllegalStateException.class)
  public void testPropogateConstantAnnotations_assertOnChangeThrows() {
    Compiler compiler = new Compiler();
    Node script = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "CONST_VAL");
    
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordConstancy();
    JSDocInfo info = builder.build(varNode);
    varNode.setJSDocInfo(info);
    varNode.addChildToFront(nameNode);
    script.addChildToFront(varNode);

    Node nameUsage = Node.newString(Token.NAME, "CONST_VAL");
    Node expr = new Node(Token.EXPR_RESULT, nameUsage);
    script.addChildToBack(expr);

    Node externs = new Node(Token.BLOCK);
    Normalize.PropogateConstantAnnotations pass =
        new Normalize.PropogateConstantAnnotations(compiler, true);
    pass.process(externs, script);
  }

  @Test
  public void testVerifyConstants_validConstants() {
    Compiler compiler = new Compiler();
    Node root = parse(compiler, "var A = 1; var B = A;");
    Node externs = new Node(Token.BLOCK);
    Node parent = new Node(Token.BLOCK, externs, root);

    Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, false);
    verifier.process(externs, root);

    assertNotNull(parent);
  }

  @Test
  public void testVerifyConstants_emptyNameIgnored() {
    Compiler compiler = new Compiler();
    Node root = new Node(Token.SCRIPT);
    Node emptyName = new Node(Token.NAME, "");
    root.addChildToFront(emptyName);
    Node externs = new Node(Token.BLOCK);
    new Node(Token.BLOCK, externs, root);

    Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, true);
    verifier.process(externs, root);

    assertEquals("", emptyName.getString());
  }

  @Test(expected = IllegalStateException.class)
  public void testVerifyConstants_missingParentThrows() {
    Compiler compiler = new Compiler();
    Node root = parse(compiler, "var a = 1;");
    Node externs = new Node(Token.BLOCK);

    Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, false);
    verifier.process(externs, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testVerifyConstants_inconsistentAnnotationThrows() {
    Compiler compiler = new Compiler();
    Node root = new Node(Token.SCRIPT);
    Node name1 = Node.newString(Token.NAME, "X");
    name1.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    Node name2 = Node.newString(Token.NAME, "X");
    name2.putBooleanProp(Node.IS_CONSTANT_NAME, false);
    root.addChildToBack(new Node(Token.EXPR_RESULT, name1));
    root.addChildToBack(new Node(Token.EXPR_RESULT, name2));

    Node externs = new Node(Token.BLOCK);
    new Node(Token.BLOCK, externs, root);

    Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, false);
    verifier.process(externs, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testVerifyConstants_userDeclarationsMismatchThrows() {
    Compiler compiler = new Compiler();
    Node root = parse(compiler, "var a = 1;");
    Node nameNode = root.getFirstChild().getFirstChild();
    nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);

    Node externs = new Node(Token.BLOCK);
    new Node(Token.BLOCK, externs, root);

    Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, true);
    verifier.process(externs, root);
  }

  @Test
  public void testVerifyConstants_withJSDocConstant() {
    Compiler compiler = new Compiler();
    Node root = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "nonCapsName");
    nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordConstancy();
    varNode.setJSDocInfo(builder.build(varNode));
    varNode.addChildToFront(nameNode);
    root.addChildToFront(varNode);

    Node externs = new Node(Token.BLOCK);
    new Node(Token.BLOCK, externs, root);

    Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, true);
    verifier.process(externs, root);

    assertTrue(nameNode.getBooleanProp(Node.IS_CONSTANT_NAME));
  }
}
