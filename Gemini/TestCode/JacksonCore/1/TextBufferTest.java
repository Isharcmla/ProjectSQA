package com.fasterxml.jackson.core.util;

import org.junit.Test;
import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TextBufferTest {

    @Test
    public void testReleaseBuffers_nullAllocator() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("test", 0, 4);
        tb.releaseBuffers();
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testReleaseBuffers_withAllocator() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);
        // segment not initialized yet
        tb.releaseBuffers();
        assertEquals(0, tb.size());

        // initialize segment and then release
        tb.emptyAndGetCurrentSegment();
        tb.append("data", 0, 4);
        tb.releaseBuffers();
        assertEquals(0, tb.size());

        // release when current segment is already cleared
        tb.releaseBuffers();
        assertEquals(0, tb.size());
    }

    @Test
    public void testResetWithEmpty_withoutSegments() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        tb.resetWithEmpty();
        assertEquals(0, tb.size());
        assertEquals(0, tb.getTextOffset());
        assertEquals("", tb.contentsAsString());
        assertArrayEquals(TextBuffer.NO_CHARS, tb.contentsAsArray());
    }

    @Test
    public void testResetWithEmpty_withSegments() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();
        tb.finishCurrentSegment();
        tb.append("hello", 0, 5);
        tb.resetWithEmpty();
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testResetWithShared_andAccessors() {
        TextBuffer tb = new TextBuffer(null);
        char[] src = "0123456789".toCharArray();
        
        tb.resetWithShared(src, 2, 5);
        assertEquals(5, tb.size());
        assertEquals(2, tb.getTextOffset());
        assertTrue(tb.hasTextAsCharacters());
        assertSame(src, tb.getTextBuffer());
        assertEquals("23456", tb.contentsAsString());
        assertArrayEquals("23456".toCharArray(), tb.contentsAsArray());

        // reset shared with 0 length
        tb.resetWithShared(src, 0, 0);
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
        assertArrayEquals(TextBuffer.NO_CHARS, tb.contentsAsArray());

        // reset shared when segments exist
        tb.emptyAndGetCurrentSegment();
        tb.finishCurrentSegment();
        tb.resetWithShared(src, 1, 3);
        assertEquals(3, tb.size());
        assertEquals("123", tb.contentsAsString());

        // reset shared with start == 0
        tb.resetWithShared(src, 0, 4);
        assertArrayEquals("0123".toCharArray(), tb.contentsAsArray());
    }

    @Test
    public void testResetWithCopy_variants() {
        TextBuffer tb = new TextBuffer(null);
        char[] src = "ABCDEFGHIJ".toCharArray();

        // when current segment is null
        tb.resetWithCopy(src, 1, 4);
        assertEquals(4, tb.size());
        assertEquals("BCDE", tb.contentsAsString());

        // when current segment already exists
        tb.resetWithCopy(src, 5, 3);
        assertEquals(3, tb.size());
        assertEquals("FGH", tb.contentsAsString());

        // when segments exist
        tb.finishCurrentSegment();
        tb.resetWithCopy(src, 0, 2);
        assertEquals(2, tb.size());
        assertEquals("AB", tb.contentsAsString());
    }

    @Test
    public void testResetWithString_variants() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("Sample String");
        assertEquals(13, tb.size());
        assertEquals(0, tb.getTextOffset());
        assertFalse(tb.hasTextAsCharacters());
        assertEquals("Sample String", tb.contentsAsString());
        assertArrayEquals("Sample String".toCharArray(), tb.contentsAsArray());
        assertArrayEquals("Sample String".toCharArray(), tb.getTextBuffer());

        // reset with segments present
        tb.emptyAndGetCurrentSegment();
        tb.finishCurrentSegment();
        tb.resetWithString("Another String");
        assertEquals(14, tb.size());
        assertEquals("Another String", tb.contentsAsString());
    }

    @Test
    public void testHasTextAsCharacters_andGetTextBuffer() {
        TextBuffer tb = new TextBuffer(null);
        
        // Default state (empty, non-shared, no string)
        assertTrue(tb.hasTextAsCharacters());
        assertNull(tb.getTextBuffer());

        // With String set
        tb.resetWithString("test");
        assertFalse(tb.hasTextAsCharacters());
        assertNotNull(tb.getTextBuffer());
        // once contentsAsArray / getTextBuffer caches resultArray, hasTextAsCharacters should be true
        assertTrue(tb.hasTextAsCharacters());

        // Segmented across multiple buffers
        tb.resetWithEmpty();
        tb.emptyAndGetCurrentSegment();
        tb.finishCurrentSegment();
        tb.append("segment2", 0, 8);
        char[] combined = tb.getTextBuffer();
        assertEquals(8, tb.size());
        assertNotNull(combined);
    }

    @Test
    public void testContentsAsString_andToString() {
        TextBuffer tb = new TextBuffer(null);

        // Empty state
        assertEquals("", tb.contentsAsString());
        assertEquals("", tb.toString());

        // Single segment
        tb.append("single", 0, 6);
        assertEquals("single", tb.contentsAsString());
        assertEquals("single", tb.toString());

        // Cached array before calling contentsAsString
        tb.resetWithEmpty();
        tb.append("cachedArray", 0, 11);
        tb.contentsAsArray();
        assertEquals("cachedArray", tb.contentsAsString());

        // Multi segments
        tb.resetWithEmpty();
        tb.append("Part1-", 0, 6);
        tb.finishCurrentSegment();
        tb.append("Part2", 0, 5);
        assertEquals("Part1-Part2", tb.contentsAsString());
    }

    @Test
    public void testContentsAsDecimal_allBranches() {
        TextBuffer tb = new TextBuffer(null);

        // 1. Shared buffer
        char[] src = "123.456 extra".toCharArray();
        tb.resetWithShared(src, 0, 7);
        assertEquals(new BigDecimal("123.456"), tb.contentsAsDecimal());

        // 2. Pre-cut resultArray cached
        tb.contentsAsArray();
        assertEquals(new BigDecimal("123.456"), tb.contentsAsDecimal());

        // 3. Single segment
        tb.resetWithEmpty();
        tb.append("987.65", 0, 6);
        assertEquals(new BigDecimal("987.65"), tb.contentsAsDecimal());

        // 4. Multi segment
        tb.resetWithEmpty();
        tb.append("12345", 0, 5);
        tb.finishCurrentSegment();
        tb.append(".6789", 0, 5);
        assertEquals(new BigDecimal("12345.6789"), tb.contentsAsDecimal());
    }

    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimal_invalid() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("not-a-decimal", 0, 13);
        tb.contentsAsDecimal();
    }

    @Test
    public void testContentsAsDouble() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("123.5", 0, 5);
        assertEquals(123.5, tb.contentsAsDouble(), 0.00001);
    }

    @Test(expected = NumberFormatException.class)
    public void testContentsAsDouble_invalid() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("invalid_double", 0, 14);
        tb.contentsAsDouble();
    }

    @Test
    public void testEnsureNotShared() {
        TextBuffer tb = new TextBuffer(null);
        char[] src = "SharedContent".toCharArray();
        tb.resetWithShared(src, 0, 13);
        tb.ensureNotShared();
        
        assertEquals(13, tb.size());
        assertEquals("SharedContent", tb.contentsAsString());
        assertEquals(0, tb.getTextOffset());

        // calling ensureNotShared when not shared does nothing
        tb.ensureNotShared();
        assertEquals(13, tb.size());
    }

    @Test
    public void testAppendChar_branches() {
        TextBuffer tb = new TextBuffer(null);

        // Append to shared
        char[] src = "ABC".toCharArray();
        tb.resetWithShared(src, 0, 3);
        tb.append('D');
        assertEquals("ABCD", tb.contentsAsString());

        // Append until segment overflows and expands
        tb.resetWithEmpty();
        char[] seg = tb.emptyAndGetCurrentSegment();
        int initialCapacity = seg.length;
        for (int i = 0; i < initialCapacity; i++) {
            tb.append('x');
        }
        assertEquals(initialCapacity, tb.size());
        // next append causes expand
        tb.append('y');
        assertEquals(initialCapacity + 1, tb.size());
    }

    @Test
    public void testAppendCharArray_branches() {
        TextBuffer tb = new TextBuffer(null);

        // Append to shared
        char[] src = "Prefix:".toCharArray();
        tb.resetWithShared(src, 0, 7);
        tb.append("Data".toCharArray(), 0, 4);
        assertEquals("Prefix:Data", tb.contentsAsString());

        // Partial fit and span into new segment
        tb.resetWithEmpty();
        char[] seg = tb.emptyAndGetCurrentSegment();
        int segLen = seg.length;
        char[] chunk1 = new char[segLen - 2];
        Arrays.fill(chunk1, '1');
        tb.append(chunk1, 0, chunk1.length);

        char[] chunk2 = new char[10];
        Arrays.fill(chunk2, '2');
        tb.append(chunk2, 0, chunk2.length);
        assertEquals(segLen - 2 + 10, tb.size());

        // Huge append exceeding standard segment
        tb.resetWithEmpty();
        char[] huge = new char[5000];
        Arrays.fill(huge, 'H');
        tb.append(huge, 0, huge.length);
        assertEquals(5000, tb.size());
    }

    @Test
    public void testAppendString_branches() {
        TextBuffer tb = new TextBuffer(null);

        // Append string to shared
        char[] src = "Init".toCharArray();
        tb.resetWithShared(src, 0, 4);
        tb.append("+More", 0, 5);
        assertEquals("Init+More", tb.contentsAsString());

        // Small append
        tb.resetWithEmpty();
        tb.append("Hello", 0, 5);
        assertEquals("Hello", tb.contentsAsString());

        // Partial fit and multi-segment string append
        tb.resetWithEmpty();
        char[] seg = tb.emptyAndGetCurrentSegment();
        int fillLen = seg.length - 2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fillLen; i++) {
            sb.append('A');
        }
        tb.append(sb.toString(), 0, fillLen);
        tb.append("BBBBBB", 0, 6);
        assertEquals(fillLen + 6, tb.size());

        // Huge string append
        tb.resetWithEmpty();
        StringBuilder hugeSb = new StringBuilder();
        for (int i = 0; i < 6000; i++) {
            hugeSb.append('Z');
        }
        tb.append(hugeSb.toString(), 0, 6000);
        assertEquals(6000, tb.size());
    }

    @Test
    public void testGetCurrentSegment_branches() {
        TextBuffer tb = new TextBuffer(null);

        // When shared
        char[] src = "Shared".toCharArray();
        tb.resetWithShared(src, 0, 6);
        char[] seg = tb.getCurrentSegment();
        assertNotNull(seg);
        assertEquals(6, tb.getCurrentSegmentSize());

        // When null
        tb.resetWithEmpty();
        char[] freshSeg = tb.getCurrentSegment();
        assertNotNull(freshSeg);

        // When current segment is full
        tb.setCurrentLength(freshSeg.length);
        char[] expandedSeg = tb.getCurrentSegment();
        assertNotSame(freshSeg, expandedSeg);
    }

    @Test
    public void testEmptyAndGetCurrentSegment_withSegments() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);
        tb.emptyAndGetCurrentSegment();
        tb.finishCurrentSegment();
        tb.append("data", 0, 4);

        char[] seg = tb.emptyAndGetCurrentSegment();
        assertNotNull(seg);
        assertEquals(0, tb.getCurrentSegmentSize());
        assertEquals(0, tb.size());
    }

    @Test
    public void testSetCurrentLength() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();
        tb.setCurrentLength(42);
        assertEquals(42, tb.getCurrentSegmentSize());
        assertEquals(42, tb.size());
    }

    @Test
    public void testFinishCurrentSegment_multipleTimes() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();
        for (int i = 0; i < 5; i++) {
            char[] seg = tb.finishCurrentSegment();
            assertNotNull(seg);
            assertEquals(0, tb.getCurrentSegmentSize());
        }
        assertTrue(tb.size() > 0);
    }

    @Test
    public void testExpandCurrentSegment_upToMax() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();

        char[] seg = tb.getCurrentSegment();
        while (seg.length < TextBuffer.MAX_SEGMENT_LEN) {
            seg = tb.expandCurrentSegment();
        }
        assertEquals(TextBuffer.MAX_SEGMENT_LEN, seg.length);

        // Expand when already at MAX_SEGMENT_LEN
        char[] maxPlusOne = tb.expandCurrentSegment();
        assertEquals(TextBuffer.MAX_SEGMENT_LEN + 1, maxPlusOne.length);
    }
}
