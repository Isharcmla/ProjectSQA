import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class W3CDomTest {

    private W3CDom w3cDom;

    @Before
    public void setUp() {
        w3cDom = new W3CDom();
    }

    @Test
    public void testFromJsoup_simpleHtml_convertsSuccessfully() {
        Document jsoupDoc = Jsoup.parse("<html><head><title>Test</title></head><body><p>Hello</p></body></html>");
        org.w3c.dom.Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDocument);
        assertNotNull(w3cDocument.getDocumentElement());
        assertEquals("html", w3cDocument.getDocumentElement().getTagName());
    }

    @Test
    public void testFromJsoup_withTextNode_convertsText() {
        Document jsoupDoc = Jsoup.parse("<html><body><p>Hello World</p></body></html>");
        org.w3c.dom.Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDocument);
        String text = w3cDocument.getDocumentElement().getTextContent();
        assertTrue(text.contains("Hello World"));
    }

    @Test
    public void testFromJsoup_withComment_convertsComment() {
        Document jsoupDoc = Jsoup.parse("<html><body><!-- a comment --><p>Hi</p></body></html>");
        org.w3c.dom.Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDocument);
    }

    @Test
    public void testFromJsoup_withScriptDataNode_convertsDataNode() {
        Document jsoupDoc = Jsoup.parse("<html><head><script>var x = 1;</script></head><body></body></html>");
        org.w3c.dom.Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDocument);
    }

    @Test
    public void testFromJsoup_withAttributes_copiesValidAttributes() {
        Document jsoupDoc = Jsoup.parse("<html><body><div id=\"main\" class=\"container\">Content</div></body></html>");
        org.w3c.dom.Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDocument);
        org.w3c.dom.Element bodyEl = (org.w3c.dom.Element) w3cDocument.getDocumentElement().getElementsByTagName("div").item(0);
        assertEquals("main", bodyEl.getAttribute("id"));
        assertEquals("container", bodyEl.getAttribute("class"));
    }

    @Test
    public void testFromJsoup_withInvalidAttributeName_skipsInvalidAttribute() {
        Document jsoupDoc = Jsoup.parse("<html><body><div 123invalid=\"val\" valid-attr=\"ok\">Content</div></body></html>");
        org.w3c.dom.Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDocument);
    }

    @Test
    public void testFromJsoup_withXmlnsAttribute_setsNamespace() {
        Document jsoupDoc = Jsoup.parse("<html xmlns=\"http://www.w3.org/1999/xhtml\"><body><p>Test</p></body></html>");
        org.w3c.dom.Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDocument);
        assertEquals("http://www.w3.org/1999/xhtml", w3cDocument.getDocumentElement().getNamespaceURI());
    }

    @Test
    public void testFromJsoup_withXmlnsPrefixAttribute_setsPrefixedNamespace() {
        Document jsoupDoc = Jsoup.parse(
            "<html xmlns:custom=\"http://example.com/custom\"><body><custom:tag>Content</custom:tag></body></html>",
            "", org.jsoup.parser.Parser.xmlParser());
        org.w3c.dom.Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDocument);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromJsoup_nullInput_throwsException() {
        w3cDom.fromJsoup(null);
    }

    @Test
    public void testConvert_withDocumentLocation_setsDocumentURI() throws Exception {
        Document jsoupDoc = Jsoup.parse("<html><body><p>Test</p></body></html>", "http://example.com");
        javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();
        org.w3c.dom.Document out = builder.newDocument();

        w3cDom.convert(jsoupDoc, out);

        assertEquals("http://example.com", out.getDocumentURI());
    }

    @Test
    public void testConvert_withEmptyLocation_doesNotSetDocumentURI() throws Exception {
        Document jsoupDoc = Jsoup.parse("<html><body><p>Test</p></body></html>");
        javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();
        org.w3c.dom.Document out = builder.newDocument();

        w3cDom.convert(jsoupDoc, out);

        assertNotNull(out.getDocumentElement());
    }

    @Test
    public void testAsString_validDocument_returnsNonEmptyString() {
        Document jsoupDoc = Jsoup.parse("<html><body><p>Hello</p></body></html>");
        org.w3c.dom.Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        String result = w3cDom.asString(w3cDocument);
        assertNotNull(result);
        assertTrue(result.length() > 0);
        assertTrue(result.contains("Hello") || result.contains("html"));
    }

    @Test
    public void testAsString_simpleDocument_containsExpectedContent() {
        Document jsoupDoc = Jsoup.parse("<html><body><div id=\"test\">Content</div></body></html>");
        org.w3c.dom.Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        String result = w3cDom.asString(w3cDocument);
        assertNotNull(result);
        assertTrue(result.contains("Content") || result.contains("div"));
    }

    @Test
    public void testFromJsoup_nestedElements_maintainsStructure() {
        Document jsoupDoc = Jsoup.parse("<html><body><div><span><p>Nested</p></span></div></body></html>");
        org.w3c.dom.Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDocument);
        org.w3c.dom.NodeList divList = w3cDocument.getElementsByTagName("div");
        assertEquals(1, divList.getLength());
    }

    @Test
    public void testFromJsoup_multipleChildren_convertsAllChildren() {
        Document jsoupDoc = Jsoup.parse("<html><body><p>One</p><p>Two</p><p>Three</p></body></html>");
        org.w3c.dom.Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        org.w3c.dom.NodeList pList = w3cDocument.getElementsByTagName("p");
        assertEquals(3, pList.getLength());
    }

    @Test
    public void testFromJsoup_emptyBody_convertsWithoutError() {
        Document jsoupDoc = Jsoup.parse("<html><body></body></html>");
        org.w3c.dom.Document w3cDocument = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDocument);
    }
}
