package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class CleanerTest {

    private Whitelist whitelist;
    private Cleaner cleaner;

    @Before
    public void setUp() {
        whitelist = Whitelist.basic();
        cleaner = new Cleaner(whitelist);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_validWhitelist_createsCleaner() {
        Cleaner c = new Cleaner(Whitelist.basic());
        assertNotNull(c);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullWhitelist_throwsException() {
        new Cleaner(null);
    }

    // ---------- clean(Document) tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void testClean_nullDocument_throwsException() {
        cleaner.clean(null);
    }

    @Test
    public void testClean_normalHtml_returnsCleanedDocument() {
        String dirtyHtml = "<p>Hello <b>World</b></p><script>alert('xss')</script>";
        Document dirty = Jsoup.parse(dirtyHtml);
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean);
        assertTrue(clean.body().html().contains("Hello"));
        assertFalse(clean.body().html().contains("script"));
    }

    @Test
    public void testClean_withNoneWhitelist_stripsAllTags() {
        Cleaner noneCleaner = new Cleaner(Whitelist.none());
        String dirtyHtml = "<p>Hello <b>World</b></p>";
        Document dirty = Jsoup.parse(dirtyHtml);
        Document clean = noneCleaner.clean(dirty);

        assertEquals("Hello World", clean.body().text());
        assertFalse(clean.body().html().contains("<p>"));
        assertFalse(clean.body().html().contains("<b>"));
    }

    @Test
    public void testClean_withRelaxedWhitelist_keepsAllowedTags() {
        Cleaner relaxedCleaner = new Cleaner(Whitelist.relaxed());
        String dirtyHtml = "<div><p>Some <a href='http://example.com'>link</a></p></div>";
        Document dirty = Jsoup.parse(dirtyHtml);
        Document clean = relaxedCleaner.clean(dirty);

        assertTrue(clean.body().html().contains("<a"));
        assertTrue(clean.body().html().contains("href"));
    }

    @Test
    public void testClean_emptyBody_returnsEmptyCleanBody() {
        Document dirty = Jsoup.parse("");
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean);
        assertNotNull(clean.body());
        assertEquals("", clean.body().text());
    }

    @Test
    public void testClean_withTextNodes_copiesText() {
        String dirtyHtml = "<p>Just some plain text</p>";
        Document dirty = Jsoup.parse(dirtyHtml);
        Document clean = cleaner.clean(dirty);

        assertTrue(clean.body().text().contains("Just some plain text"));
    }

    @Test
    public void testClean_withComments_discardsComments() {
        String dirtyHtml = "<p>Text<!-- a comment --></p>";
        Document dirty = Jsoup.parse(dirtyHtml);
        Document clean = cleaner.clean(dirty);

        assertFalse(clean.body().html().contains("a comment"));
    }

    @Test
    public void testClean_withNestedElements_preservesStructure() {
        String dirtyHtml = "<p>Outer <b>Bold <i>Italic</i></b></p>";
        Document dirty = Jsoup.parse(dirtyHtml);
        Document clean = cleaner.clean(dirty);

        assertTrue(clean.body().html().contains("<b>"));
    }

    @Test
    public void testClean_withUnsafeAttributes_discardsUnsafeAttributes() {
        String dirtyHtml = "<p onclick='alert(1)'>Hello</p>";
        Document dirty = Jsoup.parse(dirtyHtml);
        Document clean = cleaner.clean(dirty);

        assertFalse(clean.body().html().contains("onclick"));
    }

    @Test
    public void testClean_originalDocumentNotModified() {
        String dirtyHtml = "<p>Hello <script>alert(1)</script></p>";
        Document dirty = Jsoup.parse(dirtyHtml);
        String originalHtml = dirty.body().html();

        cleaner.clean(dirty);

        assertEquals(originalHtml, dirty.body().html());
    }

    @Test
    public void testClean_withDataNode_scriptTagInSimpleWhitelist_discardsScript() {
        // basic whitelist does not allow script tag, so data node content should be discarded
        String dirtyHtml = "<script>var a = 1;</script>";
        Document dirty = Jsoup.parse(dirtyHtml);
        Document clean = cleaner.clean(dirty);

        assertFalse(clean.body().html().contains("var a"));
    }

    // ---------- isValid(Document) tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void testIsValid_nullDocument_throwsException() {
        cleaner.isValid(null);
    }

    @Test
    public void testIsValid_validDocument_returnsTrue() {
        String cleanHtml = "<p>Hello <b>World</b></p>";
        Document doc = Jsoup.parse(cleanHtml);
        // basic whitelist allows p and b tags
        boolean valid = cleaner.isValid(doc);

        assertTrue(valid);
    }

    @Test
    public void testIsValid_invalidDocument_returnsFalse() {
        String dirtyHtml = "<p>Hello</p><script>alert(1)</script>";
        Document doc = Jsoup.parse(dirtyHtml);

        boolean valid = cleaner.isValid(doc);

        assertFalse(valid);
    }

    @Test
    public void testIsValid_withNoneWhitelist_anyTagsMakeInvalid() {
        Cleaner noneCleaner = new Cleaner(Whitelist.none());
        Document doc = Jsoup.parse("<p>Some text</p>");

        boolean valid = noneCleaner.isValid(doc);

        assertFalse(valid);
    }

    @Test
    public void testIsValid_plainTextOnly_returnsTrue() {
        Cleaner noneCleaner = new Cleaner(Whitelist.none());
        Document doc = Jsoup.parse("Some text");

        boolean valid = noneCleaner.isValid(doc);

        assertTrue(valid);
    }

    @Test
    public void testIsValid_withUnsafeAttribute_returnsFalse() {
        String dirtyHtml = "<p onclick='alert(1)'>Hello</p>";
        Document doc = Jsoup.parse(dirtyHtml);

        boolean valid = cleaner.isValid(doc);

        assertFalse(valid);
    }

    @Test
    public void testIsValid_emptyDocument_returnsTrue() {
        Document doc = Jsoup.parse("");

        boolean valid = cleaner.isValid(doc);

        assertTrue(valid);
    }

    @Test
    public void testIsValid_withComments_returnsFalse() {
        String dirtyHtml = "<p>Text<!-- a comment --></p>";
        Document doc = Jsoup.parse(dirtyHtml);

        boolean valid = cleaner.isValid(doc);

        assertFalse(valid);
    }

    @Test
    public void testClean_withEnforcedAttributes_addsEnforcedAttribute() {
        // Using a custom whitelist with enforced attribute on 'a' tag
        Whitelist customWhitelist = Whitelist.relaxed()
                .addEnforcedAttribute("a", "rel", "nofollow");
        Cleaner customCleaner = new Cleaner(customWhitelist);

        String dirtyHtml = "<a href='http://example.com'>link</a>";
        Document dirty = Jsoup.parse(dirtyHtml);
        Document clean = customCleaner.clean(dirty);

        assertTrue(clean.body().html().contains("rel=\"nofollow\""));
    }

    @Test
    public void testClean_multipleElementsAtSameLevel_allCopied() {
        String dirtyHtml = "<p>First</p><p>Second</p><p>Third</p>";
        Document dirty = Jsoup.parse(dirtyHtml);
        Document clean = cleaner.clean(dirty);

        Element body = clean.body();
        assertEquals(3, body.children().size());
    }

    @Test
    public void testClean_deeplyNestedSafeAndUnsafeTags_correctlyFiltered() {
        String dirtyHtml = "<div><p>Text <span>span text</span> <b>bold</b></p></div>";
        Document dirty = Jsoup.parse(dirtyHtml);
        Document clean = cleaner.clean(dirty);

        // basic whitelist does not include div or span
        assertFalse(clean.body().html().contains("<div"));
        assertFalse(clean.body().html().contains("<span"));
        assertTrue(clean.body().html().contains("<b>"));
    }
}
