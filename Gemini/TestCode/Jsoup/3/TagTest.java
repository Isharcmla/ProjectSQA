package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class TagTest {

    @Test
    public void testValueOf_knownTag_returnsStandardTag() {
        Tag p = Tag.valueOf("p");
        assertNotNull(p);
        assertEquals("p", p.getName());
        assertTrue(p.isBlock());
        assertTrue(p.canContainInline());
        assertFalse(p.canContainBlock());
        assertFalse(p.isEmpty());
        assertFalse(p.isData());
        assertFalse(p.preserveWhitespace());
    }

    @Test
    public void testValueOf_caseInsensitiveAndTrimmed() {
        Tag tag1 = Tag.valueOf("  DIV  ");
        Tag tag2 = Tag.valueOf("div");
        assertSame(tag1, tag2);
        assertEquals("div", tag1.getName());
    }

    @Test
    public void testValueOf_unknownTag_createsDefaultCustomTag() {
        Tag custom1 = Tag.valueOf("custom-tag");
        Tag custom2 = Tag.valueOf("custom-tag");
        assertEquals("custom-tag", custom1.getName());
        assertFalse(custom1.isBlock());
        assertTrue(custom1.isInline());
        assertTrue(custom1.canContainBlock());
        assertFalse(custom1.isEmpty());
        assertFalse(custom1.isData());
        assertEquals(custom1, custom2);
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
    public void testValueOf_whitespaceTagName_throwsException() {
        Tag.valueOf("   ");
    }

    @Test
    public void testGetName_returnsLowerCaseName() {
        Tag span = Tag.valueOf("SPAN");
        assertEquals("span", span.getName());
    }

    @Test
    public void testIsBlockAndIsInline() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.isBlock());
        assertFalse(div.isInline());

        Tag span = Tag.valueOf("span");
        assertFalse(span.isBlock());
        assertTrue(span.isInline());
    }

    @Test
    public void testCanContainBlock() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.canContainBlock());

        Tag p = Tag.valueOf("p");
        assertFalse(p.canContainBlock());
    }

    @Test
    public void testIsEmpty() {
        Tag img = Tag.valueOf("img");
        assertTrue(img.isEmpty());

        Tag br = Tag.valueOf("br");
        assertTrue(br.isEmpty());

        Tag hr = Tag.valueOf("hr");
        assertTrue(hr.isEmpty());

        Tag div = Tag.valueOf("div");
        assertFalse(div.isEmpty());
    }

    @Test
    public void testIsData() {
        Tag script = Tag.valueOf("script");
        assertTrue(script.isData());

        Tag style = Tag.valueOf("style");
        assertTrue(style.isData());

        Tag textarea = Tag.valueOf("textarea");
        assertTrue(textarea.isData());

        Tag img = Tag.valueOf("img");
        assertFalse(img.isData());

        Tag div = Tag.valueOf("div");
        assertFalse(div.isData());
    }

    @Test
    public void testPreserveWhitespace() {
        Tag pre = Tag.valueOf("pre");
        assertTrue(pre.preserveWhitespace());

        Tag script = Tag.valueOf("script");
        assertTrue(script.preserveWhitespace());

        Tag p = Tag.valueOf("p");
        assertFalse(p.preserveWhitespace());
    }

    @Test
    public void testCanContain_validCombinations_returnsTrue() {
        Tag div = Tag.valueOf("div");
        Tag p = Tag.valueOf("p");
        Tag span = Tag.valueOf("span");

        assertTrue(div.canContain(p));
        assertTrue(div.canContain(span));
        assertTrue(p.canContain(span));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCanContain_nullChild_throwsException() {
        Tag div = Tag.valueOf("div");
        div.canContain(null);
    }

    @Test
    public void testCanContain_blockChildWhenCannotContainBlock_returnsFalse() {
        Tag p = Tag.valueOf("p");
        Tag div = Tag.valueOf("div");
        assertFalse(p.canContain(div));
    }

    @Test
    public void testCanContain_inlineChildWhenCannotContainInline_returnsFalse() {
        Tag script = Tag.valueOf("script");
        Tag span = Tag.valueOf("span");
        assertFalse(script.canContain(span));
    }

    @Test
    public void testCanContain_optionalClosingSameTag_returnsFalse() {
        Tag a = Tag.valueOf("a");
        assertFalse(a.canContain(a));

        Tag li = Tag.valueOf("li");
        assertFalse(li.canContain(li));

        Tag form = Tag.valueOf("form");
        assertFalse(form.canContain(form));
    }

    @Test
    public void testCanContain_emptyOrDataParent_returnsFalse() {
        Tag img = Tag.valueOf("img");
        Tag span = Tag.valueOf("span");
        assertFalse(img.canContain(span));

        Tag script = Tag.valueOf("script");
        Tag div = Tag.valueOf("div");
        assertFalse(script.canContain(div));
    }

    @Test
    public void testCanContain_headTagChildren() {
        Tag head = Tag.valueOf("head");

        assertTrue(head.canContain(Tag.valueOf("base")));
        assertTrue(head.canContain(Tag.valueOf("script")));
        assertTrue(head.canContain(Tag.valueOf("noscript")));
        assertTrue(head.canContain(Tag.valueOf("link")));
        assertTrue(head.canContain(Tag.valueOf("meta")));
        assertTrue(head.canContain(Tag.valueOf("title")));
        assertTrue(head.canContain(Tag.valueOf("style")));
        assertTrue(head.canContain(Tag.valueOf("object")));

        assertFalse(head.canContain(Tag.valueOf("div")));
        assertFalse(head.canContain(Tag.valueOf("span")));
        assertFalse(head.canContain(Tag.valueOf("p")));
    }

    @Test
    public void testCanContain_dtAndDdRules() {
        Tag dt = Tag.valueOf("dt");
        Tag dd = Tag.valueOf("dd");
        Tag span = Tag.valueOf("span");

        assertFalse(dt.canContain(dd));
        assertFalse(dd.canContain(dt));
        assertTrue(dt.canContain(span));
        assertTrue(dd.canContain(span));
    }

    @Test
    public void testGetImplicitParent() {
        Tag html = Tag.valueOf("html");
        assertNull(html.getImplicitParent());

        Tag body = Tag.valueOf("body");
        assertEquals(html, body.getImplicitParent());

        Tag li = Tag.valueOf("li");
        assertEquals(Tag.valueOf("ul"), li.getImplicitParent());

        Tag custom = Tag.valueOf("custom-tag");
        assertEquals(Tag.valueOf("body"), custom.getImplicitParent());
    }

    @Test
    public void testIsValidParent() {
        Tag html = Tag.valueOf("html");
        Tag body = Tag.valueOf("body");
        Tag div = Tag.valueOf("div");
        Tag li = Tag.valueOf("li");
        Tag ul = Tag.valueOf("ul");
        Tag ol = Tag.valueOf("ol");

        assertTrue(div.isValidParent(html));
        assertTrue(html.isValidParent(body));
        assertFalse(div.isValidParent(body));

        assertTrue(ul.isValidParent(li));
        assertTrue(ol.isValidParent(li));
        assertFalse(div.isValidParent(li));
    }

    @Test
    public void testEqualsAndHashCode() {
        Tag p1 = Tag.valueOf("p");
        Tag p2 = Tag.valueOf("P");
        Tag div = Tag.valueOf("div");
        Tag custom1 = Tag.valueOf("custom-elem");
        Tag custom2 = Tag.valueOf("custom-elem");
        Tag custom3 = Tag.valueOf("other-elem");

        assertTrue(p1.equals(p1));
        assertTrue(p1.equals(p2));
        assertEquals(p1.hashCode(), p2.hashCode());

        assertFalse(p1.equals(div));
        assertFalse(p1.equals(null));
        assertFalse(p1.equals("p"));

        assertTrue(custom1.equals(custom2));
        assertEquals(custom1.hashCode(), custom2.hashCode());
        assertFalse(custom1.equals(custom3));
    }

    @Test
    public void testToString() {
        Tag div = Tag.valueOf("DIV");
        assertEquals("div", div.toString());

        Tag custom = Tag.valueOf("MY-TAG");
        assertEquals("my-tag", custom.toString());
    }
}
