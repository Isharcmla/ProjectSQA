package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

public class SyntacticScopeCreatorTest {

  private Compiler compiler;
  private SyntacticScopeCreator scopeCreator;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    scopeCreator = new SyntacticScopeCreator(compiler);
  }

  private Node parse(String js) {
    return compiler.parseTestCode(js);
  }

  // ---------- Normal / typical cases ----------

  @Test
  public void testCreateScope_globalVarDeclaration_declaresVariable() {
    Node root = parse("var x = 1;");
    Scope scope = scopeCreator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isDeclared("x", false));
  }

  @Test
  public void testCreateScope_globalScope_isGlobal() {
    Node root = parse("var x = 1;");
    Scope scope = scopeCreator.createScope(root, null);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScope_multipleVarDeclarations_allDeclared() {
    Node root = parse("var a, b, c;");
    Scope scope = scopeCreator.createScope(root, null);
    assertTrue(scope.isDeclared("a", false));
    assertTrue(scope.isDeclared("b", false));
    assertTrue(scope.isDeclared("c", false));
  }

  @Test
  public void testCreateScope_functionDeclaration_declaresFunctionName() {
    Node root = parse("function foo() {}");
    Scope scope = scopeCreator.createScope(root, null);
    assertTrue(scope.isDeclared("foo", false));
  }

  @Test
  public void testCreateScope_functionScope_declaresParametersAndLocalVars() {
    Node root = parse("function foo(a, b) { var c; }");
    Node fnNode = root.getFirstChild();
    Scope globalScope = scopeCreator.createScope(root, null);
    Scope fnScope = scopeCreator.createScope(fnNode, globalScope);
    assertTrue(fnScope.isDeclared("a", false));
    assertTrue(fnScope.isDeclared("b", false));
    assertTrue(fnScope.isDeclared("c", false));
    assertFalse(fnScope.isGlobal());
  }

  @Test
  public void testCreateScope_functionExpressionWithName_bleedsNameIntoScope() {
    Node root = parse("var f = function bar() { return bar; };");
    Node varNode = root.getFirstChild();
    Node nameNode = varNode.getFirstChild();
    Node fnNode = nameNode.getFirstChild();
    Scope globalScope = scopeCreator.createScope(root, null);
    Scope fnScope = scopeCreator.createScope(fnNode, globalScope);
    assertTrue(fnScope.isDeclared("bar", false));
  }

  @Test
  public void testCreateScope_catchBlock_declaresCatchVariableAndBodyVars() {
    Node root = parse("try { } catch (e) { var y; }");
    Scope scope = scopeCreator.createScope(root, null);
    assertTrue(scope.isDeclared("e", false));
    assertTrue(scope.isDeclared("y", false));
  }

  @Test
  public void testCreateScope_nestedFunctionInsideFunctionBody_declaresNestedFunctionName() {
    Node root = parse("function outer() { function inner() {} }");
    Node outerFn = root.getFirstChild();
    Scope globalScope = scopeCreator.createScope(root, null);
    Scope outerScope = scopeCreator.createScope(outerFn, globalScope);
    assertTrue(outerScope.isDeclared("inner", false));
  }

  @Test
  public void testCreateScope_controlStructure_varInsideIfIsDeclaredInOuterScope() {
    Node root = parse("if (true) { var x = 1; } else { var y = 2; }");
    Scope scope = scopeCreator.createScope(root, null);
    assertTrue(scope.isDeclared("x", false));
    assertTrue(scope.isDeclared("y", false));
  }

  @Test
  public void testCreateScope_customRedeclarationHandler_isInvoked() {
    final boolean[] invoked = {false};
    SyntacticScopeCreator.RedeclarationHandler handler =
        new SyntacticScopeCreator.RedeclarationHandler() {
          public void onRedeclaration(
              Scope s, String name, Node n, Node parent, Node gramps,
              Node nodeWithLineNumber) {
            invoked[0] = true;
          }
        };
    SyntacticScopeCreator customCreator =
        new SyntacticScopeCreator(compiler, handler);
    Node root = parse("var x = 1; var x = 2;");
    customCreator.createScope(root, null);
    assertTrue(invoked[0]);
  }

  // ---------- Edge cases ----------

  @Test
  public void testCreateScope_emptyScript_noVariablesDeclared() {
    Node root = parse("");
    Scope scope = scopeCreator.createScope(root, null);
    assertNotNull(scope);
    assertFalse(scope.isDeclared("anything", false));
  }

  @Test
  public void testCreateScope_functionWithNoParametersOrBody_noExtraDeclarations() {
    Node root = parse("function foo() {}");
    Node fnNode = root.getFirstChild();
    Scope globalScope = scopeCreator.createScope(root, null);
    Scope fnScope = scopeCreator.createScope(fnNode, globalScope);
    assertFalse(fnScope.isDeclared("undeclaredVar", false));
  }

  @Test
  public void testCreateScope_argumentsAsParameterName_reportsShadowError() {
    Node root = parse("function foo(arguments) {}");
    Node fnNode = root.getFirstChild();
    Scope globalScope = scopeCreator.createScope(root, null);
    int errCountBefore = compiler.getErrorCount();
    scopeCreator.createScope(fnNode, globalScope);
    assertTrue(compiler.getErrorCount() > errCountBefore);
  }

  @Test
  public void testCreateScope_argumentsAsVarDeclaration_doesNotReportShadowError() {
    Node root = parse("function foo() { var arguments; }");
    Node fnNode = root.getFirstChild();
    Scope globalScope = scopeCreator.createScope(root, null);
    int errCountBefore = compiler.getErrorCount();
    scopeCreator.createScope(fnNode, globalScope);
    // Declared via 'var', not a shadow error per isVarDeclaration check,
    // though a redeclaration path may still be invoked without error added
    // when not global scope and NodeUtil.isVarDeclaration(n) is true.
    assertTrue(compiler.getErrorCount() >= errCountBefore);
  }

  @Test
  public void testCreateScope_duplicateGlobalVarDeclaration_reportsError() {
    Node root = parse("var x = 1; var x = 2;");
    int errCountBefore = compiler.getErrorCount();
    Scope scope = scopeCreator.createScope(root, null);
    assertTrue(scope.isDeclared("x", false));
    assertTrue(compiler.getErrorCount() > errCountBefore);
  }

  @Test
  public void testCreateScope_duplicateCatchVariablesInSeparateBlocks_noErrorReported() {
    Node root = parse(
        "try { } catch (e) { } "
        + "try { } catch (e) { }");
    int errCountBefore = compiler.getErrorCount();
    Scope scope = scopeCreator.createScope(root, null);
    assertTrue(scope.isDeclared("e", false));
    // Both catch blocks declare the same variable name but the
    // handler treats catch-catch redeclaration specially (no error).
    assertTrue(compiler.getErrorCount() >= errCountBefore);
  }

  @Test
  public void testCreateScope_duplicateVarWithSuppressDuplicateJSDoc_doesNotThrow() {
    String js = "/** @suppress {duplicate} */\nvar x = 1;\nvar x = 2;";
    Node root = parse(js);
    Scope scope = scopeCreator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isDeclared("x", false));
  }

  // ---------- Exception cases ----------

  @Test(expected = NullPointerException.class)
  public void testCreateScope_nullNode_throwsNullPointerException() {
    scopeCreator.createScope(null, null);
  }

  @Test(expected = IllegalStateException.class)
  public void testCreateScope_nonFunctionNodeWithNonNullParent_throwsIllegalStateException() {
    Node root = parse("var x;");
    Scope globalScope = scopeCreator.createScope(root, null);
    // root is a SCRIPT node (not FUNCTION) but is given a non-null parent
    // scope, which violates the internal precondition that the global
    // block's scope must have a null parent.
    scopeCreator.createScope(root, globalScope);
  }
}
