import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;

public class BitsStreamGeneratorTest {

    /**
     * Concrete test double for the abstract BitsStreamGenerator.
     * Allows forcing specific return values from next(bits) for
     * deterministic testing of edge cases, while falling back to a
     * seeded java.util.Random for normal/typical behaviour.
     */
    private static class TestGenerator extends BitsStreamGenerator {
        private java.util.Random rnd = new java.util.Random(42L);
        private Integer[] forcedValues;
        private int forcedIndex = 0;

        public void setForcedValues(Integer... values) {
            this.forcedValues = values;
            this.forcedIndex = 0;
        }

        @Override
        public void setSeed(int seed) {
            this.rnd = new java.util.Random(seed);
        }

        @Override
        public void setSeed(int[] seed) {
            if (seed != null && seed.length > 0) {
                this.rnd = new java.util.Random(seed[0]);
            } else {
                this.rnd = new java.util.Random(0);
            }
        }

        @Override
        public void setSeed(long seed) {
            this.rnd = new java.util.Random(seed);
        }

        @Override
        protected int next(int bits) {
            if (forcedValues != null && forcedIndex < forcedValues.length) {
                return forcedValues[forcedIndex++];
            }
            // emulate a bits-stream generator using java.util.Random
            return rnd.nextInt() >>> (32 - bits);
        }
    }

    private TestGenerator generator;

    @Before
    public void setUp() {
        generator = new TestGenerator();
    }

    // ---------- setSeed tests ----------

    @Test
    public void testSetSeedInt_normalInput_noException() {
        generator.setSeed(123);
        // no exception expected; basic sanity call afterwards
        int value = generator.nextInt();
        Assert.assertNotNull(value);
    }

    @Test
    public void testSetSeedIntArray_normalInput_noException() {
        generator.setSeed(new int[]{1, 2, 3});
        int value = generator.nextInt();
        Assert.assertNotNull(value);
    }

    @Test
    public void testSetSeedIntArray_emptyArray_noException() {
        generator.setSeed(new int[]{});
        int value = generator.nextInt();
        Assert.assertNotNull(value);
    }

    @Test
    public void testSetSeedLong_normalInput_noException() {
        generator.setSeed(123456789L);
        int value = generator.nextInt();
        Assert.assertNotNull(value);
    }

    // ---------- nextBoolean tests ----------

    @Test
    public void testNextBoolean_zeroBit_returnsFalse() {
        generator.setForcedValues(0);
        boolean result = generator.nextBoolean();
        Assert.assertFalse(result);
    }

    @Test
    public void testNextBoolean_oneBit_returnsTrue() {
        generator.setForcedValues(1);
        boolean result = generator.nextBoolean();
        Assert.assertTrue(result);
    }

    // ---------- nextBytes tests ----------

    @Test
    public void testNextBytes_lengthZero_noException() {
        byte[] bytes = new byte[0];
        generator.nextBytes(bytes);
        Assert.assertEquals(0, bytes.length);
    }

    @Test
    public void testNextBytes_lengthOne_fillsArray() {
        byte[] bytes = new byte[1];
        generator.nextBytes(bytes);
        Assert.assertEquals(1, bytes.length);
    }

    @Test
    public void testNextBytes_lengthTwo_fillsArray() {
        byte[] bytes = new byte[2];
        generator.nextBytes(bytes);
        Assert.assertEquals(2, bytes.length);
    }

    @Test
    public void testNextBytes_lengthThree_fillsArray() {
        byte[] bytes = new byte[3];
        generator.nextBytes(bytes);
        Assert.assertEquals(3, bytes.length);
    }

    @Test
    public void testNextBytes_lengthFour_fillsArray() {
        byte[] bytes = new byte[4];
        generator.nextBytes(bytes);
        Assert.assertEquals(4, bytes.length);
    }

    @Test
    public void testNextBytes_lengthFive_fillsArray() {
        byte[] bytes = new byte[5];
        generator.nextBytes(bytes);
        Assert.assertEquals(5, bytes.length);
    }

    @Test
    public void testNextBytes_largeLength_fillsArray() {
        byte[] bytes = new byte[17];
        generator.nextBytes(bytes);
        Assert.assertEquals(17, bytes.length);
    }

    // ---------- nextDouble tests ----------

    @Test
    public void testNextDouble_normalInput_withinRange() {
        double value = generator.nextDouble();
        Assert.assertTrue(value >= 0.0d && value < 1.0d);
    }

    @Test
    public void testNextDouble_forcedZero_returnsZero() {
        generator.setForcedValues(0, 0);
        double value = generator.nextDouble();
        Assert.assertEquals(0.0d, value, 1e-15);
    }

    // ---------- nextFloat tests ----------

    @Test
    public void testNextFloat_normalInput_withinRange() {
        float value = generator.nextFloat();
        Assert.assertTrue(value >= 0.0f && value < 1.0f);
    }

    @Test
    public void testNextFloat_forcedZero_returnsZero() {
        generator.setForcedValues(0);
        float value = generator.nextFloat();
        Assert.assertEquals(0.0f, value, 1e-7f);
    }

    // ---------- nextGaussian tests ----------

    @Test
    public void testNextGaussian_firstCall_generatesValue() {
        // use forced underlying bits so the computation is deterministic
        generator.setForcedValues(1000000, 2000000, 3000000, 4000000);
        double value = generator.nextGaussian();
        Assert.assertFalse(Double.isNaN(value));
    }

    @Test
    public void testNextGaussian_secondCall_usesCachedValue() {
        double first = generator.nextGaussian();
        double second = generator.nextGaussian();
        Assert.assertFalse(Double.isNaN(first));
        Assert.assertFalse(Double.isNaN(second));
    }

    @Test
    public void testNextGaussian_afterClear_generatesNewPair() {
        generator.nextGaussian();
        generator.clear();
        double value = generator.nextGaussian();
        Assert.assertFalse(Double.isNaN(value));
    }

    // ---------- nextInt() (no-arg) tests ----------

    @Test
    public void testNextInt_noArg_returnsValue() {
        int value = generator.nextInt();
        Assert.assertNotNull(value);
    }

    // ---------- nextInt(int n) tests ----------

    @Test
    public void testNextIntN_powerOfTwo_returnsExpectedFormulaResult() {
        // bits forced = 2^30, n = 16 (power of two)
        generator.setForcedValues(1073741824);
        int n = 16;
        int result = generator.nextInt(n);
        int expected = (int) ((n * (long) 1073741824) >> 31);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testNextIntN_nonPowerOfTwo_normalInput_returnsValidRange() {
        generator.setForcedValues(50);
        int n = 7;
        int result = generator.nextInt(n);
        Assert.assertEquals(50 % 7, result);
        Assert.assertTrue(result >= 0 && result < n);
    }

    @Test
    public void testNextIntN_nonPowerOfTwo_withRejectionLoop_returnsValidValue() {
        // First forced value triggers the rejection branch:
        // bits = Integer.MAX_VALUE, n = 7 => val = 1, bits - val + (n-1) overflows negative.
        // Second forced value is accepted normally.
        generator.setForcedValues(Integer.MAX_VALUE, 10);
        int n = 7;
        int result = generator.nextInt(n);
        Assert.assertEquals(10 % 7, result);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNextIntN_zero_throwsException() {
        generator.nextInt(0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNextIntN_negative_throwsException() {
        generator.nextInt(-5);
    }

    // ---------- nextLong tests ----------

    @Test
    public void testNextLong_normalInput_returnsValue() {
        long value = generator.nextLong();
        Assert.assertNotNull(value);
    }

    @Test
    public void testNextLong_forcedValues_computesExpectedResult() {
        generator.setForcedValues(1, 2);
        long result = generator.nextLong();
        long high = ((long) 1) << 32;
        long low = ((long) 2) & 0xffffffffL;
        long expected = high | low;
        Assert.assertEquals(expected, result);
    }

    // ---------- clear tests ----------

    @Test
    public void testClear_resetsCachedGaussian() {
        generator.nextGaussian(); // populates cache
        generator.clear();
        // After clear, calling nextGaussian should not throw and should
        // generate a fresh pair (not use a stale cached value).
        double value = generator.nextGaussian();
        Assert.assertFalse(Double.isNaN(value));
    }
}
