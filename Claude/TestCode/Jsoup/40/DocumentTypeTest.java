import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.DocumentType;

public class DocumentTypeTest {

    // ---------- Constructor: normal/typical input ----------

    @Test
    public void testConstructor_normalInput_createsDocumentType() {
        DocumentType doctype = new DocumentType("html", "publicId1", "systemId1", "http://example.com/");
        Assert.assertNotNull(doctype);
        Assert.assertEquals("html", doctype.attr("name"));
        Assert.assertEquals("publicId1", doctype.attr("publicId"));
        Assert.assertEquals("systemId1", doctype.attr("systemId"));
        Assert.assertEquals("http://example.com/", doctype.baseUri());
    }

    // ---------- Constructor: edge cases ----------

    @Test
    public void testConstructor_nullPublicIdAndSystemId_createsDocumentTypeWithEmptyAttrs() {
        DocumentType doctype = new DocumentType("html", null, null, "");
        Assert.assertNotNull(doctype);
        Assert.assertEquals("html", doctype.attr("name"));
        Assert.assertEquals("", doctype.attr("publicId"));
        Assert.assertEquals("", doctype.attr("systemId"));
    }

    @Test
    public void testConstructor_emptyBaseUri_createsDocumentType() {
        DocumentType doctype = new DocumentType("html", "pub", "sys", "");
        Assert.assertEquals("", doctype.baseUri());
    }

    // ---------- Constructor: exception cases ----------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullName_throwsException() {
        new DocumentType(null, "pub", "sys", "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_emptyName_throwsException() {
        new DocumentType("", "pub", "sys", "");
    }

    // ---------- nodeName() ----------

    @Test
    public void testNodeName_returnsDoctypeString() {
        DocumentType doctype = new DocumentType("html", "pub", "sys", "");
        Assert.assertEquals("#doctype", doctype.nodeName());
    }

    // ---------- outerHtmlHead (via outerHtml) ----------

    @Test
    public void testOuterHtml_allAttributesPresent_producesFullDoctype() {
        DocumentType doctype = new DocumentType("html", "publicId1", "systemId1", "");
        String html = doctype.outerHtml();
        Assert.assertTrue(html.contains("<!DOCTYPE"));
        Assert.assertTrue(html.contains("html"));
        Assert.assertTrue(html.contains("PUBLIC \"publicId1\""));
        Assert.assertTrue(html.contains("\"systemId1\""));
        Assert.assertTrue(html.endsWith(">"));
    }

    @Test
    public void testOuterHtml_onlyNamePresent_producesDoctypeWithNameOnly() {
        DocumentType doctype = new DocumentType("html", "", "", "");
        String html = doctype.outerHtml();
        Assert.assertTrue(html.contains("<!DOCTYPE"));
        Assert.assertTrue(html.contains("html"));
        Assert.assertFalse(html.contains("PUBLIC"));
        Assert.assertTrue(html.trim().endsWith(">"));
    }

    @Test
    public void testOuterHtml_blankPublicIdAndSystemId_producesDoctypeWithoutIds() {
        DocumentType doctype = new DocumentType("html", "   ", "   ", "");
        String html = doctype.outerHtml();
        Assert.assertTrue(html.contains("<!DOCTYPE"));
        Assert.assertTrue(html.contains("html"));
        Assert.assertFalse(html.contains("PUBLIC"));
    }

    @Test
    public void testOuterHtml_nullPublicIdAndSystemId_producesDoctypeWithoutIds() {
        DocumentType doctype = new DocumentType("html", null, null, "");
        String html = doctype.outerHtml();
        Assert.assertTrue(html.contains("<!DOCTYPE"));
        Assert.assertTrue(html.contains("html"));
        Assert.assertFalse(html.contains("PUBLIC"));
    }

    @Test
    public void testOuterHtml_onlySystemIdPresent_producesDoctypeWithSystemIdOnly() {
        DocumentType doctype = new DocumentType("html", "", "systemId1", "");
        String html = doctype.outerHtml();
        Assert.assertTrue(html.contains("<!DOCTYPE"));
        Assert.assertTrue(html.contains("html"));
        Assert.assertFalse(html.contains("PUBLIC"));
        Assert.assertTrue(html.contains("\"systemId1\""));
    }
}
