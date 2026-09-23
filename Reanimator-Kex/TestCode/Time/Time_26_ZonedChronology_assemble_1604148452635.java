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

public class ZonedChronology_assemble_1604148452635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329875;
     Object term329975;
     Object term330396;
     Object term330397;

    public ZonedChronology_assemble_1604148452635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329875 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term329875, term329875.getClass(), "iParam", null);
        term329975 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term330091 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term330185 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term330305 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setField(term329975, term329975.getClass(), "eras", null);
        setField(term329975, term329975.getClass(), "centuries", null);
        setField(term329975, term329975.getClass(), "years", null);
        setField(term329975, term329975.getClass(), "months", null);
        setField(term329975, term329975.getClass(), "weekyears", null);
        setField(term329975, term329975.getClass(), "weeks", null);
        setField(term329975, term329975.getClass(), "days", null);
        setField(term329975, term329975.getClass(), "halfdays", null);
        setField(term329975, term329975.getClass(), "hours", null);
        setField(term329975, term329975.getClass(), "minutes", null);
        setField(term329975, term329975.getClass(), "seconds", null);
        setField(term329975, term329975.getClass(), "millis", null);
        setField(term329975, term329975.getClass(), "year", null);
        setField(term329975, term329975.getClass(), "yearOfEra", null);
        setField(term329975, term329975.getClass(), "yearOfCentury", null);
        setField(term329975, term329975.getClass(), "centuryOfEra", null);
        setField(term329975, term329975.getClass(), "era", null);
        setField(term329975, term329975.getClass(), "dayOfWeek", null);
        setField(term329975, term329975.getClass(), "dayOfMonth", null);
        setField(term329975, term329975.getClass(), "dayOfYear", null);
        setField(term329975, term329975.getClass(), "monthOfYear", null);
        setField(term329975, term329975.getClass(), "weekOfWeekyear", null);
        setField(term329975, term329975.getClass(), "weekyear", null);
        setField(term329975, term329975.getClass(), "weekyearOfCentury", null);
        setField(term330091, term330091.getClass(), "iDurationField", term330185);
        setField(term330091, term330091.getClass(), "iRangeDurationField", null);
        setField(term330091, term330091.getClass(), "iLeapDurationField", null);
        setField(term330091, term330091.getClass(), "iType", term330305);
        setField(term329975, term329975.getClass(), "millisOfSecond", term330091);
        term330396 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term330396, term330396.getClass(), "iBase", null);
        setField(term330396, term330396.getClass(), "iParam", null);
        setField(term330396, term330396.getClass(), "iMillis", null);
        setField(term330396, term330396.getClass(), "iSeconds", null);
        setField(term330396, term330396.getClass(), "iMinutes", null);
        setField(term330396, term330396.getClass(), "iHours", null);
        setField(term330396, term330396.getClass(), "iHalfdays", null);
        setField(term330396, term330396.getClass(), "iDays", null);
        setField(term330396, term330396.getClass(), "iWeeks", null);
        setField(term330396, term330396.getClass(), "iWeekyears", null);
        setField(term330396, term330396.getClass(), "iMonths", null);
        setField(term330396, term330396.getClass(), "iYears", null);
        setField(term330396, term330396.getClass(), "iCenturies", null);
        setField(term330396, term330396.getClass(), "iEras", null);
        setField(term330396, term330396.getClass(), "iMillisOfSecond", null);
        setField(term330396, term330396.getClass(), "iMillisOfDay", null);
        setField(term330396, term330396.getClass(), "iSecondOfMinute", null);
        setField(term330396, term330396.getClass(), "iSecondOfDay", null);
        setField(term330396, term330396.getClass(), "iMinuteOfHour", null);
        setField(term330396, term330396.getClass(), "iMinuteOfDay", null);
        setField(term330396, term330396.getClass(), "iHourOfDay", null);
        setField(term330396, term330396.getClass(), "iClockhourOfDay", null);
        setField(term330396, term330396.getClass(), "iHourOfHalfday", null);
        setField(term330396, term330396.getClass(), "iClockhourOfHalfday", null);
        setField(term330396, term330396.getClass(), "iHalfdayOfDay", null);
        setField(term330396, term330396.getClass(), "iDayOfWeek", null);
        setField(term330396, term330396.getClass(), "iDayOfMonth", null);
        setField(term330396, term330396.getClass(), "iDayOfYear", null);
        setField(term330396, term330396.getClass(), "iWeekOfWeekyear", null);
        setField(term330396, term330396.getClass(), "iWeekyear", null);
        setField(term330396, term330396.getClass(), "iWeekyearOfCentury", null);
        setField(term330396, term330396.getClass(), "iMonthOfYear", null);
        setField(term330396, term330396.getClass(), "iYear", null);
        setField(term330396, term330396.getClass(), "iYearOfEra", null);
        setField(term330396, term330396.getClass(), "iYearOfCentury", null);
        setField(term330396, term330396.getClass(), "iCenturyOfEra", null);
        setField(term330396, term330396.getClass(), "iEra", null);
        setIntField(term330396, term330396.getClass(), "iBaseFlags", 0);
        term330397 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term330398 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term330399 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term330400 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term330401 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setField(term330397, term330397.getClass(), "millis", null);
        setField(term330397, term330397.getClass(), "seconds", null);
        setField(term330397, term330397.getClass(), "minutes", null);
        setField(term330397, term330397.getClass(), "hours", null);
        setField(term330397, term330397.getClass(), "halfdays", null);
        setField(term330397, term330397.getClass(), "days", null);
        setField(term330397, term330397.getClass(), "weeks", null);
        setField(term330397, term330397.getClass(), "weekyears", null);
        setField(term330397, term330397.getClass(), "months", null);
        setField(term330397, term330397.getClass(), "years", null);
        setField(term330397, term330397.getClass(), "centuries", null);
        setField(term330397, term330397.getClass(), "eras", null);
        setField(term330400, term330400.getClass(), "iType", null);
        setField(term330399, term330399.getClass(), "iDurationField", term330400);
        setField(term330399, term330399.getClass(), "iRangeDurationField", null);
        setField(term330399, term330399.getClass(), "iLeapDurationField", null);
        setField(term330399, term330399.getClass(), "this$0", null);
        setField(term330399, term330399.getClass(), "iField", null);
        setByteField(term330401, term330401.getClass(), "iOrdinal", (byte) 0);
        setField(term330401, term330401.getClass(), "iUnitType", null);
        setField(term330401, term330401.getClass(), "iRangeType", null);
        setField(term330401, term330401.getClass(), "iName", null);
        setField(term330399, term330399.getClass(), "iType", term330401);
        setField(term330398, term330398.getClass(), "iField", term330399);
        setField(term330398, term330398.getClass(), "iZone", null);
        setField(term330398, term330398.getClass(), "iDurationField", term330400);
        setBooleanField(term330398, term330398.getClass(), "iTimeField", true);
        setField(term330398, term330398.getClass(), "iRangeDurationField", null);
        setField(term330398, term330398.getClass(), "iLeapDurationField", null);
        setField(term330398, term330398.getClass(), "iType", term330401);
        setField(term330397, term330397.getClass(), "millisOfSecond", term330398);
        setField(term330397, term330397.getClass(), "millisOfDay", null);
        setField(term330397, term330397.getClass(), "secondOfMinute", null);
        setField(term330397, term330397.getClass(), "secondOfDay", null);
        setField(term330397, term330397.getClass(), "minuteOfHour", null);
        setField(term330397, term330397.getClass(), "minuteOfDay", null);
        setField(term330397, term330397.getClass(), "hourOfDay", null);
        setField(term330397, term330397.getClass(), "clockhourOfDay", null);
        setField(term330397, term330397.getClass(), "hourOfHalfday", null);
        setField(term330397, term330397.getClass(), "clockhourOfHalfday", null);
        setField(term330397, term330397.getClass(), "halfdayOfDay", null);
        setField(term330397, term330397.getClass(), "dayOfWeek", null);
        setField(term330397, term330397.getClass(), "dayOfMonth", null);
        setField(term330397, term330397.getClass(), "dayOfYear", null);
        setField(term330397, term330397.getClass(), "weekOfWeekyear", null);
        setField(term330397, term330397.getClass(), "weekyear", null);
        setField(term330397, term330397.getClass(), "weekyearOfCentury", null);
        setField(term330397, term330397.getClass(), "monthOfYear", null);
        setField(term330397, term330397.getClass(), "year", null);
        setField(term330397, term330397.getClass(), "yearOfEra", null);
        setField(term330397, term330397.getClass(), "yearOfCentury", null);
        setField(term330397, term330397.getClass(), "centuryOfEra", null);
        setField(term330397, term330397.getClass(), "era", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term329975;
        callMethod(klass, "assemble", argTypes, term329875, args);
        assertTrue(recursiveEquals(term329875, term330396));
        assertTrue(recursiveEquals(term329975, term330397));
    }

};


