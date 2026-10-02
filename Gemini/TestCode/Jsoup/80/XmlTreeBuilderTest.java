package org.jsoup.parser;

import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class XmlTreeBuilderTest {

    private XmlTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new XmlTreeBuilder();
    }

    @Test
    public void testDefaultSettings_returnsPreserveCase() {
        ParseSettings settings = builder.defaultSettings();
        assertNotNull(settings);
        assertEquals("TagName", settings.normalizeTag("TagName"));
        assertEquals("AttrName", settings.normalizeAttribute("AttrName"));
    }

    @Test
    public void testParse_stringInput_createsXmlDocument() {
        String xml = "<root attr='val'><child>Text</child></root>";
        Document doc = builder.parse(xml, "http://example.com/");

        assertNotNull(doc);
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        assertEquals(1, doc.children().size());
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        assertEquals("val", root.attr("attr"));
        assertEquals("Text", root.child(0).text());
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testParse_readerInput_createsXmlDocument() {
        StringReader reader = new StringReader("<test><item id='1'>Value</item></test>");
        Document doc = builder.parse(reader, "http://example.com/");

        assertNotNull(doc);
        assertEquals("test", doc.child(0).tagName());
        assertEquals("Value", doc.select("item").text());
    }

    @Test
    public void testParse_emptyString_createsEmptyDocument() {
        Document doc = builder.parse("", "http://example.com/");
        assertNotNull(doc);
        assertEquals(0, doc.children().size());
    }

    @Test
    public void testInsert_selfClosingKnownTag() {
        String xml = "<img src='foo.png' />";
        Document doc = builder.parse(xml, "");
        assertEquals(1, doc.children().size());
        Element img = doc.child(0);
        assertEquals("img", img.tagName());
        assertTrue(img.tag().isKnownTag());
    }

    @Test
    public void testInsert_selfClosingUnknownTag() {
        String xml = "<custom-tag id='123' />";
        Document doc = builder.parse(xml, "");
        assertEquals(1, doc.children().size());
        Element custom = doc.child(0);
        assertEquals("custom-tag", custom.tagName());
        assertTrue(custom.tag().isSelfClosing());
    }

    @Test
    public void testInsert_cdataNode() {
        String xml = "<data><![CDATA[Some <raw> data & content]]></data>";
        Document doc = builder.parse(xml, "");
        Element data = doc.child(0);
        assertEquals(1, data.childNodeSize());
        Node child = data.childNode(0);
        assertTrue(child instanceof CDataNode);
        assertEquals("Some <raw> data & content", ((CDataNode) child).text());
    }

    @Test
    public void testInsert_normalTextNode() {
        String xml = "<text>Hello World</text>";
        Document doc = builder.parse(xml, "");
        Node child = doc.child(0).childNode(0);
        assertTrue(child instanceof TextNode);
        assertEquals("Hello World", ((TextNode) child).text());
    }

    @Test
    public void testInsert_standardComment() {
        String xml = "<root><!-- This is a comment --></root>";
        Document doc = builder.parse(xml, "");
        Node commentNode = doc.child(0).childNode(0);
        assertTrue(commentNode instanceof Comment);
        assertEquals(" This is a comment ", ((Comment) commentNode).getData());
    }

    @Test
    public void testInsert_xmlDeclarationBogusCommentQuestionMark() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root/>";
        Document doc = builder.parse(xml, "");
        List<Node> nodes = doc.childNodes();
        assertTrue(nodes.size() >= 2);
        assertTrue(nodes.get(0) instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) nodes.get(0);
        assertEquals("xml", decl.name());
        assertEquals("1.0", decl.attr("version"));
        assertEquals("UTF-8", decl.attr("encoding"));
        assertFalse(decl.isProcessingInstruction());
    }

    @Test
    public void testInsert_xmlDeclarationBogusCommentExclamationMark() {
        String xml = "<!DOCTYPE-custom name=\"test\"><root/>";
        Document doc = builder.parse(xml, "");
        Node node = doc.childNode(0);
        assertTrue(node instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) node;
        assertEquals("DOCTYPE-custom", decl.name());
        assertEquals("test", decl.attr("name"));
        assertTrue(decl.isProcessingInstruction());
    }

    @Test
    public void testInsert_bogusCommentShortData() {
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.Comment commentToken = new Token.Comment();
        commentToken.bogus = true;
        commentToken.data.append("?");
        builder.insert(commentToken);

        List<Node> nodes = builder.doc.childNodes();
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof Comment);
        assertEquals("?", ((Comment) nodes.get(0)).getData());
    }

    @Test
    public void testInsert_bogusCommentNotStartingWithExclamationOrQuestion() {
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.Comment commentToken = new Token.Comment();
        commentToken.bogus = true;
        commentToken.data.append("normalBogus");
        builder.insert(commentToken);

        List<Node> nodes = builder.doc.childNodes();
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof Comment);
        assertEquals("normalBogus", ((Comment) nodes.get(0)).getData());
    }

    @Test
    public void testInsert_doctype() {
        String xml = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\"><root/>";
        Document doc = builder.parse(xml, "");
        List<Node> nodes = doc.childNodes();
        assertTrue(nodes.get(0) instanceof DocumentType);
        DocumentType dt = (DocumentType) nodes.get(0);
        assertEquals("html", dt.name());
        assertEquals("-//W3C//DTD XHTML 1.0 Strict//EN", dt.publicId());
        assertEquals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", dt.systemId());
    }

    @Test
    public void testPopStackToClose_nestedTagsClosedCorrectly() {
        String xml = "<a><b><c>text</b></a>";
        Document doc = builder.parse(xml, "");
        assertEquals("<a><b><c>text</c></b></a>", doc.body().children().size() > 0 ? doc.toString() : doc.html().trim());
    }

    @Test
    public void testPopStackToClose_closingTagNotFound_skipsSilently() {
        String xml = "<root><child>value</notfound></child></root>";
        Document doc = builder.parse(xml, "");
        assertEquals(1, doc.children().size());
        assertEquals("root", doc.child(0).tagName());
        assertEquals("child", doc.child(0).child(0).tagName());
    }

    @Test
    public void testPopStackToClose_multipleMismatchedTags() {
        String xml = "<x><y><z></y></x>";
        Document doc = builder.parse(xml, "");
        assertEquals(1, doc.children().size());
        Element x = doc.child(0);
        assertEquals("x", x.tagName());
        Element y = x.child(0);
        assertEquals("y", y.tagName());
        assertEquals("z", y.child(0).tagName());
    }

    @Test
    public void testParseFragment_validFragment_returnsNodeList() {
        List<Node> nodes = builder.parseFragment("<one/><two>val</two>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertNotNull(nodes);
        assertEquals(2, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("one", ((Element) nodes.get(0)).tagName());
        assertTrue(nodes.get(1) instanceof Element);
        assertEquals("two", ((Element) nodes.get(1)).tagName());
        assertEquals("val", ((Element) nodes.get(1)).text());
    }

    @Test
    public void testParseFragment_withCDataAndComments() {
        List<Node> nodes = builder.parseFragment("<!-- comment --><![CDATA[content]]>", "", ParseErrorList.tracking(10), ParseSettings.preserveCase);
        assertEquals(2, nodes.size());
        assertTrue(nodes.get(0) instanceof Comment);
        assertTrue(nodes.get(1) instanceof CDataNode);
    }

    @Test
    public void testProcess_tokenEOF() {
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.EOF eof = new Token.EOF();
        boolean handled = builder.process(eof);
        assertTrue(handled);
    }

    @Test
    public void testProcess_invalidTokenType_throwsIllegalArgumentException() {
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token invalidToken = new Token() {
            @Override
            Token reset() {
                return this;
            }
        };

        try {
            builder.process(invalidToken);
            fail("Expected IllegalArgumentException when processing an unknown token type");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unexpected token type"));
        }
    }

    @Test
    public void testPreserveCaseTagAndAttributes() {
        String xml = "<MyTag MyAttr=\"Value\">Content</MyTag>";
        Document doc = builder.parse(xml, "");
        Element el = doc.child(0);
        assertEquals("MyTag", el.tagName());
        assertTrue(el.hasAttr("MyAttr"));
        assertEquals("Value", el.attr("MyAttr"));
    }

    @Test
    public void testParse_doctypePubSysKey() {
        builder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name.append("root");
        doctypeToken.publicIdentifier.append("pubId");
        doctypeToken.systemIdentifier.append("sysId");
        doctypeToken.pubSysKey = "PUBLIC";
        
        builder.insert(doctypeToken);

        List<Node> nodes = builder.doc.childNodes();
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof DocumentType);
        DocumentType dt = (DocumentType) nodes.get(0);
        assertEquals("root", dt.name());
        assertEquals("pubId", dt.publicId());
        assertEquals("sysId", dt.systemId());
    }
}
