import org.joda.time.Partial;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.Chronology;
import org.joda.time.ISOChronology;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadableInstant;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.Locale;

public class PartialTest {

    private Partial pEmpty;
    private Partial pYear;
    private Partial pYearMonth;
    private Partial pFull;

    @Before
    public void setUp() {
        pEmpty = new Partial();
        pYear = new Partial(DateTimeFieldType.year(), 2010);
        pYearMonth = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[] {2010, 5});
        pFull = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()},
                new int[] {2010, 5, 15});
    }

    // -----------------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------------

    @Test
    public void testDefaultConstructor_normal_emptyPartialWithUTCChronology() {
        assertEquals(0, pEmpty.size());
        assertEquals(ISOChronology.getInstanceUTC(), pEmpty.getChronology());
    }

    @Test
    public void testConstructorWithChronology_normal_usesUTC() {
        Partial p = new Partial(ISOChronology.getInstance());
        assertEquals(ISOChronology.getInstanceUTC(), p.getChronology());
        assertEquals(0, p.size());
    }

    @Test
    public void testConstructorTypeValue_normal_singleField() {
        assertEquals(1, pYear.size());
        assertEquals(2010, pYear.getValue(0));
        assertEquals(DateTimeFieldType.year(), pYear.getFieldType(0));
    }

    @Test
    public void testConstructorTypeValueChronology_normal_withChronology() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000, ISOChronology.getInstance());
        assertEquals(1, p.size());
        assertEquals(2000, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTypeValue_nullType_throwsException() {
        new Partial((DateTimeFieldType) null, 5);
    }

    @Test
    public void testConstructorTypesValues_normal_multipleFields() {
        assertEquals(2, pYearMonth.size());
        assertEquals(2010, pYearMonth.getValue(0));
        assertEquals(5, pYearMonth.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTypesValuesChronology_nullTypes_throwsException() {
        new Partial((DateTimeFieldType[]) null, new int[] {1}, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTypesValuesChronology_nullValues_throwsException() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year()}, (int[]) null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTypesValuesChronology_lengthMismatch_throwsException() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[] {1}, null);
    }

    @Test
    public void testConstructorTypesValuesChronology_emptyArrays_sizeZero() {
        Partial p = new Partial(new DateTimeFieldType[0], new int[0], null);
        assertEquals(0, p.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTypesValuesChronology_nullElementInTypes_throwsException() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), null},
                new int[] {2000, 1}, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTypesValuesChronology_wrongOrder_throwsException() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.monthOfYear(), DateTimeFieldType.year()},
                new int[] {5, 2010}, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTypesValuesChronology_duplicate_throwsException() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.year()},
                new int[] {2010, 2011}, null);
    }

    @Test
    public void testConstructorReadablePartial_normal_copiesFields() {
        Partial copy = new Partial(pYearMonth);
        assertEquals(pYearMonth.size(), copy.size());
        assertEquals(pYearMonth.getValue(0), copy.getValue(0));
        assertEquals(pYearMonth.getValue(1), copy.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorReadablePartial_null_throwsException() {
        new Partial((ReadablePartial) null);
    }

    // -----------------------------------------------------------------------
    // Basic accessors
    // -----------------------------------------------------------------------

    @Test
    public void testSize_normal_returnsFieldCount() {
        assertEquals(0, pEmpty.size());
        assertEquals(1, pYear.size());
        assertEquals(2, pYearMonth.size());
        assertEquals(3, pFull.size());
    }

    @Test
    public void testGetChronology_normal_returnsUTCChronology() {
        assertEquals(ISOChronology.getInstanceUTC(), pFull.getChronology());
    }

    @Test
    public void testGetFieldType_normal_returnsCorrectType() {
        assertEquals(DateTimeFieldType.year(), pYearMonth.getFieldType(0));
        assertEquals(DateTimeFieldType.monthOfYear(), pYearMonth.getFieldType(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldType_invalidIndex_throwsException() {
        pYearMonth.getFieldType(10);
    }

    @Test
    public void testGetFieldTypes_normal_returnsClonedArray() {
        DateTimeFieldType[] types = pYearMonth.getFieldTypes();
        assertEquals(2, types.length);
        assertEquals(DateTimeFieldType.year(), types[0]);
        types[0] = null;
        assertEquals(DateTimeFieldType.year(), pYearMonth.getFieldType(0));
    }

    @Test
    public void testGetValue_normal_returnsValue() {
        assertEquals(5, pYearMonth.getValue(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalidIndex_throwsException() {
        pYearMonth.getValue(10);
    }

    @Test
    public void testGetValues_normal_returnsClonedArray() {
        int[] values = pYearMonth.getValues();
        assertEquals(2, values.length);
        values[0] = 9999;
        assertEquals(2010, pYearMonth.getValue(0));
    }

    // -----------------------------------------------------------------------
    // withChronologyRetainFields
    // -----------------------------------------------------------------------

    @Test
    public void testWithChronologyRetainFields_sameChronology_returnsSameInstance() {
        Partial result = pYear.withChronologyRetainFields(null);
        assertSame(pYear, result);
    }

    @Test
    public void testWithChronologyRetainFields_differentChronology_returnsNewInstance() {
        Chronology other = org.joda.time.chrono.GregorianChronology.getInstance();
        Partial result = pYear.withChronologyRetainFields(other);
        assertNotSame(pYear, result);
        assertEquals(2010, result.getValue(0));
    }

    // -----------------------------------------------------------------------
    // with()
    // -----------------------------------------------------------------------

    @Test
    public void testWith_existingFieldSameValue_returnsSameInstance() {
        Partial result = pYear.with(DateTimeFieldType.year(), 2010);
        assertSame(pYear, result);
    }

    @Test
    public void testWith_existingFieldDifferentValue_returnsUpdatedInstance() {
        Partial result = pYear.with(DateTimeFieldType.year(), 2020);
        assertNotSame(pYear, result);
        assertEquals(2020, result.getValue(0));
        assertEquals(2010, pYear.getValue(0));
    }

    @Test
    public void testWith_newField_insertsFieldInOrder() {
        Partial result = pYear.with(DateTimeFieldType.monthOfYear(), 7);
        assertEquals(2, result.size());
        assertEquals(DateTimeFieldType.year(), result.getFieldType(0));
        assertEquals(DateTimeFieldType.monthOfYear(), result.getFieldType(1));
        assertEquals(7, result.getValue(1));
    }

    @Test
    public void testWith_newFieldAtEnd_insertsCorrectly() {
        Partial result = pYearMonth.with(DateTimeFieldType.dayOfMonth(), 20);
        assertEquals(3, result.size());
        assertEquals(DateTimeFieldType.dayOfMonth(), result.getFieldType(2));
        assertEquals(20, result.getValue(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWith_nullFieldType_throwsException() {
        pYear.with(null, 1);
    }

    // -----------------------------------------------------------------------
    // without()
    // -----------------------------------------------------------------------

    @Test
    public void testWithout_existingField_removesField() {
        Partial result = pYearMonth.without(DateTimeFieldType.monthOfYear());
        assertEquals(1, result.size());
        assertEquals(DateTimeFieldType.year(), result.getFieldType(0));
    }

    @Test
    public void testWithout_nonExistingField_returnsSameInstance() {
        Partial result = pYear.without(DateTimeFieldType.monthOfYear());
        assertSame(pYear, result);
    }

    @Test
    public void testWithout_nullField_returnsSameInstance() {
        Partial result = pYear.without(null);
        assertSame(pYear, result);
    }

    // -----------------------------------------------------------------------
    // withField()
    // -----------------------------------------------------------------------

    @Test
    public void testWithField_sameValue_returnsSameInstance() {
        Partial result = pYearMonth.withField(DateTimeFieldType.monthOfYear(), 5);
        assertSame(pYearMonth, result);
    }

    @Test
    public void testWithField_differentValue_returnsUpdatedInstance() {
        Partial result = pYearMonth.withField(DateTimeFieldType.monthOfYear(), 8);
        assertNotSame(pYearMonth, result);
        assertEquals(8, result.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_unsupportedField_throwsException() {
        pYear.withField(DateTimeFieldType.monthOfYear(), 5);
    }

    // -----------------------------------------------------------------------
    // withFieldAdded()
    // -----------------------------------------------------------------------

    @Test
    public void testWithFieldAdded_zeroAmount_returnsSameInstance() {
        Partial result = pYearMonth.withFieldAdded(DurationFieldType.months(), 0);
        assertSame(pYearMonth, result);
    }

    @Test
    public void testWithFieldAdded_normal_addsValue() {
        Partial result = pYearMonth.withFieldAdded(DurationFieldType.months(), 1);
        assertEquals(6, result.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_unsupportedField_throwsException() {
        pYear.withFieldAdded(DurationFieldType.months(), 1);
    }

    // -----------------------------------------------------------------------
    // withFieldAddWrapped()
    // -----------------------------------------------------------------------

    @Test
    public void testWithFieldAddWrapped_zeroAmount_returnsSameInstance() {
        Partial result = pYearMonth.withFieldAddWrapped(DurationFieldType.months(), 0);
        assertSame(pYearMonth, result);
    }

    @Test
    public void testWithFieldAddWrapped_normal_wrapsWithinField() {
        Partial p = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[] {2010, 12});
        Partial result = p.withFieldAddWrapped(DurationFieldType.months(), 2);
        assertEquals(2010, result.getValue(0));
        assertEquals(2, result.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAddWrapped_unsupportedField_throwsException() {
        pYear.withFieldAddWrapped(DurationFieldType.months(), 1);
    }

    // -----------------------------------------------------------------------
    // withPeriodAdded() / plus() / minus()
    // -----------------------------------------------------------------------

    @Test
    public void testWithPeriodAdded_nullPeriod_returnsSameInstance() {
        Partial result = pYearMonth.withPeriodAdded(null, 1);
        assertSame(pYearMonth, result);
    }

    @Test
    public void testWithPeriodAdded_zeroScalar_returnsSameInstance() {
        Period period = Period.years(1);
        Partial result = pYearMonth.withPeriodAdded(period, 0);
        assertSame(pYearMonth, result);
    }

    @Test
    public void testWithPeriodAdded_normal_addsMatchingFields() {
        Period period = new Period(1, 2, 0, 0, 0, 0, 0, 0);
        Partial result = pYearMonth.withPeriodAdded(period, 1);
        assertEquals(2011, result.getValue(0));
        assertEquals(7, result.getValue(1));
    }

    @Test
    public void testPlus_normal_addsPeriod() {
        Period period = Period.years(1);
        Partial result = pYearMonth.plus(period);
        assertEquals(2011, result.getValue(0));
    }

    @Test
    public void testMinus_normal_subtractsPeriod() {
        Period period = Period.years(1);
        Partial result = pYearMonth.minus(period);
        assertEquals(2009, result.getValue(0));
    }

    @Test
    public void testPlus_nullPeriod_returnsSameInstance() {
        Partial result = pYearMonth.plus(null);
        assertSame(pYearMonth, result);
    }

    // -----------------------------------------------------------------------
    // property()
    // -----------------------------------------------------------------------

    @Test
    public void testProperty_normal_returnsProperty() {
        Partial.Property prop = pYearMonth.property(DateTimeFieldType.monthOfYear());
        assertNotNull(prop);
        assertEquals(5, prop.get());
        assertSame(pYearMonth, prop.getPartial());
        assertNotNull(prop.getField());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_unsupportedField_throwsException() {
        pYear.property(DateTimeFieldType.monthOfYear());
    }

    // -----------------------------------------------------------------------
    // isMatch(ReadableInstant)
    // -----------------------------------------------------------------------

    @Test
    public void testIsMatchInstant_matchingInstant_returnsTrue() {
        DateTime dt = new DateTime(2010, 1, 1, 0, 0, 0, 0);
        assertTrue(pYear.isMatch(dt));
    }

    @Test
    public void testIsMatchInstant_nonMatchingInstant_returnsFalse() {
        DateTime dt = new DateTime(2020, 1, 1, 0, 0, 0, 0);
        assertFalse(pYear.isMatch(dt));
    }

    @Test
    public void testIsMatchInstant_emptyPartialAlwaysMatches() {
        assertTrue(pEmpty.isMatch((ReadableInstant) null));
    }

    // -----------------------------------------------------------------------
    // isMatch(ReadablePartial)
    // -----------------------------------------------------------------------

    @Test
    public void testIsMatchPartial_matchingPartial_returnsTrue() {
        Partial other = new Partial(DateTimeFieldType.year(), 2010);
        assertTrue(pYear.isMatch(other));
    }

    @Test
    public void testIsMatchPartial_nonMatchingPartial_returnsFalse() {
        Partial other = new Partial(DateTimeFieldType.year(), 2020);
        assertFalse(pYear.isMatch(other));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMatchPartial_null_throwsException() {
        pYear.isMatch((ReadablePartial) null);
    }

    // -----------------------------------------------------------------------
    // getFormatter()
    // -----------------------------------------------------------------------

    @Test
    public void testGetFormatter_emptyPartial_returnsNull() {
        assertNull(pEmpty.getFormatter());
    }

    @Test
    public void testGetFormatter_normal_returnsFormatter() {
        assertNotNull(pFull.getFormatter());
    }

    // -----------------------------------------------------------------------
    // toString()
    // -----------------------------------------------------------------------

    @Test
    public void testToString_normal_returnsISOFormat() {
        String result = pFull.toString();
        assertEquals("2010-05-15", result);
    }

    @Test
    public void testToString_emptyPartial_returnsBracketFormat() {
        String result = pEmpty.toString();
        assertEquals("[]", result);
    }

    @Test
    public void testToStringList_normal_listsAllFields() {
        String result = pFull.toStringList();
        assertEquals("[year=2010, monthOfYear=5, dayOfMonth=15]", result);
    }

    @Test
    public void testToStringPattern_normal_formatsWithPattern() {
        String result = pFull.toString("yyyy MM dd");
        assertEquals("2010 05 15", result);
    }

    @Test
    public void testToStringPattern_nullPattern_returnsDefaultToString() {
        String result = pFull.toString((String) null);
        assertEquals(pFull.toString(), result);
    }

    @Test
    public void testToStringPatternLocale_normal_formatsWithLocale() {
        String result = pFull.toString("yyyy MM dd", Locale.US);
        assertEquals("2010 05 15", result);
    }

    @Test
    public void testToStringPatternLocale_nullPattern_returnsDefaultToString() {
        String result = pFull.toString(null, Locale.US);
        assertEquals(pFull.toString(), result);
    }

    // -----------------------------------------------------------------------
    // Property inner class
    // -----------------------------------------------------------------------

    @Test
    public void testPropertyAddToCopy_normal_addsValue() {
        Partial.Property prop = pYearMonth.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.addToCopy(1);
        assertEquals(6, result.getValue(1));
        assertEquals(5, pYearMonth.getValue(1));
    }

    @Test
    public void testPropertyAddWrapFieldToCopy_normal_wrapsValue() {
        Partial p = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[] {2010, 12});
        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.addWrapFieldToCopy(2);
        assertEquals(2010, result.getValue(0));
        assertEquals(2, result.getValue(1));
    }

    @Test
    public void testPropertySetCopyInt_normal_setsValue() {
        Partial.Property prop = pYearMonth.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.setCopy(7);
        assertEquals(7, result.getValue(1));
    }

    @Test
    public void testPropertySetCopyString_normal_parsesValue() {
        Partial.Property prop = pYearMonth.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.setCopy("8");
        assertEquals(8, result.getValue(1));
    }

    @Test
    public void testPropertySetCopyStringLocale_normal_parsesValue() {
        Partial.Property prop = pYearMonth.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.setCopy("9", Locale.US);
        assertEquals(9, result.getValue(1));
    }

    @Test
    public void testPropertyWithMaximumValue_normal_setsToMaximum() {
        Partial.Property prop = pYearMonth.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.withMaximumValue();
        assertEquals(12, result.getValue(1));
    }

    @Test
    public void testPropertyWithMinimumValue_normal_setsToMinimum() {
        Partial.Property prop = pYearMonth.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.withMinimumValue();
        assertEquals(1, result.getValue(1));
    }

    @Test
    public void testPropertyGetReadablePartial_normal_returnsPartial() {
        Partial.Property prop = pYearMonth.property(DateTimeFieldType.monthOfYear());
        assertSame(pYearMonth, prop.getPartial());
    }
}
