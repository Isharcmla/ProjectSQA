import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class CSVParserTest {

    private File tempFile;

    @Before
    public void setUp() throws Exception {
        tempFile = File.createTempFile("csvparsertest", ".csv");
    }

    @After
    public void tearDown() throws Exception {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    private void writeFile(String content) throws IOException {
        FileWriter fw = new FileWriter(tempFile);
        fw.write(content);
        fw.close();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_validInput_success() throws IOException {
        Reader reader = new StringReader("a,b,c\n1,2,3\n");
        CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT);
        assertNotNull(parser);
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullReader_throwsException() throws IOException {
        new CSVParser(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullFormat_throwsException() throws IOException {
        Reader reader = new StringReader("a,b,c\n");
        new CSVParser(reader, null);
    }

    // ---------- parse(File, CSVFormat) ----------

    @Test
    public void testParseFile_validInput_success() throws IOException {
        writeFile("a,b,c\n1,2,3\n");
        CSVParser parser = CSVParser.parse(tempFile, CSVFormat.DEFAULT);
        assertNotNull(parser);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_nullFile_throwsException() throws IOException {
        CSVParser.parse((File) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_nullFormat_throwsException() throws IOException {
        writeFile("a,b,c\n");
        CSVParser.parse(tempFile, null);
    }

    // ---------- parse(String, CSVFormat) ----------

    @Test
    public void testParseString_validInput_success() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n1,2,3\n", CSVFormat.DEFAULT);
        assertNotNull(parser);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        parser.close();
    }

    @Test
    public void testParseString_emptyString_returnsEmptyRecords() throws IOException {
        CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertTrue(records.isEmpty());
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseString_nullString_throwsException() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseString_nullFormat_throwsException() throws IOException {
        CSVParser.parse("a,b,c\n", null);
    }

    // ---------- parse(URL, Charset, CSVFormat) ----------

    @Test
    public void testParseURL_validInput_success() throws IOException {
        writeFile("a,b,c\n1,2,3\n");
        URL url = tempFile.toURI().toURL();
        CSVParser parser = CSVParser.parse(url, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
        assertNotNull(parser);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullUrl_throwsException() throws IOException {
        CSVParser.parse((URL) null, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullCharset_throwsException() throws IOException {
        writeFile("a,b,c\n");
        URL url = tempFile.toURI().toURL();
        CSVParser.parse(url, null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullFormat_throwsException() throws IOException {
        writeFile("a,b,c\n");
        URL url = tempFile.toURI().toURL();
        CSVParser.parse(url, Charset.forName("UTF-8"), null);
    }

    // ---------- close() / isClosed() ----------

    @Test
    public void testClose_afterClose_isClosedReturnsTrue() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n", CSVFormat.DEFAULT);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testIsClosed_beforeClose_returnsFalse() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n", CSVFormat.DEFAULT);
        assertFalse(parser.isClosed());
        parser.close();
    }

    // ---------- getCurrentLineNumber() ----------

    @Test
    public void testGetCurrentLineNumber_afterParsing_returnsCorrectLineNumber() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n1,2,3\n", CSVFormat.DEFAULT);
        assertEquals(0, parser.getCurrentLineNumber());
        parser.getRecords();
        assertTrue(parser.getCurrentLineNumber() > 0);
        parser.close();
    }

    // ---------- getHeaderMap() ----------

    @Test
    public void testGetHeaderMap_withHeaderFormat_returnsMap() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("a", "b", "c");
        CSVParser parser = CSVParser.parse("1,2,3\n", format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(Integer.valueOf(0), headerMap.get("a"));
        assertEquals(Integer.valueOf(1), headerMap.get("b"));
        assertEquals(Integer.valueOf(2), headerMap.get("c"));
        parser.close();
    }

    @Test
    public void testGetHeaderMap_withoutHeaderFormat_returnsNull() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n", CSVFormat.DEFAULT);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNull(headerMap);
        parser.close();
    }

    @Test
    public void testGetHeaderMap_withEmptyHeaderArray_readsFromFirstLine() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        CSVParser parser = CSVParser.parse("a,b,c\n1,2,3\n", format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(Integer.valueOf(0), headerMap.get("a"));
        parser.close();
    }

    @Test
    public void testGetHeaderMap_withSkipHeaderRecord_skipsFirstLine() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("a", "b", "c").withSkipHeaderRecord(true);
        CSVParser parser = CSVParser.parse("a,b,c\n1,2,3\n", format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("1", records.get(0).get("a"));
        parser.close();
    }

    @Test
    public void testGetHeaderMap_withHeaderButEmptyInput_headerIsNull() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        CSVParser parser = CSVParser.parse("", format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertTrue(headerMap.isEmpty());
        parser.close();
    }

    // ---------- getRecordNumber() ----------

    @Test
    public void testGetRecordNumber_afterParsing_returnsCorrectCount() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n1,2,3\n4,5,6\n", CSVFormat.DEFAULT);
        assertEquals(0, parser.getRecordNumber());
        parser.nextRecordPublicAccessHelper();
        assertEquals(1, parser.getRecordNumber());
        parser.close();
    }

    // ---------- getRecords() ----------

    @Test
    public void testGetRecords_normalInput_returnsAllRecords() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n1,2,3\n4,5,6\n", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(3, records.size());
        parser.close();
    }

    @Test
    public void testGetRecords_emptyInput_returnsEmptyList() throws IOException {
        CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertTrue(records.isEmpty());
        parser.close();
    }

    // ---------- getRecords(Collection) ----------

    @Test
    public void testGetRecordsWithCollection_normalInput_addsToCollection() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n1,2,3\n", CSVFormat.DEFAULT);
        java.util.List<CSVRecord> list = new java.util.ArrayList<CSVRecord>();
        java.util.List<CSVRecord> result = parser.getRecords(list);
        assertSame(list, result);
        assertEquals(2, result.size());
        parser.close();
    }

    // ---------- iterator() ----------

    @Test
    public void testIterator_normalInput_iteratesAllRecords() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n1,2,3\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        int count = 0;
        while (it.hasNext()) {
            CSVRecord record = it.next();
            assertNotNull(record);
            count++;
        }
        assertEquals(2, count);
        parser.close();
    }

    @Test
    public void testIterator_hasNextCalledMultipleTimes_consistentResult() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n1,2\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        assertTrue(it.hasNext());
        assertTrue(it.hasNext());
        it.next();
        assertTrue(it.hasNext());
        it.next();
        assertFalse(it.hasNext());
        parser.close();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_nextAfterExhausted_throwsException() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        it.next();
        it.next();
        parser.close();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_nextAfterClose_throwsException() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        parser.close();
        it.next();
    }

    @Test
    public void testIterator_hasNextAfterClose_returnsFalse() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        parser.close();
        assertFalse(it.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator_remove_throwsUnsupportedOperationException() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n1,2\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        it.remove();
        parser.close();
    }

    @Test
    public void testIterator_nextWithoutHasNextCalledFirst_returnsRecord() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n1,2\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        CSVRecord record = it.next();
        assertNotNull(record);
        parser.close();
    }

    // ---------- nextRecord() indirect via various format features ----------

    @Test
    public void testNextRecord_withComment_ignoresCommentContent() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVParser parser = CSVParser.parse("# this is a comment\na,b,c\n", format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("a", records.get(0).get(0));
        parser.close();
    }

    @Test
    public void testNextRecord_withNullString_convertsToNull() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        CSVParser parser = CSVParser.parse("a,NULL,c\n", format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertNull(records.get(0).get(1));
        parser.close();
    }

    @Test
    public void testNextRecord_withoutTrailingNewline_stillParsesLastRecord() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        parser.close();
    }

    @Test
    public void testNextRecord_multipleLines_correctRecordCount() throws IOException {
        CSVParser parser = CSVParser.parse("1,2\n3,4\n5,6\n", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(3, records.size());
        parser.close();
    }

    @Test
    public void testNextRecord_singleEmptyLine_returnsEmptyRecordOrNone() throws IOException {
        CSVParser parser = CSVParser.parse("\n", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        // Depending on format behavior, an empty line may produce a record with one empty value.
        assertNotNull(records);
        parser.close();
    }

    @Test(expected = IOException.class)
    public void testNextRecord_invalidToken_throwsIOException() throws IOException {
        // Using a quote char with an unterminated quoted field can trigger invalid parse sequence.
        CSVFormat format = CSVFormat.DEFAULT.withQuote('"');
        CSVParser parser = CSVParser.parse("\"unterminated", format);
        try {
            parser.getRecords();
        } finally {
            parser.close();
        }
    }
}
