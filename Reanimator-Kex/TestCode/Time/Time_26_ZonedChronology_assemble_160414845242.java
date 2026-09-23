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

public class ZonedChronology_assemble_160414845242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10813;
     Object term10913;

    public ZonedChronology_assemble_160414845242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10813 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term10913 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term11003 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term10913, term10913.getClass(), "eras", null);
        setField(term10913, term10913.getClass(), "centuries", null);
        setField(term10913, term10913.getClass(), "years", null);
        setField(term10913, term10913.getClass(), "months", null);
        setField(term10913, term10913.getClass(), "weekyears", null);
        setField(term10913, term10913.getClass(), "weeks", null);
        setField(term10913, term10913.getClass(), "days", null);
        setField(term10913, term10913.getClass(), "halfdays", null);
        setField(term10913, term10913.getClass(), "hours", null);
        setField(term10913, term10913.getClass(), "minutes", null);
        setField(term10913, term10913.getClass(), "seconds", null);
        setField(term10913, term10913.getClass(), "millis", term11003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term10913;
        try {
            callMethod(klass, "assemble", argTypes, term10813, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


