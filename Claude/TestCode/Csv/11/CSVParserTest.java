import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CSVParserTest {

    private File tempFile;

    @Before
    public void setUp() throws IOException {
        tempFile = File.createTempFile("csvParserTest", ".csv");
    }

    @After
    public void tearDown() {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    private void writeToTempFile(String content) throws IOException {
        FileWriter writer = new FileWriter(tempFile);
        try {
            writer.write(content);
        } finally {
            writer.close();
        }
    }

    // ---------- parse(String, CSVFormat) ----------

    @Test
    public void testParseString_normalInput_returnsRecords() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n1,2,3\n", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("3", records.get(1).get(2));
        parser.close();
    }

    @Test
    public void testParseString_emptyString_returnsEmptyList() throws IOException {
        CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertTrue(records.isEmpty());
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseString_nullString_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseString_nullFormat_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse("a,b,c", (CSVFormat) null);
    }

    // ---------- parse(File, Charset, CSVFormat) ----------

    @Test
    public void testParseFile_normalInput_returnsRecords() throws IOException {
        writeToTempFile("x,y\n1,2\n");
        CSVParser parser = CSVParser.parse(tempFile, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_nullFile_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((File) null, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_nullFormat_throwsIllegalArgumentException() throws IOException {
        writeToTempFile("a,b\n");
        CSVParser.parse(tempFile, Charset.forName("UTF-8"), (CSVFormat) null);
    }

    // ---------- parse(URL, Charset, CSVFormat) ----------

    @Test
    public void testParseURL_normalInput_returnsRecords() throws IOException {
        writeToTempFile("m,n\n5,6\n");
        URL url = tempFile.toURI().toURL();
        CSVParser parser = CSVParser.parse(url, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullUrl_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((URL) null, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullCharset_throwsIllegalArgumentException() throws IOException {
        writeToTempFile("a,b\n");
        URL url = tempFile.toURI().toURL();
        CSVParser.parse(url, (Charset) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullFormat_throwsIllegalArgumentException() throws IOException {
        writeToTempFile("a,b\n");
        URL url = tempFile.toURI().toURL();
        CSVParser.parse(url, Charset.forName("UTF-8"), (CSVFormat) null);
    }

    // ---------- Constructor ----------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullReader_throwsIllegalArgumentException() throws IOException {
        new CSVParser((StringReader) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullFormat_throwsIllegalArgumentException() throws IOException {
        new CSVParser(new StringReader("a,b"), (CSVFormat) null);
    }

    // ---------- getRecords ----------

    @Test
    public void testGetRecords_typicalCsv_returnsCorrectRecords() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("1,2,3\n4,5,6\n"), CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("1", records.get(0).get(0));
        assertEquals("6", records.get(1).get(2));
        parser.close();
    }

    @Test
    public void testGetRecords_withCollection_addsToProvidedCollection() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\nc,d\n"), CSVFormat.DEFAULT);
        List<CSVRecord> collection = new ArrayList<CSVRecord>();
        List<CSVRecord> result = parser.getRecords(collection);
        assertSame(collection, result);
        assertEquals(2, result.size());
        parser.close();
    }

    // ---------- getHeaderMap ----------

    @Test
    public void testGetHeaderMap_withHeaderFormat_returnsHeaderMap() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B", "C");
        CSVParser parser = new CSVParser(new StringReader("1,2,3\n"), format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(Integer.valueOf(0), headerMap.get("A"));
        assertEquals(Integer.valueOf(1), headerMap.get("B"));
        assertEquals(Integer.valueOf(2), headerMap.get("C"));
        parser.close();
    }

    @Test
    public void testGetHeaderMap_noHeaderFormat_returnsNull() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("1,2,3\n"), CSVFormat.DEFAULT);
        assertNull(parser.getHeaderMap());
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetHeaderMap_duplicateHeader_throwsIllegalArgumentException() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "A");
        new CSVParser(new StringReader("1,2\n"), format);
    }

    @Test
    public void testGetHeaderMap_emptyHeaderIgnored_doesNotThrow() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("", "").withIgnoreEmptyHeaders(true);
        CSVParser parser = new CSVParser(new StringReader("1,2\n"), format);
        assertNotNull(parser.getHeaderMap());
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetHeaderMap_emptyHeaderNotIgnored_throwsIllegalArgumentException() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("", "").withIgnoreEmptyHeaders(false);
        new CSVParser(new StringReader("1,2\n"), format);
    }

    @Test
    public void testHeaderFromFirstLine_emptyHeaderArray_usesFirstRecordAsHeader() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        CSVParser parser = new CSVParser(new StringReader("x,y,z\n1,2,3\n"), format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(Integer.valueOf(0), headerMap.get("x"));
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("1", records.get(0).get(0));
        parser.close();
    }

    @Test
    public void testSkipHeaderRecord_skipsFirstRecord() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B").withSkipHeaderRecord(true);
        CSVParser parser = new CSVParser(new StringReader("A,B\n1,2\n"), format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("1", records.get(0).get(0));
        parser.close();
    }

    // ---------- getRecordNumber / getCurrentLineNumber ----------

    @Test
    public void testGetRecordNumber_afterParsing_incrementsCorrectly() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a\nb\nc\n"), CSVFormat.DEFAULT);
        assertEquals(0, parser.getRecordNumber());
        parser.getRecords();
        assertEquals(3, parser.getRecordNumber());
        parser.close();
    }

    @Test
    public void testGetCurrentLineNumber_afterParsing_returnsLineNumber() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a\nb\nc\n"), CSVFormat.DEFAULT);
        assertEquals(0, parser.getCurrentLineNumber());
        parser.getRecords();
        assertTrue(parser.getCurrentLineNumber() >= 3);
        parser.close();
    }

    // ---------- isClosed / close ----------

    @Test
    public void testIsClosed_beforeAndAfterClose_returnsCorrectState() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\n"), CSVFormat.DEFAULT);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testClose_calledTwice_doesNotThrow() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\n"), CSVFormat.DEFAULT);
        parser.close();
        parser.close();
        assertTrue(parser.isClosed());
    }

    // ---------- iterator ----------

    @Test
    public void testIterator_hasNextAndNext_iteratesAllRecords() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("1\n2\n3\n"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        int count = 0;
        while (it.hasNext()) {
            CSVRecord record = it.next();
            assertNotNull(record);
            count++;
        }
        assertEquals(3, count);
        parser.close();
    }

    @Test
    public void testIterator_nextWithoutHasNext_returnsRecord() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("1,2\n"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        CSVRecord record = it.next();
        assertNotNull(record);
        assertEquals("1", record.get(0));
        parser.close();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_nextAfterExhausted_throwsNoSuchElementException() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("1\n"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        it.next();
        it.next();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator_remove_throwsUnsupportedOperationException() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("1\n"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        it.remove();
    }

    @Test
    public void testIterator_afterClose_hasNextReturnsFalse() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("1,2\n3,4\n"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        parser.close();
        assertFalse(it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_afterClose_nextThrowsNoSuchElementException() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("1,2\n3,4\n"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        parser.close();
        it.next();
    }

    // ---------- null string handling ----------

    @Test
    public void testNullStringHandling_convertsToNull() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        CSVParser parser = new CSVParser(new StringReader("a,NULL,c\n"), format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertNull(records.get(0).get(1));
        parser.close();
    }

    // ---------- comment handling ----------

    @Test
    public void testCommentHandling_ignoresComments() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVParser parser = new CSVParser(new StringReader("# comment line\na,b,c\n"), format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("a", records.get(0).get(0));
        parser.close();
    }
}
