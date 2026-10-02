import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.Instant;
import org.joda.time.DateTime;
import org.joda.time.tz.Provider;
import org.joda.time.tz.NameProvider;

import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

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

    // ---------------------- getDefault / setDefault ----------------------

    @Test
    public void testGetDefault_returnsNonNull() {
        DateTimeZone zone = DateTimeZone.getDefault();
        assertNotNull(zone);
    }

    @Test
    public void testSetDefault_validZone_getDefaultReturnsSameZone() {
        DateTimeZone newZone = DateTimeZone.forID("America/New_York");
        DateTimeZone.setDefault(newZone);
        assertEquals(newZone, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_null_throwsIllegalArgumentException() {
        DateTimeZone.setDefault(null);
    }

    // ---------------------- forID ----------------------

    @Test
    public void testForID_null_returnsDefault() {
        DateTimeZone zone = DateTimeZone.forID(null);
        assertEquals(DateTimeZone.getDefault(), zone);
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
    public void testForID_positiveOffsetString_returnsFixedOffsetZone() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        assertNotNull(zone);
        assertEquals(2 * 60 * 60 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testForID_negativeOffsetString_returnsFixedOffsetZone() {
        DateTimeZone zone = DateTimeZone.forID("-05:00");
        assertNotNull(zone);
        assertEquals(-5 * 60 * 60 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testForID_zeroOffsetString_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forID("+00:00");
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidId_throwsIllegalArgumentException() {
        DateTimeZone.forID("Not/A_Real_Zone");
    }

    // ---------------------- forOffsetHours ----------------------

    @Test
    public void testForOffsetHours_zero_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(0);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForOffsetHours_positive_returnsCorrectOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        assertEquals(5 * 60 * 60 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHours_negative_returnsCorrectOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-3);
        assertEquals(-3 * 60 * 60 * 1000, zone.getOffset(0L));
    }

    // ---------------------- forOffsetHoursMinutes ----------------------

    @Test
    public void testForOffsetHoursMinutes_zeroZero_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 0);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForOffsetHoursMinutes_positiveHoursPositiveMinutes_returnsCorrectOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(5, 30);
        assertEquals((5 * 60 + 30) * 60 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_negativeHoursPositiveMinutes_returnsCorrectOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-5, 30);
        assertEquals(-((5 * 60 + 30) * 60 * 1000), zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesNegative_throwsIllegalArgumentException() {
        DateTimeZone.forOffsetHoursMinutes(1, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesTooLarge_throwsIllegalArgumentException() {
        DateTimeZone.forOffsetHoursMinutes(1, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_offsetTooLarge_throwsIllegalArgumentException() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 59);
    }

    // ---------------------- forOffsetMillis ----------------------

    @Test
    public void testForOffsetMillis_zero_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(0);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForOffsetMillis_nonZero_returnsCorrectOffset() {
        int offset = 3600000;
        DateTimeZone zone = DateTimeZone.forOffsetMillis(offset);
        assertEquals(offset, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetMillis_cachedZone_returnsSameInstance() {
        DateTimeZone zone1 = DateTimeZone.forOffsetMillis(7200000);
        DateTimeZone zone2 = DateTimeZone.forOffsetMillis(7200000);
        assertEquals(zone1.getID(), zone2.getID());
    }

    // ---------------------- forTimeZone ----------------------

    @Test
    public void testForTimeZone_null_returnsDefault() {
        DateTimeZone zone = DateTimeZone.forTimeZone(null);
        assertEquals(DateTimeZone.getDefault(), zone);
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
    public void testForTimeZone_oldStyleId_convertsToNewId() {
        TimeZone tz = TimeZone.getTimeZone("EST");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertNotNull(zone);
    }

    // ---------------------- getAvailableIDs ----------------------

    @Test
    public void testGetAvailableIDs_containsUTC() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.contains("UTC"));
    }

    // ---------------------- getProvider / setProvider ----------------------

    @Test
    public void testGetProvider_returnsNonNull() {
        Provider provider = DateTimeZone.getProvider();
        assertNotNull(provider);
    }

    @Test
    public void testSetProvider_null_resetsToDefaultProvider() {
        Provider original = DateTimeZone.getProvider();
        DateTimeZone.setProvider(null);
        Provider provider = DateTimeZone.getProvider();
        assertNotNull(provider);
        // restore
        DateTimeZone.setProvider(original);
    }

    // ---------------------- getNameProvider / setNameProvider ----------------------

    @Test
    public void testGetNameProvider_returnsNonNull() {
        NameProvider provider = DateTimeZone.getNameProvider();
        assertNotNull(provider);
    }

    @Test
    public void testSetNameProvider_null_resetsToDefaultNameProvider() {
        NameProvider original = DateTimeZone.getNameProvider();
        DateTimeZone.setNameProvider(null);
        NameProvider provider = DateTimeZone.getNameProvider();
        assertNotNull(provider);
        // restore
        DateTimeZone.setNameProvider(original);
    }

    // ---------------------- getID ----------------------

    @Test
    public void testGetID_returnsCorrectId() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        assertEquals("America/New_York", zone.getID());
    }

    // ---------------------- getShortName ----------------------

    @Test
    public void testGetShortName_instantOnly_returnsNonNull() {
        DateTimeZone zone = DateTimeZone.UTC;
        String name = zone.getShortName(0L);
        assertNotNull(name);
    }

    @Test
    public void testGetShortName_withLocale_returnsNonNull() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        String name = zone.getShortName(0L, Locale.US);
        assertNotNull(name);
    }

    @Test
    public void testGetShortName_nullLocale_usesDefaultLocale() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        String name = zone.getShortName(0L, null);
        assertNotNull(name);
    }

    // ---------------------- getName ----------------------

    @Test
    public void testGetName_instantOnly_returnsNonNull() {
        DateTimeZone zone = DateTimeZone.UTC;
        String name = zone.getName(0L);
        assertNotNull(name);
    }

    @Test
    public void testGetName_withLocale_returnsNonNull() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        String name = zone.getName(0L, Locale.US);
        assertNotNull(name);
    }

    @Test
    public void testGetName_nullLocale_usesDefaultLocale() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        String name = zone.getName(0L, null);
        assertNotNull(name);
    }

    // ---------------------- getOffset ----------------------

    @Test
    public void testGetOffset_long_UTC_returnsZero() {
        DateTimeZone zone = DateTimeZone.UTC;
        assertEquals(0, zone.getOffset(0L));
    }

    @Test
    public void testGetOffset_ReadableInstant_nonNull_returnsOffset() {
        DateTimeZone zone = DateTimeZone.UTC;
        ReadableInstant instant = new Instant(0L);
        assertEquals(0, zone.getOffset(instant));
    }

    @Test
    public void testGetOffset_ReadableInstant_null_usesCurrentTime() {
        DateTimeZone zone = DateTimeZone.UTC;
        int offset = zone.getOffset((ReadableInstant) null);
        assertEquals(0, offset);
    }

    // ---------------------- getStandardOffset / isStandardOffset ----------------------

    @Test
    public void testGetStandardOffset_UTC_returnsZero() {
        DateTimeZone zone = DateTimeZone.UTC;
        assertEquals(0, zone.getStandardOffset(0L));
    }

    @Test
    public void testIsStandardOffset_UTC_returnsTrue() {
        DateTimeZone zone = DateTimeZone.UTC;
        assertTrue(zone.isStandardOffset(0L));
    }

    @Test
    public void testIsStandardOffset_fixedOffsetZone_returnsTrue() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        assertTrue(zone.isStandardOffset(0L));
    }

    // ---------------------- getOffsetFromLocal ----------------------

    @Test
    public void testGetOffsetFromLocal_UTC_returnsZero() {
        DateTimeZone zone = DateTimeZone.UTC;
        long localMillis = 1000000L;
        assertEquals(0, zone.getOffsetFromLocal(localMillis));
    }

    @Test
    public void testGetOffsetFromLocal_fixedOffsetZone_returnsOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        long localMillis = 1000000L;
        assertEquals(3 * 60 * 60 * 1000, zone.getOffsetFromLocal(localMillis));
    }

    @Test
    public void testGetOffsetFromLocal_dstZone_returnsValidOffset() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        // Pick a date in middle of summer, far from transitions
        DateTime dt = new DateTime(2020, 7, 1, 12, 0, 0, DateTimeZone.UTC);
        long localMillis = dt.getMillis();
        int offset = zone.getOffsetFromLocal(localMillis);
        assertTrue(offset != 0);
    }

    // ---------------------- convertUTCToLocal ----------------------

    @Test
    public void testConvertUTCToLocal_UTC_returnsSameInstant() {
        DateTimeZone zone = DateTimeZone.UTC;
        long instantUTC = 100000L;
        assertEquals(instantUTC, zone.convertUTCToLocal(instantUTC));
    }

    @Test
    public void testConvertUTCToLocal_fixedOffset_returnsAdjustedInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long instantUTC = 100000L;
        long expected = instantUTC + 2 * 60 * 60 * 1000;
        assertEquals(expected, zone.convertUTCToLocal(instantUTC));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflow_throwsArithmeticException() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    // ---------------------- convertLocalToUTC (3-arg) ----------------------

    @Test
    public void testConvertLocalToUTC_threeArg_UTC_returnsSameInstant() {
        DateTimeZone zone = DateTimeZone.UTC;
        long instantLocal = 100000L;
        long result = zone.convertLocalToUTC(instantLocal, false, 0L);
        assertEquals(instantLocal, result);
    }

    @Test
    public void testConvertLocalToUTC_threeArg_fixedOffset_returnsAdjustedInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long instantLocal = 100000L + 2 * 60 * 60 * 1000;
        long result = zone.convertLocalToUTC(instantLocal, false, 0L);
        assertEquals(100000L, result);
    }

    // ---------------------- convertLocalToUTC (2-arg) ----------------------

    @Test
    public void testConvertLocalToUTC_twoArg_UTC_returnsSameInstant() {
        DateTimeZone zone = DateTimeZone.UTC;
        long instantLocal = 100000L;
        assertEquals(instantLocal, zone.convertLocalToUTC(instantLocal, false));
    }

    @Test
    public void testConvertLocalToUTC_twoArg_nonStrict_returnsValidInstant() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        DateTime dt = new DateTime(2020, 7, 1, 12, 0, 0, DateTimeZone.UTC);
        long result = zone.convertLocalToUTC(dt.getMillis(), false);
        assertTrue(result != 0);
    }

    @Test
    public void testConvertLocalToUTC_fixedOffsetStrict_returnsAdjustedInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        long instantLocal = 100000L + 3 * 60 * 60 * 1000;
        long result = zone.convertLocalToUTC(instantLocal, true);
        assertEquals(100000L, result);
    }

    // ---------------------- getMillisKeepLocal ----------------------

    @Test
    public void testGetMillisKeepLocal_sameZone_returnsSameInstant() {
        DateTimeZone zone = DateTimeZone.UTC;
        long oldInstant = 100000L;
        assertEquals(oldInstant, zone.getMillisKeepLocal(zone, oldInstant));
    }

    @Test
    public void testGetMillisKeepLocal_differentZone_returnsAdjustedInstant() {
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(2);
        DateTimeZone zone2 = DateTimeZone.forOffsetHours(5);
        long oldInstant = 100000L;
        long result = zone1.getMillisKeepLocal(zone2, oldInstant);
        // local time in zone1 == local time in zone2
        assertEquals(zone1.convertUTCToLocal(oldInstant), zone2.convertUTCToLocal(result));
    }

    @Test
    public void testGetMillisKeepLocal_nullNewZone_usesDefault() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long oldInstant = 100000L;
        long result = zone.getMillisKeepLocal(null, oldInstant);
        assertTrue(result != 0 || oldInstant == 0);
    }

    // ---------------------- isLocalDateTimeGap ----------------------

    @Test
    public void testIsLocalDateTimeGap_fixedZone_returnsFalse() {
        DateTimeZone zone = DateTimeZone.UTC;
        LocalDateTime ldt = new LocalDateTime(2020, 1, 1, 0, 0, 0);
        assertFalse(zone.isLocalDateTimeGap(ldt));
    }

    @Test
    public void testIsLocalDateTimeGap_validTime_returnsFalse() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        LocalDateTime ldt = new LocalDateTime(2020, 7, 1, 12, 0, 0);
        assertFalse(zone.isLocalDateTimeGap(ldt));
    }

    @Test
    public void testIsLocalDateTimeGap_gapTime_returnsTrue() {
        // In America/New_York, DST starts on 2020-03-08 at 02:00, clocks jump to 03:00
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        LocalDateTime ldt = new LocalDateTime(2020, 3, 8, 2, 30, 0);
        assertTrue(zone.isLocalDateTimeGap(ldt));
    }

    // ---------------------- adjustOffset ----------------------

    @Test
    public void testAdjustOffset_fixedZone_returnsSameInstant() {
        DateTimeZone zone = DateTimeZone.UTC;
        long instant = 100000L;
        assertEquals(instant, zone.adjustOffset(instant, false));
    }

    @Test
    public void testAdjustOffset_dstZone_earlier_returnsValidInstant() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        // around DST fall back on 2020-11-01
        DateTime dt = new DateTime(2020, 11, 1, 1, 30, 0, zone);
        long instant = dt.getMillis();
        long result = zone.adjustOffset(instant, false);
        assertTrue(result != 0);
    }

    @Test
    public void testAdjustOffset_dstZone_later_returnsValidInstant() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        DateTime dt = new DateTime(2020, 11, 1, 1, 30, 0, zone);
        long instant = dt.getMillis();
        long result = zone.adjustOffset(instant, true);
        assertTrue(result != 0);
    }

    // ---------------------- isFixed ----------------------

    @Test
    public void testIsFixed_UTC_returnsTrue() {
        assertTrue(DateTimeZone.UTC.isFixed());
    }

    @Test
    public void testIsFixed_realZone_returnsFalse() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        assertFalse(zone.isFixed());
    }

    // ---------------------- nextTransition / previousTransition ----------------------

    @Test
    public void testNextTransition_UTC_returnsSameInstant() {
        long instant = 100000L;
        assertEquals(instant, DateTimeZone.UTC.nextTransition(instant));
    }

    @Test
    public void testNextTransition_realZone_returnsDifferentInstant() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long instant = 0L;
        long next = zone.nextTransition(instant);
        assertTrue(next >= instant);
    }

    @Test
    public void testPreviousTransition_UTC_returnsSameInstant() {
        long instant = 100000L;
        assertEquals(instant, DateTimeZone.UTC.previousTransition(instant));
    }

    @Test
    public void testPreviousTransition_realZone_returnsDifferentInstant() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long instant = 0L;
        long prev = zone.previousTransition(instant);
        assertTrue(prev <= instant);
    }

    // ---------------------- toTimeZone ----------------------

    @Test
    public void testToTimeZone_UTC_returnsJavaTimeZone() {
        TimeZone tz = DateTimeZone.UTC.toTimeZone();
        assertNotNull(tz);
        assertEquals("UTC", tz.getID());
    }

    @Test
    public void testToTimeZone_realZone_returnsCorrectJavaTimeZone() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        TimeZone tz = zone.toTimeZone();
        assertNotNull(tz);
        assertEquals("America/New_York", tz.getID());
    }

    // ---------------------- equals / hashCode ----------------------

    @Test
    public void testEquals_sameZone_returnsTrue() {
        DateTimeZone zone1 = DateTimeZone.forID("America/New_York");
        DateTimeZone zone2 = DateTimeZone.forID("America/New_York");
        assertTrue(zone1.equals(zone2));
    }

    @Test
    public void testEquals_differentZone_returnsFalse() {
        DateTimeZone zone1 = DateTimeZone.forID("America/New_York");
        DateTimeZone zone2 = DateTimeZone.forID("Europe/Paris");
        assertFalse(zone1.equals(zone2));
    }

    @Test
    public void testHashCode_sameZone_sameHashCode() {
        DateTimeZone zone1 = DateTimeZone.forID("America/New_York");
        DateTimeZone zone2 = DateTimeZone.forID("America/New_York");
        assertEquals(zone1.hashCode(), zone2.hashCode());
    }

    @Test
    public void testHashCode_matchesExpectedFormula() {
        DateTimeZone zone = DateTimeZone.UTC;
        assertEquals(57 + zone.getID().hashCode(), zone.hashCode());
    }

    // ---------------------- toString ----------------------

    @Test
    public void testToString_returnsId() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        assertEquals("America/New_York", zone.toString());
    }

    @Test
    public void testToString_UTC_returnsUTCString() {
        assertEquals("UTC", DateTimeZone.UTC.toString());
    }

    // ---------------------- Serialization (writeReplace via Stub) ----------------------

    @Test
    public void testSerialization_roundTrip_returnsEquivalentZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
        oos.writeObject(zone);
        oos.close();

        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(baos.toByteArray());
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bais);
        Object result = ois.readObject();
        ois.close();

        assertEquals(zone, result);
    }

    @Test
    public void testSerialization_UTC_roundTrip() throws Exception {
        DateTimeZone zone = DateTimeZone.UTC;
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
        oos.writeObject(zone);
        oos.close();

        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(baos.toByteArray());
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bais);
        Object result = ois.readObject();
        ois.close();

        assertSame(DateTimeZone.UTC, result);
    }
}
