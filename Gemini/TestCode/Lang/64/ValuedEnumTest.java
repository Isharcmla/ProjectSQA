package org.apache.commons.lang.enums;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ValuedEnumTest {

    public static final class SampleValuedEnum extends ValuedEnum {
        private static final long serialVersionUID = 1L;

        public static final SampleValuedEnum NEGATIVE = new SampleValuedEnum("Negative", -10);
        public static final SampleValuedEnum ZERO = new SampleValuedEnum("Zero", 0);
        public static final SampleValuedEnum ONE = new SampleValuedEnum("One", 1);
        public static final SampleValuedEnum TWO = new SampleValuedEnum("Two", 2);
        public static final SampleValuedEnum THREE = new SampleValuedEnum("Three", 3);
        public static final SampleValuedEnum EMPTY = new SampleValuedEnum("", 99);

        private SampleValuedEnum(String name, int value) {
            super(name, value);
        }

        public static SampleValuedEnum getEnum(String name) {
            return (SampleValuedEnum) getEnum(SampleValuedEnum.class, name);
        }

        public static SampleValuedEnum getEnum(int value) {
            return (SampleValuedEnum) getEnum(SampleValuedEnum.class, value);
        }

        public static Map getEnumMap() {
            return getEnumMap(SampleValuedEnum.class);
        }

        public static List getEnumList() {
            return getEnumList(SampleValuedEnum.class);
        }

        public static Iterator iterator() {
            return iterator(SampleValuedEnum.class);
        }
    }

    @Test
    public void testGetValue_variousInputs_returnsCorrectValue() {
        Assert.assertEquals(-10, SampleValuedEnum.NEGATIVE.getValue());
        Assert.assertEquals(0, SampleValuedEnum.ZERO.getValue());
        Assert.assertEquals(1, SampleValuedEnum.ONE.getValue());
        Assert.assertEquals(2, SampleValuedEnum.TWO.getValue());
        Assert.assertEquals(3, SampleValuedEnum.THREE.getValue());
        Assert.assertEquals(99, SampleValuedEnum.EMPTY.getValue());
    }

    @Test
    public void testGetEnum_validValue_returnsEnumInstance() {
        Assert.assertSame(SampleValuedEnum.NEGATIVE, ValuedEnum.getEnum(SampleValuedEnum.class, -10));
        Assert.assertSame(SampleValuedEnum.ZERO, ValuedEnum.getEnum(SampleValuedEnum.class, 0));
        Assert.assertSame(SampleValuedEnum.ONE, ValuedEnum.getEnum(SampleValuedEnum.class, 1));
        Assert.assertSame(SampleValuedEnum.TWO, ValuedEnum.getEnum(SampleValuedEnum.class, 2));
        Assert.assertSame(SampleValuedEnum.THREE, ValuedEnum.getEnum(SampleValuedEnum.class, 3));
        Assert.assertSame(SampleValuedEnum.EMPTY, ValuedEnum.getEnum(SampleValuedEnum.class, 99));

        Assert.assertSame(SampleValuedEnum.ONE, SampleValuedEnum.getEnum(1));
    }

    @Test
    public void testGetEnum_nonExistingValue_returnsNull() {
        Assert.assertNull(ValuedEnum.getEnum(SampleValuedEnum.class, 999));
        Assert.assertNull(ValuedEnum.getEnum(SampleValuedEnum.class, -999));
        Assert.assertNull(SampleValuedEnum.getEnum(404));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEnum_nullClass_throwsIllegalArgumentException() {
        ValuedEnum.getEnum(null, 1);
    }

    @Test
    public void testCompareTo_sameInstance_returnsZero() {
        Assert.assertEquals(0, SampleValuedEnum.ONE.compareTo(SampleValuedEnum.ONE));
        Assert.assertEquals(0, SampleValuedEnum.ZERO.compareTo(SampleValuedEnum.ZERO));
    }

    @Test
    public void testCompareTo_differentValues_returnsCorrectDifference() {
        Assert.assertTrue(SampleValuedEnum.ONE.compareTo(SampleValuedEnum.TWO) < 0);
        Assert.assertTrue(SampleValuedEnum.TWO.compareTo(SampleValuedEnum.ONE) > 0);
        Assert.assertEquals(1 - 2, SampleValuedEnum.ONE.compareTo(SampleValuedEnum.TWO));
        Assert.assertEquals(3 - 1, SampleValuedEnum.THREE.compareTo(SampleValuedEnum.ONE));
        Assert.assertEquals(-10 - 0, SampleValuedEnum.NEGATIVE.compareTo(SampleValuedEnum.ZERO));
        Assert.assertEquals(0 - (-10), SampleValuedEnum.ZERO.compareTo(SampleValuedEnum.NEGATIVE));
    }

    @Test(expected = NullPointerException.class)
    public void testCompareTo_nullObject_throwsNullPointerException() {
        SampleValuedEnum.ONE.compareTo(null);
    }

    @Test(expected = ClassCastException.class)
    public void testCompareTo_nonValuedEnumObject_throwsClassCastException() {
        SampleValuedEnum.ONE.compareTo("Not A ValuedEnum");
    }

    @Test
    public void testToString_validEnum_returnsFormattedString() {
        String expectedOne = "ValuedEnumTest.SampleValuedEnum[One=1]";
        Assert.assertEquals(expectedOne, SampleValuedEnum.ONE.toString());
        // Call again to verify cached iToString branch
        Assert.assertEquals(expectedOne, SampleValuedEnum.ONE.toString());

        Assert.assertEquals("ValuedEnumTest.SampleValuedEnum[Zero=0]", SampleValuedEnum.ZERO.toString());
        Assert.assertEquals("ValuedEnumTest.SampleValuedEnum[Negative=-10]", SampleValuedEnum.NEGATIVE.toString());
        Assert.assertEquals("ValuedEnumTest.SampleValuedEnum[=99]", SampleValuedEnum.EMPTY.toString());
    }

    @Test
    public void testEqualsAndHashCode_standardEnumContract() {
        Assert.assertEquals(SampleValuedEnum.ONE, SampleValuedEnum.ONE);
        Assert.assertNotEquals(SampleValuedEnum.ONE, SampleValuedEnum.TWO);
        Assert.assertNotEquals(SampleValuedEnum.ONE, null);
        Assert.assertNotEquals(SampleValuedEnum.ONE, "One");

        Assert.assertEquals(SampleValuedEnum.ONE.hashCode(), SampleValuedEnum.ONE.hashCode());
    }

    @Test
    public void testSubclassHelperMethods() {
        Assert.assertSame(SampleValuedEnum.ONE, SampleValuedEnum.getEnum("One"));
        Assert.assertNotNull(SampleValuedEnum.getEnumMap());
        Assert.assertEquals(6, SampleValuedEnum.getEnumMap().size());
        Assert.assertNotNull(SampleValuedEnum.getEnumList());
        Assert.assertEquals(6, SampleValuedEnum.getEnumList().size());

        Iterator it = SampleValuedEnum.iterator();
        Assert.assertNotNull(it);
        Assert.assertTrue(it.hasNext());
    }
}
