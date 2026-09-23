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

public class JsonReader_nextBoolean_2075593930415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153387;

    public JsonReader_nextBoolean_2075593930415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153387 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term153185 = (int[]) newIntArray(4);
        setIntField(term153387, term153387.getClass(), "peeked", 9);
        setIntField(term153387, term153387.getClass(), "lineNumber", 0);
        setIntField(term153387, term153387.getClass(), "pos", 0);
        setIntField(term153387, term153387.getClass(), "lineStart", 0);
        setIntField(term153387, term153387.getClass(), "stackSize", 1);
        setIntElement(term153185, 0, 2);
        setField(term153387, term153387.getClass(), "stack", term153185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextBoolean", argTypes, term153387, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


