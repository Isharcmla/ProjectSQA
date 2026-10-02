package org.apache.commons.csv;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class CSVParserTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testParseString_normalInput_parsesSuccessfully() throws IOException {
        String csvData = "a,b,c\n1,2,3";
        CSVParser parser = CSVParser.parse(csvData, CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();

        Assert.assertEquals(2, records.size());
        Assert.assertEquals("a", records.get(0).get(0));
        Assert.assertEquals("b", records.get(0).get(1));
        Assert.assertEquals("c", records.get(0).get(2));
        Assert.assertEquals("1", records.get(1).get(0));
        Assert.assertEquals("2", records.get(1).get(1));
        Assert.assertEquals("3", records.get(1).get(2));
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseString_nullString_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseString_nullFormat_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse("a,b,c", null);
    }

    @Test
    public void testParseFile_normalInput_parsesSuccessfully() throws IOException {
        File tempFile = temporaryFolder.newFile("test.csv");
        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write("name,age\nAlice,30\nBob,25");
        }

        CSVParser parser = CSVParser.parse(tempFile, CSVFormat.DEFAULT.withHeader());
        Map<String, Integer> headerMap = parser.getHeaderMap();
        Assert.assertNotNull(headerMap);
        Assert.assertEquals(2, headerMap.size());
        Assert.assertTrue(headerMap.containsKey("name"));
        Assert.assertTrue(headerMap.containsKey("age"));

        List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(2, records.size());
        Assert.assertEquals("Alice", records.get(0).get("name"));
        Assert.assertEquals("30", records.get(0).get("age"));
        Assert.assertEquals("Bob", records.get(1).get("name"));
        Assert.assertEquals("25", records.get(1).get("age"));
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_nullFile_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((File) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_nullFormat_throwsIllegalArgumentException() throws IOException {
        File tempFile = temporaryFolder.newFile("temp.csv");
        CSVParser.parse(tempFile, null);
    }

    @Test
    public void testParseURL_normalInput_parsesSuccessfully() throws IOException {
        File tempFile = temporaryFolder.newFile("url_test.csv");
        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write("col1,col2\nval1,val2");
        }

        URL url = tempFile.toURI().toURL();
        CSVParser parser = CSVParser.parse(url, StandardCharsets.UTF_8, CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(2, records.size());
        Assert.assertEquals("col1", records.get(0).get(0));
        Assert.assertEquals("col2", records.get(0).get(1));
        Assert.assertEquals("val1", records.get(1).get(0));
        Assert.assertEquals("val2", records.get(1).get(1));
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullUrl_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((URL) null, StandardCharsets.UTF_8, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullCharset_throwsIllegalArgumentException() throws IOException {
        File tempFile = temporaryFolder.newFile("test_charset.csv");
        URL url = tempFile.toURI().toURL();
        CSVParser.parse(url, (Charset) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullFormat_throwsIllegalArgumentException() throws IOException {
        File tempFile = temporaryFolder.newFile("test_format.csv");
        URL url = tempFile.toURI().toURL();
        CSVParser.parse(url, StandardCharsets.UTF_8, null);
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
    public void testHeaderInitialization_emptyHeaderArray_readsFirstLineAsHeader() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader(new String[0]);
        CSVParser parser = new CSVParser(new StringReader("colA,colB\n1,2"), format);

        Map<String, Integer> headerMap = parser.getHeaderMap();
        Assert.assertNotNull(headerMap);
        Assert.assertEquals(Integer.valueOf(0), headerMap.get("colA"));
        Assert.assertEquals(Integer.valueOf(1), headerMap.get("colB"));

        List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(1, records.size());
        Assert.assertEquals("1", records.get(0).get("colA"));
        Assert.assertEquals("2", records.get(0).get("colB"));
        parser.close();
    }

    @Test
    public void testHeaderInitialization_explicitHeaderWithSkipHeaderRecord_skipsFirstLine() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("h1", "h2").withSkipHeaderRecord(true);
        CSVParser parser = new CSVParser(new StringReader("header1,header2\nv1,v2"), format);

        Map<String, Integer> headerMap = parser.getHeaderMap();
        Assert.assertNotNull(headerMap);
        Assert.assertEquals(Integer.valueOf(0), headerMap.get("h1"));
        Assert.assertEquals(Integer.valueOf(1), headerMap.get("h2"));

        List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(1, records.size());
        Assert.assertEquals("v1", records.get(0).get("h1"));
        Assert.assertEquals("v2", records.get(0).get("h2"));
        parser.close();
    }

    @Test
    public void testHeaderInitialization_explicitHeaderWithoutSkip_doesNotSkipFirstLine() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("h1", "h2").withSkipHeaderRecord(false);
        CSVParser parser = new CSVParser(new StringReader("v1,v2\nv3,v4"), format);

        List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(2, records.size());
        Assert.assertEquals("v1", records.get(0).get("h1"));
        Assert.assertEquals("v2", records.get(0).get("h2"));
        Assert.assertEquals("v3", records.get(1).get("h1"));
        Assert.assertEquals("v4", records.get(1).get("h2"));
        parser.close();
    }

    @Test
    public void testHeaderInitialization_emptyInputWithHeaderDetection_returnsEmptyHeaderMap() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader(new String[0]);
        CSVParser parser = new CSVParser(new StringReader(""), format);

        Map<String, Integer> headerMap = parser.getHeaderMap();
        Assert.assertNotNull(headerMap);
        Assert.assertTrue(headerMap.isEmpty());
        parser.close();
    }

    @Test
    public void testNullStringHandling_matchesNullString_convertsToNull() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        CSVParser parser = new CSVParser(new StringReader("a,NULL,c\nnull,b,NULL"), format);

        List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(2, records.size());
        Assert.assertEquals("a", records.get(0).get(0));
        Assert.assertNull(records.get(0).get(1));
        Assert.assertEquals("c", records.get(0).get(2));

        Assert.assertNull(records.get(1).get(0));
        Assert.assertEquals("b", records.get(1).get(1));
        Assert.assertNull(records.get(1).get(2));
        parser.close();
    }

    @Test
    public void testGetCurrentLineNumberAndRecordNumber_multiLineRecords_tracksAccurately() throws IOException {
        String csvData = "\"line1\nline2\",b\nc,d";
        CSVParser parser = new CSVParser(new StringReader(csvData), CSVFormat.DEFAULT);

        Assert.assertEquals(0, parser.getRecordNumber());
        CSVRecord rec1 = parser.nextRecord();
        Assert.assertNotNull(rec1);
        Assert.assertEquals(1, parser.getRecordNumber());
        Assert.assertEquals("line1\nline2", rec1.get(0));

        CSVRecord rec2 = parser.nextRecord();
        Assert.assertNotNull(rec2);
        Assert.assertEquals(2, parser.getRecordNumber());
        Assert.assertEquals("c", rec2.get(0));

        Assert.assertNull(parser.nextRecord());
        Assert.assertTrue(parser.getCurrentLineNumber() >= 2);
        parser.close();
    }

    @Test
    public void testComments_commentsInCsv_areRecordedInCSVRecord() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        String csvData = "# Comment 1\n# Comment 2\na,b\n# Another comment\nc,d";
        CSVParser parser = new CSVParser(new StringReader(csvData), format);

        CSVRecord record1 = parser.nextRecord();
        Assert.assertNotNull(record1);
        Assert.assertEquals("a", record1.get(0));
        Assert.assertEquals("b", record1.get(1));
        Assert.assertEquals("Comment 1\nComment 2", record1.getComment());

        CSVRecord record2 = parser.nextRecord();
        Assert.assertNotNull(record2);
        Assert.assertEquals("c", record2.get(0));
        Assert.assertEquals("d", record2.get(1));
        Assert.assertEquals("Another comment", record2.getComment());

        parser.close();
    }

    @Test
    public void testIsClosedAndClose_stateTransitions_correctlyReflected() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b,c"), CSVFormat.DEFAULT);
        Assert.assertFalse(parser.isClosed());
        parser.close();
        Assert.assertTrue(parser.isClosed());
        parser.close(); // Calling close again should not throw exception
    }

    @Test
    public void testIterator_hasNextAndNext_iteratesAllRecords() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\nc,d"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();

        Assert.assertTrue(iterator.hasNext());
        CSVRecord r1 = iterator.next();
        Assert.assertEquals("a", r1.get(0));
        Assert.assertEquals("b", r1.get(1));

        Assert.assertTrue(iterator.hasNext());
        Assert.assertTrue(iterator.hasNext()); // Idempotent check
        CSVRecord r2 = iterator.next();
        Assert.assertEquals("c", r2.get(0));
        Assert.assertEquals("d", r2.get(1));

        Assert.assertFalse(iterator.hasNext());
        parser.close();
    }

    @Test
    public void testIterator_nextWithoutHasNext_retrievesRecords() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\nc,d"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();

        CSVRecord r1 = iterator.next();
        Assert.assertEquals("a", r1.get(0));
        CSVRecord r2 = iterator.next();
        Assert.assertEquals("c", r2.get(0));
        parser.close();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_nextBeyondEnd_throwsNoSuchElementException() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        iterator.next();
        iterator.next();
    }

    @Test
    public void testIterator_closedParserHasNext_returnsFalse() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        parser.close();
        Assert.assertFalse(iterator.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_closedParserNext_throwsNoSuchElementException() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        parser.close();
        iterator.next();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator_remove_throwsUnsupportedOperationException() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        iterator.remove();
    }

    @Test(expected = RuntimeException.class)
    public void testIterator_ioExceptionInNext_wrapsInRuntimeException() throws IOException {
        Reader faultyReader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Simulated read failure");
            }

            @Override
            public void close() throws IOException {
            }
        };

        CSVParser parser = new CSVParser(faultyReader, CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        iterator.hasNext();
    }

    @Test(expected = IOException.class)
    public void testInvalidParseSequence_throwsIOException() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuote('"');
        // Unclosed quoted string followed by content triggers invalid parse sequence
        CSVParser parser = new CSVParser(new StringReader("\"unclosed quote"), format);
        parser.getRecords();
    }

    @Test
    public void testGetHeaderMap_modificationsDoNotAffectParser() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B");
        CSVParser parser = new CSVParser(new StringReader("1,2"), format);
        Map<String, Integer> headerMap = parser.getHeaderMap();

        Assert.assertEquals(2, headerMap.size());
        headerMap.put("C", 2);

        Map<String, Integer> headerMap2 = parser.getHeaderMap();
        Assert.assertEquals(2, headerMap2.size());
        Assert.assertFalse(headerMap2.containsKey("C"));
        parser.close();
    }

    @Test
    public void testEmptyInput_returnsEmptyList() throws IOException {
        CSVParser parser = new CSVParser(new StringReader(""), CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        Assert.assertTrue(records.isEmpty());
        Assert.assertEquals(0, parser.getRecordNumber());
        parser.close();
    }
}
