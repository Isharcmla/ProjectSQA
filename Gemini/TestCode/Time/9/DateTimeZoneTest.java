package org.joda.time;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class DateTimeZoneTest {

    private DateTimeZone originalDefaultZone;
    private Provider originalProvider;
    private NameProvider originalNameProvider;

    @Before
    public void setUp() {
        originalDefaultZone = DateTimeZone.getDefault();
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefaultZone);
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
    }

    @Test
    public void testGetDefault_normal_returnsNonNull() {
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        assertNotNull(defaultZone);
    }

    @Test
    public void testSetDefault_validZone_setsSuccessfully() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        DateTimeZone.setDefault(london);
        assertEquals(london, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_nullZone_throwsException() {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void testForID_nullId_returnsDefault() {
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID(null));
    }

    @Test
    public void testForID_utcId_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_validProviderId_returnsZone() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void testForID_validOffsetZero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("-00:00"));
    }

    @Test
    public void testForID_validPositiveOffset_returnsFixedOffsetZone() {
        DateTimeZone zone = DateTimeZone.forID("+05:30");
        assertEquals("+05:30", zone.getID());
        assertEquals(19800000, zone.getOffset(0L));
    }

    @Test
    public void testForID_validNegativeOffset_returnsFixedOffsetZone() {
        DateTimeZone zone = DateTimeZone.forID("-08:00");
        assertEquals("-08:00", zone.getID());
        assertEquals(-28800000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidId_throwsException() {
        DateTimeZone.forID("Invalid/Zone_Name");
    }

    @Test
    public void testForOffsetHours_zero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHours_positiveAndNegative_returnsCorrectZone() {
        DateTimeZone zonePos = DateTimeZone.forOffsetHours(3);
        assertEquals("+03:00", zonePos.getID());
        assertEquals(3 * 3600000, zonePos.getOffset(0L));

        DateTimeZone zoneNeg = DateTimeZone.forOffsetHours(-5);
        assertEquals("-05:00", zoneNeg.getID());
        assertEquals(-5 * 3600000, zoneNeg.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_outOfRange_throwsException() {
        DateTimeZone.forOffsetHours(24);
    }

    @Test
    public void testForOffsetHoursMinutes_zero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_validValues_returnsCorrectZone() {
        DateTimeZone zone1 = DateTimeZone.forOffsetHoursMinutes(5, 30);
        assertEquals("+05:30", zone1.getID());
        assertEquals(5 * 3600000 + 30 * 60000, zone1.getOffset(0L));

        DateTimeZone zone2 = DateTimeZone.forOffsetHoursMinutes(-5, 30);
        assertEquals("-05:30", zone2.getID());
        assertEquals(-(5 * 3600000 + 30 * 60000), zone2.getOffset(0L));

        DateTimeZone zone3 = DateTimeZone.forOffsetHoursMinutes(0, 45);
        assertEquals("+00:45", zone3.getID());
        assertEquals(45 * 60000, zone3.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesNegative_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(2, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesTooHigh_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(2, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_hoursOutOfRange_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(24, 0);
    }

    @Test
    public void testForOffsetMillis_zero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_cacheAndResolution() {
        DateTimeZone zone1 = DateTimeZone.forOffsetMillis(3600000);
        DateTimeZone zone2 = DateTimeZone.forOffsetMillis(3600000);
        assertSame(zone1, zone2);
        assertEquals("+01:00", zone1.getID());

        DateTimeZone zoneWithSeconds = DateTimeZone.forOffsetMillis(3600000 + 120000 + 15000);
        assertEquals("+01:02:15", zoneWithSeconds.getID());

        DateTimeZone zoneWithMillis = DateTimeZone.forOffsetMillis(-(3600000 + 120000 + 15000 + 250));
        assertEquals("-01:02:15.250", zoneWithMillis.getID());
    }

    @Test
    public void testForTimeZone_null_returnsDefault() {
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_utc_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testForTimeZone_conversionOldAliases() {
        assertEquals(DateTimeZone.forID("America/New_York"), DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST")));
        assertEquals(DateTimeZone.forID("America/Los_Angeles"), DateTimeZone.forTimeZone(TimeZone.getTimeZone("PST")));
        assertEquals(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void testForTimeZone_gmtOffsetFormats() {
        DateTimeZone zonePos = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+02:00"));
        assertEquals("+02:00", zonePos.getID());
        assertEquals(2 * 3600000, zonePos.getOffset(0L));

        DateTimeZone zoneZero = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        assertSame(DateTimeZone.UTC, zoneZero);

        DateTimeZone zoneNeg = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT-05:00"));
        assertEquals("-05:00", zoneNeg.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_unrecognised_throwsException() {
        TimeZone tz = new TimeZone() {
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
                return "NonExistentCustomZoneID";
            }
        };
        DateTimeZone.forTimeZone(tz);
    }

    @Test
    public void testGetAvailableIDs_notEmpty() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.contains("UTC"));
        assertTrue(ids.contains("Europe/London"));
    }

    @Test
    public void testSetProvider_null_resetsToDefault() {
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
    }

    @Test
    public void testSetProvider_customValidProvider() {
        Provider custom = new UTCProvider();
        DateTimeZone.setProvider(custom);
        assertSame(custom, DateTimeZone.getProvider());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_emptyIds_throwsException() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String name) { return null; }
            public Set<String> getAvailableIDs() { return Collections.emptySet(); }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_missingUTC_throwsException() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String name) { return null; }
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
            public DateTimeZone getZone(String name) { return null; }
            public Set<String> getAvailableIDs() {
                Set<String> set = new HashSet<String>();
                set.add("UTC");
                return set;
            }
        });
    }

    @Test
    public void testSetNameProvider_null_andCustom() {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());

        NameProvider custom = new DefaultNameProvider();
        DateTimeZone.setNameProvider(custom);
        assertSame(custom, DateTimeZone.getNameProvider());
    }

    @Test
    public void testGetNames_allVariants() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long winterInstant = 0L; // 1970-01-01 GMT
        long summerInstant = 15778800000L; // July 1970 BST

        assertNotNull(zone.getName(winterInstant));
        assertNotNull(zone.getName(winterInstant, Locale.UK));
        assertNotNull(zone.getName(summerInstant, Locale.UK));

        assertNotNull(zone.getShortName(winterInstant));
        assertNotNull(zone.getShortName(winterInstant, Locale.UK));
        assertNotNull(zone.getShortName(summerInstant, Locale.UK));

        DateTimeZone fixedZone = DateTimeZone.forOffsetHours(2);
        assertEquals("+02:00", fixedZone.getName(winterInstant));
        assertEquals("+02:00", fixedZone.getShortName(winterInstant));
        assertEquals("+02:00", fixedZone.getName(winterInstant, Locale.GERMANY));
        assertEquals("+02:00", fixedZone.getShortName(winterInstant, Locale.GERMANY));
    }

    @Test
    public void testGetOffset_readableInstant() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        ReadableInstant instant = new Instant(0L);
        assertEquals(zone.getOffset(0L), zone.getOffset(instant));
        assertEquals(zone.getOffset(DateTimeUtils.currentTimeMillis()), zone.getOffset((ReadableInstant) null));
    }

    @Test
    public void testIsStandardOffset() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long winter = 0L; // 1970-01-01 GMT (offset 0, std 0)
        long summer = 15778800000L; // 1970-07-02 BST (offset 3600000, std 0)
        assertTrue(zone.isStandardOffset(winter));
        assertFalse(zone.isStandardOffset(summer));
    }

    @Test
    public void testConvertUTCToLocal_andOverflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long local = zone.convertUTCToLocal(1000L);
        assertEquals(1000L + 2 * 3600000L, local);

        try {
            zone.convertUTCToLocal(Long.MAX_VALUE - 100);
            fail("Expected ArithmeticException on overflow");
        } catch (ArithmeticException expected) {}
    }

    @Test
    public void testConvertLocalToUTC_strictAndNonStrict_overflow() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long winterUTC = 0L;
        long local = zone.convertUTCToLocal(winterUTC);
        assertEquals(winterUTC, zone.convertLocalToUTC(local, true));
        assertEquals(winterUTC, zone.convertLocalToUTC(local, false));
        assertEquals(winterUTC, zone.convertLocalToUTC(local, false, winterUTC));

        DateTimeZone offsetZone = DateTimeZone.forOffsetMillis(-3600000);
        try {
            offsetZone.convertLocalToUTC(Long.MIN_VALUE + 100, false);
            fail("Expected ArithmeticException on underflow");
        } catch (ArithmeticException expected) {}
    }

    @Test
    public void testConvertLocalToUTC_gapAndOverlap() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        // 2007-03-11 02:30:00 EST was a DST gap in America/New_York (spring forward from 02:00 to 03:00)
        // 2007-03-11 02:00 local time = 1173596400000L UTC + (-5h) offset -> local millis = 1173600000000L - 18000000L
        long gapLocalMillis = 1173600000000L - 5 * 3600000L + 30 * 60000L; // 02:30 local

        try {
            zone.convertLocalToUTC(gapLocalMillis, true);
            fail("Expected IllegalInstantException in gap with strict=true");
        } catch (IllegalInstantException expected) {}

        long nonStrictUTC = zone.convertLocalToUTC(gapLocalMillis, false);
        assertTrue(nonStrictUTC > 0);
    }

    @Test
    public void testGetOffsetFromLocal() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long winterInstant = 0L;
        assertEquals(-5 * 3600000, zone.getOffsetFromLocal(winterInstant));

        DateTimeZone fixed = DateTimeZone.forOffsetHours(3);
        assertEquals(3 * 3600000, fixed.getOffsetFromLocal(0L));
    }

    @Test
    public void testGetMillisKeepLocal() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        long instant = 100000000L;

        assertEquals(instant, ny.getMillisKeepLocal(ny, instant));
        assertEquals(instant, ny.getMillisKeepLocal(null, instant) != 0 ? ny.getMillisKeepLocal(DateTimeZone.getDefault(), instant) : instant);

        long diff = ny.getMillisKeepLocal(london, instant);
        assertNotSame(instant, diff);
    }

    @Test
    public void testIsLocalDateTimeGap() {
        DateTimeZone fixed = DateTimeZone.forOffsetHours(1);
        LocalDateTime ldt = new LocalDateTime(2007, 3, 11, 2, 30);
        assertFalse(fixed.isLocalDateTimeGap(ldt));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        assertTrue(ny.isLocalDateTimeGap(ldt));

        LocalDateTime regular = new LocalDateTime(2007, 1, 1, 12, 0);
        assertFalse(ny.isLocalDateTimeGap(regular));
    }

    @Test
    public void testAdjustOffset() {
        DateTimeZone fixed = DateTimeZone.forOffsetHours(1);
        assertEquals(100000L, fixed.adjustOffset(100000L, true));
        assertEquals(100000L, fixed.adjustOffset(100000L, false));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        // 2007-11-04 01:30:00 EDT/EST overlap
        // Fall back occurs at 2:00 EDT -> 1:00 EST. Overlap is between 1:00 and 2:00 local.
        // UTC transition instant: 1194156000000L (06:00 UTC = 02:00 EDT / 01:00 EST)
        long transition = 1194156000000L;
        long duringOverlapEarlier = transition - 1800000L; // 01:30 EDT
        long duringOverlapLater = transition + 1800000L;   // 01:30 EST

        assertEquals(duringOverlapEarlier, ny.adjustOffset(duringOverlapEarlier, false));
        assertEquals(duringOverlapLater, ny.adjustOffset(duringOverlapEarlier, true));

        long nonOverlap = 0L;
        assertEquals(nonOverlap, ny.adjustOffset(nonOverlap, true));
        assertEquals(nonOverlap, ny.adjustOffset(nonOverlap, false));
    }

    @Test
    public void testIsFixed_transitions() {
        DateTimeZone utc = DateTimeZone.UTC;
        assertTrue(utc.isFixed());
        assertEquals(100L, utc.nextTransition(100L));
        assertEquals(100L, utc.previousTransition(100L));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        assertFalse(ny.isFixed());
        assertTrue(ny.nextTransition(0L) > 0L);
        assertTrue(ny.previousTransition(0L) < 0L);
    }

    @Test
    public void testToTimeZone() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        TimeZone tz = ny.toTimeZone();
        assertNotNull(tz);
        assertEquals("America/New_York", tz.getID());
    }

    @Test
    public void testEqualsAndHashCodeAndToString() {
        DateTimeZone ny1 = DateTimeZone.forID("America/New_York");
        DateTimeZone ny2 = DateTimeZone.forID("America/New_York");
        DateTimeZone london = DateTimeZone.forID("Europe/London");

        assertEquals(ny1, ny2);
        assertEquals(ny1.hashCode(), ny2.hashCode());
        assertFalse(ny1.equals(london));
        assertFalse(ny1.equals("NotAZone"));
        assertFalse(ny1.equals(null));

        assertEquals("America/New_York", ny1.toString());
        assertEquals("Europe/London", london.toString());
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
        DateTimeZone result = (DateTimeZone) ois.readObject();
        ois.close();

        assertSame(zone, result);
    }
}
