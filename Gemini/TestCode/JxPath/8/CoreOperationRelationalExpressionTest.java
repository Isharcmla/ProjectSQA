package org.apache.commons.jxpath.ri.compiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.junit.Assert;
import org.junit.Test;

public class CoreOperationRelationalExpressionTest {

    private static class ValueExpr extends Expression {
        private final Object val;

        public ValueExpr(Object val) {
            this.val = val;
        }

        public Object compute(EvalContext context) {
            return val;
        }

        public Object computeValue(EvalContext context) {
            return val;
        }

        public boolean isContextDependent() {
            return false;
        }
    }

    private static class TestRelationalExpression extends CoreOperationRelationalExpression {
        private final boolean matchLess;
        private final boolean matchEqual;
        private final boolean matchGreater;

        public TestRelationalExpression(Expression left, Expression right, boolean less, boolean equal, boolean greater) {
            super(new Expression[]{left, right});
            this.matchLess = less;
            this.matchEqual = equal;
            this.matchGreater = greater;
        }

        public TestRelationalExpression(Expression[] args) {
            super(args);
            this.matchLess = false;
            this.matchEqual = false;
            this.matchGreater = false;
        }

        protected boolean evaluateCompare(int compare) {
            if (compare < 0) {
                return matchLess;
            }
            if (compare == 0) {
                return matchEqual;
            }
            return matchGreater;
        }

        public String getSymbol() {
            return "~";
        }
    }

    @Test
    public void testGetPrecedence() {
        TestRelationalExpression expr = new TestRelationalExpression(new Expression[]{
                new ValueExpr(1), new ValueExpr(2)
        });
        Assert.assertEquals(3, expr.getPrecedence());
    }

    @Test
    public void testIsSymmetric() {
        TestRelationalExpression expr = new TestRelationalExpression(new Expression[]{
                new ValueExpr(1), new ValueExpr(2)
        });
        Assert.assertFalse(expr.isSymmetric());
    }

    @Test
    public void testComputeValue_numbersEqual_evaluatesZero() {
        TestRelationalExpression exprEqual = new TestRelationalExpression(
                new ValueExpr(5.0), new ValueExpr(5.0), false, true, false);
        Assert.assertEquals(Boolean.TRUE, exprEqual.computeValue(null));

        TestRelationalExpression exprNotEqual = new TestRelationalExpression(
                new ValueExpr(5.0), new ValueExpr(5.0), true, false, true);
        Assert.assertEquals(Boolean.FALSE, exprNotEqual.computeValue(null));
    }

    @Test
    public void testComputeValue_numbersLessThan_evaluatesNegativeOne() {
        TestRelationalExpression exprLess = new TestRelationalExpression(
                new ValueExpr(3.0), new ValueExpr(7.0), true, false, false);
        Assert.assertEquals(Boolean.TRUE, exprLess.computeValue(null));

        TestRelationalExpression exprNotLess = new TestRelationalExpression(
                new ValueExpr(3.0), new ValueExpr(7.0), false, true, true);
        Assert.assertEquals(Boolean.FALSE, exprNotLess.computeValue(null));
    }

    @Test
    public void testComputeValue_numbersGreaterThan_evaluatesPositiveOne() {
        TestRelationalExpression exprGreater = new TestRelationalExpression(
                new ValueExpr(10.0), new ValueExpr(4.0), false, false, true);
        Assert.assertEquals(Boolean.TRUE, exprGreater.computeValue(null));

        TestRelationalExpression exprNotGreater = new TestRelationalExpression(
                new ValueExpr(10.0), new ValueExpr(4.0), true, true, false);
        Assert.assertEquals(Boolean.FALSE, exprNotGreater.computeValue(null));
    }

    @Test
    public void testComputeValue_edgeCases_zeroAndNegativeNumbers() {
        TestRelationalExpression expr1 = new TestRelationalExpression(
                new ValueExpr(-0.0), new ValueExpr(0.0), false, true, false);
        Assert.assertEquals(Boolean.TRUE, expr1.computeValue(null));

        TestRelationalExpression expr2 = new TestRelationalExpression(
                new ValueExpr(-10), new ValueExpr(-5), true, false, false);
        Assert.assertEquals(Boolean.TRUE, expr2.computeValue(null));
    }

    @Test
    public void testComputeValue_nanAndNullAndEmptyString() {
        TestRelationalExpression exprNaN = new TestRelationalExpression(
                new ValueExpr(Double.NaN), new ValueExpr(5.0), false, false, true);
        Assert.assertEquals(Boolean.TRUE, exprNaN.computeValue(null));

        TestRelationalExpression exprNull = new TestRelationalExpression(
                new ValueExpr(null), new ValueExpr(0.0), false, false, true);
        Assert.assertEquals(Boolean.TRUE, exprNull.computeValue(null));

        TestRelationalExpression exprEmptyString = new TestRelationalExpression(
                new ValueExpr(""), new ValueExpr(0.0), false, false, true);
        Assert.assertEquals(Boolean.TRUE, exprEmptyString.computeValue(null));
    }

    @Test
    public void testComputeValue_leftIsCollection_findsMatch() {
        List<Double> list = Arrays.asList(10.0, 20.0, 30.0);
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpr(list), new ValueExpr(25.0), true, false, false);
        Assert.assertEquals(Boolean.TRUE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_leftIsCollection_noMatch() {
        List<Double> list = Arrays.asList(30.0, 40.0);
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpr(list), new ValueExpr(25.0), true, false, false);
        Assert.assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_rightIsCollection_findsMatch() {
        List<Double> list = Arrays.asList(5.0, 15.0, 25.0);
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpr(10.0), new ValueExpr(list), false, false, true);
        Assert.assertEquals(Boolean.TRUE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_rightIsCollection_noMatch() {
        List<Double> list = Arrays.asList(15.0, 25.0);
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpr(10.0), new ValueExpr(list), false, false, true);
        Assert.assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_bothAreCollections_findsMatch() {
        List<Double> leftList = Arrays.asList(10.0, 20.0);
        List<Double> rightList = Arrays.asList(15.0, 5.0);
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpr(leftList), new ValueExpr(rightList), true, false, false);
        Assert.assertEquals(Boolean.TRUE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_bothAreCollections_noMatch() {
        List<Double> leftList = Arrays.asList(20.0, 30.0);
        List<Double> rightList = Arrays.asList(5.0, 10.0);
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpr(leftList), new ValueExpr(rightList), true, false, false);
        Assert.assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_emptyCollections_returnsFalse() {
        List<Double> emptyLeft = new ArrayList<Double>();
        List<Double> emptyRight = new ArrayList<Double>();

        TestRelationalExpression exprBothEmpty = new TestRelationalExpression(
                new ValueExpr(emptyLeft), new ValueExpr(emptyRight), true, true, true);
        Assert.assertEquals(Boolean.FALSE, exprBothEmpty.computeValue(null));

        TestRelationalExpression exprLeftEmpty = new TestRelationalExpression(
                new ValueExpr(emptyLeft), new ValueExpr(10.0), true, true, true);
        Assert.assertEquals(Boolean.FALSE, exprLeftEmpty.computeValue(null));

        TestRelationalExpression exprRightEmpty = new TestRelationalExpression(
                new ValueExpr(10.0), new ValueExpr(emptyRight), true, true, true);
        Assert.assertEquals(Boolean.FALSE, exprRightEmpty.computeValue(null));
    }

    @Test
    public void testComputeValue_directIterators() {
        Iterator<Double> lit = Arrays.asList(1.0, 2.0).iterator();
        Iterator<Double> rit = Arrays.asList(2.0, 3.0).iterator();
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpr(lit), new ValueExpr(rit), false, true, false);
        Assert.assertEquals(Boolean.TRUE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_withInitialContext() {
        JXPathContextReferenceImpl jxContext = (JXPathContextReferenceImpl) JXPathContext.newContext(new Object());
        RootContext rootContext = new RootContext(jxContext, new NullPointer(Locale.getDefault(), "id"));
        InitialContext initCtx1 = new InitialContext(rootContext);
        InitialContext initCtx2 = new InitialContext(rootContext);

        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpr(initCtx1), new ValueExpr(initCtx2), true, true, true);
        Object result = expr.computeValue(null);
        Assert.assertNotNull(result);
    }

    @Test
    public void testComputeValue_withSelfContext() {
        JXPathContextReferenceImpl jxContext = (JXPathContextReferenceImpl) JXPathContext.newContext("testString");
        RootContext rootContext = new RootContext(jxContext, NodePointer.newNodePointer(null, "testString", Locale.getDefault()));
        SelfContext selfCtx = new SelfContext(rootContext, new NodeTypeTest(1));

        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpr(selfCtx), new ValueExpr("testString"), false, false, true);
        Object result = expr.computeValue(null);
        Assert.assertNotNull(result);
    }
}
