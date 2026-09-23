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
import java.lang.IllegalArgumentException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Period_init_167289003100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;
     Object term137;
     Object term139;
     Object term141;
     Object term143;
     Object term145;
     Object term147;
     Object term149;
     Object term151;

    public Period_init_167289003100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = new Integer(-14890619);
        term137 = new Integer(1632125673);
        term139 = new Integer(454281060);
        term141 = new Integer(-1786399638);
        term143 = new Integer(2055867847);
        term145 = new Integer(-1048298087);
        term147 = new Integer(292681826);
        term149 = new Integer(458147407);
        term151 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term164 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term165 = (int[]) newIntArray(1);
        setField(term151, term151.getClass(), "iName", "RMFIsYGgne");
        setField(term151, term151.getClass(), "iTypes", term164);
        setIntElement(term165, 0, -184153539);
        setField(term151, term151.getClass(), "iIndices", term165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[9];
        args[0] = term135;
        args[1] = term137;
        args[2] = term139;
        args[3] = term141;
        args[4] = term143;
        args[5] = term145;
        args[6] = term147;
        args[7] = term149;
        args[8] = term151;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


