package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Test;

public class CoreOperationNotEqualTest {

    @Test
    public void testGetSymbol_returnsNotEqualSymbol() {
        CoreOperationNotEqual op = new CoreOperationNotEqual(new Constant("a"), new Constant("b"));
        Assert.assertEquals("!=", op.getSymbol());
    }

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
        Constant arg1 = new Constant(Double.valueOf(42.0));
        Constant arg2 = new Constant(Double.valueOf(42.0));
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);

        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_differentNumbers_returnsTrue() {
        Constant arg1 = new Constant(Double.valueOf(10.5));
        Constant arg2 = new Constant(Double.valueOf(-10.5));
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);

        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_zeroAndNegativeZero_returnsFalse() {
        Constant arg1 = new Constant(Double.valueOf(0.0));
        Constant arg2 = new Constant(Double.valueOf(-0.0));
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);

        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
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
    public void testComputeValue_nanComparison_returnsTrue() {
        Constant arg1 = new Constant(Double.valueOf(Double.NaN));
        Constant arg2 = new Constant(Double.valueOf(Double.NaN));
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);

        Object result = op.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_withEvalContext_evaluatesCorrectly() {
        JXPathContextReferenceImpl context = (JXPathContextReferenceImpl) JXPathContext.newContext(new Object());
        NodePointer rootPointer = NodePointer.newNodePointer(null, new Object(), null);
        EvalContext evalContext = context.getAbsoluteRootContext();

        CoreOperationNotEqual opEqual = new CoreOperationNotEqual(new Constant(1), new Constant(1));
        CoreOperationNotEqual opNotEqual = new CoreOperationNotEqual(new Constant(1), new Constant(2));

        Assert.assertEquals(Boolean.FALSE, opEqual.computeValue(evalContext));
        Assert.assertEquals(Boolean.TRUE, opNotEqual.computeValue(evalContext));
    }

    @Test
    public void testToString_returnsFormattedExpression() {
        Constant arg1 = new Constant("foo");
        Constant arg2 = new Constant("bar");
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);

        String str = op.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.contains("!="));
    }
}
