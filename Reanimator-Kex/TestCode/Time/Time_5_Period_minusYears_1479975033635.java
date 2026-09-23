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

public class Period_minusYears_1479975033635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452790;

    public Period_minusYears_1479975033635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term452790 = newInstance(Class.forName("org.joda.time.Period"));
        Object term452844 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term452423 = (Object[]) newArray("org.joda.time.DurationFieldType", 10);
        int[] term452435 = (int[]) newIntArray(19);
        setField(term452844, term452844.getClass(), "iTypes", term452423);
        setField(term452790, term452790.getClass(), "iType", term452844);
        setField(term452790, term452790.getClass(), "iValues", term452435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusYears", argTypes, term452790, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


