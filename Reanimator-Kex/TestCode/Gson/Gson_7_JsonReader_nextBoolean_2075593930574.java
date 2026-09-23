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

public class JsonReader_nextBoolean_2075593930574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239694;

    public JsonReader_nextBoolean_2075593930574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239694 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term238512 = (int[]) newIntArray(489);
        int[] term239003 = (int[]) newIntArray(492);
        setIntField(term239694, term239694.getClass(), "peeked", 9);
        setIntField(term239694, term239694.getClass(), "lineNumber", 0);
        setIntField(term239694, term239694.getClass(), "pos", 0);
        setIntField(term239694, term239694.getClass(), "lineStart", 0);
        setIntField(term239694, term239694.getClass(), "stackSize", 1);
        setIntElement(term238512, 0, 2);
        setField(term239694, term239694.getClass(), "stack", term238512);
        setIntElement(term239003, 0, 69);
        setIntElement(term239003, 1, 78);
        setIntElement(term239003, 2, 68);
        setIntElement(term239003, 3, 95);
        setIntElement(term239003, 4, 68);
        setIntElement(term239003, 5, 79);
        setIntElement(term239003, 6, 67);
        setIntElement(term239003, 7, 85);
        setIntElement(term239003, 8, 77);
        setIntElement(term239003, 9, 69);
        setIntElement(term239003, 10, 78);
        setIntElement(term239003, 11, 84);
        setField(term239694, term239694.getClass(), "pathIndices", term239003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextBoolean", argTypes, term239694, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


