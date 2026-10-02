package org.joda.time.field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.junit.Test;

public class UnsupportedDurationFieldTest {

    private static class CustomDurationFieldType extends DurationFieldType {
        private static final long serialVersionUID = 1L;

        protected CustomDurationFieldType(String name) {
            super(name);
        }

        public DurationField getField(org.joda.time.Chronology chronology) {
            return UnsupportedDurationField.getInstance(this);
        }
    }

    @Test
    public void testGetInstance_sameType_returnsCachedInstance() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        assertNotNull(field1);
        assertSame(field1, field2);
    }

    @Test
    public void testGetInstance_differentTypes_returnsDistinctInstances() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        assertNotNull(field1);
        assertNotNull(field2);
        assertFalse(field1 == field2);
    }

    @Test
    public void testGetType_returnsConfiguredType() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        assertEquals(DurationFieldType.minutes(), field.getType());
    }

    @Test
    public void testGetName_returnsTypeName() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        assertEquals("minutes", field.getName());
    }

    @Test
    public void testIsSupported_alwaysReturnsFalse() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertFalse(field.isSupported());
    }

    @Test
    public void testIsPrecise_alwaysReturnsTrue() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertTrue(field.isPrecise());
    }

    @Test
    public void testGetUnitMillis_alwaysReturnsZero() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        assertEquals(0L, field.getUnitMillis());
    }

    @Test
    public void testCompareTo_alwaysReturnsZero() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.hours());

        assertEquals(0, field1.compareTo(field1));
        assertEquals(0, field1.compareTo(field2));
        assertEquals(0, field1.compareTo(null));
    }

    @Test
    public void testToString_returnsFormattedString() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.months());
        assertEquals("UnsupportedDurationField[months]", field.toString());
    }

    @Test
    public void testHashCode_matchesNameHashCode() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.years());
        assertEquals("years".hashCode(), field.hashCode());
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        assertTrue(field.equals(field));
    }

    @Test
    public void testEquals_sameTypeInstances_returnsTrue() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        assertTrue(field1.equals(field2));
        assertTrue(field2.equals(field1));
    }

    @Test
    public void testEquals_differentTypeInstances_returnsFalse() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        assertFalse(field1.equals(field2));
        assertFalse(field2.equals(field1));
    }

    @Test
    public void testEquals_nullAndOtherTypes_returnsFalse() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        assertFalse(field.equals(null));
        assertFalse(field.equals("hours"));
        assertFalse(field.equals(new Object()));
    }

    @Test
    public void testEquals_withNullNameBranch() {
        DurationFieldType nullNameType1 = new CustomDurationFieldType(null);
        DurationFieldType nullNameType2 = new CustomDurationFieldType(null);
        DurationFieldType normalType = new CustomDurationFieldType("custom");

        UnsupportedDurationField fieldNull1 = UnsupportedDurationField.getInstance(nullNameType1);
        UnsupportedDurationField fieldNull2 = UnsupportedDurationField.getInstance(nullNameType2);
        UnsupportedDurationField fieldNormal = UnsupportedDurationField.getInstance(normalType);

        assertTrue(fieldNull1.equals(fieldNull2));
        assertFalse(fieldNull1.equals(fieldNormal));
        assertFalse(fieldNormal.equals(fieldNull1));
    }

    @Test
    public void testGetValue_long_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        long[] testValues = {0L, 1000L, -1000L, Long.MAX_VALUE, Long.MIN_VALUE};
        for (long val : testValues) {
            try {
                field.getValue(val);
                fail("Expected UnsupportedOperationException for getValue(" + val + ")");
            } catch (UnsupportedOperationException e) {
                assertTrue(e.getMessage().contains("seconds field is unsupported"));
            }
        }
    }

    @Test
    public void testGetValueAsLong_long_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        long[] testValues = {0L, 1000L, -1000L, Long.MAX_VALUE, Long.MIN_VALUE};
        for (long val : testValues) {
            try {
                field.getValueAsLong(val);
                fail("Expected UnsupportedOperationException for getValueAsLong(" + val + ")");
            } catch (UnsupportedOperationException e) {
                assertTrue(e.getMessage().contains("seconds field is unsupported"));
            }
        }
    }

    @Test
    public void testGetValue_long_long_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        try {
            field.getValue(100L, 200L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("seconds field is unsupported"));
        }
    }

    @Test
    public void testGetValueAsLong_long_long_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        try {
            field.getValueAsLong(100L, 200L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("seconds field is unsupported"));
        }
    }

    @Test
    public void testGetMillis_int_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        int[] testValues = {0, 10, -10, Integer.MAX_VALUE, Integer.MIN_VALUE};
        for (int val : testValues) {
            try {
                field.getMillis(val);
                fail("Expected UnsupportedOperationException for getMillis(" + val + ")");
            } catch (UnsupportedOperationException e) {
                assertTrue(e.getMessage().contains("minutes field is unsupported"));
            }
        }
    }

    @Test
    public void testGetMillis_long_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        long[] testValues = {0L, 10L, -10L, Long.MAX_VALUE, Long.MIN_VALUE};
        for (long val : testValues) {
            try {
                field.getMillis(val);
                fail("Expected UnsupportedOperationException for getMillis(" + val + ")");
            } catch (UnsupportedOperationException e) {
                assertTrue(e.getMessage().contains("minutes field is unsupported"));
            }
        }
    }

    @Test
    public void testGetMillis_int_long_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        try {
            field.getMillis(5, 1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("minutes field is unsupported"));
        }
    }

    @Test
    public void testGetMillis_long_long_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        try {
            field.getMillis(5L, 1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("minutes field is unsupported"));
        }
    }

    @Test
    public void testAdd_long_int_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        try {
            field.add(1000L, 5);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("hours field is unsupported"));
        }
    }

    @Test
    public void testAdd_long_long_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        try {
            field.add(1000L, 5L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("hours field is unsupported"));
        }
    }

    @Test
    public void testGetDifference_long_long_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        try {
            field.getDifference(2000L, 1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("days field is unsupported"));
        }
    }

    @Test
    public void testGetDifferenceAsLong_long_long_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        try {
            field.getDifferenceAsLong(2000L, 1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("days field is unsupported"));
        }
    }

    @Test
    public void testSerialization_resolvesToSameSingletonInstance() throws Exception {
        UnsupportedDurationField original = UnsupportedDurationField.getInstance(DurationFieldType.centuries());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        assertSame(original, deserialized);
    }
}
