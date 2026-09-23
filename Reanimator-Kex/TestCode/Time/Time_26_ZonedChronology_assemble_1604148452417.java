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
import java.lang.NullPointerException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182243;
     Object term182343;

    public ZonedChronology_assemble_1604148452417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182243 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term182343 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term182437 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term182523 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        setField(term182343, term182343.getClass(), "eras", null);
        setField(term182343, term182343.getClass(), "centuries", null);
        setField(term182343, term182343.getClass(), "years", null);
        setField(term182343, term182343.getClass(), "months", null);
        setField(term182343, term182343.getClass(), "weekyears", null);
        setField(term182343, term182343.getClass(), "weeks", null);
        setField(term182343, term182343.getClass(), "days", null);
        setField(term182343, term182343.getClass(), "halfdays", null);
        setField(term182343, term182343.getClass(), "hours", null);
        setField(term182343, term182343.getClass(), "minutes", null);
        setField(term182343, term182343.getClass(), "seconds", null);
        setField(term182343, term182343.getClass(), "millis", null);
        setField(term182343, term182343.getClass(), "year", null);
        setField(term182343, term182343.getClass(), "yearOfEra", null);
        setField(term182343, term182343.getClass(), "yearOfCentury", null);
        setField(term182343, term182343.getClass(), "centuryOfEra", null);
        setField(term182343, term182343.getClass(), "era", null);
        setField(term182343, term182343.getClass(), "dayOfWeek", null);
        setField(term182343, term182343.getClass(), "dayOfMonth", null);
        setField(term182343, term182343.getClass(), "dayOfYear", null);
        setField(term182343, term182343.getClass(), "monthOfYear", null);
        setField(term182343, term182343.getClass(), "weekOfWeekyear", null);
        setField(term182343, term182343.getClass(), "weekyear", null);
        setField(term182343, term182343.getClass(), "weekyearOfCentury", null);
        setField(term182343, term182343.getClass(), "millisOfSecond", null);
        setField(term182343, term182343.getClass(), "millisOfDay", term182437);
        setField(term182343, term182343.getClass(), "secondOfMinute", null);
        setField(term182343, term182343.getClass(), "secondOfDay", null);
        setField(term182343, term182343.getClass(), "minuteOfHour", null);
        setField(term182343, term182343.getClass(), "minuteOfDay", null);
        setField(term182343, term182343.getClass(), "hourOfDay", null);
        setField(term182343, term182343.getClass(), "hourOfHalfday", null);
        setField(term182343, term182343.getClass(), "clockhourOfDay", term182523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term182343;
        try {
            callMethod(klass, "assemble", argTypes, term182243, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


