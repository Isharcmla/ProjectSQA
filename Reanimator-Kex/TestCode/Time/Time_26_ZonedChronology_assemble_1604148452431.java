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

public class ZonedChronology_assemble_1604148452431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187934;
     Object term188034;

    public ZonedChronology_assemble_1604148452431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187934 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term188034 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term188128 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term188244 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        setField(term188034, term188034.getClass(), "eras", null);
        setField(term188034, term188034.getClass(), "centuries", null);
        setField(term188034, term188034.getClass(), "years", null);
        setField(term188034, term188034.getClass(), "months", null);
        setField(term188034, term188034.getClass(), "weekyears", null);
        setField(term188034, term188034.getClass(), "weeks", null);
        setField(term188034, term188034.getClass(), "days", null);
        setField(term188034, term188034.getClass(), "halfdays", null);
        setField(term188034, term188034.getClass(), "hours", null);
        setField(term188034, term188034.getClass(), "minutes", null);
        setField(term188034, term188034.getClass(), "seconds", null);
        setField(term188034, term188034.getClass(), "millis", null);
        setField(term188034, term188034.getClass(), "year", null);
        setField(term188034, term188034.getClass(), "yearOfEra", null);
        setField(term188034, term188034.getClass(), "yearOfCentury", null);
        setField(term188034, term188034.getClass(), "centuryOfEra", null);
        setField(term188034, term188034.getClass(), "era", null);
        setField(term188034, term188034.getClass(), "dayOfWeek", null);
        setField(term188034, term188034.getClass(), "dayOfMonth", null);
        setField(term188034, term188034.getClass(), "dayOfYear", null);
        setField(term188034, term188034.getClass(), "monthOfYear", null);
        setField(term188034, term188034.getClass(), "weekOfWeekyear", null);
        setField(term188034, term188034.getClass(), "weekyear", null);
        setField(term188034, term188034.getClass(), "weekyearOfCentury", null);
        setField(term188034, term188034.getClass(), "millisOfSecond", null);
        setField(term188034, term188034.getClass(), "millisOfDay", term188128);
        setField(term188034, term188034.getClass(), "secondOfMinute", null);
        setField(term188034, term188034.getClass(), "secondOfDay", null);
        setField(term188034, term188034.getClass(), "minuteOfHour", null);
        setField(term188034, term188034.getClass(), "minuteOfDay", term188244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term188034;
        try {
            callMethod(klass, "assemble", argTypes, term187934, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


