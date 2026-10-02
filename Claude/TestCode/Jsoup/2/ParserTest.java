package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParserTest {

    // ---------- Normal / typical input cases ----------

    @Test
    public void testParse_normalHtml_returnsDocument() {
        String html = "<html><head><title>Test Title</title></head><body><p>Hello World</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.body());
        assertTrue(doc.toString().contains("Hello World"));
    }

    @Test
    public void testParse_withComment_addsCommentToDocument() {
        String html = "<html><body><!-- this is a comment --><p>text</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        String out = doc.toString();
        assertTrue(out.contains("this is a comment"));
    }

    @Test
    public void testParse_withCData_addsCdataAsText() {
        String html = "<html><body><![CDATA[some cdata content]]></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        String out = doc.toString();
        assertTrue(out.contains("some cdata content"));
    }

    @Test
    public void testParse_withXmlDeclaration_doesNotThrow() {
        String html = "<?xml version=\"1.0\"?><html><body><p>content</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.toString().contains("content"));
    }

    @Test
    public void testParse_withBangDeclaration_doesNotThrow() {
        String html = "<!DOCTYPE html><html><body><p>content</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.toString().contains("content"));
    }

    @Test
    public void testParse_selfClosingTag_isEmptyElement() {
        String html = "<html><body><img src=\"test.jpg\"/></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        String out = doc.toString();
        assertTrue(out.contains("img"));
        assertTrue(out.contains("test.jpg"));
    }

    @Test
    public void testParse_scriptTag_addsRawDataNode() {
        String html = "<html><body><script>var i = 1;</script></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        String out = doc.toString();
        assertTrue(out.contains("var i = 1;"));
    }

    @Test
    public void testParse_textareaTag_addsTextNode() {
        String html = "<html><body><textarea>some default text</textarea></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        String out = doc.toString();
        assertTrue(out.contains("some default text"));
    }

    @Test
    public void testParse_titleTag_addsTitleAsText() {
        String html = "<html><head><title>My Page Title</title></head><body></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        String out = doc.toString();
        assertTrue(out.contains("My Page Title"));
    }

    @Test
    public void testParse_baseTagWithHref_updatesBaseUri() {
        String html = "<html><head><base href=\"http://newbase.com/\"></head><body><a href=\"page.html\">link</a></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
        // the base tag processing should not throw and document should parse fine
        assertTrue(doc.toString().contains("link"));
    }

    @Test
    public void testParse_baseTagWithoutHref_doesNotUpdateBaseUri() {
        String html = "<html><head><base target=\"_blank\"></head><body><p>text</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.toString().contains("text"));
    }

    @Test
    public void testParse_attributesWithSingleQuotes_parsedCorrectly() {
        String html = "<html><body><div id='myid'>content</div></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        String out = doc.toString();
        assertTrue(out.contains("myid"));
    }

    @Test
    public void testParse_attributesWithDoubleQuotes_parsedCorrectly() {
        String html = "<html><body><div id=\"myid\">content</div></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        String out = doc.toString();
        assertTrue(out.contains("myid"));
    }

    @Test
    public void testParse_attributesWithoutQuotes_parsedCorrectly() {
        String html = "<html><body><div id=myid>content</div></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        String out = doc.toString();
        assertTrue(out.contains("myid"));
    }

    @Test
    public void testParse_booleanAttributeWithoutValue_parsedCorrectly() {
        String html = "<html><body><input disabled></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        String out = doc.toString();
        assertTrue(out.contains("disabled"));
    }

    @Test
    public void testParse_nestedTags_maintainsHierarchy() {
        String html = "<html><body><div><p><span>deep text</span></p></div></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        String out = doc.toString();
        assertTrue(out.contains("deep text"));
    }

    @Test
    public void testParse_endTagWithoutMatchingStart_ignoredGracefully() {
        String html = "<html><body></span><p>content</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.toString().contains("content"));
    }

    @Test
    public void testParse_malformedStartTag_treatedAsText() {
        String html = "<html><body>< 1 is less than 2</body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
        String out = doc.toString();
        assertTrue(out.contains("1 is less than 2"));
    }

    @Test
    public void testParse_plainTextOnly_wrappedInHtml() {
        String html = "Just some plain text";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.toString().contains("Just some plain text"));
    }

    @Test
    public void testParse_impliedHtmlStructureWithoutTags_createsShell() {
        String html = "<p>no html or body wrapper</p>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.body());
        assertTrue(doc.toString().contains("no html or body wrapper"));
    }

    // ---------- parseBodyFragment tests ----------

    @Test
    public void testParseBodyFragment_normalFragment_parsedIntoBody() {
        String fragment = "<p>fragment content</p>";
        Document doc = Parser.parseBodyFragment(fragment, "http://example.com/");
        assertNotNull(doc);
        Element body = doc.body();
        assertNotNull(body);
        assertTrue(doc.toString().contains("fragment content"));
    }

    @Test
    public void testParseBodyFragment_emptyFragment_returnsShellDocument() {
        Document doc = Parser.parseBodyFragment("", "http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    @Test
    public void testParseBodyFragment_withMultipleElements_parsedCorrectly() {
        String fragment = "<div>one</div><div>two</div>";
        Document doc = Parser.parseBodyFragment(fragment, "http://example.com/");
        String out = doc.toString();
        assertTrue(out.contains("one"));
        assertTrue(out.contains("two"));
    }

    // ---------- Edge cases ----------

    @Test
    public void testParse_emptyString_returnsDocumentWithoutError() {
        Document doc = Parser.parse("", "http://example.com/");
        assertNotNull(doc);
    }

    @Test
    public void testParse_emptyBaseUri_doesNotThrow() {
        Document doc = Parser.parse("<html><body>text</body></html>", "");
        assertNotNull(doc);
    }

    @Test
    public void testParse_htmlWithOnlyWhitespace_doesNotThrow() {
        Document doc = Parser.parse("     ", "http://example.com/");
        assertNotNull(doc);
    }

    @Test
    public void testParse_unknownCharInAttributeParsing_handledGracefully() {
        // Forces parseAttribute() to hit the "unknown char" branch (key length == 0)
        String html = "<html><body><div =value>text</div></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.toString().contains("text"));
    }

    @Test
    public void testParse_multipleAttributes_allParsed() {
        String html = "<html><body><a href=\"http://test.com\" class='link' target=_blank>Link</a></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        String out = doc.toString();
        assertTrue(out.contains("href"));
        assertTrue(out.contains("class"));
        assertTrue(out.contains("target"));
    }

    // ---------- Exception cases ----------

    @Test(expected = IllegalArgumentException.class)
    public void testParse_nullHtml_throwsException() {
        Parser.parse(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_nullBaseUri_throwsException() {
        Parser.parse("<html></html>", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragment_nullHtml_throwsException() {
        Parser.parseBodyFragment(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragment_nullBaseUri_throwsException() {
        Parser.parseBodyFragment("<p>text</p>", null);
    }
}
