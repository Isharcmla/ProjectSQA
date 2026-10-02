package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class WhitelistTest {

    @Test
    public void testNone_createsEmptyWhitelist() {
        Whitelist wl = Whitelist.none();
        Assert.assertFalse(wl.isSafeTag("p"));
        Assert.assertFalse(wl.isSafeTag("a"));
    }

    @Test
    public void testSimpleText_allowsBasicFormattingTags() {
        Whitelist wl = Whitelist.simpleText();
        Assert.assertTrue(wl.isSafeTag("b"));
        Assert.assertTrue(wl.isSafeTag("em"));
        Assert.assertTrue(wl.isSafeTag("i"));
        Assert.assertTrue(wl.isSafeTag("strong"));
        Assert.assertTrue(wl.isSafeTag("u"));
        Assert.assertFalse(wl.isSafeTag("p"));
        Assert.assertFalse(wl.isSafeTag("a"));
    }

    @Test
    public void testBasic_allowsTextAndLinksWithEnforcedRel() {
        Whitelist wl = Whitelist.basic();
        Assert.assertTrue(wl.isSafeTag("a"));
        Assert.assertTrue(wl.isSafeTag("p"));
        Assert.assertTrue(wl.isSafeTag("blockquote"));
        Assert.assertFalse(wl.isSafeTag("img"));

        Attributes enforced = wl.getEnforcedAttributes("a");
        Assert.assertEquals("nofollow", enforced.get("rel"));

        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        Attribute hrefAttr = new Attribute("href", "http://example.com/page");
        el.attributes().put(hrefAttr);

        Assert.assertTrue(wl.isSafeAttribute("a", el, hrefAttr));

        Attribute javascriptHref = new Attribute("href", "javascript:alert(1)");
        el.attributes().put(javascriptHref);
        Assert.assertFalse(wl.isSafeAttribute("a", el, javascriptHref));
    }

    @Test
    public void testBasicWithImages_allowsImgTagsAndProtocols() {
        Whitelist wl = Whitelist.basicWithImages();
        Assert.assertTrue(wl.isSafeTag("img"));
        Assert.assertTrue(wl.isSafeTag("a"));

        Element el = new Element(Tag.valueOf("img"), "http://example.com/");
        Attribute srcAttr = new Attribute("src", "https://example.com/pic.png");
        el.attributes().put(srcAttr);

        Assert.assertTrue(wl.isSafeAttribute("img", el, srcAttr));

        Attribute ftpSrc = new Attribute("src", "ftp://example.com/pic.png");
        el.attributes().put(ftpSrc);
        Assert.assertFalse(wl.isSafeAttribute("img", el, ftpSrc));
    }

    @Test
    public void testRelaxed_allowsFullSetOfTagsAndAttributes() {
        Whitelist wl = Whitelist.relaxed();
        Assert.assertTrue(wl.isSafeTag("table"));
        Assert.assertTrue(wl.isSafeTag("div"));
        Assert.assertTrue(wl.isSafeTag("h1"));

        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        Attribute titleAttr = new Attribute("title", "Link Title");
        el.attributes().put(titleAttr);

        Assert.assertTrue(wl.isSafeAttribute("a", el, titleAttr));
        Assert.assertEquals(0, wl.getEnforcedAttributes("a").size());
    }

    @Test
    public void testAddTags_addsMultipleTags() {
        Whitelist wl = new Whitelist();
        wl.addTags("custom", "tag2");
        Assert.assertTrue(wl.isSafeTag("custom"));
        Assert.assertTrue(wl.isSafeTag("tag2"));
        Assert.assertFalse(wl.isSafeTag("unknown"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddTags_nullArray_throwsException() {
        new Whitelist().addTags((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddTags_emptyString_throwsException() {
        new Whitelist().addTags("");
    }

    @Test
    public void testAddAttributes_newAndExistingTags() {
        Whitelist wl = new Whitelist();
        wl.addAttributes("div", "class");
        wl.addAttributes("div", "id", "style");

        Element el = new Element(Tag.valueOf("div"), "http://example.com/");
        Attribute classAttr = new Attribute("class", "my-class");
        Attribute idAttr = new Attribute("id", "my-id");
        Attribute titleAttr = new Attribute("title", "my-title");

        Assert.assertTrue(wl.isSafeAttribute("div", el, classAttr));
        Assert.assertTrue(wl.isSafeAttribute("div", el, idAttr));
        Assert.assertFalse(wl.isSafeAttribute("div", el, titleAttr));
    }

    @Test
    public void testAddAttributes_allPseudoTag() {
        Whitelist wl = new Whitelist();
        wl.addAttributes(":all", "class");

        Element el = new Element(Tag.valueOf("span"), "http://example.com/");
        Attribute classAttr = new Attribute("class", "test");
        Attribute idAttr = new Attribute("id", "test");

        Assert.assertTrue(wl.isSafeAttribute("span", el, classAttr));
        Assert.assertFalse(wl.isSafeAttribute("span", el, idAttr));
        Assert.assertFalse(wl.isSafeAttribute(":all", el, idAttr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAttributes_emptyTag_throwsException() {
        new Whitelist().addAttributes("", "class");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAttributes_nullKeys_throwsException() {
        new Whitelist().addAttributes("div", (String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAttributes_emptyKey_throwsException() {
        new Whitelist().addAttributes("div", "");
    }

    @Test
    public void testAddEnforcedAttribute_addsAndOverrides() {
        Whitelist wl = new Whitelist();
        wl.addEnforcedAttribute("a", "rel", "nofollow");
        wl.addEnforcedAttribute("a", "target", "_blank");
        wl.addEnforcedAttribute("a", "rel", "noopener");

        Attributes enforced = wl.getEnforcedAttributes("a");
        Assert.assertEquals("noopener", enforced.get("rel"));
        Assert.assertEquals("_blank", enforced.get("target"));

        Attributes empty = wl.getEnforcedAttributes("span");
        Assert.assertEquals(0, empty.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEnforcedAttribute_emptyTag_throwsException() {
        new Whitelist().addEnforcedAttribute("", "rel", "nofollow");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEnforcedAttribute_emptyKey_throwsException() {
        new Whitelist().addEnforcedAttribute("a", "", "nofollow");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEnforcedAttribute_emptyValue_throwsException() {
        new Whitelist().addEnforcedAttribute("a", "rel", "");
    }

    @Test
    public void testPreserveRelativeLinks_toggleBehavior() {
        Whitelist wl = new Whitelist();
        wl.addAttributes("a", "href");
        wl.addProtocols("a", "href", "http", "https");

        Element el1 = new Element(Tag.valueOf("a"), "http://example.com/");
        Attribute relAttr1 = new Attribute("href", "/relative/path");
        el1.attributes().put(relAttr1);

        wl.preserveRelativeLinks(false);
        Assert.assertTrue(wl.isSafeAttribute("a", el1, relAttr1));
        Assert.assertEquals("http://example.com/relative/path", relAttr1.getValue());

        Element el2 = new Element(Tag.valueOf("a"), "http://example.com/");
        Attribute relAttr2 = new Attribute("href", "/relative/path");
        el2.attributes().put(relAttr2);

        wl.preserveRelativeLinks(true);
        Assert.assertTrue(wl.isSafeAttribute("a", el2, relAttr2));
        Assert.assertEquals("/relative/path", relAttr2.getValue());
    }

    @Test
    public void testAddProtocols_multipleKeysAndProtocols() {
        Whitelist wl = new Whitelist();
        wl.addAttributes("a", "href", "ping");
        wl.addProtocols("a", "href", "http", "https");
        wl.addProtocols("a", "href", "ftp");
        wl.addProtocols("a", "ping", "https");

        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        Attribute hrefFtp = new Attribute("href", "ftp://ftp.example.com");
        el.attributes().put(hrefFtp);
        Assert.assertTrue(wl.isSafeAttribute("a", el, hrefFtp));

        Attribute hrefMailto = new Attribute("href", "mailto:test@example.com");
        el.attributes().put(hrefMailto);
        Assert.assertFalse(wl.isSafeAttribute("a", el, hrefMailto));

        Attribute pingHttps = new Attribute("ping", "https://example.com/ping");
        el.attributes().put(pingHttps);
        Assert.assertTrue(wl.isSafeAttribute("a", el, pingHttps));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddProtocols_emptyTag_throwsException() {
        new Whitelist().addProtocols("", "href", "http");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddProtocols_emptyKey_throwsException() {
        new Whitelist().addProtocols("a", "", "http");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddProtocols_nullProtocols_throwsException() {
        new Whitelist().addProtocols("a", "href", (String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddProtocols_emptyProtocol_throwsException() {
        new Whitelist().addProtocols("a", "href", "");
    }

    @Test
    public void testIsSafeAttribute_tagHasAttributesButNotKey() {
        Whitelist wl = new Whitelist();
        wl.addAttributes("a", "href");

        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        Attribute attr = new Attribute("title", "text");
        el.attributes().put(attr);

        Assert.assertFalse(wl.isSafeAttribute("a", el, attr));
    }

    @Test
    public void testIsSafeAttribute_protocolsDefinedOnDifferentAttribute() {
        Whitelist wl = new Whitelist();
        wl.addAttributes("a", "href", "title");
        wl.addProtocols("a", "href", "http");

        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        Attribute titleAttr = new Attribute("title", "text");
        el.attributes().put(titleAttr);

        Assert.assertTrue(wl.isSafeAttribute("a", el, titleAttr));
    }

    @Test
    public void testTypedValue_equalsHashCodeToString() {
        Whitelist.TagName tag1 = Whitelist.TagName.valueOf("div");
        Whitelist.TagName tag2 = Whitelist.TagName.valueOf("div");
        Whitelist.TagName tag3 = Whitelist.TagName.valueOf("span");
        Whitelist.AttributeKey key = Whitelist.AttributeKey.valueOf("div");

        Assert.assertEquals(tag1, tag1);
        Assert.assertEquals(tag1, tag2);
        Assert.assertNotEquals(tag1, tag3);
        Assert.assertNotEquals(tag1, null);
        Assert.assertNotEquals(tag1, key);
        Assert.assertNotEquals(tag1, "div");

        Assert.assertEquals(tag1.hashCode(), tag2.hashCode());
        Assert.assertEquals("div", tag1.toString());

        Whitelist.AttributeValue val1 = Whitelist.AttributeValue.valueOf("val");
        Whitelist.AttributeValue val2 = Whitelist.AttributeValue.valueOf("val");
        Whitelist.AttributeValue val3 = Whitelist.AttributeValue.valueOf("other");
        Assert.assertEquals(val1, val2);
        Assert.assertNotEquals(val1, val3);

        Whitelist.Protocol prot1 = Whitelist.Protocol.valueOf("http");
        Whitelist.Protocol prot2 = Whitelist.Protocol.valueOf("http");
        Assert.assertEquals(prot1, prot2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTypedValue_nullValue_throwsException() {
        Whitelist.TagName.valueOf(null);
    }
}
