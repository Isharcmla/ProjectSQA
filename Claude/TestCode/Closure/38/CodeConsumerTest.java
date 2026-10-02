import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeConsumerTest {

    /**
     * Concrete testable subclass of the abstract CodeConsumer class.
     * Tracks appended content via an internal StringBuilder.
     */
    static class TestConsumer extends CodeConsumer {
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

    private TestConsumer consumer;

    @Before
    public void setUp() {
        consumer = new TestConsumer();
    }

    // ---------- startSourceMapping / endSourceMapping ----------

    @Test
    public void testStartSourceMapping_normalInput_noException() {
        Node n = new Node(Node.NULL);
        consumer.startSourceMapping(n);
        // no-op, should not throw
        assertTrue(true);
    }

    @Test
    public void testEndSourceMapping_normalInput_noException() {
        Node n = new Node(Node.NULL);
        consumer.endSourceMapping(n);
        assertTrue(true);
    }

    // ---------- continueProcessing ----------

    @Test
    public void testContinueProcessing_default_returnsTrue() {
        assertTrue(consumer.continueProcessing());
    }

    // ---------- getLastChar ----------

    @Test
    public void testGetLastChar_emptyBuffer_returnsNullChar() {
        assertEquals('\0', consumer.getLastChar());
    }

    @Test
    public void testGetLastChar_afterAppend_returnsLastAppendedChar() {
        consumer.append("hello");
        assertEquals('o', consumer.getLastChar());
    }

    // ---------- addIdentifier ----------

    @Test
    public void testAddIdentifier_normalInput_appendsIdentifier() {
        consumer.addIdentifier("myVar");
        assertTrue(consumer.sb.toString().contains("myVar"));
    }

    // ---------- append (abstract, tested via subclass) ----------

    @Test
    public void testAppend_normalInput_appendsToBuffer() {
        consumer.append("test");
        assertEquals("test", consumer.sb.toString());
    }

    // ---------- appendBlockStart / appendBlockEnd ----------

    @Test
    public void testAppendBlockStart_normalCall_appendsOpenBrace() {
        consumer.appendBlockStart();
        assertEquals("{", consumer.sb.toString());
    }

    @Test
    public void testAppendBlockEnd_normalCall_appendsCloseBrace() {
        consumer.appendBlockEnd();
        assertEquals("}", consumer.sb.toString());
    }

    // ---------- startNewLine / maybeLineBreak / maybeCutLine / endLine / notePreferredLineBreak ----------

    @Test
    public void testStartNewLine_noOp_noException() {
        consumer.startNewLine();
        assertTrue(true);
    }

    @Test
    public void testMaybeLineBreak_noOp_callsMaybeCutLine() {
        consumer.maybeLineBreak();
        assertTrue(true);
    }

    @Test
    public void testMaybeCutLine_noOp_noException() {
        consumer.maybeCutLine();
        assertTrue(true);
    }

    @Test
    public void testEndLine_noOp_noException() {
        consumer.endLine();
        assertTrue(true);
    }

    @Test
    public void testNotePreferredLineBreak_noOp_noException() {
        consumer.notePreferredLineBreak();
        assertTrue(true);
    }

    // ---------- beginBlock ----------

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

    // ---------- endBlock ----------

    @Test
    public void testEndBlock_noArg_appendsCloseBrace() {
        consumer.statementNeedsEnded = true;
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
        assertFalse(consumer.statementNeedsEnded);
    }

    // ---------- listSeparator ----------

    @Test
    public void testListSeparator_normalCall_appendsComma() {
        consumer.listSeparator();
        assertTrue(consumer.sb.toString().contains(","));
    }

    // ---------- endStatement ----------

    @Test
    public void testEndStatement_noArg_defaultsToFalse() {
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
    public void testEndStatement_needSemiColonFalseStatementStartedTrue_setsNeedsEndedTrue() {
        consumer.statementStarted = true;
        consumer.endStatement(false);
        assertTrue(consumer.statementNeedsEnded);
    }

    @Test
    public void testEndStatement_needSemiColonFalseStatementStartedFalse_noChange() {
        consumer.statementStarted = false;
        consumer.statementNeedsEnded = false;
        consumer.endStatement(false);
        assertFalse(consumer.statementNeedsEnded);
    }

    // ---------- maybeEndStatement ----------

    @Test
    public void testMaybeEndStatement_needsEndedTrue_appendsSemicolonAndSetsStarted() {
        consumer.statementNeedsEnded = true;
        consumer.maybeEndStatement();
        assertEquals(";", consumer.sb.toString());
        assertFalse(consumer.statementNeedsEnded);
        assertTrue(consumer.statementStarted);
    }

    @Test
    public void testMaybeEndStatement_needsEndedFalse_setsStartedOnly() {
        consumer.statementNeedsEnded = false;
        consumer.maybeEndStatement();
        assertEquals("", consumer.sb.toString());
        assertTrue(consumer.statementStarted);
    }

    // ---------- endFunction ----------

    @Test
    public void testEndFunction_noArg_setsSawFunctionTrue() {
        consumer.endFunction();
        assertTrue(consumer.sawFunction);
    }

    @Test
    public void testEndFunction_statementContextTrue_callsEndLine() {
        consumer.endFunction(true);
        assertTrue(consumer.sawFunction);
    }

    @Test
    public void testEndFunction_statementContextFalse_noEndLineCall() {
        consumer.endFunction(false);
        assertTrue(consumer.sawFunction);
    }

    // ---------- beginCaseBody / endCaseBody ----------

    @Test
    public void testBeginCaseBody_normalCall_appendsColon() {
        consumer.beginCaseBody();
        assertEquals(":", consumer.sb.toString());
    }

    @Test
    public void testEndCaseBody_noOp_noException() {
        consumer.endCaseBody();
        assertTrue(true);
    }

    // ---------- add ----------

    @Test
    public void testAdd_emptyString_noAppend() {
        consumer.add("");
        assertEquals("", consumer.sb.toString());
    }

    @Test
    public void testAdd_wordCharAfterWordChar_addsSpaceSeparator() {
        consumer.sb.append("a"); // last char is word char
        consumer.add("foo");
        assertEquals("a foo", consumer.sb.toString());
    }

    @Test
    public void testAdd_backslashAfterWordChar_addsSpaceSeparator() {
        consumer.sb.append("a");
        consumer.add("\\foo");
        assertEquals("a \\foo", consumer.sb.toString());
    }

    @Test
    public void testAdd_slashAfterSlash_addsSpaceSeparator() {
        consumer.sb.append("/");
        consumer.add("/regex");
        assertEquals("/ /regex", consumer.sb.toString());
    }

    @Test
    public void testAdd_normalCase_noSpaceAdded() {
        consumer.sb.append(" ");
        consumer.add("abc");
        assertEquals(" abc", consumer.sb.toString());
    }

    // ---------- appendOp ----------

    @Test
    public void testAppendOp_normalInput_appendsOperator() {
        consumer.appendOp("+", true);
        assertEquals("+", consumer.sb.toString());
    }

    // ---------- addOp ----------

    @Test
    public void testAddOp_samePlusSigns_addsSpace() {
        consumer.sb.append("+");
        consumer.addOp("+", true);
        assertEquals("+ +", consumer.sb.toString());
    }

    @Test
    public void testAddOp_sameMinusSigns_addsSpace() {
        consumer.sb.append("-");
        consumer.addOp("-", true);
        assertEquals("- -", consumer.sb.toString());
    }

    @Test
    public void testAddOp_letterOperatorAfterWordChar_addsSpace() {
        consumer.sb.append("a");
        consumer.addOp("instanceof", false);
        assertEquals("a instanceof", consumer.sb.toString());
    }

    @Test
    public void testAddOp_arrowAfterMinus_addsSpace() {
        consumer.sb.append("-");
        consumer.addOp(">", true);
        assertEquals("- >", consumer.sb.toString());
    }

    @Test
    public void testAddOp_normalOperator_noExtraSpace() {
        consumer.sb.append(" ");
        consumer.addOp("=", false);
        assertEquals(" =", consumer.sb.toString());
    }

    @Test
    public void testAddOp_binOpFalse_noLineBreakCall() {
        consumer.addOp("=", false);
        assertTrue(consumer.sb.toString().contains("="));
    }

    // ---------- addNumber ----------

    @Test
    public void testAddNumber_smallPositiveInteger_appendsPlainNumber() {
        consumer.addNumber(5);
        assertEquals("5", consumer.sb.toString());
    }

    @Test
    public void testAddNumber_largeIntegerWithExponent_appendsExponentForm() {
        consumer.addNumber(1000);
        assertEquals("1E3", consumer.sb.toString());
    }

    @Test
    public void testAddNumber_hundredValue_appendsPlainNumberNoExponent() {
        consumer.addNumber(100);
        assertEquals("100", consumer.sb.toString());
    }

    @Test
    public void testAddNumber_negativeNumberAfterMinus_addsSpaceFirst() {
        consumer.sb.append("-");
        consumer.addNumber(-5);
        assertTrue(consumer.sb.toString().startsWith("- "));
    }

    @Test
    public void testAddNumber_decimalValue_appendsDecimalString() {
        consumer.addNumber(1.5);
        assertEquals("1.5", consumer.sb.toString());
    }

    @Test
    public void testAddNumber_negativeZero_appendsNegativeZeroString() {
        consumer.addNumber(-0.0);
        assertEquals(String.valueOf(-0.0), consumer.sb.toString());
    }

    @Test
    public void testAddNumber_zeroValue_appendsZero() {
        consumer.addNumber(0);
        assertEquals("0", consumer.sb.toString());
    }

    // ---------- isNegativeZero ----------

    @Test
    public void testIsNegativeZero_negativeZero_returnsTrue() {
        assertTrue(CodeConsumer.isNegativeZero(-0.0));
    }

    @Test
    public void testIsNegativeZero_positiveZero_returnsFalse() {
        assertFalse(CodeConsumer.isNegativeZero(0.0));
    }

    @Test
    public void testIsNegativeZero_nonZeroValue_returnsFalse() {
        assertFalse(CodeConsumer.isNegativeZero(5.0));
    }

    // ---------- isWordChar ----------

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
    public void testIsWordChar_nonWordChar_returnsFalse() {
        assertFalse(CodeConsumer.isWordChar('/'));
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
        Node n = new Node(Node.BLOCK);
        assertTrue(consumer.breakAfterBlockFor(n, true));
    }

    @Test
    public void testBreakAfterBlockFor_statementContextFalse_returnsFalse() {
        Node n = new Node(Node.BLOCK);
        assertFalse(consumer.breakAfterBlockFor(n, false));
    }

    // ---------- endFile ----------

    @Test
    public void testEndFile_noOp_noException() {
        consumer.endFile();
        assertTrue(true);
    }
}
