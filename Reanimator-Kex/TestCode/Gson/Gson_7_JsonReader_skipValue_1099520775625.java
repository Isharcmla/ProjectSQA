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

public class JsonReader_skipValue_1099520775625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308948;

    public JsonReader_skipValue_1099520775625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308948 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term308839 = (char[]) newCharArray(0);
        setIntField(term308948, term308948.getClass(), "peeked", 10);
        setIntField(term308948, term308948.getClass(), "pos", 0);
        setIntField(term308948, term308948.getClass(), "limit", 0);
        setField(term308948, term308948.getClass(), "buffer", term308839);
        setIntField(term308948, term308948.getClass(), "lineStart", 0);
        setField(term308948, term308948.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipValue", argTypes, term308948, args);
    }

};


