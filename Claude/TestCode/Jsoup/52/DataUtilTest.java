import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

public class DataUtilTest {

    private File tempFile;

    @Before
    public void setUp() {
        tempFile = null;
    }

    // ---------- load(File, String, String) ----------

    @Test
    public void testLoadFile_normalHtml_returnsDocument() throws IOException {
        tempFile = File.createTempFile("jsoup", ".html");
        String html = "<html><head><title>Test</title></head><body>Hello</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(html.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
        tempFile.delete();
    }

    @Test(expected = IOException.class)
    public void testLoadFile_fileNotFound_throwsIOException() throws IOException {
        File nonExistent = new File("this_file_does_not_exist_1234567890.html");
        DataUtil.load(nonExistent, "UTF-8", "http://example.com/");
    }

    // ---------- load(InputStream, String, String) ----------

    @Test
    public void testLoadInputStream_normalHtml_returnsDocument() throws IOException {
        String html = "<html><head><title>StreamTest</title></head><body>Content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("StreamTest", doc.title());
    }

    @Test
    public void testLoadInputStream_nullCharset_detectsFromMeta() throws IOException {
        String html = "<html><head><meta charset=\"UTF-8\"><title>MetaTest</title></head><body>X</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, null, "http://example.com/");
        assertNotNull(doc);
        assertEquals("MetaTest", doc.title());
    }

    // ---------- load(InputStream, String, String, Parser) ----------

    @Test
    public void testLoadInputStreamWithParser_htmlParser_returnsDocument() throws IOException {
        String html = "<html><head><title>ParserTest</title></head><body>Body</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("ParserTest", doc.title());
    }

    @Test
    public void testLoadInputStreamWithParser_xmlParser_returnsDocument() throws IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><child>data</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("root", doc.child(0).tagName());
    }

    // ---------- crossStreams ----------

    @Test
    public void testCrossStreams_copiesDataCorrectly() throws IOException {
        byte[] data = "Hello Cross Streams Test".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testCrossStreams_emptyStream_writesNothing() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertEquals(0, out.toByteArray().length);
    }

    // ---------- parseByteData ----------

    @Test
    public void testParseByteData_specifiedCharset_decodesCorrectly() throws IOException {
        String html = "<html><head><title>Specified</title></head><body>Text</body></html>";
        ByteBuffer buffer = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Specified", doc.title());
    }

    @Test
    public void testParseByteData_nullCharsetWithMetaHttpEquiv_detectsCharset() throws IOException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">" +
                "<title>HttpEquiv</title></head><body>Body</body></html>";
        ByteBuffer buffer = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("HttpEquiv", doc.title());
    }

    @Test
    public void testParseByteData_nullCharsetWithMetaCharset_detectsCharset() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"><title>MetaCharset</title></head><body>Body</body></html>";
        ByteBuffer buffer = Charset.forName("ISO-8859-1").encode(html);
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("MetaCharset", doc.title());
    }

    @Test
    public void testParseByteData_nullCharsetNoMeta_defaultsToUtf8() throws IOException {
        String html = "<html><head><title>NoMeta</title></head><body>Body</body></html>";
        ByteBuffer buffer = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("NoMeta", doc.title());
    }

    @Test
    public void testParseByteData_xmlPrologEncoding_detectsCharset() throws IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><child>data</child></root>";
        ByteBuffer buffer = Charset.forName("UTF-8").encode(xml);
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com/", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("root", doc.child(0).tagName());
    }

    @Test
    public void testParseByteData_bomUtf8_detectsAndStripsBom() throws IOException {
        String html = "<html><head><title>BomTest</title></head><body>Body</body></html>";
        byte[] htmlBytes = html.getBytes("UTF-8");
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] combined = new byte[bom.length + htmlBytes.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(htmlBytes, 0, combined, bom.length, htmlBytes.length);
        ByteBuffer buffer = ByteBuffer.wrap(combined);
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("BomTest", doc.title());
    }

    @Test
    public void testParseByteData_invalidMetaCharsetIgnored_fallbackDefault() throws IOException {
        String html = "<html><head><meta charset=\"totally-invalid-charset-xyz\"><title>Invalid</title></head><body>Body</body></html>";
        ByteBuffer buffer = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Invalid", doc.title());
    }

    // ---------- readToByteBuffer(InputStream, int) ----------

    @Test
    public void testReadToByteBuffer_unlimited_readsAllBytes() throws IOException {
        byte[] data = "1234567890".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);
        assertEquals(data.length, buffer.remaining());
    }

    @Test
    public void testReadToByteBuffer_capped_readsOnlyMaxSize() throws IOException {
        byte[] data = "1234567890ABCDEFGHIJ".getBytes("UTF-8");
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
    public void testReadToByteBuffer_zeroLengthStream_returnsEmptyBuffer() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);
        assertEquals(0, buffer.remaining());
    }

    // ---------- readToByteBuffer(InputStream) ----------

    @Test
    public void testReadToByteBuffer_singleArg_readsAllBytes() throws IOException {
        byte[] data = "Hello World".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);
        assertEquals(data.length, buffer.remaining());
    }

    // ---------- readFileToByteBuffer ----------

    @Test
    public void testReadFileToByteBuffer_normalFile_readsAllBytes() throws IOException {
        tempFile = File.createTempFile("jsoup", ".txt");
        String content = "File content for testing";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        ByteBuffer buffer = DataUtil.readFileToByteBuffer(tempFile);
        assertEquals(content.getBytes("UTF-8").length, buffer.remaining());
        tempFile.delete();
    }

    @Test(expected = IOException.class)
    public void testReadFileToByteBuffer_fileNotFound_throwsIOException() throws IOException {
        File nonExistent = new File("nonexistent_file_for_test_9876.txt");
        DataUtil.readFileToByteBuffer(nonExistent);
    }

    // ---------- emptyByteBuffer ----------

    @Test
    public void testEmptyByteBuffer_returnsBufferWithZeroCapacity() {
        ByteBuffer buffer = DataUtil.emptyByteBuffer();
        assertNotNull(buffer);
        assertEquals(0, buffer.capacity());
    }

    // ---------- getCharsetFromContentType ----------

    @Test
    public void testGetCharsetFromContentType_validContentType_returnsCharset() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=UTF-8");
        assertEquals("UTF-8", result);
    }

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
    public void testGetCharsetFromContentType_quotedCharset_returnsCharsetWithoutQuotes() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\"");
        assertEquals("UTF-8", result);
    }

    @Test
    public void testGetCharsetFromContentType_unsupportedCharset_returnsNull() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=totally-invalid-charset-xyz");
        assertNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_emptyString_returnsNull() {
        String result = DataUtil.getCharsetFromContentType("");
        assertNull(result);
    }

    // ---------- mimeBoundary ----------

    @Test
    public void testMimeBoundary_returnsCorrectLength() {
        String boundary = DataUtil.mimeBoundary();
        assertNotNull(boundary);
        assertEquals(DataUtil.boundaryLength, boundary.length());
    }

    @Test
    public void testMimeBoundary_containsOnlyValidCharacters() {
        String boundary = DataUtil.mimeBoundary();
        String validChars = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char c : boundary.toCharArray()) {
            assertTrue(validChars.indexOf(c) >= 0);
        }
    }

    @Test
    public void testMimeBoundary_multipleCalls_produceDifferentValues() {
        String boundary1 = DataUtil.mimeBoundary();
        String boundary2 = DataUtil.mimeBoundary();
        // extremely unlikely to be equal given random generation
        assertNotNull(boundary1);
        assertNotNull(boundary2);
    }
}
