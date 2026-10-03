package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CodeConsumerTest {

  private static class ConcreteCodeConsumer extends CodeConsumer {
    final StringBuilder buffer = new StringBuilder();
    int cutLineCount = 0;
    int endLineCount = 0;
    int startNewLineCount = 0;
    int preferredLineBreakCount = 0;
    int startSourceMappingCount = 0;
    int endSourceMappingCount = 0;
    int endFileCount = 0;

    @Override
    char getLastChar() {
      if (buffer.length() == 0) {
        return '\0';
      }
      return buffer.charAt(buffer.length() - 1);
    }

    @Override
    void append(String str) {
      buffer.append(str);
    }

    @Override
    void maybeCutLine() {
      cutLineCount++;
    }

    @Override
    void endLine() {
      endLineCount++;
    }

    @Override
    void startNewLine() {
      startNewLineCount++;
    }

    @Override
    void notePreferredLineBreak() {
      preferredLineBreakCount++;
    }

    @Override
    void startSourceMapping(Node node) {
      startSourceMappingCount++;
    }

    @Override
    void endSourceMapping(Node node) {
      endSourceMappingCount++;
    }

    @Override
    void endFile() {
      endFileCount++;
    }

    String getCode() {
      return buffer.toString();
    }
  }

  private ConcreteCodeConsumer consumer;

  @Before
  public void setUp() {
    consumer = new ConcreteCodeConsumer();
  }

  @Test
  public void testContinueProcessing_default_returnsTrue() {
    Assert.assertTrue(consumer.continueProcessing());
  }

  @Test
  public void testShouldPreserveExtraBlocks_default_returnsFalse() {
    Assert.assertFalse(consumer.shouldPreserveExtraBlocks());
  }

  @Test
  public void testBreakAfterBlockFor_condition_returnsExpected() {
    Assert.assertTrue(consumer.breakAfterBlockFor(null, true));
    Assert.assertFalse(consumer.breakAfterBlockFor(null, false));
  }

  @Test
  public void testDefaultEmptyMethods_noOp() {
    consumer.startSourceMapping(null);
    consumer.endSourceMapping(null);
    consumer.startNewLine();
    consumer.maybeLineBreak();
    consumer.notePreferredLineBreak();
    consumer.endCaseBody();
    consumer.endFile();

    Assert.assertEquals(1, consumer.startSourceMappingCount);
    Assert.assertEquals(1, consumer.endSourceMappingCount);
    Assert.assertEquals(1, consumer.startNewLineCount);
    Assert.assertEquals(1, consumer.cutLineCount);
    Assert.assertEquals(1, consumer.preferredLineBreakCount);
    Assert.assertEquals(1, consumer.endFileCount);
  }

  @Test
  public void testIsWordChar_variousCharacters_correctResults() {
    Assert.assertTrue(CodeConsumer.isWordChar('_'));
    Assert.assertTrue(CodeConsumer.isWordChar('$'));
    Assert.assertTrue(CodeConsumer.isWordChar('a'));
    Assert.assertTrue(CodeConsumer.isWordChar('Z'));
    Assert.assertTrue(CodeConsumer.isWordChar('0'));
    Assert.assertTrue(CodeConsumer.isWordChar('9'));

    Assert.assertFalse(CodeConsumer.isWordChar(' '));
    Assert.assertFalse(CodeConsumer.isWordChar('+'));
    Assert.assertFalse(CodeConsumer.isWordChar('-'));
    Assert.assertFalse(CodeConsumer.isWordChar('>'));
    Assert.assertFalse(CodeConsumer.isWordChar(';'));
    Assert.assertFalse(CodeConsumer.isWordChar('\0'));
    Assert.assertFalse(CodeConsumer.isWordChar('\\'));
  }

  @Test
  public void testAddIdentifier_validString_appendsIdentifier() {
    consumer.addIdentifier("myVar");
    Assert.assertEquals("myVar", consumer.getCode());
  }

  @Test
  public void testAppendBlockStartAndEnd_appendsCorrectly() {
    consumer.appendBlockStart();
    consumer.appendBlockEnd();
    Assert.assertEquals("{}", consumer.getCode());
  }

  @Test
  public void testBeginBlock_withoutStatementPending_appendsBlockStartAndEndsLine() {
    consumer.beginBlock();
    Assert.assertEquals("{", consumer.getCode());
    Assert.assertEquals(1, consumer.endLineCount);
    Assert.assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testBeginBlock_withStatementPending_appendsSemicolonAndBlock() {
    consumer.statementNeedsEnded = true;
    consumer.beginBlock();
    Assert.assertEquals(";{", consumer.getCode());
    Assert.assertEquals(1, consumer.cutLineCount);
    Assert.assertEquals(1, consumer.endLineCount);
    Assert.assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndBlock_noArgs_doesNotEndLine() {
    consumer.statementNeedsEnded = true;
    consumer.endBlock();
    Assert.assertEquals("}", consumer.getCode());
    Assert.assertEquals(0, consumer.endLineCount);
    Assert.assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndBlock_withTrue_endsLine() {
    consumer.statementNeedsEnded = true;
    consumer.endBlock(true);
    Assert.assertEquals("}", consumer.getCode());
    Assert.assertEquals(1, consumer.endLineCount);
    Assert.assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testListSeparator_addsCommaAndCutLine() {
    consumer.add("a");
    consumer.listSeparator();
    consumer.add("b");
    Assert.assertEquals("a,b", consumer.getCode());
    Assert.assertEquals(1, consumer.cutLineCount);
  }

  @Test
  public void testEndStatement_noArgs_delegatesToFalse() {
    consumer.statementStarted = true;
    consumer.endStatement();
    Assert.assertTrue(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndStatement_notStarted_doesNotSetNeedsEnded() {
    consumer.statementStarted = false;
    consumer.endStatement(false);
    Assert.assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndStatement_needSemicolon_appendsSemicolonImmediately() {
    consumer.statementNeedsEnded = true;
    consumer.endStatement(true);
    Assert.assertEquals(";", consumer.getCode());
    Assert.assertEquals(1, consumer.cutLineCount);
    Assert.assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testMaybeEndStatement_needsEndedTrue_appendsSemicolonAndResets() {
    consumer.statementNeedsEnded = true;
    consumer.maybeEndStatement();
    Assert.assertEquals(";", consumer.getCode());
    Assert.assertEquals(1, consumer.cutLineCount);
    Assert.assertEquals(1, consumer.endLineCount);
    Assert.assertFalse(consumer.statementNeedsEnded);
    Assert.assertTrue(consumer.statementStarted);
  }

  @Test
  public void testMaybeEndStatement_needsEndedFalse_setsStatementStarted() {
    consumer.statementNeedsEnded = false;
    consumer.statementStarted = false;
    consumer.maybeEndStatement();
    Assert.assertEquals("", consumer.getCode());
    Assert.assertTrue(consumer.statementStarted);
  }

  @Test
  public void testEndFunction_default_setsSawFunction() {
    consumer.endFunction();
    Assert.assertTrue(consumer.sawFunction);
    Assert.assertEquals(0, consumer.endLineCount);
  }

  @Test
  public void testEndFunction_statementContextTrue_endsLine() {
    consumer.endFunction(true);
    Assert.assertTrue(consumer.sawFunction);
    Assert.assertEquals(1, consumer.endLineCount);
  }

  @Test
  public void testBeginCaseBody_appendsColon() {
    consumer.beginCaseBody();
    Assert.assertEquals(":", consumer.getCode());
  }

  @Test
  public void testAdd_emptyString_noOp() {
    consumer.add("");
    Assert.assertEquals("", consumer.getCode());
  }

  @Test
  public void testAdd_wordCharsSeparatedBySpace() {
    consumer.add("return");
    consumer.add("foo");
    Assert.assertEquals("return foo", consumer.getCode());
  }

  @Test
  public void testAdd_escapeSequenceSeparatedBySpace() {
    consumer.add("foo");
    consumer.add("\\u0020");
    Assert.assertEquals("foo \\u0020", consumer.getCode());
  }

  @Test
  public void testAdd_nonWordChars_noSpaceAdded() {
    consumer.add("foo");
    consumer.add("(");
    consumer.add("bar");
    consumer.add(")");
    Assert.assertEquals("foo(bar)", consumer.getCode());
  }

  @Test
  public void testAppendOp_appendsDirectly() {
    consumer.appendOp("+", false);
    Assert.assertEquals("+", consumer.getCode());
  }

  @Test
  public void testAddOp_plusAfterPlus_addsSpace() {
    consumer.add("x");
    consumer.addOp("+", false);
    consumer.addOp("++", false);
    Assert.assertEquals("x+ ++", consumer.getCode());
  }

  @Test
  public void testAddOp_minusAfterMinus_addsSpace() {
    consumer.add("x");
    consumer.addOp("-", false);
    consumer.addOp("--", false);
    Assert.assertEquals("x- --", consumer.getCode());
  }

  @Test
  public void testAddOp_letterAfterWordChar_addsSpace() {
    consumer.add("x");
    consumer.addOp("instanceof", true);
    Assert.assertEquals("x instanceof", consumer.getCode());
    Assert.assertEquals(1, consumer.cutLineCount);
  }

  @Test
  public void testAddOp_greaterAfterMinus_addsSpace() {
    consumer.add("x");
    consumer.addOp("-", false);
    consumer.addOp(">", false);
    Assert.assertEquals("x- >", consumer.getCode());
  }

  @Test
  public void testAddOp_unaryOp_doesNotCutLine() {
    consumer.addOp("!", false);
    Assert.assertEquals("!", consumer.getCode());
    Assert.assertEquals(0, consumer.cutLineCount);
  }

  @Test
  public void testAddNumber_negativeAfterMinus_addsSpace() {
    consumer.add("x");
    consumer.addOp("-", false);
    consumer.addNumber(-4);
    Assert.assertEquals("x- -4", consumer.getCode());
  }

  @Test
  public void testAddNumber_integersSmall_appendsValue() {
    consumer.addNumber(0.0);
    Assert.assertEquals("0", consumer.getCode());
  }

  @Test
  public void testAddNumber_integersUnderHundred_appendsValue() {
    consumer.addNumber(42.0);
    Assert.assertEquals("42", consumer.getCode());
  }

  @Test
  public void testAddNumber_integersExpTwoOrLess_appendsValue() {
    consumer.addNumber(100.0);
    Assert.assertEquals("100", consumer.getCode());
  }

  @Test
  public void testAddNumber_integersExpGreaterThanTwo_usesScientificNotation() {
    consumer.addNumber(1000.0);
    Assert.assertEquals("1E3", consumer.getCode());

    consumer = new ConcreteCodeConsumer();
    consumer.addNumber(1500000.0);
    Assert.assertEquals("15E5", consumer.getCode());

    consumer = new ConcreteCodeConsumer();
    consumer.addNumber(-20000.0);
    Assert.assertEquals("-2E4", consumer.getCode());
  }

  @Test
  public void testAddNumber_integersLargeNotDivisibleByTen_appendsValue() {
    consumer.addNumber(105.0);
    Assert.assertEquals("105", consumer.getCode());
  }

  @Test
  public void testAddNumber_floatingPoint_appendsExactDouble() {
    consumer.addNumber(3.14);
    Assert.assertEquals("3.14", consumer.getCode());

    consumer = new ConcreteCodeConsumer();
    consumer.addNumber(0.5);
    Assert.assertEquals("0.5", consumer.getCode());
  }
}
