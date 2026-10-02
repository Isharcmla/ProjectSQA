package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.apache.commons.lang.math.NumberUtils;
import org.junit.Test;

public class BooleanUtilsTest {

    @Test
    public void testConstructor() {
        assertNotNull(new BooleanUtils());
    }

    // negate(Boolean)
    @Test
    public void testNegate_null_returnsNull() {
        assertNull(BooleanUtils.negate(null));
    }

    @Test
    public void testNegate_true_returnsFalse() {
        assertSame(Boolean.FALSE, BooleanUtils.negate(Boolean.TRUE));
    }

    @Test
    public void testNegate_false_returnsTrue() {
        assertSame(Boolean.TRUE, BooleanUtils.negate(Boolean.FALSE));
    }

    // isTrue(Boolean)
    @Test
    public void testIsTrue_null_returnsFalse() {
        assertFalse(BooleanUtils.isTrue(null));
    }

    @Test
    public void testIsTrue_true_returnsTrue() {
        assertTrue(BooleanUtils.isTrue(Boolean.TRUE));
    }

    @Test
    public void testIsTrue_false_returnsFalse() {
        assertFalse(BooleanUtils.isTrue(Boolean.FALSE));
    }

    // isNotTrue(Boolean)
    @Test
    public void testIsNotTrue_null_returnsTrue() {
        assertTrue(BooleanUtils.isNotTrue(null));
    }

    @Test
    public void testIsNotTrue_true_returnsFalse() {
        assertFalse(BooleanUtils.isNotTrue(Boolean.TRUE));
    }

    @Test
    public void testIsNotTrue_false_returnsTrue() {
        assertTrue(BooleanUtils.isNotTrue(Boolean.FALSE));
    }

    // isFalse(Boolean)
    @Test
    public void testIsFalse_null_returnsFalse() {
        assertFalse(BooleanUtils.isFalse(null));
    }

    @Test
    public void testIsFalse_true_returnsFalse() {
        assertFalse(BooleanUtils.isFalse(Boolean.TRUE));
    }

    @Test
    public void testIsFalse_false_returnsTrue() {
        assertTrue(BooleanUtils.isFalse(Boolean.FALSE));
    }

    // isNotFalse(Boolean)
    @Test
    public void testIsNotFalse_null_returnsTrue() {
        assertTrue(BooleanUtils.isNotFalse(null));
    }

    @Test
    public void testIsNotFalse_true_returnsTrue() {
        assertTrue(BooleanUtils.isNotFalse(Boolean.TRUE));
    }

    @Test
    public void testIsNotFalse_false_returnsFalse() {
        assertFalse(BooleanUtils.isNotFalse(Boolean.FALSE));
    }

    // toBooleanObject(boolean)
    @Test
    public void testToBooleanObject_boolean_returnsBooleanObject() {
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(true));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject(false));
    }

    // toBoolean(Boolean)
    @Test
    public void testToBoolean_Boolean_returnsPrimitive() {
        assertFalse(BooleanUtils.toBoolean((Boolean) null));
        assertTrue(BooleanUtils.toBoolean(Boolean.TRUE));
        assertFalse(BooleanUtils.toBoolean(Boolean.FALSE));
    }

    // toBooleanDefaultIfNull(Boolean, boolean)
    @Test
    public void testToBooleanDefaultIfNull_validInput_returnsExpected() {
        assertTrue(BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false));
        assertFalse(BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true));
        assertTrue(BooleanUtils.toBooleanDefaultIfNull(null, true));
        assertFalse(BooleanUtils.toBooleanDefaultIfNull(null, false));
    }

    // toBoolean(int)
    @Test
    public void testToBoolean_int_returnsPrimitive() {
        assertFalse(BooleanUtils.toBoolean(0));
        assertTrue(BooleanUtils.toBoolean(1));
        assertTrue(BooleanUtils.toBoolean(-1));
        assertTrue(BooleanUtils.toBoolean(100));
    }

    // toBooleanObject(int)
    @Test
    public void testToBooleanObject_int_returnsBooleanObject() {
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject(0));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(1));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(-1));
    }

    // toBooleanObject(Integer)
    @Test
    public void testToBooleanObject_Integer_returnsBooleanObject() {
        assertNull(BooleanUtils.toBooleanObject((Integer) null));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject(new Integer(0)));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(new Integer(1)));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(new Integer(-1)));
    }

    // toBoolean(int, int, int)
    @Test
    public void testToBoolean_int_matchingValues_returnsBoolean() {
        assertTrue(BooleanUtils.toBoolean(1, 1, 2));
        assertFalse(BooleanUtils.toBoolean(2, 1, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBoolean_int_noMatch_throwsException() {
        BooleanUtils.toBoolean(3, 1, 2);
    }

    // toBoolean(Integer, Integer, Integer)
    @Test
    public void testToBoolean_Integer_matchingValues_returnsBoolean() {
        assertTrue(BooleanUtils.toBoolean((Integer) null, null, new Integer(2)));
        assertFalse(BooleanUtils.toBoolean((Integer) null, new Integer(1), null));
        assertTrue(BooleanUtils.toBoolean(new Integer(1), new Integer(1), new Integer(2)));
        assertFalse(BooleanUtils.toBoolean(new Integer(2), new Integer(1), new Integer(2)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBoolean_Integer_nullMismatch_throwsException() {
        BooleanUtils.toBoolean((Integer) null, new Integer(1), new Integer(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBoolean_Integer_nonNullMismatch_throwsException() {
        BooleanUtils.toBoolean(new Integer(3), new Integer(1), new Integer(2));
    }

    // toBooleanObject(int, int, int, int)
    @Test
    public void testToBooleanObject_int_matchingValues_returnsBooleanObject() {
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(1, 1, 2, 3));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject(2, 1, 2, 3));
        assertNull(BooleanUtils.toBooleanObject(3, 1, 2, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObject_int_noMatch_throwsException() {
        BooleanUtils.toBooleanObject(4, 1, 2, 3);
    }

    // toBooleanObject(Integer, Integer, Integer, Integer)
    @Test
    public void testToBooleanObject_Integer_matchingValues_returnsBooleanObject() {
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject((Integer) null, null, new Integer(2), new Integer(3)));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject((Integer) null, new Integer(1), null, new Integer(3)));
        assertNull(BooleanUtils.toBooleanObject((Integer) null, new Integer(1), new Integer(2), null));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(new Integer(1), new Integer(1), new Integer(2), new Integer(3)));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject(new Integer(2), new Integer(1), new Integer(2), new Integer(3)));
        assertNull(BooleanUtils.toBooleanObject(new Integer(3), new Integer(1), new Integer(2), new Integer(3)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObject_Integer_nullMismatch_throwsException() {
        BooleanUtils.toBooleanObject((Integer) null, new Integer(1), new Integer(2), new Integer(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObject_Integer_nonNullMismatch_throwsException() {
        BooleanUtils.toBooleanObject(new Integer(4), new Integer(1), new Integer(2), new Integer(3));
    }

    // toInteger(boolean)
    @Test
    public void testToInteger_boolean_returnsInt() {
        assertEquals(1, BooleanUtils.toInteger(true));
        assertEquals(0, BooleanUtils.toInteger(false));
    }

    // toIntegerObject(boolean)
    @Test
    public void testToIntegerObject_boolean_returnsInteger() {
        assertEquals(NumberUtils.INTEGER_ONE, BooleanUtils.toIntegerObject(true));
        assertEquals(NumberUtils.INTEGER_ZERO, BooleanUtils.toIntegerObject(false));
    }

    // toIntegerObject(Boolean)
    @Test
    public void testToIntegerObject_Boolean_returnsInteger() {
        assertNull(BooleanUtils.toIntegerObject((Boolean) null));
        assertEquals(NumberUtils.INTEGER_ONE, BooleanUtils.toIntegerObject(Boolean.TRUE));
        assertEquals(NumberUtils.INTEGER_ZERO, BooleanUtils.toIntegerObject(Boolean.FALSE));
    }

    // toInteger(boolean, int, int)
    @Test
    public void testToInteger_boolean_trueFalseValues_returnsInt() {
        assertEquals(10, BooleanUtils.toInteger(true, 10, 20));
        assertEquals(20, BooleanUtils.toInteger(false, 10, 20));
    }

    // toInteger(Boolean, int, int, int)
    @Test
    public void testToInteger_Boolean_threeValues_returnsInt() {
        assertEquals(10, BooleanUtils.toInteger(Boolean.TRUE, 10, 20, 30));
        assertEquals(20, BooleanUtils.toInteger(Boolean.FALSE, 10, 20, 30));
        assertEquals(30, BooleanUtils.toInteger(null, 10, 20, 30));
    }

    // toIntegerObject(boolean, Integer, Integer)
    @Test
    public void testToIntegerObject_boolean_trueFalseValues_returnsInteger() {
        Integer trueVal = new Integer(10);
        Integer falseVal = new Integer(20);
        assertSame(trueVal, BooleanUtils.toIntegerObject(true, trueVal, falseVal));
        assertSame(falseVal, BooleanUtils.toIntegerObject(false, trueVal, falseVal));
    }

    // toIntegerObject(Boolean, Integer, Integer, Integer)
    @Test
    public void testToIntegerObject_Boolean_threeValues_returnsInteger() {
        Integer trueVal = new Integer(10);
        Integer falseVal = new Integer(20);
        Integer nullVal = new Integer(30);
        assertSame(trueVal, BooleanUtils.toIntegerObject(Boolean.TRUE, trueVal, falseVal, nullVal));
        assertSame(falseVal, BooleanUtils.toIntegerObject(Boolean.FALSE, trueVal, falseVal, nullVal));
        assertSame(nullVal, BooleanUtils.toIntegerObject(null, trueVal, falseVal, nullVal));
    }

    // toBooleanObject(String)
    @Test
    public void testToBooleanObject_String_returnsBooleanObject() {
        assertNull(BooleanUtils.toBooleanObject((String) null));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("true"));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("TRUE"));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("false"));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("FALSE"));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("on"));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("ON"));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("off"));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("OFF"));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("yes"));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("YES"));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("no"));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("NO"));
        assertNull(BooleanUtils.toBooleanObject(""));
        assertNull(BooleanUtils.toBooleanObject("other"));
    }

    // toBooleanObject(String, String, String, String)
    @Test
    public void testToBooleanObject_String_fourValues_returnsBooleanObject() {
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(null, null, "f", "n"));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject(null, "t", null, "n"));
        assertNull(BooleanUtils.toBooleanObject(null, "t", "f", null));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("t", "t", "f", "n"));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("f", "t", "f", "n"));
        assertNull(BooleanUtils.toBooleanObject("n", "t", "f", "n"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObject_String_nullMismatch_throwsException() {
        BooleanUtils.toBooleanObject(null, "t", "f", "n");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObject_String_nonNullMismatch_throwsException() {
        BooleanUtils.toBooleanObject("invalid", "t", "f", "n");
    }

    // toBoolean(String)
    @Test
    public void testToBoolean_String_returnsPrimitive() {
        // null and interned "true"
        assertTrue(BooleanUtils.toBoolean("true"));
        assertFalse(BooleanUtils.toBoolean((String) null));

        // length 0, 1, > 4
        assertFalse(BooleanUtils.toBoolean(""));
        assertFalse(BooleanUtils.toBoolean("a"));
        assertFalse(BooleanUtils.toBoolean("trues"));

        // length 2: on / ON / combinations / false cases
        assertTrue(BooleanUtils.toBoolean(new String("on")));
        assertTrue(BooleanUtils.toBoolean(new String("oN")));
        assertTrue(BooleanUtils.toBoolean(new String("On")));
        assertTrue(BooleanUtils.toBoolean(new String("ON")));
        assertFalse(BooleanUtils.toBoolean("ox"));
        assertFalse(BooleanUtils.toBoolean("no"));

        // length 3: yes / YES / combinations / false cases
        assertTrue(BooleanUtils.toBoolean(new String("yes")));
        assertTrue(BooleanUtils.toBoolean(new String("yeS")));
        assertTrue(BooleanUtils.toBoolean(new String("yEs")));
        assertTrue(BooleanUtils.toBoolean(new String("yES")));
        assertTrue(BooleanUtils.toBoolean(new String("Yes")));
        assertTrue(BooleanUtils.toBoolean(new String("YeS")));
        assertTrue(BooleanUtils.toBoolean(new String("YEs")));
        assertTrue(BooleanUtils.toBoolean(new String("YES")));
        assertFalse(BooleanUtils.toBoolean("yex"));
        assertFalse(BooleanUtils.toBoolean("Yex"));
        assertFalse(BooleanUtils.toBoolean("abc"));

        // length 4: true / TRUE / combinations / false cases
        assertTrue(BooleanUtils.toBoolean(new String("true")));
        assertTrue(BooleanUtils.toBoolean(new String("truE")));
        assertTrue(BooleanUtils.toBoolean(new String("trUe")));
        assertTrue(BooleanUtils.toBoolean(new String("trUE")));
        assertTrue(BooleanUtils.toBoolean(new String("tRue")));
        assertTrue(BooleanUtils.toBoolean(new String("tRuE")));
        assertTrue(BooleanUtils.toBoolean(new String("tRUe")));
        assertTrue(BooleanUtils.toBoolean(new String("tRUE")));
        assertTrue(BooleanUtils.toBoolean(new String("True")));
        assertTrue(BooleanUtils.toBoolean(new String("TruE")));
        assertTrue(BooleanUtils.toBoolean(new String("TrUe")));
        assertTrue(BooleanUtils.toBoolean(new String("TrUE")));
        assertTrue(BooleanUtils.toBoolean(new String("TRue")));
        assertTrue(BooleanUtils.toBoolean(new String("TRuE")));
        assertTrue(BooleanUtils.toBoolean(new String("TRUe")));
        assertTrue(BooleanUtils.toBoolean(new String("TRUE")));
        assertFalse(BooleanUtils.toBoolean("trux"));
        assertFalse(BooleanUtils.toBoolean("TRUX"));
        assertFalse(BooleanUtils.toBoolean("fake"));
    }

    // toBoolean(String, String, String)
    @Test
    public void testToBoolean_String_matchingValues_returnsBoolean() {
        assertTrue(BooleanUtils.toBoolean(null, null, "f"));
        assertFalse(BooleanUtils.toBoolean(null, "t", null));
        assertTrue(BooleanUtils.toBoolean("t", "t", "f"));
        assertFalse(BooleanUtils.toBoolean("f", "t", "f"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBoolean_String_nullMismatch_throwsException() {
        BooleanUtils.toBoolean(null, "t", "f");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBoolean_String_nonNullMismatch_throwsException() {
        BooleanUtils.toBoolean("x", "t", "f");
    }

    // toStringTrueFalse(Boolean)
    @Test
    public void testToStringTrueFalse_Boolean() {
        assertEquals("true", BooleanUtils.toStringTrueFalse(Boolean.TRUE));
        assertEquals("false", BooleanUtils.toStringTrueFalse(Boolean.FALSE));
        assertNull(BooleanUtils.toStringTrueFalse(null));
    }

    // toStringOnOff(Boolean)
    @Test
    public void testToStringOnOff_Boolean() {
        assertEquals("on", BooleanUtils.toStringOnOff(Boolean.TRUE));
        assertEquals("off", BooleanUtils.toStringOnOff(Boolean.FALSE));
        assertNull(BooleanUtils.toStringOnOff(null));
    }

    // toStringYesNo(Boolean)
    @Test
    public void testToStringYesNo_Boolean() {
        assertEquals("yes", BooleanUtils.toStringYesNo(Boolean.TRUE));
        assertEquals("no", BooleanUtils.toStringYesNo(Boolean.FALSE));
        assertNull(BooleanUtils.toStringYesNo(null));
    }

    // toString(Boolean, String, String, String)
    @Test
    public void testToString_Boolean_fourValues() {
        assertEquals("Y", BooleanUtils.toString(Boolean.TRUE, "Y", "N", "U"));
        assertEquals("N", BooleanUtils.toString(Boolean.FALSE, "Y", "N", "U"));
        assertEquals("U", BooleanUtils.toString(null, "Y", "N", "U"));
        assertNull(BooleanUtils.toString(null, "Y", "N", null));
    }

    // toStringTrueFalse(boolean)
    @Test
    public void testToStringTrueFalse_boolean() {
        assertEquals("true", BooleanUtils.toStringTrueFalse(true));
        assertEquals("false", BooleanUtils.toStringTrueFalse(false));
    }

    // toStringOnOff(boolean)
    @Test
    public void testToStringOnOff_boolean() {
        assertEquals("on", BooleanUtils.toStringOnOff(true));
        assertEquals("off", BooleanUtils.toStringOnOff(false));
    }

    // toStringYesNo(boolean)
    @Test
    public void testToStringYesNo_boolean() {
        assertEquals("yes", BooleanUtils.toStringYesNo(true));
        assertEquals("no", BooleanUtils.toStringYesNo(false));
    }

    // toString(boolean, String, String)
    @Test
    public void testToString_boolean_threeValues() {
        assertEquals("Y", BooleanUtils.toString(true, "Y", "N"));
        assertEquals("N", BooleanUtils.toString(false, "Y", "N"));
    }

    // xor(boolean[])
    @Test
    public void testXor_primitiveArray_validInputs() {
        assertTrue(BooleanUtils.xor(new boolean[] { true }));
        assertFalse(BooleanUtils.xor(new boolean[] { false }));
        assertTrue(BooleanUtils.xor(new boolean[] { true, false }));
        assertTrue(BooleanUtils.xor(new boolean[] { false, true }));
        assertFalse(BooleanUtils.xor(new boolean[] { true, true }));
        assertFalse(BooleanUtils.xor(new boolean[] { false, false }));
        assertTrue(BooleanUtils.xor(new boolean[] { false, true, false }));
        assertFalse(BooleanUtils.xor(new boolean[] { true, false, true }));
        assertFalse(BooleanUtils.xor(new boolean[] { true, true, true }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testXor_primitiveArray_null_throwsException() {
        BooleanUtils.xor((boolean[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testXor_primitiveArray_empty_throwsException() {
        BooleanUtils.xor(new boolean[0]);
    }

    // xor(Boolean[])
    @Test
    public void testXor_objectArray_validInputs() {
        assertSame(Boolean.TRUE, BooleanUtils.xor(new Boolean[] { Boolean.TRUE }));
        assertSame(Boolean.FALSE, BooleanUtils.xor(new Boolean[] { Boolean.FALSE }));
        assertSame(Boolean.TRUE, BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE }));
        assertSame(Boolean.FALSE, BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE }));
        assertSame(Boolean.FALSE, BooleanUtils.xor(new Boolean[] { Boolean.FALSE, Boolean.FALSE }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testXor_objectArray_null_throwsException() {
        BooleanUtils.xor((Boolean[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testXor_objectArray_empty_throwsException() {
        BooleanUtils.xor(new Boolean[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testXor_objectArray_containsNull_throwsException() {
        BooleanUtils.xor(new Boolean[] { Boolean.TRUE, null });
    }
}
