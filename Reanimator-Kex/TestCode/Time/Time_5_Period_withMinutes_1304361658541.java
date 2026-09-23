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

public class Period_withMinutes_1304361658541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309992;

    public Period_withMinutes_1304361658541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309992 = newInstance(Class.forName("org.joda.time.Period"));
        Object term310046 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term308425 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term308430 = (int[]) newIntArray(489);
        setField(term310046, term310046.getClass(), "iTypes", term308425);
        setField(term309992, term309992.getClass(), "iType", term310046);
        setField(term309992, term309992.getClass(), "iValues", term308430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMinutes", argTypes, term309992, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


