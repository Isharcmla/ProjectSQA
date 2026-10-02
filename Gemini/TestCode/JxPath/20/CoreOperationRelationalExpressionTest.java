package org.apache.commons.jxpath.ri.compiler;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.junit.Assert;
import org.junit.Test;

public class CoreOperationRelationalExpressionTest {

    private static class TestRelationalExpression extends CoreOperationRelationalExpression {
        private final int mode; // 0: <, 1: <=, 2: >, 3: >=, 4: ==

        public TestRelationalExpression(Expression left, Expression right, int mode) {
            super(new Expression[]{left, right});
            this.mode = mode;
        }

        public TestRelationalExpression(Expression[] args) {
            super(args);
            this.mode = 0;
        }

        public String getSymbol() {
            return "<";
        }

        protected boolean evaluateCompare(int compare) {
            switch (mode) {
                case 0:
                    return compare < 0;
                case 1:
                    return compare <= 0;
                case 2:
                    return compare > 0;
                case 3:
                    return compare >= 0;
                case 4:
                    return compare == 0;
                default:
                    return false;
            }
        }
    }

    private static class ValueExpression extends Expression {
        private final Object value;

        public ValueExpression(Object value) {
            this.value = value;
        }

        public Object compute(EvalContext context) {
            return value;
        }

        public Object computeValue(EvalContext context) {
            return value;
        }
    }

    @Test
    public void testGetPrecedence_returnsRelationalExprPrecedence() {
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(1), new ValueExpression(2), 0);
        Assert.assertEquals(CoreOperation.RELATIONAL_EXPR_PRECEDENCE, expr.getPrecedence());
    }

    @Test
    public void testIsSymmetric_returnsFalse() {
        TestRelationalExpression expr = new TestRelationalExpression(
                new ValueExpression(1), new ValueExpression(2), 0);
        Assert.assertFalse(expr.isSymmetric());
    }

    @Test
    public void testComputeValue_lessThan_trueAndFalse() {
        TestRelationalExpression lessThanTrue = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(5.0)), new ValueExpression(Double.valueOf(10.0)), 0);
        Assert.assertEquals(Boolean.TRUE, lessThanTrue.computeValue(null));

        TestRelationalExpression lessThanFalse = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(10.0)), new ValueExpression(Double.valueOf(5.0)), 0);
        Assert.assertEquals(Boolean.FALSE, lessThanFalse.computeValue(null));

        TestRelationalExpression lessThanEqual = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(5.0)), new ValueExpression(Double.valueOf(5.0)), 0);
        Assert.assertEquals(Boolean.FALSE, lessThanEqual.computeValue(null));
    }

    @Test
    public void testComputeValue_lessThanOrEqual_trueAndFalse() {
        TestRelationalExpression lteTrueEqual = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(5.0)), new ValueExpression(Double.valueOf(5.0)), 1);
        Assert.assertEquals(Boolean.TRUE, lteTrueEqual.computeValue(null));

        TestRelationalExpression lteTrueLess = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(3.0)), new ValueExpression(Double.valueOf(5.0)), 1);
        Assert.assertEquals(Boolean.TRUE, lteTrueLess.computeValue(null));

        TestRelationalExpression lteFalse = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(7.0)), new ValueExpression(Double.valueOf(5.0)), 1);
        Assert.assertEquals(Boolean.FALSE, lteFalse.computeValue(null));
    }

    @Test
    public void testComputeValue_greaterThan_trueAndFalse() {
        TestRelationalExpression gtTrue = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(10.0)), new ValueExpression(Double.valueOf(5.0)), 2);
        Assert.assertEquals(Boolean.TRUE, gtTrue.computeValue(null));

        TestRelationalExpression gtFalse = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(5.0)), new ValueExpression(Double.valueOf(10.0)), 2);
        Assert.assertEquals(Boolean.FALSE, gtFalse.computeValue(null));
    }

    @Test
    public void testComputeValue_greaterThanOrEqual_trueAndFalse() {
        TestRelationalExpression gteTrue = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(5.0)), new ValueExpression(Double.valueOf(5.0)), 3);
        Assert.assertEquals(Boolean.TRUE, gteTrue.computeValue(null));

        TestRelationalExpression gteFalse = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(4.0)), new ValueExpression(Double.valueOf(5.0)), 3);
        Assert.assertEquals(Boolean.FALSE, gteFalse.computeValue(null));
    }

    @Test
    public void testComputeValue_equalComparison_mode() {
        TestRelationalExpression eqTrue = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(5.0)), new ValueExpression(Double.valueOf(5.0)), 4);
        Assert.assertEquals(Boolean.TRUE, eqTrue.computeValue(null));

        TestRelationalExpression eqFalse = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(5.0)), new ValueExpression(Double.valueOf(6.0)), 4);
        Assert.assertEquals(Boolean.FALSE, eqFalse.computeValue(null));
    }

    @Test
    public void testComputeValue_nanHandling() {
        TestRelationalExpression leftNaN = new TestRelationalExpression(
                new ValueExpression("not_a_number"), new ValueExpression(Double.valueOf(5.0)), 0);
        Assert.assertEquals(Boolean.FALSE, leftNaN.computeValue(null));

        TestRelationalExpression rightNaN = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(5.0)), new ValueExpression("not_a_number"), 0);
        Assert.assertEquals(Boolean.FALSE, rightNaN.computeValue(null));

        TestRelationalExpression bothNaN = new TestRelationalExpression(
                new ValueExpression("invalid_left"), new ValueExpression("invalid_right"), 0);
        Assert.assertEquals(Boolean.FALSE, bothNaN.computeValue(null));
    }

    @Test
    public void testComputeValue_negativeAndZeroValues() {
        TestRelationalExpression negativeTest = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(-10.0)), new ValueExpression(Double.valueOf(-5.0)), 0);
        Assert.assertEquals(Boolean.TRUE, negativeTest.computeValue(null));

        TestRelationalExpression zeroTest = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(0.0)), new ValueExpression(Double.valueOf(-0.0)), 4);
        Assert.assertEquals(Boolean.TRUE, zeroTest.computeValue(null));
    }

    @Test
    public void testComputeValue_leftIterator_containsMatch() {
        Iterator leftItMatch = Arrays.asList(Double.valueOf(10.0), Double.valueOf(2.0)).iterator();
        TestRelationalExpression exprMatch = new TestRelationalExpression(
                new ValueExpression(leftItMatch), new ValueExpression(Double.valueOf(5.0)), 0);
        Assert.assertEquals(Boolean.TRUE, exprMatch.computeValue(null));

        Iterator leftItNoMatch = Arrays.asList(Double.valueOf(10.0), Double.valueOf(20.0)).iterator();
        TestRelationalExpression exprNoMatch = new TestRelationalExpression(
                new ValueExpression(leftItNoMatch), new ValueExpression(Double.valueOf(5.0)), 0);
        Assert.assertEquals(Boolean.FALSE, exprNoMatch.computeValue(null));
    }

    @Test
    public void testComputeValue_rightIterator_containsMatch() {
        Iterator rightItMatch = Arrays.asList(Double.valueOf(2.0), Double.valueOf(10.0)).iterator();
        TestRelationalExpression exprMatch = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(5.0)), new ValueExpression(rightItMatch), 0);
        Assert.assertEquals(Boolean.TRUE, exprMatch.computeValue(null));

        Iterator rightItNoMatch = Arrays.asList(Double.valueOf(1.0), Double.valueOf(2.0)).iterator();
        TestRelationalExpression exprNoMatch = new TestRelationalExpression(
                new ValueExpression(Double.valueOf(5.0)), new ValueExpression(rightItNoMatch), 0);
        Assert.assertEquals(Boolean.FALSE, exprNoMatch.computeValue(null));
    }

    @Test
    public void testComputeValue_bothIterators_findMatch() {
        Iterator leftIt = Arrays.asList(Double.valueOf(10.0), Double.valueOf(20.0)).iterator();
        Iterator rightIt = Arrays.asList(Double.valueOf(5.0), Double.valueOf(15.0)).iterator();
        TestRelationalExpression exprMatch = new TestRelationalExpression(
                new ValueExpression(leftIt), new ValueExpression(rightIt), 0);
        Assert.assertEquals(Boolean.TRUE, exprMatch.computeValue(null));

        Iterator leftItNoMatch = Arrays.asList(Double.valueOf(20.0), Double.valueOf(30.0)).iterator();
        Iterator rightItNoMatch = Arrays.asList(Double.valueOf(1.0), Double.valueOf(2.0)).iterator();
        TestRelationalExpression exprNoMatch = new TestRelationalExpression(
                new ValueExpression(leftItNoMatch), new ValueExpression(rightItNoMatch), 0);
        Assert.assertEquals(Boolean.FALSE, exprNoMatch.computeValue(null));
    }

    @Test
    public void testComputeValue_collectionsReducedToIterators() {
        TestRelationalExpression collectionMatch = new TestRelationalExpression(
                new ValueExpression(Arrays.asList(Double.valueOf(10.0), Double.valueOf(2.0))),
                new ValueExpression(Double.valueOf(5.0)), 0);
        Assert.assertEquals(Boolean.TRUE, collectionMatch.computeValue(null));

        TestRelationalExpression collectionBoth = new TestRelationalExpression(
                new ValueExpression(Arrays.asList(Double.valueOf(10.0), Double.valueOf(20.0))),
                new ValueExpression(Arrays.asList(Double.valueOf(5.0), Double.valueOf(15.0))), 0);
        Assert.assertEquals(Boolean.TRUE, collectionBoth.computeValue(null));

        TestRelationalExpression emptyCollection = new TestRelationalExpression(
                new ValueExpression(Collections.emptyList()),
                new ValueExpression(Double.valueOf(5.0)), 0);
        Assert.assertEquals(Boolean.FALSE, emptyCollection.computeValue(null));
    }

    @Test
    public void testComputeValue_initialContextAndSelfContext() {
        JXPathContextReferenceImpl jxContext = (JXPathContextReferenceImpl) JXPathContext.newContext(Double.valueOf(10.0));
        BeanPointer ptr1 = new BeanPointer(new QName("test1"), Double.valueOf(3.0), null, Locale.getDefault());
        BeanPointer ptr2 = new BeanPointer(new QName("test2"), Double.valueOf(8.0), null, Locale.getDefault());

        RootContext root1 = new RootContext(jxContext, ptr1);
        RootContext root2 = new RootContext(jxContext, ptr2);

        InitialContext initCtx1 = new InitialContext(root1);
        InitialContext initCtx2 = new InitialContext(root2);

        TestRelationalExpression initCtxExpr = new TestRelationalExpression(
                new ValueExpression(initCtx1), new ValueExpression(initCtx2), 0);
        Assert.assertEquals(Boolean.TRUE, initCtxExpr.computeValue(null));

        SelfContext selfCtx1 = new SelfContext(initCtx1, new NodeTypeTest(1));
        SelfContext selfCtx2 = new SelfContext(initCtx2, new NodeTypeTest(1));

        TestRelationalExpression selfCtxExpr = new TestRelationalExpression(
                new ValueExpression(selfCtx1), new ValueExpression(selfCtx2), 0);
        Assert.assertEquals(Boolean.TRUE, selfCtxExpr.computeValue(null));
    }

    @Test
    public void testConstructor_withExpressionArray() {
        Expression[] args = new Expression[]{
                new ValueExpression(Double.valueOf(1.0)),
                new ValueExpression(Double.valueOf(2.0))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args);
        Assert.assertEquals(Boolean.TRUE, expr.computeValue(null));
    }
}
