package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class DocumentTypeTest {

    @Test
    public void testConstants() {
        assertEquals("PUBLIC", DocumentType.PUBLIC_KEY);
        assertEquals("SYSTEM", DocumentType.SYSTEM_KEY);
    }

    @Test
    public void testNodeName() {
        DocumentType documentType = new DocumentType("html", "", "", "");
        assertEquals("#doctype", documentType.nodeName());
    }

    @Test
    public void testConstructorAndAttributes() {
        DocumentType documentType = new DocumentType("html", "pubId", "sysId", "http://example.com");
        assertEquals("html", documentType.attr("name"));
        assertEquals("pubId", documentType.attr("publicId"));
        assertEquals("sysId", documentType.attr("systemId"));
        assertEquals("http://example.com", documentType.baseUri());
    }

    @Test
    public void testOuterHtml_html5_producesLowercaseDoctype() {
        DocumentType documentType = new DocumentType("html", "", "", "");
        assertEquals("<!doctype html>", documentType.outerHtml());
    }

    @Test
    public void testOuterHtml_xmlSyntax_producesUppercaseDoctype() {
        DocumentType documentType = new DocumentType("html", "", "", "");
        documentType.ownerDocument().outputSettings().syntax(Document.OutputSettings.Syntax.xml);
        assertEquals("<!DOCTYPE html>", documentType.outerHtml());
    }

    @Test
    public void testOuterHtml_withPublicAndSystemIds() {
        DocumentType documentType = new DocumentType(
                "html",
                "-//W3C//DTD HTML 4.01 Transitional//EN",
                "http://www.w3.org/TR/html4/loose.dtd",
                ""
        );
        assertEquals(
                "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">",
                documentType.outerHtml()
        );
    }

    @Test
    public void testOuterHtml_withPublicIdOnly() {
        DocumentType documentType = new DocumentType("html", "public-id", "", "");
        assertEquals("<!DOCTYPE html PUBLIC \"public-id\">", documentType.outerHtml());
    }

    @Test
    public void testOuterHtml_withSystemIdOnly() {
        DocumentType documentType = new DocumentType("html", "", "about:legacy-compat", "");
        assertEquals("<!DOCTYPE html \"about:legacy-compat\">", documentType.outerHtml());
    }

    @Test
    public void testOuterHtml_emptyAndBlankAttributes() {
        DocumentType documentType = new DocumentType("", "   ", "   ", "");
        assertEquals("<!doctype>", documentType.outerHtml());
    }

    @Test
    public void testOuterHtml_nullAttributeValues() {
        DocumentType documentType = new DocumentType(null, null, null, "");
        assertEquals("<!doctype>", documentType.outerHtml());
    }

    @Test
    public void testOuterHtml_xmlSyntaxWithPublicAndSystemIds() {
        DocumentType documentType = new DocumentType("html", "pub", "sys", "");
        documentType.ownerDocument().outputSettings().syntax(Document.OutputSettings.Syntax.xml);
        assertEquals("<!DOCTYPE html PUBLIC \"pub\" \"sys\">", documentType.outerHtml());
    }

    @Test
    public void testOuterHtmlHeadAndTail_directCall() throws IOException {
        DocumentType documentType = new DocumentType("html", "pub", "sys", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        documentType.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE html PUBLIC \"pub\" \"sys\">", accum.toString());

        documentType.outerHtmlTail(accum, 0, out);
        assertEquals("<!DOCTYPE html PUBLIC \"pub\" \"sys\">", accum.toString());
    }
}
