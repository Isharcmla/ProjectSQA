import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;

import java.nio.charset.Charset;

public class DocumentTest {

    private Document doc;

    @Before
    public void setUp() {
        doc = new Document("http://example.com/");
    }

    // ---------- Constructor ----------

    @Test
    public void testConstructor_validBaseUri_createsDocument() {
        Document d = new Document("http://example.com/");
        assertNotNull(d);
        assertEquals("http://example.com/", d.baseUri());
    }

    @Test
    public void testConstructor_emptyBaseUri_createsDocument() {
        Document d = new Document("");
        assertNotNull(d);
        assertEquals("", d.baseUri());
    }

    // ---------- createShell ----------

    @Test
    public void testCreateShell_validBaseUri_returnsShellWithHtmlHeadBody() {
        Document shell = Document.createShell("http://example.com/");
        assertNotNull(shell);
        assertNotNull(shell.head());
        assertNotNull(shell.body());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateShell_nullBaseUri_throwsException() {
        Document.createShell(null);
    }

    // ---------- head / body ----------

    @Test
    public void testHead_onShellDocument_returnsHeadElement() {
        Document shell = Document.createShell("http://example.com/");
        Element head = shell.head();
        assertNotNull(head);
        assertEquals("head", head.nodeName());
    }

    @Test
    public void testHead_onEmptyDocument_returnsNull() {
        Document empty = new Document("http://example.com/");
        assertNull(empty.head());
    }

    @Test
    public void testBody_onShellDocument_returnsBodyElement() {
        Document shell = Document.createShell("http://example.com/");
        Element body = shell.body();
        assertNotNull(body);
        assertEquals("body", body.nodeName());
    }

    @Test
    public void testBody_onEmptyDocument_returnsNull() {
        Document empty = new Document("http://example.com/");
        assertNull(empty.body());
    }

    // ---------- title ----------

    @Test
    public void testTitle_noTitleElement_returnsEmptyString() {
        Document shell = Document.createShell("http://example.com/");
        assertEquals("", shell.title());
    }

    @Test
    public void testTitle_setTitle_addsTitleToHead() {
        Document shell = Document.createShell("http://example.com/");
        shell.title("My Title");
        assertEquals("My Title", shell.title());
    }

    @Test
    public void testTitle_updateExistingTitle_updatesTitle() {
        Document shell = Document.createShell("http://example.com/");
        shell.title("First Title");
        shell.title("Second Title");
        assertEquals("Second Title", shell.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTitle_nullTitle_throwsException() {
        Document shell = Document.createShell("http://example.com/");
        shell.title(null);
    }

    @Test
    public void testTitle_emptyTitle_setsEmptyTitle() {
        Document shell = Document.createShell("http://example.com/");
        shell.title("");
        assertEquals("", shell.title());
    }

    // ---------- createElement ----------

    @Test
    public void testCreateElement_validTagName_createsElementWithBaseUri() {
        Element el = doc.createElement("div");
        assertNotNull(el);
        assertEquals("div", el.nodeName());
        assertEquals(doc.baseUri(), el.baseUri());
    }

    @Test
    public void testCreateElement_doesNotAttachToDocument() {
        Element el = doc.createElement("span");
        assertNull(el.parent());
    }

    // ---------- normalise ----------

    @Test
    public void testNormalise_emptyDocument_createsHtmlHeadBody() {
        Document empty = new Document("http://example.com/");
        Document normalised = empty.normalise();
        assertNotNull(normalised.head());
        assertNotNull(normalised.body());
    }

    @Test
    public void testNormalise_alreadyShellDocument_returnsSameStructure() {
        Document shell = Document.createShell("http://example.com/");
        Document normalised = shell.normalise();
        assertNotNull(normalised.head());
        assertNotNull(normalised.body());
    }

    @Test
    public void testNormalise_withTextNodeInRoot_movesTextToBody() {
        Document d = Document.createShell("http://example.com/");
        d.appendChild(new org.jsoup.nodes.TextNode("Floating Text", d.baseUri()));
        d.normalise();
        assertTrue(d.body().text().contains("Floating Text"));
    }

    // ---------- outerHtml ----------

    @Test
    public void testOuterHtml_onShellDocument_returnsHtmlString() {
        Document shell = Document.createShell("http://example.com/");
        String html = shell.outerHtml();
        assertNotNull(html);
        assertTrue(html.contains("html"));
    }

    // ---------- text ----------

    @Test
    public void testText_setText_setsBodyText() {
        Document shell = Document.createShell("http://example.com/");
        shell.text("Hello World");
        assertEquals("Hello World", shell.body().text());
    }

    @Test
    public void testText_setEmptyText_setsEmptyBodyText() {
        Document shell = Document.createShell("http://example.com/");
        shell.text("");
        assertEquals("", shell.body().text());
    }

    @Test
    public void testText_returnsThis_forChaining() {
        Document shell = Document.createShell("http://example.com/");
        Element result = shell.text("Chained Text");
        assertSame(shell, result);
    }

    // ---------- nodeName ----------

    @Test
    public void testNodeName_returnsDocumentConstant() {
        assertEquals("#document", doc.nodeName());
    }

    // ---------- outputSettings ----------

    @Test
    public void testOutputSettings_notNull_returnsSameInstance() {
        Document.OutputSettings settings1 = doc.outputSettings();
        Document.OutputSettings settings2 = doc.outputSettings();
        assertNotNull(settings1);
        assertSame(settings1, settings2);
    }

    // ---------- OutputSettings: escapeMode ----------

    @Test
    public void testEscapeMode_default_returnsBase() {
        assertEquals(Entities.EscapeMode.base, doc.outputSettings().escapeMode());
    }

    @Test
    public void testEscapeMode_setExtended_returnsExtended() {
        Document.OutputSettings settings = doc.outputSettings();
        Document.OutputSettings result = settings.escapeMode(Entities.EscapeMode.extended);
        assertEquals(Entities.EscapeMode.extended, settings.escapeMode());
        assertSame(settings, result);
    }

    // ---------- OutputSettings: charset ----------

    @Test
    public void testCharset_default_returnsUTF8() {
        assertEquals(Charset.forName("UTF-8"), doc.outputSettings().charset());
    }

    @Test
    public void testCharset_setCharsetObject_updatesCharset() {
        Document.OutputSettings settings = doc.outputSettings();
        Charset ascii = Charset.forName("US-ASCII");
        Document.OutputSettings result = settings.charset(ascii);
        assertEquals(ascii, settings.charset());
        assertSame(settings, result);
    }

    @Test
    public void testCharset_setCharsetByName_updatesCharset() {
        Document.OutputSettings settings = doc.outputSettings();
        settings.charset("ISO-8859-1");
        assertEquals(Charset.forName("ISO-8859-1"), settings.charset());
    }

    @Test(expected = java.nio.charset.UnsupportedCharsetException.class)
    public void testCharset_invalidCharsetName_throwsException() {
        doc.outputSettings().charset("INVALID-CHARSET-NAME-XYZ");
    }

    // ---------- OutputSettings: prettyPrint ----------

    @Test
    public void testPrettyPrint_default_returnsTrue() {
        assertTrue(doc.outputSettings().prettyPrint());
    }

    @Test
    public void testPrettyPrint_setFalse_returnsFalse() {
        Document.OutputSettings settings = doc.outputSettings();
        Document.OutputSettings result = settings.prettyPrint(false);
        assertFalse(settings.prettyPrint());
        assertSame(settings, result);
    }

    @Test
    public void testPrettyPrint_setTrue_returnsTrue() {
        Document.OutputSettings settings = doc.outputSettings();
        settings.prettyPrint(false);
        settings.prettyPrint(true);
        assertTrue(settings.prettyPrint());
    }

    // ---------- OutputSettings: indentAmount ----------

    @Test
    public void testIndentAmount_default_returnsOne() {
        assertEquals(1, doc.outputSettings().indentAmount());
    }

    @Test
    public void testIndentAmount_setPositiveValue_updatesIndentAmount() {
        Document.OutputSettings settings = doc.outputSettings();
        Document.OutputSettings result = settings.indentAmount(4);
        assertEquals(4, settings.indentAmount());
        assertSame(settings, result);
    }

    @Test
    public void testIndentAmount_setZero_updatesIndentAmount() {
        Document.OutputSettings settings = doc.outputSettings();
        settings.indentAmount(0);
        assertEquals(0, settings.indentAmount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndentAmount_negativeValue_throwsException() {
        doc.outputSettings().indentAmount(-1);
    }
}
