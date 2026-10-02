package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DocumentTypeTest {

    @Test
    public void testConstructor_normalInput_attributesAndBaseUriSetCorrectly() {
        DocumentType documentType = new DocumentType("html", "-//W3C//DTD HTML 4.01//EN", "http://www.w3.org/TR/html4/strict.dtd", "http://example.com/");

        assertEquals("#doctype", documentType.nodeName());
        assertEquals("html", documentType.attr("name"));
        assertEquals("-//W3C//DTD HTML 4.01//EN", documentType.attr("publicId"));
        assertEquals("http://www.w3.org/TR/html4/strict.dtd", documentType.attr("systemId"));
        assertEquals("http://example.com/", documentType.baseUri());
    }

    @Test
    public void testNodeName_always_returnsDoctypeIdentifier() {
        DocumentType documentType = new DocumentType("html", "", "", "");
        assertEquals("#doctype", documentType.nodeName());
    }

    @Test
    public void testOuterHtml_noPublicIdAndNoSystemId_rendersSimpleDoctype() {
        DocumentType documentType = new DocumentType("html", "", "", "");
        assertEquals("<!DOCTYPE html>", documentType.outerHtml());
    }

    @Test
    public void testOuterHtml_nullPublicIdAndNullSystemId_rendersSimpleDoctype() {
        DocumentType documentType = new DocumentType("html", null, null, "");
        assertEquals("<!DOCTYPE html>", documentType.outerHtml());
    }

    @Test
    public void testOuterHtml_whitespacePublicIdAndSystemId_rendersSimpleDoctype() {
        DocumentType documentType = new DocumentType("html", "   ", "  \t\n ", "");
        assertEquals("<!DOCTYPE html>", documentType.outerHtml());
    }

    @Test
    public void testOuterHtml_withPublicIdOnly_rendersPublicDoctype() {
        DocumentType documentType = new DocumentType("html", "-//W3C//DTD XHTML 1.0 Strict//EN", "", "");
        assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\">", documentType.outerHtml());
    }

    @Test
    public void testOuterHtml_withSystemIdOnly_rendersSystemDoctype() {
        DocumentType documentType = new DocumentType("html", "", "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", "");
        assertEquals("<!DOCTYPE html http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">", documentType.outerHtml());
    }

    @Test
    public void testOuterHtml_withBothPublicIdAndSystemId_rendersFullDoctype() {
        DocumentType documentType = new DocumentType("html", "-//W3C//DTD HTML 4.01//EN", "http://www.w3.org/TR/html4/strict.dtd", "");
        assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" http://www.w3.org/TR/html4/strict.dtd\">", documentType.outerHtml());
    }

    @Test
    public void testOuterHtmlHeadAndTail_directCall_appendsCorrectly() {
        DocumentType documentType = new DocumentType("html", "pubId", "sysId", "http://example.com");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();

        documentType.outerHtmlHead(sb, 0, settings);
        assertEquals("<!DOCTYPE html PUBLIC \"pubId\" sysId\">", sb.toString());

        documentType.outerHtmlTail(sb, 0, settings);
        assertEquals("<!DOCTYPE html PUBLIC \"pubId\" sysId\">", sb.toString());
    }

    @Test
    public void testToString_returnsOuterHtml() {
        DocumentType documentType = new DocumentType("html", "", "", "");
        assertEquals("<!DOCTYPE html>", documentType.toString());
    }
}
