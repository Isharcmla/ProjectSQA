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

public class JsonReader_nextLong_951453520999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1417379;

    public JsonReader_nextLong_951453520999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1417379 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1417175 = (int[]) newIntArray(1);
        setIntField(term1417379, term1417379.getClass(), "peeked", 6);
        setIntField(term1417379, term1417379.getClass(), "lineNumber", 0);
        setIntField(term1417379, term1417379.getClass(), "pos", 0);
        setIntField(term1417379, term1417379.getClass(), "lineStart", 0);
        setIntField(term1417379, term1417379.getClass(), "stackSize", 1);
        setIntElement(term1417175, 0, 3);
        setField(term1417379, term1417379.getClass(), "stack", term1417175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextLong", argTypes, term1417379, args);
    }

};


