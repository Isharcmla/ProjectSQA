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

public class JsonWriter_open_1875381156193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65458;

    public JsonWriter_open_1875381156193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65458 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term65361 = (int[]) newIntArray(8);
        setIntField(term65458, term65458.getClass(), "stackSize", 8);
        setIntElement(term65361, 0, 1);
        setIntElement(term65361, 1, 1);
        setIntElement(term65361, 2, 1);
        setIntElement(term65361, 3, 1);
        setIntElement(term65361, 4, 1);
        setIntElement(term65361, 5, 1);
        setIntElement(term65361, 6, 1);
        setIntElement(term65361, 7, 1);
        setField(term65458, term65458.getClass(), "stack", term65361);
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
            callMethod(klass, "open", argTypes, term65458, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


