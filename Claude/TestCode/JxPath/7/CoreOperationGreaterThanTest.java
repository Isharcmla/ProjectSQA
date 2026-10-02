package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for {@link CoreOperationGreaterThan}.
 *
 * หมายเหตุ: เนื่องจาก Expression เป็น abstract class และไม่มีซอร์สโค้ดของ Constant
 * ให้มาโดยตรงใน dependencies แต่ Constant เป็นคลาสมาตรฐานใน package เดียวกัน
 * (org.apache.commons.jxpath.ri.compiler) ที่ implement Expression และใช้สำหรับเก็บค่า literal
 * (double / String) จึงใช้ Constant เป็น concrete implementation ของ Expression
 * เพื่อทดสอบ public API ของ CoreOperationGreaterThan ผ่าน constructor ที่รับ Expression[] เท่านั้น
 */
public class CoreOperationGreaterThanTest {

    // ---------- Normal / typical cases ----------

    @Test
    public void testComputeValue_leftGreaterThanRight_returnsTrue() {
        Constant left = new Constant(5.0);
        Constant right = new Constant(3.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_leftLessThanRight_returnsFalse() {
        Constant left = new Constant(2.0);
        Constant right = new Constant(5.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testGetSymbol_returnsGreaterThanSymbol() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(1.0), new Constant(2.0));
        assertEquals(">", op.getSymbol());
    }

    // ---------- Edge cases: equal values, zero, negative values, non-numeric strings ----------

    @Test
    public void testComputeValue_equalValues_returnsFalse() {
        Constant left = new Constant(4.0);
        Constant right = new Constant(4.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_zeroValues_returnsFalse() {
        Constant left = new Constant(0.0);
        Constant right = new Constant(0.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_negativeValues_returnsTrue() {
        Constant left = new Constant(-1.0);
        Constant right = new Constant(-5.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_negativeAndPositiveValues_returnsFalse() {
        Constant left = new Constant(-1.0);
        Constant right = new Constant(5.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_emptyStringValues_returnsFalse() {
        // empty string converted via InfoSetUtil.doubleValue typically results in NaN,
        // and NaN > NaN evaluates to false
        Constant left = new Constant("");
        Constant right = new Constant("");
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_nonNumericStringValues_returnsFalse() {
        // non-numeric strings converted via InfoSetUtil.doubleValue typically yield NaN,
        // and NaN > NaN is false
        Constant left = new Constant("abc");
        Constant right = new Constant("def");
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_numericStringValues_returnsTrue() {
        Constant left = new Constant("10");
        Constant right = new Constant("5");
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    // ---------- Exception cases ----------

    @Test(expected = NullPointerException.class)
    public void testComputeValue_firstArgumentNull_throwsNullPointerException() {
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(null, new Constant(2.0));
        op.computeValue(null);
    }

    @Test(expected = NullPointerException.class)
    public void testComputeValue_secondArgumentNull_throwsNullPointerException() {
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(new Constant(1.0), null);
        op.computeValue(null);
    }
}
