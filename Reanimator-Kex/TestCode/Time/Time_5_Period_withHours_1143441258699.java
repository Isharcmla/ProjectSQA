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

public class Period_withHours_1143441258699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1092170;

    public Period_withHours_1143441258699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1092170 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1092224 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1038806 = (Object[]) newArray("org.joda.time.DurationFieldType", 205);
        int[] term1039013 = (int[]) newIntArray(249);
        setField(term1092224, term1092224.getClass(), "iTypes", term1038806);
        setField(term1092170, term1092170.getClass(), "iType", term1092224);
        setField(term1092170, term1092170.getClass(), "iValues", term1039013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term1092170, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


