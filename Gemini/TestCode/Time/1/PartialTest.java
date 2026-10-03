package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.Assert;
import org.junit.Test;

public class PartialTest {

    @Test
    public void testConstructor_noArg() {
        Partial p = new Partial();
        Assert.assertEquals(0, p.size());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), p.getChronology());
        Assert.assertEquals(0, p.getFieldTypes().length);
        Assert.assertEquals(0, p.getValues().length);
    }

    @Test
    public void testConstructor_chronology() {
        Partial p = new Partial((Chronology) null);
        Assert.assertEquals(0, p.size());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), p.getChronology());

        BuddhistChronology b = BuddhistChronology.getInstance();
        p = new Partial(b);
        Assert.assertEquals(BuddhistChronology.getInstanceUTC(), p.getChronology());
    }

    @Test
    public void testConstructor_type_value() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        Assert.assertEquals(1, p.size());
        Assert.assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        Assert.assertEquals(2020, p.getValue(0));
        Assert.assertEquals(ISOChronology.getInstanceUTC(), p.getChronology());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_type_nullType() {
        new Partial((DateTimeFieldType) null, 2020);
    }

    @Test
    public void testConstructor_type_value_chronology() {
        BuddhistChronology b = BuddhistChronology.getInstance();
        Partial p = new Partial(DateTimeFieldType.year(), 2563, b);
        Assert.assertEquals(1, p.size());
        Assert.assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        Assert.assertEquals(2563, p.getValue(0));
        Assert.assertEquals(BuddhistChronology.getInstanceUTC(), p.getChronology());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_type_nullType_chronology() {
        new Partial(null, 1, ISOChronology.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_type_invalidValue() {
        new Partial(DateTimeFieldType.monthOfYear(), 13);
    }

    @Test
    public void testConstructor_arrays() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        };
        int[] values = new int[] { 2020, 5, 20 };
        Partial p = new Partial(types, values);
        Assert.assertEquals(3, p.size());
        Assert.assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        Assert.assertEquals(2020, p.getValue(0));
        Assert.assertEquals(DateTimeFieldType.monthOfYear(), p.getFieldType(1));
        Assert.assertEquals(5, p.getValue(1));
        Assert.assertEquals(DateTimeFieldType.dayOfMonth(), p.getFieldType(2));
        Assert.assertEquals(20, p.getValue(2));
    }

    @Test
    public void testConstructor_emptyArrays() {
        Partial p = new Partial(new DateTimeFieldType[0], new int[0]);
        Assert.assertEquals(0, p.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullTypesArray() {
        new Partial((DateTimeFieldType[]) null, new int[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullValuesArray() {
        new Partial(new DateTimeFieldType[0], (int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_arrayLengthMismatch() {
        new Partial(new DateTimeFieldType[] { DateTimeFieldType.year() }, new int[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullElementInTypes() {
        new Partial(new DateTimeFieldType[] { DateTimeFieldType.year(), null }, new int[] { 2020, 1 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_wrongOrderUnitField() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.year()
        };
        new Partial(types, new int[] { 5, 2020 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_duplicateUnitFieldWithoutRange() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.era(),
            DateTimeFieldType.era()
        };
        new Partial(types, new int[] { 1, 1 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_sameUnitField_oneWithNullRange_oneWithout() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfYear(),
            DateTimeFieldType.dayOfMonth()
        };
        new Partial(types, new int[] { 100, 10 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_sameUnitField_wrongRangeOrder() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfWeek(),
            DateTimeFieldType.dayOfMonth()
        };
        new Partial(types, new int[] { 1, 1 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_duplicateFieldWithRange() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfMonth(),
            DateTimeFieldType.dayOfMonth()
        };
        new Partial(types, new int[] { 10, 10 });
    }

    @Test
    public void testConstructor_sameUnitField_correctOrder() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfMonth(),
            DateTimeFieldType.dayOfWeek()
        };
        Partial p = new Partial(types, new int[] { 10, 1 });
        Assert.assertEquals(2, p.size());
    }

    @Test
    public void testConstructor_readablePartial() {
        LocalDate date = new LocalDate(2020, 5, 20);
        Partial p = new Partial(date);
        Assert.assertEquals(3, p.size());
        Assert.assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        Assert.assertEquals(2020, p.getValue(0));
        Assert.assertEquals(DateTimeFieldType.monthOfYear(), p.getFieldType(1));
        Assert.assertEquals(5, p.getValue(1));
        Assert.assertEquals(DateTimeFieldType.dayOfMonth(), p.getFieldType(2));
        Assert.assertEquals(20, p.getValue(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullReadablePartial() {
        new Partial((ReadablePartial) null);
    }

    @Test
    public void testPackageConstructors() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        Partial copyValues = new Partial(p, new int[] { 2021 });
        Assert.assertEquals(2021, copyValues.getValue(0));

        Partial fullCopy = new Partial(ISOChronology.getInstanceUTC(), new DateTimeFieldType[] { DateTimeFieldType.year() }, new int[] { 2022 });
        Assert.assertEquals(2022, fullCopy.getValue(0));
    }

    @Test
    public void testGetField_and_getFieldTypes() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        DateTimeField field = p.getField(0, ISOChronology.getInstanceUTC());
        Assert.assertEquals("year", field.getName());

        DateTimeFieldType[] types = p.getFieldTypes();
        Assert.assertEquals(1, types.length);
        Assert.assertEquals(DateTimeFieldType.year(), types[0]);

        int[] values = p.getValues();
        Assert.assertEquals(1, values.length);
        Assert.assertEquals(2020, values[0]);
    }

    @Test
    public void testWithChronologyRetainFields() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        Partial same = p.withChronologyRetainFields(null);
        Assert.assertSame(p, same);

        same = p.withChronologyRetainFields(ISOChronology.getInstanceUTC());
        Assert.assertSame(p, same);

        BuddhistChronology b = BuddhistChronology.getInstance();
        Partial changed = p.withChronologyRetainFields(b);
        Assert.assertEquals(BuddhistChronology.getInstanceUTC(), changed.getChronology());
        Assert.assertEquals(2020, changed.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithChronologyRetainFields_invalidForChronology() {
        Partial p = new Partial(DateTimeFieldType.dayOfMonth(), 30);
        p.withChronologyRetainFields(GJChronology.getInstanceUTC());
    }

    @Test
    public void testWith() {
        Partial p = new Partial();
        p = p.with(DateTimeFieldType.monthOfYear(), 5);
        Assert.assertEquals(1, p.size());
        Assert.assertEquals(5, p.getValue(0));

        p = p.with(DateTimeFieldType.year(), 2020);
        Assert.assertEquals(2, p.size());
        Assert.assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        Assert.assertEquals(DateTimeFieldType.monthOfYear(), p.getFieldType(1));

        p = p.with(DateTimeFieldType.dayOfWeek(), 3);
        p = p.with(DateTimeFieldType.dayOfMonth(), 15);
        Assert.assertEquals(4, p.size());
        Assert.assertEquals(DateTimeFieldType.dayOfMonth(), p.getFieldType(2));
        Assert.assertEquals(DateTimeFieldType.dayOfWeek(), p.getFieldType(3));

        Partial same = p.with(DateTimeFieldType.year(), 2020);
        Assert.assertSame(p, same);

        Partial updated = p.with(DateTimeFieldType.year(), 2021);
        Assert.assertEquals(2021, updated.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWith_nullFieldType() {
        Partial p = new Partial();
        p.with(null, 1);
    }

    @Test
    public void testWithout() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020)
                .with(DateTimeFieldType.monthOfYear(), 5)
                .with(DateTimeFieldType.dayOfMonth(), 20);

        Partial removed = p.without(DateTimeFieldType.monthOfYear());
        Assert.assertEquals(2, removed.size());
        Assert.assertEquals(DateTimeFieldType.year(), removed.getFieldType(0));
        Assert.assertEquals(DateTimeFieldType.dayOfMonth(), removed.getFieldType(1));

        Partial notPresent = p.without(DateTimeFieldType.hourOfDay());
        Assert.assertSame(p, notPresent);

        Partial nullField = p.without(null);
        Assert.assertSame(p, nullField);
    }

    @Test
    public void testWithField() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        Partial same = p.withField(DateTimeFieldType.year(), 2020);
        Assert.assertSame(p, same);

        Partial updated = p.withField(DateTimeFieldType.year(), 2021);
        Assert.assertEquals(2021, updated.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_unsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        p.withField(DateTimeFieldType.monthOfYear(), 5);
    }

    @Test
    public void testWithFieldAdded() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        Partial same = p.withFieldAdded(DurationFieldType.years(), 0);
        Assert.assertSame(p, same);

        Partial updated = p.withFieldAdded(DurationFieldType.years(), 5);
        Assert.assertEquals(2025, updated.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_unsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        p.withFieldAdded(DurationFieldType.months(), 1);
    }

    @Test
    public void testWithFieldAddWrapped() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 11);
        Partial same = p.withFieldAddWrapped(DurationFieldType.months(), 0);
        Assert.assertSame(p, same);

        Partial updated = p.withFieldAddWrapped(DurationFieldType.months(), 3);
        Assert.assertEquals(2, updated.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAddWrapped_unsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        p.withFieldAddWrapped(DurationFieldType.months(), 1);
    }

    @Test
    public void testWithPeriodAdded_plus_minus() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020)
                .with(DateTimeFieldType.monthOfYear(), 5);

        Partial same1 = p.withPeriodAdded(null, 1);
        Assert.assertSame(p, same1);

        Partial same2 = p.withPeriodAdded(Period.years(1), 0);
        Assert.assertSame(p, same2);

        Period period = Period.years(2).withMonths(3).withDays(10);
        Partial updated = p.withPeriodAdded(period, 1);
        Assert.assertEquals(2022, updated.get(DateTimeFieldType.year()));
        Assert.assertEquals(8, updated.get(DateTimeFieldType.monthOfYear()));

        Partial plus = p.plus(Period.years(1));
        Assert.assertEquals(2021, plus.get(DateTimeFieldType.year()));

        Partial plusNull = p.plus(null);
        Assert.assertSame(p, plusNull);

        Partial minus = p.minus(Period.years(1));
        Assert.assertEquals(2019, minus.get(DateTimeFieldType.year()));

        Partial minusNull = p.minus(null);
        Assert.assertSame(p, minusNull);
    }

    @Test
    public void testProperty() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020)
                .with(DateTimeFieldType.monthOfYear(), 5);

        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());
        Assert.assertNotNull(prop.getField());
        Assert.assertEquals(p, prop.getReadablePartial());
        Assert.assertEquals(p, prop.getPartial());
        Assert.assertEquals(5, prop.get());

        Partial added = prop.addToCopy(2);
        Assert.assertEquals(7, added.get(DateTimeFieldType.monthOfYear()));

        Partial wrapAdded = prop.addWrapFieldToCopy(8);
        Assert.assertEquals(1, wrapAdded.get(DateTimeFieldType.monthOfYear()));

        Partial set = prop.setCopy(12);
        Assert.assertEquals(12, set.get(DateTimeFieldType.monthOfYear()));

        Partial setText = prop.setCopy("6");
        Assert.assertEquals(6, setText.get(DateTimeFieldType.monthOfYear()));

        Partial setTextLocale = prop.setCopy("July", Locale.ENGLISH);
        Assert.assertEquals(7, setTextLocale.get(DateTimeFieldType.monthOfYear()));

        Partial max = prop.withMaximumValue();
        Assert.assertEquals(12, max.get(DateTimeFieldType.monthOfYear()));

        Partial min = prop.withMinimumValue();
        Assert.assertEquals(1, min.get(DateTimeFieldType.monthOfYear()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_unsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        p.property(DateTimeFieldType.dayOfMonth());
    }

    @Test
    public void testIsMatch_instant() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020)
                .with(DateTimeFieldType.monthOfYear(), 5);

        DateTime dtMatch = new DateTime(2020, 5, 10, 12, 0, DateTimeZone.UTC);
        DateTime dtMismatch = new DateTime(2020, 6, 10, 12, 0, DateTimeZone.UTC);

        Assert.assertTrue(p.isMatch(dtMatch));
        Assert.assertFalse(p.isMatch(dtMismatch));

        Partial empty = new Partial();
        Assert.assertTrue(empty.isMatch((ReadableInstant) null));
    }

    @Test
    public void testIsMatch_partial() {
        Partial p1 = new Partial(DateTimeFieldType.year(), 2020)
                .with(DateTimeFieldType.monthOfYear(), 5);
        LocalDate matchDate = new LocalDate(2020, 5, 10);
        LocalDate mismatchDate = new LocalDate(2020, 6, 10);

        Assert.assertTrue(p1.isMatch(matchDate));
        Assert.assertFalse(p1.isMatch(mismatchDate));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMatch_nullPartial() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        p.isMatch((ReadablePartial) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMatch_partialMissingField() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020)
                .with(DateTimeFieldType.monthOfYear(), 5);
        LocalTime time = new LocalTime(12, 0);
        p.isMatch(time);
    }

    @Test
    public void testGetFormatter() {
        Partial empty = new Partial();
        Assert.assertNull(empty.getFormatter());

        Partial p = new Partial(DateTimeFieldType.year(), 2020)
                .with(DateTimeFieldType.monthOfYear(), 5)
                .with(DateTimeFieldType.dayOfMonth(), 20);
        Assert.assertNotNull(p.getFormatter());
    }

    @Test
    public void testToString_formats() {
        Partial empty = new Partial();
        Assert.assertEquals("[]", empty.toString());
        Assert.assertEquals("[]", empty.toStringList());

        Partial p = new Partial(DateTimeFieldType.year(), 2020)
                .with(DateTimeFieldType.monthOfYear(), 5)
                .with(DateTimeFieldType.dayOfMonth(), 20);

        Assert.assertEquals("2020-05-20", p.toString());
        Assert.assertEquals("[year=2020, monthOfYear=5, dayOfMonth=20]", p.toStringList());

        Assert.assertEquals("2020-05-20", p.toString((String) null));
        Assert.assertEquals("20/05/2020", p.toString("dd/MM/yyyy"));
        Assert.assertEquals("20/05/2020", p.toString("dd/MM/yyyy", Locale.ENGLISH));
        Assert.assertEquals("2020-05-20", p.toString((String) null, Locale.ENGLISH));

        Partial custom = new Partial(DateTimeFieldType.dayOfMonth(), 20)
                .with(DateTimeFieldType.dayOfWeek(), 3);
        Assert.assertEquals("[dayOfMonth=20, dayOfWeek=3]", custom.toString());
    }

    @Test
    public void testSerialization() throws Exception {
        Partial p = new Partial(DateTimeFieldType.year(), 2020)
                .with(DateTimeFieldType.monthOfYear(), 5);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(p);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Partial result = (Partial) ois.readObject();
        ois.close();

        Assert.assertEquals(p, result);
        Assert.assertEquals(p.getChronology(), result.getChronology());
    }

    @Test
    public void testPropertySerialization() throws Exception {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        Partial.Property prop = p.property(DateTimeFieldType.year());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(prop);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Partial.Property result = (Partial.Property) ois.readObject();
        ois.close();

        Assert.assertEquals(prop.get(), result.get());
        Assert.assertEquals(prop.getPartial(), result.getPartial());
    }
}
