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

public class JsonWriter_string_294626227538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1414688;
     Object term1433755;

    public JsonWriter_string_294626227538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1414688 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1414726 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1414688, term1414688.getClass(), "htmlSafe", true);
        setField(term1414688, term1414688.getClass(), "out", term1414726);
        term1433755 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1433756 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1433756, term1433756.getClass(), "closed", false);
        setField(term1433756, term1433756.getClass(), "writeBuffer", null);
        setField(term1433756, term1433756.getClass(), "lock", null);
        setField(term1433755, term1433755.getClass(), "out", term1433756);
        setField(term1433755, term1433755.getClass(), "stack", null);
        setIntField(term1433755, term1433755.getClass(), "stackSize", 0);
        setField(term1433755, term1433755.getClass(), "indent", null);
        setField(term1433755, term1433755.getClass(), "separator", null);
        setBooleanField(term1433755, term1433755.getClass(), "lenient", false);
        setBooleanField(term1433755, term1433755.getClass(), "htmlSafe", true);
        setField(term1433755, term1433755.getClass(), "deferredName", null);
        setBooleanField(term1433755, term1433755.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0001\u0001\u0002@\u0002\u0001\u0002\u0001\u0002\u0002\u0004\u0010\u0002\u0002\u0002\u0002\u0004\u0002\u0010@\b\u0002\u0001\u0004\u0002\u0001\u0004 \u0002\u0004@\u0004\b\u0004\u0002 @\u0004\u0002\u0002\b\u0002\u0001@\b\b\b\b\b\b\b\u0010     @\u0010\u0010\u0001\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010  \u0001   \u0004\u0004\u0010\u0001@\u0002\u0004\u0004\u0001\u0010@@\u0001@\u0004@\u0010                                                                                                                                               ";
        callMethod(klass, "string", argTypes, term1414688, args);
        assertTrue(recursiveEquals(term1414688, term1433755));
    }

};


