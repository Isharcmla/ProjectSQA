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

public class JsonReader_endArray_1917304595428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168449;

    public JsonReader_endArray_1917304595428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168449 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term168252 = (int[]) newIntArray(4);
        setIntField(term168449, term168449.getClass(), "peeked", 7);
        setIntField(term168449, term168449.getClass(), "lineNumber", 0);
        setIntField(term168449, term168449.getClass(), "pos", 0);
        setIntField(term168449, term168449.getClass(), "lineStart", 0);
        setIntField(term168449, term168449.getClass(), "stackSize", 1);
        setIntElement(term168252, 0, 66);
        setIntElement(term168252, 1, 69);
        setIntElement(term168252, 2, 71);
        setIntElement(term168252, 3, 73);
        setField(term168449, term168449.getClass(), "stack", term168252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endArray", argTypes, term168449, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


