package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import org.junit.Test;
import org.junit.Before;

import java.util.List;

import static org.junit.Assert.*;

public class ParserTest {

    private Parser parser;

    @Before
    public void setUp() {
        parser = new Parser(new HtmlTreeBuilder());
    }

    // Constructor test
    @Test
    public void testConstructor_withTreeBuilder_setsTreeBuilder() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser p = new Parser(tb);
        assertSame(tb, p.getTreeBuilder());
    }

    // getTreeBuilder / setTreeBuilder
    @Test
    public void testGetTreeBuilder_afterConstruction_returnsSameInstance() {
        assertNotNull(parser.getTreeBuilder());
        assertTrue(parser.getTreeBuilder() instanceof HtmlTreeBuilder);
    }

    @Test
    public void testSetTreeBuilder_withNewBuilder_updatesTreeBuilderAndReturnsThis() {
        XmlTreeBuilder xmlBuilder = new XmlTreeBuilder();
        Parser returned = parser.setTreeBuilder(xmlBuilder);
        assertSame(parser, returned);
        assertSame(xmlBuilder, parser.getTreeBuilder());
    }

    // isTrackErrors / setTrackErrors
    @Test
    public void testIsTrackErrors_defaultState_returnsFalse() {
        assertFalse(parser.isTrackErrors());
    }

    @Test
    public void testSetTrackErrors_withPositiveValue_enablesTracking() {
        Parser returned = parser.setTrackErrors(10);
        assertSame(parser, returned);
        assertTrue(parser.isTrackErrors());
    }

    @Test
    public void testSetTrackErrors_withZero_disablesTracking() {
        parser.setTrackErrors(0);
        assertFalse(parser.isTrackErrors());
    }

    @Test
    public void testSetTrackErrors_withNegativeValue_disablesTracking() {
        parser.setTrackErrors(-5);
        assertFalse(parser.isTrackErrors());
    }

    // getErrors
    @Test
    public void testGetErrors_beforeParse_returnsNull() {
        assertNull(parser.getErrors());
    }

    @Test
    public void testGetErrors_afterParseWithTrackingDisabled_returnsEmptyList() {
        parser.parseInput("<html><body>hello</body></html>", "http://example.com/");
        List<ParseError> errors = parser.getErrors();
        assertNotNull(errors);
        assertEquals(0, errors.size());
    }

    @Test
    public void testGetErrors_afterParseWithTrackingEnabled_returnsListPossiblyWithErrors() {
        parser.setTrackErrors(10);
        parser.parseInput("<html><body><div>test</div></body></html>", "http://example.com/");
        List<ParseError> errors = parser.getErrors();
        assertNotNull(errors);
    }

    // parseInput
    @Test
    public void testParseInput_withNormalHtml_returnsDocumentWithExpectedContent() {
        Document doc = parser.parseInput("<html><head><title>Test</title></head><body><p>Hello</p></body></html>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.select("p").text());
    }

    @Test
    public void testParseInput_withEmptyString_returnsValidDocument() {
        Document doc = parser.parseInput("", "http://example.com/");
        assertNotNull(doc);
    }

    @Test
    public void testParseInput_withEmptyBaseUri_returnsValidDocument() {
        Document doc = parser.parseInput("<p>Hello</p>", "");
        assertNotNull(doc);
        assertEquals("Hello", doc.select("p").text());
    }

    @Test
    public void testParseInput_withTrackingEnabled_populatesErrorsList() {
        parser.setTrackErrors(10);
        Document doc = parser.parseInput("<html><body><p>test</p></body></html>", "http://example.com/");
        assertNotNull(doc);
        assertNotNull(parser.getErrors());
    }

    // static parse(String, String)
    @Test
    public void testParse_withNormalHtml_returnsParsedDocument() {
        Document doc = Parser.parse("<html><body><p>Static Parse</p></body></html>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Static Parse", doc.select("p").text());
    }

    @Test
    public void testParse_withEmptyHtml_returnsValidDocument() {
        Document doc = Parser.parse("", "http://example.com/");
        assertNotNull(doc);
    }

    @Test
    public void testParse_withEmptyBaseUri_returnsValidDocument() {
        Document doc = Parser.parse("<p>Text</p>", "");
        assertNotNull(doc);
        assertEquals("Text", doc.select("p").text());
    }

    // parseFragment
    @Test
    public void testParseFragment_withNormalHtmlAndContext_returnsNodeList() {
        Document doc = Document.createShell("http://example.com/");
        Element context = doc.body();
        List<Node> nodes = Parser.parseFragment("<p>Fragment</p>", context, "http://example.com/");
        assertNotNull(nodes);
        assertTrue(nodes.size() > 0);
    }

    @Test
    public void testParseFragment_withNullContext_returnsNodeList() {
        List<Node> nodes = Parser.parseFragment("<p>Fragment</p>", null, "http://example.com/");
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragment_withEmptyFragmentHtml_returnsEmptyOrValidList() {
        Document doc = Document.createShell("http://example.com/");
        Element context = doc.body();
        List<Node> nodes = Parser.parseFragment("", context, "http://example.com/");
        assertNotNull(nodes);
    }

    // parseBodyFragment
    @Test
    public void testParseBodyFragment_withNormalHtml_returnsDocumentWithBodyContent() {
        Document doc = Parser.parseBodyFragment("<p>Body Fragment</p>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Body Fragment", doc.select("p").text());
        assertNotNull(doc.body());
    }

    @Test
    public void testParseBodyFragment_withEmptyBodyHtml_returnsDocumentWithEmptyBody() {
        Document doc = Parser.parseBodyFragment("", "http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    @Test
    public void testParseBodyFragment_withEmptyBaseUri_returnsValidDocument() {
        Document doc = Parser.parseBodyFragment("<div>Content</div>", "");
        assertNotNull(doc);
        assertEquals("Content", doc.select("div").text());
    }

    // parseBodyFragmentRelaxed (deprecated)
    @Test
    public void testParseBodyFragmentRelaxed_withNormalHtml_returnsParsedDocument() {
        Document doc = Parser.parseBodyFragmentRelaxed("<p>Relaxed</p>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Relaxed", doc.select("p").text());
    }

    @Test
    public void testParseBodyFragmentRelaxed_withEmptyHtml_returnsValidDocument() {
        Document doc = Parser.parseBodyFragmentRelaxed("", "http://example.com/");
        assertNotNull(doc);
    }

    // htmlParser
    @Test
    public void testHtmlParser_createsNewParserWithHtmlTreeBuilder() {
        Parser p = Parser.htmlParser();
        assertNotNull(p);
        assertTrue(p.getTreeBuilder() instanceof HtmlTreeBuilder);
    }

    // xmlParser
    @Test
    public void testXmlParser_createsNewParserWithXmlTreeBuilder() {
        Parser p = Parser.xmlParser();
        assertNotNull(p);
        assertTrue(p.getTreeBuilder() instanceof XmlTreeBuilder);
    }

    // Additional edge case: parsing malformed html should not throw
    @Test
    public void testParseInput_withMalformedHtml_doesNotThrowAndReturnsDocument() {
        Document doc = parser.parseInput("<html><body><p>Unclosed", "http://example.com/");
        assertNotNull(doc);
    }

    @Test
    public void testXmlParser_parseInput_returnsDocument() {
        Parser xmlParser = Parser.xmlParser();
        Document doc = xmlParser.parseInput("<root><child>text</child></root>", "http://example.com/");
        assertNotNull(doc);
    }
}
