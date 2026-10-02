package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CoreOperationEqualTest {

    @Test
    public void testGetSymbol_returnsEqualSign() {
        Constant arg1 = new Constant("a");
        Constant arg2 = new Constant("b");
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);
        assertEquals("=", operation.getSymbol());
    }

    @Test
    public void testComputeValue_equalNumbers_returnsTrue() {
        Constant arg1 = new Constant(Double.valueOf(42.0));
        Constant arg2 = new Constant(Double.valueOf(42.0));
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        Object result = operation.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_differentNumbers_returnsFalse() {
        Constant arg1 = new Constant(Double.valueOf(42.0));
        Constant arg2 = new Constant(Double.valueOf(100.0));
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        Object result = operation.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_equalStrings_returnsTrue() {
        Constant arg1 = new Constant("hello");
        Constant arg2 = new Constant("hello");
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        Object result = operation.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_differentStrings_returnsFalse() {
        Constant arg1 = new Constant("hello");
        Constant arg2 = new Constant("world");
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        Object result = operation.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_emptyStrings_returnsTrue() {
        Constant arg1 = new Constant("");
        Constant arg2 = new Constant("");
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        Object result = operation.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_negativeNumbers_returnsTrue() {
        Constant arg1 = new Constant(Double.valueOf(-15.5));
        Constant arg2 = new Constant(Double.valueOf(-15.5));
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        Object result = operation.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_zeroAndNegativeZero_returnsTrue() {
        Constant arg1 = new Constant(Double.valueOf(0.0));
        Constant arg2 = new Constant(Double.valueOf(-0.0));
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        Object result = operation.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_numericStringAndNumber_returnsTrue() {
        Constant arg1 = new Constant("123");
        Constant arg2 = new Constant(Double.valueOf(123.0));
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        Object result = operation.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_withContextEvaluation_returnsCorrectResult() {
        JXPathContextReferenceImpl context = (JXPathContextReferenceImpl) JXPathContext.newContext(new Object());
        EvalContext rootContext = context.getAbsoluteRootContext();

        Constant arg1 = new Constant("test");
        Constant arg2 = new Constant("test");
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        Object result = operation.computeValue(rootContext);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_withContextEvaluation_notEqual_returnsFalse() {
        JXPathContextReferenceImpl context = (JXPathContextReferenceImpl) JXPathContext.newContext(new Object());
        EvalContext rootContext = context.getAbsoluteRootContext();

        Constant arg1 = new Constant("foo");
        Constant arg2 = new Constant("bar");
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        Object result = operation.computeValue(rootContext);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testConstructor_setsArgumentsCorrectly() {
        Constant arg1 = new Constant("a");
        Constant arg2 = new Constant("b");
        CoreOperationEqual operation = new CoreOperationEqual(arg1, arg2);

        assertNotNull(operation.getArguments());
        assertEquals(2, operation.getArguments().length);
        assertEquals(arg1, operation.getArguments()[0]);
        assertEquals(arg2, operation.getArguments()[1]);
    }
}
