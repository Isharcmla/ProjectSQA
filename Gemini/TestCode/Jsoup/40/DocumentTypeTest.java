package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DocumentTypeTest {

    @Test
    public void testConstructor_validInputs_createsInstance() {
        DocumentType documentType = new DocumentType("html", "-//W3C//DTD HTML 4.01//EN", "http://www.w3.org/TR/html4/strict.dtd", "http://example.com/");
        assertNotNull(documentType);
        assertEquals("html", documentType.attr("name"));
        assertEquals("-//W3C//DTD HTML 4.01//EN", documentType.attr("publicId"));
        assertEquals("http://www.w3.org/TR/html4/strict.dtd", documentType.attr("systemId"));
        assertEquals("http://example.com/", documentType.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullName_throwsException() {
        new DocumentType(null, "publicId", "systemId", "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_emptyName_throwsException() {
        new DocumentType("", "publicId", "systemId", "http://example.com/");
    }

    @Test
    public void testNodeName_always_returnsDoctypeIdentifier() {
        DocumentType documentType = new DocumentType("html", null, null, "");
        assertEquals("#doctype", documentType.nodeName());
    }

    @Test
    public void testOuterHtml_nameOnly_rendersSimpleDoctype() {
        DocumentType documentType = new DocumentType("html", "", "", "");
        assertEquals("<!DOCTYPE html>", documentType.outerHtml());
    }

    @Test
    public void testOuterHtml_withPublicAndSystemId_rendersFullDoctype() {
        DocumentType documentType = new DocumentType(
                "html",
                "-//W3C//DTD HTML 4.01//EN",
                "http://www.w3.org/TR/html4/strict.dtd",
                ""
        );
        assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">", documentType.outerHtml());
    }

    @Test
    public void testOuterHtml_withPublicIdOnly_rendersPublicDoctype() {
        DocumentType documentType = new DocumentType("html", "PUBLIC_ID", null, "");
        assertEquals("<!DOCTYPE html PUBLIC \"PUBLIC_ID\">", documentType.outerHtml());
    }

    @Test
    public void testOuterHtml_withSystemIdOnly_rendersSystemDoctype() {
        DocumentType documentType = new DocumentType("html", null, "about:legacy-compat", "");
        assertEquals("<!DOCTYPE html \"about:legacy-compat\">", documentType.outerHtml());
    }

    @Test
    public void testOuterHtml_blankNameAttribute_rendersDoctypeWithoutName() {
        DocumentType documentType = new DocumentType("html", "PUBLIC_ID", "SYSTEM_ID", "");
        documentType.attr("name", "");
        assertEquals("<!DOCTYPE PUBLIC \"PUBLIC_ID\" \"SYSTEM_ID\">", documentType.outerHtml());
    }

    @Test
    public void testOuterHtml_allAttributesBlank_rendersEmptyDoctypeTag() {
        DocumentType documentType = new DocumentType("html", "", "", "");
        documentType.attr("name", "");
        assertEquals("<!DOCTYPE>", documentType.outerHtml());
    }

    @Test
    public void testOuterHtmlHeadAndTail_directInvocation_functionsProperly() {
        DocumentType documentType = new DocumentType("html", "pub", "sys", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();

        documentType.outerHtmlHead(accum, 0, settings);
        assertEquals("<!DOCTYPE html PUBLIC \"pub\" \"sys\">", accum.toString());

        documentType.outerHtmlTail(accum, 0, settings);
        assertEquals("<!DOCTYPE html PUBLIC \"pub\" \"sys\">", accum.toString());
    }
}
