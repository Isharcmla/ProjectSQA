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

public class JsonWriter_open_1875381156229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84135;

    public JsonWriter_open_1875381156229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84135 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term84037 = (int[]) newIntArray(8);
        setIntField(term84135, term84135.getClass(), "stackSize", 8);
        setIntElement(term84037, 0, 4);
        setIntElement(term84037, 1, 4);
        setIntElement(term84037, 2, 4);
        setIntElement(term84037, 3, 4);
        setIntElement(term84037, 4, 4);
        setIntElement(term84037, 5, 4);
        setIntElement(term84037, 6, 4);
        setIntElement(term84037, 7, 4);
        setField(term84135, term84135.getClass(), "stack", term84037);
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
            callMethod(klass, "open", argTypes, term84135, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


