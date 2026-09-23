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

public class JsonWriter_open_1875381156307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134322;

    public JsonWriter_open_1875381156307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134322 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term134222 = (int[]) newIntArray(8);
        setIntField(term134322, term134322.getClass(), "stackSize", 8);
        setIntElement(term134222, 0, 7);
        setIntElement(term134222, 1, 7);
        setIntElement(term134222, 2, 7);
        setIntElement(term134222, 3, 7);
        setIntElement(term134222, 4, 7);
        setIntElement(term134222, 5, 7);
        setIntElement(term134222, 6, 7);
        setIntElement(term134222, 7, 7);
        setField(term134322, term134322.getClass(), "stack", term134222);
        setBooleanField(term134322, term134322.getClass(), "lenient", true);
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
            callMethod(klass, "open", argTypes, term134322, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


