package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import static org.junit.Assert.*;

public class ParserTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParse_nullHtml_throwsException() {
        Parser.parse(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_nullBaseUri_throwsException() {
        Parser.parse("<div>test</div>", null);
    }

    @Test
    public void testParse_emptyHtml_returnsEmptyDocument() {
        Document doc = Parser.parse("", "http://example.com/");
        assertNotNull(doc);
        assertEquals("http://example.com/", doc.baseUri());
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_standardHtml_parsesTreeCorrectly() {
        String html = "<html><head><title>Test Title</title></head><body><p class=\"intro\">Hello world</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        assertEquals("Test Title", doc.title());
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertEquals("intro", p.attr("class"));
        assertEquals("Hello world", p.text());
    }

    @Test
    public void testParse_comments_normalAndShortEnd() {
        String html = "<div><!-- Standard comment --><span><!-- Short comment-></span></div>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element div = doc.select("div").first();
        assertNotNull(div);
        
        Comment comment1 = (Comment) div.childNode(0);
        assertEquals(" Standard comment ", comment1.getData());
        
        Element span = doc.select("span").first();
        Comment comment2 = (Comment) span.childNode(0);
        assertEquals(" Short comment", comment2.getData());
    }

    @Test
    public void testParse_xmlDeclarationsAndDoctype() {
        String html = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><!DOCTYPE html><html><body>Test</body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        boolean foundXmlDecl = false;
        boolean foundDocType = false;
        for (org.jsoup.nodes.Node node : doc.childNodes()) {
            if (node instanceof XmlDeclaration) {
                XmlDeclaration decl = (XmlDeclaration) node;
                if (!decl.isProcessingInstruction()) {
                    foundXmlDecl = true;
                } else {
                    foundDocType = true;
                }
            }
        }
        assertTrue(foundXmlDecl);
        assertTrue(foundDocType);
    }

    @Test
    public void testParse_cdataSection() {
        String html = "<div><![CDATA[some <unescaped> & raw text]]></div>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals(1, div.childNodeSize());
        assertTrue(div.childNode(0) instanceof TextNode);
        assertEquals("some <unescaped> & raw text", ((TextNode) div.childNode(0)).getWholeText());
    }

    @Test
    public void testParse_textNodeWithBareLessThan() {
        String html = "<p>One < Two < Three</p>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertEquals("One < Two < Three", p.text());
    }

    @Test
    public void testParse_attributesQuotesVariants() {
        String html = "<div single='val1' double=\"val2\" unquoted=val3 boolattr>content</div>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("val1", div.attr("single"));
        assertEquals("val2", div.attr("double"));
        assertEquals("val3", div.attr("unquoted"));
        assertTrue(div.hasAttr("boolattr"));
    }

    @Test
    public void testParse_malformedAttributesHandledGracefully() {
        String html = "<div =invalid attr=\"value\" =>content</div>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("value", div.attr("attr"));
    }

    @Test
    public void testParse_selfClosingTags_knownAndUnknown() {
        String html = "<div><img src=\"test.jpg\"/><custom-tag id=\"1\"/><custom-tag id=\"2\"></custom-tag></div>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element img = doc.select("img").first();
        assertNotNull(img);
        assertEquals("test.jpg", img.attr("src"));
        
        Element custom1 = doc.select("custom-tag#1").first();
        assertNotNull(custom1);
        
        Element custom2 = doc.select("custom-tag#2").first();
        assertNotNull(custom2);
    }

    @Test
    public void testParse_dataTags_scriptAndStyle() {
        String html = "<script>var x = \"<test>\"; alert(x);</script><style>body > div { color: red; }</style>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element script = doc.select("script").first();
        assertNotNull(script);
        assertTrue(script.childNode(0) instanceof DataNode);
        assertEquals("var x = \"<test>\"; alert(x);", ((DataNode) script.childNode(0)).getWholeData());
        
        Element style = doc.select("style").first();
        assertNotNull(style);
        assertTrue(style.childNode(0) instanceof DataNode);
    }

    @Test
    public void testParse_titleAndTextarea_parsedAsTextNodes() {
        String html = "<title>Hello &amp; World</title><textarea>First &amp; Second</textarea>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element title = doc.select("title").first();
        assertNotNull(title);
        assertEquals("Hello & World", title.text());
        assertTrue(title.childNode(0) instanceof TextNode);
        
        Element textarea = doc.select("textarea").first();
        assertNotNull(textarea);
        assertEquals("First & Second", textarea.text());
        assertTrue(textarea.childNode(0) instanceof TextNode);
    }

    @Test
    public void testParse_baseTagUpdatesBaseUri() {
        String html = "<html><head><base href=\"http://jsoup.org/path/\"><base target=\"_blank\"></head><body><a href=\"sub\">Link</a></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        assertEquals("http://jsoup.org/path/", doc.baseUri());
        Element a = doc.select("a").first();
        assertNotNull(a);
        assertEquals("http://jsoup.org/path/sub", a.absUrl("href"));
    }

    @Test
    public void testParse_implicitTagCreation_tablesAndStructure() {
        String html = "<tr><td>Cell 1</td></tr>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element table = doc.select("table").first();
        assertNotNull(table);
        Element tr = table.select("tr").first();
        assertNotNull(tr);
        Element td = tr.select("td").first();
        assertNotNull(td);
        assertEquals("Cell 1", td.text());
    }

    @Test
    public void testParse_implicitHeadCreatedBeforeBody() {
        String html = "<body><p>Text</p></body>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("Text", doc.body().select("p").text());
    }

    @Test
    public void testParse_endTag_emptyOrMismatched() {
        String html = "<div><p>Paragraph</></p></span></div>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertEquals("Paragraph", p.text());
    }

    @Test
    public void testParse_closingPastBodyAndHtmlIgnored() {
        String html = "<html><body><div>Content</div></body></html></div>";
        Document doc = Parser.parse(html, "http://example.com/");
        
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("Content", div.text());
    }

    @Test
    public void testParseBodyFragment_standard() {
        String html = "<p>Fragment text</p>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        
        assertNotNull(doc.body());
        assertEquals("Fragment text", doc.body().select("p").text());
    }

    @Test
    public void testParseBodyFragmentRelaxed_doesNotCreateImplicitParents() {
        String html = "<td>Lone Cell</td>";
        Document docRelaxed = Parser.parseBodyFragmentRelaxed(html, "http://example.com/");
        Document docStrict = Parser.parseBodyFragment(html, "http://example.com/");
        
        assertNull(docRelaxed.body().select("table").first());
        assertNotNull(docStrict.body().select("table").first());
        assertEquals("Lone Cell", docRelaxed.body().text());
    }

    @Test
    public void testParse_unclosedTagsNested() {
        String html = "<p>First <p>Second <div>Inside div";
        Document doc = Parser.parse(html, "http://example.com/");
        
        assertEquals(2, doc.select("p").size());
        assertEquals(1, doc.select("div").size());
    }
}
