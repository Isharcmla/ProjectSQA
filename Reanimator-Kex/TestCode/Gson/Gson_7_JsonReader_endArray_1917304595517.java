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

public class JsonReader_endArray_1917304595517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206693;

    public JsonReader_endArray_1917304595517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206693 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term206496 = (int[]) newIntArray(4);
        setIntField(term206693, term206693.getClass(), "peeked", 7);
        setIntField(term206693, term206693.getClass(), "lineNumber", 0);
        setIntField(term206693, term206693.getClass(), "pos", 0);
        setIntField(term206693, term206693.getClass(), "lineStart", 0);
        setIntField(term206693, term206693.getClass(), "stackSize", 1);
        setIntElement(term206496, 0, 66);
        setIntElement(term206496, 1, 69);
        setIntElement(term206496, 2, 71);
        setIntElement(term206496, 3, 73);
        setField(term206693, term206693.getClass(), "stack", term206496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endArray", argTypes, term206693, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


