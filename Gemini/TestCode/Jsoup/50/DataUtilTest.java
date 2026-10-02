package org.jsoup.helper;

import org.jsoup.nodes.Document;
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
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class DataUtilTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

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
    public void testLoadFile_validHtml_loadsDocument() throws IOException {
        File file = tempFolder.newFile("test.html");
        try (FileOutputStream out = new FileOutputStream(file)) {
            out.write("<p>Hello World</p>".getBytes(StandardCharsets.UTF_8));
        }
        Document doc = DataUtil.load(file, "UTF-8", "http://example.com");
        Assert.assertNotNull(doc);
        Assert.assertEquals("Hello World", doc.select("p").text());
        Assert.assertEquals("http://example.com", doc.baseUri());
    }

    @Test
    public void testLoadInputStream_validHtml_loadsDocument() throws IOException {
        InputStream in = new ByteArrayInputStream("<div>Content</div>".getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        Assert.assertNotNull(doc);
        Assert.assertEquals("Content", doc.select("div").text());
    }

    @Test
    public void testLoadInputStreamWithXmlParser_validXml_loadsDocument() throws IOException {
        InputStream in = new ByteArrayInputStream("<root><child>Value</child></root>".getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("Value", doc.select("child").text());
    }

    @Test
    public void testCrossStreams_transfersDataAcrossBuffers() throws IOException {
        byte[] largeData = new byte[0x20000 * 2 + 50];
        for (int i = 0; i < largeData.length; i++) {
            largeData[i] = (byte) (i % 127);
        }
        InputStream in = new ByteArrayInputStream(largeData);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        DataUtil.crossStreams(in, out);

        Assert.assertArrayEquals(largeData, out.toByteArray());
    }

    @Test
    public void testCrossStreams_emptyStream_writesNothing() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        DataUtil.crossStreams(in, out);

        Assert.assertEquals(0, out.size());
    }

    @Test
    public void testParseByteData_nullCharsetWithMetaHttpEquiv_reDecodesProperly() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head><body><p>caf\u00e9</p></body></html>";
        byte[] bytes = html.getBytes(StandardCharsets.ISO_8859_1);
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);

        Document doc = DataUtil.parseByteData(byteBuffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("caf\u00e9", doc.select("p").text());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_nullCharsetWithMetaCharsetAttr_reDecodesProperly() {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body><p>caf\u00e9</p></body></html>";
        byte[] bytes = html.getBytes(StandardCharsets.ISO_8859_1);
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);

        Document doc = DataUtil.parseByteData(byteBuffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("caf\u00e9", doc.select("p").text());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_nullCharsetWithMetaCharsetSameAsDefault_keepsUtf8() {
        String html = "<html><head><meta charset=\"UTF-8\"></head><body><p>Hello</p></body></html>";
        ByteBuffer byteBuffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(byteBuffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("Hello", doc.select("p").text());
        Assert.assertEquals(StandardCharsets.UTF_8, doc.outputSettings().charset());
    }

    @Test
    public void testParseByteData_nullCharsetWithMetaIllegalCharset_fallsBackToDefault() {
        String html = "<html><head><meta charset=\"illegal_charset_???\"></head><body><p>Hello</p></body></html>";
        ByteBuffer byteBuffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(byteBuffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("Hello", doc.select("p").text());
    }

    @Test
    public void testParseByteData_nullCharsetNoMeta_parsesAsUtf8() {
        String html = "<html><head></head><body><p>No Meta</p></body></html>";
        ByteBuffer byteBuffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(byteBuffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("No Meta", doc.select("p").text());
    }

    @Test
    public void testParseByteData_withBomUtf8_stripsBom() {
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] text = "<p>With BOM</p>".getBytes(StandardCharsets.UTF_8);
        byte[] combined = new byte[bom.length + text.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(text, 0, combined, bom.length, text.length);

        ByteBuffer byteBuffer = ByteBuffer.wrap(combined);
        Document doc = DataUtil.parseByteData(byteBuffer, "UTF-8", "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("With BOM", doc.select("p").text());
    }

    @Test
    public void testParseByteData_withBomNullCharset_stripsBom() {
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] text = "<p>BOM Null Charset</p>".getBytes(StandardCharsets.UTF_8);
        byte[] combined = new byte[bom.length + text.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(text, 0, combined, bom.length, text.length);

        ByteBuffer byteBuffer = ByteBuffer.wrap(combined);
        Document doc = DataUtil.parseByteData(byteBuffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("BOM Null Charset", doc.select("p").text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_emptyCharset_throwsException() {
        ByteBuffer byteBuffer = ByteBuffer.wrap("<p>test</p>".getBytes(StandardCharsets.UTF_8));
        DataUtil.parseByteData(byteBuffer, "", "http://example.com", Parser.htmlParser());
    }

    @Test
    public void testReadToByteBuffer_unlimitedRead_readsEntireStream() throws IOException {
        byte[] expected = "Testing unlimited read to byte buffer".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(expected);

        ByteBuffer buffer = DataUtil.readToByteBuffer(in);
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testReadToByteBuffer_cappedLessThanSize_readsUpToCap() throws IOException {
        byte[] data = "0123456789".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);

        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 5);
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);

        Assert.assertEquals(5, actual.length);
        Assert.assertEquals("01234", new String(actual, StandardCharsets.UTF_8));
    }

    @Test
    public void testReadToByteBuffer_cappedLargerThanStream_readsAll() throws IOException {
        byte[] data = "01234".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);

        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 50);
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);

        Assert.assertEquals(5, actual.length);
        Assert.assertEquals("01234", new String(actual, StandardCharsets.UTF_8));
    }

    @Test
    public void testReadToByteBuffer_cappedExactSize_readsAll() throws IOException {
        byte[] data = "0123456789".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);

        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 10);
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);

        Assert.assertEquals(10, actual.length);
        Assert.assertEquals("0123456789", new String(actual, StandardCharsets.UTF_8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_negativeMaxSize_throwsException() throws IOException {
        InputStream in = new ByteArrayInputStream("data".getBytes(StandardCharsets.UTF_8));
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void testReadFileToByteBuffer_validFile_readsContent() throws IOException {
        File file = tempFolder.newFile("readTest.txt");
        byte[] content = "File content for buffer test".getBytes(StandardCharsets.UTF_8);
        try (FileOutputStream out = new FileOutputStream(file)) {
            out.write(content);
        }

        ByteBuffer buffer = DataUtil.readFileToByteBuffer(file);
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);

        Assert.assertArrayEquals(content, actual);
    }

    @Test
    public void testEmptyByteBuffer_returnsEmptyBuffer() {
        ByteBuffer buffer = DataUtil.emptyByteBuffer();
        Assert.assertNotNull(buffer);
        Assert.assertEquals(0, buffer.capacity());
        Assert.assertEquals(0, buffer.remaining());
    }

    @Test
    public void testGetCharsetFromContentType_nullInput_returnsNull() {
        Assert.assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentType_noCharsetInHeader_returnsNull() {
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void testGetCharsetFromContentType_emptyCharsetValue_returnsNull() {
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html; charset="));
    }

    @Test
    public void testGetCharsetFromContentType_validCharset_returnsCharset() {
        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
    }

    @Test
    public void testGetCharsetFromContentType_lowercaseSupportedCharset_returnsCharset() {
        Assert.assertEquals("iso-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=iso-8859-1"));
    }

    @Test
    public void testGetCharsetFromContentType_quotedCharset_returnsTrimmedCharset() {
        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\""));
        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset='UTF-8'"));
    }

    @Test
    public void testGetCharsetFromContentType_unsupportedCharset_returnsNull() {
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html; charset=UNSUPPORTED_XYZ_123"));
    }

    @Test
    public void testGetCharsetFromContentType_illegalCharset_returnsNull() {
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html; charset=illegal[charset]"));
    }

    @Test
    public void testMimeBoundary_generatesValidBoundary() {
        String boundary = DataUtil.mimeBoundary();
        Assert.assertNotNull(boundary);
        Assert.assertEquals(DataUtil.boundaryLength, boundary.length());
        Assert.assertTrue(boundary.matches("^[a-zA-Z0-9_-]{32}$"));

        String anotherBoundary = DataUtil.mimeBoundary();
        Assert.assertNotEquals(boundary, anotherBoundary);
    }
}
