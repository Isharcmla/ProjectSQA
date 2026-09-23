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
import java.lang.Long;
import java.lang.Object;

public class Period_init_184554226316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180;
     Object term182;

    public Period_init_184554226316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180 = new Long(6375119433582206027L);
        term182 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term195 = (Object[]) newArray("org.joda.time.DurationFieldType", 0);
        int[] term196 = (int[]) newIntArray(2);
        setField(term182, term182.getClass(), "iName", "NRdvgJlhkX");
        setField(term182, term182.getClass(), "iTypes", term195);
        setIntElement(term196, 0, 493620644);
        setIntElement(term196, 1, 1328271830);
        setField(term182, term182.getClass(), "iIndices", term196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[2];
        args[0] = term180;
        args[1] = term182;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


