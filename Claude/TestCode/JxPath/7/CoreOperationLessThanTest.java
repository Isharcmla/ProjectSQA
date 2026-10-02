import org.junit.Test;
import org.junit.Assert;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.Expression;

public class CoreOperationLessThanTest {

    @Test
    public void testComputeValue_leftLessThanRight_returnsTrue() {
        Expression arg1 = new Constant(1.0);
        Expression arg2 = new Constant(2.0);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        Object result = op.computeValue((EvalContext) null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_leftGreaterThanRight_returnsFalse() {
        Expression arg1 = new Constant(5.0);
        Expression arg2 = new Constant(3.0);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        Object result = op.computeValue((EvalContext) null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_equalValues_returnsFalse() {
        Expression arg1 = new Constant(4.0);
        Expression arg2 = new Constant(4.0);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        Object result = op.computeValue((EvalContext) null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_negativeNumbers_returnsTrue() {
        Expression arg1 = new Constant(-10.0);
        Expression arg2 = new Constant(-5.0);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        Object result = op.computeValue((EvalContext) null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_zeroValues_returnsFalse() {
        Expression arg1 = new Constant(0.0);
        Expression arg2 = new Constant(0.0);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        Object result = op.computeValue((EvalContext) null);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_stringNumericValues_returnsTrue() {
        Expression arg1 = new Constant("5");
        Expression arg2 = new Constant("10");
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        Object result = op.computeValue((EvalContext) null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_stringNonNumericValues_returnsFalse() {
        Expression arg1 = new Constant("abc");
        Expression arg2 = new Constant("xyz");
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        Object result = op.computeValue((EvalContext) null);
        // NaN comparisons are always false
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_emptyStringValues_returnsFalse() {
        Expression arg1 = new Constant("");
        Expression arg2 = new Constant("");
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        Object result = op.computeValue((EvalContext) null);
        // Empty strings convert to NaN, NaN < NaN is false
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testGetSymbol_returnsLessThanSign() {
        Expression arg1 = new Constant(1.0);
        Expression arg2 = new Constant(2.0);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        Assert.assertEquals("<", op.getSymbol());
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValue_nullArgument_throwsNullPointerException() {
        CoreOperationLessThan op = new CoreOperationLessThan(null, new Constant(1.0));
        op.computeValue((EvalContext) null);
    }

    @Test
    public void testConstructor_createsInstanceSuccessfully() {
        Expression arg1 = new Constant(1.0);
        Expression arg2 = new Constant(2.0);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        Assert.assertNotNull(op);
    }
}
