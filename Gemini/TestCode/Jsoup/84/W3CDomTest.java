package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.DocumentType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class W3CDomTest {

    private W3CDom w3cDom;

    @Before
    public void setUp() {
        w3cDom = new W3CDom();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromJsoup_nullInput_throwsException() {
        w3cDom.fromJsoup(null);
    }

    @Test
    public void testFromJsoup_simpleHtml_convertsSuccessfully() {
        String html = "<html><head><title>Test Title</title></head><body><p>Hello World</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        Assert.assertNotNull(w3cDoc);
        Assert.assertEquals("html", w3cDoc.getDocumentElement().getTagName());
        Assert.assertEquals("Test Title", w3cDoc.getElementsByTagName("title").item(0).getTextContent());
        Assert.assertEquals("Hello World", w3cDoc.getElementsByTagName("p").item(0).getTextContent());
    }

    @Test
    public void testFromJsoup_withLocation_setsDocumentURI() {
        String html = "<html><head></head><body><p>Location test</p></body></html>";
        String baseUri = "https://example.com/test.html";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html, baseUri);

        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        Assert.assertNotNull(w3cDoc);
        Assert.assertEquals(baseUri, w3cDoc.getDocumentURI());
    }

    @Test
    public void testFromJsoup_withEmptyLocation_doesNotSetURI() {
        String html = "<html><head></head><body><p>No location</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        Assert.assertNotNull(w3cDoc);
        Assert.assertNull(w3cDoc.getDocumentURI());
    }

    @Test
    public void testFromJsoup_withCommentsAndDataNodes() {
        String html = "<html><head><script>var x = 10;</script><style>body { color: red; }</style></head>"
                + "<body><!-- This is a comment --><p>Text</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        Assert.assertNotNull(w3cDoc);
        Node scriptNode = w3cDoc.getElementsByTagName("script").item(0);
        Assert.assertEquals("var x = 10;", scriptNode.getTextContent());

        Node styleNode = w3cDoc.getElementsByTagName("style").item(0);
        Assert.assertEquals("body { color: red; }", styleNode.getTextContent());

        Node bodyNode = w3cDoc.getElementsByTagName("body").item(0);
        NodeList childNodes = bodyNode.getChildNodes();
        boolean foundComment = false;
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node child = childNodes.item(i);
            if (child.getNodeType() == Node.COMMENT_NODE) {
                foundComment = true;
                Assert.assertEquals(" This is a comment ", child.getNodeValue());
            }
        }
        Assert.assertTrue(foundComment);
    }

    @Test
    public void testFromJsoup_withNamespacesAndPrefixedElements() {
        String html = "<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:custom=\"http://example.com/custom\">"
                + "<head></head><body><custom:element id=\"1\">Namespaced Text</custom:element></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        Assert.assertNotNull(w3cDoc);
        Assert.assertEquals("http://www.w3.org/1999/xhtml", w3cDoc.getDocumentElement().getNamespaceURI());

        NodeList customElements = w3cDoc.getElementsByTagName("custom:element");
        Assert.assertEquals(1, customElements.getLength());
        org.w3c.dom.Element customEl = (org.w3c.dom.Element) customElements.item(0);
        Assert.assertEquals("http://example.com/custom", customEl.getNamespaceURI());
        Assert.assertEquals("custom:element", customEl.getTagName());
        Assert.assertEquals("1", customEl.getAttribute("id"));
        Assert.assertEquals("Namespaced Text", customEl.getTextContent());
    }

    @Test
    public void testFromJsoup_withInvalidXmlAttributes_filtersProperly() {
        String html = "<html><body><div valid-attr=\"ok\" 123invalid=\"bad\" _valid=\"yes\" ?bad=\"no\">Text</div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        org.w3c.dom.Element div = (org.w3c.dom.Element) w3cDoc.getElementsByTagName("div").item(0);
        Assert.assertEquals("ok", div.getAttribute("valid-attr"));
        Assert.assertEquals("yes", div.getAttribute("_valid"));
        Assert.assertFalse(div.hasAttribute("123invalid"));
        Assert.assertFalse(div.hasAttribute("?bad"));
    }

    @Test
    public void testFromJsoup_withUnhandledNodeType_skipsGracefully() {
        String html = "<!DOCTYPE html><html><head></head><body><p>Doc with Doctype</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);
        // Ensure DocumentType node exists
        jsoupDoc.child(0).before(new DocumentType("html", "", ""));

        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        Assert.assertNotNull(w3cDoc);
        Assert.assertEquals("html", w3cDoc.getDocumentElement().getTagName());
    }

    @Test
    public void testConvert_manualW3cDocument_populatesCorrectly() throws Exception {
        String html = "<html lang=\"en\"><head><title>Manual Convert</title></head><body><span>Content</span></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document w3cDoc = db.newDocument();

        w3cDom.convert(jsoupDoc, w3cDoc);

        Assert.assertEquals("html", w3cDoc.getDocumentElement().getTagName());
        Assert.assertEquals("en", w3cDoc.getDocumentElement().getAttribute("lang"));
        Assert.assertEquals("Manual Convert", w3cDoc.getElementsByTagName("title").item(0).getTextContent());
        Assert.assertEquals("Content", w3cDoc.getElementsByTagName("span").item(0).getTextContent());
    }

    @Test
    public void testAsString_validDocument_serializesToString() {
        String html = "<html><head><title>Serialize Test</title></head><body><p>Hello XML</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        String result = w3cDom.asString(w3cDoc);

        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("<title>Serialize Test</title>"));
        Assert.assertTrue(result.contains("<p>Hello XML</p>"));
    }

    @Test(expected = IllegalStateException.class)
    public void testFromJsoup_parserConfigurationException_throwsIllegalStateException() {
        W3CDom faultyW3cDom = new W3CDom() {
            {
                this.factory = new DocumentBuilderFactory() {
                    @Override
                    public DocumentBuilder newDocumentBuilder() throws ParserConfigurationException {
                        throw new ParserConfigurationException("Simulated configuration error");
                    }

                    @Override
                    public void setAttribute(String name, Object value) throws IllegalArgumentException {
                    }

                    @Override
                    public Object getAttribute(String name) throws IllegalArgumentException {
                        return null;
                    }

                    @Override
                    public void setFeature(String name, boolean value) throws ParserConfigurationException {
                    }

                    @Override
                    public boolean getFeature(String name) throws ParserConfigurationException {
                        return false;
                    }
                };
            }
        };

        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body></body></html>");
        faultyW3cDom.fromJsoup(jsoupDoc);
    }

    @Test
    public void testNestedElements_traversesAndMaintainsHierarchy() {
        String html = "<div><ul><li>Item 1</li><li>Item 2</li></ul></div>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        NodeList listItems = w3cDoc.getElementsByTagName("li");
        Assert.assertEquals(2, listItems.getLength());
        Assert.assertEquals("Item 1", listItems.item(0).getTextContent());
        Assert.assertEquals("Item 2", listItems.item(1).getTextContent());
        Assert.assertEquals("ul", listItems.item(0).getParentNode().getNodeName());
    }
}
