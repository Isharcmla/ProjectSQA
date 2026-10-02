package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.junit.Test;

/**
 * Unit tests for {@link CSVParser}.
 */
public class CSVParserTest {

    private static final Charset UTF_8 = StandardCharsets.UTF_8;

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_nullFile_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((File) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_nullFormat_throwsIllegalArgumentException() throws IOException {
        File tempFile = File.createTempFile("csv_test", ".csv");
        tempFile.deleteOnExit();
        CSVParser.parse(tempFile, null);
    }

    @Test
    public void testParseFile_validFile_parsesSuccessfully() throws IOException {
        File tempFile = File.createTempFile("csv_test", ".csv");
        tempFile.deleteOnExit();
        Writer writer = new OutputStreamWriter(new FileOutputStream(tempFile), UTF_8);
        writer.write("a,b\n1,2");
        writer.close();

        CSVParser parser = CSVParser.parse(tempFile, CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("b", records.get(0).get(1));
        assertEquals("1", records.get(1).get(0));
        assertEquals("2", records.get(1).get(1));
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseString_nullString_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseString_nullFormat_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse("a,b", null);
    }

    @Test
    public void testParseString_validString_parsesSuccessfully() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n1,2,3", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("3", records.get(1).get(2));
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseUrl_nullUrl_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((URL) null, UTF_8, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseUrl_nullCharset_throwsIllegalArgumentException() throws IOException {
        File tempFile = File.createTempFile("csv_test", ".csv");
        tempFile.deleteOnExit();
        CSVParser.parse(tempFile.toURI().toURL(), null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseUrl_nullFormat_throwsIllegalArgumentException() throws IOException {
        File tempFile = File.createTempFile("csv_test", ".csv");
        tempFile.deleteOnExit();
        CSVParser.parse(tempFile.toURI().toURL(), UTF_8, null);
    }

    @Test
    public void testParseUrl_validUrl_parsesSuccessfully() throws IOException {
        File tempFile = File.createTempFile("csv_test", ".csv");
        tempFile.deleteOnExit();
        Writer writer = new OutputStreamWriter(new FileOutputStream(tempFile), UTF_8);
        writer.write("x,y\n7,8");
        writer.close();

        CSVParser parser = CSVParser.parse(tempFile.toURI().toURL(), UTF_8, CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("x", records.get(0).get(0));
        assertEquals("8", records.get(1).get(1));
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullReader_throwsIllegalArgumentException() throws IOException {
        new CSVParser(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullFormat_throwsIllegalArgumentException() throws IOException {
        new CSVParser(new StringReader(""), null);
    }

    @Test
    public void testHeaderHandling_noHeaderSpecified_getHeaderMapReturnsNull() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\n1,2"), CSVFormat.DEFAULT);
        assertNull(parser.getHeaderMap());
        parser.close();
    }

    @Test
    public void testHeaderHandling_emptyHeaderArray_readsFirstRecordAsHeader() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader(new String[0]);
        CSVParser parser = new CSVParser(new StringReader("col1,col2\nval1,val2"), format);
        Map<String, Integer> headerMap = parser.getHeaderMap();

        assertNotNull(headerMap);
        assertEquals(2, headerMap.size());
        assertEquals(Integer.valueOf(0), headerMap.get("col1"));
        assertEquals(Integer.valueOf(1), headerMap.get("col2"));

        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("val1", records.get(0).get("col1"));
        assertEquals("val2", records.get(0).get("col2"));
        parser.close();
    }

    @Test
    public void testHeaderHandling_emptyHeaderArray_emptyInput_headerMapRemainsEmpty() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader(new String[0]);
        CSVParser parser = new CSVParser(new StringReader(""), format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertTrue(headerMap.isEmpty());
        parser.close();
    }

    @Test
    public void testHeaderHandling_explicitHeader_skipHeaderRecordFalse() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("h1", "h2").withSkipHeaderRecord(false);
        CSVParser parser = new CSVParser(new StringReader("a,b\nc,d"), format);

        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(Integer.valueOf(0), headerMap.get("h1"));
        assertEquals(Integer.valueOf(1), headerMap.get("h2"));

        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("a", records.get(0).get("h1"));
        assertEquals("b", records.get(0).get("h2"));
        parser.close();
    }

    @Test
    public void testHeaderHandling_explicitHeader_skipHeaderRecordTrue() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("h1", "h2").withSkipHeaderRecord(true);
        CSVParser parser = new CSVParser(new StringReader("colA,colB\nval1,val2"), format);

        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(Integer.valueOf(0), headerMap.get("h1"));
        assertEquals(Integer.valueOf(1), headerMap.get("h2"));

        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("val1", records.get(0).get("h1"));
        assertEquals("val2", records.get(0).get("h2"));
        parser.close();
    }

    @Test
    public void testGetHeaderMap_isDefensiveCopy() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B");
        CSVParser parser = new CSVParser(new StringReader("1,2"), format);

        Map<String, Integer> headerMap1 = parser.getHeaderMap();
        headerMap1.put("C", 2);

        Map<String, Integer> headerMap2 = parser.getHeaderMap();
        assertEquals(2, headerMap2.size());
        assertFalse(headerMap2.containsKey("C"));
        parser.close();
    }

    @Test
    public void testNullString_substitutesNullValuesCorrectly() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        CSVParser parser = new CSVParser(new StringReader("NULL,null,val,NULL"), format);

        CSVRecord record = parser.nextRecord();
        assertNotNull(record);
        assertNull(record.get(0));
        assertNull(record.get(1));
        assertEquals("val", record.get(2));
        assertNull(record.get(3));
        parser.close();
    }

    @Test
    public void testComments_singleAndMultiLine_extractedProperly() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVParser parser = new CSVParser(new StringReader("# comment line 1\n# comment line 2\na,b"), format);

        CSVRecord record = parser.nextRecord();
        assertNotNull(record);
        assertEquals("a", record.get(0));
        assertEquals("b", record.get(1));
        assertEquals("comment line 1\ncomment line 2", record.getComment());
        parser.close();
    }

    @Test
    public void testLineAndRecordNumberTracking() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\n\"c\nd\",e\nf,g"), CSVFormat.DEFAULT);

        assertEquals(0, parser.getRecordNumber());
        assertEquals(1, parser.getCurrentLineNumber());

        CSVRecord record1 = parser.nextRecord();
        assertNotNull(record1);
        assertEquals(1, parser.getRecordNumber());
        assertEquals(1, record1.getRecordNumber());

        CSVRecord record2 = parser.nextRecord();
        assertNotNull(record2);
        assertEquals(2, parser.getRecordNumber());
        assertEquals(2, record2.getRecordNumber());
        assertEquals(3, parser.getCurrentLineNumber());

        CSVRecord record3 = parser.nextRecord();
        assertNotNull(record3);
        assertEquals(3, parser.getRecordNumber());
        assertEquals(3, record3.getRecordNumber());

        assertNull(parser.nextRecord());
        parser.close();
    }

    @Test
    public void testGetRecords_returnsAllRemainingRecords() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\nc,d\ne,f"), CSVFormat.DEFAULT);
        parser.nextRecord(); // consumes first record

        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("c", records.get(0).get(0));
        assertEquals("e", records.get(1).get(0));
        parser.close();
    }

    @Test
    public void testGetRecordsWithCustomCollection() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\nc,d"), CSVFormat.DEFAULT);
        List<CSVRecord> customList = new ArrayList<CSVRecord>();
        List<CSVRecord> returned = parser.getRecords(customList);

        assertTrue(customList == returned);
        assertEquals(2, customList.size());
        assertEquals("a", customList.get(0).get(0));
        parser.close();
    }

    @Test
    public void testEmptyInput_returnsEmptyRecordList() throws IOException {
        CSVParser parser = new CSVParser(new StringReader(""), CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertTrue(records.isEmpty());
        parser.close();
    }

    @Test
    public void testCloseAndIsClosed() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b"), CSVFormat.DEFAULT);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
        parser.close(); // closing twice shouldn't throw error
        assertTrue(parser.isClosed());
    }

    @Test
    public void testIterator_standardTraversal() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\nc,d"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();

        assertTrue(iterator.hasNext());
        assertTrue(iterator.hasNext()); // multiple calls to hasNext() idempotent
        CSVRecord rec1 = iterator.next();
        assertEquals("a", rec1.get(0));

        assertTrue(iterator.hasNext());
        CSVRecord rec2 = iterator.next();
        assertEquals("c", rec2.get(0));

        assertFalse(iterator.hasNext());
        parser.close();
    }

    @Test
    public void testIterator_nextWithoutHasNext() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\nc,d"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();

        CSVRecord rec1 = iterator.next();
        assertEquals("a", rec1.get(0));
        CSVRecord rec2 = iterator.next();
        assertEquals("c", rec2.get(0));

        try {
            iterator.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            assertEquals("No more CSV records available", e.getMessage());
        }
        parser.close();
    }

    @Test
    public void testIterator_onClosedParser_behavior() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        parser.close();

        assertFalse(iterator.hasNext());
        try {
            iterator.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            assertEquals("CSVParser has been closed", e.getMessage());
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator_remove_throwsUnsupportedOperationException() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        iterator.remove();
    }

    @Test(expected = RuntimeException.class)
    public void testIterator_ioExceptionDuringNext_throwsRuntimeException() throws IOException {
        Reader failingReader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Simulated IO failure");
            }

            @Override
            public void close() throws IOException {
            }
        };

        CSVParser parser = new CSVParser(failingReader, CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        iterator.hasNext();
    }

    @Test(expected = IOException.class)
    public void testInvalidParseSequence_throwsIOException() throws IOException {
        // Unclosed quoted string followed by invalid sequence when expecting quote
        CSVParser parser = new CSVParser(new StringReader("a,\"b"), CSVFormat.DEFAULT);
        parser.getRecords();
    }

    @Test
    public void testRecordWithoutTrailingNewlineAtEOF() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b,c"), CSVFormat.DEFAULT);
        CSVRecord record = parser.nextRecord();
        assertNotNull(record);
        assertArrayEquals(new String[]{"a", "b", "c"}, record.values());
        assertNull(parser.nextRecord());
        parser.close();
    }
}
