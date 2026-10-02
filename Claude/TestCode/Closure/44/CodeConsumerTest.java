package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CodeConsumerTest {

  /** Concrete implementation of CodeConsumer for testing purposes. */
  private static class TestCodeConsumer extends CodeConsumer {
    StringBuilder sb = new StringBuilder();

    @Override
    char getLastChar() {
      return sb.length() == 0 ? '\0' : sb.charAt(sb.length() - 1);
    }

    @Override
    void append(String str) {
      sb.append(str);
    }
  }

  private TestCodeConsumer consumer;

  @Before
  public void setUp() {
    consumer = new TestCodeConsumer();
  }

  // ---------- startSourceMapping / endSourceMapping ----------

  @Test
  public void testStartSourceMapping_nullNode_noException() {
    consumer.startSourceMapping(null);
    // no-op, should not throw
    assertTrue(true);
  }

  @Test
  public void testEndSourceMapping_nullNode_noException() {
    consumer.endSourceMapping(null);
    // no-op, should not throw
    assertTrue(true);
  }

  // ---------- continueProcessing ----------

  @Test
  public void testContinueProcessing_default_returnsTrue() {
    assertTrue(consumer.continueProcessing());
  }

  // ---------- getLastChar / append ----------

  @Test
  public void testAppend_normalString_appendsCorrectly() {
    consumer.append("hello");
    assertEquals('o', consumer.getLastChar());
  }

  @Test
  public void testGetLastChar_emptyBuffer_returnsNullChar() {
    assertEquals('\0', consumer.getLastChar());
  }

  // ---------- addIdentifier ----------

  @Test
  public void testAddIdentifier_normalIdentifier_appendsIdentifier() {
    consumer.addIdentifier("foo");
    assertEquals("foo", consumer.sb.toString());
  }

  // ---------- appendBlockStart / appendBlockEnd ----------

  @Test
  public void testAppendBlockStart_appendsOpenBrace() {
    consumer.appendBlockStart();
    assertEquals("{", consumer.sb.toString());
  }

  @Test
  public void testAppendBlockEnd_appendsCloseBrace() {
    consumer.appendBlockEnd();
    assertEquals("}", consumer.sb.toString());
  }

  // ---------- startNewLine / maybeLineBreak / maybeCutLine / endLine / notePreferredLineBreak ----------

  @Test
  public void testStartNewLine_noException() {
    consumer.startNewLine();
    assertTrue(true);
  }

  @Test
  public void testMaybeLineBreak_noException() {
    consumer.maybeLineBreak();
    assertTrue(true);
  }

  @Test
  public void testMaybeCutLine_noException() {
    consumer.maybeCutLine();
    assertTrue(true);
  }

  @Test
  public void testEndLine_noException() {
    consumer.endLine();
    assertTrue(true);
  }

  @Test
  public void testNotePreferredLineBreak_noException() {
    consumer.notePreferredLineBreak();
    assertTrue(true);
  }

  // ---------- beginBlock ----------

  @Test
  public void testBeginBlock_statementNeedsEndedTrue_addsSemicolonAndBlockStart() {
    consumer.statementNeedsEnded = true;
    consumer.beginBlock();
    assertEquals(";{", consumer.sb.toString());
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testBeginBlock_statementNeedsEndedFalse_onlyBlockStart() {
    consumer.statementNeedsEnded = false;
    consumer.beginBlock();
    assertEquals("{", consumer.sb.toString());
    assertFalse(consumer.statementNeedsEnded);
  }

  // ---------- endBlock ----------

  @Test
  public void testEndBlock_default_appendsCloseBraceNoEndLine() {
    consumer.endBlock();
    assertEquals("}", consumer.sb.toString());
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndBlock_shouldEndLineTrue_appendsCloseBrace() {
    consumer.endBlock(true);
    assertEquals("}", consumer.sb.toString());
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndBlock_shouldEndLineFalse_appendsCloseBrace() {
    consumer.endBlock(false);
    assertEquals("}", consumer.sb.toString());
    assertFalse(consumer.statementNeedsEnded);
  }

  // ---------- listSeparator ----------

  @Test
  public void testListSeparator_appendsComma() {
    consumer.listSeparator();
    assertEquals(",", consumer.sb.toString());
  }

  // ---------- endStatement ----------

  @Test
  public void testEndStatement_default_noSemicolonWhenStatementNotStarted() {
    consumer.statementStarted = false;
    consumer.endStatement();
    assertFalse(consumer.statementNeedsEnded);
    assertEquals("", consumer.sb.toString());
  }

  @Test
  public void testEndStatement_needSemiColonTrue_appendsSemicolon() {
    consumer.endStatement(true);
    assertEquals(";", consumer.sb.toString());
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndStatement_needSemiColonFalseStatementStartedTrue_setsNeedsEndedTrue() {
    consumer.statementStarted = true;
    consumer.endStatement(false);
    assertTrue(consumer.statementNeedsEnded);
    assertEquals("", consumer.sb.toString());
  }

  // ---------- maybeEndStatement ----------

  @Test
  public void testMaybeEndStatement_statementNeedsEndedTrue_appendsSemicolon() {
    consumer.statementNeedsEnded = true;
    consumer.maybeEndStatement();
    assertEquals(";", consumer.sb.toString());
    assertFalse(consumer.statementNeedsEnded);
    assertTrue(consumer.statementStarted);
  }

  @Test
  public void testMaybeEndStatement_statementNeedsEndedFalse_setsStatementStarted() {
    consumer.statementNeedsEnded = false;
    consumer.maybeEndStatement();
    assertEquals("", consumer.sb.toString());
    assertTrue(consumer.statementStarted);
  }

  // ---------- endFunction ----------

  @Test
  public void testEndFunction_default_setsSawFunctionTrue() {
    consumer.endFunction();
    assertTrue(consumer.sawFunction);
  }

  @Test
  public void testEndFunction_statementContextTrue_setsSawFunctionTrue() {
    consumer.endFunction(true);
    assertTrue(consumer.sawFunction);
  }

  @Test
  public void testEndFunction_statementContextFalse_setsSawFunctionTrue() {
    consumer.endFunction(false);
    assertTrue(consumer.sawFunction);
  }

  // ---------- beginCaseBody / endCaseBody ----------

  @Test
  public void testBeginCaseBody_appendsColon() {
    consumer.beginCaseBody();
    assertEquals(":", consumer.sb.toString());
  }

  @Test
  public void testEndCaseBody_noException() {
    consumer.endCaseBody();
    assertTrue(true);
  }

  // ---------- add ----------

  @Test
  public void testAdd_emptyString_appendsNothing() {
    consumer.add("");
    assertEquals("", consumer.sb.toString());
  }

  @Test
  public void testAdd_normalString_appendsString() {
    consumer.add("foo");
    assertEquals("foo", consumer.sb.toString());
  }

  @Test
  public void testAdd_wordCharAfterWordChar_addsSpaceSeparator() {
    consumer.add("foo");
    consumer.add("bar");
    assertEquals("foo bar", consumer.sb.toString());
  }

  @Test
  public void testAdd_nonWordCharAfterWordChar_noSpaceSeparator() {
    consumer.add("foo");
    consumer.add(";");
    assertEquals("foo;", consumer.sb.toString());
  }

  @Test
  public void testAdd_backslashAfterWordChar_addsSpaceSeparator() {
    consumer.add("foo");
    consumer.add("\\bar");
    assertEquals("foo \\bar", consumer.sb.toString());
  }

  // ---------- appendOp ----------

  @Test
  public void testAppendOp_normalOp_appendsOp() {
    consumer.appendOp("+", true);
    assertEquals("+", consumer.sb.toString());
  }

  // ---------- addOp ----------

  @Test
  public void testAddOp_plusAfterPlus_addsSpace() {
    consumer.append("+");
    consumer.addOp("+", true);
    assertEquals("+ +", consumer.sb.toString());
  }

  @Test
  public void testAddOp_minusAfterMinus_addsSpace() {
    consumer.append("-");
    consumer.addOp("-", false);
    assertEquals("- -", consumer.sb.toString());
  }

  @Test
  public void testAddOp_letterOpAfterWordChar_addsSpace() {
    consumer.add("foo");
    consumer.addOp("instanceof", true);
    assertEquals("fooinstanceof".length() > 0, true);
    // Expect a space inserted before "instanceof" because prev char is word char.
    assertEquals("foo instanceof", consumer.sb.toString());
  }

  @Test
  public void testAddOp_arrowAfterMinus_addsSpace() {
    consumer.append("-");
    consumer.addOp("->", false);
    assertEquals("- ->", consumer.sb.toString());
  }

  @Test
  public void testAddOp_noSpecialCase_noExtraSpace() {
    consumer.add("foo");
    consumer.addOp(";", false);
    assertEquals("foo;", consumer.sb.toString());
  }

  @Test
  public void testAddOp_binOpTrue_callsMaybeCutLine_noException() {
    consumer.addOp("*", true);
    assertTrue(true);
  }

  // ---------- addNumber ----------

  @Test
  public void testAddNumber_smallPositiveInteger_addsPlainNumber() {
    consumer.addNumber(5);
    assertEquals("5", consumer.sb.toString());
  }

  @Test
  public void testAddNumber_negativeAfterMinus_addsSpaceBeforeNumber() {
    consumer.append("-");
    consumer.addNumber(-5);
    assertEquals("- -5", consumer.sb.toString());
  }

  @Test
  public void testAddNumber_largeExponentiableNumber_usesExponentNotation() {
    consumer.addNumber(1000);
    assertEquals("1E3", consumer.sb.toString());
  }

  @Test
  public void testAddNumber_nonExponentiableLargeNumber_usesPlainNumber() {
    consumer.addNumber(123);
    assertEquals("123", consumer.sb.toString());
  }

  @Test
  public void testAddNumber_negativeZero_usesStringValue() {
    consumer.addNumber(-0.0);
    assertEquals(String.valueOf(-0.0), consumer.sb.toString());
  }

  @Test
  public void testAddNumber_nonIntegerDouble_usesStringValue() {
    consumer.addNumber(3.14);
    assertEquals(String.valueOf(3.14), consumer.sb.toString());
  }

  @Test
  public void testAddNumber_zero_addsZero() {
    consumer.addNumber(0);
    assertEquals("0", consumer.sb.toString());
  }

  // ---------- isNegativeZero ----------

  @Test
  public void testIsNegativeZero_positiveZero_returnsFalse() {
    assertFalse(CodeConsumer.isNegativeZero(0.0));
  }

  @Test
  public void testIsNegativeZero_negativeZero_returnsTrue() {
    assertTrue(CodeConsumer.isNegativeZero(-0.0));
  }

  @Test
  public void testIsNegativeZero_nonZeroValue_returnsFalse() {
    assertFalse(CodeConsumer.isNegativeZero(5.0));
  }

  // ---------- isWordChar ----------

  @Test
  public void testIsWordChar_letter_returnsTrue() {
    assertTrue(CodeConsumer.isWordChar('a'));
  }

  @Test
  public void testIsWordChar_digit_returnsTrue() {
    assertTrue(CodeConsumer.isWordChar('5'));
  }

  @Test
  public void testIsWordChar_underscore_returnsTrue() {
    assertTrue(CodeConsumer.isWordChar('_'));
  }

  @Test
  public void testIsWordChar_dollarSign_returnsTrue() {
    assertTrue(CodeConsumer.isWordChar('$'));
  }

  @Test
  public void testIsWordChar_nonWordChar_returnsFalse() {
    assertFalse(CodeConsumer.isWordChar(' '));
  }

  @Test
  public void testIsWordChar_nullChar_returnsFalse() {
    assertFalse(CodeConsumer.isWordChar('\0'));
  }

  // ---------- shouldPreserveExtraBlocks ----------

  @Test
  public void testShouldPreserveExtraBlocks_default_returnsFalse() {
    assertFalse(consumer.shouldPreserveExtraBlocks());
  }

  // ---------- breakAfterBlockFor ----------

  @Test
  public void testBreakAfterBlockFor_statementContextTrue_returnsTrue() {
    assertTrue(consumer.breakAfterBlockFor(null, true));
  }

  @Test
  public void testBreakAfterBlockFor_statementContextFalse_returnsFalse() {
    assertFalse(consumer.breakAfterBlockFor(null, false));
  }

  // ---------- endFile ----------

  @Test
  public void testEndFile_noException() {
    consumer.endFile();
    assertTrue(true);
  }
}
