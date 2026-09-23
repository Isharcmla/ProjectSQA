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

public class Period_minusMinutes_1467465136312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153397;

    public Period_minusMinutes_1467465136312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153397 = newInstance(Class.forName("org.joda.time.Period"));
        Object term153451 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term153207 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term153210 = (int[]) newIntArray(108);
        setField(term153451, term153451.getClass(), "iTypes", term153207);
        setField(term153397, term153397.getClass(), "iType", term153451);
        setField(term153397, term153397.getClass(), "iValues", term153210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMinutes", argTypes, term153397, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


