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

public class JsonReader_nextLong_951453520644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369652;

    public JsonReader_nextLong_951453520644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369652 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term369409 = (int[]) newIntArray(17);
        setIntField(term369652, term369652.getClass(), "peeked", 12);
        setIntField(term369652, term369652.getClass(), "lineNumber", 0);
        setIntField(term369652, term369652.getClass(), "pos", 0);
        setIntField(term369652, term369652.getClass(), "lineStart", 0);
        setIntField(term369652, term369652.getClass(), "stackSize", 2);
        setIntElement(term369409, 0, 66);
        setIntElement(term369409, 1, 4);
        setField(term369652, term369652.getClass(), "stack", term369409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextLong", argTypes, term369652, args);
    }

};


