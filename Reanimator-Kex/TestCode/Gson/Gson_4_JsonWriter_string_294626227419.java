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

public class JsonWriter_string_294626227419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2348267;
     Object term2960688;

    public JsonWriter_string_294626227419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2348267 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2348305 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2348267, term2348267.getClass(), "htmlSafe", true);
        setField(term2348267, term2348267.getClass(), "out", term2348305);
        term2960688 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2960689 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2960689, term2960689.getClass(), "closed", false);
        setField(term2960689, term2960689.getClass(), "writeBuffer", null);
        setField(term2960689, term2960689.getClass(), "lock", null);
        setField(term2960688, term2960688.getClass(), "out", term2960689);
        setField(term2960688, term2960688.getClass(), "stack", null);
        setIntField(term2960688, term2960688.getClass(), "stackSize", 0);
        setField(term2960688, term2960688.getClass(), "indent", null);
        setField(term2960688, term2960688.getClass(), "separator", null);
        setBooleanField(term2960688, term2960688.getClass(), "lenient", false);
        setBooleanField(term2960688, term2960688.getClass(), "htmlSafe", true);
        setField(term2960688, term2960688.getClass(), "deferredName", null);
        setBooleanField(term2960688, term2960688.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0002\u0004\u0002\u0002\u0002\u0001 \u0004\u0002\u0002\b\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0001\b\u0002\u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
        callMethod(klass, "string", argTypes, term2348267, args);
        assertTrue(recursiveEquals(term2348267, term2960688));
    }

};


