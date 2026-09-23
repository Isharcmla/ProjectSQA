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

public class DateTimeFormatter_printTo_1361280449210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62830;
     Object term63036;
     Object term64267;
     Object term64269;

    public DateTimeFormatter_printTo_1361280449210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62830 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term62950 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber"));
        setField(term62830, term62830.getClass(), "iPrinter", term62950);
        term63036 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        term64267 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term64268 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber"));
        setIntField(term64268, term64268.getClass(), "iMinPrintedDigits", 0);
        setField(term64268, term64268.getClass(), "iFieldType", null);
        setIntField(term64268, term64268.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term64268, term64268.getClass(), "iSigned", false);
        setField(term64267, term64267.getClass(), "iPrinter", term64268);
        setField(term64267, term64267.getClass(), "iParser", null);
        setField(term64267, term64267.getClass(), "iLocale", null);
        setBooleanField(term64267, term64267.getClass(), "iOffsetParsed", false);
        setField(term64267, term64267.getClass(), "iChrono", null);
        setField(term64267, term64267.getClass(), "iZone", null);
        setField(term64267, term64267.getClass(), "iPivotYear", null);
        setIntField(term64267, term64267.getClass(), "iDefaultYear", 0);
        term64269 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term64269, term64269.getClass(), "iYearInfoCache", null);
        setIntField(term64269, term64269.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term64269, term64269.getClass(), "iBase", null);
        setField(term64269, term64269.getClass(), "iParam", null);
        setField(term64269, term64269.getClass(), "iMillis", null);
        setField(term64269, term64269.getClass(), "iSeconds", null);
        setField(term64269, term64269.getClass(), "iMinutes", null);
        setField(term64269, term64269.getClass(), "iHours", null);
        setField(term64269, term64269.getClass(), "iHalfdays", null);
        setField(term64269, term64269.getClass(), "iDays", null);
        setField(term64269, term64269.getClass(), "iWeeks", null);
        setField(term64269, term64269.getClass(), "iWeekyears", null);
        setField(term64269, term64269.getClass(), "iMonths", null);
        setField(term64269, term64269.getClass(), "iYears", null);
        setField(term64269, term64269.getClass(), "iCenturies", null);
        setField(term64269, term64269.getClass(), "iEras", null);
        setField(term64269, term64269.getClass(), "iMillisOfSecond", null);
        setField(term64269, term64269.getClass(), "iMillisOfDay", null);
        setField(term64269, term64269.getClass(), "iSecondOfMinute", null);
        setField(term64269, term64269.getClass(), "iSecondOfDay", null);
        setField(term64269, term64269.getClass(), "iMinuteOfHour", null);
        setField(term64269, term64269.getClass(), "iMinuteOfDay", null);
        setField(term64269, term64269.getClass(), "iHourOfDay", null);
        setField(term64269, term64269.getClass(), "iClockhourOfDay", null);
        setField(term64269, term64269.getClass(), "iHourOfHalfday", null);
        setField(term64269, term64269.getClass(), "iClockhourOfHalfday", null);
        setField(term64269, term64269.getClass(), "iHalfdayOfDay", null);
        setField(term64269, term64269.getClass(), "iDayOfWeek", null);
        setField(term64269, term64269.getClass(), "iDayOfMonth", null);
        setField(term64269, term64269.getClass(), "iDayOfYear", null);
        setField(term64269, term64269.getClass(), "iWeekOfWeekyear", null);
        setField(term64269, term64269.getClass(), "iWeekyear", null);
        setField(term64269, term64269.getClass(), "iWeekyearOfCentury", null);
        setField(term64269, term64269.getClass(), "iMonthOfYear", null);
        setField(term64269, term64269.getClass(), "iYear", null);
        setField(term64269, term64269.getClass(), "iYearOfEra", null);
        setField(term64269, term64269.getClass(), "iYearOfCentury", null);
        setField(term64269, term64269.getClass(), "iCenturyOfEra", null);
        setField(term64269, term64269.getClass(), "iEra", null);
        setIntField(term64269, term64269.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Writer");
        argTypes[1] = long.class;
        argTypes[2] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0L;
        args[2] = term63036;
        callMethod(klass, "printTo", argTypes, term62830, args);
        assertTrue(recursiveEquals(term62830, term64267));
        assertTrue(recursiveEquals(term63036, null));
    }

};


