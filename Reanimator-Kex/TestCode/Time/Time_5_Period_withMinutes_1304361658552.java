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

public class Period_withMinutes_1304361658552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316908;

    public Period_withMinutes_1304361658552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316908 = newInstance(Class.forName("org.joda.time.Period"));
        Object term316962 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term316842 = (Object[]) newArray("org.joda.time.DurationFieldType", 0);
        setField(term316962, term316962.getClass(), "iTypes", term316842);
        setField(term316908, term316908.getClass(), "iType", term316962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMinutes", argTypes, term316908, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


