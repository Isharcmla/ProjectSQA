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

public class JsonWriter_open_1875381156294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144874;

    public JsonWriter_open_1875381156294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144874 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term144774 = (int[]) newIntArray(8);
        setIntField(term144874, term144874.getClass(), "stackSize", 8);
        setIntElement(term144774, 0, 7);
        setIntElement(term144774, 1, 7);
        setIntElement(term144774, 2, 7);
        setIntElement(term144774, 3, 7);
        setIntElement(term144774, 4, 7);
        setIntElement(term144774, 5, 7);
        setIntElement(term144774, 6, 7);
        setIntElement(term144774, 7, 7);
        setField(term144874, term144874.getClass(), "stack", term144774);
        setBooleanField(term144874, term144874.getClass(), "lenient", true);
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
            callMethod(klass, "open", argTypes, term144874, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


