package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CodeConsumerTest {

  private TestCodeConsumer consumer;

  private static class TestCodeConsumer extends CodeConsumer {
    final StringBuilder buffer = new StringBuilder();
    int cutLineCount = 0;
    int endLineCount = 0;
    int startNewLineCount = 0;
    int preferredLineBreakCount = 0;

    @Override
    char getLastChar() {
      return buffer.length() == 0 ? '\0' : buffer.charAt(buffer.length() - 1);
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

    String getOutput() {
      return buffer.toString();
    }
  }

  @Before
  public void setUp() {
    consumer = new TestCodeConsumer();
  }

  @Test
  public void testDefaultMethodsAndFlags() {
    assertTrue(consumer.continueProcessing());
    assertFalse(consumer.shouldPreserveExtraBlocks());

    assertTrue(consumer.breakAfterBlockFor(null, true));
    assertFalse(consumer.breakAfterBlockFor(null, false));

    consumer.startSourceMapping(null);
    consumer.endSourceMapping(null);
    consumer.endCaseBody();
    consumer.endFile();
    consumer.startNewLine();
    consumer.maybeLineBreak();
    consumer.notePreferredLineBreak();

    assertEquals(1, consumer.startNewLineCount);
    assertEquals(1, consumer.cutLineCount);
    assertEquals(1, consumer.preferredLineBreakCount);
  }

  @Test
  public void testIsWordChar() {
    assertTrue(CodeConsumer.isWordChar('_'));
    assertTrue(CodeConsumer.isWordChar('$'));
    assertTrue(CodeConsumer.isWordChar('a'));
    assertTrue(CodeConsumer.isWordChar('Z'));
    assertTrue(CodeConsumer.isWordChar('0'));
    assertTrue(CodeConsumer.isWordChar('9'));

    assertFalse(CodeConsumer.isWordChar('+'));
    assertFalse(CodeConsumer.isWordChar('-'));
    assertFalse(CodeConsumer.isWordChar(' '));
    assertFalse(CodeConsumer.isWordChar('\0'));
    assertFalse(CodeConsumer.isWordChar(';'));
    assertFalse(CodeConsumer.isWordChar('{'));
  }

  @Test
  public void testIsNegativeZero() {
    assertTrue(CodeConsumer.isNegativeZero(-0.0));
    assertFalse(CodeConsumer.isNegativeZero(0.0));
    assertFalse(CodeConsumer.isNegativeZero(1.0));
    assertFalse(CodeConsumer.isNegativeZero(-1.0));
    assertFalse(CodeConsumer.isNegativeZero(-0.00001));
  }

  @Test
  public void testAdd_emptyString() {
    consumer.add("");
    assertEquals("", consumer.getOutput());
    assertTrue(consumer.statementStarted);
  }

  @Test
  public void testAdd_wordSeparation() {
    consumer.add("return");
    consumer.add("foo");
    assertEquals("return foo", consumer.getOutput());

    consumer = new TestCodeConsumer();
    consumer.add("foo");
    consumer.add("\\u0020");
    assertEquals("foo \\u0020", consumer.getOutput());

    consumer = new TestCodeConsumer();
    consumer.add("foo");
    consumer.add(";");
    assertEquals("foo;", consumer.getOutput());
  }

  @Test
  public void testAddIdentifier() {
    consumer.addIdentifier("myVar");
    assertEquals("myVar", consumer.getOutput());
  }

  @Test
  public void testBlockMethods() {
    consumer.appendBlockStart();
    assertEquals("{", consumer.getOutput());

    consumer.appendBlockEnd();
    assertEquals("{}", consumer.getOutput());

    consumer = new TestCodeConsumer();
    consumer.beginBlock();
    assertEquals("{", consumer.getOutput());
    assertEquals(1, consumer.endLineCount);
    assertFalse(consumer.statementNeedsEnded);

    consumer = new TestCodeConsumer();
    consumer.statementNeedsEnded = true;
    consumer.beginBlock();
    assertEquals(";{", consumer.getOutput());
    assertEquals(1, consumer.cutLineCount);
    assertEquals(1, consumer.endLineCount);
    assertFalse(consumer.statementNeedsEnded);

    consumer = new TestCodeConsumer();
    consumer.endBlock();
    assertEquals("}", consumer.getOutput());
    assertEquals(0, consumer.endLineCount);

    consumer = new TestCodeConsumer();
    consumer.statementNeedsEnded = true;
    consumer.endBlock(true);
    assertEquals("}", consumer.getOutput());
    assertEquals(1, consumer.endLineCount);
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testListSeparator() {
    consumer.listSeparator();
    assertEquals(",", consumer.getOutput());
    assertEquals(1, consumer.cutLineCount);
  }

  @Test
  public void testStatementEnding() {
    consumer.endStatement();
    assertFalse(consumer.statementNeedsEnded);

    consumer.statementStarted = true;
    consumer.endStatement();
    assertTrue(consumer.statementNeedsEnded);

    consumer.endStatement(true);
    assertEquals(";", consumer.getOutput());
    assertEquals(1, consumer.cutLineCount);
    assertFalse(consumer.statementNeedsEnded);

    consumer = new TestCodeConsumer();
    consumer.statementNeedsEnded = true;
    consumer.maybeEndStatement();
    assertEquals(";", consumer.getOutput());
    assertEquals(1, consumer.cutLineCount);
    assertEquals(1, consumer.endLineCount);
    assertFalse(consumer.statementNeedsEnded);
    assertTrue(consumer.statementStarted);
  }

  @Test
  public void testEndFunction() {
    consumer.endFunction();
    assertTrue(consumer.sawFunction);
    assertEquals(0, consumer.endLineCount);

    consumer.endFunction(false);
    assertTrue(consumer.sawFunction);
    assertEquals(0, consumer.endLineCount);

    consumer.endFunction(true);
    assertTrue(consumer.sawFunction);
    assertEquals(1, consumer.endLineCount);
  }

  @Test
  public void testBeginCaseBody() {
    consumer.beginCaseBody();
    assertEquals(":", consumer.getOutput());
  }

  @Test
  public void testAddOp_consecutivePlusMinus() {
    consumer.add("x");
    consumer.addOp("+", false);
    consumer.addOp("++", false);
    assertEquals("x+ ++", consumer.getOutput());

    consumer = new TestCodeConsumer();
    consumer.add("x");
    consumer.addOp("-", false);
    consumer.addOp("--", false);
    assertEquals("x- --", consumer.getOutput());
  }

  @Test
  public void testAddOp_wordCharAndLetter() {
    consumer.add("a");
    consumer.addOp("instanceof", true);
    assertEquals("a instanceof", consumer.getOutput());
    assertEquals(1, consumer.cutLineCount);
  }

  @Test
  public void testAddOp_arrowAfterMinus() {
    consumer.addOp("-", false);
    consumer.addOp(">", false);
    assertEquals("- >", consumer.getOutput());
  }

  @Test
  public void testAddOp_noSpecialSpacing() {
    consumer.add("a");
    consumer.addOp("*", false);
    consumer.add("b");
    assertEquals("a*b", consumer.getOutput());
    assertEquals(0, consumer.cutLineCount);
  }

  @Test
  public void testAddNumber_integersAndExponents() {
    consumer.addNumber(0.0);
    assertEquals("0", consumer.getOutput());

    consumer = new TestCodeConsumer();
    consumer.addNumber(100.0);
    assertEquals("100", consumer.getOutput());

    consumer = new TestCodeConsumer();
    consumer.addNumber(1000.0);
    assertEquals("1E3", consumer.getOutput());

    consumer = new TestCodeConsumer();
    consumer.addNumber(50000.0);
    assertEquals("5E4", consumer.getOutput());

    consumer = new TestCodeConsumer();
    consumer.addNumber(-1000.0);
    assertEquals("-1E3", consumer.getOutput());

    consumer = new TestCodeConsumer();
    consumer.addNumber(1000000.0);
    assertEquals("1E6", consumer.getOutput());

    consumer = new TestCodeConsumer();
    consumer.addNumber(120000.0);
    assertEquals("12E4", consumer.getOutput());
  }

  @Test
  public void testAddNumber_doublesAndNegativeZero() {
    consumer.addNumber(-0.0);
    assertEquals("-0.0", consumer.getOutput());

    consumer = new TestCodeConsumer();
    consumer.addNumber(0.5);
    assertEquals("0.5", consumer.getOutput());

    consumer = new TestCodeConsumer();
    consumer.addNumber(-3.14);
    assertEquals("-3.14", consumer.getOutput());
  }

  @Test
  public void testAddNumber_negativeAfterMinus() {
    consumer.addOp("-", false);
    consumer.addNumber(-4.0);
    assertEquals("- -4", consumer.getOutput());

    consumer = new TestCodeConsumer();
    consumer.addOp("+", false);
    consumer.addNumber(-4.0);
    assertEquals("+-4", consumer.getOutput());
  }
}
