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

public class ZonedChronology_assemble_1604148452194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70943;
     Object term71043;

    public ZonedChronology_assemble_1604148452194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70943 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term71043 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term71127 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term71043, term71043.getClass(), "eras", null);
        setField(term71043, term71043.getClass(), "centuries", null);
        setField(term71043, term71043.getClass(), "years", null);
        setField(term71043, term71043.getClass(), "months", null);
        setField(term71043, term71043.getClass(), "weekyears", null);
        setField(term71043, term71043.getClass(), "weeks", null);
        setField(term71043, term71043.getClass(), "days", null);
        setField(term71043, term71043.getClass(), "halfdays", null);
        setField(term71043, term71043.getClass(), "hours", null);
        setField(term71043, term71043.getClass(), "minutes", null);
        setField(term71043, term71043.getClass(), "seconds", null);
        setField(term71043, term71043.getClass(), "millis", null);
        setField(term71043, term71043.getClass(), "year", null);
        setField(term71043, term71043.getClass(), "yearOfEra", null);
        setField(term71043, term71043.getClass(), "yearOfCentury", term71127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term71043;
        try {
            callMethod(klass, "assemble", argTypes, term70943, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


