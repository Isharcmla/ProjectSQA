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

public class Period_withHours_1143441258760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2318234;

    public Period_withHours_1143441258760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2318234 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2318288 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2250060 = (Object[]) newArray("org.joda.time.DurationFieldType", 132);
        int[] term2250194 = (int[]) newIntArray(505);
        setField(term2318288, term2318288.getClass(), "iTypes", term2250060);
        setField(term2318234, term2318234.getClass(), "iType", term2318288);
        setField(term2318234, term2318234.getClass(), "iValues", term2250194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term2318234, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


