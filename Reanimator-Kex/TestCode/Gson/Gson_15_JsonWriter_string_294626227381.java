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

public class JsonWriter_string_294626227381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193394;
     Object term195252;

    public JsonWriter_string_294626227381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193394 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term193432 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term193394, term193394.getClass(), "htmlSafe", true);
        setField(term193394, term193394.getClass(), "out", term193432);
        term195252 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term195253 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term195253, term195253.getClass(), "closed", false);
        setField(term195253, term195253.getClass(), "writeBuffer", null);
        setField(term195253, term195253.getClass(), "lock", null);
        setField(term195252, term195252.getClass(), "out", term195253);
        setField(term195252, term195252.getClass(), "stack", null);
        setIntField(term195252, term195252.getClass(), "stackSize", 0);
        setField(term195252, term195252.getClass(), "indent", null);
        setField(term195252, term195252.getClass(), "separator", null);
        setBooleanField(term195252, term195252.getClass(), "lenient", false);
        setBooleanField(term195252, term195252.getClass(), "htmlSafe", true);
        setField(term195252, term195252.getClass(), "deferredName", null);
        setBooleanField(term195252, term195252.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "string", argTypes, term193394, args);
        assertTrue(recursiveEquals(term193394, term195252));
    }

};


