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

public class JsonReader_nextDouble_1411403318865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1312407;

    public JsonReader_nextDouble_1411403318865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1312407 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1312199 = (int[]) newIntArray(1);
        setIntField(term1312407, term1312407.getClass(), "peeked", 4);
        setIntField(term1312407, term1312407.getClass(), "lineNumber", 0);
        setIntField(term1312407, term1312407.getClass(), "pos", 0);
        setIntField(term1312407, term1312407.getClass(), "lineStart", 0);
        setIntField(term1312407, term1312407.getClass(), "stackSize", 2);
        setIntElement(term1312199, 0, 66);
        setField(term1312407, term1312407.getClass(), "stack", term1312199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextDouble", argTypes, term1312407, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


