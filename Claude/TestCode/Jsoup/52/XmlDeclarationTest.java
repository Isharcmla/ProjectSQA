import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class XmlDeclarationTest {

    private XmlDeclaration decl;

    @Before
    public void setUp() {
        decl = new XmlDeclaration("xml", "http://example.com", false);
    }

    // -------------------- Constructor Tests --------------------

    @Test
    public void testConstructor_normalInput_createsInstance() {
        XmlDeclaration d = new XmlDeclaration("xml", "http://example.com/", true);
        assertNotNull(d);
        assertEquals("xml", d.name());
    }

    @Test
    public void testConstructor_processingInstructionTrue_setsCorrectly() {
        XmlDeclaration d = new XmlDeclaration("processing", "http://example.com/", true);
        assertEquals("processing", d.name());
    }

    @Test
    public void testConstructor_processingInstructionFalse_setsCorrectly() {
        XmlDeclaration d = new XmlDeclaration("declaration", "http://example.com/", false);
        assertEquals("declaration", d.name());
    }

    @Test
    public void testConstructor_emptyBaseUri_createsInstance() {
        XmlDeclaration d = new XmlDeclaration("xml", "", false);
        assertNotNull(d);
        assertEquals("xml", d.name());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullName_throwsException() {
        new XmlDeclaration(null, "http://example.com/", false);
    }

    @Test
    public void testConstructor_emptyName_createsInstanceWithEmptyName() {
        XmlDeclaration d = new XmlDeclaration("", "http://example.com/", false);
        assertEquals("", d.name());
    }

    // -------------------- nodeName() Tests --------------------

    @Test
    public void testNodeName_normalCase_returnsDeclaration() {
        assertEquals("#declaration", decl.nodeName());
    }

    @Test
    public void testNodeName_differentInstance_returnsDeclaration() {
        XmlDeclaration d = new XmlDeclaration("test", "uri", true);
        assertEquals("#declaration", d.nodeName());
    }

    // -------------------- name() Tests --------------------

    @Test
    public void testName_normalCase_returnsCorrectName() {
        assertEquals("xml", decl.name());
    }

    @Test
    public void testName_emptyName_returnsEmptyString() {
        XmlDeclaration d = new XmlDeclaration("", "uri", false);
        assertEquals("", d.name());
    }

    @Test
    public void testName_customName_returnsCustomName() {
        XmlDeclaration d = new XmlDeclaration("custom", "uri", false);
        assertEquals("custom", d.name());
    }

    // -------------------- getWholeDeclaration() Tests --------------------

    @Test
    public void testGetWholeDeclaration_nonXmlName_returnsNameOnly() {
        XmlDeclaration d = new XmlDeclaration("notxml", "uri", false);
        assertEquals("notxml", d.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_xmlNameWithNoAttributes_returnsNameOnly() {
        XmlDeclaration d = new XmlDeclaration("xml", "uri", false);
        assertEquals("xml", d.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_xmlNameWithOneAttribute_returnsNameOnly() {
        XmlDeclaration d = new XmlDeclaration("xml", "uri", false);
        d.attr("version", "1.0");
        assertEquals("xml", d.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_xmlNameWithVersionAndEncoding_returnsFullDeclaration() {
        XmlDeclaration d = new XmlDeclaration("xml", "uri", false);
        d.attr("version", "1.0");
        d.attr("encoding", "UTF-8");
        String result = d.getWholeDeclaration();
        assertTrue(result.contains("version=\"1.0\""));
        assertTrue(result.contains("encoding=\"UTF-8\""));
        assertTrue(result.startsWith("xml"));
    }

    @Test
    public void testGetWholeDeclaration_xmlNameWithVersionOnlyAndExtraAttr_containsVersion() {
        XmlDeclaration d = new XmlDeclaration("xml", "uri", false);
        d.attr("version", "1.0");
        d.attr("standalone", "yes");
        String result = d.getWholeDeclaration();
        assertTrue(result.contains("version=\"1.0\""));
    }

    @Test
    public void testGetWholeDeclaration_xmlNameWithEncodingOnlyAndExtraAttr_containsEncoding() {
        XmlDeclaration d = new XmlDeclaration("xml", "uri", false);
        d.attr("encoding", "UTF-8");
        d.attr("standalone", "yes");
        String result = d.getWholeDeclaration();
        assertTrue(result.contains("encoding=\"UTF-8\""));
    }

    @Test
    public void testGetWholeDeclaration_xmlNameWithMultipleNonVersionEncodingAttrs_returnsNameOnlyIfNoMatch() {
        XmlDeclaration d = new XmlDeclaration("xml", "uri", false);
        d.attr("foo", "bar");
        d.attr("baz", "qux");
        String result = d.getWholeDeclaration();
        assertEquals("xml", result);
    }

    // -------------------- toString() / outerHtmlHead Tests --------------------

    @Test
    public void testToString_processingInstructionTrue_containsExclamation() {
        XmlDeclaration d = new XmlDeclaration("xml", "uri", true);
        d.attr("version", "1.0");
        d.attr("encoding", "UTF-8");
        String result = d.toString();
        assertTrue(result.startsWith("<!"));
        assertTrue(result.endsWith(">"));
    }

    @Test
    public void testToString_processingInstructionFalse_containsQuestionMark() {
        XmlDeclaration d = new XmlDeclaration("xml", "uri", false);
        d.attr("version", "1.0");
        d.attr("encoding", "UTF-8");
        String result = d.toString();
        assertTrue(result.startsWith("<?"));
        assertTrue(result.endsWith(">"));
    }

    @Test
    public void testToString_nonXmlDeclaration_returnsSimpleFormat() {
        XmlDeclaration d = new XmlDeclaration("DOCTYPE", "uri", true);
        String result = d.toString();
        assertEquals("<!DOCTYPE>", result);
    }

    @Test
    public void testToString_emptyBaseUri_worksCorrectly() {
        XmlDeclaration d = new XmlDeclaration("xml", "", false);
        String result = d.toString();
        assertNotNull(result);
        assertTrue(result.contains("xml"));
    }

    @Test
    public void testToString_multipleCalls_consistentResult() {
        XmlDeclaration d = new XmlDeclaration("xml", "uri", false);
        d.attr("version", "1.0");
        d.attr("encoding", "UTF-8");
        String first = d.toString();
        String second = d.toString();
        assertEquals(first, second);
    }
}
