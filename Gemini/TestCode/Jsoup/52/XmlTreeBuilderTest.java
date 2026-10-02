package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class XmlTreeBuilderTest {

    @Test
    public void testParse_simpleXml_createsXmlDocument() {
        String xml = "<root><child id=\"1\">Hello</child></root>";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Assert.assertNotNull(doc);
        Assert.assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        Assert.assertEquals(1, doc.children().size());
        Element root = doc.child(0);
        Assert.assertEquals("root", root.tagName());
        Assert.assertEquals(1, root.children().size());
        Element child = root.child(0);
        Assert.assertEquals("child", child.tagName());
        Assert.assertEquals("1", child.attr("id"));
        Assert.assertEquals("Hello", child.text());
    }

    @Test
    public void testParse_emptyString_returnsEmptyDoc() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse("", "http://example.com/");
        Assert.assertNotNull(doc);
        Assert.assertEquals(0, doc.children().size());
    }

    @Test
    public void testParse_selfClosingKnownAndUnknownTags() {
        String xml = "<root><unknownTag self=\"true\" /><br/><customTag></customTag></root>";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element root = doc.child(0);
        Assert.assertEquals(3, root.children().size());
        Element unknownTag = root.child(0);
        Assert.assertEquals("unknownTag", unknownTag.tagName());
        Assert.assertTrue(unknownTag.tag().isSelfClosing());

        Element brTag = root.child(1);
        Assert.assertEquals("br", brTag.tagName());

        Element customTag = root.child(2);
        Assert.assertEquals("customTag", customTag.tagName());
    }

    @Test
    public void testParse_doctypeToken_createsDocumentTypeNode() {
        String xml = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\"><root/>";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        List<Node> nodes = doc.childNodes();
        Assert.assertTrue(nodes.size() >= 2);
        Assert.assertTrue(nodes.get(0) instanceof DocumentType);
        DocumentType doctype = (DocumentType) nodes.get(0);
        Assert.assertEquals("html", doctype.attr("name"));
        Assert.assertEquals("-//W3C//DTD XHTML 1.0 Strict//EN", doctype.attr("publicId"));
        Assert.assertEquals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", doctype.attr("systemId"));
    }

    @Test
    public void testParse_regularComment_createsCommentNode() {
        String xml = "<root><!-- This is a comment --></root>";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element root = doc.child(0);
        Assert.assertEquals(1, root.childNodeSize());
        Assert.assertTrue(root.childNode(0) instanceof Comment);
        Comment comment = (Comment) root.childNode(0);
        Assert.assertEquals(" This is a comment ", comment.getData());
    }

    @Test
    public void testParse_xmlDeclarationWithQuestionMark_createsXmlDeclaration() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root/>";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Node firstNode = doc.childNode(0);
        Assert.assertTrue(firstNode instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) firstNode;
        Assert.assertEquals("xml version=\"1.0\" encoding=\"UTF-8\"", decl.getWholeDeclaration());
        Assert.assertFalse(decl.toString().startsWith("<!"));
    }

    @Test
    public void testParse_xmlDeclarationWithExclamationMark_createsXmlDeclaration() {
        String xml = "<!xml version=\"1.0\" encoding=\"UTF-8\"!><root/>";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Node firstNode = doc.childNode(0);
        Assert.assertTrue(firstNode instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) firstNode;
        Assert.assertTrue(decl.getWholeDeclaration().startsWith("xml"));
    }

    @Test
    public void testInsertComment_bogusShortOrNonDeclaration_createsComment() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("<root/>", "http://example.com/", ParseErrorList.noTracking());

        Token.Comment bogusShort = new Token.Comment();
        bogusShort.data.append("?");
        bogusShort.bogus = true;
        treeBuilder.insert(bogusShort);

        Token.Comment bogusNoPrefix = new Token.Comment();
        bogusNoPrefix.data.append("regular bogus comment");
        bogusNoPrefix.bogus = true;
        treeBuilder.insert(bogusNoPrefix);

        Token.Comment bogusEmpty = new Token.Comment();
        bogusEmpty.bogus = true;
        treeBuilder.insert(bogusEmpty);

        List<Node> childNodes = treeBuilder.doc.childNodes();
        boolean foundComment = false;
        for (Node node : childNodes) {
            if (node instanceof Comment && !(node instanceof XmlDeclaration)) {
                foundComment = true;
                break;
            }
        }
        Assert.assertTrue(foundComment);
    }

    @Test
    public void testPopStackToClose_unmatchedClosingTag_skipsWithoutError() {
        String xml = "<root></unmatched><child>Text</child></root>";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element root = doc.child(0);
        Assert.assertEquals(1, root.children().size());
        Assert.assertEquals("child", root.child(0).tagName());
    }

    @Test
    public void testPopStackToClose_nestedUnclosedTags_popsCorrectly() {
        String xml = "<root><a><b><c>test</a></root>";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element root = doc.child(0);
        Assert.assertEquals(1, root.children().size());
        Element a = root.child(0);
        Assert.assertEquals("a", a.tagName());
        Assert.assertTrue(a.select("b").size() > 0);
        Assert.assertTrue(a.select("c").size() > 0);
    }

    @Test
    public void testParseFragment_validFragment_returnsListOfNodes() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        ParseErrorList errorList = ParseErrorList.tracking(10);
        List<Node> nodes = treeBuilder.parseFragment("<item>1</item><item>2</item>", "http://example.com/", errorList);

        Assert.assertNotNull(nodes);
        Assert.assertEquals(2, nodes.size());
        Assert.assertTrue(nodes.get(0) instanceof Element);
        Assert.assertEquals("item", ((Element) nodes.get(0)).tagName());
        Assert.assertEquals("1", ((Element) nodes.get(0)).text());
        Assert.assertTrue(nodes.get(1) instanceof Element);
        Assert.assertEquals("item", ((Element) nodes.get(1)).tagName());
        Assert.assertEquals("2", ((Element) nodes.get(1)).text());
    }

    @Test
    public void testParseFragment_emptyFragment_returnsEmptyList() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        List<Node> nodes = treeBuilder.parseFragment("", "http://example.com/", ParseErrorList.noTracking());

        Assert.assertNotNull(nodes);
        Assert.assertEquals(0, nodes.size());
    }

    @Test
    public void testProcess_characterAndDoctypeDirectTokens() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("<root/>", "http://example.com/", ParseErrorList.noTracking());

        Token.Character charToken = new Token.Character();
        charToken.data("Sample Text");
        boolean charProcessed = treeBuilder.process(charToken);
        Assert.assertTrue(charProcessed);

        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name.append("html");
        doctypeToken.publicIdentifier.append("pubId");
        doctypeToken.systemIdentifier.append("sysId");
        boolean doctypeProcessed = treeBuilder.process(doctypeToken);
        Assert.assertTrue(doctypeProcessed);

        Token.EOF eofToken = new Token.EOF();
        boolean eofProcessed = treeBuilder.process(eofToken);
        Assert.assertTrue(eofProcessed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProcess_unexpectedToken_throwsException() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("<root/>", "http://example.com/", ParseErrorList.noTracking());

        Token dummyToken = new Token() {
            // Unused anonymous implementation with a null or unhandled type
        };
        // Reflection or direct call when token.type is null/unhandled triggers default branch
        treeBuilder.process(dummyToken);
    }

    @Test
    public void testJsoupParserIntegration_xmlParserSettings() {
        String xml = "<CHECK><ITEM val=\"1\"/><ITEM val=\"2\"/></CHECK>";
        Document doc = Jsoup.parse(xml, "http://example.com/", Parser.xmlParser());

        Assert.assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        Assert.assertEquals(1, doc.children().size());
        Assert.assertEquals(2, doc.select("ITEM").size());
    }
}
