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
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

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
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        DataUtil instance = constructor.newInstance();
        assertNotNull(instance);
    }

    @Test
    public void testLoadFile_validFileWithCharset_returnsDocument() throws IOException {
        File file = tempFolder.newFile("test.html");
        try (FileOutputStream out = new FileOutputStream(file)) {
            out.write("<p>Hello World</p>".getBytes(StandardCharsets.UTF_8));
        }

        Document doc = DataUtil.load(file, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("Hello World", doc.select("p").text());
    }

    @Test
    public void testLoadFile_validFileNullCharset_detectsDefaultUtf8() throws IOException {
        File file = tempFolder.newFile("test_null_charset.html");
        try (FileOutputStream out = new FileOutputStream(file)) {
            out.write("<p>Auto Detect</p>".getBytes(StandardCharsets.UTF_8));
        }

        Document doc = DataUtil.load(file, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("Auto Detect", doc.select("p").text());
    }

    @Test(expected = IOException.class)
    public void testLoadFile_nonExistentFile_throwsIOException() throws IOException {
        File nonExistent = new File(tempFolder.getRoot(), "does_not_exist.html");
        DataUtil.load(nonExistent, "UTF-8", "http://example.com");
    }

    @Test
    public void testLoadInputStream_validStream_returnsDocument() throws IOException {
        String html = "<div>Stream Content</div>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("Stream Content", doc.select("div").text());
    }

    @Test
    public void testLoadInputStreamWithParser_xmlParser_returnsXmlDocument() throws IOException {
        String xml = "<root><item>Value</item></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("Value", doc.select("item").text());
    }

    @Test
    public void testParseByteData_nullCharsetNoMeta_defaultsToUtf8() {
        String html = "<title>No Meta</title>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(buffer, null, "", Parser.htmlParser());
        assertEquals("No Meta", doc.title());
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_nullCharsetWithHttpEquivMetaCharset_reDecodesProperly() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head>"
                + "<body><p>Café</p></body></html>";
        byte[] bytes = html.getBytes(Charset.forName("ISO-8859-1"));
        ByteBuffer buffer = ByteBuffer.wrap(bytes);

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertEquals("Café", doc.select("p").text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_nullCharsetWithMetaHttpEquivAndCharsetAttr_reDecodesProperly() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" charset=\"ISO-8859-1\"></head>"
                + "<body><p>Café</p></body></html>";
        byte[] bytes = html.getBytes(Charset.forName("ISO-8859-1"));
        ByteBuffer buffer = ByteBuffer.wrap(bytes);

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertEquals("Café", doc.select("p").text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_nullCharsetWithMetaHttpEquivIllegalCharsetAttr_fallsBackToUtf8() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" charset=\"invalid @ charset\"></head>"
                + "<body><p>Test</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertEquals("Test", doc.select("p").text());
    }

    @Test
    public void testParseByteData_nullCharsetWithHtml5MetaCharset_reDecodesProperly() {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body><p>Café</p></body></html>";
        byte[] bytes = html.getBytes(Charset.forName("ISO-8859-1"));
        ByteBuffer buffer = ByteBuffer.wrap(bytes);

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertEquals("Café", doc.select("p").text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_nullCharsetWithMetaCharsetUtf8_doesNotReDecode() {
        String html = "<html><head><meta charset=\"UTF-8\"></head><body><p>Hello</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertEquals("Hello", doc.select("p").text());
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_specifiedCharset_success() {
        String html = "<p>Direct Charset</p>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com", Parser.htmlParser());
        assertEquals("Direct Charset", doc.select("p").text());
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_emptyCharsetName_throwsIllegalArgumentException() {
        ByteBuffer buffer = ByteBuffer.wrap("<p>Test</p>".getBytes(StandardCharsets.UTF_8));
        DataUtil.parseByteData(buffer, "", "http://example.com", Parser.htmlParser());
    }

    @Test
    public void testParseByteData_withUtf8Bom_stripsBom() {
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] content = "<p>BOM Test</p>".getBytes(StandardCharsets.UTF_8);
        byte[] all = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(content, 0, all, bom.length, content.length);

        ByteBuffer buffer = ByteBuffer.wrap(all);
        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com", Parser.htmlParser());
        assertEquals("BOM Test", doc.select("p").text());
    }

    @Test
    public void testParseByteData_emptyInput_returnsEmptyDoc() {
        ByteBuffer buffer = ByteBuffer.wrap(new byte[0]);
        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testReadToByteBuffer_unlimitedStream_readsAllBytes() throws IOException {
        byte[] data = new byte[0x20000 + 100];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 128);
        }
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);

        assertEquals(data.length, buffer.remaining());
    }

    @Test
    public void testReadToByteBuffer_defaultOverload_readsAllBytes() throws IOException {
        byte[] data = "Hello Buffer".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);

        assertEquals(data.length, buffer.remaining());
        assertEquals("Hello Buffer", StandardCharsets.UTF_8.decode(buffer).toString());
    }

    @Test
    public void testReadToByteBuffer_cappedLessThanSize_readsExactCappedAmount() throws IOException {
        byte[] data = "0123456789".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 5);

        assertEquals(5, buffer.remaining());
        assertEquals("01234", StandardCharsets.UTF_8.decode(buffer).toString());
    }

    @Test
    public void testReadToByteBuffer_cappedGreaterThanSize_readsAllBytes() throws IOException {
        byte[] data = "Small".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 100);

        assertEquals(5, buffer.remaining());
        assertEquals("Small", StandardCharsets.UTF_8.decode(buffer).toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_negativeMaxSize_throwsIllegalArgumentException() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void testGetCharsetFromContentType() {
        assertNull(DataUtil.getCharsetFromContentType(null));
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset="));
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=;"));
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=unsupported-charset-name-xyz"));
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=?invalid?name"));

        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=utf-8"));
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=iso-8859-1"));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=\"ISO-8859-1\""));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset='ISO-8859-1'"));
        assertEquals("GB2312", DataUtil.getCharsetFromContentType("text/html;charset=gb2312"));
        assertEquals("EUC-JP", DataUtil.getCharsetFromContentType("text/html; charset=EUC-JP; boundary=something"));
    }
}
