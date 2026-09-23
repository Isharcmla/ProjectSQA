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

public class JsonReader_nextDouble_1411403318806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1284168;

    public JsonReader_nextDouble_1411403318806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1284168 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1283960 = (int[]) newIntArray(1);
        setIntField(term1284168, term1284168.getClass(), "peeked", 4);
        setIntField(term1284168, term1284168.getClass(), "lineNumber", 0);
        setIntField(term1284168, term1284168.getClass(), "pos", 0);
        setIntField(term1284168, term1284168.getClass(), "lineStart", 0);
        setIntField(term1284168, term1284168.getClass(), "stackSize", 1);
        setIntElement(term1283960, 0, 8);
        setField(term1284168, term1284168.getClass(), "stack", term1283960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextDouble", argTypes, term1284168, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


