package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
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
    public void testLoadFile_validHtml_parsesDocument() throws IOException {
        File file = tempFolder.newFile("test.html");
        try (FileOutputStream out = new FileOutputStream(file);
             OutputStreamWriter writer = new OutputStreamWriter(out, StandardCharsets.UTF_8)) {
            writer.write("<html><head><title>File Test</title></head><body><p>Hello World</p></body></html>");
        }

        Document doc = DataUtil.load(file, "UTF-8", "https://example.com/");
        assertNotNull(doc);
        assertEquals("File Test", doc.title());
        assertEquals("Hello World", doc.select("p").text());
        assertEquals("https://example.com/", doc.baseUri());
    }

    @Test
    public void testLoadInputStream_validHtml_parsesDocument() throws IOException {
        String html = "<html><head><title>Stream Test</title></head><body><p>Sample</p></body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.load(in, "UTF-8", "https://example.com/");
        assertNotNull(doc);
        assertEquals("Stream Test", doc.title());
        assertEquals("Sample", doc.select("p").text());
    }

    @Test
    public void testLoadInputStreamWithParser_xmlParser_parsesXml() throws IOException {
        String xml = "<xml><data id=\"1\">Value</data></xml>";
        InputStream in = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.load(in, "UTF-8", "https://example.com/xml", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("Value", doc.select("data").text());
        assertEquals("1", doc.select("data").attr("id"));
    }

    @Test
    public void testParseInputStream_nullInput_returnsEmptyDoc() throws IOException {
        Document doc = DataUtil.parseInputStream(null, "UTF-8", "https://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("https://example.com/", doc.baseUri());
        assertEquals(0, doc.children().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseInputStream_emptyCharset_throwsException() throws IOException {
        InputStream in = new ByteArrayInputStream("<p>test</p>".getBytes(StandardCharsets.UTF_8));
        DataUtil.parseInputStream(in, "", "https://example.com/", Parser.htmlParser());
    }

    @Test
    public void testParseInputStream_detectMetaHttpEquivCharset_redecodesCorrectly() throws IOException {
        String html = "<html><head><meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\"></head>"
                + "<body><p>Caf\u00e9</p></body></html>";
        byte[] bytes = html.getBytes(StandardCharsets.ISO_8859_1);
        InputStream in = new ByteArrayInputStream(bytes);

        Document doc = DataUtil.parseInputStream(in, null, "https://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Caf\u00e9", doc.select("p").text());
        assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
    }

    @Test
    public void testParseInputStream_detectMetaCharset_redecodesCorrectly() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body><p>Na\u00efve</p></body></html>";
        byte[] bytes = html.getBytes(StandardCharsets.ISO_8859_1);
        InputStream in = new ByteArrayInputStream(bytes);

        Document doc = DataUtil.parseInputStream(in, null, "https://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Na\u00efve", doc.select("p").text());
    }

    @Test
    public void testParseInputStream_detectXmlDeclarationEncoding_redecodesCorrectly() throws IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><root><item>M\u00fcnchen</item></root>";
        byte[] bytes = xml.getBytes(StandardCharsets.ISO_8859_1);
        InputStream in = new ByteArrayInputStream(bytes);

        Document doc = DataUtil.parseInputStream(in, null, "https://example.com/", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("M\u00fcnchen", doc.select("item").text());
    }

    @Test
    public void testParseInputStream_detectCommentXmlDeclarationEncoding_redecodesCorrectly() throws IOException {
        String xml = "<!--?xml version=\"1.0\" encoding=\"ISO-8859-1\"?--><root><item>T\u00e9st</item></root>";
        byte[] bytes = xml.getBytes(StandardCharsets.ISO_8859_1);
        InputStream in = new ByteArrayInputStream(bytes);

        Document doc = DataUtil.parseInputStream(in, null, "https://example.com/", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("T\u00e9st", doc.select("item").text());
    }

    @Test
    public void testParseInputStream_largeStreamWithoutMeta_parsesFully() throws IOException {
        StringBuilder sb = new StringBuilder("<html><body>");
        for (int i = 0; i < 2000; i++) {
            sb.append("<p>Paragraph number ").append(i).append(" with some additional padding text.</p>");
        }
        sb.append("</body></html>");

        byte[] bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(bytes);

        Document doc = DataUtil.parseInputStream(in, null, "https://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals(2000, doc.select("p").size());
    }

    @Test
    public void testParseInputStream_utf8Bom_detectedAndHandled() throws IOException {
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] content = "<html><head><title>BOM UTF-8</title></head></html>".getBytes(StandardCharsets.UTF_8);
        byte[] full = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, full, 0, bom.length);
        System.arraycopy(content, 0, full, bom.length, content.length);

        Document doc = DataUtil.parseInputStream(new ByteArrayInputStream(full), null, "https://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("BOM UTF-8", doc.title());
    }

    @Test
    public void testParseInputStream_utf16BeBom_detected() throws IOException {
        byte[] bom = new byte[]{(byte) 0xFE, (byte) 0xFF};
        byte[] content = "<html><head><title>UTF-16BE</title></head></html>".getBytes(StandardCharsets.UTF_16BE);
        byte[] full = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, full, 0, bom.length);
        System.arraycopy(content, 0, full, bom.length, content.length);

        Document doc = DataUtil.parseInputStream(new ByteArrayInputStream(full), null, "https://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-16BE", doc.title());
    }

    @Test
    public void testParseInputStream_utf16LeBom_detected() throws IOException {
        byte[] bom = new byte[]{(byte) 0xFF, (byte) 0xFE};
        byte[] content = "<html><head><title>UTF-16LE</title></head></html>".getBytes(StandardCharsets.UTF_16LE);
        byte[] full = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, full, 0, bom.length);
        System.arraycopy(content, 0, full, bom.length, content.length);

        Document doc = DataUtil.parseInputStream(new ByteArrayInputStream(full), null, "https://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-16LE", doc.title());
    }

    @Test
    public void testParseInputStream_shortStream_parsesWithoutBom() throws IOException {
        byte[] shortBytes = "hi".getBytes(StandardCharsets.UTF_8);
        Document doc = DataUtil.parseInputStream(new ByteArrayInputStream(shortBytes), null, "https://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("hi", doc.text());
    }

    @Test(expected = IOException.class)
    public void testParseInputStream_streamThrowsIOException_propagatesException() throws IOException {
        InputStream errorStream = new InputStream() {
            private int count = 0;
            @Override
            public int read() throws IOException {
                count++;
                if (count > 6000) {
                    throw new IOException("Simulated mid-stream read failure");
                }
                return 'a';
            }
        };
        DataUtil.parseInputStream(errorStream, null, "https://example.com/", Parser.htmlParser());
    }

    @Test
    public void testCrossStreams_copiesContent() throws IOException {
        byte[] inputData = new byte[40000];
        for (int i = 0; i < inputData.length; i++) {
            inputData[i] = (byte) (i % 128);
        }

        ByteArrayInputStream in = new ByteArrayInputStream(inputData);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        DataUtil.crossStreams(in, out);
        byte[] outputData = out.toByteArray();

        assertEquals(inputData.length, outputData.length);
        for (int i = 0; i < inputData.length; i++) {
            assertEquals(inputData[i], outputData[i]);
        }
    }

    @Test
    public void testCrossStreams_emptyStream_writesNothing() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        DataUtil.crossStreams(in, out);
        assertEquals(0, out.size());
    }

    @Test
    public void testReadToByteBuffer_unlimitedSize_readsEntireStream() throws IOException {
        byte[] data = "Sample Buffer Data".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);

        ByteBuffer byteBuffer = DataUtil.readToByteBuffer(in, 0);
        assertEquals(data.length, byteBuffer.remaining());

        byte[] readBytes = new byte[byteBuffer.remaining()];
        byteBuffer.get(readBytes);
        assertEquals("Sample Buffer Data", new String(readBytes, StandardCharsets.UTF_8));
    }

    @Test
    public void testReadToByteBuffer_limitedSize_readsUpToMax() throws IOException {
        byte[] data = "0123456789".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);

        ByteBuffer byteBuffer = DataUtil.readToByteBuffer(in, 5);
        assertEquals(5, byteBuffer.remaining());

        byte[] readBytes = new byte[byteBuffer.remaining()];
        byteBuffer.get(readBytes);
        assertEquals("01234", new String(readBytes, StandardCharsets.UTF_8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_negativeSize_throwsException() throws IOException {
        InputStream in = new ByteArrayInputStream("Test".getBytes(StandardCharsets.UTF_8));
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void testEmptyByteBuffer_returnsZeroCapacityBuffer() {
        ByteBuffer buf = DataUtil.emptyByteBuffer();
        assertNotNull(buf);
        assertEquals(0, buf.capacity());
        assertEquals(0, buf.remaining());
    }

    @Test
    public void testGetCharsetFromContentType_variousInputs() {
        assertNull(DataUtil.getCharsetFromContentType(null));
        assertNull(DataUtil.getCharsetFromContentType(""));
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset="));
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=unsupported-invalid-charset-12345"));

        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=utf-8"));
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"utf-8\""));
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset='utf-8'"));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=ISO-8859-1; boundary=something"));
        assertEquals("GBK", DataUtil.getCharsetFromContentType("text/html; charset=gbk"));
    }

    @Test
    public void testMimeBoundary_generatesValidBoundaryString() {
        String boundary = DataUtil.mimeBoundary();
        assertNotNull(boundary);
        assertEquals(DataUtil.boundaryLength, boundary.length());
        assertTrue(boundary.matches("^[-_a-zA-Z0-9]{32}$"));

        String boundary2 = DataUtil.mimeBoundary();
        assertNotNull(boundary2);
        assertEquals(32, boundary2.length());
    }
}
