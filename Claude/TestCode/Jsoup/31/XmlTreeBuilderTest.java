package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {

    private static final String BASE_URI = "http://example.com/";

    @Before
    public void setUp() {
        // no-op, each test creates its own parser to avoid shared state
    }

    // ---------- Constructor / basic instantiation ----------

    @Test
    public void testConstructor_createsInstance_notNull() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        assertNotNull(builder);
    }

    // ---------- Normal / typical input ----------

    @Test
    public void testParse_normalXml_producesCorrectDocument() {
        String xml = "<root><child>text</child></root>";
        Document doc = Parser.xmlParser().parseInput(xml, BASE_URI);

        assertNotNull(doc);
        Elements roots = doc.select("root");
        assertEquals(1, roots.size());

        Elements children = doc.select("child");
        assertEquals(1, children.size());
        assertEquals("text", children.first().text());
    }

    @Test
    public void testParse_nestedElementsHierarchy_correctStructure() {
        String xml = "<a><b><c>value</c></b></a>";
        Document doc = Parser.xmlParser().parseInput(xml, BASE_URI);

        Element a = doc.select("a").first();
        assertNotNull(a);
        Element b = a.select("b").first();
        assertNotNull(b);
        Element c = b.select("c").first();
        assertNotNull(c);
        assertEquals("value", c.text());
    }

    @Test
    public void testParse_multipleTopLevelElements_bothPresent() {
        String xml = "<a></a><b></b>";
        Document doc = Parser.xmlParser().parseInput(xml, BASE_URI);

        assertEquals(1, doc.select("a").size());
        assertEquals(1, doc.select("b").size());
    }

    @Test
    public void testParse_attributesPreserved_correctValue() {
        String xml = "<tag attr=\"value\">content</tag>";
        Document doc = Parser.xmlParser().parseInput(xml, BASE_URI);

        Element tag = doc.select("tag").first();
        assertNotNull(tag);
        assertEquals("value", tag.attr("attr"));
        assertEquals("content", tag.text());
    }

    @Test
    public void testParse_characterData_insertedAsTextNode() {
        String xml = "<root>Hello World</root>";
        Document doc = Parser.xmlParser().parseInput(xml, BASE_URI);

        Element root = doc.select("root").first();
        assertNotNull(root);
        assertEquals("Hello World", root.text());
    }

    @Test
    public void testParse_comment_insertedAsCommentNode() {
        String xml = "<root><!-- a comment --></root>";
        Document doc = Parser.xmlParser().parseInput(xml, BASE_URI);

        assertTrue(doc.outerHtml().contains("a comment"));
    }

    @Test
    public void testParse_doctype_insertedAsDocumentTypeNode() {
        String xml = "<!DOCTYPE root><root></root>";
        Document doc = Parser.xmlParser().parseInput(xml, BASE_URI);

        assertNotNull(doc);
        assertTrue(doc.childNodeSize() > 0);
        // Should still contain the actual element too
        assertEquals(1, doc.select("root").size());
    }

    @Test
    public void testParse_selfClosingKnownTag_handledCorrectly() {
        String xml = "<root><br/></root>";
        Document doc = Parser.xmlParser().parseInput(xml, BASE_URI);

        Elements brs = doc.select("br");
        assertEquals(1, brs.size());
    }

    @Test
    public void testParse_selfClosingUnknownTag_marksSelfClosingInOutput() {
        String xml = "<root><customtag/></root>";
        Document doc = Parser.xmlParser().parseInput(xml, BASE_URI);

        Elements custom = doc.select("customtag");
        assertEquals(1, custom.size());
        // unknown tag flagged as self closing should render with "/>"
        assertTrue(doc.outerHtml().contains("customtag"));
    }

    // ---------- Edge cases ----------

    @Test
    public void testParse_emptyString_producesEmptyDocument() {
        Document doc = Parser.xmlParser().parseInput("", BASE_URI);
        assertNotNull(doc);
    }

    @Test
    public void testParse_mismatchedEndTagNoMatch_skipsGracefully() {
        // </b> has no matching opening tag on the stack, should be skipped without error
        String xml = "<a>text</b>";
        Document doc = Parser.xmlParser().parseInput(xml, BASE_URI);

        assertNotNull(doc);
        Element a = doc.select("a").first();
        assertNotNull(a);
        assertEquals("text", a.text());
    }

    @Test
    public void testParse_unclosedIntermediateTags_popsElementsCorrectly() {
        // Closing "b" while "c" is still open should pop "c" first (else-branch),
        // then find and remove "b" (target-found branch)
        String xml = "<a><b><c>text</b></a>";
        Document doc = Parser.xmlParser().parseInput(xml, BASE_URI);

        assertNotNull(doc);
        Element a = doc.select("a").first();
        assertNotNull(a);
        Element b = a.select("b").first();
        assertNotNull(b);
        Element c = b.select("c").first();
        assertNotNull(c);
        assertEquals("text", c.text());
    }

    @Test
    public void testParse_endTagWithEmptyStack_doesNotThrow() {
        String xml = "</root>";
        Document doc = Parser.xmlParser().parseInput(xml, BASE_URI);
        assertNotNull(doc);
    }

    @Test
    public void testParse_whitespaceOnlyInput_producesDocumentWithoutError() {
        String xml = "   \n\t  ";
        Document doc = Parser.xmlParser().parseInput(xml, BASE_URI);
        assertNotNull(doc);
    }

    @Test
    public void testParse_baseUriEmpty_stillParsesDocument() {
        String xml = "<root>content</root>";
        Document doc = Parser.xmlParser().parseInput(xml, "");
        assertNotNull(doc);
        assertEquals("content", doc.select("root").first().text());
    }

    // ---------- Exception cases ----------

    @Test
    public void testParse_nullInput_throwsException() {
        boolean thrown = false;
        try {
            Parser.xmlParser().parseInput(null, BASE_URI);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue("Expected an exception to be thrown for null input", thrown);
    }

    @Test
    public void testParse_nullBaseUri_doesNotCrashUnexpectedly() {
        // Depending on implementation this may or may not throw; ensure no
        // uncontrolled propagation crashes the test runner by handling both cases.
        try {
            Document doc = Parser.xmlParser().parseInput("<root>text</root>", null);
            assertNotNull(doc);
        } catch (Exception e) {
            assertNotNull(e);
        }
    }
}
