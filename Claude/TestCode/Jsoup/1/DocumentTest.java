import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class DocumentTest {

    private Document doc;

    @Before
    public void setUp() {
        doc = new Document("http://example.com/");
    }

    // ---------- Constructor Tests ----------

    @Test
    public void testConstructor_normalBaseUri_createsDocument() {
        Document d = new Document("http://example.com/");
        assertNotNull(d);
        assertEquals("#document", d.nodeName());
    }

    @Test
    public void testConstructor_emptyBaseUri_createsDocument() {
        Document d = new Document("");
        assertNotNull(d);
    }

    // ---------- createShell Tests ----------

    @Test
    public void testCreateShell_validBaseUri_returnsDocumentWithHtmlHeadBody() {
        Document shellDoc = Document.createShell("http://example.com/");
        assertNotNull(shellDoc);
        assertNotNull(shellDoc.head());
        assertNotNull(shellDoc.body());
        assertEquals("html", shellDoc.child(0).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateShell_nullBaseUri_throwsException() {
        Document.createShell(null);
    }

    @Test
    public void testCreateShell_emptyBaseUri_createsDocument() {
        Document shellDoc = Document.createShell("");
        assertNotNull(shellDoc);
        assertNotNull(shellDoc.head());
        assertNotNull(shellDoc.body());
    }

    // ---------- head() Tests ----------

    @Test
    public void testHead_documentWithHead_returnsHeadElement() {
        Document shellDoc = Document.createShell("http://example.com/");
        Element head = shellDoc.head();
        assertNotNull(head);
        assertEquals("head", head.tagName());
    }

    @Test
    public void testHead_documentWithoutHead_returnsNull() {
        Document emptyDoc = new Document("http://example.com/");
        Element head = emptyDoc.head();
        assertNull(head);
    }

    // ---------- body() Tests ----------

    @Test
    public void testBody_documentWithBody_returnsBodyElement() {
        Document shellDoc = Document.createShell("http://example.com/");
        Element body = shellDoc.body();
        assertNotNull(body);
        assertEquals("body", body.tagName());
    }

    @Test
    public void testBody_documentWithoutBody_returnsNull() {
        Document emptyDoc = new Document("http://example.com/");
        Element body = emptyDoc.body();
        assertNull(body);
    }

    // ---------- title() getter Tests ----------

    @Test
    public void testTitle_getWithTitleSet_returnsTitleText() {
        Document shellDoc = Document.createShell("http://example.com/");
        shellDoc.title("My Title");
        assertEquals("My Title", shellDoc.title());
    }

    @Test
    public void testTitle_getWithoutTitleElement_returnsEmptyString() {
        Document shellDoc = Document.createShell("http://example.com/");
        assertEquals("", shellDoc.title());
    }

    @Test
    public void testTitle_getWithWhitespaceTitle_returnsTrimmedTitle() {
        Document shellDoc = Document.createShell("http://example.com/");
        shellDoc.head().appendElement("title").text("  Spaced Title  ");
        assertEquals("Spaced Title", shellDoc.title());
    }

    // ---------- title(String) setter Tests ----------

    @Test
    public void testTitleSetter_noExistingTitleElement_addsTitleToHead() {
        Document shellDoc = Document.createShell("http://example.com/");
        shellDoc.title("New Title");
        assertEquals("New Title", shellDoc.title());
        assertNotNull(shellDoc.head().getElementsByTag("title").first());
    }

    @Test
    public void testTitleSetter_existingTitleElement_updatesTitle() {
        Document shellDoc = Document.createShell("http://example.com/");
        shellDoc.title("First Title");
        shellDoc.title("Second Title");
        assertEquals("Second Title", shellDoc.title());
    }

    @Test
    public void testTitleSetter_emptyString_setsEmptyTitle() {
        Document shellDoc = Document.createShell("http://example.com/");
        shellDoc.title("");
        assertEquals("", shellDoc.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTitleSetter_nullTitle_throwsException() {
        Document shellDoc = Document.createShell("http://example.com/");
        shellDoc.title(null);
    }

    // ---------- createElement Tests ----------

    @Test
    public void testCreateElement_validTagName_createsNewElementWithBaseUri() {
        Element el = doc.createElement("div");
        assertNotNull(el);
        assertEquals("div", el.tagName());
        assertEquals("http://example.com/", el.baseUri());
    }

    @Test
    public void testCreateElement_doesNotAttachToDocument() {
        Element el = doc.createElement("span");
        assertEquals(0, doc.children().size());
    }

    // ---------- normalise() Tests ----------

    @Test
    public void testNormalise_emptyDocument_createsHtmlHeadBody() {
        Document emptyDoc = new Document("http://example.com/");
        emptyDoc.normalise();
        assertNotNull(emptyDoc.head());
        assertNotNull(emptyDoc.body());
        assertFalse(emptyDoc.select("html").isEmpty());
    }

    @Test
    public void testNormalise_documentAlreadyNormalised_stillHasStructure() {
        Document shellDoc = Document.createShell("http://example.com/");
        shellDoc.normalise();
        assertNotNull(shellDoc.head());
        assertNotNull(shellDoc.body());
    }

    @Test
    public void testNormalise_withTextInRoot_movesTextToBody() {
        Document parsedDoc = new Document("http://example.com/");
        parsedDoc.appendChild(new org.jsoup.nodes.TextNode("Some root text", ""));
        parsedDoc.normalise();
        assertNotNull(parsedDoc.body());
        assertTrue(parsedDoc.body().text().contains("Some root text"));
    }

    @Test
    public void testNormalise_returnsSameDocumentInstance() {
        Document result = doc.normalise();
        assertSame(doc, result);
    }

    // ---------- outerHtml() Tests ----------

    @Test
    public void testOuterHtml_shellDocument_returnsHtmlString() {
        Document shellDoc = Document.createShell("http://example.com/");
        String html = shellDoc.outerHtml();
        assertNotNull(html);
        assertTrue(html.contains("html"));
    }

    @Test
    public void testOuterHtml_emptyDocument_returnsEmptyOrMinimalString() {
        Document emptyDoc = new Document("http://example.com/");
        String html = emptyDoc.outerHtml();
        assertNotNull(html);
    }

    // ---------- text(String) Tests ----------

    @Test
    public void testText_setTextOnDocumentWithBody_setsBodyText() {
        Document shellDoc = Document.createShell("http://example.com/");
        shellDoc.text("Hello World");
        assertEquals("Hello World", shellDoc.body().text());
    }

    @Test
    public void testText_returnsSameDocumentInstance() {
        Document shellDoc = Document.createShell("http://example.com/");
        Element result = shellDoc.text("Some text");
        assertSame(shellDoc, result);
    }

    @Test
    public void testText_emptyString_clearsBodyText() {
        Document shellDoc = Document.createShell("http://example.com/");
        shellDoc.text("Initial");
        shellDoc.text("");
        assertEquals("", shellDoc.body().text());
    }

    @Test(expected = NullPointerException.class)
    public void testText_noBodyElement_throwsException() {
        Document emptyDoc = new Document("http://example.com/");
        emptyDoc.text("Some text");
    }

    // ---------- nodeName() Tests ----------

    @Test
    public void testNodeName_returnsDocumentNodeName() {
        assertEquals("#document", doc.nodeName());
    }
}
