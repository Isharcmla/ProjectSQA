package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class CSVPrinterTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullOut_throwsIllegalArgumentException() throws IOException {
        new CSVPrinter(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullFormat_throwsIllegalArgumentException() throws IOException {
        new CSVPrinter(new StringWriter(), null);
    }

    @Test
    public void testConstructor_withHeaderCommentsAndHeader_printsBoth() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT
                .withCommentMarker('#')
                .withHeaderComments("Comment line 1", null, "Comment line 2")
                .withHeader("Col1", "Col2");
        new CSVPrinter(sw, format);

        final String expected = "# Comment line 1\r\n# Comment line 2\r\nCol1,Col2\r\n";
        assertEquals(expected, sw.toString());
    }

    @Test
    public void testConstructor_withHeaderAndSkipHeaderRecord_doesNotPrintHeader() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT
                .withHeader("Col1", "Col2")
                .withSkipHeaderRecord(true);
        new CSVPrinter(sw, format);

        assertEquals("", sw.toString());
    }

    @Test
    public void testClose_closeableTarget_closesUnderlyingStream() throws IOException {
        final boolean[] closed = new boolean[] { false };
        final CloseableStringWriter csw = new CloseableStringWriter(closed);
        final CSVPrinter printer = new CSVPrinter(csw, CSVFormat.DEFAULT);
        printer.close();
        assertTrue(closed[0]);
    }

    @Test
    public void testClose_nonCloseableTarget_doesNotThrow() throws IOException {
        final StringBuilder sb = new StringBuilder();
        final CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.close();
    }

    @Test
    public void testFlush_flushableTarget_flushesUnderlyingStream() throws IOException {
        final boolean[] flushed = new boolean[] { false };
        final FlushableStringWriter fsw = new FlushableStringWriter(flushed);
        final CSVPrinter printer = new CSVPrinter(fsw, CSVFormat.DEFAULT);
        printer.flush();
        assertTrue(flushed[0]);
    }

    @Test
    public void testFlush_nonFlushableTarget_doesNotThrow() throws IOException {
        final StringBuilder sb = new StringBuilder();
        final CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.flush();
    }

    @Test
    public void testGetOut_returnsOriginalAppendable() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        assertSame(sw, printer.getOut());
    }

    @Test
    public void testPrint_nullValueWithNullString_printsNullString() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print(null);
        printer.print(null);
        assertEquals("NULL,NULL", sw.toString());
    }

    @Test
    public void testPrint_nullValueWithoutNullString_printsEmpty() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print(null);
        printer.print("a");
        assertEquals("\"\",a", sw.toString());
    }

    @Test
    public void testPrint_noQuoteNoEscape_printsRaw() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n");
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("hello");
        printer.print("world");
        assertEquals("hello,world", sw.toString());
    }

    @Test
    public void testPrint_escapeCharacterSet_escapesSpecialChars() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.newFormat(',')
                .withEscape('\\')
                .withRecordSeparator("\r\n");
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("a,b");
        printer.print("c\nd");
        printer.print("e\rf");
        printer.print("g\\h");
        printer.print("plain");

        assertEquals("a\\,b,c\\nd,e\\rf,g\\\\h,plain", sw.toString());
    }

    @Test
    public void testPrint_quoteModeAll_quotesEverything() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("text");
        printer.print(123);
        assertEquals("\"text\",\"123\"", sw.toString());
    }

    @Test
    public void testPrint_quoteModeNonNumeric_quotesOnlyNonNumbers() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NON_NUMERIC);
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("text");
        printer.print(123);
        printer.print(45.67);
        assertEquals("\"text\",123,45.67", sw.toString());
    }

    @Test
    public void testPrint_quoteModeNone_escapesInstead() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT
                .withQuoteMode(QuoteMode.NONE)
                .withEscape('\\');
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("a,b");
        printer.print("c\nd");
        assertEquals("a\\,b,c\\nd", sw.toString());
    }

    @Test
    public void testPrint_quoteModeMinimal_variousBranchConditions() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT; // quoteMode null -> default to MINIMAL
        final CSVPrinter printer = new CSVPrinter(sw, format);

        // 1. Empty string as first token (newRecord is true, len <= 0) -> quoted
        printer.print("");
        // 2. Empty string as second token (!newRecord, len <= 0) -> not quoted
        printer.print("");
        printer.println();

        // 3. First token starts with special character < '0' -> quoted
        printer.print("-leadingDash");
        // 4. Token starting with character <= COMMENT ('#') -> quoted
        printer.print("#comment");
        // 5. Token containing delimiter -> quoted
        printer.print("a,b");
        // 6. Token containing quote character -> quoted and doubled
        printer.print("a\"b");
        // 7. Token containing LF -> quoted
        printer.print("a\nb");
        // 8. Token containing CR -> quoted
        printer.print("a\rb");
        // 9. Token ending with space <= SP -> quoted
        printer.print("endSpace ");
        // 10. Plain alphanumeric token not needing quote
        printer.print("normal123");

        printer.println();

        final String expected = "\"\",\r\n"
                + "\"-leadingDash\",\"#comment\",\"a,b\",\"a\"\"b\",\"a\nb\",\"a\rb\",\"endSpace \",normal123\r\n";
        assertEquals(expected, sw.toString());
    }

    @Test
    public void testPrint_quoteModeMinimal_characterBoundaries() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);

        // newRecord true: test char boundary between '9' and 'A' (e.g. ':')
        printer.print(":colon");
        printer.println();

        // newRecord true: test char boundary between 'Z' and 'a' (e.g. '[')
        printer.print("[bracket");
        printer.println();

        // newRecord true: test char boundary > 'z' (e.g. '{')
        printer.print("{brace");
        printer.println();

        // newRecord true: normal character starting with '0', '9', 'A', 'Z', 'a', 'z'
        printer.print("0zero");
        printer.println();
        printer.print("Acapital");
        printer.println();
        printer.print("zlower");
        printer.println();

        final String expected = "\":colon\"\r\n"
                + "\"\"[bracket\"\r\n"
                + "\"\"{brace\"\r\n"
                + "0zero\r\n"
                + "Acapital\r\n"
                + "zlower\r\n";
        // Note: '[' and '{' start with char < '0' is false, but between 'Z' and 'a' is true so quoted
        assertEquals(expected.replace("\"\"[bracket\"", "\"[bracket\"").replace("\"\"{brace\"", "\"{brace\""), sw.toString());
    }

    @Test
    public void testPrintComment_commentMarkerDisabled_doesNothing() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.printComment("This should not be printed");
        assertEquals("", sw.toString());
    }

    @Test
    public void testPrintComment_whenRecordNotNew_printsNewlineFirst() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("data");
        printer.printComment("A comment");
        assertEquals("data\r\n# A comment\r\n", sw.toString());
    }

    @Test
    public void testPrintComment_withDifferentNewlines_handlesCrLfAndLfAndCr() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.printComment("Line1\r\nLine2\nLine3\rLine4");
        final String expected = "# Line1\r\n# Line2\r\n# Line3\r\n# Line4\r\n";
        assertEquals(expected, sw.toString());
    }

    @Test
    public void testPrintln_nullRecordSeparator_doesNotAppendSeparator() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.newFormat(',');
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("value");
        printer.println();
        assertEquals("value", sw.toString());
    }

    @Test
    public void testPrintRecord_iterable_printsFormattedRecord() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.printRecord(Arrays.asList("r1c1", "r1c2", 123));
        assertEquals("r1c1,r1c2,123\r\n", sw.toString());
    }

    @Test
    public void testPrintRecord_varargs_printsFormattedRecord() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.printRecord("v1", "v2", 456);
        assertEquals("v1,v2,456\r\n", sw.toString());
    }

    @Test
    public void testPrintRecord_emptyArray_printsOnlyRecordSeparator() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.printRecord(new Object[0]);
        assertEquals("\r\n", sw.toString());
    }

    @Test
    public void testPrintRecords_iterable_handlesNestedArraysAndIterablesAndSimpleObjects() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);

        final List<Object> records = new ArrayList<Object>();
        records.add(new String[] { "a1", "b1" });
        records.add(Arrays.asList("a2", "b2"));
        records.add("singleValue");

        printer.printRecords((Iterable<?>) records);

        final String expected = "a1,b1\r\n"
                + "a2,b2\r\n"
                + "singleValue\r\n";
        assertEquals(expected, sw.toString());
    }

    @Test
    public void testPrintRecords_varargs_handlesNestedArraysAndIterablesAndSimpleObjects() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);

        final Object[] records = new Object[] {
                new String[] { "x1", "y1" },
                Collections.singletonList("x2"),
                "simple"
        };

        printer.printRecords(records);

        final String expected = "x1,y1\r\n"
                + "x2\r\n"
                + "simple\r\n";
        assertEquals(expected, sw.toString());
    }

    @Test
    public void testPrintRecords_resultSet_printsAllRowsAndColumns() throws SQLException, IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);

        final List<List<Object>> rows = Arrays.asList(
                Arrays.<Object>asList("Alice", 30, "Engineer"),
                Arrays.<Object>asList("Bob", 25, "Designer")
        );
        final ResultSet resultSet = createMockResultSet(rows);

        printer.printRecords(resultSet);

        final String expected = "Alice,30,Engineer\r\n"
                + "Bob,25,Designer\r\n";
        assertEquals(expected, sw.toString());
    }

    @Test
    public void testPrintRecords_emptyResultSet_printsNothing() throws SQLException, IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);

        final List<List<Object>> rows = Collections.emptyList();
        final ResultSet resultSet = createMockResultSet(rows);

        printer.printRecords(resultSet);

        assertEquals("", sw.toString());
    }

    private ResultSet createMockResultSet(final List<List<Object>> rows) {
        final int columnCount = rows.isEmpty() ? 0 : rows.get(0).size();
        final int[] rowIndex = new int[] { -1 };

        final ResultSetMetaData metaData = (ResultSetMetaData) Proxy.newProxyInstance(
                ResultSetMetaData.class.getClassLoader(),
                new Class<?>[] { ResultSetMetaData.class },
                new InvocationHandler() {
                    @Override
                    public Object invoke(final Object proxy, final Method method, final Object[] args) {
                        if ("getColumnCount".equals(method.getName())) {
                            return columnCount;
                        }
                        return null;
                    }
                });

        return (ResultSet) Proxy.newProxyInstance(
                ResultSet.class.getClassLoader(),
                new Class<?>[] { ResultSet.class },
                new InvocationHandler() {
                    @Override
                    public Object invoke(final Object proxy, final Method method, final Object[] args) {
                        final String name = method.getName();
                        if ("getMetaData".equals(name)) {
                            return metaData;
                        } else if ("next".equals(name)) {
                            rowIndex[0]++;
                            return rowIndex[0] < rows.size();
                        } else if ("getObject".equals(name)) {
                            final int colIndex = ((Integer) args[0]).intValue() - 1;
                            return rows.get(rowIndex[0]).get(colIndex);
                        }
                        return null;
                    }
                });
    }

    private static class CloseableStringWriter extends StringWriter {
        private final boolean[] closed;

        CloseableStringWriter(final boolean[] closed) {
            this.closed = closed;
        }

        @Override
        public void close() throws IOException {
            super.close();
            closed[0] = true;
        }
    }

    private static class FlushableStringWriter extends StringWriter {
        private final boolean[] flushed;

        FlushableStringWriter(final boolean[] flushed) {
            this.flushed = flushed;
        }

        @Override
        public void flush() {
            super.flush();
            flushed[0] = true;
        }
    }
}
