package org.apache.commons.jxpath.ri.compiler;

import org.junit.Assert;
import org.junit.Test;

public class CoreOperationLessThanOrEqualTest {

    @Test
    public void testGetSymbol_returnsCorrectSymbol() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(
            new Constant(1),
            new Constant(2)
        );
        Assert.assertEquals("<=", op.getSymbol());
    }

    @Test
    public void testComputeValue_lessThan_returnsTrue() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(
            new Constant(1.0),
            new Constant(2.0)
        );
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_equal_returnsTrue() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(
            new Constant(2.0),
            new Constant(2.0)
        );
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_greaterThan_returnsFalse() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(
            new Constant(3.0),
            new Constant(2.0)
        );
        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_negativeNumbers_correctComparison() {
        CoreOperationLessThanOrEqual op1 = new CoreOperationLessThanOrEqual(
            new Constant(-5.0),
            new Constant(-2.0)
        );
        Assert.assertEquals(Boolean.TRUE, op1.computeValue(null));

        CoreOperationLessThanOrEqual op2 = new CoreOperationLessThanOrEqual(
            new Constant(-2.0),
            new Constant(-5.0)
        );
        Assert.assertEquals(Boolean.FALSE, op2.computeValue(null));
    }

    @Test
    public void testComputeValue_zeros_returnsTrue() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(
            new Constant(0.0),
            new Constant(-0.0)
        );
        Assert.assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_nanComparison_returnsFalse() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(
            new Constant(Double.NaN),
            new Constant(5.0)
        );
        Assert.assertEquals(Boolean.FALSE, op.computeValue(null));

        CoreOperationLessThanOrEqual opNanBoth = new CoreOperationLessThanOrEqual(
            new Constant(Double.NaN),
            new Constant(Double.NaN)
        );
        Assert.assertEquals(Boolean.FALSE, opNanBoth.computeValue(null));
    }

    @Test
    public void testComputeValue_stringConversion_evaluatesCorrectly() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(
            new Constant("10"),
            new Constant("20.5")
        );
        Assert.assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_invalidStringConversion_evaluatesToNan() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(
            new Constant("notANumber"),
            new Constant("10")
        );
        Assert.assertEquals(Boolean.FALSE, op.computeValue(null));
    }
}
