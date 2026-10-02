package com.fasterxml.jackson.core.io;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;

public class IOContextTest {

    private BufferRecycler recycler;
    private IOContext ctx;

    @Before
    public void setUp() {
        recycler = new BufferRecycler();
        ctx = new IOContext(recycler, "sourceRef", true);
    }

    // ---------- Constructor / basic accessors ----------

    @Test
    public void testConstructor_normalInput_fieldsSetCorrectly() {
        Object src = "mySource";
        IOContext context = new IOContext(recycler, src, false);
        assertSame(src, context.getSourceReference());
        assertFalse(context.isResourceManaged());
        assertNull(context.getEncoding());
    }

    @Test
    public void testConstructor_nullSourceRef_allowed() {
        IOContext context = new IOContext(recycler, null, true);
        assertNull(context.getSourceReference());
        assertTrue(context.isResourceManaged());
    }

    @Test
    public void testGetSourceReference_returnsSameReference() {
        assertEquals("sourceRef", ctx.getSourceReference());
    }

    @Test
    public void testIsResourceManaged_trueValue_returnsTrue() {
        assertTrue(ctx.isResourceManaged());
    }

    @Test
    public void testIsResourceManaged_falseValue_returnsFalse() {
        IOContext context = new IOContext(recycler, "src", false);
        assertFalse(context.isResourceManaged());
    }

    @Test
    public void testSetEncoding_normalInput_encodingSet() {
        ctx.setEncoding(JsonEncoding.UTF8);
        assertEquals(JsonEncoding.UTF8, ctx.getEncoding());
    }

    @Test
    public void testSetEncoding_nullEncoding_encodingIsNull() {
        ctx.setEncoding(null);
        assertNull(ctx.getEncoding());
    }

    @Test
    public void testWithEncoding_normalInput_returnsSameInstanceAndSetsEncoding() {
        IOContext result = ctx.withEncoding(JsonEncoding.UTF16_BE);
        assertSame(ctx, result);
        assertEquals(JsonEncoding.UTF16_BE, ctx.getEncoding());
    }

    @Test
    public void testGetEncoding_defaultValue_isNull() {
        assertNull(ctx.getEncoding());
    }

    // ---------- constructTextBuffer ----------

    @Test
    public void testConstructTextBuffer_normalInput_returnsNonNullTextBuffer() {
        TextBuffer tb = ctx.constructTextBuffer();
        assertNotNull(tb);
    }

    // ---------- allocReadIOBuffer ----------

    @Test
    public void testAllocReadIOBuffer_normalInput_returnsNonNullBuffer() {
        byte[] buf = ctx.allocReadIOBuffer();
        assertNotNull(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocReadIOBuffer_calledTwice_throwsIllegalStateException() {
        ctx.allocReadIOBuffer();
        ctx.allocReadIOBuffer();
    }

    @Test
    public void testAllocReadIOBufferWithMinSize_normalInput_returnsBufferOfAtLeastMinSize() {
        byte[] buf = ctx.allocReadIOBuffer(500);
        assertNotNull(buf);
        assertTrue(buf.length >= 500);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocReadIOBufferWithMinSize_calledTwice_throwsIllegalStateException() {
        ctx.allocReadIOBuffer(100);
        ctx.allocReadIOBuffer(200);
    }

    // ---------- allocWriteEncodingBuffer ----------

    @Test
    public void testAllocWriteEncodingBuffer_normalInput_returnsNonNullBuffer() {
        byte[] buf = ctx.allocWriteEncodingBuffer();
        assertNotNull(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocWriteEncodingBuffer_calledTwice_throwsIllegalStateException() {
        ctx.allocWriteEncodingBuffer();
        ctx.allocWriteEncodingBuffer();
    }

    @Test
    public void testAllocWriteEncodingBufferWithMinSize_normalInput_returnsBufferOfAtLeastMinSize() {
        byte[] buf = ctx.allocWriteEncodingBuffer(500);
        assertNotNull(buf);
        assertTrue(buf.length >= 500);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocWriteEncodingBufferWithMinSize_calledTwice_throwsIllegalStateException() {
        ctx.allocWriteEncodingBuffer(100);
        ctx.allocWriteEncodingBuffer(200);
    }

    // ---------- allocBase64Buffer ----------

    @Test
    public void testAllocBase64Buffer_normalInput_returnsNonNullBuffer() {
        byte[] buf = ctx.allocBase64Buffer();
        assertNotNull(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocBase64Buffer_calledTwice_throwsIllegalStateException() {
        ctx.allocBase64Buffer();
        ctx.allocBase64Buffer();
    }

    // ---------- allocTokenBuffer ----------

    @Test
    public void testAllocTokenBuffer_normalInput_returnsNonNullBuffer() {
        char[] buf = ctx.allocTokenBuffer();
        assertNotNull(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocTokenBuffer_calledTwice_throwsIllegalStateException() {
        ctx.allocTokenBuffer();
        ctx.allocTokenBuffer();
    }

    @Test
    public void testAllocTokenBufferWithMinSize_normalInput_returnsBufferOfAtLeastMinSize() {
        char[] buf = ctx.allocTokenBuffer(500);
        assertNotNull(buf);
        assertTrue(buf.length >= 500);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocTokenBufferWithMinSize_calledTwice_throwsIllegalStateException() {
        ctx.allocTokenBuffer(100);
        ctx.allocTokenBuffer(200);
    }

    // ---------- allocConcatBuffer ----------

    @Test
    public void testAllocConcatBuffer_normalInput_returnsNonNullBuffer() {
        char[] buf = ctx.allocConcatBuffer();
        assertNotNull(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocConcatBuffer_calledTwice_throwsIllegalStateException() {
        ctx.allocConcatBuffer();
        ctx.allocConcatBuffer();
    }

    // ---------- allocNameCopyBuffer ----------

    @Test
    public void testAllocNameCopyBuffer_normalInput_returnsBufferOfAtLeastMinSize() {
        char[] buf = ctx.allocNameCopyBuffer(500);
        assertNotNull(buf);
        assertTrue(buf.length >= 500);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocNameCopyBuffer_calledTwice_throwsIllegalStateException() {
        ctx.allocNameCopyBuffer(100);
        ctx.allocNameCopyBuffer(200);
    }

    // ---------- releaseReadIOBuffer ----------

    @Test
    public void testReleaseReadIOBuffer_nullBuffer_noExceptionThrown() {
        ctx.releaseReadIOBuffer(null);
        // no exception expected
    }

    @Test
    public void testReleaseReadIOBuffer_sameBufferAllocated_releasedSuccessfully() {
        byte[] buf = ctx.allocReadIOBuffer();
        ctx.releaseReadIOBuffer(buf);
        // Should be able to allocate again after release
        byte[] buf2 = ctx.allocReadIOBuffer();
        assertNotNull(buf2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseReadIOBuffer_wrongSmallerBuffer_throwsIllegalArgumentException() {
        byte[] allocated = ctx.allocReadIOBuffer();
        byte[] wrongBuf = new byte[allocated.length - 1 >= 0 ? 1 : 0];
        ctx.releaseReadIOBuffer(wrongBuf);
    }

    @Test
    public void testReleaseReadIOBuffer_largerBuffer_releasedSuccessfully() {
        byte[] allocated = ctx.allocReadIOBuffer();
        byte[] largerBuf = new byte[allocated.length + 100];
        ctx.releaseReadIOBuffer(largerBuf);
        // no exception expected since larger buffer is allowed
    }

    // ---------- releaseWriteEncodingBuffer ----------

    @Test
    public void testReleaseWriteEncodingBuffer_nullBuffer_noExceptionThrown() {
        ctx.releaseWriteEncodingBuffer(null);
    }

    @Test
    public void testReleaseWriteEncodingBuffer_sameBufferAllocated_releasedSuccessfully() {
        byte[] buf = ctx.allocWriteEncodingBuffer();
        ctx.releaseWriteEncodingBuffer(buf);
        byte[] buf2 = ctx.allocWriteEncodingBuffer();
        assertNotNull(buf2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseWriteEncodingBuffer_wrongSmallerBuffer_throwsIllegalArgumentException() {
        byte[] allocated = ctx.allocWriteEncodingBuffer();
        byte[] wrongBuf = new byte[1];
        ctx.releaseWriteEncodingBuffer(wrongBuf);
    }

    // ---------- releaseBase64Buffer ----------

    @Test
    public void testReleaseBase64Buffer_nullBuffer_noExceptionThrown() {
        ctx.releaseBase64Buffer(null);
    }

    @Test
    public void testReleaseBase64Buffer_sameBufferAllocated_releasedSuccessfully() {
        byte[] buf = ctx.allocBase64Buffer();
        ctx.releaseBase64Buffer(buf);
        byte[] buf2 = ctx.allocBase64Buffer();
        assertNotNull(buf2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseBase64Buffer_wrongSmallerBuffer_throwsIllegalArgumentException() {
        byte[] allocated = ctx.allocBase64Buffer();
        byte[] wrongBuf = new byte[1];
        ctx.releaseBase64Buffer(wrongBuf);
    }

    // ---------- releaseTokenBuffer ----------

    @Test
    public void testReleaseTokenBuffer_nullBuffer_noExceptionThrown() {
        ctx.releaseTokenBuffer(null);
    }

    @Test
    public void testReleaseTokenBuffer_sameBufferAllocated_releasedSuccessfully() {
        char[] buf = ctx.allocTokenBuffer();
        ctx.releaseTokenBuffer(buf);
        char[] buf2 = ctx.allocTokenBuffer();
        assertNotNull(buf2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseTokenBuffer_wrongSmallerBuffer_throwsIllegalArgumentException() {
        char[] allocated = ctx.allocTokenBuffer();
        char[] wrongBuf = new char[1];
        ctx.releaseTokenBuffer(wrongBuf);
    }

    // ---------- releaseConcatBuffer ----------

    @Test
    public void testReleaseConcatBuffer_nullBuffer_noExceptionThrown() {
        ctx.releaseConcatBuffer(null);
    }

    @Test
    public void testReleaseConcatBuffer_sameBufferAllocated_releasedSuccessfully() {
        char[] buf = ctx.allocConcatBuffer();
        ctx.releaseConcatBuffer(buf);
        char[] buf2 = ctx.allocConcatBuffer();
        assertNotNull(buf2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseConcatBuffer_wrongSmallerBuffer_throwsIllegalArgumentException() {
        char[] allocated = ctx.allocConcatBuffer();
        char[] wrongBuf = new char[1];
        ctx.releaseConcatBuffer(wrongBuf);
    }

    @Test
    public void testReleaseConcatBuffer_largerBuffer_releasedSuccessfully() {
        char[] allocated = ctx.allocConcatBuffer();
        char[] largerBuf = new char[allocated.length + 100];
        ctx.releaseConcatBuffer(largerBuf);
    }

    // ---------- releaseNameCopyBuffer ----------

    @Test
    public void testReleaseNameCopyBuffer_nullBuffer_noExceptionThrown() {
        ctx.releaseNameCopyBuffer(null);
    }

    @Test
    public void testReleaseNameCopyBuffer_sameBufferAllocated_releasedSuccessfully() {
        char[] buf = ctx.allocNameCopyBuffer(50);
        ctx.releaseNameCopyBuffer(buf);
        char[] buf2 = ctx.allocNameCopyBuffer(50);
        assertNotNull(buf2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseNameCopyBuffer_wrongSmallerBuffer_throwsIllegalArgumentException() {
        char[] allocated = ctx.allocNameCopyBuffer(50);
        char[] wrongBuf = new char[1];
        ctx.releaseNameCopyBuffer(wrongBuf);
    }

    @Test
    public void testReleaseNameCopyBuffer_largerBuffer_releasedSuccessfully() {
        char[] allocated = ctx.allocNameCopyBuffer(50);
        char[] largerBuf = new char[allocated.length + 100];
        ctx.releaseNameCopyBuffer(largerBuf);
    }
}
