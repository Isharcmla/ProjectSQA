package org.joda.time.chrono;

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
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.chrono.EqualityUtils.*;
import java.lang.Object;

public class ZonedChronology_withZone_1021979584335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129591;
     Object term130135;
     Object term130119;

    public ZonedChronology_withZone_1021979584335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129591 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term129665 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        Object term129803 = newInstance(Class.forName("org.joda.time.tz.UTCProvider"));
        setField(term129665, term129665.getClass(), "iNameKey", "UTC");
        setIntField(term129665, term129665.getClass(), "iWallOffset", 0);
        setIntField(term129665, term129665.getClass(), "iStandardOffset", 0);
        setField(term129665, term129665.getClass(), "iID", "UTC");
        setField(term129665, term129665.getClass(), "UTC", term129665);
        setField(term129665, term129665.getClass(), "cDefault", null);
        setField(term129665, term129665.getClass(), "cProvider", term129803);
        setField(term129591, term129591.getClass(), "iParam", term129665);
        term130135 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term130136 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term130135, term130135.getClass(), "iBase", null);
        setField(term130136, term130136.getClass(), "iNameKey", "UTC");
        setIntField(term130136, term130136.getClass(), "iWallOffset", 0);
        setIntField(term130136, term130136.getClass(), "iStandardOffset", 0);
        setField(term130136, term130136.getClass(), "iID", "UTC");
        setField(term130135, term130135.getClass(), "iParam", term130136);
        setField(term130135, term130135.getClass(), "iMillis", null);
        setField(term130135, term130135.getClass(), "iSeconds", null);
        setField(term130135, term130135.getClass(), "iMinutes", null);
        setField(term130135, term130135.getClass(), "iHours", null);
        setField(term130135, term130135.getClass(), "iHalfdays", null);
        setField(term130135, term130135.getClass(), "iDays", null);
        setField(term130135, term130135.getClass(), "iWeeks", null);
        setField(term130135, term130135.getClass(), "iWeekyears", null);
        setField(term130135, term130135.getClass(), "iMonths", null);
        setField(term130135, term130135.getClass(), "iYears", null);
        setField(term130135, term130135.getClass(), "iCenturies", null);
        setField(term130135, term130135.getClass(), "iEras", null);
        setField(term130135, term130135.getClass(), "iMillisOfSecond", null);
        setField(term130135, term130135.getClass(), "iMillisOfDay", null);
        setField(term130135, term130135.getClass(), "iSecondOfMinute", null);
        setField(term130135, term130135.getClass(), "iSecondOfDay", null);
        setField(term130135, term130135.getClass(), "iMinuteOfHour", null);
        setField(term130135, term130135.getClass(), "iMinuteOfDay", null);
        setField(term130135, term130135.getClass(), "iHourOfDay", null);
        setField(term130135, term130135.getClass(), "iClockhourOfDay", null);
        setField(term130135, term130135.getClass(), "iHourOfHalfday", null);
        setField(term130135, term130135.getClass(), "iClockhourOfHalfday", null);
        setField(term130135, term130135.getClass(), "iHalfdayOfDay", null);
        setField(term130135, term130135.getClass(), "iDayOfWeek", null);
        setField(term130135, term130135.getClass(), "iDayOfMonth", null);
        setField(term130135, term130135.getClass(), "iDayOfYear", null);
        setField(term130135, term130135.getClass(), "iWeekOfWeekyear", null);
        setField(term130135, term130135.getClass(), "iWeekyear", null);
        setField(term130135, term130135.getClass(), "iWeekyearOfCentury", null);
        setField(term130135, term130135.getClass(), "iMonthOfYear", null);
        setField(term130135, term130135.getClass(), "iYear", null);
        setField(term130135, term130135.getClass(), "iYearOfEra", null);
        setField(term130135, term130135.getClass(), "iYearOfCentury", null);
        setField(term130135, term130135.getClass(), "iCenturyOfEra", null);
        setField(term130135, term130135.getClass(), "iEra", null);
        setIntField(term130135, term130135.getClass(), "iBaseFlags", 0);
        term130119 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term130120 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term130119, term130119.getClass(), "iBase", null);
        setField(term130120, term130120.getClass(), "iNameKey", "UTC");
        setIntField(term130120, term130120.getClass(), "iWallOffset", 0);
        setIntField(term130120, term130120.getClass(), "iStandardOffset", 0);
        setField(term130120, term130120.getClass(), "iID", "UTC");
        setField(term130119, term130119.getClass(), "iParam", term130120);
        setField(term130119, term130119.getClass(), "iMillis", null);
        setField(term130119, term130119.getClass(), "iSeconds", null);
        setField(term130119, term130119.getClass(), "iMinutes", null);
        setField(term130119, term130119.getClass(), "iHours", null);
        setField(term130119, term130119.getClass(), "iHalfdays", null);
        setField(term130119, term130119.getClass(), "iDays", null);
        setField(term130119, term130119.getClass(), "iWeeks", null);
        setField(term130119, term130119.getClass(), "iWeekyears", null);
        setField(term130119, term130119.getClass(), "iMonths", null);
        setField(term130119, term130119.getClass(), "iYears", null);
        setField(term130119, term130119.getClass(), "iCenturies", null);
        setField(term130119, term130119.getClass(), "iEras", null);
        setField(term130119, term130119.getClass(), "iMillisOfSecond", null);
        setField(term130119, term130119.getClass(), "iMillisOfDay", null);
        setField(term130119, term130119.getClass(), "iSecondOfMinute", null);
        setField(term130119, term130119.getClass(), "iSecondOfDay", null);
        setField(term130119, term130119.getClass(), "iMinuteOfHour", null);
        setField(term130119, term130119.getClass(), "iMinuteOfDay", null);
        setField(term130119, term130119.getClass(), "iHourOfDay", null);
        setField(term130119, term130119.getClass(), "iClockhourOfDay", null);
        setField(term130119, term130119.getClass(), "iHourOfHalfday", null);
        setField(term130119, term130119.getClass(), "iClockhourOfHalfday", null);
        setField(term130119, term130119.getClass(), "iHalfdayOfDay", null);
        setField(term130119, term130119.getClass(), "iDayOfWeek", null);
        setField(term130119, term130119.getClass(), "iDayOfMonth", null);
        setField(term130119, term130119.getClass(), "iDayOfYear", null);
        setField(term130119, term130119.getClass(), "iWeekOfWeekyear", null);
        setField(term130119, term130119.getClass(), "iWeekyear", null);
        setField(term130119, term130119.getClass(), "iWeekyearOfCentury", null);
        setField(term130119, term130119.getClass(), "iMonthOfYear", null);
        setField(term130119, term130119.getClass(), "iYear", null);
        setField(term130119, term130119.getClass(), "iYearOfEra", null);
        setField(term130119, term130119.getClass(), "iYearOfCentury", null);
        setField(term130119, term130119.getClass(), "iCenturyOfEra", null);
        setField(term130119, term130119.getClass(), "iEra", null);
        setIntField(term130119, term130119.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DateTimeZone");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "withZone", argTypes, term129591, args);
        assertTrue(recursiveEquals(term129591, term130135));
        assertTrue(recursiveEquals(retValue, term130119));
    }

};


