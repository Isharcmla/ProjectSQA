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
import java.lang.ClassCastException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98239;
     Object term98339;

    public ZonedChronology_assemble_1604148452263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98239 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term98239, term98239.getClass(), "iParam", term98239);
        term98339 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term98437 = newInstance(Class.forName("org.joda.time.chrono.ISOYearOfEraDateTimeField"));
        setField(term98339, term98339.getClass(), "eras", null);
        setField(term98339, term98339.getClass(), "centuries", null);
        setField(term98339, term98339.getClass(), "years", null);
        setField(term98339, term98339.getClass(), "months", null);
        setField(term98339, term98339.getClass(), "weekyears", null);
        setField(term98339, term98339.getClass(), "weeks", null);
        setField(term98339, term98339.getClass(), "days", null);
        setField(term98339, term98339.getClass(), "halfdays", null);
        setField(term98339, term98339.getClass(), "hours", null);
        setField(term98339, term98339.getClass(), "minutes", null);
        setField(term98339, term98339.getClass(), "seconds", null);
        setField(term98339, term98339.getClass(), "millis", null);
        setField(term98339, term98339.getClass(), "year", null);
        setField(term98339, term98339.getClass(), "yearOfEra", term98437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term98339;
        try {
            callMethod(klass, "assemble", argTypes, term98239, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


