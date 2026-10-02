import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.compress.utils.BitInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class BitInputStreamTest {

    // ---------- Helper: InputStream that always throws IOException on read ----------
    private static class ThrowingReadInputStream extends InputStream {
        @Override
        public int read() throws IOException {
            throw new IOException("simulated read failure");
        }
    }

    // ---------- Helper: InputStream that throws IOException on close ----------
    private static class ThrowingCloseInputStream extends ByteArrayInputStream {
        ThrowingCloseInputStream(byte[] buf) {
            super(buf);
        }
        @Override
        public void close() throws IOException {
            throw new IOException("simulated close failure");
        }
    }

    // ================= Constructor =================

    @Test
    public void testConstructor_validArguments_createsInstance() {
        BitInputStream bis = new BitInputStream(new ByteArrayInputStream(new byte[]{0x01}), ByteOrder.LITTLE_ENDIAN);
        assertNotNull(bis);
    }

    // ================= close() =================

    @Test
    public void testClose_normalStream_noExceptionThrown() throws IOException {
        BitInputStream bis = new BitInputStream(new ByteArrayInputStream(new byte[]{0x01}), ByteOrder.LITTLE_ENDIAN);
        bis.close(); // ByteArrayInputStream.close() is a no-op, should not throw
    }

    @Test(expected = IOException.class)
    public void testClose_streamThrowsIOException_propagatesException() throws IOException {
        BitInputStream bis = new BitInputStream(new ThrowingCloseInputStream(new byte[]{0x01}), ByteOrder.LITTLE_ENDIAN);
        bis.close();
    }

    // ================= clearBitCache() =================

    @Test
    public void testClearBitCache_afterPartialRead_discardsCachedBits() throws IOException {
        // byte0 = 0xAB (10101011), byte1 = 0xCD (11001101)
        byte[] data = new byte[]{(byte) 0xAB, (byte) 0xCD};
        BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN);

        long firstFour = bis.readBits(4);
        assertEquals(0xB, firstFour); // low 4 bits of 0xAB = 1011 = 11

        bis.clearBitCache(); // discard remaining cached 4 bits from byte0

        long nextFour = bis.readBits(4);
        // Since cache was cleared, must read a fresh byte (byte1 = 0xCD)
        assertEquals(0xD, nextFour); // low 4 bits of 0xCD = 1101 = 13
    }

    // ================= readBits() - normal cases =================

    @Test
    public void testReadBits_littleEndianFullByte_returnsCorrectValue() throws IOException {
        byte[] data = new byte[]{(byte) 0xFF};
        BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN);
        assertEquals(255, bis.readBits(8));
    }

    @Test
    public void testReadBits_bigEndianFullByte_returnsCorrectValue() throws IOException {
        byte[] data = new byte[]{(byte) 0xFF};
        BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN);
        assertEquals(255, bis.readBits(8));
    }

    @Test
    public void testReadBits_littleEndianMultipleReadsFromSingleByte_returnsExpectedOrder() throws IOException {
        // 0xB4 = 10110100
        byte[] data = new byte[]{(byte) 0xB4};
        BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN);

        long low4 = bis.readBits(4);
        assertEquals(4, low4); // 0100

        long high4 = bis.readBits(4);
        assertEquals(11, high4); // 1011
    }

    @Test
    public void testReadBits_bigEndianMultipleReadsFromSingleByte_returnsExpectedOrder() throws IOException {
        // 0xB4 = 10110100
        byte[] data = new byte[]{(byte) 0xB4};
        BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN);

        long high4 = bis.readBits(4);
        assertEquals(11, high4); // 1011 (most significant nibble first)

        long low4 = bis.readBits(4);
        assertEquals(4, low4); // 0100
    }

    @Test
    public void testReadBits_littleEndianAcrossMultipleBytes_returnsCorrectValue() throws IOException {
        // two bytes: 0x01, 0x02 -> reading 16 bits little endian should give 0x0201
        byte[] data = new byte[]{0x01, 0x02};
        BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN);
        long value = bis.readBits(16);
        assertEquals(0x0201, value);
    }

    @Test
    public void testReadBits_bigEndianAcrossMultipleBytes_returnsCorrectValue() throws IOException {
        // two bytes: 0x01, 0x02 -> reading 16 bits big endian should give 0x0102
        byte[] data = new byte[]{0x01, 0x02};
        BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN);
        long value = bis.readBits(16);
        assertEquals(0x0102, value);
    }

    // ================= readBits() - boundary cases =================

    @Test
    public void testReadBits_countZero_returnsZero() throws IOException {
        byte[] data = new byte[]{(byte) 0xFF};
        BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN);
        long value = bis.readBits(0);
        assertEquals(0, value);
    }

    @Test
    public void testReadBits_countMaximum63LittleEndian_returnsExpectedValue() throws IOException {
        byte[] data = new byte[]{(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
                                  (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
        BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN);
        long value = bis.readBits(63);
        assertEquals(Long.MAX_VALUE, value);
    }

    @Test
    public void testReadBits_countMaximum63BigEndian_returnsExpectedValue() throws IOException {
        byte[] data = new byte[]{(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
                                  (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
        BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN);
        long value = bis.readBits(63);
        assertEquals(Long.MAX_VALUE, value);
    }

    // ================= readBits() - end of stream cases =================

    @Test
    public void testReadBits_emptyStream_returnsMinusOne() throws IOException {
        byte[] data = new byte[]{};
        BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN);
        long value = bis.readBits(8);
        assertEquals(-1, value);
    }

    @Test
    public void testReadBits_insufficientDataForRequestedBits_returnsMinusOne() throws IOException {
        // Only 1 byte available but 16 bits requested
        byte[] data = new byte[]{(byte) 0xFF};
        BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN);
        long value = bis.readBits(16);
        assertEquals(-1, value);
    }

    // ================= readBits() - exception cases =================

    @Test(expected = IllegalArgumentException.class)
    public void testReadBits_negativeCount_throwsIllegalArgumentException() throws IOException {
        BitInputStream bis = new BitInputStream(new ByteArrayInputStream(new byte[]{0x01}), ByteOrder.LITTLE_ENDIAN);
        bis.readBits(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadBits_countGreaterThanMaximum_throwsIllegalArgumentException() throws IOException {
        BitInputStream bis = new BitInputStream(new ByteArrayInputStream(new byte[]{0x01}), ByteOrder.LITTLE_ENDIAN);
        bis.readBits(64);
    }

    @Test(expected = IOException.class)
    public void testReadBits_streamThrowsIOException_propagatesException() throws IOException {
        BitInputStream bis = new BitInputStream(new ThrowingReadInputStream(), ByteOrder.LITTLE_ENDIAN);
        bis.readBits(8);
    }
}
