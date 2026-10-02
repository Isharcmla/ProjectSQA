import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class CSVFormatTest {

    private CSVFormat format;

    @Before
    public void setUp() {
        format = CSVFormat.DEFAULT;
    }

    // ---------- Predefined formats ----------

    @Test
    public void testDefaultFormat_notNull() {
        assertNotNull(CSVFormat.DEFAULT);
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
    }

    @Test
    public void testRFC4180Format_ignoreEmptyLinesFalse() {
        assertFalse(CSVFormat.RFC4180.getIgnoreEmptyLines());
    }

    @Test
    public void testExcelFormat_ignoreEmptyLinesFalse() {
        assertFalse(CSVFormat.EXCEL.getIgnoreEmptyLines());
    }

    @Test
    public void testTDFFormat_tabDelimiterAndIgnoreSurroundingSpaces() {
        assertEquals('\t', CSVFormat.TDF.getDelimiter());
        assertTrue(CSVFormat.TDF.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testMySQLFormat_settings() {
        assertEquals('\t', CSVFormat.MYSQL.getDelimiter());
        assertEquals(Character.valueOf('\\'), CSVFormat.MYSQL.getEscape());
        assertFalse(CSVFormat.MYSQL.getIgnoreEmptyLines());
        assertNull(CSVFormat.MYSQL.getQuoteChar());
        assertEquals("\n", CSVFormat.MYSQL.getRecordSeparator());
    }

    // ---------- newFormat ----------

    @Test
    public void testNewFormat_validDelimiter_createsFormat() {
        CSVFormat f = CSVFormat.newFormat(';');
        assertEquals(';', f.getDelimiter());
        assertNull(f.getQuoteChar());
        assertNull(f.getHeader());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_lineBreakDelimiter_throwsException() {
        CSVFormat.newFormat('\n');
    }

    // ---------- getters ----------

    @Test
    public void testGetDelimiter_default_returnsComma() {
        assertEquals(',', format.getDelimiter());
    }

    @Test
    public void testGetQuoteChar_default_returnsDoubleQuote() {
        assertEquals(Character.valueOf('"'), format.getQuoteChar());
    }

    @Test
    public void testGetQuotePolicy_default_returnsNull() {
        assertNull(format.getQuotePolicy());
    }

    @Test
    public void testGetCommentStart_default_returnsNull() {
        assertNull(format.getCommentStart());
    }

    @Test
    public void testGetEscape_default_returnsNull() {
        assertNull(format.getEscape());
    }

    @Test
    public void testGetIgnoreSurroundingSpaces_default_returnsFalse() {
        assertFalse(format.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testGetIgnoreEmptyLines_default_returnsTrue() {
        assertTrue(format.getIgnoreEmptyLines());
    }

    @Test
    public void testGetRecordSeparator_default_returnsCRLF() {
        assertEquals("\r\n", format.getRecordSeparator());
    }

    @Test
    public void testGetNullString_default_returnsNull() {
        assertNull(format.getNullString());
    }

    @Test
    public void testGetHeader_default_returnsNull() {
        assertNull(format.getHeader());
    }

    @Test
    public void testGetHeader_withHeaderSet_returnsClonedArray() {
        CSVFormat f = format.withHeader("a", "b");
        String[] header = f.getHeader();
        assertArrayEquals(new String[]{"a", "b"}, header);
        // verify it's a clone, not same reference
        header[0] = "changed";
        assertArrayEquals(new String[]{"a", "b"}, f.getHeader());
    }

    @Test
    public void testGetSkipHeaderRecord_default_returnsFalse() {
        assertFalse(format.getSkipHeaderRecord());
    }

    // ---------- isXxx methods ----------

    @Test
    public void testIsCommentingEnabled_noComment_returnsFalse() {
        assertFalse(format.isCommentingEnabled());
    }

    @Test
    public void testIsCommentingEnabled_withComment_returnsTrue() {
        CSVFormat f = format.withCommentStart('#');
        assertTrue(f.isCommentingEnabled());
    }

    @Test
    public void testIsEscaping_noEscape_returnsFalse() {
        assertFalse(format.isEscaping());
    }

    @Test
    public void testIsEscaping_withEscape_returnsTrue() {
        CSVFormat f = format.withEscape('\\');
        assertTrue(f.isEscaping());
    }

    @Test
    public void testIsNullHandling_noNullString_returnsFalse() {
        assertFalse(format.isNullHandling());
    }

    @Test
    public void testIsNullHandling_withNullString_returnsTrue() {
        CSVFormat f = format.withNullString("N/A");
        assertTrue(f.isNullHandling());
    }

    @Test
    public void testIsQuoting_withQuoteChar_returnsTrue() {
        assertTrue(format.isQuoting());
    }

    @Test
    public void testIsQuoting_noQuoteChar_returnsFalse() {
        CSVFormat f = format.withQuoteChar((Character) null);
        assertFalse(f.isQuoting());
    }

    // ---------- withXxx methods ----------

    @Test
    public void testWithDelimiter_validChar_returnsNewFormat() {
        CSVFormat f = format.withDelimiter(';');
        assertEquals(';', f.getDelimiter());
        assertEquals(',', format.getDelimiter()); // original unchanged
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_lineBreak_throwsException() {
        format.withDelimiter('\n');
    }

    @Test
    public void testWithCommentStart_charValid_returnsNewFormat() {
        CSVFormat f = format.withCommentStart('#');
        assertEquals(Character.valueOf('#'), f.getCommentStart());
    }

    @Test
    public void testWithCommentStart_characterNull_disablesComment() {
        CSVFormat f = format.withCommentStart((Character) null);
        assertNull(f.getCommentStart());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentStart_lineBreakChar_throwsException() {
        format.withCommentStart('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentStart_lineBreakCharacter_throwsException() {
        format.withCommentStart(Character.valueOf('\r'));
    }

    @Test
    public void testWithEscape_charValid_returnsNewFormat() {
        CSVFormat f = format.withEscape('\\');
        assertEquals(Character.valueOf('\\'), f.getEscape());
    }

    @Test
    public void testWithEscape_characterNull_disablesEscape() {
        CSVFormat f = format.withEscape((Character) null);
        assertNull(f.getEscape());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_lineBreakChar_throwsException() {
        format.withEscape('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_lineBreakCharacter_throwsException() {
        format.withEscape(Character.valueOf('\r'));
    }

    @Test
    public void testWithHeader_noArgs_emptyHeaderArray() {
        CSVFormat f = format.withHeader();
        assertNotNull(f.getHeader());
        assertEquals(0, f.getHeader().length);
    }

    @Test
    public void testWithHeader_withArgs_setsHeader() {
        CSVFormat f = format.withHeader("col1", "col2", "col3");
        assertArrayEquals(new String[]{"col1", "col2", "col3"}, f.getHeader());
    }

    @Test
    public void testWithIgnoreEmptyLines_true_setsFlag() {
        CSVFormat f = format.withIgnoreEmptyLines(true);
        assertTrue(f.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreEmptyLines_false_setsFlag() {
        CSVFormat f = format.withIgnoreEmptyLines(false);
        assertFalse(f.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces_true_setsFlag() {
        CSVFormat f = format.withIgnoreSurroundingSpaces(true);
        assertTrue(f.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces_false_setsFlag() {
        CSVFormat f = format.withIgnoreSurroundingSpaces(false);
        assertFalse(f.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithNullString_validString_setsNullString() {
        CSVFormat f = format.withNullString("N/A");
        assertEquals("N/A", f.getNullString());
    }

    @Test
    public void testWithNullString_nullValue_setsNullStringNull() {
        CSVFormat f = format.withNullString(null);
        assertNull(f.getNullString());
    }

    @Test
    public void testWithQuoteChar_charValid_setsQuoteChar() {
        CSVFormat f = format.withQuoteChar('\'');
        assertEquals(Character.valueOf('\''), f.getQuoteChar());
    }

    @Test
    public void testWithQuoteChar_characterNull_disablesQuoting() {
        CSVFormat f = format.withQuoteChar((Character) null);
        assertNull(f.getQuoteChar());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteChar_lineBreakChar_throwsException() {
        format.withQuoteChar('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteChar_lineBreakCharacter_throwsException() {
        format.withQuoteChar(Character.valueOf('\r'));
    }

    @Test
    public void testWithQuotePolicy_setsPolicy() {
        CSVFormat f = format.withQuotePolicy(Quote.ALL);
        assertEquals(Quote.ALL, f.getQuotePolicy());
    }

    @Test
    public void testWithQuotePolicy_null_setsNull() {
        CSVFormat f = format.withQuotePolicy(null);
        assertNull(f.getQuotePolicy());
    }

    @Test
    public void testWithRecordSeparator_charValue_setsSeparator() {
        CSVFormat f = format.withRecordSeparator('\n');
        assertEquals("\n", f.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparator_stringValue_setsSeparator() {
        CSVFormat f = format.withRecordSeparator("\r\n");
        assertEquals("\r\n", f.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparator_nullString_setsNull() {
        CSVFormat f = format.withRecordSeparator((String) null);
        assertNull(f.getRecordSeparator());
    }

    @Test
    public void testWithSkipHeaderRecord_true_setsFlag() {
        CSVFormat f = format.withSkipHeaderRecord(true);
        assertTrue(f.getSkipHeaderRecord());
    }

    @Test
    public void testWithSkipHeaderRecord_false_setsFlag() {
        CSVFormat f = format.withSkipHeaderRecord(false);
        assertFalse(f.getSkipHeaderRecord());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(format.equals(format));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(format.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        assertFalse(format.equals("not a CSVFormat"));
    }

    @Test
    public void testEquals_differentDelimiter_returnsFalse() {
        CSVFormat other = format.withDelimiter(';');
        assertFalse(format.equals(other));
    }

    @Test
    public void testEquals_differentQuotePolicy_returnsFalse() {
        CSVFormat a = format.withQuotePolicy(Quote.ALL);
        CSVFormat b = format.withQuotePolicy(Quote.MINIMAL);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_sameQuoteCharBothNull_returnsTrue() {
        CSVFormat a = format.withQuoteChar((Character) null).withEscape('\\');
        CSVFormat b = format.withQuoteChar((Character) null).withEscape('\\');
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_differentQuoteChar_returnsFalse() {
        CSVFormat a = format.withQuoteChar('"');
        CSVFormat b = format.withQuoteChar('\'');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_oneQuoteCharNullOtherNotNull_returnsFalse() {
        CSVFormat a = format.withQuoteChar((Character) null);
        CSVFormat b = format.withQuoteChar('"');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentCommentStart_returnsFalse() {
        CSVFormat a = format.withCommentStart('#');
        CSVFormat b = format.withCommentStart('!');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_oneCommentStartNullOtherNotNull_returnsFalse() {
        CSVFormat a = format;
        CSVFormat b = format.withCommentStart('#');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentEscape_returnsFalse() {
        CSVFormat a = format.withEscape('\\');
        CSVFormat b = format.withEscape('/');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_oneEscapeNullOtherNotNull_returnsFalse() {
        CSVFormat a = format;
        CSVFormat b = format.withEscape('\\');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentNullString_returnsFalse() {
        CSVFormat a = format.withNullString("N/A");
        CSVFormat b = format.withNullString("NULL");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_oneNullStringNullOtherNotNull_returnsFalse() {
        CSVFormat a = format;
        CSVFormat b = format.withNullString("N/A");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentHeader_returnsFalse() {
        CSVFormat a = format.withHeader("a", "b");
        CSVFormat b = format.withHeader("a", "c");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentIgnoreSurroundingSpaces_returnsFalse() {
        CSVFormat a = format.withIgnoreSurroundingSpaces(true);
        CSVFormat b = format.withIgnoreSurroundingSpaces(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentIgnoreEmptyLines_returnsFalse() {
        CSVFormat a = format.withIgnoreEmptyLines(true);
        CSVFormat b = format.withIgnoreEmptyLines(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentSkipHeaderRecord_returnsFalse() {
        CSVFormat a = format.withSkipHeaderRecord(true);
        CSVFormat b = format.withSkipHeaderRecord(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentRecordSeparator_returnsFalse() {
        CSVFormat a = format.withRecordSeparator("\n");
        CSVFormat b = format.withRecordSeparator("\r\n");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_oneRecordSeparatorNullOtherNotNull_returnsFalse() {
        CSVFormat a = format.withRecordSeparator((String) null);
        CSVFormat b = format.withRecordSeparator("\n");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_allFieldsSame_returnsTrue() {
        CSVFormat a = CSVFormat.DEFAULT;
        CSVFormat b = CSVFormat.DEFAULT;
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_bothQuoteCharNull_returnsTrue() {
        CSVFormat a = format.withQuoteChar((Character) null);
        CSVFormat b = format.withQuoteChar((Character) null);
        assertTrue(a.equals(b));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_equalObjects_sameHashCode() {
        CSVFormat a = CSVFormat.DEFAULT;
        CSVFormat b = CSVFormat.DEFAULT;
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testHashCode_withAllFieldsSet_doesNotThrow() {
        CSVFormat f = format.withCommentStart('#')
                .withEscape('\\')
                .withNullString("N/A")
                .withHeader("a", "b")
                .withQuotePolicy(Quote.ALL);
        int hash = f.hashCode();
        assertTrue(hash != 0 || hash == 0); // just ensure no exception
    }

    @Test
    public void testHashCode_withNullFields_doesNotThrow() {
        CSVFormat f = CSVFormat.newFormat(',');
        int hash = f.hashCode();
        assertNotNull(hash); // autoboxed, just verifying execution
    }

    // ---------- toString ----------

    @Test
    public void testToString_defaultFormat_containsDelimiter() {
        String s = format.toString();
        assertTrue(s.contains("Delimiter=<,>"));
    }

    @Test
    public void testToString_withEscape_containsEscape() {
        CSVFormat f = format.withEscape('\\');
        String s = f.toString();
        assertTrue(s.contains("Escape=<\\>"));
    }

    @Test
    public void testToString_withQuoting_containsQuoteChar() {
        String s = format.toString();
        assertTrue(s.contains("QuoteChar=<\">"));
    }

    @Test
    public void testToString_withCommentStart_containsCommentStart() {
        CSVFormat f = format.withCommentStart('#');
        String s = f.toString();
        assertTrue(s.contains("CommentStart=<#>"));
    }

    @Test
    public void testToString_withNullString_containsNullString() {
        CSVFormat f = format.withNullString("N/A");
        String s = f.toString();
        assertTrue(s.contains("NullString=<N/A>"));
    }

    @Test
    public void testToString_withRecordSeparator_containsRecordSeparator() {
        String s = format.toString();
        assertTrue(s.contains("RecordSeparator=<"));
    }

    @Test
    public void testToString_withIgnoreEmptyLines_containsEmptyLinesIgnored() {
        String s = format.toString();
        assertTrue(s.contains("EmptyLines:ignored"));
    }

    @Test
    public void testToString_withIgnoreSurroundingSpaces_containsSurroundingSpacesIgnored() {
        CSVFormat f = format.withIgnoreSurroundingSpaces(true);
        String s = f.toString();
        assertTrue(s.contains("SurroundingSpaces:ignored"));
    }

    @Test
    public void testToString_withHeader_containsHeader() {
        CSVFormat f = format.withHeader("a", "b");
        String s = f.toString();
        assertTrue(s.contains("Header:"));
    }

    @Test
    public void testToString_skipHeaderRecord_containsFlag() {
        String s = format.toString();
        assertTrue(s.contains("SkipHeaderRecord:false"));
    }

    @Test
    public void testToString_minimalFormat_noOptionalFields() {
        CSVFormat f = CSVFormat.newFormat(',');
        String s = f.toString();
        assertFalse(s.contains("Escape="));
        assertFalse(s.contains("QuoteChar="));
        assertFalse(s.contains("CommentStart="));
        assertFalse(s.contains("NullString="));
        assertFalse(s.contains("RecordSeparator="));
        assertFalse(s.contains("Header:"));
    }

    // ---------- validate ----------

    @Test
    public void testValidate_defaultFormat_noException() {
        format.validate(); // package-private, testable in same package
    }

    @Test(expected = IllegalStateException.class)
    public void testValidate_quoteCharSameAsDelimiter_throwsException() {
        CSVFormat f = CSVFormat.newFormat(',').withQuoteChar(',');
        f.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidate_escapeSameAsDelimiter_throwsException() {
        CSVFormat f = CSVFormat.newFormat(',').withEscape(',');
        f.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidate_commentStartSameAsDelimiter_throwsException() {
        CSVFormat f = CSVFormat.newFormat(',').withCommentStart(',');
        f.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidate_quoteCharSameAsCommentStart_throwsException() {
        CSVFormat f = CSVFormat.newFormat(',').withQuoteChar('#').withCommentStart('#');
        f.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidate_escapeSameAsCommentStart_throwsException() {
        CSVFormat f = CSVFormat.newFormat(',').withEscape('#').withCommentStart('#');
        f.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidate_noEscapeAndQuotePolicyNone_throwsException() {
        CSVFormat f = CSVFormat.newFormat(',').withQuotePolicy(Quote.NONE);
        f.validate();
    }

    @Test
    public void testValidate_escapeSetAndQuotePolicyNone_noException() {
        CSVFormat f = CSVFormat.newFormat(',').withEscape('\\').withQuotePolicy(Quote.NONE);
        f.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidate_duplicateHeaderNames_throwsException() {
        CSVFormat f = CSVFormat.DEFAULT.withEscape('\\').withHeader("a", "b", "a");
        f.validate();
    }

    @Test
    public void testValidate_uniqueHeaderNames_noException() {
        CSVFormat f = CSVFormat.DEFAULT.withHeader("a", "b", "c");
        f.validate();
    }

    // ---------- format ----------

    @Test
    public void testFormat_simpleValues_returnsFormattedString() {
        String result = format.format("a", "b", "c");
        assertEquals("a,b,c", result);
    }

    @Test
    public void testFormat_emptyValues_returnsEmptyString() {
        String result = format.format();
        assertEquals("", result);
    }

    @Test
    public void testFormat_valuesWithQuoting_returnsQuotedString() {
        String result = format.format("a,b", "c");
        assertTrue(result.contains("a,b"));
    }

    // ---------- parse ----------

    @Test
    public void testParse_validReader_returnsParser() throws IOException {
        Reader reader = new StringReader("a,b,c\n1,2,3\n");
        CSVParser parser = format.parse(reader);
        assertNotNull(parser);
        parser.close();
    }

    @Test(expected = Exception.class)
    public void testParse_nullReader_throwsException() throws IOException {
        format.parse(null);
    }
}
