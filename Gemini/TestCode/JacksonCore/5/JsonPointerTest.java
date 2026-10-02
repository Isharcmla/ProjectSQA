package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;

public class JsonPointerTest {

    @Test
    public void testCompile_emptyOrNull_returnsEmptyPointer() {
        JsonPointer pNull = JsonPointer.compile(null);
        JsonPointer pEmpty = JsonPointer.compile("");

        assertSame(JsonPointer.EMPTY, pNull);
        assertSame(JsonPointer.EMPTY, pEmpty);

        assertTrue(pNull.matches());
        assertEquals("", pNull.getMatchingProperty());
        assertEquals(-1, pNull.getMatchingIndex());
        assertTrue(pNull.mayMatchProperty());
        assertFalse(pNull.mayMatchElement());
        assertNull(pNull.tail());
        assertEquals("", pNull.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCompile_invalidPrefix_throwsException() {
        JsonPointer.compile("invalid/path");
    }

    @Test
    public void testValueOf_validString_matchesCompile() {
        JsonPointer ptr1 = JsonPointer.valueOf("/foo/bar");
        JsonPointer ptr2 = JsonPointer.compile("/foo/bar");
        assertEquals(ptr1, ptr2);
    }

    @Test
    public void testCompile_singlePropertySegment_parsedCorrectly() {
        JsonPointer ptr = JsonPointer.compile("/foo");

        assertFalse(ptr.matches());
        assertEquals("foo", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());
        assertEquals("/foo", ptr.toString());

        JsonPointer tail = ptr.tail();
        assertNotNull(tail);
        assertTrue(tail.matches());
        assertSame(JsonPointer.EMPTY, tail);
    }

    @Test
    public void testCompile_multiplePropertySegments_parsedCorrectly() {
        JsonPointer ptr = JsonPointer.compile("/foo/bar/baz");

        assertEquals("foo", ptr.getMatchingProperty());
        assertEquals("/foo/bar/baz", ptr.toString());

        JsonPointer seg2 = ptr.tail();
        assertNotNull(seg2);
        assertEquals("bar", seg2.getMatchingProperty());
        assertEquals("/bar/baz", seg2.toString());

        JsonPointer seg3 = seg2.tail();
        assertNotNull(seg3);
        assertEquals("baz", seg3.getMatchingProperty());
        assertEquals("/baz", seg3.toString());

        JsonPointer end = seg3.tail();
        assertNotNull(end);
        assertTrue(end.matches());
        assertSame(JsonPointer.EMPTY, end);
    }

    @Test
    public void testCompile_rootSlash_emptySegment() {
        JsonPointer ptr = JsonPointer.compile("/");
        assertFalse(ptr.matches());
        assertEquals("", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
        assertSame(JsonPointer.EMPTY, ptr.tail());

        JsonPointer ptr2 = JsonPointer.compile("//");
        assertEquals("", ptr2.getMatchingProperty());
        assertEquals("", ptr2.tail().getMatchingProperty());
        assertSame(JsonPointer.EMPTY, ptr2.tail().tail());
    }

    @Test
    public void testCompile_escapedCharacters_parsedCorrectly() {
        // ~0 -> ~, ~1 -> /
        JsonPointer ptr = JsonPointer.compile("/~0/~1");
        assertEquals("~", ptr.getMatchingProperty());
        assertEquals("/", ptr.tail().getMatchingProperty());

        // Escaped inside word
        JsonPointer ptr2 = JsonPointer.compile("/a~0b/c~1d");
        assertEquals("a~b", ptr2.getMatchingProperty());
        assertEquals("c/d", ptr2.tail().getMatchingProperty());

        // Multiple escapes in one segment
        JsonPointer ptr3 = JsonPointer.compile("/a~0b~1c");
        assertEquals("a~b/c", ptr3.getMatchingProperty());

        // Escape sequence with unknown char (e.g. ~2 -> ~2)
        JsonPointer ptr4 = JsonPointer.compile("/~2");
        assertEquals("~2", ptr4.getMatchingProperty());

        // Escape at end with preceding chars
        JsonPointer ptr5 = JsonPointer.compile("/prefix~0");
        assertEquals("prefix~", ptr5.getMatchingProperty());
    }

    @Test
    public void testCompile_numericIndex_parsedCorrectly() {
        JsonPointer ptr = JsonPointer.compile("/0");
        assertEquals("0", ptr.getMatchingProperty());
        assertEquals(0, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchElement());

        JsonPointer ptrLarge = JsonPointer.compile("/123456");
        assertEquals("123456", ptrLarge.getMatchingProperty());
        assertEquals(123456, ptrLarge.getMatchingIndex());
        assertTrue(ptrLarge.mayMatchElement());

        // Max integer 2147483647 (10 digits)
        JsonPointer ptrMax = JsonPointer.compile("/2147483647");
        assertEquals(2147483647, ptrMax.getMatchingIndex());
        assertTrue(ptrMax.mayMatchElement());

        // Over max integer 2147483648 (10 digits) -> -1
        JsonPointer ptrOverflow = JsonPointer.compile("/2147483648");
        assertEquals(-1, ptrOverflow.getMatchingIndex());
        assertFalse(ptrOverflow.mayMatchElement());

        // Over 10 digits -> -1
        JsonPointer ptrTooLong = JsonPointer.compile("/10000000000");
        assertEquals(-1, ptrTooLong.getMatchingIndex());
        assertFalse(ptrTooLong.mayMatchElement());

        // Non-digit characters -> -1
        JsonPointer ptrNonDigit = JsonPointer.compile("/12a34");
        assertEquals(-1, ptrNonDigit.getMatchingIndex());
    }

    @Test
    public void testMatchProperty_variousConditions() {
        JsonPointer ptr = JsonPointer.compile("/foo/bar");

        assertNull(ptr.matchProperty("wrong"));
        JsonPointer next = ptr.matchProperty("foo");
        assertNotNull(next);
        assertEquals("bar", next.getMatchingProperty());

        // EMPTY pointer cannot match property
        assertNull(JsonPointer.EMPTY.matchProperty("foo"));
        assertNull(JsonPointer.EMPTY.matchProperty(""));
    }

    @Test
    public void testMatchElement_variousConditions() {
        JsonPointer ptr = JsonPointer.compile("/0/1");

        assertNull(ptr.matchElement(1));
        assertNull(ptr.matchElement(-1));

        JsonPointer next = ptr.matchElement(0);
        assertNotNull(next);
        assertEquals(1, next.getMatchingIndex());

        // EMPTY pointer cannot match element
        assertNull(JsonPointer.EMPTY.matchElement(0));
        assertNull(JsonPointer.EMPTY.matchElement(-1));

        // Non-index pointer cannot match element
        JsonPointer nonIndexPtr = JsonPointer.compile("/abc");
        assertNull(nonIndexPtr.matchElement(0));
    }

    @Test
    public void testEqualsAndHashCode() {
        JsonPointer ptr1 = JsonPointer.compile("/a/b/c");
        JsonPointer ptr2 = JsonPointer.compile("/a/b/c");
        JsonPointer ptr3 = JsonPointer.compile("/a/b/d");

        assertTrue(ptr1.equals(ptr1));
        assertTrue(ptr1.equals(ptr2));
        assertFalse(ptr1.equals(ptr3));
        assertFalse(ptr1.equals(null));
        assertFalse(ptr1.equals("Not a JsonPointer"));

        assertEquals(ptr1.hashCode(), ptr2.hashCode());
        assertEquals(JsonPointer.EMPTY.hashCode(), "".hashCode());
    }

    @Test
    public void testToString() {
        assertEquals("", JsonPointer.EMPTY.toString());
        assertEquals("/foo/0/bar", JsonPointer.compile("/foo/0/bar").toString());
    }
}
