package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateTimeZoneTest {

    private DateTimeZone originalDefault;
    private Provider originalProvider;
    private NameProvider originalNameProvider;
    private Locale originalLocale;

    @Before
    public void setUp() {
        originalDefault = DateTimeZone.getDefault();
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
        originalLocale = Locale.getDefault();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefault);
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
        Locale.setDefault(originalLocale);
    }

    // -----------------------------------------------------------------------
    // Default TimeZone tests
    // -----------------------------------------------------------------------

    @Test
    public void testGetDefault_notNull() {
        DateTimeZone zone = DateTimeZone.getDefault();
        Assert.assertNotNull(zone);
    }

    @Test
    public void testSetDefault_validZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        DateTimeZone.setDefault(zone);
        Assert.assertEquals(zone, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_nullZone_throwsException() {
        DateTimeZone.setDefault(null);
    }

    // -----------------------------------------------------------------------
    // forID factory tests
    // -----------------------------------------------------------------------

    @Test
    public void testForID_null_returnsDefault() {
        Assert.assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTC() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_validProviderZone() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        Assert.assertNotNull(zone);
        Assert.assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void testForID_offsetZero_returnsUTC() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forID("-00:00"));
    }

    @Test
    public void testForID_positiveOffset() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        Assert.assertEquals("+02:00", zone.getID());
        Assert.assertEquals(2 * 3600000, zone.getOffset(0L));
    }

    @Test
    public void testForID_negativeOffset() {
        DateTimeZone zone = DateTimeZone.forID("-05:00");
        Assert.assertEquals("-05:00", zone.getID());
        Assert.assertEquals(-5 * 3600000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidFormat_throwsException() {
        DateTimeZone.forID("Invalid/Zone_ID_Not_Existing");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidOffsetFormat_throwsException() {
        DateTimeZone.forID("+25:00");
    }

    // -----------------------------------------------------------------------
    // forOffsetHours / forOffsetHoursMinutes / forOffsetMillis tests
    // -----------------------------------------------------------------------

    @Test
    public void testForOffsetHours_zero_returnsUTC() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHours_positive() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        Assert.assertEquals("+03:00", zone.getID());
        Assert.assertEquals(3 * 3600000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHours_negative() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-4);
        Assert.assertEquals("-04:00", zone.getID());
        Assert.assertEquals(-4 * 3600000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_zero_returnsUTC() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_positiveHoursAndMinutes() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(5, 30);
        Assert.assertEquals("+05:30", zone.getID());
        Assert.assertEquals((5 * 60 + 30) * 60000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_negativeHoursPositiveMinutes() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        Assert.assertEquals("-02:30", zone.getID());
        Assert.assertEquals(-(2 * 60 + 30) * 60000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_zeroHoursPositiveMinutes() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 45);
        Assert.assertEquals("+00:45", zone.getID());
        Assert.assertEquals(45 * 60000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesTooLow_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesTooHigh_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(1, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_largeHours_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 0);
    }

    @Test
    public void testForOffsetMillis_zero_returnsUTC() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_positive() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3600000);
        Assert.assertEquals("+01:00", zone.getID());
        Assert.assertEquals(3600000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetMillis_withSecondsAndFraction() {
        int millis = (1 * 3600 + 23 * 60 + 45) * 1000 + 678;
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);
        Assert.assertEquals("+01:23:45.678", zone.getID());

        DateTimeZone zoneNeg = DateTimeZone.forOffsetMillis(-millis);
        Assert.assertEquals("-01:23:45.678", zoneNeg.getID());
    }

    @Test
    public void testForOffsetMillis_caching() {
        DateTimeZone zone1 = DateTimeZone.forOffsetMillis(7200000);
        DateTimeZone zone2 = DateTimeZone.forOffsetMillis(7200000);
        Assert.assertSame(zone1, zone2);
    }

    // -----------------------------------------------------------------------
    // forTimeZone tests
    // -----------------------------------------------------------------------

    @Test
    public void testForTimeZone_null_returnsDefault() {
        Assert.assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testForTimeZone_convertedAliases() {
        Assert.assertEquals("America/Chicago", DateTimeZone.forTimeZone(TimeZone.getTimeZone("CST")).getID());
        Assert.assertEquals("America/New_York", DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST")).getID());
        Assert.assertEquals("America/Los_Angeles", DateTimeZone.forTimeZone(TimeZone.getTimeZone("PST")).getID());
        Assert.assertEquals("America/Denver", DateTimeZone.forTimeZone(TimeZone.getTimeZone("MST")).getID());
        Assert.assertEquals("Pacific/Honolulu", DateTimeZone.forTimeZone(TimeZone.getTimeZone("HST")).getID());
        Assert.assertEquals("Europe/Paris", DateTimeZone.forTimeZone(TimeZone.getTimeZone("CET")).getID());
        Assert.assertEquals("UTC", DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT")).getID());
    }

    @Test
    public void testForTimeZone_customGMT() {
        TimeZone tz = TimeZone.getTimeZone("GMT+03:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        Assert.assertEquals("+03:00", zone.getID());

        TimeZone tzZero = TimeZone.getTimeZone("GMT+00:00");
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(tzZero));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_unrecognised_throwsException() {
        TimeZone tz = new TimeZone() {
            private static final long serialVersionUID = 1L;
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
                return "NonExistentID_XYZ";
            }
            @Override
            public String getDisplayName() {
                return "NonExistentDisplayName_XYZ";
            }
        };
        DateTimeZone.forTimeZone(tz);
    }

    // -----------------------------------------------------------------------
    // Provider & NameProvider tests
    // -----------------------------------------------------------------------

    @Test
    public void testGetAvailableIDs() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        Assert.assertNotNull(ids);
        Assert.assertTrue(ids.contains("UTC"));
        Assert.assertTrue(ids.contains("America/New_York"));
    }

    @Test
    public void testSetProvider_nullRestoresDefault() {
        DateTimeZone.setProvider(null);
        Assert.assertNotNull(DateTimeZone.getProvider());
    }

    @Test
    public void testSetProvider_customValid() {
        Provider customProvider = new UTCProvider();
        DateTimeZone.setProvider(customProvider);
        Assert.assertSame(customProvider, DateTimeZone.getProvider());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_emptyIDs_throwsException() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) {
                return null;
            }
            public Set<String> getAvailableIDs() {
                return Collections.emptySet();
            }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_noUTC_throwsException() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) {
                return null;
            }
            public Set<String> getAvailableIDs() {
                Set<String> set = new HashSet<String>();
                set.add("America/New_York");
                return set;
            }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_invalidUTC_throwsException() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) {
                if ("UTC".equals(id)) {
                    return new FixedDateTimeZone("UTC", "UTC", 3600, 3600);
                }
                return null;
            }
            public Set<String> getAvailableIDs() {
                Set<String> set = new HashSet<String>();
                set.add("UTC");
                return set;
            }
        });
    }

    @Test
    public void testSetNameProvider_nullRestoresDefault() {
        DateTimeZone.setNameProvider(null);
        Assert.assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testSetNameProvider_custom() {
        NameProvider custom = new DefaultNameProvider();
        DateTimeZone.setNameProvider(custom);
        Assert.assertSame(custom, DateTimeZone.getNameProvider());
    }

    // -----------------------------------------------------------------------
    // Instance methods: Name, ShortName, Offsets, Transitions
    // -----------------------------------------------------------------------

    @Test
    public void testGetShortName_and_GetName() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long instant = 0L; // 1970-01-01T00:00:00Z (Winter, EST)

        String shortName = zone.getShortName(instant);
        String shortNameFr = zone.getShortName(instant, Locale.FRENCH);
        String longName = zone.getName(instant);
        String longNameFr = zone.getName(instant, Locale.FRENCH);

        Assert.assertNotNull(shortName);
        Assert.assertNotNull(shortNameFr);
        Assert.assertNotNull(longName);
        Assert.assertNotNull(longNameFr);

        DateTimeZone fixedZone = DateTimeZone.forOffsetHours(3);
        Assert.assertEquals("+03:00", fixedZone.getName(instant));
        Assert.assertEquals("+03:00", fixedZone.getShortName(instant));
    }

    @Test
    public void testGetOffset_ReadableInstant() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        int offsetNow = zone.getOffset((ReadableInstant) null);
        Assert.assertTrue(offsetNow == -4 * 3600000 || offsetNow == -5 * 3600000);

        Instant instant = new Instant(0L);
        Assert.assertEquals(-5 * 3600000, zone.getOffset(instant));
    }

    @Test
    public void testIsStandardOffset() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        // Winter: Jan 1 1970
        Assert.assertTrue(zone.isStandardOffset(0L));
        // Summer: July 1 1970 (EDT)
        long summer = 180L * 24 * 3600 * 1000;
        Assert.assertFalse(zone.isStandardOffset(summer));
    }

    @Test
    public void testGetOffsetFromLocal_normalAndBoundary() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        // Winter time
        Assert.assertEquals(-5 * 3600000, zone.getOffsetFromLocal(0L));
        // Summer time
        long summerLocal = 180L * 24 * 3600 * 1000;
        Assert.assertEquals(-4 * 3600000, zone.getOffsetFromLocal(summerLocal));

        // Fixed zone
        DateTimeZone fixed = DateTimeZone.forOffsetHours(2);
        Assert.assertEquals(2 * 3600000, fixed.getOffsetFromLocal(0L));
    }

    @Test
    public void testConvertUTCToLocal() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        Assert.assertEquals(7200000L, zone.convertUTCToLocal(0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    @Test
    public void testConvertLocalToUTC_strictAndNonStrict() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        // Standard instant
        long utc = zone.convertLocalToUTC(0L, false);
        Assert.assertEquals(5 * 3600000L, utc);

        // Gap in New York: 2007-03-11 02:30:00 EST -> 03:30:00 EDT
        // 2007-03-11 02:30:00 local millis
        long gapLocal = 1173580200000L;
        long nonStrictUTC = zone.convertLocalToUTC(gapLocal, false);
        Assert.assertNotNull(nonStrictUTC);

        try {
            zone.convertLocalToUTC(gapLocal, true);
            Assert.fail("Expected IllegalArgumentException for DST gap");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_overflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-2);
        zone.convertLocalToUTC(Long.MAX_VALUE, false);
    }

    @Test
    public void testConvertLocalToUTC_withOriginalInstant() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long result = zone.convertLocalToUTC(0L, false, 0L);
        Assert.assertEquals(5 * 3600000L, result);
    }

    @Test
    public void testGetMillisKeepLocal() {
        DateTimeZone zoneNY = DateTimeZone.forID("America/New_York");
        DateTimeZone zoneLon = DateTimeZone.forID("Europe/London");

        long instant = 0L;
        long resultLon = zoneNY.getMillisKeepLocal(zoneLon, instant);
        Assert.assertEquals(zoneNY.convertUTCToLocal(instant), zoneLon.convertUTCToLocal(resultLon));

        // null newZone defaults to default zone
        long resultDefault = zoneNY.getMillisKeepLocal(null, instant);
        Assert.assertEquals(zoneNY.convertUTCToLocal(instant), DateTimeZone.getDefault().convertUTCToLocal(resultDefault));

        // same zone
        Assert.assertEquals(instant, zoneNY.getMillisKeepLocal(zoneNY, instant));
    }

    @Test
    public void testIsLocalDateTimeGap() {
        DateTimeZone zoneNY = DateTimeZone.forID("America/New_York");
        // 2007-03-11 02:30:00 is in DST gap
        LocalDateTime gapTime = new LocalDateTime(2007, 3, 11, 2, 30, 0, 0);
        Assert.assertTrue(zoneNY.isLocalDateTimeGap(gapTime));

        LocalDateTime validTime = new LocalDateTime(2007, 3, 11, 4, 30, 0, 0);
        Assert.assertFalse(zoneNY.isLocalDateTimeGap(validTime));

        Assert.assertFalse(DateTimeZone.UTC.isLocalDateTimeGap(gapTime));
    }

    @Test
    public void testAdjustOffset() {
        DateTimeZone zoneNY = DateTimeZone.forID("America/New_York");
        // Overlap: 2007-11-04 01:30:00 (occurs twice)
        // 2007-11-04T01:30:00 EDT = 1194154200000L
        long overlapEarlier = 1194154200000L;
        long adjustedLater = zoneNY.adjustOffset(overlapEarlier, true);
        long adjustedEarlier = zoneNY.adjustOffset(overlapEarlier, false);

        Assert.assertTrue(adjustedLater >= adjustedEarlier);

        // Non-transition instant
        long regular = 0L;
        Assert.assertEquals(regular, zoneNY.adjustOffset(regular, true));
        Assert.assertEquals(regular, zoneNY.adjustOffset(regular, false));
    }

    @Test
    public void testTransitions() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        Assert.assertFalse(zone.isFixed());

        long next = zone.nextTransition(0L);
        Assert.assertTrue(next > 0L);

        long prev = zone.previousTransition(next);
        Assert.assertEquals(0L, zone.previousTransition(prev + 1));

        Assert.assertTrue(DateTimeZone.UTC.isFixed());
        Assert.assertEquals(0L, DateTimeZone.UTC.nextTransition(0L));
        Assert.assertEquals(0L, DateTimeZone.UTC.previousTransition(0L));
    }

    // -----------------------------------------------------------------------
    // Object methods & Serialization
    // -----------------------------------------------------------------------

    @Test
    public void testToTimeZone() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        TimeZone tz = zone.toTimeZone();
        Assert.assertEquals("America/New_York", tz.getID());
    }

    @Test
    public void testEqualsAndHashCode() {
        DateTimeZone zone1 = DateTimeZone.forID("America/New_York");
        DateTimeZone zone2 = DateTimeZone.forID("America/New_York");
        DateTimeZone zone3 = DateTimeZone.forID("Europe/London");

        Assert.assertEquals(zone1, zone2);
        Assert.assertNotEquals(zone1, zone3);
        Assert.assertFalse(zone1.equals(null));
        Assert.assertFalse(zone1.equals("Not a DateTimeZone"));
        Assert.assertEquals(zone1.hashCode(), zone2.hashCode());
    }

    @Test
    public void testToString() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        Assert.assertEquals("America/New_York", zone.toString());
    }

    @Test
    public void testSerialization() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(zone);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        DateTimeZone deserialized = (DateTimeZone) ois.readObject();
        ois.close();

        Assert.assertSame(zone, deserialized);
    }

    @Test
    public void testSerialization_UTC() throws Exception {
        DateTimeZone zone = DateTimeZone.UTC;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(zone);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        DateTimeZone deserialized = (DateTimeZone) ois.readObject();
        ois.close();

        Assert.assertSame(zone, deserialized);
    }

    @Test
    public void testSerialization_fixedOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(2, 30);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(zone);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        DateTimeZone deserialized = (DateTimeZone) ois.readObject();
        ois.close();

        Assert.assertSame(zone, deserialized);
    }
}
