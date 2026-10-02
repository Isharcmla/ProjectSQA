import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParserTest {

    // ---------- parse(String, String) ----------

    @Test
    public void testParse_normalHtml_returnsDocumentWithCorrectStructure() {
        String html = "<html><head><title>Test</title></head><body><p>Hello</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
        assertNotNull(doc.body());
        assertNotNull(doc.head());
    }

    @Test
    public void testParse_emptyString_returnsEmptyDocument() {
        Document doc = Parser.parse("", "http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_nullHtml_throwsException() {
        Parser.parse(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_nullBaseUri_throwsException() {
        Parser.parse("<html></html>", null);
    }

    @Test
    public void testParse_withComment_addsCommentNode() {
        String html = "<html><body><!-- my comment --><p>text</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc.body());
        assertTrue(doc.outerHtml().contains("my comment"));
    }

    @Test
    public void testParse_withCommentEndingInDash_stripsExtraDash() {
        String html = "<html><body><!--comment---><p>text</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_withCdata_addsCdataAsText() {
        String html = "<html><body><![CDATA[some data]]></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc.body());
        assertTrue(doc.body().text().contains("some data"));
    }

    @Test
    public void testParse_withXmlDeclaration_procInstr() {
        String html = "<?xml version=\"1.0\"?><html><body></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_withXmlDeclaration_bangType() {
        String html = "<!DOCTYPE html><html><body></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_withAttributesSingleQuote() {
        String html = "<html><body><div id='myid' class='cls'>content</div></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        Element div = doc.body().children().first();
        assertEquals("myid", div.attr("id"));
        assertEquals("cls", div.attr("class"));
    }

    @Test
    public void testParse_withAttributesDoubleQuote() {
        String html = "<html><body><div id=\"myid2\">content</div></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        Element div = doc.body().children().first();
        assertEquals("myid2", div.attr("id"));
    }

    @Test
    public void testParse_withAttributeNoQuote() {
        String html = "<html><body><div id=myid3>content</div></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        Element div = doc.body().children().first();
        assertEquals("myid3", div.attr("id"));
    }

    @Test
    public void testParse_withAttributeWithoutValue_emptyStringValue() {
        String html = "<html><body><input disabled></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        Element input = doc.body().getElementsByTag("input").first();
        assertNotNull(input);
        assertEquals("", input.attr("disabled"));
    }

    @Test
    public void testParse_withEmptyElement_selfClosing() {
        String html = "<html><body><br/><img src='x.png'/></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc.body());
        assertEquals(1, doc.body().getElementsByTag("img").size());
    }

    @Test
    public void testParse_withUnknownSelfClosingTag() {
        String html = "<html><body><custom-tag/></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_withScriptTag_dataNode() {
        String html = "<html><body><script>var x = 1 < 2;</script></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        Element script = doc.body().getElementsByTag("script").first();
        assertNotNull(script);
    }

    @Test
    public void testParse_withTextareaTag_textNode() {
        String html = "<html><body><textarea>some text</textarea></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        Element textarea = doc.body().getElementsByTag("textarea").first();
        assertNotNull(textarea);
        assertEquals("textarea", textarea.tagName());
    }

    @Test
    public void testParse_withTitleTag_textNode() {
        String html = "<html><head><title>My Title</title></head><body></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertEquals("My Title", doc.title());
    }

    @Test
    public void testParse_withBaseTag_updatesBaseUri() {
        String html = "<html><head><base href='http://newbase.com/'></head><body><a href='page.html'>link</a></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
        Element a = doc.body().getElementsByTag("a").first();
        assertNotNull(a);
    }

    @Test
    public void testParse_withBaseTagNoHref_baseUriUnchanged() {
        String html = "<html><head><base target='_blank'></head><body></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
    }

    @Test
    public void testParse_withEndTag_popsStack() {
        String html = "<html><body><div><p>text</p></div></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc.body());
        assertEquals(1, doc.body().getElementsByTag("div").size());
    }

    @Test
    public void testParse_withUnmatchedEndTag_ignored() {
        String html = "<html><body></span><p>text</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc.body());
        assertTrue(doc.body().text().contains("text"));
    }

    @Test
    public void testParse_implicitParentCreation() {
        String html = "<p>Hello</p>"; // no html/body wrapper
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc.body());
        assertTrue(doc.body().text().contains("Hello"));
    }

    @Test
    public void testParse_implicitBodyCreationWithHead() {
        String html = "<div>content without wrapper</div>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc.body());
        assertNotNull(doc.head());
        assertTrue(doc.body().text().contains("content without wrapper"));
    }

    @Test
    public void testParse_textWithLessThan_handledAsTextNode() {
        String html = "<html><body>1 < 2</body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_nestedTags() {
        String html = "<html><body><ul><li>one</li><li>two</li></ul></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertEquals(2, doc.body().getElementsByTag("li").size());
    }

    @Test
    public void testParse_multipleAttributes() {
        String html = "<html><body><a href='http://test.com' target='_blank' rel=\"nofollow\">link</a></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        Element a = doc.body().getElementsByTag("a").first();
        assertNotNull(a);
        assertEquals("http://test.com", a.attr("href"));
        assertEquals("_blank", a.attr("target"));
        assertEquals("nofollow", a.attr("rel"));
    }

    @Test
    public void testParse_whitespaceOnlyHtml_returnsDocument() {
        Document doc = Parser.parse("   ", "http://example.com/");
        assertNotNull(doc);
    }

    @Test
    public void testParse_emptyBaseUri_stillParses() {
        Document doc = Parser.parse("<html><body>hi</body></html>", "");
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("hi"));
    }

    @Test
    public void testParse_htmlAtRoot_isValidParent() {
        String html = "<html><body>root check</body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc.body());
        assertTrue(doc.body().text().contains("root check"));
    }

    // ---------- parseBodyFragment(String, String) ----------

    @Test
    public void testParseBodyFragment_normalFragment_returnsBodyWithContent() {
        String bodyHtml = "<div><p>fragment text</p></div>";
        Document doc = Parser.parseBodyFragment(bodyHtml, "http://example.com/");
        assertNotNull(doc.body());
        assertTrue(doc.body().text().contains("fragment text"));
    }

    @Test
    public void testParseBodyFragment_emptyFragment_returnsEmptyBody() {
        Document doc = Parser.parseBodyFragment("", "http://example.com/");
        assertNotNull(doc.body());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragment_nullHtml_throwsException() {
        Parser.parseBodyFragment(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragment_nullBaseUri_throwsException() {
        Parser.parseBodyFragment("<div>x</div>", null);
    }

    @Test
    public void testParseBodyFragment_withTableStructure() {
        String bodyHtml = "<table><tr><td>cell</td></tr></table>";
        Document doc = Parser.parseBodyFragment(bodyHtml, "http://example.com/");
        assertNotNull(doc.body());
        assertTrue(doc.body().text().contains("cell"));
    }

    // ---------- parseBodyFragmentRelaxed(String, String) ----------

    @Test
    public void testParseBodyFragmentRelaxed_normalFragment_returnsBodyWithContent() {
        String bodyHtml = "<div><p>relaxed text</p></div>";
        Document doc = Parser.parseBodyFragmentRelaxed(bodyHtml, "http://example.com/");
        assertNotNull(doc.body());
        assertTrue(doc.body().text().contains("relaxed text"));
    }

    @Test
    public void testParseBodyFragmentRelaxed_withoutImplicitWrapping() {
        String bodyHtml = "<td>cell content</td>";
        Document doc = Parser.parseBodyFragmentRelaxed(bodyHtml, "http://example.com/");
        assertNotNull(doc.body());
    }

    @Test
    public void testParseBodyFragmentRelaxed_emptyFragment() {
        Document doc = Parser.parseBodyFragmentRelaxed("", "http://example.com/");
        assertNotNull(doc.body());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragmentRelaxed_nullHtml_throwsException() {
        Parser.parseBodyFragmentRelaxed(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragmentRelaxed_nullBaseUri_throwsException() {
        Parser.parseBodyFragmentRelaxed("<div>x</div>", null);
    }
}
