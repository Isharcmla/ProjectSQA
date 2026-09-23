package org.joda.time.format;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.lang.Object;

public class DateTimeFormatter_withChronology_444327897103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12637;
     Object term12709;
     Object term14509;
     Object term14510;
     Object term14503;

    public DateTimeFormatter_withChronology_444327897103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12637 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term12637, term12637.getClass(), "iChrono", null);
        term12709 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        term14509 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term14509, term14509.getClass(), "iPrinter", null);
        setField(term14509, term14509.getClass(), "iParser", null);
        setField(term14509, term14509.getClass(), "iLocale", null);
        setBooleanField(term14509, term14509.getClass(), "iOffsetParsed", false);
        setField(term14509, term14509.getClass(), "iChrono", null);
        setField(term14509, term14509.getClass(), "iZone", null);
        setField(term14509, term14509.getClass(), "iPivotYear", null);
        setIntField(term14509, term14509.getClass(), "iDefaultYear", 0);
        term14510 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term14510, term14510.getClass(), "iJulianChronology", null);
        setField(term14510, term14510.getClass(), "iGregorianChronology", null);
        setField(term14510, term14510.getClass(), "iCutoverInstant", null);
        setLongField(term14510, term14510.getClass(), "iCutoverMillis", 0L);
        setLongField(term14510, term14510.getClass(), "iGapDuration", 0L);
        setField(term14510, term14510.getClass(), "iBase", null);
        setField(term14510, term14510.getClass(), "iParam", null);
        setField(term14510, term14510.getClass(), "iMillis", null);
        setField(term14510, term14510.getClass(), "iSeconds", null);
        setField(term14510, term14510.getClass(), "iMinutes", null);
        setField(term14510, term14510.getClass(), "iHours", null);
        setField(term14510, term14510.getClass(), "iHalfdays", null);
        setField(term14510, term14510.getClass(), "iDays", null);
        setField(term14510, term14510.getClass(), "iWeeks", null);
        setField(term14510, term14510.getClass(), "iWeekyears", null);
        setField(term14510, term14510.getClass(), "iMonths", null);
        setField(term14510, term14510.getClass(), "iYears", null);
        setField(term14510, term14510.getClass(), "iCenturies", null);
        setField(term14510, term14510.getClass(), "iEras", null);
        setField(term14510, term14510.getClass(), "iMillisOfSecond", null);
        setField(term14510, term14510.getClass(), "iMillisOfDay", null);
        setField(term14510, term14510.getClass(), "iSecondOfMinute", null);
        setField(term14510, term14510.getClass(), "iSecondOfDay", null);
        setField(term14510, term14510.getClass(), "iMinuteOfHour", null);
        setField(term14510, term14510.getClass(), "iMinuteOfDay", null);
        setField(term14510, term14510.getClass(), "iHourOfDay", null);
        setField(term14510, term14510.getClass(), "iClockhourOfDay", null);
        setField(term14510, term14510.getClass(), "iHourOfHalfday", null);
        setField(term14510, term14510.getClass(), "iClockhourOfHalfday", null);
        setField(term14510, term14510.getClass(), "iHalfdayOfDay", null);
        setField(term14510, term14510.getClass(), "iDayOfWeek", null);
        setField(term14510, term14510.getClass(), "iDayOfMonth", null);
        setField(term14510, term14510.getClass(), "iDayOfYear", null);
        setField(term14510, term14510.getClass(), "iWeekOfWeekyear", null);
        setField(term14510, term14510.getClass(), "iWeekyear", null);
        setField(term14510, term14510.getClass(), "iWeekyearOfCentury", null);
        setField(term14510, term14510.getClass(), "iMonthOfYear", null);
        setField(term14510, term14510.getClass(), "iYear", null);
        setField(term14510, term14510.getClass(), "iYearOfEra", null);
        setField(term14510, term14510.getClass(), "iYearOfCentury", null);
        setField(term14510, term14510.getClass(), "iCenturyOfEra", null);
        setField(term14510, term14510.getClass(), "iEra", null);
        setIntField(term14510, term14510.getClass(), "iBaseFlags", 0);
        term14503 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term14498 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term14503, term14503.getClass(), "iPrinter", null);
        setField(term14503, term14503.getClass(), "iParser", null);
        setField(term14503, term14503.getClass(), "iLocale", null);
        setBooleanField(term14503, term14503.getClass(), "iOffsetParsed", false);
        setField(term14498, term14498.getClass(), "iJulianChronology", null);
        setField(term14498, term14498.getClass(), "iGregorianChronology", null);
        setField(term14498, term14498.getClass(), "iCutoverInstant", null);
        setLongField(term14498, term14498.getClass(), "iCutoverMillis", 0L);
        setLongField(term14498, term14498.getClass(), "iGapDuration", 0L);
        setField(term14498, term14498.getClass(), "iBase", null);
        setField(term14498, term14498.getClass(), "iParam", null);
        setField(term14498, term14498.getClass(), "iMillis", null);
        setField(term14498, term14498.getClass(), "iSeconds", null);
        setField(term14498, term14498.getClass(), "iMinutes", null);
        setField(term14498, term14498.getClass(), "iHours", null);
        setField(term14498, term14498.getClass(), "iHalfdays", null);
        setField(term14498, term14498.getClass(), "iDays", null);
        setField(term14498, term14498.getClass(), "iWeeks", null);
        setField(term14498, term14498.getClass(), "iWeekyears", null);
        setField(term14498, term14498.getClass(), "iMonths", null);
        setField(term14498, term14498.getClass(), "iYears", null);
        setField(term14498, term14498.getClass(), "iCenturies", null);
        setField(term14498, term14498.getClass(), "iEras", null);
        setField(term14498, term14498.getClass(), "iMillisOfSecond", null);
        setField(term14498, term14498.getClass(), "iMillisOfDay", null);
        setField(term14498, term14498.getClass(), "iSecondOfMinute", null);
        setField(term14498, term14498.getClass(), "iSecondOfDay", null);
        setField(term14498, term14498.getClass(), "iMinuteOfHour", null);
        setField(term14498, term14498.getClass(), "iMinuteOfDay", null);
        setField(term14498, term14498.getClass(), "iHourOfDay", null);
        setField(term14498, term14498.getClass(), "iClockhourOfDay", null);
        setField(term14498, term14498.getClass(), "iHourOfHalfday", null);
        setField(term14498, term14498.getClass(), "iClockhourOfHalfday", null);
        setField(term14498, term14498.getClass(), "iHalfdayOfDay", null);
        setField(term14498, term14498.getClass(), "iDayOfWeek", null);
        setField(term14498, term14498.getClass(), "iDayOfMonth", null);
        setField(term14498, term14498.getClass(), "iDayOfYear", null);
        setField(term14498, term14498.getClass(), "iWeekOfWeekyear", null);
        setField(term14498, term14498.getClass(), "iWeekyear", null);
        setField(term14498, term14498.getClass(), "iWeekyearOfCentury", null);
        setField(term14498, term14498.getClass(), "iMonthOfYear", null);
        setField(term14498, term14498.getClass(), "iYear", null);
        setField(term14498, term14498.getClass(), "iYearOfEra", null);
        setField(term14498, term14498.getClass(), "iYearOfCentury", null);
        setField(term14498, term14498.getClass(), "iCenturyOfEra", null);
        setField(term14498, term14498.getClass(), "iEra", null);
        setIntField(term14498, term14498.getClass(), "iBaseFlags", 0);
        setField(term14503, term14503.getClass(), "iChrono", term14498);
        setField(term14503, term14503.getClass(), "iZone", null);
        setField(term14503, term14503.getClass(), "iPivotYear", null);
        setIntField(term14503, term14503.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[1];
        args[0] = term12709;
        Object retValue = callMethod(klass, "withChronology", argTypes, term12637, args);
        assertTrue(recursiveEquals(term12637, term14509));
        assertTrue(recursiveEquals(term12709, term14510));
        assertTrue(recursiveEquals(retValue, term14503));
    }

};


