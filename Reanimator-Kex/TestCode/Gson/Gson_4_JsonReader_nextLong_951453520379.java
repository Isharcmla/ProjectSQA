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

public class JsonReader_nextLong_951453520379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139499;

    public JsonReader_nextLong_951453520379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139499 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term139499, term139499.getClass(), "peeked", 1);
        setIntField(term139499, term139499.getClass(), "lineNumber", 0);
        setIntField(term139499, term139499.getClass(), "pos", 0);
        setIntField(term139499, term139499.getClass(), "lineStart", 0);
        setIntField(term139499, term139499.getClass(), "stackSize", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextLong", argTypes, term139499, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


