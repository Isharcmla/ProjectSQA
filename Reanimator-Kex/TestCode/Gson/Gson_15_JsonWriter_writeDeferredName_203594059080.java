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

public class JsonWriter_writeDeferredName_203594059080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17471;
     Object term19926;

    public JsonWriter_writeDeferredName_203594059080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17471 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term17471, term17471.getClass(), "deferredName", null);
        term19926 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term19926, term19926.getClass(), "out", null);
        setField(term19926, term19926.getClass(), "stack", null);
        setIntField(term19926, term19926.getClass(), "stackSize", 0);
        setField(term19926, term19926.getClass(), "indent", null);
        setField(term19926, term19926.getClass(), "separator", null);
        setBooleanField(term19926, term19926.getClass(), "lenient", false);
        setBooleanField(term19926, term19926.getClass(), "htmlSafe", false);
        setField(term19926, term19926.getClass(), "deferredName", null);
        setBooleanField(term19926, term19926.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "writeDeferredName", argTypes, term17471, args);
        assertTrue(recursiveEquals(term17471, term19926));
    }

};


