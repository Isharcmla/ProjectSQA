package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import org.junit.Assert;

public class CoreOperationLessThanOrEqualTest {

    @Test
    public void testComputeValue_leftLessThanRight_returnsTrue() {
        Constant arg1 = new Constant(1.0);
        Constant arg2 = new Constant(2.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_leftEqualsRight_returnsTrue() {
        Constant arg1 = new Constant(5.0);
        Constant arg2 = new Constant(5.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_leftGreaterThanRight_returnsFalse() {
        Constant arg1 = new Constant(10.0);
        Constant arg2 = new Constant(2.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_negativeValues_returnsTrue() {
        Constant arg1 = new Constant(-5.0);
        Constant arg2 = new Constant(-1.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_negativeValues_returnsFalse() {
        Constant arg1 = new Constant(-1.0);
        Constant arg2 = new Constant(-5.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_zeroValues_returnsTrue() {
        Constant arg1 = new Constant(0.0);
        Constant arg2 = new Constant(0.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_stringNumbersComparison_returnsTrue() {
        Constant arg1 = new Constant("3");
        Constant arg2 = new Constant("10");
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_emptyStringAsNaN_returnsFalse() {
        // InfoSetUtil.doubleValue("") is expected to produce NaN,
        // and any comparison involving NaN should evaluate to false.
        Constant arg1 = new Constant("");
        Constant arg2 = new Constant(5.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_boundaryDoubleValues_returnsTrue() {
        Constant arg1 = new Constant(Double.MIN_VALUE);
        Constant arg2 = new Constant(Double.MAX_VALUE);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValue_nullFirstArgument_throwsNullPointerException() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(null, new Constant(2.0));
        op.computeValue(null);
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValue_nullSecondArgument_throwsNullPointerException() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(new Constant(2.0), null);
        op.computeValue(null);
    }

    @Test
    public void testGetSymbol_returnsLessThanOrEqualSymbol() {
        Constant arg1 = new Constant(1.0);
        Constant arg2 = new Constant(2.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Assert.assertEquals("<=", op.getSymbol());
    }

    @Test
    public void testConstructor_createsInstanceSuccessfully() {
        Constant arg1 = new Constant(1.0);
        Constant arg2 = new Constant(2.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        Assert.assertNotNull(op);
    }

    @Test
    public void testToString_isNotNull() {
        Constant arg1 = new Constant(1.0);
        Constant arg2 = new Constant(2.0);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);
        String str = op.toString();
        Assert.assertNotNull(str);
    }
}
