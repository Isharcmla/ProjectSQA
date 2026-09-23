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

public class Period_withHours_1143441258758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2249901;

    public Period_withHours_1143441258758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2249901 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2249955 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2239422 = (Object[]) newArray("org.joda.time.DurationFieldType", 93);
        int[] term2239517 = (int[]) newIntArray(101);
        setField(term2249955, term2249955.getClass(), "iTypes", term2239422);
        setField(term2249901, term2249901.getClass(), "iType", term2249955);
        setField(term2249901, term2249901.getClass(), "iValues", term2239517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term2249901, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


