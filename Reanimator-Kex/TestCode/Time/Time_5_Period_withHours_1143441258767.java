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

public class Period_withHours_1143441258767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2495460;

    public Period_withHours_1143441258767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2495460 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2495514 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2492498 = (Object[]) newArray("org.joda.time.DurationFieldType", 46);
        int[] term2492546 = (int[]) newIntArray(52);
        setField(term2495514, term2495514.getClass(), "iTypes", term2492498);
        setField(term2495460, term2495460.getClass(), "iType", term2495514);
        setField(term2495460, term2495460.getClass(), "iValues", term2492546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term2495460, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


