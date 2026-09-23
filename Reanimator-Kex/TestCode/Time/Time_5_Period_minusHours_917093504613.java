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

public class Period_minusHours_917093504613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410241;

    public Period_minusHours_917093504613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410241 = newInstance(Class.forName("org.joda.time.Period"));
        Object term410295 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term406025 = (Object[]) newArray("org.joda.time.DurationFieldType", 45);
        int[] term406072 = (int[]) newIntArray(247);
        setField(term410295, term410295.getClass(), "iTypes", term406025);
        setField(term410241, term410241.getClass(), "iType", term410295);
        setField(term410241, term410241.getClass(), "iValues", term406072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusHours", argTypes, term410241, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


