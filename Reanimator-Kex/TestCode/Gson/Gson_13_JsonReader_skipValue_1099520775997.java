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

public class JsonReader_skipValue_1099520775997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1413637;

    public JsonReader_skipValue_1099520775997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1413637 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term1413637, term1413637.getClass(), "peeked", 9);
        setField(term1413637, term1413637.getClass(), "buffer", null);
        setIntField(term1413637, term1413637.getClass(), "pos", 2134900735);
        setIntField(term1413637, term1413637.getClass(), "limit", -2134900736);
        setIntField(term1413637, term1413637.getClass(), "lineStart", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipValue", argTypes, term1413637, args);
    }

};


