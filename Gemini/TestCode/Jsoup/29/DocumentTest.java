package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class DocumentTest {

    @Test
    public void testConstructor_validBaseUri_createsDocument() {
        Document doc = new Document("http://example.com/");
        assertEquals("http://example.com/", doc.baseUri());
        assertEquals("#document", doc.nodeName());
        assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());
        assertNotNull(doc.outputSettings());
    }

    @Test
    public void testCreateShell_validBaseUri_createsValidShell() {
        Document doc = Document.createShell("http://example.com/");
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("head", doc.head().tagName());
        assertEquals("body", doc.body().tagName());
        assertEquals("html", doc.head().parent().tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateShell_nullBaseUri_throwsException() {
        Document.createShell(null);
    }

    @Test
    public void testHeadAndBody_emptyDocument_returnsNull() {
        Document doc = new Document("http://example.com/");
        assertNull(doc.head());
        assertNull(doc.body());
    }

    @Test
    public void testTitle_noTitleTag_returnsEmptyString() {
        Document doc = Document.createShell("http://example.com/");
        assertEquals("", doc.title());
    }

    @Test
    public void testTitle_setNewTitleWhenNoTitleTag_createsTitleInHead() {
        Document doc = Document.createShell("http://example.com/");
        doc.title("My Title");
        assertEquals("My Title", doc.title());
        assertEquals("My Title", doc.head().getElementsByTag("title").first().text());
    }

    @Test
    public void testTitle_updateExistingTitle_updatesText() {
        Document doc = Document.createShell("http://example.com/");
        doc.title("Initial Title");
        assertEquals("Initial Title", doc.title());

        doc.title("Updated Title");
        assertEquals("Updated Title", doc.title());
        assertEquals(1, doc.getElementsByTag("title").size());
    }

    @Test
    public void testTitle_whitespaceTrimmed_returnsTrimmed() {
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendElement("title").text("   Trimmed Title   ");
        assertEquals("Trimmed Title", doc.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTitle_nullTitle_throwsException() {
        Document doc = Document.createShell("http://example.com/");
        doc.title(null);
    }

    @Test
    public void testCreateElement_validTag_createsElementWithDocumentBaseUri() {
        Document doc = new Document("http://example.com/");
        Element div = doc.createElement("div");
        assertEquals("div", div.tagName());
        assertEquals("http://example.com/", div.baseUri());
        assertNull(div.parent());
    }

    @Test
    public void testNormalise_emptyDocument_createsStructure() {
        Document doc = new Document("http://example.com/");
        Document normalised = doc.normalise();
        assertSame(doc, normalised);
        assertNotNull(doc.select("html").first());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void testNormalise_movesTextNodesToBody() {
        Document doc = new Document("http://example.com/");
        Element html = doc.appendElement("html");
        Element head = html.appendElement("head");
        Element body = html.appendElement("body");

        doc.appendChild(new TextNode("Root text", ""));
        doc.appendChild(new TextNode("   ", "")); // blank text should not move
        html.appendChild(new TextNode("HTML text", ""));
        head.appendChild(new TextNode("Head text", ""));

        doc.normalise();

        assertTrue(body.text().contains("Root text"));
        assertTrue(body.text().contains("HTML text"));
        assertTrue(body.text().contains("Head text"));
    }

    @Test
    public void testNormalise_duplicateHeadAndBody_mergesContentAndRemovesDuplicates() {
        Document doc = new Document("http://example.com/");
        Element html = doc.appendElement("html");
        Element head1 = html.appendElement("head");
        head1.appendElement("meta").attr("charset", "utf-8");
        Element head2 = html.appendElement("head");
        head2.appendElement("script").attr("src", "app.js");

        Element body1 = html.appendElement("body");
        body1.appendElement("p").text("Paragraph 1");
        Element body2 = html.appendElement("body");
        body2.appendElement("p").text("Paragraph 2");

        doc.normalise();

        assertEquals(1, doc.getElementsByTag("head").size());
        assertEquals(1, doc.getElementsByTag("body").size());
        assertEquals(1, doc.head().getElementsByTag("meta").size());
        assertEquals(1, doc.head().getElementsByTag("script").size());
        assertEquals(2, doc.body().getElementsByTag("p").size());
    }

    @Test
    public void testNormalise_headNotParentedByHtml_reparentsToHtml() {
        Document doc = new Document("http://example.com/");
        Element html = doc.appendElement("html");
        Element outsideDiv = doc.appendElement("div");
        outsideDiv.appendElement("head");

        doc.normalise();

        assertEquals(html, doc.head().parent());
    }

    @Test
    public void testOuterHtml_returnsHtmlContent() {
        Document doc = Document.createShell("http://example.com/");
        doc.body().appendElement("p").text("Hello");
        String outerHtml = doc.outerHtml();
        assertTrue(outerHtml.contains("<html>"));
        assertTrue(outerHtml.contains("Hello"));
        assertEquals(doc.html(), outerHtml);
    }

    @Test
    public void testText_setsBodyTextWithoutNukingStructure() {
        Document doc = Document.createShell("http://example.com/");
        doc.text("Hello World");
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("Hello World", doc.body().text());
        assertEquals("Hello World", doc.text());
    }

    @Test
    public void testNodeName_returnsDocumentNodeName() {
        Document doc = new Document("http://example.com/");
        assertEquals("#document", doc.nodeName());
    }

    @Test
    public void testClone_createsDeepCopy() {
        Document doc = Document.createShell("http://example.com/");
        doc.title("Original");
        doc.outputSettings().indentAmount(4);

        Document clone = doc.clone();
        assertNotEquals(System.identityHashCode(doc), System.identityHashCode(clone));
        assertNotEquals(System.identityHashCode(doc.outputSettings()), System.identityHashCode(clone.outputSettings()));
        assertEquals(doc.title(), clone.title());
        assertEquals(4, clone.outputSettings().indentAmount());

        clone.title("Changed");
        assertEquals("Original", doc.title());
        assertEquals("Changed", clone.title());
    }

    @Test
    public void testOutputSettings_getterAndSetter() {
        Document doc = new Document("http://example.com/");
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.indentAmount(2);
        doc.outputSettings(settings);
        assertSame(settings, doc.outputSettings());
        assertEquals(2, doc.outputSettings().indentAmount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutputSettings_nullSettings_throwsException() {
        Document doc = new Document("http://example.com/");
        doc.outputSettings(null);
    }

    @Test
    public void testQuirksMode_getterAndSetter() {
        Document doc = new Document("http://example.com/");
        assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());

        doc.quirksMode(Document.QuirksMode.quirks);
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());

        doc.quirksMode(Document.QuirksMode.limitedQuirks);
        assertEquals(Document.QuirksMode.limitedQuirks, doc.quirksMode());
    }

    @Test
    public void testOutputSettings_defaults() {
        Document.OutputSettings settings = new Document.OutputSettings();
        assertEquals(Entities.EscapeMode.base, settings.escapeMode());
        assertEquals(StandardCharsets.UTF_8, settings.charset());
        assertTrue(settings.prettyPrint());
        assertEquals(1, settings.indentAmount());
        assertNotNull(settings.encoder());
    }

    @Test
    public void testOutputSettings_escapeMode() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.extended);
        assertEquals(Entities.EscapeMode.extended, settings.escapeMode());

        settings.escapeMode(Entities.EscapeMode.xhtml);
        assertEquals(Entities.EscapeMode.xhtml, settings.escapeMode());
    }

    @Test
    public void testOutputSettings_charsetByObject() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset(StandardCharsets.US_ASCII);
        assertEquals(StandardCharsets.US_ASCII, settings.charset());
        assertEquals(StandardCharsets.US_ASCII.name(), settings.encoder().charset().name());
    }

    @Test
    public void testOutputSettings_charsetByName() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset("ISO-8859-1");
        assertEquals(Charset.forName("ISO-8859-1"), settings.charset());
        assertEquals("ISO-8859-1", settings.encoder().charset().name());
    }

    @Test
    public void testOutputSettings_prettyPrint() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(false);
        assertFalse(settings.prettyPrint());

        settings.prettyPrint(true);
        assertTrue(settings.prettyPrint());
    }

    @Test
    public void testOutputSettings_indentAmount() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.indentAmount(0);
        assertEquals(0, settings.indentAmount());

        settings.indentAmount(8);
        assertEquals(8, settings.indentAmount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutputSettings_negativeIndentAmount_throwsException() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.indentAmount(-1);
    }

    @Test
    public void testOutputSettings_clone() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.extended);
        settings.charset(StandardCharsets.ISO_8859_1);
        settings.indentAmount(4);
        settings.prettyPrint(false);

        Document.OutputSettings clone = settings.clone();
        assertNotEquals(System.identityHashCode(settings), System.identityHashCode(clone));
        assertEquals(Entities.EscapeMode.extended, clone.escapeMode());
        assertEquals(StandardCharsets.ISO_8859_1, clone.charset());
        assertEquals(4, clone.indentAmount());
        assertFalse(clone.prettyPrint());
        assertNotNull(clone.encoder());
    }

    @Test
    public void testQuirksModeEnum_values() {
        Document.QuirksMode[] modes = Document.QuirksMode.values();
        assertEquals(3, modes.length);
        assertEquals(Document.QuirksMode.noQuirks, Document.QuirksMode.valueOf("noQuirks"));
        assertEquals(Document.QuirksMode.quirks, Document.QuirksMode.valueOf("quirks"));
        assertEquals(Document.QuirksMode.limitedQuirks, Document.QuirksMode.valueOf("limitedQuirks"));
    }
}
