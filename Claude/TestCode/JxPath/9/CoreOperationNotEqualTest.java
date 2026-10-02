package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import org.junit.Assert;

public class CoreOperationNotEqualTest {

    @Test
    public void testComputeValue_equalStrings_returnsFalse() {
        Constant arg1 = new Constant("hello");
        Constant arg2 = new Constant("hello");
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_differentStrings_returnsTrue() {
        Constant arg1 = new Constant("hello");
        Constant arg2 = new Constant("world");
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_equalNumbers_returnsFalse() {
        Constant arg1 = new Constant(10.0);
        Constant arg2 = new Constant(10.0);
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_differentNumbers_returnsTrue() {
        Constant arg1 = new Constant(10.0);
        Constant arg2 = new Constant(20.0);
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_emptyStrings_returnsFalse() {
        Constant arg1 = new Constant("");
        Constant arg2 = new Constant("");
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_emptyStringVsNonEmpty_returnsTrue() {
        Constant arg1 = new Constant("");
        Constant arg2 = new Constant("nonempty");
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_negativeNumbersEqual_returnsFalse() {
        Constant arg1 = new Constant(-5.0);
        Constant arg2 = new Constant(-5.0);
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_negativeNumbersDifferent_returnsTrue() {
        Constant arg1 = new Constant(-5.0);
        Constant arg2 = new Constant(-10.0);
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_zeroValuesEqual_returnsFalse() {
        Constant arg1 = new Constant(0.0);
        Constant arg2 = new Constant(0.0);
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_zeroVsPositiveNumber_returnsTrue() {
        Constant arg1 = new Constant(0.0);
        Constant arg2 = new Constant(1.0);
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testGetSymbol_returnsNotEqualSymbol() {
        Constant arg1 = new Constant("a");
        Constant arg2 = new Constant("b");
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        Assert.assertEquals("!=", op.getSymbol());
    }

    @Test
    public void testConstructor_withValidArguments_createsInstance() {
        Constant arg1 = new Constant("x");
        Constant arg2 = new Constant("y");
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        Assert.assertNotNull(op);
    }

    @Test
    public void testConstructor_withSameArgumentInstance_createsInstance() {
        Constant arg1 = new Constant("same");
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg1);
        Assert.assertNotNull(op);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValue_nullArguments_throwsException() {
        CoreOperationNotEqual op = new CoreOperationNotEqual(null, null);
        op.computeValue(null);
    }

    @Test
    public void testComputeValue_stringVsNumberDifferentValues_returnsTrue() {
        Constant arg1 = new Constant("10");
        Constant arg2 = new Constant(20.0);
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }
}
