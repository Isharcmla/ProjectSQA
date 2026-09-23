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

public class JsonWriter_endObject_1591364441213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77906;

    public JsonWriter_endObject_1591364441213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77906 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term77805 = (int[]) newIntArray(0);
        Object term77950 = newInstance(Class.forName("java.io.PrintWriter"));
        setIntField(term77906, term77906.getClass(), "stackSize", -1965344904);
        setIntElement(term77805, -1965344905, 5);
        setField(term77906, term77906.getClass(), "stack", term77805);
        setField(term77906, term77906.getClass(), "deferredName", null);
        setField(term77906, term77906.getClass(), "indent", null);
        setField(term77906, term77906.getClass(), "out", term77950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endObject", argTypes, term77906, args);
    }

};


