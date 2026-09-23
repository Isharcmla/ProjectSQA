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

public class JsonReader_nextDouble_1411403318514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204868;

    public JsonReader_nextDouble_1411403318514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204868 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term204666 = (int[]) newIntArray(4);
        setIntField(term204868, term204868.getClass(), "peeked", 7);
        setIntField(term204868, term204868.getClass(), "lineNumber", 0);
        setIntField(term204868, term204868.getClass(), "pos", 0);
        setIntField(term204868, term204868.getClass(), "lineStart", 0);
        setIntField(term204868, term204868.getClass(), "stackSize", 1);
        setIntElement(term204666, 0, 66);
        setIntElement(term204666, 1, 69);
        setIntElement(term204666, 2, 71);
        setIntElement(term204666, 3, 73);
        setField(term204868, term204868.getClass(), "stack", term204666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextDouble", argTypes, term204868, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


