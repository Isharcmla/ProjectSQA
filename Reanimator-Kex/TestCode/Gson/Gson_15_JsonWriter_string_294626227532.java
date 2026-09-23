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

public class JsonWriter_string_294626227532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1295969;
     Object term1363197;

    public JsonWriter_string_294626227532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1295969 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1296007 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1295969, term1295969.getClass(), "htmlSafe", true);
        setField(term1295969, term1295969.getClass(), "out", term1296007);
        term1363197 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1363198 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1363198, term1363198.getClass(), "closed", false);
        setField(term1363198, term1363198.getClass(), "writeBuffer", null);
        setField(term1363198, term1363198.getClass(), "lock", null);
        setField(term1363197, term1363197.getClass(), "out", term1363198);
        setField(term1363197, term1363197.getClass(), "stack", null);
        setIntField(term1363197, term1363197.getClass(), "stackSize", 0);
        setField(term1363197, term1363197.getClass(), "indent", null);
        setField(term1363197, term1363197.getClass(), "separator", null);
        setBooleanField(term1363197, term1363197.getClass(), "lenient", false);
        setBooleanField(term1363197, term1363197.getClass(), "htmlSafe", true);
        setField(term1363197, term1363197.getClass(), "deferredName", null);
        setBooleanField(term1363197, term1363197.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                ";
        callMethod(klass, "string", argTypes, term1295969, args);
        assertTrue(recursiveEquals(term1295969, term1363197));
    }

};


