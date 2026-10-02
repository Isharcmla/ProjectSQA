import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Whitelist;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.net.URL;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;

public class JsoupTest {

    private File tempFile;

    @Before
    public void setUp() throws IOException {
        tempFile = File.createTempFile("jsoup_test", ".html");
        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write("<html><head><title>Test</title></head><body><p>Hello File</p></body></html>");
        }
    }

    @After
    public void tearDown() {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    // ---------- parse(String html, String baseUri) ----------

    @Test
    public void testParseHtmlBaseUri_normalInput_returnsDocument() {
        Document doc = Jsoup.parse("<html><body><p>Hello</p></body></html>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testParseHtmlBaseUri_emptyHtml_returnsDocument() {
        Document doc = Jsoup.parse("", "http://example.com/");
        assertNotNull(doc);
    }

    @Test
    public void testParseHtmlBaseUri_nullHtml_throwsException() {
        try {
            Jsoup.parse(null, "http://example.com/");
            fail("Expected exception for null html");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    // ---------- parse(String html, String baseUri, Parser parser) ----------

    @Test
    public void testParseHtmlBaseUriParser_withXmlParser_returnsDocument() {
        Document doc = Jsoup.parse("<root><child>text</child></root>", "http://example.com/", Parser.xmlParser());
        assertNotNull(doc);
        assertTrue(doc.html().contains("child"));
    }

    @Test
    public void testParseHtmlBaseUriParser_withHtmlParser_returnsDocument() {
        Document doc = Jsoup.parse("<div>content</div>", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("content", doc.select("div").text());
    }

    // ---------- parse(String html) ----------

    @Test
    public void testParseHtml_normalInput_returnsDocument() {
        Document doc = Jsoup.parse("<html><body><p>NoBase</p></body></html>");
        assertNotNull(doc);
        assertEquals("NoBase", doc.body().text());
    }

    @Test
    public void testParseHtml_emptyString_returnsDocument() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
    }

    // ---------- connect(String url) ----------

    @Test
    public void testConnect_validUrlString_returnsConnection() {
        Connection connection = Jsoup.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void testConnect_invalidProtocol_throwsException() {
        try {
            Jsoup.connect("ftp://example.com");
            fail("Expected exception for invalid protocol");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    // ---------- parse(File in, String charsetName, String baseUri) ----------

    @Test
    public void testParseFileCharsetBaseUri_validFile_returnsDocument() throws IOException {
        Document doc = Jsoup.parse(tempFile, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Hello File", doc.body().text());
    }

    @Test
    public void testParseFileCharsetBaseUri_nullCharset_returnsDocument() throws IOException {
        Document doc = Jsoup.parse(tempFile, null, "http://example.com/");
        assertNotNull(doc);
    }

    @Test(expected = IOException.class)
    public void testParseFileCharsetBaseUri_nonExistentFile_throwsIOException() throws IOException {
        File nonExistent = new File("nonexistent_file_12345.html");
        Jsoup.parse(nonExistent, "UTF-8", "http://example.com/");
    }

    // ---------- parse(File in, String charsetName) ----------

    @Test
    public void testParseFileCharset_validFile_returnsDocument() throws IOException {
        Document doc = Jsoup.parse(tempFile, "UTF-8");
        assertNotNull(doc);
        assertEquals("Hello File", doc.body().text());
    }

    @Test(expected = IOException.class)
    public void testParseFileCharset_nonExistentFile_throwsIOException() throws IOException {
        File nonExistent = new File("nonexistent_file_67890.html");
        Jsoup.parse(nonExistent, "UTF-8");
    }

    // ---------- parse(InputStream in, String charsetName, String baseUri) ----------

    @Test
    public void testParseInputStreamCharsetBaseUri_validStream_returnsDocument() throws IOException {
        String html = "<html><body><p>Stream Test</p></body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = Jsoup.parse(in, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Stream Test", doc.body().text());
    }

    @Test
    public void testParseInputStreamCharsetBaseUri_nullCharset_returnsDocument() throws IOException {
        String html = "<html><body><p>NullCharset</p></body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = Jsoup.parse(in, null, "http://example.com/");
        assertNotNull(doc);
    }

    // ---------- parse(InputStream in, String charsetName, String baseUri, Parser parser) ----------

    @Test
    public void testParseInputStreamCharsetBaseUriParser_withXmlParser_returnsDocument() throws IOException {
        String xml = "<root><child>xmltext</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));
        Document doc = Jsoup.parse(in, "UTF-8", "http://example.com/", Parser.xmlParser());
        assertNotNull(doc);
        assertTrue(doc.html().contains("child"));
    }

    @Test
    public void testParseInputStreamCharsetBaseUriParser_withHtmlParser_returnsDocument() throws IOException {
        String html = "<div>parserTest</div>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = Jsoup.parse(in, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("parserTest", doc.select("div").text());
    }

    // ---------- parseBodyFragment(String bodyHtml, String baseUri) ----------

    @Test
    public void testParseBodyFragmentBaseUri_normalInput_returnsDocument() {
        Document doc = Jsoup.parseBodyFragment("<p>Fragment</p>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Fragment", doc.body().text());
    }

    @Test
    public void testParseBodyFragmentBaseUri_emptyInput_returnsDocument() {
        Document doc = Jsoup.parseBodyFragment("", "http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    // ---------- parseBodyFragment(String bodyHtml) ----------

    @Test
    public void testParseBodyFragment_normalInput_returnsDocument() {
        Document doc = Jsoup.parseBodyFragment("<p>NoBaseFragment</p>");
        assertNotNull(doc);
        assertEquals("NoBaseFragment", doc.body().text());
    }

    @Test
    public void testParseBodyFragment_emptyInput_returnsDocument() {
        Document doc = Jsoup.parseBodyFragment("");
        assertNotNull(doc);
    }

    // ---------- parse(URL url, int timeoutMillis) ----------

    @Test(expected = IOException.class)
    public void testParseUrlTimeout_unreachableUrl_throwsIOException() throws IOException {
        URL url = new URL("http://invalid.host.name.that.does.not.exist.example/");
        Jsoup.parse(url, 1000);
    }

    @Test(expected = MalformedURLException.class)
    public void testParseUrlTimeout_malformedUrl_throwsMalformedURLException() throws IOException {
        URL url = new URL("invalidprotocol://example.com");
        Jsoup.parse(url, 1000);
    }

    // ---------- clean(String bodyHtml, String baseUri, Whitelist whitelist) ----------

    @Test
    public void testCleanBaseUriWhitelist_normalInput_returnsSafeHtml() {
        String dirty = "<p>Hello<script>alert('x')</script></p>";
        String clean = Jsoup.clean(dirty, "http://example.com/", Whitelist.basic());
        assertNotNull(clean);
        assertFalse(clean.contains("script"));
    }

    @Test
    public void testCleanBaseUriWhitelist_emptyInput_returnsEmptyResult() {
        String clean = Jsoup.clean("", "http://example.com/", Whitelist.basic());
        assertNotNull(clean);
        assertEquals("", clean);
    }

    @Test
    public void testCleanBaseUriWhitelist_noneWhitelist_stripsAllTags() {
        String dirty = "<p>Hello <b>World</b></p>";
        String clean = Jsoup.clean(dirty, "http://example.com/", Whitelist.none());
        assertNotNull(clean);
        assertFalse(clean.contains("<b>"));
    }

    // ---------- clean(String bodyHtml, Whitelist whitelist) ----------

    @Test
    public void testCleanWhitelist_normalInput_returnsSafeHtml() {
        String dirty = "<p>Hello<script>alert('x')</script></p>";
        String clean = Jsoup.clean(dirty, Whitelist.basic());
        assertNotNull(clean);
        assertFalse(clean.contains("script"));
    }

    @Test
    public void testCleanWhitelist_emptyInput_returnsEmptyResult() {
        String clean = Jsoup.clean("", Whitelist.basic());
        assertNotNull(clean);
        assertEquals("", clean);
    }

    // ---------- clean(String bodyHtml, String baseUri, Whitelist whitelist, Document.OutputSettings outputSettings) ----------

    @Test
    public void testCleanBaseUriWhitelistOutputSettings_normalInput_returnsSafeHtml() {
        String dirty = "<p>Hello<script>alert('x')</script></p>";
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(false);
        String clean = Jsoup.clean(dirty, "http://example.com/", Whitelist.basic(), settings);
        assertNotNull(clean);
        assertFalse(clean.contains("script"));
    }

    @Test
    public void testCleanBaseUriWhitelistOutputSettings_prettyPrintTrue_returnsFormattedHtml() {
        String dirty = "<p>Hello</p><p>World</p>";
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(true);
        String clean = Jsoup.clean(dirty, "http://example.com/", Whitelist.basic(), settings);
        assertNotNull(clean);
    }

    // ---------- isValid(String bodyHtml, Whitelist whitelist) ----------

    @Test
    public void testIsValid_cleanInput_returnsTrue() {
        boolean valid = Jsoup.isValid("<p>Hello</p>", Whitelist.basic());
        assertTrue(valid);
    }

    @Test
    public void testIsValid_dirtyInput_returnsFalse() {
        boolean valid = Jsoup.isValid("<p>Hello<script>alert('x')</script></p>", Whitelist.basic());
        assertFalse(valid);
    }

    @Test
    public void testIsValid_emptyInput_returnsTrue() {
        boolean valid = Jsoup.isValid("", Whitelist.basic());
        assertTrue(valid);
    }

    @Test
    public void testIsValid_noneWhitelistWithTags_returnsFalse() {
        boolean valid = Jsoup.isValid("<b>Bold</b>", Whitelist.none());
        assertFalse(valid);
    }
}
