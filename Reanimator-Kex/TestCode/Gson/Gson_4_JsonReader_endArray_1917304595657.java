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
import java.lang.Object;

public class JsonReader_endArray_1917304595657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384380;

    public JsonReader_endArray_1917304595657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term384380 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term384179 = (int[]) newIntArray(8);
        Object[] term384189 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term384380, term384380.getClass(), "peeked", 6);
        setIntField(term384380, term384380.getClass(), "lineNumber", 0);
        setIntField(term384380, term384380.getClass(), "pos", 0);
        setIntField(term384380, term384380.getClass(), "lineStart", 0);
        setIntField(term384380, term384380.getClass(), "stackSize", 1);
        setIntElement(term384179, 0, 5);
        setField(term384380, term384380.getClass(), "stack", term384179);
        setField(term384380, term384380.getClass(), "pathNames", term384189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endArray", argTypes, term384380, args);
    }

};


