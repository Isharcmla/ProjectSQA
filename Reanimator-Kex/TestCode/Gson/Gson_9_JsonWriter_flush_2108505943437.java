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

public class JsonWriter_flush_2108505943437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264399;
     Object term266258;

    public JsonWriter_flush_2108505943437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264399 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term264443 = newInstance(Class.forName("java.io.PipedWriter"));
        setIntField(term264399, term264399.getClass(), "stackSize", -1);
        setField(term264399, term264399.getClass(), "out", term264443);
        term266258 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term266259 = newInstance(Class.forName("java.io.PipedWriter"));
        setField(term266259, term266259.getClass(), "sink", null);
        setBooleanField(term266259, term266259.getClass(), "closed", false);
        setField(term266259, term266259.getClass(), "writeBuffer", null);
        setField(term266259, term266259.getClass(), "lock", null);
        setField(term266258, term266258.getClass(), "out", term266259);
        setField(term266258, term266258.getClass(), "stack", null);
        setIntField(term266258, term266258.getClass(), "stackSize", -1);
        setField(term266258, term266258.getClass(), "indent", null);
        setField(term266258, term266258.getClass(), "separator", null);
        setBooleanField(term266258, term266258.getClass(), "lenient", false);
        setBooleanField(term266258, term266258.getClass(), "htmlSafe", false);
        setField(term266258, term266258.getClass(), "deferredName", null);
        setBooleanField(term266258, term266258.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term264399, args);
        assertTrue(recursiveEquals(term264399, term266258));
    }

};


