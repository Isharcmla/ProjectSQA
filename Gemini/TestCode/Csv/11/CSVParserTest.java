package org.apache.commons.csv;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class CSVParserTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testParseString_normalInput_returnsParsedRecords() throws IOException {
        final String csvData = "a,b,c\n1,2,3";
        final CSVParser parser = CSVParser.parse(csvData, CSVFormat.DEFAULT);

        final List<CSVRecord> records = parser.getRecords();
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
    public void testParseFile_normalInput_returnsParsedRecords() throws IOException {
        final File file = temporaryFolder.newFile("test.csv");
        final OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
        writer.write("col1,col2\nval1,val2");
        writer.close();

        final CSVParser parser = CSVParser.parse(file, StandardCharsets.UTF_8, CSVFormat.DEFAULT);
        final List<CSVRecord> records = parser.getRecords();

        Assert.assertEquals(2, records.size());
        Assert.assertEquals("col1", records.get(0).get(0));
        Assert.assertEquals("val2", records.get(1).get(1));
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_nullFile_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((File) null, StandardCharsets.UTF_8, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_nullFormat_throwsIllegalArgumentException() throws IOException {
        final File file = temporaryFolder.newFile("test_null_format.csv");
        CSVParser.parse(file, StandardCharsets.UTF_8, null);
    }

    @Test
    public void testParseURL_fileURL_returnsParsedRecords() throws IOException {
        final File file = temporaryFolder.newFile("url_test.csv");
        final OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
        writer.write("x,y\n7,8");
        writer.close();

        final URL url = file.toURI().toURL();
        final CSVParser parser = CSVParser.parse(url, StandardCharsets.UTF_8, CSVFormat.DEFAULT);
        final List<CSVRecord> records = parser.getRecords();

        Assert.assertEquals(2, records.size());
        Assert.assertEquals("x", records.get(0).get(0));
        Assert.assertEquals("8", records.get(1).get(1));
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullUrl_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((URL) null, StandardCharsets.UTF_8, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullCharset_throwsIllegalArgumentException() throws IOException {
        final File file = temporaryFolder.newFile("test_null_charset.csv");
        CSVParser.parse(file.toURI().toURL(), null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_nullFormat_throwsIllegalArgumentException() throws IOException {
        final File file = temporaryFolder.newFile("test_null_format_url.csv");
        CSVParser.parse(file.toURI().toURL(), StandardCharsets.UTF_8, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullReader_throwsIllegalArgumentException() throws IOException {
        new CSVParser(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullFormat_throwsIllegalArgumentException() throws IOException {
        new CSVParser(new StringReader("a,b"), null);
    }

    @Test
    public void testGetHeaderMap_noHeaderDefined_returnsNull() throws IOException {
        final CSVParser parser = CSVParser.parse("a,b,c", CSVFormat.DEFAULT);
        Assert.assertNull(parser.getHeaderMap());
        parser.close();
    }

    @Test
    public void testGetHeaderMap_manualHeaderProvided_returnsHeaderMap() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT.withHeader("Col1", "Col2", "Col3");
        final CSVParser parser = CSVParser.parse("1,2,3", format);
        final Map<String, Integer> headerMap = parser.getHeaderMap();

        Assert.assertNotNull(headerMap);
        Assert.assertEquals(3, headerMap.size());
        Assert.assertEquals(Integer.valueOf(0), headerMap.get("Col1"));
        Assert.assertEquals(Integer.valueOf(1), headerMap.get("Col2"));
        Assert.assertEquals(Integer.valueOf(2), headerMap.get("Col3"));
        parser.close();
    }

    @Test
    public void testGetHeaderMap_emptyHeaderArray_readsHeaderFromFirstLine() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT.withHeader(new String[0]);
        final CSVParser parser = CSVParser.parse("Col1,Col2\nVal1,Val2", format);
        final Map<String, Integer> headerMap = parser.getHeaderMap();

        Assert.assertNotNull(headerMap);
        Assert.assertEquals(2, headerMap.size());
        Assert.assertEquals(Integer.valueOf(0), headerMap.get("Col1"));
        Assert.assertEquals(Integer.valueOf(1), headerMap.get("Col2"));

        final List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(1, records.size());
        Assert.assertEquals("Val1", records.get(0).get("Col1"));
        Assert.assertEquals("Val2", records.get(0).get("Col2"));
        parser.close();
    }

    @Test
    public void testGetHeaderMap_emptyHeaderArrayAndEmptyInput_returnsEmptyHeaderMap() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT.withHeader(new String[0]);
        final CSVParser parser = CSVParser.parse("", format);
        final Map<String, Integer> headerMap = parser.getHeaderMap();

        Assert.assertNotNull(headerMap);
        Assert.assertTrue(headerMap.isEmpty());
        parser.close();
    }

    @Test
    public void testGetHeaderMap_skipHeaderRecordTrue_skipsFirstLine() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT.withHeader("H1", "H2").withSkipHeaderRecord(true);
        final CSVParser parser = CSVParser.parse("Col1,Col2\nVal1,Val2", format);
        final Map<String, Integer> headerMap = parser.getHeaderMap();

        Assert.assertNotNull(headerMap);
        Assert.assertEquals(Integer.valueOf(0), headerMap.get("H1"));
        Assert.assertEquals(Integer.valueOf(1), headerMap.get("H2"));

        final List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(1, records.size());
        Assert.assertEquals("Val1", records.get(0).get("H1"));
        Assert.assertEquals("Val2", records.get(0).get("H2"));
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitializeHeader_duplicateHeaders_throwsIllegalArgumentException() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT.withHeader("Dup", "Other", "Dup");
        CSVParser.parse("a,b,c", format);
    }

    @Test
    public void testInitializeHeader_duplicateEmptyHeadersWithIgnoreEmptyHeaders_succeeds() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "", "").withIgnoreEmptyHeaders(true);
        final CSVParser parser = CSVParser.parse("1,2,3", format);
        final Map<String, Integer> headerMap = parser.getHeaderMap();

        Assert.assertNotNull(headerMap);
        Assert.assertTrue(headerMap.containsKey("A"));
        Assert.assertTrue(headerMap.containsKey(""));
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitializeHeader_duplicateEmptyHeadersWithoutIgnoreEmptyHeaders_throwsIllegalArgumentException() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "", "").withIgnoreEmptyHeaders(false);
        CSVParser.parse("1,2,3", format);
    }

    @Test
    public void testGetRecordsWithCustomCollection_normalInput_populatesGivenCollection() throws IOException {
        final CSVParser parser = CSVParser.parse("1,2\n3,4", CSVFormat.DEFAULT);
        final List<CSVRecord> customList = new ArrayList<CSVRecord>();
        final List<CSVRecord> resultList = parser.getRecords(customList);

        Assert.assertSame(customList, resultList);
        Assert.assertEquals(2, resultList.size());
        parser.close();
    }

    @Test
    public void testNullString_matchingNullString_parsedAsNull() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        final CSVParser parser = CSVParser.parse("a,NULL,b,null", format);
        final CSVRecord record = parser.getRecords().get(0);

        Assert.assertEquals("a", record.get(0));
        Assert.assertNull(record.get(1));
        Assert.assertEquals("b", record.get(2));
        Assert.assertNull(record.get(3));
        parser.close();
    }

    @Test
    public void testNullString_nonMatchingNullString_parsedAsString() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        final CSVParser parser = CSVParser.parse("foo,bar", format);
        final CSVRecord record = parser.getRecords().get(0);

        Assert.assertEquals("foo", record.get(0));
        Assert.assertEquals("bar", record.get(1));
        parser.close();
    }

    @Test
    public void testGetCurrentLineNumberAndRecordNumber_multiLineValues_tracksCounters() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT;
        final CSVParser parser = CSVParser.parse("\"line1\nline2\",val2\nval3,val4", format);

        Assert.assertEquals(0, parser.getRecordNumber());

        final CSVRecord record1 = parser.iterator().next();
        Assert.assertEquals(1, parser.getRecordNumber());
        Assert.assertEquals(1, record1.getRecordNumber());
        Assert.assertEquals("line1\nline2", record1.get(0));

        final CSVRecord record2 = parser.iterator().next();
        Assert.assertEquals(2, parser.getRecordNumber());
        Assert.assertEquals(2, record2.getRecordNumber());
        Assert.assertEquals("val3", record2.get(0));

        Assert.assertTrue(parser.getCurrentLineNumber() >= 2);
        parser.close();
    }

    @Test
    public void testComments_commentMarkersPresent_attachesCommentsToNextRecord() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        final String data = "# Comment line 1\n# Comment line 2\na,b\n# Comment line 3\nc,d";
        final CSVParser parser = CSVParser.parse(data, format);

        final List<CSVRecord> records = parser.getRecords();
        Assert.assertEquals(2, records.size());
        Assert.assertEquals("Comment line 1\nComment line 2", records.get(0).getComment());
        Assert.assertEquals("Comment line 3", records.get(1).getComment());
        parser.close();
    }

    @Test
    public void testIterator_fullIteration_iteratesCorrectly() throws IOException {
        final CSVParser parser = CSVParser.parse("1\n2\n3", CSVFormat.DEFAULT);
        final Iterator<CSVRecord> iterator = parser.iterator();

        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("1", iterator.next().get(0));
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("2", iterator.next().get(0));
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("3", iterator.next().get(0));
        Assert.assertFalse(iterator.hasNext());
        parser.close();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_nextWhenExhausted_throwsNoSuchElementException() throws IOException {
        final CSVParser parser = CSVParser.parse("1", CSVFormat.DEFAULT);
        final Iterator<CSVRecord> iterator = parser.iterator();
        iterator.next();
        iterator.next();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_nextOnClosedParser_throwsNoSuchElementException() throws IOException {
        final CSVParser parser = CSVParser.parse("1,2", CSVFormat.DEFAULT);
        final Iterator<CSVRecord> iterator = parser.iterator();
        parser.close();
        iterator.next();
    }

    @Test
    public void testIterator_hasNextOnClosedParser_returnsFalse() throws IOException {
        final CSVParser parser = CSVParser.parse("1,2", CSVFormat.DEFAULT);
        final Iterator<CSVRecord> iterator = parser.iterator();
        parser.close();
        Assert.assertFalse(iterator.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator_remove_throwsUnsupportedOperationException() throws IOException {
        final CSVParser parser = CSVParser.parse("1,2", CSVFormat.DEFAULT);
        final Iterator<CSVRecord> iterator = parser.iterator();
        iterator.remove();
    }

    @Test
    public void testIsClosedAndClose_normalFlow_closesCorrectly() throws IOException {
        final CSVParser parser = CSVParser.parse("1,2", CSVFormat.DEFAULT);
        Assert.assertFalse(parser.isClosed());
        parser.close();
        Assert.assertTrue(parser.isClosed());
        parser.close();
    }

    @Test
    public void testEmptyInput_returnsEmptyRecordList() throws IOException {
        final CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT);
        final List<CSVRecord> records = parser.getRecords();
        Assert.assertTrue(records.isEmpty());
        parser.close();
    }

    @Test(expected = RuntimeException.class)
    public void testIterator_ioExceptionDuringIteration_wrapsInRuntimeException() throws IOException {
        final Reader failingReader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Simulated Read Error");
            }

            @Override
            public void close() throws IOException {
            }
        };
        final CSVParser parser = new CSVParser(failingReader, CSVFormat.DEFAULT);
        final Iterator<CSVRecord> iterator = parser.iterator();
        iterator.hasNext();
    }
}
