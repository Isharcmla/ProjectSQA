package org.jsoup.helper;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

public class DataUtilTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ---------- load(File, String, String) ----------

    @Test
    public void testLoadFile_normalHtml_returnsDocument() throws IOException {
        File file = tempFolder.newFile("test1.html");
        String html = "<html><head><title>File Title</title></head><body>Hello File</body></html>";
        writeStringToFile(file, html, "UTF-8");

        Document doc = DataUtil.load(file, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("File Title", doc.title());
        assertTrue(doc.body().text().contains("Hello File"));
    }

    @Test(expected = FileNotFoundException.class)
    public void testLoadFile_fileNotFound_throwsFileNotFoundException() throws IOException {
        File nonExistent = new File(tempFolder.getRoot(), "doesNotExist.html");
        DataUtil.load(nonExistent, "UTF-8", "http://example.com/");
    }

    // ---------- load(InputStream, String, String) ----------

    @Test
    public void testLoadInputStream_normalHtml_returnsDocument() throws IOException {
        String html = "<html><head><title>Stream Title</title></head><body>Hello Stream</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Stream Title", doc.title());
    }

    // ---------- load(InputStream, String, String, Parser) ----------

    @Test
    public void testLoadInputStreamWithParser_xmlParser_returnsDocument() throws IOException {
        String xml = "<root><child>value</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.xmlParser());
        assertNotNull(doc);
        assertTrue(doc.select("child").size() > 0);
        assertEquals("value", doc.select("child").text());
    }

    // ---------- parseByteData ----------

    @Test
    public void testParseByteData_charsetNull_noMeta_defaultsUtf8() throws Exception {
        String html = "<html><head><title>NoMeta</title></head><body>text</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));

        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("NoMeta", doc.title());
    }

    @Test
    public void testParseByteData_charsetNull_metaCharset_detectsCharset() throws Exception {
        String html = "<html><head><meta charset=\"ISO-8859-1\"><title>MetaCharset</title></head><body>text</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("ISO-8859-1"));

        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("MetaCharset", doc.title());
    }

    @Test
    public void testParseByteData_charsetNull_metaHttpEquiv_detectsCharset() throws Exception {
        String html = "<html><head><meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\">"
                + "<title>MetaHttpEquiv</title></head><body>text</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("ISO-8859-1"));

        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("MetaHttpEquiv", doc.title());
    }

    @Test
    public void testParseByteData_charsetSpecified_usesSpecifiedCharset() throws Exception {
        String html = "<html><head><title>SpecifiedCharset</title></head><body>text</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));

        Document doc = DataUtil.parseByteData(buf, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("SpecifiedCharset", doc.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_charsetEmpty_throwsIllegalArgumentException() throws Exception {
        String html = "<html><head><title>Empty</title></head><body>text</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));

        DataUtil.parseByteData(buf, "", "http://example.com/", Parser.htmlParser());
    }

    @Test
    public void testParseByteData_bomPresent_stripsBom() throws Exception {
        String html = "\uFEFF<html><head><title>BomTest</title></head><body>text</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));

        Document doc = DataUtil.parseByteData(buf, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("BomTest", doc.title());
    }

    @Test
    public void testParseByteData_metaFoundButEqualsDefaultCharset_noRedecode() throws Exception {
        String html = "<html><head><meta charset=\"UTF-8\"><title>SameCharset</title></head><body>text</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));

        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("SameCharset", doc.title());
    }

    // ---------- readToByteBuffer ----------

    @Test
    public void testReadToByteBuffer_normalStream_returnsCorrectBytes() throws IOException {
        String content = "Hello World Data";
        InputStream in = new ByteArrayInputStream(content.getBytes("UTF-8"));

        ByteBuffer buf = DataUtil.readToByteBuffer(in);
        byte[] arr = new byte[buf.remaining()];
        buf.get(arr);
        String result = new String(arr, "UTF-8");
        assertEquals(content, result);
    }

    @Test
    public void testReadToByteBuffer_emptyStream_returnsEmptyBuffer() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);

        ByteBuffer buf = DataUtil.readToByteBuffer(in);
        assertEquals(0, buf.remaining());
    }

    // ---------- getCharsetFromContentType ----------

    @Test
    public void testGetCharsetFromContentType_withCharset_returnsUppercase() {
        String contentType = "text/html; charset=euc-jp";
        String result = DataUtil.getCharsetFromContentType(contentType);
        assertEquals("EUC-JP", result);
    }

    @Test
    public void testGetCharsetFromContentType_withQuotedCharset_returnsUppercase() {
        String contentType = "text/html; charset=\"ISO-8859-1\"";
        String result = DataUtil.getCharsetFromContentType(contentType);
        assertEquals("ISO-8859-1", result);
    }

    @Test
    public void testGetCharsetFromContentType_noCharset_returnsNull() {
        String contentType = "text/html";
        String result = DataUtil.getCharsetFromContentType(contentType);
        assertNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_nullInput_returnsNull() {
        String result = DataUtil.getCharsetFromContentType(null);
        assertNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_emptyString_returnsNull() {
        String result = DataUtil.getCharsetFromContentType("");
        assertNull(result);
    }

    // ---------- helper ----------

    private void writeStringToFile(File file, String content, String charsetName) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        try {
            fos.write(content.getBytes(Charset.forName(charsetName)));
        } finally {
            fos.close();
        }
    }
}
