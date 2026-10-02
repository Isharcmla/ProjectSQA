package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class XmlTreeBuilderTest {

    @Test
    public void testParse_simpleXml_createsCorrectDocumentStructure() {
        String xml = "<root id=\"1\"><child>content</child></root>";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Assert.assertNotNull(doc);
        Assert.assertEquals("http://example.com/", doc.baseUri());
        Element root = doc.child(0);
        Assert.assertEquals("root", root.tagName());
        Assert.assertEquals("1", root.attr("id"));
        Assert.assertEquals("child", root.child(0).tagName());
        Assert.assertEquals("content", root.child(0).text());
    }

    @Test
    public void testParse_doctypeDeclaration_insertsDocumentTypeNode() {
        String xml = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\"><root/>";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Assert.assertEquals(2, doc.childNodeSize());
        Assert.assertTrue(doc.childNode(0) instanceof DocumentType);

        DocumentType doctype = (DocumentType) doc.childNode(0);
        Assert.assertEquals("html", doctype.attr("name"));
        Assert.assertEquals("-//W3C//DTD XHTML 1.0 Strict//EN", doctype.attr("publicId"));
        Assert.assertEquals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", doctype.attr("systemId"));
    }

    @Test
    public void testParse_commentNode_insertsComment() {
        String xml = "<!-- Pre-root comment --><root><!-- Inner comment -->text</root><!-- Post-root comment -->";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Assert.assertTrue(doc.childNode(0) instanceof Comment);
        Comment preComment = (Comment) doc.childNode(0);
        Assert.assertEquals(" Pre-root comment ", preComment.getData());

        Element root = doc.selectFirst("root");
        Assert.assertNotNull(root);
        Assert.assertTrue(root.childNode(0) instanceof Comment);
        Comment innerComment = (Comment) root.childNode(0);
        Assert.assertEquals(" Inner comment ", innerComment.getData());

        Assert.assertTrue(doc.childNode(doc.childNodeSize() - 1) instanceof Comment);
        Comment postComment = (Comment) doc.childNode(doc.childNodeSize() - 1);
        Assert.assertEquals(" Post-root comment ", postComment.getData());
    }

    @Test
    public void testParse_characterTokens_insertsTextNodes() {
        String xml = "<root>Hello <b>World</b> &amp; Universe</root>";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element root = doc.child(0);
        Assert.assertTrue(root.childNode(0) instanceof TextNode);
        Assert.assertEquals("Hello ", ((TextNode) root.childNode(0)).getWholeText());
        Assert.assertEquals("World", root.child(0).text());
        Assert.assertTrue(root.childNode(2) instanceof TextNode);
        Assert.assertEquals(" & Universe", ((TextNode) root.childNode(2)).getWholeText());
    }

    @Test
    public void testParse_unknownSelfClosingTag_setsTagSelfClosing() {
        String xml = "<root><custom-tag attr=\"val\" /><other-tag/></root>";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element customTag = doc.selectFirst("custom-tag");
        Assert.assertNotNull(customTag);
        Assert.assertTrue(customTag.tag().isSelfClosing());
        Assert.assertEquals("val", customTag.attr("attr"));

        Element otherTag = doc.selectFirst("other-tag");
        Assert.assertNotNull(otherTag);
        Assert.assertTrue(otherTag.tag().isSelfClosing());
    }

    @Test
    public void testParse_knownTagSelfClosing_acknowledgesSelfClosing() {
        String xml = "<root><img src=\"test.png\"/><br/></root>";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element img = doc.selectFirst("img");
        Assert.assertNotNull(img);
        Assert.assertEquals("test.png", img.attr("src"));

        Element br = doc.selectFirst("br");
        Assert.assertNotNull(br);
    }

    @Test
    public void testPopStackToClose_endTagNotFound_skipsSilently() {
        String xml = "<root><child>text</child></notFound></root>";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element root = doc.selectFirst("root");
        Assert.assertNotNull(root);
        Assert.assertEquals(1, root.children().size());
        Assert.assertEquals("child", root.child(0).tagName());
    }

    @Test
    public void testPopStackToClose_unclosedNestedElementsClosedByAncestor_popsIntermediateTags() {
        String xml = "<root><a><b><c>text</a></root>";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Element a = doc.selectFirst("a");
        Assert.assertNotNull(a);
        Assert.assertNotNull(a.selectFirst("b"));
        Assert.assertNotNull(a.selectFirst("c"));
        Assert.assertEquals("text", a.text());
        // Verify stack unwound back to root
        Element following = doc.createElement("following");
        doc.child(0).appendChild(following);
        Assert.assertEquals("following", doc.child(0).children().get(1).tagName());
    }

    @Test
    public void testParse_emptyString_returnsDocumentWithBaseUri() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse("", "http://example.com/");

        Assert.assertNotNull(doc);
        Assert.assertEquals("http://example.com/", doc.baseUri());
        Assert.assertEquals(0, doc.childNodeSize());
    }

    @Test
    public void testParse_whitespaceOnly_createsTextNode() {
        String xml = "   \n\t   ";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        Assert.assertNotNull(doc);
        Assert.assertEquals(1, doc.childNodeSize());
        Assert.assertTrue(doc.childNode(0) instanceof TextNode);
    }

    @Test
    public void testInitialiseParse_populatesStackWithDocument() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("<root></root>", "http://example.com/", ParseErrorList.noTracking());

        Assert.assertEquals(1, treeBuilder.stack.size());
        Assert.assertSame(treeBuilder.doc, treeBuilder.stack.peek());
    }

    @Test
    public void testProcess_directTokenCalls_coverAllTokenTypes() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("", "http://example.com/", ParseErrorList.noTracking());

        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.publicIdentifier.append("pubId");
        doctype.systemIdentifier.append("sysId");
        boolean resDoctype = treeBuilder.process(doctype);
        Assert.assertTrue(resDoctype);

        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("item", new org.jsoup.nodes.Attributes());
        boolean resStart = treeBuilder.process(startTag);
        Assert.assertTrue(resStart);
        Assert.assertEquals("item", treeBuilder.currentElement().tagName());

        Token.Character character = new Token.Character();
        character.data("sample text");
        boolean resChar = treeBuilder.process(character);
        Assert.assertTrue(resChar);

        Token.Comment comment = new Token.Comment();
        comment.getData().append("sample comment");
        boolean resComment = treeBuilder.process(comment);
        Assert.assertTrue(resComment);

        Token.EndTag endTag = new Token.EndTag();
        endTag.name("item");
        boolean resEnd = treeBuilder.process(endTag);
        Assert.assertTrue(resEnd);

        Token.EOF eof = new Token.EOF();
        boolean resEof = treeBuilder.process(eof);
        Assert.assertTrue(resEof);

        Document doc = treeBuilder.doc;
        Assert.assertNotNull(doc.selectFirst("item"));
        Assert.assertEquals("sample text", doc.selectFirst("item").text());
    }

    @Test
    public void testParseFragment_xmlSnippet_parsesCorrectly() {
        String fragment = "<item id=\"1\">Text</item><item id=\"2\">Text2</item>";
        List<org.jsoup.nodes.Node> nodes = Parser.parseXmlFragment(fragment, "http://example.com/");

        Assert.assertEquals(2, nodes.size());
        Assert.assertEquals("item", nodes.get(0).nodeName());
        Assert.assertEquals("1", nodes.get(0).attr("id"));
        Assert.assertEquals("item", nodes.get(1).nodeName());
        Assert.assertEquals("2", nodes.get(1).attr("id"));
    }

    @Test
    public void testParse_cdataSection_parsesAsText() {
        String xml = "<root><![CDATA[<unescaped> & data]]></root>";
        Document doc = Jsoup.parse(xml, "http://example.com/", Parser.xmlParser());

        Element root = doc.selectFirst("root");
        Assert.assertNotNull(root);
        Assert.assertEquals("<unescaped> & data", root.text());
    }
}
