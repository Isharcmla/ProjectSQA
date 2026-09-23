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

public class Period_plusSeconds_2095747590645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475023;

    public Period_plusSeconds_2095747590645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term475023 = newInstance(Class.forName("org.joda.time.Period"));
        Object term475077 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term474834 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term474837 = (int[]) newIntArray(108);
        setField(term475077, term475077.getClass(), "iTypes", term474834);
        setField(term475023, term475023.getClass(), "iType", term475077);
        setField(term475023, term475023.getClass(), "iValues", term474837);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusSeconds", argTypes, term475023, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


