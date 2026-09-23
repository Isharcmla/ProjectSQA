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

public class JsonWriter_string_294626227544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1518263;
     Object term1708566;

    public JsonWriter_string_294626227544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1518263 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1518301 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1518263, term1518263.getClass(), "htmlSafe", true);
        setField(term1518263, term1518263.getClass(), "out", term1518301);
        term1708566 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1708567 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1708567, term1708567.getClass(), "closed", false);
        setField(term1708567, term1708567.getClass(), "writeBuffer", null);
        setField(term1708567, term1708567.getClass(), "lock", null);
        setField(term1708566, term1708566.getClass(), "out", term1708567);
        setField(term1708566, term1708566.getClass(), "stack", null);
        setIntField(term1708566, term1708566.getClass(), "stackSize", 0);
        setField(term1708566, term1708566.getClass(), "indent", null);
        setField(term1708566, term1708566.getClass(), "separator", null);
        setBooleanField(term1708566, term1708566.getClass(), "lenient", false);
        setBooleanField(term1708566, term1708566.getClass(), "htmlSafe", true);
        setField(term1708566, term1708566.getClass(), "deferredName", null);
        setBooleanField(term1708566, term1708566.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
        callMethod(klass, "string", argTypes, term1518263, args);
        assertTrue(recursiveEquals(term1518263, term1708566));
    }

};


