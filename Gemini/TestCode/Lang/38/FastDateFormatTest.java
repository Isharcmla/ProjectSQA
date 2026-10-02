package org.apache.commons.lang3.time;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class FastDateFormatTest {

    @Test
    public void testGetInstance_default_success() {
        FastDateFormat fdf = FastDateFormat.getInstance();
        Assert.assertNotNull(fdf);
        Assert.assertNotNull(fdf.getPattern());
        Assert.assertEquals(Locale.getDefault(), fdf.getLocale());
        Assert.assertEquals(TimeZone.getDefault(), fdf.getTimeZone());
        Assert.assertFalse(fdf.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstance_patternOnly_success() {
        String pattern = "yyyy-MM-dd";
        FastDateFormat fdf = FastDateFormat.getInstance(pattern);
        Assert.assertEquals(pattern, fdf.getPattern());
    }

    @Test
    public void testGetInstance_patternAndTimeZone_success() {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        TimeZone tz = TimeZone.getTimeZone("GMT+0");
        FastDateFormat fdf = FastDateFormat.getInstance(pattern, tz);
        Assert.assertEquals(pattern, fdf.getPattern());
        Assert.assertEquals(tz, fdf.getTimeZone());
        Assert.assertTrue(fdf.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstance_patternAndLocale_success() {
        String pattern = "yyyy-MMM-dd";
        Locale locale = Locale.GERMANY;
        FastDateFormat fdf = FastDateFormat.getInstance(pattern, locale);
        Assert.assertEquals(pattern, fdf.getPattern());
        Assert.assertEquals(locale, fdf.getLocale());
    }

    @Test
    public void testGetInstance_allParameters_cached() {
        String pattern = "yyyy/MM/dd";
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Locale locale = Locale.US;
        FastDateFormat fdf1 = FastDateFormat.getInstance(pattern, tz, locale);
        FastDateFormat fdf2 = FastDateFormat.getInstance(pattern, tz, locale);
        Assert.assertSame(fdf1, fdf2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_nullPattern_throwsException() {
        FastDateFormat.getInstance(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_illegalPattern_throwsException() {
        FastDateFormat.getInstance("yyyy-MM-dd Q");
    }

    @Test
    public void testGetDateInstance_styleOnly_success() {
        FastDateFormat fdf = FastDateFormat.getDateInstance(FastDateFormat.SHORT);
        Assert.assertNotNull(fdf);
    }

    @Test
    public void testGetDateInstance_styleAndLocale_success() {
        FastDateFormat fdf = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM, Locale.FRANCE);
        Assert.assertNotNull(fdf);
        Assert.assertEquals(Locale.FRANCE, fdf.getLocale());
    }

    @Test
    public void testGetDateInstance_styleAndTimeZone_success() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        FastDateFormat fdf = FastDateFormat.getDateInstance(FastDateFormat.LONG, tz);
        Assert.assertNotNull(fdf);
        Assert.assertEquals(tz, fdf.getTimeZone());
    }

    @Test
    public void testGetDateInstance_styleTimeZoneLocale_cached() {
        TimeZone tz = TimeZone.getTimeZone("Europe/London");
        FastDateFormat fdf1 = FastDateFormat.getDateInstance(FastDateFormat.FULL, tz, Locale.UK);
        FastDateFormat fdf2 = FastDateFormat.getDateInstance(FastDateFormat.FULL, tz, Locale.UK);
        Assert.assertSame(fdf1, fdf2);
    }

    @Test
    public void testGetTimeInstance_styleOnly_success() {
        FastDateFormat fdf = FastDateFormat.getTimeInstance(FastDateFormat.SHORT);
        Assert.assertNotNull(fdf);
    }

    @Test
    public void testGetTimeInstance_styleAndLocale_success() {
        FastDateFormat fdf = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM, Locale.GERMANY);
        Assert.assertNotNull(fdf);
        Assert.assertEquals(Locale.GERMANY, fdf.getLocale());
    }

    @Test
    public void testGetTimeInstance_styleAndTimeZone_success() {
        TimeZone tz = TimeZone.getTimeZone("Asia/Tokyo");
        FastDateFormat fdf = FastDateFormat.getTimeInstance(FastDateFormat.LONG, tz);
        Assert.assertNotNull(fdf);
        Assert.assertEquals(tz, fdf.getTimeZone());
    }

    @Test
    public void testGetTimeInstance_styleTimeZoneLocale_cached() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat fdf1 = FastDateFormat.getTimeInstance(FastDateFormat.FULL, tz, Locale.JAPAN);
        FastDateFormat fdf2 = FastDateFormat.getTimeInstance(FastDateFormat.FULL, tz, Locale.JAPAN);
        Assert.assertSame(fdf1, fdf2);
    }

    @Test
    public void testGetDateTimeInstance_dateStyleAndTimeStyle_success() {
        FastDateFormat fdf = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT);
        Assert.assertNotNull(fdf);
    }

    @Test
    public void testGetDateTimeInstance_stylesAndLocale_success() {
        FastDateFormat fdf = FastDateFormat.getDateTimeInstance(FastDateFormat.MEDIUM, FastDateFormat.LONG, Locale.ITALY);
        Assert.assertNotNull(fdf);
        Assert.assertEquals(Locale.ITALY, fdf.getLocale());
    }

    @Test
    public void testGetDateTimeInstance_stylesAndTimeZone_success() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat fdf = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.SHORT, tz);
        Assert.assertNotNull(fdf);
        Assert.assertEquals(tz, fdf.getTimeZone());
    }

    @Test
    public void testGetDateTimeInstance_stylesTimeZoneLocale_cached() {
        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        FastDateFormat fdf1 = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL, tz, Locale.US);
        FastDateFormat fdf2 = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL, tz, Locale.US);
        Assert.assertSame(fdf1, fdf2);
    }

    @Test
    public void testFormat_objectTypes_success() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2023, Calendar.JANUARY, 15, 10, 20, 30);
        Date date = cal.getTime();
        long millis = date.getTime();

        StringBuffer sbDate = fdf.format((Object) date, new StringBuffer(), new FieldPosition(0));
        StringBuffer sbCal = fdf.format((Object) cal, new StringBuffer(), new FieldPosition(0));
        StringBuffer sbLong = fdf.format((Object) Long.valueOf(millis), new StringBuffer(), new FieldPosition(0));

        Assert.assertNotNull(sbDate);
        Assert.assertNotNull(sbCal);
        Assert.assertNotNull(sbLong);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormat_nullObject_throwsException() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");
        fdf.format((Object) null, new StringBuffer(), new FieldPosition(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormat_unsupportedObject_throwsException() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");
        fdf.format("2023-01-01", new StringBuffer(), new FieldPosition(0));
    }

    @Test
    public void testFormat_primitiveLongAndDateAndCalendar_overloads() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(2023, Calendar.MARCH, 25, 14, 30, 45);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        long millis = date.getTime();

        String expected = "2023-03-25 14:30:45.123";

        Assert.assertEquals(expected, fdf.format(millis));
        Assert.assertEquals(expected, fdf.format(date));
        Assert.assertEquals(expected, fdf.format(cal));

        StringBuffer buf1 = new StringBuffer();
        fdf.format(millis, buf1);
        Assert.assertEquals(expected, buf1.toString());

        StringBuffer buf2 = new StringBuffer();
        fdf.format(date, buf2);
        Assert.assertEquals(expected, buf2.toString());

        StringBuffer buf3 = new StringBuffer();
        fdf.format(cal, buf3);
        Assert.assertEquals(expected, buf3.toString());
    }

    @Test
    public void testFormat_unforcedTimeZoneUsesCalendarTimeZone() {
        FastDateFormat fdf = FastDateFormat.getInstance("HH:mm");
        Assert.assertFalse(fdf.getTimeZoneOverridesCalendar());

        Calendar calUtc = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calUtc.set(2023, Calendar.JANUARY, 1, 12, 0, 0);

        Calendar calPlus5 = Calendar.getInstance(TimeZone.getTimeZone("GMT+5"));
        calPlus5.set(2023, Calendar.JANUARY, 1, 12, 0, 0);

        Assert.assertEquals(fdf.format(calUtc), "12:00");
        Assert.assertEquals(fdf.format(calPlus5), "12:00");
    }

    @Test
    public void testFormat_forcedTimeZoneOverridesCalendarTimeZone() {
        TimeZone tzUtc = TimeZone.getTimeZone("UTC");
        FastDateFormat fdf = FastDateFormat.getInstance("HH:mm", tzUtc);
        Assert.assertTrue(fdf.getTimeZoneOverridesCalendar());

        Calendar calPlus5 = Calendar.getInstance(TimeZone.getTimeZone("GMT+05:00"));
        calPlus5.set(Calendar.YEAR, 2023);
        calPlus5.set(Calendar.MONTH, Calendar.JANUARY);
        calPlus5.set(Calendar.DAY_OF_MONTH, 1);
        calPlus5.set(Calendar.HOUR_OF_DAY, 17);
        calPlus5.set(Calendar.MINUTE, 0);
        calPlus5.set(Calendar.SECOND, 0);

        Assert.assertEquals("12:00", fdf.format(calPlus5));
    }

    @Test
    public void testParseObject_unsupportedOperation_returnsNullAndResetsPosition() {
        FastDateFormat fdf = FastDateFormat.getInstance();
        ParsePosition pos = new ParsePosition(5);
        pos.setErrorIndex(3);
        Object result = fdf.parseObject("2023-01-01", pos);
        Assert.assertNull(result);
        Assert.assertEquals(0, pos.getIndex());
        Assert.assertEquals(0, pos.getErrorIndex());
    }

    @Test
    public void testGettersAndEstimates() {
        String pattern = "yyyy-MM-dd G 'at' HH:mm:ss z";
        FastDateFormat fdf = FastDateFormat.getInstance(pattern, TimeZone.getTimeZone("UTC"), Locale.ENGLISH);
        Assert.assertEquals(pattern, fdf.getPattern());
        Assert.assertEquals(TimeZone.getTimeZone("UTC"), fdf.getTimeZone());
        Assert.assertEquals(Locale.ENGLISH, fdf.getLocale());
        Assert.assertTrue(fdf.getMaxLengthEstimate() > 0);
    }

    @Test
    public void testEqualsAndHashCode() {
        FastDateFormat fdf1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateFormat fdf2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateFormat fdf3 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat fdf4 = FastDateFormat.getInstance("yyyy/MM/dd", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateFormat fdf5 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.UK);
        FastDateFormat fdfUnforced = FastDateFormat.getInstance("yyyy-MM-dd", Locale.US);

        Assert.assertEquals(fdf1, fdf1);
        Assert.assertEquals(fdf1, fdf2);
        Assert.assertEquals(fdf1.hashCode(), fdf2.hashCode());

        Assert.assertFalse(fdf1.equals(null));
        Assert.assertFalse(fdf1.equals("Some String"));
        Assert.assertFalse(fdf1.equals(fdf3));
        Assert.assertFalse(fdf1.equals(fdf4));
        Assert.assertFalse(fdf1.equals(fdf5));
        Assert.assertFalse(fdf1.equals(fdfUnforced));
    }

    @Test
    public void testToString_formattedPatternIncluded() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");
        Assert.assertEquals("FastDateFormat[yyyy-MM-dd]", fdf.toString());
    }

    @Test
    public void testSerialization_roundTrip_validState() throws Exception {
        FastDateFormat original = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS Z", TimeZone.getTimeZone("UTC"), Locale.US);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        FastDateFormat deserialized = (FastDateFormat) ois.readObject();
        ois.close();

        Assert.assertEquals(original, deserialized);
        Date date = new Date(1672531199000L);
        Assert.assertEquals(original.format(date), deserialized.format(date));
    }

    @Test
    public void testPattern_allTokenRulesAndEdgeCases() {
        String pattern = "G yyyy yy MMMM MMM MM M d h H m s SSS S EEEE E D F w W a k K z zzzz Z ZZ '' 'literal' 'o''clock'";
        FastDateFormat fdf = FastDateFormat.getInstance(pattern, TimeZone.getTimeZone("America/New_York"), Locale.US);

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"), Locale.US);
        cal.set(2023, Calendar.JULY, 4, 0, 5, 9);
        cal.set(Calendar.MILLISECOND, 8);
        cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);

        String result = fdf.format(cal);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("AD"));
        Assert.assertTrue(result.contains("2023"));
        Assert.assertTrue(result.contains("23"));
        Assert.assertTrue(result.contains("July"));
        Assert.assertTrue(result.contains("Jul"));
        Assert.assertTrue(result.contains("07"));
        Assert.assertTrue(result.contains("7"));
        Assert.assertTrue(result.contains("4"));
        Assert.assertTrue(result.contains("12"));
        Assert.assertTrue(result.contains("00"));
        Assert.assertTrue(result.contains("05"));
        Assert.assertTrue(result.contains("09"));
        Assert.assertTrue(result.contains("008"));
        Assert.assertTrue(result.contains("Tuesday"));
        Assert.assertTrue(result.contains("Tue"));
        Assert.assertTrue(result.contains("AM"));
        Assert.assertTrue(result.contains("24"));
        Assert.assertTrue(result.contains("0"));
        Assert.assertTrue(result.contains("literal"));
        Assert.assertTrue(result.contains("o'clock"));
        Assert.assertTrue(result.contains("-0400"));
        Assert.assertTrue(result.contains("-04:00"));
    }

    @Test
    public void testPattern_positiveTimeZoneOffsets() {
        FastDateFormat fdfNoColon = FastDateFormat.getInstance("Z", TimeZone.getTimeZone("GMT+0530"), Locale.US);
        FastDateFormat fdfColon = FastDateFormat.getInstance("ZZ", TimeZone.getTimeZone("GMT+0530"), Locale.US);

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+0530"));
        cal.setTimeInMillis(0L);

        Assert.assertEquals("+0530", fdfNoColon.format(cal));
        Assert.assertEquals("+05:30", fdfColon.format(cal));
    }

    @Test
    public void testPattern_negativeTimeZoneOffsets() {
        FastDateFormat fdfNoColon = FastDateFormat.getInstance("Z", TimeZone.getTimeZone("GMT-0800"), Locale.US);
        FastDateFormat fdfColon = FastDateFormat.getInstance("ZZ", TimeZone.getTimeZone("GMT-0800"), Locale.US);

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT-0800"));
        cal.setTimeInMillis(0L);

        Assert.assertEquals("-0800", fdfNoColon.format(cal));
        Assert.assertEquals("-08:00", fdfColon.format(cal));
    }

    @Test
    public void testPattern_twelveHourAndTwentyFourHourNonZero() {
        FastDateFormat fdf12 = FastDateFormat.getInstance("h", Locale.US);
        FastDateFormat fdf24 = FastDateFormat.getInstance("k", Locale.US);

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(Calendar.HOUR_OF_DAY, 15);
        Assert.assertEquals("3", fdf12.format(cal));
        Assert.assertEquals("15", fdf24.format(cal));
    }

    @Test
    public void testPattern_unpaddedAndPaddedNumbersFormatting() {
        FastDateFormat fdfPadded = FastDateFormat.getInstance("yyyyy SSSSS d", Locale.US);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.DAY_OF_MONTH, 9);
        cal.set(Calendar.MILLISECOND, 42);

        String formatted = fdfPadded.format(cal);
        Assert.assertTrue(formatted.startsWith("02023 00042 9"));

        cal.set(Calendar.MILLISECOND, 500);
        String formatted500 = fdfPadded.format(cal);
        Assert.assertTrue(formatted500.contains("00500"));

        cal.set(Calendar.YEAR, 12023);
        String formattedLarge = fdfPadded.format(cal);
        Assert.assertTrue(formattedLarge.contains("12023"));
    }

    @Test
    public void testPattern_unforcedTimeZoneDaylightAndStandard() {
        FastDateFormat fdfShort = FastDateFormat.getInstance("z", Locale.US);
        FastDateFormat fdfLong = FastDateFormat.getInstance("zzzz", Locale.US);
        Assert.assertFalse(fdfShort.getTimeZoneOverridesCalendar());

        SimpleTimeZone dstTz = new SimpleTimeZone(
                -5 * 3600 * 1000,
                "America/New_York",
                Calendar.MARCH, 2, Calendar.SUNDAY, 2 * 3600 * 1000,
                Calendar.NOVEMBER, 1, Calendar.SUNDAY, 2 * 3600 * 1000
        );

        Calendar calWinter = Calendar.getInstance(dstTz, Locale.US);
        calWinter.set(2023, Calendar.JANUARY, 15, 12, 0, 0);

        Calendar calSummer = Calendar.getInstance(dstTz, Locale.US);
        calSummer.set(2023, Calendar.JULY, 15, 12, 0, 0);

        Assert.assertNotNull(fdfShort.format(calWinter));
        Assert.assertNotNull(fdfShort.format(calSummer));
        Assert.assertNotNull(fdfLong.format(calWinter));
        Assert.assertNotNull(fdfLong.format(calSummer));
    }

    @Test
    public void testGetTimeZoneDisplay_staticMethodCache() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        String standardShort = FastDateFormat.getTimeZoneDisplay(tz, false, TimeZone.SHORT, Locale.US);
        String standardShortCached = FastDateFormat.getTimeZoneDisplay(tz, false, TimeZone.SHORT, Locale.US);
        Assert.assertEquals(standardShort, standardShortCached);

        String daylightLong = FastDateFormat.getTimeZoneDisplay(tz, true, TimeZone.LONG, Locale.US);
        Assert.assertNotNull(daylightLong);
    }

    @Test
    public void testPaddedNumberField_invalidSize_throwsException() throws Exception {
        Class<?> paddedClass = Class.forName("org.apache.commons.lang3.time.FastDateFormat$PaddedNumberField");
        Constructor<?> constructor = paddedClass.getDeclaredConstructor(int.class, int.class);
        constructor.setAccessible(true);
        try {
            constructor.newInstance(Calendar.YEAR, 2);
            Assert.fail("Should throw InvocationTargetException wrapping IllegalArgumentException");
        } catch (java.lang.reflect.InvocationTargetException ite) {
            Assert.assertTrue(ite.getCause() instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testInnerPairClass_equalsAndHashCodeAndToString() throws Exception {
        Class<?> pairClass = Class.forName("org.apache.commons.lang3.time.FastDateFormat$Pair");
        Constructor<?> constructor = pairClass.getDeclaredConstructor(Object.class, Object.class);
        constructor.setAccessible(true);

        Object pair1 = constructor.newInstance("A", "B");
        Object pair2 = constructor.newInstance("A", "B");
        Object pair3 = constructor.newInstance("A", "C");
        Object pairNull1 = constructor.newInstance(null, "B");
        Object pairNull2 = constructor.newInstance(null, "B");
        Object pairNull3 = constructor.newInstance("A", null);

        Assert.assertEquals(pair1, pair1);
        Assert.assertEquals(pair1, pair2);
        Assert.assertEquals(pair1.hashCode(), pair2.hashCode());
        Assert.assertFalse(pair1.equals(pair3));
        Assert.assertFalse(pair1.equals("string"));
        Assert.assertFalse(pair1.equals(null));

        Assert.assertEquals(pairNull1, pairNull2);
        Assert.assertFalse(pairNull1.equals(pair1));
        Assert.assertFalse(pair1.equals(pairNull1));
        Assert.assertFalse(pairNull1.equals(pairNull3));

        Assert.assertEquals("[A:B]", pair1.toString());
        Assert.assertEquals("[null:B]", pairNull1.toString());
    }

    @Test
    public void testInnerTimeZoneDisplayKey_equalsAndHashCode() throws Exception {
        Class<?> keyClass = Class.forName("org.apache.commons.lang3.time.FastDateFormat$TimeZoneDisplayKey");
        Constructor<?> constructor = keyClass.getDeclaredConstructor(TimeZone.class, boolean.class, int.class, Locale.class);
        constructor.setAccessible(true);

        TimeZone tz1 = TimeZone.getTimeZone("GMT");
        TimeZone tz2 = TimeZone.getTimeZone("UTC");
        Object key1 = constructor.newInstance(tz1, false, TimeZone.SHORT, Locale.US);
        Object key2 = constructor.newInstance(tz1, false, TimeZone.SHORT, Locale.US);
        Object keyDaylight = constructor.newInstance(tz1, true, TimeZone.SHORT, Locale.US);
        Object keyTz2 = constructor.newInstance(tz2, false, TimeZone.SHORT, Locale.US);
        Object keyLocale = constructor.newInstance(tz1, false, TimeZone.SHORT, Locale.UK);

        Assert.assertEquals(key1, key1);
        Assert.assertEquals(key1, key2);
        Assert.assertEquals(key1.hashCode(), key2.hashCode());
        Assert.assertFalse(key1.equals(null));
        Assert.assertFalse(key1.equals(new Object()));
        Assert.assertFalse(key1.equals(keyDaylight));
        Assert.assertFalse(key1.equals(keyTz2));
        Assert.assertFalse(key1.equals(keyLocale));
    }
}
