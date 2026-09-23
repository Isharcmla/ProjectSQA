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

public class JsonReader_nextDouble_1411403318955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1374495;

    public JsonReader_nextDouble_1411403318955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1374495 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1373306 = (int[]) newIntArray(489);
        int[] term1373797 = (int[]) newIntArray(490);
        setIntField(term1374495, term1374495.getClass(), "peeked", 4);
        setIntField(term1374495, term1374495.getClass(), "lineNumber", 0);
        setIntField(term1374495, term1374495.getClass(), "pos", 0);
        setIntField(term1374495, term1374495.getClass(), "lineStart", 0);
        setIntField(term1374495, term1374495.getClass(), "stackSize", 1);
        setIntElement(term1373306, 0, 1);
        setField(term1374495, term1374495.getClass(), "stack", term1373306);
        setField(term1374495, term1374495.getClass(), "pathIndices", term1373797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextDouble", argTypes, term1374495, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


