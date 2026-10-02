package org.apache.commons.compress.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class BitInputStreamTest {

    @Test(expected = IllegalArgumentException.class)
    public void testReadBits_negativeCount_throwsIllegalArgumentException() throws IOException {
        final ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{0x01});
        try (BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN)) {
            bis.readBits(-1);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadBits_countGreaterThan63_throwsIllegalArgumentException() throws IOException {
        final ByteArrayInputStream in = new ByteArrayInputStream(new byte[10]);
        try (BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN)) {
            bis.readBits(64);
        }
    }

    @Test
    public void testReadBits_countZero_returnsZero() throws IOException {
        final ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{0x01});
        try (BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN)) {
            Assert.assertEquals(0L, bis.readBits(0));
        }
    }

    @Test
    public void testReadBits_emptyStream_returnsMinusOne() throws IOException {
        final ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        try (BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN)) {
            Assert.assertEquals(-1L, bis.readBits(1));
        }
    }

    @Test
    public void testReadBits_notEnoughBitsInStream_returnsMinusOne() throws IOException {
        final ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{0x01});
        try (BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN)) {
            Assert.assertEquals(1L, bis.readBits(8));
            Assert.assertEquals(-1L, bis.readBits(1));
        }
    }

    @Test
    public void testReadBits_littleEndian_readsCorrectBits() throws IOException {
        // 0b00101101 = 0x2D (45), 0b00000001 = 0x01 (1)
        final ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{(byte) 0x2D, 0x01});
        try (BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN)) {
            // Read first 3 bits of 0b00101101 -> 0b101 = 5
            Assert.assertEquals(5L, bis.readBits(3));
            // Read next 5 bits of 0b00101101 -> 0b00101 = 5
            Assert.assertEquals(5L, bis.readBits(5));
            // Read next 8 bits of 0b00000001 -> 1
            Assert.assertEquals(1L, bis.readBits(8));
            // EOF
            Assert.assertEquals(-1L, bis.readBits(1));
        }
    }

    @Test
    public void testReadBits_bigEndian_readsCorrectBits() throws IOException {
        // 0b11010010 = 0xD2, 0b10000000 = 0x80
        final ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{(byte) 0xD2, (byte) 0x80});
        try (BitInputStream bis = new BitInputStream(in, ByteOrder.BIG_ENDIAN)) {
            // Read first 3 bits of 0b11010010 -> 0b110 = 6
            Assert.assertEquals(6L, bis.readBits(3));
            // Read next 5 bits of 0b11010010 -> 0b10010 = 18
            Assert.assertEquals(18L, bis.readBits(5));
            // Read next 1 bit of 0b10000000 -> 0b1 = 1
            Assert.assertEquals(1L, bis.readBits(1));
            // Read remaining 7 bits of 0b10000000 -> 0
            Assert.assertEquals(0L, bis.readBits(7));
            // EOF
            Assert.assertEquals(-1L, bis.readBits(1));
        }
    }

    @Test
    public void testReadBits_littleEndianMax63Bits_success() throws IOException {
        final byte[] bytes = new byte[]{
                (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
                (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF
        };
        final ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        try (BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN)) {
            final long result = bis.readBits(63);
            Assert.assertEquals(0x7FFFFFFFFFFFFFFFL, result);
            // 1 bit left in cache
            Assert.assertEquals(1L, bis.readBits(1));
            Assert.assertEquals(-1L, bis.readBits(1));
        }
    }

    @Test
    public void testReadBits_bigEndianMax63Bits_success() throws IOException {
        final byte[] bytes = new byte[]{
                (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
                (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF
        };
        final ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        try (BitInputStream bis = new BitInputStream(in, ByteOrder.BIG_ENDIAN)) {
            final long result = bis.readBits(63);
            Assert.assertEquals(0x7FFFFFFFFFFFFFFFL, result);
            // 1 bit left in cache
            Assert.assertEquals(1L, bis.readBits(1));
            Assert.assertEquals(-1L, bis.readBits(1));
        }
    }

    @Test
    public void testClearBitCache_clearsRemainingBits() throws IOException {
        final byte[] bytes = new byte[]{(byte) 0xFF, (byte) 0xAA};
        final ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        try (BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN)) {
            // Reads 4 bits, 4 bits remain cached from the first byte
            Assert.assertEquals(0x0FL, bis.readBits(4));
            bis.clearBitCache();
            // Should read directly from the second byte (0xAA = 0b10101010)
            Assert.assertEquals(0x0AL, bis.readBits(4));
        }
    }

    @Test
    public void testClose_closesUnderlyingStream() throws IOException {
        final boolean[] closed = new boolean[]{false};
        final InputStream in = new InputStream() {
            @Override
            public int read() {
                return 0;
            }

            @Override
            public void close() {
                closed[0] = true;
            }
        };

        final BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN);
        bis.close();
        Assert.assertTrue("Underlying stream should be closed", closed[0]);
    }
}
