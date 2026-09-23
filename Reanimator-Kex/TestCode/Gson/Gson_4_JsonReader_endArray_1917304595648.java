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

public class JsonReader_endArray_1917304595648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373143;

    public JsonReader_endArray_1917304595648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373143 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term372930 = (int[]) newIntArray(5);
        setIntField(term373143, term373143.getClass(), "peeked", 7);
        setIntField(term373143, term373143.getClass(), "lineNumber", 0);
        setIntField(term373143, term373143.getClass(), "pos", 0);
        setIntField(term373143, term373143.getClass(), "lineStart", 0);
        setIntField(term373143, term373143.getClass(), "stackSize", 2);
        setIntElement(term372930, 0, 66);
        setIntElement(term372930, 1, 5);
        setField(term373143, term373143.getClass(), "stack", term372930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endArray", argTypes, term373143, args);
    }

};


