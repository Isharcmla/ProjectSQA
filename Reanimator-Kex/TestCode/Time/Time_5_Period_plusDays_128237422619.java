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

public class Period_plusDays_128237422619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418709;

    public Period_plusDays_128237422619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term418709 = newInstance(Class.forName("org.joda.time.Period"));
        Object term418763 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term418343 = (Object[]) newArray("org.joda.time.DurationFieldType", 10);
        int[] term418355 = (int[]) newIntArray(19);
        setField(term418763, term418763.getClass(), "iTypes", term418343);
        setField(term418709, term418709.getClass(), "iType", term418763);
        setField(term418709, term418709.getClass(), "iValues", term418355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusDays", argTypes, term418709, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


