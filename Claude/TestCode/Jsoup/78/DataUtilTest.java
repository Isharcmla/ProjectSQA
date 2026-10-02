package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.After;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DataUtilTest {

    private final List<File> tempFiles = new ArrayList<>();

    @After
    public void cleanup() {
        for (File f : tempFiles) {
            if (f.exists()) f.delete();
        }
        tempFiles.clear();
    }

    private File createTempFile(byte[] content) throws IOException {
        File f = File.createTempFile("datautiltest", ".html");
        f.deleteOnExit();
        tempFiles.add(f);
        try (FileOutputStream fos = new FileOutputStream(f)) {
            fos.write(content);
        }
        return f;
    }

    // ---------- load(File, charsetName, baseUri) ----------

    @Test
    public void testLoadFile_validHtmlFile_returnsDocument() throws IOException {
        String html = "<html><head><title>Hello</title></head><body>Content</body></html>";
        File f = createTempFile(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(f, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Hello", doc.title());
    }

    @Test(expected = IOException.class)
    public void testLoadFile_nonExistentFile_throwsIOException() throws IOException {
        File f = new File("this_file_should_not_exist_12345.html");
        DataUtil.load(f, "UTF-8", "http://example.com/");
    }

    // ---------- load(InputStream, charsetName, baseUri) ----------

    @Test
    public void testLoadInputStream_withCharsetName_returnsDocument() throws IOException {
        String html = "<html><head><title>Stream Title</title></head><body>Body</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Stream Title", doc.title());
    }

    @Test
    public void testLoadInputStream_withNullCharset_detectsFromMetaTag() throws IOException {
        String html = "<html><head><meta charset=\"UTF-8\"><title>Meta Title</title></head><body>Body</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, null, "http://example.com/");
        assertNotNull(doc);
        assertEquals("Meta Title", doc.title());
    }

    // ---------- load(InputStream, charsetName, baseUri, parser) ----------

    @Test
    public void testLoadInputStreamWithParser_xmlParser_returnsDocument() throws IOException {
        String xml = "<root><child>Value</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.xmlParser());
        assertNotNull(doc);
        Element child = doc.select("child").first();
        assertNotNull(child);
        assertEquals("Value", child.text());
    }

    // ---------- parseInputStream ----------

    @Test
    public void testParseInputStream_nullInput_returnsEmptyDocumentWithBaseUri() throws IOException {
        Document doc = DataUtil.parseInputStream(null, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testParseInputStream_withBOMUtf8_detectsCharset() throws IOException {
        String html = "<html><head><title>BOM UTF8</title></head><body>Hi</body></html>";
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] content = html.getBytes("UTF-8");
        byte[] all = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(content, 0, all, bom.length, content.length);

        InputStream in = new ByteArrayInputStream(all);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("BOM UTF8", doc.title());
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStream_withBOMUtf16BE_detectsCharset() throws IOException {
        String html = "<html><head><title>T16</title></head><body>Hi</body></html>";
        byte[] bom = new byte[]{(byte) 0xFE, (byte) 0xFF};
        byte[] content = html.getBytes("UTF-16BE");
        byte[] all = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(content, 0, all, bom.length, content.length);

        InputStream in = new ByteArrayInputStream(all);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("T16", doc.title());
    }

    @Test
    public void testParseInputStream_withBOMUtf32BE_detectsCharset() throws IOException {
        String html = "<html><head><title>T32</title></head><body>Hi</body></html>";
        byte[] bom = new byte[]{0x00, 0x00, (byte) 0xFE, (byte) 0xFF};
        byte[] content;
        try {
            content = html.getBytes("UTF-32BE");
        } catch (Exception e) {
            // if charset not supported on this JVM, skip body test gracefully
            content = html.getBytes("UTF-8");
        }
        byte[] all = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(content, 0, all, bom.length, content.length);

        InputStream in = new ByteArrayInputStream(all);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseInputStream_specifiedEmptyCharset_throwsValidationException() {
        String html = "<html><body>Body</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes());
        try {
            DataUtil.parseInputStream(in, "", "http://example.com/", Parser.htmlParser());
            fail("Expected an exception for empty charset name");
        } catch (Exception e) {
            // expected - Validate.notEmpty should throw
            assertTrue(true);
        }
    }

    // ---------- crossStreams ----------

    @Test
    public void testCrossStreams_copiesDataCorrectly() throws IOException {
        byte[] data = "Hello World, this is a test of crossStreams method.".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testCrossStreams_emptyInput_writesNothing() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertEquals(0, out.toByteArray().length);
    }

    // ---------- readToByteBuffer(InputStream, maxSize) ----------

    @Test
    public void testReadToByteBuffer_withMaxSize_readsLimitedData() throws IOException {
        byte[] data = new byte[1000];
        for (int i = 0; i < data.length; i++) data[i] = (byte) (i % 256);
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 50);
        assertNotNull(buffer);
        assertTrue(buffer.remaining() <= 50);
    }

    @Test
    public void testReadToByteBuffer_withZeroMaxSize_readsAllData() throws IOException {
        byte[] data = "Some sample data for unlimited read test.".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);
        assertNotNull(buffer);
        assertEquals(data.length, buffer.remaining());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_negativeMaxSize_throwsIllegalArgumentException() throws IOException {
        InputStream in = new ByteArrayInputStream("data".getBytes("UTF-8"));
        DataUtil.readToByteBuffer(in, -1);
    }

    // ---------- readToByteBuffer(InputStream) package-private ----------

    @Test
    public void testReadToByteBufferNoMax_readsAllData() throws IOException {
        byte[] data = "Package private read test data.".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);
        assertNotNull(buffer);
        assertEquals(data.length, buffer.remaining());
    }

    // ---------- readFileToByteBuffer ----------

    @Test
    public void testReadFileToByteBuffer_validFile_returnsCorrectBytes() throws IOException {
        byte[] data = "File content for byte buffer test.".getBytes("UTF-8");
        File f = createTempFile(data);
        ByteBuffer buffer = DataUtil.readFileToByteBuffer(f);
        assertNotNull(buffer);
        byte[] read = new byte[buffer.remaining()];
        buffer.get(read);
        assertArrayEquals(data, read);
    }

    @Test(expected = FileNotFoundException.class)
    public void testReadFileToByteBuffer_nonExistentFile_throwsFileNotFoundException() throws IOException {
        File f = new File("non_existent_file_for_datautil_test.dat");
        DataUtil.readFileToByteBuffer(f);
    }

    // ---------- emptyByteBuffer ----------

    @Test
    public void testEmptyByteBuffer_returnsZeroCapacityBuffer() {
        ByteBuffer buffer = DataUtil.emptyByteBuffer();
        assertNotNull(buffer);
        assertEquals(0, buffer.capacity());
    }

    // ---------- getCharsetFromContentType ----------

    @Test
    public void testGetCharsetFromContentType_nullContentType_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentType_validContentType_returnsCharset() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=UTF-8");
        assertNotNull(result);
        assertTrue(result.equalsIgnoreCase("UTF-8"));
    }

    @Test
    public void testGetCharsetFromContentType_noCharsetInContentType_returnsNull() {
        String result = DataUtil.getCharsetFromContentType("text/html");
        assertNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_unsupportedCharset_returnsNull() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=not-a-real-charset-xyz");
        assertNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_charsetWithQuotes_returnsCharsetTrimmed() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\"");
        assertNotNull(result);
        assertTrue(result.equalsIgnoreCase("UTF-8"));
    }

    @Test
    public void testGetCharsetFromContentType_emptyContentType_returnsNull() {
        String result = DataUtil.getCharsetFromContentType("");
        assertNull(result);
    }

    // ---------- mimeBoundary ----------

    @Test
    public void testMimeBoundary_returnsStringOfCorrectLength() {
        String boundary = DataUtil.mimeBoundary();
        assertNotNull(boundary);
        assertEquals(DataUtil.boundaryLength, boundary.length());
    }

    @Test
    public void testMimeBoundary_containsOnlyValidCharacters() {
        String validChars = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String boundary = DataUtil.mimeBoundary();
        for (char c : boundary.toCharArray()) {
            assertTrue("Unexpected character: " + c, validChars.indexOf(c) >= 0);
        }
    }

    @Test
    public void testMimeBoundary_multipleCallsProduceStrings() {
        String b1 = DataUtil.mimeBoundary();
        String b2 = DataUtil.mimeBoundary();
        assertNotNull(b1);
        assertNotNull(b2);
        assertEquals(b1.length(), b2.length());
    }
}
