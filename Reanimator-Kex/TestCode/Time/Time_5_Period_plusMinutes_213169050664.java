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

public class Period_plusMinutes_213169050664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488979;

    public Period_plusMinutes_213169050664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488979 = newInstance(Class.forName("org.joda.time.Period"));
        Object term489033 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term488850 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term488855 = (int[]) newIntArray(9);
        setField(term489033, term489033.getClass(), "iTypes", term488850);
        setField(term488979, term488979.getClass(), "iType", term489033);
        setField(term488979, term488979.getClass(), "iValues", term488855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMinutes", argTypes, term488979, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


