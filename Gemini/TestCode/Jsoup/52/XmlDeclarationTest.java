package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class XmlDeclarationTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullName_throwsIllegalArgumentException() {
        new XmlDeclaration(null, "http://example.com", false);
    }

    @Test
    public void testNodeName_default_returnsHashDeclaration() {
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        assertEquals("#declaration", decl.nodeName());
    }

    @Test
    public void testName_validName_returnsName() {
        XmlDeclaration decl = new XmlDeclaration("customDecl", "http://example.com", false);
        assertEquals("customDecl", decl.name());
    }

    @Test
    public void testName_emptyString_returnsEmptyString() {
        XmlDeclaration decl = new XmlDeclaration("", "", false);
        assertEquals("", decl.name());
    }

    @Test
    public void testGetWholeDeclaration_notXml_returnsName() {
        XmlDeclaration decl = new XmlDeclaration("CUSTOM", "http://example.com", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");
        assertEquals("CUSTOM", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_xmlWithZeroAttributes_returnsName() {
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        assertEquals("xml", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_xmlWithOneAttribute_returnsName() {
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        decl.attr("version", "1.0");
        assertEquals("xml", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_xmlWithVersionAndEncoding_returnsFormattedDeclaration() {
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");
        assertEquals("xml version=\"1.0\" encoding=\"UTF-8\"", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_xmlWithVersionAndOtherAttribute_returnsFormattedDeclaration() {
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        decl.attr("version", "1.0");
        decl.attr("standalone", "yes");
        assertEquals("xml version=\"1.0\"", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_xmlWithEncodingAndOtherAttribute_returnsFormattedDeclaration() {
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        decl.attr("encoding", "UTF-8");
        decl.attr("standalone", "yes");
        assertEquals("xml encoding=\"UTF-8\"", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_xmlWithOtherAttributesOnly_returnsName() {
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        decl.attr("foo", "bar");
        decl.attr("baz", "qux");
        assertEquals("xml", decl.getWholeDeclaration());
    }

    @Test
    public void testOuterHtml_isProcessingInstructionFalse_rendersQuestionMark() {
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");
        assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\">", decl.outerHtml());
    }

    @Test
    public void testOuterHtml_isProcessingInstructionTrue_rendersExclamationMark() {
        XmlDeclaration decl = new XmlDeclaration("DOCTYPE", "http://example.com", true);
        assertEquals("<!DOCTYPE>", decl.outerHtml());
    }

    @Test
    public void testOuterHtmlHeadAndTail_directCall_appendsCorrectly() throws IOException {
        XmlDeclaration decl = new XmlDeclaration("test", "http://example.com", false);
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        
        decl.outerHtmlHead(sb, 0, settings);
        decl.outerHtmlTail(sb, 0, settings);
        
        assertEquals("<?test>", sb.toString());
    }

    @Test
    public void testToString_validDeclaration_returnsOuterHtml() {
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");
        assertEquals(decl.outerHtml(), decl.toString());
        assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\">", decl.toString());
    }
}
