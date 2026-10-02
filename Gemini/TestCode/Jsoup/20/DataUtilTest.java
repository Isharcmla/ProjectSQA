package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
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

public class DataUtilTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<DataUtil> constructor = DataUtil.class.getDeclaredConstructor();
        Assert.assertFalse(constructor.isAccessible());
        constructor.setAccessible(true);
        DataUtil instance = constructor.newInstance();
        Assert.assertNotNull(instance);
    }

    @Test
    public void testLoadFile_validFileAndExplicitCharset_returnsDocument() throws IOException {
        File file = tempFolder.newFile("test.html");
        String html = "<html><head><title>Test File</title></head><body><p>Hello World</p></body></html>";
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(html.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(file, "UTF-8", "http://example.com");
        Assert.assertEquals("Test File", doc.title());
        Assert.assertEquals("Hello World", doc.select("p").text());
        Assert.assertEquals("http://example.com", doc.baseUri());
    }

    @Test(expected = IOException.class)
    public void testLoadFile_nonExistentFile_throwsIOException() throws IOException {
        File file = new File(tempFolder.getRoot(), "non_existent_file.html");
        DataUtil.load(file, "UTF-8", "http://example.com");
    }

    @Test
    public void testLoadInputStream_withCharset_returnsDocument() throws IOException {
        String html = "<html><head><title>Stream Test</title></head><body><p>Stream Content</p></body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        Assert.assertEquals("Stream Test", doc.title());
        Assert.assertEquals("Stream Content", doc.select("p").text());
    }

    @Test
    public void testLoadInputStream_withParser_returnsDocument() throws IOException {
        String xml = "<xml><data>Value</data></xml>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());
        Assert.assertEquals("Value", doc.select("data").text());
    }

    @Test
    public void testParseByteData_nullCharset_noMetaTag_defaultsToUtf8() {
        String html = "<html><head><title>No Meta</title></head><body>Content</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        Assert.assertEquals("No Meta", doc.title());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_nullCharset_metaHttpEquivReDecodesCharset() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"><title>Éxito</title></head><body></body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        Assert.assertEquals("Éxito", doc.title());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_nullCharset_metaCharsetHtml5ReDecodesCharset() {
        String html = "<html><head><meta charset=\"ISO-8859-1\"><title>Éxito HTML5</title></head><body></body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        Assert.assertEquals("Éxito HTML5", doc.title());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_nullCharset_metaCharsetSameAsDefault_doesNotReDecode() {
        String html = "<html><head><meta charset=\"UTF-8\"><title>UTF-8 Meta</title></head><body></body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        Assert.assertEquals("UTF-8 Meta", doc.title());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteData_nullCharset_metaHttpEquivWithoutCharset_keepsUtf8() {
        String html = "<html><head><meta http-equiv=\"content-type\" content=\"text/html\"><title>No Charset in Content</title></head><body></body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        Assert.assertEquals("No Charset in Content", doc.title());
    }

    @Test
    public void testParseByteData_nullCharset_metaCharsetEmpty_keepsUtf8() {
        String html = "<html><head><meta charset=\"\"><title>Empty Charset</title></head><body></body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        Assert.assertEquals("Empty Charset", doc.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_emptyCharset_throwsIllegalArgumentException() {
        ByteBuffer byteData = ByteBuffer.wrap("<html></html>".getBytes(Charset.forName("UTF-8")));
        DataUtil.parseByteData(byteData, "", "http://example.com", Parser.htmlParser());
    }

    @Test
    public void testParseByteData_explicitCharset_returnsDocumentWithSetCharset() {
        String html = "<html><head><title>Explicit</title></head><body></body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        Document doc = DataUtil.parseByteData(byteData, "ISO-8859-1", "http://example.com", Parser.htmlParser());
        Assert.assertEquals("Explicit", doc.title());
    }

    @Test
    public void testReadToByteBuffer_emptyInputStream_returnsEmptyBuffer() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);
        Assert.assertEquals(0, buffer.remaining());
    }

    @Test
    public void testReadToByteBuffer_largeInputStream_readsAllBytes() throws IOException {
        int size = 0x20000 * 2 + 1024; // > 2 buffers
        byte[] originalData = new byte[size];
        for (int i = 0; i < size; i++) {
            originalData[i] = (byte) (i % 127);
        }
        InputStream in = new ByteArrayInputStream(originalData);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);

        Assert.assertEquals(size, buffer.remaining());
        byte[] resultData = new byte[buffer.remaining()];
        buffer.get(resultData);
        Assert.assertArrayEquals(originalData, resultData);
    }

    @Test
    public void testGetCharsetFromContentType_nullInput_returnsNull() {
        Assert.assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentType_noCharsetSpecified_returnsNull() {
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html"));
        Assert.assertNull(DataUtil.getCharsetFromContentType("application/json"));
    }

    @Test
    public void testGetCharsetFromContentType_standardFormat_returnsUpperCharset() {
        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=utf-8"));
        Assert.assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=iso-8859-1"));
    }

    @Test
    public void testGetCharsetFromContentType_quotedCharset_returnsUpperCharset() {
        Assert.assertEquals("GB2312", DataUtil.getCharsetFromContentType("text/html; charset=\"gb2312\""));
    }

    @Test
    public void testGetCharsetFromContentType_withSpacesAndSemicolons_returnsUpperCharset() {
        Assert.assertEquals("EUC-JP", DataUtil.getCharsetFromContentType("text/html;   charset =  \"EUC-JP\" ; other=value"));
        Assert.assertEquals("WINDOWS-1252", DataUtil.getCharsetFromContentType("text/html;charset=windows-1252;boundary=something"));
    }
}
