package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CoreOperationGreaterThanOrEqualTest {

    @Test
    public void testGetSymbol() {
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(
            new Constant(Double.valueOf(1.0)),
            new Constant(Double.valueOf(2.0))
        );
        assertEquals(">=", op.getSymbol());
    }

    @Test
    public void testComputeValue_strictlyGreaterThan_returnsTrue() {
        Constant arg1 = new Constant(Double.valueOf(5.0));
        Constant arg2 = new Constant(Double.valueOf(3.0));
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(arg1, arg2);

        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_equalValues_returnsTrue() {
        Constant arg1 = new Constant(Double.valueOf(4.0));
        Constant arg2 = new Constant(Double.valueOf(4.0));
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(arg1, arg2);

        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_strictlyLessThan_returnsFalse() {
        Constant arg1 = new Constant(Double.valueOf(2.0));
        Constant arg2 = new Constant(Double.valueOf(5.0));
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(arg1, arg2);

        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_negativeNumbers_greaterOrEqual_returnsTrue() {
        Constant arg1 = new Constant(Double.valueOf(-1.0));
        Constant arg2 = new Constant(Double.valueOf(-3.0));
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(arg1, arg2);

        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_negativeNumbers_lessThan_returnsFalse() {
        Constant arg1 = new Constant(Double.valueOf(-5.0));
        Constant arg2 = new Constant(Double.valueOf(-2.0));
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(arg1, arg2);

        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_zeroValues_returnsTrue() {
        Constant arg1 = new Constant(Double.valueOf(0.0));
        Constant arg2 = new Constant(Double.valueOf(0.0));
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(arg1, arg2);

        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_numericStrings_convertsAndCompares() {
        Constant arg1 = new Constant("10.5");
        Constant arg2 = new Constant("2.5");
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(arg1, arg2);

        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_invalidStringConversion_resultsInNaN_returnsFalse() {
        Constant arg1 = new Constant("invalid");
        Constant arg2 = new Constant(Double.valueOf(1.0));
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(arg1, arg2);

        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }
}
