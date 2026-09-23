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

public class JsonWriter_writeDeferredName_2035940590127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36773;
     Object term36969;

    public JsonWriter_writeDeferredName_2035940590127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36773 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term36773, term36773.getClass(), "deferredName", null);
        term36969 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term36969, term36969.getClass(), "out", null);
        setField(term36969, term36969.getClass(), "stack", null);
        setIntField(term36969, term36969.getClass(), "stackSize", 0);
        setField(term36969, term36969.getClass(), "indent", null);
        setField(term36969, term36969.getClass(), "separator", null);
        setBooleanField(term36969, term36969.getClass(), "lenient", false);
        setBooleanField(term36969, term36969.getClass(), "htmlSafe", false);
        setField(term36969, term36969.getClass(), "deferredName", null);
        setBooleanField(term36969, term36969.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "writeDeferredName", argTypes, term36773, args);
        assertTrue(recursiveEquals(term36773, term36969));
    }

};


