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

public class Period_withMinutes_1304361658293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141975;

    public Period_withMinutes_1304361658293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141975 = newInstance(Class.forName("org.joda.time.Period"));
        Object term142029 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term141893 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term141896 = (int[]) newIntArray(2);
        setField(term142029, term142029.getClass(), "iTypes", term141893);
        setField(term141975, term141975.getClass(), "iType", term142029);
        setField(term141975, term141975.getClass(), "iValues", term141896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMinutes", argTypes, term141975, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


