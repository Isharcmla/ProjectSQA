import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import org.joda.time.tz.Provider;
import org.joda.time.tz.NameProvider;

import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

public class DateTimeZoneTest {

    private DateTimeZone originalDefault;
    private Provider originalProvider;
    private NameProvider originalNameProvider;

    @Before
    public void setUp() {
        originalDefault = DateTimeZone.getDefault();
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefault);
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
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
    public void testSetDefault_validZone_setsSuccessfully() {
        DateTimeZone utc = DateTimeZone.UTC;
        DateTimeZone.setDefault(utc);
        assertEquals(utc, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_null_throwsIllegalArgumentException() {
        DateTimeZone.setDefault(null);
    }

    //-----------------------------------------------------------------------
    // forID
    //-----------------------------------------------------------------------

    @Test
    public void testForID_UTC_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForID_null_returnsDefault() {
        DateTimeZone zone = DateTimeZone.forID(null);
        assertEquals(DateTimeZone.getDefault(), zone);
    }

    @Test
    public void testForID_validLongId_returnsZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertNotNull(zone);
        assertEquals("Europe/London", zone.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidId_throwsIllegalArgumentException() {
        DateTimeZone.forID("Not/AValidZone");
    }

    @Test
    public void testForID_offsetFormat_returnsFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        assertNotNull(zone);
        assertEquals("+02:00", zone.getID());
    }

    @Test
    public void testForID_offsetFormatZero_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forID("+00:00");
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForID_negativeOffsetFormat_returnsFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("-05:00");
        assertNotNull(zone);
        assertEquals("-05:00", zone.getID());
    }

    //-----------------------------------------------------------------------
    // forOffsetHours
    //-----------------------------------------------------------------------

    @Test
    public void testForOffsetHours_valid_returnsZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        assertEquals("+05:00", zone.getID());
    }

    @Test
    public void testForOffsetHours_zero_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(0);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_outOfRange_throwsException() {
        DateTimeZone.forOffsetHours(24);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_negativeOutOfRange_throwsException() {
        DateTimeZone.forOffsetHours(-24);
    }

    //-----------------------------------------------------------------------
    // forOffsetHoursMinutes
    //-----------------------------------------------------------------------

    @Test
    public void testForOffsetHoursMinutes_zeroZero_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 0);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForOffsetHoursMinutes_positivePositive_returnsZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(2, 15);
        assertEquals("+02:15", zone.getID());
    }

    @Test
    public void testForOffsetHoursMinutes_zeroPositive_returnsZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 15);
        assertEquals("+00:15", zone.getID());
    }

    @Test
    public void testForOffsetHoursMinutes_zeroNegative_returnsZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, -15);
        assertEquals("-00:15", zone.getID());
    }

    @Test
    public void testForOffsetHoursMinutes_negativeNegative_returnsZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-2, -15);
        assertEquals("-02:15", zone.getID());
    }

    @Test
    public void testForOffsetHoursMinutes_negativePositive_returnsZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-2, 15);
        assertEquals("-02:15", zone.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_positiveNegative_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(2, -15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_hoursOutOfRange_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(24, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesOutOfRange_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(2, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesNegativeOutOfRange_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(2, -1);
    }

    //-----------------------------------------------------------------------
    // forOffsetMillis
    //-----------------------------------------------------------------------

    @Test
    public void testForOffsetMillis_valid_returnsZone() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3600000);
        assertEquals("+01:00", zone.getID());
    }

    @Test
    public void testForOffsetMillis_zero_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(0);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetMillis_tooLarge_throwsException() {
        DateTimeZone.forOffsetMillis(90000000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetMillis_tooSmall_throwsException() {
        DateTimeZone.forOffsetMillis(-90000000);
    }

    //-----------------------------------------------------------------------
    // forTimeZone
    //-----------------------------------------------------------------------

    @Test
    public void testForTimeZone_UTC_returnsUTC() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForTimeZone_null_returnsDefault() {
        DateTimeZone zone = DateTimeZone.forTimeZone(null);
        assertEquals(DateTimeZone.getDefault(), zone);
    }

    @Test
    public void testForTimeZone_validID_returnsZone() {
        TimeZone tz = TimeZone.getTimeZone("Europe/London");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertNotNull(zone);
        assertEquals("Europe/London", zone.getID());
    }

    @Test
    public void testForTimeZone_shortIdPST_convertedProperly() {
        TimeZone tz = TimeZone.getTimeZone("PST");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertNotNull(zone);
    }

    //-----------------------------------------------------------------------
    // getAvailableIDs
    //-----------------------------------------------------------------------

    @Test
    public void testGetAvailableIDs_notEmpty() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.size() > 0);
        assertTrue(ids.contains("UTC"));
    }

    //-----------------------------------------------------------------------
    // getProvider / setProvider
    //-----------------------------------------------------------------------

    @Test
    public void testGetProvider_notNull() {
        Provider provider = DateTimeZone.getProvider();
        assertNotNull(provider);
    }

    @Test
    public void testSetProvider_null_resetsToDefault() {
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
    }

    //-----------------------------------------------------------------------
    // getNameProvider / setNameProvider
    //-----------------------------------------------------------------------

    @Test
    public void testGetNameProvider_notNull() {
        NameProvider nameProvider = DateTimeZone.getNameProvider();
        assertNotNull(nameProvider);
    }

    @Test
    public void testSetNameProvider_null_resetsToDefault() {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
    }

    //-----------------------------------------------------------------------
    // getID
    //-----------------------------------------------------------------------

    @Test
    public void testGetID_returnsCorrectId() {
        assertEquals("UTC", DateTimeZone.UTC.getID());
    }

    //-----------------------------------------------------------------------
    // getShortName / getName
    //-----------------------------------------------------------------------

    @Test
    public void testGetShortName_returnsNonNull() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        String name = zone.getShortName(0L);
        assertNotNull(name);
    }

    @Test
    public void testGetShortName_withLocale_returnsNonNull() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        String name = zone.getShortName(0L, Locale.US);
        assertNotNull(name);
    }

    @Test
    public void testGetShortName_withNullLocale_usesDefault() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        String name = zone.getShortName(0L, null);
        assertNotNull(name);
    }

    @Test
    public void testGetName_returnsNonNull() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        String name = zone.getName(0L);
        assertNotNull(name);
    }

    @Test
    public void testGetName_withLocale_returnsNonNull() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        String name = zone.getName(0L, Locale.US);
        assertNotNull(name);
    }

    @Test
    public void testGetName_withNullLocale_usesDefault() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        String name = zone.getName(0L, null);
        assertNotNull(name);
    }

    @Test
    public void testGetShortName_fixedZone_returnsIdOrOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        String name = zone.getShortName(0L);
        assertNotNull(name);
    }

    //-----------------------------------------------------------------------
    // getOffset
    //-----------------------------------------------------------------------

    @Test
    public void testGetOffset_long_returnsCorrectOffset() {
        int offset = DateTimeZone.UTC.getOffset(0L);
        assertEquals(0, offset);
    }

    @Test
    public void testGetOffset_fixedZone_returnsCorrectOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        int offset = zone.getOffset(0L);
        assertEquals(5 * 3600000, offset);
    }

    @Test
    public void testGetOffset_instantNull_usesCurrentTime() {
        int offset = DateTimeZone.UTC.getOffset((org.joda.time.ReadableInstant) null);
        assertEquals(0, offset);
    }

    @Test
    public void testGetOffset_instantNotNull_returnsCorrectOffset() {
        Instant instant = new Instant(0L);
        int offset = DateTimeZone.UTC.getOffset(instant);
        assertEquals(0, offset);
    }

    //-----------------------------------------------------------------------
    // getStandardOffset / isStandardOffset
    //-----------------------------------------------------------------------

    @Test
    public void testGetStandardOffset_returnsCorrectOffset() {
        int offset = DateTimeZone.UTC.getStandardOffset(0L);
        assertEquals(0, offset);
    }

    @Test
    public void testIsStandardOffset_UTC_returnsTrue() {
        assertTrue(DateTimeZone.UTC.isStandardOffset(0L));
    }

    @Test
    public void testIsStandardOffset_fixedZone_returnsTrue() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        assertTrue(zone.isStandardOffset(0L));
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
    public void testGetOffsetFromLocal_fixedZone_returnsOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        int offset = zone.getOffsetFromLocal(0L);
        assertEquals(5 * 3600000, offset);
    }

    //-----------------------------------------------------------------------
    // convertUTCToLocal
    //-----------------------------------------------------------------------

    @Test
    public void testConvertUTCToLocal_UTC_returnsSame() {
        long local = DateTimeZone.UTC.convertUTCToLocal(0L);
        assertEquals(0L, local);
    }

    @Test
    public void testConvertUTCToLocal_fixedZone_returnsAdjusted() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        long local = zone.convertUTCToLocal(0L);
        assertEquals(5 * 3600000L, local);
    }

    //-----------------------------------------------------------------------
    // convertLocalToUTC
    //-----------------------------------------------------------------------

    @Test
    public void testConvertLocalToUTC_strict_UTC_returnsSame() {
        long utc = DateTimeZone.UTC.convertLocalToUTC(0L, true);
        assertEquals(0L, utc);
    }

    @Test
    public void testConvertLocalToUTC_nonStrict_fixedZone_returnsAdjusted() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        long utc = zone.convertLocalToUTC(5 * 3600000L, false);
        assertEquals(0L, utc);
    }

    @Test
    public void testConvertLocalToUTC_withOriginalInstant_returnsCorrect() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        long utc = zone.convertLocalToUTC(5 * 3600000L, false, 0L);
        assertEquals(0L, utc);
    }

    //-----------------------------------------------------------------------
    // getMillisKeepLocal
    //-----------------------------------------------------------------------

    @Test
    public void testGetMillisKeepLocal_sameZone_returnsSameInstant() {
        DateTimeZone zone = DateTimeZone.UTC;
        long result = zone.getMillisKeepLocal(zone, 12345L);
        assertEquals(12345L, result);
    }

    @Test
    public void testGetMillisKeepLocal_differentZone_returnsAdjusted() {
        DateTimeZone utc = DateTimeZone.UTC;
        DateTimeZone offsetZone = DateTimeZone.forOffsetHours(5);
        long result = utc.getMillisKeepLocal(offsetZone, 0L);
        assertEquals(-5 * 3600000L, result);
    }

    @Test
    public void testGetMillisKeepLocal_nullZone_usesDefault() {
        DateTimeZone utc = DateTimeZone.UTC;
        long result = utc.getMillisKeepLocal(null, 0L);
        assertNotNull(result);
    }

    //-----------------------------------------------------------------------
    // isLocalDateTimeGap
    //-----------------------------------------------------------------------

    @Test
    public void testIsLocalDateTimeGap_fixedZone_returnsFalse() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        LocalDateTime ldt = new LocalDateTime(2013, 1, 1, 0, 0);
        assertFalse(zone.isLocalDateTimeGap(ldt));
    }

    @Test
    public void testIsLocalDateTimeGap_nonFixedZone_normalTime_returnsFalse() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        LocalDateTime ldt = new LocalDateTime(2013, 1, 1, 0, 0);
        assertFalse(zone.isLocalDateTimeGap(ldt));
    }

    //-----------------------------------------------------------------------
    // adjustOffset
    //-----------------------------------------------------------------------

    @Test
    public void testAdjustOffset_fixedZone_noChange() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        long instant = 1000000L;
        long result = zone.adjustOffset(instant, false);
        assertEquals(instant, result);
    }

    @Test
    public void testAdjustOffset_UTC_noChange() {
        long instant = 1000000L;
        long result = DateTimeZone.UTC.adjustOffset(instant, true);
        assertEquals(instant, result);
    }

    //-----------------------------------------------------------------------
    // isFixed
    //-----------------------------------------------------------------------

    @Test
    public void testIsFixed_fixedZone_returnsTrue() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        assertTrue(zone.isFixed());
    }

    @Test
    public void testIsFixed_UTC_returnsTrue() {
        assertTrue(DateTimeZone.UTC.isFixed());
    }

    //-----------------------------------------------------------------------
    // nextTransition / previousTransition
    //-----------------------------------------------------------------------

    @Test
    public void testNextTransition_fixedZone_returnsSameInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        long instant = 0L;
        long result = zone.nextTransition(instant);
        assertEquals(instant, result);
    }

    @Test
    public void testPreviousTransition_fixedZone_returnsSameInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        long instant = 0L;
        long result = zone.previousTransition(instant);
        assertEquals(instant, result);
    }

    //-----------------------------------------------------------------------
    // toTimeZone
    //-----------------------------------------------------------------------

    @Test
    public void testToTimeZone_returnsNonNull() {
        TimeZone tz = DateTimeZone.UTC.toTimeZone();
        assertNotNull(tz);
    }

    //-----------------------------------------------------------------------
    // equals / hashCode / toString
    //-----------------------------------------------------------------------

    @Test
    public void testEquals_sameZone_returnsTrue() {
        DateTimeZone zone1 = DateTimeZone.forID("Europe/London");
        DateTimeZone zone2 = DateTimeZone.forID("Europe/London");
        assertTrue(zone1.equals(zone2));
    }

    @Test
    public void testEquals_differentZone_returnsFalse() {
        DateTimeZone zone1 = DateTimeZone.forID("Europe/London");
        DateTimeZone zone2 = DateTimeZone.forID("America/New_York");
        assertFalse(zone1.equals(zone2));
    }

    @Test
    public void testHashCode_sameZone_sameHashCode() {
        DateTimeZone zone1 = DateTimeZone.forID("Europe/London");
        DateTimeZone zone2 = DateTimeZone.forID("Europe/London");
        assertEquals(zone1.hashCode(), zone2.hashCode());
    }

    @Test
    public void testToString_returnsId() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertEquals("Europe/London", zone.toString());
    }

    //-----------------------------------------------------------------------
    // UTC constant
    //-----------------------------------------------------------------------

    @Test
    public void testUTC_constant_hasCorrectProperties() {
        assertEquals("UTC", DateTimeZone.UTC.getID());
        assertEquals(0, DateTimeZone.UTC.getOffset(0L));
        assertTrue(DateTimeZone.UTC.isFixed());
    }
}
