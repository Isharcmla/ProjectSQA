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

public class Period_plusSeconds_2095747590540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308316;

    public Period_plusSeconds_2095747590540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308316 = newInstance(Class.forName("org.joda.time.Period"));
        Object term308370 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term307939 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term307946 = (int[]) newIntArray(51);
        setField(term308370, term308370.getClass(), "iTypes", term307939);
        setField(term308316, term308316.getClass(), "iType", term308370);
        setField(term308316, term308316.getClass(), "iValues", term307946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusSeconds", argTypes, term308316, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


