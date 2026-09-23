package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatterBuilder_appendMinuteOfDay_1272625016111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304;
     Object term310;

    public DateTimeFormatterBuilder_appendMinuteOfDay_1272625016111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term305 = new ArrayList();
        term304 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term309 = newInstance(Class.forName("java.lang.Object"));
        setField(term304, term304.getClass(), "iElementPairs", term305);
        setField(term304, term304.getClass(), "iFormatter", term309);
        term310 = new Integer(-2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term310;
        try {
            callMethod(klass, "appendMinuteOfDay", argTypes, term304, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


