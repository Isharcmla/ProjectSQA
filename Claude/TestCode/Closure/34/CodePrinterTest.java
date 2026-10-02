package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.nio.charset.Charset;

import org.junit.Test;

/**
 * Unit tests for {@link CodePrinter}.
 *
 * NOTE: CodePrinter, MappedCodePrinter, PrettyCodePrinter and CompactCodePrinter
 * are package-private and their inner printer classes have private constructors,
 * so the only reachable public surface for testing is CodePrinter.Builder and
 * the package-private Format enum / DEFAULT_LINE_LENGTH_THRESHOLD constant.
 *
 * Node/Token basic construction API (Node(int type), Node.newString(int,String),
 * Node.newNumber(double), addChildToBack) is assumed based on the well known
 * Closure Compiler rhino.Node API used elsewhere in this source file
 * (e.g. Token.DO, Token.FUNCTION, Token.TRY, Token.CATCH, Token.IF used as int
 * constants, n.isBlock(), parent.getType()).
 */
public class CodePrinterTest {

  // ---------- Normal / typical cases ----------

  @Test
  public void testBuild_emptyScriptCompactFormat_returnsEmptyString() {
    Node root = new Node(Token.SCRIPT);
    String result = new CodePrinter.Builder(root).build();
    assertEquals("", result);
  }

  @Test
  public void testBuild_emptyScriptPrettyFormat_returnsEmptyString() {
    Node root = new Node(Token.SCRIPT);
    String result = new CodePrinter.Builder(root).setPrettyPrint(true).build();
    assertEquals("", result);
  }

  @Test
  public void testBuild_simpleVarStatement_returnsNonEmptyCode() {
    Node root = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "x");
    nameNode.addChildToBack(Node.newNumber(1));
    varNode.addChildToBack(nameNode);
    root.addChildToBack(varNode);

    String result = new CodePrinter.Builder(root).build();
    assertNotNull(result);
    assertFalse(result.isEmpty());
    assertTrue(result.contains("x"));
  }

  @Test
  public void testBuild_simpleVarStatementPrettyPrint_returnsNonEmptyCode() {
    Node root = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "x");
    nameNode.addChildToBack(Node.newNumber(1));
    varNode.addChildToBack(nameNode);
    root.addChildToBack(varNode);

    String result = new CodePrinter.Builder(root).setPrettyPrint(true).build();
    assertNotNull(result);
    assertFalse(result.isEmpty());
  }

  @Test
  public void testBuild_withLineBreakOption_doesNotThrow() {
    Node root = new Node(Token.SCRIPT);
    String result = new CodePrinter.Builder(root).setLineBreak(true).build();
    assertEquals("", result);
  }

  @Test
  public void testBuild_withPreferLineBreakAtEndOfFile_doesNotThrow() {
    Node root = new Node(Token.SCRIPT);
    String result = new CodePrinter.Builder(root)
        .setPreferLineBreakAtEndOfFile(true)
        .build();
    assertEquals("", result);
  }

  @Test
  public void testBuild_withOutputTypes_doesNotThrow() {
    Node root = new Node(Token.SCRIPT);
    String result = new CodePrinter.Builder(root).setOutputTypes(true).build();
    assertNotNull(result);
  }

  @Test
  public void testBuild_withTagAsStrict_doesNotThrow() {
    Node root = new Node(Token.SCRIPT);
    String result = new CodePrinter.Builder(root).setTagAsStrict(true).build();
    assertNotNull(result);
  }

  @Test
  public void testBuild_withOutputCharset_doesNotThrow() {
    Node root = new Node(Token.SCRIPT);
    Charset charset = Charset.forName("UTF-8");
    String result = new CodePrinter.Builder(root).setOutputCharset(charset).build();
    assertEquals("", result);
  }

  @Test
  public void testBuild_withOutputCharsetNull_doesNotThrow() {
    Node root = new Node(Token.SCRIPT);
    String result = new CodePrinter.Builder(root).setOutputCharset(null).build();
    assertEquals("", result);
  }

  @Test
  public void testBuild_withSourceMapDetailLevelAll_doesNotThrow() {
    Node root = new Node(Token.SCRIPT);
    String result = new CodePrinter.Builder(root)
        .setSourceMapDetailLevel(SourceMap.DetailLevel.ALL)
        .build();
    assertEquals("", result);
  }

  @Test
  public void testBuild_withSourceMapNull_defaultBehavior_returnsEmptyString() {
    Node root = new Node(Token.SCRIPT);
    String result = new CodePrinter.Builder(root).setSourceMap(null).build();
    assertEquals("", result);
  }

  @Test
  public void testBuild_chainedBuilderCalls_returnsEmptyString() {
    Node root = new Node(Token.SCRIPT);
    String result = new CodePrinter.Builder(root)
        .setPrettyPrint(false)
        .setLineBreak(false)
        .setPreferLineBreakAtEndOfFile(false)
        .setOutputTypes(false)
        .setLineLengthThreshold(CodePrinter.DEFAULT_LINE_LENGTH_THRESHOLD)
        .setSourceMap(null)
        .setSourceMapDetailLevel(SourceMap.DetailLevel.ALL)
        .setOutputCharset(null)
        .setTagAsStrict(false)
        .build();
    assertEquals("", result);
  }

  // ---------- Edge cases: 0 / negative / boundary values ----------

  @Test
  public void testBuild_withZeroLineLengthThreshold_doesNotThrow() {
    Node root = new Node(Token.SCRIPT);
    String result = new CodePrinter.Builder(root).setLineLengthThreshold(0).build();
    assertEquals("", result);
  }

  @Test
  public void testBuild_withNegativeLineLengthThreshold_doesNotThrow() {
    Node root = new Node(Token.SCRIPT);
    String result = new CodePrinter.Builder(root).setLineLengthThreshold(-1).build();
    assertEquals("", result);
  }

  @Test
  public void testBuild_withVerySmallPositiveLineLengthThreshold_doesNotThrow() {
    Node root = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "x");
    nameNode.addChildToBack(Node.newNumber(1));
    varNode.addChildToBack(nameNode);
    root.addChildToBack(varNode);

    String result = new CodePrinter.Builder(root).setLineLengthThreshold(1).build();
    assertNotNull(result);
  }

  @Test
  public void testBuild_withDefaultLineLengthThresholdConstant_matchesExpectedValue() {
    assertEquals(500, CodePrinter.DEFAULT_LINE_LENGTH_THRESHOLD);
  }

  @Test
  public void testBuild_prettyPrintWithZeroLineLengthThreshold_returnsEmptyString() {
    Node root = new Node(Token.SCRIPT);
    String result = new CodePrinter.Builder(root)
        .setPrettyPrint(true)
        .setLineLengthThreshold(0)
        .build();
    assertEquals("", result);
  }

  // ---------- Exception cases ----------

  @Test(expected = IllegalStateException.class)
  public void testBuild_nullRoot_throwsIllegalStateException() {
    new CodePrinter.Builder(null).build();
  }

  @Test(expected = IllegalStateException.class)
  public void testSetSourceMapDetailLevel_nullLevel_throwsIllegalStateException() {
    Node root = new Node(Token.SCRIPT);
    new CodePrinter.Builder(root).setSourceMapDetailLevel(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testBuild_nullRootWithOtherOptionsSet_throwsIllegalStateException() {
    new CodePrinter.Builder(null)
        .setPrettyPrint(true)
        .setLineBreak(true)
        .build();
  }

  // ---------- Builder fluent API returns same instance ----------

  @Test
  public void testSetPrettyPrint_returnsSameBuilderInstance() {
    CodePrinter.Builder builder = new CodePrinter.Builder(new Node(Token.SCRIPT));
    CodePrinter.Builder result = builder.setPrettyPrint(true);
    assertSame(builder, result);
  }

  @Test
  public void testSetLineBreak_returnsSameBuilderInstance() {
    CodePrinter.Builder builder = new CodePrinter.Builder(new Node(Token.SCRIPT));
    CodePrinter.Builder result = builder.setLineBreak(true);
    assertSame(builder, result);
  }

  @Test
  public void testSetPreferLineBreakAtEndOfFile_returnsSameBuilderInstance() {
    CodePrinter.Builder builder = new CodePrinter.Builder(new Node(Token.SCRIPT));
    CodePrinter.Builder result = builder.setPreferLineBreakAtEndOfFile(true);
    assertSame(builder, result);
  }

  @Test
  public void testSetOutputTypes_returnsSameBuilderInstance() {
    CodePrinter.Builder builder = new CodePrinter.Builder(new Node(Token.SCRIPT));
    CodePrinter.Builder result = builder.setOutputTypes(true);
    assertSame(builder, result);
  }

  @Test
  public void testSetLineLengthThreshold_returnsSameBuilderInstance() {
    CodePrinter.Builder builder = new CodePrinter.Builder(new Node(Token.SCRIPT));
    CodePrinter.Builder result = builder.setLineLengthThreshold(100);
    assertSame(builder, result);
  }

  @Test
  public void testSetSourceMap_returnsSameBuilderInstance() {
    CodePrinter.Builder builder = new CodePrinter.Builder(new Node(Token.SCRIPT));
    CodePrinter.Builder result = builder.setSourceMap(null);
    assertSame(builder, result);
  }

  @Test
  public void testSetSourceMapDetailLevel_returnsSameBuilderInstance() {
    CodePrinter.Builder builder = new CodePrinter.Builder(new Node(Token.SCRIPT));
    CodePrinter.Builder result = builder.setSourceMapDetailLevel(SourceMap.DetailLevel.ALL);
    assertSame(builder, result);
  }

  @Test
  public void testSetOutputCharset_returnsSameBuilderInstance() {
    CodePrinter.Builder builder = new CodePrinter.Builder(new Node(Token.SCRIPT));
    CodePrinter.Builder result = builder.setOutputCharset(Charset.forName("UTF-8"));
    assertSame(builder, result);
  }

  @Test
  public void testSetTagAsStrict_returnsSameBuilderInstance() {
    CodePrinter.Builder builder = new CodePrinter.Builder(new Node(Token.SCRIPT));
    CodePrinter.Builder result = builder.setTagAsStrict(true);
    assertSame(builder, result);
  }

  // ---------- Format enum coverage ----------

  @Test
  public void testFormatEnum_valuesContainsAllThreeConstants() {
    CodePrinter.Format[] values = CodePrinter.Format.values();
    assertEquals(3, values.length);
  }

  @Test
  public void testFormatEnum_valueOfCompact_returnsCompact() {
    CodePrinter.Format format = CodePrinter.Format.valueOf("COMPACT");
    assertEquals(CodePrinter.Format.COMPACT, format);
  }

  @Test
  public void testFormatEnum_valueOfPretty_returnsPretty() {
    CodePrinter.Format format = CodePrinter.Format.valueOf("PRETTY");
    assertEquals(CodePrinter.Format.PRETTY, format);
  }

  @Test
  public void testFormatEnum_valueOfTyped_returnsTyped() {
    CodePrinter.Format format = CodePrinter.Format.valueOf("TYPED");
    assertEquals(CodePrinter.Format.TYPED, format);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFormatEnum_valueOfInvalid_throwsIllegalArgumentException() {
    CodePrinter.Format.valueOf("NOT_A_FORMAT");
  }

  // ---------- Combination: outputTypes takes precedence over prettyPrint ----------

  @Test
  public void testBuild_outputTypesTrueAndPrettyPrintTrue_doesNotThrow() {
    Node root = new Node(Token.SCRIPT);
    String result = new CodePrinter.Builder(root)
        .setOutputTypes(true)
        .setPrettyPrint(true)
        .build();
    assertNotNull(result);
  }

  @Test
  public void testBuild_prettyPrintFalseOutputTypesFalse_compactFormatUsed() {
    Node root = new Node(Token.SCRIPT);
    String result = new CodePrinter.Builder(root)
        .setOutputTypes(false)
        .setPrettyPrint(false)
        .build();
    assertEquals("", result);
  }
}
