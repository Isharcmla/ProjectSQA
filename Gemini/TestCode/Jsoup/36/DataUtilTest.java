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
    public void testLoadFile_validUtf8_parsesSuccessfully() throws IOException {
        File file = tempFolder.newFile("test.html");
        try (FileOutputStream out = new FileOutputStream(file)) {
            out.write("<p>Hello World</p>".getBytes(StandardCharsets.UTF_8));
        }

        Document doc = DataUtil.load(file, "UTF-8", "http://example.com");
        assertEquals("Hello World", doc.select("p").text());
        assertEquals("http://example.com", doc.baseUri());
    }

    @Test(expected = IOException.class)
    public void testLoadFile_nonExistentFile_throwsException() throws IOException {
        File file = new File(tempFolder.getRoot(), "non_existent.html");
        DataUtil.load(file, "UTF-8", "http://example.com");
    }

    @Test
    public void testLoadInputStream_defaultParser_parsesSuccessfully() throws IOException {
        InputStream in = new ByteArrayInputStream("<p>Testing InputStream</p>".getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        assertEquals("Testing InputStream", doc.select("p").text());
    }

    @Test
    public void testLoadInputStream_customXmlParser_parsesSuccessfully() throws IOException {
        InputStream in = new ByteArrayInputStream("<root><child>Value</child></root>".getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());
        assertEquals("Value", doc.select("child").text());
    }

    @Test
    public void testParseByteData_nullCharset_noMeta_defaultsToUtf8() {
        ByteBuffer buffer = ByteBuffer.wrap("<p>Default UTF-8</p>".getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertEquals("Default UTF-8", doc.select("p").text());
    }

    @Test
    public void testParseByteData_nullCharset_metaHttpEquivUtf8_matchesDefault() {
        String html = "<html><head><meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"></head><body><p>Match</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertEquals("Match", doc.select("p").text());
    }

    @Test
    public void testParseByteData_nullCharset_metaHttpEquivIso88591_reDecodes() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head><body><p>Café</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertEquals("Café", doc.select("p").text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_nullCharset_metaCharsetHtml5_reDecodes() {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body><p>Héllo</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertEquals("Héllo", doc.select("p").text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_nullCharset_metaCharsetEmpty_keepsDefaultUtf8() {
        String html = "<html><head><meta charset=\"\"></head><body><p>Empty Charset</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertEquals("Empty Charset", doc.select("p").text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_emptyCharset_throwsException() {
        ByteBuffer buffer = ByteBuffer.wrap("<p>Test</p>".getBytes(StandardCharsets.UTF_8));
        DataUtil.parseByteData(buffer, "", "http://example.com", Parser.htmlParser());
    }

    @Test
    public void testParseByteData_explicitCharset_parsesCorrectly() {
        String html = "<p>Valid Charset</p>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com", Parser.htmlParser());
        assertEquals("Valid Charset", doc.select("p").text());
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_withBomCharacter_stripsBom() {
        String htmlWithBom = "\uFEFF<p>With BOM</p>";
        ByteBuffer buffer = ByteBuffer.wrap(htmlWithBom.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com", Parser.htmlParser());
        assertEquals("With BOM", doc.select("p").text());
    }

    @Test
    public void testParseByteData_reDecodeWithBom_stripsBom() {
        String htmlWithBom = "\uFEFF<html><head><meta charset=\"ISO-8859-1\"></head><body><p>ReDecode BOM</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(htmlWithBom.getBytes(Charset.forName("ISO-8859-1")));
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertEquals("ReDecode BOM", doc.select("p").text());
    }

    @Test
    public void testReadToByteBuffer_unlimitedSize_readsEntireStream() throws IOException {
        byte[] data = "Hello, World! Stream Testing.".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer byteBuffer = DataUtil.readToByteBuffer(in, 0);
        assertEquals(data.length, byteBuffer.remaining());
    }

    @Test
    public void testReadToByteBuffer_defaultMax_readsEntireStream() throws IOException {
        byte[] data = "Hello Default Read".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer byteBuffer = DataUtil.readToByteBuffer(in);
        assertEquals(data.length, byteBuffer.remaining());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_negativeMaxSize_throwsException() throws IOException {
        InputStream in = new ByteArrayInputStream("test".getBytes(StandardCharsets.UTF_8));
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void testReadToByteBuffer_cappedLessThanData_capsCorrectly() throws IOException {
        byte[] data = "1234567890".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer byteBuffer = DataUtil.readToByteBuffer(in, 5);
        assertEquals(5, byteBuffer.remaining());
        byte[] result = new byte[5];
        byteBuffer.get(result);
        assertEquals("12345", new String(result, StandardCharsets.UTF_8));
    }

    @Test
    public void testReadToByteBuffer_cappedLargerThanData_readsAll() throws IOException {
        byte[] data = "12345".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer byteBuffer = DataUtil.readToByteBuffer(in, 100);
        assertEquals(5, byteBuffer.remaining());
    }

    @Test
    public void testReadToByteBuffer_cappedExactDataSize_readsAll() throws IOException {
        byte[] data = "12345".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer byteBuffer = DataUtil.readToByteBuffer(in, 5);
        assertEquals(5, byteBuffer.remaining());
    }

    @Test
    public void testReadToByteBuffer_largeStreamExceedingBufferSize_readsCompletely() throws IOException {
        int largeSize = 0x20000 + 1024; // bufferSize + 1KB
        byte[] largeData = new byte[largeSize];
        for (int i = 0; i < largeSize; i++) {
            largeData[i] = (byte) (i % 128);
        }

        InputStream in = new ByteArrayInputStream(largeData);
        ByteBuffer byteBuffer = DataUtil.readToByteBuffer(in, 0);
        assertEquals(largeSize, byteBuffer.remaining());
    }

    @Test
    public void testReadToByteBuffer_largeStreamCapped_readsCappedBytesAcrossIterations() throws IOException {
        int largeSize = 0x20000 + 1024;
        byte[] largeData = new byte[largeSize];
        InputStream in = new ByteArrayInputStream(largeData);
        int capSize = 0x20000 + 512;
        ByteBuffer byteBuffer = DataUtil.readToByteBuffer(in, capSize);
        assertEquals(capSize, byteBuffer.remaining());
    }

    @Test
    public void testReadToByteBuffer_emptyStream_returnsEmptyBuffer() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ByteBuffer byteBuffer = DataUtil.readToByteBuffer(in, 0);
        assertEquals(0, byteBuffer.remaining());
    }

    @Test
    public void testGetCharsetFromContentType_nullInput_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentType_noCharsetInHeader_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
        assertNull(DataUtil.getCharsetFromContentType("application/json"));
    }

    @Test
    public void testGetCharsetFromContentType_standardCharset_returnsCharset() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=utf-8"));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=ISO-8859-1"));
    }

    @Test
    public void testGetCharsetFromContentType_quotedCharset_returnsTrimmedCharset() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\""));
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\"; other=param"));
    }

    @Test
    public void testGetCharsetFromContentType_withWhitespaceAndCaseVariation_returnsValidCharset() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html;   CHARSET =   UTF-8   "));
    }

    @Test
    public void testGetCharsetFromContentType_unsupportedCharset_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=unsupported_charset_xyz123"));
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset="));
    }
}
