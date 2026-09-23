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

public class ZonedChronology_assemble_1604148452593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269567;
     Object term269741;
     Object term270072;
     Object term270074;

    public ZonedChronology_assemble_1604148452593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269567 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term269641 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term269567, term269567.getClass(), "iParam", term269641);
        term269741 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term269845 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term269965 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setField(term269741, term269741.getClass(), "eras", null);
        setField(term269741, term269741.getClass(), "centuries", null);
        setField(term269741, term269741.getClass(), "years", null);
        setField(term269741, term269741.getClass(), "months", null);
        setField(term269741, term269741.getClass(), "weekyears", null);
        setField(term269741, term269741.getClass(), "weeks", null);
        setField(term269741, term269741.getClass(), "days", null);
        setField(term269741, term269741.getClass(), "halfdays", null);
        setField(term269741, term269741.getClass(), "hours", null);
        setField(term269741, term269741.getClass(), "minutes", null);
        setField(term269741, term269741.getClass(), "seconds", null);
        setField(term269741, term269741.getClass(), "millis", null);
        setField(term269741, term269741.getClass(), "year", null);
        setField(term269741, term269741.getClass(), "yearOfEra", null);
        setField(term269845, term269845.getClass(), "iUnitField", null);
        setField(term269845, term269845.getClass(), "iRangeField", null);
        setField(term269845, term269845.getClass(), "iType", term269965);
        setField(term269741, term269741.getClass(), "yearOfCentury", term269845);
        term270072 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term270073 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term270072, term270072.getClass(), "iBase", null);
        setField(term270073, term270073.getClass(), "iNameKey", null);
        setIntField(term270073, term270073.getClass(), "iWallOffset", 0);
        setIntField(term270073, term270073.getClass(), "iStandardOffset", 0);
        setField(term270073, term270073.getClass(), "iID", null);
        setField(term270072, term270072.getClass(), "iParam", term270073);
        setField(term270072, term270072.getClass(), "iMillis", null);
        setField(term270072, term270072.getClass(), "iSeconds", null);
        setField(term270072, term270072.getClass(), "iMinutes", null);
        setField(term270072, term270072.getClass(), "iHours", null);
        setField(term270072, term270072.getClass(), "iHalfdays", null);
        setField(term270072, term270072.getClass(), "iDays", null);
        setField(term270072, term270072.getClass(), "iWeeks", null);
        setField(term270072, term270072.getClass(), "iWeekyears", null);
        setField(term270072, term270072.getClass(), "iMonths", null);
        setField(term270072, term270072.getClass(), "iYears", null);
        setField(term270072, term270072.getClass(), "iCenturies", null);
        setField(term270072, term270072.getClass(), "iEras", null);
        setField(term270072, term270072.getClass(), "iMillisOfSecond", null);
        setField(term270072, term270072.getClass(), "iMillisOfDay", null);
        setField(term270072, term270072.getClass(), "iSecondOfMinute", null);
        setField(term270072, term270072.getClass(), "iSecondOfDay", null);
        setField(term270072, term270072.getClass(), "iMinuteOfHour", null);
        setField(term270072, term270072.getClass(), "iMinuteOfDay", null);
        setField(term270072, term270072.getClass(), "iHourOfDay", null);
        setField(term270072, term270072.getClass(), "iClockhourOfDay", null);
        setField(term270072, term270072.getClass(), "iHourOfHalfday", null);
        setField(term270072, term270072.getClass(), "iClockhourOfHalfday", null);
        setField(term270072, term270072.getClass(), "iHalfdayOfDay", null);
        setField(term270072, term270072.getClass(), "iDayOfWeek", null);
        setField(term270072, term270072.getClass(), "iDayOfMonth", null);
        setField(term270072, term270072.getClass(), "iDayOfYear", null);
        setField(term270072, term270072.getClass(), "iWeekOfWeekyear", null);
        setField(term270072, term270072.getClass(), "iWeekyear", null);
        setField(term270072, term270072.getClass(), "iWeekyearOfCentury", null);
        setField(term270072, term270072.getClass(), "iMonthOfYear", null);
        setField(term270072, term270072.getClass(), "iYear", null);
        setField(term270072, term270072.getClass(), "iYearOfEra", null);
        setField(term270072, term270072.getClass(), "iYearOfCentury", null);
        setField(term270072, term270072.getClass(), "iCenturyOfEra", null);
        setField(term270072, term270072.getClass(), "iEra", null);
        setIntField(term270072, term270072.getClass(), "iBaseFlags", 0);
        term270074 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term270075 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term270076 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term270077 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term270078 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term270074, term270074.getClass(), "millis", null);
        setField(term270074, term270074.getClass(), "seconds", null);
        setField(term270074, term270074.getClass(), "minutes", null);
        setField(term270074, term270074.getClass(), "hours", null);
        setField(term270074, term270074.getClass(), "halfdays", null);
        setField(term270074, term270074.getClass(), "days", null);
        setField(term270074, term270074.getClass(), "weeks", null);
        setField(term270074, term270074.getClass(), "weekyears", null);
        setField(term270074, term270074.getClass(), "months", null);
        setField(term270074, term270074.getClass(), "years", null);
        setField(term270074, term270074.getClass(), "centuries", null);
        setField(term270074, term270074.getClass(), "eras", null);
        setField(term270074, term270074.getClass(), "millisOfSecond", null);
        setField(term270074, term270074.getClass(), "millisOfDay", null);
        setField(term270074, term270074.getClass(), "secondOfMinute", null);
        setField(term270074, term270074.getClass(), "secondOfDay", null);
        setField(term270074, term270074.getClass(), "minuteOfHour", null);
        setField(term270074, term270074.getClass(), "minuteOfDay", null);
        setField(term270074, term270074.getClass(), "hourOfDay", null);
        setField(term270074, term270074.getClass(), "clockhourOfDay", null);
        setField(term270074, term270074.getClass(), "hourOfHalfday", null);
        setField(term270074, term270074.getClass(), "clockhourOfHalfday", null);
        setField(term270074, term270074.getClass(), "halfdayOfDay", null);
        setField(term270074, term270074.getClass(), "dayOfWeek", null);
        setField(term270074, term270074.getClass(), "dayOfMonth", null);
        setField(term270074, term270074.getClass(), "dayOfYear", null);
        setField(term270074, term270074.getClass(), "weekOfWeekyear", null);
        setField(term270074, term270074.getClass(), "weekyear", null);
        setField(term270074, term270074.getClass(), "weekyearOfCentury", null);
        setField(term270074, term270074.getClass(), "monthOfYear", null);
        setField(term270074, term270074.getClass(), "year", null);
        setField(term270074, term270074.getClass(), "yearOfEra", null);
        setIntField(term270076, term270076.getClass(), "iRange", 0);
        setField(term270076, term270076.getClass(), "iRangeField", null);
        setLongField(term270076, term270076.getClass(), "iUnitMillis", 0L);
        setField(term270076, term270076.getClass(), "iUnitField", null);
        setByteField(term270077, term270077.getClass(), "iOrdinal", (byte) 0);
        setField(term270077, term270077.getClass(), "iUnitType", null);
        setField(term270077, term270077.getClass(), "iRangeType", null);
        setField(term270077, term270077.getClass(), "iName", null);
        setField(term270076, term270076.getClass(), "iType", term270077);
        setField(term270075, term270075.getClass(), "iField", term270076);
        setField(term270078, term270078.getClass(), "iNameKey", null);
        setIntField(term270078, term270078.getClass(), "iWallOffset", 0);
        setIntField(term270078, term270078.getClass(), "iStandardOffset", 0);
        setField(term270078, term270078.getClass(), "iID", null);
        setField(term270075, term270075.getClass(), "iZone", term270078);
        setField(term270075, term270075.getClass(), "iDurationField", null);
        setBooleanField(term270075, term270075.getClass(), "iTimeField", false);
        setField(term270075, term270075.getClass(), "iRangeDurationField", null);
        setField(term270075, term270075.getClass(), "iLeapDurationField", null);
        setField(term270075, term270075.getClass(), "iType", term270077);
        setField(term270074, term270074.getClass(), "yearOfCentury", term270075);
        setField(term270074, term270074.getClass(), "centuryOfEra", null);
        setField(term270074, term270074.getClass(), "era", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term269741;
        callMethod(klass, "assemble", argTypes, term269567, args);
        assertTrue(recursiveEquals(term269567, term270072));
        assertTrue(recursiveEquals(term269741, term270074));
    }

};


