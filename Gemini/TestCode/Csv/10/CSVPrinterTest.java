package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
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
    public void testConstructor_nullAppendable_throwsException() throws IOException {
        new CSVPrinter(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullFormat_throwsException() throws IOException {
        new CSVPrinter(new StringWriter(), null);
    }

    @Test
    public void testGetOut_returnsTargetAppendable() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        assertSame(sw, printer.getOut());
    }

    @Test
    public void testClose_closeableTarget_closesTarget() throws IOException {
        final boolean[] closed = new boolean[] { false };
        final Appendable out = new CloseableAppendable(closed, new boolean[] { false });
        final CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT);
        printer.close();
        assertTrue(closed[0]);
    }

    @Test
    public void testClose_nonCloseableTarget_doesNotThrow() throws IOException {
        final StringBuilder sb = new StringBuilder();
        final CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.close();
        assertEquals("", sb.toString());
    }

    @Test
    public void testFlush_flushableTarget_flushesTarget() throws IOException {
        final boolean[] flushed = new boolean[] { false };
        final Appendable out = new CloseableAppendable(new boolean[] { false }, flushed);
        final CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT);
        printer.flush();
        assertTrue(flushed[0]);
    }

    @Test
    public void testFlush_nonFlushableTarget_doesNotThrow() throws IOException {
        final StringBuilder sb = new StringBuilder();
        final CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.flush();
        assertEquals("", sb.toString());
    }

    @Test
    public void testPrint_nullValueWithNullString_printsNullString() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print(null);
        assertEquals("NULL", sw.toString());
    }

    @Test
    public void testPrint_nullValueWithoutNullString_printsEmpty() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print(null);
        assertEquals("\"\"", sw.toString());
    }

    @Test
    public void testPrint_multipleValues_appendsDelimiter() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print("a");
        printer.print("b");
        printer.print("c");
        assertEquals("a,b,c", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyAll_quotesAllValues() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.ALL);
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("hello");
        printer.print(123);
        assertEquals("\"hello\",\"123\"", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyNonNumeric_quotesOnlyStrings() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NON_NUMERIC);
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("hello");
        printer.print(123);
        printer.print(45.67);
        assertEquals("\"hello\",123,45.67", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyNone_escapesSpecialChars() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NONE).withEscape('\\');
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("hello,world");
        printer.print("line1\r\nline2");
        printer.print("esc\\char");
        assertEquals("hello\\,world,line1\\r\\nline2,esc\\\\char", sw.toString());
    }

    @Test
    public void testPrint_escapingWithoutQuotes_escapesSpecialChars() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.newFormat(',').withEscape('\\');
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("a,b");
        printer.print("c\nd");
        printer.print("e\rf");
        printer.print("g\\h");
        assertEquals("a\\,b,c\\nd,e\\rf,g\\\\h", sw.toString());
    }

    @Test
    public void testPrint_noQuotingNoEscaping_printsRaw() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.newFormat(',');
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("hello, world");
        printer.print("another");
        assertEquals("hello, world,another", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyMinimal_emptyFirstTokenQuoted() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print("");
        printer.print("");
        assertEquals("\"\",", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyMinimal_specialStartingCharsQuoted() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print("-value");
        printer.print("@value");
        printer.print("[value");
        assertEquals("\"-value\",\"@value\",\"[value\"", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyMinimal_commentCharOrLessStartingCharQuoted() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print("!value");
        printer.print("#value");
        printer.print("$value");
        assertEquals("\"!value\",\"#value\",$value", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyMinimal_containsDelimiterOrQuotesOrNewLine() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print("val,ue");
        printer.print("val\"ue");
        printer.print("val\nue");
        printer.print("val\rue");
        assertEquals("\"val,ue\",\"val\"\"ue\",\"val\nue\",\"val\rue\"", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyMinimal_trailingSpaceQuoted() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print("normal");
        printer.print("trailing ");
        assertEquals("normal,\"trailing \"", sw.toString());
    }

    @Test
    public void testPrint_quotePolicyMinimal_noEncapsulationNeeded() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print("SimpleText123");
        assertEquals("SimpleText123", sw.toString());
    }

    @Test
    public void testPrintln_customRecordSeparator() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\r\n");
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("a");
        printer.println();
        printer.print("b");
        assertEquals("a\r\nb", sw.toString());
    }

    @Test
    public void testPrintln_nullRecordSeparator() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator((String) null);
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("a");
        printer.println();
        printer.print("b");
        assertEquals("a,b", sw.toString());
    }

    @Test
    public void testPrintComment_disabledComment_doesNothing() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.printComment("This comment is ignored");
        assertEquals("", sw.toString());
    }

    @Test
    public void testPrintComment_singleLineAndMultiLine() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#').withRecordSeparator("\n");
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.printComment("Single line");
        printer.printComment("Line 1\r\nLine 2\nLine 3\rLine 4");
        final String expected = "# Single line\n" +
                                "# Line 1\n# Line 2\n# Line 3\n# Line 4\n";
        assertEquals(expected, sw.toString());
    }

    @Test
    public void testPrintComment_afterRecordValue_startsOnNewLine() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#').withRecordSeparator("\n");
        final CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("record1");
        printer.printComment("comment after record");
        final String expected = "record1\n# comment after record\n";
        assertEquals(expected, sw.toString());
    }

    @Test
    public void testPrintRecord_varargs_printsValuesAndNewline() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT.withRecordSeparator("\r\n"));
        printer.printRecord("A", "B", "C");
        assertEquals("A,B,C\r\n", sw.toString());
    }

    @Test
    public void testPrintRecord_emptyVarargs_printsOnlyNewline() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT.withRecordSeparator("\r\n"));
        printer.printRecord();
        assertEquals("\r\n", sw.toString());
    }

    @Test
    public void testPrintRecord_iterable_printsValuesAndNewline() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT.withRecordSeparator("\n"));
        printer.printRecord(Arrays.asList("X", "Y", "Z"));
        assertEquals("X,Y,Z\n", sw.toString());
    }

    @Test
    public void testPrintRecords_iterable_variousTypes() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT.withRecordSeparator("\n"));
        final List<Object> records = new ArrayList<Object>();
        records.add(new Object[] { "r1c1", "r1c2" });
        records.add(Arrays.asList("r2c1", "r2c2"));
        records.add("singleValue");

        printer.printRecords(records);
        final String expected = "r1c1,r1c2\nr2c1,r2c2\nsingleValue\n";
        assertEquals(expected, sw.toString());
    }

    @Test
    public void testPrintRecords_array_variousTypes() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT.withRecordSeparator("\n"));
        final Object[] records = new Object[] {
            new Object[] { "r1c1", "r1c2" },
            Arrays.asList("r2c1", "r2c2"),
            "singleValue"
        };

        printer.printRecords(records);
        final String expected = "r1c1,r1c2\nr2c1,r2c2\nsingleValue\n";
        assertEquals(expected, sw.toString());
    }

    @Test
    public void testPrintRecords_emptyCollectionsAndArrays() throws IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.printRecords(Collections.emptyList());
        printer.printRecords(new Object[0]);
        assertEquals("", sw.toString());
    }

    @Test
    public void testPrintRecords_resultSet() throws SQLException, IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT.withRecordSeparator("\n"));

        final String[][] data = new String[][] {
            { "1", "Alice", "alice@example.com" },
            { "2", "Bob", "bob@example.com" }
        };
        final ResultSet resultSet = createMockResultSet(data, 3);

        printer.printRecords(resultSet);
        final String expected = "1,Alice,alice@example.com\n2,Bob,bob@example.com\n";
        assertEquals(expected, sw.toString());
    }

    @Test
    public void testPrintRecords_emptyResultSet() throws SQLException, IOException {
        final StringWriter sw = new StringWriter();
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT.withRecordSeparator("\n"));

        final String[][] data = new String[0][0];
        final ResultSet resultSet = createMockResultSet(data, 2);

        printer.printRecords(resultSet);
        assertEquals("", sw.toString());
    }

    private ResultSet createMockResultSet(final String[][] data, final int columnCount) {
        final InvocationHandler handler = new InvocationHandler() {
            private int cursor = -1;

            public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
                final String methodName = method.getName();
                if ("next".equals(methodName)) {
                    cursor++;
                    return cursor < data.length;
                } else if ("getString".equals(methodName)) {
                    final int colIndex = ((Integer) args[0]).intValue() - 1;
                    return data[cursor][colIndex];
                } else if ("getMetaData".equals(methodName)) {
                    return Proxy.newProxyInstance(
                        ResultSetMetaData.class.getClassLoader(),
                        new Class<?>[] { ResultSetMetaData.class },
                        new InvocationHandler() {
                            public Object invoke(final Object proxyMd, final Method methodMd, final Object[] argsMd) {
                                if ("getColumnCount".equals(methodMd.getName())) {
                                    return columnCount;
                                }
                                return null;
                            }
                        }
                    );
                }
                return null;
            }
        };

        return (ResultSet) Proxy.newProxyInstance(
            ResultSet.class.getClassLoader(),
            new Class<?>[] { ResultSet.class },
            handler
        );
    }

    private static class CloseableAppendable implements Appendable, Closeable, Flushable {
        private final boolean[] closed;
        private final boolean[] flushed;
        private final StringBuilder sb = new StringBuilder();

        public CloseableAppendable(final boolean[] closed, final boolean[] flushed) {
            this.closed = closed;
            this.flushed = flushed;
        }

        public Appendable append(final CharSequence csq) throws IOException {
            sb.append(csq);
            return this;
        }

        public Appendable append(final CharSequence csq, final int start, final int end) throws IOException {
            sb.append(csq, start, end);
            return this;
        }

        public Appendable append(final char c) throws IOException {
            sb.append(c);
            return this;
        }

        public void flush() throws IOException {
            flushed[0] = true;
        }

        public void close() throws IOException {
            closed[0] = true;
        }

        @Override
        public String toString() {
            return sb.toString();
        }
    }
}
