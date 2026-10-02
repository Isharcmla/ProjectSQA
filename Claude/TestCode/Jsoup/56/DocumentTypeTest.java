import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Document.OutputSettings;

public class DocumentTypeTest {

    private DocumentType docType;

    @Before
    public void setUp() {
        docType = new DocumentType("html", "", "", "");
    }

    // ---------- Normal / typical input cases ----------

    @Test
    public void testConstructor_normalInput_setsAttributesCorrectly() {
        DocumentType dt = new DocumentType("html", "-//W3C//DTD XHTML 1.0 Strict//EN",
                "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", "http://example.com/");

        assertEquals("html", dt.attr("name"));
        assertEquals("-//W3C//DTD XHTML 1.0 Strict//EN", dt.attr("publicId"));
        assertEquals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", dt.attr("systemId"));
    }

    @Test
    public void testNodeName_returnsDoctype() {
        assertEquals("#doctype", docType.nodeName());
    }

    @Test
    public void testOuterHtml_html5DoctypeNoPublicSystem_lowercaseDoctype() {
        Document doc = new Document("");
        doc.outputSettings().syntax(OutputSettings.Syntax.html);
        DocumentType dt = new DocumentType("html", "", "", "");
        doc.appendChild(dt);

        String html = doc.outerHtml();
        assertTrue(html.toLowerCase().contains("<!doctype html>".toLowerCase()));
        assertTrue(html.contains("<!doctype"));
    }

    @Test
    public void testOuterHtml_withPublicId_usesUppercaseDoctype() {
        Document doc = new Document("");
        doc.outputSettings().syntax(OutputSettings.Syntax.html);
        DocumentType dt = new DocumentType("html", "-//W3C//DTD HTML 4.01//EN", "", "");
        doc.appendChild(dt);

        String html = doc.outerHtml();
        assertTrue(html.contains("<!DOCTYPE"));
        assertTrue(html.contains("PUBLIC"));
        assertTrue(html.contains("-//W3C//DTD HTML 4.01//EN"));
    }

    @Test
    public void testOuterHtml_withSystemIdOnly_containsSystemId() {
        Document doc = new Document("");
        doc.outputSettings().syntax(OutputSettings.Syntax.html);
        DocumentType dt = new DocumentType("html", "", "http://www.w3.org/TR/html4/strict.dtd", "");
        doc.appendChild(dt);

        String html = doc.outerHtml();
        assertTrue(html.contains("<!DOCTYPE"));
        assertTrue(html.contains("http://www.w3.org/TR/html4/strict.dtd"));
    }

    @Test
    public void testOuterHtml_xmlSyntax_usesUppercaseDoctypeEvenWithoutPublicSystem() {
        Document doc = new Document("");
        doc.outputSettings().syntax(OutputSettings.Syntax.xml);
        DocumentType dt = new DocumentType("html", "", "", "");
        doc.appendChild(dt);

        String html = doc.outerHtml();
        assertTrue(html.contains("<!DOCTYPE"));
    }

    @Test
    public void testOuterHtml_withBothPublicAndSystemId_containsBoth() {
        Document doc = new Document("");
        doc.outputSettings().syntax(OutputSettings.Syntax.html);
        DocumentType dt = new DocumentType("html", "-//W3C//DTD XHTML 1.0 Strict//EN",
                "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", "");
        doc.appendChild(dt);

        String html = doc.outerHtml();
        assertTrue(html.contains("PUBLIC"));
        assertTrue(html.contains("-//W3C//DTD XHTML 1.0 Strict//EN"));
        assertTrue(html.contains("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"));
    }

    // ---------- Edge cases ----------

    @Test
    public void testConstructor_emptyStrings_noExceptionAndAttributesEmpty() {
        DocumentType dt = new DocumentType("", "", "", "");
        assertEquals("", dt.attr("name"));
        assertEquals("", dt.attr("publicId"));
        assertEquals("", dt.attr("systemId"));
    }

    @Test
    public void testConstructor_nullValues_noExceptionThrown() {
        DocumentType dt = new DocumentType(null, null, null, "");
        // has() should treat null/blank attributes as not present
        Document doc = new Document("");
        doc.outputSettings().syntax(OutputSettings.Syntax.html);
        doc.appendChild(dt);

        String html = doc.outerHtml();
        assertFalse(html.contains("PUBLIC"));
        // Should still produce a doctype tag without throwing
        assertTrue(html.toLowerCase().contains("<!doctype"));
    }

    @Test
    public void testConstructor_nullBaseUri_noExceptionThrown() {
        DocumentType dt = new DocumentType("html", "", "", null);
        assertEquals("html", dt.attr("name"));
        assertEquals("#doctype", dt.nodeName());
    }

    @Test
    public void testHasMethod_blankAttribute_returnsFalseViaOuterHtml() {
        Document doc = new Document("");
        doc.outputSettings().syntax(OutputSettings.Syntax.html);
        DocumentType dt = new DocumentType("html", "   ", "   ", "");
        doc.appendChild(dt);

        String html = doc.outerHtml();
        // blank publicId/systemId treated as absent
        assertFalse(html.contains("PUBLIC"));
        assertTrue(html.toLowerCase().contains("<!doctype"));
    }

    @Test
    public void testConstructor_noNameAttribute_outerHtmlOmitsName() {
        Document doc = new Document("");
        doc.outputSettings().syntax(OutputSettings.Syntax.html);
        DocumentType dt = new DocumentType("", "-//W3C//DTD HTML 4.01//EN", "", "");
        doc.appendChild(dt);

        String html = doc.outerHtml();
        assertTrue(html.contains("PUBLIC"));
    }

    // ---------- Exception cases ----------

    @Test
    public void testAttr_nullKey_throwsException() {
        boolean exceptionThrown = false;
        try {
            docType.attr(null);
        } catch (Exception e) {
            exceptionThrown = true;
        }
        assertTrue("Expected an exception when calling attr(null)", exceptionThrown);
    }

    @Test(expected = Exception.class)
    public void testAttrSet_nullKey_throwsException() {
        docType.attr(null, "value");
    }
}
