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

public class Period_minusDays_666754328411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205204;

    public Period_minusDays_666754328411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205204 = newInstance(Class.forName("org.joda.time.Period"));
        Object term205258 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term205074 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term205079 = (int[]) newIntArray(9);
        setField(term205258, term205258.getClass(), "iTypes", term205074);
        setField(term205204, term205204.getClass(), "iType", term205258);
        setField(term205204, term205204.getClass(), "iValues", term205079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusDays", argTypes, term205204, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


