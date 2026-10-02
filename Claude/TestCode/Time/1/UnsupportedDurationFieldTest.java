import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.field.UnsupportedDurationField;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UnsupportedDurationFieldTest {

    private UnsupportedDurationField millisField;
    private UnsupportedDurationField secondsField;

    /**
     * Minimal concrete subclass of DurationField used only to test the
     * compareTo() branch where the compared field IS supported.
     * This is not a mocking framework - it's a real subclass used through
     * the public API of DurationField.
     */
    private static class SupportedDummyDurationField extends DurationField {
        public DurationFieldType getType() {
            return null;
        }

        public String getName() {
            return "SupportedDummy";
        }

        public boolean isSupported() {
            return true;
        }

        public boolean isPrecise() {
            return true;
        }

        public int getValue(long duration) {
            return 0;
        }

        public long getValueAsLong(long duration) {
            return 0;
        }

        public int getValue(long duration, long instant) {
            return 0;
        }

        public long getValueAsLong(long duration, long instant) {
            return 0;
        }

        public long getMillis(int value) {
            return 0;
        }

        public long getMillis(long value) {
            return 0;
        }

        public long getMillis(int value, long instant) {
            return 0;
        }

        public long getMillis(long value, long instant) {
            return 0;
        }

        public long add(long instant, int value) {
            return 0;
        }

        public long add(long instant, long value) {
            return 0;
        }

        public int getDifference(long minuendInstant, long subtrahendInstant) {
            return 0;
        }

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
            return 0;
        }

        public long getUnitMillis() {
            return 0;
        }

        public int compareTo(DurationField durationField) {
            return 0;
        }
    }

    @Before
    public void setUp() {
        millisField = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        secondsField = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
    }

    // ---------------------------------------------------------------
    // getInstance
    // ---------------------------------------------------------------

    @Test
    public void testGetInstance_sameType_returnsSameCachedInstance() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        assertSame(field1, field2);
    }

    @Test
    public void testGetInstance_differentTypes_returnsDifferentInstances() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertNotSame(field1, field2);
    }

    @Test
    public void testGetInstance_nullType_returnsInstanceWithNullType() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(null);
        assertNotNull(field);
        assertNull(field.getType());
    }

    // ---------------------------------------------------------------
    // getType
    // ---------------------------------------------------------------

    @Test
    public void testGetType_normalInput_returnsCorrectType() {
        assertEquals(DurationFieldType.millis(), millisField.getType());
    }

    // ---------------------------------------------------------------
    // getName
    // ---------------------------------------------------------------

    @Test
    public void testGetName_normalInput_returnsTypeName() {
        assertEquals(DurationFieldType.millis().getName(), millisField.getName());
    }

    // ---------------------------------------------------------------
    // isSupported
    // ---------------------------------------------------------------

    @Test
    public void testIsSupported_alwaysFalse() {
        assertFalse(millisField.isSupported());
    }

    // ---------------------------------------------------------------
    // isPrecise
    // ---------------------------------------------------------------

    @Test
    public void testIsPrecise_alwaysTrue() {
        assertTrue(millisField.isPrecise());
    }

    // ---------------------------------------------------------------
    // getValue(long)
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueLong_throwsUnsupportedOperationException() {
        millisField.getValue(100L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueLong_withZero_throwsUnsupportedOperationException() {
        millisField.getValue(0L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueLong_withNegative_throwsUnsupportedOperationException() {
        millisField.getValue(-100L);
    }

    // ---------------------------------------------------------------
    // getValueAsLong(long)
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLong_throwsUnsupportedOperationException() {
        millisField.getValueAsLong(100L);
    }

    // ---------------------------------------------------------------
    // getValue(long, long)
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueLongLong_throwsUnsupportedOperationException() {
        millisField.getValue(100L, 200L);
    }

    // ---------------------------------------------------------------
    // getValueAsLong(long, long)
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLongLongLong_throwsUnsupportedOperationException() {
        millisField.getValueAsLong(100L, 200L);
    }

    // ---------------------------------------------------------------
    // getMillis(int)
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisInt_throwsUnsupportedOperationException() {
        millisField.getMillis(5);
    }

    // ---------------------------------------------------------------
    // getMillis(long)
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisLong_throwsUnsupportedOperationException() {
        millisField.getMillis(5L);
    }

    // ---------------------------------------------------------------
    // getMillis(int, long)
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisIntLong_throwsUnsupportedOperationException() {
        millisField.getMillis(5, 100L);
    }

    // ---------------------------------------------------------------
    // getMillis(long, long)
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisLongLong_throwsUnsupportedOperationException() {
        millisField.getMillis(5L, 100L);
    }

    // ---------------------------------------------------------------
    // add(long, int)
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testAddLongInt_throwsUnsupportedOperationException() {
        millisField.add(100L, 5);
    }

    // ---------------------------------------------------------------
    // add(long, long)
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testAddLongLong_throwsUnsupportedOperationException() {
        millisField.add(100L, 5L);
    }

    // ---------------------------------------------------------------
    // getDifference(long, long)
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetDifference_throwsUnsupportedOperationException() {
        millisField.getDifference(200L, 100L);
    }

    // ---------------------------------------------------------------
    // getDifferenceAsLong(long, long)
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetDifferenceAsLong_throwsUnsupportedOperationException() {
        millisField.getDifferenceAsLong(200L, 100L);
    }

    // ---------------------------------------------------------------
    // getUnitMillis
    // ---------------------------------------------------------------

    @Test
    public void testGetUnitMillis_alwaysZero() {
        assertEquals(0L, millisField.getUnitMillis());
    }

    // ---------------------------------------------------------------
    // compareTo
    // ---------------------------------------------------------------

    @Test
    public void testCompareTo_withUnsupportedField_returnsZero() {
        assertEquals(0, millisField.compareTo(secondsField));
    }

    @Test
    public void testCompareTo_withSupportedField_returnsOne() {
        SupportedDummyDurationField supportedField = new SupportedDummyDurationField();
        assertEquals(1, millisField.compareTo(supportedField));
    }

    // ---------------------------------------------------------------
    // equals
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(millisField.equals(millisField));
    }

    @Test
    public void testEquals_sameType_returnsTrue() {
        UnsupportedDurationField anotherMillis = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        assertTrue(millisField.equals(anotherMillis));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        assertFalse(millisField.equals(secondsField));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(millisField.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        assertFalse(millisField.equals("not a duration field"));
    }

    @Test
    public void testEquals_bothNullNames_returnsTrue() {
        UnsupportedDurationField nullField1 = UnsupportedDurationField.getInstance(null);
        // getInstance caches by type, so calling with null twice returns same instance
        UnsupportedDurationField nullField2 = UnsupportedDurationField.getInstance(null);
        assertTrue(nullField1.equals(nullField2));
    }

    // ---------------------------------------------------------------
    // hashCode
    // ---------------------------------------------------------------

    @Test
    public void testHashCode_consistentWithEquals() {
        UnsupportedDurationField anotherMillis = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        assertEquals(millisField.hashCode(), anotherMillis.hashCode());
    }

    @Test
    public void testHashCode_matchesNameHashCode() {
        assertEquals(millisField.getName().hashCode(), millisField.hashCode());
    }

    // ---------------------------------------------------------------
    // toString
    // ---------------------------------------------------------------

    @Test
    public void testToString_normalInput_returnsExpectedFormat() {
        String expected = "UnsupportedDurationField[" + millisField.getName() + ']';
        assertEquals(expected, millisField.toString());
    }

    // ---------------------------------------------------------------
    // readResolve (via serialization)
    // ---------------------------------------------------------------

    @Test
    public void testSerialization_deserializedInstance_isSameAsCachedInstance() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(millisField);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        assertSame(millisField, deserialized);
    }
}
