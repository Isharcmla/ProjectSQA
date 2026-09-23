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

public class JsonReader_nextName_1087370652503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196751;

    public JsonReader_nextName_1087370652503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196751 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term196751, term196751.getClass(), "peeked", 7);
        setIntField(term196751, term196751.getClass(), "lineNumber", 0);
        setIntField(term196751, term196751.getClass(), "pos", 0);
        setIntField(term196751, term196751.getClass(), "lineStart", 0);
        setIntField(term196751, term196751.getClass(), "stackSize", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextName", argTypes, term196751, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


