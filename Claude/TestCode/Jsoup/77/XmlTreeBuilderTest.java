package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

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
        assertEquals(ParseSettings.preserveCase, settings);
    }

    @Test
    public void testParseString_normalXml_returnsDocumentWithXmlSyntax() {
        String xml = "<root><child>text</child></root>";
        Document doc = builder.parse(xml, "http://example.com/");
        assertNotNull(doc);
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        Element child = root.child(0);
        assertEquals("child", child.tagName());
        assertEquals("text", child.text());
    }

    @Test
    public void testParseReader_normalInput_returnsDocument() {
        Reader reader = new StringReader("<a><b/></a>");
        Document doc = builder.parse(reader, "http://example.com/");
        assertNotNull(doc);
        Element a = doc.child(0);
        assertEquals("a", a.tagName());
    }

    @Test
    public void testParseString_emptyString_returnsEmptyDocument() {
        Document doc = builder.parse("", "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.childNodes().isEmpty() || doc.children().isEmpty());
    }

    @Test
    public void testParseString_withComment_insertsCommentNode() {
        String xml = "<root><!-- a comment --></root>";
        Document doc = builder.parse(xml, "http://example.com/");
        Element root = doc.child(0);
        boolean foundComment = false;
        for (Node n : root.childNodes()) {
            if (n instanceof Comment) {
                foundComment = true;
                assertEquals(" a comment ", ((Comment) n).getData());
            }
        }
        assertTrue(foundComment);
    }

    @Test
    public void testParseString_withXmlDeclaration_insertsXmlDeclarationNode() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root/>";
        Document doc = builder.parse(xml, "http://example.com/");
        boolean foundDecl = false;
        for (Node n : doc.childNodes()) {
            if (n instanceof XmlDeclaration) {
                foundDecl = true;
            }
        }
        assertTrue(foundDecl);
    }

    @Test
    public void testParseString_withDoctype_insertsDocumentTypeNode() {
        String xml = "<!DOCTYPE html><root/>";
        Document doc = builder.parse(xml, "http://example.com/");
        boolean foundDoctype = false;
        for (Node n : doc.childNodes()) {
            if (n instanceof DocumentType) {
                foundDoctype = true;
            }
        }
        assertTrue(foundDoctype);
    }

    @Test
    public void testParseString_withCData_insertsCDataNode() {
        String xml = "<root><![CDATA[Some <data>]]></root>";
        Document doc = builder.parse(xml, "http://example.com/");
        Element root = doc.child(0);
        boolean foundCData = false;
        for (Node n : root.childNodes()) {
            if (n instanceof CDataNode) {
                foundCData = true;
                assertEquals("Some <data>", ((CDataNode) n).text());
            }
        }
        assertTrue(foundCData);
    }

    @Test
    public void testParseString_selfClosingTag_createsElementWithoutChildren() {
        String xml = "<root><selfclosing/></root>";
        Document doc = builder.parse(xml, "http://example.com/");
        Element root = doc.child(0);
        Element sc = root.child(0);
        assertEquals("selfclosing", sc.tagName());
        assertEquals(0, sc.childNodeSize());
    }

    @Test
    public void testParseString_unknownEndTag_doesNotThrowAndSkips() {
        String xml = "<root></notroot>";
        Document doc = builder.parse(xml, "http://example.com/");
        assertNotNull(doc);
        // just ensure parse completes without exception
    }

    @Test(expected = NullPointerException.class)
    public void testParseString_nullInput_throwsNullPointerException() {
        builder.parse((String) null, "http://example.com/");
    }

    @Test
    public void testParseFragment_normalInput_returnsChildNodes() {
        List<Node> nodes = builder.parseFragment("<a>text</a>", "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseFragment_emptyInput_returnsNonNullList() {
        List<Node> nodes = builder.parseFragment("", "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertNotNull(nodes);
    }

    @Test
    public void testParseString_multipleAttributes_normalizedCorrectly() {
        String xml = "<root Attr1=\"value1\" attr2=\"value2\"/>";
        Document doc = builder.parse(xml, "http://example.com/");
        Element root = doc.child(0);
        assertEquals("value1", root.attr("Attr1"));
        assertEquals("value2", root.attr("attr2"));
    }

    @Test
    public void testParseString_nestedElementsWithBaseUri_setsBaseUri() {
        String baseUri = "http://example.com/base/";
        Document doc = builder.parse("<root/>", baseUri);
        assertEquals(baseUri, doc.baseUri());
    }

    @Test
    public void testParseString_characterText_insertsTextNode() {
        String xml = "<root>Hello World</root>";
        Document doc = builder.parse(xml, "http://example.com/");
        Element root = doc.child(0);
        boolean foundText = false;
        for (Node n : root.childNodes()) {
            if (n instanceof TextNode) {
                foundText = true;
                assertEquals("Hello World", ((TextNode) n).text());
            }
        }
        assertTrue(foundText);
    }

    @Test
    public void testParseString_deeplyNestedElements_parsesCorrectly() {
        String xml = "<a><b><c><d>deep</d></c></b></a>";
        Document doc = builder.parse(xml, "http://example.com/");
        Element a = doc.child(0);
        Element b = a.child(0);
        Element c = b.child(0);
        Element d = c.child(0);
        assertEquals("deep", d.text());
    }

    @Test
    public void testParseString_emptyBaseUri_doesNotThrow() {
        Document doc = builder.parse("<root/>", "");
        assertNotNull(doc);
        assertEquals("", doc.baseUri());
    }
}
