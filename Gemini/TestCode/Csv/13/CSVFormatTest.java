package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import org.junit.Test;

public class CSVFormatTest {

    @Test
    public void testPredefinedFormats() {
        assertNotNull(CSVFormat.DEFAULT);
        assertNotNull(CSVFormat.EXCEL);
        assertNotNull(CSVFormat.MYSQL);
        assertNotNull(CSVFormat.RFC4180);
        assertNotNull(CSVFormat.TDF);

        assertEquals(CSVFormat.DEFAULT, CSVFormat.Predefined.Default.getFormat());
        assertEquals(CSVFormat.EXCEL, CSVFormat.Predefined.Excel.getFormat());
        assertEquals(CSVFormat.MYSQL, CSVFormat.Predefined.MySQL.getFormat());
        assertEquals(CSVFormat.RFC4180, CSVFormat.Predefined.RFC4180.getFormat());
        assertEquals(CSVFormat.TDF, CSVFormat.Predefined.TDF.getFormat());

        assertEquals(CSVFormat.DEFAULT, CSVFormat.valueOf("Default"));
        assertEquals(CSVFormat.EXCEL, CSVFormat.valueOf("Excel"));
        assertEquals(CSVFormat.MYSQL, CSVFormat.valueOf("MySQL"));
        assertEquals(CSVFormat.RFC4180, CSVFormat.valueOf("RFC4180"));
        assertEquals(CSVFormat.TDF, CSVFormat.valueOf("TDF"));
    }

    @Test
    public void testNewFormat_validDelimiter_createsFormat() {
        final CSVFormat format = CSVFormat.newFormat('|');
        assertEquals('|', format.getDelimiter());
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
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_crDelimiter_throwsException() {
        CSVFormat.newFormat('\r');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_lfDelimiter_throwsException() {
        CSVFormat.newFormat('\n');
    }

    @Test
    public void testWithDelimiter_validChar_returnsNewFormat() {
        final CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
        assertEquals(';', format.getDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_lfChar_throwsException() {
        CSVFormat.DEFAULT.withDelimiter('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_crChar_throwsException() {
        CSVFormat.DEFAULT.withDelimiter('\r');
    }

    @Test
    public void testWithQuote_charAndCharacter_success() {
        final CSVFormat f1 = CSVFormat.DEFAULT.withQuote('\'');
        assertEquals(Character.valueOf('\''), f1.getQuoteCharacter());
        assertTrue(f1.isQuoteCharacterSet());

        final CSVFormat f2 = CSVFormat.DEFAULT.withQuote((Character) null);
        assertNull(f2.getQuoteCharacter());
        assertFalse(f2.isQuoteCharacterSet());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_charLineBreak_throwsException() {
        CSVFormat.DEFAULT.withQuote('\r');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_characterLineBreak_throwsException() {
        CSVFormat.DEFAULT.withQuote(Character.valueOf('\n'));
    }

    @Test
    public void testWithQuoteMode_valid_setsMode() {
        final CSVFormat format = CSVFormat.DEFAULT.withEscape('\\').withQuoteMode(QuoteMode.NONE);
        assertEquals(QuoteMode.NONE, format.getQuoteMode());
    }

    @Test
    public void testWithCommentMarker_charAndCharacter_success() {
        final CSVFormat f1 = CSVFormat.DEFAULT.withCommentMarker('#');
        assertEquals(Character.valueOf('#'), f1.getCommentMarker());
        assertTrue(f1.isCommentMarkerSet());

        final CSVFormat f2 = f1.withCommentMarker((Character) null);
        assertNull(f2.getCommentMarker());
        assertFalse(f2.isCommentMarkerSet());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_charLineBreak_throwsException() {
        CSVFormat.DEFAULT.withCommentMarker('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_characterLineBreak_throwsException() {
        CSVFormat.DEFAULT.withCommentMarker(Character.valueOf('\r'));
    }

    @Test
    public void testWithEscape_charAndCharacter_success() {
        final CSVFormat f1 = CSVFormat.DEFAULT.withEscape('\\');
        assertEquals(Character.valueOf('\\'), f1.getEscapeCharacter());
        assertTrue(f1.isEscapeCharacterSet());

        final CSVFormat f2 = f1.withEscape((Character) null);
        assertNull(f2.getEscapeCharacter());
        assertFalse(f2.isEscapeCharacterSet());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_charLineBreak_throwsException() {
        CSVFormat.DEFAULT.withEscape('\r');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_characterLineBreak_throwsException() {
        CSVFormat.DEFAULT.withEscape(Character.valueOf('\n'));
    }

    @Test
    public void testWithHeader_stringArray_setsHeader() {
        final CSVFormat f1 = CSVFormat.DEFAULT.withHeader("A", "B", "C");
        assertArrayEquals(new String[]{"A", "B", "C"}, f1.getHeader());

        final CSVFormat f2 = CSVFormat.DEFAULT.withHeader((String[]) null);
        assertNull(f2.getHeader());

        final CSVFormat f3 = CSVFormat.DEFAULT.withHeader();
        assertArrayEquals(new String[0], f3.getHeader());
    }

    @Test
    public void testWithHeader_resultSet_setsHeader() throws SQLException {
        final ResultSetMetaData metaData = (ResultSetMetaData) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[]{ResultSetMetaData.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(final Object proxy, final Method method, final Object[] args) {
                        if ("getColumnCount".equals(method.getName())) {
                            return 2;
                        }
                        if ("getColumnLabel".equals(method.getName())) {
                            final int idx = ((Integer) args[0]).intValue();
                            return "COL_" + idx;
                        }
                        return null;
                    }
                }
        );

        final ResultSet resultSet = (ResultSet) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[]{ResultSet.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(final Object proxy, final Method method, final Object[] args) {
                        if ("getMetaData".equals(method.getName())) {
                            return metaData;
                        }
                        return null;
                    }
                }
        );

        final CSVFormat f1 = CSVFormat.DEFAULT.withHeader(resultSet);
        assertArrayEquals(new String[]{"COL_1", "COL_2"}, f1.getHeader());

        final CSVFormat f2 = CSVFormat.DEFAULT.withHeader((ResultSet) null);
        assertNull(f2.getHeader());

        final CSVFormat f3 = CSVFormat.DEFAULT.withHeader((ResultSetMetaData) null);
        assertNull(f3.getHeader());
    }

    @Test
    public void testWithHeaderComments_variousObjects_convertsToStringArray() {
        final CSVFormat f1 = CSVFormat.DEFAULT.withHeaderComments("Comment1", 123, null);
        assertArrayEquals(new String[]{"Comment1", "123", null}, f1.getHeaderComments());

        final CSVFormat f2 = CSVFormat.DEFAULT.withHeaderComments((Object[]) null);
        assertNull(f2.getHeaderComments());
    }

    @Test
    public void testBooleansAndFlags() {
        final CSVFormat f = CSVFormat.DEFAULT
                .withAllowMissingColumnNames()
                .withIgnoreEmptyLines()
                .withIgnoreSurroundingSpaces()
                .withIgnoreHeaderCase()
                .withSkipHeaderRecord();

        assertTrue(f.getAllowMissingColumnNames());
        assertTrue(f.getIgnoreEmptyLines());
        assertTrue(f.getIgnoreSurroundingSpaces());
        assertTrue(f.getIgnoreHeaderCase());
        assertTrue(f.getSkipHeaderRecord());

        final CSVFormat f2 = f
                .withAllowMissingColumnNames(false)
                .withIgnoreEmptyLines(false)
                .withIgnoreSurroundingSpaces(false)
                .withIgnoreHeaderCase(false)
                .withSkipHeaderRecord(false);

        assertFalse(f2.getAllowMissingColumnNames());
        assertFalse(f2.getIgnoreEmptyLines());
        assertFalse(f2.getIgnoreSurroundingSpaces());
        assertFalse(f2.getIgnoreHeaderCase());
        assertFalse(f2.getSkipHeaderRecord());
    }

    @Test
    public void testWithNullString_setsString() {
        final CSVFormat f1 = CSVFormat.DEFAULT.withNullString("NULL");
        assertEquals("NULL", f1.getNullString());
        assertTrue(f1.isNullStringSet());

        final CSVFormat f2 = CSVFormat.DEFAULT.withNullString(null);
        assertNull(f2.getNullString());
        assertFalse(f2.isNullStringSet());
    }

    @Test
    public void testWithRecordSeparator_charAndString() {
        final CSVFormat f1 = CSVFormat.DEFAULT.withRecordSeparator('\n');
        assertEquals("\n", f1.getRecordSeparator());

        final CSVFormat f2 = CSVFormat.DEFAULT.withRecordSeparator("\r\n");
        assertEquals("\r\n", f2.getRecordSeparator());

        final CSVFormat f3 = CSVFormat.DEFAULT.withRecordSeparator((String) null);
        assertNull(f3.getRecordSeparator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_quoteCharEqualsDelimiter_throwsException() {
        CSVFormat.DEFAULT.withQuote(',').withDelimiter(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_escapeEqualsDelimiter_throwsException() {
        CSVFormat.DEFAULT.withEscape(',').withDelimiter(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_commentMarkerEqualsDelimiter_throwsException() {
        CSVFormat.DEFAULT.withCommentMarker(',').withDelimiter(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_quoteEqualsCommentMarker_throwsException() {
        CSVFormat.DEFAULT.withQuote('"').withCommentMarker('"');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_escapeEqualsCommentMarker_throwsException() {
        CSVFormat.DEFAULT.withEscape('!').withCommentMarker('!');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_quoteModeNoneWithoutEscape_throwsException() {
        CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NONE).withEscape(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_duplicateHeader_throwsException() {
        CSVFormat.DEFAULT.withHeader("A", "B", "A");
    }

    @Test
    public void testFormat_validArgs_returnsFormattedString() {
        final String result = CSVFormat.DEFAULT.format("a", "b", "c");
        assertEquals("a,b,c", result);
    }

    @Test
    public void testParseAndPrint() throws IOException {
        final CSVParser parser = CSVFormat.DEFAULT.parse(new StringReader("a,b\n1,2"));
        assertNotNull(parser);
        assertEquals(2, parser.getRecords().size());

        final StringBuilder sb = new StringBuilder();
        final CSVPrinter printer = CSVFormat.DEFAULT.print(sb);
        assertNotNull(printer);
        printer.printRecord("x", "y");
        assertEquals("x,y\r\n", sb.toString());
    }

    @Test
    public void testToString_allCombinations() {
        final String defaultStr = CSVFormat.DEFAULT.toString();
        assertTrue(defaultStr.contains("Delimiter=<,>"));
        assertTrue(defaultStr.contains("QuoteChar=<\">"));
        assertTrue(defaultStr.contains("RecordSeparator=<\r\n>"));
        assertTrue(defaultStr.contains("EmptyLines:ignored"));

        final CSVFormat custom = CSVFormat.DEFAULT
                .withEscape('\\')
                .withCommentMarker('#')
                .withNullString("NULL")
                .withIgnoreSurroundingSpaces(true)
                .withIgnoreHeaderCase(true)
                .withSkipHeaderRecord(true)
                .withHeaderComments("Comment Line")
                .withHeader("H1", "H2");

        final String customStr = custom.toString();
        assertTrue(customStr.contains("Escape=<\\>"));
        assertTrue(customStr.contains("CommentStart=<#>"));
        assertTrue(customStr.contains("NullString=<NULL>"));
        assertTrue(customStr.contains("SurroundingSpaces:ignored"));
        assertTrue(customStr.contains("IgnoreHeaderCase:ignored"));
        assertTrue(customStr.contains("SkipHeaderRecord:true"));
        assertTrue(customStr.contains("HeaderComments:[Comment Line]"));
        assertTrue(customStr.contains("Header:[H1, H2]"));

        final CSVFormat minimal = CSVFormat.newFormat('|');
        final String minimalStr = minimal.toString();
        assertEquals("Delimiter=<|> SkipHeaderRecord:false", minimalStr);
    }

    @Test
    public void testEqualsAndHashCode() {
        final CSVFormat base = CSVFormat.DEFAULT;

        assertTrue(base.equals(base));
        assertFalse(base.equals(null));
        assertFalse(base.equals("not a CSVFormat"));

        final CSVFormat same = CSVFormat.DEFAULT
                .withDelimiter(',')
                .withQuote('"')
                .withRecordSeparator("\r\n");
        assertTrue(base.equals(same));
        assertEquals(base.hashCode(), same.hashCode());

        assertFalse(base.equals(base.withDelimiter(';')));
        assertFalse(base.equals(base.withEscape('\\').withQuoteMode(QuoteMode.ALL)));
        assertFalse(base.withQuoteMode(QuoteMode.MINIMAL).equals(base.withEscape('\\').withQuoteMode(QuoteMode.ALL)));

        final CSVFormat withoutQuote = base.withQuote(null);
        assertFalse(base.equals(withoutQuote));
        assertFalse(withoutQuote.equals(base));
        assertFalse(base.equals(base.withQuote('\'')));

        final CSVFormat withComment = base.withCommentMarker('#');
        assertFalse(base.equals(withComment));
        assertFalse(withComment.equals(base));
        assertFalse(withComment.equals(base.withCommentMarker('!')));

        final CSVFormat withEscape = base.withEscape('\\');
        assertFalse(base.equals(withEscape));
        assertFalse(withEscape.equals(base));
        assertFalse(withEscape.equals(base.withEscape('/')));

        final CSVFormat withNull = base.withNullString("null");
        assertFalse(base.equals(withNull));
        assertFalse(withNull.equals(base));
        assertFalse(withNull.equals(base.withNullString("nil")));

        final CSVFormat withHeader = base.withHeader("A", "B");
        assertFalse(base.equals(withHeader));
        assertFalse(withHeader.equals(base));
        assertFalse(withHeader.equals(base.withHeader("A", "C")));

        assertFalse(base.equals(base.withIgnoreSurroundingSpaces(true)));
        assertFalse(base.equals(base.withIgnoreEmptyLines(false)));
        assertFalse(base.equals(base.withSkipHeaderRecord(true)));

        final CSVFormat withoutSeparator = base.withRecordSeparator((String) null);
        assertFalse(base.equals(withoutSeparator));
        assertFalse(withoutSeparator.equals(base));
        assertFalse(base.equals(base.withRecordSeparator("\n")));

        assertEquals(base.hashCode(), base.hashCode());
        assertNotSame(base.hashCode(), customFormatForHash().hashCode());
    }

    private CSVFormat customFormatForHash() {
        return CSVFormat.DEFAULT
                .withEscape('\\')
                .withQuoteMode(QuoteMode.ALL)
                .withCommentMarker('#')
                .withNullString("N/A")
                .withIgnoreSurroundingSpaces(true)
                .withIgnoreHeaderCase(true)
                .withIgnoreEmptyLines(false)
                .withSkipHeaderRecord(true)
                .withHeader("X")
                .withRecordSeparator("\n");
    }

    @Test
    public void testSerialization() throws IOException, ClassNotFoundException {
        final CSVFormat original = CSVFormat.DEFAULT
                .withCommentMarker('#')
                .withEscape('\\')
                .withNullString("NULL")
                .withHeader("Col1", "Col2")
                .withHeaderComments("Comment1");

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream ois = new ObjectInputStream(bais);
        final CSVFormat deserialized = (CSVFormat) ois.readObject();

        assertEquals(original, deserialized);
        assertEquals(original.hashCode(), deserialized.hashCode());
        assertArrayEquals(original.getHeader(), deserialized.getHeader());
        assertArrayEquals(original.getHeaderComments(), deserialized.getHeaderComments());
    }

    @Test
    public void testDefensiveCopies() {
        final String[] header = new String[]{"A", "B"};
        final CSVFormat format = CSVFormat.DEFAULT.withHeader(header);
        header[0] = "Z";
        assertEquals("A", format.getHeader()[0]);

        final String[] retrievedHeader = format.getHeader();
        retrievedHeader[0] = "MODIFIED";
        assertEquals("A", format.getHeader()[0]);

        final Object[] comments = new Object[]{"C1", "C2"};
        final CSVFormat formatComments = CSVFormat.DEFAULT.withHeaderComments(comments);
        comments[0] = "C_MODIFIED";
        assertEquals("C1", formatComments.getHeaderComments()[0]);

        final String[] retrievedComments = formatComments.getHeaderComments();
        retrievedComments[0] = "MODIFIED";
        assertEquals("C1", formatComments.getHeaderComments()[0]);
    }
}
