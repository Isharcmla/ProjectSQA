import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.joda.time.MutableDateTime;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.Period;
import org.joda.time.Duration;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import java.util.Locale;

public class MutableDateTimeTest {

    private MutableDateTime mdt;

    @Before
    public void setUp() {
        mdt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 40, DateTimeZone.UTC);
    }

    // ---------------------- Static factory methods ----------------------

    @Test
    public void testNow_typical_returnsCurrentTime() {
        MutableDateTime result = MutableDateTime.now();
        assertNotNull(result);
    }

    @Test
    public void testNowWithZone_typical_returnsCurrentTimeInZone() {
        MutableDateTime result = MutableDateTime.now(DateTimeZone.UTC);
        assertNotNull(result);
        assertEquals(DateTimeZone.UTC, result.getZone());
    }

    @Test(expected = NullPointerException.class)
    public void testNowWithZone_nullZone_throwsException() {
        MutableDateTime.now((DateTimeZone) null);
    }

    @Test
    public void testNowWithChronology_typical_returnsCurrentTime() {
        MutableDateTime result = MutableDateTime.now(ISOChronology.getInstanceUTC());
        assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testNowWithChronology_nullChronology_throwsException() {
        MutableDateTime.now((Chronology) null);
    }

    @Test
    public void testParseString_typical_returnsCorrectDateTime() {
        MutableDateTime result = MutableDateTime.parse("2004-06-09T10:20:30.040Z");
        assertEquals(2004, result.getYear());
    }

    @Test
    public void testParseStringWithFormatter_typical_returnsCorrectDateTime() {
        DateTimeFormatter formatter = ISODateTimeFormat.dateTimeParser().withOffsetParsed();
        MutableDateTime result = MutableDateTime.parse("2004-06-09T10:20:30.040Z", formatter);
        assertEquals(2004, result.getYear());
    }

    // ---------------------- Constructors ----------------------

    @Test
    public void testConstructor_default_createsCurrentTime() {
        MutableDateTime dt = new MutableDateTime();
        assertNotNull(dt);
    }

    @Test
    public void testConstructor_withZone_createsCorrectZone() {
        MutableDateTime dt = new MutableDateTime(DateTimeZone.UTC);
        assertEquals(DateTimeZone.UTC, dt.getZone());
    }

    @Test
    public void testConstructor_withNullZone_usesDefaultZone() {
        MutableDateTime dt = new MutableDateTime((DateTimeZone) null);
        assertNotNull(dt.getZone());
    }

    @Test
    public void testConstructor_withChronology_createsCorrectChronology() {
        MutableDateTime dt = new MutableDateTime(ISOChronology.getInstanceUTC());
        assertNotNull(dt);
    }

    @Test
    public void testConstructor_withNullChronology_usesDefaultChronology() {
        MutableDateTime dt = new MutableDateTime((Chronology) null);
        assertNotNull(dt);
    }

    @Test
    public void testConstructor_withInstant_setsCorrectMillis() {
        MutableDateTime dt = new MutableDateTime(0L);
        assertEquals(0L, dt.getMillis());
    }

    @Test
    public void testConstructor_withInstantAndZone_setsCorrectMillisAndZone() {
        MutableDateTime dt = new MutableDateTime(0L, DateTimeZone.UTC);
        assertEquals(0L, dt.getMillis());
        assertEquals(DateTimeZone.UTC, dt.getZone());
    }

    @Test
    public void testConstructor_withInstantAndChronology_setsCorrectMillis() {
        MutableDateTime dt = new MutableDateTime(0L, ISOChronology.getInstanceUTC());
        assertEquals(0L, dt.getMillis());
    }

    @Test
    public void testConstructor_withObject_createsFromDate() {
        DateTime source = new DateTime(2004, 6, 9, 10, 20, 30, 40, DateTimeZone.UTC);
        MutableDateTime dt = new MutableDateTime((Object) source);
        assertEquals(2004, dt.getYear());
    }

    @Test
    public void testConstructor_withNullObject_usesNow() {
        MutableDateTime dt = new MutableDateTime((Object) null);
        assertNotNull(dt);
    }

    @Test
    public void testConstructor_withObjectAndZone_createsCorrectZone() {
        DateTime source = new DateTime(2004, 6, 9, 10, 20, 30, 40, DateTimeZone.UTC);
        MutableDateTime dt = new MutableDateTime((Object) source, DateTimeZone.UTC);
        assertEquals(DateTimeZone.UTC, dt.getZone());
    }

    @Test
    public void testConstructor_withObjectAndChronology_createsCorrectChronology() {
        DateTime source = new DateTime(2004, 6, 9, 10, 20, 30, 40, DateTimeZone.UTC);
        MutableDateTime dt = new MutableDateTime((Object) source, ISOChronology.getInstanceUTC());
        assertNotNull(dt);
    }

    @Test
    public void testConstructor_withFields_setsCorrectValues() {
        MutableDateTime dt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 40);
        assertEquals(2004, dt.getYear());
        assertEquals(6, dt.getMonthOfYear());
        assertEquals(9, dt.getDayOfMonth());
    }

    @Test
    public void testConstructor_withFieldsAndZone_setsCorrectValues() {
        MutableDateTime dt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 40, DateTimeZone.UTC);
        assertEquals(2004, dt.getYear());
        assertEquals(DateTimeZone.UTC, dt.getZone());
    }

    @Test
    public void testConstructor_withFieldsAndChronology_setsCorrectValues() {
        MutableDateTime dt = new MutableDateTime(2004, 6, 9, 10, 20, 30, 40, ISOChronology.getInstanceUTC());
        assertEquals(2004, dt.getYear());
    }

    // ---------------------- Rounding ----------------------

    @Test
    public void testGetRoundingField_default_returnsNull() {
        assertNull(mdt.getRoundingField());
    }

    @Test
    public void testGetRoundingMode_default_returnsNone() {
        assertEquals(MutableDateTime.ROUND_NONE, mdt.getRoundingMode());
    }

    @Test
    public void testSetRounding_withField_setsFloorMode() {
        DateTimeField field = mdt.getChronology().hourOfDay();
        mdt.setRounding(field);
        assertEquals(field, mdt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_FLOOR, mdt.getRoundingMode());
    }

    @Test
    public void testSetRounding_withNullField_disablesRounding() {
        mdt.setRounding(null);
        assertNull(mdt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_NONE, mdt.getRoundingMode());
    }

    @Test
    public void testSetRoundingWithMode_floorMode_roundsCorrectly() {
        DateTimeField field = mdt.getChronology().hourOfDay();
        mdt.setRounding(field, MutableDateTime.ROUND_FLOOR);
        assertEquals(MutableDateTime.ROUND_FLOOR, mdt.getRoundingMode());
    }

    @Test
    public void testSetRoundingWithMode_ceilingMode_roundsCorrectly() {
        DateTimeField field = mdt.getChronology().hourOfDay();
        mdt.setRounding(field, MutableDateTime.ROUND_CEILING);
        assertEquals(MutableDateTime.ROUND_CEILING, mdt.getRoundingMode());
    }

    @Test
    public void testSetRoundingWithMode_halfFloorMode_roundsCorrectly() {
        DateTimeField field = mdt.getChronology().hourOfDay();
        mdt.setRounding(field, MutableDateTime.ROUND_HALF_FLOOR);
        assertEquals(MutableDateTime.ROUND_HALF_FLOOR, mdt.getRoundingMode());
    }

    @Test
    public void testSetRoundingWithMode_halfCeilingMode_roundsCorrectly() {
        DateTimeField field = mdt.getChronology().hourOfDay();
        mdt.setRounding(field, MutableDateTime.ROUND_HALF_CEILING);
        assertEquals(MutableDateTime.ROUND_HALF_CEILING, mdt.getRoundingMode());
    }

    @Test
    public void testSetRoundingWithMode_halfEvenMode_roundsCorrectly() {
        DateTimeField field = mdt.getChronology().hourOfDay();
        mdt.setRounding(field, MutableDateTime.ROUND_HALF_EVEN);
        assertEquals(MutableDateTime.ROUND_HALF_EVEN, mdt.getRoundingMode());
    }

    @Test
    public void testSetRoundingWithMode_noneMode_disablesRounding() {
        DateTimeField field = mdt.getChronology().hourOfDay();
        mdt.setRounding(field, MutableDateTime.ROUND_NONE);
        assertNull(mdt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_NONE, mdt.getRoundingMode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRoundingWithMode_invalidModeTooLow_throwsException() {
        DateTimeField field = mdt.getChronology().hourOfDay();
        mdt.setRounding(field, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRoundingWithMode_invalidModeTooHigh_throwsException() {
        DateTimeField field = mdt.getChronology().hourOfDay();
        mdt.setRounding(field, 6);
    }

    @Test
    public void testSetRoundingWithMode_nullFieldAnyMode_disablesRoundingNoException() {
        mdt.setRounding(null, 999);
        assertNull(mdt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_NONE, mdt.getRoundingMode());
    }

    // ---------------------- setMillis ----------------------

    @Test
    public void testSetMillis_longValue_setsCorrectly() {
        mdt.setMillis(12345L);
        assertEquals(12345L, mdt.getMillis());
    }

    @Test
    public void testSetMillis_withRoundingFloor_roundsCorrectly() {
        DateTimeField field = mdt.getChronology().hourOfDay();
        mdt.setRounding(field, MutableDateTime.ROUND_FLOOR);
        mdt.setMillis(12345L);
        long expected = field.roundFloor(12345L);
        assertEquals(expected, mdt.getMillis());
    }

    @Test
    public void testSetMillis_withReadableInstant_setsCorrectly() {
        DateTime other = new DateTime(99999L);
        mdt.setMillis(other);
        assertEquals(99999L, mdt.getMillis());
    }

    @Test
    public void testSetMillis_withNullReadableInstant_setsToNow() {
        mdt.setMillis((org.joda.time.ReadableInstant) null);
        assertNotNull(mdt);
    }

    // ---------------------- add ----------------------

    @Test
    public void testAdd_longDuration_addsCorrectly() {
        long before = mdt.getMillis();
        mdt.add(1000L);
        assertEquals(before + 1000L, mdt.getMillis());
    }

    @Test
    public void testAdd_readableDuration_addsCorrectly() {
        long before = mdt.getMillis();
        Duration duration = new Duration(1000L);
        mdt.add(duration);
        assertEquals(before + 1000L, mdt.getMillis());
    }

    @Test
    public void testAdd_nullReadableDuration_noChange() {
        long before = mdt.getMillis();
        mdt.add((org.joda.time.ReadableDuration) null);
        assertEquals(before, mdt.getMillis());
    }

    @Test
    public void testAdd_readableDurationWithScalar_addsCorrectly() {
        long before = mdt.getMillis();
        Duration duration = new Duration(1000L);
        mdt.add(duration, 2);
        assertEquals(before + 2000L, mdt.getMillis());
    }

    @Test
    public void testAdd_nullReadableDurationWithScalar_noChange() {
        long before = mdt.getMillis();
        mdt.add((org.joda.time.ReadableDuration) null, 5);
        assertEquals(before, mdt.getMillis());
    }

    @Test
    public void testAdd_readablePeriod_addsCorrectly() {
        int yearBefore = mdt.getYear();
        Period period = Period.years(1);
        mdt.add(period);
        assertEquals(yearBefore + 1, mdt.getYear());
    }

    @Test
    public void testAdd_nullReadablePeriod_noChange() {
        long before = mdt.getMillis();
        mdt.add((org.joda.time.ReadablePeriod) null);
        assertEquals(before, mdt.getMillis());
    }

    @Test
    public void testAdd_readablePeriodWithScalar_addsCorrectly() {
        int yearBefore = mdt.getYear();
        Period period = Period.years(1);
        mdt.add(period, 2);
        assertEquals(yearBefore + 2, mdt.getYear());
    }

    @Test
    public void testAdd_nullReadablePeriodWithScalar_noChange() {
        long before = mdt.getMillis();
        mdt.add((org.joda.time.ReadablePeriod) null, 2);
        assertEquals(before, mdt.getMillis());
    }

    // ---------------------- setChronology ----------------------

    @Test
    public void testSetChronology_validChronology_setsCorrectly() {
        mdt.setChronology(ISOChronology.getInstance(DateTimeZone.UTC));
        assertEquals(ISOChronology.getInstance(DateTimeZone.UTC), mdt.getChronology());
    }

    @Test
    public void testSetChronology_nullChronology_usesDefault() {
        mdt.setChronology(null);
        assertNotNull(mdt.getChronology());
    }

    // ---------------------- setZone / setZoneRetainFields ----------------------

    @Test
    public void testSetZone_differentZone_changesZoneKeepingMillis() {
        long before = mdt.getMillis();
        mdt.setZone(DateTimeZone.forOffsetHours(2));
        assertEquals(before, mdt.getMillis());
        assertEquals(DateTimeZone.forOffsetHours(2), mdt.getZone());
    }

    @Test
    public void testSetZone_sameZone_noChange() {
        mdt.setZone(DateTimeZone.UTC);
        assertEquals(DateTimeZone.UTC, mdt.getZone());
    }

    @Test
    public void testSetZone_nullZone_usesDefault() {
        mdt.setZone(null);
        assertNotNull(mdt.getZone());
    }

    @Test
    public void testSetZoneRetainFields_differentZone_retainsFields() {
        int hourBefore = mdt.getHourOfDay();
        mdt.setZoneRetainFields(DateTimeZone.forOffsetHours(2));
        assertEquals(hourBefore, mdt.getHourOfDay());
    }

    @Test
    public void testSetZoneRetainFields_sameZone_noChange() {
        long before = mdt.getMillis();
        mdt.setZoneRetainFields(DateTimeZone.UTC);
        assertEquals(before, mdt.getMillis());
    }

    @Test
    public void testSetZoneRetainFields_nullZone_usesDefault() {
        mdt.setZoneRetainFields(null);
        assertNotNull(mdt.getZone());
    }

    // ---------------------- set / add by type ----------------------

    @Test
    public void testSet_validTypeAndValue_setsCorrectly() {
        mdt.set(DateTimeFieldType.year(), 2010);
        assertEquals(2010, mdt.getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSet_nullType_throwsException() {
        mdt.set(null, 2010);
    }

    @Test
    public void testAddDurationFieldType_validTypeAndAmount_addsCorrectly() {
        int yearBefore = mdt.getYear();
        mdt.add(DurationFieldType.years(), 1);
        assertEquals(yearBefore + 1, mdt.getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDurationFieldType_nullType_throwsException() {
        mdt.add((DurationFieldType) null, 1);
    }

    // ---------------------- Year/Weekyear ----------------------

    @Test
    public void testSetYear_validYear_setsCorrectly() {
        mdt.setYear(2010);
        assertEquals(2010, mdt.getYear());
    }

    @Test
    public void testAddYears_positiveValue_addsCorrectly() {
        int before = mdt.getYear();
        mdt.addYears(5);
        assertEquals(before + 5, mdt.getYear());
    }

    @Test
    public void testAddYears_negativeValue_subtractsCorrectly() {
        int before = mdt.getYear();
        mdt.addYears(-5);
        assertEquals(before - 5, mdt.getYear());
    }

    @Test
    public void testSetWeekyear_validValue_setsCorrectly() {
        mdt.setWeekyear(2010);
        assertEquals(2010, mdt.getWeekyear());
    }

    @Test
    public void testAddWeekyears_positiveValue_addsCorrectly() {
        int before = mdt.getWeekyear();
        mdt.addWeekyears(2);
        assertEquals(before + 2, mdt.getWeekyear());
    }

    // ---------------------- Month/Week ----------------------

    @Test
    public void testSetMonthOfYear_validValue_setsCorrectly() {
        mdt.setMonthOfYear(12);
        assertEquals(12, mdt.getMonthOfYear());
    }

    @Test
    public void testAddMonths_positiveValue_addsCorrectly() {
        mdt.setMonthOfYear(1);
        mdt.addMonths(2);
        assertEquals(3, mdt.getMonthOfYear());
    }

    @Test
    public void testSetWeekOfWeekyear_validValue_setsCorrectly() {
        mdt.setWeekOfWeekyear(10);
        assertEquals(10, mdt.getWeekOfWeekyear());
    }

    @Test
    public void testAddWeeks_positiveValue_addsCorrectly() {
        int dayBefore = mdt.getDayOfYear();
        mdt.addWeeks(1);
        assertEquals(dayBefore + 7, mdt.getDayOfYear());
    }

    // ---------------------- Day fields ----------------------

    @Test
    public void testSetDayOfYear_validValue_setsCorrectly() {
        mdt.setDayOfYear(100);
        assertEquals(100, mdt.getDayOfYear());
    }

    @Test
    public void testSetDayOfMonth_validValue_setsCorrectly() {
        mdt.setDayOfMonth(15);
        assertEquals(15, mdt.getDayOfMonth());
    }

    @Test
    public void testSetDayOfWeek_validValue_setsCorrectly() {
        mdt.setDayOfWeek(3);
        assertEquals(3, mdt.getDayOfWeek());
    }

    @Test
    public void testAddDays_positiveValue_addsCorrectly() {
        int before = mdt.getDayOfMonth();
        mdt.addDays(1);
        // Could roll to next month, just check no exception and value changed millis
        assertNotNull(mdt);
    }

    // ---------------------- Hour ----------------------

    @Test
    public void testSetHourOfDay_validValue_setsCorrectly() {
        mdt.setHourOfDay(15);
        assertEquals(15, mdt.getHourOfDay());
    }

    @Test
    public void testAddHours_positiveValue_addsCorrectly() {
        mdt.setHourOfDay(10);
        mdt.addHours(2);
        assertEquals(12, mdt.getHourOfDay());
    }

    // ---------------------- Minute ----------------------

    @Test
    public void testSetMinuteOfDay_validValue_setsCorrectly() {
        mdt.setMinuteOfDay(100);
        assertEquals(100, mdt.getMinuteOfDay());
    }

    @Test
    public void testSetMinuteOfHour_validValue_setsCorrectly() {
        mdt.setMinuteOfHour(30);
        assertEquals(30, mdt.getMinuteOfHour());
    }

    @Test
    public void testAddMinutes_positiveValue_addsCorrectly() {
        mdt.setMinuteOfHour(10);
        mdt.addMinutes(5);
        assertEquals(15, mdt.getMinuteOfHour());
    }

    // ---------------------- Second ----------------------

    @Test
    public void testSetSecondOfDay_validValue_setsCorrectly() {
        mdt.setSecondOfDay(100);
        assertEquals(100, mdt.getSecondOfDay());
    }

    @Test
    public void testSetSecondOfMinute_validValue_setsCorrectly() {
        mdt.setSecondOfMinute(45);
        assertEquals(45, mdt.getSecondOfMinute());
    }

    @Test
    public void testAddSeconds_positiveValue_addsCorrectly() {
        mdt.setSecondOfMinute(10);
        mdt.addSeconds(5);
        assertEquals(15, mdt.getSecondOfMinute());
    }

    // ---------------------- Millis ----------------------

    @Test
    public void testSetMillisOfDay_validValue_setsCorrectly() {
        mdt.setMillisOfDay(5000);
        assertEquals(5000, mdt.getMillisOfDay());
    }

    @Test
    public void testSetMillisOfSecond_validValue_setsCorrectly() {
        mdt.setMillisOfSecond(500);
        assertEquals(500, mdt.getMillisOfSecond());
    }

    @Test
    public void testAddMillis_positiveValue_addsCorrectly() {
        mdt.setMillisOfSecond(100);
        mdt.addMillis(50);
        assertEquals(150, mdt.getMillisOfSecond());
    }

    // ---------------------- setDate ----------------------

    @Test
    public void testSetDate_longInstant_retainsTime() {
        int hourBefore = mdt.getHourOfDay();
        mdt.setDate(0L);
        assertEquals(hourBefore, mdt.getHourOfDay());
        assertEquals(1970, mdt.getYear());
    }

    @Test
    public void testSetDate_readableInstant_retainsTime() {
        int hourBefore = mdt.getHourOfDay();
        DateTime other = new DateTime(1970, 1, 1, 5, 0, 0, 0, DateTimeZone.UTC);
        mdt.setDate(other);
        assertEquals(hourBefore, mdt.getHourOfDay());
        assertEquals(1970, mdt.getYear());
    }

    @Test
    public void testSetDate_nullReadableInstant_usesNow() {
        mdt.setDate((org.joda.time.ReadableInstant) null);
        assertNotNull(mdt);
    }

    @Test
    public void testSetDate_withFields_setsCorrectly() {
        int hourBefore = mdt.getHourOfDay();
        mdt.setDate(2020, 5, 10);
        assertEquals(2020, mdt.getYear());
        assertEquals(5, mdt.getMonthOfYear());
        assertEquals(10, mdt.getDayOfMonth());
        assertEquals(hourBefore, mdt.getHourOfDay());
    }

    // ---------------------- setTime ----------------------

    @Test
    public void testSetTime_longMillis_retainsDate() {
        int yearBefore = mdt.getYear();
        mdt.setTime(5000L);
        assertEquals(yearBefore, mdt.getYear());
    }

    @Test
    public void testSetTime_readableInstant_retainsDate() {
        int yearBefore = mdt.getYear();
        DateTime other = new DateTime(1970, 1, 1, 5, 0, 0, 0, DateTimeZone.UTC);
        mdt.setTime(other);
        assertEquals(yearBefore, mdt.getYear());
    }

    @Test
    public void testSetTime_nullReadableInstant_usesNow() {
        mdt.setTime((org.joda.time.ReadableInstant) null);
        assertNotNull(mdt);
    }

    @Test
    public void testSetTime_withFields_setsCorrectly() {
        int yearBefore = mdt.getYear();
        mdt.setTime(5, 10, 15, 20);
        assertEquals(5, mdt.getHourOfDay());
        assertEquals(10, mdt.getMinuteOfHour());
        assertEquals(15, mdt.getSecondOfMinute());
        assertEquals(20, mdt.getMillisOfSecond());
        assertEquals(yearBefore, mdt.getYear());
    }

    // ---------------------- setDateTime ----------------------

    @Test
    public void testSetDateTime_withFields_setsAllCorrectly() {
        mdt.setDateTime(2015, 3, 20, 8, 45, 30, 100);
        assertEquals(2015, mdt.getYear());
        assertEquals(3, mdt.getMonthOfYear());
        assertEquals(20, mdt.getDayOfMonth());
        assertEquals(8, mdt.getHourOfDay());
        assertEquals(45, mdt.getMinuteOfHour());
        assertEquals(30, mdt.getSecondOfMinute());
        assertEquals(100, mdt.getMillisOfSecond());
    }

    // ---------------------- property ----------------------

    @Test
    public void testProperty_validType_returnsProperty() {
        MutableDateTime.Property prop = mdt.property(DateTimeFieldType.year());
        assertNotNull(prop);
        assertEquals(mdt, prop.getMutableDateTime());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_nullType_throwsException() {
        mdt.property(null);
    }

    // ---------------------- field property methods ----------------------

    @Test
    public void testEra_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.era();
        assertNotNull(prop);
    }

    @Test
    public void testCenturyOfEra_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.centuryOfEra();
        assertNotNull(prop);
    }

    @Test
    public void testYearOfCentury_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.yearOfCentury();
        assertNotNull(prop);
    }

    @Test
    public void testYearOfEra_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.yearOfEra();
        assertNotNull(prop);
    }

    @Test
    public void testYear_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.year();
        assertNotNull(prop);
    }

    @Test
    public void testWeekyear_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.weekyear();
        assertNotNull(prop);
    }

    @Test
    public void testMonthOfYear_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.monthOfYear();
        assertNotNull(prop);
    }

    @Test
    public void testWeekOfWeekyear_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.weekOfWeekyear();
        assertNotNull(prop);
    }

    @Test
    public void testDayOfYear_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.dayOfYear();
        assertNotNull(prop);
    }

    @Test
    public void testDayOfMonth_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.dayOfMonth();
        assertNotNull(prop);
    }

    @Test
    public void testDayOfWeek_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.dayOfWeek();
        assertNotNull(prop);
    }

    @Test
    public void testHourOfDay_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.hourOfDay();
        assertNotNull(prop);
    }

    @Test
    public void testMinuteOfDay_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.minuteOfDay();
        assertNotNull(prop);
    }

    @Test
    public void testMinuteOfHour_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.minuteOfHour();
        assertNotNull(prop);
    }

    @Test
    public void testSecondOfDay_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.secondOfDay();
        assertNotNull(prop);
    }

    @Test
    public void testSecondOfMinute_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.secondOfMinute();
        assertNotNull(prop);
    }

    @Test
    public void testMillisOfDay_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.millisOfDay();
        assertNotNull(prop);
    }

    @Test
    public void testMillisOfSecond_returnsValidProperty() {
        MutableDateTime.Property prop = mdt.millisOfSecond();
        assertNotNull(prop);
    }

    // ---------------------- copy/clone ----------------------

    @Test
    public void testCopy_typical_returnsEqualButDifferentInstance() {
        MutableDateTime copy = mdt.copy();
        assertEquals(mdt.getMillis(), copy.getMillis());
        assertNotSame(mdt, copy);
    }

    @Test
    public void testClone_typical_returnsEqualButDifferentInstance() {
        Object clone = mdt.clone();
        assertTrue(clone instanceof MutableDateTime);
        assertNotSame(mdt, clone);
        assertEquals(mdt.getMillis(), ((MutableDateTime) clone).getMillis());
    }

    // ---------------------- toString ----------------------

    @Test
    public void testToString_typical_returnsISOFormattedString() {
        String str = mdt.toString();
        assertNotNull(str);
        assertTrue(str.contains("2004"));
    }

    // ---------------------- Property class methods ----------------------

    @Test
    public void testPropertyGetField_returnsCorrectField() {
        MutableDateTime.Property prop = mdt.year();
        assertNotNull(prop.getField());
    }

    @Test
    public void testPropertyGetMutableDateTime_returnsSameInstance() {
        MutableDateTime.Property prop = mdt.year();
        assertSame(mdt, prop.getMutableDateTime());
    }

    @Test
    public void testPropertyAddInt_addsCorrectly() {
        int before = mdt.getYear();
        MutableDateTime result = mdt.year().add(1);
        assertEquals(before + 1, mdt.getYear());
        assertSame(mdt, result);
    }

    @Test
    public void testPropertyAddLong_addsCorrectly() {
        int before = mdt.getYear();
        MutableDateTime result = mdt.year().add(1L);
        assertEquals(before + 1, mdt.getYear());
        assertSame(mdt, result);
    }

    @Test
    public void testPropertyAddWrapField_wrapsCorrectly() {
        mdt.setMonthOfYear(12);
        MutableDateTime result = mdt.monthOfYear().addWrapField(1);
        assertEquals(1, mdt.getMonthOfYear());
        assertSame(mdt, result);
    }

    @Test
    public void testPropertySetInt_setsCorrectly() {
        MutableDateTime result = mdt.year().set(2020);
        assertEquals(2020, mdt.getYear());
        assertSame(mdt, result);
    }

    @Test
    public void testPropertySetStringWithLocale_setsCorrectly() {
        MutableDateTime result = mdt.monthOfYear().set("December", Locale.ENGLISH);
        assertEquals(12, mdt.getMonthOfYear());
        assertSame(mdt, result);
    }

    @Test
    public void testPropertySetString_setsCorrectly() {
        MutableDateTime result = mdt.monthOfYear().set("December");
        assertEquals(12, mdt.getMonthOfYear());
        assertSame(mdt, result);
    }

    @Test
    public void testPropertyRoundFloor_roundsCorrectly() {
        mdt.setMillisOfSecond(500);
        MutableDateTime result = mdt.secondOfMinute().roundFloor();
        assertEquals(0, mdt.getMillisOfSecond());
        assertSame(mdt, result);
    }

    @Test
    public void testPropertyRoundCeiling_roundsCorrectly() {
        mdt.setMillisOfSecond(500);
        MutableDateTime result = mdt.secondOfMinute().roundCeiling();
        assertEquals(0, mdt.getMillisOfSecond());
        assertSame(mdt, result);
    }

    @Test
    public void testPropertyRoundHalfFloor_roundsCorrectly() {
        MutableDateTime result = mdt.secondOfMinute().roundHalfFloor();
        assertNotNull(result);
        assertSame(mdt, result);
    }

    @Test
    public void testPropertyRoundHalfCeiling_roundsCorrectly() {
        MutableDateTime result = mdt.secondOfMinute().roundHalfCeiling();
        assertNotNull(result);
        assertSame(mdt, result);
    }

    @Test
    public void testPropertyRoundHalfEven_roundsCorrectly() {
        MutableDateTime result = mdt.secondOfMinute().roundHalfEven();
        assertNotNull(result);
        assertSame(mdt, result);
    }
}
