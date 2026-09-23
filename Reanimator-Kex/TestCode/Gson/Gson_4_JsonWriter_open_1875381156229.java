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
     Object term93560;

    public JsonWriter_open_1875381156229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93560 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term93459 = (int[]) newIntArray(8);
        setIntField(term93560, term93560.getClass(), "stackSize", 8);
        setIntElement(term93459, 0, 6);
        setIntElement(term93459, 1, 6);
        setIntElement(term93459, 2, 6);
        setIntElement(term93459, 3, 6);
        setIntElement(term93459, 4, 6);
        setIntElement(term93459, 5, 6);
        setIntElement(term93459, 6, 6);
        setIntElement(term93459, 7, 6);
        setField(term93560, term93560.getClass(), "stack", term93459);
        setBooleanField(term93560, term93560.getClass(), "lenient", true);
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
            callMethod(klass, "open", argTypes, term93560, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


