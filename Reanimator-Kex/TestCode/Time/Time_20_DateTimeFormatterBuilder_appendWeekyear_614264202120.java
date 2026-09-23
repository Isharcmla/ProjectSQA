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

public class DateTimeFormatterBuilder_appendWeekyear_614264202120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376;
     Object term382;
     Object term384;

    public DateTimeFormatterBuilder_appendWeekyear_614264202120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term377 = new ArrayList();
        term376 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term381 = newInstance(Class.forName("java.lang.Object"));
        setField(term376, term376.getClass(), "iElementPairs", term377);
        setField(term376, term376.getClass(), "iFormatter", term381);
        term382 = new Integer(-1179120542);
        term384 = new Integer(-73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term382;
        args[1] = term384;
        try {
            callMethod(klass, "appendWeekyear", argTypes, term376, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


