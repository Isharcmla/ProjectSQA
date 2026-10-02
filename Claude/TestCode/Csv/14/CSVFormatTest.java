import org.apache.commons.csv.CSVFormat.Predefined;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class CSVFormatTest {

    private File tempFile;

    @Before
    public void setUp() throws IOException {
        tempFile = File.createTempFile("csvformattest", ".csv");
    }

    @After
    public void tearDown() {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    // ---------- Predefined formats ----------

    @Test
    public void testPredefinedFormats_default_typicalValues() {
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertEquals(Character.valueOf('"'), CSVFormat.DEFAULT.getQuoteCharacter());
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
    }

    @Test
    public void testPredefinedFormats_excel_allowsMissingColumnNames() {
        assertTrue(CSVFormat.EXCEL.getAllowMissingColumnNames());
        assertFalse(CSVFormat.EXCEL.getIgnoreEmptyLines());
    }

    @Test
    public void testPredefinedFormats_informixUnload_hasEscapeAndPipeDelimiter() {
        assertEquals('|', CSVFormat.INFORMIX_UNLOAD.getDelimiter());
        assertTrue(CSVFormat.INFORMIX_UNLOAD.isEscapeCharacterSet());
    }

    @Test
    public void testPredefinedFormats_informixUnloadCsv_hasCommaDelimiter() {
        assertEquals(',', CSVFormat.INFORMIX_UNLOAD_CSV.getDelimiter());
    }

    @Test
    public void testPredefinedFormats_mysql_hasTabDelimiterAndNullString() {
        assertEquals('\t', CSVFormat.MYSQL.getDelimiter());
        assertEquals("\\N", CSVFormat.MYSQL.getNullString());
        assertNull(CSVFormat.MYSQL.getQuoteCharacter());
    }

    @Test
    public void testPredefinedFormats_rfc4180_ignoreEmptyLinesFalse() {
        assertFalse(CSVFormat.RFC4180.getIgnoreEmptyLines());
    }

    @Test
    public void testPredefinedFormats_tdf_hasTabDelimiterAndIgnoreSurroundingSpaces() {
        assertEquals('\t', CSVFormat.TDF.getDelimiter());
        assertTrue(CSVFormat.TDF.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testPredefinedEnum_getFormat_returnsCorrectFormat() {
        assertEquals(CSVFormat.DEFAULT, Predefined.Default.getFormat());
        assertEquals(CSVFormat.EXCEL, Predefined.Excel.getFormat());
        assertEquals(CSVFormat.MYSQL, Predefined.MySQL.getFormat());
        assertEquals(CSVFormat.RFC4180, Predefined.RFC4180.getFormat());
        assertEquals(CSVFormat.TDF, Predefined.TDF.getFormat());
        assertEquals(CSVFormat.INFORMIX_UNLOAD, Predefined.InformixUnload.getFormat());
        assertEquals(CSVFormat.INFORMIX_UNLOAD_CSV, Predefined.InformixUnloadCsv.getFormat());
    }

    // ---------- newFormat & valueOf ----------

    @Test
    public void testNewFormat_validDelimiter_createsFormat() {
        CSVFormat format = CSVFormat.newFormat(';');
        assertEquals(';', format.getDelimiter());
        assertNull(format.getQuoteCharacter());
        assertNull(format.getCommentMarker());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_lineBreakDelimiter_throwsException() {
        CSVFormat.newFormat('\n');
    }

    @Test
    public void testValueOf_default_returnsDefaultFormat() {
        CSVFormat format = CSVFormat.valueOf("Default");
        assertEquals(CSVFormat.DEFAULT, format);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_invalidName_throwsException() {
        CSVFormat.valueOf("NotARealFormat");
    }

    // ---------- equals & hashCode ----------

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
        assertFalse(CSVFormat.DEFAULT.equals("not a format"));
    }

    @Test
    public void testEquals_differentDelimiter_false() {
        CSVFormat f1 = CSVFormat.DEFAULT;
        CSVFormat f2 = CSVFormat.DEFAULT.withDelimiter(';');
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquals_equivalentFormats_true() {
        CSVFormat f1 = CSVFormat.newFormat(',').withQuote('"');
        CSVFormat f2 = CSVFormat.newFormat(',').withQuote('"');
        assertTrue(f1.equals(f2));
    }

    @Test
    public void testEquals_differentQuoteCharacter_false() {
        CSVFormat f1 = CSVFormat.DEFAULT.withQuote('"');
        CSVFormat f2 = CSVFormat.DEFAULT.withQuote('\'');
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquals_differentQuoteMode_false() {
        CSVFormat f1 = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        CSVFormat f2 = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquals_differentCommentMarker_false() {
        CSVFormat f1 = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVFormat f2 = CSVFormat.DEFAULT.withCommentMarker('!');
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquals_differentEscapeCharacter_false() {
        CSVFormat f1 = CSVFormat.DEFAULT.withEscape('\\');
        CSVFormat f2 = CSVFormat.DEFAULT.withEscape('/');
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquals_differentNullString_false() {
        CSVFormat f1 = CSVFormat.DEFAULT.withNullString("NULL");
        CSVFormat f2 = CSVFormat.DEFAULT.withNullString("N/A");
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquals_differentHeader_false() {
        CSVFormat f1 = CSVFormat.DEFAULT.withHeader("a", "b");
        CSVFormat f2 = CSVFormat.DEFAULT.withHeader("c", "d");
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquals_differentIgnoreSurroundingSpaces_false() {
        CSVFormat f1 = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        CSVFormat f2 = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(false);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquals_differentIgnoreEmptyLines_false() {
        CSVFormat f1 = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);
        CSVFormat f2 = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquals_differentSkipHeaderRecord_false() {
        CSVFormat f1 = CSVFormat.DEFAULT.withSkipHeaderRecord(true);
        CSVFormat f2 = CSVFormat.DEFAULT.withSkipHeaderRecord(false);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquals_differentRecordSeparator_false() {
        CSVFormat f1 = CSVFormat.DEFAULT.withRecordSeparator("\n");
        CSVFormat f2 = CSVFormat.DEFAULT.withRecordSeparator("\r\n");
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testHashCode_equalFormats_sameHashCode() {
        CSVFormat f1 = CSVFormat.newFormat(',').withQuote('"');
        CSVFormat f2 = CSVFormat.newFormat(',').withQuote('"');
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testHashCode_withHeaderAndNullFields_doesNotThrow() {
        CSVFormat f = CSVFormat.DEFAULT.withHeader("a", "b");
        f.hashCode();
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

    // ---------- Getters ----------

    @Test
    public void testGetAllowMissingColumnNames_default_false() {
        assertFalse(CSVFormat.DEFAULT.getAllowMissingColumnNames());
    }

    @Test
    public void testGetCommentMarker_notSet_null() {
        assertNull(CSVFormat.DEFAULT.getCommentMarker());
    }

    @Test
    public void testGetCommentMarker_set_returnsValue() {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        assertEquals(Character.valueOf('#'), format.getCommentMarker());
    }

    @Test
    public void testGetDelimiter_default_comma() {
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
    }

    @Test
    public void testGetEscapeCharacter_notSet_null() {
        assertNull(CSVFormat.DEFAULT.getEscapeCharacter());
    }

    @Test
    public void testGetHeader_notSet_null() {
        assertNull(CSVFormat.DEFAULT.getHeader());
    }

    @Test
    public void testGetHeader_set_returnsCopy() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("a", "b");
        String[] header = format.getHeader();
        assertArrayEquals(new String[]{"a", "b"}, header);
        // ensure it's a copy
        header[0] = "modified";
        assertArrayEquals(new String[]{"a", "b"}, format.getHeader());
    }

    @Test
    public void testGetHeaderComments_notSet_null() {
        assertNull(CSVFormat.DEFAULT.getHeaderComments());
    }

    @Test
    public void testGetHeaderComments_set_returnsCopy() {
        CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("comment1", "comment2");
        String[] comments = format.getHeaderComments();
        assertArrayEquals(new String[]{"comment1", "comment2"}, comments);
    }

    @Test
    public void testGetIgnoreEmptyLines_default_true() {
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
    }

    @Test
    public void testGetIgnoreHeaderCase_default_false() {
        assertFalse(CSVFormat.DEFAULT.getIgnoreHeaderCase());
    }

    @Test
    public void testGetIgnoreSurroundingSpaces_default_false() {
        assertFalse(CSVFormat.DEFAULT.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testGetNullString_notSet_null() {
        assertNull(CSVFormat.DEFAULT.getNullString());
    }

    @Test
    public void testGetQuoteCharacter_default_doubleQuote() {
        assertEquals(Character.valueOf('"'), CSVFormat.DEFAULT.getQuoteCharacter());
    }

    @Test
    public void testGetQuoteMode_notSet_null() {
        assertNull(CSVFormat.DEFAULT.getQuoteMode());
    }

    @Test
    public void testGetQuoteMode_set_returnsValue() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        assertEquals(QuoteMode.ALL, format.getQuoteMode());
    }

    @Test
    public void testGetRecordSeparator_default_crlf() {
        assertEquals("\r\n", CSVFormat.DEFAULT.getRecordSeparator());
    }

    @Test
    public void testGetSkipHeaderRecord_default_false() {
        assertFalse(CSVFormat.DEFAULT.getSkipHeaderRecord());
    }

    @Test
    public void testGetTrailingDelimiter_default_false() {
        assertFalse(CSVFormat.DEFAULT.getTrailingDelimiter());
    }

    @Test
    public void testGetTrim_default_false() {
        assertFalse(CSVFormat.DEFAULT.getTrim());
    }

    // ---------- is*Set ----------

    @Test
    public void testIsCommentMarkerSet_notSet_false() {
        assertFalse(CSVFormat.DEFAULT.isCommentMarkerSet());
    }

    @Test
    public void testIsCommentMarkerSet_set_true() {
        assertTrue(CSVFormat.DEFAULT.withCommentMarker('#').isCommentMarkerSet());
    }

    @Test
    public void testIsEscapeCharacterSet_notSet_false() {
        assertFalse(CSVFormat.DEFAULT.isEscapeCharacterSet());
    }

    @Test
    public void testIsEscapeCharacterSet_set_true() {
        assertTrue(CSVFormat.DEFAULT.withEscape('\\').isEscapeCharacterSet());
    }

    @Test
    public void testIsNullStringSet_notSet_false() {
        assertFalse(CSVFormat.DEFAULT.isNullStringSet());
    }

    @Test
    public void testIsNullStringSet_set_true() {
        assertTrue(CSVFormat.DEFAULT.withNullString("NULL").isNullStringSet());
    }

    @Test
    public void testIsQuoteCharacterSet_set_true() {
        assertTrue(CSVFormat.DEFAULT.isQuoteCharacterSet());
    }

    @Test
    public void testIsQuoteCharacterSet_notSet_false() {
        assertFalse(CSVFormat.DEFAULT.withQuote((Character) null).isQuoteCharacterSet());
    }

    // ---------- parse ----------

    @Test
    public void testParse_validReader_returnsParser() throws IOException {
        CSVParser parser = CSVFormat.DEFAULT.parse(new StringReader("a,b,c\n1,2,3\n"));
        assertNotNull(parser);
        parser.close();
    }

    // ---------- print ----------

    @Test
    public void testPrint_appendable_returnsPrinter() throws IOException {
        StringWriter writer = new StringWriter();
        CSVPrinter printer = CSVFormat.DEFAULT.print(writer);
        assertNotNull(printer);
        printer.close();
    }

    @Test
    public void testPrint_fileAndCharset_returnsPrinter() throws IOException {
        CSVPrinter printer = CSVFormat.DEFAULT.print(tempFile, StandardCharsets.UTF_8);
        assertNotNull(printer);
        printer.close();
    }

    @Test
    public void testPrint_pathAndCharset_returnsPrinter() throws IOException {
        Path path = tempFile.toPath();
        CSVPrinter printer = CSVFormat.DEFAULT.print(path, StandardCharsets.UTF_8);
        assertNotNull(printer);
        printer.close();
    }

    @Test
    public void testPrint_objectAppendableNewRecord_writesValue() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat.DEFAULT.print("value", writer, true);
        assertEquals("value", writer.toString());
    }

    @Test
    public void testPrint_objectAppendableNotNewRecord_prependsDelimiter() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat.DEFAULT.print("value", writer, false);
        assertEquals(",value", writer.toString());
    }

    @Test
    public void testPrint_nullValue_writesEmptyString() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat.DEFAULT.print(null, writer, true);
        assertEquals("", writer.toString());
    }

    @Test
    public void testPrint_nullValueWithNullString_writesNullString() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        format.print(null, writer, true);
        assertEquals("NULL", writer.toString());
    }

    @Test
    public void testPrint_valueNeedingQuoting_isQuoted() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat.DEFAULT.print("a,b", writer, true);
        assertEquals("\"a,b\"", writer.toString());
    }

    @Test
    public void testPrint_valueWithEscapeCharacterNoQuote_isEscaped() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuote((Character) null).withEscape('\\');
        format.print("a,b", writer, true);
        assertEquals("a\\,b", writer.toString());
    }

    @Test
    public void testPrint_trimEnabled_trimsValue() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withTrim(true);
        format.print("  value  ", writer, true);
        assertEquals("value", writer.toString());
    }

    @Test
    public void testPrint_quoteModeAll_alwaysQuotes() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        format.print("simple", writer, true);
        assertEquals("\"simple\"", writer.toString());
    }

    @Test
    public void testPrint_quoteModeNonNumericWithNumber_doesNotQuote() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NON_NUMERIC);
        format.print(Integer.valueOf(123), writer, true);
        assertEquals("123", writer.toString());
    }

    @Test
    public void testPrint_quoteModeNonNumericWithString_quotes() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NON_NUMERIC);
        format.print("text", writer, true);
        assertEquals("\"text\"", writer.toString());
    }

    @Test
    public void testPrint_quoteModeNone_usesEscaping() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\').withQuoteMode(QuoteMode.NONE);
        format.print("a,b", writer, true);
        assertEquals("a\\,b", writer.toString());
    }

    @Test
    public void testPrint_emptyValueNewRecordMinimal_quotesEmptyString() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat.DEFAULT.print("", writer, true);
        assertEquals("\"\"", writer.toString());
    }

    @Test
    public void testPrint_emptyValueNotNewRecordMinimal_doesNotQuote() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat.DEFAULT.print("", writer, false);
        assertEquals(",", writer.toString());
    }

    @Test
    public void testPrint_valueContainingQuoteCharacter_escapesQuote() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat.DEFAULT.print("a\"b", writer, true);
        assertEquals("\"a\"\"b\"", writer.toString());
    }

    @Test
    public void testPrint_valueEndingWithSpace_getsQuoted() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat.DEFAULT.print("value ", writer, true);
        assertEquals("\"value \"", writer.toString());
    }

    @Test
    public void testPrint_valueStartingWithSpecialChar_getsQuoted() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat.DEFAULT.print("!value", writer, true);
        assertEquals("\"!value\"", writer.toString());
    }

    // ---------- println ----------

    @Test
    public void testPrintln_withRecordSeparator_appendsSeparator() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat.DEFAULT.println(writer);
        assertEquals("\r\n", writer.toString());
    }

    @Test
    public void testPrintln_withTrailingDelimiter_appendsDelimiterThenSeparator() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter(true);
        format.println(writer);
        assertEquals(",\r\n", writer.toString());
    }

    @Test
    public void testPrintln_noRecordSeparator_writesNothing() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator((String) null);
        format.println(writer);
        assertEquals("", writer.toString());
    }

    // ---------- printRecord ----------

    @Test
    public void testPrintRecord_typicalValues_writesRecord() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat.DEFAULT.printRecord(writer, "a", "b", "c");
        assertEquals("a,b,c\r\n", writer.toString());
    }

    @Test
    public void testPrintRecord_emptyValues_writesOnlySeparator() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat.DEFAULT.printRecord(writer);
        assertEquals("\r\n", writer.toString());
    }

    // ---------- toString ----------

    @Test
    public void testToString_default_containsDelimiter() {
        String result = CSVFormat.DEFAULT.toString();
        assertTrue(result.contains("Delimiter=<,>"));
    }

    @Test
    public void testToString_withAllOptionsSet_containsAllFields() {
        CSVFormat format = CSVFormat.DEFAULT
                .withEscape('\\')
                .withCommentMarker('#')
                .withNullString("NULL")
                .withIgnoreEmptyLines(true)
                .withIgnoreSurroundingSpaces(true)
                .withIgnoreHeaderCase(true)
                .withHeaderComments("comment")
                .withHeader("col1");
        String result = format.toString();
        assertTrue(result.contains("Escape=<\\>"));
        assertTrue(result.contains("QuoteChar=<\">"));
        assertTrue(result.contains("CommentStart=<#>"));
        assertTrue(result.contains("NullString=<NULL>"));
        assertTrue(result.contains("RecordSeparator=<"));
        assertTrue(result.contains("EmptyLines:ignored"));
        assertTrue(result.contains("SurroundingSpaces:ignored"));
        assertTrue(result.contains("IgnoreHeaderCase:ignored"));
        assertTrue(result.contains("SkipHeaderRecord:"));
        assertTrue(result.contains("HeaderComments:"));
        assertTrue(result.contains("Header:"));
    }

    // ---------- with methods: allowMissingColumnNames ----------

    @Test
    public void testWithAllowMissingColumnNames_noArg_setsTrue() {
        CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames();
        assertTrue(format.getAllowMissingColumnNames());
    }

    @Test
    public void testWithAllowMissingColumnNames_false_setsFalse() {
        CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(false);
        assertFalse(format.getAllowMissingColumnNames());
    }

    // ---------- with methods: commentMarker ----------

    @Test
    public void testWithCommentMarker_char_setsMarker() {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        assertEquals(Character.valueOf('#'), format.getCommentMarker());
    }

    @Test
    public void testWithCommentMarker_characterNull_disablesMarker() {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker((Character) null);
        assertNull(format.getCommentMarker());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_lineBreak_throwsException() {
        CSVFormat.DEFAULT.withCommentMarker('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_sameAsDelimiter_throwsExceptionOnValidate() {
        CSVFormat.DEFAULT.withCommentMarker(',');
    }

    // ---------- with methods: delimiter ----------

    @Test
    public void testWithDelimiter_validChar_setsDelimiter() {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
        assertEquals(';', format.getDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_lineBreak_throwsException() {
        CSVFormat.DEFAULT.withDelimiter('\r');
    }

    // ---------- with methods: escape ----------

    @Test
    public void testWithEscape_char_setsEscapeCharacter() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        assertEquals(Character.valueOf('\\'), format.getEscapeCharacter());
    }

    @Test
    public void testWithEscape_characterNull_disablesEscape() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape((Character) null);
        assertNull(format.getEscapeCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_lineBreak_throwsException() {
        CSVFormat.DEFAULT.withEscape('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_sameAsDelimiter_throwsExceptionOnValidate() {
        CSVFormat.DEFAULT.withEscape(',');
    }

    // ---------- with methods: header ----------

    @Test
    public void testWithFirstRecordAsHeader_setsHeaderAndSkip() {
        CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        assertNotNull(format.getHeader());
        assertEquals(0, format.getHeader().length);
        assertTrue(format.getSkipHeaderRecord());
    }

    private enum TestHeaderEnum {
        Name, Email, Phone
    }

    @Test
    public void testWithHeader_enumClass_setsHeaderFromEnumNames() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader(TestHeaderEnum.class);
        assertArrayEquals(new String[]{"Name", "Email", "Phone"}, format.getHeader());
    }

    @Test
    public void testWithHeader_enumClassNull_disablesHeader() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader((Class<? extends Enum<?>>) null);
        assertNull(format.getHeader());
    }

    @Test
    public void testWithHeader_stringVarargs_setsHeader() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("col1", "col2");
        assertArrayEquals(new String[]{"col1", "col2"}, format.getHeader());
    }

    @Test
    public void testWithHeader_noArgs_setsEmptyHeader() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        assertNotNull(format.getHeader());
        assertEquals(0, format.getHeader().length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_duplicateEntries_throwsException() {
        CSVFormat.DEFAULT.withHeader("col1", "col1");
    }

    @Test
    public void testWithHeaderComments_objectVarargs_setsComments() {
        CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("line1", 123, null);
        String[] comments = format.getHeaderComments();
        assertEquals("line1", comments[0]);
        assertEquals("123", comments[1]);
        assertNull(comments[2]);
    }

    @Test
    public void testWithHeaderComments_nullArray_setsNull() {
        CSVFormat format = CSVFormat.DEFAULT.withHeaderComments((Object[]) null);
        assertNull(format.getHeaderComments());
    }

    // Fake minimal ResultSetMetaData/ResultSet based tests are skipped since mocking is not allowed
    // and no real DB dependency is available. These methods (withHeader(ResultSet),
    // withHeader(ResultSetMetaData)) require a real JDBC connection which is not provided.

    // ---------- with methods: ignoreEmptyLines ----------

    @Test
    public void testWithIgnoreEmptyLines_noArg_setsTrue() {
        CSVFormat format = CSVFormat.RFC4180.withIgnoreEmptyLines();
        assertTrue(format.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreEmptyLines_false_setsFalse() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        assertFalse(format.getIgnoreEmptyLines());
    }

    // ---------- with methods: ignoreHeaderCase ----------

    @Test
    public void testWithIgnoreHeaderCase_noArg_setsTrue() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase();
        assertTrue(format.getIgnoreHeaderCase());
    }

    @Test
    public void testWithIgnoreHeaderCase_false_setsFalse() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase(false);
        assertFalse(format.getIgnoreHeaderCase());
    }

    // ---------- with methods: ignoreSurroundingSpaces ----------

    @Test
    public void testWithIgnoreSurroundingSpaces_noArg_setsTrue() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();
        assertTrue(format.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces_false_setsFalse() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(false);
        assertFalse(format.getIgnoreSurroundingSpaces());
    }

    // ---------- with methods: nullString ----------

    @Test
    public void testWithNullString_typicalValue_setsNullString() {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("N/A");
        assertEquals("N/A", format.getNullString());
    }

    @Test
    public void testWithNullString_emptyString_setsEmptyNullString() {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("");
        assertEquals("", format.getNullString());
    }

    // ---------- with methods: quote ----------

    @Test
    public void testWithQuote_char_setsQuoteCharacter() {
        CSVFormat format = CSVFormat.DEFAULT.withQuote('\'');
        assertEquals(Character.valueOf('\''), format.getQuoteCharacter());
    }

    @Test
    public void testWithQuote_characterNull_disablesQuoting() {
        CSVFormat format = CSVFormat.DEFAULT.withQuote((Character) null);
        assertNull(format.getQuoteCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_lineBreak_throwsException() {
        CSVFormat.DEFAULT.withQuote('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_sameAsDelimiter_throwsExceptionOnValidate() {
        CSVFormat.DEFAULT.withQuote(',');
    }

    // ---------- with methods: quoteMode ----------

    @Test
    public void testWithQuoteMode_all_setsQuoteMode() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        assertEquals(QuoteMode.ALL, format.getQuoteMode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_noneWithoutEscape_throwsExceptionOnValidate() {
        CSVFormat.DEFAULT.withEscape((Character) null).withQuoteMode(QuoteMode.NONE);
    }

    @Test
    public void testWithQuoteMode_noneWithEscape_doesNotThrow() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\').withQuoteMode(QuoteMode.NONE);
        assertEquals(QuoteMode.NONE, format.getQuoteMode());
    }

    // ---------- with methods: recordSeparator ----------

    @Test
    public void testWithRecordSeparator_char_setsSeparator() {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator('\n');
        assertEquals("\n", format.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparator_string_setsSeparator() {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\r\n");
        assertEquals("\r\n", format.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparator_null_setsNull() {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator((String) null);
        assertNull(format.getRecordSeparator());
    }

    // ---------- with methods: skipHeaderRecord ----------

    @Test
    public void testWithSkipHeaderRecord_noArg_setsTrue() {
        CSVFormat format = CSVFormat.DEFAULT.withSkipHeaderRecord();
        assertTrue(format.getSkipHeaderRecord());
    }

    @Test
    public void testWithSkipHeaderRecord_false_setsFalse() {
        CSVFormat format = CSVFormat.DEFAULT.withSkipHeaderRecord(false);
        assertFalse(format.getSkipHeaderRecord());
    }

    // ---------- with methods: trailingDelimiter ----------

    @Test
    public void testWithTrailingDelimiter_noArg_setsTrue() {
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();
        assertTrue(format.getTrailingDelimiter());
    }

    @Test
    public void testWithTrailingDelimiter_false_setsFalse() {
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter(false);
        assertFalse(format.getTrailingDelimiter());
    }

    // ---------- with methods: trim ----------

    @Test
    public void testWithTrim_noArg_setsTrue() {
        CSVFormat format = CSVFormat.DEFAULT.withTrim();
        assertTrue(format.getTrim());
    }

    @Test
    public void testWithTrim_false_setsFalse() {
        CSVFormat format = CSVFormat.DEFAULT.withTrim(false);
        assertFalse(format.getTrim());
    }

    // ---------- validate exceptions via constructor paths ----------

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_quoteCharacterEqualsCommentMarker_throwsException() {
        CSVFormat.DEFAULT.withCommentMarker('!').withQuote('!');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_escapeCharacterEqualsCommentMarker_throwsException() {
        CSVFormat.DEFAULT.withCommentMarker('!').withEscape('!');
    }
}
