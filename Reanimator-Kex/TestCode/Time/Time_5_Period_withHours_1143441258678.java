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

public class Period_withHours_1143441258678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613383;

    public Period_withHours_1143441258678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term613383 = newInstance(Class.forName("org.joda.time.Period"));
        Object term613437 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term553781 = (Object[]) newArray("org.joda.time.DurationFieldType", 229);
        int[] term554012 = (int[]) newIntArray(249);
        setField(term613437, term613437.getClass(), "iTypes", term553781);
        setField(term613383, term613383.getClass(), "iType", term613437);
        setField(term613383, term613383.getClass(), "iValues", term554012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term613383, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


