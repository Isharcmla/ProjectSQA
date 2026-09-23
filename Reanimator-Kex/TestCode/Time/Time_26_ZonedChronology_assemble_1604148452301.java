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

public class ZonedChronology_assemble_1604148452301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111050;
     Object term111150;

    public ZonedChronology_assemble_1604148452301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111050 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term111150 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term111230 = newInstance(Class.forName("org.joda.time.field.SkipDateTimeField"));
        setField(term111150, term111150.getClass(), "eras", null);
        setField(term111150, term111150.getClass(), "centuries", null);
        setField(term111150, term111150.getClass(), "years", null);
        setField(term111150, term111150.getClass(), "months", null);
        setField(term111150, term111150.getClass(), "weekyears", null);
        setField(term111150, term111150.getClass(), "weeks", null);
        setField(term111150, term111150.getClass(), "days", null);
        setField(term111150, term111150.getClass(), "halfdays", null);
        setField(term111150, term111150.getClass(), "hours", null);
        setField(term111150, term111150.getClass(), "minutes", null);
        setField(term111150, term111150.getClass(), "seconds", null);
        setField(term111150, term111150.getClass(), "millis", null);
        setField(term111150, term111150.getClass(), "year", null);
        setField(term111150, term111150.getClass(), "yearOfEra", null);
        setField(term111150, term111150.getClass(), "yearOfCentury", null);
        setField(term111150, term111150.getClass(), "centuryOfEra", null);
        setField(term111150, term111150.getClass(), "era", null);
        setField(term111150, term111150.getClass(), "dayOfWeek", null);
        setField(term111150, term111150.getClass(), "dayOfMonth", null);
        setField(term111150, term111150.getClass(), "dayOfYear", term111230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term111150;
        try {
            callMethod(klass, "assemble", argTypes, term111050, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


