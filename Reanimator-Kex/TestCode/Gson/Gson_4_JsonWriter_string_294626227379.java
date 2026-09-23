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

public class JsonWriter_string_294626227379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260547;
     Object term425020;

    public JsonWriter_string_294626227379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260547 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term260585 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term260547, term260547.getClass(), "htmlSafe", true);
        setField(term260547, term260547.getClass(), "out", term260585);
        term425020 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term425021 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term425021, term425021.getClass(), "closed", false);
        setField(term425021, term425021.getClass(), "writeBuffer", null);
        setField(term425021, term425021.getClass(), "lock", null);
        setField(term425020, term425020.getClass(), "out", term425021);
        setField(term425020, term425020.getClass(), "stack", null);
        setIntField(term425020, term425020.getClass(), "stackSize", 0);
        setField(term425020, term425020.getClass(), "indent", null);
        setField(term425020, term425020.getClass(), "separator", null);
        setBooleanField(term425020, term425020.getClass(), "lenient", false);
        setBooleanField(term425020, term425020.getClass(), "htmlSafe", true);
        setField(term425020, term425020.getClass(), "deferredName", null);
        setBooleanField(term425020, term425020.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                             ";
        callMethod(klass, "string", argTypes, term260547, args);
        assertTrue(recursiveEquals(term260547, term425020));
    }

};


