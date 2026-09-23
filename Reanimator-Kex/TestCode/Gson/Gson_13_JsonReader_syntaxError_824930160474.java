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

public class JsonReader_syntaxError_824930160474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660376;

    public JsonReader_syntaxError_824930160474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term660376 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term648350 = (int[]) newIntArray(511);
        setIntField(term660376, term660376.getClass(), "lineNumber", 0);
        setIntField(term660376, term660376.getClass(), "pos", 0);
        setIntField(term660376, term660376.getClass(), "lineStart", 0);
        setIntField(term660376, term660376.getClass(), "stackSize", 31);
        setIntElement(term648350, 0, -752870423);
        setIntElement(term648350, 1, -1698809299);
        setIntElement(term648350, 2, 401512128);
        setIntElement(term648350, 3, -2069930777);
        setIntElement(term648350, 4, 7);
        setIntElement(term648350, 22, 2);
        setField(term660376, term660376.getClass(), "stack", term648350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term660376, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


