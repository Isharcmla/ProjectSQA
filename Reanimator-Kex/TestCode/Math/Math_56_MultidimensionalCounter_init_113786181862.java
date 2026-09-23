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

public class MultidimensionalCounter_init_113786181862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31847;
     Object term32063;
     Object term32066;

    public MultidimensionalCounter_init_113786181862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32032 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        setIntField(term32032, term32032.getClass(), "dimension", 0);
        setField(term32032, term32032.getClass(), "size", null);
        setField(term32032, term32032.getClass(), "uniCounterOffset", null);
        setIntField(term32032, term32032.getClass(), "last", 0);
        term31847 = (int[]) newIntArray(2);
        setIntElement(term31847, 0, 788529153);
        setIntElement(term31847, 1, -1879181473);
        term32063 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term32064 = (int[]) newIntArray(2);
        int[] term32065 = (int[]) newIntArray(2);
        setIntField(term32063, term32063.getClass(), "dimension", 2);
        setIntElement(term32064, 0, -1879181473);
        setField(term32063, term32063.getClass(), "uniCounterOffset", term32064);
        setIntElement(term32065, 0, 788529153);
        setIntElement(term32065, 1, -1879181473);
        setField(term32063, term32063.getClass(), "size", term32065);
        setIntField(term32063, term32063.getClass(), "totalSize", 16643935);
        setIntField(term32063, term32063.getClass(), "last", 1);
        term32066 = (int[]) newIntArray(2);
        setIntElement(term32066, 0, 788529153);
        setIntElement(term32066, 1, -1879181473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term31847;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32063));
        assertTrue(recursiveEquals(term31847, term32066));
    }

};


