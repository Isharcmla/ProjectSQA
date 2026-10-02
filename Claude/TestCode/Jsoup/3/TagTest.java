package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TagTest {

    // ---------- valueOf() ----------

    @Test
    public void testValueOf_knownTag_returnsSameInstance() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("p");
        assertSame("Pre-defined tags should be the same instance (==)", tag1, tag2);
    }

    @Test
    public void testValueOf_knownTagUppercase_returnsLowercaseNameAndSameInstance() {
        Tag tag1 = Tag.valueOf("DIV");
        Tag tag2 = Tag.valueOf("div");
        assertSame(tag1, tag2);
        assertEquals("div", tag1.getName());
    }

    @Test
    public void testValueOf_withWhitespace_trimsAndLowercases() {
        Tag tag = Tag.valueOf("  P  ");
        assertEquals("p", tag.getName());
        assertSame(Tag.valueOf("p"), tag);
    }

    @Test
    public void testValueOf_unknownTag_returnsGenericTag() {
        Tag tag = Tag.valueOf("customtag123");
        assertEquals("customtag123", tag.getName());
        assertFalse(tag.isBlock());
        assertTrue(tag.canContainBlock());
    }

    @Test
    public void testValueOf_unknownTagCalledTwice_notSameInstanceButEqual() {
        Tag tag1 = Tag.valueOf("unknowncustom");
        Tag tag2 = Tag.valueOf("unknowncustom");
        assertNotSame("Unknown tags are not registered, should not be same instance", tag1, tag2);
        assertEquals("Unknown tags should still be .equals()", tag1, tag2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_null_throwsException() {
        Tag.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_emptyString_throwsException() {
        Tag.valueOf("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_whitespaceOnlyString_throwsException() {
        Tag.valueOf("   ");
    }

    // ---------- getName() ----------

    @Test
    public void testGetName_returnsLowercaseTagName() {
        Tag tag = Tag.valueOf("SPAN");
        assertEquals("span", tag.getName());
    }

    // ---------- isBlock() ----------

    @Test
    public void testIsBlock_forBlockTag_returnsTrue() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.isBlock());
    }

    @Test
    public void testIsBlock_forInlineTag_returnsFalse() {
        Tag span = Tag.valueOf("span");
        assertFalse(span.isBlock());
    }

    // ---------- canContainBlock() ----------

    @Test
    public void testCanContainBlock_forDivTag_returnsTrue() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.canContainBlock());
    }

    @Test
    public void testCanContainBlock_forScriptTag_returnsFalse() {
        Tag script = Tag.valueOf("script");
        assertFalse(script.canContainBlock());
    }

    @Test
    public void testCanContainBlock_forPTag_returnsFalse() {
        Tag p = Tag.valueOf("p");
        assertFalse(p.canContainBlock());
    }

    // ---------- isInline() ----------

    @Test
    public void testIsInline_forSpanTag_returnsTrue() {
        Tag span = Tag.valueOf("span");
        assertTrue(span.isInline());
    }

    @Test
    public void testIsInline_forDivTag_returnsFalse() {
        Tag div = Tag.valueOf("div");
        assertFalse(div.isInline());
    }

    // ---------- isData() ----------

    @Test
    public void testIsData_forScriptTag_returnsTrue() {
        Tag script = Tag.valueOf("script");
        assertTrue(script.isData());
    }

    @Test
    public void testIsData_forDivTag_returnsFalse() {
        Tag div = Tag.valueOf("div");
        assertFalse(div.isData());
    }

    @Test
    public void testIsData_forEmptyTag_returnsFalse() {
        // img is empty=true, canContainInline=false -> isData = !canContainInline && !isEmpty() = true && false = false
        Tag img = Tag.valueOf("img");
        assertFalse(img.isData());
    }

    // ---------- isEmpty() ----------

    @Test
    public void testIsEmpty_forImgTag_returnsTrue() {
        Tag img = Tag.valueOf("img");
        assertTrue(img.isEmpty());
    }

    @Test
    public void testIsEmpty_forDivTag_returnsFalse() {
        Tag div = Tag.valueOf("div");
        assertFalse(div.isEmpty());
    }

    // ---------- preserveWhitespace() ----------

    @Test
    public void testPreserveWhitespace_forPreTag_returnsTrue() {
        Tag pre = Tag.valueOf("pre");
        assertTrue(pre.preserveWhitespace());
    }

    @Test
    public void testPreserveWhitespace_forDivTag_returnsFalse() {
        Tag div = Tag.valueOf("div");
        assertFalse(div.preserveWhitespace());
    }

    @Test
    public void testPreserveWhitespace_forScriptTag_returnsTrue() {
        Tag script = Tag.valueOf("script");
        assertTrue(script.preserveWhitespace());
    }

    // ---------- equals() ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.equals(div));
    }

    @Test
    public void testEquals_equalTags_returnsTrue() {
        Tag div1 = Tag.valueOf("div");
        Tag div2 = Tag.valueOf("div");
        assertTrue(div1.equals(div2));
    }

    @Test
    public void testEquals_differentTagName_returnsFalse() {
        Tag div = Tag.valueOf("div");
        Tag span = Tag.valueOf("span");
        assertFalse(div.equals(span));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        Tag div = Tag.valueOf("div");
        assertFalse(div.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        Tag div = Tag.valueOf("div");
        assertFalse(div.equals("div"));
    }

    @Test
    public void testEquals_differentBlockProperty_returnsFalse() {
        // div is block, span is not block -> should be false already covered above by tagName diff too
        Tag div = Tag.valueOf("div");
        Tag script = Tag.valueOf("script");
        assertFalse(div.equals(script));
    }

    @Test
    public void testEquals_unknownTagsWithSameName_returnsTrue() {
        Tag tag1 = Tag.valueOf("mycustomtag");
        Tag tag2 = Tag.valueOf("mycustomtag");
        assertTrue(tag1.equals(tag2));
    }

    // ---------- hashCode() ----------

    @Test
    public void testHashCode_equalTags_haveSameHashCode() {
        Tag div1 = Tag.valueOf("div");
        Tag div2 = Tag.valueOf("div");
        assertEquals(div1.hashCode(), div2.hashCode());
    }

    @Test
    public void testHashCode_differentTags_mayHaveDifferentHashCode() {
        Tag div = Tag.valueOf("div");
        Tag span = Tag.valueOf("span");
        assertNotEquals(div.hashCode(), span.hashCode());
    }

    // ---------- toString() ----------

    @Test
    public void testToString_returnsTagName() {
        Tag div = Tag.valueOf("div");
        assertEquals("div", div.toString());
    }

    @Test
    public void testToString_forUnknownTag_returnsGivenName() {
        Tag custom = Tag.valueOf("mytag");
        assertEquals("mytag", custom.toString());
    }
}
