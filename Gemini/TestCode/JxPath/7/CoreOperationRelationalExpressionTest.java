package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.Assert;
import org.junit.Test;

public class CoreOperationRelationalExpressionTest {

    private static class ConcreteRelationalExpression extends CoreOperationRelationalExpression {
        public ConcreteRelationalExpression(Expression[] args) {
            super(args);
        }

        public Object computeValue(EvalContext context) {
            return null;
        }

        public String getSymbol() {
            return "<";
        }
    }

    @Test
    public void testGetPrecedence_normalCase_returnsThree() {
        Expression[] args = new Expression[] { new Constant("a"), new Constant("b") };
        ConcreteRelationalExpression expr = new ConcreteRelationalExpression(args);
        Assert.assertEquals(3, expr.getPrecedence());
    }

    @Test
    public void testIsSymmetric_normalCase_returnsFalse() {
        Expression[] args = new Expression[] { new Constant(1), new Constant(2) };
        ConcreteRelationalExpression expr = new ConcreteRelationalExpression(args);
        Assert.assertFalse(expr.isSymmetric());
    }

    @Test
    public void testConstructor_withNullArgs_initializesSuccessfully() {
        ConcreteRelationalExpression expr = new ConcreteRelationalExpression(null);
        Assert.assertNull(expr.getArguments());
        Assert.assertEquals(3, expr.getPrecedence());
        Assert.assertFalse(expr.isSymmetric());
    }

    @Test
    public void testConstructor_withEmptyArgs_initializesSuccessfully() {
        Expression[] args = new Expression[0];
        ConcreteRelationalExpression expr = new ConcreteRelationalExpression(args);
        Assert.assertNotNull(expr.getArguments());
        Assert.assertEquals(0, expr.getArguments().length);
    }

    @Test
    public void testConstructor_withElementsIncludingNull_initializesSuccessfully() {
        Expression[] args = new Expression[] { null, new Constant("") };
        ConcreteRelationalExpression expr = new ConcreteRelationalExpression(args);
        Assert.assertEquals(2, expr.getArguments().length);
        Assert.assertNull(expr.getArguments()[0]);
        Assert.assertNotNull(expr.getArguments()[1]);
    }

    @Test
    public void testConstructor_withNegativeAndZeroConstants_initializesSuccessfully() {
        Expression[] args = new Expression[] { new Constant(-1), new Constant(0) };
        ConcreteRelationalExpression expr = new ConcreteRelationalExpression(args);
        Assert.assertEquals(2, expr.getArguments().length);
        Assert.assertEquals(3, expr.getPrecedence());
        Assert.assertFalse(expr.isSymmetric());
    }
}
