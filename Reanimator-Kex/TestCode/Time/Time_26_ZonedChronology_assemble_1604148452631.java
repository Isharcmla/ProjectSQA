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

public class ZonedChronology_assemble_1604148452631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327914;
     Object term328014;
     Object term328530;
     Object term328531;

    public ZonedChronology_assemble_1604148452631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327914 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term327914, term327914.getClass(), "iParam", null);
        term328014 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term328108 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term328224 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term328344 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term328438 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        setField(term328014, term328014.getClass(), "eras", null);
        setField(term328014, term328014.getClass(), "centuries", null);
        setField(term328014, term328014.getClass(), "years", null);
        setField(term328014, term328014.getClass(), "months", null);
        setField(term328014, term328014.getClass(), "weekyears", null);
        setField(term328014, term328014.getClass(), "weeks", null);
        setField(term328014, term328014.getClass(), "days", null);
        setField(term328014, term328014.getClass(), "halfdays", null);
        setField(term328014, term328014.getClass(), "hours", null);
        setField(term328014, term328014.getClass(), "minutes", null);
        setField(term328014, term328014.getClass(), "seconds", null);
        setField(term328014, term328014.getClass(), "millis", null);
        setField(term328014, term328014.getClass(), "year", null);
        setField(term328014, term328014.getClass(), "yearOfEra", null);
        setField(term328014, term328014.getClass(), "yearOfCentury", null);
        setField(term328014, term328014.getClass(), "centuryOfEra", null);
        setField(term328014, term328014.getClass(), "era", null);
        setField(term328014, term328014.getClass(), "dayOfWeek", null);
        setField(term328014, term328014.getClass(), "dayOfMonth", null);
        setField(term328014, term328014.getClass(), "dayOfYear", null);
        setField(term328014, term328014.getClass(), "monthOfYear", null);
        setField(term328014, term328014.getClass(), "weekOfWeekyear", null);
        setField(term328014, term328014.getClass(), "weekyear", null);
        setField(term328014, term328014.getClass(), "weekyearOfCentury", null);
        setField(term328014, term328014.getClass(), "millisOfSecond", null);
        setField(term328014, term328014.getClass(), "millisOfDay", term328108);
        setField(term328014, term328014.getClass(), "secondOfMinute", null);
        setField(term328014, term328014.getClass(), "secondOfDay", null);
        setField(term328014, term328014.getClass(), "minuteOfHour", null);
        setField(term328224, term328224.getClass(), "iDurationField", null);
        setField(term328224, term328224.getClass(), "iRangeDurationField", null);
        setField(term328224, term328224.getClass(), "iLeapDurationField", null);
        setField(term328224, term328224.getClass(), "iType", term328344);
        setField(term328014, term328014.getClass(), "minuteOfDay", term328224);
        setField(term328014, term328014.getClass(), "hourOfDay", null);
        setField(term328014, term328014.getClass(), "hourOfHalfday", term328438);
        term328530 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term328530, term328530.getClass(), "iBase", null);
        setField(term328530, term328530.getClass(), "iParam", null);
        setField(term328530, term328530.getClass(), "iMillis", null);
        setField(term328530, term328530.getClass(), "iSeconds", null);
        setField(term328530, term328530.getClass(), "iMinutes", null);
        setField(term328530, term328530.getClass(), "iHours", null);
        setField(term328530, term328530.getClass(), "iHalfdays", null);
        setField(term328530, term328530.getClass(), "iDays", null);
        setField(term328530, term328530.getClass(), "iWeeks", null);
        setField(term328530, term328530.getClass(), "iWeekyears", null);
        setField(term328530, term328530.getClass(), "iMonths", null);
        setField(term328530, term328530.getClass(), "iYears", null);
        setField(term328530, term328530.getClass(), "iCenturies", null);
        setField(term328530, term328530.getClass(), "iEras", null);
        setField(term328530, term328530.getClass(), "iMillisOfSecond", null);
        setField(term328530, term328530.getClass(), "iMillisOfDay", null);
        setField(term328530, term328530.getClass(), "iSecondOfMinute", null);
        setField(term328530, term328530.getClass(), "iSecondOfDay", null);
        setField(term328530, term328530.getClass(), "iMinuteOfHour", null);
        setField(term328530, term328530.getClass(), "iMinuteOfDay", null);
        setField(term328530, term328530.getClass(), "iHourOfDay", null);
        setField(term328530, term328530.getClass(), "iClockhourOfDay", null);
        setField(term328530, term328530.getClass(), "iHourOfHalfday", null);
        setField(term328530, term328530.getClass(), "iClockhourOfHalfday", null);
        setField(term328530, term328530.getClass(), "iHalfdayOfDay", null);
        setField(term328530, term328530.getClass(), "iDayOfWeek", null);
        setField(term328530, term328530.getClass(), "iDayOfMonth", null);
        setField(term328530, term328530.getClass(), "iDayOfYear", null);
        setField(term328530, term328530.getClass(), "iWeekOfWeekyear", null);
        setField(term328530, term328530.getClass(), "iWeekyear", null);
        setField(term328530, term328530.getClass(), "iWeekyearOfCentury", null);
        setField(term328530, term328530.getClass(), "iMonthOfYear", null);
        setField(term328530, term328530.getClass(), "iYear", null);
        setField(term328530, term328530.getClass(), "iYearOfEra", null);
        setField(term328530, term328530.getClass(), "iYearOfCentury", null);
        setField(term328530, term328530.getClass(), "iCenturyOfEra", null);
        setField(term328530, term328530.getClass(), "iEra", null);
        setIntField(term328530, term328530.getClass(), "iBaseFlags", 0);
        term328531 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term328532 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term328533 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term328534 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term328535 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term328536 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        setField(term328531, term328531.getClass(), "millis", null);
        setField(term328531, term328531.getClass(), "seconds", null);
        setField(term328531, term328531.getClass(), "minutes", null);
        setField(term328531, term328531.getClass(), "hours", null);
        setField(term328531, term328531.getClass(), "halfdays", null);
        setField(term328531, term328531.getClass(), "days", null);
        setField(term328531, term328531.getClass(), "weeks", null);
        setField(term328531, term328531.getClass(), "weekyears", null);
        setField(term328531, term328531.getClass(), "months", null);
        setField(term328531, term328531.getClass(), "years", null);
        setField(term328531, term328531.getClass(), "centuries", null);
        setField(term328531, term328531.getClass(), "eras", null);
        setField(term328531, term328531.getClass(), "millisOfSecond", null);
        setField(term328532, term328532.getClass(), "iType", null);
        setField(term328532, term328532.getClass(), "iDurationField", null);
        setField(term328531, term328531.getClass(), "millisOfDay", term328532);
        setField(term328531, term328531.getClass(), "secondOfMinute", null);
        setField(term328531, term328531.getClass(), "secondOfDay", null);
        setField(term328531, term328531.getClass(), "minuteOfHour", null);
        setField(term328534, term328534.getClass(), "iField", null);
        setField(term328534, term328534.getClass(), "iZone", null);
        setField(term328534, term328534.getClass(), "iDurationField", null);
        setBooleanField(term328534, term328534.getClass(), "iTimeField", false);
        setField(term328534, term328534.getClass(), "iRangeDurationField", null);
        setField(term328534, term328534.getClass(), "iLeapDurationField", null);
        setByteField(term328535, term328535.getClass(), "iOrdinal", (byte) 0);
        setField(term328535, term328535.getClass(), "iUnitType", null);
        setField(term328535, term328535.getClass(), "iRangeType", null);
        setField(term328535, term328535.getClass(), "iName", null);
        setField(term328534, term328534.getClass(), "iType", term328535);
        setField(term328533, term328533.getClass(), "iField", term328534);
        setField(term328533, term328533.getClass(), "iZone", null);
        setField(term328533, term328533.getClass(), "iDurationField", null);
        setBooleanField(term328533, term328533.getClass(), "iTimeField", false);
        setField(term328533, term328533.getClass(), "iRangeDurationField", null);
        setField(term328533, term328533.getClass(), "iLeapDurationField", null);
        setField(term328533, term328533.getClass(), "iType", term328535);
        setField(term328531, term328531.getClass(), "minuteOfDay", term328533);
        setField(term328531, term328531.getClass(), "hourOfDay", null);
        setField(term328531, term328531.getClass(), "clockhourOfDay", null);
        setField(term328536, term328536.getClass(), "iType", null);
        setField(term328536, term328536.getClass(), "iDurationField", null);
        setField(term328531, term328531.getClass(), "hourOfHalfday", term328536);
        setField(term328531, term328531.getClass(), "clockhourOfHalfday", null);
        setField(term328531, term328531.getClass(), "halfdayOfDay", null);
        setField(term328531, term328531.getClass(), "dayOfWeek", null);
        setField(term328531, term328531.getClass(), "dayOfMonth", null);
        setField(term328531, term328531.getClass(), "dayOfYear", null);
        setField(term328531, term328531.getClass(), "weekOfWeekyear", null);
        setField(term328531, term328531.getClass(), "weekyear", null);
        setField(term328531, term328531.getClass(), "weekyearOfCentury", null);
        setField(term328531, term328531.getClass(), "monthOfYear", null);
        setField(term328531, term328531.getClass(), "year", null);
        setField(term328531, term328531.getClass(), "yearOfEra", null);
        setField(term328531, term328531.getClass(), "yearOfCentury", null);
        setField(term328531, term328531.getClass(), "centuryOfEra", null);
        setField(term328531, term328531.getClass(), "era", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term328014;
        callMethod(klass, "assemble", argTypes, term327914, args);
        assertTrue(recursiveEquals(term327914, term328530));
        assertTrue(recursiveEquals(term328014, term328531));
    }

};


