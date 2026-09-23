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

public class JsonWriter_open_1875381156327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170448;

    public JsonWriter_open_1875381156327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170448 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term170351 = (int[]) newIntArray(8);
        setIntField(term170448, term170448.getClass(), "stackSize", 8);
        setIntElement(term170351, 0, 3);
        setIntElement(term170351, 1, 3);
        setIntElement(term170351, 2, 3);
        setIntElement(term170351, 3, 3);
        setIntElement(term170351, 4, 3);
        setIntElement(term170351, 5, 3);
        setIntElement(term170351, 6, 3);
        setIntElement(term170351, 7, 3);
        setField(term170448, term170448.getClass(), "stack", term170351);
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
            callMethod(klass, "open", argTypes, term170448, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


