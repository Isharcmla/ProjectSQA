package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.util.EqualityUtils.*;
import java.lang.Object;

public class MultidimensionalCounter_init_113786181825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4138;
     Object term4821;
     Object term4824;

    public MultidimensionalCounter_init_113786181825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4471 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term4157 = (int[]) newIntArray(0);
        setIntField(term4471, term4471.getClass(), "dimension", 0);
        setField(term4471, term4471.getClass(), "size", null);
        setField(term4471, term4471.getClass(), "uniCounterOffset", term4157);
        setIntField(term4471, term4471.getClass(), "last", 0);
        term4138 = (int[]) newIntArray(5);
        setIntElement(term4138, 0, 2062694434);
        setIntElement(term4138, 1, -403690966);
        setIntElement(term4138, 2, 202953514);
        setIntElement(term4138, 3, -1878656307);
        setIntElement(term4138, 4, 289412635);
        term4821 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term4822 = (int[]) newIntArray(5);
        int[] term4823 = (int[]) newIntArray(5);
        setIntField(term4821, term4821.getClass(), "dimension", 5);
        setIntElement(term4822, 0, 496052636);
        setIntElement(term4822, 1, 1621553430);
        setIntElement(term4822, 2, 74387871);
        setIntElement(term4822, 3, 289412635);
        setField(term4821, term4821.getClass(), "uniCounterOffset", term4822);
        setIntElement(term4823, 0, 2062694434);
        setIntElement(term4823, 1, -403690966);
        setIntElement(term4823, 2, 202953514);
        setIntElement(term4823, 3, -1878656307);
        setIntElement(term4823, 4, 289412635);
        setField(term4821, term4821.getClass(), "size", term4823);
        setIntField(term4821, term4821.getClass(), "totalSize", 1540990648);
        setIntField(term4821, term4821.getClass(), "last", 4);
        term4824 = (int[]) newIntArray(5);
        setIntElement(term4824, 0, 2062694434);
        setIntElement(term4824, 1, -403690966);
        setIntElement(term4824, 2, 202953514);
        setIntElement(term4824, 3, -1878656307);
        setIntElement(term4824, 4, 289412635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4138;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4821));
        assertTrue(recursiveEquals(term4138, term4824));
    }

};


