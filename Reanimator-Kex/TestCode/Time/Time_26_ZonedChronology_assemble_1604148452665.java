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
import java.lang.IllegalArgumentException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346510;
     Object term346610;

    public ZonedChronology_assemble_1604148452665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term346510 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term346510, term346510.getClass(), "iParam", null);
        term346610 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term346704 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term346820 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term346940 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term347034 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term347136 = newInstance(Class.forName("org.joda.time.chrono.BasicSingleEraDateTimeField"));
        setField(term346610, term346610.getClass(), "eras", null);
        setField(term346610, term346610.getClass(), "centuries", null);
        setField(term346610, term346610.getClass(), "years", null);
        setField(term346610, term346610.getClass(), "months", null);
        setField(term346610, term346610.getClass(), "weekyears", null);
        setField(term346610, term346610.getClass(), "weeks", null);
        setField(term346610, term346610.getClass(), "days", null);
        setField(term346610, term346610.getClass(), "halfdays", null);
        setField(term346610, term346610.getClass(), "hours", null);
        setField(term346610, term346610.getClass(), "minutes", null);
        setField(term346610, term346610.getClass(), "seconds", null);
        setField(term346610, term346610.getClass(), "millis", null);
        setField(term346610, term346610.getClass(), "year", null);
        setField(term346610, term346610.getClass(), "yearOfEra", null);
        setField(term346610, term346610.getClass(), "yearOfCentury", null);
        setField(term346610, term346610.getClass(), "centuryOfEra", null);
        setField(term346610, term346610.getClass(), "era", null);
        setField(term346610, term346610.getClass(), "dayOfWeek", null);
        setField(term346610, term346610.getClass(), "dayOfMonth", null);
        setField(term346610, term346610.getClass(), "dayOfYear", null);
        setField(term346610, term346610.getClass(), "monthOfYear", null);
        setField(term346610, term346610.getClass(), "weekOfWeekyear", null);
        setField(term346610, term346610.getClass(), "weekyear", null);
        setField(term346610, term346610.getClass(), "weekyearOfCentury", null);
        setField(term346610, term346610.getClass(), "millisOfSecond", null);
        setField(term346610, term346610.getClass(), "millisOfDay", term346704);
        setField(term346610, term346610.getClass(), "secondOfMinute", null);
        setField(term346610, term346610.getClass(), "secondOfDay", null);
        setField(term346610, term346610.getClass(), "minuteOfHour", null);
        setField(term346820, term346820.getClass(), "iDurationField", null);
        setField(term346820, term346820.getClass(), "iRangeDurationField", null);
        setField(term346820, term346820.getClass(), "iLeapDurationField", null);
        setField(term346820, term346820.getClass(), "iType", term346940);
        setField(term346610, term346610.getClass(), "minuteOfDay", term346820);
        setField(term346610, term346610.getClass(), "hourOfDay", null);
        setField(term346610, term346610.getClass(), "hourOfHalfday", term347034);
        setField(term346610, term346610.getClass(), "clockhourOfDay", term347136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term346610;
        try {
            callMethod(klass, "assemble", argTypes, term346510, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


