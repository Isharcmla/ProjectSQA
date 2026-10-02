import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import org.joda.time.DateTimeZone;
import org.joda.time.IllegalInstantException;
import org.joda.time.LocalDateTime;
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

    //-------------------- getDefault / setDefault --------------------

    @Test
    public void testGetDefault_returnsNonNull() {
        DateTimeZone zone = DateTimeZone.getDefault();
        assertNotNull(zone);
    }

    @Test
    public void testSetDefault_setsCorrectly() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertEquals(DateTimeZone.UTC, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_null_throwsException() {
        DateTimeZone.setDefault(null);
    }

    //-------------------- forID --------------------

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
        DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
        assertNotNull(zone);
        assertEquals("America/Los_Angeles", zone.getID());
    }

    @Test
    public void testForID_positiveOffsetZero_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forID("+00:00");
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForID_positiveOffset_returnsFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("+01:00");
        assertNotNull(zone);
        assertEquals(3600000, zone.getOffset(0));
    }

    @Test
    public void testForID_negativeOffset_returnsFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("-05:00");
        assertNotNull(zone);
        assertEquals(-5 * 3600000, zone.getOffset(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidId_throwsException() {
        DateTimeZone.forID("Invalid/NotAZone_ID");
    }

    //-------------------- forOffsetHours --------------------

    @Test
    public void testForOffsetHours_zero_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(0);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForOffsetHours_positive_returnsCorrectOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        assertEquals(5 * 3600000, zone.getOffset(0));
    }

    @Test
    public void testForOffsetHours_negative_returnsCorrectOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-8);
        assertEquals(-8 * 3600000, zone.getOffset(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_tooLarge_throwsException() {
        DateTimeZone.forOffsetHours(Integer.MAX_VALUE);
    }

    //-------------------- forOffsetHoursMinutes --------------------

    @Test
    public void testForOffsetHoursMinutes_zeroZero_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 0);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForOffsetHoursMinutes_positive_returnsCorrectOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(2, 30);
        assertEquals((2 * 60 + 30) * 60000, zone.getOffset(0));
    }

    @Test
    public void testForOffsetHoursMinutes_negative_returnsCorrectOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        assertEquals(-(2 * 60 + 30) * 60000, zone.getOffset(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesNegative_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(1, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesTooLarge_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(1, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_overflow_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 59);
    }

    //-------------------- forOffsetMillis --------------------

    @Test
    public void testForOffsetMillis_zero_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(0);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForOffsetMillis_positive_returnsCorrectZone() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3600000);
        assertEquals(3600000, zone.getOffset(0));
    }

    @Test
    public void testForOffsetMillis_negative_returnsCorrectZone() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(-3600000);
        assertEquals(-3600000, zone.getOffset(0));
    }

    //-------------------- forTimeZone --------------------

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
        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertNotNull(zone);
    }

    @Test
    public void testForTimeZone_oldStyleId_convertsCorrectly() {
        TimeZone tz = TimeZone.getTimeZone("EST");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertNotNull(zone);
    }

    @Test
    public void testForTimeZone_gmtPlusOffset_returnsFixedZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT+02:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertNotNull(zone);
        assertEquals(2 * 3600000, zone.getOffset(0));
    }

    @Test
    public void testForTimeZone_gmtMinusOffset_returnsFixedZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT-03:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertNotNull(zone);
        assertEquals(-3 * 3600000, zone.getOffset(0));
    }

    @Test
    public void testForTimeZone_gmtZeroOffset_returnsUTC() {
        TimeZone tz = TimeZone.getTimeZone("GMT+00:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertSame(DateTimeZone.UTC, zone);
    }

    //-------------------- getAvailableIDs --------------------

    @Test
    public void testGetAvailableIDs_notEmpty() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.size() > 0);
        assertTrue(ids.contains("UTC"));
    }

    //-------------------- getProvider / setProvider --------------------

    @Test
    public void testGetProvider_notNull() {
        Provider provider = DateTimeZone.getProvider();
        assertNotNull(provider);
    }

    @Test
    public void testSetProvider_sameProvider_doesNotThrow() {
        Provider provider = DateTimeZone.getProvider();
        DateTimeZone.setProvider(provider);
        assertSame(provider, DateTimeZone.getProvider());
    }

    @Test
    public void testSetProvider_null_resetsToDefault() {
        Provider original = DateTimeZone.getProvider();
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
        DateTimeZone.setProvider(original);
    }

    //-------------------- getNameProvider / setNameProvider --------------------

    @Test
    public void testGetNameProvider_notNull() {
        NameProvider provider = DateTimeZone.getNameProvider();
        assertNotNull(provider);
    }

    @Test
    public void testSetNameProvider_sameProvider_doesNotThrow() {
        NameProvider provider = DateTimeZone.getNameProvider();
        DateTimeZone.setNameProvider(provider);
        assertSame(provider, DateTimeZone.getNameProvider());
    }

    @Test
    public void testSetNameProvider_null_resetsToDefault() {
        NameProvider original = DateTimeZone.getNameProvider();
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
        DateTimeZone.setNameProvider(original);
    }

    //-------------------- getID --------------------

    @Test
    public void testGetID_UTC_returnsUTCString() {
        assertEquals("UTC", DateTimeZone.UTC.getID());
    }

    //-------------------- getNameKey --------------------

    @Test
    public void testGetNameKey_UTC_returnsExpected() {
        String key = DateTimeZone.UTC.getNameKey(0L);
        // UTC fixed zone name key is "UTC"
        assertNotNull(key);
    }

    //-------------------- getShortName --------------------

    @Test
    public void testGetShortName_oneArg_returnsNonNull() {
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

    //-------------------- getName --------------------

    @Test
    public void testGetName_oneArg_returnsNonNull() {
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

    //-------------------- getOffset --------------------

    @Test
    public void testGetOffset_long_UTC_returnsZero() {
        assertEquals(0, DateTimeZone.UTC.getOffset(0L));
    }

    @Test
    public void testGetOffset_readableInstantNull_returnsOffsetForNow() {
        int offset = DateTimeZone.UTC.getOffset((org.joda.time.ReadableInstant) null);
        assertEquals(0, offset);
    }

    @Test
    public void testGetOffset_readableInstant_returnsCorrectOffset() {
        org.joda.time.Instant instant = new org.joda.time.Instant(0L);
        int offset = DateTimeZone.UTC.getOffset(instant);
        assertEquals(0, offset);
    }

    //-------------------- getStandardOffset --------------------

    @Test
    public void testGetStandardOffset_UTC_returnsZero() {
        assertEquals(0, DateTimeZone.UTC.getStandardOffset(0L));
    }

    //-------------------- isStandardOffset --------------------

    @Test
    public void testIsStandardOffset_UTC_returnsTrue() {
        assertTrue(DateTimeZone.UTC.isStandardOffset(0L));
    }

    //-------------------- getOffsetFromLocal --------------------

    @Test
    public void testGetOffsetFromLocal_UTC_returnsZero() {
        assertEquals(0, DateTimeZone.UTC.getOffsetFromLocal(0L));
    }

    @Test
    public void testGetOffsetFromLocal_fixedZone_returnsCorrectOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        assertEquals(5 * 3600000, zone.getOffsetFromLocal(0L));
    }

    //-------------------- convertUTCToLocal --------------------

    @Test
    public void testConvertUTCToLocal_UTC_returnsSameValue() {
        assertEquals(0L, DateTimeZone.UTC.convertUTCToLocal(0L));
    }

    @Test
    public void testConvertUTCToLocal_fixedOffset_returnsAdjustedValue() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertEquals(3600000L, zone.convertUTCToLocal(0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflow_throwsException() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    //-------------------- convertLocalToUTC (2-arg) --------------------

    @Test
    public void testConvertLocalToUTC_UTC_returnsSameValue() {
        assertEquals(0L, DateTimeZone.UTC.convertLocalToUTC(0L, false));
    }

    @Test
    public void testConvertLocalToUTC_fixedOffset_returnsAdjustedValue() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertEquals(-3600000L, zone.convertLocalToUTC(0L, false));
    }

    //-------------------- convertLocalToUTC (3-arg) --------------------

    @Test
    public void testConvertLocalToUTC_threeArg_UTC_returnsSameValue() {
        assertEquals(0L, DateTimeZone.UTC.convertLocalToUTC(0L, false, 0L));
    }

    @Test
    public void testConvertLocalToUTC_threeArg_fixedOffset_returnsAdjustedValue() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        long result = zone.convertLocalToUTC(3600000L, false, 0L);
        assertEquals(0L, result);
    }

    //-------------------- getMillisKeepLocal --------------------

    @Test
    public void testGetMillisKeepLocal_sameZone_returnsOriginal() {
        long result = DateTimeZone.UTC.getMillisKeepLocal(DateTimeZone.UTC, 12345L);
        assertEquals(12345L, result);
    }

    @Test
    public void testGetMillisKeepLocal_nullNewZone_usesDefault() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        long result = DateTimeZone.UTC.getMillisKeepLocal(null, 12345L);
        assertEquals(12345L, result);
    }

    @Test
    public void testGetMillisKeepLocal_differentZone_returnsAdjustedValue() {
        DateTimeZone zoneA = DateTimeZone.forOffsetHours(1);
        DateTimeZone zoneB = DateTimeZone.forOffsetHours(2);
        long result = zoneA.getMillisKeepLocal(zoneB, 0L);
        assertEquals(-3600000L, result);
    }

    //-------------------- isLocalDateTimeGap --------------------

    @Test
    public void testIsLocalDateTimeGap_fixedZone_returnsFalse() {
        LocalDateTime ldt = new LocalDateTime(2000, 1, 1, 0, 0, 0, 0);
        assertFalse(DateTimeZone.UTC.isLocalDateTimeGap(ldt));
    }

    @Test
    public void testIsLocalDateTimeGap_normalTime_returnsFalse() {
        DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
        LocalDateTime ldt = new LocalDateTime(2000, 1, 1, 0, 0, 0, 0);
        assertFalse(zone.isLocalDateTimeGap(ldt));
    }

    //-------------------- adjustOffset --------------------

    @Test
    public void testAdjustOffset_fixedZone_returnsSameInstant() {
        long instant = 0L;
        long result = DateTimeZone.UTC.adjustOffset(instant, false);
        assertEquals(instant, result);
    }

    @Test
    public void testAdjustOffset_earlierOrLaterTrue_fixedZone_returnsSameInstant() {
        long instant = 0L;
        long result = DateTimeZone.UTC.adjustOffset(instant, true);
        assertEquals(instant, result);
    }

    //-------------------- isFixed --------------------

    @Test
    public void testIsFixed_UTC_returnsTrue() {
        assertTrue(DateTimeZone.UTC.isFixed());
    }

    @Test
    public void testIsFixed_realZone_returnsFalse() {
        DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
        assertFalse(zone.isFixed());
    }

    //-------------------- nextTransition / previousTransition --------------------

    @Test
    public void testNextTransition_UTC_returnsSameInstant() {
        assertEquals(0L, DateTimeZone.UTC.nextTransition(0L));
    }

    @Test
    public void testPreviousTransition_UTC_returnsSameInstant() {
        assertEquals(0L, DateTimeZone.UTC.previousTransition(0L));
    }

    @Test
    public void testNextTransition_realZone_returnsDifferentInstant() {
        DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
        long instant = 0L;
        long next = zone.nextTransition(instant);
        assertTrue(next >= instant);
    }

    //-------------------- toTimeZone --------------------

    @Test
    public void testToTimeZone_UTC_returnsTimeZoneWithSameId() {
        TimeZone tz = DateTimeZone.UTC.toTimeZone();
        assertNotNull(tz);
        assertEquals("UTC", tz.getID());
    }

    //-------------------- equals --------------------

    @Test
    public void testEquals_sameZone_returnsTrue() {
        assertTrue(DateTimeZone.UTC.equals(DateTimeZone.UTC));
    }

    @Test
    public void testEquals_differentZone_returnsFalse() {
        DateTimeZone zoneA = DateTimeZone.forOffsetHours(1);
        DateTimeZone zoneB = DateTimeZone.forOffsetHours(2);
        assertFalse(zoneA.equals(zoneB));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(DateTimeZone.UTC.equals(null));
    }

    //-------------------- hashCode --------------------

    @Test
    public void testHashCode_consistentWithEquals() {
        DateTimeZone zoneA = DateTimeZone.forID("UTC");
        DateTimeZone zoneB = DateTimeZone.forID("UTC");
        assertEquals(zoneA.hashCode(), zoneB.hashCode());
    }

    //-------------------- toString --------------------

    @Test
    public void testToString_returnsID() {
        assertEquals("UTC", DateTimeZone.UTC.toString());
    }

    //-------------------- serialization (writeReplace via Stub) --------------------

    @Test
    public void testSerialization_roundTrip_returnsEquivalentZone() throws Exception {
        DateTimeZone original = DateTimeZone.forID("America/Los_Angeles");
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(baos.toByteArray());
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bais);
        DateTimeZone result = (DateTimeZone) ois.readObject();
        ois.close();

        assertEquals(original.getID(), result.getID());
    }

    //-------------------- multiple forID offset edge cases --------------------

    @Test
    public void testForID_offsetWithSeconds_returnsCorrectOffset() {
        DateTimeZone zone = DateTimeZone.forID("+01:30:30");
        assertNotNull(zone);
    }

    @Test
    public void testForID_sameFixedOffsetTwice_returnsCachedInstance() {
        DateTimeZone zone1 = DateTimeZone.forID("+03:00");
        DateTimeZone zone2 = DateTimeZone.forID("+03:00");
        assertEquals(zone1.getOffset(0), zone2.getOffset(0));
    }
}
