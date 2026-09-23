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

public class MultidimensionalCounter_init_113786181868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53897;
     Object term54222;
     Object term54225;

    public MultidimensionalCounter_init_113786181868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term54170 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        setIntField(term54170, term54170.getClass(), "dimension", 0);
        setField(term54170, term54170.getClass(), "size", null);
        setField(term54170, term54170.getClass(), "uniCounterOffset", null);
        setIntField(term54170, term54170.getClass(), "last", 0);
        term53897 = (int[]) newIntArray(4);
        setIntElement(term53897, 0, -1827937378);
        setIntElement(term53897, 1, 575000641);
        setIntElement(term53897, 2, 289448868);
        setIntElement(term53897, 3, 552217102);
        term54222 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term54223 = (int[]) newIntArray(4);
        int[] term54224 = (int[]) newIntArray(4);
        setIntField(term54222, term54222.getClass(), "dimension", 4);
        setIntElement(term54223, 0, -1451091720);
        setIntElement(term54223, 1, -1605772552);
        setIntElement(term54223, 2, 552217102);
        setField(term54222, term54222.getClass(), "uniCounterOffset", term54223);
        setIntElement(term54224, 0, -1827937378);
        setIntElement(term54224, 1, 575000641);
        setIntElement(term54224, 2, 289448868);
        setIntElement(term54224, 3, 552217102);
        setField(term54222, term54222.getClass(), "size", term54224);
        setIntField(term54222, term54222.getClass(), "totalSize", 1964462352);
        setIntField(term54222, term54222.getClass(), "last", 3);
        term54225 = (int[]) newIntArray(4);
        setIntElement(term54225, 0, -1827937378);
        setIntElement(term54225, 1, 575000641);
        setIntElement(term54225, 2, 289448868);
        setIntElement(term54225, 3, 552217102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term53897;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term54222));
        assertTrue(recursiveEquals(term53897, term54225));
    }

};


