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

public class JsonWriter_string_294626227548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1706388;
     Object term1965928;

    public JsonWriter_string_294626227548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1706388 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1706426 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1706388, term1706388.getClass(), "htmlSafe", true);
        setField(term1706388, term1706388.getClass(), "out", term1706426);
        term1965928 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1965929 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1965929, term1965929.getClass(), "closed", false);
        setField(term1965929, term1965929.getClass(), "writeBuffer", null);
        setField(term1965929, term1965929.getClass(), "lock", null);
        setField(term1965928, term1965928.getClass(), "out", term1965929);
        setField(term1965928, term1965928.getClass(), "stack", null);
        setIntField(term1965928, term1965928.getClass(), "stackSize", 0);
        setField(term1965928, term1965928.getClass(), "indent", null);
        setField(term1965928, term1965928.getClass(), "separator", null);
        setBooleanField(term1965928, term1965928.getClass(), "lenient", false);
        setBooleanField(term1965928, term1965928.getClass(), "htmlSafe", true);
        setField(term1965928, term1965928.getClass(), "deferredName", null);
        setBooleanField(term1965928, term1965928.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0002\u0001@\u0001@\u0002\u0004\b @\b                                          ";
        callMethod(klass, "string", argTypes, term1706388, args);
        assertTrue(recursiveEquals(term1706388, term1965928));
    }

};


