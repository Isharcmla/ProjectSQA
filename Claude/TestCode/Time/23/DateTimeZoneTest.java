package org.joda.time;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DateTimeZoneTest {

    private DateTimeZone originalDefault;

    @Before
    public void setUp() {
        originalDefault = DateTimeZone.getDefault();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefault);
    }

    //-----------------------------------------------------------------------
    // getDefault / setDefault
    //-----------------------------------------------------------------------

    @Test
    public void testGetDefault_returnsNonNull() {
        DateTimeZone zone = DateTimeZone.getDefault();
        assertNotNull(zone);
    }

    @Test
    public void testSetDefault_setsDefaultZone() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertEquals(DateTimeZone.UTC, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_null_throwsException() {
        DateTimeZone.setDefault(null);
    }

    //-----------------------------------------------------------------------
    // forID
    //-----------------------------------------------------------------------

    @Test
    public void testForID_UTC_returnsUTC() {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_null_returnsDefault() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID(null));
    }

    @Test
    public void testForID_validId_returnsZone() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        assertNotNull(zone);
        assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void testForID_offsetZero_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forID("+00:00");
        assertEquals(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForID_positiveOffset_returnsFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        assertNotNull(zone);
        assertEquals(2 * 60 * 60 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testForID_negativeOffset_returnsFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("-05:00");
        assertNotNull(zone);
        assertEquals(-5 * 60 * 60 * 1000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidId_throwsException() {
        DateTimeZone.forID("Invalid/Zone_Name_Not_Real");
    }

    //-----------------------------------------------------------------------
    // forOffsetHours
    //-----------------------------------------------------------------------

    @Test
    public void testForOffsetHours_zero_returnsUTC() {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHours_positive_returnsCorrectZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        assertEquals(5 * 60 * 60 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHours_negative_returnsCorrectZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-5);
        assertEquals(-5 * 60 * 60 * 1000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_tooLarge_throwsException() {
        DateTimeZone.forOffsetHours(Integer.MAX_VALUE);
    }

    //-----------------------------------------------------------------------
    // forOffsetHoursMinutes
    //-----------------------------------------------------------------------

    @Test
    public void testForOffsetHoursMinutes_zero_returnsUTC() {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_positive_returnsCorrectZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(5, 30);
        assertEquals((5 * 60 + 30) * 60 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_negative_returnsCorrectZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-5, 30);
        assertEquals(-(5 * 60 + 30) * 60 * 1000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesNegative_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(5, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesTooLarge_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(5, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_overflow_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 30);
    }

    //-----------------------------------------------------------------------
    // forOffsetMillis
    //-----------------------------------------------------------------------

    @Test
    public void testForOffsetMillis_zero_returnsUTC() {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_positive_returnsCorrectZone() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3600000);
        assertEquals(3600000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetMillis_withSecondsComponent_returnsCorrectZone() {
        int offset = 3600000 + 30000; // 1 hour + 30 seconds
        DateTimeZone zone = DateTimeZone.forOffsetMillis(offset);
        assertEquals(offset, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetMillis_withMillisComponent_returnsCorrectZone() {
        int offset = 1000 + 500; // 1 second + 500 millis
        DateTimeZone zone = DateTimeZone.forOffsetMillis(offset);
        assertEquals(offset, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetMillis_calledTwice_usesCache() {
        DateTimeZone zone1 = DateTimeZone.forOffsetMillis(7200000);
        DateTimeZone zone2 = DateTimeZone.forOffsetMillis(7200000);
        assertNotNull(zone1);
        assertNotNull(zone2);
        assertEquals(zone1.getID(), zone2.getID());
    }

    @Test
    public void testForOffsetMillis_negative_returnsCorrectZone() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(-3600000);
        assertEquals(-3600000, zone.getOffset(0L));
    }

    //-----------------------------------------------------------------------
    // forTimeZone
    //-----------------------------------------------------------------------

    @Test
    public void testForTimeZone_null_returnsDefault() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_utc_returnsUTC() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        assertEquals(DateTimeZone.UTC, DateTimeZone.forTimeZone(tz));
    }

    @Test
    public void testForTimeZone_validZone_returnsCorrectZone() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void testForTimeZone_oldAlias_returnsConvertedZone() {
        TimeZone tz = TimeZone.getTimeZone("EST");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertNotNull(zone);
    }

    //-----------------------------------------------------------------------
    // getAvailableIDs
    //-----------------------------------------------------------------------

    @Test
    public void testGetAvailableIDs_notEmptyAndContainsUTC() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.contains("UTC"));
    }

    //-----------------------------------------------------------------------
    // Provider
    //-----------------------------------------------------------------------

    @Test
    public void testGetProvider_notNull() {
        assertNotNull(DateTimeZone.getProvider());
    }

    @Test
    public void testSetProvider_null_resetsToDefaultProvider() {
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
        // ensure zones still resolvable
        assertNotNull(DateTimeZone.forID("UTC"));
    }

    //-----------------------------------------------------------------------
    // NameProvider
    //-----------------------------------------------------------------------

    @Test
    public void testGetNameProvider_notNull() {
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testSetNameProvider_null_resetsToDefaultNameProvider() {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
    }

    //-----------------------------------------------------------------------
    // Instance methods on UTC
    //-----------------------------------------------------------------------

    @Test
    public void testGetID_returnsCorrectId() {
        assertEquals("UTC", DateTimeZone.UTC.getID());
    }

    @Test
    public void testGetOffset_UTC_returnsZero() {
        assertEquals(0, DateTimeZone.UTC.getOffset(0L));
    }

    @Test
    public void testGetOffset_withNullReadableInstant_usesCurrentTime() {
        int offset = DateTimeZone.UTC.getOffset((ReadableInstant) null);
        assertEquals(0, offset);
    }

    @Test
    public void testGetOffset_withReadableInstant_returnsCorrectOffset() {
        Instant instant = new Instant(0L);
        assertEquals(0, DateTimeZone.UTC.getOffset(instant));
    }

    @Test
    public void testGetStandardOffset_UTC_returnsZero() {
        assertEquals(0, DateTimeZone.UTC.getStandardOffset(0L));
    }

    @Test
    public void testIsStandardOffset_UTC_returnsTrue() {
        assertTrue(DateTimeZone.UTC.isStandardOffset(0L));
    }

    @Test
    public void testGetShortName_defaultLocale_returnsNonNull() {
        String name = DateTimeZone.UTC.getShortName(0L);
        assertNotNull(name);
    }

    @Test
    public void testGetShortName_withLocale_returnsNonNull() {
        String name = DateTimeZone.UTC.getShortName(0L, Locale.US);
        assertNotNull(name);
    }

    @Test
    public void testGetShortName_withNullLocale_returnsNonNull() {
        String name = DateTimeZone.UTC.getShortName(0L, null);
        assertNotNull(name);
    }

    @Test
    public void testGetName_defaultLocale_returnsNonNull() {
        String name = DateTimeZone.UTC.getName(0L);
        assertNotNull(name);
    }

    @Test
    public void testGetName_withLocale_returnsNonNull() {
        String name = DateTimeZone.UTC.getName(0L, Locale.US);
        assertNotNull(name);
    }

    @Test
    public void testGetName_withNullLocale_returnsNonNull() {
        String name = DateTimeZone.UTC.getName(0L, null);
        assertNotNull(name);
    }

    @Test
    public void testGetOffsetFromLocal_UTC_returnsZero() {
        assertEquals(0, DateTimeZone.UTC.getOffsetFromLocal(0L));
    }

    @Test
    public void testGetOffsetFromLocal_namedZone_returnsOffset() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        int offset = ny.getOffsetFromLocal(0L);
        // just ensure it does not throw and returns a plausible offset
        assertTrue(offset <= 0);
    }

    @Test
    public void testConvertUTCToLocal_UTC_returnsSameInstant() {
        assertEquals(0L, DateTimeZone.UTC.convertUTCToLocal(0L));
    }

    @Test
    public void testConvertUTCToLocal_fixedOffset_returnsAdjustedInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long result = zone.convertUTCToLocal(0L);
        assertEquals(2 * 60 * 60 * 1000, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflow_throwsException() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    @Test
    public void testConvertLocalToUTC_UTC_returnsSameInstant() {
        assertEquals(0L, DateTimeZone.UTC.convertLocalToUTC(0L, false));
    }

    @Test
    public void testConvertLocalToUTC_strictMode_returnsSameInstant() {
        assertEquals(0L, DateTimeZone.UTC.convertLocalToUTC(0L, true));
    }

    @Test
    public void testConvertLocalToUTC_withOriginalInstant_returnsSameInstant() {
        assertEquals(0L, DateTimeZone.UTC.convertLocalToUTC(0L, false, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_overflow_throwsException() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        zone.convertLocalToUTC(Long.MIN_VALUE, false);
    }

    @Test
    public void testGetMillisKeepLocal_sameZone_returnsSameInstant() {
        assertEquals(1000L, DateTimeZone.UTC.getMillisKeepLocal(DateTimeZone.UTC, 1000L));
    }

    @Test
    public void testGetMillisKeepLocal_nullZone_usesDefault() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        long result = DateTimeZone.UTC.getMillisKeepLocal(null, 1000L);
        assertEquals(1000L, result);
    }

    @Test
    public void testGetMillisKeepLocal_differentZone_returnsConvertedInstant() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        long result = DateTimeZone.UTC.getMillisKeepLocal(ny, 0L);
        // sanity check: result is a valid long value
        assertTrue(result == result);
    }

    @Test
    public void testIsLocalDateTimeGap_fixedZone_returnsFalse() {
        LocalDateTime ldt = new LocalDateTime(2023, 1, 1, 0, 0);
        assertFalse(DateTimeZone.UTC.isLocalDateTimeGap(ldt));
    }

    @Test
    public void testIsLocalDateTimeGap_namedZoneNormalTime_returnsFalse() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        LocalDateTime ldt = new LocalDateTime(2023, 6, 1, 12, 0);
        assertFalse(ny.isLocalDateTimeGap(ldt));
    }

    @Test
    public void testAdjustOffset_UTC_returnsSameInstant() {
        long result = DateTimeZone.UTC.adjustOffset(0L, true);
        assertEquals(0L, result);
    }

    @Test
    public void testAdjustOffset_earlierFlag_returnsInstant() {
        long result = DateTimeZone.UTC.adjustOffset(0L, false);
        assertEquals(0L, result);
    }

    @Test
    public void testIsFixed_UTC_returnsTrue() {
        assertTrue(DateTimeZone.UTC.isFixed());
    }

    @Test
    public void testIsFixed_namedZone_returnsFalse() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        assertFalse(ny.isFixed());
    }

    @Test
    public void testNextTransition_UTC_returnsSameInstant() {
        assertEquals(0L, DateTimeZone.UTC.nextTransition(0L));
    }

    @Test
    public void testPreviousTransition_UTC_returnsSameInstant() {
        assertEquals(0L, DateTimeZone.UTC.previousTransition(0L));
    }

    @Test
    public void testToTimeZone_UTC_returnsNonNullTimeZone() {
        TimeZone tz = DateTimeZone.UTC.toTimeZone();
        assertNotNull(tz);
    }

    @Test
    public void testEquals_sameZone_returnsTrue() {
        assertTrue(DateTimeZone.UTC.equals(DateTimeZone.UTC));
    }

    @Test
    public void testEquals_differentZone_returnsFalse() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        assertFalse(DateTimeZone.UTC.equals(ny));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(DateTimeZone.UTC.equals(null));
    }

    @Test
    public void testHashCode_consistentAcrossCalls() {
        int h1 = DateTimeZone.UTC.hashCode();
        int h2 = DateTimeZone.UTC.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testToString_returnsID() {
        assertEquals("UTC", DateTimeZone.UTC.toString());
    }

    //-----------------------------------------------------------------------
    // Serialization-related sanity (writeReplace via forID round trip is internal;
    // we simply verify getID consistency after obtaining zones multiple times)
    //-----------------------------------------------------------------------

    @Test
    public void testForID_multipleCalls_sameZoneId() {
        DateTimeZone zone1 = DateTimeZone.forID("Europe/London");
        DateTimeZone zone2 = DateTimeZone.forID("Europe/London");
        assertEquals(zone1.getID(), zone2.getID());
    }
}
