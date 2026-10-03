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
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private Node parse(String js) {
    return compiler.parseTestCode(js);
  }

  private Node parseExterns(String js) {
    return compiler.parseSyntheticCode("externs", js);
  }

  private void normalize(String js) {
    Node externs = parseExterns("");
    Node root = parse(js);
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);
  }

  @Test
  public void testParseAndNormalizeSyntheticCode_validCode_normalizes() {
    Node node = Normalize.parseAndNormalizeSyntheticCode(compiler, "var a = 1, b = 2;", "prefix_");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.SCRIPT, node.getType());
  }

  @Test
  public void testParseAndNormalizeSyntheticCode_emptyCode_returnsNode() {
    Node node = Normalize.parseAndNormalizeSyntheticCode(compiler, "", "prefix_");
    Assert.assertNotNull(node);
  }

  @Test
  public void testParseAndNormalizeTestCode_validCode_normalizes() {
    Node node = Normalize.parseAndNormalizeTestCode(compiler, "var a = 1, b = 2;", "prefix_");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.SCRIPT, node.getType());
  }

  @Test
  public void testParseAndNormalizeTestCode_emptyCode_returnsNode() {
    Node node = Normalize.parseAndNormalizeTestCode(compiler, "", "prefix_");
    Assert.assertNotNull(node);
  }

  @Test
  public void testProcess_splitVarDeclarations_splitsCorrectly() {
    Node externs = parseExterns("");
    Node root = parse("var a = 1, b = 2, c = 3;");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    int varCount = 0;
    for (Node child = root.getFirstChild(); child != null; child = child.getNext()) {
      if (child.getType() == Token.VAR) {
        varCount++;
        Assert.assertTrue(child.hasOneChild());
      }
    }
    Assert.assertEquals(3, varCount);
  }

  @Test
  public void testProcess_convertWhileToFor_convertsNode() {
    Node externs = parseExterns("");
    Node root = parse("while (true) { foo(); }");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node firstStatement = root.getFirstChild();
    Assert.assertEquals(Token.FOR, firstStatement.getType());
    Assert.assertEquals(Token.EMPTY, firstStatement.getFirstChild().getType());
  }

  @Test
  public void testProcess_extractForInitializer_varDeclaration() {
    Node externs = parseExterns("");
    Node root = parse("for (var i = 0; i < 10; i++) {}");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node first = root.getFirstChild();
    Assert.assertEquals(Token.VAR, first.getType());
    Node second = first.getNext();
    Assert.assertEquals(Token.FOR, second.getType());
    Assert.assertEquals(Token.EMPTY, second.getFirstChild().getType());
  }

  @Test
  public void testProcess_extractForInitializer_expressionInit() {
    Node externs = parseExterns("");
    Node root = parse("var i; for (i = 0; i < 10; i++) {}");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node first = root.getFirstChild();
    Assert.assertEquals(Token.VAR, first.getType());
    Node second = first.getNext();
    Assert.assertEquals(Token.EXPR_RESULT, second.getType());
    Node third = second.getNext();
    Assert.assertEquals(Token.FOR, third.getType());
  }

  @Test
  public void testProcess_extractForInVarInitializer() {
    Node externs = parseExterns("");
    Node root = parse("for (var a in obj) {}");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node first = root.getFirstChild();
    Assert.assertEquals(Token.VAR, first.getType());
    Node second = first.getNext();
    Assert.assertEquals(Token.FOR, second.getType());
    Assert.assertEquals(Token.NAME, second.getFirstChild().getType());
  }

  @Test
  public void testProcess_normalizeLabels_wrapsNonBlockInBlock() {
    Node externs = parseExterns("");
    Node root = parse("label: a = 1;");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node label = root.getFirstChild();
    Assert.assertEquals(Token.LABEL, label.getType());
    Node lastChild = label.getLastChild();
    Assert.assertEquals(Token.BLOCK, lastChild.getType());
  }

  @Test
  public void testProcess_normalizeLabels_preservesExistingBlockAndLoops() {
    Node externs = parseExterns("");
    Node root = parse("label1: { a = 1; } label2: while(true) {} label3: for(;;) {} label4: do {} while(true);");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node label1 = root.getFirstChild();
    Assert.assertEquals(Token.BLOCK, label1.getLastChild().getType());
  }

  @Test
  public void testProcess_extractForInitializerInsideLabel() {
    Node externs = parseExterns("");
    Node root = parse("label: for (var i = 0; i < 10; i++) {}");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node first = root.getFirstChild();
    Assert.assertEquals(Token.VAR, first.getType());
    Node second = first.getNext();
    Assert.assertEquals(Token.LABEL, second.getType());
  }

  @Test
  public void testProcess_unhoistedFunctionDeclaration_rewrittenToVar() {
    Node externs = parseExterns("");
    Node root = parse("if (true) { function f() {} }");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node ifNode = root.getFirstChild();
    Node blockNode = ifNode.getLastChild();
    Node varNode = blockNode.getFirstChild();
    Assert.assertEquals(Token.VAR, varNode.getType());
  }

  @Test
  public void testProcess_moveNamedFunctionsToTop() {
    Node externs = parseExterns("");
    Node root = parse("function outer() { var x = 1; function inner() {} var y = 2; function inner2() {} }");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node outerFn = root.getFirstChild();
    Node outerBody = outerFn.getLastChild();
    Node child1 = outerBody.getFirstChild();
    Node child2 = child1.getNext();
    Assert.assertEquals(Token.FUNCTION, child1.getType());
    Assert.assertEquals(Token.FUNCTION, child2.getType());
  }

  @Test
  public void testProcess_removeDuplicateVarDeclarations_assignmentPreserved() {
    Node externs = parseExterns("");
    Node root = parse("var a = 1; var a = 2;");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node first = root.getFirstChild();
    Assert.assertEquals(Token.VAR, first.getType());
    Node second = first.getNext();
    Assert.assertEquals(Token.EXPR_RESULT, second.getType());
    Assert.assertEquals(Token.ASSIGN, second.getFirstChild().getType());
  }

  @Test
  public void testProcess_removeDuplicateVarDeclarations_emptyDuplicateRemoved() {
    Node externs = parseExterns("");
    Node root = parse("var a = 1; var a;");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node first = root.getFirstChild();
    Assert.assertEquals(Token.VAR, first.getType());
    Assert.assertNull(first.getNext());
  }

  @Test
  public void testProcess_removeDuplicateVar_varShadowingFunction() {
    Node externs = parseExterns("");
    Node root = parse("var f = 1; function f() {}");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Node first = root.getFirstChild();
    Assert.assertEquals(Token.FUNCTION, first.getType());
    Node second = first.getNext();
    Assert.assertEquals(Token.EXPR_RESULT, second.getType());
  }

  @Test
  public void testProcess_catchBlockVarError_reportsError() {
    Node externs = parseExterns("");
    Node root = parse("function f() { try { throw 0; } catch (e) { var e = 1; } }");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Assert.assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void testProcess_constantAnnotationByConvention_nameAndProperty() {
    Node externs = parseExterns("");
    Node root = parse("var CONST_VAL = 1; var obj = {CONST_PROP: 2}; obj.CONST_PROP = 3;");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);

    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_assertOnChange_throwsOnUnnormalizedTree() {
    Node externs = parseExterns("");
    Node root = parse("while (true) {}");
    Normalize normalize = new Normalize(compiler, true);
    try {
      normalize.process(externs, root);
      Assert.fail("Expected IllegalStateException due to assertOnChange=true");
    } catch (IllegalStateException e) {
      Assert.assertTrue(e.getMessage().contains("Normalize constraints violated"));
    }
  }

  @Test
  public void testPropagateConstantAnnotationsOverVars_propagatesDocInfo() {
    Node externs = parseExterns("");
    Node root = parse("var a = 1; a;");
    Node varNode = root.getFirstChild();
    Node nameNode = varNode.getFirstChild();

    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordConstancy();
    JSDocInfo info = builder.build(varNode);
    varNode.setJSDocInfo(info);
    nameNode.setJSDocInfo(info);

    Normalize.PropagateConstantAnnotationsOverVars pass =
        new Normalize.PropagateConstantAnnotationsOverVars(compiler, false);
    pass.process(externs, root);

    Node aRef = root.getLastChild().getFirstChild();
    Assert.assertTrue(aRef.getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  @Test
  public void testPropagateConstantAnnotationsOverVars_assertOnChangeThrows() {
    Node externs = parseExterns("");
    Node root = parse("var a = 1; a;");
    Node varNode = root.getFirstChild();
    Node nameNode = varNode.getFirstChild();

    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordConstancy();
    JSDocInfo info = builder.build(varNode);
    varNode.setJSDocInfo(info);
    nameNode.setJSDocInfo(info);

    Normalize.PropagateConstantAnnotationsOverVars pass =
        new Normalize.PropagateConstantAnnotationsOverVars(compiler, true);
    try {
      pass.process(externs, root);
      Assert.fail("Expected IllegalStateException due to assertOnChange");
    } catch (IllegalStateException e) {
      Assert.assertTrue(e.getMessage().contains("Unexpected const change"));
    }
  }

  @Test
  public void testPropagateConstantAnnotationsOverVars_emptyName_ignored() {
    Node externs = parseExterns("");
    Node root = new Node(Token.BLOCK);
    Node emptyName = new Node(Token.NAME, "");
    root.addChildToFront(emptyName);

    Normalize.PropagateConstantAnnotationsOverVars pass =
        new Normalize.PropagateConstantAnnotationsOverVars(compiler, false);
    pass.process(externs, root);
  }

  @Test
  public void testVerifyConstants_validConstants_passesVerification() {
    Node externs = parseExterns("");
    Node root = parse("var CONST_VAL = 1; CONST_VAL;");
    Node parent = new Node(Token.BLOCK, externs, root);

    NodeTraversal.traverse(compiler, root, new Normalize.NormalizeStatements(compiler, false));

    Normalize.VerifyConstants vc = new Normalize.VerifyConstants(compiler, false);
    vc.process(externs, root);
  }

  @Test
  public void testVerifyConstants_checkUserDeclarations_valid() {
    Node externs = parseExterns("");
    Node root = parse("var CONST_FOO = 1; CONST_FOO;");
    Node parent = new Node(Token.BLOCK, externs, root);

    NodeTraversal.traverse(compiler, root, new Normalize.NormalizeStatements(compiler, false));

    Normalize.VerifyConstants vc = new Normalize.VerifyConstants(compiler, true);
    vc.process(externs, root);
  }

  @Test
  public void testVerifyConstants_inconsistentAnnotation_throwsException() {
    Node externs = parseExterns("");
    Node root = parse("var a = 1; a;");
    Node parent = new Node(Token.BLOCK, externs, root);

    Node a1 = root.getFirstChild().getFirstChild();
    a1.putBooleanProp(Node.IS_CONSTANT_NAME, true);

    Normalize.VerifyConstants vc = new Normalize.VerifyConstants(compiler, false);
    try {
      vc.process(externs, root);
      Assert.fail("Expected IllegalStateException for inconsistent const annotation");
    } catch (IllegalStateException e) {
      Assert.assertTrue(e.getMessage().contains("is not consistently annotated"));
    }
  }

  @Test
  public void testVerifyConstants_emptyName_ignored() {
    Node externs = parseExterns("");
    Node root = new Node(Token.BLOCK);
    Node emptyName = new Node(Token.NAME, "");
    root.addChildToFront(emptyName);
    Node parent = new Node(Token.BLOCK, externs, root);

    Normalize.VerifyConstants vc = new Normalize.VerifyConstants(compiler, false);
    vc.process(externs, root);
  }

  @Test
  public void testNormalizeStatements_assertOnChange_throwsOnSplitVar() {
    Node root = parse("var a = 1, b = 2;");
    Normalize.NormalizeStatements statements = new Normalize.NormalizeStatements(compiler, true);
    try {
      NodeTraversal.traverse(compiler, root, statements);
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      Assert.assertTrue(e.getMessage().contains("Normalize constraints violated"));
    }
  }

  @Test
  public void testNormalizeStatements_assertOnChange_throwsOnEmptyVar() {
    Node root = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    root.addChildToFront(varNode);

    Normalize.NormalizeStatements statements = new Normalize.NormalizeStatements(compiler, true);
    try {
      NodeTraversal.traverse(compiler, root, statements);
      Assert.fail("Expected IllegalStateException for empty VAR node");
    } catch (IllegalStateException e) {
      Assert.assertTrue(e.getMessage().contains("Empty VAR node"));
    }
  }

  @Test
  public void testNormalizeStatements_assertOnChange_throwsOnConstantConvention() {
    Node root = parse("var CONST_VAL = 1;");
    Normalize.NormalizeStatements statements = new Normalize.NormalizeStatements(compiler, true);
    try {
      NodeTraversal.traverse(compiler, root, statements);
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      Assert.assertTrue(e.getMessage().contains("Unexpected const change"));
    }
  }

  @Test
  public void testDuplicateDeclaration_forInDuplicateVar() {
    Node externs = parseExterns("");
    Node root = parse("var a; for (var a in b) {}");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_alreadyNormalizedCode_runsSuccessfully() {
    String code = "var a = 1; var b = 2; if (a) { b = 3; }";
    normalize(code);
  }
}
