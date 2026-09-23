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

public class DateTimeFormatterBuilder_appendFractionOfHour_811646506104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244;
     Object term250;
     Object term252;

    public DateTimeFormatterBuilder_appendFractionOfHour_811646506104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term245 = new ArrayList();
        term244 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term249 = newInstance(Class.forName("java.lang.Object"));
        setField(term244, term244.getClass(), "iElementPairs", term245);
        setField(term244, term244.getClass(), "iFormatter", term249);
        term250 = new Integer(-883034806);
        term252 = new Integer(1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term250;
        args[1] = term252;
        try {
            callMethod(klass, "appendFractionOfHour", argTypes, term244, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


