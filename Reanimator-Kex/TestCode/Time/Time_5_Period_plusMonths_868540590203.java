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

public class Period_plusMonths_868540590203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97927;

    public Period_plusMonths_868540590203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97927 = newInstance(Class.forName("org.joda.time.Period"));
        Object term97981 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term97772 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        int[] term97778 = (int[]) newIntArray(11);
        setField(term97981, term97981.getClass(), "iTypes", term97772);
        setField(term97927, term97927.getClass(), "iType", term97981);
        setField(term97927, term97927.getClass(), "iValues", term97778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMonths", argTypes, term97927, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


