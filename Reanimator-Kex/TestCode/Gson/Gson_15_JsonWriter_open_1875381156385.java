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

public class JsonWriter_open_1875381156385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200529;

    public JsonWriter_open_1875381156385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200529 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term200425 = (int[]) newIntArray(8);
        Object term200569 = newInstance(Class.forName("java.io.Console$3"));
        setIntField(term200529, term200529.getClass(), "stackSize", 8);
        setIntElement(term200425, 0, 4);
        setIntElement(term200425, 1, 4);
        setIntElement(term200425, 2, 4);
        setIntElement(term200425, 3, 4);
        setIntElement(term200425, 4, 4);
        setIntElement(term200425, 5, 4);
        setIntElement(term200425, 6, 4);
        setIntElement(term200425, 7, 4);
        setField(term200529, term200529.getClass(), "stack", term200425);
        setField(term200529, term200529.getClass(), "out", term200569);
        setField(term200529, term200529.getClass(), "separator", null);
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
            callMethod(klass, "open", argTypes, term200529, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


