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

public class ZonedChronology_assemble_160414845261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17105;
     Object term17205;

    public ZonedChronology_assemble_160414845261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17105 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term17205 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term17309 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        setField(term17205, term17205.getClass(), "eras", null);
        setField(term17205, term17205.getClass(), "centuries", null);
        setField(term17205, term17205.getClass(), "years", null);
        setField(term17205, term17205.getClass(), "months", null);
        setField(term17205, term17205.getClass(), "weekyears", null);
        setField(term17205, term17205.getClass(), "weeks", null);
        setField(term17205, term17205.getClass(), "days", null);
        setField(term17205, term17205.getClass(), "halfdays", null);
        setField(term17205, term17205.getClass(), "hours", null);
        setField(term17205, term17205.getClass(), "minutes", null);
        setField(term17205, term17205.getClass(), "seconds", null);
        setField(term17205, term17205.getClass(), "millis", null);
        setField(term17205, term17205.getClass(), "year", null);
        setField(term17205, term17205.getClass(), "yearOfEra", null);
        setField(term17205, term17205.getClass(), "yearOfCentury", term17309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term17205;
        try {
            callMethod(klass, "assemble", argTypes, term17105, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


