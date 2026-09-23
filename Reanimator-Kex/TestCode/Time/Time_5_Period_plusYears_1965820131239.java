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

public class Period_plusYears_1965820131239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117260;

    public Period_plusYears_1965820131239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117260 = newInstance(Class.forName("org.joda.time.Period"));
        Object term117314 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term117131 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term117136 = (int[]) newIntArray(9);
        setField(term117314, term117314.getClass(), "iTypes", term117131);
        setField(term117260, term117260.getClass(), "iType", term117314);
        setField(term117260, term117260.getClass(), "iValues", term117136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusYears", argTypes, term117260, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


