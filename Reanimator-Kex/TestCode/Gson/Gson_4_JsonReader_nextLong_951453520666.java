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

public class JsonReader_nextLong_951453520666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393074;

    public JsonReader_nextLong_951453520666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term393074 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term392611 = (int[]) newIntArray(256);
        Object[] term392869 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term393074, term393074.getClass(), "peeked", 12);
        setIntField(term393074, term393074.getClass(), "lineNumber", 0);
        setIntField(term393074, term393074.getClass(), "pos", 0);
        setIntField(term393074, term393074.getClass(), "lineStart", 0);
        setIntField(term393074, term393074.getClass(), "stackSize", 1);
        setIntElement(term392611, 0, 5);
        setField(term393074, term393074.getClass(), "stack", term392611);
        setField(term393074, term393074.getClass(), "pathNames", term392869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextLong", argTypes, term393074, args);
    }

};


