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

public class ZonedChronology_equals_141452681435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189554;
     Object term189944;

    public ZonedChronology_equals_141452681435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189554 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term189632 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term189710 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term189788 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term189866 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term189788, term189788.getClass(), "iBase", term189866);
        setField(term189710, term189710.getClass(), "iBase", term189788);
        setField(term189632, term189632.getClass(), "iBase", term189710);
        setField(term189554, term189554.getClass(), "iBase", term189632);
        term189944 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term190022 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term190022, term190022.getClass(), "iBase", term190022);
        setField(term189944, term189944.getClass(), "iBase", term190022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term189944;
        try {
            callMethod(klass, "equals", argTypes, term189554, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


