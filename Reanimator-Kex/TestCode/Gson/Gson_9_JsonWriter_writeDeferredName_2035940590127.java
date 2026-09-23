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
     Object term33273;
     Object term33602;

    public JsonWriter_writeDeferredName_2035940590127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33273 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term33273, term33273.getClass(), "deferredName", null);
        term33602 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term33602, term33602.getClass(), "out", null);
        setField(term33602, term33602.getClass(), "stack", null);
        setIntField(term33602, term33602.getClass(), "stackSize", 0);
        setField(term33602, term33602.getClass(), "indent", null);
        setField(term33602, term33602.getClass(), "separator", null);
        setBooleanField(term33602, term33602.getClass(), "lenient", false);
        setBooleanField(term33602, term33602.getClass(), "htmlSafe", false);
        setField(term33602, term33602.getClass(), "deferredName", null);
        setBooleanField(term33602, term33602.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "writeDeferredName", argTypes, term33273, args);
        assertTrue(recursiveEquals(term33273, term33602));
    }

};


