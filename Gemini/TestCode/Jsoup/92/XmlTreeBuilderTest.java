package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.helper.Validate;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {

    @Test
    public void testDefaultSettings_returnsPreserveCase() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        ParseSettings settings = treeBuilder.defaultSettings();
        assertNotNull(settings);
        assertEquals(ParseSettings.preserveCase, settings);
    }

    @Test
    public void testParse_stringInput_success() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        String xml = "<root><child id=\"1\">Text</child></root>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        assertNotNull(doc);
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        assertEquals("http://example.com/", doc.baseUri());
        assertEquals(1, doc.children().size());
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        assertEquals(1, root.children().size());
        Element child = root.child(0);
        assertEquals("child", child.tagName());
        assertEquals("1", child.attr("id"));
        assertEquals("Text", child.text());
    }

    @Test
    public void testParse_readerInput_success() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Reader reader = new StringReader("<test>Value</test>");
        Document doc = treeBuilder.parse(reader, "http://example.com/");

        assertNotNull(doc);
        assertEquals("test", doc.child(0).tagName());
        assertEquals("Value", doc.child(0).text());
    }

    @Test
    public void testParse_emptyString_returnsDocumentWithNoChildren() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse("", "http://example.com/");

        assertNotNull(doc);
        assertEquals(0, doc.children().size());
    }

    @Test
    public void testParse_cdataSection_insertsCDataNode() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        String xml = "<data><![CDATA[some <b>escaped</b> data & stuff]]></data>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element data = doc.selectFirst("data");
        assertNotNull(data);
        assertEquals(1, data.childNodeSize());
        Node node = data.childNode(0);
        assertTrue(node instanceof CDataNode);
        assertEquals("some <b>escaped</b> data & stuff", ((CDataNode) node).text());
    }

    @Test
    public void testParse_xmlDeclaration_insertsXmlDeclarationNode() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root/>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        List<Node> nodes = doc.childNodes();
        assertTrue(nodes.size() >= 2);
        assertTrue(nodes.get(0) instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) nodes.get(0);
        assertEquals("xml", decl.name());
        assertEquals("1.0", decl.attr("version"));
        assertEquals("UTF-8", decl.attr("encoding"));
    }

    @Test
    public void testParse_bogusCommentNotValidXmlDeclaration_insertsComment() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        String xml = "<!--?invalid decl?><root/>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Node firstNode = doc.childNode(0);
        assertTrue(firstNode instanceof Comment);
        assertFalse(firstNode instanceof XmlDeclaration);
    }

    @Test
    public void testParse_standardComment_insertsCommentNode() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        String xml = "<root><!-- This is a comment --></root>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element root = doc.selectFirst("root");
        assertNotNull(root);
        assertEquals(1, root.childNodeSize());
        assertTrue(root.childNode(0) instanceof Comment);
        assertEquals(" This is a comment ", ((Comment) root.childNode(0)).getData());
    }

    @Test
    public void testParse_doctype_insertsDocumentTypeNode() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        String xml = "<!DOCTYPE html SYSTEM \"about:legacy-compat\"><root/>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        List<Node> nodes = doc.childNodes();
        assertTrue(nodes.get(0) instanceof DocumentType);
        DocumentType doctype = (DocumentType) nodes.get(0);
        assertEquals("html", doctype.name());
        assertEquals("about:legacy-compat", doctype.attr("systemId"));
    }

    @Test
    public void testParse_selfClosingTags_handlesKnownAndUnknownTags() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        // <custom/> is unknown tag; <br/> is known HTML tag in Tag.java
        String xml = "<root><custom attr=\"val\"/><br/><other/></root>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element root = doc.selectFirst("root");
        assertNotNull(root);
        assertEquals(3, root.children().size());

        Element custom = root.child(0);
        assertEquals("custom", custom.tagName());
        assertTrue(custom.tag().isSelfClosing());

        Element br = root.child(1);
        assertEquals("br", br.tagName());

        Element other = root.child(2);
        assertEquals("other", other.tagName());
        assertTrue(other.tag().isSelfClosing());
    }

    @Test
    public void testParse_casePreserved_preservesTagAndAttributeCase() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        String xml = "<CamelCase TagAttribute=\"Value\"/>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element el = doc.child(0);
        assertEquals("CamelCase", el.tagName());
        assertTrue(el.hasAttr("TagAttribute"));
        assertEquals("Value", el.attr("TagAttribute"));
    }

    @Test
    public void testPopStackToClose_mismatchedAndNestedClosingTags() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        // Closing <a> should close <b> as well
        String xml = "<root><a><b><c>text</a></root>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element root = doc.selectFirst("root");
        assertNotNull(root);
        assertEquals(1, root.children().size());
        Element a = root.child(0);
        assertEquals("a", a.tagName());
        assertEquals("b", a.child(0).tagName());
    }

    @Test
    public void testPopStackToClose_endTagNotInStack_isIgnored() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        String xml = "<root></nonexistent><item>val</item></root>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element root = doc.selectFirst("root");
        assertNotNull(root);
        assertEquals(1, root.children().size());
        assertEquals("item", root.child(0).tagName());
    }

    @Test
    public void testParseFragment_threeArguments_parsesNodesList() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Parser parser = new Parser(treeBuilder);
        String fragment = "<one>First</one><two>Second</two>";

        List<Node> nodes = treeBuilder.parseFragment(fragment, "http://example.com/", parser);

        assertNotNull(nodes);
        assertEquals(2, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("one", ((Element) nodes.get(0)).tagName());
        assertTrue(nodes.get(1) instanceof Element);
        assertEquals("two", ((Element) nodes.get(1)).tagName());
    }

    @Test
    public void testParseFragment_fourArgumentsWithContext_parsesNodesList() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Parser parser = new Parser(treeBuilder);
        Element context = new Element(Tag.valueOf("dummy"), "");
        String fragment = "<item key=\"value\">content</item>";

        List<Node> nodes = treeBuilder.parseFragment(fragment, context, "http://example.com/", parser);

        assertNotNull(nodes);
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
        Element item = (Element) nodes.get(0);
        assertEquals("item", item.tagName());
        assertEquals("value", item.attr("key"));
        assertEquals("content", item.text());
    }

    @Test
    public void testProcess_eofToken_returnsTrue() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader("<root/>"), "http://example.com/", new Parser(treeBuilder));

        Token.EOF eof = new Token.EOF();
        boolean processed = treeBuilder.process(eof);
        assertTrue(processed);
    }

    @Test
    public void testProcess_nullToken_throwsException() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader("<root/>"), "http://example.com/", new Parser(treeBuilder));

        try {
            treeBuilder.process(null);
            fail("Expected NullPointerException or IllegalArgumentException");
        } catch (NullPointerException | IllegalArgumentException expected) {
            // Success
        }
    }
}
