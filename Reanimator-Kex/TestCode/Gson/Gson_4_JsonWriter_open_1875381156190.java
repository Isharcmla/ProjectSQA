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

public class JsonWriter_open_1875381156190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67336;

    public JsonWriter_open_1875381156190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67336 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term67239 = (int[]) newIntArray(8);
        setIntField(term67336, term67336.getClass(), "stackSize", 8);
        setIntElement(term67239, 0, 7);
        setIntElement(term67239, 1, 7);
        setIntElement(term67239, 2, 7);
        setIntElement(term67239, 3, 7);
        setIntElement(term67239, 4, 7);
        setIntElement(term67239, 5, 7);
        setIntElement(term67239, 6, 7);
        setIntElement(term67239, 7, 7);
        setField(term67336, term67336.getClass(), "stack", term67239);
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
            callMethod(klass, "open", argTypes, term67336, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


