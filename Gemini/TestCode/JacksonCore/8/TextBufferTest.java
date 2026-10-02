package com.fasterxml.jackson.core.util;

import java.math.BigDecimal;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextBufferTest {

    @Test
    public void testConstructor_withNullAllocator() {
        TextBuffer tb = new TextBuffer(null);
        assertNull(tb.getTextBuffer());
        assertEquals(0, tb.size());
        assertEquals(0, tb.getTextOffset());
        assertTrue(tb.hasTextAsCharacters());
    }

    @Test
    public void testConstructor_withBufferRecycler() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);
        assertEquals(0, tb.size());
    }

    @Test
    public void testReleaseBuffers_nullAllocator() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        tb.releaseBuffers();
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testReleaseBuffers_withAllocatorAndSegment() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);
        tb.append('x');
        tb.releaseBuffers();
        assertEquals(0, tb.size());
    }

    @Test
    public void testReleaseBuffers_withAllocatorAndNullSegment() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);
        tb.releaseBuffers();
        assertEquals(0, tb.size());
    }

    @Test
    public void testResetWithEmpty_noSegments() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        tb.resetWithEmpty();
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
        assertEquals(0, tb.getTextOffset());
    }

    @Test
    public void testResetWithEmpty_withSegments() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();
        tb.finishCurrentSegment();
        tb.append('b');
        tb.resetWithEmpty();
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testResetWithShared_emptyAndNonEmpty() {
        TextBuffer tb = new TextBuffer(null);
        char[] buf = "HelloWorld".toCharArray();
        
        tb.resetWithShared(buf, 5, 5);
        assertEquals(5, tb.size());
        assertEquals(5, tb.getTextOffset());
        assertTrue(tb.hasTextAsCharacters());
        assertSame(buf, tb.getTextBuffer());
        assertEquals("World", tb.contentsAsString());
        
        tb.finishCurrentSegment();
        tb.resetWithShared(buf, 0, 0);
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
        assertArrayEquals(TextBuffer.NO_CHARS, tb.contentsAsArray());
    }

    @Test
    public void testResetWithCopy_initialAndWithSegments() {
        TextBuffer tb = new TextBuffer(null);
        char[] src = "TestData".toCharArray();

        tb.resetWithCopy(src, 0, 4);
        assertEquals(4, tb.size());
        assertEquals("Test", tb.contentsAsString());

        tb.finishCurrentSegment();
        tb.resetWithCopy(src, 4, 4);
        assertEquals(4, tb.size());
        assertEquals("Data", tb.contentsAsString());
    }

    @Test
    public void testResetWithString_emptyAndNonEmpty() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("SampleText");
        assertEquals(10, tb.size());
        assertFalse(tb.hasTextAsCharacters());
        assertEquals("SampleText", tb.contentsAsString());

        tb.finishCurrentSegment();
        tb.resetWithString("");
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testSize_variousStates() {
        TextBuffer tb = new TextBuffer(null);
        assertEquals(0, tb.size());

        tb.resetWithShared("abc".toCharArray(), 1, 2);
        assertEquals(2, tb.size());

        tb.resetWithString("12345");
        assertEquals(5, tb.size());

        tb.contentsAsArray();
        assertEquals(5, tb.size());

        tb.resetWithEmpty();
        tb.append("chunk1", 0, 6);
        tb.finishCurrentSegment();
        tb.append("chunk2", 0, 6);
        assertEquals(1006, tb.size());
    }

    @Test
    public void testGetTextOffset_sharedAndNonShared() {
        TextBuffer tb = new TextBuffer(null);
        assertEquals(0, tb.getTextOffset());

        tb.resetWithShared("abcdef".toCharArray(), 3, 2);
        assertEquals(3, tb.getTextOffset());

        tb.resetWithEmpty();
        tb.append('z');
        assertEquals(0, tb.getTextOffset());
    }

    @Test
    public void testHasTextAsCharacters_allBranches() {
        TextBuffer tb = new TextBuffer(null);
        assertTrue(tb.hasTextAsCharacters());

        tb.resetWithShared("test".toCharArray(), 0, 4);
        assertTrue(tb.hasTextAsCharacters());

        tb.resetWithString("str");
        assertFalse(tb.hasTextAsCharacters());

        tb.contentsAsArray();
        assertTrue(tb.hasTextAsCharacters());
    }

    @Test
    public void testGetTextBuffer_allBranches() {
        TextBuffer tb = new TextBuffer(null);
        char[] src = "SharedBuffer".toCharArray();

        tb.resetWithShared(src, 0, 6);
        assertSame(src, tb.getTextBuffer());

        tb.resetWithString("CachedString");
        char[] fromString = tb.getTextBuffer();
        assertArrayEquals("CachedString".toCharArray(), fromString);
        assertSame(fromString, tb.getTextBuffer());

        tb.resetWithEmpty();
        tb.append("SingleSeg", 0, 9);
        assertNotNull(tb.getTextBuffer());

        tb.finishCurrentSegment();
        tb.append("SecondSeg", 0, 9);
        char[] multi = tb.getTextBuffer();
        assertEquals(1009, multi.length);
    }

    @Test
    public void testContentsAsString_allBranches() {
        TextBuffer tb = new TextBuffer(null);
        assertEquals("", tb.contentsAsString());

        tb.resetWithShared("Shared".toCharArray(), 0, 0);
        assertEquals("", tb.contentsAsString());

        tb.resetWithShared("Shared".toCharArray(), 1, 4);
        assertEquals("hare", tb.contentsAsString());
        assertEquals("hare", tb.contentsAsString());

        tb.resetWithEmpty();
        tb.append("Hello", 0, 5);
        tb.contentsAsArray();
        assertEquals("Hello", tb.contentsAsString());

        tb.resetWithEmpty();
        tb.append("Part1", 0, 5);
        tb.finishCurrentSegment();
        tb.append("Part2", 0, 5);
        String s = tb.contentsAsString();
        assertTrue(s.startsWith("Part1"));
        assertTrue(s.endsWith("Part2"));
    }

    @Test
    public void testContentsAsArray_allBranches() {
        TextBuffer tb = new TextBuffer(null);
        assertArrayEquals(TextBuffer.NO_CHARS, tb.contentsAsArray());

        tb.resetWithString("DirectString");
        assertArrayEquals("DirectString".toCharArray(), tb.contentsAsArray());

        char[] sharedBuf = "0123456789".toCharArray();
        tb.resetWithShared(sharedBuf, 0, 4);
        assertArrayEquals("0123".toCharArray(), tb.contentsAsArray());

        tb.resetWithShared(sharedBuf, 2, 5);
        assertArrayEquals("23456".toCharArray(), tb.contentsAsArray());

        tb.resetWithEmpty();
        tb.append("abc", 0, 3);
        char[] arr1 = tb.contentsAsArray();
        char[] arr2 = tb.contentsAsArray();
        assertSame(arr1, arr2);
        assertArrayEquals("abc".toCharArray(), arr1);
    }

    @Test
    public void testContentsAsDecimal_allBranches() {
        TextBuffer tb = new TextBuffer(null);

        tb.resetWithEmpty();
        tb.append("123.45", 0, 6);
        tb.contentsAsArray();
        assertEquals(new BigDecimal("123.45"), tb.contentsAsDecimal());

        char[] shared = "prefix99.99suffix".toCharArray();
        tb.resetWithShared(shared, 6, 5);
        assertEquals(new BigDecimal("99.99"), tb.contentsAsDecimal());

        tb.resetWithEmpty();
        tb.append("100.5", 0, 5);
        assertEquals(new BigDecimal("100.5"), tb.contentsAsDecimal());

        tb.finishCurrentSegment();
        tb.append("5", 0, 1);
        try {
            tb.contentsAsDecimal();
        } catch (NumberFormatException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimal_invalidFormat() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("not-a-decimal");
        tb.contentsAsDecimal();
    }

    @Test
    public void testContentsAsDouble() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("123.456");
        assertEquals(123.456, tb.contentsAsDouble(), 0.00001);
    }

    @Test(expected = NumberFormatException.class)
    public void testContentsAsDouble_invalidFormat() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("invalid");
        tb.contentsAsDouble();
    }

    @Test
    public void testEnsureNotShared() {
        TextBuffer tb = new TextBuffer(null);
        char[] shared = "ShareMe".toCharArray();
        tb.resetWithShared(shared, 0, 7);
        tb.ensureNotShared();
        assertEquals(0, tb.getTextOffset());
        assertEquals("ShareMe", tb.contentsAsString());

        tb.ensureNotShared();
        assertEquals("ShareMe", tb.contentsAsString());
    }

    @Test
    public void testAppendChar_sharedAndExpansion() {
        TextBuffer tb = new TextBuffer(null);
        char[] shared = "Init".toCharArray();
        tb.resetWithShared(shared, 0, 4);
        tb.append('!');
        assertEquals("Init!", tb.contentsAsString());

        tb.resetWithEmpty();
        for (int i = 0; i < 1005; i++) {
            tb.append((char) ('a' + (i % 26)));
        }
        assertEquals(1005, tb.size());
    }

    @Test
    public void testAppendCharArray_sharedFitsPartiallyFitsAndHuge() {
        TextBuffer tb = new TextBuffer(null);
        char[] shared = "Start".toCharArray();
        tb.resetWithShared(shared, 0, 5);

        char[] append1 = "More".toCharArray();
        tb.append(append1, 0, 4);
        assertEquals("StartMore", tb.contentsAsString());

        char[] large = new char[2500];
        Arrays.fill(large, 'Z');
        tb.append(large, 0, large.length);
        assertEquals(5 + 4 + 2500, tb.size());

        char[] huge = new char[500000];
        Arrays.fill(huge, 'H');
        tb.append(huge, 0, huge.length);
        assertEquals(5 + 4 + 2500 + 500000, tb.size());
    }

    @Test
    public void testAppendString_sharedFitsPartiallyFitsAndHuge() {
        TextBuffer tb = new TextBuffer(null);
        char[] shared = "Initial".toCharArray();
        tb.resetWithShared(shared, 0, 7);

        tb.append("Small", 0, 5);
        assertEquals("InitialSmall", tb.contentsAsString());

        char[] fill = new char[3000];
        Arrays.fill(fill, 'S');
        String largeStr = new String(fill);
        tb.append(largeStr, 0, largeStr.length());
        assertEquals(7 + 5 + 3000, tb.size());

        char[] hugeFill = new char[400000];
        Arrays.fill(hugeFill, 'G');
        String hugeStr = new String(hugeFill);
        tb.append(hugeStr, 0, hugeStr.length());
        assertEquals(7 + 5 + 3000 + 400000, tb.size());
    }

    @Test
    public void testGetCurrentSegment_allBranches() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg1 = tb.getCurrentSegment();
        assertNotNull(seg1);

        tb.resetWithShared("Shared".toCharArray(), 0, 6);
        char[] segShared = tb.getCurrentSegment();
        assertNotNull(segShared);
        assertEquals(6, tb.getCurrentSegmentSize());

        tb.resetWithEmpty();
        char[] seg = tb.getCurrentSegment();
        tb.setCurrentLength(seg.length);
        char[] expanded = tb.getCurrentSegment();
        assertTrue(expanded.length > seg.length);
    }

    @Test
    public void testEmptyAndGetCurrentSegment_withAndWithoutSegments() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();
        assertNotNull(seg);
        assertEquals(0, tb.getCurrentSegmentSize());

        tb.finishCurrentSegment();
        char[] segAfterFinish = tb.emptyAndGetCurrentSegment();
        assertNotNull(segAfterFinish);
        assertEquals(0, tb.getCurrentSegmentSize());
    }

    @Test
    public void testCurrentSegmentSizeAndSetCurrentLength() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();
        assertEquals(0, tb.getCurrentSegmentSize());
        tb.setCurrentLength(42);
        assertEquals(42, tb.getCurrentSegmentSize());
    }

    @Test
    public void testSetCurrentAndReturn() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();
        seg[0] = 'a';
        seg[1] = 'b';
        assertEquals("ab", tb.setCurrentAndReturn(2));
        assertEquals("", tb.setCurrentAndReturn(0));

        tb.finishCurrentSegment();
        char[] seg2 = tb.getCurrentSegment();
        seg2[0] = 'c';
        String res = tb.setCurrentAndReturn(1);
        assertEquals(tb.contentsAsString(), res);
    }

    @Test
    public void testFinishCurrentSegment_growthsAndBoundaries() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();

        for (int i = 0; i < 20; i++) {
            char[] nextSeg = tb.finishCurrentSegment();
            assertNotNull(nextSeg);
            assertTrue(nextSeg.length >= TextBuffer.MIN_SEGMENT_LEN);
            assertTrue(nextSeg.length <= TextBuffer.MAX_SEGMENT_LEN);
        }
    }

    @Test
    public void testExpandCurrentSegment_default() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();
        int oldLen = tb.getCurrentSegment().length;
        char[] expanded = tb.expandCurrentSegment();
        assertEquals(oldLen + (oldLen >> 1), expanded.length);

        tb.expandCurrentSegment(TextBuffer.MAX_SEGMENT_LEN + 1000);
        int bigLen = tb.getCurrentSegment().length;
        char[] superExpanded = tb.expandCurrentSegment();
        assertEquals(bigLen + (bigLen >> 2), superExpanded.length);
    }

    @Test
    public void testExpandCurrentSegment_withMinSize() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();
        char[] initial = tb.getCurrentSegment();

        char[] same = tb.expandCurrentSegment(initial.length);
        assertSame(initial, same);

        char[] expanded = tb.expandCurrentSegment(initial.length + 500);
        assertTrue(expanded.length >= initial.length + 500);
    }

    @Test
    public void testToString() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("HelloWorld", 0, 10);
        assertEquals("HelloWorld", tb.toString());
    }
}
