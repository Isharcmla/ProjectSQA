package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class DataUtilTest {

    private File tempFile;

    @Before
    public void setUp() {
        tempFile = null;
    }

    @After
    public void tearDown() {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    // ---------- load(File, String, String) ----------

    @Test
    public void testLoadFile_withSpecifiedCharset_returnsDocument() throws IOException {
        tempFile = File.createTempFile("jsoup", ".html");
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write("<html><head></head><body>Hello</body></html>".getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("Hello"));
    }

    @Test
    public void testLoadFile_withNullCharset_autoDetects() throws IOException {
        tempFile = File.createTempFile("jsoup", ".html");
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write("<html><head><meta charset=\"UTF-8\"></head><body>World</body></html>".getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("World"));
    }

    @Test(expected = IOException.class)
    public void testLoadFile_fileNotFound_throwsIOException() throws IOException {
        File nonExistent = new File("this_file_should_not_exist_12345.html");
        DataUtil.load(nonExistent, "UTF-8", "http://example.com/");
    }

    // ---------- load(InputStream, String, String) ----------

    @Test
    public void testLoadInputStream_normalInput_returnsDocument() throws IOException {
        String html = "<html><head></head><body>Test Content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("Test Content"));
    }

    @Test
    public void testLoadInputStream_nullCharset_autoDetects() throws IOException {
        String html = "<html><head><meta charset=\"UTF-8\"></head><body>Auto Detect</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, null, "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("Auto Detect"));
    }

    // ---------- load(InputStream, String, String, Parser) ----------

    @Test
    public void testLoadInputStreamWithParser_htmlParser_returnsDocument() throws IOException {
        String html = "<html><head></head><body>Parser Test</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("Parser Test"));
    }

    @Test
    public void testLoadInputStreamWithParser_xmlParser_returnsDocument() throws IOException {
        String xml = "<root><child>Value</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.xmlParser());
        assertNotNull(doc);
        assertTrue(doc.text().contains("Value"));
    }

    // ---------- parseByteData ----------

    @Test
    public void testParseByteData_charsetSpecified_decodesCorrectly() throws Exception {
        String html = "<html><head></head><body>Specified Charset</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("Specified Charset"));
    }

    @Test
    public void testParseByteData_nullCharsetNoMeta_defaultsToUTF8() throws Exception {
        String html = "<html><head></head><body>No Meta Tag</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("No Meta Tag"));
    }

    @Test
    public void testParseByteData_nullCharsetWithHttpEquivMeta_detectsCharset() throws Exception {
        String html = "<html><head><meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"></head><body>HttpEquiv</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("HttpEquiv"));
    }

    @Test
    public void testParseByteData_nullCharsetWithCharsetMetaTag_detectsCharset() throws Exception {
        String html = "<html><head><meta charset=\"UTF-8\"></head><body>CharsetMeta</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("CharsetMeta"));
    }

    @Test
    public void testParseByteData_nullCharsetWithDifferentCharsetMeta_redecodes() throws Exception {
        // Use ISO-8859-1 meta charset different from default UTF-8, causing re-decode branch
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>Redecode Test</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes("ISO-8859-1"));
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("Redecode Test"));
    }

    @Test
    public void testParseByteData_nullCharsetWithEmptyFoundCharset_keepsDefault() throws Exception {
        // meta charset attribute empty -> foundCharset length 0, should keep default utf-8 doc
        String html = "<html><head><meta charset=\"\"></head><body>Empty Charset</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("Empty Charset"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_emptyCharsetName_throwsException() throws Exception {
        String html = "<html><head></head><body>Empty Charset Name</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes("UTF-8"));
        DataUtil.parseByteData(buffer, "", "http://example.com/", Parser.htmlParser());
    }

    // ---------- readToByteBuffer ----------

    @Test
    public void testReadToByteBuffer_normalStream_returnsCorrectData() throws IOException {
        String content = "Hello World";
        InputStream in = new ByteArrayInputStream(content.getBytes("UTF-8"));
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);
        byte[] arr = new byte[buffer.remaining()];
        buffer.get(arr);
        assertEquals(content, new String(arr, "UTF-8"));
    }

    @Test
    public void testReadToByteBuffer_emptyStream_returnsEmptyBuffer() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);
        assertEquals(0, buffer.remaining());
    }

    @Test
    public void testReadToByteBuffer_largeStream_readsAllData() throws IOException {
        byte[] data = new byte[500000]; // larger than bufferSize to force multiple reads
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);
        assertEquals(data.length, buffer.remaining());
    }

    // ---------- getCharsetFromContentType ----------

    @Test
    public void testGetCharsetFromContentType_nullInput_returnsNull() {
        String result = DataUtil.getCharsetFromContentType(null);
        assertNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_noCharsetPresent_returnsNull() {
        String result = DataUtil.getCharsetFromContentType("text/html");
        assertNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_withCharset_returnsUppercaseTrimmed() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=euc-jp");
        assertEquals("EUC-JP", result);
    }

    @Test
    public void testGetCharsetFromContentType_withQuotedCharset_returnsCharset() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\"");
        assertEquals("UTF-8", result);
    }

    @Test
    public void testGetCharsetFromContentType_withSpacesAroundCharset_trimsCorrectly() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset= UTF-8 ");
        assertEquals("UTF-8", result);
    }

    @Test
    public void testGetCharsetFromContentType_caseInsensitiveMatch_returnsCharset() {
        String result = DataUtil.getCharsetFromContentType("text/html; CHARSET=ISO-8859-1");
        assertEquals("ISO-8859-1", result);
    }

    @Test
    public void testGetCharsetFromContentType_emptyString_returnsNull() {
        String result = DataUtil.getCharsetFromContentType("");
        assertNull(result);
    }
}
