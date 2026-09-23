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

public class JsonWriter_close_481593699376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228134;
     Object term228500;

    public JsonWriter_close_481593699376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228134 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term228238 = newInstance(Class.forName("com.google.gson.internal.Streams$AppendableWriter"));
        setField(term228134, term228134.getClass(), "out", term228238);
        term228500 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term228501 = newInstance(Class.forName("com.google.gson.internal.Streams$AppendableWriter"));
        setField(term228501, term228501.getClass(), "appendable", null);
        setField(term228501, term228501.getClass(), "currentWrite", null);
        setField(term228501, term228501.getClass(), "writeBuffer", null);
        setField(term228501, term228501.getClass(), "lock", null);
        setField(term228500, term228500.getClass(), "out", term228501);
        setField(term228500, term228500.getClass(), "stack", null);
        setIntField(term228500, term228500.getClass(), "stackSize", 0);
        setField(term228500, term228500.getClass(), "indent", null);
        setField(term228500, term228500.getClass(), "separator", null);
        setBooleanField(term228500, term228500.getClass(), "lenient", false);
        setBooleanField(term228500, term228500.getClass(), "htmlSafe", false);
        setField(term228500, term228500.getClass(), "deferredName", null);
        setBooleanField(term228500, term228500.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term228134, args);
        assertTrue(recursiveEquals(term228134, term228500));
    }

};


