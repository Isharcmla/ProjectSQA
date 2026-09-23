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

public class JsonReader_nextLong_951453520455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187844;

    public JsonReader_nextLong_951453520455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187844 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term187601 = (int[]) newIntArray(17);
        setIntField(term187844, term187844.getClass(), "peeked", 12);
        setIntField(term187844, term187844.getClass(), "lineNumber", 0);
        setIntField(term187844, term187844.getClass(), "pos", 0);
        setIntField(term187844, term187844.getClass(), "lineStart", 0);
        setIntField(term187844, term187844.getClass(), "stackSize", 2);
        setIntElement(term187601, 0, 66);
        setIntElement(term187601, 1, 2);
        setField(term187844, term187844.getClass(), "stack", term187601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextLong", argTypes, term187844, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


