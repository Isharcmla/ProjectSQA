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

public class Period_withHours_1143441258899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4412302;

    public Period_withHours_1143441258899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4412302 = newInstance(Class.forName("org.joda.time.Period"));
        Object term4412356 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term4384680 = (Object[]) newArray("org.joda.time.DurationFieldType", 130);
        int[] term4384812 = (int[]) newIntArray(201);
        setField(term4412356, term4412356.getClass(), "iTypes", term4384680);
        setField(term4412302, term4412302.getClass(), "iType", term4412356);
        setField(term4412302, term4412302.getClass(), "iValues", term4384812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term4412302, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


