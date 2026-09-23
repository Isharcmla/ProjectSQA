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

public class JsonReader_nextLong_951453520521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209345;

    public JsonReader_nextLong_951453520521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209345 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term209345, term209345.getClass(), "peeked", 5);
        setIntField(term209345, term209345.getClass(), "lineNumber", 0);
        setIntField(term209345, term209345.getClass(), "pos", 0);
        setIntField(term209345, term209345.getClass(), "lineStart", 0);
        setIntField(term209345, term209345.getClass(), "stackSize", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextLong", argTypes, term209345, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


