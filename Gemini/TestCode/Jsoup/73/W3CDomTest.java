package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class W3CDomTest {

    private W3CDom w3cDom;

    @Before
    public void setUp() {
        w3cDom = new W3CDom();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromJsoup_nullInput_throwsIllegalArgumentException() {
        w3cDom.fromJsoup(null);
    }

    @Test
    public void testFromJsoup_simpleHtmlDocument_convertsCorrectly() {
        String html = "<html><head><title>Test Title</title></head><body><p id=\"p1\">Hello World</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        assertNotNull(w3cDoc);
        assertEquals("html", w3cDoc.getDocumentElement().getTagName());
        NodeList titleNodes = w3cDoc.getElementsByTagName("title");
        assertEquals(1, titleNodes.getLength());
        assertEquals("Test Title", titleNodes.item(0).getTextContent());

        NodeList pNodes = w3cDoc.getElementsByTagName("p");
        assertEquals(1, pNodes.getLength());
        Element pEl = (Element) pNodes.item(0);
        assertEquals("Hello World", pEl.getTextContent());
        assertEquals("p1", pEl.getAttribute("id"));
    }

    @Test
    public void testFromJsoup_withDocumentLocation_setsDocumentUri() {
        String html = "<html><head></head><body></body></html>";
        String baseUri = "https://example.com/test/page.html";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html, baseUri);

        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        assertNotNull(w3cDoc);
        assertEquals(baseUri, w3cDoc.getDocumentURI());
    }

    @Test
    public void testFromJsoup_withBlankLocation_doesNotSetDocumentUri() {
        String html = "<html><head></head><body></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html, "");

        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        assertNotNull(w3cDoc);
        assertNull(w3cDoc.getDocumentURI());
    }

    @Test
    public void testConvert_withCommentsAndDataNodes_convertsAllNodes() {
        String html = "<html><head><script>var x = 10;</script><style>body { color: red; }</style></head>"
                + "<body><!-- This is a comment --><div>Content</div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDoc);

        String outString = w3cDom.asString(w3cDoc);
        assertTrue(outString.contains("var x = 10;"));
        assertTrue(outString.contains("body { color: red; }"));
        assertTrue(outString.contains("<!--This is a comment-->") || outString.contains("<!-- This is a comment -->"));
        assertTrue(outString.contains("Content"));
    }

    @Test
    public void testConvert_withNamespaces_handlesDefaultAndPrefixedNamespaces() {
        String xml = "<root xmlns=\"http://default.namespace.com\" xmlns:custom=\"http://custom.namespace.com\">"
                + "<child attr=\"normal\">Default Child</child>"
                + "<custom:item custom:attr=\"val\">Custom Child</custom:item>"
                + "</root>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(xml, "", Parser.xmlParser());

        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDoc);

        Element root = w3cDoc.getDocumentElement();
        assertEquals("http://default.namespace.com", root.getNamespaceURI());

        NodeList childList = w3cDoc.getElementsByTagName("child");
        assertEquals(1, childList.getLength());
        assertEquals("http://default.namespace.com", childList.item(0).getNamespaceURI());

        NodeList customItemList = w3cDoc.getElementsByTagName("custom:item");
        assertEquals(1, customItemList.getLength());
        assertEquals("http://custom.namespace.com", customItemList.item(0).getNamespaceURI());
    }

    @Test
    public void testConvert_nestedElements_testsHierarchyAndTailMethod() {
        String html = "<html><body><div><ul><li><span>Item 1</span></li><li>Item 2</li></ul></div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDoc);

        NodeList liList = w3cDoc.getElementsByTagName("li");
        assertEquals(2, liList.getLength());
        assertEquals("Item 1", liList.item(0).getTextContent());
        assertEquals("Item 2", liList.item(1).getTextContent());
    }

    @Test
    public void testConvert_withSpecialAndInvalidAttributeNames_filtersInvalidAttributes() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<div>Content</div>");
        org.jsoup.nodes.Element div = jsoupDoc.selectFirst("div");

        div.attr("valid-name", "1");
        div.attr("valid:name", "2");
        div.attr("valid_name", "3");
        div.attr("valid.name", "4");
        div.attr("123invalid", "5"); // starts with digit: regex replace leaves digits, fails matches
        div.attr("@#$%invalid-start", "6"); // sanitized to invalid-start, which is valid start
        div.attr("$$$", "7"); // sanitized to empty string, matches returns false

        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        Element divEl = (Element) w3cDoc.getElementsByTagName("div").item(0);

        assertEquals("1", divEl.getAttribute("valid-name"));
        assertEquals("2", divEl.getAttribute("valid:name"));
        assertEquals("3", divEl.getAttribute("valid_name"));
        assertEquals("4", divEl.getAttribute("valid.name"));
        assertFalse(divEl.hasAttribute("123invalid"));
        assertEquals("6", divEl.getAttribute("invalid-start"));
        assertEquals("", divEl.getAttribute("$$$"));
    }

    @Test
    public void testConvert_withUnhandledNodeType_doesNotThrow() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<div>Content</div>");
        org.jsoup.nodes.Element div = jsoupDoc.selectFirst("div");

        // Add a custom unhandled leaf node
        div.appendChild(new LeafNode() {
            @Override
            public String nodeName() {
                return "#custom";
            }

            @Override
            void outerHtmlHead(Appendable accum, int depth, org.jsoup.nodes.Document.OutputSettings out) {
            }

            @Override
            void outerHtmlTail(Appendable accum, int depth, org.jsoup.nodes.Document.OutputSettings out) {
            }
        });

        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDoc);
        Element divEl = (Element) w3cDoc.getElementsByTagName("div").item(0);
        assertEquals("Content", divEl.getTextContent());
    }

    @Test
    public void testAsString_serializesW3CDocument() {
        String html = "<html><head><title>Test</title></head><body><p>Hello</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        String result = w3cDom.asString(w3cDoc);

        assertNotNull(result);
        assertTrue(result.contains("<title>Test</title>"));
        assertTrue(result.contains("<p>Hello</p>"));
    }

    @Test(expected = IllegalStateException.class)
    public void testFromJsoup_parserConfigurationException_throwsIllegalStateException() {
        W3CDom failingW3CDom = new W3CDom();
        failingW3CDom.factory = new DocumentBuilderFactory() {
            @Override
            public DocumentBuilder newDocumentBuilder() throws ParserConfigurationException {
                throw new ParserConfigurationException("Simulated parser exception");
            }

            @Override
            public void setAttribute(String name, Object value) {
            }

            @Override
            public Object getAttribute(String name) {
                return null;
            }

            @Override
            public void setFeature(String name, boolean value) {
            }

            @Override
            public boolean getFeature(String name) {
                return false;
            }
        };

        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body></body></html>");
        failingW3CDom.fromJsoup(jsoupDoc);
    }
}
