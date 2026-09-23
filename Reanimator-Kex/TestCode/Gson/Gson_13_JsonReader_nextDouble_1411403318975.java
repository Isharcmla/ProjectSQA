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

public class JsonReader_nextDouble_1411403318975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1394546;

    public JsonReader_nextDouble_1411403318975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1394546 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1394335 = (int[]) newIntArray(2);
        setIntField(term1394546, term1394546.getClass(), "peeked", 5);
        setIntField(term1394546, term1394546.getClass(), "lineNumber", 0);
        setIntField(term1394546, term1394546.getClass(), "pos", 0);
        setIntField(term1394546, term1394546.getClass(), "lineStart", 0);
        setIntField(term1394546, term1394546.getClass(), "stackSize", 1);
        setIntElement(term1394335, 0, 6);
        setField(term1394546, term1394546.getClass(), "stack", term1394335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextDouble", argTypes, term1394546, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


