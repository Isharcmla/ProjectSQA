package org.jsoup.safety;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

public class WhitelistTest {

    private Element createElement(String tagName, String baseUri, String attrKey, String attrValue) {
        Element el = new Element(Tag.valueOf(tagName), baseUri);
        if (attrKey != null) {
            Attribute attr = new Attribute(attrKey, attrValue);
            el.attributes().put(attr);
        }
        return el;
    }

    // ---------- Static factory methods ----------

    @Test
    public void testNone_defaultWhitelist_noTagsAllowed() {
        Whitelist wl = Whitelist.none();
        assertFalse(wl.isSafeTag("p"));
        assertFalse(wl.isSafeTag("b"));
    }

    @Test
    public void testSimpleText_allowsBasicFormattingTags() {
        Whitelist wl = Whitelist.simpleText();
        assertTrue(wl.isSafeTag("b"));
        assertTrue(wl.isSafeTag("em"));
        assertTrue(wl.isSafeTag("i"));
        assertTrue(wl.isSafeTag("strong"));
        assertTrue(wl.isSafeTag("u"));
        assertFalse(wl.isSafeTag("p"));
    }

    @Test
    public void testBasic_allowsExpectedTagsAndAttributes() {
        Whitelist wl = Whitelist.basic();
        assertTrue(wl.isSafeTag("a"));
        assertTrue(wl.isSafeTag("blockquote"));
        assertFalse(wl.isSafeTag("img"));

        Element el = createElement("a", "http://example.com/", "href", "http://example.com/page");
        Attribute attr = el.attributes().asList().get(0);
        assertTrue(wl.isSafeAttribute("a", el, attr));
    }

    @Test
    public void testBasic_enforcedRelNofollowOnA() {
        Whitelist wl = Whitelist.basic();
        Attributes enforced = wl.getEnforcedAttributes("a");
        assertEquals("nofollow", enforced.get("rel"));
    }

    @Test
    public void testBasicWithImages_allowsImgTag() {
        Whitelist wl = Whitelist.basicWithImages();
        assertTrue(wl.isSafeTag("img"));
        assertTrue(wl.isSafeTag("a"));

        Element el = createElement("img", "http://example.com/", "src", "http://example.com/img.png");
        Attribute attr = el.attributes().asList().get(0);
        assertTrue(wl.isSafeAttribute("img", el, attr));
    }

    @Test
    public void testRelaxed_allowsManyStructuralTags() {
        Whitelist wl = Whitelist.relaxed();
        assertTrue(wl.isSafeTag("table"));
        assertTrue(wl.isSafeTag("div"));
        assertTrue(wl.isSafeTag("h1"));
        assertTrue(wl.isSafeTag("img"));
        assertFalse(wl.isSafeTag("script"));
    }

    // ---------- Constructor ----------

    @Test
    public void testConstructor_emptyWhitelist_noTagsAllowed() {
        Whitelist wl = new Whitelist();
        assertFalse(wl.isSafeTag("p"));
    }

    // ---------- addTags ----------

    @Test
    public void testAddTags_normalTags_areAllowed() {
        Whitelist wl = new Whitelist();
        wl.addTags("p", "div");
        assertTrue(wl.isSafeTag("p"));
        assertTrue(wl.isSafeTag("div"));
        assertFalse(wl.isSafeTag("span"));
    }

    @Test
    public void testAddTags_emptyVarargs_noTagsAdded() {
        Whitelist wl = new Whitelist();
        wl.addTags();
        assertFalse(wl.isSafeTag("p"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddTags_nullArray_throwsException() {
        Whitelist wl = new Whitelist();
        wl.addTags((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddTags_emptyStringTag_throwsException() {
        Whitelist wl = new Whitelist();
        wl.addTags("");
    }

    // ---------- addAttributes ----------

    @Test
    public void testAddAttributes_normalUsage_attributeAllowed() {
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addAttributes("a", "href");

        Element el = createElement("a", "http://example.com/", "href", "http://example.com/x");
        Attribute attr = el.attributes().asList().get(0);
        assertTrue(wl.isSafeAttribute("a", el, attr));
    }

    @Test
    public void testAddAttributes_calledTwiceSameTag_mergesAttributes() {
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addAttributes("a", "href");
        wl.addAttributes("a", "title");

        Element el = createElement("a", "http://example.com/", "title", "Some title");
        Attribute attr = el.attributes().asList().get(0);
        assertTrue(wl.isSafeAttribute("a", el, attr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAttributes_emptyTag_throwsException() {
        Whitelist wl = new Whitelist();
        wl.addAttributes("", "href");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAttributes_nullKeys_throwsException() {
        Whitelist wl = new Whitelist();
        wl.addAttributes("a", (String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAttributes_emptyKey_throwsException() {
        Whitelist wl = new Whitelist();
        wl.addAttributes("a", "");
    }

    @Test
    public void testAddAttributes_allPseudoTag_appliesToAllTags() {
        Whitelist wl = new Whitelist();
        wl.addTags("div");
        wl.addAttributes(":all", "class");

        Element el = createElement("div", "http://example.com/", "class", "myclass");
        Attribute attr = el.attributes().asList().get(0);
        assertTrue(wl.isSafeAttribute("div", el, attr));
    }

    // ---------- addEnforcedAttribute ----------

    @Test
    public void testAddEnforcedAttribute_normalUsage_returnsAttribute() {
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addEnforcedAttribute("a", "rel", "nofollow");

        Attributes enforced = wl.getEnforcedAttributes("a");
        assertEquals("nofollow", enforced.get("rel"));
    }

    @Test
    public void testAddEnforcedAttribute_calledTwiceSameTag_overridesOrAddsAttribute() {
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addEnforcedAttribute("a", "rel", "nofollow");
        wl.addEnforcedAttribute("a", "target", "_blank");

        Attributes enforced = wl.getEnforcedAttributes("a");
        assertEquals("nofollow", enforced.get("rel"));
        assertEquals("_blank", enforced.get("target"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEnforcedAttribute_emptyTag_throwsException() {
        Whitelist wl = new Whitelist();
        wl.addEnforcedAttribute("", "rel", "nofollow");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEnforcedAttribute_emptyKey_throwsException() {
        Whitelist wl = new Whitelist();
        wl.addEnforcedAttribute("a", "", "nofollow");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEnforcedAttribute_emptyValue_throwsException() {
        Whitelist wl = new Whitelist();
        wl.addEnforcedAttribute("a", "rel", "");
    }

    // ---------- preserveRelativeLinks ----------

    @Test
    public void testPreserveRelativeLinks_falseByDefault_absolutizesUrl() {
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addAttributes("a", "href");
        wl.addProtocols("a", "href", "http", "https");

        Element el = createElement("a", "http://example.com/", "href", "/relative-page");
        Attribute attr = el.attributes().asList().get(0);

        boolean safe = wl.isSafeAttribute("a", el, attr);
        assertTrue(safe);
        assertEquals("http://example.com/relative-page", attr.getValue());
    }

    @Test
    public void testPreserveRelativeLinks_true_doesNotOverwriteValue() {
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addAttributes("a", "href");
        wl.addProtocols("a", "href", "http", "https");
        wl.preserveRelativeLinks(true);

        Element el = createElement("a", "http://example.com/", "href", "/relative-page");
        Attribute attr = el.attributes().asList().get(0);

        boolean safe = wl.isSafeAttribute("a", el, attr);
        assertTrue(safe);
        assertEquals("/relative-page", attr.getValue());
    }

    // ---------- addProtocols ----------

    @Test
    public void testAddProtocols_normalUsage_validProtocolAllowed() {
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addAttributes("a", "href");
        wl.addProtocols("a", "href", "http", "https");

        Element el = createElement("a", "http://example.com/", "href", "http://example.com/page");
        Attribute attr = el.attributes().asList().get(0);

        assertTrue(wl.isSafeAttribute("a", el, attr));
    }

    @Test
    public void testAddProtocols_invalidProtocol_notAllowed() {
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addAttributes("a", "href");
        wl.addProtocols("a", "href", "http", "https");

        Element el = createElement("a", "http://example.com/", "href", "javascript:alert(1)");
        Attribute attr = el.attributes().asList().get(0);

        assertFalse(wl.isSafeAttribute("a", el, attr));
    }

    @Test
    public void testAddProtocols_calledTwiceSameTagKey_mergesProtocols() {
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addAttributes("a", "href");
        wl.addProtocols("a", "href", "http");
        wl.addProtocols("a", "href", "https");

        Element el = createElement("a", "http://example.com/", "href", "https://example.com/page");
        Attribute attr = el.attributes().asList().get(0);

        assertTrue(wl.isSafeAttribute("a", el, attr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddProtocols_emptyTag_throwsException() {
        Whitelist wl = new Whitelist();
        wl.addProtocols("", "href", "http");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddProtocols_emptyKey_throwsException() {
        Whitelist wl = new Whitelist();
        wl.addProtocols("a", "", "http");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddProtocols_nullProtocolsArray_throwsException() {
        Whitelist wl = new Whitelist();
        wl.addProtocols("a", "href", (String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddProtocols_emptyProtocolString_throwsException() {
        Whitelist wl = new Whitelist();
        wl.addProtocols("a", "href", "");
    }

    // ---------- isSafeTag (package private) ----------

    @Test
    public void testIsSafeTag_tagNotAdded_returnsFalse() {
        Whitelist wl = new Whitelist();
        assertFalse(wl.isSafeTag("p"));
    }

    @Test
    public void testIsSafeTag_tagAdded_returnsTrue() {
        Whitelist wl = new Whitelist();
        wl.addTags("p");
        assertTrue(wl.isSafeTag("p"));
    }

    // ---------- isSafeAttribute (package private) ----------

    @Test
    public void testIsSafeAttribute_tagWithNoAttributesDefined_fallsBackToAllTag_false() {
        Whitelist wl = new Whitelist();
        wl.addTags("div");

        Element el = createElement("div", "http://example.com/", "class", "myclass");
        Attribute attr = el.attributes().asList().get(0);

        assertFalse(wl.isSafeAttribute("div", el, attr));
    }

    @Test
    public void testIsSafeAttribute_attributeNotInAllowedSet_returnsFalse() {
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addAttributes("a", "href");

        Element el = createElement("a", "http://example.com/", "title", "Some title");
        Attribute attr = el.attributes().asList().get(0);

        assertFalse(wl.isSafeAttribute("a", el, attr));
    }

    @Test
    public void testIsSafeAttribute_attributeAllowedNoProtocolDefined_returnsTrue() {
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addAttributes("a", "title");

        Element el = createElement("a", "http://example.com/", "title", "Some title");
        Attribute attr = el.attributes().asList().get(0);

        assertTrue(wl.isSafeAttribute("a", el, attr));
    }

    @Test
    public void testIsSafeAttribute_pseudoAllTagItself_returnsFalseWhenNotDefined() {
        Whitelist wl = new Whitelist();
        wl.addTags(":all");

        Element el = createElement(":all", "http://example.com/", "class", "myclass");
        Attribute attr = el.attributes().asList().get(0);

        // tagName itself is ":all" so recursive fallback should not happen; should return false since attributes not defined
        assertFalse(wl.isSafeAttribute(":all", el, attr));
    }

    // ---------- getEnforcedAttributes (package private) ----------

    @Test
    public void testGetEnforcedAttributes_tagWithNoEnforcedAttributes_returnsEmpty() {
        Whitelist wl = new Whitelist();
        wl.addTags("p");
        Attributes attrs = wl.getEnforcedAttributes("p");
        assertEquals(0, attrs.size());
    }

    @Test
    public void testGetEnforcedAttributes_tagWithEnforcedAttributes_returnsCorrectValues() {
        Whitelist wl = new Whitelist();
        wl.addTags("a");
        wl.addEnforcedAttribute("a", "rel", "nofollow");

        Attributes attrs = wl.getEnforcedAttributes("a");
        assertEquals(1, attrs.size());
        assertEquals("nofollow", attrs.get("rel"));
    }

    // ---------- TypedValue / TagName equals & hashCode (package-private nested classes) ----------

    @Test
    public void testTagName_equalsAndHashCode_sameValue_areEqual() {
        Whitelist.TagName t1 = Whitelist.TagName.valueOf("p");
        Whitelist.TagName t2 = Whitelist.TagName.valueOf("p");
        assertEquals(t1, t2);
        assertEquals(t1.hashCode(), t2.hashCode());
        assertEquals("p", t1.toString());
    }

    @Test
    public void testTagName_equals_differentValue_notEqual() {
        Whitelist.TagName t1 = Whitelist.TagName.valueOf("p");
        Whitelist.TagName t2 = Whitelist.TagName.valueOf("div");
        assertFalse(t1.equals(t2));
    }

    @Test
    public void testTagName_equals_null_returnsFalse() {
        Whitelist.TagName t1 = Whitelist.TagName.valueOf("p");
        assertFalse(t1.equals(null));
    }

    @Test
    public void testTagName_equals_sameInstance_returnsTrue() {
        Whitelist.TagName t1 = Whitelist.TagName.valueOf("p");
        assertTrue(t1.equals(t1));
    }

    @Test
    public void testTagName_equals_differentClass_returnsFalse() {
        Whitelist.TagName t1 = Whitelist.TagName.valueOf("p");
        Whitelist.AttributeKey k1 = Whitelist.AttributeKey.valueOf("p");
        assertFalse(t1.equals(k1));
    }
}
