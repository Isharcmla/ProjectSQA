import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

public class CSVFormatTest {

    private CSVFormat format;

    @Before
    public void setUp() {
        format = CSVFormat.DEFAULT;
    }

    // ---------- Predefined formats ----------

    @Test
    public void testDefaultFormat_hasExpectedSettings() {
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertEquals(Character.valueOf('"'), CSVFormat.DEFAULT.getQuoteCharacter());
        assertEquals("\r\n", CSVFormat.DEFAULT.getRecordSeparator());
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
    }

    @Test
    public void testRfc4180Format_ignoreEmptyLinesFalse() {
        assertFalse(CSVFormat.RFC4180.getIgnoreEmptyLines());
    }

    @Test
    public void testExcelFormat_ignoreEmptyLinesFalse() {
        assertFalse(CSVFormat.EXCEL.getIgnoreEmptyLines());
    }

    @Test
    public void testTdfFormat_delimiterIsTab() {
        assertEquals('\t', CSVFormat.TDF.getDelimiter());
        assertTrue(CSVFormat.TDF.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testMysqlFormat_settings() {
        assertEquals('\t', CSVFormat.MYSQL.getDelimiter());
        assertNull(CSVFormat.MYSQL.getQuoteCharacter());
        assertEquals(Character.valueOf('\\'), CSVFormat.MYSQL.getEscapeCharacter());
        assertFalse(CSVFormat.MYSQL.getIgnoreEmptyLines());
        assertEquals("\n", CSVFormat.MYSQL.getRecordSeparator());
    }

    // ---------- newFormat ----------

    @Test
    public void testNewFormat_validDelimiter_createsFormat() {
        CSVFormat newFmt = CSVFormat.newFormat(';');
        assertEquals(';', newFmt.getDelimiter());
        assertNull(newFmt.getQuoteCharacter());
        assertNull(newFmt.getHeader());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_lineBreakDelimiter_throwsException() {
        CSVFormat.newFormat('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_crDelimiter_throwsException() {
        CSVFormat.newFormat('\r');
    }

    // ---------- Getters ----------

    @Test
    public void testGetCommentMarker_notSet_returnsNull() {
        assertNull(CSVFormat.DEFAULT.getCommentMarker());
    }

    @Test
    public void testGetCommentMarker_set_returnsValue() {
        CSVFormat fmt = CSVFormat.DEFAULT.withCommentMarker('#');
        assertEquals(Character.valueOf('#'), fmt.getCommentMarker());
    }

    @Test
    public void testGetDelimiter_returnsCorrectValue() {
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
    }

    @Test
    public void testGetEscapeCharacter_notSet_returnsNull() {
        assertNull(CSVFormat.DEFAULT.getEscapeCharacter());
    }

    @Test
    public void testGetHeader_notSet_returnsNull() {
        assertNull(CSVFormat.DEFAULT.getHeader());
    }

    @Test
    public void testGetHeader_set_returnsClone() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader("A", "B");
        String[] header1 = fmt.getHeader();
        String[] header2 = fmt.getHeader();
        assertNotSame(header1, header2);
        assertArrayEquals(new String[]{"A", "B"}, header1);
    }

    @Test
    public void testGetAllowMissingColumnNames_default_false() {
        assertFalse(CSVFormat.DEFAULT.getAllowMissingColumnNames());
    }

    @Test
    public void testGetAllowMissingColumnNames_setTrue_returnsTrue() {
        CSVFormat fmt = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);
        assertTrue(fmt.getAllowMissingColumnNames());
    }

    @Test
    public void testGetIgnoreEmptyLines_default_true() {
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
    }

    @Test
    public void testGetIgnoreSurroundingSpaces_default_false() {
        assertFalse(CSVFormat.DEFAULT.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testGetNullString_default_null() {
        assertNull(CSVFormat.DEFAULT.getNullString());
    }

    @Test
    public void testGetNullString_set_returnsValue() {
        CSVFormat fmt = CSVFormat.DEFAULT.withNullString("N/A");
        assertEquals("N/A", fmt.getNullString());
    }

    @Test
    public void testGetQuoteCharacter_default_returnsDoubleQuote() {
        assertEquals(Character.valueOf('"'), CSVFormat.DEFAULT.getQuoteCharacter());
    }

    @Test
    public void testGetQuoteMode_default_null() {
        assertNull(CSVFormat.DEFAULT.getQuoteMode());
    }

    @Test
    public void testGetQuoteMode_set_returnsValue() {
        CSVFormat fmt = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        assertEquals(QuoteMode.ALL, fmt.getQuoteMode());
    }

    @Test
    public void testGetRecordSeparator_default_returnsCrLf() {
        assertEquals("\r\n", CSVFormat.DEFAULT.getRecordSeparator());
    }

    @Test
    public void testGetSkipHeaderRecord_default_false() {
        assertFalse(CSVFormat.DEFAULT.getSkipHeaderRecord());
    }

    @Test
    public void testGetSkipHeaderRecord_setTrue_returnsTrue() {
        CSVFormat fmt = CSVFormat.DEFAULT.withSkipHeaderRecord(true);
        assertTrue(fmt.getSkipHeaderRecord());
    }

    // ---------- isXxxSet methods ----------

    @Test
    public void testIsCommentMarkerSet_notSet_false() {
        assertFalse(CSVFormat.DEFAULT.isCommentMarkerSet());
    }

    @Test
    public void testIsCommentMarkerSet_set_true() {
        CSVFormat fmt = CSVFormat.DEFAULT.withCommentMarker('#');
        assertTrue(fmt.isCommentMarkerSet());
    }

    @Test
    public void testIsEscapeCharacterSet_notSet_false() {
        assertFalse(CSVFormat.DEFAULT.isEscapeCharacterSet());
    }

    @Test
    public void testIsEscapeCharacterSet_set_true() {
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape('\\');
        assertTrue(fmt.isEscapeCharacterSet());
    }

    @Test
    public void testIsNullStringSet_notSet_false() {
        assertFalse(CSVFormat.DEFAULT.isNullStringSet());
    }

    @Test
    public void testIsNullStringSet_set_true() {
        CSVFormat fmt = CSVFormat.DEFAULT.withNullString("NULL");
        assertTrue(fmt.isNullStringSet());
    }

    @Test
    public void testIsQuoteCharacterSet_set_true() {
        assertTrue(CSVFormat.DEFAULT.isQuoteCharacterSet());
    }

    @Test
    public void testIsQuoteCharacterSet_notSet_false() {
        CSVFormat fmt = CSVFormat.DEFAULT.withQuote(null).withEscape('\\');
        assertFalse(fmt.isQuoteCharacterSet());
    }

    // ---------- format() ----------

    @Test
    public void testFormat_normalValues_returnsFormattedString() {
        String result = CSVFormat.DEFAULT.format("a", "b", "c");
        assertEquals("a,b,c", result);
    }

    @Test
    public void testFormat_emptyValues_returnsEmptyString() {
        String result = CSVFormat.DEFAULT.format();
        assertEquals("", result);
    }

    // ---------- parse() ----------

    @Test
    public void testParse_validReader_returnsParser() throws IOException {
        Reader reader = new StringReader("a,b,c\n1,2,3\n");
        CSVParser parser = CSVFormat.DEFAULT.parse(reader);
        assertNotNull(parser);
        parser.close();
    }

    // ---------- print() ----------

    @Test
    public void testPrint_validAppendable_returnsPrinter() throws IOException {
        StringWriter writer = new StringWriter();
        CSVPrinter printer = CSVFormat.DEFAULT.print(writer);
        assertNotNull(printer);
        printer.close();
    }

    // ---------- equals() ----------

    @Test
    public void testEquals_sameInstance_true() {
        assertTrue(CSVFormat.DEFAULT.equals(CSVFormat.DEFAULT));
    }

    @Test
    public void testEquals_null_false() {
        assertFalse(CSVFormat.DEFAULT.equals(null));
    }

    @Test
    public void testEquals_differentClass_false() {
        assertFalse(CSVFormat.DEFAULT.equals("not a CSVFormat"));
    }

    @Test
    public void testEquals_differentDelimiter_false() {
        CSVFormat other = CSVFormat.DEFAULT.withDelimiter(';');
        assertFalse(CSVFormat.DEFAULT.equals(other));
    }

    @Test
    public void testEquals_differentQuoteMode_false() {
        CSVFormat a = CSVFormat.newFormat(',').withEscape('\\').withQuoteMode(QuoteMode.ALL);
        CSVFormat b = CSVFormat.newFormat(',').withEscape('\\').withQuoteMode(QuoteMode.MINIMAL);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentQuoteCharacter_false() {
        CSVFormat other = CSVFormat.DEFAULT.withQuote('\'');
        assertFalse(CSVFormat.DEFAULT.equals(other));
    }

    @Test
    public void testEquals_bothQuoteCharacterNull_true() {
        CSVFormat a = CSVFormat.newFormat(',').withEscape('\\').withQuote(null);
        CSVFormat b = CSVFormat.newFormat(',').withEscape('\\').withQuote(null);
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_differentCommentMarker_false() {
        CSVFormat a = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVFormat b = CSVFormat.DEFAULT.withCommentMarker('%');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_bothCommentMarkerNull_true() {
        assertTrue(CSVFormat.DEFAULT.equals(CSVFormat.DEFAULT.withDelimiter(',')));
    }

    @Test
    public void testEquals_differentEscapeCharacter_false() {
        CSVFormat a = CSVFormat.DEFAULT.withEscape('\\');
        CSVFormat b = CSVFormat.DEFAULT.withEscape('/');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_bothEscapeCharacterNull_true() {
        CSVFormat a = CSVFormat.DEFAULT;
        CSVFormat b = CSVFormat.DEFAULT.withDelimiter(',');
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_differentNullString_false() {
        CSVFormat a = CSVFormat.DEFAULT.withNullString("N/A");
        CSVFormat b = CSVFormat.DEFAULT.withNullString("NULL");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_bothNullStringNull_true() {
        CSVFormat a = CSVFormat.DEFAULT;
        CSVFormat b = CSVFormat.DEFAULT.withDelimiter(',');
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_differentHeader_false() {
        CSVFormat a = CSVFormat.DEFAULT.withHeader("A", "B");
        CSVFormat b = CSVFormat.DEFAULT.withHeader("C", "D");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentIgnoreSurroundingSpaces_false() {
        CSVFormat a = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        CSVFormat b = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentIgnoreEmptyLines_false() {
        CSVFormat a = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);
        CSVFormat b = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentSkipHeaderRecord_false() {
        CSVFormat a = CSVFormat.DEFAULT.withSkipHeaderRecord(true);
        CSVFormat b = CSVFormat.DEFAULT.withSkipHeaderRecord(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentRecordSeparator_false() {
        CSVFormat a = CSVFormat.DEFAULT.withRecordSeparator("\n");
        CSVFormat b = CSVFormat.DEFAULT.withRecordSeparator("\r");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_bothRecordSeparatorNull_true() {
        CSVFormat a = CSVFormat.newFormat(',').withEscape('\\');
        CSVFormat b = CSVFormat.newFormat(',').withEscape('\\');
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_allFieldsEqual_true() {
        CSVFormat a = CSVFormat.DEFAULT.withHeader("X").withNullString("N").withCommentMarker('#').withEscape('\\');
        CSVFormat b = CSVFormat.DEFAULT.withHeader("X").withNullString("N").withCommentMarker('#').withEscape('\\');
        assertTrue(a.equals(b));
    }

    // ---------- hashCode() ----------

    @Test
    public void testHashCode_consistentForEqualObjects() {
        CSVFormat a = CSVFormat.DEFAULT.withHeader("X");
        CSVFormat b = CSVFormat.DEFAULT.withHeader("X");
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testHashCode_returnsInt() {
        int hash = CSVFormat.DEFAULT.hashCode();
        assertTrue(hash != 0 || hash == 0); // just confirm executes without exception
    }

    // ---------- toString() ----------

    @Test
    public void testToString_defaultFormat_containsDelimiter() {
        String str = CSVFormat.DEFAULT.toString();
        assertTrue(str.contains("Delimiter=<,>"));
    }

    @Test
    public void testToString_withEscape_containsEscape() {
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape('\\');
        String str = fmt.toString();
        assertTrue(str.contains("Escape=<\\>"));
    }

    @Test
    public void testToString_withQuoteChar_containsQuoteChar() {
        String str = CSVFormat.DEFAULT.toString();
        assertTrue(str.contains("QuoteChar=<\">"));
    }

    @Test
    public void testToString_withCommentMarker_containsCommentStart() {
        CSVFormat fmt = CSVFormat.DEFAULT.withCommentMarker('#');
        String str = fmt.toString();
        assertTrue(str.contains("CommentStart=<#>"));
    }

    @Test
    public void testToString_withNullString_containsNullString() {
        CSVFormat fmt = CSVFormat.DEFAULT.withNullString("N/A");
        String str = fmt.toString();
        assertTrue(str.contains("NullString=<N/A>"));
    }

    @Test
    public void testToString_withRecordSeparator_containsRecordSeparator() {
        String str = CSVFormat.DEFAULT.toString();
        assertTrue(str.contains("RecordSeparator="));
    }

    @Test
    public void testToString_withIgnoreEmptyLines_containsEmptyLinesIgnored() {
        String str = CSVFormat.DEFAULT.toString();
        assertTrue(str.contains("EmptyLines:ignored"));
    }

    @Test
    public void testToString_withIgnoreSurroundingSpaces_containsSurroundingSpacesIgnored() {
        CSVFormat fmt = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        String str = fmt.toString();
        assertTrue(str.contains("SurroundingSpaces:ignored"));
    }

    @Test
    public void testToString_withHeader_containsHeader() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader("A", "B");
        String str = fmt.toString();
        assertTrue(str.contains("Header:"));
    }

    @Test
    public void testToString_skipHeaderRecordAlwaysPresent() {
        String str = CSVFormat.DEFAULT.toString();
        assertTrue(str.contains("SkipHeaderRecord:"));
    }

    // ---------- withCommentMarker ----------

    @Test
    public void testWithCommentMarker_charOverload_setsMarker() {
        CSVFormat fmt = CSVFormat.DEFAULT.withCommentMarker('#');
        assertEquals(Character.valueOf('#'), fmt.getCommentMarker());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_lineBreak_throwsException() {
        CSVFormat.DEFAULT.withCommentMarker('\n');
    }

    @Test
    public void testWithCommentMarker_null_disablesMarker() {
        CSVFormat fmt = CSVFormat.DEFAULT.withCommentMarker((Character) null);
        assertNull(fmt.getCommentMarker());
    }

    // ---------- withDelimiter ----------

    @Test
    public void testWithDelimiter_validChar_setsDelimiter() {
        CSVFormat fmt = CSVFormat.DEFAULT.withDelimiter(';');
        assertEquals(';', fmt.getDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_lineBreak_throwsException() {
        CSVFormat.DEFAULT.withDelimiter('\r');
    }

    // ---------- withEscape ----------

    @Test
    public void testWithEscape_charOverload_setsEscape() {
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape('\\');
        assertEquals(Character.valueOf('\\'), fmt.getEscapeCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_lineBreak_throwsException() {
        CSVFormat.DEFAULT.withEscape('\n');
    }

    @Test
    public void testWithEscape_null_disablesEscape() {
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape((Character) null);
        assertNull(fmt.getEscapeCharacter());
    }

    // ---------- withHeader ----------

    @Test
    public void testWithHeader_normalHeaders_setsHeader() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader("Col1", "Col2");
        assertArrayEquals(new String[]{"Col1", "Col2"}, fmt.getHeader());
    }

    @Test
    public void testWithHeader_emptyHeader_setsEmptyArray() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader();
        assertArrayEquals(new String[]{}, fmt.getHeader());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_duplicateEntries_throwsException() {
        CSVFormat.DEFAULT.withHeader("Col1", "Col1");
    }

    // ---------- withAllowMissingColumnNames ----------

    @Test
    public void testWithAllowMissingColumnNames_true_setsTrue() {
        CSVFormat fmt = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);
        assertTrue(fmt.getAllowMissingColumnNames());
    }

    @Test
    public void testWithAllowMissingColumnNames_false_setsFalse() {
        CSVFormat fmt = CSVFormat.DEFAULT.withAllowMissingColumnNames(false);
        assertFalse(fmt.getAllowMissingColumnNames());
    }

    // ---------- withIgnoreEmptyLines ----------

    @Test
    public void testWithIgnoreEmptyLines_true_setsTrue() {
        CSVFormat fmt = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);
        assertTrue(fmt.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreEmptyLines_false_setsFalse() {
        CSVFormat fmt = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        assertFalse(fmt.getIgnoreEmptyLines());
    }

    // ---------- withIgnoreSurroundingSpaces ----------

    @Test
    public void testWithIgnoreSurroundingSpaces_true_setsTrue() {
        CSVFormat fmt = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        assertTrue(fmt.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces_false_setsFalse() {
        CSVFormat fmt = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(false);
        assertFalse(fmt.getIgnoreSurroundingSpaces());
    }

    // ---------- withNullString ----------

    @Test
    public void testWithNullString_setsValue() {
        CSVFormat fmt = CSVFormat.DEFAULT.withNullString("N/A");
        assertEquals("N/A", fmt.getNullString());
    }

    @Test
    public void testWithNullString_null_setsNull() {
        CSVFormat fmt = CSVFormat.DEFAULT.withNullString(null);
        assertNull(fmt.getNullString());
    }

    // ---------- withQuote ----------

    @Test
    public void testWithQuote_charOverload_setsQuote() {
        CSVFormat fmt = CSVFormat.DEFAULT.withQuote('\'');
        assertEquals(Character.valueOf('\''), fmt.getQuoteCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_lineBreak_throwsException() {
        CSVFormat.DEFAULT.withQuote('\n');
    }

    @Test
    public void testWithQuote_null_disablesQuote() {
        CSVFormat fmt = CSVFormat.DEFAULT.withQuote(null).withEscape('\\');
        assertNull(fmt.getQuoteCharacter());
    }

    // ---------- withQuoteMode ----------

    @Test
    public void testWithQuoteMode_setsValue() {
        CSVFormat fmt = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        assertEquals(QuoteMode.ALL, fmt.getQuoteMode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_noneWithoutEscape_throwsException() {
        CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NONE);
    }

    @Test
    public void testWithQuoteMode_noneWithEscape_succeeds() {
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape('\\').withQuoteMode(QuoteMode.NONE);
        assertEquals(QuoteMode.NONE, fmt.getQuoteMode());
    }

    // ---------- withRecordSeparator ----------

    @Test
    public void testWithRecordSeparator_charOverload_setsValue() {
        CSVFormat fmt = CSVFormat.DEFAULT.withRecordSeparator('\n');
        assertEquals("\n", fmt.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparator_stringOverload_setsValue() {
        CSVFormat fmt = CSVFormat.DEFAULT.withRecordSeparator("\r\n");
        assertEquals("\r\n", fmt.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparator_null_setsNull() {
        CSVFormat fmt = CSVFormat.DEFAULT.withRecordSeparator((String) null);
        assertNull(fmt.getRecordSeparator());
    }

    // ---------- withSkipHeaderRecord ----------

    @Test
    public void testWithSkipHeaderRecord_true_setsTrue() {
        CSVFormat fmt = CSVFormat.DEFAULT.withSkipHeaderRecord(true);
        assertTrue(fmt.getSkipHeaderRecord());
    }

    @Test
    public void testWithSkipHeaderRecord_false_setsFalse() {
        CSVFormat fmt = CSVFormat.DEFAULT.withSkipHeaderRecord(false);
        assertFalse(fmt.getSkipHeaderRecord());
    }

    // ---------- validate() branches via constructor ----------

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_quoteCharacterEqualsDelimiter_throwsException() {
        CSVFormat.newFormat(',').withEscape('\\').withQuote(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_escapeCharacterEqualsDelimiter_throwsException() {
        CSVFormat.newFormat(',').withEscape(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_commentMarkerEqualsDelimiter_throwsException() {
        CSVFormat.newFormat(',').withEscape('\\').withCommentMarker(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_quoteCharacterEqualsCommentMarker_throwsException() {
        CSVFormat.DEFAULT.withCommentMarker('"');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_escapeCharacterEqualsCommentMarker_throwsException() {
        CSVFormat.newFormat(',').withEscape('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_noEscapeAndQuoteModeNone_throwsException() {
        CSVFormat.newFormat(',').withQuote('"').withQuoteMode(QuoteMode.NONE);
    }

    @Test
    public void testValidate_validConfiguration_noException() {
        CSVFormat fmt = CSVFormat.newFormat(',').withQuote('"').withEscape('\\').withQuoteMode(QuoteMode.NONE);
        assertNotNull(fmt);
    }
}
