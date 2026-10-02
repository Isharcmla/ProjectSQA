package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class DataUtilTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<DataUtil> constructor = DataUtil.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            DataUtil instance = constructor.newInstance();
            Assert.assertNotNull(instance);
        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test
    public void testLoadFile_withValidFileAndCharset_returnsDocument() throws IOException {
        File file = temporaryFolder.newFile("test_utf8.html");
        String html = "<html><head><title>File Test</title></head><body><p>Hello File</p></body></html>";
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(html.getBytes(StandardCharsets.UTF_8));
        }

        Document doc = DataUtil.load(file, "UTF-8", "http://example.com");
        Assert.assertNotNull(doc);
        Assert.assertEquals("File Test", doc.title());
        Assert.assertEquals("http://example.com", doc.baseUri());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testLoadFile_withNullCharset_detectsFromMeta() throws IOException {
        File file = temporaryFolder.newFile("test_iso.html");
        String html = "<html><head><meta charset=\"ISO-8859-1\"><title>ISO Title</title></head><body></body></html>";
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(html.getBytes(StandardCharsets.ISO_8859_1));
        }

        Document doc = DataUtil.load(file, null, "http://example.com");
        Assert.assertNotNull(doc);
        Assert.assertEquals("ISO Title", doc.title());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test(expected = IOException.class)
    public void testLoadFile_nonExistentFile_throwsIOException() throws IOException {
        File nonExistent = new File(temporaryFolder.getRoot(), "does_not_exist.html");
        DataUtil.load(nonExistent, "UTF-8", "http://example.com");
    }

    @Test
    public void testLoadInputStream_withCharsetAndBaseUri_returnsDocument() throws IOException {
        String html = "<html><head><title>Stream Test</title></head><body></body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        Assert.assertNotNull(doc);
        Assert.assertEquals("Stream Test", doc.title());
    }

    @Test
    public void testLoadInputStream_withParser_returnsDocument() throws IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><child>value</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());
        Assert.assertNotNull(doc);
        Element child = doc.select("child").first();
        Assert.assertNotNull(child);
        Assert.assertEquals("value", child.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLoad_withEmptyCharset_throwsIllegalArgumentException() throws IOException {
        String html = "<html><body></body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        DataUtil.load(in, "", "http://example.com");
    }

    @Test
    public void testCrossStreams_copiesCorrectly() throws IOException {
        byte[] data = "Sample stream content to be crossed".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        DataUtil.crossStreams(in, out);
        Assert.assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testCrossStreams_largeData_loopsProperly() throws IOException {
        byte[] largeData = new byte[0x20000 * 2 + 100];
        for (int i = 0; i < largeData.length; i++) {
            largeData[i] = (byte) (i % 128);
        }
        InputStream in = new ByteArrayInputStream(largeData);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        DataUtil.crossStreams(in, out);
        Assert.assertArrayEquals(largeData, out.toByteArray());
    }

    @Test
    public void testReadToByteBuffer_unlimited() throws IOException {
        byte[] data = "Hello Buffer".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);

        ByteBuffer buffer = DataUtil.readToByteBuffer(in);
        Assert.assertEquals(data.length, buffer.remaining());
        byte[] result = new byte[buffer.remaining()];
        buffer.get(result);
        Assert.assertArrayEquals(data, result);
    }

    @Test
    public void testReadToByteBuffer_cappedLessThanSize() throws IOException {
        byte[] data = "0123456789ABCDEF".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);

        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 5);
        Assert.assertEquals(5, buffer.remaining());
        byte[] result = new byte[5];
        buffer.get(result);
        Assert.assertArrayEquals("01234".getBytes(StandardCharsets.UTF_8), result);
    }

    @Test
    public void testReadToByteBuffer_cappedGreaterThanSize() throws IOException {
        byte[] data = "Short".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);

        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 100);
        Assert.assertEquals(data.length, buffer.remaining());
    }

    @Test
    public void testReadToByteBuffer_cappedLargeStreamBreakBranch() throws IOException {
        byte[] data = new byte[0x20000 + 50];
        InputStream in = new ByteArrayInputStream(data);

        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0x20000 + 10);
        Assert.assertEquals(0x20000 + 10, buffer.remaining());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_negativeMaxSize_throwsIllegalArgumentException() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void testEmptyByteBuffer() {
        ByteBuffer empty = DataUtil.emptyByteBuffer();
        Assert.assertNotNull(empty);
        Assert.assertEquals(0, empty.capacity());
        Assert.assertEquals(0, empty.remaining());
    }

    @Test
    public void testMimeBoundary() {
        String boundary1 = DataUtil.mimeBoundary();
        String boundary2 = DataUtil.mimeBoundary();
        Assert.assertEquals(DataUtil.boundaryLength, boundary1.length());
        Assert.assertEquals(DataUtil.boundaryLength, boundary2.length());
        Assert.assertTrue(boundary1.matches("[-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]{32}"));
    }

    @Test
    public void testGetCharsetFromContentType() {
        Assert.assertNull(DataUtil.getCharsetFromContentType(null));
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html"));
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html; charset="));
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html; charset=unsupported_charset_xyz_123"));
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html; charset=???illegal???"));

        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=utf-8"));
        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\""));
        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset='UTF-8'"));
        Assert.assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=iso-8859-1"));
        Assert.assertEquals("US-ASCII", DataUtil.getCharsetFromContentType("text/html; charset=us-ascii; boundary=something"));
    }

    @Test
    public void testParseByteData_bomDetectionUtf8() {
        byte[] bomUtf8 = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF, '<', 'h', 't', 'm', 'l', '>', '<', '/', 'h', 't', 'm', 'l', '>'};
        ByteBuffer buffer = ByteBuffer.wrap(bomUtf8);

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_bomDetectionUtf16BE() {
        byte[] bomUtf16BE = new byte[]{(byte) 0xFE, (byte) 0xFF, 0x00, '<', 0x00, 'p', 0x00, '>', 0x00, '<', 0x00, '/', 0x00, 'p', 0x00, '>'};
        ByteBuffer buffer = ByteBuffer.wrap(bomUtf16BE);

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-16", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_bomDetectionUtf16LE() {
        byte[] bomUtf16LE = new byte[]{(byte) 0xFF, (byte) 0xFE, '<', 0x00, 'p', 0x00, '>', 0x00, '<', 0x00, '/', 0x00, 'p', 0x00, '>', 0x00};
        ByteBuffer buffer = ByteBuffer.wrap(bomUtf16LE);

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-16", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_bomDetectionUtf32BE() {
        byte[] bomUtf32BE = new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0xFE, (byte) 0xFF, 0x00, 0x00, 0x00, '<', 0x00, 0x00, 0x00, 'p', 0x00, 0x00, 0x00, '>'};
        ByteBuffer buffer = ByteBuffer.wrap(bomUtf32BE);

        if (java.nio.charset.Charset.isSupported("UTF-32")) {
            Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
            Assert.assertNotNull(doc);
            Assert.assertEquals("UTF-32", doc.outputSettings().charset().name());
        }
    }

    @Test
    public void testParseByteData_bomDetectionUtf32LE() {
        byte[] bomUtf32LE = new byte[]{(byte) 0xFF, (byte) 0xFE, (byte) 0x00, (byte) 0x00, '<', 0x00, 0x00, 0x00, 'p', 0x00, 0x00, 0x00, '>', 0x00, 0x00, 0x00};
        ByteBuffer buffer = ByteBuffer.wrap(bomUtf32LE);

        if (java.nio.charset.Charset.isSupported("UTF-32")) {
            Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
            Assert.assertNotNull(doc);
            Assert.assertEquals("UTF-32", doc.outputSettings().charset().name());
        }
    }

    @Test
    public void testParseByteData_shortBufferForBom() {
        byte[] shortData = new byte[]{'<', 'a'};
        ByteBuffer buffer = ByteBuffer.wrap(shortData);

        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
    }

    @Test
    public void testParseByteData_detectFromMetaHttpEquiv() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head><body>Hello</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.ISO_8859_1));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_detectFromMetaCharset() {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>Hello</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.ISO_8859_1));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_metaCharsetDefaultUtf8_noRedecode() {
        String html = "<html><head><meta charset=\"UTF-8\"></head><body>Hello UTF8</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_metaCharsetIllegalCharsetName() {
        String html = "<html><head><meta charset=\"???illegal???\"></head><body>Hello Fallback</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_detectFromXmlDeclaration() {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><root>Hello</root>";
        ByteBuffer buffer = ByteBuffer.wrap(xml.getBytes(StandardCharsets.ISO_8859_1));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.xmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_xmlDeclarationNotXmlName() {
        String xml = "<?other version=\"1.0\" encoding=\"ISO-8859-1\"?><root>Hello</root>";
        ByteBuffer buffer = ByteBuffer.wrap(xml.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.xmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }
}
