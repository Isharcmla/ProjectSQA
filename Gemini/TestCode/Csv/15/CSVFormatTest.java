package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;

import org.junit.Test;

public class CSVFormatTest {

    private enum TestEnumHeader {
        NAME, EMAIL, AGE
    }

    private enum EmptyEnumHeader {
    }

    @Test
    public void testPredefinedFormats() {
        for (final CSVFormat.Predefined predefined : CSVFormat.Predefined.values()) {
            assertNotNull(predefined.getFormat());
            assertEquals(predefined.getFormat(), CSVFormat.valueOf(predefined.name()));
        }
        assertEquals(CSVFormat.DEFAULT, CSVFormat.Predefined.Default.getFormat());
        assertEquals(CSVFormat.EXCEL, CSVFormat.Predefined.Excel.getFormat());
        assertEquals(CSVFormat.INFORMIX_UNLOAD, CSVFormat.Predefined.InformixUnload.getFormat());
        assertEquals(CSVFormat.INFORMIX_UNLOAD_CSV, CSVFormat.Predefined.InformixUnloadCsv.getFormat());
        assertEquals(CSVFormat.MYSQL, CSVFormat.Predefined.MySQL.getFormat());
        assertEquals(CSVFormat.POSTGRESQL_CSV, CSVFormat.Predefined.PostgreSQLCsv.getFormat());
        assertEquals(CSVFormat.POSTGRESQL_TEXT, CSVFormat.Predefined.PostgreSQLText.getFormat());
        assertEquals(CSVFormat.RFC4180, CSVFormat.Predefined.RFC4180.getFormat());
        assertEquals(CSVFormat.TDF, CSVFormat.Predefined.TDF.getFormat());
    }

    @Test
    public void testNewFormat_validDelimiter_createsFormat() {
        final CSVFormat format = CSVFormat.newFormat(';');
        assertEquals(';', format.getDelimiter());
        assertNull(format.getQuoteCharacter());
        assertNull(format.getCommentMarker());
        assertNull(format.getEscapeCharacter());
        assertNull(format.getRecordSeparator());
        assertNull(format.getNullString());
        assertNull(format.getHeader());
        assertNull(format.getHeaderComments());
        assertNull(format.getQuoteMode());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertFalse(format.getIgnoreEmptyLines());
        assertFalse(format.getSkipHeaderRecord());
        assertFalse(format.getAllowMissingColumnNames());
        assertFalse(format.getIgnoreHeaderCase());
        assertFalse(format.getTrim());
        assertFalse(format.getTrailingDelimiter());
        assertFalse(format.getAutoFlush());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_delimiterLF_throwsException() {
        CSVFormat.newFormat('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_delimiterCR_throwsException() {
        CSVFormat.newFormat('\r');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_lineBreak_throwsException() {
        CSVFormat.DEFAULT.withDelimiter('\n');
    }

    @Test
    public void testWithDelimiter_validChar_success() {
        final CSVFormat format = CSVFormat.DEFAULT.withDelimiter('|');
        assertEquals('|', format.getDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_lineBreakChar_throwsException() {
        CSVFormat.DEFAULT.withQuote('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_lineBreakCharacter_throwsException() {
        CSVFormat.DEFAULT.withQuote(Character.valueOf('\r'));
    }

    @Test
    public void testWithQuote_validQuote_success() {
        final CSVFormat format1 = CSVFormat.DEFAULT.withQuote('\'');
        assertEquals(Character.valueOf('\''), format1.getQuoteCharacter());
        assertTrue(format1.isQuoteCharacterSet());

        final CSVFormat format2 = CSVFormat.DEFAULT.withQuote(Character.valueOf('~'));
        assertEquals(Character.valueOf('~'), format2.getQuoteCharacter());

        final CSVFormat format3 = CSVFormat.DEFAULT.withQuote((Character) null);
        assertNull(format3.getQuoteCharacter());
        assertFalse(format3.isQuoteCharacterSet());
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
    public void testWithCommentMarker_validMarker_success() {
        final CSVFormat format1 = CSVFormat.DEFAULT.withCommentMarker('#');
        assertEquals(Character.valueOf('#'), format1.getCommentMarker());
        assertTrue(format1.isCommentMarkerSet());

        final CSVFormat format2 = CSVFormat.DEFAULT.withCommentMarker(Character.valueOf('/'));
        assertEquals(Character.valueOf('/'), format2.getCommentMarker());

        final CSVFormat format3 = CSVFormat.DEFAULT.withCommentMarker((Character) null);
        assertNull(format3.getCommentMarker());
        assertFalse(format3.isCommentMarkerSet());
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
    public void testWithEscape_validEscape_success() {
        final CSVFormat format1 = CSVFormat.DEFAULT.withEscape('\\');
        assertEquals(Character.valueOf('\\'), format1.getEscapeCharacter());
        assertTrue(format1.isEscapeCharacterSet());

        final CSVFormat format2 = CSVFormat.DEFAULT.withEscape(Character.valueOf('^'));
        assertEquals(Character.valueOf('^'), format2.getEscapeCharacter());

        final CSVFormat format3 = CSVFormat.DEFAULT.withEscape((Character) null);
        assertNull(format3.getEscapeCharacter());
        assertFalse(format3.isEscapeCharacterSet());
    }

    @Test
    public void testWithHeader_strings_success() {
        final CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B", "C");
        assertArrayEquals(new String[]{"A", "B", "C"}, format.getHeader());

        final CSVFormat formatEmpty = CSVFormat.DEFAULT.withHeader(new String[0]);
        assertArrayEquals(new String[0], formatEmpty.getHeader());

        final CSVFormat formatNull = CSVFormat.DEFAULT.withHeader((String[]) null);
        assertNull(formatNull.getHeader());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_duplicateHeader_throwsException() {
        CSVFormat.DEFAULT.withHeader("A", "B", "A");
    }

    @Test
    public void testWithHeader_enum_success() {
        final CSVFormat format = CSVFormat.DEFAULT.withHeader(TestEnumHeader.class);
        assertArrayEquals(new String[]{"NAME", "EMAIL", "AGE"}, format.getHeader());

        final CSVFormat formatEmptyEnum = CSVFormat.DEFAULT.withHeader(EmptyEnumHeader.class);
        assertArrayEquals(new String[0], formatEmptyEnum.getHeader());

        final CSVFormat formatNullEnum = CSVFormat.DEFAULT.withHeader((Class<? extends Enum<?>>) null);
        assertNull(formatNullEnum.getHeader());
    }

    @Test
    public void testWithHeader_resultSetAndMetaData_success() throws SQLException {
        final ResultSetMetaData metaData = (ResultSetMetaData) Proxy.newProxyInstance(
                CSVFormatTest.class.getClassLoader(),
                new Class<?>[]{ResultSetMetaData.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(final Object proxy, final Method method, final Object[] args) {
                        if ("getColumnCount".equals(method.getName())) {
                            return 3;
                        }
                        if ("getColumnLabel".equals(method.getName())) {
                            return "COL_" + args[0];
                        }
                        return null;
                    }
                });

        final ResultSet resultSet = (ResultSet) Proxy.newProxyInstance(
                CSVFormatTest.class.getClassLoader(),
                new Class<?>[]{ResultSet.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(final Object proxy, final Method method, final Object[] args) {
                        if ("getMetaData".equals(method.getName())) {
                            return metaData;
                        }
                        return null;
                    }
                });

        final CSVFormat formatMeta = CSVFormat.DEFAULT.withHeader(metaData);
        assertArrayEquals(new String[]{"COL_1", "COL_2", "COL_3"}, formatMeta.getHeader());

        final CSVFormat formatRS = CSVFormat.DEFAULT.withHeader(resultSet);
        assertArrayEquals(new String[]{"COL_1", "COL_2", "COL_3"}, formatRS.getHeader());

        final CSVFormat formatNullMeta = CSVFormat.DEFAULT.withHeader((ResultSetMetaData) null);
        assertNull(formatNullMeta.getHeader());

        final CSVFormat formatNullRS = CSVFormat.DEFAULT.withHeader((ResultSet) null);
        assertNull(formatNullRS.getHeader());
    }

    @Test
    public void testWithFirstRecordAsHeader() {
        final CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        assertArrayEquals(new String[0], format.getHeader());
        assertTrue(format.getSkipHeaderRecord());
    }

    @Test
    public void testWithHeaderComments() {
        final CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("Comment 1", 123, null);
        assertArrayEquals(new String[]{"Comment 1", "123", null}, format.getHeaderComments());

        final CSVFormat nullComments = CSVFormat.DEFAULT.withHeaderComments((Object[]) null);
        assertNull(nullComments.getHeaderComments());
    }

    @Test
    public void testWithBooleansAndGetters() {
        final CSVFormat format = CSVFormat.DEFAULT
                .withAllowMissingColumnNames(true)
                .withIgnoreEmptyLines(true)
                .withIgnoreHeaderCase(true)
                .withIgnoreSurroundingSpaces(true)
                .withSkipHeaderRecord(true)
                .withTrailingDelimiter(true)
                .withTrim(true)
                .withAutoFlush(true);

        assertTrue(format.getAllowMissingColumnNames());
        assertTrue(format.getIgnoreEmptyLines());
        assertTrue(format.getIgnoreHeaderCase());
        assertTrue(format.getIgnoreSurroundingSpaces());
        assertTrue(format.getSkipHeaderRecord());
        assertTrue(format.getTrailingDelimiter());
        assertTrue(format.getTrim());
        assertTrue(format.getAutoFlush());

        final CSVFormat noArgFormat = CSVFormat.DEFAULT
                .withAllowMissingColumnNames()
                .withIgnoreEmptyLines()
                .withIgnoreHeaderCase()
                .withIgnoreSurroundingSpaces()
                .withSkipHeaderRecord()
                .withTrailingDelimiter()
                .withTrim();

        assertTrue(noArgFormat.getAllowMissingColumnNames());
        assertTrue(noArgFormat.getIgnoreEmptyLines());
        assertTrue(noArgFormat.getIgnoreHeaderCase());
        assertTrue(noArgFormat.getIgnoreSurroundingSpaces());
        assertTrue(noArgFormat.getSkipHeaderRecord());
        assertTrue(noArgFormat.getTrailingDelimiter());
        assertTrue(noArgFormat.getTrim());

        final CSVFormat formatFalse = format
                .withAllowMissingColumnNames(false)
                .withIgnoreEmptyLines(false)
                .withIgnoreHeaderCase(false)
                .withIgnoreSurroundingSpaces(false)
                .withSkipHeaderRecord(false)
                .withTrailingDelimiter(false)
                .withTrim(false)
                .withAutoFlush(false);

        assertFalse(formatFalse.getAllowMissingColumnNames());
        assertFalse(formatFalse.getIgnoreEmptyLines());
        assertFalse(formatFalse.getIgnoreHeaderCase());
        assertFalse(formatFalse.getIgnoreSurroundingSpaces());
        assertFalse(formatFalse.getSkipHeaderRecord());
        assertFalse(formatFalse.getTrailingDelimiter());
        assertFalse(formatFalse.getTrim());
        assertFalse(formatFalse.getAutoFlush());
    }

    @Test
    public void testWithNullString() {
        final CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        assertEquals("NULL", format.getNullString());
        assertTrue(format.isNullStringSet());

        final CSVFormat formatNull = CSVFormat.DEFAULT.withNullString(null);
        assertNull(formatNull.getNullString());
        assertFalse(formatNull.isNullStringSet());
    }

    @Test
    public void testWithQuoteMode() {
        final CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        assertEquals(QuoteMode.ALL, format.getQuoteMode());
    }

    @Test
    public void testWithRecordSeparator() {
        final CSVFormat formatChar = CSVFormat.DEFAULT.withRecordSeparator('\n');
        assertEquals("\n", formatChar.getRecordSeparator());

        final CSVFormat formatStr = CSVFormat.DEFAULT.withRecordSeparator("\r\n");
        assertEquals("\r\n", formatStr.getRecordSeparator());

        final CSVFormat formatNull = CSVFormat.DEFAULT.withRecordSeparator((String) null);
        assertNull(formatNull.getRecordSeparator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_delimiterSameAsQuote_throwsException() {
        CSVFormat.DEFAULT.withQuote(',').withDelimiter(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_delimiterSameAsEscape_throwsException() {
        CSVFormat.DEFAULT.withEscape(',').withDelimiter(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_delimiterSameAsComment_throwsException() {
        CSVFormat.DEFAULT.withCommentMarker(',').withDelimiter(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_quoteSameAsComment_throwsException() {
        CSVFormat.DEFAULT.withQuote('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_escapeSameAsComment_throwsException() {
        CSVFormat.DEFAULT.withEscape('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_noQuoteModeWithoutEscape_throwsException() {
        CSVFormat.DEFAULT.withQuote(null).withQuoteMode(QuoteMode.NONE).withEscape((Character) null);
    }

    @Test
    public void testEqualsAndHashCode() {
        final CSVFormat f1 = CSVFormat.DEFAULT.withHeader("A", "B").withNullString("N/A").withCommentMarker('#').withEscape('\\');
        final CSVFormat f2 = CSVFormat.DEFAULT.withHeader("A", "B").withNullString("N/A").withCommentMarker('#').withEscape('\\');

        assertEquals(f1, f1);
        assertEquals(f1, f2);
        assertEquals(f1.hashCode(), f2.hashCode());
        assertNotEquals(f1, null);
        assertNotEquals(f1, "otherObject");

        assertNotEquals(f1, f1.withDelimiter(';'));
        assertNotEquals(f1, f1.withQuoteMode(QuoteMode.ALL));
        assertNotEquals(f1, f1.withQuote('\''));
        assertNotEquals(CSVFormat.DEFAULT.withQuote(null), CSVFormat.DEFAULT.withQuote('"'));
        assertNotEquals(f1, f1.withCommentMarker('/'));
        assertNotEquals(CSVFormat.DEFAULT.withCommentMarker(null), CSVFormat.DEFAULT.withCommentMarker('#'));
        assertNotEquals(f1, f1.withEscape('!'));
        assertNotEquals(CSVFormat.DEFAULT.withEscape(null), CSVFormat.DEFAULT.withEscape('\\'));
        assertNotEquals(f1, f1.withNullString("NULL"));
        assertNotEquals(CSVFormat.DEFAULT.withNullString(null), CSVFormat.DEFAULT.withNullString("N"));
        assertNotEquals(f1, f1.withHeader("X", "Y"));
        assertNotEquals(f1, f1.withIgnoreSurroundingSpaces(!f1.getIgnoreSurroundingSpaces()));
        assertNotEquals(f1, f1.withIgnoreEmptyLines(!f1.getIgnoreEmptyLines()));
        assertNotEquals(f1, f1.withSkipHeaderRecord(!f1.getSkipHeaderRecord()));
        assertNotEquals(f1, f1.withRecordSeparator("\n"));
        assertNotEquals(CSVFormat.DEFAULT.withRecordSeparator(null), CSVFormat.DEFAULT.withRecordSeparator("\n"));
    }

    @Test
    public void testToString() {
        final String defaultString = CSVFormat.DEFAULT.toString();
        assertTrue(defaultString.contains("Delimiter=<,>"));
        assertTrue(defaultString.contains("QuoteChar=<\">"));
        assertTrue(defaultString.contains("RecordSeparator=<\r\n>"));
        assertTrue(defaultString.contains("EmptyLines:ignored"));

        final CSVFormat fullFormat = CSVFormat.DEFAULT
                .withEscape('\\')
                .withCommentMarker('#')
                .withNullString("NULL")
                .withIgnoreSurroundingSpaces(true)
                .withIgnoreHeaderCase(true)
                .withSkipHeaderRecord(true)
                .withHeaderComments("HeaderComment1")
                .withHeader("C1", "C2");

        final String fullString = fullFormat.toString();
        assertTrue(fullString.contains("Escape=<\\>"));
        assertTrue(fullString.contains("CommentStart=<#>"));
        assertTrue(fullString.contains("NullString=<NULL>"));
        assertTrue(fullString.contains("SurroundingSpaces:ignored"));
        assertTrue(fullString.contains("IgnoreHeaderCase:ignored"));
        assertTrue(fullString.contains("SkipHeaderRecord:true"));
        assertTrue(fullString.contains("HeaderComments:[HeaderComment1]"));
        assertTrue(fullString.contains("Header:[C1, C2]"));
    }

    @Test
    public void testFormat() {
        final String result = CSVFormat.DEFAULT.format("a", "b", "c");
        assertEquals("a,b,c", result);

        final String resultWithQuotes = CSVFormat.DEFAULT.format("a,1", "b\n2", "c\"3");
        assertEquals("\"a,1\",\"b\n2\",\"c\"\"3\"", resultWithQuotes);
    }

    @Test
    public void testPrintlnAndPrintRecord() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter(true).withRecordSeparator("\n");
        format.println(sw);
        assertEquals(",\n", sw.toString());

        final StringWriter sw2 = new StringWriter();
        format.printRecord(sw2, "val1", "val2");
        assertEquals("val1,val2,\n", sw2.toString());
    }

    @Test
    public void testPrint_nullValues() throws IOException {
        final StringWriter sw1 = new StringWriter();
        CSVFormat.DEFAULT.print((Object) null, sw1, true);
        assertEquals("", sw1.toString());

        final StringWriter sw2 = new StringWriter();
        CSVFormat.DEFAULT.withNullString("NULL").print((Object) null, sw2, true);
        assertEquals("NULL", sw2.toString());

        final StringWriter sw3 = new StringWriter();
        CSVFormat.DEFAULT.withNullString("NULL").withQuoteMode(QuoteMode.ALL).print((Object) null, sw3, true);
        assertEquals("\"NULL\"", sw3.toString());
    }

    @Test
    public void testPrint_quoteModes() throws IOException {
        final StringWriter swAll = new StringWriter();
        final CSVFormat fmtAll = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        fmtAll.printRecord(swAll, "a", 123);
        assertEquals("\"a\",\"123\"\r\n", swAll.toString());

        final StringWriter swAllNonNull = new StringWriter();
        final CSVFormat fmtAllNonNull = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL_NON_NULL);
        fmtAllNonNull.printRecord(swAllNonNull, "a", null, 123);
        assertEquals("\"a\",,\"123\"\r\n", swAllNonNull.toString());

        final StringWriter swNonNumeric = new StringWriter();
        final CSVFormat fmtNonNumeric = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NON_NUMERIC);
        fmtNonNumeric.printRecord(swNonNumeric, "text", 456, 78.9);
        assertEquals("\"text\",456,78.9\r\n", swNonNumeric.toString());

        final StringWriter swNone = new StringWriter();
        final CSVFormat fmtNone = CSVFormat.DEFAULT.withQuote(null).withEscape('\\').withQuoteMode(QuoteMode.NONE);
        fmtNone.printRecord(swNone, "a,b", "c\nd", "e\\f");
        assertEquals("a\\,b,c\\nd,e\\\\f\r\n", swNone.toString());
    }

    @Test
    public void testPrint_minimalQuoteCases() throws IOException {
        final CSVFormat fmt = CSVFormat.DEFAULT.withRecordSeparator("\n");

        final StringWriter swEmptyFirst = new StringWriter();
        fmt.printRecord(swEmptyFirst, "", "b");
        assertEquals("\"\",b\n", swEmptyFirst.toString());

        final StringWriter swEmptySecond = new StringWriter();
        fmt.printRecord(swEmptySecond, "a", "");
        assertEquals("a,\n", swEmptySecond.toString());

        final StringWriter swSpecialStart = new StringWriter();
        fmt.printRecord(swSpecialStart, " leadingSpace", "#commentLike", "\u001Fcontrol");
        assertEquals("\" leadingSpace\",\"#commentLike\",\"\u001Fcontrol\"\n", swSpecialStart.toString());

        final StringWriter swSpecialEnd = new StringWriter();
        fmt.printRecord(swSpecialEnd, "trailingSpace ", "normal");
        assertEquals("\"trailingSpace \",normal\n", swSpecialEnd.toString());

        final StringWriter swContainsSpecial = new StringWriter();
        fmt.printRecord(swContainsSpecial, "a,comma", "b\"quote", "c\nline", "d\rreturn");
        assertEquals("\"a,comma\",\"b\"\"quote\",\"c\nline\",\"d\rreturn\"\n", swContainsSpecial.toString());
    }

    @Test
    public void testPrint_trimming() throws IOException {
        final CSVFormat fmt = CSVFormat.DEFAULT.withTrim(true).withRecordSeparator("\n");
        final StringWriter sw = new StringWriter();
        fmt.printRecord(sw, "   hello   ", new StringBuilder("   world   "));
        assertEquals("hello,world\n", sw.toString());
    }

    @Test
    public void testPrint_escapeOnly() throws IOException {
        final CSVFormat fmt = CSVFormat.DEFAULT.withQuote(null).withEscape('\\').withRecordSeparator("\n");
        final StringWriter sw = new StringWriter();
        fmt.printRecord(sw, "a,b", "c\rd", "e\nf", "g\\h", "normal");
        assertEquals("a\\,b,c\\rd,e\\nf,g\\\\h,normal\n", sw.toString());
    }

    @Test
    public void testPrint_noQuoteNoEscape() throws IOException {
        final CSVFormat fmt = CSVFormat.newFormat(',').withRecordSeparator("\n");
        final StringWriter sw = new StringWriter();
        fmt.printRecord(sw, "a,b", "plain");
        assertEquals("a,b,plain\n", sw.toString());
    }

    @Test
    public void testParse() throws IOException {
        final String csvData = "A,B,C\n1,2,3";
        final CSVFormat format = CSVFormat.DEFAULT.withHeader("Col1", "Col2", "Col3").withSkipHeaderRecord();
        try (final CSVParser parser = format.parse(new StringReader(csvData))) {
            assertNotNull(parser);
            assertEquals(1, parser.getRecords().size());
        }
    }

    @Test
    public void testPrint_appendable() throws IOException {
        final StringWriter sw = new StringWriter();
        try (final CSVPrinter printer = CSVFormat.DEFAULT.print(sw)) {
            printer.printRecord("A", "B");
        }
        assertEquals("A,B\r\n", sw.toString());
    }

    @Test
    public void testPrinter() throws IOException {
        final CSVPrinter printer = CSVFormat.DEFAULT.printer();
        assertNotNull(printer);
    }

    @Test
    public void testPrint_fileAndPath() throws IOException {
        final Path tempFile = Files.createTempFile("csv_test_", ".csv");
        try {
            try (final CSVPrinter printer = CSVFormat.DEFAULT.print(tempFile, StandardCharsets.UTF_8)) {
                printer.printRecord("1", "2");
            }
            final byte[] bytes = Files.readAllBytes(tempFile);
            assertEquals("1,2\r\n", new String(bytes, StandardCharsets.UTF_8));

            final File file = tempFile.toFile();
            try (final CSVPrinter printer = CSVFormat.DEFAULT.print(file, StandardCharsets.UTF_8)) {
                printer.printRecord("3", "4");
            }
            final byte[] bytes2 = Files.readAllBytes(tempFile);
            assertEquals("3,4\r\n", new String(bytes2, StandardCharsets.UTF_8));
        } finally {
            Files.deleteIfExists(tempFile);
        }
    }
}
