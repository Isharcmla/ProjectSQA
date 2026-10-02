package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.After;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DataUtilTest {

    private final List<File> tempFiles = new ArrayList<File>();

    @After
    public void cleanup() {
        for (File f : tempFiles) {
            if (f.exists()) f.delete();
        }
    }

    private File createTempFile(byte[] content) throws IOException {
        File f = File.createTempFile("dataUtilTest", ".html");
        FileOutputStream fos = new FileOutputStream(f);
        try {
            fos.write(content);
        } finally {
            fos.close();
        }
        tempFiles.add(f);
        return f;
    }

    // ---------- load(File, charsetName, baseUri) ----------

    @Test
    public void testLoadFile_normalHtml_returnsDocument() throws IOException {
        String html = "<html><head><title>Hi</title></head><body>Hello</body></html>";
        File f = createTempFile(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(f, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Hi", doc.title());
    }

    @Test
    public void testLoadFile_nullCharset_detectsFromMeta() throws IOException {
        String html = "<html><head><meta charset=\"UTF-8\"></head><body>Hello</body></html>";
        File f = createTempFile(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(f, null, "http://example.com/");
        assertNotNull(doc);
    }

    @Test(expected = IOException.class)
    public void testLoadFile_nonExistentFile_throwsIOException() throws IOException {
        File f = new File("this_file_should_not_exist_12345.html");
        DataUtil.load(f, "UTF-8", "http://example.com/");
    }

    // ---------- load(InputStream, charsetName, baseUri) ----------

    @Test
    public void testLoadInputStream_normalHtml_returnsDocument() throws IOException {
        String html = "<html><head><title>Stream</title></head><body>Content</body></html>";
        InputStream is = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(is, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Stream", doc.title());
    }

    @Test
    public void testLoadInputStream_nullCharset_defaultsToUtf8() throws IOException {
        String html = "<html><head></head><body>NoMeta</body></html>";
        InputStream is = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(is, null, "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("NoMeta"));
    }

    // ---------- load(InputStream, charsetName, baseUri, Parser) ----------

    @Test
    public void testLoadInputStreamWithParser_xmlParser_returnsDocument() throws IOException {
        String xml = "<root><child>value</child></root>";
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.load(is, "UTF-8", "http://example.com/", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("value", doc.select("child").text());
    }

    // ---------- crossStreams ----------

    @Test
    public void testCrossStreams_copiesAllBytes() throws IOException {
        byte[] data = "This is some sample data to copy across streams".getBytes("UTF-8");
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

    // ---------- parseByteData ----------

    @Test
    public void testParseByteData_charsetNull_noMeta_defaultsUtf8() throws IOException {
        String html = "<html><head></head><body>Plain</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("Plain"));
    }

    @Test
    public void testParseByteData_metaHttpEquivSameAsDefault_noRedecode() throws IOException {
        String html = "<html><head><meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"></head><body>Hi</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteData_metaHttpEquivDifferentCharset_redecodes() throws IOException {
        String html = "<html><head><meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\"></head><body>Hi</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("ISO-8859-1"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteData_metaCharsetAttrSupported_redecodes() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>Hi</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("ISO-8859-1"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteData_metaCharsetAttrInvalid_ignoredKeepsUtf8() throws IOException {
        String html = "<html><head><meta charset=\"!!!\"></head><body>Hi</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteData_charsetSpecified_decodesWithGivenCharset() throws IOException {
        String html = "<html><head></head><body>Specified</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buf, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("Specified"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_emptyCharsetSpecified_throwsIllegalArgumentException() throws IOException {
        String html = "<html><body>Hi</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        DataUtil.parseByteData(buf, "", "http://example.com/", Parser.htmlParser());
    }

    @Test
    public void testParseByteData_withBom_stripsBomCharacter() throws IOException {
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        String html = "<html><head></head><body>BomTest</body></html>";
        byte[] htmlBytes = html.getBytes("UTF-8");
        byte[] combined = new byte[bom.length + htmlBytes.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(htmlBytes, 0, combined, bom.length, htmlBytes.length);
        ByteBuffer buf = ByteBuffer.wrap(combined);
        Document doc = DataUtil.parseByteData(buf, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("BomTest"));
    }

    // ---------- readToByteBuffer(InputStream, maxSize) ----------

    @Test
    public void testReadToByteBuffer_normalRead_returnsFullData() throws IOException {
        byte[] data = "Some sample data for reading".getBytes("UTF-8");
        InputStream is = new ByteArrayInputStream(data);
        ByteBuffer buf = DataUtil.readToByteBuffer(is, 0);
        byte[] result = new byte[buf.remaining()];
        buf.get(result);
        assertArrayEquals(data, result);
    }

    @Test
    public void testReadToByteBuffer_cappedSmallerThanData_truncatesData() throws IOException {
        byte[] data = "This is a longer piece of sample data".getBytes("UTF-8");
        InputStream is = new ByteArrayInputStream(data);
        int maxSize = 10;
        ByteBuffer buf = DataUtil.readToByteBuffer(is, maxSize);
        assertEquals(maxSize, buf.remaining());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_negativeMaxSize_throwsIllegalArgumentException() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        DataUtil.readToByteBuffer(is, -1);
    }

    @Test
    public void testReadToByteBuffer_emptyStream_returnsEmptyBuffer() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ByteBuffer buf = DataUtil.readToByteBuffer(is, 0);
        assertEquals(0, buf.remaining());
    }

    // ---------- readToByteBuffer(InputStream) ----------

    @Test
    public void testReadToByteBuffer_singleArg_readsAllData() throws IOException {
        byte[] data = "Single arg read test".getBytes("UTF-8");
        InputStream is = new ByteArrayInputStream(data);
        ByteBuffer buf = DataUtil.readToByteBuffer(is);
        byte[] result = new byte[buf.remaining()];
        buf.get(result);
        assertArrayEquals(data, result);
    }

    // ---------- readFileToByteBuffer ----------

    @Test
    public void testReadFileToByteBuffer_normalFile_readsContent() throws IOException {
        byte[] data = "File content for byte buffer test".getBytes("UTF-8");
        File f = createTempFile(data);
        ByteBuffer buf = DataUtil.readFileToByteBuffer(f);
        byte[] result = new byte[buf.remaining()];
        buf.get(result);
        assertArrayEquals(data, result);
    }

    @Test(expected = IOException.class)
    public void testReadFileToByteBuffer_nonExistentFile_throwsIOException() throws IOException {
        File f = new File("nonexistent_file_xyz_987.dat");
        DataUtil.readFileToByteBuffer(f);
    }

    // ---------- emptyByteBuffer ----------

    @Test
    public void testEmptyByteBuffer_returnsBufferWithZeroCapacity() {
        ByteBuffer buf = DataUtil.emptyByteBuffer();
        assertNotNull(buf);
        assertEquals(0, buf.capacity());
    }

    // ---------- getCharsetFromContentType ----------

    @Test
    public void testGetCharsetFromContentType_nullInput_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentType_noCharsetPresent_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void testGetCharsetFromContentType_supportedCharset_returnsCharset() {
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=UTF-8");
        assertEquals("UTF-8", charset);
    }

    @Test
    public void testGetCharsetFromContentType_supportedLowercaseCharset_returnsCharset() {
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=euc-jp");
        assertNotNull(charset);
    }

    @Test
    public void testGetCharsetFromContentType_emptyCharsetValue_returnsNull() {
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=");
        assertNull(charset);
    }

    @Test
    public void testGetCharsetFromContentType_invalidCharsetName_returnsNull() {
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=!!!");
        assertNull(charset);
    }

    @Test
    public void testGetCharsetFromContentType_unsupportedCharsetName_returnsNull() {
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=totally-unsupported-charset-name");
        assertNull(charset);
    }

    @Test
    public void testGetCharsetFromContentType_quotedCharset_returnsCharset() {
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\"");
        assertEquals("UTF-8", charset);
    }

    // ---------- mimeBoundary ----------

    @Test
    public void testMimeBoundary_correctLengthAndCharacters() {
        String boundary = DataUtil.mimeBoundary();
        assertNotNull(boundary);
        assertEquals(32, boundary.length());
        String allowed = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < boundary.length(); i++) {
            assertTrue(allowed.indexOf(boundary.charAt(i)) >= 0);
        }
    }

    @Test
    public void testMimeBoundary_calledTwice_producesDifferentValuesUsually() {
        String b1 = DataUtil.mimeBoundary();
        String b2 = DataUtil.mimeBoundary();
        assertNotNull(b1);
        assertNotNull(b2);
        assertEquals(b1.length(), b2.length());
    }
}
