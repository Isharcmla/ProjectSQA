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

public class JsonReader_nextDouble_1411403318977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1396805;

    public JsonReader_nextDouble_1411403318977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1396805 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1396598 = (int[]) newIntArray(1);
        setIntField(term1396805, term1396805.getClass(), "peeked", 4);
        setIntField(term1396805, term1396805.getClass(), "lineNumber", 0);
        setIntField(term1396805, term1396805.getClass(), "pos", 0);
        setIntField(term1396805, term1396805.getClass(), "lineStart", 0);
        setIntField(term1396805, term1396805.getClass(), "stackSize", 2);
        setIntElement(term1396598, 0, 7);
        setField(term1396805, term1396805.getClass(), "stack", term1396598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextDouble", argTypes, term1396805, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


