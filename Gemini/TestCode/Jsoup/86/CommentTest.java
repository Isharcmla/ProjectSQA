package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class CommentTest {

    @Test
    public void testConstructorAndGetData_normalString_returnsData() {
        Comment comment = new Comment("This is a comment");
        assertEquals("This is a comment", comment.getData());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructor_withBaseUri_returnsData() {
        Comment comment = new Comment("Comment with baseUri", "https://example.com");
        assertEquals("Comment with baseUri", comment.getData());
    }

    @Test
    public void testNodeName_always_returnsHashComment() {
        Comment comment = new Comment("test");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testToStringAndOuterHtml_normalContent_formatsAsComment() {
        Comment comment = new Comment("hello world");
        assertEquals("<!--hello world-->", comment.toString());
        assertEquals("<!--hello world-->", comment.outerHtml());
    }

    @Test
    public void testOuterHtml_prettyPrintDisabled_outputsWithoutIndent() {
        Comment comment = new Comment("test");
        Document doc = new Document("");
        doc.outputSettings().prettyPrint(false);
        doc.appendChild(comment);

        assertEquals("<!--test-->", comment.outerHtml());
    }

    @Test
    public void testOuterHtml_prettyPrintEnabled_indentsProperly() {
        Document doc = new Document("");
        doc.outputSettings().prettyPrint(true);
        Element body = doc.appendElement("body");
        Comment comment = new Comment("indented comment");
        body.appendChild(comment);

        assertTrue(doc.html().contains("<!--indented comment-->"));
    }

    @Test
    public void testIsXmlDeclaration_withQuestionMarkPrefix_returnsTrue() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"utf-8\"?");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_withExclamationPrefix_returnsTrue() {
        Comment comment = new Comment("!DOCTYPE html");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_normalText_returnsFalse() {
        Comment comment = new Comment("Just a regular comment");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_emptyString_returnsFalse() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_singleCharExclamation_returnsFalse() {
        Comment comment = new Comment("!");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_singleCharQuestionMark_returnsFalse() {
        Comment comment = new Comment("?");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration_validXmlProcessingInstruction_returnsXmlDeclaration() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"utf-8\"?");
        XmlDeclaration decl = comment.asXmlDeclaration();

        assertNotNull(decl);
        assertEquals("xml", decl.name());
        assertEquals("1.0", decl.attr("version"));
        assertEquals("utf-8", decl.attr("encoding"));
        assertFalse(decl.isProcessingInstruction());
    }

    @Test
    public void testAsXmlDeclaration_validExclamationDeclaration_returnsXmlDeclarationWithFlag() {
        Comment comment = new Comment("!DOCTYPE html>");
        XmlDeclaration decl = comment.asXmlDeclaration();

        assertNotNull(decl);
        assertEquals("DOCTYPE", decl.name());
        assertTrue(decl.hasAttr("html"));
        assertTrue(decl.isProcessingInstruction());
    }

    @Test
    public void testAsXmlDeclaration_emptyOrNonParsableContent_returnsNull() {
        Comment comment = new Comment("?");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNull(decl);
    }

    @Test
    public void testClone_clonedInstance_hasSameDataAndNodeName() {
        Comment original = new Comment("original text");
        Comment clone = (Comment) original.clone();

        assertEquals(original.getData(), clone.getData());
        assertEquals(original.nodeName(), clone.nodeName());
        assertEquals(original.outerHtml(), clone.outerHtml());
    }
}
