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

public class JsonReader_nextLong_9514535201015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1434598;

    public JsonReader_nextLong_9514535201015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1434598 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1434474 = (char[]) newCharArray(2);
        Object term1434636 = newInstance(Class.forName("java.io.Reader$1"));
        setIntField(term1434598, term1434598.getClass(), "peeked", 10);
        setIntField(term1434598, term1434598.getClass(), "pos", 0);
        setIntField(term1434598, term1434598.getClass(), "limit", 0);
        setField(term1434598, term1434598.getClass(), "buffer", term1434474);
        setIntField(term1434598, term1434598.getClass(), "lineStart", 0);
        setField(term1434598, term1434598.getClass(), "in", term1434636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextLong", argTypes, term1434598, args);
    }

};


