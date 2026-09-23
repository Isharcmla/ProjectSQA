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

public class Period_withMonths_1471682522255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122088;

    public Period_withMonths_1471682522255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122088 = newInstance(Class.forName("org.joda.time.Period"));
        Object term122142 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term121804 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term121811 = (int[]) newIntArray(33);
        setField(term122142, term122142.getClass(), "iTypes", term121804);
        setField(term122088, term122088.getClass(), "iType", term122142);
        setField(term122088, term122088.getClass(), "iValues", term121811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMonths", argTypes, term122088, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


