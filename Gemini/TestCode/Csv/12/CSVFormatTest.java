package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import org.junit.Test;

public class CSVFormatTest {

    @Test
    public void testPredefinedFormats_defaults_configuredProperly() {
        assertNotNull(CSVFormat.DEFAULT);
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertEquals(Character.valueOf('"'), CSVFormat.DEFAULT.getQuoteCharacter());
        assertNull(CSVFormat.DEFAULT.getQuoteMode());
        assertNull(CSVFormat.DEFAULT.getCommentMarker());
        assertNull(CSVFormat.DEFAULT.getEscapeCharacter());
        assertFalse(CSVFormat.DEFAULT.getIgnoreSurroundingSpaces());
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
        assertEquals("\r\n", CSVFormat.DEFAULT.getRecordSeparator());
        assertNull(CSVFormat.DEFAULT.getNullString());
        assertNull(CSVFormat.DEFAULT.getHeader());
        assertFalse(CSVFormat.DEFAULT.getSkipHeaderRecord());
        assertFalse(CSVFormat.DEFAULT.getAllowMissingColumnNames());

        assertNotNull(CSVFormat.RFC4180);
        assertFalse(CSVFormat.RFC4180.getIgnoreEmptyLines());

        assertNotNull(CSVFormat.EXCEL);
        assertFalse(CSVFormat.EXCEL.getIgnoreEmptyLines());

        assertNotNull(CSVFormat.TDF);
        assertEquals('\t', CSVFormat.TDF.getDelimiter());
        assertTrue(CSVFormat.TDF.getIgnoreSurroundingSpaces());

        assertNotNull(CSVFormat.MYSQL);
        assertEquals('\t', CSVFormat.MYSQL.getDelimiter());
        assertEquals(Character.valueOf('\\'), CSVFormat.MYSQL.getEscapeCharacter());
        assertFalse(CSVFormat.MYSQL.getIgnoreEmptyLines());
        assertNull(CSVFormat.MYSQL.getQuoteCharacter());
        assertEquals("\n", CSVFormat.MYSQL.getRecordSeparator());
    }

    @Test
    public void testNewFormat_validDelimiter_createsFormatWithDefaults() {
        final CSVFormat format = CSVFormat.newFormat(';');
        assertEquals(';', format.getDelimiter());
        assertNull(format.getQuoteCharacter());
        assertNull(format.getQuoteMode());
        assertNull(format.getCommentMarker());
        assertNull(format.getEscapeCharacter());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertFalse(format.getIgnoreEmptyLines());
        assertNull(format.getRecordSeparator());
        assertNull(format.getNullString());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
        assertFalse(format.getAllowMissingColumnNames());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_lineBreakDelimiterLF_throwsException() {
        CSVFormat.newFormat('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_lineBreakDelimiterCR_throwsException() {
        CSVFormat.newFormat('\r');
    }

    @Test
    public void testWithDelimiter_validChar_returnsNewFormat() {
        final CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
        assertEquals(';', format.getDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_lineBreakDelimiter_throwsException() {
        CSVFormat.DEFAULT.withDelimiter('\n');
    }

    @Test
    public void testWithQuote_charAndCharacter_returnsNewFormat() {
        CSVFormat format = CSVFormat.DEFAULT.withQuote('\'');
        assertEquals(Character.valueOf('\''), format.getQuoteCharacter());
        assertTrue(format.isQuoteCharacterSet());

        format = CSVFormat.DEFAULT.withQuote((Character) null);
        assertNull(format.getQuoteCharacter());
        assertFalse(format.isQuoteCharacterSet());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_lineBreakChar_throwsException() {
        CSVFormat.DEFAULT.withQuote('\r');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_lineBreakCharacter_throwsException() {
        CSVFormat.DEFAULT.withQuote(Character.valueOf('\n'));
    }

    @Test
    public void testWithQuoteMode_validMode_returnsNewFormat() {
        final CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        assertEquals(QuoteMode.ALL, format.getQuoteMode());
    }

    @Test
    public void testWithCommentMarker_charAndCharacter_returnsNewFormat() {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        assertEquals(Character.valueOf('#'), format.getCommentMarker());
        assertTrue(format.isCommentMarkerSet());

        format = CSVFormat.DEFAULT.withCommentMarker((Character) null);
        assertNull(format.getCommentMarker());
        assertFalse(format.isCommentMarkerSet());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_lineBreakChar_throwsException() {
        CSVFormat.DEFAULT.withCommentMarker('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_lineBreakCharacter_throwsException() {
        CSVFormat.DEFAULT.withCommentMarker(Character.valueOf('\r'));
    }

    @Test
    public void testWithEscape_charAndCharacter_returnsNewFormat() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        assertEquals(Character.valueOf('\\'), format.getEscapeCharacter());
        assertTrue(format.isEscapeCharacterSet());

        format = CSVFormat.DEFAULT.withEscape((Character) null);
        assertNull(format.getEscapeCharacter());
        assertFalse(format.isEscapeCharacterSet());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_lineBreakChar_throwsException() {
        CSVFormat.DEFAULT.withEscape('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_lineBreakCharacter_throwsException() {
        CSVFormat.DEFAULT.withEscape(Character.valueOf('\r'));
    }

    @Test
    public void testWithHeader_validArrayAndEmpty_returnsNewFormat() {
        final String[] header = new String[]{"A", "B", "C"};
        CSVFormat format = CSVFormat.DEFAULT.withHeader(header);
        assertArrayEquals(header, format.getHeader());

        // Modifying original array should not affect format
        header[0] = "Z";
        assertEquals("A", format.getHeader()[0]);

        // Modifying returned clone should not affect format
        final String[] returnedHeader = format.getHeader();
        returnedHeader[0] = "X";
        assertEquals("A", format.getHeader()[0]);

        format = CSVFormat.DEFAULT.withHeader((String[]) null);
        assertNull(format.getHeader());

        format = CSVFormat.DEFAULT.withHeader();
        assertNotNull(format.getHeader());
        assertEquals(0, format.getHeader().length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_duplicateHeaders_throwsException() {
        CSVFormat.DEFAULT.withHeader("A", "B", "A");
    }

    @Test
    public void testWithAllowMissingColumnNames_boolean_returnsNewFormat() {
        CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);
        assertTrue(format.getAllowMissingColumnNames());

        format = format.withAllowMissingColumnNames(false);
        assertFalse(format.getAllowMissingColumnNames());
    }

    @Test
    public void testWithIgnoreEmptyLines_boolean_returnsNewFormat() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        assertFalse(format.getIgnoreEmptyLines());

        format = format.withIgnoreEmptyLines(true);
        assertTrue(format.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces_boolean_returnsNewFormat() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        assertTrue(format.getIgnoreSurroundingSpaces());

        format = format.withIgnoreSurroundingSpaces(false);
        assertFalse(format.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithNullString_validString_returnsNewFormat() {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        assertEquals("NULL", format.getNullString());
        assertTrue(format.isNullStringSet());

        format = format.withNullString(null);
        assertNull(format.getNullString());
        assertFalse(format.isNullStringSet());
    }

    @Test
    public void testWithRecordSeparator_charAndString_returnsNewFormat() {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator('\n');
        assertEquals("\n", format.getRecordSeparator());

        format = CSVFormat.DEFAULT.withRecordSeparator("\r\n");
        assertEquals("\r\n", format.getRecordSeparator());

        format = CSVFormat.DEFAULT.withRecordSeparator((String) null);
        assertNull(format.getRecordSeparator());
    }

    @Test
    public void testWithSkipHeaderRecord_boolean_returnsNewFormat() {
        CSVFormat format = CSVFormat.DEFAULT.withSkipHeaderRecord(true);
        assertTrue(format.getSkipHeaderRecord());

        format = format.withSkipHeaderRecord(false);
        assertFalse(format.getSkipHeaderRecord());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_delimiterEqualsQuoteChar_throwsException() {
        CSVFormat.DEFAULT.withQuote(',').withDelimiter(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_delimiterEqualsEscapeChar_throwsException() {
        CSVFormat.DEFAULT.withEscape(',').withDelimiter(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_delimiterEqualsCommentMarker_throwsException() {
        CSVFormat.DEFAULT.withCommentMarker(',').withDelimiter(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_quoteCharEqualsCommentMarker_throwsException() {
        CSVFormat.DEFAULT.withCommentMarker('"').withQuote('"');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_escapeCharEqualsCommentMarker_throwsException() {
        CSVFormat.DEFAULT.withEscape('!').withCommentMarker('!');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_quoteModeNoneWithoutEscape_throwsException() {
        CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NONE).withEscape((Character) null);
    }

    @Test
    public void testValidate_quoteModeNoneWithEscape_valid() {
        final CSVFormat format = CSVFormat.DEFAULT.withEscape('\\').withQuoteMode(QuoteMode.NONE);
        assertEquals(QuoteMode.NONE, format.getQuoteMode());
        assertEquals(Character.valueOf('\\'), format.getEscapeCharacter());
    }

    @Test
    public void testFormat_validValues_formatsSuccessfully() {
        final CSVFormat format = CSVFormat.DEFAULT;
        final String result = format.format("a", "b", "c");
        assertEquals("a,b,c", result);
    }

    @Test
    public void testParse_validReader_returnsParser() throws IOException {
        final Reader reader = new StringReader("a,b,c\n1,2,3");
        final CSVParser parser = CSVFormat.DEFAULT.parse(reader);
        assertNotNull(parser);
        assertEquals(2, parser.getRecords().size());
    }

    @Test
    public void testPrint_validAppendable_returnsPrinter() throws IOException {
        final StringWriter writer = new StringWriter();
        final CSVPrinter printer = CSVFormat.DEFAULT.print(writer);
        assertNotNull(printer);
        printer.printRecord("a", "b");
        assertEquals("a,b\r\n", writer.toString());
    }

    @Test
    public void testToString_variousCombinations_stringRepresentationAccurate() {
        final CSVFormat full = CSVFormat.DEFAULT
                .withEscape('\\')
                .withQuote('\'')
                .withCommentMarker('#')
                .withNullString("NULL")
                .withRecordSeparator("\n")
                .withIgnoreEmptyLines(true)
                .withIgnoreSurroundingSpaces(true)
                .withSkipHeaderRecord(true)
                .withHeader("Col1", "Col2");

        final String str = full.toString();
        assertTrue(str.contains("Delimiter=<,>"));
        assertTrue(str.contains("Escape=<\\>"));
        assertTrue(str.contains("QuoteChar=<'>"));
        assertTrue(str.contains("CommentStart=<#>"));
        assertTrue(str.contains("NullString=<NULL>"));
        assertTrue(str.contains("RecordSeparator=<\n>"));
        assertTrue(str.contains("EmptyLines:ignored"));
        assertTrue(str.contains("SurroundingSpaces:ignored"));
        assertTrue(str.contains("SkipHeaderRecord:true"));
        assertTrue(str.contains("Header:[Col1, Col2]"));

        final CSVFormat minimal = CSVFormat.newFormat(';');
        final String minStr = minimal.toString();
        assertEquals("Delimiter=<;> SkipHeaderRecord:false", minStr);
    }

    @Test
    public void testEqualsAndHashCode_sameInstance_returnsTrue() {
        final CSVFormat format = CSVFormat.DEFAULT;
        assertEquals(format, format);
        assertEquals(format.hashCode(), format.hashCode());
    }

    @Test
    public void testEqualsAndHashCode_nullOrDifferentClass_returnsFalse() {
        final CSVFormat format = CSVFormat.DEFAULT;
        assertFalse(format.equals(null));
        assertFalse(format.equals("string"));
    }

    @Test
    public void testEqualsAndHashCode_identicalFields_returnsTrueAndSameHashCode() {
        final CSVFormat f1 = CSVFormat.DEFAULT
                .withCommentMarker('#')
                .withEscape('\\')
                .withNullString("NULL")
                .withQuoteMode(QuoteMode.ALL)
                .withHeader("A", "B");
        final CSVFormat f2 = CSVFormat.DEFAULT
                .withCommentMarker('#')
                .withEscape('\\')
                .withNullString("NULL")
                .withQuoteMode(QuoteMode.ALL)
                .withHeader("A", "B");

        assertEquals(f1, f2);
        assertEquals(f2, f1);
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testEquals_differences_returnsFalse() {
        final CSVFormat base = CSVFormat.DEFAULT.withEscape('\\').withCommentMarker('#').withNullString("N");

        assertNotEquals(base, base.withDelimiter(';'));
        assertNotEquals(base, base.withQuoteMode(QuoteMode.ALL));

        // quoteCharacter
        assertNotEquals(base, base.withQuote('\''));
        assertNotEquals(base, base.withQuote((Character) null));
        assertNotEquals(base.withQuote((Character) null), base);

        // commentMarker
        assertNotEquals(base, base.withCommentMarker('!'));
        assertNotEquals(base, base.withCommentMarker((Character) null));
        assertNotEquals(base.withCommentMarker((Character) null), base);

        // escapeCharacter
        assertNotEquals(base, base.withEscape('^'));
        assertNotEquals(base, base.withEscape((Character) null));
        assertNotEquals(base.withEscape((Character) null), base);

        // nullString
        assertNotEquals(base, base.withNullString("OTHER"));
        assertNotEquals(base, base.withNullString(null));
        assertNotEquals(base.withNullString(null), base);

        // header
        assertNotEquals(base, base.withHeader("A"));
        assertNotEquals(base.withHeader("A"), base.withHeader("B"));
        assertNotEquals(base.withHeader("A"), base);

        // flags
        assertNotEquals(base, base.withIgnoreSurroundingSpaces(true));
        assertNotEquals(base, base.withIgnoreEmptyLines(false));
        assertNotEquals(base, base.withSkipHeaderRecord(true));

        // recordSeparator
        assertNotEquals(base, base.withRecordSeparator("\n"));
        assertNotEquals(base, base.withRecordSeparator((String) null));
        assertNotEquals(base.withRecordSeparator((String) null), base);
    }
}
