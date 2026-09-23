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
import static com.google.gson.stream.EqualityUtils.*;
import java.lang.Object;

public class JsonReader_close_1004188595102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29377;
     Object term30024;

    public JsonReader_close_1004188595102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29377 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term29033 = (int[]) newIntArray(256);
        Object term29415 = newInstance(Class.forName("java.io.Reader$1"));
        setIntField(term29377, term29377.getClass(), "peeked", 0);
        setField(term29377, term29377.getClass(), "stack", term29033);
        setIntField(term29377, term29377.getClass(), "stackSize", 0);
        setField(term29377, term29377.getClass(), "in", term29415);
        term30024 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        Object term30025 = newInstance(Class.forName("java.io.Reader$1"));
        int[] term30026 = (int[]) newIntArray(256);
        setBooleanField(term30025, term30025.getClass(), "closed", true);
        setField(term30025, term30025.getClass(), "lock", null);
        setField(term30025, term30025.getClass(), "skipBuffer", null);
        setField(term30024, term30024.getClass(), "in", term30025);
        setBooleanField(term30024, term30024.getClass(), "lenient", false);
        setField(term30024, term30024.getClass(), "buffer", null);
        setIntField(term30024, term30024.getClass(), "pos", 0);
        setIntField(term30024, term30024.getClass(), "limit", 0);
        setIntField(term30024, term30024.getClass(), "lineNumber", 0);
        setIntField(term30024, term30024.getClass(), "lineStart", 0);
        setIntField(term30024, term30024.getClass(), "peeked", 0);
        setLongField(term30024, term30024.getClass(), "peekedLong", 0L);
        setIntField(term30024, term30024.getClass(), "peekedNumberLength", 0);
        setField(term30024, term30024.getClass(), "peekedString", null);
        setIntElement(term30026, 0, 8);
        setField(term30024, term30024.getClass(), "stack", term30026);
        setIntField(term30024, term30024.getClass(), "stackSize", 1);
        setField(term30024, term30024.getClass(), "pathNames", null);
        setField(term30024, term30024.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term29377, args);
        assertTrue(recursiveEquals(term29377, term30024));
    }

};


