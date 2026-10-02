package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartialTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();

    // -----------------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------------

    @Test
    public void testConstructor_noArgs() {
        Partial p = new Partial();
        assertEquals(0, p.size());
        assertEquals(ISO_UTC, p.getChronology());
        assertEquals(0, p.getFieldTypes().length);
        assertEquals(0, p.getValues().length);
    }

    @Test
    public void testConstructor_Chronology_null() {
        Partial p = new Partial((Chronology) null);
        assertEquals(0, p.size());
        assertEquals(ISO_UTC, p.getChronology());
    }

    @Test
    public void testConstructor_Chronology_nonNull() {
        Partial p = new Partial(COPTIC_UTC);
        assertEquals(0, p.size());
        assertEquals(COPTIC_UTC, p.getChronology());

        Partial p2 = new Partial(CopticChronology.getInstance(PARIS));
        assertEquals(COPTIC_UTC, p2.getChronology());
    }

    @Test
    public void testConstructor_Type_int() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        assertEquals(1, p.size());
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        assertEquals(2020, p.getValue(0));
        assertEquals(ISO_UTC, p.getChronology());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Type_int_nullType() {
        new Partial((DateTimeFieldType) null, 2020);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Type_int_invalidValue() {
        new Partial(DateTimeFieldType.monthOfYear(), 13);
    }

    @Test
    public void testConstructor_Type_int_Chronology() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020, COPTIC_UTC);
        assertEquals(1, p.size());
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        assertEquals(2020, p.getValue(0));
        assertEquals(COPTIC_UTC, p.getChronology());

        Partial pNullChrono = new Partial(DateTimeFieldType.year(), 2020, null);
        assertEquals(ISO_UTC, pNullChrono.getChronology());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Type_int_Chronology_nullType() {
        new Partial((DateTimeFieldType) null, 2020, ISO_UTC);
    }

    @Test
    public void testConstructor_Types_Values() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        };
        int[] values = new int[] { 2023, 5, 20 };
        Partial p = new Partial(types, values);
        assertEquals(3, p.size());
        assertEquals(ISO_UTC, p.getChronology());
        assertArrayEquals(types, p.getFieldTypes());
        assertArrayEquals(values, p.getValues());
    }

    @Test
    public void testConstructor_Types_Values_empty() {
        Partial p = new Partial(new DateTimeFieldType[0], new int[0]);
        assertEquals(0, p.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Types_Values_nullTypes() {
        new Partial(null, new int[] { 2020 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Types_Values_nullValues() {
        new Partial(new DateTimeFieldType[] { DateTimeFieldType.year() }, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Types_Values_mismatchedLengths() {
        new Partial(new DateTimeFieldType[] { DateTimeFieldType.year() }, new int[] { 2020, 5 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Types_Values_nullElementInTypes() {
        new Partial(new DateTimeFieldType[] { DateTimeFieldType.year(), null }, new int[] { 2020, 5 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Types_Values_wrongOrder_unitField() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.year()
        };
        new Partial(types, new int[] { 5, 2020 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Types_Values_duplicate_nullRange() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.era(),
            DateTimeFieldType.era()
        };
        new Partial(types, new int[] { 1, 1 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Types_Values_order_sameUnit_nullRange() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.yearOfEra()
        };
        new Partial(types, new int[] { 2020, 2020 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Types_Values_order_sameUnit_smallerRangeFirst() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfWeek(),
            DateTimeFieldType.dayOfMonth()
        };
        new Partial(types, new int[] { 1, 15 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Types_Values_duplicate_withRange() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfMonth(),
            DateTimeFieldType.dayOfMonth()
        };
        new Partial(types, new int[] { 10, 10 });
    }

    @Test
    public void testConstructor_Types_Values_sameUnit_largerRangeFirst_valid() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfYear(),
            DateTimeFieldType.dayOfMonth(),
            DateTimeFieldType.dayOfWeek()
        };
        Partial p = new Partial(types, new int[] { 100, 10, 2 });
        assertEquals(3, p.size());
    }

    @Test
    public void testConstructor_ReadablePartial_valid() {
        LocalDate date = new LocalDate(2023, 6, 15);
        Partial p = new Partial(date);
        assertEquals(3, p.size());
        assertEquals(2023, p.getValue(0));
        assertEquals(6, p.getValue(1));
        assertEquals(15, p.getValue(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_ReadablePartial_null() {
        new Partial((ReadablePartial) null);
    }

    // -----------------------------------------------------------------------
    // Getters and basic methods
    // -----------------------------------------------------------------------

    @Test
    public void testGetField_validAndOutOfBounds() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        assertNotNull(p.getField(0, ISO_UTC));
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        assertEquals(2020, p.getValue(0));

        try {
            p.getFieldType(-1);
            fail();
        } catch (IndexOutOfBoundsException ex) {
            // expected
        }
        try {
            p.getValue(1);
            fail();
        } catch (IndexOutOfBoundsException ex) {
            // expected
        }
    }

    @Test
    public void testGetFieldTypes_and_getValues_cloning() {
        DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() };
        int[] values = new int[] { 2020, 10 };
        Partial p = new Partial(types, values);

        DateTimeFieldType[] returnedTypes = p.getFieldTypes();
        int[] returnedValues = p.getValues();
        assertArrayEquals(types, returnedTypes);
        assertArrayEquals(values, returnedValues);

        returnedTypes[0] = DateTimeFieldType.dayOfMonth();
        returnedValues[0] = 5;
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        assertEquals(2020, p.getValue(0));
    }

    // -----------------------------------------------------------------------
    // Chronology manipulation
    // -----------------------------------------------------------------------

    @Test
    public void testWithChronologyRetainFields_sameChronology() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020, ISO_UTC);
        Partial same = p.withChronologyRetainFields(ISO_UTC);
        assertSame(p, same);

        Partial sameNull = p.withChronologyRetainFields(null);
        assertSame(p, sameNull);
    }

    @Test
    public void testWithChronologyRetainFields_differentChronology() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020, ISO_UTC);
        Partial coptic = p.withChronologyRetainFields(COPTIC_UTC);
        assertNotSame(p, coptic);
        assertEquals(COPTIC_UTC, coptic.getChronology());
        assertEquals(2020, coptic.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithChronologyRetainFields_invalidForNewChronology() {
        Partial p = new Partial(DateTimeFieldType.dayOfMonth(), 31);
        p.withChronologyRetainFields(CopticChronology.getInstanceUTC()); // Coptic months only have 30 days
    }

    // -----------------------------------------------------------------------
    // with and without
    // -----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWith_nullFieldType() {
        Partial p = new Partial();
        p.with(null, 1);
    }

    @Test
    public void testWith_existingField_sameValue() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        Partial result = p.with(DateTimeFieldType.year(), 2020);
        assertSame(p, result);
    }

    @Test
    public void testWith_existingField_differentValue() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        Partial result = p.with(DateTimeFieldType.year(), 2021);
        assertNotSame(p, result);
        assertEquals(2021, result.getValue(0));
    }

    @Test
    public void testWith_addField_ordering() {
        Partial p = new Partial();
        p = p.with(DateTimeFieldType.minuteOfHour(), 30);
        assertEquals(1, p.size());
        assertEquals(DateTimeFieldType.minuteOfHour(), p.getFieldType(0));

        // Insert larger unit (hour) before minute
        p = p.with(DateTimeFieldType.hourOfDay(), 10);
        assertEquals(2, p.size());
        assertEquals(DateTimeFieldType.hourOfDay(), p.getFieldType(0));
        assertEquals(DateTimeFieldType.minuteOfHour(), p.getFieldType(1));

        // Insert smaller unit (second) after minute
        p = p.with(DateTimeFieldType.secondOfMinute(), 45);
        assertEquals(3, p.size());
        assertEquals(DateTimeFieldType.hourOfDay(), p.getFieldType(0));
        assertEquals(DateTimeFieldType.minuteOfHour(), p.getFieldType(1));
        assertEquals(DateTimeFieldType.secondOfMinute(), p.getFieldType(2));

        // Insert between (e.g., year and month)
        Partial pDate = new Partial(DateTimeFieldType.year(), 2020)
                .with(DateTimeFieldType.dayOfMonth(), 15)
                .with(DateTimeFieldType.monthOfYear(), 6);
        assertEquals(DateTimeFieldType.year(), pDate.getFieldType(0));
        assertEquals(DateTimeFieldType.monthOfYear(), pDate.getFieldType(1));
        assertEquals(DateTimeFieldType.dayOfMonth(), pDate.getFieldType(2));

        // Test insertion when same unit duration, compare range
        Partial pDay = new Partial(DateTimeFieldType.dayOfWeek(), 3)
                .with(DateTimeFieldType.dayOfYear(), 150)
                .with(DateTimeFieldType.dayOfMonth(), 20);
        assertEquals(DateTimeFieldType.dayOfYear(), pDay.getFieldType(0));
        assertEquals(DateTimeFieldType.dayOfMonth(), pDay.getFieldType(1));
        assertEquals(DateTimeFieldType.dayOfWeek(), pDay.getFieldType(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWith_invalidValueForField() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        p.with(DateTimeFieldType.monthOfYear(), 13);
    }

    @Test
    public void testWithout_fieldPresent() {
        Partial p = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        }, new int[] { 2020, 5, 10 });

        Partial removedMonth = p.without(DateTimeFieldType.monthOfYear());
        assertEquals(2, removedMonth.size());
        assertEquals(DateTimeFieldType.year(), removedMonth.getFieldType(0));
        assertEquals(DateTimeFieldType.dayOfMonth(), removedMonth.getFieldType(1));
        assertEquals(2020, removedMonth.getValue(0));
        assertEquals(10, removedMonth.getValue(1));

        Partial removedYear = p.without(DateTimeFieldType.year());
        assertEquals(2, removedYear.size());
        assertEquals(DateTimeFieldType.monthOfYear(), removedYear.getFieldType(0));

        Partial removedDay = p.without(DateTimeFieldType.dayOfMonth());
        assertEquals(2, removedDay.size());
        assertEquals(DateTimeFieldType.monthOfYear(), removedDay.getFieldType(1));
    }

    @Test
    public void testWithout_fieldNotPresent() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        Partial result = p.without(DateTimeFieldType.monthOfYear());
        assertSame(p, result);
        Partial resultNull = p.without(null);
        assertSame(p, resultNull);
    }

    // -----------------------------------------------------------------------
    // withField, withFieldAdded, withFieldAddWrapped
    // -----------------------------------------------------------------------

    @Test
    public void testWithField() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        assertSame(p, p.withField(DateTimeFieldType.year(), 2020));

        Partial updated = p.withField(DateTimeFieldType.year(), 2025);
        assertEquals(2025, updated.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_unsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        p.withField(DateTimeFieldType.monthOfYear(), 5);
    }

    @Test
    public void testWithFieldAdded() {
        Partial p = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.hourOfDay(),
            DateTimeFieldType.minuteOfHour()
        }, new int[] { 10, 30 });

        assertSame(p, p.withFieldAdded(DurationFieldType.minutes(), 0));

        Partial added = p.withFieldAdded(DurationFieldType.minutes(), 40);
        assertEquals(11, added.getValue(0));
        assertEquals(10, added.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_unsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        p.withFieldAdded(DurationFieldType.hours(), 5);
    }

    @Test
    public void testWithFieldAddWrapped() {
        Partial p = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.hourOfDay(),
            DateTimeFieldType.minuteOfHour()
        }, new int[] { 10, 30 });

        assertSame(p, p.withFieldAddWrapped(DurationFieldType.minutes(), 0));

        Partial wrapped = p.withFieldAddWrapped(DurationFieldType.minutes(), 40);
        // addWrapPartial on minuteOfHour wraps minutes without affecting hours
        assertEquals(10, wrapped.getValue(0));
        assertEquals(10, wrapped.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAddWrapped_unsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        p.withFieldAddWrapped(DurationFieldType.days(), 1);
    }

    // -----------------------------------------------------------------------
    // withPeriodAdded, plus, minus
    // -----------------------------------------------------------------------

    @Test
    public void testWithPeriodAdded_plus_minus() {
        Partial p = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        }, new int[] { 2020, 5, 10 });

        assertSame(p, p.withPeriodAdded(null, 1));
        assertSame(p, p.withPeriodAdded(Period.days(5), 0));
        assertSame(p, p.plus(null));
        assertSame(p, p.plus(Period.ZERO));
        assertSame(p, p.minus(null));
        assertSame(p, p.minus(Period.ZERO));

        // Period with supported and unsupported fields
        Period period = new Period().withYears(1).withMonths(2).withHours(5);
        Partial plusResult = p.plus(period);
        assertEquals(2021, plusResult.getValue(0));
        assertEquals(7, plusResult.getValue(1));
        assertEquals(10, plusResult.getValue(2));

        Partial minusResult = p.minus(period);
        assertEquals(2019, minusResult.getValue(0));
        assertEquals(3, minusResult.getValue(1));
        assertEquals(10, minusResult.getValue(2));
    }

    // -----------------------------------------------------------------------
    // isMatch
    // -----------------------------------------------------------------------

    @Test
    public void testIsMatch_ReadableInstant() {
        DateTime dt = new DateTime(2020, 5, 10, 12, 30, 0, 0, ISO_UTC);
        Partial matching = new Partial(DateTimeFieldType.year(), 2020)
                .with(DateTimeFieldType.monthOfYear(), 5);
        Partial nonMatching = new Partial(DateTimeFieldType.year(), 2021);

        assertTrue(matching.isMatch(dt));
        assertFalse(nonMatching.isMatch(dt));

        Partial empty = new Partial();
        assertTrue(empty.isMatch((ReadableInstant) null));
    }

    @Test
    public void testIsMatch_ReadablePartial() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020).with(DateTimeFieldType.monthOfYear(), 5);
        LocalDate matchDate = new LocalDate(2020, 5, 10);
        LocalDate nonMatchDate = new LocalDate(2020, 6, 10);

        assertTrue(p.isMatch(matchDate));
        assertFalse(p.isMatch(nonMatchDate));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMatch_ReadablePartial_null() {
        Partial p = new Partial();
        p.isMatch((ReadablePartial) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMatch_ReadablePartial_missingFieldInTarget() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        LocalTime time = new LocalTime(12, 0);
        p.isMatch(time);
    }

    // -----------------------------------------------------------------------
    // Formatter and toString
    // -----------------------------------------------------------------------

    @Test
    public void testGetFormatter_and_toString() {
        Partial empty = new Partial();
        assertNull(empty.getFormatter());
        assertEquals("[]", empty.toString());

        Partial ymd = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        }, new int[] { 2020, 5, 10 });

        assertNotNull(ymd.getFormatter());
        assertEquals("2020-05-10", ymd.toString());

        // Custom / unformatted combo -> falls back to toStringList()
        Partial custom = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.dayOfWeek()
        }, new int[] { 2020, 2 });
        assertEquals("[year=2020, dayOfWeek=2]", custom.toString());

        assertEquals("[year=2020, monthOfYear=5, dayOfMonth=10]", ymd.toStringList());

        assertEquals("2020/05/10", ymd.toString("yyyy/MM/dd"));
        assertEquals("2020-05-10", ymd.toString(null));

        assertEquals("2020-May", ymd.toString("yyyy-MMM", Locale.ENGLISH));
        assertEquals("2020-05-10", ymd.toString(null, Locale.ENGLISH));
    }

    // -----------------------------------------------------------------------
    // Property class tests
    // -----------------------------------------------------------------------

    @Test
    public void testProperty_accessors() {
        Partial p = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        }, new int[] { 2020, 5, 10 });

        Partial.Property yearProp = p.property(DateTimeFieldType.year());
        assertNotNull(yearProp.getField());
        assertSame(p, yearProp.getReadablePartial());
        assertSame(p, yearProp.getPartial());
        assertEquals(2020, yearProp.get());
        assertEquals(DateTimeFieldType.year(), yearProp.getFieldType());
        assertEquals("2020", yearProp.getAsString());
        assertEquals("2020", yearProp.getAsText());
        assertEquals("2020", yearProp.getAsShortText());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_unsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        p.property(DateTimeFieldType.dayOfMonth());
    }

    @Test
    public void testProperty_addToCopy() {
        Partial p = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear()
        }, new int[] { 2020, 11 });

        Partial.Property monthProp = p.property(DateTimeFieldType.monthOfYear());
        Partial added = monthProp.addToCopy(3);
        assertEquals(2021, added.getValue(0));
        assertEquals(2, added.getValue(1));
    }

    @Test
    public void testProperty_addWrapFieldToCopy() {
        Partial p = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear()
        }, new int[] { 2020, 11 });

        Partial.Property monthProp = p.property(DateTimeFieldType.monthOfYear());
        Partial wrapped = monthProp.addWrapFieldToCopy(3);
        assertEquals(2020, wrapped.getValue(0));
        assertEquals(2, wrapped.getValue(1));
    }

    @Test
    public void testProperty_setCopy_int() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        Partial.Property prop = p.property(DateTimeFieldType.year());
        Partial updated = prop.setCopy(2025);
        assertEquals(2025, updated.getValue(0));
    }

    @Test
    public void testProperty_setCopy_text() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 1);
        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());

        Partial updatedEn = prop.setCopy("December", Locale.ENGLISH);
        assertEquals(12, updatedEn.getValue(0));

        Partial updatedDefault = prop.setCopy("6");
        assertEquals(6, updatedDefault.getValue(0));
    }

    @Test
    public void testProperty_withMinAndMax() {
        Partial p = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear()
        }, new int[] { 2020, 5 });

        Partial.Property monthProp = p.property(DateTimeFieldType.monthOfYear());
        Partial maxPartial = monthProp.withMaximumValue();
        assertEquals(12, maxPartial.getValue(1));

        Partial minPartial = monthProp.withMinimumValue();
        assertEquals(1, minPartial.getValue(1));
    }

    // -----------------------------------------------------------------------
    // Serialization
    // -----------------------------------------------------------------------

    @Test
    public void testSerialization() throws Exception {
        Partial p = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        }, new int[] { 2023, 7, 24 });

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(p);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Partial result = (Partial) ois.readObject();
        ois.close();

        assertEquals(p, result);
        assertArrayEquals(p.getFieldTypes(), result.getFieldTypes());
        assertArrayEquals(p.getValues(), result.getValues());
        assertEquals(p.getChronology(), result.getChronology());
    }

    @Test
    public void testPropertySerialization() throws Exception {
        Partial p = new Partial(DateTimeFieldType.year(), 2023);
        Partial.Property prop = p.property(DateTimeFieldType.year());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(prop);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Partial.Property result = (Partial.Property) ois.readObject();
        ois.close();

        assertEquals(prop.get(), result.get());
        assertEquals(prop.getFieldType(), result.getFieldType());
    }
}
