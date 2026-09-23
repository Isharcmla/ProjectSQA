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

public class Period_plusYears_1965820131881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4052764;

    public Period_plusYears_1965820131881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4052764 = newInstance(Class.forName("org.joda.time.Period"));
        Object term4052818 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term4051949 = (Object[]) newArray("org.joda.time.DurationFieldType", 15);
        int[] term4051966 = (int[]) newIntArray(39);
        setField(term4052818, term4052818.getClass(), "iTypes", term4051949);
        setField(term4052764, term4052764.getClass(), "iType", term4052818);
        setField(term4052764, term4052764.getClass(), "iValues", term4051966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusYears", argTypes, term4052764, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


