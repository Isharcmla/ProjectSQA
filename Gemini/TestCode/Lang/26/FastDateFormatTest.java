package org.apache.commons.lang3.time;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class FastDateFormatTest {

    @Test
    public void testGetInstance_default() {
        FastDateFormat format = FastDateFormat.getInstance();
        Assert.assertNotNull(format);
        Assert.assertNotNull(format.getPattern());
        Assert.assertEquals(TimeZone.getDefault(), format.getTimeZone());
        Assert.assertEquals(Locale.getDefault(), format.getLocale());
        Assert.assertFalse(format.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstance_patternOnly() {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        FastDateFormat format = FastDateFormat.getInstance(pattern);
        Assert.assertNotNull(format);
        Assert.assertEquals(pattern, format.getPattern());
    }

    @Test
    public void testGetInstance_patternAndTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", tz);
        Assert.assertNotNull(format);
        Assert.assertEquals(tz, format.getTimeZone());
        Assert.assertTrue(format.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstance_patternAndLocale() {
        Locale locale = Locale.GERMANY;
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", locale);
        Assert.assertNotNull(format);
        Assert.assertEquals(locale, format.getLocale());
    }

    @Test
    public void testGetInstance_patternTimeZoneLocale_cacheHit() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        Locale locale = Locale.US;
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy/MM/dd", tz, locale);
        FastDateFormat format2 = FastDateFormat.getInstance("yyyy/MM/dd", tz, locale);
        Assert.assertSame(format1, format2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_nullPattern_throwsException() {
        FastDateFormat.getInstance(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_invalidPattern_throwsException() {
        FastDateFormat.getInstance("yyyy-MM-dd QQ");
    }

    @Test
    public void testGetDateInstance_styles() {
        Assert.assertNotNull(FastDateFormat.getDateInstance(FastDateFormat.FULL));
        Assert.assertNotNull(FastDateFormat.getDateInstance(FastDateFormat.LONG));
        Assert.assertNotNull(FastDateFormat.getDateInstance(FastDateFormat.MEDIUM));
        Assert.assertNotNull(FastDateFormat.getDateInstance(FastDateFormat.SHORT));
    }

    @Test
    public void testGetDateInstance_withLocaleAndTimeZone() {
        Locale locale = Locale.FRANCE;
        TimeZone tz = TimeZone.getTimeZone("UTC");
        
        FastDateFormat f1 = FastDateFormat.getDateInstance(FastDateFormat.SHORT, locale);
        Assert.assertNotNull(f1);
        Assert.assertEquals(locale, f1.getLocale());

        FastDateFormat f2 = FastDateFormat.getDateInstance(FastDateFormat.SHORT, tz);
        Assert.assertNotNull(f2);
        Assert.assertEquals(tz, f2.getTimeZone());

        FastDateFormat f3 = FastDateFormat.getDateInstance(FastDateFormat.SHORT, tz, locale);
        Assert.assertNotNull(f3);
        Assert.assertEquals(tz, f3.getTimeZone());
        Assert.assertEquals(locale, f3.getLocale());

        FastDateFormat f4 = FastDateFormat.getDateInstance(FastDateFormat.SHORT, tz, locale);
        Assert.assertSame(f3, f4);
    }

    @Test
    public void testGetTimeInstance_styles() {
        Assert.assertNotNull(FastDateFormat.getTimeInstance(FastDateFormat.FULL));
        Assert.assertNotNull(FastDateFormat.getTimeInstance(FastDateFormat.LONG));
        Assert.assertNotNull(FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM));
        Assert.assertNotNull(FastDateFormat.getTimeInstance(FastDateFormat.SHORT));
    }

    @Test
    public void testGetTimeInstance_withLocaleAndTimeZone() {
        Locale locale = Locale.UK;
        TimeZone tz = TimeZone.getTimeZone("Europe/London");

        FastDateFormat f1 = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM, locale);
        Assert.assertNotNull(f1);
        Assert.assertEquals(locale, f1.getLocale());

        FastDateFormat f2 = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM, tz);
        Assert.assertNotNull(f2);
        Assert.assertEquals(tz, f2.getTimeZone());

        FastDateFormat f3 = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM, tz, locale);
        Assert.assertNotNull(f3);
        Assert.assertEquals(tz, f3.getTimeZone());
        Assert.assertEquals(locale, f3.getLocale());

        FastDateFormat f4 = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM, tz, locale);
        Assert.assertSame(f3, f4);
    }

    @Test
    public void testGetDateTimeInstance_styles() {
        Assert.assertNotNull(FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT));
        Assert.assertNotNull(FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.LONG));
    }

    @Test
    public void testGetDateTimeInstance_withLocaleAndTimeZone() {
        Locale locale = Locale.JAPAN;
        TimeZone tz = TimeZone.getTimeZone("Asia/Tokyo");

        FastDateFormat f1 = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, locale);
        Assert.assertNotNull(f1);
        Assert.assertEquals(locale, f1.getLocale());

        FastDateFormat f2 = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, tz);
        Assert.assertNotNull(f2);
        Assert.assertEquals(tz, f2.getTimeZone());

        FastDateFormat f3 = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, tz, locale);
        Assert.assertNotNull(f3);
        Assert.assertEquals(tz, f3.getTimeZone());
        Assert.assertEquals(locale, f3.getLocale());

        FastDateFormat f4 = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, tz, locale);
        Assert.assertSame(f3, f4);
    }

    @Test
    public void testFormat_allPatternsAndRules() {
        String pattern = "G y yy yyyy M MM MMM MMMM d dd h hh H HH m mm s ss S SSS E EEEE D DDD F w ww W a k kk K KK z zzzz Z ZZ '' 'Text' ''''";
        FastDateFormat fdf = FastDateFormat.getInstance(pattern, TimeZone.getTimeZone("GMT"), Locale.US);

        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT"), Locale.US);
        cal.set(Calendar.ERA, GregorianCalendar.AD);
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 5);
        cal.set(Calendar.HOUR_OF_DAY, 0); // 12 AM, hour=0, k=24, K=0, H=0, h=12
        cal.set(Calendar.MINUTE, 7);
        cal.set(Calendar.SECOND, 9);
        cal.set(Calendar.MILLISECOND, 8);

        String result = fdf.format(cal);
        Assert.assertTrue(result.contains("AD"));
        Assert.assertTrue(result.contains("23"));
        Assert.assertTrue(result.contains("2023"));
        Assert.assertTrue(result.contains("Jan"));
        Assert.assertTrue(result.contains("January"));
        Assert.assertTrue(result.contains("Text"));
        Assert.assertTrue(result.contains("+0000"));
        Assert.assertTrue(result.contains("+00:00"));

        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_MONTH, 25);
        cal.set(Calendar.HOUR_OF_DAY, 13);
        cal.set(Calendar.MINUTE, 45);
        cal.set(Calendar.SECOND, 50);
        cal.set(Calendar.MILLISECOND, 125);
        String result2 = fdf.format(cal);
        Assert.assertTrue(result2.contains("Oct"));
        Assert.assertTrue(result2.contains("October"));
        Assert.assertTrue(result2.contains("PM"));
    }

    @Test
    public void testFormat_methodsAndBuffers() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        long millis = date.getTime();

        Assert.assertEquals("2023-03-15 10:30:00", fdf.format(millis));
        Assert.assertEquals("2023-03-15 10:30:00", fdf.format(date));
        Assert.assertEquals("2023-03-15 10:30:00", fdf.format(cal));

        StringBuffer sb = new StringBuffer();
        fdf.format(millis, sb);
        Assert.assertEquals("2023-03-15 10:30:00", sb.toString());

        sb = new StringBuffer("Prefix: ");
        fdf.format(date, sb);
        Assert.assertEquals("Prefix: 2023-03-15 10:30:00", sb.toString());

        sb = new StringBuffer();
        fdf.format(cal, sb);
        Assert.assertEquals("2023-03-15 10:30:00", sb.toString());

        sb = new StringBuffer();
        fdf.format((Object) date, sb, new FieldPosition(0));
        Assert.assertEquals("2023-03-15 10:30:00", sb.toString());

        sb = new StringBuffer();
        fdf.format((Object) cal, sb, new FieldPosition(0));
        Assert.assertEquals("2023-03-15 10:30:00", sb.toString());

        sb = new StringBuffer();
        fdf.format((Object) Long.valueOf(millis), sb, new FieldPosition(0));
        Assert.assertEquals("2023-03-15 10:30:00", sb.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormat_unsupportedType_throwsException() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy");
        fdf.format("2023-01-01", new StringBuffer(), new FieldPosition(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormat_nullObject_throwsException() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy");
        fdf.format((Object) null, new StringBuffer(), new FieldPosition(0));
    }

    @Test
    public void testTimeZoneFormatting_negativeOffsetAndDaylight() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        FastDateFormat fdfShort = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss z Z ZZ", tz, Locale.US);
        FastDateFormat fdfLong = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss zzzz Z ZZ", tz, Locale.US);

        Calendar calWinter = new GregorianCalendar(tz, Locale.US);
        calWinter.set(2023, Calendar.JANUARY, 15, 12, 0, 0);
        String winter = fdfShort.format(calWinter);
        Assert.assertTrue(winter.contains("-0500"));
        Assert.assertTrue(winter.contains("-05:00"));

        Calendar calSummer = new GregorianCalendar(tz, Locale.US);
        calSummer.set(2023, Calendar.JULY, 15, 12, 0, 0);
        String summerLong = fdfLong.format(calSummer);
        Assert.assertTrue(summerLong.contains("-0400"));
        Assert.assertTrue(summerLong.contains("-04:00"));
    }

    @Test
    public void testTimeZoneDisplay_unforcedTimeZone() {
        FastDateFormat fdf = FastDateFormat.getInstance("z zzzz", Locale.US);
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angeles"), Locale.US);
        cal.set(2023, Calendar.JANUARY, 1, 12, 0, 0);
        String formatted = fdf.format(cal);
        Assert.assertTrue(formatted.contains("PST"));
        Assert.assertTrue(formatted.contains("Pacific Standard Time"));

        cal.set(2023, Calendar.JULY, 1, 12, 0, 0);
        formatted = fdf.format(cal);
        Assert.assertTrue(formatted.contains("PDT"));
        Assert.assertTrue(formatted.contains("Pacific Daylight Time"));
    }

    @Test
    public void testPaddedNumberField_largePaddingsAndNumbers() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyyy DDDDD SSSSS", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.DAY_OF_YEAR, 42);
        cal.set(Calendar.MILLISECOND, 9);
        String formatted = fdf.format(cal);
        Assert.assertTrue(formatted.contains("02023"));
        Assert.assertTrue(formatted.contains("00042"));
        Assert.assertTrue(formatted.contains("00009"));

        cal.set(Calendar.YEAR, 12345);
        cal.set(Calendar.DAY_OF_YEAR, 300);
        cal.set(Calendar.MILLISECOND, 456);
        formatted = fdf.format(cal);
        Assert.assertTrue(formatted.contains("12345"));
        Assert.assertTrue(formatted.contains("00300"));
        Assert.assertTrue(formatted.contains("00456"));
    }

    @Test
    public void testParseObject_returnsNull() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(5);
        Object result = fdf.parseObject("2023-01-01", pos);
        Assert.assertNull(result);
        Assert.assertEquals(0, pos.getIndex());
        Assert.assertEquals(0, pos.getErrorIndex());
    }

    @Test
    public void testMaxLengthEstimate() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS zzzz Z");
        Assert.assertTrue(fdf.getMaxLengthEstimate() > 0);
    }

    @Test
    public void testEqualsAndHashCode() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateFormat f2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateFormat f3 = FastDateFormat.getInstance("yyyy/MM/dd", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateFormat f4 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat f5 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.GERMANY);

        Assert.assertEquals(f1, f1);
        Assert.assertEquals(f1, f2);
        Assert.assertEquals(f1.hashCode(), f2.hashCode());

        Assert.assertNotEquals(f1, f3);
        Assert.assertNotEquals(f1, f4);
        Assert.assertNotEquals(f1, f5);
        Assert.assertNotEquals(f1, null);
        Assert.assertNotEquals(f1, "Not FastDateFormat");
    }

    @Test
    public void testToString() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");
        Assert.assertEquals("FastDateFormat[yyyy-MM-dd]", fdf.toString());
    }

    @Test
    public void testSerialization() throws Exception {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss Z", TimeZone.getTimeZone("UTC"), Locale.US);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(fdf);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDateFormat deserialized = (FastDateFormat) ois.readObject();
        ois.close();

        Assert.assertEquals(fdf, deserialized);
        Assert.assertEquals(fdf.getMaxLengthEstimate(), deserialized.getMaxLengthEstimate());

        Date now = new Date();
        Assert.assertEquals(fdf.format(now), deserialized.format(now));
    }
}
