import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.junit.Assert;
import org.junit.Test;

public class CoreOperationGreaterThanOrEqualTest {

    @Test
    public void testComputeValue_leftGreaterThanRight_returnsTrue() {
        Expression left = new Constant(10);
        Expression right = new Constant(5);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);

        Object result = op.computeValue(null);

        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_leftLessThanRight_returnsFalse() {
        Expression left = new Constant(3);
        Expression right = new Constant(5);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);

        Object result = op.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_equalValues_returnsTrue() {
        Expression left = new Constant(5);
        Expression right = new Constant(5);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);

        Object result = op.computeValue(null);

        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_negativeNumbers_returnsTrue() {
        Expression left = new Constant(-5);
        Expression right = new Constant(-10);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);

        Object result = op.computeValue(null);

        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_negativeNumbers_returnsFalse() {
        Expression left = new Constant(-10);
        Expression right = new Constant(-5);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);

        Object result = op.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_zeroValues_returnsTrue() {
        Expression left = new Constant(0);
        Expression right = new Constant(0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);

        Object result = op.computeValue(null);

        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_stringNumericValues_returnsTrue() {
        Expression left = new Constant("10");
        Expression right = new Constant("5");
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);

        Object result = op.computeValue(null);

        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_stringNumericValues_returnsFalse() {
        Expression left = new Constant("5");
        Expression right = new Constant("10");
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);

        Object result = op.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_emptyStringAsNonNumeric_returnsFalse() {
        // Empty string cannot be parsed to a number and is expected to be
        // treated as NaN by InfoSetUtil.doubleValue, so the comparison
        // should evaluate to false regardless of the right hand side value.
        Expression left = new Constant("");
        Expression right = new Constant("0");
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(left, right);

        Object result = op.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testGetSymbol_returnsGreaterThanOrEqualSymbol() {
        CoreOperationGreaterThanOrEqual op =
                new CoreOperationGreaterThanOrEqual(new Constant(1), new Constant(1));

        String symbol = op.getSymbol();

        Assert.assertEquals(">=", symbol);
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValue_nullLeftArgument_throwsNullPointerException() {
        CoreOperationGreaterThanOrEqual op =
                new CoreOperationGreaterThanOrEqual(null, new Constant(5));

        op.computeValue(null);
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValue_nullRightArgument_throwsNullPointerException() {
        CoreOperationGreaterThanOrEqual op =
                new CoreOperationGreaterThanOrEqual(new Constant(5), null);

        op.computeValue(null);
    }
}
