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

public class JsonWriter_string_294626227255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111162;
     Object term111251;

    public JsonWriter_string_294626227255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111162 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term111200 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term111162, term111162.getClass(), "htmlSafe", true);
        setField(term111162, term111162.getClass(), "out", term111200);
        term111251 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term111252 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term111252, term111252.getClass(), "closed", false);
        setField(term111252, term111252.getClass(), "writeBuffer", null);
        setField(term111252, term111252.getClass(), "lock", null);
        setField(term111251, term111251.getClass(), "out", term111252);
        setField(term111251, term111251.getClass(), "stack", null);
        setIntField(term111251, term111251.getClass(), "stackSize", 0);
        setField(term111251, term111251.getClass(), "indent", null);
        setField(term111251, term111251.getClass(), "separator", null);
        setBooleanField(term111251, term111251.getClass(), "lenient", false);
        setBooleanField(term111251, term111251.getClass(), "htmlSafe", true);
        setField(term111251, term111251.getClass(), "deferredName", null);
        setBooleanField(term111251, term111251.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "string", argTypes, term111162, args);
        assertTrue(recursiveEquals(term111162, term111251));
    }

};


