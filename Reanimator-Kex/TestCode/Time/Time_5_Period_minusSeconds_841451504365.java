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

public class Period_minusSeconds_841451504365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180449;

    public Period_minusSeconds_841451504365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180449 = newInstance(Class.forName("org.joda.time.Period"));
        Object term180503 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term180071 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term180078 = (int[]) newIntArray(51);
        setField(term180503, term180503.getClass(), "iTypes", term180071);
        setField(term180449, term180449.getClass(), "iType", term180503);
        setField(term180449, term180449.getClass(), "iValues", term180078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusSeconds", argTypes, term180449, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


