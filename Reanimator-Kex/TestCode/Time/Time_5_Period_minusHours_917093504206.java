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

public class Period_minusHours_917093504206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99630;

    public Period_minusHours_917093504206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99630 = newInstance(Class.forName("org.joda.time.Period"));
        Object term99684 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term99252 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term99259 = (int[]) newIntArray(51);
        setField(term99684, term99684.getClass(), "iTypes", term99252);
        setField(term99630, term99630.getClass(), "iType", term99684);
        setField(term99630, term99630.getClass(), "iValues", term99259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusHours", argTypes, term99630, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


