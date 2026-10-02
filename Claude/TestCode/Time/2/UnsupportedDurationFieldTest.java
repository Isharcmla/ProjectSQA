import org.junit.Assert;
import org.junit.Test;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.field.UnsupportedDurationField;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UnsupportedDurationFieldTest {

    //---------------------------------------------------------------------
    // getInstance
    //---------------------------------------------------------------------

    @Test
    public void testGetInstance_sameType_returnsSameCachedInstance() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        Assert.assertSame(field1, field2);
    }

    @Test
    public void testGetInstance_differentTypes_returnsDifferentInstances() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        Assert.assertNotSame(field1, field2);
    }

    @Test
    public void testGetInstance_firstCallCreatesCache_notNull() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        Assert.assertNotNull(field);
    }

    //---------------------------------------------------------------------
    // getType
    //---------------------------------------------------------------------

    @Test
    public void testGetType_normalType_returnsCorrectType() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        Assert.assertEquals(DurationFieldType.hours(), field.getType());
    }

    //---------------------------------------------------------------------
    // getName
    //---------------------------------------------------------------------

    @Test
    public void testGetName_normalType_returnsTypeName() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        Assert.assertEquals(DurationFieldType.days().getName(), field.getName());
    }

    //---------------------------------------------------------------------
    // isSupported
    //---------------------------------------------------------------------

    @Test
    public void testIsSupported_alwaysFalse() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
        Assert.assertFalse(field.isSupported());
    }

    //---------------------------------------------------------------------
    // isPrecise
    //---------------------------------------------------------------------

    @Test
    public void testIsPrecise_alwaysTrue() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.months());
        Assert.assertTrue(field.isPrecise());
    }

    //---------------------------------------------------------------------
    // getValue(long)
    //---------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueLong_anyInput_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.years());
        field.getValue(100L);
    }

    @Test
    public void testGetValueLong_zeroInput_throwsExceptionWithMessage() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.years());
        try {
            field.getValue(0L);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            Assert.assertTrue(e.getMessage().contains("unsupported"));
        }
    }

    //---------------------------------------------------------------------
    // getValueAsLong(long)
    //---------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLongLong_anyInput_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.centuries());
        field.getValueAsLong(Long.MAX_VALUE);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLongLong_negativeInput_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.centuries());
        field.getValueAsLong(-100L);
    }

    //---------------------------------------------------------------------
    // getValue(long, long)
    //---------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueLongLong_anyInput_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.eras());
        field.getValue(100L, 200L);
    }

    //---------------------------------------------------------------------
    // getValueAsLong(long, long)
    //---------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLongLongLong_anyInput_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.halfdays());
        field.getValueAsLong(100L, 200L);
    }

    //---------------------------------------------------------------------
    // getMillis(int)
    //---------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisInt_anyInput_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        field.getMillis(5);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisInt_zeroInput_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        field.getMillis(0);
    }

    //---------------------------------------------------------------------
    // getMillis(long)
    //---------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisLong_anyInput_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        field.getMillis(5L);
    }

    //---------------------------------------------------------------------
    // getMillis(int, long)
    //---------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisIntLong_anyInput_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        field.getMillis(5, 1000L);
    }

    //---------------------------------------------------------------------
    // getMillis(long, long)
    //---------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisLongLong_anyInput_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        field.getMillis(5L, 1000L);
    }

    //---------------------------------------------------------------------
    // add(long, int)
    //---------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testAddLongInt_anyInput_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        field.add(100L, 5);
    }

    //---------------------------------------------------------------------
    // add(long, long)
    //---------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testAddLongLong_anyInput_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
        field.add(100L, 5L);
    }

    //---------------------------------------------------------------------
    // getDifference(long, long)
    //---------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetDifference_anyInput_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.months());
        field.getDifference(1000L, 500L);
    }

    //---------------------------------------------------------------------
    // getDifferenceAsLong(long, long)
    //---------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetDifferenceAsLong_anyInput_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.years());
        field.getDifferenceAsLong(1000L, 500L);
    }

    //---------------------------------------------------------------------
    // getUnitMillis
    //---------------------------------------------------------------------

    @Test
    public void testGetUnitMillis_alwaysZero() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.centuries());
        Assert.assertEquals(0L, field.getUnitMillis());
    }

    //---------------------------------------------------------------------
    // compareTo
    //---------------------------------------------------------------------

    @Test
    public void testCompareTo_anyField_returnsZero() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.eras());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.halfdays());
        Assert.assertEquals(0, field1.compareTo(field2));
    }

    @Test
    public void testCompareTo_sameField_returnsZero() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        Assert.assertEquals(0, field.compareTo(field));
    }

    //---------------------------------------------------------------------
    // equals
    //---------------------------------------------------------------------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        Assert.assertTrue(field.equals(field));
    }

    @Test
    public void testEquals_sameTypeDifferentInstance_returnsTrue() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        Assert.assertTrue(field1.equals(field2));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.days());
        Assert.assertFalse(field1.equals(field2));
    }

    @Test
    public void testEquals_nonUnsupportedDurationFieldObject_returnsFalse() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
        Assert.assertFalse(field.equals("someString"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.months());
        Assert.assertFalse(field.equals(null));
    }

    //---------------------------------------------------------------------
    // hashCode
    //---------------------------------------------------------------------

    @Test
    public void testHashCode_sameType_returnsSameHashCode() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.years());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.years());
        Assert.assertEquals(field1.hashCode(), field2.hashCode());
    }

    @Test
    public void testHashCode_matchesNameHashCode() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.centuries());
        Assert.assertEquals(field.getName().hashCode(), field.hashCode());
    }

    //---------------------------------------------------------------------
    // toString
    //---------------------------------------------------------------------

    @Test
    public void testToString_normalType_containsTypeName() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.eras());
        String result = field.toString();
        Assert.assertTrue(result.startsWith("UnsupportedDurationField["));
        Assert.assertTrue(result.endsWith("]"));
        Assert.assertTrue(result.contains(field.getName()));
    }

    //---------------------------------------------------------------------
    // readResolve (via serialization)
    //---------------------------------------------------------------------

    @Test
    public void testSerialization_deserializedInstance_isSameCachedInstance() throws Exception {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.halfdays());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(field);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        Assert.assertSame(field, deserialized);
    }
}
