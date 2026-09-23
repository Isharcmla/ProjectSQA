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

public class JsonReader_endArray_1917304595583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252936;

    public JsonReader_endArray_1917304595583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252936 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term252693 = (int[]) newIntArray(48);
        setIntField(term252936, term252936.getClass(), "peeked", 17);
        setIntField(term252936, term252936.getClass(), "lineNumber", 0);
        setIntField(term252936, term252936.getClass(), "pos", 0);
        setIntField(term252936, term252936.getClass(), "lineStart", 0);
        setIntField(term252936, term252936.getClass(), "stackSize", 1);
        setIntElement(term252693, 0, 66);
        setIntElement(term252693, 1, 69);
        setIntElement(term252693, 2, 71);
        setIntElement(term252693, 3, 73);
        setIntElement(term252693, 4, 78);
        setIntElement(term252693, 5, 95);
        setIntElement(term252693, 6, 79);
        setIntElement(term252693, 7, 66);
        setIntElement(term252693, 8, 74);
        setIntElement(term252693, 9, 69);
        setIntElement(term252693, 10, 67);
        setIntElement(term252693, 11, 84);
        setField(term252936, term252936.getClass(), "stack", term252693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endArray", argTypes, term252936, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


