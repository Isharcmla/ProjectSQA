package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import java.io.IOException;
import org.junit.Test;

public class JsAstTest {

  @Test
  public void testConstructorAndGetters_normalInput_returnsInitializedValues() {
    SourceFile sourceFile = SourceFile.fromCode("test.js", "var a = 1;");
    JsAst ast = new JsAst(sourceFile);

    assertEquals(new InputId("test.js"), ast.getInputId());
    assertSame(sourceFile, ast.getSourceFile());
  }

  @Test
  public void testGetAstRoot_validCode_returnsValidAstRoot() {
    SourceFile sourceFile = SourceFile.fromCode("test.js", "var x = 10; function foo() { return x; }");
    JsAst ast = new JsAst(sourceFile);
    Compiler compiler = new Compiler();

    Node root1 = ast.getAstRoot(compiler);

    assertNotNull(root1);
    assertTrue(root1.isScript());
    assertEquals(new InputId("test.js"), root1.getInputId());
    assertSame(sourceFile, root1.getStaticSourceFile());

    // Second call should return the cached AST root
    Node root2 = ast.getAstRoot(compiler);
    assertSame(root1, root2);
  }

  @Test
  public void testGetAstRoot_emptyCode_returnsScriptNode() {
    SourceFile sourceFile = SourceFile.fromCode("empty.js", "");
    JsAst ast = new JsAst(sourceFile);
    Compiler compiler = new Compiler();

    Node root = ast.getAstRoot(compiler);

    assertNotNull(root);
    assertTrue(root.isScript());
    assertEquals(new InputId("empty.js"), root.getInputId());
    assertSame(sourceFile, root.getStaticSourceFile());
  }

  @Test
  public void testGetAstRoot_syntaxError_createsDummyScriptNode() {
    SourceFile sourceFile = SourceFile.fromCode("syntax_error.js", "function bad( { return; }");
    JsAst ast = new JsAst(sourceFile);
    Compiler compiler = new Compiler();

    Node root = ast.getAstRoot(compiler);

    assertNotNull(root);
    assertTrue(root.isScript());
    assertEquals(new InputId("syntax_error.js"), root.getInputId());
    assertSame(sourceFile, root.getStaticSourceFile());
  }

  @Test
  public void testGetAstRoot_ioExceptionOnRead_handlesExceptionAndCreatesDummyScript() {
    SourceFile sourceFile = new SourceFile("io_error.js") {
      @Override
      public String getCode() throws IOException {
        throw new IOException("Simulated disk error");
      }
    };
    JsAst ast = new JsAst(sourceFile);
    Compiler compiler = new Compiler();

    Node root = ast.getAstRoot(compiler);

    assertNotNull(root);
    assertTrue(root.isScript());
    assertEquals(new InputId("io_error.js"), root.getInputId());
    assertSame(sourceFile, root.getStaticSourceFile());
    assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void testClearAst_clearsCachedRootAndSource() {
    SourceFile sourceFile = SourceFile.fromCode("test.js", "var y = 20;");
    JsAst ast = new JsAst(sourceFile);
    Compiler compiler = new Compiler();

    Node firstRoot = ast.getAstRoot(compiler);
    assertNotNull(firstRoot);

    ast.clearAst();

    Node secondRoot = ast.getAstRoot(compiler);
    assertNotNull(secondRoot);
    assertNotSame(firstRoot, secondRoot);
    assertEquals(firstRoot.getInputId(), secondRoot.getInputId());
  }

  @Test
  public void testSetSourceFile_matchingName_updatesSourceFile() {
    SourceFile originalFile = SourceFile.fromCode("module.js", "var a = 1;");
    SourceFile updatedFile = SourceFile.fromCode("module.js", "var a = 2;");
    JsAst ast = new JsAst(originalFile);

    ast.setSourceFile(updatedFile);

    assertSame(updatedFile, ast.getSourceFile());
  }

  @Test(expected = IllegalStateException.class)
  public void testSetSourceFile_mismatchedName_throwsIllegalStateException() {
    SourceFile originalFile = SourceFile.fromCode("fileA.js", "var a = 1;");
    SourceFile differentFile = SourceFile.fromCode("fileB.js", "var b = 2;");
    JsAst ast = new JsAst(originalFile);

    ast.setSourceFile(differentFile);
  }
}
