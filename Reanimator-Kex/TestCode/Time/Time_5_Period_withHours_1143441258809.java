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

public class Period_withHours_1143441258809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3163483;

    public Period_withHours_1143441258809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3163483 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3163537 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3101921 = (Object[]) newArray("org.joda.time.DurationFieldType", 123);
        int[] term3102046 = (int[]) newIntArray(489);
        setField(term3163537, term3163537.getClass(), "iTypes", term3101921);
        setField(term3163483, term3163483.getClass(), "iType", term3163537);
        setField(term3163483, term3163483.getClass(), "iValues", term3102046);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term3163483, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


