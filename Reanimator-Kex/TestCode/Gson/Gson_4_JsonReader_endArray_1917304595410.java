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

public class JsonReader_endArray_1917304595410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156803;

    public JsonReader_endArray_1917304595410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156803 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term156606 = (int[]) newIntArray(1);
        setIntField(term156803, term156803.getClass(), "peeked", 6);
        setIntField(term156803, term156803.getClass(), "lineNumber", 0);
        setIntField(term156803, term156803.getClass(), "pos", 0);
        setIntField(term156803, term156803.getClass(), "lineStart", 0);
        setIntField(term156803, term156803.getClass(), "stackSize", 1);
        setIntElement(term156606, 0, 66);
        setField(term156803, term156803.getClass(), "stack", term156606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endArray", argTypes, term156803, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


