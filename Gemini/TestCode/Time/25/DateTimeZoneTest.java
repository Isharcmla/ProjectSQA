package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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

    @Test
    public void testGetDefault_returnsNonNullDefaultZone() {
        DateTimeZone zone = DateTimeZone.getDefault();
        assertNotNull(zone);
    }

    @Test
    public void testSetDefault_validZone_updatesDefault() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        DateTimeZone.setDefault(london);
        assertEquals(london, DateTimeZone.getDefault());

        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertEquals(DateTimeZone.UTC, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_nullZone_throwsIllegalArgumentException() {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void testForID_nullId_returnsDefault() {
        DateTimeZone def = DateTimeZone.getDefault();
        assertSame(def, DateTimeZone.forID(null));
    }

    @Test
    public void testForID_utcString_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_validZoneName_returnsCorrectZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        assertNotNull(zone);
        assertEquals("Europe/Paris", zone.getID());
    }

    @Test
    public void testForID_offsetZero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("-00:00"));
    }

    @Test
    public void testForID_fixedOffsets_returnsFixedZones() {
        DateTimeZone plusTwo = DateTimeZone.forID("+02:00");
        assertEquals("+02:00", plusTwo.getID());
        assertEquals(2 * 3600 * 1000, plusTwo.getOffset(0L));

        DateTimeZone minusFive = DateTimeZone.forID("-05:00");
        assertEquals("-05:00", minusFive.getID());
        assertEquals(-5 * 3600 * 1000, minusFive.getOffset(0L));

        DateTimeZone plusTwoCached = DateTimeZone.forID("+02:00");
        assertSame(plusTwo, plusTwoCached);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidID_throwsIllegalArgumentException() {
        DateTimeZone.forID("Invalid/NonExistent_Zone");
    }

    @Test
    public void testForOffsetHours_validValues() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        assertEquals("+03:00", zone.getID());
        assertEquals(3 * 3600 * 1000, zone.getOffset(0L));

        DateTimeZone zoneMinus = DateTimeZone.forOffsetHours(-8);
        assertEquals("-08:00", zoneMinus.getID());
        assertEquals(-8 * 3600 * 1000, zoneMinus.getOffset(0L));

        DateTimeZone zoneZero = DateTimeZone.forOffsetHours(0);
        assertSame(DateTimeZone.UTC, zoneZero);
    }

    @Test
    public void testForOffsetHoursMinutes_validValues() {
        DateTimeZone zoneZero = DateTimeZone.forOffsetHoursMinutes(0, 0);
        assertSame(DateTimeZone.UTC, zoneZero);

        DateTimeZone zonePlus = DateTimeZone.forOffsetHoursMinutes(5, 30);
        assertEquals("+05:30", zonePlus.getID());
        assertEquals(5 * 3600 * 1000 + 30 * 60 * 1000, zonePlus.getOffset(0L));

        DateTimeZone zoneMinus = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        assertEquals("-02:30", zoneMinus.getID());
        assertEquals(-(2 * 3600 * 1000 + 30 * 60 * 1000), zoneMinus.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_negativeMinutes_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(2, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesOver59_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(2, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_overflowHours_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_underflowHours_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MIN_VALUE, 0);
    }

    @Test
    public void testForOffsetMillis_allCases() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));

        DateTimeZone zone = DateTimeZone.forOffsetMillis(3600000);
        assertEquals("+01:00", zone.getID());
        assertEquals(3600000, zone.getOffset(0L));

        DateTimeZone zoneSec = DateTimeZone.forOffsetMillis(3661000);
        assertEquals("+01:01:01", zoneSec.getID());

        DateTimeZone zoneMilli = DateTimeZone.forOffsetMillis(3661123);
        assertEquals("+01:01:01.123", zoneMilli.getID());

        DateTimeZone zoneNegMilli = DateTimeZone.forOffsetMillis(-3661123);
        assertEquals("-01:01:01.123", zoneNegMilli.getID());
    }

    @Test
    public void testForTimeZone_nullInput_returnsDefault() {
        assertSame(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_utc_returnsUTC() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(tz));
    }

    @Test
    public void testForTimeZone_convertsOldAliases() {
        assertEquals("America/New_York", DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST")).getID());
        assertEquals("America/Los_Angeles", DateTimeZone.forTimeZone(TimeZone.getTimeZone("PST")).getID());
        assertEquals("Europe/London", DateTimeZone.forTimeZone(TimeZone.getTimeZone("WET")).getID());
        assertEquals("Europe/Paris", DateTimeZone.forTimeZone(TimeZone.getTimeZone("ECT")).getID());
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void testForTimeZone_customGmtOffset() {
        TimeZone tzPlus = TimeZone.getTimeZone("GMT+02:00");
        DateTimeZone dtzPlus = DateTimeZone.forTimeZone(tzPlus);
        assertEquals("+02:00", dtzPlus.getID());

        TimeZone tzMinus = TimeZone.getTimeZone("GMT-05:00");
        DateTimeZone dtzMinus = DateTimeZone.forTimeZone(tzMinus);
        assertEquals("-05:00", dtzMinus.getID());

        TimeZone tzZero = TimeZone.getTimeZone("GMT+00:00");
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(tzZero));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_unrecognisedId_throwsException() {
        TimeZone custom = new TimeZone() {
            @Override
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
                return 0;
            }

            @Override
            public void setRawOffset(int offsetMillis) {}

            @Override
            public int getRawOffset() {
                return 0;
            }

            @Override
            public boolean useDaylightTime() {
                return false;
            }

            @Override
            public boolean inDaylightTime(java.util.Date date) {
                return false;
            }

            @Override
            public String getID() {
                return "Unknown_Zone_ID_XYZ";
            }

            @Override
            public String getDisplayName() {
                return "Unknown_Zone_ID_XYZ";
            }
        };
        DateTimeZone.forTimeZone(custom);
    }

    @Test
    public void testGetAvailableIDs_notNullAndContainsUTC() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.contains("UTC"));
        assertTrue(ids.contains("Europe/London"));
    }

    @Test
    public void testSetProvider_nullResetsToDefaultProvider() {
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test
    public void testSetProvider_customValidProvider() {
        Provider custom = new UTCProvider();
        DateTimeZone.setProvider(custom);
        assertSame(custom, DateTimeZone.getProvider());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_providerWithoutAvailableIds_throwsException() {
        Provider invalid = new Provider() {
            public DateTimeZone getZone(String id) {
                return null;
            }

            public Set<String> getAvailableIDs() {
                return Collections.emptySet();
            }
        };
        DateTimeZone.setProvider(invalid);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_providerMissingUTC_throwsException() {
        final Set<String> set = new HashSet<String>();
        set.add("America/New_York");
        Provider invalid = new Provider() {
            public DateTimeZone getZone(String id) {
                return null;
            }

            public Set<String> getAvailableIDs() {
                return set;
            }
        };
        DateTimeZone.setProvider(invalid);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_providerInvalidUTCZone_throwsException() {
        final Set<String> set = new HashSet<String>();
        set.add("UTC");
        Provider invalid = new Provider() {
            public DateTimeZone getZone(String id) {
                return DateTimeZone.forOffsetHours(1);
            }

            public Set<String> getAvailableIDs() {
                return set;
            }
        };
        DateTimeZone.setProvider(invalid);
    }

    @Test
    public void testSetNameProvider_nullResetsToDefault() {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testSetNameProvider_customProvider() {
        NameProvider custom = new DefaultNameProvider();
        DateTimeZone.setNameProvider(custom);
        assertSame(custom, DateTimeZone.getNameProvider());
    }

    @Test
    public void testNames_getShortNameAndGetName() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long instantWinter = 0L; // 1970-01-01 (winter in London, GMT)
        long instantSummer = 1577836800000L + (180L * 86400000L); // Summer

        assertNotNull(zone.getName(instantWinter));
        assertNotNull(zone.getName(instantWinter, Locale.UK));
        assertNotNull(zone.getName(instantWinter, null));
        assertNotNull(zone.getShortName(instantWinter));
        assertNotNull(zone.getShortName(instantWinter, Locale.UK));
        assertNotNull(zone.getShortName(instantWinter, null));

        DateTimeZone fixed = DateTimeZone.forOffsetHours(5);
        assertEquals("+05:00", fixed.getName(0L));
        assertEquals("+05:00", fixed.getShortName(0L));

        DateTimeZone nullKeyZone = new DateTimeZone("TestNullKey") {
            @Override
            public String getNameKey(long instant) {
                return null;
            }

            @Override
            public int getOffset(long instant) {
                return 0;
            }

            @Override
            public int getStandardOffset(long instant) {
                return 0;
            }

            @Override
            public boolean isFixed() {
                return true;
            }

            @Override
            public long nextTransition(long instant) {
                return instant;
            }

            @Override
            public long previousTransition(long instant) {
                return instant;
            }

            @Override
            public boolean equals(Object object) {
                return object instanceof DateTimeZone && ((DateTimeZone) object).getID().equals(getID());
            }
        };
        assertEquals("TestNullKey", nullKeyZone.getName(0L));
        assertEquals("TestNullKey", nullKeyZone.getShortName(0L));
    }

    @Test
    public void testGetOffset_ReadableInstant() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        Instant instant = new Instant(0L);
        assertEquals(zone.getOffset(0L), zone.getOffset(instant));
        assertEquals(zone.getOffset(DateTimeUtils.currentTimeMillis()), zone.getOffset((ReadableInstant) null));
    }

    @Test
    public void testIsStandardOffset() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        long winter = 0L; // 1970-01-01 GMT
        long summer = 15000000L * 1000L; // ~1970 summer BST

        assertTrue(london.isStandardOffset(winter));
        assertFalse(london.isStandardOffset(summer));

        assertTrue(DateTimeZone.UTC.isStandardOffset(0L));
    }

    @Test
    public void testGetOffsetFromLocal() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        // Regular winter time
        long winterLocal = new DateTime(2007, 1, 1, 12, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(-5 * 3600 * 1000, ny.getOffsetFromLocal(winterLocal));

        // DST spring gap in New York (2007-03-11 from 02:00 to 03:00)
        long gapLocal = new DateTime(2007, 3, 11, 2, 30, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(-5 * 3600 * 1000, ny.getOffsetFromLocal(gapLocal));

        // DST autumn overlap in New York (2007-11-04 from 01:00 to 02:00)
        long overlapLocal = new DateTime(2007, 11, 4, 1, 30, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(-4 * 3600 * 1000, ny.getOffsetFromLocal(overlapLocal));

        DateTimeZone fixed = DateTimeZone.forOffsetHours(3);
        assertEquals(3 * 3600 * 1000, fixed.getOffsetFromLocal(0L));
    }

    @Test
    public void testConvertUTCToLocal_normalAndOverflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(1000L + 2 * 3600 * 1000L, zone.convertUTCToLocal(1000L));

        try {
            zone.convertUTCToLocal(Long.MAX_VALUE - 100);
            fail("Should throw ArithmeticException on positive overflow");
        } catch (ArithmeticException expected) {}

        DateTimeZone negZone = DateTimeZone.forOffsetHours(-5);
        try {
            negZone.convertUTCToLocal(Long.MIN_VALUE + 100);
            fail("Should throw ArithmeticException on negative overflow");
        } catch (ArithmeticException expected) {}
    }

    @Test
    public void testConvertLocalToUTC_strictAndNonStrict() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(1000L - 2 * 3600 * 1000L, zone.convertLocalToUTC(1000L, true));
        assertEquals(1000L - 2 * 3600 * 1000L, zone.convertLocalToUTC(1000L, false));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        // Spring forward gap: 2007-03-11 02:30 does not exist
        long gapLocal = new DateTime(2007, 3, 11, 2, 30, 0, 0, DateTimeZone.UTC).getMillis();
        try {
            ny.convertLocalToUTC(gapLocal, true);
            fail("Strict convertLocalToUTC in DST gap should throw IllegalArgumentException");
        } catch (IllegalArgumentException expected) {}

        long nonStrictUTC = ny.convertLocalToUTC(gapLocal, false);
        assertEquals(gapLocal - (-5 * 3600 * 1000), nonStrictUTC);

        // Test 3-argument convertLocalToUTC
        long normalLocal = new DateTime(2007, 1, 1, 12, 0, 0, 0, DateTimeZone.UTC).getMillis();
        long originalUTC = normalLocal - (-5 * 3600 * 1000);
        assertEquals(originalUTC, ny.convertLocalToUTC(normalLocal, true, originalUTC));
    }

    @Test
    public void testConvertLocalToUTC_overflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-2);
        try {
            zone.convertLocalToUTC(Long.MAX_VALUE - 10, true);
            fail("Should throw ArithmeticException on overflow");
        } catch (ArithmeticException expected) {}

        DateTimeZone posZone = DateTimeZone.forOffsetHours(5);
        try {
            posZone.convertLocalToUTC(Long.MIN_VALUE + 10, true);
            fail("Should throw ArithmeticException on underflow");
        } catch (ArithmeticException expected) {}
    }

    @Test
    public void testGetMillisKeepLocal() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");

        assertEquals(1000L, london.getMillisKeepLocal(london, 1000L));

        DateTimeZone original = DateTimeZone.getDefault();
        DateTimeZone.setDefault(paris);
        try {
            long result = london.getMillisKeepLocal(null, 1000L);
            assertEquals(london.getMillisKeepLocal(paris, 1000L), result);
        } finally {
            DateTimeZone.setDefault(original);
        }

        long utcMillis = 0L; // 1970-01-01 00:00:00 UTC
        long inParis = london.getMillisKeepLocal(paris, utcMillis);
        assertEquals(-3600000L, inParis);
    }

    @Test
    public void testIsLocalDateTimeGap() {
        DateTimeZone fixed = DateTimeZone.forOffsetHours(1);
        assertFalse(fixed.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 2, 30)));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        assertTrue(ny.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 2, 30)));
        assertFalse(ny.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 1, 30)));
        assertFalse(ny.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 3, 30)));
    }

    @Test
    public void testIsFixed_nextPreviousTransition() {
        assertTrue(DateTimeZone.UTC.isFixed());
        assertEquals(1000L, DateTimeZone.UTC.nextTransition(1000L));
        assertEquals(1000L, DateTimeZone.UTC.previousTransition(1000L));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        assertFalse(ny.isFixed());
        long now = 0L;
        long next = ny.nextTransition(now);
        long prev = ny.previousTransition(now);
        assertTrue(next > now);
        assertTrue(prev < now);
    }

    @Test
    public void testToTimeZone_hashCode_equals_toString() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        TimeZone tz = zone.toTimeZone();
        assertEquals("Europe/London", tz.getID());

        assertEquals("Europe/London", zone.toString());
        assertEquals(57 + "Europe/London".hashCode(), zone.hashCode());

        assertTrue(zone.equals(zone));
        assertTrue(zone.equals(DateTimeZone.forID("Europe/London")));
        assertFalse(zone.equals(DateTimeZone.UTC));
        assertFalse(zone.equals("NotADateTimeZone"));
        assertFalse(zone.equals(null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProtectedConstructor_nullId_throwsException() {
        new DateTimeZone(null) {
            @Override
            public String getNameKey(long instant) {
                return null;
            }

            @Override
            public int getOffset(long instant) {
                return 0;
            }

            @Override
            public int getStandardOffset(long instant) {
                return 0;
            }

            @Override
            public boolean isFixed() {
                return true;
            }

            @Override
            public long nextTransition(long instant) {
                return 0;
            }

            @Override
            public long previousTransition(long instant) {
                return 0;
            }

            @Override
            public boolean equals(Object object) {
                return false;
            }
        };
    }

    @Test
    public void testSerialization_roundTrip() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(zone);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        assertSame(zone, deserialized);

        ByteArrayOutputStream baosUtc = new ByteArrayOutputStream();
        ObjectOutputStream oosUtc = new ObjectOutputStream(baosUtc);
        oosUtc.writeObject(DateTimeZone.UTC);
        oosUtc.close();

        ByteArrayInputStream baisUtc = new ByteArrayInputStream(baosUtc.toByteArray());
        ObjectInputStream oisUtc = new ObjectInputStream(baisUtc);
        Object deserializedUtc = oisUtc.readObject();
        oisUtc.close();

        assertSame(DateTimeZone.UTC, deserializedUtc);
    }
}
