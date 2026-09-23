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
import java.lang.reflect.InaccessibleObjectException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Period_init_1793738998120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term498;
     Object term499;

    public Period_init_1793738998120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term498 = newInstance(Class.forName("java.lang.Object"));
        term499 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term512 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term513 = (int[]) newIntArray(5);
        setField(term499, term499.getClass(), "iName", "pCTimMblYc");
        setField(term499, term499.getClass(), "iTypes", term512);
        setIntElement(term513, 0, -505439934);
        setIntElement(term513, 1, -344842608);
        setIntElement(term513, 2, 941650513);
        setIntElement(term513, 3, 444029505);
        setIntElement(term513, 4, -1034506028);
        setField(term499, term499.getClass(), "iIndices", term513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.joda.time.PeriodType");
        argTypes[2] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[3];
        args[0] = term498;
        args[1] = term499;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


