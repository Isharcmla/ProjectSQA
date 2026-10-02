package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class CleanerTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullWhitelist_throwsException() {
        new Cleaner(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClean_nullDocument_throwsException() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.clean(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsValid_nullDocument_throwsException() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.isValid(null);
    }

    @Test
    public void testClean_simpleValidDocument_returnsSameContent() {
        Document dirty = Jsoup.parse("<p>Hello <b>world</b></p>", "http://example.com/");
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        Document clean = cleaner.clean(dirty);

        assertEquals("http://example.com/", clean.baseUri());
        assertEquals("<p>Hello <b>world</b></p>", clean.body().html());
    }

    @Test
    public void testClean_unsafeTags_removesUnsafeTagsKeepsValidChildren() {
        Document dirty = Jsoup.parse("<p>Safe text</p><script>alert('xss');</script><customtag><b>Keep me</b></customtag>");
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        Document clean = cleaner.clean(dirty);

        assertEquals("<p>Safe text</p><b>Keep me</b>", clean.body().html().replaceAll("\\r?\\n", ""));
    }

    @Test
    public void testClean_unsafeAttributes_removesUnsafeAttributes() {
        Document dirty = Jsoup.parse("<a href=\"http://example.com/\" onclick=\"steal()\" title=\"test\">Link</a>");
        Whitelist whitelist = new Whitelist().addTags("a").addAttributes("a", "href");
        Cleaner cleaner = new Cleaner(whitelist);

        Document clean = cleaner.clean(dirty);

        assertEquals("<a href=\"http://example.com/\">Link</a>", clean.body().html());
    }

    @Test
    public void testClean_enforcedAttributes_addsEnforcedAttributes() {
        Document dirty = Jsoup.parse("<a href=\"http://example.com/\">Link</a>");
        Whitelist whitelist = new Whitelist()
                .addTags("a")
                .addAttributes("a", "href")
                .addEnforcedAttribute("a", "rel", "nofollow");
        Cleaner cleaner = new Cleaner(whitelist);

        Document clean = cleaner.clean(dirty);

        assertEquals("<a href=\"http://example.com/\" rel=\"nofollow\">Link</a>", clean.body().html());
    }

    @Test
    public void testClean_documentWithoutBody_returnsEmptyShell() {
        Document docWithoutBody = new Document("http://example.com/");
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        Document clean = cleaner.clean(docWithoutBody);

        assertNotNull(clean);
        assertNotNull(clean.body());
        assertEquals("", clean.body().html());
    }

    @Test
    public void testClean_commentAndNonElementNodes_skipsComments() {
        Document dirty = Jsoup.parse("<p>Text<!-- this is a comment --> after comment</p>");
        dirty.body().prependChild(new Comment("another comment", "http://example.com/"));
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        Document clean = cleaner.clean(dirty);

        assertEquals("<p>Text after comment</p>", clean.body().html());
    }

    @Test
    public void testIsValid_completelySafeHtml_returnsTrue() {
        Document dirty = Jsoup.parse("<p>Safe text <b>bold</b></p>");
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        boolean valid = cleaner.isValid(dirty);

        assertTrue(valid);
    }

    @Test
    public void testIsValid_unsafeTagPresent_returnsFalse() {
        Document dirty = Jsoup.parse("<p>Safe text</p><script>alert(1);</script>");
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        boolean valid = cleaner.isValid(dirty);

        assertFalse(valid);
    }

    @Test
    public void testIsValid_unsafeAttributePresent_returnsFalse() {
        Document dirty = Jsoup.parse("<p><a href=\"http://example.com/\" onclick=\"steal()\">Link</a></p>");
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        boolean valid = cleaner.isValid(dirty);

        assertFalse(valid);
    }

    @Test
    public void testClean_emptyHtml_returnsEmptyBody() {
        Document dirty = Jsoup.parse("");
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        Document clean = cleaner.clean(dirty);

        assertEquals("", clean.body().html());
        assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void testClean_nestedSafeAndUnsafeTags_filtersCorrectly() {
        Document dirty = Jsoup.parse("<div><unknown><span><b>Text</b></span></unknown></div>");
        Whitelist whitelist = new Whitelist().addTags("div", "b");
        Cleaner cleaner = new Cleaner(whitelist);

        Document clean = cleaner.clean(dirty);

        assertEquals("<div><b>Text</b></div>", clean.body().html().replaceAll("\\r?\\n", ""));
        assertFalse(cleaner.isValid(dirty));
    }
}
