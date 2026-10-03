package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

public class DocumentTest {

    @Test
    public void testConstructor_validUri_createsDocumentWithBaseUri() {
        Document doc = new Document("http://example.com/");
        assertEquals("http://example.com/", doc.baseUri());
        assertEquals("#document", doc.nodeName());
    }

    @Test
    public void testCreateShell_validUri_createsStructureWithHtmlHeadBody() {
        Document doc = Document.createShell("http://example.com/");
        assertNotNull(doc.select("html").first());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateShell_nullUri_throwsException() {
        Document.createShell(null);
    }

    @Test
    public void testHeadAndBody_whenEmptyDocument_returnsNull() {
        Document doc = new Document("http://example.com/");
        assertNull(doc.head());
        assertNull(doc.body());
    }

    @Test
    public void testHeadAndBody_whenShell_returnsHeadAndBodyElements() {
        Document doc = Document.createShell("http://example.com/");
        Element head = doc.head();
        Element body = doc.body();

        assertNotNull(head);
        assertEquals("head", head.tagName());
        assertNotNull(body);
        assertEquals("body", body.tagName());
    }

    @Test
    public void testTitle_whenTitleElementNotPresent_returnsEmptyString() {
        Document doc = Document.createShell("http://example.com/");
        assertEquals("", doc.title());
    }

    @Test
    public void testTitle_whenTitleElementPresent_returnsTrimmedTitle() {
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendElement("title").text("   Test Title   ");
        assertEquals("Test Title", doc.title());
    }

    @Test
    public void testSetTitle_whenNoExistingTitle_appendsTitleToHead() {
        Document doc = Document.createShell("http://example.com/");
        doc.title("New Title");

        assertEquals("New Title", doc.title());
        assertNotNull(doc.head().getElementsByTag("title").first());
        assertEquals("New Title", doc.head().getElementsByTag("title").first().text());
    }

    @Test
    public void testSetTitle_whenExistingTitle_updatesTitleText() {
        Document doc = Document.createShell("http://example.com/");
        doc.title("Initial Title");
        assertEquals("Initial Title", doc.title());

        doc.title("Updated Title");
        assertEquals("Updated Title", doc.title());
        assertEquals(1, doc.head().getElementsByTag("title").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTitle_nullTitle_throwsException() {
        Document doc = Document.createShell("http://example.com/");
        doc.title(null);
    }

    @Test
    public void testCreateElement_validTagName_returnsDetachedElementWithBaseUri() {
        Document doc = new Document("http://example.com/");
        Element div = doc.createElement("div");

        assertNotNull(div);
        assertEquals("div", div.tagName());
        assertEquals("http://example.com/", div.baseUri());
        assertNull(div.parent());
    }

    @Test
    public void testNormalise_emptyDocument_createsHtmlHeadAndBody() {
        Document doc = new Document("http://example.com/");
        Document normalised = doc.normalise();

        assertSame(doc, normalised);
        assertNotNull(doc.select("html").first());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void testNormalise_missingHeadOnly_createsHeadInHtml() {
        Document doc = new Document("http://example.com/");
        Element html = doc.appendElement("html");
        html.appendElement("body");

        assertNull(doc.head());
        doc.normalise();
        assertNotNull(doc.head());
        assertEquals(doc.select("html").first(), doc.head().parent());
    }

    @Test
    public void testNormalise_missingBodyOnly_createsBodyInHtml() {
        Document doc = new Document("http://example.com/");
        Element html = doc.appendElement("html");
        html.appendElement("head");

        assertNull(doc.body());
        doc.normalise();
        assertNotNull(doc.body());
        assertEquals(doc.select("html").first(), doc.body().parent());
    }

    @Test
    public void testNormalise_movesTextNodesFromBodyContexts() {
        Document doc = new Document("http://example.com/");
        
        // Add non-blank and blank text nodes and element nodes to root
        doc.appendText("Root Text");
        doc.appendText("   ");
        doc.appendElement("div").text("Root Div");

        Element html = doc.appendElement("html");
        html.appendText("HTML Text");
        html.appendText("   ");

        Element head = html.appendElement("head");
        head.appendText("Head Text");
        head.appendText("   ");
        head.appendElement("meta");

        html.appendElement("body");

        doc.normalise();

        String bodyText = doc.body().text();
        assertTrue(bodyText.contains("Head Text"));
        assertTrue(bodyText.contains("HTML Text"));
        assertTrue(bodyText.contains("Root Text"));
    }

    @Test
    public void testOuterHtml_returnsSuperHtmlWithoutDocumentTag() {
        Document doc = Document.createShell("http://example.com/");
        doc.body().appendElement("p").text("Hello");

        String html = doc.outerHtml();
        assertTrue(html.contains("<html>"));
        assertTrue(html.contains("<head>"));
        assertTrue(html.contains("<body>"));
        assertTrue(html.contains("<p>Hello</p>"));
        assertFalse(html.contains("#document"));
    }

    @Test
    public void testText_setsBodyTextAndReturnsDocument() {
        Document doc = Document.createShell("http://example.com/");
        doc.body().appendElement("span").text("Old");

        Document returnedDoc = (Document) doc.text("New Body Content");
        assertSame(doc, returnedDoc);
        assertEquals("New Body Content", doc.body().text());
        assertEquals(0, doc.body().getElementsByTag("span").size());
    }

    @Test
    public void testNodeName_returnsHashDocument() {
        Document doc = new Document("http://example.com/");
        assertEquals("#document", doc.nodeName());
    }
}
