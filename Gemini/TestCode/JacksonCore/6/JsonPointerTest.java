package com.fasterxml.jackson.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class JsonPointerTest {

    @Test
    public void testCompile_nullOrEmptyInput_returnsEmptyInstance() {
        JsonPointer ptrNull = JsonPointer.compile(null);
        JsonPointer ptrEmpty = JsonPointer.compile("");

        assertNotNull(ptrNull);
        assertNotNull(ptrEmpty);
        assertSame(ptrNull, ptrEmpty);
        assertTrue(ptrNull.matches());
        assertEquals("", ptrNull.getMatchingProperty());
        assertEquals(-1, ptrNull.getMatchingIndex());
        assertTrue(ptrNull.mayMatchProperty());
        assertFalse(ptrNull.mayMatchElement());
        assertNull(ptrNull.tail());
        assertEquals("", ptrNull.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCompile_missingLeadingSlash_throwsIllegalArgumentException() {
        JsonPointer.compile("invalid/pointer");
    }

    @Test
    public void testValueOf_sameAsCompile() {
        JsonPointer compiled = JsonPointer.compile("/field");
        JsonPointer valueOf = JsonPointer.valueOf("/field");
        assertEquals(compiled, valueOf);

        assertSame(JsonPointer.compile(null), JsonPointer.valueOf(null));
        assertSame(JsonPointer.compile(""), JsonPointer.valueOf(""));
    }

    @Test
    public void testCompile_singleSlashRoot() {
        JsonPointer ptr = JsonPointer.compile("/");
        assertNotNull(ptr);
        assertFalse(ptr.matches());
        assertEquals("", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());

        JsonPointer tail = ptr.tail();
        assertNotNull(tail);
        assertTrue(tail.matches());
    }

    @Test
    public void testCompile_singlePropertySegment() {
        JsonPointer ptr = JsonPointer.compile("/name");
        assertFalse(ptr.matches());
        assertEquals("name", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());

        JsonPointer next = ptr.matchProperty("name");
        assertNotNull(next);
        assertTrue(next.matches());

        assertNull(ptr.matchProperty("other"));
        assertNull(ptr.matchElement(0));
    }

    @Test
    public void testCompile_singleNumericIndexSegment() {
        JsonPointer ptr = JsonPointer.compile("/0");
        assertFalse(ptr.matches());
        assertEquals("0", ptr.getMatchingProperty());
        assertEquals(0, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertTrue(ptr.mayMatchElement());

        JsonPointer next = ptr.matchElement(0);
        assertNotNull(next);
        assertTrue(next.matches());

        assertNull(ptr.matchElement(1));
        assertNull(ptr.matchElement(-1));
    }

    @Test
    public void testMultiSegmentNavigation() {
        JsonPointer ptr = JsonPointer.compile("/users/12/address/city");
        assertFalse(ptr.matches());
        assertEquals("users", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());

        JsonPointer ptr2 = ptr.matchProperty("users");
        assertNotNull(ptr2);
        assertEquals("12", ptr2.getMatchingProperty());
        assertEquals(12, ptr2.getMatchingIndex());
        assertTrue(ptr2.mayMatchElement());

        JsonPointer ptr3 = ptr2.matchElement(12);
        assertNotNull(ptr3);
        assertEquals("address", ptr3.getMatchingProperty());
        assertEquals(-1, ptr3.getMatchingIndex());

        JsonPointer ptr4 = ptr3.matchProperty("address");
        assertNotNull(ptr4);
        assertEquals("city", ptr4.getMatchingProperty());
        assertEquals(-1, ptr4.getMatchingIndex());

        JsonPointer ptr5 = ptr4.matchProperty("city");
        assertNotNull(ptr5);
        assertTrue(ptr5.matches());
        assertNull(ptr5.tail());
        assertNull(ptr5.matchProperty("any"));
        assertNull(ptr5.matchElement(0));
    }

    @Test
    public void testQuotedTail_tildeZeroEscape() {
        JsonPointer ptr = JsonPointer.compile("/~0");
        assertEquals("~", ptr.getMatchingProperty());

        JsonPointer ptrMid = JsonPointer.compile("/a~0b");
        assertEquals("a~b", ptrMid.getMatchingProperty());
    }

    @Test
    public void testQuotedTail_tildeOneEscape() {
        JsonPointer ptr = JsonPointer.compile("/~1");
        assertEquals("/", ptr.getMatchingProperty());

        JsonPointer ptrMid = JsonPointer.compile("/a~1b");
        assertEquals("a/b", ptrMid.getMatchingProperty());
    }

    @Test
    public void testQuotedTail_otherEscapes() {
        JsonPointer ptr = JsonPointer.compile("/~2");
        assertEquals("~2", ptr.getMatchingProperty());

        JsonPointer ptrComplex = JsonPointer.compile("/a~0b~1c~x/tail");
        assertEquals("a~b/c~x", ptrComplex.getMatchingProperty());

        JsonPointer tail = ptrComplex.tail();
        assertNotNull(tail);
        assertEquals("tail", tail.getMatchingProperty());
    }

    @Test
    public void testQuotedTail_consecutiveTildesAndSegments() {
        JsonPointer ptr = JsonPointer.compile("/~~0/rest");
        assertEquals("~~", ptr.getMatchingProperty());
        assertNotNull(ptr.tail());
        assertEquals("rest", ptr.tail().getMatchingProperty());
    }

    @Test
    public void testParseIndex_variousLengthsAndLimits() {
        // Empty segment
        JsonPointer emptySeg = JsonPointer.compile("//");
        assertEquals(-1, emptySeg.getMatchingIndex());

        // Valid integers
        JsonPointer validInt = JsonPointer.compile("/42");
        assertEquals(42, validInt.getMatchingIndex());

        // Max int boundary (10 digits)
        JsonPointer maxInt = JsonPointer.compile("/2147483647");
        assertEquals(Integer.MAX_VALUE, maxInt.getMatchingIndex());

        // Overflow 10 digits (> Integer.MAX_VALUE)
        JsonPointer overflow10Digits = JsonPointer.compile("/2147483648");
        assertEquals(-1, overflow10Digits.getMatchingIndex());

        // Large 10 digits
        JsonPointer large10Digits = JsonPointer.compile("/9999999999");
        assertEquals(-1, large10Digits.getMatchingIndex());

        // More than 10 digits
        JsonPointer over10Digits = JsonPointer.compile("/12345678901");
        assertEquals(-1, over10Digits.getMatchingIndex());

        // Non-digit characters
        JsonPointer nonDigit1 = JsonPointer.compile("/-1");
        assertEquals(-1, nonDigit1.getMatchingIndex());

        JsonPointer nonDigit2 = JsonPointer.compile("/+1");
        assertEquals(-1, nonDigit2.getMatchingIndex());

        JsonPointer nonDigit3 = JsonPointer.compile("/12a3");
        assertEquals(-1, nonDigit3.getMatchingIndex());
    }

    @Test
    public void testMatchProperty_onEmptyOrMismatch_returnsNull() {
        JsonPointer empty = JsonPointer.compile("");
        assertNull(empty.matchProperty(""));
        assertNull(empty.matchProperty("prop"));

        JsonPointer ptr = JsonPointer.compile("/prop");
        assertNull(ptr.matchProperty("other"));
    }

    @Test
    public void testMatchElement_onNegativeOrMismatch_returnsNull() {
        JsonPointer empty = JsonPointer.compile("");
        assertNull(empty.matchElement(0));
        assertNull(empty.matchElement(-1));

        JsonPointer ptr = JsonPointer.compile("/5");
        assertNull(ptr.matchElement(4));
        assertNull(ptr.matchElement(-1));
        assertNull(ptr.matchElement(-5));
    }

    @Test
    public void testEqualsAndHashCode() {
        JsonPointer ptr1 = JsonPointer.compile("/a/b/0");
        JsonPointer ptr2 = JsonPointer.compile("/a/b/0");
        JsonPointer ptr3 = JsonPointer.compile("/a/b/1");
        JsonPointer empty1 = JsonPointer.compile("");
        JsonPointer empty2 = JsonPointer.compile(null);

        assertEquals(ptr1, ptr1);
        assertEquals(ptr1, ptr2);
        assertEquals(ptr1.hashCode(), ptr2.hashCode());

        assertEquals(empty1, empty2);
        assertEquals(empty1.hashCode(), empty2.hashCode());

        assertNotEquals(ptr1, ptr3);
        assertNotEquals(ptr1, empty1);
        assertNotEquals(ptr1, null);
        assertNotEquals(ptr1, "/a/b/0");
    }

    @Test
    public void testToString() {
        String expr = "/users/1/name";
        JsonPointer ptr = JsonPointer.compile(expr);
        assertEquals(expr, ptr.toString());

        assertEquals("", JsonPointer.compile("").toString());
    }
}
