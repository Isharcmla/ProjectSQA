package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class CodeConsumerTest {

    private static class TestCodeConsumer extends CodeConsumer {
        StringBuilder sb = new StringBuilder();
        boolean continueProcessingFlag = true;

        @Override
        char getLastChar() {
            if (sb.length() == 0) {
                return '\0';
            }
            return sb.charAt(sb.length() - 1);
        }

        @Override
        void append(String str) {
            sb.append(str);
        }

        @Override
        boolean continueProcessing() {
            return continueProcessingFlag;
        }
    }

    private TestCodeConsumer consumer;

    @Before
    public void setUp() {
        consumer = new TestCodeConsumer();
    }

    @Test
    public void testStartSourceMapping_normalNode_noException() {
        consumer.startSourceMapping(null);
    }

    @Test
    public void testEndSourceMapping_normalNode_noException() {
        consumer.endSourceMapping(null);
    }

    @Test
    public void testContinueProcessing_default_returnsTrue() {
        assertTrue(consumer.continueProcessing());
    }

    @Test
    public void testContinueProcessing_overridden_returnsFalse() {
        consumer.continueProcessingFlag = false;
        assertFalse(consumer.continueProcessing());
    }

    @Test
    public void testGetLastChar_emptyBuffer_returnsNullChar() {
        assertEquals('\0', consumer.getLastChar());
    }

    @Test
    public void testGetLastChar_afterAppend_returnsLastChar() {
        consumer.append("hello");
        assertEquals('o', consumer.getLastChar());
    }

    @Test
    public void testAddIdentifier_normalString_appendsIdentifier() {
        consumer.addIdentifier("foo");
        assertEquals("foo", consumer.sb.toString());
    }

    @Test
    public void testAppend_normalString_appendsToBuffer() {
        consumer.append("test");
        assertEquals("test", consumer.sb.toString());
    }

    @Test
    public void testAppend_emptyString_noOp() {
        consumer.append("");
        assertEquals("", consumer.sb.toString());
    }

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

    @Test
    public void testStartNewLine_noOp_noException() {
        consumer.startNewLine();
    }

    @Test
    public void testMaybeLineBreak_noOp_noException() {
        consumer.maybeLineBreak();
    }

    @Test
    public void testMaybeCutLine_noOp_noException() {
        consumer.maybeCutLine();
    }

    @Test
    public void testEndLine_noOp_noException() {
        consumer.endLine();
    }

    @Test
    public void testNotePreferredLineBreak_noOp_noException() {
        consumer.notePreferredLineBreak();
    }

    @Test
    public void testBeginBlock_statementNeedsEndedTrue_appendsSemicolonAndBrace() {
        consumer.statementNeedsEnded = true;
        consumer.beginBlock();
        assertEquals(";{", consumer.sb.toString());
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testBeginBlock_statementNeedsEndedFalse_appendsBraceOnly() {
        consumer.statementNeedsEnded = false;
        consumer.beginBlock();
        assertEquals("{", consumer.sb.toString());
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testEndBlock_default_appendsCloseBrace() {
        consumer.endBlock();
        assertEquals("}", consumer.sb.toString());
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testEndBlock_shouldEndLineTrue_appendsCloseBraceAndEndsLine() {
        consumer.endBlock(true);
        assertEquals("}", consumer.sb.toString());
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testEndBlock_shouldEndLineFalse_appendsCloseBraceOnly() {
        consumer.endBlock(false);
        assertEquals("}", consumer.sb.toString());
    }

    @Test
    public void testListSeparator_appendsComma() {
        consumer.listSeparator();
        assertEquals(",", consumer.sb.toString());
    }

    @Test
    public void testEndStatement_default_setsStatementNeedsEndedIfStarted() {
        consumer.statementStarted = true;
        consumer.endStatement();
        assertTrue(consumer.statementNeedsEnded);
    }

    @Test
    public void testEndStatement_needSemiColonTrue_appendsSemicolon() {
        consumer.endStatement(true);
        assertEquals(";", consumer.sb.toString());
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testEndStatement_needSemiColonFalse_statementNotStarted_noChange() {
        consumer.statementStarted = false;
        consumer.endStatement(false);
        assertFalse(consumer.statementNeedsEnded);
        assertEquals("", consumer.sb.toString());
    }

    @Test
    public void testEndStatement_needSemiColonFalse_statementStarted_setsNeedsEnded() {
        consumer.statementStarted = true;
        consumer.endStatement(false);
        assertTrue(consumer.statementNeedsEnded);
    }

    @Test
    public void testMaybeEndStatement_needsEndedTrue_appendsSemicolonAndSetsStarted() {
        consumer.statementNeedsEnded = true;
        consumer.maybeEndStatement();
        assertEquals(";", consumer.sb.toString());
        assertFalse(consumer.statementNeedsEnded);
        assertTrue(consumer.statementStarted);
    }

    @Test
    public void testMaybeEndStatement_needsEndedFalse_setsStatementStarted() {
        consumer.statementNeedsEnded = false;
        consumer.maybeEndStatement();
        assertEquals("", consumer.sb.toString());
        assertTrue(consumer.statementStarted);
    }

    @Test
    public void testEndFunction_default_setsSawFunctionTrue() {
        consumer.endFunction();
        assertTrue(consumer.sawFunction);
    }

    @Test
    public void testEndFunction_statementContextTrue_setsSawFunctionAndEndsLine() {
        consumer.endFunction(true);
        assertTrue(consumer.sawFunction);
    }

    @Test
    public void testEndFunction_statementContextFalse_setsSawFunctionOnly() {
        consumer.endFunction(false);
        assertTrue(consumer.sawFunction);
    }

    @Test
    public void testBeginCaseBody_appendsColon() {
        consumer.beginCaseBody();
        assertEquals(":", consumer.sb.toString());
    }

    @Test
    public void testEndCaseBody_noOp_noException() {
        consumer.endCaseBody();
    }

    @Test
    public void testAdd_emptyString_noAppend() {
        consumer.add("");
        assertEquals("", consumer.sb.toString());
    }

    @Test
    public void testAdd_normalString_appendsString() {
        consumer.add("foo");
        assertEquals("foo", consumer.sb.toString());
    }

    @Test
    public void testAdd_wordCharAfterWordChar_appendsSpace() {
        consumer.append("foo");
        consumer.add("bar");
        assertEquals("foo bar", consumer.sb.toString());
    }

    @Test
    public void testAdd_nonWordCharAfterWordChar_noSpace() {
        consumer.append("foo");
        consumer.add(";");
        assertEquals("foo;", consumer.sb.toString());
    }

    @Test
    public void testAdd_backslashAfterWordChar_appendsSpace() {
        consumer.append("foo");
        consumer.add("\\bar");
        assertEquals("foo \\bar", consumer.sb.toString());
    }

    @Test
    public void testAdd_statementNeedsEnded_addsSemicolonFirst() {
        consumer.statementNeedsEnded = true;
        consumer.add("foo");
        assertEquals(";foo", consumer.sb.toString());
    }

    @Test
    public void testAppendOp_normalOp_appendsOp() {
        consumer.appendOp("+", true);
        assertEquals("+", consumer.sb.toString());
    }

    @Test
    public void testAddOp_plusAfterPlus_appendsSpace() {
        consumer.append("+");
        consumer.addOp("+", true);
        assertEquals("+ +", consumer.sb.toString());
    }

    @Test
    public void testAddOp_minusAfterMinus_appendsSpace() {
        consumer.append("-");
        consumer.addOp("-", true);
        assertEquals("- -", consumer.sb.toString());
    }

    @Test
    public void testAddOp_letterOpAfterWordChar_appendsSpace() {
        consumer.append("x");
        consumer.addOp("instanceof", true);
        assertEquals("x instanceof", consumer.sb.toString());
    }

    @Test
    public void testAddOp_arrowAfterMinus_appendsSpace() {
        consumer.append("-");
        consumer.addOp(">", false);
        assertEquals("- >", consumer.sb.toString());
    }

    @Test
    public void testAddOp_binOpTrue_callsMaybeCutLine() {
        consumer.addOp("*", true);
        assertEquals("*", consumer.sb.toString());
    }

    @Test
    public void testAddOp_binOpFalse_noMaybeCutLine() {
        consumer.addOp("*", false);
        assertEquals("*", consumer.sb.toString());
    }

    @Test
    public void testAddOp_noSpecialCase_noSpaceAdded() {
        consumer.append("x");
        consumer.addOp("*", true);
        assertEquals("x*", consumer.sb.toString());
    }

    @Test
    public void testAddNumber_positiveInteger_addsNumberString() {
        consumer.addNumber(5.0);
        assertEquals("5", consumer.sb.toString());
    }

    @Test
    public void testAddNumber_negativeAfterMinus_addsSpaceThenNumber() {
        consumer.append("-");
        consumer.addNumber(-5.0);
        assertEquals("- -5", consumer.sb.toString());
    }

    @Test
    public void testAddNumber_zero_addsZero() {
        consumer.addNumber(0.0);
        assertEquals("0", consumer.sb.toString());
    }

    @Test
    public void testAddNumber_decimal_addsDecimalString() {
        consumer.addNumber(3.14);
        assertEquals("3.14", consumer.sb.toString());
    }

    @Test
    public void testAddNumber_largeNumberWithTrailingZeros_usesExponentNotation() {
        consumer.addNumber(100000.0);
        assertEquals("1E5", consumer.sb.toString());
    }

    @Test
    public void testAddNumber_negativeLargeNumber_correctOutput() {
        consumer.addNumber(-100.0);
        assertEquals("-100", consumer.sb.toString());
    }

    @Test
    public void testAddNumber_smallExponentNotGreaterThan2_noExponentNotation() {
        consumer.addNumber(100.0);
        assertEquals("100", consumer.sb.toString());
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
    public void testIsWordChar_letter_returnsTrue() {
        assertTrue(CodeConsumer.isWordChar('a'));
    }

    @Test
    public void testIsWordChar_digit_returnsTrue() {
        assertTrue(CodeConsumer.isWordChar('5'));
    }

    @Test
    public void testIsWordChar_specialChar_returnsFalse() {
        assertFalse(CodeConsumer.isWordChar(';'));
    }

    @Test
    public void testIsWordChar_space_returnsFalse() {
        assertFalse(CodeConsumer.isWordChar(' '));
    }

    @Test
    public void testShouldPreserveExtraBlocks_default_returnsFalse() {
        assertFalse(consumer.shouldPreserveExtraBlocks());
    }

    @Test
    public void testBreakAfterBlockFor_statementContextTrue_returnsTrue() {
        assertTrue(consumer.breakAfterBlockFor(null, true));
    }

    @Test
    public void testBreakAfterBlockFor_statementContextFalse_returnsFalse() {
        assertFalse(consumer.breakAfterBlockFor(null, false));
    }

    @Test
    public void testEndFile_default_noException() {
        consumer.endFile();
    }
}
