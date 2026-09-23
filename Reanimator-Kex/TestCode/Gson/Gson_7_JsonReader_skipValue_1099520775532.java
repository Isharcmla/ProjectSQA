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

public class JsonReader_skipValue_1099520775532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217310;

    public JsonReader_skipValue_1099520775532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217310 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term217310, term217310.getClass(), "peeked", 13);
        setField(term217310, term217310.getClass(), "buffer", null);
        setIntField(term217310, term217310.getClass(), "pos", 2134900735);
        setIntField(term217310, term217310.getClass(), "limit", -2134900736);
        setIntField(term217310, term217310.getClass(), "lineStart", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "skipValue", argTypes, term217310, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


