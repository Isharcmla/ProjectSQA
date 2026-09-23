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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_nextDouble_1411403318909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1347513;

    public JsonReader_nextDouble_1411403318909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1347513 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1347306 = (int[]) newIntArray(1);
        setIntField(term1347513, term1347513.getClass(), "peeked", 4);
        setIntField(term1347513, term1347513.getClass(), "lineNumber", 0);
        setIntField(term1347513, term1347513.getClass(), "pos", 0);
        setIntField(term1347513, term1347513.getClass(), "lineStart", 0);
        setIntField(term1347513, term1347513.getClass(), "stackSize", 2);
        setIntElement(term1347306, 0, 8);
        setField(term1347513, term1347513.getClass(), "stack", term1347306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextDouble", argTypes, term1347513, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


