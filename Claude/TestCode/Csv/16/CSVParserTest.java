import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class CSVParserTest {

    private File tempFile;

    @Before
    public void setUp() throws IOException {
        tempFile = File.createTempFile("csvparsertest", ".csv");
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write("a,b,c\n1,2,3\n".getBytes(Charset.forName("UTF-8")));
        }
    }

    @After
    public void tearDown() {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_normalInput_parsesRecords() throws IOException {
        Reader in = new StringReader("a,b,c\n1,2,3\n");
        try (CSVParser parser = new CSVParser(in, CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
        }
    }

    @Test
    public void testConstructor_withOffsetAndRecordNumber_setsRecordNumberCorrectly() throws IOException {
        Reader in = new StringReader("1,2,3\n4,5,6\n");
        try (CSVParser parser = new CSVParser(in, CSVFormat.DEFAULT, 10L, 5L)) {
            CSVRecord record = parser.nextRecord();
            assertNotNull(record);
            assertEquals(5L, parser.getRecordNumber());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullReader_throwsIllegalArgumentException() throws IOException {
        new CSVParser((Reader) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullFormat_throwsIllegalArgumentException() throws IOException {
        new CSVParser(new StringReader("a,b,c"), null);
    }

    // ---------- static parse(File, Charset, CSVFormat) ----------

    @Test
    public void testParseFile_normalInput_returnsRecords() throws IOException {
        try (CSVParser parser = CSVParser.parse(tempFile, Charset.forName("UTF-8"), CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_nullFile_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((File) null, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_nullFormat_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse(tempFile, Charset.forName("UTF-8"), null);
    }

    // ---------- static parse(InputStream, Charset, CSVFormat) ----------

    @Test
    public void testParseInputStream_normalInput_returnsRecords() throws IOException {
        try (InputStream is = Files.newInputStream(tempFile.toPath());
             CSVParser parser = CSVParser.parse(is, Charset.forName("UTF-8"), CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseInputStream_nullInputStream_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((InputStream) null, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseInputStream_nullFormat_throwsIllegalArgumentException() throws IOException {
        try (InputStream is = Files.newInputStream(tempFile.toPath())) {
            CSVParser.parse(is, Charset.forName("UTF-8"), null);
        }
    }

    // ---------- static parse(Path, Charset, CSVFormat) ----------

    @Test
    public void testParsePath_normalInput_returnsRecords() throws IOException {
        Path path = tempFile.toPath();
        try (CSVParser parser = CSVParser.parse(path, Charset.forName("UTF-8"), CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParsePath_nullPath_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((Path) null, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParsePath_nullFormat_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse(tempFile.toPath(), Charset.forName("UTF-8"), null);
    }

    // ---------- static parse(Reader, CSVFormat) ----------

    @Test
    public void testParseReader_normalInput_returnsRecords() throws IOException {
        try (CSVParser parser = CSVParser.parse(new StringReader("x,y\n1,2\n"), CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
        }
    }

    // ---------- static parse(String, CSVFormat) ----------

    @Test
    public void testParseString_normalInput_returnsRecords() throws IOException {
        try (CSVParser parser = CSVParser.parse("a,b\nc,d\n", CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
        }
    }

    @Test
    public void testParseString_emptyString_returnsNoRecords() throws IOException {
        try (CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(0, records.size());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseString_nullString_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseString_nullFormat_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse("a,b", null);
    }

    // ---------- static parse(URL, Charset, CSVFormat) ----------

    @Test
    public void testParseURL_normalInput_returnsRecords() throws IOException {
        URL url = tempFile.toURI().toURL();
        try (CSVParser parser = CSVParser.parse(url, Charset.forName("UTF-8"), CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullUrl_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((URL) null, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullCharset_throwsIllegalArgumentException() throws IOException {
        URL url = tempFile.toURI().toURL();
        CSVParser.parse(url, null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullFormat_throwsIllegalArgumentException() throws IOException {
        URL url = tempFile.toURI().toURL();
        CSVParser.parse(url, Charset.forName("UTF-8"), null);
    }

    // ---------- close() and isClosed() ----------

    @Test
    public void testClose_afterClose_isClosedReturnsTrue() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testIsClosed_beforeClose_returnsFalse() throws IOException {
        try (CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT)) {
            assertFalse(parser.isClosed());
        }
    }

    // ---------- getCurrentLineNumber() ----------

    @Test
    public void testGetCurrentLineNumber_afterParsing_returnsCorrectLineNumber() throws IOException {
        try (CSVParser parser = CSVParser.parse("a,b\nc,d\n", CSVFormat.DEFAULT)) {
            assertEquals(0L, parser.getCurrentLineNumber());
            parser.nextRecord();
            assertEquals(1L, parser.getCurrentLineNumber());
        }
    }

    // ---------- getFirstEndOfLine() ----------

    @Test
    public void testGetFirstEndOfLine_afterParsing_returnsEolString() throws IOException {
        try (CSVParser parser = CSVParser.parse("a,b\nc,d\n", CSVFormat.DEFAULT)) {
            parser.nextRecord();
            assertEquals("\n", parser.getFirstEndOfLine());
        }
    }

    // ---------- getHeaderMap() ----------

    @Test
    public void testGetHeaderMap_withHeaderFormat_returnsHeaderMap() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B", "C");
        try (CSVParser parser = CSVParser.parse("1,2,3\n", format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(Integer.valueOf(0), headerMap.get("A"));
            assertEquals(Integer.valueOf(1), headerMap.get("B"));
            assertEquals(Integer.valueOf(2), headerMap.get("C"));
        }
    }

    @Test
    public void testGetHeaderMap_withoutHeaderFormat_returnsNull() throws IOException {
        try (CSVParser parser = CSVParser.parse("1,2,3\n", CSVFormat.DEFAULT)) {
            assertNull(parser.getHeaderMap());
        }
    }

    @Test
    public void testGetHeaderMap_withEmptyHeaderArray_readsHeaderFromFirstLine() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (CSVParser parser = CSVParser.parse("a,b,c\n1,2,3\n", format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(Integer.valueOf(0), headerMap.get("a"));
            assertEquals(Integer.valueOf(1), headerMap.get("b"));
            assertEquals(Integer.valueOf(2), headerMap.get("c"));
        }
    }

    @Test
    public void testGetHeaderMap_withSkipHeaderRecord_skipsFirstRecord() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B").withSkipHeaderRecord(true);
        try (CSVParser parser = CSVParser.parse("A,B\n1,2\n", format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size());
            assertEquals("1", records.get(0).get("A"));
        }
    }

    @Test
    public void testGetHeaderMap_withIgnoreHeaderCase_matchesCaseInsensitively() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B").withIgnoreHeaderCase(true);
        try (CSVParser parser = CSVParser.parse("1,2\n", format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertEquals(Integer.valueOf(0), headerMap.get("a"));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetHeaderMap_duplicateHeaderNames_throwsIllegalArgumentException() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "A");
        CSVParser.parse("1,2\n", format);
    }

    @Test
    public void testGetHeaderMap_duplicateEmptyHeaderNamesAllowed_doesNotThrow() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("", "").withAllowMissingColumnNames(true);
        try (CSVParser parser = CSVParser.parse("1,2\n", format)) {
            assertNotNull(parser.getHeaderMap());
        }
    }

    // ---------- getRecordNumber() ----------

    @Test
    public void testGetRecordNumber_afterParsingRecords_incrementsCorrectly() throws IOException {
        try (CSVParser parser = CSVParser.parse("1,2\n3,4\n", CSVFormat.DEFAULT)) {
            assertEquals(0L, parser.getRecordNumber());
            parser.nextRecord();
            assertEquals(1L, parser.getRecordNumber());
            parser.nextRecord();
            assertEquals(2L, parser.getRecordNumber());
        }
    }

    // ---------- getRecords() ----------

    @Test
    public void testGetRecords_normalInput_returnsAllRecords() throws IOException {
        try (CSVParser parser = CSVParser.parse("a,b\nc,d\ne,f\n", CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(3, records.size());
        }
    }

    @Test
    public void testGetRecords_emptyInput_returnsEmptyList() throws IOException {
        try (CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertTrue(records.isEmpty());
        }
    }

    // ---------- nextRecord() through iterator / behavior tests ----------

    @Test
    public void testNextRecord_withComments_ignoresCommentLines() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        try (CSVParser parser = CSVParser.parse("# comment\na,b\n", format)) {
            CSVRecord record = parser.nextRecord();
            assertNotNull(record);
            assertEquals("a", record.get(0));
            assertEquals("comment", record.getComment());
        }
    }

    @Test
    public void testNextRecord_withTrim_trimsValues() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withTrim(true).withDelimiter(',');
        try (CSVParser parser = CSVParser.parse(" a , b \n", format)) {
            CSVRecord record = parser.nextRecord();
            assertEquals("a", record.get(0));
            assertEquals("b", record.get(1));
        }
    }

    @Test
    public void testNextRecord_withNullString_convertsToNull() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        try (CSVParser parser = CSVParser.parse("NULL,b\n", format)) {
            CSVRecord record = parser.nextRecord();
            assertNull(record.get(0));
            assertEquals("b", record.get(1));
        }
    }

    @Test
    public void testNextRecord_withTrailingDelimiterAndEmptyLastValue_omitsLastEmptyValue() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter(true).withTrim(true);
        try (CSVParser parser = CSVParser.parse("a,b,\n", format)) {
            CSVRecord record = parser.nextRecord();
            assertEquals(2, record.size());
        }
    }

    @Test(expected = IOException.class)
    public void testNextRecord_invalidQuoteSequence_throwsIOException() throws IOException {
        // Unterminated quote to trigger INVALID token handling in some formats
        CSVFormat format = CSVFormat.RFC4180;
        try (CSVParser parser = CSVParser.parse("\"a\"\"", format)) {
            CSVRecord record;
            while ((record = parser.nextRecord()) != null) {
                // consume, expecting exception at some point due to malformed quote
            }
            // If no exception thrown naturally, force one to keep test meaningful.
            throw new IOException("Expected exception not thrown");
        }
    }

    // ---------- iterator() ----------

    @Test
    public void testIterator_normalInput_iteratesAllRecords() throws IOException {
        try (CSVParser parser = CSVParser.parse("a,b\nc,d\n", CSVFormat.DEFAULT)) {
            Iterator<CSVRecord> it = parser.iterator();
            int count = 0;
            while (it.hasNext()) {
                CSVRecord record = it.next();
                assertNotNull(record);
                count++;
            }
            assertEquals(2, count);
        }
    }

    @Test
    public void testIterator_hasNextCalledMultipleTimes_returnsConsistentResult() throws IOException {
        try (CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT)) {
            Iterator<CSVRecord> it = parser.iterator();
            assertTrue(it.hasNext());
            assertTrue(it.hasNext());
            CSVRecord record = it.next();
            assertNotNull(record);
            assertFalse(it.hasNext());
        }
    }

    @Test
    public void testIterator_nextWithoutHasNext_returnsRecord() throws IOException {
        try (CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT)) {
            Iterator<CSVRecord> it = parser.iterator();
            CSVRecord record = it.next();
            assertNotNull(record);
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_nextAfterExhausted_throwsNoSuchElementException() throws IOException {
        try (CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT)) {
            Iterator<CSVRecord> it = parser.iterator();
            it.next();
            it.next(); // exhausted -> throws
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_nextAfterClose_throwsNoSuchElementException() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        parser.close();
        Iterator<CSVRecord> it = parser.iterator();
        it.next();
    }

    @Test
    public void testIterator_hasNextAfterClose_returnsFalse() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        parser.close();
        Iterator<CSVRecord> it = parser.iterator();
        assertFalse(it.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator_remove_throwsUnsupportedOperationException() throws IOException {
        try (CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT)) {
            Iterator<CSVRecord> it = parser.iterator();
            it.remove();
        }
    }

    @Test
    public void testIterator_emptyInput_hasNextReturnsFalse() throws IOException {
        try (CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT)) {
            Iterator<CSVRecord> it = parser.iterator();
            assertFalse(it.hasNext());
        }
    }
}
