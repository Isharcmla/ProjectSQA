import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class JsonPointerTest {

    private JsonPointer pointer;

    @Before
    public void setUp() {
        pointer = null;
    }

    // ---------------------------
    // compile() tests
    // ---------------------------

    @Test
    public void testCompile_nullInput_returnsEmptyPointer() {
        JsonPointer p = JsonPointer.compile(null);
        assertNotNull(p);
        assertEquals("", p.toString());
        assertTrue(p.matches());
    }

    @Test
    public void testCompile_emptyString_returnsEmptyPointer() {
        JsonPointer p = JsonPointer.compile("");
        assertNotNull(p);
        assertEquals("", p.toString());
        assertTrue(p.matches());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCompile_noLeadingSlash_throwsException() {
        JsonPointer.compile("foo");
    }

    @Test
    public void testCompile_singleSegment_parsesCorrectly() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertEquals("/foo", p.toString());
        assertEquals("foo", p.getMatchingProperty());
        assertFalse(p.matches()); // next segment is EMPTY, not null
    }

    @Test
    public void testCompile_multipleSegments_parsesCorrectly() {
        JsonPointer p = JsonPointer.compile("/a/b");
        assertEquals("/a/b", p.toString());
        assertEquals("a", p.getMatchingProperty());
        JsonPointer tail = p.tail();
        assertNotNull(tail);
        assertEquals("b", tail.getMatchingProperty());
    }

    @Test
    public void testCompile_arrayIndexSegment_parsesIndexCorrectly() {
        JsonPointer p = JsonPointer.compile("/0");
        assertEquals(0, p.getMatchingIndex());
        assertTrue(p.mayMatchElement());
    }

    @Test
    public void testCompile_nonNumericSegment_indexIsNegativeOne() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertEquals(-1, p.getMatchingIndex());
        assertFalse(p.mayMatchElement());
    }

    @Test
    public void testCompile_emptySegment_indexIsNegativeOne() {
        JsonPointer p = JsonPointer.compile("//");
        assertEquals("", p.getMatchingProperty());
        assertEquals(-1, p.getMatchingIndex());
    }

    @Test
    public void testCompile_longButValidIndex_boundaryMaxInt() {
        // 10 digit number equal to Integer.MAX_VALUE
        JsonPointer p = JsonPointer.compile("/2147483647");
        assertEquals(Integer.MAX_VALUE, p.getMatchingIndex());
    }

    @Test
    public void testCompile_tenDigitIndexOverflow_indexIsNegativeOne() {
        // 10 digit number greater than Integer.MAX_VALUE
        JsonPointer p = JsonPointer.compile("/9999999999");
        assertEquals(-1, p.getMatchingIndex());
    }

    @Test
    public void testCompile_elevenDigitIndex_indexIsNegativeOne() {
        // length > 10 -> always -1
        JsonPointer p = JsonPointer.compile("/12345678901");
        assertEquals(-1, p.getMatchingIndex());
    }

    @Test
    public void testCompile_negativeNumberSegment_indexIsNegativeOne() {
        // contains non-digit char '-'
        JsonPointer p = JsonPointer.compile("/-1");
        assertEquals(-1, p.getMatchingIndex());
    }

    @Test
    public void testCompile_escapedTilde_unescapesCorrectly() {
        // ~0 -> ~
        JsonPointer p = JsonPointer.compile("/a~0b");
        assertEquals("a~b", p.getMatchingProperty());
    }

    @Test
    public void testCompile_escapedSlash_unescapesCorrectly() {
        // ~1 -> /
        JsonPointer p = JsonPointer.compile("/a~1b");
        assertEquals("a/b", p.getMatchingProperty());
    }

    @Test
    public void testCompile_escapedSlashFollowedBySegment_parsesCorrectly() {
        JsonPointer p = JsonPointer.compile("/a~1b/c");
        assertEquals("a/b", p.getMatchingProperty());
        JsonPointer tail = p.tail();
        assertNotNull(tail);
        assertEquals("c", tail.getMatchingProperty());
    }

    @Test
    public void testCompile_tildeAtEndOfInput_handledGracefully() {
        // tilde at very end (i == end after ++i), goes into normal branch
        JsonPointer p = JsonPointer.compile("/a~");
        assertNotNull(p);
        assertEquals("/a~", p.toString());
    }

    @Test
    public void testCompile_multipleEscapesInSingleSegment_parsesCorrectly() {
        JsonPointer p = JsonPointer.compile("/a~0~1b");
        assertEquals("a~/b", p.getMatchingProperty());
    }

    // ---------------------------
    // valueOf() tests
    // ---------------------------

    @Test
    public void testValueOf_validInput_sameAsCompile() {
        JsonPointer p1 = JsonPointer.valueOf("/foo/bar");
        JsonPointer p2 = JsonPointer.compile("/foo/bar");
        assertEquals(p1, p2);
        assertEquals(p1.toString(), p2.toString());
    }

    @Test
    public void testValueOf_nullInput_returnsEmptyPointer() {
        JsonPointer p = JsonPointer.valueOf(null);
        assertEquals("", p.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_invalidInput_throwsException() {
        JsonPointer.valueOf("noSlash");
    }

    // ---------------------------
    // matches()
    // ---------------------------

    @Test
    public void testMatches_emptyPointer_returnsTrue() {
        JsonPointer p = JsonPointer.compile("");
        assertTrue(p.matches());
    }

    @Test
    public void testMatches_singleSegmentPointer_returnsFalse() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertFalse(p.matches());
    }

    @Test
    public void testMatches_afterMatchingLastSegment_returnsTrue() {
        JsonPointer p = JsonPointer.compile("/foo");
        JsonPointer next = p.matchProperty("foo");
        assertNotNull(next);
        assertTrue(next.matches());
    }

    // ---------------------------
    // getMatchingProperty()
    // ---------------------------

    @Test
    public void testGetMatchingProperty_normalSegment_returnsSegmentName() {
        JsonPointer p = JsonPointer.compile("/hello");
        assertEquals("hello", p.getMatchingProperty());
    }

    @Test
    public void testGetMatchingProperty_emptyPointer_returnsEmptyString() {
        JsonPointer p = JsonPointer.compile("");
        assertEquals("", p.getMatchingProperty());
    }

    // ---------------------------
    // getMatchingIndex()
    // ---------------------------

    @Test
    public void testGetMatchingIndex_numericSegment_returnsIndex() {
        JsonPointer p = JsonPointer.compile("/42");
        assertEquals(42, p.getMatchingIndex());
    }

    @Test
    public void testGetMatchingIndex_emptyPointer_returnsNegativeOne() {
        JsonPointer p = JsonPointer.compile("");
        assertEquals(-1, p.getMatchingIndex());
    }

    // ---------------------------
    // mayMatchProperty()
    // ---------------------------

    @Test
    public void testMayMatchProperty_normalSegment_returnsTrue() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertTrue(p.mayMatchProperty());
    }

    @Test
    public void testMayMatchProperty_emptyPointer_returnsTrue() {
        JsonPointer p = JsonPointer.compile("");
        assertTrue(p.mayMatchProperty());
    }

    // ---------------------------
    // mayMatchElement()
    // ---------------------------

    @Test
    public void testMayMatchElement_numericSegment_returnsTrue() {
        JsonPointer p = JsonPointer.compile("/3");
        assertTrue(p.mayMatchElement());
    }

    @Test
    public void testMayMatchElement_nonNumericSegment_returnsFalse() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertFalse(p.mayMatchElement());
    }

    // ---------------------------
    // matchProperty()
    // ---------------------------

    @Test
    public void testMatchProperty_matchingName_returnsNextSegment() {
        JsonPointer p = JsonPointer.compile("/foo/bar");
        JsonPointer next = p.matchProperty("foo");
        assertNotNull(next);
        assertEquals("bar", next.getMatchingProperty());
    }

    @Test
    public void testMatchProperty_nonMatchingName_returnsNull() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertNull(p.matchProperty("bar"));
    }

    @Test
    public void testMatchProperty_emptyPointer_returnsNull() {
        JsonPointer p = JsonPointer.compile("");
        assertNull(p.matchProperty("foo"));
    }

    // ---------------------------
    // matchElement()
    // ---------------------------

    @Test
    public void testMatchElement_matchingIndex_returnsNextSegment() {
        JsonPointer p = JsonPointer.compile("/0/foo");
        JsonPointer next = p.matchElement(0);
        assertNotNull(next);
        assertEquals("foo", next.getMatchingProperty());
    }

    @Test
    public void testMatchElement_nonMatchingIndex_returnsNull() {
        JsonPointer p = JsonPointer.compile("/0");
        assertNull(p.matchElement(1));
    }

    @Test
    public void testMatchElement_negativeIndex_returnsNull() {
        JsonPointer p = JsonPointer.compile("/0");
        assertNull(p.matchElement(-1));
    }

    // ---------------------------
    // tail()
    // ---------------------------

    @Test
    public void testTail_multiSegmentPointer_returnsRemainingPointer() {
        JsonPointer p = JsonPointer.compile("/a/b/c");
        JsonPointer tail = p.tail();
        assertNotNull(tail);
        assertEquals("b", tail.getMatchingProperty());
    }

    @Test
    public void testTail_singleSegmentPointer_returnsEmptyPointer() {
        JsonPointer p = JsonPointer.compile("/foo");
        JsonPointer tail = p.tail();
        assertNotNull(tail);
        assertTrue(tail.matches());
    }

    @Test
    public void testTail_emptyPointer_returnsNull() {
        JsonPointer p = JsonPointer.compile("");
        assertNull(p.tail());
    }

    // ---------------------------
    // toString()
    // ---------------------------

    @Test
    public void testToString_returnsOriginalInputString() {
        JsonPointer p = JsonPointer.compile("/a/b/c");
        assertEquals("/a/b/c", p.toString());
    }

    @Test
    public void testToString_emptyPointer_returnsEmptyString() {
        JsonPointer p = JsonPointer.compile("");
        assertEquals("", p.toString());
    }

    // ---------------------------
    // hashCode()
    // ---------------------------

    @Test
    public void testHashCode_equalPointers_haveSameHashCode() {
        JsonPointer p1 = JsonPointer.compile("/a/b");
        JsonPointer p2 = JsonPointer.compile("/a/b");
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testHashCode_differentPointers_mayHaveDifferentHashCode() {
        JsonPointer p1 = JsonPointer.compile("/a");
        JsonPointer p2 = JsonPointer.compile("/b");
        assertNotEquals(p1.hashCode(), p2.hashCode());
    }

    // ---------------------------
    // equals()
    // ---------------------------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertTrue(p.equals(p));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertFalse(p.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertFalse(p.equals("not a pointer"));
    }

    @Test
    public void testEquals_sameStringDifferentInstance_returnsTrue() {
        JsonPointer p1 = JsonPointer.compile("/foo/bar");
        JsonPointer p2 = JsonPointer.compile("/foo/bar");
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testEquals_differentString_returnsFalse() {
        JsonPointer p1 = JsonPointer.compile("/foo");
        JsonPointer p2 = JsonPointer.compile("/bar");
        assertFalse(p1.equals(p2));
    }
}
