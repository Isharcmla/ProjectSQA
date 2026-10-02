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

    // ---------- Constructor tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullWhitelist_throwsException() {
        new Cleaner(null);
    }

    @Test
    public void testConstructor_validWhitelist_createsInstance() {
        Cleaner cleaner = new Cleaner(whitelist);
        assertNotNull(cleaner);
    }

    // ---------- clean(Document) tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void testClean_nullDocument_throwsException() {
        Cleaner cleaner = new Cleaner(whitelist);
        cleaner.clean(null);
    }

    @Test
    public void testClean_normalHtmlWithSafeTags_returnsCleanedDocument() {
        Document dirty = Jsoup.parse("<p>Hello <b>World</b></p>");
        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean);
        assertTrue(clean.body().html().contains("Hello"));
        assertTrue(clean.body().html().contains("<b>World</b>"));
    }

    @Test
    public void testClean_htmlWithUnsafeTags_removesUnsafeTags() {
        Document dirty = Jsoup.parse("<p>Hello</p><script>alert('xss')</script>");
        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean);
        assertFalse(clean.body().html().contains("script"));
        assertTrue(clean.body().html().contains("Hello"));
    }

    @Test
    public void testClean_emptyBody_returnsEmptyCleanedDocument() {
        Document dirty = Jsoup.parse("");
        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean);
        assertEquals("", clean.body().html().trim());
    }

    @Test
    public void testClean_htmlWithUnsafeAttributes_removesUnsafeAttributes() {
        Document dirty = Jsoup.parse("<p onclick='alert(1)'>Hello</p>");
        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean);
        assertFalse(clean.body().html().contains("onclick"));
        assertTrue(clean.body().html().contains("Hello"));
    }

    @Test
    public void testClean_htmlWithSafeAttributes_keepsSafeAttributes() {
        Whitelist relaxed = Whitelist.relaxed();
        Document dirty = Jsoup.parse("<a href='http://example.com'>Link</a>");
        Cleaner cleaner = new Cleaner(relaxed);
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean);
        assertTrue(clean.body().html().contains("href"));
    }

    @Test
    public void testClean_nestedUnsafeTagsWithSafeChildren_copiesSafeChildren() {
        Document dirty = Jsoup.parse("<div><p>Safe text inside unsafe div</p></div>");
        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean);
        assertTrue(clean.body().html().contains("Safe text inside unsafe div"));
    }

    @Test
    public void testClean_textNodesOnly_preservesText() {
        Document dirty = Jsoup.parse("Just some plain text");
        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean);
        assertTrue(clean.body().text().contains("Just some plain text"));
    }

    @Test
    public void testClean_commentNodes_ignoresComments() {
        Document dirty = Jsoup.parse("<p>Hello</p><!-- a comment -->");
        Cleaner cleaner = new Cleaner(whitelist);
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean);
        assertFalse(clean.body().html().contains("a comment"));
        assertTrue(clean.body().html().contains("Hello"));
    }

    @Test
    public void testClean_enforcedAttributes_addsEnforcedAttributes() {
        Whitelist custom = Whitelist.none()
                .addTags("div")
                .addEnforcedAttribute("div", "class", "enforced-class");

        Document dirty = Jsoup.parse("<div>Content</div>");
        Cleaner cleaner = new Cleaner(custom);
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean);
        assertTrue(clean.body().html().contains("enforced-class"));
    }

    // ---------- isValid(Document) tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void testIsValid_nullDocument_throwsException() {
        Cleaner cleaner = new Cleaner(whitelist);
        cleaner.isValid(null);
    }

    @Test
    public void testIsValid_allSafeTags_returnsTrue() {
        Document dirty = Jsoup.parse("<p>Hello <b>World</b></p>");
        Cleaner cleaner = new Cleaner(whitelist);
        boolean valid = cleaner.isValid(dirty);

        assertTrue(valid);
    }

    @Test
    public void testIsValid_unsafeTagPresent_returnsFalse() {
        Document dirty = Jsoup.parse("<p>Hello</p><script>alert('xss')</script>");
        Cleaner cleaner = new Cleaner(whitelist);
        boolean valid = cleaner.isValid(dirty);

        assertFalse(valid);
    }

    @Test
    public void testIsValid_unsafeAttributePresent_returnsFalse() {
        Document dirty = Jsoup.parse("<p onclick='alert(1)'>Hello</p>");
        Cleaner cleaner = new Cleaner(whitelist);
        boolean valid = cleaner.isValid(dirty);

        assertFalse(valid);
    }

    @Test
    public void testIsValid_emptyDocument_returnsTrue() {
        Document dirty = Jsoup.parse("");
        Cleaner cleaner = new Cleaner(whitelist);
        boolean valid = cleaner.isValid(dirty);

        assertTrue(valid);
    }

    @Test
    public void testIsValid_textOnlyDocument_returnsTrue() {
        Document dirty = Jsoup.parse("Just some plain text");
        Cleaner cleaner = new Cleaner(whitelist);
        boolean valid = cleaner.isValid(dirty);

        assertTrue(valid);
    }

    @Test
    public void testIsValid_nestedUnsafeTagWithSafeChild_returnsFalse() {
        Document dirty = Jsoup.parse("<div><p>Safe text</p></div>");
        Cleaner cleaner = new Cleaner(whitelist);
        boolean valid = cleaner.isValid(dirty);

        assertFalse(valid);
    }

    @Test
    public void testIsValid_multipleUnsafeAttributes_returnsFalse() {
        Document dirty = Jsoup.parse("<p onclick='a()' onmouseover='b()'>Hello</p>");
        Cleaner cleaner = new Cleaner(whitelist);
        boolean valid = cleaner.isValid(dirty);

        assertFalse(valid);
    }

    @Test
    public void testIsValid_relaxedWhitelistWithSafeHref_returnsTrue() {
        Whitelist relaxed = Whitelist.relaxed();
        Document dirty = Jsoup.parse("<a href='http://example.com'>Link</a>");
        Cleaner cleaner = new Cleaner(relaxed);
        boolean valid = cleaner.isValid(dirty);

        assertTrue(valid);
    }
}
