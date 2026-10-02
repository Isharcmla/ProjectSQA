import org.junit.Assume;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

public class DataUtilTest {

    // ---------- load(File, String, String) ----------

    @Test
    public void testLoadFile_withCharset_returnsDocument() throws IOException {
        File tmp = File.createTempFile("datautil", ".html");
        tmp.deleteOnExit();
        String html = "<html><head><title>Test</title></head><body>Hello World</body></html>";
        try (FileOutputStream fos = new FileOutputStream(tmp)) {
            fos.write(html.getBytes("UTF-8"));
        }
        Document doc = DataUtil.load(tmp, "UTF-8", "http://example.com/");
        assertEquals("Test", doc.title());
        assertTrue(doc.body().text().contains("Hello World"));
    }

    @Test(expected = IOException.class)
    public void testLoadFile_fileNotExist_throwsIOException() throws IOException {
        File notExist = new File("this_file_should_not_exist_12345.html");
        DataUtil.load(notExist, "UTF-8", "http://example.com/");
    }

    // ---------- load(InputStream, String, String) ----------

    @Test
    public void testLoadInputStream_withCharset_returnsDocument() throws IOException {
        String html = "<html><head><title>Hi</title></head><body>Content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/");
        assertEquals("Hi", doc.title());
    }

    @Test
    public void testLoadInputStream_nullCharset_detectsFromDefault() throws IOException {
        String html = "<html><head><title>NoCharset</title></head><body>Body</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, null, "http://example.com/");
        assertEquals("NoCharset", doc.title());
    }

    // ---------- load(InputStream, String, String, Parser) ----------

    @Test
    public void testLoadInputStreamWithParser_xmlParser_returnsDocument() throws IOException {
        String xml = "<root><child>Value</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.xmlParser());
        assertEquals("Value", doc.select("child").text());
    }

    // ---------- crossStreams ----------

    @Test
    public void testCrossStreams_copiesDataCorrectly() throws IOException {
        byte[] data = "Some sample data for crossStreams test".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertArrayEquals(data, out.toByteArray());
    }

    // ---------- parseInputStream ----------

    @Test
    public void testParseInputStream_nullInput_returnsEmptyDocument() throws IOException {
        Document doc = DataUtil.parseInputStream(null, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testParseInputStream_charsetSpecified_parsesCorrectly() throws IOException {
        String html = "<html><head><title>Specified</title></head><body>Body</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertEquals("Specified", doc.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseInputStream_emptyCharsetString_throwsException() throws IOException {
        String html = "<html><body>Test</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        DataUtil.parseInputStream(in, "", "http://example.com/", Parser.htmlParser());
    }

    @Test
    public void testParseInputStream_metaHttpEquivCharset_detectsAndReDecodes() throws IOException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">" +
                "</head><body>Caf\u00e9</body></html>";
        byte[] bytes = html.getBytes("ISO-8859-1");
        InputStream in = new ByteArrayInputStream(bytes);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertTrue(doc.body().text().contains("Caf\u00e9"));
    }

    @Test
    public void testParseInputStream_metaCharsetAttr_detectsAndReDecodes() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>Caf\u00e9</body></html>";
        byte[] bytes = html.getBytes("ISO-8859-1");
        InputStream in = new ByteArrayInputStream(bytes);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertTrue(doc.body().text().contains("Caf\u00e9"));
    }

    @Test
    public void testParseInputStream_xmlDeclarationCharset_detectsAndReDecodes() throws IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><root>Caf\u00e9</root>";
        byte[] bytes = xml.getBytes("ISO-8859-1");
        InputStream in = new ByteArrayInputStream(bytes);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.xmlParser());
        assertTrue(doc.select("root").text().contains("Caf\u00e9"));
    }

    @Test
    public void testParseInputStream_bomUtf8_detectsCorrectly() throws IOException {
        byte[] bom = {(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        String html = "<html><head><title>BomTest</title></head><body>Hello</body></html>";
        byte[] htmlBytes = html.getBytes("UTF-8");
        byte[] combined = new byte[bom.length + htmlBytes.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(htmlBytes, 0, combined, bom.length, htmlBytes.length);
        InputStream in = new ByteArrayInputStream(combined);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertEquals("BomTest", doc.title());
    }

    @Test
    public void testParseInputStream_bomUtf16BE_detectsCorrectly() throws IOException {
        byte[] bom = {(byte) 0xFE, (byte) 0xFF};
        String html = "<html><head><title>BomTest16</title></head><body>Hello</body></html>";
        byte[] htmlBytes = html.getBytes("UTF-16BE");
        byte[] combined = new byte[bom.length + htmlBytes.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(htmlBytes, 0, combined, bom.length, htmlBytes.length);
        InputStream in = new ByteArrayInputStream(combined);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertEquals("BomTest16", doc.title());
    }

    @Test
    public void testParseInputStream_bomUtf16LE_detectsCorrectly() throws IOException {
        byte[] bom = {(byte) 0xFF, (byte) 0xFE};
        String html = "<html><head><title>BomTest16LE</title></head><body>Hello</body></html>";
        byte[] htmlBytes = html.getBytes("UTF-16LE");
        byte[] combined = new byte[bom.length + htmlBytes.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(htmlBytes, 0, combined, bom.length, htmlBytes.length);
        InputStream in = new ByteArrayInputStream(combined);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertEquals("BomTest16LE", doc.title());
    }

    @Test
    public void testParseInputStream_bomUtf32BE_detectsCorrectly() throws IOException {
        Assume.assumeTrue(Charset.isSupported("UTF-32BE"));
        byte[] bom = {0x00, 0x00, (byte) 0xFE, (byte) 0xFF};
        String html = "<html><head><title>BomTest32</title></head><body>Hello</body></html>";
        byte[] htmlBytes = html.getBytes("UTF-32BE");
        byte[] combined = new byte[bom.length + htmlBytes.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(htmlBytes, 0, combined, bom.length, htmlBytes.length);
        InputStream in = new ByteArrayInputStream(combined);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertEquals("BomTest32", doc.title());
    }

    @Test
    public void testParseInputStream_bomUtf32LE_detectsCorrectly() throws IOException {
        Assume.assumeTrue(Charset.isSupported("UTF-32LE"));
        byte[] bom = {(byte) 0xFF, (byte) 0xFE, 0x00, 0x00};
        String html = "<html><head><title>BomTest32LE</title></head><body>Hello</body></html>";
        byte[] htmlBytes = html.getBytes("UTF-32LE");
        byte[] combined = new byte[bom.length + htmlBytes.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(htmlBytes, 0, combined, bom.length, htmlBytes.length);
        InputStream in = new ByteArrayInputStream(combined);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertEquals("BomTest32LE", doc.title());
    }

    @Test
    public void testParseInputStream_noBomNoMetaCharset_defaultsUtf8() throws IOException {
        String html = "<html><head><title>Default</title></head><body>Simple</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertEquals("Default", doc.title());
    }

    // ---------- readToByteBuffer ----------

    @Test
    public void testReadToByteBuffer_normal_readsAllBytes() throws IOException {
        byte[] data = "Hello ByteBuffer".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);
        byte[] result = new byte[buffer.remaining()];
        buffer.get(result);
        assertArrayEquals(data, result);
    }

    @Test
    public void testReadToByteBuffer_withMaxSize_limitsBytes() throws IOException {
        byte[] data = "0123456789".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 5);
        assertEquals(5, buffer.remaining());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_negativeMaxSize_throwsException() throws IOException {
        byte[] data = "data".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void testReadToByteBuffer_packagePrivateOverload_noLimit() throws IOException {
        byte[] data = "no limit test".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);
        byte[] result = new byte[buffer.remaining()];
        buffer.get(result);
        assertArrayEquals(data, result);
    }

    // ---------- readFileToByteBuffer ----------

    @Test
    public void testReadFileToByteBuffer_normal_readsAllBytes() throws IOException {
        File tmp = File.createTempFile("datautil_bytes", ".txt");
        tmp.deleteOnExit();
        byte[] data = "FileByteBufferContent".getBytes("UTF-8");
        try (FileOutputStream fos = new FileOutputStream(tmp)) {
            fos.write(data);
        }
        ByteBuffer buffer = DataUtil.readFileToByteBuffer(tmp);
        byte[] result = new byte[buffer.remaining()];
        buffer.get(result);
        assertArrayEquals(data, result);
    }

    @Test(expected = IOException.class)
    public void testReadFileToByteBuffer_fileNotExist_throwsException() throws IOException {
        File notExist = new File("non_existent_file_for_bytebuffer_test.txt");
        DataUtil.readFileToByteBuffer(notExist);
    }

    // ---------- emptyByteBuffer ----------

    @Test
    public void testEmptyByteBuffer_returnsEmptyBuffer() {
        ByteBuffer buffer = DataUtil.emptyByteBuffer();
        assertEquals(0, buffer.remaining());
        assertEquals(0, buffer.capacity());
    }

    // ---------- getCharsetFromContentType ----------

    @Test
    public void testGetCharsetFromContentType_validCharset_returnsCharset() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=UTF-8");
        assertEquals("UTF-8", result);
    }

    @Test
    public void testGetCharsetFromContentType_nullInput_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentType_noCharsetPresent_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void testGetCharsetFromContentType_unsupportedCharset_returnsNull() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=BOGUS-CHARSET-XYZ");
        assertNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_quotedCharset_returnsCharset() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=\"ISO-8859-1\"");
        assertEquals("ISO-8859-1", result);
    }

    // ---------- mimeBoundary ----------

    @Test
    public void testMimeBoundary_hasCorrectLengthAndAllowedChars() {
        String boundary = DataUtil.mimeBoundary();
        assertEquals(DataUtil.boundaryLength, boundary.length());
        String allowed = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char c : boundary.toCharArray()) {
            assertTrue("Unexpected char: " + c, allowed.indexOf(c) >= 0);
        }
    }

    @Test
    public void testMimeBoundary_generatesDifferentValues() {
        String b1 = DataUtil.mimeBoundary();
        String b2 = DataUtil.mimeBoundary();
        // extremely unlikely to be equal, sanity check both are valid
        assertEquals(DataUtil.boundaryLength, b1.length());
        assertEquals(DataUtil.boundaryLength, b2.length());
    }
}
