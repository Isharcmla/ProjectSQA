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

public class JsonWriter_open_1875381156215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78052;

    public JsonWriter_open_1875381156215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78052 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term77955 = (int[]) newIntArray(8);
        setIntField(term78052, term78052.getClass(), "stackSize", 8);
        setIntElement(term77955, 0, 2);
        setIntElement(term77955, 1, 2);
        setIntElement(term77955, 2, 2);
        setIntElement(term77955, 3, 2);
        setIntElement(term77955, 4, 2);
        setIntElement(term77955, 5, 2);
        setIntElement(term77955, 6, 2);
        setIntElement(term77955, 7, 2);
        setField(term78052, term78052.getClass(), "stack", term77955);
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
            callMethod(klass, "open", argTypes, term78052, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


