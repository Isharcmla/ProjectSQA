package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CodeConsumerTest {

  private static class ConcreteCodeConsumer extends CodeConsumer {
    private final StringBuilder buffer = new StringBuilder();
    int cutLineCount = 0;
    int endLineCount = 0;
    int startNewLineCount = 0;
    int notePreferredLineBreakCount = 0;
    int endCaseBodyCount = 0;
    int endFileCount = 0;
    int startSourceMappingCount = 0;
    int endSourceMappingCount = 0;

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
      notePreferredLineBreakCount++;
    }

    @Override
    void endCaseBody() {
      endCaseBodyCount++;
    }

    @Override
    void endFile() {
      endFileCount++;
    }

    @Override
    void startSourceMapping(Node node) {
      startSourceMappingCount++;
    }

    @Override
    void endSourceMapping(Node node) {
      endSourceMappingCount++;
    }

    String getOutput() {
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
  public void testBreakAfterBlockFor() {
    Node node = new Node(0);
    Assert.assertTrue(consumer.breakAfterBlockFor(node, true));
    Assert.assertFalse(consumer.breakAfterBlockFor(node, false));
  }

  @Test
  public void testDefaultEmptyMethods() {
    Node node = new Node(0);
    consumer.startSourceMapping(node);
    consumer.endSourceMapping(node);
    consumer.startNewLine();
    consumer.maybeLineBreak();
    consumer.endLine();
    consumer.notePreferredLineBreak();
    consumer.endCaseBody();
    consumer.endFile();

    Assert.assertEquals(1, consumer.startSourceMappingCount);
    Assert.assertEquals(1, consumer.endSourceMappingCount);
    Assert.assertEquals(1, consumer.startNewLineCount);
    Assert.assertEquals(1, consumer.cutLineCount);
    Assert.assertEquals(1, consumer.endLineCount);
    Assert.assertEquals(1, consumer.notePreferredLineBreakCount);
    Assert.assertEquals(1, consumer.endCaseBodyCount);
    Assert.assertEquals(1, consumer.endFileCount);
  }

  @Test
  public void testIsNegativeZero() {
    Assert.assertTrue(CodeConsumer.isNegativeZero(-0.0));
    Assert.assertFalse(CodeConsumer.isNegativeZero(0.0));
    Assert.assertFalse(CodeConsumer.isNegativeZero(-1.0));
    Assert.assertFalse(CodeConsumer.isNegativeZero(1.0));
    Assert.assertFalse(CodeConsumer.isNegativeZero(Double.NaN));
    Assert.assertFalse(CodeConsumer.isNegativeZero(Double.NEGATIVE_INFINITY));
  }

  @Test
  public void testIsWordChar() {
    Assert.assertTrue(CodeConsumer.isWordChar('_'));
    Assert.assertTrue(CodeConsumer.isWordChar('$'));
    Assert.assertTrue(CodeConsumer.isWordChar('a'));
    Assert.assertTrue(CodeConsumer.isWordChar('Z'));
    Assert.assertTrue(CodeConsumer.isWordChar('0'));
    Assert.assertTrue(CodeConsumer.isWordChar('9'));
    Assert.assertFalse(CodeConsumer.isWordChar('+'));
    Assert.assertFalse(CodeConsumer.isWordChar('-'));
    Assert.assertFalse(CodeConsumer.isWordChar(' '));
    Assert.assertFalse(CodeConsumer.isWordChar('\n'));
    Assert.assertFalse(CodeConsumer.isWordChar('/'));
  }

  @Test
  public void testAdd_emptyString() {
    consumer.add("");
    Assert.assertEquals("", consumer.getOutput());
  }

  @Test
  public void testAdd_wordCharsSeparatedBySpace() {
    consumer.add("var");
    consumer.add("foo");
    Assert.assertEquals("var foo", consumer.getOutput());
  }

  @Test
  public void testAdd_backslashSeparatedBySpace() {
    consumer.add("var");
    consumer.add("\\u0061");
    Assert.assertEquals("var \\u0061", consumer.getOutput());
  }

  @Test
  public void testAdd_consecutiveSlashesSeparatedBySpace() {
    consumer.add("/");
    consumer.add("/test/");
    Assert.assertEquals("/ /test/", consumer.getOutput());
  }

  @Test
  public void testAddIdentifier() {
    consumer.addIdentifier("myVar");
    Assert.assertEquals("myVar", consumer.getOutput());
  }

  @Test
  public void testBeginBlock_withoutStatementNeedsEnded() {
    consumer.statementNeedsEnded = false;
    consumer.beginBlock();
    Assert.assertEquals("{", consumer.getOutput());
    Assert.assertEquals(1, consumer.endLineCount);
    Assert.assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testBeginBlock_withStatementNeedsEnded() {
    consumer.statementNeedsEnded = true;
    consumer.beginBlock();
    Assert.assertEquals(";{", consumer.getOutput());
    Assert.assertEquals(1, consumer.cutLineCount);
    Assert.assertEquals(1, consumer.endLineCount);
    Assert.assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndBlock_noArgs() {
    consumer.statementNeedsEnded = true;
    consumer.endBlock();
    Assert.assertEquals("}", consumer.getOutput());
    Assert.assertEquals(0, consumer.endLineCount);
    Assert.assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndBlock_withShouldEndLineTrue() {
    consumer.statementNeedsEnded = true;
    consumer.endBlock(true);
    Assert.assertEquals("}", consumer.getOutput());
    Assert.assertEquals(1, consumer.endLineCount);
    Assert.assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testAppendBlockStartAndEnd() {
    consumer.appendBlockStart();
    consumer.appendBlockEnd();
    Assert.assertEquals("{}", consumer.getOutput());
  }

  @Test
  public void testListSeparator() {
    consumer.listSeparator();
    Assert.assertEquals(",", consumer.getOutput());
    Assert.assertEquals(1, consumer.cutLineCount);
  }

  @Test
  public void testEndStatement_noArgs() {
    consumer.statementStarted = true;
    consumer.endStatement();
    Assert.assertTrue(consumer.statementNeedsEnded);
    Assert.assertEquals("", consumer.getOutput());
  }

  @Test
  public void testEndStatement_needSemiColonTrue() {
    consumer.statementNeedsEnded = true;
    consumer.endStatement(true);
    Assert.assertEquals(";", consumer.getOutput());
    Assert.assertEquals(1, consumer.cutLineCount);
    Assert.assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndStatement_statementNotStarted() {
    consumer.statementStarted = false;
    consumer.endStatement(false);
    Assert.assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testMaybeEndStatement_whenNeedsEnded() {
    consumer.statementNeedsEnded = true;
    consumer.maybeEndStatement();
    Assert.assertEquals(";", consumer.getOutput());
    Assert.assertEquals(1, consumer.cutLineCount);
    Assert.assertEquals(1, consumer.endLineCount);
    Assert.assertFalse(consumer.statementNeedsEnded);
    Assert.assertTrue(consumer.statementStarted);
  }

  @Test
  public void testMaybeEndStatement_whenNotNeedsEnded() {
    consumer.statementNeedsEnded = false;
    consumer.maybeEndStatement();
    Assert.assertEquals("", consumer.getOutput());
    Assert.assertTrue(consumer.statementStarted);
  }

  @Test
  public void testEndFunction() {
    consumer.endFunction();
    Assert.assertTrue(consumer.sawFunction);
    Assert.assertEquals(0, consumer.endLineCount);

    consumer.endFunction(true);
    Assert.assertTrue(consumer.sawFunction);
    Assert.assertEquals(1, consumer.endLineCount);
  }

  @Test
  public void testBeginCaseBody() {
    consumer.beginCaseBody();
    Assert.assertEquals(":", consumer.getOutput());
  }

  @Test
  public void testAddOp_consecutivePlusOrMinus() {
    consumer.append("+");
    consumer.addOp("++", false);
    Assert.assertEquals("+ ++", consumer.getOutput());

    consumer.append("-");
    consumer.addOp("--", false);
    Assert.assertEquals("+ ++- --", consumer.getOutput());
  }

  @Test
  public void testAddOp_letterAfterWordChar() {
    consumer.add("x");
    consumer.addOp("instanceof", true);
    Assert.assertEquals("x instanceof", consumer.getOutput());
    Assert.assertEquals(1, consumer.cutLineCount);
  }

  @Test
  public void testAddOp_arrowAfterMinus() {
    consumer.append("-");
    consumer.addOp(">", false);
    Assert.assertEquals("- >", consumer.getOutput());
  }

  @Test
  public void testAddOp_binOpFalse() {
    consumer.addOp("!", false);
    Assert.assertEquals("!", consumer.getOutput());
    Assert.assertEquals(0, consumer.cutLineCount);
  }

  @Test
  public void testAddNumber_negativeZero() {
    consumer.addNumber(-0.0);
    Assert.assertEquals("-0.0", consumer.getOutput());
  }

  @Test
  public void testAddNumber_positiveZero() {
    consumer.addNumber(0.0);
    Assert.assertEquals("0", consumer.getOutput());
  }

  @Test
  public void testAddNumber_integerWithScientificNotation() {
    consumer.addNumber(1000.0);
    Assert.assertEquals("1E3", consumer.getOutput());

    consumer.addNumber(120000.0);
    Assert.assertEquals("1E312E4", consumer.getOutput());

    ConcreteCodeConsumer singleConsumer = new ConcreteCodeConsumer();
    singleConsumer.addNumber(100.0);
    Assert.assertEquals("100", singleConsumer.getOutput());

    ConcreteCodeConsumer nonZeroEnding = new ConcreteCodeConsumer();
    nonZeroEnding.addNumber(1050.0);
    Assert.assertEquals("105E1", nonZeroEnding.getOutput());
  }

  @Test
  public void testAddNumber_integerWithoutScientificNotation() {
    consumer.addNumber(42.0);
    Assert.assertEquals("42", consumer.getOutput());

    consumer.addNumber(-42.0);
    Assert.assertEquals("42-42", consumer.getOutput());
  }

  @Test
  public void testAddNumber_negativeNumberAfterMinus() {
    consumer.append("-");
    consumer.addNumber(-4.0);
    Assert.assertEquals("- -4", consumer.getOutput());
  }

  @Test
  public void testAddNumber_floatingPoint() {
    consumer.addNumber(3.1415);
    Assert.assertEquals("3.1415", consumer.getOutput());

    consumer.addNumber(Double.NaN);
    Assert.assertEquals("3.1415NaN", consumer.getOutput());

    consumer.addNumber(Double.POSITIVE_INFINITY);
    Assert.assertEquals("3.1415NaNInfinity", consumer.getOutput());
  }
}
