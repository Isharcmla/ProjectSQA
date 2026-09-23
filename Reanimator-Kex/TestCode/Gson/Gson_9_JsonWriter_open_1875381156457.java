package com.google.gson.stream;

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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonWriter_open_1875381156457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273832;

    public JsonWriter_open_1875381156457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273832 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term273734 = (int[]) newIntArray(8);
        setIntField(term273832, term273832.getClass(), "stackSize", 8);
        setIntElement(term273734, 0, 5);
        setIntElement(term273734, 1, 5);
        setIntElement(term273734, 2, 5);
        setIntElement(term273734, 3, 5);
        setIntElement(term273734, 4, 5);
        setIntElement(term273734, 5, 5);
        setIntElement(term273734, 6, 5);
        setIntElement(term273734, 7, 5);
        setField(term273832, term273832.getClass(), "stack", term273734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        try {
            callMethod(klass, "open", argTypes, term273832, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


