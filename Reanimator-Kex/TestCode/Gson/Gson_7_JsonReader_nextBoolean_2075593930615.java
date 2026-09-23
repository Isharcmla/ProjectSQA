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

public class JsonReader_nextBoolean_2075593930615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294387;

    public JsonReader_nextBoolean_2075593930615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294387 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term294185 = (int[]) newIntArray(4);
        setIntField(term294387, term294387.getClass(), "peeked", 9);
        setIntField(term294387, term294387.getClass(), "lineNumber", 0);
        setIntField(term294387, term294387.getClass(), "pos", 0);
        setIntField(term294387, term294387.getClass(), "lineStart", 0);
        setIntField(term294387, term294387.getClass(), "stackSize", 1);
        setIntElement(term294185, 0, 6);
        setField(term294387, term294387.getClass(), "stack", term294185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextBoolean", argTypes, term294387, args);
    }

};


