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
import java.lang.reflect.InaccessibleObjectException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Period_init_319941564118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461;
     Object term462;

    public Period_init_319941564118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term461 = newInstance(Class.forName("java.lang.Object"));
        term462 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term475 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term476 = (int[]) newIntArray(5);
        setField(term462, term462.getClass(), "iName", "HyxfbSQYBe");
        setField(term462, term462.getClass(), "iTypes", term475);
        setIntElement(term476, 0, 1442160736);
        setIntElement(term476, 1, 1114000454);
        setIntElement(term476, 2, -556405712);
        setIntElement(term476, 3, -1772434990);
        setIntElement(term476, 4, -1845499264);
        setField(term462, term462.getClass(), "iIndices", term476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[2];
        args[0] = term461;
        args[1] = term462;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


