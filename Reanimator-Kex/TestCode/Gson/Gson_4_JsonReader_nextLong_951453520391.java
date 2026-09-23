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

public class JsonReader_nextLong_951453520391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146598;

    public JsonReader_nextLong_951453520391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146598 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term145900 = (int[]) newIntArray(497);
        setIntField(term146598, term146598.getClass(), "peeked", 12);
        setIntField(term146598, term146598.getClass(), "lineNumber", 0);
        setIntField(term146598, term146598.getClass(), "pos", 0);
        setIntField(term146598, term146598.getClass(), "lineStart", 0);
        setIntField(term146598, term146598.getClass(), "stackSize", 1);
        setIntElement(term145900, 0, 3);
        setField(term146598, term146598.getClass(), "stack", term145900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextLong", argTypes, term146598, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


