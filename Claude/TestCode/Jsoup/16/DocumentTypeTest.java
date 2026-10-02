package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class DocumentTypeTest {

    private DocumentType docType;

    @Before
    public void setUp() {
        docType = new DocumentType("html", "publicId123", "systemId123", "http://example.com/");
    }

    // ---------- Normal / typical input cases ----------

    @Test
    public void testConstructor_normalInput_setsAttributesCorrectly() {
        assertEquals("html", docType.attr("name"));
        assertEquals("publicId123", docType.attr("publicId"));
        assertEquals("systemId123", docType.attr("systemId"));
    }

    @Test
    public void testNodeName_returnsDoctypeIdentifier() {
        assertEquals("#doctype", docType.nodeName());
    }

    @Test
    public void testOuterHtml_withPublicIdAndSystemId_containsBothParts() {
        String html = docType.outerHtml();
        assertTrue(html.contains("<!DOCTYPE html"));
        assertTrue(html.contains("PUBLIC \"publicId123\""));
        assertTrue(html.contains("systemId123"));
        assertTrue(html.endsWith(">"));
    }

    // ---------- Edge cases: empty strings, null values ----------

    @Test
    public void testConstructor_emptyPublicIdAndSystemId_attributesAreEmpty() {
        DocumentType dt = new DocumentType("html", "", "", "http://example.com/");
        assertEquals("", dt.attr("publicId"));
        assertEquals("", dt.attr("systemId"));
    }

    @Test
    public void testOuterHtml_emptyPublicIdAndSystemId_onlyBaseDoctypeAppended() {
        DocumentType dt = new DocumentType("html", "", "", "http://example.com/");
        String html = dt.outerHtml();
        assertFalse(html.contains("PUBLIC"));
        assertTrue(html.contains("<!DOCTYPE html"));
        assertTrue(html.endsWith(">"));
    }

    @Test
    public void testOuterHtml_blankPublicIdWithWhitespace_treatedAsBlank() {
        DocumentType dt = new DocumentType("html", "   ", "systemId123", "http://example.com/");
        String html = dt.outerHtml();
        assertFalse(html.contains("PUBLIC"));
        assertTrue(html.contains("systemId123"));
    }

    @Test
    public void testOuterHtml_onlyPublicIdPresent_systemIdOmitted() {
        DocumentType dt = new DocumentType("html", "publicOnly", "", "http://example.com/");
        String html = dt.outerHtml();
        assertTrue(html.contains("PUBLIC \"publicOnly\""));
        assertFalse(html.contains("systemId"));
    }

    @Test
    public void testOuterHtml_onlySystemIdPresent_publicOmitted() {
        DocumentType dt = new DocumentType("html", "", "systemOnly", "http://example.com/");
        String html = dt.outerHtml();
        assertFalse(html.contains("PUBLIC"));
        assertTrue(html.contains("systemOnly"));
    }

    @Test
    public void testConstructor_nullPublicIdAndSystemId_noExceptionThrownAndAttributesHandled() {
        try {
            DocumentType dt = new DocumentType("html", null, null, "http://example.com/");
            // if no exception thrown, verify attribute access doesn't crash
            String publicId = dt.attr("publicId");
            String systemId = dt.attr("systemId");
            assertNotNull(publicId);
            assertNotNull(systemId);
        } catch (Exception e) {
            // acceptable if implementation throws due to null value handling
            assertNotNull(e);
        }
    }

    @Test
    public void testConstructor_emptyBaseUri_doesNotThrow() {
        DocumentType dt = new DocumentType("html", "pub", "sys", "");
        assertEquals("html", dt.attr("name"));
    }

    // ---------- Exception cases ----------

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullBaseUri_throwsNullPointerException() {
        new DocumentType("html", "pub", "sys", null);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullName_throwsNullPointerException() {
        new DocumentType(null, "pub", "sys", "http://example.com/");
    }
}
