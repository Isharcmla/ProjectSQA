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

public class JsonReader_nextBoolean_2075593930483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209350;

    public JsonReader_nextBoolean_2075593930483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209350 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term208919 = (int[]) newIntArray(234);
        setIntField(term209350, term209350.getClass(), "peeked", 1);
        setIntField(term209350, term209350.getClass(), "lineNumber", 0);
        setIntField(term209350, term209350.getClass(), "pos", 0);
        setIntField(term209350, term209350.getClass(), "lineStart", 0);
        setIntField(term209350, term209350.getClass(), "stackSize", 1);
        setIntElement(term208919, 0, 8);
        setField(term209350, term209350.getClass(), "stack", term208919);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextBoolean", argTypes, term209350, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


