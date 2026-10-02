import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class DocumentTest {

    private Document doc;

    @Before
    public void setUp() {
        doc = new Document("http://example.com/");
    }

    // ---------- Constructor ----------

    @Test
    public void testConstructor_createsDocumentWithRootTag() {
        Document d = new Document("http://example.com/");
        assertEquals("#document", d.nodeName());
        assertEquals("http://example.com/", d.baseUri());
    }

    // ---------- createShell ----------

    @Test
    public void testCreateShell_baseUri_returnsValidShell() {
        Document shell = Document.createShell("http://example.com/");
        assertNotNull(shell);
        assertNotNull(shell.head());
        assertNotNull(shell.body());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateShell_nullBaseUri_throwsException() {
        Document.createShell(null);
    }

    // ---------- head() ----------

    @Test
    public void testHead_afterCreateShell_returnsHeadElement() {
        Document shell = Document.createShell("http://example.com/");
        Element head = shell.head();
        assertNotNull(head);
        assertEquals("head", head.nodeName());
    }

    @Test
    public void testHead_emptyDocument_returnsNull() {
        Document d = new Document("http://example.com/");
        assertNull(d.head());
    }

    // ---------- body() ----------

    @Test
    public void testBody_afterCreateShell_returnsBodyElement() {
        Document shell = Document.createShell("http://example.com/");
        Element body = shell.body();
        assertNotNull(body);
        assertEquals("body", body.nodeName());
    }

    @Test
    public void testBody_emptyDocument_returnsNull() {
        Document d = new Document("http://example.com/");
        assertNull(d.body());
    }

    // ---------- title() get ----------

    @Test
    public void testTitle_getEmptyTitle_returnsEmptyString() {
        Document shell = Document.createShell("http://example.com/");
        assertEquals("", shell.title());
    }

    @Test
    public void testTitle_getWhenTitleSet_returnsTrimmedTitle() {
        Document shell = Document.createShell("http://example.com/");
        shell.head().appendElement("title").text("  Hello World  ");
        assertEquals("Hello World", shell.title());
    }

    // ---------- title(String) set ----------

    @Test
    public void testTitle_setTitle_whenNoTitleElement_addsTitleToHead() {
        Document shell = Document.createShell("http://example.com/");
        shell.title("My Title");
        assertEquals("My Title", shell.title());
    }

    @Test
    public void testTitle_setTitle_whenTitleExists_updatesTitle() {
        Document shell = Document.createShell("http://example.com/");
        shell.head().appendElement("title").text("Old Title");
        shell.title("New Title");
        assertEquals("New Title", shell.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTitle_setNullTitle_throwsException() {
        Document shell = Document.createShell("http://example.com/");
        shell.title(null);
    }

    @Test
    public void testTitle_setEmptyString_setsEmptyTitle() {
        Document shell = Document.createShell("http://example.com/");
        shell.title("");
        assertEquals("", shell.title());
    }

    // ---------- createElement ----------

    @Test
    public void testCreateElement_returnsNewElementWithBaseUri() {
        Document d = new Document("http://example.com/");
        Element el = d.createElement("div");
        assertNotNull(el);
        assertEquals("div", el.nodeName());
        assertEquals("http://example.com/", el.baseUri());
    }

    // ---------- normalise ----------

    @Test
    public void testNormalise_addsMissingHtmlHeadBody() {
        Document d = new Document("http://example.com/");
        d.normalise();
        assertNotNull(d.head());
        assertNotNull(d.body());
    }

    @Test
    public void testNormalise_movesTextNodesIntoBody() {
        Document d = new Document("http://example.com/");
        d.appendElement("html");
        d.normalise();
        assertNotNull(d.head());
        assertNotNull(d.body());
    }

    @Test
    public void testNormalise_calledTwice_stillValid() {
        Document d = new Document("http://example.com/");
        d.normalise();
        d.normalise();
        assertNotNull(d.head());
        assertNotNull(d.body());
    }

    // ---------- outerHtml ----------

    @Test
    public void testOuterHtml_returnsHtmlWithoutWrapper() {
        Document shell = Document.createShell("http://example.com/");
        String html = shell.outerHtml();
        assertNotNull(html);
        assertTrue(html.contains("<html>"));
    }

    // ---------- text(String) ----------

    @Test
    public void testText_setBodyText_updatesBodyText() {
        Document shell = Document.createShell("http://example.com/");
        Element result = shell.text("Hello Body");
        assertSame(shell, result);
        assertEquals("Hello Body", shell.body().text());
    }

    // ---------- nodeName() ----------

    @Test
    public void testNodeName_returnsDocumentNodeName() {
        Document d = new Document("http://example.com/");
        assertEquals("#document", d.nodeName());
    }

    // ---------- clone() ----------

    @Test
    public void testClone_createsIndependentCopy() {
        Document shell = Document.createShell("http://example.com/");
        shell.title("Original");
        Document clone = shell.clone();

        assertNotSame(shell, clone);
        assertEquals(shell.title(), clone.title());
        assertNotSame(shell.outputSettings(), clone.outputSettings());

        clone.title("Changed");
        assertEquals("Original", shell.title());
        assertEquals("Changed", clone.title());
    }

    // ---------- outputSettings() / outputSettings(OutputSettings) ----------

    @Test
    public void testOutputSettings_defaultValues() {
        Document d = new Document("http://example.com/");
        Document.OutputSettings settings = d.outputSettings();
        assertNotNull(settings);
        assertEquals(Entities.EscapeMode.base, settings.escapeMode());
        assertTrue(settings.prettyPrint());
        assertEquals(1, settings.indentAmount());
    }

    @Test
    public void testOutputSettings_setNewSettings() {
        Document d = new Document("http://example.com/");
        Document.OutputSettings newSettings = new Document.OutputSettings();
        newSettings.prettyPrint(false);
        Document result = d.outputSettings(newSettings);
        assertSame(d, result);
        assertSame(newSettings, d.outputSettings());
        assertFalse(d.outputSettings().prettyPrint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutputSettings_setNull_throwsException() {
        Document d = new Document("http://example.com/");
        d.outputSettings(null);
    }

    // ---------- quirksMode() / quirksMode(QuirksMode) ----------

    @Test
    public void testQuirksMode_defaultIsNoQuirks() {
        Document d = new Document("http://example.com/");
        assertEquals(Document.QuirksMode.noQuirks, d.quirksMode());
    }

    @Test
    public void testQuirksMode_setAndGet() {
        Document d = new Document("http://example.com/");
        Document result = d.quirksMode(Document.QuirksMode.quirks);
        assertSame(d, result);
        assertEquals(Document.QuirksMode.quirks, d.quirksMode());
    }

    @Test
    public void testQuirksMode_setLimitedQuirks() {
        Document d = new Document("http://example.com/");
        d.quirksMode(Document.QuirksMode.limitedQuirks);
        assertEquals(Document.QuirksMode.limitedQuirks, d.quirksMode());
    }

    // ---------- OutputSettings nested class ----------

    @Test
    public void testOutputSettingsEscapeMode_defaultIsBase() {
        Document.OutputSettings settings = new Document.OutputSettings();
        assertEquals(Entities.EscapeMode.base, settings.escapeMode());
    }

    @Test
    public void testOutputSettingsEscapeMode_setAndGet() {
        Document.OutputSettings settings = new Document.OutputSettings();
        Document.OutputSettings result = settings.escapeMode(Entities.EscapeMode.extended);
        assertSame(settings, result);
        assertEquals(Entities.EscapeMode.extended, settings.escapeMode());
    }

    @Test
    public void testOutputSettingsCharset_defaultIsUTF8() {
        Document.OutputSettings settings = new Document.OutputSettings();
        assertEquals(Charset.forName("UTF-8"), settings.charset());
    }

    @Test
    public void testOutputSettingsCharset_setCharsetObject() {
        Document.OutputSettings settings = new Document.OutputSettings();
        Charset ascii = Charset.forName("US-ASCII");
        Document.OutputSettings result = settings.charset(ascii);
        assertSame(settings, result);
        assertEquals(ascii, settings.charset());
    }

    @Test
    public void testOutputSettingsCharset_setCharsetByName() {
        Document.OutputSettings settings = new Document.OutputSettings();
        Document.OutputSettings result = settings.charset("ISO-8859-1");
        assertSame(settings, result);
        assertEquals(Charset.forName("ISO-8859-1"), settings.charset());
    }

    @Test(expected = java.nio.charset.UnsupportedCharsetException.class)
    public void testOutputSettingsCharset_invalidName_throwsException() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset("invalid-charset-name-xyz");
    }

    @Test
    public void testOutputSettingsPrettyPrint_defaultTrue() {
        Document.OutputSettings settings = new Document.OutputSettings();
        assertTrue(settings.prettyPrint());
    }

    @Test
    public void testOutputSettingsPrettyPrint_setFalse() {
        Document.OutputSettings settings = new Document.OutputSettings();
        Document.OutputSettings result = settings.prettyPrint(false);
        assertSame(settings, result);
        assertFalse(settings.prettyPrint());
    }

    @Test
    public void testOutputSettingsIndentAmount_defaultIsOne() {
        Document.OutputSettings settings = new Document.OutputSettings();
        assertEquals(1, settings.indentAmount());
    }

    @Test
    public void testOutputSettingsIndentAmount_setValidValue() {
        Document.OutputSettings settings = new Document.OutputSettings();
        Document.OutputSettings result = settings.indentAmount(4);
        assertSame(settings, result);
        assertEquals(4, settings.indentAmount());
    }

    @Test
    public void testOutputSettingsIndentAmount_setZero_isValid() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.indentAmount(0);
        assertEquals(0, settings.indentAmount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutputSettingsIndentAmount_setNegative_throwsException() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.indentAmount(-1);
    }

    @Test
    public void testOutputSettingsClone_createsIndependentCopy() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(false);
        settings.indentAmount(3);
        settings.escapeMode(Entities.EscapeMode.extended);
        settings.charset("ISO-8859-1");

        Document.OutputSettings clone = settings.clone();

        assertNotSame(settings, clone);
        assertEquals(settings.prettyPrint(), clone.prettyPrint());
        assertEquals(settings.indentAmount(), clone.indentAmount());
        assertEquals(settings.escapeMode(), clone.escapeMode());
        assertEquals(settings.charset(), clone.charset());

        clone.prettyPrint(true);
        assertFalse(settings.prettyPrint());
        assertTrue(clone.prettyPrint());
    }
}
