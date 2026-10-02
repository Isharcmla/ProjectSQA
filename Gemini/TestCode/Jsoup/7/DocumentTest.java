package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class DocumentTest {

    @Test
    public void testConstructor_withValidUri_createsDocument() {
        Document doc = new Document("http://example.com/");
        Assert.assertEquals("http://example.com/", doc.baseUri());
        Assert.assertEquals("#document", doc.nodeName());
        Assert.assertEquals(0, doc.childNodeSize());
    }

    @Test
    public void testConstructor_withEmptyUri_createsDocument() {
        Document doc = new Document("");
        Assert.assertEquals("", doc.baseUri());
        Assert.assertEquals("#document", doc.nodeName());
    }

    @Test
    public void testCreateShell_validUri_createsStructureWithHtmlHeadBody() {
        Document doc = Document.createShell("http://example.com/");
        Assert.assertNotNull(doc);
        Assert.assertEquals("http://example.com/", doc.baseUri());

        Element head = doc.head();
        Element body = doc.body();

        Assert.assertNotNull(head);
        Assert.assertEquals("head", head.nodeName());
        Assert.assertNotNull(body);
        Assert.assertEquals("body", body.nodeName());
        Assert.assertEquals("html", head.parent().nodeName());
        Assert.assertEquals("html", body.parent().nodeName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateShell_nullUri_throwsException() {
        Document.createShell(null);
    }

    @Test
    public void testHeadAndBody_whenNotPresent_returnsNull() {
        Document doc = new Document("http://example.com/");
        Assert.assertNull(doc.head());
        Assert.assertNull(doc.body());
    }

    @Test
    public void testTitle_whenNoTitleTag_returnsEmptyString() {
        Document doc = Document.createShell("http://example.com/");
        Assert.assertEquals("", doc.title());
    }

    @Test
    public void testTitle_withExistingTitleTag_returnsTrimmedTitle() {
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendElement("title").text("   Test Title   ");
        Assert.assertEquals("Test Title", doc.title());
    }

    @Test
    public void testTitleSetter_whenTitleTagNotPresent_createsTitleInHead() {
        Document doc = Document.createShell("http://example.com/");
        doc.title("New Title");
        
        Assert.assertEquals("New Title", doc.title());
        Element titleEl = doc.head().getElementsByTag("title").first();
        Assert.assertNotNull(titleEl);
        Assert.assertEquals("New Title", titleEl.text());
    }

    @Test
    public void testTitleSetter_whenTitleTagAlreadyPresent_updatesTitle() {
        Document doc = Document.createShell("http://example.com/");
        doc.title("First Title");
        Assert.assertEquals("First Title", doc.title());

        doc.title("Updated Title");
        Assert.assertEquals("Updated Title", doc.title());
        Assert.assertEquals(1, doc.getElementsByTag("title").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTitleSetter_nullTitle_throwsException() {
        Document doc = Document.createShell("http://example.com/");
        doc.title(null);
    }

    @Test
    public void testCreateElement_validTag_createsDetachedElementWithBaseUri() {
        Document doc = new Document("http://example.com/");
        Element div = doc.createElement("div");

        Assert.assertNotNull(div);
        Assert.assertEquals("div", div.tagName());
        Assert.assertEquals("http://example.com/", div.baseUri());
        Assert.assertNull(div.parent());
    }

    @Test
    public void testNormalise_emptyDocument_createsHtmlHeadAndBody() {
        Document doc = new Document("http://example.com/");
        Document normalised = doc.normalise();

        Assert.assertSame(doc, normalised);
        Assert.assertNotNull(doc.select("html").first());
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
    }

    @Test
    public void testNormalise_missingHead_createsHeadInHtml() {
        Document doc = new Document("http://example.com/");
        Element html = doc.appendElement("html");
        html.appendElement("body");

        doc.normalise();
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
        Assert.assertEquals("head", html.child(0).tagName());
        Assert.assertEquals("body", html.child(1).tagName());
    }

    @Test
    public void testNormalise_missingBody_createsBodyInHtml() {
        Document doc = new Document("http://example.com/");
        Element html = doc.appendElement("html");
        html.appendElement("head");

        doc.normalise();
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
        Assert.assertEquals("head", html.child(0).tagName());
        Assert.assertEquals("body", html.child(1).tagName());
    }

    @Test
    public void testNormalise_movesTextNodesToBodyAndIgnoresBlankTextNodes() {
        Document doc = new Document("http://example.com/");
        Element html = doc.appendElement("html");
        Element head = html.appendElement("head");
        Element body = html.appendElement("body");

        // Add non-blank and blank text nodes in root, html, and head
        doc.prependText("RootText");
        doc.prependText("   "); // blank
        html.prependText("HtmlText");
        html.prependText("\n\t"); // blank
        head.prependText("HeadText");
        head.prependText(" "); // blank

        // Also add a non-text element to ensure it's not moved as text
        head.appendElement("meta");

        doc.normalise();

        String bodyText = body.text();
        Assert.assertTrue(bodyText.contains("RootText"));
        Assert.assertTrue(bodyText.contains("HtmlText"));
        Assert.assertTrue(bodyText.contains("HeadText"));
        Assert.assertNotNull(head.select("meta").first());
    }

    @Test
    public void testOuterHtml_returnsInnerHtmlOfDocument() {
        Document doc = Document.createShell("http://example.com/");
        doc.body().appendElement("p").text("Hello World");

        String html = doc.outerHtml();
        Assert.assertFalse(html.startsWith("#root"));
        Assert.assertTrue(html.contains("<html>"));
        Assert.assertTrue(html.contains("<p>Hello World</p>"));
    }

    @Test
    public void testText_setsTextInBody() {
        Document doc = Document.createShell("http://example.com/");
        doc.body().appendElement("p").text("Old text");

        Document returnedDoc = (Document) doc.text("New direct text");
        Assert.assertSame(doc, returnedDoc);
        Assert.assertEquals("New direct text", doc.body().text());
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
    }

    @Test
    public void testNodeName_returnsDocumentHashTag() {
        Document doc = new Document("http://example.com/");
        Assert.assertEquals("#document", doc.nodeName());
    }

    @Test
    public void testOutputSettings_defaults() {
        Document doc = new Document("http://example.com/");
        Document.OutputSettings settings = doc.outputSettings();

        Assert.assertNotNull(settings);
        Assert.assertEquals(Entities.EscapeMode.base, settings.escapeMode());
        Assert.assertEquals(Charset.forName("UTF-8"), settings.charset());
        Assert.assertNotNull(settings.encoder());
        Assert.assertTrue(settings.prettyPrint());
        Assert.assertEquals(1, settings.indentAmount());
    }

    @Test
    public void testOutputSettings_escapeMode() {
        Document doc = new Document("http://example.com/");
        Document.OutputSettings settings = doc.outputSettings();

        Document.OutputSettings returned = settings.escapeMode(Entities.EscapeMode.extended);
        Assert.assertSame(settings, returned);
        Assert.assertEquals(Entities.EscapeMode.extended, settings.escapeMode());
    }

    @Test
    public void testOutputSettings_charsetByCharset() {
        Document doc = new Document("http://example.com/");
        Document.OutputSettings settings = doc.outputSettings();
        Charset iso = Charset.forName("ISO-8859-1");

        Document.OutputSettings returned = settings.charset(iso);
        Assert.assertSame(settings, returned);
        Assert.assertEquals(iso, settings.charset());
        
        CharsetEncoder encoder = settings.encoder();
        Assert.assertNotNull(encoder);
        Assert.assertEquals(iso, encoder.charset());
    }

    @Test
    public void testOutputSettings_charsetByName() {
        Document doc = new Document("http://example.com/");
        Document.OutputSettings settings = doc.outputSettings();

        Document.OutputSettings returned = settings.charset("US-ASCII");
        Assert.assertSame(settings, returned);
        Assert.assertEquals(Charset.forName("US-ASCII"), settings.charset());
        Assert.assertEquals(Charset.forName("US-ASCII"), settings.encoder().charset());
    }

    @Test
    public void testOutputSettings_prettyPrint() {
        Document doc = new Document("http://example.com/");
        Document.OutputSettings settings = doc.outputSettings();

        Document.OutputSettings returned = settings.prettyPrint(false);
        Assert.assertSame(settings, returned);
        Assert.assertFalse(settings.prettyPrint());

        settings.prettyPrint(true);
        Assert.assertTrue(settings.prettyPrint());
    }

    @Test
    public void testOutputSettings_indentAmount_validValues() {
        Document doc = new Document("http://example.com/");
        Document.OutputSettings settings = doc.outputSettings();

        Document.OutputSettings returnedZero = settings.indentAmount(0);
        Assert.assertSame(settings, returnedZero);
        Assert.assertEquals(0, settings.indentAmount());

        settings.indentAmount(4);
        Assert.assertEquals(4, settings.indentAmount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutputSettings_indentAmount_negativeValue_throwsException() {
        Document doc = new Document("http://example.com/");
        doc.outputSettings().indentAmount(-1);
    }
}
