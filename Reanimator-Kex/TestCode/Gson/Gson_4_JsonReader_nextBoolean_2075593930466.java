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

public class JsonReader_nextBoolean_2075593930466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195285;

    public JsonReader_nextBoolean_2075593930466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195285 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term194660 = (int[]) newIntArray(425);
        setIntField(term195285, term195285.getClass(), "peeked", 1);
        setIntField(term195285, term195285.getClass(), "lineNumber", 0);
        setIntField(term195285, term195285.getClass(), "pos", 0);
        setIntField(term195285, term195285.getClass(), "lineStart", 0);
        setIntField(term195285, term195285.getClass(), "stackSize", 2);
        setIntElement(term194660, 0, 110);
        setField(term195285, term195285.getClass(), "stack", term194660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextBoolean", argTypes, term195285, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


