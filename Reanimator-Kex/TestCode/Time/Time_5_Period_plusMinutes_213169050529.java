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

public class Period_plusMinutes_213169050529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300151;

    public Period_plusMinutes_213169050529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300151 = newInstance(Class.forName("org.joda.time.Period"));
        Object term300205 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term299962 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term299965 = (int[]) newIntArray(108);
        setField(term300205, term300205.getClass(), "iTypes", term299962);
        setField(term300151, term300151.getClass(), "iType", term300205);
        setField(term300151, term300151.getClass(), "iValues", term299965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMinutes", argTypes, term300151, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


