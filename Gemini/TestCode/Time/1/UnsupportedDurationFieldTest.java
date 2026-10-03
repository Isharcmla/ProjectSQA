package org.joda.time.field;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.joda.time.Chronology;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class UnsupportedDurationFieldTest {

    @Test
    public void testGetInstance_sameType_returnsCachedSingleton() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.seconds());

        assertNotNull(field1);
        assertSame(field1, field2);
    }

    @Test
    public void testGetInstance_differentTypes_returnsDistinctInstances() {
        UnsupportedDurationField seconds = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        UnsupportedDurationField minutes = UnsupportedDurationField.getInstance(DurationFieldType.minutes());

        assertNotNull(seconds);
        assertNotNull(minutes);
        assertNotEquals(seconds, minutes);
    }

    @Test
    public void testGetType_returnsConfiguredType() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);

        assertSame(type, field.getType());
    }

    @Test
    public void testGetName_returnsTypeName() {
        DurationFieldType type = DurationFieldType.days();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);

        assertEquals("days", field.getName());
    }

    @Test
    public void testIsSupported_alwaysReturnsFalse() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.months());
        assertFalse(field.isSupported());
    }

    @Test
    public void testIsPrecise_alwaysReturnsTrue() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.years());
        assertTrue(field.isPrecise());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValue_long_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        field.getValue(1000L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValue_long_edgeValues_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        field.getValue(0L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLong_long_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        field.getValueAsLong(-500L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValue_longAndInstant_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        field.getValue(100L, 200L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLong_longAndInstant_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        field.getValueAsLong(100L, 200L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillis_int_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        field.getMillis(10);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillis_long_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        field.getMillis(10L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillis_intAndInstant_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        field.getMillis(10, 50L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillis_longAndInstant_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        field.getMillis(10L, 50L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAdd_longAndInt_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        field.add(1000L, 5);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAdd_longAndLong_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        field.add(1000L, 5L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetDifference_longAndLong_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        field.getDifference(1000L, 500L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetDifferenceAsLong_longAndLong_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        field.getDifferenceAsLong(1000L, 500L);
    }

    @Test
    public void testGetUnitMillis_alwaysReturnsZero() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.centuries());
        assertEquals(0L, field.getUnitMillis());
    }

    @Test
    public void testCompareTo_withSupportedDurationField_returnsOne() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        DurationField supportedField = MillisDurationField.INSTANCE;

        assertEquals(1, field.compareTo(supportedField));
    }

    @Test
    public void testCompareTo_withUnsupportedDurationField_returnsZero() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.minutes());

        assertEquals(0, field1.compareTo(field2));
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
        assertTrue(field.equals(field));
    }

    @Test
    public void testEquals_sameType_returnsTrue() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.weeks());

        assertTrue(field1.equals(field2));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.days());

        assertFalse(field1.equals(field2));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        assertFalse(field.equals(null));
    }

    @Test
    public void testEquals_differentClassObject_returnsFalse() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        assertFalse(field.equals("Not a field"));
    }

    @Test
    public void testEquals_withNullNames_branchCoverage() {
        DurationFieldType nullNameType1 = new DurationFieldType(null) {
            private static final long serialVersionUID = 1L;

            public DurationField getField(Chronology chronology) {
                return null;
            }
        };
        DurationFieldType nullNameType2 = new DurationFieldType(null) {
            private static final long serialVersionUID = 1L;

            public DurationField getField(Chronology chronology) {
                return null;
            }
        };

        UnsupportedDurationField nullField1 = UnsupportedDurationField.getInstance(nullNameType1);
        UnsupportedDurationField nullField2 = UnsupportedDurationField.getInstance(nullNameType2);
        UnsupportedDurationField normalField = UnsupportedDurationField.getInstance(DurationFieldType.seconds());

        assertNull(nullField1.getName());
        assertTrue(nullField1.equals(nullField2));
        assertFalse(normalField.equals(nullField1));
    }

    @Test
    public void testHashCode_matchesNameHashCode() {
        DurationFieldType type = DurationFieldType.halfdays();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);

        assertEquals(type.getName().hashCode(), field.hashCode());
    }

    @Test
    public void testToString_formatsCorrectly() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.eras());
        assertEquals("UnsupportedDurationField[eras]", field.toString());
    }

    @Test
    public void testSerialization_resolvesToSingletonInstance() throws Exception {
        UnsupportedDurationField original = UnsupportedDurationField.getInstance(DurationFieldType.seconds());

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

    @Test
    public void testUnsupportedExceptionMessage() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        try {
            field.getValue(10L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("seconds field is unsupported", e.getMessage());
        }
    }
}
