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

public class JsonWriter_open_1875381156352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205534;

    public JsonWriter_open_1875381156352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205534 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term205436 = (int[]) newIntArray(8);
        setIntField(term205534, term205534.getClass(), "stackSize", 8);
        setIntElement(term205436, 0, 5);
        setIntElement(term205436, 1, 5);
        setIntElement(term205436, 2, 5);
        setIntElement(term205436, 3, 5);
        setIntElement(term205436, 4, 5);
        setIntElement(term205436, 5, 5);
        setIntElement(term205436, 6, 5);
        setIntElement(term205436, 7, 5);
        setField(term205534, term205534.getClass(), "stack", term205436);
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
            callMethod(klass, "open", argTypes, term205534, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


