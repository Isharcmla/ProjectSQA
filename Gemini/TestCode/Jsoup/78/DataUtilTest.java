package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class DataUtilTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<DataUtil> constructor = DataUtil.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        DataUtil instance = constructor.newInstance();
        Assert.assertNotNull(instance);
    }

    @Test
    public void testEmptyByteBuffer() {
        ByteBuffer byteBuffer = DataUtil.emptyByteBuffer();
        Assert.assertNotNull(byteBuffer);
        Assert.assertEquals(0, byteBuffer.capacity());
        Assert.assertEquals(0, byteBuffer.remaining());
    }

    @Test
    public void testMimeBoundary() {
        String boundary = DataUtil.mimeBoundary();
        Assert.assertNotNull(boundary);
        Assert.assertEquals(DataUtil.boundaryLength, boundary.length());
        for (char c : boundary.toCharArray()) {
            Assert.assertTrue(
                (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9') ||
                c == '-' || c == '_'
            );
        }
    }

    @Test
    public void testCrossStreams() throws IOException {
        byte[] inputBytes = "Sample cross-stream test payload 1234567890".getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream in = new ByteArrayInputStream(inputBytes);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        DataUtil.crossStreams(in, out);

        Assert.assertArrayEquals(inputBytes, out.toByteArray());
    }

    @Test
    public void testGetCharsetFromContentType() {
        Assert.assertNull(DataUtil.getCharsetFromContentType(null));
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html"));
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html; charset="));
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html; charset=unsupported_charset_xyz"));
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html; charset=??invalid??"));

        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=utf-8"));
        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\""));
        Assert.assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset='ISO-8859-1'"));
        Assert.assertEquals("GB2312", DataUtil.getCharsetFromContentType("text/html; charset=GB2312; boundary=something"));
    }

    @Test
    public void testReadToByteBuffer_withMaxSize() throws IOException {
        byte[] data = "Hello World! This is a test buffer.".getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream stream = new ByteArrayInputStream(data);

        ByteBuffer buf = DataUtil.readToByteBuffer(stream, 5);
        Assert.assertEquals(5, buf.remaining());

        byte[] result = new byte[buf.remaining()];
        buf.get(result);
        Assert.assertEquals("Hello", new String(result, StandardCharsets.UTF_8));
    }

    @Test
    public void testReadToByteBuffer_unlimited() throws IOException {
        byte[] data = "Full payload to read".getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream stream = new ByteArrayInputStream(data);

        ByteBuffer buf = DataUtil.readToByteBuffer(stream, 0);
        Assert.assertEquals(data.length, buf.remaining());

        byte[] result = new byte[buf.remaining()];
        buf.get(result);
        Assert.assertEquals("Full payload to read", new String(result, StandardCharsets.UTF_8));
    }

    @Test
    public void testReadToByteBuffer_singleParam() throws IOException {
        byte[] data = "Single param buffer read".getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream stream = new ByteArrayInputStream(data);

        ByteBuffer buf = DataUtil.readToByteBuffer(stream);
        Assert.assertEquals(data.length, buf.remaining());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_negativeMaxSizeThrowsException() throws IOException {
        ByteArrayInputStream stream = new ByteArrayInputStream(new byte[10]);
        DataUtil.readToByteBuffer(stream, -1);
    }

    @Test
    public void testReadFileToByteBuffer() throws IOException {
        File tempFile = File.createTempFile("datautil_test", ".tmp");
        tempFile.deleteOnExit();

        byte[] testBytes = "Testing file to byte buffer".getBytes(StandardCharsets.UTF_8);
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write(testBytes);
        }

        ByteBuffer buffer = DataUtil.readFileToByteBuffer(tempFile);
        Assert.assertEquals(testBytes.length, buffer.remaining());
        byte[] readBytes = new byte[buffer.remaining()];
        buffer.get(readBytes);
        Assert.assertArrayEquals(testBytes, readBytes);
    }

    @Test
    public void testParseInputStream_nullInputStream() throws IOException {
        Document doc = DataUtil.parseInputStream(null, "UTF-8", "https://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("https://example.com", doc.baseUri());
        Assert.assertEquals(0, doc.childNodeSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseInputStream_emptyCharsetThrowsException() throws IOException {
        ByteArrayInputStream stream = new ByteArrayInputStream("<html></html>".getBytes(StandardCharsets.UTF_8));
        DataUtil.parseInputStream(stream, "", "https://example.com", Parser.htmlParser());
    }

    @Test
    public void testParseInputStream_explicitCharset() throws IOException {
        String html = "<p>T\u00E9st ISO charset</p>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.ISO_8859_1));

        Document doc = DataUtil.parseInputStream(in, "ISO-8859-1", "https://example.com", Parser.htmlParser());
        Assert.assertEquals("T\u00E9st ISO charset", doc.select("p").text());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStream_detectBomUtf8() throws IOException {
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] html = "<p>BOM UTF-8 Content</p>".getBytes(StandardCharsets.UTF_8);
        byte[] combined = new byte[bom.length + html.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(html, 0, combined, bom.length, html.length);

        Document doc = DataUtil.parseInputStream(new ByteArrayInputStream(combined), null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("BOM UTF-8 Content", doc.select("p").text());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStream_detectBomUtf16BE() throws IOException {
        byte[] bom = new byte[]{(byte) 0xFE, (byte) 0xFF};
        byte[] html = "<p>BOM UTF-16 BE</p>".getBytes(StandardCharsets.UTF_16BE);
        byte[] combined = new byte[bom.length + html.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(html, 0, combined, bom.length, html.length);

        Document doc = DataUtil.parseInputStream(new ByteArrayInputStream(combined), null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("BOM UTF-16 BE", doc.select("p").text());
        Assert.assertEquals("UTF-16", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStream_detectBomUtf16LE() throws IOException {
        byte[] bom = new byte[]{(byte) 0xFF, (byte) 0xFE};
        byte[] html = "<p>BOM UTF-16 LE</p>".getBytes(StandardCharsets.UTF_16LE);
        byte[] combined = new byte[bom.length + html.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(html, 0, combined, bom.length, html.length);

        Document doc = DataUtil.parseInputStream(new ByteArrayInputStream(combined), null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("BOM UTF-16 LE", doc.select("p").text());
        Assert.assertEquals("UTF-16", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStream_detectBomUtf32BE() throws IOException {
        if (!Charset.isSupported("UTF-32")) return;
        byte[] bom = new byte[]{0x00, 0x00, (byte) 0xFE, (byte) 0xFF};
        byte[] html = "<p>UTF-32 BE</p>".getBytes(Charset.forName("UTF-32BE"));
        byte[] combined = new byte[bom.length + html.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(html, 0, combined, bom.length, html.length);

        Document doc = DataUtil.parseInputStream(new ByteArrayInputStream(combined), null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("UTF-32 BE", doc.select("p").text());
    }

    @Test
    public void testParseInputStream_detectBomUtf32LE() throws IOException {
        if (!Charset.isSupported("UTF-32")) return;
        byte[] bom = new byte[]{(byte) 0xFF, (byte) 0xFE, 0x00, 0x00};
        byte[] html = "<p>UTF-32 LE</p>".getBytes(Charset.forName("UTF-32LE"));
        byte[] combined = new byte[bom.length + html.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(html, 0, combined, bom.length, html.length);

        Document doc = DataUtil.parseInputStream(new ByteArrayInputStream(combined), null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("UTF-32 LE", doc.select("p").text());
    }

    @Test
    public void testParseInputStream_shortStreamWithoutBom() throws IOException {
        byte[] shortData = "<p>a</p>".getBytes(StandardCharsets.UTF_8);
        Document doc = DataUtil.parseInputStream(new ByteArrayInputStream(shortData), null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("a", doc.select("p").text());
    }

    @Test
    public void testParseInputStream_detectMetaHttpEquivCharset() throws IOException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head><body><p>caf\u00E9</p></body></html>";
        byte[] bytes = html.getBytes(StandardCharsets.ISO_8859_1);

        Document doc = DataUtil.parseInputStream(new ByteArrayInputStream(bytes), null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("caf\u00E9", doc.select("p").text());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStream_detectMetaCharsetHtml5() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body><p>na\u00EFve</p></body></html>";
        byte[] bytes = html.getBytes(StandardCharsets.ISO_8859_1);

        Document doc = DataUtil.parseInputStream(new ByteArrayInputStream(bytes), null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("na\u00EFve", doc.select("p").text());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStream_detectXmlEncodingDeclaration() throws IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><root><item>r\u00E9sum\u00E9</item></root>";
        byte[] bytes = xml.getBytes(StandardCharsets.ISO_8859_1);

        Document doc = DataUtil.parseInputStream(new ByteArrayInputStream(bytes), null, "https://example.com", Parser.xmlParser());
        Assert.assertEquals("r\u00E9sum\u00E9", doc.select("item").text());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStream_metaCharsetUtf8DoesNotRedecode() throws IOException {
        String html = "<html><head><meta charset=\"UTF-8\"></head><body><p>Hello UTF8</p></body></html>";
        byte[] bytes = html.getBytes(StandardCharsets.UTF_8);

        Document doc = DataUtil.parseInputStream(new ByteArrayInputStream(bytes), null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("Hello UTF8", doc.select("p").text());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStream_metaInvalidCharsetIgnored() throws IOException {
        String html = "<html><head><meta charset=\"not-a-valid-charset\"></head><body><p>Fallback to UTF-8</p></body></html>";
        byte[] bytes = html.getBytes(StandardCharsets.UTF_8);

        Document doc = DataUtil.parseInputStream(new ByteArrayInputStream(bytes), null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("Fallback to UTF-8", doc.select("p").text());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStream_largeStreamReDecode() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><title>Large Document</title></head><body>");
        for (int i = 0; i < 2000; i++) {
            sb.append("<p>Paragraph number ").append(i).append(" with some content to exceed 5KB buffer.</p>\n");
        }
        sb.append("</body></html>");

        byte[] bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
        Document doc = DataUtil.parseInputStream(new ByteArrayInputStream(bytes), null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("Large Document", doc.title());
    }

    @Test
    public void testLoad_File() throws IOException {
        File file = File.createTempFile("datautil_load_test", ".html");
        file.deleteOnExit();

        String html = "<html><head><title>Test File Load</title></head><body><p>Content</p></body></html>";
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(html.getBytes(StandardCharsets.UTF_8));
        }

        Document doc = DataUtil.load(file, "UTF-8", "https://example.com");
        Assert.assertEquals("Test File Load", doc.title());
        Assert.assertEquals("Content", doc.select("p").text());
    }

    @Test
    public void testLoad_InputStream() throws IOException {
        String html = "<html><head><title>Test Stream Load</title></head><body><p>Stream Content</p></body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.load(in, "UTF-8", "https://example.com");
        Assert.assertEquals("Test Stream Load", doc.title());
        Assert.assertEquals("Stream Content", doc.select("p").text());
    }

    @Test
    public void testLoad_InputStreamWithParser() throws IOException {
        String xml = "<rss><channel><title>RSS Feed Title</title></channel></rss>";
        InputStream in = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.load(in, "UTF-8", "https://example.com", Parser.xmlParser());
        Assert.assertEquals("RSS Feed Title", doc.select("title").text());
    }
}
