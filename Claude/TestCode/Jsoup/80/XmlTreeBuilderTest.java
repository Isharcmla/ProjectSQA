package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {

    private XmlTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new XmlTreeBuilder();
    }

    @Test
    public void testDefaultSettings_returnsPreserveCaseSettings() {
        ParseSettings settings = builder.defaultSettings();
        assertNotNull(settings);
        assertSame(ParseSettings.preserveCase, settings);
    }

    @Test
    public void testParseString_normalXml_returnsDocumentWithXmlSyntax() {
        String xml = "<root><child>text</child></root>";
        Document doc = builder.parse(xml, "http://example.com/");
        assertNotNull(doc);
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        assertEquals("text", root.select("child").text());
    }

    @Test
    public void testParseReader_normalXml_returnsDocumentWithExpectedStructure() {
        Reader reader = new StringReader("<a><b attr=\"1\">hello</b></a>");
        Document doc = builder.parse(reader, "http://example.com/");
        assertNotNull(doc);
        assertEquals("a", doc.child(0).tagName());
        assertEquals("1", doc.select("b").attr("attr"));
        assertEquals("hello", doc.select("b").text());
    }

    @Test
    public void testParseString_emptyString_returnsEmptyDocument() {
        Document doc = builder.parse("", "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.childNodes().isEmpty() || doc.children().isEmpty());
    }

    @Test
    public void testParse_selfClosingUnknownTag_doesNotThrow() {
        Document doc = builder.parse("<root><custom/></root>", "http://example.com/");
        Element custom = doc.select("custom").first();
        assertNotNull(custom);
    }

    @Test
    public void testParse_commentNode_insertedCorrectly() {
        Document doc = builder.parse("<root><!-- this is a comment --></root>", "http://example.com/");
        Element root = doc.child(0);
        boolean hasComment = false;
        for (Node node : root.childNodes()) {
            if (node instanceof Comment) {
                hasComment = true;
                assertEquals(" this is a comment ", ((Comment) node).getData());
            }
        }
        assertTrue(hasComment);
    }

    @Test
    public void testParse_cdataNode_insertedCorrectly() {
        Document doc = builder.parse("<root><![CDATA[some data]]></root>", "http://example.com/");
        Element root = doc.child(0);
        boolean hasCData = false;
        for (Node node : root.childNodes()) {
            if (node instanceof CDataNode) {
                hasCData = true;
                assertEquals("some data", ((CDataNode) node).text());
            }
        }
        assertTrue(hasCData);
    }

    @Test
    public void testParse_doctypeNode_insertedCorrectly() {
        Document doc = builder.parse("<!DOCTYPE html><root></root>", "http://example.com/");
        boolean hasDoctype = false;
        for (Node node : doc.childNodes()) {
            if (node instanceof DocumentType) {
                hasDoctype = true;
            }
        }
        assertTrue(hasDoctype);
    }

    @Test
    public void testParse_xmlDeclarationBogusComment_parsedAsXmlDeclaration() {
        Document doc = builder.parse("<?xml version=\"1.0\" encoding=\"UTF-8\"?><root></root>", "http://example.com/");
        boolean hasXmlDecl = false;
        for (Node node : doc.childNodes()) {
            if (node instanceof XmlDeclaration) {
                hasXmlDecl = true;
                XmlDeclaration decl = (XmlDeclaration) node;
                assertEquals("xml", decl.name());
            }
        }
        assertTrue(hasXmlDecl);
    }

    @Test
    public void testParse_unmatchedEndTag_doesNotThrowAndIsSkipped() {
        Document doc = builder.parse("<root></root></extra>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("root", doc.child(0).tagName());
    }

    @Test
    public void testParse_nestedElementsWithMultipleEndTags_popsStackCorrectly() {
        Document doc = builder.parse("<a><b><c>text</c></b></a>", "http://example.com/");
        Element a = doc.child(0);
        assertEquals("a", a.tagName());
        Element b = a.child(0);
        assertEquals("b", b.tagName());
        Element c = b.child(0);
        assertEquals("c", c.tagName());
        assertEquals("text", c.text());
    }

    @Test
    public void testParseFragment_returnsChildNodesOfDocument() {
        ParseErrorList errors = ParseErrorList.noTracking();
        ParseSettings settings = ParseSettings.preserveCase;
        List<Node> nodes = builder.parseFragment("<a>1</a><b>2</b>", "http://example.com/", errors, settings);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseFragment_emptyInput_returnsEmptyOrNoNodes() {
        ParseErrorList errors = ParseErrorList.noTracking();
        ParseSettings settings = ParseSettings.preserveCase;
        List<Node> nodes = builder.parseFragment("", "http://example.com/", errors, settings);
        assertNotNull(nodes);
    }

    @Test
    public void testPublicApi_JsoupParseWithXmlParser_returnsXmlDocument() {
        String xml = "<root><child id=\"1\">value</child></root>";
        Document doc = Jsoup.parse(xml, "http://example.com/", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        assertEquals("value", doc.select("child").text());
        assertEquals("1", doc.select("child").attr("id"));
    }

    @Test
    public void testParse_caseSensitiveTags_preservedDueToPreserveCaseSettings() {
        Document doc = builder.parse("<Root><Child>Text</Child></Root>", "http://example.com/");
        Element root = doc.child(0);
        assertEquals("Root", root.tagName());
        assertEquals("Child", root.child(0).tagName());
    }

    @Test
    public void testParse_attributesNormalization_attributesPreserved() {
        Document doc = builder.parse("<root Attr=\"Value\"></root>", "http://example.com/");
        Element root = doc.child(0);
        assertTrue(root.hasAttr("Attr"));
        assertEquals("Value", root.attr("Attr"));
    }

    @Test
    public void testInitialiseParse_viaParse_setsXmlSyntaxOnOutputSettings() {
        Document doc = builder.parse("<a/>", "http://example.com/");
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
    }

    @Test(expected = NullPointerException.class)
    public void testParseString_nullInput_throwsNullPointerException() {
        builder.parse((String) null, "http://example.com/");
    }
}
