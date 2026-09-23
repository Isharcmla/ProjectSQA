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

public class JsonWriter_open_1875381156359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186883;

    public JsonWriter_open_1875381156359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186883 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term186786 = (int[]) newIntArray(8);
        setIntField(term186883, term186883.getClass(), "stackSize", 8);
        setIntElement(term186786, 0, 3);
        setIntElement(term186786, 1, 3);
        setIntElement(term186786, 2, 3);
        setIntElement(term186786, 3, 3);
        setIntElement(term186786, 4, 3);
        setIntElement(term186786, 5, 3);
        setIntElement(term186786, 6, 3);
        setIntElement(term186786, 7, 3);
        setField(term186883, term186883.getClass(), "stack", term186786);
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
            callMethod(klass, "open", argTypes, term186883, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


