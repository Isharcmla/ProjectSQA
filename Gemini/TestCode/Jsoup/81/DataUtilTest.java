package org.jsoup.helper;

import org.jsoup.UncheckedIOException;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
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
import java.io.OutputStreamWriter;
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
        Assert.assertFalse(constructor.isAccessible());
        constructor.setAccessible(true);
        DataUtil instance = constructor.newInstance();
        Assert.assertNotNull(instance);
    }

    @Test
    public void testEmptyByteBuffer() {
        ByteBuffer buffer = DataUtil.emptyByteBuffer();
        Assert.assertNotNull(buffer);
        Assert.assertEquals(0, buffer.capacity());
        Assert.assertEquals(0, buffer.remaining());
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
    public void testGetCharsetFromContentType() {
        Assert.assertNull(DataUtil.getCharsetFromContentType(null));
        Assert.assertNull(DataUtil.getCharsetFromContentType(""));
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html"));
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html; charset="));
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html; charset=unsupported_dummy_charset"));
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html; charset=[invalid charset]"));

        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=utf-8"));
        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"utf-8\""));
        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset='utf-8'"));
        Assert.assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=ISO-8859-1"));
        Assert.assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=iso-8859-1; other=true"));
    }

    @Test
    public void testCrossStreams() throws IOException {
        byte[] data = "Hello World across streams!".getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        DataUtil.crossStreams(in, out);
        Assert.assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testReadToByteBuffer() throws IOException {
        byte[] data = "Sample data for buffer testing".getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        ByteBuffer buf = DataUtil.readToByteBuffer(in, 10);
        Assert.assertEquals(10, buf.remaining());
        byte[] readBytes = new byte[10];
        buf.get(readBytes);
        Assert.assertEquals("Sample dat", new String(readBytes, StandardCharsets.UTF_8));

        ByteArrayInputStream inFull = new ByteArrayInputStream(data);
        ByteBuffer bufFull = DataUtil.readToByteBuffer(inFull);
        Assert.assertEquals(data.length, bufFull.remaining());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBufferNegativeMaxSize() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[10]);
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void testReadFileToByteBuffer() throws IOException {
        File file = tempFolder.newFile("test_buffer.txt");
        byte[] expected = "File content to read".getBytes(StandardCharsets.UTF_8);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(expected);
        }

        ByteBuffer buffer = DataUtil.readFileToByteBuffer(file);
        Assert.assertEquals(expected.length, buffer.remaining());
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLoadFromFile() throws IOException {
        File file = tempFolder.newFile("test_load.html");
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8)) {
            writer.write("<html><head><title>File Test</title></head><body><p>Hello File</p></body></html>");
        }

        Document doc = DataUtil.load(file, "UTF-8", "https://example.com");
        Assert.assertNotNull(doc);
        Assert.assertEquals("File Test", doc.title());
        Assert.assertEquals("https://example.com", doc.baseUri());
    }

    @Test
    public void testLoadFromInputStream() throws IOException {
        byte[] htmlBytes = "<html><head><title>Stream Test</title></head><body><p>Hello Stream</p></body></html>".getBytes(StandardCharsets.UTF_8);

        ByteArrayInputStream in1 = new ByteArrayInputStream(htmlBytes);
        Document doc1 = DataUtil.load(in1, "UTF-8", "https://example.com");
        Assert.assertNotNull(doc1);
        Assert.assertEquals("Stream Test", doc1.title());

        ByteArrayInputStream in2 = new ByteArrayInputStream(htmlBytes);
        Document doc2 = DataUtil.load(in2, "UTF-8", "https://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc2);
        Assert.assertEquals("Stream Test", doc2.title());
    }

    @Test
    public void testParseInputStreamNullInput() throws IOException {
        Document doc = DataUtil.parseInputStream(null, "UTF-8", "https://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("https://example.com", doc.baseUri());
        Assert.assertEquals("", doc.body().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseInputStreamEmptyCharsetThrows() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("<p>test</p>".getBytes(StandardCharsets.UTF_8));
        DataUtil.parseInputStream(in, "", "https://example.com", Parser.htmlParser());
    }

    @Test
    public void testParseInputStreamMetaCharsetHtml5() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body><p>Test</p></body></html>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.ISO_8859_1));

        Document doc = DataUtil.parseInputStream(in, null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
    }

    @Test
    public void testParseInputStreamMetaHttpEquiv() throws IOException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head><body><p>Test</p></body></html>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.ISO_8859_1));

        Document doc = DataUtil.parseInputStream(in, null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
    }

    @Test
    public void testParseInputStreamXmlDeclarationEncoding() throws IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><root><child>Test</child></root>";
        ByteArrayInputStream in = new ByteArrayInputStream(xml.getBytes(StandardCharsets.ISO_8859_1));

        Document doc = DataUtil.parseInputStream(in, null, "https://example.com", Parser.xmlParser());
        Assert.assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
    }

    @Test
    public void testParseInputStreamXmlDeclarationNotXmlName() throws IOException {
        String xml = "<?something encoding=\"ISO-8859-1\"?><root><child>Test</child></root>";
        ByteArrayInputStream in = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseInputStream(in, null, "https://example.com", Parser.xmlParser());
        Assert.assertEquals(Charset.forName("UTF-8"), doc.outputSettings().charset());
    }

    @Test
    public void testParseInputStreamNotFullyReadOnFirstPass() throws IOException {
        StringBuilder sb = new StringBuilder("<html><head><title>Large</title></head><body>");
        for (int i = 0; i < 2000; i++) {
            sb.append("<p>Filler content to exceed the first read buffer size limit ").append(i).append("</p>");
        }
        sb.append("</body></html>");

        byte[] htmlBytes = sb.toString().getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream in = new ByteArrayInputStream(htmlBytes);

        Document doc = DataUtil.parseInputStream(in, null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("Large", doc.title());
        Assert.assertEquals(Charset.forName("UTF-8"), doc.outputSettings().charset());
    }

    @Test
    public void testDetectCharsetFromBomUtf8() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF});
        out.write("<p>UTF-8 with BOM</p>".getBytes(StandardCharsets.UTF_8));

        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        Document doc = DataUtil.parseInputStream(in, null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("UTF-8 with BOM", doc.select("p").text());
        Assert.assertEquals(Charset.forName("UTF-8"), doc.outputSettings().charset());
    }

    @Test
    public void testDetectCharsetFromBomUtf16BE() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(new byte[]{(byte) 0xFE, (byte) 0xFF});
        out.write("<p>UTF-16BE</p>".getBytes(StandardCharsets.UTF_16BE));

        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        Document doc = DataUtil.parseInputStream(in, null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("UTF-16BE", doc.select("p").text());
    }

    @Test
    public void testDetectCharsetFromBomUtf16LE() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(new byte[]{(byte) 0xFF, (byte) 0xFE});
        out.write("<p>UTF-16LE</p>".getBytes(StandardCharsets.UTF_16LE));

        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        Document doc = DataUtil.parseInputStream(in, null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("UTF-16LE", doc.select("p").text());
    }

    @Test
    public void testDetectCharsetFromBomUtf32BE() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(new byte[]{0x00, 0x00, (byte) 0xFE, (byte) 0xFF});
        out.write("<p>UTF-32BE</p>".getBytes(Charset.forName("UTF-32BE")));

        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        Document doc = DataUtil.parseInputStream(in, null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("UTF-32BE", doc.select("p").text());
    }

    @Test
    public void testDetectCharsetFromBomUtf32LE() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(new byte[]{(byte) 0xFF, (byte) 0xFE, 0x00, 0x00});
        out.write("<p>UTF-32LE</p>".getBytes(Charset.forName("UTF-32LE")));

        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        Document doc = DataUtil.parseInputStream(in, null, "https://example.com", Parser.htmlParser());
        Assert.assertEquals("UTF-32LE", doc.select("p").text());
    }

    @Test(expected = IOException.class)
    public void testParseInputStreamUncheckedIOExceptionRethrown() throws IOException {
        InputStream errorStream = new InputStream() {
            private int count = 0;

            @Override
            public int read() throws IOException {
                count++;
                if (count > 10) {
                    throw new IOException("Simulated I/O failure");
                }
                return '<';
            }
        };

        DataUtil.parseInputStream(errorStream, "UTF-8", "https://example.com", Parser.htmlParser());
    }

    @Test
    public void testParseInputStreamShortStreamNoBom() throws IOException {
        byte[] bytes = new byte[]{0x01, 0x02};
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);

        Document doc = DataUtil.parseInputStream(in, null, "https://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
    }
}
