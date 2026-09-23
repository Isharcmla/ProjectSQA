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

public class Period_withMonths_1471682522652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479096;

    public Period_withMonths_1471682522652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term479096 = newInstance(Class.forName("org.joda.time.Period"));
        Object term479150 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term478918 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        int[] term478924 = (int[]) newIntArray(17);
        setField(term479150, term479150.getClass(), "iTypes", term478918);
        setField(term479096, term479096.getClass(), "iType", term479150);
        setField(term479096, term479096.getClass(), "iValues", term478924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMonths", argTypes, term479096, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


