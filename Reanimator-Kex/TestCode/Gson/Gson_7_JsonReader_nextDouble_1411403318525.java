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

public class JsonReader_nextDouble_1411403318525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211504;

    public JsonReader_nextDouble_1411403318525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211504 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term210799 = (int[]) newIntArray(505);
        setIntField(term211504, term211504.getClass(), "peeked", 1);
        setIntField(term211504, term211504.getClass(), "lineNumber", 0);
        setIntField(term211504, term211504.getClass(), "pos", 0);
        setIntField(term211504, term211504.getClass(), "lineStart", 0);
        setIntField(term211504, term211504.getClass(), "stackSize", 1);
        setIntElement(term210799, 0, 66);
        setIntElement(term210799, 1, 69);
        setIntElement(term210799, 2, 71);
        setIntElement(term210799, 3, 73);
        setIntElement(term210799, 4, 78);
        setIntElement(term210799, 5, 95);
        setIntElement(term210799, 6, 79);
        setIntElement(term210799, 7, 66);
        setIntElement(term210799, 8, 74);
        setIntElement(term210799, 9, 69);
        setIntElement(term210799, 10, 67);
        setIntElement(term210799, 11, 84);
        setField(term211504, term211504.getClass(), "stack", term210799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextDouble", argTypes, term211504, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


