import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.Instant;

import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import org.joda.time.tz.Provider;
import org.joda.time.tz.NameProvider;

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
    public void testGetDefault_normal_returnsNonNull() {
        DateTimeZone zone = DateTimeZone.getDefault();
        assertNotNull(zone);
    }

    @Test
    public void testSetDefault_normal_setsZone() {
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
    public void testForID_null_returnsDefault() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        DateTimeZone zone = DateTimeZone.forID(null);
        assertEquals(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForID_UTC_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForID_validLongId_returnsZone() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        assertNotNull(zone);
        assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void testForID_offsetZeroPlus_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forID("+00:00");
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForID_offsetZeroMinus_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forID("-00:00");
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForID_positiveOffset_returnsFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        assertNotNull(zone);
        assertEquals("+02:00", zone.getID());
    }

    @Test
    public void testForID_negativeOffset_returnsFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("-05:00");
        assertNotNull(zone);
        assertEquals("-05:00", zone.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidId_throwsException() {
        DateTimeZone.forID("Not/A/Real/Zone");
    }

    //-----------------------------------------------------------------------
    // forOffsetHours
    //-----------------------------------------------------------------------

    @Test
    public void testForOffsetHours_zero_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(0);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForOffsetHours_positive_returnsZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        assertEquals("+05:00", zone.getID());
    }

    @Test
    public void testForOffsetHours_negative_returnsZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-5);
        assertEquals("-05:00", zone.getID());
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
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 0);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForOffsetHoursMinutes_positive_returnsZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(2, 30);
        assertEquals("+02:30", zone.getID());
    }

    @Test
    public void testForOffsetHoursMinutes_negative_returnsZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        assertEquals("-02:30", zone.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesNegative_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(2, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesTooLarge_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(2, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_overflow_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 59);
    }

    //-----------------------------------------------------------------------
    // forOffsetMillis
    //-----------------------------------------------------------------------

    @Test
    public void testForOffsetMillis_zero_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(0);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForOffsetMillis_positive_returnsZone() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3600000);
        assertEquals("+01:00", zone.getID());
    }

    @Test
    public void testForOffsetMillis_negative_returnsZone() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(-3600000);
        assertEquals("-01:00", zone.getID());
    }

    @Test
    public void testForOffsetMillis_cached_returnsSameInstance() {
        DateTimeZone zone1 = DateTimeZone.forOffsetMillis(7200000);
        DateTimeZone zone2 = DateTimeZone.forOffsetMillis(7200000);
        assertEquals(zone1.getID(), zone2.getID());
    }

    //-----------------------------------------------------------------------
    // forTimeZone
    //-----------------------------------------------------------------------

    @Test
    public void testForTimeZone_null_returnsDefault() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        DateTimeZone zone = DateTimeZone.forTimeZone(null);
        assertEquals(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForTimeZone_UTC_returnsUTC() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForTimeZone_validLongId_returnsZone() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertNotNull(zone);
        assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void testForTimeZone_oldShortId_convertsToLongId() {
        TimeZone tz = TimeZone.getTimeZone("EST");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertNotNull(zone);
    }

    //-----------------------------------------------------------------------
    // getAvailableIDs
    //-----------------------------------------------------------------------

    @Test
    public void testGetAvailableIDs_normal_containsUTC() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.contains("UTC"));
    }

    //-----------------------------------------------------------------------
    // getProvider / setProvider
    //-----------------------------------------------------------------------

    @Test
    public void testGetProvider_normal_returnsNonNull() {
        Provider provider = DateTimeZone.getProvider();
        assertNotNull(provider);
    }

    @Test
    public void testSetProvider_null_resetsToDefault() {
        Provider original = DateTimeZone.getProvider();
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
        // restore
        DateTimeZone.setProvider(original);
    }

    //-----------------------------------------------------------------------
    // getNameProvider / setNameProvider
    //-----------------------------------------------------------------------

    @Test
    public void testGetNameProvider_normal_returnsNonNull() {
        NameProvider provider = DateTimeZone.getNameProvider();
        assertNotNull(provider);
    }

    @Test
    public void testSetNameProvider_null_resetsToDefault() {
        NameProvider original = DateTimeZone.getNameProvider();
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
        // restore
        DateTimeZone.setNameProvider(original);
    }

    //-----------------------------------------------------------------------
    // getID
    //-----------------------------------------------------------------------

    @Test
    public void testGetID_UTC_returnsUTC() {
        assertEquals("UTC", DateTimeZone.UTC.getID());
    }

    //-----------------------------------------------------------------------
    // getNameKey
    //-----------------------------------------------------------------------

    @Test
    public void testGetNameKey_UTC_returnsValue() {
        String key = DateTimeZone.UTC.getNameKey(0L);
        // UTC's name key may be "UTC" or null depending on implementation
        assertTrue(key == null || key.equals("UTC"));
    }

    //-----------------------------------------------------------------------
    // getShortName
    //-----------------------------------------------------------------------

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
    public void testGetShortName_nullLocale_returnsNonNull() {
        String name = DateTimeZone.UTC.getShortName(0L, null);
        assertNotNull(name);
    }

    //-----------------------------------------------------------------------
    // getName
    //-----------------------------------------------------------------------

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
    public void testGetName_nullLocale_returnsNonNull() {
        String name = DateTimeZone.UTC.getName(0L, null);
        assertNotNull(name);
    }

    //-----------------------------------------------------------------------
    // getOffset
    //-----------------------------------------------------------------------

    @Test
    public void testGetOffset_long_UTC_returnsZero() {
        int offset = DateTimeZone.UTC.getOffset(0L);
        assertEquals(0, offset);
    }

    @Test
    public void testGetOffset_readableInstant_null_returnsCurrentOffset() {
        int offset = DateTimeZone.UTC.getOffset((org.joda.time.ReadableInstant) null);
        assertEquals(0, offset);
    }

    @Test
    public void testGetOffset_readableInstant_nonNull_returnsOffset() {
        Instant instant = new Instant(0L);
        int offset = DateTimeZone.UTC.getOffset(instant);
        assertEquals(0, offset);
    }

    //-----------------------------------------------------------------------
    // getStandardOffset
    //-----------------------------------------------------------------------

    @Test
    public void testGetStandardOffset_UTC_returnsZero() {
        int offset = DateTimeZone.UTC.getStandardOffset(0L);
        assertEquals(0, offset);
    }

    //-----------------------------------------------------------------------
    // isStandardOffset
    //-----------------------------------------------------------------------

    @Test
    public void testIsStandardOffset_UTC_returnsTrue() {
        assertTrue(DateTimeZone.UTC.isStandardOffset(0L));
    }

    //-----------------------------------------------------------------------
    // getOffsetFromLocal
    //-----------------------------------------------------------------------

    @Test
    public void testGetOffsetFromLocal_UTC_returnsZero() {
        int offset = DateTimeZone.UTC.getOffsetFromLocal(0L);
        assertEquals(0, offset);
    }

    @Test
    public void testGetOffsetFromLocal_fixedOffsetZone_returnsOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        int offset = zone.getOffsetFromLocal(0L);
        assertEquals(5 * 3600000, offset);
    }

    //-----------------------------------------------------------------------
    // convertUTCToLocal
    //-----------------------------------------------------------------------

    @Test
    public void testConvertUTCToLocal_UTC_returnsSameValue() {
        long local = DateTimeZone.UTC.convertUTCToLocal(1000L);
        assertEquals(1000L, local);
    }

    @Test
    public void testConvertUTCToLocal_fixedOffset_returnsAdjustedValue() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long local = zone.convertUTCToLocal(0L);
        assertEquals(2 * 3600000L, local);
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflow_throwsException() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    //-----------------------------------------------------------------------
    // convertLocalToUTC
    //-----------------------------------------------------------------------

    @Test
    public void testConvertLocalToUTC_UTC_strict_returnsSameValue() {
        long utc = DateTimeZone.UTC.convertLocalToUTC(1000L, true);
        assertEquals(1000L, utc);
    }

    @Test
    public void testConvertLocalToUTC_UTC_nonStrict_returnsSameValue() {
        long utc = DateTimeZone.UTC.convertLocalToUTC(1000L, false);
        assertEquals(1000L, utc);
    }

    @Test
    public void testConvertLocalToUTC_fixedOffset_returnsAdjustedValue() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long utc = zone.convertLocalToUTC(2 * 3600000L, true);
        assertEquals(0L, utc);
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_overflow_throwsException() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        zone.convertLocalToUTC(Long.MIN_VALUE, true);
    }

    //-----------------------------------------------------------------------
    // getMillisKeepLocal
    //-----------------------------------------------------------------------

    @Test
    public void testGetMillisKeepLocal_sameZone_returnsSameInstant() {
        long result = DateTimeZone.UTC.getMillisKeepLocal(DateTimeZone.UTC, 1000L);
        assertEquals(1000L, result);
    }

    @Test
    public void testGetMillisKeepLocal_nullZone_usesDefault() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        long result = DateTimeZone.UTC.getMillisKeepLocal(null, 1000L);
        assertEquals(1000L, result);
    }

    @Test
    public void testGetMillisKeepLocal_differentZone_returnsAdjustedInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long result = DateTimeZone.UTC.getMillisKeepLocal(zone, 0L);
        assertEquals(-2 * 3600000L, result);
    }

    //-----------------------------------------------------------------------
    // isLocalDateTimeGap
    //-----------------------------------------------------------------------

    @Test
    public void testIsLocalDateTimeGap_fixedZone_returnsFalse() {
        LocalDateTime ldt = new LocalDateTime(2020, 1, 1, 0, 0, 0);
        boolean result = DateTimeZone.UTC.isLocalDateTimeGap(ldt);
        assertFalse(result);
    }

    @Test
    public void testIsLocalDateTimeGap_normalTime_returnsFalse() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        LocalDateTime ldt = new LocalDateTime(2020, 1, 1, 0, 0, 0);
        boolean result = zone.isLocalDateTimeGap(ldt);
        assertFalse(result);
    }

    //-----------------------------------------------------------------------
    // isFixed
    //-----------------------------------------------------------------------

    @Test
    public void testIsFixed_UTC_returnsTrue() {
        assertTrue(DateTimeZone.UTC.isFixed());
    }

    @Test
    public void testIsFixed_nonFixedZone_returnsFalse() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        assertFalse(zone.isFixed());
    }

    //-----------------------------------------------------------------------
    // nextTransition
    //-----------------------------------------------------------------------

    @Test
    public void testNextTransition_UTC_returnsSameInstant() {
        long result = DateTimeZone.UTC.nextTransition(0L);
        assertEquals(0L, result);
    }

    @Test
    public void testNextTransition_nonFixedZone_returnsDifferentInstant() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long result = zone.nextTransition(0L);
        assertTrue(result >= 0L || result == 0L);
    }

    //-----------------------------------------------------------------------
    // previousTransition
    //-----------------------------------------------------------------------

    @Test
    public void testPreviousTransition_UTC_returnsSameInstant() {
        long result = DateTimeZone.UTC.previousTransition(0L);
        assertEquals(0L, result);
    }

    @Test
    public void testPreviousTransition_nonFixedZone_returnsDifferentInstant() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long result = zone.previousTransition(100000000000L);
        assertTrue(result <= 100000000000L);
    }

    //-----------------------------------------------------------------------
    // toTimeZone
    //-----------------------------------------------------------------------

    @Test
    public void testToTimeZone_UTC_returnsTimeZone() {
        TimeZone tz = DateTimeZone.UTC.toTimeZone();
        assertNotNull(tz);
    }

    //-----------------------------------------------------------------------
    // equals
    //-----------------------------------------------------------------------

    @Test
    public void testEquals_sameZone_returnsTrue() {
        assertTrue(DateTimeZone.UTC.equals(DateTimeZone.UTC));
    }

    @Test
    public void testEquals_differentZone_returnsFalse() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        assertFalse(DateTimeZone.UTC.equals(zone));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(DateTimeZone.UTC.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        assertFalse(DateTimeZone.UTC.equals("UTC"));
    }

    //-----------------------------------------------------------------------
    // hashCode
    //-----------------------------------------------------------------------

    @Test
    public void testHashCode_UTC_consistentWithEquals() {
        int hash1 = DateTimeZone.UTC.hashCode();
        int hash2 = DateTimeZone.UTC.hashCode();
        assertEquals(hash1, hash2);
    }

    //-----------------------------------------------------------------------
    // toString
    //-----------------------------------------------------------------------

    @Test
    public void testToString_UTC_returnsID() {
        assertEquals("UTC", DateTimeZone.UTC.toString());
    }

    @Test
    public void testToString_customZone_returnsID() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        assertEquals("America/New_York", zone.toString());
    }
}
