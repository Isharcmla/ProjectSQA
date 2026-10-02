package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class XmlTreeBuilderTest {

    private XmlTreeBuilder treeBuilder;

    @Before
    public void setUp() {
        treeBuilder = new XmlTreeBuilder();
    }

    @Test
    public void testDefaultSettings_returnsPreserveCase() {
        ParseSettings settings = treeBuilder.defaultSettings();
        assertSame(ParseSettings.preserveCase, settings);
    }

    @Test
    public void testParse_simpleXml_createsDocumentWithXmlSyntax() {
        String xml = "<root id=\"1\"><child>Hello World</child></root>";
        String baseUri = "http://example.com/";

        Document doc = treeBuilder.parse(xml, baseUri);

        assertNotNull(doc);
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        assertEquals("root", doc.child(0).tagName());
        assertEquals("1", doc.child(0).attr("id"));
        assertEquals("Hello World", doc.select("child").text());
        assertEquals(baseUri, doc.baseUri());
    }

    @Test
    public void testParse_emptyString_createsEmptyDocument() {
        Document doc = treeBuilder.parse("", "http://example.com/");
        assertNotNull(doc);
        assertEquals(0, doc.children().size());
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
    }

    @Test
    public void testParse_preservesCaseForTagsAndAttributes() {
        String xml = "<MixedCase TagAttr=\"Value\">text</MixedCase>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element el = doc.child(0);
        assertEquals("MixedCase", el.tagName());
        assertTrue(el.hasAttr("TagAttr"));
        assertEquals("Value", el.attr("TagAttr"));
    }

    @Test
    public void testParse_selfClosingTags_knownAndUnknown() {
        String xml = "<root><img src=\"test.png\"/><custom-tag id=\"2\"/></root>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element root = doc.child(0);
        assertEquals(2, root.children().size());

        Element img = root.child(0);
        assertEquals("img", img.tagName());
        assertEquals("test.png", img.attr("src"));

        Element customTag = root.child(1);
        assertEquals("custom-tag", customTag.tagName());
        assertEquals("2", customTag.attr("id"));
    }

    @Test
    public void testParse_doctypeDeclaration() {
        String xml = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\"><html/>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        List<Node> nodes = doc.childNodes();
        assertTrue(nodes.get(0) instanceof DocumentType);
        DocumentType doctype = (DocumentType) nodes.get(0);

        assertEquals("html", doctype.name());
        assertEquals("-//W3C//DTD XHTML 1.0 Strict//EN", doctype.attr("publicId"));
        assertEquals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", doctype.attr("systemId"));
    }

    @Test
    public void testParse_standardComment() {
        String xml = "<root><!-- This is a comment --></root>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element root = doc.child(0);
        assertEquals(1, root.childNodeSize());
        assertTrue(root.childNode(0) instanceof Comment);
        Comment comment = (Comment) root.childNode(0);
        assertEquals(" This is a comment ", comment.getData());
    }

    @Test
    public void testParse_xmlDeclarationWithQuestionMark() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root/>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        List<Node> nodes = doc.childNodes();
        assertTrue(nodes.get(0) instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) nodes.get(0);

        assertEquals("xml", decl.name());
        assertEquals("1.0", decl.attr("version"));
        assertEquals("UTF-8", decl.attr("encoding"));
        assertFalse(decl.toString().startsWith("<!"));
    }

    @Test
    public void testParse_xmlDeclarationWithExclamationMark() {
        String xml = "<!xml version=\"1.0\" encoding=\"UTF-8\"!><root/>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        List<Node> nodes = doc.childNodes();
        assertTrue(nodes.get(0) instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) nodes.get(0);

        assertEquals("xml", decl.name());
        assertEquals("1.0", decl.attr("version"));
        assertEquals("UTF-8", decl.attr("encoding"));
        assertTrue(decl.toString().startsWith("<!"));
    }

    @Test
    public void testParse_cdataSection() {
        String xml = "<root><![CDATA[<unescaped & content>]]></root>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element root = doc.child(0);
        assertEquals(1, root.childNodeSize());
        assertTrue(root.childNode(0) instanceof TextNode);
        TextNode textNode = (TextNode) root.childNode(0);
        assertEquals("<unescaped & content>", textNode.text());
    }

    @Test
    public void testParse_nestedElementsAndStackPopping() {
        String xml = "<a><b><c>text</c></b></a>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        assertEquals(1, doc.children().size());
        Element a = doc.child(0);
        assertEquals("a", a.tagName());
        Element b = a.child(0);
        assertEquals("b", b.tagName());
        Element c = b.child(0);
        assertEquals("c", c.tagName());
        assertEquals("text", c.text());
    }

    @Test
    public void testParse_outOfOrderClosingTagPopsInterveningElements() {
        String xml = "<a><b><c></a>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        assertEquals(1, doc.children().size());
        Element a = doc.child(0);
        assertEquals("a", a.tagName());
        assertEquals("b", a.child(0).tagName());
        assertEquals("c", a.child(0).child(0).tagName());
    }

    @Test
    public void testParse_closingTagNotFoundIgnored() {
        String xml = "<root></notfound><child>data</child></root>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element root = doc.child(0);
        assertEquals(1, root.children().size());
        assertEquals("child", root.child(0).tagName());
    }

    @Test
    public void testParseFragment_validFragment() {
        String fragment = "<item id=\"1\">Item 1</item><item id=\"2\">Item 2</item>";
        List<Node> nodes = treeBuilder.parseFragment(
                fragment,
                "http://example.com/",
                ParseErrorList.noTracking(),
                ParseSettings.preserveCase
        );

        assertEquals(2, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
        assertTrue(nodes.get(1) instanceof Element);
        assertEquals("Item 1", ((Element) nodes.get(0)).text());
        assertEquals("Item 2", ((Element) nodes.get(1)).text());
    }

    @Test
    public void testParseFragment_emptyFragment() {
        List<Node> nodes = treeBuilder.parseFragment(
                "",
                "http://example.com/",
                ParseErrorList.noTracking(),
                ParseSettings.preserveCase
        );

        assertNotNull(nodes);
        assertEquals(0, nodes.size());
    }

    @Test
    public void testProcess_eofToken() {
        treeBuilder.initialiseParse("<root>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.EOF eof = new Token.EOF();
        boolean processed = treeBuilder.process(eof);
        assertTrue(processed);
    }

    @Test
    public void testInsertComment_bogusShortLengthOrNoPrefix() {
        treeBuilder.initialiseParse("<root></root>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);

        Token.Comment shortBogus = new Token.Comment();
        shortBogus.bogus = true;
        shortBogus.getData().append("?");
        treeBuilder.insert(shortBogus);

        Token.Comment noPrefixBogus = new Token.Comment();
        noPrefixBogus.bogus = true;
        noPrefixBogus.getData().append("plain_text");
        treeBuilder.insert(noPrefixBogus);

        Element root = treeBuilder.doc.child(0);
        assertEquals(2, root.childNodeSize());
        assertTrue(root.childNode(0) instanceof Comment);
        assertTrue(root.childNode(1) instanceof Comment);
        assertFalse(root.childNode(0) instanceof XmlDeclaration);
        assertFalse(root.childNode(1) instanceof XmlDeclaration);
    }

    @Test
    public void testInsertStartTag_knownSelfClosingTag() {
        treeBuilder.initialiseParse("<root></root>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);

        Token.StartTag imgTag = new Token.StartTag();
        imgTag.nameAttr("img", new org.jsoup.nodes.Attributes());
        imgTag.selfClosing = true;

        Element inserted = treeBuilder.insert(imgTag);
        assertNotNull(inserted);
        assertEquals("img", inserted.tagName());
    }

    @Test
    public void testInsertCharacterToken() {
        treeBuilder.initialiseParse("<root></root>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);

        Token.Character charToken = new Token.Character();
        charToken.data("Direct text token");
        treeBuilder.process(charToken);

        Element root = treeBuilder.doc.child(0);
        assertEquals(1, root.childNodeSize());
        assertTrue(root.childNode(0) instanceof TextNode);
        assertEquals("Direct text token", ((TextNode) root.childNode(0)).getWholeText());
    }

    @Test
    public void testInsertDoctypeToken() {
        treeBuilder.initialiseParse("", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);

        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name.append("custom-doctype");
        doctypeToken.publicIdentifier.append("pub-id");
        doctypeToken.systemIdentifier.append("sys-id");

        treeBuilder.process(doctypeToken);

        List<Node> nodes = treeBuilder.doc.childNodes();
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof DocumentType);
        DocumentType dt = (DocumentType) nodes.get(0);
        assertEquals("custom-doctype", dt.name());
        assertEquals("pub-id", dt.attr("publicId"));
        assertEquals("sys-id", dt.attr("systemId"));
    }
}
