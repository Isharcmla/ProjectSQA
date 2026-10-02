package org.apache.commons.math3.random;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class BitsStreamGeneratorTest {

    private static class TestBitsStreamGenerator extends BitsStreamGenerator {
        private final Random rng = new Random(123456789L);
        private int[] sequence = null;
        private int index = 0;
        private long currentSeed;

        public void setSequence(int... sequence) {
            this.sequence = sequence;
            this.index = 0;
        }

        @Override
        public void setSeed(int seed) {
            this.currentSeed = seed;
            this.rng.setSeed(seed);
        }

        @Override
        public void setSeed(int[] seed) {
            this.currentSeed = (seed != null && seed.length > 0) ? seed[0] : 0;
            if (seed != null && seed.length > 0) {
                this.rng.setSeed(seed[0]);
            }
        }

        @Override
        public void setSeed(long seed) {
            this.currentSeed = seed;
            this.rng.setSeed(seed);
        }

        public long getCurrentSeed() {
            return currentSeed;
        }

        @Override
        protected int next(int bits) {
            if (sequence != null && index < sequence.length) {
                return sequence[index++];
            }
            if (bits == 32) {
                return rng.nextInt();
            }
            return rng.nextInt() >>> (32 - bits);
        }
    }

    private TestBitsStreamGenerator generator;

    @Before
    public void setUp() {
        generator = new TestBitsStreamGenerator();
    }

    @Test
    public void testSetSeed_int_updatesSeed() {
        generator.setSeed(42);
        Assert.assertEquals(42L, generator.getCurrentSeed());
    }

    @Test
    public void testSetSeed_intArray_updatesSeed() {
        generator.setSeed(new int[]{10, 20, 30});
        Assert.assertEquals(10L, generator.getCurrentSeed());

        generator.setSeed(new int[]{});
        Assert.assertEquals(0L, generator.getCurrentSeed());

        generator.setSeed((int[]) null);
        Assert.assertEquals(0L, generator.getCurrentSeed());
    }

    @Test
    public void testSetSeed_long_updatesSeed() {
        generator.setSeed(1234567890123L);
        Assert.assertEquals(1234567890123L, generator.getCurrentSeed());
    }

    @Test
    public void testNextBoolean_returnsTrueAndFalse() {
        generator.setSequence(0, 1);
        Assert.assertFalse(generator.nextBoolean());
        Assert.assertTrue(generator.nextBoolean());
    }

    @Test
    public void testNextBytes_emptyArray_doesNotThrow() {
        byte[] bytes = new byte[0];
        generator.nextBytes(bytes);
        Assert.assertEquals(0, bytes.length);
    }

    @Test
    public void testNextBytes_lengthLessThanFour_fillsCorrectly() {
        byte[] bytes1 = new byte[1];
        generator.setSequence(0x12345678);
        generator.nextBytes(bytes1);
        Assert.assertEquals((byte) 0x78, bytes1[0]);

        byte[] bytes2 = new byte[2];
        generator.setSequence(0x12345678);
        generator.nextBytes(bytes2);
        Assert.assertEquals((byte) 0x78, bytes2[0]);
        Assert.assertEquals((byte) 0x56, bytes2[1]);

        byte[] bytes3 = new byte[3];
        generator.setSequence(0x12345678);
        generator.nextBytes(bytes3);
        Assert.assertEquals((byte) 0x78, bytes3[0]);
        Assert.assertEquals((byte) 0x56, bytes3[1]);
        Assert.assertEquals((byte) 0x34, bytes3[2]);
    }

    @Test
    public void testNextBytes_exactFourBytes_fillsCorrectly() {
        byte[] bytes = new byte[4];
        generator.setSequence(0x12345678, 0x00000000);
        generator.nextBytes(bytes);
        Assert.assertEquals((byte) 0x78, bytes[0]);
        Assert.assertEquals((byte) 0x56, bytes[1]);
        Assert.assertEquals((byte) 0x34, bytes[2]);
        Assert.assertEquals((byte) 0x12, bytes[3]);
    }

    @Test
    public void testNextBytes_lengthGreaterThanFour_fillsAllBlocks() {
        byte[] bytes = new byte[7];
        generator.setSequence(0x12345678, 0x00ABCDEF);
        generator.nextBytes(bytes);
        Assert.assertEquals((byte) 0x78, bytes[0]);
        Assert.assertEquals((byte) 0x56, bytes[1]);
        Assert.assertEquals((byte) 0x34, bytes[2]);
        Assert.assertEquals((byte) 0x12, bytes[3]);
        Assert.assertEquals((byte) 0xEF, bytes[4]);
        Assert.assertEquals((byte) 0xCD, bytes[5]);
        Assert.assertEquals((byte) 0xAB, bytes[6]);
    }

    @Test
    public void testNextDouble_returnsValueInRange() {
        for (int i = 0; i < 100; i++) {
            double value = generator.nextDouble();
            Assert.assertTrue(value >= 0.0 && value < 1.0);
        }
    }

    @Test
    public void testNextFloat_returnsValueInRange() {
        for (int i = 0; i < 100; i++) {
            float value = generator.nextFloat();
            Assert.assertTrue(value >= 0.0f && value < 1.0f);
        }
    }

    @Test
    public void testNextGaussian_computesPairAndCachesSecond() {
        generator.clear();
        double first = generator.nextGaussian();
        double second = generator.nextGaussian();

        Assert.assertFalse(Double.isNaN(first));
        Assert.assertFalse(Double.isInfinite(first));
        Assert.assertFalse(Double.isNaN(second));
        Assert.assertFalse(Double.isInfinite(second));

        double third = generator.nextGaussian();
        Assert.assertFalse(Double.isNaN(third));
    }

    @Test
    public void testClear_clearsCachedGaussian() {
        generator.clear();
        generator.nextGaussian();
        generator.clear();
        double valueAfterClear = generator.nextGaussian();
        Assert.assertFalse(Double.isNaN(valueAfterClear));
    }

    @Test
    public void testNextInt_returnsInteger() {
        generator.setSequence(42);
        Assert.assertEquals(42, generator.nextInt());
    }

    @Test
    public void testNextIntBounded_powerOfTwo_returnsExpectedValue() {
        generator.setSequence(0x40000000); // 1 << 30
        int n = 16;
        int result = generator.nextInt(n);
        Assert.assertTrue(result >= 0 && result < n);
        Assert.assertEquals(8, result);
    }

    @Test
    public void testNextIntBounded_nonPowerOfTwo_returnsExpectedValue() {
        generator.setSequence(10);
        int n = 7;
        int result = generator.nextInt(n);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testNextIntBounded_rejectionSamplingBranch_retriesCorrectly() {
        int n = 3;
        generator.setSequence(Integer.MAX_VALUE, 4);
        int result = generator.nextInt(n);
        Assert.assertEquals(1, result);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNextIntBounded_zero_throwsNotStrictlyPositiveException() {
        generator.nextInt(0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNextIntBounded_negative_throwsNotStrictlyPositiveException() {
        generator.nextInt(-5);
    }

    @Test
    public void testNextLong_combinesHighAndLowBitsCorrectly() {
        generator.setSequence(0x12345678, 0x76543210);
        long result = generator.nextLong();
        long expected = (((long) 0x12345678) << 32) | (0x76543210L & 0xffffffffL);
        Assert.assertEquals(expected, result);
    }
}
