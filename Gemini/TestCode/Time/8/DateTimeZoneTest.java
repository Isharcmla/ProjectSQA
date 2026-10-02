package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

public class DateTimeZoneTest {

    private DateTimeZone originalDefaultZone;
    private TimeZone originalJdkDefaultZone;
    private Locale originalLocale;
    private Provider originalProvider;
    private NameProvider originalNameProvider;

    @Before
    public void setUp() {
        originalDefaultZone = DateTimeZone.getDefault();
        originalJdkDefaultZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefaultZone);
        TimeZone.setDefault(originalJdkDefaultZone);
        Locale.setDefault(originalLocale);
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
    }

    // -----------------------------------------------------------------------
    // Default Zone Tests
    // -----------------------------------------------------------------------

    @Test
    public void testGetDefault_returnsNonNull() {
        DateTimeZone def = DateTimeZone.getDefault();
        Assert.assertNotNull(def);
    }

    @Test
    public void testSetDefault_validZone_setsSuccessfully() {
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        DateTimeZone.setDefault(paris);
        Assert.assertEquals(paris, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_nullZone_throwsException() {
        DateTimeZone.setDefault(null);
    }

    // -----------------------------------------------------------------------
    // forID Tests
    // -----------------------------------------------------------------------

    @Test
    public void testForID_nullId_returnsDefault() {
        Assert.assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID(null));
    }

    @Test
    public void testForID_utcId_returnsUTC() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_namedZone_returnsZone() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        Assert.assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void testForID_offsetZeroString_returnsUTC() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forID("-00:00"));
    }

    @Test
    public void testForID_positiveOffsetString_returnsFixedOffsetZone() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        Assert.assertEquals("+02:00", zone.getID());
        Assert.assertEquals(2 * 3600 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testForID_negativeOffsetString_returnsFixedOffsetZone() {
        DateTimeZone zone = DateTimeZone.forID("-05:30");
        Assert.assertEquals("-05:30", zone.getID());
        Assert.assertEquals(-(5 * 3600 + 30 * 60) * 1000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidString_throwsException() {
        DateTimeZone.forID("NonExistent/Timezone_ID");
    }

    // -----------------------------------------------------------------------
    // forOffsetHours / forOffsetHoursMinutes / forOffsetMillis Tests
    // -----------------------------------------------------------------------

    @Test
    public void testForOffsetHours_zero_returnsUTC() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHours_positiveAndNegative() {
        DateTimeZone p3 = DateTimeZone.forOffsetHours(3);
        Assert.assertEquals("+03:00", p3.getID());
        Assert.assertEquals(3 * 3600 * 1000, p3.getOffset(0L));

        DateTimeZone m8 = DateTimeZone.forOffsetHours(-8);
        Assert.assertEquals("-08:00", m8.getID());
        Assert.assertEquals(-8 * 3600 * 1000, m8.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_outOfRangePositive_throwsException() {
        DateTimeZone.forOffsetHours(24);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_outOfRangeNegative_throwsException() {
        DateTimeZone.forOffsetHours(-24);
    }

    @Test
    public void testForOffsetHoursMinutes_zero_returnsUTC() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_validCombinations() {
        DateTimeZone p215 = DateTimeZone.forOffsetHoursMinutes(2, 15);
        Assert.assertEquals("+02:15", p215.getID());
        Assert.assertEquals((2 * 60 + 15) * 60 * 1000, p215.getOffset(0L));

        DateTimeZone m215 = DateTimeZone.forOffsetHoursMinutes(-2, 15);
        Assert.assertEquals("-02:15", m215.getID());
        Assert.assertEquals(-(2 * 60 + 15) * 60 * 1000, m215.getOffset(0L));

        DateTimeZone z15 = DateTimeZone.forOffsetHoursMinutes(0, 15);
        Assert.assertEquals("+00:15", z15.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_invalidMinutesNegative_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(2, -15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_invalidMinutesOver59_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(2, 60);
    }

    @Test
    public void testForOffsetMillis_zero_returnsUTC() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_validMillis_withSecondsAndMillis() {
        int millis = (1 * 3600 + 2 * 60 + 3) * 1000 + 4;
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);
        Assert.assertEquals("+01:02:03.004", zone.getID());
        Assert.assertEquals(millis, zone.getOffset(0L));

        // Test caching of fixed offset zones
        DateTimeZone cached = DateTimeZone.forOffsetMillis(millis);
        Assert.assertSame(zone, cached);
    }

    @Test
    public void testForOffsetMillis_boundaryValues() {
        int maxMillis = (86400 * 1000) - 1;
        DateTimeZone zoneMax = DateTimeZone.forOffsetMillis(maxMillis);
        Assert.assertEquals(maxMillis, zoneMax.getOffset(0L));

        DateTimeZone zoneMin = DateTimeZone.forOffsetMillis(-maxMillis);
        Assert.assertEquals(-maxMillis, zoneMin.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetMillis_exceedMax_throwsException() {
        DateTimeZone.forOffsetMillis(86400 * 1000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetMillis_exceedMin_throwsException() {
        DateTimeZone.forOffsetMillis(-86400 * 1000);
    }

    // -----------------------------------------------------------------------
    // forTimeZone Tests
    // -----------------------------------------------------------------------

    @Test
    public void testForTimeZone_null_returnsDefault() {
        Assert.assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_utc_returnsUTC() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testForTimeZone_convertedOldId() {
        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST"));
        Assert.assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void testForTimeZone_gmtCustomOffsets() {
        DateTimeZone zonePlus = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+02:00"));
        Assert.assertEquals("+02:00", zonePlus.getID());

        DateTimeZone zoneMinus = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT-05:00"));
        Assert.assertEquals("-05:00", zoneMinus.getID());

        DateTimeZone zoneZero = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        Assert.assertSame(DateTimeZone.UTC, zoneZero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_unrecognisedId_throwsException() {
        TimeZone custom = new TimeZone() {
            @Override
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
                return 0;
            }

            @Override
            public void setRawOffset(int offsetMillis) {
            }

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
                return "Unknown_TimeZone_ID_XYZ";
            }
        };
        DateTimeZone.forTimeZone(custom);
    }

    // -----------------------------------------------------------------------
    // Provider and NameProvider Configuration Tests
    // -----------------------------------------------------------------------

    @Test
    public void testGetAvailableIDs_notEmptyAndContainsUTC() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        Assert.assertNotNull(ids);
        Assert.assertTrue(ids.contains("UTC"));
        Assert.assertTrue(ids.contains("America/New_York"));
    }

    @Test
    public void testSetProvider_null_resetsDefault() {
        DateTimeZone.setProvider(null);
        Assert.assertNotNull(DateTimeZone.getProvider());
    }

    @Test
    public void testSetProvider_customValidProvider() {
        Provider custom = new UTCProvider();
        DateTimeZone.setProvider(custom);
        Assert.assertSame(custom, DateTimeZone.getProvider());
        Assert.assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_emptyIDs_throwsException() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String name) {
                return null;
            }

            public Set<String> getAvailableIDs() {
                return Collections.emptySet();
            }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_missingUTC_throwsException() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String name) {
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
    public void testSetProvider_invalidUTCZone_throwsException() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String name) {
                return name.equals("UTC") ? DateTimeZone.forOffsetHours(1) : null;
            }

            public Set<String> getAvailableIDs() {
                Set<String> set = new HashSet<String>();
                set.add("UTC");
                return set;
            }
        });
    }

    @Test
    public void testSetNameProvider_null_resetsDefault() {
        DateTimeZone.setNameProvider(null);
        Assert.assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testSetNameProvider_customProvider() {
        NameProvider custom = new DefaultNameProvider();
        DateTimeZone.setNameProvider(custom);
        Assert.assertSame(custom, DateTimeZone.getNameProvider());
    }

    // -----------------------------------------------------------------------
    // Zone Instance Operations (Names, Offsets, Transitions, Conversions)
    // -----------------------------------------------------------------------

    @Test
    public void testNames_localeAndDefaultLocale() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long instant = 0L; // Winter time -> GMT

        String shortName = zone.getShortName(instant);
        Assert.assertNotNull(shortName);

        String shortNameLoc = zone.getShortName(instant, Locale.UK);
        Assert.assertNotNull(shortNameLoc);

        String longName = zone.getName(instant);
        Assert.assertNotNull(longName);

        String longNameLoc = zone.getName(instant, Locale.UK);
        Assert.assertNotNull(longNameLoc);

        // Fixed offset zone fallback for names
        DateTimeZone fixed = DateTimeZone.forOffsetHours(5);
        Assert.assertEquals("+05:00", fixed.getName(instant, Locale.ENGLISH));
        Assert.assertEquals("+05:00", fixed.getShortName(instant, Locale.ENGLISH));
    }

    @Test
    public void testGetOffset_ReadableInstant() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        ReadableInstant nullInstant = null;
        int offsetNow = zone.getOffset(nullInstant);

        Instant instant = new Instant(0L);
        int offsetEpoch = zone.getOffset(instant);
        Assert.assertEquals(zone.getOffset(0L), offsetEpoch);
        Assert.assertTrue(offsetNow == 3600000 || offsetNow == 7200000);
    }

    @Test
    public void testStandardOffsetAndIsStandardOffset() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        long winterInstant = 0L; // 1970-01-01 -> CET (+1)
        long summerInstant = 15778800000L; // 1970-07-02 -> CEST (+2)

        Assert.assertEquals(3600000, zone.getStandardOffset(winterInstant));
        Assert.assertTrue(zone.isStandardOffset(winterInstant));

        Assert.assertEquals(3600000, zone.getStandardOffset(summerInstant));
        Assert.assertFalse(zone.isStandardOffset(summerInstant));
    }

    @Test
    public void testTransitions_fixedAndNonFixed() {
        Assert.assertTrue(DateTimeZone.UTC.isFixed());
        Assert.assertEquals(123456L, DateTimeZone.UTC.nextTransition(123456L));
        Assert.assertEquals(123456L, DateTimeZone.UTC.previousTransition(123456L));

        DateTimeZone london = DateTimeZone.forID("Europe/London");
        Assert.assertFalse(london.isFixed());
        long next = london.nextTransition(0L);
        Assert.assertTrue(next > 0L);
        long prev = london.previousTransition(next);
        Assert.assertEquals(0L, prev);
    }

    @Test
    public void testConvertUTCToLocal_normalAndOverflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        Assert.assertEquals(7200000L + 1000L, zone.convertUTCToLocal(1000L));

        try {
            zone.convertUTCToLocal(Long.MAX_VALUE - 100);
            Assert.fail("Expected ArithmeticException on overflow");
        } catch (ArithmeticException expected) {
            // Expected
        }
    }

    @Test
    public void testConvertLocalToUTC_strictAndNonStrict() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");

        // Normal instant
        long utc = ny.convertLocalToUTC(0L, false);
        Assert.assertEquals(5 * 3600 * 1000L, utc);

        // Gap instant: 2007-03-11 02:30:00 EST -> EDT cutover (missing hour 02:00-02:59)
        // 2007-03-11 02:30:00 local is millis: 1173580200000L
        long gapLocalMillis = 1173580200000L;

        try {
            ny.convertLocalToUTC(gapLocalMillis, true);
            Assert.fail("Expected IllegalInstantException for gap in strict mode");
        } catch (IllegalInstantException expected) {
            // Expected
        }

        // Non-strict mode should not throw
        long gapUtc = ny.convertLocalToUTC(gapLocalMillis, false);
        Assert.assertTrue(gapUtc > 0);

        // 3-argument version with original UTC
        long convertedFromOrig = ny.convertLocalToUTC(0L, false, 0L);
        Assert.assertEquals(utc, convertedFromOrig);
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_overflow_throwsException() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        zone.convertLocalToUTC(Long.MIN_VALUE + 100, false);
    }

    @Test
    public void testGetOffsetFromLocal_gapAndOverlap() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");

        // Normal winter local time
        Assert.assertEquals(-5 * 3600 * 1000, ny.getOffsetFromLocal(0L));

        // In DST gap
        long gapLocalMillis = 1173580200000L;
        int gapOffset = ny.getOffsetFromLocal(gapLocalMillis);
        Assert.assertTrue(gapOffset == -4 * 3600 * 1000 || gapOffset == -5 * 3600 * 1000);

        // In DST overlap: 2007-11-04 01:30:00 (1194147000000L)
        long overlapLocalMillis = 1194147000000L;
        int overlapOffset = ny.getOffsetFromLocal(overlapLocalMillis);
        Assert.assertEquals(-4 * 3600 * 1000, overlapOffset);
    }

    @Test
    public void testGetMillisKeepLocal() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        DateTimeZone london = DateTimeZone.forID("Europe/London");

        long epoch = 0L;
        long converted = ny.getMillisKeepLocal(london, epoch);
        Assert.assertEquals(epoch - (5 * 3600 * 1000), converted);

        // Same zone
        Assert.assertEquals(epoch, ny.getMillisKeepLocal(ny, epoch));
        // Null target zone -> default zone
        Assert.assertEquals(ny.getMillisKeepLocal(DateTimeZone.getDefault(), epoch), ny.getMillisKeepLocal(null, epoch));
    }

    @Test
    public void testIsLocalDateTimeGap() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        LocalDateTime gapDateTime = new LocalDateTime(2007, 3, 11, 2, 30, 0, 0);
        Assert.assertTrue(ny.isLocalDateTimeGap(gapDateTime));

        LocalDateTime nonGapDateTime = new LocalDateTime(2007, 3, 11, 4, 30, 0, 0);
        Assert.assertFalse(ny.isLocalDateTimeGap(nonGapDateTime));

        Assert.assertFalse(DateTimeZone.UTC.isLocalDateTimeGap(gapDateTime));
    }

    @Test
    public void testAdjustOffset() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        // During overlap 2007-11-04 01:30:00
        // Transition is at 06:00:00 UTC (1194156000000L)
        // Overlap starts 1 hour before in UTC (1194152400000L)
        long overlapInstant = 1194154200000L; // 01:30 EDT

        long earlier = ny.adjustOffset(overlapInstant, false);
        long later = ny.adjustOffset(overlapInstant, true);
        Assert.assertEquals(3600000L, later - earlier);

        // Non-overlap instant should return unchanged
        long normalInstant = 0L;
        Assert.assertEquals(normalInstant, ny.adjustOffset(normalInstant, false));
        Assert.assertEquals(normalInstant, ny.adjustOffset(normalInstant, true));
    }

    // -----------------------------------------------------------------------
    // Object Identity & Serialization Tests
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
        Assert.assertEquals(zone1.hashCode(), zone2.hashCode());
        Assert.assertNotEquals(zone1, zone3);
        Assert.assertFalse(zone1.equals(null));
        Assert.assertFalse(zone1.equals("NotADateTimeZone"));
    }

    @Test
    public void testToString() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        Assert.assertEquals("Europe/Paris", zone.toString());
    }

    @Test
    public void testSerialization() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("America/Chicago");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(zone);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        Assert.assertSame(zone, deserialized);
    }
}
