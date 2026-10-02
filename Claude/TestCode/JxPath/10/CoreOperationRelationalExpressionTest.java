package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.Test;

/**
 * Test suite for {@link CoreOperationRelationalExpression}.
 *
 * NOTE: The real classes {@code Expression} and {@code EvalContext} used by
 * {@code CoreOperationRelationalExpression} are not fully documented in the
 * provided source. Based on the method calls made directly inside the class
 * under test (e.g. {@code args[0].computeValue(context)}), we know that
 * {@code Expression} must expose a public method
 * {@code computeValue(EvalContext context)}. A minimal test-only subclass of
 * {@code Expression} is created below that only relies on this known
 * contract. An additional method {@code isContextDependent()} is provided
 * (without {@code @Override}) purely as a defensive measure in case the real
 * {@code Expression} class declares it as abstract; this does not affect
 * compilation if the method does not actually exist in the parent class.
 */
public class CoreOperationRelationalExpressionTest {

    /**
     * Minimal helper Expression implementation that simply returns a fixed
     * value when computeValue is invoked. This is only used to drive the
     * logic inside CoreOperationRelationalExpression.compute().
     */
    static class ValueExpression extends Expression {
        private final Object value;

        ValueExpression(Object value) {
            this.value = value;
        }

        public Object computeValue(EvalContext context) {
            return value;
        }

        // Defensive extra method - only used if Expression declares this as
        // abstract; harmless otherwise since there is no @Override.
        public boolean isContextDependent() {
            return false;
        }
    }

    /** Concrete subclass simulating the ">" operator. */
    static class GreaterThanExpr extends CoreOperationRelationalExpression {
        GreaterThanExpr(Expression[] args) {
            super(args);
        }

        protected boolean evaluateCompare(int compare) {
            return compare > 0;
        }
    }

    /** Concrete subclass simulating the "<" operator. */
    static class LessThanExpr extends CoreOperationRelationalExpression {
        LessThanExpr(Expression[] args) {
            super(args);
        }

        protected boolean evaluateCompare(int compare) {
            return compare < 0;
        }
    }

    // ---------------------------------------------------------------
    // Normal / typical cases
    // ---------------------------------------------------------------

    @Test
    public void testComputeValue_greaterThanTrue_returnsTrue() {
        Expression[] args = { new ValueExpression(5.0), new ValueExpression(3.0) };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        assertEquals(Boolean.TRUE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_greaterThanFalse_returnsFalse() {
        Expression[] args = { new ValueExpression(2.0), new ValueExpression(3.0) };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_lessThanTrue_returnsTrue() {
        Expression[] args = { new ValueExpression(1.0), new ValueExpression(10.0) };
        LessThanExpr expr = new LessThanExpr(args);
        assertEquals(Boolean.TRUE, expr.computeValue(null));
    }

    // ---------------------------------------------------------------
    // Edge cases: equal values, negative numbers, zero boundary, NaN
    // ---------------------------------------------------------------

    @Test
    public void testComputeValue_equalValues_greaterThanIsFalse() {
        Expression[] args = { new ValueExpression(3.0), new ValueExpression(3.0) };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_equalValues_lessThanIsFalse() {
        Expression[] args = { new ValueExpression(3.0), new ValueExpression(3.0) };
        LessThanExpr expr = new LessThanExpr(args);
        assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_negativeNumbers_greaterThanTrue() {
        Expression[] args = { new ValueExpression(-5.0), new ValueExpression(-10.0) };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        assertEquals(Boolean.TRUE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_zeroBoundary_equalIsNotGreater() {
        Expression[] args = { new ValueExpression(0.0), new ValueExpression(0.0) };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_leftIsNaN_returnsFalse() {
        Expression[] args = { new ValueExpression("not-a-number"), new ValueExpression(3.0) };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_rightIsNaN_returnsFalse() {
        Expression[] args = { new ValueExpression(3.0), new ValueExpression("not-a-number") };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_emptyStringOperand_treatedAsNaN_returnsFalse() {
        Expression[] args = { new ValueExpression(""), new ValueExpression(1.0) };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    // ---------------------------------------------------------------
    // Iterator / Collection handling branches
    // ---------------------------------------------------------------

    @Test
    public void testComputeValue_bothIterators_noMatch_returnsFalse() {
        List<Double> leftList = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> rightList = Arrays.asList(3.0, 4.0, 5.0);
        Expression[] args = {
                new ValueExpression(leftList.iterator()),
                new ValueExpression(rightList.iterator())
        };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        // No left element is strictly greater than any right element here.
        assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_bothIterators_withMatch_returnsTrue() {
        List<Double> leftList = Arrays.asList(5.0, 2.0, 3.0);
        List<Double> rightList = Arrays.asList(1.0, 10.0, 20.0);
        Expression[] args = {
                new ValueExpression(leftList.iterator()),
                new ValueExpression(rightList.iterator())
        };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        // 5.0 > 1.0 => match found
        assertEquals(Boolean.TRUE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_leftIteratorRightValue_matchFound_returnsTrue() {
        List<Double> leftList = Arrays.asList(1.0, 2.0, 3.0);
        Expression[] args = {
                new ValueExpression(leftList.iterator()),
                new ValueExpression(2.0)
        };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        // 3.0 > 2.0 => match found
        assertEquals(Boolean.TRUE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_leftValueRightIterator_matchFound_returnsTrue() {
        List<Double> rightList = Arrays.asList(5.0, 6.0);
        Expression[] args = {
                new ValueExpression(1.0),
                new ValueExpression(rightList.iterator())
        };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        // 5.0 > 1.0 => match found
        assertEquals(Boolean.TRUE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_leftValueRightIterator_noMatch_returnsFalse() {
        List<Double> rightList = Arrays.asList(1.0, 2.0, 3.0);
        Expression[] args = {
                new ValueExpression(5.0),
                new ValueExpression(rightList.iterator())
        };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        // none of right elements is > 5.0
        assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_leftCollectionRightValue_reducedToIterator_returnsTrue() {
        List<Double> leftList = new ArrayList<Double>();
        leftList.add(5.0);
        leftList.add(6.0);
        Expression[] args = {
                new ValueExpression(leftList),
                new ValueExpression(1.0)
        };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        // Collection should be reduced to an Iterator internally
        assertEquals(Boolean.TRUE, expr.computeValue(null));
    }

    @Test
    public void testComputeValue_rightCollectionLeftValue_reducedToIterator_returnsFalse() {
        List<Double> rightList = new ArrayList<Double>();
        rightList.add(1.0);
        rightList.add(2.0);
        Expression[] args = {
                new ValueExpression(10.0),
                new ValueExpression(rightList)
        };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        // none of right elements is > 10.0
        assertEquals(Boolean.FALSE, expr.computeValue(null));
    }

    // ---------------------------------------------------------------
    // protected/final method coverage: getPrecedence, isSymmetric
    // ---------------------------------------------------------------

    @Test
    public void testGetPrecedence_returnsThree() {
        Expression[] args = { new ValueExpression(1.0), new ValueExpression(2.0) };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        assertEquals(3, expr.getPrecedence());
    }

    @Test
    public void testIsSymmetric_returnsFalse() {
        Expression[] args = { new ValueExpression(1.0), new ValueExpression(2.0) };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        assertFalse(expr.isSymmetric());
    }

    // ---------------------------------------------------------------
    // Direct coverage of evaluateCompare implementations
    // ---------------------------------------------------------------

    @Test
    public void testEvaluateCompare_greaterThan_variousCompareValues() {
        Expression[] args = { new ValueExpression(1.0), new ValueExpression(2.0) };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        assertTrue(expr.evaluateCompare(1));
        assertFalse(expr.evaluateCompare(0));
        assertFalse(expr.evaluateCompare(-1));
    }

    @Test
    public void testEvaluateCompare_lessThan_variousCompareValues() {
        Expression[] args = { new ValueExpression(1.0), new ValueExpression(2.0) };
        LessThanExpr expr = new LessThanExpr(args);
        assertTrue(expr.evaluateCompare(-1));
        assertFalse(expr.evaluateCompare(0));
        assertFalse(expr.evaluateCompare(1));
    }

    // ---------------------------------------------------------------
    // Exception case: insufficient number of arguments supplied
    // ---------------------------------------------------------------

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testComputeValue_insufficientArgs_throwsArrayIndexOutOfBoundsException() {
        // Only one argument supplied, but computeValue accesses args[0] and args[1]
        Expression[] args = { new ValueExpression(1.0) };
        GreaterThanExpr expr = new GreaterThanExpr(args);
        expr.computeValue(null);
    }
}
