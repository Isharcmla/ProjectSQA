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

    private DateTimeZone originalDefaultDateTimeZone;
    private TimeZone originalDefaultTimeZone;
    private Locale originalDefaultLocale;
    private Provider originalProvider;
    private NameProvider originalNameProvider;

    @Before
    public void setUp() {
        originalDefaultDateTimeZone = DateTimeZone.getDefault();
        originalDefaultTimeZone = TimeZone.getDefault();
        originalDefaultLocale = Locale.getDefault();
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefaultDateTimeZone);
        TimeZone.setDefault(originalDefaultTimeZone);
        Locale.setDefault(originalDefaultLocale);
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
    }

    @Test
    public void testGetDefault_notNull() {
        DateTimeZone def = DateTimeZone.getDefault();
        Assert.assertNotNull(def);
    }

    @Test
    public void testSetDefault_validZone() {
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
        DateTimeZone def = DateTimeZone.getDefault();
        Assert.assertEquals(def, DateTimeZone.forID(null));
    }

    @Test
    public void testForID_utc() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_validNamedZones() {
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        Assert.assertEquals("Europe/Paris", paris.getID());

        DateTimeZone tokyo = DateTimeZone.forID("Asia/Tokyo");
        Assert.assertEquals("Asia/Tokyo", tokyo.getID());

        DateTimeZone newYork = DateTimeZone.forID("America/New_York");
        Assert.assertEquals("America/New_York", newYork.getID());
    }

    @Test
    public void testForID_offsetStrings() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forID("-00:00"));

        DateTimeZone plusOne = DateTimeZone.forID("+01:00");
        Assert.assertEquals("+01:00", plusOne.getID());
        Assert.assertEquals(3600000, plusOne.getOffset(0L));

        DateTimeZone minusFive = DateTimeZone.forID("-05:00");
        Assert.assertEquals("-05:00", minusFive.getID());
        Assert.assertEquals(-18000000, minusFive.getOffset(0L));

        DateTimeZone customSec = DateTimeZone.forID("+01:23:45");
        Assert.assertEquals("+01:23:45", customSec.getID());

        DateTimeZone customMillis = DateTimeZone.forID("+01:23:45.678");
        Assert.assertEquals("+01:23:45.678", customMillis.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidString_throwsException() {
        DateTimeZone.forID("Invalid/NonExistent_Zone");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidOffsetFormat_throwsException() {
        DateTimeZone.forID("+invalid");
    }

    @Test
    public void testForOffsetHours_zero_returnsUTC() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHours_positiveAndNegative() {
        DateTimeZone plusTwo = DateTimeZone.forOffsetHours(2);
        Assert.assertEquals("+02:00", plusTwo.getID());
        Assert.assertEquals(7200000, plusTwo.getOffset(0L));

        DateTimeZone minusEight = DateTimeZone.forOffsetHours(-8);
        Assert.assertEquals("-08:00", minusEight.getID());
        Assert.assertEquals(-28800000, minusEight.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_tooLarge_throwsException() {
        DateTimeZone.forOffsetHours(1000000);
    }

    @Test
    public void testForOffsetHoursMinutes_zero_returnsUTC() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_validCombinations() {
        DateTimeZone plusFiveThirty = DateTimeZone.forOffsetHoursMinutes(5, 30);
        Assert.assertEquals("+05:30", plusFiveThirty.getID());
        Assert.assertEquals(19800000, plusFiveThirty.getOffset(0L));

        DateTimeZone minusTwoThirty = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        Assert.assertEquals("-02:30", minusTwoThirty.getID());
        Assert.assertEquals(-9000000, minusTwoThirty.getOffset(0L));

        DateTimeZone minusZeroFortyFive = DateTimeZone.forOffsetHoursMinutes(0, 45);
        Assert.assertEquals("+00:45", minusZeroFortyFive.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesNegative_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesGreaterThan59_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(1, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_overflow_throwsException() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 0);
    }

    @Test
    public void testForOffsetMillis_zero_returnsUTC() {
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_formattingVariantsAndCache() {
        DateTimeZone zone1 = DateTimeZone.forOffsetMillis(3600000);
        DateTimeZone zone2 = DateTimeZone.forOffsetMillis(3600000);
        Assert.assertSame(zone1, zone2);
        Assert.assertEquals("+01:00", zone1.getID());

        DateTimeZone negZone = DateTimeZone.forOffsetMillis(-3600000);
        Assert.assertEquals("-01:00", negZone.getID());

        DateTimeZone zoneWithSeconds = DateTimeZone.forOffsetMillis(3661000);
        Assert.assertEquals("+01:01:01", zoneWithSeconds.getID());

        DateTimeZone zoneWithMillis = DateTimeZone.forOffsetMillis(3661001);
        Assert.assertEquals("+01:01:01.001", zoneWithMillis.getID());
    }

    @Test
    public void testForTimeZone_null_returnsDefault() {
        Assert.assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_utc() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Assert.assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(tz));
    }

    @Test
    public void testForTimeZone_convertedAliases() {
        Assert.assertEquals(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT")));
        Assert.assertEquals(DateTimeZone.forID("America/New_York"), DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST")));
        Assert.assertEquals(DateTimeZone.forID("America/Los_Angeles"), DateTimeZone.forTimeZone(TimeZone.getTimeZone("PST")));
        Assert.assertEquals(DateTimeZone.forID("Europe/London"), DateTimeZone.forTimeZone(TimeZone.getTimeZone("WET")));
        Assert.assertEquals(DateTimeZone.forID("Asia/Tokyo"), DateTimeZone.forTimeZone(TimeZone.getTimeZone("JST")));
    }

    @Test
    public void testForTimeZone_customGmtDisplay() {
        TimeZone customTz = new TimeZone() {
            private static final long serialVersionUID = 1L;

            @Override
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
                return 7200000;
            }

            @Override
            public void setRawOffset(int offsetMillis) {}

            @Override
            public int getRawOffset() {
                return 7200000;
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
                return "CustomNonStandardID";
            }

            @Override
            public String getDisplayName() {
                return "GMT+02:00";
            }
        };

        DateTimeZone result = DateTimeZone.forTimeZone(customTz);
        Assert.assertEquals("+02:00", result.getID());
    }

    @Test
    public void testForTimeZone_customGmtZeroDisplay() {
        TimeZone customTz = new TimeZone() {
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
                return "CustomZeroID";
            }

            @Override
            public String getDisplayName() {
                return "GMT+00:00";
            }
        };

        DateTimeZone result = DateTimeZone.forTimeZone(customTz);
        Assert.assertSame(DateTimeZone.UTC, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_unknownZone_throwsException() {
        TimeZone customTz = new TimeZone() {
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
                return "UnrecognizedID_XYZ";
            }

            @Override
            public String getDisplayName() {
                return "CustomDisplayName";
            }
        };
        DateTimeZone.forTimeZone(customTz);
    }

    @Test
    public void testGetAvailableIDs() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        Assert.assertNotNull(ids);
        Assert.assertTrue(ids.contains("UTC"));
        Assert.assertTrue(ids.contains("Europe/London"));
    }

    @Test
    public void testSetProvider_valid() {
        Provider utcProvider = new UTCProvider();
        DateTimeZone.setProvider(utcProvider);
        Assert.assertSame(utcProvider, DateTimeZone.getProvider());

        DateTimeZone.setProvider(null);
        Assert.assertNotNull(DateTimeZone.getProvider());
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
                if ("UTC".equals(id)) {
                    return DateTimeZone.forOffsetHours(1);
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
    public void testSetNameProvider_valid() {
        NameProvider defNameProvider = new DefaultNameProvider();
        DateTimeZone.setNameProvider(defNameProvider);
        Assert.assertSame(defNameProvider, DateTimeZone.getNameProvider());

        DateTimeZone.setNameProvider(null);
        Assert.assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testNames_withLocaleAndNullLocale() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        long winterInstant = 0L;
        long summerInstant = 10000000000L;

        String shortWinter = london.getShortName(winterInstant);
        String shortWinterLocale = london.getShortName(winterInstant, Locale.UK);
        String shortSummer = london.getShortName(summerInstant, null);
        Assert.assertNotNull(shortWinter);
        Assert.assertNotNull(shortWinterLocale);
        Assert.assertNotNull(shortSummer);

        String longWinter = london.getName(winterInstant);
        String longWinterLocale = london.getName(winterInstant, Locale.UK);
        String longSummer = london.getName(summerInstant, null);
        Assert.assertNotNull(longWinter);
        Assert.assertNotNull(longWinterLocale);
        Assert.assertNotNull(longSummer);
    }

    @Test
    public void testNames_whenNameProviderReturnsNull() {
        NameProvider dummyProvider = new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) {
                return null;
            }

            public String getName(Locale locale, String id, String nameKey) {
                return null;
            }
        };
        DateTimeZone.setNameProvider(dummyProvider);
        DateTimeZone london = DateTimeZone.forID("Europe/London");

        String shortName = london.getShortName(0L, Locale.ENGLISH);
        String longName = london.getName(0L, Locale.ENGLISH);
        Assert.assertEquals("+00:00", shortName);
        Assert.assertEquals("+00:00", longName);
    }

    @Test
    public void testGetOffset_ReadableInstant() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        int offsetNow = london.getOffset((ReadableInstant) null);
        int offsetEpoch = london.getOffset(new Instant(0L));
        Assert.assertEquals(0, offsetEpoch);
        Assert.assertTrue(offsetNow == 0 || offsetNow == 3600000);
    }

    @Test
    public void testIsStandardOffset() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        Assert.assertTrue(london.isStandardOffset(0L)); // Winter 1970
    }

    @Test
    public void testGetOffsetFromLocal() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        Assert.assertEquals(0, london.getOffsetFromLocal(0L));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        // Spring forward gap 2007-03-11 02:30:00 local (1173598200000L approx)
        long localGapInstant = new DateTime(2007, 3, 11, 2, 30, 0, 0, DateTimeZone.UTC).getMillis();
        int offsetGap = ny.getOffsetFromLocal(localGapInstant);
        Assert.assertTrue(offsetGap == -18000000 || offsetGap == -14400000);

        DateTimeZone fixed = DateTimeZone.forOffsetHours(2);
        Assert.assertEquals(7200000, fixed.getOffsetFromLocal(0L));
    }

    @Test
    public void testConvertUTCToLocal_normal() {
        DateTimeZone plusTwo = DateTimeZone.forOffsetHours(2);
        Assert.assertEquals(7200000L, plusTwo.convertUTCToLocal(0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflowPositive() {
        DateTimeZone plusTwo = DateTimeZone.forOffsetHours(2);
        plusTwo.convertUTCToLocal(Long.MAX_VALUE - 100);
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflowNegative() {
        DateTimeZone minusTwo = DateTimeZone.forOffsetHours(-2);
        minusTwo.convertUTCToLocal(Long.MIN_VALUE + 100);
    }

    @Test
    public void testConvertLocalToUTC_strictAndNonStrict() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        long normalLocal = new DateTime(2007, 6, 1, 12, 0, 0, 0, DateTimeZone.UTC).getMillis();
        long utcStrict = ny.convertLocalToUTC(normalLocal, true);
        long utcNonStrict = ny.convertLocalToUTC(normalLocal, false);
        Assert.assertEquals(utcStrict, utcNonStrict);

        // DST Gap instant
        long gapLocal = new DateTime(2007, 3, 11, 2, 30, 0, 0, DateTimeZone.UTC).getMillis();
        long nonStrictUtc = ny.convertLocalToUTC(gapLocal, false);
        Assert.assertTrue(nonStrictUtc > 0);

        try {
            ny.convertLocalToUTC(gapLocal, true);
            Assert.fail("Expected IllegalArgumentException on strict conversion in DST gap");
        } catch (IllegalArgumentException ex) {
            // Expected
        }
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_overflow() {
        DateTimeZone minusTwo = DateTimeZone.forOffsetHours(-2);
        minusTwo.convertLocalToUTC(Long.MAX_VALUE - 100, false);
    }

    @Test
    public void testGetMillisKeepLocal() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");

        Assert.assertEquals(1000L, london.getMillisKeepLocal(london, 1000L));
        Assert.assertEquals(1000L, london.getMillisKeepLocal(null, 1000L) == 1000L ? 1000L : london.getMillisKeepLocal(null, 1000L));

        long converted = london.getMillisKeepLocal(paris, 0L);
        Assert.assertEquals(-3600000L, converted);
    }

    @Test
    public void testIsLocalDateTimeGap() {
        DateTimeZone fixed = DateTimeZone.forOffsetHours(1);
        LocalDateTime ldt = new LocalDateTime(2007, 3, 11, 2, 30, 0);
        Assert.assertFalse(fixed.isLocalDateTimeGap(ldt));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        Assert.assertTrue(ny.isLocalDateTimeGap(ldt));

        LocalDateTime normalLdt = new LocalDateTime(2007, 6, 1, 12, 0, 0);
        Assert.assertFalse(ny.isLocalDateTimeGap(normalLdt));
    }

    @Test
    public void testToTimeZone_hashCode_toString_equals() {
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        TimeZone tz = paris.toTimeZone();
        Assert.assertEquals("Europe/Paris", tz.getID());

        Assert.assertEquals("Europe/Paris", paris.toString());
        Assert.assertEquals(57 + "Europe/Paris".hashCode(), paris.hashCode());

        Assert.assertTrue(paris.equals(paris));
        Assert.assertFalse(paris.equals(DateTimeZone.UTC));
        Assert.assertFalse(paris.equals("Europe/Paris"));
        Assert.assertFalse(paris.equals(null));
    }

    @Test
    public void testSerialization() throws Exception {
        DateTimeZone[] zones = new DateTimeZone[] {
            DateTimeZone.UTC,
            DateTimeZone.forID("Europe/Paris"),
            DateTimeZone.forOffsetHours(3),
            DateTimeZone.forOffsetMillis(123456)
        };

        for (DateTimeZone zone : zones) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(zone);
            oos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            DateTimeZone deserialized = (DateTimeZone) ois.readObject();
            ois.close();

            Assert.assertEquals(zone, deserialized);
            Assert.assertEquals(zone.getID(), deserialized.getID());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCustomSubclass_nullId_throwsException() {
        new MockDateTimeZone(null);
    }

    @Test
    public void testCustomSubclass_nullNameKey_returnsID() {
        MockDateTimeZone mockZone = new MockDateTimeZone("MockZone");
        Assert.assertEquals("MockZone", mockZone.getNameKey(0L));
        mockZone.nameKeyToReturn = null;
        Assert.assertEquals("MockZone", mockZone.getName(0L, Locale.ENGLISH));
        Assert.assertEquals("MockZone", mockZone.getShortName(0L, Locale.ENGLISH));
    }

    private static class MockDateTimeZone extends DateTimeZone {
        private static final long serialVersionUID = 1L;
        String nameKeyToReturn = "MockZone";

        MockDateTimeZone(String id) {
            super(id);
        }

        @Override
        public String getNameKey(long instant) {
            return nameKeyToReturn;
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
            return this == object;
        }
    }
}
