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

public class JsonReader_nextLong_951453520810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1287466;

    public JsonReader_nextLong_951453520810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1287466 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term1287466, term1287466.getClass(), "peeked", 17);
        setIntField(term1287466, term1287466.getClass(), "lineNumber", 0);
        setIntField(term1287466, term1287466.getClass(), "pos", 0);
        setIntField(term1287466, term1287466.getClass(), "lineStart", 0);
        setIntField(term1287466, term1287466.getClass(), "stackSize", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextLong", argTypes, term1287466, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


