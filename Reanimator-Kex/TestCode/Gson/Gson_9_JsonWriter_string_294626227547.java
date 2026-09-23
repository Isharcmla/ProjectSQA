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

public class JsonWriter_string_294626227547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1704988;
     Object term1965297;

    public JsonWriter_string_294626227547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1704988 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1705026 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1704988, term1704988.getClass(), "htmlSafe", true);
        setField(term1704988, term1704988.getClass(), "out", term1705026);
        term1965297 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1965298 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1965298, term1965298.getClass(), "closed", false);
        setField(term1965298, term1965298.getClass(), "writeBuffer", null);
        setField(term1965298, term1965298.getClass(), "lock", null);
        setField(term1965297, term1965297.getClass(), "out", term1965298);
        setField(term1965297, term1965297.getClass(), "stack", null);
        setIntField(term1965297, term1965297.getClass(), "stackSize", 0);
        setField(term1965297, term1965297.getClass(), "indent", null);
        setField(term1965297, term1965297.getClass(), "separator", null);
        setBooleanField(term1965297, term1965297.getClass(), "lenient", false);
        setBooleanField(term1965297, term1965297.getClass(), "htmlSafe", true);
        setField(term1965297, term1965297.getClass(), "deferredName", null);
        setBooleanField(term1965297, term1965297.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0010@ \u0010\u0001\u0010\u0004 \u0010\u0002 \u0001\u0002\u0010\u0001\u0010\u0010\u0002\u0001 \b@ \u0002@\u0004\u0004\u0004\u0002@\u0001\u0010\u0010\u0002 \u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001@\u0002\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\u0010                                                                                                                             ";
        callMethod(klass, "string", argTypes, term1704988, args);
        assertTrue(recursiveEquals(term1704988, term1965297));
    }

};


