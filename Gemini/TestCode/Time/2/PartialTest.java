package org.joda.time;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PartialTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();

    private DateTimeZone defaultZone;
    private Locale defaultLocale;

    @Before
    public void setUp() {
        defaultZone = DateTimeZone.getDefault();
        defaultLocale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        Locale.setDefault(Locale.UK);
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(defaultZone);
        Locale.setDefault(defaultLocale);
    }

    //-----------------------------------------------------------------------
    // Constructors
    //-----------------------------------------------------------------------

    @Test
    public void testConstructor_noArgs() {
        Partial test = new Partial();
        assertEquals(0, test.size());
        assertEquals(ISO_UTC, test.getChronology());
        assertEquals(0, test.getFieldTypes().length);
        assertEquals(0, test.getValues().length);
    }

    @Test
    public void testConstructor_Chronology() {
        Partial test = new Partial(GREGORIAN_UTC);
        assertEquals(0, test.size());
        assertEquals(GREGORIAN_UTC, test.getChronology());

        test = new Partial((Chronology) null);
        assertEquals(ISO_UTC, test.getChronology());
    }

    @Test
    public void testConstructor_Type_int() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        assertEquals(1, test.size());
        assertEquals(ISO_UTC, test.getChronology());
        assertEquals(DateTimeFieldType.year(), test.getFieldType(0));
        assertEquals(2005, test.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Type_int_nullType() {
        new Partial((DateTimeFieldType) null, 2005);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Type_int_invalidValue() {
        new Partial(DateTimeFieldType.dayOfMonth(), 32);
    }

    @Test
    public void testConstructor_Type_int_Chronology() {
        Partial test = new Partial(DateTimeFieldType.year(), 2548, BuddhistChronology.getInstanceUTC());
        assertEquals(1, test.size());
        assertEquals(BuddhistChronology.getInstanceUTC(), test.getChronology());
        assertEquals(DateTimeFieldType.year(), test.getFieldType(0));
        assertEquals(2548, test.getValue(0));

        test = new Partial(DateTimeFieldType.year(), 2005, null);
        assertEquals(ISO_UTC, test.getChronology());
    }

    @Test
    public void testConstructor_TypeArray_intArray() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        };
        int[] values = new int[] { 2005, 6, 25 };
        Partial test = new Partial(types, values);
        assertEquals(3, test.size());
        assertEquals(ISO_UTC, test.getChronology());
        assertArrayEquals(types, test.getFieldTypes());
        assertArrayEquals(values, test.getValues());
    }

    @Test
    public void testConstructor_TypeArray_intArray_empty() {
        Partial test = new Partial(new DateTimeFieldType[0], new int[0]);
        assertEquals(0, test.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_TypeArray_intArray_nullTypes() {
        new Partial((DateTimeFieldType[]) null, new int[] { 1 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_TypeArray_intArray_nullValues() {
        new Partial(new DateTimeFieldType[] { DateTimeFieldType.year() }, (int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_TypeArray_intArray_differentLength() {
        new Partial(new DateTimeFieldType[] { DateTimeFieldType.year() }, new int[] { 1, 2 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_TypeArray_intArray_nullElement() {
        new Partial(new DateTimeFieldType[] { DateTimeFieldType.year(), null }, new int[] { 2005, 6 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_TypeArray_intArray_wrongOrder_durationField() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.year()
        };
        new Partial(types, new int[] { 6, 2005 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_TypeArray_intArray_duplicate_noRange() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.era(),
            DateTimeFieldType.era()
        };
        new Partial(types, new int[] { 1, 1 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_TypeArray_intArray_sameDuration_secondHasNoRange() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.yearOfEra(),
            DateTimeFieldType.year()
        };
        new Partial(types, new int[] { 2005, 2005 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_TypeArray_intArray_sameDuration_wrongRangeOrder() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfMonth(),
            DateTimeFieldType.dayOfYear()
        };
        new Partial(types, new int[] { 15, 100 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_TypeArray_intArray_duplicate_withRange() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfMonth(),
            DateTimeFieldType.dayOfMonth()
        };
        new Partial(types, new int[] { 15, 15 });
    }

    @Test
    public void testConstructor_ReadablePartial() {
        YearMonthDay ymd = new YearMonthDay(2005, 6, 25);
        Partial test = new Partial(ymd);
        assertEquals(3, test.size());
        assertEquals(DateTimeFieldType.year(), test.getFieldType(0));
        assertEquals(DateTimeFieldType.monthOfYear(), test.getFieldType(1));
        assertEquals(DateTimeFieldType.dayOfMonth(), test.getFieldType(2));
        assertEquals(2005, test.getValue(0));
        assertEquals(6, test.getValue(1));
        assertEquals(25, test.getValue(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_ReadablePartial_null() {
        new Partial((ReadablePartial) null);
    }

    //-----------------------------------------------------------------------
    // Getters and Basic operations
    //-----------------------------------------------------------------------

    @Test
    public void testGetField_int_Chronology() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        DateTimeField field = test.getField(0, ISO_UTC);
        assertEquals(DateTimeFieldType.year(), field.getType());
    }

    @Test
    public void testGetFieldType() {
        Partial test = new Partial(new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour() }, new int[] { 10, 20 });
        assertEquals(DateTimeFieldType.hourOfDay(), test.getFieldType(0));
        assertEquals(DateTimeFieldType.minuteOfHour(), test.getFieldType(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldType_invalidIndex() {
        Partial test = new Partial();
        test.getFieldType(0);
    }

    @Test
    public void testGetValue() {
        Partial test = new Partial(new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour() }, new int[] { 10, 20 });
        assertEquals(10, test.getValue(0));
        assertEquals(20, test.getValue(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalidIndex() {
        Partial test = new Partial();
        test.getValue(0);
    }

    @Test
    public void testGetValuesAndFieldTypes_cloning() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        int[] values = test.getValues();
        values[0] = 2006;
        assertEquals(2005, test.getValue(0));

        DateTimeFieldType[] types = test.getFieldTypes();
        types[0] = DateTimeFieldType.dayOfMonth();
        assertEquals(DateTimeFieldType.year(), test.getFieldType(0));
    }

    //-----------------------------------------------------------------------
    // withChronologyRetainFields
    //-----------------------------------------------------------------------

    @Test
    public void testWithChronologyRetainFields_sameChronology() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005, ISO_UTC);
        Partial result = test.withChronologyRetainFields(ISO_UTC);
        assertSame(test, result);

        result = test.withChronologyRetainFields(null);
        assertSame(test, result);
    }

    @Test
    public void testWithChronologyRetainFields_differentChronology() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005, ISO_UTC);
        Partial result = test.withChronologyRetainFields(COPTIC_UTC);
        assertNotSame(test, result);
        assertEquals(COPTIC_UTC, result.getChronology());
        assertEquals(2005, result.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithChronologyRetainFields_invalidForChronology() {
        Partial test = new Partial(DateTimeFieldType.dayOfMonth(), 31);
        // Coptic months have 30 days
        test.withChronologyRetainFields(COPTIC_UTC);
    }

    //-----------------------------------------------------------------------
    // with and without
    //-----------------------------------------------------------------------

    @Test
    public void testWith_newField() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        Partial result = test.with(DateTimeFieldType.monthOfYear(), 6);
        assertEquals(2, result.size());
        assertEquals(DateTimeFieldType.year(), result.getFieldType(0));
        assertEquals(DateTimeFieldType.monthOfYear(), result.getFieldType(1));
        assertEquals(2005, result.getValue(0));
        assertEquals(6, result.getValue(1));

        // Insert at beginning
        result = test.with(DateTimeFieldType.era(), 1);
        assertEquals(2, result.size());
        assertEquals(DateTimeFieldType.era(), result.getFieldType(0));
        assertEquals(DateTimeFieldType.year(), result.getFieldType(1));

        // Insert between
        Partial p = new Partial(new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth() }, new int[] { 2005, 25 });
        result = p.with(DateTimeFieldType.monthOfYear(), 6);
        assertEquals(3, result.size());
        assertEquals(DateTimeFieldType.year(), result.getFieldType(0));
        assertEquals(DateTimeFieldType.monthOfYear(), result.getFieldType(1));
        assertEquals(DateTimeFieldType.dayOfMonth(), result.getFieldType(2));
    }

    @Test
    public void testWith_sameField_sameValue() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        Partial result = test.with(DateTimeFieldType.year(), 2005);
        assertSame(test, result);
    }

    @Test
    public void testWith_sameField_differentValue() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        Partial result = test.with(DateTimeFieldType.year(), 2006);
        assertNotSame(test, result);
        assertEquals(2006, result.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWith_nullFieldType() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        test.with(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWith_invalidValue() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        test.with(DateTimeFieldType.monthOfYear(), 13);
    }

    @Test
    public void testWithout() {
        Partial test = new Partial(new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }, new int[] { 2005, 6 });
        Partial result = test.without(DateTimeFieldType.year());
        assertEquals(1, result.size());
        assertEquals(DateTimeFieldType.monthOfYear(), result.getFieldType(0));
        assertEquals(6, result.getValue(0));

        result = test.without(DateTimeFieldType.dayOfMonth());
        assertSame(test, result);

        result = test.without(null);
        assertSame(test, result);
    }

    //-----------------------------------------------------------------------
    // withField, withFieldAdded, withFieldAddWrapped
    //-----------------------------------------------------------------------

    @Test
    public void testWithField() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        assertSame(test, test.withField(DateTimeFieldType.year(), 2005));

        Partial result = test.withField(DateTimeFieldType.year(), 2006);
        assertNotSame(test, result);
        assertEquals(2006, result.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_unsupported() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        test.withField(DateTimeFieldType.monthOfYear(), 6);
    }

    @Test
    public void testWithFieldAdded() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        assertSame(test, test.withFieldAdded(DurationFieldType.years(), 0));

        Partial result = test.withFieldAdded(DurationFieldType.years(), 5);
        assertEquals(2010, result.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_unsupported() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        test.withFieldAdded(DurationFieldType.months(), 1);
    }

    @Test
    public void testWithFieldAddWrapped() {
        Partial test = new Partial(new DateTimeFieldType[] { DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }, new int[] { 12, 20 });
        assertSame(test, test.withFieldAddWrapped(DurationFieldType.months(), 0));

        Partial result = test.withFieldAddWrapped(DurationFieldType.months(), 1);
        assertEquals(1, result.getValue(0));
        assertEquals(20, result.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAddWrapped_unsupported() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        test.withFieldAddWrapped(DurationFieldType.days(), 1);
    }

    //-----------------------------------------------------------------------
    // Period arithmetic
    //-----------------------------------------------------------------------

    @Test
    public void testWithPeriodAdded_plus_minus() {
        Partial test = new Partial(new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }, new int[] { 2005, 6 });
        assertSame(test, test.withPeriodAdded(null, 1));
        assertSame(test, test.withPeriodAdded(Period.years(1), 0));
        assertSame(test, test.plus(null));
        assertSame(test, test.plus(Period.ZERO));
        assertSame(test, test.minus(null));
        assertSame(test, test.minus(Period.ZERO));

        Period period = Period.years(2).withMonths(3).withDays(5); // days will be ignored
        Partial added = test.plus(period);
        assertEquals(2007, added.getValue(0));
        assertEquals(9, added.getValue(1));

        Partial subtracted = test.minus(period);
        assertEquals(2003, subtracted.getValue(0));
        assertEquals(3, subtracted.getValue(1));
    }

    //-----------------------------------------------------------------------
    // Property
    //-----------------------------------------------------------------------

    @Test
    public void testProperty() {
        Partial test = new Partial(new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }, new int[] { 2005, 6 });
        Partial.Property prop = test.property(DateTimeFieldType.monthOfYear());

        assertNotNull(prop);
        assertSame(test, prop.getPartial());
        assertSame(test, prop.getReadablePartial());
        assertEquals(DateTimeFieldType.monthOfYear(), prop.getFieldType());
        assertEquals(6, prop.get());
        assertEquals("6", prop.getAsString());
        assertEquals("June", prop.getAsText(Locale.ENGLISH));
        assertEquals("Jun", prop.getAsShortText(Locale.ENGLISH));
        assertEquals(1, prop.getMinimumValue());
        assertEquals(12, prop.getMaximumValue());

        Partial added = prop.addToCopy(2);
        assertEquals(8, added.getValue(1));

        Partial wrapped = prop.addWrapFieldToCopy(8);
        assertEquals(2, wrapped.getValue(1));

        Partial setInt = prop.setCopy(11);
        assertEquals(11, setInt.getValue(1));

        Partial setString = prop.setCopy("December", Locale.ENGLISH);
        assertEquals(12, setString.getValue(1));

        setString = prop.setCopy("7");
        assertEquals(7, setString.getValue(1));

        Partial withMin = prop.withMinimumValue();
        assertEquals(1, withMin.getValue(1));

        Partial withMax = prop.withMaximumValue();
        assertEquals(12, withMax.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_unsupported() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        test.property(DateTimeFieldType.dayOfMonth());
    }

    //-----------------------------------------------------------------------
    // isMatch
    //-----------------------------------------------------------------------

    @Test
    public void testIsMatch_Instant() {
        Partial test = new Partial(new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }, new int[] { 2005, 6 });
        DateTime match = new DateTime(2005, 6, 15, 12, 0, 0, 0, DateTimeZone.UTC);
        DateTime noMatch = new DateTime(2005, 7, 15, 12, 0, 0, 0, DateTimeZone.UTC);

        assertTrue(test.isMatch(match));
        assertFalse(test.isMatch(noMatch));

        // empty Partial matches anything
        Partial empty = new Partial();
        assertTrue(empty.isMatch((ReadableInstant) null));
        assertTrue(empty.isMatch(match));
    }

    @Test
    public void testIsMatch_Partial() {
        Partial test = new Partial(new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }, new int[] { 2005, 6 });
        YearMonthDay match = new YearMonthDay(2005, 6, 25);
        YearMonthDay noMatch = new YearMonthDay(2005, 7, 25);

        assertTrue(test.isMatch(match));
        assertFalse(test.isMatch(noMatch));

        Partial empty = new Partial();
        assertTrue(empty.isMatch(match));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMatch_Partial_null() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        test.isMatch((ReadablePartial) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMatch_Partial_missingField() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        TimeOfDay tod = new TimeOfDay(12, 30);
        test.isMatch(tod);
    }

    //-----------------------------------------------------------------------
    // Formatting and toString
    //-----------------------------------------------------------------------

    @Test
    public void testGetFormatter() {
        Partial empty = new Partial();
        assertNull(empty.getFormatter());

        Partial ymd = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        }, new int[] { 2005, 6, 25 });
        assertNotNull(ymd.getFormatter());

        // Cache hit
        assertNotNull(ymd.getFormatter());

        Partial unsupportedCombo = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.era(),
            DateTimeFieldType.dayOfMonth()
        }, new int[] { 1, 25 });
        assertNull(unsupportedCombo.getFormatter());
    }

    @Test
    public void testToString() {
        Partial empty = new Partial();
        assertEquals("[]", empty.toString());

        Partial ymd = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        }, new int[] { 2005, 6, 25 });
        assertEquals("2005-06-25", ymd.toString());

        Partial nonISO = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.era(),
            DateTimeFieldType.dayOfMonth()
        }, new int[] { 1, 25 });
        assertEquals("[era=1, dayOfMonth=25]", nonISO.toString());
    }

    @Test
    public void testToStringList() {
        Partial test = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.hourOfDay(),
            DateTimeFieldType.minuteOfHour()
        }, new int[] { 10, 20 });
        assertEquals("[hourOfDay=10, minuteOfHour=20]", test.toStringList());
    }

    @Test
    public void testToString_String() {
        Partial test = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear()
        }, new int[] { 2005, 6 });

        assertEquals("2005/06", test.toString("yyyy/MM"));
        assertEquals(test.toString(), test.toString((String) null));
    }

    @Test
    public void testToString_String_Locale() {
        Partial test = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear()
        }, new int[] { 2005, 6 });

        assertEquals("June", test.toString("MMMM", Locale.ENGLISH));
        assertEquals("juin", test.toString("MMMM", Locale.FRENCH));
        assertEquals(test.toString(), test.toString(null, Locale.ENGLISH));
    }

    //-----------------------------------------------------------------------
    // Serialization
    //-----------------------------------------------------------------------

    @Test
    public void testSerialization() throws Exception {
        Partial test = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear()
        }, new int[] { 2005, 6 });

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Partial result = (Partial) ois.readObject();
        ois.close();

        assertEquals(test, result);
        assertEquals(test.getChronology(), result.getChronology());
        assertArrayEquals(test.getFieldTypes(), result.getFieldTypes());
        assertArrayEquals(test.getValues(), result.getValues());
    }

    @Test
    public void testPropertySerialization() throws Exception {
        Partial test = new Partial(new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear()
        }, new int[] { 2005, 6 });
        Partial.Property prop = test.property(DateTimeFieldType.monthOfYear());

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
        assertEquals(prop.getPartial(), result.getPartial());
    }
}
