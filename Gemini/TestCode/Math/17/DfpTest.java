package org.apache.commons.math3.dfp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DfpTest {

    private DfpField factory;
    private DfpField factory2;

    @Before
    public void setUp() {
        factory = new DfpField(6);
        factory2 = new DfpField(10);
    }

    @Test
    public void testConstructorsAndFactories_allVariants_success() {
        Dfp zero = factory.newDfp();
        Assert.assertTrue(zero.isZero());

        Dfp fromByte = factory.newDfp((byte) 12);
        Assert.assertEquals(12, fromByte.intValue());

        Dfp fromInt = factory.newDfp(12345);
        Assert.assertEquals(12345, fromInt.intValue());

        Dfp fromLong = factory.newDfp(123456789L);
        Assert.assertEquals(123456789, fromLong.intValue());

        Dfp fromLongMin = factory.newDfp(Long.MIN_VALUE);
        Assert.assertEquals(-1, fromLongMin.sign);

        Dfp fromDoublePos = factory.newDfp(12.34);
        Assert.assertEquals(12.34, fromDoublePos.toDouble(), 1e-5);

        Dfp fromDoubleNeg = factory.newDfp(-12.34);
        Assert.assertEquals(-12.34, fromDoubleNeg.toDouble(), 1e-5);

        Dfp fromDoubleZeroPos = factory.newDfp(0.0);
        Assert.assertEquals(1, fromDoubleZeroPos.sign);

        Dfp fromDoubleZeroNeg = factory.newDfp(-0.0);
        Assert.assertEquals(-1, fromDoubleZeroNeg.sign);

        Dfp fromDoubleNaN = factory.newDfp(Double.NaN);
        Assert.assertTrue(fromDoubleNaN.isNaN());

        Dfp fromDoublePosInf = factory.newDfp(Double.POSITIVE_INFINITY);
        Assert.assertTrue(fromDoublePosInf.isInfinite());
        Assert.assertEquals(1, fromDoublePosInf.sign);

        Dfp fromDoubleNegInf = factory.newDfp(Double.NEGATIVE_INFINITY);
        Assert.assertTrue(fromDoubleNegInf.isInfinite());
        Assert.assertEquals(-1, fromDoubleNegInf.sign);

        Dfp fromDoubleSubnormal = factory.newDfp(Double.MIN_VALUE);
        Assert.assertEquals(Double.MIN_VALUE, fromDoubleSubnormal.toDouble(), 1e-324);

        Dfp copy = new Dfp(fromDoublePos);
        Assert.assertEquals(fromDoublePos, copy);

        Dfp fromStringPosInf = factory.newDfp("Infinity");
        Assert.assertTrue(fromStringPosInf.isInfinite());
        Assert.assertEquals(1, fromStringPosInf.sign);

        Dfp fromStringNegInf = factory.newDfp("-Infinity");
        Assert.assertTrue(fromStringNegInf.isInfinite());
        Assert.assertEquals(-1, fromStringNegInf.sign);

        Dfp fromStringNaN = factory.newDfp("NaN");
        Assert.assertTrue(fromStringNaN.isNaN());

        Dfp fromStringSci = factory.newDfp("1.23e4");
        Assert.assertEquals(12300, fromStringSci.intValue());

        Dfp fromStringSciNeg = factory.newDfp("1.23E-2");
        Assert.assertEquals(0.0123, fromStringSciNeg.toDouble(), 1e-5);

        Dfp fromStringZeros = factory.newDfp("0.00000");
        Assert.assertTrue(fromStringZeros.isZero());

        Dfp nonFiniteInstance = factory.newDfp((byte) 1, Dfp.SNAN);
        Assert.assertEquals(Dfp.SNAN, nonFiniteInstance.classify());

        Dfp inst0 = zero.newInstance();
        Dfp instByte = zero.newInstance((byte) 5);
        Dfp instInt = zero.newInstance(500);
        Dfp instLong = zero.newInstance(50000L);
        Dfp instDouble = zero.newInstance(5.5);
        Dfp instCopy = zero.newInstance(fromInt);
        Dfp instStr = zero.newInstance("5.55");
        Dfp instNonFinite = zero.newInstance((byte) -1, Dfp.INFINITE);

        Assert.assertNotNull(inst0);
        Assert.assertEquals(5, instByte.intValue());
        Assert.assertEquals(500, instInt.intValue());
        Assert.assertEquals(50000, instLong.intValue());
        Assert.assertEquals(5.5, instDouble.toDouble(), 1e-5);
        Assert.assertEquals(fromInt, instCopy);
        Assert.assertEquals(5.55, instStr.toDouble(), 1e-5);
        Assert.assertTrue(instNonFinite.isInfinite());
    }

    @Test
    public void testNewInstance_differentPrecision_trapsInvalid() {
        Dfp a = factory.newDfp(10);
        Dfp b = factory2.newDfp(10);
        Dfp res = a.newInstance(b);
        Assert.assertTrue(res.isNaN());
    }

    @Test
    public void testGettersAndConstants() {
        Dfp one = factory.getOne();
        Dfp two = factory.getTwo();
        Dfp zero = factory.getZero();

        Assert.assertEquals(factory, one.getField());
        Assert.assertEquals(6, one.getRadixDigits());
        Assert.assertEquals(1, one.intValue());
        Assert.assertEquals(2, two.intValue());
        Assert.assertEquals(0, zero.intValue());
    }

    @Test
    public void testShiftAndAlign() {
        Dfp a = factory.newDfp("1234.5678");
        a.shiftLeft();
        a.shiftRight();

        Dfp b = factory.newDfp("1234.5678");
        int lost = b.align(b.exp - 2);
        Assert.assertTrue(lost >= 0);

        Dfp c = factory.newDfp("1234.5678");
        int lostZero = c.align(c.exp);
        Assert.assertEquals(0, lostZero);

        Dfp d = factory.newDfp("1234.5678");
        int lostLarge = d.align(d.exp + 10);
        Assert.assertEquals(0, lostLarge);

        Dfp e = factory.newDfp("1234.5678");
        e.align(e.exp - 4);
    }

    @Test
    public void testComparisons_andPredicates() {
        Dfp a = factory.newDfp(10);
        Dfp b = factory.newDfp(20);
        Dfp c = factory.newDfp(-10);
        Dfp zero = factory.getZero();
        Dfp nan = factory.newDfp((byte) 1, Dfp.QNAN);
        Dfp diffPrecision = factory2.newDfp(10);

        Assert.assertTrue(a.lessThan(b));
        Assert.assertFalse(b.lessThan(a));
        Assert.assertFalse(a.lessThan(nan));
        Assert.assertFalse(a.lessThan(diffPrecision));

        Assert.assertTrue(b.greaterThan(a));
        Assert.assertFalse(a.greaterThan(b));
        Assert.assertFalse(a.greaterThan(nan));
        Assert.assertFalse(a.greaterThan(diffPrecision));

        Assert.assertTrue(c.negativeOrNull());
        Assert.assertTrue(zero.negativeOrNull());
        Assert.assertFalse(a.negativeOrNull());
        Assert.assertFalse(nan.negativeOrNull());

        Assert.assertTrue(c.strictlyNegative());
        Assert.assertFalse(zero.strictlyNegative());
        Assert.assertFalse(a.strictlyNegative());
        Assert.assertFalse(nan.strictlyNegative());

        Assert.assertTrue(a.positiveOrNull());
        Assert.assertTrue(zero.positiveOrNull());
        Assert.assertFalse(c.positiveOrNull());
        Assert.assertFalse(nan.positiveOrNull());

        Assert.assertTrue(a.strictlyPositive());
        Assert.assertFalse(zero.strictlyPositive());
        Assert.assertFalse(c.strictlyPositive());
        Assert.assertFalse(nan.strictlyPositive());

        Assert.assertTrue(zero.isZero());
        Assert.assertFalse(a.isZero());
        Assert.assertFalse(nan.isZero());

        Assert.assertEquals(10, c.abs().intValue());

        Assert.assertTrue(a.equals(factory.newDfp(10)));
        Assert.assertFalse(a.equals(b));
        Assert.assertFalse(a.equals(nan));
        Assert.assertFalse(a.equals(diffPrecision));
        Assert.assertFalse(a.equals("not a dfp"));

        Assert.assertTrue(a.unequal(b));
        Assert.assertFalse(a.unequal(factory.newDfp(10)));
        Assert.assertFalse(a.unequal(nan));
        Assert.assertFalse(a.unequal(diffPrecision));

        Assert.assertEquals(a.hashCode(), factory.newDfp(10).hashCode());
    }

    @Test
    public void testRoundingAndTrunc() {
        Dfp val = factory.newDfp("12.3456");
        Assert.assertEquals(12, val.rint().intValue());
        Assert.assertEquals(12, val.floor().intValue());
        Assert.assertEquals(13, val.ceil().intValue());

        Dfp negVal = factory.newDfp("-12.3456");
        Assert.assertEquals(-12, negVal.rint().intValue());
        Assert.assertEquals(-13, negVal.floor().intValue());
        Assert.assertEquals(-12, negVal.ceil().intValue());

        Dfp halfEven1 = factory.newDfp("2.5").rint();
        Dfp halfEven2 = factory.newDfp("3.5").rint();
        Assert.assertEquals(2, halfEven1.intValue());
        Assert.assertEquals(4, halfEven2.intValue());

        Dfp nan = factory.newDfp((byte) 1, Dfp.QNAN);
        Assert.assertTrue(nan.rint().isNaN());

        Dfp inf = factory.newDfp((byte) 1, Dfp.INFINITE);
        Assert.assertTrue(inf.rint().isInfinite());

        Dfp zero = factory.getZero();
        Assert.assertTrue(zero.rint().isZero());

        Dfp small = factory.newDfp("0.00000000000001");
        Assert.assertTrue(small.rint().isZero());

        Dfp huge = factory.newDfp("123456789012345678901234567890");
        Assert.assertEquals(huge, huge.rint());

        Dfp rem = factory.newDfp("5.5").remainder(factory.newDfp("2.0"));
        Assert.assertEquals(-0.5, rem.toDouble(), 1e-5);
    }

    @Test
    public void testIntValue_limits() {
        Dfp max = factory.newDfp(3000000000.0);
        Assert.assertEquals(Integer.MAX_VALUE, max.intValue());

        Dfp min = factory.newDfp(-3000000000.0);
        Assert.assertEquals(Integer.MIN_VALUE, min.intValue());

        Dfp normal = factory.newDfp(-1234);
        Assert.assertEquals(-1234, normal.intValue());
    }

    @Test
    public void testLogAndPower() {
        Dfp a = factory.newDfp("1000000");
        Assert.assertEquals(1, a.log10K());
        Assert.assertEquals(6, a.log10());

        Dfp b = factory.newDfp("50");
        Assert.assertEquals(1, b.log10());
        Dfp c = factory.newDfp("500");
        Assert.assertEquals(2, c.log10());
        Dfp d = factory.newDfp("5000");
        Assert.assertEquals(3, d.log10());

        Dfp pow10K = a.power10K(2);
        Assert.assertEquals(100000000.0, pow10K.toDouble(), 1e-5);

        Assert.assertEquals(1.0, a.power10(0).toDouble(), 1e-5);
        Assert.assertEquals(10.0, a.power10(1).toDouble(), 1e-5);
        Assert.assertEquals(100.0, a.power10(2).toDouble(), 1e-5);
        Assert.assertEquals(1000.0, a.power10(3).toDouble(), 1e-5);
        Assert.assertEquals(0.1, a.power10(-1).toDouble(), 1e-5);
        Assert.assertEquals(0.01, a.power10(-2).toDouble(), 1e-5);
        Assert.assertEquals(0.001, a.power10(-3).toDouble(), 1e-5);
    }

    @Test
    public void testAddAndSubtract_specialCases() {
        Dfp a = factory.newDfp(10);
        Dfp b = factory.newDfp(20);
        Assert.assertEquals(30, a.add(b).intValue());
        Assert.assertEquals(-10, a.subtract(b).intValue());

        Dfp diff = factory2.newDfp(10);
        Assert.assertTrue(a.add(diff).isNaN());

        Dfp nan = factory.newDfp((byte) 1, Dfp.QNAN);
        Assert.assertTrue(a.add(nan).isNaN());
        Assert.assertTrue(nan.add(a).isNaN());

        Dfp posInf = factory.newDfp((byte) 1, Dfp.INFINITE);
        Dfp negInf = factory.newDfp((byte) -1, Dfp.INFINITE);
        Assert.assertTrue(posInf.add(a).isInfinite());
        Assert.assertTrue(a.add(posInf).isInfinite());
        Assert.assertTrue(posInf.add(posInf).isInfinite());
        Assert.assertTrue(posInf.add(negInf).isNaN());

        Dfp zero = factory.getZero();
        Assert.assertEquals(10, a.add(zero).intValue());
        Assert.assertEquals(10, zero.add(a).intValue());

        Dfp negZero1 = factory.newDfp(-0.0);
        Dfp negZero2 = factory.newDfp(-0.0);
        Dfp sumNegZeros = negZero1.add(negZero2);
        Assert.assertTrue(sumNegZeros.isZero());

        Dfp c = factory.newDfp("0.00001");
        Dfp d = factory.newDfp("100000");
        Assert.assertNotNull(c.add(d));
        Assert.assertNotNull(d.add(c));
        Assert.assertNotNull(c.subtract(d));
        Assert.assertNotNull(d.subtract(c));
    }

    @Test
    public void testMultiply_specialCases() {
        Dfp a = factory.newDfp(10);
        Dfp b = factory.newDfp(20);
        Assert.assertEquals(200, a.multiply(b).intValue());
        Assert.assertEquals(50, a.multiply(5).intValue());

        Dfp diff = factory2.newDfp(10);
        Assert.assertTrue(a.multiply(diff).isNaN());

        Dfp nan = factory.newDfp((byte) 1, Dfp.QNAN);
        Assert.assertTrue(a.multiply(nan).isNaN());
        Assert.assertTrue(nan.multiply(a).isNaN());
        Assert.assertTrue(nan.multiply(5).isNaN());

        Dfp posInf = factory.newDfp((byte) 1, Dfp.INFINITE);
        Assert.assertTrue(posInf.multiply(a).isInfinite());
        Assert.assertTrue(a.multiply(posInf).isInfinite());
        Assert.assertTrue(posInf.multiply(posInf).isInfinite());

        Dfp zero = factory.getZero();
        Assert.assertTrue(posInf.multiply(zero).isNaN());
        Assert.assertTrue(zero.multiply(posInf).isNaN());

        Assert.assertTrue(posInf.multiply(2).isInfinite());
        Assert.assertTrue(posInf.multiply(0).isNaN());
        Assert.assertTrue(a.multiply(-1).isNaN());
        Assert.assertTrue(a.multiply(100000).isNaN());
    }

    @Test
    public void testDivide_specialCases() {
        Dfp a = factory.newDfp(100);
        Dfp b = factory.newDfp(20);
        Assert.assertEquals(5, a.divide(b).intValue());
        Assert.assertEquals(20, a.divide(5).intValue());
        Assert.assertEquals(0.1, factory.newDfp(10).reciprocal().toDouble(), 1e-5);

        Dfp diff = factory2.newDfp(10);
        Assert.assertTrue(a.divide(diff).isNaN());

        Dfp nan = factory.newDfp((byte) 1, Dfp.QNAN);
        Assert.assertTrue(a.divide(nan).isNaN());
        Assert.assertTrue(nan.divide(a).isNaN());
        Assert.assertTrue(nan.divide(5).isNaN());

        Dfp posInf = factory.newDfp((byte) 1, Dfp.INFINITE);
        Assert.assertTrue(posInf.divide(a).isInfinite());
        Assert.assertTrue(a.divide(posInf).isZero());
        Assert.assertTrue(posInf.divide(posInf).isNaN());
        Assert.assertTrue(posInf.divide(5).isInfinite());

        Dfp zero = factory.getZero();
        Assert.assertTrue(a.divide(zero).isInfinite());
        Assert.assertTrue(a.divide(0).isInfinite());
        Assert.assertTrue(a.divide(-1).isNaN());
        Assert.assertTrue(a.divide(100000).isNaN());

        Dfp c = factory.newDfp("1.000000000001");
        Dfp d = factory.newDfp("3.0");
        Assert.assertNotNull(c.divide(d));
    }

    @Test
    public void testSqrt_specialCases() {
        Dfp four = factory.newDfp(4);
        Assert.assertEquals(2.0, four.sqrt().toDouble(), 1e-5);

        Dfp zero = factory.getZero();
        Assert.assertTrue(zero.sqrt().isZero());

        Dfp posInf = factory.newDfp((byte) 1, Dfp.INFINITE);
        Assert.assertTrue(posInf.sqrt().isInfinite());

        Dfp qnan = factory.newDfp((byte) 1, Dfp.QNAN);
        Assert.assertTrue(qnan.sqrt().isNaN());

        Dfp snan = factory.newDfp((byte) 1, Dfp.SNAN);
        Assert.assertTrue(snan.sqrt().isNaN());

        Dfp neg = factory.newDfp(-4);
        Assert.assertTrue(neg.sqrt().isNaN());

        Dfp large = factory.newDfp("100000000");
        Assert.assertEquals(10000.0, large.sqrt().toDouble(), 1e-5);

        Dfp small = factory.newDfp("0.00000001");
        Assert.assertEquals(0.0001, small.sqrt().toDouble(), 1e-6);

        Dfp guess2 = factory.newDfp(4500);
        Assert.assertNotNull(guess2.sqrt());
        Dfp guess3 = factory.newDfp(6500);
        Assert.assertNotNull(guess3.sqrt());
        Dfp guessDefault = factory.newDfp(8500);
        Assert.assertNotNull(guessDefault.sqrt());
    }

    @Test
    public void testToString_andFormatting() {
        Dfp nan = factory.newDfp((byte) 1, Dfp.QNAN);
        Assert.assertEquals("NaN", nan.toString());

        Dfp posInf = factory.newDfp((byte) 1, Dfp.INFINITE);
        Assert.assertEquals("Infinity", posInf.toString());

        Dfp negInf = factory.newDfp((byte) -1, Dfp.INFINITE);
        Assert.assertEquals("-Infinity", negInf.toString());

        Dfp zero = factory.getZero();
        Assert.assertEquals("0.", zero.toString());

        Dfp normal = factory.newDfp("12.34");
        Assert.assertEquals("12.34", normal.toString());

        Dfp negNormal = factory.newDfp("-12.34");
        Assert.assertEquals("-12.34", negNormal.toString());

        Dfp sci = factory.newDfp("1.23456789e30");
        String sciStr = sci.toString();
        Assert.assertTrue(sciStr.contains("e"));

        Dfp sciSmall = factory.newDfp("1.23456789e-30");
        String sciSmallStr = sciSmall.toString();
        Assert.assertTrue(sciSmallStr.contains("e-"));
    }

    @Test
    public void testDotrap_andRoundingModes() {
        Dfp a = factory.newDfp(10);
        Dfp resUnderflow = a.dotrap(DfpField.FLAG_UNDERFLOW, "test", a, factory.getZero());
        Assert.assertNotNull(resUnderflow);

        Dfp resOverflow = a.dotrap(DfpField.FLAG_OVERFLOW, "test", a, a);
        Assert.assertTrue(resOverflow.isInfinite());

        Dfp resDivZero = a.dotrap(DfpField.FLAG_DIV_ZERO, "test", factory.getZero(), a);
        Assert.assertTrue(resDivZero.isInfinite());

        Dfp zero = factory.getZero();
        Dfp resDivZero00 = zero.dotrap(DfpField.FLAG_DIV_ZERO, "test", factory.getZero(), zero);
        Assert.assertTrue(resDivZero00.isNaN());

        Dfp nan = factory.newDfp((byte) 1, Dfp.QNAN);
        Dfp resDivZeroNan = nan.dotrap(DfpField.FLAG_DIV_ZERO, "test", factory.getZero(), nan);
        Assert.assertTrue(resDivZeroNan.isNaN());

        DfpField fDown = new DfpField(6, DfpField.RoundingMode.ROUND_DOWN);
        Dfp dDown = fDown.newDfp("1.23456");
        dDown.round(5000);

        DfpField fUp = new DfpField(6, DfpField.RoundingMode.ROUND_UP);
        Dfp dUp = fUp.newDfp("1.23456");
        dUp.round(5000);

        DfpField fHalfUp = new DfpField(6, DfpField.RoundingMode.ROUND_HALF_UP);
        Dfp dHalfUp = fHalfUp.newDfp("1.23456");
        dHalfUp.round(5000);

        DfpField fHalfDown = new DfpField(6, DfpField.RoundingMode.ROUND_HALF_DOWN);
        Dfp dHalfDown = fHalfDown.newDfp("1.23456");
        dHalfDown.round(5000);

        DfpField fHalfOdd = new DfpField(6, DfpField.RoundingMode.ROUND_HALF_ODD);
        Dfp dHalfOdd = fHalfOdd.newDfp("1.23456");
        dHalfOdd.round(5000);

        DfpField fCeil = new DfpField(6, DfpField.RoundingMode.ROUND_CEIL);
        Dfp dCeil = fCeil.newDfp("1.23456");
        dCeil.round(5000);

        DfpField fFloor = new DfpField(6, DfpField.RoundingMode.ROUND_FLOOR);
        Dfp dFloor = fFloor.newDfp("-1.23456");
        dFloor.round(5000);
    }

    @Test
    public void testCopysign_andNextAfter() {
        Dfp pos = factory.newDfp(10);
        Dfp neg = factory.newDfp(-20);
        Dfp copied = Dfp.copysign(pos, neg);
        Assert.assertEquals(-10, copied.intValue());

        Dfp diff = factory2.newDfp(10);
        Assert.assertTrue(pos.nextAfter(diff).isNaN());

        Assert.assertEquals(pos, pos.nextAfter(pos));

        Dfp nextUp = pos.nextAfter(factory.newDfp(20));
        Assert.assertTrue(nextUp.greaterThan(pos));

        Dfp nextDown = pos.nextAfter(factory.newDfp(0));
        Assert.assertTrue(nextDown.lessThan(pos));

        Dfp negNextUp = neg.nextAfter(factory.newDfp(0));
        Assert.assertTrue(negNextUp.greaterThan(neg));

        Dfp zero = factory.getZero();
        Dfp zeroNextUp = zero.nextAfter(factory.getOne());
        Assert.assertTrue(zeroNextUp.greaterThan(zero));
        Dfp zeroNextDown = zero.nextAfter(factory.getOne().negate());
        Assert.assertTrue(zeroNextDown.lessThan(zero));

        Dfp one = factory.getOne();
        Dfp oneNextDown = one.nextAfter(zero);
        Assert.assertTrue(oneNextDown.lessThan(one));
    }

    @Test
    public void testToDouble_andSplitDouble() {
        Dfp posInf = factory.newDfp((byte) 1, Dfp.INFINITE);
        Assert.assertEquals(Double.POSITIVE_INFINITY, posInf.toDouble(), 0.0);

        Dfp negInf = factory.newDfp((byte) -1, Dfp.INFINITE);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, negInf.toDouble(), 0.0);

        Dfp nan = factory.newDfp((byte) 1, Dfp.QNAN);
        Assert.assertTrue(Double.isNaN(nan.toDouble()));

        Dfp zero = factory.getZero();
        Assert.assertEquals(0.0, zero.toDouble(), 0.0);

        Dfp negZero = factory.newDfp(-0.0);
        Assert.assertEquals(-0.0, negZero.toDouble(), 0.0);

        Dfp large = factory.newDfp(1e300);
        Assert.assertEquals(1e300, large.toDouble(), 1e290);

        Dfp overflowDouble = factory.newDfp("1e400");
        Assert.assertEquals(Double.POSITIVE_INFINITY, overflowDouble.toDouble(), 0.0);

        Dfp underflowDouble = factory.newDfp("1e-400");
        Assert.assertEquals(0.0, underflowDouble.toDouble(), 0.0);

        Dfp normal = factory.newDfp("123.456789");
        double[] split = normal.toSplitDouble();
        Assert.assertEquals(123.456789, split[0] + split[1], 1e-10);
    }
}
