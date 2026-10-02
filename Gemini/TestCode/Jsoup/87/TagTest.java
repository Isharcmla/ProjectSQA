package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class TagTest {

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_nullTagName_throwsException() {
        Tag.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_nullTagNameWithSettings_throwsException() {
        Tag.valueOf(null, ParseSettings.preserveCase);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_emptyTagName_throwsException() {
        Tag.valueOf("", ParseSettings.htmlDefault);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_whitespaceOnlyTagName_throwsException() {
        Tag.valueOf("   ", ParseSettings.htmlDefault);
    }

    @Test
    public void testValueOf_knownBlockTag() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.getName());
        assertEquals("div", tag.toString());
        assertTrue(tag.isBlock());
        assertTrue(tag.formatAsBlock());
        assertTrue(tag.canContainBlock());
        assertFalse(tag.isInline());
        assertFalse(tag.isEmpty());
        assertFalse(tag.isSelfClosing());
        assertFalse(tag.isData());
        assertTrue(tag.isKnownTag());
        assertFalse(tag.preserveWhitespace());
        assertFalse(tag.isFormListed());
        assertFalse(tag.isFormSubmittable());
    }

    @Test
    public void testValueOf_knownInlineTag() {
        Tag tag = Tag.valueOf("span");
        assertEquals("span", tag.getName());
        assertFalse(tag.isBlock());
        assertFalse(tag.formatAsBlock());
        assertFalse(tag.canContainBlock());
        assertTrue(tag.isInline());
        assertFalse(tag.isEmpty());
        assertFalse(tag.isSelfClosing());
        assertFalse(tag.isData());
        assertTrue(tag.isKnownTag());
        assertFalse(tag.preserveWhitespace());
        assertFalse(tag.isFormListed());
        assertFalse(tag.isFormSubmittable());
    }

    @Test
    public void testValueOf_knownEmptyTag() {
        Tag tag = Tag.valueOf("img");
        assertEquals("img", tag.getName());
        assertTrue(tag.isEmpty());
        assertTrue(tag.isSelfClosing());
        assertFalse(tag.isData());
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void testValueOf_formatAsInlineBlockTag() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isBlock());
        assertFalse(tag.formatAsBlock());
        assertTrue(tag.canContainBlock());
        assertFalse(tag.isInline());
    }

    @Test
    public void testValueOf_preserveWhitespaceTags() {
        Tag pre = Tag.valueOf("pre");
        assertTrue(pre.preserveWhitespace());

        Tag textarea = Tag.valueOf("textarea");
        assertTrue(textarea.preserveWhitespace());

        Tag title = Tag.valueOf("title");
        assertTrue(title.preserveWhitespace());

        Tag plaintext = Tag.valueOf("plaintext");
        assertTrue(plaintext.preserveWhitespace());
    }

    @Test
    public void testValueOf_formControls() {
        Tag input = Tag.valueOf("input");
        assertTrue(input.isFormListed());
        assertTrue(input.isFormSubmittable());

        Tag fieldset = Tag.valueOf("fieldset");
        assertTrue(fieldset.isFormListed());
        assertFalse(fieldset.isFormSubmittable());
    }

    @Test
    public void testValueOf_unknownTag_defaultBehavior() {
        Tag tag = Tag.valueOf("custom-tag");
        assertEquals("custom-tag", tag.getName());
        assertFalse(tag.isBlock());
        assertTrue(tag.formatAsBlock());
        assertFalse(tag.canContainBlock());
        assertTrue(tag.isInline());
        assertFalse(tag.isEmpty());
        assertFalse(tag.isSelfClosing());
        assertFalse(tag.isData());
        assertFalse(tag.isKnownTag());
        assertFalse(tag.preserveWhitespace());
        assertFalse(tag.isFormListed());
        assertFalse(tag.isFormSubmittable());
    }

    @Test
    public void testValueOf_caseSensitivityHandling() {
        Tag tagLower = Tag.valueOf("DIV", ParseSettings.htmlDefault);
        assertEquals("div", tagLower.getName());
        assertTrue(tagLower.isKnownTag());

        Tag tagPreserved = Tag.valueOf("DIV", ParseSettings.preserveCase);
        assertEquals("DIV", tagPreserved.getName());
        assertFalse(tagPreserved.isKnownTag());
    }

    @Test
    public void testIsKnownTag_staticAndInstance() {
        assertTrue(Tag.isKnownTag("p"));
        assertTrue(Tag.isKnownTag("div"));
        assertTrue(Tag.isKnownTag("a"));
        assertFalse(Tag.isKnownTag("unknown-tag-xyz"));

        Tag knownTag = Tag.valueOf("a");
        assertTrue(knownTag.isKnownTag());

        Tag unknownTag = Tag.valueOf("custom");
        assertFalse(unknownTag.isKnownTag());
    }

    @Test
    public void testSetSelfClosing() {
        Tag tag = Tag.valueOf("custom-element");
        assertFalse(tag.isSelfClosing());
        Tag selfClosingTag = tag.setSelfClosing();
        assertTrue(selfClosingTag.isSelfClosing());
        assertEquals(tag, selfClosingTag);
    }

    @Test
    public void testEquals_and_hashCode() {
        Tag div1 = Tag.valueOf("div");
        Tag div2 = Tag.valueOf("div");
        Tag p = Tag.valueOf("p");
        Tag custom1 = Tag.valueOf("custom");
        Tag custom2 = Tag.valueOf("custom");
        Tag customSelfClosing = Tag.valueOf("custom").setSelfClosing();

        // Reflexive
        assertEquals(div1, div1);
        // Symmetric
        assertEquals(div1, div2);
        assertEquals(div2, div1);
        assertEquals(div1.hashCode(), div2.hashCode());

        // Custom tags equality
        assertEquals(custom1, custom2);
        assertEquals(custom1.hashCode(), custom2.hashCode());

        // Different instances and types
        assertNotEquals(div1, null);
        assertNotEquals(div1, "div");
        assertNotEquals(div1, p);

        // Difference in selfClosing attribute
        assertNotEquals(custom1, customSelfClosing);
        assertNotEquals(custom1.hashCode(), customSelfClosing.hashCode());
    }
}
