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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Period_init_90540253028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394;

    public Period_init_90540253028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term394 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term407 = (Object[]) newArray("org.joda.time.DurationFieldType", 7);
        int[] term408 = (int[]) newIntArray(2);
        setField(term394, term394.getClass(), "iName", "ZiaGIbnzTs");
        setField(term394, term394.getClass(), "iTypes", term407);
        setIntElement(term408, 0, -478195677);
        setIntElement(term408, 1, 972867650);
        setField(term394, term394.getClass(), "iIndices", term408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.ReadableInstant");
        argTypes[1] = Class.forName("org.joda.time.ReadableDuration");
        argTypes[2] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term394;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


