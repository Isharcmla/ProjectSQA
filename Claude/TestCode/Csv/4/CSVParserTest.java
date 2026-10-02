import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

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

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CSVParserTest {

    private File tempFile;

    @Before
    public void setUp() throws IOException {
        tempFile = File.createTempFile("csvparsertest", ".csv");
    }

    @After
    public void tearDown() {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    private void writeToFile(String content) throws IOException {
        FileWriter writer = new FileWriter(tempFile);
        writer.write(content);
        writer.close();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_normalInput_success() throws IOException {
        Reader reader = new StringReader("a,b,c\n1,2,3\n");
        CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT);
        Assert.assertNotNull(parser);
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullReader_throwsException() throws IOException {
        new CSVParser(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullFormat_throwsException() throws IOException {
        Reader reader = new StringReader("a,b,c");
        new CSVParser(reader, null);
    }

    // ---------- Static factory: parse(File, CSVFormat) ----------

    @Test
    public void testParseFile_normalInput_returnsRecords() throws IOException {
        writeToFile("a,b,c\n1,2,3\n");
        CSVParser parser = CSVParser.parse(tempFile, CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(2, records.size());
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_nullFile_throwsException() throws IOException {
        CSVParser.parse((File) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_nullFormat_throwsException() throws IOException {
        CSVParser.parse(tempFile, null);
    }

    // ---------- Static factory: parse(String, CSVFormat) ----------

    @Test
    public void testParseString_normalInput_returnsRecords() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n1,2,3\n", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(2, records.size());
        parser.close();
    }

    @Test
    public void testParseString_emptyString_returnsEmptyRecords() throws IOException {
        CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        Assert.assertTrue(records.isEmpty());
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseString_nullString_throwsException() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseString_nullFormat_throwsException() throws IOException {
        CSVParser.parse("a,b,c", null);
    }

    // ---------- Static factory: parse(URL, Charset, CSVFormat) ----------

    @Test
    public void testParseURL_normalInput_returnsRecords() throws IOException {
        writeToFile("a,b,c\n1,2,3\n");
        URL url = tempFile.toURI().toURL();
        CSVParser parser = CSVParser.parse(url, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(2, records.size());
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullURL_throwsException() throws IOException {
        CSVParser.parse((URL) null, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullCharset_throwsException() throws IOException {
        URL url = tempFile.toURI().toURL();
        CSVParser.parse(url, null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullFormat_throwsException() throws IOException {
        URL url = tempFile.toURI().toURL();
        CSVParser.parse(url, Charset.forName("UTF-8"), null);
    }

    // ---------- close() ----------

    @Test
    public void testClose_normalCall_isClosedTrue() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n", CSVFormat.DEFAULT);
        Assert.assertFalse(parser.isClosed());
        parser.close();
        Assert.assertTrue(parser.isClosed());
    }

    @Test
    public void testClose_calledTwice_noException() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n", CSVFormat.DEFAULT);
        parser.close();
        parser.close(); // should not throw
        Assert.assertTrue(parser.isClosed());
    }

    // ---------- getCurrentLineNumber() ----------

    @Test
    public void testGetCurrentLineNumber_afterParsing_returnsCorrectLine() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\nc,d\n", CSVFormat.DEFAULT);
        Assert.assertEquals(0, parser.getCurrentLineNumber());
        parser.getRecords();
        Assert.assertTrue(parser.getCurrentLineNumber() > 0);
        parser.close();
    }

    // ---------- getHeaderMap() ----------

    @Test
    public void testGetHeaderMap_withHeaderFormat_returnsCorrectMap() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B", "C");
        CSVParser parser = CSVParser.parse("1,2,3\n", format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        Assert.assertEquals(3, headerMap.size());
        Assert.assertEquals(Integer.valueOf(0), headerMap.get("A"));
        Assert.assertEquals(Integer.valueOf(1), headerMap.get("B"));
        Assert.assertEquals(Integer.valueOf(2), headerMap.get("C"));
        parser.close();
    }

    @Test
    public void testGetHeaderMap_noHeaderFormat_returnsNullMapWrappedEmpty() throws IOException {
        CSVParser parser = CSVParser.parse("1,2,3\n", CSVFormat.DEFAULT);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        Assert.assertNull(headerMap);
        parser.close();
    }

    @Test
    public void testGetHeaderMap_emptyHeaderArray_readsFirstLineAsHeader() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        CSVParser parser = CSVParser.parse("X,Y,Z\n1,2,3\n", format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        Assert.assertEquals(3, headerMap.size());
        Assert.assertEquals(Integer.valueOf(0), headerMap.get("X"));
        parser.close();
    }

    @Test
    public void testGetHeaderMap_skipHeaderRecord_skipsFirstLine() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B").withSkipHeaderRecord(true);
        CSVParser parser = CSVParser.parse("A,B\n1,2\n", format);
        List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(1, records.size());
        parser.close();
    }

    // ---------- getRecordNumber() ----------

    @Test
    public void testGetRecordNumber_afterParsing_returnsCorrectCount() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\nc,d\ne,f\n", CSVFormat.DEFAULT);
        Assert.assertEquals(0, parser.getRecordNumber());
        parser.getRecords();
        Assert.assertEquals(3, parser.getRecordNumber());
        parser.close();
    }

    // ---------- getRecords() ----------

    @Test
    public void testGetRecords_normalInput_returnsAllRecords() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n1,2,3\n4,5,6\n", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(3, records.size());
        parser.close();
    }

    @Test
    public void testGetRecords_emptyInput_returnsEmptyList() throws IOException {
        CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        Assert.assertTrue(records.isEmpty());
        parser.close();
    }

    @Test
    public void testGetRecords_withComments_ignoresCommentInFieldParsing() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVParser parser = CSVParser.parse("a,b\n#comment\nc,d\n", format);
        List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(2, records.size());
        parser.close();
    }

    @Test(expected = IOException.class)
    public void testGetRecords_invalidToken_throwsIOException() throws IOException {
        // Malformed quoted input to trigger INVALID token type
        CSVFormat format = CSVFormat.DEFAULT;
        CSVParser parser = CSVParser.parse("\"a\"\"", format);
        parser.getRecords();
        parser.close();
    }

    // ---------- isClosed() ----------

    @Test
    public void testIsClosed_beforeClose_returnsFalse() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        Assert.assertFalse(parser.isClosed());
        parser.close();
    }

    @Test
    public void testIsClosed_afterClose_returnsTrue() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        parser.close();
        Assert.assertTrue(parser.isClosed());
    }

    // ---------- iterator() ----------

    @Test
    public void testIterator_normalInput_iteratesAllRecords() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\nc,d\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            CSVRecord record = iterator.next();
            Assert.assertNotNull(record);
            count++;
        }
        Assert.assertEquals(2, count);
        parser.close();
    }

    @Test
    public void testIterator_hasNextCalledMultipleTimes_consistentResult() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertTrue(iterator.hasNext());
        iterator.next();
        Assert.assertFalse(iterator.hasNext());
        parser.close();
    }

    @Test
    public void testIterator_nextWithoutHasNext_returnsRecord() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        CSVRecord record = iterator.next();
        Assert.assertNotNull(record);
        parser.close();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_nextAfterExhausted_throwsNoSuchElementException() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        iterator.next();
        iterator.next(); // should throw
        parser.close();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_nextAfterParserClosed_throwsNoSuchElementException() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        parser.close();
        iterator.next();
    }

    @Test
    public void testIterator_hasNextAfterParserClosed_returnsFalse() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        parser.close();
        Assert.assertFalse(iterator.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator_remove_throwsUnsupportedOperationException() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        iterator.remove();
    }

    @Test
    public void testIterator_emptyInput_hasNextFalse() throws IOException {
        CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        Assert.assertFalse(iterator.hasNext());
        parser.close();
    }

    // ---------- nullString handling in addRecordValue ----------

    @Test
    public void testGetRecords_withNullStringFormat_convertsMatchingValueToNull() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        CSVParser parser = CSVParser.parse("a,NULL,c\n", format);
        List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(1, records.size());
        CSVRecord record = records.get(0);
        Assert.assertNull(record.get(1));
        parser.close();
    }

    @Test
    public void testGetRecords_withoutNullStringFormat_keepsLiteralValue() throws IOException {
        CSVParser parser = CSVParser.parse("a,NULL,c\n", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        CSVRecord record = records.get(0);
        Assert.assertEquals("NULL", record.get(1));
        parser.close();
    }

    // ---------- multiple records with trailing data (EOF isReady branch) ----------

    @Test
    public void testGetRecords_noTrailingNewline_capturesLastRecord() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n1,2,3", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(2, records.size());
        parser.close();
    }

    // ---------- single value record ----------

    @Test
    public void testGetRecords_singleColumn_returnsSingleValue() throws IOException {
        CSVParser parser = CSVParser.parse("onlyvalue\n", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(1, records.size());
        Assert.assertEquals("onlyvalue", records.get(0).get(0));
        parser.close();
    }
}
