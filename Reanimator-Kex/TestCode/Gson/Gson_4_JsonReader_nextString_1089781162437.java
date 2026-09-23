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

public class JsonReader_nextString_1089781162437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174939;

    public JsonReader_nextString_1089781162437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174939 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term174371 = (int[]) newIntArray(368);
        setIntField(term174939, term174939.getClass(), "peeked", 4);
        setIntField(term174939, term174939.getClass(), "lineNumber", 0);
        setIntField(term174939, term174939.getClass(), "pos", 0);
        setIntField(term174939, term174939.getClass(), "lineStart", 0);
        setIntField(term174939, term174939.getClass(), "stackSize", 1);
        setIntElement(term174371, 0, 66);
        setIntElement(term174371, 1, 69);
        setIntElement(term174371, 2, 71);
        setIntElement(term174371, 3, 73);
        setIntElement(term174371, 4, 78);
        setIntElement(term174371, 5, 95);
        setIntElement(term174371, 6, 79);
        setIntElement(term174371, 7, 66);
        setIntElement(term174371, 8, 74);
        setIntElement(term174371, 9, 69);
        setIntElement(term174371, 10, 67);
        setIntElement(term174371, 11, 84);
        setField(term174939, term174939.getClass(), "stack", term174371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term174939, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


