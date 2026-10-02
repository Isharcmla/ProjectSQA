package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

public class JsAstTest {

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
    compiler.initOptions(options);
  }

  // --------- Normal / typical input cases ---------

  @Test
  public void testConstructor_validSourceFile_createsInputId() {
    SourceFile sourceFile = SourceFile.fromCode("test.js", "var x = 1;");
    JsAst ast = new JsAst(sourceFile);
    assertNotNull(ast.getInputId());
  }

  @Test
  public void testGetAstRoot_validCode_returnsNonNullRoot() {
    SourceFile sourceFile = SourceFile.fromCode("test.js", "var x = 1;");
    JsAst ast = new JsAst(sourceFile);
    Node root = ast.getAstRoot(compiler);
    assertNotNull(root);
  }

  @Test
  public void testGetAstRoot_calledTwice_returnsSameRootInstance() {
    SourceFile sourceFile = SourceFile.fromCode("test.js", "var x = 1;");
    JsAst ast = new JsAst(sourceFile);
    Node root1 = ast.getAstRoot(compiler);
    Node root2 = ast.getAstRoot(compiler);
    assertSame(root1, root2);
  }

  @Test
  public void testGetSourceFile_returnsSameSourceFileInstance() {
    SourceFile sourceFile = SourceFile.fromCode("test.js", "var x = 1;");
    JsAst ast = new JsAst(sourceFile);
    assertSame(sourceFile, ast.getSourceFile());
  }

  @Test
  public void testGetInputId_returnsNonNullInputId() {
    SourceFile sourceFile = SourceFile.fromCode("test.js", "var x = 1;");
    JsAst ast = new JsAst(sourceFile);
    InputId inputId = ast.getInputId();
    assertNotNull(inputId);
  }

  @Test
  public void testSetSourceFile_sameName_updatesSourceFileReference() {
    SourceFile sourceFile1 = SourceFile.fromCode("test.js", "var x = 1;");
    JsAst ast = new JsAst(sourceFile1);
    SourceFile sourceFile2 = SourceFile.fromCode("test.js", "var y = 2;");
    ast.setSourceFile(sourceFile2);
    assertSame(sourceFile2, ast.getSourceFile());
  }

  @Test
  public void testClearAst_afterGetAstRoot_allowsReparse() {
    SourceFile sourceFile = SourceFile.fromCode("test.js", "var x = 1;");
    JsAst ast = new JsAst(sourceFile);
    Node firstRoot = ast.getAstRoot(compiler);
    assertNotNull(firstRoot);

    ast.clearAst();

    Node secondRoot = ast.getAstRoot(compiler);
    assertNotNull(secondRoot);
  }

  // --------- Edge cases (empty, boundary, unusual input) ---------

  @Test
  public void testGetAstRoot_emptyCode_returnsNonNullRoot() {
    SourceFile sourceFile = SourceFile.fromCode("empty.js", "");
    JsAst ast = new JsAst(sourceFile);
    Node root = ast.getAstRoot(compiler);
    assertNotNull(root);
  }

  @Test
  public void testGetAstRoot_syntaxErrorCode_returnsNonNullFallbackRoot() {
    SourceFile sourceFile = SourceFile.fromCode("bad.js", "var x = ;;;");
    JsAst ast = new JsAst(sourceFile);
    Node root = ast.getAstRoot(compiler);
    // Even with a parse error, the implementation must fall back to a dummy
    // script node instead of returning null.
    assertNotNull(root);
  }

  @Test
  public void testGetAstRoot_nonExistentFile_handlesIOExceptionGracefully() {
    SourceFile sourceFile = SourceFile.fromFile("this_file_should_not_exist_123456.js");
    JsAst ast = new JsAst(sourceFile);
    Node root = ast.getAstRoot(compiler);
    // Should fall back to a dummy script node rather than throwing.
    assertNotNull(root);
  }

  @Test
  public void testConstructor_emptyFileName_createsAstWithoutException() {
    SourceFile sourceFile = SourceFile.fromCode("", "var x = 1;");
    JsAst ast = new JsAst(sourceFile);
    assertNotNull(ast.getInputId());
    assertEquals(sourceFile, ast.getSourceFile());
  }

  // --------- Exception cases ---------

  @Test(expected = IllegalStateException.class)
  public void testSetSourceFile_differentName_throwsIllegalStateException() {
    SourceFile sourceFile1 = SourceFile.fromCode("test1.js", "var x = 1;");
    JsAst ast = new JsAst(sourceFile1);
    SourceFile sourceFile2 = SourceFile.fromCode("test2.js", "var y = 2;");
    ast.setSourceFile(sourceFile2);
  }

  @Test
  public void testConstructor_nullSourceFile_throwsNullPointerException() {
    try {
      new JsAst(null);
      fail("Expected NullPointerException was not thrown");
    } catch (NullPointerException expected) {
      // expected because sourceFile.getName() is called on null in constructor
    }
  }

  @Test
  public void testGetAstRoot_nullCompiler_throwsNullPointerException() {
    SourceFile sourceFile = SourceFile.fromCode("test.js", "var x = 1;");
    JsAst ast = new JsAst(sourceFile);
    try {
      ast.getAstRoot(null);
      fail("Expected NullPointerException was not thrown");
    } catch (NullPointerException expected) {
      // expected because compiler.getParserConfig() etc. is called on null
    }
  }
}
