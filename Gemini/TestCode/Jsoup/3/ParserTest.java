package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void testParse_simpleHtml_createsDocument() {
        String html = "<html><head><title>Test Title</title></head><body><p>Hello World</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        assertNotNull(doc);
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World", doc.select("p").first().text());
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testParseBodyFragment_snippet_parsedIntoBody() {
        String fragment = "<div><span>Fragment Text</span></div>";
        Document doc = Parser.parseBodyFragment(fragment, "http://example.com/");
        
        assertNotNull(doc);
        assertNotNull(doc.body());
        assertEquals("Fragment Text", doc.body().select("span").text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_nullHtml_throwsException() {
        Parser.parse(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_nullBaseUri_throwsException() {
        Parser.parse("<p>Test</p>", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragment_nullHtml_throwsException() {
        Parser.parseBodyFragment(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragment_nullBaseUri_throwsException() {
        Parser.parseBodyFragment("<p>Test</p>", null);
    }

    @Test
    public void testParse_emptyString_createsEmptyDocument() {
        Document doc = Parser.parse("", "http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.body());
        assertEquals(0, doc.body().children().size());
    }

    @Test
    public void testParse_commentWithFullDashes_parsedCorrectly() {
        String html = "<!-- this is a comment -->";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        
        assertEquals(1, doc.body().childNodeSize());
        assertTrue(doc.body().childNode(0) instanceof Comment);
        Comment comment = (Comment) doc.body().childNode(0);
        assertEquals(" this is a comment ", comment.getData());
    }

    @Test
    public void testParse_commentShortTermination_parsedCorrectly() {
        String html = "<!-- this is a comment ->";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        
        assertEquals(1, doc.body().childNodeSize());
        assertTrue(doc.body().childNode(0) instanceof Comment);
        Comment comment = (Comment) doc.body().childNode(0);
        assertEquals(" this is a comment ", comment.getData());
    }

    @Test
    public void testParse_cdataSection_parsedAsTextNode() {
        String html = "<![CDATA[<unescaped & raw text>]]>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        
        assertEquals(1, doc.body().childNodeSize());
        assertTrue(doc.body().childNode(0) instanceof TextNode);
        TextNode textNode = (TextNode) doc.body().childNode(0);
        assertEquals("<unescaped & raw text>", textNode.getWholeText());
    }

    @Test
    public void testParse_xmlDeclarationAndDocType_parsedCorrectly() {
        String html = "<?xml version=\"1.0\" encoding=\"utf-8\"?><!DOCTYPE html>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        boolean foundXml = false;
        boolean foundDocType = false;
        for (int i = 0; i < doc.childNodeSize(); i++) {
            if (doc.childNode(i) instanceof XmlDeclaration) {
                XmlDeclaration decl = (XmlDeclaration) doc.childNode(i);
                if (decl.getWholeDeclaration().startsWith("xml")) {
                    foundXml = true;
                } else if (decl.getWholeDeclaration().startsWith("DOCTYPE")) {
                    foundDocType = true;
                }
            }
        }
        assertTrue(foundXml);
        assertTrue(foundDocType);
    }

    @Test
    public void testParse_startTagWithoutName_parsedAsText() {
        String html = "< 5 is less than 6 and <>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        
        assertTrue(doc.body().text().contains("< 5 is less than 6 and"));
    }

    @Test
    public void testParse_emptyEndTag_ignoredGracefully() {
        String html = "<p>Text</>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        
        assertEquals("Text", doc.body().text());
    }

    @Test
    public void testParse_endTagNotMatching_ignored() {
        String html = "<div><p>Text</div></p>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        
        assertEquals("Text", doc.body().text());
    }

    @Test
    public void testParse_attributesParsing_singleDoubleAndUnquoted() {
        String html = "<a href='http://single.com' title=\"double quoted\" id=unquoted target = blank selected>Link</a>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        
        Element link = doc.select("a").first();
        assertNotNull(link);
        assertEquals("http://single.com", link.attr("href"));
        assertEquals("double quoted", link.attr("title"));
        assertEquals("unquoted", link.attr("id"));
        assertEquals("blank", link.attr("target"));
        assertTrue(link.hasAttr("selected"));
    }

    @Test
    public void testParse_attributesWithInvalidCharacters_skipsInvalid() {
        String html = "<div =foo key='val' @! bar=baz>Text</div>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("val", div.attr("key"));
        assertEquals("baz", div.attr("bar"));
    }

    @Test
    public void testParse_selfClosingAndEmptyTags_parsedCorrectly() {
        String html = "<img src='img.png'/><br><hr/><div><span/></div>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        
        assertEquals(1, doc.select("img").size());
        assertEquals(1, doc.select("br").size());
        assertEquals(1, doc.select("hr").size());
        assertEquals(1, doc.select("span").size());
    }

    @Test
    public void testParse_dataTags_titleAndTextareaAsTextNode() {
        String html = "<title>Some <b>HTML</b> &amp; text</title><textarea>Inside &amp; <i>textarea</i></textarea>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element title = doc.select("title").first();
        assertEquals("Some <b>HTML</b> & text", title.text());
        assertEquals(0, title.children().size());

        Element textarea = doc.select("textarea").first();
        assertEquals("Inside & <i>textarea</i>", textarea.text());
        assertEquals(0, textarea.children().size());
    }

    @Test
    public void testParse_dataTags_scriptAndStyleAsDataNode() {
        String html = "<script>var a = \"1\" < 2 && 3 > 2;</script><style>body { color: red; }</style>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        
        Element script = doc.select("script").first();
        assertEquals(1, script.childNodeSize());
        assertTrue(script.childNode(0) instanceof DataNode);
        assertEquals("var a = \"1\" < 2 && 3 > 2;", ((DataNode) script.childNode(0)).getWholeData());

        Element style = doc.select("style").first();
        assertEquals(1, style.childNodeSize());
        assertTrue(style.childNode(0) instanceof DataNode);
        assertEquals("body { color: red; }", ((DataNode) style.childNode(0)).getWholeData());
    }

    @Test
    public void testParse_baseTagUpdatesDocumentBaseUri() {
        String html = "<html><head><base href='http://newbase.com/path/'><base target='_blank'></head><body><a href='sub'>Link</a></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        assertEquals("http://newbase.com/path/", doc.baseUri());
        Element link = doc.select("a").first();
        assertEquals("http://newbase.com/path/sub", link.absUrl("href"));
    }

    @Test
    public void testParse_implicitParentCreation_tableElements() {
        String html = "<td>Cell 1</td><td>Cell 2</td>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        
        assertEquals(1, doc.select("table").size());
        assertEquals(1, doc.select("tr").size());
        assertEquals(2, doc.select("td").size());
    }

    @Test
    public void testParse_bodyTagInDocument_createsImplicitHead() {
        String html = "<body><p>Direct Body Content</p></body>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("Direct Body Content", doc.body().select("p").text());
    }

    @Test
    public void testParse_nestedElementsClosingStack() {
        String html = "<div><p><span>First</span></p><p>Second</p></div>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        
        Element div = doc.select("div").first();
        assertEquals(2, div.children().size());
        assertEquals("First", div.child(0).text());
        assertEquals("Second", div.child(1).text());
    }

    @Test
    public void testParse_popStackPastBodyPrevented() {
        String html = "<html><body></div><p>Valid</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        assertEquals("Valid", doc.select("p").text());
    }
}
