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
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class XmlTreeBuilderTest {

    private XmlTreeBuilder treeBuilder;

    @Before
    public void setUp() {
        treeBuilder = new XmlTreeBuilder();
    }

    @Test
    public void testDefaultSettings_returnsPreserveCase() {
        ParseSettings settings = treeBuilder.defaultSettings();
        Assert.assertNotNull(settings);
        Assert.assertEquals(ParseSettings.preserveCase, settings);
    }

    @Test
    public void testParse_stringInput_parsesDocumentCorrectly() {
        String xml = "<root attr=\"value\"><child>text</child></root>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Assert.assertNotNull(doc);
        Assert.assertEquals("http://example.com/", doc.baseUri());
        Assert.assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        Assert.assertEquals(1, doc.children().size());
        Element root = doc.child(0);
        Assert.assertEquals("root", root.tagName());
        Assert.assertEquals("value", root.attr("attr"));
        Assert.assertEquals("child", root.child(0).tagName());
        Assert.assertEquals("text", root.child(0).text());
    }

    @Test
    public void testParse_readerInput_parsesDocumentCorrectly() {
        Reader reader = new StringReader("<test><item>data</item></test>");
        Document doc = treeBuilder.parse(reader, "http://example.com/");

        Assert.assertNotNull(doc);
        Assert.assertEquals("http://example.com/", doc.baseUri());
        Assert.assertEquals(1, doc.children().size());
        Assert.assertEquals("test", doc.child(0).tagName());
        Assert.assertEquals("item", doc.child(0).child(0).tagName());
    }

    @Test
    public void testParse_emptyString_createsEmptyDocumentWithXmlSyntax() {
        Document doc = treeBuilder.parse("", "");
        Assert.assertNotNull(doc);
        Assert.assertEquals(0, doc.children().size());
        Assert.assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
    }

    @Test
    public void testParse_preserveCaseTagAndAttribute() {
        String xml = "<MixedCase TagAttr=\"Value\" />";
        Document doc = treeBuilder.parse(xml, "");
        Element el = doc.child(0);

        Assert.assertEquals("MixedCase", el.tagName());
        Assert.assertTrue(el.hasAttr("TagAttr"));
        Assert.assertEquals("Value", el.attr("TagAttr"));
    }

    @Test
    public void testInsert_startTagSelfClosingUnknownTag() {
        String xml = "<custom-tag self=\"true\" />";
        Document doc = treeBuilder.parse(xml, "");
        Element el = doc.child(0);

        Assert.assertEquals("custom-tag", el.tagName());
        Assert.assertTrue(el.tag().isSelfClosing());
    }

    @Test
    public void testInsert_startTagSelfClosingKnownTag() {
        String xml = "<br />";
        Document doc = treeBuilder.parse(xml, "");
        Element el = doc.child(0);

        Assert.assertEquals("br", el.tagName());
    }

    @Test
    public void testInsert_cdataNode() {
        String xml = "<data><![CDATA[<unescaped & raw text>]]></data>";
        Document doc = treeBuilder.parse(xml, "");
        Element dataEl = doc.child(0);

        Assert.assertEquals(1, dataEl.childNodeSize());
        Node child = dataEl.childNode(0);
        Assert.assertTrue(child instanceof CDataNode);
        Assert.assertEquals("<unescaped & raw text>", ((CDataNode) child).text());
    }

    @Test
    public void testInsert_textNode() {
        String xml = "<data>Plain text content</data>";
        Document doc = treeBuilder.parse(xml, "");
        Element dataEl = doc.child(0);

        Assert.assertEquals(1, dataEl.childNodeSize());
        Node child = dataEl.childNode(0);
        Assert.assertTrue(child instanceof TextNode);
        Assert.assertEquals("Plain text content", ((TextNode) child).text());
    }

    @Test
    public void testInsert_commentNode() {
        String xml = "<data><!-- This is a comment --></data>";
        Document doc = treeBuilder.parse(xml, "");
        Element dataEl = doc.child(0);

        Assert.assertEquals(1, dataEl.childNodeSize());
        Node child = dataEl.childNode(0);
        Assert.assertTrue(child instanceof Comment);
        Assert.assertEquals(" This is a comment ", ((Comment) child).getData());
    }

    @Test
    public void testInsert_xmlDeclarationBogusCommentQuestionMark() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root/>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Assert.assertTrue(doc.childNode(0) instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) doc.childNode(0);
        Assert.assertEquals("xml", decl.name());
        Assert.assertFalse(decl.isProcessingInstruction());
        Assert.assertEquals("1.0", decl.attr("version"));
        Assert.assertEquals("UTF-8", decl.attr("encoding"));
    }

    @Test
    public void testInsert_xmlDeclarationBogusCommentExclamationMark() {
        String xml = "<!declaration version=\"1.0\"?><root/>";
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Assert.assertTrue(doc.childNode(0) instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) doc.childNode(0);
        Assert.assertEquals("declaration", decl.name());
        Assert.assertTrue(decl.isProcessingInstruction());
        Assert.assertEquals("1.0", decl.attr("version"));
    }

    @Test
    public void testInsert_bogusCommentShortData() {
        Token.Comment commentToken = new Token.Comment();
        commentToken.bogus = true;
        commentToken.data.append("?");

        treeBuilder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        treeBuilder.insert(commentToken);

        Assert.assertEquals(1, treeBuilder.doc.childNodeSize());
        Assert.assertTrue(treeBuilder.doc.childNode(0) instanceof Comment);
        Assert.assertEquals("?", ((Comment) treeBuilder.doc.childNode(0)).getData());
    }

    @Test
    public void testInsert_bogusCommentWithoutDeclarationPrefix() {
        Token.Comment commentToken = new Token.Comment();
        commentToken.bogus = true;
        commentToken.data.append("regular bogus comment");

        treeBuilder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        treeBuilder.insert(commentToken);

        Assert.assertEquals(1, treeBuilder.doc.childNodeSize());
        Assert.assertTrue(treeBuilder.doc.childNode(0) instanceof Comment);
        Assert.assertEquals("regular bogus comment", ((Comment) treeBuilder.doc.childNode(0)).getData());
    }

    @Test
    public void testInsert_doctypeNode() {
        String xml = "<!DOCTYPE html SYSTEM \"about:legacy-compat\"><root/>";
        Document doc = treeBuilder.parse(xml, "");

        Assert.assertTrue(doc.childNode(0) instanceof DocumentType);
        DocumentType doctype = (DocumentType) doc.childNode(0);
        Assert.assertEquals("html", doctype.name());
        Assert.assertEquals("about:legacy-compat", doctype.attr("systemId"));
    }

    @Test
    public void testInsert_doctypeWithPublicIdentifier() {
        String xml = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\"><root/>";
        Document doc = treeBuilder.parse(xml, "");

        Assert.assertTrue(doc.childNode(0) instanceof DocumentType);
        DocumentType doctype = (DocumentType) doc.childNode(0);
        Assert.assertEquals("html", doctype.name());
        Assert.assertEquals("-//W3C//DTD XHTML 1.0 Strict//EN", doctype.attr("publicId"));
        Assert.assertEquals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", doctype.attr("systemId"));
    }

    @Test
    public void testPopStackToClose_closesNestedElements() {
        String xml = "<a><b><c>text</c></b></a>";
        Document doc = treeBuilder.parse(xml, "");

        Assert.assertEquals(1, doc.children().size());
        Element a = doc.child(0);
        Assert.assertEquals("a", a.tagName());
        Assert.assertEquals(1, a.children().size());
        Element b = a.child(0);
        Assert.assertEquals("b", b.tagName());
        Assert.assertEquals(1, b.children().size());
        Element c = b.child(0);
        Assert.assertEquals("c", c.tagName());
    }

    @Test
    public void testPopStackToClose_unclosedIntermediateElementsPoppedCorrectly() {
        String xml = "<a><b><c>text</a>";
        Document doc = treeBuilder.parse(xml, "");

        Assert.assertEquals(1, doc.children().size());
        Element a = doc.child(0);
        Assert.assertEquals("a", a.tagName());
        Assert.assertEquals(1, a.children().size());
        Element b = a.child(0);
        Assert.assertEquals("b", b.tagName());
    }

    @Test
    public void testPopStackToClose_tagNotFound_skipsGracefully() {
        String xml = "<root></nonexistent><child>val</child></root>";
        Document doc = treeBuilder.parse(xml, "");

        Assert.assertEquals(1, doc.children().size());
        Element root = doc.child(0);
        Assert.assertEquals("root", root.tagName());
        Assert.assertEquals(1, root.children().size());
        Assert.assertEquals("child", root.child(0).tagName());
    }

    @Test
    public void testProcess_eofToken() {
        Token.EOF eof = new Token.EOF();
        treeBuilder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        boolean result = treeBuilder.process(eof);
        Assert.assertTrue(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProcess_unexpectedToken_throwsValidationException() {
        Token invalidToken = new Token() {
            @Override
            Token reset() {
                return this;
            }
        };
        treeBuilder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        treeBuilder.process(invalidToken);
    }

    @Test
    public void testParseFragment_validFragment_returnsNodeList() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        List<Node> nodes = treeBuilder.parseFragment(
                "<one>First</one><two>Second</two>",
                "http://example.com/",
                errors,
                ParseSettings.preserveCase
        );

        Assert.assertNotNull(nodes);
        Assert.assertEquals(2, nodes.size());
        Assert.assertTrue(nodes.get(0) instanceof Element);
        Assert.assertTrue(nodes.get(1) instanceof Element);
        Assert.assertEquals("one", ((Element) nodes.get(0)).tagName());
        Assert.assertEquals("two", ((Element) nodes.get(1)).tagName());
    }

    @Test
    public void testParseFragment_emptyInput_returnsEmptyList() {
        List<Node> nodes = treeBuilder.parseFragment(
                "",
                "",
                ParseErrorList.noTracking(),
                ParseSettings.preserveCase
        );

        Assert.assertNotNull(nodes);
        Assert.assertEquals(0, nodes.size());
    }

    @Test
    public void testParseViaJsoupHelper_matchesXmlParserSettings() {
        Document doc = Jsoup.parse("<TEST id=\"1\"><CHILD/></TEST>", "http://example.com/", Parser.xmlParser());
        Assert.assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        Assert.assertEquals("TEST", doc.child(0).tagName());
        Assert.assertEquals("1", doc.child(0).attr("id"));
        Assert.assertEquals("CHILD", doc.child(0).child(0).tagName());
    }
}
