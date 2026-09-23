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

public class JsonWriter_string_294626227539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1430895;
     Object term1434725;

    public JsonWriter_string_294626227539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1430895 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1430933 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1430895, term1430895.getClass(), "htmlSafe", true);
        setField(term1430895, term1430895.getClass(), "out", term1430933);
        term1434725 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1434726 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1434726, term1434726.getClass(), "closed", false);
        setField(term1434726, term1434726.getClass(), "writeBuffer", null);
        setField(term1434726, term1434726.getClass(), "lock", null);
        setField(term1434725, term1434725.getClass(), "out", term1434726);
        setField(term1434725, term1434725.getClass(), "stack", null);
        setIntField(term1434725, term1434725.getClass(), "stackSize", 0);
        setField(term1434725, term1434725.getClass(), "indent", null);
        setField(term1434725, term1434725.getClass(), "separator", null);
        setBooleanField(term1434725, term1434725.getClass(), "lenient", false);
        setBooleanField(term1434725, term1434725.getClass(), "htmlSafe", true);
        setField(term1434725, term1434725.getClass(), "deferredName", null);
        setBooleanField(term1434725, term1434725.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0004@@\b\u0004\u0010\u0001\u0002@\u0001  \u0004@\u0001\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002 \b\u0002\u0002\u0001\u0010\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004 \u0004\b\u0002\u0010\u0002\u0001\u0001\u0002\u0001\u0001\u0002\u0001\u0001\u0004\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\b           ";
        callMethod(klass, "string", argTypes, term1430895, args);
        assertTrue(recursiveEquals(term1430895, term1434725));
    }

};


