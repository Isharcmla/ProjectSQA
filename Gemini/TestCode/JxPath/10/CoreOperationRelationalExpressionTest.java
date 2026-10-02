package org.apache.commons.jxpath.ri.compiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Test;

public class CoreOperationRelationalExpressionTest {

    private static class TestRelationalExpression extends CoreOperationRelationalExpression {
        private final int targetCompare;

        public TestRelationalExpression(Expression left, Expression right) {
            this(left, right, -1);
        }

        public TestRelationalExpression(Expression left, Expression right, int targetCompare) {
            super(new Expression[]{left, right});
            this.targetCompare = targetCompare;
        }

        @Override
        protected boolean evaluateCompare(int compare) {
            return compare == targetCompare;
        }

        @Override
        public String getSymbol() {
            return "<";
        }
    }

    private static class ValueExpression extends Expression {
        private final Object value;

        public ValueExpression(Object value) {
            this.value = value;
        }

        @Override
        public Object compute(EvalContext context) {
            return value;
        }

        @Override
        public Object computeValue(EvalContext context) {
            return value;
        }
    }

    @Test
    public void testGetPrecedence_returnsThree() {
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(1), new ValueExpression(2));
        Assert.assertEquals(3, expr.getPrecedence());
    }

    @Test
    public void testIsSymmetric_returnsFalse() {
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(1), new ValueExpression(2));
        Assert.assertFalse(expr.isSymmetric());
    }

    @Test
    public void testComputeValue_numbersLessThan_evaluatesCorrectly() {
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(1.0), new ValueExpression(2.0), -1);
        Object result = expr.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_numbersEqual_evaluatesCorrectly() {
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(2.0), new ValueExpression(2.0), 0);
        Object result = expr.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_numbersGreaterThan_evaluatesCorrectly() {
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(3.0), new ValueExpression(2.0), 1);
        Object result = expr.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_leftIsNaN_returnsFalse() {
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression("not-a-number"), new ValueExpression(2.0), -1);
        Object result = expr.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_rightIsNaN_returnsFalse() {
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(2.0), new ValueExpression("invalid-double"), -1);
        Object result = expr.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_bothNaN_returnsFalse() {
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(Double.NaN), new ValueExpression("invalid"), -1);
        Object result = expr.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_leftIterator_foundMatch_returnsTrue() {
        Iterator<Double> it = Arrays.asList(5.0, 1.0, 10.0).iterator();
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(it), new ValueExpression(2.0), -1);
        Object result = expr.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_leftIterator_noMatch_returnsFalse() {
        Iterator<Double> it = Arrays.asList(5.0, 10.0).iterator();
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(it), new ValueExpression(2.0), -1);
        Object result = expr.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_rightIterator_foundMatch_returnsTrue() {
        Iterator<Double> it = Arrays.asList(0.5, 3.0).iterator();
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(2.0), new ValueExpression(it), -1);
        Object result = expr.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_rightIterator_noMatch_returnsFalse() {
        Iterator<Double> it = Arrays.asList(0.5, 1.0).iterator();
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(2.0), new ValueExpression(it), -1);
        Object result = expr.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_bothIterators_foundMatch_returnsTrue() {
        List<Double> leftList = Arrays.asList(5.0, 1.0);
        List<Double> rightList = Arrays.asList(0.5, 2.0);
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(leftList.iterator()), new ValueExpression(rightList.iterator()), -1);
        Object result = expr.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_bothIterators_noMatch_returnsFalse() {
        List<Double> leftList = Arrays.asList(10.0, 20.0);
        List<Double> rightList = Arrays.asList(1.0, 2.0);
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(leftList.iterator()), new ValueExpression(rightList.iterator()), -1);
        Object result = expr.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_collectionsReducedToIterators() {
        List<Double> leftList = Arrays.asList(5.0, 1.0);
        List<Double> rightList = Collections.singletonList(2.0);
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(leftList), new ValueExpression(rightList), -1);
        Object result = expr.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_emptyCollection_returnsFalse() {
        List<Double> leftList = new ArrayList<Double>();
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(leftList), new ValueExpression(5.0), -1);
        Object result = expr.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_withInitialContext_resetsCorrectly() {
        JXPathContext context = JXPathContext.newContext(new Object());
        EvalContext evalCtx = (EvalContext) context.getAbsoluteRootContext();
        InitialContext leftInitCtx = new InitialContext(evalCtx);
        InitialContext rightInitCtx = new InitialContext(evalCtx);

        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(leftInitCtx), new ValueExpression(rightInitCtx), 0);
        Object result = expr.computeValue(evalCtx);
        Assert.assertNotNull(result);
    }

    @Test
    public void testComputeValue_withSelfContext_reducedNodePointer() {
        JXPathContextReferenceImpl context = (JXPathContextReferenceImpl) JXPathContext.newContext(10.0);
        RootContext rootContext = new RootContext(context, NodePointer.newNodePointer(null, 10.0, null));
        SelfContext selfContext = new SelfContext(rootContext, new NodeTypeTest(1));

        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(selfContext), new ValueExpression(20.0), -1);
        Object result = expr.computeValue(rootContext);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_negativeZeroAndStringNumbers() {
        TestRelationalExpression expr1 = new TestRelationalExpression(
                new ValueExpression("-5.0"), new ValueExpression("0"), -1);
        Assert.assertEquals(Boolean.TRUE, expr1.computeValue(null));

        TestRelationalExpression expr2 = new TestRelationalExpression(
                new ValueExpression("-0.0"), new ValueExpression("0.0"), 0);
        Assert.assertEquals(Boolean.TRUE, expr2.computeValue(null));
    }
}
