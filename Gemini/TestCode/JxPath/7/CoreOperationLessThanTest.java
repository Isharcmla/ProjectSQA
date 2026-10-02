package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoreOperationLessThanTest {

    @Test
    public void testGetSymbol_returnsLessThanSign() {
        Constant arg1 = new Constant(Integer.valueOf(1));
        Constant arg2 = new Constant(Integer.valueOf(2));
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        assertEquals("<", op.getSymbol());
    }

    @Test
    public void testComputeValue_lessThan_returnsTrue() {
        Constant arg1 = new Constant(Integer.valueOf(1));
        Constant arg2 = new Constant(Integer.valueOf(2));
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_greaterThan_returnsFalse() {
        Constant arg1 = new Constant(Integer.valueOf(5));
        Constant arg2 = new Constant(Integer.valueOf(2));
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_equalValues_returnsFalse() {
        Constant arg1 = new Constant(Integer.valueOf(3));
        Constant arg2 = new Constant(Integer.valueOf(3));
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_negativeNumbers_returnsCorrectBoolean() {
        Constant arg1 = new Constant(Integer.valueOf(-10));
        Constant arg2 = new Constant(Integer.valueOf(-5));
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        assertEquals(Boolean.TRUE, op.computeValue(null));

        CoreOperationLessThan opReversed = new CoreOperationLessThan(arg2, arg1);
        assertEquals(Boolean.FALSE, opReversed.computeValue(null));
    }

    @Test
    public void testComputeValue_zeroEdgeCases() {
        Constant zero = new Constant(Integer.valueOf(0));
        Constant positive = new Constant(Integer.valueOf(1));
        Constant negative = new Constant(Integer.valueOf(-1));

        assertEquals(Boolean.TRUE, new CoreOperationLessThan(negative, zero).computeValue(null));
        assertEquals(Boolean.TRUE, new CoreOperationLessThan(zero, positive).computeValue(null));
        assertEquals(Boolean.FALSE, new CoreOperationLessThan(zero, zero).computeValue(null));
        assertEquals(Boolean.FALSE, new CoreOperationLessThan(positive, zero).computeValue(null));
    }

    @Test
    public void testComputeValue_stringNumbers_returnsCorrectBoolean() {
        Constant arg1 = new Constant("10.5");
        Constant arg2 = new Constant("20.1");
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        assertEquals(Boolean.TRUE, op.computeValue(null));

        Constant arg3 = new Constant("invalid");
        CoreOperationLessThan opInvalid = new CoreOperationLessThan(arg1, arg3);
        assertEquals(Boolean.FALSE, opInvalid.computeValue(null));
    }

    @Test
    public void testComputeValue_nanAndInfinity() {
        Constant nan = new Constant(Double.valueOf(Double.NaN));
        Constant num = new Constant(Double.valueOf(100.0));
        Constant posInf = new Constant(Double.valueOf(Double.POSITIVE_INFINITY));
        Constant negInf = new Constant(Double.valueOf(Double.NEGATIVE_INFINITY));

        assertEquals(Boolean.FALSE, new CoreOperationLessThan(nan, num).computeValue(null));
        assertEquals(Boolean.FALSE, new CoreOperationLessThan(num, nan).computeValue(null));
        assertEquals(Boolean.TRUE, new CoreOperationLessThan(negInf, posInf).computeValue(null));
        assertEquals(Boolean.FALSE, new CoreOperationLessThan(posInf, negInf).computeValue(null));
    }
}
