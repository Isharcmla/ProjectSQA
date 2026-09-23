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

public class ZonedChronology_convertField_1721171648429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187416;
     Object term187506;

    public ZonedChronology_convertField_1721171648429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187416 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term187506 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DurationField");
        argTypes[1] = Class.forName("java.util.HashMap");
        Object[] args = new Object[2];
        args[0] = term187506;
        args[1] = null;
        try {
            callMethod(klass, "convertField", argTypes, term187416, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


