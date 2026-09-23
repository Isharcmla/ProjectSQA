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

public class Period_minusMinutes_1467465136208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100809;

    public Period_minusMinutes_1467465136208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100809 = newInstance(Class.forName("org.joda.time.Period"));
        Object term100863 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term99739 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term99743 = (int[]) newIntArray(489);
        setField(term100863, term100863.getClass(), "iTypes", term99739);
        setField(term100809, term100809.getClass(), "iType", term100863);
        setField(term100809, term100809.getClass(), "iValues", term99743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMinutes", argTypes, term100809, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


