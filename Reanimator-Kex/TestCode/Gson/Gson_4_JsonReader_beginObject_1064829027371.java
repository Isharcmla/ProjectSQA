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

public class JsonReader_beginObject_1064829027371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134417;

    public JsonReader_beginObject_1064829027371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134417 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term134118 = (int[]) newIntArray(105);
        setIntField(term134417, term134417.getClass(), "peeked", 9);
        setIntField(term134417, term134417.getClass(), "lineNumber", 0);
        setIntField(term134417, term134417.getClass(), "pos", 0);
        setIntField(term134417, term134417.getClass(), "lineStart", 0);
        setIntField(term134417, term134417.getClass(), "stackSize", 1);
        setIntElement(term134118, 0, 66);
        setIntElement(term134118, 1, 69);
        setIntElement(term134118, 2, 71);
        setIntElement(term134118, 3, 73);
        setIntElement(term134118, 4, 78);
        setIntElement(term134118, 5, 95);
        setIntElement(term134118, 6, 79);
        setIntElement(term134118, 7, 66);
        setIntElement(term134118, 8, 74);
        setIntElement(term134118, 9, 69);
        setIntElement(term134118, 10, 67);
        setIntElement(term134118, 11, 84);
        setField(term134417, term134417.getClass(), "stack", term134118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginObject", argTypes, term134417, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


