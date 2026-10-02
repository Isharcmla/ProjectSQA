package com.fasterxml.jackson.core.util;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TextBufferTest {

    @Test
    public void testConstructor_withNullAllocator_shouldInitializeProperly() {
        TextBuffer tb = new TextBuffer(null);
        assertNotNull(tb);
        assertEquals(0, tb.size());
        assertEquals(0, tb.getTextOffset());
        assertTrue(tb.hasTextAsCharacters());
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testConstructor_withBufferRecycler_shouldInitializeProperly() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);
        assertNotNull(tb);
        assertEquals(0, tb.size());
    }

    @Test
    public void testReleaseBuffers_withNullAllocator_shouldResetWithEmpty() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        assertEquals(1, tb.size());
        tb.releaseBuffers();
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testReleaseBuffers_withAllocator_whenCurrentSegmentIsNull() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);
        tb.releaseBuffers();
        assertEquals(0, tb.size());
    }

    @Test
    public void testReleaseBuffers_withAllocator_whenCurrentSegmentIsNotNull() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);
        tb.getCurrentSegment();
        tb.append('x');
        assertEquals(1, tb.size());
        tb.releaseBuffers();
        assertEquals(0, tb.size());
    }

    @Test
    public void testResetWithEmpty_whenHasSegments_shouldClearSegments() {
        TextBuffer tb = new TextBuffer(null);
        tb.getCurrentSegment();
        tb.finishCurrentSegment();
        tb.append('a');
        assertTrue(tb.size() > 0);

        tb.resetWithEmpty();
        assertEquals(0, tb.size());
        assertEquals(0, tb.getTextOffset());
        assertArrayEquals(TextBuffer.NO_CHARS, tb.contentsAsArray());
    }

    @Test
    public void testResetWithShared_zeroOffsetAndLength() {
        TextBuffer tb = new TextBuffer(null);
        char[] buf = "test".toCharArray();
        tb.resetWithShared(buf, 0, 0);

        assertEquals(0, tb.size());
        assertEquals(0, tb.getTextOffset());
        assertTrue(tb.hasTextAsCharacters());
        assertSame(buf, tb.getTextBuffer());
        assertEquals("", tb.contentsAsString());
        assertArrayEquals(TextBuffer.NO_CHARS, tb.contentsAsArray());
    }

    @Test
    public void testResetWithShared_nonZeroOffsetAndLength() {
        TextBuffer tb = new TextBuffer(null);
        char[] buf = "hello world".toCharArray();
        tb.resetWithShared(buf, 6, 5);

        assertEquals(5, tb.size());
        assertEquals(6, tb.getTextOffset());
        assertTrue(tb.hasTextAsCharacters());
        assertSame(buf, tb.getTextBuffer());
        assertEquals("world", tb.contentsAsString());
        assertArrayEquals("world".toCharArray(), tb.contentsAsArray());
    }

    @Test
    public void testResetWithShared_whenHasSegments_shouldClearSegments() {
        TextBuffer tb = new TextBuffer(null);
        tb.getCurrentSegment();
        tb.finishCurrentSegment();

        char[] buf = "data".toCharArray();
        tb.resetWithShared(buf, 0, 4);

        assertEquals(4, tb.size());
        assertEquals("data", tb.contentsAsString());
    }

    @Test
    public void testResetWithShared_offsetZeroContentsAsArray() {
        TextBuffer tb = new TextBuffer(null);
        char[] buf = "abc".toCharArray();
        tb.resetWithShared(buf, 0, 3);
        char[] result = tb.contentsAsArray();
        assertArrayEquals(new char[]{'a', 'b', 'c'}, result);
    }

    @Test
    public void testResetWithCopy_whenCurrentSegmentIsNull() {
        TextBuffer tb = new TextBuffer(null);
        char[] src = "copy me".toCharArray();
        tb.resetWithCopy(src, 0, src.length);

        assertEquals(src.length, tb.size());
        assertEquals(0, tb.getTextOffset());
        assertEquals("copy me", tb.contentsAsString());
    }

    @Test
    public void testResetWithCopy_whenHasSegments() {
        TextBuffer tb = new TextBuffer(null);
        tb.getCurrentSegment();
        tb.finishCurrentSegment();

        char[] src = "new copy".toCharArray();
        tb.resetWithCopy(src, 4, 4);

        assertEquals(4, tb.size());
        assertEquals("copy", tb.contentsAsString());
    }

    @Test
    public void testResetWithString_emptyAndNonEmpty() {
        TextBuffer tb = new TextBuffer(null);
        tb.getCurrentSegment();
        tb.finishCurrentSegment();

        tb.resetWithString("test string");
        assertEquals(11, tb.size());
        assertEquals(0, tb.getTextOffset());
        assertFalse(tb.hasTextAsCharacters());
        assertEquals("test string", tb.contentsAsString());
        assertArrayEquals("test string".toCharArray(), tb.getTextBuffer());
        assertTrue(tb.hasTextAsCharacters());
        assertArrayEquals("test string".toCharArray(), tb.contentsAsArray());

        tb.resetWithString("");
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testSize_whenCachedResultArray() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("cached", 0, 6);
        tb.contentsAsArray();
        assertEquals(6, tb.size());
    }

    @Test
    public void testGetTextBuffer_variousStates() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();
        assertNotNull(seg);
        assertSame(seg, tb.getTextBuffer());

        tb.finishCurrentSegment();
        tb.append('z');
        char[] combo = tb.getTextBuffer();
        assertNotNull(combo);
        assertTrue(combo.length >= 1);
    }

    @Test
    public void testContentsAsString_cachedResultStringAndResultArray() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("hello", 0, 5);
        char[] arr = tb.contentsAsArray();
        assertNotNull(arr);
        assertEquals("hello", tb.contentsAsString());
        // second call should return cached string
        assertEquals("hello", tb.contentsAsString());
    }

    @Test
    public void testContentsAsString_singleSegment_emptyAndNonEmpty() {
        TextBuffer tb = new TextBuffer(null);
        assertEquals("", tb.contentsAsString());

        tb.append('a');
        assertEquals("a", tb.contentsAsString());
    }

    @Test
    public void testContentsAsString_multipleSegments() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg1 = tb.getCurrentSegment();
        tb.setCurrentLength(seg1.length);
        Arrays.fill(seg1, 'A');
        tb.finishCurrentSegment();

        char[] seg2 = tb.getCurrentSegment();
        tb.setCurrentLength(seg2.length);
        Arrays.fill(seg2, 'B');
        tb.finishCurrentSegment();

        tb.append("C", 0, 1);

        String result = tb.contentsAsString();
        assertEquals(seg1.length + seg2.length + 1, result.length());
        assertTrue(result.startsWith("AAA"));
        assertTrue(result.endsWith("C"));
    }

    @Test
    public void testContentsAsDecimal_withCachedArray() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("123.45", 0, 6);
        tb.contentsAsArray();
        BigDecimal bd = tb.contentsAsDecimal();
        assertEquals(new BigDecimal("123.45"), bd);
    }

    @Test
    public void testContentsAsDecimal_withSharedBuffer() {
        TextBuffer tb = new TextBuffer(null);
        char[] buf = "value: 99.99 end".toCharArray();
        tb.resetWithShared(buf, 7, 5);
        BigDecimal bd = tb.contentsAsDecimal();
        assertEquals(new BigDecimal("99.99"), bd);
    }

    @Test
    public void testContentsAsDecimal_withSingleSegment() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("42.0", 0, 4);
        BigDecimal bd = tb.contentsAsDecimal();
        assertEquals(new BigDecimal("42.0"), bd);
    }

    @Test
    public void testContentsAsDecimal_withMultipleSegments() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.getCurrentSegment();
        for (int i = 0; i < seg.length; i++) {
            seg[i] = '1';
        }
        tb.setCurrentLength(seg.length);
        tb.finishCurrentSegment();
        tb.append(".5", 0, 2);

        BigDecimal bd = tb.contentsAsDecimal();
        assertNotNull(bd);
    }

    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimal_invalidValue_shouldThrowException() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("not-a-number", 0, 12);
        tb.contentsAsDecimal();
    }

    @Test
    public void testContentsAsDouble_validAndInvalid() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("123.456", 0, 7);
        assertEquals(123.456, tb.contentsAsDouble(), 0.00001);
    }

    @Test(expected = NumberFormatException.class)
    public void testContentsAsDouble_invalid_shouldThrowException() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("abc", 0, 3);
        tb.contentsAsDouble();
    }

    @Test
    public void testEnsureNotShared_whenSharedAndNotShared() {
        TextBuffer tb = new TextBuffer(null);
        tb.ensureNotShared();
        assertEquals(0, tb.size());

        char[] buf = "shared".toCharArray();
        tb.resetWithShared(buf, 0, 6);
        tb.ensureNotShared();
        assertEquals(6, tb.size());
        assertEquals("shared", tb.contentsAsString());
    }

    @Test
    public void testAppendChar_whenShared_andWhenExpanding() {
        TextBuffer tb = new TextBuffer(null);
        char[] buf = "test".toCharArray();
        tb.resetWithShared(buf, 0, 4);

        tb.append('!');
        assertEquals(5, tb.size());
        assertEquals("test!", tb.contentsAsString());

        tb.emptyAndGetCurrentSegment();
        char[] seg = tb.getCurrentSegment();
        tb.setCurrentLength(seg.length);
        tb.append('X');
        assertEquals(seg.length + 1, tb.size());
    }

    @Test
    public void testAppendCharArray_whenSharedAndNormal() {
        TextBuffer tb = new TextBuffer(null);
        char[] shared = "init".toCharArray();
        tb.resetWithShared(shared, 0, 4);

        char[] toAppend = "-append".toCharArray();
        tb.append(toAppend, 0, toAppend.length);
        assertEquals("init-append", tb.contentsAsString());
    }

    @Test
    public void testAppendCharArray_overflowAndHugeAppend() {
        TextBuffer tb = new TextBuffer(null);
        char[] first = new char[TextBuffer.MIN_SEGMENT_LEN - 10];
        Arrays.fill(first, 'a');
        tb.append(first, 0, first.length);

        char[] huge = new char[TextBuffer.MIN_SEGMENT_LEN * 4];
        Arrays.fill(huge, 'b');
        tb.append(huge, 0, huge.length);

        assertEquals(first.length + huge.length, tb.size());
        String str = tb.contentsAsString();
        assertEquals(first.length + huge.length, str.length());
        assertEquals('a', str.charAt(0));
        assertEquals('b', str.charAt(first.length));
    }

    @Test
    public void testAppendString_whenSharedAndNormal() {
        TextBuffer tb = new TextBuffer(null);
        char[] shared = "init".toCharArray();
        tb.resetWithShared(shared, 0, 4);

        tb.append("-str", 0, 4);
        assertEquals("init-str", tb.contentsAsString());
    }

    @Test
    public void testAppendString_overflowAndHugeAppend() {
        TextBuffer tb = new TextBuffer(null);
        char[] initial = new char[TextBuffer.MIN_SEGMENT_LEN - 5];
        Arrays.fill(initial, 'x');
        tb.append(initial, 0, initial.length);

        char[] hugeChars = new char[TextBuffer.MIN_SEGMENT_LEN * 3];
        Arrays.fill(hugeChars, 'y');
        String hugeStr = new String(hugeChars);

        tb.append(hugeStr, 0, hugeStr.length());
        assertEquals(initial.length + hugeStr.length(), tb.size());
        String res = tb.contentsAsString();
        assertEquals('x', res.charAt(0));
        assertEquals('y', res.charAt(initial.length));
    }

    @Test
    public void testGetCurrentSegment_sharedStateAndExpand() {
        TextBuffer tb = new TextBuffer(null);
        char[] shared = "share".toCharArray();
        tb.resetWithShared(shared, 0, 5);

        char[] seg = tb.getCurrentSegment();
        assertNotNull(seg);
        assertEquals(5, tb.getCurrentSegmentSize());

        tb.setCurrentLength(seg.length);
        char[] expanded = tb.getCurrentSegment();
        assertNotNull(expanded);
        assertNotSame(seg, expanded);
    }

    @Test
    public void testFinishCurrentSegment_growingSizes() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg1 = tb.emptyAndGetCurrentSegment();
        assertNotNull(seg1);

        char[] seg2 = tb.finishCurrentSegment();
        assertTrue(seg2.length >= TextBuffer.MIN_SEGMENT_LEN);

        char[] cur = seg2;
        for (int i = 0; i < 20; i++) {
            cur = tb.finishCurrentSegment();
        }
        assertTrue(cur.length <= TextBuffer.MAX_SEGMENT_LEN);
    }

    @Test
    public void testExpandCurrentSegment_default() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();
        int initialLen = seg.length;

        char[] expanded = tb.expandCurrentSegment();
        assertTrue(expanded.length > initialLen);

        char[] maxSeg = new char[TextBuffer.MAX_SEGMENT_LEN];
        tb.resetWithCopy(maxSeg, 0, maxSeg.length);
        char[] expandedMax = tb.expandCurrentSegment();
        assertEquals(TextBuffer.MAX_SEGMENT_LEN + 1, expandedMax.length);
    }

    @Test
    public void testExpandCurrentSegment_withMinSize() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();
        int initialLen = seg.length;

        char[] unchanged = tb.expandCurrentSegment(initialLen - 1);
        assertSame(seg, unchanged);

        char[] expanded = tb.expandCurrentSegment(initialLen + 500);
        assertEquals(initialLen + 500, expanded.length);
    }

    @Test
    public void testToString_shouldMatchContentsAsString() {
        TextBuffer tb = new TextBuffer(null);
        assertEquals("", tb.toString());

        tb.append("hello world", 0, 11);
        assertEquals("hello world", tb.toString());
    }

    @Test
    public void testUnshare_whenNeededLargerThanCurrentSegment() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);
        char[] shared = new char[TextBuffer.MIN_SEGMENT_LEN * 2];
        Arrays.fill(shared, 'k');
        tb.resetWithShared(shared, 0, shared.length);

        tb.append('!');
        assertEquals(shared.length + 1, tb.size());
        assertEquals('k', tb.contentsAsString().charAt(0));
        assertEquals('!', tb.contentsAsString().charAt(shared.length));
    }
}
