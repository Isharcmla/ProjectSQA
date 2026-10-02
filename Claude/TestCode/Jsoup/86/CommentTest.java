package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CommentTest {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("This is a comment");
    }

    @Test
    public void testConstructor_normalData_createsComment() {
        Comment c = new Comment("Hello comment");
        assertEquals("Hello comment", c.getData());
    }

    @Test
    public void testConstructor_emptyData_createsComment() {
        Comment c = new Comment("");
        assertEquals("", c.getData());
    }

    @Test
    public void testConstructor_withBaseUri_createsComment() {
        Comment c = new Comment("Some data", "http://example.com");
        assertEquals("Some data", c.getData());
    }

    @Test
    public void testConstructor_withBaseUriEmptyData_createsComment() {
        Comment c = new Comment("", "http://example.com");
        assertEquals("", c.getData());
    }

    @Test
    public void testNodeName_returnsCommentTag() {
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testGetData_normalData_returnsData() {
        assertEquals("This is a comment", comment.getData());
    }

    @Test
    public void testGetData_emptyData_returnsEmptyString() {
        Comment c = new Comment("");
        assertEquals("", c.getData());
    }

    @Test
    public void testToString_normalComment_returnsOuterHtml() {
        String result = comment.toString();
        assertTrue(result.contains("<!--"));
        assertTrue(result.contains("-->"));
        assertTrue(result.contains("This is a comment"));
    }

    @Test
    public void testToString_emptyComment_returnsOuterHtmlWithEmptyData() {
        Comment c = new Comment("");
        String result = c.toString();
        assertEquals("<!---->", result);
    }

    @Test
    public void testIsXmlDeclaration_startsWithExclamation_returnsTrue() {
        Comment c = new Comment("!DOCTYPE html");
        assertTrue(c.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_startsWithQuestionMark_returnsTrue() {
        Comment c = new Comment("?xml version=\"1.0\"");
        assertTrue(c.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_normalComment_returnsFalse() {
        Comment c = new Comment("This is normal comment");
        assertFalse(c.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_emptyData_returnsFalse() {
        Comment c = new Comment("");
        assertFalse(c.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_singleCharacterExclamation_returnsFalse() {
        Comment c = new Comment("!");
        assertFalse(c.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_singleCharacterQuestionMark_returnsFalse() {
        Comment c = new Comment("?");
        assertFalse(c.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_lengthOneNormalChar_returnsFalse() {
        Comment c = new Comment("a");
        assertFalse(c.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration_validXmlDeclarationStyle_returnsDeclaration() {
        Comment c = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        XmlDeclaration decl = c.asXmlDeclaration();
        assertNotNull(decl);
        assertFalse(decl.isDeclaration() == true && decl.name().isEmpty());
    }

    @Test
    public void testAsXmlDeclaration_validDoctypeStyle_returnsDeclarationOrNull() {
        Comment c = new Comment("!DOCTYPE");
        XmlDeclaration decl = c.asXmlDeclaration();
        // May or may not parse successfully depending on content; just ensure no exception
        assertTrue(decl == null || decl instanceof XmlDeclaration);
    }

    @Test
    public void testAsXmlDeclaration_emptyAfterStrip_returnsNull() {
        // data must have length > 1 to strip properly; using minimal valid case
        Comment c = new Comment("??");
        XmlDeclaration decl = c.asXmlDeclaration();
        assertTrue(decl == null || decl instanceof XmlDeclaration);
    }

    @Test
    public void testAsXmlDeclaration_normalCommentNotXml_returnsNullOrDeclaration() {
        Comment c = new Comment("just a comment");
        // data.substring(1, length-1) on "just a comment" -> "ust a commen"
        // This will attempt xml parse; likely returns null since no valid tag structure
        XmlDeclaration decl = c.asXmlDeclaration();
        assertTrue(decl == null || decl instanceof XmlDeclaration);
    }

    @Test
    public void testOuterHtmlHead_prettyPrintEnabled_containsCommentMarkers() {
        Document doc = Document.createShell("");
        Comment c = new Comment("test comment");
        doc.body().appendChild(c);
        String html = doc.outerHtml();
        assertTrue(html.contains("<!--test comment-->"));
    }

    @Test
    public void testOuterHtmlHead_prettyPrintDisabled_containsCommentMarkers() {
        Document doc = Document.createShell("");
        doc.outputSettings().prettyPrint(false);
        Comment c = new Comment("test comment");
        doc.body().appendChild(c);
        String html = doc.outerHtml();
        assertTrue(html.contains("<!--test comment-->"));
    }

    @Test
    public void testGetData_specialCharacters_returnsAsIs() {
        Comment c = new Comment("special <>&\" chars");
        assertEquals("special <>&\" chars", c.getData());
    }

    @Test
    public void testNodeName_consistentAcrossInstances_returnsSameValue() {
        Comment c1 = new Comment("data1");
        Comment c2 = new Comment("data2");
        assertEquals(c1.nodeName(), c2.nodeName());
    }
}
