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
import java.lang.NullPointerException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonWriter_open_1875381156225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83290;

    public JsonWriter_open_1875381156225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83290 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term83192 = (int[]) newIntArray(8);
        setIntField(term83290, term83290.getClass(), "stackSize", 8);
        setIntElement(term83192, 0, 6);
        setIntElement(term83192, 1, 6);
        setIntElement(term83192, 2, 6);
        setIntElement(term83192, 3, 6);
        setIntElement(term83192, 4, 6);
        setIntElement(term83192, 5, 6);
        setIntElement(term83192, 6, 6);
        setIntElement(term83192, 7, 6);
        setField(term83290, term83290.getClass(), "stack", term83192);
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
            callMethod(klass, "open", argTypes, term83290, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


