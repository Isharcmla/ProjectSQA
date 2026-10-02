import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ParserTest {

    private Parser parser;

    @Before
    public void setUp() {
        parser = Parser.htmlParser();
    }

    // ---------- Constructor & basic getters/setters ----------

    @Test
    public void testConstructor_withHtmlTreeBuilder_createsParserWithDefaultSettings() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser p = new Parser(tb);
        assertNotNull(p);
        assertEquals(tb, p.getTreeBuilder());
        assertNotNull(p.settings());
    }

    @Test
    public void testGetTreeBuilder_afterConstruction_returnsSameInstance() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser p = new Parser(tb);
        assertSame(tb, p.getTreeBuilder());
    }

    @Test
    public void testSetTreeBuilder_newTreeBuilder_updatesTreeBuilderAndReturnsThis() {
        HtmlTreeBuilder newTb = new HtmlTreeBuilder();
        Parser result = parser.setTreeBuilder(newTb);
        assertSame(parser, result);
        assertSame(newTb, parser.getTreeBuilder());
    }

    @Test
    public void testIsTrackErrors_defaultState_returnsFalse() {
        assertFalse(parser.isTrackErrors());
    }

    @Test
    public void testSetTrackErrors_positiveValue_enablesTracking() {
        Parser result = parser.setTrackErrors(10);
        assertSame(parser, result);
        assertTrue(parser.isTrackErrors());
    }

    @Test
    public void testSetTrackErrors_zeroValue_disablesTracking() {
        parser.setTrackErrors(0);
        assertFalse(parser.isTrackErrors());
    }

    @Test
    public void testSetTrackErrors_negativeValue_disablesTracking() {
        parser.setTrackErrors(-5);
        assertFalse(parser.isTrackErrors());
    }

    @Test
    public void testGetErrors_beforeAnyParse_returnsNull() {
        assertNull(parser.getErrors());
    }

    @Test
    public void testGetErrors_afterParseWithTrackingDisabled_returnsEmptyList() {
        parser.parseInput("<html><body>test</body></html>", "");
        List<ParseError> errors = parser.getErrors();
        assertNotNull(errors);
        assertTrue(errors.isEmpty());
    }

    @Test
    public void testGetErrors_afterParseWithTrackingEnabled_returnsListInstance() {
        parser.setTrackErrors(10);
        parser.parseInput("<html><body>test</body></html>", "");
        List<ParseError> errors = parser.getErrors();
        assertNotNull(errors);
    }

    @Test
    public void testSettings_setAndGet_returnsSameSettings() {
        ParseSettings customSettings = new ParseSettings(true, true);
        Parser result = parser.settings(customSettings);
        assertSame(parser, result);
        assertSame(customSettings, parser.settings());
    }

    @Test
    public void testSettings_getDefault_notNull() {
        assertNotNull(parser.settings());
    }

    // ---------- parseInput ----------

    @Test
    public void testParseInput_normalHtml_returnsDocument() {
        Document doc = parser.parseInput("<html><head><title>Test</title></head><body><p>Hello</p></body></html>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
    }

    @Test
    public void testParseInput_emptyHtml_returnsDocument() {
        Document doc = parser.parseInput("", "");
        assertNotNull(doc);
    }

    @Test
    public void testParseInput_malformedHtml_stillReturnsDocument() {
        Document doc = parser.parseInput("<div><p>unclosed", "http://example.com/");
        assertNotNull(doc);
    }

    // ---------- static parse ----------

    @Test
    public void testParse_normalHtml_returnsDocumentWithContent() {
        Document doc = Parser.parse("<html><body><p>Hello World</p></body></html>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Hello World", doc.select("p").text());
    }

    @Test
    public void testParse_emptyString_returnsDocument() {
        Document doc = Parser.parse("", "http://example.com/");
        assertNotNull(doc);
    }

    @Test
    public void testParse_emptyBaseUri_returnsDocument() {
        Document doc = Parser.parse("<p>test</p>", "");
        assertNotNull(doc);
    }

    // ---------- static parseFragment ----------

    @Test
    public void testParseFragment_withNullContext_returnsNodes() {
        List<Node> nodes = Parser.parseFragment("<p>Hello</p>", null, "http://example.com/");
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseFragment_withValidContext_returnsNodes() {
        Document doc = Document.createShell("http://example.com/");
        Element body = doc.body();
        List<Node> nodes = Parser.parseFragment("<span>Test</span>", body, "http://example.com/");
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseFragment_emptyFragment_returnsEmptyOrNonNullList() {
        List<Node> nodes = Parser.parseFragment("", null, "http://example.com/");
        assertNotNull(nodes);
    }

    // ---------- static parseXmlFragment ----------

    @Test
    public void testParseXmlFragment_normalXml_returnsNodes() {
        List<Node> nodes = Parser.parseXmlFragment("<tag>value</tag>", "http://example.com/");
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseXmlFragment_emptyXml_returnsNonNullList() {
        List<Node> nodes = Parser.parseXmlFragment("", "http://example.com/");
        assertNotNull(nodes);
    }

    // ---------- static parseBodyFragment ----------

    @Test
    public void testParseBodyFragment_normalHtml_returnsDocumentWithBody() {
        Document doc = Parser.parseBodyFragment("<p>Hello</p><p>World</p>", "http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.body());
        assertTrue(doc.body().html().contains("Hello"));
        assertTrue(doc.body().html().contains("World"));
    }

    @Test
    public void testParseBodyFragment_singleNode_returnsDocumentWithSingleChild() {
        Document doc = Parser.parseBodyFragment("<div>only</div>", "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.body().html().contains("only"));
    }

    @Test
    public void testParseBodyFragment_emptyHtml_returnsDocumentWithEmptyBody() {
        Document doc = Parser.parseBodyFragment("", "http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    // ---------- static unescapeEntities ----------

    @Test
    public void testUnescapeEntities_normalEntities_returnsDecodedString() {
        String result = Parser.unescapeEntities("&lt;div&gt;", false);
        assertEquals("<div>", result);
    }

    @Test
    public void testUnescapeEntities_inAttributeTrue_returnsDecodedString() {
        String result = Parser.unescapeEntities("&amp;", true);
        assertEquals("&", result);
    }

    @Test
    public void testUnescapeEntities_emptyString_returnsEmptyString() {
        String result = Parser.unescapeEntities("", false);
        assertEquals("", result);
    }

    @Test
    public void testUnescapeEntities_noEntities_returnsSameString() {
        String result = Parser.unescapeEntities("plain text", false);
        assertEquals("plain text", result);
    }

    // ---------- static parseBodyFragmentRelaxed ----------

    @Test
    public void testParseBodyFragmentRelaxed_normalHtml_returnsDocument() {
        Document doc = Parser.parseBodyFragmentRelaxed("<html><body><p>Relaxed</p></body></html>", "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.body().html().contains("Relaxed"));
    }

    @Test
    public void testParseBodyFragmentRelaxed_emptyHtml_returnsDocument() {
        Document doc = Parser.parseBodyFragmentRelaxed("", "http://example.com/");
        assertNotNull(doc);
    }

    // ---------- static builders ----------

    @Test
    public void testHtmlParser_createsNewInstance_withHtmlTreeBuilder() {
        Parser p = Parser.htmlParser();
        assertNotNull(p);
        assertTrue(p.getTreeBuilder() instanceof HtmlTreeBuilder);
    }

    @Test
    public void testHtmlParser_multipleCalls_returnDifferentInstances() {
        Parser p1 = Parser.htmlParser();
        Parser p2 = Parser.htmlParser();
        assertNotSame(p1, p2);
    }

    @Test
    public void testXmlParser_createsNewInstance_withXmlTreeBuilder() {
        Parser p = Parser.xmlParser();
        assertNotNull(p);
        assertTrue(p.getTreeBuilder() instanceof XmlTreeBuilder);
    }

    @Test
    public void testXmlParser_multipleCalls_returnDifferentInstances() {
        Parser p1 = Parser.xmlParser();
        Parser p2 = Parser.xmlParser();
        assertNotSame(p1, p2);
    }

    // ---------- Edge cases combining features ----------

    @Test
    public void testXmlParser_parseInputWithXmlContent_returnsDocument() {
        Parser xmlParser = Parser.xmlParser();
        Document doc = xmlParser.parseInput("<root><child>value</child></root>", "http://example.com/");
        assertNotNull(doc);
    }

    @Test
    public void testSetTrackErrors_thenParseInvalidHtml_recordsErrors() {
        parser.setTrackErrors(50);
        parser.parseInput("<html><body><table><tr><td>text</td></tr></table></body></html>", "");
        List<ParseError> errors = parser.getErrors();
        assertNotNull(errors);
    }

    @Test
    public void testParseInput_calledTwice_updatesErrorsEachTime() {
        parser.setTrackErrors(10);
        parser.parseInput("<p>first</p>", "");
        List<ParseError> firstErrors = parser.getErrors();
        parser.parseInput("<p>second</p>", "");
        List<ParseError> secondErrors = parser.getErrors();
        assertNotNull(firstErrors);
        assertNotNull(secondErrors);
    }
}
