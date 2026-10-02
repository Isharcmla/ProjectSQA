package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class TagTest {

    @Test(expected = IllegalArgumentException.class)
    public void valueOf_nullTagName_throwsIllegalArgumentException() {
        Tag.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void valueOf_emptyTagName_throwsIllegalArgumentException() {
        Tag.valueOf("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void valueOf_whitespaceOnlyTagName_throwsIllegalArgumentException() {
        Tag.valueOf("   ");
    }

    @Test
    public void valueOf_knownTagCaseInsensitiveAndTrimmed_returnsKnownTag() {
        Tag tag1 = Tag.valueOf("P");
        Tag tag2 = Tag.valueOf("  p  ");
        Tag tag3 = Tag.valueOf("p");

        assertEquals("p", tag1.getName());
        assertSameTag(tag1, tag2);
        assertSameTag(tag1, tag3);
        assertTrue(tag1.isKnownTag());
    }

    @Test
    public void valueOf_unknownTag_createsDefaultUnknownTag() {
        Tag unknownTag = Tag.valueOf("CUSTOM-ELEMENT");

        assertEquals("custom-element", unknownTag.getName());
        assertFalse(unknownTag.isKnownTag());
        assertFalse(unknownTag.isBlock());
        assertTrue(unknownTag.isInline());
        assertTrue(unknownTag.formatAsBlock());
        assertTrue(unknownTag.canContainBlock());
        assertFalse(unknownTag.isEmpty());
        assertFalse(unknownTag.isSelfClosing());
        assertFalse(unknownTag.preserveWhitespace());
        assertFalse(unknownTag.isData());
    }

    @Test
    public void isBlock_and_isInline_blockTag_returnsCorrectValues() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.isBlock());
        assertFalse(div.isInline());

        Tag span = Tag.valueOf("span");
        assertFalse(span.isBlock());
        assertTrue(span.isInline());
    }

    @Test
    public void formatAsBlock_variousTags_returnsExpected() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.formatAsBlock());

        Tag p = Tag.valueOf("p");
        assertFalse(p.formatAsBlock());

        Tag span = Tag.valueOf("span");
        assertFalse(span.formatAsBlock());
    }

    @Test
    public void canContainBlock_blockAndInlineTags_returnsExpected() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.canContainBlock());

        Tag span = Tag.valueOf("span");
        assertFalse(span.canContainBlock());
    }

    @Test
    public void isEmpty_and_isData_emptyTag_returnsExpected() {
        Tag img = Tag.valueOf("img");
        assertTrue(img.isEmpty());
        assertFalse(img.isData());

        Tag div = Tag.valueOf("div");
        assertFalse(div.isEmpty());
        assertFalse(div.isData());
    }

    @Test
    public void isSelfClosing_emptyTagAndExplicitSelfClosing_returnsTrue() {
        Tag img = Tag.valueOf("img");
        assertTrue(img.isSelfClosing());

        Tag div = Tag.valueOf("div");
        assertFalse(div.isSelfClosing());

        Tag custom = Tag.valueOf("custom");
        assertFalse(custom.isSelfClosing());
        custom.setSelfClosing();
        assertTrue(custom.isSelfClosing());
    }

    @Test
    public void preserveWhitespace_preserveWhitespaceTags_returnsExpected() {
        Tag pre = Tag.valueOf("pre");
        assertTrue(pre.preserveWhitespace());

        Tag plaintext = Tag.valueOf("plaintext");
        assertTrue(plaintext.preserveWhitespace());

        Tag title = Tag.valueOf("title");
        assertTrue(title.preserveWhitespace());

        Tag div = Tag.valueOf("div");
        assertFalse(div.preserveWhitespace());
    }

    @Test
    public void isKnownTag_staticAndInstance_returnsCorrectBoolean() {
        assertTrue(Tag.isKnownTag("div"));
        assertTrue(Tag.isKnownTag("a"));
        assertFalse(Tag.isKnownTag("customunknown"));

        Tag known = Tag.valueOf("div");
        assertTrue(known.isKnownTag());

        Tag unknown = Tag.valueOf("customunknown");
        assertFalse(unknown.isKnownTag());
    }

    @Test
    public void getName_returnsTagName() {
        Tag tag = Tag.valueOf("DIV");
        assertEquals("div", tag.getName());
    }

    @Test
    public void toString_returnsTagName() {
        Tag tag = Tag.valueOf("DIV");
        assertEquals("div", tag.toString());
    }

    @Test
    public void equals_and_hashCode_contract() {
        Tag tag1 = Tag.valueOf("customtag");
        Tag tag2 = Tag.valueOf("customtag");
        Tag tag3 = Tag.valueOf("othercustom");

        // Reflexive
        assertTrue(tag1.equals(tag1));

        // Symmetric
        assertTrue(tag1.equals(tag2));
        assertTrue(tag2.equals(tag1));
        assertEquals(tag1.hashCode(), tag2.hashCode());

        // Null & different class
        assertFalse(tag1.equals(null));
        assertFalse(tag1.equals("customtag"));

        // Different tag name
        assertFalse(tag1.equals(tag3));
        assertNotEquals(tag1.hashCode(), tag3.hashCode());

        // Different selfClosing flag
        Tag tag4 = Tag.valueOf("customself").setSelfClosing();
        Tag tag5 = Tag.valueOf("customself");
        assertFalse(tag4.equals(tag5));
        assertFalse(tag5.equals(tag4));
        assertNotEquals(tag4.hashCode(), tag5.hashCode());

        // Different known tags with varying internal flags
        Tag div = Tag.valueOf("div");
        Tag p = Tag.valueOf("p");
        Tag span = Tag.valueOf("span");
        Tag img = Tag.valueOf("img");
        Tag pre = Tag.valueOf("pre");

        assertFalse(div.equals(p));
        assertFalse(div.equals(span));
        assertFalse(div.equals(img));
        assertFalse(div.equals(pre));
    }

    private void assertSameTag(Tag expected, Tag actual) {
        assertTrue(expected == actual);
    }
}
