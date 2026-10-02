package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ParserTest {

    @Test
    public void testConstructor_withHtmlTreeBuilder_initializesCorrectly() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        Parser parser = new Parser(htmlTreeBuilder);

        assertSame(htmlTreeBuilder, parser.getTreeBuilder());
        assertNotNull(parser.settings());
        assertFalse(parser.isTrackErrors());
        assertNull(parser.getErrors());
    }

    @Test
    public void testSetTreeBuilder_customTreeBuilder_updatesSuccessfully() {
        Parser parser = Parser.htmlParser();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

        Parser returnedParser = parser.setTreeBuilder(xmlTreeBuilder);

        assertSame(parser, returnedParser);
        assertSame(xmlTreeBuilder, parser.getTreeBuilder());
    }

    @Test
    public void testSetTrackErrors_variousLimits_updatesStateProperly() {
        Parser parser = Parser.htmlParser();

        parser.setTrackErrors(10);
        assertTrue(parser.isTrackErrors());

        parser.setTrackErrors(0);
        assertFalse(parser.isTrackErrors());

        parser.setTrackErrors(-1);
        assertFalse(parser.isTrackErrors());
    }

    @Test
    public void testSettings_getterAndSetter_updatesCorrectly() {
        Parser parser = Parser.htmlParser();
        ParseSettings customSettings = new ParseSettings(true, true);

        Parser returnedParser = parser.settings(customSettings);

        assertSame(parser, returnedParser);
        assertSame(customSettings, parser.settings());
    }

    @Test
    public void testParseInput_withoutTrackingErrors_returnsDocumentAndEmptyErrors() {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(0);

        Document doc = parser.parseInput("<div><p>Hello</div>", "http://example.com");

        assertNotNull(doc);
        assertEquals("Hello", doc.select("div > p").text());
        assertNotNull(parser.getErrors());
        assertEquals(0, parser.getErrors().size());
    }

    @Test
    public void testParseInput_withTrackingErrors_recordsErrors() {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(10);

        Document doc = parser.parseInput("<html><head></head><body><div><span></div></span></body></html>", "http://example.com");

        assertNotNull(doc);
        assertNotNull(parser.getErrors());
        assertTrue(parser.getErrors().size() > 0);
    }

    @Test
    public void testParseInput_emptyString_returnsValidDocument() {
        Parser parser = Parser.htmlParser();
        Document doc = parser.parseInput("", "http://example.com");

        assertNotNull(doc);
        assertEquals(0, doc.body().children().size());
    }

    @Test
    public void testStaticParse_standardHtml_returnsParsedDocument() {
        Document doc = Parser.parse("<p id='test'>Sample</p>", "http://example.com");

        assertNotNull(doc);
        assertEquals("Sample", doc.getElementById("test").text());
        assertEquals("http://example.com", doc.baseUri());
    }

    @Test
    public void testStaticParseFragment_withContext_returnsNodeList() {
        Element context = new Element("div");
        List<Node> nodes = Parser.parseFragment("<span>Item 1</span><span>Item 2</span>", context, "http://example.com");

        assertNotNull(nodes);
        assertEquals(2, nodes.size());
        assertEquals("span", nodes.get(0).nodeName());
        assertEquals("span", nodes.get(1).nodeName());
    }

    @Test
    public void testStaticParseFragment_nullContext_returnsNodeList() {
        List<Node> nodes = Parser.parseFragment("<p>Paragraph</p>", null, "http://example.com");

        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testStaticParseFragment_emptyString_returnsEmptyList() {
        Element context = new Element("div");
        List<Node> nodes = Parser.parseFragment("", context, "http://example.com");

        assertNotNull(nodes);
        assertEquals(0, nodes.size());
    }

    @Test
    public void testStaticParseXmlFragment_validXml_returnsXmlNodes() {
        List<Node> nodes = Parser.parseXmlFragment("<custom><child>val</child></custom>", "http://example.com");

        assertNotNull(nodes);
        assertEquals(1, nodes.size());
        assertEquals("custom", nodes.get(0).nodeName());
    }

    @Test
    public void testStaticParseXmlFragment_emptyXml_returnsEmptyList() {
        List<Node> nodes = Parser.parseXmlFragment("", "http://example.com");

        assertNotNull(nodes);
        assertEquals(0, nodes.size());
    }

    @Test
    public void testStaticParseBodyFragment_multipleChildren_appendsAllToBody() {
        String html = "<p>First</p><p>Second</p><p>Third</p>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com");

        assertNotNull(doc);
        assertEquals(3, doc.body().children().size());
        assertEquals("First", doc.body().child(0).text());
        assertEquals("Second", doc.body().child(1).text());
        assertEquals("Third", doc.body().child(2).text());
    }

    @Test
    public void testStaticParseBodyFragment_singleChild_appendsToBody() {
        String html = "<div>Single</div>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com");

        assertNotNull(doc);
        assertEquals(1, doc.body().children().size());
        assertEquals("Single", doc.body().child(0).text());
    }

    @Test
    public void testStaticParseBodyFragment_emptyHtml_createsEmptyBody() {
        Document doc = Parser.parseBodyFragment("", "http://example.com");

        assertNotNull(doc);
        assertNotNull(doc.body());
        assertEquals(0, doc.body().children().size());
    }

    @Test
    public void testUnescapeEntities_inAttributeTrue_unescapesCorrectly() {
        String input = "&lt;&gt;&amp;&quot;&apos;&nbsp;";
        String unescaped = Parser.unescapeEntities(input, true);

        assertEquals("<>&\"'\u00a0", unescaped);
    }

    @Test
    public void testUnescapeEntities_inAttributeFalse_unescapesCorrectly() {
        String input = "&lt;&gt;&amp;&quot;&apos;&nbsp;";
        String unescaped = Parser.unescapeEntities(input, false);

        assertEquals("<>&\"'\u00a0", unescaped);
    }

    @Test
    public void testUnescapeEntities_plainText_returnsUnchanged() {
        String input = "Plain text without entities";
        String unescaped = Parser.unescapeEntities(input, false);

        assertEquals(input, unescaped);
    }

    @Test
    public void testParseBodyFragmentRelaxed_standardHtml_parsesSuccessfully() {
        Document doc = Parser.parseBodyFragmentRelaxed("<div>Relaxed Parse</div>", "http://example.com");

        assertNotNull(doc);
        assertEquals("Relaxed Parse", doc.select("div").text());
    }

    @Test
    public void testHtmlParser_factoryMethod_createsHtmlParserInstance() {
        Parser parser = Parser.htmlParser();

        assertNotNull(parser);
        assertTrue(parser.getTreeBuilder() instanceof HtmlTreeBuilder);
        assertFalse(parser.isTrackErrors());
    }

    @Test
    public void testXmlParser_factoryMethod_createsXmlParserInstance() {
        Parser parser = Parser.xmlParser();

        assertNotNull(parser);
        assertTrue(parser.getTreeBuilder() instanceof XmlTreeBuilder);
        assertFalse(parser.isTrackErrors());
    }
}
