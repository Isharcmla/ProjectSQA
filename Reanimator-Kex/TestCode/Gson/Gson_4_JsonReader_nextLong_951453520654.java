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

public class JsonReader_nextLong_951453520654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381092;

    public JsonReader_nextLong_951453520654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381092 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term380874 = (int[]) newIntArray(18);
        setIntField(term381092, term381092.getClass(), "peeked", 17);
        setIntField(term381092, term381092.getClass(), "lineNumber", 0);
        setIntField(term381092, term381092.getClass(), "pos", 0);
        setIntField(term381092, term381092.getClass(), "lineStart", 0);
        setIntField(term381092, term381092.getClass(), "stackSize", 1);
        setIntElement(term380874, 0, 4);
        setField(term381092, term381092.getClass(), "stack", term380874);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextLong", argTypes, term381092, args);
    }

};


