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

public class JsonReader_endArray_1917304595650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375534;

    public JsonReader_endArray_1917304595650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term375534 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term375321 = (int[]) newIntArray(5);
        setIntField(term375534, term375534.getClass(), "peeked", 7);
        setIntField(term375534, term375534.getClass(), "lineNumber", 0);
        setIntField(term375534, term375534.getClass(), "pos", 0);
        setIntField(term375534, term375534.getClass(), "lineStart", 0);
        setIntField(term375534, term375534.getClass(), "stackSize", 2);
        setIntElement(term375321, 0, 66);
        setIntElement(term375321, 1, 3);
        setField(term375534, term375534.getClass(), "stack", term375321);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endArray", argTypes, term375534, args);
    }

};


