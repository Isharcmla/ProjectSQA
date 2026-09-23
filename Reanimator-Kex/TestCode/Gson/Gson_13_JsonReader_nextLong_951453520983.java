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

public class JsonReader_nextLong_951453520983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1401325;

    public JsonReader_nextLong_951453520983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1401325 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1401121 = (int[]) newIntArray(1);
        setIntField(term1401325, term1401325.getClass(), "peeked", 6);
        setIntField(term1401325, term1401325.getClass(), "lineNumber", 0);
        setIntField(term1401325, term1401325.getClass(), "pos", 0);
        setIntField(term1401325, term1401325.getClass(), "lineStart", 0);
        setIntField(term1401325, term1401325.getClass(), "stackSize", 1);
        setIntElement(term1401121, 0, 4);
        setField(term1401325, term1401325.getClass(), "stack", term1401121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextLong", argTypes, term1401325, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


