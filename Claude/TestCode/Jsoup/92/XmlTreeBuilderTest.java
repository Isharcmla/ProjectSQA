package org.jsoup.parser;

import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;

import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {

    // ---------- defaultSettings ----------

    @Test
    public void testDefaultSettings_returnsPreserveCase() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        assertSame(ParseSettings.preserveCase, settings);
    }

    // ---------- parse(String, String) : typical ----------

    @Test
    public void testParseString_typicalInput_buildsCorrectTree() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<root><child>text</child></root>", "http://example.com/");

        assertNotNull(doc);
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());

        Element root = doc.child(0);
        assertEquals("root", root.tagName());

        Element child = root.child(0);
        assertEquals("child", child.tagName());
        assertEquals("text", child.text());
    }

    // ---------- parse(Reader, String) : typical ----------

    @Test
    public void testParseReader_typicalInput_buildsCorrectTree() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse(new StringReader("<root><child>text</child></root>"), "http://example.com/");

        assertNotNull(doc);
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        Element child = root.child(0);
        assertEquals("child", child.tagName());
        assertEquals("text", child.text());
    }

    // ---------- edge case: empty string input ----------

    @Test
    public void testParseString_emptyInput_returnsEmptyDocument() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("", "http://example.com/");

        assertNotNull(doc);
        assertEquals(0, doc.childNodeSize());
    }

    // ---------- self closing tag (unknown tag) ----------

    @Test
    public void testProcess_selfClosingUnknownTag_notAddedToStack() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<root><a/><b/></root>", "http://example.com/");

        Element root = doc.child(0);
        assertEquals(2, root.children().size());
        assertEquals("a", root.child(0).tagName());
        assertEquals("b", root.child(1).tagName());
        assertEquals(0, root.child(0).childNodeSize());
        assertEquals(0, root.child(1).childNodeSize());
    }

    // ---------- self closing tag (known html tag) ----------

    @Test
    public void testProcess_selfClosingKnownTag_handledWithoutException() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<br/>", "http://example.com/");

        assertEquals(1, doc.childNodeSize());
        Element br = doc.child(0);
        assertEquals("br", br.tagName());
        assertEquals(0, br.childNodeSize());
    }

    // ---------- comment insertion ----------

    @Test
    public void testProcess_comment_insertsCommentNode() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<!-- hello -->", "http://example.com/");

        assertEquals(1, doc.childNodeSize());
        Node n = doc.childNode(0);
        assertTrue(n instanceof Comment);
        assertEquals(" hello ", ((Comment) n).getData());
    }

    // ---------- bogus comment parsed as XmlDeclaration ----------

    @Test
    public void testProcess_bogusCommentXmlDeclaration_insertsXmlDeclarationNode() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "http://example.com/");

        assertEquals(1, doc.childNodeSize());
        Node n = doc.childNode(0);
        assertTrue(n instanceof XmlDeclaration);
    }

    // ---------- cdata node ----------

    @Test
    public void testProcess_cdata_insertsCDataNode() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<root><![CDATA[somedata]]></root>", "http://example.com/");

        Element root = doc.child(0);
        assertEquals(1, root.childNodeSize());
        Node cnode = root.childNode(0);
        assertTrue(cnode instanceof CDataNode);
        assertEquals("somedata", ((CDataNode) cnode).text());
    }

    // ---------- doctype node ----------

    @Test
    public void testProcess_doctype_insertsDocumentTypeNode() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<!DOCTYPE note SYSTEM \"Note.dtd\">", "http://example.com/");

        assertEquals(1, doc.childNodeSize());
        Node n = doc.childNode(0);
        assertTrue(n instanceof DocumentType);
    }

    // ---------- end tag not found: should not throw, simply skip ----------

    @Test
    public void testProcess_endTagNotFound_doesNotThrowAndSkips() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<root></nonexistent>", "http://example.com/");

        assertNotNull(doc);
        assertEquals(1, doc.childNodeSize());
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
    }

    // ---------- malformed xml: should not throw, parser is forgiving ----------

    @Test
    public void testParse_malformedXml_doesNotThrowException() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<root><unclosed>", "http://example.com/");
        assertNotNull(doc);
    }

    // ---------- parseFragment(String, String, Parser) ----------

    @Test
    public void testParseFragment_withBaseUri_returnsChildNodes() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Parser parser = new Parser(builder);

        List<Node> nodes = builder.parseFragment("<a>1</a><b>2</b>", "http://example.com/", parser);

        assertNotNull(nodes);
        assertEquals(2, nodes.size());
        assertEquals("a", ((Element) nodes.get(0)).tagName());
        assertEquals("b", ((Element) nodes.get(1)).tagName());
    }

    // ---------- parseFragment(String, Element, String, Parser) ----------

    @Test
    public void testParseFragment_withContext_returnsChildNodes() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Parser parser = new Parser(builder);

        List<Node> nodes = builder.parseFragment("<a>1</a>", null, "http://example.com/", parser);

        assertNotNull(nodes);
        assertEquals(1, nodes.size());
        assertEquals("a", ((Element) nodes.get(0)).tagName());
    }

    // ---------- edge case: empty fragment ----------

    @Test
    public void testParseFragment_emptyInput_returnsEmptyList() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Parser parser = new Parser(builder);

        List<Node> nodes = builder.parseFragment("", "http://example.com/", parser);

        assertNotNull(nodes);
        assertEquals(0, nodes.size());
    }

    // ---------- exception case: null String input to parse ----------

    @Test(expected = NullPointerException.class)
    public void testParseString_nullInput_throwsNullPointerException() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.parse((String) null, "http://example.com/");
    }
}
