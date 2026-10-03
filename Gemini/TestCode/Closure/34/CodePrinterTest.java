package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class CodePrinterTest {

  @Test
  public void testBuilder_defaultCompact_generatesSource() {
    Node node = Node.newString(Token.NAME, "x");
    CodePrinter.Builder builder = new CodePrinter.Builder(node);
    String code = builder.build();
    Assert.assertEquals("x", code);
  }

  @Test(expected = IllegalStateException.class)
  public void testBuilder_nullRoot_throwsIllegalStateException() {
    CodePrinter.Builder builder = new CodePrinter.Builder(null);
    builder.build();
  }

  @Test
  public void testBuilder_prettyPrint_generatesFormattedSource() {
    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
    Node blockNode = new Node(Token.BLOCK, varNode);
    Node scriptNode = new Node(Token.SCRIPT, blockNode);

    CodePrinter.Builder builder = new CodePrinter.Builder(scriptNode);
    builder.setPrettyPrint(true);
    String code = builder.build();
    Assert.assertTrue(code.contains("var a;"));
  }

  @Test
  public void testBuilder_outputTypes_generatesTypedSource() {
    Node node = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    CodePrinter.Builder builder = new CodePrinter.Builder(node);
    builder.setOutputTypes(true);
    String code = builder.build();
    Assert.assertNotNull(code);
    Assert.assertTrue(code.contains("var x;"));
  }

  @Test
  public void testBuilder_tagAsStrict_addsUseStrictDirective() {
    Node node = new Node(Token.SCRIPT);
    CodePrinter.Builder builder = new CodePrinter.Builder(node);
    builder.setTagAsStrict(true);
    String code = builder.build();
    Assert.assertTrue(code.contains("'use strict'"));
  }

  @Test
  public void testBuilder_withSourceMapAndDetailLevel_generatesSourceMap() {
    Node script = new Node(Token.SCRIPT);
    script.setSourceFileName("test.js");
    script.setLineno(1);
    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "foo"));
    varNode.setSourceFileName("test.js");
    varNode.setLineno(1);
    script.addChildToBack(varNode);

    SourceMap sourceMap = new SourceMap();
    CodePrinter.Builder builder = new CodePrinter.Builder(script);
    builder.setSourceMap(sourceMap);
    builder.setSourceMapDetailLevel(SourceMap.DetailLevel.ALL);
    String code = builder.build();

    Assert.assertTrue(code.contains("var foo;"));
  }

  @Test(expected = IllegalStateException.class)
  public void testBuilder_nullSourceMapDetailLevel_throwsIllegalStateException() {
    Node node = Node.newString(Token.NAME, "x");
    CodePrinter.Builder builder = new CodePrinter.Builder(node);
    builder.setSourceMapDetailLevel(null);
  }

  @Test
  public void testBuilder_withCustomCharset_outputsExpected() {
    Node node = Node.newString(Token.NAME, "greeting");
    CodePrinter.Builder builder = new CodePrinter.Builder(node);
    builder.setOutputCharset(StandardCharsets.UTF_8);
    String code = builder.build();
    Assert.assertEquals("greeting", code);
  }

  @Test
  public void testBuilder_lineBreakAndThreshold_formatsWithLineBreaks() {
    Node block = new Node(Token.BLOCK);
    for (int i = 0; i < 10; i++) {
      Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "varLongName" + i));
      block.addChildToBack(varNode);
    }
    CodePrinter.Builder builder = new CodePrinter.Builder(block);
    builder.setLineBreak(true);
    builder.setLineLengthThreshold(20);
    String code = builder.build();
    Assert.assertTrue(code.contains("\n"));
  }

  @Test
  public void testBuilder_negativeThreshold_normalizesThreshold() {
    Node node = Node.newString(Token.NAME, "x");
    CodePrinter.Builder builder = new CodePrinter.Builder(node);
    builder.setLineLengthThreshold(-5);
    String code = builder.build();
    Assert.assertEquals("x", code);
  }

  @Test
  public void testBuilder_preferLineBreakAtEndOfFile_exceedsHalfThreshold() {
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "abcdefghijklmn")));
    CodePrinter.Builder builder = new CodePrinter.Builder(block);
    builder.setLineLengthThreshold(10);
    builder.setPreferLineBreakAtEndOfFile(true);
    String code = builder.build();
    Assert.assertTrue(code.endsWith(";\n"));
  }

  @Test
  public void testBuilder_preferLineBreakAtEndOfFile_withCutShifting() {
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "varA")));
    block.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "varB")));
    CodePrinter.Builder builder = new CodePrinter.Builder(block);
    builder.setLineLengthThreshold(5);
    builder.setPreferLineBreakAtEndOfFile(true);
    String code = builder.build();
    Assert.assertTrue(code.endsWith(";\n"));
  }

  @Test
  public void testPrettyPrinter_controlStructures_handlesBranches() {
    // If statement without else and with else
    Node cond = Node.newString(Token.NAME, "cond");
    Node thenBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "a")));
    Node elseBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "b")));
    Node ifNode = new Node(Token.IF, cond, thenBlock, elseBlock);

    // Try Catch Finally
    Node tryBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "t")));
    Node catchVar = Node.newString(Token.NAME, "e");
    Node catchBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "c")));
    Node catchNode = new Node(Token.CATCH, catchVar, catchBody);
    Node blockCatch = new Node(Token.BLOCK, catchNode);
    Node finallyBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "f")));
    Node tryNode = new Node(Token.TRY, tryBlock, blockCatch, finallyBlock);

    // Do While
    Node doBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "d")));
    Node doCond = Node.newString(Token.NAME, "c");
    Node doNode = new Node(Token.DO, doBody, doCond);

    // Function definition
    Node fnName = Node.newString(Token.NAME, "fn");
    Node fnParams = new Node(Token.LP);
    Node fnBody = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newString(Token.NAME, "x")));
    Node fnNode = new Node(Token.FUNCTION, fnName, fnParams, fnBody);

    // Switch case
    Node switchVal = Node.newString(Token.NAME, "s");
    Node caseExpr = Node.newNumber(1);
    Node caseBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "res")));
    Node caseNode = new Node(Token.CASE, caseExpr, caseBody);
    Node switchNode = new Node(Token.SWITCH, switchVal, caseNode);

    Node script = new Node(Token.SCRIPT, ifNode, tryNode, doNode, fnNode, switchNode);

    CodePrinter.Builder builder = new CodePrinter.Builder(script);
    builder.setPrettyPrint(true);
    builder.setLineLengthThreshold(10);
    String code = builder.build();

    Assert.assertTrue(code.contains("if (cond) {"));
    Assert.assertTrue(code.contains("} else {"));
    Assert.assertTrue(code.contains("try {"));
    Assert.assertTrue(code.contains("} catch (e) {"));
    Assert.assertTrue(code.contains("} finally {"));
    Assert.assertTrue(code.contains("do {"));
    Assert.assertTrue(code.contains("function fn() {"));
    Assert.assertTrue(code.contains("switch (s) {"));
    Assert.assertTrue(code.contains("case 1:"));
  }

  @Test
  public void testPrettyPrinter_binaryAndUnaryOperators() {
    Node addNode = new Node(Token.ADD, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    Node notNode = new Node(Token.NOT, Node.newString(Token.NAME, "c"));
    Node expr1 = new Node(Token.EXPR_RESULT, addNode);
    Node expr2 = new Node(Token.EXPR_RESULT, notNode);
    Node script = new Node(Token.SCRIPT, expr1, expr2);

    CodePrinter.Builder builder = new CodePrinter.Builder(script);
    builder.setPrettyPrint(true);
    String code = builder.build();

    Assert.assertTrue(code.contains("a + b;"));
    Assert.assertTrue(code.contains("!c;"));
  }

  @Test
  public void testPrettyPrinter_arrayAndObjectLiterals() {
    Node array = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2));
    Node objKey = Node.newString(Token.STRING_KEY, "k");
    objKey.addChildToBack(Node.newString(Token.NAME, "v"));
    Node obj = new Node(Token.OBJECTLIT, objKey);
    Node script = new Node(Token.SCRIPT, new Node(Token.EXPR_RESULT, array), new Node(Token.EXPR_RESULT, obj));

    CodePrinter.Builder builder = new CodePrinter.Builder(script);
    builder.setPrettyPrint(true);
    builder.setLineLengthThreshold(5);
    String code = builder.build();

    Assert.assertTrue(code.contains("[1, 2]"));
    Assert.assertTrue(code.contains("k: v"));
  }

  @Test
  public void testSourceMapping_withCompactPrinterAndLineCuts() {
    Node script = new Node(Token.SCRIPT);
    script.setSourceFileName("foo.js");
    script.setLineno(1);

    for (int i = 0; i < 5; i++) {
      Node name = Node.newString(Token.NAME, "veryLongVariableName" + i);
      name.setSourceFileName("foo.js");
      name.setLineno(i + 1);
      Node varNode = new Node(Token.VAR, name);
      varNode.setSourceFileName("foo.js");
      varNode.setLineno(i + 1);
      script.addChildToBack(varNode);
    }

    SourceMap sourceMap = new SourceMap();
    CodePrinter.Builder builder = new CodePrinter.Builder(script);
    builder.setLineLengthThreshold(15);
    builder.setSourceMap(sourceMap);
    builder.setSourceMapDetailLevel(SourceMap.DetailLevel.ALL);
    builder.setPreferLineBreakAtEndOfFile(true);
    String code = builder.build();

    Assert.assertNotNull(code);
    Assert.assertTrue(code.contains("veryLongVariableName0"));
  }

  @Test
  public void testCompactCodePrinter_functionLineBreak() {
    Node fn = new Node(Token.FUNCTION,
        Node.newString(Token.NAME, "foo"),
        new Node(Token.LP),
        new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(1))));
    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    Node script = new Node(Token.SCRIPT, fn, varNode);

    CodePrinter.Builder builder = new CodePrinter.Builder(script);
    builder.setLineBreak(true);
    String code = builder.build();

    Assert.assertTrue(code.contains("function foo(){return 1}"));
    Assert.assertTrue(code.contains("var x;"));
  }

  @Test
  public void testFormatEnumValues() {
    Assert.assertEquals(3, CodePrinter.Format.values().length);
    Assert.assertEquals(CodePrinter.Format.COMPACT, CodePrinter.Format.valueOf("COMPACT"));
    Assert.assertEquals(CodePrinter.Format.PRETTY, CodePrinter.Format.valueOf("PRETTY"));
    Assert.assertEquals(CodePrinter.Format.TYPED, CodePrinter.Format.valueOf("TYPED"));
  }
}
