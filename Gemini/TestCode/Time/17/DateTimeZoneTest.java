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

    private DateTimeZone defaultZone;
    private Provider defaultProvider;
    private NameProvider defaultNameProvider;

    @Before
    public void setUp() {
        defaultZone = DateTimeZone.getDefault();
        defaultProvider = DateTimeZone.getProvider();
        defaultNameProvider = DateTimeZone.getNameProvider();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(defaultZone);
        DateTimeZone.setProvider(defaultProvider);
        DateTimeZone.setNameProvider(defaultNameProvider);
    }

    @Test
    public void testGetDefault_returnsNonNullZone() {
        DateTimeZone zone = DateTimeZone.getDefault();
        Assert.assertNotNull(zone);
    }

    @Test
    public void testSetDefault_validZone_changesDefault() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        DateTimeZone.setDefault(london);
        Assert.assertEquals(london, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_nullZone_throwsException() {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void testForID_nullId_returnsDefault() {
        DateTimeZone zone = DateTimeZone.forID(null);
        Assert.assertEquals(DateTimeZone.getDefault(), zone);
    }

    @Test
    public void testForID_utcId_returnsUTC() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForID_validOffsetString_returnsCorrectZone() {
        DateTimeZone zonePlus = DateTimeZone.forID("+02:00");
        Assert.assertEquals("+02:00", zonePlus.getID());
        Assert.assertEquals(2 * 3600000, zonePlus.getOffset(0L));

        DateTimeZone zoneMinus = DateTimeZone.forID("-05:00");
        Assert.assertEquals("-05:00", zoneMinus.getID());
        Assert.assertEquals(-5 * 3600000, zoneMinus.getOffset(0L));

        DateTimeZone zoneZero = DateTimeZone.forID("+00:00");
        Assert.assertSame(DateTimeZone.UTC, zoneZero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidString_throwsException() {
        DateTimeZone.forID("Invalid/Zone_Name");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_emptyString_throwsException() {
        DateTimeZone.forID("");
    }

    @Test
    public void testForOffsetHours_validHours_returnsZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        Assert.assertEquals("+03:00", zone.getID());
        Assert.assertEquals(3 * 3600000, zone.getOffset(0L));

        DateTimeZone zoneZero = DateTimeZone.forOffsetHours(0);
        Assert.assertSame(DateTimeZone.UTC, zoneZero);

        DateTimeZone zoneNeg = DateTimeZone.forOffsetHours(-4);
        Assert.assertEquals("-04:00", zoneNeg.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_tooLarge_throwsException() {
        DateTimeZone.forOffsetHours(1000000);
    }

    @Test
    public void testForOffsetHoursMinutes_validInputs_returnsZone() {
        DateTimeZone zone1 = DateTimeZone.forOffsetHoursMinutes(0, 0);
        Assert.assertSame(DateTimeZone.UTC, zone1);

        DateTimeZone zone2 = DateTimeZone.forOffsetHoursMinutes(5, 30);
        Assert.assertEquals("+05:30", zone2.getID());
        Assert.assertEquals((5 * 60 + 30) * 60000, zone2.getOffset(0L));

        DateTimeZone zone3 = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        Assert.assertEquals("-02:30", zone3.getID());
        Assert.assertEquals((-2 * 60 - 30) * 60000, zone3.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_negativeMinutes_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(2, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_tooLargeMinutes_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(2, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_overflow_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 30);
    }

    @Test
    public void testForOffsetMillis_variousValues_returnsZone() {
        DateTimeZone zoneZero = DateTimeZone.forOffsetMillis(0);
        Assert.assertSame(DateTimeZone.UTC, zoneZero);

        DateTimeZone zonePositive = DateTimeZone.forOffsetMillis(3600000);
        Assert.assertEquals("+01:00", zonePositive.getID());

        DateTimeZone zoneWithSeconds = DateTimeZone.forOffsetMillis(3661000);
        Assert.assertEquals("+01:01:01", zoneWithSeconds.getID());

        DateTimeZone zoneWithMillis = DateTimeZone.forOffsetMillis(3661005);
        Assert.assertEquals("+01:01:01.005", zoneWithMillis.getID());

        DateTimeZone zoneNegativeWithMillis = DateTimeZone.forOffsetMillis(-3661005);
        Assert.assertEquals("-01:01:01.005", zoneNegativeWithMillis.getID());

        // Test caching of fixed offset zones
        DateTimeZone cachedZone = DateTimeZone.forOffsetMillis(3661005);
        Assert.assertSame(zoneWithMillis, cachedZone);
    }

    @Test
    public void testForTimeZone_nullZone_returnsDefault() {
        DateTimeZone zone = DateTimeZone.forTimeZone(null);
        Assert.assertEquals(DateTimeZone.getDefault(), zone);
    }

    @Test
    public void testForTimeZone_utcZone_returnsUTC() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForTimeZone_convertedAliases_returnsZone() {
        TimeZone tzPST = TimeZone.getTimeZone("PST");
        DateTimeZone zonePST = DateTimeZone.forTimeZone(tzPST);
        Assert.assertEquals("America/Los_Angeles", zonePST.getID());

        TimeZone tzGMT = TimeZone.getTimeZone("GMT");
        DateTimeZone zoneGMT = DateTimeZone.forTimeZone(tzGMT);
        Assert.assertSame(DateTimeZone.UTC, zoneGMT);

        TimeZone tzEST = TimeZone.getTimeZone("EST");
        DateTimeZone zoneEST = DateTimeZone.forTimeZone(tzEST);
        Assert.assertEquals("America/New_York", zoneEST.getID());
    }

    @Test
    public void testForTimeZone_customGmtOffset() {
        TimeZone tzCustom1 = TimeZone.getTimeZone("GMT+08:00");
        DateTimeZone zoneCustom1 = DateTimeZone.forTimeZone(tzCustom1);
        Assert.assertEquals("+08:00", zoneCustom1.getID());

        TimeZone tzCustom2 = TimeZone.getTimeZone("GMT-05:00");
        DateTimeZone zoneCustom2 = DateTimeZone.forTimeZone(tzCustom2);
        Assert.assertEquals("-05:00", zoneCustom2.getID());

        TimeZone tzCustom0 = TimeZone.getTimeZone("GMT+00:00");
        DateTimeZone zoneCustom0 = DateTimeZone.forTimeZone(tzCustom0);
        Assert.assertSame(DateTimeZone.UTC, zoneCustom0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_invalidTimeZone_throwsException() {
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
                return "UnknownZoneID";
            }

            @Override
            public String getDisplayName(boolean daylight, int style, Locale locale) {
                return "CustomZoneName";
            }
        };
        DateTimeZone.forTimeZone(tz);
    }

    @Test
    public void testGetAvailableIDs_returnsNonEmptySet() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        Assert.assertNotNull(ids);
        Assert.assertTrue(ids.contains("UTC"));
    }

    @Test
    public void testSetProvider_customAndDefault() {
        Provider custom = new UTCProvider();
        DateTimeZone.setProvider(custom);
        Assert.assertSame(custom, DateTimeZone.getProvider());

        DateTimeZone.setProvider(null);
        Assert.assertNotNull(DateTimeZone.getProvider());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_emptyProvider_throwsException() {
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
    public void testSetProvider_missingUTC_throwsException() {
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
    public void testSetProvider_invalidUTCZone_throwsException() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) {
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
    public void testSetNameProvider_customAndDefault() {
        NameProvider custom = new DefaultNameProvider();
        DateTimeZone.setNameProvider(custom);
        Assert.assertSame(custom, DateTimeZone.getNameProvider());

        DateTimeZone.setNameProvider(null);
        Assert.assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testGetShortName_variousLocales() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        long instant = 0L;
        String shortNameDefault = london.getShortName(instant);
        Assert.assertNotNull(shortNameDefault);

        String shortNameLocale = london.getShortName(instant, Locale.UK);
        Assert.assertNotNull(shortNameLocale);

        DateTimeZone fixed = DateTimeZone.forOffsetHours(2);
        Assert.assertEquals("+02:00", fixed.getShortName(instant, Locale.ENGLISH));
    }

    @Test
    public void testGetName_variousLocales() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        long instant = 0L;
        String nameDefault = london.getName(instant);
        Assert.assertNotNull(nameDefault);

        String nameLocale = london.getName(instant, Locale.UK);
        Assert.assertNotNull(nameLocale);

        DateTimeZone fixed = DateTimeZone.forOffsetHours(2);
        Assert.assertEquals("+02:00", fixed.getName(instant, Locale.ENGLISH));
    }

    @Test
    public void testGetOffset_readableInstant() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        ReadableInstant instant = new Instant(0L);
        Assert.assertEquals(zone.getOffset(0L), zone.getOffset(instant));
        Assert.assertEquals(zone.getOffset(DateTimeUtils.currentTimeMillis()), zone.getOffset((ReadableInstant) null));
    }

    @Test
    public void testIsStandardOffset() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        // Winter in London is standard time (offset 0)
        long winterInstant = new DateTime(2020, 1, 1, 0, 0, DateTimeZone.UTC).getMillis();
        Assert.assertTrue(zone.isStandardOffset(winterInstant));

        // Summer in London is DST (offset +1 hour)
        long summerInstant = new DateTime(2020, 7, 1, 0, 0, DateTimeZone.UTC).getMillis();
        Assert.assertFalse(zone.isStandardOffset(summerInstant));
    }

    @Test
    public void testGetOffsetFromLocal() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long instant = new DateTime(2020, 1, 1, 12, 0, zone).getMillis();
        Assert.assertEquals(0, zone.getOffsetFromLocal(instant));

        DateTimeZone fixed = DateTimeZone.forOffsetHours(5);
        Assert.assertEquals(5 * 3600000, fixed.getOffsetFromLocal(0L));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        // Spring forward gap in New York: 2020-03-08 02:30 does not exist
        long gapLocal = new DateTime(2020, 3, 8, 2, 30, DateTimeZone.UTC).getMillis();
        int offset = ny.getOffsetFromLocal(gapLocal);
        Assert.assertTrue(offset == -5 * 3600000 || offset == -4 * 3600000);

        // Fall back overlap in New York: 2020-11-01 01:30 occurs twice
        long overlapLocal = new DateTime(2020, 11, 1, 1, 30, DateTimeZone.UTC).getMillis();
        Assert.assertEquals(-4 * 3600000, ny.getOffsetFromLocal(overlapLocal));
    }

    @Test
    public void testConvertUTCToLocal_normalAndOverflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        Assert.assertEquals(7200000L, zone.convertUTCToLocal(0L));

        try {
            zone.convertUTCToLocal(Long.MAX_VALUE);
            Assert.fail("Should throw ArithmeticException on overflow");
        } catch (ArithmeticException expected) {}
    }

    @Test
    public void testConvertLocalToUTC_booleanStrict() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        Assert.assertEquals(-7200000L, zone.convertLocalToUTC(0L, false));
        Assert.assertEquals(-7200000L, zone.convertLocalToUTC(0L, true));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        // Spring forward gap in New York (2020-03-08 02:30:00 local time)
        long gapLocal = new DateTime(2020, 3, 8, 2, 30, DateTimeZone.UTC).getMillis();
        try {
            ny.convertLocalToUTC(gapLocal, true);
            Assert.fail("Should throw IllegalArgumentException when strict in gap");
        } catch (IllegalArgumentException expected) {}

        long nonStrictUTC = ny.convertLocalToUTC(gapLocal, false);
        Assert.assertTrue(nonStrictUTC > 0);

        try {
            DateTimeZone.forOffsetHours(-2).convertLocalToUTC(Long.MAX_VALUE, false);
            Assert.fail("Should throw ArithmeticException on overflow");
        } catch (ArithmeticException expected) {}
    }

    @Test
    public void testConvertLocalToUTC_withOriginalInstantUTC() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        long overlapLocal = new DateTime(2020, 11, 1, 1, 30, DateTimeZone.UTC).getMillis();
        long originalUTC = new DateTime(2020, 11, 1, 1, 30, ny).getMillis();

        long result = ny.convertLocalToUTC(overlapLocal, false, originalUTC);
        Assert.assertEquals(overlapLocal - ny.getOffset(originalUTC), result);
    }

    @Test
    public void testGetMillisKeepLocal() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");

        long instant = new DateTime(2020, 1, 1, 12, 0, DateTimeZone.UTC).getMillis();
        long converted = london.getMillisKeepLocal(paris, instant);
        Assert.assertEquals(instant - 3600000, converted);

        Assert.assertEquals(instant, london.getMillisKeepLocal(london, instant));
        Assert.assertEquals(london.getMillisKeepLocal(DateTimeZone.getDefault(), instant),
                london.getMillisKeepLocal(null, instant));
    }

    @Test
    public void testIsLocalDateTimeGap() {
        DateTimeZone fixed = DateTimeZone.forOffsetHours(0);
        LocalDateTime ldt = new LocalDateTime(2020, 3, 8, 2, 30);
        Assert.assertFalse(fixed.isLocalDateTimeGap(ldt));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        Assert.assertTrue(ny.isLocalDateTimeGap(ldt));

        LocalDateTime nonGapLdt = new LocalDateTime(2020, 3, 8, 12, 0);
        Assert.assertFalse(ny.isLocalDateTimeGap(nonGapLdt));
    }

    @Test
    public void testAdjustOffset() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        // Fall back overlap: 2020-11-01 01:30:00 EDT / EST
        long instant = new DateTime(2020, 11, 1, 1, 30, DateTimeZone.forOffsetHours(-4)).getMillis();
        long earlier = ny.adjustOffset(instant, false);
        long later = ny.adjustOffset(instant, true);
        Assert.assertTrue(earlier < later);

        // Regular instant
        long regular = new DateTime(2020, 1, 1, 12, 0, DateTimeZone.UTC).getMillis();
        Assert.assertEquals(regular, ny.adjustOffset(regular, true));
        Assert.assertEquals(regular, ny.adjustOffset(regular, false));
    }

    @Test
    public void testToTimeZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        TimeZone tz = zone.toTimeZone();
        Assert.assertNotNull(tz);
        Assert.assertEquals("Europe/Paris", tz.getID());
    }

    @Test
    public void testHashCodeAndToString() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        Assert.assertEquals("UTC", zone.toString());
        Assert.assertEquals(57 + "UTC".hashCode(), zone.hashCode());
    }

    @Test
    public void testSerialization() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(zone);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        DateTimeZone result = (DateTimeZone) ois.readObject();
        ois.close();

        Assert.assertEquals(zone, result);
    }
}
