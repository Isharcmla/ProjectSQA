package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CleanerTest {
    private Cleaner cleaner;
    private Whitelist whitelist;

    @Before
    public void setUp() {
        whitelist = Whitelist.basicWithImages();
        cleaner = new Cleaner(whitelist);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullWhitelist_throwsException() {
        new Cleaner(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClean_nullDocument_throwsException() {
        cleaner.clean(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsValid_nullDocument_throwsException() {
        cleaner.isValid(null);
    }

    @Test
    public void testClean_validSafeDocument_preservesStructure() {
        String html = "<p><a href=\"http://example.com/\" rel=\"nofollow\">Link</a> <b>Bold</b></p>";
        Document dirty = Jsoup.parse(html, "http://example.com/");
        Document clean = cleaner.clean(dirty);

        Assert.assertEquals("http://example.com/", clean.baseUri());
        Assert.assertEquals("<p><a href=\"http://example.com/\" rel=\"nofollow\">Link</a> <b>Bold</b></p>", clean.body().html());
    }

    @Test
    public void testClean_unsafeTags_removesUnsafeTags() {
        String html = "<p>Safe</p><script>alert('xss');</script><object>unsafe</object>";
        Document dirty = Jsoup.parse(html);
        Document clean = cleaner.clean(dirty);

        Assert.assertFalse(clean.body().html().contains("script"));
        Assert.assertFalse(clean.body().html().contains("object"));
        Assert.assertTrue(clean.body().html().contains("<p>Safe</p>"));
    }

    @Test
    public void testClean_unsafeAttributes_removesUnsafeAttributes() {
        String html = "<p onclick=\"steal()\" style=\"color:red\">Paragraph</p><a href=\"javascript:alert(1)\">Bad Link</a>";
        Document dirty = Jsoup.parse(html);
        Document clean = cleaner.clean(dirty);

        Assert.assertEquals("<p>Paragraph</p>\n<a>Bad Link</a>", clean.body().html());
    }

    @Test
    public void testClean_enforcedAttributes_addsConfiguredAttributes() {
        Whitelist customWhitelist = new Whitelist()
                .addTags("a")
                .addAttributes("a", "href")
                .addEnforcedAttribute("a", "rel", "nofollow");
        Cleaner customCleaner = new Cleaner(customWhitelist);

        Document dirty = Jsoup.parse("<a href=\"http://example.com\">Link</a>");
        Document clean = customCleaner.clean(dirty);

        Assert.assertEquals("<a href=\"http://example.com\" rel=\"nofollow\">Link</a>", clean.body().html());
    }

    @Test
    public void testClean_documentWithNoBody_returnsEmptyBodyDocument() {
        Document framesetDoc = Jsoup.parse("<frameset><frame src=\"frame1.html\"></frameset>");
        if (framesetDoc.body() != null) {
            framesetDoc.body().remove();
        }
        Document clean = cleaner.clean(framesetDoc);

        Assert.assertNotNull(clean.body());
        Assert.assertEquals("", clean.body().html());
    }

    @Test
    public void testClean_textNodes_preservesTextNodes() {
        Document dirty = Jsoup.parse("Hello World &amp; Test");
        Document clean = cleaner.clean(dirty);

        Assert.assertEquals("Hello World &amp; Test", clean.body().html());
    }

    @Test
    public void testClean_dataNodeInSafeTag_preservesDataNode() {
        Whitelist customWhitelist = new Whitelist().addTags("script");
        Cleaner customCleaner = new Cleaner(customWhitelist);

        Document doc = Document.createShell("http://example.com/");
        Element script = doc.body().appendElement("script");
        script.appendChild(new DataNode("var x = 10;", "http://example.com/"));

        Document clean = customCleaner.clean(doc);
        Assert.assertEquals("<script>var x = 10;</script>", clean.body().html());
    }

    @Test
    public void testClean_dataNodeInUnsafeTag_discardsDataNode() {
        Whitelist customWhitelist = new Whitelist().addTags("p");
        Cleaner customCleaner = new Cleaner(customWhitelist);

        Document doc = Document.createShell("http://example.com/");
        Element div = doc.body().appendElement("div");
        div.appendChild(new DataNode("some data", "http://example.com/"));

        Document clean = customCleaner.clean(doc);
        Assert.assertEquals("", clean.body().html());
    }

    @Test
    public void testClean_commentsAndOtherNodes_discardsNodes() {
        Document dirty = Jsoup.parse("<p>Text<!-- this is a comment --></p>");
        Document clean = cleaner.clean(dirty);

        Assert.assertEquals("<p>Text</p>", clean.body().html());
    }

    @Test
    public void testClean_nestedSafeAndUnsafeHierarchy_cleansAccurately() {
        String html = "<div><p><b><span>Deep text</span></b></p></div>";
        Whitelist customWhitelist = new Whitelist().addTags("p", "b");
        Cleaner customCleaner = new Cleaner(customWhitelist);

        Document dirty = Jsoup.parse(html);
        Document clean = customCleaner.clean(dirty);

        Assert.assertEquals("<p><b>Deep text</b></p>", clean.body().html());
    }

    @Test
    public void testClean_emptyDocument_returnsEmptyCleanDocument() {
        Document dirty = Jsoup.parse("");
        Document clean = cleaner.clean(dirty);

        Assert.assertEquals("", clean.body().html());
    }

    @Test
    public void testIsValid_allValidElements_returnsTrue() {
        Document validDoc = Jsoup.parse("<p><a href=\"http://example.com/\" rel=\"nofollow\">Link</a></p>", "http://example.com/");
        Assert.assertTrue(cleaner.isValid(validDoc));
    }

    @Test
    public void testIsValid_invalidTag_returnsFalse() {
        Document invalidDoc = Jsoup.parse("<p><script>alert('xss');</script></p>");
        Assert.assertFalse(cleaner.isValid(invalidDoc));
    }

    @Test
    public void testIsValid_invalidAttribute_returnsFalse() {
        Document invalidDoc = Jsoup.parse("<p onclick=\"alert('xss')\">Text</p>");
        Assert.assertFalse(cleaner.isValid(invalidDoc));
    }

    @Test
    public void testIsValid_commentPresent_returnsFalse() {
        Document invalidDoc = Jsoup.parse("<p>Text<!-- comment --></p>");
        Assert.assertFalse(cleaner.isValid(invalidDoc));
    }

    @Test
    public void testIsValid_emptyDocument_returnsTrue() {
        Document validDoc = Jsoup.parse("");
        Assert.assertTrue(cleaner.isValid(validDoc));
    }

    @Test
    public void testIsValid_dataNodeInUnsafeParent_returnsFalse() {
        Whitelist customWhitelist = new Whitelist().addTags("p");
        Cleaner customCleaner = new Cleaner(customWhitelist);

        Document doc = Document.createShell("http://example.com/");
        Element customTag = doc.body().appendElement("custom");
        customTag.appendChild(new DataNode("some data", "http://example.com/"));

        Assert.assertFalse(customCleaner.isValid(doc));
    }
}
