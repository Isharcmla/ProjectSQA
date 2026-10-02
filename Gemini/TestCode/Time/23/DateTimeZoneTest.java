package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
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

    private DateTimeZone originalDefaultZone;
    private Provider originalProvider;
    private NameProvider originalNameProvider;
    private Locale originalLocale;

    @Before
    public void setUp() {
        originalDefaultZone = DateTimeZone.getDefault();
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
        originalLocale = Locale.getDefault();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefaultZone);
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
        Locale.setDefault(originalLocale);
    }

    // -----------------------------------------------------------------------
    // getDefault() and setDefault()
    // -----------------------------------------------------------------------

    @Test
    public void testGetDefault_notNull() {
        DateTimeZone def = DateTimeZone.getDefault();
        Assert.assertNotNull(def);
    }

    @Test
    public void testSetDefault_valid() {
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        DateTimeZone.setDefault(paris);
        Assert.assertEquals(paris, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_nullThrows() {
        DateTimeZone.setDefault(null);
    }

    // -----------------------------------------------------------------------
    // forID(String)
    // -----------------------------------------------------------------------

    @Test
    public void testForID_nullReturnsDefault() {
        DateTimeZone def = DateTimeZone.getDefault();
        Assert.assertSame(def, DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTC() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_validLocation() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        Assert.assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void testForID_positiveOffset() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        Assert.assertEquals("+02:00", zone.getID());
        Assert.assertEquals(2 * 3600 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testForID_negativeOffset() {
        DateTimeZone zone = DateTimeZone.forID("-05:00");
        Assert.assertEquals("-05:00", zone.getID());
        Assert.assertEquals(-5 * 3600 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testForID_zeroOffset() {
        DateTimeZone zone = DateTimeZone.forID("+00:00");
        Assert.assertSame(DateTimeZone.UTC, zone);
        DateTimeZone zoneMinus = DateTimeZone.forID("-00:00");
        Assert.assertSame(DateTimeZone.UTC, zoneMinus);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidStringThrows() {
        DateTimeZone.forID("Invalid/Zone_Name");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_emptyStringThrows() {
        DateTimeZone.forID("");
    }

    // -----------------------------------------------------------------------
    // forOffsetHours and forOffsetHoursMinutes
    // -----------------------------------------------------------------------

    @Test
    public void testForOffsetHours_zero() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHours_positive() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        Assert.assertEquals("+03:00", zone.getID());
        Assert.assertEquals(3 * 3600 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHours_negative() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-8);
        Assert.assertEquals("-08:00", zone.getID());
        Assert.assertEquals(-8 * 3600 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_zero() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_positiveHoursMinutes() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(5, 30);
        Assert.assertEquals("+05:30", zone.getID());
        Assert.assertEquals((5 * 60 + 30) * 60 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_negativeHoursMinutes() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        Assert.assertEquals("-02:30", zone.getID());
        Assert.assertEquals(-(2 * 60 + 30) * 60 * 1000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesTooHigh() {
        DateTimeZone.forOffsetHoursMinutes(1, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesNegative() {
        DateTimeZone.forOffsetHoursMinutes(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_offsetTooLarge() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE / 60, 0);
    }

    // -----------------------------------------------------------------------
    // forOffsetMillis
    // -----------------------------------------------------------------------

    @Test
    public void testForOffsetMillis_zero() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_withSecondsAndMillis() {
        int millis = (1 * 3600 + 23 * 60 + 45) * 1000 + 678;
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);
        Assert.assertEquals("+01:23:45.678", zone.getID());
        Assert.assertEquals(millis, zone.getOffset(0L));

        // Test caching (same reference)
        DateTimeZone zoneCached = DateTimeZone.forOffsetMillis(millis);
        Assert.assertSame(zone, zoneCached);
    }

    @Test
    public void testForOffsetMillis_negativeWithSeconds() {
        int millis = -((2 * 3600 + 15 * 60 + 30) * 1000);
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);
        Assert.assertEquals("-02:15:30", zone.getID());
    }

    // -----------------------------------------------------------------------
    // forTimeZone(TimeZone)
    // -----------------------------------------------------------------------

    @Test
    public void testForTimeZone_null() {
        DateTimeZone def = DateTimeZone.getDefault();
        Assert.assertSame(def, DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(tz));
    }

    @Test
    public void testForTimeZone_convertedAliases() {
        DateTimeZone est = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST"));
        Assert.assertEquals("America/New_York", est.getID());

        DateTimeZone pst = DateTimeZone.forTimeZone(TimeZone.getTimeZone("PST"));
        Assert.assertEquals("America/Los_Angeles", pst.getID());

        DateTimeZone gmt = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT"));
        Assert.assertSame(DateTimeZone.UTC, gmt);
    }

    @Test
    public void testForTimeZone_customGMT() {
        TimeZone tz1 = new SimpleTimeZone(2 * 3600 * 1000, "GMT+02:00");
        DateTimeZone dtz1 = DateTimeZone.forTimeZone(tz1);
        Assert.assertEquals("+02:00", dtz1.getID());

        TimeZone tzZero = new SimpleTimeZone(0, "GMT+00:00");
        DateTimeZone dtzZero = DateTimeZone.forTimeZone(tzZero);
        Assert.assertSame(DateTimeZone.UTC, dtzZero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_unrecognisedThrows() {
        TimeZone custom = new SimpleTimeZone(1000, "CUSTOM_UNKNOWN_ZONE");
        DateTimeZone.forTimeZone(custom);
    }

    // -----------------------------------------------------------------------
    // getAvailableIDs
    // -----------------------------------------------------------------------

    @Test
    public void testGetAvailableIDs() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        Assert.assertNotNull(ids);
        Assert.assertTrue(ids.contains("UTC"));
        Assert.assertTrue(ids.contains("Europe/London"));
    }

    // -----------------------------------------------------------------------
    // Provider configuration
    // -----------------------------------------------------------------------

    @Test
    public void testGetAndSetProvider_valid() {
        Provider current = DateTimeZone.getProvider();
        Assert.assertNotNull(current);

        DateTimeZone.setProvider(new UTCProvider());
        Assert.assertEquals(1, DateTimeZone.getAvailableIDs().size());

        DateTimeZone.setProvider(null);
        Assert.assertNotNull(DateTimeZone.getProvider());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_emptyIDsThrows() {
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
    public void testSetProvider_noUTCThrows() {
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
    public void testSetProvider_invalidUTCZoneThrows() {
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

    // -----------------------------------------------------------------------
    // NameProvider configuration
    // -----------------------------------------------------------------------

    @Test
    public void testGetAndSetNameProvider_valid() {
        NameProvider current = DateTimeZone.getNameProvider();
        Assert.assertNotNull(current);

        DateTimeZone.setNameProvider(new DefaultNameProvider());
        Assert.assertNotNull(DateTimeZone.getNameProvider());

        DateTimeZone.setNameProvider(null);
        Assert.assertNotNull(DateTimeZone.getNameProvider());
    }

    // -----------------------------------------------------------------------
    // Names, ShortNames, NameKey
    // -----------------------------------------------------------------------

    @Test
    public void testGetNameAndShortName_UTC() {
        DateTimeZone utc = DateTimeZone.UTC;
        Assert.assertEquals("UTC", utc.getNameKey(0L));
        Assert.assertEquals("UTC", utc.getShortName(0L));
        Assert.assertEquals("UTC", utc.getShortName(0L, Locale.ENGLISH));
        Assert.assertEquals("UTC", utc.getShortName(0L, null));
        Assert.assertEquals("UTC", utc.getName(0L));
        Assert.assertEquals("UTC", utc.getName(0L, Locale.ENGLISH));
        Assert.assertEquals("UTC", utc.getName(0L, null));
    }

    @Test
    public void testGetNameAndShortName_FixedZone() {
        DateTimeZone fixed = DateTimeZone.forOffsetHours(2);
        Assert.assertNull(fixed.getNameKey(0L));
        Assert.assertEquals("+02:00", fixed.getShortName(0L));
        Assert.assertEquals("+02:00", fixed.getName(0L));
    }

    @Test
    public void testGetNameAndShortName_FallbackWhenNameProviderReturnsNull() {
        NameProvider mockProvider = new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) {
                return null;
            }
            public String getName(Locale locale, String id, String nameKey) {
                return null;
            }
        };
        DateTimeZone.setNameProvider(mockProvider);
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        Assert.assertEquals("+00:00", london.getShortName(0L));
        Assert.assertEquals("+00:00", london.getName(0L));
    }

    // -----------------------------------------------------------------------
    // Offsets: getOffset, getStandardOffset, isStandardOffset
    // -----------------------------------------------------------------------

    @Test
    public void testGetOffset_ReadableInstant() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        Assert.assertEquals(0, london.getOffset((ReadableInstant) null));

        Instant summer = new Instant(1183248000000L); // 2007-07-01 UTC
        Assert.assertEquals(3600 * 1000, london.getOffset(summer));
        Assert.assertFalse(london.isStandardOffset(summer.getMillis()));

        Instant winter = new Instant(1167609600000L); // 2007-01-01 UTC
        Assert.assertEquals(0, london.getOffset(winter));
        Assert.assertTrue(london.isStandardOffset(winter.getMillis()));
        Assert.assertEquals(0, london.getStandardOffset(winter.getMillis()));
    }

    @Test
    public void testGetOffsetFromLocal() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        // Standard non-transition time
        long winterLocal = new DateTime(2007, 1, 1, 12, 0, 0, 0, DateTimeZone.UTC).getMillis();
        Assert.assertEquals(0, london.getOffsetFromLocal(winterLocal));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        // Gap transition (Spring forward): 2007-03-11 02:00 -> 03:00
        long gapLocal = new DateTime(2007, 3, 11, 2, 30, 0, 0, DateTimeZone.UTC).getMillis();
        int offsetGap = ny.getOffsetFromLocal(gapLocal);
        Assert.assertEquals(-5 * 3600 * 1000, offsetGap);

        // Overlap transition (Fall back): 2007-11-04 01:30
        long overlapLocal = new DateTime(2007, 11, 4, 1, 30, 0, 0, DateTimeZone.UTC).getMillis();
        int offsetOverlap = ny.getOffsetFromLocal(overlapLocal);
        Assert.assertEquals(-4 * 3600 * 1000, offsetOverlap);
    }

    // -----------------------------------------------------------------------
    // UTC <-> Local conversions
    // -----------------------------------------------------------------------

    @Test
    public void testConvertUTCToLocal_standard() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long utc = 1000000L;
        Assert.assertEquals(utc + 2 * 3600 * 1000L, zone.convertUTCToLocal(utc));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflowPositiveThrows() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        zone.convertUTCToLocal(Long.MAX_VALUE - 100L);
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflowNegativeThrows() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-2);
        zone.convertUTCToLocal(Long.MIN_VALUE + 100L);
    }

    @Test
    public void testConvertLocalToUTC_strictAndLenient() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        // Non-gap
        long normalLocal = new DateTime(2007, 1, 1, 12, 0, 0, 0, DateTimeZone.UTC).getMillis();
        long normalUTC = ny.convertLocalToUTC(normalLocal, true);
        Assert.assertEquals(normalLocal + 5 * 3600 * 1000L, normalUTC);

        // Gap lenient
        long gapLocal = new DateTime(2007, 3, 11, 2, 30, 0, 0, DateTimeZone.UTC).getMillis();
        long lenientUTC = ny.convertLocalToUTC(gapLocal, false);
        Assert.assertEquals(gapLocal + 5 * 3600 * 1000L, lenientUTC);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertLocalToUTC_strictInGapThrows() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        long gapLocal = new DateTime(2007, 3, 11, 2, 30, 0, 0, DateTimeZone.UTC).getMillis();
        ny.convertLocalToUTC(gapLocal, true);
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_overflowThrows() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        zone.convertLocalToUTC(Long.MIN_VALUE + 100L, false);
    }

    @Test
    public void testConvertLocalToUTC_withOriginalInstant() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        long local = new DateTime(2007, 11, 4, 1, 30, 0, 0, DateTimeZone.UTC).getMillis();
        long originalSummer = new DateTime(2007, 11, 4, 1, 30, 0, 0, ny).getMillis();
        long utc = ny.convertLocalToUTC(local, false, originalSummer);
        Assert.assertEquals(local + 4 * 3600 * 1000L, utc);
    }

    // -----------------------------------------------------------------------
    // getMillisKeepLocal
    // -----------------------------------------------------------------------

    @Test
    public void testGetMillisKeepLocal() {
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(1);
        DateTimeZone zone2 = DateTimeZone.forOffsetHours(3);

        long instant = 1000000L;
        // null zone defaults to default DateTimeZone
        long keepLocalNull = zone1.getMillisKeepLocal(null, instant);
        Assert.assertEquals(zone1.getMillisKeepLocal(DateTimeZone.getDefault(), instant), keepLocalNull);

        // same zone
        Assert.assertEquals(instant, zone1.getMillisKeepLocal(zone1, instant));

        // convert +1 to +3
        long result = zone1.getMillisKeepLocal(zone2, instant);
        Assert.assertEquals(instant - 2 * 3600 * 1000L, result);
    }

    // -----------------------------------------------------------------------
    // isLocalDateTimeGap
    // -----------------------------------------------------------------------

    @Test
    public void testIsLocalDateTimeGap() {
        DateTimeZone fixed = DateTimeZone.forOffsetHours(1);
        LocalDateTime ldt = new LocalDateTime(2007, 3, 11, 2, 30);
        Assert.assertFalse(fixed.isLocalDateTimeGap(ldt));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        Assert.assertTrue(ny.isLocalDateTimeGap(ldt));
        Assert.assertFalse(ny.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 4, 0)));
    }

    // -----------------------------------------------------------------------
    // adjustOffset
    // -----------------------------------------------------------------------

    @Test
    public void testAdjustOffset() {
        DateTimeZone fixed = DateTimeZone.UTC;
        long t = 1000000L;
        Assert.assertEquals(t, fixed.adjustOffset(t, true));
        Assert.assertEquals(t, fixed.adjustOffset(t, false));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        // Overlap in America/New_York: 2007-11-04 01:30 local occurs at UTC 05:30 (EDT) and 06:30 (EST)
        long instantBefore = new DateTime(2007, 11, 4, 1, 30, 0, 0, DateTimeZone.forOffsetHours(-4)).getMillis();
        long instantAfter = new DateTime(2007, 11, 4, 1, 30, 0, 0, DateTimeZone.forOffsetHours(-5)).getMillis();

        long adjustedLater = ny.adjustOffset(instantBefore, true);
        Assert.assertEquals(instantAfter, adjustedLater);

        long adjustedEarlier = ny.adjustOffset(instantAfter, false);
        Assert.assertEquals(instantBefore, adjustedEarlier);
    }

    // -----------------------------------------------------------------------
    // Transitions and properties: isFixed, nextTransition, previousTransition
    // -----------------------------------------------------------------------

    @Test
    public void testTransitions() {
        DateTimeZone utc = DateTimeZone.UTC;
        Assert.assertTrue(utc.isFixed());
        Assert.assertEquals(12345L, utc.nextTransition(12345L));
        Assert.assertEquals(12345L, utc.previousTransition(12345L));

        DateTimeZone london = DateTimeZone.forID("Europe/London");
        Assert.assertFalse(london.isFixed());
        long next = london.nextTransition(0L);
        Assert.assertTrue(next > 0L);
        long prev = london.previousTransition(next);
        Assert.assertTrue(prev <= next);
    }

    // -----------------------------------------------------------------------
    // toTimeZone, equals, hashCode, toString, Serialization
    // -----------------------------------------------------------------------

    @Test
    public void testToTimeZone() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        TimeZone tz = london.toTimeZone();
        Assert.assertEquals("Europe/London", tz.getID());
    }

    @Test
    public void testEqualsAndHashCode() {
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(2);
        DateTimeZone zone2 = DateTimeZone.forOffsetHours(2);
        DateTimeZone zone3 = DateTimeZone.forOffsetHours(3);

        Assert.assertEquals(zone1, zone2);
        Assert.assertNotEquals(zone1, zone3);
        Assert.assertNotEquals(zone1, null);
        Assert.assertNotEquals(zone1, "NotAZone");

        Assert.assertEquals(zone1.hashCode(), zone2.hashCode());
    }

    @Test
    public void testToString() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        Assert.assertEquals("Europe/Paris", zone.toString());
        Assert.assertEquals("Europe/Paris", zone.getID());
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
        DateTimeZone deserialized = (DateTimeZone) ois.readObject();
        ois.close();

        Assert.assertSame(zone, deserialized);
    }
}
