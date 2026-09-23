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
import java.lang.Object;

public class JsonReader_skipValue_1099520775996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1413485;

    public JsonReader_skipValue_1099520775996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1413485 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1413368 = (char[]) newCharArray(0);
        Object term1413527 = newInstance(Class.forName("java.io.FileReader"));
        setIntField(term1413485, term1413485.getClass(), "peeked", 13);
        setField(term1413485, term1413485.getClass(), "buffer", term1413368);
        setIntField(term1413485, term1413485.getClass(), "pos", 0);
        setIntField(term1413485, term1413485.getClass(), "limit", 0);
        setIntField(term1413485, term1413485.getClass(), "lineStart", 0);
        setField(term1413485, term1413485.getClass(), "in", term1413527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipValue", argTypes, term1413485, args);
    }

};


