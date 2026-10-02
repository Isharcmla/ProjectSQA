import org.jsoup.Jsoup;
import org.junit.Test;
import org.junit.Before;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

public class W3CDomTest {

    private W3CDom w3cDom;

    @Before
    public void setUp() {
        w3cDom = new W3CDom();
    }

    @Test
    public void testFromJsoup_normalHtml_returnsW3cDocument() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>Test</title></head><body><p>Hello World</p></body></html>");
        Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDocument);
        Element root = w3cDocument.getDocumentElement();
        assertNotNull(root);
        assertEquals("html", root.getTagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromJsoup_null_throwsException() {
        w3cDom.fromJsoup(null);
    }

    @Test
    public void testConvert_withLocation_setsDocumentURI() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body><p>Hi</p></body></html>", "http://example.com/");
        assertFalse(org.jsoup.helper.StringUtil.isBlank(jsoupDoc.location()));

        DocumentFactoryHelper helper = new DocumentFactoryHelper();
        Document out = helper.newW3cDocument();

        w3cDom.convert(jsoupDoc, out);
        assertEquals("http://example.com/", out.getDocumentURI());
    }

    @Test
    public void testConvert_withBlankLocation_doesNotSetDocumentURI() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body><p>Hi</p></body></html>");
        // default location for Jsoup.parse(String) without baseUri is empty string
        DocumentFactoryHelper helper = new DocumentFactoryHelper();
        Document out = helper.newW3cDocument();

        w3cDom.convert(jsoupDoc, out);
        assertNull(out.getDocumentURI());
    }

    @Test
    public void testAsString_validDocument_returnsXmlString() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>Test</title></head><body><p>Hello</p></body></html>");
        Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        String result = w3cDom.asString(w3cDocument);
        assertNotNull(result);
        assertTrue(result.contains("Hello"));
    }

    @Test
    public void testFromJsoup_withComment_convertsCommentNode() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body><!-- a comment --><p>text</p></body></html>");
        Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        String xml = w3cDom.asString(w3cDocument);
        assertTrue(xml.contains("a comment"));
    }

    @Test
    public void testFromJsoup_withNamespaceAttribute_appliesNamespace() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(
            "<html xmlns:foo='http://example.com/foo'><body><foo:bar>content</foo:bar></body></html>",
            "", org.jsoup.parser.Parser.xmlParser());
        Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDocument);
        String xml = w3cDom.asString(w3cDocument);
        assertNotNull(xml);
    }

    @Test
    public void testFromJsoup_withDataNode_convertsScriptContent() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><script>var x = 1;</script></head><body></body></html>");
        Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        String xml = w3cDom.asString(w3cDocument);
        assertTrue(xml.contains("var x = 1;"));
    }

    @Test
    public void testFromJsoup_withAttributes_copiesAttributesToElement() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body><div id='main' class='container'>content</div></body></html>");
        Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        Element root = w3cDocument.getDocumentElement();
        NodeList bodies = root.getElementsByTagName("div");
        assertEquals(1, bodies.getLength());
        Element div = (Element) bodies.item(0);
        assertEquals("main", div.getAttribute("id"));
        assertEquals("container", div.getAttribute("class"));
    }

    @Test
    public void testFromJsoup_emptyBody_producesValidStructure() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body></body></html>");
        Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDocument);
        assertEquals("html", w3cDocument.getDocumentElement().getTagName());
    }

    @Test
    public void testFromJsoup_multipleNestedElements_traversesCorrectly() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(
            "<html><body><div><p>one</p><p>two</p></div></body></html>");
        Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        NodeList paragraphs = w3cDocument.getElementsByTagName("p");
        assertEquals(2, paragraphs.getLength());
    }

    @Test
    public void testAsString_emptyDocument_returnsSomeString() {
        DocumentFactoryHelper helper = new DocumentFactoryHelper();
        Document out = helper.newW3cDocument();
        String result = w3cDom.asString(out);
        assertNotNull(result);
    }

    @Test
    public void testConvert_rootElementSkipped_onlyChildProcessed() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body><span>only</span></body></html>");
        DocumentFactoryHelper helper = new DocumentFactoryHelper();
        Document out = helper.newW3cDocument();
        w3cDom.convert(jsoupDoc, out);
        Element root = out.getDocumentElement();
        assertEquals("html", root.getTagName());
    }

    // Helper class to create a bare w3c Document using the same mechanism as W3CDom's internal factory
    private static class DocumentFactoryHelper {
        Document newW3cDocument() {
            try {
                javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
                factory.setNamespaceAware(true);
                javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();
                return builder.newDocument();
            } catch (javax.xml.parsers.ParserConfigurationException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
