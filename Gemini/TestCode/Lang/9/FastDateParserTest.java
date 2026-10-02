package org.apache.commons.lang3.time;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class FastDateParserTest {

    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final TimeZone NEW_YORK = TimeZone.getTimeZone("America/New_York");
    private static final Locale US = Locale.US;

    @Test
    public void testGetters_validInputs_returnsConfiguredValues() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        Assert.assertEquals("yyyy-MM-dd", parser.getPattern());
        Assert.assertEquals(GMT, parser.getTimeZone());
        Assert.assertEquals(US, parser.getLocale());
        Assert.assertNotNull(parser.getParsePattern());
    }

    @Test
    public void testEqualsAndHashCode_variousCases_verifyEqualityContract() {
        FastDateParser parser1 = new FastDateParser("yyyy-MM-dd", GMT, US);
        FastDateParser parser2 = new FastDateParser("yyyy-MM-dd", GMT, US);
        FastDateParser parserDiffPattern = new FastDateParser("yyyy/MM/dd", GMT, US);
        FastDateParser parserDiffTz = new FastDateParser("yyyy-MM-dd", NEW_YORK, US);
        FastDateParser parserDiffLocale = new FastDateParser("yyyy-MM-dd", GMT, Locale.GERMANY);

        Assert.assertTrue(parser1.equals(parser1));
        Assert.assertTrue(parser1.equals(parser2));
        Assert.assertEquals(parser1.hashCode(), parser2.hashCode());

        Assert.assertFalse(parser1.equals(null));
        Assert.assertFalse(parser1.equals("yyyy-MM-dd"));
        Assert.assertFalse(parser1.equals(parserDiffPattern));
        Assert.assertFalse(parser1.equals(parserDiffTz));
        Assert.assertFalse(parser1.equals(parserDiffLocale));
    }

    @Test
    public void testToString_validParser_returnsDescriptiveString() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        Assert.assertEquals("FastDateParser[yyyy-MM-dd,en_US,GMT]", parser.toString());
    }

    @Test
    public void testSerialization_validInstance_deserializesCorrectly() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd HH:mm:ss", GMT, US);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(parser);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDateParser deserialized = (FastDateParser) ois.readObject();
        ois.close();

        Assert.assertEquals(parser, deserialized);
        Date expected = parser.parse("2023-10-15 12:30:45");
        Date actual = deserialized.parse("2023-10-15 12:30:45");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParseObject_validString_returnsDateObject() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        Object dateObj = parser.parseObject("2023-05-17");
        Assert.assertTrue(dateObj instanceof Date);
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime((Date) dateObj);
        Assert.assertEquals(2023, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.MAY, cal.get(Calendar.MONTH));
        Assert.assertEquals(17, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseObjectWithParsePosition_validInput_returnsDateAndUpdatesIndex() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        ParsePosition pos = new ParsePosition(5);
        Object dateObj = parser.parseObject("Date:2023-05-17 extra", pos);
        Assert.assertNotNull(dateObj);
        Assert.assertEquals(15, pos.getIndex());
    }

    @Test
    public void testParse_allStrategyPatterns_parsesCorrectly() throws ParseException {
        String pattern = "yyyy-MM-dd HH:mm:ss.SSS D F W w K k h a E G";
        FastDateParser parser = new FastDateParser(pattern, GMT, US);
        Date date = parser.parse("2023-05-17 14:30:45.123 137 3 3 20 2 14 2 PM Wed AD");
        Assert.assertNotNull(date);

        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        Assert.assertEquals(2023, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.MAY, cal.get(Calendar.MONTH));
        Assert.assertEquals(17, cal.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(30, cal.get(Calendar.MINUTE));
        Assert.assertEquals(45, cal.get(Calendar.SECOND));
        Assert.assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParse_abbreviatedYear_adjustsCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("yy-MM-dd", GMT, US);
        int currentCentury = Calendar.getInstance(GMT, US).get(Calendar.YEAR) / 100 * 100;

        Date date23 = parser.parse("23-01-01");
        Calendar cal23 = Calendar.getInstance(GMT, US);
        cal23.setTime(date23);
        int expectedYear23 = parser.adjustYear(23);
        Assert.assertEquals(expectedYear23, cal23.get(Calendar.YEAR));

        Date date85 = parser.parse("85-01-01");
        Calendar cal85 = Calendar.getInstance(GMT, US);
        cal85.setTime(date85);
        int expectedYear85 = parser.adjustYear(85);
        Assert.assertEquals(expectedYear85, cal85.get(Calendar.YEAR));

        Date date4Digit = parser.parse("1995-01-01");
        Calendar cal4Digit = Calendar.getInstance(GMT, US);
        cal4Digit.setTime(date4Digit);
        Assert.assertEquals(1995, cal4Digit.get(Calendar.YEAR));
    }

    @Test
    public void testParse_quotedLiteralsAndEscapedChars_parsesMatchingText() throws ParseException {
        FastDateParser parser = new FastDateParser("''yyyy'.'MM'.'dd'T'HH:mm:ss'Z'''", GMT, US);
        Date date = parser.parse("'2023.05.17T12:34:56Z'");
        Assert.assertNotNull(date);

        FastDateParser specialCharsParser = new FastDateParser("yyyy?[](){}\\*+^$.MM.dd", GMT, US);
        Date dateSpecial = specialCharsParser.parse("2023?[](){}\\*+^$.05.17");
        Assert.assertNotNull(dateSpecial);

        FastDateParser singleCharQuoteParser = new FastDateParser("yyyy'T'MM'9'dd", GMT, US);
        Date dateSingle = singleCharQuoteParser.parse("2023T05917");
        Assert.assertNotNull(dateSingle);
    }

    @Test
    public void testParse_adjacentNumbers_handledCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyyMMddHHmmss", GMT, US);
        Date date = parser.parse("20230517123045");
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        Assert.assertEquals(2023, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.MAY, cal.get(Calendar.MONTH));
        Assert.assertEquals(17, cal.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(12, cal.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(30, cal.get(Calendar.MINUTE));
        Assert.assertEquals(45, cal.get(Calendar.SECOND));
    }

    @Test
    public void testParse_textMonthAndDayOfWeek_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("MMMM, MMM EEEE, E", GMT, US);
        Date date = parser.parse("October, Oct Wednesday, Wed");
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        Assert.assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        Assert.assertEquals(Calendar.WEDNESDAY, cal.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testParse_timeZoneStrategies_allFormatsHandled() throws ParseException {
        FastDateParser parserZ = new FastDateParser("yyyy-MM-dd HH:mm:ss z", GMT, US);
        Date datePST = parserZ.parse("2023-01-01 12:00:00 PST");
        Assert.assertNotNull(datePST);

        Date dateGMTPlus = parserZ.parse("2023-01-01 12:00:00 GMT+07:00");
        Assert.assertNotNull(dateGMTPlus);

        FastDateParser parserOffset = new FastDateParser("yyyy-MM-dd HH:mm:ss Z", GMT, US);
        Date dateOffsetNumeric = parserOffset.parse("2023-01-01 12:00:00 +0700");
        Assert.assertNotNull(dateOffsetNumeric);

        Date dateOffsetNegative = parserOffset.parse("2023-01-01 12:00:00 -05:00");
        Assert.assertNotNull(dateOffsetNegative);
    }

    @Test
    public void testParse_japaneseImperialLocale_parsesEra() throws ParseException {
        Locale jaJPJP = FastDateParser.JAPANESE_IMPERIAL;
        FastDateParser parser = new FastDateParser("GGGG yyyy-MM-dd", GMT, jaJPJP);
        Date date = parser.parse("平成 0001-01-08");
        Assert.assertNotNull(date);
    }

    @Test(expected = ParseException.class)
    public void testParse_unparseableDate_throwsParseException() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        parser.parse("invalid-date");
    }

    @Test(expected = ParseException.class)
    public void testParse_unparseableDateJapaneseImperial_throwsSpecialParseException() throws ParseException {
        FastDateParser parser = new FastDateParser("GGGG yyyy-MM-dd", GMT, FastDateParser.JAPANESE_IMPERIAL);
        parser.parse("InvalidEra 0001-01-01");
    }

    @Test
    public void testParse_withParsePositionMismatch_returnsNullAndUnchangedPosition() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        ParsePosition pos = new ParsePosition(2);
        Date result = parser.parse("Not a date", pos);
        Assert.assertNull(result);
        Assert.assertEquals(2, pos.getIndex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidPattern_throwsIllegalArgumentException() {
        new FastDateParser("", GMT, US);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDisplayNames_invalidField_throwsIllegalArgumentException() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        parser.getDisplayNames(Calendar.HOUR);
    }
}
