package org.apache.commons.lang.time;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class FastDateFormatTest {

    @Test
    public void testGetInstance_default() {
        FastDateFormat format1 = FastDateFormat.getInstance();
        FastDateFormat format2 = FastDateFormat.getInstance();
        Assert.assertNotNull(format1);
        Assert.assertSame(format1, format2);
    }

    @Test
    public void testGetInstance_patternOnly() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        Assert.assertNotNull(format);
        Assert.assertEquals("yyyy-MM-dd", format.getPattern());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_nullPattern_throwsException() {
        FastDateFormat.getInstance(null);
    }

    @Test
    public void testGetInstance_patternAndTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", tz);
        Assert.assertNotNull(format);
        Assert.assertEquals(tz, format.getTimeZone());
        Assert.assertTrue(format.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstance_patternAndLocale() {
        Locale loc = Locale.FRENCH;
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", loc);
        Assert.assertNotNull(format);
        Assert.assertEquals(loc, format.getLocale());
    }

    @Test
    public void testGetInstance_patternTimeZoneLocale() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        Locale loc = Locale.GERMANY;
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", tz, loc);
        Assert.assertNotNull(format);
        Assert.assertEquals(tz, format.getTimeZone());
        Assert.assertEquals(loc, format.getLocale());
    }

    @Test
    public void testGetDateInstance_style() {
        FastDateFormat format = FastDateFormat.getDateInstance(FastDateFormat.SHORT);
        Assert.assertNotNull(format);
    }

    @Test
    public void testGetDateInstance_styleLocale() {
        FastDateFormat format = FastDateFormat.getDateInstance(FastDateFormat.FULL, Locale.UK);
        Assert.assertNotNull(format);
        Assert.assertEquals(Locale.UK, format.getLocale());
    }

    @Test
    public void testGetDateInstance_styleTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat format = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM, tz);
        Assert.assertNotNull(format);
        Assert.assertEquals(tz, format.getTimeZone());
    }

    @Test
    public void testGetDateInstance_styleTimeZoneLocale() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat format1 = FastDateFormat.getDateInstance(FastDateFormat.LONG, tz, Locale.US);
        FastDateFormat format2 = FastDateFormat.getDateInstance(FastDateFormat.LONG, tz, Locale.US);
        Assert.assertNotNull(format1);
        Assert.assertSame(format1, format2);
    }

    @Test
    public void testGetTimeInstance_style() {
        FastDateFormat format = FastDateFormat.getTimeInstance(FastDateFormat.SHORT);
        Assert.assertNotNull(format);
    }

    @Test
    public void testGetTimeInstance_styleLocale() {
        FastDateFormat format = FastDateFormat.getTimeInstance(FastDateFormat.FULL, Locale.FRANCE);
        Assert.assertNotNull(format);
        Assert.assertEquals(Locale.FRANCE, format.getLocale());
    }

    @Test
    public void testGetTimeInstance_styleTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat format = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM, tz);
        Assert.assertNotNull(format);
        Assert.assertEquals(tz, format.getTimeZone());
    }

    @Test
    public void testGetTimeInstance_styleTimeZoneLocale() {
        TimeZone tz = TimeZone.getTimeZone("GMT+1");
        FastDateFormat format1 = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, tz, Locale.ITALY);
        FastDateFormat format2 = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, tz, Locale.ITALY);
        Assert.assertNotNull(format1);
        Assert.assertSame(format1, format2);
    }

    @Test
    public void testGetDateTimeInstance_styles() {
        FastDateFormat format = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT);
        Assert.assertNotNull(format);
    }

    @Test
    public void testGetDateTimeInstance_stylesLocale() {
        FastDateFormat format = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, Locale.JAPAN);
        Assert.assertNotNull(format);
        Assert.assertEquals(Locale.JAPAN, format.getLocale());
    }

    @Test
    public void testGetDateTimeInstance_stylesTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat format = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL, tz);
        Assert.assertNotNull(format);
        Assert.assertEquals(tz, format.getTimeZone());
    }

    @Test
    public void testGetDateTimeInstance_stylesTimeZoneLocale() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat format1 = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.LONG, tz, Locale.CANADA);
        FastDateFormat format2 = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.LONG, tz, Locale.CANADA);
        Assert.assertNotNull(format1);
        Assert.assertSame(format1, format2);
    }

    @Test
    public void testFormat_allSupportedPatternTokens() {
        String pattern = "G y yy yyyy M MM MMM MMMM d dd h hh H HH m mm s ss S SSS E EEEE D DD DDD F w ww W a k kk K KK z zzzz Z ZZ '' 'text'";
        FastDateFormat format = FastDateFormat.getInstance(pattern, TimeZone.getTimeZone("GMT-05:00"), Locale.US);

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT-05:00"), Locale.US);
        cal.set(2023, Calendar.MARCH, 5, 0, 8, 9);
        cal.set(Calendar.MILLISECOND, 7);

        String result = format.format(cal);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("AD"));
        Assert.assertTrue(result.contains("23"));
        Assert.assertTrue(result.contains("2023"));
        Assert.assertTrue(result.contains("Mar"));
        Assert.assertTrue(result.contains("March"));
        Assert.assertTrue(result.contains("text"));
        Assert.assertTrue(result.contains("'"));
        Assert.assertTrue(result.contains("-0500"));
        Assert.assertTrue(result.contains("-05:00"));
    }

    @Test
    public void testFormat_twelveAndTwentyFourHourZeroConditions() {
        FastDateFormat format = FastDateFormat.getInstance("h hh k kk K KK", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);

        String result = format.format(cal);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("12"));
        Assert.assertTrue(result.contains("24"));
        Assert.assertTrue(result.contains("0"));
    }

    @Test
    public void testFormat_dateObject() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"));
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.JANUARY, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        String str = format.format(date);
        Assert.assertEquals("2023-01-01", str);

        StringBuffer sb = new StringBuffer("Prefix: ");
        StringBuffer returned = format.format(date, sb);
        Assert.assertSame(sb, returned);
        Assert.assertEquals("Prefix: 2023-01-01", sb.toString());
    }

    @Test
    public void testFormat_calendarObject() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy/MM/dd HH:mm", TimeZone.getTimeZone("GMT"), Locale.US);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        cal.set(2022, Calendar.DECEMBER, 31, 23, 59, 0);

        String str = format.format(cal);
        Assert.assertEquals("2022/12/31 23:59", str);

        StringBuffer sb = new StringBuffer();
        StringBuffer returned = format.format(cal, sb);
        Assert.assertSame(sb, returned);
        Assert.assertEquals("2022/12/31 23:59", sb.toString());
    }

    @Test
    public void testFormat_millis() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"));
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        long millis = cal.getTimeInMillis();

        String str = format.format(millis);
        Assert.assertEquals("2020", str);

        StringBuffer sb = new StringBuffer();
        StringBuffer returned = format.format(millis, sb);
        Assert.assertSame(sb, returned);
        Assert.assertEquals("2020", sb.toString());
    }

    @Test
    public void testFormat_objectTypes() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2021);
        Date date = cal.getTime();
        Long millis = new Long(date.getTime());

        StringBuffer sb1 = format.format((Object) date, new StringBuffer(), new FieldPosition(0));
        StringBuffer sb2 = format.format((Object) cal, new StringBuffer(), new FieldPosition(0));
        StringBuffer sb3 = format.format((Object) millis, new StringBuffer(), new FieldPosition(0));

        Assert.assertEquals("2021", sb1.toString());
        Assert.assertEquals("2021", sb2.toString());
        Assert.assertEquals("2021", sb3.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormat_invalidObjectType_throwsException() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy");
        format.format("Invalid Object Type", new StringBuffer(), new FieldPosition(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormat_nullObject_throwsException() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy");
        format.format((Object) null, new StringBuffer(), new FieldPosition(0));
    }

    @Test
    public void testParseObject_returnsNullAndSetsIndexes() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(5);
        pos.setErrorIndex(3);

        Object result = format.parseObject("2023-01-01", pos);
        Assert.assertNull(result);
        Assert.assertEquals(0, pos.getIndex());
        Assert.assertEquals(0, pos.getErrorIndex());
    }

    @Test
    public void testGettersAndEstimates() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone("GMT"), Locale.GERMANY);
        Assert.assertEquals("yyyy-MM-dd HH:mm:ss", format.getPattern());
        Assert.assertEquals(TimeZone.getTimeZone("GMT"), format.getTimeZone());
        Assert.assertEquals(Locale.GERMANY, format.getLocale());
        Assert.assertTrue(format.getTimeZoneOverridesCalendar());
        Assert.assertTrue(format.getMaxLengthEstimate() > 0);
    }

    @Test
    public void testEqualsAndHashCode() {
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateFormat format2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateFormat formatDiffPattern = FastDateFormat.getInstance("yyyy/MM/dd", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateFormat formatDiffTz = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT+1"), Locale.US);
        FastDateFormat formatDiffLocale = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.FRANCE);

        Assert.assertEquals(format1, format2);
        Assert.assertEquals(format1.hashCode(), format2.hashCode());
        Assert.assertFalse(format1.equals(formatDiffPattern));
        Assert.assertFalse(format1.equals(formatDiffTz));
        Assert.assertFalse(format1.equals(formatDiffLocale));
        Assert.assertFalse(format1.equals("Not a FastDateFormat"));
        Assert.assertFalse(format1.equals(null));
    }

    @Test
    public void testToString() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        Assert.assertEquals("FastDateFormat[yyyy-MM-dd]", format.toString());
    }

    @Test
    public void testSerialization() throws Exception {
        FastDateFormat original = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS", TimeZone.getTimeZone("UTC"), Locale.US);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDateFormat deserialized = (FastDateFormat) ois.readObject();

        Assert.assertEquals(original, deserialized);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(2023, Calendar.OCTOBER, 15, 12, 30, 45);
        cal.set(Calendar.MILLISECOND, 123);

        Assert.assertEquals(original.format(cal), deserialized.format(cal));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParsePattern_illegalPattern_throwsException() {
        FastDateFormat.getInstance("yyyy-MM-dd X");
    }

    @Test
    public void testPaddedNumberField_variousLengths() {
        FastDateFormat format = FastDateFormat.getInstance("yyyyy-MM-dd SSSS");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.JANUARY, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 5);

        String result = format.format(cal);
        Assert.assertTrue(result.startsWith("02023"));
        Assert.assertTrue(result.endsWith("0005"));

        cal.set(Calendar.MILLISECOND, 500);
        result = format.format(cal);
        Assert.assertTrue(result.endsWith("0500"));

        cal.set(Calendar.MILLISECOND, 99);
        result = format.format(cal);
        Assert.assertTrue(result.endsWith("0099"));
    }

    @Test
    public void testTimeZoneFormatting_daylightSavings() {
        SimpleTimeZone stz = new SimpleTimeZone(-5 * 3600 * 1000, "CustomEDT",
                Calendar.APRIL, 1, 0, 2 * 3600 * 1000,
                Calendar.OCTOBER, -1, 0, 2 * 3600 * 1000,
                3600 * 1000);

        FastDateFormat formatShort = FastDateFormat.getInstance("z", stz, Locale.US);
        FastDateFormat formatLong = FastDateFormat.getInstance("zzzz", stz, Locale.US);

        Calendar cal = Calendar.getInstance(stz, Locale.US);
        cal.set(2023, Calendar.JUNE, 1, 12, 0, 0); // Summer (DST active)
        String shortDst = formatShort.format(cal);
        String longDst = formatLong.format(cal);
        Assert.assertNotNull(shortDst);
        Assert.assertNotNull(longDst);

        cal.set(2023, Calendar.DECEMBER, 1, 12, 0, 0); // Winter (DST inactive)
        String shortStd = formatShort.format(cal);
        String longStd = formatLong.format(cal);
        Assert.assertNotNull(shortStd);
        Assert.assertNotNull(longStd);
    }

    @Test
    public void testTimeZoneNameRule_unforcedTimeZoneFormatting() {
        FastDateFormat format = FastDateFormat.getInstance("z zzzz");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+0"), Locale.US);
        cal.set(2023, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal);
        Assert.assertNotNull(result);
    }

    @Test
    public void testSingleQuoteLiteralHandling() {
        FastDateFormat format = FastDateFormat.getInstance("'' 'O''Clock' 'A'");
        Calendar cal = Calendar.getInstance();
        String result = format.format(cal);
        Assert.assertEquals("' O'Clock A", result);
    }
}
