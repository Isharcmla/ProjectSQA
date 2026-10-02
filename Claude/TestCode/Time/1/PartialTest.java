import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.GregorianChronology;

import java.util.Locale;

public class PartialTest {

    private Partial partialYMD;

    @Before
    public void setUp() {
        partialYMD = new Partial(
                new DateTimeFieldType[] {
                        DateTimeFieldType.year(),
                        DateTimeFieldType.monthOfYear(),
                        DateTimeFieldType.dayOfMonth()
                },
                new int[] {2013, 6, 15}
        );
    }

    // ---------------- Constructors ----------------

    @Test
    public void testDefaultConstructor_createsEmptyPartial() {
        Partial p = new Partial();
        assertEquals(0, p.size());
        assertNotNull(p.getChronology());
    }

    @Test
    public void testConstructorWithChronology_null_usesISO() {
        Partial p = new Partial((Chronology) null);
        assertEquals(0, p.size());
        assertEquals(ISOChronology.getInstanceUTC(), p.getChronology());
    }

    @Test
    public void testConstructorWithChronology_notNull_usesUTC() {
        Partial p = new Partial(GregorianChronology.getInstance());
        assertEquals(GregorianChronology.getInstanceUTC(), p.getChronology());
    }

    @Test
    public void testConstructorTypeValue_normal() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        assertEquals(1, p.size());
        assertEquals(2000, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTypeValue_nullType_throwsException() {
        new Partial((DateTimeFieldType) null, 5);
    }

    @Test
    public void testConstructorTypeValueChronology_normal() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 5, ISOChronology.getInstance());
        assertEquals(1, p.size());
        assertEquals(5, p.getValue(0));
    }

    @Test
    public void testConstructorTypesValues_normal() {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
        int[] values = {2013, 6};
        Partial p = new Partial(types, values);
        assertEquals(2, p.size());
        assertEquals(2013, p.getValue(0));
        assertEquals(6, p.getValue(1));
    }

    @Test
    public void testConstructorTypesValues_emptyArrays() {
        Partial p = new Partial(new DateTimeFieldType[0], new int[0]);
        assertEquals(0, p.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTypesValues_nullTypes_throwsException() {
        new Partial((DateTimeFieldType[]) null, new int[]{1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTypesValues_nullValues_throwsException() {
        new Partial(new DateTimeFieldType[]{DateTimeFieldType.year()}, (int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTypesValues_lengthMismatch_throwsException() {
        new Partial(new DateTimeFieldType[]{DateTimeFieldType.year()}, new int[]{1, 2});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTypesValues_nullTypeInArray_throwsException() {
        new Partial(new DateTimeFieldType[]{DateTimeFieldType.year(), null}, new int[]{2013, 1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTypesValues_wrongOrder_throwsException() {
        DateTimeFieldType[] types = {DateTimeFieldType.monthOfYear(), DateTimeFieldType.year()};
        int[] values = {6, 2013};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTypesValues_duplicateTypes_throwsException() {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.year()};
        int[] values = {2013, 2014};
        new Partial(types, values);
    }

    @Test
    public void testConstructorFromReadablePartial_normal() {
        Partial copy = new Partial(partialYMD);
        assertEquals(partialYMD.size(), copy.size());
        for (int i = 0; i < partialYMD.size(); i++) {
            assertEquals(partialYMD.getFieldType(i), copy.getFieldType(i));
            assertEquals(partialYMD.getValue(i), copy.getValue(i));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorFromReadablePartial_null_throwsException() {
        new Partial((ReadablePartial) null);
    }

    // ---------------- size, getChronology, getFieldType(s), getValue(s) ----------------

    @Test
    public void testSize_returnsCorrectCount() {
        assertEquals(3, partialYMD.size());
    }

    @Test
    public void testGetChronology_notNull() {
        assertNotNull(partialYMD.getChronology());
    }

    @Test
    public void testGetFieldType_validIndex() {
        assertEquals(DateTimeFieldType.year(), partialYMD.getFieldType(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldType_invalidIndex_throwsException() {
        partialYMD.getFieldType(10);
    }

    @Test
    public void testGetFieldTypes_returnsClonedArray() {
        DateTimeFieldType[] types = partialYMD.getFieldTypes();
        assertEquals(3, types.length);
        assertEquals(DateTimeFieldType.year(), types[0]);
    }

    @Test
    public void testGetValue_validIndex() {
        assertEquals(2013, partialYMD.getValue(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalidIndex_throwsException() {
        partialYMD.getValue(10);
    }

    @Test
    public void testGetValues_returnsClonedArray() {
        int[] values = partialYMD.getValues();
        assertArrayEquals(new int[]{2013, 6, 15}, values);
    }

    // ---------------- withChronologyRetainFields ----------------

    @Test
    public void testWithChronologyRetainFields_sameChronology_returnsSameInstance() {
        Partial p = partialYMD.withChronologyRetainFields(partialYMD.getChronology());
        assertSame(partialYMD, p);
    }

    @Test
    public void testWithChronologyRetainFields_differentChronology_returnsNewInstance() {
        Partial p = partialYMD.withChronologyRetainFields(GregorianChronology.getInstance());
        assertNotSame(partialYMD, p);
        assertEquals(GregorianChronology.getInstanceUTC(), p.getChronology());
        assertEquals(2013, p.getValue(0));
    }

    @Test
    public void testWithChronologyRetainFields_nullChronology_usesISO() {
        Partial p = partialYMD.withChronologyRetainFields(null);
        assertNotNull(p);
    }

    // ---------------- with(DateTimeFieldType, int) ----------------

    @Test
    public void testWith_existingFieldSameValue_returnsSameInstance() {
        Partial p = partialYMD.with(DateTimeFieldType.year(), 2013);
        assertSame(partialYMD, p);
    }

    @Test
    public void testWith_existingFieldDifferentValue_returnsNewInstance() {
        Partial p = partialYMD.with(DateTimeFieldType.year(), 2020);
        assertEquals(2020, p.getValue(0));
        assertNotSame(partialYMD, p);
    }

    @Test
    public void testWith_newField_addsField() {
        Partial p = partialYMD.with(DateTimeFieldType.hourOfDay(), 10);
        assertEquals(4, p.size());
        assertEquals(10, p.get(DateTimeFieldType.hourOfDay()));
    }

    @Test
    public void testWith_newFieldBeforeAll_insertsAtStart() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Partial result = p.with(DateTimeFieldType.year(), 2013);
        assertEquals(2, result.size());
        assertEquals(DateTimeFieldType.year(), result.getFieldType(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWith_nullFieldType_throwsException() {
        partialYMD.with(null, 5);
    }

    // ---------------- without ----------------

    @Test
    public void testWithout_existingField_removesField() {
        Partial p = partialYMD.without(DateTimeFieldType.monthOfYear());
        assertEquals(2, p.size());
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        assertEquals(DateTimeFieldType.dayOfMonth(), p.getFieldType(1));
    }

    @Test
    public void testWithout_nonExistingField_returnsSameInstance() {
        Partial p = partialYMD.without(DateTimeFieldType.hourOfDay());
        assertSame(partialYMD, p);
    }

    @Test
    public void testWithout_nullFieldType_returnsSameInstance() {
        Partial p = partialYMD.without(null);
        assertSame(partialYMD, p);
    }

    // ---------------- withField ----------------

    @Test
    public void testWithField_sameValue_returnsSameInstance() {
        Partial p = partialYMD.withField(DateTimeFieldType.year(), 2013);
        assertSame(partialYMD, p);
    }

    @Test
    public void testWithField_differentValue_returnsNewInstance() {
        Partial p = partialYMD.withField(DateTimeFieldType.year(), 2015);
        assertEquals(2015, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_unsupportedField_throwsException() {
        partialYMD.withField(DateTimeFieldType.hourOfDay(), 5);
    }

    // ---------------- withFieldAdded ----------------

    @Test
    public void testWithFieldAdded_zeroAmount_returnsSameInstance() {
        Partial p = partialYMD.withFieldAdded(DurationFieldType.years(), 0);
        assertSame(partialYMD, p);
    }

    @Test
    public void testWithFieldAdded_normalAmount_addsValue() {
        Partial p = partialYMD.withFieldAdded(DurationFieldType.years(), 1);
        assertEquals(2014, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_unsupportedField_throwsException() {
        partialYMD.withFieldAdded(DurationFieldType.hours(), 5);
    }

    // ---------------- withFieldAddWrapped ----------------

    @Test
    public void testWithFieldAddWrapped_zeroAmount_returnsSameInstance() {
        Partial p = partialYMD.withFieldAddWrapped(DurationFieldType.months(), 0);
        assertSame(partialYMD, p);
    }

    @Test
    public void testWithFieldAddWrapped_wraps() {
        Partial p = partialYMD.withFieldAddWrapped(DurationFieldType.months(), 12);
        assertEquals(6, p.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAddWrapped_unsupportedField_throwsException() {
        partialYMD.withFieldAddWrapped(DurationFieldType.hours(), 5);
    }

    // ---------------- withPeriodAdded ----------------

    @Test
    public void testWithPeriodAdded_nullPeriod_returnsSameInstance() {
        Partial p = partialYMD.withPeriodAdded(null, 1);
        assertSame(partialYMD, p);
    }

    @Test
    public void testWithPeriodAdded_zeroScalar_returnsSameInstance() {
        Period period = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        Partial p = partialYMD.withPeriodAdded(period, 0);
        assertSame(partialYMD, p);
    }

    @Test
    public void testWithPeriodAdded_normalPeriod_addsValues() {
        Period period = new Period(1, 1, 0, 1, 0, 0, 0, 0);
        Partial p = partialYMD.withPeriodAdded(period, 1);
        assertEquals(2014, p.getValue(0));
        assertEquals(7, p.getValue(1));
        assertEquals(16, p.getValue(2));
    }

    @Test
    public void testWithPeriodAdded_fieldNotPresent_ignored() {
        Period period = new Period(0, 0, 0, 0, 1, 0, 0, 0); // hours not present
        Partial p = partialYMD.withPeriodAdded(period, 1);
        assertEquals(2013, p.getValue(0));
        assertEquals(6, p.getValue(1));
        assertEquals(15, p.getValue(2));
    }

    // ---------------- plus / minus ----------------

    @Test
    public void testPlus_addsPeriod() {
        Period period = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        Partial p = partialYMD.plus(period);
        assertEquals(2014, p.getValue(0));
    }

    @Test
    public void testPlus_nullPeriod_returnsSameInstance() {
        Partial p = partialYMD.plus(null);
        assertSame(partialYMD, p);
    }

    @Test
    public void testMinus_subtractsPeriod() {
        Period period = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        Partial p = partialYMD.minus(period);
        assertEquals(2012, p.getValue(0));
    }

    @Test
    public void testMinus_nullPeriod_returnsSameInstance() {
        Partial p = partialYMD.minus(null);
        assertSame(partialYMD, p);
    }

    // ---------------- property ----------------

    @Test
    public void testProperty_existingField_returnsProperty() {
        Partial.Property prop = partialYMD.property(DateTimeFieldType.year());
        assertNotNull(prop);
        assertEquals(2013, prop.get());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_unsupportedField_throwsException() {
        partialYMD.property(DateTimeFieldType.hourOfDay());
    }

    // ---------------- isMatch(ReadableInstant) ----------------

    @Test
    public void testIsMatch_instantMatches_returnsTrue() {
        DateTime dt = new DateTime(2013, 6, 15, 10, 0, 0, 0);
        assertTrue(partialYMD.isMatch(dt));
    }

    @Test
    public void testIsMatch_instantDoesNotMatch_returnsFalse() {
        DateTime dt = new DateTime(2014, 6, 15, 10, 0, 0, 0);
        assertFalse(partialYMD.isMatch(dt));
    }

    @Test
    public void testIsMatch_nullInstant_usesNow() {
        Partial empty = new Partial();
        assertTrue(empty.isMatch((org.joda.time.ReadableInstant) null));
    }

    // ---------------- isMatch(ReadablePartial) ----------------

    @Test
    public void testIsMatchPartial_matches_returnsTrue() {
        Partial other = new Partial(partialYMD);
        assertTrue(partialYMD.isMatch(other));
    }

    @Test
    public void testIsMatchPartial_doesNotMatch_returnsFalse() {
        Partial other = partialYMD.withField(DateTimeFieldType.year(), 2000);
        assertFalse(partialYMD.isMatch(other));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMatchPartial_null_throwsException() {
        partialYMD.isMatch((ReadablePartial) null);
    }

    // ---------------- getFormatter ----------------

    @Test
    public void testGetFormatter_withFields_returnsFormatter() {
        assertNotNull(partialYMD.getFormatter());
    }

    @Test
    public void testGetFormatter_emptyPartial_returnsNull() {
        Partial p = new Partial();
        assertNull(p.getFormatter());
    }

    @Test
    public void testGetFormatter_calledTwice_usesCache() {
        assertNotNull(partialYMD.getFormatter());
        assertNotNull(partialYMD.getFormatter());
    }

    // ---------------- toString ----------------

    @Test
    public void testToString_withStandardFields_usesISOFormat() {
        String s = partialYMD.toString();
        assertNotNull(s);
        assertTrue(s.contains("2013"));
    }

    @Test
    public void testToString_emptyPartial_usesToStringList() {
        Partial p = new Partial();
        String s = p.toString();
        assertEquals("[]", s);
    }

    @Test
    public void testToString_overlappingFields_usesToStringList() {
        Partial p = new Partial(DateTimeFieldType.dayOfWeek(), 3)
                .with(DateTimeFieldType.dayOfMonth(), 15);
        String s = p.toString();
        assertNotNull(s);
    }

    // ---------------- toStringList ----------------

    @Test
    public void testToStringList_returnsFieldListFormat() {
        String s = partialYMD.toStringList();
        assertTrue(s.startsWith("["));
        assertTrue(s.endsWith("]"));
        assertTrue(s.contains("year=2013"));
    }

    @Test
    public void testToStringList_emptyPartial_returnsEmptyBrackets() {
        Partial p = new Partial();
        assertEquals("[]", p.toStringList());
    }

    // ---------------- toString(String) ----------------

    @Test
    public void testToStringPattern_validPattern_returnsFormatted() {
        String s = partialYMD.toString("yyyy-MM-dd");
        assertEquals("2013-06-15", s);
    }

    @Test
    public void testToStringPattern_nullPattern_usesToString() {
        String s = partialYMD.toString((String) null);
        assertEquals(partialYMD.toString(), s);
    }

    // ---------------- toString(String, Locale) ----------------

    @Test
    public void testToStringPatternLocale_validPattern_returnsFormatted() {
        String s = partialYMD.toString("yyyy-MM-dd", Locale.US);
        assertEquals("2013-06-15", s);
    }

    @Test
    public void testToStringPatternLocale_nullPattern_usesToString() {
        String s = partialYMD.toString(null, Locale.US);
        assertEquals(partialYMD.toString(), s);
    }

    // ---------------- Property class ----------------

    @Test
    public void testPropertyGetField_returnsCorrectField() {
        Partial.Property prop = partialYMD.property(DateTimeFieldType.year());
        assertNotNull(prop.getField());
    }

    @Test
    public void testPropertyGetPartial_returnsCorrectPartial() {
        Partial.Property prop = partialYMD.property(DateTimeFieldType.year());
        assertSame(partialYMD, prop.getPartial());
    }

    @Test
    public void testPropertyGet_returnsValue() {
        Partial.Property prop = partialYMD.property(DateTimeFieldType.monthOfYear());
        assertEquals(6, prop.get());
    }

    @Test
    public void testPropertyAddToCopy_addsValue() {
        Partial.Property prop = partialYMD.property(DateTimeFieldType.year());
        Partial p = prop.addToCopy(1);
        assertEquals(2014, p.getValue(0));
        // original unaffected
        assertEquals(2013, partialYMD.getValue(0));
    }

    @Test
    public void testPropertyAddWrapFieldToCopy_wrapsValue() {
        Partial.Property prop = partialYMD.property(DateTimeFieldType.monthOfYear());
        Partial p = prop.addWrapFieldToCopy(12);
        assertEquals(6, p.getValue(1));
    }

    @Test
    public void testPropertySetCopyInt_setsValue() {
        Partial.Property prop = partialYMD.property(DateTimeFieldType.dayOfMonth());
        Partial p = prop.setCopy(20);
        assertEquals(20, p.getValue(2));
    }

    @Test
    public void testPropertySetCopyText_setsValue() {
        Partial.Property prop = partialYMD.property(DateTimeFieldType.monthOfYear());
        Partial p = prop.setCopy("December");
        assertEquals(12, p.getValue(1));
    }

    @Test
    public void testPropertySetCopyTextLocale_setsValue() {
        Partial.Property prop = partialYMD.property(DateTimeFieldType.monthOfYear());
        Partial p = prop.setCopy("December", Locale.US);
        assertEquals(12, p.getValue(1));
    }

    @Test
    public void testPropertyWithMaximumValue_setsMax() {
        Partial.Property prop = partialYMD.property(DateTimeFieldType.monthOfYear());
        Partial p = prop.withMaximumValue();
        assertEquals(12, p.getValue(1));
    }

    @Test
    public void testPropertyWithMinimumValue_setsMin() {
        Partial.Property prop = partialYMD.property(DateTimeFieldType.monthOfYear());
        Partial p = prop.withMinimumValue();
        assertEquals(1, p.getValue(1));
    }
}
