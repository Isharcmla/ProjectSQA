import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class W3CDomTest {

    private W3CDom w3cDom;

    @Before
    public void setUp() {
        w3cDom = new W3CDom();
    }

    // ---------- fromJsoup tests ----------

    @Test
    public void testFromJsoup_normalInput_returnsW3CDocument() {
        Document jsoupDoc = Jsoup.parse("<html><head><title>Test</title></head><body><p>Hello</p></body></html>");
        org.w3c.dom.Document w3cResult = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cResult);
        assertNotNull(w3cResult.getDocumentElement());
        assertEquals("html", w3cResult.getDocumentElement().getTagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromJsoup_nullInput_throwsException() {
        w3cDom.fromJsoup(null);
    }

    @Test
    public void testFromJsoup_withComment_createsCommentNode() {
        Document jsoupDoc = Jsoup.parse("<html><body><!-- a comment --><p>text</p></body></html>");
        org.w3c.dom.Document w3cResult = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cResult);
        String asString = w3cDom.asString(w3cResult);
        assertTrue(asString.contains("a comment"));
    }

    @Test
    public void testFromJsoup_withScriptDataNode_createsTextNode() {
        Document jsoupDoc = Jsoup.parse("<html><head><script>var a = 1;</script></head><body></body></html>");
        org.w3c.dom.Document w3cResult = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cResult);
        String asString = w3cDom.asString(w3cResult);
        assertTrue(asString.contains("var a = 1;"));
    }

    @Test
    public void testFromJsoup_withNamespaceAttribute_handlesNamespace() {
        Document jsoupDoc = Jsoup.parse("<html xmlns=\"http://www.w3.org/1999/xhtml\"><body><p>hi</p></body></html>",
                "", org.jsoup.parser.Parser.xmlParser());
        org.w3c.dom.Document w3cResult = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cResult);
        assertEquals("http://www.w3.org/1999/xhtml", w3cResult.getDocumentElement().getNamespaceURI());
    }

    @Test
    public void testFromJsoup_withPrefixedNamespace_handlesPrefix() {
        String xml = "<root xmlns:ns=\"http://example.com/ns\"><ns:child>value</ns:child></root>";
        Document jsoupDoc = Jsoup.parse(xml, "", org.jsoup.parser.Parser.xmlParser());
        org.w3c.dom.Document w3cResult = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cResult);
        org.w3c.dom.Element root = w3cResult.getDocumentElement();
        assertNotNull(root);
        org.w3c.dom.NodeList children = root.getChildNodes();
        boolean foundNamespacedChild = false;
        for (int i = 0; i < children.getLength(); i++) {
            org.w3c.dom.Node n = children.item(i);
            if (n instanceof org.w3c.dom.Element) {
                org.w3c.dom.Element el = (org.w3c.dom.Element) n;
                if ("http://example.com/ns".equals(el.getNamespaceURI())) {
                    foundNamespacedChild = true;
                }
            }
        }
        assertTrue(foundNamespacedChild);
    }

    @Test
    public void testFromJsoup_withInvalidAttributeCharacters_stripsInvalidChars() {
        Document jsoupDoc = Jsoup.parse("<html><body><p data-foo!=\"bar\">text</p></body></html>");
        org.w3c.dom.Document w3cResult = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cResult);
        String asString = w3cDom.asString(w3cResult);
        assertFalse(asString.contains("data-foo!"));
    }

    @Test
    public void testFromJsoup_emptyBody_producesValidDocument() {
        Document jsoupDoc = Jsoup.parse("");
        org.w3c.dom.Document w3cResult = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cResult);
    }

    // ---------- convert tests ----------

    @Test
    public void testConvert_normalInput_populatesOutDocument() throws Exception {
        Document jsoupDoc = Jsoup.parse("<html><body><p>hello</p></body></html>");

        javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();
        org.w3c.dom.Document outDoc = builder.newDocument();

        w3cDom.convert(jsoupDoc, outDoc);
        assertNotNull(outDoc.getDocumentElement());
        assertEquals("html", outDoc.getDocumentElement().getTagName());
    }

    @Test
    public void testConvert_withLocation_setsDocumentURI() throws Exception {
        Document jsoupDoc = Jsoup.parse("<html><body><p>hello</p></body></html>", "http://example.com/");

        javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();
        org.w3c.dom.Document outDoc = builder.newDocument();

        w3cDom.convert(jsoupDoc, outDoc);
        assertEquals("http://example.com/", outDoc.getDocumentURI());
    }

    @Test
    public void testConvert_withBlankLocation_doesNotSetDocumentURI() throws Exception {
        Document jsoupDoc = Jsoup.parse("<html><body><p>hello</p></body></html>", "");

        javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();
        org.w3c.dom.Document outDoc = builder.newDocument();

        w3cDom.convert(jsoupDoc, outDoc);
        assertNull(outDoc.getDocumentURI());
    }

    // ---------- asString tests ----------

    @Test
    public void testAsString_normalDocument_returnsNonEmptyString() {
        Document jsoupDoc = Jsoup.parse("<html><body><p>hello world</p></body></html>");
        org.w3c.dom.Document w3cResult = w3cDom.fromJsoup(jsoupDoc);
        String result = w3cDom.asString(w3cResult);
        assertNotNull(result);
        assertTrue(result.length() > 0);
        assertTrue(result.contains("hello world"));
    }

    @Test
    public void testAsString_emptyDocument_returnsValidString() throws Exception {
        javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();
        org.w3c.dom.Document emptyDoc = builder.newDocument();

        String result = w3cDom.asString(emptyDoc);
        assertNotNull(result);
    }

    @Test
    public void testAsString_withNestedElementsAndText_preservesContent() {
        Document jsoupDoc = Jsoup.parse("<html><body><div><span>nested</span></div></body></html>");
        org.w3c.dom.Document w3cResult = w3cDom.fromJsoup(jsoupDoc);
        String result = w3cDom.asString(w3cResult);
        assertTrue(result.contains("nested"));
    }

    // ---------- Combined / integration tests ----------

    @Test
    public void testFromJsoup_multipleChildren_correctStructure() {
        Document jsoupDoc = Jsoup.parse("<html><body><p>one</p><p>two</p><p>three</p></body></html>");
        org.w3c.dom.Document w3cResult = w3cDom.fromJsoup(jsoupDoc);
        org.w3c.dom.Element body = (org.w3c.dom.Element) w3cResult.getDocumentElement()
                .getElementsByTagName("body").item(0);
        assertEquals(3, body.getElementsByTagName("p").getLength());
    }

    @Test
    public void testFromJsoup_attributesCopied_correctly() {
        Document jsoupDoc = Jsoup.parse("<html><body><p id=\"myid\" class=\"myclass\">text</p></body></html>");
        org.w3c.dom.Document w3cResult = w3cDom.fromJsoup(jsoupDoc);
        org.w3c.dom.Element p = (org.w3c.dom.Element) w3cResult.getElementsByTagName("p").item(0);
        assertEquals("myid", p.getAttribute("id"));
        assertEquals("myclass", p.getAttribute("class"));
    }
}
