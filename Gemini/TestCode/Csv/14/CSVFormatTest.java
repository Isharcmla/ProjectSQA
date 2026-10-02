package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
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

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class CSVFormatTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    private enum TestHeaderEnum {
        ID, NAME, AGE
    }

    private enum EmptyEnum {
    }

    private ResultSetMetaData createMockResultSetMetaData(final String[] columnLabels) {
        return (ResultSetMetaData) Proxy.newProxyInstance(
                ResultSetMetaData.class.getClassLoader(),
                new Class<?>[]{ResultSetMetaData.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("getColumnCount".equals(method.getName())) {
                            return columnLabels.length;
                        }
                        if ("getColumnLabel".equals(method.getName())) {
                            int index = (Integer) args[0];
                            return columnLabels[index - 1];
                        }
                        return null;
                    }
                });
    }

    private ResultSet createMockResultSet(final ResultSetMetaData metaData) {
        return (ResultSet) Proxy.newProxyInstance(
                ResultSet.class.getClassLoader(),
                new Class<?>[]{ResultSet.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("getMetaData".equals(method.getName())) {
                            return metaData;
                        }
                        return null;
                    }
                });
    }

    @Test
    public void testPredefinedFormatsConstants() {
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertEquals('"', (char) CSVFormat.DEFAULT.getQuoteCharacter());
        assertEquals("\r\n", CSVFormat.DEFAULT.getRecordSeparator());
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());

        assertEquals(',', CSVFormat.EXCEL.getDelimiter());
        assertFalse(CSVFormat.EXCEL.getIgnoreEmptyLines());
        assertTrue(CSVFormat.EXCEL.getAllowMissingColumnNames());

        assertEquals('|', CSVFormat.INFORMIX_UNLOAD.getDelimiter());
        assertEquals('\\', (char) CSVFormat.INFORMIX_UNLOAD.getEscapeCharacter());
        assertEquals("\n", CSVFormat.INFORMIX_UNLOAD.getRecordSeparator());

        assertEquals(',', CSVFormat.INFORMIX_UNLOAD_CSV.getDelimiter());
        assertEquals("\n", CSVFormat.INFORMIX_UNLOAD_CSV.getRecordSeparator());

        assertEquals('\t', CSVFormat.MYSQL.getDelimiter());
        assertEquals('\\', (char) CSVFormat.MYSQL.getEscapeCharacter());
        assertNull(CSVFormat.MYSQL.getQuoteCharacter());
        assertEquals("\n", CSVFormat.MYSQL.getRecordSeparator());
        assertEquals("\\N", CSVFormat.MYSQL.getNullString());

        assertEquals(',', CSVFormat.RFC4180.getDelimiter());
        assertFalse(CSVFormat.RFC4180.getIgnoreEmptyLines());

        assertEquals('\t', CSVFormat.TDF.getDelimiter());
        assertTrue(CSVFormat.TDF.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testPredefinedEnumAndValueOf() {
        for (CSVFormat.Predefined predefined : CSVFormat.Predefined.values()) {
            assertNotNull(predefined.getFormat());
            assertEquals(predefined.getFormat(), CSVFormat.valueOf(predefined.name()));
        }
    }

    @Test
    public void testNewFormat() {
        CSVFormat format = CSVFormat.newFormat(';');
        assertEquals(';', format.getDelimiter());
        assertNull(format.getQuoteCharacter());
        assertNull(format.getQuoteMode());
        assertNull(format.getCommentMarker());
        assertNull(format.getEscapeCharacter());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertFalse(format.getIgnoreEmptyLines());
        assertNull(format.getRecordSeparator());
        assertNull(format.getNullString());
        assertNull(format.getHeaderComments());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
        assertFalse(format.getAllowMissingColumnNames());
        assertFalse(format.getIgnoreHeaderCase());
        assertFalse(format.getTrim());
        assertFalse(format.getTrailingDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_withCRDelimiter_throwsException() {
        CSVFormat.newFormat('\r');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_withLFDelimiter_throwsException() {
        CSVFormat.newFormat('\n');
    }

    @Test
    public void testGettersAndWithMethods() {
        CSVFormat format = CSVFormat.DEFAULT
                .withAllowMissingColumnNames(true)
                .withCommentMarker('#')
                .withDelimiter(';')
                .withEscape('\\')
                .withHeader("A", "B", "C")
                .withHeaderComments("Comment 1", "Comment 2")
                .withIgnoreEmptyLines(true)
                .withIgnoreHeaderCase(true)
                .withIgnoreSurroundingSpaces(true)
                .withNullString("NULL")
                .withQuote('\'')
                .withQuoteMode(QuoteMode.ALL)
                .withRecordSeparator("\n")
                .withSkipHeaderRecord(true)
                .withTrailingDelimiter(true)
                .withTrim(true);

        assertTrue(format.getAllowMissingColumnNames());
        assertEquals(Character.valueOf('#'), format.getCommentMarker());
        assertEquals(';', format.getDelimiter());
        assertEquals(Character.valueOf('\\'), format.getEscapeCharacter());
        assertArrayEquals(new String[]{"A", "B", "C"}, format.getHeader());
        assertArrayEquals(new String[]{"Comment 1", "Comment 2"}, format.getHeaderComments());
        assertTrue(format.getIgnoreEmptyLines());
        assertTrue(format.getIgnoreHeaderCase());
        assertTrue(format.getIgnoreSurroundingSpaces());
        assertEquals("NULL", format.getNullString());
        assertEquals(Character.valueOf('\''), format.getQuoteCharacter());
        assertEquals(QuoteMode.ALL, format.getQuoteMode());
        assertEquals("\n", format.getRecordSeparator());
        assertTrue(format.getSkipHeaderRecord());
        assertTrue(format.getTrailingDelimiter());
        assertTrue(format.getTrim());

        assertTrue(format.isCommentMarkerSet());
        assertTrue(format.isEscapeCharacterSet());
        assertTrue(format.isNullStringSet());
        assertTrue(format.isQuoteCharacterSet());
    }

    @Test
    public void testWithMethodsNullOrDisable() {
        CSVFormat format = CSVFormat.DEFAULT
                .withCommentMarker((Character) null)
                .withEscape((Character) null)
                .withNullString(null)
                .withQuote((Character) null)
                .withQuoteMode(null)
                .withHeader((String[]) null)
                .withHeaderComments((Object[]) null);

        assertNull(format.getCommentMarker());
        assertNull(format.getEscapeCharacter());
        assertNull(format.getNullString());
        assertNull(format.getQuoteCharacter());
        assertNull(format.getQuoteMode());
        assertNull(format.getHeader());
        assertNull(format.getHeaderComments());

        assertFalse(format.isCommentMarkerSet());
        assertFalse(format.isEscapeCharacterSet());
        assertFalse(format.isNullStringSet());
        assertFalse(format.isQuoteCharacterSet());
    }

    @Test
    public void testWithNoArgMethods() {
        CSVFormat format = CSVFormat.DEFAULT
                .withAllowMissingColumnNames()
                .withIgnoreEmptyLines()
                .withIgnoreHeaderCase()
                .withIgnoreSurroundingSpaces()
                .withSkipHeaderRecord()
                .withTrailingDelimiter()
                .withTrim();

        assertTrue(format.getAllowMissingColumnNames());
        assertTrue(format.getIgnoreEmptyLines());
        assertTrue(format.getIgnoreHeaderCase());
        assertTrue(format.getIgnoreSurroundingSpaces());
        assertTrue(format.getSkipHeaderRecord());
        assertTrue(format.getTrailingDelimiter());
        assertTrue(format.getTrim());

        CSVFormat withHeaderRecord = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        assertNotNull(withHeaderRecord.getHeader());
        assertEquals(0, withHeaderRecord.getHeader().length);
        assertTrue(withHeaderRecord.getSkipHeaderRecord());
    }

    @Test
    public void testWithRecordSeparatorChar() {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator('\n');
        assertEquals("\n", format.getRecordSeparator());
    }

    @Test
    public void testWithCommentMarkerChar() {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('!');
        assertEquals(Character.valueOf('!'), format.getCommentMarker());
    }

    @Test
    public void testWithEscapeChar() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('/');
        assertEquals(Character.valueOf('/'), format.getEscapeCharacter());
    }

    @Test
    public void testWithQuoteChar() {
        CSVFormat format = CSVFormat.DEFAULT.withQuote('"');
        assertEquals(Character.valueOf('"'), format.getQuoteCharacter());
    }

    @Test
    public void testWithHeaderEnum() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader(TestHeaderEnum.class);
        assertArrayEquals(new String[]{"ID", "NAME", "AGE"}, format.getHeader());

        CSVFormat emptyEnumFormat = CSVFormat.DEFAULT.withHeader(EmptyEnum.class);
        assertArrayEquals(new String[0], emptyEnumFormat.getHeader());

        CSVFormat nullEnumFormat = CSVFormat.DEFAULT.withHeader((Class<? extends Enum<?>>) null);
        assertNull(nullEnumFormat.getHeader());
    }

    @Test
    public void testWithHeaderResultSetAndMetaData() throws SQLException {
        String[] labels = new String[]{"Col1", "Col2"};
        ResultSetMetaData metaData = createMockResultSetMetaData(labels);
        ResultSet resultSet = createMockResultSet(metaData);

        CSVFormat formatFromRS = CSVFormat.DEFAULT.withHeader(resultSet);
        assertArrayEquals(labels, formatFromRS.getHeader());

        CSVFormat formatFromMeta = CSVFormat.DEFAULT.withHeader(metaData);
        assertArrayEquals(labels, formatFromMeta.getHeader());

        CSVFormat formatNullRS = CSVFormat.DEFAULT.withHeader((ResultSet) null);
        assertNull(formatNullRS.getHeader());

        CSVFormat formatNullMeta = CSVFormat.DEFAULT.withHeader((ResultSetMetaData) null);
        assertNull(formatNullMeta.getHeader());
    }

    @Test
    public void testValidationDelimiterMatchesQuote() {
        try {
            CSVFormat.DEFAULT.withQuote(',').withDelimiter(',');
            org.junit.Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("quoteChar character and the delimiter cannot be the same"));
        }
    }

    @Test
    public void testValidationDelimiterMatchesEscape() {
        try {
            CSVFormat.DEFAULT.withEscape(',').withDelimiter(',');
            org.junit.Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("escape character and the delimiter cannot be the same"));
        }
    }

    @Test
    public void testValidationDelimiterMatchesComment() {
        try {
            CSVFormat.DEFAULT.withCommentMarker(',').withDelimiter(',');
            org.junit.Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("comment start character and the delimiter cannot be the same"));
        }
    }

    @Test
    public void testValidationQuoteMatchesComment() {
        try {
            CSVFormat.DEFAULT.withQuote('#').withCommentMarker('#');
            org.junit.Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("comment start character and the quoteChar cannot be the same"));
        }
    }

    @Test
    public void testValidationEscapeMatchesComment() {
        try {
            CSVFormat.DEFAULT.withEscape('#').withCommentMarker('#');
            org.junit.Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("comment start and the escape character cannot be the same"));
        }
    }

    @Test
    public void testValidationQuoteModeNoneWithoutEscape() {
        try {
            CSVFormat.DEFAULT.withEscape((Character) null).withQuoteMode(QuoteMode.NONE);
            org.junit.Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("No quotes mode set but no escape character is set"));
        }
    }

    @Test
    public void testValidationDuplicateHeader() {
        try {
            CSVFormat.DEFAULT.withHeader("A", "B", "A");
            org.junit.Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("duplicate entry"));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_LineBreakLF_throwsException() {
        CSVFormat.DEFAULT.withDelimiter('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_LineBreakCR_throwsException() {
        CSVFormat.DEFAULT.withDelimiter('\r');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_LineBreakLF_throwsException() {
        CSVFormat.DEFAULT.withEscape('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_LineBreakCR_throwsException() {
        CSVFormat.DEFAULT.withEscape(Character.valueOf('\r'));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_LineBreakLF_throwsException() {
        CSVFormat.DEFAULT.withQuote('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_LineBreakCR_throwsException() {
        CSVFormat.DEFAULT.withQuote(Character.valueOf('\r'));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_LineBreakLF_throwsException() {
        CSVFormat.DEFAULT.withCommentMarker('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_LineBreakCR_throwsException() {
        CSVFormat.DEFAULT.withCommentMarker(Character.valueOf('\r'));
    }

    @Test
    public void testEqualsAndHashCode() {
        CSVFormat f1 = CSVFormat.DEFAULT;
        CSVFormat f2 = CSVFormat.DEFAULT;

        assertEquals(f1, f1);
        assertEquals(f1, f2);
        assertEquals(f1.hashCode(), f2.hashCode());

        assertFalse(f1.equals(null));
        assertFalse(f1.equals("Some String"));

        assertNotEquals(f1, f1.withDelimiter(';'));
        assertNotEquals(f1, f1.withQuote('\''));
        assertNotEquals(f1, f1.withQuote((Character) null));
        assertNotEquals(f1.withQuote((Character) null), f1);
        assertNotEquals(f1, f1.withQuoteMode(QuoteMode.ALL));
        assertNotEquals(f1, f1.withCommentMarker('#'));
        assertNotEquals(f1.withCommentMarker('#'), f1);
        assertNotEquals(f1, f1.withEscape('\\'));
        assertNotEquals(f1.withEscape('\\'), f1);
        assertNotEquals(f1, f1.withNullString("NULL"));
        assertNotEquals(f1.withNullString("NULL"), f1);
        assertNotEquals(f1, f1.withHeader("A", "B"));
        assertNotEquals(f1, f1.withIgnoreSurroundingSpaces(true));
        assertNotEquals(f1, f1.withIgnoreEmptyLines(false));
        assertNotEquals(f1, f1.withSkipHeaderRecord(true));
        assertNotEquals(f1, f1.withRecordSeparator("\n"));
        assertNotEquals(f1, f1.withRecordSeparator((String) null));
        assertNotEquals(f1.withRecordSeparator((String) null), f1);

        CSVFormat f3 = f1.withIgnoreHeaderCase(true);
        assertNotEquals(f1.hashCode(), f3.hashCode());
    }

    @Test
    public void testToString() {
        String str = CSVFormat.DEFAULT
                .withEscape('\\')
                .withQuote('"')
                .withCommentMarker('#')
                .withNullString("N/A")
                .withRecordSeparator("\r\n")
                .withIgnoreEmptyLines(true)
                .withIgnoreSurroundingSpaces(true)
                .withIgnoreHeaderCase(true)
                .withSkipHeaderRecord(true)
                .withHeaderComments("Comment")
                .withHeader("H1", "H2")
                .toString();

        assertTrue(str.contains("Delimiter=<,>"));
        assertTrue(str.contains("Escape=<\\>"));
        assertTrue(str.contains("QuoteChar=<\">"));
        assertTrue(str.contains("CommentStart=<#>"));
        assertTrue(str.contains("NullString=<N/A>"));
        assertTrue(str.contains("RecordSeparator=<\r\n>"));
        assertTrue(str.contains("EmptyLines:ignored"));
        assertTrue(str.contains("SurroundingSpaces:ignored"));
        assertTrue(str.contains("IgnoreHeaderCase:ignored"));
        assertTrue(str.contains("SkipHeaderRecord:true"));
        assertTrue(str.contains("HeaderComments:[Comment]"));
        assertTrue(str.contains("Header:[H1, H2]"));

        CSVFormat minimal = CSVFormat.newFormat(';')
                .withQuote((Character) null)
                .withEscape((Character) null)
                .withCommentMarker((Character) null)
                .withNullString(null)
                .withRecordSeparator((String) null)
                .withIgnoreEmptyLines(false)
                .withIgnoreSurroundingSpaces(false)
                .withIgnoreHeaderCase(false);
        String minStr = minimal.toString();
        assertEquals("Delimiter=<;> SkipHeaderRecord:false", minStr);
    }

    @Test
    public void testFormat() {
        String res = CSVFormat.DEFAULT.format("a", "b", "c");
        assertEquals("a,b,c", res);
    }

    @Test
    public void testParse() throws IOException {
        StringReader reader = new StringReader("a,b\n1,2");
        CSVParser parser = CSVFormat.DEFAULT.parse(reader);
        assertNotNull(parser);
        assertEquals(2, parser.getRecords().size());
    }

    @Test
    public void testPrintAppendable() throws IOException {
        StringWriter writer = new StringWriter();
        CSVPrinter printer = CSVFormat.DEFAULT.print(writer);
        assertNotNull(printer);
        printer.print("value");
        printer.flush();
        assertEquals("value", writer.toString());
    }

    @Test
    public void testPrintFileAndPath() throws IOException {
        File tempFile = temporaryFolder.newFile("test.csv");
        CSVPrinter printer1 = CSVFormat.DEFAULT.print(tempFile, StandardCharsets.UTF_8);
        printer1.print("file_test");
        printer1.close();
        assertTrue(tempFile.length() > 0);

        Path tempPath = temporaryFolder.newFile("test_path.csv").toPath();
        CSVPrinter printer2 = CSVFormat.DEFAULT.print(tempPath, StandardCharsets.UTF_8);
        printer2.print("path_test");
        printer2.close();
        assertTrue(Files.size(tempPath) > 0);
    }

    @Test
    public void testPrintSingleValueVariants() throws IOException {
        StringWriter out = new StringWriter();
        CSVFormat.DEFAULT.print(null, out, true);
        assertEquals("", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.withNullString("NULL").print(null, out, true);
        assertEquals("NULL", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.print("hello", out, true);
        assertEquals("hello", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.print("world", out, false);
        assertEquals(",world", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.withTrim().print("  trimmed  ", out, true);
        assertEquals("trimmed", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.withTrim().print(new StringBuilder("  sb_trim  "), out, true);
        assertEquals("sb_trim", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.withTrim().print("   ", out, true);
        assertEquals("", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.withTrim().print("untrimmed", out, true);
        assertEquals("untrimmed", out.toString());
    }

    @Test
    public void testPrintQuoteModes() throws IOException {
        StringWriter out = new StringWriter();
        CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL).print("test", out, true);
        assertEquals("\"test\"", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NON_NUMERIC).print(123, out, true);
        assertEquals("123", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NON_NUMERIC).print("abc", out, true);
        assertEquals("\"abc\"", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.withEscape('\\').withQuoteMode(QuoteMode.NONE).print("a,b\nc\rd\\e", out, true);
        assertEquals("a\\,b\\nc\\rd\\\\e", out.toString());
    }

    @Test
    public void testPrintMinimalQuoteConditions() throws IOException {
        StringWriter out = new StringWriter();
        CSVFormat.DEFAULT.print("", out, true);
        assertEquals("\"\"", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.print("", out, false);
        assertEquals(",", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.print("/not_alnum_start", out, true);
        assertEquals("\"/not_alnum_start\"", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.print("!", out, false);
        assertEquals(",\"!\"", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.print("a,b", out, false);
        assertEquals(",\"a,b\"", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.print("a\nb", out, false);
        assertEquals(",\"a\nb\"", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.print("a\rb", out, false);
        assertEquals(",\"a\rb\"", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.print("a\"b", out, false);
        assertEquals(",\"a\"\"b\"", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.print("abc ", out, false);
        assertEquals(",\"abc \"", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.print("abc", out, false);
        assertEquals(",abc", out.toString());
    }

    @Test
    public void testPrintAndEscapeBranches() throws IOException {
        CSVFormat format = CSVFormat.newFormat(',').withEscape('\\');
        StringWriter out = new StringWriter();
        format.print("normal", out, true);
        assertEquals("normal", out.toString());

        out = new StringWriter();
        format.print("a,b\nc\rd\\e", out, true);
        assertEquals("a\\,b\\nc\\rd\\\\e", out.toString());
    }

    @Test
    public void testPrintRawWithoutQuoteOrEscape() throws IOException {
        CSVFormat format = CSVFormat.newFormat(',');
        StringWriter out = new StringWriter();
        format.print("hello,world\n!", out, true);
        assertEquals("hello,world\n!", out.toString());
    }

    @Test
    public void testPrintlnAndPrintRecord() throws IOException {
        StringWriter out = new StringWriter();
        CSVFormat.DEFAULT.println(out);
        assertEquals("\r\n", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.withTrailingDelimiter(true).println(out);
        assertEquals(",\r\n", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.withRecordSeparator((String) null).println(out);
        assertEquals("", out.toString());

        out = new StringWriter();
        CSVFormat.DEFAULT.printRecord(out, "col1", "col2", "col3");
        assertEquals("col1,col2,col3\r\n", out.toString());
    }

    @Test
    public void testWithHeaderCommentsArrayConversion() {
        Object[] comments = new Object[]{"Line 1", null, 123};
        CSVFormat format = CSVFormat.DEFAULT.withHeaderComments(comments);
        assertArrayEquals(new String[]{"Line 1", null, "123"}, format.getHeaderComments());
    }
}
