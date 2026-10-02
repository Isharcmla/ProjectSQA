package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class W3CDomTest {

    @Test
    public void testFromJsoup_standardHtmlDocument_convertedSuccessfully() {
        String html = "<html><head><title>Test Title</title></head><body><p class=\"intro\">Hello World</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        Assert.assertNotNull(w3cDoc);
        Assert.assertEquals("html", w3cDoc.getDocumentElement().getTagName());
        NodeList titleList = w3cDoc.getElementsByTagName("title");
        Assert.assertEquals(1, titleList.getLength());
        Assert.assertEquals("Test Title", titleList.item(0).getTextContent());

        NodeList pList = w3cDoc.getElementsByTagName("p");
        Assert.assertEquals(1, pList.getLength());
        Element pElem = (Element) pList.item(0);
        Assert.assertEquals("intro", pElem.getAttribute("class"));
        Assert.assertEquals("Hello World", pElem.getTextContent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromJsoup_nullInput_throwsIllegalArgumentException() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.fromJsoup(null);
    }

    @Test
    public void testConvert_withDocumentLocation_setsDocumentUri() {
        String html = "<html><head></head><body><p>Content</p></body></html>";
        String baseUri = "https://example.com/page.html";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html, baseUri);

        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        Assert.assertEquals(baseUri, w3cDoc.getDocumentURI());
    }

    @Test
    public void testConvert_withBlankDocumentLocation_documentUriNotSet() {
        String html = "<html><head></head><body><p>Content</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html, "");

        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        Assert.assertNull(w3cDoc.getDocumentURI());
    }

    @Test
    public void testConvert_withNamespacesAndPrefixes_namespacedCorrectly() {
        String xml = "<root xmlns=\"http://example.com/default\" xmlns:custom=\"http://example.com/custom\">" +
                "<custom:item id=\"1\">Value</custom:item>" +
                "<item>Default NS Value</item>" +
                "</root>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(xml, "", org.jsoup.parser.Parser.xmlParser());

        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        Element root = w3cDoc.getDocumentElement();
        Assert.assertEquals("root", root.getTagName());
        Assert.assertEquals("http://example.com/default", root.getNamespaceURI());

        NodeList customItems = w3cDoc.getElementsByTagNameNS("http://example.com/custom", "item");
        Assert.assertEquals(1, customItems.getLength());
        Assert.assertEquals("custom:item", customItems.item(0).getNodeName());
        Assert.assertEquals("http://example.com/custom", customItems.item(0).getNamespaceURI());
        Assert.assertEquals("1", ((Element) customItems.item(0)).getAttribute("id"));
    }

    @Test
    public void testConvert_withInvalidAttributeCharacters_cleanedSuccessfully() {
        String html = "<html><head></head><body><p invalid@attr#name=\"sanitized\">Text</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        Element p = (Element) w3cDoc.getElementsByTagName("p").item(0);
        Assert.assertTrue(p.hasAttribute("invalidattrname"));
        Assert.assertEquals("sanitized", p.getAttribute("invalidattrname"));
    }

    @Test
    public void testConvert_withCommentsAndDataNodes_nodesPreserved() {
        String html = "<html><head><script>var x = 10;</script></head>" +
                "<body><!-- A comment node --><p>Text</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        NodeList scripts = w3cDoc.getElementsByTagName("script");
        Assert.assertEquals(1, scripts.getLength());
        Assert.assertEquals("var x = 10;", scripts.item(0).getTextContent());

        String serialized = w3cDom.asString(w3cDoc);
        Assert.assertTrue(serialized.contains("<!-- A comment node -->"));
        Assert.assertTrue(serialized.contains("var x = 10;"));
    }

    @Test
    public void testConvert_withNestedElements_handlesDepthTraverseCorrectly() {
        String html = "<div><span><a><strong>Deep</strong></a></span></div>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        NodeList strongList = w3cDoc.getElementsByTagName("strong");
        Assert.assertEquals(1, strongList.getLength());
        Assert.assertEquals("Deep", strongList.item(0).getTextContent());
    }

    @Test
    public void testAsString_validDocument_returnsXmlString() {
        String html = "<html><head><title>Title</title></head><body><p>Hello</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        String output = w3cDom.asString(w3cDoc);

        Assert.assertNotNull(output);
        Assert.assertTrue(output.contains("<title>Title</title>"));
        Assert.assertTrue(output.contains("<p>Hello</p>"));
    }

    @Test
    public void testW3CBuilder_head_unhandledNodeType_ignoredGracefully() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            W3CDom.W3CBuilder visitor = new W3CDom.W3CBuilder(doc);

            Node unhandledNode = new Node("http://example.com") {
                @Override
                public String nodeName() {
                    return "#unhandled";
                }
            };

            visitor.head(unhandledNode, 0);
            visitor.tail(unhandledNode, 0);
            Assert.assertNull(doc.getDocumentElement());
        } catch (ParserConfigurationException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testW3CBuilder_head_dataNodeExplicitly_appendsTextNode() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            W3CDom.W3CBuilder visitor = new W3CDom.W3CBuilder(doc);

            org.jsoup.nodes.Element root = new org.jsoup.nodes.Element("root");
            visitor.head(root, 0);

            DataNode dataNode = new DataNode("custom data", "");
            visitor.head(dataNode, 1);

            Assert.assertNotNull(doc.getDocumentElement());
            Assert.assertEquals("custom data", doc.getDocumentElement().getTextContent());
        } catch (ParserConfigurationException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testFromJsoup_parserConfigurationException_throwsIllegalStateException() {
        W3CDom w3cDom = new W3CDom() {
            {
                this.factory = new DocumentBuilderFactory() {
                    @Override
                    public DocumentBuilder newDocumentBuilder() throws ParserConfigurationException {
                        throw new ParserConfigurationException("Simulated error");
                    }

                    @Override
                    public void setAttribute(String name, Object value) {}

                    @Override
                    public Object getAttribute(String name) {
                        return null;
                    }

                    @Override
                    public void setFeature(String name, boolean value) {}

                    @Override
                    public boolean getFeature(String name) {
                        return false;
                    }
                };
            }
        };

        org.jsoup.nodes.Document doc = Jsoup.parse("<html><body></body></html>");
        w3cDom.fromJsoup(doc);
    }
}
