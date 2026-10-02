package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoreOperationEqualTest {

    @Test
    public void testGetSymbol_returnsEqualsSign() {
        Expression left = new Constant("a");
        Expression right = new Constant("a");
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        assertEquals("=", op.getSymbol());
    }

    @Test
    public void testComputeValue_equalStrings_returnsTrue() {
        Expression left = new Constant("hello");
        Expression right = new Constant("hello");
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_differentStrings_returnsFalse() {
        Expression left = new Constant("hello");
        Expression right = new Constant("world");
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_equalNumbers_returnsTrue() {
        Expression left = new Constant(42.0);
        Expression right = new Constant(42.0);
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_differentNumbers_returnsFalse() {
        Expression left = new Constant(1.0);
        Expression right = new Constant(2.0);
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_zeroValues_returnsTrue() {
        Expression left = new Constant(0.0);
        Expression right = new Constant(0.0);
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_negativeNumbers_returnsTrue() {
        Expression left = new Constant(-5.0);
        Expression right = new Constant(-5.0);
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_negativeVsPositiveNumbers_returnsFalse() {
        Expression left = new Constant(-5.0);
        Expression right = new Constant(5.0);
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_emptyStrings_returnsTrue() {
        Expression left = new Constant("");
        Expression right = new Constant("");
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_emptyVsNonEmptyString_returnsFalse() {
        Expression left = new Constant("");
        Expression right = new Constant("notEmpty");
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValue_nullLeftArgument_throwsNullPointerException() {
        Expression right = new Constant("x");
        CoreOperationEqual op = new CoreOperationEqual(null, right);
        op.computeValue(null);
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValue_nullRightArgument_throwsNullPointerException() {
        Expression left = new Constant("x");
        CoreOperationEqual op = new CoreOperationEqual(left, null);
        op.computeValue(null);
    }

    @Test
    public void testConstructor_createsInstanceSuccessfully() {
        Expression left = new Constant("a");
        Expression right = new Constant("b");
        CoreOperationEqual op = new CoreOperationEqual(left, right);
        assertNotNull(op);
    }

    @Test
    public void testComputeValue_sameReferenceCompared_returnsTrue() {
        Expression same = new Constant("sameValue");
        CoreOperationEqual op = new CoreOperationEqual(same, same);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }
}
