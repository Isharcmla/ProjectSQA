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

public class JsonReader_endArray_1917304595523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264115;

    public JsonReader_endArray_1917304595523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264115 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term263681 = (int[]) newIntArray(233);
        setIntField(term264115, term264115.getClass(), "peeked", 7);
        setIntField(term264115, term264115.getClass(), "lineNumber", 0);
        setIntField(term264115, term264115.getClass(), "pos", 0);
        setIntField(term264115, term264115.getClass(), "lineStart", 0);
        setIntField(term264115, term264115.getClass(), "stackSize", 2);
        setIntElement(term263681, 0, 66);
        setField(term264115, term264115.getClass(), "stack", term263681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endArray", argTypes, term264115, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


