package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class CleanerTest {

    private Whitelist whitelist;

    @Before
    public void setUp() {
        whitelist = Whitelist.basic();
    }

    // ---------- Constructor Tests ----------

    @Test
    public void testConstructor_validWhitelist_createsCleaner() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        assertNotNull(cleaner);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullWhitelist_throwsException() {
        new Cleaner(null);
    }

    // ---------- clean() Tests ----------

    @Test
    public void testClean_normalHtml_returnsCleanedDocument() {
        String html = "<p>Hello <b>World</b></p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean);
        assertTrue(clean.body().html().contains("Hello"));
    }

    @Test
    public void testClean_withDisallowedTags_removesThem() {
        String html = "<p>Safe</p><script>alert('xss')</script>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertFalse(clean.body().html().contains("script"));
        assertTrue(clean.body().html().contains("Safe"));
    }

    @Test
    public void testClean_withDisallowedAttributes_removesThem() {
        String html = "<p onclick=\"alert('xss')\">Text</p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertFalse(clean.body().html().contains("onclick"));
        assertTrue(clean.body().html().contains("Text"));
    }

    @Test
    public void testClean_withNoneWhitelist_stripsAllTags() {
        String html = "<p>Hello <b>World</b></p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.none());
        Document clean = cleaner.clean(dirty);

        assertFalse(clean.body().html().contains("<p>"));
        assertTrue(clean.body().text().contains("Hello"));
    }

    @Test
    public void testClean_emptyBody_returnsEmptyCleanDocument() {
        String html = "";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean);
        assertEquals("", clean.body().html());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClean_nullDocument_throwsException() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.clean(null);
    }

    @Test
    public void testClean_nestedElements_copiesRecursively() {
        String html = "<div><p>Level1<span>Level2</span></p></div>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.relaxed());
        Document clean = cleaner.clean(dirty);

        assertTrue(clean.body().html().contains("Level1"));
        assertTrue(clean.body().html().contains("Level2"));
    }

    @Test
    public void testClean_textNodes_preservedCorrectly() {
        String html = "<p>Just plain text</p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertTrue(clean.body().text().contains("Just plain text"));
    }

    @Test
    public void testClean_disallowedTagWithChildren_childrenPromoted() {
        String html = "<div><script>bad</script><p>Good</p></div>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.none());
        Document clean = cleaner.clean(dirty);

        assertTrue(clean.body().text().contains("Good"));
    }

    @Test
    public void testClean_enforcedAttributes_areAdded() {
        String html = "<a href=\"http://example.com\">Link</a>";
        Document dirty = Jsoup.parse(html);
        Whitelist wl = Whitelist.basic();
        Cleaner cleaner = new Cleaner(wl);
        Document clean = cleaner.clean(dirty);

        assertTrue(clean.body().html().contains("rel=\"nofollow\""));
    }

    // ---------- isValid() Tests ----------

    @Test
    public void testIsValid_safeHtml_returnsTrue() {
        String html = "<p>Hello <b>World</b></p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void testIsValid_unsafeTag_returnsFalse() {
        String html = "<p>Safe</p><script>alert('xss')</script>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void testIsValid_unsafeAttribute_returnsFalse() {
        String html = "<p onclick=\"alert('xss')\">Text</p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void testIsValid_emptyDocument_returnsTrue() {
        String html = "";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void testIsValid_noneWhitelistWithTags_returnsFalse() {
        String html = "<p>Hello</p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.none());

        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void testIsValid_noneWhitelistPlainText_returnsTrue() {
        String html = "Just plain text, no tags";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.none());

        assertTrue(cleaner.isValid(dirty));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsValid_nullDocument_throwsException() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.isValid(null);
    }

    @Test
    public void testIsValid_nestedUnsafeElements_returnsFalse() {
        String html = "<div><p>Text<script>bad()</script></p></div>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void testIsValid_relaxedWhitelistWithTable_returnsTrue() {
        String html = "<table><tr><td>Cell</td></tr></table>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.relaxed());

        assertTrue(cleaner.isValid(dirty));
    }
}
