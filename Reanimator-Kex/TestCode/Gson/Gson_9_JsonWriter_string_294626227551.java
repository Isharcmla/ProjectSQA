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

public class JsonWriter_string_294626227551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2204363;
     Object term2212146;

    public JsonWriter_string_294626227551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2204363 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2204401 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2204363, term2204363.getClass(), "htmlSafe", true);
        setField(term2204363, term2204363.getClass(), "out", term2204401);
        term2212146 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2212147 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2212147, term2212147.getClass(), "closed", false);
        setField(term2212147, term2212147.getClass(), "writeBuffer", null);
        setField(term2212147, term2212147.getClass(), "lock", null);
        setField(term2212146, term2212146.getClass(), "out", term2212147);
        setField(term2212146, term2212146.getClass(), "stack", null);
        setIntField(term2212146, term2212146.getClass(), "stackSize", 0);
        setField(term2212146, term2212146.getClass(), "indent", null);
        setField(term2212146, term2212146.getClass(), "separator", null);
        setBooleanField(term2212146, term2212146.getClass(), "lenient", false);
        setBooleanField(term2212146, term2212146.getClass(), "htmlSafe", true);
        setField(term2212146, term2212146.getClass(), "deferredName", null);
        setBooleanField(term2212146, term2212146.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
        callMethod(klass, "string", argTypes, term2204363, args);
        assertTrue(recursiveEquals(term2204363, term2212146));
    }

};


