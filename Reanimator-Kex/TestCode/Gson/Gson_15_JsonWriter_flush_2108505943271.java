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

public class JsonWriter_flush_2108505943271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106735;
     Object term106789;

    public JsonWriter_flush_2108505943271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106735 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term106781 = newInstance(Class.forName("java.io.StringWriter"));
        setIntField(term106735, term106735.getClass(), "stackSize", -1);
        setField(term106735, term106735.getClass(), "out", term106781);
        term106789 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term106790 = newInstance(Class.forName("java.io.StringWriter"));
        setField(term106790, term106790.getClass(), "buf", null);
        setField(term106790, term106790.getClass(), "writeBuffer", null);
        setField(term106790, term106790.getClass(), "lock", null);
        setField(term106789, term106789.getClass(), "out", term106790);
        setField(term106789, term106789.getClass(), "stack", null);
        setIntField(term106789, term106789.getClass(), "stackSize", -1);
        setField(term106789, term106789.getClass(), "indent", null);
        setField(term106789, term106789.getClass(), "separator", null);
        setBooleanField(term106789, term106789.getClass(), "lenient", false);
        setBooleanField(term106789, term106789.getClass(), "htmlSafe", false);
        setField(term106789, term106789.getClass(), "deferredName", null);
        setBooleanField(term106789, term106789.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term106735, args);
        assertTrue(recursiveEquals(term106735, term106789));
    }

};


