package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;

public class JsonPointerTest {

    // ---------------------------------------------------------
    // compile() / valueOf() tests
    // ---------------------------------------------------------

    @Test
    public void testCompile_null_returnsEmpty() {
        JsonPointer p = JsonPointer.compile(null);
        assertNotNull(p);
        assertTrue(p.matches());
        assertEquals("", p.toString());
        assertEquals("", p.getMatchingProperty());
        assertEquals(-1, p.getMatchingIndex());
    }

    @Test
    public void testCompile_emptyString_returnsEmpty() {
        JsonPointer p = JsonPointer.compile("");
        assertTrue(p.matches());
        assertEquals("", p.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCompile_invalidInput_throwsException() {
        JsonPointer.compile("abc");
    }

    @Test
    public void testCompile_singleSegment_property() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertEquals("/foo", p.toString());
        assertEquals("foo", p.getMatchingProperty());
        assertFalse(p.matches());
        JsonPointer tail = p.tail();
        assertNotNull(tail);
        assertTrue(tail.matches());
    }

    @Test
    public void testCompile_multipleSegments() {
        JsonPointer p = JsonPointer.compile("/foo/bar");
        assertEquals("/foo/bar", p.toString());
        assertEquals("foo", p.getMatchingProperty());

        JsonPointer tail = p.tail();
        assertEquals("/bar", tail.toString());
        assertEquals("bar", tail.getMatchingProperty());
        assertFalse(tail.matches());

        JsonPointer tail2 = tail.tail();
        assertTrue(tail2.matches());
        assertNull(tail2.tail());
    }

    @Test
    public void testCompile_arrayIndexSegment() {
        JsonPointer p = JsonPointer.compile("/0");
        assertEquals(0, p.getMatchingIndex());
        assertTrue(p.mayMatchElement());
    }

    @Test
    public void testCompile_negativeLikeIndex_notValidIndex() {
        JsonPointer p = JsonPointer.compile("/-1");
        assertEquals(-1, p.getMatchingIndex());
        assertFalse(p.mayMatchElement());
        assertEquals("-1", p.getMatchingProperty());
    }

    @Test
    public void testCompile_leadingZeroIndex() {
        JsonPointer p = JsonPointer.compile("/00");
        // implementation does not actually reject leading zeroes
        assertEquals(0, p.getMatchingIndex());
    }

    @Test
    public void testCompile_leadingZeroLongerIndex() {
        JsonPointer p = JsonPointer.compile("/01234567");
        assertEquals(1234567, p.getMatchingIndex());
    }

    @Test
    public void testCompile_longIndexWithinIntRange() {
        JsonPointer p = JsonPointer.compile("/2147483647");
        assertEquals(Integer.MAX_VALUE, p.getMatchingIndex());
    }

    @Test
    public void testCompile_longIndexExceedsIntRange() {
        JsonPointer p = JsonPointer.compile("/2147483648");
        assertEquals(-1, p.getMatchingIndex());
    }

    @Test
    public void testCompile_indexTooLong_returnsNegativeOne() {
        JsonPointer p = JsonPointer.compile("/12345678901");
        assertEquals(-1, p.getMatchingIndex());
    }

    @Test
    public void testCompile_onlySlash_emptySegment() {
        JsonPointer p = JsonPointer.compile("/");
        assertEquals("", p.getMatchingProperty());
        assertEquals(-1, p.getMatchingIndex());
    }

    @Test
    public void testCompile_escapeTilde0() {
        JsonPointer p = JsonPointer.compile("/a~0b");
        assertEquals("a~b", p.getMatchingProperty());
    }

    @Test
    public void testCompile_escapeTilde1() {
        JsonPointer p = JsonPointer.compile("/a~1b");
        assertEquals("a/b", p.getMatchingProperty());
    }

    @Test
    public void testCompile_escapeInvalid() {
        JsonPointer p = JsonPointer.compile("/a~2b");
        assertEquals("a~2b", p.getMatchingProperty());
    }

    @Test
    public void testCompile_escapeWithPrefix() {
        JsonPointer p = JsonPointer.compile("/abc~1def");
        assertEquals("abc/def", p.getMatchingProperty());
    }

    @Test
    public void testCompile_escapeAtStart() {
        JsonPointer p = JsonPointer.compile("/~1abc");
        assertEquals("/abc", p.getMatchingProperty());
    }

    @Test
    public void testCompile_trailingTilde_noEscapeCall() {
        JsonPointer p = JsonPointer.compile("/ab~");
        assertEquals("ab~", p.getMatchingProperty());
    }

    @Test
    public void testCompile_trailingTildeInsideQuotedTail() {
        JsonPointer p = JsonPointer.compile("/x~1y~");
        assertEquals("x/y~", p.getMatchingProperty());
    }

    @Test
    public void testCompile_quotedTailWithFollowingSlash() {
        JsonPointer p = JsonPointer.compile("/a~1b/c");
        assertEquals("a/b", p.getMatchingProperty());
        JsonPointer tail = p.tail();
        assertNotNull(tail);
        assertEquals("c", tail.getMatchingProperty());
        assertEquals("/c", tail.toString());
    }

    @Test
    public void testValueOf_sameAsCompile() {
        JsonPointer p1 = JsonPointer.compile("/foo/bar");
        JsonPointer p2 = JsonPointer.valueOf("/foo/bar");
        assertEquals(p1, p2);
        assertEquals(p1.toString(), p2.toString());
    }

    @Test
    public void testValueOf_null_returnsEmpty() {
        JsonPointer p = JsonPointer.valueOf(null);
        assertTrue(p.matches());
    }

    // ---------------------------------------------------------
    // matches() / getMatchingProperty() / getMatchingIndex()
    // ---------------------------------------------------------

    @Test
    public void testMatches_emptyPointer_true() {
        JsonPointer p = JsonPointer.compile("");
        assertTrue(p.matches());
    }

    @Test
    public void testMatches_nonEmptyPointer_false() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertFalse(p.matches());
    }

    @Test
    public void testGetMatchingProperty_normal() {
        JsonPointer p = JsonPointer.compile("/name");
        assertEquals("name", p.getMatchingProperty());
    }

    @Test
    public void testGetMatchingIndex_normal() {
        JsonPointer p = JsonPointer.compile("/5");
        assertEquals(5, p.getMatchingIndex());
    }

    @Test
    public void testGetMatchingIndex_forProperty_returnsNegativeOne() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertEquals(-1, p.getMatchingIndex());
    }

    // ---------------------------------------------------------
    // mayMatchProperty() / mayMatchElement()
    // ---------------------------------------------------------

    @Test
    public void testMayMatchProperty_true() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertTrue(p.mayMatchProperty());
    }

    @Test
    public void testMayMatchElement_true() {
        JsonPointer p = JsonPointer.compile("/3");
        assertTrue(p.mayMatchElement());
    }

    @Test
    public void testMayMatchElement_false() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertFalse(p.mayMatchElement());
    }

    // ---------------------------------------------------------
    // matchProperty()
    // ---------------------------------------------------------

    @Test
    public void testMatchProperty_matchingName_returnsNext() {
        JsonPointer p = JsonPointer.compile("/foo/bar");
        JsonPointer result = p.matchProperty("foo");
        assertNotNull(result);
        assertEquals("bar", result.getMatchingProperty());
    }

    @Test
    public void testMatchProperty_nonMatchingName_returnsNull() {
        JsonPointer p = JsonPointer.compile("/foo/bar");
        JsonPointer result = p.matchProperty("nope");
        assertNull(result);
    }

    @Test
    public void testMatchProperty_onEmptyPointer_returnsNull() {
        JsonPointer p = JsonPointer.compile("");
        JsonPointer result = p.matchProperty("anything");
        assertNull(result);
    }

    // ---------------------------------------------------------
    // matchElement()
    // ---------------------------------------------------------

    @Test
    public void testMatchElement_validIndex_returnsNext() {
        JsonPointer p = JsonPointer.compile("/0/foo");
        JsonPointer result = p.matchElement(0);
        assertNotNull(result);
        assertEquals("foo", result.getMatchingProperty());
    }

    @Test
    public void testMatchElement_invalidIndex_returnsNull() {
        JsonPointer p = JsonPointer.compile("/0/foo");
        JsonPointer result = p.matchElement(1);
        assertNull(result);
    }

    @Test
    public void testMatchElement_negativeIndex_returnsNull() {
        JsonPointer p = JsonPointer.compile("/0/foo");
        JsonPointer result = p.matchElement(-1);
        assertNull(result);
    }

    @Test
    public void testMatchElement_onEmptyPointer_returnsNull() {
        JsonPointer p = JsonPointer.compile("");
        JsonPointer result = p.matchElement(0);
        assertNull(result);
    }

    // ---------------------------------------------------------
    // tail()
    // ---------------------------------------------------------

    @Test
    public void testTail_emptyPointer_returnsNull() {
        JsonPointer p = JsonPointer.compile("");
        assertNull(p.tail());
    }

    @Test
    public void testTail_nonEmptyPointer_returnsNext() {
        JsonPointer p = JsonPointer.compile("/foo/bar");
        JsonPointer tail = p.tail();
        assertNotNull(tail);
        assertEquals("bar", tail.getMatchingProperty());
    }

    // ---------------------------------------------------------
    // toString()
    // ---------------------------------------------------------

    @Test
    public void testToString_returnsOriginalString() {
        JsonPointer p = JsonPointer.compile("/foo/bar/0");
        assertEquals("/foo/bar/0", p.toString());
    }

    @Test
    public void testToString_emptyPointer() {
        JsonPointer p = JsonPointer.compile("");
        assertEquals("", p.toString());
    }

    // ---------------------------------------------------------
    // hashCode()
    // ---------------------------------------------------------

    @Test
    public void testHashCode_sameString_sameHash() {
        JsonPointer p1 = JsonPointer.compile("/foo/bar");
        JsonPointer p2 = JsonPointer.compile("/foo/bar");
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testHashCode_matchesStringHashCode() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertEquals("/foo".hashCode(), p.hashCode());
    }

    // ---------------------------------------------------------
    // equals()
    // ---------------------------------------------------------

    @Test
    public void testEquals_sameInstance_true() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertTrue(p.equals(p));
    }

    @Test
    public void testEquals_null_false() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertFalse(p.equals(null));
    }

    @Test
    public void testEquals_differentType_false() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertFalse(p.equals("foo"));
    }

    @Test
    public void testEquals_sameString_true() {
        JsonPointer p1 = JsonPointer.compile("/foo/bar");
        JsonPointer p2 = JsonPointer.compile("/foo/bar");
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testEquals_differentString_false() {
        JsonPointer p1 = JsonPointer.compile("/foo");
        JsonPointer p2 = JsonPointer.compile("/bar");
        assertFalse(p1.equals(p2));
    }
}
