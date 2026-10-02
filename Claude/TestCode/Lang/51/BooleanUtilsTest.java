package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

public class BooleanUtilsTest {

    // negate
    @Test
    public void testNegate_true_returnsFalse() {
        assertEquals(Boolean.FALSE, BooleanUtils.negate(Boolean.TRUE));
    }

    @Test
    public void testNegate_false_returnsTrue() {
        assertEquals(Boolean.TRUE, BooleanUtils.negate(Boolean.FALSE));
    }

    @Test
    public void testNegate_null_returnsNull() {
        assertNull(BooleanUtils.negate(null));
    }

    // isTrue
    @Test
    public void testIsTrue_true_returnsTrue() {
        assertTrue(BooleanUtils.isTrue(Boolean.TRUE));
    }

    @Test
    public void testIsTrue_false_returnsFalse() {
        assertFalse(BooleanUtils.isTrue(Boolean.FALSE));
    }

    @Test
    public void testIsTrue_null_returnsFalse() {
        assertFalse(BooleanUtils.isTrue(null));
    }

    // isNotTrue
    @Test
    public void testIsNotTrue_true_returnsFalse() {
        assertFalse(BooleanUtils.isNotTrue(Boolean.TRUE));
    }

    @Test
    public void testIsNotTrue_false_returnsTrue() {
        assertTrue(BooleanUtils.isNotTrue(Boolean.FALSE));
    }

    @Test
    public void testIsNotTrue_null_returnsTrue() {
        assertTrue(BooleanUtils.isNotTrue(null));
    }

    // isFalse
    @Test
    public void testIsFalse_false_returnsTrue() {
        assertTrue(BooleanUtils.isFalse(Boolean.FALSE));
    }

    @Test
    public void testIsFalse_true_returnsFalse() {
        assertFalse(BooleanUtils.isFalse(Boolean.TRUE));
    }

    @Test
    public void testIsFalse_null_returnsFalse() {
        assertFalse(BooleanUtils.isFalse(null));
    }

    // isNotFalse
    @Test
    public void testIsNotFalse_false_returnsFalse() {
        assertFalse(BooleanUtils.isNotFalse(Boolean.FALSE));
    }

    @Test
    public void testIsNotFalse_true_returnsTrue() {
        assertTrue(BooleanUtils.isNotFalse(Boolean.TRUE));
    }

    @Test
    public void testIsNotFalse_null_returnsTrue() {
        assertTrue(BooleanUtils.isNotFalse(null));
    }

    // toBooleanObject(boolean)
    @Test
    public void testToBooleanObjectBoolean_true_returnsTrue() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(true));
    }

    @Test
    public void testToBooleanObjectBoolean_false_returnsFalse() {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(false));
    }

    // toBoolean(Boolean)
    @Test
    public void testToBooleanBoolean_true_returnsTrue() {
        assertTrue(BooleanUtils.toBoolean(Boolean.TRUE));
    }

    @Test
    public void testToBooleanBoolean_false_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean(Boolean.FALSE));
    }

    @Test
    public void testToBooleanBoolean_null_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean((Boolean) null));
    }

    // toBooleanDefaultIfNull
    @Test
    public void testToBooleanDefaultIfNull_true_returnsTrue() {
        assertTrue(BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false));
    }

    @Test
    public void testToBooleanDefaultIfNull_false_returnsFalse() {
        assertFalse(BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true));
    }

    @Test
    public void testToBooleanDefaultIfNull_null_returnsDefault() {
        assertTrue(BooleanUtils.toBooleanDefaultIfNull(null, true));
        assertFalse(BooleanUtils.toBooleanDefaultIfNull(null, false));
    }

    // toBoolean(int)
    @Test
    public void testToBooleanInt_zero_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean(0));
    }

    @Test
    public void testToBooleanInt_nonZero_returnsTrue() {
        assertTrue(BooleanUtils.toBoolean(1));
        assertTrue(BooleanUtils.toBoolean(2));
        assertTrue(BooleanUtils.toBoolean(-1));
    }

    // toBooleanObject(int)
    @Test
    public void testToBooleanObjectInt_zero_returnsFalse() {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(0));
    }

    @Test
    public void testToBooleanObjectInt_nonZero_returnsTrue() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(1));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(2));
    }

    // toBooleanObject(Integer)
    @Test
    public void testToBooleanObjectInteger_null_returnsNull() {
        assertNull(BooleanUtils.toBooleanObject((Integer) null));
    }

    @Test
    public void testToBooleanObjectInteger_zero_returnsFalse() {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(new Integer(0)));
    }

    @Test
    public void testToBooleanObjectInteger_nonZero_returnsTrue() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(new Integer(1)));
    }

    // toBoolean(int, int, int)
    @Test
    public void testToBooleanIntIntInt_matchesTrueValue_returnsTrue() {
        assertTrue(BooleanUtils.toBoolean(1, 1, 0));
    }

    @Test
    public void testToBooleanIntIntInt_matchesFalseValue_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean(0, 1, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanIntIntInt_noMatch_throwsException() {
        BooleanUtils.toBoolean(2, 1, 0);
    }

    // toBoolean(Integer, Integer, Integer)
    @Test
    public void testToBooleanIntegerIntegerInteger_valueNullTrueValueNull_returnsTrue() {
        assertTrue(BooleanUtils.toBoolean((Integer) null, (Integer) null, new Integer(0)));
    }

    @Test
    public void testToBooleanIntegerIntegerInteger_valueNullFalseValueNull_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean((Integer) null, new Integer(1), (Integer) null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanIntegerIntegerInteger_valueNullBothNonNull_throwsException() {
        BooleanUtils.toBoolean((Integer) null, new Integer(1), new Integer(0));
    }

    @Test
    public void testToBooleanIntegerIntegerInteger_matchesTrueValue_returnsTrue() {
        assertTrue(BooleanUtils.toBoolean(new Integer(1), new Integer(1), new Integer(0)));
    }

    @Test
    public void testToBooleanIntegerIntegerInteger_matchesFalseValue_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean(new Integer(0), new Integer(1), new Integer(0)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanIntegerIntegerInteger_noMatch_throwsException() {
        BooleanUtils.toBoolean(new Integer(2), new Integer(1), new Integer(0));
    }

    // toBooleanObject(int, int, int, int)
    @Test
    public void testToBooleanObjectIntIntIntInt_matchesTrue_returnsTrue() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(0, 0, 2, 3));
    }

    @Test
    public void testToBooleanObjectIntIntIntInt_matchesFalse_returnsFalse() {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(2, 1, 2, 3));
    }

    @Test
    public void testToBooleanObjectIntIntIntInt_matchesNull_returnsNull() {
        assertNull(BooleanUtils.toBooleanObject(3, 1, 2, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObjectIntIntIntInt_noMatch_throwsException() {
        BooleanUtils.toBooleanObject(4, 1, 2, 3);
    }

    // toBooleanObject(Integer, Integer, Integer, Integer)
    @Test
    public void testToBooleanObjectIntegerIntegerIntegerInteger_valueNullTrueValueNull_returnsTrue() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject((Integer) null, (Integer) null, new Integer(2), new Integer(3)));
    }

    @Test
    public void testToBooleanObjectIntegerIntegerIntegerInteger_valueNullFalseValueNull_returnsFalse() {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject((Integer) null, new Integer(1), (Integer) null, new Integer(3)));
    }

    @Test
    public void testToBooleanObjectIntegerIntegerIntegerInteger_valueNullNullValueNull_returnsNull() {
        assertNull(BooleanUtils.toBooleanObject((Integer) null, new Integer(1), new Integer(2), (Integer) null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObjectIntegerIntegerIntegerInteger_valueNullAllNonNull_throwsException() {
        BooleanUtils.toBooleanObject((Integer) null, new Integer(1), new Integer(2), new Integer(3));
    }

    @Test
    public void testToBooleanObjectIntegerIntegerIntegerInteger_matchesTrueValue_returnsTrue() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(new Integer(0), new Integer(0), new Integer(2), new Integer(3)));
    }

    @Test
    public void testToBooleanObjectIntegerIntegerIntegerInteger_matchesFalseValue_returnsFalse() {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(new Integer(2), new Integer(1), new Integer(2), new Integer(3)));
    }

    @Test
    public void testToBooleanObjectIntegerIntegerIntegerInteger_matchesNullValue_returnsNull() {
        assertNull(BooleanUtils.toBooleanObject(new Integer(3), new Integer(1), new Integer(2), new Integer(3)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObjectIntegerIntegerIntegerInteger_noMatch_throwsException() {
        BooleanUtils.toBooleanObject(new Integer(4), new Integer(1), new Integer(2), new Integer(3));
    }

    // toInteger(boolean)
    @Test
    public void testToIntegerBoolean_true_returnsOne() {
        assertEquals(1, BooleanUtils.toInteger(true));
    }

    @Test
    public void testToIntegerBoolean_false_returnsZero() {
        assertEquals(0, BooleanUtils.toInteger(false));
    }

    // toIntegerObject(boolean)
    @Test
    public void testToIntegerObjectBoolean_true_returnsOne() {
        assertEquals(new Integer(1), BooleanUtils.toIntegerObject(true));
    }

    @Test
    public void testToIntegerObjectBoolean_false_returnsZero() {
        assertEquals(new Integer(0), BooleanUtils.toIntegerObject(false));
    }

    // toIntegerObject(Boolean)
    @Test
    public void testToIntegerObjectBooleanObject_null_returnsNull() {
        assertNull(BooleanUtils.toIntegerObject((Boolean) null));
    }

    @Test
    public void testToIntegerObjectBooleanObject_true_returnsOne() {
        assertEquals(new Integer(1), BooleanUtils.toIntegerObject(Boolean.TRUE));
    }

    @Test
    public void testToIntegerObjectBooleanObject_false_returnsZero() {
        assertEquals(new Integer(0), BooleanUtils.toIntegerObject(Boolean.FALSE));
    }

    // toInteger(boolean, int, int)
    @Test
    public void testToIntegerBooleanIntInt_true_returnsTrueValue() {
        assertEquals(1, BooleanUtils.toInteger(true, 1, 0));
    }

    @Test
    public void testToIntegerBooleanIntInt_false_returnsFalseValue() {
        assertEquals(0, BooleanUtils.toInteger(false, 1, 0));
    }

    // toInteger(Boolean, int, int, int)
    @Test
    public void testToIntegerBooleanObjectIntIntInt_true_returnsTrueValue() {
        assertEquals(1, BooleanUtils.toInteger(Boolean.TRUE, 1, 0, 2));
    }

    @Test
    public void testToIntegerBooleanObjectIntIntInt_false_returnsFalseValue() {
        assertEquals(0, BooleanUtils.toInteger(Boolean.FALSE, 1, 0, 2));
    }

    @Test
    public void testToIntegerBooleanObjectIntIntInt_null_returnsNullValue() {
        assertEquals(2, BooleanUtils.toInteger((Boolean) null, 1, 0, 2));
    }

    // toIntegerObject(boolean, Integer, Integer)
    @Test
    public void testToIntegerObjectBooleanIntegerInteger_true_returnsTrueValue() {
        assertEquals(new Integer(1), BooleanUtils.toIntegerObject(true, new Integer(1), new Integer(0)));
    }

    @Test
    public void testToIntegerObjectBooleanIntegerInteger_false_returnsFalseValue() {
        assertEquals(new Integer(0), BooleanUtils.toIntegerObject(false, new Integer(1), new Integer(0)));
    }

    // toIntegerObject(Boolean, Integer, Integer, Integer)
    @Test
    public void testToIntegerObjectBooleanObjectIntegerIntegerInteger_true_returnsTrueValue() {
        assertEquals(new Integer(1), BooleanUtils.toIntegerObject(Boolean.TRUE, new Integer(1), new Integer(0), new Integer(2)));
    }

    @Test
    public void testToIntegerObjectBooleanObjectIntegerIntegerInteger_false_returnsFalseValue() {
        assertEquals(new Integer(0), BooleanUtils.toIntegerObject(Boolean.FALSE, new Integer(1), new Integer(0), new Integer(2)));
    }

    @Test
    public void testToIntegerObjectBooleanObjectIntegerIntegerInteger_null_returnsNullValue() {
        assertEquals(new Integer(2), BooleanUtils.toIntegerObject((Boolean) null, new Integer(1), new Integer(0), new Integer(2)));
    }

    // toBooleanObject(String)
    @Test
    public void testToBooleanObjectString_true_returnsTrue() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("true"));
    }

    @Test
    public void testToBooleanObjectString_false_returnsFalse() {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("false"));
    }

    @Test
    public void testToBooleanObjectString_on_returnsTrue() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("on"));
    }

    @Test
    public void testToBooleanObjectString_off_returnsFalse() {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("off"));
    }

    @Test
    public void testToBooleanObjectString_yes_returnsTrue() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("yes"));
    }

    @Test
    public void testToBooleanObjectString_no_returnsFalse() {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("no"));
    }

    @Test
    public void testToBooleanObjectString_unknown_returnsNull() {
        assertNull(BooleanUtils.toBooleanObject("blue"));
    }

    @Test
    public void testToBooleanObjectString_null_returnsNull() {
        assertNull(BooleanUtils.toBooleanObject((String) null));
    }

    @Test
    public void testToBooleanObjectString_caseInsensitive_returnsTrue() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("ON"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("oFf"));
    }

    // toBooleanObject(String, String, String, String)
    @Test
    public void testToBooleanObjectStringStringStringString_matchesTrueString_returnsTrue() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("true", "true", "false", "null"));
    }

    @Test
    public void testToBooleanObjectStringStringStringString_matchesFalseString_returnsFalse() {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("false", "true", "false", "null"));
    }

    @Test
    public void testToBooleanObjectStringStringStringString_matchesNullString_returnsNull() {
        assertNull(BooleanUtils.toBooleanObject("null", "true", "false", "null"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObjectStringStringStringString_noMatch_throwsException() {
        BooleanUtils.toBooleanObject("other", "true", "false", "null");
    }

    @Test
    public void testToBooleanObjectStringStringStringString_strNullTrueStringNull_returnsTrue() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject((String) null, (String) null, "false", "null"));
    }

    @Test
    public void testToBooleanObjectStringStringStringString_strNullFalseStringNull_returnsFalse() {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject((String) null, "true", (String) null, "null"));
    }

    @Test
    public void testToBooleanObjectStringStringStringString_strNullNullStringNull_returnsNull() {
        assertNull(BooleanUtils.toBooleanObject((String) null, "true", "false", (String) null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObjectStringStringStringString_strNullAllNonNull_throwsException() {
        BooleanUtils.toBooleanObject((String) null, "true", "false", "null");
    }

    // toBoolean(String)
    @Test
    public void testToBooleanString_internedTrue_returnsTrue() {
        assertTrue(BooleanUtils.toBoolean("true"));
    }

    @Test
    public void testToBooleanString_null_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean((String) null));
    }

    @Test
    public void testToBooleanString_on_returnsTrue() {
        assertTrue(BooleanUtils.toBoolean("on"));
    }

    @Test
    public void testToBooleanString_ON_returnsTrue() {
        assertTrue(BooleanUtils.toBoolean("ON"));
    }

    @Test
    public void testToBooleanString_yes_returnsTrue() {
        assertTrue(BooleanUtils.toBoolean("yes"));
    }

    @Test
    public void testToBooleanString_YES_returnsTrue() {
        assertTrue(BooleanUtils.toBoolean("YES"));
    }

    @Test
    public void testToBooleanString_trueNonInterned_returnsTrue() {
        char[] chars = {'t', 'r', 'u', 'e'};
        String s = new String(chars);
        assertTrue(BooleanUtils.toBoolean(s));
    }

    @Test
    public void testToBooleanString_TRUE_returnsTrue() {
        assertTrue(BooleanUtils.toBoolean("TRUE"));
    }

    @Test
    public void testToBooleanString_mixedCaseTrue_returnsTrue() {
        assertTrue(BooleanUtils.toBoolean("tRUe"));
    }

    @Test
    public void testToBooleanString_false_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean("false"));
    }

    @Test
    public void testToBooleanString_unknownString_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean("x gti"));
    }

    @Test
    public void testToBooleanString_emptyString_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean(""));
    }

    @Test
    public void testToBooleanString_lengthTwoNotOn_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean("xx"));
    }

    @Test
    public void testToBooleanString_lengthThreeNotYes_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean("abc"));
    }

    @Test
    public void testToBooleanString_lengthThreeUpperYES_returnsTrue() {
        assertTrue(BooleanUtils.toBoolean("YES"));
    }

    @Test
    public void testToBooleanString_lengthFourNotTrue_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean("abcd"));
    }

    @Test
    public void testToBooleanString_lengthFourUpperTRUE_returnsTrue() {
        assertTrue(BooleanUtils.toBoolean("TRUE"));
    }

    @Test
    public void testToBooleanString_lengthFiveOrMore_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean("abcde"));
    }

    @Test
    public void testToBooleanString_lengthOne_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean("a"));
    }

    // toBoolean(String, String, String)
    @Test
    public void testToBooleanStringStringString_matchesTrueString_returnsTrue() {
        assertTrue(BooleanUtils.toBoolean("true", "true", "false"));
    }

    @Test
    public void testToBooleanStringStringString_matchesFalseString_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean("false", "true", "false"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanStringStringString_noMatch_throwsException() {
        BooleanUtils.toBoolean("other", "true", "false");
    }

    @Test
    public void testToBooleanStringStringString_strNullTrueStringNull_returnsTrue() {
        assertTrue(BooleanUtils.toBoolean((String) null, (String) null, "false"));
    }

    @Test
    public void testToBooleanStringStringString_strNullFalseStringNull_returnsFalse() {
        assertFalse(BooleanUtils.toBoolean((String) null, "true", (String) null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanStringStringString_strNullBothNonNull_throwsException() {
        BooleanUtils.toBoolean((String) null, "true", "false");
    }

    // toStringTrueFalse(Boolean)
    @Test
    public void testToStringTrueFalseBooleanObject_true_returnsTrueString() {
        assertEquals("true", BooleanUtils.toStringTrueFalse(Boolean.TRUE));
    }

    @Test
    public void testToStringTrueFalseBooleanObject_false_returnsFalseString() {
        assertEquals("false", BooleanUtils.toStringTrueFalse(Boolean.FALSE));
    }

    @Test
    public void testToStringTrueFalseBooleanObject_null_returnsNull() {
        assertNull(BooleanUtils.toStringTrueFalse((Boolean) null));
    }

    // toStringOnOff(Boolean)
    @Test
    public void testToStringOnOffBooleanObject_true_returnsOnString() {
        assertEquals("on", BooleanUtils.toStringOnOff(Boolean.TRUE));
    }

    @Test
    public void testToStringOnOffBooleanObject_false_returnsOffString() {
        assertEquals("off", BooleanUtils.toStringOnOff(Boolean.FALSE));
    }

    @Test
    public void testToStringOnOffBooleanObject_null_returnsNull() {
        assertNull(BooleanUtils.toStringOnOff((Boolean) null));
    }

    // toStringYesNo(Boolean)
    @Test
    public void testToStringYesNoBooleanObject_true_returnsYesString() {
        assertEquals("yes", BooleanUtils.toStringYesNo(Boolean.TRUE));
    }

    @Test
    public void testToStringYesNoBooleanObject_false_returnsNoString() {
        assertEquals("no", BooleanUtils.toStringYesNo(Boolean.FALSE));
    }

    @Test
    public void testToStringYesNoBooleanObject_null_returnsNull() {
        assertNull(BooleanUtils.toStringYesNo((Boolean) null));
    }

    // toString(Boolean, String, String, String)
    @Test
    public void testToStringBooleanObjectStringStringString_true_returnsTrueString() {
        assertEquals("true", BooleanUtils.toString(Boolean.TRUE, "true", "false", null));
    }

    @Test
    public void testToStringBooleanObjectStringStringString_false_returnsFalseString() {
        assertEquals("false", BooleanUtils.toString(Boolean.FALSE, "true", "false", null));
    }

    @Test
    public void testToStringBooleanObjectStringStringString_null_returnsNullString() {
        assertNull(BooleanUtils.toString((Boolean) null, "true", "false", null));
    }

    // toStringTrueFalse(boolean)
    @Test
    public void testToStringTrueFalseBoolean_true_returnsTrueString() {
        assertEquals("true", BooleanUtils.toStringTrueFalse(true));
    }

    @Test
    public void testToStringTrueFalseBoolean_false_returnsFalseString() {
        assertEquals("false", BooleanUtils.toStringTrueFalse(false));
    }

    // toStringOnOff(boolean)
    @Test
    public void testToStringOnOffBoolean_true_returnsOnString() {
        assertEquals("on", BooleanUtils.toStringOnOff(true));
    }

    @Test
    public void testToStringOnOffBoolean_false_returnsOffString() {
        assertEquals("off", BooleanUtils.toStringOnOff(false));
    }

    // toStringYesNo(boolean)
    @Test
    public void testToStringYesNoBoolean_true_returnsYesString() {
        assertEquals("yes", BooleanUtils.toStringYesNo(true));
    }

    @Test
    public void testToStringYesNoBoolean_false_returnsNoString() {
        assertEquals("no", BooleanUtils.toStringYesNo(false));
    }

    // toString(boolean, String, String)
    @Test
    public void testToStringBooleanStringString_true_returnsTrueString() {
        assertEquals("true", BooleanUtils.toString(true, "true", "false"));
    }

    @Test
    public void testToStringBooleanStringString_false_returnsFalseString() {
        assertEquals("false", BooleanUtils.toString(false, "true", "false"));
    }

    // xor(boolean[])
    @Test
    public void testXorBooleanArray_oneTrueOneFalse_returnsTrue() {
        assertTrue(BooleanUtils.xor(new boolean[] { true, false }));
    }

    @Test
    public void testXorBooleanArray_bothTrue_returnsFalse() {
        assertFalse(BooleanUtils.xor(new boolean[] { true, true }));
    }

    @Test
    public void testXorBooleanArray_bothFalse_returnsFalse() {
        assertFalse(BooleanUtils.xor(new boolean[] { false, false }));
    }

    @Test
    public void testXorBooleanArray_singleTrue_returnsTrue() {
        assertTrue(BooleanUtils.xor(new boolean[] { true }));
    }

    @Test
    public void testXorBooleanArray_singleFalse_returnsFalse() {
        assertFalse(BooleanUtils.xor(new boolean[] { false }));
    }

    @Test
    public void testXorBooleanArray_multipleTrue_returnsFalse() {
        assertFalse(BooleanUtils.xor(new boolean[] { true, true, true }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testXorBooleanArray_null_throwsException() {
        BooleanUtils.xor((boolean[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testXorBooleanArray_empty_throwsException() {
        BooleanUtils.xor(new boolean[] {});
    }

    // xor(Boolean[])
    @Test
    public void testXorBooleanObjectArray_oneTrueOneFalse_returnsTrue() {
        assertEquals(Boolean.TRUE, BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE }));
    }

    @Test
    public void testXorBooleanObjectArray_bothTrue_returnsFalse() {
        assertEquals(Boolean.FALSE, BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE }));
    }

    @Test
    public void testXorBooleanObjectArray_bothFalse_returnsFalse() {
        assertEquals(Boolean.FALSE, BooleanUtils.xor(new Boolean[] { Boolean.FALSE, Boolean.FALSE }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testXorBooleanObjectArray_null_throwsException() {
        BooleanUtils.xor((Boolean[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testXorBooleanObjectArray_empty_throwsException() {
        BooleanUtils.xor(new Boolean[] {});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testXorBooleanObjectArray_containsNull_throwsException() {
        BooleanUtils.xor(new Boolean[] { Boolean.TRUE, null });
    }

    // Constructor
    @Test
    public void testConstructor_instantiation_succeeds() {
        BooleanUtils bu = new BooleanUtils();
        assertNotNull(bu);
    }
}
