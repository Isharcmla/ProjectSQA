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

public class JsonWriter_string_294626227526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1241822;
     Object term1272598;

    public JsonWriter_string_294626227526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1241822 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1241860 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1241822, term1241822.getClass(), "htmlSafe", true);
        setField(term1241822, term1241822.getClass(), "out", term1241860);
        term1272598 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1272599 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1272599, term1272599.getClass(), "closed", false);
        setField(term1272599, term1272599.getClass(), "writeBuffer", null);
        setField(term1272599, term1272599.getClass(), "lock", null);
        setField(term1272598, term1272598.getClass(), "out", term1272599);
        setField(term1272598, term1272598.getClass(), "stack", null);
        setIntField(term1272598, term1272598.getClass(), "stackSize", 0);
        setField(term1272598, term1272598.getClass(), "indent", null);
        setField(term1272598, term1272598.getClass(), "separator", null);
        setBooleanField(term1272598, term1272598.getClass(), "lenient", false);
        setBooleanField(term1272598, term1272598.getClass(), "htmlSafe", true);
        setField(term1272598, term1272598.getClass(), "deferredName", null);
        setBooleanField(term1272598, term1272598.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\b\u0001   \u0001@\u0001 \u0001\b!  \u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ";
        callMethod(klass, "string", argTypes, term1241822, args);
        assertTrue(recursiveEquals(term1241822, term1272598));
    }

};


