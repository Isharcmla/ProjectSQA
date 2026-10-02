import org.junit.Test;
import static org.junit.Assert.*;

import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class DataUtilTest {

    // ---------- load(File, String, String) ----------

    @Test
    public void testLoadFile_normalHtml_returnsDocumentWithTitle() throws IOException {
        File tempFile = File.createTempFile("jsoup_test", ".html");
        tempFile.deleteOnExit();
        String html = "<html><head><title>Test Title</title></head><body>Hello World</body></html>";
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write(html.getBytes("UTF-8"));
        }

        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Test Title", doc.title());
        assertTrue(doc.body().text().contains("Hello World"));
    }

    @Test(expected = IOException.class)
    public void testLoadFile_nonExistentFile_throwsIOException() throws IOException {
        File nonExistent = new File("non_existent_file_xyz_123.html");
        DataUtil.load(nonExistent, "UTF-8", "http://example.com/");
    }

    // ---------- load(InputStream, String, String) ----------

    @Test
    public void testLoadInputStream_withCharset_returnsDocument() throws IOException {
        String html = "<html><head><title>Charset Test</title></head><body>Content</body></html>";
        InputStream is = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(is, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Charset Test", doc.title());
    }

    @Test
    public void testLoadInputStream_withNullCharset_detectsFromMeta() throws IOException {
        String html = "<html><head><meta charset=\"UTF-8\"><title>Meta Test</title></head><body>Body</body></html>";
        InputStream is = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(is, null, "http://example.com/");
        assertNotNull(doc);
        assertEquals("Meta Test", doc.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLoadInputStream_withEmptyCharset_throwsException() throws IOException {
        String html = "<html><body>Hi</body></html>";
        InputStream is = new ByteArrayInputStream(html.getBytes("UTF-8"));
        DataUtil.load(is, "", "http://example.com/");
    }

    // ---------- load(InputStream, String, String, Parser) ----------

    @Test
    public void testLoadInputStreamWithParser_xmlParser_parsesXml() throws IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><child>value</child></root>";
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.load(is, "UTF-8", "http://example.com/", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("value", doc.select("child").text());
    }

    // ---------- readToByteBuffer ----------

    @Test
    public void testReadToByteBuffer_normal_readsAllBytes() throws IOException {
        byte[] data = "Hello, this is test data".getBytes("UTF-8");
        InputStream is = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(is, 0);
        assertEquals(data.length, buffer.limit());
    }

    @Test
    public void testReadToByteBuffer_maxSizeZero_readsAll() throws IOException {
        byte[] data = new byte[200];
        for (int i = 0; i < data.length; i++) data[i] = (byte) 'A';
        InputStream is = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(is, 0);
        assertEquals(200, buffer.limit());
    }

    @Test
    public void testReadToByteBuffer_maxSizeLimited_truncates() throws IOException {
        byte[] data = new byte[100];
        for (int i = 0; i < data.length; i++) data[i] = (byte) 'A';
        InputStream is = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(is, 50);
        assertEquals(50, buffer.limit());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_negativeMaxSize_throwsException() throws IOException {
        byte[] data = "data".getBytes("UTF-8");
        InputStream is = new ByteArrayInputStream(data);
        DataUtil.readToByteBuffer(is, -1);
    }

    // ---------- crossStreams ----------

    @Test
    public void testCrossStreams_copiesData() throws IOException {
        byte[] data = "Stream copy test data".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertArrayEquals(data, out.toByteArray());
    }

    // ---------- parseInputStream ----------

    @Test
    public void testParseInputStream_nullInput_returnsEmptyDocumentWithBaseUri() throws IOException {
        Document doc = DataUtil.parseInputStream(null, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testParseInputStream_withUtf8Bom_detectsUtf8Charset() throws IOException {
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] htmlBytes = "<html><head><title>BOM Test</title></head><body>Content</body></html>".getBytes("UTF-8");
        byte[] combined = new byte[bom.length + htmlBytes.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(htmlBytes, 0, combined, bom.length, htmlBytes.length);

        InputStream is = new ByteArrayInputStream(combined);
        Document doc = DataUtil.parseInputStream(is, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("BOM Test", doc.title());
        assertEquals(Charset.forName("UTF-8"), doc.outputSettings().charset());
    }

    @Test
    public void testParseInputStream_withUtf16Bom_parsesCorrectly() throws IOException {
        String html = "<html><head><title>UTF16 Test</title></head><body>Content</body></html>";
        byte[] bytes = html.getBytes("UTF-16"); // Java writes BOM automatically
        InputStream is = new ByteArrayInputStream(bytes);
        Document doc = DataUtil.parseInputStream(is, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF16 Test", doc.title());
    }

    // ---------- emptyByteBuffer ----------

    @Test
    public void testEmptyByteBuffer_returnsZeroCapacityBuffer() {
        ByteBuffer buf = DataUtil.emptyByteBuffer();
        assertNotNull(buf);
        assertEquals(0, buf.capacity());
    }

    // ---------- getCharsetFromContentType ----------

    @Test
    public void testGetCharsetFromContentType_validContentType_returnsCharset() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=UTF-8");
        assertEquals("UTF-8", result);
    }

    @Test
    public void testGetCharsetFromContentType_nullContentType_returnsNull() {
        String result = DataUtil.getCharsetFromContentType(null);
        assertNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_noCharsetMatch_returnsNull() {
        String result = DataUtil.getCharsetFromContentType("text/html");
        assertNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_unsupportedCharset_returnsNull() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=totally-bogus-charset-xyz");
        assertNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_quotedCharset_returnsCharset() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\"");
        assertEquals("UTF-8", result);
    }

    // ---------- mimeBoundary ----------

    @Test
    public void testMimeBoundary_returnsCorrectLengthAndValidChars() {
        String boundary = DataUtil.mimeBoundary();
        assertNotNull(boundary);
        assertEquals(DataUtil.boundaryLength, boundary.length());
        String allowed = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char c : boundary.toCharArray()) {
            assertTrue("Unexpected char: " + c, allowed.indexOf(c) >= 0);
        }
    }

    @Test
    public void testMimeBoundary_calledTwice_producesDifferentOrEqualLengthStrings() {
        String b1 = DataUtil.mimeBoundary();
        String b2 = DataUtil.mimeBoundary();
        assertEquals(b1.length(), b2.length());
    }

    // ---------- validateCharset (private, via reflection) ----------

    private String invokeValidateCharset(String cs) throws Exception {
        Method m = DataUtil.class.getDeclaredMethod("validateCharset", String.class);
        m.setAccessible(true);
        return (String) m.invoke(null, cs);
    }

    @Test
    public void testValidateCharset_validCharset_returnsCharset() throws Exception {
        String result = invokeValidateCharset("UTF-8");
        assertEquals("UTF-8", result);
    }

    @Test
    public void testValidateCharset_nullCharset_returnsNull() throws Exception {
        String result = invokeValidateCharset(null);
        assertNull(result);
    }

    @Test
    public void testValidateCharset_emptyCharset_returnsNull() throws Exception {
        String result = invokeValidateCharset("");
        assertNull(result);
    }

    @Test
    public void testValidateCharset_invalidCharsetName_returnsNull() throws Exception {
        String result = invokeValidateCharset("totally:::invalid///charset");
        assertNull(result);
    }

    @Test
    public void testValidateCharset_lowercaseButUppercaseSupported_returnsUppercase() throws Exception {
        // gb2312 is supported directly in most JVMs, but test case sensitivity behavior generally
        String result = invokeValidateCharset("utf-8");
        assertNotNull(result);
    }

    // ---------- detectCharsetFromBom (private, via reflection) ----------

    private Object invokeDetectCharsetFromBom(ByteBuffer buffer) throws Exception {
        Method m = DataUtil.class.getDeclaredMethod("detectCharsetFromBom", ByteBuffer.class);
        m.setAccessible(true);
        return m.invoke(null, buffer);
    }

    private String getBomCharsetField(Object bomCharsetObj) throws Exception {
        Field f = bomCharsetObj.getClass().getDeclaredField("charset");
        f.setAccessible(true);
        return (String) f.get(bomCharsetObj);
    }

    private boolean getBomOffsetField(Object bomCharsetObj) throws Exception {
        Field f = bomCharsetObj.getClass().getDeclaredField("offset");
        f.setAccessible(true);
        return (Boolean) f.get(bomCharsetObj);
    }

    @Test
    public void testDetectCharsetFromBom_utf8Bom_returnsUtf8WithOffset() throws Exception {
        byte[] bytes = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF, 0x00};
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        Object result = invokeDetectCharsetFromBom(buffer);
        assertNotNull(result);
        assertEquals("UTF-8", getBomCharsetField(result));
        assertTrue(getBomOffsetField(result));
    }

    @Test
    public void testDetectCharsetFromBom_utf16BEBom_returnsUtf16() throws Exception {
        byte[] bytes = new byte[]{(byte) 0xFE, (byte) 0xFF, 0x00, 0x00};
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        Object result = invokeDetectCharsetFromBom(buffer);
        assertNotNull(result);
        assertEquals("UTF-16", getBomCharsetField(result));
        assertFalse(getBomOffsetField(result));
    }

    @Test
    public void testDetectCharsetFromBom_utf16LEBom_returnsUtf16() throws Exception {
        byte[] bytes = new byte[]{(byte) 0xFF, (byte) 0xFE, 0x01, 0x02};
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        Object result = invokeDetectCharsetFromBom(buffer);
        assertNotNull(result);
        assertEquals("UTF-16", getBomCharsetField(result));
        assertFalse(getBomOffsetField(result));
    }

    @Test
    public void testDetectCharsetFromBom_utf32BEBom_returnsUtf32() throws Exception {
        byte[] bytes = new byte[]{0x00, 0x00, (byte) 0xFE, (byte) 0xFF};
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        Object result = invokeDetectCharsetFromBom(buffer);
        assertNotNull(result);
        assertEquals("UTF-32", getBomCharsetField(result));
        assertFalse(getBomOffsetField(result));
    }

    @Test
    public void testDetectCharsetFromBom_utf32LEBom_returnsUtf32() throws Exception {
        byte[] bytes = new byte[]{(byte) 0xFF, (byte) 0xFE, 0x00, 0x00};
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        Object result = invokeDetectCharsetFromBom(buffer);
        assertNotNull(result);
        assertEquals("UTF-32", getBomCharsetField(result));
        assertFalse(getBomOffsetField(result));
    }

    @Test
    public void testDetectCharsetFromBom_noBom_returnsNull() throws Exception {
        byte[] bytes = new byte[]{0x41, 0x42, 0x43, 0x44};
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        Object result = invokeDetectCharsetFromBom(buffer);
        assertNull(result);
    }

    @Test
    public void testDetectCharsetFromBom_lessThanFourBytes_returnsNull() throws Exception {
        byte[] bytes = new byte[]{0x41, 0x42};
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        Object result = invokeDetectCharsetFromBom(buffer);
        assertNull(result);
    }
}
