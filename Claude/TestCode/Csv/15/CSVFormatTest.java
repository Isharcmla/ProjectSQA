import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class CSVFormatTest {

    private CSVFormat format;

    @Before
    public void setUp() {
        format = CSVFormat.DEFAULT;
    }

    // ---------- Predefined formats ----------

    @Test
    public void testDefaultFormat_typical_notNull() {
        assertNotNull(CSVFormat.DEFAULT);
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertEquals(Character.valueOf('"'), CSVFormat.DEFAULT.getQuoteCharacter());
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
    }

    @Test
    public void testExcelFormat_typical_allowsMissingColumnNames() {
        assertTrue(CSVFormat.EXCEL.getAllowMissingColumnNames());
        assertFalse(CSVFormat.EXCEL.getIgnoreEmptyLines());
    }

    @Test
    public void testMySqlFormat_typical_hasTabDelimiter() {
        assertEquals('\t', CSVFormat.MYSQL.getDelimiter());
        assertEquals("\\N", CSVFormat.MYSQL.getNullString());
        assertEquals(QuoteMode.ALL_NON_NULL, CSVFormat.MYSQL.getQuoteMode());
    }

    @Test
    public void testRfc4180Format_typical_ignoreEmptyLinesFalse() {
        assertFalse(CSVFormat.RFC4180.getIgnoreEmptyLines());
    }

    @Test
    public void testTdfFormat_typical_tabDelimiterAndIgnoreSpaces() {
        assertEquals('\t', CSVFormat.TDF.getDelimiter());
        assertTrue(CSVFormat.TDF.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testInformixUnloadFormat_typical_pipeDelimiter() {
        assertEquals('|', CSVFormat.INFORMIX_UNLOAD.getDelimiter());
        assertEquals(Character.valueOf('\\'), CSVFormat.INFORMIX_UNLOAD.getEscapeCharacter());
    }

    @Test
    public void testInformixUnloadCsvFormat_typical_commaDelimiter() {
        assertEquals(',', CSVFormat.INFORMIX_UNLOAD_CSV.getDelimiter());
    }

    @Test
    public void testPostgresqlCsvFormat_typical_nullStringEmpty() {
        assertEquals("", CSVFormat.POSTGRESQL_CSV.getNullString());
    }

    @Test
    public void testPostgresqlTextFormat_typical_nullStringSlashN() {
        assertEquals("\\N", CSVFormat.POSTGRESQL_TEXT.getNullString());
    }

    // ---------- Predefined enum ----------

    @Test
    public void testPredefinedEnum_getFormat_returnsExpectedFormat() {
        assertEquals(CSVFormat.DEFAULT, CSVFormat.Predefined.Default.getFormat());
        assertEquals(CSVFormat.EXCEL, CSVFormat.Predefined.Excel.getFormat());
        assertEquals(CSVFormat.MYSQL, CSVFormat.Predefined.MySQL.getFormat());
        assertEquals(CSVFormat.RFC4180, CSVFormat.Predefined.RFC4180.getFormat());
        assertEquals(CSVFormat.TDF, CSVFormat.Predefined.TDF.getFormat());
        assertEquals(CSVFormat.INFORMIX_UNLOAD, CSVFormat.Predefined.InformixUnload.getFormat());
        assertEquals(CSVFormat.INFORMIX_UNLOAD_CSV, CSVFormat.Predefined.InformixUnloadCsv.getFormat());
        assertEquals(CSVFormat.POSTGRESQL_CSV, CSVFormat.Predefined.PostgreSQLCsv.getFormat());
        assertEquals(CSVFormat.POSTGRESQL_TEXT, CSVFormat.Predefined.PostgreSQLText.getFormat());
    }

    // ---------- newFormat ----------

    @Test
    public void testNewFormat_validDelimiter_createsFormat() {
        CSVFormat newFmt = CSVFormat.newFormat(';');
        assertEquals(';', newFmt.getDelimiter());
        assertNull(newFmt.getQuoteCharacter());
        assertNull(newFmt.getCommentMarker());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_lineBreakDelimiter_throwsException() {
        CSVFormat.newFormat('\n');
    }

    // ---------- valueOf ----------

    @Test
    public void testValueOf_default_returnsDefaultFormat() {
        assertEquals(CSVFormat.DEFAULT, CSVFormat.valueOf("Default"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_invalidName_throwsException() {
        CSVFormat.valueOf("NotAFormat");
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
        assertFalse(format.equals("someString"));
    }

    @Test
    public void testEquals_differentDelimiter_returnsFalse() {
        CSVFormat other = format.withDelimiter(';');
        assertFalse(format.equals(other));
    }

    @Test
    public void testEquals_sameSettings_returnsTrue() {
        CSVFormat a = CSVFormat.newFormat(',').withQuote('"');
        CSVFormat b = CSVFormat.newFormat(',').withQuote('"');
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_differentQuoteMode_returnsFalse() {
        CSVFormat a = format.withEscape('\\').withQuoteMode(QuoteMode.ALL);
        CSVFormat b = format.withEscape('\\').withQuoteMode(QuoteMode.MINIMAL);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentQuoteCharacter_returnsFalse() {
        CSVFormat a = format.withQuote('"');
        CSVFormat b = format.withQuote('\'');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_quoteCharacterNullVsSet_returnsFalse() {
        CSVFormat a = format.withEscape('\\').withQuote((Character) null);
        CSVFormat b = format.withQuote('"');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentCommentMarker_returnsFalse() {
        CSVFormat a = format.withCommentMarker('#');
        CSVFormat b = format.withCommentMarker('!');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_commentMarkerNullVsSet_returnsFalse() {
        CSVFormat a = format;
        CSVFormat b = format.withCommentMarker('#');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentEscapeCharacter_returnsFalse() {
        CSVFormat a = format.withEscape('\\');
        CSVFormat b = format.withEscape('/');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_escapeCharacterNullVsSet_returnsFalse() {
        CSVFormat a = format;
        CSVFormat b = format.withEscape('\\');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentNullString_returnsFalse() {
        CSVFormat a = format.withNullString("NULL");
        CSVFormat b = format.withNullString("N/A");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_nullStringNullVsSet_returnsFalse() {
        CSVFormat a = format;
        CSVFormat b = format.withNullString("NULL");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentHeader_returnsFalse() {
        CSVFormat a = format.withHeader("a", "b");
        CSVFormat b = format.withHeader("c", "d");
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
    public void testEquals_recordSeparatorNullVsSet_returnsFalse() {
        CSVFormat a = format.withRecordSeparator((String) null);
        CSVFormat b = format.withRecordSeparator("\n");
        assertFalse(a.equals(b));
    }

    // ---------- format ----------

    @Test
    public void testFormat_typicalValues_returnsFormattedString() {
        String result = CSVFormat.DEFAULT.format("a", "b", "c");
        assertEquals("a,b,c", result);
    }

    @Test
    public void testFormat_emptyValues_returnsEmptyString() {
        String result = CSVFormat.DEFAULT.format();
        assertEquals("", result);
    }

    // ---------- getters ----------

    @Test
    public void testGetAllowMissingColumnNames_default_returnsFalse() {
        assertFalse(CSVFormat.DEFAULT.getAllowMissingColumnNames());
    }

    @Test
    public void testGetCommentMarker_notSet_returnsNull() {
        assertNull(CSVFormat.DEFAULT.getCommentMarker());
    }

    @Test
    public void testGetCommentMarker_set_returnsValue() {
        assertEquals(Character.valueOf('#'), CSVFormat.DEFAULT.withCommentMarker('#').getCommentMarker());
    }

    @Test
    public void testGetDelimiter_default_returnsComma() {
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
    public void testGetHeader_set_returnsCopy() {
        CSVFormat withHeader = CSVFormat.DEFAULT.withHeader("a", "b");
        String[] header = withHeader.getHeader();
        assertArrayEquals(new String[]{"a", "b"}, header);
    }

    @Test
    public void testGetHeaderComments_notSet_returnsNull() {
        assertNull(CSVFormat.DEFAULT.getHeaderComments());
    }

    @Test
    public void testGetHeaderComments_set_returnsCopy() {
        CSVFormat withComments = CSVFormat.DEFAULT.withHeaderComments("comment1", "comment2");
        String[] comments = withComments.getHeaderComments();
        assertArrayEquals(new String[]{"comment1", "comment2"}, comments);
    }

    @Test
    public void testGetIgnoreEmptyLines_default_returnsTrue() {
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
    }

    @Test
    public void testGetIgnoreHeaderCase_default_returnsFalse() {
        assertFalse(CSVFormat.DEFAULT.getIgnoreHeaderCase());
    }

    @Test
    public void testGetIgnoreSurroundingSpaces_default_returnsFalse() {
        assertFalse(CSVFormat.DEFAULT.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testGetNullString_notSet_returnsNull() {
        assertNull(CSVFormat.DEFAULT.getNullString());
    }

    @Test
    public void testGetQuoteCharacter_default_returnsDoubleQuote() {
        assertEquals(Character.valueOf('"'), CSVFormat.DEFAULT.getQuoteCharacter());
    }

    @Test
    public void testGetQuoteMode_notSet_returnsNull() {
        assertNull(CSVFormat.DEFAULT.getQuoteMode());
    }

    @Test
    public void testGetRecordSeparator_default_returnsCRLF() {
        assertEquals("\r\n", CSVFormat.DEFAULT.getRecordSeparator());
    }

    @Test
    public void testGetSkipHeaderRecord_default_returnsFalse() {
        assertFalse(CSVFormat.DEFAULT.getSkipHeaderRecord());
    }

    @Test
    public void testGetTrailingDelimiter_default_returnsFalse() {
        assertFalse(CSVFormat.DEFAULT.getTrailingDelimiter());
    }

    @Test
    public void testGetTrim_default_returnsFalse() {
        assertFalse(CSVFormat.DEFAULT.getTrim());
    }

    @Test
    public void testGetAutoFlush_default_returnsFalse() {
        assertFalse(CSVFormat.DEFAULT.getAutoFlush());
    }

    @Test
    public void testGetAutoFlush_set_returnsTrue() {
        assertTrue(CSVFormat.DEFAULT.withAutoFlush(true).getAutoFlush());
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_sameSettings_sameHashCode() {
        CSVFormat a = CSVFormat.newFormat(',').withQuote('"').withEscape('\\');
        CSVFormat b = CSVFormat.newFormat(',').withQuote('"').withEscape('\\');
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testHashCode_withNullFields_doesNotThrow() {
        CSVFormat f = CSVFormat.newFormat(',').withEscape('\\');
        int hash = f.hashCode();
        assertTrue(hash != 0 || hash == 0); // just ensure no exception
    }

    // ---------- is*Set methods ----------

    @Test
    public void testIsCommentMarkerSet_notSet_returnsFalse() {
        assertFalse(CSVFormat.DEFAULT.isCommentMarkerSet());
    }

    @Test
    public void testIsCommentMarkerSet_set_returnsTrue() {
        assertTrue(CSVFormat.DEFAULT.withCommentMarker('#').isCommentMarkerSet());
    }

    @Test
    public void testIsEscapeCharacterSet_notSet_returnsFalse() {
        assertFalse(CSVFormat.DEFAULT.isEscapeCharacterSet());
    }

    @Test
    public void testIsEscapeCharacterSet_set_returnsTrue() {
        assertTrue(CSVFormat.DEFAULT.withEscape('\\').isEscapeCharacterSet());
    }

    @Test
    public void testIsNullStringSet_notSet_returnsFalse() {
        assertFalse(CSVFormat.DEFAULT.isNullStringSet());
    }

    @Test
    public void testIsNullStringSet_set_returnsTrue() {
        assertTrue(CSVFormat.DEFAULT.withNullString("NULL").isNullStringSet());
    }

    @Test
    public void testIsQuoteCharacterSet_set_returnsTrue() {
        assertTrue(CSVFormat.DEFAULT.isQuoteCharacterSet());
    }

    @Test
    public void testIsQuoteCharacterSet_notSet_returnsFalse() {
        CSVFormat f = CSVFormat.DEFAULT.withEscape('\\').withQuote((Character) null);
        assertFalse(f.isQuoteCharacterSet());
    }

    // ---------- parse ----------

    @Test
    public void testParse_validReader_returnsParser() throws IOException {
        Reader reader = new StringReader("a,b,c\n1,2,3\n");
        CSVParser parser = CSVFormat.DEFAULT.parse(reader);
        assertNotNull(parser);
        parser.close();
    }

    // ---------- print/println/printRecord ----------

    @Test
    public void testPrint_appendable_returnsPrinter() throws IOException {
        StringWriter writer = new StringWriter();
        CSVPrinter printer = CSVFormat.DEFAULT.print(writer);
        assertNotNull(printer);
        printer.close();
    }

    @Test
    public void testPrinter_default_returnsPrinter() throws IOException {
        CSVPrinter printer = CSVFormat.DEFAULT.printer();
        assertNotNull(printer);
        // Do not close to avoid closing System.out
    }

    @Test
    public void testPrintFile_validFileAndCharset_writesData() throws IOException {
        File tempFile = File.createTempFile("csvformattest", ".csv");
        tempFile.deleteOnExit();
        CSVPrinter printer = CSVFormat.DEFAULT.print(tempFile, StandardCharsets.UTF_8);
        printer.printRecord("a", "b");
        printer.close();
        assertTrue(tempFile.exists());
    }

    @Test
    public void testPrintPath_validPathAndCharset_writesData() throws IOException {
        File tempFile = File.createTempFile("csvformattestpath", ".csv");
        tempFile.deleteOnExit();
        Path path = tempFile.toPath();
        CSVPrinter printer = CSVFormat.DEFAULT.print(path, StandardCharsets.UTF_8);
        printer.printRecord("x", "y");
        printer.close();
        assertTrue(tempFile.exists());
    }

    @Test
    public void testPrintObjectAppendableBoolean_typicalValue_appendsValue() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat.DEFAULT.print("hello", writer, true);
        assertEquals("hello", writer.toString());
    }

    @Test
    public void testPrintObjectAppendableBoolean_nullValueWithNullString_appendsNullString() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat fmt = CSVFormat.DEFAULT.withNullString("NULL");
        fmt.print(null, writer, true);
        assertEquals("NULL", writer.toString());
    }

    @Test
    public void testPrintObjectAppendableBoolean_nullValueWithoutNullString_appendsEmpty() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat.DEFAULT.print(null, writer, true);
        assertEquals("", writer.toString());
    }

    @Test
    public void testPrintObjectAppendableBoolean_nullValueWithQuoteModeAll_appendsQuotedNullString() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat fmt = CSVFormat.DEFAULT.withNullString("NULL").withQuoteMode(QuoteMode.ALL);
        fmt.print(null, writer, true);
        assertEquals("\"NULL\"", writer.toString());
    }

    @Test
    public void testPrintObjectAppendableBoolean_notNewRecord_prependsDelimiter() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat.DEFAULT.print("value", writer, false);
        assertEquals(",value", writer.toString());
    }

    @Test
    public void testPrintObjectAppendableBoolean_withTrim_trimsValue() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat fmt = CSVFormat.DEFAULT.withTrim(true);
        fmt.print("  hello  ", writer, true);
        assertEquals("hello", writer.toString());
    }

    @Test
    public void testPrintObjectAppendableBoolean_withEscapeCharacter_escapesSpecialChars() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape('\\').withQuote((Character) null);
        fmt.print("a,b", writer, true);
        assertEquals("a\\,b", writer.toString());
    }

    @Test
    public void testPrintln_withTrailingDelimiterAndRecordSeparator_appendsBoth() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat fmt = CSVFormat.DEFAULT.withTrailingDelimiter(true).withRecordSeparator("\n");
        fmt.println(writer);
        assertEquals(",\n", writer.toString());
    }

    @Test
    public void testPrintln_withoutTrailingDelimiterAndNoRecordSeparator_appendsNothing() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat fmt = CSVFormat.DEFAULT.withTrailingDelimiter(false).withRecordSeparator((String) null);
        fmt.println(writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testPrintRecord_typicalValues_printsRecordWithSeparator() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat fmt = CSVFormat.DEFAULT.withRecordSeparator("\n");
        fmt.printRecord(writer, "a", "b", "c");
        assertEquals("a,b,c\n", writer.toString());
    }

    @Test
    public void testPrintRecord_emptyValues_printsOnlySeparator() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat fmt = CSVFormat.DEFAULT.withRecordSeparator("\n");
        fmt.printRecord(writer);
        assertEquals("\n", writer.toString());
    }

    // ---------- toString ----------

    @Test
    public void testToString_defaultFormat_containsDelimiter() {
        String str = CSVFormat.DEFAULT.toString();
        assertTrue(str.contains("Delimiter=<,>"));
    }

    @Test
    public void testToString_fullyConfiguredFormat_containsAllSections() {
        CSVFormat fmt = CSVFormat.DEFAULT
                .withEscape('\\')
                .withCommentMarker('#')
                .withNullString("NULL")
                .withIgnoreEmptyLines(true)
                .withIgnoreSurroundingSpaces(true)
                .withIgnoreHeaderCase(true)
                .withHeaderComments("comment")
                .withHeader("h1", "h2");
        String str = fmt.toString();
        assertTrue(str.contains("Escape=<\\>"));
        assertTrue(str.contains("CommentStart=<#>"));
        assertTrue(str.contains("NullString=<NULL>"));
        assertTrue(str.contains("EmptyLines:ignored"));
        assertTrue(str.contains("SurroundingSpaces:ignored"));
        assertTrue(str.contains("IgnoreHeaderCase:ignored"));
        assertTrue(str.contains("HeaderComments:"));
        assertTrue(str.contains("Header:"));
    }

    // ---------- with* methods ----------

    @Test
    public void testWithAllowMissingColumnNames_noArg_setsTrue() {
        assertTrue(CSVFormat.DEFAULT.withAllowMissingColumnNames().getAllowMissingColumnNames());
    }

    @Test
    public void testWithAllowMissingColumnNames_booleanArg_setsValue() {
        assertFalse(CSVFormat.DEFAULT.withAllowMissingColumnNames(false).getAllowMissingColumnNames());
    }

    @Test
    public void testWithCommentMarker_charArg_setsMarker() {
        assertEquals(Character.valueOf('#'), CSVFormat.DEFAULT.withCommentMarker('#').getCommentMarker());
    }

    @Test
    public void testWithCommentMarker_characterArgNull_disablesMarker() {
        assertNull(CSVFormat.DEFAULT.withCommentMarker((Character) null).getCommentMarker());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_lineBreakChar_throwsException() {
        CSVFormat.DEFAULT.withCommentMarker('\n');
    }

    @Test
    public void testWithDelimiter_validChar_setsDelimiter() {
        assertEquals(';', CSVFormat.DEFAULT.withDelimiter(';').getDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_lineBreakChar_throwsException() {
        CSVFormat.DEFAULT.withDelimiter('\r');
    }

    @Test
    public void testWithEscape_charArg_setsEscape() {
        assertEquals(Character.valueOf('\\'), CSVFormat.DEFAULT.withEscape('\\').getEscapeCharacter());
    }

    @Test
    public void testWithEscape_characterArgNull_disablesEscape() {
        assertNull(CSVFormat.DEFAULT.withEscape((Character) null).getEscapeCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_lineBreakChar_throwsException() {
        CSVFormat.DEFAULT.withEscape('\n');
    }

    @Test
    public void testWithFirstRecordAsHeader_typical_setsHeaderAndSkip() {
        CSVFormat fmt = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        assertArrayEquals(new String[0], fmt.getHeader());
        assertTrue(fmt.getSkipHeaderRecord());
    }

    private enum SampleHeaderEnum {
        Name, Email, Phone
    }

    @Test
    public void testWithHeaderClass_validEnum_setsHeaderFromEnumNames() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader(SampleHeaderEnum.class);
        assertArrayEquals(new String[]{"Name", "Email", "Phone"}, fmt.getHeader());
    }

    @Test
    public void testWithHeaderClass_nullEnum_setsHeaderNull() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader((Class<? extends Enum<?>>) null);
        assertNull(fmt.getHeader());
    }

    @Test
    public void testWithHeaderResultSet_nullResultSet_setsHeaderNull() throws SQLException {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader((ResultSet) null);
        assertNull(fmt.getHeader());
    }

    @Test
    public void testWithHeaderResultSetMetaData_nullMetaData_setsHeaderNull() throws SQLException {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader((ResultSetMetaData) null);
        assertNull(fmt.getHeader());
    }

    @Test
    public void testWithHeaderStringVarargs_typicalValues_setsHeader() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader("col1", "col2");
        assertArrayEquals(new String[]{"col1", "col2"}, fmt.getHeader());
    }

    @Test
    public void testWithHeaderStringVarargs_noArgs_setsEmptyHeader() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader();
        assertArrayEquals(new String[0], fmt.getHeader());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderStringVarargs_duplicateHeader_throwsException() {
        CSVFormat.DEFAULT.withHeader("col1", "col1");
    }

    @Test
    public void testWithHeaderComments_typicalValues_setsComments() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeaderComments("line1", "line2");
        assertArrayEquals(new String[]{"line1", "line2"}, fmt.getHeaderComments());
    }

    @Test
    public void testWithHeaderComments_nullValues_setsCommentsWithNullEntries() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeaderComments("line1", null);
        assertArrayEquals(new String[]{"line1", null}, fmt.getHeaderComments());
    }

    @Test
    public void testWithIgnoreEmptyLines_noArg_setsTrue() {
        assertTrue(CSVFormat.DEFAULT.withIgnoreEmptyLines().getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreEmptyLines_booleanArg_setsValue() {
        assertFalse(CSVFormat.DEFAULT.withIgnoreEmptyLines(false).getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreHeaderCase_noArg_setsTrue() {
        assertTrue(CSVFormat.DEFAULT.withIgnoreHeaderCase().getIgnoreHeaderCase());
    }

    @Test
    public void testWithIgnoreHeaderCase_booleanArg_setsValue() {
        assertFalse(CSVFormat.DEFAULT.withIgnoreHeaderCase(false).getIgnoreHeaderCase());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces_noArg_setsTrue() {
        assertTrue(CSVFormat.DEFAULT.withIgnoreSurroundingSpaces().getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces_booleanArg_setsValue() {
        assertFalse(CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(false).getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithNullString_typicalValue_setsNullString() {
        assertEquals("N/A", CSVFormat.DEFAULT.withNullString("N/A").getNullString());
    }

    @Test
    public void testWithNullString_nullValue_setsNull() {
        assertNull(CSVFormat.DEFAULT.withNullString(null).getNullString());
    }

    @Test
    public void testWithQuote_charArg_setsQuoteChar() {
        assertEquals(Character.valueOf('\''), CSVFormat.DEFAULT.withQuote('\'').getQuoteCharacter());
    }

    @Test
    public void testWithQuote_characterArgNull_disablesQuote() {
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape('\\').withQuote((Character) null);
        assertNull(fmt.getQuoteCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_lineBreakChar_throwsException() {
        CSVFormat.DEFAULT.withQuote('\n');
    }

    @Test
    public void testWithQuoteMode_typicalValue_setsQuoteMode() {
        assertEquals(QuoteMode.ALL, CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL).getQuoteMode());
    }

    @Test
    public void testWithQuoteMode_nullValue_setsNull() {
        assertNull(CSVFormat.DEFAULT.withQuoteMode(null).getQuoteMode());
    }

    @Test
    public void testWithRecordSeparator_charArg_setsSeparator() {
        assertEquals("\n", CSVFormat.DEFAULT.withRecordSeparator('\n').getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparator_stringArg_setsSeparator() {
        assertEquals("\r\n", CSVFormat.DEFAULT.withRecordSeparator("\r\n").getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparator_nullArg_setsNull() {
        assertNull(CSVFormat.DEFAULT.withRecordSeparator((String) null).getRecordSeparator());
    }

    @Test
    public void testWithSkipHeaderRecord_noArg_setsTrue() {
        assertTrue(CSVFormat.DEFAULT.withSkipHeaderRecord().getSkipHeaderRecord());
    }

    @Test
    public void testWithSkipHeaderRecord_booleanArg_setsValue() {
        assertFalse(CSVFormat.DEFAULT.withSkipHeaderRecord(false).getSkipHeaderRecord());
    }

    @Test
    public void testWithTrailingDelimiter_noArg_setsTrue() {
        assertTrue(CSVFormat.DEFAULT.withTrailingDelimiter().getTrailingDelimiter());
    }

    @Test
    public void testWithTrailingDelimiter_booleanArg_setsValue() {
        assertFalse(CSVFormat.DEFAULT.withTrailingDelimiter(false).getTrailingDelimiter());
    }

    @Test
    public void testWithTrim_noArg_setsTrue() {
        assertTrue(CSVFormat.DEFAULT.withTrim().getTrim());
    }

    @Test
    public void testWithTrim_booleanArg_setsValue() {
        assertFalse(CSVFormat.DEFAULT.withTrim(false).getTrim());
    }

    @Test
    public void testWithAutoFlush_booleanArg_setsValue() {
        assertTrue(CSVFormat.DEFAULT.withAutoFlush(true).getAutoFlush());
        assertFalse(CSVFormat.DEFAULT.withAutoFlush(false).getAutoFlush());
    }

    // ---------- validate() via constructor edge cases ----------

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_quoteCharEqualsDelimiter_throwsException() {
        CSVFormat.newFormat(',').withQuote(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_escapeCharEqualsDelimiter_throwsException() {
        CSVFormat.newFormat(',').withEscape(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_commentMarkerEqualsDelimiter_throwsException() {
        CSVFormat.newFormat(',').withCommentMarker(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_quoteCharEqualsCommentMarker_throwsException() {
        CSVFormat.newFormat(',').withQuote('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_escapeCharEqualsCommentMarker_throwsException() {
        CSVFormat.newFormat(',').withEscape('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_noEscapeWithQuoteModeNone_throwsException() {
        CSVFormat.newFormat(',').withQuoteMode(QuoteMode.NONE);
    }

    @Test
    public void testValidate_escapeSetWithQuoteModeNone_doesNotThrow() {
        CSVFormat fmt = CSVFormat.newFormat(',').withEscape('\\').withQuoteMode(QuoteMode.NONE);
        assertEquals(QuoteMode.NONE, fmt.getQuoteMode());
    }

    // ---------- printAndQuote related edge behaviors through print ----------

    @Test
    public void testPrint_quoteModeNonNumeric_quotesNonNumberValue() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat fmt = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NON_NUMERIC);
        fmt.print("text", writer, true);
        assertEquals("\"text\"", writer.toString());
    }

    @Test
    public void testPrint_quoteModeNonNumeric_doesNotQuoteNumberValue() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat fmt = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NON_NUMERIC);
        fmt.print(Integer.valueOf(42), writer, true);
        assertEquals("42", writer.toString());
    }

    @Test
    public void testPrint_quoteModeMinimalEmptyValueNewRecord_quotesEmptyValue() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat fmt = CSVFormat.DEFAULT;
        fmt.print("", writer, true);
        assertEquals("\"\"", writer.toString());
    }

    @Test
    public void testPrint_quoteModeMinimalContainingQuoteChar_quotesAndDoublesQuote() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat fmt = CSVFormat.DEFAULT;
        fmt.print("a\"b", writer, true);
        assertEquals("\"a\"\"b\"", writer.toString());
    }

    @Test
    public void testPrint_quoteModeMinimalContainingDelimiter_quotesValue() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat fmt = CSVFormat.DEFAULT;
        fmt.print("a,b", writer, true);
        assertEquals("\"a,b\"", writer.toString());
    }

    @Test
    public void testPrint_quoteModeMinimalPlainValue_noQuoting() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat fmt = CSVFormat.DEFAULT;
        fmt.print("plainvalue", writer, true);
        assertEquals("plainvalue", writer.toString());
    }

    @Test
    public void testPrint_quoteModeAll_alwaysQuotes() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat fmt = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        fmt.print("plain", writer, true);
        assertEquals("\"plain\"", writer.toString());
    }

}
