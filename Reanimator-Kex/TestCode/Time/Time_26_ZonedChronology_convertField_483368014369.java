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

public class ZonedChronology_convertField_483368014369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138599;
     Object term138689;

    public ZonedChronology_convertField_483368014369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138599 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term138689 = newInstance(Class.forName("org.joda.time.field.DelegatedDateTimeField"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = Class.forName("java.util.HashMap");
        Object[] args = new Object[2];
        args[0] = term138689;
        args[1] = null;
        try {
            callMethod(klass, "convertField", argTypes, term138599, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


