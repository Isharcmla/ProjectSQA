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

public class JsonReader_nextInt_677611555752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258283;

    public JsonReader_nextInt_677611555752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1258283 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1258079 = (int[]) newIntArray(1);
        setIntField(term1258283, term1258283.getClass(), "peeked", 4);
        setIntField(term1258283, term1258283.getClass(), "lineNumber", 0);
        setIntField(term1258283, term1258283.getClass(), "pos", 0);
        setIntField(term1258283, term1258283.getClass(), "lineStart", 0);
        setIntField(term1258283, term1258283.getClass(), "stackSize", 1);
        setIntElement(term1258079, 0, 6);
        setField(term1258283, term1258283.getClass(), "stack", term1258079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextInt", argTypes, term1258283, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


