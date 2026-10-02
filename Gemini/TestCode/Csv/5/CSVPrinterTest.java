package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.io.CharArrayWriter;
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
    public void testConstructor_nullOut_throwsException() {
        new CSVPrinter(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullFormat_throwsException() {
        new CSVPrinter(new StringBuilder(), null);
    }

    @Test
    public void testGetOut_validAppendable_returnsSameInstance() {
        StringBuilder sb = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        assertSame(sb, printer.getOut());
    }

    @Test
    public void testClose_closeableOut_closesSuccessfully() throws IOException {
        final boolean[] closed = new boolean[1];
        StringWriter writer = new StringWriter() {
            @Override
            public void close() throws IOException {
                closed[0] = true;
                super.close();
            }
        };
        CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.close();
        assertEquals(true, closed[0]);
    }

    @Test
    public void testClose_nonCloseableOut_doesNotFail() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.close();
    }

    @Test
    public void testFlush_flushableOut_flushesSuccessfully() throws IOException {
        final boolean[] flushed = new boolean[1];
        StringWriter writer = new StringWriter() {
            @Override
            public void flush() {
                flushed[0] = true;
                super.flush();
            }
        };
        CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.flush();
        assertEquals(true, flushed[0]);
    }

    @Test
    public void testFlush_nonFlushableOut_doesNotFail() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.flush();
    }

    @Test
    public void testPrint_nullValue_defaultFormat() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print(null);
        assertEquals("\"\"", sw.toString());
    }

    @Test
    public void testPrint_nullValue_withNullString() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL_VAL");
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print(null);
        assertEquals("NULL_VAL", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyAll() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.ALL);
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("hello");
        printer.print(123);
        assertEquals("\"hello\",\"123\"", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyNonNumeric() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NON_NUMERIC);
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("hello");
        printer.print(123);
        printer.print(45.67);
        assertEquals("\"hello\",123,45.67", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyNone_withEscape() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NONE).withEscape('\\');
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("hello, world\r\ntest\\end");
        assertEquals("hello\\, world\\r\\ntest\\\\end", sw.toString());
    }

    @Test
    public void testPrint_pureEscapingFormat() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.MYSQL; // Escaping enabled, quoting disabled
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("val1\tval2\nval3\rval4\\val5");
        printer.print("second");
        assertEquals("val1\\tval2\\nval3\\rval4\\\\val5\tsecond", sw.toString());
    }

    @Test
    public void testPrint_noQuotingNoEscaping() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.newFormat('|');
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("plainText");
        printer.print("secondText");
        assertEquals("plainText|secondText", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyMinimal_emptyTokens() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print("");
        printer.print("");
        assertEquals("\"\",", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyMinimal_startSpecialChars() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        // Start char < '0' on newRecord
        printer.print("-value");
        // Second token starting with special char <= COMMENT
        printer.print("#hashtag");
        assertEquals("\"-value\",#hashtag", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyMinimal_startWithCommentChar() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT.withCommentStart('#'));
        printer.print("abc");
        printer.print("!excl");
        assertEquals("abc,\"!excl\"", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyMinimal_containsDelimQuoteOrNewline() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print("hello,world");
        printer.print("has\"quote");
        printer.print("has\nnewline");
        printer.print("has\rcarriage");
        assertEquals("\"hello,world\",\"has\"\"quote\",\"has\nnewline\",\"has\rcarriage\"", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyMinimal_endsWithWhitespace() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print("abc ");
        assertEquals("\"abc \"", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyMinimal_normalAlphaNumeric() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print("abc123XYZ");
        assertEquals("abc123XYZ", sw.toString());
    }

    @Test
    public void testPrintln_customRecordSeparator() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\r\n");
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("a");
        printer.println();
        printer.print("b");
        assertEquals("a\r\nb", sw.toString());
    }

    @Test
    public void testPrintComment_commentsDisabled_doesNothing() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.printComment("this is a comment");
        assertEquals("", sw.toString());
    }

    @Test
    public void testPrintComment_onNewRecord() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.printComment("Single line comment");
        assertEquals("# Single line comment\n", sw.toString());
    }

    @Test
    public void testPrintComment_afterValues_andMultiLine() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("val1");
        printer.printComment("Line1\r\nLine2\rLine3\nLine4");
        assertEquals("val1\n# Line1\n# Line2\n# Line3\n# Line4\n", sw.toString());
    }

    @Test
    public void testPrintRecord_varargs_emptyAndValues() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.printRecord("a", "b", "c");
        printer.printRecord();
        assertEquals("a,b,c\n\n", sw.toString());
    }

    @Test
    public void testPrintRecord_iterable() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sw, format);
        List<String> list = Arrays.asList("x", "y", "z");
        printer.printRecord(list);
        assertEquals("x,y,z\n", sw.toString());
    }

    @Test
    public void testPrintRecords_iterable_mixedElements() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sw, format);

        List<Object> records = new ArrayList<Object>();
        records.add(new Object[]{"r1c1", "r1c2"});
        records.add(Arrays.asList("r2c1", "r2c2"));
        records.add("singleValue");

        printer.printRecords((Iterable<?>) records);
        assertEquals("r1c1,r1c2\nr2c1,r2c2\nsingleValue\n", sw.toString());
    }

    @Test
    public void testPrintRecords_array_mixedElements() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sw, format);

        Object[] records = new Object[]{
            new Object[]{"r1c1", "r1c2"},
            Arrays.asList("r2c1", "r2c2"),
            "singleValue"
        };

        printer.printRecords(records);
        assertEquals("r1c1,r1c2\nr2c1,r2c2\nsingleValue\n", sw.toString());
    }

    @Test
    public void testPrintRecords_resultSet() throws SQLException, IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sw, format);

        final String[][] data = new String[][]{
            {"1", "Alice", "Engineer"},
            {"2", "Bob", "Designer"}
        };
        final int[] rowIndex = new int[]{-1};

        ResultSetMetaData metaData = (ResultSetMetaData) Proxy.newProxyInstance(
            CSVPrinterTest.class.getClassLoader(),
            new Class<?>[]{ResultSetMetaData.class},
            new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) {
                    if ("getColumnCount".equals(method.getName())) {
                        return 3;
                    }
                    return null;
                }
            }
        );

        ResultSet resultSet = (ResultSet) Proxy.newProxyInstance(
            CSVPrinterTest.class.getClassLoader(),
            new Class<?>[]{ResultSet.class},
            new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) {
                    if ("getMetaData".equals(method.getName())) {
                        return metaData;
                    }
                    if ("next".equals(method.getName())) {
                        rowIndex[0]++;
                        return rowIndex[0] < data.length;
                    }
                    if ("getString".equals(method.getName())) {
                        int colIndex = (Integer) args[0];
                        return data[rowIndex[0]][colIndex - 1];
                    }
                    return null;
                }
            }
        );

        printer.printRecords(resultSet);
        assertEquals("1,Alice,Engineer\n2,Bob,Designer\n", sw.toString());
    }
}
