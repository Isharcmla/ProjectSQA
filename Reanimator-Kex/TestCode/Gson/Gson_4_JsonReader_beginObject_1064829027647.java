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

public class JsonReader_beginObject_1064829027647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371753;

    public JsonReader_beginObject_1064829027647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term371753 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term371548 = (int[]) newIntArray(1);
        Object[] term371551 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term371753, term371753.getClass(), "peeked", 8);
        setIntField(term371753, term371753.getClass(), "lineNumber", 0);
        setIntField(term371753, term371753.getClass(), "pos", 0);
        setIntField(term371753, term371753.getClass(), "lineStart", 0);
        setIntField(term371753, term371753.getClass(), "stackSize", 1);
        setIntElement(term371548, 0, 5);
        setField(term371753, term371753.getClass(), "stack", term371548);
        setField(term371753, term371753.getClass(), "pathNames", term371551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginObject", argTypes, term371753, args);
    }

};


