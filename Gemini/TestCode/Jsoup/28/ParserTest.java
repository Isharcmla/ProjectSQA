package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void testConstructor_setsTreeBuilder() {
        TreeBuilder treeBuilder = new HtmlTreeBuilder();
        Parser parser = new Parser(treeBuilder);
        assertSame(treeBuilder, parser.getTreeBuilder());
    }

    @Test
    public void testSetTreeBuilder_updatesTreeBuilderAndReturnsThis() {
        Parser parser = Parser.htmlParser();
        TreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Parser returnedParser = parser.setTreeBuilder(xmlTreeBuilder);

        assertSame(parser, returnedParser);
        assertSame(xmlTreeBuilder, parser.getTreeBuilder());
    }

    @Test
    public void testIsTrackErrors_defaultIsFalse() {
        Parser parser = Parser.htmlParser();
        assertFalse(parser.isTrackErrors());
        assertNull(parser.getErrors());
    }

    @Test
    public void testSetTrackErrors_positiveValueEnablesTracking() {
        Parser parser = Parser.htmlParser();
        Parser returned = parser.setTrackErrors(10);

        assertSame(parser, returned);
        assertTrue(parser.isTrackErrors());
    }

    @Test
    public void testSetTrackErrors_zeroAndNegativeDisablesTracking() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        assertTrue(parser.isTrackErrors());

        parser.setTrackErrors(0);
        assertFalse(parser.isTrackErrors());

        parser.setTrackErrors(-1);
        assertFalse(parser.isTrackErrors());
    }

    @Test
    public void testParseInput_withoutTracking_errorsEmpty() {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(0);

        Document doc = parser.parseInput("<html><head><title>Test</title></head><body><p>Hello</p></body></html>", "http://example.com");

        assertNotNull(doc);
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.select("p").text());
        assertNotNull(parser.getErrors());
        assertEquals(0, parser.getErrors().size());
    }

    @Test
    public void testParseInput_withTracking_recordsErrors() {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(100);

        Document doc = parser.parseInput("<p>One</b><p>Two", "http://example.com");

        assertNotNull(doc);
        assertTrue(parser.isTrackErrors());
        List<ParseError> errors = parser.getErrors();
        assertNotNull(errors);
        assertFalse(errors.isEmpty());
    }

    @Test
    public void testParseInput_emptyHtmlAndEmptyBaseUri() {
        Parser parser = Parser.htmlParser();
        Document doc = parser.parseInput("", "");
        assertNotNull(doc);
        assertEquals("", doc.body().html());
    }

    @Test
    public void testStaticParse_validHtml() {
        Document doc = Parser.parse("<div id='content'><p>Hello World</p></div>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Hello World", doc.select("#content p").text());
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testStaticParse_emptyString() {
        Document doc = Parser.parse("", "");
        assertNotNull(doc);
        assertEquals("", doc.body().html());
    }

    @Test
    public void testParseFragment_withContextElement() {
        Element context = new Element("div");
        List<Node> nodes = Parser.parseFragment("<p>One</p><p>Two</p>", context, "http://example.com");

        assertEquals(2, nodes.size());
        assertEquals("p", nodes.get(0).nodeName());
        assertEquals("p", nodes.get(1).nodeName());
    }

    @Test
    public void testParseFragment_withNullContext() {
        List<Node> nodes = Parser.parseFragment("<div><p>Sample</p></div>", null, "http://example.com");

        assertFalse(nodes.isEmpty());
        assertEquals("html", nodes.get(0).nodeName());
    }

    @Test
    public void testParseFragment_emptyHtml() {
        Element context = new Element("div");
        List<Node> nodes = Parser.parseFragment("", context, "");

        assertTrue(nodes.isEmpty());
    }

    @Test
    public void testParseBodyFragment_createsBodyNodes() {
        Document doc = Parser.parseBodyFragment("<p>Paragraph 1</p><span>Span 1</span>", "http://example.com");

        assertNotNull(doc);
        assertEquals("http://example.com", doc.baseUri());
        assertEquals(2, doc.body().children().size());
        assertEquals("Paragraph 1", doc.body().child(0).text());
        assertEquals("Span 1", doc.body().child(1).text());
    }

    @Test
    public void testParseBodyFragment_emptyString() {
        Document doc = Parser.parseBodyFragment("", "http://example.com");

        assertNotNull(doc);
        assertEquals(0, doc.body().children().size());
    }

    @Test
    public void testParseBodyFragmentRelaxed_parsesValidHtml() {
        Document doc = Parser.parseBodyFragmentRelaxed("<div><span>Relaxed test</span></div>", "http://example.com");

        assertNotNull(doc);
        assertEquals("Relaxed test", doc.select("div span").text());
    }

    @Test
    public void testHtmlParser_createsParserWithHtmlTreeBuilder() {
        Parser parser = Parser.htmlParser();
        assertNotNull(parser);
        assertTrue(parser.getTreeBuilder() instanceof HtmlTreeBuilder);
    }

    @Test
    public void testXmlParser_createsParserWithXmlTreeBuilder() {
        Parser parser = Parser.xmlParser();
        assertNotNull(parser);
        assertTrue(parser.getTreeBuilder() instanceof XmlTreeBuilder);

        Document doc = parser.parseInput("<xml><child id='1'/></xml>", "http://example.com");
        assertEquals("xml", doc.child(0).nodeName());
        assertEquals("child", doc.child(0).child(0).nodeName());
    }
}
