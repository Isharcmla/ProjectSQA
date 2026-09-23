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

public class JsonReader_beginArray_881593221431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170577;

    public JsonReader_beginArray_881593221431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170577 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term170380 = (int[]) newIntArray(1);
        setIntField(term170577, term170577.getClass(), "peeked", 6);
        setIntField(term170577, term170577.getClass(), "lineNumber", 0);
        setIntField(term170577, term170577.getClass(), "pos", 0);
        setIntField(term170577, term170577.getClass(), "lineStart", 0);
        setIntField(term170577, term170577.getClass(), "stackSize", 1);
        setIntElement(term170380, 0, 4);
        setField(term170577, term170577.getClass(), "stack", term170380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginArray", argTypes, term170577, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


