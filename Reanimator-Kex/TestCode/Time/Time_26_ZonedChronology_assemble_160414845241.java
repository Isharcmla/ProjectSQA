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

public class ZonedChronology_assemble_160414845241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10481;
     Object term10581;

    public ZonedChronology_assemble_160414845241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10481 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term10581 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term10679 = newInstance(Class.forName("org.joda.time.chrono.ISOYearOfEraDateTimeField"));
        setField(term10581, term10581.getClass(), "eras", null);
        setField(term10581, term10581.getClass(), "centuries", null);
        setField(term10581, term10581.getClass(), "years", null);
        setField(term10581, term10581.getClass(), "months", null);
        setField(term10581, term10581.getClass(), "weekyears", null);
        setField(term10581, term10581.getClass(), "weeks", null);
        setField(term10581, term10581.getClass(), "days", null);
        setField(term10581, term10581.getClass(), "halfdays", null);
        setField(term10581, term10581.getClass(), "hours", null);
        setField(term10581, term10581.getClass(), "minutes", null);
        setField(term10581, term10581.getClass(), "seconds", null);
        setField(term10581, term10581.getClass(), "millis", null);
        setField(term10581, term10581.getClass(), "year", null);
        setField(term10581, term10581.getClass(), "yearOfEra", term10679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term10581;
        try {
            callMethod(klass, "assemble", argTypes, term10481, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


