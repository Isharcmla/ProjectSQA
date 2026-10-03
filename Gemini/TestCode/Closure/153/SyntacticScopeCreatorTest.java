package com.google.javascript.jscomp;

import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SyntacticScopeCreatorTest {

  private Compiler compiler;
  private SyntacticScopeCreator scopeCreator;

  @Before
  public void setUp() {
    compiler = new Compiler();
    scopeCreator = new SyntacticScopeCreator(compiler);
  }

  @Test
  public void testCreateScope_globalVars_declaredSuccessfully() {
    Node root = compiler.parseTestCode("var a = 1, b = 2, c;");
    Scope scope = scopeCreator.createScope(root, null);

    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    assertTrue(scope.isDeclared("a", false));
    assertTrue(scope.isDeclared("b", false));
    assertTrue(scope.isDeclared("c", false));
    assertFalse(scope.isDeclared("nonExistent", false));
  }

  @Test
  public void testCreateScope_globalFunctionDeclaration_declaredSuccessfully() {
    Node root = compiler.parseTestCode("function myFunc() { var inner = 1; }");
    Scope scope = scopeCreator.createScope(root, null);

    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    assertTrue(scope.isDeclared("myFunc", false));
    assertFalse(scope.isDeclared("inner", false));
  }

  @Test
  public void testCreateScope_globalFunctionExpression_notDeclaredInGlobalScope() {
    Node root = compiler.parseTestCode("var fn = function namedExpr() {};");
    Scope scope = scopeCreator.createScope(root, null);

    assertTrue(scope.isDeclared("fn", false));
    assertFalse(scope.isDeclared("namedExpr", false));
  }

  @Test
  public void testCreateScope_anonymousFunctionDeclaration_ignoredWithoutError() {
    Node script = new Node(Token.SCRIPT);
    Node fnNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    script.addChildToBack(fnNode);

    Scope scope = scopeCreator.createScope(script, null);
    assertNotNull(scope);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testCreateScope_localFunctionScope_parametersAndVarsDeclared() {
    Node root = compiler.parseTestCode("function outer(param1, param2) { var local1 = 10; }");
    Scope globalScope = scopeCreator.createScope(root, null);

    Node fnNode = root.getFirstChild();
    Scope localScope = scopeCreator.createScope(fnNode, globalScope);

    assertNotNull(localScope);
    assertTrue(localScope.isLocal());
    assertTrue(localScope.isDeclared("param1", false));
    assertTrue(localScope.isDeclared("param2", false));
    assertTrue(localScope.isDeclared("local1", false));
    assertFalse(globalScope.isDeclared("param1", false));
  }

  @Test
  public void testCreateScope_namedFunctionExpression_bleedsIntoLocalScope() {
    Node root = compiler.parseTestCode("(function bleedingFn(arg) { var x = 1; });");
    Scope globalScope = scopeCreator.createScope(root, null);

    Node exprNode = root.getFirstChild();
    Node fnNode = exprNode.getFirstChild();
    Scope localScope = scopeCreator.createScope(fnNode, globalScope);

    assertTrue(localScope.isDeclared("bleedingFn", false));
    assertTrue(localScope.isDeclared("arg", false));
    assertTrue(localScope.isDeclared("x", false));
    assertFalse(globalScope.isDeclared("bleedingFn", false));
  }

  @Test
  public void testCreateScope_catchBlock_varDeclaredInEnclosingScope() {
    Node root = compiler.parseTestCode("try { } catch (e) { var inCatch = 2; }");
    Scope scope = scopeCreator.createScope(root, null);

    assertTrue(scope.isDeclared("e", false));
    assertTrue(scope.isDeclared("inCatch", false));
  }

  @Test
  public void testCreateScope_multipleCatchBlocksWithSameVar_allowedWithoutError() {
    Node root = compiler.parseTestCode("try { } catch (e) {} try { } catch (e) {}");
    scopeCreator.createScope(root, null);

    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testCreateScope_duplicateGlobalVar_reportsError() {
    Node root = compiler.parseTestCode("var duplicateVar = 1; var duplicateVar = 2;");
    scopeCreator.createScope(root, null);

    assertEquals(1, compiler.getErrorCount());
    assertEquals(SyntacticScopeCreator.VAR_MULTIPLY_DECLARED_ERROR.key, compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testCreateScope_duplicateGlobalVarWithParentDocSuppression_allowed() {
    Node script = new Node(Token.SCRIPT);
    Node var1 = new Node(Token.VAR, Node.newString(Token.NAME, "dupe"));
    Node var2 = new Node(Token.VAR, Node.newString(Token.NAME, "dupe"));

    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordSuppression("duplicate");
    var2.setJSDocInfo(builder.build(var2));

    script.addChildToBack(var1);
    script.addChildToBack(var2);

    scopeCreator.createScope(script, null);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testCreateScope_duplicateGlobalVarWithNameNodeDocSuppression_allowed() {
    Node script = new Node(Token.SCRIPT);
    Node var1 = new Node(Token.VAR, Node.newString(Token.NAME, "dupe"));
    Node nameNode2 = Node.newString(Token.NAME, "dupe");
    Node var2 = new Node(Token.VAR, nameNode2);

    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordSuppression("duplicate");
    nameNode2.setJSDocInfo(builder.build(nameNode2));

    script.addChildToBack(var1);
    script.addChildToBack(var2);

    scopeCreator.createScope(script, null);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testCreateScope_shadowArgumentsInFunctionParams_reportsError() {
    Node root = compiler.parseTestCode("function foo(arguments) {}");
    Scope globalScope = scopeCreator.createScope(root, null);

    Node fnNode = root.getFirstChild();
    scopeCreator.createScope(fnNode, globalScope);

    assertEquals(1, compiler.getErrorCount());
    assertEquals(SyntacticScopeCreator.VAR_ARGUMENTS_SHADOWED_ERROR.key, compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testCreateScope_argumentsDeclaredAsVarInFunction_allowedWithoutError() {
    Node root = compiler.parseTestCode("function foo() { var arguments = 1; }");
    Scope globalScope = scopeCreator.createScope(root, null);

    Node fnNode = root.getFirstChild();
    scopeCreator.createScope(fnNode, globalScope);

    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testCreateScope_nestedControlStructures_allVarsScanned() {
    String js = "if (true) { var a = 1; } else { var b = 2; }"
        + "while (false) { var c = 3; }"
        + "for (var d = 0; d < 10; d++) { var e = 4; }"
        + "do { var f = 5; } while (false);"
        + "switch (a) { case 1: var g = 6; default: var h = 7; }"
        + "{ var i = 8; }";

    Node root = compiler.parseTestCode(js);
    Scope scope = scopeCreator.createScope(root, null);

    assertTrue(scope.isDeclared("a", false));
    assertTrue(scope.isDeclared("b", false));
    assertTrue(scope.isDeclared("c", false));
    assertTrue(scope.isDeclared("d", false));
    assertTrue(scope.isDeclared("e", false));
    assertTrue(scope.isDeclared("f", false));
    assertTrue(scope.isDeclared("g", false));
    assertTrue(scope.isDeclared("h", false));
    assertTrue(scope.isDeclared("i", false));
  }

  @Test
  public void testCreateScope_scriptWithSourceName_sourceNameRetained() {
    Node script = new Node(Token.SCRIPT);
    script.putProp(Node.SOURCENAME_PROP, "custom_source.js");
    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    script.addChildToBack(varNode);

    Scope scope = scopeCreator.createScope(script, null);
    assertTrue(scope.isDeclared("x", false));
  }

  @Test
  public void testCreateScope_customRedeclarationHandler_invokedOnDuplicate() {
    final AtomicBoolean handlerCalled = new AtomicBoolean(false);
    SyntacticScopeCreator.RedeclarationHandler customHandler =
        new SyntacticScopeCreator.RedeclarationHandler() {
          @Override
          public void onRedeclaration(
              Scope s, String name, Node n, Node parent, Node gramps, Node nodeWithLineNumber) {
            handlerCalled.set(true);
          }
        };

    SyntacticScopeCreator customCreator = new SyntacticScopeCreator(compiler, customHandler);
    Node root = compiler.parseTestCode("var a = 1; var a = 2;");
    customCreator.createScope(root, null);

    assertTrue(handlerCalled.get());
    assertEquals(0, compiler.getErrorCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testCreateScope_localScopeOnNonFunction_throwsException() {
    Node root = compiler.parseTestCode("var a = 1;");
    Scope globalScope = scopeCreator.createScope(root, null);

    Node blockNode = new Node(Token.BLOCK);
    scopeCreator.createScope(blockNode, globalScope);
  }
}
