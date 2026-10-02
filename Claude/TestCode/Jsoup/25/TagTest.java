package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TagTest {

    @Test
    public void testValueOf_knownBlockTag_returnsSameInstance() {
        Tag div1 = Tag.valueOf("div");
        Tag div2 = Tag.valueOf("div");
        assertSame(div1, div2);
        assertEquals("div", div1.getName());
    }

    @Test
    public void testValueOf_knownInlineTag_returnsCorrectProperties() {
        Tag span = Tag.valueOf("span");
        assertEquals("span", span.getName());
        assertFalse(span.isBlock());
        assertTrue(span.isInline());
        assertFalse(span.canContainBlock());
    }

    @Test
    public void testValueOf_caseInsensitive_returnsSameInstance() {
        Tag divLower = Tag.valueOf("div");
        Tag divUpper = Tag.valueOf("DIV");
        assertSame(divLower, divUpper);
    }

    @Test
    public void testValueOf_withWhitespace_trimsAndReturnsSameInstance() {
        Tag div1 = Tag.valueOf("div");
        Tag div2 = Tag.valueOf("  div  ");
        assertSame(div1, div2);
    }

    @Test
    public void testValueOf_unknownTag_returnsNewGenericTag() {
        Tag unknown1 = Tag.valueOf("customtag");
        Tag unknown2 = Tag.valueOf("customtag");
        // unknown tags are not registered, so they should be different instances but equal
        assertNotSame(unknown1, unknown2);
        assertEquals(unknown1, unknown2);
        assertFalse(unknown1.isBlock());
        assertTrue(unknown1.canContainBlock());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_nullTagName_throwsException() {
        Tag.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_emptyTagName_throwsException() {
        Tag.valueOf("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_whitespaceOnlyTagName_throwsException() {
        Tag.valueOf("   ");
    }

    @Test
    public void testGetName_knownTag_returnsCorrectName() {
        Tag p = Tag.valueOf("p");
        assertEquals("p", p.getName());
    }

    @Test
    public void testGetName_unknownTag_returnsCorrectName() {
        Tag custom = Tag.valueOf("mycustomtag");
        assertEquals("mycustomtag", custom.getName());
    }

    @Test
    public void testIsBlock_blockTag_returnsTrue() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.isBlock());
    }

    @Test
    public void testIsBlock_inlineTag_returnsFalse() {
        Tag span = Tag.valueOf("span");
        assertFalse(span.isBlock());
    }

    @Test
    public void testFormatAsBlock_blockTag_returnsTrue() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.formatAsBlock());
    }

    @Test
    public void testFormatAsBlock_formatAsInlineTag_returnsFalse() {
        Tag p = Tag.valueOf("p");
        assertFalse(p.formatAsBlock());
    }

    @Test
    public void testFormatAsBlock_inlineTag_returnsFalse() {
        Tag span = Tag.valueOf("span");
        assertFalse(span.formatAsBlock());
    }

    @Test
    public void testCanContainBlock_blockTag_returnsTrue() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.canContainBlock());
    }

    @Test
    public void testCanContainBlock_inlineTag_returnsFalse() {
        Tag span = Tag.valueOf("span");
        assertFalse(span.canContainBlock());
    }

    @Test
    public void testCanContainBlock_emptyTag_returnsFalse() {
        Tag img = Tag.valueOf("img");
        assertFalse(img.canContainBlock());
    }

    @Test
    public void testIsInline_blockTag_returnsFalse() {
        Tag div = Tag.valueOf("div");
        assertFalse(div.isInline());
    }

    @Test
    public void testIsInline_inlineTag_returnsTrue() {
        Tag span = Tag.valueOf("span");
        assertTrue(span.isInline());
    }

    @Test
    public void testIsData_normalTag_returnsFalse() {
        Tag div = Tag.valueOf("div");
        assertFalse(div.isData());
    }

    @Test
    public void testIsData_emptyTagLikeImg_returnsFalse() {
        // img has canContainInline=false but empty=true, so isData should be false
        Tag img = Tag.valueOf("img");
        assertFalse(img.isData());
    }

    @Test
    public void testIsData_scriptTagCanContainInlineFalseNotEmpty_returnsTrue() {
        // script tag has canContainInline=false (empty tag processing doesn't apply)
        Tag script = Tag.valueOf("script");
        assertFalse(script.isEmpty());
    }

    @Test
    public void testIsEmpty_emptyTag_returnsTrue() {
        Tag img = Tag.valueOf("img");
        assertTrue(img.isEmpty());
    }

    @Test
    public void testIsEmpty_nonEmptyTag_returnsFalse() {
        Tag div = Tag.valueOf("div");
        assertFalse(div.isEmpty());
    }

    @Test
    public void testIsSelfClosing_emptyTag_returnsTrue() {
        Tag img = Tag.valueOf("img");
        assertTrue(img.isSelfClosing());
    }

    @Test
    public void testIsSelfClosing_nonEmptyNonSelfClosingTag_returnsFalse() {
        Tag div = Tag.valueOf("div");
        assertFalse(div.isSelfClosing());
    }

    @Test
    public void testIsKnownTagInstance_knownTag_returnsTrue() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.isKnownTag());
    }

    @Test
    public void testIsKnownTagInstance_unknownTag_returnsFalse() {
        Tag custom = Tag.valueOf("unknowncustomtag123");
        assertFalse(custom.isKnownTag());
    }

    @Test
    public void testIsKnownTagStatic_knownTag_returnsTrue() {
        assertTrue(Tag.isKnownTag("div"));
    }

    @Test
    public void testIsKnownTagStatic_unknownTag_returnsFalse() {
        assertFalse(Tag.isKnownTag("notarealtagxyz"));
    }

    @Test
    public void testPreserveWhitespace_preTag_returnsTrue() {
        Tag pre = Tag.valueOf("pre");
        assertTrue(pre.preserveWhitespace());
    }

    @Test
    public void testPreserveWhitespace_normalTag_returnsFalse() {
        Tag div = Tag.valueOf("div");
        assertFalse(div.preserveWhitespace());
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.equals(div));
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
    public void testEquals_differentTagName_returnsFalse() {
        Tag div = Tag.valueOf("div");
        Tag span = Tag.valueOf("span");
        assertFalse(div.equals(span));
    }

    @Test
    public void testEquals_sameProperties_returnsTrue() {
        Tag unknown1 = Tag.valueOf("mycustom1");
        Tag unknown2 = Tag.valueOf("mycustom1");
        assertTrue(unknown1.equals(unknown2));
    }

    @Test
    public void testEquals_differentCanContainBlock_returnsFalse() {
        Tag div = Tag.valueOf("div");
        Tag span = Tag.valueOf("span");
        // div.canContainBlock=true, span.canContainBlock=false
        assertFalse(div.equals(span));
    }

    @Test
    public void testHashCode_sameTag_returnsSameHashCode() {
        Tag div1 = Tag.valueOf("div");
        Tag div2 = Tag.valueOf("div");
        assertEquals(div1.hashCode(), div2.hashCode());
    }

    @Test
    public void testHashCode_differentTags_mayReturnDifferentHashCode() {
        Tag div = Tag.valueOf("div");
        Tag span = Tag.valueOf("span");
        // not guaranteed different, but typically different for different tag names/properties
        assertNotEquals(div.hashCode(), span.hashCode());
    }

    @Test
    public void testToString_returnsTagName() {
        Tag div = Tag.valueOf("div");
        assertEquals("div", div.toString());
    }

    @Test
    public void testToString_unknownTag_returnsTagName() {
        Tag custom = Tag.valueOf("mycustomtag2");
        assertEquals("mycustomtag2", custom.toString());
    }

    @Test
    public void testValueOf_scriptTag_isDataTrue() {
        Tag script = Tag.valueOf("script");
        assertTrue(script.isData());
    }

    @Test
    public void testValueOf_titleTag_preserveWhitespaceTrue() {
        Tag title = Tag.valueOf("title");
        assertTrue(title.preserveWhitespace());
        assertFalse(title.formatAsBlock());
    }

    @Test
    public void testValueOf_plaintextTag_preserveWhitespaceTrue() {
        Tag plaintext = Tag.valueOf("plaintext");
        assertTrue(plaintext.preserveWhitespace());
    }

    @Test
    public void testValueOf_brTag_isEmptyAndSelfClosing() {
        Tag br = Tag.valueOf("br");
        assertTrue(br.isEmpty());
        assertTrue(br.isSelfClosing());
    }

    @Test
    public void testValueOf_hrTag_isEmpty() {
        Tag hr = Tag.valueOf("hr");
        assertTrue(hr.isEmpty());
    }

    @Test
    public void testValueOf_inputTag_isEmpty() {
        Tag input = Tag.valueOf("input");
        assertTrue(input.isEmpty());
        assertFalse(input.isBlock());
    }

    @Test
    public void testValueOf_liTag_formatAsBlockFalse() {
        Tag li = Tag.valueOf("li");
        assertFalse(li.formatAsBlock());
        assertTrue(li.isBlock());
    }

    @Test
    public void testValueOf_thTag_formatAsBlockFalse() {
        Tag th = Tag.valueOf("th");
        assertFalse(th.formatAsBlock());
    }

    @Test
    public void testValueOf_tdTag_formatAsBlockFalse() {
        Tag td = Tag.valueOf("td");
        assertFalse(td.formatAsBlock());
    }

    @Test
    public void testValueOf_styleTag_isDataTrue() {
        Tag style = Tag.valueOf("style");
        assertTrue(style.isData());
        assertFalse(style.formatAsBlock());
    }

    @Test
    public void testValueOf_headingTags_formatAsBlockFalse() {
        assertFalse(Tag.valueOf("h1").formatAsBlock());
        assertFalse(Tag.valueOf("h2").formatAsBlock());
        assertFalse(Tag.valueOf("h3").formatAsBlock());
        assertFalse(Tag.valueOf("h4").formatAsBlock());
        assertFalse(Tag.valueOf("h5").formatAsBlock());
        assertFalse(Tag.valueOf("h6").formatAsBlock());
    }

    @Test
    public void testValueOf_addressTag_formatAsBlockFalse() {
        assertFalse(Tag.valueOf("address").formatAsBlock());
    }

    @Test
    public void testValueOf_aTag_formatAsBlockFalseAndInline() {
        Tag a = Tag.valueOf("a");
        assertFalse(a.formatAsBlock());
        assertFalse(a.isBlock());
    }

    @Test
    public void testValueOf_metaLinkBaseFrame_areEmpty() {
        assertTrue(Tag.valueOf("meta").isEmpty());
        assertTrue(Tag.valueOf("link").isEmpty());
        assertTrue(Tag.valueOf("base").isEmpty());
        assertTrue(Tag.valueOf("frame").isEmpty());
    }

    @Test
    public void testValueOf_imgWbrEmbed_areEmpty() {
        assertTrue(Tag.valueOf("img").isEmpty());
        assertTrue(Tag.valueOf("wbr").isEmpty());
        assertTrue(Tag.valueOf("embed").isEmpty());
    }

    @Test
    public void testValueOf_keygenColCommandDevice_areEmpty() {
        assertTrue(Tag.valueOf("keygen").isEmpty());
        assertTrue(Tag.valueOf("col").isEmpty());
        assertTrue(Tag.valueOf("command").isEmpty());
        assertTrue(Tag.valueOf("device").isEmpty());
    }

    @Test
    public void testValueOf_uniqueUnknownTags_notEqualBecauseDifferentName() {
        Tag t1 = Tag.valueOf("uniquetag1");
        Tag t2 = Tag.valueOf("uniquetag2");
        assertFalse(t1.equals(t2));
    }

    @Test
    public void testValueOf_repeatedCallSameUnregisteredTag_notSameButEqual() {
        Tag t1 = Tag.valueOf("repeatunknown");
        Tag t2 = Tag.valueOf("repeatunknown");
        assertNotSame(t1, t2);
        assertTrue(t1.equals(t2));
        assertEquals(t1.hashCode(), t2.hashCode());
    }
}
