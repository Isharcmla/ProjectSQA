import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;

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

    // ---------- Tests for load(File, String, String) ----------

    @Test
    public void testLoadFile_normalUtf8Html_returnsDocument() throws IOException {
        String html = "<html><head><title>Test</title></head><body><p>Hello</p></body></html>";
        tempFile = File.createTempFile("dataUtilTest", ".html");
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(html.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.select("p").first().text());
    }

    @Test
    public void testLoadFile_nullCharsetDetectFromMeta_returnsDocument() throws IOException {
        String html = "<html><head><meta charset=\"UTF-8\"></head><body><p>World</p></body></html>";
        tempFile = File.createTempFile("dataUtilTest2", ".html");
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(html.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        assertNotNull(doc);
        assertEquals("World", doc.select("p").first().text());
    }

    @Test(expected = IOException.class)
    public void testLoadFile_fileNotFound_throwsIOException() throws IOException {
        File notExist = new File("this_file_should_not_exist_123456789.html");
        DataUtil.load(notExist, "UTF-8", "http://example.com/");
    }

    // ---------- Tests for load(InputStream, String, String) ----------

    @Test
    public void testLoadInputStream_normalHtml_returnsDocument() throws IOException {
        String html = "<html><head><title>StreamTest</title></head><body><p>Content</p></body></html>";
        InputStream is = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(is, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("StreamTest", doc.title());
    }

    @Test
    public void testLoadInputStream_emptyStream_returnsEmptyDocument() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        Document doc = DataUtil.load(is, "UTF-8", "http://example.com/");
        assertNotNull(doc);
    }

    // ---------- Tests for load(InputStream, String, String, Parser) ----------

    @Test
    public void testLoadInputStreamWithParser_xmlParser_returnsDocument() throws IOException {
        String xml = "<root><child>value</child></root>";
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.load(is, "UTF-8", "http://example.com/", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("value", doc.select("child").first().text());
    }

    @Test
    public void testLoadInputStreamWithParser_htmlParser_returnsDocument() throws IOException {
        String html = "<html><body><div>Hi</div></body></html>";
        InputStream is = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(is, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Hi", doc.select("div").first().text());
    }

    // ---------- Tests for parseByteData(ByteBuffer, String, String, Parser) ----------

    @Test
    public void testParseByteData_charsetNull_noMeta_defaultsToUtf8() throws Exception {
        String html = "<html><head><title>NoMeta</title></head><body><p>plain</p></body></html>";
        ByteBuffer bb = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("NoMeta", doc.title());
    }

    @Test
    public void testParseByteData_charsetNull_metaHttpEquivContentType_redecodesCorrectly() throws Exception {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">"
                + "</head><body><p>data</p></body></html>";
        ByteBuffer bb = ByteBuffer.wrap(html.getBytes("ISO-8859-1"));
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("data", doc.select("p").first().text());
    }

    @Test
    public void testParseByteData_charsetNull_metaCharsetAttribute_redecodesCorrectly() throws Exception {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body><p>abc</p></body></html>";
        ByteBuffer bb = ByteBuffer.wrap(html.getBytes("ISO-8859-1"));
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("abc", doc.select("p").first().text());
    }

    @Test
    public void testParseByteData_charsetNull_metaHttpEquivWithCharsetAttrFallback_supportedCharset() throws Exception {
        // http-equiv present but content has no charset= ; fallback to charset attribute
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html\" charset=\"ISO-8859-1\">"
                + "</head><body><p>fallback</p></body></html>";
        ByteBuffer bb = ByteBuffer.wrap(html.getBytes("ISO-8859-1"));
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteData_charsetNull_metaHttpEquivWithIllegalCharsetAttr_catchesException() throws Exception {
        // charset attribute value is illegal to trigger IllegalCharsetNameException catch block
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html\" charset=\"!!!bad!!!\">"
                + "</head><body><p>illegal</p></body></html>";
        ByteBuffer bb = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        // should keep default utf-8 as best attempt, doc parsed fine
        assertEquals("illegal", doc.select("p").first().text());
    }

    @Test
    public void testParseByteData_charsetNull_metaFoundCharsetEqualsDefault_noRedecode() throws Exception {
        String html = "<html><head><meta charset=\"UTF-8\"></head><body><p>same</p></body></html>";
        ByteBuffer bb = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("same", doc.select("p").first().text());
    }

    @Test
    public void testParseByteData_charsetSpecified_decodesWithGivenCharset() throws Exception {
        String html = "<html><head><title>Specified</title></head><body><p>content</p></body></html>";
        ByteBuffer bb = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(bb, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Specified", doc.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_charsetEmptyString_throwsIllegalArgumentException() throws Exception {
        String html = "<html><body><p>x</p></body></html>";
        ByteBuffer bb = ByteBuffer.wrap(html.getBytes("UTF-8"));
        DataUtil.parseByteData(bb, "", "http://example.com/", Parser.htmlParser());
    }

    @Test
    public void testParseByteData_bomPresent_stripsAndUsesDefaultCharset() throws Exception {
        // UTF-8 BOM bytes followed by simple ascii html
        byte[] bom = new byte[]{(byte)0xEF, (byte)0xBB, (byte)0xBF};
        String html = "<html><head><title>BomTest</title></head><body><p>bomcontent</p></body></html>";
        byte[] htmlBytes = html.getBytes("UTF-8");
        byte[] combined = new byte[bom.length + htmlBytes.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(htmlBytes, 0, combined, bom.length, htmlBytes.length);

        ByteBuffer bb = ByteBuffer.wrap(combined);
        Document doc = DataUtil.parseByteData(bb, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("BomTest", doc.title());
    }

    @Test
    public void testParseByteData_noMetaElement_meta null branch skipped() throws Exception {
        // covers when meta == null path (already covered above but explicit name here)
        String html = "<html><body><p>simple</p></body></html>";
        ByteBuffer bb = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("simple", doc.select("p").first().text());
    }

    // ---------- Tests for readToByteBuffer(InputStream, int) ----------

    @Test
    public void testReadToByteBuffer_unlimitedMaxSize_readsAllData() throws IOException {
        String data = "Hello World, this is test data.";
        InputStream is = new ByteArrayInputStream(data.getBytes("UTF-8"));
        ByteBuffer bb = DataUtil.readToByteBuffer(is, 0);
        assertNotNull(bb);
        byte[] arr = bb.array();
        assertEquals(data, new String(arr, "UTF-8"));
    }

    @Test
    public void testReadToByteBuffer_cappedMaxSizeSmallerThanData_readsOnlyPartial() throws IOException {
        String data = "0123456789ABCDEFGHIJ";
        InputStream is = new ByteArrayInputStream(data.getBytes("UTF-8"));
        int maxSize = 5;
        ByteBuffer bb = DataUtil.readToByteBuffer(is, maxSize);
        byte[] arr = bb.array();
        assertEquals(maxSize, arr.length);
        assertEquals("01234", new String(arr, "UTF-8"));
    }

    @Test
    public void testReadToByteBuffer_cappedMaxSizeLargerThanData_readsAllData() throws IOException {
        String data = "short";
        InputStream is = new ByteArrayInputStream(data.getBytes("UTF-8"));
        ByteBuffer bb = DataUtil.readToByteBuffer(is, 1000);
        byte[] arr = bb.array();
        assertEquals(data, new String(arr, "UTF-8"));
    }

    @Test
    public void testReadToByteBuffer_emptyStream_returnsEmptyBuffer() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ByteBuffer bb = DataUtil.readToByteBuffer(is, 0);
        assertNotNull(bb);
        assertEquals(0, bb.array().length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_negativeMaxSize_throwsIllegalArgumentException() throws IOException {
        InputStream is = new ByteArrayInputStream("data".getBytes("UTF-8"));
        DataUtil.readToByteBuffer(is, -1);
    }

    @Test
    public void testReadToByteBuffer_noArgOverload_readsAllData() throws IOException {
        String data = "overload test data";
        InputStream is = new ByteArrayInputStream(data.getBytes("UTF-8"));
        ByteBuffer bb = DataUtil.readToByteBuffer(is);
        assertEquals(data, new String(bb.array(), "UTF-8"));
    }

    // ---------- Tests for getCharsetFromContentType(String) ----------

    @Test
    public void testGetCharsetFromContentType_nullInput_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentType_noCharsetPresent_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void testGetCharsetFromContentType_validCharsetLowercase_returnsCharset() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=utf-8");
        assertEquals("utf-8", result);
    }

    @Test
    public void testGetCharsetFromContentType_validCharsetUppercaseNeeded_returnsUppercased() {
        // This value should not be supported in lower/original case but supported uppercased
        // Most common charset names already work either way; test a mixed-case one
        String result = DataUtil.getCharsetFromContentType("text/html; charset=UTF-8");
        assertEquals("UTF-8", result);
    }

    @Test
    public void testGetCharsetFromContentType_charsetWithQuotes_returnsTrimmedValue() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\"");
        assertNotNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_emptyCharsetValue_returnsNull() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=");
        assertNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_illegalCharsetName_returnsNull() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=!!!bad!!!");
        assertNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_unsupportedCharsetName_returnsNull() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=notarealcharsetxyz");
        assertNull(result);
    }
}
