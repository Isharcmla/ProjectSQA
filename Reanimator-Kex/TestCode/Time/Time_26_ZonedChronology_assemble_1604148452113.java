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

public class ZonedChronology_assemble_1604148452113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39391;
     Object term39491;

    public ZonedChronology_assemble_1604148452113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39391 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term39491 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term39595 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        setField(term39491, term39491.getClass(), "eras", null);
        setField(term39491, term39491.getClass(), "centuries", null);
        setField(term39491, term39491.getClass(), "years", null);
        setField(term39491, term39491.getClass(), "months", null);
        setField(term39491, term39491.getClass(), "weekyears", null);
        setField(term39491, term39491.getClass(), "weeks", null);
        setField(term39491, term39491.getClass(), "days", null);
        setField(term39491, term39491.getClass(), "halfdays", null);
        setField(term39491, term39491.getClass(), "hours", null);
        setField(term39491, term39491.getClass(), "minutes", null);
        setField(term39491, term39491.getClass(), "seconds", null);
        setField(term39491, term39491.getClass(), "millis", null);
        setField(term39491, term39491.getClass(), "year", null);
        setField(term39491, term39491.getClass(), "yearOfEra", null);
        setField(term39491, term39491.getClass(), "yearOfCentury", null);
        setField(term39491, term39491.getClass(), "centuryOfEra", null);
        setField(term39491, term39491.getClass(), "era", null);
        setField(term39491, term39491.getClass(), "dayOfWeek", null);
        setField(term39491, term39491.getClass(), "dayOfMonth", null);
        setField(term39491, term39491.getClass(), "dayOfYear", null);
        setField(term39491, term39491.getClass(), "monthOfYear", null);
        setField(term39491, term39491.getClass(), "weekOfWeekyear", null);
        setField(term39491, term39491.getClass(), "weekyear", null);
        setField(term39491, term39491.getClass(), "weekyearOfCentury", null);
        setField(term39491, term39491.getClass(), "millisOfSecond", null);
        setField(term39491, term39491.getClass(), "millisOfDay", null);
        setField(term39491, term39491.getClass(), "secondOfMinute", null);
        setField(term39491, term39491.getClass(), "secondOfDay", term39595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term39491;
        try {
            callMethod(klass, "assemble", argTypes, term39391, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


