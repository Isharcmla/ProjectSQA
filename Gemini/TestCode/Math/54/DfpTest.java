package org.apache.commons.math.dfp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DfpTest {

    private DfpField factory20;
    private DfpField factory10;

    @Before
    public void setUp() {
        factory20 = new DfpField(20);
        factory10 = new DfpField(10);
    }

    @Test
    public void testConstructors_allVariants() {
        Dfp dfp0 = factory20.newDfp();
        Assert.assertEquals(0, dfp0.intValue());

        Dfp dfpByte = factory20.newDfp((byte) 12);
        Assert.assertEquals(12, dfpByte.intValue());

        Dfp dfpInt = factory20.newDfp(123456);
        Assert.assertEquals(123456, dfpInt.intValue());

        Dfp dfpLong = factory20.newDfp(123456789012345L);
        Assert.assertEquals(123456789012345.0, dfpLong.toDouble(), 1.0);

        Dfp dfpLongMin = factory20.newDfp(Long.MIN_VALUE);
        Assert.assertTrue(dfpLongMin.lessThan(factory20.getZero()));

        Dfp dfpDouble = factory20.newDfp(3.14159);
        Assert.assertEquals(3.14159, dfpDouble.toDouble(), 1e-5);

        Dfp dfpDoubleZero = factory20.newDfp(0.0);
        Assert.assertTrue(dfpDoubleZero.equals(factory20.getZero()));

        Dfp dfpDoubleSubnormal = factory20.newDfp(Double.MIN_VALUE);
        Assert.assertTrue(dfpDoubleSubnormal.greaterThan(factory20.getZero()));

        Dfp dfpDoublePosInf = factory20.newDfp(Double.POSITIVE_INFINITY);
        Assert.assertTrue(dfpDoublePosInf.isInfinite());
        Assert.assertEquals(1, dfpDoublePosInf.sign);

        Dfp dfpDoubleNegInf = factory20.newDfp(Double.NEGATIVE_INFINITY);
        Assert.assertTrue(dfpDoubleNegInf.isInfinite());
        Assert.assertEquals(-1, dfpDoubleNegInf.sign);

        Dfp dfpDoubleNaN = factory20.newDfp(Double.NaN);
        Assert.assertTrue(dfpDoubleNaN.isNaN());

        Dfp dfpCopy = new Dfp(dfpDouble);
        Assert.assertEquals(dfpDouble, dfpCopy);

        Dfp dfpStrPosInf = factory20.newDfp("Infinity");
        Assert.assertTrue(dfpStrPosInf.isInfinite());

        Dfp dfpStrNegInf = factory20.newDfp("-Infinity");
        Assert.assertTrue(dfpStrNegInf.isInfinite());
        Assert.assertEquals(-1, dfpStrNegInf.sign);

        Dfp dfpStrNaN = factory20.newDfp("NaN");
        Assert.assertTrue(dfpStrNaN.isNaN());

        Dfp dfpStrSciPos = factory20.newDfp("1.234e2");
        Assert.assertEquals(123.4, dfpStrSciPos.toDouble(), 1e-4);

        Dfp dfpStrSciNeg = factory20.newDfp("1.234E-2");
        Assert.assertEquals(0.01234, dfpStrSciNeg.toDouble(), 1e-6);

        Dfp dfpStrZeros = factory20.newDfp("0.00000");
        Assert.assertTrue(dfpStrZeros.equals(factory20.getZero()));

        Dfp dfpStrInt = factory20.newDfp("12345");
        Assert.assertEquals(12345, dfpStrInt.intValue());

        Dfp dfpNonFinite = factory20.newDfp((byte) 1, Dfp.SNAN);
        Assert.assertEquals(Dfp.SNAN, dfpNonFinite.classify());
    }

    @Test
    public void testNewInstanceMethods() {
        Dfp base = factory20.getOne();
        Assert.assertEquals(factory20.getZero(), base.newInstance());
        Assert.assertEquals(factory20.newDfp((byte) 5), base.newInstance((byte) 5));
        Assert.assertEquals(factory20.newDfp(10), base.newInstance(10));
        Assert.assertEquals(factory20.newDfp(100L), base.newInstance(100L));
        Assert.assertEquals(factory20.newDfp(2.5), base.newInstance(2.5));
        Assert.assertEquals(factory20.newDfp("3.5"), base.newInstance("3.5"));
        Assert.assertEquals(factory20.newDfp((byte) -1, Dfp.INFINITE), base.newInstance((byte) -1, Dfp.INFINITE));

        Dfp copied = base.newInstance(base);
        Assert.assertEquals(base, copied);

        Dfp diffField = factory10.getOne();
        Dfp invalidNew = base.newInstance(diffField);
        Assert.assertTrue(invalidNew.isNaN());
    }

    @Test
    public void testGetters() {
        Dfp dfp = factory20.getOne();
        Assert.assertEquals(factory20, dfp.getField());
        Assert.assertEquals(20, dfp.getRadixDigits());
        Assert.assertEquals(factory20.getZero(), dfp.getZero());
        Assert.assertEquals(factory20.getOne(), dfp.getOne());
        Assert.assertEquals(factory20.getTwo(), dfp.getTwo());
    }

    @Test
    public void testAlignAndShifts() {
        Dfp a = factory20.newDfp("1.0");
        int lost = a.align(a.exp);
        Assert.assertEquals(0, lost);

        Dfp b = factory20.newDfp("1.0");
        lost = b.align(b.exp - 25);
        Assert.assertEquals(0, lost);

        Dfp c = factory20.newDfp("12345678.12345678");
        lost = c.align(c.exp + 2);
        Assert.assertTrue(lost >= 0);

        Dfp d = factory20.newDfp("1234.5678");
        d.shiftLeft();
        Assert.assertTrue(d.exp < 2);
        d.shiftRight();
        Assert.assertTrue(d.exp >= 1);
    }

    @Test
    public void testLessThanGreaterThan() {
        Dfp a = factory20.newDfp(10);
        Dfp b = factory20.newDfp(20);
        Dfp c = factory20.newDfp(10);
        Dfp nan = factory20.newDfp((byte) 1, Dfp.QNAN);
        Dfp diff = factory10.newDfp(10);

        Assert.assertTrue(a.lessThan(b));
        Assert.assertFalse(b.lessThan(a));
        Assert.assertFalse(a.lessThan(c));
        Assert.assertFalse(a.lessThan(nan));
        Assert.assertFalse(a.lessThan(diff));

        Assert.assertTrue(b.greaterThan(a));
        Assert.assertFalse(a.greaterThan(b));
        Assert.assertFalse(a.greaterThan(c));
        Assert.assertFalse(a.greaterThan(nan));
        Assert.assertFalse(a.greaterThan(diff));
    }

    @Test
    public void testClassifyAndPredicates() {
        Dfp finite = factory20.newDfp(10);
        Dfp inf = factory20.newDfp((byte) 1, Dfp.INFINITE);
        Dfp qnan = factory20.newDfp((byte) 1, Dfp.QNAN);
        Dfp snan = factory20.newDfp((byte) 1, Dfp.SNAN);

        Assert.assertEquals(Dfp.FINITE, finite.classify());
        Assert.assertEquals(Dfp.INFINITE, inf.classify());
        Assert.assertEquals(Dfp.QNAN, qnan.classify());
        Assert.assertEquals(Dfp.SNAN, snan.classify());

        Assert.assertTrue(inf.isInfinite());
        Assert.assertFalse(finite.isInfinite());

        Assert.assertTrue(qnan.isNaN());
        Assert.assertTrue(snan.isNaN());
        Assert.assertFalse(finite.isNaN());
    }

    @Test
    public void testEqualsAndHashCodeAndUnequal() {
        Dfp a = factory20.newDfp(15);
        Dfp b = factory20.newDfp(15);
        Dfp c = factory20.newDfp(25);
        Dfp nan = factory20.newDfp((byte) 1, Dfp.QNAN);
        Dfp diff = factory10.newDfp(15);

        Assert.assertTrue(a.equals(b));
        Assert.assertFalse(a.equals(c));
        Assert.assertFalse(a.equals(nan));
        Assert.assertFalse(a.equals(diff));
        Assert.assertFalse(a.equals("Not a Dfp"));

        Assert.assertEquals(a.hashCode(), b.hashCode());

        Assert.assertTrue(a.unequal(c));
        Assert.assertFalse(a.unequal(b));
        Assert.assertFalse(a.unequal(nan));
        Assert.assertFalse(a.unequal(diff));

        Dfp zero1 = factory20.getZero();
        Dfp zero2 = factory20.newDfp("-0.0");
        Assert.assertTrue(zero1.equals(zero2));

        Dfp neg = factory20.newDfp(-5);
        Dfp pos = factory20.newDfp(5);
        Assert.assertTrue(neg.lessThan(pos));
        Assert.assertTrue(pos.greaterThan(neg));

        Dfp infPos = factory20.newDfp((byte) 1, Dfp.INFINITE);
        Dfp infNeg = factory20.newDfp((byte) -1, Dfp.INFINITE);
        Assert.assertTrue(infPos.greaterThan(pos));
        Assert.assertTrue(infNeg.lessThan(neg));
        Assert.assertTrue(infPos.equals(infPos));
    }

    @Test
    public void testRoundModes() {
        Dfp d1 = factory20.newDfp("1.5");
        Dfp d2 = factory20.newDfp("2.5");
        Dfp dn = factory20.newDfp("-1.5");

        Assert.assertEquals(2, d1.rint().intValue());
        Assert.assertEquals(2, d2.rint().intValue());
        Assert.assertEquals(-2, dn.rint().intValue());

        Assert.assertEquals(1, d1.floor().intValue());
        Assert.assertEquals(-2, dn.floor().intValue());

        Assert.assertEquals(2, d1.ceil().intValue());
        Assert.assertEquals(-1, dn.ceil().intValue());

        Dfp zero = factory20.getZero();
        Assert.assertEquals(zero, zero.rint());

        Dfp small = factory20.newDfp("0.0001");
        small.exp = -2;
        Assert.assertEquals(zero, small.rint());

        Dfp nan = factory20.newDfp((byte) 1, Dfp.QNAN);
        Assert.assertTrue(nan.rint().isNaN());
        Dfp inf = factory20.newDfp((byte) 1, Dfp.INFINITE);
        Assert.assertTrue(inf.rint().isInfinite());
    }

    @Test
    public void testRemainder() {
        Dfp a = factory20.newDfp(7);
        Dfp b = factory20.newDfp(3);
        Dfp rem = a.remainder(b);
        Assert.assertEquals(1, rem.intValue());

        Dfp zeroRem = factory20.newDfp(6).remainder(factory20.newDfp(3));
        Assert.assertEquals(0, zeroRem.intValue());
        Assert.assertEquals(1, zeroRem.sign);
    }

    @Test
    public void testIntValue() {
        Dfp normal = factory20.newDfp(12345);
        Assert.assertEquals(12345, normal.intValue());

        Dfp neg = factory20.newDfp(-12345);
        Assert.assertEquals(-12345, neg.intValue());

        Dfp huge = factory20.newDfp("3000000000");
        Assert.assertEquals(2147483647, huge.intValue());

        Dfp hugeNeg = factory20.newDfp("-3000000000");
        Assert.assertEquals(-2147483648, hugeNeg.intValue());
    }

    @Test
    public void testPowersAndLogs() {
        Dfp a = factory20.newDfp("10000");
        Assert.assertEquals(1, a.log10K());
        Assert.assertEquals(4, a.log10());

        Dfp b = factory20.newDfp("500");
        Assert.assertEquals(2, b.log10());
        Dfp c = factory20.newDfp("50");
        Assert.assertEquals(1, c.log10());
        Dfp d = factory20.newDfp("5");
        Assert.assertEquals(0, d.log10());

        Dfp p10k = a.power10K(2);
        Assert.assertEquals(3, p10k.exp);

        Dfp p0 = a.power10(0);
        Assert.assertEquals(1, p0.intValue());
        Dfp p1 = a.power10(1);
        Assert.assertEquals(10, p1.intValue());
        Dfp p2 = a.power10(2);
        Assert.assertEquals(100, p2.intValue());
        Dfp p3 = a.power10(3);
        Assert.assertEquals(1000, p3.intValue());
        Dfp pNeg = a.power10(-1);
        Assert.assertEquals(0.1, pNeg.toDouble(), 1e-4);
    }

    @Test
    public void testAddAndSubtract() {
        Dfp a = factory20.newDfp(100);
        Dfp b = factory20.newDfp(25);
        Assert.assertEquals(125, a.add(b).intValue());
        Assert.assertEquals(75, a.subtract(b).intValue());

        Dfp diffField = factory10.newDfp(10);
        Assert.assertTrue(a.add(diffField).isNaN());

        Dfp nan = factory20.newDfp((byte) 1, Dfp.QNAN);
        Assert.assertTrue(nan.add(a).isNaN());
        Assert.assertTrue(a.add(nan).isNaN());

        Dfp pInf = factory20.newDfp((byte) 1, Dfp.INFINITE);
        Dfp nInf = factory20.newDfp((byte) -1, Dfp.INFINITE);
        Assert.assertTrue(pInf.add(a).isInfinite());
        Assert.assertTrue(a.add(pInf).isInfinite());
        Assert.assertTrue(pInf.add(pInf).isInfinite());
        Assert.assertTrue(pInf.add(nInf).isNaN());

        Dfp c = factory20.newDfp(-100);
        Assert.assertEquals(-75, c.add(b).intValue());
        Dfp zeroSum = a.add(c);
        Assert.assertEquals(factory20.getZero(), zeroSum);

        Dfp big = factory20.newDfp("99999999999999999999");
        Dfp big2 = factory20.newDfp("1");
        Assert.assertTrue(big.add(big2).greaterThan(big));
    }

    @Test
    public void testMultiply() {
        Dfp a = factory20.newDfp(12);
        Dfp b = factory20.newDfp(10);
        Assert.assertEquals(120, a.multiply(b).intValue());
        Assert.assertEquals(120, a.multiply(10).intValue());

        Dfp diffField = factory10.newDfp(10);
        Assert.assertTrue(a.multiply(diffField).isNaN());

        Dfp nan = factory20.newDfp((byte) 1, Dfp.QNAN);
        Assert.assertTrue(nan.multiply(a).isNaN());
        Assert.assertTrue(a.multiply(nan).isNaN());
        Assert.assertTrue(nan.multiply(5).isNaN());

        Dfp pInf = factory20.newDfp((byte) 1, Dfp.INFINITE);
        Assert.assertTrue(pInf.multiply(b).isInfinite());
        Assert.assertTrue(b.multiply(pInf).isInfinite());
        Assert.assertTrue(pInf.multiply(pInf).isInfinite());
        Assert.assertTrue(pInf.multiply(factory20.getZero()).isNaN());
        Assert.assertTrue(factory20.getZero().multiply(pInf).isNaN());

        Assert.assertTrue(pInf.multiply(5).isInfinite());
        Assert.assertTrue(pInf.multiply(0).isNaN());
        Assert.assertTrue(a.multiply(-1).isNaN());
        Assert.assertTrue(a.multiply(10000).isNaN());

        Dfp zeroMul = a.multiply(factory20.getZero());
        Assert.assertEquals(factory20.getZero(), zeroMul);
        Dfp zeroMulInt = a.multiply(0);
        Assert.assertEquals(factory20.getZero(), zeroMulInt);
    }

    @Test
    public void testDivide() {
        Dfp a = factory20.newDfp(100);
        Dfp b = factory20.newDfp(5);
        Assert.assertEquals(20, a.divide(b).intValue());
        Assert.assertEquals(20, a.divide(5).intValue());

        Dfp diffField = factory10.newDfp(5);
        Assert.assertTrue(a.divide(diffField).isNaN());

        Dfp nan = factory20.newDfp((byte) 1, Dfp.QNAN);
        Assert.assertTrue(nan.divide(a).isNaN());
        Assert.assertTrue(a.divide(nan).isNaN());
        Assert.assertTrue(nan.divide(2).isNaN());

        Dfp pInf = factory20.newDfp((byte) 1, Dfp.INFINITE);
        Assert.assertTrue(pInf.divide(b).isInfinite());
        Assert.assertEquals(factory20.getZero(), b.divide(pInf));
        Assert.assertTrue(pInf.divide(pInf).isNaN());
        Assert.assertTrue(pInf.divide(2).isInfinite());

        Assert.assertTrue(a.divide(factory20.getZero()).isInfinite());
        Assert.assertTrue(a.divide(0).isInfinite());
        Assert.assertTrue(a.divide(-1).isNaN());
        Assert.assertTrue(a.divide(10000).isNaN());

        Dfp longDiv = factory20.newDfp("1000000000").divide(factory20.newDfp("3"));
        Assert.assertTrue(longDiv.greaterThan(factory20.getZero()));

        Dfp singleDivShift = factory20.newDfp("0.0001").divide(2);
        Assert.assertTrue(singleDivShift.greaterThan(factory20.getZero()));
    }

    @Test
    public void testSqrt() {
        Dfp a = factory20.newDfp(16);
        Assert.assertEquals(4, a.sqrt().intValue());

        Dfp zero = factory20.getZero();
        Assert.assertEquals(zero, zero.sqrt());

        Dfp pInf = factory20.newDfp((byte) 1, Dfp.INFINITE);
        Assert.assertTrue(pInf.sqrt().isInfinite());

        Dfp qnan = factory20.newDfp((byte) 1, Dfp.QNAN);
        Assert.assertTrue(qnan.sqrt().isNaN());

        Dfp snan = factory20.newDfp((byte) 1, Dfp.SNAN);
        Assert.assertTrue(snan.sqrt().isNaN());

        Dfp neg = factory20.newDfp(-16);
        Assert.assertTrue(neg.sqrt().isNaN());

        Dfp large = factory20.newDfp("100000000");
        Assert.assertEquals(10000, large.sqrt().intValue());
    }

    @Test
    public void testToStringVariants() {
        Dfp pInf = factory20.newDfp((byte) 1, Dfp.INFINITE);
        Assert.assertEquals("Infinity", pInf.toString());

        Dfp nInf = factory20.newDfp((byte) -1, Dfp.INFINITE);
        Assert.assertEquals("-Infinity", nInf.toString());

        Dfp nan = factory20.newDfp((byte) 1, Dfp.QNAN);
        Assert.assertEquals("NaN", nan.toString());

        Dfp normal = factory20.newDfp("123.456");
        Assert.assertTrue(normal.toString().contains("123.456"));

        Dfp zero = factory20.getZero();
        Assert.assertEquals("0.", zero.toString());

        Dfp sci = factory20.newDfp("1.234e30");
        String sciStr = sci.toString();
        Assert.assertTrue(sciStr.contains("e") || sciStr.contains("E"));

        Dfp sciSmall = factory20.newDfp("1.234e-30");
        String sciSmallStr = sciSmall.toString();
        Assert.assertTrue(sciSmallStr.contains("e") || sciSmallStr.contains("E"));
    }

    @Test
    public void testCopysignAndNextAfter() {
        Dfp a = factory20.newDfp(10);
        Dfp b = factory20.newDfp(-5);
        Dfp copied = Dfp.copysign(a, b);
        Assert.assertEquals(-10, copied.intValue());

        Dfp diffField = factory10.newDfp(10);
        Assert.assertTrue(a.nextAfter(diffField).isNaN());

        Assert.assertEquals(a, a.nextAfter(a));

        Dfp nextUp = a.nextAfter(factory20.newDfp(20));
        Assert.assertTrue(nextUp.greaterThan(a));

        Dfp nextDown = a.nextAfter(factory20.newDfp(5));
        Assert.assertTrue(nextDown.lessThan(a));

        Dfp zero = factory20.getZero();
        Dfp nextFromZero = zero.nextAfter(a);
        Assert.assertTrue(nextFromZero.greaterThan(zero));

        Dfp neg = factory20.newDfp(-10);
        Dfp nextNegUp = neg.nextAfter(zero);
        Assert.assertTrue(nextNegUp.greaterThan(neg));
    }

    @Test
    public void testToDoubleAndSplitDouble() {
        Dfp pInf = factory20.newDfp((byte) 1, Dfp.INFINITE);
        Assert.assertEquals(Double.POSITIVE_INFINITY, pInf.toDouble(), 0.0);

        Dfp nInf = factory20.newDfp((byte) -1, Dfp.INFINITE);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, nInf.toDouble(), 0.0);

        Dfp nan = factory20.newDfp((byte) 1, Dfp.QNAN);
        Assert.assertTrue(Double.isNaN(nan.toDouble()));

        Dfp normal = factory20.newDfp("123.456");
        Assert.assertEquals(123.456, normal.toDouble(), 1e-6);

        Dfp neg = factory20.newDfp("-123.456");
        Assert.assertEquals(-123.456, neg.toDouble(), 1e-6);

        Dfp subnormal = factory20.newDfp(Double.MIN_VALUE);
        Assert.assertEquals(Double.MIN_VALUE, subnormal.toDouble(), Double.MIN_VALUE);

        Dfp huge = factory20.newDfp(Double.MAX_VALUE).multiply(10);
        Assert.assertEquals(Double.POSITIVE_INFINITY, huge.toDouble(), 0.0);

        Dfp tiny = factory20.newDfp("1e-400");
        Assert.assertEquals(0.0, tiny.toDouble(), 0.0);

        double[] split = normal.toSplitDouble();
        Assert.assertEquals(2, split.length);
        Assert.assertEquals(123.456, split[0] + split[1], 1e-6);
    }

    @Test
    public void testComplement() {
        Dfp a = factory20.newDfp("1234.5678");
        int extra = a.complement(100);
        Assert.assertTrue(extra >= 0);
    }
}
