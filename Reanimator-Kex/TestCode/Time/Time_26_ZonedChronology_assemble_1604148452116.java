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

public class ZonedChronology_assemble_1604148452116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40047;
     Object term40147;

    public ZonedChronology_assemble_1604148452116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40047 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term40147 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term40233 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        setField(term40147, term40147.getClass(), "eras", null);
        setField(term40147, term40147.getClass(), "centuries", null);
        setField(term40147, term40147.getClass(), "years", null);
        setField(term40147, term40147.getClass(), "months", null);
        setField(term40147, term40147.getClass(), "weekyears", null);
        setField(term40147, term40147.getClass(), "weeks", null);
        setField(term40147, term40147.getClass(), "days", null);
        setField(term40147, term40147.getClass(), "halfdays", null);
        setField(term40147, term40147.getClass(), "hours", null);
        setField(term40147, term40147.getClass(), "minutes", null);
        setField(term40147, term40147.getClass(), "seconds", null);
        setField(term40147, term40147.getClass(), "millis", null);
        setField(term40147, term40147.getClass(), "year", null);
        setField(term40147, term40147.getClass(), "yearOfEra", null);
        setField(term40147, term40147.getClass(), "yearOfCentury", null);
        setField(term40147, term40147.getClass(), "centuryOfEra", null);
        setField(term40147, term40147.getClass(), "era", null);
        setField(term40147, term40147.getClass(), "dayOfWeek", null);
        setField(term40147, term40147.getClass(), "dayOfMonth", null);
        setField(term40147, term40147.getClass(), "dayOfYear", null);
        setField(term40147, term40147.getClass(), "monthOfYear", term40233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term40147;
        try {
            callMethod(klass, "assemble", argTypes, term40047, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


