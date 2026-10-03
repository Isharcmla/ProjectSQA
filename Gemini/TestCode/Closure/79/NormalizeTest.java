package com.google.javascript.jscomp;

import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.rhino.JSDocInfo;
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
    compiler.initCompilerOptionsIfTesting();
  }

  private Node parse(String js) {
    return compiler.parseTestCode(js);
  }

  private Node parseExterns(String js) {
    return compiler.parseTestCode(js);
  }

  private void testNormalize(String js, String expected) {
    Node root = parse(js);
    Node externs = parseExterns("");
    Node rootParent = new Node(Token.BLOCK, externs, root);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node expectedRoot = parse(expected);
    String resultTree = compiler.toSource(root);
    String expectedTree = compiler.toSource(expectedRoot);
    Assert.assertEquals(expectedTree, resultTree);
  }

  @Test
  public void testProcess_splitVarDeclarations() {
    String js = "var a = 1, b = 2, c = 3;";
    String expected = "var a = 1; var b = 2; var c = 3;";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_splitVarDeclarations_withoutInitializers() {
    String js = "var a, b, c;";
    String expected = "var a; var b; var c;";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_whileToForConversion() {
    String js = "while (x < 10) { x++; }";
    String expected = "for (; x < 10;) { x++; }";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_forInitializerExtraction() {
    String js = "for (var i = 0; i < 10; i++) { alert(i); }";
    String expected = "var i = 0; for (; i < 10; i++) { alert(i); }";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_forInVarExtraction() {
    String js = "for (var k in obj) { alert(k); }";
    String expected = "var k; for (k in obj) { alert(k); }";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_forNonVarInitializerExtraction() {
    String js = "var i; for (i = 0; i < 10; i++) { alert(i); }";
    String expected = "var i; i = 0; for (; i < 10; i++) { alert(i); }";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_normalizeLabels_blockNeeded() {
    String js = "label: a = 1;";
    String expected = "label: { a = 1; }";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_normalizeLabels_blockAlreadyPresent() {
    String js = "label: { a = 1; }";
    String expected = "label: { a = 1; }";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_normalizeLabels_loopsPreserved() {
    String js = "label: for (;;) { break label; }";
    String expected = "label: for (;;) { break label; }";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_normalizeLabels_whileLoopPreserved() {
    String js = "label: while (true) { break label; }";
    String expected = "label: for (; true;) { break label; }";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_normalizeLabels_doWhileLoopPreserved() {
    String js = "label: do { break label; } while (true);";
    String expected = "label: do { break label; } while (true);";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_labeledForInVarExtraction() {
    String js = "lab: for (var k in obj) { break lab; }";
    String expected = "var k; lab: for (k in obj) { break lab; }";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_unhoistedNamedFunctionDeclaration() {
    String js = "if (true) { function f() {} }";
    String expected = "if (true) { var f = function() {}; }";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_moveNamedFunctionsInFunctionScope() {
    String js = "function g() { var x = 1; function f() {} return x; }";
    String expected = "function g() { function f() {} var x = 1; return x; }";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_moveNamedFunctionsAlreadyAtTop() {
    String js = "function g() { function f1() {} function f2() {} var x = 1; return x; }";
    String expected = "function g() { function f1() {} function f2() {} var x = 1; return x; }";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_removeDuplicateVarDeclarations() {
    String js = "var a = 1; var a = 2;";
    String expected = "var a = 1; a = 2;";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_removeDuplicateEmptyVarDeclarations() {
    String js = "var a = 1; var a;";
    String expected = "var a = 1;";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_duplicateVarAndFunctionDeclaration() {
    String js = "var f = 1; function f() {}";
    String expected = "f = 1; function f() {}";
    testNormalize(js, expected);
  }

  @Test
  public void testProcess_duplicateDeclarationInExternsAllowed() {
    Node externs = parseExterns("var x;");
    Node root = parse("var x = 1;");
    Node rootParent = new Node(Token.BLOCK, externs, root);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals("var x = 1", compiler.toSource(root));
  }

  @Test
  public void testProcess_duplicateCatchVarThrowsError() {
    String js = "function f() { try {} catch (e) { var e = 1; } }";
    Node root = parse(js);
    Node externs = parseExterns("");
    Node rootParent = new Node(Token.BLOCK, externs, root);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(Normalize.CATCH_BLOCK_VAR_ERROR.key, compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testParseAndNormalizeSyntheticCode() {
    Node node = Normalize.parseAndNormalizeSyntheticCode(compiler, "var a = 1, b = 2;", "prefix_");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.BLOCK, node.getType());
    Assert.assertEquals(2, node.getChildCount());
  }

  @Test
  public void testParseAndNormalizeTestCode() {
    Node node = Normalize.parseAndNormalizeTestCode(compiler, "var a = 1, b = 2;", "prefix_");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.BLOCK, node.getType());
    Assert.assertEquals(2, node.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testProcess_assertOnChange_throwsExceptionOnModification() {
    Node root = parse("var a = 1, b = 2;");
    Node externs = parseExterns("");
    Node rootParent = new Node(Token.BLOCK, externs, root);

    Normalize normalize = new Normalize(compiler, true);
    normalize.process(externs, root);
  }

  @Test
  public void testLifeCycleStageIsSetToNormalized() {
    compiler.setLifeCycleStage(LifeCycleStage.RAW);
    Node root = parse("var a = 1;");
    Node externs = parseExterns("");
    new Node(Token.BLOCK, externs, root);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Assert.assertTrue(compiler.getLifeCycleStage().isNormalized());
  }

  @Test
  public void testPropagateConstantAnnotationsOverVars_constantAnnotation() {
    Node externs = parseExterns("");
    Node root = parse("/** @const */ var CONST_NAME = 1; var y = CONST_NAME;");
    new Node(Token.BLOCK, externs, root);

    Normalize.PropagateConstantAnnotationsOverVars pass =
        new Normalize.PropagateConstantAnnotationsOverVars(compiler, false);
    pass.process(externs, root);

    Node varNode = root.getFirstChild();
    Node nameNode = varNode.getFirstChild();
    Assert.assertTrue(nameNode.getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  @Test(expected = IllegalStateException.class)
  public void testPropagateConstantAnnotationsOverVars_assertOnChangeThrows() {
    Node externs = parseExterns("");
    Node root = parse("/** @const */ var CONST_NAME = 1;");
    new Node(Token.BLOCK, externs, root);

    Normalize.PropagateConstantAnnotationsOverVars pass =
        new Normalize.PropagateConstantAnnotationsOverVars(compiler, true);
    pass.process(externs, root);
  }

  @Test
  public void testVerifyConstants_validConstantsPass() {
    Node externs = parseExterns("");
    Node root = parse("var CONST_VAL = 1; var b = CONST_VAL;");
    Node parent = new Node(Token.BLOCK, externs, root);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, false);
    verifier.process(externs, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testVerifyConstants_inconsistentConstantAnnotations_throwsException() {
    Node externs = parseExterns("");
    Node root = parse("var CONST_A = 1; var b = CONST_A;");
    Node parent = new Node(Token.BLOCK, externs, root);

    Node firstConst = root.getFirstChild().getFirstChild();
    firstConst.putBooleanProp(Node.IS_CONSTANT_NAME, true);

    Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, false);
    verifier.process(externs, root);
  }

  @Test
  public void testVerifyConstants_checkUserDeclarations() {
    Node externs = parseExterns("");
    Node root = parse("var CONST_A = 1;");
    Node parent = new Node(Token.BLOCK, externs, root);

    Node nameNode = root.getFirstChild().getFirstChild();
    nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);

    Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, true);
    verifier.process(externs, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testVerifyConstants_checkUserDeclarations_missingAnnotation_throws() {
    Node externs = parseExterns("");
    Node root = parse("var CONST_A = 1;");
    Node parent = new Node(Token.BLOCK, externs, root);

    Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, true);
    verifier.process(externs, root);
  }

  @Test
  public void testNormalizeStatements_objectLitAndPropertyConstant() {
    String js = "var obj = { CONST_PROP: 1 }; var x = obj.CONST_PROP;";
    Node root = parse(js);
    Node externs = parseExterns("");
    new Node(Token.BLOCK, externs, root);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testNormalizeStatements_emptyStringNameNode() {
    Node externs = parseExterns("");
    Node root = parse("function foo() {}");
    new Node(Token.BLOCK, externs, root);

    Node fnNode = root.getFirstChild();
    Node fnNameNode = fnNode.getFirstChild();
    fnNameNode.setString("");

    Normalize.PropagateConstantAnnotationsOverVars pass =
        new Normalize.PropagateConstantAnnotationsOverVars(compiler, false);
    pass.process(externs, root);

    Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, false);
    verifier.process(externs, root);
  }
}
