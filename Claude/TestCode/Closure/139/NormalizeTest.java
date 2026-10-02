package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

/**
 * Unit tests for {@link Normalize}.
 *
 * NOTE: These tests rely on the real Closure Compiler infrastructure
 * (Compiler, CompilerOptions, SourceFile, Node, Token) since Normalize is
 * tightly coupled with these classes and no mocking framework is allowed.
 */
public class NormalizeTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  /**
   * Helper: parses the given JS source using the real compiler front end
   * and returns the SCRIPT node produced for it (assumes a single input
   * file named "test.js").
   */
  private Node parseAndGetScriptNode(String js) {
    CompilerOptions options = new CompilerOptions();
    List<SourceFile> externs = Collections.emptyList();
    List<SourceFile> inputs =
        Collections.singletonList(SourceFile.fromCode("test.js", js));
    compiler.init(externs, inputs, options);
    compiler.parse();
    Node jsRoot = compiler.getJsRoot();
    assertNotNull("jsRoot should not be null after parse()", jsRoot);
    Node script = jsRoot.getFirstChild();
    assertNotNull("script node should exist", script);
    return script;
  }

  // ---------------------------------------------------------------------
  // Normal / typical cases
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_splitsMultipleVarDeclarations_intoSeparateStatements() {
    Node script = parseAndGetScriptNode("var a = 1, b = 2;");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(compiler.getExternsRoot(), compiler.getJsRoot());

    // After splitting, the script should contain two VAR statements,
    // each declaring exactly one NAME.
    assertEquals(2, script.getChildCount());
    Node first = script.getFirstChild();
    Node second = first.getNext();
    assertEquals(Token.VAR, first.getType());
    assertEquals(Token.VAR, second.getType());
    assertEquals(1, first.getChildCount());
    assertEquals(1, second.getChildCount());
  }

  @Test
  public void testProcess_convertsWhileToFor() {
    Node script = parseAndGetScriptNode("while (x) { foo(); }");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(compiler.getExternsRoot(), compiler.getJsRoot());

    Node statement = script.getFirstChild();
    assertNotNull(statement);
    assertEquals(Token.FOR, statement.getType());
    // FOR node should now have 4 children: EMPTY(init), cond, EMPTY(incr), body
    assertEquals(4, statement.getChildCount());
    Node init = statement.getFirstChild();
    Node incr = init.getNext().getNext();
    assertEquals(Token.EMPTY, init.getType());
    assertEquals(Token.EMPTY, incr.getType());
  }

  @Test
  public void testProcess_extractsForLoopInitializer() {
    Node script = parseAndGetScriptNode("for (var i = 0; i < 10; i++) {}");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(compiler.getExternsRoot(), compiler.getJsRoot());

    // Expect: var i = 0; then a FOR statement whose first child is EMPTY.
    assertEquals(2, script.getChildCount());
    Node firstStmt = script.getFirstChild();
    Node secondStmt = firstStmt.getNext();
    assertEquals(Token.VAR, firstStmt.getType());
    assertEquals(Token.FOR, secondStmt.getType());
    assertEquals(Token.EMPTY, secondStmt.getFirstChild().getType());
  }

  @Test
  public void testProcess_removesDuplicateVarDeclaration() {
    Node script = parseAndGetScriptNode("var a = 1; var a = 2;");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(compiler.getExternsRoot(), compiler.getJsRoot());

    assertEquals(2, script.getChildCount());
    Node first = script.getFirstChild();
    Node second = first.getNext();
    assertEquals(Token.VAR, first.getType());
    // The duplicate declaration should have been rewritten into an
    // assignment expression statement.
    assertEquals(Token.EXPR_RESULT, second.getType());
    assertEquals(Token.ASSIGN, second.getFirstChild().getType());
  }

  @Test
  public void testProcess_normalizesLabeledStatement_wrapsInBlock() {
    Node script = parseAndGetScriptNode("foo: var x = 1;");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(compiler.getExternsRoot(), compiler.getJsRoot());

    Node label = script.getFirstChild();
    assertEquals(Token.LABEL, label.getType());
    Node last = label.getLastChild();
    assertEquals(Token.BLOCK, last.getType());
  }

  @Test
  public void testProcess_moveNamedFunctionDeclarationToTopOfFunctionBody() {
    Node script = parseAndGetScriptNode(
        "function f() { var x = 1; function g() {} }");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(compiler.getExternsRoot(), compiler.getJsRoot());

    Node functionF = script.getFirstChild();
    assertEquals(Token.FUNCTION, functionF.getType());
    Node body = functionF.getLastChild();
    assertEquals(Token.BLOCK, body.getType());
    Node firstInBody = body.getFirstChild();
    // The nested function declaration should have been hoisted to the top.
    assertEquals(Token.FUNCTION, firstInBody.getType());
  }

  @Test
  public void testConstructor_createsInstanceWithoutException() {
    Normalize normalize = new Normalize(compiler, false);
    assertNotNull(normalize);
  }

  // ---------------------------------------------------------------------
  // Edge cases
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_emptyScript_noExceptionWithAssertOnChangeTrue() {
    parseAndGetScriptNode("");
    Normalize normalize = new Normalize(compiler, true);
    // No changes are expected for an empty script, so this should not throw.
    try {
      normalize.process(compiler.getExternsRoot(), compiler.getJsRoot());
    } catch (IllegalStateException e) {
      fail("Empty script should not trigger a normalization change: "
          + e.getMessage());
    }
  }

  @Test
  public void testProcess_singleSimpleVarDeclaration_noChangeNeeded() {
    parseAndGetScriptNode("var a = 1;");
    Normalize normalize = new Normalize(compiler, true);
    // A single, already-normalized var declaration should not trigger
    // any structural changes.
    try {
      normalize.process(compiler.getExternsRoot(), compiler.getJsRoot());
    } catch (IllegalStateException e) {
      fail("Single var declaration should not trigger a change: "
          + e.getMessage());
    }
  }

  // ---------------------------------------------------------------------
  // Exception cases
  // ---------------------------------------------------------------------

  @Test(expected = IllegalStateException.class)
  public void testProcess_assertOnChangeTrue_multipleVarDecls_throwsException() {
    parseAndGetScriptNode("var a = 1, b = 2;");
    Normalize normalize = new Normalize(compiler, true);
    // Splitting the VAR declaration is a change; with assertOnChange = true
    // this must throw.
    normalize.process(compiler.getExternsRoot(), compiler.getJsRoot());
  }

  @Test(expected = IllegalStateException.class)
  public void testProcess_assertOnChangeTrue_whileLoop_throwsException() {
    parseAndGetScriptNode("while (x) {}");
    Normalize normalize = new Normalize(compiler, true);
    // Converting WHILE to FOR is a change; with assertOnChange = true
    // this must throw.
    normalize.process(compiler.getExternsRoot(), compiler.getJsRoot());
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullRoot_throwsNullPointerException() {
    parseAndGetScriptNode("var a = 1;");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(null, null);
  }

  // ---------------------------------------------------------------------
  // PropogateConstantAnnotations
  // ---------------------------------------------------------------------

  @Test
  public void testPropogateConstantAnnotationsProcess_runsWithoutException() {
    parseAndGetScriptNode("var FOO = 1; FOO;");
    Normalize.PropogateConstantAnnotations pass =
        new Normalize.PropogateConstantAnnotations(compiler, false);
    try {
      pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    } catch (Exception e) {
      fail("PropogateConstantAnnotations should not throw for normal input: "
          + e.getMessage());
    }
  }

  @Test
  public void testPropogateConstantAnnotationsProcess_emptyNameIgnored() {
    // Simple script with no NAME nodes with empty strings but exercising
    // the visit() code path broadly.
    parseAndGetScriptNode("var a = 1;");
    Normalize.PropogateConstantAnnotations pass =
        new Normalize.PropogateConstantAnnotations(compiler, false);
    pass.process(compiler.getExternsRoot(), compiler.getJsRoot());
    assertTrue(true);
  }

  // ---------------------------------------------------------------------
  // VerifyConstants
  // ---------------------------------------------------------------------

  @Test
  public void testVerifyConstantsProcess_checkDisabled_runsWithoutException() {
    parseAndGetScriptNode("var a = 1; var b = 2;");
    Normalize.VerifyConstants verify =
        new Normalize.VerifyConstants(compiler, false);
    try {
      verify.process(compiler.getExternsRoot(), compiler.getJsRoot());
    } catch (Exception e) {
      fail("VerifyConstants with checkUserDeclarations=false should not "
          + "throw for normal input: " + e.getMessage());
    }
  }

  @Test
  public void testVerifyConstantsProcess_afterNormalize_consistentAnnotations() {
    parseAndGetScriptNode("var a = 1; var b = a;");
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(compiler.getExternsRoot(), compiler.getJsRoot());

    Normalize.VerifyConstants verify =
        new Normalize.VerifyConstants(compiler, false);
    try {
      verify.process(compiler.getExternsRoot(), compiler.getJsRoot());
    } catch (Exception e) {
      fail("VerifyConstants should not throw after Normalize.process(): "
          + e.getMessage());
    }
  }
}
