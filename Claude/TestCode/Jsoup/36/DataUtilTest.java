import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.io.FileOutputStream;

public class DataUtilTest {

    private File tempHtmlFile;

    @Before
    public void setUp() throws IOException {
        tempHtmlFile = File.createTempFile("datautiltest", ".html");
        FileOutputStream fos = new FileOutputStream(tempHtmlFile);
        fos.write("<html><head><title>Test</title></head><body>Hello</body></html>".getBytes("UTF-8"));
        fos.close();
    }

    // ---------- load(File, String, String) ----------

    @Test
    public void testLoadFile_normalInput_returnsDocument() throws IOException {
        Document doc = DataUtil.load(tempHtmlFile, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
    }

    @Test(expected = FileNotFoundException.class)
    public void testLoadFile_fileNotFound_throwsIOException() throws IOException {
        File nonExistent = new File("this_file_should_not_exist_12345.html");
        DataUtil.load(nonExistent, "UTF-8", "http://example.com");
    }

    @Test
    public void testLoadFile_nullCharset_detectsFromMeta() throws IOException {
        Document doc = DataUtil.load(tempHtmlFile, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
    }

    // ---------- load(InputStream, String, String) ----------

    @Test
    public void testLoadInputStream_normalInput_returnsDocument() throws IOException {
        String html = "<html><head><title>Stream</title></head><body>Content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("Stream", doc.title());
    }

    @Test
    public void testLoadInputStream_nullCharset_autoDetectsDefault() throws IOException {
        String html = "<html><head><title>Auto</title></head><body>Content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("Auto", doc.title());
    }

    @Test
    public void testLoadInputStream_withMetaHttpEquivCharset_detectsCharset() throws IOException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">" +
                "<title>MetaTest</title></head><body>Content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("ISO-8859-1"));
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("MetaTest", doc.title());
    }

    @Test
    public void testLoadInputStream_withMetaCharsetAttr_detectsCharset() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\">" +
                "<title>MetaCharset</title></head><body>Content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("ISO-8859-1"));
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("MetaCharset", doc.title());
    }

    @Test
    public void testLoadInputStream_emptyInput_returnsDocument() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        assertNotNull(doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLoadInputStream_emptyCharsetName_throwsException() throws IOException {
        String html = "<html><body>Content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        DataUtil.load(in, "", "http://example.com");
    }

    // ---------- load(InputStream, String, String, Parser) ----------

    @Test
    public void testLoadInputStreamWithParser_xmlParser_returnsDocument() throws IOException {
        String xml = "<root><child>Value</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());
        assertNotNull(doc);
        assertNotNull(doc.select("child").first());
    }

    @Test
    public void testLoadInputStreamWithParser_htmlParser_returnsDocument() throws IOException {
        String html = "<html><head><title>ParserTest</title></head><body>Content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("ParserTest", doc.title());
    }

    // ---------- parseByteData (package-private) ----------

    @Test
    public void testParseByteData_nullCharsetNoMeta_defaultsToUtf8() throws IOException {
        String html = "<html><head><title>NoMeta</title></head><body>Content</body></html>";
        ByteBuffer buffer = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("NoMeta", doc.title());
    }

    @Test
    public void testParseByteData_bomPresent_stripsBom() throws IOException {
        String html = "\uFEFF<html><head><title>BomTest</title></head><body>Content</body></html>";
        ByteBuffer buffer = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("BomTest", doc.title());
    }

    @Test
    public void testParseByteData_specifiedCharset_decodesCorrectly() throws IOException {
        String html = "<html><head><title>Specified</title></head><body>Content</body></html>";
        ByteBuffer buffer = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Specified", doc.title());
    }

    @Test
    public void testParseByteData_metaFoundCharsetEqualsDefault_noRedecode() throws IOException {
        String html = "<html><head><meta charset=\"UTF-8\"><title>SameCharset</title></head><body>Content</body></html>";
        ByteBuffer buffer = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("SameCharset", doc.title());
    }

    @Test
    public void testParseByteData_metaEmptyCharset_keepsDefault() throws IOException {
        String html = "<html><head><meta charset=\"\"><title>EmptyCharset</title></head><body>Content</body></html>";
        ByteBuffer buffer = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("EmptyCharset", doc.title());
    }

    // ---------- readToByteBuffer(InputStream, int maxSize) ----------

    @Test
    public void testReadToByteBuffer_normalInput_readsAllBytes() throws IOException {
        byte[] data = "Hello World".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);
        assertNotNull(buffer);
        assertEquals(data.length, buffer.limit());
    }

    @Test
    public void testReadToByteBuffer_cappedMaxSize_truncatesData() throws IOException {
        byte[] data = "Hello World this is a longer string".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        int maxSize = 5;
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, maxSize);
        assertNotNull(buffer);
        assertEquals(maxSize, buffer.limit());
    }

    @Test
    public void testReadToByteBuffer_emptyInput_returnsEmptyBuffer() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);
        assertNotNull(buffer);
        assertEquals(0, buffer.limit());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_negativeMaxSize_throwsException() throws IOException {
        InputStream in = new ByteArrayInputStream("data".getBytes("UTF-8"));
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void testReadToByteBuffer_noArgOverload_worksCorrectly() throws IOException {
        byte[] data = "Testing overload".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);
        assertNotNull(buffer);
        assertEquals(data.length, buffer.limit());
    }

    // ---------- getCharsetFromContentType ----------

    @Test
    public void testGetCharsetFromContentType_nullInput_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentType_noCharsetInHeader_returnsNull() {
        String contentType = "text/html";
        assertNull(DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testGetCharsetFromContentType_validCharset_returnsCharset() {
        String contentType = "text/html; charset=UTF-8";
        String result = DataUtil.getCharsetFromContentType(contentType);
        assertEquals("UTF-8", result);
    }

    @Test
    public void testGetCharsetFromContentType_lowercaseCharsetName_returnsUppercased() {
        String contentType = "text/html; charset=euc-jp";
        String result = DataUtil.getCharsetFromContentType(contentType);
        assertNotNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_unsupportedCharset_returnsNull() {
        String contentType = "text/html; charset=totally-invalid-charset-name";
        String result = DataUtil.getCharsetFromContentType(contentType);
        assertNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_charsetWithQuotes_returnsCharset() {
        String contentType = "text/html; charset=\"UTF-8\"";
        String result = DataUtil.getCharsetFromContentType(contentType);
        assertEquals("UTF-8", result);
    }

    @Test
    public void testGetCharsetFromContentType_charsetWithTrailingSemicolon_returnsCharset() {
        String contentType = "text/html; charset=UTF-8;";
        String result = DataUtil.getCharsetFromContentType(contentType);
        assertEquals("UTF-8", result);
    }
}
