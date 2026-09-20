package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Partial_init_2135378091201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89215;

    public Partial_init_2135378091201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term89087 = newInstance(Class.forName("org.joda.time.Partial"));
        Object term89167 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        setField(term89087, term89087.getClass(), "iChronology", term89167);
        term89215 = newInstance(Class.forName("org.joda.time.Partial"));
        Object term89295 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object[] term89019 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object term89415 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setField(term89215, term89215.getClass(), "iChronology", term89295);
        setElement(term89019, 0, term89415);
        setField(term89215, term89215.getClass(), "iTypes", term89019);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[1];
        args[0] = term89215;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
