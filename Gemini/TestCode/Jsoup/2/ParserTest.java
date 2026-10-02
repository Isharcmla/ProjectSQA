package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void parse_basicDocument_success() {
        String html = "<html><head><title>Test Title</title></head><body><p>Hello World</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        assertNotNull(doc);
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World", doc.select("p").first().text());
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void parse_emptyHtml_createsEmptyDoc() {
        Document doc = Parser.parse("", "http://example.com/");
        assertNotNull(doc);
        assertEquals("", doc.body().html());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_nullHtml_throwsException() {
        Parser.parse(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_nullBaseUri_throwsException() {
        Parser.parse("<div>test</div>", null);
    }

    @Test
    public void parseBodyFragment_basicFragment_parsedIntoBody() {
        String html = "<div><p>Fragment content</p></div>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        
        assertNotNull(doc);
        assertEquals(1, doc.body().children().size());
        assertEquals("Fragment content", doc.select("p").first().text());
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseBodyFragment_nullHtml_throwsException() {
        Parser.parseBodyFragment(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseBodyFragment_nullBaseUri_throwsException() {
        Parser.parseBodyFragment("<div>test</div>", null);
    }

    @Test
    public void parse_comments_handledCorrectly() {
        String html = "<!-- Normal comment --><div><!-- Partial comment -></div>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        assertEquals(1, doc.select("div").size());
        assertEquals(2, doc.body().childNodeSize());
    }

    @Test
    public void parse_cdata_handledCorrectly() {
        String html = "<div><![CDATA[Some <raw> & unescaped text]]></div>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals(1, div.childNodeSize());
        assertTrue(div.childNode(0) instanceof TextNode);
        assertEquals("Some <raw> & unescaped text", ((TextNode) div.childNode(0)).getWholeText());
    }

    @Test
    public void parse_xmlDeclarationsAndDocType_handledCorrectly() {
        String html = "<!DOCTYPE html><?xml version=\"1.0\" encoding=\"UTF-8\"?><div>Content</div>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        assertNotNull(doc);
        assertEquals("Content", doc.select("div").text());
    }

    @Test
    public void parse_attributesQuotesAndUnquoted_handledCorrectly() {
        String html = "<div id='single' class=\"double\" data-val=unquoted attr1 attr2=\"\">Test</div>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("single", div.attr("id"));
        assertEquals("double", div.attr("class"));
        assertEquals("unquoted", div.attr("data-val"));
        assertTrue(div.hasAttr("attr1"));
        assertTrue(div.hasAttr("attr2"));
    }

    @Test
    public void parse_malformedAttributeWithoutKey_handledSafely() {
        String html = "<div =value ?notKey attr=\"val\">Text</div>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("val", div.attr("attr"));
    }

    @Test
    public void parse_selfClosingAndEmptyTags_handledCorrectly() {
        String html = "<div><img src=\"test.jpg\"/><br><input type=\"text\"/></div><div />";
        Document doc = Parser.parse(html, "http://example.com/");
        
        assertEquals(2, doc.body().children().size());
        assertEquals(1, doc.select("img").size());
        assertEquals(1, doc.select("br").size());
        assertEquals(1, doc.select("input").size());
    }

    @Test
    public void parse_dataTagsScriptTextareaTitle_handledCorrectly() {
        String html = "<script>var x = \"<test>\";</script><textarea><p>unescaped &amp; text</p></textarea><title>My Title &amp;</title>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element script = doc.select("script").first();
        assertNotNull(script);
        assertEquals("var x = \"<test>\";", script.data());

        Element textarea = doc.select("textarea").first();
        assertNotNull(textarea);
        assertEquals("<p>unescaped & text</p>", textarea.text());

        assertEquals("My Title &", doc.title());
    }

    @Test
    public void parse_baseTagHrefUpdate_updatesBaseUri() {
        String html = "<base href=\"http://example.com/sub/dir/\"><a href=\"link.html\">Link</a>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        assertEquals("http://example.com/sub/dir/", doc.baseUri());
        assertEquals("http://example.com/sub/dir/link.html", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void parse_baseTagWithoutHref_doesNotUpdateBaseUri() {
        String html = "<base target=\"_blank\"><a href=\"link.html\">Link</a>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void parse_loneAngleBracket_treatedAsText() {
        String html = "<div> < 3 and > 2 <</div>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("< 3 and > 2 <", div.text());
    }

    @Test
    public void parse_implicitParentsAndHierarchy_handledCorrectly() {
        String html = "<body><td>Cell</td><li>Item</li></body>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        assertNotNull(doc.select("table").first());
        assertNotNull(doc.select("td").first());
        assertNotNull(doc.select("li").first());
    }

    @Test
    public void parse_unmatchedOrMisnestedEndTags_handledCorrectly() {
        String html = "</div></p><div><span>Text</div></span>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        assertNotNull(doc.body());
        assertEquals("Text", doc.select("span").text());
    }

    @Test
    public void parse_emptyEndTag_ignoredGracefully() {
        String html = "<div>Text</></div>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("Text", div.text());
    }
}
