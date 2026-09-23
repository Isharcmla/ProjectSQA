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

public class Period_minusYears_1479975033532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303997;

    public Period_minusYears_1479975033532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303997 = newInstance(Class.forName("org.joda.time.Period"));
        Object term304051 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term302927 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term302931 = (int[]) newIntArray(489);
        setField(term304051, term304051.getClass(), "iTypes", term302927);
        setField(term303997, term303997.getClass(), "iType", term304051);
        setField(term303997, term303997.getClass(), "iValues", term302931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusYears", argTypes, term303997, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


