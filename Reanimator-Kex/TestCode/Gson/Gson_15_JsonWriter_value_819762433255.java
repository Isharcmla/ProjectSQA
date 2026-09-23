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

public class JsonWriter_value_819762433255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91386;

    public JsonWriter_value_819762433255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91386 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term91280 = (int[]) newIntArray(8);
        setField(term91386, term91386.getClass(), "deferredName", "");
        setIntField(term91386, term91386.getClass(), "stackSize", 8);
        setIntElement(term91280, 0, 3);
        setIntElement(term91280, 1, 3);
        setIntElement(term91280, 2, 3);
        setIntElement(term91280, 3, 3);
        setIntElement(term91280, 4, 3);
        setIntElement(term91280, 5, 3);
        setIntElement(term91280, 6, 3);
        setIntElement(term91280, 7, 3);
        setField(term91386, term91386.getClass(), "stack", term91280);
        setField(term91386, term91386.getClass(), "indent", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        try {
            callMethod(klass, "value", argTypes, term91386, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


