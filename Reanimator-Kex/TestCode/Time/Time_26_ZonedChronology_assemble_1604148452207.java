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

public class ZonedChronology_assemble_1604148452207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75546;
     Object term75646;

    public ZonedChronology_assemble_1604148452207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75546 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term75546, term75546.getClass(), "iParam", null);
        term75646 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term75762 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term75856 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term75646, term75646.getClass(), "eras", null);
        setField(term75646, term75646.getClass(), "centuries", null);
        setField(term75646, term75646.getClass(), "years", null);
        setField(term75646, term75646.getClass(), "months", null);
        setField(term75646, term75646.getClass(), "weekyears", null);
        setField(term75646, term75646.getClass(), "weeks", null);
        setField(term75646, term75646.getClass(), "days", null);
        setField(term75646, term75646.getClass(), "halfdays", null);
        setField(term75646, term75646.getClass(), "hours", null);
        setField(term75646, term75646.getClass(), "minutes", null);
        setField(term75646, term75646.getClass(), "seconds", null);
        setField(term75646, term75646.getClass(), "millis", null);
        setField(term75646, term75646.getClass(), "year", null);
        setField(term75646, term75646.getClass(), "yearOfEra", null);
        setField(term75646, term75646.getClass(), "yearOfCentury", null);
        setField(term75646, term75646.getClass(), "centuryOfEra", null);
        setField(term75646, term75646.getClass(), "era", null);
        setField(term75646, term75646.getClass(), "dayOfWeek", null);
        setField(term75646, term75646.getClass(), "dayOfMonth", null);
        setField(term75646, term75646.getClass(), "dayOfYear", null);
        setField(term75646, term75646.getClass(), "monthOfYear", null);
        setField(term75646, term75646.getClass(), "weekOfWeekyear", null);
        setField(term75646, term75646.getClass(), "weekyear", null);
        setField(term75646, term75646.getClass(), "weekyearOfCentury", null);
        setField(term75762, term75762.getClass(), "iDurationField", null);
        setField(term75762, term75762.getClass(), "iRangeDurationField", term75856);
        setField(term75646, term75646.getClass(), "millisOfSecond", term75762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term75646;
        try {
            callMethod(klass, "assemble", argTypes, term75546, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


