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
    private static final TimeZone EST = TimeZone.getTimeZone("EST");
    private static final Locale US = Locale.US;

    @Test
    public void testGetters_validInputs_returnsCorrectValues() {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        FastDateParser parser = new FastDateParser(pattern, GMT, US);

        Assert.assertEquals(pattern, parser.getPattern());
        Assert.assertEquals(GMT, parser.getTimeZone());
        Assert.assertEquals(US, parser.getLocale());
        Assert.assertNotNull(parser.getParsePattern());
    }

    @Test
    public void testEqualsAndHashCode_sameAndDifferentObjects_worksCorrectly() {
        FastDateParser parser1 = new FastDateParser("yyyy-MM-dd", GMT, US);
        FastDateParser parser2 = new FastDateParser("yyyy-MM-dd", GMT, US);
        FastDateParser parserDiffPattern = new FastDateParser("yyyy/MM/dd", GMT, US);
        FastDateParser parserDiffZone = new FastDateParser("yyyy-MM-dd", EST, US);
        FastDateParser parserDiffLocale = new FastDateParser("yyyy-MM-dd", GMT, Locale.GERMANY);

        Assert.assertTrue(parser1.equals(parser1));
        Assert.assertTrue(parser1.equals(parser2));
        Assert.assertEquals(parser1.hashCode(), parser2.hashCode());

        Assert.assertFalse(parser1.equals(null));
        Assert.assertFalse(parser1.equals("NotAFastDateParser"));
        Assert.assertFalse(parser1.equals(parserDiffPattern));
        Assert.assertFalse(parser1.equals(parserDiffZone));
        Assert.assertFalse(parser1.equals(parserDiffLocale));
    }

    @Test
    public void testToString_validParser_returnsFormattedString() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        Assert.assertEquals("FastDateParser[yyyy-MM-dd,en_US,GMT]", parser.toString());
    }

    @Test
    public void testSerialization_validInstance_deserializesAndWorks() throws Exception {
        FastDateParser original = new FastDateParser("yyyy-MM-dd HH:mm:ss", GMT, US);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDateParser deserialized = (FastDateParser) ois.readObject();
        ois.close();

        Assert.assertEquals(original, deserialized);
        Date date = deserialized.parse("2023-10-25 15:30:45");
        Assert.assertNotNull(date);
    }

    @Test
    public void testParseObject_validStringAndPosition_returnsDate() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);

        Object parsedObj = parser.parseObject("2023-05-15");
        Assert.assertTrue(parsedObj instanceof Date);

        ParsePosition pos = new ParsePosition(0);
        Object parsedObjPos = parser.parseObject("2023-05-15", pos);
        Assert.assertTrue(parsedObjPos instanceof Date);
        Assert.assertEquals(10, pos.getIndex());
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidSource_throwsParseException() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        parser.parse("invalid-date");
    }

    @Test(expected = ParseException.class)
    public void testParse_japaneseImperialInvalidSource_throwsParseExceptionWithNote() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, FastDateParser.JAPANESE_IMPERIAL);
        parser.parse("invalid-date");
    }

    @Test
    public void testParse_allNumericAndTextStrategies_parsesCorrectly() throws Exception {
        String pattern = "yyyy MM dd HH mm ss SSS D F w W k K h H a E G";
        FastDateParser parser = new FastDateParser(pattern, GMT, US);
        String source = "2023 10 25 14 30 45 123 298 4 43 4 14 2 2 14 PM Wed AD";

        Date parsedDate = parser.parse(source);
        Assert.assertNotNull(parsedDate);

        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(parsedDate);
        Assert.assertEquals(2023, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        Assert.assertEquals(25, cal.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(30, cal.get(Calendar.MINUTE));
        Assert.assertEquals(45, cal.get(Calendar.SECOND));
        Assert.assertEquals(123, cal.get(Calendar.MILLISECOND));
        Assert.assertEquals(Calendar.PM, cal.get(Calendar.AM_PM));
        Assert.assertEquals(Calendar.AD, cal.get(Calendar.ERA));
    }

    @Test
    public void testParse_abbreviatedYear_adjustsCorrectly() throws Exception {
        FastDateParser parser = new FastDateParser("yy-MM-dd", GMT, US);
        Calendar currentCal = Calendar.getInstance(GMT, US);
        int currentYear = currentCal.get(Calendar.YEAR);
        int century = currentYear - currentYear % 100;

        Date datePast = parser.parse("70-01-01");
        Calendar calPast = Calendar.getInstance(GMT, US);
        calPast.setTime(datePast);
        int expectedYearPast = (70 + century < currentYear + 20) ? (70 + century) : (70 + century - 100);
        Assert.assertEquals(expectedYearPast, calPast.get(Calendar.YEAR));

        Date dateFuture = parser.parse("25-01-01");
        Calendar calFuture = Calendar.getInstance(GMT, US);
        calFuture.setTime(dateFuture);
        int expectedYearFuture = (25 + century < currentYear + 20) ? (25 + century) : (25 + century - 100);
        Assert.assertEquals(expectedYearFuture, calFuture.get(Calendar.YEAR));
    }

    @Test
    public void testParse_literalTextAndQuotes_matchesCorrectly() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy'T'MM''dd' 'HH:mm:ss '123' [.*+?^$] \\", GMT, US);
        String source = "2023T10'25 14:30:45 123 [.*+?^$] \\";
        Date date = parser.parse(source);
        Assert.assertNotNull(date);

        FastDateParser parserSingleQuote = new FastDateParser("yyyy''''MM", GMT, US);
        Date dateSingleQuote = parserSingleQuote.parse("2023'10");
        Assert.assertNotNull(dateSingleQuote);
    }

    @Test
    public void testParse_adjacentNumbers_parsesWithFieldWidth() throws Exception {
        FastDateParser parser = new FastDateParser("yyyyMMddHHmmss", GMT, US);
        Date date = parser.parse("20231025143045");
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        Assert.assertEquals(2023, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        Assert.assertEquals(25, cal.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(30, cal.get(Calendar.MINUTE));
        Assert.assertEquals(45, cal.get(Calendar.SECOND));
    }

    @Test
    public void testParse_textMonthAndDisplayNamesCaching_parsesCorrectly() throws Exception {
        FastDateParser parser = new FastDateParser("MMMM dd, yyyy", GMT, US);
        Date dateLong = parser.parse("October 25, 2023");
        Assert.assertNotNull(dateLong);

        FastDateParser parserShort = new FastDateParser("MMM dd, yyyy", GMT, US);
        Date dateShort = parserShort.parse("Oct 25, 2023");
        Assert.assertNotNull(dateShort);
    }

    @Test
    public void testParse_timeZoneStrategies_parsesDifferentFormats() throws Exception {
        FastDateParser parserZ = new FastDateParser("yyyy-MM-dd HH:mm:ss z", GMT, US);
        Date dateGmt = parserZ.parse("2023-10-25 14:30:45 GMT");
        Assert.assertNotNull(dateGmt);

        Date dateOffset = parserZ.parse("2023-10-25 14:30:45 +0500");
        Assert.assertNotNull(dateOffset);

        Date dateOffsetColon = parserZ.parse("2023-10-25 14:30:45 -05:00");
        Assert.assertNotNull(dateOffsetColon);

        Date dateNamedTz = parserZ.parse("2023-10-25 14:30:45 UTC");
        Assert.assertNotNull(dateNamedTz);

        FastDateParser parserUpperZ = new FastDateParser("yyyy-MM-dd HH:mm:ss Z", GMT, US);
        Date dateUpperZ = parserUpperZ.parse("2023-10-25 14:30:45 GMT+02:00");
        Assert.assertNotNull(dateUpperZ);
    }

    @Test
    public void testParse_japaneseImperialLocaleEra_parsesCorrectly() throws Exception {
        FastDateParser parser = new FastDateParser("GGGG yyyy-MM-dd", GMT, FastDateParser.JAPANESE_IMPERIAL);
        Date date = parser.parse("Heisei 0001-01-08");
        Assert.assertNotNull(date);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidPattern_throwsIllegalArgumentException() {
        new FastDateParser("??????", GMT, US);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDisplayNames_invalidField_throwsIllegalArgumentException() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        parser.getDisplayNames(Calendar.MINUTE);
    }
}
