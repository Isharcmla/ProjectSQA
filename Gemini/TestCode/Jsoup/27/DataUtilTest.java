package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class DataUtilTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<DataUtil> constructor = DataUtil.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        DataUtil instance = constructor.newInstance();
        assertNotNull(instance);
    }

    @Test
    public void testLoadFile_withExplicitCharset_success() throws IOException {
        File file = tempFolder.newFile("test_explicit.html");
        String content = "<html><head><title>Test</title></head><body>Hello File</body></html>";
        try (FileOutputStream out = new FileOutputStream(file)) {
            out.write(content.getBytes(StandardCharsets.UTF_8));
        }

        Document doc = DataUtil.load(file, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
        assertEquals("Hello File", doc.body().text());
    }

    @Test
    public void testLoadFile_withNullCharset_detectsMetaCharset() throws IOException {
        File file = tempFolder.newFile("test_meta.html");
        String content = "<html><head><meta charset=\"ISO-8859-1\"><title>Meta Test</title></head><body>Loaded</body></html>";
        try (FileOutputStream out = new FileOutputStream(file)) {
            out.write(content.getBytes(StandardCharsets.ISO_8859_1));
        }

        Document doc = DataUtil.load(file, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("Meta Test", doc.title());
    }

    @Test(expected = IOException.class)
    public void testLoadFile_nonExistentFile_throwsIOException() throws IOException {
        File file = new File(tempFolder.getRoot(), "non_existent_file.html");
        DataUtil.load(file, "UTF-8", "http://example.com");
    }

    @Test
    public void testLoadInputStream_withExplicitCharset_success() throws IOException {
        String html = "<html><head><title>Stream</title></head><body>Stream Content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("Stream", doc.title());
        assertEquals("Stream Content", doc.body().text());
    }

    @Test
    public void testLoadInputStream_withParser_success() throws IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><child>Value</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("Value", doc.select("child").text());
    }

    @Test
    public void testParseByteData_nullCharset_noMetaTag_defaultsToUtf8() {
        String html = "<html><head><title>No Meta</title></head><body>No Meta Body</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("No Meta", doc.title());
    }

    @Test
    public void testParseByteData_nullCharset_metaHttpEquivWithCharset_reDecodes() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"><title>HttpEquiv</title></head><body>Content</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.ISO_8859_1));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("HttpEquiv", doc.title());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_nullCharset_metaCharsetHtml5_reDecodes() {
        String html = "<html><head><meta charset=\"ISO-8859-1\"><title>HTML5 Meta</title></head><body>Content</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.ISO_8859_1));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("HTML5 Meta", doc.title());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_nullCharset_metaCharsetUtf8_doesNotReDecode() {
        String html = "<html><head><meta charset=\"UTF-8\"><title>UTF8 Meta</title></head><body>Content</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF8 Meta", doc.title());
    }

    @Test
    public void testParseByteData_nullCharset_emptyMetaCharset_defaultsToUtf8() {
        String html = "<html><head><meta charset=\"\"><title>Empty Meta</title></head><body>Content</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Empty Meta", doc.title());
    }

    @Test
    public void testParseByteData_nullCharset_httpEquivWithoutCharset_defaultsToUtf8() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html\"><title>No Charset In HttpEquiv</title></head><body>Content</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("No Charset In HttpEquiv", doc.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_emptyCharset_throwsIllegalArgumentException() {
        String html = "<html><body>Content</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        DataUtil.parseByteData(buffer, "", "http://example.com", Parser.htmlParser());
    }

    @Test
    public void testParseByteData_withBom_stripsBom() {
        String htmlWithBom = "\uFEFF<html><head><title>BOM Test</title></head><body>Hello BOM</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(htmlWithBom.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("BOM Test", doc.title());
        assertEquals("Hello BOM", doc.body().text());
    }

    @Test
    public void testParseByteData_reDecodeWithBom_stripsBom() {
        String htmlWithBom = "\uFEFF<html><head><meta charset=\"ISO-8859-1\"><title>BOM ReDecode</title></head><body>ReDecode</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(htmlWithBom.getBytes(StandardCharsets.ISO_8859_1));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("BOM ReDecode", doc.title());
    }

    @Test
    public void testReadToByteBuffer_emptyStream_returnsEmptyBuffer() throws IOException {
        InputStream emptyStream = new ByteArrayInputStream(new byte[0]);
        ByteBuffer buffer = DataUtil.readToByteBuffer(emptyStream);
        assertEquals(0, buffer.remaining());
    }

    @Test
    public void testReadToByteBuffer_largeStream_buffersProperly() throws IOException {
        int largeSize = 0x20000 * 2 + 1024; // ~260 KB, exceeding buffer size
        byte[] data = new byte[largeSize];
        Arrays.fill(data, (byte) 'x');
        InputStream stream = new ByteArrayInputStream(data);

        ByteBuffer buffer = DataUtil.readToByteBuffer(stream);
        assertEquals(largeSize, buffer.remaining());
        assertEquals('x', buffer.get(0));
        assertEquals('x', buffer.get(largeSize - 1));
    }

    @Test
    public void testGetCharsetFromContentType_nullInput_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentType_noCharsetPresent_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
        assertNull(DataUtil.getCharsetFromContentType("text/plain; boundary=something"));
    }

    @Test
    public void testGetCharsetFromContentType_standardCharset_returnsUppercaseTrimmed() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=utf-8"));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=ISO-8859-1; other=val"));
    }

    @Test
    public void testGetCharsetFromContentType_quotedCharset_returnsStripped() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\""));
        assertEquals("GB2312", DataUtil.getCharsetFromContentType("text/html; charset= \"gb2312\""));
    }

    @Test
    public void testGetCharsetFromContentType_whitespaceAndCaseVariations() {
        assertEquals("EUC-JP", DataUtil.getCharsetFromContentType("text/html; CHARSET = euc-jp"));
        assertEquals("SHIFT_JIS", DataUtil.getCharsetFromContentType("text/html; Charset=Shift_JIS"));
    }

    @Test
    public void testGetCharsetFromContentType_emptyCharsetValue_returnsEmptyString() {
        assertEquals("", DataUtil.getCharsetFromContentType("text/html; charset="));
    }
}
