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

public class Period_withWeeks_1269818202343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168944;

    public Period_withWeeks_1269818202343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168944 = newInstance(Class.forName("org.joda.time.Period"));
        Object term168998 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term167377 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term167382 = (int[]) newIntArray(489);
        setField(term168998, term168998.getClass(), "iTypes", term167377);
        setField(term168944, term168944.getClass(), "iType", term168998);
        setField(term168944, term168944.getClass(), "iValues", term167382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withWeeks", argTypes, term168944, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


