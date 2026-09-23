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

public class MultidimensionalCounter_init_113786181870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54332;
     Object term54598;
     Object term54601;

    public MultidimensionalCounter_init_113786181870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term54557 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term54345 = (int[]) newIntArray(0);
        setIntField(term54557, term54557.getClass(), "dimension", 0);
        setField(term54557, term54557.getClass(), "size", null);
        setField(term54557, term54557.getClass(), "uniCounterOffset", term54345);
        setIntField(term54557, term54557.getClass(), "last", 0);
        term54332 = (int[]) newIntArray(3);
        setIntElement(term54332, 0, -2113752018);
        setIntElement(term54332, 1, 1153191049);
        setIntElement(term54332, 2, 1297205999);
        term54598 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term54599 = (int[]) newIntArray(3);
        int[] term54600 = (int[]) newIntArray(3);
        setIntField(term54598, term54598.getClass(), "dimension", 3);
        setIntElement(term54599, 0, 747146727);
        setIntElement(term54599, 1, 1297205999);
        setField(term54598, term54598.getClass(), "uniCounterOffset", term54599);
        setIntElement(term54600, 0, -2113752018);
        setIntElement(term54600, 1, 1153191049);
        setIntElement(term54600, 2, 1297205999);
        setField(term54598, term54598.getClass(), "size", term54600);
        setIntField(term54598, term54598.getClass(), "totalSize", 1847454594);
        setIntField(term54598, term54598.getClass(), "last", 2);
        term54601 = (int[]) newIntArray(3);
        setIntElement(term54601, 0, -2113752018);
        setIntElement(term54601, 1, 1153191049);
        setIntElement(term54601, 2, 1297205999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term54332;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term54598));
        assertTrue(recursiveEquals(term54332, term54601));
    }

};


