package org.jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Whitelist;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class JsoupTest {

    @Test
    public void testConstructor_isPrivate_instantiableViaReflection() throws Exception {
        Constructor<Jsoup> constructor = Jsoup.class.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        Jsoup instance = constructor.newInstance();
        Assert.assertNotNull(instance);
    }

    @Test
    public void testParse_stringHtml_success() {
        String html = "<html><head><title>Test</title></head><body><p id='p1'>Hello World</p></body></html>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc);
        Assert.assertEquals("Test", doc.title());
        Assert.assertEquals("Hello World", doc.getElementById("p1").text());
    }

    @Test
    public void testParse_emptyStringHtml_returnsEmptyDocument() {
        Document doc = Jsoup.parse("");
        Assert.assertNotNull(doc);
        Assert.assertEquals("", doc.body().text());
    }

    @Test
    public void testParse_stringHtmlAndBaseUri_resolvesAbsoluteUrl() {
        String html = "<a href='/path/to/page'>Link</a>";
        String baseUri = "http://example.com/sub/";
        Document doc = Jsoup.parse(html, baseUri);
        Assert.assertNotNull(doc);
        Element link = doc.select("a").first();
        Assert.assertNotNull(link);
        Assert.assertEquals("http://example.com/path/to/page", link.absUrl("href"));
    }

    @Test
    public void testParse_stringHtmlBaseUriAndXmlParser_parsesAsXml() {
        String xml = "<root><item id='1'>Value</item></root>";
        Document doc = Jsoup.parse(xml, "http://example.com/", Parser.xmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("Value", doc.select("item").text());
        Assert.assertEquals("xml", doc.parser().getTreeBuilder().defaultSettings().normalizeTag("XML"));
    }

    @Test
    public void testParse_stringHtmlBaseUriAndHtmlParser_parsesAsHtml() {
        String html = "<div id='test'>Content</div>";
        Document doc = Jsoup.parse(html, "", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("Content", doc.getElementById("test").text());
    }

    @Test
    public void testConnect_validHttpUrl_returnsConnection() {
        Connection con = Jsoup.connect("http://example.com");
        Assert.assertNotNull(con);
    }

    @Test
    public void testConnect_validHttpsUrl_returnsConnection() {
        Connection con = Jsoup.connect("https://example.com/test");
        Assert.assertNotNull(con);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnect_invalidProtocol_throwsIllegalArgumentException() {
        Jsoup.connect("ftp://example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnect_malformedUrl_throwsIllegalArgumentException() {
        Jsoup.connect("invalid_url_string");
    }

    @Test
    public void testParse_fileWithCharsetAndBaseUri_success() throws IOException {
        File tempFile = File.createTempFile("jsoup_test", ".html");
        tempFile.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write("<p>File Content</p>".getBytes(StandardCharsets.UTF_8));
        }

        Document doc = Jsoup.parse(tempFile, "UTF-8", "http://example.com/");
        Assert.assertNotNull(doc);
        Assert.assertEquals("File Content", doc.select("p").text());
        Assert.assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testParse_fileWithCharset_usesAbsolutePathAsBaseUri() throws IOException {
        File tempFile = File.createTempFile("jsoup_test_charset", ".html");
        tempFile.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write("<span>Simple</span>".getBytes(StandardCharsets.UTF_8));
        }

        Document doc = Jsoup.parse(tempFile, "UTF-8");
        Assert.assertNotNull(doc);
        Assert.assertEquals("Simple", doc.select("span").text());
        Assert.assertEquals(tempFile.getAbsolutePath(), doc.baseUri());
    }

    @Test
    public void testParse_fileWithNullCharset_autoDetectsCharset() throws IOException {
        File tempFile = File.createTempFile("jsoup_test_null_charset", ".html");
        tempFile.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write("<meta charset='UTF-8'><p>Auto Detected</p>".getBytes(StandardCharsets.UTF_8));
        }

        Document doc = Jsoup.parse(tempFile, null);
        Assert.assertNotNull(doc);
        Assert.assertEquals("Auto Detected", doc.select("p").text());
    }

    @Test(expected = IOException.class)
    public void testParse_nonExistentFile_throwsIOException() throws IOException {
        File nonExistent = new File("non_existent_file_for_jsoup_test.html");
        Jsoup.parse(nonExistent, "UTF-8");
    }

    @Test
    public void testParse_inputStreamWithCharsetAndBaseUri_success() throws IOException {
        String html = "<p>InputStream Content</p>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));

        Document doc = Jsoup.parse(in, "UTF-8", "http://example.com/");
        Assert.assertNotNull(doc);
        Assert.assertEquals("InputStream Content", doc.select("p").text());
        Assert.assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testParse_inputStreamWithNullCharset_success() throws IOException {
        String html = "<p>Null Charset Stream</p>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));

        Document doc = Jsoup.parse(in, null, "http://example.com/");
        Assert.assertNotNull(doc);
        Assert.assertEquals("Null Charset Stream", doc.select("p").text());
    }

    @Test
    public void testParse_inputStreamWithXmlParser_success() throws IOException {
        String xml = "<data><entry>XML Stream</entry></data>";
        InputStream in = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));

        Document doc = Jsoup.parse(in, "UTF-8", "http://example.com/", Parser.xmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("XML Stream", doc.select("entry").text());
    }

    @Test
    public void testParseBodyFragment_withoutBaseUri_wrapsInBody() {
        String fragment = "<div>Fragment Content</div>";
        Document doc = Jsoup.parseBodyFragment(fragment);
        Assert.assertNotNull(doc);
        Assert.assertEquals("Fragment Content", doc.body().select("div").text());
    }

    @Test
    public void testParseBodyFragment_emptyString_returnsEmptyBody() {
        Document doc = Jsoup.parseBodyFragment("");
        Assert.assertNotNull(doc);
        Assert.assertEquals("", doc.body().text());
    }

    @Test
    public void testParseBodyFragment_withBaseUri_resolvesRelativeUrl() {
        String fragment = "<a href='page.html'>Link</a>";
        Document doc = Jsoup.parseBodyFragment(fragment, "http://example.com/dir/");
        Assert.assertNotNull(doc);
        Element link = doc.select("a").first();
        Assert.assertNotNull(link);
        Assert.assertEquals("http://example.com/dir/page.html", link.absUrl("href"));
    }

    @Test(expected = IOException.class)
    public void testParse_urlUnreachableHost_throwsIOException() throws IOException {
        URL url = new URL("http://0.0.0.0:1/");
        Jsoup.parse(url, 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_urlInvalidProtocol_throwsIllegalArgumentException() throws IOException {
        URL url = new URL("ftp://example.com/file.html");
        Jsoup.parse(url, 1000);
    }

    @Test
    public void testClean_bodyHtmlAndWhitelist_filtersDisallowedTags() {
        String dirty = "<p>Safe <script>alert('xss')</script> text</p>";
        String clean = Jsoup.clean(dirty, Whitelist.basic());
        Assert.assertEquals("<p>Safe  text</p>", clean);
    }

    @Test
    public void testClean_noneWhitelist_removesAllTags() {
        String dirty = "<p><b>Bold</b> and <i>Italic</i></p>";
        String clean = Jsoup.clean(dirty, Whitelist.none());
        Assert.assertEquals("Bold and Italic", clean);
    }

    @Test
    public void testClean_bodyHtmlBaseUriAndWhitelist_preservesAndResolvesRelativeUrl() {
        String dirty = "<a href='/wiki/Main_Page'>Link</a>";
        String clean = Jsoup.clean(dirty, "http://wikipedia.org", Whitelist.basic());
        Assert.assertTrue(clean.contains("http://wikipedia.org/wiki/Main_Page"));
    }

    @Test
    public void testClean_withCustomOutputSettings_appliesSettings() {
        String dirty = "<p>Line1\nLine2</p>";
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(false);

        String clean = Jsoup.clean(dirty, "", Whitelist.basic(), settings);
        Assert.assertNotNull(clean);
        Assert.assertTrue(clean.contains("Line1"));
    }

    @Test
    public void testIsValid_validHtml_returnsTrue() {
        String validHtml = "<p><a href=\"http://example.com\">Valid Link</a></p>";
        boolean valid = Jsoup.isValid(validHtml, Whitelist.basic());
        Assert.assertTrue(valid);
    }

    @Test
    public void testIsValid_invalidHtml_returnsFalse() {
        String invalidHtml = "<p>Dangerous <script>alert('xss');</script></p>";
        boolean valid = Jsoup.isValid(invalidHtml, Whitelist.basic());
        Assert.assertFalse(valid);
    }

    @Test
    public void testIsValid_emptyString_returnsTrue() {
        boolean valid = Jsoup.isValid("", Whitelist.basic());
        Assert.assertTrue(valid);
    }
}
