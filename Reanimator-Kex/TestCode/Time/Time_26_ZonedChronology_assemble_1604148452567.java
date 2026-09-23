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

public class ZonedChronology_assemble_1604148452567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257896;
     Object term257996;
     Object term258415;
     Object term258416;

    public ZonedChronology_assemble_1604148452567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257896 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term257896, term257896.getClass(), "iParam", null);
        term257996 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term258090 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term258206 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term258326 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setField(term257996, term257996.getClass(), "eras", null);
        setField(term257996, term257996.getClass(), "centuries", null);
        setField(term257996, term257996.getClass(), "years", null);
        setField(term257996, term257996.getClass(), "months", null);
        setField(term257996, term257996.getClass(), "weekyears", null);
        setField(term257996, term257996.getClass(), "weeks", null);
        setField(term257996, term257996.getClass(), "days", null);
        setField(term257996, term257996.getClass(), "halfdays", null);
        setField(term257996, term257996.getClass(), "hours", null);
        setField(term257996, term257996.getClass(), "minutes", null);
        setField(term257996, term257996.getClass(), "seconds", null);
        setField(term257996, term257996.getClass(), "millis", null);
        setField(term257996, term257996.getClass(), "year", null);
        setField(term257996, term257996.getClass(), "yearOfEra", null);
        setField(term257996, term257996.getClass(), "yearOfCentury", null);
        setField(term257996, term257996.getClass(), "centuryOfEra", null);
        setField(term257996, term257996.getClass(), "era", null);
        setField(term257996, term257996.getClass(), "dayOfWeek", null);
        setField(term257996, term257996.getClass(), "dayOfMonth", null);
        setField(term257996, term257996.getClass(), "dayOfYear", null);
        setField(term257996, term257996.getClass(), "monthOfYear", null);
        setField(term257996, term257996.getClass(), "weekOfWeekyear", null);
        setField(term257996, term257996.getClass(), "weekyear", null);
        setField(term257996, term257996.getClass(), "weekyearOfCentury", null);
        setField(term257996, term257996.getClass(), "millisOfSecond", null);
        setField(term257996, term257996.getClass(), "millisOfDay", term258090);
        setField(term257996, term257996.getClass(), "secondOfMinute", null);
        setField(term257996, term257996.getClass(), "secondOfDay", null);
        setField(term257996, term257996.getClass(), "minuteOfHour", null);
        setField(term258206, term258206.getClass(), "iDurationField", null);
        setField(term258206, term258206.getClass(), "iRangeDurationField", null);
        setField(term258206, term258206.getClass(), "iLeapDurationField", null);
        setField(term258206, term258206.getClass(), "iType", term258326);
        setField(term257996, term257996.getClass(), "minuteOfDay", term258206);
        term258415 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term258415, term258415.getClass(), "iBase", null);
        setField(term258415, term258415.getClass(), "iParam", null);
        setField(term258415, term258415.getClass(), "iMillis", null);
        setField(term258415, term258415.getClass(), "iSeconds", null);
        setField(term258415, term258415.getClass(), "iMinutes", null);
        setField(term258415, term258415.getClass(), "iHours", null);
        setField(term258415, term258415.getClass(), "iHalfdays", null);
        setField(term258415, term258415.getClass(), "iDays", null);
        setField(term258415, term258415.getClass(), "iWeeks", null);
        setField(term258415, term258415.getClass(), "iWeekyears", null);
        setField(term258415, term258415.getClass(), "iMonths", null);
        setField(term258415, term258415.getClass(), "iYears", null);
        setField(term258415, term258415.getClass(), "iCenturies", null);
        setField(term258415, term258415.getClass(), "iEras", null);
        setField(term258415, term258415.getClass(), "iMillisOfSecond", null);
        setField(term258415, term258415.getClass(), "iMillisOfDay", null);
        setField(term258415, term258415.getClass(), "iSecondOfMinute", null);
        setField(term258415, term258415.getClass(), "iSecondOfDay", null);
        setField(term258415, term258415.getClass(), "iMinuteOfHour", null);
        setField(term258415, term258415.getClass(), "iMinuteOfDay", null);
        setField(term258415, term258415.getClass(), "iHourOfDay", null);
        setField(term258415, term258415.getClass(), "iClockhourOfDay", null);
        setField(term258415, term258415.getClass(), "iHourOfHalfday", null);
        setField(term258415, term258415.getClass(), "iClockhourOfHalfday", null);
        setField(term258415, term258415.getClass(), "iHalfdayOfDay", null);
        setField(term258415, term258415.getClass(), "iDayOfWeek", null);
        setField(term258415, term258415.getClass(), "iDayOfMonth", null);
        setField(term258415, term258415.getClass(), "iDayOfYear", null);
        setField(term258415, term258415.getClass(), "iWeekOfWeekyear", null);
        setField(term258415, term258415.getClass(), "iWeekyear", null);
        setField(term258415, term258415.getClass(), "iWeekyearOfCentury", null);
        setField(term258415, term258415.getClass(), "iMonthOfYear", null);
        setField(term258415, term258415.getClass(), "iYear", null);
        setField(term258415, term258415.getClass(), "iYearOfEra", null);
        setField(term258415, term258415.getClass(), "iYearOfCentury", null);
        setField(term258415, term258415.getClass(), "iCenturyOfEra", null);
        setField(term258415, term258415.getClass(), "iEra", null);
        setIntField(term258415, term258415.getClass(), "iBaseFlags", 0);
        term258416 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term258417 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term258418 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term258419 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term258420 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setField(term258416, term258416.getClass(), "millis", null);
        setField(term258416, term258416.getClass(), "seconds", null);
        setField(term258416, term258416.getClass(), "minutes", null);
        setField(term258416, term258416.getClass(), "hours", null);
        setField(term258416, term258416.getClass(), "halfdays", null);
        setField(term258416, term258416.getClass(), "days", null);
        setField(term258416, term258416.getClass(), "weeks", null);
        setField(term258416, term258416.getClass(), "weekyears", null);
        setField(term258416, term258416.getClass(), "months", null);
        setField(term258416, term258416.getClass(), "years", null);
        setField(term258416, term258416.getClass(), "centuries", null);
        setField(term258416, term258416.getClass(), "eras", null);
        setField(term258416, term258416.getClass(), "millisOfSecond", null);
        setField(term258417, term258417.getClass(), "iType", null);
        setField(term258417, term258417.getClass(), "iDurationField", null);
        setField(term258416, term258416.getClass(), "millisOfDay", term258417);
        setField(term258416, term258416.getClass(), "secondOfMinute", null);
        setField(term258416, term258416.getClass(), "secondOfDay", null);
        setField(term258416, term258416.getClass(), "minuteOfHour", null);
        setField(term258419, term258419.getClass(), "iField", null);
        setField(term258419, term258419.getClass(), "iZone", null);
        setField(term258419, term258419.getClass(), "iDurationField", null);
        setBooleanField(term258419, term258419.getClass(), "iTimeField", false);
        setField(term258419, term258419.getClass(), "iRangeDurationField", null);
        setField(term258419, term258419.getClass(), "iLeapDurationField", null);
        setByteField(term258420, term258420.getClass(), "iOrdinal", (byte) 0);
        setField(term258420, term258420.getClass(), "iUnitType", null);
        setField(term258420, term258420.getClass(), "iRangeType", null);
        setField(term258420, term258420.getClass(), "iName", null);
        setField(term258419, term258419.getClass(), "iType", term258420);
        setField(term258418, term258418.getClass(), "iField", term258419);
        setField(term258418, term258418.getClass(), "iZone", null);
        setField(term258418, term258418.getClass(), "iDurationField", null);
        setBooleanField(term258418, term258418.getClass(), "iTimeField", false);
        setField(term258418, term258418.getClass(), "iRangeDurationField", null);
        setField(term258418, term258418.getClass(), "iLeapDurationField", null);
        setField(term258418, term258418.getClass(), "iType", term258420);
        setField(term258416, term258416.getClass(), "minuteOfDay", term258418);
        setField(term258416, term258416.getClass(), "hourOfDay", null);
        setField(term258416, term258416.getClass(), "clockhourOfDay", null);
        setField(term258416, term258416.getClass(), "hourOfHalfday", null);
        setField(term258416, term258416.getClass(), "clockhourOfHalfday", null);
        setField(term258416, term258416.getClass(), "halfdayOfDay", null);
        setField(term258416, term258416.getClass(), "dayOfWeek", null);
        setField(term258416, term258416.getClass(), "dayOfMonth", null);
        setField(term258416, term258416.getClass(), "dayOfYear", null);
        setField(term258416, term258416.getClass(), "weekOfWeekyear", null);
        setField(term258416, term258416.getClass(), "weekyear", null);
        setField(term258416, term258416.getClass(), "weekyearOfCentury", null);
        setField(term258416, term258416.getClass(), "monthOfYear", null);
        setField(term258416, term258416.getClass(), "year", null);
        setField(term258416, term258416.getClass(), "yearOfEra", null);
        setField(term258416, term258416.getClass(), "yearOfCentury", null);
        setField(term258416, term258416.getClass(), "centuryOfEra", null);
        setField(term258416, term258416.getClass(), "era", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term257996;
        callMethod(klass, "assemble", argTypes, term257896, args);
        assertTrue(recursiveEquals(term257896, term258415));
        assertTrue(recursiveEquals(term257996, term258416));
    }

};


