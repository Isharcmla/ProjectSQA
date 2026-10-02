package org.apache.commons.jxpath.ri.compiler;

import org.junit.Assert;
import org.junit.Test;

public class CoreOperationGreaterThanTest {

    @Test
    public void testGetSymbol() {
        Constant arg1 = new Constant(Integer.valueOf(1));
        Constant arg2 = new Constant(Integer.valueOf(2));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        Assert.assertEquals(">", operation.getSymbol());
    }

    @Test
    public void testComputeValue_greaterThan_returnsTrue() {
        Constant arg1 = new Constant(Integer.valueOf(5));
        Constant arg2 = new Constant(Integer.valueOf(3));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        Object result = operation.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_lessThan_returnsFalse() {
        Constant arg1 = new Constant(Integer.valueOf(2));
        Constant arg2 = new Constant(Integer.valueOf(4));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        Object result = operation.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_equalValues_returnsFalse() {
        Constant arg1 = new Constant(Double.valueOf(5.5));
        Constant arg2 = new Constant(Double.valueOf(5.5));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        Object result = operation.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_negativeNumbers_returnsCorrectResult() {
        Constant arg1 = new Constant(Double.valueOf(-2.0));
        Constant arg2 = new Constant(Double.valueOf(-5.0));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        Object result = operation.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);

        Constant arg3 = new Constant(Double.valueOf(-10.0));
        Constant arg4 = new Constant(Double.valueOf(-5.0));
        CoreOperationGreaterThan operation2 = new CoreOperationGreaterThan(arg3, arg4);

        Object result2 = operation2.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result2);
    }

    @Test
    public void testComputeValue_withZero_returnsCorrectResult() {
        Constant arg1 = new Constant(Double.valueOf(0.0));
        Constant arg2 = new Constant(Double.valueOf(-0.1));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        Object result = operation.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);

        Constant arg3 = new Constant(Double.valueOf(0.0));
        Constant arg4 = new Constant(Double.valueOf(0.0));
        CoreOperationGreaterThan operation2 = new CoreOperationGreaterThan(arg3, arg4);

        Object result2 = operation2.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result2);
    }

    @Test
    public void testComputeValue_stringNumbers_returnsCorrectResult() {
        Constant arg1 = new Constant("15");
        Constant arg2 = new Constant("4.5");
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        Object result = operation.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_nanValues_returnsFalse() {
        Constant arg1 = new Constant(Double.valueOf(Double.NaN));
        Constant arg2 = new Constant(Double.valueOf(1.0));
        CoreOperationGreaterThan operation1 = new CoreOperationGreaterThan(arg1, arg2);

        Object result1 = operation1.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result1);

        Constant arg3 = new Constant(Double.valueOf(1.0));
        Constant arg4 = new Constant(Double.valueOf(Double.NaN));
        CoreOperationGreaterThan operation2 = new CoreOperationGreaterThan(arg3, arg4);

        Object result2 = operation2.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result2);
    }

    @Test
    public void testComputeValue_emptyString_evaluatesAsNanAndReturnsFalse() {
        Constant arg1 = new Constant("");
        Constant arg2 = new Constant(Double.valueOf(0.0));
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(arg1, arg2);

        Object result = operation.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValue_nullArgument_throwsNullPointerException() {
        CoreOperationGreaterThan operation = new CoreOperationGreaterThan(null, new Constant(Integer.valueOf(1)));
        operation.computeValue(null);
    }
}
