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

public class JsonReader_nextLong_951453520585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311376;

    public JsonReader_nextLong_951453520585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311376 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term311130 = (int[]) newIntArray(48);
        setIntField(term311376, term311376.getClass(), "peeked", 17);
        setIntField(term311376, term311376.getClass(), "lineNumber", 0);
        setIntField(term311376, term311376.getClass(), "pos", 0);
        setIntField(term311376, term311376.getClass(), "lineStart", 0);
        setIntField(term311376, term311376.getClass(), "stackSize", 1);
        setIntElement(term311130, 0, 66);
        setIntElement(term311130, 1, 69);
        setIntElement(term311130, 2, 71);
        setIntElement(term311130, 3, 73);
        setIntElement(term311130, 4, 78);
        setIntElement(term311130, 5, 95);
        setIntElement(term311130, 6, 79);
        setIntElement(term311130, 7, 66);
        setIntElement(term311130, 8, 74);
        setIntElement(term311130, 9, 69);
        setIntElement(term311130, 10, 67);
        setIntElement(term311130, 11, 84);
        setField(term311376, term311376.getClass(), "stack", term311130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextLong", argTypes, term311376, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


