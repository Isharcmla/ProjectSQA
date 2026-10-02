package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class XmlTreeBuilderTest {

    private XmlTreeBuilder xmlTreeBuilder;

    @Before
    public void setUp() {
        xmlTreeBuilder = new XmlTreeBuilder();
    }

    @Test
    public void testDefaultSettings_returnsPreserveCase() {
        ParseSettings settings = xmlTreeBuilder.defaultSettings();
        assertSame(ParseSettings.preserveCase, settings);
    }

    @Test
    public void testParse_simpleXml_createsDocumentWithElements() {
        String xml = "<root><child>text</child></root>";
        Document doc = xmlTreeBuilder.parse(xml, "http://example.com/");
        assertNotNull(doc);
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        Element child = root.child(0);
        assertEquals("child", child.tagName());
        assertEquals("text", child.text());
    }

    @Test
    public void testParse_emptyString_returnsEmptyDocument() {
        Document doc = xmlTreeBuilder.parse("", "http://example.com/");
        assertNotNull(doc);
        assertEquals(0, doc.childNodeSize());
    }

    @Test
    public void testParse_selfClosingUnknownTag_marksSelfClosingAndNoChildren() {
        String xml = "<root><selfclosing/></root>";
        Document doc = xmlTreeBuilder.parse(xml, "http://example.com/");
        Element root = doc.child(0);
        Element selfClose = root.child(0);
        assertEquals("selfclosing", selfClose.tagName());
        assertEquals(0, selfClose.childNodeSize());
    }

    @Test
    public void testParse_selfClosingKnownTag_stillCreatesElementWithoutChildren() {
        String xml = "<br/>";
        Document doc = xmlTreeBuilder.parse(xml, "http://example.com/");
        Element br = doc.child(0);
        assertEquals("br", br.tagName());
        assertFalse(br.hasChildNodes());
    }

    @Test
    public void testParse_commentNode_insertsCommentCorrectly() {
        String xml = "<root><!-- a comment --></root>";
        Document doc = xmlTreeBuilder.parse(xml, "http://example.com/");
        Element root = doc.child(0);
        Node commentNode = root.childNode(0);
        assertTrue(commentNode instanceof Comment);
        assertEquals(" a comment ", ((Comment) commentNode).getData());
    }

    @Test
    public void testParse_xmlDeclaration_parsedAsXmlDeclaration() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root></root>";
        Document doc = xmlTreeBuilder.parse(xml, "http://example.com/");
        Node first = doc.childNode(0);
        assertTrue(first instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) first;
        assertEquals("xml", decl.name());
    }

    @Test
    public void testParse_doctype_parsedAsDocumentType() {
        String xml = "<!DOCTYPE html><root></root>";
        Document doc = xmlTreeBuilder.parse(xml, "http://example.com/");
        Node first = doc.childNode(0);
        assertTrue(first instanceof DocumentType);
    }

    @Test
    public void testParse_mismatchedEndTag_doesNotThrowAndSkipsClose() {
        String xml = "<root></nomatch></root>";
        Document doc = xmlTreeBuilder.parse(xml, "http://example.com/");
        assertNotNull(doc);
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
    }

    @Test
    public void testParse_nestedTagsClosedProperly() {
        String xml = "<a><b><c>text</c></b></a>";
        Document doc = xmlTreeBuilder.parse(xml, "http://example.com/");
        Element a = doc.child(0);
        Element b = a.child(0);
        Element c = b.child(0);
        assertEquals("c", c.tagName());
        assertEquals("text", c.text());
    }

    @Test
    public void testParseFragment_returnsChildNodes() {
        String fragment = "<p>Hello</p><p>World</p>";
        List<Node> nodes = xmlTreeBuilder.parseFragment(fragment, "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertEquals(2, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
    }

    @Test
    public void testJsoupParse_withXmlParser_publicApiUsage() {
        String xml = "<root attr=\"value\">Content</root>";
        Document doc = Jsoup.parse(xml, "http://example.com/", Parser.xmlParser());
        Element root = doc.child(0);
        assertEquals("value", root.attr("attr"));
        assertEquals("Content", root.text());
    }

    @Test(expected = RuntimeException.class)
    public void testParse_nullInput_throwsRuntimeException() {
        xmlTreeBuilder.parse(null, "http://example.com/");
    }

    @Test
    public void testParse_characterData_insertsTextNode() {
        String xml = "<root>Some text content</root>";
        Document doc = xmlTreeBuilder.parse(xml, "http://example.com/");
        Element root = doc.child(0);
        Node textNode = root.childNode(0);
        assertTrue(textNode instanceof TextNode);
        assertEquals("Some text content", ((TextNode) textNode).text());
    }

    @Test
    public void testParse_multipleTopLevelElements_allParsed() {
        String xml = "<a/><b/><c/>";
        Document doc = xmlTreeBuilder.parse(xml, "http://example.com/");
        assertEquals(3, doc.childNodeSize());
    }

    @Test
    public void testInsert_startTagWithAttributes_createsElementWithAttributes() {
        String xml = "<root id=\"1\" class=\"test\"></root>";
        Document doc = xmlTreeBuilder.parse(xml, "http://example.com/");
        Element root = doc.child(0);
        assertEquals("1", root.attr("id"));
        assertEquals("test", root.attr("class"));
    }

    @Test
    public void testInitialiseParse_placesDocumentOnStackAndSetsXmlOutputSyntax() {
        xmlTreeBuilder.initialiseParse("<root/>", "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertTrue(xmlTreeBuilder.stack.contains(xmlTreeBuilder.doc));
        assertEquals(Document.OutputSettings.Syntax.xml, xmlTreeBuilder.doc.outputSettings().syntax());
    }

    @Test
    public void testParse_eofToken_doesNotThrow() {
        String xml = "";
        Document doc = xmlTreeBuilder.parse(xml, "http://example.com/");
        assertNotNull(doc);
    }

    @Test
    public void testParse_deeplyNestedSelfClosingTags_parsedCorrectly() {
        String xml = "<a><b/><c/></a>";
        Document doc = xmlTreeBuilder.parse(xml, "http://example.com/");
        Element a = doc.child(0);
        assertEquals(2, a.childNodeSize());
        assertEquals("b", a.child(0).tagName());
        assertEquals("c", a.child(1).tagName());
    }
}
