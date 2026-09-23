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

public class ZonedChronology_assemble_1604148452595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270327;
     Object term270427;
     Object term270848;
     Object term270849;

    public ZonedChronology_assemble_1604148452595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270327 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term270327, term270327.getClass(), "iParam", null);
        term270427 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term270521 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term270637 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term270757 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setField(term270427, term270427.getClass(), "eras", null);
        setField(term270427, term270427.getClass(), "centuries", null);
        setField(term270427, term270427.getClass(), "years", null);
        setField(term270427, term270427.getClass(), "months", null);
        setField(term270427, term270427.getClass(), "weekyears", null);
        setField(term270427, term270427.getClass(), "weeks", null);
        setField(term270427, term270427.getClass(), "days", null);
        setField(term270427, term270427.getClass(), "halfdays", null);
        setField(term270427, term270427.getClass(), "hours", null);
        setField(term270427, term270427.getClass(), "minutes", null);
        setField(term270427, term270427.getClass(), "seconds", null);
        setField(term270427, term270427.getClass(), "millis", null);
        setField(term270427, term270427.getClass(), "year", null);
        setField(term270427, term270427.getClass(), "yearOfEra", null);
        setField(term270427, term270427.getClass(), "yearOfCentury", null);
        setField(term270427, term270427.getClass(), "centuryOfEra", null);
        setField(term270427, term270427.getClass(), "era", null);
        setField(term270427, term270427.getClass(), "dayOfWeek", null);
        setField(term270427, term270427.getClass(), "dayOfMonth", null);
        setField(term270427, term270427.getClass(), "dayOfYear", null);
        setField(term270427, term270427.getClass(), "monthOfYear", null);
        setField(term270427, term270427.getClass(), "weekOfWeekyear", null);
        setField(term270427, term270427.getClass(), "weekyear", null);
        setField(term270427, term270427.getClass(), "weekyearOfCentury", null);
        setField(term270427, term270427.getClass(), "millisOfSecond", null);
        setField(term270427, term270427.getClass(), "millisOfDay", term270521);
        setField(term270427, term270427.getClass(), "secondOfMinute", null);
        setField(term270427, term270427.getClass(), "secondOfDay", null);
        setField(term270427, term270427.getClass(), "minuteOfHour", null);
        setField(term270637, term270637.getClass(), "iDurationField", null);
        setField(term270637, term270637.getClass(), "iRangeDurationField", null);
        setField(term270637, term270637.getClass(), "iLeapDurationField", null);
        setField(term270637, term270637.getClass(), "iType", term270757);
        setField(term270427, term270427.getClass(), "minuteOfDay", term270637);
        setField(term270427, term270427.getClass(), "hourOfDay", null);
        setField(term270427, term270427.getClass(), "hourOfHalfday", null);
        setField(term270427, term270427.getClass(), "clockhourOfDay", null);
        setField(term270427, term270427.getClass(), "clockhourOfHalfday", null);
        setField(term270427, term270427.getClass(), "halfdayOfDay", term270521);
        term270848 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term270848, term270848.getClass(), "iBase", null);
        setField(term270848, term270848.getClass(), "iParam", null);
        setField(term270848, term270848.getClass(), "iMillis", null);
        setField(term270848, term270848.getClass(), "iSeconds", null);
        setField(term270848, term270848.getClass(), "iMinutes", null);
        setField(term270848, term270848.getClass(), "iHours", null);
        setField(term270848, term270848.getClass(), "iHalfdays", null);
        setField(term270848, term270848.getClass(), "iDays", null);
        setField(term270848, term270848.getClass(), "iWeeks", null);
        setField(term270848, term270848.getClass(), "iWeekyears", null);
        setField(term270848, term270848.getClass(), "iMonths", null);
        setField(term270848, term270848.getClass(), "iYears", null);
        setField(term270848, term270848.getClass(), "iCenturies", null);
        setField(term270848, term270848.getClass(), "iEras", null);
        setField(term270848, term270848.getClass(), "iMillisOfSecond", null);
        setField(term270848, term270848.getClass(), "iMillisOfDay", null);
        setField(term270848, term270848.getClass(), "iSecondOfMinute", null);
        setField(term270848, term270848.getClass(), "iSecondOfDay", null);
        setField(term270848, term270848.getClass(), "iMinuteOfHour", null);
        setField(term270848, term270848.getClass(), "iMinuteOfDay", null);
        setField(term270848, term270848.getClass(), "iHourOfDay", null);
        setField(term270848, term270848.getClass(), "iClockhourOfDay", null);
        setField(term270848, term270848.getClass(), "iHourOfHalfday", null);
        setField(term270848, term270848.getClass(), "iClockhourOfHalfday", null);
        setField(term270848, term270848.getClass(), "iHalfdayOfDay", null);
        setField(term270848, term270848.getClass(), "iDayOfWeek", null);
        setField(term270848, term270848.getClass(), "iDayOfMonth", null);
        setField(term270848, term270848.getClass(), "iDayOfYear", null);
        setField(term270848, term270848.getClass(), "iWeekOfWeekyear", null);
        setField(term270848, term270848.getClass(), "iWeekyear", null);
        setField(term270848, term270848.getClass(), "iWeekyearOfCentury", null);
        setField(term270848, term270848.getClass(), "iMonthOfYear", null);
        setField(term270848, term270848.getClass(), "iYear", null);
        setField(term270848, term270848.getClass(), "iYearOfEra", null);
        setField(term270848, term270848.getClass(), "iYearOfCentury", null);
        setField(term270848, term270848.getClass(), "iCenturyOfEra", null);
        setField(term270848, term270848.getClass(), "iEra", null);
        setIntField(term270848, term270848.getClass(), "iBaseFlags", 0);
        term270849 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term270850 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term270851 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term270852 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term270853 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setField(term270849, term270849.getClass(), "millis", null);
        setField(term270849, term270849.getClass(), "seconds", null);
        setField(term270849, term270849.getClass(), "minutes", null);
        setField(term270849, term270849.getClass(), "hours", null);
        setField(term270849, term270849.getClass(), "halfdays", null);
        setField(term270849, term270849.getClass(), "days", null);
        setField(term270849, term270849.getClass(), "weeks", null);
        setField(term270849, term270849.getClass(), "weekyears", null);
        setField(term270849, term270849.getClass(), "months", null);
        setField(term270849, term270849.getClass(), "years", null);
        setField(term270849, term270849.getClass(), "centuries", null);
        setField(term270849, term270849.getClass(), "eras", null);
        setField(term270849, term270849.getClass(), "millisOfSecond", null);
        setField(term270850, term270850.getClass(), "iType", null);
        setField(term270850, term270850.getClass(), "iDurationField", null);
        setField(term270849, term270849.getClass(), "millisOfDay", term270850);
        setField(term270849, term270849.getClass(), "secondOfMinute", null);
        setField(term270849, term270849.getClass(), "secondOfDay", null);
        setField(term270849, term270849.getClass(), "minuteOfHour", null);
        setField(term270852, term270852.getClass(), "iField", null);
        setField(term270852, term270852.getClass(), "iZone", null);
        setField(term270852, term270852.getClass(), "iDurationField", null);
        setBooleanField(term270852, term270852.getClass(), "iTimeField", false);
        setField(term270852, term270852.getClass(), "iRangeDurationField", null);
        setField(term270852, term270852.getClass(), "iLeapDurationField", null);
        setByteField(term270853, term270853.getClass(), "iOrdinal", (byte) 0);
        setField(term270853, term270853.getClass(), "iUnitType", null);
        setField(term270853, term270853.getClass(), "iRangeType", null);
        setField(term270853, term270853.getClass(), "iName", null);
        setField(term270852, term270852.getClass(), "iType", term270853);
        setField(term270851, term270851.getClass(), "iField", term270852);
        setField(term270851, term270851.getClass(), "iZone", null);
        setField(term270851, term270851.getClass(), "iDurationField", null);
        setBooleanField(term270851, term270851.getClass(), "iTimeField", false);
        setField(term270851, term270851.getClass(), "iRangeDurationField", null);
        setField(term270851, term270851.getClass(), "iLeapDurationField", null);
        setField(term270851, term270851.getClass(), "iType", term270853);
        setField(term270849, term270849.getClass(), "minuteOfDay", term270851);
        setField(term270849, term270849.getClass(), "hourOfDay", null);
        setField(term270849, term270849.getClass(), "clockhourOfDay", null);
        setField(term270849, term270849.getClass(), "hourOfHalfday", null);
        setField(term270849, term270849.getClass(), "clockhourOfHalfday", null);
        setField(term270849, term270849.getClass(), "halfdayOfDay", term270850);
        setField(term270849, term270849.getClass(), "dayOfWeek", null);
        setField(term270849, term270849.getClass(), "dayOfMonth", null);
        setField(term270849, term270849.getClass(), "dayOfYear", null);
        setField(term270849, term270849.getClass(), "weekOfWeekyear", null);
        setField(term270849, term270849.getClass(), "weekyear", null);
        setField(term270849, term270849.getClass(), "weekyearOfCentury", null);
        setField(term270849, term270849.getClass(), "monthOfYear", null);
        setField(term270849, term270849.getClass(), "year", null);
        setField(term270849, term270849.getClass(), "yearOfEra", null);
        setField(term270849, term270849.getClass(), "yearOfCentury", null);
        setField(term270849, term270849.getClass(), "centuryOfEra", null);
        setField(term270849, term270849.getClass(), "era", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term270427;
        callMethod(klass, "assemble", argTypes, term270327, args);
        assertTrue(recursiveEquals(term270327, term270848));
        assertTrue(recursiveEquals(term270427, term270849));
    }

};


