package org.jsoup.safety ;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

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
    public void testClean_emptyDocument_returnsEmptyBodyDocument() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("");
        Document clean = cleaner.clean(dirty);

        Assert.assertNotNull(clean);
        Assert.assertEquals("", clean.body().html());
    }

    @Test
    public void testClean_validSafeDocument_retainsContent() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("<p><a href=\"http://example.com/\" rel=\"nofollow\">Link</a></p>");
        Document clean = cleaner.clean(dirty);

        Assert.assertEquals("<p><a href=\"http://example.com/\" rel=\"nofollow\">Link</a></p>", clean.body().html());
    }

    @Test
    public void testClean_unsafeTags_removesUnsafeTagsPreservesContent() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("<script>alert('xss');</script><p>Hello <b>world</b></p><style>body {color: red;}</style>");
        Document clean = cleaner.clean(dirty);

        Assert.assertEquals("alert('xss');<p>Hello <b>world</b></p>body {color: red;}", clean.body().html());
    }

    @Test
    public void testClean_unsafeAttributes_removesUnsafeAttributes() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("<p onclick=\"steal()\" class=\"highlight\">Paragraph</p>");
        Document clean = cleaner.clean(dirty);

        Assert.assertEquals("<p>Paragraph</p>", clean.body().html());
    }

    @Test
    public void testClean_enforcedAttributes_addsEnforcedAttributes() {
        Whitelist whitelist = Whitelist.basic().addEnforcedAttribute("a", "target", "_blank");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirty = Jsoup.parse("<a href=\"http://example.com/\">Link</a>");
        Document clean = cleaner.clean(dirty);

        Assert.assertEquals("<a href=\"http://example.com/\" rel=\"nofollow\" target=\"_blank\">Link</a>", clean.body().html());
    }

    @Test
    public void testClean_commentsAndXmlDeclaration_dropped() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("<!-- This is a comment --><p>Content<?xml version=\"1.0\"?></p>");
        Document clean = cleaner.clean(dirty);

        Assert.assertEquals("<p>Content</p>", clean.body().html());
    }

    @Test
    public void testClean_nestedSafeAndUnsafeElements_handledCorrectly() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("<div><span><p><b>Nested text</b></p></span></div>");
        Document clean = cleaner.clean(dirty);

        Assert.assertEquals("<p><b>Nested text</b></p>", clean.body().html());
    }

    @Test
    public void testClean_preservesBaseUri() {
        String baseUri = "http://example.com/base/";
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("<a href=\"rel/path\">Relative</a>", baseUri);
        Document clean = cleaner.clean(dirty);

        Assert.assertEquals(baseUri, clean.baseUri());
        Element anchor = clean.body().getElementsByTag("a").first();
        Assert.assertNotNull(anchor);
        Assert.assertEquals(baseUri, anchor.baseUri());
    }

    @Test
    public void testIsValid_validHtml_returnsTrue() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("<p><a href=\"http://example.com/\" rel=\"nofollow\">Link</a></p>");
        Assert.assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void testIsValid_emptyDocument_returnsTrue() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("");
        Assert.assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void testIsValid_onlyTextNodes_returnsTrue() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("Plain text content without HTML tags");
        Assert.assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void testIsValid_unsafeTag_returnsFalse() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("<script>alert('xss');</script>");
        Assert.assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void testIsValid_unsafeAttribute_returnsFalse() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("<p onclick=\"evil()\">Text</p>");
        Assert.assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void testIsValid_nestedUnsafeTag_returnsFalse() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("<p>Valid text <span><script>alert(1);</script></span></p>");
        Assert.assertFalse(cleaner.isValid(dirty));
    }
}
