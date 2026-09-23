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

public class Period_plusSeconds_2095747590214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105897;

    public Period_plusSeconds_2095747590214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105897 = newInstance(Class.forName("org.joda.time.Period"));
        Object term105951 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term105742 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        int[] term105748 = (int[]) newIntArray(11);
        setField(term105951, term105951.getClass(), "iTypes", term105742);
        setField(term105897, term105897.getClass(), "iType", term105951);
        setField(term105897, term105897.getClass(), "iValues", term105748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusSeconds", argTypes, term105897, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


