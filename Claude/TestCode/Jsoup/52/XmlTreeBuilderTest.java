package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {

    private XmlTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new XmlTreeBuilder();
    }

    // ---------- Normal / typical input ----------

    @Test
    public void testParseFragment_normalInput_returnsChildNodes() {
        List<Node> nodes = builder.parseFragment("<foo>bar</foo>", "http://example.com/", ParseErrorList.noTracking());
        assertNotNull(nodes);
        assertTrue(nodes.size() > 0);
        Element foo = (Element) nodes.get(0);
        assertEquals("foo", foo.tagName());
        assertEquals("bar", foo.text());
    }

    @Test
    public void testJsoupParseXml_normalDocument_parsedCorrectly() {
        String xml = "<root><child attr=\"1\">Text</child></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        Element child = root.child(0);
        assertEquals("child", child.tagName());
        assertEquals("1", child.attr("attr"));
        assertEquals("Text", child.text());
    }

    @Test
    public void testJsoupParseXml_selfClosingTag_parsedCorrectly() {
        String xml = "<root><empty/></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        Element empty = root.child(0);
        assertEquals("empty", empty.tagName());
        assertEquals(0, empty.childNodeSize());
    }

    @Test
    public void testJsoupParseXml_comment_parsedAsComment() {
        String xml = "<root><!-- a comment --></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        Node commentNode = root.childNode(0);
        assertTrue(commentNode instanceof Comment);
        assertEquals(" a comment ", ((Comment) commentNode).getData());
    }

    @Test
    public void testJsoupParseXml_bogusCommentDeclaration_parsedAsXmlDeclaration() {
        String xml = "<?xml version=\"1.0\"?><root></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Node first = doc.childNode(0);
        assertTrue(first instanceof XmlDeclaration);
    }

    @Test
    public void testJsoupParseXml_doctype_parsedAsDocumentType() {
        String xml = "<!DOCTYPE root SYSTEM \"root.dtd\"><root></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Node first = doc.childNode(0);
        assertTrue(first instanceof DocumentType);
    }

    @Test
    public void testJsoupParseXml_characterData_parsedAsTextNode() {
        String xml = "<root>Hello World</root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        assertEquals("Hello World", root.text());
    }

    @Test
    public void testParseFragment_nestedElements_correctStructure() {
        List<Node> nodes = builder.parseFragment("<a><b><c/></b></a>", "", ParseErrorList.noTracking());
        assertEquals(1, nodes.size());
        Element a = (Element) nodes.get(0);
        assertEquals("a", a.tagName());
        Element b = a.child(0);
        assertEquals("b", b.tagName());
        Element c = b.child(0);
        assertEquals("c", c.tagName());
    }

    // ---------- Edge cases ----------

    @Test
    public void testParseFragment_emptyInput_returnsEmptyNodeList() {
        List<Node> nodes = builder.parseFragment("", "", ParseErrorList.noTracking());
        assertNotNull(nodes);
        assertEquals(0, nodes.size());
    }

    @Test
    public void testJsoupParseXml_unmatchedEndTag_ignoredGracefully() {
        String xml = "<root></nonexistent></root>";
        // popStackToClose should silently skip when no matching element is found on the stack
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertNotNull(doc);
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
    }

    @Test
    public void testJsoupParseXml_emptyStringInput_producesEmptyDocument() {
        Document doc = Jsoup.parse("", "", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals(0, doc.childNodeSize());
    }

    @Test
    public void testJsoupParseXml_onlyWhitespaceInput_producesTextNodeOrNothing() {
        Document doc = Jsoup.parse("   ", "", Parser.xmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseFragment_withBaseUri_appliedToElements() {
        List<Node> nodes = builder.parseFragment("<a href=\"x\"></a>", "http://base.com/", ParseErrorList.noTracking());
        Element a = (Element) nodes.get(0);
        assertEquals("http://base.com/", a.baseUri());
    }

    @Test
    public void testJsoupParseXml_multipleTopLevelElements_allParsed() {
        String xml = "<a/><b/><c/>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertEquals(3, doc.childNodeSize());
    }

    // ---------- Exception cases ----------

    @Test(expected = IllegalArgumentException.class)
    public void testTagValueOf_nullTagName_throwsIllegalArgumentException() {
        Tag.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagValueOf_emptyTagName_throwsIllegalArgumentException() {
        Tag.valueOf("");
    }

    @Test(expected = NullPointerException.class)
    public void testParseFragment_nullInput_throwsNullPointerException() {
        builder.parseFragment(null, "", ParseErrorList.noTracking());
    }
}
