package org.apache.commons.lang.time;

import org.junit.Test;

import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DurationFormatUtilsTest {

    @Test
    public void testConstructor_default_instanceCreated() {
        DurationFormatUtils utils = new DurationFormatUtils();
        assertNotNull(utils);
    }

    @Test
    public void testFormatDurationHMS_zero_returnsFormattedZero() {
        String result = DurationFormatUtils.formatDurationHMS(0);
        assertEquals("0:00:00.000", result);
    }

    @Test
    public void testFormatDurationHMS_positiveDuration_returnsFormattedTime() {
        long duration = (5 * DateUtils.MILLIS_PER_HOUR)
                + (4 * DateUtils.MILLIS_PER_MINUTE)
                + (3 * DateUtils.MILLIS_PER_SECOND)
                + 2;
        String result = DurationFormatUtils.formatDurationHMS(duration);
        assertEquals("5:04:03.002", result);
    }

    @Test
    public void testFormatDurationISO_zero_returnsIsoPattern() {
        String result = DurationFormatUtils.formatDurationISO(0);
        assertEquals("P0Y0M0DT0H0M0.0S", result);
    }

    @Test
    public void testFormatDurationISO_positiveDuration_returnsFormattedIso() {
        long duration = (7 * DateUtils.MILLIS_PER_DAY)
                + (6 * DateUtils.MILLIS_PER_HOUR)
                + (5 * DateUtils.MILLIS_PER_MINUTE)
                + (4 * DateUtils.MILLIS_PER_SECOND)
                + 321;
        String result = DurationFormatUtils.formatDurationISO(duration);
        assertEquals("P0Y0M7DT6H5M4.321S", result);
    }

    @Test
    public void testFormatDuration_formatWithAllUnitsAndPadding_returnsCorrectString() {
        long duration = (2 * DateUtils.MILLIS_PER_DAY)
                + (3 * DateUtils.MILLIS_PER_HOUR)
                + (4 * DateUtils.MILLIS_PER_MINUTE)
                + (5 * DateUtils.MILLIS_PER_SECOND)
                + 6;
        String result = DurationFormatUtils.formatDuration(duration, "dd:HH:mm:ss:SSS");
        assertEquals("02:03:04:05:006", result);
    }

    @Test
    public void testFormatDuration_formatWithoutPadding_returnsUnpaddedString() {
        long duration = (2 * DateUtils.MILLIS_PER_DAY)
                + (3 * DateUtils.MILLIS_PER_HOUR)
                + (4 * DateUtils.MILLIS_PER_MINUTE)
                + (5 * DateUtils.MILLIS_PER_SECOND)
                + 6;
        String result = DurationFormatUtils.formatDuration(duration, "d:H:m:s:S", false);
        assertEquals("2:3:4:5:6", result);
    }

    @Test
    public void testFormatDuration_formatWithLiteralQuotes_preservesLiterals() {
        long duration = 12345;
        String result = DurationFormatUtils.formatDuration(duration, "'Duration: 's' seconds'");
        assertEquals("Duration: 12 seconds", result);
    }

    @Test
    public void testFormatDuration_formatOnlySecondsWithAdjacentMilliseconds_handlesSpecialPadding() {
        long duration = 1500;
        String result = DurationFormatUtils.formatDuration(duration, "s.SSS", true);
        assertEquals("1.500", result);

        String resultUnpadded = DurationFormatUtils.formatDuration(duration, "s.S", false);
        assertEquals("1.500", resultUnpadded);
    }

    @Test
    public void testFormatDuration_formatOnlyMillisecondsWithoutSeconds_formatsCorrectly() {
        long duration = 45;
        String result = DurationFormatUtils.formatDuration(duration, "SSS", true);
        assertEquals("045", result);

        String resultUnpadded = DurationFormatUtils.formatDuration(duration, "S", false);
        assertEquals("45", resultUnpadded);
    }

    @Test
    public void testFormatDurationWords_suppressBothLeadingAndTrailingZeroes_formatsCorrectly() {
        long duration = 0;
        String result = DurationFormatUtils.formatDurationWords(duration, true, true);
        assertEquals("", result);

        duration = (2 * DateUtils.MILLIS_PER_DAY) + (4 * DateUtils.MILLIS_PER_MINUTE);
        result = DurationFormatUtils.formatDurationWords(duration, true, true);
        assertEquals("2 days 0 hours 4 minutes", result);
    }

    @Test
    public void testFormatDurationWords_singularUnits_formatsCorrectGrammar() {
        long duration = DateUtils.MILLIS_PER_DAY
                + DateUtils.MILLIS_PER_HOUR
                + DateUtils.MILLIS_PER_MINUTE
                + DateUtils.MILLIS_PER_SECOND;
        String result = DurationFormatUtils.formatDurationWords(duration, false, false);
        assertEquals("1 day 1 hour 1 minute 1 second", result);
    }

    @Test
    public void testFormatDurationWords_suppressLeadingOnly_formatsCorrectly() {
        long duration = (5 * DateUtils.MILLIS_PER_MINUTE) + (6 * DateUtils.MILLIS_PER_SECOND);
        String result = DurationFormatUtils.formatDurationWords(duration, true, false);
        assertEquals("5 minutes 6 seconds", result);
    }

    @Test
    public void testFormatDurationWords_suppressTrailingOnly_formatsCorrectly() {
        long duration = (2 * DateUtils.MILLIS_PER_DAY) + (3 * DateUtils.MILLIS_PER_HOUR);
        String result = DurationFormatUtils.formatDurationWords(duration, false, true);
        assertEquals("2 days 3 hours", result);

        duration = (2 * DateUtils.MILLIS_PER_DAY);
        result = DurationFormatUtils.formatDurationWords(duration, false, true);
        assertEquals("2 days", result);
    }

    @Test
    public void testFormatDurationWords_noSuppression_formatsAllUnits() {
        long duration = 0;
        String result = DurationFormatUtils.formatDurationWords(duration, false, false);
        assertEquals("0 days 0 hours 0 minutes 0 seconds", result);
    }

    @Test
    public void testFormatPeriodISO_shortPeriodUnder28Days_delegatesToDurationFormat() {
        long start = 0;
        long end = 10 * DateUtils.MILLIS_PER_DAY;
        String result = DurationFormatUtils.formatPeriodISO(start, end);
        assertEquals("P0Y0M10DT0H0M0.0S", result);
    }

    @Test
    public void testFormatPeriodISO_multiYearPeriod_formatsCorrectIso() {
        Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal1.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        cal1.set(Calendar.MILLISECOND, 0);

        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal2.set(2021, Calendar.FEBRUARY, 2, 3, 4, 5);
        cal2.set(Calendar.MILLISECOND, 6);

        String result = DurationFormatUtils.formatPeriodISO(cal1.getTimeInMillis(), cal2.getTimeInMillis());
        assertEquals("P1Y1M1DT3H4M5.6S", result);
    }

    @Test
    public void testFormatPeriod_withDefaultTimeZoneAndPadding_formatsCorrectly() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2020, Calendar.JANUARY, 1, 10, 0, 0);
        cal1.set(Calendar.MILLISECOND, 0);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2020, Calendar.FEBRUARY, 15, 12, 30, 45);
        cal2.set(Calendar.MILLISECOND, 500);

        String result = DurationFormatUtils.formatPeriod(cal1.getTimeInMillis(), cal2.getTimeInMillis(), "M 'months' d 'days'");
        assertTrue(result.contains("1 months") || result.contains("1 month"));
    }

    @Test
    public void testFormatPeriod_under28Days_shortPath() {
        long start = 1000;
        long end = start + (5 * DateUtils.MILLIS_PER_DAY);
        String result = DurationFormatUtils.formatPeriod(start, end, "d 'days'");
        assertEquals("5 days", result);
    }

    @Test
    public void testFormatPeriod_withNegativeIntermediateDifferences_normalizesAndCalculates() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Calendar cal1 = Calendar.getInstance(tz);
        cal1.set(2020, Calendar.DECEMBER, 31, 23, 59, 59);
        cal1.set(Calendar.MILLISECOND, 900);

        Calendar cal2 = Calendar.getInstance(tz);
        cal2.set(2021, Calendar.FEBRUARY, 1, 0, 0, 0);
        cal2.set(Calendar.MILLISECOND, 100);

        String result = DurationFormatUtils.formatPeriod(
                cal1.getTimeInMillis(),
                cal2.getTimeInMillis(),
                "y-M-d H:m:s.S",
                false,
                tz
        );
        assertNotNull(result);
    }

    @Test
    public void testFormatPeriod_tokensWithoutYearsAndMonths_accumulatesIntoDays() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Calendar cal1 = Calendar.getInstance(tz);
        cal1.set(2019, Calendar.JANUARY, 1, 0, 0, 0);
        cal1.set(Calendar.MILLISECOND, 0);

        Calendar cal2 = Calendar.getInstance(tz);
        cal2.set(2021, Calendar.JANUARY, 1, 0, 0, 0);
        cal2.set(Calendar.MILLISECOND, 0);

        String result = DurationFormatUtils.formatPeriod(
                cal1.getTimeInMillis(),
                cal2.getTimeInMillis(),
                "d 'days'",
                false,
                tz
        );
        assertEquals("731 days", result);
    }

    @Test
    public void testFormatPeriod_tokensWithoutYearsWithMonths_accumulatesIntoMonths() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Calendar cal1 = Calendar.getInstance(tz);
        cal1.set(2019, Calendar.JANUARY, 1, 0, 0, 0);
        cal1.set(Calendar.MILLISECOND, 0);

        Calendar cal2 = Calendar.getInstance(tz);
        cal2.set(2021, Calendar.JANUARY, 1, 0, 0, 0);
        cal2.set(Calendar.MILLISECOND, 0);

        String result = DurationFormatUtils.formatPeriod(
                cal1.getTimeInMillis(),
                cal2.getTimeInMillis(),
                "M 'months'",
                false,
                tz
        );
        assertEquals("24 months", result);
    }

    @Test
    public void testFormatPeriod_tokensWithoutDaysHoursMinutesSeconds_accumulatesIntoLowerUnits() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Calendar cal1 = Calendar.getInstance(tz);
        cal1.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        cal1.set(Calendar.MILLISECOND, 0);

        Calendar cal2 = Calendar.getInstance(tz);
        cal2.set(2020, Calendar.FEBRUARY, 1, 1, 1, 1);
        cal2.set(Calendar.MILLISECOND, 100);

        String resultNoDays = DurationFormatUtils.formatPeriod(cal1.getTimeInMillis(), cal2.getTimeInMillis(), "H 'hours'", false, tz);
        assertNotNull(resultNoDays);

        String resultNoHours = DurationFormatUtils.formatPeriod(cal1.getTimeInMillis(), cal2.getTimeInMillis(), "m 'minutes'", false, tz);
        assertNotNull(resultNoHours);

        String resultNoMinutes = DurationFormatUtils.formatPeriod(cal1.getTimeInMillis(), cal2.getTimeInMillis(), "s 'seconds'", false, tz);
        assertNotNull(resultNoMinutes);

        String resultNoSeconds = DurationFormatUtils.formatPeriod(cal1.getTimeInMillis(), cal2.getTimeInMillis(), "S 'millis'", false, tz);
        assertNotNull(resultNoSeconds);
    }

    @Test
    public void testFormat_tokenValueBranches() {
        DurationFormatUtils.Token[] tokens = new DurationFormatUtils.Token[] {
                new DurationFormatUtils.Token(DurationFormatUtils.y, 2),
                new DurationFormatUtils.Token(new StringBuffer(" - ")),
                new DurationFormatUtils.Token(DurationFormatUtils.M, 2),
                new DurationFormatUtils.Token(new StringBuffer(" - ")),
                new DurationFormatUtils.Token(DurationFormatUtils.d, 2),
                new DurationFormatUtils.Token(new StringBuffer(" - ")),
                new DurationFormatUtils.Token(DurationFormatUtils.H, 2),
                new DurationFormatUtils.Token(new StringBuffer(" - ")),
                new DurationFormatUtils.Token(DurationFormatUtils.m, 2),
                new DurationFormatUtils.Token(new StringBuffer(" - ")),
                new DurationFormatUtils.Token(DurationFormatUtils.s, 2),
                new DurationFormatUtils.Token(new StringBuffer(" - ")),
                new DurationFormatUtils.Token(DurationFormatUtils.S, 3)
        };

        String formatted = DurationFormatUtils.format(tokens, 1, 2, 3, 4, 5, 6, 7, true);
        assertEquals("01 - 02 - 03 - 04 - 05 - 06 - 007", formatted);

        String unpadded = DurationFormatUtils.format(tokens, 1, 2, 3, 4, 5, 6, 7, false);
        assertEquals("1 - 2 - 3 - 4 - 5 - 6 - 7", unpadded);
    }

    @Test
    public void testLexx_literalAndEscapedTokens() {
        DurationFormatUtils.Token[] tokens = DurationFormatUtils.lexx("'Literal' yyyy 'Another' MM");
        assertNotNull(tokens);
        assertTrue(tokens.length >= 4);

        boolean containsY = DurationFormatUtils.Token.containsTokenWithValue(tokens, DurationFormatUtils.y);
        boolean containsM = DurationFormatUtils.Token.containsTokenWithValue(tokens, DurationFormatUtils.M);
        boolean containsD = DurationFormatUtils.Token.containsTokenWithValue(tokens, DurationFormatUtils.d);

        assertTrue(containsY);
        assertTrue(containsM);
        assertFalse(containsD);
    }

    @Test
    public void testLexx_allSpecialCharacters() {
        DurationFormatUtils.Token[] tokens = DurationFormatUtils.lexx("y M d H m s S");
        assertEquals(13, tokens.length);
        assertTrue(DurationFormatUtils.Token.containsTokenWithValue(tokens, DurationFormatUtils.y));
        assertTrue(DurationFormatUtils.Token.containsTokenWithValue(tokens, DurationFormatUtils.M));
        assertTrue(DurationFormatUtils.Token.containsTokenWithValue(tokens, DurationFormatUtils.d));
        assertTrue(DurationFormatUtils.Token.containsTokenWithValue(tokens, DurationFormatUtils.H));
        assertTrue(DurationFormatUtils.Token.containsTokenWithValue(tokens, DurationFormatUtils.m));
        assertTrue(DurationFormatUtils.Token.containsTokenWithValue(tokens, DurationFormatUtils.s));
        assertTrue(DurationFormatUtils.Token.containsTokenWithValue(tokens, DurationFormatUtils.S));
    }

    @Test
    public void testToken_equalsAndHashCodeAndToString() {
        DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(DurationFormatUtils.y, 4);
        DurationFormatUtils.Token token2 = new DurationFormatUtils.Token(DurationFormatUtils.y, 4);
        DurationFormatUtils.Token token3 = new DurationFormatUtils.Token(DurationFormatUtils.y, 2);
        DurationFormatUtils.Token token4 = new DurationFormatUtils.Token(DurationFormatUtils.M, 4);

        assertEquals(token1, token1);
        assertEquals(token1, token2);
        assertEquals(token1.hashCode(), token2.hashCode());
        assertFalse(token1.equals(token3));
        assertFalse(token1.equals(token4));
        assertFalse(token1.equals("Not a Token"));
        assertFalse(token1.equals(null));

        DurationFormatUtils.Token strBufToken1 = new DurationFormatUtils.Token(new StringBuffer("abc"));
        DurationFormatUtils.Token strBufToken2 = new DurationFormatUtils.Token(new StringBuffer("abc"));
        DurationFormatUtils.Token strBufToken3 = new DurationFormatUtils.Token(new StringBuffer("def"));
        assertEquals(strBufToken1, strBufToken2);
        assertFalse(strBufToken1.equals(strBufToken3));

        DurationFormatUtils.Token numToken1 = new DurationFormatUtils.Token(Integer.valueOf(10));
        DurationFormatUtils.Token numToken2 = new DurationFormatUtils.Token(Integer.valueOf(10));
        DurationFormatUtils.Token numToken3 = new DurationFormatUtils.Token(Integer.valueOf(20));
        assertEquals(numToken1, numToken2);
        assertFalse(numToken1.equals(numToken3));

        DurationFormatUtils.Token tokenCount = new DurationFormatUtils.Token(DurationFormatUtils.d);
        assertEquals(1, tokenCount.getCount());
        tokenCount.increment();
        assertEquals(2, tokenCount.getCount());
        assertEquals(DurationFormatUtils.d, tokenCount.getValue());
        assertEquals("dd", tokenCount.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testFormatDuration_nullFormat_throwsNullPointerException() {
        DurationFormatUtils.formatDuration(1000, null);
    }

    @Test(expected = NullPointerException.class)
    public void testFormatPeriod_nullFormat_throwsNullPointerException() {
        DurationFormatUtils.formatPeriod(1000, 2000, null);
    }
}
