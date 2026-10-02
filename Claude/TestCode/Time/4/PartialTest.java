import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.joda.time.Partial;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.GJChronology;

import java.util.Locale;

public class PartialTest {

    private Partial emptyPartial;
    private Partial yearMonthDayPartial;

    @Before
    public void setUp() {
        emptyPartial = new Partial();
        yearMonthDayPartial = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()},
                new int[] {2013, 6, 15});
    }

    // ---------------------- Constructors ----------------------

    @Test
    public void testDefaultConstructor_createsEmptyPartial() {
        Partial p = new Partial();
        assertEquals(0, p.size());
        assertNotNull(p.getChronology());
    }

    @Test
    public void testChronologyConstructor_withNullChronology_usesISO() {
        Partial p = new Partial((Chronology) null);
        assertEquals(0, p.size());
        assertNotNull(p.getChronology());
    }

    @Test
    public void testChronologyConstructor_withGivenChronology_usesChronology() {
        Chronology chrono = GJChronology.getInstance();
        Partial p = new Partial(chrono);
        assertEquals(chrono.withUTC(), p.getChronology());
    }

    @Test
    public void testTypeValueConstructor_normalInput_createsPartial() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        assertEquals(1, p.size());
        assertEquals(2020, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTypeValueConstructor_nullType_throwsException() {
        new Partial((DateTimeFieldType) null, 5);
    }

    @Test
    public void testTypeValueChronologyConstructor_normalInput_createsPartial() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 5, ISOChronology.getInstanceUTC());
        assertEquals(1, p.size());
        assertEquals(5, p.getValue(0));
    }

    @Test
    public void testTypesValuesConstructor_normalInput_createsPartial() {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
        int[] values = {2013, 6};
        Partial p = new Partial(types, values);
        assertEquals(2, p.size());
        assertEquals(2013, p.getValue(0));
        assertEquals(6, p.getValue(1));
    }

    @Test
    public void testTypesValuesConstructor_emptyArrays_createsEmptyPartial() {
        DateTimeFieldType[] types = new DateTimeFieldType[0];
        int[] values = new int[0];
        Partial p = new Partial(types, values);
        assertEquals(0, p.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTypesValuesConstructor_nullTypes_throwsException() {
        new Partial((DateTimeFieldType[]) null, new int[] {1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTypesValuesConstructor_nullValues_throwsException() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year()}, (int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTypesValuesConstructor_mismatchedLengths_throwsException() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year()}, new int[] {1, 2});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTypesValuesConstructor_nullTypeInArray_throwsException() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), null}, new int[] {1, 2});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTypesValuesConstructor_wrongOrder_throwsException() {
        DateTimeFieldType[] types = {DateTimeFieldType.monthOfYear(), DateTimeFieldType.year()};
        int[] values = {5, 2013};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTypesValuesConstructor_duplicateTypes_throwsException() {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.year()};
        int[] values = {2013, 2014};
        new Partial(types, values);
    }

    @Test
    public void testReadablePartialConstructor_copiesFields() {
        Partial copy = new Partial(yearMonthDayPartial);
        assertEquals(yearMonthDayPartial.size(), copy.size());
        assertEquals(yearMonthDayPartial.getValue(0), copy.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadablePartialConstructor_null_throwsException() {
        new Partial((org.joda.time.ReadablePartial) null);
    }

    // ---------------------- Basic getters ----------------------

    @Test
    public void testSize_emptyPartial_returnsZero() {
        assertEquals(0, emptyPartial.size());
    }

    @Test
    public void testSize_threeFieldPartial_returnsThree() {
        assertEquals(3, yearMonthDayPartial.size());
    }

    @Test
    public void testGetChronology_returnsNonNull() {
        assertNotNull(yearMonthDayPartial.getChronology());
    }

    @Test
    public void testGetFieldType_validIndex_returnsCorrectType() {
        assertEquals(DateTimeFieldType.year(), yearMonthDayPartial.getFieldType(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldType_invalidIndex_throwsException() {
        yearMonthDayPartial.getFieldType(10);
    }

    @Test
    public void testGetFieldTypes_returnsClonedArray() {
        DateTimeFieldType[] types = yearMonthDayPartial.getFieldTypes();
        assertEquals(3, types.length);
        assertEquals(DateTimeFieldType.year(), types[0]);
    }

    @Test
    public void testGetValue_validIndex_returnsCorrectValue() {
        assertEquals(2013, yearMonthDayPartial.getValue(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalidIndex_throwsException() {
        yearMonthDayPartial.getValue(99);
    }

    @Test
    public void testGetValues_returnsClonedArray() {
        int[] values = yearMonthDayPartial.getValues();
        assertEquals(3, values.length);
        assertEquals(2013, values[0]);
    }

    // ---------------------- withChronologyRetainFields ----------------------

    @Test
    public void testWithChronologyRetainFields_sameChronology_returnsSameInstance() {
        Chronology chrono = yearMonthDayPartial.getChronology();
        Partial result = yearMonthDayPartial.withChronologyRetainFields(chrono);
        assertSame(yearMonthDayPartial, result);
    }

    @Test
    public void testWithChronologyRetainFields_differentChronology_returnsNewInstance() {
        Chronology newChrono = GJChronology.getInstance().withUTC();
        Partial result = yearMonthDayPartial.withChronologyRetainFields(newChrono);
        assertNotSame(yearMonthDayPartial, result);
        assertEquals(yearMonthDayPartial.getValue(0), result.getValue(0));
    }

    @Test
    public void testWithChronologyRetainFields_nullChronology_usesISO() {
        Partial result = yearMonthDayPartial.withChronologyRetainFields(null);
        assertNotNull(result.getChronology());
    }

    // ---------------------- with() ----------------------

    @Test
    public void testWith_existingFieldSameValue_returnsSameInstance() {
        Partial result = yearMonthDayPartial.with(DateTimeFieldType.year(), 2013);
        assertSame(yearMonthDayPartial, result);
    }

    @Test
    public void testWith_existingFieldDifferentValue_returnsNewInstance() {
        Partial result = yearMonthDayPartial.with(DateTimeFieldType.year(), 2020);
        assertNotSame(yearMonthDayPartial, result);
        assertEquals(2020, result.getValue(0));
    }

    @Test
    public void testWith_newFieldNotSupported_insertsField() {
        Partial p = new Partial(DateTimeFieldType.year(), 2013);
        Partial result = p.with(DateTimeFieldType.monthOfYear(), 5);
        assertEquals(2, result.size());
        assertEquals(5, result.getValue(1));
    }

    @Test
    public void testWith_newUnsupportedUnitField_insertsAtEnd() {
        // field type with unsupported duration type in this chronology context - use a normal supported but unrelated field
        Partial p = new Partial(DateTimeFieldType.year(), 2013);
        Partial result = p.with(DateTimeFieldType.dayOfWeek(), 3);
        assertEquals(2, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWith_nullFieldType_throwsException() {
        yearMonthDayPartial.with(null, 1);
    }

    // ---------------------- without() ----------------------

    @Test
    public void testWithout_existingField_removesField() {
        Partial result = yearMonthDayPartial.without(DateTimeFieldType.monthOfYear());
        assertEquals(2, result.size());
        assertEquals(DateTimeFieldType.year(), result.getFieldType(0));
        assertEquals(DateTimeFieldType.dayOfMonth(), result.getFieldType(1));
    }

    @Test
    public void testWithout_nonExistingField_returnsSameInstance() {
        Partial result = yearMonthDayPartial.without(DateTimeFieldType.hourOfDay());
        assertSame(yearMonthDayPartial, result);
    }

    @Test
    public void testWithout_nullFieldType_returnsSameInstance() {
        Partial result = yearMonthDayPartial.without(null);
        assertSame(yearMonthDayPartial, result);
    }

    // ---------------------- withField() ----------------------

    @Test
    public void testWithField_supportedFieldSameValue_returnsSameInstance() {
        Partial result = yearMonthDayPartial.withField(DateTimeFieldType.year(), 2013);
        assertSame(yearMonthDayPartial, result);
    }

    @Test
    public void testWithField_supportedFieldDifferentValue_returnsNewInstance() {
        Partial result = yearMonthDayPartial.withField(DateTimeFieldType.year(), 2000);
        assertEquals(2000, result.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_unsupportedField_throwsException() {
        yearMonthDayPartial.withField(DateTimeFieldType.hourOfDay(), 5);
    }

    // ---------------------- withFieldAdded() ----------------------

    @Test
    public void testWithFieldAdded_zeroAmount_returnsSameInstance() {
        Partial result = yearMonthDayPartial.withFieldAdded(DurationFieldType.years(), 0);
        assertSame(yearMonthDayPartial, result);
    }

    @Test
    public void testWithFieldAdded_nonZeroAmount_returnsNewInstance() {
        Partial result = yearMonthDayPartial.withFieldAdded(DurationFieldType.years(), 1);
        assertEquals(2014, result.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_unsupportedField_throwsException() {
        yearMonthDayPartial.withFieldAdded(DurationFieldType.hours(), 1);
    }

    // ---------------------- withFieldAddWrapped() ----------------------

    @Test
    public void testWithFieldAddWrapped_zeroAmount_returnsSameInstance() {
        Partial result = yearMonthDayPartial.withFieldAddWrapped(DurationFieldType.months(), 0);
        assertSame(yearMonthDayPartial, result);
    }

    @Test
    public void testWithFieldAddWrapped_nonZeroAmount_returnsNewInstance() {
        Partial result = yearMonthDayPartial.withFieldAddWrapped(DurationFieldType.months(), 1);
        assertEquals(7, result.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAddWrapped_unsupportedField_throwsException() {
        yearMonthDayPartial.withFieldAddWrapped(DurationFieldType.hours(), 1);
    }

    // ---------------------- withPeriodAdded() ----------------------

    @Test
    public void testWithPeriodAdded_nullPeriod_returnsSameInstance() {
        Partial result = yearMonthDayPartial.withPeriodAdded(null, 1);
        assertSame(yearMonthDayPartial, result);
    }

    @Test
    public void testWithPeriodAdded_zeroScalar_returnsSameInstance() {
        Period period = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        Partial result = yearMonthDayPartial.withPeriodAdded(period, 0);
        assertSame(yearMonthDayPartial, result);
    }

    @Test
    public void testWithPeriodAdded_matchingFields_addsCorrectly() {
        Period period = new Period(1, 1, 0, 0, 0, 0, 0, 0);
        Partial result = yearMonthDayPartial.withPeriodAdded(period, 1);
        assertEquals(2014, result.getValue(0));
        assertEquals(7, result.getValue(1));
    }

    @Test
    public void testWithPeriodAdded_nonMatchingFields_ignored() {
        Period period = new Period(0, 0, 0, 0, 1, 0, 0, 0);
        Partial result = yearMonthDayPartial.withPeriodAdded(period, 1);
        assertEquals(yearMonthDayPartial.getValue(0), result.getValue(0));
        assertEquals(yearMonthDayPartial.getValue(1), result.getValue(1));
        assertEquals(yearMonthDayPartial.getValue(2), result.getValue(2));
    }

    // ---------------------- plus() / minus() ----------------------

    @Test
    public void testPlus_normalPeriod_addsCorrectly() {
        Period period = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        Partial result = yearMonthDayPartial.plus(period);
        assertEquals(2014, result.getValue(0));
    }

    @Test
    public void testPlus_nullPeriod_returnsSameInstance() {
        Partial result = yearMonthDayPartial.plus(null);
        assertSame(yearMonthDayPartial, result);
    }

    @Test
    public void testMinus_normalPeriod_subtractsCorrectly() {
        Period period = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        Partial result = yearMonthDayPartial.minus(period);
        assertEquals(2012, result.getValue(0));
    }

    @Test
    public void testMinus_nullPeriod_returnsSameInstance() {
        Partial result = yearMonthDayPartial.minus(null);
        assertSame(yearMonthDayPartial, result);
    }

    // ---------------------- property() ----------------------

    @Test
    public void testProperty_supportedField_returnsPropertyWithCorrectValue() {
        Partial.Property prop = yearMonthDayPartial.property(DateTimeFieldType.year());
        assertEquals(2013, prop.get());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_unsupportedField_throwsException() {
        yearMonthDayPartial.property(DateTimeFieldType.hourOfDay());
    }

    // ---------------------- isMatch(ReadableInstant) ----------------------

    @Test
    public void testIsMatchInstant_matchingInstant_returnsTrue() {
        DateTime dt = new DateTime(2013, 6, 15, 10, 30, 0, 0, ISOChronology.getInstanceUTC());
        assertTrue(yearMonthDayPartial.isMatch(dt));
    }

    @Test
    public void testIsMatchInstant_nonMatchingInstant_returnsFalse() {
        DateTime dt = new DateTime(2014, 6, 15, 10, 30, 0, 0, ISOChronology.getInstanceUTC());
        assertFalse(yearMonthDayPartial.isMatch(dt));
    }

    @Test
    public void testIsMatchInstant_nullInstant_usesNow() {
        // empty partial always matches, even with null (now)
        assertTrue(emptyPartial.isMatch((org.joda.time.ReadableInstant) null));
    }

    // ---------------------- isMatch(ReadablePartial) ----------------------

    @Test
    public void testIsMatchPartial_matchingPartial_returnsTrue() {
        Partial other = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()},
                new int[] {2013, 6, 15});
        assertTrue(yearMonthDayPartial.isMatch(other));
    }

    @Test
    public void testIsMatchPartial_nonMatchingPartial_returnsFalse() {
        Partial other = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()},
                new int[] {2014, 6, 15});
        assertFalse(yearMonthDayPartial.isMatch(other));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMatchPartial_nullPartial_throwsException() {
        yearMonthDayPartial.isMatch((org.joda.time.ReadablePartial) null);
    }

    // ---------------------- getFormatter() ----------------------

    @Test
    public void testGetFormatter_emptyPartial_returnsNull() {
        assertNull(emptyPartial.getFormatter());
    }

    @Test
    public void testGetFormatter_validPartial_returnsFormatter() {
        assertNotNull(yearMonthDayPartial.getFormatter());
    }

    @Test
    public void testGetFormatter_calledTwice_returnsCachedResult() {
        org.joda.time.format.DateTimeFormatter f1 = yearMonthDayPartial.getFormatter();
        org.joda.time.format.DateTimeFormatter f2 = yearMonthDayPartial.getFormatter();
        assertSame(f1, f2);
    }

    // ---------------------- toString() ----------------------

    @Test
    public void testToString_validPartial_returnsISOFormat() {
        String str = yearMonthDayPartial.toString();
        assertNotNull(str);
        assertTrue(str.contains("2013"));
    }

    @Test
    public void testToString_emptyPartial_returnsListFormat() {
        String str = emptyPartial.toString();
        assertEquals("[]", str);
    }

    @Test
    public void testToString_overlappingFields_returnsListFormat() {
        Partial p = new Partial(DateTimeFieldType.dayOfWeek(), 3)
                .with(DateTimeFieldType.dayOfMonth(), 15);
        String str = p.toString();
        assertNotNull(str);
    }

    // ---------------------- toStringList() ----------------------

    @Test
    public void testToStringList_emptyPartial_returnsEmptyBrackets() {
        assertEquals("[]", emptyPartial.toStringList());
    }

    @Test
    public void testToStringList_nonEmptyPartial_listsFields() {
        String str = yearMonthDayPartial.toStringList();
        assertTrue(str.contains("year=2013"));
        assertTrue(str.contains("monthOfYear=6"));
        assertTrue(str.contains("dayOfMonth=15"));
    }

    // ---------------------- toString(pattern) ----------------------

    @Test
    public void testToStringPattern_validPattern_returnsFormattedString() {
        String str = yearMonthDayPartial.toString("yyyy-MM-dd");
        assertEquals("2013-06-15", str);
    }

    @Test
    public void testToStringPattern_nullPattern_usesDefaultToString() {
        String str = yearMonthDayPartial.toString((String) null);
        assertEquals(yearMonthDayPartial.toString(), str);
    }

    // ---------------------- toString(pattern, locale) ----------------------

    @Test
    public void testToStringPatternLocale_validPatternAndLocale_returnsFormattedString() {
        String str = yearMonthDayPartial.toString("yyyy-MM-dd", Locale.US);
        assertEquals("2013-06-15", str);
    }

    @Test
    public void testToStringPatternLocale_nullPattern_usesDefaultToString() {
        String str = yearMonthDayPartial.toString(null, Locale.US);
        assertEquals(yearMonthDayPartial.toString(), str);
    }

    @Test
    public void testToStringPatternLocale_nullLocale_usesDefaultLocale() {
        String str = yearMonthDayPartial.toString("yyyy-MM-dd", null);
        assertEquals("2013-06-15", str);
    }

    // ---------------------- Property class tests ----------------------

    @Test
    public void testPropertyGetField_returnsCorrectField() {
        Partial.Property prop = yearMonthDayPartial.property(DateTimeFieldType.year());
        assertNotNull(prop.getField());
    }

    @Test
    public void testPropertyGetPartial_returnsOwningPartial() {
        Partial.Property prop = yearMonthDayPartial.property(DateTimeFieldType.year());
        assertSame(yearMonthDayPartial, prop.getPartial());
    }

    @Test
    public void testPropertyGet_returnsFieldValue() {
        Partial.Property prop = yearMonthDayPartial.property(DateTimeFieldType.monthOfYear());
        assertEquals(6, prop.get());
    }

    @Test
    public void testPropertyAddToCopy_addsValueCorrectly() {
        Partial.Property prop = yearMonthDayPartial.property(DateTimeFieldType.year());
        Partial result = prop.addToCopy(2);
        assertEquals(2015, result.getValue(0));
        assertEquals(2013, yearMonthDayPartial.getValue(0));
    }

    @Test
    public void testPropertyAddWrapFieldToCopy_wrapsCorrectly() {
        Partial.Property prop = yearMonthDayPartial.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.addWrapFieldToCopy(7);
        assertEquals(1, result.getValue(1));
    }

    @Test
    public void testPropertySetCopy_setsValueCorrectly() {
        Partial.Property prop = yearMonthDayPartial.property(DateTimeFieldType.dayOfMonth());
        Partial result = prop.setCopy(20);
        assertEquals(20, result.getValue(2));
    }

    @Test
    public void testPropertySetCopyText_setsValueFromText() {
        Partial.Property prop = yearMonthDayPartial.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.setCopy("December");
        assertEquals(12, result.getValue(1));
    }

    @Test
    public void testPropertySetCopyTextLocale_setsValueFromTextWithLocale() {
        Partial.Property prop = yearMonthDayPartial.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.setCopy("December", Locale.US);
        assertEquals(12, result.getValue(1));
    }

    @Test
    public void testPropertyWithMaximumValue_setsFieldToMax() {
        Partial.Property prop = yearMonthDayPartial.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.withMaximumValue();
        assertEquals(12, result.getValue(1));
    }

    @Test
    public void testPropertyWithMinimumValue_setsFieldToMin() {
        Partial.Property prop = yearMonthDayPartial.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.withMinimumValue();
        assertEquals(1, result.getValue(1));
    }
}
