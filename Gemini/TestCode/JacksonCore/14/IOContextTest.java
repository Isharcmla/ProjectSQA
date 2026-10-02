package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IOContextTest {

    private BufferRecycler bufferRecycler;
    private Object sourceRef;
    private IOContext ioContext;

    @Before
    public void setUp() {
        bufferRecycler = new BufferRecycler();
        sourceRef = "test-source-ref";
        ioContext = new IOContext(bufferRecycler, sourceRef, true);
    }

    @Test
    public void testConstructorAndGetters_normalInput_returnsExpectedValues() {
        Assert.assertSame(sourceRef, ioContext.getSourceReference());
        Assert.assertTrue(ioContext.isResourceManaged());
        Assert.assertNull(ioContext.getEncoding());

        IOContext unmanagedContext = new IOContext(bufferRecycler, null, false);
        Assert.assertNull(unmanagedContext.getSourceReference());
        Assert.assertFalse(unmanagedContext.isResourceManaged());
    }

    @Test
    public void testSetEncoding_validEncoding_encodingIsSet() {
        ioContext.setEncoding(JsonEncoding.UTF8);
        Assert.assertEquals(JsonEncoding.UTF8, ioContext.getEncoding());

        ioContext.setEncoding(JsonEncoding.UTF16_BE);
        Assert.assertEquals(JsonEncoding.UTF16_BE, ioContext.getEncoding());

        ioContext.setEncoding(null);
        Assert.assertNull(ioContext.getEncoding());
    }

    @Test
    public void testWithEncoding_validEncoding_setsEncodingAndReturnsSelf() {
        IOContext result = ioContext.withEncoding(JsonEncoding.UTF32_LE);
        Assert.assertSame(ioContext, result);
        Assert.assertEquals(JsonEncoding.UTF32_LE, ioContext.getEncoding());

        result = ioContext.withEncoding(null);
        Assert.assertSame(ioContext, result);
        Assert.assertNull(ioContext.getEncoding());
    }

    @Test
    public void testConstructTextBuffer_normalInput_returnsValidTextBuffer() {
        TextBuffer textBuffer = ioContext.constructTextBuffer();
        Assert.assertNotNull(textBuffer);
    }

    @Test
    public void testAllocAndReleaseReadIOBuffer_defaultSize_success() {
        byte[] buf = ioContext.allocReadIOBuffer();
        Assert.assertNotNull(buf);

        ioContext.releaseReadIOBuffer(buf);

        // Can reallocate after proper release
        byte[] buf2 = ioContext.allocReadIOBuffer();
        Assert.assertNotNull(buf2);
        ioContext.releaseReadIOBuffer(buf2);
    }

    @Test
    public void testAllocAndReleaseReadIOBuffer_withMinSize_success() {
        byte[] buf = ioContext.allocReadIOBuffer(100);
        Assert.assertNotNull(buf);
        Assert.assertTrue(buf.length >= 100);

        ioContext.releaseReadIOBuffer(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocReadIOBuffer_calledTwiceWithoutRelease_throwsIllegalStateException() {
        ioContext.allocReadIOBuffer();
        ioContext.allocReadIOBuffer();
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocReadIOBuffer_withMinSizeCalledTwiceWithoutRelease_throwsIllegalStateException() {
        ioContext.allocReadIOBuffer(50);
        ioContext.allocReadIOBuffer(50);
    }

    @Test
    public void testReleaseReadIOBuffer_nullInput_doesNothing() {
        ioContext.releaseReadIOBuffer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseReadIOBuffer_wrongBuffer_throwsIllegalArgumentException() {
        ioContext.allocReadIOBuffer();
        byte[] wrongBuffer = new byte[10];
        ioContext.releaseReadIOBuffer(wrongBuffer);
    }

    @Test
    public void testReleaseReadIOBuffer_largerBufferUpgrade_success() {
        byte[] original = ioContext.allocReadIOBuffer();
        byte[] larger = new byte[original.length + 100];
        ioContext.releaseReadIOBuffer(larger);
    }

    @Test
    public void testAllocAndReleaseWriteEncodingBuffer_defaultSize_success() {
        byte[] buf = ioContext.allocWriteEncodingBuffer();
        Assert.assertNotNull(buf);

        ioContext.releaseWriteEncodingBuffer(buf);

        byte[] buf2 = ioContext.allocWriteEncodingBuffer();
        Assert.assertNotNull(buf2);
        ioContext.releaseWriteEncodingBuffer(buf2);
    }

    @Test
    public void testAllocAndReleaseWriteEncodingBuffer_withMinSize_success() {
        byte[] buf = ioContext.allocWriteEncodingBuffer(200);
        Assert.assertNotNull(buf);
        Assert.assertTrue(buf.length >= 200);

        ioContext.releaseWriteEncodingBuffer(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocWriteEncodingBuffer_calledTwiceWithoutRelease_throwsIllegalStateException() {
        ioContext.allocWriteEncodingBuffer();
        ioContext.allocWriteEncodingBuffer();
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocWriteEncodingBuffer_withMinSizeCalledTwiceWithoutRelease_throwsIllegalStateException() {
        ioContext.allocWriteEncodingBuffer(50);
        ioContext.allocWriteEncodingBuffer(50);
    }

    @Test
    public void testReleaseWriteEncodingBuffer_nullInput_doesNothing() {
        ioContext.releaseWriteEncodingBuffer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseWriteEncodingBuffer_wrongBuffer_throwsIllegalArgumentException() {
        ioContext.allocWriteEncodingBuffer();
        byte[] wrongBuffer = new byte[10];
        ioContext.releaseWriteEncodingBuffer(wrongBuffer);
    }

    @Test
    public void testReleaseWriteEncodingBuffer_largerBufferUpgrade_success() {
        byte[] original = ioContext.allocWriteEncodingBuffer();
        byte[] larger = new byte[original.length + 100];
        ioContext.releaseWriteEncodingBuffer(larger);
    }

    @Test
    public void testAllocAndReleaseBase64Buffer_defaultSize_success() {
        byte[] buf = ioContext.allocBase64Buffer();
        Assert.assertNotNull(buf);

        ioContext.releaseBase64Buffer(buf);

        byte[] buf2 = ioContext.allocBase64Buffer();
        Assert.assertNotNull(buf2);
        ioContext.releaseBase64Buffer(buf2);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocBase64Buffer_calledTwiceWithoutRelease_throwsIllegalStateException() {
        ioContext.allocBase64Buffer();
        ioContext.allocBase64Buffer();
    }

    @Test
    public void testReleaseBase64Buffer_nullInput_doesNothing() {
        ioContext.releaseBase64Buffer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseBase64Buffer_wrongBuffer_throwsIllegalArgumentException() {
        ioContext.allocBase64Buffer();
        byte[] wrongBuffer = new byte[10];
        ioContext.releaseBase64Buffer(wrongBuffer);
    }

    @Test
    public void testReleaseBase64Buffer_largerBufferUpgrade_success() {
        byte[] original = ioContext.allocBase64Buffer();
        byte[] larger = new byte[original.length + 50];
        ioContext.releaseBase64Buffer(larger);
    }

    @Test
    public void testAllocAndReleaseTokenBuffer_defaultSize_success() {
        char[] buf = ioContext.allocTokenBuffer();
        Assert.assertNotNull(buf);

        ioContext.releaseTokenBuffer(buf);

        char[] buf2 = ioContext.allocTokenBuffer();
        Assert.assertNotNull(buf2);
        ioContext.releaseTokenBuffer(buf2);
    }

    @Test
    public void testAllocAndReleaseTokenBuffer_withMinSize_success() {
        char[] buf = ioContext.allocTokenBuffer(300);
        Assert.assertNotNull(buf);
        Assert.assertTrue(buf.length >= 300);

        ioContext.releaseTokenBuffer(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocTokenBuffer_calledTwiceWithoutRelease_throwsIllegalStateException() {
        ioContext.allocTokenBuffer();
        ioContext.allocTokenBuffer();
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocTokenBuffer_withMinSizeCalledTwiceWithoutRelease_throwsIllegalStateException() {
        ioContext.allocTokenBuffer(100);
        ioContext.allocTokenBuffer(100);
    }

    @Test
    public void testReleaseTokenBuffer_nullInput_doesNothing() {
        ioContext.releaseTokenBuffer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseTokenBuffer_wrongBuffer_throwsIllegalArgumentException() {
        ioContext.allocTokenBuffer();
        char[] wrongBuffer = new char[10];
        ioContext.releaseTokenBuffer(wrongBuffer);
    }

    @Test
    public void testReleaseTokenBuffer_largerBufferUpgrade_success() {
        char[] original = ioContext.allocTokenBuffer();
        char[] larger = new char[original.length + 100];
        ioContext.releaseTokenBuffer(larger);
    }

    @Test
    public void testAllocAndReleaseConcatBuffer_defaultSize_success() {
        char[] buf = ioContext.allocConcatBuffer();
        Assert.assertNotNull(buf);

        ioContext.releaseConcatBuffer(buf);

        char[] buf2 = ioContext.allocConcatBuffer();
        Assert.assertNotNull(buf2);
        ioContext.releaseConcatBuffer(buf2);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocConcatBuffer_calledTwiceWithoutRelease_throwsIllegalStateException() {
        ioContext.allocConcatBuffer();
        ioContext.allocConcatBuffer();
    }

    @Test
    public void testReleaseConcatBuffer_nullInput_doesNothing() {
        ioContext.releaseConcatBuffer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseConcatBuffer_wrongBuffer_throwsIllegalArgumentException() {
        ioContext.allocConcatBuffer();
        char[] wrongBuffer = new char[10];
        ioContext.releaseConcatBuffer(wrongBuffer);
    }

    @Test
    public void testReleaseConcatBuffer_largerBufferUpgrade_success() {
        char[] original = ioContext.allocConcatBuffer();
        char[] larger = new char[original.length + 100];
        ioContext.releaseConcatBuffer(larger);
    }

    @Test
    public void testAllocAndReleaseNameCopyBuffer_withMinSize_success() {
        char[] buf = ioContext.allocNameCopyBuffer(150);
        Assert.assertNotNull(buf);
        Assert.assertTrue(buf.length >= 150);

        ioContext.releaseNameCopyBuffer(buf);

        char[] buf2 = ioContext.allocNameCopyBuffer(150);
        Assert.assertNotNull(buf2);
        ioContext.releaseNameCopyBuffer(buf2);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocNameCopyBuffer_calledTwiceWithoutRelease_throwsIllegalStateException() {
        ioContext.allocNameCopyBuffer(50);
        ioContext.allocNameCopyBuffer(50);
    }

    @Test
    public void testReleaseNameCopyBuffer_nullInput_doesNothing() {
        ioContext.releaseNameCopyBuffer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseNameCopyBuffer_wrongBuffer_throwsIllegalArgumentException() {
        ioContext.allocNameCopyBuffer(50);
        char[] wrongBuffer = new char[10];
        ioContext.releaseNameCopyBuffer(wrongBuffer);
    }

    @Test
    public void testReleaseNameCopyBuffer_largerBufferUpgrade_success() {
        char[] original = ioContext.allocNameCopyBuffer(50);
        char[] larger = new char[original.length + 100];
        ioContext.releaseNameCopyBuffer(larger);
    }

    @Test
    public void testAllocBuffer_zeroAndNegativeMinSize_success() {
        byte[] readBuf = ioContext.allocReadIOBuffer(0);
        Assert.assertNotNull(readBuf);
        ioContext.releaseReadIOBuffer(readBuf);

        byte[] writeBuf = ioContext.allocWriteEncodingBuffer(-1);
        Assert.assertNotNull(writeBuf);
        ioContext.releaseWriteEncodingBuffer(writeBuf);

        char[] tokenBuf = ioContext.allocTokenBuffer(0);
        Assert.assertNotNull(tokenBuf);
        ioContext.releaseTokenBuffer(tokenBuf);

        char[] nameBuf = ioContext.allocNameCopyBuffer(-5);
        Assert.assertNotNull(nameBuf);
        ioContext.releaseNameCopyBuffer(nameBuf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifyRelease_sameLengthDifferentByteArray_throwsIllegalArgumentException() {
        byte[] original = ioContext.allocReadIOBuffer();
        byte[] differentSameSize = new byte[original.length];
        ioContext.releaseReadIOBuffer(differentSameSize);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifyRelease_sameLengthDifferentCharArray_throwsIllegalArgumentException() {
        char[] original = ioContext.allocTokenBuffer();
        char[] differentSameSize = new char[original.length];
        ioContext.releaseTokenBuffer(differentSameSize);
    }

    @Test(expected = NullPointerException.class)
    public void testVerifyRelease_whenSrcIsNullAndToReleaseNotNull_throwsNullPointerException() {
        ioContext._verifyRelease(new byte[10], (byte[]) null);
    }

    @Test(expected = NullPointerException.class)
    public void testVerifyReleaseChar_whenSrcIsNullAndToReleaseNotNull_throwsNullPointerException() {
        ioContext._verifyRelease(new char[10], (char[]) null);
    }
}
