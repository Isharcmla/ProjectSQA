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

public class Period_plusHours_431248406334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163108;

    public Period_plusHours_431248406334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163108 = newInstance(Class.forName("org.joda.time.Period"));
        Object term163162 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term162979 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term162984 = (int[]) newIntArray(9);
        setField(term163162, term163162.getClass(), "iTypes", term162979);
        setField(term163108, term163108.getClass(), "iType", term163162);
        setField(term163108, term163108.getClass(), "iValues", term162984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusHours", argTypes, term163108, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


