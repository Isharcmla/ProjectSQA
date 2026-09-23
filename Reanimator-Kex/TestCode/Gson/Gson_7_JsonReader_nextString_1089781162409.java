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
import java.lang.NullPointerException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_nextString_1089781162409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148320;

    public JsonReader_nextString_1089781162409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148320 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term148118 = (int[]) newIntArray(1);
        setIntField(term148320, term148320.getClass(), "peeked", 5);
        setIntField(term148320, term148320.getClass(), "lineNumber", 0);
        setIntField(term148320, term148320.getClass(), "pos", 0);
        setIntField(term148320, term148320.getClass(), "lineStart", 0);
        setIntField(term148320, term148320.getClass(), "stackSize", 1);
        setIntElement(term148118, 0, 4);
        setField(term148320, term148320.getClass(), "stack", term148118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term148320, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


