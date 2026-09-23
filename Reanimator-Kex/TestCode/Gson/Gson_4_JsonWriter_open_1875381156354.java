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
import java.lang.Object;

public class JsonWriter_open_1875381156354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206809;

    public JsonWriter_open_1875381156354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206809 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term206705 = (int[]) newIntArray(8);
        Object term206851 = newInstance(Class.forName("java.io.FileWriter"));
        setIntField(term206809, term206809.getClass(), "stackSize", 8);
        setIntElement(term206705, 0, 4);
        setIntElement(term206705, 1, 4);
        setIntElement(term206705, 2, 4);
        setIntElement(term206705, 3, 4);
        setIntElement(term206705, 4, 4);
        setIntElement(term206705, 5, 4);
        setIntElement(term206705, 6, 4);
        setIntElement(term206705, 7, 4);
        setField(term206809, term206809.getClass(), "stack", term206705);
        setField(term206809, term206809.getClass(), "out", term206851);
        setField(term206809, term206809.getClass(), "separator", null);
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
            callMethod(klass, "open", argTypes, term206809, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


