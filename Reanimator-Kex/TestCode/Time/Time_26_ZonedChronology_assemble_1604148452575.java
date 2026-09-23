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

public class ZonedChronology_assemble_1604148452575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261068;
     Object term261168;

    public ZonedChronology_assemble_1604148452575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261068 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term261068, term261068.getClass(), "iParam", null);
        term261168 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term261262 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term261378 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term261472 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term261556 = newInstance(Class.forName("org.joda.time.field.MillisDurationField"));
        setField(term261168, term261168.getClass(), "eras", null);
        setField(term261168, term261168.getClass(), "centuries", null);
        setField(term261168, term261168.getClass(), "years", null);
        setField(term261168, term261168.getClass(), "months", null);
        setField(term261168, term261168.getClass(), "weekyears", null);
        setField(term261168, term261168.getClass(), "weeks", null);
        setField(term261168, term261168.getClass(), "days", null);
        setField(term261168, term261168.getClass(), "halfdays", null);
        setField(term261168, term261168.getClass(), "hours", null);
        setField(term261168, term261168.getClass(), "minutes", null);
        setField(term261168, term261168.getClass(), "seconds", null);
        setField(term261168, term261168.getClass(), "millis", null);
        setField(term261168, term261168.getClass(), "year", null);
        setField(term261168, term261168.getClass(), "yearOfEra", null);
        setField(term261168, term261168.getClass(), "yearOfCentury", null);
        setField(term261168, term261168.getClass(), "centuryOfEra", null);
        setField(term261168, term261168.getClass(), "era", null);
        setField(term261168, term261168.getClass(), "dayOfWeek", null);
        setField(term261168, term261168.getClass(), "dayOfMonth", null);
        setField(term261168, term261168.getClass(), "dayOfYear", null);
        setField(term261168, term261168.getClass(), "monthOfYear", null);
        setField(term261168, term261168.getClass(), "weekOfWeekyear", null);
        setField(term261168, term261168.getClass(), "weekyear", null);
        setField(term261168, term261168.getClass(), "weekyearOfCentury", null);
        setField(term261168, term261168.getClass(), "millisOfSecond", null);
        setField(term261168, term261168.getClass(), "millisOfDay", term261262);
        setField(term261168, term261168.getClass(), "secondOfMinute", null);
        setField(term261168, term261168.getClass(), "secondOfDay", null);
        setField(term261168, term261168.getClass(), "minuteOfHour", null);
        setField(term261168, term261168.getClass(), "minuteOfDay", null);
        setField(term261168, term261168.getClass(), "hourOfDay", null);
        setField(term261168, term261168.getClass(), "hourOfHalfday", null);
        setField(term261168, term261168.getClass(), "clockhourOfDay", null);
        setField(term261378, term261378.getClass(), "iDurationField", term261472);
        setField(term261378, term261378.getClass(), "iRangeDurationField", null);
        setField(term261378, term261378.getClass(), "iLeapDurationField", term261556);
        setField(term261168, term261168.getClass(), "clockhourOfHalfday", term261378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term261168;
        try {
            callMethod(klass, "assemble", argTypes, term261068, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


