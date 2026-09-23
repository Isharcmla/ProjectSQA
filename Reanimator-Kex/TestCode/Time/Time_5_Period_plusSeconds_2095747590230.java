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

public class Period_plusSeconds_2095747590230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114580;

    public Period_plusSeconds_2095747590230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114580 = newInstance(Class.forName("org.joda.time.Period"));
        Object term114634 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term114451 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term114456 = (int[]) newIntArray(9);
        setField(term114634, term114634.getClass(), "iTypes", term114451);
        setField(term114580, term114580.getClass(), "iType", term114634);
        setField(term114580, term114580.getClass(), "iValues", term114456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusSeconds", argTypes, term114580, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


