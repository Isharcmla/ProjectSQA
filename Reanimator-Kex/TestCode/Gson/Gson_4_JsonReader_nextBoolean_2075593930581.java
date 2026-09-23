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

public class JsonReader_nextBoolean_2075593930581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303694;

    public JsonReader_nextBoolean_2075593930581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303694 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term303070 = (int[]) newIntArray(425);
        setIntField(term303694, term303694.getClass(), "peeked", 1);
        setIntField(term303694, term303694.getClass(), "lineNumber", 0);
        setIntField(term303694, term303694.getClass(), "pos", 0);
        setIntField(term303694, term303694.getClass(), "lineStart", 0);
        setIntField(term303694, term303694.getClass(), "stackSize", 2);
        setIntElement(term303070, 0, 8);
        setField(term303694, term303694.getClass(), "stack", term303070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextBoolean", argTypes, term303694, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


